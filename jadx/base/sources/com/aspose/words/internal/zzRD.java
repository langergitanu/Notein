package com.aspose.words.internal;

import com.aspose.words.net.System.Data.IDataReader;

/* JADX INFO: loaded from: classes5.dex */
final class zzRD implements zzH9 {
    static zzRD zzMF = new zzRD();

    private zzRD() {
    }

    @Override // com.aspose.words.internal.zzH9
    public final Object zzW(Object obj) {
        return obj;
    }

    @Override // com.aspose.words.internal.zzH9
    public final Object zzX(Object obj) {
        return new zzKX((IDataReader) obj);
    }

    @Override // com.aspose.words.internal.zzH9
    public final boolean zzZ(Class cls) {
        return IDataReader.class.isAssignableFrom(cls);
    }
}
