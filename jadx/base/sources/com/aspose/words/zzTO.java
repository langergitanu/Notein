package com.aspose.words;

import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: classes6.dex */
final class zzTO {
    private Object[] zzZsU = new Object[6];
    private com.aspose.words.internal.zz7D<zzYAU> zzZsT = new com.aspose.words.internal.zz7D<>();
    private int zzZsS = 0;

    public final int zzMP(int i) {
        ArrayList<zzYAU> arrayListZzMQ = zzMQ(i);
        int iZzR = 0;
        if (arrayListZzMQ == null) {
            return 0;
        }
        Iterator<zzYAU> it = arrayListZzMQ.iterator();
        while (it.hasNext()) {
            iZzR += zzR(it.next());
        }
        return iZzR;
    }

    public final ArrayList<zzYAU> zzMQ(int i) {
        Object obj = this.zzZsU[i - 1];
        if (((ArrayList) obj) != null) {
            return (ArrayList) obj;
        }
        return null;
    }

    public final int zzR(zzYAU zzyau) {
        if (this.zzZsT.containsKey(zzyau)) {
            return this.zzZsT.get(zzyau);
        }
        return 0;
    }

    public final void zzZ(zzYAU zzyau, int i, int i2) {
        int i3 = i - 1;
        Object[] objArr = this.zzZsU;
        if (objArr[i3] == null) {
            objArr[i3] = new ArrayList();
        }
        ((ArrayList) this.zzZsU[i3]).add(zzyau);
        this.zzZsT.set(zzyau, i2);
        this.zzZsS += i2;
    }

    public final int zzZYn() {
        return this.zzZsS;
    }
}
