package com.aspose.words.internal;

import android.graphics.Bitmap;
import java.io.InputStream;
import java.util.Map;

/* JADX INFO: loaded from: classes5.dex */
final class zzEJ extends zz0V {
    private int zzwe;
    private int zzwf;
    private zzH0 zzwg;

    public zzEJ(zzZZR zzzzr, zzH0 zzh0, int i) {
        super(zzzzr);
        this.zzwg = zzh0;
        this.zzwf = zzR(zzh0);
        this.zzwe = i;
    }

    private static int zzR(zzH0 zzh0) {
        if (zzh0.zzs()) {
            return 4;
        }
        if (zzh0.getType() == byte[].class) {
            return 0;
        }
        if (InputStream.class.isAssignableFrom(zzh0.getType())) {
            return 1;
        }
        if (Bitmap.class.isAssignableFrom(zzh0.getType())) {
            return 2;
        }
        if (zzh0.getType() == String.class) {
            return 3;
        }
        throw new zzCW(zzZKN.format("An expression providing image data should return a byte array, a string, or an instance of type '{0}' or '{1}'.", zzZOP.class, Bitmap.class));
    }

    private void zzY(zzFS zzfs, Object obj, String str) throws Exception {
        if (str.length() == 0 || zzfs.zzZ(obj, this.zzwe, str)) {
            return;
        }
        byte[] bArrZzX6 = zzZYD.zzX6(str);
        if (bArrZzX6.length == 0) {
            throw new IllegalStateException(zzZKN.format("Cannot load an image using the provided string value: '{0}'. A string expression providing image data should return a file path, an URI, or Base64-encoded image bytes.", str));
        }
        zzfs.zzZ(obj, this.zzwe, bArrZzX6);
    }

    @Override // com.aspose.words.internal.zz0V
    public final int zzZ(zzFS zzfs, zzZZR zzzzr, Map map, zz0U zz0u) throws Exception {
        Object objZzx = this.zzwg.zzx();
        if (objZzx == null) {
            return 0;
        }
        int i = this.zzwf;
        if (i == 0) {
            zzfs.zzZ(zzzzr.zzEW(), this.zzwe, (byte[]) objZzx);
        } else if (i == 1) {
            zzfs.zzZ(zzzzr.zzEW(), this.zzwe, zzZVQ.zz8(objZzx));
        } else if (i == 2) {
            zzfs.zzZ(zzzzr.zzEW(), this.zzwe, (Bitmap) objZzx);
        } else {
            if (i != 3) {
                throw new IllegalStateException();
            }
            zzY(zzfs, zzzzr.zzEW(), (String) objZzx);
        }
        return 0;
    }
}
