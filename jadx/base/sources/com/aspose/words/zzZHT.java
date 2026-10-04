package com.aspose.words;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes6.dex */
final class zzZHT {
    private String zzYqp;
    private ArrayList<zzZHU> zzBA = new ArrayList<>();
    private StringBuilder zzYqq = new StringBuilder();

    private void zzZ24() {
        if (this.zzYqq.length() > 0) {
            com.aspose.words.internal.zzZQG.zzZ(this.zzBA, new zzZHU(this.zzYqq.toString(), this.zzYqp));
            this.zzYqq.setLength(0);
        }
    }

    public final zzZHU[] zzZ25() {
        zzZ24();
        return (zzZHU[]) this.zzBA.toArray(new zzZHU[0]);
    }

    public final void zzZ6(String str, String str2) {
        if (!com.aspose.words.internal.zzZKN.equals(this.zzYqp, str2)) {
            zzZ24();
        }
        com.aspose.words.internal.zzZNH.zzU(this.zzYqq, str);
        this.zzYqp = str2;
    }
}
