package com.henriqueal.aplicacaospring.resources.exception;

public class StandardError {
	
	private Integer codigo;
	private String erro;
	private Long timestamp;
	
	public StandardError() {
		
	}

	public StandardError(Integer codigo, String erro, Long timestamp) {
		super();
		this.codigo = codigo;
		this.erro = erro;
		this.timestamp = timestamp;
	}

	public Integer getCodigo() {
		return codigo;
	}

	public void setCodigo(Integer codigo) {
		this.codigo = codigo;
	}

	public String getErro() {
		return erro;
	}

	public void setErro(String erro) {
		this.erro = erro;
	}

	public Long getTimestamp() {
		return timestamp;
	}

	public void setTimestamp(Long timestamp) {
		this.timestamp = timestamp;
	}
	
}
