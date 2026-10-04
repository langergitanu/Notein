package com.huawei.agconnect.https.connector;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.util.Log;

/* JADX INFO: renamed from: com.huawei.agconnect.https.connector.a */
/* JADX INFO: loaded from: classes8.dex */
public class C17662a implements Connector {

    /* JADX INFO: renamed from: a */
    private static final Object f52248a = new Object();

    /* JADX INFO: renamed from: b */
    private static C17662a f52249b;

    /* JADX INFO: renamed from: c */
    private final Context f52250c;

    private C17662a(Context context) {
        Context applicationContext = context.getApplicationContext();
        this.f52250c = applicationContext != null ? applicationContext : context;
    }

    /* JADX INFO: renamed from: a */
    public static C17662a m75645a(Context context) {
        C17662a c17662a;
        synchronized (f52248a) {
            try {
                if (f52249b == null) {
                    f52249b = new C17662a(context);
                }
                c17662a = f52249b;
            } catch (Throwable th) {
                throw th;
            }
        }
        return c17662a;
    }

    @Override // com.huawei.agconnect.https.connector.Connector
    public boolean hasActiveNetwork() {
        ConnectivityManager connectivityManager;
        NetworkInfo activeNetworkInfo;
        Context context = this.f52250c;
        return (context == null || (connectivityManager = (ConnectivityManager) context.getSystemService("connectivity")) == null || (activeNetworkInfo = connectivityManager.getActiveNetworkInfo()) == null || !activeNetworkInfo.isConnected()) ? false : true;
    }

    @Override // com.huawei.agconnect.https.connector.Connector
    public void logger(String str, String str2) {
        Log.d(str, str2);
    }
}
