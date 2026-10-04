package com.aspose.slides.p559ms.System.Xml;

import com.aspose.slides.exceptions.ArgumentNullException;
import com.aspose.slides.exceptions.ArgumentOutOfRangeException;
import com.aspose.slides.exceptions.XmlException;
import com.aspose.slides.p559ms.System.AbstractC14092to;
import com.aspose.slides.p559ms.System.C14113y2;

/* JADX INFO: renamed from: com.aspose.slides.ms.System.Xml.kk */
/* JADX INFO: loaded from: classes5.dex */
public class C13926kk extends AbstractC14020xw {

    /* JADX INFO: renamed from: du */
    private byte[] f46597du;

    /* JADX INFO: renamed from: k4 */
    private byte[] f46598k4;

    /* JADX INFO: renamed from: kk */
    private int f46599kk;

    /* JADX INFO: renamed from: to */
    private boolean[] f46600to;

    /* JADX INFO: renamed from: x1 */
    private int f46601x1;

    @Override // com.aspose.slides.p559ms.System.Xml.AbstractC14020xw
    /* JADX INFO: renamed from: k4 */
    public int mo65503k4(char[] cArr, int i, int i2) {
        if (cArr == null) {
            throw new ArgumentNullException("chars");
        }
        if (i2 < 0) {
            throw new ArgumentOutOfRangeException("len");
        }
        if (i < 0) {
            throw new ArgumentOutOfRangeException("startPos");
        }
        if (cArr.length - i < i2) {
            throw new ArgumentOutOfRangeException("len");
        }
        if (i2 == 0) {
            return 0;
        }
        int[] iArr = {0};
        int[] iArr2 = {0};
        m65501k4(cArr, i, i + i2, this.f46598k4, this.f46601x1, this.f46599kk, this.f46600to, this.f46597du, iArr2, iArr);
        this.f46601x1 += iArr[0];
        return iArr2[0];
    }

    /* JADX INFO: renamed from: k4 */
    private static void m65501k4(char[] cArr, int i, int i2, byte[] bArr, int i3, int i4, boolean[] zArr, byte[] bArr2, int[] iArr, int[] iArr2) {
        int i5;
        C14022y4 c14022y4Clone = C14022y4.m66318k4().Clone();
        int i6 = i;
        int i7 = i3;
        while (i6 < i2 && i7 < i4) {
            int i8 = i6 + 1;
            char c = cArr[i6];
            if (c >= 'a' && c <= 'f') {
                i5 = c - 'W';
            } else if (c >= 'A' && c <= 'F') {
                i5 = c - '7';
            } else if (c >= '0' && c <= '9') {
                i5 = c - '0';
            } else {
                if ((c14022y4Clone.f47099k4[c] & 1) == 0) {
                    throw new XmlException("'{0}' is not a valid BinHex text sequence.", C14113y2.m67406k4(cArr, 0, i2 - i));
                }
                i6 = i8;
            }
            byte b = (byte) i5;
            if (zArr[0]) {
                bArr[i7] = (byte) (((bArr2[0] & 255) << 4) + (b & 255));
                zArr[0] = false;
                i7++;
            } else {
                bArr2[0] = b;
                zArr[0] = true;
            }
            i6 = i8;
        }
        iArr2[0] = i7 - i3;
        iArr[0] = i6 - i;
    }

    @Override // com.aspose.slides.p559ms.System.Xml.AbstractC14020xw
    /* JADX INFO: renamed from: k4 */
    public boolean mo65504k4() {
        return this.f46601x1 == this.f46599kk;
    }

    /* JADX INFO: renamed from: k4 */
    public static byte[] m65502k4(char[] cArr, boolean z) {
        if (cArr == null) {
            throw new ArgumentNullException("chars");
        }
        int length = cArr.length;
        if (length == 0) {
            return new byte[0];
        }
        int i = (length + 1) / 2;
        byte[] bArr = new byte[i];
        int[] iArr = {0};
        boolean[] zArr = {false};
        m65501k4(cArr, 0, length, bArr, 0, i, zArr, new byte[]{0}, new int[]{0}, iArr);
        if (zArr[0] && !z) {
            throw new XmlException("'{0}' is not a valid BinHex text sequence. The sequence must contain an even number of characters.", C14113y2.m67405k4(cArr));
        }
        int i2 = iArr[0];
        if (i2 >= i) {
            return bArr;
        }
        byte[] bArr2 = new byte[i2];
        AbstractC14092to.m67216k4(AbstractC14092to.m67208k4((Object) bArr), 0, AbstractC14092to.m67208k4((Object) bArr2), 0, iArr[0]);
        return bArr2;
    }
}
