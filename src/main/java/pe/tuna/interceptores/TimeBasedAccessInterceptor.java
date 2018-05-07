package pe.tuna.interceptores;

import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.Calendar;

public class TimeBasedAccessInterceptor extends HandlerInterceptorAdapter {
    private int openningTime;
    private int closingTime;

    public void setOpenningTime(int openningTime) {
        this.openningTime = openningTime;
    }

    public void setClosingTime(int closingTime) {
        this.closingTime = closingTime;
    }

    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception{
        if(!request.getServletPath().equals("/mantenimiento")){
            Calendar calendar = Calendar.getInstance();
            int hour = calendar.get(Calendar.HOUR_OF_DAY);
            if (openningTime<= hour && hour < closingTime){
                return true;
            }
            response.sendRedirect(request.getContextPath() + "/mnt/close.jsp");
            return false;
        }else{
            return true;
        }



    }

}
