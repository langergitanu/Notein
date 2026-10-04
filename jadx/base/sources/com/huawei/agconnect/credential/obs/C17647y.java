package com.huawei.agconnect.credential.obs;

import android.text.TextUtils;
import com.huawei.agconnect.AGConnectInstance;
import com.huawei.agconnect.common.api.Logger;
import com.huawei.agconnect.common.api.PackageUtils;
import okhttp3.Interceptor;
import okhttp3.Request;
import okhttp3.Response;

/* JADX INFO: renamed from: com.huawei.agconnect.credential.obs.y */
/* JADX INFO: loaded from: classes8.dex */
public class C17647y implements Interceptor {

    /* JADX INFO: renamed from: a */
    private static final String f52209a = "ApiKeyInterceptor";

    /* JADX INFO: renamed from: b */
    private AGConnectInstance f52210b;

    public C17647y(AGConnectInstance aGConnectInstance) {
        this.f52210b = aGConnectInstance;
    }

    @Override // okhttp3.Interceptor
    public Response intercept(Interceptor.Chain chain) {
        String installedAppSign256 = PackageUtils.getInstalledAppSign256(this.f52210b.getContext(), this.f52210b.getContext().getPackageName());
        String string = this.f52210b.getOptions().getString("/client/api_key");
        if (TextUtils.isEmpty(string) || TextUtils.isEmpty(installedAppSign256)) {
            Logger.m75327e(f52209a, "no apikey or fingerPrinter");
        }
        Request.Builder builderOooO00o = chain.getF124446OooO0o0().OooO00o();
        builderOooO00o.OooO00o("x-apik", string);
        builderOooO00o.OooO00o("x-cert-fp", installedAppSign256);
        builderOooO00o.f124246OooO0OO.OooO0Oo("client_id");
        builderOooO00o.f124246OooO0OO.OooO0Oo("Authorization");
        return chain.OooO00o(builderOooO00o.OooO0O0());
    }
}
