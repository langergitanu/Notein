package com.aspose.slides.internal.p532yu;

import com.aspose.slides.exceptions.XmlSchemaException;
import com.aspose.slides.p559ms.System.C14044b3;
import com.aspose.slides.p559ms.System.Xml.AbstractC13883dt;
import com.aspose.slides.p559ms.System.Xml.C13850af;
import com.aspose.slides.p559ms.System.Xml.C13968ri;
import com.aspose.slides.p559ms.System.Xml.InterfaceC13980t6;

/* JADX INFO: renamed from: com.aspose.slides.internal.yu.gi */
/* JADX INFO: loaded from: classes5.dex */
public class C13000gi extends C13071kp {
    @Override // com.aspose.slides.internal.p532yu.AbstractC13279x6, com.aspose.slides.internal.p532yu.AbstractC12892ae
    /* JADX INFO: renamed from: k4 */
    public Object mo60025k4(String str, AbstractC13883dt abstractC13883dt, InterfaceC13980t6 interfaceC13980t6) {
        try {
            double dM65132uz = C13850af.m65132uz(str);
            if (C14044b3.m66439x1(dM65132uz) || C14044b3.m66437kk(dM65132uz)) {
                throw new XmlSchemaException("The value '{0}' is invalid according to its data type.", str);
            }
            return Double.valueOf(dM65132uz);
        } catch (RuntimeException e) {
            throw new XmlSchemaException(C13968ri.m65819k4("The value '{0}' is invalid according to its data type.", str), e);
        }
    }
}
