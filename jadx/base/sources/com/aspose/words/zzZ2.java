package com.aspose.words;

import androidx.transition.OooOOOO;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes6.dex */
final class zzZ2 implements zzZA7 {
    private com.aspose.words.internal.zzZO0 zzMW;
    private ArrayList<zzZ3> zzZDX;

    public zzZ2(ArrayList<zzZ3> arrayList, com.aspose.words.internal.zzZO0 zzzo0) {
        this.zzZDX = arrayList;
        this.zzMW = zzzo0;
    }

    @Override // com.aspose.words.zzZA7
    public final void zzZ(zzYYG zzyyg) throws Exception {
        com.aspose.words.internal.zzXZ zzxzZzYCU = zzyyg.zzYCU();
        zzxzZzYCU.zzk(1413564248);
        zzxzZzYCU.zzk(24);
        zzxzZzYCU.zzk(1);
        zzxzZzYCU.writeByte((byte) 1);
        OooOOOO.OooO0OO(zzxzZzYCU, (byte) 1, (byte) 3, (byte) 0, (byte) 6);
        OooOOOO.OooO0OO(zzxzZzYCU, (byte) 2, (byte) 12, (byte) 0, (byte) 0);
        zzxzZzYCU.writeByte((byte) 0);
        zzxzZzYCU.writeByte((byte) 0);
        zzxzZzYCU.writeByte((byte) 1);
    }

    @Override // com.aspose.words.zzZA7
    public final int zzar() {
        return 0;
    }

    @Override // com.aspose.words.zzZA7
    public final int zzas() {
        return this.zzZDX.size();
    }

    @Override // com.aspose.words.zzZA7
    public final void zzZ(zzYYG zzyyg, int i) throws Exception {
        com.aspose.words.internal.zzXZ zzxzZzYCU = zzyyg.zzYCU();
        zzZ3 zzz3 = this.zzZDX.get(i);
        byte[] bytes = this.zzMW.getBytes(zzZ(zzz3));
        zzxzZzYCU.writeByte((byte) bytes.length);
        zzxzZzYCU.writeBytes(bytes);
        zzxzZzYCU.writeByte((byte) 10);
        zzxzZzYCU.writeBytes(zzY3N.zzjh(zzz3.zzaD().size()));
        zzxzZzYCU.writeBytes(zzY3N.zzjh(zzz3.zzaD().size()));
        zzxzZzYCU.writeBytes(zzY3N.zzjh(zzz3.getStartPosition()));
        zzxzZzYCU.writeBytes(zzY3N.zzjh(zzz3.getByteCount()));
        zzxzZzYCU.writeBytes(zzY3N.zzjh(zzz3.getStartPosition()));
        zzxzZzYCU.writeBytes(zzY3N.zzjh(zzz3.getByteCount()));
    }

    @Override // com.aspose.words.zzZA7
    public final void zzZ(zzYYG zzyyg, int i, int i2) throws Exception {
        com.aspose.words.internal.zzXZ zzxzZzYCU = zzyyg.zzYCU();
        byte[] bytes = this.zzMW.getBytes(zzZ(this.zzZDX.get(i)));
        zzxzZzYCU.writeByte((byte) bytes.length);
        zzxzZzYCU.writeBytes(bytes);
        zzxzZzYCU.zzi(i2);
    }

    private static String zzZ(zzZ3 zzz3) {
        return "SKEL" + com.aspose.words.internal.zzJB.zzWA(zzz3.zzat());
    }
}
