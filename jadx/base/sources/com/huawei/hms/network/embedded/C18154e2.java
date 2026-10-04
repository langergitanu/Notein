package com.huawei.hms.network.embedded;

import android.content.Context;
import android.text.TextUtils;
import androidx.appcompat.widget.C21532OooOOo;
import com.huawei.hms.framework.common.CheckParamUtils;
import com.huawei.hms.framework.common.ReflectionUtils;
import com.huawei.hms.framework.network.restclient.dnkeeper.DNKeeperManager;
import com.huawei.hms.framework.network.restclient.dnkeeper.RequestHost;
import com.huawei.hms.framework.network.restclient.hwhttp.dns.DnsResult;

/* JADX INFO: renamed from: com.huawei.hms.network.embedded.e2 */
/* JADX INFO: loaded from: classes9.dex */
public class C18154e2 implements InterfaceC18372u2 {

    /* JADX INFO: renamed from: a */
    public static final String f54606a = "DefaultDNKeeper";

    /* JADX INFO: renamed from: b */
    public static volatile C18154e2 f54607b;

    public C18154e2(Context context) {
        DNKeeperManager.getInstance().init(context.getApplicationContext());
    }

    /* JADX INFO: renamed from: a */
    public static C18154e2 m78290a(Context context) {
        if (!ReflectionUtils.checkCompatible("com.huawei.hms.framework.network.restclient.dnkeeper.DNKeeperManager")) {
            return null;
        }
        CheckParamUtils.checkNotNull(context, "context == null");
        if (f54607b == null) {
            f54607b = new C18154e2(context);
        }
        return f54607b;
    }

    /* JADX INFO: renamed from: a */
    private C18385v2 m78291a(DnsResult dnsResult) {
        C18385v2 c18385v2 = new C18385v2();
        if (dnsResult != null && !dnsResult.isEmpty()) {
            c18385v2.m79685c(dnsResult.getType());
            c18385v2.m79675a(dnsResult.getCreateTime());
            c18385v2.m79674a(dnsResult.getCache());
            c18385v2.m79683b(dnsResult.getIpList());
        }
        return c18385v2;
    }

    @Override // com.huawei.hms.network.embedded.InterfaceC18372u2
    /* JADX INFO: renamed from: a */
    public C18385v2 mo78292a(String str, String str2, int i) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        RequestHost requestHost = new RequestHost(str);
        requestHost.setFailIP(str2);
        requestHost.setDnsFailType(C21532OooOOo.OooO0OO(i, ""));
        requestHost.enableAccelerate(true);
        return m78291a(DNKeeperManager.getInstance().queryIpsSync(requestHost));
    }

    @Override // com.huawei.hms.network.embedded.InterfaceC18372u2
    /* JADX INFO: renamed from: a */
    public String mo78293a() {
        return DNKeeperManager.getInstance().getDomainName();
    }

    @Override // com.huawei.hms.network.embedded.InterfaceC18372u2
    /* JADX INFO: renamed from: a */
    public void mo78294a(int i) {
        DNKeeperManager.getInstance().setRequestIntervalFailed(i);
    }

    @Override // com.huawei.hms.network.embedded.InterfaceC18372u2
    /* JADX INFO: renamed from: a */
    public boolean mo78295a(String str) {
        return DNKeeperManager.getInstance().removeCache(str);
    }
}
