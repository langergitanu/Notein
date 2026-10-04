package com.aspose.slides;

import com.aspose.slides.exceptions.Exception;
import com.aspose.slides.internal.p314oc.C7017h4;
import com.aspose.slides.internal.p332p7.C7394ca;
import com.aspose.slides.internal.p332p7.C7416cl;
import com.aspose.slides.internal.p332p7.C8256md;
import com.aspose.slides.internal.p332p7.C8403o4;
import com.aspose.slides.p559ms.System.C14113y2;

/* JADX INFO: loaded from: classes3.dex */
class ikd {

    /* JADX INFO: renamed from: k4 */
    private static final C7017h4 f5724k4 = new C7017h4("noFill", "solidFill", "gradFill", "pattFill");

    /* JADX INFO: renamed from: k4 */
    public static void m7665k4(ILineFillFormat iLineFillFormat, C7394ca.k4 k4Var) {
        if (iLineFillFormat.getFillType() == -1) {
            return;
        }
        byte fillType = iLineFillFormat.getFillType();
        if (fillType == 0) {
            k4Var.mo2788k4("noFill");
            return;
        }
        if (fillType == 1) {
            final C8256md c8256md = (C8256md) k4Var.mo2788k4("solidFill").m29542x1();
            C1246ib.m7609k4(iLineFillFormat.getSolidFillColor(), new C7394ca.k4() { // from class: com.aspose.slides.ikd.1
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
        } else if (fillType == 2) {
            C8403o4 c8403o4 = (C8403o4) k4Var.mo2788k4("gradFill").m29542x1();
            C14199ns.m68196x1(iLineFillFormat.getGradientFormat(), c8403o4);
            c8403o4.m37986k4(iLineFillFormat.getRotateWithShape());
        } else {
            if (fillType != 3) {
                throw new Exception();
            }
            hhj.m7151x1(iLineFillFormat.getPatternFormat(), (C7416cl) k4Var.mo2788k4("pattFill").m29542x1());
        }
    }

    /* JADX INFO: renamed from: k4 */
    public static void m7666k4(ILineFillFormat iLineFillFormat, C7394ca c7394ca) {
        if (c7394ca == null) {
            return;
        }
        iLineFillFormat.setFillType((byte) -1);
        int iM27428k4 = f5724k4.m27428k4(c7394ca.m29539k4());
        if (iM27428k4 == 0) {
            iLineFillFormat.setFillType((byte) 0);
            return;
        }
        if (iM27428k4 == 1) {
            C8256md c8256md = (C8256md) c7394ca.m29542x1();
            iLineFillFormat.setFillType((byte) 1);
            C1246ib.m7610k4(iLineFillFormat.getSolidFillColor(), c8256md.m36799k4());
        } else {
            if (iM27428k4 == 2) {
                C8403o4 c8403o4 = (C8403o4) c7394ca.m29542x1();
                iLineFillFormat.setFillType((byte) 2);
                iLineFillFormat.setRotateWithShape(c8403o4.m37990to());
                C14199ns.m68195k4(iLineFillFormat.getGradientFormat(), c8403o4);
                return;
            }
            if (iM27428k4 != 3) {
                throw new Exception(C14113y2.m67408k4("Unknown element \"", c7394ca.m29539k4(), "\""));
            }
            C7416cl c7416cl = (C7416cl) c7394ca.m29542x1();
            iLineFillFormat.setFillType((byte) 3);
            hhj.m7150k4(iLineFillFormat.getPatternFormat(), c7416cl);
        }
    }
}
