package com.aspose.words;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes6.dex */
final class zzZ25 {
    private zzZ1Y zzY48;
    private ArrayList<zzZ24> zzY49;
    private zzZ1M zzY4a;
    private IWarningCallback zzZG0;

    public zzZ25(zzY4T zzy4t, zzZ1M zzz1m, IWarningCallback iWarningCallback) {
        this(zzy4t, (zzZAM) null, zzz1m);
        this.zzZG0 = iWarningCallback;
    }

    private void zzQ(zzZAM zzzam) {
        for (zzZ24 zzz24 : this.zzY49) {
            zzz24.zzY47 = this.zzY4a.zzYHC();
            zzz24.zzV(zzzam);
        }
        this.zzY48.zzP(zzzam);
    }

    private void zzW(zzZ24 zzz24) {
        if (this.zzZG0 != null) {
            OooO00o.OooO0O0(this.zzZG0, 256, 23, com.aspose.words.internal.zzZKN.format("The ({0}) cannot be properly written into Markdown.", zzz24.getString()));
        }
    }

    private zzZ24 zzX(zzZ24 zzz24) {
        zzZ24 zzz242 = null;
        for (zzZ24 zzz243 : this.zzY49) {
            if (zzz243.isOpened() && zzz243.compareTo(zzz24) > 0 && (zzz242 == null || zzz243.compareTo(zzz242) < 0)) {
                zzz242 = zzz243;
            }
        }
        return zzz242;
    }

    private boolean zzY(zzZ24 zzz24) {
        zzX(zzz24);
        for (zzZ24 zzz242 : this.zzY49) {
            if (zzz242.zzYIB() && zzz24.zzT(zzz242) && !zzz24.zzYIY()) {
                zzz24.close();
                zzYIF();
                return false;
            }
        }
        zzz24.close();
        return true;
    }

    private void zzYIF() {
        for (zzZ24 zzz24 : this.zzY49) {
            if (zzz24.zzYIB()) {
                zzz24.zzTp(false);
                zzW(zzz24);
            }
        }
    }

    private void zzYIG() {
        for (zzZ24 zzz24 : this.zzY49) {
            if (zzz24.getState() == 2) {
                zzZ(zzz24);
            }
        }
    }

    private void zzYIH() {
        zzZ24 zzz24ZzX;
        for (zzZ24 zzz24 : this.zzY49) {
            if (zzz24.getState() == 2) {
                do {
                    zzz24ZzX = zzX(zzz24);
                } while (zzz24.zzU(zzz24ZzX));
                if (zzz24ZzX == null) {
                    zzz24.close();
                }
            }
        }
    }

    private void zzYII() {
        boolean z;
        do {
            z = false;
            for (zzZ24 zzz24 : this.zzY49) {
                if (zzz24.getState() == 2 && zzX(zzz24) == null) {
                    zzz24.close();
                    z = true;
                }
            }
        } while (z);
    }

    private void zzYIJ() {
        if (this.zzY48.getState() == 2) {
            this.zzY48.close();
        }
        zzYII();
        zzYIH();
        zzYIG();
    }

    private boolean zzZ(zzZ24 zzz24) {
        if (!zzz24.isOpened()) {
            return true;
        }
        zzZ24 zzz24ZzX = zzX(zzz24);
        if (zzz24ZzX != null && !zzZ(zzz24ZzX)) {
            return false;
        }
        if (zzz24.getState() == 2) {
            return zzY(zzz24);
        }
        zzz24.close();
        zzz24.zzTp(true);
        return true;
    }

    public final void zzR(zzZAM zzzam) {
        zzQ(zzzam);
        zzYIJ();
        if (this.zzY48.getState() == 1) {
            zzYIK();
            this.zzY48.open();
        }
    }

    public final boolean zzYID() {
        return this.zzY48.isOpened();
    }

    public final boolean zzYIE() {
        return this.zzY48.getState() == 1;
    }

    public final void zzYIK() {
        for (zzZ24 zzz24 : this.zzY49) {
            if (zzz24.zzYIB()) {
                zzz24.open();
            }
        }
    }

    public zzZ25(zzY4T zzy4t, zzZAM zzzam, zzZ1M zzz1m) {
        if (zzzam != null) {
            this.zzZG0 = zzzam.getDocument_IInline().getWarningCallback();
        }
        this.zzY4a = zzz1m;
        ArrayList<zzZ24> arrayList = new ArrayList<>();
        this.zzY49 = arrayList;
        com.aspose.words.internal.zzZQG.zzZ((ArrayList<zzZ29>) arrayList, new zzZ29(zzy4t, zzzam));
        com.aspose.words.internal.zzZQG.zzZ((ArrayList<zzZ1X>) this.zzY49, new zzZ1X(zzy4t, zzzam));
        com.aspose.words.internal.zzZQG.zzZ((ArrayList<zzZ1S>) this.zzY49, new zzZ1S(zzy4t, zzzam));
        com.aspose.words.internal.zzZQG.zzZ((ArrayList<zzZ1R>) this.zzY49, new zzZ1R(zzy4t, zzzam));
        com.aspose.words.internal.zzZQG.zzZ((ArrayList<zzZ1Q>) this.zzY49, new zzZ1Q(zzy4t, zzzam));
        if (this.zzY4a.zzYHF().getExportUnderlineFormatting()) {
            com.aspose.words.internal.zzZQG.zzZ((ArrayList<zzZ1O>) this.zzY49, new zzZ1O(zzy4t, zzzam));
        }
        this.zzY48 = new zzZ1Y(zzy4t, zzzam);
    }
}
