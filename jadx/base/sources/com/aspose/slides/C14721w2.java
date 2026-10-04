package com.aspose.slides;

import com.aspose.slides.internal.p080dd.AbstractC3124b3;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.p559ms.System.C14057f9;
import com.aspose.slides.p559ms.System.C14113y2;
import com.aspose.slides.p559ms.System.C14116yg;
import com.aspose.words.EditingLanguage;
import com.google.firebase.vertexai.common.util.KtorKt;
import com.orion.notein.richeditor.utils.p606io.IOUtils;

/* JADX INFO: renamed from: com.aspose.slides.w2 */
/* JADX INFO: loaded from: classes3.dex */
class C14721w2 extends C14367qz<Paragraph> {
    public C14721w2(TemplateContext<Paragraph> templateContext, AbstractC3124b3 abstractC3124b3) {
        super(templateContext, abstractC3124b3);
    }

    /* JADX INFO: renamed from: k4 */
    private String m72621k4(Paragraph paragraph) {
        return jgi.m63307k4(paragraph.getParagraphFormat().getEffective().getBullet().getPicture().getImage(), m69966kk());
    }

    /* JADX INFO: renamed from: x1 */
    private String m72623x1(Paragraph paragraph) {
        return htp.m7306x1(paragraph.getParagraphFormat().getEffective(), m69966kk());
    }

    /* JADX INFO: renamed from: k4 */
    private String m72622k4(Paragraph paragraph, TextFrame textFrame, boolean z) {
        return htp.m7297k4(paragraph.getParagraphFormat().getEffective(), textFrame.getTextFrameFormat().getEffective(), z, m69966kk());
    }

    @Override // com.aspose.slides.C14842yc
    /* JADX INFO: renamed from: k4 */
    public void mo6644k4() {
        Paragraph object = m69966kk().getObject();
        TextFrame textFrame = (TextFrame) m69966kk().getLocal().get("parent");
        boolean zBooleanValue = ((Boolean) m69966kk().getLocal().get("tableContent")).booleanValue();
        IParagraphFormatEffectiveData effective = object.getParagraphFormat().getEffective();
        double[] dArr = {-C14116yg.m67480k4(effective.getIndent()), 0.0d, 0.0d, 0.0d};
        if (effective.getBullet().getType() == 3) {
            dArr[2] = dArr[2] - ((double) htp.m7305kk(effective, m69966kk()));
        }
        String actualBulletValue = effective.getBullet().getActualBulletValue();
        String strM67408k4 = C14113y2.m67408k4(C14113y2.m67408k4("margin-left: ", C14057f9.m66591x1(C7019kk.m27462to(Double.valueOf(dArr[0]), 14)), "px; margin-top: ", C14057f9.m66591x1(C7019kk.m27462to(Double.valueOf(dArr[1]), 14)), "px; margin-right: ", C14057f9.m66591x1(C7019kk.m27462to(Double.valueOf(dArr[2]), 14)), "px; margin-bottom: ", C14057f9.m66591x1(C7019kk.m27462to(Double.valueOf(dArr[3]), 14)), "px; "), m72622k4(object, textFrame, zBooleanValue), C14113y2.m67408k4("display: inline-block; width: ", C14057f9.m66591x1(C7019kk.m27462to(Float.valueOf(C14116yg.m67480k4(effective.getIndent())), 13)), "px; "));
        m69969x1(KtorKt.SSE_SEPARATOR);
        m69969x1("\r\n<span");
        m69969x1(" class=\"portion\"");
        t8o<String, Integer> t8oVarM63325k4 = jii.m63325k4(" style=\"", 1888);
        t8o<String, Integer> t8oVarM63325k42 = jii.m63325k4("\"", 1913);
        t8o t8oVarM63325k43 = jii.m63325k4("", 1896);
        t8o t8oVarM63325k44 = jii.m63325k4(m69962k4(strM67408k4), 1896);
        Boolean bool = Boolean.FALSE;
        m69965k4("style", t8oVarM63325k4, t8oVarM63325k42, jii.m63324k4(t8oVarM63325k43, t8oVarM63325k44, bool));
        m69969x1(">\r\n");
        m69969x1("    ");
        m69967kk(m69962k4(actualBulletValue));
        m69969x1(IOUtils.LINE_SEPARATOR_WINDOWS);
        if (effective.getBullet().getType() == 3) {
            m69969x1("        <img");
            m69965k4("src", jii.m63325k4(" src=\"", 2030), jii.m63325k4("\"", 2069), jii.m63324k4(jii.m63325k4("", 2036), jii.m63325k4(m72621k4(object), 2036), bool));
            m69965k4("style", jii.m63325k4(" style=\"", Integer.valueOf(EditingLanguage.PORTUGUESE_PORTUGAL)), jii.m63325k4("\"", Integer.valueOf(EditingLanguage.UZBEK_CYRILLIC)), jii.m63324k4(jii.m63325k4("", 2078), jii.m63325k4(m72623x1(object), 2078), bool));
            m69969x1(" />\r\n");
        }
        m69969x1("</span>");
    }
}
