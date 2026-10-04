package com.aspose.slides.internal.p169hl;

import com.aspose.slides.internal.p080dd.AbstractC3150x6;
import com.aspose.slides.internal.p302nm.C6925kk;

/* JADX INFO: renamed from: com.aspose.slides.internal.hl.x1 */
/* JADX INFO: loaded from: classes.dex */
public class C4599x1 extends C4596k4 {

    /* JADX INFO: renamed from: kk */
    private final float f12858kk;

    /* JADX INFO: renamed from: to */
    private final int f12859to;

    /* JADX INFO: renamed from: x1 */
    private final int f12860x1;

    public C4599x1(AbstractC3150x6 abstractC3150x6, int i, float f, int i2) {
        super(abstractC3150x6);
        this.f12860x1 = i;
        this.f12858kk = f;
        this.f12859to = i2;
    }

    @Override // com.aspose.slides.internal.p169hl.C4596k4, com.aspose.slides.internal.p080dd.AbstractC3150x6
    public void write(byte[] bArr, int i, int i2) {
        C6925kk c6925kk = new C6925kk();
        c6925kk.m27178k4(1);
        c6925kk.m27179k4(false);
        c6925kk.m27183x1(false);
        c6925kk.m27180k4(bArr, this.f12860x1, this.f12858kk, this.f12859to, this.f12849k4);
    }
}
