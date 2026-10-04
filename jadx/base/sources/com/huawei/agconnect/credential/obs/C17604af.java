package com.huawei.agconnect.credential.obs;

import android.content.Context;
import com.huawei.agconnect.credential.Server;
import java.util.Collections;
import okhttp3.HttpUrl;
import okhttp3.Interceptor;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;

/* JADX INFO: renamed from: com.huawei.agconnect.credential.obs.af */
/* JADX INFO: loaded from: classes8.dex */
public class C17604af {

    /* JADX INFO: renamed from: a */
    private final C17602ad f52105a;

    /* JADX INFO: renamed from: b */
    private Boolean f52106b = Boolean.FALSE;

    /* JADX INFO: renamed from: c */
    private OkHttpClient f52107c;

    public C17604af(Context context, C17602ad c17602ad) {
        this.f52105a = c17602ad;
        m75460a(context);
    }

    /* JADX INFO: renamed from: b */
    public C17602ad m75463b() {
        return this.f52105a;
    }

    /* JADX INFO: renamed from: c */
    public Boolean m75464c() {
        return this.f52106b;
    }

    /* JADX INFO: renamed from: a */
    public OkHttpClient m75462a() {
        return this.f52107c;
    }

    /* JADX INFO: renamed from: a */
    private void m75460a(Context context) {
        this.f52107c = new C17600ab(context, Collections.singletonList(new Interceptor() { // from class: com.huawei.agconnect.credential.obs.af.1
            @Override // okhttp3.Interceptor
            public Response intercept(Interceptor.Chain chain) {
                Request f124446OooO0o0 = chain.getF124446OooO0o0();
                StringBuilder sb = new StringBuilder();
                sb.append(f124446OooO0o0.f124238OooO00o.f124129OooO00o);
                sb.append("://");
                HttpUrl httpUrl = f124446OooO0o0.f124238OooO00o;
                sb.append(httpUrl.f124132OooO0Oo);
                String string = sb.toString();
                if (!Server.f52054GW.equals(string)) {
                    return chain.OooO00o(f124446OooO0o0);
                }
                String strReplace = httpUrl.f124128OooO.replace(string, "https://" + C17604af.this.f52105a.m75440c());
                Request.Builder builderOooO00o = f124446OooO0o0.OooO00o();
                builderOooO00o.OooO0o(strReplace);
                Request requestOooO0O0 = builderOooO00o.OooO0O0();
                if (!C17604af.this.f52106b.booleanValue()) {
                    C17604af.this.f52106b = Boolean.TRUE;
                }
                return chain.OooO00o(requestOooO0O0);
            }
        }), true).m75428a();
    }
}
