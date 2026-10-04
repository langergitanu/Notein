package com.aspose.words;

import com.microsoft.identity.common.java.telemetry.TelemetryEventStrings;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: loaded from: classes6.dex */
final class zzZ0R {
    private com.aspose.words.internal.zzO zzY1l;
    private Document zzYTQ;
    private IWarningCallback zzZG0;
    private static char[] zzY1m = {ControlChar.SPACE_CHAR, '\t', ControlChar.PARAGRAPH_BREAK_CHAR, '\n'};
    private static final com.aspose.words.internal.zzZHW zzUR = new com.aspose.words.internal.zzZHW("mstyle", "semantics", "mfenced", "mfrac", "msup", "msub", "msubsup", "munderover", "mmultiscripts", "mprescripts", "mroot", "msqrt", "mtable", "mtr", "mtd", "menclose", "munder", "mover", "mpadded", "mrow", "mi", "mo", "mn", "mtext", "width", "height", "depth", "open", "close", "separators", "verticalstrike", "horizontalstrike", "downdiagonalstrike", "updiagonalstrike", "top", "bottom", "left", "right");

    private zzZ0R(Document document, IWarningCallback iWarningCallback, com.aspose.words.internal.zzO zzo) {
        this.zzYTQ = document;
        this.zzZG0 = iWarningCallback;
        this.zzY1l = zzo;
    }

    private void zzM(OfficeMath officeMath) {
        for (String str : com.aspose.words.internal.zzZKN.zzY(this.zzY1l.getValue(), zzY1m, com.aspose.words.internal.zzZOE.REMOVE_EMPTY_ENTRIES$77a9e2fd)) {
            switch (zzUR.zzTP(str)) {
                case 30:
                    officeMath.zzZsL().zzQ(15120, Boolean.TRUE);
                    break;
                case 31:
                    officeMath.zzZsL().zzQ(15100, Boolean.TRUE);
                    break;
                case 32:
                    officeMath.zzZsL().zzQ(15110, Boolean.TRUE);
                    break;
                case 33:
                    officeMath.zzZsL().zzQ(15090, Boolean.TRUE);
                    break;
                case 34:
                    officeMath.zzZsL().zzQ(15060, Boolean.FALSE);
                    break;
                case 35:
                    officeMath.zzZsL().zzQ(15050, Boolean.FALSE);
                    break;
                case 36:
                    officeMath.zzZsL().zzQ(15070, Boolean.FALSE);
                    break;
                case 37:
                    officeMath.zzZsL().zzQ(15080, Boolean.FALSE);
                    break;
                default:
                    zzYL("notation", str);
                    break;
            }
        }
    }

    private void zzN(OfficeMath officeMath) {
        zzZ0J zzz0jZzZsL = officeMath.zzZsL();
        Boolean bool = Boolean.TRUE;
        zzz0jZzZsL.zzQ(15050, bool);
        officeMath.zzZsL().zzQ(15060, bool);
        officeMath.zzZsL().zzQ(15080, bool);
        officeMath.zzZsL().zzQ(15070, bool);
        boolean z = false;
        while (this.zzY1l.zzi()) {
            boolean zEquals = "notation".equals(this.zzY1l.getLocalName());
            if (zEquals && !z) {
                zzM(officeMath);
                z = true;
            } else if (!zEquals) {
                zzYK("menclose", this.zzY1l.getLocalName());
            }
        }
    }

    private void zzO(OfficeMath officeMath) {
        while (this.zzY1l.zzi()) {
            switch (zzUR.zzTP(this.zzY1l.getLocalName())) {
                case 27:
                    zzX(officeMath, 15180);
                    break;
                case 28:
                    zzX(officeMath, 15190);
                    break;
                case 29:
                    zzX(officeMath, 15200);
                    break;
                default:
                    zzYK("mfenced", this.zzY1l.getLocalName());
                    break;
            }
        }
    }

    private void zzP(OfficeMath officeMath) {
        while (this.zzY1l.zzi()) {
            boolean z = false;
            if (this.zzY1l.getValue().length() == 3 && this.zzY1l.getValue().charAt(0) == '0') {
                z = true;
            }
            switch (zzUR.zzTP(this.zzY1l.getLocalName())) {
                case 24:
                    officeMath.zzZsL().zzQ(15450, Boolean.valueOf(z));
                    break;
                case 25:
                    officeMath.zzZsL().zzQ(15330, Boolean.valueOf(z));
                    break;
                case 26:
                    officeMath.zzZsL().zzQ(15340, Boolean.valueOf(z));
                    break;
                default:
                    zzYK("mpadded", this.zzY1l.getLocalName());
                    break;
            }
        }
    }

    private void zzQ(OfficeMath officeMath) {
        while (this.zzY1l.zzi()) {
            String localName = this.zzY1l.getLocalName();
            if ("linethickness".equals(localName)) {
                if (com.aspose.words.internal.zzAN.zzZD(zzZ0Q.zzIo(this.zzY1l.getValue()))) {
                    officeMath.zzZsL().zzQ(15460, 2);
                }
            } else if ("bevelled".equals(localName) && TelemetryEventStrings.Value.TRUE.equals(this.zzY1l.getValue())) {
                officeMath.zzZsL().zzQ(15460, 3);
            }
        }
    }

    private static boolean zzR(OfficeMath officeMath) {
        int mathObjectType = officeMath.zzZsL().getMathObjectType();
        return (mathObjectType == 17 || mathObjectType == 18 || mathObjectType == 27) && officeMath.getChildNodes(0, false).getCount() == 2;
    }

    private static boolean zzS(OfficeMath officeMath) {
        return officeMath.zzZsL().getMathObjectType() == 28 && officeMath.getChildNodes(0, false).getCount() == 3;
    }

    private static int zzT(OfficeMath officeMath) {
        for (int i = 0; i < officeMath.getChildNodes(0, false).getCount(); i++) {
            String text = officeMath.getChildNodes(0, false).get(i).getText();
            if (text.length() == 1 && text.charAt(0) == 8289) {
                return i;
            }
        }
        return -1;
    }

    private void zzU(OfficeMath officeMath) {
        int iZzT = zzT(officeMath);
        if (iZzT < 0) {
            return;
        }
        OfficeMath officeMathZzZ = zzZ(officeMath, iZzT);
        zzY(officeMath, iZzT);
        officeMath.appendChild(officeMathZzZ);
    }

    private void zzX(zzZ0S zzz0s) {
        String strZzV = this.zzY1l.zzV("mathcolor", null);
        Run run = new Run(this.zzYTQ, zzZ0Q.zzIm(this.zzY1l.readString()));
        run.zzZYh().zzRa(true);
        run.zzZYh().setName("Cambria Math");
        if (strZzV != null) {
            run.zzZYh().zzY(zzYU3.zzGR(strZzV));
        }
        zzZ(zzz0s, run, "mtext");
    }

    private static boolean zzY(Node node, OfficeMath officeMath) {
        OfficeMath officeMath2 = (OfficeMath) com.aspose.words.internal.zzZKW.zzZ(node, OfficeMath.class);
        if (officeMath == null) {
            return false;
        }
        return officeMath.getChildNodes(0, false).getCount() == 1 && (officeMath.zzZsL().getMathObjectType() == 13) && ((node instanceof Run) || (officeMath2 != null && officeMath2.zzZsL().getMathObjectType() == 8));
    }

    private zzZ0J zzYFt() {
        boolean zEquals;
        while (true) {
            if (!this.zzY1l.zzi()) {
                zEquals = false;
                break;
            }
            if ("accentunder".equals(this.zzY1l.getLocalName())) {
                zEquals = TelemetryEventStrings.Value.TRUE.equals(this.zzY1l.getValue());
                break;
            }
        }
        if (!zEquals) {
            return new zzZ08();
        }
        zzZ09 zzz09 = new zzZ09();
        zzz09.zzQ(15290, 1);
        return zzz09;
    }

    private zzZ0J zzYFu() {
        boolean zEquals;
        while (true) {
            if (!this.zzY1l.zzi()) {
                zEquals = false;
                break;
            }
            if ("accent".equals(this.zzY1l.getLocalName())) {
                zEquals = TelemetryEventStrings.Value.TRUE.equals(this.zzY1l.getValue());
                break;
            }
        }
        return zEquals ? new zzZ0I() : new zzYZV();
    }

    private OfficeMath zzYFv() {
        OfficeMath officeMath = new OfficeMath(this.zzYTQ, new zzYZZ());
        OfficeMath officeMath2 = new OfficeMath(this.zzYTQ, new zzZ0H(7));
        officeMath.zzZsL().zzQ(15540, Boolean.TRUE);
        officeMath.appendChild(officeMath2);
        return officeMath;
    }

    private OfficeMath zzYFw() {
        zzZ07 zzz07 = new zzZ07();
        zzz07.zzT2(true);
        return new OfficeMath(this.zzYTQ, zzz07);
    }

    private OfficeMath zzYFx() {
        OfficeMath officeMath = new OfficeMath(this.zzYTQ, new zzZ03());
        zzZ(new zzZ0S(officeMath, this.zzY1l.getLocalName(), null));
        return officeMath;
    }

    private void zzYK(String str, String str2) {
        zzT(16777216, com.aspose.words.internal.zzZKN.format("Attribute '{0}' is unexpected for '{1}' element.", str2, str));
    }

    private void zzYL(String str, String str2) {
        zzT(16777216, com.aspose.words.internal.zzZKN.format("Attribute '{0}' has unsupported value '{1}'.", str, str2));
    }

    public static OfficeMath zzZ(String str, Document document, IWarningCallback iWarningCallback) {
        return new zzZ0R(document, iWarningCallback, new com.aspose.words.internal.zzO(str, (Map<String, String>) null)).zzYFx();
    }

    private static boolean zzZt(String str, int i) {
        int iZzTP = zzUR.zzTP(str);
        if (iZzTP != 10) {
            if (iZzTP == 11 || iZzTP == 18) {
                return i > 0;
            }
            switch (iZzTP) {
                case 2:
                case 3:
                case 4:
                case 5:
                    break;
                case 6:
                case 7:
                    return i >= 3;
                case 8:
                    return false;
                default:
                    return true;
            }
        }
        return i >= 2;
    }

    private void zzT(int i, String str) {
        IWarningCallback iWarningCallback = this.zzZG0;
        if (iWarningCallback != null) {
            OooO00o.OooO0O0(iWarningCallback, i, 20, str);
        }
    }

    public static OfficeMath zzZ(com.aspose.words.internal.zzO zzo, Document document, IWarningCallback iWarningCallback) {
        return new zzZ0R(document, iWarningCallback, zzo).zzYFx();
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:13:0x002c  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x003b  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0085  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private OfficeMath zzY(zzZ0S zzz0s) {
        int i;
        int mathObjectType = zzz0s.zzYFF().zzZsL().getMathObjectType();
        if (mathObjectType != 10) {
            i = 8;
            if (mathObjectType != 23) {
                switch (mathObjectType) {
                    case 17:
                        if (zzz0s.zzYFD() == 1) {
                            i = 16;
                        }
                        break;
                    case 18:
                        if (zzz0s.zzYFD() == 1) {
                        }
                        break;
                    case 19:
                        break;
                    default:
                        switch (mathObjectType) {
                            case 26:
                                if (zzz0s.zzYFD() != 0) {
                                    if (zzz0s.zzYFC()) {
                                        if (zzz0s.zzYFB() >= 2) {
                                            zzT(1, "Only two pre-script arguments are supported for mmultiscripts elements.");
                                        } else if (!zzz0s.zzYFA()) {
                                            i = 25;
                                        } else {
                                            i = 24;
                                        }
                                    } else {
                                        zzT(1, "post-script arguments aren't supported for mmultiscripts elements.");
                                    }
                                }
                                break;
                            case 27:
                                if (zzz0s.zzYFD() == 1) {
                                }
                                break;
                            case 28:
                                if (zzz0s.zzYFD() != 0) {
                                    if (zzz0s.zzYFD() != 1) {
                                        if (zzz0s.zzYFD() == 2) {
                                        }
                                    }
                                }
                                break;
                            case 29:
                                if (zzz0s.zzYFD() == 1) {
                                }
                                break;
                        }
                        break;
                }
                return null;
            }
            if (zzz0s.zzYFD() == 1) {
                i = 7;
            }
        } else {
            i = zzz0s.zzYFD() == 0 ? 12 : 11;
        }
        return new OfficeMath(this.zzYTQ, new zzZ0H(i));
    }

    private void zzZ(zzZ0S zzz0s) {
        while (true) {
            DocumentBase document = zzz0s.zzYFF().getDocument();
            int i = -1;
            while (this.zzY1l.zzQ(zzz0s.zzYFE())) {
                String localName = this.zzY1l.getLocalName();
                OfficeMath officeMath = null;
                switch (zzUR.zzTP(localName)) {
                    case 0:
                    case 1:
                        break;
                    case 2:
                        zzz0s.zzuL(zzz0s.zzYFD() + 1);
                        officeMath = new OfficeMath(document, new zzZ0C());
                        zzO(officeMath);
                        break;
                    case 3:
                        zzz0s.zzuL(zzz0s.zzYFD() + 1);
                        officeMath = new OfficeMath(document, new zzZ0B());
                        zzQ(officeMath);
                        break;
                    case 4:
                        zzz0s.zzuL(zzz0s.zzYFD() + 1);
                        officeMath = new OfficeMath(document, new zzYZW());
                        break;
                    case 5:
                        zzz0s.zzuL(zzz0s.zzYFD() + 1);
                        officeMath = new OfficeMath(document, new zzYZX());
                        i = 0;
                        break;
                    case 6:
                    case 7:
                        zzz0s.zzuL(zzz0s.zzYFD() + 1);
                        i = !"msubsup".equals(localName) ? 1 : 0;
                        officeMath = new OfficeMath(document, new zzYZY());
                        break;
                    case 8:
                        zzz0s.zzuL(zzz0s.zzYFD() + 1);
                        officeMath = new OfficeMath(document, new zzZ00());
                        break;
                    case 9:
                        zzz0s.zzYFK();
                        break;
                    case 10:
                        zzz0s.zzuL(zzz0s.zzYFD() + 1);
                        officeMath = new OfficeMath(document, new zzYZZ());
                        break;
                    case 11:
                        zzz0s.zzuL(zzz0s.zzYFD() + 1);
                        officeMath = zzYFv();
                        break;
                    case 12:
                        zzz0s.zzuL(zzz0s.zzYFD() + 1);
                        officeMath = zzYFw();
                        break;
                    case 13:
                        officeMath = new OfficeMath(document, new zzZ06());
                        zzz0s.zzYFM();
                        break;
                    case 14:
                        officeMath = new OfficeMath(document, new zzZ0H(8));
                        zzz0s.zzYFL();
                        break;
                    case 15:
                        zzz0s.zzuL(zzz0s.zzYFD() + 1);
                        officeMath = new OfficeMath(document, new zzZ0E());
                        zzN(officeMath);
                        break;
                    case 16:
                        zzz0s.zzuL(zzz0s.zzYFD() + 1);
                        officeMath = new OfficeMath(document, zzYFt());
                        break;
                    case 17:
                        zzz0s.zzuL(zzz0s.zzYFD() + 1);
                        officeMath = new OfficeMath(document, zzYFu());
                        break;
                    case 18:
                        zzz0s.zzuL(zzz0s.zzYFD() + 1);
                        officeMath = new OfficeMath(document, new zzZ01());
                        zzP(officeMath);
                        break;
                    case 19:
                        zzz0s.zzuL(zzz0s.zzYFD() + 1);
                        officeMath = zzZ(zzz0s, i);
                        i = -1;
                        break;
                    case 20:
                    case 21:
                    case 22:
                        zzz0s.zzuL(zzz0s.zzYFD() + 1);
                        zzZ(zzz0s, "mi".equals(localName));
                        break;
                    case 23:
                        zzz0s.zzuL(zzz0s.zzYFD() + 1);
                        zzX(zzz0s);
                        break;
                    default:
                        this.zzY1l.zzk();
                        break;
                }
                if (officeMath != null) {
                    zzZ0S zzz0s2 = new zzZ0S(officeMath, localName, zzz0s);
                    zzZ(zzz0s2);
                    if (!zzz0s2.zzYFz()) {
                        zzZ(zzz0s, officeMath, localName);
                    }
                }
            }
            return;
            zzz0s = new zzZ0S(zzz0s.zzYFF(), zzz0s.zzYFE(), zzz0s);
        }
    }

    private void zzX(OfficeMath officeMath, int i) {
        String value = this.zzY1l.getValue();
        if (value.length() == 1) {
            officeMath.zzZsL().zzQ(i, Character.valueOf(value.charAt(0)));
        }
        if ("".equals(value)) {
            officeMath.zzZsL().zzQ(i, (char) 0);
        }
    }

    private static void zzY(OfficeMath officeMath, int i) {
        int count = officeMath.getChildNodes(0, false).getCount();
        while (true) {
            count--;
            if (count < i - 1) {
                return;
            } else {
                officeMath.getChildNodes(0, false).removeAt(count);
            }
        }
    }

    private boolean zzY(zzZ0S zzz0s, int i) {
        OfficeMath officeMath = (OfficeMath) com.aspose.words.internal.zzZKW.zzZ(zzz0s.zzYFF().getLastChild(), OfficeMath.class);
        if (officeMath == null) {
            return false;
        }
        NodeCollection childNodes = officeMath.getChildNodes(0, false);
        boolean zZzS = zzS(officeMath);
        if (!zZzS && !zzR(officeMath)) {
            return false;
        }
        OfficeMath officeMath2 = new OfficeMath(this.zzYTQ, new zzZ04());
        zzZ0J zzz0jZzZsL = officeMath2.zzZsL();
        zzz0s.zzYFF().appendChild(officeMath2);
        String text = childNodes.get(0).getText();
        if (com.aspose.words.internal.zzZYD.zzXk(text)) {
            zzz0jZzZsL.zzQ(15045, Character.valueOf(text.charAt(0)));
        }
        zzz0jZzZsL.zzQ(15510, Integer.valueOf(i));
        if (zZzS) {
            officeMath2.appendChild(childNodes.get(1).deepClone(true));
            officeMath2.appendChild(childNodes.get(2).deepClone(true));
        } else {
            zzz0jZzZsL.zzQ(15530, Boolean.TRUE);
            OfficeMath officeMath3 = new OfficeMath(this.zzYTQ, new zzZ0H(24));
            Iterator<T> it = ((CompositeNode) childNodes.get(1)).getChildNodes(0, false).iterator();
            while (it.hasNext()) {
                officeMath3.appendChild(((Node) it.next()).deepClone(true));
            }
            officeMath2.appendChild(officeMath3);
        }
        officeMath.remove();
        OfficeMath officeMath4 = new OfficeMath(this.zzYTQ, new zzZ0H(8));
        zzZ(new zzZ0S(officeMath4, "mrow", zzz0s));
        officeMath2.appendChild(officeMath4);
        return true;
    }

    private void zzZ(zzZ0S zzz0s, Node node, String str) {
        OfficeMath officeMath;
        OfficeMath officeMath2 = (OfficeMath) com.aspose.words.internal.zzZKW.zzZ(zzz0s.zzYFF().getLastChild(), OfficeMath.class);
        if (zzZ(zzz0s.zzYFF(), str, node, officeMath2)) {
            if (zzZ(zzz0s.zzYFF().zzZsL().getMathObjectType(), officeMath2) && zzZt(zzz0s.zzYFE(), zzz0s.zzYFD())) {
                officeMath = (OfficeMath) zzz0s.zzYFF().getLastChild();
            } else {
                OfficeMath officeMathZzY = zzY(zzz0s);
                if (officeMathZzY != null) {
                    zzz0s.zzYFF().appendChild(officeMathZzY);
                }
                officeMath = officeMathZzY;
            }
            if (officeMath != null) {
                officeMath.appendChild(node);
                return;
            }
            return;
        }
        zzz0s.zzYFF().appendChild(node);
    }

    private static boolean zzZ(OfficeMath officeMath, String str, Node node, OfficeMath officeMath2) {
        return ("mrow".equals(str) || "mtr".equals(str) || "mtd".equals(str) || (officeMath.zzZsL() instanceof zzZ0H) || !(officeMath.zzZsL().zzYF4() || zzY(node, officeMath2))) ? false : true;
    }

    private static boolean zzZ(int i, OfficeMath officeMath) {
        if (officeMath == null) {
            return false;
        }
        if (i != 4 && i != 22) {
            if (i == 23) {
                return (officeMath.zzZsL() instanceof zzZ0H) && officeMath.zzZsL().getMathObjectType() != 7;
            }
            switch (i) {
            }
            return false;
        }
        return true;
    }

    private void zzZ(zzZ0S zzz0s, boolean z) {
        boolean z2;
        String strZzV = this.zzY1l.zzV("mathvariant", null);
        String strZzV2 = this.zzY1l.zzV("mathcolor", null);
        String strZzIm = zzZ0Q.zzIm(this.zzY1l.readString());
        zzZ0S zzz0sZzYFJ = zzz0s.zzYFJ();
        if (zzz0sZzYFJ == null) {
            zzz0sZzYFJ = zzz0s.zzYFI();
        }
        boolean z3 = false;
        if (strZzIm.length() == 1 && zzz0sZzYFJ != null && zzz0sZzYFJ.zzYFD() == 1) {
            if (zzz0s.zzYFF().zzZsL().getMathObjectType() == 2) {
                zzz0s.zzYFF().zzZsL().zzQ(15040, Character.valueOf(strZzIm.charAt(0)));
                if (zzz0s.zzYFF().zzZsL().getMathObjectType() == 8) {
                    zzz0s.zzYFy();
                }
                z2 = true;
            } else {
                z2 = false;
            }
            if (zzz0sZzYFJ.zzYFF().zzZsL().getMathObjectType() == 15) {
                zzz0sZzYFJ.zzYFF().zzZsL().zzQ(15280, Character.valueOf(strZzIm.charAt(0)));
                if (zzz0s.zzYFF().zzZsL().getMathObjectType() == 8) {
                    zzz0s.zzYFy();
                }
                z3 = true;
            } else {
                z3 = z2;
            }
        }
        if (z3) {
            return;
        }
        Run run = new Run(this.zzYTQ, strZzIm);
        run.zzZYh().setName("Cambria Math");
        if (strZzV2 != null) {
            run.zzZYh().zzY(zzYU3.zzGR(strZzV2));
        }
        if (!com.aspose.words.internal.zzZYD.zzXk(strZzV) && z && strZzIm.length() > 1) {
            strZzV = "normal";
        }
        if (com.aspose.words.internal.zzZYD.zzXk(strZzV) && !"italic".equals(strZzV)) {
            zzYZQ zzyzqZzIn = zzZ0Q.zzIn(strZzV);
            if (zzyzqZzIn != null) {
                run.zzZYh().zzna(zzyzqZzIn.getStyle());
                run.zzZYh().zznb(zzyzqZzIn.zzYKY());
            } else {
                zzYL("mathvariant", strZzV);
            }
        }
        zzZ(zzz0s, run, this.zzY1l.getLocalName());
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x0057 A[PHI: r4
      0x0057: PHI (r4v1 int) = (r4v0 int), (r4v0 int), (r4v2 int), (r4v2 int) binds: [B:39:0x007b, B:36:0x0074, B:33:0x006d, B:24:0x0055] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private OfficeMath zzZ(zzZ0S zzz0s, int i) {
        int mathObjectType = zzz0s.zzYFF().zzZsL().getMathObjectType();
        if (mathObjectType != 6) {
            if (mathObjectType == 10) {
                i = zzz0s.zzYFD() == 0 ? 12 : 11;
            } else if (mathObjectType != 13) {
                if (mathObjectType != 15) {
                    if (mathObjectType != 23) {
                        int i2 = 16;
                        if (mathObjectType != 17) {
                            if (mathObjectType != 18) {
                                i2 = 25;
                                switch (mathObjectType) {
                                    case 26:
                                    case 28:
                                        i = zzz0s.zzYFD() == 1 ? 24 : 8;
                                        if (zzz0s.zzYFD() == 2) {
                                            i = i2;
                                        }
                                        break;
                                    case 27:
                                        if (zzz0s.zzYFD() == 1) {
                                            i = 24;
                                        }
                                        break;
                                    case 29:
                                        if (zzz0s.zzYFD() == 1) {
                                        }
                                        break;
                                    default:
                                        if (!zzY(zzz0s, i)) {
                                            zzZ(new zzZ0S(zzz0s.zzYFF(), "mrow", zzz0s));
                                            zzU(zzz0s.zzYFF());
                                            break;
                                        }
                                        break;
                                }
                                return null;
                            }
                            if (zzz0s.zzYFD() == 1) {
                            }
                        } else if (zzz0s.zzYFD() == 1) {
                        }
                    } else if (zzz0s.zzYFD() == 1) {
                        i = 7;
                    }
                }
            } else if (zzz0s.zzYFD() == 0) {
                i = 14;
            }
        }
        return new OfficeMath(this.zzYTQ, new zzZ0H(i));
    }

    private OfficeMath zzZ(OfficeMath officeMath, int i) {
        OfficeMath officeMath2 = new OfficeMath(this.zzYTQ, new zzZ0A());
        OfficeMath officeMath3 = new OfficeMath(this.zzYTQ, new zzZ0H(14));
        OfficeMath officeMath4 = new OfficeMath(this.zzYTQ, new zzZ0H(8));
        officeMath2.appendChild(officeMath3);
        officeMath2.appendChild(officeMath4);
        boolean z = false;
        for (int i2 = i - 1; i2 < officeMath.getChildNodes(0, false).getCount(); i2++) {
            Node node = officeMath.getChildNodes(0, false).get(i2);
            String text = node.getText();
            if (text.length() == 1 && text.charAt(0) == 8289) {
                z = true;
            } else if (!z) {
                officeMath3.appendChild(node.deepClone(true));
            } else {
                officeMath4.appendChild(node.deepClone(true));
            }
        }
        return officeMath2;
    }
}
