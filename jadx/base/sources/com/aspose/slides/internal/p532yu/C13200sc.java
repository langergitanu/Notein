package com.aspose.slides.internal.p532yu;

import com.aspose.slides.Collections.ArrayList;
import com.aspose.slides.exceptions.Exception;
import com.aspose.slides.exceptions.XmlSchemaException;
import com.aspose.slides.p559ms.System.C14113y2;

/* JADX INFO: renamed from: com.aspose.slides.internal.yu.sc */
/* JADX INFO: loaded from: classes5.dex */
public class C13200sc extends AbstractC12942dc {
    @Override // com.aspose.slides.internal.p532yu.AbstractC12942dc
    /* JADX INFO: renamed from: k4, reason: merged with bridge method [inline-methods] */
    public Exception mo60131x1(Object obj, AbstractC12892ae abstractC12892ae) {
        C12909bg c12909bgMo60033up = abstractC12892ae.mo60033up();
        if (((c12909bgMo60033up != null ? c12909bgMo60033up.f43449up : 0) & 16) == 0 || mo60130k4(obj, c12909bgMo60033up.f43440du, abstractC12892ae)) {
            return null;
        }
        return new XmlSchemaException("The Enumeration constraint failed.", C14113y2.f47374k4);
    }

    @Override // com.aspose.slides.internal.p532yu.AbstractC12942dc
    /* JADX INFO: renamed from: k4 */
    public boolean mo60130k4(Object obj, ArrayList arrayList, AbstractC12892ae abstractC12892ae) {
        for (int i = 0; i < arrayList.size(); i++) {
            if (abstractC12892ae.mo60034x1(obj, arrayList.get_Item(i)) == 0) {
                return true;
            }
        }
        return false;
    }
}
