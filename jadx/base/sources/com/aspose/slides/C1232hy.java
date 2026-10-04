package com.aspose.slides;

import com.aspose.slides.internal.p080dd.AbstractC3150x6;
import com.aspose.slides.internal.p080dd.C3152yj;
import com.aspose.slides.p559ms.System.C14080ne;
import com.aspose.slides.p559ms.System.C14113y2;
import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;

/* JADX INFO: renamed from: com.aspose.slides.hy */
/* JADX INFO: loaded from: classes3.dex */
class C1232hy {

    /* JADX INFO: renamed from: k4 */
    static final C1232hy f5593k4 = new C1232hy();

    /* JADX INFO: renamed from: k4 */
    public final AbstractC3150x6 m7328k4(String str) {
        int i = 5;
        while (i < str.length() && str.charAt(i) != ',' && str.charAt(i) != ';') {
            i++;
        }
        boolean z = false;
        while (i < str.length() && str.charAt(i) == ';') {
            do {
                i++;
                if (i >= str.length()) {
                    break;
                }
            } while (str.charAt(i) <= ' ');
            int i2 = i;
            while (i2 < str.length() && str.charAt(i2) != ',' && str.charAt(i2) != ';') {
                i2++;
            }
            int i3 = i2;
            while (i < i3 && str.charAt(i3 - 1) <= ' ') {
                i3--;
            }
            if ("base64".equals(C14113y2.m67368h4(C14113y2.m67443x1(str, i, i3 - i)))) {
                z = true;
            }
            i = i2;
        }
        if (i >= str.length() || str.charAt(i) != ',') {
            return null;
        }
        int i4 = i + 1;
        if (z) {
            return new C3152yj(C14080ne.m66934jd(C14113y2.m67422kk(str, i4)));
        }
        try {
            return new C3152yj(URLDecoder.decode(C14113y2.m67422kk(str, i4), "UTF-8").getBytes());
        } catch (UnsupportedEncodingException e) {
            throw new RuntimeException(e);
        }
    }

    /* JADX INFO: renamed from: k4 */
    public final String m7329k4(String str, String str2) {
        if (C14113y2.m67412k4(C14113y2.m67440x1(str2), "data:", (short) 3)) {
            return str2;
        }
        return null;
    }
}
