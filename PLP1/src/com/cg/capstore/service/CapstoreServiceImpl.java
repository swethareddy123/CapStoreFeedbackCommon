package com.cg.capstore.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.cg.capstore.dao.ICapstoreDao;
import com.cg.capstore.dto.FeedbackCommon;
@Service("ser")
@Transactional
public class CapstoreServiceImpl implements ICapstoreService {

	@Autowired
	ICapstoreDao dao;

	@Override
	public List<FeedbackCommon> getAllFeedNRes() {
		// TODO Auto-generated method stub
		return dao.getAllFeedNRes();
	}

	
	
	@Override
	public FeedbackCommon search(int query_id) {
		// TODO Auto-generated method stub
		System.out.println("service search");
		return dao.search(query_id);
	}

	@Override
	public void update(FeedbackCommon query) {
		// TODO Auto-generated method stub
		dao.update(query);
	}



	@Override
	public int save(FeedbackCommon fc) {
		// TODO Auto-generated method stub
		return dao.save(fc);
	}


	
}
