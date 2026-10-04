package com.huawei.hms.framework.network.grs.p578f;

import android.content.Context;
import android.text.TextUtils;
import com.huawei.hms.framework.common.Logger;
import com.huawei.hms.framework.network.grs.GrsBaseInfo;
import com.huawei.hms.framework.network.grs.p577e.C17933a;
import com.huawei.hms.framework.network.grs.p579g.C17942b;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* JADX INFO: renamed from: com.huawei.hms.framework.network.grs.f.e */
/* JADX INFO: loaded from: classes7.dex */
public class C17940e {

    /* JADX INFO: renamed from: a */
    private static final String f53669a = "e";

    /* JADX INFO: renamed from: b */
    public static final Set<String> f53670b = Collections.unmodifiableSet(new a(16));

    /* JADX INFO: renamed from: com.huawei.hms.framework.network.grs.f.e$a */
    public static class a extends HashSet<String> {
        public a(int i) {
            super(i);
            add("ser_country");
            add("reg_country");
            add("issue_country");
            add("geo_ip");
        }
    }

    /* JADX INFO: renamed from: a */
    private static String m77056a(Context context, C17933a c17933a, String str, GrsBaseInfo grsBaseInfo, boolean z) {
        String serCountry = grsBaseInfo.getSerCountry();
        String regCountry = grsBaseInfo.getRegCountry();
        String issueCountry = grsBaseInfo.getIssueCountry();
        for (String str2 : str.split(">")) {
            if (f53670b.contains(str2.trim())) {
                if ("ser_country".equals(str2.trim()) && !TextUtils.isEmpty(serCountry) && !GrsBaseInfo.CountryCodeSource.UNKNOWN.equals(serCountry)) {
                    Logger.m76963i(f53669a, "current route_by is serCountry and routerCountry is:" + serCountry);
                    return serCountry;
                }
                if ("reg_country".equals(str2.trim()) && !TextUtils.isEmpty(regCountry) && !GrsBaseInfo.CountryCodeSource.UNKNOWN.equals(regCountry)) {
                    Logger.m76963i(f53669a, "current route_by is regCountry and routerCountry is:" + regCountry);
                    return regCountry;
                }
                if ("issue_country".equals(str2.trim()) && !TextUtils.isEmpty(issueCountry) && !GrsBaseInfo.CountryCodeSource.UNKNOWN.equals(issueCountry)) {
                    Logger.m76963i(f53669a, "current route_by is issueCountry and routerCountry is:" + issueCountry);
                    return issueCountry;
                }
                if ("geo_ip".equals(str2.trim())) {
                    String strM77067a = new C17942b(context, c17933a, grsBaseInfo).m77067a(z);
                    Logger.m76963i(f53669a, "current route_by is geo_ip and routerCountry is: " + strM77067a);
                    return strM77067a;
                }
            }
        }
        return "";
    }

    /* JADX INFO: renamed from: b */
    public static String m77057b(Context context, C17933a c17933a, String str, GrsBaseInfo grsBaseInfo, boolean z) {
        if (TextUtils.isEmpty(str)) {
            Logger.m76967w(f53669a, "routeBy must be not empty string or null.");
            return null;
        }
        if (!"no_route".equals(str) && !"unconditional".equals(str)) {
            return m77056a(context, c17933a, str, grsBaseInfo, z);
        }
        Logger.m76965v(f53669a, "routeBy equals NO_ROUTE_POLICY");
        return "no_route_country";
    }
}
