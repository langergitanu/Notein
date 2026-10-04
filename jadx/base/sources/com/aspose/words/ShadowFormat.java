package com.aspose.words;

import androidx.core.internal.view.SupportMenu;
import androidx.core.view.InputDeviceCompat;
import java.util.HashMap;

/* JADX INFO: loaded from: classes6.dex */
public class ShadowFormat {
    private static HashMap<Integer, Object[]> zzXnv;
    private ShapeBase zzYjI;

    public ShadowFormat(ShapeBase shapeBase) {
        this.zzYjI = shapeBase;
    }

    private zz1W zzYbA() {
        return (zz1W) zzmo(2);
    }

    private int zzYbB() {
        zzYC3 zzyc3ZzYvW = this.zzYjI.zzYvW();
        if (zzyc3ZzYvW.get(574) != null && ((Boolean) zzyc3ZzYvW.get(574)).booleanValue() && zzyc3ZzYvW.get(523) == null && zzyc3ZzYvW.get(525) == null) {
            for (Integer num : zzYbx().keySet()) {
                int iIntValue = num.intValue();
                Object[] objArr = zzYbx().get(num);
                if (zzu(zzyc3ZzYvW.get(512), objArr[0]) && zzu(zzyc3ZzYvW.get(514), objArr[1]) && zzu(zzyc3ZzYvW.get(StyleIdentifier.PLAIN_TABLE_2), objArr[2]) && zzu(zzyc3ZzYvW.get(516), objArr[3]) && zzu(zzyc3ZzYvW.get(517), objArr[4]) && zzu(zzyc3ZzYvW.get(518), objArr[5]) && zzu(zzyc3ZzYvW.get(521), objArr[6]) && zzu(zzyc3ZzYvW.get(519), objArr[7]) && zzu(zzyc3ZzYvW.get(520), objArr[8]) && zzu(zzyc3ZzYvW.get(522), objArr[9]) && zzu(zzyc3ZzYvW.get(524), objArr[10]) && zzu(zzyc3ZzYvW.get(528), objArr[11]) && zzu(zzyc3ZzYvW.get(529), objArr[12]) && zzu(zzyc3ZzYvW.get(526), objArr[13])) {
                    return iIntValue;
                }
            }
        }
        return -2;
    }

    private int zzYbC() {
        int i;
        if (this.zzYjI.zzY9a() == null || this.zzYjI.zzY9a().zzZTe() == null || this.zzYjI.zzY9a().zzZTe().getCount() == 0) {
            return -2;
        }
        zz1W zz1w = (zz1W) this.zzYjI.zzY9a().zzZTe().zzH1(2);
        if (zz1w != null) {
            switch (zz1w.zzZuE()) {
                case 0:
                    return 1;
                case 1:
                    return 10;
                case 2:
                    return 11;
                case 3:
                    return 12;
                case 4:
                    return 13;
                case 5:
                    return 14;
                case 6:
                    return 15;
                case 7:
                    return 16;
                case 8:
                    return 17;
                case 9:
                    return 18;
                case 10:
                    return 19;
                case 11:
                    return 2;
                case 12:
                    return 20;
                case 13:
                    return 3;
                case 14:
                    return 4;
                case 15:
                    return 5;
                case 16:
                    return 6;
                case 17:
                    return 7;
                case 18:
                    return 8;
                case 19:
                    return 9;
                default:
                    return -2;
            }
        }
        zz25 zz25Var = (zz25) this.zzYjI.zzY9a().zzZTe().zzH1(1);
        if (zz25Var != null) {
            if (zz25Var.zzZuN() == 63500.0d && zz25Var.zzZuL() == 50800.0d && zz25Var.zzZuM().getValue() == 1.35E7d) {
                return 30;
            }
            if (zz25Var.zzZuN() == 63500.0d && zz25Var.zzZuL() == 50800.0d && zz25Var.zzZuM().getValue() == 1.62E7d) {
                return 31;
            }
            if (zz25Var.zzZuN() == 63500.0d && zz25Var.zzZuL() == 50800.0d && zz25Var.zzZuM().getValue() == 1.89E7d) {
                return 32;
            }
            if (zz25Var.zzZuN() == 63500.0d && zz25Var.zzZuL() == 50800.0d && zz25Var.zzZuM().getValue() == 1.08E7d) {
                return 33;
            }
            if (zz25Var.zzZuN() == 114300.0d && zz25Var.zzZuL() == 0.0d && zz25Var.zzZuM().getValue() == 0.0d) {
                return 34;
            }
            if (zz25Var.zzZuN() == 63500.0d && zz25Var.zzZuL() == 50800.0d && zz25Var.zzZuM().getValue() == 0.0d) {
                return 35;
            }
            if (zz25Var.zzZuN() == 63500.0d && zz25Var.zzZuL() == 50800.0d && zz25Var.zzZuM().getValue() == 8100000.0d) {
                return 36;
            }
            if (zz25Var.zzZuN() == 63500.0d && zz25Var.zzZuL() == 50800.0d && zz25Var.zzZuM().getValue() == 5400000.0d) {
                return 37;
            }
            if (zz25Var.zzZuN() == 63500.0d && zz25Var.zzZuL() == 50800.0d && zz25Var.zzZuM().getValue() == 2700000.0d) {
                return 38;
            }
        }
        zz21 zz21Var = (zz21) this.zzYjI.zzY9a().zzZTe().zzH1(6);
        if (zz21Var == null) {
            return -2;
        }
        if (zz21Var.zzZuN() == 50800.0d && zz21Var.zzZuL() == 38100.0d && zz21Var.zzZuM().getValue() == 2700000.0d && zz21Var.zzZuG() == 1.0d && zz21Var.zzZuH() == 1.0d && zz21Var.getAlignment() == 0) {
            return 21;
        }
        if (zz21Var.zzZuN() == 50800.0d && zz21Var.zzZuL() == 38100.0d && zz21Var.zzZuM().getValue() == 5400000.0d && zz21Var.zzZuG() == 1.0d && zz21Var.zzZuH() == 1.0d) {
            i = -2;
            if (zz21Var.getAlignment() == 1) {
                return 22;
            }
        } else {
            i = -2;
        }
        if (zz21Var.zzZuN() == 50800.0d && zz21Var.zzZuL() == 38100.0d && zz21Var.zzZuM().getValue() == 8100000.0d && zz21Var.zzZuG() == 1.0d && zz21Var.zzZuH() == 1.0d && zz21Var.getAlignment() == 2) {
            return 23;
        }
        if (zz21Var.zzZuN() == 50800.0d && zz21Var.zzZuL() == 38100.0d && zz21Var.zzZuM().getValue() == 0.0d && zz21Var.zzZuG() == 1.0d && zz21Var.zzZuH() == 1.0d && zz21Var.getAlignment() == 3) {
            return 24;
        }
        if (zz21Var.zzZuN() == 63500.0d && zz21Var.zzZuL() == 0.0d && zz21Var.zzZuM().getValue() == 0.0d && zz21Var.zzZuG() == 1.02d && zz21Var.zzZuH() == 1.02d && zz21Var.getAlignment() == 4) {
            return 25;
        }
        if (zz21Var.zzZuN() == 50800.0d && zz21Var.zzZuL() == 38100.0d && zz21Var.zzZuM().getValue() == 1.08E7d && zz21Var.zzZuG() == 1.0d && zz21Var.zzZuH() == 1.0d && zz21Var.getAlignment() == 5) {
            return 26;
        }
        if (zz21Var.zzZuN() == 50800.0d && zz21Var.zzZuL() == 38100.0d && zz21Var.zzZuM().getValue() == 1.89E7d && zz21Var.zzZuG() == 1.0d && zz21Var.zzZuH() == 1.0d && zz21Var.getAlignment() == 6) {
            return 27;
        }
        if (zz21Var.zzZuN() == 50800.0d && zz21Var.zzZuL() == 38100.0d && zz21Var.zzZuM().getValue() == 1.62E7d && zz21Var.zzZuG() == 1.0d && zz21Var.zzZuH() == 1.0d && zz21Var.getAlignment() == 7) {
            return 28;
        }
        if (zz21Var.zzZuN() == 50800.0d && zz21Var.zzZuL() == 38100.0d && zz21Var.zzZuM().getValue() == 1.35E7d && zz21Var.zzZuG() == 1.0d && zz21Var.zzZuH() == 1.0d && zz21Var.getAlignment() == 8) {
            return 29;
        }
        if (zz21Var.zzZuN() == 76200.0d && zz21Var.zzZuL() == 0.0d && zz21Var.zzZuM().getValue() == 1.35E7d && zz21Var.zzZuG() == 0.23d && zz21Var.zzZuH() == 1.0d && zz21Var.getAlignment() == 8) {
            return 39;
        }
        if (zz21Var.zzZuN() == 76200.0d && zz21Var.zzZuL() == 0.0d && zz21Var.zzZuM().getValue() == 1.89E7d && zz21Var.zzZuG() == 0.23d && zz21Var.zzZuH() == 1.0d && zz21Var.getAlignment() == 6) {
            return 40;
        }
        if (zz21Var.zzZuN() == 152400.0d && zz21Var.zzZuL() == 317500.0d && zz21Var.zzZuM().getValue() == 5400000.0d && zz21Var.zzZuG() == -0.19d && zz21Var.zzZuH() == 0.9d && zz21Var.getAlignment() == 7) {
            return 41;
        }
        if (zz21Var.zzZuN() == 76200.0d && zz21Var.zzZuL() == 12700.0d && zz21Var.zzZuM().getValue() == 8100000.0d && zz21Var.zzZuG() == -0.23d && zz21Var.zzZuH() == 1.0d && zz21Var.getAlignment() == 8) {
            return 42;
        }
        if (zz21Var.zzZuN() == 76200.0d && zz21Var.zzZuL() == 12700.0d && zz21Var.zzZuM().getValue() == 2700000.0d && zz21Var.zzZuG() == -0.23d && zz21Var.zzZuH() == 1.0d && zz21Var.getAlignment() == 6) {
            return 43;
        }
        return i;
    }

    private static HashMap<Integer, Object[]> zzYbx() {
        if (zzXnv == null) {
            HashMap<Integer, Object[]> map = new HashMap<>();
            zzXnv = map;
            com.aspose.words.internal.zzZQF.zzY(map, 1, new Object[]{null, null, null, 32768, -76200, -76200, null, null, null, null, null, null, null, null});
            com.aspose.words.internal.zzZQF.zzY(zzXnv, 2, new Object[]{null, null, null, 32768, 76200, -76200, null, null, null, null, null, null, null, null});
            com.aspose.words.internal.zzZQF.zzY(zzXnv, 3, new Object[]{2, null, null, 32768, 0, 0, null, null, null, 56756, 32768, null, 32768, null});
            com.aspose.words.internal.zzZQF.zzY(zzXnv, 4, new Object[]{2, null, null, 32768, 0, 0, null, null, null, -56756, 32768, null, 32768, null});
            com.aspose.words.internal.zzZQF.zzY(zzXnv, 5, new Object[]{null, null, null, 32768, -76200, 76200, null, null, null, null, null, null, null, null});
            com.aspose.words.internal.zzZQF.zzY(zzXnv, 6, new Object[]{null, null, null, 32768, 76200, 76200, null, null, null, null, null, null, null, null});
            com.aspose.words.internal.zzZQF.zzY(zzXnv, 7, new Object[]{2, null, null, 32768, 0, 0, null, null, null, 56756, -32768, null, 32768, null});
            com.aspose.words.internal.zzZQF.zzY(zzXnv, 8, new Object[]{2, null, null, 32768, 0, 0, null, null, null, -56756, -32768, null, 32768, null});
            com.aspose.words.internal.zzZQF.zzY(zzXnv, 9, new Object[]{2, null, null, 32768, -76200, -76200, 49152, null, null, null, 49152, -32768, -32768, null});
            com.aspose.words.internal.zzZQF.zzY(zzXnv, 10, new Object[]{2, null, null, 32768, -76200, -76200, 81920, null, null, null, 81920, 32768, 32768, null});
            com.aspose.words.internal.zzZQF.zzY(zzXnv, 11, new Object[]{2, null, null, 32768, 0, 0, null, null, null, 92680, null, -32768, 32768, -16});
            com.aspose.words.internal.zzZQF.zzY(zzXnv, 12, new Object[]{2, null, null, 32768, 0, 0, null, null, null, -92680, null, 32768, 32768, -16});
            com.aspose.words.internal.zzZQF.zzY(zzXnv, 13, new Object[]{1, com.aspose.words.internal.zzPV.zzX(239, 243, 3, 102), null, 32768, -38100, -38100, null, -76200, -76200, null, null, null, null, null});
            com.aspose.words.internal.zzZQF.zzY(zzXnv, 14, new Object[]{null, null, null, 32768, null, null, null, null, null, null, null, null, null, null});
            com.aspose.words.internal.zzZQF.zzY(zzXnv, 15, new Object[]{2, null, null, 32768, 0, 0, null, null, null, 92680, Integer.valueOf(SupportMenu.CATEGORY_MASK), -32768, 32768, -16});
            com.aspose.words.internal.zzZQF.zzY(zzXnv, 16, new Object[]{2, null, null, 32768, 0, 0, null, null, null, -92680, Integer.valueOf(SupportMenu.CATEGORY_MASK), 32768, 32768, -16});
            com.aspose.words.internal.zzZQF.zzY(zzXnv, 17, new Object[]{5, com.aspose.words.internal.zzPV.zzX(239, 243, 3, 102), com.aspose.words.internal.zzPV.zzX(239, 243, 3, 51), 32768, 12700, 12700, null, -12700, -12700, null, null, null, null, null});
            com.aspose.words.internal.zzZQF.zzY(zzXnv, 18, new Object[]{5, com.aspose.words.internal.zzPV.zzX(239, 243, 3, 102), com.aspose.words.internal.zzPV.zzX(239, 243, 3, 51), 32768, -12700, -12700, null, 12700, 12700, null, null, null, null, null});
            com.aspose.words.internal.zzZQF.zzY(zzXnv, 19, new Object[]{2, null, null, 32768, 0, 0, null, null, null, null, 32768, null, 32768, -8});
            com.aspose.words.internal.zzZQF.zzY(zzXnv, 20, new Object[]{2, null, null, 32768, 0, 0, null, null, null, null, Integer.valueOf(SupportMenu.CATEGORY_MASK), null, 32768, null});
            com.aspose.words.internal.zzZQF.zzY(zzXnv, 21, new Object[]{null, null, null, 26214, 26941, 26941, null, null, null, null, null, -32768, -32768, null});
            com.aspose.words.internal.zzZQF.zzY(zzXnv, 22, new Object[]{null, null, null, 26214, 0, 38100, null, null, null, null, null, null, -32768, null});
            com.aspose.words.internal.zzZQF.zzY(zzXnv, 23, new Object[]{null, null, null, 26214, -26941, 26941, null, null, null, null, null, 32768, -32768, null});
            com.aspose.words.internal.zzZQF.zzY(zzXnv, 24, new Object[]{null, null, null, 26214, 38100, 0, null, null, null, null, null, -32768, null, null});
            com.aspose.words.internal.zzZQF.zzY(zzXnv, 25, new Object[]{null, null, null, 26214, 0, 0, 66847, null, null, null, 66847, null, null, null});
            com.aspose.words.internal.zzZQF.zzY(zzXnv, 26, new Object[]{null, null, null, 26214, -38100, 0, null, null, null, null, null, 32768, null, null});
            com.aspose.words.internal.zzZQF.zzY(zzXnv, 27, new Object[]{null, null, null, 26214, 26941, -26941, null, null, null, null, null, -32768, 32768, null});
            com.aspose.words.internal.zzZQF.zzY(zzXnv, 28, new Object[]{null, null, null, 26214, 0, -38100, null, null, null, null, null, null, 32768, null});
            com.aspose.words.internal.zzZQF.zzY(zzXnv, 29, new Object[]{null, null, null, 26214, -26941, -26941, null, null, null, null, null, 32768, 32768, null});
            com.aspose.words.internal.zzZQF.zzY(zzXnv, 39, new Object[]{2, null, null, 13107, 0, 0, null, null, null, 23853, 15073, 32768, 32768, null});
            com.aspose.words.internal.zzZQF.zzY(zzXnv, 40, new Object[]{2, null, null, 13107, 0, 0, null, null, null, -23853, 15073, -32768, 32768, null});
            com.aspose.words.internal.zzZQF.zzY(zzXnv, 41, new Object[]{2, null, null, 9830, 0, 317500, 58982, null, null, null, -12452, null, 32768, null});
            com.aspose.words.internal.zzZQF.zzY(zzXnv, 42, new Object[]{2, null, null, 13107, -8980, 8980, null, null, null, 15540, -15073, 32768, 32768, null});
            com.aspose.words.internal.zzZQF.zzY(zzXnv, 43, new Object[]{2, null, null, 13107, 8980, 8980, null, null, null, -15540, -15073, -32768, 32768, null});
        }
        return zzXnv;
    }

    private zz25 zzYby() {
        return (zz25) zzmo(1);
    }

    private zz21 zzYbz() {
        return (zz21) zzmo(6);
    }

    private void zzZT(int i, Object obj) {
        if (obj == null) {
            this.zzYjI.zzYvW().remove(i);
        } else {
            this.zzYjI.zzYvW().set(i, obj);
        }
    }

    private void zzmn(int i) {
        if (zzYbx().containsKey(Integer.valueOf(i))) {
            Object[] objArr = zzYbx().get(Integer.valueOf(i));
            this.zzYjI.zzYvW().set(574, Boolean.TRUE);
            zzZT(512, objArr[0]);
            zzZT(514, objArr[1]);
            zzZT(StyleIdentifier.PLAIN_TABLE_2, objArr[2]);
            zzZT(516, objArr[3]);
            zzZT(517, objArr[4]);
            zzZT(518, objArr[5]);
            zzZT(521, objArr[6]);
            zzZT(519, objArr[7]);
            zzZT(520, objArr[8]);
            zzZT(522, objArr[9]);
            zzZT(524, objArr[10]);
            zzZT(528, objArr[11]);
            zzZT(529, objArr[12]);
            zzZT(526, objArr[13]);
        }
    }

    private zz2F zzmo(int i) {
        if (this.zzYjI.zzY9a().zzZTe() == null) {
            this.zzYjI.zzY9a().zzZ(new zz2C(false, false));
        }
        if (this.zzYjI.zzY9a().zzZTe().zzH1(i) == null) {
            this.zzYjI.zzY9a().zzZTe().zzZ(i != 1 ? i != 2 ? i != 6 ? null : new zz21() : new zz1W() : new zz25());
        }
        return this.zzYjI.zzY9a().zzZTe().zzH1(i);
    }

    private void zzmp(int i) {
        if (this.zzYjI.zzY9a() == null) {
            return;
        }
        switch (i) {
            case 1:
                zzYbA().zzGW(0);
                zzYbA().zzQ(new zzHK(1.35E7d));
                zzYbA().zzXo(107763.0d);
                break;
            case 2:
                zzYbA().zzGW(11);
                zzYbA().zzQ(new zzHK(1.89E7d));
                zzYbA().zzXo(107763.0d);
                break;
            case 3:
                zzYbA().zzGW(13);
                break;
            case 4:
                zzYbA().zzGW(14);
                break;
            case 5:
                zzYbA().zzGW(15);
                zzYbA().zzQ(new zzHK(8100000.0d));
                zzYbA().zzXo(107763.0d);
                break;
            case 6:
                zzYbA().zzGW(16);
                zzYbA().zzQ(new zzHK(2700000.0d));
                zzYbA().zzXo(107763.0d);
                break;
            case 7:
                zzYbA().zzGW(17);
                break;
            case 8:
                zzYbA().zzGW(18);
                break;
            case 9:
                zzYbA().zzGW(19);
                zzYbA().zzQ(new zzHK(1.35E7d));
                zzYbA().zzXo(107763.0d);
                break;
            case 10:
                zzYbA().zzGW(1);
                zzYbA().zzQ(new zzHK(1.35E7d));
                zzYbA().zzXo(107763.0d);
                break;
            case 11:
                zzYbA().zzGW(2);
                break;
            case 12:
                zzYbA().zzGW(3);
                break;
            case 13:
                zzYbA().zzGW(4);
                zzYbA().zzQ(new zzHK(1.35E7d));
                zzYbA().zzXo(53882.0d);
                break;
            case 14:
                zzYbA().zzGW(5);
                zzYbA().zzQ(new zzHK(2700000.0d));
                zzYbA().zzXo(35921.0d);
                break;
            case 15:
                zzYbA().zzGW(6);
                break;
            case 16:
                zzYbA().zzGW(7);
                break;
            case 17:
                zzYbA().zzGW(8);
                zzYbA().zzQ(new zzHK(2700000.0d));
                zzYbA().zzXo(17961.0d);
                break;
            case 18:
                zzYbA().zzGW(9);
                zzYbA().zzQ(new zzHK(1.35E7d));
                zzYbA().zzXo(17961.0d);
                break;
            case 19:
                zzYbA().zzGW(10);
                break;
            case 20:
                zzYbA().zzGW(12);
                break;
            case 21:
                zzYbz().zzXp(50800.0d);
                zzYbz().zzXo(38100.0d);
                zzYbz().zzQ(new zzHK(2700000.0d));
                zzYbz().setAlignment(0);
                break;
            case 22:
                zzYbz().zzXp(50800.0d);
                zzYbz().zzXo(38100.0d);
                zzYbz().zzQ(new zzHK(5400000.0d));
                zzYbz().setAlignment(1);
                break;
            case 23:
                zzYbz().zzXp(50800.0d);
                zzYbz().zzXo(38100.0d);
                zzYbz().zzQ(new zzHK(8100000.0d));
                zzYbz().setAlignment(2);
                break;
            case 24:
                zzYbz().zzXp(50800.0d);
                zzYbz().zzXo(38100.0d);
                zzYbz().setAlignment(3);
                break;
            case 25:
                zzYbz().zzXp(63500.0d);
                zzYbz().zzXn(1.02d);
                zzYbz().zzXm(1.02d);
                zzYbz().setAlignment(4);
                break;
            case 26:
                zzYbz().zzXp(50800.0d);
                zzYbz().zzXo(38100.0d);
                zzYbz().zzQ(new zzHK(1.08E7d));
                zzYbz().setAlignment(5);
                break;
            case 27:
                zzYbz().zzXp(50800.0d);
                zzYbz().zzXo(38100.0d);
                zzYbz().zzQ(new zzHK(1.89E7d));
                zzYbz().setAlignment(6);
                break;
            case 28:
                zzYbz().zzXp(50800.0d);
                zzYbz().zzXo(38100.0d);
                zzYbz().zzQ(new zzHK(1.62E7d));
                break;
            case 29:
                zzYbz().zzXp(50800.0d);
                zzYbz().zzXo(38100.0d);
                zzYbz().zzQ(new zzHK(1.35E7d));
                zzYbz().setAlignment(8);
                break;
            case 30:
                zzYby().zzXp(63500.0d);
                zzYby().zzXo(50800.0d);
                zzYby().zzQ(new zzHK(1.35E7d));
                break;
            case 31:
                zzYby().zzXp(63500.0d);
                zzYby().zzXo(50800.0d);
                zzYby().zzQ(new zzHK(1.62E7d));
                break;
            case 32:
                zzYby().zzXp(63500.0d);
                zzYby().zzXo(50800.0d);
                zzYby().zzQ(new zzHK(1.89E7d));
                break;
            case 33:
                zzYby().zzXp(63500.0d);
                zzYby().zzXo(50800.0d);
                zzYby().zzQ(new zzHK(1.08E7d));
                break;
            case 34:
                zzYby().zzXp(114300.0d);
                zzYby().zzZQX().zzZ((zzHV) null);
                break;
            case 35:
                zzYby().zzXp(63500.0d);
                zzYby().zzXo(50800.0d);
                break;
            case 36:
                zzYby().zzXp(63500.0d);
                zzYby().zzXo(50800.0d);
                zzYby().zzQ(new zzHK(8100000.0d));
                break;
            case 37:
                zzYby().zzXp(63500.0d);
                zzYby().zzXo(50800.0d);
                zzYby().zzQ(new zzHK(5400000.0d));
                break;
            case 38:
                zzYby().zzXp(63500.0d);
                zzYby().zzXo(50800.0d);
                zzYby().zzQ(new zzHK(2700000.0d));
                break;
            case 39:
                zzYbz().zzXp(76200.0d);
                zzYbz().zzQ(new zzHK(1.35E7d));
                zzYbz().zzXm(0.23d);
                zzYbz().zzP(new zzHK(1200000.0d));
                zzYbz().setAlignment(8);
                zzYbz().zzZQX().zzZFG().setValue(0.2d);
                break;
            case 40:
                zzYbz().zzXp(76200.0d);
                zzYbz().zzQ(new zzHK(1.89E7d));
                zzYbz().zzXm(0.23d);
                zzYbz().zzP(new zzHK(-1200000.0d));
                zzYbz().setAlignment(6);
                zzYbz().zzZQX().zzZFG().setValue(0.2d);
                break;
            case 41:
                zzYbz().zzXp(152400.0d);
                zzYbz().zzXo(317500.0d);
                zzYbz().zzQ(new zzHK(5400000.0d));
                zzYbz().zzXm(-0.19d);
                zzYbz().zzXn(0.9d);
                zzYbz().zzZQX().zzZFG().setValue(0.15d);
                break;
            case 42:
                zzYbz().zzXp(76200.0d);
                zzYbz().zzXo(12700.0d);
                zzYbz().zzQ(new zzHK(8100000.0d));
                zzYbz().zzXm(-0.23d);
                zzYbz().zzP(new zzHK(800400.0d));
                zzYbz().setAlignment(8);
                zzYbz().zzZQX().zzZFG().setValue(0.2d);
                break;
            case 43:
                zzYbz().zzXp(76200.0d);
                zzYbz().zzXo(12700.0d);
                zzYbz().zzQ(new zzHK(2700000.0d));
                zzYbz().zzXm(-0.23d);
                zzYbz().zzP(new zzHK(-800400.0d));
                zzYbz().setAlignment(6);
                zzYbz().zzZQX().zzZFG().setValue(0.2d);
                break;
        }
    }

    private static boolean zzu(Object obj, Object obj2) {
        if (obj == null && obj2 == null) {
            return true;
        }
        return obj != null && obj.equals(obj2);
    }

    public void clear() {
        this.zzYjI.zzYvW().remove(574);
        this.zzYjI.zzYvW().remove(512);
        this.zzYjI.zzYvW().remove(InputDeviceCompat.SOURCE_DPAD);
        this.zzYjI.zzYvW().remove(514);
        this.zzYjI.zzYvW().remove(StyleIdentifier.PLAIN_TABLE_2);
        this.zzYjI.zzYvW().remove(516);
        this.zzYjI.zzYvW().remove(517);
        this.zzYjI.zzYvW().remove(518);
        this.zzYjI.zzYvW().remove(528);
        this.zzYjI.zzYvW().remove(529);
        this.zzYjI.zzYvW().remove(521);
        this.zzYjI.zzYvW().remove(523);
        this.zzYjI.zzYvW().remove(522);
        this.zzYjI.zzYvW().remove(524);
        this.zzYjI.zzYvW().remove(519);
        this.zzYjI.zzYvW().remove(520);
        this.zzYjI.zzYvW().remove(525);
        this.zzYjI.zzYvW().remove(526);
        zz2J zz2j = (zz2J) com.aspose.words.internal.zzZKW.zzZ(this.zzYjI.zzY9i(), zz2J.class);
        if (zz2j == null || zz2j.zzZTe() == null) {
            return;
        }
        zz2C zz2c = new zz2C();
        for (zz2F zz2f : zz2j.zzZTe()) {
            if (zz2f.zzZvh() != 2 && zz2f.zzZvh() != 1 && zz2f.zzZvh() != 6) {
                zz2c.zzZ(zz2f);
            }
        }
        if (zz2c.getCount() == 0) {
            zz2c = null;
        }
        zz2j.zzZ(zz2c);
    }

    public int getType() {
        return this.zzYjI.getMarkupLanguage() == 0 ? zzYbC() : zzYbB();
    }

    public boolean getVisible() {
        return this.zzYjI.zzY9h().getShadowEnabled();
    }

    public void setType(int i) {
        clear();
        byte markupLanguage = this.zzYjI.getMarkupLanguage();
        if (markupLanguage == 0) {
            zzmp(i);
        } else {
            if (markupLanguage != 1) {
                return;
            }
            zzmn(i);
        }
    }
}
