package com.huawei.agconnect.core.p569a;

import android.content.Context;
import android.util.Log;
import com.huawei.agconnect.AGCRoutePolicy;
import com.huawei.agconnect.AGConnectInstance;
import com.huawei.agconnect.AGConnectOptions;
import com.huawei.agconnect.AGConnectOptionsBuilder;
import com.huawei.agconnect.CustomAuthProvider;
import com.huawei.agconnect.CustomCredentialsProvider;
import com.huawei.agconnect.JsonProcessingFactory;
import com.huawei.agconnect.config.AGConnectServicesConfig;
import com.huawei.agconnect.config.impl.C17577b;
import com.huawei.agconnect.config.impl.Utils;
import com.huawei.agconnect.core.Service;
import com.huawei.agconnect.core.service.auth.AuthProvider;
import com.huawei.agconnect.core.service.auth.CredentialsProvider;
import com.huawei.agconnect.core.service.auth.OnTokenListener;
import com.huawei.agconnect.core.service.auth.Token;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.nio.charset.Charset;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import o0O00OOO.OooO0o;

/* JADX INFO: renamed from: com.huawei.agconnect.core.a.b */
/* JADX INFO: loaded from: classes8.dex */
public class C17593b extends AGConnectInstance {

    /* JADX INFO: renamed from: a */
    private static List<Service> f52039a;

    /* JADX INFO: renamed from: b */
    private static final Map<String, AGConnectInstance> f52040b = new HashMap();

    /* JADX INFO: renamed from: c */
    private static String f52041c;

    /* JADX INFO: renamed from: d */
    private final AGConnectOptions f52042d;

    /* JADX INFO: renamed from: e */
    private final C17595d f52043e;

    /* JADX INFO: renamed from: f */
    private final C17595d f52044f;

    public C17593b(AGConnectOptions aGConnectOptions) {
        Log.d("AGC_Instance", "AGConnectInstanceImpl init");
        this.f52042d = aGConnectOptions;
        if (f52039a == null) {
            Log.e("AGC_Instance", "please call `initialize()` first");
        }
        this.f52043e = new C17595d(f52039a, aGConnectOptions.getContext());
        C17595d c17595d = new C17595d(null, aGConnectOptions.getContext());
        this.f52044f = c17595d;
        if (aGConnectOptions instanceof C17577b) {
            c17595d.m75407a(((C17577b) aGConnectOptions).m75351a(), aGConnectOptions.getContext());
        }
        Log.d("AGC_Instance", "AGConnectInstanceImpl init end");
    }

    /* JADX INFO: renamed from: a */
    public static AGConnectInstance m75387a() {
        String str = f52041c;
        return str == null ? m75390a(Utils.DEFAULT_NAME) : m75390a(str);
    }

    /* JADX INFO: renamed from: b */
    private static void m75394b() {
        JsonProcessingFactory.registerProcessor("/agcgw/url", new JsonProcessingFactory.JsonProcessor() { // from class: com.huawei.agconnect.core.a.b.1
            @Override // com.huawei.agconnect.JsonProcessingFactory.JsonProcessor
            public String processOption(AGConnectOptions aGConnectOptions) {
                String str;
                if (aGConnectOptions.getRoutePolicy().equals(AGCRoutePolicy.CHINA)) {
                    str = "/agcgw_all/CN";
                } else if (aGConnectOptions.getRoutePolicy().equals(AGCRoutePolicy.RUSSIA)) {
                    str = "/agcgw_all/RU";
                } else if (aGConnectOptions.getRoutePolicy().equals(AGCRoutePolicy.GERMANY)) {
                    str = "/agcgw_all/DE";
                } else {
                    if (!aGConnectOptions.getRoutePolicy().equals(AGCRoutePolicy.SINGAPORE)) {
                        return null;
                    }
                    str = "/agcgw_all/SG";
                }
                return aGConnectOptions.getString(str);
            }
        });
        JsonProcessingFactory.registerProcessor("/agcgw/backurl", new JsonProcessingFactory.JsonProcessor() { // from class: com.huawei.agconnect.core.a.b.2
            @Override // com.huawei.agconnect.JsonProcessingFactory.JsonProcessor
            public String processOption(AGConnectOptions aGConnectOptions) {
                String str;
                if (aGConnectOptions.getRoutePolicy().equals(AGCRoutePolicy.CHINA)) {
                    str = "/agcgw_all/CN_back";
                } else if (aGConnectOptions.getRoutePolicy().equals(AGCRoutePolicy.RUSSIA)) {
                    str = "/agcgw_all/RU_back";
                } else if (aGConnectOptions.getRoutePolicy().equals(AGCRoutePolicy.GERMANY)) {
                    str = "/agcgw_all/DE_back";
                } else {
                    if (!aGConnectOptions.getRoutePolicy().equals(AGCRoutePolicy.SINGAPORE)) {
                        return null;
                    }
                    str = "/agcgw_all/SG_back";
                }
                return aGConnectOptions.getString(str);
            }
        });
    }

    @Override // com.huawei.agconnect.AGConnectInstance
    public Context getContext() {
        return this.f52042d.getContext();
    }

    @Override // com.huawei.agconnect.AGConnectInstance
    public String getIdentifier() {
        return this.f52042d.getIdentifier();
    }

    @Override // com.huawei.agconnect.AGConnectInstance
    public AGConnectOptions getOptions() {
        return this.f52042d;
    }

    @Override // com.huawei.agconnect.AGConnectInstance
    public <T> T getService(Class<? super T> cls) {
        T t = (T) this.f52044f.m75406a(this, cls);
        return t != null ? t : (T) this.f52043e.m75406a(this, cls);
    }

    /* JADX INFO: renamed from: a */
    public static AGConnectInstance m75388a(AGConnectOptions aGConnectOptions) {
        return m75389a(aGConnectOptions, false);
    }

    /* JADX INFO: renamed from: b */
    private static void m75395b(Context context, AGConnectOptionsBuilder aGConnectOptionsBuilder) {
        AGConnectServicesConfig aGConnectServicesConfigFromContext = AGConnectServicesConfig.fromContext(context);
        if (aGConnectOptionsBuilder.getInputStream() != null) {
            try {
                String string = Utils.toString(aGConnectOptionsBuilder.getInputStream(), "UTF-8");
                aGConnectOptionsBuilder.getInputStream().reset();
                aGConnectServicesConfigFromContext.overlayWith(new ByteArrayInputStream(string.getBytes(Charset.forName("UTF-8"))));
            } catch (IOException unused) {
                Log.e("AGC_Instance", "input stream set to AGConnectServicesConfig fail");
            }
        }
        for (Map.Entry<String, String> entry : aGConnectOptionsBuilder.getCustomConfigMap().entrySet()) {
            aGConnectServicesConfigFromContext.setParam(entry.getKey(), entry.getValue());
        }
        if (aGConnectOptionsBuilder.getRoutePolicy() != AGCRoutePolicy.UNKNOWN) {
            aGConnectServicesConfigFromContext.setRoutePolicy(aGConnectOptionsBuilder.getRoutePolicy());
        }
    }

    /* JADX INFO: renamed from: a */
    private static synchronized AGConnectInstance m75389a(AGConnectOptions aGConnectOptions, boolean z) {
        AGConnectInstance c17593b;
        Map<String, AGConnectInstance> map = f52040b;
        c17593b = map.get(aGConnectOptions.getIdentifier());
        if (c17593b == null || z) {
            c17593b = new C17593b(aGConnectOptions);
            map.put(aGConnectOptions.getIdentifier(), c17593b);
        }
        return c17593b;
    }

    /* JADX INFO: renamed from: a */
    public static synchronized AGConnectInstance m75390a(String str) {
        AGConnectInstance aGConnectInstance;
        try {
            aGConnectInstance = f52040b.get(str);
            if (aGConnectInstance == null) {
                if (Utils.DEFAULT_NAME.equals(str)) {
                    Log.w("AGC_Instance", "please call `initialize()` first");
                } else {
                    Log.w("AGC_Instance", "not find instance for : " + str);
                }
            }
        } catch (Throwable th) {
            throw th;
        }
        return aGConnectInstance;
    }

    /* JADX INFO: renamed from: a */
    public static synchronized void m75391a(Context context) {
        Log.w("AGC_Instance", "agc sdk initialize");
        if (f52040b.size() > 0) {
            Log.w("AGC_Instance", "Repeated invoking initialize");
        } else {
            m75392a(context, AGConnectServicesConfig.fromContext(context));
        }
    }

    /* JADX INFO: renamed from: a */
    private static synchronized void m75392a(Context context, AGConnectOptions aGConnectOptions) {
        try {
            Context applicationContext = context.getApplicationContext();
            if (applicationContext == null) {
                Log.w("AGC_Instance", "context.getApplicationContext null");
            } else {
                context = applicationContext;
            }
            m75394b();
            if (f52039a == null) {
                f52039a = new C17594c(context).m75401a();
            }
            m75389a(aGConnectOptions, true);
            f52041c = aGConnectOptions.getIdentifier();
            Log.i("AGC_Instance", "initFinish callback start");
            C17592a.m75386a();
            Log.i("AGC_Instance", "AGC SDK initialize end");
        } catch (Throwable th) {
            throw th;
        }
    }

    /* JADX INFO: renamed from: a */
    public static synchronized void m75393a(Context context, AGConnectOptionsBuilder aGConnectOptionsBuilder) {
        m75395b(context, aGConnectOptionsBuilder);
        m75392a(context, aGConnectOptionsBuilder.build(context));
    }

    /* JADX INFO: renamed from: a */
    public void m75396a(final CustomAuthProvider customAuthProvider) {
        this.f52044f.m75407a(Collections.singletonList(Service.builder((Class<?>) AuthProvider.class, new AuthProvider() { // from class: com.huawei.agconnect.core.a.b.4
            @Override // com.huawei.agconnect.core.service.auth.AuthProvider
            public void addTokenListener(OnTokenListener onTokenListener) {
            }

            @Override // com.huawei.agconnect.core.service.auth.AuthProvider
            public OooO0o<Token> getTokens() {
                return customAuthProvider.getTokens(false);
            }

            @Override // com.huawei.agconnect.core.service.auth.AuthProvider
            public String getUid() {
                return "";
            }

            @Override // com.huawei.agconnect.core.service.auth.AuthProvider
            public void removeTokenListener(OnTokenListener onTokenListener) {
            }

            @Override // com.huawei.agconnect.core.service.auth.AuthProvider
            public OooO0o<Token> getTokens(boolean z) {
                return customAuthProvider.getTokens(z);
            }
        }).build()), this.f52042d.getContext());
    }

    /* JADX INFO: renamed from: a */
    public void m75397a(final CustomCredentialsProvider customCredentialsProvider) {
        this.f52044f.m75407a(Collections.singletonList(Service.builder((Class<?>) CredentialsProvider.class, new CredentialsProvider() { // from class: com.huawei.agconnect.core.a.b.3
            @Override // com.huawei.agconnect.core.service.auth.CredentialsProvider
            public OooO0o<Token> getTokens() {
                return customCredentialsProvider.getTokens(false);
            }

            @Override // com.huawei.agconnect.core.service.auth.CredentialsProvider
            public OooO0o<Token> getTokens(boolean z) {
                return customCredentialsProvider.getTokens(z);
            }
        }).build()), this.f52042d.getContext());
    }
}
