package com.aspose.slides.internal.p532yu;

import com.aspose.slides.exceptions.XmlSchemaException;
import com.aspose.slides.p559ms.System.C14064he;
import com.aspose.slides.p559ms.System.Xml.AbstractC13883dt;
import com.aspose.slides.p559ms.System.Xml.C13850af;
import com.aspose.slides.p559ms.System.Xml.C13968ri;
import com.aspose.slides.p559ms.System.Xml.InterfaceC13980t6;

/* JADX INFO: renamed from: com.aspose.slides.internal.yu.xw */
/* JADX INFO: loaded from: classes5.dex */
public class C13294xw extends C13213t6 {
    @Override // com.aspose.slides.internal.p532yu.AbstractC13279x6, com.aspose.slides.internal.p532yu.AbstractC12892ae
    /* JADX INFO: renamed from: k4 */
    public Object mo60025k4(String str, AbstractC13883dt abstractC13883dt, InterfaceC13980t6 interfaceC13980t6) {
        try {
            float fM65129u4 = C13850af.m65129u4(str);
            if (C14064he.m66717x1(fM65129u4) || C14064he.m66715kk(fM65129u4)) {
                throw new XmlSchemaException("The value '{0}' is invalid according to its data type.", str);
            }
            return Float.valueOf(fM65129u4);
        } catch (RuntimeException e) {
            throw new XmlSchemaException(C13968ri.m65819k4("The value '{0}' is invalid according to its data type.", str), e);
        }
    }
}
