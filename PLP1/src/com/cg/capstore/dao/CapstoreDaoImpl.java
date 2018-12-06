package com.cg.capstore.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;

import org.springframework.stereotype.Repository;

import com.cg.capstore.dto.FeedbackCommon;

@Repository("dao")
public class CapstoreDaoImpl implements ICapstoreDao{

	@PersistenceContext
	EntityManager entitymanager;

	

	@Override
	public List<FeedbackCommon> getAllFeedNRes() {
		// TODO Auto-generated method stub
		String str = "select fnr from FeedbackCommon fnr";
		TypedQuery<FeedbackCommon> query = entitymanager.createQuery(str,FeedbackCommon.class);
		return query.getResultList();
	}


	
	
	@Override
	public FeedbackCommon search(int mercId) {
		// TODO Auto-generated method stub
		System.out.println("daosearch");
		FeedbackCommon fc = entitymanager.find(FeedbackCommon.class, mercId);
		System.out.println(fc);
		return fc;
	}

	@Override
	public void update(FeedbackCommon query) {
		// TODO Auto-generated method stub
		entitymanager.merge(query);
		entitymanager.flush();
	}




	@Override
	public int save(FeedbackCommon fc) {
		entitymanager.persist(fc);
		entitymanager.flush();
		return fc.getMerc_id();

	}
	
}
