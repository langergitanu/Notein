package com.aspose.words.internal;

/* JADX INFO: loaded from: classes5.dex */
public abstract class zzZV7 extends zzZV5 implements zzZOY {
    private zzZQC<zzZR> zz72;
    private zzP zz73;
    private zzZOR zz74;

    public zzZV7(zzZVD zzzvd) throws Exception {
        super(zzzvd);
        this.zz72 = new zzZQC<>();
        zzZOR zzzor = new zzZOR();
        this.zz74 = zzzor;
        this.zz73 = new zzP(zzzor, zzzvd.zznh().getPrettyFormat());
    }

    public static boolean zzF(zzG zzg) {
        return (zzg == null || zzg.zzZM() == null || zzg.zzZM().getType() != 0 || zzg.zzZM().zzZZ().isEmpty()) ? false : true;
    }

    private void zzGY() {
        zzZOR zzzor = this.zz74;
        if (zzzor != null) {
            zzzor.dispose();
            this.zz74 = null;
        }
    }

    public static boolean zzQ(zz7 zz7Var) {
        for (int i = 0; i < zz7Var.getCount(); i++) {
            zzZL zzzlZzN = zz7Var.zzN(i);
            zzZU zzzu = (zzZU) zzZKW.zzZ(zzzlZzN, zzZU.class);
            if ((zzzu == null || !(zzzu.isHidden() || zzZKN.zzU3(zzZKN.zzTX(zzzu.getText())))) && !((zzzlZzN instanceof zz7) && zzQ((zz7) zzzlZzN))) {
                return false;
            }
        }
        return true;
    }

    @Override // com.aspose.words.internal.zzZOY
    public void dispose() {
        zzGY();
    }

    public abstract void zzG3() throws Exception;

    public abstract void zzN(zzG zzg) throws Exception;

    public abstract void zzO(zzG zzg) throws Exception;

    public abstract void zzQ(zzZU zzzu) throws Exception;

    public abstract void zzS(zzZG zzzg) throws Exception;

    public final void zzU(zzL zzl) {
        zzZR zzzr = (zzZR) zzZKW.zzZ(zzl, zzZR.class);
        if (zzzr == null || this.zz72.size() <= 0 || this.zz72.peek() != zzzr) {
            return;
        }
        this.zz73.zzp();
        this.zz72.pop();
    }

    public abstract void zzX(zzZH zzzh) throws Exception;

    public abstract void zzX(zzZP zzzp) throws Exception;

    public abstract void zzY(zz9 zz9Var) throws Exception;

    public abstract void zzY(zzC zzc) throws Exception;

    public abstract void zzY(zzI zzi) throws Exception;

    public final void zzZ(zzL zzl, boolean z) {
        zzZR zzzr = (zzZR) zzZKW.zzZ(zzl, zzZR.class);
        if (zzzr == null) {
            return;
        }
        this.zz73.zzY("a");
        this.zz73.zzX(z ? "xlink:href" : "href", zzzr.zzZf() ? zzZKN.format("#{0}", zzzr.getTarget()) : zzzr.getTarget());
        String strZzU2 = zzzr.zzZe() != null ? zzZKN.zzU2(zzzr.zzZe()) : "";
        if (!zzZKN.equals(strZzU2, "") && !"_self".equals(strZzU2) && !"_parent".equals(strZzU2) && !"_top".equals(strZzU2)) {
            this.zz73.zzX("target", "_blank");
        }
        this.zz72.push(zzzr);
    }

    public final zzP zzn5() {
        return this.zz73;
    }

    public final void zzn6() throws Exception {
        this.zz74.zzH(0L);
        zzng().zzZ((zzZOP) this.zz74, true);
        this.zz74.close();
    }
}
