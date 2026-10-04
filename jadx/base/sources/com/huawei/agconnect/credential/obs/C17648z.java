package com.huawei.agconnect.credential.obs;

import android.content.Context;
import android.text.TextUtils;
import com.huawei.agconnect.AGConnectOptions;
import com.huawei.agconnect.common.api.BaseResponse;
import com.huawei.agconnect.common.api.Logger;
import com.huawei.agconnect.exception.AGCNetworkException;
import com.huawei.agconnect.exception.AGCServerException;
import com.huawei.agconnect.https.Adapter;
import com.huawei.agconnect.https.HttpsException;
import com.huawei.agconnect.https.HttpsKit;
import com.huawei.agconnect.https.HttpsResult;
import com.huawei.agconnect.https.Method;
import com.huawei.agconnect.https.adapter.JsonAdapterFactory;
import java.security.InvalidParameterException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.TimeUnit;
import o0O00OOO.C25834OooO0oO;
import o0O00OOO.C25835OooO0oo;
import o0O00OOO.InterfaceC25832OooO0Oo;
import o0O00OOO.InterfaceC25833OooO0o0;
import o0O00OOO.OooO0o;
import okhttp3.Authenticator;
import okhttp3.Interceptor;

/* JADX INFO: renamed from: com.huawei.agconnect.credential.obs.z */
/* JADX INFO: loaded from: classes8.dex */
public class C17648z {

    /* JADX INFO: renamed from: a */
    private static final String f52211a = "BackendImpl";

    /* JADX INFO: renamed from: b */
    private static final long f52212b = 5000;

    /* JADX INFO: renamed from: c */
    private static final C17648z f52213c = new C17648z();

    /* JADX INFO: renamed from: d */
    private static final ExecutorService f52214d = C17606ah.m75466a();

    /* JADX INFO: renamed from: e */
    private final Map<C17602ad, C17604af> f52215e = new HashMap();

    /* JADX INFO: renamed from: f */
    private final Adapter.Factory f52216f = new JsonAdapterFactory();

    private C17648z() {
    }

    /* JADX INFO: renamed from: a */
    public static C17648z m75619a() {
        return f52213c;
    }

    /* JADX INFO: renamed from: b */
    public Map<C17602ad, C17604af> m75625b() {
        return this.f52215e;
    }

    /* JADX INFO: renamed from: a */
    private HttpsKit m75620a(Context context, List<Interceptor> list, Authenticator authenticator, long j, TimeUnit timeUnit) {
        if (j == 0) {
            timeUnit = TimeUnit.MILLISECONDS;
            j = 5000;
        }
        return new HttpsKit.Builder().client(new C17600ab(context, Collections.unmodifiableList(list), true).m75427a(authenticator).m75429a(j, timeUnit)).executor(f52214d).build();
    }

    /* JADX INFO: renamed from: a */
    private <Req> Method m75621a(Req req, int i, Adapter.Factory factory) {
        return i == 1 ? new Method.Post(req, factory) : i == 2 ? new Method.Put(req, factory) : new Method.Get(req);
    }

    /* JADX INFO: renamed from: a */
    public <Req, Rsp> OooO0o<Rsp> m75622a(Req req, int i, Class<Rsp> cls, AGConnectOptions aGConnectOptions) {
        return m75623a(req, i, cls, this.f52216f, 5000L, TimeUnit.MILLISECONDS, null, null, aGConnectOptions);
    }

    /* JADX INFO: renamed from: a */
    public <Req, Rsp> OooO0o<Rsp> m75623a(Req req, int i, final Class<Rsp> cls, Adapter.Factory factory, long j, TimeUnit timeUnit, List<Interceptor> list, Authenticator authenticator, AGConnectOptions aGConnectOptions) {
        final Adapter.Factory factory2 = factory != null ? factory : this.f52216f;
        String string = aGConnectOptions.getString("agcgw/url");
        String string2 = aGConnectOptions.getString("agcgw/backurl");
        if (TextUtils.isEmpty(string) && TextUtils.isEmpty(string2)) {
            throw new InvalidParameterException("url is null");
        }
        Context contextM75471b = C17607ai.m75467a().m75471b();
        final C25834OooO0oO c25834OooO0oO = new C25834OooO0oO();
        OooO0o<Rsp> oooO0o = c25834OooO0oO.f88150OooO00o;
        if (contextM75471b == null) {
            c25834OooO0oO.OooO00o(new AGCServerException("context is error", 4));
            return oooO0o;
        }
        ArrayList arrayList = new ArrayList();
        if (list != null) {
            arrayList.addAll(list);
        } else {
            arrayList.add(new C17605ag(string, string2));
        }
        OooO0o<HttpsResult> oooO0oExecute = m75620a(contextM75471b, arrayList, authenticator, j, timeUnit).create(contextM75471b).execute(m75621a(req, i, factory2));
        C25835OooO0oo c25835OooO0oo = C25835OooO0oo.f88151OooO0Oo;
        oooO0oExecute.OooO0Oo(c25835OooO0oo.f88152OooO00o, new InterfaceC25833OooO0o0<HttpsResult>() { // from class: com.huawei.agconnect.credential.obs.z.2
            @Override // o0O00OOO.InterfaceC25833OooO0o0
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public void onSuccess(HttpsResult httpsResult) {
                Object response;
                if (httpsResult.isSuccess()) {
                    if (String.class.equals(cls)) {
                        response = httpsResult.getResponse();
                    } else {
                        try {
                            response = httpsResult.getResponse(cls, factory2);
                        } catch (RuntimeException e) {
                            c25834OooO0oO.OooO00o(e);
                            return;
                        }
                    }
                    c25834OooO0oO.OooO0O0(response);
                    return;
                }
                if (httpsResult.code() == 401) {
                    try {
                        BaseResponse baseResponse = (BaseResponse) httpsResult.getResponse(BaseResponse.class, factory2);
                        if (baseResponse != null && baseResponse.getRet() != null) {
                            c25834OooO0oO.OooO00o(new AGCServerException(httpsResult.getErrorMsg(), httpsResult.code(), baseResponse.getRet().getCode()));
                            return;
                        }
                    } catch (RuntimeException unused) {
                        Logger.m75327e(C17648z.f52211a, "get base response error");
                    }
                }
                c25834OooO0oO.OooO00o(new AGCServerException(httpsResult.getErrorMsg(), httpsResult.code()));
            }
        }).OooOO0O(c25835OooO0oo.f88152OooO00o, new InterfaceC25832OooO0Oo() { // from class: com.huawei.agconnect.credential.obs.z.1
            @Override // o0O00OOO.InterfaceC25832OooO0Oo
            public void onFailure(Exception exc) {
                c25834OooO0oO.OooO00o(exc instanceof HttpsException ? !((HttpsException) exc).hasRequest() ? new AGCNetworkException(exc.getMessage(), 0) : new AGCNetworkException(exc.getMessage(), 1) : new AGCServerException(exc.getMessage(), 2));
            }
        });
        return oooO0o;
    }

    /* JADX INFO: renamed from: a */
    public <Req, Rsp> OooO0o<Rsp> m75624a(Req req, int i, Class<Rsp> cls, List<Interceptor> list, Authenticator authenticator, AGConnectOptions aGConnectOptions) {
        return m75623a(req, i, cls, this.f52216f, 5000L, TimeUnit.MILLISECONDS, list, authenticator, aGConnectOptions);
    }
}
