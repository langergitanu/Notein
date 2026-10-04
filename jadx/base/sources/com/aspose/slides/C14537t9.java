package com.aspose.slides;

import com.aspose.slides.Collections.Generic.IGenericEnumerator;
import com.aspose.slides.internal.p172hu.AbstractC4685kk;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.internal.p464vq.AbstractC11760jd;
import com.aspose.slides.internal.p464vq.C11702ak;
import com.aspose.slides.internal.p464vq.C11709bg;
import com.aspose.slides.internal.p464vq.C11723d3;
import com.aspose.slides.internal.p464vq.C11791os;
import com.aspose.slides.internal.p464vq.C11806rs;
import com.aspose.slides.internal.p464vq.C11844wy;
import com.aspose.slides.p559ms.System.IDisposable;
import java.util.Iterator;

/* JADX INFO: renamed from: com.aspose.slides.t9 */
/* JADX INFO: loaded from: classes3.dex */
class C14537t9 {
    /* JADX INFO: renamed from: k4 */
    public static void m71033k4(ICustomData iCustomData, AbstractC4685kk<com.aspose.slides.internal.p332p7.fbr> abstractC4685kk, final u8s u8sVar) {
        String strM55289du;
        com.aspose.slides.internal.p332p7.lwx lwxVarM31723k4;
        if (iCustomData.getCustomXmlParts().size() == 0 && iCustomData.getTags().size() == 0) {
            return;
        }
        com.aspose.slides.internal.p332p7.fbr fbrVarInvoke = abstractC4685kk.invoke();
        if (iCustomData.getCustomXmlParts().size() > 0) {
            boolean zM27469x1 = C7019kk.m27469x1(((InterfaceC14397rj) iCustomData).getParent_Immediate(), IPresentation.class);
            IGenericEnumerator<ICustomXmlPart> it = iCustomData.getCustomXmlParts().iterator();
            while (it.hasNext()) {
                try {
                    CustomXmlPart customXmlPart = (CustomXmlPart) it.next();
                    if (u8sVar.m71534h4().containsKey(customXmlPart)) {
                        C11709bg c11709bgM55311x1 = u8sVar.m71534h4().get_Item(customXmlPart);
                        if (!zM27469x1) {
                            c11709bgM55311x1 = u8sVar.m55433g8().m55311x1(c11709bgM55311x1.m55296x1());
                        }
                        strM55289du = c11709bgM55311x1.m55289du();
                        lwxVarM31723k4 = fbrVarInvoke.m31723k4();
                    } else {
                        C11791os c11791osM55395k4 = u8sVar.mo4812qm().m55395k4("/customXml/item{0}.xml", new AbstractC11760jd.k4() { // from class: com.aspose.slides.t9.1
                            @Override // com.aspose.slides.p559ms.System.AbstractC14085qw
                            public String getDelegateId() {
                                return C22209OooOo0O.OooO00o(u8sVar, new StringBuilder(), "Aspose.Slides.PptxSerialization.PptxSerializationContext.GetNextCustomXmlFileNumber()");
                            }

                            @Override // com.aspose.slides.internal.p464vq.AbstractC11760jd.k4
                            /* JADX INFO: renamed from: k4 */
                            public int mo5039k4() {
                                return u8sVar.m71527c6();
                            }
                        }, new C11844wy(), customXmlPart.getXmlData());
                        C11791os c11791osM55394k4 = u8sVar.mo4812qm().m55394k4("/customXml/itemProps{0}.xml", new AbstractC11760jd.k4() { // from class: com.aspose.slides.t9.2
                            @Override // com.aspose.slides.p559ms.System.AbstractC14085qw
                            public String getDelegateId() {
                                return C22209OooOo0O.OooO00o(u8sVar, new StringBuilder(), "Aspose.Slides.PptxSerialization.PptxSerializationContext.GetNextCustomXmlPropsFileNumber()");
                            }

                            @Override // com.aspose.slides.internal.p464vq.AbstractC11760jd.k4
                            /* JADX INFO: renamed from: k4 */
                            public int mo5039k4() {
                                return u8sVar.m71557ts();
                            }
                        }, new C11702ak());
                        new C14783xe(c11791osM55394k4, u8sVar).m73341x1(customXmlPart);
                        c11791osM55395k4.m55377up().m55311x1(c11791osM55394k4);
                        strM55289du = u8sVar.m55433g8().m55311x1(c11791osM55395k4).m55289du();
                        lwxVarM31723k4 = fbrVarInvoke.m31723k4();
                    }
                    lwxVarM31723k4.m36499k4(strM55289du);
                } catch (Throwable th) {
                    if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                        it.dispose();
                    }
                    throw th;
                }
            }
            if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                it.dispose();
            }
        }
        if (iCustomData.getTags().size() <= 0 || u8sVar.m71531dy()) {
            return;
        }
        C11791os c11791osM55394k42 = u8sVar.mo4812qm().m55394k4("/ppt/tags/tag{0}.xml", new AbstractC11760jd.k4() { // from class: com.aspose.slides.t9.3
            @Override // com.aspose.slides.p559ms.System.AbstractC14085qw
            public String getDelegateId() {
                return C22209OooOo0O.OooO00o(u8sVar, new StringBuilder(), "Aspose.Slides.PptxSerialization.PptxSerializationContext.GetNextTagFileNumber()");
            }

            @Override // com.aspose.slides.internal.p464vq.AbstractC11760jd.k4
            /* JADX INFO: renamed from: k4 */
            public int mo5039k4() {
                return u8sVar.m71559um();
            }
        }, new C11806rs());
        new ub2(c11791osM55394k42, u8sVar).m71592x1(iCustomData.getTags());
        fbrVarInvoke.m31726x1().m44277k4(u8sVar.m55433g8().m55311x1(c11791osM55394k42).m55289du());
    }

    /* JADX INFO: renamed from: k4 */
    public static void m71034k4(ICustomData iCustomData, com.aspose.slides.internal.p332p7.fbr fbrVar, gnb gnbVar) {
        C11791os c11791osM55296x1;
        if (fbrVar == null) {
            return;
        }
        C11723d3 c11723d3M55338u4 = gnbVar.m55338u4();
        com.aspose.slides.internal.p332p7.lwx[] lwxVarArrM31724kk = fbrVar.m31724kk();
        if (lwxVarArrM31724kk != null && lwxVarArrM31724kk.length > 0) {
            for (com.aspose.slides.internal.p332p7.lwx lwxVar : lwxVarArrM31724kk) {
                ((CustomXmlPart) gnbVar.m6795to(c11723d3M55338u4.m55303k4(lwxVar.m36498k4()).m55296x1())).m1280k4((CustomXmlPartCollection) iCustomData.getCustomXmlParts());
            }
        }
        if (fbrVar.m31725to() == null || c11723d3M55338u4.m55303k4(fbrVar.m31725to().m44276k4()) == null || (c11791osM55296x1 = c11723d3M55338u4.m55303k4(fbrVar.m31725to().m44276k4()).m55296x1()) == null) {
            return;
        }
        new ub2(c11791osM55296x1, gnbVar).m71591k4(iCustomData.getTags());
    }
}
