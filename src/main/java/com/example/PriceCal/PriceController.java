package com.example.PriceCal;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class PriceController {
@Autowired
PriceDao dao;
	
	public int getItem(String s){
		if(s.equals("milk"))
			return 1;
		else if(s.equals("bread"))
			return 2;
		else
			return 3;
	}
	
	@RequestMapping(value="/data",method=RequestMethod.POST)
	public ModelAndView data(HttpServletRequest request,Model model){
		String s=request.getParameter("item");
		//System.out.println(s);
		int i=getItem(s);
		//System.out.println(i);
		
		
		
		
		Price p=dao.getById(getItem(s));
		System.out.println(p);
		
		
		Double cost=p.getAmount();
		System.out.println(cost);
		
		
		Double total=cost*(Integer.parseInt(request.getParameter("quantity")));
		System.out.println(total);
		Double gst=total*(.18);
		System.out.println(gst);
		
		Double finalp=total+gst;
		
		model.addAttribute("total", total);
		model.addAttribute("gst",gst);
		model.addAttribute("finalp",finalp);
		return new ModelAndView("result");
		
	}
}
