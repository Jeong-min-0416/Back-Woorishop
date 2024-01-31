package com.woorishop.woorishop.swagger;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import jakarta.servlet.http.HttpServletRequest;

@Controller
public class SwaggerController {

    @GetMapping("/swagger-ui")
    public String redirectToSwagger(HttpServletRequest request) {
        // 여기서 사용자의 권한을 확인하고, ADMIN 권한이 있는 경우 Swagger UI로 리다이렉션합니다.
        if (userHasAdminRole(request)) {
            return "redirect:/swagger-ui.html";
        } else {
            // 권한이 없는 경우 다른 페이지로 리다이렉션하거나 오류 메시지를 반환할 수 있습니다.
            return "redirect:/access-denied.html";
        }
    }

    private boolean userHasAdminRole(HttpServletRequest request) {
        String role = (String) request.getSession().getAttribute("role");
        return "ADMIN".equals(role);
    }
}
