package com.huawei.hms.network.embedded;

import android.text.TextUtils;
import com.huawei.hms.framework.common.Logger;

/* JADX INFO: renamed from: com.huawei.hms.network.embedded.o2 */
/* JADX INFO: loaded from: classes9.dex */
public abstract class AbstractRunnableC18294o2 implements Runnable {

    /* JADX INFO: renamed from: g */
    public static final String f55808g = "DNResolver";

    /* JADX INFO: renamed from: a */
    public final String f55809a;

    /* JADX INFO: renamed from: b */
    public final int f55810b;

    /* JADX INFO: renamed from: c */
    public C18385v2 f55811c;

    /* JADX INFO: renamed from: d */
    public a f55812d;

    /* JADX INFO: renamed from: e */
    public AbstractC18113b3 f55813e;

    /* JADX INFO: renamed from: f */
    public String f55814f;

    /* JADX INFO: renamed from: com.huawei.hms.network.embedded.o2$a */
    public interface a {
        /* JADX INFO: renamed from: a */
        void mo79266a(String str, C18385v2 c18385v2);

        /* JADX INFO: renamed from: a */
        void mo79267a(String str, Throwable th);
    }

    /* JADX INFO: renamed from: com.huawei.hms.network.embedded.o2$b */
    public static final class b implements a {
        @Override // com.huawei.hms.network.embedded.AbstractRunnableC18294o2.a
        /* JADX INFO: renamed from: a */
        public void mo79266a(String str, C18385v2 c18385v2) {
            C18224j2.m78843a(str, c18385v2);
        }

        @Override // com.huawei.hms.network.embedded.AbstractRunnableC18294o2.a
        /* JADX INFO: renamed from: a */
        public void mo79267a(String str, Throwable th) {
        }
    }

    public AbstractRunnableC18294o2(String str, int i, String str2) {
        this.f55809a = str;
        this.f55810b = i;
        this.f55814f = str2;
        this.f55812d = null;
        this.f55813e = C18126c2.m78048j().m78066c().mo77927a(this);
    }

    /* JADX INFO: renamed from: a */
    public C18385v2 m79263a() {
        return this.f55811c;
    }

    /* JADX INFO: renamed from: b */
    public String m79265b() {
        return this.f55814f;
    }

    /* JADX INFO: renamed from: c */
    public abstract C18385v2 mo79227c();

    @Override // java.lang.Runnable
    public void run() {
        this.f55813e.m77924a();
        if (TextUtils.isEmpty(this.f55809a)) {
            this.f55813e.m77926a(new Exception("domain == null"));
            return;
        }
        m79264a(mo79227c());
        if (!C18196h2.m78675b(this.f55811c)) {
            this.f55813e.m77925a(this.f55811c);
            a aVar = this.f55812d;
            if (aVar != null) {
                aVar.mo79266a(this.f55809a, this.f55811c);
                return;
            }
            return;
        }
        Logger.m76963i(f55808g, C18126c2.m78048j().m78054a(this.f55810b) + " query failed, dnsResult is null, domain:" + this.f55809a);
        StringBuilder sb = new StringBuilder("query failed, dnsResult is null, domain:");
        sb.append(this.f55809a);
        Exception exc = new Exception(sb.toString());
        this.f55813e.m77926a(exc);
        a aVar2 = this.f55812d;
        if (aVar2 != null) {
            aVar2.mo79267a(this.f55809a, exc);
        }
    }

    public AbstractRunnableC18294o2(String str, int i, String str2, a aVar) {
        this.f55809a = str;
        this.f55810b = i;
        this.f55814f = str2;
        this.f55813e = C18126c2.m78048j().m78066c().mo77927a(this);
        this.f55812d = aVar;
    }

    /* JADX INFO: renamed from: a */
    public void m79264a(C18385v2 c18385v2) {
        this.f55811c = c18385v2;
    }
}
