package com.aspose.slides.internal.p159h0;

import com.google.common.primitives.UnsignedBytes;

/* JADX INFO: renamed from: com.aspose.slides.internal.h0.qw */
/* JADX INFO: loaded from: classes.dex */
final class C4462qw {

    /* JADX INFO: renamed from: du */
    private C4460qm f12254du;

    /* JADX INFO: renamed from: k4 */
    private C4444f9 f12255k4;

    /* JADX INFO: renamed from: kk */
    private C4488yj f12256kk;

    /* JADX INFO: renamed from: to */
    private C4488yj f12257to;

    /* JADX INFO: renamed from: x1 */
    private C4437ca f12258x1;

    public C4462qw(C4444f9 c4444f9) {
        this.f12255k4 = c4444f9;
        this.f12258x1 = c4444f9.m18182k4();
        this.f12256kk = c4444f9.m18187x1();
        m18294k4();
        c4444f9.m18183k4(this.f12254du);
    }

    /* JADX INFO: renamed from: k4 */
    private void m18294k4() {
        m18297k4(m18299x1().Clone().Clone());
    }

    /* JADX INFO: renamed from: kk */
    private void m18298kk() {
        int iM18116k4 = this.f12254du.m18292k4().m18116k4();
        for (int i = 0; i < iM18116k4; i++) {
            this.f12254du.m18292k4().m18125x1(i).m18304k4(true);
        }
    }

    /* JADX INFO: renamed from: x1 */
    private C4482wy m18299x1() {
        double dM18303k4 = this.f12258x1.m18125x1(0).m18303k4();
        double dM18303k42 = this.f12258x1.m18125x1(0).m18303k4();
        double dM18310x1 = this.f12258x1.m18125x1(0).m18310x1();
        double dM18310x12 = this.f12258x1.m18125x1(0).m18310x1();
        int iM18116k4 = this.f12258x1.m18116k4();
        double dM18310x13 = dM18310x12;
        double dM18303k43 = dM18303k4;
        double dM18303k44 = dM18303k42;
        double dM18310x14 = dM18310x1;
        for (int i = 1; i < iM18116k4; i++) {
            if (this.f12258x1.m18125x1(i).m18303k4() < dM18303k43) {
                dM18303k43 = this.f12258x1.m18125x1(i).m18303k4();
            }
            if (this.f12258x1.m18125x1(i).m18303k4() > dM18303k44) {
                dM18303k44 = this.f12258x1.m18125x1(i).m18303k4();
            }
            if (this.f12258x1.m18125x1(i).m18310x1() < dM18310x14) {
                dM18310x14 = this.f12258x1.m18125x1(i).m18310x1();
            }
            if (this.f12258x1.m18125x1(i).m18310x1() > dM18310x13) {
                dM18310x13 = this.f12258x1.m18125x1(i).m18310x1();
            }
        }
        return new C4482wy(dM18303k43, dM18310x14, dM18303k44, dM18310x13);
    }

    public C4462qw(C4444f9 c4444f9, C4431b3 c4431b3, byte[] bArr) {
        this.f12255k4 = c4444f9;
        this.f12258x1 = c4444f9.m18182k4();
        this.f12256kk = c4444f9.m18187x1();
        m18295k4(c4431b3);
        m18296k4(c4431b3, bArr);
        c4444f9.m18184k4(this.f12257to);
        c4444f9.m18183k4(this.f12254du);
    }

    /* JADX INFO: renamed from: k4 */
    private void m18295k4(C4431b3 c4431b3) {
        m18297k4(m18300x1(c4431b3).Clone().Clone());
    }

    /* JADX INFO: renamed from: x1 */
    private C4482wy m18300x1(C4431b3 c4431b3) {
        double dM18478k4 = c4431b3.m18070k4(0).m18478k4();
        double dM18478k42 = c4431b3.m18070k4(0).m18478k4();
        double dM18481x1 = c4431b3.m18070k4(0).m18481x1();
        double dM18481x12 = c4431b3.m18070k4(0).m18481x1();
        int iM18069k4 = c4431b3.m18069k4();
        double dM18478k43 = dM18478k4;
        double dM18478k44 = dM18478k42;
        double dM18481x13 = dM18481x1;
        double dM18481x14 = dM18481x12;
        for (int i = 1; i < iM18069k4; i++) {
            if (c4431b3.m18070k4(i).m18478k4() < dM18478k43) {
                dM18478k43 = c4431b3.m18070k4(i).m18478k4();
            }
            if (c4431b3.m18070k4(i).m18478k4() > dM18478k44) {
                dM18478k44 = c4431b3.m18070k4(i).m18478k4();
            }
            if (c4431b3.m18070k4(i).m18481x1() < dM18481x13) {
                dM18481x13 = c4431b3.m18070k4(i).m18481x1();
            }
            if (c4431b3.m18070k4(i).m18481x1() > dM18481x14) {
                dM18481x14 = c4431b3.m18070k4(i).m18481x1();
            }
        }
        return new C4482wy(dM18478k43, dM18481x13, dM18478k44, dM18481x14);
    }

    /* JADX INFO: renamed from: k4 */
    private void m18296k4(C4431b3 c4431b3, byte[] bArr) {
        int iM18069k4 = c4431b3.m18069k4();
        this.f12257to = new C4488yj(iM18069k4);
        C4463ri c4463ri = null;
        C4463ri c4463ri2 = null;
        for (int i = 0; i < iM18069k4; i++) {
            C4463ri c4463ri3 = new C4463ri(c4431b3.m18070k4(i).m18478k4(), c4431b3.m18070k4(i).m18481x1());
            if ((bArr[i] & 1) != 1) {
                this.f12258x1.m18121k4(c4463ri3);
                c4463ri = c4463ri3;
                c4463ri2 = c4463ri;
            }
            byte b = bArr[i];
            if ((b & UnsignedBytes.MAX_POWER_OF_TWO) == 128) {
                if (c4463ri3.m18306k4(c4463ri)) {
                    c4463ri3 = c4463ri2;
                } else {
                    this.f12258x1.m18121k4(c4463ri3);
                    this.f12257to.m18485k4(new C4474up(c4463ri2, c4463ri3));
                }
                if (c4463ri3.m18306k4(c4463ri)) {
                    c4463ri2 = c4463ri3;
                } else {
                    this.f12257to.m18485k4(new C4474up(c4463ri3, c4463ri));
                    c4463ri2 = c4463ri;
                }
            } else if ((b & 1) == 1 && !c4463ri3.m18306k4(c4463ri2)) {
                this.f12258x1.m18121k4(c4463ri3);
                this.f12257to.m18485k4(new C4474up(c4463ri2, c4463ri3));
                c4463ri2 = c4463ri3;
            }
        }
    }

    /* JADX INFO: renamed from: k4 */
    private void m18297k4(C4482wy c4482wy) {
        double dM18435k4 = c4482wy.m18435k4() - 50.0d;
        double dM18437kk = c4482wy.m18437kk() + 50.0d;
        double dM18439x1 = c4482wy.m18439x1() - 50.0d;
        double dM18438to = c4482wy.m18438to() + 50.0d;
        C4437ca c4437ca = this.f12258x1;
        C4463ri c4463ri = new C4463ri(dM18435k4, dM18439x1);
        c4437ca.m18121k4(c4463ri);
        C4437ca c4437ca2 = this.f12258x1;
        C4463ri c4463ri2 = new C4463ri(dM18437kk, dM18439x1);
        c4437ca2.m18121k4(c4463ri2);
        C4437ca c4437ca3 = this.f12258x1;
        C4463ri c4463ri3 = new C4463ri(dM18437kk, dM18438to);
        c4437ca3.m18121k4(c4463ri3);
        C4437ca c4437ca4 = this.f12258x1;
        C4463ri c4463ri4 = new C4463ri(dM18435k4, dM18438to);
        c4437ca4.m18121k4(c4463ri4);
        C4488yj c4488yj = this.f12256kk;
        C4474up c4474up = new C4474up(c4463ri, c4463ri2);
        c4488yj.m18485k4(c4474up);
        C4488yj c4488yj2 = this.f12256kk;
        C4474up c4474up2 = new C4474up(c4463ri2, c4463ri3);
        c4488yj2.m18485k4(c4474up2);
        C4488yj c4488yj3 = this.f12256kk;
        C4474up c4474up3 = new C4474up(c4463ri3, c4463ri4);
        c4488yj3.m18485k4(c4474up3);
        C4488yj c4488yj4 = this.f12256kk;
        C4474up c4474up4 = new C4474up(c4463ri4, c4463ri);
        c4488yj4.m18485k4(c4474up4);
        C4460qm c4460qm = new C4460qm();
        this.f12254du = c4460qm;
        c4460qm.m18292k4().m18121k4(c4463ri);
        this.f12254du.m18292k4().m18121k4(c4463ri2);
        this.f12254du.m18292k4().m18121k4(c4463ri3);
        this.f12254du.m18292k4().m18121k4(c4463ri4);
        this.f12254du.m18293x1().m18485k4(c4474up);
        this.f12254du.m18293x1().m18485k4(c4474up2);
        this.f12254du.m18293x1().m18485k4(c4474up3);
        this.f12254du.m18293x1().m18485k4(c4474up4);
        m18298kk();
    }
}
