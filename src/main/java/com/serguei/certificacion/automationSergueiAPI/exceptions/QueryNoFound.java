package com.serguei.certificacion.automationSergueiAPI.exceptions;

public class QueryNoFound extends AssertionError{
    public static String ERROR_CERRAR_CONEXION = "ERROR =====> No se pudo cerrar la conexion";
    public static String QUERY_CONSULTA_FALLIDA = "ERROR =====> Error ejecutando la consulta";
    public QueryNoFound(String message){
        super(message);
    }
}
