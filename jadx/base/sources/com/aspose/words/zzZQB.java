package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
final class zzZQB {
    private static Field zzDp(int i) {
        if (i == 1980) {
            return new FieldCitation();
        }
        if (i == 100500) {
            return new FieldBibliography();
        }
        if (i == 6301) {
            return new FieldDisplayBarcode();
        }
        if (i == 6302) {
            return new FieldMergeBarcode();
        }
        switch (i) {
            case 0:
                return new FieldUnknown();
            case 1:
                throw new UnsupportedOperationException("Should not reach this line.");
            case 2:
                return new FieldUnknown();
            case 3:
                return new FieldRef();
            case 4:
                return new FieldXE();
            case 5:
                return new FieldFootnoteRef();
            case 6:
                return new FieldSet();
            case 7:
                return new FieldIf();
            case 8:
                return new FieldIndex();
            case 9:
                return new FieldTC();
            case 10:
                return new FieldStyleRef();
            case 11:
                return new FieldRD();
            case 12:
                return new FieldSeq();
            case 13:
                return new FieldToc();
            case 14:
                return new FieldInfo();
            case 15:
                return new FieldTitle();
            case 16:
                return new FieldSubject();
            case 17:
                return new FieldAuthor();
            case 18:
                return new FieldKeywords();
            case 19:
                return new FieldComments();
            case 20:
                return new FieldLastSavedBy();
            case 21:
                return new FieldCreateDate();
            case 22:
                return new FieldSaveDate();
            case 23:
                return new FieldPrintDate();
            case 24:
                return new FieldRevNum();
            case 25:
                return new FieldEditTime();
            case 26:
                return new FieldNumPages();
            case 27:
                return new FieldNumWords();
            case 28:
                return new FieldNumChars();
            case 29:
                return new FieldFileName();
            case 30:
                return new FieldTemplate();
            case 31:
                return new FieldDate();
            case 32:
                return new FieldTime();
            case 33:
                return new FieldPage();
            case 34:
                return new FieldFormula();
            case 35:
                return new FieldQuote();
            case 36:
                return new FieldInclude();
            case 37:
                return new FieldPageRef();
            case 38:
                return new FieldAsk();
            case 39:
                return new FieldFillIn();
            case 40:
                return new FieldData();
            case 41:
                return new FieldNext();
            case 42:
                return new FieldNextIf();
            case 43:
                return new FieldSkipIf();
            case 44:
                return new FieldMergeRec();
            case 45:
                return new FieldDde();
            case 46:
                return new FieldDdeAuto();
            case 47:
                return new FieldGlossary();
            case 48:
                return new FieldPrint();
            case 49:
                return new FieldEQ();
            case 50:
                return new FieldGoToButton();
            case 51:
                return new FieldMacroButton();
            case 52:
                return new FieldAutoNumOut();
            case 53:
                return new FieldAutoNumLgl();
            case 54:
                return new FieldAutoNum();
            case 55:
                return new FieldImport();
            case 56:
                return new FieldLink();
            case 57:
                return new FieldSymbol();
            case 58:
                return new FieldEmbed();
            case 59:
                return new FieldMergeField();
            case 60:
                return new FieldUserName();
            case 61:
                return new FieldUserInitials();
            case 62:
                return new FieldUserAddress();
            case 63:
                return new FieldBarcode();
            case 64:
                return new FieldDocVariable();
            case 65:
                return new FieldSection();
            case 66:
                return new FieldSectionPages();
            case 67:
                return new FieldIncludePicture();
            case 68:
                return new FieldIncludeText();
            case 69:
                return new FieldFileSize();
            case 70:
                return new FieldFormText();
            case 71:
                return new FieldFormCheckBox();
            case 72:
                return new FieldNoteRef();
            case 73:
                return new FieldToa();
            case 74:
                return new FieldTA();
            case 75:
                return new FieldMergeSeq();
            default:
                switch (i) {
                    case 77:
                        return new FieldPrivate();
                    case 78:
                        return new FieldDatabase();
                    case 79:
                        return new FieldAutoText();
                    case 80:
                        return new FieldCompare();
                    case 81:
                        return new FieldAddIn();
                    default:
                        switch (i) {
                            case 83:
                                return new FieldFormDropDown();
                            case 84:
                                return new FieldAdvance();
                            case 85:
                                return new FieldDocProperty();
                            default:
                                switch (i) {
                                    case 87:
                                        return new FieldOcx();
                                    case 88:
                                        return new FieldHyperlink();
                                    case 89:
                                        return new FieldAutoTextList();
                                    case 90:
                                        return new FieldListNum();
                                    case 91:
                                        return new zzZQ7();
                                    case 92:
                                        return new FieldBidiOutline();
                                    case 93:
                                        return new FieldAddressBlock();
                                    case 94:
                                        return new FieldGreetingLine();
                                    case 95:
                                        return new FieldShape();
                                    default:
                                        throw new IllegalArgumentException();
                                }
                        }
                }
        }
    }

    public static Field zzU(zzZR4 zzzr4) {
        return zzX(zzzr4.getStart(), zzzr4.getSeparator(), zzzr4.getEnd());
    }

    public static Field zzX(FieldStart fieldStart, FieldSeparator fieldSeparator, FieldEnd fieldEnd) {
        Field fieldZzDp = zzDp(fieldStart.getFieldType());
        fieldZzDp.zzZ(fieldStart, fieldSeparator, fieldEnd);
        return fieldZzDp;
    }
}
