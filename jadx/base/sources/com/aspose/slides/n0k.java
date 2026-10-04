package com.aspose.slides;

import com.aspose.slides.internal.p080dd.AbstractC3124b3;
import com.aspose.slides.p559ms.System.C14057f9;
import com.aspose.slides.p559ms.System.C14064he;
import com.aspose.slides.p559ms.System.C14113y2;
import com.orion.notein.richeditor.utils.p606io.IOUtils;

/* JADX INFO: loaded from: classes3.dex */
class n0k extends C14367qz<Presentation> {
    public n0k(TemplateContext<Presentation> templateContext, AbstractC3124b3 abstractC3124b3) {
        super(templateContext, abstractC3124b3);
    }

    @Override // com.aspose.slides.C14842yc
    /* JADX INFO: renamed from: k4 */
    public void mo6644k4() {
        boolean z = false;
        for (IFontData iFontData : m69966kk().getObject().getFontsManager().getEmbeddedFonts()) {
            m69969x1("        ");
            m69969x1("@font-face\r\n        {\r\n            font-family: \"");
            m69967kk(iFontData.getFontName());
            m69969x1("\";\r\n            src: url(\"");
            m69967kk(C13834mf.m64868k4(iFontData, 0));
            m69969x1("\");\r\n        }\r\n        ");
            m69969x1(IOUtils.LINE_SEPARATOR_WINDOWS);
        }
        boolean z2 = ((Boolean) m69966kk().getGlobal().get("animateTransitions")).booleanValue() || ((Boolean) m69966kk().getGlobal().get("navigationEnabled")).booleanValue();
        int iIntValue = ((Integer) m69966kk().getGlobal().get("slideMargin")).intValue();
        String str = m69966kk().getGlobal().containsKey("notesPosition") ? (String) m69966kk().getGlobal().get("notesPosition") : null;
        if (str != null && !"None".equals(str)) {
            z = true;
        }
        m69969x1(C14113y2.m67408k4("\r\n\r\n    body, html {\r\n        height: 100%;\r\n    }\r\n\r\n    body {\r\n        margin:", " 0 !important;\r\n        padding: 0 !important;\r\n        background-color: #e6e6e", "6;\r\n    }\r\n\r\n    .bg {\r\n"));
        m69969x1("            ");
        m69967kk(z2 ? C14113y2.m67408k4("width: ", dh2.m5103k4(((SlideSize) m69966kk().getObject().getSlideSize()).m2755k4().m56699x1() + (iIntValue * 2)), "px;") : "");
        m69969x1(IOUtils.LINE_SEPARATOR_WINDOWS);
        m69969x1("            ");
        m69967kk(z2 ? C14113y2.m67408k4("height: ", dh2.m5103k4(((SlideSize) m69966kk().getObject().getSlideSize()).m2755k4().m56697kk() + (iIntValue * 2)), "px;") : "");
        m69969x1(IOUtils.LINE_SEPARATOR_WINDOWS);
        m69969x1("            ");
        m69967kk(z2 ? "overflow: hidden;" : "");
        m69969x1(IOUtils.LINE_SEPARATOR_WINDOWS);
        m69969x1("            ");
        m69967kk(z2 ? "position: fixed;" : "");
        m69969x1("\r\n    }\r\n    \r\n    .slide {\r\n        width: ");
        double d = ((double) iIntValue) / 2.0d;
        m69967kk(C14113y2.m67408k4(dh2.m5101k4(((double) ((SlideSize) m69966kk().getObject().getSlideSize()).m2755k4().m56699x1()) + d), "px"));
        m69969x1(";\r\n        height: ");
        m69967kk(C14113y2.m67408k4(dh2.m5101k4(((double) ((SlideSize) m69966kk().getObject().getSlideSize()).m2755k4().m56697kk()) + d), "px"));
        m69969x1(C14113y2.m67408k4(";\r\n        outline: 1px solid #c6c6c6;\r\n        overflow: hidden;\r\n        margin", ": "));
        m69967kk(C14113y2.m67408k4(C14057f9.m66591x1(iIntValue), "px"));
        m69969x1(";\r\n        position: relative;\r\n");
        m69969x1("        ");
        m69967kk(z2 ? "position: absolute;" : "");
        m69969x1("\r\n    }\r\n\r\n");
        if (z) {
            m69969x1("        ");
            m69969x1("\r\n        .notes {\r\n            width: ");
            m69967kk(C14113y2.m67408k4(C14064he.m66704h4((float) (((double) ((NotesSize) m69966kk().getObject().getNotesSize()).m2030k4().m56699x1()) + d)), "px"));
            m69969x1(";\r\n            height: ");
            m69967kk(C14113y2.m67408k4(C14064he.m66704h4((float) (((double) ((NotesSize) m69966kk().getObject().getNotesSize()).m2030k4().m56697kk()) + d)), "px"));
            m69969x1(C14113y2.m67408k4(";\r\n            outline: 1px solid #c6c6c6;\r\n            overflow: hidden;\r\n      ", "      margin: "));
            m69967kk(C14113y2.m67408k4(C14057f9.m66591x1(iIntValue), "px"));
            m69969x1(";\r\n");
            m69969x1("            ");
            m69967kk(z2 ? "position: absolute;" : "");
            m69969x1("\r\n        }\r\n        ");
            m69969x1(IOUtils.LINE_SEPARATOR_WINDOWS);
        }
        m69969x1("    \r\n    .navigationArea {\r\n        float: left; \r\n        width: 240px; \r\n        height: 100%; \r\n        overflow-y: auto;\r\n    }\r\n    \r\n    .navigationAreaBorder {\r\n        border-right: solid #777777 1px;\r\n    }\r\n    \r\n    .navigationSelected {\r\n        background: #d24726;\r\n    }\r\n    \r\n    .slideThumb {\r\n        margin: 10px; \r\n        margin-bottom: 5px;\r\n        padding: 5px;\r\n        padding-bottom: 1px;\r\n        cursor: pointer;\r\n    }\r\n\r\n    .slide-content {\r\n        \r\n    }\r\n\r\n    .shape {\r\n        position: absolute;\r\n    }\r\n\r\n    .table {\r\n        position: absolute;\r\n        border-collapse: collapse;\r\n    }\r\n\r\n    .paragraph {\r\n        position: absolute;\r\n    }\r\n\r\n    .pictureframe {\r\n        position: absolute;\r\n    }\r\n\r\n    .thumbnail {\r\n        margin: ");
        m69967kk(C14113y2.m67408k4(C14057f9.m66591x1(((Integer) m69966kk().getGlobal().get("slideMargin")).intValue()), "px"));
        m69969x1(";\r\n        margin-top: ");
        m69967kk(C14113y2.m67408k4(C14057f9.m66591x1(((Integer) m69966kk().getGlobal().get("slideMargin")).intValue()), "px"));
        m69969x1(";\r\n    }\r\n      \r\n    .navigationButton {\r\n        position: absolute;\r\n        width: 100px;\r\n        height: 50px;\r\n        border: solid black 1px;\r\n        text-align: center;\r\n        vertical-align: middle;\r\n        line-height: 50px;\r\n        display: none;\r\n        cursor: pointer;\r\n    }\r\n    \r\n    #svgdiv, #svgdivpaths {\r\n        position: absolute;\r\n        top: 10px;\r\n        left: 10px;\r\n        z-index: -100;\r\n    }");
    }
}
