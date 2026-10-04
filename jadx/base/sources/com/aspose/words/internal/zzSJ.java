package com.aspose.words.internal;

/* JADX INFO: loaded from: classes5.dex */
public final class zzSJ {
    public static byte[] zzK(byte[] bArr) {
        if (bArr == null) {
            return null;
        }
        try {
            zzZOR zzzor = new zzZOR(bArr);
            try {
                if (!zzP(zzzor)) {
                    return bArr;
                }
                zzzor.close();
                zzZOR zzzor2 = new zzZOR(bArr, 38, bArr.length - 38);
                try {
                    zzZOR zzzorZzZO = zzZRW.zzZO(zzzor2);
                    try {
                        return zzzorZzZO.zzWy();
                    } finally {
                        zzzorZzZO.close();
                    }
                } finally {
                    zzzor2.close();
                }
            } finally {
                zzzor.close();
            }
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    private static boolean zzP(zzZOP zzzop) throws Exception {
        zzZOX zzzox = new zzZOX(zzzop);
        if (!zzZYQ.zzT(zzzox, 38)) {
            return false;
        }
        long position = zzzop.getPosition();
        String strZzZn = zzZO0.zzhX().zzZn(zzzox.zzn(38));
        zzzop.zzH(position);
        return "{60b5c89b-4108-45a6-8493-673a7dd2ea68}".equals(strZzZn);
    }

    public static zzZOP zzQ(zzZOP zzzop) throws Exception {
        if (!zzP(zzzop)) {
            return zzzop;
        }
        long position = zzzop.getPosition();
        zzzop.zzH(zzzop.getPosition() + 38);
        zzZOR zzzorZzZO = zzZRW.zzZO(zzzop);
        zzzop.zzH(position);
        return zzzorZzZO;
    }

    public static byte[] zzZ(byte[] bArr, long j, boolean z) throws Exception {
        zzZOR zzzor = new zzZOR(bArr.length + 51);
        try {
            zzZOW zzzow = new zzZOW(zzzor);
            try {
                zzzow.writeBytes(zzZO0.zzhX().getBytes("{60b5c89b-4108-45a6-8493-673a7dd2ea68}"));
                zzzow.zzQ(j);
                zzzow.writeBoolean(z);
                zzzow.zzl(bArr.length);
                zzzow.writeBytes(bArr);
                return zzzor.zzWy();
            } finally {
                zzzow.close();
            }
        } finally {
            zzzor.close();
        }
    }
}
