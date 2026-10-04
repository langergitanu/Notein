package com.aspose.slides.internal.p430tx;

import com.aspose.slides.exceptions.XsltException;
import com.aspose.slides.p559ms.System.C14113y2;
import com.aspose.slides.p559ms.System.Xml.C13988u1;

/* JADX INFO: renamed from: com.aspose.slides.internal.tx.f9 */
/* JADX INFO: loaded from: classes4.dex */
public final class C11184f9 {

    /* JADX INFO: renamed from: k4 */
    public String f38507k4;

    /* JADX INFO: renamed from: kk */
    public String f38508kk;

    /* JADX INFO: renamed from: x1 */
    public String f38509x1;

    /* JADX INFO: renamed from: x1 */
    public static boolean m53725x1(String str) {
        return str.length() != 0 && C13988u1.m66230to(str, 0) == str.length();
    }

    /* JADX INFO: renamed from: k4 */
    public final void m53726k4() {
        this.f38507k4 = C14113y2.f47374k4;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m53727k4(String str) {
        String[] strArr = {this.f38507k4};
        String[] strArr2 = {this.f38509x1};
        m53724k4(str, strArr, strArr2);
        this.f38507k4 = strArr[0];
        this.f38509x1 = strArr2[0];
    }

    /* JADX INFO: renamed from: k4 */
    public static void m53724k4(String str, String[] strArr, String[] strArr2) {
        String str2 = C14113y2.f47374k4;
        strArr[0] = str2;
        strArr2[0] = str2;
        int iM66231x1 = C13988u1.m66231x1(str);
        if (iM66231x1 == 0) {
            throw XsltException.create("'{0}' is an invalid QName.", str);
        }
        strArr2[0] = C14113y2.m67443x1(str, 0, iM66231x1);
        if (iM66231x1 < str.length()) {
            if (str.charAt(iM66231x1) == ':') {
                int i = iM66231x1 + 1;
                strArr[0] = strArr2[0];
                int iM66230to = C13988u1.m66230to(str, i);
                int i2 = i + iM66230to;
                if (iM66230to == 0) {
                    throw XsltException.create("'{0}' is an invalid QName.", str);
                }
                strArr2[0] = C14113y2.m67443x1(str, i, iM66230to);
                iM66231x1 = i2;
            }
            if (iM66231x1 < str.length()) {
                throw XsltException.create("'{0}' is an invalid QName.", str);
            }
        }
    }
}
