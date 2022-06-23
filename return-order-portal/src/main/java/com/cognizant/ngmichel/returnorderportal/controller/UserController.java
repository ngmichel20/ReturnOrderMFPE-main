//package com.cognizant.ngmichel.returnorderportal.controller;
//
//import com.cognizant.ngmichel.returnorderportal.dto.LoginUser;
//import com.cognizant.ngmichel.returnorderportal.dto.User;
//import com.cognizant.ngmichel.returnorderportal.dto.UserCreationStatus;
//import com.cognizant.ngmichel.returnorderportal.model.UserApp;
////import com.cognizant.ngmichel.returnorderportal.security.SecurityService;
////import com.cognizant.ngmichel.returnorderportal.service.UserService;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.beans.propertyeditors.CustomDateEditor;
////import org.springframework.security.authentication.BadCredentialsException;
//import org.springframework.stereotype.Controller;
//import org.springframework.ui.ModelMap;
//import org.springframework.validation.BindingResult;
//import org.springframework.web.bind.WebDataBinder;
//import org.springframework.web.bind.annotation.*;
//import org.springframework.web.servlet.mvc.support.RedirectAttributes;
//
//import javax.validation.Valid;
//import java.security.Principal;
//import java.text.SimpleDateFormat;
//import java.util.Date;
//import java.util.List;
//
//@Controller
//@SessionAttributes({"user", "bearerToken" })
//public class UserController {
////    @Autowired
////    private UserService userService;
//
////    @Autowired
////    private SecurityService securityService;
//
//    @InitBinder
//    protected void initBinder(WebDataBinder binder) {
//        SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
//        binder.registerCustomEditor(Date.class, new CustomDateEditor(dateFormat, false));
//    }
//
//    @GetMapping("/")
//    public String homeAction() {
//        return "home";
//    }
//
//    @ModelAttribute("user")
//    public UserApp getUser(Principal userPrincipal) {
//        return this.userService.getUser(userPrincipal.getName());
//    }
//
////    @ModelAttribute("bearerToken")
////    public String getBearerToken(@ModelAttribute("user") UserApp user, Principal principal) {
////        LoginUser login = new LoginUser();
////        login.setUsername(user.getEmail());
////        login.setPassword(user.getPassword());
////        String token = this.securityService.getToken(login);
////        if (token == null) {
////            throw new BadCredentialsException("No user registered as " + login.getUsername());
////        }
////        return "Bearer " + token;
////    }
//
//    @GetMapping("/createUser")
//    public String getCreateUserAction(ModelMap model, User user) {
//        return "create-customer";
//    }
//
////    @PostMapping("/createUser")
////    public String postCreateUserAction(ModelMap model, @Valid User user, BindingResult result, RedirectAttributes attributes, @ModelAttribute("bearerToken") String bearerToken) {
////        if (!result.hasErrors()) {
////            UserCreationStatus status = this.userService.createUser(user, bearerToken);
////            if (status.getMessage().equals("ko")) {
////                model.addAttribute("status", status);
////                return "create-user";
////            }
////            attributes.addFlashAttribute("status", status);
////            return "redirect:/getUser?firstName=" + user.getFirstName();
////        }
////        return "create-user";
////    }
//
//    @GetMapping("/getUser")
//    public String getUserAction(ModelMap model, @RequestParam(required = false) String firstName, @ModelAttribute("bearerToken") String bearerToken) {
//        if (firstName != null) {
//            User user = this.userService.getUserDetailsByFirstName(firstName, bearerToken);
//            model.addAttribute("user", user);
//        }
//        return "user-details";
//    }
//
//    @GetMapping("/users")
//    public String getListUser(ModelMap model, @ModelAttribute("bearerToken") String bearerToken) {
//        if (bearerToken.isEmpty())
//            System.out.println("Bearer EMPTY");
//        System.out.println(bearerToken);
//        List<User> users = this.userService.getUsers(bearerToken);
//        model.addAttribute("users", users);
//        return "list-user";
//    }
//}
