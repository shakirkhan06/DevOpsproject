package com.niit.controllers;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.niit.dao.CartDao;
import com.niit.dao.ProductsDao;
import com.niit.model.CartModel;
import com.niit.model.ProductsModel;

@Controller
public class cartController 
{
	@Autowired
	ProductsDao pdao;

	@Autowired
	CartDao cdao;

	@RequestMapping("/viewCart")
	public ModelAndView viewCart(){

		ModelAndView mv=new ModelAndView("viewCart");
		List<CartModel> cartList=cdao.getAll();

		mv.addObject("cartlist", cartList);
		return mv;
	}
	@RequestMapping(value="/addCart", method=RequestMethod.POST)
	public ModelAndView addCart(HttpServletRequest request){
		String id=request.getParameter("id");
		int q=Integer.parseInt(request.getParameter("q"));

		ProductsModel p=pdao.findById(id);
		int price=p.getProdPrice();
		CartModel c=new CartModel();
		c.setPrices(price);
		c.setQuantity(q);
		//c.setC_status(0);
		c.setProdId(p);
		List<CartModel> list=cdao.checkExistance(id);
		int count=list.size();
		System.out.println("No of times: "+count);
		if(count==0)
		{
			cdao.save(c);
		}
		else
		{
			CartModel cart=cdao.findById(list.get(0).getCartid());
			int ex=cart.getQuantity();
			System.out.println("-----------Existance Count ="+ex+"\n current Count = "+q+"------------\n---Total =-"+(ex+q));
			int tot=ex+q;
			cart.setQuantity(tot);
			cdao.update(cart);
		}

		System.out.println(c);

		ModelAndView mv=new ModelAndView("viewCart");
		List<CartModel> cartList=cdao.getAll();

		mv.addObject("cartlist", cartList);
		return mv;

	}
	@RequestMapping("/cart_delete")
	public ModelAndView editCart(HttpServletRequest request)
	{
		int cid=Integer.valueOf(request.getParameter("id"));
		CartModel c=cdao.findById(cid);
		cdao.deleteById(c);

		ModelAndView mv=new ModelAndView("viewCart");
		List<CartModel> cartList=cdao.getAll();

		mv.addObject("cartlist", cartList);
		return mv;
	}


}