package com.huawei.agconnect.common.api;

import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import com.huawei.agconnect.AGConnectInstance;
import com.huawei.agconnect.common.network.AccessNetworkManager;
import com.huawei.agconnect.credential.obs.C17619au;
import com.huawei.agconnect.credential.obs.InterfaceC17618at;
import com.huawei.agconnect.credential.obs.InterfaceC17620av;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes8.dex */
public class HaConnector {
    private static final String HA_HTTP_HEADER = "com.huawei.agconnect";
    private static final String HA_SERVICE_TAG = "AGC_TAG";
    private static final HaConnector INSTANCE = new HaConnector();
    private static final String TAG = "HaConnector";
    private InterfaceC17620av hiAnalytics;
    private Handler mainHandler;

    /* JADX INFO: renamed from: com.huawei.agconnect.common.api.HaConnector$1 */
    public class C175711 implements AccessNetworkManager.AccessNetworkCallback {
        final /* synthetic */ Context val$context;

        public C175711(Context context) {
            this.val$context = context;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$onNetWorkReady$0(Context context) {
            HaConnector.this.initInMainThread(context);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$onNetWorkReady$1() {
            if (HaConnector.this.hiAnalytics != null) {
                Logger.m75329i(HaConnector.TAG, "Auto onReport");
                HaConnector.this.hiAnalytics.mo75508a();
            }
        }

        @Override // com.huawei.agconnect.common.network.AccessNetworkManager.AccessNetworkCallback
        public void onNetWorkReady() {
            if (HaConnector.this.mainHandler == null) {
                HaConnector.this.mainHandler = new Handler(Looper.getMainLooper());
            }
            Handler handler = HaConnector.this.mainHandler;
            final Context context = this.val$context;
            handler.post(new Runnable() { // from class: com.huawei.agconnect.common.api.OooO0o
                @Override // java.lang.Runnable
                public final void run() {
                    this.f68966OooOo0o.lambda$onNetWorkReady$0(context);
                }
            });
            HaConnector.this.mainHandler.postDelayed(new Runnable() { // from class: com.huawei.agconnect.common.api.OooO0oO
                @Override // java.lang.Runnable
                public final void run() {
                    this.f68968OooOo0o.lambda$onNetWorkReady$1();
                }
            }, 5000L);
        }
    }

    private HaConnector() {
    }

    public static synchronized HaConnector getInstance() {
        return INSTANCE;
    }

    private void initHiAnalytics(Context context) {
        try {
            this.hiAnalytics = useOldHaInitFunction() ? C17619au.m75505a(context, HA_SERVICE_TAG, HA_HTTP_HEADER) : C17619au.m75506a(context, HA_SERVICE_TAG, HA_HTTP_HEADER, AGConnectInstance.getInstance().getOptions().getRoutePolicy().getRouteName());
            if (this.hiAnalytics == null) {
                Logger.m75327e(TAG, "init HiAnalyticsBridge SDK error, please make sure the project inherits HiAnalytics SDK correctlyor download the latest agconnect-services.json file and try again.");
            } else {
                Logger.m75329i(TAG, "init HiAnalyticsBridge SDK end.");
            }
        } catch (Error e) {
            if (e instanceof NoSuchMethodError) {
                Logger.m75327e(TAG, "please upgrade HiAnalytics SDK (com.huawei.hms:hianalytics) to the latest version");
            }
            throw e;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void initInMainThread(Context context) {
        initHiAnalytics(context);
    }

    private boolean useOldHaInitFunction() {
        return TextUtils.isEmpty(AGConnectInstance.getInstance().getOptions().getString("/service/analytics/collector_url_ru")) || TextUtils.isEmpty(AGConnectInstance.getInstance().getOptions().getString("/service/analytics/collector_url_sg")) || TextUtils.isEmpty(AGConnectInstance.getInstance().getOptions().getString("/service/analytics/collector_url_de")) || TextUtils.isEmpty(AGConnectInstance.getInstance().getOptions().getString("/service/analytics/collector_url_cn"));
    }

    public boolean containHaInstance() {
        return this.hiAnalytics != null;
    }

    public Map<String, String> getUserProfiles(boolean z) {
        HashMap map = new HashMap();
        InterfaceC17620av interfaceC17620av = this.hiAnalytics;
        return interfaceC17620av != null ? interfaceC17620av.mo75511b(z) : map;
    }

    public void init(Context context) {
        AccessNetworkManager.getInstance().addCallback(new C175711(context));
    }

    public void onEvent(String str, Bundle bundle) {
        InterfaceC17620av interfaceC17620av = this.hiAnalytics;
        if (interfaceC17620av != null) {
            interfaceC17620av.mo75509a(str, bundle);
        }
    }

    public void onReport() {
        InterfaceC17620av interfaceC17620av = this.hiAnalytics;
        if (interfaceC17620av != null) {
            interfaceC17620av.mo75508a();
        }
    }

    public void setAnalyticsEnabled(boolean z) {
        InterfaceC17620av interfaceC17620av = this.hiAnalytics;
        if (interfaceC17620av != null) {
            interfaceC17620av.mo75512c(z);
        }
    }

    public void syncOAID(final HaSyncCallBack haSyncCallBack) {
        if (this.hiAnalytics != null) {
            Logger.m75329i(TAG, "start sync ha oaid");
            this.hiAnalytics.syncOaid(new InterfaceC17618at() { // from class: com.huawei.agconnect.common.api.HaConnector.2
                @Override // com.huawei.agconnect.credential.obs.InterfaceC17618at
                public void result(int i, String str) {
                    haSyncCallBack.syncCallBack(i, str);
                    Logger.m75329i(HaConnector.TAG, "end sync ha oaid:code:--->" + i + ", msg---->" + str);
                }
            });
        }
    }
}
