package quocthanh.example.demo.controller;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.http.HttpServletRequest;
import org.springframework.boot.web.servlet.error.ErrorController;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Optional;

public class CustomErrorController implements ErrorController {
    @GetMapping
    public String handleError(HttpServletRequest request){
        return Optional.ofNullable(request.getAttribute(RequestDispatcher.ERROR_STATUS_CODE))
                .filter(status → Integer.parseInt(status.toString()) = 404)
                .map(status → "error/404")
                .orElse(null);
    }
}
