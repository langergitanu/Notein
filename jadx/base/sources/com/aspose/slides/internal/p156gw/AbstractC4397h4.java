package com.aspose.slides.internal.p156gw;

import OooO0O0.OooO0o;
import java.io.PrintStream;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Enumeration;
import java.util.Vector;

/* JADX INFO: renamed from: com.aspose.slides.internal.gw.h4 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC4397h4 {

    /* JADX INFO: renamed from: k4 */
    private boolean f12013k4;

    /* JADX INFO: renamed from: x1 */
    private static Comparator f12012x1 = new Comparator() { // from class: com.aspose.slides.internal.gw.h4.1
        @Override // java.util.Comparator
        public int compare(Object obj, Object obj2) {
            AbstractC4393ck abstractC4393ckM18003k4 = ((C4411up) obj).m18003k4();
            AbstractC4393ck abstractC4393ckM18003k42 = ((C4411up) obj2).m18003k4();
            double dMo17799du = abstractC4393ckM18003k4.mo17799du();
            double dMo17799du2 = abstractC4393ckM18003k42.mo17799du();
            if (dMo17799du == dMo17799du2) {
                dMo17799du = abstractC4393ckM18003k4.mo17811to();
                dMo17799du2 = abstractC4393ckM18003k42.mo17811to();
                if (dMo17799du == dMo17799du2) {
                    return 0;
                }
            }
            return dMo17799du < dMo17799du2 ? -1 : 1;
        }
    };

    /* JADX INFO: renamed from: kk */
    private static C4396fa[] f12010kk = new C4396fa[2];

    /* JADX INFO: renamed from: to */
    private static C4404m9[] f12011to = new C4404m9[2];

    /* JADX INFO: renamed from: com.aspose.slides.internal.gw.h4$du */
    public static class du extends AbstractC4397h4 {

        /* JADX INFO: renamed from: k4 */
        private int f12014k4;

        public du() {
            super();
        }

        @Override // com.aspose.slides.internal.p156gw.AbstractC4397h4
        /* JADX INFO: renamed from: k4 */
        public int mo17903k4(C4411up c4411up) {
            int i = this.f12014k4;
            int i2 = i == 0 ? 1 : 0;
            int iM17872k4 = c4411up.m18003k4().m17872k4() + i;
            this.f12014k4 = iM17872k4;
            if (iM17872k4 == 0) {
                return -1;
            }
            return i2;
        }

        @Override // com.aspose.slides.internal.p156gw.AbstractC4397h4
        /* JADX INFO: renamed from: x1 */
        public int mo17906x1() {
            return this.f12014k4 == 0 ? -1 : 1;
        }

        @Override // com.aspose.slides.internal.p156gw.AbstractC4397h4
        /* JADX INFO: renamed from: k4 */
        public void mo17905k4() {
            this.f12014k4 = 0;
        }
    }

    /* JADX INFO: renamed from: com.aspose.slides.internal.gw.h4$h4 */
    public static class h4 extends x1 {
        @Override // com.aspose.slides.internal.p156gw.AbstractC4397h4.x1
        /* JADX INFO: renamed from: k4 */
        public boolean mo17907k4(boolean z, boolean z2) {
            return z && !z2;
        }
    }

    /* JADX INFO: renamed from: com.aspose.slides.internal.gw.h4$k4 */
    public static class k4 extends x1 {
        @Override // com.aspose.slides.internal.p156gw.AbstractC4397h4.x1
        /* JADX INFO: renamed from: k4 */
        public boolean mo17907k4(boolean z, boolean z2) {
            return z || z2;
        }
    }

    /* JADX INFO: renamed from: com.aspose.slides.internal.gw.h4$kk */
    public static class kk extends AbstractC4397h4 {

        /* JADX INFO: renamed from: k4 */
        private boolean f12015k4;

        public kk() {
            super();
        }

        @Override // com.aspose.slides.internal.p156gw.AbstractC4397h4
        /* JADX INFO: renamed from: k4 */
        public int mo17903k4(C4411up c4411up) {
            boolean z = this.f12015k4;
            this.f12015k4 = !z;
            return !z ? 1 : -1;
        }

        @Override // com.aspose.slides.internal.p156gw.AbstractC4397h4
        /* JADX INFO: renamed from: x1 */
        public int mo17906x1() {
            return this.f12015k4 ? 1 : -1;
        }

        @Override // com.aspose.slides.internal.p156gw.AbstractC4397h4
        /* JADX INFO: renamed from: k4 */
        public void mo17905k4() {
            this.f12015k4 = false;
        }
    }

    /* JADX INFO: renamed from: com.aspose.slides.internal.gw.h4$m9 */
    public static class m9 extends x1 {
        @Override // com.aspose.slides.internal.p156gw.AbstractC4397h4.x1
        /* JADX INFO: renamed from: k4 */
        public boolean mo17907k4(boolean z, boolean z2) {
            return z != z2;
        }
    }

    /* JADX INFO: renamed from: com.aspose.slides.internal.gw.h4$to */
    public static class to extends x1 {
        @Override // com.aspose.slides.internal.p156gw.AbstractC4397h4.x1
        /* JADX INFO: renamed from: k4 */
        public boolean mo17907k4(boolean z, boolean z2) {
            return z && z2;
        }
    }

    /* JADX INFO: renamed from: com.aspose.slides.internal.gw.h4$x1 */
    public static abstract class x1 extends AbstractC4397h4 {

        /* JADX INFO: renamed from: k4 */
        boolean f12016k4;

        /* JADX INFO: renamed from: kk */
        boolean f12017kk;

        /* JADX INFO: renamed from: x1 */
        boolean f12018x1;

        public x1() {
            super();
        }

        @Override // com.aspose.slides.internal.p156gw.AbstractC4397h4
        /* JADX INFO: renamed from: k4 */
        public int mo17903k4(C4411up c4411up) {
            if (c4411up.m18007x1() == 0) {
                this.f12016k4 = !this.f12016k4;
            } else {
                this.f12018x1 = !this.f12018x1;
            }
            boolean zMo17907k4 = mo17907k4(this.f12016k4, this.f12018x1);
            if (this.f12017kk == zMo17907k4) {
                return 0;
            }
            this.f12017kk = zMo17907k4;
            return zMo17907k4 ? 1 : -1;
        }

        /* JADX INFO: renamed from: k4 */
        public abstract boolean mo17907k4(boolean z, boolean z2);

        @Override // com.aspose.slides.internal.p156gw.AbstractC4397h4
        /* JADX INFO: renamed from: x1 */
        public int mo17906x1() {
            return this.f12017kk ? 1 : -1;
        }

        @Override // com.aspose.slides.internal.p156gw.AbstractC4397h4
        /* JADX INFO: renamed from: k4 */
        public void mo17905k4() {
            this.f12016k4 = false;
            this.f12018x1 = false;
            this.f12017kk = false;
        }
    }

    private AbstractC4397h4() {
        this.f12013k4 = false;
    }

    /* JADX INFO: renamed from: k4 */
    private Vector m17898k4(Vector vector) {
        C4396fa c4396fa;
        Vector vector2;
        int i;
        int i2;
        C4411up[] c4411upArr;
        int i3;
        double d;
        double[] dArr;
        int i4;
        int iMo17903k4;
        double d2;
        double d3;
        int i5;
        int size = vector.size();
        if (size < 2) {
            return vector;
        }
        C4411up[] c4411upArr2 = (C4411up[]) vector.toArray(new C4411up[size]);
        Arrays.sort(c4411upArr2, f12012x1);
        int i6 = 0;
        if (this.f12013k4) {
            System.out.println("pruning: ");
            for (int i7 = 0; i7 < size; i7++) {
                PrintStream printStream = System.out;
                StringBuilder sbOooO0OO = OooO0o.OooO0OO(i7, "edgelist[", "] = ");
                sbOooO0OO.append(c4411upArr2[i7]);
                printStream.println(sbOooO0OO.toString());
            }
        }
        double[] dArr2 = new double[2];
        Vector vector3 = new Vector();
        Vector vector4 = new Vector();
        Vector vector5 = new Vector();
        int i8 = 0;
        int i9 = 0;
        while (i8 < size) {
            double dMo17799du = dArr2[i6];
            int i10 = i9 - 1;
            int i11 = i10;
            while (i10 >= i8) {
                C4411up c4411up = c4411upArr2[i10];
                if (c4411up.m18003k4().mo17803h4() > dMo17799du) {
                    if (i11 > i10) {
                        c4411upArr2[i11] = c4411up;
                    }
                    i11--;
                }
                i10--;
            }
            int i12 = i11 + 1;
            if (i12 >= i9) {
                if (i9 >= size) {
                    break;
                }
                dMo17799du = c4411upArr2[i9].m18003k4().mo17799du();
                if (dMo17799du > dArr2[i6]) {
                    m17902x1(vector3, vector4);
                }
                dArr2[i6] = dMo17799du;
            }
            while (i9 < size && c4411upArr2[i9].m18003k4().mo17799du() <= dMo17799du) {
                i9++;
            }
            dArr2[1] = c4411upArr2[i12].m18003k4().mo17803h4();
            if (i9 < size) {
                double dMo17799du2 = c4411upArr2[i9].m18003k4().mo17799du();
                if (dArr2[1] > dMo17799du2) {
                    dArr2[1] = dMo17799du2;
                }
            }
            if (this.f12013k4) {
                PrintStream printStream2 = System.out;
                i = 1;
                StringBuilder sb = new StringBuilder("current line: y = [");
                i2 = i6;
                vector2 = vector4;
                sb.append(dArr2[i2]);
                sb.append(", ");
                sb.append(dArr2[1]);
                sb.append("]");
                printStream2.println(sb.toString());
                for (int i13 = i12; i13 < i9; i13++) {
                    System.out.println("  " + c4411upArr2[i13]);
                }
            } else {
                vector2 = vector4;
                i = 1;
                i2 = i6;
            }
            int i14 = i;
            int i15 = i12;
            while (i15 < i9) {
                C4411up c4411up2 = c4411upArr2[i15];
                c4411up2.m18005k4(i2);
                int i16 = i15;
                while (true) {
                    if (i16 > i12) {
                        int i17 = i2;
                        C4411up c4411up3 = c4411upArr2[i16 - 1];
                        int iM18002k4 = c4411up2.m18002k4(c4411up3, dArr2);
                        if (dArr2[i] <= dArr2[i17]) {
                            throw new InternalError("backstepping to " + dArr2[i] + " from " + dArr2[0]);
                        }
                        if (iM18002k4 < 0) {
                            c4411upArr2[i16] = c4411up3;
                            i16--;
                            i2 = 0;
                        } else if (iM18002k4 == 0) {
                            int iM18006kk = c4411up3.m18006kk();
                            if (iM18006kk == 0) {
                                i5 = i14 + 1;
                                c4411up3.m18005k4(i14);
                            } else {
                                i5 = i14;
                                i14 = iM18006kk;
                            }
                            c4411up2.m18005k4(i14);
                            i14 = i5;
                        }
                    }
                }
                c4411upArr2[i16] = c4411up2;
                i15++;
                i2 = 0;
            }
            if (this.f12013k4) {
                PrintStream printStream3 = System.out;
                StringBuilder sb2 = new StringBuilder("current sorted line: y = [");
                c4411upArr = c4411upArr2;
                i3 = size;
                sb2.append(dArr2[0]);
                sb2.append(", ");
                sb2.append(dArr2[i]);
                sb2.append("]");
                printStream3.println(sb2.toString());
                for (int i18 = i12; i18 < i9; i18++) {
                    System.out.println("  " + c4411upArr[i18]);
                }
            } else {
                c4411upArr = c4411upArr2;
                i3 = size;
            }
            mo17905k4();
            double d4 = dArr2[0];
            double d5 = dArr2[i];
            int i19 = i12;
            while (i19 < i9) {
                C4411up c4411up4 = c4411upArr[i19];
                int iM18006kk2 = c4411up4.m18006kk();
                if (iM18006kk2 != 0) {
                    dArr = dArr2;
                    int iMo17906x1 = mo17906x1();
                    i4 = i12;
                    iMo17903k4 = iMo17906x1 == i ? -1 : 1;
                    double d6 = d5;
                    C4411up c4411up5 = null;
                    C4411up c4411up6 = c4411up4;
                    while (true) {
                        mo17903k4(c4411up4);
                        if (c4411up5 == null && c4411up4.m18008x1(d4, iMo17903k4)) {
                            c4411up5 = c4411up4;
                        }
                        double dMo17803h4 = c4411up4.m18003k4().mo17803h4();
                        if (dMo17803h4 > d6) {
                            c4411up6 = c4411up4;
                            d6 = dMo17803h4;
                        }
                        d = d4;
                        int i20 = i19 + 1;
                        if (i20 >= i9) {
                            break;
                        }
                        c4411up4 = c4411upArr[i20];
                        if (c4411up4.m18006kk() != iM18006kk2) {
                            break;
                        }
                        i19 = i20;
                        d4 = d;
                    }
                    if (mo17906x1() == iMo17906x1) {
                        iMo17903k4 = 0;
                    } else {
                        if (c4411up5 == null) {
                            c4411up5 = c4411up6;
                        }
                        c4411up4 = c4411up5;
                    }
                } else {
                    d = d4;
                    dArr = dArr2;
                    i4 = i12;
                    iMo17903k4 = mo17903k4(c4411up4);
                }
                if (iMo17903k4 != 0) {
                    c4411up4.m18004k4(d5, iMo17903k4);
                    d2 = d;
                    d3 = d5;
                    vector5.add(new C4396fa(c4411up4.m18003k4(), d2, d3, iMo17903k4));
                } else {
                    d2 = d;
                    d3 = d5;
                }
                i19++;
                i = 1;
                d4 = d2;
                d5 = d3;
                dArr2 = dArr;
                i12 = i4;
            }
            double[] dArr3 = dArr2;
            double d7 = d5;
            int i21 = i12;
            if (mo17906x1() != -1) {
                System.out.println("Still inside at end of active edge list!");
                System.out.println("num curves = " + (i9 - i21));
                System.out.println("num links = " + vector5.size());
                System.out.println("y top = " + dArr3[0]);
                System.out.println(i9 < i3 ? "y top of next curve = " + c4411upArr[i9].m18003k4().mo17799du() : "no more curves");
                for (int i22 = i21; i22 < i9; i22++) {
                    C4411up c4411up7 = c4411upArr[i22];
                    System.out.println(c4411up7);
                    int iM18006kk3 = c4411up7.m18006kk();
                    if (iM18006kk3 != 0) {
                        System.out.println("  was equal to " + iM18006kk3 + "...");
                    }
                }
            }
            if (this.f12013k4) {
                System.out.println("new links:");
                for (int i23 = 0; i23 < vector5.size(); i23++) {
                    System.out.println("  " + ((C4396fa) vector5.elementAt(i23)).m17890k4());
                }
            }
            Vector vector6 = vector2;
            m17900k4(vector3, vector6, vector5);
            vector5.clear();
            dArr3[0] = d7;
            vector4 = vector6;
            size = i3;
            i6 = 0;
            c4411upArr2 = c4411upArr;
            dArr2 = dArr3;
            i8 = i21;
        }
        m17902x1(vector3, vector4);
        Vector vector7 = new Vector();
        Enumeration enumerationElements = vector3.elements();
        while (enumerationElements.hasMoreElements()) {
            C4396fa c4396faM17888dy = (C4396fa) enumerationElements.nextElement();
            AbstractC4393ck abstractC4393ckM17896x1 = c4396faM17888dy.m17896x1();
            while (true) {
                vector7.add(abstractC4393ckM17896x1);
                c4396fa = c4396faM17888dy;
                do {
                    c4396faM17888dy = c4396faM17888dy.m17888dy();
                    if (c4396faM17888dy != null) {
                    }
                } while (c4396fa.m17892k4(c4396faM17888dy));
                abstractC4393ckM17896x1 = c4396fa.m17890k4();
            }
            vector7.add(c4396fa.m17890k4());
        }
        return vector7;
    }

    /* JADX INFO: renamed from: x1 */
    public static void m17902x1(Vector vector, Vector vector2) {
        int size = vector2.size();
        if (size == 0) {
            return;
        }
        if ((size & 1) != 0) {
            throw new InternalError("Odd number of chains!");
        }
        C4404m9[] c4404m9Arr = new C4404m9[size];
        vector2.toArray(c4404m9Arr);
        for (int i = 1; i < size; i += 2) {
            C4396fa c4396faM17965x1 = c4404m9Arr[i - 1].m17965x1(c4404m9Arr[i]);
            if (c4396faM17965x1 != null) {
                vector.add(c4396faM17965x1);
            }
        }
        vector2.clear();
    }

    /* JADX INFO: renamed from: k4 */
    public abstract int mo17903k4(C4411up c4411up);

    /* JADX INFO: renamed from: k4 */
    public abstract void mo17905k4();

    /* JADX INFO: renamed from: x1 */
    public abstract int mo17906x1();

    /* JADX INFO: renamed from: k4 */
    public Vector m17904k4(Vector vector, Vector vector2) {
        Vector vector3 = new Vector();
        m17899k4(vector3, (Vector<AbstractC4393ck>) vector, 0);
        m17899k4(vector3, (Vector<AbstractC4393ck>) vector2, 1);
        Vector vectorM17898k4 = m17898k4(vector3);
        if (this.f12013k4) {
            System.out.println("result: ");
            int size = vectorM17898k4.size();
            AbstractC4393ck[] abstractC4393ckArr = (AbstractC4393ck[]) vectorM17898k4.toArray(new AbstractC4393ck[size]);
            for (int i = 0; i < size; i++) {
                PrintStream printStream = System.out;
                StringBuilder sbOooO0OO = OooO0o.OooO0OO(i, "curvelist[", "] = ");
                sbOooO0OO.append(abstractC4393ckArr[i]);
                printStream.println(sbOooO0OO.toString());
            }
        }
        return vectorM17898k4;
    }

    /* JADX INFO: renamed from: k4 */
    private static void m17899k4(Vector vector, Vector<AbstractC4393ck> vector2, int i) {
        for (AbstractC4393ck abstractC4393ck : vector2) {
            if (abstractC4393ck.mo17809kk() > 0) {
                vector.add(new C4411up(abstractC4393ck, i));
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:59:0x00b8  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00bb A[PHI: r12 r13
      0x00bb: PHI (r12v2 boolean) = (r12v1 boolean), (r12v1 boolean), (r12v6 boolean), (r12v6 boolean) binds: [B:28:0x0059, B:29:0x005b, B:42:0x0083, B:43:0x0085] A[DONT_GENERATE, DONT_INLINE]
      0x00bb: PHI (r13v2 boolean) = (r13v1 boolean), (r13v1 boolean), (r13v6 boolean), (r13v6 boolean) binds: [B:28:0x0059, B:29:0x005b, B:42:0x0083, B:43:0x0085] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX INFO: renamed from: k4 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void m17900k4(Vector vector, Vector vector2, Vector vector3) {
        C4396fa[] c4396faArr;
        C4404m9[] c4404m9Arr;
        C4404m9 c4404m9;
        int size = vector3.size();
        if (size == 0) {
            c4396faArr = f12010kk;
        } else {
            if ((size & 1) != 0) {
                throw new InternalError("Odd number of new curves!");
            }
            c4396faArr = new C4396fa[size + 2];
            vector3.toArray(c4396faArr);
        }
        int size2 = vector2.size();
        if (size2 == 0) {
            c4404m9Arr = f12011to;
        } else {
            if ((size2 & 1) != 0) {
                throw new InternalError("Odd number of chains!");
            }
            c4404m9Arr = new C4404m9[size2 + 2];
            vector2.toArray(c4404m9Arr);
        }
        vector2.clear();
        boolean z = false;
        C4404m9 c4404m92 = c4404m9Arr[0];
        C4404m9 c4404m93 = c4404m9Arr[1];
        C4396fa c4396fa = c4396faArr[0];
        C4396fa c4396fa2 = c4396faArr[1];
        int i = 0;
        int i2 = 0;
        while (true) {
            if (c4404m92 == null && c4396fa == null) {
                break;
            }
            boolean z2 = c4396fa == null ? true : z;
            boolean z3 = c4404m92 == null ? true : z;
            if (z2 || z3) {
                c4404m9 = c4404m92;
            } else {
                z2 = ((i & 1) == 0 && c4404m92.m17962k4() == c4404m93.m17962k4()) ? true : z;
                z3 = ((i2 & 1) == 0 && c4396fa.m17889h4() == c4396fa2.m17889h4()) ? true : z;
                if (!z2 && !z3) {
                    double dM17962k4 = c4404m92.m17962k4();
                    double dM17889h4 = c4396fa.m17889h4();
                    if (c4404m93 == null || dM17962k4 >= dM17889h4) {
                        c4404m9 = c4404m92;
                    } else {
                        c4404m9 = c4404m92;
                        boolean z4 = m17901k4(c4404m93.m17962k4(), dM17889h4, i);
                        z3 = c4396fa2 == null && dM17889h4 < dM17962k4 && m17901k4(c4396fa2.m17889h4(), dM17962k4, i2);
                        z2 = z4;
                    }
                    if (c4396fa2 == null) {
                        z2 = z4;
                    }
                }
            }
            if (z2) {
                C4396fa c4396faM17965x1 = c4404m9.m17965x1(c4404m93);
                if (c4396faM17965x1 != null) {
                    vector.add(c4396faM17965x1);
                }
                int i3 = i + 2;
                c4404m92 = c4404m9Arr[i3];
                c4404m93 = c4404m9Arr[i + 3];
                i = i3;
            } else {
                c4404m92 = c4404m9;
            }
            if (z3) {
                C4404m9 c4404m94 = new C4404m9(c4396fa, null);
                C4404m9 c4404m95 = new C4404m9(c4396fa2, c4404m94);
                c4404m94.m17964k4(c4404m95);
                vector2.add(c4404m94);
                vector2.add(c4404m95);
                int i4 = i2 + 2;
                c4396fa = c4396faArr[i4];
                c4396fa2 = c4396faArr[i2 + 3];
                i2 = i4;
            }
            if (!z2 && !z3) {
                c4404m92.m17963k4(c4396fa);
                vector2.add(c4404m92);
                int i5 = i + 1;
                C4404m9 c4404m96 = c4404m9Arr[i + 2];
                int i6 = i2 + 1;
                C4396fa c4396fa3 = c4396faArr[i2 + 2];
                C4404m9 c4404m97 = c4404m93;
                c4404m93 = c4404m96;
                c4404m92 = c4404m97;
                i2 = i6;
                c4396fa = c4396fa2;
                c4396fa2 = c4396fa3;
                i = i5;
            }
            z = false;
        }
        if ((vector2.size() & 1) != 0) {
            System.out.println("Odd number of chains!");
        }
    }

    /* JADX INFO: renamed from: k4 */
    public static boolean m17901k4(double d, double d2, int i) {
        return (i & 1) == 0 ? d <= d2 : d < d2;
    }
}
