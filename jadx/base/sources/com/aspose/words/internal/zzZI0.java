package com.aspose.words.internal;

import com.aspose.slides.PatternStyle;
import java.nio.charset.Charset;
import java.nio.charset.CharsetDecoder;
import java.nio.charset.CharsetEncoder;

/* JADX INFO: loaded from: classes5.dex */
public final class zzZI0 extends zzZHZ {
    final String zzZHF;

    public zzZI0() {
        this("UTF-7", new String[]{"utf-7"});
    }

    @Override // com.aspose.words.internal.zzZHZ, java.nio.charset.Charset
    public final /* bridge */ /* synthetic */ boolean contains(Charset charset) {
        return super.contains(charset);
    }

    @Override // com.aspose.words.internal.zzZHZ, java.nio.charset.Charset
    public final /* bridge */ /* synthetic */ CharsetDecoder newDecoder() {
        return super.newDecoder();
    }

    @Override // com.aspose.words.internal.zzZHZ, java.nio.charset.Charset
    public final /* bridge */ /* synthetic */ CharsetEncoder newEncoder() {
        return super.newEncoder();
    }

    @Override // com.aspose.words.internal.zzZHZ
    public final boolean zzZE(char c) {
        return this.zzZHF.indexOf(c) >= 0;
    }

    @Override // com.aspose.words.internal.zzZHZ
    public final byte zzcI() {
        return PatternStyle.DottedGrid;
    }

    @Override // com.aspose.words.internal.zzZHZ
    public final byte zzcJ() {
        return PatternStyle.Sphere;
    }

    private zzZI0(String str, String[] strArr) {
        super(str, strArr, "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789+/");
        this.zzZHF = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789'(),-./:? \t\r\n";
    }
}
