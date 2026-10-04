package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
final class zzU6 {
    private static com.aspose.words.internal.zzZO0 zzZtC = com.aspose.words.internal.zzZO0.zzV3("UTF-8");
    private static int zzZtD = 0;
    static String zzZtE = null;
    static boolean zzZtF = false;
    static boolean zzZtG = false;

    public static void zzH(Node node) {
        throw new IllegalStateException(com.aspose.words.internal.zzZKN.format("Unexpected node type '{0}'.", Integer.valueOf(node.getNodeType())));
    }

    public static String zzST(String str) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            com.aspose.words.internal.zzZNH.zzU(sb, zzZg(str.charAt(i)));
        }
        return sb.toString();
    }

    public static void zzSU(String str) throws Exception {
        if (zzZtG) {
            com.aspose.words.internal.zzZO0 zzzo0 = zzZtC;
            String strZzZn = zzzo0.zzZn(zzzo0.getBytes(str));
            int i = 0;
            if (!com.aspose.words.internal.zzZYD.zzXk(zzZtE)) {
                int length = com.aspose.words.internal.zzZKN.zzR(str, '\n').length;
                while (i < length) {
                    int i2 = zzZtD;
                    if (i2 > 0) {
                        com.aspose.words.internal.zzZKN.zzm("", i2 * 4);
                    }
                    i++;
                }
                return;
            }
            com.aspose.words.internal.zzZON zzzonZzVk = com.aspose.words.internal.zzZOU.zzVk(zzZtE);
            String[] strArrZzR = com.aspose.words.internal.zzZKN.zzR(strZzZn, '\n');
            int length2 = strArrZzR.length;
            while (i < length2) {
                String str2 = strArrZzR[i];
                int i3 = zzZtD;
                if (i3 > 0) {
                    zzzonZzVk.write(com.aspose.words.internal.zzZKN.zzm("", i3 * 4));
                }
                zzzonZzVk.zzXB(str2);
                i++;
            }
            zzzonZzVk.flush();
            zzzonZzVk.close();
        }
    }

    public static String zzZ(zzVD zzvd) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < zzvd.getLength(); i++) {
            com.aspose.words.internal.zzZNH.zzU(sb, zzZg(zzvd.get(i)));
        }
        return sb.toString();
    }

    public static void zzZZ1() {
        zzZtD--;
    }

    public static void zzZZ2() {
        zzZtD++;
    }

    private static String zzZg(char c) {
        if (c == 0) {
            return "\\0";
        }
        if (c == '\\') {
            return "\\\\";
        }
        if (c == 57352) {
            return "{smarttag}";
        }
        if (c == 60416) {
            return "{tbl}";
        }
        switch (c) {
            case 7:
                return "\\a";
            case '\b':
                return "\\b";
            case '\t':
                return "\\t";
            case '\n':
                return "\\n";
            case 11:
                return "\\v";
            case '\f':
                return "\\f";
            case '\r':
                return "\\r";
            default:
                switch (c) {
                    case 57347:
                        return "{row}";
                    case 57348:
                        return "{cell}";
                    default:
                        switch (c) {
                            case 57359:
                                return "{sect}";
                            case 57360:
                                return "{omath}";
                            default:
                                switch (c) {
                                    case 57363:
                                        return "{fld}";
                                    case 57364:
                                        return "{ftn}";
                                    default:
                                        switch (c) {
                                            case 57366:
                                                return "{eof}";
                                            case 57367:
                                                return "{aptab}";
                                            case 57368:
                                                return "{sdt}";
                                            case 57369:
                                                return "{shape}";
                                            default:
                                                switch (c) {
                                                    case 57377:
                                                        return "{sdti<<}";
                                                    case 57378:
                                                        return "{>>sdti}";
                                                    case 57379:
                                                        return "{sdtb<<}";
                                                    case 57380:
                                                        return "{>>sdtb}";
                                                    default:
                                                        switch (c) {
                                                            case 57613:
                                                                return "{para}";
                                                            case 57614:
                                                                return "{para0}";
                                                            default:
                                                                return zzU7.zzZp(c) ? com.aspose.words.internal.zzZKN.format("{{tbl{0}}}", Integer.valueOf(c - 60416)) : zzU7.zzZn(c) ? com.aspose.words.internal.zzZKN.format("{{annot{0}}}", Integer.valueOf(c - 57856)) : zzU7.zzZm(c) ? com.aspose.words.internal.zzZKN.format("{{annoti{0}<<}}", Integer.valueOf(c - 58368)) : zzU7.zzZj(c) ? com.aspose.words.internal.zzZKN.format("{{>>annoti{0}}}", Integer.valueOf(c - 58880)) : zzU7.zzZl(c) ? com.aspose.words.internal.zzZKN.format("{{annotb{0}<<}}", Integer.valueOf(c - 59392)) : zzU7.zzZi(c) ? com.aspose.words.internal.zzZKN.format("{{>>annotb{0}}}", Integer.valueOf(c - 59904)) : c < ' ' ? com.aspose.words.internal.zzZKN.format("\\x{0:x2}", Integer.valueOf(c)) : (c < 128 || Character.isLetterOrDigit(c)) ? Character.toString(c) : com.aspose.words.internal.zzZKN.format("\\x{0:x4}", Integer.valueOf(c));
                                                        }
                                                }
                                        }
                                }
                        }
                }
        }
    }
}
