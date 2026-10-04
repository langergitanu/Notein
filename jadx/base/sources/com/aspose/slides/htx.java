package com.aspose.slides;

import com.aspose.slides.internal.p080dd.AbstractC3124b3;
import com.aspose.slides.internal.p475wh.C12016rv;
import com.aspose.slides.p559ms.System.C14113y2;
import com.aspose.slides.p559ms.System.C14114y9;
import com.orion.notein.richeditor.utils.p606io.IOUtils;

/* JADX INFO: loaded from: classes3.dex */
class htx extends C14367qz<PictureFrame> {
    public htx(TemplateContext<PictureFrame> templateContext, AbstractC3124b3 abstractC3124b3) {
        super(templateContext, abstractC3124b3);
    }

    /* JADX INFO: renamed from: k4 */
    private String m7307k4(PictureFrame pictureFrame, C12016rv c12016rv) {
        return jgi.m63308k4(pictureFrame, c12016rv.Clone());
    }

    @Override // com.aspose.slides.C14842yc
    /* JADX INFO: renamed from: k4 */
    public void mo6644k4() {
        PictureFrame object = m69966kk().getObject();
        C12016rv c12016rvClone = ((C12016rv) m69966kk().getLocal().get("origin")).Clone();
        String strM63310k4 = jgi.m63310k4(jgi.m63307k4(object.getPictureFormat().getPicture().getImage(), m69966kk()), object.getPictureFormat().getCropLeft(), object.getPictureFormat().getCropTop(), object.getPictureFormat().getCropRight(), object.getPictureFormat().getCropBottom());
        if ("image/tiff".equals(object.getPictureFormat().getPicture().getImage().getContentType()) && !((Boolean) m69966kk().getGlobal().get("embedImages")).booleanValue()) {
            jgi.m63311x1(object.getPictureFormat().getPicture().getImage(), m69966kk());
            strM63310k4 = C14113y2.m67400k4(strM63310k4, ".png");
        }
        String strM67408k4 = C14113y2.m67408k4("slide-", C14114y9.m67465x1(object.getSlide().getSlideId()), "-shape-", C14114y9.m67465x1(object.getUniqueId()));
        String str = m69966kk().getLocal().containsKey("animationAttributes") ? (String) m69966kk().getLocal().get("animationAttributes") : "";
        String strM63309k4 = jgi.m63309k4(object, C14113y2.m67408k4(strM67408k4, "-effect"));
        String strM67408k42 = C14113y2.m67411k4(strM63309k4) ? "" : C14113y2.m67408k4("filter: url(#", strM67408k4, "-effect)");
        m69969x1(IOUtils.LINE_SEPARATOR_WINDOWS);
        m69967kk(m69962k4(strM63309k4));
        m69969x1("\r\n<img");
        t8o<String, Integer> t8oVarM63325k4 = jii.m63325k4(" src=\"", 1452);
        t8o<String, Integer> t8oVarM63325k42 = jii.m63325k4("\"", 1465);
        t8o t8oVarM63325k43 = jii.m63325k4("", 1458);
        t8o t8oVarM63325k44 = jii.m63325k4(strM63310k4, 1458);
        Boolean bool = Boolean.FALSE;
        m69965k4("src", t8oVarM63325k4, t8oVarM63325k42, jii.m63324k4(t8oVarM63325k43, t8oVarM63325k44, bool));
        m69965k4("id", jii.m63325k4(" id=\"", 1466), jii.m63325k4("\"", 1474), jii.m63324k4(jii.m63325k4("", 1471), jii.m63325k4(strM67408k4, 1471), bool));
        m69969x1(" class=\"pictureframe\"");
        m69965k4("style", jii.m63325k4(" style=\"", 1496), jii.m63325k4("\"", 1570), jii.m63324k4(jii.m63325k4("", 1504), jii.m63325k4(m7307k4(object, c12016rvClone.Clone()), 1504), bool), jii.m63324k4(jii.m63325k4(" ", 1552), jii.m63325k4(m69962k4(strM67408k42), 1553), bool));
        m69969x1(" ");
        m69967kk(m69962k4(str));
        m69969x1("/>");
    }
}
