package com.huawei.agconnect.common.api;

import android.content.Context;
import com.huawei.agconnect.credential.obs.C17600ab;
import java.util.List;
import okhttp3.Interceptor;
import okhttp3.OkHttpClient;

/* JADX INFO: loaded from: classes8.dex */
public class Client {
    public static OkHttpClient build(Context context, List<Interceptor> list) {
        return new C17600ab(context, list, false).m75428a();
    }

    public static OkHttpClient build(Context context, List<Interceptor> list, boolean z) {
        return new C17600ab(context, list, z).m75428a();
    }
}
