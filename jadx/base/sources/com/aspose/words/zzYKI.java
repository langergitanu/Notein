package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
final class zzYKI extends zzYKH {
    private zzYKI(String str, int i) {
        super(str, i);
    }

    public static zzYKI zzY(zzP1 zzp1) {
        if (!"counter".equals(zzp1.getName()) || !zzYKH.zzU(zzp1.zzZW3()) || (zzp1.zzZW3().getCount() != 1 && zzp1.zzZW3().getCount() != 3)) {
            return null;
        }
        int iZzCU = 0;
        String strZzD = zzYKH.zzD(zzp1.zzZW3().zzMl(0));
        if (strZzD == null) {
            return null;
        }
        if (zzp1.zzZW3().getCount() == 3) {
            String strZzD2 = zzYKH.zzD(zzp1.zzZW3().zzMl(2));
            if (strZzD2 == null) {
                return null;
            }
            iZzCU = zzYKH.zzCU(strZzD2);
        }
        return new zzYKI(strZzD, iZzCU);
    }

    @Override // com.aspose.words.zzYKF
    public final void zzZ(zzZ9L zzz9l) {
        zzz9l.zzZS(zzZXw(), zzYms());
    }
}
