package pub.codex.db.core.entity;

import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;
import pub.codex.apix.annotations.*;
import pub.codex.apix.annotations.group.VG;
import javax.validation.constraints.*;
import java.util.Date;

import java.io.Serializable;

/**
 * 演示表
 * 
 * @date 20191129165430
 */
@TableName("sys_demo")
public class DemoEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 * id
	 */
	@TableId
	@NotNull(groups = {VG.Add.class,VG.Update.class,VG.Delete.class,VG.Get.class})
	@ApiModelProperty("id")
	private Long id;
	/**
	 * 姓名
	 */
	@NotBlank(groups = {VG.Add.class})
	@ApiModelProperty(describe = "姓名",groups = {VG.Update.class})
	private String name;
	/**
	 * 年龄
	 */
	@ApiModelProperty(describe = "年龄",groups = {VG.Add.class,VG.Update.class})
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
