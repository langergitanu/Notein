package com.aspose.words.internal;

import com.aspose.words.WarningType;

/* JADX INFO: loaded from: classes5.dex */
public final class zzKU {
    private static int zz6(byte[] bArr) {
        return zzZQK.zzB(bArr, 82) & 65535;
    }

    public static void zz7(byte[] bArr) {
        for (int i = 0; i < bArr.length; i++) {
            bArr[i] = (byte) ((bArr[i] & 255) ^ 80);
        }
    }

    public static boolean zz8(byte[] bArr) {
        return (((long) zzZQK.zzA(bArr, 12)) & 1) != 0;
    }

    public static int zz9(byte[] bArr) {
        return zzZQK.zzA(bArr, 0) - zzZQK.zzA(bArr, 4);
    }

    private static int zzX3(int i) {
        if (i == 65536) {
            return 65536;
        }
        switch (i) {
            case 131073:
                return 131073;
            case 131074:
                return 131074;
            default:
                return 0;
        }
    }

    public static String zza(byte[] bArr) {
        int iZz6 = zz6(bArr);
        return zzZO0.zzhU().zzR(bArr, iZz6 + 88, zzZQK.zzB(bArr, iZz6 + 86) & 65535);
    }

    private static byte[] zzb(byte[] bArr) throws Exception {
        if (bArr == null || bArr.length == 0) {
            return null;
        }
        zzZOX zzzox = new zzZOX(new zzZOR(bArr));
        try {
            if ((((long) zzzox.zzXc()) & 4294967295L) != zzzox.zzq().getLength()) {
                throw new IllegalStateException("The EOT file is not valid.");
            }
            int iZzXc = zzzox.zzXc();
            int iZzX3 = zzX3(zzzox.zzXc());
            if (iZzX3 == 0) {
                throw new IllegalStateException("Unsupported EOT version.");
            }
            int iZzXc2 = zzzox.zzXc();
            zzzox.zzq().zzH(zzzox.zzq().getPosition() + 18);
            if (zzzox.zzXa() != 20556) {
                throw new IllegalStateException("The EOT file is not valid.");
            }
            zzzox.zzq().zzH(zzzox.zzq().getPosition() + 46);
            zzzox.zzq().zzH(zzzox.zzq().getPosition() + ((long) ((zzzox.zzXa() & 65535) + 2)));
            zzzox.zzq().zzH(zzzox.zzq().getPosition() + ((long) ((zzzox.zzXa() & 65535) + 2)));
            zzzox.zzq().zzH(zzzox.zzq().getPosition() + ((long) ((zzzox.zzXa() & 65535) + 2)));
            zzzox.zzq().zzH(zzzox.zzq().getPosition() + ((long) (zzzox.zzXa() & 65535)));
            if (iZzX3 == 131073 || iZzX3 == 131074) {
                zzzox.zzq().zzH(zzzox.zzq().getPosition() + 2);
                zzzox.zzq().zzH(zzzox.zzq().getPosition() + ((long) (zzzox.zzXa() & 65535)));
                if (iZzX3 == 131074) {
                    zzzox.zzq().zzH(zzzox.zzq().getPosition() + 10);
                    zzzox.zzq().zzH(zzzox.zzq().getPosition() + ((long) (zzzox.zzXa() & 65535)));
                    zzzox.zzq().zzH(zzzox.zzq().getPosition() + 4);
                    zzzox.zzq().zzH(zzzox.zzq().getPosition() + (((long) zzzox.zzXc()) & 4294967295L));
                }
            }
            long j = ((long) iZzXc) & 4294967295L;
            if (zzzox.zzq().getPosition() + j != zzzox.zzq().getLength()) {
                throw new IllegalStateException("The EOT file is not valid.");
            }
            byte[] bArrZzn = zzzox.zzn((int) j);
            if (zzXU.zzN(iZzXc2, WarningType.HINT)) {
                zz7(bArrZzn);
            }
            if (zzXU.zzN(iZzXc2, 4)) {
                bArrZzn = zz7V.decode(bArrZzn);
            }
            zzzox.close();
            return bArrZzn;
        } catch (Throwable th) {
            zzzox.close();
            throw th;
        }
    }

    public static byte[] zzc(byte[] bArr) {
        try {
            return zzb(bArr);
        } catch (Exception unused) {
            return null;
        }
    }
}
