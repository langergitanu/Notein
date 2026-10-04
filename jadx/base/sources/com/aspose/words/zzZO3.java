package com.aspose.words;

import android.os.Bundle;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

/* JADX INFO: loaded from: classes6.dex */
final class zzZO3 {
    static boolean zzZD5 = false;
    private IWarningCallback zzZG0;
    private com.aspose.words.internal.zzDB zzYzh = com.aspose.words.internal.zzDB.zzCT();
    private zzYLO zzYzg = new zzYLO();
    private zzYLN zzYzf = new zzYLN();
    private com.aspose.words.internal.zzD3<zzZRY> zzYze = new com.aspose.words.internal.zzD3<>();
    private ArrayList<String> zzFJ = new ArrayList<>();
    private ArrayList<zzYKM> zzYzd = new ArrayList<>();
    private com.aspose.words.internal.zz7D<SmartTag> zzYzc = new com.aspose.words.internal.zz7D<>();
    private HashMap<String, zzZRY> zzYzb = new HashMap<>();
    private com.aspose.words.internal.zzZYI zzYza = new com.aspose.words.internal.zzZYI();

    public zzZO3() {
    }

    private int zzBU(int i) {
        return this.zzYzh.get(i);
    }

    private int zzLv(String str) {
        int i = this.zzYza.get(str);
        if (!com.aspose.words.internal.zzZYI.zzWm(i)) {
            return i;
        }
        com.aspose.words.internal.zzZQG.zzZ(this.zzFJ, str);
        int size = this.zzFJ.size() - 1;
        this.zzYza.add(str, size);
        return size;
    }

    private void zzM(com.aspose.words.internal.zzZOW zzzow) throws Exception {
        Iterator<zzYKM> it = this.zzYzd.iterator();
        while (it.hasNext()) {
            it.next().zzZ(zzzow);
        }
    }

    private void zzN(com.aspose.words.internal.zzZOW zzzow) throws Exception {
        zzzow.zzJ((short) 12);
        zzzow.zzJ((short) 256);
        zzzow.zzl(0);
        zzzow.zzl(this.zzFJ.size());
        Iterator<String> it = this.zzFJ.iterator();
        while (it.hasNext()) {
            zzYNF.zzU(zzzow, it.next());
        }
    }

    private void zzO(com.aspose.words.internal.zzZOW zzzow) throws Exception {
        zzzow.zzl(this.zzYze.getCount());
        Iterator<zzZRY> it = this.zzYze.zzCJ().iterator();
        while (it.hasNext()) {
            it.next().zzZ(zzzow);
        }
    }

    private int zzP(com.aspose.words.internal.zzZOW zzzow) throws Exception {
        if (this.zzYze.getCount() == 0) {
            return 0;
        }
        int position = (int) zzzow.zzq().getPosition();
        zzO(zzzow);
        zzZ9K();
        zzN(zzzow);
        zzM(zzzow);
        return ((int) zzzow.zzq().getPosition()) - position;
    }

    private int zzQ(com.aspose.words.internal.zzZOW zzzow) throws Exception {
        if (this.zzYzh.getCount() == 0) {
            return 0;
        }
        int position = (int) zzzow.zzq().getPosition();
        zzzow.zzJ((short) -1);
        zzzow.zzK((short) this.zzYzh.getCount());
        zzzow.zzK((short) 0);
        for (int i = 0; i < this.zzYzh.getCount(); i++) {
            zzzow.zzK((short) 6);
            zzzow.zzl(this.zzYzh.get(i));
            zzzow.zzl(0);
            zzzow.zzl(0);
        }
        return ((int) zzzow.zzq().getPosition()) - position;
    }

    private void zzX(com.aspose.words.internal.zzZOX zzzox, zzZRG zzzrg) throws Exception {
        if (zzzrg.zzYHJ == 0) {
            return;
        }
        zzzox.zzq().zzH(zzzrg.zzYHK);
        zzt(zzzox);
        zzs(zzzox);
        zzr(zzzox);
    }

    private void zzY(com.aspose.words.internal.zzZOX zzzox, zzZRG zzzrg) throws Exception {
        if (zzzrg.zzYHJ == 0) {
            return;
        }
        zzzox.zzq().zzH(zzzrg.zzYHK);
        zzzox.zzX9();
        short sZzXa = zzzox.zzXa();
        short sZzXa2 = zzzox.zzXa();
        if (zzZD5) {
            com.aspose.words.internal.zzZKN.format("Reading FACTOIDINFOs. Length:{0}, cData:{1}, cbExtra:{2}", Integer.valueOf(zzzrg.zzYHJ), Integer.valueOf(sZzXa), Integer.valueOf(sZzXa2));
        }
        for (int i = 0; i < sZzXa; i++) {
            zzzox.zzXa();
            int iZzXc = zzzox.zzXc();
            this.zzYzh.add(iZzXc);
            int iZzXc2 = zzzox.zzXc();
            int iZzXc3 = zzzox.zzXc();
            if (zzZD5) {
                com.aspose.words.internal.zzZKN.format("    FACTOIDINFO id:{0}, flags:{1:X8}, pfpb:{2}", Integer.valueOf(iZzXc), Integer.valueOf(iZzXc2), Integer.valueOf(iZzXc3));
            }
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [int, java.lang.Object] */
    private zzZRY zzZ8(String str, String str2) {
        ?? r0 = Bundle.getInt(str);
        zzZRY zzzry = (zzZRY) com.aspose.words.internal.zzQW.zzZ(this.zzYzb, r0);
        if (zzzry != null) {
            return zzzry;
        }
        zzZRY zzzry2 = new zzZRY(this.zzYze.getCount() + 1, str, str2);
        this.zzYze.add(zzzry2.zze0, zzzry2);
        com.aspose.words.internal.zzZQF.zzY(this.zzYzb, r0, zzzry2);
        return zzzry2;
    }

    private void zzZ9I() {
        int i;
        int itemCount = this.zzYzf.getItemCount();
        for (int i2 = 0; i2 < itemCount; i2++) {
            int iZzTe = this.zzYzf.zzTe(i2);
            zzZS2 item = this.zzYzf.getItem(i2);
            item.zzYIc = 0;
            for (0; i < itemCount; i + 1) {
                zzYBC zzybc = new zzYBC(this.zzYzg.zzTe(i), this.zzYzf.zzTe(i));
                if (!zzybc.isEmpty() && zzybc.contains(iZzTe)) {
                    item.zzYIc++;
                }
                i = zzybc.getStart() <= iZzTe ? i + 1 : 0;
            }
        }
    }

    private void zzZ9J() {
        int i;
        int itemCount = this.zzYzg.getItemCount();
        for (int i2 = 0; i2 < itemCount; i2++) {
            int iZzTe = this.zzYzg.zzTe(i2);
            zzZS3 item = this.zzYzg.getItem(i2);
            item.zzYIc = 0;
            for (0; i < itemCount; i + 1) {
                zzYBC zzybc = new zzYBC(this.zzYzg.zzTe(i), this.zzYzf.zzTe(i));
                if (zzybc.isEmpty() || zzybc.contains(iZzTe)) {
                    item.zzYIc++;
                }
                i = zzybc.getStart() <= iZzTe ? i + 1 : 0;
            }
        }
    }

    private void zzZ9K() {
        ArrayList<String> arrayListZzY = com.aspose.words.internal.zzZQG.zzY(this.zzFJ);
        com.aspose.words.internal.zzBP.zzS(arrayListZzY);
        for (zzYKM zzykm : this.zzYzd) {
            int i = 0;
            while (true) {
                int[] iArr = zzykm.zzXDd;
                if (i < iArr.length) {
                    String str = this.zzFJ.get(iArr[i]);
                    String str2 = this.zzFJ.get(zzykm.zzXDc[i]);
                    int iIndexOf = arrayListZzY.indexOf(str);
                    int iIndexOf2 = arrayListZzY.indexOf(str2);
                    zzykm.zzXDd[i] = iIndexOf;
                    zzykm.zzXDc[i] = iIndexOf2;
                    i++;
                }
            }
        }
        this.zzFJ = arrayListZzY;
    }

    private void zzr(com.aspose.words.internal.zzZOX zzzox) throws Exception {
        int count = this.zzYzh.getCount();
        for (int i = 0; i < count; i++) {
            com.aspose.words.internal.zzZQG.zzZ(this.zzYzd, new zzYKM(zzzox));
        }
    }

    private void zzs(com.aspose.words.internal.zzZOX zzzox) throws Exception {
        zzzox.zzX9();
        zzzox.zzX9();
        int iZzXc = zzzox.zzXc();
        int iZzXc2 = zzzox.zzXc();
        if (zzZD5) {
            com.aspose.words.internal.zzZKN.format("Reading strings. cFactoid:{0}, cste:{1}", Integer.valueOf(iZzXc), Integer.valueOf(iZzXc2));
        }
        for (int i = 0; i < iZzXc2; i++) {
            com.aspose.words.internal.zzZQG.zzZ(this.zzFJ, zzYNF.zzd(zzzox));
        }
    }

    private void zzt(com.aspose.words.internal.zzZOX zzzox) throws Exception {
        int iZzXc = zzzox.zzXc();
        if (zzZD5) {
            com.aspose.words.internal.zzZKN.format("Reading factoid types. Count:{0}", Integer.valueOf(iZzXc));
        }
        for (int i = 0; i < iZzXc; i++) {
            zzZRY zzzry = new zzZRY(zzzox);
            this.zzYze.set(zzzry.zze0, zzzry);
        }
    }

    public final String getString(int i) {
        return (i < 0 || i >= this.zzFJ.size()) ? "" : this.zzFJ.get(i);
    }

    public final zzZRY zzBS(int i) {
        return this.zzYze.get(i);
    }

    public final zzYKM zzBT(int i) {
        if (i < this.zzYzd.size()) {
            return this.zzYzd.get(i);
        }
        zzY1Z.zzZ(this.zzZG0, 10, "Invalid smart tag at index {0}, removed.", Integer.valueOf(i));
        return null;
    }

    public final void zzBV(int i) {
        if (this.zzYzh.getCount() == 0) {
            return;
        }
        this.zzYzg.add(i);
        this.zzYzf.add(i);
        zzZ9J();
        zzZ9I();
    }

    public final void zzZ(zzZRA zzzra, com.aspose.words.internal.zzZOW zzzow) throws Exception {
        zzzra.zzYGC.zzXyO.zzYHK = (int) zzzow.zzq().getPosition();
        zzzra.zzYGC.zzXyO.zzYHJ = zzQ(zzzow);
        zzzra.zzYGC.zzXyN.zzYHK = (int) zzzow.zzq().getPosition();
        zzzra.zzYGC.zzXyN.zzYHJ = this.zzYzg.zzV(zzzow);
        zzzra.zzYGC.zzXyL.zzYHK = (int) zzzow.zzq().getPosition();
        zzzra.zzYGC.zzXyL.zzYHJ = this.zzYzf.zzV(zzzow);
        zzzra.zzYGC.zzXyK.zzYHK = (int) zzzow.zzq().getPosition();
        zzzra.zzYGC.zzXyK.zzYHJ = zzP(zzzow);
    }

    public final zzYLN zzZ9G() {
        return this.zzYzf;
    }

    public final zzYLO zzZ9H() {
        return this.zzYzg;
    }

    public final void zzZ(int i, SmartTag smartTag) {
        com.aspose.words.internal.zzDB zzdb = this.zzYzh;
        zzdb.add(zzdb.getCount() + 1001);
        this.zzYzc.zzP(smartTag, this.zzYzg.zzX(i, new zzZS3()));
        zzYKM zzykm = new zzYKM(zzZ8(smartTag.getUri(), smartTag.getElement()).zze0, smartTag.getProperties().getCount());
        com.aspose.words.internal.zzZQG.zzZ(this.zzYzd, zzykm);
        int i2 = 0;
        for (CustomXmlProperty customXmlProperty : smartTag.getProperties()) {
            zzykm.zzXDd[i2] = zzLv(customXmlProperty.getName());
            zzykm.zzXDc[i2] = zzLv(customXmlProperty.getValue());
            i2++;
        }
    }

    public zzZO3(zzZRA zzzra, com.aspose.words.internal.zzZOX zzzox, IWarningCallback iWarningCallback) throws Exception {
        zzZRG zzzrg = zzzra.zzYGC.zzXyO;
        if (zzzrg.zzYHJ == 0) {
            return;
        }
        this.zzZG0 = iWarningCallback;
        zzY(zzzox, zzzrg);
        this.zzYzg.zzZ(zzzox, zzzra.zzYGC.zzXyN);
        this.zzYzg.getItemCount();
        this.zzYzf.zzZ(zzzox, zzzra.zzYGC.zzXyL);
        this.zzYzf.getItemCount();
        zzX(zzzox, zzzra.zzYGC.zzXyK);
    }

    public final void zzY(int i, SmartTag smartTag) {
        int i2 = this.zzYzc.get(smartTag);
        if (!com.aspose.words.internal.zz7D.zzWm(i2)) {
            zzZS2 zzzs2 = new zzZS2();
            zzzs2.zzYIb = i2;
            this.zzYzg.getItem(i2).zzYIe = this.zzYzf.zzX(i, zzzs2);
            return;
        }
        throw new IllegalArgumentException("Specified argument was out of the range of valid values.\r\nParameter name: smartTag");
    }

    public final void zzZ(zzZO3 zzzo3, int i) {
        int count = this.zzYzh.getCount();
        for (int i2 = 0; i2 < zzzo3.zzYzg.getItemCount(); i2++) {
            this.zzYzh.add(zzzo3.zzBU(i2) + count);
            zzZS3 item = zzzo3.zzYzg.getItem(i2);
            item.zzYIe += count;
            this.zzYzg.zzX(zzzo3.zzYzg.zzTe(i2) + i, item);
            zzYKM zzykmZzBT = zzzo3.zzBT(i2);
            zzZRY zzzryZzBS = zzzo3.zzBS(zzykmZzBT.zze0);
            zzykmZzBT.zze0 = zzZ8(zzzryZzBS.zzYI0, zzzryZzBS.zzck).zze0;
            com.aspose.words.internal.zzZQG.zzZ(this.zzYzd, zzykmZzBT);
            int i3 = 0;
            while (true) {
                int[] iArr = zzykmZzBT.zzXDd;
                if (i3 < iArr.length) {
                    zzykmZzBT.zzXDd[i3] = zzLv(zzzo3.getString(iArr[i3]));
                    zzykmZzBT.zzXDc[i3] = zzLv(zzzo3.getString(zzykmZzBT.zzXDc[i3]));
                    i3++;
                }
            }
        }
        for (int i4 = 0; i4 < zzzo3.zzYzf.getItemCount(); i4++) {
            zzZS2 item2 = zzzo3.zzYzf.getItem(i4);
            item2.zzYIb += count;
            this.zzYzf.zzX(zzzo3.zzYzf.zzTe(i4) + i, item2);
        }
    }
}
