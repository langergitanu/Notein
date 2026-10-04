package com.aspose.slides;

import com.aspose.slides.internal.p294n9.AbstractC6747ar;
import com.aspose.slides.p559ms.System.C14113y2;

/* JADX INFO: renamed from: com.aspose.slides.xt */
/* JADX INFO: loaded from: classes3.dex */
class C14817xt {
    /* JADX INFO: renamed from: k4 */
    public static String m73603k4(byte[] bArr) {
        if (bArr == null) {
            throw new yii(C14113y2.m67402k4("In the '{0}' class was put a parameter '{1}' equal 'null'.", "BinaryHelper", "binaryData"));
        }
        try {
            return AbstractC6747ar.m26650yj().m26681x1(bArr);
        } catch (RuntimeException e) {
            throw new yii(C14113y2.m67402k4("Error during converting binary data to string. Details: {0}.", e.getMessage()), e);
        }
    }

    /* JADX INFO: renamed from: k4 */
    public static byte[] m73604k4(String str) {
        if (C14113y2.m67411k4(str)) {
            throw new yii(C14113y2.m67402k4("In the '{0}' class was put a parameter '{1}' equal 'null'.", "BinaryHelper", "text"));
        }
        try {
            return AbstractC6747ar.m26650yj().mo26677to(str);
        } catch (RuntimeException e) {
            throw new yii(C14113y2.m67402k4("Error during converting string to binary data. Details: {0}", e.getMessage()), e);
        }
    }
}
