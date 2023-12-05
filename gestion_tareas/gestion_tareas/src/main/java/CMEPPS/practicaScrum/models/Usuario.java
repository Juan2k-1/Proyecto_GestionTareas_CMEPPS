package CMEPPS.practicaScrum.models;

/**
 *
 * @author Juan Alberto Dominguez Vazquez
 */
public class Usuario
{
    private Long id;
    private String nombre;
    private String apellidos;
    private String nickName;
    private String salt;
    private String hashContraseña;
    private String email;

    public Usuario(Long id, String nombre, String apellido, String email, String nickName, String hash_contraseña, String salt)
    {
        this.id = id;
        this.nombre = nombre;
        this.apellidos = apellido;
        this.email = email;
        this.nickName = nickName;
        this.hashContraseña = hash_contraseña;
        this.salt = salt;
    }

    @Override
    public String toString()
    {
        return "Usuario{" + "id=" + id + ", nombre=" + nombre + ", apellidos=" + apellidos + ", nickName=" + nickName + ", salt=" + salt + ", hashContrase\u00f1a=" + hashContraseña + ", email=" + email + '}';
    }
    
    public Long getId()
    {
        return id;
    }

    public String getNombre()
    {
        return nombre;
    }

    public String getApellidos()
    {
        return apellidos;
    }

    public String getNickName()
    {
        return nickName;
    }

    public String getEmail()
    {
        return email;
    }

    public String getSalt()
    {
        return salt;
    }

    public void setSalt(String salt)
    {
        this.salt = salt;
    }

    public String getHashContraseña()
    {
        return hashContraseña;
    }

    public void setHashContraseña(String hashContraseña)
    {
        this.hashContraseña = hashContraseña;
    }

    public void setNombre(String nombre)
    {
        this.nombre = nombre;
    }

    public void setApellidos(String apellidos)
    {
        this.apellidos = apellidos;
    }

    public void setNickName(String nickName)
    {
        this.nickName = nickName;
    }

    public void setEmail(String email)
    {
        this.email = email;
    }   
}