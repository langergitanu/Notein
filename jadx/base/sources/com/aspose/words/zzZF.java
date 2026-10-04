package com.aspose.words;

import OooOoo.C20593OooO0Oo;
import com.aspose.words.ref.RefInt;

/* JADX INFO: loaded from: classes6.dex */
final class zzZF extends zzYYJ {
    private int zzZEr;

    private zzZF(int i, String str, String str2, int i2, int i3) {
        super(i, str, str2, i2);
        this.zzZEr = i3;
    }

    public static zzZF zzZ(String str, zzYZ[] zzyzArr, zzZA[] zzzaArr) {
        String strSubstring = str.substring(21, 25);
        RefInt refInt = new RefInt(0);
        boolean z = !zzYR.zzZ(strSubstring, refInt) || zzzaArr.length <= 0;
        int i = refInt.get();
        if (z) {
            return null;
        }
        String strSubstring2 = str.substring(30, 40);
        RefInt refInt2 = new RefInt(0);
        boolean zZzZ = zzYR.zzZ(strSubstring2, refInt2);
        int i2 = refInt2.get();
        if (!zZzZ) {
            return null;
        }
        zzZA zzza = zzzaArr[i];
        zzYZ zzyz = zzyzArr[zzza.zzaP()];
        int iZzaN = zzza.zzaN() + i2;
        return new zzZF(iZzaN, str, C20593OooO0Oo.OooO0O0("bm", strSubstring, strSubstring2), iZzaN - zzyz.getStartPosition(), zzyz.zzaP());
    }

    @Override // com.aspose.words.zzYYJ
    public final int zzaP() {
        return this.zzZEr;
    }
}
