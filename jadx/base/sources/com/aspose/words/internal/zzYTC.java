package com.aspose.words.internal;

import java.util.Vector;

/* JADX INFO: loaded from: classes5.dex */
public final class zzYTC implements zzYTF {
    private Vector zzVY8;

    private void zzf1(int i) {
        int size = this.zzVY8.size();
        if (size <= i) {
            int[] iArrZzZy = (int[]) this.zzVY8.elementAt(size - 1);
            do {
                iArrZzZy = zzYGU.zzZy(iArrZzZy);
                zzYTD.zzS(iArrZzZy, iArrZzZy);
                this.zzVY8.addElement(iArrZzZy);
                size++;
            } while (size <= i);
        }
    }

    @Override // com.aspose.words.internal.zzYTF
    public final void init(byte[] bArr) {
        int[] iArrZzW6 = zzYTD.zzW6(bArr);
        Vector vector = this.zzVY8;
        if (vector == null || !zzYGU.zzv(iArrZzW6, (int[]) vector.elementAt(0))) {
            Vector vector2 = new Vector(8);
            this.zzVY8 = vector2;
            vector2.addElement(iArrZzW6);
        }
    }

    @Override // com.aspose.words.internal.zzYTF
    public final void zzZ(long j, byte[] bArr) {
        int[] iArrZzXCw = zzYTD.zzXCw();
        int i = 0;
        while (j > 0) {
            if ((1 & j) != 0) {
                zzf1(i);
                zzYTD.zzS(iArrZzXCw, (int[]) this.zzVY8.elementAt(i));
            }
            i++;
            j >>>= 1;
        }
        zzYTD.zzZ(iArrZzXCw, bArr);
    }
}
