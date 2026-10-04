package com.aspose.words;

import com.aspose.words.ref.RefInt;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes6.dex */
final class zzZLX {
    private static byte[] zzYvA = new byte[4];
    private com.aspose.words.internal.zzZOW zzW5;
    private int zzWz;
    private zzZLZ zzYvB;

    public zzZLX(com.aspose.words.internal.zzZOW zzzow, zzZLZ zzzlz) throws Exception {
        this.zzWz = (int) zzzow.zzq().getPosition();
        this.zzW5 = zzzow;
        this.zzYvB = zzzlz;
    }

    private static byte[] getBytes(String str) {
        com.aspose.words.internal.zzZO0 zzzo0ZzhX = com.aspose.words.internal.zzZYD.zzXg(str) ? com.aspose.words.internal.zzZO0.zzhX() : com.aspose.words.internal.zzZO0.zzhU();
        byte[] bytes = zzzo0ZzhX.getBytes(str);
        int length = (int) (((long) bytes.length) & 268435455);
        byte[] bytes2 = com.aspose.words.internal.zzZQK.getBytes((int) ((((long) length) & 4294967295L) | (((long) ((!zzzo0ZzhX.equals(com.aspose.words.internal.zzZO0.zzhX()) || (((long) length) & 4294967295L) <= 0) ? 0 : Integer.MIN_VALUE)) & 4294967295L)));
        int length2 = bytes.length + 4;
        int i = length2 % 4;
        byte[] bArr = new byte[length2 + (i == 0 ? 0 : 4 - i)];
        System.arraycopy(bytes2, 0, bArr, 0, 4);
        System.arraycopy(bytes, 0, bArr, 4, bytes.length);
        return bArr;
    }

    private void zzAC(int i) throws Exception {
        this.zzW5.zzV(com.aspose.words.internal.zzZQK.getBytes(i), 0, 4);
    }

    private static byte[] zzX6(int i, int i2) {
        byte[] bytes = com.aspose.words.internal.zzZQK.getBytes(i);
        if (i2 == 4) {
            return bytes;
        }
        byte[] bArr = new byte[i2];
        System.arraycopy(bytes, 0, bArr, 0, i2);
        return bArr;
    }

    private byte[] zzX7(int i, int i2) {
        if (i == 31220) {
            if (!zzZ5I()) {
                return null;
            }
        } else if (this.zzYvB.zzPg(i)) {
            return null;
        }
        switch (i) {
            case 31000:
            case 31005:
            case 31050:
                break;
            case 31015:
            case 31030:
            case 31155:
                String str = (String) this.zzYvB.get(i);
                break;
            case 31020:
            case 31040:
            case 31045:
            case 31055:
            case 31080:
            case 31085:
            case 31125:
            case 31135:
            case 31140:
            case 31145:
            case 31160:
            case 31165:
            case 31170:
            case 31175:
            case 31180:
            case 31185:
            case 31195:
            case 31215:
            case 31225:
            case 31230:
            case 31235:
            case 31265:
            case 31270:
            case 31285:
            case 31290:
            case 31330:
            case 31335:
            case 31340:
            case 31360:
            case 31405:
            case 31625:
            case 31700:
            case 31725:
            case 31730:
            case 31735:
            case 31740:
                break;
            case 31025:
            case 31255:
                break;
            case 31026:
            case 31260:
                break;
            case 31060:
            case 31070:
            case 31220:
                break;
            case 31065:
                break;
            case 31490:
                break;
        }
        return null;
    }

    private boolean zzZ5I() {
        return (this.zzYvB.zzPg(31220) && zzZLW.zzZ(this.zzYvB)) ? false : true;
    }

    public final void write(int i) throws Exception {
        byte[] bytes = com.aspose.words.internal.zzZQK.getBytes(i);
        zzXB(4);
        this.zzW5.zzV(bytes, 0, 4);
    }

    public final byte[] zzLg(String str) throws Exception {
        if (!com.aspose.words.internal.zzZYD.zzXk(str)) {
            return null;
        }
        com.aspose.words.internal.zzZO0 zzzo0ZzhX = com.aspose.words.internal.zzZYD.zzXg(str) ? com.aspose.words.internal.zzZO0.zzhX() : com.aspose.words.internal.zzZO0.zzhU();
        byte[] bytes = zzzo0ZzhX.getBytes(str);
        int length = (int) (((long) bytes.length) & 268435455);
        write((int) ((((long) length) & 4294967295L) | (((long) ((!zzzo0ZzhX.equals(com.aspose.words.internal.zzZO0.zzhX()) || (((long) length) & 4294967295L) <= 0) ? 0 : Integer.MIN_VALUE)) & 4294967295L)));
        return bytes;
    }

    public final void zzX8(int i, int i2) throws Exception {
        zzd(i, i2, -1);
    }

    public final boolean zzX9(int i, int i2) throws Exception {
        byte[] bArrZzX7 = zzX7(i, i2);
        if (bArrZzX7 == null) {
            return false;
        }
        zzt(bArrZzX7, i2);
        return true;
    }

    public final void zzXB(int i) throws Exception {
        int iMin;
        int position;
        if (i == 1 || (position = (((int) this.zzW5.zzq().getPosition()) - this.zzWz) % (iMin = Math.min(4, i))) == 0) {
            return;
        }
        this.zzW5.zzV(zzYvA, 0, iMin - position);
    }

    public final void zzYd(byte[] bArr) throws Exception {
        zzt(Forms2OleControl.zzYvU.toByteArray(), 1);
        zzAC(29804);
        zzAC(bArr.length);
        zzt(bArr, 1);
    }

    public final boolean zzZ(byte[][] bArr) throws Exception {
        if (bArr == null || bArr.length == 0) {
            return false;
        }
        for (byte[] bArr2 : bArr) {
            zzt(bArr2, 1);
        }
        return true;
    }

    public final void zzZ5J() throws Exception {
        if (this.zzYvB.zzPg(31220)) {
            zzZLW.zzZ(this.zzYvB);
        }
        if (this.zzYvB.zzPg(31220)) {
            this.zzW5.writeBytes(new com.aspose.words.internal.zzZOZ("afc20920-da4e-11ce-b943-00aa006887b4").toByteArray());
            zzZLW.zzZ(this.zzW5, this.zzYvB);
        } else {
            this.zzW5.writeBytes(new com.aspose.words.internal.zzZOZ("0be35203-8f91-11ce-9de3-00aa004bb851").toByteArray());
            ((zzY9F) this.zzYvB.get(31220)).zzZ(this.zzW5);
        }
    }

    public final void zzd(int i, int i2, int i3) throws Exception {
        this.zzW5.zzZa(i + 2, 0);
        this.zzW5.zzK((short) ((this.zzW5.zzq().getPosition() - 2) - ((long) r6)));
        this.zzW5.zzk(i2);
        if ((((long) i3) & 4294967295L) != 4294967295L) {
            this.zzW5.zzk(i3);
        }
        this.zzW5.zzZa(0, 2);
    }

    public final boolean zzt(byte[] bArr, int i) throws Exception {
        if (!com.aspose.words.internal.zzZ1.zzX(bArr)) {
            return false;
        }
        zzXB(i);
        this.zzW5.writeBytes(bArr);
        return true;
    }

    public static byte[][] zzZ(ArrayList<String> arrayList, RefInt refInt) {
        byte[][] bArr = new byte[arrayList.size()][];
        refInt.set(0);
        for (int i = 0; i < arrayList.size(); i++) {
            bArr[i] = getBytes(arrayList.get(i));
            refInt.set(refInt.get() + bArr[i].length);
        }
        return bArr;
    }
}
