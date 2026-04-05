//package com.example.demo.service;
//
//import java.util.List;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.http.ResponseEntity;
//import org.springframework.mail.SimpleMailMessage;
//import org.springframework.stereotype.Service;
//
//import com.example.demo.config.ConfirmationToken;
//import com.example.demo.entity.Userlogin;
//import com.example.demo.repo.ConfirmationTokenRepository;
//import com.example.demo.repo.Userloginrepo;
//@Service
//public class UserServiceImpl implements UserService {
//
//    @Autowired
//    private Userloginrepo userRepository;
//
//    @Autowired
//    ConfirmationTokenRepository confirmationTokenRepository;
//
//    @Autowired
//    EmailService emailService;
//    public List<Userlogin> findbylogin(String username, String password)  {
//    	
//		return  userRepository.findByLogin(username, password);
//		
//		
//	}
//    @Override
//    public ResponseEntity<?> saveUser(Userlogin user) {
//
//        if (userRepository.existsByEmail(user.getEmail())) {
//            return ResponseEntity.badRequest().body("Error: Email is already in use!");
//        }
//
//        userRepository.save(user);
//
//        ConfirmationToken confirmationToken = new ConfirmationToken(user);
//
//        confirmationTokenRepository.save(confirmationToken);
//
//        SimpleMailMessage mailMessage = new SimpleMailMessage();
//        mailMessage.setTo(user.getEmail());
//        mailMessage.setSubject("Complete Registration!");
//        mailMessage.setText("To confirm your account, please click here : "
//                +"http://localhost:8085/confirm-account?token="+confirmationToken.getConfirmationToken());
//        emailService.sendEmail(mailMessage);
//
//        System.out.println("Confirmation Token: " + confirmationToken.getConfirmationToken());
//
//        return ResponseEntity.ok("Verify email by the link sent on your email address");
//    }
//
//    @Override
//    public ResponseEntity<?> confirmEmail(String confirmationToken) {
//        ConfirmationToken token = confirmationTokenRepository.findByConfirmationToken(confirmationToken);
//
//        if(token != null)
//        {
//            Userlogin user = userRepository.findByEmailIgnoreCase(token.getUserEntity().getEmail());
//            //user.setEnabled(true);
//            userRepository.save(user);
//            return ResponseEntity.ok("Email verified successfully!");
//        }
//        return ResponseEntity.badRequest().body("Error: Couldn't verify email");
//    }
//}
