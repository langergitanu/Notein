package com.aspose.slides.internal.p532yu;

import com.aspose.slides.Collections.ArrayList;
import com.aspose.slides.exceptions.Exception;
import com.aspose.slides.exceptions.XmlSchemaException;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.p559ms.System.C14077m4;
import com.aspose.slides.p559ms.System.C14113y2;

/* JADX INFO: renamed from: com.aspose.slides.internal.yu.ii */
/* JADX INFO: loaded from: classes5.dex */
public class C13031ii extends AbstractC12942dc {
    @Override // com.aspose.slides.internal.p532yu.AbstractC12942dc
    /* JADX INFO: renamed from: k4 */
    public Exception mo60164k4(C14077m4 c14077m4, AbstractC12892ae abstractC12892ae) {
        C12909bg c12909bgMo60033up = abstractC12892ae.mo60033up();
        int i = c12909bgMo60033up != null ? c12909bgMo60033up.f43449up : 0;
        if ((i & 64) != 0 && C14077m4.m66798k4(c14077m4.Clone(), ((C14077m4) C7019kk.m27464to(c12909bgMo60033up.f43447m9, C14077m4.class)).Clone()) > 0) {
            return new XmlSchemaException("The MaxInclusive constraint failed.", C14113y2.f47374k4);
        }
        if ((i & 128) != 0 && C14077m4.m66798k4(c14077m4.Clone(), ((C14077m4) C7019kk.m27464to(c12909bgMo60033up.f43441dy, C14077m4.class)).Clone()) >= 0) {
            return new XmlSchemaException("The MaxExclusive constraint failed.", C14113y2.f47374k4);
        }
        if ((i & 256) != 0 && C14077m4.m66798k4(c14077m4.Clone(), ((C14077m4) C7019kk.m27464to(c12909bgMo60033up.f43438c5, C14077m4.class)).Clone()) < 0) {
            return new XmlSchemaException("The MinInclusive constraint failed.", C14113y2.f47374k4);
        }
        if ((i & 512) != 0 && C14077m4.m66798k4(c14077m4.Clone(), ((C14077m4) C7019kk.m27464to(c12909bgMo60033up.f43444jd, C14077m4.class)).Clone()) <= 0) {
            return new XmlSchemaException("The MinExclusive constraint failed.", C14113y2.f47374k4);
        }
        if ((i & 16) == 0 || m60748k4(c14077m4.Clone(), c12909bgMo60033up.f43440du)) {
            return null;
        }
        return new XmlSchemaException("The Enumeration constraint failed.", C14113y2.f47374k4);
    }

    @Override // com.aspose.slides.internal.p532yu.AbstractC12942dc
    /* JADX INFO: renamed from: k4, reason: merged with bridge method [inline-methods] */
    public Exception mo60131x1(Object obj, AbstractC12892ae abstractC12892ae) {
        return mo60164k4(((C14077m4) C7019kk.m27464to(abstractC12892ae.mo60019dy().mo60513k4(obj, C7019kk.m27443k4((Class<?>) C14077m4.class)), C14077m4.class)).Clone().Clone(), abstractC12892ae);
    }

    /* JADX INFO: renamed from: k4 */
    private boolean m60748k4(C14077m4 c14077m4, ArrayList arrayList) {
        for (int i = 0; i < arrayList.size(); i++) {
            if (C14077m4.m66798k4(c14077m4.Clone(), ((C14077m4) C7019kk.m27464to(arrayList.get_Item(i), C14077m4.class)).Clone()) == 0) {
                return true;
            }
        }
        return false;
    }

    @Override // com.aspose.slides.internal.p532yu.AbstractC12942dc
    /* JADX INFO: renamed from: k4 */
    public boolean mo60130k4(Object obj, ArrayList arrayList, AbstractC12892ae abstractC12892ae) {
        return m60748k4(((C14077m4) C7019kk.m27464to(obj, C14077m4.class)).Clone(), arrayList);
    }
}
