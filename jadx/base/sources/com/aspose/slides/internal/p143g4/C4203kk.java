package com.aspose.slides.internal.p143g4;

import com.aspose.slides.internal.p019ac.C1338ck;
import com.aspose.slides.internal.p019ac.C1344jd;
import com.aspose.slides.internal.p019ac.C1351rv;
import com.aspose.slides.internal.p019ac.C1359x6;
import com.aspose.slides.internal.p019ac.C1360yj;
import com.aspose.slides.internal.p075d5.C3023to;
import com.aspose.slides.internal.p183ij.C4954ar;
import com.aspose.slides.internal.p243l6.C6005k4;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.internal.p498xe.C12502c5;
import com.aspose.slides.internal.p498xe.C12506fa;
import com.aspose.slides.p559ms.System.C14113y2;
import com.aspose.slides.p559ms.System.C14114y9;

/* JADX INFO: renamed from: com.aspose.slides.internal.g4.kk */
/* JADX INFO: loaded from: classes.dex */
public class C4203kk {

    /* JADX INFO: renamed from: k4 */
    private k4[] f11431k4;

    /* JADX INFO: renamed from: com.aspose.slides.internal.g4.kk$k4 */
    public static class k4 {

        /* JADX INFO: renamed from: k4 */
        private boolean f11432k4 = false;

        /* JADX INFO: renamed from: x1 */
        private C3023to f11433x1;

        public k4(C3023to c3023to) {
            this.f11433x1 = c3023to;
        }

        /* JADX INFO: renamed from: k4 */
        public final void m16798k4(boolean z) {
            this.f11432k4 = z;
        }

        /* JADX INFO: renamed from: x1 */
        public final C3023to m16800x1() {
            return this.f11433x1;
        }

        /* JADX INFO: renamed from: k4 */
        public final boolean m16799k4() {
            return this.f11432k4;
        }
    }

    public C4203kk(int i) {
        this.f11431k4 = new k4[i + 1];
    }

    /* JADX INFO: renamed from: x1 */
    private void m16792x1(long j) {
        k4 k4Var;
        long j2 = 4294967295L & j;
        if (j2 != 0) {
            k4[] k4VarArr = this.f11431k4;
            if (j2 >= k4VarArr.length || (k4Var = k4VarArr[(int) j]) == null) {
                return;
            }
            k4Var.m16798k4(false);
        }
    }

    /* JADX INFO: renamed from: k4 */
    public final C3023to m16793k4(long j) {
        k4 k4Var;
        long j2 = 4294967295L & j;
        k4[] k4VarArr = this.f11431k4;
        if (j2 >= k4VarArr.length || (k4Var = k4VarArr[(int) j]) == null) {
            return null;
        }
        return k4Var.m16800x1();
    }

    /* JADX INFO: renamed from: kk */
    public final void m16796kk(long j, C4201h4 c4201h4) {
        long j2 = 4294967295L & j;
        k4[] k4VarArr = this.f11431k4;
        if (j2 >= k4VarArr.length || j2 <= 0) {
            C6005k4.m24263kk(C14113y2.m67408k4("Invalid object index >= object table size. Index=", C14114y9.m67465x1(j)));
            return;
        }
        int i = (int) j;
        k4 k4Var = k4VarArr[i];
        if (k4Var != null && k4Var.m16799k4()) {
            if (j == c4201h4.m16696h4()) {
                c4201h4.m16750to(0L);
            } else if (j == c4201h4.m16685du()) {
                c4201h4.m16727kk(0L);
            } else if (j == c4201h4.m16737m9()) {
                c4201h4.m16687du(0L);
            } else if (j == c4201h4.m16724kk()) {
                c4201h4.m16704k4(0L);
            } else if (j == c4201h4.m16748to()) {
                c4201h4.m16767x1(0L);
            }
        }
        this.f11431k4[i] = null;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m16794k4(long j, C3023to c3023to) {
        long j2 = 4294967295L & j;
        k4[] k4VarArr = this.f11431k4;
        if (j2 < k4VarArr.length) {
            k4VarArr[(int) j] = new k4(c3023to);
        } else {
            C6005k4.m24263kk(C14113y2.m67408k4("Invalid object index >= object table size. Index=", C14114y9.m67465x1(j)));
        }
    }

    /* JADX INFO: renamed from: x1 */
    public final void m16797x1(long j, C4201h4 c4201h4) {
        switch ((int) j) {
            case Integer.MIN_VALUE:
            case -2147483647:
            case -2147483646:
            case -2147483645:
            case -2147483644:
            case -2147483643:
                m16792x1(c4201h4.m16685du());
                c4201h4.m16727kk(j & 4294967295L);
                break;
            case -2147483642:
            case -2147483641:
            case -2147483640:
                m16792x1(c4201h4.m16696h4());
                c4201h4.m16750to(j & 4294967295L);
                break;
            case -2147483638:
            case -2147483637:
            case -2147483636:
            case -2147483635:
            case -2147483634:
            case -2147483632:
            case -2147483631:
                m16792x1(c4201h4.m16737m9());
                c4201h4.m16687du(j & 4294967295L);
                break;
            case -2147483633:
                m16792x1(c4201h4.m16724kk());
                c4201h4.m16704k4(j & 4294967295L);
                break;
        }
    }

    /* JADX INFO: renamed from: k4 */
    public final void m16795k4(long j, C4201h4 c4201h4) {
        long j2 = 4294967295L & j;
        k4[] k4VarArr = this.f11431k4;
        if (j2 >= k4VarArr.length || j2 <= 0) {
            C6005k4.m24263kk(C14113y2.m67408k4("Invalid object index >= object table size. Index=", C14114y9.m67465x1(j)));
            return;
        }
        int i = (int) j;
        k4VarArr[i].m16798k4(true);
        C3023to c3023toM16800x1 = this.f11431k4[i].m16800x1();
        if (C7019kk.m27469x1(c3023toM16800x1, C1344jd.class) || C7019kk.m27469x1(c3023toM16800x1, C12502c5.class)) {
            m16792x1(c4201h4.m16685du());
            c4201h4.m16727kk(j);
            return;
        }
        if (C7019kk.m27469x1(c3023toM16800x1, C12506fa.class) || C7019kk.m27469x1(c3023toM16800x1, C4954ar.class)) {
            m16792x1(c4201h4.m16748to());
            c4201h4.m16767x1(j);
            return;
        }
        if (C7019kk.m27469x1(c3023toM16800x1, C1360yj.class)) {
            m16792x1(c4201h4.m16724kk());
            c4201h4.m16704k4(j);
        } else if (C7019kk.m27469x1(c3023toM16800x1, C1351rv.class) || C7019kk.m27469x1(c3023toM16800x1, C1359x6.class)) {
            m16792x1(c4201h4.m16696h4());
            c4201h4.m16750to(j);
        } else if (C7019kk.m27469x1(c3023toM16800x1, C1338ck.class)) {
            m16792x1(c4201h4.m16737m9());
            c4201h4.m16687du(j);
        }
    }
}
