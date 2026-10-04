package com.alipay.apmobilesecuritysdk.face;

import android.content.Context;
import com.alipay.apmobilesecuritysdk.otherid.UmidSdkWrapper;
import com.alipay.apmobilesecuritysdk.otherid.UtdidWrapper;
import com.alipay.apmobilesecuritysdk.p005a.C0175a;
import com.alipay.apmobilesecuritysdk.p006b.C0176a;
import com.alipay.apmobilesecuritysdk.p009e.C0185a;
import com.alipay.apmobilesecuritysdk.p009e.C0188d;
import com.alipay.apmobilesecuritysdk.p009e.C0191g;
import com.alipay.apmobilesecuritysdk.p009e.C0192h;
import com.alipay.apmobilesecuritysdk.p009e.C0193i;
import com.alipay.apmobilesecuritysdk.p010f.C0195b;
import com.hihonor.honorid.core.data.TmemberRight;
import java.util.HashMap;
import java.util.Map;
import o0000OoO.C24224OooO00o;

/* JADX INFO: loaded from: classes.dex */
public class APSecuritySdk {

    /* JADX INFO: renamed from: a */
    public static APSecuritySdk f157a;

    /* JADX INFO: renamed from: c */
    public static Object f158c = new Object();

    /* JADX INFO: renamed from: b */
    public Context f159b;

    public interface InitResultListener {
        void onResult(TokenResult tokenResult);
    }

    public class TokenResult {
        public String apdid;
        public String apdidToken;
        public String clientKey;
        public String umidToken;

        public TokenResult() {
        }
    }

    public APSecuritySdk(Context context) {
        this.f159b = context;
    }

    public static APSecuritySdk getInstance(Context context) {
        if (f157a == null) {
            synchronized (f158c) {
                try {
                    if (f157a == null) {
                        f157a = new APSecuritySdk(context);
                    }
                } finally {
                }
            }
        }
        return f157a;
    }

    public static String getUtdid(Context context) {
        return UtdidWrapper.getUtdid(context);
    }

    public String getApdidToken() {
        String strM123a = C0175a.m123a(this.f159b, "");
        if (C24224OooO00o.OooO0O0(strM123a)) {
            initToken(0, new HashMap(), null);
        }
        return strM123a;
    }

    public String getSdkName() {
        return "APPSecuritySDK-ALIPAYSDK";
    }

    public String getSdkVersion() {
        return "3.4.0.202206130311";
    }

    public synchronized TokenResult getTokenResult() {
        TokenResult tokenResult;
        tokenResult = new TokenResult();
        try {
            tokenResult.apdidToken = C0175a.m123a(this.f159b, "");
            tokenResult.clientKey = C0192h.m192f(this.f159b);
            tokenResult.apdid = C0175a.m122a(this.f159b);
            tokenResult.umidToken = UmidSdkWrapper.getSecurityToken(this.f159b);
            if (C24224OooO00o.OooO0O0(tokenResult.apdid) || C24224OooO00o.OooO0O0(tokenResult.apdidToken) || C24224OooO00o.OooO0O0(tokenResult.clientKey)) {
                initToken(0, new HashMap(), null);
            }
        } catch (Throwable unused) {
        }
        return tokenResult;
    }

    public void initToken(int i, Map<String, String> map, final InitResultListener initResultListener) {
        C0176a.m129a().m131a(i);
        String strM184b = C0192h.m184b(this.f159b);
        String strM133c = C0176a.m129a().m133c();
        if (C24224OooO00o.OooO0Oo(strM184b) && !C24224OooO00o.OooO0OO(strM184b, strM133c)) {
            C0185a.m152a(this.f159b);
            C0188d.m159a(this.f159b);
            C0191g.m177a(this.f159b);
            C0193i.m213h();
        }
        if (!C24224OooO00o.OooO0OO(strM184b, strM133c)) {
            C0192h.m186c(this.f159b, strM133c);
        }
        String strOooO00o = C24224OooO00o.OooO00o("utdid", map);
        String strOooO00o2 = C24224OooO00o.OooO00o("tid", map);
        String strOooO00o3 = C24224OooO00o.OooO00o(TmemberRight.TAG_USERID, map);
        if (C24224OooO00o.OooO0O0(strOooO00o)) {
            strOooO00o = UtdidWrapper.getUtdid(this.f159b);
        }
        final HashMap map2 = new HashMap();
        map2.put("utdid", strOooO00o);
        map2.put("tid", strOooO00o2);
        map2.put(TmemberRight.TAG_USERID, strOooO00o3);
        map2.put("appName", "");
        map2.put("appKeyClient", "");
        map2.put("appchannel", "");
        map2.put("rpcVersion", "8");
        C0195b.m218a().m221a(new Runnable() { // from class: com.alipay.apmobilesecuritysdk.face.APSecuritySdk.1
            @Override // java.lang.Runnable
            public void run() {
                new C0175a(APSecuritySdk.this.f159b).m128a(map2);
                InitResultListener initResultListener2 = initResultListener;
                if (initResultListener2 != null) {
                    initResultListener2.onResult(APSecuritySdk.this.getTokenResult());
                }
            }
        });
    }
}
