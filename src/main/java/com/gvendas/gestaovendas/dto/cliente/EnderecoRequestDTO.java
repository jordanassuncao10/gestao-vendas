package com.gvendas.gestaovendas.dto.cliente;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;

import org.hibernate.validator.constraints.Length;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@ApiModel("Endereço requisição DTO")
public class EnderecoRequestDTO {

	@ApiModelProperty(name = "Logradouro")
	@NotBlank(message = "Logradouro")
	@Length(min = 3, max = 30, message = "Logradouro")
	private String logradouro;

	@ApiModelProperty(name = "Numero")
	@NotNull(message = "Numero")
	private Integer numero;

	@ApiModelProperty(name = "Complemento")
	@Length(max = 30, message = "Complemento")
	private String complemento;

	@ApiModelProperty(name = "Bairro")
	@NotBlank(message = "Bairro")
	@Length(min = 3, max = 30, message = "Bairro")
	private String bairro;

	@ApiModelProperty(name = "CEP")
	@NotBlank(message = "CEP")
	@Pattern(regexp = "[\\d]{5}-[\\d]{3}", message = "CEP")
	private String cep;

	@ApiModelProperty(name = "Cidade")
	@NotBlank(message = "Cidade")
	@Length(min = 3, max = 30, message = "Cidade")
	private String cidade;

	@ApiModelProperty(name = "Estado")
	@NotBlank(message = "Estado")
	@Length(min = 2, max = 30, message = "Estado")
	private String estado;

	public String getLogradouro() {
		return logradouro;
	}

	public void setLogradouro(String logradouro) {
		this.logradouro = logradouro;
	}

	public Integer getNumero() {
		return numero;
	}

	public void setNumero(Integer numero) {
		this.numero = numero;
	}

	public String getComplemento() {
		return complemento;
	}

	public void setComplemento(String complemento) {
		this.complemento = complemento;
	}

	public String getBairro() {
		return bairro;
	}

	public void setBairro(String bairro) {
		this.bairro = bairro;
	}

	public String getCep() {
		return cep;
	}

	public void setCep(String cep) {
		this.cep = cep;
	}

	public String getCidade() {
		return cidade;
	}

	public void setCidade(String cidade) {
		this.cidade = cidade;
	}

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}
}
