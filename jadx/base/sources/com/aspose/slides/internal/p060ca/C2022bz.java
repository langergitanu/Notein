package com.aspose.slides.internal.p060ca;

import com.aspose.slides.internal.p314oc.C7019kk;

/* JADX INFO: renamed from: com.aspose.slides.internal.ca.bz */
/* JADX INFO: loaded from: classes3.dex */
class C2022bz {

    /* JADX INFO: renamed from: k4 */
    private C2165kp f7028k4;

    /* JADX INFO: renamed from: x1 */
    private C2286s7 f7029x1;

    public C2022bz(C2286s7 c2286s7, C2165kp c2165kp) {
        this.f7028k4 = c2165kp;
        this.f7029x1 = c2286s7;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m10285k4(C2378xw c2378xw) {
        int i;
        int iM11210kk = this.f7029x1.m11382k4().m11740m9().m11210kk();
        int i2 = 1;
        if (this.f7029x1.m11385kk().m10584k4().f7945uz <= 1) {
            int i3 = (int) this.f7029x1.m11385kk().m10584k4().f7945uz;
            if (i3 == 0) {
                for (int i4 = 0; i4 <= 255; i4++) {
                    c2378xw.f8227x1[i4] = C2017bs.f7016k4.m10273du().m10443k4((byte) i4);
                }
            } else if (i3 == 1) {
                for (int i5 = 0; i5 <= 255; i5++) {
                    c2378xw.f8227x1[i5] = C2017bs.f7016k4.m10276to().m10443k4((byte) i5);
                }
            }
            for (int i6 = 0; i6 <= 255; i6++) {
                if (C7019kk.m27457kk(Integer.valueOf(c2378xw.f8227x1[i6]), 8) != 0) {
                    int i7 = 1;
                    while (true) {
                        if (C7019kk.m27457kk(Integer.valueOf(i7), 8) >= iM11210kk) {
                            c2378xw.f8226k4[i6] = 0;
                            c2378xw.f8227x1[i6] = 0;
                            break;
                        } else {
                            if (C7019kk.m27457kk(Integer.valueOf(this.f7029x1.m11382k4().m11733c5().m11626k4()[C7019kk.m27462to(Integer.valueOf(i7), 8)]), 8) == C7019kk.m27457kk(Integer.valueOf(c2378xw.f8227x1[i6]), 8)) {
                                c2378xw.f8226k4[i6] = i7;
                                break;
                            }
                            i7++;
                        }
                    }
                }
            }
            return;
        }
        this.f7028k4.m10961k4(this.f7029x1.m11385kk().m10584k4().f7945uz);
        byte bM10962kk = this.f7028k4.m10962kk();
        byte bM27462to = (byte) (C7019kk.m27462to(Byte.valueOf(bM10962kk), 6) & 127);
        if (bM27462to != 0) {
            if (bM27462to == 1) {
                byte bM10962kk2 = this.f7028k4.m10962kk();
                int i8 = 1;
                int i9 = 0;
                while (i9 < C7019kk.m27462to(Byte.valueOf(bM10962kk2), 6)) {
                    byte bM10962kk3 = this.f7028k4.m10962kk();
                    byte bM10962kk4 = this.f7028k4.m10962kk();
                    int i10 = 0;
                    while (i10 < C7019kk.m27462to(Byte.valueOf(bM10962kk4), 6) + i2) {
                        c2378xw.f8226k4[C7019kk.m27462to(Byte.valueOf(bM10962kk3), 6) + i10] = i8;
                        c2378xw.f8227x1[C7019kk.m27462to(Byte.valueOf(bM10962kk3), 6) + i10] = this.f7029x1.m11382k4().m11733c5().m11626k4()[C7019kk.m27462to(Integer.valueOf(i8), 8)];
                        i8++;
                        i10++;
                        i2 = 1;
                    }
                    i9++;
                    i2 = 1;
                }
            }
            i = 0;
        } else {
            i = 0;
            byte bM10962kk5 = this.f7028k4.m10962kk();
            for (byte b = 1; C7019kk.m27462to(Byte.valueOf(b), 6) <= C7019kk.m27462to(Byte.valueOf(bM10962kk5), 6); b = (byte) (b + 1)) {
                byte bM10962kk6 = this.f7028k4.m10962kk();
                if (C7019kk.m27462to(Byte.valueOf(b), 6) < iM11210kk) {
                    c2378xw.f8226k4[C7019kk.m27462to(Byte.valueOf(bM10962kk6), 6)] = C7019kk.m27457kk(Byte.valueOf(b), 6);
                    c2378xw.f8227x1[C7019kk.m27462to(Byte.valueOf(bM10962kk6), 6)] = this.f7029x1.m11382k4().m11733c5().m11626k4()[C7019kk.m27462to(Byte.valueOf(b), 6)];
                }
            }
        }
        if ((C7019kk.m27462to(Byte.valueOf(bM10962kk), 6) & 128) != 0) {
            byte bM10962kk7 = this.f7028k4.m10962kk();
            for (int i11 = i; i11 < C7019kk.m27462to(Byte.valueOf(bM10962kk7), 6); i11++) {
                byte bM10962kk8 = this.f7028k4.m10962kk();
                int iM10963to = this.f7028k4.m10963to();
                c2378xw.f8227x1[C7019kk.m27462to(Byte.valueOf(bM10962kk8), 6)] = iM10963to;
                int i12 = i;
                while (true) {
                    if (C7019kk.m27457kk(Integer.valueOf(i12), 8) >= iM11210kk) {
                        break;
                    }
                    if (C7019kk.m27457kk(Integer.valueOf(this.f7029x1.m11382k4().m11733c5().m11626k4()[C7019kk.m27462to(Integer.valueOf(i12), 8)]), 8) == C7019kk.m27457kk(Integer.valueOf(iM10963to), 8)) {
                        c2378xw.f8226k4[C7019kk.m27462to(Byte.valueOf(bM10962kk8), 6)] = i12;
                        break;
                    }
                    i12++;
                }
            }
        }
    }
}
