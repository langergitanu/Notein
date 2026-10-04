package com.aspose.slides.internal.p151gj;

import com.aspose.slides.exceptions.ArgumentException;
import com.aspose.slides.exceptions.ArgumentNullException;
import com.aspose.slides.internal.p223ka.C5656k4;

/* JADX INFO: renamed from: com.aspose.slides.internal.gj.jd */
/* JADX INFO: loaded from: classes.dex */
public class C4320jd implements Cloneable {

    /* JADX INFO: renamed from: c5 */
    private int f11786c5;

    /* JADX INFO: renamed from: ck */
    private float[] f11787ck;

    /* JADX INFO: renamed from: dy */
    private float[] f11788dy;

    /* JADX INFO: renamed from: fa */
    private int f11789fa;

    /* JADX INFO: renamed from: h4 */
    private int f11790h4;

    /* JADX INFO: renamed from: jd */
    private float f11791jd;

    /* JADX INFO: renamed from: ks */
    private float f11792ks;

    /* JADX INFO: renamed from: m9 */
    private C4328x1 f11793m9;

    /* JADX INFO: renamed from: rv */
    private int f11794rv;

    /* JADX INFO: renamed from: up */
    private int f11795up;

    /* JADX INFO: renamed from: x6 */
    private float f11796x6;

    /* JADX INFO: renamed from: yj */
    private int f11797yj;

    /* JADX INFO: renamed from: k4 */
    private static final float[] f11782k4 = {3.0f, 1.0f};

    /* JADX INFO: renamed from: x1 */
    private static final float[] f11785x1 = {3.0f, 1.0f, 1.0f, 1.0f};

    /* JADX INFO: renamed from: kk */
    private static final float[] f11783kk = {3.0f, 1.0f, 1.0f, 1.0f, 1.0f, 1.0f};

    /* JADX INFO: renamed from: to */
    private static final float[] f11784to = {1.0f, 1.0f};

    /* JADX INFO: renamed from: du */
    private static final float[] f11781du = new float[0];

    public C4320jd(C4328x1 c4328x1, float f) {
        float[] fArr = f11781du;
        this.f11788dy = fArr;
        this.f11786c5 = 0;
        this.f11787ck = fArr;
        this.f11789fa = 0;
        this.f11795up = 0;
        this.f11797yj = 0;
        this.f11792ks = 10.0f;
        this.f11794rv = 0;
        this.f11796x6 = 1.0f;
        if (c4328x1 == null) {
            throw new ArgumentNullException("brush");
        }
        this.f11793m9 = c4328x1;
        this.f11796x6 = f;
    }

    /* JADX INFO: renamed from: c5 */
    public final int m17356c5() {
        return this.f11786c5;
    }

    /* JADX INFO: renamed from: ck */
    public final float[] m17357ck() {
        return this.f11787ck;
    }

    /* JADX INFO: renamed from: du */
    public final int m17358du() {
        return this.f11797yj;
    }

    /* JADX INFO: renamed from: dy */
    public final float m17360dy() {
        return this.f11791jd;
    }

    /* JADX INFO: renamed from: fa */
    public final float[] m17361fa() {
        return this.f11788dy;
    }

    /* JADX INFO: renamed from: h4 */
    public final C4328x1 m17362h4() {
        return this.f11793m9;
    }

    /* JADX INFO: renamed from: jd */
    public final int m17364jd() {
        return this.f11789fa;
    }

    /* JADX INFO: renamed from: k4 */
    public final int m17365k4() {
        return this.f11790h4;
    }

    /* JADX INFO: renamed from: kk */
    public final int m17369kk() {
        return this.f11794rv;
    }

    /* JADX INFO: renamed from: m9 */
    public final float m17372m9() {
        return this.f11792ks;
    }

    /* JADX INFO: renamed from: to */
    public final int m17373to() {
        return this.f11795up;
    }

    /* JADX INFO: renamed from: x1 */
    public final float m17375x1() {
        return this.f11796x6;
    }

    public C4320jd(C5656k4 c5656k4) {
        this(c5656k4, 1.0f);
    }

    /* JADX INFO: renamed from: du */
    public final void m17359du(int i) {
        this.f11786c5 = i;
    }

    /* JADX INFO: renamed from: h4 */
    public final void m17363h4(int i) {
        this.f11789fa = i;
        if (i == 0) {
            this.f11787ck = f11781du;
            return;
        }
        if (i == 1) {
            this.f11787ck = f11782k4;
            return;
        }
        if (i == 2) {
            this.f11787ck = f11784to;
            return;
        }
        if (i == 3) {
            this.f11787ck = f11785x1;
        } else if (i == 4) {
            this.f11787ck = f11783kk;
        } else if (i != 5) {
            throw new ArgumentException("Unknown dash style.");
        }
    }

    /* JADX INFO: renamed from: k4 */
    public final void m17366k4(float f) {
        this.f11796x6 = f;
    }

    /* JADX INFO: renamed from: kk */
    public final void m17370kk(float f) {
        this.f11791jd = f;
    }

    /* JADX INFO: renamed from: to */
    public final void m17374to(int i) {
        this.f11797yj = i;
    }

    /* JADX INFO: renamed from: x1 */
    public final void m17376x1(float f) {
        this.f11792ks = f;
    }

    public C4320jd(C5656k4 c5656k4, float f) {
        this(new C4318fa(c5656k4), f);
    }

    /* JADX INFO: renamed from: k4 */
    public final void m17367k4(int i) {
        this.f11790h4 = i;
    }

    /* JADX INFO: renamed from: kk */
    public final void m17371kk(int i) {
        this.f11795up = i;
    }

    /* JADX INFO: renamed from: x1 */
    public final void m17377x1(int i) {
        this.f11794rv = i;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m17368k4(float[] fArr) {
        if (fArr == null) {
            throw new ArgumentNullException("value");
        }
        this.f11787ck = fArr;
        this.f11789fa = 5;
    }

    /* JADX INFO: renamed from: x1 */
    public final void m17378x1(float[] fArr) {
        if (fArr == null) {
            throw new ArgumentNullException("value");
        }
        this.f11788dy = fArr;
    }
}
