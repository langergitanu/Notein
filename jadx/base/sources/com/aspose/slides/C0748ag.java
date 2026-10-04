package com.aspose.slides;

import com.aspose.slides.internal.p172hu.AbstractC4685kk;
import com.aspose.slides.internal.p332p7.C7341br;
import com.aspose.slides.internal.p332p7.C7660fc;

/* JADX INFO: renamed from: com.aspose.slides.ag */
/* JADX INFO: loaded from: classes3.dex */
class C0748ag {
    /* JADX INFO: renamed from: k4 */
    public static void m3564k4(IExtraColorScheme iExtraColorScheme, AbstractC4685kk<C7660fc> abstractC4685kk) {
        if (iExtraColorScheme == null) {
            return;
        }
        final C7660fc c7660fcInvoke = abstractC4685kk.invoke();
        C0827bq.m4294x1(iExtraColorScheme.getColorScheme(), c7660fcInvoke.m31736x1());
        C14349qj.m69672k4(((ExtraColorScheme) iExtraColorScheme).m1427k4(), new AbstractC4685kk<C7341br>() { // from class: com.aspose.slides.ag.1
            @Override // com.aspose.slides.p559ms.System.AbstractC14085qw
            public String getDelegateId() {
                return System.identityHashCode(c7660fcInvoke) + "Aspose.Slides.PptxSerialization.PartParser.XmlParser.a_CT_ColorSchemeAndMappingElementData.AddClrMap()";
            }

            @Override // com.aspose.slides.internal.p172hu.AbstractC4685kk
            /* JADX INFO: renamed from: k4, reason: merged with bridge method [inline-methods] */
            public C7341br invoke() {
                return c7660fcInvoke.m31734k4();
            }
        });
    }

    /* JADX INFO: renamed from: k4 */
    public static void m3565k4(IExtraColorScheme iExtraColorScheme, C7660fc c7660fc) {
        if (c7660fc == null) {
            return;
        }
        C0827bq.m4293k4(iExtraColorScheme.getColorScheme(), c7660fc.m31736x1());
        C14349qj.m69673k4(((ExtraColorScheme) iExtraColorScheme).m1427k4(), c7660fc.m31735kk());
    }
}
