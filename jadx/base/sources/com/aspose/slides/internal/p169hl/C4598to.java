package com.aspose.slides.internal.p169hl;

import com.aspose.slides.internal.p080dd.AbstractC3150x6;
import com.aspose.slides.internal.p080dd.C3152yj;

/* JADX INFO: renamed from: com.aspose.slides.internal.hl.to */
/* JADX INFO: loaded from: classes.dex */
public class C4598to extends C4596k4 {

    /* JADX INFO: renamed from: c5 */
    private C4595h4 f12850c5;

    /* JADX INFO: renamed from: du */
    private final byte[] f12851du;

    /* JADX INFO: renamed from: dy */
    private int f12852dy;

    /* JADX INFO: renamed from: h4 */
    private int f12853h4;

    /* JADX INFO: renamed from: kk */
    private final int[] f12854kk;

    /* JADX INFO: renamed from: m9 */
    private int f12855m9;

    /* JADX INFO: renamed from: to */
    private final int[] f12856to;

    /* JADX INFO: renamed from: x1 */
    private C3152yj f12857x1;

    public C4598to(AbstractC3150x6 abstractC3150x6) {
        super(abstractC3150x6);
        this.f12854kk = new int[5021];
        this.f12856to = new int[5021];
        this.f12851du = new byte[5021];
    }

    /* JADX INFO: renamed from: k4 */
    private int m19002k4(int i, int i2) {
        int i3 = (i2 << (this.f12852dy - 8)) ^ i;
        int i4 = i3 == 0 ? 1 : 5021 - i3;
        while (this.f12854kk[i3] != -1 && (this.f12856to[i3] != i || this.f12851du[i3] != ((byte) i2))) {
            i3 -= i4;
            if (i3 < 0) {
                i3 += 5021;
            }
        }
        return i3;
    }

    /* JADX INFO: renamed from: kk */
    private void m19006kk() {
        if (this.f12855m9 != 128) {
            this.f12849k4.writeByte((byte) this.f12853h4);
        }
    }

    /* JADX INFO: renamed from: to */
    private void m19007to() {
        int i = this.f12857x1.readByte();
        if (i == -1) {
            i = 257;
        }
        m19004k4(256);
        int i2 = 258;
        while (true) {
            int i3 = this.f12857x1.readByte();
            if (i3 == -1) {
                m19004k4(i);
                m19004k4(257);
                m19006kk();
                return;
            }
            int iM19002k4 = m19002k4(i, i3);
            int i4 = this.f12852dy;
            if (i2 == (1 << i4)) {
                if (i4 < 12) {
                    this.f12852dy = i4 + 1;
                } else {
                    m19008x1();
                    m19004k4(256);
                    this.f12852dy = 9;
                    i2 = 258;
                }
            }
            int[] iArr = this.f12854kk;
            int i5 = iArr[iM19002k4];
            if (i5 != -1) {
                i = i5;
            } else {
                iArr[iM19002k4] = i2;
                this.f12856to[iM19002k4] = i;
                this.f12851du[iM19002k4] = (byte) i3;
                m19004k4(i);
                i = i3;
                i2++;
            }
        }
    }

    /* JADX INFO: renamed from: x1 */
    private void m19008x1() {
        int i = 0;
        while (true) {
            int[] iArr = this.f12854kk;
            if (i >= iArr.length) {
                return;
            }
            iArr[i] = -1;
            i++;
        }
    }

    @Override // com.aspose.slides.internal.p169hl.C4596k4, com.aspose.slides.internal.p080dd.AbstractC3150x6
    public void write(byte[] bArr, int i, int i2) {
        C4595h4 c4595h4 = this.f12850c5;
        if (c4595h4 != null) {
            C3152yj c3152yjM19001k4 = c4595h4.m19001k4(new C3152yj(bArr, i, i2));
            this.f12857x1 = c3152yjM19001k4;
            c3152yjM19001k4.setPosition(0L);
        } else {
            this.f12857x1 = new C3152yj(bArr, i, i2);
        }
        m19003k4();
        m19008x1();
        m19007to();
    }

    public C4598to(AbstractC3150x6 abstractC3150x6, int i, int i2, int i3, int i4) {
        this(abstractC3150x6);
        this.f12850c5 = i != 1 ? new C4595h4(i, i2, i3, i4) : null;
    }

    /* JADX INFO: renamed from: k4 */
    private void m19003k4() {
        this.f12853h4 = 0;
        this.f12855m9 = 128;
        this.f12852dy = 9;
    }

    /* JADX INFO: renamed from: k4 */
    private void m19004k4(int i) {
        for (int i2 = 1 << (this.f12852dy - 1); i2 != 0; i2 >>= 1) {
            m19005k4((i2 & i) != 0);
        }
    }

    /* JADX INFO: renamed from: k4 */
    private void m19005k4(boolean z) {
        if (z) {
            this.f12853h4 |= this.f12855m9;
        }
        int i = this.f12855m9 >> 1;
        this.f12855m9 = i;
        if (i == 0) {
            this.f12849k4.writeByte((byte) this.f12853h4);
            this.f12853h4 = 0;
            this.f12855m9 = 128;
        }
    }
}
