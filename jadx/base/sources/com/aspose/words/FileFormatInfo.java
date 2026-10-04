package com.aspose.words;

import java.nio.charset.Charset;

/* JADX INFO: loaded from: classes6.dex */
public class FileFormatInfo {
    private com.aspose.words.internal.zzZO0 zzMW;
    private boolean zzYUA;
    private com.aspose.words.internal.zzKD zzYzD;
    private boolean zzYzF;
    private boolean zzYzG;
    boolean zzYzI = false;
    private int zzYzH = 255;
    private int zzYzE = 0;
    private int zzYzC = 0;

    public Charset getEncoding() {
        return com.aspose.words.internal.zzZO0.zzX(this.zzMW);
    }

    public int getLoadFormat() {
        return this.zzYzH;
    }

    public boolean hasDigitalSignature() {
        return this.zzYzG;
    }

    public boolean isEncrypted() {
        return this.zzYUA;
    }

    public final void setLoadFormat(int i) {
        this.zzYzH = i;
    }

    public final void zzCa(int i) {
        this.zzYzC = i;
    }

    public final void zzCb(int i) {
        this.zzYzE = i;
    }

    public final void zzVL(boolean z) {
        this.zzYzF = z;
    }

    public final void zzVM(boolean z) {
        this.zzYzG = z;
    }

    public final void zzVN(boolean z) {
        this.zzYUA = z;
    }

    public final void zzY(com.aspose.words.internal.zzKD zzkd) {
        this.zzYzD = zzkd;
    }

    public final void zzZ(com.aspose.words.internal.zzZO0 zzzo0) {
        this.zzMW = zzzo0;
    }

    public final int zzZ9T() {
        return this.zzYzC;
    }

    public final boolean zzZ9U() {
        return this.zzYzF;
    }

    public final com.aspose.words.internal.zzKD zzZ9V() {
        return this.zzYzD;
    }

    public final boolean zzZ9W() {
        int i = this.zzYzH;
        return i == 11 || i == 22 || i == 23 || i == 26 || i == 27;
    }

    public final int zzZ9X() {
        return this.zzYzE;
    }

    public final com.aspose.words.internal.zzZO0 zzZ9Y() {
        return this.zzMW;
    }
}
