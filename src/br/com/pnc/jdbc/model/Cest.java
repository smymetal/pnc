package br.com.pnc.jdbc.model;

public class Cest {
    
    private Long id;
    private Long segmento_id;
    private Float item;
    private String cest;
    private String descricao;
    private String anexo;
    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public Long getSegmento_id() {
        return segmento_id;
    }
    public void setSegmento_id(Long segmento_id) {
        this.segmento_id = segmento_id;
    }
    public Float getItem() {
        return item;
    }
    public void setItem(Float item) {
        this.item = item;
    }
    public String getCest() {
        return cest;
    }
    public void setCest(String cest) {
        this.cest = cest;
    }
    public String getDescricao() {
        return descricao;
    }
    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
    public String getAnexo() {
        return anexo;
    }
    public void setAnexo(String anexo) {
        this.anexo = anexo;
    }

}
