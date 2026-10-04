package com.aspose.slides;

import com.aspose.slides.Collections.Generic.IGenericEnumerator;
import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.internal.p172hu.AbstractC4685kk;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.internal.p332p7.C7366c0;
import com.aspose.slides.internal.p332p7.C7394ca;
import com.aspose.slides.internal.p332p7.C8285mr;
import com.aspose.slides.internal.p332p7.C8985uy;
import com.aspose.slides.p559ms.System.IDisposable;
import java.util.Iterator;

/* JADX INFO: renamed from: com.aspose.slides.r8 */
/* JADX INFO: loaded from: classes3.dex */
class C14378r8 {
    /* JADX INFO: renamed from: k4 */
    public static void m70036k4(IFormatScheme iFormatScheme, C8285mr c8285mr, gnb gnbVar) {
        if (c8285mr == null) {
            return;
        }
        List.Enumerator<C7394ca> it = c8285mr.m37070x1().m33504k4().iterator();
        while (it.hasNext()) {
            try {
                C1169h1.m6958k4(((FillFormatCollection) iFormatScheme.getFillStyles()).m1470k4(), it.next(), gnbVar);
            } finally {
                if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                    it.dispose();
                }
            }
        }
        if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
            it.dispose();
        }
        for (C8985uy c8985uy : c8285mr.m37068kk().m39047x1()) {
            euh.m5728k4(((LineFormatCollection) iFormatScheme.getLineStyles()).m1912k4(), c8985uy);
        }
        for (C7366c0 c7366c0 : c8285mr.m37069to().m34466x1()) {
            C13767l9.m64327k4(((EffectStyleCollection) iFormatScheme.getEffectStyles()).m1409k4(), c7366c0, gnbVar);
        }
        it = c8285mr.m37065du().m32076k4().iterator();
        while (it.hasNext()) {
            try {
                C1169h1.m6958k4(((FillFormatCollection) iFormatScheme.getBackgroundFillStyles()).m1470k4(), it.next(), gnbVar);
            } finally {
                if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                    it.dispose();
                }
            }
        }
        ((FormatScheme) iFormatScheme).m1565k4(c8285mr.m37066k4());
    }

    /* JADX INFO: renamed from: k4 */
    public static void m70037k4(IFormatScheme iFormatScheme, final C8285mr c8285mr, u8s u8sVar) {
        IGenericEnumerator<IFillFormat> it = iFormatScheme.getFillStyles().iterator();
        while (it.hasNext()) {
            try {
                C1169h1.m6956k4(it.next(), new C7394ca.k4() { // from class: com.aspose.slides.r8.1
                    @Override // com.aspose.slides.p559ms.System.AbstractC14085qw
                    public String getDelegateId() {
                        return System.identityHashCode(c8285mr.m37070x1()) + "Aspose.Slides.PptxSerialization.PartParser.XmlParser.a_CT_FillStyleListElementData.AddFillProperties(System.String)";
                    }

                    @Override // com.aspose.slides.internal.p332p7.C7394ca.k4
                    /* JADX INFO: renamed from: k4 */
                    public C7394ca mo2788k4(String str) {
                        return c8285mr.m37070x1().m33505k4(str);
                    }
                }, u8sVar);
            } finally {
                if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                    it.dispose();
                }
            }
        }
        if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
            it.dispose();
        }
        IGenericEnumerator<ILineFormat> it2 = iFormatScheme.getLineStyles().iterator();
        while (it2.hasNext()) {
            try {
                euh.m5727k4(it2.next(), new AbstractC4685kk<C8985uy>() { // from class: com.aspose.slides.r8.2
                    @Override // com.aspose.slides.p559ms.System.AbstractC14085qw
                    public String getDelegateId() {
                        return System.identityHashCode(c8285mr.m37068kk()) + "Aspose.Slides.PptxSerialization.PartParser.XmlParser.a_CT_LineStyleListElementData.AddLn()";
                    }

                    @Override // com.aspose.slides.internal.p172hu.AbstractC4685kk
                    /* JADX INFO: renamed from: k4, reason: merged with bridge method [inline-methods] */
                    public C8985uy invoke() {
                        return c8285mr.m37068kk().m39046k4();
                    }
                }, true);
            } finally {
                if (C7019kk.m27456k4((Iterator) it2, (Class<IDisposable>) IDisposable.class)) {
                    it2.dispose();
                }
            }
        }
        if (C7019kk.m27456k4((Iterator) it2, (Class<IDisposable>) IDisposable.class)) {
            it2.dispose();
        }
        IGenericEnumerator<IEffectStyle> it3 = iFormatScheme.getEffectStyles().iterator();
        while (it3.hasNext()) {
            try {
                C13767l9.m64326k4(it3.next(), new AbstractC4685kk<C7366c0>() { // from class: com.aspose.slides.r8.3
                    @Override // com.aspose.slides.p559ms.System.AbstractC14085qw
                    public String getDelegateId() {
                        return System.identityHashCode(c8285mr.m37069to()) + "Aspose.Slides.PptxSerialization.PartParser.XmlParser.a_CT_EffectStyleListElementData.AddEffectStyle()";
                    }

                    @Override // com.aspose.slides.internal.p172hu.AbstractC4685kk
                    /* JADX INFO: renamed from: k4, reason: merged with bridge method [inline-methods] */
                    public C7366c0 invoke() {
                        return c8285mr.m37069to().m34465k4();
                    }
                }, u8sVar);
            } finally {
                if (C7019kk.m27456k4((Iterator) it3, (Class<IDisposable>) IDisposable.class)) {
                    it3.dispose();
                }
            }
        }
        if (C7019kk.m27456k4((Iterator) it3, (Class<IDisposable>) IDisposable.class)) {
            it3.dispose();
        }
        it = iFormatScheme.getBackgroundFillStyles().iterator();
        while (it.hasNext()) {
            try {
                C1169h1.m6956k4(it.next(), new C7394ca.k4() { // from class: com.aspose.slides.r8.4
                    @Override // com.aspose.slides.p559ms.System.AbstractC14085qw
                    public String getDelegateId() {
                        return System.identityHashCode(c8285mr.m37065du()) + "Aspose.Slides.PptxSerialization.PartParser.XmlParser.a_CT_BackgroundFillStyleListElementData.AddFillProperties(System.String)";
                    }

                    @Override // com.aspose.slides.internal.p332p7.C7394ca.k4
                    /* JADX INFO: renamed from: k4 */
                    public C7394ca mo2788k4(String str) {
                        return c8285mr.m37065du().m32077k4(str);
                    }
                }, u8sVar);
            } finally {
                if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                    it.dispose();
                }
            }
        }
        c8285mr.m37067k4(((FormatScheme) iFormatScheme).m1568x1());
    }
}
