package com.aspose.words;

import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes6.dex */
final class zzZQC extends zzZQF {
    private int zzL4;
    private HashMap<Node, Field> zzYRu;

    public zzZQC() {
        this(22);
    }

    @Override // com.aspose.words.zzZQF
    public final void zzZe8() {
        switch (this.zzL4) {
            case 22:
                this.zzYRu.put(zzZe7().getStart(), zzZe7());
                return;
            case 23:
                if (zzZe7().getSeparator() != null) {
                    this.zzYRu.put(zzZe7().getSeparator(), zzZe7());
                    return;
                }
                return;
            case 24:
                this.zzYRu.put(zzZe7().getEnd(), zzZe7());
                return;
            default:
                throw new IllegalArgumentException();
        }
    }

    public final Map<Node, Field> zzZqO() {
        return this.zzYRu;
    }

    public zzZQC(int i) {
        this.zzYRu = new HashMap<>();
        this.zzL4 = i;
    }
}
