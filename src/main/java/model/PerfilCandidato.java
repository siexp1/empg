package model;

import java.util.List;

/**
 * @author Dener
 */
public class PerfilCandidato {    
    
    private String nome;
    private String sobreNome;
    private String cidade;
    private String endereco;
    private String estado;
    private String pais;
    private String celular;
    private String sexo;
    private String nomeSocial;
    private boolean pessoaComDeficiencia;
    private String descricaoDeficiencia;
    private String profissao;
    private String site;
    private boolean disponibilidadeParaViagem;
    private String video;
    private Curriculo curriculo;
    private List<RedeSocial> redesSocial;
    
    public PerfilCandidato() { }
    
    public PerfilCandidato(String nome, String sobreNome, String cidade, 
            String endereco, String estado, String pais, String celular, 
            String sexo, String nomeSocial, boolean pessoaComDeficiencia, 
            String descricaoDeficiencia, String profissao, String site, 
            boolean disponibilidadeParaViagem, String video, Curriculo curriculo, 
            List<RedeSocial> redesSocial) {
        this.nome = nome;
        this.sobreNome = sobreNome;
        this.cidade = cidade;
        this.endereco = endereco;
        this.estado = estado;
        this.pais = pais;
        this.celular = celular;
        this.sexo = sexo;
        this.nomeSocial = nomeSocial;
        this.pessoaComDeficiencia = pessoaComDeficiencia;
        this.descricaoDeficiencia = descricaoDeficiencia;
        this.profissao = profissao;
        this.site = site;
        this.disponibilidadeParaViagem = disponibilidadeParaViagem;
        this.video = video;
        this.curriculo = curriculo;
        this.redesSocial = redesSocial;
    }        
}
