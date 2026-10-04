package com.aspose.slides.internal.p060ca;

import com.aspose.slides.internal.p314oc.C7019kk;

/* JADX INFO: renamed from: com.aspose.slides.internal.ca.ak */
/* JADX INFO: loaded from: classes3.dex */
class C1999ak {

    /* JADX INFO: renamed from: k4 */
    private C2165kp f6974k4;

    /* JADX INFO: renamed from: x1 */
    private C2286s7 f6975x1;

    public C1999ak(C2286s7 c2286s7, C2165kp c2165kp) {
        this.f6974k4 = c2165kp;
        this.f6975x1 = c2286s7;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m10152k4(C2356wy c2356wy) {
        int iM11210kk = this.f6975x1.m11382k4().m11740m9().m11210kk();
        c2356wy.m11625k4(new int[iM11210kk]);
        if (this.f6975x1.m11385kk().m10584k4().f7942u4 > 2) {
            this.f6974k4.m10961k4(this.f6975x1.m11385kk().m10584k4().f7942u4);
            byte bM10962kk = this.f6974k4.m10962kk();
            if (bM10962kk == 0) {
                for (int i = 1; i < iM11210kk; i++) {
                    c2356wy.m11626k4()[i] = this.f6974k4.m10963to();
                }
            } else if (bM10962kk == 1 || bM10962kk == 2) {
                int i2 = 1;
                while (i2 < iM11210kk) {
                    int iM10957du = this.f6974k4.m10957du();
                    int iM27462to = C7019kk.m27462to(Byte.valueOf(bM10962kk), 6) == 1 ? C7019kk.m27462to(Byte.valueOf(this.f6974k4.m10962kk()), 6) : C7019kk.m27462to(Integer.valueOf(this.f6974k4.m10957du()), 8);
                    int i3 = 0;
                    while (i2 < iM11210kk && i3 <= iM27462to) {
                        c2356wy.m11626k4()[i2] = iM10957du;
                        i3++;
                        i2++;
                        iM10957du++;
                    }
                }
            }
        } else {
            int i4 = (int) this.f6975x1.m11385kk().m10584k4().f7942u4;
            if (i4 == 0) {
                for (int i5 = 0; i5 < iM11210kk; i5++) {
                    c2356wy.m11626k4()[i5] = C2017bs.f7016k4.m10275kk().m10443k4((byte) i5);
                }
            } else if (i4 == 1) {
                for (int i6 = 0; i6 < iM11210kk; i6++) {
                    c2356wy.m11626k4()[i6] = C2017bs.f7016k4.m10274k4().m10443k4((byte) i6);
                }
            } else if (i4 == 2) {
                for (int i7 = 0; i7 < iM11210kk; i7++) {
                    c2356wy.m11626k4()[i7] = C2017bs.f7016k4.m10277x1().m10443k4((byte) i7);
                }
            }
        }
        int i8 = 0;
        for (int i9 = 0; i9 < iM11210kk; i9++) {
            if (C7019kk.m27457kk(Integer.valueOf(c2356wy.m11626k4()[i9]), 8) > C7019kk.m27457kk(Integer.valueOf(i8), 8)) {
                i8 = c2356wy.m11626k4()[i9];
            }
        }
        int i10 = i8 + 1;
        c2356wy.m11627x1(new int[C7019kk.m27457kk(Integer.valueOf(i10), 8)]);
        for (int i11 = 0; i11 < C7019kk.m27457kk(Integer.valueOf(i10), 8); i11++) {
            c2356wy.m11628x1()[i11] = 0;
        }
        for (int i12 = 0; i12 < iM11210kk; i12++) {
            c2356wy.m11628x1()[C7019kk.m27462to(Integer.valueOf(c2356wy.m11626k4()[i12]), 8)] = C7019kk.m27457kk(Integer.valueOf(i12), 9);
        }
    }
}
