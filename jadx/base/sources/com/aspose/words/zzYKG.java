package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
final class zzYKG extends zzYKH {
    private String zzXD7;

    private zzYKG(String str, String str2, int i) {
        super(str, i);
        this.zzXD7 = str2;
    }

    public static zzYKG zzX(zzP1 zzp1) {
        if (!"counters".equals(zzp1.getName()) || !zzYKH.zzU(zzp1.zzZW3()) || (zzp1.zzZW3().getCount() != 3 && zzp1.zzZW3().getCount() != 5)) {
            return null;
        }
        int iZzCU = 0;
        String strZzD = zzYKH.zzD(zzp1.zzZW3().zzMl(0));
        if (strZzD == null) {
            return null;
        }
        zzL4 zzl4ZzMl = zzp1.zzZW3().zzMl(2);
        if (zzl4ZzMl.getValueType() != 1) {
            return null;
        }
        String value = ((zzM2) zzl4ZzMl).getValue();
        if (zzp1.zzZW3().getCount() == 5) {
            String strZzD2 = zzYKH.zzD(zzp1.zzZW3().zzMl(4));
            if (strZzD2 == null) {
                return null;
            }
            iZzCU = zzYKH.zzCU(strZzD2);
        }
        return new zzYKG(strZzD, value, iZzCU);
    }

    @Override // com.aspose.words.zzYKF
    public final void zzZ(zzZ9L zzz9l) {
        zzz9l.zzP(zzZXw(), this.zzXD7, zzYms());
    }
}
