package com.baizhi;

import com.alibaba.fastjson.serializer.SerializerFeature;
import com.alibaba.fastjson.support.config.FastJsonConfig;
import com.alibaba.fastjson.support.spring.FastJsonHttpMessageConverter;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.Banner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.ansi.AnsiOutput;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.web.HttpMessageConverters;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.core.SpringVersion;
import org.springframework.http.converter.HttpMessageConverter;

@SpringBootApplication
@MapperScan(value="com.baizhi.dao")
public class Application {
    public static void main(String[] args) {
        SpringApplication.run(Application.class,args);
        /*AnsiOutput.setEnabled(AnsiOutput.Enabled.ALWAYS);
       new SpringApplicationBuilder(Application.class)
               .main(SpringVersion.class)//打印spring的版本号
               .bannerMode(Banner.Mode.CONSOLE)//控制台输出
               .run(args);*/
    }
    @Bean
    public HttpMessageConverters fastjsonHttpMessageConverter() {
         //定义一个转换消息的对象
        FastJsonHttpMessageConverter fastConverter = new FastJsonHttpMessageConverter();
        //添加fastjson的配置信息 比如 ：是否要格式化返回的json数据
        FastJsonConfig fastJsonConfig = new FastJsonConfig();
        fastJsonConfig.setSerializerFeatures(SerializerFeature.PrettyFormat);
         //在转换器中添加配置信息
        fastConverter.setFastJsonConfig(fastJsonConfig);
        HttpMessageConverter<?> converter = fastConverter;
        return new HttpMessageConverters(converter);
    }

}
