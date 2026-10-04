package com.aspose.slides.p559ms.System.Xml;

import com.aspose.slides.internal.p294n9.AbstractC6760h4;

/* JADX INFO: renamed from: com.aspose.slides.ms.System.Xml.j5 */
/* JADX INFO: loaded from: classes5.dex */
public abstract class AbstractC13917j5 extends AbstractC6760h4 {

    /* JADX INFO: renamed from: k4 */
    public byte[] f46578k4 = new byte[4];

    /* JADX INFO: renamed from: to */
    public int f46579to = 0;

    @Override // com.aspose.slides.internal.p294n9.AbstractC6760h4
    /* JADX INFO: renamed from: k4 */
    public int mo26685k4(byte[] bArr, int i, int i2) {
        return (i2 + this.f46579to) / 4;
    }

    /* JADX INFO: renamed from: x1 */
    public abstract int mo65353x1(byte[] bArr, int i, int i2, char[] cArr, int i3);

    @Override // com.aspose.slides.internal.p294n9.AbstractC6760h4
    /* JADX INFO: renamed from: k4 */
    public int mo26687k4(byte[] bArr, int i, int i2, char[] cArr, int i3) {
        AbstractC13917j5 abstractC13917j5;
        char[] cArr2;
        int iMo65353x1;
        int i4;
        byte[] bArr2;
        int i5;
        int i6;
        int i7;
        if (this.f46579to > 0) {
            while (true) {
                i7 = this.f46579to;
                if (i7 >= 4 || i2 <= 0) {
                    break;
                }
                this.f46578k4[i7] = bArr[i];
                i++;
                i2--;
                this.f46579to = i7 + 1;
            }
            if (i7 < 4) {
                return 0;
            }
            abstractC13917j5 = this;
            cArr2 = cArr;
            iMo65353x1 = abstractC13917j5.mo65353x1(this.f46578k4, 0, 4, cArr2, i3);
            abstractC13917j5.f46579to = 0;
            bArr2 = bArr;
            i5 = i;
            i6 = i2;
            i4 = i3 + iMo65353x1;
        } else {
            abstractC13917j5 = this;
            cArr2 = cArr;
            iMo65353x1 = 0;
            i4 = i3;
            bArr2 = bArr;
            i5 = i;
            i6 = i2;
        }
        int i8 = i5;
        int i9 = i6;
        int iMo65353x12 = abstractC13917j5.mo65353x1(bArr2, i5, i6, cArr2, i4) + iMo65353x1;
        int i10 = i9 & 3;
        if (i10 >= 0) {
            System.arraycopy(bArr2, (i8 + i9) - i10, abstractC13917j5.f46578k4, 0, i10);
            abstractC13917j5.f46579to = i10;
        }
        return iMo65353x12;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m65488k4(long j, char[] cArr, int i) {
        long j2 = j & 4294967295L;
        cArr[i] = (char) (((char) (4294967295L & (((j2 >> 16) & 4294967295L) - 1))) + 55296 + ((char) ((j2 >> 10) & 63)));
        cArr[i + 1] = (char) (((char) (j & 1023)) + 56320);
    }

    @Override // com.aspose.slides.internal.p294n9.AbstractC6760h4
    /* JADX INFO: renamed from: k4 */
    public void mo26739k4(byte[] bArr, int i, int i2, char[] cArr, int i3, int i4, boolean z, int[] iArr, int[] iArr2, boolean[] zArr) {
        int i5;
        int i6;
        int i7;
        int iMo65353x1;
        int i8;
        iArr[0] = 0;
        iArr2[0] = 0;
        int i9 = this.f46579to;
        if (i9 > 0) {
            while (i9 < 4 && i2 > 0) {
                this.f46578k4[i9] = bArr[i];
                i++;
                i2--;
                iArr[0] = iArr[0] + 1;
                i9++;
            }
            if (i9 < 4) {
                this.f46579to = i9;
                zArr[0] = true;
                return;
            }
            iMo65353x1 = mo65353x1(this.f46578k4, 0, 4, cArr, i3);
            int i10 = i3 + iMo65353x1;
            int i11 = i4 - iMo65353x1;
            iArr2[0] = iMo65353x1;
            this.f46579to = 0;
            if (i11 == 0) {
                zArr[0] = i2 == 0;
                return;
            } else {
                i5 = i;
                i7 = i11;
                i6 = i10;
            }
        } else {
            i5 = i;
            i6 = i3;
            i7 = i4;
            iMo65353x1 = 0;
        }
        int i12 = i7 * 4;
        if (i12 < i2) {
            zArr[0] = false;
            i8 = i12;
        } else {
            zArr[0] = true;
            i8 = i2;
        }
        iArr[0] = iArr[0] + i8;
        iArr2[0] = mo65353x1(bArr, i5, i8, cArr, i6) + iMo65353x1;
        int i13 = i8 & 3;
        if (i13 >= 0) {
            System.arraycopy(bArr, (i5 + i8) - i13, this.f46578k4, 0, i13);
            this.f46579to = i13;
        }
    }
}
