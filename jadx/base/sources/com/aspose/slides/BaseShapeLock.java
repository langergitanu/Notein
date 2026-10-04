package com.aspose.slides;

import com.aspose.slides.internal.p314oc.C7019kk;

/* JADX INFO: loaded from: classes3.dex */
public class BaseShapeLock implements IBaseShapeLock {

    /* JADX INFO: renamed from: k4 */
    private int f1063k4;

    /* JADX INFO: renamed from: kk */
    private C14375r5 f1064kk;

    /* JADX INFO: renamed from: to */
    private C0952ei f1065to;

    /* JADX INFO: renamed from: x1 */
    private int f1066x1;

    public BaseShapeLock() {
        this.f1066x1 = 65535;
        this.f1064kk = new C14375r5();
        this.f1065to = new C0952ei();
    }

    /* JADX INFO: renamed from: k4 */
    public static int m372k4(byte... bArr) {
        int iM27457kk = 0;
        for (byte b : bArr) {
            iM27457kk = C7019kk.m27457kk(Integer.valueOf(C7019kk.m27462to(Integer.valueOf(iM27457kk), 8) | C7019kk.m27462to(Integer.valueOf(C7019kk.m27457kk(Integer.valueOf(1 << b), 9)), 8)), 9);
        }
        return iM27457kk;
    }

    @Override // com.aspose.slides.IBaseShapeLock
    public boolean getNoLocks() {
        return C7019kk.m27457kk(Integer.valueOf(this.f1063k4), 8) == 0;
    }

    /* JADX INFO: renamed from: x1 */
    public C0952ei m376x1() {
        return this.f1065to;
    }

    public BaseShapeLock(int i) {
        this.f1066x1 = 65535;
        this.f1064kk = new C14375r5();
        this.f1065to = new C0952ei();
        this.f1066x1 = i;
    }

    /* JADX INFO: renamed from: k4 */
    public C14375r5 m373k4() {
        return this.f1064kk;
    }

    /* JADX INFO: renamed from: k4 */
    public void m374k4(byte b, boolean z) {
        int iM27462to;
        int iM27457kk = C7019kk.m27457kk(Integer.valueOf(1 << b), 9);
        if (z) {
            iM27462to = C7019kk.m27462to(Integer.valueOf(iM27457kk), 8) | C7019kk.m27462to(Integer.valueOf(this.f1063k4), 8);
        } else {
            iM27462to = C7019kk.m27462to(Integer.valueOf(C7019kk.m27457kk(Integer.valueOf(~C7019kk.m27462to(Integer.valueOf(iM27457kk), 8)), 9)), 8) & C7019kk.m27462to(Integer.valueOf(this.f1063k4), 8);
        }
        this.f1063k4 = C7019kk.m27457kk(Integer.valueOf(iM27462to), 9);
    }

    /* JADX INFO: renamed from: k4 */
    public boolean m375k4(byte b) {
        return ((1 << b) & C7019kk.m27462to(Integer.valueOf(this.f1063k4), 8)) != 0;
    }
}
