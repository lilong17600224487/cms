package com.xlyg.service;

import java.util.List;

import com.xlyg.model.Text;

public interface MainListService {
	/**
	 * 查询全部文章的列表
	 * @return
	 */
	public List<Text> findTextList();
	/**
	 * 根据传入的文章id查询文章
	 * @param id
	 * @return
	 */
	public Text findText(Integer id);
	/**
	 * 修改文章
	 * @param text
	 */
	public void updateText(Text text);
	/**
	 * 添加文章
	 * @param text
	 */
	public void createText(Text text);

}
