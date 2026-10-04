package com.aspose.slides;

import com.aspose.slides.Collections.Generic.IGenericEnumerator;
import com.aspose.slides.Collections.Generic.KeyValuePair;
import com.aspose.slides.exceptions.ArgumentNullException;
import com.aspose.slides.internal.p060ca.AbstractC2313tw;
import com.aspose.slides.internal.p060ca.C2182lv;
import com.aspose.slides.internal.p060ca.C2350wl;
import com.aspose.slides.internal.p077d8.C3085sv;
import com.aspose.slides.internal.p080dd.AbstractC3150x6;
import com.aspose.slides.internal.p080dd.C3152yj;
import com.aspose.slides.internal.p294n9.AbstractC6747ar;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.internal.p541z6.C13447k4;
import com.aspose.slides.p559ms.System.AbstractC14041ai;
import com.aspose.slides.p559ms.System.AbstractC14085qw;
import com.aspose.slides.p559ms.System.C14052dq;
import com.aspose.slides.p559ms.System.C14080ne;
import com.aspose.slides.p559ms.System.C14113y2;
import com.aspose.slides.p559ms.System.IDisposable;
import com.orion.notein.richeditor.fonts.FontManager;
import java.util.Iterator;

/* JADX INFO: renamed from: com.aspose.slides.ym */
/* JADX INFO: loaded from: classes3.dex */
class C14852ym {

    /* JADX INFO: renamed from: k4 */
    static final String[] f50370k4 = new String[0];

    /* JADX INFO: renamed from: du */
    private final String[] f50371du;

    /* JADX INFO: renamed from: kk */
    private final AbstractC14653ux f50372kk;

    /* JADX INFO: renamed from: to */
    private final k4 f50373to;

    /* JADX INFO: renamed from: x1 */
    private final IHtmlFormattingController f50374x1;

    /* JADX INFO: renamed from: com.aspose.slides.ym$k4 */
    public static abstract class k4 extends AbstractC14085qw {
        /* JADX INFO: renamed from: k4 */
        public abstract void mo1417k4(IHtmlGenerator iHtmlGenerator, IFontData iFontData, IFontData iFontData2, String str, String str2, byte[] bArr);
    }

    public C14852ym(IHtmlFormattingController iHtmlFormattingController, String[] strArr, AbstractC14653ux abstractC14653ux) {
        this.f50374x1 = iHtmlFormattingController;
        this.f50372kk = abstractC14653ux;
        this.f50371du = strArr;
        this.f50373to = new k4() { // from class: com.aspose.slides.ym.2
            @Override // com.aspose.slides.p559ms.System.AbstractC14085qw
            public String getDelegateId() {
                return "Aspose.Slides.Export.EmbeddedFontsHtmlControllerInternal.WriteAsBase64(Aspose.Slides.Export.IHtmlGenerator,Aspose.Slides.IFontData,Aspose.Slides.IFontData,System.String,System.String,System.Byte[])";
            }

            @Override // com.aspose.slides.C14852ym.k4
            /* JADX INFO: renamed from: k4 */
            public void mo1417k4(IHtmlGenerator iHtmlGenerator, IFontData iFontData, IFontData iFontData2, String str, String str2, byte[] bArr) {
                C14852ym.this.m73932k4(iHtmlGenerator, iFontData, iFontData2, str, str2, bArr);
            }
        };
    }

    /* JADX INFO: renamed from: k4 */
    public final void m73932k4(IHtmlGenerator iHtmlGenerator, IFontData iFontData, IFontData iFontData2, String str, String str2, byte[] bArr) {
        m73928k4(iHtmlGenerator, "<style>");
        m73928k4(iHtmlGenerator, "@font-face {");
        m73929k4(iHtmlGenerator, C3085sv.m13066du(iFontData2 == null ? iFontData.getFontName() : iFontData2.getFontName()), str, str2);
        m73928k4(iHtmlGenerator, C14113y2.m67402k4("src: url('data:{0};base64,{1}');", this.f50372kk.mo4513k4(), C14080ne.m66953k4(bArr, 0, bArr.length)));
        m73928k4(iHtmlGenerator, "}");
        m73928k4(iHtmlGenerator, "</style>");
    }

    /* JADX INFO: renamed from: kk */
    public final void m73937kk(IHtmlGenerator iHtmlGenerator, IPresentation iPresentation) {
        Presentation presentation = (Presentation) iPresentation;
        omk omkVar = new omk(presentation);
        try {
            dnm[] dnmVarArrM68693k4 = omkVar.m68693k4(((HtmlGenerator) iHtmlGenerator).m1674du());
            omkVar.dispose();
            for (final dnm dnmVar : dnmVarArrM68693k4) {
                if (C3085sv.m13074k4((Object[]) this.f50371du, (AbstractC14041ai) new AbstractC14041ai<String>() { // from class: com.aspose.slides.ym.3
                    @Override // com.aspose.slides.p559ms.System.AbstractC14041ai
                    /* JADX INFO: renamed from: k4, reason: merged with bridge method [inline-methods] */
                    public boolean invoke(String str) {
                        return C14113y2.m67363du(str, dnmVar.m5199to());
                    }
                }) == -1) {
                    String[] strArr = {null};
                    String[] strArr2 = {null};
                    boolean zM73931k4 = m73931k4(dnmVar.m5197k4().m23125x1(), strArr, strArr2);
                    String str = strArr[0];
                    String str2 = strArr2[0];
                    if (zM73931k4) {
                        AbstractC3150x6 abstractC3150x6Mo47984x1 = dnmVar.m5197k4().m23120k4().m48233um().mo47984x1();
                        try {
                            C3152yj c3152yj = new C3152yj();
                            try {
                                C13447k4.m62556k4(abstractC3150x6Mo47984x1, c3152yj);
                                byte[] array = c3152yj.toArray();
                                if ("ttcf".equals(AbstractC6747ar.m26635ix().mo26682x1(array, 0, 4))) {
                                    AbstractC2313tw abstractC2313twM11469k4 = AbstractC2313tw.m11469k4(new C2182lv(new C2350wl(array)).mo10154k4()[0]);
                                    c3152yj = new C3152yj();
                                    try {
                                        abstractC2313twM11469k4.mo11257k4(c3152yj);
                                        array = c3152yj.toArray();
                                    } finally {
                                    }
                                }
                                m73930k4(iHtmlGenerator, ((FontsManager) presentation.getFontsManager()).m1553k4(array, ((HtmlGenerator) iHtmlGenerator).m1674du()), dnmVar.m5200x1(), dnmVar.m5198kk(), str, str2);
                            } finally {
                            }
                        } finally {
                            if (abstractC3150x6Mo47984x1 != null) {
                                abstractC3150x6Mo47984x1.dispose();
                            }
                        }
                    } else {
                        continue;
                    }
                }
            }
        } catch (Throwable th) {
            omkVar.dispose();
            throw th;
        }
    }

    /* JADX INFO: renamed from: to */
    public final void m73938to(IHtmlGenerator iHtmlGenerator, IPresentation iPresentation) {
        this.f50374x1.writeDocumentEnd(iHtmlGenerator, iPresentation);
    }

    /* JADX INFO: renamed from: x1 */
    public final void m73939x1(IHtmlGenerator iHtmlGenerator, IPresentation iPresentation) {
        C0758ap c0758apM7122k4 = ((FontsManager) ((Presentation) iPresentation).getFontsManager()).m1554x1().m7122k4();
        if (c0758apM7122k4 != null) {
            m73927k4(iHtmlGenerator, c0758apM7122k4);
        }
    }

    public C14852ym(AbstractC14653ux abstractC14653ux, String[] strArr) {
        this.f50372kk = abstractC14653ux;
        this.f50371du = strArr;
        this.f50374x1 = HtmlFormatter.m1662k4((String) null, true);
        this.f50373to = new k4() { // from class: com.aspose.slides.ym.1
            @Override // com.aspose.slides.p559ms.System.AbstractC14085qw
            public String getDelegateId() {
                return "Aspose.Slides.Export.EmbeddedFontsHtmlControllerInternal.WriteAsBase64(Aspose.Slides.Export.IHtmlGenerator,Aspose.Slides.IFontData,Aspose.Slides.IFontData,System.String,System.String,System.Byte[])";
            }

            @Override // com.aspose.slides.C14852ym.k4
            /* JADX INFO: renamed from: k4 */
            public void mo1417k4(IHtmlGenerator iHtmlGenerator, IFontData iFontData, IFontData iFontData2, String str, String str2, byte[] bArr) {
                C14852ym.this.m73932k4(iHtmlGenerator, iFontData, iFontData2, str, str2, bArr);
            }
        };
    }

    /* JADX INFO: renamed from: k4 */
    public final void m73933k4(IHtmlGenerator iHtmlGenerator, IPresentation iPresentation) {
        this.f50374x1.writeDocumentStart(iHtmlGenerator, iPresentation);
    }

    /* JADX INFO: renamed from: x1 */
    public final void m73940x1(IHtmlGenerator iHtmlGenerator, IShape iShape) {
        this.f50374x1.writeShapeEnd(iHtmlGenerator, iShape);
    }

    public C14852ym(AbstractC14653ux abstractC14653ux, String[] strArr, k4 k4Var) {
        this.f50372kk = abstractC14653ux;
        this.f50374x1 = HtmlFormatter.m1662k4((String) null, true);
        this.f50373to = k4Var;
        this.f50371du = strArr;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m73934k4(IHtmlGenerator iHtmlGenerator, IShape iShape) {
        this.f50374x1.writeShapeStart(iHtmlGenerator, iShape);
    }

    /* JADX INFO: renamed from: x1 */
    public final void m73941x1(IHtmlGenerator iHtmlGenerator, ISlide iSlide) {
        this.f50374x1.writeSlideEnd(iHtmlGenerator, iSlide);
    }

    /* JADX INFO: renamed from: k4 */
    public final void m73935k4(IHtmlGenerator iHtmlGenerator, ISlide iSlide) {
        this.f50374x1.writeSlideStart(iHtmlGenerator, iSlide);
    }

    /* JADX INFO: renamed from: k4 */
    private void m73927k4(IHtmlGenerator iHtmlGenerator, C0758ap c0758ap) {
        if (c0758ap == null) {
            throw new ArgumentNullException(FontManager.REMOTE_FONT_DIR);
        }
        IGenericEnumerator<KeyValuePair<String, C1141ge>> it = c0758ap.iterator();
        while (it.hasNext()) {
            try {
                KeyValuePair<String, C1141ge> next = it.next();
                IGenericEnumerator<KeyValuePair<TKey, TValue>> it2 = next.getValue().m6502h4().iterator();
                while (it2.hasNext()) {
                    try {
                        KeyValuePair keyValuePair = (KeyValuePair) it2.next();
                        String[] strArr = {null};
                        String[] strArr2 = {null};
                        boolean zM73931k4 = m73931k4(((Integer) keyValuePair.getKey()).intValue(), strArr, strArr2);
                        String str = strArr[0];
                        String str2 = strArr2[0];
                        if (zM73931k4) {
                            m73930k4(iHtmlGenerator, (byte[]) keyValuePair.getValue(), next.getKey(), (String) null, str, str2);
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
            } catch (Throwable th2) {
                if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                    it.dispose();
                }
                throw th2;
            }
        }
        if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
            it.dispose();
        }
    }

    /* JADX INFO: renamed from: k4 */
    private static void m73928k4(IHtmlGenerator iHtmlGenerator, String str) {
        iHtmlGenerator.addHtml(str);
        iHtmlGenerator.addHtml(C14052dq.m66570kk());
    }

    /* JADX INFO: renamed from: k4 */
    private static void m73929k4(IHtmlGenerator iHtmlGenerator, String str, String str2, String str3) {
        m73928k4(iHtmlGenerator, C14113y2.m67402k4("font-family: '{0}';", str));
        m73928k4(iHtmlGenerator, C14113y2.m67402k4("font-style: '{0}';", str2));
        m73928k4(iHtmlGenerator, C14113y2.m67402k4("font-weight: '{0}';", str3));
    }

    /* JADX INFO: renamed from: k4 */
    private void m73930k4(IHtmlGenerator iHtmlGenerator, byte[] bArr, String str, String str2, String str3, String str4) {
        this.f50373to.mo1417k4(iHtmlGenerator, new FontData(str), str2 == null ? null : new FontData(str2), str3, str4, bArr);
    }

    /* JADX INFO: renamed from: k4 */
    private static boolean m73931k4(int i, String[] strArr, String[] strArr2) {
        strArr[0] = null;
        strArr2[0] = null;
        if (i == 0) {
            strArr2[0] = "normal";
            strArr[0] = "normal";
        } else if (i == 1) {
            strArr2[0] = "bold";
            strArr[0] = "normal";
        } else {
            if (i != 2) {
                return false;
            }
            strArr2[0] = "normal";
            strArr[0] = "italic";
        }
        return true;
    }

    /* JADX INFO: renamed from: k4 */
    public final String[] m73936k4() {
        return this.f50371du;
    }
}
