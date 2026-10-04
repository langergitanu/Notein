package com.huawei.hms.network.embedded;

import android.content.Context;
import com.huawei.hms.framework.common.ExecutorsUtils;
import com.huawei.hms.framework.common.Logger;
import com.huawei.hms.framework.common.StringUtils;
import com.huawei.hms.network.embedded.InterfaceC18267m3;
import java.util.Map;
import java.util.concurrent.Executor;
import org.chromium.net.CronetEngine;
import org.chromium.net.ExperimentalCronetEngine;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.huawei.hms.network.embedded.o4 */
/* JADX INFO: loaded from: classes9.dex */
public class C18296o4 implements InterfaceC18267m3.a {

    /* JADX INFO: renamed from: e */
    public static final String f55823e = "CronetRequestTaskFactor";

    /* JADX INFO: renamed from: f */
    public static final String f55824f = "Cronet_Request";

    /* JADX INFO: renamed from: g */
    public static final String f55825g = "Cronet_RequestListener";

    /* JADX INFO: renamed from: h */
    public static volatile C18296o4 f55826h;

    /* JADX INFO: renamed from: a */
    public C18225j3 f55827a;

    /* JADX INFO: renamed from: b */
    public CronetEngine f55828b;

    /* JADX INFO: renamed from: c */
    public C18212i4 f55829c;

    /* JADX INFO: renamed from: d */
    public Executor f55830d;

    public C18296o4(Context context) {
        if (context == null) {
            Logger.m76967w(f55823e, "the context is null,and the CronetRequestTaskFactory cann't been Initialized!");
        } else {
            m79275a(context);
        }
    }

    /* JADX INFO: renamed from: a */
    private void m79275a(Context context) {
        try {
            ExperimentalCronetEngine.Builder builderEnableNetworkQualityEstimator = new ExperimentalCronetEngine.Builder(context).enableQuic(true).enableHttp2(true).enableNetworkQualityEstimator(true);
            for (Map.Entry<String, C18322q4> entry : C18240k4.getInstance().getQuicHints().entrySet()) {
                Logger.m76964i(f55823e, "the host of using quic is %s", entry.getKey());
                builderEnableNetworkQualityEstimator.addQuicHint(entry.getKey(), entry.getValue().getPort(), entry.getValue().getAlternatePort());
            }
            try {
                JSONObject jSONObjectPut = new JSONObject().put("connection_options", "STMP");
                jSONObjectPut.put("quic_version", "QUIC_VERSION_43");
                builderEnableNetworkQualityEstimator.setExperimentalOptions(new JSONObject().put("QUIC", jSONObjectPut).toString());
            } catch (JSONException e) {
                Logger.m76962e(f55823e, "set QUIC options failed, exception:", e.getClass().getSimpleName());
            }
            this.f55828b = builderEnableNetworkQualityEstimator.build();
            this.f55830d = ExecutorsUtils.newSingleThreadExecutor(f55825g);
            C18212i4 c18212i4 = new C18212i4(this.f55830d);
            this.f55829c = c18212i4;
            ExperimentalCronetEngine experimentalCronetEngine = this.f55828b;
            if (experimentalCronetEngine instanceof ExperimentalCronetEngine) {
                experimentalCronetEngine.addRequestFinishedListener(c18212i4);
            }
        } catch (Throwable th) {
            this.f55828b = null;
            Logger.m76963i(f55823e, "build CronetEngine failed, the reason:" + StringUtils.anonymizeMessage(th.getMessage()));
        }
    }

    public static C18296o4 getInstance(Context context) {
        if (f55826h == null) {
            synchronized (C18296o4.class) {
                try {
                    if (f55826h == null) {
                        f55826h = new C18296o4(context);
                    }
                } finally {
                }
            }
        }
        return f55826h;
    }

    public C18212i4 getCronetEventListener() {
        return this.f55829c;
    }

    public boolean isAvailable() {
        return this.f55828b != null;
    }

    @Override // com.huawei.hms.network.embedded.InterfaceC18267m3.a
    public InterfaceC18267m3 newTask() {
        return new C18282n4(this.f55828b, this);
    }
}
