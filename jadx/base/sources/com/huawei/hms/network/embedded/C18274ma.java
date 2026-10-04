package com.huawei.hms.network.embedded;

import java.util.Arrays;

/* JADX INFO: renamed from: com.huawei.hms.network.embedded.ma */
/* JADX INFO: loaded from: classes9.dex */
public final class C18274ma {

    /* JADX INFO: renamed from: c */
    public static final int f55712c = 65535;

    /* JADX INFO: renamed from: d */
    public static final int f55713d = 1;

    /* JADX INFO: renamed from: e */
    public static final int f55714e = 2;

    /* JADX INFO: renamed from: f */
    public static final int f55715f = 4;

    /* JADX INFO: renamed from: g */
    public static final int f55716g = 5;

    /* JADX INFO: renamed from: h */
    public static final int f55717h = 6;

    /* JADX INFO: renamed from: i */
    public static final int f55718i = 7;

    /* JADX INFO: renamed from: j */
    public static final int f55719j = 10;

    /* JADX INFO: renamed from: a */
    public int f55720a;

    /* JADX INFO: renamed from: b */
    public final int[] f55721b = new int[10];

    /* JADX INFO: renamed from: a */
    public int m79187a(int i) {
        return this.f55721b[i];
    }

    /* JADX INFO: renamed from: b */
    public int m79192b() {
        if ((this.f55720a & 2) != 0) {
            return this.f55721b[1];
        }
        return -1;
    }

    /* JADX INFO: renamed from: c */
    public int m79194c() {
        if ((this.f55720a & 128) != 0) {
            return this.f55721b[7];
        }
        return 65535;
    }

    /* JADX INFO: renamed from: d */
    public int m79196d() {
        return Integer.bitCount(this.f55720a);
    }

    /* JADX INFO: renamed from: e */
    public boolean m79198e(int i) {
        return ((1 << i) & this.f55720a) != 0;
    }

    /* JADX INFO: renamed from: a */
    public C18274ma m79188a(int i, int i2) {
        if (i >= 0) {
            int[] iArr = this.f55721b;
            if (i < iArr.length) {
                this.f55720a = (1 << i) | this.f55720a;
                iArr[i] = i2;
            }
        }
        return this;
    }

    /* JADX INFO: renamed from: b */
    public int m79193b(int i) {
        return (this.f55720a & 16) != 0 ? this.f55721b[4] : i;
    }

    /* JADX INFO: renamed from: c */
    public int m79195c(int i) {
        return (this.f55720a & 32) != 0 ? this.f55721b[5] : i;
    }

    /* JADX INFO: renamed from: d */
    public int m79197d(int i) {
        return (this.f55720a & 64) != 0 ? this.f55721b[6] : i;
    }

    /* JADX INFO: renamed from: a */
    public void m79189a() {
        this.f55720a = 0;
        Arrays.fill(this.f55721b, 0);
    }

    /* JADX INFO: renamed from: a */
    public void m79190a(C18274ma c18274ma) {
        for (int i = 0; i < 10; i++) {
            if (c18274ma.m79198e(i)) {
                m79188a(i, c18274ma.m79187a(i));
            }
        }
    }

    /* JADX INFO: renamed from: a */
    public boolean m79191a(boolean z) {
        return ((this.f55720a & 4) != 0 ? this.f55721b[2] : z ? 1 : 0) == 1;
    }
}
