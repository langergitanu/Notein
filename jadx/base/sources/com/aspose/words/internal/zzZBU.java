package com.aspose.words.internal;

import java.io.ByteArrayOutputStream;
import java.io.IOException;

/* JADX INFO: loaded from: classes5.dex */
public final class zzZBU extends zzZD5 implements zzZCZ {
    private static final char[] zzWIJ = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};
    private final byte[] zzWIn;

    public zzZBU(byte[] bArr) {
        this.zzWIn = zzYGU.zzVI(bArr);
    }

    @Override // com.aspose.words.internal.zzZCZ
    public final String getString() {
        StringBuffer stringBuffer = new StringBuffer("#");
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            new zzZD7(byteArrayOutputStream).zzY((zzZDK) this);
            byte[] byteArray = byteArrayOutputStream.toByteArray();
            for (int i = 0; i != byteArray.length; i++) {
                char[] cArr = zzWIJ;
                stringBuffer.append(cArr[(byteArray[i] >>> 4) & 15]);
                stringBuffer.append(cArr[byteArray[i] & 15]);
            }
            return stringBuffer.toString();
        } catch (IOException unused) {
            throw new zzZD6("internal error encoding UniversalString");
        }
    }

    @Override // com.aspose.words.internal.zzZD5, com.aspose.words.internal.zzZDB
    public final int hashCode() {
        return zzYGU.hashCode(this.zzWIn);
    }

    public final String toString() {
        return getString();
    }

    @Override // com.aspose.words.internal.zzZD5
    public final int zzXL6() {
        return zzZBC.zzg4(this.zzWIn.length) + 1 + this.zzWIn.length;
    }

    @Override // com.aspose.words.internal.zzZD5
    public final boolean zzXLa() {
        return false;
    }

    @Override // com.aspose.words.internal.zzZD5
    public final boolean zzZ(zzZD5 zzzd5) {
        if (zzzd5 instanceof zzZBU) {
            return zzYGU.zzp(this.zzWIn, ((zzZBU) zzzd5).zzWIn);
        }
        return false;
    }

    @Override // com.aspose.words.internal.zzZD5
    public final void zzZ(zzZD7 zzzd7) throws IOException {
        zzzd7.zzV(28, zzYGU.zzVI(this.zzWIn));
    }
}
