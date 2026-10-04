package com.aspose.slides;

import com.aspose.slides.Collections.Generic.Dictionary;
import com.aspose.slides.Collections.Generic.IGenericEnumerator;
import com.aspose.slides.Collections.Generic.KeyValuePair;
import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.exceptions.Exception;
import com.aspose.slides.exceptions.XmlException;
import com.aspose.slides.internal.p077d8.C3085sv;
import com.aspose.slides.internal.p294n9.C6765kp;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.internal.p332p7.AbstractC9290yj;
import com.aspose.slides.internal.p332p7.C7394ca;
import com.aspose.slides.internal.p407st.AbstractC10571o4;
import com.aspose.slides.internal.p407st.C10355ai;
import com.aspose.slides.internal.p407st.C10422ei;
import com.aspose.slides.internal.p407st.C10462h9;
import com.aspose.slides.internal.p407st.C10509kh;
import com.aspose.slides.internal.p407st.C10609qn;
import com.aspose.slides.internal.p407st.C10711xc;
import com.aspose.slides.internal.p407st.C10750zf;
import com.aspose.slides.internal.p407st.InterfaceC10710xb;
import com.aspose.slides.internal.p464vq.AbstractC11760jd;
import com.aspose.slides.internal.p464vq.AbstractC11812sq;
import com.aspose.slides.internal.p464vq.C11708b5;
import com.aspose.slides.internal.p464vq.C11709bg;
import com.aspose.slides.internal.p464vq.C11741f9;
import com.aspose.slides.internal.p464vq.C11791os;
import com.aspose.slides.internal.p464vq.C11808s7;
import com.aspose.slides.internal.p464vq.C11816t6;
import com.aspose.slides.internal.p464vq.C11836vh;
import com.aspose.slides.internal.p464vq.C11837vj;
import com.aspose.slides.internal.p464vq.C11854xw;
import com.aspose.slides.p559ms.System.C14113y2;
import com.aspose.slides.p559ms.System.C14116yg;
import com.aspose.slides.p559ms.System.C14117yj;
import com.aspose.slides.p559ms.System.IDisposable;
import com.huawei.hms.network.embedded.C18115b5;
import java.util.Iterator;

/* JADX INFO: renamed from: com.aspose.slides.xy */
/* JADX INFO: loaded from: classes3.dex */
class C14823xy {
    /* JADX INFO: renamed from: k4 */
    private static List<KeyValuePair<Integer, C10422ei>> m73643k4(C10462h9 c10462h9) {
        List.Enumerator<AbstractC10571o4> it;
        boolean zM27456k4;
        List<KeyValuePair<Integer, C10422ei>> list = new List<>();
        List list2 = new List();
        if (c10462h9 != null && c10462h9.m50880ck() != null && c10462h9.m50880ck().m51346x1() != null) {
            List.Enumerator<InterfaceC10710xb> it2 = c10462h9.m50880ck().m51346x1().m50617yd().iterator();
            while (it2.hasNext()) {
                try {
                    InterfaceC10710xb next = it2.next();
                    if (C7019kk.m27469x1(next, C10750zf.class)) {
                        it = ((C10750zf) next).m50513yj().iterator();
                        while (it.hasNext()) {
                            try {
                                AbstractC10571o4 next2 = it.next();
                                if (C7019kk.m27469x1(next2, C10422ei.class)) {
                                    list2.addItem((C10422ei) next2);
                                }
                            } finally {
                            }
                        }
                        if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                            it.dispose();
                        }
                    }
                } catch (Throwable th) {
                    if (C7019kk.m27456k4((Iterator) it2, (Class<IDisposable>) IDisposable.class)) {
                        it2.dispose();
                    }
                    throw th;
                }
            }
            if (C7019kk.m27456k4((Iterator) it2, (Class<IDisposable>) IDisposable.class)) {
                it2.dispose();
            }
            it = c10462h9.m50880ck().m51346x1().m50617yd().iterator();
            int i = 0;
            while (it.hasNext()) {
                try {
                    C10509kh c10509kh = (C10509kh) C7019kk.m27452k4((Object) it.next(), C10509kh.class);
                    if (c10509kh != null && c10509kh.m51408lr() == 0) {
                        int i2 = i + 1;
                        list.addItem(new KeyValuePair<>(Integer.valueOf(c10509kh.m51108kk()), list2.get_Item(i)));
                        i = i2;
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
    private static Shape m73651x1(qah qahVar) {
        AbstractC9290yj abstractC9290yjM70392k4;
        GroupShape groupShapeM70646to = qahVar.m69484h4().m70646to();
        List<C11791os> listM55287yj = qahVar.m69483fa().m55287yj();
        bjs bjsVarM64715h4 = qahVar.m69493to().m64715h4();
        sfn.m70603k4((IPresentation) null, (IPresentation) null, bjsVarM64715h4.m4229k4());
        List.Enumerator<C7394ca> it = listM55287yj.iterator();
        while (it.hasNext()) {
            try {
                C11791os next = it.next();
                try {
                    abstractC9290yjM70392k4 = new C14423ry(next, bjsVarM64715h4.m4229k4()).m70392k4(bjsVarM64715h4);
                } catch (XmlException e) {
                    C3085sv.m13082k4(e);
                    abstractC9290yjM70392k4 = null;
                }
                if (abstractC9290yjM70392k4 == null) {
                    return null;
                }
                bjsVarM64715h4.m4229k4().m55337k4(next.m55377up());
                it = abstractC9290yjM70392k4.mo28601kk().iterator();
                while (it.hasNext()) {
                    try {
                        IShape iShapeM70982k4 = C14490t8.m70982k4(it.next(), groupShapeM70646to, bjsVarM64715h4);
                        if (iShapeM70982k4 != null) {
                            Shape shape = (Shape) iShapeM70982k4;
                            if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                                it.dispose();
                            }
                            if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                                it.dispose();
                            }
                            return shape;
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
        return null;
    }

    /* JADX INFO: renamed from: k4 */
    private static FontData m73644k4(Dictionary<String, FontData> dictionary, IFontData iFontData) {
        FontData fontData = dictionary.get_Item(iFontData.getFontName());
        if (fontData == null) {
            return null;
        }
        return new FontData(iFontData.getFontName(), fontData.m1485k4(), fontData.m1490x1(), ((FontData) iFontData).m1489to(), fontData.m1488kk());
    }

    /* JADX WARN: Removed duplicated region for block: B:93:0x0259  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0268  */
    /* JADX INFO: renamed from: k4 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static Shape m73645k4(qah qahVar) {
        Shape shapeM73651x1;
        ri7 ri7Var;
        boolean z;
        C10609qn c10609qn;
        TextFrameFormat textFrameFormat;
        Paragraph paragraph;
        int i;
        int i2;
        Paragraph paragraph2;
        String str;
        IFontData[] iFontDataArr;
        int i3;
        int i4;
        int i5;
        String str2;
        String str3 = "";
        if (qahVar.m69483fa() == null || qahVar.m69482dy() == 4 || (shapeM73651x1 = m73651x1(qahVar)) == null) {
            return null;
        }
        ri7 ri7VarM69481du = qahVar.m69481du();
        ri7VarM69481du.m70143k4(shapeM73651x1);
        qahVar.m69496x1(shapeM73651x1.m2584wp());
        shapeM73651x1.m2577to(qahVar.m69479c5());
        C10462h9 c10462h9M70140fa = ri7VarM69481du.m70140fa();
        if (shapeM73651x1.isGrouped() && shapeM73651x1.m2594xw().getParentGroup() != null) {
            m73646k4(shapeM73651x1, c10462h9M70140fa);
        }
        if (qahVar.m69497yj()) {
            IFontData[] iFontDataArrM70146qq = ri7VarM69481du.m70146qq();
            Dictionary dictionary = new Dictionary();
            AutoShape autoShape = (AutoShape) C7019kk.m27452k4((Object) shapeM73651x1, AutoShape.class);
            TextFrameFormat textFrameFormatM2908jd = autoShape.m288x1().m2908jd();
            if (c10462h9M70140fa.m50880ck() == null || c10462h9M70140fa.m50880ck().m51345to() == null) {
                ri7Var = ri7VarM69481du;
                textFrameFormat = textFrameFormatM2908jd;
                z = false;
            } else {
                String strM51345to = c10462h9M70140fa.m50880ck().m51345to();
                List<KeyValuePair<Integer, C10422ei>> listM73643k4 = m73643k4(c10462h9M70140fa);
                int i6 = 0;
                int i7 = 0;
                int i8 = 0;
                while (i6 < autoShape.getTextFrame().getParagraphs().getCount()) {
                    try {
                        paragraph = (Paragraph) autoShape.getTextFrame().getParagraphs().get_Item(i6);
                        i = i8;
                        i2 = 0;
                    } catch (RuntimeException unused) {
                        ri7Var = ri7VarM69481du;
                        textFrameFormat = textFrameFormatM2908jd;
                    }
                    while (true) {
                        textFrameFormat = textFrameFormatM2908jd;
                        try {
                            paragraph2 = paragraph;
                        } catch (RuntimeException unused2) {
                            ri7Var = ri7VarM69481du;
                        }
                        if (i2 >= paragraph.getPortions().getCount()) {
                            str = str3;
                            ri7Var = ri7VarM69481du;
                            iFontDataArr = iFontDataArrM70146qq;
                            i3 = i6;
                            break;
                        }
                        Portion portion = (Portion) paragraph2.getPortions().get_Item(i2);
                        int i9 = i2;
                        i3 = i6;
                        if (C7019kk.m27469x1(shapeM73651x1.getSlide(), Slide.class)) {
                            m73649k4(iFontDataArrM70146qq, dictionary, portion.m2295x1());
                        }
                        int iM67507x1 = C14116yg.m67507x1(portion.m2283h4().length(), strM51345to.length());
                        i7 += iM67507x1;
                        if (portion.getPortionFormat().getHyperlinkClick() == null || i >= listM73643k4.size()) {
                            iFontDataArr = iFontDataArrM70146qq;
                        } else {
                            while (i < listM73643k4.size() && listM73643k4.get_Item(i).getKey().intValue() < i7) {
                                i++;
                            }
                            if (i >= listM73643k4.size()) {
                                throw new Exception("Hyperlink restoring for MetroBlob went wrong");
                            }
                            iFontDataArr = iFontDataArrM70146qq;
                            portion.getPortionFormat().setHyperlinkClick(C14878za.m74359k4(listM73643k4.get_Item(i).getValue(), ri7VarM69481du));
                            z = true;
                            if (textFrameFormat.m2957ks() == 1 && ri7Var.m70141ix().m63998up()) {
                                ((FillFormat) autoShape.getFillFormat()).m1455h4();
                                ((EffectFormat) autoShape.getEffectFormat()).m1386h4();
                                if (autoShape.getLineFormat() != null) {
                                    ((LineFormat) autoShape.getLineFormat()).m1895h4();
                                }
                                if (autoShape.getThreeDFormat() != null) {
                                    ((ThreeDFormat) autoShape.getThreeDFormat()).m3006jd();
                                }
                            }
                        }
                        if (C14113y2.m67411k4(strM51345to)) {
                            str = str3;
                            ri7Var = ri7VarM69481du;
                            i4 = i;
                        } else {
                            if (C14113y2.m67411k4(portion.getText()) || !str3.equals(C14113y2.m67401k4(C14113y2.m67401k4(portion.getText(), C18115b5.CONNECTOR, str3), " ", str3))) {
                                str = str3;
                                ri7Var = ri7VarM69481du;
                                i4 = i;
                                i5 = 0;
                                portion.setText(C14113y2.m67443x1(strM51345to, 0, iM67507x1));
                            } else {
                                String strM67443x1 = C14113y2.m67443x1(strM51345to, 0, iM67507x1);
                                String text = portion.getText();
                                str = str3;
                                C6765kp c6765kp = new C6765kp();
                                ri7Var = ri7VarM69481du;
                                i4 = i;
                                int i10 = 0;
                                while (i10 < strM67443x1.length()) {
                                    try {
                                        if (i10 < text.length()) {
                                            str2 = text;
                                            c6765kp.m26792k4(text.charAt(i10) == '_' ? C14113y2.m67368h4(C14117yj.m67537ne(strM67443x1.charAt(i10))) : C14113y2.m67358c5(C14117yj.m67537ne(strM67443x1.charAt(i10))));
                                        } else {
                                            str2 = text;
                                            c6765kp.m26780k4(strM67443x1.charAt(i10));
                                        }
                                        i10++;
                                        text = str2;
                                    } catch (RuntimeException unused3) {
                                    }
                                }
                                portion.setText(c6765kp.toString());
                                i5 = 0;
                            }
                            strM51345to = C14113y2.m67396k4(strM51345to, i5, iM67507x1);
                            if (C14113y2.m67448x1(strM51345to, "\r")) {
                                i = i4;
                                break;
                            }
                        }
                        i2 = i9 + 1;
                        paragraph = paragraph2;
                        textFrameFormatM2908jd = textFrameFormat;
                        i6 = i3;
                        str3 = str;
                        iFontDataArrM70146qq = iFontDataArr;
                        ri7VarM69481du = ri7Var;
                        i = i4;
                    }
                    if (C14113y2.m67448x1(strM51345to, "\r")) {
                        strM51345to = C14113y2.m67396k4(strM51345to, 0, 1);
                    }
                    i6 = i3 + 1;
                    i8 = i;
                    textFrameFormatM2908jd = textFrameFormat;
                    str3 = str;
                    iFontDataArrM70146qq = iFontDataArr;
                    ri7VarM69481du = ri7Var;
                }
                ri7Var = ri7VarM69481du;
                textFrameFormat = textFrameFormatM2908jd;
                z = false;
                if (textFrameFormat.m2957ks() == 1) {
                    ((FillFormat) autoShape.getFillFormat()).m1455h4();
                    ((EffectFormat) autoShape.getEffectFormat()).m1386h4();
                    if (autoShape.getLineFormat() != null) {
                    }
                    if (autoShape.getThreeDFormat() != null) {
                    }
                }
            }
            if (c10462h9M70140fa.mo50862jd() != null && c10462h9M70140fa.mo50862jd().m50425ck() != null) {
                C13658is.m63092k4(shapeM73651x1.getCustomData(), c10462h9M70140fa.mo50862jd().m50425ck());
                String str4 = shapeM73651x1.getCustomData().getTags().get_Item("AS_UNIQUEID");
                if (str4 != null) {
                    shapeM73651x1.m2578to(str4);
                    shapeM73651x1.getCustomData().getTags().remove("AS_UNIQUEID");
                }
            }
            if (textFrameFormat.getAutofitType() == 1) {
                autoShape.mo277dy();
            } else if (autoShape.isTextBox() && textFrameFormat.getAutofitType() == 2) {
                m73646k4(autoShape, c10462h9M70140fa);
            }
        } else {
            ri7Var = ri7VarM69481du;
            z = false;
        }
        if (!qahVar.m69497yj() || z) {
            C1252ii.m7637k4(ri7Var);
            AutoShape autoShape2 = (AutoShape) C7019kk.m27452k4((Object) shapeM73651x1, AutoShape.class);
            if (autoShape2 != null && (c10609qn = (C10609qn) C7019kk.m27452k4((Object) c10462h9M70140fa.mo50859du().m51263x1().m50923k4(191), C10609qn.class)) != null && (c10609qn.m51597ar() & 2) != 2) {
                m73646k4(autoShape2, c10462h9M70140fa);
            }
            k3x.m63615du(qahVar);
        }
        return shapeM73651x1;
    }

    /* JADX INFO: renamed from: k4 */
    private static void m73646k4(Shape shape, C10462h9 c10462h9) {
        tbp tbpVar = new tbp();
        tbp tbpVar2 = new tbp();
        C1258im c1258im = new C1258im();
        tbp[] tbpVarArr = {tbpVar};
        tbp[] tbpVarArr2 = {tbpVar2};
        C1258im[] c1258imArr = {c1258im};
        xbk.m73301k4(c10462h9, tbpVarArr, tbpVarArr2, c1258imArr);
        tbpVarArr[0].CloneTo(tbpVar);
        tbpVarArr2[0].CloneTo(tbpVar2);
        c1258imArr[0].CloneTo(c1258im);
        shape.mo2564k4(tbpVar.Clone(), tbpVar2.Clone(), c1258im.Clone());
    }

    /* JADX WARN: Removed duplicated region for block: B:61:0x0138  */
    /* JADX INFO: renamed from: k4 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void m73647k4(uz3 uz3Var) {
        C11791os c11791osM55394k4;
        boolean z;
        AbstractC11812sq c11816t6;
        String str;
        rpo rpoVarM3738du = uz3Var.m3745to().m3738du();
        C10711xc c10711xcMo50863m9 = uz3Var.m72000ix().mo50863m9();
        Shape shapeM72003ne = uz3Var.m72003ne();
        if (shapeM72003ne == null) {
            shapeM72003ne = uz3Var.mo64936jd();
        }
        if (uz3Var.m71999bv().m5502k4() != null) {
            boolean z2 = C7019kk.m27469x1(uz3Var, f5k.class) || C7019kk.m27469x1(uz3Var, q0x.class);
            C11708b5 c11708b5 = new C11708b5();
            uz3Var.m3745to().m3738du().m70215k4().m73713ks().m55434k4(c11708b5.m55390dy());
            if (shapeM72003ne == null) {
                c11791osM55394k4 = null;
            } else {
                if (C7019kk.m27469x1(shapeM72003ne, AutoShape.class)) {
                    c11816t6 = new C11836vh();
                    str = "/drs/shapexml.xml";
                } else if (C7019kk.m27469x1(shapeM72003ne, IGroupShape.class) || C7019kk.m27469x1(shapeM72003ne, ITable.class) || C7019kk.m27469x1(shapeM72003ne, SmartArt.class)) {
                    c11816t6 = new C11816t6();
                    str = "/drs/e2oDoc.xml";
                } else if (C7019kk.m27469x1(shapeM72003ne, IConnector.class)) {
                    c11816t6 = new C11808s7();
                    str = "/drs/connector.xml";
                } else if (C7019kk.m27469x1(shapeM72003ne, IPictureFrame.class)) {
                    c11816t6 = new C11837vj();
                    str = "/drs/picturexml.xml";
                } else {
                    if (C7019kk.m27469x1(shapeM72003ne, Ink.class)) {
                        c11816t6 = new C11854xw();
                        str = "/drs/inkxml.xml";
                    }
                    c11791osM55394k4 = null;
                }
                c11791osM55394k4 = c11708b5.m55394k4(str, (AbstractC11760jd.k4) null, c11816t6);
            }
            if (c11791osM55394k4 != null) {
                c11708b5.m55390dy().m55311x1(c11791osM55394k4);
                if (new C14423ry(c11791osM55394k4, rpoVarM3738du.m70215k4().m73713ks()).m70393k4(shapeM72003ne, rpoVarM3738du.m70211ix())) {
                    IGenericEnumerator<C11709bg> it = c11791osM55394k4.m55377up().iterator();
                    while (it.hasNext()) {
                        try {
                            C11709bg next = it.next();
                            for (C11791os c11791os : rpoVarM3738du.m70215k4().m73713ks().mo4812qm().m55388c5()) {
                                if (C14113y2.m67363du(c11791os.m55427x1(), next.m55292k4())) {
                                    c11708b5.m55408x1(c11791os);
                                }
                            }
                        } finally {
                            if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                                it.dispose();
                            }
                        }
                    }
                    z = true;
                } else {
                    z = z2;
                }
            }
            C11791os c11791osM55394k42 = c11708b5.m55394k4("/drs/downrev.xml", (AbstractC11760jd.k4) null, new C11741f9());
            c11708b5.m55390dy().m55311x1(c11791osM55394k42);
            new C14671vb(c11791osM55394k42, rpoVarM3738du.m70215k4().m73713ks()).m72164k4(shapeM72003ne, uz3Var);
            if (z) {
                c10711xcMo50863m9.m51976x1().m50930x1(new C10355ai(937, c11708b5.m55285uz()));
            }
        }
    }

    /* JADX INFO: renamed from: k4 */
    private static void m73648k4(IFontData[] iFontDataArr, Dictionary<String, FontData> dictionary, IFontData iFontData, IFontData iFontData2) {
        for (IFontData iFontData3 : iFontDataArr) {
            if (C14113y2.m67363du(iFontData3.getFontName(), iFontData2.getFontName())) {
                dictionary.addItem(iFontData.getFontName(), (FontData) iFontData3);
                return;
            }
        }
        dictionary.addItem(iFontData.getFontName(), null);
    }

    /* JADX INFO: renamed from: k4 */
    private static void m73649k4(IFontData[] iFontDataArr, Dictionary<String, FontData> dictionary, PortionFormat portionFormat) {
        IFontData latinFont = portionFormat.getLatinFont();
        IFontData eastAsianFont = portionFormat.getEastAsianFont();
        IFontData complexScriptFont = portionFormat.getComplexScriptFont();
        IFontData symbolFont = portionFormat.getSymbolFont();
        IPortionFormatEffectiveData effective = null;
        if (m73650k4(latinFont)) {
            if (!dictionary.containsKey(latinFont.getFontName())) {
                effective = portionFormat.getEffective();
                m73648k4(iFontDataArr, dictionary, latinFont, effective.getLatinFont());
            }
            FontData fontDataM73644k4 = m73644k4(dictionary, latinFont);
            if (fontDataM73644k4 != null) {
                portionFormat.setLatinFont(fontDataM73644k4);
            }
        }
        if (m73650k4(eastAsianFont)) {
            if (!dictionary.containsKey(eastAsianFont.getFontName())) {
                if (effective == null) {
                    effective = portionFormat.getEffective();
                }
                m73648k4(iFontDataArr, dictionary, eastAsianFont, effective.getEastAsianFont());
            }
            FontData fontDataM73644k42 = m73644k4(dictionary, eastAsianFont);
            if (fontDataM73644k42 != null) {
                portionFormat.setEastAsianFont(fontDataM73644k42);
            }
        }
        if (m73650k4(complexScriptFont)) {
            if (!dictionary.containsKey(complexScriptFont.getFontName())) {
                if (effective == null) {
                    effective = portionFormat.getEffective();
                }
                m73648k4(iFontDataArr, dictionary, complexScriptFont, effective.getComplexScriptFont());
            }
            FontData fontDataM73644k43 = m73644k4(dictionary, complexScriptFont);
            if (fontDataM73644k43 != null) {
                portionFormat.setComplexScriptFont(fontDataM73644k43);
            }
        }
        if (m73650k4(symbolFont)) {
            if (!dictionary.containsKey(symbolFont.getFontName())) {
                if (effective == null) {
                    effective = portionFormat.getEffective();
                }
                m73648k4(iFontDataArr, dictionary, symbolFont, effective.getSymbolFont());
            }
            FontData fontDataM73644k44 = m73644k4(dictionary, symbolFont);
            if (fontDataM73644k44 != null) {
                portionFormat.setSymbolFont(fontDataM73644k44);
            }
        }
    }

    /* JADX INFO: renamed from: k4 */
    private static boolean m73650k4(IFontData iFontData) {
        if (iFontData == null) {
            return false;
        }
        FontData fontData = (FontData) iFontData;
        return ((fontData.m1485k4() & 255) == 1 || (fontData.m1490x1() & 255) == 0) && C14113y2.m67448x1(iFontData.getFontName(), "+");
    }
}
