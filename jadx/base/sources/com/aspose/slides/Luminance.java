package com.aspose.slides;

import com.aspose.slides.internal.p077d8.C3085sv;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.p559ms.System.C14064he;
import com.aspose.slides.p559ms.System.C14067j2;
import com.aspose.slides.p559ms.System.C14113y2;
import com.aspose.words.ControlChar;

/* JADX INFO: loaded from: classes3.dex */
public final class Luminance extends ImageTransformOperation implements ILuminance, lft {

    /* JADX INFO: renamed from: kk */
    private float f2662kk;

    /* JADX INFO: renamed from: to */
    private oaz f2663to;

    /* JADX INFO: renamed from: x1 */
    private float f2664x1;

    public Luminance(float f, float f2, InterfaceC14397rj interfaceC14397rj) {
        super(interfaceC14397rj);
        this.f2664x1 = f;
        this.f2662kk = f2;
        m1750m9();
    }

    /* JADX INFO: renamed from: k4 */
    public static tc4 m1924k4(tc4 tc4Var, float f, float f2) {
        int iM27462to = C7019kk.m27462to(Float.valueOf((128.0f * f) / 100.0f), 13);
        int iM27462to2 = C7019kk.m27462to(Float.valueOf(f2), 13);
        int i = iM27462to2 * 128;
        int i2 = 100 - iM27462to2;
        int i3 = iM27462to2 + 100;
        long j = 0;
        while (true) {
            long j2 = j & 4294967295L;
            if (j2 >= tc4Var.m71087to().length) {
                return tc4Var;
            }
            int i4 = (int) ((2 + j2) & 4294967295L);
            int i5 = (tc4Var.m71087to()[i4] & 255) + iM27462to;
            int i6 = (int) ((1 + j2) & 4294967295L);
            int i7 = (tc4Var.m71087to()[i6] & 255) + iM27462to;
            int i8 = (int) j;
            int i9 = (tc4Var.m71087to()[i8] & 255) + iM27462to;
            if (f2 < 0.0f) {
                i5 = ((i5 * i3) - i) / 100;
                i7 = ((i7 * i3) - i) / 100;
                i9 = ((i9 * i3) - i) / 100;
            }
            if (f2 > 0.0f) {
                int i10 = (i5 * 100) - i;
                if (i2 != 0) {
                    i5 = i10 / i2;
                    i7 = ((i7 * 100) - i) / i2;
                    i9 = ((i9 * 100) - i) / i2;
                } else {
                    i5 = i10 * 256;
                    i7 = ((i7 * 100) - i) * 256;
                    i9 = ((i9 * 100) - i) * 256;
                }
            }
            int iM13072k4 = C3085sv.m13072k4(i5 + iM27462to, 0, 255);
            int iM13072k42 = C3085sv.m13072k4(i7 + iM27462to, 0, 255);
            int iM13072k43 = C3085sv.m13072k4(i9 + iM27462to, 0, 255);
            tc4Var.m71087to()[i4] = (byte) iM13072k4;
            tc4Var.m71087to()[i6] = (byte) iM13072k42;
            tc4Var.m71087to()[i8] = (byte) iM13072k43;
            j = (j2 + 4) & 4294967295L;
        }
    }

    /* JADX INFO: renamed from: du */
    public final float m1925du() {
        return this.f2662kk;
    }

    @Override // com.aspose.slides.PVIObject
    public boolean equals(Object obj) {
        Luminance luminance = (Luminance) C7019kk.m27452k4(obj, Luminance.class);
        if (luminance == null) {
            return false;
        }
        if (C14067j2.m66729x1(this, obj)) {
            return true;
        }
        return C3085sv.m13089k4(this.f2664x1, luminance.f2664x1) && C3085sv.m13089k4(this.f2662kk, luminance.f2662kk);
    }

    @Override // com.aspose.slides.PVIObject
    public int hashCode() {
        return super.hashCode();
    }

    /* JADX INFO: renamed from: to */
    public final float m1926to() {
        return this.f2664x1;
    }

    /* JADX INFO: renamed from: x1 */
    public final oaz m1927x1() {
        if (this.f2663to == null) {
            this.f2663to = new oaz(this);
        }
        return this.f2663to;
    }

    @Override // com.aspose.slides.IAccessiblePVIObject, com.aspose.slides.lft
    public final ILuminanceEffectiveData getEffective() {
        return m1927x1();
    }

    @Override // com.aspose.slides.ImageTransformOperation
    /* JADX INFO: renamed from: k4 */
    public tc4 mo234k4(tc4 tc4Var, IBaseSlide iBaseSlide) {
        return m1924k4(tc4Var, this.f2664x1, this.f2662kk);
    }

    @Override // com.aspose.slides.ImageTransformOperation
    /* JADX INFO: renamed from: k4 */
    public String mo236k4(IBaseSlide iBaseSlide, C14321pz c14321pz) {
        return C14113y2.m67407k4(super.mo236k4(iBaseSlide, c14321pz), C14064he.m66704h4(this.f2664x1), Character.valueOf(ControlChar.SPACE_CHAR), C14064he.m66704h4(this.f2662kk));
    }
}
