package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
final class zzZ3S {
    private com.aspose.words.internal.zzBG zzYb8;
    private com.aspose.words.internal.zzZQC<com.aspose.words.internal.zzBA> zzYb9 = new com.aspose.words.internal.zzZQC<>();
    private com.aspose.words.internal.zzB8 zzYba;

    public zzZ3S(com.aspose.words.internal.zzBG zzbg) {
        this.zzYb8 = zzbg;
        zzYNt();
    }

    private static boolean zzR(zzZ6N zzz6n) {
        return zzz6n.getOutlineLevel() >= 0 && zzz6n.getOutlineLevel() <= 5;
    }

    private void zzS(zzZ6N zzz6n) {
        while (zzYNo() < zzz6n.zzZ0C()) {
            com.aspose.words.internal.zzBA zzba = new com.aspose.words.internal.zzBA(zzwC(zzz6n.zzYSi()));
            zzYNs().zzX(zzba);
            this.zzYb9.push(zzba);
        }
    }

    private int zzYNo() {
        return this.zzYb9.size() - 1;
    }

    private com.aspose.words.internal.zzBA zzYNp() {
        if (this.zzYb9.size() > 0) {
            return this.zzYb9.peek();
        }
        return null;
    }

    private com.aspose.words.internal.zzBG zzYNs() {
        com.aspose.words.internal.zzBA zzbaZzYNp = zzYNp();
        if (zzbaZzYNp == null) {
            return this.zzYb8;
        }
        com.aspose.words.internal.zzB8 zzb8 = this.zzYba;
        if (zzb8 != null && zzb8.zzBF() == zzbaZzYNp) {
            for (int i = 0; i < this.zzYba.getCount(); i++) {
                com.aspose.words.internal.zzB9 zzb9 = (com.aspose.words.internal.zzB9) com.aspose.words.internal.zzZKW.zzZ(this.zzYba.zzVl(i), com.aspose.words.internal.zzB9.class);
                if (zzb9 != null) {
                    return zzb9;
                }
            }
        }
        return zzbaZzYNp;
    }

    private static void zzZ(com.aspose.words.internal.zzBA zzba, com.aspose.words.internal.zzBG zzbg) {
        if (zzbg == null) {
            return;
        }
        if (zzba.getCount() == 0) {
            zzbg.zzW(zzba);
            return;
        }
        com.aspose.words.internal.zzBA zzba2 = zzba.getCount() == 1 ? (com.aspose.words.internal.zzBA) com.aspose.words.internal.zzZKW.zzZ(zzba.zzVl(0), com.aspose.words.internal.zzBA.class) : null;
        if (zzba2 != null) {
            zzbg.zzW(zzba);
            zzbg.zzX(zzba2);
        }
    }

    private static int zzwC(int i) {
        if (i == 18) {
            return 7;
        }
        if (i == 19 || i == 22) {
            return 1;
        }
        if (i == 23) {
            return 6;
        }
        if (i == 58) {
            return 5;
        }
        if (i == 59) {
            return 4;
        }
        switch (i) {
            case 0:
                return 1;
            case 1:
                return 2;
            case 2:
                return 3;
            case 3:
                return 4;
            case 4:
                return 5;
            case 5:
            case 6:
            case 7:
            case 8:
                return 7;
            default:
                return 0;
        }
    }

    private void zzwD(int i) {
        while (zzYNo() > i) {
            com.aspose.words.internal.zzBA zzbaPop = this.zzYb9.pop();
            zzZ(zzbaPop, (com.aspose.words.internal.zzBG) com.aspose.words.internal.zzZKW.zzZ(zzbaPop.zzBF(), com.aspose.words.internal.zzBG.class));
        }
    }

    public final void zzT(zzZ6N zzz6n) {
        if (zzR(zzz6n) || !zzz6n.isList()) {
            zzYNt();
            return;
        }
        if (zzYNo() > zzz6n.zzZ0C()) {
            zzwD(zzz6n.zzZ0C());
        } else {
            zzS(zzz6n);
        }
        this.zzYba = new com.aspose.words.internal.zzB8();
        zzYNp().zzX(this.zzYba);
    }

    public final com.aspose.words.internal.zzB8 zzYNq() {
        return this.zzYba;
    }

    public final boolean zzYNr() {
        return this.zzYb9.size() > 0;
    }

    public final void zzYNt() {
        if (zzYNr()) {
            zzwD(-1);
        }
        this.zzYba = null;
    }
}
