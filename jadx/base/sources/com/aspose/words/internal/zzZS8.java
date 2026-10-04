package com.aspose.words.internal;

/* JADX INFO: loaded from: classes5.dex */
final class zzZS8 extends zzEO {
    public zzZS8(int i, zzF4 zzf4) {
        super(i, zzf4, 4);
    }

    private static boolean zzYV(byte[] bArr) throws Exception {
        zzEF.zzZS(bArr);
        return new zzZWG(bArr).zzof();
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x006a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static boolean zzYW(byte[] bArr) throws Exception {
        boolean z;
        zzEF.zzZQ(bArr);
        zzZOR zzzor = new zzZOR(bArr);
        try {
            zzY0 zzy0 = new zzY0(zzzor);
            zzzor.zzH(8L);
            String str = "";
            String str2 = "";
            boolean z2 = true;
            while (true) {
                if (zzzor.getPosition() > zzzor.getLength() - 8) {
                    break;
                }
                int iZzXb = zzy0.zzXb();
                String str3 = new String(zzy0.zzm(4));
                if (z2) {
                    str = str3;
                    z2 = false;
                }
                long j = ((long) iZzXb) & 4294967295L;
                if (zzzor.getPosition() + j + 4 > zzzor.getLength()) {
                    str2 = str3;
                    break;
                }
                zzzor.zzU(j + 4, 1);
                str2 = str3;
            }
            if ("IHDR".equals(str)) {
                z = "IEND".equals(str2);
            }
            zzzor.close();
            return z;
        } catch (Throwable th) {
            zzzor.close();
            throw th;
        }
    }

    private static boolean zzYX(byte[] bArr) throws Exception {
        zzY0 zzy0;
        short sZzX9;
        zzEF.zzZR(bArr);
        zzZOR zzzor = new zzZOR(bArr);
        try {
            zzy0 = new zzY0(zzzor);
            zzy0.zzX9();
            sZzX9 = zzy0.zzX9();
        } finally {
            zzzor.close();
        }
        while (true) {
            int i = sZzX9 & 65535;
            if ((sZzX9 & 65520) == 65472 && i != 65476 && i != 65484) {
                zzzor.close();
                return false;
            }
            switch (i) {
                case 65504:
                case 65505:
                case 65506:
                case 65517:
                case 65518:
                    return true;
                default:
                    zzzor.zzU((65535 & zzy0.zzX9()) - 2, 1);
                    sZzX9 = zzy0.zzX9();
                    break;
            }
            zzzor.close();
        }
    }

    @Override // com.aspose.words.internal.zzEO
    public final boolean zzWj(int i) {
        return i == 5 || i == 6 || i == 8;
    }

    @Override // com.aspose.words.internal.zzEO
    public final boolean zzZV(byte[] bArr) throws Exception {
        int iZzZU = zzEF.zzZU(bArr);
        if (iZzZU == 5) {
            return zzYX(bArr);
        }
        if (iZzZU == 6) {
            return zzYW(bArr);
        }
        if (iZzZU != 8) {
            return false;
        }
        return zzYV(bArr);
    }
}
