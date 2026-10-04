package com.aspose.slides.internal.p060ca;

import com.aspose.slides.exceptions.ArgumentException;
import com.aspose.slides.internal.p314oc.C7019kk;

/* JADX INFO: renamed from: com.aspose.slides.internal.ca.x6 */
/* JADX INFO: loaded from: classes3.dex */
class C2364x6 {

    /* JADX INFO: renamed from: k4 */
    private int f8206k4;

    /* JADX INFO: renamed from: x1 */
    private byte[] f8207x1;

    public C2364x6(byte[] bArr) {
        this.f8207x1 = bArr;
    }

    /* JADX INFO: renamed from: du */
    public final int m11667du() {
        int iM27462to = (C7019kk.m27462to(Byte.valueOf(this.f8207x1[this.f8206k4]), 6) << 24) | (C7019kk.m27462to(Byte.valueOf(this.f8207x1[this.f8206k4 + 1]), 6) << 16) | (C7019kk.m27462to(Byte.valueOf(this.f8207x1[this.f8206k4 + 2]), 6) << 8) | C7019kk.m27462to(Byte.valueOf(this.f8207x1[this.f8206k4 + 3]), 6);
        this.f8206k4 += 4;
        return iM27462to;
    }

    /* JADX INFO: renamed from: dy */
    public final byte m11668dy() {
        byte[] bArr = this.f8207x1;
        int i = this.f8206k4;
        byte b = bArr[i];
        this.f8206k4 = i + 1;
        return b;
    }

    /* JADX INFO: renamed from: h4 */
    public final int m11669h4() {
        int iM27457kk = C7019kk.m27457kk(Integer.valueOf((C7019kk.m27462to(Byte.valueOf(this.f8207x1[this.f8206k4]), 6) << 8) | C7019kk.m27462to(Byte.valueOf(this.f8207x1[this.f8206k4 + 1]), 6)), 9);
        this.f8206k4 += 2;
        return iM27457kk;
    }

    /* JADX INFO: renamed from: k4 */
    public final int m11670k4() {
        return this.f8206k4;
    }

    /* JADX INFO: renamed from: kk */
    public final long m11672kk() {
        return C7019kk.m27438h4(Long.valueOf(m11674to()), 10) | (C7019kk.m27438h4(Long.valueOf(m11674to()), 10) << 32);
    }

    /* JADX INFO: renamed from: m9 */
    public final short m11673m9() {
        short sM27462to = (short) ((C7019kk.m27462to(Byte.valueOf(this.f8207x1[this.f8206k4]), 6) << 8) | C7019kk.m27462to(Byte.valueOf(this.f8207x1[this.f8206k4 + 1]), 6));
        this.f8206k4 += 2;
        return sM27462to;
    }

    /* JADX INFO: renamed from: to */
    public final long m11674to() {
        return C7019kk.m27435du(Long.valueOf(C7019kk.m27435du(Integer.valueOf(m11669h4()), 8) | C7019kk.m27435du(Long.valueOf(C7019kk.m27435du(Long.valueOf(C7019kk.m27435du(Long.valueOf(C7019kk.m27435du(Integer.valueOf(m11669h4()), 8)), 10) << 16), 10)), 10)), 10);
    }

    /* JADX INFO: renamed from: x1 */
    public final int m11675x1() {
        return this.f8207x1.length;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m11671k4(int i) {
        if (i < 0) {
            throw new ArgumentException("Position cannot be less than zero");
        }
        if (i > this.f8207x1.length) {
            throw new ArgumentException("Position is out of input bounds");
        }
        this.f8206k4 = i;
    }
}
