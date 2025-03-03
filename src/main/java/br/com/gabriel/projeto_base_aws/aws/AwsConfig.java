package br.com.gabriel.projeto_base_aws.aws;

import com.amazonaws.auth.DefaultAWSCredentialsProviderChain;
import com.amazonaws.regions.Regions;
import com.amazonaws.services.s3.AmazonS3;
import com.amazonaws.services.s3.AmazonS3ClientBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AwsConfig {

	@Bean
	public AmazonS3 amazonS3() {
		return AmazonS3ClientBuilder.standard().withCredentials(DefaultAWSCredentialsProviderChain.getInstance())
				.withRegion(Regions.US_EAST_1).build();
	}
}
