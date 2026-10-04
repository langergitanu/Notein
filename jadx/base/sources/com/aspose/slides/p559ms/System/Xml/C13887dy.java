package com.aspose.slides.p559ms.System.Xml;

import com.aspose.slides.p559ms.System.AbstractC14092to;
import com.aspose.slides.p559ms.System.C14058fa;

/* JADX INFO: renamed from: com.aspose.slides.ms.System.Xml.dy */
/* JADX INFO: loaded from: classes5.dex */
public class C13887dy {

    /* JADX INFO: renamed from: k4 */
    private byte[] f46449k4;

    /* JADX INFO: renamed from: kk */
    private int f46450kk = 0;

    /* JADX INFO: renamed from: to */
    private int f46451to;

    /* JADX INFO: renamed from: x1 */
    private int f46452x1;

    public C13887dy(int i) {
        this.f46452x1 = i;
        this.f46449k4 = new byte[i];
        this.f46451to = i;
    }

    /* JADX INFO: renamed from: k4 */
    public final byte m65273k4() {
        int i = this.f46450kk;
        if (i <= 0) {
            return (byte) 0;
        }
        byte[] bArr = this.f46449k4;
        int i2 = i - 1;
        this.f46450kk = i2;
        return bArr[i2];
    }

    /* JADX INFO: renamed from: k4 */
    public final void m65274k4(byte b) {
        int i = this.f46451to;
        int i2 = this.f46450kk;
        if (i == i2) {
            byte[] bArr = new byte[i + this.f46452x1];
            if (i2 > 0) {
                C14058fa.m66593k4(AbstractC14092to.m67208k4((Object) this.f46449k4), 0, AbstractC14092to.m67208k4((Object) bArr), 0, this.f46450kk);
            }
            this.f46449k4 = bArr;
            this.f46451to += this.f46452x1;
        }
        byte[] bArr2 = this.f46449k4;
        int i3 = this.f46450kk;
        this.f46450kk = i3 + 1;
        bArr2[i3] = b;
    }
}
