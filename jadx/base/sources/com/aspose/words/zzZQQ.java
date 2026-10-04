package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
final class zzZQQ {
    private zzZYT zzYEZ;
    private zzZYT zzYF0;
    private zzYIS zzYF1;
    private zzZYT zzYF2;
    private zzZYT zzYF3;
    private StringBuilder zzxe;

    public zzZQQ() {
        zzZYT zzzyt = zzZYT.zzYR7;
        this.zzYF0 = zzzyt;
        this.zzYEZ = zzzyt;
        this.zzYF3 = zzzyt;
        this.zzYF2 = zzzyt;
    }

    private static zzYEF zzZT(Node node) {
        Run run = (Run) com.aspose.words.internal.zzZKW.zzZ(node, Run.class);
        return run != null ? run.zzZYh() : new zzYEF();
    }

    private zzYIS zzZeD() {
        zzYIS zzyis = this.zzYF1;
        if (zzyis != null) {
            return zzyis;
        }
        zzYIS zzyis2 = new zzYIS();
        this.zzYF1 = zzyis2;
        return zzyis2;
    }

    private StringBuilder zzZeE() {
        StringBuilder sb = this.zzxe;
        if (sb != null) {
            return sb;
        }
        StringBuilder sb2 = new StringBuilder();
        this.zzxe = sb2;
        return sb2;
    }

    public final void clear() {
        StringBuilder sb = this.zzxe;
        if (sb != null) {
            sb.setLength(0);
            this.zzYF1.clear();
        }
        zzZYT zzzyt = zzZYT.zzYR7;
        this.zzYF3 = zzzyt;
        this.zzYF2 = zzzyt;
        this.zzYF0 = zzzyt;
        this.zzYEZ = zzzyt;
    }

    public final int getLength() {
        StringBuilder sb = this.zzxe;
        if (sb != null) {
            return sb.length();
        }
        return 0;
    }

    public final String getText() {
        StringBuilder sb = this.zzxe;
        return sb != null ? sb.toString() : "";
    }

    public final zzYWB zz9m() {
        return new zzYWB(this.zzYF3, this.zzYF2);
    }

    public final void zzX(zzZB9 zzzb9) {
        if (!this.zzYF3.zz13()) {
            this.zzYF2 = zzzb9.zzYWt();
        }
        if (this.zzYF0.zz13() || zzzb9.zzYWs() != 6) {
            return;
        }
        this.zzYEZ = zzZYT.zzp(zzzb9.getCurrentNode());
    }

    public final void zzY(char c, zzYEF zzyef) {
        zzZeE().append(c);
        if (zzyef == null) {
            zzyef = new zzYEF();
        }
        zzZeD().zzV(c, zzyef);
    }

    public final void zzZ(zzZB9 zzzb9) {
        if (!zzZeF()) {
            this.zzYF3 = zzzb9.zzYWt();
        }
        if (zzzb9.zzYWs() == 0) {
            zzZeE().append(zzzb9.zzIw());
            zzZeD().zzV(zzzb9.zzIw(), zzZT(zzzb9.getCurrentNode()));
        }
    }

    public final boolean zzZeF() {
        return (getLength() <= 0 && this.zzYF3.zz13() && this.zzYF2.zz13()) ? false : true;
    }

    public final zzYWB zzZeR() {
        return new zzYWB(this.zzYF0, this.zzYEZ);
    }

    public final zzYIU zzZgd() {
        zzYIS zzyis = this.zzYF1;
        return zzyis != null ? zzyis.zzYkq() : zzYIU.zzXxD;
    }

    public final void zzY(zzZB9 zzzb9) {
        if (this.zzYF3.zz13()) {
            this.zzYF0 = zzZYT.zzq(zzzb9.getCurrentNode());
        }
    }

    public final void zzZ(zzZQQ zzzqq) {
        if (zzzqq.zzZeF()) {
            if (!zzZeF()) {
                this.zzYF3 = zzzqq.zzYF3;
            }
            this.zzYF2 = zzzqq.zzYF2;
            com.aspose.words.internal.zzZNH.zzU(zzZeE(), zzzqq.getText());
            for (int i = 0; i < zzzqq.zzZgd().getLength(); i++) {
                zzZeD().zzZ(zzzqq.zzZgd().zzpn(i));
            }
            zzzqq.clear();
        }
    }
}
