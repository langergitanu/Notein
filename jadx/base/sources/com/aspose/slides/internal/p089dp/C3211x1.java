package com.aspose.slides.internal.p089dp;

import com.aspose.slides.exceptions.InvalidOperationException;
import com.aspose.slides.internal.p080dd.AbstractC3150x6;
import com.aspose.slides.internal.p080dd.C3152yj;
import com.aspose.slides.internal.p138fu.C4122du;
import com.aspose.slides.internal.p138fu.C4127k4;
import com.aspose.slides.internal.p151gj.C4315ck;
import com.aspose.slides.internal.p155gv.C4383k4;
import com.aspose.slides.internal.p173hx.AbstractC4691k4;
import com.aspose.slides.internal.p173hx.C4689du;
import com.aspose.slides.internal.p173hx.C4690h4;
import com.aspose.slides.internal.p173hx.C4692kk;
import com.aspose.slides.internal.p173hx.C4694to;
import com.aspose.slides.internal.p173hx.C4695x1;
import com.aspose.slides.internal.p223ka.C5656k4;
import com.aspose.slides.internal.p302nm.C6920du;
import com.aspose.slides.internal.p302nm.C6921dy;
import com.aspose.slides.internal.p302nm.C6923jd;
import com.aspose.slides.internal.p323op.C7131h4;
import com.aspose.slides.internal.p323op.C7134m9;
import com.aspose.slides.internal.p416tb.C10893b3;
import com.aspose.slides.internal.p416tb.C10894bv;
import com.aspose.slides.internal.p416tb.C10898dy;
import com.aspose.slides.internal.p416tb.C10922yj;
import com.aspose.slides.internal.p475wh.AbstractC12002ck;
import com.aspose.slides.internal.p475wh.C12009k4;
import com.aspose.slides.internal.p504xm.C12549du;
import com.aspose.slides.internal.p504xm.C12553to;
import com.aspose.slides.p559ms.System.C14113y2;

/* JADX INFO: renamed from: com.aspose.slides.internal.dp.x1 */
/* JADX INFO: loaded from: classes3.dex */
public class C3211x1 extends C10893b3 {

    /* JADX INFO: renamed from: c5 */
    private C10894bv f9601c5;

    /* JADX INFO: renamed from: ck */
    private C6920du f9602ck;

    /* JADX INFO: renamed from: du */
    private C6921dy f9603du;

    /* JADX INFO: renamed from: dy */
    private int f9604dy;

    /* JADX INFO: renamed from: h4 */
    private int f9605h4;

    /* JADX INFO: renamed from: jd */
    private int f9606jd;

    /* JADX INFO: renamed from: k4 */
    protected C12553to f9607k4;

    /* JADX INFO: renamed from: kk */
    protected C3210kk f9608kk;

    /* JADX INFO: renamed from: m9 */
    private C4383k4 f9609m9;

    /* JADX INFO: renamed from: to */
    private byte[] f9610to;

    /* JADX WARN: Removed duplicated region for block: B:23:0x007c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public C3211x1(C10898dy c10898dy, byte[] bArr, C6921dy c6921dy, C6920du c6920du) {
        C4315ck c4315ckM16516k4;
        super(c10898dy);
        Integer numValueOf = null;
        this.f9602ck = null;
        this.f9610to = bArr;
        if (!m52569m9().m52464x1().m52634x6() || m52569m9().m52464x1().m52624rv() == null) {
            c4315ckM16516k4 = null;
        } else {
            C12009k4[] c12009k4Arr = {null};
            boolean z = m52569m9().m52458k4(this.f9610to, c12009k4Arr) && AbstractC12002ck.m56321kk(c12009k4Arr[0].mo15753jd());
            C12009k4 c12009k4 = c12009k4Arr[0];
            if (z) {
                c4315ckM16516k4 = C4127k4.m16516k4(c12009k4, false, false);
                if (c4315ckM16516k4.m17310kk()) {
                    Integer numValueOf2 = (!this.f37962x1.m52464x1().m52606dy() || this.f37962x1.m52454fa()) ? null : Integer.valueOf(m13913kk(c4315ckM16516k4));
                    this.f9610to = null;
                    this.f9610to = m13912k4(bArr);
                    Integer num = numValueOf2;
                    c4315ckM16516k4 = null;
                    numValueOf = num;
                }
            }
        }
        if (numValueOf == null && this.f37962x1.m52464x1().m52606dy() && !this.f37962x1.m52454fa()) {
            numValueOf = Integer.valueOf(m13913kk(c4315ckM16516k4));
        }
        this.f9603du = c6921dy;
        this.f9605h4 = this.f37962x1.m52464x1().m52621m9();
        this.f9602ck = c6920du;
        if (this.f37962x1.m52464x1().m52606dy()) {
            this.f9605h4 = this.f37962x1.m52454fa() ? m13915x1(this.f9610to) : numValueOf.intValue();
        } else {
            this.f9605h4 = m13915x1(this.f9610to);
        }
    }

    /* JADX INFO: renamed from: du */
    private C4127k4 m13907du() {
        C6921dy c6921dy = this.f9603du;
        if (c6921dy != null && c6921dy.m27132x1()) {
            return this.f9603du.m27127k4(this.f9610to);
        }
        if (m52569m9().m52464x1().m52623qq() == null) {
            return new C4127k4(this.f9610to);
        }
        C12009k4[] c12009k4Arr = {null};
        boolean zM52458k4 = m52569m9().m52458k4(this.f9610to, c12009k4Arr);
        C12009k4 c12009k4M16518k4 = c12009k4Arr[0];
        if (!zM52458k4) {
            c12009k4M16518k4 = C4127k4.m16518k4(this.f9610to);
            m52569m9().m52464x1().m52623qq().m56971k4(C7134m9.m27683k4(this.f9610to), new C7131h4(c12009k4M16518k4, this.f9610to));
        }
        return new C4122du(c12009k4M16518k4, this.f9610to);
    }

    /* JADX INFO: renamed from: kk */
    private int m13913kk(C4315ck c4315ck) {
        C4127k4 c4127k4M13907du = m13907du();
        try {
            C12553to c12553to = this.f9607k4;
            C4383k4 c4383k4 = this.f9609m9;
            int i = this.f9604dy;
            this.f9607k4 = C12553to.m58540k4(c4127k4M13907du.m16549x1(), c4127k4M13907du.m16546kk(), c4127k4M13907du.m16548to(), c4127k4M13907du.m16533du());
            if (c4315ck == null) {
                c4315ck = C4127k4.m16516k4(c4127k4M13907du.m16534dy(), false, false);
            }
            this.f9609m9 = C4383k4.m17715k4(c4315ck.m17311to());
            this.f9604dy = c4315ck.m17308du();
            C3152yj c3152yj = new C3152yj();
            try {
                c4127k4M13907du.mo16493x1(c3152yj, this.f37962x1.m52464x1().m52603c5());
                int i2 = 5;
                long jM13909k4 = m13909k4(c3152yj.toArray(), 5);
                c3152yj.dispose();
                long jM13909k42 = m13909k4(c4315ck.m17309k4(), 2);
                if (jM13909k42 < jM13909k4) {
                    i2 = 2;
                    jM13909k4 = jM13909k42;
                }
                if (m13909k4(c4315ck.m17309k4(), 3) < jM13909k4) {
                    i2 = 3;
                }
                this.f9607k4 = c12553to;
                this.f9609m9 = c4383k4;
                this.f9604dy = i;
                c4127k4M13907du.dispose();
                return i2;
            } catch (Throwable th) {
                c3152yj.dispose();
                throw th;
            }
        } finally {
        }
    }

    /* JADX INFO: renamed from: x1 */
    private static int m13915x1(byte[] bArr) {
        return C12549du.m58515x1(bArr) == 4 ? 5 : 2;
    }

    /* JADX INFO: renamed from: k4 */
    public int m13916k4(C4315ck c4315ck) {
        return c4315ck.m17312x1().length;
    }

    /* JADX INFO: renamed from: to */
    public final void m13921to(C10922yj c10922yj) {
        super.mo9082k4(c10922yj);
    }

    /* JADX INFO: renamed from: du */
    private void m13908du(C10922yj c10922yj) {
        C4127k4 c4127k4M13907du = m13907du();
        try {
            this.f9607k4 = C12553to.m58540k4(c4127k4M13907du.m16549x1(), c4127k4M13907du.m16546kk(), c4127k4M13907du.m16548to(), c4127k4M13907du.m16533du());
            if (c4127k4M13907du.m16547m9() == 1) {
                m13911k4(c4127k4M13907du.m16532ck());
                if (this.f9605h4 == 5) {
                    this.f9605h4 = 2;
                }
            }
            m13914kk(c4127k4M13907du);
            c4127k4M13907du.dispose();
            m13920kk(c10922yj);
            C10894bv c10894bv = this.f9601c5;
            if (c10894bv != null) {
                c10894bv.mo9082k4(c10922yj);
                this.f9601c5 = null;
            }
            C3210kk c3210kk = this.f9608kk;
            if (c3210kk != null) {
                c3210kk.mo9082k4(c10922yj);
                this.f9608kk = null;
            }
        } finally {
        }
    }

    /* JADX INFO: renamed from: k4 */
    private long m13909k4(byte[] bArr, int i) {
        int i2 = this.f9605h4;
        this.f9605h4 = i;
        AbstractC4691k4 abstractC4691k4Mo13905kk = mo13905kk();
        try {
            C3152yj c3152yj = new C3152yj();
            try {
                AbstractC3150x6 abstractC3150x6Mo19544k4 = abstractC4691k4Mo13905kk.mo19544k4(c3152yj);
                try {
                    abstractC3150x6Mo19544k4.write(bArr, 0, bArr.length);
                    long length = abstractC3150x6Mo19544k4.getLength();
                    abstractC3150x6Mo19544k4.dispose();
                    return length;
                } catch (Throwable th) {
                    if (abstractC3150x6Mo19544k4 != null) {
                        abstractC3150x6Mo19544k4.dispose();
                    }
                    throw th;
                }
            } finally {
                c3152yj.dispose();
            }
        } finally {
            this.f9605h4 = i2;
        }
    }

    @Override // com.aspose.slides.internal.p416tb.C10894bv
    /* JADX INFO: renamed from: kk */
    public AbstractC4691k4 mo13905kk() {
        int i = this.f9605h4;
        switch (i) {
            case 0:
                return null;
            case 1:
                return new C4690h4();
            case 2:
                return new C4694to();
            case 3:
            case 4:
                C4689du c4689du = new C4689du();
                c4689du.m19548kk(this.f9604dy);
                c4689du.m19549x1(this.f9607k4.m58544k4());
                c4689du.m19545k4(this.f9609m9.m17720h4());
                c4689du.m19547k4(this.f9605h4 == 3);
                return c4689du;
            case 5:
                return new C4692kk();
            case 6:
            case 7:
                return new C4695x1(i, this.f9607k4);
            default:
                throw new InvalidOperationException("Unknown image compression filter type.");
        }
    }

    /* JADX INFO: renamed from: x1 */
    public void m13922x1(C4127k4 c4127k4) throws Throwable {
        c4127k4.mo16493x1(m52421k4(), this.f37962x1.m52464x1().m52603c5());
    }

    /* JADX INFO: renamed from: kk */
    private void m13914kk(C4127k4 c4127k4) throws Throwable {
        int i = this.f9605h4;
        if (i != 5) {
            m13910k4(c4127k4, i == 6 || i == 7);
        } else {
            m13918k4(c4127k4);
        }
    }

    /* JADX INFO: renamed from: k4 */
    public C4315ck m13917k4(C4127k4 c4127k4, boolean z, boolean z2) {
        return C4127k4.m16516k4(c4127k4.m16534dy(), z, z2);
    }

    /* JADX INFO: renamed from: x1 */
    public void m13923x1(C4315ck c4315ck) {
        m52427k4(c4315ck.m17309k4(), 0, c4315ck.m17309k4().length);
    }

    /* JADX INFO: renamed from: k4 */
    public final void m13918k4(C4127k4 c4127k4) throws Throwable {
        C4383k4 c4383k4M17718x1;
        m13922x1(c4127k4);
        boolean zM52454fa = this.f37962x1.m52454fa();
        m13919k4(C4127k4.m16516k4(c4127k4.m16534dy(), false, zM52454fa), !zM52454fa);
        int iM16547m9 = c4127k4.m16547m9();
        if (iM16547m9 == 0) {
            c4383k4M17718x1 = C4383k4.m17718x1();
        } else {
            if (iM16547m9 != 2) {
                throw new InvalidOperationException("Unexpected color model.");
            }
            c4383k4M17718x1 = C4383k4.m17714k4();
        }
        this.f9609m9 = c4383k4M17718x1;
        this.f9604dy = 8;
    }

    /* JADX INFO: renamed from: kk */
    public void m13920kk(C10922yj c10922yj) {
        m13921to(c10922yj);
    }

    @Override // com.aspose.slides.internal.p416tb.C10894bv
    /* JADX INFO: renamed from: x1 */
    public void mo9084x1(C10922yj c10922yj) {
        c10922yj.m52666kk("/Type", "/XObject");
        c10922yj.m52666kk("/Subtype", "/Image");
        c10922yj.m52652k4("/Width", this.f9607k4.m58544k4());
        c10922yj.m52652k4("/Height", this.f9607k4.m58547x1());
        C6920du c6920du = this.f9602ck;
        if (c6920du != null) {
            c10922yj.m52661k4("/Mask", new int[]{c6920du.m27121k4().m23102kk(), this.f9602ck.m27123x1().m23102kk(), this.f9602ck.m27121k4().m23104to(), this.f9602ck.m27123x1().m23104to(), this.f9602ck.m27121k4().m23099du(), this.f9602ck.m27123x1().m23099du()});
        }
        c10922yj.m52666kk("/ColorSpace", this.f9609m9 == C4383k4.m17716kk() ? C14113y2.m67402k4("[/{0}/DeviceRGB {1} {2}]", this.f9609m9.m17719du(), Integer.valueOf(this.f9606jd - 1), this.f9601c5.m52565c5()) : C14113y2.m67402k4("/{0}", this.f9609m9.m17719du()));
        c10922yj.m52652k4("/BitsPerComponent", this.f9604dy);
        C3210kk c3210kk = this.f9608kk;
        if (c3210kk != null) {
            c10922yj.m52666kk("/SMask", c3210kk.m52565c5());
        }
    }

    /* JADX INFO: renamed from: k4 */
    private void m13910k4(C4127k4 c4127k4, boolean z) {
        boolean zM52454fa = this.f37962x1.m52454fa();
        C4315ck c4315ckM13917k4 = m13917k4(c4127k4, z, zM52454fa);
        m13923x1(c4315ckM13917k4);
        this.f9609m9 = C4383k4.m17715k4(c4315ckM13917k4.m17311to());
        this.f9604dy = c4315ckM13917k4.m17308du();
        m13919k4(c4315ckM13917k4, !zM52454fa);
    }

    /* JADX INFO: renamed from: k4 */
    public void m13919k4(C4315ck c4315ck, boolean z) {
        if (c4315ck.m17310kk() && z) {
            this.f9608kk = new C3210kk(this.f37962x1, c4315ck.m17312x1(), m13916k4(c4315ck), this.f9607k4.m58544k4(), this.f9607k4.m58547x1());
        }
    }

    @Override // com.aspose.slides.internal.p416tb.C10894bv, com.aspose.slides.internal.p416tb.AbstractC10914up
    /* JADX INFO: renamed from: k4 */
    public void mo9082k4(C10922yj c10922yj) {
        try {
            m13908du(c10922yj);
        } catch (RuntimeException unused) {
            this.f9610to = C6923jd.m27138x1();
            this.f9603du = null;
            m13908du(c10922yj);
        }
    }

    /* JADX INFO: renamed from: k4 */
    private void m13911k4(C5656k4[] c5656k4Arr) {
        this.f9601c5 = new C10894bv(this.f37962x1);
        this.f9606jd = c5656k4Arr.length;
        for (int i = 0; i < this.f9606jd; i++) {
            this.f9601c5.m52422k4((byte) c5656k4Arr[i].m23102kk());
            this.f9601c5.m52422k4((byte) c5656k4Arr[i].m23104to());
            this.f9601c5.m52422k4((byte) c5656k4Arr[i].m23099du());
        }
    }

    /* JADX INFO: renamed from: k4 */
    private byte[] m13912k4(byte[] bArr) {
        try {
            C4127k4 c4127k4 = new C4127k4(bArr);
            try {
                c4127k4.m16542k4(m52569m9().m52464x1().m52624rv());
                C3152yj c3152yj = new C3152yj();
                try {
                    if (c4127k4.m16536h4() == 4) {
                        c4127k4.m16541k4(c3152yj, 4);
                    } else {
                        c4127k4.m16541k4(c3152yj, 5);
                    }
                    byte[] array = c3152yj.toArray();
                    c3152yj.dispose();
                    return array;
                } catch (Throwable th) {
                    c3152yj.dispose();
                    throw th;
                }
            } finally {
                c4127k4.dispose();
            }
        } catch (RuntimeException unused) {
            return C6923jd.m27138x1();
        }
    }
}
