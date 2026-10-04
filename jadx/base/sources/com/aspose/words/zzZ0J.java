package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
abstract class zzZ0J extends zzZS {
    private static zzZS zzY0Z;

    static {
        zzZ03 zzz03 = new zzZ03();
        zzY0Z = zzz03;
        zzz03.add(15010, 1);
        zzY0Z.add(15030, 1);
        zzY0Z.add(15040, (char) 770);
        zzZS zzzs = zzY0Z;
        Boolean bool = Boolean.FALSE;
        zzzs.add(15050, bool);
        zzY0Z.add(15060, bool);
        zzY0Z.add(15070, bool);
        zzY0Z.add(15080, bool);
        zzY0Z.add(15090, bool);
        zzY0Z.add(15100, bool);
        zzY0Z.add(15110, bool);
        zzY0Z.add(15120, bool);
        zzY0Z.add(15130, bool);
        zzY0Z.add(15140, bool);
        zzY0Z.add(15170, bool);
        zzZS zzzs2 = zzY0Z;
        Boolean bool2 = Boolean.TRUE;
        zzzs2.add(15160, bool2);
        zzY0Z.add(15180, '(');
        zzY0Z.add(15190, ')');
        zzY0Z.add(15200, (char) 9474);
        zzY0Z.add(15210, bool);
        zzY0Z.add(15220, 0);
        zzY0Z.add(15270, 0);
        zzY0Z.add(15260, 0);
        zzY0Z.add(15230, 2);
        zzY0Z.add(15240, bool);
        zzY0Z.add(15250, bool);
        zzY0Z.add(15290, 1);
        zzY0Z.add(15300, 0);
        zzY0Z.add(15280, (char) 9183);
        zzY0Z.add(15310, bool2);
        zzY0Z.add(15320, bool);
        zzY0Z.add(15330, bool);
        zzY0Z.add(15450, bool);
        zzY0Z.add(15340, bool);
        zzY0Z.add(15460, 0);
        zzY0Z.add(15470, bool);
        zzY0Z.add(15480, 0);
        zzY0Z.add(15490, 0);
        zzY0Z.add(15500, 0);
        zzY0Z.add(15510, -1);
        zzY0Z.add(15520, bool);
        zzY0Z.add(15530, bool);
        zzY0Z.add(15045, (char) 8747);
        zzY0Z.add(15540, bool);
        zzY0Z.add(15550, bool);
    }

    public static boolean zzYM(Node node) {
        switch (node.getNodeType()) {
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
            case 24:
            case 25:
            case 26:
            case 27:
            case 33:
            case 34:
                return true;
            case 28:
                return ((StructuredDocumentTag) node).getLevel() == 1;
            case 29:
            case 30:
            case 31:
            case 32:
            default:
                return false;
            case 35:
                return ((OfficeMath) node).zzZsL().zzYF3();
        }
    }

    public abstract int getMathObjectType();

    public boolean zzT(Node node) {
        return zzYF4() ? node.getNodeType() == 35 && ((OfficeMath) node).zzZsL().getMathObjectType() == 8 : zzYM(node);
    }

    public boolean zzYF3() {
        return true;
    }

    public boolean zzYF4() {
        return true;
    }

    @Override // com.aspose.words.zzZS
    public final zzZS zzbo() {
        return zzY0Z;
    }
}
