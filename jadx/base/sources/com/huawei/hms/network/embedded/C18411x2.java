package com.huawei.hms.network.embedded;

import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.text.TextUtils;
import com.huawei.hms.framework.common.ContextHolder;
import com.huawei.hms.framework.common.Logger;
import com.huawei.hms.networkkit.embedded.C18447R;

/* JADX INFO: renamed from: com.huawei.hms.network.embedded.x2 */
/* JADX INFO: loaded from: classes9.dex */
public class C18411x2 {

    /* JADX INFO: renamed from: d */
    public static final String f56561d = "HttpDnsHelper";

    /* JADX INFO: renamed from: e */
    public static final String f56562e = "httpdns_accountId";

    /* JADX INFO: renamed from: a */
    public String f56563a;

    /* JADX INFO: renamed from: b */
    public String f56564b;

    /* JADX INFO: renamed from: c */
    public String f56565c;

    /* JADX INFO: renamed from: a */
    public String m79856a() {
        ApplicationInfo applicationInfo;
        if (!TextUtils.isEmpty(this.f56565c)) {
            return this.f56565c;
        }
        try {
            applicationInfo = ContextHolder.getAppContext().getPackageManager().getApplicationInfo(ContextHolder.getAppContext().getPackageName(), 128);
        } catch (PackageManager.NameNotFoundException e) {
            Logger.m76968w(f56561d, "NameNotFoundException: ", e);
            applicationInfo = null;
        }
        if (applicationInfo == null) {
            Logger.m76967w(f56561d, "appInfo == null ");
            return "";
        }
        Object obj = applicationInfo.metaData.get(f56562e);
        if (obj == null) {
            return "";
        }
        this.f56565c = obj.toString();
        Logger.m76963i(f56561d, "get accountId form metaData：" + this.f56565c);
        return this.f56565c;
    }

    /* JADX INFO: renamed from: b */
    public String m79857b() {
        if (TextUtils.isEmpty(this.f56564b)) {
            this.f56564b = Uri.parse(m79858c()).getHost();
        }
        return this.f56564b;
    }

    /* JADX INFO: renamed from: c */
    public String m79858c() {
        if (TextUtils.isEmpty(this.f56563a)) {
            this.f56563a = ContextHolder.getResourceContext().getString(C18447R.string.networkkit_httpdns_domain);
        }
        return this.f56563a;
    }
}
