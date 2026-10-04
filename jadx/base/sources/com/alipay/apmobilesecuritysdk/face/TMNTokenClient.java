package com.alipay.apmobilesecuritysdk.face;

import android.content.Context;
import com.alipay.apmobilesecuritysdk.otherid.UtdidWrapper;
import com.alipay.apmobilesecuritysdk.p005a.C0175a;
import com.alipay.apmobilesecuritysdk.p010f.C0195b;
import com.hihonor.honorid.core.data.TmemberRight;
import java.util.HashMap;
import o0000OoO.C24224OooO00o;

/* JADX INFO: loaded from: classes.dex */
public class TMNTokenClient {

    /* JADX INFO: renamed from: a */
    public static TMNTokenClient f164a;

    /* JADX INFO: renamed from: b */
    public Context f165b;

    public interface InitResultListener {
        void onResult(String str, int i);
    }

    public TMNTokenClient(Context context) {
        this.f165b = null;
        if (context == null) {
            throw new IllegalArgumentException("TMNTokenClient initialization error: context is null.");
        }
        this.f165b = context;
    }

    public static TMNTokenClient getInstance(Context context) {
        if (f164a == null) {
            synchronized (TMNTokenClient.class) {
                try {
                    if (f164a == null) {
                        f164a = new TMNTokenClient(context);
                    }
                } finally {
                }
            }
        }
        return f164a;
    }

    public void intiToken(final String str, String str2, String str3, final InitResultListener initResultListener) {
        if (C24224OooO00o.OooO0O0(str) && initResultListener != null) {
            initResultListener.onResult("", 2);
        }
        if (C24224OooO00o.OooO0O0(str2) && initResultListener != null) {
            initResultListener.onResult("", 3);
        }
        final HashMap map = new HashMap();
        map.put("utdid", UtdidWrapper.getUtdid(this.f165b));
        map.put("tid", "");
        map.put(TmemberRight.TAG_USERID, "");
        map.put("appName", str);
        map.put("appKeyClient", str2);
        map.put("appchannel", "openapi");
        map.put("sessionId", str3);
        map.put("rpcVersion", "8");
        C0195b.m218a().m221a(new Runnable() { // from class: com.alipay.apmobilesecuritysdk.face.TMNTokenClient.1
            @Override // java.lang.Runnable
            public void run() {
                int iM128a = new C0175a(TMNTokenClient.this.f165b).m128a(map);
                InitResultListener initResultListener2 = initResultListener;
                if (initResultListener2 == null) {
                    return;
                }
                if (iM128a != 0) {
                    initResultListener2.onResult("", iM128a);
                } else {
                    initResultListener.onResult(C0175a.m123a(TMNTokenClient.this.f165b, str), 0);
                }
            }
        });
    }
}
