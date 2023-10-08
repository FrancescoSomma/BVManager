package entity;

import javax.persistence.*;

import java.util.Date;

@MappedSuperclass
public class BaseEntity {

	@Basic
	@Column(name = "DATA_ORA_ULT_MOV")
	private Date dataOraUltMov;
	@Basic
	@Column(name = "COD_UTE_ULT_MOV")
	private String codUteUltMov;

	@Basic
	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "DES_ULT_MOV")
	private String desUltMov;

	public BaseEntity() {
		
	}

	public BaseEntity(Date dataOraUltMov, String codUteUltMov, String desUltMov) {
		this.dataOraUltMov = dataOraUltMov;
		this.codUteUltMov = codUteUltMov;
		this.desUltMov = desUltMov;
	}

	public Date getDataOraUltMov() {
		return dataOraUltMov;
	}

	public void setDataOraUltMov(Date dataOraUltMov) {
		this.dataOraUltMov = dataOraUltMov;
	}

	public String getCodUteUltMov() {
		return codUteUltMov;
	}

	public void setCodUteUltMov(String codUteUltMov) {
		this.codUteUltMov = codUteUltMov;
	}

	public String getDesUltMov() {
		return desUltMov;
	}

	public void setDesUltMov(String desUltMov) {
		this.desUltMov = desUltMov;
	}
}
