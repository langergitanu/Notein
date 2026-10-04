package com.aspose.slides.internal.p431ty;

import com.aspose.slides.internal.p060ca.C2033cj;
import com.aspose.slides.internal.p060ca.C2132iq;
import com.aspose.slides.internal.p060ca.C2284s2;
import com.aspose.slides.internal.p060ca.C2350wl;
import com.aspose.slides.p559ms.System.C14113y2;

/* JADX INFO: renamed from: com.aspose.slides.internal.ty.k4 */
/* JADX INFO: loaded from: classes4.dex */
public class C11240k4 {
    /* JADX INFO: renamed from: k4 */
    public static char m54217k4(int i) {
        char c = (char) i;
        return m54222x1(c) ? (char) (i - 61440) : c;
    }

    /* JADX INFO: renamed from: kk */
    public static char m54220kk(int i) {
        return (char) (i + 61440);
    }

    /* JADX INFO: renamed from: x1 */
    public static String m54221x1(String str) {
        return "Helv".equals(str) ? "Arial" : ("Tms Rmn".equals(str) || "MS Serif".equals(str)) ? "Times New Roman" : "MS Sans Serif".equals(str) ? "Microsoft Sans Serif" : "Courier".equals(str) ? "Courier New" : str;
    }

    /* JADX INFO: renamed from: k4 */
    public static boolean m54218k4(String str) {
        return C14113y2.m67364dy(str, "Symbol") >= 0 || C14113y2.m67364dy(str, "Webdings") >= 0 || C14113y2.m67364dy(str, "Wingdings") >= 0 || C14113y2.m67364dy(str, "Dingbats") >= 0;
    }

    /* JADX INFO: renamed from: x1 */
    public static boolean m54222x1(int i) {
        return i >= 61472 && i <= 61695;
    }

    /* JADX INFO: renamed from: k4 */
    public static byte[] m54219k4(byte[] bArr) {
        return ((C2350wl) ((C2132iq) ((C2132iq) new C2284s2().mo11021k4(new C2033cj(0, new C2350wl(bArr)))).m11471x1(0)).mo10259ck().m10333kk()[0].m11428kk()).m11604k4();
    }
}
