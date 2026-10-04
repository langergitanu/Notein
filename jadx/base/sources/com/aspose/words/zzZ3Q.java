package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
abstract class zzZ3Q {
    protected com.aspose.words.internal.zzBG zzYb3;
    protected zzZ3T zzYb4;
    protected com.aspose.words.internal.zzBB zzYb5;
    protected zzZ6H zzYb6;
    protected com.aspose.words.internal.zzZN zzYb7;
    protected com.aspose.words.internal.zzH zzZdO = new com.aspose.words.internal.zzH();

    public zzZ3Q(zzZ3T zzz3t, com.aspose.words.internal.zzBG zzbg) {
        this.zzYb3 = zzbg;
        this.zzYb4 = zzz3t;
    }

    private void zzD(zzZ6H zzz6h) throws Exception {
        if (this.zzYb6 == null || !zzE(zzz6h)) {
            this.zzYb6 = zzz6h;
        }
    }

    private static boolean zzE(zzZ6H zzz6h) throws Exception {
        return com.aspose.words.internal.zzZYD.zzXh(zzz6h.getText()) || zzY9R.zzmO(zzz6h.zz14().zzZo6());
    }

    private void zzF(zzZ6H zzz6h) throws Exception {
        zzYNk();
        String strZzVn = com.aspose.words.internal.zzBM.zzVn(zzz6h.zz14().zzZo2());
        com.aspose.words.internal.zzZN zzzn = new com.aspose.words.internal.zzZN(this.zzYb4.zzYNw() ? "" : strZzVn, this.zzYb4.zzYNx());
        this.zzYb7 = zzzn;
        com.aspose.words.internal.zzBJ zzbj = new com.aspose.words.internal.zzBJ(zzzn.getId());
        com.aspose.words.internal.zzGH zzgh = zzbj;
        if (this.zzYb4.zzYNw()) {
            zzgh = zzbj;
            if (!(zzz6h instanceof zzZ6B)) {
                zzgh = zzbj;
                if (!com.aspose.words.internal.zzZYD.zzh(strZzVn, this.zzYb4.zzYNu())) {
                    com.aspose.words.internal.zzB4 zzb4 = new com.aspose.words.internal.zzB4(strZzVn);
                    zzb4.zzX(zzbj);
                    zzgh = zzb4;
                }
            }
        }
        zzH(zzz6h).zzX(zzgh);
        this.zzYb6 = zzz6h;
        this.zzYb4.zzYNz().zzL(this.zzYb7);
    }

    public final boolean zzC(zzZ6H zzz6h) throws Exception {
        zzZ6H zzz6h2;
        if (this.zzYb7 == null || (zzz6h2 = this.zzYb6) == null) {
            return true;
        }
        return (zzz6h2.zz14().zzZo2() == zzz6h.zz14().zzZo2() || zzE(zzz6h)) ? false : true;
    }

    public abstract boolean zzG(zzZ6H zzz6h) throws Exception;

    public abstract com.aspose.words.internal.zzBG zzH(zzZ6H zzz6h) throws Exception;

    public final void zzW(com.aspose.words.internal.zzZR zzzr) {
        zzYNk();
        com.aspose.words.internal.zzBB zzbb = new com.aspose.words.internal.zzBB(zzzr.getScreenTip());
        zzYNn().zzX(zzbb);
        zzzr.zzO(this.zzYb4.zzYNx());
        zzbb.zzO(zzzr.zzZY());
        this.zzYb5 = zzbb;
    }

    public final zzZD9 zzY(zzZ68 zzz68) throws Exception {
        return zzZ3J.zzZ(zzz68, zzH(zzz68), this.zzYb4);
    }

    public final void zzYNk() {
        if (this.zzYb7 == null) {
            return;
        }
        this.zzYb4.zzYNz().zzZI();
        this.zzYb7 = null;
        this.zzYb6 = null;
    }

    public final void zzYNl() throws Exception {
        if (this.zzYb4.zzYNv()) {
            com.aspose.words.internal.zzJ zzj = (com.aspose.words.internal.zzJ) this.zzYb4.zzYNz().zzYTS();
            zzj.zzZ(new com.aspose.words.internal.zzBI(this.zzZdO.zzZ((com.aspose.words.internal.zzZL) zzj), this.zzYb4.zzYNy()));
        }
        this.zzYb4.zzYNz().zzZI();
    }

    public final void zzYNm() {
        com.aspose.words.internal.zz7 zz7VarZzYWj;
        if (this.zzYb4.zzYNv()) {
            zzYNk();
            zz7VarZzYWj = zzZ3J.zzYNa();
        } else {
            zz7VarZzYWj = zzYWj();
        }
        this.zzYb4.zzYNz().zzL(zz7VarZzYWj);
    }

    public abstract com.aspose.words.internal.zzBG zzYNn();

    public final com.aspose.words.internal.zz7 zzYWj() {
        return new zzD(this.zzYb4, zzYNn(), "").zzbH();
    }

    public final void zzZ(zzZ6H zzz6h) throws Exception {
        if (zzG(zzz6h)) {
            zzF(zzz6h);
        } else {
            zzD(zzz6h);
        }
    }

    public final void zzZ2l() {
        this.zzYb5 = null;
    }
}
