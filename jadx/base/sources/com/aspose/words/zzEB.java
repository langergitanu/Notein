package com.aspose.words;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes6.dex */
class zzEB extends zzE9 {
    private ArrayList<zzFP> zzZbS;

    public zzEB(int i, ArrayList<zzFP> arrayList) {
        super(i, 4);
        this.zzZbS = arrayList;
    }

    @Override // com.aspose.words.zzE9, com.aspose.words.zzCF
    public final String getStringValue() {
        return zzE7.zzZ(getValue(), 1.0d, zzKJ(0));
    }

    @Override // com.aspose.words.zzCF
    public final double getValue() {
        if (zzZLe().get(0) != null) {
            return ((Double) zzZLe().get(0)).doubleValue();
        }
        return 0.0d;
    }

    @Override // com.aspose.words.zzCF
    public final boolean isDate() {
        return zzEW.zzRs(zzKJ(0));
    }

    public final String zzKJ(int i) {
        ArrayList<zzFP> arrayList = this.zzZbS;
        if (arrayList == null || arrayList.size() <= i) {
            return null;
        }
        return this.zzZbS.get(i).getFormatCode();
    }

    @Override // com.aspose.words.zzCF
    public final zzCF zzKK(int i) {
        return (i < 0 || i >= zzZLe().size() || zzZLe().get(i) == null) ? new zzFA(getIndex(), getValue()) : new zzE7(getIndex(), ((Double) zzZLe().get(i)).doubleValue(), zzKJ(i));
    }

    public final void zzd(ArrayList<zzFP> arrayList) {
        this.zzZbS = arrayList;
    }
}
