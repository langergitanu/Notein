package com.aspose.slides.internal.p416tb;

import com.aspose.slides.exceptions.ArgumentNullException;
import com.aspose.slides.exceptions.InvalidOperationException;
import com.aspose.slides.internal.p080dd.AbstractC3150x6;
import com.aspose.slides.internal.p085dk.C3173h4;
import com.aspose.slides.internal.p168hj.C4590k4;
import com.aspose.slides.internal.p294n9.AbstractC6747ar;
import com.aspose.slides.internal.p346pw.C9574to;
import com.aspose.slides.internal.p357qc.C9830c5;
import com.aspose.slides.internal.p443ul.C11447x1;
import com.aspose.slides.internal.p456v5.C11609m9;
import com.aspose.slides.internal.p475wh.C12015qq;
import com.aspose.slides.internal.p505xn.C12565ks;
import com.aspose.slides.p559ms.System.C14113y2;

/* JADX INFO: renamed from: com.aspose.slides.internal.tb.jd */
/* JADX INFO: loaded from: classes4.dex */
public class C10902jd {

    /* JADX INFO: renamed from: c5 */
    private C10898dy f37904c5;

    /* JADX INFO: renamed from: ck */
    private C11447x1 f37905ck;

    /* JADX INFO: renamed from: du */
    private byte[] f37906du;

    /* JADX INFO: renamed from: dy */
    private C10912u4 f37907dy;

    /* JADX INFO: renamed from: h4 */
    private C10905ks f37908h4;

    /* JADX INFO: renamed from: jd */
    private C10897du f37909jd;

    /* JADX INFO: renamed from: k4 */
    private boolean f37910k4;

    /* JADX INFO: renamed from: kk */
    private boolean f37911kk;

    /* JADX INFO: renamed from: m9 */
    private C10900h4 f37912m9;

    /* JADX INFO: renamed from: to */
    private C3173h4 f37913to = new C3173h4();

    /* JADX INFO: renamed from: x1 */
    private C10922yj f37914x1;

    public C10902jd(AbstractC3150x6 abstractC3150x6, C10920x6 c10920x6) {
        m52477k4(abstractC3150x6, c10920x6, false);
    }

    /* JADX INFO: renamed from: ks */
    private byte[] m52478ks() {
        byte[] bArr = this.f37906du;
        if (bArr != null) {
            return bArr;
        }
        String strM67402k4 = C14113y2.m67402k4("{0}/{1}/{2}/{3}/{4}/{5}/{6}/{7}", this.f37913to.m13567kk(), this.f37913to.m13555du(), this.f37913to.m13560h4(), this.f37913to.m13564k4(), this.f37913to.m13572to(), this.f37913to.m13575x1(), C9574to.m46743k4(this.f37913to.m13559fa().Clone()), C9574to.m46743k4(this.f37913to.m13574up().Clone()));
        C11609m9 c11609m9 = new C11609m9();
        try {
            this.f37906du = c11609m9.m19588x1(AbstractC6747ar.m26635ix().mo26677to(strM67402k4));
            c11609m9.dispose();
            return this.f37906du;
        } catch (Throwable th) {
            c11609m9.dispose();
            throw th;
        }
    }

    /* JADX INFO: renamed from: up */
    private void m52479up() {
        if (this.f37904c5.m52464x1().m52620ks() && this.f37912m9.m52469k4().m52571k4() == 1) {
            C11447x1 c11447x1 = new C11447x1(this.f37904c5, m52478ks());
            this.f37905ck = c11447x1;
            c11447x1.mo9082k4(this.f37914x1);
        }
    }

    /* JADX INFO: renamed from: yj */
    private void m52480yj() {
    }

    /* JADX INFO: renamed from: c5 */
    public final C10897du m52481c5() {
        return this.f37909jd;
    }

    /* JADX INFO: renamed from: ck */
    public final C10915uz m52482ck() {
        return this.f37912m9.m52469k4();
    }

    /* JADX INFO: renamed from: du */
    public final C10898dy m52483du() {
        return this.f37904c5;
    }

    /* JADX INFO: renamed from: dy */
    public final C10913um m52484dy() {
        return m52482ck().m52573x1();
    }

    /* JADX INFO: renamed from: fa */
    public final C9830c5 m52485fa() {
        return this.f37912m9.m52471kk();
    }

    /* JADX INFO: renamed from: h4 */
    public final C4590k4 m52486h4() {
        return this.f37912m9.m52472to();
    }

    /* JADX INFO: renamed from: jd */
    public final C10908ne m52487jd() {
        return this.f37912m9.m52473x1();
    }

    /* JADX INFO: renamed from: k4 */
    public final void m52488k4() {
        if (this.f37910k4) {
            return;
        }
        this.f37909jd.m52448k4(this.f37914x1);
        this.f37908h4.mo9082k4(this.f37914x1);
        this.f37912m9.mo9082k4(this.f37914x1);
        m52476k4(this.f37914x1.m52677kk());
        this.f37914x1.m52665kk("%%EOF");
        if (this.f37911kk) {
            this.f37914x1.m52641du();
        }
        this.f37910k4 = true;
    }

    /* JADX INFO: renamed from: kk */
    public final C3173h4 m52492kk() {
        return this.f37913to;
    }

    /* JADX INFO: renamed from: m9 */
    public final C10912u4 m52493m9() {
        return this.f37907dy;
    }

    /* JADX INFO: renamed from: to */
    public final C11447x1 m52494to() {
        return this.f37905ck;
    }

    /* JADX INFO: renamed from: x1 */
    public final void m52495x1() {
        C10912u4 c10912u4 = this.f37907dy;
        if (c10912u4 == null) {
            throw new InvalidOperationException("No page to end.");
        }
        c10912u4.m52532k4();
        this.f37907dy.mo9082k4(this.f37914x1);
        this.f37907dy = null;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m52489k4(float f, float f2) {
        if (this.f37907dy != null) {
            throw new InvalidOperationException("Cannot start a new page while another page is not finished.");
        }
        this.f37907dy = new C10912u4(this.f37904c5, f, f2);
        this.f37912m9.m52469k4().m52572k4(this.f37907dy.m52565c5());
        m52479up();
        m52480yj();
    }

    /* JADX INFO: renamed from: k4 */
    private void m52476k4(int i) {
        this.f37914x1.m52665kk("trailer");
        this.f37914x1.m52643dy();
        C10922yj c10922yj = this.f37914x1;
        c10922yj.m52652k4("/Size", c10922yj.m52675k4());
        this.f37914x1.m52666kk("/Info", this.f37908h4.m52565c5());
        this.f37914x1.m52666kk("/Root", this.f37912m9.m52565c5());
        if (this.f37904c5.m52464x1().m52620ks()) {
            this.f37914x1.m52666kk("/Encrypt", this.f37905ck.m52565c5());
        }
        if (this.f37904c5.m52454fa() || this.f37904c5.m52464x1().m52620ks()) {
            this.f37914x1.m52666kk("/ID", C14113y2.m67402k4("[<{0}><{0}>]", C12565ks.m58611k4(m52478ks())));
        }
        this.f37914x1.m52640c5();
        this.f37914x1.m52667m9();
        this.f37914x1.m52665kk("startxref");
        this.f37914x1.m52665kk(C9574to.m46742k4(i));
    }

    /* JADX INFO: renamed from: k4 */
    private void m52477k4(AbstractC3150x6 abstractC3150x6, C10920x6 c10920x6, boolean z) {
        C10922yj c10922yj;
        String str;
        if (abstractC3150x6 == null) {
            throw new ArgumentNullException("stream");
        }
        if (c10920x6 == null) {
            throw new ArgumentNullException("options");
        }
        c10920x6.m52611k4();
        this.f37911kk = z;
        this.f37904c5 = new C10898dy(this, c10920x6);
        this.f37914x1 = new C10922yj(abstractC3150x6);
        this.f37909jd = new C10897du();
        this.f37908h4 = new C10905ks(this.f37904c5);
        this.f37912m9 = new C10900h4(this.f37904c5);
        if (this.f37904c5.m52454fa()) {
            if (c10920x6.m52604ck() == 3 || c10920x6.m52604ck() == 4) {
                c10922yj = this.f37914x1;
                str = "%PDF-1.4";
                c10922yj.m52665kk(str);
            }
            this.f37914x1.m52665kk("%PDF-1.7");
        } else {
            if (this.f37904c5.m52464x1().m52604ck() == 0) {
                c10922yj = this.f37914x1;
                str = "%PDF-1.5";
            } else {
                if (this.f37904c5.m52464x1().m52604ck() == 1) {
                    c10922yj = this.f37914x1;
                    str = "%PDF-1.6";
                }
                this.f37914x1.m52665kk("%PDF-1.7");
            }
            c10922yj.m52665kk(str);
        }
        this.f37914x1.m52665kk("%µµµµ");
    }

    /* JADX INFO: renamed from: k4 */
    public final void m52490k4(C12015qq c12015qq) {
        m52489k4(c12015qq.m56699x1(), c12015qq.m56697kk());
    }

    /* JADX INFO: renamed from: k4 */
    public final void m52491k4(String str) {
        this.f37912m9.m52470k4(str);
    }
}
