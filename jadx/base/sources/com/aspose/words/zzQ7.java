package com.aspose.words;

import androidx.appcompat.view.menu.C21505OooO0Oo;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: classes6.dex */
final class zzQ7 extends zzMD {
    private zzMA zzZqG;
    private ArrayList<zzQ9> zzZqH;
    private zzQB zzZqI;

    public zzQ7(zzQB zzqb, ArrayList<zzQ9> arrayList) {
        arrayList.size();
        this.zzZqI = zzqb;
        this.zzZqH = arrayList;
        this.zzZqG = zzqb.zzZXs();
        Iterator<zzQ9> it = arrayList.iterator();
        while (it.hasNext()) {
            this.zzZqG = this.zzZqG.zzZ(it.next().zzZWu().zzZXs());
        }
    }

    @Override // com.aspose.words.zzMD
    public final zzMC zzMv(int i) {
        return new zzQ6(this, i);
    }

    public final zzQ9[] zzZWs() {
        zzQ9[] zzq9Arr = new zzQ9[this.zzZqH.size() + 1];
        int i = 0;
        zzq9Arr[0] = new zzPN(this.zzZqI);
        while (i < this.zzZqH.size()) {
            int i2 = i + 1;
            zzq9Arr[i2] = this.zzZqH.get(i);
            i = i2;
        }
        return zzq9Arr;
    }

    @Override // com.aspose.words.zzMD
    public final int zzZWt() {
        return ((zzQ9) C21505OooO0Oo.OooO00o(1, this.zzZqH)).zzZWu().zzZWt();
    }

    @Override // com.aspose.words.zzMD
    public final String zzZXr() {
        StringBuilder sb = new StringBuilder();
        com.aspose.words.internal.zzZNH.zzU(sb, this.zzZqI.zzZXt());
        Iterator<zzQ9> it = this.zzZqH.iterator();
        while (it.hasNext()) {
            com.aspose.words.internal.zzZNH.zzU(sb, it.next().zzZXt());
        }
        return sb.toString();
    }

    @Override // com.aspose.words.zzMD
    public final zzMA zzZXs() {
        return this.zzZqG;
    }

    @Override // com.aspose.words.zzMD
    public final String zzZXu() {
        StringBuilder sb = new StringBuilder();
        com.aspose.words.internal.zzZNH.zzU(sb, this.zzZqI.zzZXu());
        Iterator<zzQ9> it = this.zzZqH.iterator();
        while (it.hasNext()) {
            com.aspose.words.internal.zzZNH.zzU(sb, it.next().zzZXu());
        }
        return sb.toString();
    }
}
