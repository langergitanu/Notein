package com.aspose.slides.internal.p060ca;

import com.aspose.slides.internal.p294n9.C6765kp;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.p559ms.System.C14042ak;

/* JADX INFO: renamed from: com.aspose.slides.internal.ca.rq */
/* JADX INFO: loaded from: classes3.dex */
public class C2277rq {
    /* JADX INFO: renamed from: k4 */
    public static String m11348k4(C2033cj c2033cj) {
        C6765kp c6765kp = new C6765kp();
        c6765kp.m26796k4("Font Name: {0}", c2033cj.mo10137k4());
        c6765kp.m26796k4("Font Type: {0}", C14042ak.m66410k4(C2366xb.class, c2033cj.m10334x1()));
        if (c2033cj.m10333kk() == null || c2033cj.m10333kk().length <= 0) {
            c6765kp.m26796k4("Font File Definitions: not present", new Object[0]);
        } else {
            c6765kp.m26796k4("Font File Definitions:", new Object[0]);
            for (C2299sz c2299sz : c2033cj.m10333kk()) {
                c6765kp.m26796k4("File Name: {0}", c2299sz.m11427k4());
                c6765kp.m26796k4("File Extension: {0}", c2299sz.m11429x1());
                c6765kp.m26796k4("Stream Source Type: {0}", C7019kk.m27469x1(c2299sz.m11428kk(), C2405zd.class) ? "file" : "byte array");
            }
        }
        return c6765kp.toString();
    }
}
