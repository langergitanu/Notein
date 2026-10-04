package com.aspose.words;

import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: classes6.dex */
final class zz9U extends zz9W {
    public zz9U(zzAL zzal, zz93 zz93Var, zz6C zz6c) {
        super(zzal, zz93Var, zz6c);
    }

    @Override // com.aspose.words.zz9Y
    public final int zzZEb() {
        ArrayList<zz93> arrayListZzZEa = zzZEa();
        if (arrayListZzZEa.size() == 0) {
            return 1;
        }
        Iterator<zz93> it = arrayListZzZEa.iterator();
        int iMin = Integer.MAX_VALUE;
        int iMax = 0;
        while (it.hasNext()) {
            int iZzZ = this.zzZ6m.zzZ(it.next());
            iMin = Math.min(iMin, iZzZ);
            iMax = Math.max(iMax, iZzZ);
        }
        return (iMax - iMin) + 1;
    }
}
