package com.aspose.slides.internal.p474wg;

import com.aspose.slides.exceptions.ArgumentException;
import com.aspose.slides.exceptions.ArgumentNullException;
import com.aspose.slides.exceptions.Exception;
import com.aspose.slides.exceptions.InvalidOperationException;
import com.aspose.slides.exceptions.NotImplementedException;
import com.aspose.slides.internal.p080dd.AbstractC3150x6;
import com.aspose.slides.internal.p118ex.C3819jd;
import com.aspose.slides.internal.p294n9.AbstractC6747ar;
import com.aspose.slides.internal.p294n9.C6765kp;
import com.aspose.slides.internal.p314oc.AbstractC7020m9;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.p559ms.System.AbstractC14049c6;
import com.aspose.slides.p559ms.System.AbstractC14078m9;
import com.aspose.slides.p559ms.System.AbstractC14106wy;
import com.aspose.slides.p559ms.System.C14057f9;
import com.aspose.slides.p559ms.System.C14062gk;
import com.aspose.slides.p559ms.System.C14067j2;
import com.aspose.slides.p559ms.System.C14091t6;
import com.aspose.slides.p559ms.System.C14107wz;
import com.aspose.slides.p559ms.System.C14111xk;
import com.aspose.slides.p559ms.System.C14113y2;
import com.aspose.slides.p559ms.System.InterfaceC14083qm;
import com.aspose.words.StyleIdentifier;
import com.google.common.net.HttpHeaders;
import com.huawei.hms.network.embedded.C18190ga;
import com.huawei.hms.network.embedded.C18224j2;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.locks.ReentrantLock;

/* JADX INFO: renamed from: com.aspose.slides.internal.wg.um */
/* JADX INFO: loaded from: classes5.dex */
public class C11975um extends AbstractC11994yg {

    /* JADX INFO: renamed from: x1 */
    static int f40371x1 = 65536;

    /* JADX INFO: renamed from: ai */
    private boolean f40372ai;

    /* JADX INFO: renamed from: b3 */
    private boolean f40375b3;

    /* JADX INFO: renamed from: c5 */
    private C14062gk f40378c5;

    /* JADX INFO: renamed from: ca */
    private boolean f40380ca;

    /* JADX INFO: renamed from: dq */
    private boolean f40382dq;

    /* JADX INFO: renamed from: dy */
    private C14062gk f40383dy;

    /* JADX INFO: renamed from: e0 */
    private C11934f9 f40384e0;

    /* JADX INFO: renamed from: f9 */
    private boolean f40386f9;

    /* JADX INFO: renamed from: g8 */
    private C11984wy f40388g8;

    /* JADX INFO: renamed from: gi */
    private boolean f40389gi;

    /* JADX INFO: renamed from: ix */
    private InterfaceC11926c6 f40390ix;

    /* JADX INFO: renamed from: j2 */
    private int f40391j2;

    /* JADX INFO: renamed from: jd */
    private boolean f40392jd;

    /* JADX INFO: renamed from: k4 */
    C11917ai f40393k4;

    /* JADX INFO: renamed from: kk */
    C11917ai f40394kk;

    /* JADX INFO: renamed from: ks */
    private boolean f40396ks;

    /* JADX INFO: renamed from: ne */
    private C11925c5 f40398ne;

    /* JADX INFO: renamed from: qm */
    private C11953m2 f40400qm;

    /* JADX INFO: renamed from: ri */
    private boolean f40403ri;

    /* JADX INFO: renamed from: s7 */
    private int f40405s7;

    /* JADX INFO: renamed from: ss */
    private AbstractC14049c6 f40406ss;

    /* JADX INFO: renamed from: sv */
    private C11998zj f40407sv;

    /* JADX INFO: renamed from: t6 */
    private byte[] f40408t6;

    /* JADX INFO: renamed from: tq */
    private boolean f40409tq;

    /* JADX INFO: renamed from: ts */
    private boolean f40410ts;

    /* JADX INFO: renamed from: u4 */
    private boolean f40411u4;

    /* JADX INFO: renamed from: up */
    private C3819jd f40413up;

    /* JADX INFO: renamed from: uz */
    private boolean f40414uz;

    /* JADX INFO: renamed from: vh */
    private Exception f40416vh;

    /* JADX INFO: renamed from: vj */
    private boolean f40417vj;

    /* JADX INFO: renamed from: wl */
    private boolean f40419wl;

    /* JADX INFO: renamed from: wp */
    private C11998zj f40420wp;

    /* JADX INFO: renamed from: wy */
    private boolean f40421wy;

    /* JADX INFO: renamed from: x6 */
    private AbstractC11982wl f40422x6;

    /* JADX INFO: renamed from: xk */
    private C14107wz f40423xk;

    /* JADX INFO: renamed from: xw */
    private int f40424xw;

    /* JADX INFO: renamed from: yj */
    private String f40426yj;

    /* JADX INFO: renamed from: zj */
    private String f40427zj;

    /* JADX INFO: renamed from: ck */
    private boolean f40381ck = true;

    /* JADX INFO: renamed from: fa */
    private boolean f40387fa = true;

    /* JADX INFO: renamed from: rv */
    private long f40404rv = -1;

    /* JADX INFO: renamed from: ar */
    private boolean f40374ar = true;

    /* JADX INFO: renamed from: um */
    private int f40412um = 50;

    /* JADX INFO: renamed from: bv */
    private String f40376bv = C14113y2.f47374k4;

    /* JADX INFO: renamed from: v4 */
    private String f40415v4 = "GET";

    /* JADX INFO: renamed from: lr */
    private String f40397lr = "GET";

    /* JADX INFO: renamed from: yd */
    private boolean f40425yd = true;

    /* JADX INFO: renamed from: ak */
    private C14107wz f40373ak = C11919ar.f40173x1;

    /* JADX INFO: renamed from: bz */
    private int f40377bz = 100000;

    /* JADX INFO: renamed from: kp */
    private AtomicInteger f40395kp = new AtomicInteger(0);

    /* JADX INFO: renamed from: qw */
    private final ReentrantLock f40402qw = new ReentrantLock();

    /* JADX INFO: renamed from: w6 */
    private int f40418w6 = C18224j2.f55304c;

    /* JADX INFO: renamed from: os */
    private k4 f40399os = new k4();

    /* JADX INFO: renamed from: em */
    private k4 f40385em = new k4();

    /* JADX INFO: renamed from: c6 */
    private InterfaceC11968sv f40379c6 = C11977uz.m56249k4();

    /* JADX INFO: renamed from: qq */
    private C11973u1 f40401qq = new C11973u1(1);

    /* JADX INFO: renamed from: com.aspose.slides.internal.wg.um$k4 */
    public static class k4 extends AbstractC7020m9<k4> {

        /* JADX INFO: renamed from: kk */
        static final /* synthetic */ boolean f40428kk = true;

        /* JADX INFO: renamed from: du */
        private int f40429du;

        /* JADX INFO: renamed from: k4 */
        C11975um f40430k4;

        /* JADX INFO: renamed from: to */
        private boolean f40431to;

        /* JADX INFO: renamed from: x1 */
        boolean f40432x1;

        public k4() {
        }

        public Object clone() {
            return Clone();
        }

        @Override // com.aspose.slides.p559ms.System.AbstractC14079na
        /* JADX INFO: renamed from: du, reason: merged with bridge method [inline-methods] */
        public k4 Clone() {
            k4 k4Var = new k4();
            CloneTo(k4Var);
            return k4Var;
        }

        public boolean equals(Object obj) {
            if (!f40428kk && obj == null) {
                throw new AssertionError();
            }
            if (C14067j2.m66729x1(null, obj)) {
                return false;
            }
            if (C14067j2.m66729x1(this, obj)) {
                return true;
            }
            if (obj instanceof k4) {
                return m56241x1((k4) obj);
            }
            return false;
        }

        @Override // com.aspose.slides.p559ms.System.AbstractC14079na
        /* JADX INFO: renamed from: k4, reason: merged with bridge method [inline-methods] */
        public void CloneTo(k4 k4Var) {
            if (k4Var == null) {
                k4Var = new k4();
            }
            k4Var.f40430k4 = this.f40430k4;
            k4Var.f40432x1 = this.f40432x1;
            k4Var.f40431to = this.f40431to;
            k4Var.f40429du = this.f40429du;
        }

        /* JADX INFO: renamed from: kk */
        public boolean m56246kk() {
            return this.f40431to && this.f40429du != 0;
        }

        /* JADX INFO: renamed from: to */
        public void m56247to() {
            this.f40431to = false;
            this.f40429du = 0;
            this.f40430k4.f40401qq.m56153kk(this.f40432x1 ? HttpHeaders.PROXY_AUTHORIZATION : "Authorization");
        }

        public String toString() {
            return C14113y2.m67402k4("{0}AuthState [{1}:{2}]", this.f40432x1 ? "Proxy" : "", C7019kk.m27444k4(this.f40431to), C7019kk.m27466x1(this.f40429du));
        }

        /* JADX INFO: renamed from: x1 */
        public int m56248x1() {
            return this.f40429du;
        }

        public k4(C11975um c11975um, boolean z) {
            this.f40430k4 = c11975um;
            this.f40432x1 = z;
            this.f40431to = false;
            this.f40429du = 0;
        }

        /* JADX INFO: renamed from: x1 */
        private boolean m56241x1(k4 k4Var) {
            return C14067j2.m66728k4(k4Var.f40430k4, this.f40430k4) && k4Var.f40432x1 == this.f40432x1 && k4Var.f40431to == this.f40431to && k4Var.f40429du == this.f40429du;
        }

        /* JADX INFO: renamed from: k4 */
        public boolean m56244k4() {
            return this.f40431to;
        }

        /* JADX INFO: renamed from: k4 */
        public boolean m56245k4(AbstractC11956my abstractC11956my, int i) {
            InterfaceC11926c6 interfaceC11926c6Mo56111k4;
            this.f40431to = false;
            if (i != 401 || this.f40430k4.f40390ix != null) {
                boolean z = this.f40432x1;
                if (z == (i == 407)) {
                    if (!z || (this.f40430k4.f40379c6 != null && this.f40430k4.f40379c6.mo56111k4() != null)) {
                        String[] strArrM56152k4 = abstractC11956my.mo56081k4().m56152k4(this.f40432x1 ? HttpHeaders.PROXY_AUTHENTICATE : "WWW-Authenticate", false);
                        if (strArrM56152k4 == null || strArrM56152k4.length == 0) {
                            return false;
                        }
                        if (!this.f40432x1) {
                            interfaceC11926c6Mo56111k4 = this.f40430k4.f40390ix;
                        } else {
                            interfaceC11926c6Mo56111k4 = this.f40430k4.f40379c6.mo56111k4();
                        }
                        C11986x1 c11986x1M55996k4 = null;
                        for (String str : strArrM56152k4) {
                            c11986x1M55996k4 = C11948k4.m55996k4(str, this.f40430k4, interfaceC11926c6Mo56111k4);
                            if (c11986x1M55996k4 != null) {
                                break;
                            }
                        }
                        if (c11986x1M55996k4 != null) {
                            this.f40430k4.f40401qq.set_Item(this.f40432x1 ? HttpHeaders.PROXY_AUTHORIZATION : "Authorization", c11986x1M55996k4.m56267k4());
                            this.f40431to = c11986x1M55996k4.m56270x1();
                            if ("NTLM".equals(c11986x1M55996k4.m56269kk().mo15101k4())) {
                                this.f40429du++;
                            }
                            return true;
                        }
                        return false;
                    }
                    return false;
                }
                return false;
            }
            return false;
        }
    }

    public C11975um(C14062gk c14062gk) {
        this.f40383dy = c14062gk;
        this.f40378c5 = c14062gk;
        m56220k4(true);
        m56161dq();
    }

    /* JADX INFO: renamed from: c6 */
    private void m56159c6() {
        this.f40415v4 = "GET";
        this.f40401qq.m56153kk(HttpHeaders.TRANSFER_ENCODING);
        this.f40410ts = false;
    }

    /* JADX INFO: renamed from: dq */
    private void m56161dq() {
        this.f40399os = new k4(this, false);
        this.f40385em = new k4(this, true);
    }

    /* JADX INFO: renamed from: e0 */
    private void m56164e0() {
        InterfaceC11968sv interfaceC11968sv = this.f40379c6;
        boolean z = (interfaceC11968sv == null || interfaceC11968sv.mo56113x1(this.f40378c5)) ? false : true;
        C11986x1 c11986x1M55995k4 = C11948k4.m55995k4(this, (z && this.f40390ix == null) ? this.f40379c6.mo56111k4() : this.f40390ix);
        if (c11986x1M55995k4 == null) {
            return;
        }
        C11973u1 c11973u1 = this.f40401qq;
        String str = HttpHeaders.PROXY_AUTHORIZATION;
        c11973u1.m56153kk(HttpHeaders.PROXY_AUTHORIZATION);
        this.f40401qq.m56153kk("Authorization");
        if (!z || this.f40390ix != null) {
            str = "Authorization";
        }
        this.f40401qq.set_Item(str, c11986x1M55995k4.m56267k4());
        this.f40421wy = true;
    }

    /* JADX INFO: renamed from: ts */
    private String m56189ts() {
        boolean z;
        C11973u1 c11973u1;
        String str;
        boolean z2 = true;
        if (this.f40410ts) {
            this.f40401qq.m56150du(HttpHeaders.TRANSFER_ENCODING, "chunked");
            this.f40401qq.m56153kk("Content-Length");
            z = true;
        } else if (this.f40404rv != -1) {
            if (this.f40399os.m56248x1() == 1 || this.f40385em.m56248x1() == 1) {
                if (this.f40396ks || this.f40389gi || this.f40404rv > 0) {
                    this.f40401qq.m56155to("Content-Length", "0");
                } else {
                    this.f40401qq.m56153kk("Content-Length");
                }
                z = false;
            } else {
                long j = this.f40404rv;
                z = j > 0;
                if (this.f40396ks || this.f40389gi || j > 0) {
                    this.f40401qq.m56155to("Content-Length", C14091t6.m67191x1(j));
                }
            }
            this.f40401qq.m56153kk(HttpHeaders.TRANSFER_ENCODING);
        } else {
            this.f40401qq.m56153kk("Content-Length");
            z = false;
        }
        C14107wz c14107wz = this.f40423xk;
        C14107wz c14107wz2 = C11919ar.f40173x1;
        if (C14107wz.m67337k4(c14107wz, c14107wz2) && z && this.f40384e0.m55946du()) {
            this.f40401qq.m56150du(HttpHeaders.EXPECT, "100-continue");
            this.f40386f9 = true;
        } else {
            this.f40401qq.m56153kk(HttpHeaders.EXPECT);
            this.f40386f9 = false;
        }
        boolean zM56234uz = m56234uz();
        String str2 = HttpHeaders.CONNECTION;
        String str3 = zM56234uz ? "Proxy-Connection" : HttpHeaders.CONNECTION;
        C11973u1 c11973u12 = this.f40401qq;
        if (!zM56234uz) {
            str2 = "Proxy-Connection";
        }
        c11973u12.m56153kk(str2);
        C14107wz c14107wzM55958kk = this.f40384e0.m55958kk();
        if (c14107wzM55958kk != null && !C14107wz.m67337k4(c14107wzM55958kk, C11919ar.f40172k4)) {
            z2 = false;
        }
        if (this.f40374ar && (C14107wz.m67337k4(this.f40373ak, C11919ar.f40172k4) || z2)) {
            String str4 = this.f40401qq.get_Item(str3);
            str = C18190ga.f54965j;
            if (str4 == null || C14113y2.m67367h4(this.f40401qq.get_Item(str3), C18190ga.f54965j, (short) 5) == -1) {
                c11973u1 = this.f40401qq;
                c11973u1.m56150du(str3, str);
            }
        } else if (!this.f40374ar && C14107wz.m67337k4(this.f40373ak, c14107wz2)) {
            c11973u1 = this.f40401qq;
            str = "close";
            c11973u1.m56150du(str3, str);
        }
        this.f40401qq.m56155to("Host", m56200c5());
        C11925c5 c11925c5 = this.f40398ne;
        if (c11925c5 != null) {
            String strM55891k4 = c11925c5.m55891k4(this.f40378c5);
            if ("".equals(strM55891k4)) {
                this.f40401qq.m56153kk(HttpHeaders.COOKIE);
            } else {
                this.f40401qq.m56150du(HttpHeaders.COOKIE, strM55891k4);
            }
        }
        int i = this.f40391j2;
        String str5 = (i & 1) != 0 ? "gzip" : null;
        if ((i & 2) != 0) {
            str5 = str5 != null ? "gzip, deflate" : "deflate";
        }
        if (str5 != null) {
            this.f40401qq.m56150du(HttpHeaders.ACCEPT_ENCODING, str5);
        }
        if (!this.f40421wy && this.f40375b3) {
            m56164e0();
        }
        return this.f40401qq.toString();
    }

    /* JADX INFO: renamed from: xk */
    private void m56196xk() {
        if (this.f40419wl) {
            throw new InvalidOperationException("request started");
        }
    }

    /* JADX INFO: renamed from: ar */
    public boolean m56198ar() {
        return this.f40409tq;
    }

    @Override // com.aspose.slides.internal.p474wg.AbstractC11994yg
    /* JADX INFO: renamed from: bv */
    public void mo56199bv() {
        if (this.f40395kp.compareAndSet(0, 1)) {
            return;
        }
        if (this.f40411u4 && this.f40409tq) {
            return;
        }
        this.f40411u4 = true;
        AbstractC14049c6 abstractC14049c6 = this.f40406ss;
        if (abstractC14049c6 != null) {
            try {
                abstractC14049c6.mo1379k4(this, C14111xk.f47371x1);
            } catch (RuntimeException unused) {
            }
            this.f40406ss = null;
        }
        C11998zj c11998zj = this.f40407sv;
        if (c11998zj != null) {
            if (!c11998zj.mo18728kk()) {
                try {
                    c11998zj.m56123k4(false, (Exception) new C11997yo("Aborted.", 6));
                    c11998zj.m56292ck();
                } catch (RuntimeException unused2) {
                }
            }
            this.f40407sv = null;
        }
        C11998zj c11998zj2 = this.f40420wp;
        if (c11998zj2 != null) {
            if (!c11998zj2.mo18728kk()) {
                try {
                    c11998zj2.m56123k4(false, (Exception) new C11997yo("Aborted.", 6));
                    c11998zj2.m56292ck();
                } catch (RuntimeException unused3) {
                }
            }
            this.f40420wp = null;
        }
        C11953m2 c11953m2 = this.f40400qm;
        if (c11953m2 != null) {
            try {
                c11953m2.close();
                this.f40400qm = null;
            } catch (RuntimeException unused4) {
            }
        }
        C11984wy c11984wy = this.f40388g8;
        if (c11984wy != null) {
            try {
                c11984wy.mo56082m9();
                this.f40388g8 = null;
            } catch (RuntimeException unused5) {
            }
        }
    }

    /* JADX INFO: renamed from: c5 */
    public String m56200c5() {
        String str = this.f40427zj;
        return str == null ? this.f40378c5.m66688kk() : str;
    }

    /* JADX INFO: renamed from: ck */
    public int m56201ck() {
        return this.f40418w6;
    }

    @Override // com.aspose.slides.internal.p474wg.AbstractC11994yg
    /* JADX INFO: renamed from: du */
    public long mo56202du() {
        return this.f40404rv;
    }

    /* JADX INFO: renamed from: ix */
    public boolean m56206ix() {
        return this.f40386f9;
    }

    /* JADX INFO: renamed from: lr */
    public boolean m56224lr() {
        return this.f40380ca;
    }

    @Override // com.aspose.slides.internal.p474wg.AbstractC11994yg
    /* JADX INFO: renamed from: m9 */
    public InterfaceC11926c6 mo56225m9() {
        return this.f40390ix;
    }

    /* JADX INFO: renamed from: ne */
    public boolean m56226ne() {
        return this.f40403ri;
    }

    @Override // com.aspose.slides.internal.p474wg.AbstractC11994yg
    /* JADX INFO: renamed from: qq */
    public AbstractC11956my mo56227qq() {
        return mo56208k4(mo56210k4((AbstractC14078m9) null, (Object) null));
    }

    /* JADX INFO: renamed from: rv */
    public C11934f9 m56228rv() {
        return m56236wl();
    }

    /* JADX INFO: renamed from: to */
    public C3819jd m56229to() {
        if (this.f40413up == null) {
            this.f40413up = new C3819jd();
        }
        return this.f40413up;
    }

    /* JADX INFO: renamed from: u4 */
    public C14062gk m56231u4() {
        return this.f40378c5;
    }

    /* JADX INFO: renamed from: um */
    public boolean m56232um() {
        return !this.f40395kp.compareAndSet(0, 0);
    }

    @Override // com.aspose.slides.internal.p474wg.AbstractC11994yg
    /* JADX INFO: renamed from: up */
    public InterfaceC11968sv mo56233up() {
        return this.f40379c6;
    }

    /* JADX INFO: renamed from: uz */
    public boolean m56234uz() {
        return this.f40384e0.m55948h4() && !this.f40384e0.m55960m9();
    }

    /* JADX INFO: renamed from: v4 */
    public byte[] m56235v4() {
        C6765kp c6765kp = new C6765kp();
        String strM66680fa = !m56234uz() ? this.f40378c5.m66680fa() : C14113y2.m67402k4("{0}://{1}{2}", this.f40378c5.m66689ks(), m56200c5(), this.f40378c5.m66680fa());
        this.f40423xk = (this.f40382dq || this.f40384e0.m55958kk() == null || !C14107wz.m67338kk(this.f40384e0.m55958kk(), this.f40373ak)) ? this.f40373ak : this.f40384e0.m55958kk();
        c6765kp.m26796k4("{0} {1} HTTP/{2}.{3}\r\n", this.f40415v4, strM66680fa, C7019kk.m27466x1(this.f40423xk.m67340k4()), C7019kk.m27466x1(this.f40423xk.m67343x1()));
        c6765kp.m26792k4(m56189ts());
        return AbstractC6747ar.m26635ix().mo26677to(c6765kp.toString());
    }

    /* JADX INFO: renamed from: wl */
    public C11934f9 m56236wl() {
        synchronized (this.f40402qw) {
            try {
                if (this.f40392jd || this.f40384e0 == null) {
                    this.f40384e0 = C11980vj.m56254k4(this.f40378c5, this.f40379c6);
                    this.f40392jd = false;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return this.f40384e0;
    }

    /* JADX INFO: renamed from: x1 */
    public int m56237x1() {
        return this.f40391j2;
    }

    @Override // com.aspose.slides.internal.p474wg.AbstractC11994yg
    /* JADX INFO: renamed from: yj */
    public C14062gk mo56240yj() {
        return this.f40383dy;
    }

    @Override // com.aspose.slides.internal.p474wg.AbstractC11994yg
    /* JADX INFO: renamed from: dy */
    public C11973u1 mo56203dy() {
        return this.f40401qq;
    }

    @Override // com.aspose.slides.internal.p474wg.AbstractC11994yg
    /* JADX INFO: renamed from: fa */
    public String mo56204fa() {
        return this.f40415v4;
    }

    /* JADX INFO: renamed from: h4 */
    public boolean m56205h4() {
        return this.f40372ai;
    }

    /* JADX INFO: renamed from: jd */
    public boolean m56207jd() {
        return this.f40374ar;
    }

    /* JADX INFO: renamed from: kk */
    public void m56221kk(boolean z) {
        this.f40409tq = z;
    }

    /* JADX INFO: renamed from: ks */
    public boolean m56223ks() {
        return this.f40410ts;
    }

    /* JADX INFO: renamed from: to */
    public void m56230to(boolean z) {
        this.f40380ca = z;
    }

    /* JADX INFO: renamed from: x6 */
    public String m56239x6() {
        return this.f40401qq.get_Item(HttpHeaders.TRANSFER_ENCODING);
    }

    /* JADX INFO: renamed from: x1 */
    private void m56192x1(C11941he c11941he) {
        C11953m2 c11953m2;
        int i = c11941he.f40250k4;
        if (i < 400 || i == 401 || i == 407 || (c11953m2 = this.f40400qm) == null || this.f40420wp != null || c11953m2.m56043kk()) {
            return;
        }
        this.f40416vh = new C11997yo(c11941he.f40254x1, null, 7, this.f40388g8);
        if (!this.f40387fa && !this.f40410ts) {
            C11953m2 c11953m22 = this.f40400qm;
            if (c11953m22.f40309x1 < this.f40404rv) {
                c11953m22.f40295kk = true;
                return;
            }
        }
        this.f40388g8.m56264du();
    }

    @Override // com.aspose.slides.internal.p474wg.AbstractC11994yg
    /* JADX INFO: renamed from: k4 */
    public AbstractC11956my mo56208k4(InterfaceC14083qm interfaceC14083qm) {
        if (interfaceC14083qm == null) {
            throw new ArgumentNullException("asyncResult");
        }
        C11998zj c11998zj = (C11998zj) C7019kk.m27452k4((Object) interfaceC14083qm, C11998zj.class);
        if (c11998zj == null) {
            throw new ArgumentException("Invalid IAsyncResult", "asyncResult");
        }
        if (!c11998zj.m56124k4(this.f40377bz, false)) {
            mo56199bv();
            throw new C11997yo("The request timed out", 14);
        }
        if (c11998zj.m56120dy()) {
            throw c11998zj.m56118c5();
        }
        return c11998zj.m56304yj();
    }

    /* JADX INFO: renamed from: kk */
    public boolean m56222kk() {
        return (!this.f40387fa || "HEAD".equals(this.f40415v4) || "GET".equals(this.f40415v4) || "MKCOL".equals(this.f40415v4) || "CONNECT".equals(this.f40415v4) || "TRACE".equals(this.f40415v4)) ? false : true;
    }

    /* JADX INFO: renamed from: x1 */
    public void m56238x1(boolean z) {
        this.f40386f9 = z;
    }

    /* JADX INFO: renamed from: x1 */
    private boolean m56194x1(C11998zj c11998zj) throws Throwable {
        int iM56265kk;
        C11984wy c11984wy;
        C11997yo c11997yo;
        if (c11998zj.m56120dy()) {
            this.f40408t6 = null;
            throw c11998zj.m56118c5();
        }
        Exception exceptionM56118c5 = c11998zj.m56118c5();
        C11984wy c11984wyM56304yj = c11998zj.m56304yj();
        boolean zM56182k4 = false;
        if (exceptionM56118c5 != null || (c11984wy = this.f40388g8) == null) {
            iM56265kk = 0;
        } else {
            iM56265kk = c11984wy.m56265kk();
            if (((!this.f40399os.m56244k4() && iM56265kk == 401 && this.f40390ix != null) || (m56234uz() && !this.f40385em.m56244k4() && iM56265kk == 407)) && !this.f40421wy && m56176k4(this.f40388g8, iM56265kk)) {
                if (m56222kk()) {
                    if (this.f40400qm.m56033du() > 0) {
                        this.f40408t6 = this.f40400qm.m56045to();
                        this.f40424xw = this.f40400qm.m56033du();
                    }
                    return true;
                }
                if (!"PUT".equals(this.f40415v4) && !"POST".equals(this.f40415v4)) {
                    this.f40408t6 = null;
                    return true;
                }
                if (!m56205h4()) {
                    return false;
                }
                this.f40400qm.m56036jd();
                this.f40400qm = null;
                this.f40388g8.mo56082m9();
                this.f40388g8 = null;
                this.f40408t6 = null;
                throw new C11997yo(C14113y2.m67408k4("This request requires buffering ", "of data for authentication or ", "redirection to be sucessful."));
            }
            this.f40408t6 = null;
            if (iM56265kk >= 400) {
                c11997yo = new C11997yo(C14113y2.m67402k4("The remote server returned an error: ({0}) {1}.", C7019kk.m27466x1(iM56265kk), this.f40388g8.m56266to()), null, 7, this.f40388g8);
                this.f40388g8.m56264du();
            } else if (iM56265kk == 304 && this.f40381ck) {
                c11997yo = new C11997yo(C14113y2.m67402k4("The remote server returned an error: ({0}) {1}.", C7019kk.m27466x1(iM56265kk), this.f40388g8.m56266to()), null, 7, this.f40388g8);
            } else if (iM56265kk >= 300 && this.f40381ck && this.f40405s7 >= this.f40412um) {
                exceptionM56118c5 = new C11997yo("Max. redirections exceeded.", null, 7, this.f40388g8);
                this.f40388g8.m56264du();
            }
            exceptionM56118c5 = c11997yo;
        }
        this.f40408t6 = null;
        if (exceptionM56118c5 != null) {
            if (!m56205h4()) {
                return false;
            }
            C11953m2 c11953m2 = this.f40400qm;
            if (c11953m2 != null) {
                c11953m2.m56036jd();
                this.f40400qm = null;
            }
            this.f40388g8 = null;
            throw exceptionM56118c5;
        }
        if (this.f40381ck && iM56265kk >= 300) {
            zM56182k4 = m56182k4(c11998zj, iM56265kk, this.f40388g8);
            if (m56222kk() && this.f40400qm.m56033du() > 0) {
                this.f40408t6 = this.f40400qm.m56045to();
                this.f40424xw = this.f40400qm.m56033du();
            }
            if (zM56182k4 && !this.f40403ri) {
                this.f40399os.m56247to();
                this.f40385em.m56247to();
            }
        }
        if (c11984wyM56304yj != null && iM56265kk >= 300 && iM56265kk != 304) {
            c11984wyM56304yj.m56264du();
        }
        return zM56182k4;
    }

    /* JADX INFO: renamed from: k4 */
    public C14062gk m56209k4() {
        return this.f40378c5;
    }

    @Override // com.aspose.slides.internal.p474wg.AbstractC11994yg
    /* JADX INFO: renamed from: k4 */
    public InterfaceC14083qm mo56210k4(AbstractC14078m9 abstractC14078m9, Object obj) {
        if (m56232um()) {
            throw new C11997yo("The request was canceled.", 6);
        }
        if (this.f40415v4 == null) {
            throw new C11966s7("Method is null.");
        }
        String strM56239x6 = m56239x6();
        if (!this.f40410ts && strM56239x6 != null && !"".equals(C14113y2.m67440x1(strM56239x6))) {
            throw new C11966s7("SendChunked should be true.");
        }
        this.f40402qw.lock();
        this.f40417vj = true;
        if (this.f40420wp != null && !this.f40411u4) {
            this.f40402qw.unlock();
            throw new InvalidOperationException(C14113y2.m67408k4("Cannot re-call start of asynchronous ", "method while a previous call is still in progress."));
        }
        C11998zj c11998zj = new C11998zj(this, abstractC14078m9, obj);
        this.f40420wp = c11998zj;
        this.f40397lr = this.f40415v4;
        C11971tq.m56117k4(this.f40402qw, new C11923bv(this), new C11978v4(this, c11998zj));
        return c11998zj;
    }

    /* JADX INFO: renamed from: k4 */
    public void m56211k4(int i, Exception exception) {
        if (m56232um()) {
            return;
        }
        C11998zj c11998zj = this.f40407sv;
        if (c11998zj == null) {
            c11998zj = this.f40420wp;
        }
        if (c11998zj != null) {
            c11998zj.m56123k4(false, (Exception) (exception == null ? new C11997yo(C14113y2.m67408k4("Error: ", AbstractC14106wy.getName((Class<?>) C11957na.class, i)), i) : new C11997yo(C14113y2.m67402k4("Error: {0} ({1})", C7019kk.m27466x1(i), exception.getMessage()), exception, i)));
            c11998zj.m56292ck();
        }
    }

    /* JADX INFO: renamed from: k4 */
    public void m56212k4(int i, Exception exception, String str) {
        if (m56232um()) {
            return;
        }
        synchronized (this.f40402qw) {
            try {
                String strM67402k4 = C14113y2.m67402k4("Error getting response stream ({0}): {1}", str, C7019kk.m27466x1(i));
                C11998zj c11998zj = this.f40420wp;
                if (c11998zj == null) {
                    c11998zj = this.f40407sv;
                }
                C11997yo c11997yo = C7019kk.m27469x1(exception, C11997yo.class) ? (C11997yo) exception : new C11997yo(strM67402k4, exception, i, null);
                if (c11998zj != null) {
                    if (!c11998zj.mo18728kk()) {
                        c11998zj.m56123k4(false, (Exception) c11997yo);
                        c11998zj.m56292ck();
                    } else if (c11998zj == this.f40407sv) {
                        this.f40416vh = c11997yo;
                    }
                    this.f40411u4 = true;
                    this.f40420wp = null;
                    this.f40407sv = null;
                } else {
                    this.f40411u4 = true;
                    this.f40416vh = c11997yo;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: k4 */
    public void m56213k4(int i, C11973u1 c11973u1) {
        AbstractC11982wl abstractC11982wl = this.f40422x6;
        if (abstractC11982wl != null) {
            abstractC11982wl.m56259k4(i, c11973u1);
        }
    }

    /* JADX INFO: renamed from: k4 */
    public void m56214k4(long j) {
        this.f40404rv = j;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: k4 */
    public void m56172k4(Exception exception) {
        C11997yo c11997yo = (C11997yo) C7019kk.m27452k4((Object) exception, C11997yo.class);
        if (c11997yo != null) {
            m56211k4(c11997yo.m56291k4(), c11997yo);
        } else {
            m56211k4(4, exception);
        }
    }

    @Override // com.aspose.slides.internal.p474wg.AbstractC11994yg
    /* JADX INFO: renamed from: k4 */
    public void mo56215k4(InterfaceC11926c6 interfaceC11926c6) {
        this.f40390ix = interfaceC11926c6;
    }

    /* JADX WARN: Removed duplicated region for block: B:69:0x00dd A[Catch: all -> 0x0011, Exception -> 0x00a8, yo -> 0x00ab, TryCatch #2 {Exception -> 0x00a8, blocks: (B:48:0x0097, B:51:0x009f, B:60:0x00b6, B:62:0x00ba, B:64:0x00c2, B:66:0x00d2, B:67:0x00d9, B:69:0x00dd, B:70:0x00e0, B:58:0x00ae, B:71:0x00eb, B:73:0x00ef, B:74:0x00f8, B:76:0x00fc, B:79:0x0104, B:80:0x0109), top: B:95:0x0097, outer: #0 }] */
    /* JADX INFO: renamed from: k4 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void m56216k4(C11941he c11941he) {
        C11997yo c11997yo;
        boolean z;
        C11953m2 c11953m2;
        C11984wy c11984wy;
        C11953m2 c11953m22;
        synchronized (this.f40402qw) {
            try {
                if (m56232um()) {
                    AbstractC3150x6 abstractC3150x6 = c11941he.f40249h4;
                    if (abstractC3150x6 != null) {
                        abstractC3150x6.close();
                    }
                    return;
                }
                try {
                    this.f40388g8 = new C11984wy(this.f40378c5, this.f40415v4, c11941he, this.f40398ne);
                    c11997yo = null;
                } catch (Exception e) {
                    c11997yo = new C11997yo(e.getMessage(), e, 7, null);
                    AbstractC3150x6 abstractC3150x62 = c11941he.f40249h4;
                    if (abstractC3150x62 != null) {
                        abstractC3150x62.close();
                    }
                }
                if (c11997yo == null && ("POST".equals(this.f40415v4) || "PUT".equals(this.f40415v4))) {
                    m56192x1(c11941he);
                    Exception exception = this.f40416vh;
                    if (exception != null) {
                        c11997yo = (C11997yo) exception;
                    }
                }
                C11998zj c11998zj = this.f40420wp;
                if (c11998zj != null || this.f40388g8 == null) {
                    z = false;
                } else {
                    c11998zj = new C11998zj(null, null);
                    c11998zj.m56299k4(false, this.f40388g8);
                    z = true;
                }
                if (c11998zj != null) {
                    if (c11997yo != null) {
                        this.f40411u4 = true;
                        if (!c11998zj.mo18728kk()) {
                            c11998zj.m56123k4(false, (Exception) c11997yo);
                        }
                        c11998zj.m56292ck();
                    } else {
                        boolean z2 = m56234uz() && !this.f40379c6.mo56113x1(this.f40378c5);
                        try {
                            try {
                                if (m56194x1(c11998zj)) {
                                    if (this.f40410ts) {
                                        this.f40410ts = false;
                                        this.f40401qq.m56153kk(HttpHeaders.TRANSFER_ENCODING);
                                    }
                                    if (this.f40388g8 == null) {
                                        this.f40409tq = false;
                                        this.f40411u4 = false;
                                        this.f40388g8 = null;
                                        c11998zj.m56294jd();
                                        C11934f9 c11934f9M56236wl = m56236wl();
                                        this.f40384e0 = c11934f9M56236wl;
                                        this.f40406ss = c11934f9M56236wl.m55949k4(this, this.f40426yj);
                                    } else if (!m56181k4(c11998zj)) {
                                        this.f40388g8.mo56082m9();
                                        this.f40409tq = false;
                                        this.f40411u4 = false;
                                        this.f40388g8 = null;
                                        c11998zj.m56294jd();
                                        C11934f9 c11934f9M56236wl2 = m56236wl();
                                        this.f40384e0 = c11934f9M56236wl2;
                                        this.f40406ss = c11934f9M56236wl2.m55949k4(this, this.f40426yj);
                                    }
                                } else if (z2) {
                                    if (this.f40385em.m56246kk()) {
                                        c11984wy = this.f40388g8;
                                        if (c11984wy != null && c11984wy.m56265kk() < 400 && (c11953m22 = (C11953m2) C7019kk.m27452k4((Object) this.f40388g8.mo56080h4(), C11953m2.class)) != null) {
                                            c11953m22.m56046x1().m55865x1(true);
                                        }
                                    }
                                    c11953m2 = this.f40400qm;
                                    if (c11953m2 != null) {
                                        c11953m2.m56032ck();
                                    }
                                    this.f40411u4 = true;
                                    c11998zj.m56299k4(false, this.f40388g8);
                                    c11998zj.m56292ck();
                                } else {
                                    if (this.f40399os.m56246kk()) {
                                        c11984wy = this.f40388g8;
                                        if (c11984wy != null) {
                                            c11953m22.m56046x1().m55865x1(true);
                                        }
                                    }
                                    c11953m2 = this.f40400qm;
                                    if (c11953m2 != null) {
                                    }
                                    this.f40411u4 = true;
                                    c11998zj.m56299k4(false, this.f40388g8);
                                    c11998zj.m56292ck();
                                }
                            } catch (Exception e2) {
                                C11997yo c11997yo2 = new C11997yo(e2.getMessage(), e2, 7, null);
                                if (z) {
                                    this.f40416vh = c11997yo2;
                                    this.f40411u4 = true;
                                }
                                c11998zj.m56123k4(false, (Exception) c11997yo2);
                                c11998zj.m56292ck();
                            }
                        } catch (C11997yo e3) {
                            if (z) {
                                this.f40416vh = e3;
                                this.f40411u4 = true;
                            }
                            c11998zj.m56123k4(false, (Exception) e3);
                            c11998zj.m56292ck();
                        }
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: k4 */
    public void m56217k4(C11953m2 c11953m2) {
        if (m56232um()) {
            return;
        }
        this.f40400qm = c11953m2;
        if (this.f40408t6 != null) {
            this.f40401qq.m56153kk(HttpHeaders.TRANSFER_ENCODING);
            this.f40404rv = this.f40424xw;
            this.f40400qm.m56039k4(false);
        }
        this.f40400qm.m56040k4(false, (AbstractC11979vh) new C11952lr(this));
    }

    @Override // com.aspose.slides.internal.p474wg.AbstractC11994yg
    /* JADX INFO: renamed from: k4 */
    public void mo56218k4(InterfaceC11968sv interfaceC11968sv) {
        m56196xk();
        this.f40379c6 = interfaceC11968sv;
        this.f40384e0 = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: k4 */
    public void m56175k4(AbstractC11979vh abstractC11979vh) {
        C11971tq.m56116k4(new C11921b3(this), abstractC11979vh);
    }

    @Override // com.aspose.slides.internal.p474wg.AbstractC11994yg
    /* JADX INFO: renamed from: k4 */
    public void mo56219k4(String str) {
        if (str == null || "".equals(C14113y2.m67440x1(str))) {
            throw new ArgumentException("not a valid method");
        }
        String strM67371jd = C14113y2.m67371jd(str);
        this.f40415v4 = strM67371jd;
        if ("HEAD".equals(strM67371jd) || "GET".equals(this.f40415v4) || "POST".equals(this.f40415v4) || "PUT".equals(this.f40415v4) || "DELETE".equals(this.f40415v4) || "CONNECT".equals(this.f40415v4) || "TRACE".equals(this.f40415v4) || "MKCOL".equals(this.f40415v4)) {
            return;
        }
        this.f40415v4 = str;
    }

    /* JADX INFO: renamed from: k4 */
    public void m56220k4(boolean z) {
        this.f40372ai = z;
    }

    /* JADX INFO: renamed from: k4 */
    private boolean m56176k4(AbstractC11956my abstractC11956my, int i) {
        return (i == 407 ? this.f40385em : this.f40399os).m56245k4(abstractC11956my, i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: k4 */
    public boolean m56177k4(C11971tq c11971tq) {
        C11953m2 c11953m2 = this.f40400qm;
        if (c11953m2 == null || c11953m2.m56031c5() || !m56222kk()) {
            return false;
        }
        if (this.f40404rv < 0 && this.f40400qm.canWrite()) {
            return false;
        }
        long jM56033du = this.f40400qm.m56033du();
        long j = this.f40404rv;
        if (jM56033du == j || (j == -1 && !this.f40400qm.canWrite())) {
            return this.f40400qm.m56042k4(c11971tq);
        }
        return false;
    }

    /* JADX INFO: renamed from: k4 */
    private boolean m56181k4(C11998zj c11998zj) {
        boolean z = this.f40388g8.m56265kk() == 407;
        if ((z ? this.f40385em : this.f40399os).m56248x1() == 0) {
            return false;
        }
        C11953m2 c11953m2 = (C11953m2) C7019kk.m27452k4((Object) this.f40388g8.mo56080h4(), C11953m2.class);
        if (c11953m2 != null) {
            C11917ai c11917aiM56046x1 = c11953m2.m56046x1();
            c11917aiM56046x1.m55864x1(this);
            InterfaceC11926c6 interfaceC11926c6Mo56111k4 = !z ? this.f40390ix : this.f40379c6.mo56111k4();
            if (interfaceC11926c6Mo56111k4 != null) {
                c11917aiM56046x1.m55855k4(interfaceC11926c6Mo56111k4.mo55894k4(this.f40383dy, "NTLM"));
                c11917aiM56046x1.m55860kk(this.f40403ri);
            }
        }
        c11998zj.m56294jd();
        this.f40409tq = false;
        this.f40411u4 = false;
        this.f40388g8.m56264du();
        this.f40388g8 = null;
        return true;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:15:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00c1  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0028  */
    /* JADX INFO: renamed from: k4 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private boolean m56182k4(C11998zj c11998zj, int i, AbstractC11956my abstractC11956my) throws Throwable {
        Throwable c11997yo;
        this.f40405s7++;
        switch (i) {
            case 300:
                c11997yo = new C11997yo("Ambiguous redirect.");
                if (!"GET".equals(this.f40415v4) && !m56222kk()) {
                    c11997yo = new C11997yo("The request requires buffering data to succeed.", null, 7, this.f40388g8);
                }
                if (c11997yo != null) {
                    throw c11997yo;
                }
                this.f40404rv = -1L;
                String str = this.f40388g8.mo56081k4().get_Item("Location");
                if (str == null) {
                    throw new C11997yo(C14113y2.m67408k4("No Location header found for ", C14057f9.m66591x1(i)), 7);
                }
                C14062gk c14062gk = this.f40378c5;
                try {
                    C14062gk c14062gk2 = new C14062gk(this.f40378c5, str);
                    this.f40378c5 = c14062gk2;
                    this.f40392jd = (C14113y2.m67363du(c14062gk2.m66689ks(), c14062gk.m66689ks()) && C14113y2.m67363du(m56200c5(), c14062gk.m66688kk())) ? false : true;
                    return true;
                } catch (RuntimeException unused) {
                    throw new C11997yo(C14113y2.m67402k4("Invalid URL ({0}) for {1}", str, C7019kk.m27466x1(i)), 7);
                }
            case 301:
            case 302:
                if ("POST".equals(this.f40415v4)) {
                    m56159c6();
                }
                c11997yo = null;
                if (!"GET".equals(this.f40415v4)) {
                    c11997yo = new C11997yo("The request requires buffering data to succeed.", null, 7, this.f40388g8);
                }
                if (c11997yo != null) {
                }
                break;
            case 303:
                break;
            case 304:
                return false;
            case StyleIdentifier.GRID_TABLE_5_DARK_ACCENT_4 /* 305 */:
                c11997yo = new NotImplementedException("Proxy support not available.");
                if (!"GET".equals(this.f40415v4)) {
                }
                if (c11997yo != null) {
                }
                break;
            case StyleIdentifier.GRID_TABLE_6_COLORFUL_ACCENT_4 /* 306 */:
            default:
                c11997yo = new C11966s7(C14113y2.m67408k4("Invalid status code: ", C14057f9.m66591x1(i)));
                if (!"GET".equals(this.f40415v4)) {
                }
                if (c11997yo != null) {
                }
                break;
            case 307:
                c11997yo = null;
                if (!"GET".equals(this.f40415v4)) {
                }
                if (c11997yo != null) {
                }
                break;
        }
    }
}
