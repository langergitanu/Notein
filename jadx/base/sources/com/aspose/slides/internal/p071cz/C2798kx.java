package com.aspose.slides.internal.p071cz;

import com.aspose.slides.IGenericCloneable;

/* JADX INFO: renamed from: com.aspose.slides.internal.cz.kx */
/* JADX INFO: loaded from: classes3.dex */
public final class C2798kx implements IGenericCloneable<C2798kx> {

    /* JADX INFO: renamed from: k4 */
    private int f8673k4;

    /* JADX INFO: renamed from: kk */
    private byte[] f8674kk;

    /* JADX INFO: renamed from: to */
    private String f8675to;

    /* JADX INFO: renamed from: x1 */
    private int f8676x1;

    private C2798kx(C2798kx c2798kx) {
        this.f8673k4 = 1;
        this.f8676x1 = 0;
        this.f8674kk = new byte[0];
        m12397k4(c2798kx.m12395k4());
        m12396k4(c2798kx.m12401x1());
        m12402x1(c2798kx.m12400to());
        m12398k4(c2798kx.m12399kk());
    }

    @Override // com.aspose.slides.IGenericCloneable
    /* JADX INFO: renamed from: du, reason: merged with bridge method [inline-methods] */
    public C2798kx cloneT() {
        return new C2798kx(this);
    }

    /* JADX INFO: renamed from: k4 */
    public String m12395k4() {
        return this.f8675to;
    }

    /* JADX INFO: renamed from: kk */
    public byte[] m12399kk() {
        return this.f8674kk;
    }

    /* JADX INFO: renamed from: to */
    public int m12400to() {
        return this.f8676x1;
    }

    /* JADX INFO: renamed from: x1 */
    public int m12401x1() {
        return this.f8673k4;
    }

    public C2798kx(String str) {
        this.f8673k4 = 1;
        this.f8676x1 = 0;
        this.f8674kk = new byte[0];
        m12397k4(str);
    }

    /* JADX INFO: renamed from: k4 */
    public void m12396k4(int i) {
        this.f8673k4 = i;
    }

    /* JADX INFO: renamed from: x1 */
    public void m12402x1(int i) {
        this.f8676x1 = i;
    }

    /* JADX INFO: renamed from: k4 */
    public void m12397k4(String str) {
        this.f8675to = str;
    }

    /* JADX INFO: renamed from: k4 */
    public void m12398k4(byte[] bArr) {
        if (bArr == this.f8674kk) {
            return;
        }
        if (bArr == null) {
            this.f8674kk = new byte[0];
            return;
        }
        byte[] bArr2 = new byte[bArr.length];
        this.f8674kk = bArr2;
        System.arraycopy(bArr, 0, bArr2, 0, bArr.length);
    }
}
