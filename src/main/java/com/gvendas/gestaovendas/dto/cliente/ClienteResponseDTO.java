package com.gvendas.gestaovendas.dto.cliente;

import com.gvendas.gestaovendas.entidades.Cliente;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@ApiModel("Cliente retorno DTO")
public class ClienteResponseDTO {

	@ApiModelProperty(name = "Código")
	private Long codigo;

	@ApiModelProperty(name = "Nome")
	private String nome;

	@ApiModelProperty(name = "Teleone")
	private String telefone;

	@ApiModelProperty(name = "Ativo")
	private Boolean ativo;

	private EnderecoResponseDTO enderecoDto;

	public ClienteResponseDTO(Long codigo, String nome, String telefone, Boolean ativo,
			EnderecoResponseDTO enderecoDto) {
		super();
		this.codigo = codigo;
		this.nome = nome;
		this.telefone = telefone;
		this.ativo = ativo;
		this.enderecoDto = enderecoDto;
	}

	public static ClienteResponseDTO converterParaClienteDTO(Cliente cliente) {
		EnderecoResponseDTO enderecoResponseDto = new EnderecoResponseDTO(cliente.getEndereco().getLogradouro(),
				cliente.getEndereco().getNumero(), cliente.getEndereco().getComplemento(),
				cliente.getEndereco().getBairro(), cliente.getEndereco().getCep(), cliente.getEndereco().getCidade(),
				cliente.getEndereco().getEstado());
		return new ClienteResponseDTO(cliente.getCodigo(), cliente.getNome(), cliente.getTelefone(), cliente.getAtivo(),
				enderecoResponseDto);
	}

	public Long getCodigo() {
		return codigo;
	}

	public void setCodigo(Long codigo) {
		this.codigo = codigo;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public Boolean getAtivo() {
		return ativo;
	}

	public void setAtivo(Boolean ativo) {
		this.ativo = ativo;
	}

	public EnderecoResponseDTO getEnderecoDto() {
		return enderecoDto;
	}

	public void setEnderecoDto(EnderecoResponseDTO enderecoDto) {
		this.enderecoDto = enderecoDto;
	}

}
