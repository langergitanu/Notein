package com.aspose.slides.internal.p532yu;

import com.aspose.slides.Collections.ArrayList;
import com.aspose.slides.exceptions.Exception;
import com.aspose.slides.exceptions.XmlSchemaException;
import com.aspose.slides.p559ms.System.C14084qq;
import com.aspose.slides.p559ms.System.C14113y2;

/* JADX INFO: renamed from: com.aspose.slides.internal.yu.yg */
/* JADX INFO: loaded from: classes5.dex */
public class C13304yg extends AbstractC12942dc {
    @Override // com.aspose.slides.internal.p532yu.AbstractC12942dc
    /* JADX INFO: renamed from: k4, reason: merged with bridge method [inline-methods] */
    public Exception mo60174x1(C14084qq c14084qq, AbstractC12892ae abstractC12892ae) {
        C12909bg c12909bgMo60033up = abstractC12892ae.mo60033up();
        int i = c12909bgMo60033up != null ? c12909bgMo60033up.f43449up : 0;
        if ((i & 64) != 0 && abstractC12892ae.mo60034x1(c14084qq.Clone(), ((C14084qq) c12909bgMo60033up.f43447m9).Clone()) > 0) {
            return new XmlSchemaException("The MaxInclusive constraint failed.", C14113y2.f47374k4);
        }
        if ((i & 128) != 0 && abstractC12892ae.mo60034x1(c14084qq.Clone(), ((C14084qq) c12909bgMo60033up.f43441dy).Clone()) >= 0) {
            return new XmlSchemaException("The MaxExclusive constraint failed.", C14113y2.f47374k4);
        }
        if ((i & 256) != 0 && abstractC12892ae.mo60034x1(c14084qq.Clone(), ((C14084qq) c12909bgMo60033up.f43438c5).Clone()) < 0) {
            return new XmlSchemaException("The MinInclusive constraint failed.", C14113y2.f47374k4);
        }
        if ((i & 512) != 0 && abstractC12892ae.mo60034x1(c14084qq.Clone(), ((C14084qq) c12909bgMo60033up.f43444jd).Clone()) <= 0) {
            return new XmlSchemaException("The MinExclusive constraint failed.", C14113y2.f47374k4);
        }
        if ((i & 16) == 0 || m61770k4(c14084qq.Clone(), c12909bgMo60033up.f43440du, abstractC12892ae)) {
            return null;
        }
        return new XmlSchemaException("The Enumeration constraint failed.", C14113y2.f47374k4);
    }

    @Override // com.aspose.slides.internal.p532yu.AbstractC12942dc
    /* JADX INFO: renamed from: k4, reason: merged with bridge method [inline-methods] */
    public Exception mo60131x1(Object obj, AbstractC12892ae abstractC12892ae) {
        return mo60174x1(abstractC12892ae.mo60019dy().mo60546x1(obj).Clone().Clone(), abstractC12892ae);
    }

    /* JADX INFO: renamed from: k4 */
    private boolean m61770k4(C14084qq c14084qq, ArrayList arrayList, AbstractC12892ae abstractC12892ae) {
        for (int i = 0; i < arrayList.size(); i++) {
            if (abstractC12892ae.mo60034x1(c14084qq.Clone(), ((C14084qq) arrayList.get_Item(i)).Clone()) == 0) {
                return true;
            }
        }
        return false;
    }

    @Override // com.aspose.slides.internal.p532yu.AbstractC12942dc
    /* JADX INFO: renamed from: k4 */
    public boolean mo60130k4(Object obj, ArrayList arrayList, AbstractC12892ae abstractC12892ae) {
        return m61770k4(abstractC12892ae.mo60019dy().mo60546x1(obj).Clone(), arrayList, abstractC12892ae);
    }
}
