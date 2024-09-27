package com.newcrud.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;
@Controller
public class UserController {
	@Autowired
	UserDao dao;
	
	@RequestMapping("index")
	public String index()
	{
		return "index.jsp";
	}
	@RequestMapping("addUser")
	public String addmodel(Model model)
	{
		dao.save(model);
		return "index.jsp";
	}
	
	@RequestMapping("getUser")
	public ModelAndView getmodel(@RequestParam String Username)
	{
		ModelAndView mav=new ModelAndView("showuser.jsp");
		
		Model model=dao.findById(Username).orElse(new Model());
		mav.addObject(model);
		return mav;
	}
	
	@RequestMapping("deleteUser")
	public ModelAndView deletemodel(@RequestParam String Username)
	{
		ModelAndView mav=new ModelAndView("deleteuser.jsp");
		
		Model model=dao.findById(Username).orElse(new Model());
		dao.deleteById(Username);
		mav.addObject(model);
		return mav;
	}
	
	@RequestMapping("updateUser")
	public ModelAndView updatemodel(Model model)
	{
		ModelAndView mav=new ModelAndView("updateUser.jsp");
		model=dao.findById(model.getUsername()).orElse(new Model());
		dao.deleteById(model.getUsername());
		mav.addObject(model);
		return mav;
	}
}
