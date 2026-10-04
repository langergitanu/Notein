package com.aspose.slides.internal.p532yu;

import com.aspose.slides.Collections.ArrayList;
import com.aspose.slides.exceptions.Exception;
import com.aspose.slides.exceptions.XmlSchemaException;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.p559ms.System.C14113y2;
import com.aspose.slides.p559ms.System.Xml.C13890ei;

/* JADX INFO: renamed from: com.aspose.slides.internal.yu.q6 */
/* JADX INFO: loaded from: classes5.dex */
public class C13163q6 extends AbstractC12942dc {
    @Override // com.aspose.slides.internal.p532yu.AbstractC12942dc
    /* JADX INFO: renamed from: k4 */
    public Exception mo60163k4(C13890ei c13890ei, AbstractC12892ae abstractC12892ae) {
        C12909bg c12909bgMo60033up = abstractC12892ae.mo60033up();
        int i = c12909bgMo60033up != null ? c12909bgMo60033up.f43449up : 0;
        if (i == 0) {
            return null;
        }
        int length = c13890ei.toString().length();
        if ((i & 1) != 0 && c12909bgMo60033up.f43445k4 != length) {
            return new XmlSchemaException("The actual length is not equal to the specified length.", C14113y2.f47374k4);
        }
        if ((i & 2) != 0 && length < c12909bgMo60033up.f43450x1) {
            return new XmlSchemaException("The actual length is less than the MinLength value.", C14113y2.f47374k4);
        }
        if ((i & 4) != 0 && c12909bgMo60033up.f43446kk < length) {
            return new XmlSchemaException("The actual length is greater than the MaxLength value.", C14113y2.f47374k4);
        }
        if ((i & 16) == 0 || m61414k4(c13890ei, c12909bgMo60033up.f43440du)) {
            return null;
        }
        return new XmlSchemaException("The Enumeration constraint failed.", C14113y2.f47374k4);
    }

    @Override // com.aspose.slides.internal.p532yu.AbstractC12942dc
    /* JADX INFO: renamed from: k4, reason: merged with bridge method [inline-methods] */
    public Exception mo60131x1(Object obj, AbstractC12892ae abstractC12892ae) {
        return mo60163k4((C13890ei) abstractC12892ae.mo60019dy().mo60513k4(obj, C7019kk.m27443k4((Class<?>) C13890ei.class)), abstractC12892ae);
    }

    /* JADX INFO: renamed from: k4 */
    private boolean m61414k4(C13890ei c13890ei, ArrayList arrayList) {
        for (int i = 0; i < arrayList.size(); i++) {
            if (c13890ei.equals((C13890ei) arrayList.get_Item(i))) {
                return true;
            }
        }
        return false;
    }

    @Override // com.aspose.slides.internal.p532yu.AbstractC12942dc
    /* JADX INFO: renamed from: k4 */
    public boolean mo60130k4(Object obj, ArrayList arrayList, AbstractC12892ae abstractC12892ae) {
        return m61414k4((C13890ei) abstractC12892ae.mo60019dy().mo60513k4(obj, C7019kk.m27443k4((Class<?>) C13890ei.class)), arrayList);
    }
}
