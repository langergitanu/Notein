package com.aspose.slides.p559ms.System.Xml;

import com.aspose.slides.internal.p532yu.InterfaceC13298y4;
import com.aspose.slides.p559ms.System.C14113y2;

/* JADX INFO: renamed from: com.aspose.slides.ms.System.Xml.v4 */
/* JADX INFO: loaded from: classes5.dex */
public class C13998v4 {

    /* JADX INFO: renamed from: du */
    private AbstractC13883dt f47039du;

    /* JADX INFO: renamed from: k4 */
    private C14023y6[] f47040k4 = new C14023y6[64];

    /* JADX INFO: renamed from: kk */
    private int f47041kk = 63;

    /* JADX INFO: renamed from: to */
    private XmlDocument f47042to;

    /* JADX INFO: renamed from: x1 */
    private int f47043x1;

    public C13998v4(XmlDocument xmlDocument) {
        this.f47042to = xmlDocument;
        this.f47039du = xmlDocument.getNameTable();
    }

    /* JADX INFO: renamed from: k4 */
    public final C14023y6 m66275k4(String str, String str2, String str3, InterfaceC13298y4 interfaceC13298y4) {
        if (str == null) {
            str = C14113y2.f47374k4;
        }
        if (str3 == null) {
            str3 = C14113y2.f47374k4;
        }
        int iM66343k4 = C14023y6.m66343k4(str2);
        for (C14023y6 c14023y6 = this.f47040k4[this.f47041kk & iM66343k4]; c14023y6 != null; c14023y6 = c14023y6.f47106x1) {
            if (c14023y6.hashCode() == iM66343k4 && ((c14023y6.m66347dy() == str2 || C14113y2.m67363du(c14023y6.m66347dy(), str2)) && ((c14023y6.m66349jd() == str || C14113y2.m67363du(c14023y6.m66349jd(), str)) && ((c14023y6.m66345c5() == str3 || C14113y2.m67363du(c14023y6.m66345c5(), str3)) && c14023y6.mo65494k4(interfaceC13298y4))))) {
                return c14023y6;
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: x1 */
    public final C14023y6 m66276x1(String str, String str2, String str3, InterfaceC13298y4 interfaceC13298y4) {
        if (str == null) {
            str = C14113y2.f47374k4;
        }
        if (str3 == null) {
            str3 = C14113y2.f47374k4;
        }
        int iM66343k4 = C14023y6.m66343k4(str2);
        for (C14023y6 c14023y6 = this.f47040k4[this.f47041kk & iM66343k4]; c14023y6 != null; c14023y6 = c14023y6.f47106x1) {
            if (c14023y6.hashCode() == iM66343k4 && ((c14023y6.m66347dy() == str2 || C14113y2.m67363du(c14023y6.m66347dy(), str2)) && ((c14023y6.m66349jd() == str || C14113y2.m67363du(c14023y6.m66349jd(), str)) && ((c14023y6.m66345c5() == str3 || C14113y2.m67363du(c14023y6.m66345c5(), str3)) && c14023y6.mo65494k4(interfaceC13298y4))))) {
                return c14023y6;
            }
        }
        String strMo65266k4 = this.f47039du.mo65266k4(str);
        String strMo65266k42 = this.f47039du.mo65266k4(str2);
        String strMo65266k43 = this.f47039du.mo65266k4(str3);
        int i = this.f47041kk & iM66343k4;
        C14023y6 c14023y6M66344k4 = C14023y6.m66344k4(strMo65266k4, strMo65266k42, strMo65266k43, iM66343k4, this.f47042to, this.f47040k4[i], interfaceC13298y4);
        this.f47040k4[i] = c14023y6M66344k4;
        int i2 = this.f47043x1;
        this.f47043x1 = i2 + 1;
        if (i2 == this.f47041kk) {
            m66274k4();
        }
        return c14023y6M66344k4;
    }

    /* JADX INFO: renamed from: k4 */
    private void m66274k4() {
        int i = this.f47041kk * 2;
        int i2 = i + 1;
        C14023y6[] c14023y6Arr = new C14023y6[i + 2];
        for (C14023y6 c14023y6 : this.f47040k4) {
            while (c14023y6 != null) {
                int iHashCode = c14023y6.hashCode() & i2;
                C14023y6 c14023y62 = c14023y6.f47106x1;
                c14023y6.f47106x1 = c14023y6Arr[iHashCode];
                c14023y6Arr[iHashCode] = c14023y6;
                c14023y6 = c14023y62;
            }
        }
        this.f47040k4 = c14023y6Arr;
        this.f47041kk = i2;
    }
}
