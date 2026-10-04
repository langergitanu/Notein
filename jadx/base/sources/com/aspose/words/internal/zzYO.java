package com.aspose.words.internal;

import java.util.Iterator;

/* JADX INFO: loaded from: classes5.dex */
public final class zzYO implements zzHQ {
    private double zzXp;
    private zzZ3<zzHK> zzXq;
    private zzFD zzXr;
    private zzZ3<zzHK> zzXs;
    private double zzXt;
    private boolean zzXu;
    private zzZVI zzXv = new zzZVI();
    private double zzXw;
    private double zzXx;

    public zzYO(zzZ3<zzHK> zzz3, zzFD zzfd) {
        this.zzXs = zzz3;
        this.zzXr = zzfd;
        zzYo();
        zzYq();
    }

    private void zzT(double d) {
        boolean zZzZz = this.zzXr.zzMe().zzZz();
        if (zZzZz) {
            d = d + this.zzXt + this.zzXp;
        }
        for (int i = 0; i < this.zzXq.getCount(); i++) {
            zzHK item = this.zzXq.getItem(i);
            item.zzR(item.zzY5());
            item.zzW(zZzZz ? d - item.zzYh() : d);
            d += zZzZz ? -item.zzYh() : item.zzYh();
        }
    }

    private void zzU(double d) {
        boolean zZzZz = this.zzXr.zzMe().zzZz();
        double d2 = (d - this.zzXp) / this.zzXt;
        if (!zZzZz) {
            d = 0.0d;
        }
        for (int i = 0; i < this.zzXq.getCount(); i++) {
            zzHK item = this.zzXq.getItem(i);
            item.zzR(item.getType() == 1 ? item.zzY5() * d2 : item.zzY5());
            item.zzW(zZzZz ? d - item.zzYh() : d);
            d += zZzZz ? -item.zzYh() : item.zzYh();
        }
    }

    private void zzYo() {
        this.zzXq = this.zzXs.zzYH();
        while (this.zzXq.zzYG() && this.zzXq.zzYF().getType() != 0) {
            this.zzXq.zzYI();
        }
    }

    private void zzYq() {
        this.zzXt = 0.0d;
        this.zzXp = 0.0d;
        this.zzXv.reset();
        for (int i = 0; i < this.zzXq.getCount(); i++) {
            zzHK item = this.zzXq.getItem(i);
            int type = item.getType();
            if (type == 0) {
                this.zzXp = item.zzY5() + this.zzXp;
            } else if (type == 1) {
                this.zzXt = item.zzY5() + this.zzXt;
            } else if (type != 2) {
                throw new IllegalArgumentException();
            }
        }
        for (int i2 = 0; i2 < this.zzXs.getCount(); i2++) {
            this.zzXv.zzY(this.zzXs.getItem(i2).zzYn());
        }
    }

    @Override // com.aspose.words.internal.zzHQ
    public final boolean isVisible() {
        return this.zzXu;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        Iterator<zzHK> it = this.zzXs.zzYE().iterator();
        while (it.hasNext()) {
            zzZNH.zzZ(sb, it.next());
        }
        return sb.toString();
    }

    @Override // com.aspose.words.internal.zzHQ
    public final void zzV(double d) {
        this.zzXw = d;
    }

    @Override // com.aspose.words.internal.zzHQ
    public final double zzYm() {
        return this.zzXw;
    }

    @Override // com.aspose.words.internal.zzHQ
    public final zzF5 zzYn() {
        return this.zzXv;
    }

    @Override // com.aspose.words.internal.zzHQ
    public final zzZL zzYp() throws Exception {
        zzG zzg = new zzG();
        for (int i = 0; i < this.zzXq.getCount(); i++) {
            zzg.zzX((zzZL) this.zzXq.getItem(i).zzYs());
        }
        zzg.zzW(new zzP9());
        zzg.zzZO().zzY((float) this.zzXx, (float) this.zzXw, 0);
        return zzg;
    }

    @Override // com.aspose.words.internal.zzHQ
    public final void zzZ(int i, double d, double d2) {
        this.zzXx = d;
        double d3 = d2 - d;
        double d4 = this.zzXt + this.zzXp;
        if (i == 0) {
            zzT(0.0d);
            return;
        }
        if (i == 1) {
            zzT((d3 - d4) / 2.0d);
        } else if (i == 2) {
            zzT(d3 - d4);
        } else {
            if (i != 3) {
                throw new IllegalArgumentException("Specified argument was out of the range of valid values.\r\nParameter name: alignment");
            }
            zzU(d3);
        }
    }

    @Override // com.aspose.words.internal.zzHQ
    public final void isVisible(boolean z) {
        this.zzXu = z;
    }
}
