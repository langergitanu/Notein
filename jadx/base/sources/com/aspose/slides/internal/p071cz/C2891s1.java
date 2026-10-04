package com.aspose.slides.internal.p071cz;

import com.aspose.slides.IGenericCloneable;
import com.aspose.slides.exceptions.ArgumentNullException;

/* JADX INFO: renamed from: com.aspose.slides.internal.cz.s1 */
/* JADX INFO: loaded from: classes3.dex */
public final class C2891s1 implements IGenericCloneable<C2891s1> {

    /* JADX INFO: renamed from: du */
    private C2867q6 f8736du;

    /* JADX INFO: renamed from: k4 */
    private boolean f8737k4;

    /* JADX INFO: renamed from: kk */
    private double f8738kk;

    /* JADX INFO: renamed from: to */
    private C2706dw f8739to;

    /* JADX INFO: renamed from: x1 */
    private boolean f8740x1;

    public C2891s1() {
        this(new C2706dw(0.0d, 0.0d), new C2867q6(0.0d, 0.0d));
    }

    @Override // com.aspose.slides.IGenericCloneable
    /* JADX INFO: renamed from: du, reason: merged with bridge method [inline-methods] */
    public C2891s1 cloneT() {
        return new C2891s1(this.f8739to, this.f8736du, this.f8738kk, this.f8737k4, this.f8740x1);
    }

    /* JADX INFO: renamed from: k4 */
    public C2706dw m12516k4() {
        return this.f8739to;
    }

    /* JADX INFO: renamed from: kk */
    public boolean m12519kk() {
        return this.f8740x1;
    }

    /* JADX INFO: renamed from: to */
    public double m12520to() {
        return this.f8738kk;
    }

    /* JADX INFO: renamed from: x1 */
    public C2867q6 m12521x1() {
        return this.f8736du;
    }

    public C2891s1(C2706dw c2706dw, C2867q6 c2867q6) {
        this.f8739to = new C2706dw(0.0d, 0.0d);
        this.f8736du = new C2867q6(0.0d, 0.0d);
        this.f8737k4 = false;
        this.f8740x1 = false;
        this.f8738kk = 0.0d;
        m12517k4(c2706dw);
        m12518k4(c2867q6);
    }

    /* JADX INFO: renamed from: k4 */
    public void m12517k4(C2706dw c2706dw) {
        if (c2706dw == null) {
            throw new ArgumentNullException("value");
        }
        this.f8739to = c2706dw.cloneT();
    }

    public C2891s1(C2706dw c2706dw, C2867q6 c2867q6, double d, boolean z, boolean z2) {
        this.f8739to = new C2706dw(0.0d, 0.0d);
        this.f8736du = new C2867q6(0.0d, 0.0d);
        this.f8737k4 = z;
        this.f8740x1 = z2;
        this.f8738kk = d;
        m12517k4(c2706dw);
        m12518k4(c2867q6);
    }

    /* JADX INFO: renamed from: k4 */
    public void m12518k4(C2867q6 c2867q6) {
        if (c2867q6 == null) {
            throw new ArgumentNullException("value");
        }
        this.f8736du = c2867q6.cloneT();
    }
}
