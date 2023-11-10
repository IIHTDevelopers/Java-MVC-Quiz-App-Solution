package com.yaksha.training.quiz.entity;

import org.springframework.stereotype.Component;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Component
@Entity
@Table(name = "questions")
public class Question {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long quesId;
	
	@NotBlank
	@Size(min = 3, max = 500)
	private String title;
	
	@NotBlank
	@Size(min = 3, max = 100)
	private String optionA;
	
	@NotBlank
	@Size(min = 3, max = 100)
	private String optionB;
	
	@NotBlank
	@Size(min = 3, max = 100)
	private String optionC;
	
	@NotNull
	@Min(1)
	@Max(3)
	private int ans;

	private int chose;

	public Question() {
		super();
	}

	public Question(Long quesId, String title, String optionA, String optionB, String optionC, int ans, int chose) {
		super();
		this.quesId = quesId;
		this.title = title;
		this.optionA = optionA;
		this.optionB = optionB;
		this.optionC = optionC;
		this.ans = ans;
		this.chose = chose;
	}

	public Long getQuesId() {
		return quesId;
	}

	public void setQuesId(Long quesId) {
		this.quesId = quesId;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getOptionA() {
		return optionA;
	}

	public void setOptionA(String optionA) {
		this.optionA = optionA;
	}

	public String getOptionB() {
		return optionB;
	}

	public void setOptionB(String optionB) {
		this.optionB = optionB;
	}

	public String getOptionC() {
		return optionC;
	}

	public void setOptionC(String optionC) {
		this.optionC = optionC;
	}

	public int getAns() {
		return ans;
	}

	public void setAns(int ans) {
		this.ans = ans;
	}

	public int getChose() {
		return chose;
	}

	public void setChose(int choosed) {
		this.chose = choosed;
	}

	@Override
	public String toString() {
		return "Question [quesId=" + quesId + ", title=" + title + ", optionA=" + optionA + ", optionB=" + optionB
				+ ", optionC=" + optionC + ", ans=" + ans + ", chose=" + chose + "]";
	}

}
