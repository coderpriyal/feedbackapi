package com.example.feedbackdatabase.repository;
import com.example.feedbackdatabase.model.Feedback;
import org.springframework.data.jpa.repository.JpaRepository;
public interface FeedbackRepository extends JpaRepository<Feedback, Long> {
}

