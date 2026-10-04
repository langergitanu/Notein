package com.aspose.words.internal;

import com.orion.notein.domain.models.cloud.NoteInDriveError;

/* JADX INFO: loaded from: classes5.dex */
interface zzZ69 {
    public static final zzZDA zzWDS;
    public static final zzZDA zzWDT;
    public static final zzZDA zzWDU;
    public static final zzZDA zzWDV;
    public static final zzZDA zzWDW;

    static {
        zzZDA zzzda = new zzZDA("1.3.101");
        zzWDW = zzzda;
        zzWDV = zzzda.zzwP("110").zzXKK();
        zzWDU = zzzda.zzwP(NoteInDriveError.ERROR_UNKNOW).zzXKK();
        zzWDT = zzzda.zzwP("112").zzXKK();
        zzWDS = zzzda.zzwP("113").zzXKK();
    }
}
