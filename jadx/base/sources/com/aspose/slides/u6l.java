package com.aspose.slides;

import com.aspose.slides.internal.p080dd.AbstractC3124b3;
import com.aspose.slides.p559ms.System.C14113y2;
import com.google.firebase.vertexai.common.util.KtorKt;
import com.orion.notein.richeditor.utils.p606io.IOUtils;

/* JADX INFO: loaded from: classes3.dex */
class u6l extends C14367qz<Portion> {
    public u6l(TemplateContext<Portion> templateContext, AbstractC3124b3 abstractC3124b3) {
        super(templateContext, abstractC3124b3);
    }

    /* JADX INFO: renamed from: k4 */
    private String m71494k4(Portion portion, TextFrame textFrame, boolean z) {
        return htp.m7300k4(portion.getPortionFormat().getEffective(), textFrame.getTextFrameFormat().getEffective(), z, m69966kk());
    }

    /* JADX INFO: renamed from: k4 */
    private String m71495k4(String str, boolean z, boolean z2) {
        if (str.length() > 1 && C14113y2.m67424kk(str, "\u000b") && z) {
            str = C14113y2.m67408k4(OooO0OO.OooO00o(1, 0, str, str), "<br /><br />");
        } else if (C14113y2.m67411k4(str) && z && z2) {
            str = " ";
        }
        return C14113y2.m67401k4(str, "\u000b", "<br />");
    }

    @Override // com.aspose.slides.C14842yc
    /* JADX INFO: renamed from: k4 */
    public void mo6644k4() {
        Portion object = m69966kk().getObject();
        TextFrame textFrame = (TextFrame) m69966kk().getLocal().get("parentTextFrame");
        boolean zBooleanValue = ((Boolean) m69966kk().getLocal().get("tableContent")).booleanValue();
        boolean z = false;
        boolean z2 = m69966kk().getLocal().containsKey("isLast") && ((Boolean) m69966kk().getLocal().get("isLast")).booleanValue();
        if (m69966kk().getLocal().containsKey("isFirst") && ((Boolean) m69966kk().getLocal().get("isFirst")).booleanValue()) {
            z = true;
        }
        IHyperlink hyperlinkClick = object.getPortionFormat().getEffective().getHyperlinkClick();
        String externalUrl = hyperlinkClick != null ? hyperlinkClick.getExternalUrl() : "";
        m69969x1(KtorKt.SSE_SEPARATOR);
        m69969x1(IOUtils.LINE_SEPARATOR_WINDOWS);
        if (!C14113y2.m67411k4(externalUrl)) {
            m69967kk(m69962k4(C14113y2.m67408k4("<a href=\"", externalUrl, "\" style=\"text-decoration: none;\">")));
        }
        m69969x1("<span");
        m69969x1(" class=\"portion\"");
        m69965k4("style", jii.m63325k4(" style=\"", 1317), jii.m63325k4("\"", 1393), jii.m63324k4(jii.m63325k4("", 1325), jii.m63325k4(m69962k4(m71494k4(object, textFrame, zBooleanValue)), 1325), Boolean.FALSE));
        m69969x1(">");
        m69967kk(m69962k4(m71495k4(object.getText(), z2, z)));
        m69969x1("</span>\r\n");
        if (C14113y2.m67411k4(externalUrl)) {
            return;
        }
        m69967kk(m69962k4("</a>"));
    }
}
