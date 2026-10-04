package com.aspose.words.internal;

import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Reader;
import java.text.MessageFormat;

/* JADX INFO: loaded from: classes5.dex */
public final class zzZFA extends zzZFE {
    private int zzWMh;
    private int zzWMi;
    private char[] zzWMj;
    final String zzWMk;
    final Reader zzWMn;

    private zzZFA(String str, zzZF7 zzzf7, Reader reader, String str2) {
        super(str, zzzf7);
        this.zzWMn = reader;
        if (str2 == null && (reader instanceof InputStreamReader)) {
            str2 = ((InputStreamReader) reader).getEncoding();
        }
        this.zzWMk = str2;
    }

    private char zzXNh() throws IOException, zzZFV {
        if (this.zzWMi >= this.zzWMh) {
            zzXNi();
        }
        char[] cArr = this.zzWMj;
        int i = this.zzWMi;
        this.zzWMi = i + 1;
        return cArr[i];
    }

    private void zzXNi() throws IOException, zzZFV {
        int i = this.zzWMu;
        int i2 = this.zzWMh;
        this.zzWMu = i + i2;
        this.zzWMs -= i2;
        this.zzWMi = 0;
        Reader reader = this.zzWMn;
        char[] cArr = this.zzWMj;
        int i3 = reader.read(cArr, 0, cArr.length);
        this.zzWMh = i3;
        if (i3 <= 0) {
            throw new zzZFW(" in xml declaration", zzlj());
        }
    }

    private boolean zzXNj() throws IOException {
        this.zzWMi = 0;
        this.zzWMh = 0;
        while (true) {
            int i = this.zzWMh;
            if (i >= 7) {
                return true;
            }
            Reader reader = this.zzWMn;
            char[] cArr = this.zzWMj;
            int i2 = reader.read(cArr, i, cArr.length - i);
            if (i2 <= 0) {
                return false;
            }
            this.zzWMh += i2;
        }
    }

    private void zzXo(char c) throws IOException, zzZFV {
        char cZzXNh;
        if (c == '\r') {
            int i = this.zzWMi;
            if (i < this.zzWMh) {
                char[] cArr = this.zzWMj;
                this.zzWMi = i + 1;
                cZzXNh = cArr[i];
            } else {
                cZzXNh = zzXNh();
            }
            if (cZzXNh != '\n') {
                this.zzWMi--;
            }
        }
        this.zzWMt++;
        this.zzWMs = this.zzWMi;
    }

    public static zzZFA zzZ(String str, zzZF7 zzzf7, Reader reader, String str2) {
        return new zzZFA(str, zzzf7, reader, null);
    }

    @Override // com.aspose.words.internal.zzZFE
    public final String getInputEncoding() {
        return this.zzWMk;
    }

    @Override // com.aspose.words.internal.zzZFE
    public final int zzT(char[] cArr, int i) throws IOException, zzZFV {
        char cZzXNh;
        int length = cArr.length;
        int i2 = 0;
        while (true) {
            int i3 = this.zzWMi;
            if (i3 < this.zzWMh) {
                char[] cArr2 = this.zzWMj;
                this.zzWMi = i3 + 1;
                cZzXNh = cArr2[i3];
            } else {
                cZzXNh = zzXNh();
            }
            if (cZzXNh == '\r' || cZzXNh == '\n') {
                zzXo(cZzXNh);
            } else if (cZzXNh == 0) {
                zzXNl();
            }
            if (cZzXNh == i) {
                break;
            }
            if (i2 < length) {
                cArr[i2] = cZzXNh;
                i2++;
            }
        }
        if (i2 < length) {
            return i2;
        }
        return -1;
    }

    @Override // com.aspose.words.internal.zzZFE
    public final int zzXNm() throws IOException, zzZFV {
        char cZzXNh;
        while (true) {
            int i = this.zzWMi;
            if (i < this.zzWMh) {
                char[] cArr = this.zzWMj;
                this.zzWMi = i + 1;
                cZzXNh = cArr[i];
            } else {
                cZzXNh = zzXNh();
            }
            if (cZzXNh > ' ') {
                return cZzXNh;
            }
            if (cZzXNh == '\r' || cZzXNh == '\n') {
                zzXo(cZzXNh);
            } else if (cZzXNh == 0) {
                zzXNl();
            }
        }
    }

    @Override // com.aspose.words.internal.zzZFE
    public final int zzXNn() throws IOException, zzZFV {
        int i = this.zzWMi;
        if (i >= this.zzWMh) {
            return zzXNh();
        }
        char[] cArr = this.zzWMj;
        this.zzWMi = i + 1;
        return cArr[i];
    }

    @Override // com.aspose.words.internal.zzZFE
    public final void zzXNo() {
        this.zzWMi--;
    }

    @Override // com.aspose.words.internal.zzZFE
    public final int zzXNt() {
        return this.zzWMi - this.zzWMs;
    }

    @Override // com.aspose.words.internal.zzZFE
    public final int zzXNv() {
        return this.zzWMu + this.zzWMi;
    }

    @Override // com.aspose.words.internal.zzZFE
    public final zzZQY zzlj() {
        String str = this.zzYrz;
        zzZF7 zzzf7 = this.zzWMS;
        int i = this.zzWMu;
        return new zzZF2(str, zzzf7, (i + r4) - 1, this.zzWMt, this.zzWMi - this.zzWMs);
    }

    @Override // com.aspose.words.internal.zzZFE
    public final int zzxU(String str) throws IOException, zzZFV {
        char cZzXNh;
        int length = str.length();
        for (int i = 1; i < length; i++) {
            int i2 = this.zzWMi;
            if (i2 < this.zzWMh) {
                char[] cArr = this.zzWMj;
                this.zzWMi = i2 + 1;
                cZzXNh = cArr[i2];
            } else {
                cZzXNh = zzXNh();
            }
            if (cZzXNh != str.charAt(i)) {
                return cZzXNh;
            }
            if (cZzXNh == 0) {
                zzXNl();
            }
        }
        return 0;
    }

    @Override // com.aspose.words.internal.zzZFE
    public final Reader zzZ(zzZHC zzzhc, boolean z, int i) throws IOException, zzZQS {
        this.zzWMj = zzzhc == null ? new char[128] : zzzhc.zzXPi();
        zzXNj();
        if (this.zzWMh >= 7) {
            char[] cArr = this.zzWMj;
            int i2 = this.zzWMi;
            char c = cArr[i2];
            if (c == 65279) {
                int i3 = i2 + 1;
                this.zzWMi = i3;
                c = cArr[i3];
            }
            if (c == '<') {
                int i4 = this.zzWMi;
                if (cArr[i4 + 1] == '?' && cArr[i4 + 2] == 'x' && cArr[i4 + 3] == 'm' && cArr[i4 + 4] == 'l' && cArr[i4 + 5] <= ' ') {
                    this.zzWMi = i4 + 6;
                    zzQ(z, i);
                    if (this.zzWMq != null && this.zzWMk != null) {
                        zzZ(zzzhc);
                    }
                }
            } else if (c == 239) {
                throw new zzZFU("Unexpected first character (char code 0xEF), not valid in xml document: could be mangled UTF-8 BOM marker. Make sure that the Reader uses correct encoding or pass an InputStream instead");
            }
        }
        return this.zzWMi < this.zzWMh ? new zzZFC(zzzhc, this.zzWMn, this.zzWMj, this.zzWMi, this.zzWMh) : this.zzWMn;
    }

    private void zzZ(zzZHC zzzhc) throws zzZQS {
        String str = this.zzWMk;
        if (zzZDX.zzXv(str, this.zzWMq) || zzzhc.zzXPv() == null) {
            return;
        }
        new zzYF8(zzlj(), MessageFormat.format(zzZH9.zzWPO, this.zzWMq, str), 1, zzZH9.zzWPT);
    }
}
