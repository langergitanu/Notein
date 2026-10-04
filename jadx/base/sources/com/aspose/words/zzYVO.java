package com.aspose.words;

import com.aspose.words.ref.RefInt;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: classes6.dex */
abstract class zzYVO {
    protected int zzXUA;
    protected zzYVR zzXUB;
    private zzYBK zzXUy = new zzYBK();
    protected boolean zzXUz;
    protected boolean zzZsl;
    protected int zzZvz;

    private void zzYzm() throws Exception {
        this.zzXUy.zzZ((zzYBL) this.zzXUB.zzYzt(), 1073741823, true, false);
        this.zzXUB.zzYzt().zzYU(true);
        if (this.zzXUB.zzYzs() != null) {
            this.zzXUy.zzZ((zzYBL) this.zzXUB.zzYzs(), 1073741823, true, false);
            this.zzXUB.zzYzs().zzYU(true);
        }
        this.zzXUA = this.zzXUB.zzYzr();
    }

    private void zztn(int i) throws Exception {
        for (zzYVQ zzyvq = (zzYVQ) this.zzXUB.zz6x(); zzyvq != null; zzyvq = (zzYVQ) zzyvq.zz5Z()) {
            if (i <= 0 && !zzyvq.zzYnZ()) {
                zzyvq.zzN((zzYVR) this.zzXUB.zz0s());
                return;
            }
            zzyvq.zzYzp();
            this.zzXUy.zzZ(zzyvq, i, this.zzZsl, this.zzXUz);
            zzyvq.zzYU(true);
            if (zzyvq.isEmpty()) {
                zzyvq.zza9();
                zzyvq.zzZZJ();
            }
            if (this.zzXUy.isOverflow()) {
                return;
            }
            i -= zzyvq.getHeight();
        }
    }

    public final boolean isOverflow() {
        zzYBK zzybk = this.zzXUy;
        return zzybk != null && zzybk.isOverflow();
    }

    public abstract boolean zzR(RefInt refInt) throws Exception;

    public final ArrayList<zzYAD> zzYzl() {
        if (this.zzXUB.isEmpty()) {
            return null;
        }
        ArrayList<zzYAD> arrayList = new ArrayList<>();
        Iterator<zzYMD> it = this.zzXUB.zzZ((zzYMD) null, (zzYMD) null).iterator();
        while (it.hasNext()) {
            com.aspose.words.internal.zzZQG.zzZ(arrayList, (zzYAD) ((zzYVN) ((zzYVQ) it.next()).zza9()).zzYzk());
        }
        return arrayList;
    }

    public final boolean zzYzn() throws Exception {
        zzZja();
        RefInt refInt = new RefInt(0);
        boolean zZzR = zzR(refInt);
        int i = refInt.get();
        if (zZzR) {
            return true;
        }
        zztn(i);
        if (this.zzXUB.isEmpty()) {
            this.zzXUB.remove();
            return true;
        }
        this.zzXUB.isActive();
        return false;
    }

    public final zzYVR zzYzo() {
        return this.zzXUB;
    }

    public final void zzZ(zzYVR zzyvr, int i, boolean z, boolean z2) throws Exception {
        if (zzyvr != null) {
            zzyvr.isActive();
        }
        this.zzXUB = zzyvr;
        this.zzZvz = i;
        this.zzXUz = z2;
        this.zzZsl = z;
        if (z2 || !zzZjb()) {
            zzYzm();
            if (zzYzn() || zzZjc()) {
                return;
            }
            this.zzXUB.zzYU(true);
        }
    }

    public abstract void zzZja() throws Exception;

    public abstract boolean zzZjb() throws Exception;

    public boolean zzZjc() throws Exception {
        return false;
    }
}
