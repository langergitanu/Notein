package com.aspose.words;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes6.dex */
final class zzYHB {
    private byte zzXvD;
    private byte zzXvE;
    private boolean zzXvF;
    private int zzXvG;
    private zzU1 zzXvH;
    private zzU1 zzXvI;
    private zzU1 zzXvJ;
    private zzU1 zzXvK;
    private ArrayList<zzZ7N> zzXvC = new ArrayList<>(30);
    private ArrayList<zzZ7N> zzXvB = new ArrayList<>(6);
    private ArrayList<zzZ7N> zzXvA = new ArrayList<>(5);

    public zzYHB(zzYEF zzyef) {
        this.zzXvE = (byte) -1;
        this.zzXvD = (byte) -1;
        for (int i = 0; i < zzyef.getCount(); i++) {
            int iZzT3 = zzyef.zzT3(i);
            Object objZzVY = zzyef.zzVY(i);
            objZzVY = (iZzT3 == 60 || iZzT3 == 70 || iZzT3 == 250 || iZzT3 == 260 || iZzT3 == 440) ? ((zzZU) objZzVY).zzZ((zzZ9G) zzyef, iZzT3) : objZzVY;
            switch (iZzT3) {
                case 10:
                case 12:
                case 13:
                case 14:
                case 15:
                case 20:
                case 30:
                case 40:
                case 45:
                case 50:
                case 80:
                case 90:
                case 100:
                case 110:
                case 120:
                case 130:
                case 132:
                case 140:
                case 150:
                case 160:
                case 170:
                case 180:
                case 200:
                case 210:
                case 220:
                case StyleIdentifier.GRID_TABLE_4_ACCENT_2 /* 290 */:
                case 300:
                case StyleIdentifier.GRID_TABLE_3_ACCENT_5 /* 310 */:
                case StyleIdentifier.LIST_TABLE_2_ACCENT_1 /* 330 */:
                case StyleIdentifier.LIST_TABLE_4_ACCENT_5 /* 360 */:
                case StyleIdentifier.LIST_TABLE_7_COLORFUL_ACCENT_6 /* 370 */:
                case 450:
                case 770:
                case 780:
                case 880:
                    com.aspose.words.internal.zzZQG.zzZ(this.zzXvC, new zzZ7N(iZzT3, objZzVY));
                    break;
                case 60:
                case 70:
                case 190:
                case 380:
                case 390:
                    com.aspose.words.internal.zzZQG.zzZ(this.zzXvB, new zzZ7N(iZzT3, objZzVY));
                    break;
                case 230:
                    com.aspose.words.internal.zzZQG.zzZ(this.zzXvB, new zzZ7N(iZzT3, objZzVY));
                    this.zzXvK = (zzU1) objZzVY;
                    break;
                case 235:
                    this.zzXvI = (zzU1) objZzVY;
                    break;
                case 240:
                    this.zzXvH = (zzU1) objZzVY;
                    break;
                case 250:
                case StyleIdentifier.SUBTLE_EMPHASIS /* 260 */:
                case StyleIdentifier.LIST_TABLE_5_DARK_ACCENT_2 /* 340 */:
                case StyleIdentifier.LIST_TABLE_1_LIGHT_ACCENT_4 /* 350 */:
                    com.aspose.words.internal.zzZQG.zzZ(this.zzXvA, new zzZ7N(iZzT3, objZzVY));
                    break;
                case StyleIdentifier.BIBLIOGRAPHY /* 265 */:
                    this.zzXvE = ((zzZU) objZzVY).toBool() ? (byte) 1 : (byte) 0;
                    break;
                case StyleIdentifier.PLAIN_TABLE_2 /* 268 */:
                    this.zzXvD = ((zzZU) objZzVY).toBool() ? (byte) 1 : (byte) 0;
                    break;
                case 270:
                    com.aspose.words.internal.zzZQG.zzZ(this.zzXvA, new zzZ7N(iZzT3, objZzVY));
                    this.zzXvJ = (zzU1) objZzVY;
                    break;
                case 400:
                    this.zzXvG = ((Integer) objZzVY).intValue();
                    break;
                case 440:
                    com.aspose.words.internal.zzZQG.zzZ(this.zzXvC, new zzZ7N(iZzT3, objZzVY));
                    this.zzXvF = ((zzZU) objZzVY).toBool();
                    break;
            }
        }
    }

    public final ArrayList<zzZ7N> zzYiA() {
        return this.zzXvC;
    }

    public final byte zzYiB() {
        return this.zzXvD;
    }

    public final byte zzYiC() {
        return this.zzXvE;
    }

    public final boolean zzYiD() {
        return this.zzXvF;
    }

    public final zzU1 zzYiE() {
        return this.zzXvH;
    }

    public final zzU1 zzYiF() {
        return this.zzXvI;
    }

    public final zzU1 zzYiG() {
        return this.zzXvK;
    }

    public final boolean zzYix() {
        return this.zzXvE == 1 || this.zzXvD == 1;
    }

    public final ArrayList<zzZ7N> zzYiy() {
        return this.zzXvA;
    }

    public final ArrayList<zzZ7N> zzYiz() {
        return this.zzXvB;
    }

    public final int zzZ7n() {
        return this.zzXvG;
    }

    public final zzU1 zzoT(int i) {
        return zzY0C.zzZ(i, this.zzXvK, this.zzXvJ, this.zzXvI, this.zzXvH);
    }
}
