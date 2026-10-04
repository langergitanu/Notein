package com.aspose.slides;

import com.alibaba.sdk.android.oss.common.RequestParameters;
import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.internal.p077d8.C3059ii;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.internal.p332p7.C7712fy;
import com.aspose.slides.internal.p464vq.C11785nh;
import com.aspose.slides.internal.p464vq.C11791os;
import com.aspose.slides.p559ms.System.IDisposable;
import com.aspose.slides.p559ms.System.Xml.AbstractC13912i5;
import java.util.Iterator;

/* JADX INFO: renamed from: com.aspose.slides.f0 */
/* JADX INFO: loaded from: classes3.dex */
class C0972f0 extends ywb {
    public C0972f0(C11791os c11791os, gnb gnbVar) {
        super(c11791os, gnbVar);
    }

    /* JADX INFO: renamed from: k4 */
    public static List<C7712fy> m5798k4(AbstractC13912i5 abstractC13912i5) {
        List<C7712fy> list = null;
        while (abstractC13912i5.mo65026h4()) {
            if (abstractC13912i5.mo65028jd() == 1 && RequestParameters.SIGNATURE.equals(abstractC13912i5.mo65023fa())) {
                C7712fy c7712fy = new C7712fy(abstractC13912i5);
                if (list == null) {
                    list = new List<>();
                }
                list.addItem(c7712fy);
            }
        }
        return list;
    }

    /* JADX INFO: renamed from: x1 */
    public final void m5801x1(DigitalSignature digitalSignature) {
        mo55332up();
        m5799k4(m55442ck(), digitalSignature, mo3468h4().mo4812qm());
        mo55333yj();
    }

    public C0972f0(C11791os c11791os, u8s u8sVar) {
        super(c11791os, u8sVar);
    }

    /* JADX INFO: renamed from: k4 */
    public final void m5800k4(DigitalSignature digitalSignature) {
        mo3469k4(new String[0]);
        List<C7712fy> listM5798k4 = m5798k4(m55443jd());
        if (listM5798k4 != null) {
            List.Enumerator<C7712fy> it = listM5798k4.iterator();
            while (it.hasNext()) {
                try {
                    C14331q7.m69445k4(digitalSignature, it.next(), mo3467du());
                } finally {
                    if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                        it.dispose();
                    }
                }
            }
        }
        mo55330fa();
    }

    /* JADX INFO: renamed from: k4 */
    public static void m5799k4(C3059ii c3059ii, DigitalSignature digitalSignature, C11785nh c11785nh) {
        C7712fy c7712fy = new C7712fy();
        c3059ii.m66258k4(0);
        C14331q7.m69444k4(digitalSignature, c7712fy, c11785nh);
        c7712fy.mo6846k4(null, c3059ii, RequestParameters.SIGNATURE);
    }
}
