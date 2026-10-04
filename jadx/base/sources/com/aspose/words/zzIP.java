package com.aspose.words;

import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: classes6.dex */
final class zzIP {
    private float zzZhL;
    private zzB6 zzZhM;
    private zzIN zzZhN;
    private float zzvB = Float.POSITIVE_INFINITY;
    private float zzjo = Float.NEGATIVE_INFINITY;
    private boolean zzD7 = true;
    private ArrayList<zzIO> zzZm = new ArrayList<>();

    public zzIP(zzIN zzin, zzB6 zzb6) {
        this.zzZhN = zzin;
        this.zzZhM = zzb6;
    }

    private void zzZSj() {
        for (zzIO zzio : this.zzZm) {
            zzio.zzZA(zzio.zzZRJ() - this.zzvB);
        }
        this.zzjo -= this.zzvB;
        this.zzvB = 0.0f;
    }

    public final boolean isEmpty() {
        return this.zzD7;
    }

    public final void zzYa(long j) {
        zzZSj();
        float f = this.zzjo - this.zzvB;
        float fZzYc = this.zzZhN.zzZRH().zzYc(j);
        if (f <= fZzYc) {
            return;
        }
        float f2 = fZzYc / f;
        Iterator<zzIO> it = this.zzZm.iterator();
        while (it.hasNext()) {
            it.next().setScale(f2);
        }
        this.zzvB *= f2;
        this.zzjo *= f2;
    }

    public final boolean zzYf(long j) {
        return this.zzjo - this.zzvB <= this.zzZhN.zzZRH().zzYc(j);
    }

    public final void zzZ(zz9K zz9k) {
        zzIO zzio = new zzIO(zz9k, this.zzZhN.zzZRH());
        zzio.zzZA(this.zzZhL);
        this.zzZhL += zzio.zzZRM();
        if (zzio.zzZRM() >= 0.0f) {
            this.zzvB = Math.min(this.zzvB, zzio.zzZRJ());
            this.zzjo = Math.max(this.zzjo, zzio.zzZRJ() + zzio.zzZRL());
            this.zzD7 = false;
        }
        com.aspose.words.internal.zzZQG.zzZ(this.zzZm, zzio);
    }

    public final long zzZRN() {
        float f = this.zzjo - this.zzvB;
        Iterator<zzIO> it = this.zzZm.iterator();
        float fMax = 0.0f;
        while (it.hasNext()) {
            fMax = Math.max(fMax, it.next().getHeight());
        }
        return this.zzZhN.zzZRH().zzC(f, fMax);
    }

    public final void zzZRO() {
        for (zzIO zzio : this.zzZm) {
            this.zzZhN.zzZRH().zzZ(zzio.zzZSg(), zzio.zzZRI(), this.zzZhM);
        }
    }

    public final void zzZSi() {
        long jZzZRN = zzZRN();
        zzZSj();
        for (zzIO zzio : this.zzZm) {
            if (!zzio.zzZRK()) {
                float fZzZ = this.zzZhN.zzZRH().zzZ(zzio.getHeight(), jZzZRN, this.zzZhN.zzZRG(), this.zzZhN.zzZRF());
                long j = jZzZRN;
                jZzZRN = j;
                zzio.zzZSg().zzXX(this.zzZhN.zzZRH().zzZ(zzio.zzOG(), zzio.getWidth(), fZzZ, j));
            }
        }
    }
}
