package com.aspose.words;

import java.util.Map;

/* JADX INFO: loaded from: classes6.dex */
final class zzY1P {
    private com.aspose.words.internal.zzZOR zzWVe;
    private zzY1S zzWVf;
    private zzYUD zzYOH;
    private zzYDZ zzZFZ;

    public zzY1P(zzYDZ zzydz, zzY1S zzy1s) {
        this.zzZFZ = zzydz;
        this.zzWVf = zzy1s;
        this.zzYOH = new zzYUD(this.zzZFZ.zzYfy.getStyles());
    }

    private static com.aspose.words.internal.zzZOR zzH(com.aspose.words.internal.zzAA zzaa) throws Exception {
        com.aspose.words.internal.zzKD zzkd = new com.aspose.words.internal.zzKD(zzaa);
        com.aspose.words.internal.zzZOR zzzor = new com.aspose.words.internal.zzZOR();
        zzkd.zzL(zzzor);
        zzzor.zzH(0L);
        com.aspose.words.internal.zzZOR zzzor2 = new com.aspose.words.internal.zzZOR();
        com.aspose.words.internal.zzZYQ.zzZ((int) zzzor.getLength(), zzzor2);
        com.aspose.words.internal.zzZRV.zzZ(zzzor, zzzor2, 1);
        return zzzor2;
    }

    private void zzXSG() throws Exception {
        this.zzZFZ.zzYdg();
        com.aspose.words.internal.zzKD zzkd = new com.aspose.words.internal.zzKD(com.aspose.words.internal.zzZOZ.zzZXP);
        for (Map.Entry entry : this.zzZFZ.zzXp8) {
            zzkd.zzIf().zzZ((String) entry.getKey(), zzH((com.aspose.words.internal.zzAA) entry.getValue()));
        }
        if (zzkd.zzIf().getCount() > 0) {
            com.aspose.words.internal.zzZOR zzzor = new com.aspose.words.internal.zzZOR();
            this.zzWVe = zzzor;
            zzkd.zzL(zzzor);
        }
    }

    public final Document getDocument() {
        return this.zzZFZ.zzYfy;
    }

    public final String zzFs(int i) {
        return this.zzYOH.zzFs(i);
    }

    public final com.aspose.words.internal.zzZOR zzXSH() throws Exception {
        if (this.zzWVe == null) {
            zzXSG();
        }
        return this.zzWVe;
    }

    public final WordML2003SaveOptions zzXSI() {
        return (WordML2003SaveOptions) this.zzZFZ.zzXpa;
    }
}
