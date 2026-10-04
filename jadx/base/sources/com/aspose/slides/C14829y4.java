package com.aspose.slides;

import com.aspose.slides.internal.p080dd.AbstractC3124b3;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.internal.p475wh.C12016rv;
import com.aspose.slides.p559ms.System.C14113y2;
import com.aspose.slides.p559ms.System.C14114y9;
import com.google.firebase.vertexai.common.util.KtorKt;
import com.orion.notein.richeditor.utils.p606io.IOUtils;

/* JADX INFO: renamed from: com.aspose.slides.y4 */
/* JADX INFO: loaded from: classes3.dex */
class C14829y4 extends C14367qz<AutoShape> {
    public C14829y4(TemplateContext<AutoShape> templateContext, AbstractC3124b3 abstractC3124b3) {
        super(templateContext, abstractC3124b3);
    }

    /* JADX INFO: renamed from: k4 */
    private String m73735k4(AutoShape autoShape) {
        return C14113y2.m67403k4(" ", new String[]{C14442sb.m70498k4(autoShape.getFillFormat().getEffective(), m69966kk()), C14113y2.m67402k4("border: {0};", gau.m6461k4(autoShape.getLineFormat().getEffective())), C7019kk.m27462to(Float.valueOf(autoShape.getRotation()), 13) == 0 ? "" : C14113y2.m67402k4("transform: rotate({0}deg);", Integer.valueOf(C7019kk.m27462to(Float.valueOf(autoShape.getRotation()), 13)))});
    }

    @Override // com.aspose.slides.C14842yc
    /* JADX INFO: renamed from: k4 */
    public void mo6644k4() {
        AutoShape object = m69966kk().getObject();
        C12016rv c12016rvClone = ((C12016rv) m69966kk().getLocal().get("origin")).Clone();
        String strM67402k4 = C14113y2.m67402k4("left: {0}px; top: {1}px; width: {2}px; height: {3}px;", Integer.valueOf(C7019kk.m27462to(Float.valueOf(object.getX()), 13)), Integer.valueOf(C7019kk.m27462to(Float.valueOf(object.getY()), 13)), Integer.valueOf(C7019kk.m27462to(Float.valueOf(object.getWidth()), 13)), Integer.valueOf(C7019kk.m27462to(Float.valueOf(object.getHeight()), 13)));
        String strM67408k4 = C14113y2.m67408k4("slide-", C14114y9.m67465x1(object.getSlide().getSlideId()), "-shape-", C14114y9.m67465x1(object.getUniqueId()));
        String str = m69966kk().getLocal().containsKey("animationAttributes") ? (String) m69966kk().getLocal().get("animationAttributes") : "";
        m69969x1(KtorKt.SSE_SEPARATOR);
        m69969x1(IOUtils.LINE_SEPARATOR_WINDOWS);
        m69969x1("    <div");
        m69969x1(" class=\"shape\"");
        t8o<String, Integer> t8oVarM63325k4 = jii.m63325k4(" id=\"", 1400);
        t8o<String, Integer> t8oVarM63325k42 = jii.m63325k4("\"", 1408);
        t8o t8oVarM63325k43 = jii.m63325k4("", 1405);
        t8o t8oVarM63325k44 = jii.m63325k4(strM67408k4, 1405);
        Boolean bool = Boolean.FALSE;
        m69965k4("id", t8oVarM63325k4, t8oVarM63325k42, jii.m63324k4(t8oVarM63325k43, t8oVarM63325k44, bool));
        m69965k4("style", jii.m63325k4(" style=\"", 1409), jii.m63325k4("\"", 1461), jii.m63324k4(jii.m63325k4("", 1417), jii.m63325k4(strM67402k4, 1417), bool), jii.m63324k4(jii.m63325k4(" ", 1431), jii.m63325k4(m73735k4(object), 1432), bool));
        m69969x1(" ");
        m69967kk(m69962k4(str));
        m69969x1(">\r\n");
        TemplateContext<TSubModel> templateContextSubModel = m69966kk().subModel((TextFrame) object.getTextFrame());
        templateContextSubModel.getLocal().put("origin", c12016rvClone.Clone());
        templateContextSubModel.getLocal().put("parent", object);
        m69967kk(nci.m67958k4(TextFrame.class, this.f50311k4, "textframe", templateContextSubModel));
        m69969x1("\r\n    </div>\r\n");
    }
}
