package com.aspose.slides.internal.p558zz;

import com.aspose.slides.internal.p080dd.C3123ar;
import com.aspose.slides.p559ms.System.AbstractC14092to;
import com.aspose.slides.p559ms.System.C14116yg;

/* JADX INFO: renamed from: com.aspose.slides.internal.zz.du */
/* JADX INFO: loaded from: classes5.dex */
public class C13636du extends AbstractC13639k4 {

    /* JADX INFO: renamed from: k4 */
    private byte[] f45311k4;

    public C13636du() {
        super(0, Integer.MAX_VALUE, true);
        this.f45311k4 = new byte[256];
    }

    @Override // com.aspose.slides.internal.p558zz.AbstractC13639k4
    /* JADX INFO: renamed from: k4 */
    public int mo62954k4(C3123ar c3123ar, int i, int i2) {
        c3123ar.m13301k4().write(this.f45311k4, i, i2);
        return i2;
    }

    @Override // com.aspose.slides.internal.p558zz.AbstractC13639k4
    /* JADX INFO: renamed from: kk */
    public int mo62955kk(int i) {
        return this.f45311k4[i] & 255;
    }

    @Override // com.aspose.slides.internal.p558zz.AbstractC13639k4
    /* JADX INFO: renamed from: to */
    public int mo62957to(int i, byte[] bArr, int i2, int i3) {
        AbstractC14092to.m67216k4(AbstractC14092to.m67208k4((Object) this.f45311k4), i, AbstractC14092to.m67208k4((Object) bArr), i2, i3);
        return i3;
    }

    @Override // com.aspose.slides.internal.p558zz.AbstractC13639k4
    /* JADX INFO: renamed from: x1 */
    public void mo62958x1(int i, byte b) {
        m62953to(i + 1);
        this.f45311k4[i] = b;
    }

    /* JADX INFO: renamed from: to */
    private void m62953to(int i) {
        byte[] bArr = this.f45311k4;
        if (i <= bArr.length) {
            return;
        }
        byte[] bArr2 = new byte[C14116yg.m67483k4(i, bArr.length * 2)];
        AbstractC14092to.m67216k4(AbstractC14092to.m67208k4((Object) this.f45311k4), 0, AbstractC14092to.m67208k4((Object) bArr2), 0, this.f45311k4.length);
        this.f45311k4 = bArr2;
    }

    @Override // com.aspose.slides.internal.p558zz.AbstractC13639k4
    /* JADX INFO: renamed from: kk */
    public int mo62956kk(int i, byte[] bArr, int i2, int i3) {
        m62953to(i + i3);
        AbstractC14092to.m67216k4(AbstractC14092to.m67208k4((Object) bArr), i2, AbstractC14092to.m67208k4((Object) this.f45311k4), i, i3);
        return i3;
    }
}
