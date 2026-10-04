package com.aspose.words.internal;

import OooOoo.C20593OooO0Oo;
import com.aspose.slides.internal.p332p7.C22237OooO0o0;
import com.aspose.words.StyleIdentifier;
import com.google.mlkit.p567nl.translate.TranslateLanguage;
import com.orion.notein.richeditor.converter.tagsoup.HTMLWriter;
import java.io.IOException;
import java.io.Reader;

/* JADX INFO: loaded from: classes5.dex */
public abstract class zzZFE {
    protected final zzZF7 zzWMS;
    String zzWMq;
    protected final String zzYrz;
    String zzZPQ;
    protected int zzWMu = 0;
    protected int zzWMt = 1;
    protected int zzWMs = 0;
    int zzWMr = 0;
    boolean zzWMp = false;
    final char[] zzWMo = new char[60];

    public zzZFE(String str, zzZF7 zzzf7) {
        this.zzYrz = str;
        this.zzWMS = zzzf7;
    }

    private final void zzO(String str, String str2, String str3, String str4) throws zzZFV {
        String strOooO00o = str3 == null ? "" : androidx.core.database.OooO00o.OooO00o("; expected \"", str3, "\" or \"", str4, "\"");
        if (str2 != null && str2.length() != 0) {
            throw new zzZFS(androidx.core.database.OooO00o.OooO00o("Invalid XML pseudo-attribute '", str, "' value ", str2, strOooO00o), zzlj());
        }
        throw new zzZFS(C22237OooO0o0.OooO00o("Missing XML pseudo-attribute '", str, "' value", strOooO00o), zzlj());
    }

    private final int zzXNp() throws IOException, zzZFV {
        int iZzXNn = zzXNn();
        if (iZzXNn == 63) {
            return iZzXNn;
        }
        if (iZzXNn > 32) {
            zze(iZzXNn, "; expected either '?' or white space");
        }
        if (iZzXNn == 10 || iZzXNn == 13) {
            zzXNo();
        }
        return zzXNm();
    }

    private final String zzXNq() throws IOException, zzZFV {
        int iZzxU = zzxU(HTMLWriter.STANDALONE);
        if (iZzxU != 0) {
            zze(iZzxU, HTMLWriter.STANDALONE);
        }
        int iZzT = zzT(this.zzWMo, zzxV(HTMLWriter.STANDALONE));
        if (iZzT == 2) {
            char[] cArr = this.zzWMo;
            if (cArr[0] == 'n' && cArr[1] == 'o') {
                return TranslateLanguage.NORWEGIAN;
            }
        } else if (iZzT == 3) {
            char[] cArr2 = this.zzWMo;
            if (cArr2[0] == 'y' && cArr2[1] == 'e' && cArr2[2] == 's') {
                return "yes";
            }
        }
        String strOooO0OO = iZzT < 0 ? androidx.concurrent.futures.OooO00o.OooO0OO(new StringBuilder("'"), new String(this.zzWMo), "[..]'") : iZzT == 0 ? "<empty>" : androidx.concurrent.futures.OooO00o.OooO0OO(new StringBuilder("'"), new String(this.zzWMo, 0, iZzT), "'");
        zzO(HTMLWriter.STANDALONE, strOooO0OO, "yes", TranslateLanguage.NORWEGIAN);
        return strOooO0OO;
    }

    private final String zzXNr() throws IOException, zzZFV {
        int iZzxU = zzxU("encoding");
        if (iZzxU != 0) {
            zze(iZzxU, "encoding");
        }
        int iZzT = zzT(this.zzWMo, zzxV("encoding"));
        if (iZzT == 0) {
            zzO("encoding", null, null, null);
        }
        return iZzT < 0 ? new String(this.zzWMo) : new String(this.zzWMo, 0, iZzT);
    }

    private final int zzXNs() throws IOException, zzZFV {
        int iZzxU = zzxU("version");
        if (iZzxU != 0) {
            zze(iZzxU, "version");
        }
        int iZzT = zzT(this.zzWMo, zzxV("version"));
        if (iZzT == 3) {
            char[] cArr = this.zzWMo;
            if (cArr[0] == '1' && cArr[1] == '.') {
                char c = cArr[2];
                if (c == '0') {
                    return 256;
                }
                if (c == '1') {
                    return StyleIdentifier.TABLE_GRID_LIGHT;
                }
            }
        }
        zzO("version", iZzT < 0 ? androidx.concurrent.futures.OooO00o.OooO0OO(new StringBuilder("'"), new String(this.zzWMo), "[..]'") : iZzT == 0 ? "<empty>" : androidx.concurrent.futures.OooO00o.OooO0OO(new StringBuilder("'"), new String(this.zzWMo, 0, iZzT), "'"), "1.0", "1.1");
        return 0;
    }

    private void zze(int i, String str) throws zzZFV {
        String strOooO00o;
        char c = (char) i;
        if (Character.isISOControl(c)) {
            strOooO00o = androidx.core.app.OooO.OooO00o(i, "Unexpected character (CTRL-CHAR, code ", ")", str);
        } else {
            strOooO00o = "Unexpected character '" + c + "' (code " + i + ")" + str;
        }
        throw new zzZFR(strOooO00o, zzlj(), c);
    }

    private final int zzxV(String str) throws IOException, zzZFV {
        int iZzXNm = zzXNm();
        if (iZzXNm != 61) {
            zze(iZzXNm, C20593OooO0Oo.OooO0O0("; expected '=' after '", str, "'"));
        }
        int iZzXNm2 = zzXNm();
        if (iZzXNm2 != 34 && iZzXNm2 != 39) {
            zze(iZzXNm2, C20593OooO0Oo.OooO0O0("; expected a quote character enclosing value for '", str, "'"));
        }
        return iZzXNm2;
    }

    public abstract String getInputEncoding();

    public final void zzQ(boolean z, int i) throws IOException, zzZFV {
        int iZzXNm = zzXNm();
        if (iZzXNm == 118) {
            this.zzWMr = zzXNs();
            iZzXNm = zzXNp();
        } else if (z) {
            zze(iZzXNm, "; expected keyword 'version'");
        }
        boolean z2 = this.zzWMr == 272;
        if (i != 0) {
            boolean z3 = 272 == i;
            this.zzWMp = z3;
            if (z2 && !z3) {
                zzxT(zzZH9.zzWPD);
            }
        } else {
            this.zzWMp = z2;
        }
        if (iZzXNm == 101) {
            this.zzWMq = zzXNr();
            iZzXNm = zzXNp();
        } else if (!z) {
            zze(iZzXNm, "; expected keyword 'encoding'");
        }
        if (z && iZzXNm == 115) {
            this.zzZPQ = zzXNq();
            iZzXNm = zzXNp();
        }
        if (iZzXNm != 63) {
            zze(iZzXNm, "; expected \"?>\" end marker");
        }
        int iZzXNn = zzXNn();
        if (iZzXNn != 62) {
            zze(iZzXNn, "; expected \"?>\" end marker");
        }
    }

    public abstract int zzT(char[] cArr, int i) throws IOException, zzZFV;

    public final void zzXNl() throws zzZFV {
        throw new zzZFV("Illegal null byte in input stream", zzlj());
    }

    public abstract int zzXNm() throws IOException, zzZFV;

    public abstract int zzXNn() throws IOException, zzZFV;

    public abstract void zzXNo();

    public abstract int zzXNt();

    public final int zzXNu() {
        return this.zzWMt;
    }

    public abstract int zzXNv();

    public final String zzXNw() {
        return this.zzWMq;
    }

    public final boolean zzXNx() {
        return this.zzWMr == 272;
    }

    public final int zzXNy() {
        return this.zzWMr;
    }

    public abstract Reader zzZ(zzZHC zzzhc, boolean z, int i) throws IOException, zzZQS;

    public final String zzfs() {
        return this.zzZPQ;
    }

    public abstract zzZQY zzlj();

    public final void zzxT(String str) throws zzZFV {
        throw new zzZFS(str, zzlj());
    }

    public abstract int zzxU(String str) throws IOException, zzZFV;
}
