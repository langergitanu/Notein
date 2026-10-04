package com.aspose.words;

import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: classes6.dex */
abstract class zz9J extends zz9K {
    private long zzZ5Z;
    private ArrayList<zz9K> zzZc;

    public zz9J(zz8Z zz8z) {
        super(zz8z);
        this.zzZ5Z = 0L;
        this.zzZc = new ArrayList<>();
    }

    private void layoutChildren() throws Exception {
        zzZDL().zzZCI().zzU(this);
        int iZzZF2 = zzZDL().zzZCH().zzZF2();
        zzZDR().zzZzb();
        zzZDR().zzZz5();
        Iterator<zz9K> it = this.zzZc.iterator();
        while (it.hasNext()) {
            it.next().zzZE4();
        }
        zzZDL().zzZCH().zzX8(iZzZF2);
    }

    private void zzZDF() throws Exception {
        zzZDL().zzZCI().zzS(this);
        int iZzZF2 = zzZDL().zzZCH().zzZF2();
        zzZDR().zzZzb();
        zzZDR().zzZz5();
        Iterator<zz9K> it = this.zzZc.iterator();
        while (it.hasNext()) {
            it.next().zzZE2();
        }
        zzZDL().zzZCH().zzX8(iZzZF2);
    }

    private boolean zzZDG() throws Exception {
        boolean z = false;
        if (zzZDR().zzX6(false)) {
            zzZDR().zzX7(false);
            layoutChildren();
            z = true;
        }
        if (!zzZDR().zzX6(true)) {
            return z;
        }
        zzZDR().zzX7(true);
        layoutChildren();
        return true;
    }

    private void zzZDH() throws Exception {
        layoutChildren();
        zzZDG();
    }

    private void zzZDI() {
        zzXY(0L);
        zzZDL().zzZCI().zzT(this);
    }

    private boolean zzZDJ() {
        Iterator<zz9K> it = this.zzZc.iterator();
        while (it.hasNext()) {
            if (!it.next().zzZDO()) {
                return false;
            }
        }
        return true;
    }

    public final ArrayList<zz9K> zzQw() {
        return this.zzZc;
    }

    @Override // com.aspose.words.zz9K
    public final void zzZ(zz8Y zz8y) {
        super.zzZ(zz8y);
        Iterator<zz9K> it = this.zzZc.iterator();
        while (it.hasNext()) {
            it.next().zzZ(zz8y);
        }
    }

    public abstract void zzZDA();

    public void zzZDB() {
    }

    public void zzZDC() {
    }

    public void zzZDD() {
    }

    public boolean zzZDE() {
        return true;
    }

    public final long zzZDv() {
        return this.zzZ5Z;
    }

    public abstract long zzZDw();

    public abstract boolean zzZDx();

    public abstract boolean zzZDy();

    public abstract void zzZDz();

    @Override // com.aspose.words.zz9K
    public final void zzZE3() throws Exception {
        zzZDR().zzZzb();
        this.zzZ5Z = com.aspose.words.internal.zzZPW.zzG(zzZDN().zzZze(), zzZDM().zzZze());
        zzZDL().zzZCI().zzZ(this, this.zzZ5Z);
        zzXo(false);
        if (Float.intBitsToFloat((int) this.zzZ5Z) <= 0.0f || com.aspose.words.internal.zzZPW.zzYz(this.zzZ5Z) <= 0.0f || !zzZDE()) {
            zzZDI();
            return;
        }
        zzZDD();
        int iZzZF2 = zzZDL().zzZCH().zzZF2();
        zzZDH();
        zzZDA();
        if (zzZDy()) {
            zzZDI();
            return;
        }
        if (zzZDx()) {
            zzZDL().zzZCH().zzX8(iZzZF2);
            zzXo(true);
            zzZDz();
            zzZDH();
            zzZDA();
        }
        zzZDC();
        zzZDF();
        if (zzZDG()) {
            zzZDA();
            zzZDC();
            zzZDF();
        }
        zzXY(zzZDw());
        zzXp(zzZDJ());
        zzZDB();
        zzZDL().zzZCI().zzT(this);
    }
}
