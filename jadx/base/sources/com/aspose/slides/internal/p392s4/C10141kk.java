package com.aspose.slides.internal.p392s4;

import com.aspose.slides.exceptions.EndOfStreamException;
import com.aspose.slides.internal.p550zi.C13618wy;
import com.google.common.base.Ascii;

/* JADX INFO: renamed from: com.aspose.slides.internal.s4.kk */
/* JADX INFO: loaded from: classes4.dex */
public class C10141kk {

    /* JADX INFO: renamed from: k4 */
    private static final byte[] f36466k4 = {1, 3, 7, 15, 31, 63, Ascii.DEL, -1};

    /* JADX INFO: renamed from: kk */
    private int f36467kk;

    /* JADX INFO: renamed from: to */
    private int f36468to = -1;

    /* JADX INFO: renamed from: x1 */
    private final C13618wy f36469x1;

    public C10141kk(C13618wy c13618wy) {
        this.f36469x1 = c13618wy;
    }

    /* JADX INFO: renamed from: k4 */
    public int m49894k4(int i) {
        int i2 = 0;
        int i3 = 0;
        while (i > 0) {
            int i4 = this.f36468to;
            if (i4 < 0 || 8 <= i4) {
                int iM62847c5 = this.f36469x1.m62847c5();
                this.f36467kk = iM62847c5;
                this.f36468to = 0;
                if (iM62847c5 == -1) {
                    throw new EndOfStreamException();
                }
            }
            int i5 = this.f36468to;
            int i6 = (i5 + i) - 8 > 0 ? 8 - i5 : i;
            int i7 = this.f36467kk;
            i2 |= ((f36466k4[i6 - 1] & 255) & i7) << i3;
            i3 += i6;
            int i8 = i5 + i6;
            this.f36468to = i8;
            if (i8 < 8) {
                this.f36467kk = i7 >> i6;
            }
            i -= i6;
        }
        return i2;
    }

    /* JADX INFO: renamed from: k4 */
    public int m49895k4(byte[] bArr, int i, int i2) {
        m49896k4();
        return this.f36469x1.m62852k4(bArr, i, i2);
    }

    /* JADX INFO: renamed from: k4 */
    public void m49896k4() {
        this.f36468to = -1;
    }
}
