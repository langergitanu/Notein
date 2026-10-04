package com.huawei.hms.network.embedded;

import com.huawei.hms.network.embedded.C18188g8;
import com.huawei.hms.network.embedded.C18377u7;
import com.huawei.hms.network.embedded.InterfaceC18429y7;
import java.io.IOException;
import java.net.ProtocolException;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.TimeUnit;

/* JADX INFO: renamed from: com.huawei.hms.network.embedded.ga */
/* JADX INFO: loaded from: classes9.dex */
public final class C18190ga implements InterfaceC18327q9 {

    /* JADX INFO: renamed from: i */
    public static final String f54964i = "host";

    /* JADX INFO: renamed from: m */
    public static final String f54968m = "te";

    /* JADX INFO: renamed from: n */
    public static final String f54969n = "encoding";

    /* JADX INFO: renamed from: b */
    public final InterfaceC18429y7.a f54973b;

    /* JADX INFO: renamed from: c */
    public final C18217i9 f54974c;

    /* JADX INFO: renamed from: d */
    public final C18176fa f54975d;

    /* JADX INFO: renamed from: e */
    public volatile C18218ia f54976e;

    /* JADX INFO: renamed from: f */
    public final EnumC18132c8 f54977f;

    /* JADX INFO: renamed from: g */
    public volatile boolean f54978g;

    /* JADX INFO: renamed from: h */
    public static final String f54963h = "connection";

    /* JADX INFO: renamed from: j */
    public static final String f54965j = "keep-alive";

    /* JADX INFO: renamed from: k */
    public static final String f54966k = "proxy-connection";

    /* JADX INFO: renamed from: l */
    public static final String f54967l = "transfer-encoding";

    /* JADX INFO: renamed from: o */
    public static final String f54970o = "upgrade";

    /* JADX INFO: renamed from: p */
    public static final List<String> f54971p = C18313p8.m79373a(f54963h, "host", f54965j, f54966k, "te", f54967l, "encoding", f54970o, C18134ca.f54487f, C18134ca.f54488g, C18134ca.f54489h, C18134ca.f54490i);

    /* JADX INFO: renamed from: q */
    public static final List<String> f54972q = C18313p8.m79373a(f54963h, "host", f54965j, f54966k, "te", f54967l, "encoding", f54970o);

    public C18190ga(C18118b8 c18118b8, C18217i9 c18217i9, InterfaceC18429y7.a aVar, C18176fa c18176fa) {
        this.f54974c = c18217i9;
        this.f54973b = aVar;
        this.f54975d = c18176fa;
        List<EnumC18132c8> listM77960u = c18118b8.m77960u();
        EnumC18132c8 enumC18132c8 = EnumC18132c8.H2_PRIOR_KNOWLEDGE;
        this.f54977f = listM77960u.contains(enumC18132c8) ? enumC18132c8 : EnumC18132c8.HTTP_2;
    }

    @Override // com.huawei.hms.network.embedded.InterfaceC18327q9
    /* JADX INFO: renamed from: a */
    public long mo78624a(C18188g8 c18188g8) {
        return C18353s9.m79516a(c18188g8);
    }

    @Override // com.huawei.hms.network.embedded.InterfaceC18327q9
    /* JADX INFO: renamed from: b */
    public InterfaceC18234jc mo78629b(C18188g8 c18188g8) {
        return this.f54976e.m78811g();
    }

    @Override // com.huawei.hms.network.embedded.InterfaceC18327q9
    /* JADX INFO: renamed from: c */
    public void mo78631c() throws IOException {
        this.f54976e.m78810f().close();
    }

    @Override // com.huawei.hms.network.embedded.InterfaceC18327q9
    public void cancel() {
        this.f54978g = true;
        if (this.f54976e != null) {
            this.f54976e.m78799a(EnumC18120ba.CANCEL);
        }
    }

    @Override // com.huawei.hms.network.embedded.InterfaceC18327q9
    /* JADX INFO: renamed from: d */
    public void mo78632d() throws IOException {
        this.f54975d.flush();
    }

    /* JADX INFO: renamed from: a */
    public static C18188g8.a m78622a(C18377u7 c18377u7, EnumC18132c8 enumC18132c8) throws IOException {
        C18377u7.a aVar = new C18377u7.a();
        int iM79619d = c18377u7.m79619d();
        C18431y9 c18431y9M79996a = null;
        for (int i = 0; i < iM79619d; i++) {
            String strM79612a = c18377u7.m79612a(i);
            String strM79614b = c18377u7.m79614b(i);
            if (strM79612a.equals(C18134ca.f54486e)) {
                c18431y9M79996a = C18431y9.m79996a("HTTP/1.1 " + strM79614b);
            } else if (!f54972q.contains(strM79612a)) {
                AbstractC18286n8.f55777a.mo77973a(aVar, strM79612a, strM79614b);
            }
        }
        if (c18431y9M79996a != null) {
            return new C18188g8.a().m78597a(enumC18132c8).m78595a(c18431y9M79996a.f56725b).m78603a(c18431y9M79996a.f56726c).m78602a(aVar.m79627a());
        }
        throw new ProtocolException("Expected ':status' header not present");
    }

    @Override // com.huawei.hms.network.embedded.InterfaceC18327q9
    /* JADX INFO: renamed from: b */
    public C18377u7 mo78630b() throws IOException {
        return this.f54976e.m78816l();
    }

    /* JADX INFO: renamed from: b */
    public static List<C18134ca> m78623b(C18160e8 c18160e8) {
        C18377u7 c18377u7M78304e = c18160e8.m78304e();
        ArrayList arrayList = new ArrayList(c18377u7M78304e.m79619d() + 4);
        arrayList.add(new C18134ca(C18134ca.f54492k, c18160e8.m78307h()));
        arrayList.add(new C18134ca(C18134ca.f54493l, C18405w9.m79837a(c18160e8.m78310k())));
        String strM78298a = c18160e8.m78298a("Host");
        if (strM78298a != null) {
            arrayList.add(new C18134ca(C18134ca.f54495n, strM78298a));
        }
        arrayList.add(new C18134ca(C18134ca.f54494m, c18160e8.m78310k().m79940s()));
        int iM79619d = c18377u7M78304e.m79619d();
        for (int i = 0; i < iM79619d; i++) {
            String lowerCase = c18377u7M78304e.m79612a(i).toLowerCase(Locale.US);
            if (!f54971p.contains(lowerCase) || (lowerCase.equals("te") && c18377u7M78304e.m79614b(i).equals("trailers"))) {
                arrayList.add(new C18134ca(lowerCase, c18377u7M78304e.m79614b(i)));
            }
        }
        return arrayList;
    }

    @Override // com.huawei.hms.network.embedded.InterfaceC18327q9
    /* JADX INFO: renamed from: a */
    public C18188g8.a mo78625a(boolean z) throws IOException {
        C18188g8.a aVarM78622a = m78622a(this.f54976e.m78815k(), this.f54977f);
        if (z && AbstractC18286n8.f55777a.mo77966a(aVarM78622a) == 100) {
            return null;
        }
        return aVarM78622a;
    }

    @Override // com.huawei.hms.network.embedded.InterfaceC18327q9
    /* JADX INFO: renamed from: a */
    public C18217i9 mo78626a() {
        return this.f54974c;
    }

    @Override // com.huawei.hms.network.embedded.InterfaceC18327q9
    /* JADX INFO: renamed from: a */
    public InterfaceC18220ic mo78627a(C18160e8 c18160e8, long j) {
        return this.f54976e.m78810f();
    }

    @Override // com.huawei.hms.network.embedded.InterfaceC18327q9
    /* JADX INFO: renamed from: a */
    public void mo78628a(C18160e8 c18160e8) throws IOException {
        if (this.f54976e != null) {
            return;
        }
        this.f54976e = this.f54975d.m78456a(m78623b(c18160e8), c18160e8.m78300b() != null);
        if (this.f54978g) {
            this.f54976e.m78799a(EnumC18120ba.CANCEL);
            throw new IOException("Canceled");
        }
        C18248kc c18248kcM78814j = this.f54976e.m78814j();
        long jMo79649c = this.f54973b.mo79649c();
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        c18248kcM78814j.mo78999b(jMo79649c, timeUnit);
        this.f54976e.m78818n().mo78999b(this.f54973b.mo79647b(), timeUnit);
    }
}
