package com.aspose.slides.internal.p279mr;

import androidx.core.view.ViewCompat;
import com.aspose.slides.internal.p135fp.C4100ne;
import com.aspose.slides.internal.p225ke.C5666m9;
import com.aspose.slides.internal.p299ni.InterfaceC6901du;
import com.aspose.slides.internal.p381rm.C10019k4;
import com.aspose.slides.internal.p475wh.C12014ne;
import com.aspose.slides.internal.p550zi.C13609qq;

/* JADX INFO: renamed from: com.aspose.slides.internal.mr.x5 */
/* JADX INFO: loaded from: classes4.dex */
public class C6478x5 extends AbstractC6413bs {

    /* JADX INFO: renamed from: ar */
    private int[] f18262ar;

    /* JADX INFO: renamed from: bv */
    private int[] f18263bv;

    /* JADX INFO: renamed from: qq */
    private int[] f18264qq;

    /* JADX INFO: renamed from: um */
    private int[] f18265um;

    /* JADX INFO: renamed from: v4 */
    private byte f18266v4;

    /* JADX INFO: renamed from: wl */
    private final C4100ne f18267wl;

    public C6478x5(int i, int i2, int i3, C13609qq c13609qq, C12014ne c12014ne, C13609qq c13609qq2, int i4, InterfaceC6901du interfaceC6901du, int i5) {
        super(i, i2, i3, c13609qq, c12014ne.Clone(), c13609qq2, i4, interfaceC6901du, i5);
        this.f18267wl = C10019k4.m49185h4();
        m26329k4();
    }

    /* JADX INFO: renamed from: k4 */
    private static int m26328k4(double d) {
        return (int) ((d * 65536.0d) + 0.5d);
    }

    /* JADX INFO: renamed from: k4 */
    private void m26329k4() {
        this.f18263bv = new int[256];
        this.f18264qq = new int[256];
        this.f18265um = new int[256];
        this.f18262ar = new int[256];
        int i = 0;
        int i2 = -128;
        while (i < 255) {
            this.f18263bv[i] = C5666m9.m23128kk((m26328k4(1.402d) * i2) + 32768, 16);
            this.f18264qq[i] = C5666m9.m23128kk((m26328k4(1.772d) * i2) + 32768, 16);
            this.f18265um[i] = (-m26328k4(0.71414d)) * i2;
            this.f18262ar[i] = ((-m26328k4(0.34414d)) * i2) + 32768;
            i++;
            i2++;
        }
    }

    @Override // com.aspose.slides.internal.p279mr.AbstractC6413bs
    /* JADX INFO: renamed from: k4 */
    public void mo26309k4(byte[] bArr, int i, int i2, int i3, int i4, byte[] bArr2, int i5, int i6, int i7) {
        for (int i8 = 0; i8 < i4; i8++) {
            int i9 = (this.f18224jd * i8) + i;
            int i10 = (i8 * i6) + i5;
            this.f18267wl.m16366k4();
            this.f18267wl.m16369x1();
            int i11 = i7;
            for (int i12 = 0; i12 < i3; i12++) {
                byte b = bArr[i9];
                int i13 = i9 + 2;
                byte b2 = bArr[i9 + 1];
                i9 += 3;
                byte b3 = bArr[i13];
                int iMo27030k4 = this.f18212rv.mo27030k4((C6487yn.m26333kk(b, b2, b3) & 255) | ((C6487yn.m26330k4(b, b2, b3) & 255) << 16) | ViewCompat.MEASURED_STATE_MASK | ((C6487yn.m26334x1(b, b2, b3) & 255) << 8));
                if (iMo27030k4 > ((AbstractC6413bs) this).f18210ks) {
                    iMo27030k4 = this.f18215x6;
                }
                byte b4 = (byte) ((((byte) (iMo27030k4 << i11)) & 255) | (this.f18266v4 & 255));
                this.f18266v4 = b4;
                i11 -= this.f18223h4;
                if (i11 < 0 || i12 + 1 == i3) {
                    i11 = this.f18211ne;
                    bArr2[i10] = b4;
                    this.f18266v4 = (byte) 0;
                    i10++;
                }
            }
        }
    }
}
