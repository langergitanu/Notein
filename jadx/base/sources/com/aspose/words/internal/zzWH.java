package com.aspose.words.internal;

import com.aspose.words.EditingLanguage;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes5.dex */
final class zzWH {
    private zzWF[] zzTo;
    private boolean zzTr;
    private boolean zzTs;
    private int zzTt;
    private zzHD zzTu;
    private zzWL zzTv;
    private zzWL zzTw;
    private boolean zzTx;
    private zzZQC<zzV0> zzTq = new zzZQC<>();
    private zzZQC<zzWF> zzTp = new zzZQC<>();

    public zzWH(byte[] bArr, zzWL zzwl, zzWL zzwl2, zzHD zzhd) {
        this.zzTw = zzwl;
        this.zzTv = zzwl2;
        this.zzTu = zzhd;
        this.zzTq.push(new zzV0(bArr));
        this.zzTo = zzUP();
        this.zzTs = true;
    }

    private boolean zzUC() {
        return this.zzTq.size() > 1;
    }

    private zzV0 zzUD() {
        return this.zzTq.peek();
    }

    private static zzWF[] zzUP() {
        zzWF[] zzwfArr = new zzWF[32];
        for (int i = 0; i < 32; i++) {
            zzwfArr[i] = zzWF.zzTm;
        }
        return zzwfArr;
    }

    private void zzV(int i, boolean z) {
        if (this.zzTx) {
            return;
        }
        if (this.zzTq.size() > 17) {
            zzUI();
            return;
        }
        zzWL zzwl = z ? this.zzTw : this.zzTv;
        int iZzz = zzz(zzwl.zzUV(), i);
        if (iZzz < 0 || iZzz >= zzwl.zzUV()) {
            return;
        }
        this.zzTq.push(new zzV0(zzwl.zzZq(iZzz)));
        if (z) {
            this.zzTu.zzZf(iZzz);
        } else {
            this.zzTu.zzZe(iZzz);
        }
    }

    private static int zzz(int i, int i2) {
        return i < 1240 ? i2 + 107 : i < 33900 ? i2 + EditingLanguage.QUECHUA_BOLIVIA : i2 + 32768;
    }

    public final boolean hasErrors() {
        return this.zzTx;
    }

    public final byte readByte() {
        if (!zzUD().canRead()) {
            zzUI();
        }
        return zzUD().readByte();
    }

    public final void zzUE() {
        this.zzTr = true;
        this.zzTu.zzUy();
    }

    public final void zzUF() {
        if (this.zzTq.size() > 1) {
            this.zzTq.pop();
        }
    }

    public final ArrayList<zzWF> zzUG() {
        ArrayList<zzWF> arrayListZzZn = zzZn(this.zzTp.size());
        ArrayList<zzWF> arrayList = new ArrayList<>(arrayListZzZn.size());
        for (int size = arrayListZzZn.size() - 1; size >= 0; size--) {
            zzZQG.zzZ(arrayList, arrayListZzZn.get(size));
        }
        return arrayList;
    }

    public final zzWF zzUH() {
        if (this.zzTp.size() != 0) {
            return this.zzTp.pop();
        }
        zzUI();
        return zzWF.zzTm;
    }

    public final void zzUI() {
        this.zzTr = true;
        this.zzTx = true;
    }

    public final zzWG zzUJ() {
        if (!zzUD().canRead()) {
            return zzUC() ? new zzVB() : new zzW3();
        }
        zzWG zzwgZzUJ = zzUD().zzUJ();
        if (!zzUD().zzUq()) {
            return zzwgZzUJ;
        }
        zzUI();
        return null;
    }

    public final zzV1 zzUK() {
        return this.zzTu.zzUK();
    }

    public final boolean zzUL() {
        return this.zzTr;
    }

    public final boolean zzUM() {
        return this.zzTs;
    }

    public final int zzUN() {
        return this.zzTt;
    }

    public final int zzUO() {
        return this.zzTp.size();
    }

    public final void zzZ(zzWF zzwf) {
        this.zzTp.push(zzwf);
    }

    public final void zzZk(int i) {
        zzV(i, false);
    }

    public final void zzZl(int i) {
        zzV(i, true);
    }

    public final zzWF zzZm(int i) {
        if (i >= 0) {
            zzWF[] zzwfArr = this.zzTo;
            if (i < zzwfArr.length) {
                return zzwfArr[i];
            }
        }
        return zzWF.zzTm;
    }

    public final ArrayList<zzWF> zzZn(int i) {
        ArrayList<zzWF> arrayList = new ArrayList<>(i);
        for (int i2 = 0; i2 < i; i2++) {
            zzZQG.zzZ(arrayList, zzUH());
        }
        return arrayList;
    }

    public final void zzZo(int i) {
        this.zzTt = i;
    }

    public final void zzu(boolean z) {
        this.zzTs = false;
    }

    public final void zzZ(int i, zzWF zzwf) {
        if (i >= 0) {
            zzWF[] zzwfArr = this.zzTo;
            if (i >= zzwfArr.length) {
                return;
            }
            zzwfArr[i] = zzwf;
        }
    }

    public final void zzZ(zzUZ zzuz) {
        this.zzTu.zzY(zzuz);
        zzUE();
    }
}
