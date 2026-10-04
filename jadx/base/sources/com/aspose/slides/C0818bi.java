package com.aspose.slides;

import com.aspose.slides.exceptions.ArgumentNullException;
import com.aspose.slides.internal.p172hu.AbstractC4685kk;
import com.aspose.slides.internal.p332p7.C7917ia;
import com.aspose.slides.internal.p332p7.C8087kh;

/* JADX INFO: renamed from: com.aspose.slides.bi */
/* JADX INFO: loaded from: classes3.dex */
class C0818bi {
    /* JADX INFO: renamed from: k4 */
    public static void m4212k4(C14197nq c14197nq, C7917ia c7917ia, gnb gnbVar) {
        if (c14197nq == null) {
            throw new ArgumentNullException("formatOverride");
        }
        if (c7917ia == null) {
            throw new ArgumentNullException("formatOverrideData");
        }
        c14197nq.m68172k4((int) c7917ia.m33966x1());
        c14197nq.m68174k4(c7917ia.m33965to());
        if (c7917ia.m33964kk() == null) {
            return;
        }
        c14197nq.m68173k4(new Format(c14197nq));
        C14864yx.m74128k4(c14197nq.m68175kk(), c7917ia.m33964kk(), gnbVar);
    }

    /* JADX INFO: renamed from: k4 */
    public static void m4213k4(C14197nq c14197nq, final C7917ia c7917ia, u8s u8sVar) {
        if (c14197nq == null) {
            throw new ArgumentNullException("formatOverride");
        }
        c7917ia.m33962k4(((long) c14197nq.m68171k4()) & 4294967295L);
        c7917ia.m33963k4(c14197nq.m68176x1());
        C14864yx.m74127k4(c14197nq.m68175kk(), new AbstractC4685kk<C8087kh>() { // from class: com.aspose.slides.bi.1
            @Override // com.aspose.slides.p559ms.System.AbstractC14085qw
            public String getDelegateId() {
                return System.identityHashCode(c7917ia) + "Aspose.Slides.PptxSerialization.PartParser.XmlParser.cx_CT_FormatOverrideElementData.AddSpPr()";
            }

            @Override // com.aspose.slides.internal.p172hu.AbstractC4685kk
            /* JADX INFO: renamed from: k4, reason: merged with bridge method [inline-methods] */
            public C8087kh invoke() {
                return c7917ia.m33961k4();
            }
        }, u8sVar, null, false);
    }
}
