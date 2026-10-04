package com.aspose.slides.internal.p269m8;

import com.aspose.slides.C22201OooO0oO;
import com.aspose.slides.internal.p127fb.C3914k4;
import com.aspose.slides.internal.p129fe.C3983k4;
import com.aspose.slides.internal.p151gj.C4329x6;
import com.aspose.slides.internal.p172hu.AbstractC4682du;
import com.aspose.slides.internal.p172hu.AbstractC4683h4;
import com.aspose.slides.internal.p172hu.AbstractC4687to;
import com.aspose.slides.internal.p475wh.C12003du;
import com.aspose.slides.internal.p475wh.C12009k4;
import com.aspose.slides.internal.p475wh.C12014ne;
import com.aspose.slides.internal.p475wh.C12023wl;
import com.aspose.slides.p559ms.System.AbstractC14071k4;
import com.aspose.slides.p559ms.System.C14112xw;
import com.aspose.slides.p559ms.System.C14116yg;

/* JADX INFO: renamed from: com.aspose.slides.internal.m8.k4 */
/* JADX INFO: loaded from: classes4.dex */
public class C6328k4 {
    /* JADX INFO: renamed from: k4 */
    private static int m25896k4(int i, int i2, double d) {
        return C22201OooO0oO.OooO00o(d * ((double) (i2 - i)), i, 14);
    }

    /* JADX INFO: renamed from: k4 */
    public static C12003du m25897k4(C12003du c12003du, C12003du c12003du2, double d) {
        return C12003du.m56398k4(m25896k4(c12003du.m56501c5() & 255, c12003du2.m56501c5() & 255, d), m25896k4(c12003du.m56507jd() & 255, c12003du2.m56507jd() & 255, d), m25896k4(c12003du.m56502ck() & 255, c12003du2.m56502ck() & 255, d), m25896k4(c12003du.m56505fa() & 255, c12003du2.m56505fa() & 255, d));
    }

    /* JADX INFO: renamed from: k4 */
    private static C12014ne m25898k4(C12009k4 c12009k4) {
        return new C12014ne(0, 0, c12009k4.mo15760yj(), c12009k4.mo15757m9());
    }

    /* JADX INFO: renamed from: k4 */
    public static void m25899k4(C4329x6 c4329x6, C4329x6 c4329x62, C4329x6[] c4329x6Arr, C4329x6[] c4329x6Arr2, C4329x6[] c4329x6Arr3) {
        m25900k4(c4329x6.Clone(), c4329x6Arr, c4329x6Arr3);
        m25900k4(c4329x62.Clone(), c4329x6Arr2, c4329x6Arr3);
    }

    /* JADX INFO: renamed from: k4 */
    private static void m25900k4(C4329x6 c4329x6, C4329x6[] c4329x6Arr, C4329x6[] c4329x6Arr2) {
        C4329x6 c4329x6Clone = C4329x6.m17418k4(c4329x6Arr[0], c4329x6Arr2[0]).Clone();
        C4329x6.m17419k4(c4329x6Arr[0].Clone(), C4329x6.f11825k4.Clone(), C4329x6.m17422x1(c4329x6, C4329x6.f11826x1).Clone()).CloneTo(c4329x6Arr[0]);
        C4329x6.m17419k4(c4329x6Clone.Clone(), c4329x6Arr[0].Clone(), c4329x6.Clone()).CloneTo(c4329x6Clone);
        C4329x6.m17422x1(c4329x6Clone, c4329x6Arr[0]).CloneTo(c4329x6Arr2[0]);
    }

    /* JADX INFO: renamed from: k4 */
    public static void m25901k4(C12009k4 c12009k4, C12009k4 c12009k42, C4329x6 c4329x6, C4329x6 c4329x62, C4329x6 c4329x63, AbstractC4682du<Integer, Integer, Integer> abstractC4682du) {
        int i = c4329x63.f11827kk;
        int i2 = c4329x63.f11828to;
        C3983k4 c3983k4M56597k4 = c12009k4.m56597k4(new C12014ne(c4329x6.f11827kk, c4329x6.f11828to, i, i2), 3, 2498570);
        try {
            C3983k4 c3983k4M56597k42 = c12009k42.m56597k4(new C12014ne(c4329x62.f11827kk, c4329x62.f11828to, i, i2), 1, 2498570);
            try {
                C14112xw c14112xwM15721to = c3983k4M56597k4.m15721to();
                C14112xw c14112xwM15721to2 = c3983k4M56597k42.m15721to();
                int iM15722x1 = c3983k4M56597k4.m15722x1() * c3983k4M56597k4.m15716k4();
                int[] iArr = new int[iM15722x1];
                int i3 = 0;
                C3914k4.m15619k4(c14112xwM15721to, iArr, 0, iM15722x1);
                int iM15722x12 = c3983k4M56597k42.m15722x1() * c3983k4M56597k42.m15716k4();
                int[] iArr2 = new int[iM15722x12];
                C3914k4.m15619k4(c14112xwM15721to2, iArr2, 0, iM15722x12);
                int i4 = 0;
                int i5 = 0;
                int i6 = 0;
                while (i4 < i2) {
                    while (i3 < i) {
                        iArr[i5] = abstractC4682du.mo445k4(Integer.valueOf(iArr[i5]), Integer.valueOf(iArr2[i6])).intValue();
                        i5++;
                        i6++;
                        i3++;
                        i = i;
                        i2 = i2;
                    }
                    i4++;
                    i3 = 0;
                }
                int i7 = i3;
                C3914k4.m15622k4(iArr, i7, c14112xwM15721to, iM15722x1);
                C3914k4.m15622k4(iArr2, i7, c14112xwM15721to2, iM15722x12);
                c12009k42.m56605k4(c3983k4M56597k42);
            } catch (Throwable th) {
                c12009k42.m56605k4(c3983k4M56597k42);
                throw th;
            }
        } finally {
            c12009k4.m56605k4(c3983k4M56597k4);
        }
    }

    /* JADX INFO: renamed from: k4 */
    public static void m25902k4(C12009k4 c12009k4, C12009k4 c12009k42, C4329x6 c4329x6, C4329x6 c4329x62, C4329x6 c4329x63, AbstractC4683h4<C4329x6, Integer, Integer, Integer> abstractC4683h4) {
        int i = c4329x63.f11827kk;
        int i2 = c4329x63.f11828to;
        C3983k4 c3983k4M56597k4 = c12009k4.m56597k4(new C12014ne(c4329x6.f11827kk, c4329x6.f11828to, i, i2), 3, 2498570);
        try {
            C3983k4 c3983k4M56597k42 = c12009k42.m56597k4(new C12014ne(c4329x62.f11827kk, c4329x62.f11828to, i, i2), 1, 2498570);
            try {
                C14112xw c14112xwM15721to = c3983k4M56597k4.m15721to();
                C14112xw c14112xwM15721to2 = c3983k4M56597k42.m15721to();
                int iM15722x1 = c3983k4M56597k4.m15722x1() * c3983k4M56597k4.m15716k4();
                int[] iArr = new int[iM15722x1];
                int i3 = 0;
                C3914k4.m15619k4(c14112xwM15721to, iArr, 0, iM15722x1);
                int iM15722x12 = c3983k4M56597k42.m15722x1() * c3983k4M56597k42.m15716k4();
                int[] iArr2 = new int[iM15722x12];
                C3914k4.m15619k4(c14112xwM15721to2, iArr2, 0, iM15722x12);
                C4329x6 c4329x6Clone = C4329x6.f11825k4.Clone();
                int i4 = 0;
                int i5 = 0;
                while (c4329x6Clone.f11828to < i2) {
                    c4329x6Clone.f11827kk = i3;
                    while (c4329x6Clone.f11827kk < i) {
                        iArr[i4] = abstractC4683h4.mo3415k4(c4329x6Clone.Clone(), Integer.valueOf(iArr[i4]), Integer.valueOf(iArr2[i5])).intValue();
                        i4++;
                        i5++;
                        c4329x6Clone.f11827kk++;
                        i2 = i2;
                        i = i;
                    }
                    c4329x6Clone.f11828to++;
                    i2 = i2;
                    i = i;
                    i3 = 0;
                }
                int i6 = i3;
                C3914k4.m15622k4(iArr, i6, c14112xwM15721to, iM15722x1);
                C3914k4.m15622k4(iArr2, i6, c14112xwM15721to2, iM15722x12);
                c12009k42.m56605k4(c3983k4M56597k42);
            } catch (Throwable th) {
                c12009k42.m56605k4(c3983k4M56597k42);
                throw th;
            }
        } finally {
            c12009k4.m56605k4(c3983k4M56597k4);
        }
    }

    /* JADX INFO: renamed from: k4 */
    public static void m25903k4(C12009k4 c12009k4, C12009k4 c12009k42, AbstractC4682du<Integer, Integer, Integer> abstractC4682du) {
        C12014ne c12014ne = new C12014ne(0, 0, C14116yg.m67507x1(c12009k4.mo15760yj(), c12009k42.mo15760yj()), C14116yg.m67507x1(c12009k4.mo15757m9(), c12009k42.mo15757m9()));
        m25901k4(c12009k4, c12009k42, new C4329x6(c12014ne.m56665du().m56708k4(), c12014ne.m56665du().m56713x1()), new C4329x6(c12014ne.m56665du().m56708k4(), c12014ne.m56665du().m56713x1()), new C4329x6(c12014ne.m56680m9().m56865x1(), c12014ne.m56680m9().m56862kk()), abstractC4682du);
    }

    /* JADX INFO: renamed from: k4 */
    public static void m25904k4(C12009k4 c12009k4, C12014ne c12014ne, AbstractC4682du<C4329x6, Integer, Integer> abstractC4682du) {
        C4329x6 c4329x6 = new C4329x6(c12014ne.m56669jd(), c12014ne.m56664ck());
        C4329x6 c4329x62 = new C4329x6(c12014ne.m56663c5(), c12014ne.m56683x1());
        C4329x6[] c4329x6Arr = {c4329x6};
        C4329x6[] c4329x6Arr2 = {c4329x62};
        m25900k4(new C4329x6(c12009k4.mo15760yj(), c12009k4.mo15757m9()), c4329x6Arr, c4329x6Arr2);
        c4329x6Arr[0].CloneTo(c4329x6);
        c4329x6Arr2[0].CloneTo(c4329x62);
        C12014ne c12014ne2 = new C12014ne(c4329x6.f11827kk, c4329x6.f11828to, c4329x62.f11827kk, c4329x62.f11828to);
        int iM56663c5 = c12014ne2.m56663c5();
        int iM56683x1 = c12014ne2.m56683x1();
        C3983k4 c3983k4M56597k4 = c12009k4.m56597k4(c12014ne2.Clone(), 3, 2498570);
        try {
            C14112xw c14112xwM15721to = c3983k4M56597k4.m15721to();
            int iM15722x1 = c3983k4M56597k4.m15722x1() * c3983k4M56597k4.m15716k4();
            int[] iArr = new int[iM15722x1];
            C3914k4.m15619k4(c14112xwM15721to, iArr, 0, iM15722x1);
            C4329x6 c4329x6Clone = C4329x6.f11825k4.Clone();
            int i = 0;
            while (c4329x6Clone.f11828to < iM56683x1) {
                c4329x6Clone.f11827kk = 0;
                while (c4329x6Clone.f11827kk < iM56663c5) {
                    iArr[i] = abstractC4682du.mo445k4(c4329x6Clone.Clone(), Integer.valueOf(iArr[i])).intValue();
                    i++;
                    c4329x6Clone.f11827kk++;
                }
                c4329x6Clone.f11828to++;
            }
            C3914k4.m15622k4(iArr, 0, c14112xwM15721to, iM15722x1);
            c12009k4.m56605k4(c3983k4M56597k4);
        } catch (Throwable th) {
            c12009k4.m56605k4(c3983k4M56597k4);
            throw th;
        }
    }

    /* JADX INFO: renamed from: k4 */
    public static void m25905k4(C12009k4 c12009k4, C12014ne c12014ne, AbstractC4687to<Integer, Integer> abstractC4687to) {
        C4329x6 c4329x6 = new C4329x6(c12014ne.m56669jd(), c12014ne.m56664ck());
        C4329x6 c4329x62 = new C4329x6(c12014ne.m56663c5(), c12014ne.m56683x1());
        C4329x6[] c4329x6Arr = {c4329x6};
        C4329x6[] c4329x6Arr2 = {c4329x62};
        m25900k4(new C4329x6(c12009k4.mo15760yj(), c12009k4.mo15757m9()), c4329x6Arr, c4329x6Arr2);
        c4329x6Arr[0].CloneTo(c4329x6);
        c4329x6Arr2[0].CloneTo(c4329x62);
        C12014ne c12014ne2 = new C12014ne(c4329x6.f11827kk, c4329x6.f11828to, c4329x62.f11827kk, c4329x62.f11828to);
        int iM56663c5 = c12014ne2.m56663c5();
        int iM56683x1 = c12014ne2.m56683x1();
        C3983k4 c3983k4M56597k4 = c12009k4.m56597k4(c12014ne2.Clone(), 3, 2498570);
        try {
            C14112xw c14112xwM15721to = c3983k4M56597k4.m15721to();
            int iM15722x1 = c3983k4M56597k4.m15722x1() * c3983k4M56597k4.m15716k4();
            int[] iArr = new int[iM15722x1];
            C3914k4.m15619k4(c14112xwM15721to, iArr, 0, iM15722x1);
            int i = 0;
            for (int i2 = 0; i2 < iM56683x1; i2++) {
                for (int i3 = 0; i3 < iM56663c5; i3++) {
                    iArr[i] = abstractC4687to.invoke(Integer.valueOf(iArr[i])).intValue();
                    i++;
                }
            }
            C3914k4.m15622k4(iArr, 0, c14112xwM15721to, iM15722x1);
            c12009k4.m56605k4(c3983k4M56597k4);
        } catch (Throwable th) {
            c12009k4.m56605k4(c3983k4M56597k4);
            throw th;
        }
    }

    /* JADX INFO: renamed from: k4 */
    public static void m25906k4(C12009k4 c12009k4, AbstractC14071k4<Integer> abstractC14071k4) {
        C12023wl c12023wlClone = c12009k4.m56329fa().Clone();
        int iM56865x1 = c12023wlClone.m56865x1();
        int iM56862kk = c12023wlClone.m56862kk();
        C3983k4 c3983k4M56597k4 = c12009k4.m56597k4(m25898k4(c12009k4).Clone(), 1, 2498570);
        C14112xw c14112xwM15721to = c3983k4M56597k4.m15721to();
        int iM15716k4 = c3983k4M56597k4.m15716k4() * c3983k4M56597k4.m15722x1();
        int[] iArr = new int[iM15716k4];
        C3914k4.m15619k4(c14112xwM15721to, iArr, 0, iM15716k4);
        c12009k4.m56605k4(c3983k4M56597k4);
        int i = 0;
        for (int i2 = 0; i2 < iM56862kk; i2++) {
            for (int i3 = 0; i3 < iM56865x1; i3++) {
                abstractC14071k4.invoke(Integer.valueOf(iArr[i]));
                i++;
            }
        }
    }
}
