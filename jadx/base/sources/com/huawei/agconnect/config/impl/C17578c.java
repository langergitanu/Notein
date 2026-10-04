package com.huawei.agconnect.config.impl;

import android.content.Context;
import android.util.Log;
import androidx.concurrent.futures.OooO0O0;
import com.huawei.agconnect.AGCRoutePolicy;
import com.huawei.agconnect.JsonProcessingFactory;
import com.huawei.agconnect.config.AGConnectServicesConfig;
import com.huawei.agconnect.config.ConfigReader;
import com.huawei.agconnect.config.LazyInputStream;
import java.io.InputStream;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: renamed from: com.huawei.agconnect.config.impl.c */
/* JADX INFO: loaded from: classes8.dex */
public class C17578c extends AGConnectServicesConfig {

    /* JADX INFO: renamed from: a */
    private final Context f51994a;

    /* JADX INFO: renamed from: b */
    private final String f51995b;

    /* JADX INFO: renamed from: c */
    private LazyInputStream f51996c;

    /* JADX INFO: renamed from: d */
    private volatile ConfigReader f51997d;

    /* JADX INFO: renamed from: e */
    private final Object f51998e = new Object();

    /* JADX INFO: renamed from: f */
    private AGCRoutePolicy f51999f = AGCRoutePolicy.UNKNOWN;

    /* JADX INFO: renamed from: g */
    private final Map<String, String> f52000g = new HashMap();

    /* JADX INFO: renamed from: h */
    private volatile C17580e f52001h;

    public C17578c(Context context, String str) {
        this.f51994a = context;
        this.f51995b = str;
    }

    /* JADX INFO: renamed from: a */
    private static LazyInputStream m75352a(Context context, final InputStream inputStream) {
        return new LazyInputStream(context) { // from class: com.huawei.agconnect.config.impl.c.1
            @Override // com.huawei.agconnect.config.LazyInputStream
            public InputStream get(Context context2) {
                return inputStream;
            }
        };
    }

    /* JADX INFO: renamed from: b */
    private String m75355b(String str) {
        JsonProcessingFactory.JsonProcessor jsonProcessor;
        Map<String, JsonProcessingFactory.JsonProcessor> processors = JsonProcessingFactory.getProcessors();
        if (processors.containsKey(str) && (jsonProcessor = processors.get(str)) != null) {
            return jsonProcessor.processOption(this);
        }
        return null;
    }

    @Override // com.huawei.agconnect.AGConnectOptions
    public boolean getBoolean(String str) {
        return getBoolean(str, false);
    }

    @Override // com.huawei.agconnect.AGConnectOptions
    public Context getContext() {
        return this.f51994a;
    }

    @Override // com.huawei.agconnect.AGConnectOptions
    public String getIdentifier() {
        return Utils.DEFAULT_NAME;
    }

    @Override // com.huawei.agconnect.AGConnectOptions
    public int getInt(String str) {
        return getInt(str, 0);
    }

    @Override // com.huawei.agconnect.AGConnectOptions
    public String getPackageName() {
        return this.f51995b;
    }

    @Override // com.huawei.agconnect.AGConnectOptions
    public AGCRoutePolicy getRoutePolicy() {
        Log.d("AGC_ConfigImpl", "getRoutePolicy");
        if (this.f51999f == null) {
            this.f51999f = AGCRoutePolicy.UNKNOWN;
        }
        AGCRoutePolicy aGCRoutePolicy = this.f51999f;
        AGCRoutePolicy aGCRoutePolicy2 = AGCRoutePolicy.UNKNOWN;
        if (aGCRoutePolicy == aGCRoutePolicy2 && this.f51997d == null) {
            m75354a();
        }
        AGCRoutePolicy aGCRoutePolicy3 = this.f51999f;
        return aGCRoutePolicy3 == null ? aGCRoutePolicy2 : aGCRoutePolicy3;
    }

    @Override // com.huawei.agconnect.AGConnectOptions
    public String getString(String str) {
        return getString(str, null);
    }

    @Override // com.huawei.agconnect.config.AGConnectServicesConfig
    public void overlayWith(LazyInputStream lazyInputStream) {
        this.f51996c = lazyInputStream;
    }

    @Override // com.huawei.agconnect.config.AGConnectServicesConfig
    public void setParam(String str, String str2) {
        this.f52000g.put(Utils.fixPath(str), str2);
    }

    @Override // com.huawei.agconnect.config.AGConnectServicesConfig
    public void setRoutePolicy(AGCRoutePolicy aGCRoutePolicy) {
        this.f51999f = aGCRoutePolicy;
    }

    /* JADX INFO: renamed from: a */
    private static String m75353a(String str) {
        int i = 0;
        if (str.length() > 0) {
            while (str.charAt(i) == '/') {
                i++;
            }
        }
        return OooO0O0.OooO00o(str, i, new StringBuilder("/"));
    }

    /* JADX INFO: renamed from: b */
    private void m75356b() {
        if (this.f51999f == AGCRoutePolicy.UNKNOWN) {
            if (this.f51997d != null) {
                this.f51999f = Utils.getRoutePolicyFromJson(this.f51997d.getString("/region", null), this.f51997d.getString("/agcgw/url", null));
            } else {
                Log.w("AGConnectServiceConfig", "get route fail , config not ready");
            }
        }
    }

    @Override // com.huawei.agconnect.AGConnectOptions
    public boolean getBoolean(String str, boolean z) {
        return Boolean.parseBoolean(getString(str, String.valueOf(z)));
    }

    @Override // com.huawei.agconnect.AGConnectOptions
    public int getInt(String str, int i) {
        try {
            return Integer.parseInt(getString(str, String.valueOf(i)));
        } catch (NumberFormatException unused) {
            return i;
        }
    }

    @Override // com.huawei.agconnect.AGConnectOptions
    public String getString(String str, String str2) {
        if (str == null) {
            throw new NullPointerException("path must not be null.");
        }
        if (this.f51997d == null) {
            m75354a();
        }
        String strM75353a = m75353a(str);
        String str3 = this.f52000g.get(strM75353a);
        if (str3 != null) {
            return str3;
        }
        String strM75355b = m75355b(strM75353a);
        if (strM75355b != null) {
            return strM75355b;
        }
        String string = this.f51997d.getString(strM75353a, str2);
        return C17580e.m75366a(string) ? this.f52001h.decrypt(string, str2) : string;
    }

    @Override // com.huawei.agconnect.config.AGConnectServicesConfig
    public void overlayWith(InputStream inputStream) {
        overlayWith(m75352a(this.f51994a, inputStream));
    }

    /* JADX INFO: renamed from: a */
    private void m75354a() {
        Log.d("AGC_ConfigImpl", "initConfigReader");
        if (this.f51997d == null) {
            synchronized (this.f51998e) {
                try {
                    if (this.f51997d == null) {
                        LazyInputStream lazyInputStream = this.f51996c;
                        if (lazyInputStream != null) {
                            this.f51997d = new C17584i(lazyInputStream.loadInputStream(), "UTF-8");
                            this.f51996c.close();
                            this.f51996c = null;
                        } else {
                            this.f51997d = new C17588m(this.f51994a, this.f51995b);
                        }
                        this.f52001h = new C17580e(this.f51997d);
                    }
                    m75356b();
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }
}
