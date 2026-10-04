package com.huawei.hms.drive;

import java.util.Arrays;

/* JADX INFO: renamed from: com.huawei.hms.drive.de */
/* JADX INFO: loaded from: classes6.dex */
public final class C17849de {

    /* JADX INFO: renamed from: a */
    private int f53355a;

    /* JADX INFO: renamed from: b */
    private final int[] f53356b = new int[10];

    /* JADX INFO: renamed from: a */
    public void m76705a() {
        this.f53355a = 0;
        Arrays.fill(this.f53356b, 0);
    }

    /* JADX INFO: renamed from: b */
    public int m76709b(int i) {
        return this.f53356b[i];
    }

    /* JADX INFO: renamed from: c */
    public int m76710c() {
        if ((this.f53355a & 2) != 0) {
            return this.f53356b[1];
        }
        return -1;
    }

    /* JADX INFO: renamed from: d */
    public int m76713d(int i) {
        return (this.f53355a & 32) != 0 ? this.f53356b[5] : i;
    }

    /* JADX INFO: renamed from: b */
    public int m76708b() {
        return Integer.bitCount(this.f53355a);
    }

    /* JADX INFO: renamed from: c */
    public int m76711c(int i) {
        return (this.f53355a & 16) != 0 ? this.f53356b[4] : i;
    }

    /* JADX INFO: renamed from: d */
    public int m76712d() {
        if ((this.f53355a & 128) != 0) {
            return this.f53356b[7];
        }
        return 65535;
    }

    /* JADX INFO: renamed from: a */
    public C17849de m76704a(int i, int i2) {
        if (i >= 0) {
            int[] iArr = this.f53356b;
            if (i < iArr.length) {
                this.f53355a = (1 << i) | this.f53355a;
                iArr[i] = i2;
            }
        }
        return this;
    }

    /* JADX INFO: renamed from: a */
    public boolean m76707a(int i) {
        return ((1 << i) & this.f53355a) != 0;
    }

    /* JADX INFO: renamed from: a */
    public void m76706a(C17849de c17849de) {
        for (int i = 0; i < 10; i++) {
            if (c17849de.m76707a(i)) {
                m76704a(i, c17849de.m76709b(i));
            }
        }
    }
}
