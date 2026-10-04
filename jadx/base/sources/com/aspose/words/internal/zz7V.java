package com.aspose.words.internal;

/* JADX INFO: loaded from: classes5.dex */
final class zz7V {
    public static byte[] decode(byte[] bArr) throws Exception {
        zzZOR zzzor = new zzZOR(bArr);
        try {
            zzY0 zzy0 = new zzY0(zzzor);
            if (((short) (zzy0.readByte() & 255)) != 3) {
                throw new IllegalStateException("Unsupported MTX version.");
            }
            zzy0.zzX7();
            int iZzX7 = zzy0.zzX7();
            int iZzX72 = zzy0.zzX7();
            if (iZzX7 > iZzX72 || iZzX72 >= bArr.length) {
                throw new IllegalStateException("The MTX data is not valid.");
            }
            return zzRV.zzZ(zzAV.zzZr(zzy0.zzn(iZzX7 - ((int) zzzor.getPosition()))), zzAV.zzZr(zzy0.zzn(iZzX72 - ((int) zzzor.getPosition()))), zzAV.zzZr(zzy0.zzn(bArr.length - ((int) zzzor.getPosition()))));
        } finally {
            zzzor.close();
        }
    }

    public static byte[] encode(byte[] bArr) throws Exception {
        zzZOR zzzor = new zzZOR();
        try {
            zzXZ zzxz = new zzXZ(zzzor);
            zzxz.writeByte((byte) 3);
            zzxz.zzh(16777215);
            zzRU zzruZzt = zzRT.zzt(bArr);
            if (zzruZzt == null) {
                zzzor.close();
                return null;
            }
            byte[] bArrZzZp = zzAT.zzZp(zzruZzt.zzRj());
            byte[] bArrZzZp2 = zzAT.zzZp(zzruZzt.zzRi());
            byte[] bArrZzZp3 = zzAT.zzZp(zzruZzt.zzRh());
            int length = bArrZzZp.length + 10;
            int length2 = bArrZzZp2.length + length;
            zzxz.zzh(length);
            zzxz.zzh(length2);
            zzxz.writeBytes(bArrZzZp);
            zzxz.writeBytes(bArrZzZp2);
            zzxz.writeBytes(bArrZzZp3);
            return zzzor.zzWy();
        } finally {
            zzzor.close();
        }
    }
}
