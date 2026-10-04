package com.aspose.slides.p559ms.System.Xml;

import com.huawei.hms.network.embedded.C18177fb;

/* JADX INFO: renamed from: com.aspose.slides.ms.System.Xml.m9 */
/* JADX INFO: loaded from: classes5.dex */
public class C13936m9 {
    /* JADX INFO: renamed from: k4 */
    public static int m65610k4(long j) {
        long j2 = (j & 1431655765) + (((j & 4294967295L) >> 1) & 1431655765);
        long j3 = (j2 & 858993459) + (858993459 & ((j2 & 4294967295L) >> 2));
        long j4 = (j3 & 252645135) + (252645135 & ((j3 & 4294967295L) >> 4));
        long j5 = (j4 & 16711935) + (16711935 & ((j4 & 4294967295L) >> 8));
        return (int) (((C18177fb.f54859s & j5) + (((j5 & 4294967295L) >> 16) & 4294967295L)) & 4294967295L);
    }

    /* JADX INFO: renamed from: x1 */
    public static int m65611x1(long j) {
        long j2 = j & 4294967295L;
        if (j2 == 0) {
            return 0;
        }
        return m65610k4((j ^ (j2 - 1)) & 4294967295L);
    }
}
