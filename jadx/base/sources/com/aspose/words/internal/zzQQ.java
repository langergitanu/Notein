package com.aspose.words.internal;

import java.io.InputStream;
import java.util.Map;

/* JADX INFO: loaded from: classes5.dex */
final class zzQQ extends zz0V {
    private Object zzLf;
    private boolean zzLg;
    private boolean zzLh;
    private int zzLi;
    private zzH0 zzLj;

    public zzQQ(zzZZR zzzzr, zzH0 zzh0, Class cls, boolean z, boolean z2, Object obj) {
        super(zzzzr);
        this.zzLj = zzh0;
        this.zzLi = zzZ(zzh0, cls);
        this.zzLh = z;
        this.zzLg = z2;
        this.zzLf = obj;
    }

    private int zzQy() {
        return this.zzLh ? 2 : 0;
    }

    private static int zzZ(zzH0 zzh0, Class cls) {
        if (zzh0.zzs()) {
            return 4;
        }
        if (zzh0.getType() == byte[].class) {
            return 0;
        }
        if (InputStream.class.isAssignableFrom(zzh0.getType())) {
            return 1;
        }
        if (cls.isAssignableFrom(zzh0.zzw())) {
            return 2;
        }
        if (zzh0.getType() == String.class) {
            return 3;
        }
        throw new zzCW(zzZKN.format("An expression providing document data should return a byte array, a string, or an instance of type '{0}' or '{1}'.", zzZOP.class, cls));
    }

    @Override // com.aspose.words.internal.zz0V
    public final int zzZ(zzFS zzfs, zzZZR zzzzr, Map map, zz0U zz0u) throws Exception {
        Object objZzx = this.zzLj.zzx();
        if (objZzx != null && !zzZ(zzfs, zzzzr.zzEW(), objZzx)) {
            zz0u.zzxP().zzrm().add(zzfs.zzEN());
        }
        return 3;
    }

    private boolean zzZ(zzFS zzfs, Object obj, Object obj2) throws Exception {
        int i = this.zzLi;
        if (i == 0) {
            return zzfs.zzZ(obj, (byte[]) obj2, zzQy(), this.zzLg, this.zzLf);
        }
        if (i == 1) {
            return zzfs.zzZ(obj, zzZVQ.zz8(obj2), zzQy(), this.zzLg, this.zzLf);
        }
        if (i == 2) {
            return zzfs.zzZ(obj, obj2, zzQy(), this.zzLg, this.zzLf);
        }
        if (i == 3) {
            return zzZ(zzfs, obj, (String) obj2);
        }
        throw new IllegalStateException();
    }

    private boolean zzZ(zzFS zzfs, Object obj, String str) throws Exception {
        if (str.length() == 0) {
            return true;
        }
        byte bZzZ = zzfs.zzZ(obj, str, zzQy(), this.zzLg, this.zzLf);
        if (bZzZ != -1) {
            return bZzZ == 1;
        }
        byte[] bArrZzX6 = zzZYD.zzX6(str);
        if (bArrZzX6.length != 0) {
            return zzfs.zzZ(obj, bArrZzX6, zzQy(), this.zzLg, this.zzLf);
        }
        throw new IllegalStateException(zzZKN.format("Cannot load a document using the provided string value: '{0}'. A string expression providing document data should return a file path, an URI, or Base64-encoded document bytes.", str));
    }
}
