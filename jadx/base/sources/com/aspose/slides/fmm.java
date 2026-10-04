package com.aspose.slides;

import com.aspose.slides.Collections.Generic.Dictionary;
import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.exceptions.ArgumentNullException;
import com.aspose.slides.exceptions.InvalidOperationException;
import com.aspose.slides.internal.p294n9.C6765kp;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.internal.p332p7.C7394ca;
import com.aspose.slides.internal.p475wh.C12003du;
import com.aspose.slides.p559ms.System.AbstractC14085qw;
import com.aspose.slides.p559ms.System.C14047bz;
import com.aspose.slides.p559ms.System.C14113y2;
import com.aspose.slides.p559ms.System.IDisposable;
import java.util.Iterator;

/* JADX INFO: loaded from: classes3.dex */
class fmm {

    /* JADX INFO: renamed from: k4 */
    private static final Dictionary<String, AbstractC1112k4> f5073k4;

    /* JADX INFO: renamed from: com.aspose.slides.fmm$k4 */
    public static abstract class AbstractC1112k4 extends AbstractC14085qw {
        private AbstractC1112k4() {
        }

        /* JADX INFO: renamed from: k4 */
        public abstract boolean mo6236k4(Portion portion, com.aspose.slides.internal.p332p7.ok7 ok7Var, C7394ca c7394ca, wxb wxbVar, gga ggaVar);
    }

    static {
        Dictionary<String, AbstractC1112k4> dictionary = new Dictionary<>();
        f5073k4 = dictionary;
        dictionary.set_Item("_TEXT", new AbstractC1112k4() { // from class: com.aspose.slides.fmm.1
            @Override // com.aspose.slides.p559ms.System.AbstractC14085qw
            public String getDelegateId() {
                return "Aspose.Slides.OdpSerialization.PartParser.ParagraphOdpDeserialization.LoadTextPortion(Aspose.Slides.Portion,Aspose.Slides.PptxSerialization.PartParser.XmlParser.odftext_CT_PElementData,Aspose.Slides.PptxSerialization.PartParser.XmlParser.NamedObject,Aspose.Slides.OdpSerialization.OdpStylesDeserializationContext,Aspose.Slides.OdpSerialization.OdpCurrentStyleContext)";
            }

            @Override // com.aspose.slides.fmm.AbstractC1112k4
            /* JADX INFO: renamed from: k4 */
            public boolean mo6236k4(Portion portion, com.aspose.slides.internal.p332p7.ok7 ok7Var, C7394ca c7394ca, wxb wxbVar, gga ggaVar) {
                return fmm.m6224dy(portion, ok7Var, c7394ca, wxbVar, ggaVar);
            }
        });
        dictionary.set_Item("text:span", new AbstractC1112k4() { // from class: com.aspose.slides.fmm.2
            @Override // com.aspose.slides.p559ms.System.AbstractC14085qw
            public String getDelegateId() {
                return "Aspose.Slides.OdpSerialization.PartParser.ParagraphOdpDeserialization.LoadSpanPortion(Aspose.Slides.Portion,Aspose.Slides.PptxSerialization.PartParser.XmlParser.odftext_CT_PElementData,Aspose.Slides.PptxSerialization.PartParser.XmlParser.NamedObject,Aspose.Slides.OdpSerialization.OdpStylesDeserializationContext,Aspose.Slides.OdpSerialization.OdpCurrentStyleContext)";
            }

            @Override // com.aspose.slides.fmm.AbstractC1112k4
            /* JADX INFO: renamed from: k4 */
            public boolean mo6236k4(Portion portion, com.aspose.slides.internal.p332p7.ok7 ok7Var, C7394ca c7394ca, wxb wxbVar, gga ggaVar) {
                return fmm.m6233m9(portion, ok7Var, c7394ca, wxbVar, ggaVar);
            }
        });
        dictionary.set_Item(gq5.f5330kk, new AbstractC1112k4() { // from class: com.aspose.slides.fmm.3
            @Override // com.aspose.slides.p559ms.System.AbstractC14085qw
            public String getDelegateId() {
                return "Aspose.Slides.OdpSerialization.PartParser.ParagraphOdpDeserialization.LoadLineBreak(Aspose.Slides.Portion,Aspose.Slides.PptxSerialization.PartParser.XmlParser.odftext_CT_PElementData,Aspose.Slides.PptxSerialization.PartParser.XmlParser.NamedObject,Aspose.Slides.OdpSerialization.OdpStylesDeserializationContext,Aspose.Slides.OdpSerialization.OdpCurrentStyleContext)";
            }

            @Override // com.aspose.slides.fmm.AbstractC1112k4
            /* JADX INFO: renamed from: k4 */
            public boolean mo6236k4(Portion portion, com.aspose.slides.internal.p332p7.ok7 ok7Var, C7394ca c7394ca, wxb wxbVar, gga ggaVar) {
                return fmm.m6221c5(portion, ok7Var, c7394ca, wxbVar, ggaVar);
            }
        });
        dictionary.set_Item(gq5.f5329k4, new AbstractC1112k4() { // from class: com.aspose.slides.fmm.4
            @Override // com.aspose.slides.p559ms.System.AbstractC14085qw
            public String getDelegateId() {
                return "Aspose.Slides.OdpSerialization.PartParser.ParagraphOdpDeserialization.LoadLink(Aspose.Slides.Portion,Aspose.Slides.PptxSerialization.PartParser.XmlParser.odftext_CT_PElementData,Aspose.Slides.PptxSerialization.PartParser.XmlParser.NamedObject,Aspose.Slides.OdpSerialization.OdpStylesDeserializationContext,Aspose.Slides.OdpSerialization.OdpCurrentStyleContext)";
            }

            @Override // com.aspose.slides.fmm.AbstractC1112k4
            /* JADX INFO: renamed from: k4 */
            public boolean mo6236k4(Portion portion, com.aspose.slides.internal.p332p7.ok7 ok7Var, C7394ca c7394ca, wxb wxbVar, gga ggaVar) {
                return fmm.m6227jd(portion, ok7Var, c7394ca, wxbVar, ggaVar);
            }
        });
        dictionary.set_Item(gq5.f5331to, new AbstractC1112k4() { // from class: com.aspose.slides.fmm.5
            @Override // com.aspose.slides.p559ms.System.AbstractC14085qw
            public String getDelegateId() {
                return "Aspose.Slides.OdpSerialization.PartParser.ParagraphOdpDeserialization.LoadPageNumber(Aspose.Slides.Portion,Aspose.Slides.PptxSerialization.PartParser.XmlParser.odftext_CT_PElementData,Aspose.Slides.PptxSerialization.PartParser.XmlParser.NamedObject,Aspose.Slides.OdpSerialization.OdpStylesDeserializationContext,Aspose.Slides.OdpSerialization.OdpCurrentStyleContext)";
            }

            @Override // com.aspose.slides.fmm.AbstractC1112k4
            /* JADX INFO: renamed from: k4 */
            public boolean mo6236k4(Portion portion, com.aspose.slides.internal.p332p7.ok7 ok7Var, C7394ca c7394ca, wxb wxbVar, gga ggaVar) {
                return fmm.m6222ck(portion, ok7Var, c7394ca, wxbVar, ggaVar);
            }
        });
        dictionary.set_Item(gq5.f5327du, new AbstractC1112k4() { // from class: com.aspose.slides.fmm.6
            @Override // com.aspose.slides.p559ms.System.AbstractC14085qw
            public String getDelegateId() {
                return "Aspose.Slides.OdpSerialization.PartParser.ParagraphOdpDeserialization.LoadDate(Aspose.Slides.Portion,Aspose.Slides.PptxSerialization.PartParser.XmlParser.odftext_CT_PElementData,Aspose.Slides.PptxSerialization.PartParser.XmlParser.NamedObject,Aspose.Slides.OdpSerialization.OdpStylesDeserializationContext,Aspose.Slides.OdpSerialization.OdpCurrentStyleContext)";
            }

            @Override // com.aspose.slides.fmm.AbstractC1112k4
            /* JADX INFO: renamed from: k4 */
            public boolean mo6236k4(Portion portion, com.aspose.slides.internal.p332p7.ok7 ok7Var, C7394ca c7394ca, wxb wxbVar, gga ggaVar) {
                return fmm.m6225fa(portion, ok7Var, c7394ca, wxbVar, ggaVar);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: c5 */
    public static boolean m6221c5(Portion portion, com.aspose.slides.internal.p332p7.ok7 ok7Var, C7394ca c7394ca, wxb wxbVar, gga ggaVar) {
        if (c7394ca == null) {
            throw new ArgumentNullException("element");
        }
        portion.m2289k4("\u000b");
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ck */
    public static boolean m6222ck(Portion portion, com.aspose.slides.internal.p332p7.ok7 ok7Var, C7394ca c7394ca, wxb wxbVar, gga ggaVar) {
        if (c7394ca == null) {
            throw new ArgumentNullException("element");
        }
        if (wgi.m72727k4(ggaVar) && ggaVar.m6643kk() != 10) {
            wr8.m72900k4(portion, ggaVar.m6642k4(), wxbVar);
        }
        portion.addField("slidenum");
        ((Field) portion.getField()).m1445k4(new C14047bz("93AE1883-0942-4AA3-9DB2-9C7C3A0314B1"));
        portion.m2289k4(C14113y2.m67408k4("‹", "#", "›"));
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: dy */
    public static boolean m6224dy(Portion portion, com.aspose.slides.internal.p332p7.ok7 ok7Var, C7394ca c7394ca, wxb wxbVar, gga ggaVar) {
        if (c7394ca == null) {
            throw new ArgumentNullException("element");
        }
        String str = (String) C7019kk.m27452k4(c7394ca.m29541kk(), String.class);
        if (str == null) {
            throw new InvalidOperationException();
        }
        if (wgi.m72732ks(str)) {
            return false;
        }
        if (wgi.m72727k4(ggaVar) && ggaVar.m6643kk() != 10) {
            wr8.m72900k4(portion, ggaVar.m6642k4(), wxbVar);
        }
        portion.m2289k4(str);
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: fa */
    public static boolean m6225fa(Portion portion, com.aspose.slides.internal.p332p7.ok7 ok7Var, C7394ca c7394ca, wxb wxbVar, gga ggaVar) {
        if (c7394ca == null) {
            throw new ArgumentNullException("element");
        }
        if (wgi.m72727k4(ggaVar) && ggaVar.m6643kk() != 10) {
            wr8.m72900k4(portion, ggaVar.m6642k4(), wxbVar);
        }
        com.aspose.slides.internal.p332p7.r9q r9qVar = (com.aspose.slides.internal.p332p7.r9q) c7394ca.m29542x1();
        if (r9qVar.m39916k4() != 1) {
            portion.addField(FieldType.getDateTime());
            ((Field) portion.getField()).m1445k4(new C14047bz("E8FD0B7A-F5DD-4F40-B4CB-3B2C354B893A"));
        } else if (!C14113y2.m67411k4(r9qVar.m39917x1())) {
            portion.m2289k4(r9qVar.m39917x1());
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: jd */
    public static boolean m6227jd(Portion portion, com.aspose.slides.internal.p332p7.ok7 ok7Var, C7394ca c7394ca, wxb wxbVar, gga ggaVar) {
        if (c7394ca == null) {
            throw new ArgumentNullException("element");
        }
        C6765kp c6765kp = new C6765kp();
        com.aspose.slides.internal.p332p7.hqi hqiVar = (com.aspose.slides.internal.p332p7.hqi) c7394ca.m29542x1();
        List.Enumerator<C7394ca> it = hqiVar.m33591x1().iterator();
        while (it.hasNext()) {
            try {
                C7394ca next = it.next();
                if ("_TEXT".equals(next.m29539k4())) {
                    c6765kp.m26792k4((String) next.m29541kk());
                }
            } finally {
                if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                    it.dispose();
                }
            }
        }
        gq5.m6887k4(portion.getPortionFormat(), hqiVar, wxbVar);
        portion.m2289k4(c6765kp.toString());
        return true;
    }

    /* JADX INFO: renamed from: k4 */
    private static void m6228k4(Paragraph paragraph, Portion portion, IParagraphFormat iParagraphFormat) {
        if (portion.getPortionFormat().getHyperlinkClick() == null && portion.getPortionFormat().getHyperlinkMouseOver() == null && portion.getPortionFormat().getFillFormat().getFillType() == -1 && iParagraphFormat.getDefaultPortionFormat().getFillFormat().getFillType() == -1 && paragraph.getParagraphFormat().getDefaultPortionFormat().getFillFormat().getFillType() == -1) {
            portion.getPortionFormat().getFillFormat().setFillType((byte) 1);
            ((ColorFormat) portion.getPortionFormat().getFillFormat().getSolidFillColor()).m1080k4(C12003du.m56460uz().Clone());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: m9 */
    public static boolean m6233m9(Portion portion, com.aspose.slides.internal.p332p7.ok7 ok7Var, C7394ca c7394ca, wxb wxbVar, gga ggaVar) {
        if (c7394ca == null) {
            throw new ArgumentNullException("element");
        }
        com.aspose.slides.internal.p332p7.omk omkVar = (com.aspose.slides.internal.p332p7.omk) C7019kk.m27452k4((Object) c7394ca.m29542x1(), com.aspose.slides.internal.p332p7.omk.class);
        if (omkVar == null) {
            throw new InvalidOperationException();
        }
        gq5.m6888k4(portion, omkVar, wxbVar, gga.m6641x1());
        return true;
    }

    /* JADX INFO: renamed from: k4 */
    public static void m6229k4(Paragraph paragraph, TextFrame textFrame, com.aspose.slides.internal.p332p7.ok7 ok7Var, wxb wxbVar, gga ggaVar) {
        if (paragraph == null) {
            throw new ArgumentNullException("paragraph");
        }
        if (ok7Var == null) {
            throw new ArgumentNullException("pElementData");
        }
        paragraph.getPortions().clear();
        if (wgi.m72727k4(ggaVar)) {
            wr8.m72898k4(paragraph, ggaVar.m6642k4(), wxbVar);
        }
        if (wgi.m72731kk(ok7Var.m38326k4())) {
            wr8.m72898k4(paragraph, ok7Var.m38326k4(), wxbVar);
        }
        List.Enumerator<C7394ca> it = ok7Var.m38327kk().iterator();
        while (it.hasNext()) {
            try {
                C7394ca next = it.next();
                Dictionary<String, AbstractC1112k4> dictionary = f5073k4;
                if (dictionary.containsKey(next.m29539k4())) {
                    Portion portion = new Portion();
                    if (dictionary.containsKey(next.m29539k4())) {
                        paragraph.getPortions().add(portion);
                    }
                    com.aspose.slides.internal.p332p7.ok7 ok7Var2 = ok7Var;
                    wxb wxbVar2 = wxbVar;
                    gga ggaVar2 = ggaVar;
                    if (dictionary.get_Item(next.m29539k4()).mo6236k4(portion, ok7Var2, next, wxbVar2, ggaVar2)) {
                        m6228k4(paragraph, portion, textFrame.m2908jd().m2959m9().getDefaultParagraphFormat());
                        m6230k4(portion, (PortionFormat) paragraph.getParagraphFormat().getDefaultPortionFormat(), textFrame);
                    }
                    ok7Var = ok7Var2;
                    wxbVar = wxbVar2;
                    ggaVar = ggaVar2;
                }
            } finally {
            }
        }
        com.aspose.slides.internal.p332p7.ok7 ok7Var3 = ok7Var;
        wxb wxbVar3 = wxbVar;
        if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
            it.dispose();
        }
        if (C14113y2.m67411k4(ok7Var3.m38328x1()) || wxbVar3.m72955dy().containsKey(ok7Var3.m38328x1())) {
            return;
        }
        wxbVar3.m72955dy().addItem(ok7Var3.m38328x1(), paragraph);
    }

    /* JADX INFO: renamed from: k4 */
    private static void m6230k4(Portion portion, PortionFormat portionFormat, TextFrame textFrame) {
        portion.getPortionFormat().setLatinFont(c0l.m4411k4(portion, portionFormat, (IPortionFormatEffectiveData) null, textFrame));
    }
}
