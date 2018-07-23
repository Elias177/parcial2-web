package clases;

import javax.persistence.*;

@Entity
public class Reaccion {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "rea_generator")
    @SequenceGenerator(name="rea_generator", sequenceName = "rea_seq", allocationSize=1)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "ID_Usuario")
    private Usuario usuario;

    @ManyToOne
    @JoinColumn(name = "ID_Imagen")
    private Imagen imagen;

    @ManyToOne
    @JoinColumn(name = "ID_Album")
    private Album album;

    @ManyToOne
    @JoinColumn(name = "ID_Comentario")
    private Comentario comentario;

    private boolean reaccion;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public Imagen getImagen() {
        return imagen;
    }

    public void setImagen(Imagen imagen) {
        this.imagen = imagen;
    }

    public Album getAlbum() {
        return album;
    }

    public void setAlbum(Album album) {
        this.album = album;
    }

    public Comentario getComentario() {
        return comentario;
    }

    public void setComentario(Comentario comentario) {
        this.comentario = comentario;
    }

    public boolean isReaccion() {
        return reaccion;
    }

    public void setReaccion(boolean reaccion) {
        this.reaccion = reaccion;
    }
}
