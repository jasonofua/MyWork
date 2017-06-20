package com.example.cessaaliezi.ug.lists;

/**
 * Created by Cessa Aliezi on 18/06/2017.
 */

public class RowItem {
    private String customerName;
    private int profile_pic;

    public RowItem(String customerName, int profile_pic) {
        this.customerName = customerName;
        this.profile_pic = profile_pic;
    }

    public String getCustomerName() {
        return customerName;
    }


    public int getProfile_pic() {
        return profile_pic;
    }


}
