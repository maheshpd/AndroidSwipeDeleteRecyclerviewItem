package com.example.androidswipedeleterecyclerviewitem;

import com.example.androidswipedeleterecyclerviewitem.Remote.IMenuRequest;
import com.example.androidswipedeleterecyclerviewitem.Remote.RetrofitClient;

public class Common {
    public static IMenuRequest getMenuRequest()
    {
        return RetrofitClient.getClient("https://api.androidhive.info/").create(IMenuRequest.class);
    }
}
