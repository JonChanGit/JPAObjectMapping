package cn.com.jonpad.entity;

import javax.persistence.*;

/**
 * Created by chenjunlai on 2017/12/4.
 */
@Entity
@Table(name = "Person")
public class Person {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="p_i_id")
	private long id;
	private  String name;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}
