package com.huawei.hms.framework.network.grs.p582h.p584g;

import android.content.Context;
import com.huawei.hms.framework.network.grs.GrsApp;
import java.io.IOException;
import java.security.KeyManagementException;
import java.security.NoSuchAlgorithmException;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLSocketFactory;
import o0O00oO0.C25848OooO0o0;
import o0O00oO0.C25849OooO0oO;
import o0O0O0O.OooO00o;

/* JADX INFO: renamed from: com.huawei.hms.framework.network.grs.h.g.a */
/* JADX INFO: loaded from: classes7.dex */
public class C17961a {

    /* JADX INFO: renamed from: a */
    private static final HostnameVerifier f53755a = new OooO00o();

    /* JADX INFO: renamed from: a */
    public static HostnameVerifier m77163a() {
        return f53755a;
    }

    /* JADX INFO: renamed from: a */
    public static SSLSocketFactory m77164a(Context context) {
        try {
            return new C25848OooO0o0(new C25849OooO0oO(context.getAssets().open(GrsApp.getInstance().getBrand("/") + "grs_sp.bks")));
        } catch (IOException | KeyManagementException | NoSuchAlgorithmException e) {
            throw new AssertionError(e);
        }
    }
}
