package com.aspose.slides;

import com.aspose.slides.internal.p172hu.AbstractC4685kk;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.internal.p332p7.AbstractC7379c5;
import com.aspose.slides.internal.p332p7.AbstractC7992jd;
import com.aspose.slides.internal.p332p7.C7971j0;
import com.aspose.slides.internal.p332p7.C7982j8;
import com.aspose.slides.internal.p332p7.C8299mz;
import com.aspose.slides.internal.p332p7.C8601qh;
import com.aspose.slides.internal.p332p7.C9034vf;

/* JADX INFO: renamed from: com.aspose.slides.lc */
/* JADX INFO: loaded from: classes3.dex */
class C13771lc {
    /* JADX INFO: renamed from: k4 */
    public static void m64352k4(IConnector iConnector, AbstractC7379c5 abstractC7379c5, bjs bjsVar) {
        if (abstractC7379c5 == null) {
            return;
        }
        C1127g0 c1127g0Mo268du = ((Connector) iConnector).mo268du();
        C13677j9.m63254k4(iConnector, abstractC7379c5.mo29433x1(), bjsVar.m4229k4());
        AbstractC7992jd abstractC7992jdMo29429k4 = abstractC7379c5.mo29429k4();
        axn.m3764k4(iConnector, abstractC7992jdMo29429k4.mo34651kk(), bjsVar);
        axn.m3762k4(iConnector, abstractC7992jdMo29429k4.mo33827k4(), bjsVar);
        C7971j0 c7971j0Mo33828x1 = abstractC7992jdMo29429k4.mo33828x1();
        bjsVar.m4227dy().addItem(iConnector, c7971j0Mo33828x1);
        C0976f4.m5820k4(iConnector.getConnectorLock(), c7971j0Mo33828x1.m34534to());
        tgm.m71152k4(iConnector, abstractC7379c5.mo29431kk());
        c1127g0Mo268du.m70450x1(c7971j0Mo33828x1.m34533m9());
        c1127g0Mo268du.m6402k4(abstractC7379c5.mo29428du());
    }

    /* JADX INFO: renamed from: k4 */
    public static void m64353k4(IConnector iConnector, final AbstractC7379c5 abstractC7379c5, u8s u8sVar) {
        C1127g0 c1127g0Mo268du = ((Connector) iConnector).mo268du();
        if (C7019kk.m27469x1(abstractC7379c5, com.aspose.slides.internal.p332p7.ez4.class)) {
            abstractC7379c5.mo29430k4(c1127g0Mo268du.m6401k4());
        } else {
            C7019kk.m27469x1(abstractC7379c5, C8299mz.class);
        }
        C13677j9.m63255k4(iConnector, abstractC7379c5.mo29433x1(), u8sVar);
        AbstractC7992jd abstractC7992jdMo29429k4 = abstractC7379c5.mo29429k4();
        axn.m3765k4(iConnector, abstractC7992jdMo29429k4.mo34651kk(), u8sVar);
        axn.m3763k4(iConnector, abstractC7992jdMo29429k4.mo33827k4(), u8sVar);
        final C7971j0 c7971j0Mo33828x1 = abstractC7992jdMo29429k4.mo33828x1();
        C14883zf.m74499k4((ConnectorLock) iConnector.getConnectorLock(), new AbstractC4685kk<C9034vf>() { // from class: com.aspose.slides.lc.1
            @Override // com.aspose.slides.p559ms.System.AbstractC14085qw
            public String getDelegateId() {
                return System.identityHashCode(c7971j0Mo33828x1) + "Aspose.Slides.PptxSerialization.PartParser.XmlParser.a_CT_NonVisualConnectorPropertiesElementData.AddCxnSpLocks()";
            }

            @Override // com.aspose.slides.internal.p172hu.AbstractC4685kk
            /* JADX INFO: renamed from: k4, reason: merged with bridge method [inline-methods] */
            public C9034vf invoke() {
                return c7971j0Mo33828x1.m34530k4();
            }
        });
        if (iConnector.getStartShapeConnectedTo() != null) {
            C7982j8 c7982j8M34535x1 = c7971j0Mo33828x1.m34535x1();
            c7982j8M34535x1.m34597k4(((Shape) iConnector.getStartShapeConnectedTo()).mo272to().m69039ix());
            c7982j8M34535x1.m34599x1(iConnector.getStartShapeConnectionSiteIndex());
        }
        if (iConnector.getEndShapeConnectedTo() != null) {
            C7982j8 c7982j8M34532kk = c7971j0Mo33828x1.m34532kk();
            c7982j8M34532kk.m34597k4(((Shape) iConnector.getEndShapeConnectedTo()).mo272to().m69039ix());
            c7982j8M34532kk.m34599x1(iConnector.getEndShapeConnectionSiteIndex());
        }
        tgm.m71153k4(iConnector.getShapeStyle(), new AbstractC4685kk<C8601qh>() { // from class: com.aspose.slides.lc.2
            @Override // com.aspose.slides.p559ms.System.AbstractC14085qw
            public String getDelegateId() {
                return System.identityHashCode(abstractC7379c5) + "Aspose.Slides.PptxSerialization.PartParser.XmlParser.BaseCT_ConnectorElementData.AddStyle()";
            }

            @Override // com.aspose.slides.internal.p172hu.AbstractC4685kk
            /* JADX INFO: renamed from: k4, reason: merged with bridge method [inline-methods] */
            public C8601qh invoke() {
                return abstractC7379c5.mo29432to();
            }
        });
        c7971j0Mo33828x1.m34531k4(c1127g0Mo268du.m70447ck());
    }
}
