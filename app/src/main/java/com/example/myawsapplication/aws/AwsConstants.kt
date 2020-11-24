package com.example.myawsapplication.aws

import com.amazonaws.regions.Regions

object AwsConstants {

    val COGNITO_IDENTITY_ID: String = "us-east-1:1553cfff-80d2-4add-8387-e4dae5d9a7ef"
    val COGNITO_REGION: Regions = Regions.US_EAST_1 // Region
    val BUCKET_NAME: String = "my-hosted-inidia"

    val S3_URL: String = "https://$BUCKET_NAME.s3.us-east-1.amazonaws.com/"
    val folderPath = "images/"

}