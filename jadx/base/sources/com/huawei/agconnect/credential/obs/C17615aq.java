package com.huawei.agconnect.credential.obs;

import android.content.Context;
import android.text.TextUtils;
import com.huawei.agconnect.AGConnectInstance;
import com.huawei.agconnect.common.api.Logger;
import com.huawei.agconnect.core.service.EndpointService;
import com.huawei.hms.network.embedded.C18241k5;
import java.io.IOException;
import java.net.UnknownHostException;
import java.util.concurrent.Callable;
import o0O00OOO.C25835OooO0oo;
import o0O00OOO.OooO0o;
import o0O00Oo.C25840OooO0oo;
import o0O00Oo.OooO;
import okhttp3.Dns;

/* JADX INFO: renamed from: com.huawei.agconnect.credential.obs.aq */
/* JADX INFO: loaded from: classes8.dex */
public class C17615aq implements EndpointService {

    /* JADX INFO: renamed from: a */
    private static final String f52136a = "EndpointServiceImpl";

    /* JADX INFO: renamed from: b */
    private C17602ad f52137b;

    /* JADX INFO: renamed from: c */
    private boolean f52138c;

    /* JADX INFO: renamed from: com.huawei.agconnect.credential.obs.aq$a */
    public static class a implements Callable<String> {

        /* JADX INFO: renamed from: a */
        String f52139a;

        /* JADX INFO: renamed from: b */
        String f52140b;

        /* JADX INFO: renamed from: a */
        public static a m75497a(String str, String str2) {
            a aVar = new a();
            aVar.f52139a = str;
            aVar.f52140b = str2;
            return aVar;
        }

        @Override // java.util.concurrent.Callable
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public String call() throws IOException {
            if (m75498a(this.f52139a)) {
                return this.f52139a;
            }
            if (m75498a(this.f52140b)) {
                return this.f52140b;
            }
            throw new IOException("main/backup url both are invalid");
        }

        /* JADX INFO: renamed from: a */
        private boolean m75498a(String str) {
            if (TextUtils.isEmpty(str)) {
                return false;
            }
            try {
                int iIndexOf = str.indexOf(C18241k5.f55433h);
                Dns.f124108OooO00o.lookup(iIndexOf != -1 ? str.substring(0, iIndexOf) : str);
                return true;
            } catch (UnknownHostException unused) {
                Logger.m75327e(C17615aq.f52136a, "checkUrl#UnknownHostException:" + str);
                return false;
            }
        }
    }

    public C17615aq(Context context, AGConnectInstance aGConnectInstance) {
        this.f52138c = false;
        this.f52137b = new C17602ad(aGConnectInstance.getOptions().getString("agcgw/url"), aGConnectInstance.getOptions().getString("agcgw/backurl"));
        if (C17648z.m75619a().m75625b().containsKey(this.f52137b)) {
            this.f52137b = C17648z.m75619a().m75625b().get(this.f52137b).m75463b();
            this.f52138c = C17648z.m75619a().m75625b().get(this.f52137b).m75464c().booleanValue();
        }
    }

    /* JADX WARN: Type inference failed for: r0v5, types: [TResult, java.lang.String] */
    @Override // com.huawei.agconnect.core.service.EndpointService
    public OooO0o<String> getEndpointDomain(boolean z) {
        if (z || !this.f52138c) {
            return OooO.OooO00o(a.m75497a(this.f52137b.m75435a(), this.f52137b.m75439b()), C25835OooO0oo.f88151OooO0Oo.f88153OooO0O0);
        }
        C25840OooO0oo c25840OooO0oo = new C25840OooO0oo();
        ?? M75440c = this.f52137b.m75440c();
        synchronized (c25840OooO0oo.f88175OooO00o) {
            try {
                if (!c25840OooO0oo.f88176OooO0O0) {
                    c25840OooO0oo.f88176OooO0O0 = true;
                    c25840OooO0oo.f88177OooO0OO = M75440c;
                    c25840OooO0oo.f88175OooO00o.notifyAll();
                    c25840OooO0oo.OooOO0o();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return c25840OooO0oo;
    }
}
