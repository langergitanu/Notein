package com.aspose.words.internal;

import Oooo0oO.C21034OooOOOo;
import androidx.appcompat.view.menu.C21505OooO0Oo;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes5.dex */
abstract class zzCF implements zzZOY {
    private boolean zztH;
    private ArrayList<zzCI> zztJ;
    private boolean zztM;
    char zztS;
    private Object zztT;
    private int zztU;
    private zzCI zztQ = new zzCI();
    private zzZP1 zztP = zzCB.zztB;
    private int zztO = 3;
    private int zztN = 0;
    int zztL = 1;
    private String zztK = "yyyy'-'MM'-'dd'T'HH':'mm':'ss.FFFFFFFK";
    int zztR = 0;
    private boolean zztI = true;

    private int zzCQ() {
        zzCI zzci;
        ArrayList<zzCI> arrayList = this.zztJ;
        if (arrayList == null || arrayList.size() <= 0) {
            zzci = this.zztQ;
            this.zztQ = new zzCI();
        } else {
            zzci = this.zztQ;
            this.zztQ = (zzCI) C21505OooO0Oo.OooO00o(1, this.zztJ);
            C21034OooOOOo.OooO0O0(1, this.zztJ);
        }
        if (this.zztN > 0 && getDepth() <= this.zztN) {
            this.zztM = false;
        }
        return zzci.getType();
    }

    private boolean zzCl() {
        int i = this.zztU;
        while (true) {
            if (i != 0 && i != 5) {
                return true;
            }
            if (!read()) {
                return false;
            }
            i = this.zztU;
        }
    }

    private boolean zzCm() {
        return read() && zzCl();
    }

    private void zzCo() {
        this.zztR = this.zztH ? 0 : 12;
    }

    private void zzCq() {
        if (this.zztQ.zzCy()) {
            zzCI zzci = this.zztQ;
            zzci.setPosition(zzci.getPosition() + 1);
        }
    }

    private void zzGY() {
        if (this.zztR != 7) {
            close();
        }
    }

    private void zzVF(int i) {
        zzCq();
        if (this.zztQ.getType() == 0) {
            this.zztQ = new zzCI(i);
            return;
        }
        if (this.zztJ == null) {
            this.zztJ = new ArrayList<>();
        }
        zzZQG.zzZ(this.zztJ, this.zztQ);
        this.zztQ = new zzCI(i);
        if (this.zztN > 0) {
            int depth = getDepth() + 1;
            int i2 = this.zztN;
            if (depth <= i2 || this.zztM) {
                return;
            }
            this.zztM = true;
            throw zzCE.zzZ(this, zzZKN.format("The reader's MaxDepth of {0} has been exceeded.", Integer.valueOf(i2)));
        }
    }

    private int zzVs(int i) {
        switch (i) {
            case 13:
                return 1;
            case 14:
                return 2;
            case 15:
                return 3;
            default:
                throw zzCE.zzZ(this, zzZKN.format("Not a valid close JsonToken: {0}", Integer.valueOf(i)));
        }
    }

    private void zzVt(int i) {
        int iZzCQ = zzCQ();
        if (zzVs(i) != iZzCQ) {
            throw zzCE.zzZ(this, zzZKN.format("JsonToken {0} is not valid for closing JsonType {1}.", Integer.valueOf(i), Integer.valueOf(iZzCQ)));
        }
        if (this.zztQ.getType() != 0 || this.zztH) {
            this.zztR = 8;
        } else {
            zzCo();
        }
    }

    public void close() {
        this.zztR = 7;
        this.zztU = 0;
        this.zztT = null;
    }

    @Override // com.aspose.words.internal.zzZOY
    public void dispose() {
        zzGY();
    }

    public final int getDepth() {
        ArrayList<zzCI> arrayList = this.zztJ;
        int size = arrayList != null ? arrayList.size() : 0;
        return (zzC3.zzVp(this.zztU) || this.zztQ.getType() == 0) ? size : size + 1;
    }

    public final String getPath() {
        if (this.zztQ.getType() == 0) {
            return "";
        }
        int i = this.zztR;
        return zzCI.zzZ(this.zztJ, (i == 5 || i == 9 || i == 3) ? zzCI.zztV : this.zztQ);
    }

    public final Object getValue() {
        return this.zztT;
    }

    public abstract boolean read();

    public final void zzCn() {
        if (!read()) {
            throw zzCD.zzY(this, "Unexpected end when reading JSON.");
        }
    }

    public final void zzCp() {
        int type = this.zztQ.getType();
        if (type == 0) {
            zzCo();
            return;
        }
        if (type == 1) {
            this.zztR = 4;
        } else if (type == 2) {
            this.zztR = 6;
        } else {
            if (type != 3) {
                throw zzCE.zzZ(this, zzZKN.format("While setting the reader state back to current object an unexpected JsonType was encountered: {0}", Integer.valueOf(type)));
            }
            this.zztR = 10;
        }
    }

    public final zzZP1 zzCr() {
        return this.zztP;
    }

    public final int zzCs() {
        return this.zztN;
    }

    public final String zzCt() {
        return this.zztK;
    }

    public final int zzCu() {
        return this.zztO;
    }

    public final boolean zzCv() {
        return this.zztH;
    }

    public final boolean zzCw() {
        return this.zztI;
    }

    public final void zzV(zzZP1 zzzp1) {
        this.zztP = zzzp1;
    }

    public final void zzVu(int i) {
        zzY(i, null, true);
    }

    public final void zzVv(int i) {
        this.zztN = i;
    }

    public final void zzVw(int i) {
        if (i < 0 || i > 1) {
            throw new IllegalArgumentException("Specified argument was out of the range of valid values.\r\nParameter name: value");
        }
        this.zztL = i;
    }

    public final void zzVx(int i) {
        if (i < 0 || i > 3) {
            throw new IllegalArgumentException("Specified argument was out of the range of valid values.\r\nParameter name: value");
        }
        this.zztO = i;
    }

    public final void zzY(int i, Object obj) {
        zzY(i, obj, true);
    }

    public final void zzYB(String str) {
        this.zztK = str;
    }

    public final int zzYb() {
        return this.zztU;
    }

    public final boolean zzZY(boolean z) {
        return z ? read() : zzCm();
    }

    public final void zzZZ(boolean z) {
        if (this.zztQ.getType() != 0 || this.zztH) {
            this.zztR = 8;
        } else {
            zzCo();
        }
        if (z) {
            zzCq();
        }
    }

    public final void zzY(int i, Object obj, boolean z) {
        this.zztU = i;
        this.zztT = obj;
        switch (i) {
            case 1:
                this.zztR = 3;
                zzVF(1);
                break;
            case 2:
                this.zztR = 5;
                zzVF(2);
                break;
            case 3:
                this.zztR = 9;
                zzVF(3);
                break;
            case 4:
                this.zztR = 2;
                this.zztQ.setPropertyName((String) obj);
                break;
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
            case 16:
            case 17:
                zzZZ(z);
                break;
            case 13:
                zzVt(13);
                break;
            case 14:
                zzVt(14);
                break;
            case 15:
                zzVt(15);
                break;
        }
    }
}
