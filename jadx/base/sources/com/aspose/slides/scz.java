package com.aspose.slides;

import OooOoO.C20503OooO00o;
import com.aspose.slides.Collections.Generic.IGenericEnumerator;
import com.aspose.slides.Collections.Generic.IGenericList;
import com.aspose.slides.Collections.Generic.KeyValuePair;
import com.aspose.slides.internal.p077d8.C3085sv;
import com.aspose.slides.internal.p080dd.C3152yj;
import com.aspose.slides.internal.p271mc.C6360ck;
import com.aspose.slides.internal.p271mc.C6365jd;
import com.aspose.slides.internal.p271mc.C6368m9;
import com.aspose.slides.internal.p271mc.C6370up;
import com.aspose.slides.internal.p294n9.C6765kp;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.internal.p333p8.C9424dy;
import com.aspose.slides.internal.p341po.C9476to;
import com.aspose.slides.internal.p353q7.C9763ck;
import com.aspose.slides.internal.p353q7.C9790ts;
import com.aspose.slides.internal.p401sl.AbstractC10240to;
import com.aspose.slides.internal.p401sl.C10235dy;
import com.aspose.slides.internal.p472w8.C11896dy;
import com.aspose.slides.internal.p472w8.C11902kk;
import com.aspose.slides.internal.p472w8.C11906rv;
import com.aspose.slides.internal.p472w8.C11909up;
import com.aspose.slides.internal.p472w8.C11913yj;
import com.aspose.slides.internal.p475wh.AbstractC12002ck;
import com.aspose.slides.internal.p475wh.AbstractC12008jd;
import com.aspose.slides.internal.p475wh.AbstractC12024x1;
import com.aspose.slides.internal.p475wh.C11999ar;
import com.aspose.slides.internal.p475wh.C12003du;
import com.aspose.slides.internal.p475wh.C12007ix;
import com.aspose.slides.internal.p475wh.C12009k4;
import com.aspose.slides.internal.p475wh.C12012lr;
import com.aspose.slides.internal.p475wh.C12023wl;
import com.aspose.slides.internal.p475wh.C12026yj;
import com.aspose.slides.p559ms.System.AbstractC14092to;
import com.aspose.slides.p559ms.System.C14113y2;
import com.aspose.slides.p559ms.System.C14116yg;
import com.aspose.slides.p559ms.System.IDisposable;
import java.util.Iterator;

/* JADX INFO: loaded from: classes3.dex */
class scz {
    /* JADX INFO: renamed from: k4 */
    private static float m70511k4(Paragraph paragraph, ITable iTable, int i, int i2) {
        iTable.getRows().get_Item(i).get_Item(i2).getTextFrame().getParagraphs().add(paragraph);
        paragraph.getParagraphFormat().getBullet().applyDefaultParagraphIndentsShifts();
        float marginLeft = paragraph.getParagraphFormat().getMarginLeft();
        iTable.getRows().get_Item(i).get_Item(i2).getTextFrame().getParagraphs().remove(paragraph);
        return marginLeft;
    }

    /* JADX WARN: Finally extract failed */
    /* JADX INFO: renamed from: x1 */
    private static C12012lr m70533x1(C6360ck c6360ck) {
        C12012lr c12012lrM70519k4;
        C12007ix c12007ixClone = c6360ck.m26086k4().m55523c5().Clone();
        C12023wl c12023wl = new C12023wl(C7019kk.m27462to(Float.valueOf(c12007ixClone.m56550c5()), 13), C7019kk.m27462to(Float.valueOf(c12007ixClone.m56575x1()), 13));
        C3152yj c3152yj = new C3152yj();
        try {
            c6360ck.m26099ne().mo50125k4(c3152yj);
            c3152yj.flush();
            byte[] array = c3152yj.toArray();
            if (c3152yj.getLength() > 0) {
                C3152yj c3152yj2 = new C3152yj(array);
                try {
                    C12009k4 c12009k4 = new C12009k4(c3152yj2);
                    try {
                        AbstractC10240to abstractC10240toM50149to = c6360ck.m26099ne().m50149to();
                        if (abstractC10240toM50149to != null) {
                            C12009k4 c12009k4M70518k4 = m70518k4(abstractC10240toM50149to, c12009k4);
                            try {
                                c12012lrM70519k4 = m70519k4(c12009k4M70518k4, c12023wl.Clone());
                                if (c12009k4M70518k4 != null) {
                                    c12009k4M70518k4.dispose();
                                }
                            } catch (Throwable th) {
                                if (c12009k4M70518k4 != null) {
                                    c12009k4M70518k4.dispose();
                                }
                                throw th;
                            }
                        } else {
                            c12012lrM70519k4 = m70519k4(c12009k4, c12023wl.Clone());
                        }
                        c12009k4.dispose();
                    } catch (Throwable th2) {
                        c12009k4.dispose();
                        throw th2;
                    }
                } finally {
                    c3152yj2.dispose();
                }
            } else {
                c12012lrM70519k4 = null;
            }
            return c12012lrM70519k4;
        } finally {
            c3152yj.dispose();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0018  */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0022  */
    /* JADX INFO: renamed from: k4 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static IFontData m70512k4(Presentation presentation, IFontData iFontData) {
        String defaultRegularFont;
        int iM64790k4 = C13827mb.m64790k4(iFontData.getFontName());
        LoadOptions loadOptionsM2349du = presentation.m2349du();
        FontData fontData = null;
        if (loadOptionsM2349du == null) {
            defaultRegularFont = null;
        } else if (iM64790k4 == 0) {
            defaultRegularFont = loadOptionsM2349du.getDefaultRegularFont();
        } else if (iM64790k4 == 1) {
            defaultRegularFont = loadOptionsM2349du.getDefaultAsianFont();
        } else if (iM64790k4 != 2) {
        }
        if (C14113y2.m67411k4(defaultRegularFont)) {
            defaultRegularFont = "Times New Roman";
        }
        FontData fontData2 = new FontData(defaultRegularFont);
        FontsManager fontsManager = (FontsManager) C7019kk.m27452k4((Object) presentation.getFontsManager(), FontsManager.class);
        if (fontsManager != null && fontsManager.m1550k4(fontData2).m68818to()) {
            fontData = fontData2;
        }
        return fontData == null ? iFontData : fontData;
    }

    /* JADX INFO: renamed from: x1 */
    private static void m70534x1(C6360ck c6360ck, AbstractC12008jd abstractC12008jd, C11896dy c11896dy) {
        int iM56501c5 = c6360ck.m26106x1().m56501c5() & 255;
        if (c6360ck.m26102u4() != null) {
            abstractC12008jd.mo17495k4(c6360ck.m26102u4().m46602uz().m62692k4());
            iM56501c5 = C7019kk.m27462to(Float.valueOf(c6360ck.m26102u4().m46602uz().m62693x1()), 13);
        }
        C12003du c12003duClone = C12003du.m56398k4(iM56501c5, c6360ck.m26106x1().m56507jd() & 255, c6360ck.m26106x1().m56502ck() & 255, c6360ck.m26106x1().m56505fa() & 255).Clone();
        float fM46652k4 = C9476to.m46652k4(c6360ck.m26084ix());
        float fM46657x1 = C9476to.m46657x1(c6360ck.m26084ix());
        C12026yj c12026yj = new C12026yj(c12003duClone.Clone(), C14116yg.m67504x1(fM46652k4, fM46657x1) * c6360ck.m26098m9());
        try {
            if (c6360ck.m26110yj() == 1) {
                c12026yj.m56927kk(c6360ck.m26110yj());
                c12026yj.m56918k4(c6360ck.m26079ck());
                c12026yj.m56939x1(c6360ck.m26082fa());
            }
            c12026yj.m56936x1(c6360ck.m26103up());
            c12026yj.m56914h4(c6360ck.m26085jd());
            c12026yj.m56920k4(c6360ck.m26081dy(), c6360ck.m26081dy(), c6360ck.m26078c5());
            abstractC12008jd.mo17540k4(c12026yj, c11896dy);
            c12026yj.dispose();
        } catch (Throwable th) {
            c12026yj.dispose();
            throw th;
        }
    }

    /* JADX INFO: renamed from: k4 */
    private static IPPImage m70513k4(ISlide iSlide, AbstractC10240to abstractC10240to, C12009k4 c12009k4) {
        C12009k4 c12009k4M70518k4 = m70518k4(abstractC10240to, c12009k4);
        try {
            return ((ImageCollection) iSlide.getPresentation().getImages()).m1724k4(c12009k4M70518k4);
        } finally {
            if (c12009k4M70518k4 != null) {
                c12009k4M70518k4.dispose();
            }
        }
    }

    /* JADX INFO: renamed from: x1 */
    private static double[] m70535x1(e0e e0eVar) {
        int size = e0eVar.m5328to().size() - 1;
        double[] dArr = new double[size];
        int i = 0;
        float fM56897x1 = e0eVar.m5328to().get_Item(0).m26086k4().m55565kk()[1].m56897x1();
        while (i < size) {
            int i2 = i + 1;
            dArr[i] = e0eVar.m5328to().get_Item(i2).m26086k4().m55565kk()[1].m56897x1() - fM56897x1;
            fM56897x1 = e0eVar.m5328to().get_Item(i2).m26086k4().m55565kk()[1].m56897x1();
            i = i2;
        }
        return dArr;
    }

    /* JADX INFO: renamed from: k4 */
    private static IPortion m70514k4(C6370up c6370up) {
        Portion portion = new Portion(c6370up.m26186k4());
        portion.getPortionFormat().setLatinFont(new FontData(c6370up.m26182du()));
        portion.getPortionFormat().setFontHeight(c6370up.m26185jd());
        portion.getPortionFormat().setStrikethroughType(c6370up.m26180c5() ? (byte) 1 : (byte) 0);
        portion.getPortionFormat().setFontUnderline(c6370up.m26183dy() ? (byte) 2 : (byte) 0);
        portion.getPortionFormat().setFontBold(c6370up.m26188m9() ? (byte) 1 : (byte) 0);
        portion.getPortionFormat().setFontItalic(c6370up.m26184h4() ? (byte) 1 : (byte) 0);
        portion.getPortionFormat().getFillFormat().setFillType((byte) 1);
        ((ColorFormat) portion.getPortionFormat().getFillFormat().getSolidFillColor()).m1080k4(c6370up.m26187kk().Clone());
        return portion;
    }

    /* JADX INFO: renamed from: k4 */
    private static ITable m70515k4(ISlide iSlide, float f, float f2, double[] dArr, double[] dArr2) {
        return iSlide.getShapes().addTable(f, f2, dArr, dArr2);
    }

    /* JADX INFO: renamed from: k4 */
    private static Paragraph m70516k4(e0e e0eVar, eck eckVar, ITable iTable, int i, int i2) {
        Paragraph paragraph = new Paragraph();
        paragraph.setText(e0eVar.m5322du().get_Item(eckVar).m26155k4()[0].m26186k4());
        iTable.getRows().get_Item(i).get_Item(i2).getTextFrame().getParagraphs().add(paragraph);
        return paragraph;
    }

    /* JADX INFO: renamed from: k4 */
    private static C11906rv m70517k4(C6360ck c6360ck) {
        C11896dy c11896dy = new C11896dy();
        try {
            float fM56897x1 = c6360ck.m26109x6().m26145x1().m56897x1();
            float fM56895kk = c6360ck.m26109x6().m26145x1().m56895kk();
            float fM26143kk = c6360ck.m26109x6().m26143kk();
            float f = fM56897x1 - fM26143kk;
            float f2 = fM56895kk - fM26143kk;
            float f3 = fM26143kk * 2.0f;
            c11896dy.m55534k4(f, f2, f3, f3);
            C12003du[] c12003duArr = (C12003du[]) AbstractC14092to.m67212k4(AbstractC14092to.m67205k4(C7019kk.m27443k4((Class<?>) C12003du.class), c6360ck.m26109x6().m26144to().length));
            for (int i = 0; i < c6360ck.m26109x6().m26144to().length; i++) {
                c6360ck.m26109x6().m26144to()[(c6360ck.m26109x6().m26144to().length - 1) - i].CloneTo(c12003duArr[i]);
            }
            C11902kk c11902kk = new C11902kk();
            c11902kk.m55667k4(c12003duArr);
            c11902kk.m55666k4(c6360ck.m26109x6().m26140du());
            C11906rv c11906rv = new C11906rv(c11896dy);
            c11906rv.m55693k4(c6360ck.m26109x6().m26141k4().Clone());
            c11906rv.m55690k4(c11902kk);
            c11896dy.dispose();
            return c11906rv;
        } catch (Throwable th) {
            c11896dy.dispose();
            throw th;
        }
    }

    /* JADX INFO: renamed from: k4 */
    private static C12009k4 m70518k4(AbstractC10240to abstractC10240to, C12009k4 c12009k4) {
        int iM50142h4 = abstractC10240to.m50142h4();
        int iM50139du = abstractC10240to.m50139du();
        byte[] bArrM46154k4 = abstractC10240to.m50132ks().m46154k4();
        C12009k4 c12009k42 = new C12009k4(c12009k4.mo15760yj(), c12009k4.mo15757m9(), 2498570);
        for (int i = 0; i < iM50142h4; i++) {
            for (int i2 = 0; i2 < iM50139du; i2++) {
                C12003du c12003duClone = c12009k4.m56609x1(i, i2).Clone();
                c12009k42.m56604k4(i, i2, C12003du.m56398k4(bArrM46154k4[(i2 * iM50142h4) + i] & 255, c12003duClone.m56507jd() & 255, c12003duClone.m56502ck() & 255, c12003duClone.m56505fa() & 255).Clone().Clone());
            }
        }
        return c12009k42;
    }

    /* JADX INFO: renamed from: k4 */
    private static C12012lr m70519k4(C12009k4 c12009k4, C12023wl c12023wl) {
        AbstractC12008jd abstractC12008jdM56582k4;
        if (c12023wl.m56865x1() == 0) {
            c12023wl.m56860k4(1);
        }
        if (c12023wl.m56862kk() == 0) {
            c12023wl.m56866x1(1);
        }
        C12007ix c12007ix = new C12007ix(0.0f, 0.0f, c12023wl.m56865x1(), c12023wl.m56862kk());
        C12009k4 c12009k42 = new C12009k4(c12023wl.m56865x1(), c12023wl.m56862kk(), c12009k4.mo15753jd());
        try {
            if (c12009k4.mo15753jd() != 196865 && c12009k4.mo15753jd() != 197634 && c12009k4.mo15753jd() != 198659 && c12009k4.mo15753jd() != 0 && c12009k4.mo15753jd() != 0 && c12009k4.mo15753jd() != 397319 && c12009k4.mo15753jd() != 1052676) {
                abstractC12008jdM56582k4 = AbstractC12008jd.m56582k4((AbstractC12002ck) c12009k42);
                try {
                    abstractC12008jdM56582k4.mo17560kk(7);
                    abstractC12008jdM56582k4.mo17476du(2);
                    abstractC12008jdM56582k4.mo17481h4(2);
                    abstractC12008jdM56582k4.mo17506k4(c12009k4, c12007ix.Clone());
                    C12012lr c12012lr = new C12012lr(c12009k42, 4);
                    abstractC12008jdM56582k4.dispose();
                    return c12012lr;
                } finally {
                }
            }
            C12009k4 c12009k43 = new C12009k4(c12009k42);
            abstractC12008jdM56582k4 = AbstractC12008jd.m56582k4((AbstractC12002ck) c12009k43);
            try {
                abstractC12008jdM56582k4.mo17560kk(7);
                abstractC12008jdM56582k4.mo17476du(2);
                abstractC12008jdM56582k4.mo17481h4(2);
                abstractC12008jdM56582k4.mo17506k4(c12009k4, c12007ix.Clone());
                C12012lr c12012lr2 = new C12012lr(c12009k43, 4);
                abstractC12008jdM56582k4.dispose();
                return c12012lr2;
            } finally {
            }
        } finally {
            c12009k42.dispose();
        }
        c12009k42.dispose();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r14v12 */
    /* JADX WARN: Type inference failed for: r14v5, types: [java.util.Iterator] */
    /* JADX WARN: Type inference failed for: r14v8 */
    /* JADX WARN: Type inference failed for: r17v0 */
    /* JADX WARN: Type inference failed for: r1v12 */
    /* JADX WARN: Type inference failed for: r1v13 */
    /* JADX WARN: Type inference failed for: r1v7 */
    /* JADX WARN: Type inference failed for: r1v8, types: [com.aspose.slides.ms.System.IDisposable, java.util.Iterator] */
    /* JADX WARN: Type inference failed for: r1v9, types: [com.aspose.slides.ms.System.IDisposable, java.util.Iterator] */
    /* JADX INFO: renamed from: k4 */
    public static void m70520k4(ISlide iSlide, IGenericList<e0e> iGenericList) {
        ?? r1;
        byte b = 1;
        IGenericEnumerator<e0e> it = iGenericList.iterator();
        while (it.hasNext()) {
            try {
                e0e next = it.next();
                ITable iTableM70515k4 = m70515k4(iSlide, next.m5323k4(), next.m5329x1(), m70535x1(next), m70532k4(next));
                Paragraph paragraph = new Paragraph();
                paragraph.getParagraphFormat().getBullet().setType(b);
                paragraph.getParagraphFormat().getBullet().setChar(mjh.f46246k4);
                float fM70511k4 = m70511k4(paragraph, iTableM70515k4, 0, 0);
                C6765kp c6765kp = new C6765kp();
                int i = 0;
                int i2 = 0;
                Paragraph paragraph2 = null;
                byte b2 = b;
                while (i <= iTableM70515k4.getRows().size()) {
                    if (c6765kp.m26807x1() > 0 && paragraph2 != null) {
                        paragraph2.setText(c6765kp.toString());
                        int i3 = i - 1;
                        iTableM70515k4.getRows().get_Item(i3).get_Item(i2).getTextFrame().getParagraphs().add(paragraph2);
                        if (i < iTableM70515k4.getRows().size()) {
                            i3 = i;
                        }
                        paragraph2.getParagraphFormat().getBullet().applyDefaultParagraphIndentsShifts();
                        m70525k4(paragraph2, next, i3, i2);
                        c6765kp.m26801k4(0);
                    }
                    if (i == iTableM70515k4.getRows().size()) {
                        break;
                    }
                    c6765kp.m26801k4(0);
                    int i4 = 0;
                    paragraph2 = null;
                    byte b3 = b2;
                    while (i4 < iTableM70515k4.getRows().get_Item(i).size()) {
                        m70524k4(iTableM70515k4, i, i4, next);
                        float f = 0.0f;
                        boolean zM70530k4 = false;
                        int i5 = b3;
                        ?? it2 = next.m5322du().iterator();
                        while (it2.hasNext()) {
                            try {
                                KeyValuePair keyValuePair = (KeyValuePair) it2.next();
                                int i6 = i4;
                                int[] iArr = {i2};
                                ?? r17 = it2;
                                try {
                                    Paragraph[] paragraphArr = {paragraph2};
                                    float f2 = f;
                                    float[] fArr = new float[i5];
                                    fArr[0] = f2;
                                    eck eckVar = (eck) keyValuePair.getKey();
                                    int i7 = i5;
                                    r1 = r17;
                                    try {
                                        zM70530k4 = m70530k4(eckVar, i, i6, next, zM70530k4, c6765kp, iTableM70515k4, fM70511k4, iArr, paragraphArr, fArr);
                                        int i8 = iArr[0];
                                        Paragraph paragraph3 = paragraphArr[0];
                                        f = fArr[0];
                                        i2 = i8;
                                        paragraph2 = paragraph3;
                                        i4 = i6;
                                        it2 = r1;
                                        i5 = i7 == true ? 1 : 0;
                                    } catch (Throwable th) {
                                        th = th;
                                        if (C7019kk.m27456k4((Iterator) r1, (Class<IDisposable>) IDisposable.class)) {
                                            r1.dispose();
                                        }
                                        throw th;
                                    }
                                } catch (Throwable th2) {
                                    th = th2;
                                    r1 = r17;
                                }
                            } catch (Throwable th3) {
                                th = th3;
                                r1 = it2;
                            }
                        }
                        int i9 = i4;
                        int i10 = i2;
                        int i11 = i5;
                        ?? r12 = it2;
                        if (C7019kk.m27456k4((Iterator) r12, (Class<IDisposable>) IDisposable.class)) {
                            r12.dispose();
                        }
                        i2 = i10;
                        i4 = i9 + 1;
                        b3 = i11 == true ? 1 : 0;
                    }
                    i++;
                    b2 = b3;
                }
                b = b2 == true ? 1 : 0 ? 1 : 0;
            } catch (Throwable th4) {
                if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                    it.dispose();
                }
                throw th4;
            }
        }
        if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
            it.dispose();
        }
    }

    /* JADX INFO: renamed from: k4 */
    public static void m70521k4(ISlide iSlide, C6360ck c6360ck, float f, C9424dy c9424dy) {
        IShapeCollection shapes;
        float fM56557jd;
        float fM56551ck;
        float f2;
        float fM56550c5;
        float fM56575x1;
        if (c6360ck.m26080du()) {
            return;
        }
        if (c6360ck.m26101to() && (c6360ck.m26096kk().m56501c5() & 255) == 0 && !c6360ck.m26083h4()) {
            return;
        }
        C12007ix c12007ixClone = c6360ck.m26086k4().m55523c5().Clone();
        C12009k4 c12009k4 = new C12009k4(C7019kk.m27462to(Float.valueOf(c12007ixClone.m56550c5()), 13) + 1, C7019kk.m27462to(Float.valueOf(c12007ixClone.m56575x1()), 13) + 1, 2498570);
        try {
            AbstractC12008jd abstractC12008jdM56582k4 = AbstractC12008jd.m56582k4((AbstractC12002ck) c12009k4);
            try {
                m70528k4(abstractC12008jdM56582k4);
                C11913yj c11913yj = new C11913yj();
                c11913yj.m55777kk(-c12007ixClone.m56557jd(), -c12007ixClone.m56551ck());
                c6360ck.m26089k4(c11913yj);
                if (c6360ck.m26101to()) {
                    m70527k4(c6360ck, abstractC12008jdM56582k4, c6360ck.m26086k4());
                }
                if (c6360ck.m26083h4()) {
                    m70534x1(c6360ck, abstractC12008jdM56582k4, c6360ck.m26086k4());
                }
                IPPImage iPPImageM1724k4 = ((ImageCollection) iSlide.getPresentation().getImages()).m1724k4(c12009k4);
                if (m70529k4(f)) {
                    shapes = iSlide.getShapes();
                    fM56557jd = (c9424dy.m46139kk() - c12007ixClone.m56551ck()) - c12007ixClone.m56575x1();
                    fM56551ck = c12007ixClone.m56557jd();
                    f2 = 1;
                    fM56550c5 = c12007ixClone.m56575x1() + f2;
                    fM56575x1 = c12007ixClone.m56550c5();
                } else {
                    shapes = iSlide.getShapes();
                    fM56557jd = c12007ixClone.m56557jd();
                    fM56551ck = c12007ixClone.m56551ck();
                    f2 = 1;
                    fM56550c5 = c12007ixClone.m56550c5() + f2;
                    fM56575x1 = c12007ixClone.m56575x1();
                }
                shapes.addPictureFrame(5, fM56557jd, fM56551ck, fM56550c5, fM56575x1 + f2, iPPImageM1724k4);
                if (abstractC12008jdM56582k4 != null) {
                    abstractC12008jdM56582k4.dispose();
                }
                c12009k4.dispose();
            } finally {
            }
        } catch (Throwable th) {
            c12009k4.dispose();
            throw th;
        }
    }

    /* JADX INFO: renamed from: k4 */
    public static void m70522k4(ISlide iSlide, C6365jd c6365jd, float f, C9424dy c9424dy) {
        float fM56551ck = (c6365jd.m26156kk().m56551ck() - c6365jd.m26156kk().m56575x1()) - 5.3999996f;
        float fM56550c5 = c6365jd.m26156kk().m56550c5() + 28.8f;
        float fM56575x1 = c6365jd.m26156kk().m56575x1() + 3.6f + 3.6f;
        if (fM56550c5 < 0.0f || fM56575x1 < 0.0f) {
            return;
        }
        IAutoShape iAutoShapeAddAutoShape = m70529k4((double) f) ? iSlide.getShapes().addAutoShape(5, (c9424dy.m46139kk() - fM56551ck) - 14.4f, c6365jd.m26156kk().m56557jd() - 18.0f, fM56575x1, fM56550c5) : iSlide.getShapes().addAutoShape(5, c6365jd.m26156kk().m56557jd() - 3.96f, fM56551ck, fM56550c5, fM56575x1);
        iAutoShapeAddAutoShape.getFillFormat().setFillType((byte) 0);
        iAutoShapeAddAutoShape.getLineFormat().getFillFormat().setFillType((byte) 0);
        iAutoShapeAddAutoShape.getLineFormat().setWidth(0.0d);
        iAutoShapeAddAutoShape.getTextFrame().getTextFrameFormat().setMarginBottom(3.5999999046325684d);
        iAutoShapeAddAutoShape.getTextFrame().getTextFrameFormat().setMarginTop(3.5999999046325684d);
        iAutoShapeAddAutoShape.getTextFrame().getTextFrameFormat().setMarginRight(3.5999999046325684d);
        iAutoShapeAddAutoShape.getTextFrame().getTextFrameFormat().setMarginLeft(3.5999999046325684d);
        Paragraph paragraph = new Paragraph();
        paragraph.getPortions().clear();
        paragraph.getParagraphFormat().setMarginLeft(0.0f);
        paragraph.getParagraphFormat().setMarginRight(0.0f);
        for (C6370up c6370up : c6365jd.m26155k4()) {
            IPortion iPortionM70514k4 = m70514k4(c6370up);
            C9790ts c9790tsMo48031k4 = C9763ck.m48030to().mo48031k4(c6370up.m26182du(), c6370up.m26180c5() ? 8 : c6370up.m26183dy() ? 4 : c6370up.m26188m9() ? 1 : c6370up.m26184h4() ? 2 : 0);
            if (c9790tsMo48031k4 != null && !m70531k4(c9790tsMo48031k4, c6370up.m26186k4())) {
                iPortionM70514k4.getPortionFormat().setLatinFont(m70512k4((Presentation) iSlide.getPresentation(), iPortionM70514k4.getPortionFormat().getLatinFont()));
            }
            paragraph.getPortions().add(iPortionM70514k4);
        }
        iAutoShapeAddAutoShape.getTextFrame().getParagraphs().clear();
        iAutoShapeAddAutoShape.getTextFrame().getParagraphs().add(paragraph);
    }

    /* JADX INFO: renamed from: k4 */
    public static void m70523k4(ISlide iSlide, C6368m9 c6368m9, float f, C9424dy c9424dy) {
        ShapeFrame shapeFrame;
        C3152yj c3152yj = new C3152yj();
        try {
            c6368m9.m26172to().mo50125k4(c3152yj);
            c3152yj.flush();
            byte[] array = c3152yj.toArray();
            if (c3152yj.getLength() > 0) {
                C3152yj c3152yj2 = new C3152yj(array);
                try {
                    C12009k4 c12009k4 = new C12009k4(c3152yj2);
                    try {
                        AbstractC10240to abstractC10240toM50149to = c6368m9.m26172to().m50149to();
                        IPPImage iPPImageM1724k4 = (C7019kk.m27469x1(c6368m9.m26172to(), C10235dy.class) || abstractC10240toM50149to == null) ? ((ImageCollection) iSlide.getPresentation().getImages()).m1724k4(c12009k4) : m70513k4(iSlide, abstractC10240toM50149to, c12009k4);
                        C12007ix c12007ixClone = c6368m9.m26165du().Clone();
                        c6368m9.m26171m9();
                        c6368m9.m26168k4(c6368m9.m26167k4() + f);
                        if (C7019kk.m27462to(Double.valueOf(C14116yg.m67497to(c6368m9.m26167k4())), 14) != 0) {
                            c6368m9.m26165du().CloneTo(c12007ixClone);
                        }
                        IPictureFrame iPictureFrameAddPictureFrame = iSlide.getShapes().addPictureFrame(5, c12007ixClone.m56557jd(), c12007ixClone.m56551ck(), c12007ixClone.m56550c5(), c12007ixClone.m56575x1(), iPPImageM1724k4);
                        if (m70529k4(f)) {
                            shapeFrame = new ShapeFrame(((c9424dy.m46139kk() - c12007ixClone.m56575x1()) - c12007ixClone.m56551ck()) - ((c12007ixClone.m56550c5() - c12007ixClone.m56575x1()) / 2.0f), C20503OooO00o.OooO0O0(c12007ixClone.m56550c5(), c12007ixClone.m56575x1(), 2.0f, c12007ixClone.m56557jd()), c12007ixClone.m56550c5(), c12007ixClone.m56575x1(), c6368m9.m26174x1() ? (byte) 1 : (byte) 0, c6368m9.m26170kk() ? (byte) 1 : (byte) 0, c6368m9.m26167k4());
                        } else {
                            shapeFrame = new ShapeFrame(c12007ixClone.m56557jd(), c12007ixClone.m56551ck(), c12007ixClone.m56550c5(), c12007ixClone.m56575x1(), c6368m9.m26174x1() ? (byte) 1 : (byte) 0, c6368m9.m26170kk() ? (byte) 1 : (byte) 0, c6368m9.m26167k4());
                        }
                        iPictureFrameAddPictureFrame.setFrame(shapeFrame);
                        PictureFillFormat pictureFillFormat = (PictureFillFormat) iPictureFrameAddPictureFrame.getPictureFormat();
                        C12007ix c12007ixClone2 = c6368m9.m26165du().Clone();
                        pj5 pj5Var = new pj5();
                        pj5Var.f48078du = ((c12007ixClone2.m56558k4() - c12007ixClone.m56558k4()) / c12007ixClone2.m56575x1()) * 100.0f;
                        pj5Var.f48079kk = ((c12007ixClone.m56554dy() - c12007ixClone2.m56554dy()) / c12007ixClone2.m56575x1()) * 100.0f;
                        pj5Var.f48080to = ((c12007ixClone2.m56556h4() - c12007ixClone.m56556h4()) / c12007ixClone2.m56550c5()) * 100.0f;
                        pj5Var.f48081x1 = ((c12007ixClone.m56571to() - c12007ixClone2.m56571to()) / c12007ixClone2.m56550c5()) * 100.0f;
                        pictureFillFormat.m2253k4(pj5Var.Clone());
                        c12009k4.dispose();
                        c3152yj2.dispose();
                    } catch (Throwable th) {
                        c12009k4.dispose();
                        throw th;
                    }
                } catch (Throwable th2) {
                    c3152yj2.dispose();
                    throw th2;
                }
            }
            c3152yj.dispose();
        } catch (Throwable th3) {
            c3152yj.dispose();
            throw th3;
        }
    }

    /* JADX INFO: renamed from: k4 */
    private static void m70524k4(ITable iTable, int i, int i2, e0e e0eVar) {
        iTable.getRows().get_Item(i).get_Item(i2).getCellFormat().getBorderTop().getFillFormat().setFillType((byte) 1);
        ((ColorFormat) iTable.getRows().get_Item(i).get_Item(i2).getCellFormat().getBorderTop().getFillFormat().getSolidFillColor()).m1080k4(e0eVar.m5327kk().get_Item(i).m26106x1().Clone());
        iTable.getRows().get_Item(i).get_Item(i2).getCellFormat().getBorderTop().setWidth(e0eVar.m5327kk().get_Item(i).m26098m9());
        iTable.getRows().get_Item(i).get_Item(i2).getCellFormat().getFillFormat().setFillType((byte) 1);
        ((ColorFormat) iTable.getRows().get_Item(i).get_Item(i2).getCellFormat().getFillFormat().getSolidFillColor()).m1080k4(e0eVar.m5327kk().get_Item(i).m26096kk().Clone());
        iTable.getRows().get_Item(i).get_Item(i2).getCellFormat().getBorderBottom().getFillFormat().setFillType((byte) 1);
        ((ColorFormat) iTable.getRows().get_Item(i).get_Item(i2).getCellFormat().getBorderBottom().getFillFormat().getSolidFillColor()).m1080k4(e0eVar.m5327kk().get_Item(i + 1).m26106x1().Clone());
        iTable.getRows().get_Item(i).get_Item(i2).getCellFormat().getBorderBottom().setWidth(e0eVar.m5327kk().get_Item(r3).m26098m9());
        iTable.getRows().get_Item(i).get_Item(i2).getCellFormat().getBorderLeft().getFillFormat().setFillType((byte) 1);
        ((ColorFormat) iTable.getRows().get_Item(i).get_Item(i2).getCellFormat().getBorderLeft().getFillFormat().getSolidFillColor()).m1080k4(e0eVar.m5328to().get_Item(i2).m26106x1().Clone());
        iTable.getRows().get_Item(i).get_Item(i2).getCellFormat().getBorderLeft().setWidth(e0eVar.m5328to().get_Item(i2).m26098m9());
        iTable.getRows().get_Item(i).get_Item(i2).getCellFormat().getBorderRight().getFillFormat().setFillType((byte) 1);
        ((ColorFormat) iTable.getRows().get_Item(i).get_Item(i2).getCellFormat().getBorderRight().getFillFormat().getSolidFillColor()).m1080k4(e0eVar.m5328to().get_Item(i2 + 1).m26106x1().Clone());
        iTable.getRows().get_Item(i).get_Item(i2).getCellFormat().getBorderRight().setWidth(e0eVar.m5328to().get_Item(r2).m26098m9());
    }

    /* JADX INFO: renamed from: k4 */
    private static void m70525k4(Paragraph paragraph, e0e e0eVar, int i, int i2) {
        eck eckVar = new eck();
        int i3 = i + 1;
        eckVar.m5419k4(i3);
        int i4 = i2 + 1;
        eckVar.m5421kk(i4);
        eckVar.m5423x1(0);
        paragraph.getPortions().get_Item(0).getPortionFormat().setFontHeight(e0eVar.m5322du().get_Item(eckVar).m26155k4()[0].m26185jd());
        paragraph.getPortions().get_Item(0).getPortionFormat().getFillFormat().setFillType((byte) 1);
        eck eckVar2 = new eck();
        eckVar2.m5419k4(i3);
        eckVar2.m5421kk(i4);
        eckVar2.m5423x1(0);
        ((ColorFormat) paragraph.getPortions().get_Item(0).getPortionFormat().getFillFormat().getSolidFillColor()).m1080k4(e0eVar.m5322du().get_Item(eckVar2).m26155k4()[0].m26187kk().Clone());
        eck eckVar3 = new eck();
        eckVar3.m5419k4(i3);
        eckVar3.m5421kk(i4);
        eckVar3.m5423x1(0);
        paragraph.getPortions().get_Item(0).getPortionFormat().setFontBold(e0eVar.m5322du().get_Item(eckVar3).m26155k4()[0].m26188m9() ? (byte) 1 : (byte) 0);
        eck eckVar4 = new eck();
        eckVar4.m5419k4(i3);
        eckVar4.m5421kk(i4);
        eckVar4.m5423x1(0);
        paragraph.getPortions().get_Item(0).getPortionFormat().setFontItalic(e0eVar.m5322du().get_Item(eckVar4).m26155k4()[0].m26184h4() ? (byte) 1 : (byte) 0);
    }

    /* JADX INFO: renamed from: k4 */
    private static void m70526k4(Paragraph paragraph, C6765kp c6765kp, ITable iTable, int i, int i2, e0e e0eVar) {
        paragraph.setText(c6765kp.toString());
        iTable.getRows().get_Item(i).get_Item(i2).getTextFrame().getParagraphs().add(paragraph);
        paragraph.getParagraphFormat().getBullet().applyDefaultParagraphIndentsShifts();
        m70525k4(paragraph, e0eVar, i, i2);
        c6765kp.m26801k4(0);
    }

    /* JADX INFO: renamed from: k4 */
    private static void m70527k4(C6360ck c6360ck, AbstractC12008jd abstractC12008jd, C11896dy c11896dy) {
        AbstractC12024x1 c11999ar;
        if (c6360ck.m26100rv() != null) {
            C11902kk c11902kk = new C11902kk();
            c11902kk.m55667k4(c6360ck.m26100rv().m26057kk());
            c11902kk.m55666k4(c6360ck.m26100rv().m26058to());
            C11909up c11909up = new C11909up(c6360ck.m26100rv().m26055k4().Clone(), c6360ck.m26100rv().m26059x1().Clone(), C12003du.m56460uz().Clone(), C12003du.m56460uz().Clone());
            c11909up.m55726k4(c11902kk);
            c11999ar = c11909up;
        } else if (c6360ck.m26109x6() != null) {
            c11999ar = m70517k4(c6360ck);
        } else if (c6360ck.m26099ne() != null) {
            c11999ar = m70533x1(c6360ck);
        } else {
            int iM56501c5 = c6360ck.m26096kk().m56501c5() & 255;
            if (c6360ck.m26102u4() != null) {
                abstractC12008jd.mo17495k4(c6360ck.m26102u4().m46602uz().m62692k4());
                iM56501c5 = C7019kk.m27462to(Float.valueOf(c6360ck.m26102u4().m46602uz().m62693x1()), 13);
            }
            c11999ar = new C11999ar(C12003du.m56398k4(iM56501c5, c6360ck.m26096kk().m56507jd() & 255, c6360ck.m26096kk().m56502ck() & 255, c6360ck.m26096kk().m56505fa() & 255).Clone().Clone());
        }
        try {
            abstractC12008jd.mo17527k4(c11999ar, c11896dy);
        } finally {
            if (c11999ar != null) {
                c11999ar.dispose();
            }
        }
    }

    /* JADX INFO: renamed from: k4 */
    private static void m70528k4(AbstractC12008jd abstractC12008jd) {
        abstractC12008jd.mo17560kk(6);
        if (C3085sv.m13087k4()) {
            abstractC12008jd.mo17586x1(2);
        }
        abstractC12008jd.mo17476du(2);
        abstractC12008jd.mo17481h4(4);
        abstractC12008jd.mo17517k4(C12003du.m56458up().Clone());
    }

    /* JADX INFO: renamed from: k4 */
    public static boolean m70529k4(double d) {
        return d == 90.0d || d == 270.0d;
    }

    /* JADX INFO: renamed from: k4 */
    private static boolean m70530k4(eck eckVar, int i, int i2, e0e e0eVar, boolean z, C6765kp c6765kp, ITable iTable, float f, int[] iArr, Paragraph[] paragraphArr, float[] fArr) {
        Paragraph paragraph;
        if (eckVar.m5418k4() == i + 1 && eckVar.m5420kk() == i2 + 1) {
            char c = C14113y2.m67365dy(e0eVar.m5322du().get_Item(eckVar).m26155k4()[0].m26186k4())[0];
            char c2 = mjh.f46246k4;
            if (c == c2) {
                iArr[0] = i2;
                if (c6765kp.m26807x1() > 0 && (paragraph = paragraphArr[0]) != null) {
                    m70526k4(paragraph, c6765kp, iTable, i, i2, e0eVar);
                }
                Paragraph paragraph2 = new Paragraph();
                paragraphArr[0] = paragraph2;
                paragraph2.getParagraphFormat().getBullet().setType((byte) 1);
                paragraphArr[0].getParagraphFormat().getBullet().setChar(c2);
                fArr[0] = e0eVar.m5322du().get_Item(eckVar).m26155k4()[0].m26181ck().m56571to() + f;
                return true;
            }
            if (z) {
                if (C14116yg.m67480k4(e0eVar.m5322du().get_Item(eckVar).m26155k4()[0].m26181ck().m56571to() - fArr[0]) < 10.0f) {
                    c6765kp.m26792k4(e0eVar.m5322du().get_Item(eckVar).m26155k4()[0].m26186k4());
                    return z;
                }
                if (c6765kp.m26807x1() > 0) {
                    m70526k4(paragraphArr[0], c6765kp, iTable, i, i2, e0eVar);
                }
                Paragraph paragraphM70516k4 = m70516k4(e0eVar, eckVar, iTable, i, i2);
                paragraphArr[0] = paragraphM70516k4;
                m70525k4(paragraphM70516k4, e0eVar, i, i2);
                return false;
            }
            Paragraph paragraphM70516k42 = m70516k4(e0eVar, eckVar, iTable, i, i2);
            paragraphArr[0] = paragraphM70516k42;
            m70525k4(paragraphM70516k42, e0eVar, i, i2);
        }
        return z;
    }

    /* JADX INFO: renamed from: k4 */
    private static boolean m70531k4(C9790ts c9790ts, String str) {
        for (int i = 0; i < str.length(); i++) {
            if (c9790ts.m48221m9().m48107x1(str.charAt(i)).equals(c9790ts.m48221m9().m48106x1())) {
                return false;
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: k4 */
    private static double[] m70532k4(e0e e0eVar) {
        int size = e0eVar.m5327kk().size() - 1;
        double[] dArr = new double[size];
        int i = 0;
        float fM56895kk = e0eVar.m5327kk().get_Item(0).m26086k4().m55565kk()[1].m56895kk();
        while (i < size) {
            int i2 = i + 1;
            dArr[i] = e0eVar.m5327kk().get_Item(i2).m26086k4().m55565kk()[1].m56895kk() - fM56895kk;
            fM56895kk = e0eVar.m5327kk().get_Item(i2).m26086k4().m55565kk()[1].m56895kk();
            i = i2;
        }
        return dArr;
    }
}
