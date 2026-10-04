package com.aspose.words.internal;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes5.dex */
public class zzYN implements zzHP {
    private zzHL zzXC;
    private int zzXZ;
    private ArrayList<zzHK> zzXl;
    private double zzXm;
    private int zzXn;
    private double zzXo;
    private zzFD zzXr;
    private ArrayList<zzYO> zzXz;

    public zzYN(zzHL zzhl) {
        this.zzXC = zzhl;
    }

    private boolean zzYj() {
        while (this.zzXn < this.zzXl.size()) {
            zzHK zzhk = this.zzXl.get(this.zzXn);
            if (zzhk.getType() == 2) {
                this.zzXn++;
                return true;
            }
            if (zzS(zzhk.zzY5())) {
                return false;
            }
            this.zzXo = zzhk.zzY5() + this.zzXo;
            this.zzXn++;
        }
        return false;
    }

    private void zzYl() {
        zzZ3 zzz3 = new zzZ3(this.zzXl);
        zzz3.zzL(this.zzXZ);
        zzz3.setEndIndex(this.zzXn);
        zzZQG.zzZ(this.zzXz, new zzYO(zzz3, this.zzXr));
        this.zzXZ = this.zzXn;
        this.zzXo = 0.0d;
    }

    public final int getCurrentIndex() {
        return this.zzXn;
    }

    public final void zzG(int i) {
        this.zzXn = i;
    }

    public final void zzR(double d) {
        this.zzXo = d;
    }

    public boolean zzS(double d) {
        return this.zzXo + d > this.zzXm;
    }

    public final zzHL zzYe() {
        return this.zzXC;
    }

    public final ArrayList<zzHK> zzYf() {
        return this.zzXl;
    }

    public final double zzYg() {
        return this.zzXm;
    }

    public final double zzYh() {
        return this.zzXo;
    }

    public void zzYi() {
        while (this.zzXn < this.zzXl.size()) {
            zzHK zzhk = this.zzXl.get(this.zzXn);
            if (zzhk.getType() != 1) {
                return;
            }
            this.zzXo = zzhk.zzY5() + this.zzXo;
            this.zzXn++;
        }
    }

    public boolean zzYk() throws Exception {
        while (this.zzXn < this.zzXl.size()) {
            zzHK zzhk = this.zzXl.get(this.zzXn);
            this.zzXo = zzhk.zzY5() + this.zzXo;
            if (zzhk.getType() == 2) {
                this.zzXn++;
                return true;
            }
            if (zzhk.getType() != 1) {
                this.zzXn++;
                return false;
            }
            this.zzXn++;
        }
        return false;
    }

    @Override // com.aspose.words.internal.zzHP
    public final ArrayList<zzYO> zzZ(ArrayList<zzHK> arrayList, zzGI zzgi, zzFD zzfd) throws Exception {
        zzZ(arrayList, zzfd);
        while (this.zzXn < this.zzXl.size()) {
            this.zzXm = zzgi.zzFy();
            if (!zzYk() && !zzYj()) {
                zzYi();
            }
            zzYl();
        }
        return this.zzXz;
    }

    private void zzZ(ArrayList<zzHK> arrayList, zzFD zzfd) {
        this.zzXr = zzfd;
        this.zzXz = new ArrayList<>();
        this.zzXl = arrayList;
        this.zzXZ = 0;
        this.zzXn = 0;
        this.zzXo = 0.0d;
    }
}
