package com.huawei.agconnect.config.impl;

import android.content.Context;
import com.huawei.agconnect.AGCRoutePolicy;
import com.huawei.agconnect.AGConnectOptions;
import com.huawei.agconnect.JsonProcessingFactory;
import com.huawei.agconnect.config.ConfigReader;
import com.huawei.agconnect.core.Service;
import java.io.InputStream;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.huawei.agconnect.config.impl.b */
/* JADX INFO: loaded from: classes8.dex */
public class C17577b implements AGConnectOptions {

    /* JADX INFO: renamed from: a */
    private final String f51985a;

    /* JADX INFO: renamed from: b */
    private final Context f51986b;

    /* JADX INFO: renamed from: c */
    private final String f51987c;

    /* JADX INFO: renamed from: d */
    private final AGCRoutePolicy f51988d;

    /* JADX INFO: renamed from: e */
    private final ConfigReader f51989e;

    /* JADX INFO: renamed from: f */
    private final C17580e f51990f;

    /* JADX INFO: renamed from: g */
    private final Map<String, String> f51991g;

    /* JADX INFO: renamed from: h */
    private final List<Service> f51992h;

    /* JADX INFO: renamed from: i */
    private final Map<String, String> f51993i = new HashMap();

    public C17577b(Context context, String str, AGCRoutePolicy aGCRoutePolicy, InputStream inputStream, Map<String, String> map, List<Service> list, String str2) {
        context = context.getApplicationContext() != null ? context.getApplicationContext() : context;
        this.f51986b = context;
        str = str == null ? context.getPackageName() : str;
        this.f51987c = str;
        if (inputStream != null) {
            this.f51989e = new C17584i(inputStream, str);
            Utils.closeQuietly(inputStream);
        } else {
            this.f51989e = new C17588m(context, str);
        }
        this.f51990f = new C17580e(this.f51989e);
        AGCRoutePolicy aGCRoutePolicy2 = AGCRoutePolicy.UNKNOWN;
        if (aGCRoutePolicy != aGCRoutePolicy2 && "1.0".equals(this.f51989e.getString("/configuration_version", null))) {
            throw new RuntimeException("The file version does not match,please download the latest agconnect-services.json from the AGC website.");
        }
        this.f51988d = (aGCRoutePolicy == null || aGCRoutePolicy == aGCRoutePolicy2) ? Utils.getRoutePolicyFromJson(this.f51989e.getString("/region", null), this.f51989e.getString("/agcgw/url", null)) : aGCRoutePolicy;
        this.f51991g = Utils.fixKeyPathMap(map);
        this.f51992h = list;
        this.f51985a = str2 == null ? m75350b() : str2;
    }

    /* JADX INFO: renamed from: a */
    private String m75349a(String str) {
        Map<String, JsonProcessingFactory.JsonProcessor> processors = JsonProcessingFactory.getProcessors();
        if (!processors.containsKey(str)) {
            return null;
        }
        if (this.f51993i.containsKey(str)) {
            return this.f51993i.get(str);
        }
        JsonProcessingFactory.JsonProcessor jsonProcessor = processors.get(str);
        if (jsonProcessor == null) {
            return null;
        }
        String strProcessOption = jsonProcessor.processOption(this);
        this.f51993i.put(str, strProcessOption);
        return strProcessOption;
    }

    /* JADX INFO: renamed from: b */
    private String m75350b() {
        return String.valueOf(("{packageName='" + this.f51987c + "', routePolicy=" + this.f51988d + ", reader=" + this.f51989e.toString().hashCode() + ", customConfigMap=" + new JSONObject(this.f51991g).toString().hashCode() + '}').hashCode());
    }

    @Override // com.huawei.agconnect.AGConnectOptions
    public boolean getBoolean(String str) {
        return getBoolean(str, false);
    }

    @Override // com.huawei.agconnect.AGConnectOptions
    public Context getContext() {
        return this.f51986b;
    }

    @Override // com.huawei.agconnect.AGConnectOptions
    public String getIdentifier() {
        return this.f51985a;
    }

    @Override // com.huawei.agconnect.AGConnectOptions
    public int getInt(String str) {
        return getInt(str, 0);
    }

    @Override // com.huawei.agconnect.AGConnectOptions
    public String getPackageName() {
        return this.f51987c;
    }

    @Override // com.huawei.agconnect.AGConnectOptions
    public AGCRoutePolicy getRoutePolicy() {
        AGCRoutePolicy aGCRoutePolicy = this.f51988d;
        return aGCRoutePolicy == null ? AGCRoutePolicy.UNKNOWN : aGCRoutePolicy;
    }

    @Override // com.huawei.agconnect.AGConnectOptions
    public String getString(String str) {
        return getString(str, null);
    }

    /* JADX INFO: renamed from: a */
    public List<Service> m75351a() {
        return this.f51992h;
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
            return str2;
        }
        String strFixPath = Utils.fixPath(str);
        String str3 = this.f51991g.get(strFixPath);
        if (str3 != null) {
            return str3;
        }
        String strM75349a = m75349a(strFixPath);
        if (strM75349a != null) {
            return strM75349a;
        }
        String string = this.f51989e.getString(strFixPath, str2);
        return C17580e.m75366a(string) ? this.f51990f.decrypt(string, str2) : string;
    }
}
