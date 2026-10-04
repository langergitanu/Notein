package com.aspose.slides;

import com.aspose.slides.Collections.Generic.IGenericEnumerator;
import com.aspose.slides.exceptions.ArgumentNullException;
import com.aspose.slides.internal.p151gj.C4317dy;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.internal.p475wh.AbstractC12002ck;
import com.aspose.slides.internal.p475wh.AbstractC12008jd;
import com.aspose.slides.internal.p475wh.C12003du;
import com.aspose.slides.internal.p475wh.C12007ix;
import com.aspose.slides.internal.p475wh.C12009k4;
import com.aspose.slides.internal.p475wh.C12010kk;
import com.aspose.slides.internal.p475wh.C12013m9;
import com.aspose.slides.internal.p475wh.C12015qq;
import com.aspose.slides.internal.p475wh.C12019um;
import com.aspose.slides.internal.p475wh.C12023wl;
import com.aspose.slides.internal.p475wh.C12025x6;
import com.aspose.slides.internal.p492x4.C12380dy;
import com.aspose.slides.p559ms.System.C14044b3;
import com.aspose.slides.p559ms.System.C14052dq;
import com.aspose.slides.p559ms.System.C14064he;
import com.aspose.slides.p559ms.System.C14113y2;
import com.aspose.slides.p559ms.System.C14116yg;
import com.aspose.slides.p559ms.System.IDisposable;
import com.orion.notein.richeditor.utils.p606io.IOUtils;
import java.util.Iterator;

/* JADX INFO: renamed from: com.aspose.slides.c3 */
/* JADX INFO: loaded from: classes3.dex */
class C0840c3 {
    /* JADX INFO: renamed from: k4 */
    public static float m4429k4(String str, C12013m9 c12013m9, boolean z) {
        String[] strArrM57984k4 = new C12380dy("\\s+").m57984k4(str);
        float fM56699x1 = 0.0f;
        for (int i = 0; i < strArrM57984k4.length; i++) {
            C12015qq c12015qq = new C12015qq();
            (z ? m4449x1(strArrM57984k4[i], c12013m9) : AbstractC12008jd.m56582k4((AbstractC12002ck) new C12009k4(1, 1)).mo17487k4(strArrM57984k4[i], c12013m9)).CloneTo(c12015qq);
            if (c12015qq.m56699x1() > fM56699x1) {
                fM56699x1 = c12015qq.m56699x1();
            }
        }
        return fM56699x1;
    }

    /* JADX INFO: renamed from: kk */
    public static C12015qq m4445kk(String str, C12013m9 c12013m9) {
        C12023wl c12023wl = new C12023wl(Integer.MAX_VALUE, Integer.MAX_VALUE);
        C12023wl c12023wlClone = m4442k4(str, c12013m9).Clone();
        C12015qq c12015qqClone = m4435k4(str, c12013m9, c12023wl.Clone()).Clone();
        return new C12015qq(c12023wlClone.m56865x1() - c12015qqClone.m56699x1(), c12023wlClone.m56862kk() - c12015qqClone.m56697kk());
    }

    /* JADX INFO: renamed from: x1 */
    public static C12015qq m4448x1(String str, int i, C12013m9 c12013m9, C12015qq c12015qq, int i2, int i3) {
        if (C14113y2.m67424kk(str, IOUtils.LINE_SEPARATOR_UNIX)) {
            str = C14113y2.m67400k4(str, " ");
        }
        C12015qq c12015qqClone = m4450x1(str, c12013m9, c12015qq.Clone(), i2, i3).Clone();
        int iM67482k4 = C14116yg.m67482k4(i);
        return iM67482k4 != 0 ? iM67482k4 != 90 ? C12023wl.m56853k4(m4437k4(AbstractC12008jd.m56582k4((AbstractC12002ck) new C12009k4(1, 1)).mo17490k4(str, c12013m9, new C12025x6(0.0f, 0.0f), new C12019um(C12019um.m56799c5())).Clone().Clone(), c12015qq.Clone(), C14116yg.m67482k4(i))) : m4450x1(str, c12013m9, new C12015qq(C7019kk.m27462to(Float.valueOf(c12015qq.m56697kk()), 13), C7019kk.m27462to(Float.valueOf(c12015qq.m56699x1()), 13)), i2, i3).Clone() : c12015qqClone;
    }

    /* JADX INFO: renamed from: k4 */
    public static int m4430k4(int i) {
        if (i == 1) {
            return 1;
        }
        if (i == 7 || i == 9) {
            return 0;
        }
        return (i == 0 || i == 8) ? 2 : 1;
    }

    /* JADX INFO: renamed from: kk */
    public static C12023wl m4446kk(String str, int i, C12013m9 c12013m9, C12015qq c12015qq, int i2, int i3) {
        int iM67482k4 = C14116yg.m67482k4(i);
        if (iM67482k4 == 0) {
            return m4447kk(str, c12013m9, c12015qq.Clone(), i2, i3).Clone();
        }
        if (iM67482k4 != 90) {
            return m4437k4(AbstractC12008jd.m56582k4((AbstractC12002ck) new C12009k4(1, 1)).mo17490k4(str, c12013m9, new C12025x6(0.0f, 0.0f), new C12019um(C12019um.m56799c5())).Clone().Clone(), c12015qq.Clone(), C14116yg.m67482k4(i));
        }
        C12023wl c12023wlClone = m4447kk(str, c12013m9, new C12015qq(C7019kk.m27462to(Float.valueOf(c12015qq.m56697kk()), 13), C7019kk.m27462to(Float.valueOf(c12015qq.m56699x1()), 13)), i2, i3).Clone();
        return new C12023wl(c12023wlClone.m56862kk(), c12023wlClone.m56865x1());
    }

    /* JADX INFO: renamed from: x1 */
    public static C12015qq m4449x1(String str, C12013m9 c12013m9) {
        C12015qq c12015qqClone = AbstractC12008jd.m56582k4((AbstractC12002ck) new C12009k4(1, 1)).mo17488k4(str, c12013m9, Integer.MAX_VALUE, new C12019um(C12019um.m56799c5())).Clone();
        return new C12015qq(kc0.m63753k4(c12015qqClone.m56699x1()), kc0.m63753k4(c12015qqClone.m56697kk()));
    }

    /* JADX INFO: renamed from: k4 */
    public static int m4431k4(C12013m9 c12013m9) {
        return kc0.m63753k4(c12013m9.m56644k4(AbstractC12008jd.m56582k4((AbstractC12002ck) new C12009k4(1, 1))));
    }

    /* JADX INFO: renamed from: kk */
    private static C12023wl m4447kk(String str, C12013m9 c12013m9, C12015qq c12015qq, int i, int i2) {
        AbstractC12008jd abstractC12008jdM56582k4 = AbstractC12008jd.m56582k4((AbstractC12002ck) new C12009k4(1, 1));
        C12019um c12019um = new C12019um(C12019um.m56799c5());
        c12019um.m56811k4(0.0f, new float[]{100.0f});
        c12019um.m56812k4(m4430k4(i));
        c12019um.m56826x1(m4430k4(i2));
        C12015qq c12015qqClone = abstractC12008jdM56582k4.mo17489k4(str, c12013m9, c12015qq.Clone(), c12019um).Clone();
        return new C12023wl(kc0.m63753k4(c12015qqClone.m56699x1()), kc0.m63753k4(c12015qqClone.m56697kk()));
    }

    /* JADX INFO: renamed from: x1 */
    private static C12015qq m4450x1(String str, C12013m9 c12013m9, C12015qq c12015qq, int i, int i2) {
        return m4434k4(str, c12013m9, c12015qq.Clone(), i, i2, C12019um.m56799c5());
    }

    /* JADX INFO: renamed from: k4 */
    public static AutoShape m4432k4(String str, C12013m9 c12013m9, C12003du c12003du, int i, int i2, C14365qy c14365qy) {
        AutoShape autoShape = new AutoShape(c14365qy.m69834fa());
        autoShape.setShapeType(5);
        autoShape.addTextFrame(C14113y2.m67362du(str, C14113y2.m67365dy(C14052dq.m66570kk())));
        FontData fontData = new FontData(c12013m9.m56651x1().m56527du());
        C12003du c12003duClone = c12003du.Clone();
        IGenericEnumerator<IParagraph> it = autoShape.getTextFrame().getParagraphs().iterator();
        while (it.hasNext()) {
            try {
                IParagraph next = it.next();
                next.getParagraphFormat().setAlignment(i);
                if (next.getParagraphFormat().getBullet().getType() == -1) {
                    next.getParagraphFormat().getBullet().setType((byte) 0);
                }
                IPortionFormat defaultPortionFormat = next.getParagraphFormat().getDefaultPortionFormat();
                defaultPortionFormat.getFillFormat().setFillType((byte) 1);
                ((ColorFormat) defaultPortionFormat.getFillFormat().getSolidFillColor()).m1080k4(c12003duClone.Clone());
                if (defaultPortionFormat.getLatinFont() == null) {
                    defaultPortionFormat.setLatinFont(fontData);
                }
                if (defaultPortionFormat.getEastAsianFont() == null) {
                    defaultPortionFormat.setEastAsianFont(fontData);
                }
                if (C14044b3.m66437kk(defaultPortionFormat.getFontHeight())) {
                    defaultPortionFormat.setFontHeight(c12013m9.m56639dy());
                }
                if (defaultPortionFormat.getFontBold() == -1) {
                    defaultPortionFormat.setFontBold(c12013m9.m56645k4() ? (byte) 1 : (byte) 0);
                }
                if (defaultPortionFormat.getFontItalic() == -1) {
                    defaultPortionFormat.setFontItalic(c12013m9.m56641h4() ? (byte) 1 : (byte) 0);
                }
                if (defaultPortionFormat.getFontUnderline() == -1) {
                    defaultPortionFormat.setFontUnderline(c12013m9.m56637ck() ? (byte) 2 : (byte) 0);
                }
                IParagraphFormat paragraphFormat = next.getParagraphFormat();
                if (paragraphFormat.getAlignment() == -1) {
                    paragraphFormat.setAlignment(1);
                }
                if (paragraphFormat.getFontAlignment() == -1) {
                    paragraphFormat.setFontAlignment(2);
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
        TextFrameFormat textFrameFormat = (TextFrameFormat) autoShape.m288x1().getTextFrameFormat();
        textFrameFormat.m2953k4(textFrameFormat.m2963to().m73500k4(xmh.f50156k4.Clone()).Clone());
        return autoShape;
    }

    /* JADX INFO: renamed from: x1 */
    public static C12023wl m4451x1(String str, int i, C12013m9 c12013m9, C12023wl c12023wl, int i2, int i3) {
        return m4446kk(str, i, c12013m9, new C12015qq(c12023wl.m56865x1(), c12023wl.m56862kk()).Clone(), i2, i3);
    }

    /* JADX INFO: renamed from: k4 */
    public static C12015qq m4433k4(String str, C12013m9 c12013m9, C12015qq c12015qq) {
        String str2;
        boolean z;
        AbstractC12008jd abstractC12008jdM56582k4 = AbstractC12008jd.m56582k4((AbstractC12002ck) new C12009k4(1, 1));
        C12015qq c12015qq2 = new C12015qq(c12015qq.m56699x1(), c12015qq.m56697kk());
        int iM63753k4 = kc0.m63753k4(c12013m9.m56644k4(abstractC12008jdM56582k4));
        if (str == null || str.length() == 0) {
            return new C12015qq(0.0f, iM63753k4);
        }
        C12380dy c12380dy = new C12380dy("\\n");
        C12380dy c12380dy2 = new C12380dy("^\\s{1,}$");
        if (!c12380dy.m57988to(str) && (c12380dy2.m57988to(str) || c12380dy2.m57988to(C14113y2.m67422kk(str, str.length() - 1)))) {
            C12015qq c12015qqClone = abstractC12008jdM56582k4.mo17490k4(str, c12013m9, new C12025x6(0.0f, 0.0f), new C12019um(2048)).Clone();
            float f = iM63753k4;
            if (c12015qqClone.m56697kk() > 1.5f * f) {
                return c12015qqClone;
            }
            String strM67408k4 = C14113y2.m67408k4("aaaaaaaaaa", str, "aaaaaaaaaa");
            C12015qq c12015qq3 = new C12015qq(2.1474836E9f, 2.1474836E9f);
            C12015qq c12015qqClone2 = m4433k4("aaaaaaaaaa", c12013m9, c12015qq3.Clone()).Clone();
            C12015qq c12015qqClone3 = m4433k4(strM67408k4, c12013m9, c12015qq3.Clone()).Clone();
            return new C12015qq(c12015qqClone3.m56699x1() - (c12015qqClone2.m56699x1() * 2.0f) > 0.0f ? c12015qqClone3.m56699x1() - (c12015qqClone2.m56699x1() * 2.0f) : f / 5.0f, c12015qqClone.m56697kk());
        }
        C12019um c12019um = new C12019um(C12019um.m56799c5());
        c12019um.m56817kk(c12019um.m56816kk() | 2048);
        C12015qq c12015qqClone4 = abstractC12008jdM56582k4.mo17489k4(str, c12013m9, c12015qq2.Clone(), c12019um).Clone();
        float f2 = iM63753k4;
        if (c12015qqClone4.m56697kk() < 1.5f * f2) {
            String strM67400k4 = C14113y2.m67400k4(str, "|");
            c12015qq2.m56695k4(c12015qq2.m56699x1() + f2);
            abstractC12008jdM56582k4.mo17489k4(strM67400k4, c12013m9, c12015qq2.Clone(), c12019um).CloneTo(c12015qqClone4);
            str2 = strM67400k4;
            z = true;
        } else {
            str2 = str;
            z = false;
        }
        int iM63753k42 = kc0.m63753k4(c12015qqClone4.m56697kk());
        if (iM63753k42 < 1 || c12015qqClone4.m56699x1() < 1.0f) {
            return c12015qqClone4;
        }
        int iOooO00o = com.aspose.slides.Collections.Generic.OooO00o.OooO00o(c12015qqClone4.m56699x1(), 0.1d, 14);
        int i = iOooO00o >= 10 ? iOooO00o : 10;
        C12009k4 c12009k4 = new C12009k4(i, iM63753k42);
        boolean z2 = z;
        AbstractC12008jd abstractC12008jdM56582k42 = AbstractC12008jd.m56582k4((AbstractC12002ck) c12009k4);
        float fM63753k4 = kc0.m63753k4(c12015qqClone4.m56699x1());
        if (!z2) {
            abstractC12008jdM56582k42.mo17517k4(C12003du.m56385i5().Clone());
            abstractC12008jdM56582k42.mo17556k4(str2, c12013m9, C12010kk.m56610k4(), new C12007ix(i - fM63753k4, 0.0f, fM63753k4, iM63753k42).Clone(), c12019um);
            int i2 = i - 1;
            while (true) {
                if (i2 < 0) {
                    break;
                }
                fM63753k4 -= 1.0f;
                int i3 = 0;
                while (i3 < iM63753k42 && (c12009k4.m56609x1(i2, i3).m56507jd() & 255) == 255) {
                    i3++;
                }
                if (i3 < iM63753k42) {
                    fM63753k4 += 1.0f;
                    break;
                }
                i2--;
            }
        } else {
            abstractC12008jdM56582k42.mo17517k4(C12003du.m56385i5().Clone());
            abstractC12008jdM56582k42.mo17554k4(str2, c12013m9, C12010kk.m56610k4(), i - fM63753k4, 0.0f, c12019um);
            for (int i4 = i - 1; i4 >= 0; i4--) {
                fM63753k4 -= 1.0f;
                if ((c12009k4.m56609x1(i4, iM63753k4 / 2).m56507jd() & 255) != 255) {
                    break;
                }
            }
        }
        c12009k4.dispose();
        if (abstractC12008jdM56582k42 != null) {
            abstractC12008jdM56582k42.dispose();
        }
        return new C12015qq(fM63753k4, iM63753k42);
    }

    /* JADX INFO: renamed from: k4 */
    private static C12015qq m4434k4(String str, C12013m9 c12013m9, C12015qq c12015qq, int i, int i2, C12019um c12019um) {
        AbstractC12008jd abstractC12008jdM56582k4 = AbstractC12008jd.m56582k4((AbstractC12002ck) new C12009k4(1, 1));
        C12019um c12019um2 = new C12019um(c12019um);
        c12019um2.m56812k4(m4430k4(i));
        c12019um2.m56826x1(m4430k4(i2));
        return abstractC12008jdM56582k4.mo17489k4(str, c12013m9, c12015qq.Clone(), c12019um2).Clone();
    }

    /* JADX INFO: renamed from: k4 */
    public static C12015qq m4435k4(String str, C12013m9 c12013m9, C12023wl c12023wl) {
        return m4433k4(str, c12013m9, new C12015qq(c12023wl.m56865x1(), c12023wl.m56862kk()).Clone());
    }

    /* JADX INFO: renamed from: k4 */
    public static C12015qq m4436k4(String str, C12013m9 c12013m9, C14365qy c14365qy, C12015qq c12015qq, float f) {
        AutoShape autoShapeM4432k4 = m4432k4(str, c12013m9, C12003du.f40505to.Clone(), 1, 2, c14365qy);
        autoShapeM4432k4.setX(0.0f);
        autoShapeM4432k4.setY(0.0f);
        TextFrame textFrame = (TextFrame) C7019kk.m27452k4((Object) autoShapeM4432k4.getTextFrame(), TextFrame.class);
        jq6.m63494x1(textFrame.f3523to);
        oju ojuVarClone = textFrame.f3523to.mo64296kk().Clone();
        int iM27462to = C7019kk.m27462to(Float.valueOf(f), 13);
        if (iM27462to != 0) {
            if (iM27462to != 90) {
                autoShapeM4432k4.setWidth(c12015qq.m56699x1());
                autoShapeM4432k4.setHeight(c12015qq.m56697kk());
                return C12023wl.m56853k4(m4437k4(new C12015qq(ojuVarClone.f47836k4, ojuVarClone.f47837x1).Clone(), c12015qq.Clone(), C7019kk.m27462to(Float.valueOf(f), 13)));
            }
            autoShapeM4432k4.setHeight(c12015qq.m56699x1());
            autoShapeM4432k4.setWidth(c12015qq.m56697kk());
            return new C12015qq(ojuVarClone.f47837x1, ojuVarClone.f47836k4);
        }
        float fM4429k4 = m4429k4(str, c12013m9, true);
        C12015qq c12015qq2 = new C12015qq();
        if (fM4429k4 < c12015qq.m56699x1()) {
            c12015qq.CloneTo(c12015qq2);
        } else {
            c12015qq2 = new C12015qq(fM4429k4, c12015qq.m56697kk());
        }
        autoShapeM4432k4.setWidth(c12015qq2.m56699x1());
        autoShapeM4432k4.setHeight(c12015qq2.m56697kk());
        return new C12015qq(ojuVarClone.f47836k4, ojuVarClone.f47837x1);
    }

    /* JADX INFO: renamed from: k4 */
    private static C12023wl m4437k4(C12015qq c12015qq, C12015qq c12015qq2, int i) {
        double dM67482k4 = (((double) C14116yg.m67482k4(i % 90)) / 180.0d) * 3.141592653589793d;
        double dM67495m9 = (C14116yg.m67495m9(dM67482k4) * ((double) c12015qq.m56697kk())) + (C14116yg.m67470dy(dM67482k4) * ((double) c12015qq.m56699x1()));
        double dM67470dy = (C14116yg.m67470dy(dM67482k4) * ((double) c12015qq.m56697kk())) + (C14116yg.m67495m9(dM67482k4) * ((double) c12015qq.m56699x1()));
        if (dM67495m9 > c12015qq2.m56699x1()) {
            dM67470dy = (((double) c12015qq2.m56699x1()) * dM67470dy) / dM67495m9;
            dM67495m9 = c12015qq2.m56699x1();
        }
        if (dM67470dy > c12015qq2.m56697kk()) {
            dM67495m9 = (((double) c12015qq2.m56697kk()) * dM67495m9) / dM67470dy;
            dM67470dy = c12015qq2.m56697kk();
        }
        return new C12023wl(kc0.m63753k4(dM67495m9), kc0.m63753k4(dM67470dy));
    }

    /* JADX WARN: Type inference failed for: r7v10, types: [double, int] */
    /* JADX WARN: Type inference failed for: r7v11, types: [int, java.lang.StringBuffer] */
    /* JADX WARN: Type inference failed for: r8v5, types: [double, int] */
    /* JADX WARN: Type inference failed for: r8v6, types: [int, java.lang.StringBuffer] */
    /* JADX INFO: renamed from: k4 */
    public static C12023wl m4438k4(String str, float f, C12013m9 c12013m9, int i, C14365qy c14365qy, C12015qq c12015qq) {
        if (c12013m9 == null) {
            throw new ArgumentNullException("font");
        }
        if (c14365qy == null) {
            throw new ArgumentNullException("renderContext");
        }
        AutoShape autoShapeM4432k4 = m4432k4(str, c12013m9, C12003du.f40505to.Clone(), i, 2, c14365qy);
        if (C14064he.m66715kk(f)) {
            f = 0.0f;
        }
        autoShapeM4432k4.setWidth(C14116yg.m67480k4(f) == 90.0f ? c12015qq.m56697kk() : c12015qq.m56699x1());
        autoShapeM4432k4.setHeight(C14116yg.m67480k4(f) == 90.0f ? c12015qq.m56699x1() : c12015qq.m56697kk());
        autoShapeM4432k4.setRotation(-f);
        jq6.m63494x1(autoShapeM4432k4.m288x1().f3523to);
        new jjy(C14873z5.m74318k4(jq6.m63492k4(autoShapeM4432k4.m288x1().f3523to)).Clone()).m63353k4(f);
        return new C12023wl(StringBuffer.append((int) r9.m63360x1()), StringBuffer.append((int) r9.m63358kk()));
    }

    /* JADX INFO: renamed from: k4 */
    public static C12023wl m4439k4(String str, int i, C12013m9 c12013m9, C12015qq c12015qq, int i2, int i3) {
        return m4440k4(str, i, c12013m9, c12015qq.Clone(), i2, i3, false);
    }

    /* JADX INFO: renamed from: k4 */
    public static C12023wl m4440k4(String str, int i, C12013m9 c12013m9, C12015qq c12015qq, int i2, int i3, boolean z) {
        if (C14113y2.m67424kk(str, IOUtils.LINE_SEPARATOR_UNIX)) {
            str = C14113y2.m67400k4(str, " ");
        }
        int iM67482k4 = C14116yg.m67482k4(i);
        if (iM67482k4 != 0) {
            if (iM67482k4 != 90) {
                return m4437k4(AbstractC12008jd.m56582k4((AbstractC12002ck) new C12009k4(1, 1)).mo17490k4(str, c12013m9, new C12025x6(0.0f, 0.0f), new C12019um(C12019um.m56799c5())).Clone().Clone(), c12015qq.Clone(), C14116yg.m67482k4(i));
            }
            C12023wl c12023wlClone = m4443k4(str, c12013m9, new C12015qq(C7019kk.m27462to(Float.valueOf(c12015qq.m56697kk()), 13), C7019kk.m27462to(Float.valueOf(c12015qq.m56699x1()), 13)), i2, i3).Clone();
            return new C12023wl(c12023wlClone.m56862kk(), c12023wlClone.m56865x1());
        }
        float fM4429k4 = m4429k4(str, c12013m9, true);
        C12015qq c12015qq2 = new C12015qq();
        if (fM4429k4 < c12015qq.m56699x1() || z) {
            c12015qq.CloneTo(c12015qq2);
        } else {
            c12015qq2 = new C12015qq(fM4429k4, c12015qq.m56697kk());
        }
        return m4446kk(str, 0, c12013m9, c12015qq2.Clone(), i2, i3);
    }

    /* JADX INFO: renamed from: k4 */
    public static C12023wl m4441k4(String str, int i, C12013m9 c12013m9, C12023wl c12023wl, int i2, int i3) {
        return m4439k4(str, i, c12013m9, new C12015qq(c12023wl.m56865x1(), c12023wl.m56862kk()).Clone(), i2, i3);
    }

    /* JADX INFO: renamed from: k4 */
    public static C12023wl m4442k4(String str, C12013m9 c12013m9) {
        C12015qq c12015qqClone = AbstractC12008jd.m56582k4((AbstractC12002ck) new C12009k4(1, 1)).mo17487k4(str, c12013m9).Clone();
        return new C12023wl(kc0.m63753k4(c12015qqClone.m56699x1()), kc0.m63753k4(c12015qqClone.m56697kk()));
    }

    /* JADX INFO: renamed from: k4 */
    private static C12023wl m4443k4(String str, C12013m9 c12013m9, C12015qq c12015qq, int i, int i2) {
        AbstractC12008jd abstractC12008jdM56582k4 = AbstractC12008jd.m56582k4((AbstractC12002ck) new C12009k4(1, 1));
        C12019um c12019um = new C12019um();
        c12019um.m56812k4(m4430k4(i));
        c12019um.m56826x1(m4430k4(i2));
        C12015qq c12015qqClone = abstractC12008jdM56582k4.mo17489k4(str, c12013m9, c12015qq.Clone(), c12019um).Clone();
        return new C12023wl(kc0.m63753k4(c12015qqClone.m56699x1()), kc0.m63753k4(c12015qqClone.m56697kk()));
    }

    /* JADX INFO: renamed from: k4 */
    public static void m4444k4(C12007ix c12007ix, String str, int i, C12013m9 c12013m9, C12003du c12003du, int i2, int i3, C14365qy c14365qy) {
        float fM56575x1;
        AutoShape autoShapeM4432k4 = m4432k4(str, c12013m9, c12003du.Clone(), i2, i3, c14365qy);
        int iM67482k4 = C14116yg.m67482k4(i);
        if (iM67482k4 == 0) {
            autoShapeM4432k4.setX(c12007ix.m56557jd());
            autoShapeM4432k4.setY(c12007ix.m56551ck());
            autoShapeM4432k4.setWidth(c12007ix.m56550c5());
            fM56575x1 = c12007ix.m56575x1();
        } else {
            if (iM67482k4 != 90) {
                autoShapeM4432k4.setX(c12007ix.m56557jd());
                autoShapeM4432k4.setY(c12007ix.m56551ck());
                autoShapeM4432k4.setWidth(c12007ix.m56550c5());
                autoShapeM4432k4.setHeight(c12007ix.m56575x1());
                autoShapeM4432k4.setRotation(-i);
                C4317dy c4317dyM74623ks = c14365qy.m69870wy().m74623ks();
                autoShapeM4432k4.m2546bz().mo4131k4(c14365qy.m69870wy(), c14365qy.m69821ak(), InterruptionToken.getNone());
                c14365qy.m69870wy().m74632x1(c4317dyM74623ks);
            }
            autoShapeM4432k4.setRotation(-i);
            C12025x6 c12025x6 = new C12025x6(C22205OooOOo.OooO00o(c12007ix, 2.0f, c12007ix.m56557jd()), C22203OooOO0o.OooO0O0(c12007ix, 2.0f, c12007ix.m56551ck()));
            C12007ix c12007ix2 = new C12007ix(c12025x6.m56897x1() - (c12007ix.m56575x1() / 2.0f), c12025x6.m56895kk() - (c12007ix.m56550c5() / 2.0f), c12007ix.m56575x1(), c12007ix.m56550c5());
            autoShapeM4432k4.setX(c12007ix2.m56557jd());
            autoShapeM4432k4.setY(c12007ix2.m56551ck());
            autoShapeM4432k4.setWidth(c12007ix2.m56550c5());
            fM56575x1 = c12007ix2.m56575x1();
        }
        autoShapeM4432k4.setHeight(fM56575x1);
        C4317dy c4317dyM74623ks2 = c14365qy.m69870wy().m74623ks();
        autoShapeM4432k4.m2546bz().mo4131k4(c14365qy.m69870wy(), c14365qy.m69821ak(), InterruptionToken.getNone());
        c14365qy.m69870wy().m74632x1(c4317dyM74623ks2);
    }
}
