package com.aspose.words;

import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: classes6.dex */
abstract class zzE9 extends zzCF {
    private ArrayList<Object> zzZbQ;
    private String zzZbR;

    public zzE9(int i, int i2) {
        super(i, i2);
        this.zzZbQ = new ArrayList<>();
    }

    @Override // com.aspose.words.zzCF
    public String getStringValue() {
        return this.zzZbR;
    }

    public final void zzK(Object obj, int i) {
        if (i >= 0) {
            while (this.zzZbQ.size() <= i) {
                com.aspose.words.internal.zzZQG.zzZ(this.zzZbQ, (Object) null);
            }
            this.zzZbQ.set(i, obj);
        } else {
            com.aspose.words.internal.zzZQG.zzZ(this.zzZbQ, obj);
        }
        String str = (String) com.aspose.words.internal.zzZKW.zzZ(obj, String.class);
        if (!com.aspose.words.internal.zzZKN.zzU3(str)) {
            this.zzZbR = com.aspose.words.internal.zzZKN.zzO(str, ControlChar.zzZs5, this.zzZbR);
        }
        zzZGd();
    }

    @Override // com.aspose.words.zzCF
    public final int zzZLd() {
        return this.zzZbQ.size();
    }

    public final ArrayList<Object> zzZLe() {
        return this.zzZbQ;
    }

    @Override // com.aspose.words.zzCF
    public final zzCF zzZLf() {
        zzE9 zze9 = (zzE9) super.zzZLf();
        zze9.zzZbQ = new ArrayList<>();
        Iterator<Object> it = this.zzZbQ.iterator();
        while (it.hasNext()) {
            com.aspose.words.internal.zzZQG.zzZ(zze9.zzZbQ, it.next());
        }
        return zze9;
    }
}
