package com.aspose.words;

import androidx.appcompat.view.menu.C21505OooO0Oo;
import java.util.ArrayList;
import java.util.Collections;

/* JADX INFO: loaded from: classes6.dex */
final class zzZQL {
    private int zzYEN = Integer.MIN_VALUE;
    private ArrayList<zzYAU> zzYEO;
    private zzYAU zzZw5;

    private void zzA(zzYAU zzyau) {
        if (this.zzYEO == null) {
            this.zzYEO = new ArrayList<>();
            zzYAU zzyauZzZ = zzyau;
            while (zzyauZzZ != null) {
                zzyauZzZ = zzyauZzZ.zzZ(true, new int[0]);
                if (zzyauZzZ != null) {
                    com.aspose.words.internal.zzZQG.zzZ(this.zzYEO, zzyauZzZ);
                }
            }
            Collections.reverse(this.zzYEO);
        }
        this.zzYEN = zzZ(zzZeu(), zzyau);
    }

    private boolean zzY(zzYAU zzyau, int i, boolean z) {
        if (i != this.zzYEO.size()) {
            this.zzYEO.size();
        }
        int i2 = i - 1;
        while (i2 >= 0) {
            zzYAH zzyah = (zzYAH) this.zzYEO.get(i2);
            if (zzZ(zzyah, zzZ(zzyah, zzyau), z)) {
                return true;
            }
            i2--;
            z = false;
            zzyau = zzyah;
        }
        return false;
    }

    private static int zzZ(zzYAH zzyah, zzYAU zzyau) {
        if (zzyah == null) {
            return 0;
        }
        zzYAH zzyahZzY5B = zzyah.zzY5B();
        return (zzyahZzY5B != null && zzY9B.zzC(zzyahZzY5B, zzyau)) ? 2 : 1;
    }

    private void zzZes() {
        zzYAU zzyau = this.zzZw5;
        if (zzyau instanceof zzYAH) {
            zzyau.zzZ1s();
        }
        com.aspose.words.internal.zzZQG.zzZ(this.zzYEO, this.zzZw5);
    }

    private void zzZet() {
        this.zzYEO.size();
        ArrayList<zzYAU> arrayList = this.zzYEO;
        Class.getSimpleName();
    }

    private zzYAH zzZeu() {
        if (this.zzYEO.size() <= 0) {
            return null;
        }
        return (zzYAH) C21505OooO0Oo.OooO00o(1, this.zzYEO);
    }

    public final void zzB(zzYAU zzyau) {
        if (this.zzYEN != Integer.MIN_VALUE) {
            zzYAU zzyau2 = this.zzZw5;
            boolean z = zzyau2 instanceof zzYAH;
            boolean z2 = zzyau instanceof zzYAH;
            if (z && zzyau2.zzZ1s() == 2) {
                zzZes();
            }
            if (z2 && zzyau.zzZ1s() == 3) {
                zzZet();
                if (!z || zzyau.zzY7o() != this.zzZw5) {
                    this.zzYEN = Integer.MIN_VALUE;
                }
            } else if (z2 && zzyau.zzZ1s() == 1) {
                this.zzYEN = 1;
            } else if (z && this.zzZw5.zzZ1s() == 1) {
                this.zzYEN = 2;
            } else if (z && this.zzZw5.zzZ1s() == 2) {
                this.zzYEN = 1;
            }
        }
        if (this.zzYEN == Integer.MIN_VALUE) {
            zzA(zzyau);
        }
        this.zzZw5 = zzyau;
    }

    public final boolean zzZev() {
        return zzY(this.zzZw5, this.zzYEO.size(), true);
    }

    public final boolean zzZew() {
        return zzY(this.zzZw5, this.zzYEO.size(), false);
    }

    private static boolean zzZ(zzYAH zzyah, int i, boolean z) {
        if (i == 1) {
            return !z;
        }
        if (i != 2) {
            return false;
        }
        return zzyah.zzY5D() || zzZOO.zzCF(zzyah.getFieldType()) == 0;
    }
}
