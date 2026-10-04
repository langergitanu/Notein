package com.aspose.words;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes6.dex */
final class zzZO2 {
    private ArrayList<String> zzYz9 = new ArrayList<>();
    private zzYLG zzYz8 = new zzYLG();

    public zzZO2() {
    }

    public final String zzBR(int i) {
        if (i >= this.zzYz9.size()) {
            return null;
        }
        return this.zzYz9.get(i);
    }

    public final void zzBV(int i) {
        if (this.zzYz9.size() == 0) {
            return;
        }
        this.zzYz8.add(i);
    }

    public final void zzZ(zzY92 zzy92, String str) throws Exception {
        for (int i = 0; i < this.zzYz8.getItemCount(); i++) {
            com.aspose.words.internal.zzZQG.zzZ(this.zzYz9, com.aspose.words.internal.zzZVR.zz2(str, zzy92.zzBR(this.zzYz8.getItem(i).zzXSJ())));
        }
    }

    public final zzYLG zzZ9F() {
        return this.zzYz8;
    }

    public zzZO2(zzZRA zzzra, com.aspose.words.internal.zzZOX zzzox) throws Exception {
        if (zzZRA.zzDL(zzzra.zzYHB)) {
            return;
        }
        zzZRG zzzrg = zzzra.zzYGE.zzXzN;
        if (zzzrg.zzYHJ == 0) {
            return;
        }
        this.zzYz8.zzZ(zzzox, zzzrg);
    }

    public final void zzZ(zzZRA zzzra, zzY92 zzy92, com.aspose.words.internal.zzZOW zzzow) throws Exception {
        if (this.zzYz9.size() == 0) {
            return;
        }
        for (int i = 0; i < this.zzYz8.getItemCount(); i++) {
            this.zzYz8.getItem(i).zzi6(zzy92.zzj(5, this.zzYz9.get(i)));
        }
        zzzra.zzYGE.zzXzN.zzYHK = (int) zzzow.zzq().getPosition();
        this.zzYz8.zzV(zzzow);
        zzzra.zzYGE.zzXzN.zzYHJ = (int) (zzzow.zzq().getPosition() - ((long) zzzra.zzYGE.zzXzN.zzYHK));
    }

    public final void zzZ(int i, SubDocument subDocument) {
        this.zzYz8.zzX(i, new zzY1V());
        com.aspose.words.internal.zzZQG.zzZ(this.zzYz9, subDocument.getFileName());
    }

    public final void zzZ(zzZO2 zzzo2, int i) {
        if (zzzo2.zzYz9.size() == 0) {
            return;
        }
        for (int i2 = 0; i2 < zzzo2.zzYz9.size(); i2++) {
            this.zzYz8.zzX(zzzo2.zzYz8.zzTe(i2) + i, new zzY1V());
            com.aspose.words.internal.zzZQG.zzZ(this.zzYz9, zzzo2.zzBR(i2));
        }
    }
}
