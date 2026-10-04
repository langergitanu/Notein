package com.aspose.slides;

import android.content.Intent;
import android.content.pm.PackageManager;
import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.internal.p314oc.AbstractC7020m9;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.internal.p463vm.C11697x1;
import com.aspose.slides.internal.p472w8.C11896dy;
import com.aspose.slides.internal.p475wh.AbstractC12002ck;
import com.aspose.slides.internal.p475wh.AbstractC12008jd;
import com.aspose.slides.internal.p475wh.C12003du;
import com.aspose.slides.internal.p475wh.C12007ix;
import com.aspose.slides.internal.p475wh.C12009k4;
import com.aspose.slides.internal.p475wh.C12013m9;
import com.aspose.slides.internal.p475wh.C12014ne;
import com.aspose.slides.internal.p475wh.C12015qq;
import com.aspose.slides.internal.p475wh.C12016rv;
import com.aspose.slides.internal.p475wh.C12023wl;
import com.aspose.slides.internal.p475wh.C12025x6;
import com.aspose.slides.p559ms.System.C14042ak;
import com.aspose.slides.p559ms.System.C14057f9;
import com.aspose.slides.p559ms.System.C14064he;
import com.aspose.slides.p559ms.System.C14067j2;
import com.aspose.slides.p559ms.System.C14080ne;
import com.aspose.slides.p559ms.System.C14113y2;
import com.aspose.slides.p559ms.System.C14116yg;
import com.aspose.slides.p559ms.System.InterfaceC14073kp;

/* JADX INFO: loaded from: classes3.dex */
class gfh extends AbstractC7020m9<gfh> {
    /* JADX INFO: renamed from: k4 */
    private static List<s8k> m6607k4(int i, boolean z, List<s8k> list) {
        List<s8k> list2 = new List<>();
        for (int i2 = 0; i2 < list.size(); i2++) {
            s8k s8kVar = list.get_Item(i2);
            if (s8kVar.m70489x1() == i && s8kVar.m70488to().m64945h4().getPlotOnSecondAxis() == z) {
                list2.addItem(s8kVar);
            }
        }
        return list2;
    }

    /* JADX INFO: renamed from: kk */
    public static C12015qq m6625kk(C13847mr c13847mr, C14365qy c14365qy) {
        C12015qq c12015qqClone = m6610k4(c13847mr, c14365qy).Clone();
        return new C12015qq(c12015qqClone.m56697kk() * 0.4f, c12015qqClone.m56697kk());
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x003e  */
    /* JADX WARN: Type inference failed for: r1v2, types: [float, java.lang.String] */
    /* JADX WARN: Type inference failed for: r7v1, types: [float, java.lang.String] */
    /* JADX WARN: Type inference failed for: r7v2, types: [android.content.pm.PackageInfo, int] */
    /* JADX WARN: Type inference failed for: r8v0, types: [float, int] */
    /* JADX WARN: Type inference failed for: r9v1, types: [float, int] */
    /* JADX WARN: Type inference failed for: r9v2, types: [android.content.pm.PackageInfo, int] */
    /* JADX INFO: renamed from: to */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void m6627to(C14365qy c14365qy) {
        C1189h8 c1189h8 = c14365qy.m69826c5().f50511k4;
        ILegend legend = c14365qy.m69834fa().getLegend();
        if (C14064he.m66715kk(legend.getX()) || C14064he.m66715kk(legend.getY())) {
            return;
        }
        int position = legend.getPosition();
        if (position == 0) {
            c14365qy.m69826c5().m74381k4(false);
        } else if (position == 1 || position == 2) {
            c14365qy.m69826c5().m74381k4(true);
        } else if (position != 3) {
            if (position == 4) {
            }
        }
        int iOooO0O0 = C22221Oooo0O0.OooO0O0(legend.getX(), c14365qy.m69867v4(), c14365qy.m69878yd(), 13);
        int iOooO0O02 = C22221Oooo0O0.OooO0O0(legend.getY(), c14365qy.m69852lr(), c14365qy.m69823b3(), 13);
        C12023wl c12023wl = new C12023wl(PackageManager.getPackageInfo((String) legend.getWidth(), (int) c14365qy.m69867v4()), PackageManager.getPackageInfo((String) legend.getHeight(), (int) c14365qy.m69852lr()));
        if (iOooO0O0 < 0) {
            iOooO0O0 = 0;
        }
        c1189h8.f5456k4 = new C12014ne(new C12016rv(iOooO0O0, iOooO0O02 >= 0 ? iOooO0O02 : 0), c12023wl.Clone());
    }

    /* JADX INFO: renamed from: x1 */
    private static List<s8k> m6628x1(List<s8k> list) {
        List list2 = new List();
        if (list.size() > 0) {
            C13847mr c13847mrM70488to = list.get_Item(0).m70488to();
            List list3 = new List();
            list3.addItem(list.get_Item(0));
            list2.addItem(list3);
            for (int i = 1; i < list.size(); i++) {
                s8k s8kVar = list.get_Item(i);
                if (s8kVar.m70488to().m64945h4().getType() == c13847mrM70488to.m64945h4().getType()) {
                    ((List) OooO0O0.OooO00o(list2, 1)).addItem(list.get_Item(i));
                } else {
                    c13847mrM70488to = s8kVar.m70488to();
                    List list4 = new List();
                    list4.addItem(list.get_Item(i));
                    list2.addItem(list4);
                }
            }
            list = new List<>();
            for (int i2 = 0; i2 < list2.size(); i2++) {
                List list5 = (List) list2.get_Item(i2);
                list5.reverse();
                list.addRange(list5);
            }
        }
        return list;
    }

    public Object clone() {
        return Clone();
    }

    public boolean equals(Object obj) {
        if (C14067j2.m66729x1(null, obj)) {
            return false;
        }
        if (C14067j2.m66729x1(this, obj)) {
            return true;
        }
        if (obj instanceof gfh) {
            return m6633x1((gfh) obj);
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00a4  */
    /* JADX INFO: renamed from: k4 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static List<s8k> m6608k4(boolean z, boolean z2, List<s8k> list, C14365qy c14365qy) {
        boolean z3;
        boolean z4 = true;
        List<s8k> listM6607k4 = m6607k4(1, false, list);
        List<s8k> listM6607k42 = m6607k4(1, true, list);
        List<s8k> listM6607k43 = m6607k4(2, false, list);
        List<s8k> listM6607k44 = m6607k4(2, true, list);
        boolean zIsPlotOrderReversed = c14365qy.m69854ne().m73384dy().isPlotOrderReversed();
        boolean zIsPlotOrderReversed2 = c14365qy.m69863u4().m73384dy().isPlotOrderReversed();
        List<C13847mr> listM69865up = c14365qy.m69865up();
        boolean z5 = listM69865up.size() <= 0 || !listM69865up.get_Item(0).m64945h4().getPlotOnSecondAxis();
        if (listM6607k4.size() > 0) {
            C13847mr c13847mrM70488to = listM6607k4.get_Item(0).m70488to();
            z3 = ChartTypeCharacterizer.m758dy(c13847mrM70488to.m64945h4().getType()) || ChartTypeCharacterizer.m761jd(c13847mrM70488to.m64945h4().getType());
        }
        if (listM6607k42.size() > 0) {
            C13847mr c13847mrM70488to2 = listM6607k42.get_Item(0).m70488to();
            if (!ChartTypeCharacterizer.m758dy(c13847mrM70488to2.m64945h4().getType()) && !ChartTypeCharacterizer.m761jd(c13847mrM70488to2.m64945h4().getType())) {
                z4 = z3;
            }
        }
        if (!z2 ? !(!z4 || !z) : !(z4 ? !zIsPlotOrderReversed2 || !z : zIsPlotOrderReversed || !z)) {
            listM6607k4 = m6628x1(listM6607k4);
            listM6607k42 = m6628x1(listM6607k42);
            listM6607k43.reverse();
            listM6607k44.reverse();
        }
        List<s8k> list2 = new List<>();
        if (z5) {
            list2.addRange(listM6607k4);
            list2.addRange(listM6607k42);
            list2.addRange(listM6607k43);
            list2.addRange(listM6607k44);
            return list2;
        }
        list2.addRange(listM6607k42);
        list2.addRange(listM6607k4);
        list2.addRange(listM6607k44);
        list2.addRange(listM6607k43);
        return list2;
    }

    /* JADX INFO: renamed from: kk */
    private static C12015qq m6626kk(C14365qy c14365qy) {
        List<C13847mr> listM69865up = c14365qy.m69865up();
        C12015qq c12015qq = new C12015qq(0.0f, 0.0f);
        C12015qq c12015qq2 = new C12015qq();
        AbstractC12008jd abstractC12008jdM56582k4 = AbstractC12008jd.m56582k4((AbstractC12002ck) new C12009k4(1, 1));
        for (int i = 0; i < listM69865up.size(); i++) {
            abstractC12008jdM56582k4.mo17487k4(listM69865up.get_Item(i).m64957kk(), c14365qy.m69826c5().m74382kk()).CloneTo(c12015qq2);
            if (c12015qq.m56699x1() < c12015qq2.m56699x1()) {
                c12015qq.m56695k4(c12015qq2.m56699x1());
            }
            if (c12015qq.m56697kk() < c12015qq2.m56697kk()) {
                c12015qq.m56700x1(c12015qq2.m56697kk());
            }
        }
        return c12015qq;
    }

    @Override // com.aspose.slides.p559ms.System.AbstractC14079na
    /* JADX INFO: renamed from: k4, reason: merged with bridge method [inline-methods] */
    public gfh Clone() {
        gfh gfhVar = new gfh();
        CloneTo(gfhVar);
        return gfhVar;
    }

    /* JADX INFO: renamed from: k4 */
    public static C12015qq m6609k4(C12015qq c12015qq, C14365qy c14365qy) {
        List<s8k> listM74386up = c14365qy.m69826c5().m74386up();
        C12015qq c12015qq2 = new C12015qq(0.0f, 0.0f);
        C12015qq c12015qq3 = new C12015qq();
        int iM74384m9 = c14365qy.m69826c5().m74384m9();
        for (int i = 0; i < listM74386up.size(); i++) {
            C0840c3.m4433k4(listM74386up.get_Item(i).m70481k4(), c14365qy.m69826c5().m74382kk(), c12015qq.Clone()).CloneTo(c12015qq3);
            c12015qq3.m56695k4(c12015qq3.m56699x1() + (iM74384m9 * 2));
            c12015qq2.m56695k4(c12015qq3.m56699x1() + c12015qq2.m56699x1());
            if (c12015qq2.m56697kk() < c12015qq3.m56697kk()) {
                c12015qq2.m56700x1(c12015qq3.m56697kk());
            }
        }
        return c12015qq2;
    }

    /* JADX INFO: renamed from: k4 */
    public static C12015qq m6610k4(C13847mr c13847mr, C14365qy c14365qy) {
        C14365qy c14365qy2;
        C12023wl c12023wlM4438k4;
        List<C0886d8> listM64944dy = c13847mr.m64944dy();
        C12015qq c12015qq = new C12015qq(0.0f, 0.0f);
        C12015qq c12015qq2 = new C12015qq();
        List<C1210hn> listM69871x1 = !c13847mr.m64945h4().getPlotOnSecondAxis() ? c14365qy.m69871x1() : c14365qy.m69848kk();
        if (listM69871x1.size() > 0) {
            int i = 0;
            while (i < listM64944dy.size()) {
                if (i > c14365qy.m69826c5().m74386up().size() - 1 || !c14365qy.m69826c5().m74386up().get_Item(i).m70479du().getHide()) {
                    if (listM69871x1.size() >= listM64944dy.size()) {
                        C14365qy c14365qy3 = c14365qy;
                        c12023wlM4438k4 = C0840c3.m4438k4(m6616k4(listM69871x1.get_Item(i)), 0.0f, c14365qy.m69826c5().m74379k4(), 0, c14365qy3, new C12015qq(1000.0f, 1000.0f));
                        c14365qy2 = c14365qy3;
                    } else {
                        c14365qy2 = c14365qy;
                        c12023wlM4438k4 = C0840c3.m4438k4(" ", 0.0f, c14365qy2.m69826c5().m74379k4(), 0, c14365qy2, new C12015qq(1000.0f, 1000.0f));
                    }
                    C12023wl.m56853k4(c12023wlM4438k4).CloneTo(c12015qq2);
                    if (c12015qq.m56699x1() < c12015qq2.m56699x1()) {
                        c12015qq.m56695k4(c12015qq2.m56699x1());
                    }
                    if (c12015qq.m56697kk() < c12015qq2.m56697kk()) {
                        c12015qq.m56700x1(c12015qq2.m56697kk());
                    }
                } else {
                    c14365qy2 = c14365qy;
                }
                i++;
                c14365qy = c14365qy2;
            }
        } else {
            for (int i2 = 1; i2 <= listM64944dy.size(); i2++) {
                C12023wl.m56853k4(C0840c3.m4438k4(C14057f9.m66586k4(i2, (InterfaceC14073kp) C11697x1.m55250kk()), 0.0f, c14365qy.m69826c5().m74379k4(), 0, c14365qy, new C12015qq(1000.0f, 1000.0f))).CloneTo(c12015qq2);
                if (c12015qq.m56699x1() < c12015qq2.m56699x1()) {
                    c12015qq.m56695k4(c12015qq2.m56699x1());
                }
                if (c12015qq.m56697kk() < c12015qq2.m56697kk()) {
                    c12015qq.m56700x1(c12015qq2.m56697kk());
                }
            }
        }
        return c12015qq;
    }

    /* JADX INFO: renamed from: x1 */
    public static C12015qq m6629x1(C12015qq c12015qq, C14365qy c14365qy) {
        C12015qq c12015qq2 = new C12015qq(c12015qq.m56699x1(), c12015qq.m56697kk());
        C12015qq c12015qq3 = new C12015qq(0.0f, 0.0f);
        C12015qq c12015qq4 = new C12015qq();
        int iM74384m9 = c14365qy.m69826c5().m74384m9();
        List<s8k> listM74386up = c14365qy.m69826c5().m74386up();
        for (int i = 0; i < listM74386up.size(); i++) {
            C0840c3.m4433k4(listM74386up.get_Item(i).m70481k4(), c14365qy.m69826c5().m74382kk(), c12015qq2.Clone()).CloneTo(c12015qq4);
            c12015qq4.m56695k4(c12015qq4.m56699x1() + (iM74384m9 * 2));
            if (c12015qq3.m56699x1() < c12015qq4.m56699x1()) {
                c12015qq3.m56695k4(c12015qq4.m56699x1());
            }
            if (c12015qq3.m56697kk() < c12015qq4.m56697kk()) {
                c12015qq3.m56700x1(c12015qq4.m56697kk());
            }
        }
        return c12015qq3;
    }

    /* JADX INFO: renamed from: k4 */
    public static C12015qq m6611k4(C14365qy c14365qy) {
        C12015qq c12015qqClone = m6626kk(c14365qy).Clone();
        float fM56697kk = c12015qqClone.m56697kk() * 0.5f;
        float fM56697kk2 = c12015qqClone.m56697kk();
        if (m6623k4(c14365qy.m69865up())) {
            fM56697kk = 28.0f;
        }
        return new C12015qq(fM56697kk, fM56697kk2);
    }

    /* JADX INFO: renamed from: x1 */
    public static C12015qq m6630x1(C13847mr c13847mr, C14365qy c14365qy) {
        C14365qy c14365qy2;
        C12023wl c12023wlM4438k4;
        List<C0886d8> listM64944dy = c13847mr.m64944dy();
        C12015qq c12015qq = new C12015qq(0.0f, 0.0f);
        C12015qq c12015qq2 = new C12015qq();
        List<C1210hn> listM69848kk = c13847mr.m64945h4().getPlotOnSecondAxis() ? c14365qy.m69848kk() : c14365qy.m69871x1();
        if (listM69848kk.size() > 0) {
            int i = 0;
            while (i < listM69848kk.size()) {
                if (listM69848kk.size() >= listM64944dy.size()) {
                    C14365qy c14365qy3 = c14365qy;
                    c12023wlM4438k4 = C0840c3.m4438k4(m6616k4(listM69848kk.get_Item(i)), 0.0f, c14365qy.m69826c5().m74379k4(), 0, c14365qy3, new C12015qq(1000.0f, 1000.0f));
                    c14365qy2 = c14365qy3;
                } else {
                    c14365qy2 = c14365qy;
                    c12023wlM4438k4 = C0840c3.m4438k4(" ", 0.0f, c14365qy2.m69826c5().m74379k4(), 0, c14365qy2, new C12015qq(1000.0f, 1000.0f));
                }
                C12023wl.m56853k4(c12023wlM4438k4).CloneTo(c12015qq2);
                c12015qq.m56695k4(c12015qq2.m56699x1() + c12015qq.m56699x1());
                if (c12015qq.m56697kk() < c12015qq2.m56697kk()) {
                    c12015qq.m56700x1(c12015qq2.m56697kk());
                }
                i++;
                c14365qy = c14365qy2;
            }
        } else {
            for (int i2 = 1; i2 <= listM64944dy.size(); i2++) {
                C12023wl.m56853k4(C0840c3.m4438k4(C14057f9.m66586k4(i2, (InterfaceC14073kp) C11697x1.m55250kk()), 0.0f, c14365qy.m69826c5().m74379k4(), 0, c14365qy, new C12015qq(1000.0f, 1000.0f))).CloneTo(c12015qq2);
                c12015qq.m56695k4(c12015qq2.m56699x1() + c12015qq.m56699x1());
                if (c12015qq.m56697kk() < c12015qq2.m56697kk()) {
                    c12015qq.m56700x1(c12015qq2.m56697kk());
                }
            }
        }
        return c12015qq;
    }

    /* JADX WARN: Type inference failed for: r6v1, types: [float, java.lang.String] */
    /* JADX WARN: Type inference failed for: r6v2, types: [android.content.pm.PackageInfo, int] */
    /* JADX WARN: Type inference failed for: r8v0, types: [float, int] */
    /* JADX WARN: Type inference failed for: r8v1, types: [float, java.lang.String] */
    /* JADX WARN: Type inference failed for: r8v2, types: [android.content.pm.PackageInfo, int] */
    /* JADX WARN: Type inference failed for: r9v0, types: [float, int] */
    /* JADX INFO: renamed from: k4 */
    public static C12016rv m6612k4(C13847mr c13847mr, C12014ne[] c12014neArr, C14365qy c14365qy) {
        float fM56865x1;
        float fM56862kk;
        C12014ne c12014ne;
        float f;
        C12014ne c12014ne2;
        float fM56683x1;
        float f2;
        ILegend legend = c14365qy.m69834fa().getLegend();
        C12023wl c12023wlClone = m6614k4(c13847mr, (Legend) legend, c14365qy).Clone();
        C1189h8 c1189h8 = c14365qy.m69826c5().f50511k4;
        c1189h8.f5456k4 = new C12014ne(0, 0, c12023wlClone.m56865x1(), c12023wlClone.m56862kk());
        if (C14064he.m66715kk(legend.getWidth()) && C14064he.m66715kk(legend.getHeight())) {
            c1189h8.f5456k4 = new C12014ne(0, 0, c12023wlClone.m56865x1(), c12023wlClone.m56862kk());
        } else {
            c1189h8.f5456k4 = new C12014ne(0, 0, PackageManager.getPackageInfo((String) legend.getWidth(), (int) c14365qy.m69867v4()), PackageManager.getPackageInfo((String) legend.getHeight(), (int) c14365qy.m69852lr()));
        }
        int iM27462to = C7019kk.m27462to(Float.valueOf(c14365qy.m69852lr()), 13);
        int iM27462to2 = C7019kk.m27462to(Float.valueOf(c14365qy.m69867v4()), 13);
        int iM27462to3 = C7019kk.m27462to(Float.valueOf(c14365qy.m69878yd()), 13);
        int iM27462to4 = C7019kk.m27462to(Float.valueOf(c14365qy.m69823b3()), 13);
        int position = legend.getPosition();
        if (position == 0) {
            fM56865x1 = (float) ((((double) (iM27462to2 - c12023wlClone.m56865x1())) / 2.0d) + ((double) iM27462to3));
            fM56862kk = ((iM27462to4 + iM27462to) - 8) - c12023wlClone.m56862kk();
            if (!legend.getOverlay()) {
                c12014ne = c12014neArr[0];
                c12014ne.m56671k4(c12014ne.m56683x1() - (c12023wlClone.m56862kk() + 6));
            }
            f = fM56865x1;
        } else if (position != 1) {
            if (position == 2) {
                fM56865x1 = ((iM27462to3 + iM27462to2) - 8) - c12023wlClone.m56865x1();
                fM56862kk = (float) ((((double) (iM27462to - c12023wlClone.m56862kk())) / 2.0d) + ((double) iM27462to4));
                if (!legend.getOverlay()) {
                    c12014ne2 = c12014neArr[0];
                    c12014ne2.m56684x1(c12014ne2.m56663c5() - (c12023wlClone.m56865x1() + 6));
                }
            } else if (position == 3) {
                fM56865x1 = (float) ((((double) (iM27462to2 - c12023wlClone.m56865x1())) / 2.0d) + ((double) iM27462to3));
                fM56862kk = c1189h8.f5456k4.m56683x1() + iM27462to4 + 8 + 6;
                if (!legend.getOverlay()) {
                    C12014ne c12014ne3 = c12014neArr[0];
                    c12014ne3.m56682to(c12023wlClone.m56862kk() + 6 + c12014ne3.m56664ck());
                    c12014ne = c12014neArr[0];
                    c12014ne.m56671k4(c12014ne.m56683x1() - (c12023wlClone.m56862kk() + 6));
                }
            } else if (position != 4) {
                f = 0.0f;
                fM56862kk = 0.0f;
            } else {
                float fM56865x12 = ((iM27462to3 + iM27462to2) - 8) - c12023wlClone.m56865x1();
                if (c14365qy.m69834fa().hasTitle()) {
                    fM56683x1 = c1189h8.f5456k4.m56683x1() + iM27462to4 + 8;
                    f2 = 6;
                } else {
                    fM56683x1 = iM27462to4;
                    f2 = 8;
                }
                float f3 = fM56683x1 + f2;
                if (!legend.getOverlay()) {
                    C12014ne c12014ne4 = c12014neArr[0];
                    c12014ne4.m56684x1(c12014ne4.m56663c5() - (c12023wlClone.m56865x1() + 6));
                }
                f = fM56865x12;
                fM56862kk = f3;
            }
            f = fM56865x1;
        } else {
            fM56865x1 = iM27462to3 + 8;
            fM56862kk = (float) ((((double) (iM27462to - c12023wlClone.m56862kk())) / 2.0d) + ((double) iM27462to4));
            if (!legend.getOverlay()) {
                C12014ne c12014ne5 = c12014neArr[0];
                c12014ne5.m56676kk(c12023wlClone.m56865x1() + 6 + c12014ne5.m56669jd());
                c12014ne2 = c12014neArr[0];
                c12014ne2.m56684x1(c12014ne2.m56663c5() - (c12023wlClone.m56865x1() + 6));
            }
            f = fM56865x1;
        }
        c1189h8.f5456k4 = new C12014ne(C7019kk.m27462to(Float.valueOf(f), 13), C7019kk.m27462to(Float.valueOf(fM56862kk), 13), c1189h8.f5456k4.m56663c5(), c1189h8.f5456k4.m56683x1());
        return new C12016rv(c1189h8.f5456k4.m56669jd(), c1189h8.f5456k4.m56664ck());
    }

    /* JADX INFO: renamed from: x1 */
    public static C12015qq m6631x1(C14365qy c14365qy) {
        return c14365qy.m69826c5().m74388yj() ? new C12015qq(c14365qy.m69826c5().m74378jd(), C0840c3.m4431k4(c14365qy.m69826c5().m74382kk())) : new C12015qq(c14365qy.m69826c5().m74375dy(), C0840c3.m4431k4(c14365qy.m69826c5().m74382kk()));
    }

    /* JADX INFO: renamed from: x1 */
    private static String m6632x1(C1210hn c1210hn) {
        String strM7228h4 = c1210hn.m7228h4();
        boolean zM7235kk = c1210hn.m7235kk();
        Object objM7238x1 = c1210hn.m7238x1();
        return zM7235kk ? C14337qc.m69515k4((Object) kc0.m63754k4(C14080ne.m66903fa(objM7238x1), false).Clone().Clone(), strM7228h4, false) : C14337qc.m69515k4(objM7238x1, strM7228h4, false);
    }

    /* JADX INFO: renamed from: x1 */
    private boolean m6633x1(gfh gfhVar) {
        return true;
    }

    /* JADX INFO: renamed from: k4 */
    public static C12016rv m6613k4(C12014ne[] c12014neArr, C14365qy c14365qy) {
        float fM56865x1;
        float fM56862kk;
        float f;
        C12014ne c12014ne;
        float fM56865x12;
        float fM56683x1;
        float fM56683x12;
        float f2;
        C12023wl c12023wl = new C12023wl();
        ILegend legend = c14365qy.m69834fa().getLegend();
        m6615k4(c14365qy, (Legend) legend).CloneTo(c12023wl);
        int iM27462to = C7019kk.m27462to(Float.valueOf(c14365qy.m69852lr()), 13);
        int iM27462to2 = C7019kk.m27462to(Float.valueOf(c14365qy.m69867v4()), 13);
        int iM27462to3 = C7019kk.m27462to(Float.valueOf(c14365qy.m69878yd()), 13);
        int iM27462to4 = C7019kk.m27462to(Float.valueOf(c14365qy.m69823b3()), 13);
        int position = legend.getPosition();
        if (position != 0) {
            if (position == 1) {
                fM56865x1 = iM27462to3 + 8;
                fM56862kk = (float) ((((double) (iM27462to - c12023wl.m56862kk())) / 2.0d) + ((double) iM27462to4));
                if (!legend.getOverlay()) {
                    C12014ne c12014ne2 = c12014neArr[0];
                    c12014ne2.m56676kk(c12023wl.m56865x1() + 6 + c12014ne2.m56669jd());
                    c12014ne = c12014neArr[0];
                    c12014ne.m56684x1(c12014ne.m56663c5() - (c12023wl.m56865x1() + 6));
                }
            } else if (position != 2) {
                if (position == 3) {
                    fM56865x12 = (float) ((((double) (iM27462to2 - c12023wl.m56865x1())) / 2.0d) + ((double) iM27462to3));
                    fM56683x1 = c14365qy.m69828ck().f47882k4.f5456k4.m56683x1() + iM27462to4 + 8 + 6;
                    if (!legend.getOverlay()) {
                        C12014ne c12014ne3 = c12014neArr[0];
                        c12014ne3.m56682to(c12023wl.m56862kk() + 6 + c12014ne3.m56664ck());
                        C12014ne c12014ne4 = c12014neArr[0];
                        c12014ne4.m56671k4(c12014ne4.m56683x1() - (c12023wl.m56862kk() + 6));
                    }
                } else if (position != 4) {
                    f = 0.0f;
                    fM56862kk = 0.0f;
                } else {
                    fM56865x12 = ((iM27462to3 + iM27462to2) - 8) - c12023wl.m56865x1();
                    if (c14365qy.m69834fa().hasTitle()) {
                        fM56683x12 = c14365qy.m69828ck().f47882k4.f5456k4.m56683x1() + iM27462to4 + 8;
                        f2 = 6;
                    } else {
                        fM56683x12 = iM27462to4;
                        f2 = 8;
                    }
                    fM56683x1 = fM56683x12 + f2;
                    if (!legend.getOverlay()) {
                        C12014ne c12014ne5 = c12014neArr[0];
                        c12014ne5.m56684x1(c12014ne5.m56663c5() - (c12023wl.m56865x1() + 6));
                        C12014ne c12014ne6 = c12014neArr[0];
                        c12014ne6.m56682to(c12023wl.m56862kk() + 6 + c12014ne6.m56664ck());
                    }
                }
                f = fM56865x12;
                fM56862kk = fM56683x1;
            } else {
                fM56865x1 = ((iM27462to3 + iM27462to2) - 8) - c12023wl.m56865x1();
                fM56862kk = (float) ((((double) (iM27462to - c12023wl.m56862kk())) / 2.0d) + ((double) iM27462to4));
                if (!legend.getOverlay()) {
                    c12014ne = c12014neArr[0];
                    c12014ne.m56684x1(c12014ne.m56663c5() - (c12023wl.m56865x1() + 6));
                }
            }
            c14365qy.m69826c5().f50511k4.f5456k4 = new C12014ne(C7019kk.m27462to(Float.valueOf(f), 13), C7019kk.m27462to(Float.valueOf(fM56862kk), 13), c12023wl.m56865x1(), c12023wl.m56862kk());
            return new C12016rv(c14365qy.m69826c5().f50511k4.f5456k4.m56669jd(), c14365qy.m69826c5().f50511k4.f5456k4.m56664ck());
        }
        fM56865x1 = (float) ((((double) (iM27462to2 - c12023wl.m56865x1())) / 2.0d) + ((double) iM27462to3));
        fM56862kk = ((iM27462to4 + iM27462to) - 8) - c12023wl.m56862kk();
        if (!legend.getOverlay()) {
            C12014ne c12014ne7 = c12014neArr[0];
            c12014ne7.m56671k4(c12014ne7.m56683x1() - (c12023wl.m56862kk() + 6));
        }
        f = fM56865x1;
        c14365qy.m69826c5().f50511k4.f5456k4 = new C12014ne(C7019kk.m27462to(Float.valueOf(f), 13), C7019kk.m27462to(Float.valueOf(fM56862kk), 13), c12023wl.m56865x1(), c12023wl.m56862kk());
        return new C12016rv(c14365qy.m69826c5().f50511k4.f5456k4.m56669jd(), c14365qy.m69826c5().f50511k4.f5456k4.m56664ck());
    }

    /* JADX INFO: renamed from: k4 */
    public static C12023wl m6614k4(C13847mr c13847mr, Legend legend, C14365qy c14365qy) {
        int i;
        int iM27462to;
        int iM27462to2;
        int iM27462to3;
        List<C0886d8> listM64944dy = c13847mr.m64944dy();
        C12015qq c12015qq = new C12015qq();
        if (legend.getPosition() == 3 || legend.getPosition() == 0) {
            C12015qq c12015qqClone = m6611k4(c14365qy).Clone();
            int iM27462to4 = C7019kk.m27462to(Float.valueOf(m6610k4(c13847mr, c14365qy).Clone().m56699x1() + c12015qqClone.m56699x1()), 13) + 1;
            int iM27462to5 = C7019kk.m27462to(Float.valueOf(c14365qy.m69867v4()), 13) - 20;
            int i2 = iM27462to5 / iM27462to4;
            int i3 = i2 != 0 ? i2 : 1;
            m6630x1(c13847mr, c14365qy).CloneTo(c12015qq);
            int iM27462to6 = C7019kk.m27462to(Float.valueOf(c12015qq.m56699x1() + (c12015qqClone.m56699x1() * c13847mr.m64944dy().size())), 13);
            if (iM27462to6 + 1 <= iM27462to5) {
                i = iM27462to6 + 5;
                iM27462to = C7019kk.m27462to(Float.valueOf(c12015qq.m56697kk()), 13) + 8;
            } else {
                int iM63753k4 = kc0.m63753k4(((double) c13847mr.m64944dy().size()) / ((double) i3));
                int iM63753k42 = (kc0.m63753k4(((double) c13847mr.m64944dy().size()) / ((double) iM63753k4)) * iM27462to4) + 4;
                int iM27462to7 = (C7019kk.m27462to(Float.valueOf(c12015qq.m56697kk()), 13) * iM63753k4) + 8;
                i = iM63753k42;
                iM27462to = iM27462to7;
            }
            if (iM27462to > c14365qy.m69852lr() - 16.0f) {
                iM27462to = C7019kk.m27462to(Float.valueOf(c14365qy.m69852lr()), 13) - 16;
            }
            int i4 = i;
            iM27462to2 = iM27462to;
            iM27462to3 = i4;
        } else {
            C12015qq c12015qqClone2 = m6611k4(c14365qy).Clone();
            m6610k4(c13847mr, c14365qy).CloneTo(c12015qq);
            iM27462to3 = C7019kk.m27462to(Float.valueOf(c12015qq.m56699x1() + c12015qqClone2.m56699x1() + 4.0f), 13) + 1;
            iM27462to2 = C7019kk.m27462to(Float.valueOf((c12015qq.m56697kk() * (listM64944dy.size() - 1)) + c12015qq.m56697kk() + 8.0f), 13);
            if (iM27462to3 > c14365qy.m69867v4()) {
                iM27462to3 = C7019kk.m27462to(Float.valueOf(c14365qy.m69867v4()), 13);
            }
            if (iM27462to2 > c14365qy.m69852lr() - 16.0f) {
                iM27462to2 = C7019kk.m27462to(Float.valueOf(c14365qy.m69852lr()), 13) - 16;
            }
        }
        return new C12023wl(iM27462to3, iM27462to2);
    }

    /* JADX WARN: Removed duplicated region for block: B:37:0x0189  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0199  */
    /* JADX INFO: renamed from: k4 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static C12023wl m6615k4(C14365qy c14365qy, Legend legend) {
        int iOooO0O0;
        int iM27462to;
        int iM63753k4;
        int iM27462to2;
        C12015qq c12015qqClone = m6631x1(c14365qy).Clone();
        int iM74377h4 = c14365qy.m69826c5().m74377h4();
        int iM74384m9 = c14365qy.m69826c5().m74384m9();
        int size = c14365qy.m69826c5().m74386up().size();
        new C12015qq();
        C12015qq c12015qq = new C12015qq();
        if (legend.getPosition() == 3 || legend.getPosition() == 0) {
            C12015qq c12015qq2 = new C12015qq(c14365qy.m69867v4() - 16.0f, (c14365qy.m69852lr() / 2.0f) - 8.0f);
            m6629x1(c12015qq2.Clone(), c14365qy).CloneTo(c12015qq);
            int iM63753k42 = kc0.m63753k4(c12015qq.m56699x1() + c12015qqClone.m56699x1());
            int iM63759kk = kc0.m63759kk(c12015qq2.m56699x1()) - iM74377h4;
            int i = iM63759kk / iM63753k42;
            int i2 = i != 0 ? i : 1;
            C12015qq c12015qqClone2 = m6609k4(c12015qq2.Clone(), c14365qy).Clone();
            float f = size;
            int iM63753k43 = kc0.m63753k4(c12015qqClone2.m56699x1() + (c12015qqClone.m56699x1() * f));
            int iOooO00o = 0;
            if (iM63753k43 <= iM63759kk) {
                c14365qy.m69826c5().m74381k4(false);
                iOooO0O0 = iM63753k43 + iM74377h4 + iM74384m9;
                iM63753k4 = kc0.m63753k4(c12015qqClone2.m56697kk() + (iM74377h4 * 2));
            } else {
                c14365qy.m69826c5().m74381k4(false);
                iOooO0O0 = C22213OooOoOO.OooO0O0(i2, iM63753k42, iM74377h4, iM74384m9);
                float f2 = i2;
                int i3 = iM74377h4 * 2;
                int iM63753k44 = ((kc0.m63753k4(c12015qq.m56697kk()) + iM74384m9) * kc0.m63753k4(f / f2)) + i3;
                int iM27462to3 = (C7019kk.m27462to(Float.valueOf(c14365qy.m69852lr()), 13) / 2) - 8;
                if (iM63753k44 > iM27462to3) {
                    int i4 = 0;
                    while (iOooO00o <= iM27462to3 && i4 <= size) {
                        iOooO00o = Oooo0.OooO00o(kc0.m63753k4(c12015qq.m56697kk()), iM74384m9, kc0.m63753k4(i4 / f2), i3);
                        i4 += i2;
                    }
                    if (i4 >= size || iOooO00o == iM27462to3) {
                        iM27462to = iOooO0O0;
                        iM63753k4 = iOooO00o;
                        iM27462to2 = ((float) iM63753k4) <= c14365qy.m69852lr() - 16.0f ? C7019kk.m27462to(Float.valueOf(c14365qy.m69852lr()), 13) - 16 : iM63753k4;
                    } else {
                        if (iOooO00o > iM27462to3) {
                            iM63753k4 = iOooO00o - (kc0.m63753k4(c12015qq.m56697kk()) + iM74384m9);
                        }
                        iM27462to = iOooO0O0;
                        iM63753k4 = iM63753k44;
                        if (((float) iM63753k4) <= c14365qy.m69852lr() - 16.0f) {
                        }
                    }
                } else {
                    iM27462to = iOooO0O0;
                    iM63753k4 = iM63753k44;
                    if (((float) iM63753k4) <= c14365qy.m69852lr() - 16.0f) {
                    }
                }
            }
            iM27462to = iOooO0O0;
            if (((float) iM63753k4) <= c14365qy.m69852lr() - 16.0f) {
            }
        } else {
            c14365qy.m69826c5().m74381k4(true);
            iM27462to2 = C7019kk.m27462to(Float.valueOf(c14365qy.m69852lr()), 13) - 16;
            iM27462to = C7019kk.m27462to(Float.valueOf(c14365qy.m69867v4()), 13) / 3;
            m6629x1(new C12015qq(iM27462to, iM27462to2).Clone(), c14365qy).CloneTo(c12015qq);
            int iM63753k45 = kc0.m63753k4(c12015qq.m56699x1() + c12015qqClone.m56699x1() + iM74377h4);
            int iM63753k46 = kc0.m63753k4(((c12015qq.m56697kk() + iM74384m9) * size) + (iM74377h4 * 2));
            if (iM63753k45 <= iM27462to) {
                iM27462to = iM63753k45;
            }
            if (iM63753k46 <= iM27462to2) {
                iM27462to2 = iM63753k46;
            }
        }
        return new C12023wl(iM27462to, iM27462to2);
    }

    /* JADX INFO: renamed from: k4 */
    private static String m6616k4(C1210hn c1210hn) {
        String strM6632x1 = m6632x1(c1210hn);
        while (c1210hn.m7229k4() != null) {
            c1210hn = c1210hn.m7229k4();
            strM6632x1 = C14113y2.m67408k4(m6632x1(c1210hn), " ", strM6632x1);
        }
        return strM6632x1;
    }

    @Override // com.aspose.slides.p559ms.System.AbstractC14079na
    /* JADX INFO: renamed from: k4, reason: merged with bridge method [inline-methods] */
    public void CloneTo(gfh gfhVar) {
    }

    /* JADX INFO: renamed from: k4 */
    public static void m6617k4(C12007ix c12007ix, C13847mr c13847mr, int i, C14365qy c14365qy) {
        float fM56575x1;
        C0886d8 c0886d8M64942ck = c13847mr.m64944dy().get_Item(i);
        if (c0886d8M64942ck == null) {
            c0886d8M64942ck = c13847mr.m64942ck();
        }
        if (ChartTypeCharacterizer.isChartTypeBubble(c13847mr.m64945h4().getType())) {
            float fM74375dy = c14365qy.m69826c5().m74375dy();
            C12007ix c12007ix2 = new C12007ix(c12007ix.m56557jd(), ((c12007ix.m56575x1() - fM74375dy) / 2.0f) + c12007ix.m56551ck(), fM74375dy, fM74375dy);
            C11896dy c11896dy = new C11896dy();
            c11896dy.m55542k4(c12007ix2.Clone());
            c0886d8M64942ck.m5000kk(c11896dy);
            c0886d8M64942ck.m4992k4(c11896dy);
            return;
        }
        if (!ChartTypeCharacterizer.m757du(c13847mr.m64945h4().getType())) {
            float fM56550c5 = c12007ix.m56550c5();
            float fM56575x12 = c12007ix.m56575x1() / 2.0f;
            C12007ix c12007ix3 = new C12007ix(c12007ix.m56557jd(), C22203OooOO0o.OooO0O0(c12007ix, 2.0f, c12007ix.m56551ck()) - (fM56575x12 / 2.0f), fM56550c5, fM56575x12);
            c0886d8M64942ck.m5017x1(c12007ix3.Clone());
            c0886d8M64942ck.m4996k4(c12007ix3.Clone());
            return;
        }
        if (c13847mr.m64945h4().getFormat().getLine().getFillFormat().getFillType() != 0 || c13847mr.m64945h4().getFormat().getLine().getFillFormat().getFillType() != -1) {
            c0886d8M64942ck.m4997k4(new C12025x6(c12007ix.m56557jd(), C22203OooOO0o.OooO0O0(c12007ix, 2.0f, c12007ix.m56551ck())), new C12025x6(c12007ix.m56550c5() + c12007ix.m56557jd(), C22203OooOO0o.OooO0O0(c12007ix, 2.0f, c12007ix.m56551ck())));
        }
        if (c0886d8M64942ck.m4988jd().m599x1() != null) {
            float fOooO00o = C22205OooOOo.OooO00o(c12007ix, 2.0f, c12007ix.m56557jd());
            float fOooO0O0 = C22203OooOO0o.OooO0O0(c12007ix, 2.0f, c12007ix.m56551ck());
            if (c0886d8M64942ck.m4988jd().getMarker().getSize() == 0) {
                fM56575x1 = c12007ix.m56575x1() * 0.4f;
            } else if (c0886d8M64942ck.m4988jd().getMarker().getSize() <= c12007ix.m56575x1() * 0.4f) {
                fM56575x1 = c0886d8M64942ck.m4988jd().getMarker().getSize();
            } else {
                float size = c0886d8M64942ck.m4988jd().getMarker().getSize() / c14365qy.m69852lr();
                if (size > 1.0f) {
                    size = 1.0f;
                }
                fM56575x1 = c12007ix.m56575x1() * 0.4f * (size + 1.0f);
            }
            c0886d8M64942ck.m5021yj().m70444k4(fOooO00o, fOooO0O0, fM56575x1);
        }
    }

    /* JADX INFO: renamed from: k4 */
    public static void m6618k4(C12007ix c12007ix, C13847mr c13847mr, C0886d8 c0886d8) {
        if (ChartTypeCharacterizer.isChartTypeBubble(c13847mr.m64945h4().getType())) {
            float fM56550c5 = c12007ix.m56550c5();
            C12007ix c12007ix2 = new C12007ix(c12007ix.m56557jd(), ((c12007ix.m56575x1() - fM56550c5) / 2.0f) + c12007ix.m56551ck(), fM56550c5, fM56550c5);
            C11896dy c11896dy = new C11896dy();
            c11896dy.m55542k4(c12007ix2.Clone());
            c13847mr.m64964x1(c11896dy);
            c13847mr.m64948k4(c11896dy);
            return;
        }
        if (!ChartTypeCharacterizer.m757du(c13847mr.m64945h4().getType())) {
            float fM56550c52 = c12007ix.m56550c5();
            C12007ix c12007ix3 = new C12007ix(c12007ix.m56557jd(), ((c12007ix.m56575x1() - fM56550c52) / 2.0f) + c12007ix.m56551ck(), fM56550c52, fM56550c52);
            if (c13847mr.m64941c5().m69865up().size() != 1) {
                c13847mr.m64967x1(c12007ix3.Clone());
                c13847mr.m64951k4(c12007ix3.Clone());
                return;
            } else {
                if (c0886d8.m5002kk(c12007ix3.Clone())) {
                    return;
                }
                c0886d8.m4996k4(c12007ix3.Clone());
                c0886d8.m5017x1(c12007ix3.Clone());
                return;
            }
        }
        if (c13847mr.m64945h4().getFormat().getLine().getFillFormat().getFillType() != 0 || c13847mr.m64945h4().getFormat().getLine().getFillFormat().getFillType() != -1) {
            c13847mr.m64953k4(new C12025x6(c12007ix.m56557jd(), C22203OooOO0o.OooO0O0(c12007ix, 2.0f, c12007ix.m56551ck())), new C12025x6(c12007ix.m56550c5() + c12007ix.m56557jd(), C22203OooOO0o.OooO0O0(c12007ix, 2.0f, c12007ix.m56551ck())));
        }
        if (c13847mr.m64945h4().getMarker() != null) {
            float fOooO00o = C22205OooOOo.OooO00o(c12007ix, 2.0f, c12007ix.m56557jd());
            float fOooO0O0 = C22203OooOO0o.OooO0O0(c12007ix, 2.0f, c12007ix.m56551ck());
            float fM56575x1 = c12007ix.m56575x1() * 0.5f;
            float size = c13847mr.m64945h4().getMarker().getSize();
            if (size <= fM56575x1) {
                fM56575x1 = size;
            }
            c13847mr.m64946jd().m70444k4(fOooO00o, fOooO0O0, fM56575x1);
        }
    }

    /* JADX INFO: renamed from: k4 */
    public static void m6619k4(C12007ix c12007ix, s8k s8kVar, C14365qy c14365qy) {
        if (s8kVar.m70489x1() == 2) {
            im9.m7709k4(new C12025x6(c12007ix.m56557jd(), C22203OooOO0o.OooO0O0(c12007ix, 2.0f, c12007ix.m56551ck())).Clone(), new C12025x6(c12007ix.m56556h4(), C22203OooOO0o.OooO0O0(c12007ix, 2.0f, c12007ix.m56551ck())).Clone(), s8kVar.m70487kk().m74309x1().Clone(), (LineFormat) s8kVar.m70487kk().m74307kk().getFormat().getLine(), c14365qy);
            return;
        }
        if (s8kVar.m70489x1() == 1) {
            C13847mr c13847mrM70488to = s8kVar.m70488to();
            C13847mr c13847mrM70488to2 = s8kVar.m70488to();
            if (ChartTypeCharacterizer.isChartTypeBubble(c13847mrM70488to.m64945h4().getType())) {
                float fM74375dy = c14365qy.m69826c5().m74375dy();
                C12007ix c12007ix2 = new C12007ix(c12007ix.m56557jd(), ((c12007ix.m56575x1() - fM74375dy) / 2.0f) + c12007ix.m56551ck(), fM74375dy, fM74375dy);
                C11896dy c11896dy = new C11896dy();
                c11896dy.m55542k4(c12007ix2.Clone());
                c13847mrM70488to.m64964x1(c11896dy);
                c13847mrM70488to.m64948k4(c11896dy);
                return;
            }
            if (ChartTypeCharacterizer.m757du(c13847mrM70488to.m64945h4().getType())) {
                if (c13847mrM70488to.m64945h4().getFormat().getLine().getFillFormat().getFillType() != 0 || c13847mrM70488to.m64945h4().getFormat().getLine().getFillFormat().getFillType() != -1) {
                    c13847mrM70488to.m64953k4(new C12025x6(c12007ix.m56557jd(), C22203OooOO0o.OooO0O0(c12007ix, 2.0f, c12007ix.m56551ck())), new C12025x6(c12007ix.m56550c5() + c12007ix.m56557jd(), C22203OooOO0o.OooO0O0(c12007ix, 2.0f, c12007ix.m56551ck())));
                }
                if (c13847mrM70488to2.m64945h4().getMarker().getSymbol() != 4) {
                    c13847mrM70488to2.m64946jd().m70444k4(C22205OooOOo.OooO00o(c12007ix, 2.0f, c12007ix.m56557jd()), C22203OooOO0o.OooO0O0(c12007ix, 2.0f, c12007ix.m56551ck()), (c13847mrM70488to2.m64945h4().getMarker().getSize() != 0 && ((float) c13847mrM70488to2.m64945h4().getMarker().getSize()) <= c12007ix.m56575x1() * 0.5f) ? c13847mrM70488to2.m64945h4().getMarker().getSize() : c12007ix.m56575x1() * 0.5f);
                    return;
                }
                return;
            }
            if (ChartTypeCharacterizer.isChartTypeStock(c13847mrM70488to.m64945h4().getType())) {
                return;
            }
            float fM56550c5 = c12007ix.m56550c5();
            float fM74375dy2 = c14365qy.m69826c5().m74375dy();
            C12007ix c12007ix3 = new C12007ix(c12007ix.m56557jd(), C22203OooOO0o.OooO0O0(c12007ix, 2.0f, c12007ix.m56551ck()) - (fM74375dy2 / 2.0f), fM56550c5, fM74375dy2);
            if (C14164n2.m67859x1(c14365qy.m69834fa())) {
                im9.m7707k4(s8kVar.m70480h4().Clone(), c14365qy, c12007ix3.Clone(), (FillFormat) null, (IEffectFormat) null);
            } else {
                c13847mrM70488to.m64967x1(c12007ix3.Clone());
                c13847mrM70488to.m64951k4(c12007ix3.Clone());
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:51:0x0201  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0206  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x022a  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0297  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x02a5  */
    /* JADX INFO: renamed from: k4 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void m6620k4(C13847mr c13847mr, C14365qy c14365qy, Legend legend, C13847mr c13847mr2) {
        List<C0886d8> list;
        C12015qq c12015qq;
        String strM6616k4;
        zal zalVarM69826c5 = c14365qy.m69826c5();
        C1189h8 c1189h8 = zalVarM69826c5.f50511k4;
        if (!C14064he.m66715kk(legend.getX()) && !C14064he.m66715kk(legend.getY())) {
            c1189h8.f5456k4.m56676kk(C7019kk.m27462to(Float.valueOf((legend.getX() * c14365qy.m69867v4()) + c14365qy.m69878yd()), 13));
            c1189h8.f5456k4.m56682to(C7019kk.m27462to(Float.valueOf((legend.getY() * c14365qy.m69852lr()) + c14365qy.m69823b3()), 13));
            if (c1189h8.f5456k4.m56669jd() < 0) {
                c1189h8.f5456k4.m56676kk(0);
            }
            if (c1189h8.f5456k4.m56664ck() < 0) {
                c1189h8.f5456k4.m56682to(0);
            }
        }
        List<C0886d8> listM64944dy = c13847mr.m64944dy();
        c1189h8.m7072k4();
        C12015qq c12015qqClone = m6611k4(c14365qy).Clone();
        C12015qq c12015qqClone2 = m6610k4(c13847mr, c14365qy).Clone();
        int iM27462to = C7019kk.m27462to(Float.valueOf(c12015qqClone2.m56699x1() + c12015qqClone.m56699x1()), 13);
        int iM56663c5 = c1189h8.f5456k4.m56663c5();
        int iM56683x1 = c1189h8.f5456k4.m56683x1();
        int i = iM56663c5 - 4;
        int i2 = i / iM27462to;
        int i3 = 1;
        if (i2 <= 0) {
            i2 = 1;
        }
        int iM63753k4 = kc0.m63753k4(zalVarM69826c5.m74383ks() / r13);
        float size = (iM56663c5 - (iM27462to * i2)) / i2;
        if (size < 0.0f) {
            size = 0.0f;
        }
        float f = iM63753k4;
        float fM27462to = C7019kk.m27462to(Float.valueOf(((iM56683x1 - 8) - (c12015qqClone2.m56697kk() * f)) / f), 13);
        if (fM27462to < 0.0f && (-fM27462to) > c12015qqClone.m56697kk() * 0.6f) {
            fM27462to = (-c12015qqClone.m56697kk()) * 0.6f;
        }
        int iM27462to2 = C7019kk.m27462to(Float.valueOf(m6630x1(c13847mr, c14365qy).Clone().m56699x1() + (c12015qqClone.m56699x1() * listM64944dy.size())), 13);
        if (iM27462to2 <= i) {
            size = ((iM56663c5 - 4.0f) - iM27462to2) / listM64944dy.size();
            float f2 = 1;
            fM27462to = C7019kk.m27462to(Float.valueOf((iM56683x1 - (c12015qqClone2.m56697kk() * f2)) / f2), 13);
            i2 = 1;
        }
        float f3 = size / 2.0f;
        float fM56669jd = c1189h8.f5456k4.m56669jd() + 4.0f + f3;
        float fM56664ck = (fM27462to / 2.0f) + c1189h8.f5456k4.m56664ck();
        List<C1210hn> listM69871x1 = !c13847mr.m64945h4().getPlotOnSecondAxis() ? c14365qy.m69871x1() : c14365qy.m69848kk();
        while (i3 <= listM64944dy.size()) {
            if (i3 <= zalVarM69826c5.m74386up().size()) {
                list = listM64944dy;
                if (zalVarM69826c5.m74386up().get_Item(i3 - 1).m70479du().getHide()) {
                    c12015qq = c12015qqClone;
                }
                i3++;
                listM64944dy = list;
                c12015qqClone = c12015qq;
            } else {
                list = listM64944dy;
            }
            if ((c12015qqClone.m56697kk() * 0.6f) + fM56664ck > c1189h8.f5456k4.m56683x1() + c1189h8.f5456k4.m56664ck()) {
                return;
            }
            c12015qq = c12015qqClone;
            int i4 = i3 - 1;
            float f4 = fM56669jd;
            m6617k4(new C12007ix(fM56669jd, fM56664ck, c12015qqClone.m56699x1(), c12015qq.m56697kk()).Clone(), c13847mr, i4, c14365qy);
            String strM66586k4 = C14057f9.m66586k4(i3, (InterfaceC14073kp) C11697x1.m55250kk());
            if (i4 < listM69871x1.size()) {
                strM6616k4 = m6616k4(listM69871x1.get_Item(i4));
            } else {
                if (listM69871x1.size() != 0) {
                    strM6616k4 = " ";
                }
                float f5 = i / i2;
                float fM56697kk = ((float) c1189h8.f5456k4.m56683x1()) >= c12015qqClone2.m56697kk() ? c12015qqClone2.m56697kk() : c1189h8.f5456k4.m56683x1();
                if (c12015qq.m56697kk() + fM56664ck > c1189h8.f5456k4.m56683x1() + c1189h8.f5456k4.m56664ck()) {
                    fM56697kk -= ((c12015qq.m56697kk() + fM56664ck) - c1189h8.f5456k4.m56664ck()) + c1189h8.f5456k4.m56683x1();
                }
                C12007ix c12007ix = new C12007ix(c12015qq.m56699x1() + f4, fM56664ck, f5 - c12015qq.m56699x1(), fM56697kk);
                C12015qq c12015qqClone3 = C12023wl.m56853k4(C0840c3.m4438k4(strM66586k4, 0.0f, zalVarM69826c5.m74379k4(), 0, c14365qy, new C12015qq(1000.0f, 1000.0f))).Clone();
                C0840c3.m4444k4(c12007ix.Clone(), strM66586k4, 0, zalVarM69826c5.m74379k4(), zalVarM69826c5.m74387x1().Clone(), 0, 2, c14365qy);
                if (iM27462to2 > i) {
                    fM56669jd = c12015qqClone3.m56699x1() + c12015qq.m56699x1() + f4 + size;
                } else {
                    fM56669jd = f4 + iM27462to + size;
                    if (i3 % i2 == 0) {
                        fM56669jd = c1189h8.f5456k4.m56669jd() + 4 + f3;
                        fM56664ck = c12015qqClone2.m56697kk() + fM56664ck + fM27462to;
                    }
                }
                i3++;
                listM64944dy = list;
                c12015qqClone = c12015qq;
            }
            strM66586k4 = strM6616k4;
            float f52 = i / i2;
            if (((float) c1189h8.f5456k4.m56683x1()) >= c12015qqClone2.m56697kk()) {
            }
            if (c12015qq.m56697kk() + fM56664ck > c1189h8.f5456k4.m56683x1() + c1189h8.f5456k4.m56664ck()) {
            }
            C12007ix c12007ix2 = new C12007ix(c12015qq.m56699x1() + f4, fM56664ck, f52 - c12015qq.m56699x1(), fM56697kk);
            C12015qq c12015qqClone32 = C12023wl.m56853k4(C0840c3.m4438k4(strM66586k4, 0.0f, zalVarM69826c5.m74379k4(), 0, c14365qy, new C12015qq(1000.0f, 1000.0f))).Clone();
            C0840c3.m4444k4(c12007ix2.Clone(), strM66586k4, 0, zalVarM69826c5.m74379k4(), zalVarM69826c5.m74387x1().Clone(), 0, 2, c14365qy);
            if (iM27462to2 > i) {
            }
            i3++;
            listM64944dy = list;
            c12015qqClone = c12015qq;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0167  */
    /* JADX WARN: Type inference failed for: r0v14, types: [float, java.lang.String] */
    /* JADX WARN: Type inference failed for: r19v0 */
    /* JADX WARN: Type inference failed for: r19v1 */
    /* JADX WARN: Type inference failed for: r19v2, types: [float] */
    /* JADX WARN: Type inference failed for: r19v3 */
    /* JADX WARN: Type inference failed for: r4v32 */
    /* JADX WARN: Type inference failed for: r4v33 */
    /* JADX WARN: Type inference failed for: r4v4, types: [float] */
    /* JADX INFO: renamed from: k4 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void m6621k4(boolean z, C13847mr c13847mr, C14365qy c14365qy, Legend legend) {
        C12015qq c12015qq;
        int i;
        int iM63753k4;
        int i2;
        float f;
        boolean z2;
        ?? M74374du;
        ?? r19;
        C14250os c14250os;
        Class<C14250os> cls;
        int i3;
        int i4;
        float f2;
        zal zalVar;
        int i5;
        int i6;
        C12015qq c12015qq2;
        C12015qq c12015qq3;
        C14250os c14250os2;
        List<s8k> list;
        Class<C14250os> cls2;
        C14365qy c14365qy2 = c14365qy;
        zal zalVarM69826c5 = c14365qy2.m69826c5();
        m6627to(c14365qy2);
        List<s8k> listM6608k4 = m6608k4(zalVarM69826c5.m74385to(), z, zalVarM69826c5.m74386up(), c14365qy2);
        int size = listM6608k4.size();
        C1189h8 c1189h8 = zalVarM69826c5.f50511k4;
        c1189h8.m7072k4();
        C12015qq c12015qqClone = m6631x1(c14365qy2).Clone();
        int iM74377h4 = zalVarM69826c5.m74377h4();
        int iM74384m9 = zalVarM69826c5.m74384m9();
        float fM74372c5 = zalVarM69826c5.m74372c5();
        float fM74373ck = zalVarM69826c5.m74373ck();
        int iM56663c5 = c1189h8.f5456k4.m56663c5();
        int iM56683x1 = c1189h8.f5456k4.m56683x1();
        C12015qq c12015qqClone2 = C12015qq.f40552k4.Clone();
        C12015qq c12015qqClone3 = m6609k4(new C12015qq(c14365qy2.m69867v4(), c14365qy2.m69852lr()), c14365qy2).Clone();
        float fM56697kk = ((float) c1189h8.f5456k4.m56683x1()) < c12015qqClone3.m56697kk() ? c12015qqClone3.m56697kk() : c1189h8.f5456k4.m56683x1();
        int iM27462to = C7019kk.m27462to(Float.valueOf(c12015qqClone3.m56699x1() + (c12015qqClone.m56699x1() * size)), 13);
        int iM56663c52 = c1189h8.f5456k4.m56663c5() - iM74377h4;
        C12015qq c12015qq4 = new C12015qq(iM56663c52 - C7019kk.m27462to(Float.valueOf(c12015qqClone.m56699x1()), 13), fM56697kk);
        m6629x1(c12015qq4.Clone(), c14365qy2).CloneTo(c12015qqClone2);
        int i7 = 1;
        if (iM27462to <= iM56663c5 - iM74377h4) {
            f = (r3 - iM27462to) / (size + 1);
            i = size;
            z2 = true;
            c12015qq = c12015qq4;
            i2 = 0;
            iM63753k4 = 1;
            M74374du = (iM56683x1 - zalVarM69826c5.m74374du()) / 1;
        } else {
            int iM27462to2 = C7019kk.m27462to(Float.valueOf(c12015qqClone2.m56699x1() + c12015qqClone.m56699x1()), 13);
            int iM63762x1 = kc0.m63762x1(iM56663c52 / iM27462to2);
            if (iM63762x1 < 1) {
                iM63762x1 = 1;
            }
            int iM63753k42 = kc0.m63753k4(r1 / iM63762x1);
            c12015qq = c12015qq4;
            int iM63753k43 = kc0.m63753k4(r1 / iM63753k42);
            float f3 = (iM56663c52 - (iM27462to2 * iM63753k43)) / iM63753k43;
            i = iM63753k43;
            int iOooO00o = OooO.OooO00o(iM56683x1 / c12015qqClone2.m56697kk(), 14);
            if (iOooO00o == 0) {
                iOooO00o = 1;
            }
            if (iOooO00o <= iM63753k42) {
                iM63753k42 = iOooO00o;
            }
            float f4 = iM63753k42;
            byte[] byteArrayExtra = Intent.getByteArrayExtra(c12015qqClone2.m56697kk());
            iM63753k4 = kc0.m63753k4(c12015qqClone2.m56697kk() / C0840c3.m4431k4(zalVarM69826c5.m74382kk()));
            i2 = iM27462to2;
            i7 = iM63753k42;
            f = f3;
            z2 = false;
            M74374du = byteArrayExtra;
        }
        float f5 = f < 0.0f ? 0.0f : f;
        if (iM63753k4 > 1) {
            r19 = M74374du < fM74373ck ? fM74373ck : M74374du;
        } else if (M74374du < fM74372c5) {
            r19 = fM74372c5;
        }
        float fM56669jd = c1189h8.f5456k4.m56669jd();
        float fM56669jd2 = (f5 / (z2 ? 1 : 2)) + fM56669jd + iM74377h4;
        float fM56664ck = (r19 / 2.0f) + c1189h8.f5456k4.m56664ck();
        Class<C14250os> cls3 = C14250os.class;
        if (C7019kk.m27469x1(c14365qy2.m69870wy(), cls3)) {
            c14250os = (C14250os) c14365qy2.m69870wy();
            c14365qy2.m69843k4(c14250os.m68799up());
        } else {
            c14250os = null;
        }
        C12007ix c12007ixClone = c14365qy2.m69870wy().mo64335fa().Clone();
        c14365qy2.m69870wy().mo64342k4(C12007ix.m56544k4(c1189h8.f5456k4).Clone());
        float fM56697kk2 = fM56664ck;
        C14250os c14250os3 = c14250os;
        int i8 = 0;
        while (true) {
            if (i8 >= listM6608k4.size()) {
                cls = cls3;
                break;
            }
            s8k s8kVar = listM6608k4.get_Item(i8);
            Class<C14250os> cls4 = cls3;
            if (i7 > 1) {
                i4 = i8;
                i3 = i7;
                if (C14116yg.m67497to(c12015qqClone2.m56697kk() + fM56697kk2) > c1189h8.f5456k4.m56670k4()) {
                    cls = cls4;
                    break;
                }
            } else {
                i3 = i7;
                i4 = i8;
            }
            int type = c14365qy2.m69834fa().getType() != 73 ? c14365qy2.m69834fa().getType() : c14365qy2.m69834fa().getChartData().getSeries().get_Item(0).getType();
            int i9 = i2;
            C12007ix c12007ix = new C12007ix(fM56669jd2, fM56697kk2, c12015qqClone.m56699x1(), c12015qqClone.m56697kk());
            if (type != 58 && type != 59 && type != 60 && type != 61) {
                m6619k4(c12007ix.Clone(), s8kVar, c14365qy2);
            }
            String strM70481k4 = s8kVar.m70481k4();
            C12025x6 c12025x6 = new C12025x6(c12015qqClone.m56699x1() + fM56669jd2 + iM74384m9, fM56697kk2);
            if (z2) {
                float f6 = fM56697kk2;
                C12007ix c12007ix2 = new C12007ix(c12025x6.Clone(), new C12015qq(c12015qqClone2.m56699x1(), c12015qqClone2.m56697kk()));
                float f7 = fM56669jd2;
                C12013m9 c12013m9M74379k4 = zalVarM69826c5.m74379k4();
                C12003du c12003duClone = zalVarM69826c5.m74387x1().Clone();
                f2 = f6;
                zalVar = zalVarM69826c5;
                i5 = i9;
                i6 = i4;
                c12015qq2 = c12015qq;
                c12015qq3 = c12015qqClone;
                c14250os2 = c14250os3;
                list = listM6608k4;
                cls2 = cls4;
                C0840c3.m4444k4(c12007ix2, strM70481k4, 0, c12013m9M74379k4, c12003duClone, 0, 2, c14365qy2);
                C12023wl c12023wlClone = c1189h8.f5456k4.m56680m9().Clone();
                if (c12023wlClone.m56862kk() < C0840c3.m4431k4(zalVar.m74382kk())) {
                    c12023wlClone.m56866x1(kc0.m63759kk(((double) C0840c3.m4431k4(zalVar.m74382kk())) + 1.0d));
                }
                c14365qy2 = c14365qy;
                fM56669jd2 = C0840c3.m4435k4(strM70481k4, zalVar.m74382kk(), c12023wlClone.Clone()).Clone().m56699x1() + c12015qq3.m56699x1() + (iM74384m9 * 2) + f7 + f5;
            } else {
                f2 = fM56697kk2;
                zalVar = zalVarM69826c5;
                i5 = i9;
                i6 = i4;
                c12015qq2 = c12015qq;
                c12015qq3 = c12015qqClone;
                c14250os2 = c14250os3;
                list = listM6608k4;
                cls2 = cls4;
                c14365qy2 = c14365qy;
                C0840c3.m4444k4(new C12007ix(c12025x6.m56897x1(), c12025x6.m56895kk(), kc0.m63753k4(c12015qq2.m56699x1()) - 1.0f, kc0.m63753k4(c12015qq2.m56697kk())).Clone(), strM70481k4, 0, zalVar.m74379k4(), zalVar.m74387x1().Clone(), 0, 2, c14365qy2);
                fM56669jd2 = fM56669jd2 + i5 + f5;
                if ((i6 + 1) % i == 0) {
                    fM56669jd2 = (f5 / 2.0f) + c1189h8.f5456k4.m56669jd() + iM74377h4;
                    fM56697kk2 = c12015qqClone2.m56697kk() + f2 + r19;
                }
                i8 = i6 + 1;
                i2 = i5;
                cls3 = cls2;
                i7 = i3;
                listM6608k4 = list;
                zalVarM69826c5 = zalVar;
                c14250os3 = c14250os2;
                c12015qqClone = c12015qq3;
                c12015qq = c12015qq2;
            }
            fM56697kk2 = f2;
            i8 = i6 + 1;
            i2 = i5;
            cls3 = cls2;
            i7 = i3;
            listM6608k4 = list;
            zalVarM69826c5 = zalVar;
            c14250os3 = c14250os2;
            c12015qqClone = c12015qq3;
            c12015qq = c12015qq2;
        }
        C14250os c14250os4 = c14250os3;
        AbstractC14897zn abstractC14897znM69870wy = c14365qy2.m69870wy();
        if (c14250os4 == null) {
            abstractC14897znM69870wy.mo64342k4(c12007ixClone.Clone());
        } else {
            c14250os4.m68790jd().m52930k4(((C14250os) C7019kk.m27452k4((Object) abstractC14897znM69870wy, (Class) cls)).m68790jd());
            c14365qy2.m69843k4(c14250os4);
        }
    }

    /* JADX INFO: renamed from: k4 */
    public static boolean m6622k4(Chart chart) {
        if (chart.getChartData().getSeries().size() != 1) {
            return false;
        }
        if (chart.getChartData().getSeries().get_Item(0).getTrendLines() != null && chart.getChartData().getSeries().get_Item(0).getTrendLines().getCount() > 0) {
            return false;
        }
        ChartSeries chartSeries = (ChartSeries) chart.getChartData().getSeries().get_Item(0);
        int[] iArr = {0, 2, 6, 5, 3, 4, 1, 34, 32, 37, 33, 35, 19, 21, 24, 25, 20, 23, 22, 53, 54, 55, 56, 57, 70, 72, 71, 68, 69, 7, 9, 38, 40, 39, 10, 8, 11, 13, 12, 41, 43, 42, 14, 15, 17, 44, 46, 45, 18, 16};
        int i = 0;
        while (i < 50 && chartSeries.getType() != iArr[i]) {
            i++;
        }
        if (i == 50) {
            return false;
        }
        IChartDataPointCollection dataPoints = chartSeries.getDataPoints();
        if (chartSeries.isColorVaried()) {
            return true;
        }
        return dataPoints.size() > 0 && !m6624k4(dataPoints);
    }

    /* JADX INFO: renamed from: k4 */
    private static boolean m6623k4(List<C13847mr> list) {
        for (int i = 0; i < list.size(); i++) {
            C13847mr c13847mr = list.get_Item(i);
            if (c13847mr.m64945h4().getFormat().getLine().getFillFormat().getFillType() != 0 && ChartTypeCharacterizer.m757du(c13847mr.m64945h4().getType())) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: k4 */
    private static boolean m6624k4(IChartDataPointCollection iChartDataPointCollection) {
        for (int i = 1; i < iChartDataPointCollection.size(); i++) {
            boolean zEquals = iChartDataPointCollection.get_Item(0).getFormat().equals(iChartDataPointCollection.get_Item(i).getFormat());
            boolean zEquals2 = iChartDataPointCollection.get_Item(0).getMarker().getFormat().equals(iChartDataPointCollection.get_Item(i).getMarker().getFormat());
            boolean zM66592x1 = C14057f9.m66592x1(iChartDataPointCollection.get_Item(0).getMarker().getSize(), iChartDataPointCollection.get_Item(i).getMarker().getSize());
            boolean zM66412k4 = C14042ak.m66412k4(MarkerStyleType.class, iChartDataPointCollection.get_Item(0).getMarker().getSymbol(), MarkerStyleType.class, iChartDataPointCollection.get_Item(i).getMarker().getSymbol());
            if (!zEquals || !zEquals2 || !zM66592x1 || !zM66412k4) {
                return false;
            }
        }
        return true;
    }
}
