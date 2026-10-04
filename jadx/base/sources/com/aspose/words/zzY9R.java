package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
final class zzY9R {
    private static String[] zzXbn = {"None", "Text", "TextUnknown", "Spaces", "Tab", "EmSpace", "EnSpace", "Em14Space", "IdeographicSpace", "ZeroWidthSpace", "ZeroWidthNoBreakSpace", "CarriageReturnSubstituteSpace", "NonBreakingSpace", "EmDash", "EnDash", "NonBreakingHyphen", "OptionalHyphen", "ZeroWidthNonJoiner", "ZeroWidthJoiner", "DirectionFormattingCharacter", "NoteSeparator", "NoteContinuationSeparator", "Story", "Section", "SectionNextPage", "SectionContinuous", "SectionOddPage", "SectionEvenPage", "SectionNextColumn", "Table", "Row", "Cell", "ParagraphUnknown", "Paragraph", "Page", "PageCom", "Column", "Line", "ParagraphInline", "Wrap", "Shape"};
    private static int[] zzXbm = {0, EditingLanguage.ARABIC_YEMEN, 9216, 10754, 12803, 10768, 10769, 10770, 10782, 10783, 10784, 10785, 9747, 11284, 11285, 9238, 11799, 9752, 9753, 9754, 9244, 9245, 21639, 21857, 21857, 21858, 21859, 21860, 21861, 21595, 21586, 21577, 21536, 21537, 21788, 10528, 21779, 21514, 21515, 21513, 25604};
    private static char[] zzXpC = {ControlChar.SPACE_CHAR, '\t'};

    public static int zzXN(char c) {
        if (c != 2) {
            if (c == 3) {
                return 9244;
            }
            if (c == 4) {
                return 9245;
            }
            if (c != 5) {
                if (c == '\n') {
                    return 10768;
                }
                if (c == '\r') {
                    return 21537;
                }
                if (c == ' ') {
                    return 10754;
                }
                if (c == 160) {
                    return 9747;
                }
                if (c == 1564) {
                    return 9754;
                }
                if (c == 8197) {
                    return 10770;
                }
                if (c == 12288) {
                    return 10782;
                }
                if (c == 65279) {
                    return 10784;
                }
                if (c == 8194) {
                    return 10769;
                }
                if (c == 8195) {
                    return 10768;
                }
                if (c == 8211) {
                    return 11285;
                }
                if (c == 8212) {
                    return 11284;
                }
                switch (c) {
                    case 8203:
                        return 10783;
                    case 8204:
                        return 9752;
                    case 8205:
                        return 9753;
                    case 8206:
                    case 8207:
                        return 9754;
                    default:
                        switch (c) {
                            case 8234:
                            case 8235:
                            case 8236:
                            case 8237:
                            case 8238:
                                return 9754;
                            default:
                                switch (c) {
                                    case 8294:
                                    case 8295:
                                    case 8296:
                                    case 8297:
                                        return 9754;
                                    default:
                                        return EditingLanguage.ARABIC_YEMEN;
                                }
                        }
                }
            }
        }
        return EditingLanguage.ARABIC_YEMEN;
    }

    public static boolean zzlt(int i) {
        return i == 9216 || i == 9217 || i == 9238 || i == 25604 || i == 11284 || i == 11285;
    }

    public static boolean zzlu(int i) {
        return zzYE4.zzmP(i) || i == 21788;
    }

    public static boolean zzlv(int i) {
        return zzlu(i) || i == 21779;
    }

    public static boolean zzlw(int i) {
        return zzYE4.zzmW(i) && 256 == (i & 256);
    }

    public static int zzlx(int i) {
        return i & 7168;
    }

    public static boolean zzmL(int i) {
        return zzYE4.zzmL(i);
    }

    public static boolean zzmM(int i) {
        return zzYE4.zzmM(i);
    }

    public static boolean zzmN(int i) {
        return zzYE4.zzmN(i);
    }

    public static boolean zzmO(int i) {
        return zzYE4.zzmO(i);
    }

    public static boolean zzmP(int i) {
        return zzYE4.zzmP(i);
    }

    public static boolean zzmQ(int i) {
        return zzYE4.zzmQ(i);
    }

    public static boolean zzmR(int i) {
        return zzYE4.zzmR(i);
    }

    public static boolean zzmS(int i) {
        return zzYE4.zzmS(i);
    }

    public static boolean zzmT(int i) {
        return zzYE4.zzmT(i);
    }

    public static boolean zzmU(int i) {
        return zzYE4.zzmU(i);
    }

    public static boolean zzmV(int i) {
        return zzYE4.zzmV(i);
    }

    public static boolean zzmW(int i) {
        return zzYE4.zzmW(i);
    }

    public static boolean zzmX(int i) {
        return zzYE4.zzmX(i);
    }

    public static boolean zzmY(int i) {
        return (i == 10754 || i == 12803 || !zzYE4.zzmY(i)) ? false : true;
    }
}
