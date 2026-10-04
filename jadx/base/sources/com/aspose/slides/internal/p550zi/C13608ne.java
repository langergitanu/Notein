package com.aspose.slides.internal.p550zi;

import com.aspose.slides.internal.p314oc.C7019kk;

/* JADX INFO: renamed from: com.aspose.slides.internal.zi.ne */
/* JADX INFO: loaded from: classes5.dex */
public class C13608ne {
    /* JADX INFO: renamed from: k4 */
    public static long m62779k4(long j) {
        long jM27435du = 4 - C7019kk.m27435du(Long.valueOf(C7019kk.m27435du(Long.valueOf(j), 10) % 4), 10);
        if (C7019kk.m27435du(Long.valueOf(jM27435du), 10) == 4) {
            return j;
        }
        return C7019kk.m27435du(Long.valueOf(C7019kk.m27435du(Long.valueOf(jM27435du), 10) + C7019kk.m27435du(Long.valueOf(j), 10)), 10);
    }
}
