package com.aspose.slides;

import com.aspose.slides.C1158gq;
import com.aspose.slides.internal.p172hu.AbstractC4685kk;
import com.aspose.slides.internal.p332p7.C7317be;
import com.aspose.slides.internal.p332p7.C7366c0;
import com.aspose.slides.internal.p332p7.C8490p3;
import com.aspose.slides.internal.p332p7.C8638qy;
import com.aspose.slides.internal.p332p7.C8820sx;

/* JADX INFO: renamed from: com.aspose.slides.l9 */
/* JADX INFO: loaded from: classes3.dex */
class C13767l9 {
    /* JADX INFO: renamed from: k4 */
    public static void m64326k4(IEffectStyle iEffectStyle, AbstractC4685kk<C7366c0> abstractC4685kk, u8s u8sVar) {
        if (iEffectStyle == null) {
            return;
        }
        final C7366c0 c7366c0Invoke = abstractC4685kk.invoke();
        C1158gq.m6879k4(iEffectStyle.getEffectFormat(), (C8490p3) c7366c0Invoke.m29342k4("effectLst").m29542x1(), u8sVar);
        b6z.m4032k4(iEffectStyle.getThreeDFormat(), new AbstractC4685kk<C8820sx>() { // from class: com.aspose.slides.l9.2
            @Override // com.aspose.slides.p559ms.System.AbstractC14085qw
            public String getDelegateId() {
                return System.identityHashCode(c7366c0Invoke) + "Aspose.Slides.PptxSerialization.PartParser.XmlParser.a_CT_EffectStyleItemElementData.AddScene3d()";
            }

            @Override // com.aspose.slides.internal.p172hu.AbstractC4685kk
            /* JADX INFO: renamed from: k4, reason: merged with bridge method [inline-methods] */
            public C8820sx invoke() {
                return c7366c0Invoke.m29343k4();
            }
        }, new AbstractC4685kk<C8638qy>() { // from class: com.aspose.slides.l9.3
            @Override // com.aspose.slides.p559ms.System.AbstractC14085qw
            public String getDelegateId() {
                return System.identityHashCode(c7366c0Invoke) + "Aspose.Slides.PptxSerialization.PartParser.XmlParser.a_CT_EffectStyleItemElementData.AddSp3d()";
            }

            @Override // com.aspose.slides.internal.p172hu.AbstractC4685kk
            /* JADX INFO: renamed from: k4, reason: merged with bridge method [inline-methods] */
            public C8638qy invoke() {
                return c7366c0Invoke.m29346x1();
            }
        }, (AbstractC4685kk<C7317be>) null);
    }

    /* JADX INFO: renamed from: k4 */
    public static void m64327k4(final IEffectStyle iEffectStyle, C7366c0 c7366c0, gnb gnbVar) {
        if (c7366c0 == null) {
            return;
        }
        C1158gq.m6880k4(new C1158gq.k4() { // from class: com.aspose.slides.l9.1
            @Override // com.aspose.slides.C1158gq.k4
            /* JADX INFO: renamed from: k4 */
            public IEffectFormat mo3774k4() {
                return iEffectStyle.getEffectFormat();
            }
        }, c7366c0.m29344kk(), gnbVar);
        b6z.m4033k4(iEffectStyle.getThreeDFormat(), c7366c0.m29345to(), c7366c0.m29341du(), (C7317be) null);
    }
}
