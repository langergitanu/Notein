package com.aspose.slides.internal.p060ca;

import com.aspose.slides.exceptions.NotSupportedException;

/* JADX INFO: renamed from: com.aspose.slides.internal.ca.li */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC2177li {
    /* JADX INFO: renamed from: k4 */
    public static AbstractC2177li m11020k4(int i) {
        if (i == 1) {
            return new C2388yi();
        }
        if (i == 0) {
            return new C2284s2();
        }
        if (i == 2) {
            return new C2268qw();
        }
        throw new NotSupportedException();
    }

    /* JADX INFO: renamed from: k4 */
    public abstract AbstractC2313tw mo11021k4(C2033cj c2033cj);
}
