package com.aspose.words;

import com.alipay.share.sdk.openapi.APMediaMessage;
import com.google.common.net.HttpHeaders;
import com.microsoft.identity.common.java.AuthenticationConstants;

/* JADX INFO: loaded from: classes6.dex */
final class zzZOO {
    private static com.aspose.words.internal.zzZYI zzYAf = new com.aspose.words.internal.zzZYI(false);
    private static com.aspose.words.internal.zzD3<String> zzYAe = new com.aspose.words.internal.zzD3<>();
    private static com.aspose.words.internal.zzZNR zzYAd = new com.aspose.words.internal.zzZNR("^\\\"?\\\\?([\\w!#-~]*)\\\"?", 0);

    static {
        zzY("", 0, true);
        zzY("=", 34, true);
        zzY("ADDIN", 81, true);
        zzY("ADDRESSBLOCK", 93, true);
        zzY("ADVANCE", 84, true);
        zzY("ASK", 38, true);
        zzY("AUTHOR", 17, true);
        zzY("AUTONUM", 54, true);
        zzY("AUTONUMLGL", 53, true);
        zzY("AUTONUMOUT", 52, true);
        zzY("AUTOTEXT", 79, true);
        zzY("AUTOTEXTLIST", 89, true);
        zzY("BARCODE", 63, true);
        zzY("BIBLIOGRAPHY", FieldType.FIELD_BIBLIOGRAPHY, true);
        zzY("BIDIOUTLINE", 92, true);
        zzY("CITATION", FieldType.FIELD_CITATION, true);
        zzY("COMMENTS", 19, true);
        zzY("COMPARE", 80, true);
        zzY("CREATEDATE", 21, true);
        zzY("DATA", 40, true);
        zzY("DATABASE", 78, true);
        zzY("DATE", 31, true);
        zzY("DDE", 45, true);
        zzY("DDEAUTO", 46, true);
        zzY("DISPLAYBARCODE", FieldType.FIELD_DISPLAY_BARCODE, true);
        zzY("MERGEBARCODE", FieldType.FIELD_MERGE_BARCODE, true);
        zzY("DOCPROPERTY", 85, true);
        zzY("DOCVARIABLE", 64, true);
        zzY("EDITTIME", 25, true);
        zzY("EMBED", 58, true);
        zzY("EQ", 49, true);
        zzY("FILENAME", 29, true);
        zzY("FILESIZE", 69, true);
        zzY("FILLIN", 39, true);
        zzY("FOOTNOTEREF", 5, true);
        zzY("FORMTEXT", 70, true);
        zzY("FORMCHECKBOX", 71, true);
        zzY("FORMDROPDOWN", 83, true);
        zzY("GLOSSARY", 47, true);
        zzY("GOTOBUTTON", 50, true);
        zzY("GREETINGLINE", 94, true);
        zzY("HYPERLINK", 88, true);
        zzY("IF", 7, true);
        zzY("IMPORT", 55, true);
        zzY("INCLUDE", 36, true);
        zzY("INCLUDEPICTURE", 67, true);
        zzY("INCLUDETEXT", 68, true);
        zzY("INDEX", 8, true);
        zzY("INFO", 14, true);
        zzY("KEYWORDS", 18, true);
        zzY("LASTSAVEDBY", 20, true);
        zzY("LINK", 56, true);
        zzY("LISTNUM", 90, true);
        zzY("MACROBUTTON", 51, true);
        zzY("MERGEFIELD", 59, true);
        zzY("MERGEREC", 44, true);
        zzY("MERGESEQ", 75, true);
        zzY("NEXT", 41, true);
        zzY("NEXTIF", 42, true);
        zzY("NOTEREF", 72, true);
        zzY("NUMCHARS", 28, true);
        zzY("NUMPAGES", 26, true);
        zzY("NUMWORDS", 27, true);
        zzY("OCX", 87, true);
        zzY("PAGE", 33, true);
        zzY("PAGEREF", 37, true);
        zzY("PRINT", 48, true);
        zzY("PRINTDATE", 23, true);
        zzY("PRIVATE", 77, true);
        zzY("PRIVE", 77, false);
        zzY("PRIVATESPAN", 77, false);
        zzY("QUOTE", 35, true);
        zzY("RD", 11, true);
        zzY("REF", 3, true);
        zzY("REVNUM", 24, true);
        zzY("SAVEDATE", 22, true);
        zzY("SECTION", 65, true);
        zzY("SECTIONPAGES", 66, true);
        zzY("SEQ", 12, true);
        zzY("SET", 6, true);
        zzY("SHAPE", 95, true);
        zzY("SKIPIF", 43, true);
        zzY("STYLEREF", 10, true);
        zzY("SUBJECT", 16, true);
        zzY("SYMBOL", 57, true);
        zzY("TA", 74, true);
        zzY("TC", 9, true);
        zzY(HttpHeaders.f51754TE, 9, false);
        zzY("INHALT", 9, false);
        zzY("TEMPLATE", 30, true);
        zzY("TIME", 32, true);
        zzY("TITLE", 15, true);
        zzY("TOA", 73, true);
        zzY("TOC", 13, true);
        zzY("USERADDRESS", 62, true);
        zzY("USERINITIALS", 61, true);
        zzY("USERNAME", 60, true);
        zzY("XE", 4, true);
        zzY("EX", 4, false);
        zzY("E", 4, false);
    }

    public static int zzCA(int i) {
        switch (i) {
            case 49:
                return 0;
            case 50:
            case 51:
                return 1;
            default:
                return -1;
        }
    }

    public static boolean zzCB(int i) {
        if (i == 31 || i == 32) {
            return true;
        }
        switch (i) {
            case 21:
            case 22:
            case 23:
                return true;
            default:
                return false;
        }
    }

    public static boolean zzCC(int i) {
        return i == 6 || i == 38;
    }

    public static boolean zzCD(int i) {
        return (i == 0 || i == 2) ? false : true;
    }

    public static boolean zzCE(int i) {
        return zzCC(i);
    }

    public static int zzCF(int i) {
        if (i == 0) {
            return 1;
        }
        if (i != 48 && i != 57 && i != 63 && i != 71 && i != 90 && i != 92 && i != 6301 && i != 83 && i != 84) {
            switch (i) {
                case 41:
                case 42:
                case 43:
                    return 1;
                default:
                    switch (i) {
                        case 50:
                        case 51:
                        case 52:
                        case 53:
                        case 54:
                            break;
                        default:
                            return zzCK(i) ? 0 : 2;
                    }
                    break;
            }
        }
        return 0;
    }

    public static String zzCG(int i) {
        return zzYAe.get(i);
    }

    public static String zzCH(int i) {
        String strZzCG = zzCG(i);
        if (strZzCG != null) {
            return strZzCG;
        }
        throw new IllegalStateException(com.aspose.words.internal.zzZKN.format("Field type '{0}' is invalid or not supported.", zzCu(i)));
    }

    public static int zzCI(int i) {
        int i2 = FieldType.FIELD_CITATION;
        if (i != 1980) {
            i2 = FieldType.FIELD_BIBLIOGRAPHY;
            if (i != 100500) {
                i2 = FieldType.FIELD_DISPLAY_BARCODE;
                if (i != 6301) {
                    i2 = FieldType.FIELD_MERGE_BARCODE;
                    if (i != 6302) {
                        switch (i) {
                            case 1:
                                return 1;
                            case 2:
                                return 2;
                            case 3:
                                return 3;
                            case 4:
                                return 4;
                            case 5:
                                return 5;
                            case 6:
                                return 6;
                            case 7:
                                return 7;
                            case 8:
                                return 8;
                            case 9:
                                return 9;
                            case 10:
                                return 10;
                            case 11:
                                return 11;
                            case 12:
                                return 12;
                            case 13:
                                return 13;
                            case 14:
                                return 14;
                            case 15:
                                return 15;
                            case 16:
                                return 16;
                            case 17:
                                return 17;
                            case 18:
                                return 18;
                            case 19:
                                return 19;
                            case 20:
                                return 20;
                            case 21:
                                return 21;
                            case 22:
                                return 22;
                            case 23:
                                return 23;
                            case 24:
                                return 24;
                            case 25:
                                return 25;
                            case 26:
                                return 26;
                            case 27:
                                return 27;
                            case 28:
                                return 28;
                            case 29:
                                return 29;
                            case 30:
                                return 30;
                            case 31:
                                return 31;
                            case 32:
                                return 32;
                            case 33:
                                return 33;
                            case 34:
                                return 34;
                            case 35:
                                return 35;
                            case 36:
                                return 36;
                            case 37:
                                return 37;
                            case 38:
                                return 38;
                            case 39:
                                return 39;
                            case 40:
                                return 40;
                            case 41:
                                return 41;
                            case 42:
                                return 42;
                            case 43:
                                return 43;
                            case 44:
                                return 44;
                            case 45:
                                return 45;
                            case 46:
                                return 46;
                            case 47:
                                return 47;
                            case 48:
                                return 48;
                            case 49:
                                return 49;
                            case 50:
                                return 50;
                            case 51:
                                return 51;
                            case 52:
                                return 52;
                            case 53:
                                return 53;
                            case 54:
                                return 54;
                            case 55:
                                return 55;
                            case 56:
                                return 56;
                            case 57:
                                return 57;
                            case 58:
                                return 58;
                            case 59:
                                return 59;
                            case 60:
                                return 60;
                            case 61:
                                return 61;
                            case 62:
                                return 62;
                            case 63:
                                return 63;
                            case 64:
                                return 64;
                            case 65:
                                return 65;
                            case 66:
                                return 66;
                            case 67:
                                return 67;
                            case 68:
                                return 68;
                            case 69:
                                return 69;
                            case 70:
                                return 70;
                            case 71:
                                return 71;
                            case 72:
                                return 72;
                            case 73:
                                return 73;
                            case 74:
                                return 74;
                            case 75:
                                return 75;
                            default:
                                switch (i) {
                                    case 77:
                                        return 77;
                                    case 78:
                                        return 78;
                                    case 79:
                                        return 79;
                                    case 80:
                                        return 80;
                                    case 81:
                                        return 81;
                                    default:
                                        switch (i) {
                                            case 83:
                                                return 83;
                                            case 84:
                                                return 84;
                                            case 85:
                                                return 85;
                                            default:
                                                switch (i) {
                                                    case 87:
                                                        return 87;
                                                    case 88:
                                                        return 88;
                                                    case 89:
                                                        return 89;
                                                    case 90:
                                                        return 90;
                                                    case 91:
                                                        return 91;
                                                    case 92:
                                                        return 92;
                                                    case 93:
                                                        return 93;
                                                    case 94:
                                                        return 94;
                                                    case 95:
                                                        return 95;
                                                    default:
                                                        return 0;
                                                }
                                        }
                                }
                        }
                    }
                }
            }
        }
        return i2;
    }

    public static boolean zzCJ(int i) {
        return i == 70 || i == 71 || i == 83;
    }

    public static boolean zzCK(int i) {
        return i == 4 || i == 9 || i == 11 || i == 74 || i == 77;
    }

    public static boolean zzCL(int i) {
        return !zzCM(i);
    }

    public static boolean zzCM(int i) {
        if (i == 10 || i == 12 || i == 72) {
            return true;
        }
        return zzCN(i);
    }

    public static boolean zzCN(int i) {
        return i == 26 || i == 33 || i == 37 || i == 65 || i == 66;
    }

    public static boolean zzCO(int i) {
        if (i == 8 || i == 72 || i == 73) {
            return true;
        }
        return zzCN(i);
    }

    public static boolean zzCs(int i) {
        return i == 81 || i == 77;
    }

    public static boolean zzCt(int i) {
        return i == 55 || i == 67;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v98, types: [java.lang.String, void] */
    public static String zzCu(int i) {
        if (i == 1980) {
            return "FieldCitation";
        }
        if (i == 100500) {
            return "FieldBibliography";
        }
        if (i == 6301) {
            return "FieldDisplayBarcode";
        }
        if (i == 6302) {
            return "FieldMergeBarcode";
        }
        switch (i) {
            case 0:
                return "FieldNone";
            case 1:
                return "FieldCannotParse";
            case 2:
                return "FieldRefNoKeyword";
            case 3:
                return "FieldRef";
            case 4:
                return "FieldIndexEntry";
            case 5:
                return "FieldFootnoteRef";
            case 6:
                return "FieldSet";
            case 7:
                return "FieldIf";
            case 8:
                return "FieldIndex";
            case 9:
                return "FieldTOCEntry";
            case 10:
                return "FieldStyleRef";
            case 11:
                return "FieldRefDoc";
            case 12:
                return "FieldSequence";
            case 13:
                return "FieldTOC";
            case 14:
                return "FieldInfo";
            case 15:
                return "FieldTitle";
            case 16:
                return "FieldSubject";
            case 17:
                return "FieldAuthor";
            case 18:
                return "FieldKeyword";
            case 19:
                return "FieldComments";
            case 20:
                return "FieldLastSavedBy";
            case 21:
                return "FieldCreateDate";
            case 22:
                return "FieldSaveDate";
            case 23:
                return "FieldPrintDate";
            case 24:
                return "FieldRevisionNum";
            case 25:
                return "FieldEditTime";
            case 26:
                return "FieldNumPages";
            case 27:
                return "FieldNumWords";
            case 28:
                return "FieldNumChars";
            case 29:
                return "FieldFileName";
            case 30:
                return "FieldTemplate";
            case 31:
                return "FieldDate";
            case 32:
                return "FieldTime";
            case 33:
                return "FieldPage";
            case 34:
                return "FieldFormula";
            case 35:
                return "FieldQuote";
            case 36:
                return "FieldInclude";
            case 37:
                return "FieldPageRef";
            case 38:
                return "FieldAsk";
            case 39:
                return "FieldFillIn";
            case 40:
                return "FieldData";
            case 41:
                return "FieldNext";
            case 42:
                return "FieldNextIf";
            case 43:
                return "FieldSkipIf";
            case 44:
                return "FieldMergeRec";
            case 45:
                return "FieldDDE";
            case 46:
                return "FieldDDEAuto";
            case 47:
                return "FieldGlossary";
            case 48:
                return "FieldPrint";
            case 49:
                return "FieldEquation";
            case 50:
                return "FieldGoToButton";
            case 51:
                return "FieldMacroButton";
            case 52:
                return "FieldAutoNumOutline";
            case 53:
                return "FieldAutoNumLegal";
            case 54:
                return "FieldAutoNum";
            case 55:
                return "FieldImport";
            case 56:
                return "FieldLink";
            case 57:
                return "FieldSymbol";
            case 58:
                return "FieldEmbed";
            case 59:
                return "FieldMergeField";
            case 60:
                return "FieldUserName";
            case 61:
                return "FieldUserInitials";
            case 62:
                return "FieldUserAddress";
            case 63:
                return "FieldBarcode";
            case 64:
                return "FieldDocVariable";
            case 65:
                return "FieldSection";
            case 66:
                return "FieldSectionPages";
            case 67:
                return "FieldIncludePicture";
            case 68:
                return "FieldIncludeText";
            case 69:
                return "FieldFileSize";
            case 70:
                return "FieldFormTextInput";
            case 71:
                return "FieldFormCheckBox";
            case 72:
                return "FieldNoteRef";
            case 73:
                return "FieldTOA";
            case 74:
                return "FieldTOAEntry";
            case 75:
                return "FieldMergeSeq";
            default:
                switch (i) {
                    case 77:
                        return "FieldPrivate";
                    case 78:
                        return "FieldDatabase";
                    case 79:
                        return "FieldAutoText";
                    case 80:
                        return "FieldCompare";
                    case 81:
                        return "FieldAddin";
                    default:
                        switch (i) {
                            case 83:
                                return "FieldFormDropDown";
                            case 84:
                                return "FieldAdvance";
                            case 85:
                                return "FieldDocProperty";
                            default:
                                switch (i) {
                                    case 87:
                                        return "FieldOcx";
                                    case 88:
                                        return "FieldHyperlink";
                                    case 89:
                                        return "FieldAutoTextList";
                                    case 90:
                                        return "FieldListNum";
                                    case 91:
                                        return "FieldHtmlActiveX";
                                    case 92:
                                        return "FieldBidiOutline";
                                    case 93:
                                        return "FieldAddressBlock";
                                    case 94:
                                        return "FieldGreetingLine";
                                    case 95:
                                        return "FieldShape";
                                    default:
                                        throw new IllegalStateException((String) APMediaMessage.IMediaObject.serialize(i));
                                }
                        }
                }
        }
    }

    public static boolean zzCv(int i) {
        return i == 13 || i == 36 || i == 55 || i == 70 || i == 79 || i == 88 || i == 67 || i == 68;
    }

    public static boolean zzCw(int i) {
        return i == 35 || i == 95;
    }

    public static boolean zzCx(int i) {
        return i == 7;
    }

    public static boolean zzCy(int i) {
        return i == 59;
    }

    public static boolean zzCz(int i) {
        return i != 34;
    }

    private static Node zzJ(Node node, boolean z) {
        while (node.isComposite() && node.zzYAY() != 6 && node.getNodeType() != 5) {
            CompositeNode compositeNode = (CompositeNode) node;
            if (!compositeNode.hasChildNodes()) {
                if (node.getNodeType() != 8) {
                    break;
                }
                compositeNode.appendChild(new Run(node.getDocument(), ""));
            }
            node = z ? compositeNode.getFirstChild() : compositeNode.getLastChild();
        }
        return node;
    }

    private static com.aspose.words.internal.zzZOP zzLA(String str) throws Exception {
        com.aspose.words.internal.zzZKL zzzklZzWo = com.aspose.words.internal.zzZVR.zzWo(str);
        if (zzY(zzzklZzWo)) {
            return com.aspose.words.internal.zzZXR.zzX0(zzzklZzWo.zzf3());
        }
        if (zzZ(zzzklZzWo) != null) {
            str = zzZ(zzzklZzWo);
        }
        if (com.aspose.words.internal.zzZOU.zzYb(str)) {
            return com.aspose.words.internal.zzZOU.zzVj(str);
        }
        return null;
    }

    public static boolean zzLB(String str) {
        return zzCz(zzLE(str));
    }

    public static int zzLC(String str) {
        return zzCA(zzLE(str));
    }

    private static String zzLD(String str) {
        com.aspose.words.internal.zzZNT zzzntZzUX = zzYAd.zzUX(str);
        return zzzntZzUX.zzhJ().getCount() > 0 ? zzzntZzUX.zzhJ().zzQx(zzzntZzUX.zzhJ().getCount() - 1).getValue() : "";
    }

    public static int zzLE(String str) {
        String strZzTX = com.aspose.words.internal.zzZKN.zzTX(str);
        if (!com.aspose.words.internal.zzZYD.zzXk(strZzTX)) {
            return 0;
        }
        if (strZzTX.charAt(0) == '=') {
            return 34;
        }
        int i = zzYAf.get(zzLD(strZzTX));
        if (com.aspose.words.internal.zzZYI.zzWm(i)) {
            return 0;
        }
        return i;
    }

    public static boolean zzM(zzYWB zzywb) {
        return !zzywb.zz13() && zzywb.zzYA1().getNode().getNodeType() == 24;
    }

    public static zzYWB zzP(Node node, Node node2) {
        return new zzYWB(zzJ(node, true), zzJ(node2, false));
    }

    public static boolean zzT(FieldChar fieldChar) {
        if (zzCD(fieldChar.getFieldType())) {
            return zzCC(fieldChar.getFieldType());
        }
        zzZR4 zzzr4ZzW = zzZR4.zzW(fieldChar);
        return zzX(zzzr4ZzW.getStart(), zzzr4ZzW.zzZgr());
    }

    public static boolean zzX(FieldStart fieldStart, FieldChar fieldChar) {
        return zzCD(fieldStart.getFieldType()) ? zzCC(fieldStart.getFieldType()) : !FieldUnknown.zzY(fieldStart, fieldChar);
    }

    public static boolean zzXD(int i, int i2) {
        return i != 4 ? i == 9 && i2 == 0 : i2 == 0;
    }

    public static com.aspose.words.internal.zzZOP zzY(String str, IResourceLoadingCallback iResourceLoadingCallback) throws Exception {
        if (iResourceLoadingCallback == null) {
            return zzLA(str);
        }
        ResourceLoadingArgs resourceLoadingArgs = new ResourceLoadingArgs("", str, 2);
        int iResourceLoading = iResourceLoadingCallback.resourceLoading(resourceLoadingArgs);
        if (iResourceLoading == 0) {
            return zzLA(str);
        }
        if (iResourceLoading == 1) {
            return null;
        }
        if (iResourceLoading == 2) {
            return new com.aspose.words.internal.zzZOR(resourceLoadingArgs.getData());
        }
        throw new IllegalArgumentException();
    }

    private static String zzZ(com.aspose.words.internal.zzZKL zzzkl) {
        if (zzzkl == null) {
            return null;
        }
        try {
            return zzzkl.zzf5();
        } catch (Exception unused) {
            return null;
        }
    }

    public static int zzf(Field field) {
        if (field.hasSeparator()) {
            return ((field.getType() == 68 || field.getType() == 36) && field.getSeparator().getAncestor(2) != field.getEnd().getAncestor(2)) ? 1 : 0;
        }
        return 0;
    }

    public static int zzg(Field field) {
        if (field.getType() != 8) {
            return 2;
        }
        FieldIndex fieldIndex = (FieldIndex) field;
        return (!fieldIndex.zzZdz() || fieldIndex.zzZdy().zzxK() <= 0) ? 2 : 1;
    }

    public static boolean zzh(Field field) {
        int type = field.getType();
        if (type == 0 || type == 7 || type == 55) {
            return true;
        }
        return type != 72 ? type == 95 || type == 2 || type == 3 || type == 35 || type == 36 || type == 67 || type == 68 || type == 78 || type == 79 : ((FieldNoteRef) field).getInsertReferenceMark();
    }

    public static boolean zzi(Field field) {
        return zzCD(field.getType()) ? zzCC(field.getType()) : !((FieldUnknown) field).zzZbA();
    }

    public static boolean zzj(Field field) {
        if (!field.isLocked()) {
            return false;
        }
        int type = field.getType();
        return ((type == 26 || type == 33) && field.zzZgt()) ? false : true;
    }

    public static boolean zzz(int i, String str) {
        return i == 74 && "\\l".equals(str);
    }

    public static boolean zzX(BookmarkStart bookmarkStart) {
        Node previousSibling = bookmarkStart.getPreviousSibling();
        return previousSibling != null && previousSibling.getNodeType() == 23 && zzCC(((FieldSeparator) previousSibling).getFieldType());
    }

    public static Bookmark zzT(Field field, String str) throws Exception {
        if (field.zzZgm()) {
            return field.zzZgo().zzLG(str);
        }
        return field.getStart().getDocument().getRange().getBookmarks().get(str);
    }

    private static boolean zzY(com.aspose.words.internal.zzZKL zzzkl) {
        if (zzzkl == null || !zzzkl.zzf4()) {
            return false;
        }
        String lowerCase = zzzkl.getScheme().toLowerCase();
        return "http".equals(lowerCase) || AuthenticationConstants.HTTPS_PROTOCOL_STRING.equals(lowerCase);
    }

    private static void zzY(String str, int i, boolean z) {
        zzYAf.add(str, i);
        if (z) {
            zzYAe.add(i, str);
        }
    }
}
