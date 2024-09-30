package com.thinkconstructive.rest_demo.service;

import com.thinkconstructive.rest_demo.model.CloudVendor;

import java.util.List;

public interface CloudVendorService {
    public String createCloudVendor(CloudVendor cloudVendor);
    public CloudVendor getCloudVendor(String cloudVendorId);
    public List<CloudVendor> getAllCloudVendors();
    public String deleteCloudVendor(String cloudVendorId);
    public String updateCloudVendor(CloudVendor cloudVendor);

}
