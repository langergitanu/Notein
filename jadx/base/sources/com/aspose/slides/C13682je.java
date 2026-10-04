package com.aspose.slides;

import com.aspose.slides.internal.p077d8.C3074na;
import com.aspose.slides.internal.p332p7.AbstractC7414ck;

/* JADX INFO: renamed from: com.aspose.slides.je */
/* JADX INFO: loaded from: classes3.dex */
class C13682je {

    /* JADX INFO: renamed from: k4 */
    static final C3074na<Integer, Byte> f45474k4;

    /* JADX INFO: renamed from: du */
    private long f45475du;

    /* JADX INFO: renamed from: kk */
    private final byte[] f45476kk;

    /* JADX INFO: renamed from: to */
    private boolean f45477to;

    /* JADX INFO: renamed from: x1 */
    private AbstractC7414ck f45478x1;

    static {
        C3074na<Integer, Byte> c3074na = new C3074na<>();
        f45474k4 = c3074na;
        c3074na.m13009k4(12, (byte) 4);
        c3074na.m13009k4(C22228OoooO0.OooO00o((byte) 2, c3074na, C22228OoooO0.OooO00o((byte) 1, c3074na, C22228OoooO0.OooO00o((byte) 0, c3074na, 13, 14), 15), 16), (byte) 3);
        c3074na.m13009k4(4, (byte) 4);
        c3074na.m13009k4(C22228OoooO0.OooO00o((byte) 10, c3074na, C22228OoooO0.OooO00o((byte) 9, c3074na, C22228OoooO0.OooO00o((byte) 8, c3074na, C22228OoooO0.OooO00o((byte) 7, c3074na, C22228OoooO0.OooO00o((byte) 6, c3074na, C22228OoooO0.OooO00o((byte) 5, c3074na, 5, 6), 7), 8), 9), 10), 11), (byte) 11);
    }

    public C13682je() {
        this(false);
    }

    /* JADX INFO: renamed from: to */
    private void m63288to() {
        this.f45475du++;
    }

    /* JADX INFO: renamed from: k4 */
    public final byte m63289k4(int i) {
        return i > 11 ? f45474k4.m13012x1(Integer.valueOf(i)).byteValue() : this.f45476kk[i];
    }

    /* JADX INFO: renamed from: kk */
    public final long m63295kk() {
        return this.f45475du;
    }

    /* JADX INFO: renamed from: x1 */
    public final AbstractC7414ck m63296x1() {
        return this.f45478x1;
    }

    public C13682je(boolean z) {
        this.f45476kk = new byte[]{1, 0, 3, 2, 4, 5, 6, 7, 8, 9, 10, 11};
        this.f45477to = z;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m63290k4(int i, byte b) {
        if (i <= 11) {
            this.f45476kk[i] = b;
            m63288to();
        }
    }

    /* JADX INFO: renamed from: k4 */
    public final void m63291k4(AbstractC7414ck abstractC7414ck) {
        this.f45478x1 = abstractC7414ck;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m63292k4(C13682je c13682je) {
        if (c13682je == null || !c13682je.f45477to) {
            this.f45477to = false;
            return;
        }
        this.f45477to = true;
        byte[] bArr = c13682je.f45476kk;
        byte[] bArr2 = this.f45476kk;
        System.arraycopy(bArr, 0, bArr2, 0, bArr2.length);
        m63288to();
    }

    /* JADX INFO: renamed from: k4 */
    public final void m63293k4(boolean z) {
        if (this.f45477to != z) {
            this.f45477to = z;
            m63288to();
        }
    }

    /* JADX INFO: renamed from: k4 */
    public final boolean m63294k4() {
        return this.f45477to;
    }
}
