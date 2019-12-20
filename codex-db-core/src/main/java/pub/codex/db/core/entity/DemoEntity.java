package pub.codex.db.core.entity;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import pub.codex.apix.annotations.*;
import pub.codex.apix.annotations.group.VG;
import javax.validation.constraints.*;

import java.io.Serializable;

/**
 * 演示表
 * 
 * @date 2019-12-20 16:28:25
 */
@TableName("sys_demo")
public class DemoEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 * id
	 */
	@TableId
	@ApiModelProperty("id")
	private Long id;
	/**
	 * 姓名
	 */
	@ApiModelProperty("姓名")
	private String name;
	/**
	 * 年龄
	 */
	@ApiModelProperty("年龄")
	private Integer age;

	public void setId(Long id) {
		this.id = id;
	}

	public Long getId() {
		return id;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	public Integer getAge() {
		return age;
	}
}
