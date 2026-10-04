package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
final class zzZPJ {
    public static void zzB(Field field) throws Exception {
        zzZ(field, zzZUP.zzYLp, 1);
    }

    public static Node zzC(Field field) throws Exception {
        if (field.isRemoved()) {
            return null;
        }
        zzZ(field, 0);
        Node nextSibling = field.getEnd().getNextSibling() != null ? field.getEnd().getNextSibling() : field.getStart().getParentParagraph();
        zzYW0.zzm(field.getStart(), field.getEnd());
        zzW(field, true);
        return nextSibling;
    }

    private static boolean zzD0(int i) {
        return (i & 4) != 0;
    }

    private static boolean zzD1(int i) {
        return (i & 2) != 0;
    }

    private static boolean zzD2(int i) {
        return i == 1;
    }

    private static boolean zzD3(int i) {
        return zzD2(i) || zzD0(i);
    }

    private static boolean zzD4(int i) {
        return zzD2(i) || zzD1(i);
    }

    private static String zzD5(int i) {
        if (zzD2(i)) {
            return "\"";
        }
        if (zzD1(i) || zzD0(i)) {
            return ControlChar.zzZs5;
        }
        throw new IllegalArgumentException("Specified argument was out of the range of valid values.\r\nParameter name: separators");
    }

    private static void zzW(Field field, boolean z) throws Exception {
        if (field.zzZgm()) {
            field.zzZgo().zzU(field, z);
        }
    }

    private static void zzY(Field field, zzZB3 zzzb3, int i) throws Exception {
        zzzb3.zzZjr();
        zzZ(field, 1);
        zzYW0.zzZ((Node) field.getStart(), true, (Node) field.getSeparator(), true, i);
        field.getEnd().remove();
        zzW(field, false);
    }

    public static void zzZ(Field field, zzZB3 zzzb3, int i) throws Exception {
        if (field.isRemoved()) {
            return;
        }
        if (zzZOO.zzi(field)) {
            if (field.zzZgm() && zzZOO.zzCC(field.getType())) {
                field.zzZgo().zzp(field);
                return;
            } else {
                zzC(field);
                return;
            }
        }
        zzYWB zzywbZzZgI = field.zzZgI();
        boolean z = (zzywbZzZgI == null || zzywbZzZgI.zz13() || zzywbZzZgI.isEmpty()) ? false : true;
        if (!field.hasSeparator() && !z) {
            zzC(field);
            return;
        }
        if (z) {
            field.zzZgP();
            field.zzW4(true);
            zzYWJ.zzY(zzywbZzZgI, field.getEnd());
        }
        zzY(field, zzzb3, i);
    }

    private static boolean zzZB(Node node) {
        boolean z = node.getNodeType() == 24;
        while (true) {
            node = node.zzSI(z);
            if (node != null) {
                if (!zzYVU.zzXW(node)) {
                    switch (node.getNodeType()) {
                        case 21:
                            String text = node.getText();
                            if (com.aspose.words.internal.zzZYD.zzXk(text)) {
                                char cCharAt = text.charAt(z ? 0 : text.length() - 1);
                                if (!zzZQT.zzk(cCharAt) && !com.aspose.words.internal.zzZKU.zzG(cCharAt)) {
                                    return false;
                                }
                            }
                            break;
                        case 22:
                        case 23:
                        case 24:
                            return true;
                        default:
                            return false;
                    }
                }
            }
        }
        return true;
    }

    private static int zzY(Field field, int i) {
        if (!field.zzZgm() || field.zzZgn().zzZb7() || field.zzZgn().zzZbh().getField().getType() == 34) {
            return 0;
        }
        if (i == 0) {
            return 1;
        }
        String result = field.getResult();
        if (!com.aspose.words.internal.zzZYD.zzXk(result) || com.aspose.words.internal.zzZYD.zzXd(result)) {
            return 1;
        }
        int i2 = zzZB(field.getStart()) ? 0 : 2;
        return !zzZB(field.getEnd()) ? i2 | 4 : i2;
    }

    private static Inline zzY(Field field, int i, int i2) {
        if (i == 0) {
            if (zzD4(i2)) {
                return field.getStart();
            }
            return null;
        }
        if (i == 1) {
            if (zzD3(i2)) {
                return field.getEnd();
            }
            return null;
        }
        throw new IllegalArgumentException("Specified argument was out of the range of valid values.\r\nParameter name: part");
    }

    private static void zzZ(Field field, int i) {
        int iZzY = zzY(field, i);
        if (iZzY == 0) {
            return;
        }
        zzZ(zzZ(field, i, iZzY), iZzY, true);
        zzZ(zzY(field, i, iZzY), iZzY, false);
    }

    private static Inline zzZ(Field field, int i, int i2) {
        if (i == 0) {
            if (zzD3(i2)) {
                return field.getEnd();
            }
            return null;
        }
        if (i == 1) {
            if (zzD4(i2)) {
                return field.getSeparator();
            }
            return null;
        }
        throw new IllegalArgumentException("Specified argument was out of the range of valid values.\r\nParameter name: part");
    }

    private static void zzZ(Inline inline, int i, boolean z) {
        if (inline == null) {
            return;
        }
        inline.getParentNode().zzZ(new Run(inline.getDocument(), zzD5(i), zzZ(inline, inline.zzSI(z))), inline, z);
    }

    private static zzYEF zzZ(Inline inline, Node node) {
        if (com.aspose.words.internal.zzZKW.zzZ(node, Inline.class) != null) {
            inline = (Inline) com.aspose.words.internal.zzZKW.zzZ(node, Inline.class);
        }
        return (zzYEF) inline.zzZYh().zzbn();
    }
}
