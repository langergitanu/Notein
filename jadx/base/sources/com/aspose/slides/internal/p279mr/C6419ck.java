package com.aspose.slides.internal.p279mr;

import com.aspose.slides.exceptions.ArgumentNullException;
import com.aspose.slides.internal.p299ni.InterfaceC6909to;
import com.aspose.slides.internal.p475wh.C12014ne;
import com.aspose.slides.internal.p550zi.C13609qq;

/* JADX INFO: renamed from: com.aspose.slides.internal.mr.ck */
/* JADX INFO: loaded from: classes4.dex */
public class C6419ck extends AbstractC6416c5 {

    /* JADX INFO: renamed from: ks */
    private final InterfaceC6909to f18237ks;

    public C6419ck(int i, int i2, int i3, C13609qq c13609qq, C12014ne c12014ne, C13609qq c13609qq2, int i4, InterfaceC6909to interfaceC6909to) {
        super(i, i2, i3, c13609qq, c12014ne.Clone(), c13609qq2, i4);
        if (interfaceC6909to == null) {
            throw new ArgumentNullException("colorConverter");
        }
        this.f18237ks = interfaceC6909to;
    }

    @Override // com.aspose.slides.internal.p279mr.AbstractC6416c5
    /* JADX INFO: renamed from: k4 */
    public void mo26307k4(byte[] bArr, int i, int i2, int i3, int i4, byte[] bArr2, int i5, int i6) {
        this.f18237ks.m27040k4(this.f18222fa, bArr, i, i2, i3, i4, this.f18229to, bArr2, i5);
    }
}
