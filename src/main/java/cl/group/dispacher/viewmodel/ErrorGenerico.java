package cl.group.dispacher.viewmodel;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;
import org.hibernate.validator.constraints.*;

/**
 * error generico para casos borde
 */
@ApiModel(description = "error generico para casos borde")

public class ErrorGenerico   {
  @JsonProperty("codigoMensaje")
  private String codigoMensaje;

  @JsonProperty("mensaje")
  private String mensaje;

  public ErrorGenerico codigoMensaje(String codigoMensaje) {
    this.codigoMensaje = codigoMensaje;
    return this;
  }

  /**
   * Get codigoMensaje
   * @return codigoMensaje
  */
  @ApiModelProperty(value = "")


  public String getCodigoMensaje() {
    return codigoMensaje;
  }

  public void setCodigoMensaje(String codigoMensaje) {
    this.codigoMensaje = codigoMensaje;
  }

  public ErrorGenerico mensaje(String mensaje) {
    this.mensaje = mensaje;
    return this;
  }

  /**
   * Get mensaje
   * @return mensaje
  */
  @ApiModelProperty(value = "")


  public String getMensaje() {
    return mensaje;
  }

  public void setMensaje(String mensaje) {
    this.mensaje = mensaje;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ErrorGenerico errorGenerico = (ErrorGenerico) o;
    return Objects.equals(this.codigoMensaje, errorGenerico.codigoMensaje) &&
        Objects.equals(this.mensaje, errorGenerico.mensaje);
  }

  @Override
  public int hashCode() {
    return Objects.hash(codigoMensaje, mensaje);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ErrorGenerico {\n");
    
    sb.append("    codigoMensaje: ").append(toIndentedString(codigoMensaje)).append("\n");
    sb.append("    mensaje: ").append(toIndentedString(mensaje)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

