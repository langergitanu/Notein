package com.huawei.cloud.services.drive;

import android.os.Build;
import com.huawei.cloud.base.services.AbstractClientRequest;
import com.huawei.cloud.base.services.BaseRequestInitializer;
import com.huawei.cloud.base.util.Preconditions;
import com.huawei.cloud.client.util.AppInfo;
import com.huawei.hms.drive.C17872g;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes8.dex */
public class DriveRequestInitializer implements BaseRequestInitializer {

    /* JADX INFO: renamed from: a */
    private Map<String, Object> f52353a = new HashMap();

    @Override // com.huawei.cloud.base.services.BaseRequestInitializer
    public void initialize(AbstractClientRequest<?> abstractClientRequest) throws IOException {
        String strM76784b = C17872g.m76784b(abstractClientRequest.getClass().getName());
        abstractClientRequest.getHeaders().set("x-hw-terminal", (Object) Build.MODEL);
        abstractClientRequest.getHeaders().set("x-hw-os", (Object) Build.DISPLAY);
        abstractClientRequest.getHeaders().set("x-hw-app-id", (Object) AppInfo.appId);
        abstractClientRequest.getHeaders().set("version", (Object) AppInfo.SDK_VERSION);
        abstractClientRequest.getHeaders().setUserAgent(AppInfo.packageName + "/" + AppInfo.versionName);
        if (!abstractClientRequest.getHeaders().containsKey("x-hw-trace-id")) {
            abstractClientRequest.getHeaders().set("x-hw-trace-id", (Object) C17872g.m76783a(strM76784b));
        }
        if (this.f52353a.isEmpty()) {
            return;
        }
        for (Map.Entry<String, Object> entry : this.f52353a.entrySet()) {
            abstractClientRequest.put(entry.getKey(), entry.getValue());
        }
    }

    public void setParams(String str, Object obj) {
        Preconditions.checkNotNull(str);
        Preconditions.checkNotNull(obj);
        this.f52353a.put(str, obj);
    }
}
