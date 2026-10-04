package com.aspose.slides;

import com.aspose.slides.internal.p172hu.AbstractC4685kk;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.internal.p332p7.C7394ca;
import com.aspose.slides.internal.p407st.C10391cu;
import com.aspose.slides.internal.p407st.C10409du;
import com.aspose.slides.internal.p407st.C10427ep;
import com.aspose.slides.internal.p407st.C10485ix;
import com.aspose.slides.internal.p407st.C10529ls;
import com.aspose.slides.internal.p407st.C10574od;
import com.aspose.slides.internal.p407st.C10592pm;

/* JADX INFO: loaded from: classes3.dex */
class pk1 {
    /* JADX INFO: renamed from: k4 */
    public static void m69122k4(com.aspose.slides.internal.p332p7.rqz rqzVar, C10409du c10409du, m4c m4cVar) {
        final com.aspose.slides.internal.p332p7.v2z v2zVarM29443x1;
        com.aspose.slides.internal.p332p7.hgn hgnVar;
        C7394ca c7394ca;
        C10485ix c10485ixM50705dy = c10409du.m50705dy();
        if (c10485ixM50705dy != null) {
            C10529ls c10529ls = (C10529ls) C7019kk.m27452k4((Object) c10485ixM50705dy.m50973x1(), C10529ls.class);
            com.aspose.slides.internal.p332p7.c6b c6bVar = null;
            if (c10529ls == null || c10529ls.m51219du() != 4) {
                com.aspose.slides.internal.p332p7.c6b c6bVar2 = new com.aspose.slides.internal.p332p7.c6b();
                v2zVarM29443x1 = c6bVar2.m29443x1();
                c6bVar = c6bVar2;
                hgnVar = null;
            } else {
                hgnVar = new com.aspose.slides.internal.p332p7.hgn();
                v2zVarM29443x1 = hgnVar.m33336x1();
                hgnVar.m33334k4(ubb.m71624to(c10409du.m50709to()));
            }
            ubb.m71605k4(v2zVarM29443x1.m42700du(), new AbstractC4685kk<com.aspose.slides.internal.p332p7.ei2>() { // from class: com.aspose.slides.pk1.1
                @Override // com.aspose.slides.p559ms.System.AbstractC14085qw
                public String getDelegateId() {
                    return System.identityHashCode(v2zVarM29443x1.m42700du()) + "Aspose.Slides.PptxSerialization.PartParser.XmlParser.p_CT_TLCommonTimeNodeDataElementData.AddStCondLst()";
                }

                @Override // com.aspose.slides.internal.p172hu.AbstractC4685kk
                /* JADX INFO: renamed from: k4, reason: merged with bridge method [inline-methods] */
                public com.aspose.slides.internal.p332p7.ei2 invoke() {
                    return v2zVarM29443x1.m42700du().m36293k4();
                }
            }, new AbstractC4685kk<com.aspose.slides.internal.p332p7.ei2>() { // from class: com.aspose.slides.pk1.2
                @Override // com.aspose.slides.p559ms.System.AbstractC14085qw
                public String getDelegateId() {
                    return System.identityHashCode(v2zVarM29443x1.m42700du()) + "Aspose.Slides.PptxSerialization.PartParser.XmlParser.p_CT_TLCommonTimeNodeDataElementData.AddEndCondLst()";
                }

                @Override // com.aspose.slides.internal.p172hu.AbstractC4685kk
                /* JADX INFO: renamed from: k4, reason: merged with bridge method [inline-methods] */
                public com.aspose.slides.internal.p332p7.ei2 invoke() {
                    return v2zVarM29443x1.m42700du().m36323x1();
                }
            }, c10409du, m4cVar);
            m69123k4(v2zVarM29443x1, c10485ixM50705dy, c10409du.m50709to(), m4cVar);
            if (c6bVar != null && c6bVar.m29443x1().m42701h4().m44924k4() != null) {
                c7394ca = new C7394ca("audio", c6bVar);
            } else if (hgnVar == null || hgnVar.m33336x1().m42701h4().m44924k4() == null) {
                return;
            } else {
                c7394ca = new C7394ca("video", hgnVar);
            }
            rqzVar.m40179k4(c7394ca);
        }
    }

    /* JADX INFO: renamed from: k4 */
    public static void m69123k4(com.aspose.slides.internal.p332p7.v2z v2zVar, C10485ix c10485ix, C10592pm c10592pm, m4c m4cVar) {
        v2zVar.m42705k4(ubb.m71621kk(c10592pm));
        v2zVar.m42703k4(ubb.m71627x1(c10592pm) * 100.0f);
        v2zVar.m42708x1(!ubb.m71615k4(c10592pm));
        v2zVar.m42704k4(((long) ubb.m71595du(c10592pm)) & 4294967295L);
        if (c10485ix != null) {
            fut.m6324k4(v2zVar.m42701h4(), c10485ix.m50973x1(), m4cVar);
        }
    }

    /* JADX INFO: renamed from: k4 */
    public static void m69124k4(com.aspose.slides.internal.p332p7.v2z v2zVar, C10592pm c10592pm) {
        if ((v2zVar.m42706kk() & 4294967295L) > 1) {
            C10391cu c10391cu = new C10391cu((int) v2zVar.m42706kk());
            c10391cu.m51409um().m51920k4((short) 15);
            c10592pm.m50513yj().addItem(c10391cu);
        }
        if (!v2zVar.m42707to()) {
            C10574od c10574od = new C10574od(true);
            c10574od.m51409um().m51920k4((short) 18);
            c10592pm.m50513yj().addItem(c10574od);
        }
        C10427ep c10427ep = new C10427ep(v2zVar.m42709x1() ? 0.0f : v2zVar.m42702k4() / 100.0f);
        c10427ep.m51409um().m51920k4((short) 22);
        c10592pm.m50513yj().addItem(c10427ep);
        if (v2zVar.m42709x1()) {
            C10574od c10574od2 = new C10574od(true);
            c10574od2.m51409um().m51920k4((short) 23);
            c10592pm.m50513yj().addItem(c10574od2);
        }
    }
}
