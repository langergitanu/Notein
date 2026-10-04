package com.huawei.hms.network.embedded;

import com.huawei.hms.framework.common.Logger;
import com.huawei.hms.network.httpclient.Request;
import java.net.MalformedURLException;
import java.net.URL;

/* JADX INFO: renamed from: com.huawei.hms.network.embedded.e1 */
/* JADX INFO: loaded from: classes9.dex */
public class C18153e1 {

    /* JADX INFO: renamed from: d */
    public static final String f54602d = "WrappedRequest";

    /* JADX INFO: renamed from: a */
    public Request f54603a;

    /* JADX INFO: renamed from: b */
    public long f54604b = System.currentTimeMillis();

    /* JADX INFO: renamed from: c */
    public String f54605c;

    public C18153e1(Request request) {
        this.f54603a = request;
        this.f54605c = m78286a(request);
    }

    /* JADX INFO: renamed from: a */
    public String m78287a() {
        return this.f54605c;
    }

    /* JADX INFO: renamed from: b */
    public long m78288b() {
        return this.f54604b;
    }

    /* JADX INFO: renamed from: c */
    public boolean m78289c() {
        return new C18170f4(this.f54603a.getOptions()).enableInnerConnectEmptyBody();
    }

    /* JADX INFO: renamed from: a */
    private String m78286a(Request request) {
        try {
            return new URL(request.getUrl()).getHost();
        } catch (MalformedURLException e) {
            Logger.m76965v(f54602d, "get host fail :" + e);
            return C18357t0.f56146f;
        }
    }
}
