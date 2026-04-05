package com.example.demo.service;



import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.security.core.userdetails.User;
//import org.springframework.security.core.userdetails.UserDetails;
//import org.springframework.security.core.userdetails.UserDetailsService;
//import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.example.demo.entity.Fooddetails;
import com.example.demo.entity.Foodentity;
import com.example.demo.entity.Foodpost;
import com.example.demo.entity.Payment;
import com.example.demo.entity.Userlogin;
import com.example.demo.repo.Foodpostrepo;
import com.example.demo.repo.Foodrepo;
import com.example.demo.repo.Payrepo;
import com.example.demo.repo.Userloginrepo;
import com.example.demo.repo.Vegrepo;



@Service
public class Foodservice  {
	
	@Autowired
	Foodrepo fdrepo;
	@Autowired
	Foodpostrepo fdprepo;
	@Autowired
	Vegrepo vegrepo;
	@Autowired
	Payrepo prepo;
	@Autowired
Userloginrepo urepo;
	
	public Foodentity Saverecord(Foodentity e)
	{
		return fdrepo.save(e);
		
	}
	public Userlogin signup(Userlogin e)
	{
		return urepo.save(e);
		
	}
	public List<Userlogin> findbylogin(String username, String password)  {
		
		return  urepo.findByUsernameAndPassword(username, password);
		
		
	}
	public Payment payrecord(Payment e)
	{
		return prepo.save(e);
		
	}
	public Foodpost Savefoode(Foodpost e)
	{
		return fdprepo.save(e);
		
	}
	public Foodpost Saveimage(Foodpost image)
	{
		return fdprepo.save(image);
		
	}
//	public List<Foodentity> Findall()
//	{
//		return fdrepo.findAll();
//		
//	}
	public List<Fooddetails> Findalle()
	{
		return vegrepo.findAll();
		
	}
	public   Optional<Payment> showrecord(int id)
	{
		return prepo.findById(id);
		
	}

	public Optional<Fooddetails> findById(int id) {
        return vegrepo.findById(id);
    }

   
	public List<Fooddetails> Findveg()
	{
		return vegrepo.findAll();
		
	}
	
//	public Fooddetails postimage(Fooddetails fd)
//	{
//		return vegrepo.save(fd);
//	}
//    public List<Fooddetails> viewAll()
//    {
//    	 return (List<Fooddetails>) vegrepo.findAll();
//    }
//    public Fooddetails viewById(int id)
//    {
//    	 return vegrepo.findById(id).get();
//    }
    
    
//	public List<Foodpost> findAllImages() {
//        List<Foodpost> foodposts = fdprepo.Findalle();
//        for (Foodpost foodpost : foodposts) {
//            foodpost.setFoodimage(convertByteArrayToImage(foodpost.getFoodimage()));
//        }
//        return foodposts;
//    }
//
//    private BufferedImage convertByteArrayToImage(byte[] bytes) {
//        ByteArrayInputStream inputStream = new ByteArrayInputStream(bytes);
//        try {
//            return ImageIO.read(inputStream);
//        } catch (IOException e) {
//            e.printStackTrace();
//            return null;
//        }
//    }
//	public Userlogin Findbyuserid(int  id)
//	{
//		return urepo.findById(id).get();
//		/FoodApp/src/main/java/com/example/demo/entity/Userlogin.java
//		
//		
//	}

//	public Userlogin findbylogin(String username, String password) throws UsernameNotFoundException {
//        Userlogin user = urepo.findByLogin(username, password);
//        if (user == null) {
//            throw new UsernameNotFoundException("User not found");
//        }
//        return new Userlogin();
//    }
//	public Foodentity Findbyid(int  id)
//	{
//		return fdrepo.findById(id).get();
//		
//		
//		
//	}
	public List<Fooddetails> findbycategory(String category)
	{
		return  vegrepo.findByCategory(category);
		
	}
public List<Fooddetails> findbyresname(String resname)
	{
		return  vegrepo.findByResname(resname);
		
	}

public List<Fooddetails> findbyfoodname(String foodname)
{
	return  vegrepo.findByFoodname(foodname);
	
}
public List<Payment> findbyname(String name)
{
	return  prepo.findByName(name);
	
}
//@Override
//public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
//	// TODO Auto-generated method stub
//	Userlogin user = urepo.findByUsername(username);
//    if (user == null) {
//        throw new UsernameNotFoundException("User not found");
//    }
//    return (UserDetails) new User(user.getUsername(), user.getPassword(), new ArrayList<>());
//}
}
