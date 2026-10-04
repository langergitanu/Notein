package com.aspose.slides.internal.p439ug;

import com.aspose.slides.internal.p080dd.AbstractC3150x6;
import com.aspose.slides.internal.p236kq.C5898k4;
import com.aspose.slides.internal.p291n4.C6740x1;
import com.aspose.slides.internal.p299ni.InterfaceC6907kk;
import com.aspose.slides.internal.p383rp.AbstractC10035k4;
import com.aspose.slides.internal.p550zi.C13604kk;
import com.aspose.slides.internal.p550zi.C13612u4;

/* JADX INFO: renamed from: com.aspose.slides.internal.ug.h4 */
/* JADX INFO: loaded from: classes4.dex */
public class C11306h4 extends AbstractC11304du implements InterfaceC6907kk {

    /* JADX INFO: renamed from: c5 */
    private C13612u4 f38885c5;

    /* JADX INFO: renamed from: ck */
    private byte[] f38886ck;

    /* JADX INFO: renamed from: du */
    private final int f38887du;

    /* JADX INFO: renamed from: dy */
    private final long[] f38888dy;

    /* JADX INFO: renamed from: fa */
    private int f38889fa;

    /* JADX INFO: renamed from: h4 */
    private final AbstractC3150x6 f38890h4;

    /* JADX INFO: renamed from: jd */
    private int f38891jd;

    /* JADX INFO: renamed from: m9 */
    private final long[] f38892m9;

    /* JADX INFO: renamed from: to */
    private final C5898k4 f38893to;

    public C11306h4(AbstractC3150x6 abstractC3150x6, C6740x1 c6740x1, int i, int i2, int i3) {
        this.f38890h4 = abstractC3150x6;
        this.f38887du = c6740x1.m26562dy();
        this.f38893to = new C5898k4(i, i2, i3);
        this.f38892m9 = c6740x1.m26579ks();
        this.f38888dy = c6740x1.m26599yj();
    }

    /* JADX INFO: renamed from: m9 */
    private void m54302m9() {
        long[] jArr = this.f38892m9;
        int i = this.f38891jd;
        this.f38885c5 = new C13612u4(this.f38890h4, jArr[i] & 4294967295L, this.f38888dy[i] & 4294967295L);
        m54295kk();
        this.f38886ck = null;
        this.f38889fa = 0;
    }

    /* JADX INFO: renamed from: du */
    public int m54303du() {
        return m54305kk(this.f38893to.m23752k4(this.f38891jd));
    }

    @Override // com.aspose.slides.internal.p299ni.InterfaceC6907kk
    /* JADX INFO: renamed from: h4 */
    public C13604kk mo27039h4() {
        C13604kk c13604kkClone = this.f38885c5.m62799k4().Clone();
        if (c13604kkClone.f45170kk != 0) {
            this.f38886ck = null;
            this.f38889fa = 0;
            return c13604kkClone;
        }
        byte[] bArr = c13604kkClone.f45169k4;
        this.f38886ck = bArr;
        int i = c13604kkClone.f45172x1;
        this.f38889fa = i;
        if (this.f38887du == 2) {
            AbstractC10035k4.m49316k4(bArr, 0, i);
        }
        return c13604kkClone;
    }

    @Override // com.aspose.slides.internal.p439ug.AbstractC11304du
    /* JADX INFO: renamed from: k4 */
    public /* bridge */ /* synthetic */ int mo54293k4() {
        return super.mo54293k4();
    }

    /* JADX INFO: renamed from: kk */
    public int m54305kk(int i) {
        int iM23753x1 = i > 0 ? this.f38893to.m23753x1(i) : 0;
        int i2 = iM23753x1 + 1;
        if (i2 < this.f38893to.m23751k4()) {
            iM23753x1 = i2;
        }
        return this.f38893to.m23752k4(iM23753x1);
    }

    /* JADX INFO: renamed from: to */
    public int m54306to() {
        return this.f38891jd;
    }

    @Override // com.aspose.slides.internal.p439ug.AbstractC11304du
    /* JADX INFO: renamed from: x1 */
    public /* bridge */ /* synthetic */ int mo54296x1(int i) {
        return super.mo54296x1(i);
    }

    /* JADX INFO: renamed from: k4 */
    public C11309m9 m54304k4(int i, boolean z) {
        String str;
        int i2;
        boolean z2 = false;
        int i3 = 0;
        while (true) {
            if (this.f38878k4 >= i) {
                str = null;
                i2 = 0;
                z2 = true;
                break;
            }
            if (this.f38880x1 >= this.f38889fa) {
                C13604kk c13604kkClone = this.f38885c5.m62799k4().Clone();
                int i4 = c13604kkClone.f45170kk;
                if (i4 != 0) {
                    if (i4 != 1 || this.f38878k4 == 0) {
                        i2 = 0;
                    } else {
                        this.f38878k4 = i;
                        i2 = (int) (this.f38879kk & 4294967295L);
                        i4 = 0;
                    }
                    int i5 = i4;
                    str = c13604kkClone.f45171to;
                    i3 = i5;
                } else {
                    byte[] bArr = c13604kkClone.f45169k4;
                    this.f38886ck = bArr;
                    int i6 = c13604kkClone.f45172x1;
                    this.f38889fa = i6;
                    this.f38880x1 = 0;
                    if (this.f38887du == 1) {
                        AbstractC10035k4.m49316k4(bArr, 0, i6);
                    }
                    i3 = i4;
                }
            }
            long j = this.f38879kk & 4294967295L;
            byte[] bArr2 = this.f38886ck;
            int i7 = this.f38880x1;
            this.f38880x1 = i7 + 1;
            long j2 = ((long) (bArr2[i7] & 255)) & 4294967295L;
            int i8 = this.f38878k4;
            this.f38879kk = 4294967295L & (j | ((j2 << (i8 & 31)) & 4294967295L));
            this.f38878k4 = i8 + 8;
        }
        if (z2) {
            i2 = (int) (4294967295L & this.f38879kk);
            if (z) {
                i2 &= (1 << i) - 1;
            }
        }
        C11309m9 c11309m9 = new C11309m9();
        c11309m9.f38906x1 = str;
        c11309m9.f38905kk = i2;
        c11309m9.f38904k4 = i3;
        return c11309m9;
    }

    /* JADX INFO: renamed from: to */
    public int m54307to(int i) {
        this.f38891jd = i > 0 ? this.f38893to.m23753x1(i) : 0;
        m54302m9();
        return this.f38893to.m23752k4(this.f38891jd);
    }

    @Override // com.aspose.slides.internal.p439ug.AbstractC11304du
    /* JADX INFO: renamed from: x1 */
    public /* bridge */ /* synthetic */ void mo54297x1() {
        super.mo54297x1();
    }

    @Override // com.aspose.slides.internal.p439ug.AbstractC11304du
    /* JADX INFO: renamed from: k4 */
    public /* bridge */ /* synthetic */ void mo54294k4(int i) {
        super.mo54294k4(i);
    }
}
