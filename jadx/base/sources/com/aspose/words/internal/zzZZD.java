package com.aspose.words.internal;

import java.io.OutputStream;

/* JADX INFO: loaded from: classes5.dex */
public final class zzZZD {
    private boolean zzcG;
    private boolean zzcH;
    private String zzcI;
    private String zzcJ;
    private OutputStream zzcK;

    public zzZZD(String str, String str2) {
        zzZYD.zzXk(str);
        zzZYD.zzXk(str2);
        this.zzcJ = str;
        this.zzcI = str2;
    }

    public final boolean getKeepResourceStreamOpen() {
        return this.zzcG;
    }

    public final String getResourceFileName() {
        return this.zzcJ;
    }

    public final String getResourceFileUri() {
        return this.zzcI;
    }

    public final OutputStream getResourceStream() {
        return this.zzcK;
    }

    public final void setKeepResourceStreamOpen(boolean z) {
        this.zzcG = z;
    }

    public final void setResourceFileName(String str) throws Exception {
        zzZ4.zzU(str, "ResourceFileName");
        if (!zzZKN.equals(zzZOQ.zzVh(str), str)) {
            throw new IllegalArgumentException("ResourceFileName must be a file name without path.");
        }
        this.zzcJ = str;
    }

    public final void setResourceFileUri(String str) {
        zzZ4.zzU(str, "ResourceFileUri");
        this.zzcI = str;
        this.zzcH = true;
    }

    public final void setResourceStream(OutputStream outputStream) {
        this.zzcK = outputStream;
    }

    public final boolean zzro() {
        return this.zzcK != null;
    }

    public final boolean zzrp() {
        return this.zzcH;
    }
}
