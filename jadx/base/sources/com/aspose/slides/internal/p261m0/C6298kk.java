package com.aspose.slides.internal.p261m0;

import OooOO0.OooO0OO;
import Oooo0.C20855OooooOO;
import com.aspose.slides.Collections.Generic.Dictionary;
import com.aspose.slides.Collections.Generic.IGenericEnumerator;
import com.aspose.slides.Collections.Generic.KeyValuePair;
import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.OooO0O0;
import com.aspose.slides.exceptions.ArgumentException;
import com.aspose.slides.internal.p080dd.C3152yj;
import com.aspose.slides.internal.p087dm.C3181c5;
import com.aspose.slides.internal.p087dm.C3182du;
import com.aspose.slides.internal.p087dm.C3187kk;
import com.aspose.slides.internal.p115eq.C3783ck;
import com.aspose.slides.internal.p115eq.C3784du;
import com.aspose.slides.internal.p115eq.C3786fa;
import com.aspose.slides.internal.p115eq.C3787h4;
import com.aspose.slides.internal.p115eq.C3791ks;
import com.aspose.slides.internal.p115eq.C3794up;
import com.aspose.slides.internal.p115eq.C3796yj;
import com.aspose.slides.internal.p136fr.C4113k4;
import com.aspose.slides.internal.p138fu.C4123dy;
import com.aspose.slides.internal.p138fu.C4127k4;
import com.aspose.slides.internal.p138fu.C4130m9;
import com.aspose.slides.internal.p151gj.C4318fa;
import com.aspose.slides.internal.p151gj.C4319h4;
import com.aspose.slides.internal.p151gj.C4320jd;
import com.aspose.slides.internal.p151gj.C4324m9;
import com.aspose.slides.internal.p151gj.C4327up;
import com.aspose.slides.internal.p151gj.C4328x1;
import com.aspose.slides.internal.p223ka.C5656k4;
import com.aspose.slides.internal.p231kk.C5791k4;
import com.aspose.slides.internal.p300nj.C6912h4;
import com.aspose.slides.internal.p314oc.C7017h4;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.internal.p321on.C7125kk;
import com.aspose.slides.internal.p346pw.C9573kk;
import com.aspose.slides.internal.p404sp.C10308dy;
import com.aspose.slides.internal.p404sp.C10314to;
import com.aspose.slides.internal.p420th.C10951c5;
import com.aspose.slides.internal.p420th.C10971um;
import com.aspose.slides.internal.p463vm.C11697x1;
import com.aspose.slides.internal.p472w8.C11896dy;
import com.aspose.slides.internal.p472w8.C11902kk;
import com.aspose.slides.internal.p472w8.C11906rv;
import com.aspose.slides.internal.p472w8.C11913yj;
import com.aspose.slides.internal.p475wh.AbstractC12024x1;
import com.aspose.slides.internal.p475wh.C11999ar;
import com.aspose.slides.internal.p475wh.C12003du;
import com.aspose.slides.internal.p475wh.C12007ix;
import com.aspose.slides.internal.p475wh.C12015qq;
import com.aspose.slides.internal.p475wh.C12025x6;
import com.aspose.slides.internal.p505xn.C12565ks;
import com.aspose.slides.p559ms.System.AbstractC14092to;
import com.aspose.slides.p559ms.System.C14064he;
import com.aspose.slides.p559ms.System.C14080ne;
import com.aspose.slides.p559ms.System.C14113y2;
import com.aspose.slides.p559ms.System.C14116yg;
import com.aspose.slides.p559ms.System.IDisposable;
import com.aspose.slides.p559ms.System.InterfaceC14073kp;
import com.google.mlkit.p567nl.translate.TranslateLanguage;
import com.orion.notein.domain.models.cloudsync.CloudMetaExtra;
import com.orion.notein.richeditor.utils.p606io.IOUtils;
import com.orion.penkit.tools.DrawToolFactory;
import java.util.Iterator;

/* JADX INFO: renamed from: com.aspose.slides.internal.m0.kk */
/* JADX INFO: loaded from: classes4.dex */
public class C6298kk {

    /* JADX INFO: renamed from: dy */
    private static final C7017h4 f17932dy = new C7017h4("fill", "fill-opacity", "fill-rule", "opacity", "stroke", "stroke-dasharray", "stroke-dashoffset", "stroke-linecap", "stroke-linejoin", "stroke-opacity", "stroke-width", "scale", "butt", "square", "round", "miter", "bevel");

    /* JADX INFO: renamed from: du */
    private final C6297k4 f17933du;

    /* JADX INFO: renamed from: h4 */
    private final C3787h4 f17934h4;

    /* JADX INFO: renamed from: k4 */
    private List<String> f17935k4 = new List<>(AbstractC14092to.m67204k4((Object[]) new String[]{"path", "circle", DrawToolFactory.LASSO_TYPE_RECT, "ellipse", "polygon"}));

    /* JADX INFO: renamed from: kk */
    private final C3783ck f17936kk;

    /* JADX INFO: renamed from: m9 */
    private C6300to f17937m9;

    /* JADX INFO: renamed from: to */
    private final C3791ks f17938to;

    /* JADX INFO: renamed from: x1 */
    private final C3786fa f17939x1;

    public C6298kk(C6300to c6300to, C3783ck c3783ck, C3786fa c3786fa, C3791ks c3791ks, C3787h4 c3787h4, C6297k4 c6297k4) {
        this.f17939x1 = c3786fa;
        this.f17936kk = c3783ck;
        this.f17938to = c3791ks;
        this.f17934h4 = c3787h4;
        this.f17933du = c6297k4;
        this.f17937m9 = c6300to;
    }

    /* JADX INFO: renamed from: k4 */
    private float m25777k4(String str, C3187kk c3187kk, C12007ix c12007ix) {
        if (C14113y2.m67411k4(str) || !(C14113y2.m67359c5(str, "x") || C14113y2.m67359c5(str, "y"))) {
            throw new ArgumentException("Invalid or missing keyValue.");
        }
        if (!c3187kk.containsKey(str)) {
            throw new ArgumentException("keyValue is not present in properties collection.");
        }
        String str2 = c3187kk.get_Item(str);
        return C14113y2.m67359c5(str2, "%") ? ((C14064he.m66707k4(C14113y2.m67401k4(str2, "%", C14113y2.f47374k4), C11697x1.m55250kk()) / 100.0f) * (C14113y2.m67359c5(str, "x") ? c12007ix.m56550c5() : c12007ix.m56575x1())) + (C14113y2.m67359c5(str, "x") ? c12007ix.m56557jd() : c12007ix.m56551ck()) : C14064he.m66707k4(str2, C11697x1.m55250kk());
    }

    /* JADX INFO: renamed from: x1 */
    public final int m25787x1(String str) {
        int iM27428k4 = f17932dy.m27428k4(str);
        if (iM27428k4 != 14) {
            return iM27428k4 != 16 ? 0 : 2;
        }
        return 1;
    }

    /* JADX INFO: renamed from: k4 */
    public final int m25780k4(String str) {
        int iM27428k4 = f17932dy.m27428k4(str);
        if (iM27428k4 != 13) {
            return iM27428k4 != 14 ? 0 : 2;
        }
        return 1;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0025  */
    /* JADX INFO: renamed from: k4 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final C4324m9 m25781k4(C3181c5 c3181c5, C12025x6 c12025x6, C12025x6 c12025x62, C12007ix c12007ix, C12015qq c12015qq) {
        float fM27437dy;
        if (c3181c5.f9461x1.containsKey("fill-opacity")) {
            String str = c3181c5.f9461x1.get_Item("fill-opacity");
            fM27437dy = !C14113y2.m67411k4(str) ? C7019kk.m27437dy(C14080ne.m67028up(str, (InterfaceC14073kp) C11697x1.m55250kk()), 15) : 1.0f;
        }
        List list = new List();
        List list2 = new List();
        for (int i = 0; i < c3181c5.m13628ar().m13697k4(); i++) {
            C6912h4 c6912h4 = (C6912h4) C7019kk.m27452k4((Object) c3181c5.m13628ar().m13702x1(i), C6912h4.class);
            if (c6912h4 != null) {
                list2.addItem(Float.valueOf(this.f17939x1.m15126k4(c12007ix.Clone(), c6912h4.m27056b3() * 100.0f, false)));
                list.addItem(c6912h4);
            }
        }
        list.reverse();
        if (list.size() <= 0) {
            return null;
        }
        C11902kk c11902kkM25779k4 = m25779k4(fM27437dy, (C6912h4[]) list.toArray(new C6912h4[0]), C12565ks.m58628kk((List<Float>) list2), c12007ix.m56550c5());
        List list3 = new List();
        for (int i2 = 0; i2 < c11902kkM25779k4.m55668k4().length; i2++) {
            list3.addItem(new C4319h4(C5656k4.m23095k4(c11902kkM25779k4.m55668k4()[i2].Clone()), c11902kkM25779k4.m55669x1()[i2]));
        }
        C4324m9 c4324m9 = new C4324m9(c12025x6.Clone(), c12025x62.Clone(), ((C4319h4) list3.get_Item(0)).m17353k4(), ((C4319h4) OooO0O0.OooO00o(list3, 1)).m17353k4());
        c4324m9.m17397k4(c12007ix.Clone());
        c4324m9.m17405k4((C4319h4[]) list3.toArray(new C4319h4[0]));
        c4324m9.m17386k4(1);
        if (c3181c5.f9461x1.containsKey("gradientTransform")) {
            c4324m9.m17387k4(C4123dy.m16494k4(this.f17938to.m15149k4(c3181c5.f9461x1.get_Item("gradientTransform"), c12015qq.Clone())));
        }
        return c4324m9;
    }

    /* JADX INFO: renamed from: k4 */
    public static C4327up m25778k4(C11906rv c11906rv, C12007ix c12007ix, float f) {
        C4127k4 c4127k4 = new C4127k4(C20855OooooOO.OooO0O0(c12007ix.m56550c5(), 14), C20855OooooOO.OooO0O0(c12007ix.m56575x1(), 14));
        try {
            C4130m9 c4130m9 = new C4130m9(c4127k4);
            try {
                C3152yj c3152yj = new C3152yj();
                try {
                    C4123dy.m16494k4(c11906rv.m55685fa());
                    c11906rv.m55697kk(new C11913yj());
                    c4130m9.m16573x1().mo17526k4((AbstractC12024x1) new C11999ar(c11906rv.m55687jd().m55668k4()[0].Clone()), 0, 0, c4127k4.m16549x1(), c4127k4.m16546kk());
                    c4130m9.m16573x1().mo17526k4((AbstractC12024x1) c11906rv, 0, 0, c4127k4.m16549x1(), c4127k4.m16546kk());
                    c4127k4.m16541k4(c3152yj, 5);
                    C4327up c4327up = new C4327up(c3152yj.toArray());
                    c4327up.m17386k4(4);
                    c4327up.m17412k4(f);
                    return c4327up;
                } finally {
                    c3152yj.dispose();
                }
            } finally {
                c4130m9.dispose();
            }
        } finally {
            c4127k4.dispose();
        }
    }

    /* JADX INFO: renamed from: k4 */
    private C11902kk m25779k4(float f, C6912h4[] c6912h4Arr, float[] fArr, float f2) {
        boolean z;
        boolean z2;
        C11902kk c11902kk = new C11902kk();
        int length = c6912h4Arr.length;
        int i = 0;
        if (fArr[0] > 0.0f) {
            length++;
            z = true;
        } else {
            z = false;
        }
        float f3 = fArr[c6912h4Arr.length - 1];
        if (f3 < 100.0f || f3 < 1.0f) {
            length++;
            z2 = true;
        } else {
            z2 = false;
        }
        c11902kk.m55666k4(new float[length]);
        c11902kk.m55667k4((C12003du[]) AbstractC14092to.m67212k4(AbstractC14092to.m67205k4(C7019kk.m27443k4((Class<?>) C12003du.class), length)));
        C12003du c12003duClone = C12003du.m56460uz().Clone();
        int i2 = 0;
        while (i < length) {
            float fM27055ak = c6912h4Arr[i2].m27055ak() * f;
            float f4 = fArr[i2] / f2;
            int i3 = i2 + 1;
            C12003du.m56400k4(OooO0OO.OooO0OO(fM27055ak, 255.0f, 13), c6912h4Arr[i2].m27061wy().m50292k4().Clone()).CloneTo(c12003duClone);
            if (z && i == 0) {
                c11902kk.m55669x1()[i] = 0.0f;
                c12003duClone.CloneTo(c11902kk.m55668k4()[i]);
                i++;
            }
            c11902kk.m55669x1()[i] = f4;
            c12003duClone.CloneTo(c11902kk.m55668k4()[i]);
            if (z2 && i == length - 2) {
                i++;
                c11902kk.m55669x1()[i] = 1.0f;
                c12003duClone.CloneTo(c11902kk.m55668k4()[i]);
            }
            i++;
            i2 = i3;
        }
        if (c11902kk.m55669x1()[c11902kk.m55669x1().length - 1] != 1.0f) {
            c11902kk.m55669x1()[c11902kk.m55669x1().length - 1] = 1.0f;
        }
        return c11902kk;
    }

    /* JADX INFO: renamed from: k4 */
    public final C11906rv m25782k4(float f, float f2, float f3, float f4, float f5, float f6, C6912h4[] c6912h4Arr, float[] fArr, float f7) {
        C11896dy c11896dy = new C11896dy();
        if (f3 <= 0.0f) {
            return null;
        }
        float f8 = f3 * 2.0f;
        C12007ix c12007ix = new C12007ix(0.0f, 0.0f, f8, f8);
        c11896dy.m55534k4(c12007ix.m56557jd() - ((c12007ix.m56550c5() * 0.5f) - f), c12007ix.m56551ck() - ((c12007ix.m56575x1() * 0.5f) - f2), c12007ix.m56550c5(), c12007ix.m56575x1());
        C11906rv c11906rv = new C11906rv(c11896dy);
        c11906rv.m55693k4(new C12025x6(f4, f5));
        c11906rv.m55690k4(m25779k4(f6, c6912h4Arr, fArr, f7));
        return c11906rv;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m25783k4(C10971um c10971um, C3181c5 c3181c5, C12015qq c12015qq, C10951c5 c10951c5) {
        C3182du c3182du;
        C3784du c3784du;
        C6298kk c6298kk;
        float f;
        try {
            c3182du = (C3182du) C7019kk.m27452k4((Object) c3181c5, C3182du.class);
            c3784du = new C3784du();
        } catch (RuntimeException e) {
            e = e;
        }
        try {
            if (c3181c5.f9461x1.containsKey("style")) {
                for (String str : C14113y2.m67417k4(c3181c5.f9461x1.get_Item("style"), new String[]{";", "\r", IOUtils.LINE_SEPARATOR_UNIX, "\t"}, 1)) {
                    m25785k4(C14113y2.m67440x1(C14113y2.m67414k4(str, ':')[0]), C14113y2.m67440x1(C14113y2.m67414k4(str, ':')[1]), c10971um, c3181c5, c12015qq.Clone(), c3784du, c10951c5);
                }
                c6298kk = this;
            } else {
                c6298kk = this;
                List.Enumerator<C5791k4> it = C7125kk.m27650k4(c6298kk.f17934h4.m15134k4(), c3182du.m13651h4(), c3182du.m13647du()).iterator();
                while (it.hasNext()) {
                    try {
                        C5791k4 next = it.next();
                        if (C14113y2.m67432to("hidden", next.mo23515k5(), (short) 3) || C14113y2.m67432to("collapse", next.mo23515k5(), (short) 3)) {
                            if (!C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                                return;
                            }
                        } else if (!C14113y2.m67432to("none", next.mo23519kp(), (short) 3)) {
                            if (!C14113y2.m67411k4(next.m23665k1())) {
                                c3182du.m13669to(next.m23665k1());
                            }
                            if (!C14113y2.m67411k4(next.m23673wt())) {
                                c3182du.m13661kk(next.m23673wt());
                            }
                        } else if (!C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                            return;
                        }
                        it.dispose();
                        return;
                    } finally {
                        if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                            it.dispose();
                        }
                    }
                }
                if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                    it.dispose();
                }
            }
            IGenericEnumerator<KeyValuePair<String, String>> it2 = c3181c5.f9461x1.iterator();
            while (it2.hasNext()) {
                try {
                    KeyValuePair<String, String> next2 = it2.next();
                    c6298kk.m25785k4(C14113y2.m67440x1(next2.getKey()), C14113y2.m67440x1(next2.getValue() != null ? next2.getValue() : C14113y2.f47374k4), c10971um, c3181c5, c12015qq.Clone(), c3784du, c10951c5);
                } finally {
                    if (C7019kk.m27456k4((Iterator) it2, (Class<IDisposable>) IDisposable.class)) {
                        it2.dispose();
                    }
                }
            }
            if (C7019kk.m27456k4((Iterator) it2, (Class<IDisposable>) IDisposable.class)) {
                it2.dispose();
            }
            if (!c3181c5.f9461x1.containsKey("fill") && c6298kk.f17935k4.containsItem(c3181c5.f9456h4)) {
                c10971um.m53101k4(new C4318fa(C9573kk.m46737k4(C12003du.m56460uz().Clone())));
            }
            if (c3784du.f10303c5 == 0.0f) {
                f = 0.0f;
                c10971um.m53101k4((C4328x1) null);
            } else if (c10971um.m53107x1() == null || !C7019kk.m27469x1(c10971um.m53107x1(), C4318fa.class)) {
                f = 0.0f;
            } else {
                C4318fa c4318fa = (C4318fa) c10971um.m53107x1();
                f = 0.0f;
                c4318fa.m17351k4(new C5656k4(C7019kk.m27462to(Float.valueOf(c4318fa.m17352x1().m23105x1() * c3784du.f10303c5), 13), c4318fa.m17352x1().m23102kk(), c4318fa.m17352x1().m23104to(), c4318fa.m17352x1().m23099du()));
            }
            if (c3784du.f10305dy == f) {
                c10971um.m53100k4((C4320jd) null);
                return;
            }
            C4320jd c4320jd = new C4320jd(new C5656k4(C7019kk.m27462to(Float.valueOf(c3784du.f10308k4.m23105x1() * c3784du.f10305dy), 13), c3784du.f10308k4.m23102kk(), c3784du.f10308k4.m23104to(), c3784du.f10308k4.m23099du()), c6298kk.f17939x1.m15125k4(c3182du.m13649dy(), "xy", c3181c5, c12015qq.Clone()) * C14116yg.m67480k4(c3784du.f10307jd));
            float[] fArr = c3784du.f10304du;
            if (fArr.length > 1) {
                c4320jd.m17368k4(fArr);
            }
            float f2 = c3784du.f10306h4;
            if (f2 != -1.0f) {
                c4320jd.m17370kk(f2);
            }
            int i = c3784du.f10309kk;
            if (i != -1) {
                if (i == 2) {
                    c4320jd.m17359du(2);
                } else if (i != 3) {
                    c4320jd.m17359du(0);
                } else {
                    c4320jd.m17359du(3);
                }
                c4320jd.m17377x1(c3784du.f10309kk);
                c4320jd.m17371kk(c3784du.f10309kk);
            }
            int i2 = c3784du.f10311to;
            if (i2 == 1) {
                c4320jd.m17374to(2);
            } else if (i2 != 2) {
                c4320jd.m17374to(0);
                c4320jd.m17376x1(C10308dy.m50271k4(c3181c5.f9461x1.m13690kk("stroke-miterlimit", "4"), 4.0f));
            } else {
                c4320jd.m17374to(1);
            }
            c10971um.m53100k4(c4320jd);
        } catch (RuntimeException e2) {
            e = e2;
            if (!C4113k4.f11284k4) {
                throw e;
            }
        }
    }

    /* JADX INFO: renamed from: k4 */
    public final void m25784k4(C10971um c10971um, C3181c5 c3181c5, String str, C12015qq c12015qq, C10951c5 c10951c5) {
        C4328x1 c4318fa;
        C12025x6 c12025x6;
        C12025x6 c12025x62;
        C6298kk c6298kk = this;
        if (C14113y2.m67448x1(str, "url(#")) {
            String strM15166kk = C3794up.m15166kk(str);
            if (!c6298kk.f17936kk.m15119x1().containsKey(strM15166kk)) {
                return;
            }
            C3181c5 c3181c52 = c6298kk.f17936kk.m15119x1().get_Item(strM15166kk);
            if ("linearGradient".equals(c3181c52.f9456h4)) {
                if (c3181c52.f9461x1.containsKey("xlink:href")) {
                    String strM15166kk2 = C3794up.m15166kk(c3181c52.f9461x1.get_Item("xlink:href").toString());
                    if (c6298kk.f17936kk.m15119x1().containsKey(strM15166kk2)) {
                        C3181c5 c3181c53 = c6298kk.f17936kk.m15119x1().get_Item(strM15166kk2);
                        for (int i = 0; i < c3181c53.m13628ar().m13697k4(); i++) {
                            c3181c52.m13628ar().m13703x1(i, c3181c53.m13628ar().m13702x1(i));
                        }
                    }
                }
                new C12025x6();
                new C12025x6();
                C12007ix c12007ixClone = c6298kk.f17937m9.m25793k4(c10971um).Clone();
                if (c3181c52.f9461x1.containsKey("x1") && c3181c52.f9461x1.containsKey("x2") && c3181c52.f9461x1.containsKey("y1") && c3181c52.f9461x1.containsKey("y2")) {
                    float fM25777k4 = c6298kk.m25777k4("x1", c3181c52.f9461x1, c12007ixClone.Clone());
                    float fM25777k42 = c6298kk.m25777k4("y1", c3181c52.f9461x1, c12007ixClone.Clone());
                    float fM25777k43 = c6298kk.m25777k4("x2", c3181c52.f9461x1, c12007ixClone.Clone());
                    float fM25777k44 = c6298kk.m25777k4("y2", c3181c52.f9461x1, c12007ixClone.Clone());
                    c12025x6 = new C12025x6(fM25777k4, fM25777k42);
                    c12025x62 = new C12025x6(fM25777k43, fM25777k44);
                } else {
                    c12025x6 = new C12025x6(c12007ixClone.m56571to(), 0.0f);
                    c12025x62 = new C12025x6(c12007ixClone.m56556h4(), 0.0f);
                }
                C12007ix c12007ixClone2 = c12007ixClone.Clone();
                if (C14064he.m66718x1(c12007ixClone2.m56575x1(), 0.0f)) {
                    c12007ixClone2.m56560k4(c12007ixClone2.m56575x1() + 0.01f);
                }
                if (C14064he.m66718x1(c12007ixClone2.m56550c5(), 0.0f)) {
                    c12007ixClone2.m56576x1(c12007ixClone2.m56550c5() + 0.01f);
                }
                c10971um.m53101k4(c6298kk.m25781k4(c3181c52, c12025x6.Clone(), c12025x62.Clone(), c12007ixClone2.Clone(), c12015qq.Clone()));
            }
            if (!"radialGradient".equals(c3181c52.f9456h4)) {
                if ("pattern".equals(c3181c52.f9456h4) && c6298kk.f17936kk.m15119x1().containsKey(strM15166kk)) {
                    C10951c5 c10951c52 = new C10951c5();
                    IGenericEnumerator<KeyValuePair<Integer, C3181c5>> it = c3181c52.m13628ar().iterator();
                    while (it.hasNext()) {
                        try {
                            c6298kk.f17937m9.m25798x1().m25747k4(it.next().getValue(), c10951c52, c12015qq.Clone(), true);
                        } finally {
                            if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                                it.dispose();
                            }
                        }
                    }
                    c10951c5.m52930k4(c10951c52);
                    return;
                }
                return;
            }
            if (c3181c52.f9461x1.containsKey("xlink:href")) {
                String strM15166kk3 = C3794up.m15166kk(c3181c52.f9461x1.get_Item("xlink:href").toString());
                if (c6298kk.f17936kk.m15119x1().containsKey(strM15166kk3)) {
                    C3181c5 c3181c54 = c6298kk.f17936kk.m15119x1().get_Item(strM15166kk3);
                    for (int i2 = 0; i2 < c3181c54.m13628ar().m13697k4(); i2++) {
                        c3181c52.m13628ar().m13703x1(i2, c3181c54.m13628ar().m13702x1(i2));
                    }
                }
            }
            C12007ix c12007ixClone3 = c6298kk.f17937m9.m25793k4(c10971um).Clone();
            float fM15126k4 = c6298kk.f17939x1.m15126k4(c12007ixClone3.Clone(), 50.0f, false);
            float fM15126k42 = c6298kk.f17939x1.m15126k4(c12007ixClone3.Clone(), 50.0f, true);
            float fM15126k43 = c6298kk.f17939x1.m15126k4(c12007ixClone3.Clone(), 50.0f, false);
            if (c3181c52.f9461x1.containsKey("cx")) {
                fM15126k4 = c6298kk.f17939x1.m15129k4(c3181c52.f9461x1.get_Item("cx").toString(), "x", c3181c5, c12007ixClone3.m56570m9().Clone());
            }
            if (c3181c52.f9461x1.containsKey(TranslateLanguage.WELSH)) {
                fM15126k42 = c6298kk.f17939x1.m15129k4(c3181c52.f9461x1.get_Item(TranslateLanguage.WELSH).toString(), "y", c3181c5, c12007ixClone3.m56570m9().Clone());
            }
            float fM15129k4 = c3181c52.f9461x1.containsKey("fx") ? c6298kk.f17939x1.m15129k4(c3181c52.f9461x1.get_Item("fx").toString(), "x", c3181c5, c12007ixClone3.m56570m9().Clone()) : 0.0f;
            float fM15129k42 = c3181c52.f9461x1.containsKey("fy") ? c6298kk.f17939x1.m15129k4(c3181c52.f9461x1.get_Item("fy").toString(), "y", c3181c5, c12007ixClone3.m56570m9().Clone()) : 0.0f;
            if (c3181c52.f9461x1.containsKey("r")) {
                fM15126k43 = c6298kk.f17939x1.m15129k4(c3181c52.f9461x1.get_Item("r").toString(), "xy", c3181c5, c12007ixClone3.m56570m9().Clone());
            }
            List list = new List();
            List list2 = new List();
            int i3 = 0;
            while (i3 < c3181c52.m13628ar().m13697k4()) {
                C6912h4 c6912h4 = (C6912h4) C7019kk.m27452k4((Object) c3181c52.m13628ar().m13702x1(i3), C6912h4.class);
                if (c6912h4 != null) {
                    list2.addItem(Float.valueOf(c6298kk.f17939x1.m15126k4(c12007ixClone3.Clone(), c6912h4.m27056b3() * 100.0f, false)));
                    list.addItem(c6912h4);
                }
                i3++;
                c6298kk = this;
            }
            list.reverse();
            c4318fa = m25778k4(m25782k4(fM15126k4, fM15126k42, fM15126k43, fM15129k4, fM15129k42, 1.0f, (C6912h4[]) list.toArray(new C6912h4[0]), C12565ks.m58628kk((List<Float>) list2), c12007ixClone3.m56550c5()), c12007ixClone3.Clone(), 1.0f);
        } else {
            c4318fa = new C4318fa(C9573kk.m46737k4(C10314to.m50289k4(str).m50292k4().Clone()));
        }
        c10971um.m53101k4(c4318fa);
    }

    /* JADX INFO: renamed from: k4 */
    public final void m25785k4(String str, String str2, C10971um c10971um, C3181c5 c3181c5, C12015qq c12015qq, C3784du c3784du, C10951c5 c10951c5) {
        float fM27437dy;
        try {
            c10971um.m53105kk(1);
            switch (f17932dy.m27428k4(str)) {
                case 0:
                    if (!"none".equals(str2)) {
                        m25784k4(c10971um, c3181c5, str2, c12015qq.Clone(), c10951c5);
                    }
                    break;
                case 1:
                    fM27437dy = C7019kk.m27437dy(C14080ne.m67028up(str2, (InterfaceC14073kp) C11697x1.m55250kk()), 15);
                    c3784du.f10303c5 = fM27437dy;
                    break;
                case 2:
                    if ("winding".equals(str2)) {
                        c10971um.m53105kk(1);
                    } else if ("evenodd".equals(str2)) {
                        c10971um.m53105kk(0);
                    }
                    break;
                case 3:
                    fM27437dy = C7019kk.m27437dy(C14080ne.m67028up(str2, (InterfaceC14073kp) C11697x1.m55250kk()), 15);
                    c3784du.f10303c5 = fM27437dy;
                    break;
                case 4:
                    if (!"none".equals(str2)) {
                        c3784du.f10312x1 = true;
                        c3784du.f10308k4 = C9573kk.m46737k4(C10314to.m50289k4(str2).m50292k4().Clone());
                    } else {
                        c3784du.f10312x1 = false;
                    }
                    break;
                case 5:
                    c3784du.f10304du = m25786k4(str2, c10971um, c12015qq.Clone());
                    break;
                case 6:
                    c3784du.f10306h4 = (float) C14116yg.m67468du(this.f17939x1.m15128k4(str2, C14113y2.f47374k4, c3181c5));
                    break;
                case 7:
                    c3784du.f10309kk = m25780k4(str2);
                    break;
                case 8:
                    c3784du.f10311to = m25787x1(str2);
                    break;
                case 9:
                    c3784du.f10305dy = C7019kk.m27437dy(C14080ne.m67028up(str2, (InterfaceC14073kp) C11697x1.m55250kk()), 15);
                    break;
                case 10:
                    c3784du.f10310m9 = this.f17939x1.m15128k4(str2, "xy", c3181c5);
                    break;
            }
            if (c3181c5.f9461x1.containsKey("transform") && C14113y2.m67359c5(c3181c5.f9461x1.get_Item("transform"), "scale")) {
                Dictionary<Integer, C3796yj> dictionaryM15150x1 = this.f17938to.m15150x1(c3181c5.f9461x1.get_Item("transform"), c12015qq.Clone());
                float f = 1.0f;
                for (int size = dictionaryM15150x1.size() - 1; size >= 0; size--) {
                    C3796yj c3796yj = dictionaryM15150x1.get_Item(Integer.valueOf(size));
                    String str3 = c3796yj.f10333k4;
                    float[] fArr = c3796yj.f10334x1;
                    if (f17932dy.m27428k4(str3) == 11) {
                        float f2 = fArr[0];
                        float f3 = fArr[1];
                        if (f3 < f2) {
                            f2 = f3;
                        }
                        f = f == 1.0f ? f2 : f * f2;
                    }
                }
                c3784du.f10307jd = f;
            }
        } catch (RuntimeException e) {
            if (!C4113k4.f11284k4) {
                throw e;
            }
        }
    }

    /* JADX INFO: renamed from: k4 */
    public final float[] m25786k4(String str, C10971um c10971um, C12015qq c12015qq) {
        String[] strArrM67417k4 = C14113y2.m67417k4(str, new String[]{" ", ","}, 1);
        if (strArrM67417k4.length == 1 && CloudMetaExtra.DEFINE_NON_PARENT_ID.equals(strArrM67417k4[0])) {
            return new float[0];
        }
        float[] fArr = new float[strArrM67417k4.length];
        for (int i = 0; i < strArrM67417k4.length; i++) {
            fArr[i] = C7019kk.m27437dy(C14080ne.m67023up(Float.valueOf(this.f17939x1.m15128k4(strArrM67417k4[i], C14113y2.f47374k4, (C3181c5) null))), 15);
        }
        return fArr;
    }
}
