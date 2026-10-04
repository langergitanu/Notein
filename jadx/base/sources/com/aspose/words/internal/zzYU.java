package com.aspose.words.internal;

import com.aspose.words.net.System.Data.DataColumn;
import com.aspose.words.net.System.Data.DataRelation;
import com.aspose.words.net.System.Data.DataRow;
import com.aspose.words.net.System.Data.DataTable;

/* JADX INFO: loaded from: classes5.dex */
abstract class zzYU extends zzAE implements zzH9 {
    public zzYU(Class cls) {
        super(zzYS.zzY(cls));
    }

    public Object zzV(Object obj) {
        return zzY(obj).getTable();
    }

    @Override // com.aspose.words.internal.zzH9
    public final Object zzW(Object obj) {
        return zzV(obj);
    }

    @Override // com.aspose.words.internal.zzH9
    public final Object zzX(Object obj) {
        return obj;
    }

    public abstract DataRow zzY(Object obj);

    @Override // com.aspose.words.internal.zzAE, com.aspose.words.internal.zzAF
    public final zzAD zzZ(Object obj, String str) {
        zzRA zzraZzZ = zzR9.zzZ(this, (DataTable) obj, str);
        zzAD zzad = zzraZzZ.zzMC;
        if (zzad != null) {
            return zzad;
        }
        if (zzraZzZ.zzMB) {
            return null;
        }
        return super.zzZ(obj, str);
    }

    @Override // com.aspose.words.internal.zzAE, com.aspose.words.internal.zzAF
    public final Object zzZ(zzAD zzad, Object obj, Object obj2) throws Exception {
        int iZzAG = zzad.zzAG();
        if (iZzAG == 7) {
            return zzY(obj2).get((DataColumn) obj);
        }
        if (iZzAG == 8) {
            return zzRH.zzL(zzY(obj2).get((DataColumn) obj));
        }
        if (iZzAG != 9) {
            return super.zzZ(zzad, obj, obj2);
        }
        return new zzZZM(zzY(obj2), (DataRelation) obj);
    }
}
