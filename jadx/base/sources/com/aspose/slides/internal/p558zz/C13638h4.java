package com.aspose.slides.internal.p558zz;

import com.aspose.slides.internal.p080dd.C3123ar;
import com.aspose.slides.p559ms.System.AbstractC14092to;

/* JADX INFO: renamed from: com.aspose.slides.internal.zz.h4 */
/* JADX INFO: loaded from: classes5.dex */
public class C13638h4 extends AbstractC13639k4 {

    /* JADX INFO: renamed from: k4 */
    private byte[] f45312k4;

    public C13638h4(int i) {
        this(new byte[i], 0);
    }

    @Override // com.aspose.slides.internal.p558zz.AbstractC13639k4
    /* JADX INFO: renamed from: k4 */
    public int mo62954k4(C3123ar c3123ar, int i, int i2) {
        c3123ar.m13301k4().write(this.f45312k4, i, i2);
        return i2;
    }

    @Override // com.aspose.slides.internal.p558zz.AbstractC13639k4
    /* JADX INFO: renamed from: kk */
    public int mo62955kk(int i) {
        return this.f45312k4[i] & 255;
    }

    @Override // com.aspose.slides.internal.p558zz.AbstractC13639k4
    /* JADX INFO: renamed from: to */
    public int mo62957to(int i, byte[] bArr, int i2, int i3) {
        AbstractC14092to.m67216k4(AbstractC14092to.m67208k4((Object) this.f45312k4), i, AbstractC14092to.m67208k4((Object) bArr), i2, i3);
        return i3;
    }

    @Override // com.aspose.slides.internal.p558zz.AbstractC13639k4
    /* JADX INFO: renamed from: x1 */
    public void mo62958x1(int i, byte b) {
        this.f45312k4[i] = b;
    }

    public C13638h4(byte[] bArr) {
        this(bArr, bArr.length);
    }

    @Override // com.aspose.slides.internal.p558zz.AbstractC13639k4
    /* JADX INFO: renamed from: kk */
    public int mo62956kk(int i, byte[] bArr, int i2, int i3) {
        AbstractC14092to.m67216k4(AbstractC14092to.m67208k4((Object) bArr), i2, AbstractC14092to.m67208k4((Object) this.f45312k4), i, i3);
        return i3;
    }

    public C13638h4(byte[] bArr, int i) {
        super(i, bArr.length);
        this.f45312k4 = bArr;
    }
}
