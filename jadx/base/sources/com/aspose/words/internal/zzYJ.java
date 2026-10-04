package com.aspose.words.internal;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes5.dex */
final class zzYJ {
    private zzHL zzXC;
    private ArrayList<zzHN> zzXf = new ArrayList<>();
    private zzZWL zzXe = new zzZWL();

    public zzYJ(zzHL zzhl) {
        this.zzXC = zzhl;
    }

    private void zzY(zzFA zzfa, boolean z) throws Exception {
        for (zzY3 zzy3 : zzY9.zzW(zzfa.getText(), z)) {
            this.zzXe.setText(zzy3.getText());
            while (this.zzXe.moveNext()) {
                zzZQG.zzZ(this.zzXf, zzZ(zzfa, this.zzXe.zzom(), zzy3.zzXn()));
            }
        }
    }

    public final ArrayList<zzHN> zzZ(zzFA zzfa, boolean z) throws Exception {
        zzYJ zzyj = new zzYJ(this.zzXC);
        zzyj.zzY(zzfa, z);
        return zzyj.zzXf;
    }

    private zzHN zzZ(zzFA zzfa, String str, boolean z) throws Exception {
        zzPM zzpmZzZr = zzfa.zzMa().zzZr();
        if (this.zzXe.zzYb() == 2) {
            str = " ";
        }
        String str2 = str;
        return new zzYL(zzfa, zzpmZzZr, str2, this.zzXe.zzYb(), zzZZH.zzZ(zzpmZzZr, str2, z, false, this.zzXC.zzMk(), this.zzXC.zzMj()));
    }
}
