package com.aspose.slides.internal.p416tb;

import com.aspose.slides.exceptions.InvalidOperationException;
import com.aspose.slides.internal.p080dd.AbstractC3150x6;
import com.aspose.slides.internal.p080dd.C3152yj;
import com.aspose.slides.internal.p151gj.C4317dy;
import com.aspose.slides.internal.p173hx.AbstractC4691k4;
import com.aspose.slides.internal.p173hx.C4689du;
import com.aspose.slides.internal.p173hx.C4690h4;
import com.aspose.slides.internal.p173hx.C4693m9;
import com.aspose.slides.internal.p173hx.C4694to;
import com.aspose.slides.internal.p443ul.C11445kk;
import com.aspose.slides.internal.p475wh.C12025x6;

/* JADX INFO: renamed from: com.aspose.slides.internal.tb.bv */
/* JADX INFO: loaded from: classes4.dex */
public class C10894bv extends AbstractC10914up {

    /* JADX INFO: renamed from: k4 */
    private final C3152yj f37867k4;

    /* JADX INFO: renamed from: kk */
    private final C10921yd f37868kk;

    /* JADX INFO: renamed from: to */
    private C4693m9 f37869to;

    public C10894bv(C10898dy c10898dy) {
        super(c10898dy);
        C3152yj c3152yj = new C3152yj();
        this.f37867k4 = c3152yj;
        this.f37868kk = new C10921yd(c3152yj);
    }

    /* JADX INFO: renamed from: k4 */
    public final AbstractC3150x6 m52421k4() {
        return this.f37867k4;
    }

    /* JADX INFO: renamed from: kk */
    public AbstractC4691k4 mo13905kk() {
        int iM52608h4;
        if (this.f37962x1.m52454fa() || mo13906to() < 200 || (iM52608h4 = this.f37962x1.m52464x1().m52608h4()) == 0) {
            return null;
        }
        if (iM52608h4 == 1) {
            return new C4690h4();
        }
        if (iM52608h4 == 2) {
            return new C4689du();
        }
        if (iM52608h4 == 3) {
            return new C4694to();
        }
        throw new InvalidOperationException("Unknown text compression filter type.");
    }

    /* JADX INFO: renamed from: to */
    public long mo13906to() {
        return this.f37867k4.getLength();
    }

    /* JADX INFO: renamed from: x1 */
    public final C10921yd m52433x1() {
        return this.f37868kk;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m52422k4(byte b) {
        this.f37868kk.m52645k4(b);
    }

    /* JADX INFO: renamed from: kk */
    public final void m52429kk(String str) {
        this.f37868kk.m52672x1(str);
    }

    /* JADX INFO: renamed from: to */
    public final void m52432to(String str) {
        this.f37868kk.m52642du(str);
    }

    /* JADX INFO: renamed from: x1 */
    public void mo9084x1(C10922yj c10922yj) {
    }

    /* JADX INFO: renamed from: k4 */
    public final void m52423k4(C4317dy c4317dy, String str) {
        this.f37868kk.m52648k4(c4317dy);
        this.f37868kk.m52644h4();
        this.f37868kk.m52650k4(str);
        this.f37868kk.m52644h4();
    }

    /* JADX INFO: renamed from: kk */
    public final void m52430kk(String str, String str2) {
        this.f37868kk.m52656k4(str, str2);
        this.f37868kk.m52644h4();
    }

    /* JADX INFO: renamed from: x1 */
    public final void m52434x1(String str) {
        this.f37868kk.m52665kk(str);
    }

    @Override // com.aspose.slides.internal.p416tb.AbstractC10914up
    /* JADX INFO: renamed from: k4 */
    public void mo9082k4(C10922yj c10922yj) {
        m52424k4(c10922yj, this.f37867k4.getBuffer(), (int) this.f37867k4.getLength());
    }

    /* JADX INFO: renamed from: kk */
    public final void m52431kk(String str, String str2, String str3) {
        this.f37868kk.m52657k4(str, str2, str3);
        this.f37868kk.m52644h4();
    }

    /* JADX INFO: renamed from: x1 */
    public final void m52435x1(String str, String str2) {
        this.f37868kk.m52673x1(str, str2);
    }

    /* JADX INFO: renamed from: k4 */
    public final void m52424k4(C10922yj c10922yj, byte[] bArr, int i) {
        c10922yj.m52676k4(this);
        c10922yj.m52643dy();
        this.f37869to = new C4693m9(this.f37962x1);
        mo9084x1(c10922yj);
        c10922yj.m52666kk("/Length", this.f37869to.m52565c5());
        AbstractC4691k4 abstractC4691k4Mo13905kk = mo13905kk();
        if (abstractC4691k4Mo13905kk != null) {
            abstractC4691k4Mo13905kk.mo19546k4(c10922yj);
        }
        c10922yj.m52640c5();
        c10922yj.m52665kk("stream");
        AbstractC3150x6 abstractC3150x6M52668to = c10922yj.m52668to();
        C11445kk c11445kkM52570yj = m52570yj();
        if (c11445kkM52570yj != null) {
            abstractC3150x6M52668to = c11445kkM52570yj.m54503k4(abstractC3150x6M52668to);
        }
        if (abstractC4691k4Mo13905kk != null) {
            abstractC3150x6M52668to = abstractC4691k4Mo13905kk.mo19544k4(abstractC3150x6M52668to);
        }
        long length = abstractC3150x6M52668to.getLength();
        abstractC3150x6M52668to.write(bArr, 0, i);
        long length2 = abstractC3150x6M52668to.getLength() - length;
        c10922yj.m52667m9();
        c10922yj.m52650k4("endstream");
        c10922yj.m52678x1();
        this.f37869to.m19550k4((int) length2);
        this.f37869to.mo9082k4(c10922yj);
    }

    /* JADX INFO: renamed from: x1 */
    public final void m52436x1(String str, String str2, String str3) {
        this.f37868kk.m52674x1(str, str2, str3);
    }

    /* JADX INFO: renamed from: k4 */
    public final void m52425k4(C12025x6 c12025x6) {
        this.f37868kk.m52646k4(c12025x6.m56897x1());
        this.f37868kk.m52644h4();
        this.f37868kk.m52646k4(c12025x6.m56895kk());
    }

    /* JADX INFO: renamed from: k4 */
    public final void m52426k4(String str) {
        this.f37868kk.m52650k4(str);
    }

    /* JADX INFO: renamed from: k4 */
    public final void m52427k4(byte[] bArr, int i, int i2) {
        this.f37868kk.m52662k4(bArr, i, i2);
    }

    /* JADX INFO: renamed from: k4 */
    public final void m52428k4(float[] fArr) {
        this.f37868kk.m52663k4(fArr);
    }
}
