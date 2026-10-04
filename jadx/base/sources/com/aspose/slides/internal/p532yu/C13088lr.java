package com.aspose.slides.internal.p532yu;

import com.aspose.slides.exceptions.ArgumentNullException;
import com.aspose.slides.exceptions.XmlSchemaException;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.p559ms.System.AbstractC14068j5;
import com.aspose.slides.p559ms.System.C14113y2;
import com.aspose.slides.p559ms.System.Xml.AbstractC13883dt;
import com.aspose.slides.p559ms.System.Xml.C13890ei;
import com.aspose.slides.p559ms.System.Xml.C13968ri;
import com.aspose.slides.p559ms.System.Xml.InterfaceC13980t6;

/* JADX INFO: renamed from: com.aspose.slides.internal.yu.lr */
/* JADX INFO: loaded from: classes5.dex */
public class C13088lr extends C12904b3 {

    /* JADX INFO: renamed from: yj */
    private static final AbstractC14068j5 f44085yj = C7019kk.m27443k4((Class<?>) C13890ei.class);

    /* JADX INFO: renamed from: ks */
    private static final AbstractC14068j5 f44084ks = C7019kk.m27443k4((Class<?>) C13890ei[].class);

    @Override // com.aspose.slides.internal.p532yu.C12904b3, com.aspose.slides.internal.p532yu.AbstractC13279x6, com.aspose.slides.internal.p532yu.AbstractC12892ae
    /* JADX INFO: renamed from: c5 */
    public int mo60016c5() {
        return 10;
    }

    @Override // com.aspose.slides.internal.p532yu.C12904b3, com.aspose.slides.internal.p532yu.AbstractC13279x6, com.aspose.slides.internal.p532yu.AbstractC12892ae
    /* JADX INFO: renamed from: jd */
    public AbstractC14068j5 mo60022jd() {
        return f44085yj;
    }

    @Override // com.aspose.slides.internal.p532yu.AbstractC13279x6, com.aspose.slides.internal.p532yu.AbstractC12892ae
    /* JADX INFO: renamed from: k4 */
    public Object mo60025k4(String str, AbstractC13883dt abstractC13883dt, InterfaceC13980t6 interfaceC13980t6) {
        if (str == null || str.length() == 0) {
            throw new XmlSchemaException("The attribute value cannot be empty.", C14113y2.f47374k4);
        }
        if (interfaceC13980t6 == null) {
            throw new ArgumentNullException("nsmgr");
        }
        try {
            return C13890ei.m65276k4(C14113y2.m67440x1(str), interfaceC13980t6, new String[]{null});
        } catch (XmlSchemaException e) {
            throw e;
        } catch (RuntimeException e2) {
            throw new XmlSchemaException(C13968ri.m65819k4("The value '{0}' is invalid according to its data type.", str), e2);
        }
    }

    @Override // com.aspose.slides.internal.p532yu.C12904b3, com.aspose.slides.internal.p532yu.AbstractC13279x6
    /* JADX INFO: renamed from: x6 */
    public AbstractC14068j5 mo60046x6() {
        return f44084ks;
    }
}
