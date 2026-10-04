package com.aspose.words;

import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: classes6.dex */
final class zzGM extends com.aspose.words.internal.zz6 {
    private Object[] zzZfZ;
    private com.aspose.words.internal.zzG zzZg1;
    private com.aspose.words.internal.zzZQC<com.aspose.words.internal.zzG> zzZg0 = new com.aspose.words.internal.zzZQC<>();
    private com.aspose.words.internal.zzZQC<Object[]> zzZfY = new com.aspose.words.internal.zzZQC<>();

    public static void zzD(com.aspose.words.internal.zzG zzg) throws Exception {
        zzg.zzZ(new zzGM());
    }

    @Override // com.aspose.words.internal.zz6
    public final void zzY(com.aspose.words.internal.zzG zzg) throws Exception {
        int i = 0;
        int size = 0;
        while (true) {
            Object[] objArr = this.zzZfZ;
            if (i >= objArr.length) {
                this.zzZg1 = this.zzZg0.pop();
                this.zzZfZ = this.zzZfY.pop();
                super.zzY(zzg);
                return;
            }
            ArrayList arrayList = (ArrayList) objArr[i];
            if (arrayList != null) {
                int i2 = i + size;
                zzg.removeAt(i2);
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    zzg.zzZ(i2, (com.aspose.words.internal.zzZG) it.next());
                    i2++;
                }
                size = (arrayList.size() - 1) + size;
            }
            i++;
        }
    }

    @Override // com.aspose.words.internal.zz6
    public final boolean zzZ(com.aspose.words.internal.zzZS zzzs) {
        return false;
    }

    @Override // com.aspose.words.internal.zz6
    public final void zzZ(com.aspose.words.internal.zzG zzg) throws Exception {
        this.zzZg0.push(this.zzZg1);
        this.zzZg1 = zzg;
        this.zzZfY.push(this.zzZfZ);
        this.zzZfZ = new Object[zzg.getCount()];
        super.zzZ(zzg);
    }

    @Override // com.aspose.words.internal.zz6
    public final void zzZ(com.aspose.words.internal.zzZG zzzg) throws Exception {
        ArrayList<com.aspose.words.internal.zzZG> arrayListZzYv = com.aspose.words.internal.zz6J.zzZ(zzzg, new com.aspose.words.internal.zz6I(zzzg.zzZ2() == null ? new com.aspose.words.internal.zzPF() : zzzg.zzZ2().zzNO(), false, false, false)).zzYv();
        if (arrayListZzYv == null) {
            arrayListZzYv = new ArrayList<>();
        }
        this.zzZfZ[this.zzZg1.zzW(zzzg)] = arrayListZzYv;
        super.zzZ(zzzg);
    }
}
