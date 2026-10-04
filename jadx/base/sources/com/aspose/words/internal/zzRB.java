package com.aspose.words.internal;

import com.aspose.words.net.System.Data.DataRow;
import com.aspose.words.net.System.Data.DataRowCollection;

/* JADX INFO: loaded from: classes5.dex */
final class zzRB extends zzYU implements zzFP {
    static zzRB zzMD = new zzRB();

    public interface zzZ extends Iterable {
    }

    private zzRB() {
        super(DataRow.class);
    }

    @Override // com.aspose.words.internal.zzFP
    public final boolean zzM(Class cls) {
        return zzZZM.class == cls || zzZ.class == cls || DataRowCollection.class.isAssignableFrom(cls);
    }

    @Override // com.aspose.words.internal.zzFP
    public final Class zzQR() {
        return DataRow.class;
    }

    @Override // com.aspose.words.internal.zzFP
    public final Class zzQS() {
        return zzZ.class;
    }

    @Override // com.aspose.words.internal.zzYU
    public final DataRow zzY(Object obj) {
        return (DataRow) obj;
    }

    @Override // com.aspose.words.internal.zzAE, com.aspose.words.internal.zzAF
    public final boolean zzZ(Class cls) {
        return DataRow.class.isAssignableFrom(cls);
    }
}
