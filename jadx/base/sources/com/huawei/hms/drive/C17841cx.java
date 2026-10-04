package com.huawei.hms.drive;

import com.huawei.hms.drive.C17788ay;
import com.huawei.hms.drive.C17800bj;
import com.huawei.hms.drive.InterfaceC17793bc;
import com.huawei.hms.network.embedded.C18134ca;
import com.huawei.hms.network.embedded.C18190ga;
import java.io.IOException;
import java.net.ProtocolException;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.TimeUnit;
import oOo00OoO.AbstractC34529OooOO0;
import oOo00OoO.C34524OooO0Oo;
import oOo00OoO.C34527OooO0oO;
import oOo00OoO.C34535OooOOOo;
import oOo00OoO.C34547OooOoo;
import oOo00OoO.InterfaceC34544OooOoO;
import oOo00OoO.InterfaceC34548OooOoo0;

/* JADX INFO: renamed from: com.huawei.hms.drive.cx */
/* JADX INFO: loaded from: classes6.dex */
public final class C17841cx implements InterfaceC17825ch {

    /* JADX INFO: renamed from: b */
    private static final List<String> f53210b = C17806bp.m76333a(C18190ga.f54963h, "host", C18190ga.f54965j, C18190ga.f54966k, "te", C18190ga.f54967l, "encoding", C18190ga.f54970o, C18134ca.f54487f, C18134ca.f54488g, C18134ca.f54489h, C18134ca.f54490i);

    /* JADX INFO: renamed from: c */
    private static final List<String> f53211c = C17806bp.m76333a(C18190ga.f54963h, "host", C18190ga.f54965j, C18190ga.f54966k, "te", C18190ga.f54967l, "encoding", C18190ga.f54970o);

    /* JADX INFO: renamed from: a */
    final C17822ce f53212a;

    /* JADX INFO: renamed from: d */
    private final InterfaceC17793bc.a f53213d;

    /* JADX INFO: renamed from: e */
    private final C17842cy f53214e;

    /* JADX INFO: renamed from: f */
    private C17845da f53215f;

    /* JADX INFO: renamed from: g */
    private final EnumC17796bf f53216g;

    /* JADX INFO: renamed from: com.huawei.hms.drive.cx$a */
    public class a extends AbstractC34529OooOO0 {

        /* JADX INFO: renamed from: a */
        boolean f53217a;

        /* JADX INFO: renamed from: b */
        long f53218b;

        public a(InterfaceC34548OooOoo0 interfaceC34548OooOoo0) {
            super(interfaceC34548OooOoo0);
            this.f53217a = false;
            this.f53218b = 0L;
        }

        /* JADX INFO: renamed from: a */
        private void m76561a(IOException iOException) {
            if (this.f53217a) {
                return;
            }
            this.f53217a = true;
            C17841cx c17841cx = C17841cx.this;
            c17841cx.f53212a.m76464a(false, c17841cx, this.f53218b, iOException);
        }

        @Override // oOo00OoO.AbstractC34529OooOO0, java.io.Closeable, java.lang.AutoCloseable
        public void close() throws IOException {
            super.close();
            m76561a(null);
        }

        @Override // oOo00OoO.AbstractC34529OooOO0, oOo00OoO.InterfaceC34548OooOoo0
        public long read(C34524OooO0Oo c34524OooO0Oo, long j) throws IOException {
            try {
                long j2 = delegate().read(c34524OooO0Oo, j);
                if (j2 <= 0) {
                    return j2;
                }
                this.f53218b += j2;
                return j2;
            } catch (IOException e) {
                m76561a(e);
                throw e;
            }
        }
    }

    public C17841cx(C17795be c17795be, InterfaceC17793bc.a aVar, C17822ce c17822ce, C17842cy c17842cy) {
        this.f53213d = aVar;
        this.f53212a = c17822ce;
        this.f53214e = c17842cy;
        List<EnumC17796bf> listM76216v = c17795be.m76216v();
        EnumC17796bf enumC17796bf = EnumC17796bf.H2_PRIOR_KNOWLEDGE;
        this.f53216g = listM76216v.contains(enumC17796bf) ? enumC17796bf : EnumC17796bf.HTTP_2;
    }

    @Override // com.huawei.hms.drive.InterfaceC17825ch
    /* JADX INFO: renamed from: a */
    public InterfaceC34544OooOoO mo76474a(C17798bh c17798bh, long j) {
        return this.f53215f.m76668h();
    }

    @Override // com.huawei.hms.drive.InterfaceC17825ch
    /* JADX INFO: renamed from: b */
    public void mo76477b() throws IOException {
        this.f53215f.m76668h().close();
    }

    @Override // com.huawei.hms.drive.InterfaceC17825ch
    /* JADX INFO: renamed from: c */
    public void mo76478c() {
        C17845da c17845da = this.f53215f;
        if (c17845da != null) {
            c17845da.m76660b(EnumC17837ct.CANCEL);
        }
    }

    /* JADX INFO: renamed from: b */
    public static List<C17838cu> m76560b(C17798bh c17798bh) {
        C17788ay c17788ayM76264c = c17798bh.m76264c();
        ArrayList arrayList = new ArrayList(c17788ayM76264c.m76072a() + 4);
        arrayList.add(new C17838cu(C17838cu.f53179c, c17798bh.m76263b()));
        arrayList.add(new C17838cu(C17838cu.f53180d, C17831cn.m76501a(c17798bh.m76261a())));
        String strM76262a = c17798bh.m76262a("Host");
        if (strM76262a != null) {
            arrayList.add(new C17838cu(C17838cu.f53182f, strM76262a));
        }
        arrayList.add(new C17838cu(C17838cu.f53181e, c17798bh.m76261a().m76145b()));
        int iM76072a = c17788ayM76264c.m76072a();
        for (int i = 0; i < iM76072a; i++) {
            String lowerCase = c17788ayM76264c.m76073a(i).toLowerCase(Locale.US);
            C34527OooO0oO c34527OooO0oO = C34527OooO0oO.f123734OooOoO;
            C34527OooO0oO c34527OooO0oOOooO0O0 = C34527OooO0oO.OooO00o.OooO0O0(lowerCase);
            if (!f53210b.contains(c34527OooO0oOOooO0O0.OooOOO0())) {
                arrayList.add(new C17838cu(c34527OooO0oOOooO0O0, c17788ayM76264c.m76076b(i)));
            }
        }
        return arrayList;
    }

    @Override // com.huawei.hms.drive.InterfaceC17825ch
    /* JADX INFO: renamed from: a */
    public void mo76476a(C17798bh c17798bh) throws IOException {
        if (this.f53215f != null) {
            return;
        }
        try {
            C17845da c17845daM76578a = this.f53214e.m76578a(m76560b(c17798bh), c17798bh.m76265d() != null);
            this.f53215f = c17845daM76578a;
            C34547OooOoo c34547OooOooM76665e = c17845daM76578a.m76665e();
            long jMo76184c = this.f53213d.mo76184c();
            TimeUnit timeUnit = TimeUnit.MILLISECONDS;
            c34547OooOooM76665e.timeout(jMo76184c, timeUnit);
            this.f53215f.m76666f().timeout(this.f53213d.mo76185d(), timeUnit);
        } catch (IOException e) {
            this.f53212a.m76468e();
            throw e;
        }
    }

    @Override // com.huawei.hms.drive.InterfaceC17825ch
    /* JADX INFO: renamed from: a */
    public void mo76475a() throws IOException {
        this.f53214e.m76591b();
    }

    @Override // com.huawei.hms.drive.InterfaceC17825ch
    /* JADX INFO: renamed from: a */
    public C17800bj.a mo76472a(boolean z) throws IOException {
        C17800bj.a aVarM76559a = m76559a(this.f53215f.m76664d(), this.f53216g);
        if (z && AbstractC17804bn.f52952a.mo76221a(aVarM76559a) == 100) {
            return null;
        }
        return aVarM76559a;
    }

    /* JADX INFO: renamed from: a */
    public static C17800bj.a m76559a(C17788ay c17788ay, EnumC17796bf enumC17796bf) throws IOException {
        C17788ay.a aVar = new C17788ay.a();
        int iM76072a = c17788ay.m76072a();
        C17833cp c17833cpM76514a = null;
        for (int i = 0; i < iM76072a; i++) {
            String strM76073a = c17788ay.m76073a(i);
            String strM76076b = c17788ay.m76076b(i);
            if (strM76073a.equals(C18134ca.f54486e)) {
                c17833cpM76514a = C17833cp.m76514a("HTTP/1.1 " + strM76076b);
            } else if (!f53211c.contains(strM76073a)) {
                AbstractC17804bn.f52952a.mo76228a(aVar, strM76073a, strM76076b);
            }
        }
        if (c17833cpM76514a != null) {
            return new C17800bj.a().m76299a(enumC17796bf).m76295a(c17833cpM76514a.f53137b).m76303a(c17833cpM76514a.f53138c).m76298a(aVar.m76081a());
        }
        throw new ProtocolException("Expected ':status' header not present");
    }

    @Override // com.huawei.hms.drive.InterfaceC17825ch
    /* JADX INFO: renamed from: a */
    public AbstractC17801bk mo76473a(C17800bj c17800bj) throws IOException {
        C17822ce c17822ce = this.f53212a;
        c17822ce.f53094c.m76063f(c17822ce.f53093b);
        return new C17830cm(c17800bj.m76281a("Content-Type"), C17827cj.m76485a(c17800bj), C34535OooOOOo.OooO0O0(new a(this.f53215f.m76667g())));
    }
}
