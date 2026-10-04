package com.aspose.words;

import java.util.Map;

/* JADX INFO: loaded from: classes6.dex */
final class zzZ3C extends zzZ3E {
    private zzZ3D[] zzYav;

    public zzZ3C(zzX6 zzx6, boolean z) {
        super(zzx6);
        zzZ3D zzz3d = zzZ3D.zzYaA;
        this.zzYav = new zzZ3D[]{zzz3d, zzz3d, zzz3d, zzz3d, zzz3d, zzz3d, zzz3d, zzz3d};
        if (z) {
            zzYN9();
        }
    }

    public static zzZ3C zzY(zzZ3C zzz3c) {
        zzZ3C zzz3c2 = new zzZ3C(zzz3c.zzZoP(), false);
        zzz3c2.zzZ(0, zzZ3D.zzW(zzz3c.zzYav[0]));
        zzz3c2.zzZ(1, zzZ3D.zzW(zzz3c.zzYav[1]));
        zzz3c2.zzZ(2, zzZ3D.zzW(zzz3c.zzYav[2]));
        zzz3c2.zzZ(3, zzZ3D.zzW(zzz3c.zzYav[3]));
        zzz3c2.zzZ(4, zzZ3D.zzW(zzz3c.zzYav[4]));
        zzz3c2.zzZ(5, zzZ3D.zzW(zzz3c.zzYav[5]));
        zzz3c2.zzZ(6, zzZ3D.zzW(zzz3c.zzYav[6]));
        zzz3c2.zzZ(7, zzZ3D.zzW(zzz3c.zzYav[7]));
        return zzz3c2;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (zzZq(obj)) {
            return zzZ3E.zzY(this.zzYav, ((zzZ3C) obj).zzYav);
        }
        return false;
    }

    @Override // com.aspose.words.zzZ3E
    public final void zzYN8() {
        zzR(this.zzYav);
    }

    public final void zzZ(int i, zzZ3D zzz3d) {
        zzYN6();
        this.zzYav[i] = zzz3d;
    }

    public final float zzwy(int i) {
        return this.zzYav[i].zzYN3() / 1000.0f;
    }

    public final zzZ3D zzwz(int i) {
        return this.zzYav[i];
    }

    public static zzZ3C zzZ(zzZ3C zzz3c) {
        if (zzz3c == null) {
            zzz3c = new zzZ3C(null, true);
        }
        if (zzz3c.zzZoP() == null || zzz3c.isCached()) {
            return zzz3c;
        }
        zzZ3C zzz3c2 = (zzZ3C) com.aspose.words.internal.zzQW.zzZ((Map<zzZ3C, TValue>) zzz3c.zzZoP().zzZAA, zzz3c);
        if (zzz3c2 != null) {
            return zzz3c2;
        }
        com.aspose.words.internal.zzZQF.zzY(zzz3c.zzZoP().zzZAA, zzz3c, zzz3c);
        return zzz3c;
    }
}
