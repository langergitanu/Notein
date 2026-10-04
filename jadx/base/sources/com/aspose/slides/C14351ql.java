package com.aspose.slides;

import com.aspose.slides.internal.p332p7.C7394ca;

/* JADX INFO: renamed from: com.aspose.slides.ql */
/* JADX INFO: loaded from: classes3.dex */
class C14351ql {
    /* JADX INFO: renamed from: k4 */
    public static void m69694k4(MasterHandoutSlide masterHandoutSlide, com.aspose.slides.internal.p332p7.yq7 yq7Var, sm2 sm2Var, pkv pkvVar) {
        final com.aspose.slides.internal.p332p7.xlm xlmVar = (com.aspose.slides.internal.p332p7.xlm) yq7Var.m45095k4("handout-master").m29542x1();
        xlmVar.m44498x1(sm2Var.m70673dy());
        com.aspose.slides.internal.p332p7.lzc lzcVarM70674h4 = sm2Var.m70674h4();
        xlmVar.m44496kk(lzcVarM70674h4.m36546k4());
        s1a.m70422k4(lzcVarM70674h4);
        s1a.m70420k4(masterHandoutSlide, lzcVarM70674h4, pkvVar.m69130x1());
        ov2.m68881k4(masterHandoutSlide.getShapes(), new C7394ca.k4() { // from class: com.aspose.slides.ql.1
            @Override // com.aspose.slides.p559ms.System.AbstractC14085qw
            public String getDelegateId() {
                return System.identityHashCode(xlmVar) + "Aspose.Slides.PptxSerialization.PartParser.XmlParser.odfstyle_CT_HandoutMasterElementData.AddShape(System.String)";
            }

            @Override // com.aspose.slides.internal.p332p7.C7394ca.k4
            /* JADX INFO: renamed from: k4 */
            public C7394ca mo2788k4(String str) {
                return xlmVar.m44494k4(str);
            }
        }, pkvVar);
    }
}
