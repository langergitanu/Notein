package com.aspose.slides;

import com.aspose.slides.internal.p172hu.AbstractC4685kk;
import com.aspose.slides.internal.p332p7.C8087kh;
import com.aspose.slides.internal.p332p7.C8453om;

/* JADX INFO: loaded from: classes3.dex */
class v9z {
    /* JADX INFO: renamed from: k4 */
    public static void m72101k4(IMarker iMarker, AbstractC4685kk<C8453om> abstractC4685kk, u8s u8sVar) {
        if (abstractC4685kk == null || !m72103k4(iMarker)) {
            return;
        }
        final C8453om c8453omInvoke = abstractC4685kk.invoke();
        if (iMarker.getSymbol() != -1) {
            c8453omInvoke.m38343k4().m28720k4(iMarker.getSymbol());
        }
        if (iMarker.getSize() != 5 && iMarker.getSize() != 0) {
            c8453omInvoke.m38348x1().m42153k4(iMarker.getSize() & 65535);
        }
        C14864yx.m74127k4(iMarker.getFormat(), new AbstractC4685kk<C8087kh>() { // from class: com.aspose.slides.v9z.1
            @Override // com.aspose.slides.p559ms.System.AbstractC14085qw
            public String getDelegateId() {
                return System.identityHashCode(c8453omInvoke) + "Aspose.Slides.PptxSerialization.PartParser.XmlParser.cht_CT_MarkerElementData.AddSpPr()";
            }

            @Override // com.aspose.slides.internal.p172hu.AbstractC4685kk
            /* JADX INFO: renamed from: k4, reason: merged with bridge method [inline-methods] */
            public C8087kh invoke() {
                return c8453omInvoke.m38345kk();
            }
        }, u8sVar, null, false);
        c8453omInvoke.m38344k4(((Marker) iMarker).m1928k4().m70693k4());
    }

    /* JADX INFO: renamed from: k4 */
    public static void m72102k4(IMarker iMarker, C8453om c8453om, gnb gnbVar) {
        iMarker.setSymbol(-1);
        if (c8453om == null) {
            return;
        }
        if (c8453om.m38347to() != null) {
            iMarker.setSymbol(c8453om.m38347to().m28719k4());
        }
        if (c8453om.m38341du() != null) {
            iMarker.setSize(c8453om.m38341du().m42152k4() & 65535);
        }
        C14864yx.m74128k4(iMarker.getFormat(), c8453om.m38342h4(), gnbVar);
        ((Marker) iMarker).m1928k4().m70694k4(c8453om.m38346m9());
    }

    /* JADX INFO: renamed from: k4 */
    public static boolean m72103k4(IMarker iMarker) {
        return (!C14864yx.m74129k4(iMarker.getFormat(), null) && iMarker.getSize() == 0 && iMarker.getSymbol() == -1) ? false : true;
    }
}
