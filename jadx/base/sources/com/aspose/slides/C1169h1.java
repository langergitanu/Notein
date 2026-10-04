package com.aspose.slides;

import com.aspose.slides.exceptions.Exception;
import com.aspose.slides.internal.p314oc.C7017h4;
import com.aspose.slides.internal.p332p7.C7394ca;
import com.aspose.slides.internal.p332p7.C7416cl;
import com.aspose.slides.internal.p332p7.C8256md;
import com.aspose.slides.internal.p332p7.C8403o4;
import com.aspose.slides.internal.p332p7.C9220xo;
import com.aspose.slides.p559ms.System.C14113y2;

/* JADX INFO: renamed from: com.aspose.slides.h1 */
/* JADX INFO: loaded from: classes3.dex */
class C1169h1 {

    /* JADX INFO: renamed from: k4 */
    private static final C7017h4 f5373k4 = new C7017h4("noFill", "solidFill", "gradFill", "blipFill", "pattFill", "grpFill");

    /* JADX INFO: renamed from: k4 */
    public static void m6956k4(IFillFormat iFillFormat, C7394ca.k4 k4Var, u8s u8sVar) {
        m6957k4(iFillFormat, k4Var, false, u8sVar);
    }

    /* JADX INFO: renamed from: k4 */
    public static void m6957k4(IFillFormat iFillFormat, C7394ca.k4 k4Var, boolean z, u8s u8sVar) {
        if (iFillFormat == null) {
            return;
        }
        byte fillType = iFillFormat.getFillType();
        if (fillType == 0) {
            k4Var.mo2788k4("noFill");
            return;
        }
        if (fillType == 1) {
            final C8256md c8256md = (C8256md) k4Var.mo2788k4("solidFill").m29542x1();
            C1246ib.m7609k4(iFillFormat.getSolidFillColor(), new C7394ca.k4() { // from class: com.aspose.slides.h1.1
                @Override // com.aspose.slides.p559ms.System.AbstractC14085qw
                public String getDelegateId() {
                    return System.identityHashCode(c8256md) + "Aspose.Slides.PptxSerialization.PartParser.XmlParser.a_CT_SolidColorFillPropertiesElementData.AddColor(System.String)";
                }

                @Override // com.aspose.slides.internal.p332p7.C7394ca.k4
                /* JADX INFO: renamed from: k4 */
                public C7394ca mo2788k4(String str) {
                    return c8256md.m36800k4(str);
                }
            });
            return;
        }
        if (fillType == 2) {
            C8403o4 c8403o4 = (C8403o4) k4Var.mo2788k4("gradFill").m29542x1();
            c8403o4.m37986k4(iFillFormat.getRotateWithShape());
            C14199ns.m68196x1(iFillFormat.getGradientFormat(), c8403o4);
            return;
        }
        if (fillType == 3) {
            hhj.m7151x1(iFillFormat.getPatternFormat(), (C7416cl) k4Var.mo2788k4("pattFill").m29542x1());
            return;
        }
        if (fillType == 4) {
            C9220xo c9220xo = (C9220xo) k4Var.mo2788k4("blipFill").m29542x1();
            c9220xo.m44551k4(iFillFormat.getRotateWithShape());
            xps.m73533k4((PictureFillFormat) iFillFormat.getPictureFillFormat(), c9220xo, u8sVar);
        } else if (fillType == 5) {
            k4Var.mo2788k4("grpFill");
        } else if (z) {
            k4Var.mo2788k4("noFill");
        }
    }

    /* JADX INFO: renamed from: k4 */
    public static void m6958k4(IFillFormat iFillFormat, C7394ca c7394ca, gnb gnbVar) {
        if (c7394ca == null) {
            return;
        }
        int iM27428k4 = f5373k4.m27428k4(c7394ca.m29539k4());
        if (iM27428k4 == 0) {
            iFillFormat.setFillType((byte) 0);
            return;
        }
        if (iM27428k4 == 1) {
            C8256md c8256md = (C8256md) c7394ca.m29542x1();
            iFillFormat.setFillType((byte) 1);
            C1246ib.m7610k4(iFillFormat.getSolidFillColor(), c8256md.m36799k4());
            return;
        }
        if (iM27428k4 == 2) {
            C8403o4 c8403o4 = (C8403o4) c7394ca.m29542x1();
            iFillFormat.setFillType((byte) 2);
            iFillFormat.setRotateWithShape(c8403o4.m37990to());
            C14199ns.m68195k4(iFillFormat.getGradientFormat(), c8403o4);
            return;
        }
        if (iM27428k4 == 3) {
            C9220xo c9220xo = (C9220xo) c7394ca.m29542x1();
            iFillFormat.setFillType((byte) 4);
            iFillFormat.setRotateWithShape(c9220xo.m44555to());
            xps.m73532k4((PictureFillFormat) iFillFormat.getPictureFillFormat(), c9220xo, gnbVar);
            return;
        }
        if (iM27428k4 != 4) {
            if (iM27428k4 != 5) {
                throw new Exception(C14113y2.m67408k4("Unknown element \"", c7394ca.m29539k4(), "\""));
            }
            iFillFormat.setFillType((byte) 5);
        } else {
            C7416cl c7416cl = (C7416cl) c7394ca.m29542x1();
            iFillFormat.setFillType((byte) 3);
            hhj.m7150k4(iFillFormat.getPatternFormat(), c7416cl);
        }
    }
}
