package com.aspose.words;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes6.dex */
class zzYWG extends zzYWI {
    private com.aspose.words.internal.zzIM<Integer> zzXVr;
    private ArrayList<Node> zzYC3;

    public zzYWG(zzYWB zzywb, int... iArr) {
        super(zzywb);
        this.zzXVr = new com.aspose.words.internal.zzIM<>(iArr.length);
        for (int i : iArr) {
            this.zzXVr.add(Integer.valueOf(i));
        }
        this.zzYC3 = new ArrayList<>();
    }

    public static ArrayList<Node> zzY(zzYWB zzywb, int... iArr) {
        return new zzYWG(zzywb, iArr).zzYAp();
    }

    public boolean zzYAo() {
        return true;
    }

    public final ArrayList<Node> zzYAp() {
        this.zzYC3.clear();
        reset();
        while (zzYAu()) {
            if (this.zzXVr.contains(Integer.valueOf(next().getNodeType())) && zzYAo()) {
                this.zzYC3.add(next());
            }
        }
        return com.aspose.words.internal.zzZQG.zzY(this.zzYC3);
    }
}
