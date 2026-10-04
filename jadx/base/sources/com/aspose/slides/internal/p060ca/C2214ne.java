package com.aspose.slides.internal.p060ca;

import com.aspose.slides.exceptions.ArgumentException;
import com.aspose.slides.internal.p314oc.C7019kk;

/* JADX INFO: renamed from: com.aspose.slides.internal.ca.ne */
/* JADX INFO: loaded from: classes3.dex */
class C2214ne {

    /* JADX INFO: renamed from: k4 */
    private byte[] f7660k4;

    /* JADX INFO: renamed from: x1 */
    private int f7661x1;

    public C2214ne(byte[] bArr) {
        this.f7660k4 = bArr;
    }

    /* JADX INFO: renamed from: k4 */
    public final int m11168k4() {
        return this.f7661x1;
    }

    /* JADX INFO: renamed from: kk */
    public final void m11173kk(int i) {
        this.f7660k4[this.f7661x1] = (byte) ((C7019kk.m27457kk(Integer.valueOf(i), 8) >> 8) & 255);
        this.f7660k4[this.f7661x1 + 1] = (byte) (C7019kk.m27462to(Integer.valueOf(i), 8) & 255);
        this.f7661x1 += 2;
    }

    /* JADX INFO: renamed from: x1 */
    public final void m11174x1(int i) {
        byte[] bArr = this.f7660k4;
        int i2 = this.f7661x1;
        bArr[i2] = (byte) ((i >> 24) & 255);
        bArr[i2 + 1] = (byte) ((i >> 16) & 255);
        bArr[i2 + 2] = (byte) ((i >> 8) & 255);
        bArr[i2 + 3] = (byte) (i & 255);
        this.f7661x1 = i2 + 4;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m11169k4(byte b) {
        byte[] bArr = this.f7660k4;
        int i = this.f7661x1;
        bArr[i] = b;
        this.f7661x1 = i + 1;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m11170k4(int i) {
        if (i < 0) {
            throw new ArgumentException("Position cannot be less than zero");
        }
        if (i > this.f7660k4.length) {
            throw new ArgumentException("Position is out of output bounds");
        }
        this.f7661x1 = i;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m11171k4(long j) {
        this.f7660k4[this.f7661x1] = C7019kk.m27442k4(Long.valueOf(C7019kk.m27435du(Long.valueOf(C7019kk.m27435du(Long.valueOf(C7019kk.m27435du(Long.valueOf(j), 10) >> 24), 10) & 255), 10)), 10);
        this.f7660k4[this.f7661x1 + 1] = C7019kk.m27442k4(Long.valueOf(C7019kk.m27435du(Long.valueOf(C7019kk.m27435du(Long.valueOf(C7019kk.m27435du(Long.valueOf(j), 10) >> 16), 10) & 255), 10)), 10);
        this.f7660k4[this.f7661x1 + 2] = C7019kk.m27442k4(Long.valueOf(C7019kk.m27435du(Long.valueOf(C7019kk.m27435du(Long.valueOf(C7019kk.m27435du(Long.valueOf(j), 10) >> 8), 10) & 255), 10)), 10);
        this.f7660k4[this.f7661x1 + 3] = C7019kk.m27442k4(Long.valueOf(C7019kk.m27435du(Long.valueOf(C7019kk.m27435du(Long.valueOf(j), 10) & 255), 10)), 10);
        this.f7661x1 += 4;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m11172k4(short s) {
        byte[] bArr = this.f7660k4;
        int i = this.f7661x1;
        bArr[i] = (byte) ((s >> 8) & 255);
        bArr[i + 1] = (byte) (s & 255);
        this.f7661x1 = i + 2;
    }
}
