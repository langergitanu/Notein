package com.aspose.words;

import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: classes6.dex */
final class zzZSE {
    private static int zzYIY = 4;
    private Object[] zzYIZ = new Object[zzYIY];

    private ArrayList<zzZBG> zzDU(int i) {
        return (ArrayList) this.zzYIZ[i];
    }

    public final void zzDV(int i) throws Exception {
        ArrayList<zzZBG> arrayListZzDU = zzDU(i);
        if (arrayListZzDU == null) {
            return;
        }
        Iterator<zzZBG> it = arrayListZzDU.iterator();
        while (it.hasNext()) {
            it.next().zzZhW();
        }
    }

    public final boolean zzZ(int i, zzZBG zzzbg) {
        ArrayList<zzZBG> arrayListZzDU = zzDU(i);
        if (arrayListZzDU == null) {
            arrayListZzDU = new ArrayList<>();
            this.zzYIZ[i] = arrayListZzDU;
        } else {
            Iterator<zzZBG> it = arrayListZzDU.iterator();
            while (it.hasNext()) {
                if (zzzbg.zzZhV() == it.next().zzZhV()) {
                    return false;
                }
            }
        }
        com.aspose.words.internal.zzZQG.zzZ(arrayListZzDU, zzzbg);
        return true;
    }
}
