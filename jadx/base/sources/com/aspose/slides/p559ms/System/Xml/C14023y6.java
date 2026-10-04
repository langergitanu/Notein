package com.aspose.slides.p559ms.System.Xml;

import com.aspose.slides.internal.p532yu.C12943dd;
import com.aspose.slides.internal.p532yu.C13021hu;
import com.aspose.slides.internal.p532yu.C13146p4;
import com.aspose.slides.internal.p532yu.C13164q9;
import com.aspose.slides.internal.p532yu.InterfaceC13298y4;
import com.aspose.slides.p559ms.System.C14113y2;
import com.huawei.hms.network.embedded.C18241k5;

/* JADX INFO: renamed from: com.aspose.slides.ms.System.Xml.y6 */
/* JADX INFO: loaded from: classes5.dex */
public class C14023y6 implements InterfaceC13298y4 {

    /* JADX INFO: renamed from: du */
    private String f47100du;

    /* JADX INFO: renamed from: h4 */
    private String f47101h4 = null;

    /* JADX INFO: renamed from: k4 */
    public XmlDocument f47102k4;

    /* JADX INFO: renamed from: kk */
    private String f47103kk;

    /* JADX INFO: renamed from: m9 */
    private int f47104m9;

    /* JADX INFO: renamed from: to */
    private String f47105to;

    /* JADX INFO: renamed from: x1 */
    public C14023y6 f47106x1;

    public C14023y6(String str, String str2, String str3, int i, XmlDocument xmlDocument, C14023y6 c14023y6) {
        this.f47103kk = str;
        this.f47105to = str2;
        this.f47100du = str3;
        this.f47104m9 = i;
        this.f47102k4 = xmlDocument;
        this.f47106x1 = c14023y6;
    }

    /* JADX INFO: renamed from: k4 */
    public static int m66343k4(String str) {
        int i = 0;
        if (str == null) {
            return 0;
        }
        for (int length = str.length() - 1; length >= 0; length--) {
            char cCharAt = str.charAt(length);
            if (cCharAt == ':') {
                break;
            }
            i += cCharAt ^ (i << 7);
        }
        int i2 = i - (i >> 17);
        int i3 = i2 - (i2 >> 11);
        return i3 - (i3 >> 5);
    }

    @Override // com.aspose.slides.internal.p532yu.InterfaceC13298y4
    public boolean aj_() {
        return false;
    }

    @Override // com.aspose.slides.internal.p532yu.InterfaceC13298y4
    public int ak_() {
        return 0;
    }

    @Override // com.aspose.slides.internal.p532yu.InterfaceC13298y4
    public C13164q9 al_() {
        return null;
    }

    @Override // com.aspose.slides.internal.p532yu.InterfaceC13298y4
    public C12943dd am_() {
        return null;
    }

    @Override // com.aspose.slides.internal.p532yu.InterfaceC13298y4
    public C13021hu an_() {
        return null;
    }

    @Override // com.aspose.slides.internal.p532yu.InterfaceC13298y4
    public C13146p4 ao_() {
        return null;
    }

    /* JADX INFO: renamed from: c5 */
    public final String m66345c5() {
        return this.f47100du;
    }

    /* JADX INFO: renamed from: ck */
    public final XmlDocument m66346ck() {
        return this.f47102k4;
    }

    /* JADX INFO: renamed from: dy */
    public final String m66347dy() {
        return this.f47105to;
    }

    /* JADX INFO: renamed from: fa */
    public final String m66348fa() {
        String str;
        if (this.f47101h4 == null) {
            if (this.f47103kk.length() <= 0) {
                str = this.f47105to;
            } else if (this.f47105to.length() > 0) {
                String strM67408k4 = C14113y2.m67408k4(this.f47103kk, C18241k5.f55433h, this.f47105to);
                synchronized (this.f47102k4.getNameTable()) {
                    try {
                        if (this.f47101h4 == null) {
                            this.f47101h4 = this.f47102k4.getNameTable().mo65266k4(strM67408k4);
                        }
                    } finally {
                    }
                }
            } else {
                str = this.f47103kk;
            }
            this.f47101h4 = str;
        }
        return this.f47101h4;
    }

    public final int hashCode() {
        return this.f47104m9;
    }

    /* JADX INFO: renamed from: jd */
    public final String m66349jd() {
        return this.f47103kk;
    }

    @Override // com.aspose.slides.internal.p532yu.InterfaceC13298y4
    /* JADX INFO: renamed from: x1 */
    public boolean mo61763x1() {
        return false;
    }

    /* JADX INFO: renamed from: k4 */
    public static C14023y6 m66344k4(String str, String str2, String str3, int i, XmlDocument xmlDocument, C14023y6 c14023y6, InterfaceC13298y4 interfaceC13298y4) {
        return interfaceC13298y4 == null ? new C14023y6(str, str2, str3, i, xmlDocument, c14023y6) : new C13920jm(str, str2, str3, i, xmlDocument, c14023y6, interfaceC13298y4);
    }

    /* JADX INFO: renamed from: k4 */
    public boolean mo65494k4(InterfaceC13298y4 interfaceC13298y4) {
        return interfaceC13298y4 == null;
    }
}
