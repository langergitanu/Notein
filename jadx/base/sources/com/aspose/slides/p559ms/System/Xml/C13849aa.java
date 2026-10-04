package com.aspose.slides.p559ms.System.Xml;

import com.aspose.slides.Collections.Generic.IGenericDictionary;
import com.aspose.slides.exceptions.ArgumentException;
import com.aspose.slides.exceptions.Exception;
import com.aspose.slides.exceptions.InvalidOperationException;
import com.aspose.slides.exceptions.XmlSchemaException;
import com.aspose.slides.internal.p314oc.AbstractC7018k4;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.internal.p532yu.AbstractC13319z7;
import com.aspose.slides.internal.p532yu.C12957dy;
import com.aspose.slides.internal.p532yu.C13020hq;
import com.aspose.slides.internal.p532yu.C13061k5;
import com.aspose.slides.internal.p532yu.C13287xo;
import com.aspose.slides.internal.p532yu.C13313yw;
import com.aspose.slides.internal.p532yu.C13322zd;
import com.aspose.slides.p559ms.System.C14062gk;
import com.aspose.slides.p559ms.System.Xml.C13985tt;

/* JADX INFO: renamed from: com.aspose.slides.ms.System.Xml.aa */
/* JADX INFO: loaded from: classes5.dex */
public final class C13849aa extends AbstractC13912i5 implements InterfaceC13896f9, InterfaceC13980t6 {

    /* JADX INFO: renamed from: ks */
    private static AbstractC13943n5 f46320ks;

    /* JADX INFO: renamed from: ck */
    private C14015xb f46322ck;

    /* JADX INFO: renamed from: du */
    private int f46323du;

    /* JADX INFO: renamed from: dy */
    private boolean f46324dy;

    /* JADX INFO: renamed from: fa */
    private C13892em f46325fa;

    /* JADX INFO: renamed from: h4 */
    private C12957dy f46326h4;

    /* JADX INFO: renamed from: jd */
    private k4 f46327jd;

    /* JADX INFO: renamed from: kk */
    private C13985tt f46329kk;

    /* JADX INFO: renamed from: m9 */
    private C13287xo f46330m9;

    /* JADX INFO: renamed from: to */
    private InterfaceC13980t6 f46331to;

    /* JADX INFO: renamed from: x1 */
    private AbstractC13912i5 f46333x1;

    /* JADX INFO: renamed from: yj */
    private AbstractC13319z7 f46334yj;

    /* JADX INFO: renamed from: c5 */
    private int f46321c5 = 1;

    /* JADX INFO: renamed from: k4 */
    public final AbstractC7018k4<AbstractC13319z7> f46328k4 = new C14035z9(this);

    /* JADX INFO: renamed from: up */
    private AbstractC13912i5 f46332up = this;

    /* JADX INFO: renamed from: com.aspose.slides.ms.System.Xml.aa$k4 */
    public static class k4 implements InterfaceC13972s7 {

        /* JADX INFO: renamed from: k4 */
        public final AbstractC7018k4<AbstractC13319z7> f46335k4 = new C13937ml(this);

        /* JADX INFO: renamed from: kk */
        private AbstractC13319z7 f46336kk;

        /* JADX INFO: renamed from: to */
        private AbstractC13319z7 f46337to;

        /* JADX INFO: renamed from: x1 */
        private C13849aa f46338x1;

        public k4(C13849aa c13849aa) {
            this.f46338x1 = c13849aa;
        }

        /* JADX INFO: renamed from: x1 */
        public final void m65065x1(AbstractC13319z7 abstractC13319z7) {
            this.f46336kk.m61867x1(abstractC13319z7);
        }

        @Override // com.aspose.slides.p559ms.System.Xml.InterfaceC13972s7
        /* JADX INFO: renamed from: k4 */
        public final Object mo65062k4() {
            return this.f46336kk;
        }

        @Override // com.aspose.slides.p559ms.System.Xml.InterfaceC13972s7
        /* JADX INFO: renamed from: k4 */
        public final void mo65063k4(Exception exception, int i) {
            AbstractC13319z7 abstractC13319z7 = this.f46336kk;
            if (abstractC13319z7 != null) {
                abstractC13319z7.mo12838k4(this.f46338x1, new C13020hq((XmlSchemaException) exception, i));
            } else if (this.f46338x1.m65053wp() != 0 && i == 0) {
                throw exception;
            }
        }

        /* JADX INFO: renamed from: k4 */
        public final void m65064k4(AbstractC13319z7 abstractC13319z7) {
            if (abstractC13319z7 != null) {
                if (this.f46336kk == null) {
                    this.f46336kk = this.f46337to;
                }
                this.f46336kk.m61866k4(abstractC13319z7);
            }
        }
    }

    public C13849aa(AbstractC13912i5 abstractC13912i5, AbstractC13319z7 abstractC13319z7, boolean z) {
        C13938ms c13938ms;
        this.f46333x1 = abstractC13912i5;
        C13985tt c13985tt = (C13985tt) C7019kk.m27452k4((Object) abstractC13912i5, C13985tt.class);
        this.f46329kk = c13985tt;
        if (c13985tt == null && (c13938ms = (C13938ms) C7019kk.m27452k4((Object) abstractC13912i5, C13938ms.class)) != null) {
            this.f46329kk = c13938ms.m65620wp();
        }
        C13985tt c13985tt2 = this.f46329kk;
        if (c13985tt2 == null) {
            throw new ArgumentException(C13968ri.m65818k4("The XmlReader passed in to construct this XmlValidatingReaderImpl must be an instance of a System.Xml.XmlTextReader."), "reader");
        }
        c13985tt2.m66083du(true);
        this.f46331to = (InterfaceC13980t6) C7019kk.m27452k4((Object) abstractC13912i5, InterfaceC13980t6.class);
        this.f46324dy = z;
        C13287xo c13287xo = new C13287xo(this.f46333x1.mo65059yd());
        this.f46330m9 = c13287xo;
        c13287xo.m61753k4(m65011vh());
        k4 k4Var = new k4(this);
        this.f46327jd = k4Var;
        if (abstractC13319z7 != null) {
            k4Var.m65064k4(abstractC13319z7);
        }
        this.f46329kk.m66100k4((InterfaceC13972s7) this.f46327jd);
        this.f46329kk.m66101k4((C13985tt.h4) new C13898fj(this));
        this.f46323du = 2;
        m65006h4(2);
    }

    /* JADX INFO: renamed from: h4 */
    private void m65006h4(int i) {
        this.f46326h4 = C12957dy.m60256k4(i, this, this.f46330m9, this.f46327jd, this.f46324dy);
        AbstractC13943n5 abstractC13943n5M65011vh = m65011vh();
        this.f46326h4.m60271k4(abstractC13943n5M65011vh);
        if (this.f46332up.mo65040ne().length() > 0) {
            this.f46326h4.m60272k4(abstractC13943n5M65011vh == null ? new C14062gk(this.f46332up.mo65040ne(), 0) : abstractC13943n5M65011vh.mo65674k4((C14062gk) null, this.f46332up.mo65040ne()));
        }
        this.f46329kk.m66100k4((InterfaceC13972s7) (this.f46323du != 0 ? this.f46327jd : null));
    }

    /* JADX INFO: renamed from: qw */
    private void m65009qw() {
        int iMo65028jd = this.f46333x1.mo65028jd();
        if (iMo65028jd == 5) {
            this.f46321c5 = 3;
        } else if (iMo65028jd == 10) {
            m65013xw();
            return;
        } else if (iMo65028jd == 13 && ((this.f46333x1.mo65058x6() > 0 || this.f46329kk.m66081ca() != 9) && this.f46326h4.mo60277k4())) {
            this.f46329kk.m66082ck(14);
        }
        this.f46329kk.m66102k4((Object) null);
        this.f46329kk.m66128x1((Object) null);
        this.f46326h4.mo60282x1();
    }

    /* JADX INFO: renamed from: t6 */
    private void m65010t6() {
        if (this.f46322ck.m66303kk() == null || this.f46322ck.m66303kk().length() == 0) {
            return;
        }
        this.f46329kk.m66098k4(C13931lr.m65536k4().mo65609k4(this.f46322ck.m66300h4(), this.f46322ck.m66303kk(), this.f46322ck.m66305to(), this.f46322ck.m66298du(), this.f46322ck.m66304m9(), new C13985tt.x1(this.f46329kk)));
        m65013xw();
    }

    /* JADX INFO: renamed from: vh */
    private AbstractC13943n5 m65011vh() {
        AbstractC13943n5 abstractC13943n5M66078bs = this.f46329kk.m66078bs();
        if (abstractC13943n5M66078bs != null || this.f46329kk.m66117ss() || C13906gx.m65366uz()) {
            return abstractC13943n5M66078bs;
        }
        if (f46320ks == null) {
            f46320ks = new C14010x0();
        }
        return f46320ks;
    }

    /* JADX INFO: renamed from: vj */
    private void m65012vj() {
        int iMo65058x6 = this.f46333x1.mo65058x6();
        this.f46332up.mo65016b3();
        while (this.f46332up.mo65026h4() && this.f46333x1.mo65058x6() > iMo65058x6) {
        }
    }

    /* JADX INFO: renamed from: xw */
    private void m65013xw() {
        InterfaceC13899g8 interfaceC13899g8Mo65054wy = this.f46329kk.mo65054wy();
        if (interfaceC13899g8Mo65054wy != null) {
            int i = this.f46323du;
            if (i != 0) {
                if (i == 1) {
                    m65006h4(2);
                } else if (i != 2) {
                    return;
                }
            }
            this.f46326h4.m60270k4(interfaceC13899g8Mo65054wy);
        }
    }

    @Override // com.aspose.slides.p559ms.System.Xml.InterfaceC13896f9
    public final boolean ag_() {
        return true;
    }

    @Override // com.aspose.slides.p559ms.System.Xml.InterfaceC13896f9
    public final int ah_() {
        return ((InterfaceC13896f9) this.f46333x1).ah_();
    }

    @Override // com.aspose.slides.p559ms.System.Xml.InterfaceC13896f9
    public final int ai_() {
        return ((InterfaceC13896f9) this.f46333x1).ai_();
    }

    @Override // com.aspose.slides.p559ms.System.Xml.AbstractC13912i5
    /* JADX INFO: renamed from: ak */
    public char mo65014ak() {
        return this.f46333x1.mo65014ak();
    }

    @Override // com.aspose.slides.p559ms.System.Xml.AbstractC13912i5
    /* JADX INFO: renamed from: ar */
    public boolean mo65015ar() {
        return this.f46333x1.mo65015ar();
    }

    @Override // com.aspose.slides.p559ms.System.Xml.AbstractC13912i5
    /* JADX INFO: renamed from: b3 */
    public void mo65016b3() {
        if (this.f46321c5 == 3) {
            this.f46321c5 = 0;
        }
        this.f46333x1.mo65016b3();
    }

    @Override // com.aspose.slides.p559ms.System.Xml.AbstractC13912i5
    /* JADX INFO: renamed from: bz */
    public C13950o3 mo65017bz() {
        return this.f46329kk.mo65017bz();
    }

    /* JADX INFO: renamed from: c5 */
    public final void m65018c5() {
        if (this.f46332up.mo65028jd() == 5 && this.f46321c5 != 3 && !this.f46332up.mo65026h4()) {
            throw new InvalidOperationException(C13968ri.m65818k4("Operation is not valid due to the current state of the object."));
        }
    }

    @Override // com.aspose.slides.p559ms.System.Xml.AbstractC13912i5
    /* JADX INFO: renamed from: ck */
    public String mo65019ck() {
        return this.f46333x1.mo65019ck();
    }

    @Override // com.aspose.slides.p559ms.System.Xml.AbstractC13912i5
    /* JADX INFO: renamed from: du */
    public boolean mo65020du() {
        if (!this.f46333x1.mo65020du()) {
            return false;
        }
        this.f46321c5 = 0;
        return true;
    }

    @Override // com.aspose.slides.p559ms.System.Xml.AbstractC13912i5
    /* JADX INFO: renamed from: dy */
    public boolean mo65021dy() {
        if (this.f46321c5 == 4) {
            this.f46321c5 = 0;
            this.f46325fa.m65321k4();
        }
        if (!this.f46333x1.mo65021dy()) {
            return false;
        }
        this.f46321c5 = 0;
        return true;
    }

    /* JADX INFO: renamed from: f9 */
    public final Object m65022f9() {
        return this.f46329kk.m66091he();
    }

    @Override // com.aspose.slides.p559ms.System.Xml.AbstractC13912i5
    /* JADX INFO: renamed from: fa */
    public String mo65023fa() {
        return this.f46333x1.mo65023fa();
    }

    /* JADX INFO: renamed from: g8 */
    public final AbstractC13912i5 m65024g8() {
        return this.f46333x1;
    }

    /* JADX INFO: renamed from: gi */
    public final C12957dy m65025gi() {
        return this.f46326h4;
    }

    @Override // com.aspose.slides.p559ms.System.Xml.AbstractC13912i5
    /* JADX INFO: renamed from: ix */
    public boolean mo65027ix() {
        return true;
    }

    @Override // com.aspose.slides.p559ms.System.Xml.AbstractC13912i5
    /* JADX INFO: renamed from: jd */
    public int mo65028jd() {
        return this.f46333x1.mo65028jd();
    }

    @Override // com.aspose.slides.p559ms.System.Xml.InterfaceC13980t6
    /* JADX INFO: renamed from: k4 */
    public final IGenericDictionary<String, String> mo52690k4(int i) {
        return this.f46331to.mo52690k4(i);
    }

    @Override // com.aspose.slides.p559ms.System.Xml.AbstractC13912i5
    /* JADX INFO: renamed from: kk */
    public String mo65034kk(int i) {
        return this.f46333x1.mo65034kk(i);
    }

    /* JADX INFO: renamed from: kp */
    public final boolean m65037kp() {
        return this.f46329kk.m66087g8();
    }

    @Override // com.aspose.slides.p559ms.System.Xml.AbstractC13912i5
    /* JADX INFO: renamed from: ks */
    public boolean mo65038ks() {
        return this.f46333x1.mo65038ks();
    }

    @Override // com.aspose.slides.p559ms.System.Xml.AbstractC13912i5
    /* JADX INFO: renamed from: m9 */
    public int mo65039m9() {
        if (this.f46321c5 == 1) {
            return 0;
        }
        return this.f46333x1.mo65039m9();
    }

    @Override // com.aspose.slides.p559ms.System.Xml.AbstractC13912i5
    /* JADX INFO: renamed from: ne */
    public String mo65040ne() {
        return this.f46333x1.mo65040ne();
    }

    @Override // com.aspose.slides.p559ms.System.Xml.AbstractC13912i5
    /* JADX INFO: renamed from: qq */
    public int mo65041qq() {
        return this.f46333x1.mo65041qq();
    }

    @Override // com.aspose.slides.p559ms.System.Xml.AbstractC13912i5
    /* JADX INFO: renamed from: rv */
    public String mo65042rv() {
        return this.f46333x1.mo65042rv();
    }

    /* JADX INFO: renamed from: s7 */
    public final boolean m65043s7() {
        return this.f46329kk.m66094jw();
    }

    /* JADX INFO: renamed from: ss */
    public final C13287xo m65044ss() {
        return this.f46330m9;
    }

    /* JADX INFO: renamed from: sv */
    public final C13985tt m65045sv() {
        return this.f46329kk;
    }

    @Override // com.aspose.slides.p559ms.System.Xml.AbstractC13912i5
    /* JADX INFO: renamed from: to */
    public String mo65046to(String str) {
        return this.f46333x1.mo65046to(str);
    }

    @Override // com.aspose.slides.p559ms.System.Xml.AbstractC13912i5
    /* JADX INFO: renamed from: u4 */
    public boolean mo65048u4() {
        return this.f46333x1.mo65048u4();
    }

    @Override // com.aspose.slides.p559ms.System.Xml.AbstractC13912i5
    /* JADX INFO: renamed from: um */
    public void mo65049um() {
        this.f46333x1.mo65049um();
        this.f46321c5 = 5;
    }

    @Override // com.aspose.slides.p559ms.System.Xml.AbstractC13912i5
    /* JADX INFO: renamed from: up */
    public String mo65050up() {
        return this.f46333x1.mo65050up();
    }

    @Override // com.aspose.slides.p559ms.System.Xml.AbstractC13912i5
    /* JADX INFO: renamed from: uz */
    public int mo65051uz() {
        return this.f46333x1.mo65051uz();
    }

    @Override // com.aspose.slides.p559ms.System.Xml.AbstractC13912i5
    /* JADX INFO: renamed from: v4 */
    public String mo65052v4() {
        m65018c5();
        return super.mo65052v4();
    }

    /* JADX INFO: renamed from: wp */
    public final int m65053wp() {
        return this.f46323du;
    }

    @Override // com.aspose.slides.p559ms.System.Xml.AbstractC13912i5
    /* JADX INFO: renamed from: wy */
    public InterfaceC13899g8 mo65054wy() {
        return this.f46329kk.mo65054wy();
    }

    @Override // com.aspose.slides.p559ms.System.Xml.InterfaceC13980t6
    /* JADX INFO: renamed from: x1 */
    public final String mo52700x1(String str) {
        return this.f46331to.mo52700x1(str);
    }

    @Override // com.aspose.slides.p559ms.System.Xml.AbstractC13912i5
    /* JADX INFO: renamed from: x6 */
    public int mo65058x6() {
        return this.f46333x1.mo65058x6();
    }

    @Override // com.aspose.slides.p559ms.System.Xml.AbstractC13912i5
    /* JADX INFO: renamed from: yd */
    public AbstractC13883dt mo65059yd() {
        return this.f46333x1.mo65059yd();
    }

    @Override // com.aspose.slides.p559ms.System.Xml.AbstractC13912i5
    /* JADX INFO: renamed from: yj */
    public String mo65060yj() {
        return this.f46333x1.mo65060yj();
    }

    @Override // com.aspose.slides.p559ms.System.Xml.AbstractC13912i5
    /* JADX INFO: renamed from: h4 */
    public boolean mo65026h4() {
        int i = this.f46321c5;
        if (i != 0) {
            if (i == 1) {
                this.f46321c5 = 0;
                if (this.f46333x1.mo65039m9() == 1) {
                    m65009qw();
                    return true;
                }
                if (this.f46333x1.mo65026h4()) {
                    m65009qw();
                    return true;
                }
            } else if (i == 2) {
                this.f46321c5 = 0;
                m65010t6();
                if (this.f46333x1.mo65026h4()) {
                    m65009qw();
                    return true;
                }
            } else if (i == 3) {
                this.f46321c5 = 0;
                m65012vj();
                if (this.f46333x1.mo65026h4()) {
                    m65009qw();
                    return true;
                }
            } else {
                if (i != 4) {
                    return false;
                }
                this.f46321c5 = 0;
                this.f46325fa.m65321k4();
                if (this.f46333x1.mo65026h4()) {
                    m65009qw();
                    return true;
                }
            }
        } else if (this.f46333x1.mo65026h4()) {
            m65009qw();
            return true;
        }
        this.f46326h4.mo60278kk();
        return false;
    }

    @Override // com.aspose.slides.p559ms.System.Xml.AbstractC13912i5
    /* JADX INFO: renamed from: kk */
    public boolean mo65035kk() {
        if (!this.f46333x1.mo65035kk()) {
            return false;
        }
        this.f46321c5 = 0;
        return true;
    }

    @Override // com.aspose.slides.p559ms.System.Xml.AbstractC13912i5
    /* JADX INFO: renamed from: to */
    public boolean mo65047to() {
        if (!this.f46333x1.mo65047to()) {
            return false;
        }
        this.f46321c5 = 0;
        return true;
    }

    @Override // com.aspose.slides.p559ms.System.Xml.AbstractC13912i5
    /* JADX INFO: renamed from: x1 */
    public void mo65055x1(int i) {
        this.f46333x1.mo65055x1(i);
        this.f46321c5 = 0;
    }

    @Override // com.aspose.slides.p559ms.System.Xml.AbstractC13912i5
    /* JADX INFO: renamed from: kk */
    public boolean mo65036kk(String str) {
        if (!this.f46333x1.mo65036kk(str)) {
            return false;
        }
        this.f46321c5 = 0;
        return true;
    }

    /* JADX INFO: renamed from: x1 */
    public final void m65056x1(Object obj) {
        this.f46329kk.m66128x1(obj);
    }

    @Override // com.aspose.slides.p559ms.System.Xml.AbstractC13912i5
    /* JADX INFO: renamed from: k4 */
    public C13906gx mo65029k4() {
        C13906gx c13906gxMo65029k4 = this.f46329kk.m66133y2() ? null : this.f46333x1.mo65029k4();
        C13906gx c13906gxM65378ix = c13906gxMo65029k4 != null ? c13906gxMo65029k4.m65378ix() : new C13906gx();
        c13906gxM65378ix.m65371du(2);
        if (!this.f46324dy) {
            c13906gxM65378ix.m65376h4(c13906gxM65378ix.m65411x6() & (-9));
        }
        c13906gxM65378ix.m65397m9(true);
        return c13906gxM65378ix;
    }

    @Override // com.aspose.slides.p559ms.System.Xml.AbstractC13912i5
    /* JADX INFO: renamed from: x1 */
    public boolean mo65057x1() {
        return this.f46333x1.mo65057x1();
    }

    @Override // com.aspose.slides.p559ms.System.Xml.AbstractC13912i5, com.aspose.slides.p559ms.System.Xml.InterfaceC13980t6
    /* JADX INFO: renamed from: k4 */
    public String mo13292k4(String str) {
        return this.f46329kk.mo13292k4(str);
    }

    /* JADX INFO: renamed from: k4 */
    public final void m65030k4(C12957dy c12957dy) {
        this.f46326h4 = c12957dy;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m65031k4(InterfaceC13867bz interfaceC13867bz, C13985tt c13985tt) {
        C13322zd c13322zd;
        C13061k5 c13061k5 = (C13061k5) C7019kk.m27452k4((Object) interfaceC13867bz, C13061k5.class);
        if (c13061k5 == null || c13061k5.m61031ix() || (c13322zd = (C13322zd) C7019kk.m27452k4((Object) c13985tt.mo65054wy(), C13322zd.class)) == null) {
            return;
        }
        C13313yw.m61851k4(c13061k5, c13322zd, this.f46327jd, c13985tt.mo65040ne());
    }

    /* JADX INFO: renamed from: k4 */
    public final void m65032k4(Object obj) {
        this.f46329kk.m66102k4(obj);
    }

    /* JADX INFO: renamed from: k4 */
    public final boolean m65033k4(C13061k5 c13061k5) {
        return this.f46329kk.m66104k4(c13061k5);
    }
}
