package com.aspose.words;

import com.google.common.primitives.SignedBytes;
import com.google.common.primitives.UnsignedBytes;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: classes6.dex */
final class zzZ44 {
    static boolean zzZD5 = false;
    private com.aspose.words.internal.zzZOX zzW6;
    private ListCollection zzYSl;
    private zzZRA zzYUj;
    private zzYEC zzYUx;
    private zzZZB zzYbA;
    private zzYMV zzYbB;
    private IWarningCallback zzZG0;

    public zzZ44(zzZZB zzzzb, ListCollection listCollection) throws Exception {
        this.zzYSl = listCollection;
        this.zzYbB = new zzYMV(zzzzb);
        this.zzYUx = new zzYEC(zzzzb);
        this.zzZG0 = zzzzb.zzYUo;
        this.zzYbA = zzzzb;
    }

    private static boolean zzG(byte[] bArr, int i, int i2) {
        for (int i3 = 0; i3 <= i2; i3++) {
            if ((bArr[i3] & 255) - 1 == i) {
                return true;
            }
        }
        return false;
    }

    private boolean zzM(List list) throws Exception {
        if (!com.aspose.words.internal.zzZYQ.zzT(this.zzW6, 4)) {
            return false;
        }
        this.zzW6.zzXc();
        Iterator<zzZ4B> it = list.zzYPb().iterator();
        while (it.hasNext()) {
            if (!zzY(it.next())) {
                return false;
            }
        }
        return true;
    }

    private static void zzR(ListLevel listLevel) {
        Object obj = listLevel.zzZYh().get(490);
        Object obj2 = listLevel.zzZYh().get(480);
        if (obj != null && obj2 != null && (((Integer) obj).intValue() & 1) != 0) {
            listLevel.zzzp(((Integer) obj2).intValue());
        }
        listLevel.zzZYh().remove(490);
        listLevel.zzZYh().remove(480);
    }

    private boolean zzS(ListLevel listLevel) throws Exception {
        listLevel.zzxc(this.zzW6.zzXc());
        listLevel.setNumberStyle(this.zzW6.readByte() & 255);
        com.aspose.words.internal.zzZKN.format("\nReading list level {0}.", Integer.valueOf(listLevel.getNumberStyle()));
        byte b = this.zzW6.readByte();
        listLevel.setAlignment(b & 3);
        listLevel.isLegal((b & 4) != 0);
        boolean z = (b & 8) != 0;
        listLevel.zzUH((b & 16) != 0);
        listLevel.zzUG((b & 32) != 0);
        listLevel.zzUI((b & SignedBytes.MAX_POWER_OF_TWO) != 0);
        listLevel.zzYcc = (b & UnsignedBytes.MAX_POWER_OF_TWO) != 0;
        byte[] bArrZzn = this.zzW6.zzn(9);
        listLevel.setTrailingCharacter(this.zzW6.readByte() & 255);
        listLevel.zzx1(this.zzW6.zzXc());
        listLevel.zzx0(this.zzW6.zzXc());
        int i = this.zzW6.readByte() & 255;
        int i2 = this.zzW6.readByte() & 255;
        int i3 = (this.zzW6.readByte() & 255) - 1;
        if (z) {
            listLevel.zzxb(i3);
        }
        this.zzW6.readByte();
        this.zzYbB.zzZ(new zzZLN(this.zzW6, i2).getData(), listLevel.zzZYj(), (zzYMT) null);
        if (!this.zzYbA.zzZrB()) {
            if (this.zzYUj.zzYHB != 194 || listLevel.zzZYj().contains(1560)) {
                zzZNS.zzZ(listLevel.zzZYj());
            } else {
                listLevel.zzZYj().setBidi(true);
                zzZNS.zzZ(listLevel.zzZYj());
                listLevel.zzZYj().remove(1560);
            }
        }
        this.zzYUx.zzZ(new zzZLN(this.zzW6, i).getData(), listLevel.zzZYh(), null);
        int iZzX9 = ((int) (((long) (this.zzW6.zzX9() & 65535)) & 4294967295L)) * 2;
        if (!com.aspose.words.internal.zzZYQ.zzT(this.zzW6, iZzX9)) {
            zzY("Invalid number format definition, skipped.", new Object[0]);
            zzZ4C.zzY(listLevel, listLevel.zzYOa());
            this.zzW6.zzq().zzH(this.zzW6.zzq().getLength());
            return false;
        }
        String strZzZn = com.aspose.words.internal.zzZO0.zzhU().zzZn(this.zzW6.zzn(iZzX9));
        if (listLevel.getNumberStyle() != 23 && !zzY(bArrZzn, strZzZn, listLevel.zzYOa())) {
            return false;
        }
        if (strZzZn.length() > 31) {
            zzY("Number format definition is too long, truncated.", new Object[0]);
            strZzZn = strZzZn.substring(0, 31);
        }
        listLevel.setNumberFormat(zzY(strZzZn, bArrZzn, listLevel.zzYOa()));
        if (listLevel.getNumberStyle() != 23 && !ListLevel.zzZA(listLevel.getNumberFormat(), listLevel.zzYOa())) {
            zzY("Invalid number format definition, skipped.", new Object[0]);
            return false;
        }
        if (!ListLevel.zzx5(listLevel.getNumberStyle())) {
            zzY("Invalid number style definition, skipped.", new Object[0]);
            return false;
        }
        if (!ListLevel.zzx4(listLevel.getAlignment())) {
            zzY("Invalid level alignment definition, skipped.", new Object[0]);
            return false;
        }
        if (!ListLevel.zzx3(listLevel.getTrailingCharacter())) {
            zzY("Invalid trailing character definition, skipped.", new Object[0]);
            return false;
        }
        if (listLevel.zzYO8() && !ListLevel.zzxa(listLevel.zzYO6())) {
            zzY("Invalid legacy space definition, skipped.", new Object[0]);
            return false;
        }
        if (listLevel.zzYOa() <= 0 || ListLevel.zzx8(i3)) {
            zzR(listLevel);
            return true;
        }
        zzY("Invalid level restart definition, skipped.", new Object[0]);
        return false;
    }

    private void zzX(zzZ4J zzz4j) throws Exception {
        zzz4j.zzYOP().getCount();
        com.aspose.words.internal.zzZKN.format("0x{0:x8}", Integer.valueOf(zzz4j.zzYP8()));
        for (ListLevel listLevel : zzz4j.zzYOP()) {
            if (!zzS(listLevel)) {
                zzZ4C.zzY(listLevel, listLevel.zzYOa());
                zzY("List level in list definition 0x{0:x} is corrupted.", Integer.valueOf(zzz4j.zzYP8()));
            }
            if (this.zzW6.zzq().getPosition() >= this.zzW6.zzq().getLength()) {
                return;
            }
        }
    }

    private static boolean zzY(byte[] bArr, String str, int i) {
        int i2;
        for (int i3 = 0; i3 <= i && (i2 = bArr[i3] & 255) != 0; i3++) {
            if (i2 > str.length() || str.charAt(i2 - 1) > i) {
                return false;
            }
        }
        return true;
    }

    private void zzYNQ() throws Exception {
        ArrayList arrayList = new ArrayList();
        zzY91.zzY(this.zzW6, this.zzYUj.zzYGE.zzXzb, arrayList);
        int iMin = Math.min(arrayList.size(), this.zzYSl.zzYP1());
        for (int i = 0; i < iMin; i++) {
            this.zzYSl.zzxs(i).setName((String) arrayList.get(i));
        }
    }

    private void zzYNR() throws Exception {
        if (this.zzYUj.zzYGE.zzXzt.zzYHJ == 0) {
            return;
        }
        this.zzW6.zzq().zzU(this.zzYUj.zzYGE.zzXzt.zzYHK, 0);
        int iZzXc = this.zzW6.zzXc();
        int i = 0;
        while (i < iZzXc) {
            i++;
            this.zzYSl.zzQ(zzwR(i));
        }
        boolean zZzM = true;
        for (int i2 = 0; i2 < iZzXc; i2++) {
            if (zZzM) {
                zZzM = zzM(this.zzYSl.get(i2));
            }
            if (!zZzM) {
                this.zzYSl.get(i2).zzYPb().clear();
            }
        }
    }

    private zzZ4J zzYNS() throws Exception {
        int iZzXc = this.zzW6.zzXc();
        int iZzXc2 = this.zzW6.zzXc();
        int[] iArr = new int[9];
        boolean z = true;
        for (int i = 0; i < 9; i++) {
            int iZzhE = zzY0C.zzhE(this.zzW6.zzXa());
            iArr[i] = iZzhE;
            if (iZzhE != 0) {
                z = false;
            }
        }
        if (z) {
            for (int i2 = 0; i2 < 9; i2++) {
                iArr[i2] = 12287;
            }
        }
        byte b = this.zzW6.readByte();
        this.zzW6.readByte();
        com.aspose.words.internal.zzZKN.format("\nRead list definition {0:x4}, tplc={1:x4}, flags={2}", Integer.valueOf(iZzXc), Integer.valueOf(iZzXc2), Integer.valueOf(b & 255));
        zzZ4J zzz4j = new zzZ4J(this.zzYSl.getDocument(), iZzXc, (b & 1) != 0 ? 0 : (b & 16) != 0 ? 2 : 1, iZzXc2);
        zzz4j.isRestartAtEachSection((b & 2) != 0);
        for (int i3 = 0; i3 < zzz4j.zzYOP().getCount(); i3++) {
            zzz4j.zzYOP().zzwY(i3).zzx2(iArr[i3]);
        }
        return zzz4j;
    }

    private void zzYNT() throws Exception {
        if (this.zzYUj.zzYGE.zzXzu.zzYHJ == 0) {
            return;
        }
        this.zzW6.zzq().zzH(this.zzYUj.zzYGE.zzXzu.zzYHK);
        short sZzXa = this.zzW6.zzXa();
        for (int i = 0; i < sZzXa; i++) {
            this.zzYSl.zzZ(zzYNS());
        }
        for (int i2 = 0; i2 < sZzXa; i2++) {
            zzX(this.zzYSl.zzxs(i2));
            if (this.zzW6.zzq().getPosition() >= this.zzW6.zzq().getLength()) {
                return;
            }
        }
    }

    private List zzwR(int i) throws Exception {
        List list = new List(this.zzYSl.getDocument(), i);
        list.zzxB(this.zzW6.zzXc());
        list.zzxB(list.zzYPa().zzYP8());
        this.zzW6.zzXc();
        this.zzW6.zzXc();
        int iMin = Math.min(this.zzW6.readByte() & 255, 9);
        for (int i2 = 0; i2 < iMin; i2++) {
            list.zzYPb().zzZ(new zzZ4B());
        }
        if ((this.zzW6.readByte() & 255) > 0) {
            zzY("Lists linked to AutoNum fields are not supported by Aspose.Words.", new Object[0]);
        }
        this.zzW6.readByte();
        this.zzW6.readByte();
        return list;
    }

    public final void zzYNU() {
        int i = 0;
        int i2 = 0;
        while (i2 < this.zzYSl.getCount()) {
            List list = this.zzYSl.get(i2);
            if (list.zzYP8() == -1) {
                zzY1Z.zzZ(this.zzZG0, 10, "List {0} refers to invalid list definition, removed.", Integer.valueOf(list.getListId()));
                this.zzYSl.zzxm(list.getListId());
            } else {
                i2++;
            }
        }
        while (i < this.zzYSl.zzYOX().size()) {
            if (this.zzYSl.zzYOX().get(i).zzYP8() == -1) {
                zzY1Z.zzZ(this.zzZG0, 10, "Invalid list definition at index {0}, removed.", Integer.valueOf(i));
                this.zzYSl.zzYOX().remove(i);
            } else {
                i++;
            }
        }
    }

    public final void zzZ(zzZRA zzzra, com.aspose.words.internal.zzZOX zzzox) throws Exception {
        this.zzYUj = zzzra;
        this.zzW6 = zzzox;
        zzYNT();
        zzYNR();
        zzYNQ();
    }

    private static String zzY(String str, byte[] bArr, int i) {
        StringBuilder sb = new StringBuilder(str.length());
        for (int i2 = 0; i2 < str.length(); i2++) {
            char cCharAt = str.charAt(i2);
            if (cCharAt <= '\b') {
                if (zzG(bArr, i2, i)) {
                    sb.append(cCharAt);
                }
            } else if (cCharAt >= ' ' && cCharAt != 65535) {
                sb.append(cCharAt);
            }
        }
        return sb.toString();
    }

    private boolean zzY(zzZ4B zzz4b) throws Exception {
        if (!com.aspose.words.internal.zzZYQ.zzT(this.zzW6, 4)) {
            return false;
        }
        zzz4b.zzYbY = this.zzW6.zzXc();
        byte b = this.zzW6.readByte();
        zzz4b.zzT(new ListLevel(this.zzYSl.getDocument(), b & 15));
        zzz4b.zzYbX = (b & 16) != 0;
        zzz4b.zzYbW = (b & 32) != 0;
        zzz4b.zzYbV = this.zzW6.zzXa();
        zzz4b.zzYbU = this.zzW6.readByte() & 255;
        if (zzz4b.zzYbW) {
            zzS(zzz4b.getListLevel());
        }
        return true;
    }

    private void zzY(String str, Object... objArr) {
        zzY1Z.zzZ(this.zzZG0, 10, str, objArr);
    }
}
