package com.huawei.hms.framework.network.grs.p578f;

import android.content.Context;
import android.text.TextUtils;
import com.aspose.slides.C22218Oooo;
import com.huawei.hms.framework.common.AssetsUtil;
import com.huawei.hms.framework.common.Logger;
import com.huawei.hms.framework.network.grs.GrsApp;
import com.huawei.hms.framework.network.grs.GrsBaseInfo;
import com.huawei.hms.framework.network.grs.local.model.C17962a;
import com.huawei.hms.framework.network.grs.p577e.C17933a;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: renamed from: com.huawei.hms.framework.network.grs.f.b */
/* JADX INFO: loaded from: classes7.dex */
public class C17937b {

    /* JADX INFO: renamed from: b */
    private static final Map<String, C17937b> f53666b = new ConcurrentHashMap(16);

    /* JADX INFO: renamed from: c */
    private static final Object f53667c = new Object();

    /* JADX INFO: renamed from: a */
    private AbstractC17936a f53668a;

    public C17937b(Context context, GrsBaseInfo grsBaseInfo, boolean z) {
        m77051a(context, z);
        f53666b.put(context.getPackageName() + grsBaseInfo.uniqueCode(), this);
    }

    /* JADX INFO: renamed from: a */
    public static C17937b m77046a(String str, GrsBaseInfo grsBaseInfo) {
        Map<String, C17937b> map = f53666b;
        StringBuilder sbOooO0OO = C22218Oooo.OooO0OO(str);
        sbOooO0OO.append(grsBaseInfo.uniqueCode());
        return map.get(sbOooO0OO.toString());
    }

    /* JADX INFO: renamed from: b */
    public Set<String> m77053b() {
        return this.f53668a.m77041c();
    }

    /* JADX INFO: renamed from: a */
    public C17962a m77048a() {
        return this.f53668a.m77038b();
    }

    /* JADX INFO: renamed from: a */
    public String m77049a(Context context, C17933a c17933a, GrsBaseInfo grsBaseInfo, String str, String str2, boolean z) {
        String strM77031a;
        synchronized (f53667c) {
            strM77031a = this.f53668a.m77031a(context, c17933a, grsBaseInfo, str, str2, z);
            if (TextUtils.isEmpty(strM77031a) && this.f53668a.m77043d()) {
                m77051a(context, true);
                m77052a(grsBaseInfo);
                f53666b.put(context.getPackageName() + grsBaseInfo.uniqueCode(), this);
                strM77031a = this.f53668a.m77031a(context, c17933a, grsBaseInfo, str, str2, z);
            }
        }
        return strM77031a;
    }

    /* JADX INFO: renamed from: a */
    public Map<String, String> m77050a(Context context, C17933a c17933a, GrsBaseInfo grsBaseInfo, String str, boolean z) {
        Map<String, String> mapM77033a;
        synchronized (f53667c) {
            try {
                mapM77033a = this.f53668a.m77033a(context, c17933a, grsBaseInfo, str, z);
                if (mapM77033a == null || mapM77033a.isEmpty()) {
                    if (this.f53668a.m77043d()) {
                        m77051a(context, true);
                        m77052a(grsBaseInfo);
                        f53666b.put(context.getPackageName() + grsBaseInfo.uniqueCode(), this);
                        mapM77033a = this.f53668a.m77033a(context, c17933a, grsBaseInfo, str, z);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return mapM77033a;
    }

    /* JADX INFO: renamed from: a */
    public static void m77047a(Context context, GrsBaseInfo grsBaseInfo) {
        C17937b c17937bM77046a = m77046a(context.getPackageName(), grsBaseInfo);
        if (c17937bM77046a != null) {
            Logger.m76963i("LocalManagerProxy", "appGrs is not null and clear services.");
            synchronized (f53667c) {
                c17937bM77046a.f53668a.m77034a();
            }
        }
    }

    /* JADX INFO: renamed from: a */
    public void m77051a(Context context, boolean z) {
        String[] list = AssetsUtil.list(context, GrsApp.getInstance().getBrand(""));
        List<String> arrayList = list == null ? new ArrayList<>() : Arrays.asList(list);
        String appConfigName = GrsApp.getInstance().getAppConfigName();
        Logger.m76963i("LocalManagerProxy", "appConfigName is" + appConfigName);
        this.f53668a = new C17939d(false, z);
        if (arrayList.contains("grs_app_global_route_config.json") || !TextUtils.isEmpty(appConfigName)) {
            this.f53668a = new C17939d(context, appConfigName, z);
        }
        if (!this.f53668a.m77045e() && arrayList.contains("grs_sdk_global_route_config.json")) {
            this.f53668a = new C17938c(context, z);
        }
        this.f53668a.m77035a(context, arrayList);
    }

    /* JADX INFO: renamed from: a */
    public void m77052a(GrsBaseInfo grsBaseInfo) {
        this.f53668a.m77036a(grsBaseInfo);
    }
}
