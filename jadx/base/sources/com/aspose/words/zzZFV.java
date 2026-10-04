package com.aspose.words;

import java.util.Iterator;

/* JADX INFO: loaded from: classes6.dex */
class zzZFV extends zzZFY {
    private boolean zzYnI;

    public zzZFV(String str) {
        super(str);
    }

    public final boolean getChecked() {
        return this.zzYnI;
    }

    @Override // com.aspose.words.zzZFY, com.aspose.words.OleControl
    public final void zzX(com.aspose.words.internal.zzAA zzaa) throws Exception {
        super.zzX(zzaa);
        Iterator<zzZK9> it = zzZIR.zzKQ(zzau()).zzZ31().zzKN("input").zzZ2B().iterator();
        while (it.hasNext()) {
            if ("checked".equals(it.next().getName())) {
                this.zzYnI = true;
                return;
            }
        }
    }
}
