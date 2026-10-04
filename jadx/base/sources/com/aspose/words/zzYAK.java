package com.aspose.words;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes6.dex */
final class zzYAK {
    private com.aspose.words.internal.zzZQC<zzYW5> zzXcs;

    public zzYAK(zzYWB zzywb) {
        com.aspose.words.internal.zzZQC<zzYW5> zzzqc = new com.aspose.words.internal.zzZQC<>();
        this.zzXcs = zzzqc;
        zzzqc.push(new zzYW5(zzywb));
    }

    private zzYW5 zzY5K() {
        return this.zzXcs.peek();
    }

    public final void reset() {
        while (this.zzXcs.size() > 1) {
            this.zzXcs.pop();
        }
        zzY5K().reset();
    }

    public final void zz6(Node node, Node node2) {
        this.zzXcs.push(new zzYW5(new zzYWB(node, node2)));
    }

    public final boolean zzSE(boolean z) {
        boolean zZzSE = zzY5K().zzSE(z);
        while (!zZzSE && this.zzXcs.size() > 1) {
            this.zzXcs.pop();
            zZzSE = zzY5K().zzSE(z);
        }
        return zZzSE;
    }

    public final zzZYT zzYWt() {
        return zzY5K().zzYWt();
    }

    public final void zzYZ(ArrayList<Node> arrayList) {
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            zz6(arrayList.get(size), arrayList.get(size));
        }
    }
}
