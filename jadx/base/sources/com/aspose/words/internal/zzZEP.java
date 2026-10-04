package com.aspose.words.internal;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes5.dex */
public final class zzZEP extends zzZEQ {
    protected zzYFB zzWKp;
    boolean zzWKq;
    zzYF6 zzWKr;
    zzYFD zzWKs;

    private zzZEP(zzZFE zzzfe, zzZFM zzzfm, zzZET zzzet, zzZHC zzzhc, zzZEW zzzew, boolean z) throws zzZQS {
        super(zzzfe, zzzfm, zzzet, zzzhc, zzzew, z);
        this.zzWKs = null;
        this.zzWKr = null;
        this.zzWKq = false;
        this.zzWKp = null;
    }

    private zzZGU zzXI(String str, String str2) throws IOException {
        int i = this.zzWQl & 2621473;
        URI uriZzxw = (str2 == null || str2.length() == 0) ? null : zzxw(str2);
        if ((this.zzWQl & 131072) != 0 && str != null && str.length() > 0) {
            return zzZGU.zzZ(str, uriZzxw, i, this.zzWQ6);
        }
        if (uriZzxw == null) {
            return null;
        }
        return zzZGU.zzZ(uriZzxw, i, this.zzWQ6);
    }

    private zzZGN zzY(zzZGU zzzgu, zzZGN zzzgn) throws zzZQS {
        zzZGN zzzgnZzZ = this.zzWLo.zzZ(zzzgu);
        if (zzzgnZzZ == null) {
            return null;
        }
        if (zzzgn == null || zzzgnZzZ.zzZ(zzzgn)) {
            return zzzgnZzZ;
        }
        return null;
    }

    public static zzZEP zzZ(zzZFM zzzfm, zzZET zzzet, zzZHC zzzhc, zzZFE zzzfe, boolean z) throws zzZQS {
        return new zzZEP(zzzfe, zzzfm, zzzet, zzzhc, zzZEY.zzY(zzzhc), z);
    }

    private URI zzxw(String str) throws IOException {
        zzZF1 zzzf1 = this.zzWKK;
        URL urlZzXNH = zzzf1 == null ? null : zzzf1.zzXNH();
        if (urlZzXNH == null) {
            return zzZDS.zzwR(str);
        }
        URL urlZzY = zzZDS.zzY(str, urlZzXNH);
        try {
            return new URI(urlZzY.toExternalForm());
        } catch (URISyntaxException e) {
            throw new IOException("Failed to construct URI for external subset, URL = " + urlZzY.toExternalForm() + ": " + e.getMessage());
        }
    }

    @Override // com.aspose.words.internal.zzZEY, com.aspose.words.internal.zzZQR
    public final Object getProperty(String str) {
        if (str.equals("javax.xml.stream.entities")) {
            zzXME();
            zzYFD zzyfd = this.zzWKs;
            if (zzyfd == null || !(zzyfd instanceof zzZGN)) {
                return null;
            }
            return new ArrayList(((zzZGN) zzyfd).zzXOE());
        }
        if (!str.equals("javax.xml.stream.notations")) {
            return super.getProperty(str);
        }
        zzXME();
        zzYFD zzyfd2 = this.zzWKs;
        if (zzyfd2 == null || !(zzyfd2 instanceof zzZGN)) {
            return null;
        }
        return new ArrayList(((zzZGN) zzyfd2).zzXOB());
    }

    @Override // com.aspose.words.internal.zzZEY
    public final void zzOZ(boolean z) throws zzZQS {
        zzZGN zzzgn;
        if (!zzgB(16)) {
            super.zzOZ(z);
            return;
        }
        char cZzxF = zzxF(" in DOCTYPE declaration");
        zzZGJ zzzgj = null;
        if (cZzxF == '[') {
            if (z) {
                ((zzZFM) this.zzWKK).zzZ(this.zzWNc, this.zzWMi, this.zzWKF);
            }
            try {
                zzZGN zzzgnZzZ = zzZGF.zzZ(this, this.zzWKK, this.zzWML, zzgB(32), this.zzWKx);
                cZzxF = zzxD(" in internal DTD subset");
                zzzgn = zzzgnZzZ;
            } finally {
                if (z) {
                    ((zzZFM) this.zzWKK).zzgR(this.zzWMi - 1);
                }
            }
        } else {
            zzzgn = null;
        }
        if (cZzxF != '>') {
            zzd(cZzxF, "; expected '>' to finish DOCTYPE declaration.");
        }
        zzYFD zzyfdZzXPm = this.zzWML.zzXPm();
        this.zzWKs = zzyfdZzXPm;
        if (zzyfdZzXPm == null) {
            String str = this.zzWLk;
            zzZGN zzzgnZzZ2 = (str == null && this.zzWLj == null) ? null : zzZ(str, this.zzWLj, zzzgn);
            if (zzzgn == null) {
                this.zzWKs = zzzgnZzZ2;
            } else if (zzzgnZzZ2 == null) {
                this.zzWKs = zzzgn;
            } else {
                this.zzWKs = zzzgn.zzZ(this, zzzgnZzZ2);
            }
        }
        zzYFD zzyfd = this.zzWKs;
        if (zzyfd == null) {
            this.zzWNX = null;
            return;
        }
        if (zzyfd instanceof zzZGN) {
            this.zzWNX = ((zzZGN) zzyfd).zzXOF();
        } else {
            zzY(this.zzWML.zzXPv(), zzZH9.zzWPS, "Value to set for property 'org.codehaus.stax2.propDtdOverride' not a native Woodstox DTD implementation (but " + this.zzWKs.getClass() + "): can not access full entity or notation information", null);
        }
        zzYF6 zzyf6ZzZ = this.zzWKs.zzZ(this.zzWLi);
        this.zzWKr = zzyf6ZzZ;
        this.zzWKq = true;
        if (zzyf6ZzZ instanceof zzZGJ) {
            zzZGJ zzzgj2 = (zzZGJ) zzyf6ZzZ;
            zzzgj2.zzXOy();
            if (zzzgj2.zzXOK()) {
                zzzgj = zzzgj2;
            }
        }
        this.zzWLi.zzZ(this.zzWKr, zzzgj);
    }

    @Override // com.aspose.words.internal.zzZER, com.aspose.words.internal.zzZEV
    public final void zzX(zzYF8 zzyf8) throws zzZQS {
        if (this.zzWKp == null) {
            super.zzX(zzyf8);
        }
    }

    @Override // com.aspose.words.internal.zzZEY
    public final void zzXMP() throws zzZQS {
        if (!zzgB(32) || this.zzWKq) {
            return;
        }
        zzZ((zzZQY) null, zzZH9.zzWPS, zzZH9.zzWPN, (Object) null, (Object) null);
    }

    @Override // com.aspose.words.internal.zzZEY
    public final zzYFD zzXMV() {
        this.zzWML.zzXPm();
        return this.zzWKs;
    }

    @Override // com.aspose.words.internal.zzZEY
    public final void zzgv(int i) throws zzZQS {
        int i2 = this.zzWL4;
        if (i2 == 0) {
            zzW(zzZH9.zzWPa, this.zzWLi.zzXMs(), zzZH9.zzgZ(i));
            return;
        }
        if (i2 == 1 || i2 == 2) {
            zzW(zzZH9.zzWP9, this.zzWLi.zzXMs(), null);
            return;
        }
        if (i2 == 3 || i2 == 4) {
            zzW(zzZH9.zzWP8, this.zzWLi.zzXMs(), zzZH9.zzgZ(i));
            return;
        }
        zzxJ("Internal error: trying to report invalid content for " + i);
    }

    private zzZGN zzZ(String str, String str2, zzZGN zzzgn) throws zzZQS {
        zzZGN zzzgnZzY;
        boolean zZzgB = zzgB(65536);
        try {
            zzZGU zzzguZzXI = zzXI(str, str2);
            if (zZzgB && (zzzgnZzY = zzY(zzzguZzXI, zzzgn)) != null) {
                return zzzgnZzY;
            }
            zzZF1 zzzf1ZzZ = null;
            if (str2 == null) {
                zzV("Can not resolve DTD with public id \"{0}\"; missing system identifier", this.zzWLk, null);
            }
            try {
                int i = this.zzWKx;
                if (i == 0) {
                    i = 256;
                }
                zzzf1ZzZ = zzZFH.zzZ(this.zzWKK, null, null, str, str2, this.zzWML.zzXPu(), this.zzWML, i);
            } catch (FileNotFoundException e) {
                zzV("(was {0}) {1}", e.getClass().getName(), e.getMessage());
            } catch (IOException e2) {
                zzZER.zzX(e2);
            }
            zzZGN zzzgnZzZ = zzZGF.zzZ(zzzf1ZzZ, this.zzWML, zzzgn, zzgB(32), this.zzWKx);
            if (zZzgB && zzzgnZzZ.zzXOG()) {
                this.zzWLo.zzZ(zzzguZzXI, zzzgnZzZ);
            }
            return zzzgnZzZ;
        } catch (IOException e3) {
            throw zzZER.zzY(e3);
        }
    }
}
