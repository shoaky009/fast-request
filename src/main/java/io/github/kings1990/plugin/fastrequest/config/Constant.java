package io.github.kings1990.plugin.fastrequest.config;

import com.google.common.collect.ImmutableMap;

import java.util.Map;

public class Constant {
    public static final String I18N_PATH = "io/github/kings1990/fastrequest/18n/fr";

    public enum JaxRsMappingConfig {
        PATH("javax.ws.rs.Path", "");
        private final String code;
        private final String methodType;

        public String getCode() {
            return code;
        }

        public String getMethodType() {
            return methodType;
        }

        JaxRsMappingConfig(String code, String methodType) {
            this.code = code;
            this.methodType = methodType;
        }
    }

    public enum JaxRsMappingMethodConfig {
        GET("javax.ws.rs.GET", "GET"),
        POST("javax.ws.rs.POST", "POST"),
        DELETE("javax.ws.rs.DELETE", "DELETE"),
        PUT("javax.ws.rs.PUT", "PUT");
        private final String code;
        private final String methodType;

        public String getCode() {
            return code;
        }

        public String getMethodType() {
            return methodType;
        }

        JaxRsMappingMethodConfig(String code, String methodType) {
            this.code = code;
            this.methodType = methodType;
        }
    }

    public enum SpringMappingConfig {
        GET_MAPPING("org.springframework.web.bind.annotation.GetMapping", "GET"),
        POST_MAPPING("org.springframework.web.bind.annotation.PostMapping", "POST"),
        REQUEST_MAPPING("org.springframework.web.bind.annotation.RequestMapping", ""),
        DELETE_MAPPING("org.springframework.web.bind.annotation.DeleteMapping", "DELETE"),
        PUT_MAPPING("org.springframework.web.bind.annotation.PutMapping", "PUT"),
        PATCH_MAPPING("org.springframework.web.bind.annotation.PatchMapping", "PATCH");
        private final String code;
        private final String methodType;

        public String getCode() {
            return code;
        }

        public String getMethodType() {
            return methodType;
        }

        SpringMappingConfig(String code, String methodType) {
            this.code = code;
            this.methodType = methodType;
        }
    }

    public enum SpringControllerConfig {
        CONTROLLER("org.springframework.stereotype.Controller"),
        REST_CONTROLLER("org.springframework.web.bind.annotation.RestController");
        private final String code;

        public String getCode() {
            return code;
        }

        SpringControllerConfig(String code) {
            this.code = code;
        }
    }

    public enum JaxRsUrlParamConfig {
        PATH_PARAM("javax.ws.rs.PathParam", 1),
        QUERY_PARAM("javax.ws.rs.QueryParam", 2),
        FORM_PARAM("javax.ws.rs.FormParam", 2),
        BEAN_PARAM("javax.ws.rs.BeanParam", 2),
        HEADER_PARAM("javax.ws.rs.HeaderParam", 0),
        COOKIE_PARAM("javax.ws.rs.CookieParam", 0),
        MATRIX_PARAM("javax.ws.rs.MatrixParam", 0),
        ;
        private final String code;

        /**
         * 1- path url参数  2-url参数&拼接 3-body参数 0-不参与
         */

        private final Integer parseType;

        public String getCode() {
            return code;
        }

        public Integer getParseType() {
            return parseType;
        }

        JaxRsUrlParamConfig(String code, Integer parseType) {
            this.code = code;
            this.parseType = parseType;
        }
    }

    public enum SpringUrlParamConfig {
        PATH_VARIABLE("org.springframework.web.bind.annotation.PathVariable", 1),
        REQUEST_PARAM("org.springframework.web.bind.annotation.RequestParam", 2),
        REQUEST_BODY("org.springframework.web.bind.annotation.RequestBody", 3),
        MATRIX_VARIABLE("org.springframework.web.bind.annotation.MatrixVariable", 0),
        MODEL_ATTRIBUTE("org.springframework.web.bind.annotation.ModelAttribute", 0),
        REQUEST_HEADER("org.springframework.web.bind.annotation.RequestHeader", 0),
        REQUEST_PART("org.springframework.web.bind.annotation.RequestPart", 0),
        COOKIE_VALUE("org.springframework.web.bind.annotation.CookieValue", 0),
        SESSION_ATTRIBUTE("org.springframework.web.bind.annotation.SessionAttribute", 0),
        REQUEST_ATTRIBUTE("org.springframework.web.bind.annotation.RequestAttribute", 0);
        private final String code;

        /**
         * 1- path url参数  2-url参数&拼接 3-body参数 0-不参与
         */

        private final Integer parseType;

        public String getCode() {
            return code;
        }

        public Integer getParseType() {
            return parseType;
        }

        SpringUrlParamConfig(String code, Integer parseType) {
            this.code = code;
            this.parseType = parseType;
        }
    }

    public enum SpringParamTypeConfig {
        URL_PARAMS("URL Params"),
        JSON("JSON"),
        FORM_URL_ENCODED("Form URL-Encoded");

        private final String code;

        public String getCode() {
            return code;
        }

        SpringParamTypeConfig(String code) {
            this.code = code;
        }
    }

    public static class HttpStatusDesc {
        public static Map<Integer,String> STATUS_MAP
                = ImmutableMap.<Integer,String>builder()
                .put(0,"")
                .put(200,"OK")
                .put(201,"Created")
                .put(202,"Accepted")
                .put(203,"Non-Authoritative Information")
                .put(204,"No Content.")
                .put(205,"Reset Content")
                .put(206,"Partial Content")

                .put(300,"Multiple Choices")
                .put(301,"Moved Permanently")
                .put(302,"Temporary Redirect")
                .put(303,"See Other")
                .put(304,"Not Modified")
                .put(305,"Use Proxy")
                .put(307,"Temporary Redirect")
                .put(308,"Permanent Redirect")

                .put(400,"Bad Request")
                .put(401,"Unauthorized")
                .put(402,"Payment Required")
                .put(403,"Forbidden")
                .put(404,"Not Found")
                .put(405,"Method Not Allowed")
                .put(406,"Not Acceptable")
                .put(407,"Proxy Authentication Required")
                .put(408,"Request Time-Out")
                .put(409,"Conflict")
                .put(410,"Gone")
                .put(411,"Length Required")
                .put(412,"Precondition Failed")
                .put(413,"Request Entity Too Large")
                .put(414,"Request-URI Too Large")
                .put(415,"Unsupported Media Type")

                .put(500,"Internal Server Error")
                .put(501,"Not Implemented")
                .put(502,"Bad Gateway")
                .put(503,"Service Unavailable")
                .put(504,"Gateway Timeout")
                .put(505,"HTTP Version Not Supported")
                .build();
    }


}
