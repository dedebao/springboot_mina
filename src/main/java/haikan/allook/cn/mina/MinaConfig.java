package haikan.allook.cn.mina;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

import lombok.Data;

@Configuration
@ConfigurationProperties(prefix="mina")
@Data
public class MinaConfig {
	
	private String ip;
	private Integer port;
    private Integer readerIdleTime;
    private Integer minReadBufferSize;
    private Integer maxReadBufferSize;

}
