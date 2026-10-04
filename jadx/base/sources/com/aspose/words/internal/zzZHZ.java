package com.aspose.words.internal;

import java.nio.charset.Charset;
import java.nio.charset.CharsetDecoder;
import java.nio.charset.CharsetEncoder;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: loaded from: classes5.dex */
abstract class zzZHZ extends Charset {
    private static final List zzZHE = Arrays.asList("US-ASCII", "ISO-8859-1", "UTF-8", "UTF-16", "UTF-16LE", "UTF-16BE");
    zzZI1 zzZHC;
    final boolean zzZHD;

    public zzZHZ(String str, String[] strArr, String str2) {
        super(str, strArr);
        this.zzZHC = new zzZI1(str2);
        this.zzZHD = true;
    }

    @Override // java.nio.charset.Charset
    public boolean contains(Charset charset) {
        return zzZHE.contains(charset.name());
    }

    @Override // java.nio.charset.Charset
    public CharsetDecoder newDecoder() {
        return new zzZHY(this, this.zzZHC, this.zzZHD);
    }

    @Override // java.nio.charset.Charset
    public CharsetEncoder newEncoder() {
        return new zzZHX(this, this.zzZHC, this.zzZHD);
    }

    public abstract boolean zzZE(char c);

    public abstract byte zzcI();

    public abstract byte zzcJ();
}
