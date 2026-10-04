package com.aspose.words.internal;

import java.io.InputStream;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes5.dex */
final class zz24 {
    public static void zzZ(zzZOP zzzop, zz25 zz25Var, zzWZ zzwz, int i, zz4O zz4o) throws Exception {
        long position = zzzop.getPosition();
        zz25Var.zzZ(zzzop, position);
        zz25Var.zzZ(zzzop, zzZ(zz25Var.zzY(zzzop, position), zzwz, i, zz4o));
        zzzop.zzH(position);
    }

    private static byte[] zzZ(zzZOP zzzop, zzWZ zzwz, int i, zz4O zz4o) throws Exception {
        zzZ6H zzz6hZzZ = zz23.zzZ(zzwz, i).zzZ(new zzZ6K(zzZYQ.zzZX(zzzop)));
        if (zz4o != null) {
            zzz6hZzZ = zzZ(zzz6hZzZ, zz4o);
        }
        byte[] encoded = zzz6hZzZ.getEncoded();
        if (encoded.length <= 16000) {
            byte[] bArr = new byte[16000];
            zzZKV.zzZ(encoded, 0, bArr, 0, encoded.length);
            return bArr;
        }
        throw new IllegalStateException("Can't insert digital signature to the PDF document. The size of the digital signature exceeds allocated space.");
    }

    private static zzZ6H zzZ(zzZ6H zzz6h, zz4O zz4o) throws Exception {
        ArrayList arrayList = new ArrayList();
        for (zzZ63 zzz63 : zzz6h.zzXHl().zzXH9()) {
            zzZQG.zzZ((ArrayList<zzZ63>) arrayList, zz23.zzZ(zzz63, zzZ(zzz63.getSignature(), zz4o)));
        }
        return zzZ6H.zzZ(zzz6h, new zzZ62(arrayList));
    }

    private static zzYGW zzZ(byte[] bArr, zz4O zz4o) throws Exception {
        byte[] bArrZzW = zzIL.zzW(3, bArr, bArr.length);
        zzYGY zzygy = new zzYGY();
        zzygy.zzXyp();
        zzYGZ zzygzZzZ = zzygy.zzZ(zzYH2.f50847eh, bArrZzW);
        InputStream inputStreamZzZ = zzZXR.zzZ(zzygzZzZ.getEncoded(), zz4o.getServerUrl(), "application/timestamp-query", zz4o.getUserName(), zz4o.getPassword(), zz4o.zzuS());
        try {
            zzYGX zzygx = new zzYGX(inputStreamZzZ);
            zzygx.zzZ(zzygzZzZ);
            zzYGW zzygwZzXyo = zzygx.zzXyo();
            if (inputStreamZzZ != null) {
                inputStreamZzZ.close();
            }
            return zzygwZzXyo;
        } finally {
        }
    }
}
