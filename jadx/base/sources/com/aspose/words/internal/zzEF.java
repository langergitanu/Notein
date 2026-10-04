package com.aspose.words.internal;

import Oooo0oO.o0Oo0oo;
import java.io.EOFException;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes5.dex */
public final class zzEF {
    private static volatile byte[] zzw6 = null;
    private static short zzw8 = -39;
    private static Object zzw7 = new Object();
    private static final zzZHW zzUR = new zzZHW("VP8 ", "VP8X", "VP8L", "IHDR", "pHYs", "IEND");

    public static boolean zz6(int i, int i2) {
        return ((long) i) * ((long) i2) > 20971520;
    }

    public static byte[] zz7(int i, int i2) throws Exception {
        zzZOR zzzor = new zzZOR();
        zzZOW zzzow = new zzZOW(zzzor);
        zzzow.zzK((short) 1);
        zzzow.zzK((short) 9);
        zzzow.zzK((short) 768);
        zzzow.zzl(26);
        zzzow.zzK((short) 0);
        zzzow.zzl(5);
        zzzow.zzK((short) 0);
        zzzow.zzl(4);
        zzzow.zzK((short) 259);
        zzzow.zzK((short) 8);
        zzzow.zzl(5);
        zzzow.zzK((short) 523);
        zzzow.zzK((short) 0);
        zzzow.zzK((short) 0);
        zzzow.zzl(5);
        zzzow.zzK((short) 524);
        zzzow.zzK((short) (i + 1));
        zzzow.zzK((short) (i2 + 1));
        zzzow.zzl(3);
        zzzow.zzK((short) 0);
        zzzow.close();
        return zzzor.zzWy();
    }

    public static boolean zzA(zzZOP zzzop) throws Exception {
        try {
            return (new zzZOX(zzzop).zzXa() & 65535) == 55551;
        } catch (EOFException unused) {
            return false;
        }
    }

    public static int zzB(zzZOP zzzop) throws Exception {
        if (zzzop != null && zzzop.getLength() != 0) {
            long position = zzzop.getPosition();
            try {
                boolean zZzt = zzt(zzzop);
                zzzop.zzH(position);
                if (zZzt) {
                    return 3;
                }
                boolean zZzs = zzs(zzzop);
                zzzop.zzH(position);
                if (zZzs) {
                    return 3;
                }
                boolean zZzq = zzq(zzzop);
                zzzop.zzH(position);
                if (zZzq) {
                    return 2;
                }
                boolean zZzA = zzA(zzzop);
                zzzop.zzH(position);
                if (zZzA) {
                    return 5;
                }
                boolean zZzz = zzz(zzzop);
                zzzop.zzH(position);
                if (zZzz) {
                    return 6;
                }
                boolean zZzy = zzy(zzzop);
                zzzop.zzH(position);
                if (zZzy) {
                    return 7;
                }
                boolean zZzw = zzw(zzzop);
                zzzop.zzH(position);
                if (zZzw) {
                    return 4;
                }
                boolean zZzx = zzx(zzzop);
                zzzop.zzH(position);
                if (zZzx) {
                    return 9;
                }
                boolean zZzZU = zzZWG.zzZU(zzzop);
                zzzop.zzH(position);
                if (zZzZU) {
                    return 8;
                }
                boolean zZzo = zzo(zzzop);
                zzzop.zzH(position);
                if (zZzo) {
                    return 36;
                }
                boolean zZzn = zzn(zzzop);
                zzzop.zzH(position);
                if (zZzn) {
                    return 39;
                }
                boolean zZzm = zzm(zzzop);
                zzzop.zzH(position);
                if (zZzm) {
                    return 45;
                }
                boolean zZzu = zzu(zzzop);
                zzzop.zzH(position);
                if (zZzu) {
                    return 46;
                }
                boolean zZzl = zzl(zzzop);
                zzzop.zzH(position);
                if (zZzl) {
                    return 11;
                }
            } catch (Exception unused) {
            }
            zzzop.zzH(position);
        }
        return 0;
    }

    /* JADX WARN: Finally extract failed */
    public static byte[] zzDL() throws Exception {
        if (zzw6 == null) {
            synchronized (zzw7) {
                try {
                    if (zzw6 == null) {
                        zzZOP zzzopZzX1 = zzZXR.zzX1("Aspose.Resources.NoImage.png");
                        try {
                            zzw6 = zzZYQ.zzZX(zzzopZzX1);
                            if (zzzopZzX1 != null) {
                                zzzopZzX1.close();
                            }
                        } catch (Throwable th) {
                            if (zzzopZzX1 != null) {
                                zzzopZzX1.close();
                            }
                            throw th;
                        }
                    }
                } finally {
                }
            }
        }
        return zzw6;
    }

    public static zzZOP zzDM() throws Exception {
        return new zzZOR(zzDL());
    }

    private static int zzM(byte[] bArr, int i) {
        return ((bArr[i + 2] & 255) << 16) | zzN(bArr, i);
    }

    private static int zzN(byte[] bArr, int i) {
        return ((bArr[i + 1] & 255) << 8) | (bArr[i] & 255);
    }

    public static zzEG zzO(byte[] bArr, int i) throws Exception {
        return zzX(new zzZOR(bArr), i);
    }

    public static int zzP(int i, int i2, int i3) {
        if ((i2 == 32 || i2 == 16) && i == 3) {
            return 12;
        }
        if (i2 > 8) {
            return 0;
        }
        if (i3 == 0) {
            i3 = 1 << i2;
        }
        return i3 * 4;
    }

    private static boolean zzQ(byte b) {
        byte[] bArr = {-2, -1, -17, -69, -65, 0, 13, 10, 9, 32};
        for (int i = 0; i < 10; i++) {
            if (bArr[i] == b) {
                return true;
            }
        }
        return false;
    }

    private static boolean zzS(zzY0 zzy0) throws Exception {
        return zzZKN.zzS(new String(zzy0.zzm(6)), "Exif", zzZOF.ORDINAL$4894b8c8);
    }

    private static zzXN zzV(zzXN zzxn) throws Exception {
        zzZOR zzzor = new zzZOR();
        zzxn.zzZ(zzzor, 7);
        zzzor.zzH(0L);
        return new zzXN(zzzor);
    }

    public static boolean zzVV(int i) {
        return i == 7 || i == 2 || i == 9 || i == 5 || i == 6 || i == 8 || i == 3 || i == 4 || i == 46 || i == 11 || i == 39;
    }

    public static boolean zzVW(int i) {
        return i == 3 || i == 2;
    }

    private static byte[] zzW(zzPV[] zzpvArr) {
        byte[] bArr = new byte[zzpvArr.length * 4];
        for (int i = 0; i < zzpvArr.length; i++) {
            int i2 = i * 4;
            bArr[i2] = (byte) zzpvArr[i].zzPA();
            bArr[i2 + 1] = (byte) zzpvArr[i].zzPB();
            bArr[i2 + 2] = (byte) zzpvArr[i].zzPC();
            bArr[i2 + 3] = 0;
        }
        return bArr;
    }

    public static zzEG zzX(zzZOP zzzop, int i) {
        zzEG zzegZzi;
        try {
            long position = zzzop.getPosition();
            if (i == 11) {
                zzegZzi = zzi(zzzop);
            } else if (i != 46) {
                switch (i) {
                    case 2:
                    case 3:
                        zzegZzi = zzc(zzzop);
                        break;
                    case 4:
                        zzegZzi = zzb(zzzop);
                        break;
                    case 5:
                        zzegZzi = zzf(zzzop);
                        break;
                    case 6:
                        zzegZzi = zzh(zzzop);
                        break;
                    case 7:
                        zzegZzi = zzk(zzzop);
                        break;
                    case 8:
                        zzegZzi = zze(zzzop);
                        break;
                    case 9:
                        zzegZzi = zzj(zzzop);
                        break;
                    default:
                        zzegZzi = zzEG.zzX(100, 100, 96.0d);
                        break;
                }
            } else {
                zzegZzi = zzd(zzzop);
            }
            zzzop.zzH(position);
            return zzegZzi;
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    private static byte[] zzY(zzZOR zzzor) throws Exception {
        boolean zZzX = zzX(zzzor);
        zzXN zzxn = new zzXN(zzzor);
        try {
            zzZOR zzzor2 = new zzZOR();
            try {
                if (zZzX) {
                    zzXN zzxnZzV = zzV(zzxn);
                    try {
                        zzxnZzV.zzZ(zzzor2, 6);
                        zzxnZzV.dispose();
                    } catch (Throwable th) {
                        zzxnZzV.dispose();
                        throw th;
                    }
                } else {
                    zzxn.zzZ(zzzor2, 6);
                }
                byte[] bArrZzZX = zzZYQ.zzZX(zzzor2);
                zzzor2.close();
                return bArrZzZX;
            } catch (Throwable th2) {
                zzzor2.close();
                throw th2;
            }
        } finally {
            zzxn.dispose();
        }
    }

    public static byte[] zzZ(zzZOX zzzox, int i) throws Exception {
        long position = zzzox.zzq().getPosition();
        zzXO zzxoZzY = zzQX.zzY(zzzox);
        return zzZ(zzxoZzY, zzZ(zzzox, zzxoZzY, i, position), zzzox, i - ((int) (zzzox.zzq().getPosition() - position)));
    }

    public static int zzZA(byte[] bArr) throws Exception {
        zzZR(bArr);
        zzZOR zzzor = new zzZOR(bArr);
        try {
            return zzg(zzzor);
        } finally {
            zzzor.close();
        }
    }

    public static zzEG zzZB(byte[] bArr) throws Exception {
        zzZP(bArr);
        zzZOR zzzor = new zzZOR(bArr);
        try {
            return zzj(zzzor);
        } finally {
            zzzor.close();
        }
    }

    public static boolean zzZC(byte[] bArr) throws Exception {
        zzZOR zzzor = new zzZOR(bArr);
        try {
            return zzm(zzzor);
        } finally {
            zzzor.close();
        }
    }

    public static boolean zzZD(byte[] bArr) {
        if (!zzZ1.zzX(bArr)) {
            return false;
        }
        try {
            zzZOR zzzor = new zzZOR(bArr);
            try {
                return zzn(zzzor);
            } finally {
                zzzor.close();
            }
        } catch (Exception unused) {
            return false;
        }
    }

    private static boolean zzZE(byte[] bArr) {
        return bArr != null && (bArr[0] & 255) == 37 && (bArr[1] & 255) == 80 && (bArr[2] & 255) == 68 && (bArr[3] & 255) == 70;
    }

    public static boolean zzZF(byte[] bArr) throws Exception {
        zzZOR zzzor = new zzZOR(bArr);
        try {
            return zzq(zzzor);
        } finally {
            zzzor.close();
        }
    }

    public static ArrayList<String> zzZG(byte[] bArr) throws Exception {
        int iZzZU = zzZU(bArr);
        if (iZzZU == 2) {
            return zzO7.zzi(bArr);
        }
        if (iZzZU != 3) {
            return null;
        }
        return zzZUZ.zzi(bArr);
    }

    public static boolean zzZH(byte[] bArr) throws Exception {
        return zzVW(zzZU(bArr));
    }

    public static boolean zzZI(byte[] bArr) throws Exception {
        return zzZK(bArr) || zzZJ(bArr);
    }

    private static boolean zzZJ(byte[] bArr) throws Exception {
        zzZOR zzzor = new zzZOR(bArr);
        try {
            return zzs(zzzor);
        } finally {
            zzzor.close();
        }
    }

    public static boolean zzZK(byte[] bArr) throws Exception {
        zzZOR zzzor = new zzZOR(bArr);
        try {
            return zzt(zzzor);
        } finally {
            zzzor.close();
        }
    }

    public static boolean zzZL(byte[] bArr) throws Exception {
        zzZOR zzzor = new zzZOR(bArr);
        try {
            return zzu(zzzor);
        } finally {
            zzzor.close();
        }
    }

    public static boolean zzZM(byte[] bArr) throws Exception {
        zzZOR zzzor = new zzZOR(bArr);
        try {
            return zzv(zzzor);
        } finally {
            zzzor.close();
        }
    }

    public static boolean zzZN(byte[] bArr) throws Exception {
        if (bArr.length <= 524) {
            return false;
        }
        zzZOR zzzor = new zzZOR(bArr);
        try {
            zzzor.zzH(512L);
            return zzw(zzzor);
        } finally {
            zzzor.close();
        }
    }

    public static boolean zzZO(byte[] bArr) throws Exception {
        zzZOR zzzor = new zzZOR(bArr);
        try {
            return zzw(zzzor);
        } finally {
            zzzor.close();
        }
    }

    public static boolean zzZP(byte[] bArr) throws Exception {
        zzZOR zzzor = new zzZOR(bArr);
        try {
            return zzx(zzzor);
        } finally {
            zzzor.close();
        }
    }

    public static boolean zzZQ(byte[] bArr) throws Exception {
        zzZOR zzzor = new zzZOR(bArr);
        try {
            return zzz(zzzor);
        } finally {
            zzzor.close();
        }
    }

    public static boolean zzZR(byte[] bArr) throws Exception {
        zzZOR zzzor = new zzZOR(bArr);
        try {
            return zzA(zzzor);
        } finally {
            zzzor.close();
        }
    }

    public static boolean zzZS(byte[] bArr) throws Exception {
        return zzZWG.zzZS(bArr);
    }

    public static zzEG zzZT(byte[] bArr) throws Exception {
        return zzO(bArr, zzZU(bArr));
    }

    public static int zzZU(byte[] bArr) throws Exception {
        if (bArr == null || bArr.length == 0) {
            return 0;
        }
        zzZOR zzzor = new zzZOR(bArr);
        try {
            return zzB(zzSJ.zzQ(zzzor));
        } finally {
            zzzor.close();
        }
    }

    public static boolean zzZs(byte[] bArr) throws Exception {
        zzXN zzxn = new zzXN(bArr);
        try {
            if (zzxn.getPixelFormat() == 1052676) {
                return false;
            }
            zzXN zzxnZzWD = zzxn.zzWD();
            try {
                zzXQ zzxqZzWz = zzxnZzWD.zzWz();
                int iZzWO = zzxqZzWz.zzWO() / 4;
                for (int i = 0; i < iZzWO; i++) {
                    byte bZz3 = zzxqZzWz.zz3(i);
                    int i2 = bZz3 & 255;
                    int iZz2 = zzxqZzWz.zz2(i) & 255;
                    int iZz1 = zzxqZzWz.zz1(i) & 255;
                    if (Math.max(Math.abs(i2 - iZz2), Math.max(Math.abs(iZz2 - iZz1), Math.abs(iZz1 - i2))) > 10) {
                        zzxqZzWz.zzWQ();
                        zzxnZzWD.dispose();
                        zzxn.dispose();
                        return true;
                    }
                }
                zzxqZzWz.zzWQ();
                zzxnZzWD.dispose();
                return false;
            } catch (Throwable th) {
                if (zzxnZzWD != null) {
                    zzxnZzWD.dispose();
                }
                throw th;
            }
        } finally {
            zzxn.dispose();
        }
    }

    public static boolean zzZt(byte[] bArr) throws Exception {
        return zzXN.zzW(bArr);
    }

    public static boolean zzZu(byte[] bArr) throws Exception {
        byte[] bArrZzDL = zzDL();
        return bArr.length == bArrZzDL.length && zzZ1.zzZ(bArr, bArrZzDL, bArr.length);
    }

    public static byte[] zzZv(byte[] bArr) throws Exception {
        zzZOR zzzor = new zzZOR(bArr);
        zzZOX zzzox = new zzZOX(zzzor);
        new zzXP().zzZ(zzzox);
        long position = zzzor.getPosition();
        zzXO zzxoZzY = zzQX.zzY(zzzox);
        zzzor.zzH(position);
        int length = bArr.length;
        int i = length - 14;
        byte[] bArr2 = new byte[i];
        zzzor.read(bArr2, 0, i);
        int i2 = (length + 13) / 2;
        zzZOR zzzor2 = new zzZOR();
        zzZOW zzzow = new zzZOW(zzzor2);
        zzzow.zzK((short) 1);
        zzzow.zzK((short) 9);
        zzzow.zzK((short) 768);
        zzzow.zzl(i2 + 37);
        zzzow.zzK((short) 0);
        zzzow.zzl(i2);
        zzzow.zzK((short) 0);
        zzzow.zzl(4);
        zzzow.zzK((short) 259);
        zzzow.zzK((short) 8);
        zzzow.zzl(5);
        zzzow.zzK((short) 523);
        zzzow.zzK((short) 0);
        zzzow.zzK((short) 0);
        zzzow.zzl(5);
        zzzow.zzK((short) 524);
        zzzow.zzK((short) (zzxoZzY.getHeight() + 1));
        zzzow.zzK((short) (zzxoZzY.getWidth() + 1));
        zzzow.zzl(3);
        zzzow.zzK((short) 30);
        zzzow.zzl(4);
        zzzow.zzK((short) 263);
        zzzow.zzK((short) 4);
        zzzow.zzl(i2);
        zzzow.zzK((short) 2881);
        zzzow.zzl(13369376);
        zzzow.zzK((short) zzxoZzY.getHeight());
        zzzow.zzK((short) zzxoZzY.getWidth());
        zzzow.zzK((short) 0);
        zzzow.zzK((short) 0);
        zzzow.zzK((short) zzxoZzY.getHeight());
        zzzow.zzK((short) zzxoZzY.getWidth());
        zzzow.zzK((short) 0);
        zzzow.zzK((short) 0);
        zzzow.writeBytes(bArr2);
        if (zzAN.zzZP(i)) {
            zzzow.writeByte((byte) 0);
        }
        zzzow.zzl(4);
        zzzow.zzK((short) 295);
        zzzow.zzK((short) -1);
        zzzow.zzl(3);
        zzzow.zzK((short) 0);
        zzzow.close();
        return zzzor2.zzWy();
    }

    public static byte[] zzZw(byte[] bArr) throws Exception {
        if (!zzZJ(bArr)) {
            return bArr;
        }
        int length = bArr.length - 22;
        byte[] bArr2 = new byte[length];
        zzZKV.zzZ(bArr, 22, bArr2, 0, length);
        return bArr2;
    }

    public static zzEG zzZx(byte[] bArr) throws Exception {
        zzZO(bArr);
        zzZOR zzzor = new zzZOR(bArr);
        try {
            return zzb(zzzor);
        } finally {
            zzzor.close();
        }
    }

    public static zzEG zzZy(byte[] bArr) throws Exception {
        return zzc(new zzZOR(bArr));
    }

    public static byte[] zzZz(byte[] bArr) throws Exception {
        zzZOR zzzor = new zzZOR(bArr);
        try {
            return zzY(zzzor);
        } finally {
            zzzor.close();
        }
    }

    private static boolean zza(zzZOP zzzop) throws Exception {
        int length = zzzop.getLength() > 200 ? 200 : (int) zzzop.getLength();
        byte[] bArr = new byte[200];
        zzzop.read(bArr, 0, length);
        zzzop.zzH(0L);
        for (int i = 0; i < length; i++) {
            byte b = bArr[i];
            if (!zzQ(b)) {
                return (b & 255) == 60;
            }
        }
        return false;
    }

    private static zzEG zzb(zzZOP zzzop) throws Exception {
        zzZOX zzzox = new zzZOX(zzzop);
        zzzox.zzXa();
        short sZzZ = zzXU.zzZ(zzzox.zzXa());
        short sZzZ2 = zzXU.zzZ(zzzox.zzXa());
        short sZzZ3 = zzXU.zzZ(zzzox.zzXa());
        return zzEG.zzY(sZzZ2, sZzZ, zzXU.zzZ(zzzox.zzXa()), sZzZ3, zzSA.zzp(r3 - sZzZ2), zzSA.zzp(sZzZ3 - sZzZ));
    }

    public static zzEG zzc(zzZOP zzzop) throws Exception {
        zzZQ5 zzzq5ZzyQ = new zz8T(zzzop).zzyQ();
        return zzEG.zzZ(zzzq5ZzyQ.getLeft(), zzzq5ZzyQ.getTop(), zzzq5ZzyQ.getRight(), zzzq5ZzyQ.getBottom(), r0.getHorizontalResolution(), r0.getVerticalResolution());
    }

    private static zzEG zzd(zzZOP zzzop) throws Exception {
        zzZOX zzzox = new zzZOX(zzzop);
        zzzox.zzXa();
        zzzox.zzXa();
        int iZzXa = zzzox.zzXa() & 65535;
        if (iZzXa <= 0) {
            throw new IllegalArgumentException(o0Oo0oo.OooO0O0(iZzXa, "Couldn't extract image with index 0 from .ico file, because it contains only ", " image(s)."));
        }
        if (iZzXa <= 0) {
            throw new IllegalStateException("Couldn't extract BMP/PNG image from .ico file.");
        }
        int iZzX6 = zzzox.zzX6() & 255;
        int iZzX62 = zzzox.zzX6() & 255;
        zzzox.zzX6();
        zzzox.zzX6();
        zzzox.zzXa();
        zzzox.zzXa();
        zzzox.zzXc();
        zzzox.zzXc();
        return zzEG.zzX(iZzX6, iZzX62, 96.0d);
    }

    private static zzEG zze(zzZOP zzzop) throws Exception {
        zzZWG zzzwg = new zzZWG(zzzop);
        return zzEG.zzZ(zzzwg.zzoj(), zzzwg.zzoi(), zzzwg.zzoh(), zzzwg.zzog());
    }

    private static zzEG zzf(zzZOP zzzop) throws Exception {
        long jZzX;
        try {
            zzY0 zzy0 = new zzY0(zzzop);
            zzy0.zzX9();
            short sZzZ = zzZ(zzy0, false);
            long j = 0;
            boolean z = false;
            int iZzX9 = 0;
            int iZzX92 = 0;
            while (!z) {
                long position = (zzzop.getPosition() + ((long) (zzy0.zzX9() & 65535))) - 2;
                int i = sZzZ & 65535;
                if ((sZzZ & 65520) != 65472 || i == 65476 || i == 65484) {
                    if (i == 65504) {
                        jZzX = zzZ(zzy0, j);
                    } else if (i == 65505) {
                        jZzX = zzY(zzy0, j);
                    } else if (i == 65517 && position >= 48) {
                        jZzX = zz1A.zzX(zzy0, j);
                    }
                    j = jZzX;
                } else {
                    zzy0.readByte();
                    iZzX92 = zzy0.zzX9() & 65535;
                    iZzX9 = zzy0.zzX9() & 65535;
                    z = true;
                }
                zzzop.zzH(position);
                sZzZ = zzZ(zzy0, false);
            }
            return zzEG.zzZ(iZzX9, iZzX92, Float.intBitsToFloat((int) j), zzZPY.zzYC(j));
        } catch (EOFException unused) {
            return zzEG.zzDS();
        }
    }

    private static int zzg(zzZOP zzzop) throws Exception {
        zzY0 zzy0;
        short sZzZ;
        try {
            zzy0 = new zzY0(zzzop);
            zzy0.zzX9();
        } catch (EOFException unused) {
        }
        for (sZzZ = zzZ(zzy0, true); sZzZ != zzw8; sZzZ = zzZ(zzy0, true)) {
            long position = (zzzop.getPosition() + ((long) (zzy0.zzX9() & 65535))) - 2;
            if ((sZzZ & 65535) == 65505 && zzS(zzy0)) {
                return new zzZWG(zzy0).getOrientation();
            }
            zzzop.zzH(position);
            return 1;
        }
        return 1;
    }

    private static zzEG zzh(zzZOP zzzop) throws Exception {
        zzY0 zzy0 = new zzY0(zzzop);
        long j = 8;
        zzzop.zzH(8L);
        boolean z = false;
        int i = 0;
        double d = 0.0d;
        double d2 = 0.0d;
        boolean z2 = false;
        int i2 = 0;
        while (!z && zzzop.getPosition() < zzzop.getLength()) {
            int iZzXb = zzy0.zzXb();
            int iZzTP = zzUR.zzTP(new String(zzy0.zzm(4)));
            long j2 = j;
            if (iZzTP != 3) {
                if (iZzTP == 4) {
                    long jZzXb = ((long) zzy0.zzXb()) & 4294967295L;
                    long jZzXb2 = ((long) zzy0.zzXb()) & 4294967295L;
                    if (((short) (zzy0.readByte() & 255)) == 1) {
                        d2 = jZzXb2 / 39.37007874015748d;
                        d = jZzXb / 39.37007874015748d;
                    }
                } else if (iZzTP == 5) {
                }
                z = true;
            } else {
                int iZzXc = zzy0.zzXc();
                int iZzXc2 = zzy0.zzXc();
                zzzop.zzU(-8L, 1);
                i2 = iZzXc;
                i = iZzXc2;
                z2 = true;
            }
            int i3 = (int) ((((long) iZzXb) & 4294967295L) + 4);
            if (z2 && zzzop.getPosition() + (((long) i3) & 4294967295L) + j2 >= zzzop.getLength()) {
                break;
            }
            zzzop.zzU(((long) i3) & 4294967295L, 1);
            j = j2;
        }
        return zzEG.zzZ(i2, i, d, d2);
    }

    private static zzEG zzi(zzZOP zzzop) throws Exception {
        int iZzN;
        int iZzN2;
        int iZzM;
        byte[] bArrZzn = new zzZOX(zzzop).zzn(30);
        int iZzTP = zzUR.zzTP(zzZO0.zzhX().zzR(bArrZzn, 12, 4));
        if (iZzTP != 0) {
            if (iZzTP == 1) {
                iZzN = zzM(bArrZzn, 24) + 1;
                iZzM = zzM(bArrZzn, 27);
            } else {
                if (iZzTP != 2) {
                    return zzEG.zzDS();
                }
                int iZzN3 = zzN(bArrZzn, 21);
                iZzN = (iZzN3 & 16383) + 1;
                iZzM = ((zzN(bArrZzn, 23) & 4095) << 2) | ((iZzN3 & 49152) >> 14);
            }
            iZzN2 = iZzM + 1;
        } else {
            iZzN = zzN(bArrZzn, 26) & 16383;
            iZzN2 = zzN(bArrZzn, 28) & 16383;
        }
        zzzop.zzH(zzzop.getPosition() - 30);
        return zzEG.zzX(iZzN, iZzN2, 96.0d);
    }

    private static zzEG zzj(zzZOP zzzop) throws Exception {
        zzzop.zzH(6L);
        zzZOX zzzox = new zzZOX(zzzop);
        return zzEG.zzX(zzzox.zzXa() & 65535, zzzox.zzXa() & 65535, 0.0d);
    }

    private static zzEG zzk(zzZOP zzzop) throws Exception {
        zzzop.zzH(14L);
        zzXO zzxoZzY = zzQX.zzY(new zzZOX(zzzop));
        return zzEG.zzZ(zzxoZzY.getWidth(), Math.abs(zzxoZzY.getHeight()), ((double) zzxoZzY.zzWK()) / 39.37007874015748d, ((double) zzxoZzY.zzWJ()) / 39.37007874015748d);
    }

    private static boolean zzl(zzZOP zzzop) throws Exception {
        if (zzzop.getPosition() + 4 > zzzop.getLength()) {
            return false;
        }
        String strZzR = zzZO0.zzhX().zzR(new zzZOX(zzzop).zzn(4), 0, 4);
        zzzop.zzH(zzzop.getPosition() - 4);
        return "RIFF".equals(strZzR);
    }

    private static boolean zzm(zzZOP zzzop) throws Exception {
        if (zzzop.getPosition() + 16 > zzzop.getLength()) {
            return false;
        }
        String strZzR = zzZO0.zzhX().zzR(new zzZOX(zzzop).zzn(16), 4, 6);
        zzzop.zzH(zzzop.getPosition() - 16);
        return "ftypqt".equals(strZzR);
    }

    public static boolean zzn(zzZOP zzzop) throws Exception {
        if (!zza(zzzop)) {
            return false;
        }
        try {
            return "svg".equals(new zzO(zzzop).getLocalName());
        } catch (IllegalStateException unused) {
            return false;
        }
    }

    private static boolean zzo(zzZOP zzzop) throws Exception {
        return zzZE(zzZYQ.zzU(zzzop, 4));
    }

    private static int zzp(zzZOP zzzop) throws Exception {
        if (!zzZF(zzZYQ.zzU(zzzop, 512))) {
            return 0;
        }
        zzZOX zzzox = new zzZOX(zzzop);
        zzzox.zzXc();
        zzzox.zzq().zzH(((long) zzzox.zzXc()) & 4294967295L);
        if (zzzox.zzXc() != 70) {
            return 3;
        }
        zzzox.zzXc();
        zzzox.zzXc();
        if (zzzox.zzXc() == 726027589 && (zzzox.zzXa() & 65535) == 16385) {
            return (zzzox.zzXa() & 1) == 1 ? 5 : 4;
        }
        return 3;
    }

    private static boolean zzq(zzZOP zzzop) throws Exception {
        zzZOX zzzox = new zzZOX(zzzop);
        if (!zzZYQ.zzT(zzzox, 44) || zzzox.zzXc() != 1) {
            return false;
        }
        zzzox.zzq().zzH(40L);
        return zzzox.zzXc() == 1179469088;
    }

    public static int zzr(zzZOP zzzop) throws Exception {
        zzzop.zzH(0L);
        byte[] bArrZzU = zzZYQ.zzU(zzzop, 512);
        if (zzZK(bArrZzU)) {
            return 1;
        }
        if (zzZJ(bArrZzU)) {
            return 2;
        }
        return zzp(zzzop);
    }

    private static boolean zzs(zzZOP zzzop) throws Exception {
        zzZOX zzzox = new zzZOX(zzzop);
        return zzZYQ.zzT(zzzox, 6) && (((long) zzzox.zzXc()) & 4294967295L) == 2596720087L && zzzox.zzXa() == 0;
    }

    public static boolean zzt(zzZOP zzzop) throws Exception {
        if (zzzop.getLength() < 18) {
            return false;
        }
        zzZOX zzzox = new zzZOX(zzzop);
        short sZzXa = zzzox.zzXa();
        if ((sZzXa != 0 && sZzXa != 1) || zzzox.zzXa() != 9) {
            return false;
        }
        zzzox.zzXa();
        zzzox.zzXc();
        zzzox.zzXa();
        zzzox.zzXc();
        return zzzox.zzXa() == 0;
    }

    public static boolean zzu(zzZOP zzzop) throws Exception {
        int iZzXa;
        zzZOX zzzox = new zzZOX(zzzop);
        try {
            if ((zzzox.zzXa() & 65535) != 0 || (zzzox.zzXa() & 65535) != 1 || (iZzXa = zzzox.zzXa() & 65535) <= 0) {
                return false;
            }
            for (int i = 0; i < iZzXa; i++) {
                zzzox.zzX6();
                zzzox.zzX6();
                zzzox.zzX6();
                if ((zzzox.zzX6() & 255) != 0) {
                    return false;
                }
                int iZzXa2 = zzzox.zzXa() & 65535;
                if (iZzXa2 != 0 && iZzXa2 != 1) {
                    return false;
                }
                zzzox.zzXa();
                zzzox.zzXc();
                zzzox.zzXc();
            }
            return true;
        } catch (EOFException unused) {
            return false;
        }
    }

    public static boolean zzv(zzZOP zzzop) throws Exception {
        long position = zzzop.getPosition();
        zzzop.zzH(0L);
        if (zzzop.getLength() < 2) {
            return false;
        }
        byte[] bArr = new byte[2];
        zzzop.read(bArr, 0, 2);
        zzzop.zzH(position);
        return (zzZQK.zzB(bArr, 0) & 65535) == 40;
    }

    private static boolean zzw(zzZOP zzzop) throws Exception {
        zzZOX zzzox = new zzZOX(zzzop);
        try {
            zzzox.zzXa();
            zzzox.zzXa();
            zzzox.zzXa();
            zzzox.zzXa();
            zzzox.zzXa();
            int iZzY = zzXU.zzY(zzzox.zzXa()) & 65535;
            if (iZzY != 17) {
                if (iZzY == 273) {
                    zzzox.zzXa();
                    zzzox.zzXa();
                    zzzox.zzXa();
                    zzzox.zzXa();
                    zzzox.zzXa();
                    return zzzox.zzX6() == 17 && zzzox.zzX6() == 1;
                }
            } else if ((zzXU.zzY(zzzox.zzXa()) & 65535) == 767) {
                return true;
            }
        } catch (EOFException unused) {
        }
        return false;
    }

    public static boolean zzx(zzZOP zzzop) throws Exception {
        zzZOX zzzox = new zzZOX(zzzop);
        return zzZYQ.zzT(zzzox, 4) && (zzzox.zzXc() & 16777215) == 4606279;
    }

    public static boolean zzy(zzZOP zzzop) throws Exception {
        zzZOX zzzox = new zzZOX(zzzop);
        try {
            if ((zzzox.zzXa() & 65535) != 19778) {
                return false;
            }
            int iZzXc = zzzox.zzXc();
            zzzox.zzXc();
            int iZzXc2 = zzzox.zzXc();
            if (iZzXc != 0 && (((long) iZzXc2) & 4294967295L) > (((long) iZzXc) & 4294967295L)) {
                return false;
            }
            int iZzXc3 = zzzox.zzXc();
            boolean z = iZzXc3 == 12;
            if (!z && (4294967295L & ((long) iZzXc3)) < 16) {
                return false;
            }
            if (z) {
                zzzox.zzXc();
            } else {
                zzzox.zzXc();
                zzzox.zzXc();
            }
            if (zzzox.zzXa() != 1) {
                return false;
            }
            if (zzZQG.zzY(1, 4, 8, 16, 24, 32).contains(Short.valueOf(zzzox.zzXa()))) {
                return true;
            }
        } catch (EOFException unused) {
        }
        return false;
    }

    public static boolean zzz(zzZOP zzzop) throws Exception {
        zzZOX zzzox = new zzZOX(zzzop);
        try {
            if (zzzox.zzXc() != 1196314761) {
                return false;
            }
            return zzzox.zzXc() == 169478669;
        } catch (EOFException unused) {
            return false;
        }
    }

    private static byte[] zzZ(zzZOX zzzox, zzXO zzxo, int i, long j) throws Exception {
        return (zzzox.zzq().getPosition() - j) + ((long) zzxo.zzWN()) < ((long) i) ? zzzox.zzn(zzxo.zzWN()) : new byte[0];
    }

    public static byte[] zzZ(zzZOX zzzox, int i, int i2, int i3) throws Exception {
        long position = zzzox.zzq().getPosition();
        zzXO zzxoZzY = zzQX.zzY(zzzox);
        zzxoZzY.setWidth(i2);
        zzxoZzY.setHeight(i3);
        return zzZ(zzxoZzY, zzZ(zzzox, zzxoZzY, i, position), zzzox, i - ((int) (zzzox.zzq().getPosition() - position)));
    }

    private static long zzY(zzY0 zzy0, long j) throws Exception {
        if (zzS(zzy0)) {
            zzZWG zzzwg = new zzZWG(zzy0);
            if (zzzwg.zzoh() > 0.0d && zzzwg.zzog() > 0.0d) {
                double dZzoh = zzzwg.zzoh();
                double dZzog = zzzwg.zzog();
                if (zzzwg.zzoe() == 3) {
                    dZzoh *= 2.54d;
                    dZzog *= 2.54d;
                }
                return zzZPY.zzG((float) dZzoh, (float) dZzog);
            }
        }
        return j;
    }

    private static boolean zzX(zzZOR zzzor) throws Exception {
        boolean zZzok;
        long position = zzzor.getPosition();
        if (zzZWG.zzZU(zzzor)) {
            zzzor.zzH(position);
            zZzok = new zzZWG(zzzor).zzok();
        } else {
            zZzok = false;
        }
        zzzor.zzH(position);
        return zZzok;
    }

    public static byte[] zzZ(zzZOX zzzox, int i, int i2) throws Exception {
        int position = (int) zzzox.zzq().getPosition();
        zzXO zzxoZzY = zzQX.zzY(zzzox);
        byte[] bArrZzn = zzzox.zzn(zzxoZzY.zzWN());
        zzzox.zzq().zzH(position + i);
        return zzZ(zzxoZzY, bArrZzn, zzzox, i2);
    }

    private static byte[] zzY(zzEG zzeg) throws Exception {
        zzZOR zzzor = new zzZOR();
        try {
            zzZOW zzzow = new zzZOW(zzzor, zzZO0.zzhU());
            zzzow.zzK((short) -12841);
            zzzow.zzK((short) -25914);
            zzzow.zzK((short) 0);
            zzzow.zzK((short) zzeg.getLeft());
            int left = zzeg.getLeft() ^ 22289;
            zzzow.zzK((short) zzeg.getTop());
            int top = left ^ zzeg.getTop();
            zzzow.zzK((short) zzeg.getRight());
            int right = top ^ zzeg.getRight();
            zzzow.zzK((short) zzeg.getBottom());
            int bottom = right ^ zzeg.getBottom();
            zzzow.zzK((short) zzeg.getHorizontalResolution());
            int horizontalResolution = ((int) zzeg.getHorizontalResolution()) ^ bottom;
            zzzow.zzK((short) 0);
            zzzow.zzK((short) 0);
            zzzow.zzK((short) horizontalResolution);
            return zzzor.zzWy();
        } finally {
            zzzor.close();
        }
    }

    public static byte[] zzZ(zzQX zzqx, zzPV[] zzpvArr, zzZOX zzzox, int i) throws Exception {
        return zzZ(zzqx, zzW(zzpvArr), zzzox, i);
    }

    private static byte[] zzZ(zzQX zzqx, byte[] bArr, zzZOX zzzox, int i) throws Exception {
        int length = bArr.length + 54;
        int i2 = length + i;
        byte[] bArr2 = new byte[i2];
        zzZOR zzzor = new zzZOR(bArr2);
        try {
            zzZOW zzzow = new zzZOW(zzzor);
            zzXP zzxp = new zzXP();
            zzxp.zzVF = i2;
            zzxp.zzVC = length;
            zzxp.zzZ(zzzow);
            zzqx.zzZ(zzzow);
            zzzow.writeBytes(bArr);
            zzzow.flush();
            zzzox.read(bArr2, length, i);
            return bArr2;
        } finally {
            zzzor.close();
        }
    }

    public static byte[] zzZ(int i, int i2, int i3, int i4, int i5, int i6, int i7, byte[] bArr) throws Exception {
        return zzZ(i, i2, i3, i4, i5, i6, i7, bArr, new zzPV[]{zzPV.zzKa, zzPV.zzI5});
    }

    public static byte[] zzZ(int i, int i2, int i3, int i4, int i5, int i6, int i7, byte[] bArr, zzPV[] zzpvArr) throws Exception {
        if (i5 != 1) {
            throw new IllegalStateException("Expected 1 plane only here.");
        }
        if (i6 != 1) {
            return null;
        }
        int length = (bArr.length * 2) + 62;
        byte[] bArr2 = new byte[length];
        zzZOR zzzor = new zzZOR(bArr2);
        try {
            zzZOW zzzow = new zzZOW(zzzor);
            zzXP zzxp = new zzXP();
            zzxp.zzVF = length;
            zzxp.zzVC = 62;
            zzxp.zzZ(zzzow);
            zzXO zzxo = new zzXO();
            zzxo.setWidth(i);
            zzxo.setHeight(i2);
            zzxo.zzX((short) i5);
            zzxo.zzW((short) i6);
            zzxo.zzZU(i3);
            zzxo.zzZT(i4);
            zzxo.zzZ(zzzow);
            zzzow.writeBytes(zzW(zzpvArr));
            zzzow.flush();
            int iZzN = zzAN.zzN(i7, 4) - i7;
            int i8 = (int) (((long) zzxp.zzVC) & 4294967295L);
            for (int i9 = i2 - 1; i9 >= 0; i9--) {
                for (int i10 = 0; i10 < i7; i10++) {
                    bArr2[i8] = bArr[(i9 * i7) + i10];
                    i8++;
                }
                for (int i11 = 0; i11 < iZzN; i11++) {
                    bArr2[i8] = 0;
                    i8++;
                }
            }
            zzzor.close();
            return bArr2;
        } catch (Throwable th) {
            zzzor.close();
            throw th;
        }
    }

    private static long zzZ(zzY0 zzy0, long j) throws Exception {
        zzy0.zzq().zzU(7L, 1);
        short s = (short) (zzy0.readByte() & 255);
        short sZzX9 = zzy0.zzX9();
        short sZzX92 = zzy0.zzX9();
        if (s != 1) {
            return s != 2 ? j : zzZPY.zzG((float) (((double) (sZzX9 & 65535)) * 2.54d), (float) (((double) (sZzX92 & 65535)) * 2.54d));
        }
        return zzZPY.zzG(sZzX9, sZzX92);
    }

    private static short zzZ(zzY0 zzy0, boolean z) throws Exception {
        boolean z2 = false;
        short s = 0;
        short s2 = 0;
        while (!z2) {
            while (s != 255 && (!z || !zzy0.zzXd())) {
                s = (short) (zzy0.readByte() & 255);
            }
            if (z && zzy0.zzXd()) {
                break;
            }
            s2 = (short) (zzy0.readByte() & 255);
            if (s2 == 0 || s2 == 255) {
                s = s2;
                s2 = 0;
            } else {
                z2 = true;
            }
        }
        return z2 ? (short) (65280 | (s2 & 255)) : zzw8;
    }

    public static byte[] zzZ(byte[] bArr, zzEG zzeg) throws Exception {
        zzZK(bArr);
        byte[] bArrZzY = zzY(zzeg);
        byte[] bArr2 = new byte[bArrZzY.length + bArr.length];
        System.arraycopy(bArrZzY, 0, bArr2, 0, bArrZzY.length);
        zzZKV.zzZ(bArr, 0, bArr2, bArrZzY.length, bArr.length);
        return bArr2;
    }

    public static byte[] zzZ(zzZOP zzzop, zzEG zzeg) throws Exception {
        byte[] bArrZzY = zzY(zzeg);
        byte[] bArr = new byte[(int) (zzzop.getLength() + ((long) bArrZzY.length))];
        System.arraycopy(bArrZzY, 0, bArr, 0, bArrZzY.length);
        zzzop.read(bArr, bArrZzY.length, (int) zzzop.getLength());
        zzzop.getLength();
        return bArr;
    }

    public static void zzZ(zzXN zzxn, zzZOP zzzop, zzPV zzpv, int i) throws Exception {
        zzXN zzxn2 = new zzXN(zzxn.getWidth(), zzxn.getHeight(), zzxn.getHorizontalResolution(), zzxn.getVerticalResolution(), 2498570);
        try {
            zzIY zziy = new zzIY(zzxn2);
            try {
                zziy.zzZ(zzpv, zzxn.getWidth(), zzxn.getHeight());
                zziy.dispose();
                zzZQ5 zzzq5 = new zzZQ5(0, 0, zzxn.getWidth(), zzxn.getHeight());
                zzxn.zzZ(zzzq5, zzxn2, zzzq5);
                zzxn2.zzY(zzzop, i);
                zzxn2.dispose();
            } catch (Throwable th) {
                zziy.dispose();
                throw th;
            }
        } catch (Throwable th2) {
            zzxn2.dispose();
            throw th2;
        }
    }
}
