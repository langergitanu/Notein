package com.aspose.words;

import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: classes6.dex */
final class zzZ42 {
    private com.aspose.words.internal.zzZOW zzW5;
    private ListCollection zzYSl;
    private zzYEA zzYTE;
    private zzYMU zzYTG;

    public zzZ42(zzZZ2 zzzz2, ListCollection listCollection) throws Exception {
        this.zzYSl = listCollection;
        this.zzYTG = new zzYMU(zzzz2);
        this.zzYTE = new zzYEA(zzzz2);
    }

    private static byte[] zzJ2(String str) {
        byte[] bArr = new byte[9];
        int i = 0;
        for (int i2 = 0; i2 < str.length(); i2++) {
            if (ListLevel.zzx7(str.charAt(i2))) {
                bArr[i] = (byte) (i2 + 1);
                i++;
                if (i >= 9) {
                    break;
                }
            }
        }
        return bArr;
    }

    private void zzK(List list) throws Exception {
        this.zzW5.zzk(-1);
        Iterator<zzZ4B> it = list.zzYPb().iterator();
        while (it.hasNext()) {
            zzX(it.next());
        }
    }

    private void zzL(List list) throws Exception {
        this.zzW5.zzl(list.zzYP8());
        this.zzW5.zzl(0);
        this.zzW5.zzl(0);
        this.zzW5.writeByte((byte) list.zzYPb().getCount());
        this.zzW5.writeByte((byte) 0);
        this.zzW5.zzK((short) 0);
    }

    private static void zzP(ListLevel listLevel) {
        zzYEF zzyefZzZYh = listLevel.zzZYh();
        if (listLevel.zzYOb()) {
            zzyefZzZYh.zzQ(480, Integer.valueOf(listLevel.zzZ0p()));
            zzyefZzZYh.zzQ(490, 1);
        } else {
            zzyefZzZYh.zzQ(480, 0);
            zzyefZzZYh.zzQ(490, 0);
        }
    }

    private void zzQ(ListLevel listLevel) throws Exception {
        this.zzW5.zzl(listLevel.getStartAt());
        this.zzW5.writeByte((byte) listLevel.getNumberStyle());
        this.zzW5.writeByte((byte) ((((byte) listLevel.getAlignment()) & 255) | (listLevel.isLegal() ? 4 : 0) | (listLevel.zzYO9() ? 8 : 0) | (listLevel.zzYO8() ? 16 : 0) | (listLevel.zzYO7() ? 32 : 0) | (listLevel.getLegacy() ? 64 : 0) | (listLevel.zzYcc ? 128 : 0)));
        this.zzW5.writeBytes(zzJ2(listLevel.getNumberFormat()));
        this.zzW5.writeByte((byte) listLevel.getTrailingCharacter());
        this.zzW5.zzl(listLevel.zzYO6());
        this.zzW5.zzl(listLevel.zzYO5());
        zzP(listLevel);
        zzXF zzxfZzZ = this.zzYTE.zzZ(listLevel.zzZYh(), null, false);
        this.zzW5.writeByte((byte) zzxfZzZ.getData().length);
        zzYNJ zzynjZzZ = this.zzYTG.zzZ(listLevel.zzZYj(), null, listLevel.zzZYj().getBidi());
        this.zzW5.writeByte((byte) zzynjZzZ.getData().length);
        this.zzW5.zzK((short) (listLevel.zzYO9() ? listLevel.getRestartAfterLevel() + 1 : 0));
        this.zzW5.writeBytes(zzynjZzZ.getData());
        this.zzW5.writeBytes(zzxfZzZ.getData());
        zzZZQ.zzZ(listLevel.getNumberFormat(), Integer.MAX_VALUE, this.zzW5, true, false);
    }

    private void zzV(zzZ4J zzz4j) throws Exception {
        ListLevelCollection listLevels = zzz4j.getListLevels();
        for (int i = 0; i < listLevels.getCount(); i++) {
            zzQ(listLevels.get(i));
        }
    }

    private void zzW(zzZ4J zzz4j) throws Exception {
        this.zzW5.zzl(zzz4j.zzYP8());
        this.zzW5.zzl(zzz4j.zzYOQ());
        ListLevelCollection listLevels = zzz4j.getListLevels();
        int i = 0;
        int i2 = 0;
        while (i2 < 9) {
            this.zzW5.zzK((short) zzY0C.zzhD(i2 < zzz4j.zzYOP().getCount() ? listLevels.zzwY(i2).zzYOc() : StyleIdentifier.NIL));
            i2++;
        }
        int iZzYOR = zzz4j.zzYOR();
        if (iZzYOR == 0) {
            i = 1;
        } else if (iZzYOR != 1) {
            if (iZzYOR != 2) {
                throw new IllegalStateException("Unknown list type.");
            }
            i = 16;
        }
        if (zzz4j.isRestartAtEachSection()) {
            i |= 2;
        }
        this.zzW5.zzJ((short) i);
    }

    private void zzX(zzZ4B zzz4b) throws Exception {
        this.zzW5.zzl(zzz4b.zzYbY);
        this.zzW5.writeByte((byte) (zzz4b.getListLevel().zzYOa() | (zzz4b.zzYbX ? 16 : 0) | (zzz4b.zzYbW ? 32 : 0)));
        this.zzW5.zzK((short) zzz4b.zzYbV);
        this.zzW5.writeByte((byte) zzz4b.zzYbU);
        if (zzz4b.zzYbW) {
            zzQ(zzz4b.getListLevel());
        }
    }

    private int zzYNH() throws Exception {
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < this.zzYSl.zzYP1(); i++) {
            com.aspose.words.internal.zzZQG.zzZ((ArrayList<String>) arrayList, this.zzYSl.zzxs(i).getName());
        }
        return zzY91.zzZ(this.zzW5, (ArrayList<String>) arrayList);
    }

    private int zzYNI() throws Exception {
        int position = (int) this.zzW5.zzq().getPosition();
        this.zzW5.zzl(this.zzYSl.getCount());
        for (int i = 0; i < this.zzYSl.getCount(); i++) {
            zzL(this.zzYSl.get(i));
        }
        for (int i2 = 0; i2 < this.zzYSl.getCount(); i2++) {
            zzK(this.zzYSl.get(i2));
        }
        return ((int) this.zzW5.zzq().getPosition()) - position;
    }

    private int zzYNJ() throws Exception {
        if (this.zzYSl.zzYP1() == 0) {
            return 0;
        }
        int position = (int) this.zzW5.zzq().getPosition();
        this.zzW5.zzK((short) this.zzYSl.zzYP1());
        for (int i = 0; i < this.zzYSl.zzYP1(); i++) {
            zzW(this.zzYSl.zzxs(i));
        }
        int position2 = ((int) this.zzW5.zzq().getPosition()) - position;
        for (int i2 = 0; i2 < this.zzYSl.zzYP1(); i2++) {
            zzV(this.zzYSl.zzxs(i2));
        }
        return position2;
    }

    public final void zzZ(zzZRA zzzra, com.aspose.words.internal.zzZOW zzzow) throws Exception {
        this.zzW5 = zzzow;
        zzzra.zzYGE.zzXzu.zzYHK = (int) zzzow.zzq().getPosition();
        zzzra.zzYGE.zzXzu.zzYHJ = zzYNJ();
        zzzra.zzYGE.zzXzt.zzYHK = (int) this.zzW5.zzq().getPosition();
        zzzra.zzYGE.zzXzt.zzYHJ = zzYNI();
        zzzra.zzYGE.zzXzb.zzYHK = (int) this.zzW5.zzq().getPosition();
        zzzra.zzYGE.zzXzb.zzYHJ = zzYNH();
    }
}
