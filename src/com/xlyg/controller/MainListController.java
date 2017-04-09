package com.xlyg.controller;

import java.util.Date;
import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.xlyg.model.Text;
import com.xlyg.service.MainListService;


@Controller
@RequestMapping("/mainlist")
public class MainListController {
	@Resource(name="mainListService")
	private MainListService service;
	/**
	 * 主页面文章列表展示
	 * @return
	 */
	@RequestMapping("/textlist")
	public ModelAndView findTextList(){
		List<Text> list=service.findTextList();
		ModelAndView mav=new ModelAndView("/jsp/mainlist.jsp");
		mav.addObject("list", list);
		return mav;
		
	}
	/**
	 * 根据id查询文章详情
	 * @param id
	 * @return
	 */
	@RequestMapping("/edite")
	public ModelAndView findText(Integer id){
		Text text=service.findText(id);
		ModelAndView mav=new ModelAndView("/jsp/textdetail.jsp");
		mav.addObject("text", text);
		return mav;
	}
	/**
	 * 去往编辑页面
	 * @param id
	 * @return
	 */
	@RequestMapping("/tocreateorupdate")
	public ModelAndView toedite(Integer id){
		ModelAndView mav=new ModelAndView("/jsp/createorupdate.jsp");
		if(id!=null){
			Text text=service.findText(id);
			mav.addObject("text", text);
			mav.addObject("id", id);
		}else{
			mav.addObject("id", id);
			}
		
		return mav;
	}
	/**
	 * 新建或修改
	 * @param id
	 * @param text
	 * @return
	 */
	@RequestMapping("/createorupdate")
	public ModelAndView edite(Integer id,Text text){
		ModelAndView mav=new ModelAndView("/jsp/createorupdate.jsp");
		if(id!=null){
			service.updateText(text);
			mav.addObject("text", text);
			mav.addObject("id", id);
			mav.addObject("message", "修改成功");
		}else{
			text.setCreatorupdate(new Date());
			service.createText(text);
			mav.addObject("text", text);
			mav.addObject("id", id);
			mav.addObject("message", "添加成功");
			}
		
		return mav;
	}

}
