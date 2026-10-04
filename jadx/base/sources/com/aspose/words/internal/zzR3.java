package com.aspose.words.internal;

import com.aspose.words.net.System.Data.DataView;

/* JADX INFO: loaded from: classes5.dex */
final class zzR3 implements zzH9 {
    static zzR3 zzMo = new zzR3();

    private zzR3() {
    }

    @Override // com.aspose.words.internal.zzH9
    public final Object zzW(Object obj) {
        return ((DataView) obj).getTable();
    }

    @Override // com.aspose.words.internal.zzH9
    public final Object zzX(Object obj) {
        return obj;
    }

    @Override // com.aspose.words.internal.zzH9
    public final boolean zzZ(Class cls) {
        return DataView.class.isAssignableFrom(cls);
    }
}
