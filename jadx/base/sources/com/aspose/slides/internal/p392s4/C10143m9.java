package com.aspose.slides.internal.p392s4;

import com.aspose.slides.exceptions.ArgumentNullException;
import com.aspose.slides.internal.p550zi.C13618wy;
import com.aspose.slides.internal.p550zi.C13621xk;

/* JADX INFO: renamed from: com.aspose.slides.internal.s4.m9 */
/* JADX INFO: loaded from: classes4.dex */
public class C10143m9 extends AbstractC10139jd {

    /* JADX INFO: renamed from: c5 */
    private int f36479c5;

    /* JADX INFO: renamed from: du */
    private int f36480du;

    /* JADX INFO: renamed from: dy */
    private int f36481dy;

    /* JADX INFO: renamed from: h4 */
    private int f36482h4;

    /* JADX INFO: renamed from: jd */
    private int f36483jd;

    /* JADX INFO: renamed from: k4 */
    private final int f36484k4;

    /* JADX INFO: renamed from: kk */
    private byte[] f36485kk;

    /* JADX INFO: renamed from: m9 */
    private int f36486m9;

    /* JADX INFO: renamed from: to */
    private int f36487to;

    /* JADX INFO: renamed from: x1 */
    private final C13618wy f36488x1;

    public C10143m9(C13618wy c13618wy, int i) {
        this(c13618wy, i, 0, 1);
    }

    /* JADX INFO: renamed from: du */
    public C13621xk m49901du() {
        C13621xk c13621xk = new C13621xk();
        c13621xk.f45228k4 = false;
        if (this.f36488x1.m62852k4(this.f36485kk, 0, 1) != 1) {
            c13621xk.f45229kk = "Unexpected end of stream. Cannot decompress data.";
            return c13621xk;
        }
        byte[] bArr = this.f36485kk;
        int i = bArr[0] & 255;
        if (this.f36488x1.m62852k4(bArr, 1, i) != i) {
            c13621xk.f45229kk = "Unexpected end of stream. Cannot decompress data.";
            return c13621xk;
        }
        c13621xk.f45228k4 = true;
        c13621xk.f45230x1 = i;
        return c13621xk;
    }

    @Override // com.aspose.slides.internal.p392s4.AbstractC10139jd
    /* JADX INFO: renamed from: k4 */
    public C13621xk mo49831k4() {
        C13621xk c13621xk = new C13621xk();
        c13621xk.f45228k4 = true;
        int iMo49786h4 = mo49786h4();
        while (this.f36480du < m49787jd()) {
            int i = this.f36482h4;
            if (i < this.f36481dy) {
                byte[] bArr = this.f36485kk;
                this.f36482h4 = i + 1;
                int i2 = bArr[i] & 255;
                int i3 = this.f36480du;
                this.f36487to = (i2 << i3) | this.f36487to;
                this.f36480du = i3 + 8;
            } else {
                C13621xk c13621xkClone = m49901du().Clone();
                if (!c13621xkClone.f45228k4) {
                    return c13621xkClone;
                }
                int i4 = c13621xkClone.f45230x1;
                this.f36481dy = i4;
                if (i4 <= 0) {
                    break;
                }
                int i5 = this.f36484k4;
                this.f36481dy = i4 + i5;
                this.f36482h4 = i5;
            }
        }
        if (this.f36481dy > 0) {
            int i6 = this.f36487to;
            int i7 = this.f36486m9 & i6;
            this.f36479c5 = i6;
            this.f36487to = i6 >> m49787jd();
            int i8 = this.f36480du;
            this.f36483jd = i8;
            this.f36480du = i8 - m49787jd();
            iMo49786h4 = i7;
        }
        c13621xk.f45230x1 = iMo49786h4;
        return c13621xk;
    }

    /* JADX INFO: renamed from: kk */
    public void m49902kk() {
        this.f36487to = this.f36479c5 >> 1;
        this.f36480du = this.f36483jd - 1;
    }

    @Override // com.aspose.slides.internal.p392s4.AbstractC10133c5
    /* JADX INFO: renamed from: to */
    public void mo49789to() {
        this.f36486m9 = (1 << m49787jd()) - 1;
    }

    @Override // com.aspose.slides.internal.p392s4.AbstractC10139jd
    /* JADX INFO: renamed from: x1 */
    public C13621xk mo49892x1() {
        C13621xk c13621xkClone = mo49831k4().Clone();
        if (this.f36481dy == 0 || !c13621xkClone.f45228k4 || c13621xkClone.f45230x1 == mo49788m9()) {
            return c13621xkClone;
        }
        m49902kk();
        return mo49892x1();
    }

    public C10143m9(C13618wy c13618wy, int i, int i2, int i3) {
        super(i, i2);
        if (c13618wy == null) {
            throw new ArgumentNullException("streamContainer");
        }
        this.f36488x1 = c13618wy;
        this.f36484k4 = i3;
        this.f36485kk = new byte[i3 + 255];
        this.f36486m9 = (1 << m49787jd()) - 1;
        this.f36481dy = i3;
        this.f36482h4 = i3;
    }
}
