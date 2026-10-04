package com.huawei.agconnect.remoteconfig.internal.p570a;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.os.Build;
import com.huawei.agconnect.AGConnectInstance;
import com.huawei.agconnect.common.api.AGCInstanceID;
import com.huawei.agconnect.common.api.BackendService;
import com.huawei.agconnect.common.api.CPUModelUtil;
import com.huawei.agconnect.common.api.Logger;
import com.huawei.agconnect.common.api.RequestThrottle;
import com.huawei.agconnect.common.appinfo.SafeAppInfo;
import com.huawei.agconnect.exception.AGCServerException;
import com.huawei.agconnect.remoteconfig.AGCConfigException;
import com.huawei.agconnect.remoteconfig.internal.C17677b;
import com.huawei.agconnect.remoteconfig.internal.ConfigContainer;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import o0O00OOO.C25834OooO0oO;
import o0O00OOO.C25835OooO0oo;
import o0O00OOO.InterfaceC25832OooO0Oo;
import o0O00OOO.InterfaceC25833OooO0o0;
import o0O00OOO.OooO0o;

/* JADX INFO: renamed from: com.huawei.agconnect.remoteconfig.internal.a.c */
/* JADX INFO: loaded from: classes8.dex */
public final class C17674c {
    private final BackendService.Options options;
    private final RequestThrottle.Throttle throttle;

    public C17674c(AGConnectInstance aGConnectInstance) {
        RequestThrottle.Throttle throttle = RequestThrottle.getInstance().get("RemoteConfig-Fetch");
        this.throttle = throttle;
        this.options = new BackendService.Options.Builder().apiKey(true).throttle(throttle).app(aGConnectInstance).build();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public String appVersion(Context context) {
        PackageInfo packageInfoSafeGetPackageInfo = SafeAppInfo.safeGetPackageInfo(context.getPackageManager(), context.getPackageName(), 16384);
        if (packageInfoSafeGetPackageInfo != null) {
            return packageInfoSafeGetPackageInfo.versionName;
        }
        return null;
    }

    private OooO0o<C17675d> buildRequest(final String str, final Map<String, String> map) {
        final C25834OooO0oO c25834OooO0oO = new C25834OooO0oO();
        C17677b.m75662a().m75663a(false).OooO0o0(new InterfaceC25833OooO0o0<Map<String, String>>() { // from class: com.huawei.agconnect.remoteconfig.internal.a.c.2
            @Override // o0O00OOO.InterfaceC25833OooO0o0
            public void onSuccess(Map<String, String> map2) {
                String str2;
                Context context = AGConnectInstance.getInstance().getContext();
                C17675d c17675d = new C17675d();
                c17675d.setTag(str);
                c17675d.setVersionName(C17674c.this.appVersion(context));
                try {
                    str2 = ",HarmonyOS " + ((String) Class.forName("ohos.system.version.SystemVersion").getDeclaredMethod("getVersion", new Class[0]).invoke(null, new Object[0]));
                } catch (Throwable unused) {
                    Logger.m75331w("RemoteConfig", "not find package ohos.system.version.SystemVersion");
                    str2 = "";
                }
                c17675d.setPlatformVersion("Android " + Build.VERSION.RELEASE + str2);
                Locale locale = context.getResources().getConfiguration().getLocales().get(0);
                c17675d.setLanguage(locale.getLanguage());
                c17675d.setScript(locale.getScript());
                c17675d.setCountry(locale.getCountry());
                c17675d.setDateTime(System.currentTimeMillis());
                c17675d.setAaId(AGCInstanceID.getInstance(context).getId());
                c17675d.setCustomProperties(C17674c.this.getUserProperties(map));
                c17675d.setUserProperties(C17674c.this.getUserProperties(map2));
                c17675d.setDeviceChip(CPUModelUtil.getCpuModel());
                c25834OooO0oO.OooO0O0(c17675d);
            }
        });
        return c25834OooO0oO.f88150OooO00o;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public List<Map<String, String>> getUserProperties(Map<String, String> map) {
        ArrayList arrayList = new ArrayList();
        for (Map.Entry<String, String> entry : map.entrySet()) {
            HashMap map2 = new HashMap(10);
            map2.put("key", entry.getKey());
            map2.put("value", entry.getValue());
            arrayList.add(map2);
        }
        return arrayList;
    }

    public OooO0o<ConfigContainer> getConfigFromRemote(String str, Map<String, String> map) {
        final C25834OooO0oO c25834OooO0oO = new C25834OooO0oO();
        buildRequest(str, map).OooO0o0(new InterfaceC25833OooO0o0<C17675d>() { // from class: com.huawei.agconnect.remoteconfig.internal.a.c.1
            @Override // o0O00OOO.InterfaceC25833OooO0o0
            public void onSuccess(C17675d c17675d) {
                OooO0o oooO0oSendRequest = BackendService.sendRequest(c17675d, 1, C17676e.class, C17674c.this.options);
                C25835OooO0oo c25835OooO0oo = C25835OooO0oo.f88151OooO0Oo;
                oooO0oSendRequest.OooO0Oo(c25835OooO0oo.f88152OooO00o, new InterfaceC25833OooO0o0<C17676e>() { // from class: com.huawei.agconnect.remoteconfig.internal.a.c.1.2
                    @Override // o0O00OOO.InterfaceC25833OooO0o0
                    public void onSuccess(C17676e c17676e) {
                        if (c17676e.isSuccess()) {
                            c25834OooO0oO.OooO0O0(new ConfigContainer(c17676e.getParameters(), c17676e.getExperiments(), c17676e.getTag()));
                        } else {
                            c25834OooO0oO.OooO00o(new AGCConfigException(c17676e.getRet().getMsg(), c17676e.getRet().getCode()));
                        }
                    }
                }).OooOO0O(c25835OooO0oo.f88152OooO00o, new InterfaceC25832OooO0Oo() { // from class: com.huawei.agconnect.remoteconfig.internal.a.c.1.1
                    @Override // o0O00OOO.InterfaceC25832OooO0Oo
                    public void onFailure(Exception exc) {
                        if (exc instanceof AGCServerException) {
                            AGCServerException aGCServerException = (AGCServerException) exc;
                            if (1 == aGCServerException.getCode()) {
                                c25834OooO0oO.OooO00o(new AGCConfigException(aGCServerException.getErrMsg(), 1, C17674c.this.throttle.getEndTime()));
                                return;
                            }
                        }
                        c25834OooO0oO.OooO00o(exc);
                    }
                });
            }
        });
        return c25834OooO0oO.f88150OooO00o;
    }
}
