package com.aspose.words;

import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: classes6.dex */
final class zzAY extends zzAX {
    private ArrayList<zzAW> zzZ7A;

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        return com.aspose.words.internal.zzZ4.zzW(this, obj) && com.aspose.words.internal.zzBP.zzX(((zzAY) obj).zzZEX(), zzZEX());
    }

    public final int hashCode() {
        Iterator<zzAW> it = zzZEX().iterator();
        int iHashCode = 0;
        while (it.hasNext()) {
            iHashCode ^= it.next().hashCode();
        }
        return iHashCode;
    }

    @Override // com.aspose.words.zzAX
    public final void zzG(com.aspose.words.internal.zzOU zzou) {
        float[] fArr = new float[zzZEX().size() * 2];
        for (int i = 0; i < zzZEX().size(); i++) {
            zzAW zzaw = zzZEX().get(i);
            int i2 = i * 2;
            fArr[i2] = (float) zzaw.zzZEV();
            fArr[i2 + 1] = (float) zzaw.zzZEU();
        }
        zzou.setDashStyle(5);
        zzou.zzW(fArr);
    }

    @Override // com.aspose.words.zzAX
    public final int zzZEW() {
        return 0;
    }

    public final ArrayList<zzAW> zzZEX() {
        if (this.zzZ7A == null) {
            this.zzZ7A = new ArrayList<>();
        }
        return this.zzZ7A;
    }

    @Override // com.aspose.words.zzAX
    public final zzAX zzZEY() {
        zzAY zzay = new zzAY();
        zzay.zzZ7A = new ArrayList<>(zzZEX().size());
        Iterator<zzAW> it = zzZEX().iterator();
        while (it.hasNext()) {
            com.aspose.words.internal.zzZQG.zzZ(zzay.zzZEX(), it.next().zzZET());
        }
        return zzay;
    }
}
