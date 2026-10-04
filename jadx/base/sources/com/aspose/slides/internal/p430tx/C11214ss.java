package com.aspose.slides.internal.p430tx;

import com.aspose.slides.Collections.ArrayList;
import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.exceptions.FormatException;
import com.aspose.slides.exceptions.OverflowException;
import com.aspose.slides.exceptions.XsltException;
import com.aspose.slides.internal.p243l6.C6005k4;
import com.aspose.slides.internal.p267m6.C6321k4;
import com.aspose.slides.internal.p267m6.C6323to;
import com.aspose.slides.internal.p294n9.C6765kp;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.internal.p418tf.AbstractC10925du;
import com.aspose.slides.internal.p418tf.AbstractC10929m9;
import com.aspose.slides.internal.p463vm.C11683c5;
import com.aspose.slides.internal.p463vm.C11697x1;
import com.aspose.slides.p559ms.System.AbstractC14068j5;
import com.aspose.slides.p559ms.System.C14044b3;
import com.aspose.slides.p559ms.System.C14067j2;
import com.aspose.slides.p559ms.System.C14080ne;
import com.aspose.slides.p559ms.System.C14113y2;
import com.aspose.slides.p559ms.System.C14116yg;
import com.aspose.slides.p559ms.System.InterfaceC14073kp;
import com.aspose.slides.p559ms.System.Xml.C13850af;
import com.aspose.slides.p559ms.System.Xml.C13851ai;
import com.aspose.words.EditingLanguage;
import com.google.firebase.analytics.FirebaseAnalytics;

/* JADX INFO: renamed from: com.aspose.slides.internal.tx.ss */
/* JADX INFO: loaded from: classes4.dex */
public class C11214ss extends C11232x6 {

    /* JADX INFO: renamed from: k4 */
    private static k4 f38668k4 = new k4(false, "0");

    /* JADX INFO: renamed from: to */
    private static k4 f38669to = new k4(true, ".");

    /* JADX INFO: renamed from: du */
    private String f38672du;

    /* JADX INFO: renamed from: dy */
    private String f38673dy;

    /* JADX INFO: renamed from: fa */
    private C11204m9 f38674fa;

    /* JADX INFO: renamed from: h4 */
    private String f38675h4;

    /* JADX INFO: renamed from: ix */
    private String f38676ix;

    /* JADX INFO: renamed from: jd */
    private String f38677jd;

    /* JADX INFO: renamed from: ks */
    private C11204m9 f38678ks;

    /* JADX INFO: renamed from: ne */
    private String f38680ne;

    /* JADX INFO: renamed from: rv */
    private C11204m9 f38681rv;

    /* JADX INFO: renamed from: u4 */
    private String f38682u4;

    /* JADX INFO: renamed from: up */
    private C11204m9 f38683up;

    /* JADX INFO: renamed from: uz */
    private String f38684uz;

    /* JADX INFO: renamed from: wl */
    private boolean f38685wl;

    /* JADX INFO: renamed from: x6 */
    private List<k4> f38686x6;

    /* JADX INFO: renamed from: yj */
    private C11204m9 f38687yj;

    /* JADX INFO: renamed from: m9 */
    private int f38679m9 = -1;

    /* JADX INFO: renamed from: c5 */
    private int f38670c5 = -1;

    /* JADX INFO: renamed from: ck */
    private int f38671ck = -1;

    /* JADX INFO: renamed from: com.aspose.slides.internal.tx.ss$k4 */
    public static class k4 {

        /* JADX INFO: renamed from: k4 */
        public boolean f38688k4;

        /* JADX INFO: renamed from: kk */
        public int f38689kk;

        /* JADX INFO: renamed from: to */
        public String f38690to;

        /* JADX INFO: renamed from: x1 */
        public int f38691x1;

        public k4() {
        }

        public k4(boolean z, String str) {
            this.f38688k4 = z;
            this.f38690to = str;
        }
    }

    /* JADX INFO: renamed from: com.aspose.slides.internal.tx.ss$x1 */
    public static class x1 extends C6323to {

        /* JADX INFO: renamed from: k4 */
        private int f38692k4;

        /* JADX INFO: renamed from: kk */
        private String f38693kk;

        /* JADX INFO: renamed from: to */
        private int f38694to;

        /* JADX INFO: renamed from: x1 */
        private int f38695x1;

        /* JADX INFO: renamed from: k4 */
        private static String m54009k4(double d, int i, int i2, String str) {
            String strM66946k4;
            if (i2 == 0 || str == null) {
                strM66946k4 = C14080ne.m66946k4(Double.valueOf(d), (InterfaceC14073kp) C11697x1.m55250kk());
            } else {
                C11683c5 c11683c5 = new C11683c5();
                c11683c5.m55055k4(new int[]{i2});
                c11683c5.m55048h4(str);
                if (C14116yg.m67490kk(d) == d) {
                    c11683c5.m55075x1(0);
                }
                strM66946k4 = C14044b3.m66434k4(d, "N", c11683c5);
            }
            if (strM66946k4.length() >= i) {
                return strM66946k4;
            }
            C6765kp c6765kp = new C6765kp(i);
            c6765kp.m26783k4('0', i - strM66946k4.length());
            c6765kp.m26792k4(strM66946k4);
            return c6765kp.toString();
        }

        /* JADX INFO: renamed from: kk */
        public final void m54013kk(int i) {
            if (i < 0 || i > 9) {
                return;
            }
            this.f38694to = i;
        }

        /* JADX INFO: renamed from: x1 */
        public final void m54014x1(int i) {
            this.f38695x1 = i;
        }

        /* JADX INFO: renamed from: k4 */
        public final String m54010k4(Object obj) {
            double dM65135x1;
            if (C7019kk.m27469x1(obj, Integer.class)) {
                dM65135x1 = ((Integer) obj).intValue();
            } else {
                double dM65076k4 = C13850af.m65076k4(obj);
                if (0.5d > dM65076k4 || C14044b3.m66424du(dM65076k4)) {
                    return C13850af.m65148x1(obj);
                }
                dM65135x1 = C13850af.m65135x1(dM65076k4);
            }
            int i = this.f38692k4;
            if (i == 6 || i == 7) {
                if (dM65135x1 <= 2.147483647E9d) {
                    C6765kp c6765kp = new C6765kp();
                    C6323to.m25889k4(c6765kp, dM65135x1, this.f38692k4 == 6 ? 'A' : 'a', 26);
                    return c6765kp.toString();
                }
            } else if ((i == 20 || i == 21) && dM65135x1 <= 32767.0d) {
                C6765kp c6765kp2 = new C6765kp();
                C6323to.m25890k4(c6765kp2, dM65135x1, this.f38692k4 == 20);
                return c6765kp2.toString();
            }
            return m54009k4(dM65135x1, this.f38695x1, this.f38694to, this.f38693kk);
        }

        /* JADX INFO: renamed from: k4 */
        public final void m54011k4(int i) {
            this.f38692k4 = i;
        }

        /* JADX INFO: renamed from: k4 */
        public final void m54012k4(String str) {
            this.f38693kk = str;
        }
    }

    /* JADX INFO: renamed from: k4 */
    private static List<k4> m53998k4(String str) {
        if (str == null || str.length() == 0) {
            return null;
        }
        boolean zM25885k4 = C6321k4.m25885k4(str.charAt(0));
        List<k4> list = new List<>();
        if (zM25885k4) {
            list.addItem(null);
        }
        int i = 0;
        int i2 = 0;
        while (i <= str.length()) {
            boolean zM25885k42 = i < str.length() ? C6321k4.m25885k4(str.charAt(i)) : !zM25885k4;
            if (zM25885k4 != zM25885k42) {
                k4 k4Var = new k4();
                if (zM25885k4) {
                    int[] iArr = {k4Var.f38691x1};
                    int[] iArr2 = {k4Var.f38689kk};
                    m54001k4(str, i2, i - i2, iArr, iArr2);
                    k4Var.f38691x1 = iArr[0];
                    k4Var.f38689kk = iArr2[0];
                } else {
                    k4Var.f38688k4 = true;
                    k4Var.f38690to = C14113y2.m67443x1(str, i2, i - i2);
                }
                list.addItem(k4Var);
                i2 = i;
                i++;
                zM25885k4 = zM25885k42;
            } else {
                i++;
            }
        }
        return list;
    }

    /* JADX INFO: renamed from: x1 */
    private int m54005x1(int i) {
        if (i == 5 || i == 6) {
            return 4;
        }
        return i;
    }

    @Override // com.aspose.slides.internal.p430tx.AbstractC11200ks
    /* JADX INFO: renamed from: kk */
    public boolean mo53670kk(C11212rv c11212rv) {
        String strM53753yj = c11212rv.m53964to().m53753yj();
        String strM53752x6 = c11212rv.m53964to().m53752x6();
        if (C13851ai.m65152k4(strM53753yj, c11212rv.m53931k4().f15111j2)) {
            if (!"any".equals(strM53752x6) && !"multiple".equals(strM53752x6) && !"single".equals(strM53752x6)) {
                throw XsltException.create("'{1}' is an invalid value for the '{0}' attribute.", FirebaseAnalytics.Param.LEVEL, strM53752x6);
            }
            this.f38672du = strM53752x6;
        } else if (C13851ai.m65152k4(strM53753yj, c11212rv.m53931k4().f15173x6)) {
            this.f38675h4 = strM53752x6;
            this.f38679m9 = c11212rv.m53929k4(strM53752x6, true, true, true);
        } else if (C13851ai.m65152k4(strM53753yj, c11212rv.m53931k4().f15095e0)) {
            this.f38673dy = strM53752x6;
            this.f38670c5 = c11212rv.m53929k4(strM53752x6, true, true, true);
        } else if (C13851ai.m65152k4(strM53753yj, c11212rv.m53931k4().f15123ly)) {
            this.f38677jd = strM53752x6;
            this.f38671ck = c11212rv.m53987yj(strM53752x6);
        } else if (C13851ai.m65152k4(strM53753yj, c11212rv.m53931k4().f15153ts)) {
            this.f38674fa = C11204m9.m53858k4(c11212rv, strM53752x6);
        } else if (C13851ai.m65152k4(strM53753yj, c11212rv.m53931k4().f15161vh)) {
            this.f38683up = C11204m9.m53858k4(c11212rv, strM53752x6);
        } else if (C13851ai.m65152k4(strM53753yj, c11212rv.m53931k4().f15152tq)) {
            this.f38687yj = C11204m9.m53858k4(c11212rv, strM53752x6);
        } else if (C13851ai.m65152k4(strM53753yj, c11212rv.m53931k4().f15138qm)) {
            this.f38678ks = C11204m9.m53858k4(c11212rv, strM53752x6);
        } else {
            if (!C13851ai.m65152k4(strM53753yj, c11212rv.m53931k4().f15102g8)) {
                return false;
            }
            this.f38681rv = C11204m9.m53858k4(c11212rv, strM53752x6);
        }
        return true;
    }

    /* JADX INFO: renamed from: k4 */
    private static Object m53999k4(Object obj) {
        if (AbstractC14068j5.m66733to(C14067j2.m66727k4(obj)) != 1) {
            return obj;
        }
        AbstractC10929m9 abstractC10929m9 = (AbstractC10929m9) C7019kk.m27452k4(obj, AbstractC10929m9.class);
        if (abstractC10929m9 != null) {
            return abstractC10929m9.mo21770x1() ? abstractC10929m9.mo21834kk().mo21843dy() : C14113y2.f47374k4;
        }
        AbstractC10925du abstractC10925du = (AbstractC10925du) C7019kk.m27452k4(obj, AbstractC10925du.class);
        return abstractC10925du != null ? abstractC10925du.mo21843dy() : obj;
    }

    /* JADX INFO: renamed from: x1 */
    private int m54006x1(AbstractC10925du abstractC10925du, C11234xw c11234xw, AbstractC10925du abstractC10925du2) {
        AbstractC10925du abstractC10925duDeepClone = abstractC10925du.deepClone();
        int i = 1;
        if (abstractC10925duDeepClone.mo21864ne()) {
            abstractC10925duDeepClone.mo21878x6();
            while (true) {
                if (abstractC10925duDeepClone.mo21876x1(abstractC10925du)) {
                    break;
                }
                if (m54004k4(c11234xw, abstractC10925du2, abstractC10925duDeepClone)) {
                    i++;
                }
                if (!abstractC10925duDeepClone.mo21865rv()) {
                    C6005k4.m24259k4("We implementing preceding-sibling::node() and some how miss context node 'nav'");
                    break;
                }
            }
        }
        return i;
    }

    /* JADX INFO: renamed from: k4 */
    private static String m54000k4(ArrayList arrayList, List<k4> list, String str, String str2, String str3, String str4) {
        k4 k4Var;
        C6765kp c6765kp = new C6765kp();
        int size = list != null ? list.size() : 0;
        x1 x1Var = new x1();
        if (str4 != null) {
            try {
                x1Var.m54013kk(C14080ne.m67001m9(str4, (InterfaceC14073kp) C11697x1.m55250kk()));
            } catch (FormatException | OverflowException unused) {
            }
        }
        if (str3 != null) {
            x1Var.m54012k4(str3);
        }
        if (size > 0) {
            k4 k4Var2 = list.get_Item(0);
            if (size % 2 == 1) {
                k4Var = list.get_Item(size - 1);
                size--;
            } else {
                k4Var = null;
            }
            k4 k4Var3 = 2 < size ? list.get_Item(size - 2) : f38669to;
            k4 k4Var4 = size > 0 ? list.get_Item(size - 1) : f38668k4;
            if (k4Var2 != null) {
                c6765kp.m26792k4(k4Var2.f38690to);
            }
            int size2 = arrayList.size();
            for (int i = 0; i < size2; i++) {
                int i2 = i * 2;
                boolean z = i2 < size;
                if (i > 0) {
                    c6765kp.m26792k4((z ? list.get_Item(i2) : k4Var3).f38690to);
                }
                k4 k4Var5 = z ? list.get_Item(i2 + 1) : k4Var4;
                x1Var.m54011k4(k4Var5.f38691x1);
                x1Var.m54014x1(k4Var5.f38689kk);
                c6765kp.m26792k4(x1Var.m54010k4(arrayList.get_Item(i)));
            }
            if (k4Var != null) {
                c6765kp.m26792k4(k4Var.f38690to);
            }
        } else {
            x1Var.m54011k4(0);
            for (int i3 = 0; i3 < arrayList.size(); i3++) {
                if (i3 != 0) {
                    c6765kp.m26792k4(".");
                }
                c6765kp.m26792k4(x1Var.m54010k4(arrayList.get_Item(i3)));
            }
        }
        return c6765kp.toString();
    }

    /* JADX INFO: renamed from: x1 */
    private int m54007x1(C11234xw c11234xw, C11231x1 c11231x1) {
        boolean z;
        AbstractC10925du abstractC10925duM54088du = c11231x1.m54088du();
        if (abstractC10925duM54088du.mo21857kk() == 2 || abstractC10925duM54088du.mo21857kk() == 3) {
            abstractC10925duM54088du = abstractC10925duM54088du.deepClone();
            abstractC10925duM54088du.mo21864ne();
        }
        AbstractC10925du abstractC10925duDeepClone = abstractC10925duM54088du.deepClone();
        int i = 0;
        if (this.f38670c5 == -1) {
            abstractC10925duDeepClone.mo21848ix();
            AbstractC10929m9 abstractC10929m9Mo21852k4 = abstractC10925duDeepClone.mo21852k4(9, true);
            while (abstractC10929m9Mo21852k4.mo21770x1()) {
                if (m54004k4(c11234xw, c11231x1.m54088du(), abstractC10929m9Mo21852k4.mo21834kk())) {
                    i++;
                }
                if (abstractC10929m9Mo21852k4.mo21834kk().mo21876x1(abstractC10925duM54088du)) {
                    break;
                }
            }
            return i;
        }
        while (true) {
            if (c11234xw.m54190k4(abstractC10925duDeepClone, this.f38670c5)) {
                z = true;
                break;
            }
            if (!abstractC10925duDeepClone.mo21864ne()) {
                z = false;
                break;
            }
        }
        AbstractC10929m9 abstractC10929m9Mo21852k42 = abstractC10925duDeepClone.mo21852k4(9, true);
        int i2 = 0;
        while (abstractC10929m9Mo21852k42.mo21770x1()) {
            if (c11234xw.m54190k4(abstractC10929m9Mo21852k42.mo21834kk(), this.f38670c5)) {
                z = true;
                i2 = 0;
            } else if (m54004k4(c11234xw, c11231x1.m54088du(), abstractC10929m9Mo21852k42.mo21834kk())) {
                i2++;
            }
            if (abstractC10929m9Mo21852k42.mo21834kk().mo21876x1(abstractC10925duM54088du)) {
                break;
            }
        }
        if (z) {
            return i2;
        }
        return 0;
    }

    /* JADX INFO: renamed from: x1 */
    private String m54008x1(String str) {
        if (str == null || "traditional".equals(str) || "alphabetic".equals(str)) {
            return str;
        }
        if (this.f38685wl) {
            return null;
        }
        throw XsltException.create("'{1}' is an invalid value for the '{0}' attribute.", "letter-value", str);
    }

    /* JADX WARN: Removed duplicated region for block: B:38:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00a8  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00ab  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00b3  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00b6  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00c2  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00c5  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00cd  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00d0  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00e5  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00e9  */
    @Override // com.aspose.slides.internal.p430tx.C11232x6, com.aspose.slides.internal.p430tx.AbstractC11197k4
    /* JADX INFO: renamed from: k4 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void mo53668k4(C11234xw c11234xw, C11231x1 c11231x1) {
        Object objValueOf;
        ArrayList arrayListM54162ck = c11234xw.m54162ck();
        int iM54107kk = c11231x1.m54107kk();
        if (iM54107kk != 0) {
            if (iM54107kk != 2) {
                C6005k4.m24259k4("Invalid Number Action execution state");
                return;
            } else if (c11234xw.m54197kk(c11231x1.m54113x1())) {
                c11231x1.m54091jd();
                return;
            } else {
                c11231x1.m54094k4(2);
                return;
            }
        }
        arrayListM54162ck.clear();
        int i = this.f38671ck;
        if (i == -1) {
            if ("any".equals(this.f38672du)) {
                int iM54007x1 = m54007x1(c11234xw, c11231x1);
                if (iM54007x1 != 0) {
                    objValueOf = Integer.valueOf(iM54007x1);
                }
            } else {
                boolean zEquals = "multiple".equals(this.f38672du);
                AbstractC10925du abstractC10925duM54088du = c11231x1.m54088du();
                AbstractC10925du abstractC10925duDeepClone = c11231x1.m54088du().deepClone();
                if (abstractC10925duDeepClone.mo21857kk() == 2 || abstractC10925duDeepClone.mo21857kk() == 3) {
                    abstractC10925duDeepClone.mo21864ne();
                }
                while (m54002k4(abstractC10925duDeepClone, c11234xw, abstractC10925duM54088du)) {
                    arrayListM54162ck.insertItem(0, Integer.valueOf(m54006x1(abstractC10925duDeepClone, c11234xw, abstractC10925duM54088du)));
                    if (!zEquals || !abstractC10925duDeepClone.mo21864ne()) {
                        break;
                    }
                }
                if (!m54003k4(c11234xw, abstractC10925duDeepClone)) {
                    arrayListM54162ck.clear();
                }
            }
            C11204m9 c11204m9 = this.f38674fa;
            List<k4> listM53998k4 = c11204m9 != null ? this.f38686x6 : m53998k4(c11204m9.m53859k4(c11234xw, c11231x1));
            C11204m9 c11204m92 = this.f38683up;
            String strM53859k4 = c11204m92 != null ? this.f38680ne : c11204m92.m53859k4(c11234xw, c11231x1);
            C11204m9 c11204m93 = this.f38687yj;
            String strM54008x1 = c11204m93 != null ? this.f38676ix : m54008x1(c11204m93.m53859k4(c11234xw, c11231x1));
            C11204m9 c11204m94 = this.f38678ks;
            String strM53859k42 = c11204m94 != null ? this.f38682u4 : c11204m94.m53859k4(c11234xw, c11231x1);
            C11204m9 c11204m95 = this.f38681rv;
            c11231x1.m54105k4(m54000k4(arrayListM54162ck, listM53998k4, strM53859k4, strM54008x1, strM53859k42, c11204m95 != null ? this.f38684uz : c11204m95.m53859k4(c11234xw, c11231x1)));
            if (c11234xw.m54197kk(c11231x1.m54113x1())) {
                c11231x1.m54094k4(2);
                return;
            } else {
                c11231x1.m54091jd();
                return;
            }
        }
        objValueOf = m53999k4(c11234xw.m54206x1(c11231x1, i));
        arrayListM54162ck.addItem(objValueOf);
        C11204m9 c11204m96 = this.f38674fa;
        if (c11204m96 != null) {
        }
        C11204m9 c11204m922 = this.f38683up;
        if (c11204m922 != null) {
        }
        C11204m9 c11204m932 = this.f38687yj;
        if (c11204m932 != null) {
        }
        C11204m9 c11204m942 = this.f38678ks;
        if (c11204m942 != null) {
        }
        C11204m9 c11204m952 = this.f38681rv;
        c11231x1.m54105k4(m54000k4(arrayListM54162ck, listM53998k4, strM53859k4, strM54008x1, strM53859k42, c11204m952 != null ? this.f38684uz : c11204m952.m53859k4(c11234xw, c11231x1)));
        if (c11234xw.m54197kk(c11231x1.m54113x1())) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0021 A[PHI: r6 r7
      0x0021: PHI (r6v7 int) = (r6v2 int), (r6v0 int) binds: [B:18:0x0039, B:11:0x001f] A[DONT_GENERATE, DONT_INLINE]
      0x0021: PHI (r7v4 int) = (r7v2 int), (r7v0 int) binds: [B:18:0x0039, B:11:0x001f] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX INFO: renamed from: k4 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void m54001k4(String str, int i, int i2, int[] iArr, int[] iArr2) {
        boolean z;
        char cCharAt = str.charAt(i);
        iArr2[0] = 1;
        iArr[0] = -1;
        if (cCharAt == '0' || cCharAt == 2406 || cCharAt == 3664 || cCharAt == 51067 || cCharAt == 65296) {
            do {
                iArr2[0] = iArr2[0] + 1;
                i2--;
                if (i2 <= 0) {
                    break;
                } else {
                    i++;
                }
            } while (cCharAt == str.charAt(i));
            z = str.charAt(i) != ((char) (cCharAt + 1));
        }
        if (!z) {
            switch (str.charAt(i)) {
                case '1':
                    iArr[0] = 0;
                    break;
                case 'A':
                    iArr[0] = 6;
                    break;
                case 'I':
                    iArr[0] = 20;
                    break;
                case 'a':
                    iArr[0] = 7;
                    break;
                case 'i':
                    iArr[0] = 21;
                    break;
                case EditingLanguage.ITALIAN_ITALY /* 1040 */:
                    iArr[0] = 8;
                    break;
                case EditingLanguage.SUTU /* 1072 */:
                    iArr[0] = 9;
                    break;
                case 1488:
                    iArr[0] = 22;
                    break;
                case 1571:
                    iArr[0] = 19;
                    break;
                case 2309:
                    iArr[0] = 12;
                    break;
                case 2325:
                    iArr[0] = 11;
                    break;
                case 2407:
                    iArr[0] = 2;
                    break;
                case 3585:
                    iArr[0] = 10;
                    break;
                case 3665:
                    iArr[0] = 3;
                    break;
                case 12450:
                    iArr[0] = 14;
                    break;
                case 12452:
                    iArr[0] = 16;
                    break;
                case 12593:
                    iArr[0] = 17;
                    break;
                case 19968:
                    iArr[0] = 4;
                    break;
                case 22769:
                    iArr[0] = 23;
                    break;
                case 22777:
                    iArr[0] = 24;
                    break;
                case 23376:
                    iArr[0] = 27;
                    break;
                case 30002:
                    if (i2 > 1 && str.charAt(i + 1) == 23376) {
                        iArr[0] = 28;
                    } else {
                        iArr[0] = 26;
                    }
                    break;
                case 44032:
                    iArr[0] = 18;
                    break;
                case 51068:
                    iArr[0] = 5;
                    break;
                case 54616:
                    iArr[0] = 25;
                    break;
                case 65297:
                    iArr[0] = 1;
                    break;
                case 65393:
                    iArr[0] = 13;
                    break;
                case 65394:
                    iArr[0] = 15;
                    break;
                default:
                    iArr[0] = 0;
                    break;
            }
        }
        if (z) {
            iArr[0] = 0;
            iArr2[0] = 0;
        }
    }

    @Override // com.aspose.slides.internal.p430tx.C11232x6
    /* JADX INFO: renamed from: x1 */
    public void mo53671x1(C11212rv c11212rv) {
        m53853to(c11212rv);
        m53850du(c11212rv);
        this.f38685wl = c11212rv.m53919fa();
        C11204m9[] c11204m9Arr = {this.f38674fa};
        this.f38686x6 = m53998k4(AbstractC11200ks.m53849k4(c11204m9Arr));
        this.f38674fa = c11204m9Arr[0];
        C11204m9[] c11204m9Arr2 = {this.f38687yj};
        this.f38676ix = m54008x1(AbstractC11200ks.m53849k4(c11204m9Arr2));
        this.f38687yj = c11204m9Arr2[0];
        C11204m9[] c11204m9Arr3 = {this.f38683up};
        this.f38680ne = AbstractC11200ks.m53849k4(c11204m9Arr3);
        this.f38683up = c11204m9Arr3[0];
        C11204m9[] c11204m9Arr4 = {this.f38678ks};
        String strM53849k4 = AbstractC11200ks.m53849k4(c11204m9Arr4);
        this.f38682u4 = strM53849k4;
        this.f38678ks = c11204m9Arr4[0];
        if (strM53849k4 != null && strM53849k4.length() > 1) {
            throw XsltException.create("The value of the '{0}' attribute must be a single character.", "grouping-separator");
        }
        C11204m9[] c11204m9Arr5 = {this.f38681rv};
        this.f38684uz = AbstractC11200ks.m53849k4(c11204m9Arr5);
        this.f38681rv = c11204m9Arr5[0];
    }

    /* JADX INFO: renamed from: k4 */
    private boolean m54002k4(AbstractC10925du abstractC10925du, C11234xw c11234xw, AbstractC10925du abstractC10925du2) {
        do {
            int i = this.f38670c5;
            if (i != -1 && c11234xw.m54190k4(abstractC10925du, i)) {
                return false;
            }
            if (m54004k4(c11234xw, abstractC10925du2, abstractC10925du)) {
                return true;
            }
        } while (abstractC10925du.mo21864ne());
        return false;
    }

    /* JADX INFO: renamed from: k4 */
    private boolean m54003k4(C11234xw c11234xw, AbstractC10925du abstractC10925du) {
        if (this.f38670c5 == -1) {
            return true;
        }
        while (!c11234xw.m54190k4(abstractC10925du, this.f38670c5)) {
            if (!abstractC10925du.mo21864ne()) {
                return false;
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: k4 */
    private boolean m54004k4(C11234xw c11234xw, AbstractC10925du abstractC10925du, AbstractC10925du abstractC10925du2) {
        int i = this.f38679m9;
        return i != -1 ? c11234xw.m54190k4(abstractC10925du2, i) : C14113y2.m67363du(abstractC10925du.mo21846h4(), abstractC10925du2.mo21846h4()) && m54005x1(abstractC10925du.mo21857kk()) == m54005x1(abstractC10925du2.mo21857kk());
    }
}
