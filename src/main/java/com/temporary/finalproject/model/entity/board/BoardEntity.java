package com.wj.thymleaftest.entity;


import jakarta.persistence.*;
import lombok.*;

import java.util.Date;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Setter
@Getter
@ToString
public class Board {

	@Id
//	@GeneratedValue 아래의 괄호 문은 생략해도 됨.
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@Column
	private String title;

	@Column
	private String content;

	@Column
	private String status;

	@Column
	private String writer;

	@Temporal(TemporalType.DATE)
	@Column(columnDefinition = "DATE DEFAULT CURRENT_DATE")
	private Date writtenDate;




	public void patch(Board board){
		if(board.title != null){
			this.title = board.title;
		}
		if(board.status != null){
			this.status = board.status;
		}
		if (board.writer != null) {
			this.writer = board.writer;
		}
		if (board.writtenDate != null) {
			this.writtenDate = board.writtenDate;
		}
		if (board.content != null) {
			this.content = board.content;
		}

	}

}
