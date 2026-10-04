package com.huawei.agconnect.credential.obs;

import android.text.TextUtils;
import com.huawei.agconnect.common.api.BackendService;
import com.huawei.agconnect.common.api.Logger;
import com.huawei.agconnect.credential.Server;
import com.huawei.hms.network.embedded.C18241k5;
import com.microsoft.identity.common.java.AuthenticationConstants;
import java.io.IOException;
import java.net.UnknownHostException;
import java.util.Collections;
import java.util.List;
import kotlin.jvm.internal.OooOOO0;
import okhttp3.HttpUrl;
import okhttp3.Interceptor;
import okhttp3.Request;
import okhttp3.Response;

/* JADX INFO: renamed from: com.huawei.agconnect.credential.obs.ag */
/* JADX INFO: loaded from: classes8.dex */
final class C17605ag implements Interceptor {

    /* JADX INFO: renamed from: a */
    private static final String f52109a = "UrlInterceptorV2";

    /* JADX INFO: renamed from: b */
    private List<C17602ad> f52110b;

    public C17605ag(BackendService.Options options) {
        this.f52110b = C17645w.m75607a().m75617a(options.getApp());
    }

    /* JADX INFO: renamed from: a */
    private Response m75465a(Interceptor.Chain chain, String str) throws IOException {
        String str2;
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        Request f124446OooO0o0 = chain.getF124446OooO0o0();
        String[] strArrSplit = str.split(C18241k5.f55433h);
        int i = 443;
        if (strArrSplit.length == 2) {
            try {
                i = Integer.parseInt(strArrSplit[1]);
                str2 = strArrSplit[0];
            } catch (NumberFormatException unused) {
                Logger.m75327e(f52109a, "port is error:" + i + ", use default 443");
                str2 = str;
            }
        } else {
            str2 = str;
        }
        HttpUrl.Builder builderOooO0o = f124446OooO0o0.f124238OooO00o.OooO0o();
        builderOooO0o.OooO0o(AuthenticationConstants.HTTPS_PROTOCOL_STRING);
        builderOooO0o.OooO0Oo(str2);
        if (1 > i || i >= 65536) {
            throw new IllegalArgumentException(OooOOO0.OooOOO0(Integer.valueOf(i), "unexpected port: ").toString());
        }
        builderOooO0o.f124144OooO0o0 = i;
        HttpUrl httpUrlOooO0OO = builderOooO0o.OooO0OO();
        Request.Builder builderOooO00o = f124446OooO0o0.OooO00o();
        builderOooO00o.f124244OooO00o = httpUrlOooO0OO;
        try {
            return chain.OooO00o(builderOooO00o.OooO0O0());
        } catch (IOException e) {
            if (!(e instanceof UnknownHostException)) {
                throw e;
            }
            Logger.m75327e(f52109a, "UnknownHostException".concat(str));
            return null;
        }
    }

    @Override // okhttp3.Interceptor
    public Response intercept(Interceptor.Chain chain) throws IOException {
        Request f124446OooO0o0 = chain.getF124446OooO0o0();
        C17645w.m75607a().m75618a(f124446OooO0o0.f124240OooO0OO.OooO0O0("sdkServiceName"));
        StringBuilder sb = new StringBuilder();
        HttpUrl httpUrl = f124446OooO0o0.f124238OooO00o;
        sb.append(httpUrl.f124129OooO00o);
        sb.append("://");
        sb.append(httpUrl.f124132OooO0Oo);
        if (!Server.f52054GW.equals(sb.toString()) || this.f52110b.isEmpty()) {
            return chain.OooO00o(f124446OooO0o0);
        }
        UnknownHostException unknownHostException = null;
        int i = 0;
        UnknownHostException unknownHostException2 = null;
        Response responseM75465a = null;
        while (true) {
            if (i >= this.f52110b.size()) {
                unknownHostException = unknownHostException2;
                break;
            }
            C17602ad c17602ad = this.f52110b.get(i);
            if (!TextUtils.isEmpty(c17602ad.m75442e())) {
                return m75465a(chain, c17602ad.m75440c());
            }
            String strM75435a = c17602ad.m75435a();
            String strM75439b = c17602ad.m75439b();
            Response responseM75465a2 = m75465a(chain, strM75435a);
            if (responseM75465a2 == null) {
                responseM75465a = m75465a(chain, strM75439b);
                if (responseM75465a != null) {
                    c17602ad.m75438a(strM75439b, true);
                    break;
                }
                unknownHostException2 = new UnknownHostException("no host can access");
                i++;
            } else {
                c17602ad.m75438a(strM75435a, false);
                responseM75465a = responseM75465a2;
                break;
            }
        }
        if (unknownHostException == null) {
            return responseM75465a;
        }
        throw unknownHostException;
    }

    public C17605ag(String str, String str2) {
        this.f52110b = Collections.singletonList(new C17602ad(str, str2));
    }
}
