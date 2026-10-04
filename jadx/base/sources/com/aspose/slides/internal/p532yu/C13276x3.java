package com.aspose.slides.internal.p532yu;

import com.aspose.slides.Collections.ArrayList;
import com.aspose.slides.exceptions.Exception;
import com.aspose.slides.exceptions.XmlSchemaException;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.p559ms.System.AbstractC14092to;
import com.aspose.slides.p559ms.System.C14113y2;

/* JADX INFO: renamed from: com.aspose.slides.internal.yu.x3 */
/* JADX INFO: loaded from: classes5.dex */
public class C13276x3 extends AbstractC12942dc {
    @Override // com.aspose.slides.internal.p532yu.AbstractC12942dc
    /* JADX INFO: renamed from: k4, reason: merged with bridge method [inline-methods] */
    public Exception mo60131x1(Object obj, AbstractC12892ae abstractC12892ae) {
        AbstractC14092to abstractC14092to = (AbstractC14092to) C7019kk.m27452k4(obj, AbstractC14092to.class);
        C12909bg c12909bgMo60033up = abstractC12892ae.mo60033up();
        int i = c12909bgMo60033up != null ? c12909bgMo60033up.f43449up : 0;
        if ((i & 7) != 0) {
            int iM67265du = abstractC14092to.m67265du();
            if ((i & 1) != 0 && c12909bgMo60033up.f43445k4 != iM67265du) {
                return new XmlSchemaException("The actual length is not equal to the specified length.", C14113y2.f47374k4);
            }
            if ((i & 2) != 0 && iM67265du < c12909bgMo60033up.f43450x1) {
                return new XmlSchemaException("The actual length is less than the MinLength value.", C14113y2.f47374k4);
            }
            if ((i & 4) != 0 && c12909bgMo60033up.f43446kk < iM67265du) {
                return new XmlSchemaException("The actual length is greater than the MaxLength value.", C14113y2.f47374k4);
            }
        }
        if ((i & 16) == 0 || mo60130k4(obj, c12909bgMo60033up.f43440du, abstractC12892ae)) {
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
