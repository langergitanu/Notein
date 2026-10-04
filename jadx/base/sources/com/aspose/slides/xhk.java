package com.aspose.slides;

import com.aspose.slides.internal.p080dd.AbstractC3124b3;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.internal.p475wh.C12016rv;
import com.aspose.slides.p559ms.System.C14113y2;
import com.aspose.slides.p559ms.System.C14114y9;
import com.aspose.words.EditingLanguage;
import com.huawei.hms.network.embedded.C18437z2;
import com.microsoft.identity.common.adal.internal.AuthenticationConstants;

/* JADX INFO: loaded from: classes3.dex */
class xhk extends C14367qz<VideoFrame> {
    public xhk(TemplateContext<VideoFrame> templateContext, AbstractC3124b3 abstractC3124b3) {
        super(templateContext, abstractC3124b3);
    }

    @Override // com.aspose.slides.C14842yc
    /* JADX INFO: renamed from: k4 */
    public void mo6644k4() {
        VideoFrame object = m69966kk().getObject();
        ((C12016rv) m69966kk().getLocal().get("origin")).Clone();
        String strM67402k4 = C14113y2.m67402k4("left: {0}px; top: {1}px; width: {2}px; height: {3}px;", Integer.valueOf(C7019kk.m27462to(Float.valueOf(object.getX()), 13)), Integer.valueOf(C7019kk.m27462to(Float.valueOf(object.getY()), 13)), Integer.valueOf(C7019kk.m27462to(Float.valueOf(object.getWidth()), 13)), Integer.valueOf(C7019kk.m27462to(Float.valueOf(object.getHeight()), 13)));
        C7019kk.m27462to(Float.valueOf(object.getWidth()), 13);
        C7019kk.m27462to(Float.valueOf(object.getHeight()), 13);
        String strM72076k4 = v5j.m72076k4(object, m69966kk());
        String contentType = object.getEmbeddedVideo().getContentType();
        String strM67408k4 = C14113y2.m67408k4("slide-", C14114y9.m67465x1(object.getSlide().getSlideId()), "-shape-", C14114y9.m67465x1(object.getUniqueId()));
        String str = m69966kk().getLocal().containsKey("animationAttributes") ? (String) m69966kk().getLocal().get("animationAttributes") : "";
        m69969x1("\r\n\r\n<table");
        m69969x1(" class=\"table\"");
        t8o<String, Integer> t8oVarM63325k4 = jii.m63325k4(" id=\"", Integer.valueOf(EditingLanguage.URDU));
        t8o<String, Integer> t8oVarM63325k42 = jii.m63325k4("\"", Integer.valueOf(EditingLanguage.TAJIK));
        t8o t8oVarM63325k43 = jii.m63325k4("", Integer.valueOf(EditingLanguage.ESTONIAN));
        t8o t8oVarM63325k44 = jii.m63325k4(strM67408k4, Integer.valueOf(EditingLanguage.ESTONIAN));
        Boolean bool = Boolean.FALSE;
        m69965k4("id", t8oVarM63325k4, t8oVarM63325k42, jii.m63324k4(t8oVarM63325k43, t8oVarM63325k44, bool));
        m69965k4("style", jii.m63325k4(" style=\"", Integer.valueOf(EditingLanguage.PERSIAN)), jii.m63325k4("\"", Integer.valueOf(EditingLanguage.KAZAKH)), jii.m63324k4(jii.m63325k4("", Integer.valueOf(EditingLanguage.TSONGA)), jii.m63325k4(strM67402k4, Integer.valueOf(EditingLanguage.TSONGA)), bool));
        m69969x1(" ");
        m69967kk(m69962k4(str));
        m69969x1(">\r\n    <tr>\r\n        <td>\r\n        <video");
        m69965k4("style", jii.m63325k4(" style=\"", Integer.valueOf(EditingLanguage.CORSICAN)), jii.m63325k4("\"", Integer.valueOf(AuthenticationConstants.Broker.BROKER_REQUEST_ID)), jii.m63324k4(jii.m63325k4("", 1163), jii.m63325k4(strM67402k4, 1163), bool));
        m69969x1(" controls>\r\n            <source");
        m69965k4("src", jii.m63325k4(" src=\"", 1209), jii.m63325k4("\"", 1224), jii.m63324k4(jii.m63325k4("", 1215), jii.m63325k4(strM72076k4, 1215), bool));
        m69965k4(C18437z2.f56754h, jii.m63325k4(" type=\"", 1225), jii.m63325k4("\"", 1244), jii.m63324k4(jii.m63325k4("", 1232), jii.m63325k4(contentType, 1232), bool));
        m69969x1(C14113y2.m67408k4(">\r\n            Your browser does not support the video tag.\r\n        </video>\r\n  ", "      </td>\r\n    </tr>\r\n</table>\r\n"));
    }
}
