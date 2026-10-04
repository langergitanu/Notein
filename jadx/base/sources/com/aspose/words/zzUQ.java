package com.aspose.words;

import com.aspose.words.ref.RefInt;
import java.util.HashMap;

/* JADX INFO: loaded from: classes6.dex */
final class zzUQ {
    private HashMap<Integer, Integer> zzZv8;

    /* JADX WARN: Multi-variable type inference failed */
    public final void zzI(Node node) {
        if (node.getNodeType() == 19 || node.getNodeType() == 33 || node.getNodeType() == 34) {
            zzZA1 zzza1 = (zzZA1) node;
            if (this.zzZv8 == null) {
                this.zzZv8 = new HashMap<>();
            }
            RefInt refInt = new RefInt(0);
            boolean zZzZ = com.aspose.words.internal.zzZQF.zzZ(this.zzZv8, Integer.valueOf(zzza1.getIdInternal()), refInt);
            int iZzZpW = refInt.get();
            if (!zZzZ) {
                iZzZpW = node.getDocument().zzZpW();
                com.aspose.words.internal.zzZQF.zzY(this.zzZv8, Integer.valueOf(zzza1.getIdInternal()), Integer.valueOf(iZzZpW));
            }
            zzza1.setIdInternal(iZzZpW);
            RefInt refInt2 = new RefInt(0);
            boolean zZzZ2 = com.aspose.words.internal.zzZQF.zzZ(this.zzZv8, Integer.valueOf(zzza1.getParentIdInternal()), refInt2);
            int i = refInt2.get();
            if (zZzZ2) {
                zzza1.setParentIdInternal(i);
            }
        }
    }
}
