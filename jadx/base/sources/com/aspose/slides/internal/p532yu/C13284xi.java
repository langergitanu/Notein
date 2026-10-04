package com.aspose.slides.internal.p532yu;

import com.aspose.slides.Collections.ArrayList;
import com.aspose.slides.exceptions.Exception;
import com.aspose.slides.exceptions.XmlSchemaException;
import com.aspose.slides.p559ms.System.C14113y2;

/* JADX INFO: renamed from: com.aspose.slides.internal.yu.xi */
/* JADX INFO: loaded from: classes5.dex */
public class C13284xi extends AbstractC12942dc {
    @Override // com.aspose.slides.internal.p532yu.AbstractC12942dc
    /* JADX INFO: renamed from: k4, reason: merged with bridge method [inline-methods] */
    public Exception mo60131x1(Object obj, AbstractC12892ae abstractC12892ae) {
        return mo60166k4(abstractC12892ae.mo60019dy().mo60491du(obj), abstractC12892ae);
    }

    @Override // com.aspose.slides.internal.p532yu.AbstractC12942dc
    /* JADX INFO: renamed from: x1, reason: merged with bridge method [inline-methods] */
    public Exception mo60166k4(double d, AbstractC12892ae abstractC12892ae) {
        C12909bg c12909bgMo60033up = abstractC12892ae.mo60033up();
        int i = c12909bgMo60033up != null ? c12909bgMo60033up.f43449up : 0;
        AbstractC12974ex abstractC12974exMo60019dy = abstractC12892ae.mo60019dy();
        if ((i & 64) != 0 && d > abstractC12974exMo60019dy.mo60491du(c12909bgMo60033up.f43447m9)) {
            return new XmlSchemaException("The MaxInclusive constraint failed.", C14113y2.f47374k4);
        }
        if ((i & 128) != 0 && d >= abstractC12974exMo60019dy.mo60491du(c12909bgMo60033up.f43441dy)) {
            return new XmlSchemaException("The MaxExclusive constraint failed.", C14113y2.f47374k4);
        }
        if ((i & 256) != 0 && d < abstractC12974exMo60019dy.mo60491du(c12909bgMo60033up.f43438c5)) {
            return new XmlSchemaException("The MinInclusive constraint failed.", C14113y2.f47374k4);
        }
        if ((i & 512) != 0 && d <= abstractC12974exMo60019dy.mo60491du(c12909bgMo60033up.f43444jd)) {
            return new XmlSchemaException("The MinExclusive constraint failed.", C14113y2.f47374k4);
        }
        if ((i & 16) == 0 || m61738k4(d, c12909bgMo60033up.f43440du, abstractC12974exMo60019dy)) {
            return null;
        }
        return new XmlSchemaException("The Enumeration constraint failed.", C14113y2.f47374k4);
    }

    @Override // com.aspose.slides.internal.p532yu.AbstractC12942dc
    /* JADX INFO: renamed from: x1, reason: merged with bridge method [inline-methods] */
    public Exception mo60167k4(float f, AbstractC12892ae abstractC12892ae) {
        return mo60166k4(f, abstractC12892ae);
    }

    /* JADX INFO: renamed from: k4 */
    private boolean m61738k4(double d, ArrayList arrayList, AbstractC12974ex abstractC12974ex) {
        for (int i = 0; i < arrayList.size(); i++) {
            if (d == abstractC12974ex.mo60491du(arrayList.get_Item(i))) {
                return true;
            }
        }
        return false;
    }

    @Override // com.aspose.slides.internal.p532yu.AbstractC12942dc
    /* JADX INFO: renamed from: k4 */
    public boolean mo60130k4(Object obj, ArrayList arrayList, AbstractC12892ae abstractC12892ae) {
        return m61738k4(abstractC12892ae.mo60019dy().mo60491du(obj), arrayList, abstractC12892ae.mo60019dy());
    }
}
