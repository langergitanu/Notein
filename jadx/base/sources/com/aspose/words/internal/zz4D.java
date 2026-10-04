package com.aspose.words.internal;

/* JADX INFO: loaded from: classes5.dex */
abstract class zz4D {
    public static zz4D zzZ(zz4W zz4w, zz47 zz47Var) throws Exception {
        zz4H zz4hZztC = zz4w.zzvc().zztC();
        int permissions = (zz4hZztC.getPermissions() | (-3904)) & (-4);
        String userPassword = zz4hZztC.getUserPassword();
        String ownerPassword = zzZYD.zzXk(zz4hZztC.getOwnerPassword()) ? zz4hZztC.getOwnerPassword() : zz4hZztC.getUserPassword();
        return zz4w.zzv7().zzvA() ? new zz4E(permissions, userPassword, ownerPassword) : new zz4F(permissions, userPassword, ownerPassword, zz47Var);
    }

    public abstract zz2V zzU7(int i);

    public abstract zz4G zzZ(zz4W zz4w);
}
