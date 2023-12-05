package CMEPPS.practicaScrum.models.driver_adapter;

import CMEPPS.practicaScrum.models.Usuario;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

/**
 *
 * @author Juan Alberto Dominguez Vazquez
 */
@Entity
public class UsuarioEntity
{
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(name = "nombre", nullable = false)
    private String nombre;

    @Column(name = "apellidos", nullable = false)
    private String apellidos;

    @Column(name = "email", nullable = false, unique = true)
    private String email;

    @Column(name = "nickName", nullable = false, unique = true)
    private String nickName;

    @Column(name = "hash_contraseña", nullable = false)
    private String hashContraseña;

    @Column(name = "salt", nullable = false)
    private String salt;

    public UsuarioEntity(Long id, String nombre, String apellidos, String email, String nickName, String hashContraseña, String salt)
    {
        this.id = id;
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.email = email;
        this.nickName = nickName;
        this.hashContraseña = hashContraseña;
        this.salt = salt;
    }

    public Usuario toUsuario()
    {
        return new Usuario(this.id, this.nombre, this.apellidos, this.email, this.nickName, this.hashContraseña, this.salt);
    }
}
