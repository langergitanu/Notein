package com.huawei.hms.network.embedded;

import com.huawei.hms.framework.common.Logger;
import com.huawei.hms.network.httpclient.Request;
import com.huawei.hms.network.inner.api.RequestContext;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: renamed from: com.huawei.hms.network.embedded.a1 */
/* JADX INFO: loaded from: classes9.dex */
public class C18097a1 {

    /* JADX INFO: renamed from: a */
    public String f54128a;

    /* JADX INFO: renamed from: b */
    public Map<String, InterfaceC18111b1> f54129b;

    /* JADX INFO: renamed from: com.huawei.hms.network.embedded.a1$b */
    public static class b {

        /* JADX INFO: renamed from: a */
        public static final C18097a1 f54130a = new C18097a1();
    }

    public C18097a1() {
        this.f54128a = "ModelDispatcher";
        this.f54129b = new HashMap();
    }

    /* JADX INFO: renamed from: c */
    public static C18097a1 m77836c() {
        return b.f54130a;
    }

    /* JADX INFO: renamed from: a */
    public void m77837a() {
        Iterator<InterfaceC18111b1> it = this.f54129b.values().iterator();
        while (it.hasNext()) {
            it.next().mo77919a();
        }
    }

    /* JADX INFO: renamed from: b */
    public void m77841b() {
        Iterator<InterfaceC18111b1> it = this.f54129b.values().iterator();
        while (it.hasNext()) {
            it.next().mo77922b();
        }
    }

    /* JADX INFO: renamed from: a */
    public void m77838a(Request request) {
        String str;
        String str2;
        C18153e1 c18153e1 = new C18153e1(request);
        if (C18357t0.f56146f.equals(c18153e1.m78287a())) {
            str = this.f54128a;
            str2 = "request has error url";
        } else {
            if (!c18153e1.m78289c()) {
                for (InterfaceC18111b1 interfaceC18111b1 : this.f54129b.values()) {
                    Logger.m76958d(this.f54128a, "dispatchRequest");
                    interfaceC18111b1.mo77920a(c18153e1);
                }
                return;
            }
            str = this.f54128a;
            str2 = "request is only connect";
        }
        Logger.m76958d(str, str2);
    }

    /* JADX INFO: renamed from: a */
    public void m77839a(RequestContext requestContext) {
        String str;
        String str2;
        C18153e1 c18153e1 = new C18153e1(requestContext.request());
        if (C18357t0.f56146f.equals(c18153e1.m78287a())) {
            str = this.f54128a;
            str2 = "response has error url";
        } else {
            if (!c18153e1.m78289c()) {
                for (InterfaceC18111b1 interfaceC18111b1 : this.f54129b.values()) {
                    Logger.m76958d(this.f54128a, "dispatchRequest");
                    if (requestContext.requestFinishedInfo() != null) {
                        interfaceC18111b1.mo77921a(requestContext);
                    }
                }
                return;
            }
            str = this.f54128a;
            str2 = "response is only connect";
        }
        Logger.m76958d(str, str2);
    }

    /* JADX INFO: renamed from: a */
    public void m77840a(String str, InterfaceC18111b1 interfaceC18111b1) {
        this.f54129b.put(str, interfaceC18111b1);
    }
}
