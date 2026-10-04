package com.aspose.slides;

import Oooo0.C20856OooooOo;
import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.internal.p475wh.C12014ne;
import com.aspose.slides.internal.p475wh.C12015qq;
import com.aspose.slides.internal.p475wh.C12023wl;
import com.aspose.slides.p559ms.System.AbstractC14092to;
import com.aspose.slides.p559ms.System.C14080ne;
import com.aspose.slides.p559ms.System.C14116yg;
import java.lang.reflect.Array;

/* JADX INFO: renamed from: com.aspose.slides.af */
/* JADX INFO: loaded from: classes3.dex */
class C0747af {
    /* JADX INFO: renamed from: k4 */
    public static double m3521k4(C14787xi c14787xi) {
        int displayUnit = 0;
        if (c14787xi.m73384dy() != null && c14787xi.m73384dy().getDisplayUnit() != 0) {
            displayUnit = c14787xi.m73384dy().getDisplayUnit() + 1;
        }
        return C14116yg.m67469du(10.0d, -displayUnit);
    }

    /* JADX WARN: Code restructure failed: missing block: B:51:0x01b0, code lost:
    
        r4 = r2;
        r15 = r3;
        r2 = r1;
     */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00bf  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00c7  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x01bf  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x011c A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:60:0x010d A[SYNTHETIC] */
    /* JADX INFO: renamed from: kk */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static C12023wl m3540kk(C14787xi c14787xi, C12014ne c12014ne, int i, boolean z, C13847mr c13847mr) {
        boolean z2;
        List<C1210hn> listM69848kk;
        List<C1210hn>[] listArrM69830du;
        boolean zM73385fa;
        boolean z3;
        C12015qq c12015qq;
        float f;
        int iM73370k4;
        List list;
        C13847mr c13847mr2;
        int iM3524k4;
        String[] strArr;
        boolean zM3536k4;
        float f2;
        int i2;
        float f3;
        C14787xi c14787xi2 = c14787xi;
        int i3 = 0;
        int i4 = 1;
        if (c14787xi2.m73384dy().getCategoryAxisType() == 1) {
            c14787xi2.m73383du(false);
            c14787xi2.m73388h4(1);
            z2 = true;
        } else {
            z2 = false;
        }
        List list2 = new List(c14787xi2.f50098m9);
        if (c14787xi2.m73384dy().isLogarithmic()) {
            for (int i5 = 0; i5 < list2.size(); i5++) {
                list2.set_Item(i5, Double.valueOf(c14787xi2.m73424x1(C14080ne.m66903fa(list2.get_Item(i5)))));
            }
        }
        C14365qy c14365qyM73423wy = c14787xi2.m73423wy();
        if (c14787xi2.m73419up() == 0) {
            listM69848kk = c14365qyM73423wy.m69871x1();
            listArrM69830du = c14365qyM73423wy.m69861to();
        } else {
            listM69848kk = c14365qyM73423wy.m69848kk();
            listArrM69830du = c14365qyM73423wy.m69830du();
        }
        List<C1210hn> list3 = listM69848kk;
        int iM3542x1 = m3542x1(c14787xi2);
        String strM4985h4 = c13847mr.m64944dy().get_Item(0).m4985h4();
        if (!ChartTypeCharacterizer.isChartTypeScatter(c13847mr.m64945h4().getType()) && !ChartTypeCharacterizer.isChartTypeBubble(c13847mr.m64945h4().getType())) {
            zM73385fa = c14787xi2.m73384dy().isNumberFormatLinkedToSource() && list3.size() > 0;
            if (listArrM69830du != null && listArrM69830du.length > 0 && list3.size() > 0) {
                z3 = true;
            }
            f = 0.0f;
            c12015qq = new C12015qq(0.0f, 0.0f);
            iM73370k4 = z2 ? C14787xi.m73370k4(c14787xi2, i) : list2.size();
            list = list2;
            c13847mr2 = c13847mr;
            iM3524k4 = m3524k4(c12014ne.Clone(), z, c13847mr2, iM73370k4);
            strArr = new String[list.size()];
            float f4 = 0.0f;
            float f5 = 0.0f;
            int i6 = 0;
            boolean z4 = false;
            while (true) {
                C12015qq[] c12015qqArr = {c12015qq};
                String[] strArr2 = strArr;
                int i7 = iM3524k4;
                int i8 = iM73370k4;
                float f6 = f;
                zM3536k4 = m3536k4(c14787xi2, c12014ne.Clone(), z, c13847mr2, c12015qqArr, list, 0.5f, i8, i7, iM3542x1);
                int i9 = iM3542x1;
                c12015qqArr[i3].CloneTo(c12015qq);
                if (zM3536k4) {
                    List<C1210hn> list4 = list3;
                    float[] fArr = new float[i4];
                    fArr[i3] = f6;
                    String str = strM4985h4;
                    float[] fArr2 = new float[i4];
                    fArr2[i3] = f6;
                    boolean z5 = z3;
                    int[] iArr = {i3};
                    C12015qq c12015qq2 = c12015qq;
                    int i10 = i4;
                    List list5 = list;
                    int i11 = i3;
                    int i12 = i6;
                    m3534k4(c14787xi, z, c13847mr, list5, i12, 300, z5, list4, str, strArr2, c12015qq2.Clone(), fArr, fArr2, iArr, new int[]{i3});
                    float f7 = fArr[i11];
                    float f8 = fArr2[i11];
                    int i13 = iArr[i11];
                    int i14 = i12 + 1;
                    c14787xi.f50095kk = f8;
                    c14787xi.f50102to = f7;
                    if (!c14787xi.m73421v4() || z4) {
                        break;
                    }
                    float fM56697kk = c12015qq2.m56697kk();
                    float[] fArr3 = new float[i10];
                    fArr3[i11] = f4;
                    float[] fArr4 = new float[i10];
                    fArr4[i11] = f5;
                    float[] fArr5 = new float[i10];
                    fArr5[i11] = fM56697kk;
                    boolean[] zArr = new boolean[i10];
                    zArr[i11] = z4;
                    i2 = i13;
                    f2 = f8;
                    f3 = f7;
                    boolean zM3539k4 = m3539k4(c14787xi, z, f3, fArr3, f2, c12015qq2.Clone(), i8, i7, fArr4, fArr5, zArr);
                    f4 = fArr3[i11];
                    f5 = fArr4[i11];
                    z4 = zArr[i11];
                    if (!zM3539k4) {
                        break;
                    }
                    c14787xi2 = c14787xi;
                    c13847mr2 = c13847mr;
                    iM73370k4 = i8;
                    iM3524k4 = i7;
                    list = list5;
                    list3 = list4;
                    strM4985h4 = str;
                    z3 = z5;
                    c12015qq = c12015qq2;
                    f = f6;
                    strArr = strArr2;
                    iM3542x1 = i9;
                    i3 = i11;
                    i6 = i14;
                    i4 = 1;
                } else {
                    c14787xi2 = c14787xi;
                    c13847mr2 = c13847mr;
                    f = f6;
                    strArr = strArr2;
                    iM3542x1 = i9;
                    iM73370k4 = i8;
                    iM3524k4 = i7;
                }
            }
            if (c14787xi.m73384dy().isPlotOrderReversed()) {
                C7019kk.m27462to(Float.valueOf(i2), 13);
            }
            return new C12023wl(C7019kk.m27462to(Float.valueOf(f3), 13), C7019kk.m27462to(Float.valueOf(f2), 13));
        }
        zM73385fa = c14787xi2.m73385fa();
        z3 = zM73385fa;
        f = 0.0f;
        c12015qq = new C12015qq(0.0f, 0.0f);
        iM73370k4 = z2 ? C14787xi.m73370k4(c14787xi2, i) : list2.size();
        list = list2;
        c13847mr2 = c13847mr;
        iM3524k4 = m3524k4(c12014ne.Clone(), z, c13847mr2, iM73370k4);
        strArr = new String[list.size()];
        float f42 = 0.0f;
        float f52 = 0.0f;
        int i62 = 0;
        boolean z42 = false;
        while (true) {
            C12015qq[] c12015qqArr2 = {c12015qq};
            String[] strArr22 = strArr;
            int i72 = iM3524k4;
            int i82 = iM73370k4;
            float f62 = f;
            zM3536k4 = m3536k4(c14787xi2, c12014ne.Clone(), z, c13847mr2, c12015qqArr2, list, 0.5f, i82, i72, iM3542x1);
            int i92 = iM3542x1;
            c12015qqArr2[i3].CloneTo(c12015qq);
            if (zM3536k4) {
            }
        }
        if (c14787xi.m73384dy().isPlotOrderReversed()) {
        }
        return new C12023wl(C7019kk.m27462to(Float.valueOf(f3), 13), C7019kk.m27462to(Float.valueOf(f2), 13));
    }

    /* JADX WARN: Code restructure failed: missing block: B:131:0x047b, code lost:
    
        r2 = r5;
        r4 = r9;
     */
    /* JADX WARN: Removed duplicated region for block: B:162:0x02e8 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x006e A[PHI: r6 r7
      0x006e: PHI (r6v37 com.aspose.slides.Collections.Generic.List<com.aspose.slides.hn>) = 
      (r6v4 com.aspose.slides.Collections.Generic.List<com.aspose.slides.hn>)
      (r6v38 com.aspose.slides.Collections.Generic.List<com.aspose.slides.hn>)
     binds: [B:24:0x008e, B:17:0x006c] A[DONT_GENERATE, DONT_INLINE]
      0x006e: PHI (r7v30 com.aspose.slides.Collections.Generic.List<com.aspose.slides.hn>[]) = 
      (r7v0 com.aspose.slides.Collections.Generic.List<com.aspose.slides.hn>[])
      (r7v31 com.aspose.slides.Collections.Generic.List<com.aspose.slides.hn>[])
     binds: [B:24:0x008e, B:17:0x006c] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0070 A[PHI: r6 r7
      0x0070: PHI (r6v5 com.aspose.slides.Collections.Generic.List<com.aspose.slides.hn>) = 
      (r6v4 com.aspose.slides.Collections.Generic.List<com.aspose.slides.hn>)
      (r6v4 com.aspose.slides.Collections.Generic.List<com.aspose.slides.hn>)
      (r6v38 com.aspose.slides.Collections.Generic.List<com.aspose.slides.hn>)
      (r6v38 com.aspose.slides.Collections.Generic.List<com.aspose.slides.hn>)
     binds: [B:22:0x0088, B:24:0x008e, B:15:0x0066, B:17:0x006c] A[DONT_GENERATE, DONT_INLINE]
      0x0070: PHI (r7v1 com.aspose.slides.Collections.Generic.List<com.aspose.slides.hn>[]) = 
      (r7v0 com.aspose.slides.Collections.Generic.List<com.aspose.slides.hn>[])
      (r7v0 com.aspose.slides.Collections.Generic.List<com.aspose.slides.hn>[])
      (r7v31 com.aspose.slides.Collections.Generic.List<com.aspose.slides.hn>[])
      (r7v31 com.aspose.slides.Collections.Generic.List<com.aspose.slides.hn>[])
     binds: [B:22:0x0088, B:24:0x008e, B:15:0x0066, B:17:0x006c] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:75:0x026e  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0275  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x027f  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0285  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0288  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0290 A[PHI: r37
      0x0290: PHI (r37v4 int) = (r37v1 int), (r37v8 int) binds: [B:81:0x0286, B:83:0x028a] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:91:0x02da  */
    /* JADX INFO: renamed from: to */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static C12023wl m3541to(C14787xi c14787xi, C12014ne c12014ne, int i, boolean z, C13847mr c13847mr) {
        boolean z2;
        List<C1210hn> listM69848kk;
        List<C1210hn>[] listArrM69830du;
        boolean z3;
        float f;
        float fM3523k4;
        int iOooO00o;
        int iM56862kk;
        C12015qq c12015qq;
        float fM56865x1;
        float f2;
        boolean z4;
        float f3;
        float f4;
        int i2;
        float f5;
        float f6;
        float f7;
        float f8;
        C12015qq[] c12015qqArr;
        C14787xi c14787xi2;
        float fM56699x1;
        float fM4429k4;
        C12023wl c12023wlM4439k4;
        C12023wl c12023wl;
        int i3;
        C14787xi c14787xi3 = c14787xi;
        C13847mr c13847mr2 = c13847mr;
        C14365qy c14365qyM73423wy = c14787xi3.m73423wy();
        int i4 = 0;
        int i5 = 1;
        if (c14787xi3.m73384dy().getCategoryAxisType() == 1) {
            c14787xi3.m73383du(false);
            c14787xi3.m73388h4(1);
            z2 = true;
        } else {
            z2 = false;
        }
        List list = new List(c14787xi3.f50098m9);
        if (c14787xi3.m73384dy().isLogarithmic()) {
            for (int i6 = 0; i6 < list.size(); i6++) {
                list.set_Item(i6, Double.valueOf(c14787xi3.m73424x1(C14080ne.m66903fa(list.get_Item(i6)))));
            }
        }
        if (c14787xi3.m73419up() == 0) {
            listM69848kk = c14365qyM73423wy.m69871x1();
            listArrM69830du = c14365qyM73423wy.m69861to();
            IChartCategoryCollection categories = c14365qyM73423wy.m69834fa().getChartData().getCategories();
            z3 = categories != null && categories.size() > 0;
        } else {
            listM69848kk = c14365qyM73423wy.m69848kk();
            listArrM69830du = c14365qyM73423wy.m69830du();
            IChartCategoryCollection secondaryCategories = c14365qyM73423wy.m69834fa().getChartData().getSecondaryCategories();
            if (secondaryCategories == null || secondaryCategories.size() <= 0) {
            }
        }
        List<C1210hn> list2 = listM69848kk;
        boolean z5 = z3;
        boolean z6 = listArrM69830du != null && listArrM69830du.length > 0;
        int iM3542x1 = m3542x1(c14787xi3);
        String strM4985h4 = c13847mr2.m64944dy().get_Item(0).m4985h4();
        boolean zM73385fa = c14787xi3.m73385fa();
        C12015qq c12015qq2 = new C12015qq(0.0f, 0.0f);
        int iM73370k4 = !z2 ? C14787xi.m73370k4(c14787xi3, i) : list.size();
        int iM3524k4 = m3524k4(c12014ne.Clone(), z, c13847mr2, iM73370k4);
        boolean zIs3DChart = ChartTypeCharacterizer.is3DChart(c14365qyM73423wy.m69834fa().getType());
        C12023wl c12023wlClone = C0840c3.m4442k4("a", c14787xi3.m73400kk()).Clone();
        float[][] fArr = (float[][]) Array.newInstance((Class<?>) Float.TYPE, list.size(), 2);
        C12023wl[] c12023wlArr = (C12023wl[]) AbstractC14092to.m67212k4(AbstractC14092to.m67205k4(C7019kk.m27443k4((Class<?>) C12023wl.class), list.size()));
        String[] strArr = new String[list.size()];
        float f9 = 0.5f;
        char c = 2;
        float f10 = 0.0f;
        float f11 = 0.0f;
        float f12 = 0.0f;
        float f13 = 0.5f;
        boolean z7 = false;
        int i7 = 0;
        while (true) {
            C12015qq[] c12015qqArr2 = new C12015qq[i5];
            c12015qqArr2[i4] = c12015qq2;
            C12015qq c12015qq3 = c12015qq2;
            float f14 = f9;
            float[] fArr2 = new float[i5];
            fArr2[i4] = 0.0f;
            char c2 = c;
            int i8 = i5;
            C12015qq c12015qq4 = c12015qq3;
            String[] strArr2 = strArr;
            C13847mr c13847mr3 = c13847mr2;
            boolean z8 = z;
            boolean zM3535k4 = m3535k4(c14787xi3, c12014ne.Clone(), z8, c13847mr3, c12015qqArr2, list, f14, f13, iM73370k4, iM3524k4, iM3542x1, fArr2);
            int i9 = iM3524k4;
            List list3 = list;
            int i10 = iM3542x1;
            int i11 = iM73370k4;
            c12015qqArr2[i4].CloneTo(c12015qq4);
            float fM56663c5 = fArr2[i4];
            if (!zM3535k4) {
                int i12 = 45;
                if (c14787xi.m73386h4() == 45) {
                    f = f13;
                    fM3523k4 = m3523k4(c12014ne.Clone(), z8, c13847mr3, (List<Object>) list3, i11);
                } else {
                    f = f13;
                    fM3523k4 = 0.0f;
                }
                C12015qq[] c12015qqArr3 = c12015qqArr2;
                int i13 = i4;
                iOooO00o = i13;
                iM56862kk = iOooO00o;
                int i14 = iM56862kk;
                float f15 = 0.0f;
                float fM56865x12 = 0.0f;
                float f16 = 0.0f;
                float f17 = 0.0f;
                while (i13 < list3.size()) {
                    if (c14787xi.m73386h4() == i12) {
                        c12015qqArr3[i14] = c12015qq4;
                        f5 = f15;
                        f6 = fM56865x12;
                        C12015qq[] c12015qqArr4 = c12015qqArr3;
                        c14787xi2 = c14787xi;
                        m3531k4(c14787xi2, c12014ne.Clone(), z8, (List<Object>) list3, i13, c12015qqArr4, f14, fM3523k4, f);
                        c12015qqArr = c12015qqArr4;
                        f7 = fM3523k4;
                        f8 = f;
                        c12015qqArr[i14].CloneTo(c12015qq4);
                    } else {
                        f5 = f15;
                        f6 = fM56865x12;
                        f7 = fM3523k4;
                        f8 = f;
                        c12015qqArr = c12015qqArr3;
                        c14787xi2 = c14787xi;
                    }
                    if (i13 == 0 && i7 <= 0) {
                        c14787xi2.m73427x1((c12023wlClone.m56865x1() * c14787xi2.m73378ck()) / 300);
                    }
                    int i15 = i10;
                    List<C1210hn> list4 = list2;
                    int i16 = i7;
                    String[] strArr3 = strArr2;
                    float f18 = f14;
                    float f19 = f8;
                    String str = strM4985h4;
                    List list5 = list3;
                    C12015qq c12015qq5 = c12015qq4;
                    boolean z9 = zM73385fa;
                    float f20 = f7;
                    boolean z10 = z5;
                    String strM3529k4 = m3529k4(c14787xi2, c13847mr, i16, z9, i13, list4, (List<Object>) list5, str, strArr3);
                    if (i16 <= 0) {
                        fM4429k4 = C0840c3.m4429k4(strM3529k4, c14787xi2.m73400kk(), !zIs3DChart);
                        fM56699x1 = C0840c3.m4449x1(strM3529k4, c14787xi2.m73400kk()).m56699x1();
                        float[] fArr3 = fArr[i13];
                        fArr3[i14] = fM4429k4;
                        fArr3[i8] = fM56699x1;
                    } else {
                        float[] fArr4 = fArr[i13];
                        float f21 = fArr4[i14];
                        fM56699x1 = fArr4[i8];
                        fM4429k4 = f21;
                    }
                    if (fM4429k4 > f16) {
                        f16 = fM4429k4;
                    }
                    if (fM56699x1 > f17) {
                        f17 = fM56699x1;
                    }
                    int i17 = i14;
                    C12023wl c12023wl2 = new C12023wl(i17, i17);
                    if (z10) {
                        c12023wlM4439k4 = C0840c3.m4439k4(strM3529k4, c14787xi2.m73386h4(), c14787xi2.m73400kk(), c12015qq5.Clone(), 1, 1);
                    } else if (i16 <= 0) {
                        C0840c3.m4442k4(strM3529k4, c14787xi2.m73400kk()).CloneTo(c12023wl2);
                        c12023wl2.CloneTo(c12023wlArr[i13]);
                        fM56865x12 = ((float) c12023wl2.m56865x1()) <= f6 ? c12023wl2.m56865x1() : f6;
                        float fM56862kk = ((float) c12023wl2.m56862kk()) <= f5 ? c12023wl2.m56862kk() : f5;
                        if (i13 != 0) {
                            c12023wl = c12023wl2;
                            i3 = i16;
                        } else if (z) {
                            iOooO00o = c12023wl2.m56862kk() / 2;
                            c12023wl = c12023wl2;
                            i3 = i16;
                        } else if (c14787xi2.m73386h4() == 45) {
                            c12023wl = c12023wl2;
                            i3 = i16;
                            iOooO00o = C7019kk.m27462to(Double.valueOf(((double) c12023wl2.m56865x1()) - (((double) f20) * 0.6d)), 14);
                        } else {
                            c12023wl = c12023wl2;
                            i3 = i16;
                            iOooO00o = com.aspose.slides.Collections.Generic.OooO00o.OooO00o(c12023wl2.m56865x1(), 0.65d, 14);
                        }
                        if (i13 == list5.size() - 1) {
                            iM56862kk = (z ? c12023wl.m56862kk() : c12023wl.m56865x1()) / 2;
                        }
                        i13++;
                        z8 = z;
                        f15 = fM56862kk;
                        f = f19;
                        fM3523k4 = f20;
                        f14 = f18;
                        c12015qq4 = c12015qq5;
                        list3 = list5;
                        list2 = list4;
                        c12015qqArr3 = c12015qqArr;
                        strM4985h4 = str;
                        strArr2 = strArr3;
                        i12 = 45;
                        i14 = 0;
                        i10 = i15;
                        i7 = i3;
                        z5 = z10;
                        zM73385fa = z9;
                    } else {
                        c12023wlM4439k4 = c12023wlArr[i13];
                    }
                    c12023wlM4439k4.CloneTo(c12023wl2);
                    if (((float) c12023wl2.m56865x1()) <= f6) {
                    }
                    if (((float) c12023wl2.m56862kk()) <= f5) {
                    }
                    if (i13 != 0) {
                    }
                    if (i13 == list5.size() - 1) {
                    }
                    i13++;
                    z8 = z;
                    f15 = fM56862kk;
                    f = f19;
                    fM3523k4 = f20;
                    f14 = f18;
                    c12015qq4 = c12015qq5;
                    list3 = list5;
                    list2 = list4;
                    c12015qqArr3 = c12015qqArr;
                    strM4985h4 = str;
                    strArr2 = strArr3;
                    i12 = 45;
                    i14 = 0;
                    i10 = i15;
                    i7 = i3;
                    z5 = z10;
                    zM73385fa = z9;
                }
                float f22 = f15;
                float f23 = fM56865x12;
                int i18 = i10;
                String str2 = strM4985h4;
                boolean z11 = zM73385fa;
                String[] strArr4 = strArr2;
                float f24 = f;
                c12015qq = c12015qq4;
                List<C1210hn> list6 = list2;
                boolean z12 = z5;
                int i19 = i7;
                List list7 = list3;
                float f25 = f14;
                int i20 = i19 + 1;
                if (c14787xi.m73386h4() == 45) {
                    fM56663c5 = ((c12014ne.m56663c5() - f23) + c12023wlClone.m56865x1()) / i11;
                    fM56865x1 = C0840c3.m4439k4("a", 45, c14787xi.m73400kk(), c12015qq.Clone(), 1, 1).m56865x1();
                } else {
                    fM56865x1 = f16;
                }
                float f26 = fM56663c5;
                c14787xi.f50095kk = f22;
                c14787xi.f50102to = f23;
                if (!z12 || fM56865x1 <= ((double) f26) * 0.8d) {
                    f2 = f23;
                    z4 = z6;
                    if (z) {
                        if (c12015qq.m56697kk() / f22 > 2.5d && f24 > 0.2d && ((double) c12015qq.m56699x1()) * 0.8d > fM56865x1) {
                            f13 = f24 * 0.8f;
                            c14787xi3 = c14787xi;
                            c13847mr2 = c13847mr;
                            iM73370k4 = i11;
                            z6 = z4;
                            f9 = f25;
                            c12015qq2 = c12015qq;
                            z5 = z12;
                            list = list7;
                            list2 = list6;
                            iM3524k4 = i9;
                            strM4985h4 = str2;
                            zM73385fa = z11;
                            strArr = strArr4;
                            i4 = 0;
                            iM3542x1 = i18;
                            i7 = i20;
                        }
                    } else if (c14787xi.m73386h4() != 45 && c12015qq.m56699x1() / f2 > 2.0f && f25 > 0.3d) {
                        float f27 = (4.0f * f25) / 5.0f;
                        c13847mr2 = c13847mr;
                        iM73370k4 = i11;
                        f13 = f24;
                        z6 = z4;
                        c12015qq2 = c12015qq;
                        z5 = z12;
                        list = list7;
                        list2 = list6;
                        iM3524k4 = i9;
                        strM4985h4 = str2;
                        zM73385fa = z11;
                        strArr = strArr4;
                        i4 = 0;
                        iM3542x1 = i18;
                        f9 = f27;
                        i7 = i20;
                        i5 = i8;
                        c = c2;
                        c14787xi3 = c14787xi;
                    }
                    if (!c14787xi.m73421v4() || z7) {
                        break;
                    }
                    float[] fArr5 = new float[i8];
                    fArr5[0] = f10;
                    float[] fArr6 = new float[i8];
                    fArr6[0] = f11;
                    float[] fArr7 = new float[i8];
                    fArr7[0] = f12;
                    boolean[] zArr = new boolean[i8];
                    zArr[0] = z7;
                    f4 = f22;
                    f3 = f2;
                    boolean zM3539k4 = m3539k4(c14787xi, z, f3, fArr5, f4, c12015qq.Clone(), i11, i9, fArr6, fArr7, zArr);
                    f10 = fArr5[0];
                    f11 = fArr6[0];
                    f12 = fArr7[0];
                    z7 = zArr[0];
                    if (!zM3539k4) {
                        break;
                    }
                    c14787xi3 = c14787xi;
                    iM3542x1 = i18;
                    c13847mr2 = c13847mr;
                    iM73370k4 = i11;
                    f13 = f24;
                    z6 = z4;
                    f9 = f25;
                    c12015qq2 = c12015qq;
                    z5 = z12;
                    list = list7;
                    c = c2;
                    list2 = list6;
                    iM3524k4 = i9;
                    strM4985h4 = str2;
                    zM73385fa = z11;
                    strArr = strArr4;
                    i4 = 0;
                    i7 = i20;
                    i5 = 1;
                } else {
                    f2 = f23;
                    boolean z13 = z6;
                    z4 = z13;
                    if (!m3538k4(c14787xi, z, f22, c12023wlClone.Clone(), f17, f2, z13)) {
                        if (!c14787xi.m73421v4()) {
                            break;
                        }
                        break;
                        break;
                    }
                    c14787xi3 = c14787xi;
                    c13847mr2 = c13847mr;
                    iM73370k4 = i11;
                    f13 = f24;
                    z6 = z4;
                    f9 = f25;
                    c12015qq2 = c12015qq;
                    z5 = z12;
                    list = list7;
                    list2 = list6;
                    iM3524k4 = i9;
                    strM4985h4 = str2;
                    zM73385fa = z11;
                    strArr = strArr4;
                    i4 = 0;
                    iM3542x1 = i18;
                    i7 = i20;
                }
            } else {
                c14787xi3 = c14787xi;
                list = list3;
                c13847mr2 = c13847mr3;
                iM73370k4 = i11;
                iM3542x1 = i10;
                strArr = strArr2;
                iM3524k4 = i9;
                f9 = f14;
                c12015qq2 = c12015qq4;
            }
            i5 = i8;
            c = c2;
        }
        if (c14787xi.m73384dy().isPlotOrderReversed()) {
            i2 = iOooO00o;
            iOooO00o = iM56862kk;
        } else {
            i2 = iM56862kk;
        }
        float f28 = f4;
        float[] fArr8 = {f3};
        float[] fArr9 = {f28};
        m3532k4(c14787xi, c12014ne.Clone(), z, c12015qq.Clone(), fArr8, fArr9);
        float f29 = fArr8[0];
        float f30 = fArr9[0];
        m3533k4(c14787xi, z, c13847mr, f29, f30, iOooO00o, i2);
        return new C12023wl(C7019kk.m27462to(Float.valueOf(f29), 13), C7019kk.m27462to(Float.valueOf(f30), 13));
    }

    /* JADX WARN: Removed duplicated region for block: B:6:0x001a A[PHI: r12
      0x001a: PHI (r12v5 com.aspose.slides.Collections.Generic.List<com.aspose.slides.hn>) = 
      (r12v2 com.aspose.slides.Collections.Generic.List<com.aspose.slides.hn>)
      (r12v6 com.aspose.slides.Collections.Generic.List<com.aspose.slides.hn>)
     binds: [B:9:0x002a, B:5:0x0018] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x001c A[PHI: r12
      0x001c: PHI (r12v3 com.aspose.slides.Collections.Generic.List<com.aspose.slides.hn>) = 
      (r12v2 com.aspose.slides.Collections.Generic.List<com.aspose.slides.hn>)
      (r12v6 com.aspose.slides.Collections.Generic.List<com.aspose.slides.hn>)
     binds: [B:9:0x002a, B:5:0x0018] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX INFO: renamed from: x1 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static int m3542x1(C14787xi c14787xi) {
        List<C1210hn> listM69848kk;
        boolean z;
        C14365qy c14365qyM73423wy = c14787xi.m73423wy();
        if (c14787xi.m73419up() == 0) {
            listM69848kk = c14365qyM73423wy.m69871x1();
            z = c14365qyM73423wy.m69871x1().size() > 0;
        } else {
            listM69848kk = c14365qyM73423wy.m69848kk();
            if (c14365qyM73423wy.m69848kk().size() > 0) {
            }
        }
        if (!z || listM69848kk.size() == 1) {
            return 1;
        }
        int i = Integer.MAX_VALUE;
        boolean z2 = true;
        float f = 0.0f;
        float f2 = 0.0f;
        for (int i2 = 0; i2 < listM69848kk.size(); i2++) {
            C1210hn c1210hn = listM69848kk.get_Item(i2);
            if (c1210hn.m7238x1() == null || c1210hn.m7238x1().equals("")) {
                if (z2) {
                    f += 1.0f;
                } else {
                    f2 += 1.0f;
                }
            } else if (z2) {
                if (i2 == 0) {
                    f = 100.0f;
                }
                if (f <= 0.0f) {
                    return 1;
                }
                z2 = false;
            } else {
                if (i2 == listM69848kk.size()) {
                    f2 = 100.0f;
                }
                float f3 = f2 / 2.0f;
                if (f >= f3) {
                    f = f3;
                }
                int iM63759kk = kc0.m63759kk(1.0f + f + f);
                if (iM63759kk <= 1) {
                    return 1;
                }
                if (iM63759kk < i) {
                    i = iM63759kk;
                }
                f2 = f;
            }
        }
        if (i == Integer.MAX_VALUE) {
            return 1;
        }
        return i;
    }

    /* JADX INFO: renamed from: k4 */
    public static float m3522k4(float f) {
        return f * 0.4f * im9.m7679k4();
    }

    /* JADX WARN: Removed duplicated region for block: B:110:0x0259 A[PHI: r6 r7
      0x0259: PHI (r6v15 float) = (r6v10 float), (r6v12 float), (r6v24 float), (r6v26 float), (r6v28 float), (r6v30 float), (r6v32 float) binds: [B:190:0x0388, B:178:0x035e, B:164:0x0329, B:152:0x0300, B:138:0x02c1, B:126:0x0299, B:109:0x0257] A[DONT_GENERATE, DONT_INLINE]
      0x0259: PHI (r7v10 int) = (r7v7 int), (r7v7 int), (r7v14 int), (r7v14 int), (r7v15 int), (r7v15 int), (r7v18 int) binds: [B:190:0x0388, B:178:0x035e, B:164:0x0329, B:152:0x0300, B:138:0x02c1, B:126:0x0299, B:109:0x0257] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:144:0x02d4 A[PHI: r6
      0x02d4: PHI (r6v18 float) = (r6v9 float), (r6v11 float), (r6v23 float), (r6v25 float), (r6v27 float), (r6v29 float), (r6v31 float), (r6v33 float) binds: [B:195:0x039a, B:183:0x0370, B:169:0x033b, B:157:0x0312, B:143:0x02d2, B:131:0x02aa, B:117:0x0276, B:101:0x023a] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:201:0x03ae A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00bb  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00d9  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00eb  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x011e  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0144  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0223  */
    /* JADX INFO: renamed from: x1 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static C12023wl m3543x1(C14787xi c14787xi, C12014ne c12014ne, int i, boolean z, C13847mr c13847mr) {
        boolean z2;
        List<C1210hn> listM69848kk;
        List<C1210hn>[] listArrM69830du;
        boolean zM73385fa;
        boolean z3;
        float f;
        int size;
        float fM73376bv;
        float f2;
        int i2;
        int i3;
        char c;
        int i4;
        float f3;
        float f4;
        int iM27462to;
        float fM56663c5;
        float fM56699x1;
        C14365qy c14365qyM73423wy = c14787xi.m73423wy();
        char c2 = 0;
        int i5 = 1;
        if (c14787xi.m73384dy().getCategoryAxisType() == 1) {
            c14787xi.m73383du(false);
            c14787xi.m73388h4(1);
            z2 = true;
        } else {
            z2 = false;
        }
        List list = new List(c14787xi.f50098m9);
        if (c14787xi.m73384dy().isLogarithmic()) {
            for (int i6 = 0; i6 < list.size(); i6++) {
                list.set_Item(i6, Double.valueOf(c14787xi.m73424x1(C14080ne.m66903fa(list.get_Item(i6)))));
            }
        }
        if (c14787xi.m73419up() == 0) {
            listM69848kk = c14365qyM73423wy.m69871x1();
            listArrM69830du = c14365qyM73423wy.m69861to();
        } else {
            listM69848kk = c14365qyM73423wy.m69848kk();
            listArrM69830du = c14365qyM73423wy.m69830du();
        }
        List<C1210hn> list2 = listM69848kk;
        String strM4985h4 = c13847mr.m64944dy().get_Item(0).m4985h4();
        if (ChartTypeCharacterizer.isChartTypeScatter(c13847mr.m64945h4().getType()) || ChartTypeCharacterizer.isChartTypeBubble(c13847mr.m64945h4().getType())) {
            zM73385fa = c14787xi.m73385fa();
        } else {
            zM73385fa = c14787xi.m73384dy().isNumberFormatLinkedToSource() && list2.size() > 0;
            if (listArrM69830du != null && listArrM69830du.length > 0 && list2.size() > 0) {
                z3 = true;
            }
            f = 0.0f;
            C12015qq c12015qq = new C12015qq(0.0f, 0.0f);
            if (!z2) {
                size = list.size();
            } else if (c14787xi.m73375b3() || c14787xi.m73423wy().m69834fa().hasDataTable()) {
                size = i;
            } else {
                size = i - 1;
                if (size == 0) {
                    size = 1;
                }
            }
            if (ChartTypeCharacterizer.isSeriesUsesXValueCoordinate(c13847mr.m64945h4().getType())) {
                fM73376bv = c14787xi.m73376bv() * ((z ? c12014ne.m56683x1() : c12014ne.m56663c5()) / size);
            } else {
                C12015qq c12015qqClone = C0840c3.m4445kk("3", c14787xi.m73400kk()).Clone();
                if (z) {
                    fM56663c5 = c12014ne.m56683x1() / list.size();
                    fM56699x1 = c12015qqClone.m56697kk();
                } else {
                    fM56663c5 = c12014ne.m56663c5() / list.size();
                    fM56699x1 = c12015qqClone.m56699x1();
                }
                fM73376bv = fM56699x1 + fM56663c5;
            }
            f2 = fM73376bv;
            C12023wl c12023wl = new C12023wl(0, 0);
            float fM56862kk = 0.0f;
            i2 = 0;
            i3 = 0;
            int iM27462to2 = 0;
            while (true) {
                c = c2;
                if (i2 < list.size()) {
                    float f5 = fM56862kk;
                    int i7 = i3;
                    int i8 = i5;
                    float f6 = f;
                    c14787xi.f50102to = f6;
                    c14787xi.f50095kk = f5;
                    float[] fArr = new float[i8];
                    fArr[c] = f6;
                    float[] fArr2 = new float[i8];
                    fArr2[c] = f5;
                    m3532k4(c14787xi, c12014ne.Clone(), z, c12015qq.Clone(), fArr, fArr2);
                    float f7 = fArr[c];
                    float f8 = fArr2[c];
                    m3533k4(c14787xi, z, c13847mr, f7, f8, i7, iM27462to2);
                    return new C12023wl(C7019kk.m27462to(Float.valueOf(f7), 13), C7019kk.m27462to(Float.valueOf(f8), 13));
                }
                int iOooO00o = C20856OooooOo.OooO00o(i5, i2, list);
                int i9 = i3;
                C12015qq[] c12015qqArr = {c12015qq};
                float f9 = f;
                int i10 = iM27462to2;
                int i11 = i9;
                List<C1210hn> list3 = list2;
                String str = strM4985h4;
                float f10 = fM56862kk;
                m3531k4(c14787xi, c12014ne.Clone(), z, (List<Object>) list, i2, c12015qqArr, 0.5f, f2, 0.5f);
                float f11 = f2;
                c12015qqArr[c].CloneTo(c12015qq);
                if (i2 == 0) {
                    C0840c3.m4442k4("a", c14787xi.m73400kk()).CloneTo(c12023wl);
                    c14787xi.m73427x1((c12023wl.m56865x1() * c14787xi.m73378ck()) / 300);
                }
                List list4 = list;
                boolean z4 = z3;
                String strM3529k4 = m3529k4(c14787xi, c13847mr, 0, z4, i2, list3, (List<Object>) list4, str, (String[]) null);
                int i12 = i2;
                list = list4;
                C12023wl c12023wlClone = C0840c3.m4439k4(strM3529k4, c14787xi.m73386h4(), c14787xi.m73400kk(), c12015qq.Clone(), 1, 1).Clone();
                float fM56865x1 = ((float) c12023wlClone.m56865x1()) > f9 ? c12023wlClone.m56865x1() : f9;
                fM56862kk = ((float) c12023wlClone.m56862kk()) > f10 ? c12023wlClone.m56862kk() : f10;
                float f12 = z ? fM56862kk : fM56865x1;
                int position = c14787xi.m73384dy().getPosition();
                if (position == 0) {
                    i4 = i10;
                    if (c14787xi.m73384dy().isPlotOrderReversed()) {
                        if (c14787xi.m73386h4() > 0) {
                            float f13 = (f11 / 2.0f) + (iOooO00o * f11);
                            if (f12 > f13) {
                                f4 = f12 - f13;
                                if (f4 > i11) {
                                }
                                i11 = iM27462to;
                            }
                            iM27462to = i11;
                            i11 = iM27462to;
                        } else {
                            float f14 = (f11 / 2.0f) + (i12 * f11);
                            if (f12 > f14) {
                                f3 = f12 - f14;
                                if (f3 > i4) {
                                }
                                z3 = z4;
                                i5 = 1;
                                list2 = list3;
                                strM4985h4 = str;
                                f2 = f11;
                                i2 = i12 + 1;
                                f = fM56865x1;
                                i3 = i11;
                                c2 = c;
                            }
                        }
                    } else if (c14787xi.m73386h4() > 0) {
                        float f15 = (f11 / 2.0f) + (i12 * f11);
                        if (f12 > f15) {
                            f4 = f12 - f15;
                            if (f4 > i11) {
                            }
                            i11 = iM27462to;
                        }
                        iM27462to = i11;
                        i11 = iM27462to;
                    } else {
                        float f16 = (f11 / 2.0f) + (iOooO00o * f11);
                        if (f12 > f16) {
                            f3 = f12 - f16;
                            if (f3 > i4) {
                            }
                            z3 = z4;
                            i5 = 1;
                            list2 = list3;
                            strM4985h4 = str;
                            f2 = f11;
                            i2 = i12 + 1;
                            f = fM56865x1;
                            i3 = i11;
                            c2 = c;
                        }
                    }
                } else if (position == 1) {
                    i4 = i10;
                    if (c14787xi.m73384dy().isPlotOrderReversed()) {
                        if (c14787xi.m73386h4() > 0) {
                            float f17 = (f11 / 2.0f) + (iOooO00o * f11);
                            if (f12 > f17) {
                                f4 = f12 - f17;
                                if (f4 > i11) {
                                }
                                i11 = iM27462to;
                            }
                            iM27462to = i11;
                            i11 = iM27462to;
                        } else {
                            float f18 = (f11 / 2.0f) + (i12 * f11);
                            if (f12 > f18) {
                                f3 = f12 - f18;
                                if (f3 > i4) {
                                }
                                z3 = z4;
                                i5 = 1;
                                list2 = list3;
                                strM4985h4 = str;
                                f2 = f11;
                                i2 = i12 + 1;
                                f = fM56865x1;
                                i3 = i11;
                                c2 = c;
                            }
                        }
                    } else if (c14787xi.m73386h4() > 0) {
                        float f19 = (f11 / 2.0f) + (i12 * f11);
                        if (f12 > f19) {
                            f4 = f12 - f19;
                            if (f4 > i11) {
                            }
                            i11 = iM27462to;
                        }
                        iM27462to = i11;
                        i11 = iM27462to;
                    } else {
                        float f20 = (f11 / 2.0f) + (iOooO00o * f11);
                        if (f12 > f20) {
                            f3 = f12 - f20;
                            if (f3 > i4) {
                            }
                            z3 = z4;
                            i5 = 1;
                            list2 = list3;
                            strM4985h4 = str;
                            f2 = f11;
                            i2 = i12 + 1;
                            f = fM56865x1;
                            i3 = i11;
                            c2 = c;
                        }
                    }
                } else if (position == 2) {
                    i4 = i10;
                    if (c14787xi.m73384dy().isPlotOrderReversed()) {
                        if (c14787xi.m73386h4() < 0) {
                            float f21 = (f11 / 2.0f) + (iOooO00o * f11);
                            if (f12 > f21) {
                                f4 = f12 - f21;
                                if (f4 > i11) {
                                }
                                i11 = iM27462to;
                            }
                            iM27462to = i11;
                            i11 = iM27462to;
                        } else {
                            float f22 = (f11 / 2.0f) + (i12 * f11);
                            if (f12 > f22) {
                                f3 = f12 - f22;
                                if (f3 > i4) {
                                }
                                z3 = z4;
                                i5 = 1;
                                list2 = list3;
                                strM4985h4 = str;
                                f2 = f11;
                                i2 = i12 + 1;
                                f = fM56865x1;
                                i3 = i11;
                                c2 = c;
                            }
                        }
                    } else if (c14787xi.m73386h4() < 0) {
                        float f23 = (f11 / 2.0f) + (i12 * f11);
                        if (f12 > f23) {
                            f4 = f12 - f23;
                            if (f4 > i11) {
                            }
                            i11 = iM27462to;
                        }
                        iM27462to = i11;
                        i11 = iM27462to;
                    } else {
                        float f24 = (f11 / 2.0f) + (iOooO00o * f11);
                        if (f12 > f24) {
                            f3 = f12 - f24;
                            if (f3 > i4) {
                            }
                            z3 = z4;
                            i5 = 1;
                            list2 = list3;
                            strM4985h4 = str;
                            f2 = f11;
                            i2 = i12 + 1;
                            f = fM56865x1;
                            i3 = i11;
                            c2 = c;
                        }
                    }
                } else if (position != 3) {
                    i4 = i10;
                } else {
                    if (!c14787xi.m73384dy().isPlotOrderReversed()) {
                        i4 = i10;
                        if (c14787xi.m73386h4() < 0) {
                            float f25 = (f11 / 2.0f) + (i12 * f11);
                            if (f12 > f25) {
                                f4 = f12 - f25;
                                if (f4 > i11) {
                                    iM27462to = C7019kk.m27462to(Float.valueOf(f4), 13);
                                }
                                i11 = iM27462to;
                            }
                            iM27462to = i11;
                            i11 = iM27462to;
                        } else {
                            float f26 = (f11 / 2.0f) + (iOooO00o * f11);
                            if (f12 > f26) {
                                f3 = f12 - f26;
                                if (f3 > i4) {
                                }
                            }
                        }
                    } else if (c14787xi.m73386h4() < 0) {
                        float f27 = (f11 / 2.0f) + (iOooO00o * f11);
                        if (f12 > f27) {
                            float f28 = f12 - f27;
                            int iM27462to3 = f28 > ((float) i11) ? C7019kk.m27462to(Float.valueOf(f28), 13) : i11;
                            i11 = iM27462to3;
                            iM27462to2 = i10;
                        }
                    } else {
                        float f29 = (f11 / 2.0f) + (i12 * f11);
                        if (f12 > f29) {
                            f3 = f12 - f29;
                            i4 = i10;
                            if (f3 > i4) {
                                iM27462to2 = C7019kk.m27462to(Float.valueOf(f3), 13);
                            }
                        } else {
                            i4 = i10;
                        }
                    }
                    z3 = z4;
                    i5 = 1;
                    list2 = list3;
                    strM4985h4 = str;
                    f2 = f11;
                    i2 = i12 + 1;
                    f = fM56865x1;
                    i3 = i11;
                    c2 = c;
                }
                iM27462to2 = i4;
                z3 = z4;
                i5 = 1;
                list2 = list3;
                strM4985h4 = str;
                f2 = f11;
                i2 = i12 + 1;
                f = fM56865x1;
                i3 = i11;
                c2 = c;
            }
        }
        z3 = zM73385fa;
        f = 0.0f;
        C12015qq c12015qq2 = new C12015qq(0.0f, 0.0f);
        if (!z2) {
        }
        if (ChartTypeCharacterizer.isSeriesUsesXValueCoordinate(c13847mr.m64945h4().getType())) {
        }
        f2 = fM73376bv;
        C12023wl c12023wl2 = new C12023wl(0, 0);
        float fM56862kk2 = 0.0f;
        i2 = 0;
        i3 = 0;
        int iM27462to22 = 0;
        while (true) {
            c = c2;
            if (i2 < list.size()) {
            }
            z3 = z4;
            i5 = 1;
            list2 = list3;
            strM4985h4 = str;
            f2 = f11;
            i2 = i12 + 1;
            f = fM56865x1;
            i3 = i11;
            c2 = c;
        }
    }

    /* JADX INFO: renamed from: k4 */
    private static float m3523k4(C12014ne c12014ne, boolean z, C13847mr c13847mr, List<Object> list, int i) {
        float fM56683x1;
        float size;
        if (ChartTypeCharacterizer.isSeriesUsesXValueCoordinate(c13847mr.m64945h4().getType())) {
            fM56683x1 = z ? c12014ne.m56683x1() : c12014ne.m56663c5();
            size = list.size();
        } else {
            fM56683x1 = z ? c12014ne.m56683x1() : c12014ne.m56663c5();
            size = i;
        }
        return fM56683x1 / size;
    }

    /* JADX INFO: renamed from: k4 */
    private static int m3524k4(C12014ne c12014ne, boolean z, C13847mr c13847mr, int i) {
        if (ChartTypeCharacterizer.isSeriesUsesXValueCoordinate(c13847mr.m64945h4().getType())) {
            return 1;
        }
        if (z) {
            float f = i;
            if (c12014ne.m56683x1() / f < 1.0f) {
                return (((float) c12014ne.m56683x1()) / f) * 10.0f < 1.0f ? 100 : 10;
            }
            return 1;
        }
        float f2 = i;
        if (c12014ne.m56663c5() / f2 < 1.0f) {
            return (((float) c12014ne.m56663c5()) / f2) * 10.0f < 1.0f ? 100 : 10;
        }
        return 1;
    }

    /* JADX INFO: renamed from: k4 */
    public static C12023wl m3525k4(List<C1210hn> list, int i, C12015qq c12015qq, C14787xi c14787xi) {
        c12015qq.m56695k4(c12015qq.m56699x1() + 4.0f);
        int i2 = 0;
        int iM56865x1 = 0;
        int iM56862kk = 0;
        while (i2 < list.size()) {
            C1210hn c1210hn = list.get_Item(i2);
            int i3 = i;
            C12023wl c12023wlClone = C0840c3.m4439k4(C13729ki.m63880k4(c1210hn.m7238x1(), c1210hn.m7228h4(), c1210hn.m7227du()), i3, c14787xi.m73400kk(), c12015qq.Clone(), 1, 1).Clone();
            if (c12023wlClone.m56865x1() > iM56865x1) {
                iM56865x1 = c12023wlClone.m56865x1();
            }
            if (c12023wlClone.m56862kk() > iM56862kk) {
                iM56862kk = c12023wlClone.m56862kk();
            }
            i2++;
            i = i3;
        }
        return new C12023wl(iM56865x1, iM56862kk);
    }

    /* JADX INFO: renamed from: k4 */
    public static C12023wl m3526k4(List<Object> list, C12014ne c12014ne, C14787xi c14787xi) {
        if (c14787xi.m73384dy() == null || c14787xi.m73384dy().getTickLabelPosition() == 3 || list.size() == 0) {
            return new C12023wl(0, 0);
        }
        C12015qq c12015qq = new C12015qq(0.0f, 0.0f);
        c12015qq.m56695k4((c12014ne.m56663c5() / list.size()) * c14787xi.m73376bv());
        c12015qq.m56700x1(c12014ne.m56683x1() * 0.5f);
        int iM56865x1 = 0;
        int iM56862kk = 0;
        for (int i = 0; i < list.size(); i++) {
            C12023wl c12023wlClone = C0840c3.m4439k4(C0841c4.m4468k4(c14787xi.f50098m9.get_Item(i), c14787xi), c14787xi.m73386h4(), c14787xi.m73400kk(), c12015qq.Clone(), 1, 1).Clone();
            if (c12023wlClone.m56865x1() > iM56865x1) {
                iM56865x1 = c12023wlClone.m56865x1();
            }
            if (c12023wlClone.m56862kk() > iM56862kk) {
                iM56862kk = c12023wlClone.m56862kk();
            }
            if (i == 0) {
                c14787xi.m73427x1((C0840c3.m4441k4("a", c14787xi.m73386h4(), c14787xi.m73400kk(), c12014ne.m56680m9().Clone(), 1, 1).Clone().m56865x1() * c14787xi.m73378ck()) / 250);
            }
        }
        c14787xi.f50094k4 = iM56865x1;
        c14787xi.f50110x1 = iM56862kk;
        return new C12023wl(iM56865x1, iM56862kk);
    }

    /* JADX INFO: renamed from: k4 */
    public static C12023wl m3527k4(C14787xi c14787xi, C12014ne c12014ne, int i, boolean z, C13847mr c13847mr) {
        if (c14787xi.m73384dy() == null || !c14787xi.m73384dy().isVisible() || c14787xi.m73384dy().getTickLabelPosition() == 3 || kc0.m63756k4(c12014ne.Clone())) {
            return new C12023wl(0, 0);
        }
        if (z && c14787xi.m73377c5()) {
            c14787xi.m73429x1(false);
        }
        return c14787xi.m73377c5() ? m3541to(c14787xi, c12014ne.Clone(), i, z, c13847mr) : (c14787xi.m73386h4() == 0 || c14787xi.m73386h4() == 90 || c14787xi.m73386h4() == -90) ? m3540kk(c14787xi, c12014ne.Clone(), i, z, c13847mr) : m3543x1(c14787xi, c12014ne.Clone(), i, z, c13847mr);
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x00d5  */
    /* JADX INFO: renamed from: k4 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static C12023wl m3528k4(C14787xi c14787xi, C13847mr c13847mr, boolean z) {
        C14365qy c14365qyM73423wy = c14787xi.m73423wy();
        if (c14787xi.m73384dy() == null || !c14787xi.m73384dy().isVisible() || c14787xi.m73384dy().getTickLabelPosition() == 3) {
            return new C12023wl(0, 0);
        }
        String strM4981du = c13847mr.m64944dy().get_Item(0).m4981du();
        List<Object> list = c14787xi.f50098m9;
        double dM73391k4 = c14787xi.m73384dy().isLogarithmic() ? c14787xi.m73391k4(c14787xi.m73418um()) : c14787xi.m73418um();
        int iM56865x1 = 0;
        int iM56862kk = 0;
        for (int i = 0; i < c14787xi.f50098m9.size(); i++) {
            Object obj = list.get_Item(i);
            Class cls = Double.TYPE;
            double dDoubleValue = ((Double) C7019kk.m27464to(obj, cls)).doubleValue();
            double dM73424x1 = c14787xi.m73384dy().isLogarithmic() ? c14787xi.m73424x1(dDoubleValue) : dDoubleValue;
            int i2 = i - 1;
            if (i2 <= 0) {
                int i3 = i + 1;
                if (i3 >= list.size() || C14116yg.m67475k4(kc0.m63750k4(dM73391k4, C14116yg.m67475k4(kc0.m63750k4(dDoubleValue, ((Double) C7019kk.m27464to(list.get_Item(i3), cls)).doubleValue())))) / 1.0E-10d <= 1.0E10d) {
                }
            } else if (C14116yg.m67475k4(kc0.m63750k4(dM73391k4, C14116yg.m67475k4(kc0.m63750k4(dDoubleValue, ((Double) C7019kk.m27464to(list.get_Item(i2), cls)).doubleValue())))) / dM73391k4 <= 1.0E10d) {
                if (ChartTypeCharacterizer.m761jd(c13847mr.m64945h4().getType())) {
                    dM73424x1 /= 100.0d;
                    strM4981du = "0%";
                }
                if (!c14787xi.m73384dy().isLogarithmic()) {
                    dM73424x1 *= m3521k4(c14787xi);
                }
                C12023wl c12023wlClone = C0840c3.m4441k4(c14787xi.m73385fa() ? C13729ki.m63880k4((Object) Double.valueOf(dM73424x1), strM4981du, false) : C0841c4.m4468k4(Double.valueOf(dM73424x1), c14787xi), c14787xi.m73386h4(), c14787xi.m73400kk(), c14365qyM73423wy.f48440k4.f5456k4.m56680m9().Clone(), 1, 1).Clone();
                if (c12023wlClone.m56865x1() > iM56865x1) {
                    iM56865x1 = c12023wlClone.m56865x1();
                }
                if (c12023wlClone.m56862kk() > iM56862kk) {
                    iM56862kk = c12023wlClone.m56862kk();
                }
            }
        }
        int iM27462to = C7019kk.m27462to(Double.valueOf(((double) (m3522k4(c14787xi.m73400kk().m56639dy()) * 2.0f)) + 0.5d), 14);
        if (z) {
            iM56862kk += iM27462to;
        } else {
            iM56865x1 += iM27462to;
        }
        c14787xi.f50094k4 = iM56865x1;
        c14787xi.f50110x1 = iM56862kk;
        return new C12023wl(iM56865x1, iM56862kk);
    }

    /* JADX INFO: renamed from: k4 */
    private static String m3529k4(C14787xi c14787xi, C13847mr c13847mr, int i, boolean z, int i2, List<C1210hn> list, List<Object> list2, String str, String[] strArr) {
        String strM4468k4;
        boolean zM7227du;
        String numberFormat;
        if (i > 0 && strArr != null) {
            return strArr[i2];
        }
        if (z) {
            if (i2 < list.size()) {
                numberFormat = list.get_Item(i2).m7228h4();
                zM7227du = list.get_Item(i2).m7227du();
            } else {
                zM7227du = false;
                numberFormat = "";
            }
            if ("".equals(numberFormat) || "General".equals(numberFormat)) {
                numberFormat = c14787xi.m73384dy().getNumberFormat();
            }
            strM4468k4 = ChartTypeCharacterizer.isSeriesUsesXValueCoordinate(c13847mr.m64945h4().getType()) ? C13729ki.m63880k4((Object) Double.valueOf(((Double) C7019kk.m27464to(list2.get_Item(i2), Double.TYPE)).doubleValue() * m3521k4(c14787xi)), str, false) : C13729ki.m63880k4(list2.get_Item(i2), numberFormat, zM7227du);
        } else {
            strM4468k4 = C0841c4.m4468k4(list2.get_Item(i2), c14787xi);
        }
        if (strArr != null) {
            strArr[i2] = strM4468k4;
        }
        return strM4468k4;
    }

    /* JADX INFO: renamed from: k4 */
    public static void m3530k4(C14365qy c14365qy, List<C13847mr>[] listArr, C12014ne c12014ne, C12023wl[] c12023wlArr, C12023wl[] c12023wlArr2, C12023wl[] c12023wlArr3, int[] iArr) {
        C12023wl.f40585k4.CloneTo(c12023wlArr[0]);
        C12023wl.f40585k4.CloneTo(c12023wlArr2[0]);
        C12023wl.f40585k4.CloneTo(c12023wlArr3[0]);
        iArr[0] = 0;
        C14787xi c14787xiM69854ne = c14365qy.m69854ne();
        C14787xi c14787xiM69863u4 = c14365qy.m69863u4();
        boolean zIsChartTypeBar = ChartTypeCharacterizer.isChartTypeBar(c14365qy.m69834fa().getType());
        C14787xi c14787xiM69868wl = c14365qy.m69868wl();
        m3526k4(c14787xiM69868wl.f50098m9, c12014ne.Clone(), c14787xiM69868wl).CloneTo(c12023wlArr3[0]);
        m3528k4(c14787xiM69863u4, listArr[0].get_Item(0), zIsChartTypeBar).CloneTo(c12023wlArr[0]);
        c14787xiM69863u4.m73396k4(c12023wlArr[0].Clone());
        m3527k4(c14787xiM69854ne, c12014ne.Clone(), C14365qy.m69819to(c14365qy.m69865up()), zIsChartTypeBar, listArr[0].get_Item(0)).CloneTo(c12023wlArr2[0]);
        c14787xiM69854ne.m73396k4(c12023wlArr2[0].Clone());
        float fM56639dy = c14787xiM69854ne.m73384dy() != null ? c14787xiM69854ne.m73400kk().m56639dy() : 0.0f;
        iArr[0] = C22201OooO0oO.OooO00o(c14787xiM69854ne.m73390jd() + C0841c4.m4453k4(fM56639dy) + C0841c4.m4486x1(fM56639dy), 0.5d, 14);
        if (c14365qy.m69861to() != null) {
            int i = iArr[0];
            iArr[0] = (c14365qy.m69861to().length * i) + i;
        }
    }

    /* JADX INFO: renamed from: k4 */
    private static void m3531k4(C14787xi c14787xi, C12014ne c12014ne, boolean z, List<Object> list, int i, C12015qq[] c12015qqArr, float f, float f2, float f3) {
        C12015qq c12015qq;
        float fM56683x1;
        float fM56683x12;
        float f4;
        int iOooO00o = C20856OooooOo.OooO00o(1, i, list);
        if (z) {
            boolean zIsPlotOrderReversed = c14787xi.m73384dy().isPlotOrderReversed();
            int iM73386h4 = c14787xi.m73386h4();
            if (zIsPlotOrderReversed) {
                if (iM73386h4 > 0) {
                    c12015qqArr[0].m56695k4(c12014ne.m56663c5() * f);
                    c12015qq = c12015qqArr[0];
                    fM56683x12 = c12014ne.m56683x1();
                    f4 = i;
                } else {
                    c12015qqArr[0].m56695k4(c12014ne.m56663c5() * f);
                    c12015qq = c12015qqArr[0];
                    fM56683x12 = c12014ne.m56683x1();
                    f4 = iOooO00o;
                }
            } else if (iM73386h4 > 0) {
                c12015qqArr[0].m56695k4(c12014ne.m56663c5() * f);
                c12015qq = c12015qqArr[0];
                fM56683x12 = c12014ne.m56683x1();
                f4 = iOooO00o;
            } else {
                c12015qqArr[0].m56695k4(c12014ne.m56663c5() * f);
                c12015qq = c12015qqArr[0];
                fM56683x12 = c12014ne.m56683x1();
                f4 = i;
            }
            fM56683x1 = (fM56683x12 - (f4 * f2)) - (f2 / 2.0f);
        } else {
            boolean zIsPlotOrderReversed2 = c14787xi.m73384dy().isPlotOrderReversed();
            int iM73386h42 = c14787xi.m73386h4();
            if (zIsPlotOrderReversed2) {
                if (iM73386h42 > 0) {
                    c12015qqArr[0].m56695k4((c12014ne.m56663c5() - (i * f2)) - (f2 / 2.0f));
                    c12015qq = c12015qqArr[0];
                } else {
                    c12015qqArr[0].m56695k4((c12014ne.m56663c5() - (iOooO00o * f2)) - (f2 / 2.0f));
                    c12015qq = c12015qqArr[0];
                }
            } else if (iM73386h42 > 0) {
                c12015qqArr[0].m56695k4((c12014ne.m56663c5() - (iOooO00o * f2)) - (f2 / 2.0f));
                c12015qq = c12015qqArr[0];
            } else {
                c12015qqArr[0].m56695k4((c12014ne.m56663c5() - (i * f2)) - (f2 / 2.0f));
                c12015qq = c12015qqArr[0];
            }
            fM56683x1 = c12014ne.m56683x1() * f3;
        }
        c12015qq.m56700x1(fM56683x1);
        if (c12015qqArr[0].m56699x1() < c12014ne.m56663c5() * f) {
            c12015qqArr[0].m56695k4(c12014ne.m56663c5() * f);
        }
        if (c12015qqArr[0].m56697kk() < c12014ne.m56683x1() * f3) {
            c12015qqArr[0].m56700x1(c12014ne.m56683x1() * f3);
        }
    }

    /* JADX INFO: renamed from: k4 */
    private static void m3532k4(C14787xi c14787xi, C12014ne c12014ne, boolean z, C12015qq c12015qq, float[] fArr, float[] fArr2) {
        List<C1210hn> listM69848kk;
        List<C1210hn>[] listArrM69830du;
        if (c14787xi.m73419up() == 0) {
            listM69848kk = c14787xi.m73423wy().m69871x1();
            listArrM69830du = c14787xi.m73423wy().m69861to();
        } else {
            listM69848kk = c14787xi.m73423wy().m69848kk();
            listArrM69830du = c14787xi.m73423wy().m69830du();
        }
        if (listArrM69830du == null || listArrM69830du.length <= 0 || listM69848kk.size() <= 0) {
            return;
        }
        c14787xi.m73388h4(1);
        int i = z ? 90 : 0;
        for (List<C1210hn> list : listArrM69830du) {
            if (z) {
                c12015qq.m56700x1(c12014ne.m56683x1() / list.size());
                c12015qq.m56695k4(c12014ne.m56663c5() * 0.5f);
            } else {
                c12015qq.m56695k4(c12014ne.m56663c5() / list.size());
                c12015qq.m56700x1(c12014ne.m56683x1() * 0.5f);
            }
            C12023wl c12023wlClone = m3525k4(list, i, c12015qq.Clone(), c14787xi).Clone();
            if (z) {
                fArr[0] = fArr[0] + c12023wlClone.m56865x1();
            } else {
                fArr2[0] = fArr2[0] + c12023wlClone.m56862kk();
            }
        }
    }

    /* JADX INFO: renamed from: k4 */
    private static void m3533k4(C14787xi c14787xi, boolean z, C13847mr c13847mr, float f, float f2, int i, int i2) {
        float f3;
        c14787xi.f50094k4 = f;
        c14787xi.f50110x1 = f2;
        if (m3537k4(c14787xi, c13847mr)) {
            if (z) {
                c14787xi.f50088du = f2 / 2.0f;
            } else {
                c14787xi.f50088du = f / 2.0f;
            }
            f3 = c14787xi.f50088du;
        } else {
            if (!C0841c4.m4492x1(c14787xi, c13847mr)) {
                return;
            }
            c14787xi.f50088du = i;
            f3 = i2;
        }
        c14787xi.f50091h4 = f3;
    }

    /* JADX INFO: renamed from: k4 */
    private static void m3534k4(C14787xi c14787xi, boolean z, C13847mr c13847mr, List<Object> list, int i, int i2, boolean z2, List<C1210hn> list2, String str, String[] strArr, C12015qq c12015qq, float[] fArr, float[] fArr2, int[] iArr, int[] iArr2) {
        C14787xi c14787xi2 = c14787xi;
        C14365qy c14365qyM73423wy = c14787xi2.m73423wy();
        C12023wl c12023wlClone = C0840c3.m4442k4("a", c14787xi2.m73400kk()).Clone();
        int iM73376bv = 0;
        while (iM73376bv < list.size()) {
            if (iM73376bv == 0 && i <= 0) {
                if (c14787xi2.m73386h4() == 0) {
                    c14787xi2.m73427x1(kc0.m63759kk(((double) (c12023wlClone.m56865x1() * c14787xi2.m73378ck())) / ((double) i2)));
                } else {
                    c14787xi2.m73427x1(0);
                }
            }
            String strM3529k4 = m3529k4(c14787xi2, c13847mr, i, z2, iM73376bv, list2, list, str, strArr);
            if (strM3529k4 == null) {
                strM3529k4 = "";
            }
            String str2 = strM3529k4;
            C12015qq c12015qq2 = new C12015qq();
            ((c14787xi.m73386h4() != 0 || z) ? C12023wl.m56853k4(C0840c3.m4439k4(str2, c14787xi.m73386h4(), c14787xi.m73400kk(), c12015qq.Clone(), 1, 1)) : C0840c3.m4436k4(str2, c14787xi.m73425x1(), c14365qyM73423wy, c12015qq.Clone(), c14787xi.m73386h4())).CloneTo(c12015qq2);
            if (c12015qq2.m56699x1() > fArr[0]) {
                fArr[0] = c12015qq2.m56699x1();
            }
            if (c12015qq2.m56697kk() > fArr2[0]) {
                fArr2[0] = c12015qq2.m56697kk();
            }
            if (iM73376bv == 0) {
                if (z) {
                    iArr[0] = C7019kk.m27462to(Float.valueOf(c12015qq2.m56697kk()), 13) / 2;
                } else {
                    iArr[0] = C7019kk.m27462to(Float.valueOf(c12015qq2.m56699x1()), 13) / 2;
                }
            }
            if (iM73376bv == list.size() - 1) {
                if (z) {
                    iArr2[0] = C7019kk.m27462to(Float.valueOf(c12015qq2.m56697kk()), 13) / 2;
                } else {
                    iArr2[0] = C7019kk.m27462to(Float.valueOf(c12015qq2.m56699x1()), 13) / 2;
                }
            }
            iM73376bv += c14787xi.m73376bv();
            c14787xi2 = c14787xi;
        }
    }

    /* JADX INFO: renamed from: k4 */
    private static boolean m3535k4(C14787xi c14787xi, C12014ne c12014ne, boolean z, C13847mr c13847mr, C12015qq[] c12015qqArr, List<Object> list, float f, float f2, int i, int i2, int i3, float[] fArr) {
        C12023wl c12023wlClone = C0840c3.m4442k4("a", c14787xi.m73400kk()).Clone();
        if (ChartTypeCharacterizer.isSeriesUsesXValueCoordinate(c13847mr.m64945h4().getType())) {
            C12015qq c12015qqClone = C0840c3.m4445kk("3", c14787xi.m73400kk()).Clone();
            if (z) {
                c12015qqArr[0].m56700x1(c12014ne.m56683x1() / list.size());
                c12015qqArr[0].m56695k4(c12014ne.m56663c5() * f);
                C12015qq c12015qq = c12015qqArr[0];
                c12015qq.m56700x1(c12015qq.m56697kk() + kc0.m63753k4(c12015qqClone.m56697kk()));
                fArr[0] = c12015qqArr[0].m56697kk();
            } else {
                c12015qqArr[0].m56695k4(c12014ne.m56663c5() / list.size());
                c12015qqArr[0].m56700x1(c12014ne.m56683x1() * f2);
                C12015qq c12015qq2 = c12015qqArr[0];
                c12015qq2.m56695k4(c12015qq2.m56699x1() + kc0.m63753k4(c12015qqClone.m56699x1()));
                fArr[0] = c12015qqArr[0].m56699x1();
            }
        } else if (z) {
            c12015qqArr[0].m56700x1((c12014ne.m56683x1() / i) * c14787xi.m73376bv());
            c12015qqArr[0].m56695k4(c12014ne.m56663c5() * f);
            if (c14787xi.m73421v4() && (C14116yg.m67482k4(c14787xi.m73386h4()) != 0 || c14787xi.m73376bv() >= i ? !(C14116yg.m67482k4(c14787xi.m73386h4()) != 90 || c12015qqArr[0].m56697kk() >= c12023wlClone.m56865x1() || c14787xi.m73376bv() >= i) : c12015qqArr[0].m56697kk() < c12023wlClone.m56862kk())) {
                c14787xi.m73388h4(c14787xi.m73376bv() + i2);
                return true;
            }
            fArr[0] = c12015qqArr[0].m56697kk();
        } else {
            if (i3 > c14787xi.m73376bv()) {
                c12015qqArr[0].m56695k4((c12014ne.m56663c5() / i) * i3);
            } else {
                c12015qqArr[0].m56695k4((c12014ne.m56663c5() / i) * c14787xi.m73376bv());
            }
            c12015qqArr[0].m56700x1(c12014ne.m56683x1() * f2);
            fArr[0] = c12015qqArr[0].m56699x1();
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x0108, code lost:
    
        r4.m73388h4(r4.m73376bv() + r12);
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0110, code lost:
    
        return true;
     */
    /* JADX INFO: renamed from: k4 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static boolean m3536k4(C14787xi c14787xi, C12014ne c12014ne, boolean z, C13847mr c13847mr, C12015qq[] c12015qqArr, List<Object> list, float f, int i, int i2, int i3) {
        C14365qy c14365qyM73423wy = c14787xi.m73423wy();
        C12023wl c12023wlClone = C0840c3.m4442k4("a", c14787xi.m73400kk()).Clone();
        if (ChartTypeCharacterizer.isSeriesUsesXValueCoordinate(c13847mr.m64945h4().getType())) {
            C12015qq c12015qqClone = C0840c3.m4445kk("3", c14787xi.m73400kk()).Clone();
            if (z) {
                c12015qqArr[0].m56700x1(c12014ne.m56683x1() / list.size());
                c12015qqArr[0].m56695k4(c12014ne.m56663c5() * f);
                C12015qq c12015qq = c12015qqArr[0];
                c12015qq.m56700x1(c12015qq.m56697kk() + kc0.m63753k4(c12015qqClone.m56697kk()));
            } else {
                c12015qqArr[0].m56695k4(c12014ne.m56663c5() / list.size());
                c12015qqArr[0].m56700x1(c12014ne.m56683x1() * f);
                C12015qq c12015qq2 = c12015qqArr[0];
                c12015qq2.m56695k4(c12015qq2.m56699x1() + kc0.m63753k4(c12015qqClone.m56699x1()));
            }
        } else if (z) {
            c12015qqArr[0].m56700x1((c12014ne.m56683x1() / i) * c14787xi.m73376bv());
            if (((ChartPlotArea) C7019kk.m27452k4((Object) c14365qyM73423wy.m69834fa().getPlotArea(), ChartPlotArea.class)).isLocationAutocalculated() || !c14787xi.m73423wy().m69856qq()) {
                c12015qqArr[0].m56695k4(c12014ne.m56663c5() * f);
            } else {
                c12015qqArr[0].m56695k4(c14787xi.m73423wy().m69867v4());
            }
            if (c14787xi.m73421v4()) {
                if (C14116yg.m67482k4(c14787xi.m73386h4()) == 0) {
                }
            }
        } else {
            if (i3 > c14787xi.m73376bv()) {
                c12015qqArr[0].m56695k4((c12014ne.m56663c5() / i) * i3);
            } else {
                c12015qqArr[0].m56695k4((c12014ne.m56663c5() / i) * c14787xi.m73376bv());
            }
            c12015qqArr[0].m56700x1(c12014ne.m56683x1() * f);
            if (c14787xi.m73421v4()) {
                if (C14116yg.m67482k4(c14787xi.m73386h4()) == 0) {
                }
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: k4 */
    public static boolean m3537k4(C14787xi c14787xi, C13847mr c13847mr) {
        if (c14787xi.m73384dy() == null || !c14787xi.m73384dy().isVisible() || c14787xi.m73384dy().getTickLabelPosition() == 3) {
            return false;
        }
        if (c14787xi.m73419up() == 2 || c14787xi.m73419up() == 3 || ChartTypeCharacterizer.isChartTypeScatter(c13847mr.m64945h4().getType()) || ChartTypeCharacterizer.isChartTypeBubble(c13847mr.m64945h4().getType())) {
            return true;
        }
        return !c14787xi.m73375b3() && c14787xi.m73386h4() == 0 && ChartTypeCharacterizer.isChartTypeRadar(c13847mr.m64945h4().getType());
    }

    /* JADX INFO: renamed from: k4 */
    private static boolean m3538k4(C14787xi c14787xi, boolean z, float f, C12023wl c12023wl, float f2, float f3, boolean z2) {
        if (!z) {
            int iM73386h4 = c14787xi.m73386h4();
            if (z2) {
                if (iM73386h4 == 90) {
                    return false;
                }
                c14787xi.m73394k4(90);
                return true;
            }
            if (iM73386h4 == 0) {
                c14787xi.m73394k4(45);
                return true;
            }
            if (iM73386h4 != 45) {
                return false;
            }
            c14787xi.m73394k4(90);
            return true;
        }
        if (c14787xi.m73386h4() == 0 && f > c12023wl.m56862kk() * 1.5f) {
            c14787xi.m73394k4(45);
            return true;
        }
        if (c14787xi.m73386h4() != 45) {
            return false;
        }
        double dM67482k4 = (((double) C14116yg.m67482k4(c14787xi.m73386h4())) / 180.0d) * 3.141592653589793d;
        if ((C14116yg.m67495m9(dM67482k4) * ((double) c12023wl.m56862kk())) + (C14116yg.m67470dy(dM67482k4) * ((double) f2)) <= f3) {
            return false;
        }
        c14787xi.m73394k4(90);
        return true;
    }

    /* JADX INFO: renamed from: k4 */
    private static boolean m3539k4(C14787xi c14787xi, boolean z, float f, float[] fArr, float f2, C12015qq c12015qq, int i, int i2, float[] fArr2, float[] fArr3, boolean[] zArr) {
        if (z) {
            if (!(f == fArr[0] && f2 == fArr2[0] && fArr3[0] == c12015qq.m56697kk()) && f2 > c12015qq.m56697kk() - 5.0f && c14787xi.m73376bv() < i) {
                fArr[0] = f;
                fArr2[0] = f2;
                fArr3[0] = c12015qq.m56697kk();
                c14787xi.m73388h4(c14787xi.m73376bv() + i2);
                return true;
            }
            if (c14787xi.m73376bv() > 1) {
                c14787xi.m73388h4(c14787xi.m73376bv() - i2);
                if (c14787xi.m73376bv() < 1) {
                    c14787xi.m73388h4(1);
                }
                zArr[0] = true;
                return true;
            }
            return false;
        }
        if (!(f == fArr[0] && f2 == fArr2[0] && fArr3[0] == c12015qq.m56699x1()) && f > c12015qq.m56699x1() - 5.0f && c14787xi.m73376bv() < i) {
            fArr[0] = f;
            fArr2[0] = f2;
            fArr3[0] = c12015qq.m56699x1();
            c14787xi.m73388h4(c14787xi.m73376bv() + i2);
            return true;
        }
        if (c14787xi.m73376bv() > 1) {
            c14787xi.m73388h4(c14787xi.m73376bv() - i2);
            if (c14787xi.m73376bv() < 1) {
                c14787xi.m73388h4(1);
            }
            zArr[0] = true;
            return true;
        }
        return false;
    }
}
