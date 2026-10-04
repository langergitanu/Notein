package com.huawei.agconnect.common.api;

import android.os.Bundle;
import com.aspose.slides.C22223Oooo0o;
import com.huawei.agconnect.AGConnectInstance;
import com.huawei.agconnect.credential.obs.C17619au;
import com.huawei.agconnect.credential.obs.InterfaceC17618at;
import com.huawei.agconnect.credential.obs.InterfaceC17620av;
import java.util.Map;
import java.util.concurrent.Callable;
import o0O00OOO.C25834OooO0oO;
import o0O00OOO.C25835OooO0oo;
import o0O00OOO.InterfaceC25832OooO0Oo;
import o0O00Oo.C25840OooO0oo;
import o0O00Oo.OooO;

/* JADX INFO: loaded from: classes8.dex */
public class HaBridge {
    private static final String HA_HTTP_HEADER = "com.huawei.agconnect";
    public static final String HA_SERVICE_TAG_ABTEST = "AGC_TAG_ABTest";
    public static final String HA_SERVICE_TAG_APP_LINKING = "AGC_TAG_AppLinking";
    public static final String HA_SERVICE_TAG_CONFIG = "AGC_TAG_Config";
    public static final String HA_SERVICE_TAG_CRASH = "Crash_TAG";
    public static final String HA_SERVICE_TAG_IAM = "AGC_TAG_IAM";
    private static final String TAG = "HaBridge";
    private InterfaceC17620av bridgeInstance;
    private String haTag;

    public HaBridge(String str) {
        this.haTag = str;
    }

    private o0O00OOO.OooO0o<InterfaceC17620av> initHaInMain() {
        return OooO.OooO00o(new Callable() { // from class: com.huawei.agconnect.common.api.OooO0o0
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return this.f68967OooOo0o.lambda$initHaInMain$0();
            }
        }, C25835OooO0oo.f88151OooO0Oo.f88154OooO0OO);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$getUserProfiles$3(C25834OooO0oO c25834OooO0oO, boolean z, o0O00OOO.OooO0o oooO0o) {
        c25834OooO0oO.OooO0O0(((InterfaceC17620av) oooO0o.OooO0oO()).mo75511b(z));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ InterfaceC17620av lambda$initHaInMain$0() {
        InterfaceC17620av interfaceC17620av = this.bridgeInstance;
        if (interfaceC17620av != null) {
            return interfaceC17620av;
        }
        try {
            this.bridgeInstance = C17619au.m75506a(AGConnectInstance.getInstance().getContext(), this.haTag, HA_HTTP_HEADER, AGConnectInstance.getInstance().getOptions().getRoutePolicy().getRouteName());
            Logger.m75329i(TAG, "init HiAnalyticsBridge SDK end.");
            return this.bridgeInstance;
        } catch (Error e) {
            Logger.m75327e(TAG, "please upgrade HiAnalytics SDK (com.huawei.hms:hianalytics) to the latest version");
            throw e;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$onEvent$1(String str, Bundle bundle, o0O00OOO.OooO0o oooO0o) {
        ((InterfaceC17620av) oooO0o.OooO0oO()).mo75509a(str, bundle);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$onReport$2(o0O00OOO.OooO0o oooO0o) {
        ((InterfaceC17620av) oooO0o.OooO0oO()).mo75508a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$syncOAID$5(final HaSyncCallBack haSyncCallBack, o0O00OOO.OooO0o oooO0o) {
        Logger.m75329i(TAG, "start sync ha oaid");
        ((InterfaceC17620av) oooO0o.OooO0oO()).syncOaid(new InterfaceC17618at() { // from class: com.huawei.agconnect.common.api.HaBridge.1
            @Override // com.huawei.agconnect.credential.obs.InterfaceC17618at
            public void result(int i, String str) {
                haSyncCallBack.syncCallBack(i, str);
                Logger.m75329i(HaBridge.TAG, "end sync ha oaid:code:--->" + i + ", msg---->" + str);
            }
        });
    }

    public o0O00OOO.OooO0o<Map<String, String>> getUserProfiles(final boolean z) {
        final C25834OooO0oO c25834OooO0oO = new C25834OooO0oO();
        initHaInMain().OooO00o(new o0O00OOO.OooO0OO() { // from class: com.huawei.agconnect.common.api.OooO0OO
            @Override // o0O00OOO.OooO0OO
            public final void onComplete(o0O00OOO.OooO0o oooO0o) {
                HaBridge.lambda$getUserProfiles$3(c25834OooO0oO, z, (C25840OooO0oo) oooO0o);
            }
        }).OooO0OO(new InterfaceC25832OooO0Oo() { // from class: com.huawei.agconnect.common.api.OooO0Oo
            @Override // o0O00OOO.InterfaceC25832OooO0Oo
            public final void onFailure(Exception exc) {
                c25834OooO0oO.OooO0O0(null);
            }
        });
        return c25834OooO0oO.f88150OooO00o;
    }

    public o0O00OOO.OooO0o<Void> onEvent(final String str, final Bundle bundle) {
        C25840OooO0oo c25840OooO0oo = new C25840OooO0oo();
        initHaInMain().OooO00o(new o0O00OOO.OooO0OO() { // from class: com.huawei.agconnect.common.api.OooO0O0
            @Override // o0O00OOO.OooO0OO
            public final void onComplete(o0O00OOO.OooO0o oooO0o) {
                HaBridge.lambda$onEvent$1(str, bundle, (C25840OooO0oo) oooO0o);
            }
        });
        return c25840OooO0oo;
    }

    public o0O00OOO.OooO0o<Void> onReport() {
        C25840OooO0oo c25840OooO0oo = new C25840OooO0oo();
        initHaInMain().OooO00o(new C22223Oooo0o());
        return c25840OooO0oo;
    }

    public o0O00OOO.OooO0o<Void> syncOAID(final HaSyncCallBack haSyncCallBack) {
        C25840OooO0oo c25840OooO0oo = new C25840OooO0oo();
        initHaInMain().OooO00o(new o0O00OOO.OooO0OO() { // from class: com.huawei.agconnect.common.api.OooO00o
            @Override // o0O00OOO.OooO0OO
            public final void onComplete(o0O00OOO.OooO0o oooO0o) {
                this.f68958OooO00o.lambda$syncOAID$5(haSyncCallBack, (C25840OooO0oo) oooO0o);
            }
        });
        return c25840OooO0oo;
    }
}
