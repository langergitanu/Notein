package com.aspose.words.internal;

import com.aspose.words.ControlChar;
import com.google.mlkit.p567nl.translate.TranslateLanguage;
import com.orion.notein.richeditor.utils.p606io.IOUtils;

/* JADX INFO: loaded from: classes5.dex */
final class zzI3 {
    private int zzxc;
    private boolean zzxd;
    private StringBuilder zzxe;

    public zzI3() {
        this(false);
    }

    private void zzFS() {
        zzZNH.zzZ(this.zzxe, '\t', this.zzxc);
    }

    private void zzFT() {
        zzWi(this.zzxc - 1);
    }

    private void zzFU() {
        zzWi(this.zzxc + 1);
    }

    private void zzFV() {
        boolean z = this.zzxe.length() > 0;
        if (this.zzxd) {
            if (z) {
                this.zzxe.append(IOUtils.LINE_SEPARATOR_WINDOWS);
            }
            zzFS();
        } else if (z) {
            this.zzxe.append(ControlChar.SPACE_CHAR);
        }
    }

    private static String zzU(int i, String str) {
        return zzJB.zzWD(i) + str;
    }

    private void zzWi(int i) {
        this.zzxc = i;
        if (i < 0) {
            this.zzxc = 0;
        }
    }

    public final String toString() {
        return this.zzxe.toString();
    }

    public final void zzFW() {
        zzFT();
        zzFV();
        this.zzxe.append('}');
    }

    public final void zzFX() {
        zzFT();
        zzFV();
        this.zzxe.append('}');
    }

    public final void zzH(zzP9 zzp9) {
        float fZzOb = zzp9.zzOb();
        if (!zzAN.zzf(fZzOb)) {
            zzZ("left", fZzOb, TranslateLanguage.PORTUGUESE);
        }
        float fZzOa = zzp9.zzOa();
        if (!zzAN.zzf(fZzOa)) {
            zzZ("top", fZzOa, TranslateLanguage.PORTUGUESE);
        }
        zzP9 zzp92 = new zzP9(zzp9.zzOf(), zzp9.zzOe(), zzp9.zzOd(), zzp9.zzOc(), 0.0f, 0.0f);
        if (zzp92.isIdentity()) {
            return;
        }
        String strZzZ = zzZVC.zzZ(zzp92, 2, true);
        zzJ("-webkit-transform", strZzZ);
        zzJ("-moz-transform", strZzZ);
        zzJ("-ms-transform", strZzZ);
        zzJ("-o-transform", strZzZ);
        zzJ("transform", strZzZ);
    }

    public final void zzJ(String str, String str2) {
        zzFV();
        zzZNH.zzU(this.zzxe, str);
        this.zzxe.append(':');
        zzZNH.zzU(this.zzxe, str2);
        this.zzxe.append(';');
    }

    public final void zzK(String str, String str2) {
        zzFV();
        zzZNH.zzU(this.zzxe, "@media ");
        zzZNH.zzU(this.zzxe, str);
        if (!zzZKN.equals(str2, "")) {
            this.zzxe.append(ControlChar.SPACE_CHAR);
            zzZNH.zzU(this.zzxe, str2);
        }
        zzZNH.zzU(this.zzxe, " {");
        zzFU();
    }

    public final void zzW(String str, String str2, String str3) {
        if (zzZKN.equals(str2, str3)) {
            return;
        }
        zzJ(str, str2);
    }

    public final void zzY(String str, float f, String str2) {
        if (zzAN.zzS(f, 12.0f)) {
            return;
        }
        zzZ(str, f, str2);
    }

    public final void zzZ(String str, float f, String str2) {
        zzJ(str, zzZ(f, str2));
    }

    public final void zzZ0(String str) {
        zzFV();
        zzZNH.zzU(this.zzxe, str);
        zzZNH.zzU(this.zzxe, " {");
        zzFU();
    }

    public final void zzZU(long j) {
        zzZ("width", zzAN.zzZG(zzSA.pointToPixel(Float.intBitsToFloat((int) j))), "px");
        zzZ("height", zzAN.zzZG(zzSA.pointToPixel(zzZPW.zzYz(j))), "px");
    }

    public final void zzZV(long j) {
        zzZ("width", Float.intBitsToFloat((int) j), TranslateLanguage.PORTUGUESE);
        zzZ("height", zzZPW.zzYz(j), TranslateLanguage.PORTUGUESE);
    }

    public final void zzZW(long j) {
        zzZ("left", Float.intBitsToFloat((int) j), TranslateLanguage.PORTUGUESE);
        zzZ("top", zzZPY.zzYC(j), TranslateLanguage.PORTUGUESE);
    }

    public final void zzy(zzZQ4 zzzq4) {
        zzJ("clip", zzZVC.zze(zzzq4));
    }

    public zzI3(boolean z) {
        this.zzxe = new StringBuilder();
        this.zzxd = z;
    }

    public final void zzZ(String str, int i, String str2) {
        zzJ(str, zzU(i, str2));
    }

    public static String zzW(double d, String str) {
        return zzJB.zzX(d, 2) + str;
    }

    public static String zzZ(float f, String str) {
        return zzJB.zzV(f, 2) + str;
    }
}
