package com.aspose.slides.internal.p261m0;

import com.aspose.slides.Collections.Generic.Dictionary;
import com.aspose.slides.Collections.Generic.IGenericDictionary;
import com.aspose.slides.Collections.Generic.IGenericEnumerator;
import com.aspose.slides.Collections.Generic.KeyValuePair;
import com.aspose.slides.internal.p080dd.C3152yj;
import com.aspose.slides.internal.p087dm.C3181c5;
import com.aspose.slides.internal.p087dm.C3187kk;
import com.aspose.slides.internal.p099e3.C3550du;
import com.aspose.slides.internal.p099e3.C3553kk;
import com.aspose.slides.internal.p099e3.C3554m9;
import com.aspose.slides.internal.p115eq.C3783ck;
import com.aspose.slides.internal.p115eq.C3786fa;
import com.aspose.slides.internal.p115eq.C3787h4;
import com.aspose.slides.internal.p115eq.C3791ks;
import com.aspose.slides.internal.p115eq.C3794up;
import com.aspose.slides.internal.p115eq.C3795x1;
import com.aspose.slides.internal.p115eq.InterfaceC3793to;
import com.aspose.slides.internal.p136fr.C4113k4;
import com.aspose.slides.internal.p136fr.C4114kk;
import com.aspose.slides.internal.p136fr.C4116x1;
import com.aspose.slides.internal.p138fu.C4123dy;
import com.aspose.slides.internal.p151gj.C4317dy;
import com.aspose.slides.internal.p314oc.C7017h4;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.internal.p400sk.AbstractC10231to;
import com.aspose.slides.internal.p400sk.C10229k4;
import com.aspose.slides.internal.p420th.AbstractC10973uz;
import com.aspose.slides.internal.p420th.C10948ar;
import com.aspose.slides.internal.p420th.C10951c5;
import com.aspose.slides.internal.p420th.C10965m9;
import com.aspose.slides.internal.p420th.C10970u4;
import com.aspose.slides.internal.p475wh.C12007ix;
import com.aspose.slides.internal.p475wh.C12009k4;
import com.aspose.slides.internal.p475wh.C12015qq;
import com.aspose.slides.internal.p475wh.C12025x6;
import com.aspose.slides.p559ms.System.C14113y2;
import com.aspose.slides.p559ms.System.C14116yg;
import com.aspose.slides.p559ms.System.IDisposable;
import com.microsoft.identity.common.java.jwt.AbstractJwtRequest;
import com.orion.notein.domain.models.backup.BackupFile;
import com.orion.penkit.tools.DrawToolFactory;
import java.util.Iterator;

/* JADX INFO: renamed from: com.aspose.slides.internal.m0.c5 */
/* JADX INFO: loaded from: classes4.dex */
public class C6292c5 {

    /* JADX INFO: renamed from: fa */
    private static final C7017h4 f17902fa = new C7017h4("a", "circle", "ellipse", "image", "line", "foreignObject", "path", "polygon", "polyline", DrawToolFactory.LASSO_TYPE_RECT, "rawText", "text", "tspan", AbstractJwtRequest.ClaimNames.USE, "symbol", "feBlend", "x", "y", "width", "height", "transform", "xlink:href", "href");

    /* JADX INFO: renamed from: c5 */
    private C3787h4 f17903c5;

    /* JADX INFO: renamed from: ck */
    private Dictionary<String, IGenericDictionary<String, String>> f17904ck;

    /* JADX INFO: renamed from: du */
    private C6297k4 f17905du;

    /* JADX INFO: renamed from: dy */
    private C6293du f17906dy;

    /* JADX INFO: renamed from: h4 */
    private C6300to f17907h4;

    /* JADX INFO: renamed from: jd */
    private InterfaceC3793to f17908jd;

    /* JADX INFO: renamed from: k4 */
    private Dictionary<String, C3181c5> f17909k4;

    /* JADX INFO: renamed from: kk */
    private C3786fa f17910kk;

    /* JADX INFO: renamed from: m9 */
    private C3783ck f17911m9;

    /* JADX INFO: renamed from: to */
    private C3791ks f17912to;

    /* JADX INFO: renamed from: x1 */
    private int f17913x1;

    public C6292c5() {
        this(new C3795x1());
    }

    /* JADX INFO: renamed from: k4 */
    public static C3181c5 m25738k4(C3181c5 c3181c5, C3181c5 c3181c52, C12015qq c12015qq, C3783ck c3783ck, C3786fa c3786fa, Dictionary<String, IGenericDictionary<String, String>> dictionary, boolean z) {
        C3181c5 c3181c5M15116k4 = c3783ck.m15116k4(((C3554m9) c3181c52).m14468xk());
        if (c3181c5M15116k4 == null) {
            return null;
        }
        C3181c5 c3181c5Mo13644yd = c3181c5M15116k4.mo13644yd();
        if (DrawToolFactory.LASSO_TYPE_RECT.equals(c3181c5Mo13644yd.f9456h4) && !c3181c5Mo13644yd.f9461x1.containsKey("x")) {
            c3181c5Mo13644yd.f9461x1.m13684k4("x", "0");
        }
        if (DrawToolFactory.LASSO_TYPE_RECT.equals(c3181c5Mo13644yd.f9456h4) && !c3181c5Mo13644yd.f9461x1.containsKey("y")) {
            c3181c5Mo13644yd.f9461x1.m13684k4("y", "0");
        }
        c3181c52.m13628ar().m13703x1(c3181c52.m13628ar().m13697k4(), c3181c5Mo13644yd);
        if (c3181c52.f9461x1.containsKey("width") && !c3181c52.f9461x1.containsKey("bounding-box-width")) {
            C3187kk c3187kk = c3181c52.f9461x1;
            c3187kk.m13684k4("bounding-box-width", c3187kk.get_Item("width"));
        }
        if (c3181c52.f9461x1.containsKey("height") && !c3181c52.f9461x1.containsKey("bounding-box-height")) {
            C3187kk c3187kk2 = c3181c52.f9461x1;
            c3187kk2.m13684k4("bounding-box-width", c3187kk2.get_Item("height"));
        }
        if (c3181c52.f9461x1.containsKey("x")) {
            c3786fa.m15128k4(c3181c52.f9461x1.get_Item("x"), C14113y2.f47374k4, c3181c5);
        }
        if (c3181c52.f9461x1.containsKey("y")) {
            c3786fa.m15128k4(c3181c52.f9461x1.get_Item("y"), C14113y2.f47374k4, c3181c5);
        }
        IGenericEnumerator<KeyValuePair<String, String>> it = c3181c52.f9461x1.iterator();
        while (it.hasNext()) {
            try {
                KeyValuePair<String, String> next = it.next();
                if (!"x".equals(next.getKey()) && !"y".equals(next.getKey())) {
                    if ("fill".equals(next.getKey()) && c3181c5Mo13644yd.f9461x1.containsKey(next.getKey())) {
                        c3181c5Mo13644yd.f9461x1.m13696x1(next.getKey());
                    }
                    if ("stroke".equals(next.getKey()) && c3181c5Mo13644yd.f9461x1.containsKey(next.getKey())) {
                        c3181c5Mo13644yd.f9461x1.m13696x1(next.getKey());
                    }
                    if (!c3181c5Mo13644yd.f9461x1.containsKey(next.getKey())) {
                        c3181c5Mo13644yd.f9461x1.m13684k4(next.getKey(), next.getValue());
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
        C3794up.m15162k4(c3181c5Mo13644yd, true, dictionary);
        return c3181c5Mo13644yd;
    }

    /* JADX INFO: renamed from: kk */
    private void m25742kk(C3181c5 c3181c5, C10951c5 c10951c5, C12015qq c12015qq) {
        if (c3181c5.f9461x1.containsKey(BackupFile.EXTENSION_NOTEIN_FILE) && this.f17909k4.containsKey(c3181c5.f9461x1.get_Item(BackupFile.EXTENSION_NOTEIN_FILE))) {
            C3181c5 c3181c52 = this.f17909k4.get_Item(c3181c5.f9461x1.get_Item(BackupFile.EXTENSION_NOTEIN_FILE).toString());
            if (c3181c5.f9461x1.containsKey("mode")) {
                c3181c52.f9461x1.m13684k4("mode", c3181c5.f9461x1.get_Item("mode").toString());
            }
            this.f17913x1++;
            m25746k4(c3181c52, c10951c5, c12015qq.Clone());
        }
        if (c3181c5.f9461x1.containsKey("in2") && this.f17909k4.containsKey(c3181c5.f9461x1.get_Item("in2"))) {
            C3181c5 c3181c53 = this.f17909k4.get_Item(c3181c5.f9461x1.get_Item("in2").toString());
            if (c3181c5.f9461x1.containsKey("mode")) {
                c3181c53.f9461x1.m13684k4("mode", c3181c5.f9461x1.get_Item("mode").toString());
            }
            int i = this.f17913x1;
            c3181c53.f9459m9 = i;
            this.f17913x1 = i + 1;
            m25746k4(c3181c53, c10951c5, c12015qq.Clone());
        }
    }

    /* JADX INFO: renamed from: x1 */
    public final void m25748x1(C3181c5 c3181c5) {
        try {
            String string = C14113y2.f47374k4;
            if (c3181c5.f9461x1.containsKey("requiredExtensions")) {
                string = c3181c5.f9461x1.get_Item("requiredExtensions").toString();
            }
            f17902fa.m27428k4(string);
        } catch (RuntimeException e) {
            if (!C4113k4.f11284k4) {
                throw e;
            }
        }
    }

    public C6292c5(InterfaceC3793to interfaceC3793to) {
        this.f17909k4 = new Dictionary<>();
        this.f17913x1 = 0;
        this.f17904ck = new Dictionary<>();
        this.f17908jd = interfaceC3793to;
        this.f17911m9 = new C3783ck();
        this.f17903c5 = new C3787h4();
        this.f17910kk = new C3786fa();
        C3791ks c3791ks = new C3791ks(this.f17910kk);
        this.f17912to = c3791ks;
        this.f17905du = new C6297k4(c3791ks);
        this.f17907h4 = new C6300to(this, this.f17911m9, this.f17910kk, this.f17903c5, this.f17905du);
        this.f17906dy = new C6293du(this.f17907h4, this.f17905du, this.f17911m9, this.f17910kk, this.f17903c5, this.f17908jd);
    }

    /* JADX INFO: renamed from: x1 */
    private void m25743x1(C3181c5 c3181c5, C10951c5 c10951c5, C12015qq c12015qq) {
        for (int i = 0; i < c3181c5.m13628ar().m13697k4(); i++) {
            C3181c5 c3181c5M13702x1 = c3181c5.m13628ar().m13702x1(i);
            if (c3181c5M13702x1.f9461x1.containsKey("result")) {
                if ("feImage".equals(c3181c5M13702x1.f9456h4)) {
                    m25739k4(c3181c5, c3181c5M13702x1, new String[]{"x", "y", "width", "height"});
                }
                this.f17909k4.addItem(c3181c5M13702x1.f9461x1.get_Item("result"), c3181c5M13702x1);
            }
        }
        for (int i2 = 0; i2 < c3181c5.m13628ar().m13697k4(); i2++) {
            C3181c5 c3181c5M13702x12 = c3181c5.m13628ar().m13702x1(i2);
            if (f17902fa.m27428k4(c3181c5M13702x12.f9456h4) == 15) {
                m25742kk(c3181c5M13702x12, c10951c5, c12015qq.Clone());
            }
        }
    }

    /* JADX INFO: renamed from: k4 */
    public final C10948ar m25744k4(String str) {
        C3181c5 c3181c5 = C4116x1.m16477k4(str).f9466h4;
        C3794up.m15157k4(c3181c5, this.f17911m9, this.f17908jd);
        C3794up.m15162k4(c3181c5, false, this.f17904ck);
        C3794up.m15160k4(c3181c5, this.f17908jd, this.f17903c5);
        C12015qq c12015qq = new C12015qq(0.0f, 0.0f);
        C10951c5 c10951c5 = new C10951c5();
        C12015qq[] c12015qqArr = {c12015qq};
        m25740k4(c3181c5, c10951c5, c12015qqArr);
        c12015qqArr[0].CloneTo(c12015qq);
        if (c12015qq.m56699x1() == 0.0f || c12015qq.m56697kk() == 0.0f) {
            C12007ix c12007ixClone = new C10965m9().m53022k4((AbstractC10973uz) c10951c5).Clone();
            if (c12015qq.m56699x1() == 0.0f) {
                c12015qq.m56695k4(c12007ixClone.m56556h4());
            }
            if (c12015qq.m56697kk() == 0.0f) {
                c12015qq.m56700x1(c12007ixClone.m56558k4());
            }
        }
        C10948ar c10948ar = new C10948ar(c12015qq.m56699x1(), c12015qq.m56697kk());
        if (c10951c5.mo52909to() == null) {
            c10951c5.m52904k4(new C4317dy());
        }
        c10948ar.m52930k4(c10951c5);
        return c10948ar;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m25745k4(C3181c5 c3181c5) {
    }

    /* JADX INFO: renamed from: x1 */
    public final void m25749x1(C3181c5 c3181c5, C10951c5 c10951c5, C12015qq c12015qq, boolean z) {
        try {
            String strM67401k4 = C14113y2.f47374k4;
            if (c3181c5.f9461x1.containsKey("xlink:href")) {
                strM67401k4 = C14113y2.m67401k4(c3181c5.f9461x1.get_Item("xlink:href").toString(), "#", C14113y2.f47374k4);
            }
            if (this.f17911m9.m15119x1().containsKey(strM67401k4)) {
                m25747k4(this.f17911m9.m15119x1().get_Item(strM67401k4), c10951c5, c12015qq.Clone(), true);
            }
            if (c3181c5.f9461x1.containsKey("filter")) {
                m25743x1(this.f17911m9.m15119x1().get_Item(C3794up.m15166kk(c3181c5.f9461x1.get_Item("filter").toString())), c10951c5, c12015qq.Clone());
            }
        } catch (RuntimeException e) {
            if (!C4113k4.f11284k4) {
                throw e;
            }
        }
    }

    /* JADX INFO: renamed from: k4 */
    private void m25739k4(C3181c5 c3181c5, C3181c5 c3181c52, String[] strArr) {
        for (String str : strArr) {
            if (c3181c5.f9461x1.containsKey(str) && !c3181c52.f9461x1.containsKey(str)) {
                c3181c52.f9461x1.m13684k4(str, c3181c5.f9461x1.get_Item(str));
            }
        }
    }

    /* JADX INFO: renamed from: k4 */
    public final void m25746k4(C3181c5 c3181c5, C10951c5 c10951c5, C12015qq c12015qq) {
        boolean z = false;
        try {
            C4317dy c4317dy = new C4317dy();
            byte[] bArrM23692k4 = new byte[0];
            IGenericEnumerator<KeyValuePair<String, String>> it = c3181c5.f9461x1.iterator();
            float fM15128k4 = 0.0f;
            float fM15128k42 = 0.0f;
            float fM15128k43 = 0.0f;
            float fM15128k44 = 0.0f;
            while (it.hasNext()) {
                try {
                    boolean z2 = z;
                    switch (f17902fa.m27428k4(it.next().getKey())) {
                        case 16:
                            fM15128k43 = this.f17910kk.m15128k4(c3181c5.f9461x1.get_Item("x").toString(), "x", c3181c5);
                            break;
                        case 17:
                            fM15128k44 = this.f17910kk.m15128k4(c3181c5.f9461x1.get_Item("y").toString(), "y", c3181c5);
                            break;
                        case 18:
                            fM15128k4 = this.f17910kk.m15128k4(c3181c5.f9461x1.get_Item("width").toString(), "width", c3181c5);
                            break;
                        case 19:
                            fM15128k42 = this.f17910kk.m15128k4(c3181c5.f9461x1.get_Item("height").toString(), "height", c3181c5);
                            break;
                        case 20:
                            c4317dy = C4123dy.m16494k4(this.f17912to.m15149k4(c3181c5.f9461x1.get_Item("transform"), c12015qq.Clone()));
                            break;
                        case 21:
                            bArrM23692k4 = this.f17908jd.mo14413k4(this, new C4114kk(c3181c5.f9461x1.get_Item("xlink:href").toString())).m23692k4();
                            break;
                        case 22:
                            bArrM23692k4 = ((C3553kk) c3181c5).m14450k4(this.f17908jd);
                            break;
                    }
                    z = z2;
                } catch (Throwable th) {
                    if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                        it.dispose();
                    }
                    throw th;
                }
            }
            boolean z3 = z;
            if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                it.dispose();
            }
            if (bArrM23692k4.length > 0) {
                C10951c5 c10951c52 = new C10951c5();
                c10951c52.m52904k4(new C4317dy());
                float[] fArr = new float[1];
                fArr[z3 ? 1 : 0] = 0.0f;
                float[] fArr2 = new float[1];
                fArr2[z3 ? 1 : 0] = 0.0f;
                m25741k4(bArrM23692k4, fArr, fArr2);
                float f = fArr[z3 ? 1 : 0];
                float f2 = fArr2[z3 ? 1 : 0];
                C12015qq c12015qq2 = new C12015qq(f, f2);
                float[] fArr3 = new float[4];
                fArr3[z3 ? 1 : 0] = 0.0f;
                fArr3[1] = 0.0f;
                fArr3[2] = f;
                fArr3[3] = f2;
                C12007ix c12007ixClone = this.f17912to.m15148k4(fArr3, C14116yg.m67504x1(fM15128k4, c12015qq.m56699x1()), C14116yg.m67504x1(fM15128k42, c12015qq.m56697kk()), c3181c5.f9461x1.containsKey("preserveAspectRatio") ? c3181c5.f9461x1.get_Item("preserveAspectRatio") : "xMidYMid").m17332k4(new C12007ix(new C12025x6(0.0f, 0.0f), c12015qq2.Clone())).Clone();
                if (!c4317dy.m17344k4()) {
                    c4317dy.m17332k4(new C12007ix(new C12025x6(fM15128k43 + c12007ixClone.m56557jd(), fM15128k44 + c12007ixClone.m56551ck()), c12007ixClone.m56570m9().Clone())).CloneTo(c12007ixClone);
                }
                c10951c52.m52930k4(new C10970u4(new C12025x6(c12007ixClone.m56557jd(), c12007ixClone.m56551ck()), c12007ixClone.m56570m9().Clone(), bArrM23692k4));
                c10951c5.m52930k4(c10951c52);
            }
        } catch (RuntimeException e) {
            if (!C4113k4.f11284k4) {
                throw e;
            }
        }
    }

    /* JADX INFO: renamed from: k4 */
    public final void m25747k4(C3181c5 c3181c5, C10951c5 c10951c5, C12015qq c12015qq, boolean z) {
        C6293du c6293du;
        AbstractC10231to abstractC10231to;
        C12015qq c12015qqClone;
        boolean zM27456k4;
        String str = c3181c5.f9461x1.get_Item("visibility");
        if (C14113y2.m67432to("hidden", str, (short) 3) || C14113y2.m67432to("collapse", str, (short) 3) || C14113y2.m67432to("none", c3181c5.f9461x1.get_Item("display"), (short) 3) || !C3794up.m15168x1(c3181c5)) {
            return;
        }
        this.f17906dy.m25751k4(c10951c5);
        try {
            switch (f17902fa.m27428k4(c3181c5.f9456h4)) {
                case 0:
                    m25745k4(c3181c5);
                    return;
                case 1:
                    this.f17907h4.m25800x1(c3181c5, c10951c5, c12015qq.Clone());
                    return;
                case 2:
                    this.f17907h4.m25796kk(c3181c5, c10951c5, c12015qq.Clone());
                    return;
                case 3:
                    m25746k4(c3181c5, c10951c5, c12015qq.Clone());
                    return;
                case 4:
                    c3181c5.m13634ix();
                    this.f17907h4.m25797to(c3181c5, c10951c5, c12015qq.Clone());
                    return;
                case 5:
                    m25748x1(c3181c5);
                    return;
                case 6:
                    this.f17907h4.m25794k4(c3181c5, c10951c5, c12015qq.Clone());
                    return;
                case 7:
                    this.f17907h4.m25801x1(c3181c5, c10951c5, c12015qq.Clone(), true);
                    return;
                case 8:
                    this.f17907h4.m25801x1(c3181c5, c10951c5, c12015qq.Clone(), false);
                    return;
                case 9:
                    Dictionary<String, String> dictionary = c3181c5.f9458kk;
                    if (dictionary.containsKey("stroke-width") && "-1".equals(dictionary.get_Item("stroke-width"))) {
                        dictionary.removeItemByKey("stroke-width");
                        dictionary.addItem("stroke-width", "1");
                    }
                    this.f17907h4.m25795k4(c3181c5, c10951c5, c12015qq.Clone(), z);
                    return;
                case 10:
                    if ("text".equals(c3181c5.f9457k4.f9456h4) || "altGlyph".equals(c3181c5.f9457k4.f9456h4) || "tspan".equals(c3181c5.f9457k4.f9456h4)) {
                        this.f17906dy.m24351k4((C10229k4) c3181c5, c12015qq.Clone());
                        return;
                    }
                    return;
                case 11:
                    this.f17906dy.m25750k4(0.0f);
                    c6293du = this.f17906dy;
                    abstractC10231to = (AbstractC10231to) c3181c5;
                    c12015qqClone = c12015qq.Clone();
                    c6293du.m24353k4(abstractC10231to, c12015qqClone);
                    return;
                case 12:
                    c6293du = this.f17906dy;
                    abstractC10231to = (AbstractC10231to) c3181c5;
                    c12015qqClone = c12015qq.Clone();
                    c6293du.m24353k4(abstractC10231to, c12015qqClone);
                    return;
                case 13:
                    m25749x1(c3181c5, c10951c5, c12015qq.Clone(), true);
                    return;
                case 14:
                    IGenericEnumerator<KeyValuePair<Integer, C3181c5>> it = c3181c5.m13628ar().iterator();
                    while (it.hasNext()) {
                        try {
                            m25747k4(it.next().getValue(), c10951c5, c12015qq.Clone(), z);
                        } finally {
                            if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                                it.dispose();
                            }
                        }
                        break;
                    }
                    if (zM27456k4) {
                        return;
                    } else {
                        return;
                    }
                default:
                    return;
            }
        } catch (RuntimeException e) {
            if (!C4113k4.f11284k4) {
                throw e;
            }
        }
    }

    /* JADX INFO: renamed from: k4 */
    private void m25740k4(C3181c5 c3181c5, C10951c5 c10951c5, C12015qq[] c12015qqArr) {
        C10951c5 c10951c52;
        C3181c5 c3181c52 = c3181c5;
        try {
            if ("svg".equals(c3181c52.f9456h4)) {
                String[] strArrM67417k4 = c3181c52.f9461x1.containsKey("viewBox") ? C14113y2.m67417k4(c3181c52.f9461x1.get_Item("viewBox"), new String[]{" ", ","}, 1) : null;
                C3794up.m15158k4(c3181c52, this.f17910kk, c12015qqArr, ((C3550du) c3181c52).m14437ts());
                if (c3181c52.f9461x1.containsKey("viewBox")) {
                    String str = c3181c52.f9461x1.containsKey("preserveAspectRatio") ? c3181c52.f9461x1.get_Item("preserveAspectRatio") : "xMidYMid";
                    if (strArrM67417k4.length == 4) {
                        float fM27462to = C7019kk.m27462to(Float.valueOf(this.f17910kk.m15128k4(strArrM67417k4[0], C14113y2.f47374k4, c3181c52)), 13);
                        float fM27462to2 = C7019kk.m27462to(Float.valueOf(this.f17910kk.m15128k4(strArrM67417k4[1], C14113y2.f47374k4, c3181c52)), 13);
                        C3786fa c3786fa = this.f17910kk;
                        c3786fa.m15130k4(c3786fa.m15128k4(strArrM67417k4[2], "viewBox", c3181c52));
                        C3786fa c3786fa2 = this.f17910kk;
                        c3786fa2.m15133x1(c3786fa2.m15128k4(strArrM67417k4[3], "viewBox", c3181c52));
                        C4317dy c4317dyM15148k4 = this.f17912to.m15148k4(new float[]{fM27462to, fM27462to2, this.f17910kk.m15132to(), this.f17910kk.m15124du()}, c12015qqArr[0].m56699x1(), c12015qqArr[0].m56697kk(), str);
                        if (c10951c5.mo52909to() == null) {
                            c10951c5.m52904k4(new C4317dy());
                        }
                        c10951c5.mo52909to().m17341k4(c4317dyM15148k4, 1);
                    }
                }
            }
            int i = 0;
            while (i < c3181c52.m13628ar().m13697k4()) {
                C3181c5 c3181c5M13702x1 = c3181c52.m13628ar().m13702x1(i);
                if (C3794up.m15164k4(c3181c5M13702x1)) {
                    if (C7019kk.m27469x1(c3181c5M13702x1, C3554m9.class)) {
                        c3181c5M13702x1 = m25738k4(c3181c52, c3181c5M13702x1, c12015qqArr[0].Clone(), this.f17911m9, this.f17910kk, this.f17904ck, true);
                    }
                    if (c3181c5M13702x1.f9461x1.containsKey("clip-path") && "g".equals(c3181c5M13702x1.f9456h4)) {
                        c10951c52 = new C10951c5();
                        c10951c52.m52907k4(this.f17907h4.m25792k4(c12015qqArr[0].Clone(), c3181c5M13702x1));
                        c10951c5.m52930k4(c10951c52);
                        if (c10951c52.mo52902du() != null && c3181c5M13702x1.f9461x1.containsKey("transform")) {
                            c10951c52.mo52902du().m53099k4(C4123dy.m16494k4(this.f17912to.m15149k4(c3181c5M13702x1.f9461x1.get_Item("transform").toString(), c12015qqArr[0].Clone())));
                        }
                    } else {
                        c10951c52 = c10951c5;
                    }
                    m25747k4(c3181c5M13702x1, c10951c52, c12015qqArr[0].Clone(), true);
                    m25740k4(c3181c5M13702x1, c10951c52, c12015qqArr);
                }
                i++;
                c3181c52 = c3181c5;
            }
        } catch (RuntimeException e) {
            if (!C4113k4.f11284k4) {
                throw e;
            }
        }
    }

    /* JADX INFO: renamed from: k4 */
    private static void m25741k4(byte[] bArr, float[] fArr, float[] fArr2) {
        C12009k4 c12009k4 = new C12009k4(new C3152yj(bArr));
        try {
            fArr[0] = c12009k4.mo15760yj();
            fArr2[0] = c12009k4.mo15757m9();
        } finally {
            c12009k4.dispose();
        }
    }
}
