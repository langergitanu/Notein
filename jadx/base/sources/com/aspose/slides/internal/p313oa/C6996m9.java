package com.aspose.slides.internal.p313oa;

import com.aspose.slides.exceptions.NotSupportedException;

/* JADX INFO: renamed from: com.aspose.slides.internal.oa.m9 */
/* JADX INFO: loaded from: classes4.dex */
class C6996m9 {
    /* JADX INFO: renamed from: k4 */
    public static C6985du m27375k4(byte b, byte b2, byte b3, byte b4) {
        if (b == 3) {
            return new C6985du(b, b2, b3, b4);
        }
        if (b == 4) {
            return new C6989h4(b, b2, b3, b4);
        }
        throw new NotSupportedException("Only 3D and 4D CLUT are supported");
    }
}
