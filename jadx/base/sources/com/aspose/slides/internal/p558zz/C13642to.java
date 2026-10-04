package com.aspose.slides.internal.p558zz;

import com.aspose.slides.internal.p080dd.C3123ar;

/* JADX INFO: renamed from: com.aspose.slides.internal.zz.to */
/* JADX INFO: loaded from: classes5.dex */
public class C13642to {

    /* JADX INFO: renamed from: k4 */
    private C3123ar f45323k4;

    public C13642to(C3123ar c3123ar) {
        this.f45323k4 = c3123ar;
    }

    /* JADX INFO: renamed from: k4 */
    public final C3123ar m63009k4() {
        return this.f45323k4;
    }

    /* JADX INFO: renamed from: kk */
    public final void m63012kk(int i) {
        m63011k4(i);
    }

    /* JADX INFO: renamed from: x1 */
    public final void m63013x1(int i) {
        m63010k4(((byte) ((i >> 8) & 255)) & 255);
        m63010k4(((byte) (i & 255)) & 255);
    }

    /* JADX INFO: renamed from: k4 */
    public final void m63010k4(int i) {
        this.f45323k4.m13301k4().writeByte((byte) i);
    }

    /* JADX INFO: renamed from: k4 */
    public final void m63011k4(long j) {
        m63010k4(((byte) ((j >> 24) & 255)) & 255);
        m63010k4(((byte) ((j >> 16) & 255)) & 255);
        m63010k4(((byte) ((j >> 8) & 255)) & 255);
        m63010k4(((byte) (j & 255)) & 255);
    }
}
