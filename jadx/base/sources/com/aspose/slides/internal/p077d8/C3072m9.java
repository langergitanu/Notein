package com.aspose.slides.internal.p077d8;

import com.aspose.slides.internal.p294n9.AbstractC6747ar;
import com.aspose.slides.p559ms.System.C14113y2;

/* JADX INFO: renamed from: com.aspose.slides.internal.d8.m9 */
/* JADX INFO: loaded from: classes3.dex */
public class C3072m9 {

    /* JADX INFO: renamed from: k4 */
    private byte[] f9125k4;

    public C3072m9() {
        this.f9125k4 = new byte[]{0, 0, 0, 0};
    }

    /* JADX INFO: renamed from: k4 */
    public final int m12983k4() {
        return C3110yd.m13249kk(this.f9125k4, 0);
    }

    public String toString() {
        return C14113y2.m67362du(AbstractC6747ar.m26643rv().mo26682x1(this.f9125k4, 4, m12983k4()), 0);
    }

    /* JADX INFO: renamed from: x1 */
    public final byte[] m12985x1() {
        return this.f9125k4;
    }

    public C3072m9(byte[] bArr) {
        byte[] bArr2 = new byte[bArr.length];
        this.f9125k4 = bArr2;
        System.arraycopy(bArr, 0, bArr2, 0, bArr.length);
    }

    /* JADX INFO: renamed from: k4 */
    public final void m12984k4(String str) {
        String strM67362du = C14113y2.m67362du(str, 0);
        int length = (strM67362du.length() * 2) + 6;
        int i = length % 4;
        if (i != 0) {
            length = (length - i) + 4;
        }
        this.f9125k4 = new byte[length];
        System.arraycopy(AbstractC6747ar.m26643rv().mo26677to(strM67362du), 0, this.f9125k4, 4, strM67362du.length() * 2);
        C3110yd.m13258x1(this.f9125k4, 0, length - 4);
    }
}
