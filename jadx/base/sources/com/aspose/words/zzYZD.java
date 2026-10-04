package com.aspose.words;

import java.util.LinkedList;

/* JADX INFO: loaded from: classes6.dex */
final class zzYZD {
    private LinkedList<Object[]> zzYJ7 = new LinkedList<>();

    private void zzQ(Object[] objArr) {
        System.arraycopy(this.zzYJ7.removeFirst(), 0, objArr, 0, 2);
    }

    public final void flush() throws Exception {
        Object[] objArr = new Object[2];
        while (!isEmpty()) {
            zzQ(objArr);
            zzYZC zzyzc = (zzYZC) objArr[1];
            zzyzc.zzYDO().zzZ(zzyzc);
        }
    }

    public final boolean isEmpty() {
        return this.zzYJ7.size() <= 0;
    }

    public final void zzY(Object obj, zzYZC zzyzc) {
        this.zzYJ7.addLast(new Object[]{obj, zzyzc});
    }
}
