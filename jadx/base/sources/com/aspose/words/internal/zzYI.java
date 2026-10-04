package com.aspose.words.internal;

import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: classes5.dex */
abstract class zzYI implements zzHK, zzHM {
    private double zzXc;
    private zzZVI zzXd = new zzZVI();
    private ArrayList<zzHN> zzXf = new ArrayList<>();
    private double zzXo;
    private double zzXx;

    public String toString() {
        StringBuilder sb = new StringBuilder();
        Iterator<zzHN> it = this.zzXf.iterator();
        while (it.hasNext()) {
            zzZNH.zzZ(sb, it.next());
        }
        return sb.toString();
    }

    @Override // com.aspose.words.internal.zzHK
    public final void zzR(double d) {
        this.zzXo = d;
    }

    @Override // com.aspose.words.internal.zzHK
    public final void zzW(double d) {
        this.zzXx = d;
    }

    @Override // com.aspose.words.internal.zzHM
    public final ArrayList<zzHN> zzY4() {
        return this.zzXf;
    }

    @Override // com.aspose.words.internal.zzHK
    public final double zzY5() {
        return this.zzXc;
    }

    @Override // com.aspose.words.internal.zzHK
    public final double zzYh() {
        return this.zzXo;
    }

    @Override // com.aspose.words.internal.zzHK
    public final zzF5 zzYn() {
        return this.zzXd;
    }

    @Override // com.aspose.words.internal.zzHK
    public final zzG zzYs() throws Exception {
        zzG zzg = new zzG();
        Iterator<zzHN> it = this.zzXf.iterator();
        while (it.hasNext()) {
            zzg.zzX(it.next().zzYp());
        }
        zzg.zzW(new zzP9());
        zzg.zzZO().zzY((float) this.zzXx, 0.0f, 0);
        return zzg;
    }

    @Override // com.aspose.words.internal.zzHM
    public final void zzZ(zzHN zzhn) {
        zzhn.zzW(this.zzXc);
        double width = zzhn.getWidth() + this.zzXc;
        this.zzXc = width;
        this.zzXo = width;
        this.zzXd.zzY(zzhn);
        zzZQG.zzZ(this.zzXf, zzhn);
    }
}
