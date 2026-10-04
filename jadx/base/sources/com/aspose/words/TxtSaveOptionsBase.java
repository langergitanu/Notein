package com.aspose.words;

import java.nio.charset.Charset;

/* JADX INFO: loaded from: classes6.dex */
public abstract class TxtSaveOptionsBase extends SaveOptions {
    private boolean zzX1p;
    private com.aspose.words.internal.zzZO0 zzMW = com.aspose.words.internal.zzZO0.zzhV();
    private String zzX1q = ControlChar.CR_LF;
    private int zzYmh = 1;

    private void zzR(com.aspose.words.internal.zzZO0 zzzo0) {
        if (zzzo0 == null) {
            throw new NullPointerException("Value cannot be null.\r\nParameter name: value");
        }
        this.zzMW = zzzo0;
    }

    public Charset getEncoding() {
        return com.aspose.words.internal.zzZO0.zzX(this.zzMW);
    }

    public int getExportHeadersFootersMode() {
        return this.zzYmh;
    }

    public boolean getForcePageBreaks() {
        return this.zzX1p;
    }

    public String getParagraphBreak() {
        return this.zzX1q;
    }

    public void setEncoding(Charset charset) {
        zzR(com.aspose.words.internal.zzZO0.zzZ(charset));
    }

    public void setExportHeadersFootersMode(int i) {
        this.zzYmh = i;
    }

    public void setForcePageBreaks(boolean z) {
        this.zzX1p = z;
    }

    public void setParagraphBreak(String str) {
        com.aspose.words.internal.zzZ4.zzY((Object) str, "ParagraphBreak");
        this.zzX1q = str;
    }

    public final com.aspose.words.internal.zzZO0 zzZ9Y() {
        return this.zzMW;
    }
}
