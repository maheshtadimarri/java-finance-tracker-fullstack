package com.portfolio.financeflow.config;
import io.swagger.v3.oas.models.OpenAPI; import io.swagger.v3.oas.models.info.Info; import org.springframework.context.annotation.Bean; import org.springframework.context.annotation.Configuration;
@Configuration public class OpenApiConfig { @Bean OpenAPI financeFlowOpenAPI(){return new OpenAPI().info(new Info().title("FinanceFlow API").version("1.0").description("Personal finance tracking and analytics API."));} }
