package com.aspose.words;

import androidx.transition.OooOOOO;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes6.dex */
final class zzZ4 implements zzZA7 {
    private com.aspose.words.internal.zzZO0 zzMW;
    private zzYYF zzZDY;
    private ArrayList<zzZ5> zzZEc;

    public zzZ4(ArrayList<zzZ5> arrayList, zzYYF zzyyf, com.aspose.words.internal.zzZO0 zzzo0) {
        this.zzZEc = arrayList;
        this.zzZDY = zzyyf;
        this.zzMW = zzzo0;
    }

    @Override // com.aspose.words.zzZA7
    public final void zzZ(zzYYG zzyyg) throws Exception {
        com.aspose.words.internal.zzXZ zzxzZzYCU = zzyyg.zzYCU();
        zzxzZzYCU.zzk(1413564248);
        zzxzZzYCU.zzk(32);
        zzxzZzYCU.zzk(1);
        zzxzZzYCU.writeByte((byte) 2);
        OooOOOO.OooO0OO(zzxzZzYCU, (byte) 1, (byte) 1, (byte) 0, (byte) 3);
        OooOOOO.OooO0OO(zzxzZzYCU, (byte) 1, (byte) 2, (byte) 0, (byte) 4);
        OooOOOO.OooO0OO(zzxzZzYCU, (byte) 1, (byte) 4, (byte) 0, (byte) 6);
        OooOOOO.OooO0OO(zzxzZzYCU, (byte) 2, (byte) 8, (byte) 0, (byte) 0);
        zzxzZzYCU.writeByte((byte) 0);
        zzxzZzYCU.writeByte((byte) 0);
        zzxzZzYCU.writeByte((byte) 1);
    }

    @Override // com.aspose.words.zzZA7
    public final int zzar() {
        return this.zzZDY.zzYCT().size();
    }

    @Override // com.aspose.words.zzZA7
    public final int zzas() {
        return this.zzZEc.size();
    }

    @Override // com.aspose.words.zzZA7
    public final void zzZ(zzYYG zzyyg, int i) throws Exception {
        com.aspose.words.internal.zzXZ zzxzZzYCU = zzyyg.zzYCU();
        zzZ5 zzz5 = this.zzZEc.get(i);
        byte[] bytes = this.zzMW.getBytes(com.aspose.words.internal.zzJB.zzWA(zzz5.zzaN()));
        zzxzZzYCU.writeByte((byte) bytes.length);
        zzxzZzYCU.writeBytes(bytes);
        zzxzZzYCU.writeByte((byte) 15);
        zzxzZzYCU.writeBytes(zzY3N.zzjh(this.zzZDY.zzHN(zzz5.zzav())));
        zzxzZzYCU.writeBytes(zzY3N.zzjh(zzz5.zzat()));
        zzxzZzYCU.writeBytes(zzY3N.zzjh(zzz5.zzaL()));
        zzxzZzYCU.writeBytes(zzY3N.zzjh(zzz5.getStartPosition()));
        zzxzZzYCU.writeBytes(zzY3N.zzjh(zzz5.getByteCount()));
    }

    @Override // com.aspose.words.zzZA7
    public final void zzZ(zzYYG zzyyg, int i, int i2) throws Exception {
        com.aspose.words.internal.zzXZ zzxzZzYCU = zzyyg.zzYCU();
        byte[] bytes = this.zzMW.getBytes(com.aspose.words.internal.zzJB.zzWA(this.zzZEc.get(i).zzaN()));
        zzxzZzYCU.writeByte((byte) bytes.length);
        zzxzZzYCU.writeBytes(bytes);
        zzxzZzYCU.zzi(i2);
    }
}
