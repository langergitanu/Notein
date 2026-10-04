package com.aspose.slides.internal.p169hl;

import com.aspose.slides.exceptions.InvalidOperationException;
import com.aspose.slides.internal.p080dd.AbstractC3150x6;

/* JADX INFO: renamed from: com.aspose.slides.internal.hl.du */
/* JADX INFO: loaded from: classes.dex */
public class C4594du extends C4596k4 {
    public C4594du(AbstractC3150x6 abstractC3150x6) {
        super(abstractC3150x6);
    }

    /* JADX INFO: renamed from: k4 */
    private void m18990k4(int i, int i2) {
        this.f12849k4.writeByte((byte) (257 - i2));
        this.f12849k4.writeByte((byte) i);
    }

    @Override // com.aspose.slides.internal.p169hl.C4596k4, com.aspose.slides.internal.p080dd.AbstractC3150x6
    public void write(byte[] bArr, int i, int i2) {
        byte[] bArr2 = new byte[128];
        char c = 0;
        int i3 = 0;
        int i4 = 0;
        int i5 = 0;
        for (int i6 = 0; i6 < i2; i6++) {
            int i7 = i + i6;
            if (c != 0) {
                i4 = bArr[i7] & 255;
                i5 = bArr[i7 - 1] & 255;
            }
            if (c == 0) {
                i3 = 0;
                c = 1;
            } else if (c != 1) {
                if (c != 2) {
                    if (c != 3) {
                        throw new InvalidOperationException("Unknown RLE state.");
                    }
                    if (i4 != i5) {
                        m18990k4(i5, i3);
                        i3 = 0;
                        c = 1;
                    } else {
                        i3++;
                        if (i3 == 128) {
                            m18990k4(i4, i3);
                            c = 0;
                        }
                    }
                } else if (i4 == i5) {
                    m18991k4(bArr2, i3);
                    c = 3;
                    i3 = 2;
                } else {
                    bArr2[i3] = (byte) i5;
                    i3++;
                    if (i3 == 128) {
                        m18991k4(bArr2, i3);
                        i3 = 0;
                        c = 1;
                    }
                }
            } else if (i4 == i5) {
                c = 3;
                i3 = 2;
            } else {
                bArr2[0] = (byte) i5;
                c = 2;
                i3 = 1;
            }
        }
        if (c == 1 || c == 2) {
            bArr2[i3] = (byte) i4;
            m18991k4(bArr2, i3 + 1);
        } else {
            if (c != 3) {
                throw new InvalidOperationException("Unknown RLE state.");
            }
            m18990k4(i4, i3);
        }
        this.f12849k4.writeByte((byte) -127);
    }

    /* JADX INFO: renamed from: k4 */
    private void m18991k4(byte[] bArr, int i) {
        this.f12849k4.writeByte((byte) (i - 1));
        this.f12849k4.write(bArr, 0, i);
    }
}
