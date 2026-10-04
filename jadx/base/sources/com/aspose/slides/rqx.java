package com.aspose.slides;

import com.aspose.slides.internal.p080dd.AbstractC3124b3;
import com.aspose.slides.internal.p475wh.C12015qq;
import com.aspose.slides.internal.p475wh.C12016rv;
import com.aspose.slides.p559ms.System.C14113y2;
import com.google.firebase.vertexai.common.util.KtorKt;

/* JADX INFO: loaded from: classes3.dex */
class rqx extends C14367qz<TextFrame> {
    public rqx(TemplateContext<TextFrame> templateContext, AbstractC3124b3 abstractC3124b3) {
        super(templateContext, abstractC3124b3);
    }

    /* JADX INFO: renamed from: k4 */
    private String m70265k4(TextFrame textFrame) {
        return C14113y2.m67403k4(" ", new String[]{htp.m7302k4(textFrame, (AutoShape) m69966kk().getLocal().get("parent")), htp.m7301k4(textFrame.getTextFrameFormat().getEffective())});
    }

    @Override // com.aspose.slides.C14842yc
    /* JADX INFO: renamed from: k4 */
    public void mo6644k4() {
        TextFrame object = m69966kk().getObject();
        object.getTextFrameFormat().getEffective();
        ((C12016rv) m69966kk().getLocal().get("origin")).Clone();
        AutoShape autoShape = (AutoShape) m69966kk().getLocal().get("parent");
        m69969x1(KtorKt.SSE_SEPARATOR);
        m69969x1("\r\n<div");
        m69969x1(" class=\"textframe\"");
        m69965k4("style", jii.m63325k4(" style=\"", 734), jii.m63325k4("\"", 775), jii.m63324k4(jii.m63325k4("", 742), jii.m63325k4(m70265k4(object), 742), Boolean.FALSE));
        m69969x1(">\r\n");
        int i = 0;
        while (i < object.getParagraphs().getCount()) {
            TemplateContext<TSubModel> templateContextSubModel = m69966kk().subModel((Paragraph) object.getParagraphs().get_Item(i));
            templateContextSubModel.getLocal().put("parent", object);
            templateContextSubModel.getLocal().put("parentContainerSize", new C12015qq(autoShape.getWidth(), autoShape.getHeight()));
            templateContextSubModel.getLocal().put("tableContent", Boolean.FALSE);
            boolean z = true;
            templateContextSubModel.getLocal().put("isFirst", Boolean.valueOf(i == 0));
            Storage local = templateContextSubModel.getLocal();
            if (i != object.getParagraphs().getCount() - 1) {
                z = false;
            }
            local.put("isLast", Boolean.valueOf(z));
            m69967kk(m69962k4(htp.m7303k4(nci.m67958k4(Paragraph.class, this.f50311k4, "paragraph", templateContextSubModel).toString())));
            i++;
        }
        m69969x1("</div>");
    }
}
