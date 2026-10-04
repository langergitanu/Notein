package com.aspose.slides.internal.p071cz;

import com.aspose.slides.IGenericCloneable;
import com.aspose.slides.exceptions.ArgumentOutOfRangeException;

/* JADX INFO: renamed from: com.aspose.slides.internal.cz.ji */
/* JADX INFO: loaded from: classes3.dex */
public final class C2778ji implements IGenericCloneable<C2778ji> {

    /* JADX INFO: renamed from: ar */
    private double f8640ar;

    /* JADX INFO: renamed from: c5 */
    private C2798kx f8641c5;

    /* JADX INFO: renamed from: du */
    private AbstractC2841o1 f8643du;

    /* JADX INFO: renamed from: dy */
    private C2798kx f8644dy;

    /* JADX INFO: renamed from: fa */
    private String f8645fa;

    /* JADX INFO: renamed from: h4 */
    private AbstractC2864pu f8646h4;

    /* JADX INFO: renamed from: jd */
    private C2798kx f8648jd;

    /* JADX INFO: renamed from: k4 */
    private C2745gz f8649k4;

    /* JADX INFO: renamed from: kk */
    private AbstractC2718ew f8650kk;

    /* JADX INFO: renamed from: ks */
    private boolean f8651ks;

    /* JADX INFO: renamed from: m9 */
    private C2798kx f8652m9;

    /* JADX INFO: renamed from: qq */
    private double f8654qq;

    /* JADX INFO: renamed from: to */
    private AbstractC2845o9 f8656to;

    /* JADX INFO: renamed from: u4 */
    private double f8657u4;

    /* JADX INFO: renamed from: up */
    private String f8658up;

    /* JADX INFO: renamed from: uz */
    private boolean f8659uz;

    /* JADX INFO: renamed from: wl */
    private boolean f8660wl;

    /* JADX INFO: renamed from: x1 */
    private AbstractC2718ew f8661x1;

    /* JADX INFO: renamed from: yj */
    private boolean f8663yj;

    /* JADX INFO: renamed from: ck */
    private int f8642ck = 0;

    /* JADX INFO: renamed from: rv */
    private int f8655rv = 0;

    /* JADX INFO: renamed from: x6 */
    private int f8662x6 = 0;

    /* JADX INFO: renamed from: ne */
    private double f8653ne = 100.0d;

    /* JADX INFO: renamed from: ix */
    private int f8647ix = 0;

    public C2778ji() {
    }

    /* JADX INFO: renamed from: du */
    public boolean m12352du() {
        return this.f8651ks;
    }

    @Override // com.aspose.slides.IGenericCloneable
    /* JADX INFO: renamed from: dy, reason: merged with bridge method [inline-methods] */
    public C2778ji cloneT() {
        return new C2778ji(this);
    }

    /* JADX INFO: renamed from: h4 */
    public double m12354h4() {
        return this.f8654qq;
    }

    /* JADX INFO: renamed from: k4 */
    public C2745gz m12355k4() {
        return this.f8649k4;
    }

    /* JADX INFO: renamed from: kk */
    public C2798kx m12366kk() {
        return this.f8652m9;
    }

    /* JADX INFO: renamed from: m9 */
    public double m12371m9() {
        return this.f8640ar;
    }

    /* JADX INFO: renamed from: to */
    public void m12372to(double d) {
        if (d < 0.0d) {
            throw new ArgumentOutOfRangeException("value");
        }
        this.f8640ar = d;
    }

    /* JADX INFO: renamed from: x1 */
    public AbstractC2718ew m12377x1() {
        return this.f8661x1;
    }

    private C2778ji(C2778ji c2778ji) {
        m12359k4(c2778ji.f8649k4);
        m12358k4(c2778ji.f8661x1);
        m12380x1(c2778ji.f8650kk);
        m12362k4(c2778ji.f8656to);
        m12361k4(c2778ji.f8643du);
        m12363k4(c2778ji.f8646h4);
        m12360k4(c2778ji.f8652m9);
        m12381x1(c2778ji.f8644dy);
        m12369kk(c2778ji.f8641c5);
        m12374to(c2778ji.f8648jd);
        m12357k4(c2778ji.f8642ck);
        m12364k4(c2778ji.f8645fa);
        m12382x1(c2778ji.f8658up);
        m12365k4(c2778ji.f8663yj);
        m12383x1(c2778ji.f8651ks);
        m12379x1(c2778ji.f8655rv);
        m12368kk(c2778ji.f8662x6);
        m12356k4(c2778ji.f8653ne);
        m12373to(c2778ji.f8647ix);
        m12378x1(c2778ji.f8657u4);
        m12370kk(c2778ji.f8659uz);
        m12375to(c2778ji.f8660wl);
        m12367kk(c2778ji.f8654qq);
        m12372to(c2778ji.f8640ar);
    }

    /* JADX INFO: renamed from: k4 */
    public void m12356k4(double d) {
        if (d <= 0.0d) {
            throw new ArgumentOutOfRangeException("value");
        }
        this.f8653ne = d;
    }

    /* JADX INFO: renamed from: kk */
    public void m12367kk(double d) {
        this.f8654qq = d;
    }

    /* JADX INFO: renamed from: to */
    public void m12373to(int i) {
        this.f8647ix = i;
    }

    /* JADX INFO: renamed from: x1 */
    public void m12378x1(double d) {
        if (d < 0.0d) {
            throw new ArgumentOutOfRangeException("value");
        }
        this.f8657u4 = d;
    }

    /* JADX INFO: renamed from: k4 */
    public void m12357k4(int i) {
        this.f8642ck = i;
    }

    /* JADX INFO: renamed from: kk */
    public void m12368kk(int i) {
        this.f8662x6 = i;
    }

    /* JADX INFO: renamed from: to */
    public void m12374to(C2798kx c2798kx) {
        if (c2798kx == this.f8648jd) {
            return;
        }
        this.f8648jd = c2798kx != null ? c2798kx.cloneT() : null;
    }

    /* JADX INFO: renamed from: x1 */
    public void m12379x1(int i) {
        this.f8655rv = i;
    }

    /* JADX INFO: renamed from: k4 */
    public void m12358k4(AbstractC2718ew abstractC2718ew) {
        if (this.f8661x1 == abstractC2718ew) {
            return;
        }
        this.f8661x1 = abstractC2718ew != null ? abstractC2718ew.cloneT() : null;
    }

    /* JADX INFO: renamed from: kk */
    public void m12369kk(C2798kx c2798kx) {
        if (c2798kx == this.f8641c5) {
            return;
        }
        this.f8641c5 = c2798kx != null ? c2798kx.cloneT() : null;
    }

    /* JADX INFO: renamed from: to */
    public void m12375to(boolean z) {
        this.f8660wl = z;
    }

    /* JADX INFO: renamed from: x1 */
    public void m12380x1(AbstractC2718ew abstractC2718ew) {
        if (this.f8650kk == abstractC2718ew) {
            return;
        }
        this.f8650kk = abstractC2718ew != null ? abstractC2718ew.cloneT() : null;
    }

    /* JADX INFO: renamed from: k4 */
    public void m12359k4(C2745gz c2745gz) {
        if (this.f8649k4 == c2745gz) {
            return;
        }
        this.f8649k4 = c2745gz != null ? c2745gz.cloneT() : null;
    }

    /* JADX INFO: renamed from: kk */
    public void m12370kk(boolean z) {
        this.f8659uz = z;
    }

    /* JADX INFO: renamed from: to */
    public boolean m12376to() {
        return this.f8663yj;
    }

    /* JADX INFO: renamed from: x1 */
    public void m12381x1(C2798kx c2798kx) {
        if (c2798kx == this.f8644dy) {
            return;
        }
        this.f8644dy = c2798kx != null ? c2798kx.cloneT() : null;
    }

    /* JADX INFO: renamed from: k4 */
    public void m12360k4(C2798kx c2798kx) {
        if (c2798kx == this.f8652m9) {
            return;
        }
        this.f8652m9 = c2798kx != null ? c2798kx.cloneT() : null;
    }

    /* JADX INFO: renamed from: x1 */
    public void m12382x1(String str) {
        this.f8658up = str;
    }

    /* JADX INFO: renamed from: k4 */
    public void m12361k4(AbstractC2841o1 abstractC2841o1) {
        if (abstractC2841o1 == this.f8643du) {
            return;
        }
        this.f8643du = abstractC2841o1 != null ? abstractC2841o1.cloneT() : null;
    }

    /* JADX INFO: renamed from: x1 */
    public void m12383x1(boolean z) {
        this.f8651ks = z;
    }

    /* JADX INFO: renamed from: k4 */
    public void m12362k4(AbstractC2845o9 abstractC2845o9) {
        if (this.f8656to == abstractC2845o9) {
            return;
        }
        this.f8656to = abstractC2845o9 != null ? abstractC2845o9.cloneT() : null;
    }

    /* JADX INFO: renamed from: k4 */
    public void m12363k4(AbstractC2864pu abstractC2864pu) {
        if (abstractC2864pu == this.f8646h4) {
            return;
        }
        this.f8646h4 = abstractC2864pu != null ? abstractC2864pu.cloneT() : null;
    }

    /* JADX INFO: renamed from: k4 */
    public void m12364k4(String str) {
        this.f8645fa = str;
    }

    /* JADX INFO: renamed from: k4 */
    public void m12365k4(boolean z) {
        this.f8663yj = z;
    }
}
