package com.aspose.words.internal;

import com.aspose.words.internal.zzZLA;
import java.util.Iterator;

/* JADX INFO: loaded from: classes5.dex */
public class zzZMC extends zzZLZ {
    private zzZLA.zzY zzZSM;
    private zzZLD zzZSN;
    private zzZLY zzZSO = new zzZLY();

    public zzZMC() {
        this.zzZSE = zzZN4.zzZV6;
    }

    public final void zzZ(zzZLD zzzld) {
        this.zzZSN = zzzld;
    }

    public final zzZLD zzgf() {
        return this.zzZSN;
    }

    public final zzZLY zzgg() {
        return this.zzZSO;
    }

    @Override // com.aspose.words.internal.zzZLZ
    public int zzZ(zzZN3 zzzn3) {
        if (zzg5() == zzzn3.zzg5()) {
            return 0;
        }
        if (getName() != null && zzZNA.zzUJ(getName())) {
            this.zzZSE = new zzZN4(getName(), "");
            if (zzzn3.zzgZ().zzT(this.zzZSE)) {
                zzzn3.zzgZ().zzS(this.zzZSE);
                zzZKN.format("There is already same named identity constraint in this namespace. Existing item is at {0}({1},{2})", 0);
            } else {
                zzzn3.zzgZ().zzZ(this.zzZSE, this);
            }
        }
        zzZLD zzzld = this.zzZSN;
        if (zzzld != null) {
            zzzld.zzfE();
            this.zzZSG = this.zzZSN.zzZ(zzzn3) + this.zzZSG;
            zzZLD zzzld2 = this.zzZSN;
            if (zzzld2.zzZSG == 0) {
                this.zzZSM = new zzZLA.zzY(zzzld2);
            }
        }
        int i = this.zzZSG;
        if (i > 0) {
            return i;
        }
        if (this.zzZSO.getCount() != 0) {
            for (int i2 = 0; i2 < this.zzZSO.getCount(); i2++) {
                zzZLD zzzld3 = (zzZLD) this.zzZSO.zzQt(i2);
                if (zzzld3 != null) {
                    this.zzZSG = zzzld3.zzZ(zzzn3) + this.zzZSG;
                    if (zzzld3.zzZSG == 0) {
                        this.zzZSM.zzZ(new zzZLA.zzZ(zzzld3, i2));
                    }
                } else {
                    StringBuilder sb = new StringBuilder("Object of type ");
                    sb.append(this.zzZSO.zzQt(i2).getClass());
                    sb.append(" is invalid in the Fields Collection");
                }
            }
        }
        zzZLF.zzZ(getId(), this, zzzn3.zzh0());
        zzT(zzzn3.zzg5());
        return this.zzZSG;
    }

    @Override // com.aspose.words.internal.zzZLZ
    public final void zzZ(zzZLZ zzzlz) {
        super.zzZ(zzzlz);
        zzZLD zzzld = this.zzZSN;
        if (zzzld != null) {
            zzzld.zzZ(this);
        }
        Iterator<zzZLZ> it = this.zzZSO.iterator();
        while (it.hasNext()) {
            it.next().zzZ(this);
        }
    }
}
