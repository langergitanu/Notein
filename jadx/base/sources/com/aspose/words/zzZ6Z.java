package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
final class zzZ6Z extends zzZ6S {
    private int zzYgn;
    private long zzYgo;

    public zzZ6Z(zzYMD zzymd, long j, int i) {
        super(zzymd);
        this.zzYgo = j;
        this.zzYgn = i;
    }

    public final com.aspose.words.internal.zzZQ5 zzO(zzZNO zzzno) throws Exception {
        com.aspose.words.internal.zzZQ5 zzzq5Zz7G = zzzno.zzZ8R().zz7G();
        return new com.aspose.words.internal.zzZQ5(zzzq5Zz7G.getX() - ((int) this.zzYgo), zzzq5Zz7G.getY() - ((int) (this.zzYgo >> 32)), zzzq5Zz7G.getWidth(), zzzq5Zz7G.getHeight());
    }

    public final int zzYTD() throws Exception {
        return this.zzYgm.getY() - ((int) (this.zzYgo >> 32));
    }

    public final int zzYTE() {
        return this.zzYgn;
    }

    public final int zzYTF() throws Exception {
        zzUZ zzuz = (zzUZ) this.zzYgm;
        if (zzuz.zz4U() || zzuz.isEmpty() || !((zzZ35) ((zzZ2D) zzuz.zza9()).zzYTt()).zzYLv()) {
            return Integer.MIN_VALUE;
        }
        int x = this.zzYgm.getX() - ((int) this.zzYgo);
        int i = ((zzZ35) ((zzZ2D) zzuz.zza9()).zzYTt()).zzYLu()[((zzUZ) zzuz.zzYo0()).getColumnIndex()] / 2;
        return zzuz.zz5T() ? x + this.zzYgm.getWidth() + i : x - i;
    }

    @Override // com.aspose.words.zzZ6S
    public final void zzZ(zzZ61 zzz61) throws Exception {
        zzUZ zzuz = (zzUZ) this.zzYgm;
        zzz61.zzZ(this);
        zzZ6S.zzZ(zzz61, zzuz.zz6x());
        zzZ(zzz61, (zzYVR) zzuz.zz09());
        zzZ(zzz61, (zzYVR) zzuz.zz08());
        zzz61.zzY(this);
    }

    @Override // com.aspose.words.zzZ6S
    public final float zzZm() {
        return (this.zzYgm.getX() - ((int) this.zzYgo)) / 1000.0f;
    }

    @Override // com.aspose.words.zzZ6S
    public final float zzZo() throws Exception {
        return zzYTD() / 1000.0f;
    }

    private static void zzZ(zzZ61 zzz61, zzYVR zzyvr) throws Exception {
        if (zzyvr == null || zzyvr.isEmpty()) {
            return;
        }
        zzZ6S zzz6s = new zzZ6S(zzyvr);
        zzz6s.zzZ1(zzyvr.getY() / 1000.0f);
        zzz61.zzX(zzz6s);
        zzZ(zzz61, (zzTF) zzyvr.zzYzt());
        for (zzYVQ zzyvq = (zzYVQ) zzyvr.zz6x(); zzyvq != null; zzyvq = (zzYVQ) zzyvq.zz5Z()) {
            zzZ(zzz61, (zzTF) zzyvq);
        }
        if (zzyvr.zzYzs() != null && zzyvr.zzYzs().isVisible()) {
            zzZ(zzz61, (zzTF) zzyvr.zzYzs());
        }
        zzz61.zzW(zzz6s);
    }

    private static void zzZ(zzZ61 zzz61, zzTF zztf) throws Exception {
        zzZ6S zzz6s = new zzZ6S(zztf);
        zzz6s.zzZ1(zztf.getY() / 1000.0f);
        zzz61.zzX(zzz6s);
        zzZ6S.zzZ(zzz61, zztf.zz6x());
        zzz61.zzW(zzz6s);
    }
}
