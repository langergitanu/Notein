package com.aspose.slides;

import com.aspose.slides.Collections.Generic.Dictionary;
import com.aspose.slides.exceptions.ArgumentNullException;
import com.aspose.slides.internal.p077d8.C3085sv;
import com.aspose.slides.p559ms.System.C14047bz;
import com.aspose.slides.p559ms.System.C14080ne;
import com.aspose.slides.p559ms.System.C14113y2;

/* JADX INFO: loaded from: classes3.dex */
class f6h {
    /* JADX INFO: renamed from: k4 */
    private static C14047bz m6023k4(String str) {
        if (C14113y2.m67411k4(str)) {
            return C14047bz.f47172k4;
        }
        return C14113y2.m67363du(C14113y2.m67368h4(str), "paint.picture") ? new C14047bz("D3E34B21-9D75-101A-8c3d-00aa001a1652") : C14113y2.m67363du(C14113y2.m67368h4(str), "excel.sheet.8") ? new C14047bz("00020820-0000-0000-C000-000000000046") : C14113y2.m67363du(C14113y2.m67368h4(str), "excel.chart.8") ? new C14047bz("00020821-0000-0000-C000-000000000046") : C14113y2.m67363du(C14113y2.m67368h4(str), "excel.sheet.12") ? new C14047bz("00020830-0000-0000-C000-000000000046") : C14113y2.m67363du(C14113y2.m67368h4(str), "excel.sheetmacroenabled.12") ? new C14047bz("00020832-0000-0000-C000-000000000046") : C14113y2.m67363du(C14113y2.m67368h4(str), "excel.sheetbinarymacroenabled.12") ? new C14047bz("00020833-0000-0000-C000-000000000046") : C14113y2.m67363du(C14113y2.m67368h4(str), "word.document.8") ? new C14047bz("00020906-0000-0000-C000-000000000046") : C14113y2.m67363du(C14113y2.m67368h4(str), "word.document.12") ? new C14047bz("F4754C9B-64F5-4B40-8AF4-679732AC0607") : C14113y2.m67363du(C14113y2.m67368h4(str), "powerpoint.show.12") ? new C14047bz("CF4F55F4-8F87-4D47-80BB-5808164BB3F8") : C14113y2.m67363du(C14113y2.m67368h4(str), "powerpoint.show.8") ? new C14047bz("64818D10-4F9B-11CF-86EA-00AA00B929E8") : C14113y2.m67363du(C14113y2.m67368h4(str), "powerpoint.slide.12") ? new C14047bz("048EB43E-2059-422F-95E0-557DA96038AF") : C14113y2.m67363du(C14113y2.m67368h4(str), "word.opendocumenttext.12") ? new C14047bz("1B261B22-AC6A-4E68-A870-AB5080E8687B") : C14113y2.m67363du(C14113y2.m67368h4(str), "excel.opendocumentspreadsheet.12") ? new C14047bz("EABCECDB-CC1C-4A6F-B4E3-7F888A5ADFC8") : C14113y2.m67363du(C14113y2.m67368h4(str), "powerpoint.opendocumentpresentation.12") ? new C14047bz("C282417B-2662-44B8-8A94-3BFF61C50900") : C14113y2.m67363du(C14113y2.m67368h4(str), "msphotoed.3") ? new C14047bz("11943940-36DE-11CF-953E-00C0A84029E9") : C14047bz.f47172k4.Clone();
    }

    /* JADX INFO: renamed from: k4 */
    public static void m6024k4(OleObjectFrame oleObjectFrame, com.aspose.slides.internal.p332p7.vtn vtnVar, OdpSerializationContext odpSerializationContext) {
        if (oleObjectFrame == null) {
            throw new ArgumentNullException("oleFrame");
        }
        if (vtnVar == null) {
            throw new ArgumentNullException("frameElement");
        }
        com.aspose.slides.internal.p332p7.ez3 ez3Var = (com.aspose.slides.internal.p332p7.ez3) vtnVar.m43297k4("object-ole").m29542x1();
        C14047bz c14047bzClone = m6023k4(oleObjectFrame.getObjectProgId()).Clone();
        if (C14047bz.m66537x1(c14047bzClone, C14047bz.f47172k4)) {
            ez3Var.m31476k4(C14113y2.m67358c5(c14047bzClone.toString()));
        }
        if (odpSerializationContext.m2048fa()) {
            ez3Var.m31479kk(C14080ne.m66952k4(oleObjectFrame.m2090yj()));
            ISlidesPicture picture = oleObjectFrame.getSubstitutePictureFormat().getPicture();
            if (!C14113y2.m67411k4(picture.getLinkPathLong()) && picture.getImage() == null) {
                picture.setImage(((ImageCollection) picture.getPresentation().getImages()).m1726k4(picture.getLinkPathLong(), (Dictionary<String, IPPImage>) null));
            }
            if (picture.getImage() != null) {
                ((com.aspose.slides.internal.p332p7.cuq) vtnVar.m43297k4("image").m29542x1()).m29928x1(C14080ne.m66952k4(picture.getImage().getBinaryData()));
                return;
            }
            return;
        }
        ez3Var.m31475k4(1);
        if (oleObjectFrame.f2872h4) {
            ez3Var.m31478kk(1);
        }
        if (oleObjectFrame.isObjectLink()) {
            ez3Var.m31483x1(C3085sv.m13080k4(oleObjectFrame.getLinkPathLong()));
        } else {
            ez3Var.m31483x1(odpSerializationContext.m2057k4(oleObjectFrame.m2090yj()));
            ez3Var.m31482x1(1);
        }
        PPImage pPImage = (PPImage) oleObjectFrame.getSubstitutePictureFormat().getPicture().getImage();
        if (pPImage != null) {
            com.aspose.slides.internal.p332p7.cuq cuqVar = (com.aspose.slides.internal.p332p7.cuq) vtnVar.m43297k4("image").m29542x1();
            cuqVar.m29925k4(odpSerializationContext.m2054k4((IPPImage) pPImage));
            cuqVar.m29927x1(1);
            cuqVar.m29924k4(1);
        }
    }
}
