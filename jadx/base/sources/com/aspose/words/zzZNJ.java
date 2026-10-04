package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
final class zzZNJ extends zzZNK {
    public zzZNJ(zzZNO zzzno, com.aspose.words.internal.zzZQ5 zzzq5) throws Exception {
        super(zzzno, zzzq5);
    }

    private zzYCP zzBv(int i) {
        int iZzZ7V = zzZ7V() + i;
        int iMax = Integer.MIN_VALUE;
        int iMin = Integer.MAX_VALUE;
        for (com.aspose.words.internal.zzZQ5 zzzq5 : zzZ7U()) {
            if (i < zzzq5.getBottom() && zzzq5.getY() < iZzZ7V) {
                iMin = Math.min(iMin, zzzq5.getBottom());
                iMax = Math.max(iMax, zzzq5.getY());
            }
        }
        return new zzYCP(iMax, iMin);
    }

    @Override // com.aspose.words.zzZNK
    public final int zzBw(int i) {
        if (zzZ7X().getY() < i) {
            i = zzZ7X().getY();
        }
        int start = zzBv(i).getStart() - zzZ7V();
        zzZ7X().getY();
        return start;
    }

    @Override // com.aspose.words.zzZNK
    public final int zzBx(int i) {
        return zzBv(i).getEnd();
    }

    @Override // com.aspose.words.zzZNK
    public final zzYCP zzW(zzYN8 zzyn8) throws Exception {
        if (zzZXN().zzhk()) {
            return null;
        }
        if (zzZXN().zzZ99() == 21595) {
            if (!zzZXN().zzbD()) {
                return null;
            }
            int iZzZ7Z = zzZ7Z();
            if (iZzZ7Z == 0) {
                zzYCP zzycpZzZ8j = zzZXN().zzZ8j();
                return new zzYCP(zzycpZzZ8j.getStart(), zzycpZzZ8j.getEnd());
            }
            if (iZzZ7Z == 1) {
                return zzYCP.zzM(zzyn8);
            }
            if (iZzZ7Z != 2) {
                return null;
            }
            return new zzYCP(0, zzyn8.zzYqn());
        }
        if (zzZXN().zzZ99() != 25604) {
            return null;
        }
        if (zzZ7Z() == 1) {
            return zzYCP.zzM(zzyn8);
        }
        if (!zzZXN().zzbD()) {
            return null;
        }
        boolean z = zzZ7Z() == 3 || zzZ7Z() == 2;
        boolean zZzwc = zzZ39.zzwc(zzZXN().zzZ8G().getWrapType());
        if (z && zZzwc) {
            return null;
        }
        return zzYCP.zzM(zzyn8);
    }

    @Override // com.aspose.words.zzZNK
    public final zzYCP zzX(zzYN8 zzyn8) throws Exception {
        return (zzZXN().zzZ99() != 25604 || zzZXN().zzhk()) ? super.zzX(zzyn8) : zzYCP.zzL(zzyn8);
    }

    @Override // com.aspose.words.zzZNK
    public final long zzXL(long j) {
        return zzZ7X().zzZE();
    }

    @Override // com.aspose.words.zzZNK
    public final boolean zzXm(int i, int i2) {
        return zzZ7Y() && i2 >= zzZ7T().getStart();
    }

    @Override // com.aspose.words.zzZNK
    public final boolean zzXn(int i, int i2) {
        if (i < zzZ7X().getY()) {
            return false;
        }
        return !zzZ7Y() || zzZ7X().getHeight() + i2 <= zzZ7T().getEnd();
    }
}
