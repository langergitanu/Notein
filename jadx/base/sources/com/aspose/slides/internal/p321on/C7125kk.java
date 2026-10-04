package com.aspose.slides.internal.p321on;

import OooOO0.OooO0OO;
import com.aspose.slides.Collections.Generic.IGenericEnumerator;
import com.aspose.slides.Collections.Generic.KeyValuePair;
import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.internal.p081de.C3155to;
import com.aspose.slides.internal.p087dm.C3181c5;
import com.aspose.slides.internal.p087dm.C3182du;
import com.aspose.slides.internal.p087dm.C3187kk;
import com.aspose.slides.internal.p087dm.InterfaceC3186k4;
import com.aspose.slides.internal.p099e3.C3551h4;
import com.aspose.slides.internal.p099e3.C3552k4;
import com.aspose.slides.internal.p115eq.C3791ks;
import com.aspose.slides.internal.p115eq.C3792m9;
import com.aspose.slides.internal.p115eq.C3794up;
import com.aspose.slides.internal.p231kk.C5791k4;
import com.aspose.slides.internal.p231kk.InterfaceC5775ar;
import com.aspose.slides.internal.p231kk.InterfaceC5797ne;
import com.aspose.slides.internal.p231kk.InterfaceC5799qq;
import com.aspose.slides.internal.p252lk.C6108x1;
import com.aspose.slides.internal.p298nh.AbstractC6897x1;
import com.aspose.slides.internal.p298nh.C6886ck;
import com.aspose.slides.internal.p298nh.C6889fa;
import com.aspose.slides.internal.p298nh.C6896up;
import com.aspose.slides.internal.p300nj.C6911du;
import com.aspose.slides.internal.p300nj.C6914kk;
import com.aspose.slides.internal.p300nj.C6915to;
import com.aspose.slides.internal.p300nj.C6916x1;
import com.aspose.slides.internal.p314oc.C7017h4;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.internal.p379rg.C10006k4;
import com.aspose.slides.internal.p379rg.C10007x1;
import com.aspose.slides.internal.p404sp.C10307du;
import com.aspose.slides.internal.p404sp.C10308dy;
import com.aspose.slides.internal.p404sp.C10309h4;
import com.aspose.slides.internal.p404sp.C10314to;
import com.aspose.slides.internal.p472w8.C11896dy;
import com.aspose.slides.internal.p472w8.C11913yj;
import com.aspose.slides.internal.p475wh.C12003du;
import com.aspose.slides.internal.p475wh.C12007ix;
import com.aspose.slides.internal.p475wh.C12015qq;
import com.aspose.slides.internal.p475wh.C12018u4;
import com.aspose.slides.internal.p475wh.C12025x6;
import com.aspose.slides.internal.p492x4.C12380dy;
import com.aspose.slides.internal.p505xn.C12565ks;
import com.aspose.slides.p559ms.System.AbstractC14092to;
import com.aspose.slides.p559ms.System.C14113y2;
import com.aspose.slides.p559ms.System.C14116yg;
import com.aspose.slides.p559ms.System.IDisposable;
import com.aspose.words.ControlChar;
import com.huawei.hms.network.embedded.C18241k5;
import java.util.Iterator;

/* JADX INFO: renamed from: com.aspose.slides.internal.on.kk */
/* JADX INFO: loaded from: classes4.dex */
public class C7125kk {

    /* JADX INFO: renamed from: k4 */
    private static final String f19232k4 = C14113y2.m67408k4(",width,height,opacity,cap-height,rotate,text-anchor,view-clip-id,color,visibility,display,xml:base,", "font-family,font-style,font-size,font-weight,font-variant,glyph-orientation-horizontal,glyph-orientation-vertical,", ",fill,fill-rule,fill-opacity,", ",stroke,stroke-width,stroke-opacity,stroke-linejoin,stroke-miterlimit,stroke-dasharray,stroke-dashoffset,stroke-linecap,", ",marker-start,marker-mid,marker-end,");

    /* JADX INFO: renamed from: x1 */
    private static final C7017h4 f19233x1 = new C7017h4("bevel", "round");

    /* JADX INFO: renamed from: k4 */
    public static double m27649k4(C12025x6 c12025x6, C12025x6 c12025x62) {
        return (C14116yg.m67498to(c12025x62.m56895kk() - c12025x6.m56895kk(), c12025x62.m56897x1() - c12025x6.m56897x1()) * 180.0d) / 3.141592653589793d;
    }

    /* JADX INFO: renamed from: kk */
    private static C12018u4 m27662kk(C3155to c3155to, InterfaceC3186k4 interfaceC3186k4, C12015qq c12015qq, C3181c5 c3181c5) {
        C10006k4 c10006k4;
        String str = c3181c5.f9461x1.get_Item("clip-path");
        if (C14113y2.m67411k4(str) || !C14113y2.m67448x1(str, "url(#") || (c10006k4 = (C10006k4) C7019kk.m27452k4((Object) c3155to.m13494to().m15116k4(str), C10006k4.class)) == null) {
            return null;
        }
        C12015qq c12015qqClone = c12015qq.Clone();
        C12007ix c12007ixClone = C12007ix.f40519k4.Clone();
        if (c10006k4.m49129wy()) {
            interfaceC3186k4.mo13679k4(c3155to.m13485du(), c12015qq.Clone()).CloneTo(c12007ixClone);
            c12007ixClone.m56570m9().CloneTo(c12015qqClone);
        }
        C12018u4 c12018u4 = new C12018u4();
        c12018u4.m56764to();
        int i = c3155to.m13485du().f10318k4;
        try {
            C12018u4 c12018u4M27654k4 = m27654k4(c3155to, interfaceC3186k4, c12015qq.Clone(), c10006k4);
            c3155to.m13485du().f10318k4 = c10006k4.m49129wy() ? 1 : 0;
            c3155to.m13489k4(c10006k4, c12015qqClone.Clone(), c12018u4);
            if (c10006k4.m13636lr()) {
                c12018u4.m56771x1(c3155to.m13493m9().m15149k4(c10006k4.m13642v4(), c12015qqClone.Clone()));
            }
            if (c10006k4.m49129wy()) {
                C11913yj c11913yj = new C11913yj();
                c11913yj.m55777kk(c12007ixClone.m56557jd(), c12007ixClone.m56551ck());
                c12018u4.m56771x1(c11913yj);
            }
            if (c12018u4M27654k4 != null) {
                c12018u4.m56761kk(c12018u4M27654k4);
            }
            c3155to.m13485du().f10318k4 = i;
            return c12018u4;
        } catch (Throwable th) {
            c3155to.m13485du().f10318k4 = i;
            throw th;
        }
    }

    /* JADX INFO: renamed from: to */
    private static C12018u4 m27663to(C3155to c3155to, InterfaceC3186k4 interfaceC3186k4, C12015qq c12015qq, C3181c5 c3181c5) {
        String str = c3181c5.f9461x1.get_Item("clip");
        if (!C14113y2.m67411k4(str) && C14113y2.m67448x1(str, "rect(")) {
            int iM67429to = C14113y2.m67429to(str, '(');
            String[] strArrM67417k4 = C14113y2.m67417k4(C14113y2.m67443x1(str, iM67429to + 1, (C14113y2.m67429to(str, ')') - iM67429to) - 1), new String[]{" ", ","}, 1);
            List list = new List();
            for (String str2 : strArrM67417k4) {
                list.addItem(Float.valueOf(C10308dy.m50270k4(str2)));
            }
            if (list.size() == 4) {
                C12007ix c12007ixClone = interfaceC3186k4.mo13679k4(c3155to.m13485du(), c12015qq.Clone()).Clone();
                return new C12018u4(new C12007ix(((Float) list.get_Item(3)).floatValue() + c12007ixClone.m56571to(), ((Float) list.get_Item(0)).floatValue() + c12007ixClone.m56554dy(), c12007ixClone.m56550c5() - (((Float) list.get_Item(1)).floatValue() + ((Float) list.get_Item(3)).floatValue()), c12007ixClone.m56575x1() - (((Float) list.get_Item(0)).floatValue() + ((Float) list.get_Item(2)).floatValue())).Clone());
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: x1 */
    private static C12018u4 m27664x1(C3155to c3155to, InterfaceC3186k4 interfaceC3186k4, C12015qq c12015qq, C3181c5 c3181c5) {
        C10007x1 c10007x1M27653k4 = m27653k4(c3155to, c3181c5);
        if (c10007x1M27653k4 == null) {
            return null;
        }
        C12018u4 c12018u4 = new C12018u4();
        c12018u4.m56764to();
        C12007ix c12007ixClone = C12007ix.f40519k4.Clone();
        C12015qq c12015qqClone = C12015qq.f40552k4.Clone();
        if (c10007x1M27653k4.m49131b3() == 1 || c10007x1M27653k4.m49134wy() == 1) {
            interfaceC3186k4.mo13679k4(c3155to.m13485du(), c12015qq.Clone()).CloneTo(c12007ixClone);
            c12007ixClone.m56570m9().CloneTo(c12015qqClone);
        }
        C12007ix c12007ixClone2 = c10007x1M27653k4.mo13679k4(c3155to.m13485du(), (c10007x1M27653k4.m49131b3() == 0 ? c12015qq : c12015qqClone).Clone().Clone()).Clone();
        int i = c3155to.m13485du().f10318k4;
        try {
            c3155to.m13485du().f10318k4 = c10007x1M27653k4.m49134wy() == 0 ? 0 : 1;
            if (c10007x1M27653k4.m49134wy() != 0) {
                c12015qq = c12015qqClone;
            }
            c3155to.m13489k4(c10007x1M27653k4, c12015qq.Clone().Clone(), c12018u4);
            if (c10007x1M27653k4.m49131b3() == 1) {
                C11913yj c11913yj = new C11913yj();
                c11913yj.m55777kk(c12007ixClone.m56557jd(), c12007ixClone.m56551ck());
                c12018u4.m56771x1(c11913yj);
            }
            c12018u4.m56772x1(c12007ixClone2.Clone());
            c3155to.m13485du().f10318k4 = i;
            return c12018u4;
        } catch (Throwable th) {
            c3155to.m13485du().f10318k4 = i;
            throw th;
        }
    }

    /* JADX INFO: renamed from: k4 */
    public static List<C5791k4> m27650k4(InterfaceC5775ar interfaceC5775ar, String str, String str2) {
        boolean zM27456k4;
        List<C5791k4> list = new List<>();
        if (!C14113y2.m67411k4(str) && C14113y2.m67411k4(str2) && interfaceC5775ar != null) {
            String[] strArrM67414k4 = C14113y2.m67414k4(C14113y2.m67440x1(str), ControlChar.SPACE_CHAR);
            IGenericEnumerator<InterfaceC5797ne> it = interfaceC5775ar.mo23390x1().iterator();
            while (it.hasNext()) {
                try {
                    InterfaceC5799qq interfaceC5799qq = (InterfaceC5799qq) C7019kk.m27452k4((Object) it.next(), InterfaceC5799qq.class);
                    if (interfaceC5799qq != null && interfaceC5799qq.mo23686h4() != null) {
                        String[] strArrM67414k42 = C14113y2.m67414k4(C14113y2.m67440x1(interfaceC5799qq.mo23687kk()), ',');
                        for (String str3 : strArrM67414k4) {
                            for (String str4 : strArrM67414k42) {
                                if (C14113y2.m67363du(C14113y2.m67408k4(".", str3), C14113y2.m67440x1(str4))) {
                                    list.addItem(new C5791k4(interfaceC5799qq.mo23686h4()));
                                }
                            }
                        }
                    }
                } finally {
                    if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                        it.dispose();
                    }
                }
            }
            if (zM27456k4) {
                return list;
            }
        }
        return list;
    }

    /* JADX INFO: renamed from: x1 */
    public static void m27665x1(C3155to c3155to, C11896dy c11896dy, C12015qq c12015qq, C3181c5 c3181c5) {
        C3155to c3155to2;
        C11896dy c11896dy2;
        AbstractC6897x1 c6896up;
        C3182du c3182du = (C3182du) c3181c5;
        if (c3182du.m13676yj()) {
            c11896dy.m55537k4(C6108x1.m24745kk(c3181c5.m13629bv()));
            String strM13670up = c3182du.m13670up();
            float fM13663ks = c3182du.m13663ks();
            if (C14113y2.m67448x1(strM13670up, "url(#")) {
                c3155to2 = c3155to;
                c11896dy2 = c11896dy;
                c6896up = m27651k4(c3155to2, c11896dy2, c12015qq.Clone(), (C3182du) c3181c5, fM13663ks, strM13670up, false);
                if (c6896up == null) {
                    c6896up = m27652k4(strM13670up, fM13663ks);
                }
            } else {
                c3155to2 = c3155to;
                c11896dy2 = c11896dy;
                c6896up = new C6896up(C12003du.m56400k4(OooO0OO.OooO0OO(fM13663ks, 255.0f, 13), C10314to.m50289k4(strM13670up).m50292k4().Clone().Clone()).Clone());
            }
            if (c6896up != null) {
                c3155to2.m13488k4().mo9695k4(c6896up, c11896dy2);
            }
        }
    }

    /* JADX INFO: renamed from: k4 */
    private static AbstractC6897x1 m27651k4(C3155to c3155to, C11896dy c11896dy, C12015qq c12015qq, C3182du c3182du, float f, String str, boolean z) {
        C3181c5 c3181c5M15116k4 = c3155to.m13494to().m15116k4(C3794up.m15166kk(str));
        C12007ix c12007ixClone = c11896dy.m55523c5().Clone();
        if (C7019kk.m27469x1(c3181c5M15116k4, C6916x1.class)) {
            return ((C6916x1) c3181c5M15116k4).m27114k4(c3182du, c3155to.m13494to(), c3155to.m13485du(), c12007ixClone.Clone(), new C12007ix(new C12025x6(0.0f, 0.0f), c12015qq.Clone()), f);
        }
        if (!C7019kk.m27469x1(c3181c5M15116k4, C6911du.class)) {
            if (C7019kk.m27469x1(c3181c5M15116k4, C6915to.class)) {
                return C7126to.m27666k4((C6915to) c3181c5M15116k4, c3155to, c3182du, c12007ixClone.Clone(), new C12007ix(new C12025x6(0.0f, 0.0f), c12015qq.Clone()), f);
            }
            return null;
        }
        C6911du c6911du = (C6911du) c3181c5M15116k4;
        C11896dy[] c11896dyArr = {null};
        AbstractC6897x1 abstractC6897x1M27049k4 = c6911du.m27049k4(c3182du, c3155to.m13494to(), c3155to.m13485du(), c12007ixClone.Clone(), new C12007ix(new C12025x6(0.0f, 0.0f), c12015qq.Clone()), f, c11896dyArr);
        C11896dy c11896dy2 = c11896dyArr[0];
        if (abstractC6897x1M27049k4 == null || c6911du.m27062ak() != 0) {
            return abstractC6897x1M27049k4;
        }
        C12018u4 c12018u4Mo9704x1 = c3155to.m13488k4().mo9704x1();
        try {
            C6896up c6896up = new C6896up(((C6886ck) abstractC6897x1M27049k4).m26963m9().m55668k4()[0].Clone().Clone());
            try {
                C12018u4 c12018u4M56768x1 = c12018u4Mo9704x1.m56768x1();
                c12018u4M56768x1.m56750k4(c11896dy2);
                c3155to.m13488k4().mo9706x1(c12018u4M56768x1);
                if (z) {
                    m27655k4(c3155to, new C6889fa(c6896up), c11896dy, c12015qq.Clone(), c3182du);
                } else {
                    c3155to.m13488k4().mo9695k4(c6896up, c11896dy);
                }
                c6896up.dispose();
                c3155to.m13488k4().mo9706x1(c12018u4Mo9704x1);
                return abstractC6897x1M27049k4;
            } catch (Throwable th) {
                c6896up.dispose();
                throw th;
            }
        } catch (Throwable th2) {
            c3155to.m13488k4().mo9706x1(c12018u4Mo9704x1);
            throw th2;
        }
    }

    /* JADX INFO: renamed from: k4 */
    private static AbstractC6897x1 m27652k4(String str, float f) {
        String strM57972k4 = C12380dy.m57972k4(str, "url\\(.*?\\)", "");
        if (C14113y2.m67411k4(C14113y2.m67440x1(strM57972k4))) {
            return null;
        }
        return new C6896up(C12003du.m56400k4(OooO0OO.OooO0OO(f, 255.0f, 13), C10314to.m50289k4(strM57972k4).m50292k4().Clone().Clone()).Clone());
    }

    /* JADX INFO: renamed from: k4 */
    public static C10007x1 m27653k4(C3155to c3155to, C3181c5 c3181c5) {
        String str = c3181c5.f9461x1.get_Item("mask");
        if (C14113y2.m67411k4(str) || !C14113y2.m67448x1(str, "url(#")) {
            return null;
        }
        return (C10007x1) C7019kk.m27452k4((Object) c3155to.m13494to().m15116k4(str), C10007x1.class);
    }

    /* JADX INFO: renamed from: k4 */
    public static C12018u4 m27654k4(C3155to c3155to, InterfaceC3186k4 interfaceC3186k4, C12015qq c12015qq, C3181c5 c3181c5) {
        C12018u4 c12018u4M27662kk = m27662kk(c3155to, interfaceC3186k4, c12015qq.Clone(), c3181c5);
        C12018u4 c12018u4M27663to = m27663to(c3155to, interfaceC3186k4, c12015qq.Clone(), c3181c5);
        if (c12018u4M27663to != null) {
            if (c12018u4M27662kk != null) {
                c12018u4M27662kk.m56761kk(c12018u4M27663to);
            } else {
                c12018u4M27662kk = c12018u4M27663to;
            }
        }
        C12018u4 c12018u4M27664x1 = m27664x1(c3155to, interfaceC3186k4, c12015qq.Clone(), c3181c5);
        if (c12018u4M27664x1 == null) {
            return c12018u4M27662kk;
        }
        if (c12018u4M27662kk == null) {
            return c12018u4M27664x1;
        }
        c12018u4M27662kk.m56761kk(c12018u4M27664x1);
        return c12018u4M27662kk;
    }

    /* JADX INFO: renamed from: k4 */
    private static void m27655k4(C3155to c3155to, C6889fa c6889fa, C11896dy c11896dy, C12015qq c12015qq, C3182du c3182du) {
        C11896dy c11896dy2;
        if (c6889fa == null) {
            return;
        }
        float fM15125k4 = c3155to.m13485du().m15125k4(c3182du.m13649dy(), "xy", c3182du, c12015qq.Clone());
        if (fM15125k4 <= 0.0f) {
            return;
        }
        c6889fa.m26980kk(fM15125k4);
        C10309h4 c10309h4M13646ck = c3182du.m13646ck();
        if (!C10309h4.m50274k4(c10309h4M13646ck)) {
            List list = new List();
            Iterator<C10307du> it = c10309h4M13646ck.iterator();
            while (it.hasNext()) {
                list.addItem(Float.valueOf(c3155to.m13485du().m15125k4(it.next(), "xy", c3182du, c12015qq.Clone()) / fM15125k4));
            }
            if (!list.containsItem(Float.valueOf(0.0f))) {
                if (list.size() % 2 != 0) {
                    list.addRange(list.asReadOnly());
                }
                float[] fArr = new float[list.size()];
                list.copyTo(AbstractC14092to.m67208k4(fArr), 0);
                c6889fa.m26978k4(fArr);
                c6889fa.m26975k4(c3155to.m13485du().m15125k4(c3182du.m13650fa(), "xy", c3182du, c12015qq.Clone()) / fM15125k4);
            }
        }
        int iM27428k4 = f19233x1.m27428k4(C14113y2.m67368h4(c3182du.f9461x1.m13690kk("stroke-linejoin", "miter")));
        if (iM27428k4 == 0) {
            c6889fa.m26989x1(1);
        } else if (iM27428k4 != 1) {
            c6889fa.m26989x1(3);
            c6889fa.m26988x1(C10308dy.m50271k4(c3182du.f9461x1.m13690kk("stroke-miterlimit", "4"), 4.0f));
        } else {
            c6889fa.m26989x1(2);
        }
        boolean z = c11896dy.m55523c5().m56550c5() <= 0.0f && c11896dy.m55523c5().m56575x1() <= 0.0f && c11896dy.m55525du() > 0;
        int iM13653jd = c3182du.m13653jd();
        if (iM13653jd == 1) {
            c6889fa.m26981kk(2);
            c6889fa.m26976k4(2);
            if (z) {
                c11896dy2 = new C11896dy();
                try {
                    C12025x6[] c12025x6ArrM55565kk = c11896dy.m55565kk();
                    float f = fM15125k4 / 2.0f;
                    c11896dy2.m55534k4(c12025x6ArrM55565kk[0].m56897x1() - f, c12025x6ArrM55565kk[0].m56895kk() - f, fM15125k4, fM15125k4);
                    c3155to.m13488k4().mo9695k4(c6889fa.m26979kk(), c11896dy2);
                    return;
                } finally {
                }
            }
        } else if (iM13653jd == 2) {
            c6889fa.m26981kk(1);
            c6889fa.m26976k4(1);
            if (z) {
                c11896dy2 = new C11896dy();
                try {
                    C12025x6[] c12025x6ArrM55565kk2 = c11896dy.m55565kk();
                    float f2 = fM15125k4 / 2.0f;
                    c11896dy2.m55578x1(new C12007ix(c12025x6ArrM55565kk2[0].m56897x1() - f2, c12025x6ArrM55565kk2[0].m56895kk() - f2, fM15125k4, fM15125k4));
                    c3155to.m13488k4().mo9695k4(c6889fa.m26979kk(), c11896dy2);
                    return;
                } finally {
                }
            }
        }
        C11913yj c11913yjMo9688du = c3155to.m13488k4().mo9688du();
        try {
            float[] fArrM15147k4 = C3791ks.m15147k4(c11913yjMo9688du);
            float f3 = fArrM15147k4[0];
            float f4 = fArrM15147k4[1];
            if (c6889fa.m26990x6() <= 1.0f && (f3 > 1.0f || f4 > 1.0f)) {
                c6889fa.m26980kk(c6889fa.m26990x6() + 0.01f);
            }
            if (c6889fa.m26990x6() * f3 < 1.0f && c6889fa.m26990x6() * f4 < 1.0f && C7019kk.m27469x1(c6889fa.m26979kk(), C6896up.class)) {
                c6889fa.m26977k4(C12003du.m56400k4(C7019kk.m27462to(Float.valueOf((r14.m56501c5() & 255) * c6889fa.m26990x6() * f3), 13), c6889fa.m26985to().Clone().Clone()).Clone());
            }
            c3155to.m13488k4().mo9694k4(c6889fa, c11896dy);
            c3155to.m13488k4().mo9698k4(c11913yjMo9688du);
        } catch (Throwable th) {
            c3155to.m13488k4().mo9698k4(c11913yjMo9688du);
            throw th;
        }
    }

    /* JADX INFO: renamed from: k4 */
    public static void m27656k4(C3155to c3155to, C11896dy c11896dy, C3181c5 c3181c5, C12015qq c12015qq) {
        int i;
        C3182du c3182du;
        C6914kk c6914kk;
        int i2;
        boolean zM27456k4;
        C3182du c3182du2 = (C3182du) C7019kk.m27452k4((Object) c3181c5, C3182du.class);
        List.Enumerator<C5791k4> it = m27650k4(c3155to.m13487h4().m15134k4(), c3182du2.m13651h4(), c3182du2.m13647du()).iterator();
        while (it.hasNext()) {
            try {
                C5791k4 next = it.next();
                if (!C14113y2.m67432to("hidden", next.mo23515k5(), (short) 3) && !C14113y2.m67432to("collapse", next.mo23515k5(), (short) 3)) {
                    if (C14113y2.m67432to("none", next.mo23519kp(), (short) 3)) {
                        if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                            it.dispose();
                            return;
                        }
                        return;
                    } else {
                        if (!C14113y2.m67411k4(next.m23665k1())) {
                            c3182du2.m13669to(next.m23665k1());
                        }
                        if (!C14113y2.m67411k4(next.m23673wt())) {
                            c3182du2.m13661kk(next.m23673wt());
                        }
                    }
                }
                if (zM27456k4) {
                    return;
                } else {
                    return;
                }
            } finally {
                if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                    it.dispose();
                }
            }
        }
        if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
            it.dispose();
        }
        m27665x1(c3155to, c11896dy, c12015qq.Clone(), c3181c5);
        m27657k4(c3155to, c11896dy, c12015qq.Clone(), c3181c5);
        int iM55525du = c11896dy.m55525du();
        if (iM55525du > 0) {
            byte[] bArrM55571to = c11896dy.m55571to();
            C12025x6[] c12025x6ArrM55565kk = c11896dy.m55565kk();
            C6914kk c6914kk2 = (C6914kk) C7019kk.m27452k4((Object) c3155to.m13494to().m15117k4(C3794up.m15166kk(c3182du2.m13666rv()), false), C6914kk.class);
            C6914kk c6914kk3 = (C6914kk) C7019kk.m27452k4((Object) c3155to.m13494to().m15117k4(C3794up.m15166kk(c3182du2.m13675x6()), false), C6914kk.class);
            C6914kk c6914kk4 = (C6914kk) C7019kk.m27452k4((Object) c3155to.m13494to().m15117k4(C3794up.m15166kk(c3182du2.m13665ne()), false), C6914kk.class);
            if (c6914kk2 != null) {
                c3182du = c3182du2;
                i = 2;
                C7127x1.m27669k4(c3155to, c12015qq.Clone(), c3182du, c6914kk2, c12025x6ArrM55565kk[0].Clone(), iM55525du >= 2 ? m27649k4(c12025x6ArrM55565kk[0].Clone().Clone(), c12025x6ArrM55565kk[1].Clone().Clone()) : 0.0d);
            } else {
                i = 2;
                c3182du = c3182du2;
            }
            if (c6914kk3 != null) {
                int i3 = 1;
                int i4 = 0;
                while (i3 < iM55525du - 1) {
                    if ((bArrM55571to[i3] & 255) != 3 || (i4 = i4 + 1) >= 3) {
                        C12025x6 c12025x6Clone = c12025x6ArrM55565kk[i3 - 1].Clone();
                        C12025x6 c12025x6Clone2 = c12025x6ArrM55565kk[i3 + 1].Clone();
                        C12025x6 c12025x6Clone3 = c12025x6ArrM55565kk[i3].Clone();
                        double dM27649k4 = (m27649k4(c12025x6Clone3.Clone(), c12025x6Clone2.Clone()) + m27649k4(c12025x6Clone.Clone(), c12025x6Clone3.Clone())) / 2.0d;
                        c6914kk = c6914kk3;
                        i2 = i3;
                        C7127x1.m27669k4(c3155to, c12015qq.Clone(), c3182du, c6914kk, c12025x6Clone3.Clone(), dM27649k4);
                        i4 = 0;
                    } else {
                        c6914kk = c6914kk3;
                        i2 = i3;
                    }
                    i3 = i2 + 1;
                    c6914kk3 = c6914kk;
                }
            }
            if (c6914kk4 != null) {
                C12025x6 c12025x6Clone4 = c12025x6ArrM55565kk[iM55525du - 1].Clone();
                C7127x1.m27669k4(c3155to, c12015qq.Clone(), c3182du, c6914kk4, c12025x6Clone4.Clone(), c11896dy.m55525du() >= i ? m27649k4(c12025x6ArrM55565kk[iM55525du - i].Clone().Clone(), c12025x6Clone4.Clone()) : 0.0d);
            }
        }
    }

    /* JADX INFO: renamed from: k4 */
    public static void m27657k4(C3155to c3155to, C11896dy c11896dy, C12015qq c12015qq, C3181c5 c3181c5) {
        C3155to c3155to2;
        C11896dy c11896dy2;
        C6889fa c6889fa;
        C3182du c3182du = (C3182du) c3181c5;
        float fM15125k4 = c3155to.m13485du().m15125k4(c3182du.m13649dy(), "xy", c3181c5, c12015qq.Clone());
        if (!C3794up.m15165k4(c3182du.m13664m9()) || fM15125k4 <= 0.0f) {
            return;
        }
        String strM13664m9 = c3182du.m13664m9();
        float fM13645c5 = c3182du.m13645c5();
        if (C14113y2.m67448x1(strM13664m9, "url(#")) {
            c3155to2 = c3155to;
            c11896dy2 = c11896dy;
            AbstractC6897x1 abstractC6897x1M27651k4 = m27651k4(c3155to2, c11896dy2, c12015qq.Clone(), c3182du, fM13645c5, strM13664m9, true);
            if (abstractC6897x1M27651k4 == null) {
                abstractC6897x1M27651k4 = m27652k4(strM13664m9, fM13645c5);
            }
            c6889fa = abstractC6897x1M27651k4 != null ? new C6889fa(abstractC6897x1M27651k4) : null;
        } else {
            c3155to2 = c3155to;
            c11896dy2 = c11896dy;
            c6889fa = new C6889fa(C12003du.m56400k4(OooO0OO.OooO0OO(fM13645c5, 255.0f, 13), C10314to.m50289k4(strM13664m9).m50292k4().Clone().Clone()).Clone());
        }
        m27655k4(c3155to2, c6889fa, c11896dy2, c12015qq.Clone(), c3182du);
    }

    /* JADX INFO: renamed from: k4 */
    public static void m27658k4(C3181c5 c3181c5) {
        m27660k4(c3181c5, false);
    }

    /* JADX INFO: renamed from: k4 */
    public static void m27659k4(C3181c5 c3181c5, String str, String str2) {
        IGenericEnumerator<KeyValuePair<Integer, C3181c5>> it = c3181c5.m13628ar().iterator();
        while (it.hasNext()) {
            try {
                KeyValuePair<Integer, C3181c5> next = it.next();
                if (!next.getValue().f9461x1.containsKey(str) || C14113y2.m67432to("inherit", next.getValue().f9461x1.get_Item(str), (short) 3)) {
                    next.getValue().f9461x1.set_Item(str, str2);
                }
            } catch (Throwable th) {
                if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                    it.dispose();
                }
                throw th;
            }
        }
        if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
            it.dispose();
        }
    }

    /* JADX INFO: renamed from: k4 */
    public static void m27660k4(C3181c5 c3181c5, boolean z) {
        if (z || !(C7019kk.m27469x1(c3181c5, C3552k4.class) || C7019kk.m27469x1(c3181c5, C10006k4.class) || C7019kk.m27469x1(c3181c5, C3551h4.class))) {
            String[] strArr = {"fill", "stroke", "stop-color", "flood-color", "lighting-color"};
            for (int i = 0; i < 5; i++) {
                String str = strArr[i];
                if (c3181c5.f9461x1.containsKey(str) && "currentColor".equals(c3181c5.f9461x1.get_Item(str))) {
                    C3187kk c3187kk = c3181c5.f9461x1;
                    c3187kk.set_Item(str, c3187kk.containsKey("color") ? c3181c5.f9461x1.get_Item("color") : "black");
                }
            }
            IGenericEnumerator<KeyValuePair<String, String>> it = c3181c5.f9461x1.iterator();
            while (it.hasNext()) {
                try {
                    KeyValuePair<String, String> next = it.next();
                    String key = next.getKey();
                    String value = next.getValue();
                    if (C12565ks.m58621k4(f19232k4, C14113y2.m67408k4(",", key, ","), true)) {
                        if ("style".equals(next.getKey()) || "class".equals(next.getKey())) {
                            String strM15153x1 = C14113y2.f47374k4;
                            if ("style".equals(next.getKey())) {
                                strM15153x1 = next.getValue();
                            } else if ("class".equals(next.getKey())) {
                                strM15153x1 = new C3792m9().m15153x1(next.getValue());
                            }
                            for (String str2 : C14113y2.m67417k4(strM15153x1, new String[]{";"}, 1)) {
                                String[] strArrM67417k4 = C14113y2.m67417k4(str2, new String[]{C18241k5.f55433h}, 1);
                                if (strArrM67417k4.length >= 2) {
                                    m27659k4(c3181c5, C14113y2.m67440x1(strArrM67417k4[0]), C14113y2.m67440x1(strArrM67417k4[1]));
                                }
                            }
                        } else {
                            m27659k4(c3181c5, key, value);
                        }
                    }
                } catch (Throwable th) {
                    if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                        it.dispose();
                    }
                    throw th;
                }
            }
            if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                it.dispose();
            }
            IGenericEnumerator<KeyValuePair<Integer, C3181c5>> it2 = c3181c5.m13628ar().iterator();
            while (it2.hasNext()) {
                try {
                    m27660k4(it2.next().getValue(), z);
                } finally {
                    if (C7019kk.m27456k4((Iterator) it2, (Class<IDisposable>) IDisposable.class)) {
                        it2.dispose();
                    }
                }
            }
        }
    }

    /* JADX INFO: renamed from: k4 */
    public static void m27661k4(C12018u4 c12018u4, C11896dy c11896dy, C3155to c3155to, C3181c5 c3181c5, C12015qq c12015qq) {
        if (c11896dy.m55525du() <= 0) {
            return;
        }
        if (c3181c5.m13636lr()) {
            c11896dy.m55577x1(c3155to.m13493m9().m15149k4(c3181c5.m13642v4(), c12015qq.Clone()));
        }
        c12018u4.m56758kk(c11896dy);
    }
}
