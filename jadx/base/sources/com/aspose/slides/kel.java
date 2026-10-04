package com.aspose.slides;

import com.aspose.slides.internal.p077d8.C3110yd;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.internal.p407st.C10450gf;
import com.aspose.slides.internal.p407st.C10453gk;
import com.aspose.slides.internal.p407st.C10462h9;
import com.aspose.slides.internal.p407st.C10479ig;
import com.aspose.slides.internal.p407st.C10480ii;
import com.aspose.slides.internal.p407st.C10533m2;
import com.aspose.slides.internal.p407st.C10534m3;
import com.aspose.slides.p559ms.System.C14064he;

/* JADX INFO: loaded from: classes3.dex */
class kel {
    /* JADX INFO: renamed from: k4 */
    public static void m63782k4(IPortionFormat iPortionFormat, ITextFrameFormat iTextFrameFormat, uz3 uz3Var) {
        if (iTextFrameFormat.getThreeDFormat() == null || !((ThreeDFormat) iTextFrameFormat.getThreeDFormat()).m3009k4(true)) {
            tcp.m71098k4(iPortionFormat.getLineFormat(), uz3Var.m72000ix(), (byte) -1, uz3Var.m3738du().m70215k4());
        }
        C14680vi.m72290k4(iPortionFormat.getFillFormat(), uz3Var);
        C14200nt.m68201x1(uz3Var);
        C10534m3 c10534m3M72004qq = uz3Var.m72004qq();
        if (!C14064he.m66715kk(iPortionFormat.getFontHeight())) {
            c10534m3M72004qq.m51263x1().m50930x1(new C10479ig(C3110yd.m13238k4(iPortionFormat.getFontHeight())));
        }
        if (!C14064he.m66715kk(iPortionFormat.getSpacing())) {
            float spacing = iPortionFormat.getSpacing() > 0.0f ? (iPortionFormat.getSpacing() / iPortionFormat.getFontHeight()) + 1.0f : iPortionFormat.getSpacing() < 0.0f ? 1.0f - ((-iPortionFormat.getSpacing()) / (iPortionFormat.getFontHeight() / 2.0f)) : 1.0f;
            if (spacing != 1.0f) {
                c10534m3M72004qq.m51263x1().m50930x1(new C10453gk(C3110yd.m13238k4(spacing)));
            }
        }
        if (iPortionFormat.getLatinFont() != null) {
            c10534m3M72004qq.m51263x1().m50930x1(new C10450gf(197, iPortionFormat.getLatinFont().getFontName()));
        }
        C10533m2 c10533m2 = new C10533m2();
        c10533m2.m51251k4(true);
        c10533m2.m51243dy(true);
        if (iPortionFormat.getFontBold() == 1) {
            c10533m2.m51256to(true);
            c10533m2.m51239ck(true);
        }
        if (iPortionFormat.getFontItalic() == 1) {
            c10533m2.m51241du(true);
            c10533m2.m51245fa(true);
        }
        if (!C14064he.m66715kk(iPortionFormat.getKerningMinimalSize())) {
            c10533m2.m51259x1(true);
            c10533m2.m51237c5(true);
        }
        if (iPortionFormat.getFontUnderline() == 2) {
            c10533m2.m51247h4(true);
            c10533m2.m51258up(true);
        }
        if (iPortionFormat.getStrikethroughType() == 1) {
            c10533m2.m51254m9(true);
            c10533m2.m51261yj(true);
        }
        if (((PortionFormat) iPortionFormat).m2312rv() || iTextFrameFormat.getWrapText() == 0) {
            c10533m2.m51252kk(true);
            c10533m2.m51249jd(true);
        }
        c10534m3M72004qq.m51263x1().m50930x1(c10533m2);
    }

    /* JADX INFO: renamed from: k4 */
    public static void m63783k4(IPortionFormat iPortionFormat, ri7 ri7Var) {
        float fM51464k4;
        C10462h9 c10462h9M70140fa = ri7Var.m70140fa();
        TextFrame textFrameM63996m9 = ri7Var.m70141ix().m63996m9();
        if (textFrameM63996m9.m2908jd().getThreeDFormat() == null || !((ThreeDFormat) textFrameM63996m9.m2908jd().getThreeDFormat()).m3009k4(true)) {
            tcp.m71097k4(iPortionFormat.getLineFormat(), (byte) -1, false, ri7Var);
        }
        C14680vi.m72289k4((FillFormat) iPortionFormat.getFillFormat(), ri7Var);
        C14200nt.m68199k4(iPortionFormat.getEffectFormat(), ri7Var);
        C10480ii c10480iiM51263x1 = c10462h9M70140fa.mo50859du().m51263x1();
        C10479ig c10479ig = (C10479ig) C7019kk.m27452k4((Object) c10480iiM51263x1.m50923k4(195), C10479ig.class);
        iPortionFormat.setFontHeight(c10479ig != null ? c10479ig.m50920x1().m51464k4() : 36.0f);
        C10453gk c10453gk = (C10453gk) C7019kk.m27452k4((Object) c10480iiM51263x1.m50923k4(196), C10453gk.class);
        if (c10453gk != null) {
            if (c10453gk.m50839x1().m51464k4() > 1.0f) {
                fM51464k4 = (c10453gk.m50839x1().m51464k4() - 1.0f) * iPortionFormat.getFontHeight();
            } else if (c10453gk.m50839x1().m51464k4() < 1.0f) {
                fM51464k4 = -((1.0f - c10453gk.m50839x1().m51464k4()) * (iPortionFormat.getFontHeight() / 2.0f));
            }
            iPortionFormat.setSpacing(fM51464k4);
        }
        C10533m2 c10533m2 = (C10533m2) C7019kk.m27452k4((Object) c10480iiM51263x1.m50923k4(255), C10533m2.class);
        if (c10533m2 != null) {
            if (c10533m2.m51260x1() && c10533m2.m51244dy()) {
                iPortionFormat.setKerningMinimalSize(0.1f);
            }
            if (c10533m2.m51257to() && c10533m2.m51250jd()) {
                iPortionFormat.setFontBold((byte) 1);
            }
            if (c10533m2.m51242du() && c10533m2.m51240ck()) {
                iPortionFormat.setFontItalic((byte) 1);
            }
            if (c10533m2.m51248h4() && c10533m2.m51246fa()) {
                iPortionFormat.setFontUnderline((byte) 2);
            }
            if (c10533m2.m51253kk() && c10533m2.m51238c5() && C7019kk.m27469x1(iPortionFormat, PortionFormat.class) && c10462h9M70140fa.mo50864to().m52025c5() == 144) {
                ((PortionFormat) iPortionFormat).m2316x1(true);
            }
        }
        C10450gf c10450gf = (C10450gf) C7019kk.m27452k4((Object) c10480iiM51263x1.m50923k4(197), C10450gf.class);
        if (c10450gf != null) {
            iPortionFormat.setLatinFont(new FontData(k3x.m63620k4(c10450gf.mo50423x1())));
        }
    }
}
