Step 1. Add the JitPack repository to your build file (添加 JitPack 库到 pom.xml 文件中)

```xml
<repositories>
  <repository>
    <id>jitpack.io</id>
    <url>https://jitpack.io</url>
  </repository>
</repositories>
```

Step 2. Add the dependency (在 pom.xml 添加 filter 依赖)

```xml
<dependency>
  <groupId>com.github.doudio</groupId>
  <artifactId>spring-boot-starter-filter-security</artifactId>
  <version>2.0.0-SNAPSHOT</version>
</dependency>
```

Step 3. Add enable to springboot boot class (SpringBoot 启动类上添加注解)

```java
@EnableSpaceFilter
@SpringBootApplication
public class DemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(DemoApplication.class, args);
    }

}
```

| annotation ( 注解 )      | effect ( 作用 )                                |
| ------------------------ | ---------------------------------------------- |
| @EnableCorsFilter        | Cross domain filter ( 跨域过滤器 )             |
| @EnableSpaceFilter       | Space character filter ( HTML4特殊字符过滤器 ) |
| @EnableEscapeHtml4Filter | Special character filter ( 前后空格过滤器 )    |


Step 4. Configuration (可用配置)

```yaml
# 跨域过滤器 添加 header
# 跨域默认配置
#     headerMap.put("Access-Control-Allow-Origin", "*");
#     headerMap.put("Access-Control-Allow-Methods", "POST, GET, OPTIONS");
#     headerMap.put("Access-Control-Max-Age", "3600");
#     headerMap.put("Access-Control-Allow-Headers", "Origin, No-Cache, X-Requested-With, Content-Type, X-Forwarded-For, User-Agent, Authorization, serviceid, newUser, isProprietary");
#     headerMap.put("Access-Control-Expose-Headers", "Authorization, serviceid, newUser, isProprietary");
#
#doudio:
#  filter:
#    cors:
#      headerMap:
#        Access-Control-Max-Age: 666

# HTML4特殊字符过滤器 配置排除的 URL
#doudio:
#  filter:
#    escape:
#      excludeUrl:
#        - /excludeUrl

# 前后空格过滤器 配置排除的 URL
#doudio:
#  filter:
#    space:
#      excludeUrl:
#        - /excludeUrl

# 与swagger有些冲突
doudio:
  filter:
    escape:
      excludeUrl:
        - /v2/api-docs
        - /v2/api-docs-ext
        - /swagger-resources
        - /doc.html
    space:
      excludeUrl:
        - /v2/api-docs
        - /v2/api-docs-ext
        - /swagger-resources
        - /doc.html

```
