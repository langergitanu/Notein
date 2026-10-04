package com.aspose.words.internal;

import com.aspose.words.net.System.Data.DataTable;

/* JADX INFO: loaded from: classes5.dex */
final class zzR5 implements zzH9 {
    static zzR5 zzMq = new zzR5();

    private zzR5() {
    }

    @Override // com.aspose.words.internal.zzH9
    public final Object zzW(Object obj) {
        return obj;
    }

    @Override // com.aspose.words.internal.zzH9
    public final Object zzX(Object obj) {
        return ((DataTable) obj).getRows();
    }

    @Override // com.aspose.words.internal.zzH9
    public final boolean zzZ(Class cls) {
        return DataTable.class.isAssignableFrom(cls);
    }
}
