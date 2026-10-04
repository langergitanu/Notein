package com.aspose.slides.internal.p089dp;

import com.aspose.slides.internal.p314oc.C7016dy;

/* JADX INFO: renamed from: com.aspose.slides.internal.dp.k4 */
/* JADX INFO: loaded from: classes3.dex */
public class C3209k4 {

    /* JADX INFO: renamed from: to */
    private static final C7016dy<C3209k4> f9593to = new C7016dy<>(null);

    /* JADX INFO: renamed from: k4 */
    private final byte[] f9594k4;

    /* JADX INFO: renamed from: kk */
    private int f9595kk;

    /* JADX INFO: renamed from: x1 */
    private final byte[] f9596x1;

    private C3209k4(int i, int i2) {
        this.f9594k4 = new byte[i];
        this.f9596x1 = new byte[i2];
    }

    /* JADX INFO: renamed from: k4 */
    public static C3209k4 m13903k4(int i, int i2) {
        C7016dy<C3209k4> c7016dy = f9593to;
        if (c7016dy.get() == null) {
            c7016dy.set(new C3209k4(i, i2));
        }
        return c7016dy.get();
    }

    /* JADX INFO: renamed from: k4 */
    public final void m13904k4(int i) {
        this.f9595kk = i;
    }
}
