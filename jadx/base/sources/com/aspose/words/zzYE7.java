package com.aspose.words;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes6.dex */
final class zzYE7 {
    private int zzXpM = 0;
    private int[] zzXpN;
    private ArrayList<Character> zzXpO;
    private zzYE8 zzXpP;

    public zzYE7(zzYE8 zzye8) {
        this.zzXpP = zzye8;
        this.zzXpN = new int[zzye8.getRunCount()];
        this.zzXpO = new ArrayList<>(zzye8.getLength());
    }

    private void zzYdo() {
        int[] iArr = this.zzXpN;
        int length = iArr.length;
        if (length > 1) {
            int i = length - 1;
            if (iArr[i] == 0) {
                iArr[i] = iArr[length - 2];
            }
        }
        int i2 = iArr[length - 1] + 1;
        if (this.zzXpO.size() > i2) {
            ArrayList<Character> arrayList = this.zzXpO;
            com.aspose.words.internal.zzZQG.zzV(arrayList, i2, arrayList.size() - i2);
        }
    }

    private void zzmZ(int i) {
        int size = this.zzXpO.size();
        int iZzn3 = this.zzXpP.zzn3(i);
        int[] iArr = this.zzXpN;
        iArr[iZzn3] = size;
        int i2 = this.zzXpM;
        if (iZzn3 != i2) {
            iArr[i2] = size;
            this.zzXpM = iZzn3;
        }
    }

    public final char get(int i) {
        return this.zzXpO.get(i).charValue();
    }

    public final int getLength() {
        return this.zzXpO.size();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(this.zzXpO.size());
        for (int i = 0; i < this.zzXpO.size(); i++) {
            sb.append(this.zzXpO.get(i));
        }
        return sb.toString();
    }

    public final void zzM(char c, int i) {
        zzmZ(i);
        com.aspose.words.internal.zzZQG.zzZ(this.zzXpO, Character.valueOf(c));
    }

    public final void zzV(int i, char c) {
        this.zzXpO.set(i, Character.valueOf(c));
    }

    public final void zzX(int i, char c, int i2) {
        zzmZ(i2);
        this.zzXpO.add(i, Character.valueOf(c));
    }

    public final void zzYdp() {
        zzYdo();
        this.zzXpP.zzV(toString(), this.zzXpN);
    }

    public final void zzn0(int i) {
        int i2 = 0;
        while (true) {
            int[] iArr = this.zzXpN;
            if (i2 >= iArr.length) {
                return;
            }
            int i3 = iArr[i2];
            if (i < i3) {
                iArr[i2] = i3 - 1;
            }
            i2++;
        }
    }
}
