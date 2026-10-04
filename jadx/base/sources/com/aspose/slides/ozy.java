package com.aspose.slides;

import com.aspose.slides.Collections.Generic.IGenericEnumerator;
import com.aspose.slides.internal.p080dd.AbstractC3124b3;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.internal.p475wh.C12015qq;
import com.aspose.slides.p559ms.System.C14052dq;
import com.aspose.slides.p559ms.System.C14057f9;
import com.aspose.slides.p559ms.System.C14113y2;
import com.aspose.slides.p559ms.System.IDisposable;
import com.google.firebase.vertexai.common.util.KtorKt;
import java.util.Iterator;

/* JADX INFO: loaded from: classes3.dex */
class ozy extends C14367qz<Paragraph> {
    public ozy(TemplateContext<Paragraph> templateContext, AbstractC3124b3 abstractC3124b3) {
        super(templateContext, abstractC3124b3);
    }

    /* JADX INFO: renamed from: k4 */
    private String m68918k4(Paragraph paragraph) {
        return htp.m7298k4(paragraph.getParagraphFormat().getEffective(), m69966kk());
    }

    @Override // com.aspose.slides.C14842yc
    /* JADX INFO: renamed from: k4 */
    public void mo6644k4() {
        boolean z;
        String str;
        String strM67400k4;
        IParagraphFormatEffectiveData iParagraphFormatEffectiveData;
        Paragraph object = m69966kk().getObject();
        TextFrame textFrame = (TextFrame) m69966kk().getLocal().get("parent");
        Boolean bool = (Boolean) m69966kk().getLocal().get("tableContent");
        bool.booleanValue();
        C12015qq c12015qqClone = ((C12015qq) m69966kk().getLocal().get("parentContainerSize")).Clone();
        boolean z2 = m69966kk().getLocal().containsKey("isFirst") && ((Boolean) m69966kk().getLocal().get("isFirst")).booleanValue();
        boolean z3 = m69966kk().getLocal().containsKey("isLast") && ((Boolean) m69966kk().getLocal().get("isLast")).booleanValue();
        IParagraphFormatEffectiveData effective = object.getParagraphFormat().getEffective();
        double[] dArrM7304k4 = htp.m7304k4(effective, textFrame, c12015qqClone.Clone(), m69966kk());
        String strM67408k4 = C14113y2.m67408k4("margin-left: ", C14057f9.m66591x1(C7019kk.m27462to(Double.valueOf(dArrM7304k4[0]), 14)), "px; margin-top: ", C14057f9.m66591x1(C7019kk.m27462to(Double.valueOf(dArrM7304k4[1]), 14)), "px; margin-right: ", C14057f9.m66591x1(C7019kk.m27462to(Double.valueOf(dArrM7304k4[2]), 14)), "px; margin-bottom: ", C14057f9.m66591x1(C7019kk.m27462to(Double.valueOf(dArrM7304k4[3]), 14)), "px; ");
        float fontHeight = object.getPortions().getCount() == 0 ? 0.0f : object.getPortions().get_Item(0).getPortionFormat().getEffective().getFontHeight();
        if (z2) {
            z = z3;
            str = "isLast";
            strM67400k4 = "";
        } else if (effective.getSpaceBefore() < 0.0f) {
            z = z3;
            strM67400k4 = C14113y2.m67400k4("", C14113y2.m67408k4("padding-top: ", C14057f9.m66591x1(C7019kk.m27462to(Float.valueOf(-effective.getSpaceBefore()), 13)), "px; "));
            str = "isLast";
        } else {
            z = z3;
            str = "isLast";
            strM67400k4 = C14113y2.m67400k4("", C14113y2.m67408k4("padding-top: ", C14057f9.m66591x1(C7019kk.m27462to(Double.valueOf((((double) effective.getSpaceBefore()) * (((double) fontHeight) * 1.25d)) / 100.0d), 14)), "px; "));
        }
        if (z) {
            iParagraphFormatEffectiveData = effective;
        } else if (effective.getSpaceAfter() < 0.0f) {
            strM67400k4 = C14113y2.m67400k4(strM67400k4, C14113y2.m67408k4("padding-bottom: ", C14057f9.m66591x1(C7019kk.m27462to(Float.valueOf(-effective.getSpaceAfter()), 13)), "px; "));
            iParagraphFormatEffectiveData = effective;
        } else {
            iParagraphFormatEffectiveData = effective;
            strM67400k4 = C14113y2.m67400k4(strM67400k4, C14113y2.m67408k4("padding-bottom: ", C14057f9.m66591x1(C7019kk.m27462to(Double.valueOf((((double) iParagraphFormatEffectiveData.getSpaceAfter()) * (((double) fontHeight) * 1.25d)) / 100.0d), 14)), "px; "));
        }
        String strM67408k42 = C14113y2.m67408k4(strM67408k4, strM67400k4, m68918k4(object));
        m69969x1(KtorKt.SSE_SEPARATOR);
        m69969x1("\r\n<p");
        m69965k4("style", jii.m63325k4(" style=\"", 2152), jii.m63325k4("\"", 2175), jii.m63324k4(jii.m63325k4("", 2160), jii.m63325k4(strM67408k42, 2160), Boolean.FALSE));
        m69969x1(">\r\n");
        if (iParagraphFormatEffectiveData.getBullet().getType() != 0) {
            m69967kk(m69962k4(C14113y2.m67401k4(nci.m67958k4(Paragraph.class, this.f50311k4, "bullet", m69966kk()).toString(), C14052dq.m66570kk(), "")));
        }
        m69969x1("    ");
        IGenericEnumerator<IPortion> it = object.getPortions().iterator();
        while (it.hasNext()) {
            try {
                Portion portion = (Portion) it.next();
                TemplateContext<TSubModel> templateContextSubModel = m69966kk().subModel(portion);
                templateContextSubModel.getLocal().put("parentTextFrame", textFrame);
                templateContextSubModel.getLocal().put("tableContent", bool);
                templateContextSubModel.getLocal().put("isFirst", Boolean.valueOf(portion == object.getPortions().get_Item(0)));
                String str2 = str;
                templateContextSubModel.getLocal().put(str2, Boolean.valueOf(portion == object.getPortions().get_Item(object.getPortions().getCount() + (-1))));
                templateContextSubModel.getLocal().put("paragraph", object);
                m69967kk(m69962k4(C14113y2.m67401k4(nci.m67958k4(Portion.class, this.f50311k4, "portion", templateContextSubModel).toString(), C14052dq.m66570kk(), "")));
                str = str2;
            } finally {
                if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                    it.dispose();
                }
            }
        }
        m69969x1("</p>");
    }
}
