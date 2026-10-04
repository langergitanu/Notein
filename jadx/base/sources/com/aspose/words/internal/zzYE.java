package com.aspose.words.internal;

import androidx.appcompat.view.menu.C21505OooO0Oo;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes5.dex */
final class zzYE {
    private zzHL zzXC;
    private ArrayList<zzHK> zzXb;

    public zzYE(zzHL zzhl) {
        this.zzXC = zzhl;
    }

    private void zzX(zzFA zzfa, boolean z) throws Exception {
        zzHK zzhkZzY = this.zzXb.size() > 0 ? (zzHK) C21505OooO0Oo.OooO00o(1, this.zzXb) : null;
        for (zzHN zzhn : new zzYJ(this.zzXC).zzZ(zzfa, z)) {
            if (zzZ(zzhn, zzhkZzY)) {
                zzhkZzY = zzY(zzhn);
            }
            zzHM zzhm = (zzHM) zzZKW.zzZ(zzhkZzY, zzHM.class);
            if (zzhm != null) {
                zzhm.zzZ(zzhn);
            }
        }
    }

    private zzHK zzY(zzHN zzhn) {
        zzHK zzyf;
        int iZzYb = zzhn.zzYb();
        if (iZzYb == 0) {
            zzyf = new zzYF();
        } else if (iZzYb == 1) {
            zzyf = new zzYG();
        } else {
            if (iZzYb != 2) {
                throw new IllegalArgumentException();
            }
            zzyf = new zzYH();
        }
        zzZQG.zzZ(this.zzXb, zzyf);
        return zzyf;
    }

    private void zzY3() {
        zzZQG.zzZ((ArrayList<zzYH>) this.zzXb, new zzYH());
    }

    public final ArrayList<zzHK> zzZ(zzFD zzfd) throws Exception {
        this.zzXb = new ArrayList<>();
        for (zzFC zzfc : zzfd.zzMf()) {
            zzFA zzfa = (zzFA) zzZKW.zzZ(zzfc, zzFA.class);
            if (zzfa != null) {
                zzX(zzfa, zzfd.zzMe().zzZz());
            } else if (zzfc instanceof zzFE) {
                zzY3();
            }
        }
        return this.zzXb;
    }

    private static boolean zzZ(zzHN zzhn, zzHK zzhk) {
        if (zzhk == null || zzhk.getType() == 2) {
            return true;
        }
        if (zzhk.getType() != 0 || zzhn.zzYb() == 0) {
            return zzhk.getType() == 1 && zzhn.zzYb() != 1;
        }
        return true;
    }
}
