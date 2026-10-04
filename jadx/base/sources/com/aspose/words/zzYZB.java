package com.aspose.words;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes6.dex */
final class zzYZB {
    private int zzXZP;
    private String zzXZQ;
    private String zzXZR;
    private boolean zzZiG;

    public zzYZB(byte[] bArr) throws Exception {
        this.zzZiG = false;
        if (bArr == null) {
            return;
        }
        ArrayList<String> arrayListZzZG = com.aspose.words.internal.zzEF.zzZG(bArr);
        int iZzZU = com.aspose.words.internal.zzEF.zzZU(bArr);
        if (iZzZU != 2) {
            if (iZzZU != 3) {
                return;
            }
            if (arrayListZzZG.size() == 5 || arrayListZzZG.size() == 3) {
                arrayListZzZG.set(1, arrayListZzZG.get(1) + arrayListZzZG.get(2));
                arrayListZzZG.remove(2);
            }
        } else {
            if (arrayListZzZG.size() <= 4) {
                return;
            }
            arrayListZzZG.set(3, com.aspose.words.internal.zzZKN.format("{0}", Integer.valueOf(arrayListZzZG.get(3).charAt(0))));
            arrayListZzZG.remove(4);
        }
        if ("IconOnly".equals(arrayListZzZG.get(0))) {
            if (arrayListZzZG.size() > 1) {
                this.zzXZR = arrayListZzZG.get(1);
            }
            if (arrayListZzZG.size() > 2) {
                this.zzXZQ = arrayListZzZG.get(2);
            }
            if (arrayListZzZG.size() > 3) {
                this.zzXZP = com.aspose.words.internal.zzJB.parseInt(arrayListZzZG.get(3));
            }
            this.zzZiG = true;
        }
    }

    public final boolean isValid() {
        return this.zzZiG;
    }

    public final String zzYDL() {
        return this.zzXZR;
    }
}
