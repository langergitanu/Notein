package com.aspose.words;

import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: classes6.dex */
final class zzZOH {
    private ArrayList<String> zzYA0;
    private zzYLE zzYA1;
    private zzYLF zzYA2;
    private com.aspose.words.internal.zzD4 zzYA3;
    private com.aspose.words.internal.zzD4 zzYA4;
    private com.aspose.words.internal.zzDB zzYzW;
    private zzY90 zzYzX;
    private zzZZH zzYzY;
    private zzYLP zzYzZ;
    private zzYDZ zzZFZ;

    public zzZOH(zzYDZ zzydz) {
        this.zzYA2 = new zzYLF();
        this.zzYA1 = new zzYLE();
        this.zzYA0 = new ArrayList<>();
        this.zzYzZ = new zzYLP();
        this.zzYzY = new zzZZH(0);
        this.zzYzX = new zzY90();
        this.zzYzW = new com.aspose.words.internal.zzDB();
        this.zzYA3 = new com.aspose.words.internal.zzD4();
        this.zzZFZ = zzydz;
    }

    private static void zzZ(com.aspose.words.internal.zz0S zz0s) {
        if (zz0s.zzsk() > 0) {
            zz0s.zzsl();
        }
    }

    private void zzZak() {
        for (int i = 0; i < this.zzYzZ.getItemCount(); i++) {
            zzZS4 item = this.zzYzZ.getItem(i);
            int i2 = this.zzYA3.get(zzCh(i));
            if (com.aspose.words.internal.zzD4.zzWm(i2)) {
                throw new IllegalStateException();
            }
            item.zzYIe = i2;
        }
    }

    private void zzZal() {
        for (int i = 0; i < this.zzYzZ.getItemCount(); i++) {
            this.zzYA4.set(this.zzYzZ.getItem(i).zzYIe, i);
        }
    }

    public final int zzCg(int i) {
        int i2 = this.zzYA4.get(i);
        if (com.aspose.words.internal.zzD4.zzWm(i2)) {
            throw new IllegalArgumentException("Specified argument was out of the range of valid values.\r\nParameter name: endIndex");
        }
        return zzCh(i2);
    }

    public final int zzCh(int i) {
        return this.zzYzX.get(i);
    }

    public final void zzCi(int i) {
        this.zzYA1.zzX(i, null);
    }

    public final String zzCj(int i) {
        return (i < 0 || i >= this.zzYA0.size()) ? "" : this.zzYA0.get(i);
    }

    public final void zzXB(int i, int i2) {
        this.zzYA3.set(i2, this.zzYzY.zzX(i, null));
    }

    public final void zzXC(int i, int i2) {
        this.zzYzZ.zzX(i, new zzZS4());
        this.zzYzX.add(i2);
    }

    public final zzZZH zzZag() {
        return this.zzYzY;
    }

    public final zzYLP zzZah() {
        return this.zzYzZ;
    }

    public final zzYLE zzZai() {
        return this.zzYA1;
    }

    public final zzYLF zzZaj() {
        return this.zzYA2;
    }

    public final void zzZ(zzZRA zzzra, com.aspose.words.internal.zzZOW zzzow) throws Exception {
        zzzra.zzYGE.zzXA5.zzYHK = (int) zzzow.zzq().getPosition();
        Iterator<T> it = this.zzYA0.iterator();
        while (it.hasNext()) {
            zzZZQ.zzZ((String) it.next(), 55, zzzow, true, false);
        }
        zzZRG zzzrg = zzzra.zzYGE.zzXA5;
        int position = (int) zzzow.zzq().getPosition();
        zzYJ2 zzyj2 = zzzra.zzYGE;
        zzzrg.zzYHJ = position - zzyj2.zzXA5.zzYHK;
        zzyj2.zzXAB.zzYHK = (int) zzzow.zzq().getPosition();
        zzzra.zzYGE.zzXAB.zzYHJ = this.zzYA2.zzV(zzzow);
        zzzra.zzYGC.zzXyQ.zzYHK = (int) zzzow.zzq().getPosition();
        zzzra.zzYGC.zzXyQ.zzYHJ = this.zzYA2.zzI(zzzow);
        zzzra.zzYGE.zzXAA.zzYHK = (int) zzzow.zzq().getPosition();
        zzzra.zzYGE.zzXAA.zzYHJ = this.zzYA1.zzV(zzzow);
        zzZak();
        zzzra.zzYGE.zzXzZ.zzYHK = (int) zzzow.zzq().getPosition();
        zzzra.zzYGE.zzXzZ.zzYHJ = this.zzYzZ.zzV(zzzow);
        zzzra.zzYGE.zzXzY.zzYHK = (int) zzzow.zzq().getPosition();
        zzzra.zzYGE.zzXzY.zzYHJ = this.zzYzY.zzV(zzzow);
        zzzra.zzYGE.zzXA4.zzYHK = (int) zzzow.zzq().getPosition();
        zzzra.zzYGE.zzXA4.zzYHJ = this.zzYzX.zzX(zzzow, false);
    }

    public zzZOH(zzZRA zzzra, com.aspose.words.internal.zzZOX zzzox) throws Exception {
        this.zzYA2 = new zzYLF();
        this.zzYA1 = new zzYLE();
        this.zzYA0 = new ArrayList<>();
        this.zzYzZ = new zzYLP();
        this.zzYzY = new zzZZH(0);
        this.zzYzX = new zzY90();
        this.zzYzW = new com.aspose.words.internal.zzDB();
        this.zzYA4 = new com.aspose.words.internal.zzD4();
        zzzox.zzq().zzH(zzzra.zzYGE.zzXA5.zzYHK);
        zzZRG zzzrg = zzzra.zzYGE.zzXA5;
        int i = zzzrg.zzYHK + zzzrg.zzYHJ;
        while (zzzox.zzq().getPosition() < i) {
            com.aspose.words.internal.zzZQG.zzZ(this.zzYA0, zzZZR.zzZ(zzzox, true, false));
        }
        this.zzYA2.zzZ(zzzox, zzzra.zzYGE.zzXAB);
        zzYLF zzylf = this.zzYA2;
        zzZRG zzzrg2 = zzzra.zzYGC.zzXyQ;
        zzylf.zzV(zzzox, zzzrg2.zzYHK, zzzrg2.zzYHJ);
        this.zzYA1.zzZ(zzzox, zzzra.zzYGE.zzXAA);
        this.zzYzZ.zzZ(zzzox, zzzra.zzYGE.zzXzZ);
        this.zzYzY.zzZ(zzzox, zzzra.zzYGE.zzXzY);
        zzY90 zzy90 = this.zzYzX;
        zzZRG zzzrg3 = zzzra.zzYGE.zzXA4;
        zzy90.zzT(zzzox, zzzrg3.zzYHK, zzzrg3.zzYHJ);
        zzZ(this.zzYzZ);
        zzZ(this.zzYzY);
        zzZal();
    }

    public final void zzZ(int i, Comment comment) {
        zzZX zzzx = new zzZX();
        zzzx.zzZFh = comment.getInitial();
        zzzx.zzZFe = comment.zzZZU();
        int iIndexOf = this.zzYA0.indexOf(comment.getAuthor());
        zzzx.zzZFg = iIndexOf;
        if (iIndexOf < 0) {
            zzzx.zzZFg = this.zzYA0.size();
            com.aspose.words.internal.zzZQG.zzZ(this.zzYA0, comment.getAuthor());
        }
        zzzx.zzZFf = this.zzZFZ.zzL(comment) ? comment.getId() : -1;
        this.zzYzW.add(comment.getId());
        if (comment.getParentId() != -1) {
            int iIndexOf2 = this.zzYzW.indexOf(comment.getParentId());
            if (iIndexOf2 >= 0) {
                zzzx.zzZFd = iIndexOf2 - (this.zzYzW.getCount() - 1);
                zzzx.zzZFc = 1;
            } else {
                this.zzZFZ.zzYfy.zzG(10, com.aspose.words.internal.zzZKN.format("Unable to write parent reference for comment id: {0}.", Integer.valueOf(comment.getId())));
            }
        }
        this.zzYA2.zzX(i, zzzx);
    }
}
