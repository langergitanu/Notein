package com.aspose.slides.internal.p392s4;

import com.aspose.slides.exceptions.ArgumentNullException;
import com.aspose.slides.internal.p299ni.InterfaceC6907kk;
import com.aspose.slides.internal.p550zi.C13604kk;
import com.aspose.slides.internal.p550zi.C13621xk;

/* JADX INFO: renamed from: com.aspose.slides.internal.s4.fa */
/* JADX INFO: loaded from: classes4.dex */
public class C10137fa extends AbstractC10139jd {

    /* JADX INFO: renamed from: du */
    private int f36371du;

    /* JADX INFO: renamed from: h4 */
    private int f36372h4;

    /* JADX INFO: renamed from: k4 */
    private final InterfaceC6907kk f36373k4;

    /* JADX INFO: renamed from: kk */
    private int f36374kk;

    /* JADX INFO: renamed from: m9 */
    private int f36375m9;

    /* JADX INFO: renamed from: to */
    private int f36376to;

    /* JADX INFO: renamed from: x1 */
    private byte[] f36377x1;

    public C10137fa(InterfaceC6907kk interfaceC6907kk, int i) {
        super(i, 2);
        this.f36371du = 8;
        if (interfaceC6907kk == null) {
            throw new ArgumentNullException("bufferReader");
        }
        this.f36373k4 = interfaceC6907kk;
        this.f36375m9 = (1 << m49787jd()) - 1;
    }

    @Override // com.aspose.slides.internal.p392s4.AbstractC10133c5
    /* JADX INFO: renamed from: du */
    public int mo49783du(int i) {
        return i - 1;
    }

    @Override // com.aspose.slides.internal.p392s4.AbstractC10139jd
    /* JADX INFO: renamed from: k4 */
    public C13621xk mo49831k4() {
        this.f36371du += m49787jd();
        C13621xk c13621xk = new C13621xk();
        c13621xk.f45228k4 = true;
        while (true) {
            int i = this.f36371du;
            if (i <= 8) {
                break;
            }
            int i2 = this.f36372h4;
            if (i2 < this.f36374kk) {
                int i3 = this.f36376to << 8;
                byte[] bArr = this.f36377x1;
                this.f36372h4 = i2 + 1;
                this.f36376to = i3 | (bArr[i2] & 255);
                this.f36371du = i - 8;
            } else {
                C13604kk c13604kkClone = this.f36373k4.mo27039h4().Clone();
                if (c13604kkClone.f45170kk != 0) {
                    c13621xk.f45228k4 = false;
                    c13621xk.f45229kk = c13604kkClone.f45171to;
                    break;
                }
                this.f36377x1 = c13604kkClone.f45169k4;
                this.f36374kk = c13604kkClone.f45172x1;
                this.f36372h4 = 0;
            }
        }
        c13621xk.f45230x1 = (this.f36376to >> (8 - this.f36371du)) & this.f36375m9;
        return c13621xk;
    }

    @Override // com.aspose.slides.internal.p392s4.AbstractC10133c5
    /* JADX INFO: renamed from: to */
    public void mo49789to() {
        this.f36375m9 = (1 << m49787jd()) - 1;
    }
}
