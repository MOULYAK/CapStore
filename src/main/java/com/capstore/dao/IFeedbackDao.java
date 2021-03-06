package com.capstore.dao;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.capstore.model.Feedback;

@Repository("feedbackDao")
@Transactional
public interface IFeedbackDao extends JpaRepository<Feedback,Integer>  {

}
