package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
final class zzYE {
    private int zzZCU;
    private int zzZCV;

    public zzYE(int i, int i2) {
        if (i < 0) {
            zzTl("page0");
        }
        if (i2 < 0) {
            zzTl("page1");
        }
        this.zzZCV = i;
        this.zzZCU = i2;
    }

    private static void zzTl(String str) {
        throw new IllegalArgumentException(com.alibaba.sdk.android.oss.internal.OooO00o.OooO00o("Page index is out of range.\r\nParameter name: ", str));
    }

    public final int zz9s() {
        return this.zzZCU;
    }

    public final int zz9t() {
        return this.zzZCV;
    }
}
