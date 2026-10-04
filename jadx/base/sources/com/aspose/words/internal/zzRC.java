package com.aspose.words.internal;

import com.aspose.words.net.System.Data.IDataRecord;

/* JADX INFO: loaded from: classes5.dex */
final class zzRC extends zzAE implements zzFP, zzH9 {
    static zzRC zzME = new zzRC();

    public interface zzZ extends Iterable {
    }

    private zzRC() {
        super(zzYS.zzY(IDataRecord.class));
    }

    @Override // com.aspose.words.internal.zzFP
    public final boolean zzM(Class cls) {
        return zzKX.class == cls || zzZ.class == cls;
    }

    @Override // com.aspose.words.internal.zzFP
    public final Class zzQR() {
        return IDataRecord.class;
    }

    @Override // com.aspose.words.internal.zzFP
    public final Class zzQS() {
        return zzZ.class;
    }

    @Override // com.aspose.words.internal.zzH9
    public final Object zzW(Object obj) {
        return obj;
    }

    @Override // com.aspose.words.internal.zzH9
    public final Object zzX(Object obj) {
        return obj;
    }

    @Override // com.aspose.words.internal.zzAE, com.aspose.words.internal.zzAF
    public final zzAD zzZ(Object obj, String str) {
        int i;
        IDataRecord iDataRecord = (IDataRecord) obj;
        int iZzZ = zzZ(iDataRecord, str);
        if (iZzZ == -1) {
            return super.zzZ(obj, str);
        }
        Class fieldType = iDataRecord.getFieldType(iZzZ);
        if (zzRH.zzT(fieldType)) {
            fieldType = zzRH.zzS(fieldType);
            i = 8;
        } else {
            i = 7;
        }
        return new zzAD(this, Integer.valueOf(iZzZ), i, (Object) null, fieldType);
    }

    private static int zzZ(IDataRecord iDataRecord, String str) {
        for (int i = 0; i < iDataRecord.getFieldCount(); i++) {
            if (zzZYD.zzi(iDataRecord.getName(i), str)) {
                return i;
            }
        }
        return -1;
    }

    @Override // com.aspose.words.internal.zzAE, com.aspose.words.internal.zzAF
    public final Object zzZ(zzAD zzad, Object obj, Object obj2) throws Exception {
        int iZzAG = zzad.zzAG();
        if (iZzAG != 7 && iZzAG != 8) {
            return super.zzZ(zzad, obj, obj2);
        }
        Object value = ((IDataRecord) obj2).getValue(((Integer) obj).intValue());
        return iZzAG == 8 ? zzRH.zzL(value) : value;
    }

    @Override // com.aspose.words.internal.zzAE, com.aspose.words.internal.zzAF
    public final boolean zzZ(Class cls) {
        return IDataRecord.class.isAssignableFrom(cls);
    }
}
