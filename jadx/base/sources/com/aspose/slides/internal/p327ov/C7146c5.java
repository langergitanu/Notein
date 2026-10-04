package com.aspose.slides.internal.p327ov;

import com.aspose.slides.internal.p044bq.C1839x1;
import com.aspose.slides.internal.p067cu.C2631kk;
import com.aspose.slides.internal.p067cu.C2633x1;
import com.aspose.slides.internal.p180ib.C4804dy;
import com.aspose.slides.internal.p327ov.InterfaceC7155to;
import com.aspose.slides.internal.p340pm.C9467to;
import com.aspose.slides.internal.p340pm.C9468x1;
import com.aspose.slides.internal.p475wh.C12025x6;

/* JADX INFO: renamed from: com.aspose.slides.internal.ov.c5 */
/* JADX INFO: loaded from: classes4.dex */
public class C7146c5 extends AbstractC7152k4<C7153kk> {

    /* JADX INFO: renamed from: to */
    private int f19268to;

    public C7146c5(C4804dy c4804dy, int i) {
        super(c4804dy);
        this.f19268to = i;
    }

    @Override // com.aspose.slides.internal.p327ov.AbstractC7152k4
    /* JADX INFO: renamed from: k4 */
    public C7153kk mo27701k4() {
        C7153kk c7153kk = new C7153kk();
        c7153kk.f19297x1 = m27706x1();
        return c7153kk;
    }

    /* JADX INFO: renamed from: kk */
    public float m27703kk() {
        if (this.f19268to != 20) {
            return 0.0f;
        }
        return m27706x1() / 2.0f;
    }

    @Override // com.aspose.slides.internal.p327ov.AbstractC7152k4
    /* JADX INFO: renamed from: to */
    public void mo27705to(C7153kk c7153kk) {
        float[] fArr = c7153kk.f19295m9;
        float f = fArr[0];
        float f2 = fArr[1];
        float f3 = fArr[2];
        float f4 = fArr[3];
        float f5 = fArr[4];
        float f6 = fArr[5];
        double dM46532kk = C9467to.m46532kk(c7153kk.f19294kk, c7153kk.f19296to, f5, f6);
        float fM27703kk = m27703kk();
        if (dM46532kk >= c7153kk.f19297x1 || Math.abs(fM27703kk) >= c7153kk.f19297x1) {
            float fM27731k4 = m27731k4(c7153kk.f19297x1, c7153kk.f19294kk, c7153kk.f19296to, c7153kk.f19289du, c7153kk.f19291h4, f, f2, f3, f4, f5, f6);
            C12025x6 c12025x6M46523k4 = C9467to.m46523k4(fM27731k4, c7153kk.f19289du, c7153kk.f19291h4, f, f2, f3, f4, f5, f6);
            C12025x6 c12025x6 = new C12025x6(c7153kk.f19294kk, c7153kk.f19296to);
            if (fM27703kk != 0.0f) {
                c12025x6 = C9467to.m46524k4(new C9468x1(c12025x6, c12025x6M46523k4), c12025x6, c12025x6M46523k4, fM27703kk);
            }
            c7153kk.f19287c5.m12025x1(C2633x1.m12029k4(c12025x6.m56897x1(), c12025x6.m56895kk()));
            c7153kk.f19287c5.m12025x1(C2633x1.m12032x1(c12025x6M46523k4.m56897x1(), c12025x6M46523k4.m56895kk()));
            float[] fArr2 = new float[8];
            C1839x1.m9614k4(fM27731k4, new float[]{c7153kk.f19289du, c7153kk.f19291h4, f, f2, f3, f4, f5, f6}, 0, new float[8], 0, fArr2, 0);
            float f7 = fArr2[2];
            float f8 = fArr2[3];
            float f9 = fArr2[4];
            float f10 = fArr2[5];
            float f11 = fArr2[6];
            float f12 = fArr2[7];
            c7153kk.f19287c5.m12025x1(C2633x1.m12031k4(f7, f8, f9, f10, f11, f12));
            float[] fArrM27482k4 = this.f19285kk.m27482k4(c7153kk.f19294kk, c7153kk.f19296to, c12025x6M46523k4.m56897x1(), c12025x6M46523k4.m56895kk());
            c7153kk.f19290dy = new C12025x6(fArrM27482k4[0], fArrM27482k4[1]);
            c7153kk.f19288ck = true;
            f5 = f11;
            f6 = f12;
        } else {
            float[] fArrM27482k42 = this.f19285kk.m27482k4(c7153kk.f19294kk, c7153kk.f19296to, f5, f6);
            c7153kk.f19290dy = new C12025x6(fArrM27482k42[0], fArrM27482k42[1]);
        }
        c7153kk.f19289du = f5;
        c7153kk.f19291h4 = f6;
    }

    /* JADX INFO: renamed from: x1 */
    public float m27706x1() {
        switch (this.f19268to) {
            case 17:
                return this.f19286x1.m56930ne() * 0.725f;
            case 18:
                return this.f19286x1.m56930ne();
            case 19:
                return this.f19286x1.m56930ne();
            case 20:
                return this.f19286x1.m56930ne() * ((float) Math.sqrt(3.0d));
            default:
                return 0.0f;
        }
    }

    @Override // com.aspose.slides.internal.p327ov.AbstractC7152k4, com.aspose.slides.internal.p327ov.InterfaceC7155to
    /* JADX INFO: renamed from: k4 */
    public /* bridge */ /* synthetic */ InterfaceC7155to.k4 mo27702k4(C2631kk c2631kk) {
        return super.mo27702k4(c2631kk);
    }

    @Override // com.aspose.slides.internal.p327ov.AbstractC7152k4
    /* JADX INFO: renamed from: kk */
    public void mo27704kk(C7153kk c7153kk) {
        float[] fArr = c7153kk.f19295m9;
        float f = fArr[0];
        float f2 = fArr[1];
        float f3 = fArr[2];
        float f4 = fArr[3];
        double dM46532kk = C9467to.m46532kk(c7153kk.f19294kk, c7153kk.f19296to, f3, f4);
        float fM27703kk = m27703kk();
        if (dM46532kk >= c7153kk.f19297x1 || Math.abs(fM27703kk) >= c7153kk.f19297x1) {
            float fM27730k4 = m27730k4(c7153kk.f19297x1, c7153kk.f19294kk, c7153kk.f19296to, c7153kk.f19289du, c7153kk.f19291h4, f, f2, f3, f4);
            C12025x6 c12025x6M46534x1 = C9467to.m46534x1(fM27730k4, c7153kk.f19289du, c7153kk.f19291h4, f, f2, f3, f4);
            C12025x6 c12025x6 = new C12025x6(c7153kk.f19294kk, c7153kk.f19296to);
            if (fM27703kk != 0.0f) {
                c12025x6 = C9467to.m46524k4(new C9468x1(c12025x6, c12025x6M46534x1), c12025x6, c12025x6M46534x1, fM27703kk);
            }
            c7153kk.f19287c5.m12025x1(C2633x1.m12029k4(c12025x6.m56897x1(), c12025x6.m56895kk()));
            c7153kk.f19287c5.m12025x1(C2633x1.m12032x1(c12025x6M46534x1.m56897x1(), c12025x6M46534x1.m56895kk()));
            float[] fArr2 = new float[8];
            C1839x1.m9614k4(fM27730k4, new float[]{c7153kk.f19289du, c7153kk.f19291h4, f, f2, f3, f4}, 0, new float[8], 0, fArr2, 0);
            float f5 = fArr2[2];
            float f6 = fArr2[3];
            f3 = fArr2[4];
            f4 = fArr2[5];
            c7153kk.f19287c5.m12025x1(C2633x1.m12030k4(f5, f6, f3, f4));
            float[] fArrM27482k4 = this.f19285kk.m27482k4(c7153kk.f19294kk, c7153kk.f19296to, c12025x6M46534x1.m56897x1(), c12025x6M46534x1.m56895kk());
            c7153kk.f19290dy = new C12025x6(fArrM27482k4[0], fArrM27482k4[1]);
            c7153kk.f19288ck = true;
        } else {
            float[] fArrM27482k42 = this.f19285kk.m27482k4(c7153kk.f19294kk, c7153kk.f19296to, f3, f4);
            c7153kk.f19290dy = new C12025x6(fArrM27482k42[0], fArrM27482k42[1]);
        }
        mo27734k4(c7153kk, f3, f4);
    }

    @Override // com.aspose.slides.internal.p327ov.AbstractC7152k4
    /* JADX INFO: renamed from: x1 */
    public void mo27707x1(C7153kk c7153kk) {
        C2631kk c2631kk;
        C2633x1 c2633x1M12032x1;
        float[] fArr = c7153kk.f19295m9;
        float f = fArr[0];
        float f2 = fArr[1];
        float f3 = c7153kk.f19289du;
        float f4 = c7153kk.f19291h4;
        double dM46532kk = C9467to.m46532kk(c7153kk.f19294kk, c7153kk.f19296to, f, f2);
        float fM27703kk = m27703kk();
        if (dM46532kk >= c7153kk.f19297x1 || Math.abs(fM27703kk) >= c7153kk.f19297x1) {
            C12025x6 c12025x6 = new C12025x6(c7153kk.f19294kk, c7153kk.f19296to);
            C12025x6 c12025x6M27732k4 = m27732k4(c7153kk.f19297x1, c7153kk.f19294kk, c7153kk.f19296to, f3, f4, f, f2);
            if (fM27703kk != 0.0f) {
                c12025x6 = C9467to.m46524k4(new C9468x1(c12025x6, c12025x6M27732k4), c12025x6, c12025x6M27732k4, fM27703kk);
            }
            if (c7153kk.f19294kk == f3 && c7153kk.f19296to == f4) {
                c2631kk = c7153kk.f19287c5;
                c2633x1M12032x1 = C2633x1.m12029k4(c12025x6.m56897x1(), c12025x6.m56895kk());
            } else {
                c7153kk.f19287c5.m12025x1(C2633x1.m12029k4(c12025x6.m56897x1(), c12025x6.m56895kk()));
                c2631kk = c7153kk.f19287c5;
                c2633x1M12032x1 = C2633x1.m12032x1(c12025x6M27732k4.m56897x1(), c12025x6M27732k4.m56895kk());
            }
            c2631kk.m12025x1(c2633x1M12032x1);
            c7153kk.f19287c5.m12025x1(C2633x1.m12032x1(f, f2));
            float[] fArrM27482k4 = this.f19285kk.m27482k4(c7153kk.f19294kk, c7153kk.f19296to, c12025x6M27732k4.m56897x1(), c12025x6M27732k4.m56895kk());
            c7153kk.f19290dy = new C12025x6(fArrM27482k4[0], fArrM27482k4[1]);
            c7153kk.f19288ck = true;
        } else {
            float[] fArrM27482k42 = this.f19285kk.m27482k4(c7153kk.f19294kk, c7153kk.f19296to, f, f2);
            c7153kk.f19290dy = new C12025x6(fArrM27482k42[0], fArrM27482k42[1]);
        }
        mo27734k4(c7153kk, f, f2);
    }
}
