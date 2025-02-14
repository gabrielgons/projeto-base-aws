package br.com.gabriel.projeto_base_aws.aws.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.amazonaws.services.s3.model.Bucket;

import br.com.gabriel.projeto_base_aws.aws.S3Service;

@RestController
public class S3Controller {

	private final S3Service s3Service;

	public S3Controller(S3Service s3Service) {
		this.s3Service = s3Service;
	}

	@GetMapping("/buckets")
	public List<Bucket> listBuckets() {
		return s3Service.listBuckets();
	}
}
