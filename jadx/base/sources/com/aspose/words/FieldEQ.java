package com.aspose.words;

import androidx.appcompat.widget.C21559Oooo0oO;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/* JADX INFO: loaded from: classes6.dex */
public class FieldEQ extends Field {
    private zzYEF zzZsP;
    private static com.aspose.words.internal.zzZNR zzYEw = new com.aspose.words.internal.zzZNR("(\\\\[^\\d]+)(\\d+)?", 0);
    private static final com.aspose.words.internal.zzZHW zzUR = new com.aspose.words.internal.zzZHW("\\a", "\\b", "\\d", "\\f", "\\i", "\\l", "\\o", "\\r", "\\s", "\\x", "\\al", "\\ac", "\\ar", "\\co", "\\vs", "\\hs", "\\rc", "\\lc", "\\bc", "\\su", "\\pr", "\\in", "\\fc", "\\vc", "\\up", "\\do", "\\ai", "\\di", "\\to", "\\bo", "\\le", "\\ri");

    private OfficeMath zzI(ArrayList<String> arrayList, ArrayList<zzYIU> arrayList2) {
        zzZ0E zzz0e = new zzZ0E();
        zzz0e.zzTf(true);
        zzz0e.zzTd(true);
        zzz0e.zzTc(true);
        zzz0e.zzTe(true);
        Iterator<String> it = arrayList.iterator();
        while (it.hasNext()) {
            switch (zzUR.zzTP(it.next())) {
                case 28:
                    zzz0e.zzTe(false);
                    break;
                case 29:
                    zzz0e.zzTf(false);
                    break;
                case 30:
                    zzz0e.zzTd(false);
                    break;
                case 31:
                    zzz0e.zzTc(false);
                    break;
            }
        }
        OfficeMath officeMath = new OfficeMath(getStart().getDocument(), zzz0e, this.zzZsP);
        OfficeMath officeMath2 = new OfficeMath(getStart().getDocument(), new zzZ0H(8), this.zzZsP);
        zzZ(officeMath2, zzZ(arrayList2.get(0)));
        officeMath.appendChild(officeMath2);
        return officeMath;
    }

    private OfficeMath zzJ(ArrayList<String> arrayList, ArrayList<zzYIU> arrayList2) {
        zzZ07 zzz07 = new zzZ07();
        zzz07.zzuA(3);
        zzz07.zzYEI().zzZ(new zzZ0O(), 1);
        OfficeMath officeMath = new OfficeMath(getStart().getDocument(), zzz07, this.zzZsP);
        OfficeMath officeMathZzZ = zzZ(officeMath, this.zzZsP, false);
        OfficeMath officeMath2 = new OfficeMath(getStart().getDocument(), new zzZ0H(8), this.zzZsP);
        officeMathZzZ.appendChild(officeMath2);
        OfficeMath officeMathZzZ2 = zzZ(officeMath, this.zzZsP, false);
        OfficeMath officeMath3 = new OfficeMath(getStart().getDocument(), new zzZ0H(8), this.zzZsP);
        officeMathZzZ2.appendChild(officeMath3);
        Iterator<String> it = arrayList.iterator();
        while (it.hasNext()) {
            com.aspose.words.internal.zzZNT zzzntZzUX = zzYEw.zzUX(it.next());
            String strZzTX = com.aspose.words.internal.zzZKN.zzTX(zzzntZzUX.zzhJ().zzQx(1).getValue());
            int i = C21559Oooo0oO.OooO0OO(zzzntZzUX, 2) ? com.aspose.words.internal.zzJB.parseInt(zzzntZzUX.zzhJ().zzQx(2).getValue()) : 0;
            int iZzTP = zzUR.zzTP(strZzTX);
            if (iZzTP == 24) {
                zzZ(officeMath2, zzZ(arrayList2.get(0)));
                zzZ(officeMath3, zzZ(zzYIU.zzU(" ", zzY(officeMath2))));
                zzz07.zzuz(com.aspose.words.internal.zzSA.zzr(i));
            } else if (iZzTP == 25) {
                zzZ(officeMath3, zzZ(arrayList2.get(0)));
                zzZ(officeMath2, zzZ(zzYIU.zzU(" ", zzY(officeMath3))));
                zzz07.zzuz(com.aspose.words.internal.zzSA.zzr(i));
            }
        }
        return officeMath;
    }

    private OfficeMath zzK(ArrayList<String> arrayList, ArrayList<zzYIU> arrayList2) {
        zzZ07 zzz07 = new zzZ07();
        OfficeMath officeMath = new OfficeMath(getStart().getDocument(), zzz07, this.zzZsP);
        OfficeMath officeMathZzZ = zzZ(officeMath, this.zzZsP, true);
        zzZ0O zzz0o = new zzZ0O();
        Iterator<String> it = arrayList.iterator();
        while (it.hasNext()) {
            switch (zzUR.zzTP(it.next())) {
                case 10:
                    zzz0o.setHorizontalAlignment(1);
                    break;
                case 11:
                    zzz0o.setHorizontalAlignment(2);
                    break;
                case 12:
                    zzz0o.setHorizontalAlignment(3);
                    break;
            }
        }
        for (zzYIU zzyiu : arrayList2) {
            OfficeMath officeMath2 = new OfficeMath(getStart().getDocument(), new zzZ0H(8), this.zzZsP);
            officeMathZzZ.appendChild(officeMath2);
            zzz07.zzYEI().zzZ(zzz0o.zzYFs(), 1);
            zzZ(officeMath2, zzZ(zzyiu));
        }
        return officeMath;
    }

    private OfficeMath zzL(ArrayList<String> arrayList, ArrayList<zzYIU> arrayList2) {
        zzZ04 zzz04 = new zzZ04();
        zzz04.zzus(1);
        zzz04.zzT3(true);
        String str = "";
        for (String str2 : arrayList) {
            com.aspose.words.internal.zzZHW zzzhw = zzUR;
            switch (zzzhw.zzTP(str2)) {
                case 19:
                    zzz04.setCharacter((char) 8721);
                    break;
                case 20:
                    zzz04.setCharacter((char) 8719);
                    break;
                case 21:
                    zzz04.zzus(0);
                    break;
                case 22:
                case 23:
                    str = str2;
                    break;
                default:
                    int iZzTP = zzzhw.zzTP(str);
                    if (iZzTP == 22) {
                        zzz04.setCharacter(str2.charAt(1));
                        zzz04.zzT3(false);
                    } else if (iZzTP == 23) {
                        zzz04.setCharacter(str2.charAt(1));
                        zzz04.zzT3(true);
                    }
                    break;
            }
        }
        OfficeMath officeMath = new OfficeMath(getStart().getDocument(), zzz04, this.zzZsP);
        OfficeMath officeMath2 = new OfficeMath(getStart().getDocument(), new zzZ0H(24), this.zzZsP);
        OfficeMath officeMath3 = new OfficeMath(getStart().getDocument(), new zzZ0H(25), this.zzZsP);
        OfficeMath officeMath4 = new OfficeMath(getStart().getDocument(), new zzZ0H(8), this.zzZsP);
        officeMath.appendChild(officeMath2);
        officeMath.appendChild(officeMath3);
        officeMath.appendChild(officeMath4);
        zzZ(officeMath2, zzZ(arrayList2.get(0)));
        zzZ(officeMath3, zzZ(arrayList2.get(1)));
        zzZ(officeMath4, zzZ(arrayList2.get(2)));
        return officeMath;
    }

    private OfficeMath zzM(ArrayList<String> arrayList, ArrayList<zzYIU> arrayList2) {
        zzZ0C zzz0c = new zzZ0C();
        String str = "";
        for (String str2 : arrayList) {
            com.aspose.words.internal.zzZHW zzzhw = zzUR;
            int iZzTP = zzzhw.zzTP(str2);
            if (iZzTP != 1) {
                switch (iZzTP) {
                    case 16:
                    case 17:
                    case 18:
                        if ("\\b".equals(str)) {
                            zzz0c.zzYj((char) 0);
                            zzz0c.zzYi((char) 0);
                        }
                        break;
                    default:
                        char cCharAt = str2.length() > 1 ? str2.charAt(1) : ControlChar.SPACE_CHAR;
                        switch (zzzhw.zzTP(str)) {
                            case 16:
                                zzz0c.zzYi(cCharAt);
                                break;
                            case 17:
                                zzz0c.zzYj(cCharAt);
                                break;
                            case 18:
                                zzz0c.zzYj(cCharAt);
                                zzz0c.zzYi(zzZ4(cCharAt));
                                break;
                            default:
                                continue;
                        }
                        break;
                }
            }
            str = str2;
        }
        OfficeMath officeMath = new OfficeMath(getStart().getDocument(), zzz0c, this.zzZsP);
        OfficeMath officeMath2 = new OfficeMath(getStart().getDocument(), new zzZ0H(8), this.zzZsP);
        zzZ(officeMath2, zzZ(arrayList2.get(0)));
        officeMath.appendChild(officeMath2);
        return officeMath;
    }

    private OfficeMath zzN(ArrayList<String> arrayList, ArrayList<zzYIU> arrayList2) {
        zzZ07 zzz07 = new zzZ07();
        OfficeMath officeMath = new OfficeMath(getStart().getDocument(), zzz07, this.zzZsP);
        zzZ0O zzz0o = new zzZ0O();
        Iterator<String> it = arrayList.iterator();
        int iMax = 1;
        while (true) {
            if (!it.hasNext()) {
                for (int i = 0; i < iMax; i++) {
                    zzz07.zzYEI().zzZ(zzz0o.zzYFs(), 1);
                }
                zzz07.zzut(25);
                OfficeMath officeMathZzZ = zzZ(officeMath, this.zzZsP, false);
                int i2 = 0;
                for (zzYIU zzyiu : arrayList2) {
                    if (i2 >= iMax) {
                        officeMathZzZ = zzZ(officeMath, this.zzZsP, false);
                        i2 = 0;
                    }
                    OfficeMath officeMath2 = new OfficeMath(getStart().getDocument(), new zzZ0H(8), this.zzZsP);
                    zzZ(officeMath2, zzZ(zzyiu));
                    officeMathZzZ.appendChild(officeMath2);
                    i2++;
                }
                return officeMath;
            }
            com.aspose.words.internal.zzZNT zzzntZzUX = zzYEw.zzUX(it.next());
            String strZzTX = com.aspose.words.internal.zzZKN.zzTX(zzzntZzUX.zzhJ().zzQx(1).getValue());
            int i3 = C21559Oooo0oO.OooO0OO(zzzntZzUX, 2) ? com.aspose.words.internal.zzJB.parseInt(zzzntZzUX.zzhJ().zzQx(2).getValue()) : 0;
            switch (zzUR.zzTP(strZzTX)) {
                case 10:
                    zzz0o.setHorizontalAlignment(1);
                    break;
                case 11:
                    zzz0o.setHorizontalAlignment(2);
                    break;
                case 12:
                    zzz0o.setHorizontalAlignment(3);
                    break;
                case 13:
                    iMax = Math.max(iMax, i3);
                    break;
                case 14:
                    zzz07.zzuA(3);
                    zzz07.zzuz(com.aspose.words.internal.zzSA.zzr(i3));
                    break;
                case 15:
                    zzz07.zzuu(3);
                    zzz07.zzuv(com.aspose.words.internal.zzSA.zzr(i3));
                    break;
            }
        }
    }

    private OfficeMath zzO(ArrayList<String> arrayList, ArrayList<zzYIU> arrayList2) {
        switch (zzUR.zzTP(arrayList.get(0).toLowerCase())) {
            case 0:
                return zzN(arrayList, arrayList2);
            case 1:
                return zzM(arrayList, arrayList2);
            case 2:
                return zzZee();
            case 3:
                return zzZK(arrayList2);
            case 4:
                return zzL(arrayList, arrayList2);
            case 5:
                return zzZJ(arrayList2);
            case 6:
                return zzK(arrayList, arrayList2);
            case 7:
                return zzZI(arrayList2);
            case 8:
                return zzJ(arrayList, arrayList2);
            case 9:
                return zzI(arrayList, arrayList2);
            default:
                throw new IllegalArgumentException("Unexpected token.");
        }
    }

    private static zzYEF zzY(OfficeMath officeMath) {
        Run run = (Run) officeMath.getChild(21, 0, true);
        return run != null ? run.zzZYh() : officeMath.zzZYh();
    }

    private ArrayList<Node> zzZ(zzYIU zzyiu) {
        ArrayList<zzYIU> arrayList;
        ArrayList<String> arrayList2;
        ArrayList<zzYIV> arrayList3;
        ArrayList<Node> arrayList4 = new ArrayList<>();
        if (zzyiu == null || zzyiu.getLength() == 0) {
            return arrayList4;
        }
        StringBuilder sb = new StringBuilder();
        zzYIS zzyis = new zzYIS();
        ArrayList<String> arrayList5 = new ArrayList<>();
        ArrayList<zzYIU> arrayList6 = new ArrayList<>();
        zzYIS zzyis2 = zzyis;
        ArrayList<zzYIV> arrayList7 = new ArrayList<>();
        int i = 0;
        while (i < zzyiu.getLength()) {
            zzYIV zzyivZzpn = zzyiu.zzpn(i);
            if (zzZ3(zzyivZzpn.getCharacter()) && arrayList7.size() == 0) {
                zzZ(zzyivZzpn, sb, arrayList5);
            } else if (zzZ2(zzyivZzpn.getCharacter())) {
                zzZ(zzyivZzpn, sb, arrayList5, arrayList7, zzyis2);
            } else if (zzZ1(zzyivZzpn.getCharacter())) {
                zzZ(zzyivZzpn, sb, arrayList5, arrayList7, zzyis2, arrayList6, arrayList4);
            } else {
                arrayList = arrayList6;
                arrayList2 = arrayList5;
                arrayList3 = arrayList7;
                if (zzZ0(zzyivZzpn.getCharacter())) {
                    zzZ(zzyivZzpn, arrayList3, zzyis2, arrayList);
                } else {
                    zzYIS zzyis3 = zzyis2;
                    zzZ(zzyivZzpn, sb, arrayList3, zzyis3, arrayList4);
                    zzyis2 = zzyis3;
                }
                i++;
                arrayList7 = arrayList3;
                arrayList5 = arrayList2;
                arrayList6 = arrayList;
            }
            arrayList = arrayList6;
            arrayList2 = arrayList5;
            arrayList3 = arrayList7;
            i++;
            arrayList7 = arrayList3;
            arrayList5 = arrayList2;
            arrayList6 = arrayList;
        }
        return arrayList4;
    }

    private static boolean zzZ0(char c) {
        return c == zzZed();
    }

    private static boolean zzZ1(char c) {
        return c == ')';
    }

    private static boolean zzZ2(char c) {
        return c == '(';
    }

    private static boolean zzZ3(char c) {
        return c == '\\';
    }

    private static char zzZ4(char c) {
        if (c == '(') {
            return ')';
        }
        if (c == '<') {
            return '>';
        }
        if (c == '[') {
            return ']';
        }
        if (c != '{') {
            return c;
        }
        return '}';
    }

    private OfficeMath zzZI(ArrayList<zzYIU> arrayList) {
        zzYZZ zzyzz = new zzYZZ();
        OfficeMath officeMath = new OfficeMath(getStart().getDocument(), zzyzz, this.zzZsP);
        if (arrayList.size() == 1) {
            officeMath.appendChild(new OfficeMath(getStart().getDocument(), new zzZ0H(7), this.zzZsP));
            OfficeMath officeMath2 = new OfficeMath(getStart().getDocument(), new zzZ0H(8), this.zzZsP);
            zzZ(officeMath2, zzZ(arrayList.get(0)));
            officeMath.appendChild(officeMath2);
            zzyzz.zzST(true);
            return officeMath;
        }
        OfficeMath officeMath3 = new OfficeMath(getStart().getDocument(), new zzZ0H(7), this.zzZsP);
        zzZ(officeMath3, zzZ(arrayList.get(0)));
        officeMath.appendChild(officeMath3);
        OfficeMath officeMath4 = new OfficeMath(getStart().getDocument(), new zzZ0H(8), this.zzZsP);
        zzZ(officeMath4, zzZ(arrayList.get(1)));
        officeMath.appendChild(officeMath4);
        return officeMath;
    }

    private OfficeMath zzZJ(ArrayList<zzYIU> arrayList) {
        zzZ0C zzz0c = new zzZ0C();
        zzz0c.zzYj(ControlChar.SPACE_CHAR);
        zzz0c.zzYi(ControlChar.SPACE_CHAR);
        zzz0c.zzYh(zzZed());
        OfficeMath officeMath = new OfficeMath(getStart().getDocument(), zzz0c, this.zzZsP);
        for (zzYIU zzyiu : arrayList) {
            OfficeMath officeMath2 = new OfficeMath(getStart().getDocument(), new zzZ0H(8), this.zzZsP);
            officeMath.appendChild(officeMath2);
            zzZ(officeMath2, zzZ(zzyiu));
        }
        return officeMath;
    }

    private OfficeMath zzZK(ArrayList<zzYIU> arrayList) {
        OfficeMath officeMath = new OfficeMath(getStart().getDocument(), new zzZ0B(), this.zzZsP);
        OfficeMath officeMath2 = new OfficeMath(getStart().getDocument(), new zzZ0H(12), this.zzZsP);
        OfficeMath officeMath3 = new OfficeMath(getStart().getDocument(), new zzZ0H(11), this.zzZsP);
        officeMath.appendChild(officeMath2);
        officeMath.appendChild(officeMath3);
        zzZ(officeMath2, zzZ(arrayList.get(0)));
        zzZ(officeMath3, zzZ(arrayList.get(1)));
        return officeMath;
    }

    private static char zzZed() {
        return com.aspose.words.internal.zzJB.zzH5() == ',' ? ';' : ',';
    }

    private OfficeMath zzZee() {
        return new OfficeMath(getStart().getDocument(), new zzZ01(), this.zzZsP);
    }

    private Node zzZef() throws Exception {
        try {
            zzYIU zzyiuZzYkn = zzZ.zzP(this).zzYkn();
            if (zzyiuZzYkn.getLength() <= 0) {
                return new Run(getStart().getDocument());
            }
            this.zzZsP = (zzYEF) getStart().zzZYh().zzbn();
            OfficeMath officeMath = new OfficeMath(getStart().getDocument(), new zzZ02(), this.zzZsP);
            OfficeMath officeMath2 = new OfficeMath(getStart().getDocument(), new zzZ03(), this.zzZsP);
            officeMath.appendChild(officeMath2);
            zzZ(officeMath2, zzZ(zzyiuZzYkn));
            officeMath.zzYrP();
            return officeMath;
        } catch (Exception unused) {
            Run run = new Run(getStart().getDocument(), "Error!");
            run.zzZ((zzYEF) getStart().zzZYh().zzbn());
            run.getFont().setBold(true);
            return run;
        }
    }

    public OfficeMath asOfficeMath() throws Exception {
        return (OfficeMath) com.aspose.words.internal.zzZKW.zzZ(zzZef(), OfficeMath.class);
    }

    @Override // com.aspose.words.Field
    public final zzYWB zzZgI() throws Exception {
        Node nodeZzZef = zzZef();
        new Paragraph(getStart().getDocument(), (zzYMX) getStart().getParentParagraph().zzZYj().zzbn(), new zzYEF()).appendChild(nodeZzZef);
        return new zzYWB(nodeZzZef, nodeZzZef);
    }

    public static final class zzZ implements com.aspose.words.internal.zzZOY {
        private zzZR2 zzYEu = new zzZR2();
        private zzYWI zzYEv;

        private zzZ(zzYWB zzywb) {
            this.zzYEv = new zzYWI(zzywb);
        }

        public static zzYIU zzP(Field field) throws Exception {
            zzZR8 zzzr8ZzDH = field.zzZgq().zzDH(0);
            if (zzzr8ZzDH == null) {
                return zzYIU.zzXxD;
            }
            zzZ zzz = new zzZ(zzzr8ZzDH.zzZga());
            try {
                return zzz.zzZec();
            } finally {
                zzz.dispose();
            }
        }

        private void zzX(zzYIS zzyis) {
            if (this.zzYEv.zzYWt().zzZot()) {
                return;
            }
            Run run = (Run) this.zzYEv.next();
            zzyis.zzV(run.getText().charAt(zzZeb()), run.zzZYh());
        }

        private void zzY(zzYIS zzyis) throws Exception {
            FieldStart fieldStart = (FieldStart) this.zzYEv.next();
            if (this.zzYEu.zzZfR() != 1) {
                return;
            }
            int fieldType = fieldStart.getFieldType();
            if (fieldType != 57) {
                switch (fieldType) {
                    case 49:
                        zzyis.zzV(zzP(fieldStart.getField()));
                        break;
                }
                return;
            }
            zzZ(zzyis, fieldStart.getField().zzZgI());
        }

        private static void zzZ(zzYIS zzyis, zzYWB zzywb) {
            if (zzywb == null) {
                return;
            }
            Iterator<Node> it = zzywb.iterator();
            while (it.hasNext()) {
                Run run = (Run) com.aspose.words.internal.zzZKW.zzZ(it.next(), Run.class);
                if (run != null) {
                    zzyis.zzT(run.getText(), run.zzZYh());
                }
            }
        }

        private int zzZeb() {
            return this.zzYEv.zzYWt().getOffset();
        }

        private zzYIU zzZec() throws Exception {
            zzYIS zzyis = new zzYIS();
            while (this.zzYEv.zzF(true, false)) {
                this.zzYEu.zzZW(this.zzYEv.next());
                zzZ(zzyis);
            }
            return zzyis.zzYkq();
        }

        @Override // com.aspose.words.internal.zzZOY
        public final void dispose() {
        }

        private void zzZ(zzYIS zzyis) throws Exception {
            int nodeType = this.zzYEv.next().getNodeType();
            if (nodeType != 21) {
                if (nodeType != 22) {
                    return;
                }
                zzY(zzyis);
            } else {
                if (this.zzYEu.isInFieldCode()) {
                    return;
                }
                zzX(zzyis);
            }
        }
    }

    private static void zzZ(zzYIV zzyiv, StringBuilder sb, Collection<String> collection) {
        if (sb.length() != 0) {
            collection.add(com.aspose.words.internal.zzZKN.zzTX(sb.toString()));
            sb.setLength(0);
        }
        sb.append(zzyiv.getCharacter());
    }

    private static void zzZ(zzYIV zzyiv, StringBuilder sb, Collection<String> collection, Collection<zzYIV> collection2, zzYIS zzyis) {
        if (sb.length() == 1) {
            sb.append(zzyiv.getCharacter());
            return;
        }
        if (sb.length() != 0 && collection2.size() == 0) {
            collection.add(com.aspose.words.internal.zzZKN.zzTX(sb.toString()));
            sb.setLength(0);
        }
        if (collection2.size() > 0) {
            zzyis.zzZ(zzyiv);
        }
        collection2.add(zzyiv);
    }

    private void zzZ(zzYIV zzyiv, StringBuilder sb, ArrayList<String> arrayList, ArrayList<zzYIV> arrayList2, zzYIS zzyis, ArrayList<zzYIU> arrayList3, Collection<Node> collection) {
        if (sb.length() == 1) {
            sb.append(zzyiv.getCharacter());
            return;
        }
        if (arrayList2.size() == 1) {
            arrayList3.add(zzyis.zzYkq().zzYkn());
            zzyis.clear();
            sb.setLength(0);
            if (arrayList.size() != 0) {
                collection.add(zzO(arrayList, arrayList3));
            } else {
                zzZ(arrayList2.get(0), arrayList3.get(0), zzyiv, collection);
            }
            arrayList.clear();
            arrayList3.clear();
        }
        arrayList2.remove(arrayList2.size() - 1);
        if (arrayList2.size() > 0) {
            zzyis.zzZ(zzyiv);
        }
    }

    private static void zzZ(zzYIV zzyiv, Collection<zzYIV> collection, zzYIS zzyis, Collection<zzYIU> collection2) {
        if (collection.size() == 1) {
            collection2.add(zzyis.zzYkq().zzYkn());
            zzyis.clear();
        } else {
            zzyis.zzZ(zzyiv);
        }
    }

    private void zzZ(zzYIV zzyiv, StringBuilder sb, Collection<zzYIV> collection, zzYIS zzyis, Collection<Node> collection2) {
        if (collection.size() > 0) {
            zzyis.zzZ(zzyiv);
        } else if (sb.length() != 0) {
            sb.append(zzyiv.getCharacter());
        } else {
            zzZ(zzyiv, collection2);
        }
    }

    private void zzZ(zzYIV zzyiv, Collection<Node> collection) {
        Run run = new Run(getStart().getDocument(), Character.toString(zzyiv.getCharacter()));
        run.zzZ(zzyiv.zzZYh());
        collection.add(run);
    }

    private void zzZ(zzYIV zzyiv, zzYIU zzyiu, zzYIV zzyiv2, Collection<Node> collection) {
        zzZ(zzyiv, collection);
        for (int i = 0; i < zzyiu.getLength(); i++) {
            zzZ(zzyiu.zzpn(i), collection);
        }
        zzZ(zzyiv2, collection);
    }

    private static OfficeMath zzZ(OfficeMath officeMath, zzYEF zzyef, boolean z) {
        zzZ06 zzz06 = new zzZ06();
        zzz06.zzT1(z);
        OfficeMath officeMath2 = new OfficeMath(officeMath.getDocument(), zzz06, zzyef);
        officeMath.appendChild(officeMath2);
        return officeMath2;
    }

    private static void zzZ(CompositeNode compositeNode, ArrayList<Node> arrayList) {
        Iterator<Node> it = arrayList.iterator();
        while (it.hasNext()) {
            compositeNode.appendChild(it.next());
        }
    }
}
