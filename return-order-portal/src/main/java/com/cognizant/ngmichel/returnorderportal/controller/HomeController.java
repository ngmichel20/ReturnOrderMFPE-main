package com.cognizant.ngmichel.returnorderportal.controller;

import com.cognizant.ngmichel.returnorderportal.dto.LoginUser;
import com.cognizant.ngmichel.returnorderportal.dto.ProcessRequest;
import com.cognizant.ngmichel.returnorderportal.dto.ProcessResponse;
import com.cognizant.ngmichel.returnorderportal.model.UserApp;
//import com.cognizant.ngmichel.returnorderportal.security.SecurityService;
import com.cognizant.ngmichel.returnorderportal.service.ComponentProcessingProxy;
//import com.cognizant.ngmichel.returnorderportal.service.UserService;
import com.cognizant.ngmichel.returnorderportal.service.ComponentProcessingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.propertyeditors.CustomDateEditor;
//import org.springframework.security.authentication.BadCredentialsException;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import javax.annotation.Resource;
import javax.validation.Valid;
import java.security.Principal;
import java.text.SimpleDateFormat;
import java.time.LocalDate;

@Controller
public class HomeController {

//    @Autowired
//    private UserService userService;

//    @Autowired
//    private SecurityService securityService;

    @Autowired
    private ComponentProcessingService componentProcessingService;


    @InitBinder
    protected void initBinder(WebDataBinder binder) {
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
        binder.registerCustomEditor(LocalDate.class, new CustomDateEditor(dateFormat, false));
    }

//    @ModelAttribute("bearerToken")
//    public String getBearerToken(@ModelAttribute("user") UserApp userApp, Principal principal) {
//        LoginUser login = new LoginUser();
//        login.setUsername(userApp.getEmail());
//        login.setPassword(userApp.getPassword());
//        System.out.println(userApp.getEmail());
//        System.out.println(userApp.getPassword());
//        String token = this.securityService.getToken(login);
//        if (token == null) {
//            throw new BadCredentialsException("No user registered as " + login.getUsername());
//        }
//        return "Bearer " + token;
//    }

    @GetMapping("/")
    public String homeAction() {
        return "home";
    }

    @GetMapping("/getProcessDetail")
    public String processResponse(ModelMap modelMap, @RequestBody ProcessRequest processRequest, String bearerToken){
        processRequest.setComponentName("eeee");
        processRequest.setComponentType("repair");
        processRequest.setContactNumber(01234l);
        processRequest.setId(33);
        processRequest.setQuantity(6);
        processRequest.setUsername("Michel");
        ProcessResponse processResponse = this.componentProcessingService.getProcessDetail(processRequest, bearerToken);
        if(processResponse == null) {
            System.out.println("nullll");
        }
        System.out.println(processResponse.toString());
        modelMap.addAttribute("processResponse", processResponse);
        return "";
    }

    @GetMapping("/returnOrder")
    public String returnCreateOrder() {
        return "return-order";
    }

//    @PostMapping("/returnOrder")
//    public String postCreateOrder(ModelMap model, @Valid ProcessRequest processRequest, BindingResult result,
//                                  RedirectAttributes attributes, @ModelAttribute("bearerToken") String bearerToken){
//
//
//        return "return-order";
//    }


}
