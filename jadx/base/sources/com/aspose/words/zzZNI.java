package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
final class zzZNI extends zzZNK {
    public zzZNI(zzZNO zzzno, com.aspose.words.internal.zzZQ5 zzzq5) throws Exception {
        super(zzzno, zzzq5);
    }

    private zzYCP zzBv(int i) {
        com.aspose.words.internal.zzZQ5 zzzq5 = new com.aspose.words.internal.zzZQ5(zzZ7X().getX(), i, zzZ7W(), zzZ7V());
        int y = zzzq5.getY();
        int bottom = zzzq5.getBottom();
        for (com.aspose.words.internal.zzZQ5 zzzq52 : zzZ7U()) {
            if (zzzq5.zzP(zzzq52)) {
                y = Math.max(y, zzzq52.getBottom());
                bottom = Math.min(bottom, zzzq52.getTop());
            }
        }
        zzzq5.getY();
        zzzq5.getBottom();
        return new zzYCP(bottom, y);
    }

    @Override // com.aspose.words.zzZNK
    public final int zzBw(int i) {
        if (zzZ7X().getY() < i) {
            i = zzZ7X().getY();
        }
        return Math.max(zzBv(i).getStart(), i) - zzZ7V();
    }

    @Override // com.aspose.words.zzZNK
    public final int zzBx(int i) {
        return Math.min(zzBv(i).getEnd(), i + zzZ7V());
    }

    @Override // com.aspose.words.zzZNK
    public final boolean zzBy(int i) {
        if (zzZXN().zzZ99() != 25604 && zzZXN().zzZ8G().getHorizontalAlignment() == 3) {
            return super.zzBy(i);
        }
        return false;
    }

    @Override // com.aspose.words.zzZNK
    public final zzYCP zzW(zzYN8 zzyn8) throws Exception {
        if (zzZXN().zzZ99() != 25604) {
            if (zzZXN().zzhk()) {
                return null;
            }
            int iZzZ7Z = zzZ7Z();
            if (iZzZ7Z == 0 || iZzZ7Z == 1) {
                return zzZXN().zzZ8l();
            }
            if (iZzZ7Z == 2 && zzZXN().zzZ99() == 21537) {
                return zzZXN().zzZ8j();
            }
            return null;
        }
        if (zzZXN().zzhk()) {
            long jZzYqr = zzZXN().zzZZJ().zzYqr();
            int iZzZ7Z2 = zzZ7Z();
            if (iZzZ7Z2 != 0 && iZzZ7Z2 != 1 && iZzZ7Z2 != 2) {
                return null;
            }
            int i = (int) (jZzYqr >> 32);
            return new zzYCP(zzyn8.zzYqo() - i, zzyn8.zzYqn() - i);
        }
        int iZzZ7Z3 = zzZ7Z();
        if (iZzZ7Z3 != 0 && iZzZ7Z3 != 1) {
            if (iZzZ7Z3 == 2) {
                if (zzZXN().zzbD()) {
                    return new zzYCP(zzyn8.zzYqo(), zzyn8.zzYqn());
                }
                if (!((zzZKY) zzZXN().zzZ93().zzqh(1024)).isHeader()) {
                    return null;
                }
                return new zzYCP(0, Math.max(0, ((zzZ35) ((zzZ2D) zzyn8.zza9()).zzYTt()).zzYLy()) + (zzyn8.getHeight() / 2));
            }
            if (iZzZ7Z3 != 4 && iZzZ7Z3 != 5 && iZzZ7Z3 != 6 && iZzZ7Z3 != 7) {
                return null;
            }
        }
        return zzZXN().zzZ8l();
    }

    @Override // com.aspose.words.zzZNK
    public final zzYCP zzX(zzYN8 zzyn8) throws Exception {
        if (zzZXN().zzZ8G().zzYMf() != 2 || !zzZXN().zzbD() || zzZXN().zzhk()) {
            return super.zzX(zzyn8);
        }
        zzUZ zzuz = (zzUZ) zzZXN().zzZ93().zzqh(2);
        return new zzYCP(zzuz.getX() + zzuz.zz5X(), zzuz.getRight() - zzuz.zz5V());
    }

    @Override // com.aspose.words.zzZNK
    public final long zzXL(long j) {
        return com.aspose.words.internal.zzZPZ.zzZm(zzZ7X().getX(), (int) (j >> 32));
    }

    @Override // com.aspose.words.zzZNK
    public final boolean zzXm(int i, int i2) {
        if (zzZXN().zzZ99() != 25604 && zzZXN().zzZ8G().getVerticalAlignment() == 3) {
            return (zzZ7Z() == 0 || zzZ7Z() == 1) && zzZ7Y() && zzZ7T().getStart() <= i;
        }
        return false;
    }

    @Override // com.aspose.words.zzZNK
    public final boolean zzXn(int i, int i2) {
        if (i < zzZ7X().getY()) {
            return false;
        }
        if ((zzZXN().zzZ99() == 25604 && zzZXN().zzZ8G().zzYMd() == 3) || zzZXN().zzZ8G().getVerticalAlignment() == 3) {
            return false;
        }
        return !zzZ7Y() || i + zzZ7V() <= zzZ7T().getEnd();
    }
}
