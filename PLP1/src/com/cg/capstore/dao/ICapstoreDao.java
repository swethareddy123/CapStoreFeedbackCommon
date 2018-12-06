package com.cg.capstore.dao;

import java.util.List;

import com.cg.capstore.dto.FeedbackCommon;

public interface ICapstoreDao {

	public List<FeedbackCommon> getAllFeedNRes();

	
	
	
	public FeedbackCommon search(int query_id);
	public void update(FeedbackCommon query);




	public int save(FeedbackCommon fc);
	

}
