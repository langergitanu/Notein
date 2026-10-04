package com.aspose.slides.internal.p427tt;

import com.aspose.slides.Collections.Generic.Dictionary;
import com.aspose.slides.internal.p244l7.C6012x1;
import com.aspose.slides.internal.p353q7.AbstractC9769fa;
import com.aspose.slides.internal.p353q7.C9762c6;
import com.aspose.slides.internal.p353q7.C9763ck;
import com.aspose.slides.internal.p353q7.C9773ix;
import com.aspose.slides.internal.p353q7.C9775k4;
import com.aspose.slides.internal.p353q7.C9790ts;
import com.aspose.slides.internal.p488x0.C12353x6;

/* JADX INFO: renamed from: com.aspose.slides.internal.tt.k4 */
/* JADX INFO: loaded from: classes4.dex */
public class C11110k4 {

    /* JADX INFO: renamed from: k4 */
    private static Dictionary<String, Integer> f38439k4;

    /* JADX INFO: renamed from: com.aspose.slides.internal.tt.k4$k4 */
    public static class k4 {

        /* JADX INFO: renamed from: k4 */
        private C9773ix f38440k4;

        /* JADX INFO: renamed from: x1 */
        private int f38441x1;

        public k4() {
            m53644k4((C9773ix) null);
            m53643k4(Integer.MAX_VALUE);
        }

        /* JADX INFO: renamed from: k4 */
        public final C9773ix m53642k4() {
            return this.f38440k4;
        }

        /* JADX INFO: renamed from: x1 */
        public final int m53645x1() {
            return this.f38441x1;
        }

        /* JADX INFO: renamed from: k4 */
        public final void m53643k4(int i) {
            this.f38441x1 = i;
        }

        /* JADX INFO: renamed from: k4 */
        public final void m53644k4(C9773ix c9773ix) {
            this.f38440k4 = c9773ix;
        }
    }

    static {
        Dictionary<String, Integer> dictionary = new Dictionary<>();
        f38439k4 = dictionary;
        dictionary.addItem("Arial", 10);
        f38439k4.addItem("Times New Roman", 20);
        f38439k4.addItem("Cambria Math", 30);
        f38439k4.addItem("MS Gothic", 40);
        f38439k4.addItem("Gulim", 50);
        f38439k4.addItem("Arial Unicode", 60);
        f38439k4.addItem("SimSun", 70);
        f38439k4.addItem("Segoe UI Symbol", 80);
        f38439k4.addItem("DejaVu Sans", 90);
        f38439k4.addItem("Liberation Serif", 100);
        f38439k4.addItem("FreeSans", 110);
        f38439k4.addItem("Arial Unicode MS", 120);
        f38439k4.addItem("Apple SD Gothic Neo", 130);
        f38439k4.addItem("Rockwell", 140);
    }

    /* JADX INFO: renamed from: k4 */
    public static C9790ts m53640k4(C9763ck c9763ck, C6012x1.k4 k4Var) {
        return m53641k4(C9762c6.m48021k4(), k4Var, m53641k4(C9775k4.m48094x1(), k4Var, null, null), f38439k4);
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x010b  */
    /* JADX INFO: renamed from: k4 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static C9790ts m53641k4(AbstractC9769fa abstractC9769fa, C6012x1.k4 k4Var, C9790ts c9790ts, Dictionary<String, Integer> dictionary) {
        C9790ts c9790tsMo48029x1;
        C9790ts c9790tsMo48029x12;
        boolean z;
        int iM53660kk = C11113x1.m53660kk(k4Var);
        C12353x6 c12353x6 = new C12353x6(k4Var.f17019up);
        byte bM57888kk = c12353x6.m57888kk();
        C9773ix[] c9773ixArrMo48027kk = abstractC9769fa.mo48027kk();
        k4 k4Var2 = new k4();
        int length = c9773ixArrMo48027kk.length;
        C9773ix c9773ix = null;
        C9773ix c9773ix2 = null;
        int i = 0;
        while (i < length) {
            C9773ix c9773ix3 = c9773ixArrMo48027kk[i];
            byte[] bArrM48091x1 = c9773ix3.m48091x1();
            boolean z2 = (bArrM48091x1[3] & 255) == 9;
            byte b = bArrM48091x1[1];
            boolean z3 = (b & 255) == 11 || (b & 255) == 12 || (b & 255) == 13;
            boolean z4 = (z3 || (b & 255) == 1) ? false : true;
            byte bM57889x1 = c12353x6.m57889x1();
            C12353x6 c12353x62 = c12353x6;
            C9773ix[] c9773ixArr = c9773ixArrMo48027kk;
            if (bM57889x1 != 0) {
                if (bM57889x1 == 1 ? !(!z4 || (bM57888kk != 0 && (bM57888kk == 1 ? !z2 : bM57888kk != 2 || z2))) : !(bM57889x1 == 2 ? !z3 || (bM57888kk != 0 && (bM57888kk == 1 ? !z2 : bM57888kk != 2 || z2)) : bM57889x1 == 3 ? !z2 : bM57889x1 == 4 ? (bArrM48091x1[0] & 255) != 3 || (bM57888kk != 0 && (bM57888kk == 1 ? !z2 : bM57888kk != 2 || z2)) : bM57889x1 != 5 || (bArrM48091x1[0] & 255) != 4 || (bM57888kk != 0 && (bM57888kk == 1 ? !z2 : bM57888kk != 2 || z2)))) {
                    c9773ix2 = c9773ix3;
                }
                z = true;
            } else {
                z = true;
                if (bM57888kk == 0 || (bM57888kk == 1 ? z2 : !(bM57888kk != 2 || z2))) {
                    c9773ix2 = c9773ix3;
                }
            }
            if (c9773ix2 != null) {
                if (dictionary != null) {
                    Integer[] numArr = {0};
                    boolean z5 = (!f38439k4.tryGetValue(c9773ix2.m48090k4(), numArr) || numArr[0].intValue() >= k4Var2.m53645x1()) ? false : z;
                    int iIntValue = numArr[0].intValue();
                    if (z5) {
                        k4Var2.m53644k4(c9773ix2);
                        k4Var2.m53643k4(iIntValue);
                    } else if (c9773ix == null) {
                        c9773ix = c9773ix2;
                    }
                }
            }
            i++;
            c12353x6 = c12353x62;
            c9773ixArrMo48027kk = c9773ixArr;
        }
        return (k4Var2.m53642k4() == null || (c9790tsMo48029x12 = abstractC9769fa.mo48029x1(k4Var2.m53642k4().m48090k4(), iM53660kk)) == null) ? c9790ts != null ? c9790ts : (c9773ix == null || (c9790tsMo48029x1 = abstractC9769fa.mo48029x1(c9773ix.m48090k4(), iM53660kk)) == null) ? abstractC9769fa.mo48024k4(iM53660kk) : c9790tsMo48029x1 : c9790tsMo48029x12;
    }
}
