package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
final class zzY20 {
    public static WarningInfo zzM(String str, Object obj) {
        return new WarningInfo(65536, 1, com.aspose.words.internal.zzZKN.format("{0}{1}", str, zzYK(obj)));
    }

    private static int zzW5(Node node) {
        zzYVU.zzXM(node);
        int i = 1;
        for (Node nodeZzZYv = node.zzYBd().zzZYv(); nodeZzZYv != null && nodeZzZYv != node; nodeZzZYv = nodeZzZYv.zzYB7()) {
            if (nodeZzZYv.getNodeType() == node.getNodeType()) {
                i++;
            }
        }
        return i;
    }

    private static String zzW6(Node node) {
        int nodeType = node.getNodeType();
        if (nodeType != 2) {
            if (nodeType == 21) {
                return com.aspose.words.internal.zzZKN.format(" '{0}'", com.aspose.words.internal.zzZYD.zzXj(node.getText()));
            }
            if (nodeType == 26) {
                String text = ((SpecialChar) node).getText();
                return com.aspose.words.internal.zzZKN.format(" '\\x{0}'", com.aspose.words.internal.zzZYD.zzZ8(new byte[]{(byte) ((text.charAt(0) >> '\b') & 255), (byte) (text.charAt(0) & 255)}));
            }
            if (nodeType == 33) {
                return com.aspose.words.internal.zzZKN.format(" Id:{0}", Integer.valueOf(((CommentRangeStart) node).getId()));
            }
            if (nodeType == 34) {
                return com.aspose.words.internal.zzZKN.format(" Id:{0}", Integer.valueOf(((CommentRangeEnd) node).getId()));
            }
            switch (nodeType) {
                case 5:
                case 6:
                case 7:
                case 8:
                    break;
                case 9:
                    return com.aspose.words.internal.zzZKN.format(" '{0}'", ((BookmarkStart) node).getName());
                case 10:
                    return com.aspose.words.internal.zzZKN.format(" '{0}'", ((BookmarkEnd) node).getName());
                default:
                    switch (nodeType) {
                        case 17:
                        case 18:
                            ShapeBase shapeBase = (ShapeBase) node;
                            return shapeBase.getMarkupLanguage() == 1 ? com.aspose.words.internal.zzZKN.format(" Id:{0} '{1}'", Integer.valueOf(shapeBase.getId()), shapeBase.getName()) : com.aspose.words.internal.zzZKN.format(" {0}x{1}", Double.valueOf(shapeBase.getWidth()), Double.valueOf(shapeBase.getHeight()));
                        case 19:
                            Comment comment = (Comment) node;
                            return com.aspose.words.internal.zzZKN.format(" Id:{0} '{1}'", Integer.valueOf(comment.getId()), com.aspose.words.internal.zzZYD.zzXj(comment.getText()));
                        default:
                            return "";
                    }
            }
        }
        return com.aspose.words.internal.zzZKN.format(" {0}", Integer.toString(zzW5(node)));
    }

    private static String zzW7(Node node) {
        switch (node.getNodeType()) {
            case 0:
                return "Any";
            case 1:
                return "Document";
            case 2:
                return "Section";
            case 3:
                return "Body";
            case 4:
                int headerFooterType = ((HeaderFooter) node).getHeaderFooterType();
                return headerFooterType != 0 ? headerFooterType != 1 ? headerFooterType != 2 ? headerFooterType != 3 ? headerFooterType != 4 ? headerFooterType != 5 ? "Undefined" : "First Page Footer" : "First Page Header" : "Primary Footer" : "Even Page Footer" : "Primary Header" : "Even Page Header";
            case 5:
                return "Table";
            case 6:
                return "Row";
            case 7:
                return "Cell";
            case 8:
                return "Paragraph";
            case 9:
                return "Bookmark Start";
            case 10:
                return "Bookmark End";
            case 11:
            case 12:
            case 13:
            case 14:
            case 15:
            case 16:
            case 29:
            case 30:
            case 36:
            default:
                return "Undefined";
            case 17:
                return "Group Shape";
            case 18:
                return ((Shape) node).getMarkupLanguage() == 1 ? "Shape" : "DrawingML Object";
            case 19:
            case 33:
            case 34:
                return "Comment";
            case 20:
                return ((Footnote) node).getFootnoteType() == 0 ? "Footnote" : "Endnote";
            case 21:
                return "Run";
            case 22:
            case 23:
            case 24:
                return "Field";
            case 25:
                return "Form Field";
            case 26:
                return "Special Character";
            case 27:
                return "Smart Tag";
            case 28:
                return "Structured Document Tag";
            case 31:
                return "Glossary Document";
            case 32:
                return "Building Block";
            case 35:
                return "OfficeMath Object";
            case 37:
                return "System";
            case 38:
                return "Null";
        }
    }

    private static String zzW8(Node node) {
        return com.aspose.words.internal.zzZKN.format("{0}{1}", zzW7(node), zzW6(node));
    }

    private static String zzW9(Node node) {
        if (node == null) {
            return "";
        }
        StringBuilder sb = new StringBuilder();
        for (Node nodeZzYBd = node; nodeZzYBd != null; nodeZzYBd = nodeZzYBd.zzYBd()) {
            if (nodeZzYBd.getNodeType() != 3) {
                if (nodeZzYBd.getNodeType() == 1 || nodeZzYBd.getNodeType() == 31) {
                    break;
                }
                if (nodeZzYBd != node) {
                    com.aspose.words.internal.zzZNH.zzU(sb, ", ");
                }
                com.aspose.words.internal.zzZNH.zzU(sb, zzW8(nodeZzYBd));
            }
        }
        return sb.toString();
    }

    private static String zzYK(Object obj) {
        String strZzW9 = obj instanceof Node ? zzW9((Node) obj) : "";
        return com.aspose.words.internal.zzZYD.zzXk(strZzW9) ? com.alibaba.sdk.android.oss.internal.OooO00o.OooO00o("\r\n\tAt ", strZzW9) : strZzW9;
    }

    public static void zzZ(zzZYW zzzyw, String str) {
        if (zzzyw.zzO3(str) || zzzyw.getWarningCallback() == null) {
            return;
        }
        zzzyw.getWarningCallback().warning(zzM(str, null));
    }

    public static void zzZ(IWarningCallback iWarningCallback, String str, Object obj) {
        if (iWarningCallback != null) {
            iWarningCallback.warning(zzM(str, obj));
        }
    }
}
