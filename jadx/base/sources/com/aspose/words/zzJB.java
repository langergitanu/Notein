package com.aspose.words;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

/* JADX INFO: loaded from: classes6.dex */
final class zzJB {
    private HashMap<zz9K, zz5K> zzZik;
    private ArrayList<zzJA> zzZm = new ArrayList<>();
    private com.aspose.words.internal.zzZQ4 zzZij = new com.aspose.words.internal.zzZQ4();

    public zzJB(HashMap<zz9K, zz5K> map) {
        this.zzZik = map;
    }

    private void zzD(float f, float f2) {
        Iterator<zzJA> it = this.zzZm.iterator();
        while (it.hasNext()) {
            zzZ(it.next()).scale(f, f2);
        }
    }

    private zzJA zzY(zz9K zz9k) {
        zzJA zzja = new zzJA(zz9k);
        zzja.zzZZ(new com.aspose.words.internal.zzZQ4(zzZ(zzja).zzZSh().zzZE(), zz9k.zzZDQ()));
        return zzja;
    }

    public final void zzR(long j, boolean z) {
        int i = (int) j;
        float fIntBitsToFloat = Float.intBitsToFloat(i) < this.zzZij.getWidth() ? Float.intBitsToFloat(i) / this.zzZij.getWidth() : 1.0f;
        float fZzYz = com.aspose.words.internal.zzZPW.zzYz(j) < this.zzZij.getHeight() ? com.aspose.words.internal.zzZPW.zzYz(j) / this.zzZij.getHeight() : 1.0f;
        if (com.aspose.words.internal.zzAN.zzP(fIntBitsToFloat, 1.0f) && com.aspose.words.internal.zzAN.zzP(fZzYz, 1.0f)) {
            return;
        }
        if (z) {
            fIntBitsToFloat = Math.min(fIntBitsToFloat, fZzYz);
            fZzYz = Math.min(fIntBitsToFloat, fZzYz);
        }
        zzD(fIntBitsToFloat, fZzYz);
    }

    public final boolean zzYf(long j) {
        return com.aspose.words.internal.zzAN.zzR(this.zzZij.getWidth(), Float.intBitsToFloat((int) j)) && com.aspose.words.internal.zzAN.zzR(this.zzZij.getHeight(), com.aspose.words.internal.zzZPW.zzYz(j));
    }

    public final void zzZ(zz9K zz9k) {
        zzJA zzjaZzY = zzY(zz9k);
        com.aspose.words.internal.zzZQG.zzZ(this.zzZm, zzjaZzY);
        this.zzZij = com.aspose.words.internal.zzZQ4.zzT(this.zzZij, zzjaZzY.zzZSh());
    }

    public final com.aspose.words.internal.zzZQ4 zzZSh() {
        return this.zzZij;
    }

    public final void zzZSi() {
        for (zzJA zzja : this.zzZm) {
            zzja.zzZSg().zzXX(zzja.zzZSh().zzZE());
        }
    }

    public final void zzZSj() {
        long jZzG = com.aspose.words.internal.zzZPW.zzG(-this.zzZij.zzZm(), -this.zzZij.zzZo());
        for (zzJA zzja : this.zzZm) {
            zzja.zzZZ(new com.aspose.words.internal.zzZQ4(com.aspose.words.internal.zzZPY.zzC(zzja.zzZSh().zzZE(), jZzG), zzja.zzZSh().getSize()));
        }
        this.zzZij = new com.aspose.words.internal.zzZQ4(0L, this.zzZij.getSize());
    }

    public final void zzZSk() {
        Iterator<zzJA> it = this.zzZm.iterator();
        while (it.hasNext()) {
            zzZ(it.next()).zzZyA();
        }
    }

    private zz5K zzZ(zzJA zzja) {
        return this.zzZik.get(zzja.zzZSg());
    }

    public final void zzZ(zz9A zz9a) {
        for (zzJA zzja : this.zzZm) {
            zz9a.zzZ(zzja.zzZSg(), zzja.zzZSh());
        }
    }
}
