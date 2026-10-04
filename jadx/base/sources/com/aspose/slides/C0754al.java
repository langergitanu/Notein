package com.aspose.slides;

import com.aspose.slides.internal.p077d8.C3085sv;
import com.aspose.slides.internal.p080dd.C3141rv;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.p559ms.System.C14062gk;
import com.aspose.slides.p559ms.System.C14113y2;
import com.aspose.slides.p559ms.System.C14117yj;
import java.net.URI;
import java.net.URISyntaxException;

/* JADX INFO: renamed from: com.aspose.slides.al */
/* JADX INFO: loaded from: classes3.dex */
class C0754al {
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: k4 */
    public static <T> T m3657k4(Class<T> cls, InterfaceC14397rj interfaceC14397rj) {
        return interfaceC14397rj == 0 ? (T) C7019kk.m27467x1((Class) cls) : C7019kk.m27469x1(interfaceC14397rj, cls) ? interfaceC14397rj : (T) m3657k4(cls, interfaceC14397rj.getParent_Immediate());
    }

    /* JADX INFO: renamed from: x1 */
    private static boolean m3659x1(String str) {
        if (C14113y2.m67411k4(str)) {
            return false;
        }
        int i = 0;
        for (int i2 = 0; i2 < str.length(); i2++) {
            if (C14117yj.m67547x1(str.charAt(i2), ':') && (i = i + 1) > 1) {
                return false;
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: k4 */
    public static String m3658k4(String str) {
        C14062gk[] c14062gkArr = {null};
        boolean z = m3659x1(str) && C14062gk.m66650k4(str, 2, c14062gkArr);
        C14062gk c14062gk = c14062gkArr[0];
        if (z) {
            str = C3141rv.m13406kk(str);
        }
        c14062gkArr[0] = c14062gk;
        boolean zM66650k4 = C14062gk.m66650k4(str, 1, c14062gkArr);
        C14062gk c14062gk2 = c14062gkArr[0];
        if (!zM66650k4) {
            return str;
        }
        if (!C14113y2.m67411k4(c14062gk2.m66689ks())) {
            return C14113y2.m67363du("file", c14062gk2.m66689ks()) ? !C14113y2.m67448x1(str, "file") ? C14113y2.m67408k4("file:///", C14113y2.m67401k4(str, "%20", " ")) : C14113y2.m67401k4(str, "%20", " ") : str;
        }
        try {
            return C14062gk.m66638k4(new URI(C14062gk.f47220x1, C14062gk.m66672x1(c14062gk2).getSchemeSpecificPart(), C14062gk.m66672x1(c14062gk2).getFragment())).m66697x1();
        } catch (URISyntaxException e) {
            C3085sv.m13082k4(e);
            return c14062gk2.m66697x1();
        }
    }
}
