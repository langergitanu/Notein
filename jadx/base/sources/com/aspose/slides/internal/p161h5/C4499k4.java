package com.aspose.slides.internal.p161h5;

import com.huawei.hms.network.embedded.C18177fb;
import com.microsoft.identity.common.java.eststelemetry.SchemaConstants;

/* JADX INFO: renamed from: com.aspose.slides.internal.h5.k4 */
/* JADX INFO: loaded from: classes.dex */
public final class C4499k4 {
    /* JADX INFO: renamed from: k4 */
    public static long m18555k4(long j, byte[] bArr, int i, int i2) {
        if (bArr == null) {
            return 1L;
        }
        long j2 = C18177fb.f54859s & j;
        long j3 = j >>> 16;
        while (i2 > 0) {
            int i3 = SchemaConstants.HEADER_DATA_LIMIT;
            if (3800 > i2) {
                i3 = i2;
            }
            i2 -= i3;
            while (true) {
                i3--;
                if (i3 >= 0) {
                    j2 += (long) (bArr[i] & 255);
                    j3 += j2;
                    i++;
                }
            }
            j2 %= 65521;
            j3 %= 65521;
        }
        return (j3 << 16) | j2;
    }
}
