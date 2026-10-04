package com.aspose.words.internal;

import com.aspose.slides.C22206OooOOo0;
import com.google.common.base.Ascii;
import java.io.IOException;

/* JADX INFO: loaded from: classes5.dex */
public abstract class zzZDP extends zzZD5 {
    protected final int tag;
    protected final byte[] zzWIK;
    protected final boolean zzWIL;

    public zzZDP(boolean z, int i, byte[] bArr) {
        this.zzWIL = z;
        this.tag = i;
        this.zzWIK = zzYGU.zzVI(bArr);
    }

    private static byte[] zzW(int i, byte[] bArr) throws IOException {
        int i2;
        if ((bArr[0] & 31) == 31) {
            byte b = bArr[1];
            int i3 = b & 255;
            if ((b & Ascii.DEL) == 0) {
                throw new IOException("corrupted stream - invalid high tag number found");
            }
            i2 = 2;
            while ((i3 & 128) != 0) {
                i3 = bArr[i2] & 255;
                i2++;
            }
        } else {
            i2 = 1;
        }
        int length = bArr.length - i2;
        byte[] bArr2 = new byte[length + 1];
        System.arraycopy(bArr, i2, bArr2, 1, length);
        bArr2[0] = 16;
        return bArr2;
    }

    public static zzZDP zzYF(Object obj) {
        if (obj == null || (obj instanceof zzZDP)) {
            return (zzZDP) obj;
        }
        throw new IllegalArgumentException(C22206OooOOo0.OooO0OO(obj, "unknown object in getInstance: "));
    }

    @Override // com.aspose.words.internal.zzZD5, com.aspose.words.internal.zzZDB
    public int hashCode() {
        boolean z = this.zzWIL;
        return ((z ? 1 : 0) ^ this.tag) ^ zzYGU.hashCode(this.zzWIK);
    }

    public String toString() {
        StringBuffer stringBuffer = new StringBuffer("[");
        if (this.zzWIL) {
            stringBuffer.append("CONSTRUCTED ");
        }
        stringBuffer.append("APPLICATION ");
        stringBuffer.append(Integer.toString(this.tag));
        stringBuffer.append("]");
        if (this.zzWIK != null) {
            stringBuffer.append(" #");
            stringBuffer.append(zzYGC.zzVE(this.zzWIK));
        } else {
            stringBuffer.append(" #null");
        }
        stringBuffer.append(" ");
        return stringBuffer.toString();
    }

    @Override // com.aspose.words.internal.zzZD5
    public final int zzXL6() throws IOException {
        return zzZBC.zzg3(this.tag) + zzZBC.zzg4(this.zzWIK.length) + this.zzWIK.length;
    }

    public final zzZD5 zzXL7() throws IOException {
        byte[] encoded = getEncoded();
        byte[] bArrZzW = zzW(16, encoded);
        if ((encoded[0] & 32) != 0) {
            bArrZzW[0] = (byte) (bArrZzW[0] | 32);
        }
        return zzZD5.zzXo(bArrZzW);
    }

    public final int zzXL8() {
        return this.tag;
    }

    public final byte[] zzXL9() {
        return zzYGU.zzVI(this.zzWIK);
    }

    @Override // com.aspose.words.internal.zzZD5
    public final boolean zzXLa() {
        return this.zzWIL;
    }

    @Override // com.aspose.words.internal.zzZD5
    public void zzZ(zzZD7 zzzd7) throws IOException {
        zzzd7.zzY(this.zzWIL ? 96 : 64, this.tag, this.zzWIK);
    }

    @Override // com.aspose.words.internal.zzZD5
    public final boolean zzZ(zzZD5 zzzd5) {
        if (!(zzzd5 instanceof zzZDP)) {
            return false;
        }
        zzZDP zzzdp = (zzZDP) zzzd5;
        return this.zzWIL == zzzdp.zzWIL && this.tag == zzzdp.tag && zzYGU.zzp(this.zzWIK, zzzdp.zzWIK);
    }
}
