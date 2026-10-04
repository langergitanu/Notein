package com.aspose.slides.internal.p532yu;

import com.aspose.slides.Collections.ArrayList;
import com.aspose.slides.exceptions.XmlSchemaException;
import com.aspose.slides.internal.p229ki.AbstractC5746v4;
import com.aspose.slides.internal.p229ki.C5698gf;
import com.aspose.slides.internal.p229ki.C5740u1;
import com.aspose.slides.p559ms.System.C14113y2;
import com.aspose.slides.p559ms.System.Xml.C13950o3;

/* JADX INFO: renamed from: com.aspose.slides.internal.yu.kk */
/* JADX INFO: loaded from: classes5.dex */
public class C13068kk {

    /* JADX INFO: renamed from: k4 */
    private ArrayList f44044k4;

    /* JADX INFO: renamed from: kk */
    private boolean f44045kk;

    /* JADX INFO: renamed from: to */
    private C13950o3 f44046to;

    /* JADX INFO: renamed from: x1 */
    private String f44047x1;

    public C13068kk(String str, boolean z, C13950o3 c13950o3) {
        this.f44047x1 = str;
        this.f44045kk = z;
        this.f44046to = c13950o3;
        m61060k4(str, z, c13950o3);
    }

    /* JADX INFO: renamed from: kk */
    private static boolean m61056kk(C5740u1 c5740u1) {
        return c5740u1.m23348m9() == 3 && c5740u1.m23344h4() == 1;
    }

    /* JADX INFO: renamed from: to */
    private static boolean m61057to(C5740u1 c5740u1) {
        return c5740u1.m23348m9() == 5 && c5740u1.m23344h4() == 9 && c5740u1.m23343dy();
    }

    /* JADX INFO: renamed from: x1 */
    public static boolean m61058x1(C5740u1 c5740u1) {
        return c5740u1.m23348m9() == 12 && c5740u1.m23344h4() == 9 && c5740u1.m23343dy();
    }

    /* JADX INFO: renamed from: k4 */
    public final ArrayList m61059k4() {
        return this.f44044k4;
    }

    /* JADX INFO: renamed from: k4 */
    private void m61054k4(C5740u1 c5740u1, C13950o3 c13950o3) {
        if (c5740u1.m23349to().length() == 0) {
            c5740u1.m23346k4(c5740u1.m23342du().length() != 0 ? null : "");
            return;
        }
        c5740u1.m23346k4(c13950o3.mo13292k4(c5740u1.m23349to()));
        if (c5740u1.m23341c5() == null) {
            throw new XmlSchemaException("The prefix '{0}' in XPath cannot be resolved.", c5740u1.m23349to());
        }
    }

    /* JADX INFO: renamed from: k4 */
    public final void m61060k4(String str, boolean z, C13950o3 c13950o3) {
        C5740u1 c5740u1;
        C5740u1 c5740u12;
        ArrayList arrayList;
        C12939d4 c12939d4;
        ArrayList arrayList2;
        C12939d4 c12939d42;
        if (str == null || str.length() == 0) {
            throw new XmlSchemaException("The XPath for selector or field cannot be empty.", C14113y2.f47374k4);
        }
        String[] strArrM67414k4 = C14113y2.m67414k4(str, '|');
        ArrayList arrayList3 = new ArrayList(strArrM67414k4.length);
        this.f44044k4 = new ArrayList(strArrM67414k4.length);
        for (String str2 : strArrM67414k4) {
            try {
                arrayList3.addItem((C5740u1) C5698gf.m23248k4(str2));
            } catch (RuntimeException unused) {
                throw new XmlSchemaException("'{0}' is an invalid XPath for selector or field.", str);
            }
        }
        for (int i = 0; i < arrayList3.size(); i++) {
            C5740u1 c5740u13 = (C5740u1) arrayList3.get_Item(i);
            if (c5740u13 == null) {
                throw new XmlSchemaException("'{0}' is an invalid XPath for selector or field.", str);
            }
            if (!m61055k4(c5740u13)) {
                c5740u1 = c5740u13;
                c5740u12 = c5740u1;
            } else {
                if (!z) {
                    throw new XmlSchemaException("'{0}' is an invalid XPath for selector. Selector cannot have an XPath selection with an attribute node.", str);
                }
                m61054k4(c5740u13, c13950o3);
                try {
                    c5740u1 = (C5740u1) c5740u13.m23347kk();
                    c5740u12 = c5740u13;
                } catch (RuntimeException unused2) {
                    throw new XmlSchemaException("'{0}' is an invalid XPath for selector or field.", str);
                }
            }
            while (c5740u1 != null && (m61056kk(c5740u1) || m61058x1(c5740u1))) {
                if (!m61058x1(c5740u1) || c5740u13 == c5740u1) {
                    if (m61056kk(c5740u1)) {
                        m61054k4(c5740u1, c13950o3);
                    }
                    c5740u12 = c5740u1;
                } else {
                    c5740u12.m23345k4(c5740u1.m23347kk());
                }
                try {
                    c5740u1 = (C5740u1) c5740u1.m23347kk();
                } catch (RuntimeException unused3) {
                    throw new XmlSchemaException("'{0}' is an invalid XPath for selector or field.", str);
                }
            }
            c5740u12.m23345k4((AbstractC5746v4) null);
            if (c5740u1 == null) {
                if (!m61058x1(c5740u13) || c5740u13.m23347kk() == null) {
                    arrayList2 = this.f44044k4;
                    c12939d42 = new C12939d4(C12902b1.m60054x1(c5740u13), false);
                } else {
                    arrayList2 = this.f44044k4;
                    c12939d42 = new C12939d4(C12902b1.m60054x1((C5740u1) c5740u13.m23347kk()), false);
                }
                arrayList2.addItem(c12939d42);
            } else if (m61057to(c5740u1)) {
                try {
                    C5740u1 c5740u14 = (C5740u1) c5740u1.m23347kk();
                    if (c5740u14 == null || !m61058x1(c5740u14) || c5740u14.m23347kk() != null) {
                        throw new XmlSchemaException("'{0}' is an invalid XPath for selector or field.", str);
                    }
                    if (!m61058x1(c5740u13) || c5740u13.m23347kk() == null) {
                        arrayList = this.f44044k4;
                        c12939d4 = new C12939d4(C12902b1.m60054x1(c5740u13), true);
                    } else {
                        arrayList = this.f44044k4;
                        c12939d4 = new C12939d4(C12902b1.m60054x1((C5740u1) c5740u13.m23347kk()), true);
                    }
                    arrayList.addItem(c12939d4);
                } catch (RuntimeException unused4) {
                    throw new XmlSchemaException("'{0}' is an invalid XPath for selector or field.", str);
                }
            } else {
                throw new XmlSchemaException("'{0}' is an invalid XPath for selector or field.", str);
            }
        }
    }

    /* JADX INFO: renamed from: k4 */
    public static boolean m61055k4(C5740u1 c5740u1) {
        return c5740u1.m23348m9() == 2 && c5740u1.m23344h4() == 2;
    }
}
