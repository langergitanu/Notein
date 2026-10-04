package com.aspose.words;

import java.util.Iterator;

/* JADX INFO: loaded from: classes6.dex */
final class zzYGF extends zzYHS implements zzZ9H {
    private static final com.aspose.words.internal.zzZHW zzUR = new com.aspose.words.internal.zzZHW("\\mjc", "\\maln");
    private zzZ0O zzXuA;
    private int zzXuB;
    private zzYFN zzXw5;

    public zzYGF(zzYFT zzyft) {
        super(zzyft);
        this.zzXw5 = new zzYFN(zzyft, this);
    }

    private int zzYhP() {
        return this.zzXw4.zzYgo().zzYiL().zzYiN().getType();
    }

    private zzZ0J zzZsL() {
        if (zzYiM().getContainer() instanceof OfficeMath) {
            return ((OfficeMath) zzYiM().getContainer()).zzZsL();
        }
        return null;
    }

    private static int zze(zzYET zzyet) {
        int iZzZo = com.aspose.words.internal.zzJB.zzZo(zzyet.zzYR());
        if (iZzZo < 0) {
            return 0;
        }
        if (iZzZo > 4) {
            return 4;
        }
        return iZzZo;
    }

    private void zzf(zzYET zzyet) {
        int mathObjectType = zzZsL().getMathObjectType();
        if (mathObjectType == 9) {
            zzZ((zzZ0G) zzZsL(), zzyet);
        } else {
            if (mathObjectType != 19) {
                throw new IllegalStateException("Unexpected MathObject type for MathSpace.");
            }
            zzZ((zzZ07) zzZsL(), zzyet);
        }
    }

    private void zzg(zzYET zzyet) {
        int mathObjectType = zzZsL().getMathObjectType();
        if (mathObjectType == 2) {
            zzZ((zzZ0I) zzZsL(), zzyet);
        } else if (mathObjectType == 15) {
            zzZ((zzZ09) zzZsL(), zzyet);
        } else {
            if (mathObjectType != 21) {
                throw new IllegalStateException("Unexpected MathObject type for MathChar.");
            }
            zzZ((zzZ04) zzZsL(), zzyet);
        }
    }

    private void zzh(zzYET zzyet) {
        int mathObjectType = zzZsL().getMathObjectType();
        if (mathObjectType == 9) {
            zzZ((zzZ0G) zzZsL(), zzyet);
        } else {
            if (mathObjectType != 19) {
                throw new IllegalStateException("Unexpected MathObject type for MathBaseJustification.");
            }
            zzZ((zzZ07) zzZsL(), zzyet);
        }
    }

    private void zzi(zzYET zzyet) {
        int mathObjectType = zzZsL().getMathObjectType();
        if (mathObjectType == 3) {
            zzZ((zzZ0F) zzZsL(), zzyet);
        } else {
            if (mathObjectType != 15) {
                throw new IllegalStateException("Unexpected MathObject type for MathPosition.");
            }
            zzZ((zzZ09) zzZsL(), zzyet);
        }
    }

    private void zzj(zzYET zzyet) {
        int mathObjectType = zzZsL().getMathObjectType();
        if (mathObjectType == 6) {
            zzZ((zzZ0C) zzZsL(), zzyet);
        } else {
            if (mathObjectType != 21) {
                throw new IllegalStateException("Unexpected MathObject type for MathGrow.");
            }
            zzZ((zzZ04) zzZsL(), zzyet);
        }
    }

    private void zzk(zzYET zzyet) {
        int iZzYhP = zzYhP();
        if (iZzYhP == 191) {
            this.zzXuB = com.aspose.words.internal.zzJB.zzZo(zzyet.zzYR());
        } else {
            if (iZzYhP != 192) {
                return;
            }
            this.zzXuA.setHorizontalAlignment(zzY8T.zzHz(zzyet.zzYR()));
        }
    }

    private void zzl(zzYET zzyet) throws Exception {
        if (this.zzXw4.zzYgo().zzYih().zzYiN().getType() != 195) {
            throw new IllegalStateException("Unexpected token for MathRunProperty.");
        }
        this.zzXw5.zzX(zzyet);
    }

    private void zzm(zzYET zzyet) throws Exception {
        if (zzZsL().getMathObjectType() == 5) {
            zzZ((zzZ0D) zzZsL(), zzyet);
        } else {
            if (this.zzXw4.zzYgo().zzYih().zzYiN().getType() != 195) {
                throw new IllegalStateException("Unexpected MathObject type for MathLineBreak.");
            }
            zzl(zzyet);
        }
    }

    private static char zzn(zzYET zzyet) {
        String strZzYR = zzyet.zzYR();
        if (strZzYR.length() > 0) {
            return strZzYR.charAt(0);
        }
        return (char) 0;
    }

    private static boolean zzo(zzYET zzyet) {
        return "on".equals(zzyet.zzYR());
    }

    @Override // com.aspose.words.zzYHS, com.aspose.words.zzYHQ
    public final void zzT(zzYET zzyet) throws Exception {
        int iZzTP = zzUR.zzTP(zzyet.getName());
        if (iZzTP == 0) {
            zzZ02 zzz02 = (zzZ02) com.aspose.words.internal.zzZKW.zzZ(zzZsL(), zzZ02.class);
            if (zzz02 != null) {
                zzz02.setJustification(zzyet.zzYeT());
                return;
            }
            return;
        }
        if (iZzTP == 1) {
            zzZ0D zzz0d = (zzZ0D) com.aspose.words.internal.zzZKW.zzZ(zzZsL(), zzZ0D.class);
            if (zzz0d != null) {
                zzz0d.zzT7(true);
                return;
            }
            return;
        }
        if (zzYhP() != 188) {
            super.zzT(zzyet);
        } else {
            if (this.zzXw5.zzX(zzyet)) {
                return;
            }
            zzO(zzyet);
        }
    }

    @Override // com.aspose.words.zzYHS, com.aspose.words.zzYHQ
    public final void zzY(zzYET zzyet) throws Exception {
        int type = zzYiN().getType();
        if (type == 163) {
            zzZ((zzZ0B) zzZsL(), zzyet);
            return;
        }
        if (type == 182) {
            zzZ((zzYZZ) zzZsL(), zzyet);
            return;
        }
        if (type == 186) {
            zzZ((zzYZY) zzZsL(), zzyet);
            return;
        }
        if (type == 166) {
            zzi(zzyet);
            return;
        }
        if (type == 167) {
            zzZ((zzZ09) zzZsL(), zzyet);
            return;
        }
        if (type == 191 || type == 192) {
            zzk(zzyet);
            return;
        }
        switch (type) {
            case 143:
            case 144:
            case 145:
            case 146:
            case 147:
            case 148:
            case 149:
            case 150:
                zzZ((zzZ0E) zzZsL(), zzyet);
                break;
            default:
                switch (type) {
                    case 152:
                    case 153:
                    case 154:
                    case 155:
                        zzZ((zzZ0C) zzZsL(), zzyet);
                        break;
                    default:
                        switch (type) {
                            case 157:
                            case 158:
                                zzZ((zzZ0G) zzZsL(), zzyet);
                                break;
                            case 159:
                            case 160:
                                zzf(zzyet);
                                break;
                            case 161:
                                zzh(zzyet);
                                break;
                            default:
                                switch (type) {
                                    case 171:
                                    case 172:
                                    case 173:
                                    case 174:
                                        zzZ((zzZ07) zzZsL(), zzyet);
                                        break;
                                    default:
                                        switch (type) {
                                            case 176:
                                            case 177:
                                            case 178:
                                                zzZ((zzZ04) zzZsL(), zzyet);
                                                break;
                                            case 179:
                                                zzg(zzyet);
                                                break;
                                            case 180:
                                                zzj(zzyet);
                                                break;
                                            default:
                                                switch (type) {
                                                    case 201:
                                                    case 202:
                                                    case 203:
                                                        zzZ((zzZ0D) zzZsL(), zzyet);
                                                        break;
                                                    case 204:
                                                        zzm(zzyet);
                                                        break;
                                                    case 205:
                                                        zzl(zzyet);
                                                        break;
                                                    case 206:
                                                        zzZ((zzZ0H) zzZsL(), zzyet);
                                                        break;
                                                    default:
                                                        switch (type) {
                                                            case 218:
                                                            case 219:
                                                            case 220:
                                                            case 221:
                                                            case 222:
                                                                zzZ((zzZ01) zzZsL(), zzyet);
                                                                break;
                                                            default:
                                                                super.zzY(zzyet);
                                                                break;
                                                        }
                                                        break;
                                                }
                                                break;
                                        }
                                        break;
                                }
                                break;
                        }
                        break;
                }
                break;
        }
    }

    @Override // com.aspose.words.zzYHS, com.aspose.words.zzYHQ
    public final void zzYjb() throws Exception {
        int iZzYhP = zzYhP();
        if (iZzYhP == 194) {
            ((zzZ07) zzZsL()).zzYEI().zzZ(this.zzXuA, this.zzXuB);
            return;
        }
        if (iZzYhP != 195) {
            super.zzYjb();
            return;
        }
        Iterator<T> it = zzYiM().getContainer().getChildNodes(0, false).iterator();
        while (it.hasNext()) {
            Run run = (Run) com.aspose.words.internal.zzZKW.zzZ((Node) it.next(), Run.class);
            if (run != null) {
                run.zzZYh().zzBp(getDocument().zzZpV().zzYVd.zzYEt());
            }
        }
    }

    @Override // com.aspose.words.zzYHS, com.aspose.words.zzYHQ
    public final void zzZ(zzYET zzyet) throws Exception {
        if (zzYhP() != 194) {
            super.zzZ(zzyet);
        } else {
            this.zzXuB = 1;
            this.zzXuA = new zzZ0O();
        }
    }

    @Override // com.aspose.words.zzZ9H
    public final zzYEF zzZYh() {
        return zzYiM().getContainer() instanceof OfficeMath ? ((OfficeMath) zzYiM().getContainer()).zzZYh() : new zzYEF();
    }

    @Override // com.aspose.words.zzZ9H
    public final zzYMX zzZYj() {
        return new zzYMX();
    }

    @Override // com.aspose.words.zzYHS, com.aspose.words.zzYHQ
    public final zzYHQ zzZ(zzYHP zzyhp) throws Exception {
        return (137 >= zzyhp.getType() || zzyhp.getType() >= 230) ? super.zzZ(zzyhp) : this;
    }

    private void zzZ(zzZ01 zzz01, zzYET zzyet) {
        boolean zZzo = zzo(zzyet);
        switch (zzYhP()) {
            case 218:
                zzz01.zzSY(zZzo);
                break;
            case 219:
                zzz01.zzSX(zZzo);
                break;
            case 220:
                zzz01.zzSW(zZzo);
                break;
            case 221:
                zzz01.zzSV(zZzo);
                break;
            case 222:
                zzz01.zzSU(zZzo);
                break;
        }
    }

    private void zzZ(zzZ0B zzz0b, zzYET zzyet) {
        if (zzYhP() != 163) {
            return;
        }
        zzz0b.zzux(zzZXP.zzN5(zzyet.zzYR()));
    }

    private void zzZ(zzZ0D zzz0d, zzYET zzyet) {
        switch (zzYhP()) {
            case 201:
                zzz0d.zzT6(zzo(zzyet));
                break;
            case 202:
                zzz0d.zzT5(zzo(zzyet));
                break;
            case 203:
                zzz0d.zzT4(zzo(zzyet));
                break;
            case 204:
                zzZ0V zzz0v = new zzZ0V();
                zzz0v.setAlignment(com.aspose.words.internal.zzJB.zzZo(zzyet.zzYR()));
                zzz0d.zzZ(zzz0v);
                break;
        }
    }

    private void zzZ(zzYZZ zzyzz, zzYET zzyet) {
        if (zzYhP() != 182) {
            return;
        }
        zzyzz.zzST(zzo(zzyet));
    }

    private void zzZ(zzZ0E zzz0e, zzYET zzyet) {
        boolean zZzo = zzo(zzyet);
        switch (zzYhP()) {
            case 143:
                zzz0e.zzTf(zZzo);
                break;
            case 144:
                zzz0e.zzTd(zZzo);
                break;
            case 145:
                zzz0e.zzTc(zZzo);
                break;
            case 146:
                zzz0e.zzTe(zZzo);
                break;
            case 147:
                zzz0e.zzTb(zZzo);
                break;
            case 148:
                zzz0e.zzTa(zZzo);
                break;
            case 149:
                zzz0e.zzT8(zZzo);
                break;
            case 150:
                zzz0e.zzT9(zZzo);
                break;
        }
    }

    private void zzZ(zzZ04 zzz04, zzYET zzyet) {
        switch (zzYhP()) {
            case 176:
                zzz04.zzus(zzZXP.zzN4(zzyet.zzYR()));
                break;
            case 177:
                zzz04.zzT0(zzo(zzyet));
                break;
            case 178:
                zzz04.zzSZ(zzo(zzyet));
                break;
            case 179:
                zzz04.setCharacter(zzn(zzyet));
                break;
            case 180:
                zzz04.zzT3(zzo(zzyet));
                break;
        }
    }

    private void zzZ(zzZ0G zzz0g, zzYET zzyet) {
        switch (zzYhP()) {
            case 157:
                zzz0g.zzTh(zzo(zzyet));
                break;
            case 158:
                zzz0g.zzTg(zzo(zzyet));
                break;
            case 159:
                zzz0g.zzuz(com.aspose.words.internal.zzJB.zzZo(zzyet.zzYR()));
                break;
            case 160:
                zzz0g.zzuA(zze(zzyet));
                break;
            case 161:
                zzz0g.zzuB(zzYEO.zzBw(zzyet.zzYR()));
                break;
        }
    }

    private void zzZ(zzZ0C zzz0c, zzYET zzyet) {
        int iZzYhP = zzYhP();
        if (iZzYhP != 180) {
            switch (iZzYhP) {
                case 152:
                    zzz0c.zzYj(zzn(zzyet));
                    break;
                case 153:
                    zzz0c.zzYi(zzn(zzyet));
                    break;
                case 154:
                    zzz0c.zzYh(zzn(zzyet));
                    break;
                case 155:
                    zzz0c.zzuy(zzZXP.zzN7(zzyet.zzYR()));
                    break;
            }
            return;
        }
        zzz0c.zzT3(zzo(zzyet));
    }

    private void zzZ(zzZ0F zzz0f, zzYET zzyet) {
        if (zzYhP() != 166) {
            return;
        }
        zzz0f.setPosition(zzZXP.zzN8(zzyet.zzYR()));
    }

    private void zzZ(zzZ09 zzz09, zzYET zzyet) {
        int iZzYhP = zzYhP();
        if (iZzYhP == 166) {
            zzz09.setPosition(zzZXP.zzN8(zzyet.zzYR()));
        } else if (iZzYhP == 167) {
            zzz09.zzuw(zzZXP.zzN6(zzyet.zzYR()));
        } else {
            if (iZzYhP != 179) {
                return;
            }
            zzz09.setCharacter(zzn(zzyet));
        }
    }

    private void zzZ(zzZ07 zzz07, zzYET zzyet) {
        int iZzYhP = zzYhP();
        switch (iZzYhP) {
            case 159:
                zzz07.zzuz(com.aspose.words.internal.zzJB.zzZo(zzyet.zzYR()));
                break;
            case 160:
                zzz07.zzuA(zze(zzyet));
                break;
            case 161:
                zzz07.zzuB(zzYEO.zzBw(zzyet.zzYR()));
                break;
            default:
                switch (iZzYhP) {
                    case 171:
                        zzz07.zzT2(zzo(zzyet));
                        break;
                    case 172:
                        zzz07.zzuv(com.aspose.words.internal.zzJB.zzZo(zzyet.zzYR()));
                        break;
                    case 173:
                        zzz07.zzuu(zze(zzyet));
                        break;
                    case 174:
                        zzz07.zzut(com.aspose.words.internal.zzJB.zzZo(zzyet.zzYR()));
                        break;
                }
                break;
        }
    }

    private void zzZ(zzZ0I zzz0i, zzYET zzyet) {
        if (zzYhP() != 179) {
            return;
        }
        zzz0i.setCharacter(zzn(zzyet));
    }

    private void zzZ(zzYZY zzyzy, zzYET zzyet) {
        if (zzYhP() != 186) {
            return;
        }
        zzyzy.zzSS(zzo(zzyet));
    }

    private static void zzZ(zzZ0H zzz0h, zzYET zzyet) {
        int iZzZo = com.aspose.words.internal.zzJB.zzZo(zzyet.zzYR());
        if (iZzZo != 0) {
            zzz0h.zzuC(iZzZo);
        }
    }
}
