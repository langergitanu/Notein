package com.aspose.slides.internal.p407st;

import com.aspose.slides.internal.p080dd.C3134k4;
import com.aspose.slides.internal.p080dd.C3149x1;
import com.aspose.slides.internal.p294n9.C6773ss;

/* JADX INFO: renamed from: com.aspose.slides.internal.st.ai */
/* JADX INFO: loaded from: classes4.dex */
public class C10355ai extends AbstractC10739yw {

    /* JADX INFO: renamed from: k4 */
    private byte[] f36843k4;

    public C10355ai(int i, int i2) {
        super(i, false);
        this.f36843k4 = new byte[i2];
    }

    @Override // com.aspose.slides.internal.p407st.AbstractC10739yw
    /* JADX INFO: renamed from: k4 */
    public int mo50416k4() {
        return mo50423x1().length + 6;
    }

    /* JADX INFO: renamed from: kk */
    public final int m50421kk() {
        return this.f36843k4.length;
    }

    /* JADX INFO: renamed from: x1 */
    public void m50422x1(C3149x1 c3149x1) {
        c3149x1.m13450k4(this.f36843k4);
    }

    public C10355ai(int i, String str) {
        super(i, false);
        byte[] bArrMo26677to = new C6773ss().mo26677to(str);
        byte[] bArr = new byte[bArrMo26677to.length + 2];
        this.f36843k4 = bArr;
        System.arraycopy(bArrMo26677to, 0, bArr, 0, bArrMo26677to.length);
        byte[] bArr2 = this.f36843k4;
        bArr2[bArr2.length - 1] = 0;
        bArr2[bArr2.length - 2] = 0;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m50417k4(int i) {
        byte[] bArr = this.f36843k4;
        mo50420k4(new byte[i]);
        byte[] bArr2 = this.f36843k4;
        System.arraycopy(bArr, 0, bArr2, 0, bArr.length < bArr2.length ? bArr.length : bArr2.length);
    }

    /* JADX INFO: renamed from: x1 */
    public byte[] mo50423x1() {
        return this.f36843k4;
    }

    public C10355ai(int i, byte[] bArr) {
        super(i, false);
        byte[] bArr2 = new byte[bArr.length];
        this.f36843k4 = bArr2;
        System.arraycopy(bArr, 0, bArr2, 0, bArr.length);
    }

    /* JADX INFO: renamed from: k4 */
    public void mo50418k4(C3134k4 c3134k4) {
        byte[] bArr = this.f36843k4;
        c3134k4.m13375k4(bArr, 0, bArr.length);
    }

    @Override // com.aspose.slides.internal.p407st.AbstractC10739yw
    /* JADX INFO: renamed from: k4 */
    public void mo50419k4(C3149x1 c3149x1) {
        c3149x1.m13448k4((short) (m52116up() | (m52117yj() ? 16384 : 0) | 32768));
        c3149x1.m13455x1(this.f36843k4.length);
    }

    /* JADX INFO: renamed from: k4 */
    public void mo50420k4(byte[] bArr) {
        this.f36843k4 = bArr;
    }
}
