package com.aspose.words;

import com.aspose.slides.C22218Oooo;
import com.huawei.hms.network.embedded.C18358t1;
import java.util.Iterator;

/* JADX INFO: loaded from: classes6.dex */
final class zzYGS extends zzYHQ {
    private static final com.aspose.words.internal.zzZHW zzUR = new com.aspose.words.internal.zzZHW("\\pnlvl", "\\ls", "\\pnhang", "\\pnlcltr", "\\pnucltr", "\\pnucrm", "\\pnlcrm", "\\pndec", "\\pnlvlbody", "\\pnlvlcont", "\\pnlvlblt", "\\pnstart", "\\pnf", "\\pncf", "\\pnindent", "\\pnsp", "\\pnprev", "\\pnql", "\\pnqc", "\\pnqr");
    private int zzKF;
    private ListLevel zzYo4;
    private int zzYw;

    public zzYGS(zzYFT zzyft) {
        super(zzyft);
    }

    private ListCollection getLists() {
        return this.zzXw4.getDocument().getLists();
    }

    private static boolean zzX(ListLevel listLevel, ListLevel listLevel2) {
        return listLevel.getLegacy() == listLevel2.getLegacy() && listLevel.getNumberStyle() == listLevel2.getNumberStyle() && com.aspose.words.internal.zzZKN.equals(listLevel.getNumberFormat(), listLevel2.getNumberFormat()) && listLevel.zzYO5() == listLevel2.zzYO5();
    }

    private boolean zzYi1() {
        return zzYiN().getType() == 118 || zzYiN().getType() == 268;
    }

    private void zzYi2() {
        if (zzYiN().getType() == 268) {
            ListLevel listLevel = this.zzXw4.zzYg9().zzYOP().get(this.zzYw - 1);
            zzY(this.zzYo4, listLevel);
            listLevel.zzUI(true);
            return;
        }
        List listZzoI = zzoI(1);
        if (listZzoI == null) {
            zzZ4J zzz4jZzX = this.zzXw4.zzYg9().zzX(getDocument(), getLists().zzYP3());
            getLists().zzZ(zzz4jZzX);
            List list = new List(zzz4jZzX, getLists().zzYP2());
            getLists().zzQ(list);
            listZzoI = list;
        }
        zzZYj().zzQ(EditingLanguage.KASHMIRI_ARABIC, Integer.valueOf(listZzoI.getListId()));
        zzZYj().zzQ(EditingLanguage.GALICIAN, Integer.valueOf(this.zzYw - 1));
    }

    private void zzYi3() {
        List listZzoI = zzoI(0);
        if (listZzoI == null || !zzX(listZzoI.zzYPa().zzYOP().get(0), this.zzYo4)) {
            zzZ4J zzz4j = new zzZ4J(getDocument(), getLists().zzYP3(), 0, 0);
            getLists().zzZ(zzz4j);
            zzY(this.zzYo4, zzz4j.zzYOP().get(0));
            zzz4j.zzYOP().get(0).zzUI(true);
            List list = new List(zzz4j, getLists().zzYP2());
            getLists().zzQ(list);
            listZzoI = list;
        }
        zzZYj().zzQ(EditingLanguage.KASHMIRI_ARABIC, Integer.valueOf(listZzoI.getListId()));
        zzZYj().zzQ(EditingLanguage.GALICIAN, 0);
    }

    private void zzYi4() {
        List list;
        zzZ4J zzz4j;
        Iterator<zzZ4J> it = getLists().zzYOX().iterator();
        while (true) {
            list = null;
            if (!it.hasNext()) {
                zzz4j = null;
                break;
            } else {
                zzz4j = it.next();
                if (zzz4j.zzYP8() == -2) {
                    break;
                }
            }
        }
        if (zzz4j == null) {
            zzz4j = new zzZ4J(getDocument(), -2, 0, 0);
            getLists().zzZ(zzz4j);
            ListLevel listLevel = zzz4j.zzYOP().get(0);
            listLevel.setNumberStyle(23);
            listLevel.setNumberFormat(C18358t1.g.f56183c);
            listLevel.setStartAt(0);
        }
        Iterator<List> it2 = getLists().iterator();
        while (true) {
            if (!it2.hasNext()) {
                break;
            }
            List next = it2.next();
            if (next.zzYPa().zzYP8() == zzz4j.zzYP8() && zzX(next.zzxw(0), this.zzYo4)) {
                list = next;
                break;
            }
        }
        if (list == null) {
            list = new List(zzz4j, getLists().zzYP2());
            getLists().zzQ(list);
            zzZ4B zzz4b = new zzZ4B(this.zzXw4.getDocument(), 0);
            list.zzYPb().zzZ(zzz4b);
            zzz4b.zzYbW = true;
            zzY(this.zzYo4, zzz4b.getListLevel());
            zzz4b.getListLevel().setStartAt(this.zzYo4.getStartAt());
            zzz4b.getListLevel().zzUI(true);
        }
        zzZYj().zzQ(EditingLanguage.KASHMIRI_ARABIC, Integer.valueOf(list.getListId()));
        zzZYj().zzQ(EditingLanguage.GALICIAN, 0);
    }

    private zzYMX zzZYj() {
        zzYH3 zzyh3ZzYiL = zzYiL();
        while (zzyh3ZzYiL.zzYih() != null) {
            if (!zzyh3ZzYiL.zzYig()) {
                return zzyh3ZzYiL.zzYih().zzZYj();
            }
            zzyh3ZzYiL = zzyh3ZzYiL.zzYih();
        }
        return zzyh3ZzYiL.zzZYj();
    }

    private List zzoI(int i) {
        Paragraph lastParagraph;
        int nodeType = this.zzXw4.zzYiM().getContainer().getNodeType();
        if (nodeType == 3) {
            lastParagraph = ((Body) this.zzXw4.zzYiM().getContainer()).getLastParagraph();
        } else if (nodeType == 7) {
            lastParagraph = ((Cell) this.zzXw4.zzYiM().getContainer()).getLastParagraph();
        } else {
            if (nodeType != 8) {
                return null;
            }
            lastParagraph = (Paragraph) this.zzXw4.zzYiM().getContainer().zztC(8);
        }
        while (lastParagraph != null) {
            if (lastParagraph.zzZYj().zzZ0C() != 12) {
                if (lastParagraph.zzZYj().getListId() <= 0) {
                    break;
                }
                List listByListId = getLists().getListByListId(lastParagraph.zzZYj().getListId());
                if (listByListId.zzYPa().zzYOR() == i) {
                    return listByListId;
                }
                lastParagraph = (Paragraph) lastParagraph.zztC(8);
            } else {
                lastParagraph = (Paragraph) lastParagraph.zztC(8);
            }
        }
        return null;
    }

    private void zzoJ(int i) {
        if (i < 0) {
            this.zzKF = 2;
            this.zzYw = 1;
            return;
        }
        if (i == 0) {
            this.zzKF = 5;
            return;
        }
        if (i > 0 && i <= 9) {
            this.zzKF = 2;
            this.zzYw = i;
            return;
        }
        if (i == 10) {
            this.zzKF = 1;
            this.zzYw = 1;
        } else if (i == 11) {
            this.zzKF = 0;
        } else if (i == 12) {
            this.zzKF = 3;
        } else {
            this.zzKF = 2;
            this.zzYw = 9;
        }
    }

    @Override // com.aspose.words.zzYHQ
    public final void zzT(zzYET zzyet) throws Exception {
        if (zzYi1()) {
            switch (zzUR.zzTP(zzyet.getName())) {
                case 0:
                    zzoJ(zzyet.zzYeT());
                    break;
                case 1:
                    this.zzKF = 4;
                    break;
                case 2:
                    this.zzYo4.zzZYj().zzwb(-this.zzYo4.zzYO5());
                    break;
                case 3:
                case 4:
                case 5:
                case 6:
                case 7:
                    this.zzYo4.setNumberStyle(zzYG5.zzC2(zzyet.getName()));
                    this.zzYo4.setNumberFormat(com.aspose.words.internal.zzZKN.format("{0}", Character.valueOf((char) (this.zzYw - 1))));
                    break;
                case 8:
                    zzZYj().zzQ(EditingLanguage.GALICIAN, 0);
                    break;
                case 9:
                    this.zzKF = 3;
                    break;
                case 10:
                    this.zzKF = 0;
                    this.zzYo4.setNumberStyle(23);
                    break;
                case 11:
                    int iZzYeT = zzyet.zzYeT();
                    this.zzYo4.setStartAt(ListLevel.zzx9(iZzYeT) ? iZzYeT : 1);
                    break;
                case 12:
                    this.zzYo4.zzZYh().zzBp(this.zzXw4.zzom(zzyet.zzYeT()));
                    break;
                case 13:
                    this.zzYo4.zzZYh().zzQ(160, this.zzXw4.zzYgw().zzp0(zzyet.zzYeT()));
                    break;
                case 14:
                    this.zzYo4.zzx0(zzyet.zzYeT());
                    this.zzYo4.zzZYj().zzwa(this.zzYo4.zzYO5() * this.zzYw);
                    break;
                case 15:
                    this.zzYo4.zzx1(zzyet.zzYeT());
                    break;
                case 16:
                    this.zzYo4.zzUH(zzyet.zzYeY());
                    break;
                case 17:
                    this.zzYo4.setAlignment(0);
                    break;
                case 18:
                    this.zzYo4.setAlignment(1);
                    break;
                case 19:
                    this.zzYo4.setAlignment(2);
                    break;
                default:
                    zzO(zzyet);
                    break;
            }
        }
    }

    @Override // com.aspose.words.zzYHQ
    public final void zzY(zzYET zzyet) {
        String strZzZH = com.aspose.words.internal.zzJF.zzZK(this.zzYo4.zzZYh().getNameAscii()) ? com.aspose.words.internal.zzJF.zzZH(com.aspose.words.internal.zzZO0.zzQz(1252).zzZn(com.aspose.words.internal.zzZO0.zzQz(this.zzXw4.getCodePage()).getBytes(zzyet.zzYR()))) : zzyet.zzYR();
        int type = zzYiN().getType();
        if (type == 119) {
            ListLevel listLevel = this.zzYo4;
            StringBuilder sbOooO0OO = C22218Oooo.OooO0OO(strZzZH);
            sbOooO0OO.append(this.zzYo4.getNumberFormat());
            listLevel.setNumberFormat(sbOooO0OO.toString());
            return;
        }
        if (type != 120) {
            return;
        }
        this.zzYo4.setNumberFormat(this.zzYo4.getNumberFormat() + strZzZH);
    }

    @Override // com.aspose.words.zzYHQ
    public final void zzYjb() {
        if (zzYi1()) {
            int i = this.zzKF;
            if (i == 0) {
                zzYi4();
                return;
            }
            if (i == 1) {
                zzYi3();
                return;
            }
            if (i == 2) {
                zzYi2();
            } else {
                if (i != 3) {
                    return;
                }
                zzZYj().zzQ(EditingLanguage.KASHMIRI_ARABIC, 0);
                zzZYj().zzQ(EditingLanguage.GALICIAN, 12);
            }
        }
    }

    @Override // com.aspose.words.zzYHQ
    public final void zzZ(zzYET zzyet) throws Exception {
        if (zzYi1()) {
            this.zzYw = 1;
            ListLevel listLevel = new ListLevel(getDocument(), 0);
            this.zzYo4 = listLevel;
            listLevel.setStartAt(0);
            this.zzKF = 1;
            this.zzYo4.zzUI(true);
            this.zzYo4.zzZYh().zzBp(zzYEF.zzYdx());
            if (zzYiN().getType() == 268 && "\\pnseclvl".equals(zzyet.getName())) {
                this.zzKF = 2;
                this.zzYw = zzyet.zzYeT();
            }
        }
    }

    @Override // com.aspose.words.zzYHQ
    public final zzYHQ zzZ(zzYHP zzyhp) {
        int type = zzyhp.getType();
        if (type == 119 || type == 120) {
            return this;
        }
        return null;
    }

    private static void zzY(ListLevel listLevel, ListLevel listLevel2) {
        listLevel2.setNumberStyle(listLevel.getNumberStyle());
        listLevel2.setNumberFormat(listLevel.getNumberFormat());
        listLevel2.zzx0(listLevel.zzYO5());
        listLevel2.setStartAt(listLevel.getStartAt());
        listLevel.zzZYh().zzX(listLevel2.zzZYh(), 230);
        listLevel.zzZYh().zzX(listLevel2.zzZYh(), 240);
        listLevel.zzZYj().zzX(listLevel2.zzZYj(), EditingLanguage.CENTRAL_KURDISH_IRAQ);
        listLevel.zzZYj().zzX(listLevel2.zzZYj(), 1160);
    }
}
