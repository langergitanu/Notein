package com.aspose.slides.internal.p532yu;

import com.aspose.slides.Collections.ArrayList;
import com.aspose.slides.exceptions.Exception;
import com.aspose.slides.exceptions.XmlSchemaException;
import com.aspose.slides.internal.p492x4.C12380dy;
import com.aspose.slides.p559ms.System.C14062gk;
import com.aspose.slides.p559ms.System.C14113y2;
import com.aspose.slides.p559ms.System.Xml.C13850af;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: renamed from: com.aspose.slides.internal.yu.o3 */
/* JADX INFO: loaded from: classes5.dex */
public class C13133o3 extends AbstractC12942dc {

    /* JADX INFO: renamed from: k4 */
    private static AtomicReference<C12380dy> f44186k4 = new AtomicReference<>();

    @Override // com.aspose.slides.internal.p532yu.AbstractC12942dc
    /* JADX INFO: renamed from: k4, reason: merged with bridge method [inline-methods] */
    public Exception mo60131x1(Object obj, AbstractC12892ae abstractC12892ae) {
        return m61347k4(abstractC12892ae.mo60019dy().mo60490c5(obj), abstractC12892ae, true);
    }

    @Override // com.aspose.slides.internal.p532yu.AbstractC12942dc
    /* JADX INFO: renamed from: x1, reason: merged with bridge method [inline-methods] */
    public Exception mo60171k4(String str, AbstractC12892ae abstractC12892ae) {
        return m61347k4(str, abstractC12892ae, true);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX INFO: renamed from: k4 */
    private Exception m61343k4(String str, int i, boolean z) {
        if (i != 28) {
            switch (i) {
                case 31:
                    return C13850af.m65071dy(str);
                case 32:
                    return C13850af.m65073h4(str);
                case 33:
                    if (str == null || str.length() == 0) {
                        return new XmlSchemaException("The attribute value cannot be empty.", C14113y2.f47374k4);
                    }
                    if (!m61344k4().m57988to(str)) {
                        return new XmlSchemaException("'{0}' is an invalid language identifier.", C14113y2.f47374k4);
                    }
                    break;
                case 34:
                    return C13850af.m65123m9(str);
                case 35:
                    return C13850af.m65139x1(str);
                case 36:
                case 37:
                case 38:
                case 39:
                    return C13850af.m65128to(str);
            }
        } else if (z) {
            return C13850af.m65093k4(str, new C14062gk[]{null});
        }
        return null;
    }

    /* JADX INFO: renamed from: k4 */
    public final Exception m61347k4(String str, AbstractC12892ae abstractC12892ae, boolean z) {
        int length = str.length();
        C12909bg c12909bgMo60033up = abstractC12892ae.mo60033up();
        int i = c12909bgMo60033up != null ? c12909bgMo60033up.f43449up : 0;
        Exception exceptionM61343k4 = m61343k4(str, abstractC12892ae.mo60020fa(), z);
        if (exceptionM61343k4 != null) {
            return exceptionM61343k4;
        }
        if (i == 0) {
            return null;
        }
        if ((i & 1) != 0 && c12909bgMo60033up.f43445k4 != length) {
            return new XmlSchemaException("The actual length is not equal to the specified length.", C14113y2.f47374k4);
        }
        if ((i & 2) != 0 && length < c12909bgMo60033up.f43450x1) {
            return new XmlSchemaException("The actual length is less than the MinLength value.", C14113y2.f47374k4);
        }
        if ((i & 4) != 0 && c12909bgMo60033up.f43446kk < length) {
            return new XmlSchemaException("The actual length is greater than the MaxLength value.", C14113y2.f47374k4);
        }
        if ((i & 16) == 0 || m61345k4(str, c12909bgMo60033up.f43440du, abstractC12892ae)) {
            return null;
        }
        return new XmlSchemaException("The Enumeration constraint failed.", C14113y2.f47374k4);
    }

    /* JADX INFO: renamed from: k4 */
    private static C12380dy m61344k4() {
        if (f44186k4.get() == null) {
            f44186k4.set(new C12380dy("^([a-zA-Z]{1,8})(-[a-zA-Z0-9]{1,8})*$", 0));
        }
        return f44186k4.get();
    }

    @Override // com.aspose.slides.internal.p532yu.AbstractC12942dc
    /* JADX INFO: renamed from: k4 */
    public boolean mo60130k4(Object obj, ArrayList arrayList, AbstractC12892ae abstractC12892ae) {
        return m61345k4(abstractC12892ae.mo60019dy().mo60490c5(obj), arrayList, abstractC12892ae);
    }

    /* JADX INFO: renamed from: k4 */
    private boolean m61345k4(String str, ArrayList arrayList, AbstractC12892ae abstractC12892ae) {
        if (abstractC12892ae.mo60020fa() == 28) {
            for (int i = 0; i < arrayList.size(); i++) {
                if (C14113y2.m67363du(str, ((C14062gk) arrayList.get_Item(i)).m66694u4())) {
                    return true;
                }
            }
        } else {
            for (int i2 = 0; i2 < arrayList.size(); i2++) {
                if (C14113y2.m67363du(str, (String) arrayList.get_Item(i2))) {
                    return true;
                }
            }
        }
        return false;
    }
}
