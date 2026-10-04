package com.aspose.words;

import com.miui.penengine.p596e.C18773h;
import com.orion.penkit.tools.DrawToolFactory;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes6.dex */
final class zzY2Q {
    private static com.aspose.words.internal.zzD3<zz6U> zzWX8 = new com.aspose.words.internal.zzD3<>();
    private int zzWX9;
    private long zzWXa = 0;
    private long[] zzWXb;
    private zzYM6 zzWXc;
    private ShapeBase zzWXd;

    static {
        zzZ(zzX(new String[]{"adj"}, new String[]{"val 29287"}), 10);
        zzZ(zzX(new String[]{"adj"}, new String[]{"val 38250"}), 58);
        zzZ(zzX(new String[]{"adj"}, new String[]{"val 50000"}), 5);
        zzZ(zzX(new String[]{"adj1"}, new String[]{"val 50000"}), 34);
        zzZ(zzX(new String[]{"adj"}, new String[]{"val 50000"}), 184);
        zzZ(zzX(new String[]{"adj1"}, new String[]{"val 0"}), 38);
        zzZ(zzX(new String[]{"adj"}, new String[]{"val 37500"}), 92);
        zzZ(zzX(new String[]{"adj"}, new String[]{"val 4653"}), 96);
        zzZ(zzX(new String[]{"adj"}, new String[]{"val 16667"}), 185);
        zzZ(zzX(new String[]{"adj", "vf"}, new String[]{"val 25000", "val 115470"}), 9);
        zzZ(zzX(new String[]{"adj1", "adj2"}, new String[]{"val 50000", "val 50000"}), 35);
        zzZ(zzX(new String[]{"adj1", "adj2"}, new String[]{"val 0", "val 0"}), 39);
        zzZ(zzX(new String[]{"adj1", "adj2"}, new String[]{"val 13005", "val 0"}), 64);
        zzZ(zzX(new String[]{"adj1", "adj2"}, new String[]{"val 6500", "val 0"}), 188);
        zzZ(zzX(new String[]{"adj1", "adj2", "adj3"}, new String[]{"val -41667", "val 66667", "val 16667"}), 17);
        zzZ(zzX(new String[]{"adj1", "adj2", "adj3"}, new String[]{"val 50000", "val 50000", "val 50000"}), 36);
        zzZ(zzX(new String[]{"adj1", "adj2", "adj3"}, new String[]{"val 0", "val 0", "val 0"}), 40);
        zzZ(zzX(new String[]{"adj1", "adj2", "adj3"}, new String[]{"val -43750", "val 70000", "val 16667"}), 62);
        zz6U zz6uZzX = zzX(new String[]{"adj"}, new String[]{"val 8333"});
        zzZ(zz6uZzX, 85);
        zzZ(zz6uZzX, 86);
        zzZ(zz6uZzX, 186);
        zz6U zz6uZzX2 = zzX(new String[]{"adj"}, new String[]{"val 12500"});
        zzZ(zz6uZzX2, 57);
        zzZ(zz6uZzX2, 65);
        zzZ(zz6uZzX2, 84);
        zzZ(zz6uZzX2, 97);
        zzZ(zz6uZzX2, 98);
        zzZ(zz6uZzX2, 187);
        zz6U zz6uZzX3 = zzX(new String[]{"adj"}, new String[]{"val 37500"});
        zzZ(zz6uZzX3, 60);
        zzZ(zz6uZzX3, 59);
        zzZ(zz6uZzX3, 18);
        zz6U zz6uZzX4 = zzX(new String[]{"adj"}, new String[]{"val 16667"});
        zzZ(zz6uZzX4, 2);
        zzZ(zz6uZzX4, 21);
        zz6U zz6uZzX5 = zzX(new String[]{"adj"}, new String[]{"val 25000"});
        zzZ(zz6uZzX5, 7);
        zzZ(zz6uZzX5, 11);
        zzZ(zz6uZzX5, 15);
        zzZ(zz6uZzX5, 16);
        zzZ(zz6uZzX5, 22);
        zzZ(zz6uZzX5, 23);
        zzZ(zz6uZzX5, 55);
        zzZ(zz6uZzX5, 183);
        zz6U zz6uZzX6 = zzX(new String[]{"adj1", "adj2"}, new String[]{"val -43750", "val 70000"});
        zzZ(zz6uZzX6, 61);
        zzZ(zz6uZzX6, 63);
        zzZ(zz6uZzX6, 106);
        zz6U zz6uZzX7 = zzX(new String[]{"adj1", "adj2"}, new String[]{"val 8333", "val 50000"});
        zzZ(zz6uZzX7, 87);
        zzZ(zz6uZzX7, 88);
        zz6U zz6uZzX8 = zzX(new String[]{"adj1", "adj2"}, new String[]{"val 12500", "val 50000"});
        zzZ(zz6uZzX8, 53);
        zzZ(zz6uZzX8, 54);
        zz6U zz6uZzX9 = zzX(new String[]{"adj1", "adj2"}, new String[]{"val 50000", "val 20000"});
        zzZ(zz6uZzX9, 69);
        zzZ(zz6uZzX9, 70);
        zz6U zz6uZzX10 = zzX(new String[]{"adj1", "adj2"}, new String[]{"val 50000", "val 25000"});
        zzZ(zz6uZzX10, 13);
        zzZ(zz6uZzX10, 66);
        zzZ(zz6uZzX10, 67);
        zzZ(zz6uZzX10, 68);
        zzZ(zz6uZzX10, 93);
        zzZ(zz6uZzX10, 94);
        zzZ(zz6uZzX10, 14);
        zz6U zz6uZzX11 = zzX(new String[]{"adj1", "adj2", "adj3"}, new String[]{"val 25000", "val 50000", "val 12500"});
        zzZ(zz6uZzX11, 107);
        zzZ(zz6uZzX11, 108);
        zz6U zz6uZzX12 = zzX(new String[]{"adj1", "adj2", "adj3"}, new String[]{"val 20000", "val 40000", "val 33333"});
        zzZ(zz6uZzX12, 102);
        zzZ(zz6uZzX12, 103);
        zzZ(zz6uZzX12, 104);
        zzZ(zz6uZzX12, 105);
        zz6U zz6uZzX13 = zzX(new String[]{"adj1", "adj2", "adj3", "adj4"}, new String[]{"val 25000", "val 25000", "val 12500", "val 50000"});
        zzZ(zz6uZzX13, 81);
        zzZ(zz6uZzX13, 82);
        zz6U zz6uZzX14 = zzX(new String[]{"adj1", "adj2", "adj3", "adj4"}, new String[]{"val 18750", "val -8333", "val 112500", "val -38333"});
        zzZ(zz6uZzX14, 41);
        zzZ(zz6uZzX14, 44);
        zzZ(zz6uZzX14, 47);
        zzZ(zz6uZzX14, 50);
        zz6U zz6uZzX15 = zzX(new String[]{"adj1", "adj2", "adj3", "adj4"}, new String[]{"val 18750", "val -8333", "val 112500", "val -8333"});
        zzZ(zz6uZzX15, 178);
        zzZ(zz6uZzX15, 179);
        zzZ(zz6uZzX15, 180);
        zzZ(zz6uZzX15, 181);
        zz6U zz6uZzX16 = zzX(new String[]{"adj1", "adj2", "adj3", "adj4"}, new String[]{"val 25000", "val 25000", "val 16667", "val 66667"});
        zzZ(zz6uZzX16, 77);
        zzZ(zz6uZzX16, 78);
        zzZ(zz6uZzX16, 79);
        zzZ(zz6uZzX16, 80);
        zz6U zz6uZzX17 = zzX(new String[]{"adj1", "adj2", "adj3", "adj4", "adj5", "adj6"}, new String[]{"val 18750", "val -8333", "val 18750", "val -16667", "val 112500", "val -46667"});
        zzZ(zz6uZzX17, 42);
        zzZ(zz6uZzX17, 45);
        zzZ(zz6uZzX17, 48);
        zzZ(zz6uZzX17, 51);
        zz6U zz6uZzX18 = zzX(new String[]{"adj1", "adj2", "adj3", "adj4", "adj5", "adj6", "adj7", "adj8"}, new String[]{"val 18750", "val 108333", "val 18750", "val 116667", "val 100000", "val 116667", "val 112963", "val 108333"});
        zzZ(zz6uZzX18, 43);
        zzZ(zz6uZzX18, 46);
        zzZ(zz6uZzX18, 49);
        zzZ(zz6uZzX18, 52);
        zz6U zz6uZzX19 = zzX(new String[]{"adj"}, new String[]{"val 50000"});
        zzZ(zz6uZzX19, 24);
        zzZ(zz6uZzX19, 26);
        zzZ(zz6uZzX19, 136);
        zzZ(zz6uZzX19, 138);
        zzZ(zz6uZzX19, 139);
        zz6U zz6uZzX20 = zzX(new String[]{"adj"}, new String[]{"val 14287"});
        zzZ(zz6uZzX20, 27);
        zzZ(zz6uZzX20, 30);
        zz6U zz6uZzX21 = zzX(new String[]{"adj"}, new String[]{"val 22222"});
        zzZ(zz6uZzX21, 25);
        zzZ(zz6uZzX21, 137);
        zz6U zz6uZzX22 = zzX(new String[]{"adj1", "adj2"}, new String[]{"val 13005", "val 0"});
        zzZ(zz6uZzX22, 28);
        zzZ(zz6uZzX22, 156);
        zzZ(zz6uZzX22, 157);
        zz6U zz6uZzX23 = zzX(new String[]{"adj1", "adj2"}, new String[]{"val 10800000", "val 50000"});
        zzZ(zz6uZzX23, 29);
        zzZ(zz6uZzX23, 148);
        zzZ(zz6uZzX23, 151);
        zz6U zz6uZzX24 = zzX(new String[]{"adj"}, new String[]{"val 10800000"});
        zzZ(zz6uZzX24, 31);
        zzZ(zz6uZzX24, 144);
        zzZ(zz6uZzX24, 147);
        zzZ(zzX(new String[]{"adj"}, new String[]{"val 25000"}), 140);
        zzZ(zzX(new String[]{"adj"}, new String[]{"val 75000"}), 141);
        zz6U zz6uZzX25 = zzX(new String[]{"adj"}, new String[]{"val 62500"});
        zzZ(zz6uZzX25, 142);
        zzZ(zz6uZzX25, 143);
        zzZ(zzX(new String[]{"adj"}, new String[]{"val 0"}), 145);
        zzZ(zzX(new String[]{"adj1", "adj2"}, new String[]{"val 10823886", "val 50000"}), 150);
        zzZ(zzX(new String[]{"adj"}, new String[]{"val 45977"}), 152);
        zzZ(zzX(new String[]{"adj"}, new String[]{"val 43477"}), 153);
        zz6U zz6uZzX26 = zzX(new String[]{"adj"}, new String[]{"val 44444"});
        zzZ(zz6uZzX26, 154);
        zzZ(zz6uZzX26, 155);
        zzZ(zz6uZzX26, 173);
        zz6U zz6uZzX27 = zzX(new String[]{"adj1", "adj2"}, new String[]{"val 6500", "val 0"});
        zzZ(zz6uZzX27, 158);
        zzZ(zz6uZzX27, 159);
        zzZ(zzX(new String[]{"adj"}, new String[]{"val 13634"}), 160);
        zzZ(zzX(new String[]{"adj"}, new String[]{"val 18750"}), 161);
        zzZ(zzX(new String[]{"adj"}, new String[]{"val 68083"}), 162);
        zzZ(zzX(new String[]{"adj"}, new String[]{"val 53125"}), 163);
        zzZ(zzX(new String[]{"adj"}, new String[]{"val 31917"}), 164);
        zzZ(zzX(new String[]{"adj"}, new String[]{"val 46875"}), 165);
        zz6U zz6uZzX28 = zzX(new String[]{"adj"}, new String[]{"val 28028"});
        zzZ(zz6uZzX28, 166);
        zzZ(zz6uZzX28, 167);
        zz6U zz6uZzX29 = zzX(new String[]{"adj"}, new String[]{"val 33333"});
        zzZ(zz6uZzX29, 168);
        zzZ(zz6uZzX29, 169);
        zzZ(zz6uZzX29, 170);
        zzZ(zz6uZzX29, 171);
        zzZ(zzX(new String[]{"adj"}, new String[]{"val 55556"}), 172);
        zzZ(zzX(new String[]{"adj"}, new String[]{"val 85713"}), 174);
        zzZ(zzX(new String[]{"adj"}, new String[]{"val 14287"}), 175);
        zzZ(zzX(new String[]{"adj"}, new String[]{"val 10823886"}), 146);
        zzZ(zzX(new String[]{"adj1", "adj2"}, new String[]{"val 0", "val 50000"}), 149);
    }

    private zzY2Q(ShapeBase shapeBase) {
        this.zzWXd = shapeBase;
    }

    private int getCurrentIndex() {
        int i = this.zzWX9;
        long[] jArr = this.zzWXb;
        if (i > jArr.length - 1) {
            this.zzWX9 = jArr.length - 1;
        }
        if (this.zzWX9 < 0) {
            this.zzWX9 = 0;
        }
        return this.zzWX9;
    }

    private static zzYM4 zzR(double d, double d2, double d3, double d4) {
        zzYM4 zzym4 = new zzYM4();
        zzym4.zzXFi = new zzYM2(com.aspose.words.internal.zzAN.zzZG(d2));
        zzym4.zzXFj = new zzYM2(com.aspose.words.internal.zzAN.zzZG(d));
        zzym4.zzXFh = new zzYM2(com.aspose.words.internal.zzAN.zzZG(d3));
        zzym4.zzXFg = new zzYM2(com.aspose.words.internal.zzAN.zzZG(d4));
        return zzym4;
    }

    private void zzW(zz45 zz45Var) {
        for (int i = 0; i < this.zzWXc.zzYnK(); i++) {
            this.zzWXa = zzXTj();
            zzJH zzjh = new zzJH(Float.intBitsToFloat((int) r1), com.aspose.words.internal.zzZPY.zzYC(this.zzWXa));
            this.zzWXa = zzXTj();
            zzJH zzjh2 = new zzJH(Float.intBitsToFloat((int) r1), com.aspose.words.internal.zzZPY.zzYC(this.zzWXa));
            this.zzWXa = zzXTj();
            zz45Var.zzZ(new zzAZ(new zzJH[]{zzjh, zzjh2, new zzJH(Float.intBitsToFloat((int) r1), com.aspose.words.internal.zzZPY.zzYC(this.zzWXa))}));
        }
    }

    private void zzX(zz45 zz45Var) {
        zz57 zz57Var = new zz57();
        this.zzWXa = zzXTj();
        zz57Var.zzY(new zzJH(Float.intBitsToFloat((int) r1), com.aspose.words.internal.zzZPY.zzYC(this.zzWXa)));
        zz45Var.zzZ(zz57Var);
    }

    private long zzXTj() {
        long j = this.zzWXb[getCurrentIndex()];
        this.zzWX9 = getCurrentIndex() + 1;
        return j;
    }

    private zz45 zzXTk() {
        zz45 zz45Var = new zz45();
        zz45Var.zzY1(5);
        zz45Var.setWidth(((Integer) this.zzWXd.fetchShapeAttr(4127)).intValue());
        zz45Var.setHeight(((Integer) this.zzWXd.fetchShapeAttr(4128)).intValue());
        return zz45Var;
    }

    private boolean zzXTl() {
        int shapeType = this.zzWXd.getShapeType();
        if (shapeType != 0 && shapeType != 8 && shapeType != 19 && shapeType != 74 && shapeType != 76 && shapeType != 83 && shapeType != 95 && shapeType != 182) {
            switch (shapeType) {
                default:
                    switch (shapeType) {
                        case 99:
                        case 100:
                        case 101:
                            break;
                        default:
                            return zzY6(this.zzWXd) && !zziq(this.zzWXd.getShapeType());
                    }
                case 89:
                case 90:
                case 91:
                    return true;
            }
        }
        return true;
    }

    private zz7H zzXTm() throws Exception {
        if (!((Shape) this.zzWXd).hasImage()) {
            return null;
        }
        zzYM5[] zzym5Arr = (zzYM5[]) this.zzWXd.fetchShapeAttr(StyleIdentifier.LIST_TABLE_2_ACCENT_2);
        zzZLU[] zzzluArr = (zzZLU[]) this.zzWXd.fetchShapeAttr(StyleIdentifier.LIST_TABLE_7_COLORFUL_ACCENT_2);
        if ((zzym5Arr != null && zzym5Arr.length > 0) || (zzzluArr != null && zzzluArr.length > 0)) {
            zzY1Z.zzZ(this.zzWXd.getDocument().getWarningCallback(), 1, 4, "Unsupported geometry of the custom shape with image.");
            return null;
        }
        zz7H zz7h = new zz7H();
        zz7h.zzOB(DrawToolFactory.LASSO_TYPE_RECT);
        return zz7h;
    }

    private zz7H zzXTn() throws Exception {
        if (!zzXTl()) {
            zz7H zz7hZzOA = zz7G.zzOA(zz84.zzIi(this.zzWXd.getShapeType()));
            if (zz7hZzOA != null && !this.zzWXd.isWordArt()) {
                zzZ(this.zzWXd, zz7hZzOA.zzZAP());
            }
            return zz7hZzOA;
        }
        zzYM6[] zzym6Arr = (zzYM6[]) this.zzWXd.fetchShapeAttr(StyleIdentifier.LIST_TABLE_5_DARK);
        int[] iArrZzA = zzZLG.zzA((Shape) this.zzWXd);
        long[] jArrZzZ = zzZLG.zzZ((zzYM5[]) this.zzWXd.fetchShapeAttr(StyleIdentifier.LIST_TABLE_4), iArrZzA);
        this.zzWXb = jArrZzZ;
        if (zzym6Arr == null || jArrZzZ == null) {
            return zzXTm();
        }
        zz7H zz7h = new zz7H();
        zz45 zz45VarZzXTk = zzXTk();
        for (zzYM6 zzym6 : zzym6Arr) {
            this.zzWXc = zzym6;
            int iZzYnL = zzym6.zzYnL();
            if (iZzYnL != -1) {
                if (iZzYnL == 0) {
                    zzY(zz45VarZzXTk);
                } else if (iZzYnL == 1) {
                    zzW(zz45VarZzXTk);
                } else if (iZzYnL == 2) {
                    zzX(zz45VarZzXTk);
                } else if (iZzYnL == 3) {
                    zz45VarZzXTk.zzZ(new zzC4());
                } else if (iZzYnL != 4) {
                    switch (iZzYnL) {
                        case 160:
                        case 169:
                        case 172:
                        case 173:
                        case 174:
                        case 175:
                        case 176:
                        case 177:
                        case 178:
                        case 179:
                        case 180:
                        case 181:
                        case 182:
                            break;
                        case 161:
                            zzZ(zz45VarZzXTk, true);
                            break;
                        case 162:
                            zzZ(zz45VarZzXTk, false);
                            break;
                        case 163:
                            zzZ(zz45VarZzXTk, 1, true);
                            break;
                        case 164:
                            zzZ(zz45VarZzXTk, 1, false);
                            break;
                        case 165:
                            zzZ(zz45VarZzXTk, 0, true);
                            break;
                        case 166:
                            zzZ(zz45VarZzXTk, 0, false);
                            break;
                        case 167:
                            zzY(zz45VarZzXTk, true);
                            break;
                        case 168:
                            zzY(zz45VarZzXTk, false);
                            break;
                        case 170:
                            zz45VarZzXTk.zzY1(4);
                            break;
                        case 171:
                            zz45VarZzXTk.zzWR(false);
                            break;
                        default:
                            throw new IllegalArgumentException("Specified argument was out of the range of valid values.\r\nParameter name: pathInfo");
                    }
                } else {
                    zz7h.zzZ(zz45VarZzXTk);
                    zz45VarZzXTk = zzXTk();
                }
            }
        }
        zzZ((zzYM4[]) this.zzWXd.fetchShapeAttr(StyleIdentifier.LIST_TABLE_1_LIGHT_ACCENT_3), iArrZzA, zz7h);
        return zz7h;
    }

    private void zzY(zz45 zz45Var) {
        for (int i = 0; i < this.zzWXc.zzYnK(); i++) {
            zz5T zz5t = new zz5T();
            this.zzWXa = zzXTj();
            zz5t.zzY(new zzJH(Float.intBitsToFloat((int) r2), com.aspose.words.internal.zzZPY.zzYC(this.zzWXa)));
            zz45Var.zzZ(zz5t);
        }
    }

    private static boolean zzY6(ShapeBase shapeBase) {
        for (int i = 0; i <= 9; i++) {
            if (shapeBase.zzYvW().contains(i + StyleIdentifier.LIST_TABLE_6_COLORFUL)) {
                return true;
            }
        }
        return false;
    }

    public static void zzY7(ShapeBase shapeBase) throws Exception {
        if (!shapeBase.isGroup()) {
            Shape shape = (Shape) shapeBase;
            if (shape.hasImage() && shape.getImageData().getBorders().getLeft().isVisible()) {
                ((zz2J) shapeBase.zzY9i()).getOutline().zzo(0.0d, ((double) ((int) ((zz2J) shapeBase.zzY9i()).getOutline().zzZxH())) / 12700.0d);
                return;
            }
        }
        zzZ(shapeBase, 0, 0, 0, 0);
    }

    public static zz7H zzY8(ShapeBase shapeBase) throws Exception {
        return new zzY2Q(shapeBase).zzXTn();
    }

    private void zzZ(zzYM4[] zzym4Arr, int[] iArr, zz7H zz7h) {
        if (zzym4Arr == null || zzym4Arr.length <= 0) {
            zz7h.zzZ(new zz0Y("0", "0", "r", "b"));
            return;
        }
        zzYM4 zzym4ZzZ = zzZ(zzym4Arr, iArr);
        zzY2T zzy2t = new zzY2T((Shape) this.zzWXd, zzY2T.zzZ(zz7h.zzZAP()));
        zz7h.zzZ(new zz0Y(zzZ(zzy2t, zz7h, zzym4ZzZ.zzXFj, true), zzZ(zzy2t, zz7h, zzym4ZzZ.zzXFi, false), zzZ(zzy2t, zz7h, zzym4ZzZ.zzXFh, true), zzZ(zzy2t, zz7h, zzym4ZzZ.zzXFg, false)));
    }

    private static boolean zziq(int i) {
        return zzit(i) || zzis(i) || zzir(i);
    }

    private static boolean zzir(int i) {
        switch (i) {
            case 189:
            case 190:
            case 191:
            case 192:
            case 193:
            case 194:
            case 195:
            case 196:
            case 197:
            case 198:
            case 199:
            case 200:
                return true;
            default:
                return false;
        }
    }

    private static boolean zzis(int i) {
        if (i == 2 || i == 5 || i == 7 || i == 16 || i == 57 || i == 106 || i == 188 || i == 21 || i == 22) {
            return true;
        }
        switch (i) {
            case 9:
            case 10:
            case 11:
                return true;
            default:
                switch (i) {
                    case 33:
                    case 34:
                    case 35:
                    case 36:
                    case 37:
                    case 38:
                    case 39:
                    case 40:
                        return true;
                    default:
                        switch (i) {
                            case 61:
                            case 62:
                            case 63:
                            case 64:
                                return true;
                            default:
                                switch (i) {
                                    case 84:
                                    case 85:
                                    case 86:
                                    case 87:
                                    case 88:
                                        return true;
                                    default:
                                        switch (i) {
                                            case 96:
                                            case 97:
                                            case 98:
                                                return true;
                                            default:
                                                switch (i) {
                                                    case 183:
                                                    case 184:
                                                    case 185:
                                                    case 186:
                                                        return true;
                                                    default:
                                                        return false;
                                                }
                                        }
                                }
                        }
                }
        }
    }

    private static boolean zzit(int i) {
        switch (i) {
            case 41:
            case 42:
            case 43:
            case 44:
            case 45:
            case 46:
            case 47:
            case 48:
            case 49:
            case 50:
            case 51:
            case 52:
                return true;
            default:
                switch (i) {
                    case 178:
                    case 179:
                    case 180:
                    case 181:
                        return true;
                    default:
                        return false;
                }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0098 A[PHI: r9
      0x0098: PHI (r9v13 float) = (r9v8 float), (r9v6 float), (r9v14 float) binds: [B:29:0x00ef, B:17:0x00b3, B:11:0x0097] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private void zzX(zz45 zz45Var, boolean z) {
        long jZzG;
        long jZzG2 = com.aspose.words.internal.zzZPY.zzG((int) Float.intBitsToFloat((int) this.zzWXa), (int) com.aspose.words.internal.zzZPY.zzYC(this.zzWXa));
        this.zzWXa = zzXTj();
        long jZzG3 = com.aspose.words.internal.zzZPY.zzG((int) Float.intBitsToFloat((int) r4), (int) com.aspose.words.internal.zzZPY.zzYC(this.zzWXa));
        int i = (int) jZzG3;
        int i2 = (int) jZzG2;
        float fAbs = Math.abs(Float.intBitsToFloat(i) - Float.intBitsToFloat(i2));
        float fAbs2 = Math.abs(com.aspose.words.internal.zzZPY.zzYC(jZzG3) - com.aspose.words.internal.zzZPY.zzYC(jZzG2));
        if (z) {
            jZzG = com.aspose.words.internal.zzZPY.zzG(Float.intBitsToFloat(i2) - fAbs, com.aspose.words.internal.zzZPY.zzYC(jZzG3) - fAbs2);
        } else {
            jZzG = com.aspose.words.internal.zzZPY.zzG(Float.intBitsToFloat(i) - fAbs, com.aspose.words.internal.zzZPY.zzYC(jZzG2) - fAbs2);
        }
        long jZzG4 = com.aspose.words.internal.zzZPW.zzG(fAbs * 2.0f, fAbs2 * 2.0f);
        float f = 180.0f;
        float f2 = -90.0f;
        if (Float.intBitsToFloat(i2) >= Float.intBitsToFloat(i) || com.aspose.words.internal.zzZPY.zzYC(jZzG2) >= com.aspose.words.internal.zzZPY.zzYC(jZzG3)) {
            if (Float.intBitsToFloat(i2) >= Float.intBitsToFloat(i) || com.aspose.words.internal.zzZPY.zzYC(jZzG2) <= com.aspose.words.internal.zzZPY.zzYC(jZzG3)) {
                f = 0.0f;
                if (Float.intBitsToFloat(i2) <= Float.intBitsToFloat(i) || com.aspose.words.internal.zzZPY.zzYC(jZzG2) <= com.aspose.words.internal.zzZPY.zzYC(jZzG3)) {
                    if (Float.intBitsToFloat(i2) <= Float.intBitsToFloat(i) || com.aspose.words.internal.zzZPY.zzYC(jZzG2) >= com.aspose.words.internal.zzZPY.zzYC(jZzG3)) {
                        zz45Var.zzZ(new zz5T(new zzJH(Float.intBitsToFloat(i), com.aspose.words.internal.zzZPY.zzYC(jZzG3))));
                        return;
                    } else if (z) {
                        f = 270.0f;
                    } else {
                        f2 = 90.0f;
                    }
                } else if (z) {
                    f = 90.0f;
                    f2 = 90.0f;
                }
            } else if (z) {
                f = 90.0f;
            }
        } else if (z) {
            f = 270.0f;
            f2 = 90.0f;
        }
        com.aspose.words.internal.zzQ5 zzq5 = new com.aspose.words.internal.zzQ5();
        zzq5.zzA(jZzG);
        zzq5.setSize(jZzG4);
        zzq5.zz6(f);
        zzq5.zz5(f2);
        zzZ(zzq5, zz45Var);
    }

    private void zzY(zz45 zz45Var, boolean z) {
        for (int i = 0; i < this.zzWXc.zzYnK(); i++) {
            zzX(zz45Var, z);
            z = !z;
        }
    }

    private static void zzY(ShapeBase shapeBase, zz6U zz6u) {
        int shapeType = shapeBase.getShapeType();
        if (zzY6(shapeBase)) {
            if (zzit(shapeType)) {
                zzZ(shapeBase, zz6u, true);
                return;
            }
            if (!zzis(shapeType) && !shapeBase.isWordArt()) {
                if (zzir(shapeType)) {
                    zz6u.zzZA2().clear();
                    return;
                }
                return;
            }
            zzZ(shapeBase, zz6u, false);
        }
    }

    private zzYM4 zzZ(zzYM4[] zzym4Arr, int[] iArr) {
        Shape shape = (Shape) this.zzWXd;
        int layoutFlow = shape.getTextBox().getLayoutFlow();
        boolean z = layoutFlow == 0 || layoutFlow == 4;
        int length = zzym4Arr.length;
        if (length == 1) {
            return zzym4Arr[0];
        }
        if (length == 2) {
            return z ? zzym4Arr[0] : zzym4Arr[1];
        }
        if (length != 3 && length != 6) {
            return zzR(0.0d, 0.0d, 21600.0d, 21600.0d);
        }
        com.aspose.words.internal.zzZQ4 zzzq4ZzY = zzZLG.zzY(shape, iArr);
        return zzR(zzzq4ZzY.zzZm(), zzzq4ZzY.zzZo(), zzzq4ZzY.zzkw(), zzzq4ZzY.zzZn());
    }

    private String zzZ(zzY2T zzy2t, zz7H zz7h, zzYM2 zzym2, boolean z) {
        String strZzX;
        zzZLU[] zzzluArrZzYbo = ((Shape) this.zzWXd).zzYbo();
        if (zzym2.zzYnC() && zzzluArrZzYbo != null) {
            zzZ(zzy2t.zziy(zzym2.getValue()), zz7h);
            if (zzy2t.zzXTB().zzVE(zzym2.getValue())) {
                strZzX = zzY2T.zzix(zzy2t.zzXTB().get(zzym2.getValue()));
            } else {
                strZzX = "21600";
            }
        } else {
            strZzX = com.aspose.words.internal.zzJB.zzX(zzym2.zzYnC() ? 21600 : zzym2.getValue(), 0);
        }
        String str = z ? "w" : C18773h.f57233c;
        String strZzix = zzY2T.zzix(zzy2t.zzXTC());
        zz7h.zzZAP().zzO(strZzix, com.aspose.words.internal.zzZKN.format("*/ {0} {1} 21600", strZzX, str), false);
        return strZzix;
    }

    private static void zzZ(com.aspose.words.internal.zzZYV<zz7M> zzzyv, zz7H zz7h) {
        for (int i = 0; i < zzzyv.getCount(); i++) {
            int iZzT3 = zzzyv.zzT3(i);
            zz7h.zzZAP().zzZA1().add(new zz6W(zzY2T.zzix(iZzT3), zzzyv.get(iZzT3), false));
        }
    }

    private void zzZ(zz45 zz45Var, boolean z) {
        int iZzYnK = this.zzWXc.zzYnK() / 3;
        long jZzPW = this.zzWXa;
        boolean z2 = z;
        for (int i = 0; i < iZzYnK; i++) {
            this.zzWXa = zzXTj();
            long jZzG = com.aspose.words.internal.zzZPY.zzG((int) Float.intBitsToFloat((int) r8), (int) com.aspose.words.internal.zzZPY.zzYC(this.zzWXa));
            this.zzWXa = zzXTj();
            long jZzG2 = com.aspose.words.internal.zzZPY.zzG((int) Float.intBitsToFloat((int) r10), (int) com.aspose.words.internal.zzZPY.zzYC(this.zzWXa));
            this.zzWXa = zzXTj();
            long jZzG3 = com.aspose.words.internal.zzZPY.zzG((int) Float.intBitsToFloat((int) r12), (int) com.aspose.words.internal.zzZPY.zzYC(this.zzWXa));
            com.aspose.words.internal.zzQ5 zzq5 = new com.aspose.words.internal.zzQ5();
            long j = jZzPW;
            zzq5.zz6(360.0f - (Float.intBitsToFloat((int) jZzG3) / 65536.0f));
            zzq5.zz5((-com.aspose.words.internal.zzZPY.zzYC(jZzG3)) / 65536.0f);
            int i2 = (int) jZzG2;
            zzq5.setSize(com.aspose.words.internal.zzZPW.zzG(Float.intBitsToFloat(i2) * 2.0f, com.aspose.words.internal.zzZPY.zzYC(jZzG2) * 2.0f));
            zzq5.zzA(com.aspose.words.internal.zzZPY.zzG(Float.intBitsToFloat((int) jZzG) - Float.intBitsToFloat(i2), com.aspose.words.internal.zzZPY.zzYC(jZzG) - com.aspose.words.internal.zzZPY.zzYC(jZzG2)));
            if (z2 || i > 0) {
                zzZ(zz45Var, zzq5, j);
                z2 = false;
            }
            jZzPW = zzq5.zzPW();
            zzZ(zzq5, zz45Var);
        }
    }

    private static zz6U zzX(String[] strArr, String[] strArr2) {
        zz6U zz6u = new zz6U();
        if (strArr.length == strArr2.length) {
            for (int i = 0; i < strArr.length; i++) {
                zz6u.zzP(strArr[i], strArr2[i], false);
            }
        }
        return zz6u;
    }

    private void zzZ(zz45 zz45Var, int i, boolean z) {
        int iZzYnK = this.zzWXc.zzYnK() / 4;
        long jZzPW = this.zzWXa;
        boolean z2 = z;
        for (int i2 = 0; i2 < iZzYnK; i2++) {
            long jZzXTj = zzXTj();
            this.zzWXa = jZzXTj;
            int iIntBitsToFloat = (int) Float.intBitsToFloat((int) jZzXTj);
            int iZzYC = (int) com.aspose.words.internal.zzZPY.zzYC(this.zzWXa);
            long jZzXTj2 = zzXTj();
            this.zzWXa = jZzXTj2;
            int iIntBitsToFloat2 = (int) Float.intBitsToFloat((int) jZzXTj2);
            int iZzYC2 = (int) com.aspose.words.internal.zzZPY.zzYC(this.zzWXa);
            this.zzWXa = zzXTj();
            long jZzG = com.aspose.words.internal.zzZPY.zzG((int) Float.intBitsToFloat((int) r12), (int) com.aspose.words.internal.zzZPY.zzYC(this.zzWXa));
            this.zzWXa = zzXTj();
            com.aspose.words.internal.zzQ5 zzq5ZzZ = com.aspose.words.internal.zzQ4.zzZ(com.aspose.words.internal.zzZQ4.zzX(iIntBitsToFloat, iZzYC, iIntBitsToFloat2, iZzYC2), jZzG, com.aspose.words.internal.zzZPY.zzG((int) Float.intBitsToFloat((int) r12), (int) com.aspose.words.internal.zzZPY.zzYC(this.zzWXa)), i);
            if (z2 || i2 > 0) {
                zzZ(zz45Var, zzq5ZzZ, jZzPW);
                z2 = false;
            }
            jZzPW = zzq5ZzZ.zzPW();
            zzZ(zzq5ZzZ, zz45Var);
        }
    }

    private static void zzZ(com.aspose.words.internal.zzQ5 zzq5, zz45 zz45Var) {
        com.aspose.words.internal.zzQ2 zzq2ZzPV = zzq5.zzPV();
        for (int i = 0; i < zzq2ZzPV.getCount(); i++) {
            com.aspose.words.internal.zzPZ zzpz = new com.aspose.words.internal.zzPZ(zzq2ZzPV, i);
            if (zz45Var.zzZx3().size() == 0) {
                zz57 zz57Var = new zz57();
                zz57Var.zzY(new zzJH((int) Float.intBitsToFloat((int) zzpz.zzPX()), (int) com.aspose.words.internal.zzZPY.zzYC(zzpz.zzPX())));
                zz45Var.zzZ(zz57Var);
            }
            zz45Var.zzZ(new zzAZ(new zzJH[]{new zzJH((int) Float.intBitsToFloat((int) zzpz.zzPL()), (int) com.aspose.words.internal.zzZPY.zzYC(zzpz.zzPL())), new zzJH((int) Float.intBitsToFloat((int) zzpz.zzPK()), (int) com.aspose.words.internal.zzZPY.zzYC(zzpz.zzPK())), new zzJH((int) Float.intBitsToFloat((int) zzpz.zzPW()), (int) com.aspose.words.internal.zzZPY.zzYC(zzpz.zzPW()))}));
        }
    }

    public static void zzZ(ShapeBase shapeBase, zz6U zz6u) {
        if (zzWX8.zzVE(shapeBase.getShapeType())) {
            zz6U zz6u2 = zzWX8.get(shapeBase.getShapeType());
            if (zz6u2.zzZA2().size() > 0) {
                zz6u.zzZA2().clear();
                for (zz6W zz6w : zz6u2.zzZA2()) {
                    zz6u.zzP(zz6w.getName(), zz6w.zzZA6().getSource(), zz6w.zzZA5());
                }
            }
        }
        zzY(shapeBase, zz6u);
    }

    public static void zzZ(Shape shape, int i, double d, double d2, double d3, double d4, double d5, double d6, double d7, zzHK zzhk) {
        com.aspose.words.internal.zzZQ4 zzzq4 = new com.aspose.words.internal.zzZQ4(0.0f, 0.0f, com.aspose.words.internal.zzSA.zzp(shape.getWidth()), com.aspose.words.internal.zzSA.zzp(shape.getHeight()));
        float width = (((float) d) + 0.5f) * zzzq4.getWidth();
        float height = (((float) d2) + 0.5f) * zzzq4.getHeight();
        com.aspose.words.internal.zzP9 zzp9 = new com.aspose.words.internal.zzP9();
        zzp9.zzY((-width) - zzzq4.getX(), (-height) - zzzq4.getY(), 1);
        zzp9.zzZ(new com.aspose.words.internal.zzP9((float) d3, (float) d4, (float) d5, (float) d6, 0.0f, 0.0f), 1);
        zzp9.zzY(zzzq4.getX() + width + ((float) (Math.cos(zzhk.zzZQR()) * d7)), zzzq4.getY() + height + ((float) (Math.sin(zzhk.zzZQR()) * d7)), 1);
        com.aspose.words.internal.zzZQ4 zzzq4ZzZ = com.aspose.words.internal.zzJ6.zzZ(zzzq4, zzp9);
        int iMax = Math.max((int) (zzzq4.zzZm() - zzzq4ZzZ.zzZm()), 0);
        int iMax2 = Math.max((int) (zzzq4.zzZo() - zzzq4ZzZ.zzZo()), 0);
        int iMax3 = Math.max((int) (zzzq4ZzZ.zzkw() - zzzq4.zzkw()), 0);
        int iMax4 = Math.max((int) (zzzq4ZzZ.zzZn() - zzzq4.zzZn()), 0);
        if (i == 1 || i == 5) {
            iMax = Math.max(iMax, iMax3);
            iMax2 = Math.max(iMax2, iMax4);
            iMax3 = iMax;
            iMax4 = iMax2;
        }
        zzZ(shape, iMax, iMax3, iMax2, iMax4);
    }

    private static void zzZ(ShapeBase shapeBase, int i, int i2, int i3, int i4) {
        zzYC3 zzyc3ZzYvW = shapeBase.zzYvW();
        int iIntValue = ((Integer) zzyc3ZzYvW.zzPj(4143)).intValue();
        int iIntValue2 = ((Integer) zzyc3ZzYvW.zzPj(4145)).intValue();
        int iIntValue3 = ((Integer) zzyc3ZzYvW.zzPj(4144)).intValue();
        int iIntValue4 = ((Integer) zzyc3ZzYvW.zzPj(4146)).intValue();
        zzyc3ZzYvW.zzQ(4143, Integer.valueOf(iIntValue + i));
        zzyc3ZzYvW.zzQ(4145, Integer.valueOf(iIntValue2 + i2));
        zzyc3ZzYvW.zzQ(4144, Integer.valueOf(iIntValue3 + i3));
        zzyc3ZzYvW.zzQ(4146, Integer.valueOf(iIntValue4 + i4));
    }

    private static void zzZ(ShapeBase shapeBase, zz6U zz6u, boolean z) {
        ArrayList arrayList = new ArrayList();
        for (zz6W zz6w : zz6u.zzZA2()) {
            if (!zz6w.zzZA5()) {
                com.aspose.words.internal.zzZQG.zzZ((ArrayList<zz6W>) arrayList, zz6w);
            }
        }
        zz6u.zzZA2().clear();
        for (int i = 0; i < arrayList.size(); i++) {
            zz6W zz6w2 = (zz6W) arrayList.get(i);
            int size = (z ? arrayList.size() - (i + 1) : i) + StyleIdentifier.LIST_TABLE_6_COLORFUL;
            int iIntValue = ((Integer) shapeBase.fetchShapeAttr(size)).intValue();
            zzYC3 zzyc3Zzm2 = zzYBW.zzm2(shapeBase.getShapeType());
            zz6u.zzP(zz6w2.getName(), com.aspose.words.internal.zzZKN.format("val {0}", Integer.valueOf((int) com.aspose.words.internal.zzZKQ.zzZa((((double) iIntValue) * 4.62962963d) + ((double) (com.aspose.words.internal.zzJB.zzZo(com.aspose.words.internal.zzZKN.zzR(zz6w2.zzZA6().getSource(), ControlChar.SPACE_CHAR)[1]) - ((zzyc3Zzm2 == null || !zzyc3Zzm2.contains(size)) ? 0 : (int) (((double) ((Integer) zzyc3Zzm2.get(size)).intValue()) * 4.62962963d))))))), zz6w2.zzZA5());
        }
    }

    private static void zzZ(zz45 zz45Var, com.aspose.words.internal.zzQ5 zzq5, long j) {
        long jZzPX = zzq5.zzPX();
        if (Float.intBitsToFloat((int) jZzPX) == Float.intBitsToFloat((int) j) && com.aspose.words.internal.zzZPY.zzYC(jZzPX) == com.aspose.words.internal.zzZPY.zzYC(j)) {
            return;
        }
        zz5T zz5t = new zz5T();
        zz5t.zzY(new zzJH((int) Float.intBitsToFloat(r5), (int) com.aspose.words.internal.zzZPY.zzYC(jZzPX)));
        zz45Var.zzZ(zz5t);
    }

    private static void zzZ(zz6U zz6u, int i) {
        zzWX8.add(i, zz6u);
    }
}
