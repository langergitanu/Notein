package com.aspose.words;

import androidx.transition.OooOOOO;
import com.google.common.base.Ascii;
import com.google.common.primitives.SignedBytes;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes6.dex */
final class zzYXP implements zzZA7 {
    private com.aspose.words.internal.zzZO0 zzMW;
    private ArrayList<zzYXQ> zzZDM;
    private zzYYF zzZDY;

    public zzYXP(ArrayList<zzYXQ> arrayList, zzYYF zzyyf, com.aspose.words.internal.zzZO0 zzzo0) {
        this.zzZDM = arrayList;
        this.zzZDY = zzyyf;
        this.zzMW = zzzo0;
    }

    @Override // com.aspose.words.zzZA7
    public final void zzZ(zzYYG zzyyg) throws Exception {
        com.aspose.words.internal.zzXZ zzxzZzYCU = zzyyg.zzYCU();
        zzxzZzYCU.zzk(1413564248);
        zzxzZzYCU.zzk(44);
        zzxzZzYCU.zzk(1);
        zzxzZzYCU.writeByte((byte) 1);
        OooOOOO.OooO0OO(zzxzZzYCU, (byte) 1, (byte) 1, (byte) 0, (byte) 2);
        OooOOOO.OooO0OO(zzxzZzYCU, (byte) 1, (byte) 2, (byte) 0, (byte) 3);
        OooOOOO.OooO0OO(zzxzZzYCU, (byte) 1, (byte) 4, (byte) 0, (byte) 4);
        OooOOOO.OooO0OO(zzxzZzYCU, (byte) 1, (byte) 8, (byte) 0, (byte) 21);
        OooOOOO.OooO0OO(zzxzZzYCU, (byte) 1, (byte) 16, (byte) 0, (byte) 22);
        OooOOOO.OooO0OO(zzxzZzYCU, (byte) 1, (byte) 32, (byte) 0, (byte) 23);
        OooOOOO.OooO0OO(zzxzZzYCU, (byte) 1, SignedBytes.MAX_POWER_OF_TWO, (byte) 0, (byte) 0);
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
        return this.zzZDM.size();
    }

    @Override // com.aspose.words.zzZA7
    public final void zzZ(zzYYG zzyyg, int i) throws Exception {
        com.aspose.words.internal.zzXZ zzxzZzYCU = zzyyg.zzYCU();
        zzYXQ zzyxq = this.zzZDM.get(i);
        byte[] bytes = this.zzMW.getBytes(zzZ(zzyxq));
        zzxzZzYCU.writeByte((byte) bytes.length);
        zzxzZzYCU.writeBytes(bytes);
        byte b = zzyxq.zzYCa() == -1 ? (byte) 111 : Ascii.DEL;
        if (zzyxq.zzYC9() == -1 && zzyxq.zzYC8() == -1) {
            b = (byte) (b & 31);
        }
        zzxzZzYCU.writeByte(b);
        zzxzZzYCU.writeBytes(zzY3N.zzjh(zzyxq.getRawOffset()));
        zzxzZzYCU.writeBytes(zzY3N.zzjh(zzyxq.getLength()));
        zzxzZzYCU.writeBytes(zzY3N.zzjh(this.zzZDY.zzHN(zzyxq.getHeading())));
        zzxzZzYCU.writeBytes(zzY3N.zzjh(zzyxq.getLevel() - 1));
        if (zzyxq.zzYCa() != -1) {
            zzxzZzYCU.writeBytes(zzY3N.zzjh(zzyxq.zzYCa()));
        }
        if (zzyxq.zzYC9() == -1 || zzyxq.zzYC8() == -1) {
            return;
        }
        zzxzZzYCU.writeBytes(zzY3N.zzjh(zzyxq.zzYC9()));
        zzxzZzYCU.writeBytes(zzY3N.zzjh(zzyxq.zzYC8()));
    }

    @Override // com.aspose.words.zzZA7
    public final void zzZ(zzYYG zzyyg, int i, int i2) throws Exception {
        com.aspose.words.internal.zzXZ zzxzZzYCU = zzyyg.zzYCU();
        byte[] bytes = this.zzMW.getBytes(zzZ(this.zzZDM.get(i)));
        zzxzZzYCU.writeByte((byte) bytes.length);
        zzxzZzYCU.writeBytes(bytes);
        zzxzZzYCU.zzi(i2);
    }

    private static String zzZ(zzYXQ zzyxq) {
        return com.aspose.words.internal.zzJB.zze(zzyxq.zzYCb(), zzyxq.zzYCc());
    }
}
