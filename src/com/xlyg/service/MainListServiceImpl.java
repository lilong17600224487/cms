package com.xlyg.service;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.xlyg.dao.MainListDao;
import com.xlyg.model.Text;

@Service("mainListService")
public class MainListServiceImpl implements MainListService {
	
	@Resource
	private MainListDao maper;

	@Override
	public List<Text> findTextList() {
		// 查询文章列表
		List<Text> list=maper.findTextList();
		return list;
	}

	@Override
	public Text findText(Integer id) {
		// 点击文章标题查询文章详细内容
		Text text=maper.findText(id);
		return text;
	}

	@Override
	public void createText(Text text) {
		//创建文章
		maper.createText(text);
	}

	@Override
	public void updateText(Text text) {
		//修改文章
		maper.updateText(text);
	}

}
