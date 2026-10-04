package com.aspose.slides.internal.p279mr;

import com.aspose.slides.exceptions.ArgumentNullException;
import com.aspose.slides.internal.p299ni.InterfaceC6901du;
import com.aspose.slides.internal.p475wh.C12014ne;
import com.aspose.slides.internal.p550zi.C13609qq;
import com.aspose.slides.p559ms.System.C14116yg;

/* JADX INFO: renamed from: com.aspose.slides.internal.mr.bs */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC6413bs extends AbstractC6416c5 {

    /* JADX INFO: renamed from: ix */
    protected final int f18209ix;

    /* JADX INFO: renamed from: ks */
    protected final int f18210ks;

    /* JADX INFO: renamed from: ne */
    protected final int f18211ne;

    /* JADX INFO: renamed from: rv */
    protected final InterfaceC6901du f18212rv;

    /* JADX INFO: renamed from: u4 */
    protected final int f18213u4;

    /* JADX INFO: renamed from: uz */
    protected final int f18214uz;

    /* JADX INFO: renamed from: x6 */
    protected final int f18215x6;

    public AbstractC6413bs(int i, int i2, int i3, C13609qq c13609qq, C12014ne c12014ne, C13609qq c13609qq2, int i4, InterfaceC6901du interfaceC6901du, int i5) {
        super(i, i2, i3, c13609qq, c12014ne.Clone(), c13609qq2, i4);
        if (this.f18223h4 <= 8 && interfaceC6901du == null) {
            throw new ArgumentNullException("destinationPalette");
        }
        this.f18212rv = interfaceC6901du;
        this.f18210ks = ((int) C14116yg.m67469du(2.0d, r10)) - 1;
        this.f18215x6 = i5;
        int i6 = this.f18223h4;
        this.f18214uz = 8 / i6;
        int i7 = this.f18230up;
        this.f18209ix = i7 / i6;
        this.f18213u4 = i7 / 8;
        this.f18211ne = 8 - i6;
    }

    @Override // com.aspose.slides.internal.p279mr.AbstractC6416c5
    /* JADX INFO: renamed from: k4 */
    public void mo26307k4(byte[] bArr, int i, int i2, int i3, int i4, byte[] bArr2, int i5, int i6) {
        int i7 = this.f18214uz;
        mo26309k4(bArr, i, i2, i3, i4, bArr2, i5, i6, ((i7 - ((i2 / this.f18230up) % i7)) - 1) * this.f18223h4);
    }

    /* JADX INFO: renamed from: k4 */
    public abstract void mo26309k4(byte[] bArr, int i, int i2, int i3, int i4, byte[] bArr2, int i5, int i6, int i7);
}
