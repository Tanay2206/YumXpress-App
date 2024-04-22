/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Yumxpress.pojo;

import java.awt.Image;

/**
 *
 * @author Tanay Waghmare
 */
public class OrderPojo {

    public OrderPojo(String orderId, String companyName, String companyEmailId, String productName, double productPrice, Image productImage, String customerName, String customerPhoneNo, String customerAddress, String deliveryStaffName, String status, String review, int otp) {
        this.orderId = orderId;
        this.companyName = companyName;
        this.companyEmailId = companyEmailId;
        this.productName = productName;
        this.productPrice = productPrice;
        this.productImage = productImage;
        this.customerName = customerName;
        this.customerPhoneNo = customerPhoneNo;
        this.customerAddress = customerAddress;
        this.deliveryStaffName = deliveryStaffName;
        this.status = status;
        this.review = review;
        this.otp = otp;
    }
    public OrderPojo(){
        
    }

    @Override
    public String toString() {
        return "OrderPojo{" + "orderId=" + orderId + ", companyName=" + companyName + ", companyEmailId=" + companyEmailId + ", productName=" + productName + ", productPrice=" + productPrice + ", productImage=" + productImage + ", customerName=" + customerName + ", customerPhoneNo=" + customerPhoneNo + ", customerAddress=" + customerAddress + ", deliveryStaffName=" + deliveryStaffName + ", status=" + status + ", review=" + review + ", otp=" + otp + '}';
    }

    public String getOrderId() {
        return orderId;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public String getCompanyEmailId() {
        return companyEmailId;
    }

    public void setCompanyEmailId(String companyEmailId) {
        this.companyEmailId = companyEmailId;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public double getProductPrice() {
        return productPrice;
    }

    public void setProductPrice(double productPrice) {
        this.productPrice = productPrice;
    }

    public Image getProductImage() {
        return productImage;
    }

    public void setProductImage(Image productImage) {
        this.productImage = productImage;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getCustomerPhoneNo() {
        return customerPhoneNo;
    }

    public void setCustomerPhoneNo(String customerPhoneNo) {
        this.customerPhoneNo = customerPhoneNo;
    }

    public String getCustomerAddress() {
        return customerAddress;
    }

    public void setCustomerAddress(String customerAddress) {
        this.customerAddress = customerAddress;
    }

    public String getDeliveryStaffName() {
        return deliveryStaffName;
    }

    public void setDeliveryStaffName(String deliveryStaffName) {
        this.deliveryStaffName = deliveryStaffName;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getReview() {
        return review;
    }

    public void setReview(String review) {
        this.review = review;
    }

    public int getOtp() {
        return otp;
    }

    public void setOtp(int otp) {
        this.otp = otp;
    }
    private String orderId;
    private String companyName;
    private String companyEmailId;
    private String productName;
    private double productPrice;
    private Image productImage;
    private String customerName;
    private String customerPhoneNo;
    private String customerAddress;
    private String deliveryStaffName;
    private String status;
    private String review;
    private int otp;
}
