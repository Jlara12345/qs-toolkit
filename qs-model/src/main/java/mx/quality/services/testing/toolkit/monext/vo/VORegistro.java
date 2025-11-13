package mx.quality.services.testing.toolkit.monext.vo;



import java.io.InputStream;
import java.util.HashMap;

public class VORegistro {

	



	public VORegistro() {
		// TODO Auto-generated constructor stub
	}


	
	public VORegistro(String timeStampGral, String timeStampPaso, String flujo, String paso, String status,
			String descripcion, InputStream evidencia, String nombreEvidencia, String concluido,
			String tipoEvidencia, String responseTime) {
		super();
		this.timeStampGral = timeStampGral;
		this.timeStampPaso = timeStampPaso;
		this.flujo = flujo;
		this.paso = paso;
		this.status = status;
		this.descripcion = descripcion;
		this.evidencia = evidencia;
		this.rutaEvidencia = rutaEvidencia;
		this.nombreEvidencia = nombreEvidencia;
		this.concluido = concluido;
		this.tipoEvidencia = tipoEvidencia;
		this.responseTime=responseTime;
	}
	
	
	
	
	
	
	
	
	public VORegistro(String ambiente, String aplicacion, String modulo, String story, String feature, String severidad,
			String flujo, String timeStampGral, String paso, String timeStampPaso, String status, String descripcion,
			InputStream evidencia, String nombreEvidencia, String concluido, String tipoEvidencia,
			String responseTime) {
		super();
		this.ambiente = ambiente;
		this.aplicacion = aplicacion;
		this.modulo = modulo;
		this.story = story;
		this.feature = feature;
		this.severidad = severidad;
		this.flujo = flujo;
		this.timeStampGral = timeStampGral;
		this.paso = paso;
		this.timeStampPaso = timeStampPaso;
		this.status = status;
		this.descripcion = descripcion;
		this.evidencia = evidencia;
		this.rutaEvidencia = rutaEvidencia;
		this.nombreEvidencia = nombreEvidencia;
		this.concluido = concluido;
		this.tipoEvidencia = tipoEvidencia;
		this.responseTime = responseTime;
	}
	
	
	public VORegistro(String ambiente, String aplicacion, String modulo, String story, String feature, String severidad,
			String flujo, String timeStampGral, String paso, String timeStampPaso, String status, String descripcion,
			InputStream evidencia, String nombreEvidencia, String concluido, String tipoEvidencia,
			String responseTime, String pHttpResponseCode, String pCanal) {
		super();
		this.ambiente = ambiente;
		this.aplicacion = aplicacion;
		this.modulo = modulo;
		this.story = story;
		this.feature = feature;
		this.severidad = severidad;
		this.flujo = flujo;
		this.timeStampGral = timeStampGral;
		this.paso = paso;
		this.timeStampPaso = timeStampPaso;
		this.status = status;
		this.descripcion = descripcion;
		this.evidencia = evidencia;
		this.rutaEvidencia = rutaEvidencia;
		this.nombreEvidencia = nombreEvidencia;
		this.concluido = concluido;
		this.tipoEvidencia = tipoEvidencia;
		this.responseTime = responseTime;
		this.httpReponseCode=pHttpResponseCode;
		this.canal=pCanal;
	}



	public HashMap<String, String> getMapa() {
		
		mapa.put("ambiente", this.ambiente);
		mapa.put("aplicacion", this.aplicacion);
		mapa.put("modulo", this.modulo);
		mapa.put("story", this.story);
		mapa.put("feature", this.feature);
		mapa.put("severidad", this.severidad);
		
		mapa.put("timeStampGral", this.timeStampGral);
		mapa.put("timeStampPaso", this.timeStampPaso);
		mapa.put("flujo", this.flujo);
		mapa.put("paso", this.flujo);
		mapa.put("status", this.status);
		mapa.put("descripcion", this.descripcion);
		mapa.put("evidencia", null);
		mapa.put("rutaEvidencia", this.rutaEvidencia);
		mapa.put("nombreEvidencia", this.nombreEvidencia);
		mapa.put("concluido", this.concluido);
		mapa.put("tipoEvidencia", this.tipoEvidencia);
		mapa.put("responseTime", this.responseTime);
		
	
		
		return mapa;
	}
	
	


	


	
	



	public String getTimeStampGral() {
		return timeStampGral;
	}
	public void setTimeStampGral(String timeStampGral) {
		this.timeStampGral = timeStampGral;
	}
	public String getTimeStampPaso() {
		return timeStampPaso;
	}
	public void setTimeStampPaso(String timeStampPaso) {
		this.timeStampPaso = timeStampPaso;
	}
	public String getFlujo() {
		return flujo;
	}
	public void setFlujo(String flujo) {
		this.flujo = flujo;
	}
	public String getPaso() {
		return paso;
	}
	public void setPaso(String paso) {
		this.paso = paso;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public String getDescripcion() {
		return descripcion;
	}
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	public InputStream getEvidencia() {
		return evidencia;
	}
	public void setEvidencia(InputStream evidencia) {
		this.evidencia = evidencia;
	}
	public String getRutaEvidencia() {
		return rutaEvidencia;
	}
	public void setRutaEvidencia(String rutaEvidencia) {
		this.rutaEvidencia = rutaEvidencia;
	}
	public String getNombreEvidencia() {
		return nombreEvidencia;
	}
	public void setNombreEvidencia(String nombreEvidencia) {
		this.nombreEvidencia = nombreEvidencia;
	}
	public String getConcluido() {
		return concluido;
	}
	public void setConcluido(String concluido) {
		this.concluido = concluido;
	}
	public String getTipoEvidencia() {
		return tipoEvidencia;
	}
	public void setTipoEvidencia(String tipoEvidencia) {
		this.tipoEvidencia = tipoEvidencia;
	}

	
	public String getAmbiente() {
		return ambiente;
	}


	public void setAmbiente(String ambiente) {
		this.ambiente = ambiente;
	}


	public String getAplicacion() {
		return aplicacion;
	}


	public void setAplicacion(String aplicacion) {
		this.aplicacion = aplicacion;
	}


	public String getModulo() {
		return modulo;
	}


	public void setModulo(String modulo) {
		this.modulo = modulo;
	}


	public String getStory() {
		return story;
	}


	public void setStory(String story) {
		this.story = story;
	}


	public String getFeature() {
		return feature;
	}


	public void setFeature(String feature) {
		this.feature = feature;
	}


	public String getSeveridad() {
		return severidad;
	}


	public void setSeveridad(String severidad) {
		this.severidad = severidad;
	}
	
	public String getCanal() {
		return canal;
	}



	public void setCanal(String canal) {
		this.canal = canal;
	}



	public String getHttpReponseCode() {
		return httpReponseCode;
	}



	public void setHttpReponseCode(String httpReponseCode) {
		this.httpReponseCode = httpReponseCode;
	}
	
	





	public void setMapa(HashMap<String, String> mapa) {
		this.mapa = mapa;
	}




	public String getResponseTime() {
		return responseTime;
	}
	public void setResponseTime(String responseTime) {
		this.responseTime = responseTime;
	}


	private String ambiente;
	private String aplicacion;
	private String modulo;
	private String story;
	private String feature;
	private String severidad;
	private String flujo;
	private String timeStampGral;
	private String paso;
	private String timeStampPaso;
	private String status = "FAIl";
	private String descripcion;
	private InputStream evidencia;
	private String rutaEvidencia;
	private String nombreEvidencia;
	private String concluido;
	private String tipoEvidencia;
	private String responseTime;
	private String canal;
	private String httpReponseCode;
	
	private HashMap<String, String> mapa = new HashMap<String, String>();

	@Override
	public String toString() {
		return "VORegistro [ambiente=" + ambiente + ", aplicacion=" + aplicacion + ", modulo=" + modulo + ", story="
				+ story + ", feature=" + feature + ", severidad=" + severidad + ", flujo=" + flujo + ", timeStampGral="
				+ timeStampGral + ", paso=" + paso + ", timeStampPaso=" + timeStampPaso + ", status=" + status
				+ ", descripcion=" + descripcion + ", evidencia=" + evidencia + ", rutaEvidencia=" + rutaEvidencia
				+ ", nombreEvidencia=" + nombreEvidencia + ", concluido=" + concluido + ", tipoEvidencia="
				+ tipoEvidencia + ", responseTime=" + responseTime + ", canal=" + canal + ", httpReponseCode="
				+ httpReponseCode + "]";
	}
	
	
	
	
	

	
	
	
	
	
	

}
