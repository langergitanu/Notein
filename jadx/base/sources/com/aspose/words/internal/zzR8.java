package com.aspose.words.internal;

import com.aspose.words.net.System.Data.DataRow;
import com.aspose.words.net.System.Data.DataRowView;
import com.aspose.words.net.System.Data.DataView;

/* JADX INFO: loaded from: classes5.dex */
final class zzR8 extends zzYU implements zzFP {
    static zzR8 zzMt = new zzR8();

    public interface zzZ extends Iterable {
    }

    private zzR8() {
        super(DataRowView.class);
    }

    @Override // com.aspose.words.internal.zzFP
    public final boolean zzM(Class cls) {
        return zzZ.class == cls || DataView.class.isAssignableFrom(cls);
    }

    @Override // com.aspose.words.internal.zzFP
    public final Class zzQR() {
        return DataRowView.class;
    }

    @Override // com.aspose.words.internal.zzFP
    public final Class zzQS() {
        return zzZ.class;
    }

    @Override // com.aspose.words.internal.zzYU
    public final DataRow zzY(Object obj) {
        return ((DataRowView) obj).getRow();
    }

    @Override // com.aspose.words.internal.zzAE, com.aspose.words.internal.zzAF
    public final boolean zzZ(Class cls) {
        return DataRowView.class.isAssignableFrom(cls);
    }
}
