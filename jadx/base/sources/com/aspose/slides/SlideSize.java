package com.aspose.slides;

import com.aspose.slides.android.SizeF;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.internal.p475wh.C12015qq;
import com.aspose.slides.p559ms.System.C14064he;
import com.aspose.slides.p559ms.System.C14116yg;

/* JADX INFO: loaded from: classes3.dex */
public class SlideSize extends DomObject<Presentation> implements ISlideSize {

    /* JADX INFO: renamed from: to */
    static final long[] f3419to = {9144000, 6858000, 9144000, 6858000, 9906000, 6858000, 10287000, 6858000, 9144000, 6858000, 7315200, 914400, 0, 0, 12179300, 9134475, 12801600, 9601200, 10826750, 8120063, 7169150, 5376863, 10972800, 8229600, 7315200, 5486400, 4572000, 2971800, 9144000, 5143500, 9144000, 5715000, 12192000, 6858000};

    /* JADX INFO: renamed from: k4 */
    long f3420k4;

    /* JADX INFO: renamed from: kk */
    int f3421kk;

    /* JADX INFO: renamed from: x1 */
    long f3422x1;

    public SlideSize(Presentation presentation) {
        super(presentation);
        this.f3420k4 = -1L;
        this.f3422x1 = -1L;
        this.f3421kk = 6;
    }

    /* JADX INFO: renamed from: k4 */
    private static float m2753k4(float f, float f2, int i) {
        if (i == 2) {
            if (f > 1.0f && f2 > 1.0f) {
                return C14116yg.m67504x1(f, f2);
            }
            if (f > 1.0f || f2 > 1.0f) {
                return C14116yg.m67481k4(f, f2);
            }
        } else if (i == 1 && (f < 1.0f || f2 < 1.0f)) {
            return C14116yg.m67504x1(f, f2);
        }
        return 1.0f;
    }

    @Override // com.aspose.slides.ISlideSize
    public final int getOrientation() {
        return this.f3420k4 >= this.f3422x1 ? 0 : 1;
    }

    @Override // com.aspose.slides.ISlideSize
    public final SizeF getSize() {
        return (SizeF) C12015qq.m56690k4(m2755k4());
    }

    @Override // com.aspose.slides.ISlideSize
    public final int getType() {
        return this.f3421kk;
    }

    @Override // com.aspose.slides.ISlideSize
    public final void setOrientation(int i) {
        if ((this.f3420k4 < this.f3422x1) ^ (i == 1)) {
            C12015qq c12015qqM56694du = m2755k4().Clone();
            long j = this.f3420k4;
            this.f3420k4 = this.f3422x1;
            this.f3422x1 = j;
            m2754k4(c12015qqM56694du.Clone(), 1);
        }
    }

    @Override // com.aspose.slides.ISlideSize
    public final void setSize(float f, float f2, int i) {
        if (f < 1.0f || f2 < 1.0f) {
            throw new PptxEditException("Slide size dimensions should be positive.");
        }
        C12015qq c12015qqM56694du = m2755k4().Clone();
        if (C14064he.m66715kk(f) || C14064he.m66715kk(f2)) {
            this.f3422x1 = -1L;
            this.f3420k4 = -1L;
        } else {
            this.f3421kk = 6;
            this.f3420k4 = C7019kk.m27438h4(Double.valueOf(C14116yg.m67497to(((double) f) * 12700.0d)), 14);
            this.f3422x1 = C7019kk.m27438h4(Double.valueOf(C14116yg.m67497to(((double) f2) * 12700.0d)), 14);
        }
        m2754k4(c12015qqM56694du.Clone(), i);
    }

    /* JADX INFO: renamed from: k4 */
    public C12015qq m2755k4() {
        return this.f3420k4 < 0 ? new C12015qq(Float.NaN, Float.NaN) : new C12015qq((float) (this.f3420k4 / 12700.0d), (float) (this.f3422x1 / 12700.0d));
    }

    @Override // com.aspose.slides.ISlideSize
    public final void setSize(int i, int i2) {
        long j;
        C12015qq c12015qqM56694du = m2755k4().Clone();
        this.f3421kk = i;
        if (i != 6) {
            int i3 = i * 2;
            if (this.f3420k4 >= this.f3422x1) {
                long[] jArr = f3419to;
                this.f3420k4 = jArr[i3];
                j = jArr[i3 + 1];
            } else {
                long[] jArr2 = f3419to;
                this.f3420k4 = jArr2[i3 + 1];
                j = jArr2[i3];
            }
            this.f3422x1 = j;
        }
        m2754k4(c12015qqM56694du.Clone(), i2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: k4 */
    private void m2754k4(C12015qq c12015qq, int i) {
        if (this.f2127h4 != 0 && i != 0 && c12015qq.m56699x1() > 0.0f && c12015qq.m56697kk() > 0.0f) {
            C12015qq c12015qqM56694du = m2755k4().Clone();
            float fM56699x1 = c12015qqM56694du.m56699x1() / c12015qq.m56699x1();
            float fM56697kk = c12015qqM56694du.m56697kk() / c12015qq.m56697kk();
            if ((fM56699x1 == 1.0f && fM56697kk == 1.0f) || fM56699x1 == 0.0f || fM56697kk == 0.0f) {
                return;
            }
            float fM2753k4 = m2753k4(fM56699x1, fM56697kk, i);
            if (i == 2) {
                if (fM2753k4 > 1.0f) {
                    ((Presentation) this.f2127h4).m2359k4(fM56699x1, fM56697kk, fM2753k4);
                    return;
                } else {
                    ((Presentation) this.f2127h4).m2358k4(fM56699x1, fM56697kk);
                    return;
                }
            }
            if (i == 1) {
                if (fM2753k4 < 1.0f) {
                    ((Presentation) this.f2127h4).m2359k4(fM56699x1, fM56697kk, fM2753k4);
                } else {
                    ((Presentation) this.f2127h4).m2358k4(fM56699x1, fM56697kk);
                }
            }
        }
    }

    /* JADX INFO: renamed from: k4 */
    public final boolean m2756k4(int i) {
        long j;
        long j2;
        int i2 = i * 2;
        long j3 = this.f3420k4;
        long j4 = this.f3422x1;
        if (j3 >= j4) {
            long[] jArr = f3419to;
            j = jArr[i2];
            j2 = jArr[i2 + 1];
        } else {
            long[] jArr2 = f3419to;
            j = jArr2[i2 + 1];
            j2 = jArr2[i2];
        }
        return j3 == j && j4 == j2;
    }
}
