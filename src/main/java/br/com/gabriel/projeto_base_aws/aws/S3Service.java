package br.com.gabriel.projeto_base_aws.aws;

import java.util.List;

import org.springframework.stereotype.Service;

import com.amazonaws.services.s3.AmazonS3;
import com.amazonaws.services.s3.model.Bucket;

@Service
public class S3Service {

    private final AmazonS3 s3client;

    public S3Service(AmazonS3 s3client) {
        this.s3client = s3client;
    }

    public List<Bucket> listBuckets() {
        return s3client.listBuckets();
    }
}
