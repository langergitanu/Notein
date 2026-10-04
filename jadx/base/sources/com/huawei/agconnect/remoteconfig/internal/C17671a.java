package com.huawei.agconnect.remoteconfig.internal;

import android.content.Context;
import com.huawei.agconnect.AGConnectInstance;
import com.huawei.agconnect.abtest.ABTestException;
import com.huawei.agconnect.abtest.AGConnectABTesting;
import com.huawei.agconnect.annotation.Singleton;
import com.huawei.agconnect.common.api.Logger;
import com.huawei.agconnect.common.api.RequestThrottle;
import com.huawei.agconnect.remoteconfig.AGCConfigException;
import com.huawei.agconnect.remoteconfig.AGConnectConfig;
import com.huawei.agconnect.remoteconfig.ConfigValues;
import com.huawei.agconnect.remoteconfig.internal.p570a.C17674c;
import com.huawei.agconnect.remoteconfig.internal.p571b.C17678a;
import com.huawei.agconnect.remoteconfig.internal.p572c.C17681b;
import java.util.Map;
import o0O00OOO.C25834OooO0oO;
import o0O00OOO.C25835OooO0oo;
import o0O00OOO.InterfaceC25832OooO0Oo;
import o0O00OOO.InterfaceC25833OooO0o0;
import o0O00OOO.OooO0o;

/* JADX INFO: renamed from: com.huawei.agconnect.remoteconfig.internal.a */
/* JADX INFO: loaded from: classes8.dex */
@Singleton
public class C17671a extends AGConnectConfig {

    /* JADX INFO: renamed from: a */
    private final AGConnectABTesting f52265a;

    /* JADX INFO: renamed from: b */
    private final C17679c f52266b;

    /* JADX INFO: renamed from: c */
    private final C17679c f52267c;

    /* JADX INFO: renamed from: d */
    private final C17679c f52268d;

    /* JADX INFO: renamed from: e */
    private final C17682d f52269e;

    /* JADX INFO: renamed from: f */
    private final C17678a f52270f;

    /* JADX INFO: renamed from: g */
    private final C17674c f52271g;

    public C17671a(Context context, AGConnectInstance aGConnectInstance) {
        C17679c c17679c = new C17679c("defaultConfigValues", aGConnectInstance);
        this.f52266b = c17679c;
        C17679c c17679c2 = new C17679c("appliedConfigValues", aGConnectInstance);
        this.f52267c = c17679c2;
        this.f52268d = new C17679c("unusedConfigValues", aGConnectInstance);
        this.f52271g = new C17674c(aGConnectInstance);
        this.f52265a = AGConnectABTesting.get(context, "REMOTE_CONFIG");
        this.f52269e = new C17682d(c17679c2, c17679c);
        this.f52270f = new C17678a(aGConnectInstance);
    }

    @Override // com.huawei.agconnect.remoteconfig.AGConnectConfig
    public void apply(ConfigValues configValues) {
        Logger.m75330v("AGConnectConfig", "apply config values");
        if (this.f52268d != configValues) {
            throw new IllegalArgumentException("only can apply last fetched config values");
        }
        C17679c c17679c = (C17679c) configValues;
        if (c17679c.m75668a() != null) {
            this.f52267c.m75669a(c17679c.m75668a());
            try {
                if (this.f52267c.m75668a().m75655b() != null) {
                    Logger.m75330v("AGConnectConfig", "replace experiments");
                    this.f52265a.replaceAllExperiments(this.f52267c.m75668a().m75655b());
                }
            } catch (ABTestException e) {
                Logger.m75328e("RemoteConfig", "ab test exception", e);
            }
        }
    }

    @Override // com.huawei.agconnect.remoteconfig.AGConnectConfig
    public void applyDefault(int i) {
        Logger.m75330v("AGConnectConfig", "apply default resources");
        this.f52266b.m75669a(new ConfigContainer(C17681b.m75674a(i)));
    }

    @Override // com.huawei.agconnect.remoteconfig.AGConnectConfig
    public void clearAll() {
        Logger.m75330v("AGConnectConfig", "clear all");
        this.f52266b.m75670b();
        this.f52267c.m75670b();
        this.f52268d.m75670b();
    }

    @Override // com.huawei.agconnect.remoteconfig.AGConnectConfig
    public OooO0o<ConfigValues> fetch() {
        return fetch(43200L);
    }

    @Override // com.huawei.agconnect.remoteconfig.AGConnectConfig
    public Map<String, String> getCustomAttributes() {
        return this.f52270f.m75666a();
    }

    @Override // com.huawei.agconnect.remoteconfig.AGConnectConfig
    public Map<String, Object> getMergedAll() {
        return this.f52269e.m75677a();
    }

    @Override // com.huawei.agconnect.remoteconfig.AGConnectConfig
    public AGConnectConfig.SOURCE getSource(String str) {
        C17679c c17679c = this.f52267c;
        if (c17679c != null && c17679c.containKey(str)) {
            Logger.m75330v("AGConnectConfig", "get source remote : " + str);
            return AGConnectConfig.SOURCE.REMOTE;
        }
        C17679c c17679c2 = this.f52266b;
        if (c17679c2 == null || !c17679c2.containKey(str)) {
            Logger.m75330v("AGConnectConfig", "get source static : " + str);
            return AGConnectConfig.SOURCE.STATIC;
        }
        Logger.m75330v("AGConnectConfig", "get source default : " + str);
        return AGConnectConfig.SOURCE.DEFAULT;
    }

    @Override // com.huawei.agconnect.remoteconfig.AGConnectConfig
    public Boolean getValueAsBoolean(String str) {
        return Boolean.valueOf(this.f52269e.m75678a(str));
    }

    @Override // com.huawei.agconnect.remoteconfig.AGConnectConfig
    public byte[] getValueAsByteArray(String str) {
        return this.f52269e.m75682e(str);
    }

    @Override // com.huawei.agconnect.remoteconfig.AGConnectConfig
    public Double getValueAsDouble(String str) {
        return Double.valueOf(this.f52269e.m75679b(str));
    }

    @Override // com.huawei.agconnect.remoteconfig.AGConnectConfig
    public Long getValueAsLong(String str) {
        return Long.valueOf(this.f52269e.m75680c(str));
    }

    @Override // com.huawei.agconnect.remoteconfig.AGConnectConfig
    public String getValueAsString(String str) {
        return this.f52269e.m75681d(str);
    }

    @Override // com.huawei.agconnect.remoteconfig.AGConnectConfig
    public ConfigValues loadLastFetched() {
        return this.f52268d;
    }

    @Override // com.huawei.agconnect.remoteconfig.AGConnectConfig
    public void setCustomAttributes(Map<String, String> map) {
        this.f52270f.m75667a(map);
    }

    @Override // com.huawei.agconnect.remoteconfig.AGConnectConfig
    public void setDeveloperMode(boolean z) {
        Logger.m75330v("AGConnectConfig", "set developer mode : " + z);
        Context context = AGConnectInstance.getInstance().getContext();
        if (context.getApplicationInfo() == null || (context.getApplicationInfo().flags & 2) == 0) {
            return;
        }
        RequestThrottle.getInstance().get("RemoteConfig-Fetch").setDeveloperMode(z);
    }

    @Override // com.huawei.agconnect.remoteconfig.AGConnectConfig
    public void applyDefault(Map<String, Object> map) {
        Logger.m75330v("AGConnectConfig", "apply default map");
        this.f52266b.m75669a(new ConfigContainer(C17681b.m75676a(map)));
    }

    @Override // com.huawei.agconnect.remoteconfig.AGConnectConfig
    public OooO0o<ConfigValues> fetch(long j) {
        Logger.m75329i("AGConnectConfig", "fetch : " + j);
        final C25834OooO0oO c25834OooO0oO = new C25834OooO0oO();
        ConfigContainer configContainerM75668a = this.f52268d.m75668a();
        OooO0o oooO0o = c25834OooO0oO.f88150OooO00o;
        if (configContainerM75668a != null) {
            if (j <= 1) {
                j = 1;
            }
            if (!configContainerM75668a.m75656b(j)) {
                Logger.m75329i("AGConnectConfig", "config use cache");
                c25834OooO0oO.OooO0O0(this.f52268d);
                return oooO0o;
            }
        }
        String strM75657c = configContainerM75668a != null ? configContainerM75668a.m75657c() : "";
        Logger.m75329i("AGConnectConfig", "config send fetch request");
        OooO0o<ConfigContainer> configFromRemote = this.f52271g.getConfigFromRemote(strM75657c, this.f52270f.m75666a());
        C25835OooO0oo c25835OooO0oo = C25835OooO0oo.f88151OooO0Oo;
        configFromRemote.OooO0Oo(c25835OooO0oo.f88152OooO00o, new InterfaceC25833OooO0o0<ConfigContainer>() { // from class: com.huawei.agconnect.remoteconfig.internal.a.2
            @Override // o0O00OOO.InterfaceC25833OooO0o0
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public void onSuccess(ConfigContainer configContainer) {
                Logger.m75330v("AGConnectConfig", "fetch success");
                C17671a.this.f52268d.m75669a(configContainer);
                c25834OooO0oO.OooO0O0(C17671a.this.f52268d);
            }
        }).OooOO0O(c25835OooO0oo.f88152OooO00o, new InterfaceC25832OooO0Oo() { // from class: com.huawei.agconnect.remoteconfig.internal.a.1
            @Override // o0O00OOO.InterfaceC25832OooO0Oo
            public void onFailure(Exception exc) {
                Logger.m75330v("AGConnectConfig", "fetch failure");
                if (!(exc instanceof AGCConfigException) || ((AGCConfigException) exc).getCode() != 204091393) {
                    c25834OooO0oO.OooO00o(exc);
                    return;
                }
                Logger.m75329i("AGConnectConfig", "data not modified");
                ConfigContainer configContainerM75668a2 = C17671a.this.f52268d.m75668a();
                if (configContainerM75668a2 != null) {
                    configContainerM75668a2.m75654a(System.currentTimeMillis());
                    C17671a.this.f52268d.m75669a(configContainerM75668a2);
                }
                c25834OooO0oO.OooO0O0(C17671a.this.f52268d);
            }
        });
        return oooO0o;
    }
}
