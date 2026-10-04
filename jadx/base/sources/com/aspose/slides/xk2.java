package com.aspose.slides;

import com.aspose.slides.internal.p080dd.AbstractC3124b3;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.internal.p475wh.C12016rv;
import com.aspose.slides.p559ms.System.C14113y2;
import com.aspose.slides.p559ms.System.C14114y9;
import com.google.firebase.vertexai.common.util.KtorKt;

/* JADX INFO: loaded from: classes3.dex */
class xk2 extends C14367qz<Shape> {
    public xk2(TemplateContext<Shape> templateContext, AbstractC3124b3 abstractC3124b3) {
        super(templateContext, abstractC3124b3);
    }

    @Override // com.aspose.slides.C14842yc
    /* JADX INFO: renamed from: k4 */
    public void mo6644k4() {
        Shape object = m69966kk().getObject();
        C12016rv c12016rvClone = ((C12016rv) m69966kk().getLocal().get("origin")).Clone();
        String strM3665k4 = alz.m3665k4(object, c12016rvClone.Clone());
        String strM3666k4 = alz.m3666k4(object, m69966kk());
        String strM67408k4 = C14113y2.m67408k4("slide-", C14114y9.m67465x1(object.getSlide().getSlideId()), "-shape-", C14114y9.m67465x1(object.getUniqueId()));
        String str = m69966kk().getLocal().containsKey("animationAttributes") ? (String) m69966kk().getLocal().get("animationAttributes") : "";
        String strM67400k4 = C14113y2.m67400k4(C14113y2.m67408k4(strM3665k4, " background-image: url(", strM3666k4, "); background-size: 100% 100%;"), C14113y2.m67402k4(" transform: rotate({0}deg);", Integer.valueOf(C7019kk.m27462to(Float.valueOf(object.getRotation()), 13))));
        m69969x1(KtorKt.SSE_SEPARATOR);
        m69969x1("    <div");
        m69969x1(" class=\"shape\"");
        t8o<String, Integer> t8oVarM63325k4 = jii.m63325k4(" id=\"", 931);
        t8o<String, Integer> t8oVarM63325k42 = jii.m63325k4("\"", 939);
        t8o t8oVarM63325k43 = jii.m63325k4("", 936);
        t8o t8oVarM63325k44 = jii.m63325k4(strM67408k4, 936);
        Boolean bool = Boolean.FALSE;
        m69965k4("id", t8oVarM63325k4, t8oVarM63325k42, jii.m63324k4(t8oVarM63325k43, t8oVarM63325k44, bool));
        m69965k4("style", jii.m63325k4(" style=\"", 940), jii.m63325k4("\"", 964), jii.m63324k4(jii.m63325k4("", 948), jii.m63325k4(m69962k4(strM67400k4), 948), bool));
        m69969x1(" ");
        m69967kk(m69962k4(str));
        m69969x1(">\r\n");
        if (C7019kk.m27469x1(object, AutoShape.class)) {
            AutoShape autoShape = (AutoShape) C7019kk.m27452k4((Object) object, AutoShape.class);
            TemplateContext<TSubModel> templateContextSubModel = m69966kk().subModel((TextFrame) autoShape.getTextFrame());
            templateContextSubModel.getLocal().put("origin", c12016rvClone.Clone());
            templateContextSubModel.getLocal().put("parent", autoShape);
            m69967kk(nci.m67958k4(TextFrame.class, this.f50311k4, "textframe", templateContextSubModel));
        }
        m69969x1("    </div>\r\n");
    }
}
