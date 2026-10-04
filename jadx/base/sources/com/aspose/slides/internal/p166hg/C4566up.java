package com.aspose.slides.internal.p166hg;

import com.aspose.slides.exceptions.ArgumentNullException;
import com.aspose.slides.exceptions.Exception;
import com.aspose.slides.exceptions.IOException;
import com.aspose.slides.internal.p080dd.AbstractC3150x6;
import com.aspose.slides.internal.p080dd.C3152yj;
import com.aspose.slides.internal.p118ex.C3817h4;
import com.aspose.slides.internal.p118ex.C3819jd;
import com.aspose.slides.internal.p174hz.AbstractC4709du;
import com.aspose.slides.internal.p205ji.AbstractC5470v4;
import com.aspose.slides.internal.p205ji.C5458kk;
import com.aspose.slides.internal.p314oc.AbstractC7018k4;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.internal.p419tg.C10940kk;
import com.aspose.slides.p559ms.System.AbstractC14078m9;
import com.aspose.slides.p559ms.System.InterfaceC14083qm;

/* JADX INFO: renamed from: com.aspose.slides.internal.hg.up */
/* JADX INFO: loaded from: classes.dex */
public class C4566up extends AbstractC4535e0 {

    /* JADX INFO: renamed from: ck */
    private AbstractC4560t6 f12744ck;

    /* JADX INFO: renamed from: fa */
    private AbstractC4537f9 f12745fa;

    /* JADX INFO: renamed from: k4 */
    final AbstractC7018k4<AbstractC4560t6> f12746k4;

    /* JADX INFO: renamed from: kk */
    final AbstractC7018k4<AbstractC4541h4> f12747kk;

    /* JADX INFO: renamed from: to */
    public final AbstractC7018k4<AbstractC4578xw> f12748to;

    /* JADX INFO: renamed from: up */
    private AbstractC4541h4 f12749up;

    /* JADX INFO: renamed from: x1 */
    final AbstractC7018k4<AbstractC4537f9> f12750x1;

    /* JADX INFO: renamed from: yj */
    private AbstractC4578xw f12751yj;

    /* JADX INFO: renamed from: com.aspose.slides.internal.hg.up$k4 */
    public static class k4 implements InterfaceC14083qm {

        /* JADX INFO: renamed from: du */
        private C5458kk f12752du;

        /* JADX INFO: renamed from: h4 */
        private int f12753h4;

        /* JADX INFO: renamed from: k4 */
        private final Object f12754k4 = new Object();

        /* JADX INFO: renamed from: kk */
        private Object f12755kk;

        /* JADX INFO: renamed from: m9 */
        private boolean f12756m9;

        /* JADX INFO: renamed from: to */
        private Exception f12757to;

        /* JADX INFO: renamed from: x1 */
        private AbstractC14078m9 f12758x1;

        public k4(AbstractC14078m9 abstractC14078m9, Object obj, int i) {
            this.f12758x1 = abstractC14078m9;
            this.f12755kk = obj;
            this.f12753h4 = i;
        }

        /* JADX INFO: renamed from: du */
        public Exception m18865du() {
            return this.f12757to;
        }

        /* JADX INFO: renamed from: h4 */
        public boolean m18866h4() {
            return mo18728kk() && this.f12757to != null;
        }

        @Override // com.aspose.slides.p559ms.System.InterfaceC14083qm
        /* JADX INFO: renamed from: k4 */
        public Object mo18725k4() {
            return this.f12755kk;
        }

        @Override // com.aspose.slides.p559ms.System.InterfaceC14083qm
        /* JADX INFO: renamed from: kk */
        public boolean mo18728kk() {
            boolean z;
            synchronized (this.f12754k4) {
                z = this.f12756m9;
            }
            return z;
        }

        /* JADX INFO: renamed from: m9 */
        public void m18869m9() {
            m18868k4((Exception) null);
        }

        /* JADX INFO: renamed from: to */
        public int m18870to() {
            return this.f12753h4;
        }

        @Override // com.aspose.slides.p559ms.System.InterfaceC14083qm
        /* JADX INFO: renamed from: x1 */
        public AbstractC5470v4 mo18731x1() {
            synchronized (this.f12754k4) {
                try {
                    if (this.f12752du == null) {
                        this.f12752du = new C5458kk(this.f12756m9);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            return this.f12752du;
        }

        /* JADX INFO: renamed from: k4 */
        public void m18867k4(int i) {
            this.f12753h4 = i;
        }

        /* JADX INFO: renamed from: k4 */
        public void m18868k4(Exception exception) {
            synchronized (this.f12754k4) {
                try {
                    if (!this.f12756m9) {
                        this.f12756m9 = true;
                        C5458kk c5458kk = this.f12752du;
                        if (c5458kk != null) {
                            c5458kk.mo22555x1();
                        }
                        AbstractC14078m9 abstractC14078m9 = this.f12758x1;
                        if (abstractC14078m9 != null) {
                            abstractC14078m9.m66837k4(this, null, null);
                        }
                        this.f12757to = exception;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    public C4566up(AbstractC3150x6 abstractC3150x6, String str, boolean z, int i, C3819jd c3819jd) {
        super(abstractC3150x6, z);
        this.f12746k4 = new C4580yj(this);
        this.f12750x1 = new C4565um(this);
        this.f12747kk = new C4568v4(this);
        this.f12748to = new C4579yd(this);
        if (str == null || str.length() == 0) {
            throw new ArgumentNullException("targetHost is null or an empty string.");
        }
        this.f12645dy = new C4562tq(this, i, str, c3819jd);
        this.f12643c5 = new C4543j2(this.f12647h4, (C4562tq) this.f12645dy);
    }

    @Override // com.aspose.slides.internal.p166hg.AbstractC4535e0, com.aspose.slides.internal.p080dd.AbstractC3150x6
    public void dispose(boolean z) {
        super.dispose(z);
        if (z) {
            this.f12746k4.m27431kk(new C4574wy(this));
            this.f12750x1.m27431kk(new C4524ak(this));
            this.f12747kk.m27431kk(new C4532dq(this));
            this.f12748to.m27431kk(new C4577xk(this));
        }
    }

    @Override // com.aspose.slides.internal.p166hg.AbstractC4535e0
    public void finalize() throws Throwable {
        super.dispose(false);
        super.finalize();
    }

    @Override // com.aspose.slides.internal.p166hg.AbstractC4535e0
    /* JADX INFO: renamed from: k4 */
    public C3817h4 mo18705k4(C3819jd c3819jd, C3817h4 c3817h4, String str, C3819jd c3819jd2) {
        if (this.f12750x1.m27430k4()) {
            return null;
        }
        return this.f12745fa.mo18687k4(c3819jd, c3817h4, str, c3819jd2);
    }

    /* JADX INFO: renamed from: kk */
    public C3817h4 m18859kk() {
        return this.f12645dy.m18639fa().m18839kk();
    }

    /* JADX INFO: renamed from: to */
    public boolean m18860to() {
        return !this.f12748to.m27430k4();
    }

    /* JADX INFO: renamed from: x1 */
    public AbstractC3150x6 m18861x1() {
        return this.f12651m9;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: kk */
    public void m18857kk(InterfaceC14083qm interfaceC14083qm) {
        IOException iOException;
        AbstractC4550m9 abstractC4550m9;
        AbstractC3150x6 abstractC3150x6;
        AbstractC14078m9 c4556rv;
        k4 k4Var = (k4) C7019kk.m27452k4(interfaceC14083qm.mo18725k4(), k4.class);
        try {
            boolean z = true;
            switch (k4Var.m18870to()) {
                case 0:
                    this.f12643c5.m18802kk(interfaceC14083qm);
                    k4Var.m18867k4(1);
                    abstractC4550m9 = this.f12643c5;
                    abstractC3150x6 = this.f12647h4;
                    c4556rv = new C4556rv(this);
                    abstractC4550m9.m18794k4(abstractC3150x6, c4556rv, k4Var);
                    return;
                case 1:
                    m18856k4(interfaceC14083qm, true);
                    if (this.f12645dy.m18673up() != 14 && (!this.f12645dy.m18668to() || this.f12645dy.m18673up() != 2)) {
                        abstractC4550m9 = this.f12643c5;
                        abstractC3150x6 = this.f12647h4;
                        c4556rv = new C4576x6(this);
                        abstractC4550m9.m18794k4(abstractC3150x6, c4556rv, k4Var);
                        return;
                    }
                    if (this.f12645dy.m18668to()) {
                        C4571w6.m18909x1(this.f12645dy);
                        this.f12645dy.m18684xk().m18754k4().mo18733k4();
                        this.f12645dy.m18684xk().m18754k4().m18898ne();
                        k4Var.m18867k4(2);
                        this.f12643c5.m18795k4(new C4551ne(this), k4Var);
                        return;
                    }
                    boolean zM18764du = this.f12645dy.m18632ck().m18764du();
                    C3152yj c3152yj = new C3152yj();
                    try {
                        if (this.f12645dy.m18640h4() == 48) {
                            if (this.f12645dy.m18639fa().m18841x1() == null || this.f12645dy.m18639fa().m18841x1().size() <= 0) {
                                z = false;
                            }
                            zM18764du = z;
                        }
                        if (zM18764du) {
                            byte[] bArrM18803kk = this.f12643c5.m18803kk((byte) 11);
                            c3152yj.write(bArrM18803kk, 0, bArrM18803kk.length);
                        }
                        byte[] bArrM18803kk2 = this.f12643c5.m18803kk((byte) 16);
                        c3152yj.write(bArrM18803kk2, 0, bArrM18803kk2.length);
                        this.f12645dy.m18684xk().m18754k4().m18898ne();
                        if (zM18764du && this.f12645dy.m18639fa().m18839kk() != null) {
                            byte[] bArrM18803kk3 = this.f12643c5.m18803kk((byte) 15);
                            c3152yj.write(bArrM18803kk3, 0, bArrM18803kk3.length);
                        }
                        this.f12643c5.m18806x1(c3152yj);
                        byte[] bArrM18803kk4 = this.f12643c5.m18803kk((byte) 20);
                        c3152yj.write(bArrM18803kk4, 0, bArrM18803kk4.length);
                        k4Var.m18867k4(4);
                        this.f12647h4.beginWrite(c3152yj.getBuffer(), 0, C7019kk.m27462to(Long.valueOf(c3152yj.getLength()), 11), new C4542ix(this), k4Var);
                        c3152yj.dispose();
                        return;
                    } catch (Throwable th) {
                        c3152yj.dispose();
                        throw th;
                    }
                case 2:
                    this.f12643c5.m18807x1(interfaceC14083qm);
                    k4Var.m18867k4(3);
                    abstractC4550m9 = this.f12643c5;
                    abstractC3150x6 = this.f12647h4;
                    c4556rv = new C4572wl(this);
                    abstractC4550m9.m18794k4(abstractC3150x6, c4556rv, k4Var);
                    return;
                case 3:
                    m18856k4(interfaceC14083qm, true);
                    if (this.f12645dy.m18686yj() == 2) {
                        k4Var.m18867k4(6);
                        this.f12643c5.m18792k4((byte) 20, new C4525ar(this), k4Var);
                        return;
                    } else {
                        abstractC4550m9 = this.f12643c5;
                        abstractC3150x6 = this.f12647h4;
                        c4556rv = new C4554qq(this);
                        abstractC4550m9.m18794k4(abstractC3150x6, c4556rv, k4Var);
                        return;
                    }
                case 4:
                    this.f12647h4.endWrite(interfaceC14083qm);
                    k4Var.m18867k4(5);
                    abstractC4550m9 = this.f12643c5;
                    abstractC3150x6 = this.f12647h4;
                    c4556rv = new C4564u4(this);
                    abstractC4550m9.m18794k4(abstractC3150x6, c4556rv, k4Var);
                    return;
                case 5:
                    m18858x1(interfaceC14083qm);
                    if (this.f12645dy.m18686yj() == 2) {
                        this.f12645dy.m18663ne().m18738du();
                        this.f12645dy.m18625ak();
                        k4Var.m18869m9();
                        return;
                    } else {
                        abstractC4550m9 = this.f12643c5;
                        abstractC3150x6 = this.f12647h4;
                        c4556rv = new C4567uz(this);
                        abstractC4550m9.m18794k4(abstractC3150x6, c4556rv, k4Var);
                        return;
                    }
                case 6:
                    this.f12643c5.m18802kk(interfaceC14083qm);
                    this.f12645dy.m18663ne().m18738du();
                    this.f12645dy.m18625ak();
                    k4Var.m18869m9();
                    return;
                default:
                    return;
            }
        } catch (C4545k4 e) {
            this.f12643c5.m18798k4(e.m18761k4());
            iOException = new IOException("The authentication or decryption has failed.", e);
            k4Var.m18868k4(iOException);
        } catch (RuntimeException e2) {
            this.f12643c5.m18805x1((byte) 80);
            iOException = new IOException("The authentication or decryption has failed.", e2);
            k4Var.m18868k4(iOException);
        }
    }

    /* JADX INFO: renamed from: x1 */
    public C3817h4 m18862x1(C3819jd c3819jd, C3817h4 c3817h4, String str, C3819jd c3819jd2) {
        return super.m18711kk(c3819jd, c3817h4, str, c3819jd2);
    }

    /* JADX INFO: renamed from: x1 */
    public C4557s7 m18863x1(C10940kk c10940kk) {
        return super.m18712kk(c10940kk);
    }

    @Override // com.aspose.slides.internal.p166hg.AbstractC4535e0
    /* JADX INFO: renamed from: k4 */
    public C4557s7 mo18706k4(C10940kk c10940kk) {
        AbstractC4578xw abstractC4578xw = this.f12751yj;
        if (abstractC4578xw != null) {
            return abstractC4578xw.mo18689k4(c10940kk);
        }
        return null;
    }

    /* JADX INFO: renamed from: x1 */
    public AbstractC4709du m18864x1(C3817h4 c3817h4, String str) {
        return super.m18713kk(c3817h4, str);
    }

    /* JADX INFO: renamed from: x1 */
    private void m18858x1(InterfaceC14083qm interfaceC14083qm) {
        m18856k4(interfaceC14083qm, false);
    }

    @Override // com.aspose.slides.internal.p166hg.AbstractC4535e0
    /* JADX INFO: renamed from: x1 */
    public boolean mo18716x1(C3817h4 c3817h4, int[] iArr) {
        return !this.f12746k4.m27430k4() ? this.f12744ck.mo18777k4(c3817h4, iArr) : iArr != null && iArr.length == 0;
    }

    @Override // com.aspose.slides.internal.p166hg.AbstractC4535e0
    /* JADX INFO: renamed from: k4 */
    public AbstractC4709du mo18707k4(C3817h4 c3817h4, String str) {
        if (this.f12747kk.m27430k4()) {
            return null;
        }
        return this.f12749up.mo18690k4(c3817h4, str);
    }

    @Override // com.aspose.slides.internal.p166hg.AbstractC4535e0
    /* JADX INFO: renamed from: k4 */
    public InterfaceC14083qm mo18708k4(AbstractC14078m9 abstractC14078m9, Object obj) {
        if (this.f12645dy.m18686yj() != 0) {
            this.f12645dy.mo18654kk();
        }
        AbstractC4523ai abstractC4523ai = this.f12645dy;
        abstractC4523ai.m18651k4(C4555qw.m18831k4(false, abstractC4523ai.m18640h4()));
        this.f12645dy.m18655kk(1);
        k4 k4Var = new k4(abstractC14078m9, obj, 0);
        this.f12643c5.m18792k4((byte) 1, new C4530c6(this), k4Var);
        return k4Var;
    }

    @Override // com.aspose.slides.internal.p166hg.AbstractC4535e0
    /* JADX INFO: renamed from: k4 */
    public void mo18709k4(InterfaceC14083qm interfaceC14083qm) {
        k4 k4Var = (k4) C7019kk.m27452k4((Object) interfaceC14083qm, k4.class);
        if (k4Var == null) {
            throw new ArgumentNullException();
        }
        if (!k4Var.mo18728kk()) {
            k4Var.mo18731x1().m22558du();
        }
        if (k4Var.m18866h4()) {
            throw k4Var.m18865du();
        }
    }

    /* JADX INFO: renamed from: k4 */
    private void m18856k4(InterfaceC14083qm interfaceC14083qm, boolean z) {
        byte[] bArrM18801k4 = this.f12643c5.m18801k4(interfaceC14083qm);
        if (z) {
            return;
        }
        if (bArrM18801k4 == null || bArrM18801k4.length == 0) {
            throw new C4545k4((byte) 40, "The server stopped the handshake.");
        }
    }

    /* JADX INFO: renamed from: k4 */
    public boolean mo18763k4(C3817h4 c3817h4, int[] iArr) {
        return super.m18714kk(c3817h4, iArr);
    }
}
