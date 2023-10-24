package com.mount.tecnical.config;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import java.io.IOException;

public class CustomFilter implements Filter {

    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
        // Puedes inicializar recursos o realizar tareas de configuración si es necesario.
    }

    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
            throws IOException, ServletException {
        // Aquí puedes agregar lógica personalizada antes de pasar la solicitud a la cadena de filtros.
        // Por ejemplo, puedes verificar ciertas condiciones y decidir si permitir o denegar la solicitud.

        // En este caso, el filtro no hace nada especial y simplemente pasa la solicitud a la siguiente etapa.
        chain.doFilter(request, response);

        // Aquí también puedes agregar lógica después de que la solicitud se ha procesado.
    }

    @Override
    public void destroy() {
        // Puedes realizar tareas de limpieza si es necesario.
    }
}

