package com.aspose.words;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes6.dex */
final class zz52 {
    private zz6G zzZ19;

    private zz52() {
    }

    private void zzL(zz2O zz2o) {
        if (this.zzZ19.zzZzP()) {
            return;
        }
        zz11 zz11Var = new zz11();
        zz10 zz10VarZzZtK = zz11Var.zzZtK();
        zz10VarZzZtK.zzGN(1);
        zz10VarZzZtK.zzWI(true);
        zz10VarZzZtK.zzZtI().zzH9(1);
        zz2o.zzZAk().zzX(zz11Var);
    }

    private static void zzM(zz2O zz2o) {
        zz2o.zzZAk().zzZCZ().zzY(new zz4A());
        zz2o.zzZAk().zzZCZ().zzZtK().zzZtI().zzH9(0);
    }

    private void zzN(zz2O zz2o) throws Exception {
        if (((Document) this.zzZ19.getShape().getDocument()).getTheme() == null) {
            ((Document) this.zzZ19.getShape().getDocument()).zzY(new zzZXV().zzZmw());
        }
        int i = (this.zzZ19.zzZzJ() || this.zzZ19.zzZzP()) ? 1 : 0;
        zz5U zz5u = new zz5U();
        zz5u.zzIU(i != 0 ? 1 : 2);
        zz5u.zzZ(zzS(4, i != 0 ? -1.0d : 0.5d));
        zz7U zz7u = new zz7U();
        zz7u.zzIU(i ^ 1);
        zz7u.zzZ(zzS(4, -1.0d));
        zz8A zz8a = new zz8A();
        zz8a.zzIU(0);
        zz8a.zzZ(zzS(4, -1.0d));
        zz7O zz7o = new zz7O();
        zz7o.zzI8(1);
        zz7o.zzZ(zzS(i != 0 ? 12 : 1, -1.0d));
        zz1K zz1k = new zz1K();
        zz1k.zzZ(zz5u);
        zz1k.zzZ(zz7u);
        zz1k.zzZ(zz8a);
        zz1k.zzZ(zz7o);
        zz2o.zzZ(zz1k);
        if (this.zzZ19.zzZzK()) {
            if (this.zzZ19.zzSq()) {
                zzM(zz2o);
                return;
            }
            zzYMX zzymx = new zzYMX();
            zzymx.setAlignment(1);
            this.zzZ19.getShape().getChildNodes(0, false).add(new Paragraph(this.zzZ19.getShape().getDocument(), zzymx, new zzYEF()));
        }
    }

    private void zzO(zz2O zz2o) throws Exception {
        zzN(zz2o);
        zz2o.getOutline().zzZ(new zz12());
        zz2o.getOutline().zzZxA().setType(1);
    }

    public static zz2O zzP(zz6G zz6g) {
        return new zz2O(zz6g.zzSq() ? 0 : 8);
    }

    private void zzQ(zz2O zz2o) throws Exception {
        int iZzZzL = this.zzZ19.zzZzL();
        switch (iZzZzL) {
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
            case 13:
            case 14:
            case 15:
            case 16:
            case 17:
            case 18:
            case 19:
            case 20:
            case 21:
            case 22:
            case 23:
                break;
            default:
                switch (iZzZzL) {
                    case 32:
                        zzO(zz2o);
                        return;
                    case 33:
                    case 34:
                    case 35:
                    case 36:
                    case 37:
                    case 38:
                    case 39:
                    case 40:
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
                    case 53:
                    case 54:
                    case 55:
                    case 56:
                    case 57:
                    case 58:
                    case 59:
                    case 60:
                    case 61:
                    case 62:
                    case 63:
                    case 64:
                    case 65:
                    case 66:
                    case 67:
                    case 68:
                    case 69:
                    case 70:
                    case 71:
                    case 72:
                    case 73:
                    case 74:
                        break;
                    default:
                        switch (iZzZzL) {
                            case 76:
                            case 77:
                            case 78:
                            case 79:
                            case 80:
                            case 81:
                            case 82:
                            case 83:
                            case 84:
                            case 85:
                            case 86:
                            case 87:
                            case 88:
                            case 89:
                            case 90:
                            case 91:
                            case 92:
                            case 93:
                            case 94:
                            case 95:
                            case 96:
                            case 97:
                            case 98:
                            case 99:
                                break;
                            default:
                                switch (iZzZzL) {
                                    case 101:
                                    case 102:
                                    case 103:
                                    case 104:
                                    case 105:
                                    case 106:
                                    case 107:
                                    case 108:
                                    case 109:
                                    case 110:
                                    case 111:
                                    case 112:
                                    case 113:
                                    case 114:
                                    case 115:
                                    case 116:
                                    case 117:
                                    case 118:
                                    case 119:
                                    case 120:
                                    case 121:
                                    case 122:
                                    case 123:
                                    case 124:
                                    case 125:
                                    case 126:
                                    case 127:
                                    case 128:
                                    case 129:
                                    case 130:
                                    case 131:
                                    case 132:
                                    case 133:
                                    case 134:
                                    case 135:
                                        break;
                                    default:
                                        switch (iZzZzL) {
                                            case 176:
                                            case 177:
                                            case 178:
                                            case 179:
                                            case 180:
                                            case 181:
                                            case 182:
                                            case 183:
                                            case 184:
                                            case 185:
                                            case 186:
                                            case 187:
                                            case 188:
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
                                                break;
                                            default:
                                                switch (iZzZzL) {
                                                    case 202:
                                                        zzP(zz2o);
                                                        break;
                                                    case 203:
                                                    case 204:
                                                    case 205:
                                                    case 206:
                                                    case 207:
                                                    case 208:
                                                    case 209:
                                                    case 210:
                                                    case 211:
                                                    case 212:
                                                    case 213:
                                                    case 214:
                                                    case 215:
                                                    case 216:
                                                    case 217:
                                                    case 218:
                                                    case 219:
                                                    case 220:
                                                    case 221:
                                                    case 222:
                                                    case 223:
                                                    case 224:
                                                    case 225:
                                                    case 226:
                                                    case 227:
                                                    case 228:
                                                    case 229:
                                                    case 230:
                                                    case 231:
                                                    case 232:
                                                    case 233:
                                                    case 234:
                                                    case 235:
                                                    case 236:
                                                    case 237:
                                                    case 238:
                                                    case 239:
                                                    case 240:
                                                    case 241:
                                                    case 242:
                                                    case 243:
                                                    case 244:
                                                    case 245:
                                                    case 246:
                                                        break;
                                                    default:
                                                        zzN(zz2o);
                                                        zzY1Z.zzZ(this.zzZ19.getShape().getDocument().getWarningCallback(), WarningType.MINOR_FORMATTING_LOSS_CATEGORY, 2, "Specified shape type is invalid and was replaced with rectangle.");
                                                        break;
                                                }
                                                return;
                                        }
                                        break;
                                }
                                break;
                        }
                        break;
                }
                break;
        }
        zzN(zz2o);
    }

    private static zz2Q zzS(int i, double d) {
        zz2Q zz2q = new zz2Q();
        zz2q.setValue(i);
        if (!com.aspose.words.internal.zzAN.zzZD(d) && d <= 0.0d) {
            return zz2q;
        }
        ArrayList<zzZCM> arrayList = new ArrayList<>();
        arrayList.add(new zz2P(d));
        zz2q.zze(arrayList);
        return zz2q;
    }

    private zz2O zzZy9() {
        zz2O zz2oZzP = zzP(this.zzZ19);
        zz2oZzP.zzZ(zz7G.zzOA(zz84.zzIi(this.zzZ19.zzZzL())));
        zz2oZzP.zzZ(this.zzZ19.zzZzP() ? new zz4R() : new zz4M());
        zz2oZzP.zzZyc().zzZ(this.zzZ19.zzZzP() ? new zzC2() : new zzBX());
        zz0J zz0j = new zz0J();
        if (!this.zzZ19.zzZzP()) {
            zz11 zz11Var = new zz11();
            zz11Var.zzZtK().zzGN(1);
            zz11Var.zzZtK().zzWI(true);
            zz11Var.zzZtK().zzZtI().zzH9(1);
            zz0j.zzX(zz11Var);
        }
        zz2oZzP.zzY(zz0j);
        return zz2oZzP;
    }

    private void zzZya() {
        if (this.zzZ19.zzSq()) {
            Shape shape = this.zzZ19.getShape();
            float fZzp = com.aspose.words.internal.zzSA.zzp(this.zzZ19.zzZzO());
            float fZzp2 = com.aspose.words.internal.zzSA.zzp(this.zzZ19.zzZzN());
            shape.zzm7(1);
            shape.zzXh(com.aspose.words.internal.zzZPY.zzG(((float) shape.getLeft()) / fZzp, ((float) shape.getTop()) / fZzp2));
            shape.zzXg(com.aspose.words.internal.zzZPY.zzG(((float) (shape.getWidth() + shape.getLeft())) / fZzp, ((float) (shape.getHeight() + shape.getTop())) / fZzp2));
        }
    }

    public final void zzUQ() throws Exception {
        zz2O zz2oZzZy9 = zzZy9();
        this.zzZ19.getShape().zzU(zz2oZzZy9);
        zz2oZzZy9.setName(com.aspose.words.internal.zzZKN.format("{0} {1}", ShapeType.toString(this.zzZ19.zzZzL()), Integer.valueOf(this.zzZ19.getShape().getId())));
        zzL(zz2oZzZy9);
        if (this.zzZ19.zzZzM() || this.zzZ19.zzSq()) {
            zz6X zz6x = new zz6X();
            zz6x.setWidth(com.aspose.words.internal.zzSA.zzp(this.zzZ19.getWidth()));
            zz6x.setHeight(com.aspose.words.internal.zzSA.zzp(this.zzZ19.getHeight()));
            if (this.zzZ19.getShape().zzYvW().contains(4130)) {
                zz6x.zzV(com.aspose.words.internal.zzSA.zzp(this.zzZ19.getShape().getTop()));
            }
            if (this.zzZ19.getShape().zzYvW().contains(4129)) {
                zz6x.zzW(com.aspose.words.internal.zzSA.zzp(this.zzZ19.getShape().getLeft()));
            }
            zz2oZzZy9.zzZ(zz6x);
            zzZya();
        } else {
            this.zzZ19.getShape().zzWf(this.zzZ19.getWidth());
            this.zzZ19.getShape().zzWe(this.zzZ19.getHeight());
        }
        zz6H.zzZ(this.zzZ19);
        zzQ(zz2oZzZy9);
    }

    public zz52(zz6G zz6g) {
        this.zzZ19 = zz6g;
    }

    private void zzP(zz2O zz2o) {
        ((zzBX) zz2o.zzZyc().zzZxW()).zzXt(true);
        zz2o.zzZAk().zzZCZ().zzZtK().zzGN(0);
        zz2o.setFill(new zz1C(zzS(1, -1.0d)));
        zz2o.getFill().zzZ(this.zzZ19.getShape());
        zz2o.getOutline().setFill(new zz1C(new zz3H("black")));
        zz2o.getOutline().zzXK(6350.0d);
        zz2o.getOutline().getFill().zzZ(this.zzZ19.getShape());
        if (this.zzZ19.zzZzL() == 202) {
            if (this.zzZ19.zzSq()) {
                zzM(zz2o);
            } else {
                this.zzZ19.getShape().getChildNodes(0, false).add(new Paragraph(this.zzZ19.getShape().getDocument()));
            }
        }
    }
}
