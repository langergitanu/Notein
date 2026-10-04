package com.aspose.slides.internal.p102e8;

import com.aspose.slides.internal.p243l6.C6005k4;
import com.aspose.slides.internal.p260ly.C6269ck;
import com.aspose.slides.internal.p260ly.C6275jd;
import com.aspose.slides.internal.p260ly.C6282rv;
import com.aspose.slides.internal.p260ly.C6290x6;
import com.aspose.slides.internal.p260ly.C6291yj;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.internal.p349q3.C9616ar;
import com.aspose.slides.internal.p488x0.C12331c5;
import com.aspose.slides.internal.p488x0.C12335fa;
import com.aspose.slides.internal.p500xi.C12535to;
import com.aspose.slides.p559ms.System.C14113y2;
import com.aspose.slides.p559ms.System.C14114y9;

/* JADX INFO: renamed from: com.aspose.slides.internal.e8.kk */
/* JADX INFO: loaded from: classes3.dex */
public class C3587kk {

    /* JADX INFO: renamed from: k4 */
    private final k4[] f9945k4;

    /* JADX INFO: renamed from: com.aspose.slides.internal.e8.kk$k4 */
    public static class k4 {

        /* JADX INFO: renamed from: k4 */
        private boolean f9946k4 = false;

        /* JADX INFO: renamed from: x1 */
        private C12535to f9947x1;

        public k4(C12535to c12535to) {
            this.f9947x1 = c12535to;
        }

        /* JADX INFO: renamed from: k4 */
        public final k4 m14600k4() {
            try {
                k4 k4Var = new k4(this.f9947x1.m58362du());
                k4Var.m14601k4(m14603x1());
                return k4Var;
            } catch (CloneNotSupportedException e) {
                C6005k4.m24263kk(e.getMessage());
                return null;
            }
        }

        /* JADX INFO: renamed from: kk */
        public final C12535to m14602kk() {
            return this.f9947x1;
        }

        /* JADX INFO: renamed from: x1 */
        public final boolean m14603x1() {
            return this.f9946k4;
        }

        /* JADX INFO: renamed from: k4 */
        public final void m14601k4(boolean z) {
            this.f9946k4 = z;
        }
    }

    public C3587kk(int i) {
        this.f9945k4 = new k4[i + 1];
    }

    /* JADX INFO: renamed from: x1 */
    private void m14593x1(long j) {
        k4 k4Var;
        long j2 = 4294967295L & j;
        if (j2 != 0) {
            k4[] k4VarArr = this.f9945k4;
            if (j2 >= k4VarArr.length || (k4Var = k4VarArr[(int) j]) == null) {
                return;
            }
            k4Var.m14601k4(false);
        }
    }

    /* JADX INFO: renamed from: k4 */
    public final C3587kk m14594k4() {
        k4[] k4VarArr = new k4[this.f9945k4.length];
        int i = 0;
        while (true) {
            k4[] k4VarArr2 = this.f9945k4;
            if (i >= k4VarArr2.length) {
                return new C3587kk(k4VarArr);
            }
            k4 k4Var = k4VarArr2[i];
            if (k4Var != null) {
                k4VarArr[i] = k4Var.m14600k4();
            }
            i++;
        }
    }

    /* JADX INFO: renamed from: kk */
    public final void m14598kk(long j, C3585h4 c3585h4) {
        long j2 = 4294967295L & j;
        k4[] k4VarArr = this.f9945k4;
        if (j2 >= k4VarArr.length || j2 <= 0) {
            C6005k4.m24263kk(C14113y2.m67408k4("Invalid object index >= object table size. Index=", C14114y9.m67465x1(j)));
            return;
        }
        int i = (int) j;
        k4 k4Var = k4VarArr[i];
        if (k4Var != null && k4Var.m14603x1()) {
            if (j == c3585h4.m14496h4()) {
                c3585h4.m14550to(0L);
            } else if (j == c3585h4.m14485du()) {
                c3585h4.m14528kk(0L);
            } else if (j == c3585h4.m14537m9()) {
                c3585h4.m14487du(0L);
            } else if (j == c3585h4.m14525kk()) {
                c3585h4.m14505k4(0L);
            } else if (j == c3585h4.m14548to()) {
                c3585h4.m14568x1(0L);
            }
        }
        this.f9945k4[i] = null;
    }

    private C3587kk(k4[] k4VarArr) {
        this.f9945k4 = k4VarArr;
    }

    /* JADX INFO: renamed from: k4 */
    public final C12535to m14595k4(long j) {
        k4 k4Var;
        long j2 = 4294967295L & j;
        k4[] k4VarArr = this.f9945k4;
        if (j2 >= k4VarArr.length || (k4Var = k4VarArr[(int) j]) == null) {
            return null;
        }
        return k4Var.m14602kk();
    }

    /* JADX INFO: renamed from: x1 */
    public final void m14599x1(long j, C3585h4 c3585h4) {
        switch ((int) j) {
            case Integer.MIN_VALUE:
            case -2147483647:
            case -2147483646:
            case -2147483645:
            case -2147483644:
            case -2147483643:
                m14593x1(c3585h4.m14485du());
                c3585h4.m14528kk(j & 4294967295L);
                break;
            case -2147483642:
            case -2147483641:
            case -2147483640:
                m14593x1(c3585h4.m14496h4());
                c3585h4.m14550to(j & 4294967295L);
                break;
            case -2147483638:
            case -2147483637:
            case -2147483636:
            case -2147483635:
            case -2147483634:
            case -2147483632:
            case -2147483631:
                m14593x1(c3585h4.m14537m9());
                c3585h4.m14487du(j & 4294967295L);
                break;
            case -2147483633:
                m14593x1(c3585h4.m14525kk());
                c3585h4.m14505k4(j & 4294967295L);
                break;
        }
    }

    /* JADX INFO: renamed from: k4 */
    public final void m14596k4(long j, C3585h4 c3585h4) {
        int i;
        k4 k4Var;
        long j2 = 4294967295L & j;
        k4[] k4VarArr = this.f9945k4;
        if (j2 >= k4VarArr.length || j2 <= 0 || (k4Var = k4VarArr[(i = (int) j)]) == null) {
            C6005k4.m24263kk(C14113y2.m67408k4("Invalid object index >= object table size. Index=", C14114y9.m67465x1(j)));
            return;
        }
        k4Var.m14601k4(true);
        C12535to c12535toM14602kk = this.f9945k4[i].m14602kk();
        if (C7019kk.m27469x1(c12535toM14602kk, C6275jd.class) || C7019kk.m27469x1(c12535toM14602kk, C12331c5.class)) {
            m14593x1(c3585h4.m14485du());
            c3585h4.m14528kk(j);
            return;
        }
        if (C7019kk.m27469x1(c12535toM14602kk, C12335fa.class) || C7019kk.m27469x1(c12535toM14602kk, C9616ar.class)) {
            m14593x1(c3585h4.m14548to());
            c3585h4.m14568x1(j);
            return;
        }
        if (C7019kk.m27469x1(c12535toM14602kk, C6291yj.class)) {
            m14593x1(c3585h4.m14525kk());
            c3585h4.m14505k4(j);
        } else if (C7019kk.m27469x1(c12535toM14602kk, C6282rv.class) || C7019kk.m27469x1(c12535toM14602kk, C6290x6.class)) {
            m14593x1(c3585h4.m14496h4());
            c3585h4.m14550to(j);
        } else if (C7019kk.m27469x1(c12535toM14602kk, C6269ck.class)) {
            m14593x1(c3585h4.m14537m9());
            c3585h4.m14487du(j);
        }
    }

    /* JADX INFO: renamed from: k4 */
    public final void m14597k4(long j, C12535to c12535to) {
        long j2 = 4294967295L & j;
        k4[] k4VarArr = this.f9945k4;
        if (j2 < k4VarArr.length) {
            k4VarArr[(int) j] = new k4(c12535to);
        } else {
            C6005k4.m24263kk(C14113y2.m67408k4("Invalid object index >= object table size. Index=", C14114y9.m67465x1(j)));
        }
    }
}
