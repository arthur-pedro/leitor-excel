package org.leitorexcel.model;

import java.io.Serializable;

public class Produto implements Serializable {

	private static final long serialVersionUID = 1L;

	private Long codigo;
	private String nome;
	private String detalheEmbalagem;
	private String descricao;
	private Double preco;
	private Integer estoque;
	private String filenameSmall;
	private String filenameLarge;
	private String tipoProduto;
	private String fabricante;
	private boolean servico;

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((codigo == null) ? 0 : codigo.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Produto other = (Produto) obj;
		if (codigo == null) {
			if (other.codigo != null)
				return false;
		} else if (!codigo.equals(other.codigo))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Produto [codigo=" + codigo + ", nome=" + nome + ", detalheEmbalagem=" + detalheEmbalagem
				+ ", descricao=" + descricao + ", preco=" + preco + ", estoque=" + estoque + ", filenameSmall="
				+ filenameSmall + ", filenameLarge=" + filenameLarge + ", tipoProduto=" + tipoProduto + ", fabricante="
				+ fabricante + ", servico=" + servico + "]";
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

	public String getDetalheEmbalagem() {
		return detalheEmbalagem;
	}

	public void setDetalheEmbalagem(String detalheEmbalagem) {
		this.detalheEmbalagem = detalheEmbalagem;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public Double getPreco() {
		return preco;
	}

	public void setPreco(Double preco) {
		this.preco = preco;
	}

	public Integer getEstoque() {
		return estoque;
	}

	public void setEstoque(Integer estoque) {
		this.estoque = estoque;
	}

	public String getFilenameSmall() {
		return filenameSmall;
	}

	public void setFilenameSmall(String filenameSmall) {
		this.filenameSmall = filenameSmall;
	}

	public String getFilenameLarge() {
		return filenameLarge;
	}

	public void setFilenameLarge(String filenameLarge) {
		this.filenameLarge = filenameLarge;
	}

	public String getTipoProduto() {
		return tipoProduto;
	}

	public void setTipoProduto(String tipoProduto) {
		this.tipoProduto = tipoProduto;
	}

	public String getFabricante() {
		return fabricante;
	}

	public void setFabricante(String fabricante) {
		this.fabricante = fabricante;
	}

	public boolean isServico() {
		return servico;
	}

	public void setServico(boolean servico) {
		this.servico = servico;
	}

}
