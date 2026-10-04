package com.huawei.hms.framework.network.grs.p579g;

import android.content.Context;
import android.text.TextUtils;
import com.huawei.hms.framework.common.Logger;
import com.huawei.hms.framework.common.StringUtils;
import com.huawei.hms.framework.network.grs.C17929a;
import com.huawei.hms.framework.network.grs.GrsBaseInfo;
import com.huawei.hms.framework.network.grs.p577e.C17933a;
import com.huawei.hms.framework.network.grs.p577e.C17935c;
import com.huawei.hms.framework.network.grs.p579g.p581k.C17953c;
import com.huawei.hms.framework.network.grs.p582h.C17959e;
import org.json.JSONException;

/* JADX INFO: renamed from: com.huawei.hms.framework.network.grs.g.b */
/* JADX INFO: loaded from: classes7.dex */
public class C17942b {

    /* JADX INFO: renamed from: a */
    private final Context f53683a;

    /* JADX INFO: renamed from: b */
    private final GrsBaseInfo f53684b;

    /* JADX INFO: renamed from: c */
    private final C17933a f53685c;

    public C17942b(Context context, C17933a c17933a, GrsBaseInfo grsBaseInfo) {
        this.f53683a = context;
        this.f53684b = grsBaseInfo;
        this.f53685c = c17933a;
    }

    /* JADX INFO: renamed from: a */
    public String m77067a(boolean z) {
        String strM77127a;
        String str = C17929a.m76974a(this.f53685c.m77010a().m77020a("geoipCountryCode", ""), "geoip.countrycode").get("ROOT");
        Logger.m76963i("GeoipCountry", "geoIpCountry is: " + str);
        String strM77020a = this.f53685c.m77010a().m77020a("geoipCountryCodetime", "0");
        long j = 0;
        if (!TextUtils.isEmpty(strM77020a) && strM77020a.matches("\\d+")) {
            try {
                j = Long.parseLong(strM77020a);
            } catch (NumberFormatException e) {
                Logger.m76968w("GeoipCountry", "convert urlParamKey from String to Long catch NumberFormatException.", e);
            }
        }
        if (TextUtils.isEmpty(str) || C17959e.m77159a(Long.valueOf(j))) {
            C17953c c17953c = new C17953c(this.f53684b, this.f53683a);
            c17953c.m77135a("geoip.countrycode");
            C17935c c17935cM77016c = this.f53685c.m77016c();
            if (c17935cM77016c != null) {
                try {
                    strM77127a = C17949i.m77127a(c17935cM77016c.m77020a("services", ""), c17953c.m77137c());
                } catch (JSONException e2) {
                    Logger.m76969w("GeoipCountry", "getGeoipCountry merge services occure jsonException. %s", StringUtils.anonymizeMessage(e2.getMessage()));
                    strM77127a = null;
                }
                if (!TextUtils.isEmpty(strM77127a)) {
                    c17935cM77016c.m77024b("services", strM77127a);
                }
            }
            if (z) {
                C17944d c17944dM77123a = this.f53685c.m77014b().m77123a(c17953c, "geoip.countrycode", c17935cM77016c);
                if (c17944dM77123a != null) {
                    str = C17929a.m76974a(c17944dM77123a.m77110j(), "geoip.countrycode").get("ROOT");
                }
                Logger.m76963i("GeoipCountry", "sync request to query geoip.countrycode is:" + str);
            } else {
                Logger.m76963i("GeoipCountry", "async request to query geoip.countrycode");
                this.f53685c.m77014b().m77125a(c17953c, null, "geoip.countrycode", c17935cM77016c);
            }
        }
        return str;
    }
}
