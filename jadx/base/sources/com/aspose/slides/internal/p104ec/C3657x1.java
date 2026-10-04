package com.aspose.slides.internal.p104ec;

import com.aspose.slides.exceptions.ArgumentNullException;
import com.aspose.slides.internal.p080dd.C3149x1;
import com.aspose.slides.internal.p294n9.AbstractC6747ar;
import com.aspose.slides.internal.p505xn.C12555c5;

/* JADX INFO: renamed from: com.aspose.slides.internal.ec.x1 */
/* JADX INFO: loaded from: classes3.dex */
class C3657x1 {
    /* JADX INFO: renamed from: k4 */
    public static void m14835k4(C3149x1 c3149x1, String str, int i) {
        if (c3149x1 == null) {
            throw new ArgumentNullException("writer");
        }
        if (str == null) {
            throw new ArgumentNullException("value");
        }
        m14836k4(c3149x1, str, C12555c5.m58552k4(i));
    }

    /* JADX INFO: renamed from: x1 */
    public static void m14837x1(C3149x1 c3149x1, String str, int i) {
        if (c3149x1 == null) {
            throw new ArgumentNullException("writer");
        }
        if (str == null) {
            throw new ArgumentNullException("value");
        }
        m14838x1(c3149x1, str, C12555c5.m58552k4(i));
    }

    /* JADX INFO: renamed from: k4 */
    public static void m14836k4(C3149x1 c3149x1, String str, AbstractC6747ar abstractC6747ar) {
        if (c3149x1 == null) {
            throw new ArgumentNullException("writer");
        }
        if (str == null) {
            throw new ArgumentNullException("value");
        }
        if (abstractC6747ar == null) {
            throw new ArgumentNullException("encoding");
        }
        byte[] bArrMo26677to = abstractC6747ar.mo26677to(str);
        if (bArrMo26677to.length > 0) {
            c3149x1.m13450k4(bArrMo26677to);
        }
    }

    /* JADX INFO: renamed from: x1 */
    public static void m14838x1(C3149x1 c3149x1, String str, AbstractC6747ar abstractC6747ar) {
        if (c3149x1 == null) {
            throw new ArgumentNullException("writer");
        }
        if (str == null) {
            throw new ArgumentNullException("value");
        }
        if (abstractC6747ar == null) {
            throw new ArgumentNullException("encoding");
        }
        byte[] bArrMo26677to = abstractC6747ar.mo26677to(str);
        c3149x1.m13447k4(((long) bArrMo26677to.length) & 4294967295L);
        if (bArrMo26677to.length > 0) {
            c3149x1.m13450k4(bArrMo26677to);
        }
    }
}
