package com.aspose.slides.p559ms.System.Xml;

import com.aspose.slides.exceptions.ArgumentException;
import com.aspose.slides.internal.p294n9.AbstractC6760h4;
import com.aspose.slides.p559ms.System.AbstractC14092to;
import com.aspose.slides.p559ms.System.C14058fa;

/* JADX INFO: renamed from: com.aspose.slides.ms.System.Xml.m2 */
/* JADX INFO: loaded from: classes5.dex */
public class C13933m2 extends AbstractC6760h4 {

    /* JADX INFO: renamed from: k4 */
    private boolean f46644k4;

    /* JADX INFO: renamed from: to */
    private int f46645to = -1;

    public C13933m2(boolean z) {
        this.f46644k4 = z;
    }

    @Override // com.aspose.slides.internal.p294n9.AbstractC6760h4
    /* JADX INFO: renamed from: k4 */
    public int mo26685k4(byte[] bArr, int i, int i2) {
        return mo26686k4(bArr, i, i2, false);
    }

    @Override // com.aspose.slides.internal.p294n9.AbstractC6760h4
    /* JADX INFO: renamed from: k4 */
    public int mo26686k4(byte[] bArr, int i, int i2, boolean z) {
        int i3 = i2 + (this.f46645to >= 0 ? 1 : 0);
        if (!z || i3 % 2 == 0) {
            return i3 / 2;
        }
        throw new ArgumentException(C13968ri.m65819k4("Invalid byte was found at index {0}.", -1), (String) null);
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x002d  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x003c  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0070  */
    @Override // com.aspose.slides.internal.p294n9.AbstractC6760h4
    /* JADX INFO: renamed from: k4 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public int mo26687k4(byte[] bArr, int i, int i2, char[] cArr, int i3) {
        boolean z;
        int iMo26685k4 = mo26685k4(bArr, i, i2);
        int i4 = this.f46645to;
        if (i4 < 0) {
            if ((i2 & 1) != 0) {
                i2--;
                this.f46645to = bArr[i + i2] & 255;
            }
            z = this.f46644k4;
            if (z) {
                C14058fa.m66593k4(AbstractC14092to.m67208k4((Object) bArr), i, AbstractC14092to.m67208k4((Object) cArr), i3 * 2, i2);
                return iMo26685k4;
            }
            int i5 = i2 + i;
            if (z) {
                while (i < i5) {
                    int i6 = i + 1;
                    int i7 = bArr[i] & 255;
                    i += 2;
                    cArr[i3] = (char) ((bArr[i6] & 255) | (i7 << 8));
                    i3++;
                }
            } else {
                while (i < i5) {
                    int i8 = i + 1;
                    int i9 = bArr[i] & 255;
                    i += 2;
                    cArr[i3] = (char) (((bArr[i8] & 255) << 8) | i9);
                    i3++;
                }
            }
        } else if (i2 != 0) {
            int i10 = i + 1;
            int i11 = bArr[i] & 255;
            i2--;
            int i12 = i3 + 1;
            cArr[i3] = (char) (this.f46644k4 ? i11 | (i4 << 8) : (i11 << 8) | i4);
            this.f46645to = -1;
            i = i10;
            i3 = i12;
            if ((i2 & 1) != 0) {
            }
            z = this.f46644k4;
            if (z) {
            }
        }
        return iMo26685k4;
    }

    @Override // com.aspose.slides.internal.p294n9.AbstractC6760h4
    /* JADX INFO: renamed from: k4 */
    public void mo26739k4(byte[] bArr, int i, int i2, char[] cArr, int i3, int i4, boolean z, int[] iArr, int[] iArr2, boolean[] zArr) {
        iArr2[0] = 0;
        iArr[0] = 0;
        int i5 = this.f46645to;
        if (i5 >= 0) {
            if (i2 == 0) {
                zArr[0] = true;
                return;
            }
            int i6 = i + 1;
            int i7 = bArr[i] & 255;
            i2--;
            iArr[0] = 1;
            int i8 = i3 + 1;
            cArr[i3] = (char) (this.f46644k4 ? i7 | (i5 << 8) : (i7 << 8) | i5);
            i4--;
            iArr2[0] = iArr2[0] + 1;
            this.f46645to = -1;
            i = i6;
            i3 = i8;
        }
        int i9 = i4 * 2;
        if (i9 < i2) {
            zArr[0] = false;
            i2 = i9;
        } else {
            zArr[0] = true;
        }
        boolean z2 = this.f46644k4;
        if (z2) {
            int i10 = (i2 & (-2)) + i;
            if (z2) {
                int i11 = i;
                while (i11 < i10) {
                    int i12 = i11 + 1;
                    int i13 = bArr[i11] & 255;
                    i11 += 2;
                    cArr[i3] = (char) ((bArr[i12] & 255) | (i13 << 8));
                    i3++;
                }
            } else {
                int i14 = i;
                while (i14 < i10) {
                    int i15 = i14 + 1;
                    int i16 = bArr[i14] & 255;
                    i14 += 2;
                    cArr[i3] = (char) (((bArr[i15] & 255) << 8) | i16);
                    i3++;
                }
            }
        } else {
            C14058fa.m66593k4(AbstractC14092to.m67208k4((Object) bArr), i, AbstractC14092to.m67208k4((Object) cArr), i3 * 2, i2 & (-2));
        }
        iArr2[0] = (i2 / 2) + iArr2[0];
        iArr[0] = iArr[0] + i2;
        if ((i2 & 1) != 0) {
            this.f46645to = bArr[(i + i2) - 1] & 255;
        }
    }
}
