package com.palash.stockvisorapp.NetworkStatusCheck;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.util.Log;
import android.widget.Toast;

public class Internet extends BroadcastReceiver
{

    @Override
    public void onReceive(final Context context, Intent intent)
    {
        if (intent.getAction().equalsIgnoreCase("android.net.conn.CONNECTIVITY_CHANGE"))
        {
            if (isInternet(context)){

                // Your Code
                Toast.makeText(context, "This is true", Toast.LENGTH_SHORT).show();
                Log.d("Netssss","true");
            }else {
                Toast.makeText(context, "This is false", Toast.LENGTH_SHORT).show();
                Log.d("Netssss","false");
            }
        }
    }

    public boolean isInternet(Context context)
    {
        ConnectivityManager IM = (ConnectivityManager) context.getSystemService(Context.CONNECTIVITY_SERVICE);
        NetworkInfo activeNetworkInfo = IM.getActiveNetworkInfo();
        return activeNetworkInfo != null;
    }
}
