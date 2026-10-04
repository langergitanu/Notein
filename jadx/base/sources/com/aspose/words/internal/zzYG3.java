package com.aspose.words.internal;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.Writer;

/* JADX INFO: loaded from: classes5.dex */
public final class zzYG3 extends BufferedWriter {
    private char[] buf;

    /* JADX INFO: renamed from: eW */
    private final int f50807eW;

    public zzYG3(Writer writer) {
        super(writer);
        this.buf = new char[64];
        String strLineSeparator = zzYGI.lineSeparator();
        if (strLineSeparator != null) {
            this.f50807eW = strLineSeparator.length();
        } else {
            this.f50807eW = 2;
        }
    }

    private void zzVD(byte[] bArr) throws IOException {
        char[] cArr;
        int i;
        byte[] bArrEncode = zzYGH.encode(bArr);
        int length = 0;
        while (length < bArrEncode.length) {
            int i2 = 0;
            while (true) {
                cArr = this.buf;
                if (i2 == cArr.length || (i = length + i2) >= bArrEncode.length) {
                    break;
                }
                cArr[i2] = (char) bArrEncode[i];
                i2++;
            }
            write(cArr, 0, i2);
            newLine();
            length += this.buf.length;
        }
    }

    private void zzw7(String str) throws IOException {
        write("-----END " + str + "-----");
        newLine();
    }

    private void zzw8(String str) throws IOException {
        write("-----BEGIN " + str + "-----");
        newLine();
    }

    public final void zzZ(zzYG4 zzyg4) throws IOException {
        zzYG5 zzyg5ZzXyj = zzyg4.zzXyj();
        zzw8(zzyg5ZzXyj.getType());
        if (!zzyg5ZzXyj.zzXyl().isEmpty()) {
            for (zzYG6 zzyg6 : zzyg5ZzXyj.zzXyl()) {
                write(zzyg6.getName());
                write(": ");
                write(zzyg6.getValue());
                newLine();
            }
            newLine();
        }
        zzVD(zzyg5ZzXyj.zzXyk());
        zzw7(zzyg5ZzXyj.getType());
    }
}
