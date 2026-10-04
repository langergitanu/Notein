package com.aspose.words;

import com.aspose.words.ref.Ref;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.google.firebase.messaging.Constants;
import com.huawei.hms.network.embedded.C18437z2;
import com.huawei.hms.support.hianalytics.HiAnalyticsConstant;
import com.microsoft.identity.common.java.telemetry.TelemetryEventStrings;
import com.orion.notein.domain.models.note.NoteMeta;
import org.w3c.dom.Attr;

/* JADX INFO: loaded from: classes6.dex */
final class zzYS1 {
    private static final com.aspose.words.internal.zzZHW zzUR = new com.aspose.words.internal.zzZHW("bookmark-ref", "editing-cycles", "editing-duration", "keywords", "subject", "description", "a", "database-display", "database-next", "database-row-number", "sequence", "file-name", "template-name", "variable-set", "variable-get", "page-number", "author-name", "author-initials", "initial-creator", "date", "time", "print-date", "print-time", "creation-date", "creation-time", NoteMeta.PROPERTY_TITLE, "modification-time", "modification-date", "creator", "paragraph-count", "character-count", "page-count", "word-count", "text-input", "drop-down", "user-defined", "alphabetical-index-mark", "user-field-get", "name", "data-style-name", "display", "num-format", "num-letter-sync", "database-name", "table-name", "table-type", "value", "condition", "column-name", "", "connection-resource", "boolean-value", "date-value", "string-value", "time-value", "fixed", "ref-name", "formula", "key1", "key2", "key1-phonetic", "key2-phonetic", "main-entry", "string-value-phonetic", "page", "number", HiAnalyticsConstant.HaKey.BI_KEY_DIRECTION, "text", "chapter", "number-no-superior", "number-all-superior", "target-frame-name", "href", "style-name", "visited-style-name", "actuate", "show", C18437z2.f56754h, FirebaseAnalytics.Param.CURRENCY, "value-type", Constants.ScionAnalytics.PARAM_LABEL, "page-adjust", "select-page", "time-adjust", "date-adjust");

    private static String zzEO(String str) throws Exception {
        String strZzZ = com.aspose.words.internal.zzZKN.zzZ(com.aspose.words.internal.zzZKN.zzZ(com.aspose.words.internal.zzZKN.zzZ(str, ControlChar.PARAGRAPH_BREAK_CHAR, ControlChar.SPACE_CHAR), '\n', ControlChar.SPACE_CHAR), '\t', ControlChar.SPACE_CHAR);
        if (!com.aspose.words.internal.zzZYD.zzXh(strZzZ)) {
            strZzZ = com.aspose.words.internal.zzZKN.zzTX(strZzZ);
        }
        while (!com.aspose.words.internal.zzZKN.equals(strZzZ, strZzZ.replace("  ", " "))) {
            strZzZ = strZzZ.replace("  ", " ");
        }
        StringBuilder sb = new StringBuilder();
        org.w3c.dom.NodeList childNodes = com.aspose.words.internal.zzZSN.zzN("<fake xmlns:text=\"uri\">" + strZzZ + "</fake>", true).getFirstChild().getChildNodes();
        for (int i = 0; i < childNodes.getLength(); i++) {
            org.w3c.dom.Node nodeItem = childNodes.item(i);
            if (com.aspose.words.internal.zzZSN.zzZ(nodeItem, 4)) {
                com.aspose.words.internal.zzZNH.zzU(sb, nodeItem.getNodeValue());
            }
            if (com.aspose.words.internal.zzZSN.zzZ(nodeItem, 1)) {
                if ("line-break".equals(nodeItem.getLocalName())) {
                    com.aspose.words.internal.zzZNH.zzU(sb, ControlChar.LINE_BREAK);
                }
                if ("tab".equals(nodeItem.getLocalName())) {
                    com.aspose.words.internal.zzZNH.zzU(sb, ControlChar.TAB);
                }
                if ("s".equals(nodeItem.getLocalName())) {
                    Attr attr = (Attr) nodeItem.getAttributes().getNamedItem("text:c");
                    int i2 = attr != null ? Integer.parseInt(attr.getNodeValue()) : 1;
                    for (int i3 = 0; i3 < i2; i3++) {
                        com.aspose.words.internal.zzZNH.zzU(sb, ControlChar.zzZs5);
                    }
                }
            }
        }
        return sb.toString();
    }

    private static void zzM(zzYQ7 zzyq7, Paragraph paragraph, zzYEF zzyef, Style style) throws Exception {
        if (zzyef == null) {
            zzyef = paragraph.zzYp5();
        }
        FormField formField = new FormField(zzyq7.getDocument(), new zzZMM(), zzyef);
        formField.zzZ6O().setTextInputType(0);
        formField.zzZ6O().setName(zzyq7.zzYuT().zzV("description", null));
        Document document = zzyq7.getDocument();
        paragraph.appendChild(new FieldStart(document, zzyef, 70));
        zzZ(zzyq7, (CompositeNode) paragraph, "FORMTEXT", zzyef, style);
        paragraph.appendChild(formField);
        paragraph.appendChild(new FieldSeparator(document, zzyef, 70));
        zzZ(zzyq7, (CompositeNode) paragraph, zzEO(com.aspose.words.internal.zzZSN.zzZ(zzyq7.zzYuT().zz6())), zzyef, style);
        paragraph.appendChild(new FieldEnd(document, zzyef, 70, true));
    }

    private static void zzN(zzYQ7 zzyq7, Paragraph paragraph, zzYEF zzyef, Style style) {
        if (zzyef == null) {
            zzyef = paragraph.zzYp5();
        }
        Document document = zzyq7.getDocument();
        FormField formField = new FormField(document, new zzZMM(), zzyef);
        paragraph.appendChild(new FieldStart(document, zzyef, 83));
        zzZ(zzyq7, (CompositeNode) paragraph, "FORMDROPDOWN", zzyef, style);
        paragraph.appendChild(formField);
        paragraph.appendChild(new FieldEnd(document, zzyef, 83, false));
        zzYQ9 zzyq9ZzYuT = zzyq7.zzYuT();
        while (zzyq9ZzYuT.zzY("drop-down", 7)) {
            int iZzTP = zzUR.zzTP(zzyq9ZzYuT.getLocalName());
            if (iZzTP == 49) {
                formField.zzLl(zzyq9ZzYuT.getValue());
            } else if (iZzTP != 80) {
                zzyq7.zzYuT().zzk();
            } else if (formField.getDropDownItems().getCount() < 25) {
                formField.getDropDownItems().add(zzyq9ZzYuT.zzV("value", ""));
            } else {
                zzyq7.zzT(1, "The first 25 elements in a dropdown form field have been imported to Aspose.Word model only. There can be a maximum of 25 items in a dropdown form field in OOXML and Aspose.Word model.");
            }
        }
    }

    private static void zzO(zzYQ7 zzyq7, Paragraph paragraph, zzYEF zzyef, Style style) {
        zzYQ9 zzyq9ZzYuT = zzyq7.zzYuT();
        String value = null;
        while (zzyq9ZzYuT.zzi()) {
            String localName = zzyq9ZzYuT.getLocalName();
            if ("name".equals(localName)) {
                value = zzyq9ZzYuT.getValue();
            } else if ("data-style-name".equals(localName) || "display".equals(localName)) {
                zzyq7.zzZ(256, false, "text:variable-get");
            }
        }
        if (com.aspose.words.internal.zzZYD.zzXk(value)) {
            zzZ(zzyq7, paragraph, 3, com.aspose.words.internal.zzZKN.format("REF \"{0}\"", value), zzyq9ZzYuT.readString(), zzyef, style, TelemetryEventStrings.Value.TRUE.equals(zzyq9ZzYuT.zzV("fixed", null)));
        }
    }

    private static void zzP(zzYQ7 zzyq7, Paragraph paragraph, zzYEF zzyef, Style style) {
        zzYQ9 zzyq9ZzYuT = zzyq7.zzYuT();
        Ref ref = new Ref(null);
        Ref ref2 = new Ref(null);
        Ref ref3 = new Ref(null);
        zzZ(zzyq7, zzyq9ZzYuT, (Ref<String>) ref, (Ref<String>) ref2, (Ref<String>) ref3);
        String str = (String) ref.get();
        String string = (String) ref2.get();
        String str2 = (String) ref3.get();
        if (!com.aspose.words.internal.zzZYD.zzXk(string)) {
            string = zzyq9ZzYuT.readString();
        }
        String str3 = string;
        if (!com.aspose.words.internal.zzZYD.zzXk(str) || "none".equals(str2)) {
            return;
        }
        boolean zEquals = TelemetryEventStrings.Value.TRUE.equals(zzyq9ZzYuT.zzV("fixed", null));
        zzZ(zzyq7, paragraph, 6, com.aspose.words.internal.zzZKN.format("SET {0} \"{1}\"", str, str3), "", zzyef, style, zEquals);
        zzZ(zzyq7, paragraph, 3, com.aspose.words.internal.zzZKN.format("REF \"{0}\"", str), str3, zzyef, style, zEquals);
        Document document = zzyq7.getDocument();
        if (document.getRange().getBookmarks().indexOf(str) == -1) {
            paragraph.appendChild(new BookmarkStart(document, str));
            paragraph.appendChild(new BookmarkEnd(document, str));
        }
    }

    private static void zzQ(zzYQ7 zzyq7, Paragraph paragraph, zzYEF zzyef, Style style) {
        String strZzV = zzyq7.zzYuT().zzV("reference-format", "text");
        String strZzV2 = zzyq7.zzYuT().zzV("ref-name", "");
        switch (zzUR.zzTP(strZzV)) {
            case 64:
            case 65:
                zzZ(zzyq7, paragraph, 37, com.aspose.words.internal.zzZKN.format("PAGEREF {0}", strZzV2), zzyef, style);
                break;
            case 66:
                zzZ(zzyq7, paragraph, 3, com.aspose.words.internal.zzZKN.format("REF {0} \\p", strZzV2), zzyef, style);
                break;
            case 67:
                zzZ(zzyq7, paragraph, 3, com.aspose.words.internal.zzZKN.format("REF {0}", strZzV2), zzyef, style);
                break;
            case 68:
            case 69:
            case 70:
                zzyq7.zzv("text:bookmark-ref", "text:reference-format", strZzV);
                break;
            default:
                zzyq7.zzYi("text:reference-format", strZzV);
                break;
        }
    }

    private static void zzR(zzYQ7 zzyq7, Paragraph paragraph, zzYEF zzyef, Style style) {
        zzYQ9 zzyq9ZzYuT = zzyq7.zzYuT();
        String value = "";
        while (zzyq9ZzYuT.zzi()) {
            int iZzTP = zzUR.zzTP(zzyq9ZzYuT.getLocalName());
            if (iZzTP != 38) {
                if (iZzTP != 41) {
                    if (iZzTP != 42) {
                        if (iZzTP != 56) {
                            if (iZzTP != 57) {
                                zzyq7.zzYi("sequence", zzyq9ZzYuT.getLocalName());
                            }
                        }
                    }
                    zzyq7.zzZ(1, false, "text:sequence");
                }
                zzyq7.zzZ(256, false, "text:sequence");
            } else {
                value = zzyq9ZzYuT.getValue();
            }
        }
        zzZ(zzyq7, paragraph, 12, com.aspose.words.internal.zzZKN.format("SEQ {0}", value), zzyef, style);
    }

    private static void zzS(zzYQ7 zzyq7, Paragraph paragraph, zzYEF zzyef, Style style) {
        zzYQ9 zzyq9ZzYuT = zzyq7.zzYuT();
        String value = "";
        while (zzyq9ZzYuT.zzi()) {
            int iZzTP = zzUR.zzTP(zzyq9ZzYuT.getLocalName());
            if (iZzTP != 38) {
                if (iZzTP != 39 && iZzTP != 46) {
                    switch (iZzTP) {
                        case 51:
                        case 52:
                        case 53:
                        case 54:
                        case 55:
                            break;
                        default:
                            zzyq7.zzYi("text:user-defined", zzyq9ZzYuT.getLocalName());
                            continue;
                    }
                }
                zzyq7.zzZ(1, false, "text:user-defined");
            } else {
                value = zzyq9ZzYuT.getValue();
            }
        }
        zzZ(zzyq7, paragraph, 85, com.aspose.words.internal.zzZKN.format("DOCPROPERTY \"{0}\"", value), zzyef, style);
    }

    private static void zzT(zzYQ7 zzyq7, Paragraph paragraph, zzYEF zzyef, Style style) {
        zzYQ9 zzyq9ZzYuT = zzyq7.zzYuT();
        while (zzyq9ZzYuT.zzi()) {
            String localName = zzyq9ZzYuT.getLocalName();
            if ("data-style-name".equals(localName)) {
                zzyq7.zzZ(256, false, "text:editing-duration");
            } else if ("duration".equals(localName) || "fixed".equals(localName)) {
                zzyq7.zzZ(1, false, "text:editing-duration");
            }
        }
        zzZ(zzyq7, paragraph, 25, "EDITTIME", zzyef, style);
    }

    private static void zzU(zzYQ7 zzyq7, Paragraph paragraph, zzYEF zzyef, Style style) {
        zzYQ9 zzyq9ZzYuT = zzyq7.zzYuT();
        String value = null;
        while (zzyq9ZzYuT.zzi()) {
            int iZzTP = zzUR.zzTP(zzyq9ZzYuT.getLocalName());
            if (iZzTP != 39) {
                if (iZzTP != 48) {
                    switch (iZzTP) {
                        case 43:
                        case 44:
                        case 45:
                            break;
                        default:
                            zzyq7.zzYi("text:database-display", zzyq9ZzYuT.getLocalName());
                            continue;
                    }
                } else {
                    value = zzyq9ZzYuT.getValue();
                }
            }
            zzyq7.zzZ(1, false, "text:database-display");
        }
        zzZ(zzyq7, paragraph, 59, com.aspose.words.internal.zzZKN.format("MERGEFIELD {0}", value), zzY(zzyq7, "database-display"), zzyef, style, false);
    }

    private static void zzV(zzYQ7 zzyq7, Paragraph paragraph, zzYEF zzyef, Style style) {
        zzYQ9 zzyq9ZzYuT = zzyq7.zzYuT();
        while (zzyq9ZzYuT.zzi()) {
            switch (zzUR.zzTP(zzyq9ZzYuT.getLocalName())) {
                case 43:
                case 44:
                case 45:
                case 47:
                    zzyq7.zzZ(1, false, "text:database-next");
                    break;
                case 46:
                default:
                    zzyq7.zzYi("text:database-next", zzyq9ZzYuT.getLocalName());
                    break;
            }
        }
        zzZ(zzyq7, paragraph, 41, "NEXT", zzY(zzyq7, "database-next"), zzyef, style, false);
    }

    private static void zzW(zzYQ7 zzyq7, Paragraph paragraph, zzYEF zzyef, Style style) {
        zzYQ9 zzyq9ZzYuT = zzyq7.zzYuT();
        while (zzyq9ZzYuT.zzi()) {
            String localName = zzyq9ZzYuT.getLocalName();
            switch (zzUR.zzTP(localName)) {
                case 41:
                    zzyq7.zzZ(256, false, "text:database-row-number");
                    break;
                case 42:
                case 43:
                case 44:
                case 45:
                case 46:
                    zzyq7.zzZ(1, false, "text:database-row-number");
                    break;
                default:
                    zzyq7.zzYi("database-row-number", localName);
                    break;
            }
        }
        zzZ(zzyq7, paragraph, 44, "MERGEREC", zzY(zzyq7, "database-row-number"), zzyef, style, false);
    }

    private static void zzX(zzYQ7 zzyq7, Paragraph paragraph, zzYEF zzyef, Style style) {
        zzX(zzyq7, "text:file-name");
        zzZ(zzyq7, paragraph, 29, zzYOU.zzDB(zzyq7.zzYuT().zzV("display", "name-and-extension")), zzyef, style);
    }

    private static void zzY(zzYQ7 zzyq7, Paragraph paragraph, zzYEF zzyef, Style style) {
        zzZ(zzyq7, paragraph, 30, "full".equals(zzyq7.zzYuT().zzV("display", "name-and-extension")) ? "\\p" : "", zzyef, style);
    }

    public static boolean zzZ(zzYQ7 zzyq7, Paragraph paragraph, zzYEF zzyef, Style style, zzYEF zzyef2, CompositeNode compositeNode) throws Exception {
        zzYQ9 zzyq9ZzYuT = zzyq7.zzYuT();
        switch (zzUR.zzTP(zzyq9ZzYuT.getLocalName())) {
            case 0:
                zzQ(zzyq7, paragraph, zzyef, style);
                break;
            case 1:
                zzX(zzyq7, "text:editing-cycles");
                zzZ(zzyq7, paragraph, 24, "REVNUM", zzyef, style);
                break;
            case 2:
                zzT(zzyq7, paragraph, zzyef, style);
                break;
            case 3:
                zzX(zzyq7, "text:keywords");
                zzZ(zzyq7, paragraph, 18, "KEYWORDS", zzyef, style);
                break;
            case 4:
                zzX(zzyq7, "text:subject");
                zzZ(zzyq7, paragraph, 16, "SUBJECT", zzyef, style);
                break;
            case 5:
                zzX(zzyq7, "text:description");
                zzZ(zzyq7, paragraph, 19, "COMMENTS", zzyef, style);
                break;
            case 6:
                zzZ(zzyq7, paragraph, zzyef2, compositeNode, zzyef, style);
                break;
            case 7:
                zzU(zzyq7, paragraph, zzyef, style);
                break;
            case 8:
                zzV(zzyq7, paragraph, zzyef, style);
                break;
            case 9:
                zzW(zzyq7, paragraph, zzyef, style);
                break;
            case 10:
                zzR(zzyq7, paragraph, zzyef, style);
                break;
            case 11:
                zzX(zzyq7, paragraph, zzyef, style);
                break;
            case 12:
                zzY(zzyq7, paragraph, zzyef, style);
                break;
            case 13:
                zzP(zzyq7, paragraph, zzyef, style);
                break;
            case 14:
                zzO(zzyq7, paragraph, zzyef, style);
                break;
            case 15:
                zzZ(zzyq7, paragraph, "PAGE", zzyef, style);
                break;
            case 16:
                zzX(zzyq7, "text:author-name");
                zzZ(zzyq7, paragraph, 60, "USERNAME", zzyef, style);
                break;
            case 17:
                zzX(zzyq7, "text:author-initials");
                zzZ(zzyq7, paragraph, 61, "USERINITIALS", zzyef, style);
                break;
            case 18:
                zzX(zzyq7, "text:initial-creator");
                zzZ(zzyq7, paragraph, 17, "AUTHOR", zzyef, style);
                break;
            case 19:
                zzY(zzyq7, paragraph, "DATE", zzyef, style);
                break;
            case 20:
                zzY(zzyq7, paragraph, "TIME", zzyef, style);
                break;
            case 21:
            case 22:
                zzY(zzyq7, paragraph, "PRINTDATE", zzyef, style);
                break;
            case 23:
            case 24:
                zzY(zzyq7, paragraph, "CREATEDATE", zzyef, style);
                break;
            case 25:
                zzX(zzyq7, "text:title");
                zzZ(zzyq7, paragraph, 15, "TITLE", zzyef, style);
                break;
            case 26:
            case 27:
                zzY(zzyq7, paragraph, "SAVEDATE", zzyef, style);
                break;
            case 28:
                zzX(zzyq7, "text:creator");
                zzZ(zzyq7, paragraph, 20, "LASTSAVEDBY", zzyef, style);
                break;
            case 29:
                zzZ(zzyq7, paragraph, zzyef, style, "paragraph-count", 85, "DOCPROPERTY PARAGRAPHS");
                break;
            case 30:
                zzZ(zzyq7, paragraph, zzyef, style, "character-count", 85, "DOCPROPERTY CHARACTERSWITHSPACES");
                break;
            case 31:
                zzZ(zzyq7, paragraph, zzyef, style, "page-count", 26, "NUMPAGES");
                break;
            case 32:
                zzZ(zzyq7, paragraph, zzyef, style, "word-count", 27, "NUMWORDS");
                break;
            case 33:
                zzM(zzyq7, paragraph, zzyef, style);
                break;
            case 34:
                zzN(zzyq7, paragraph, zzyef, style);
                break;
            case 35:
                zzS(zzyq7, paragraph, zzyef, style);
                break;
            case 36:
                zzZ(zzyq7, paragraph, zzyq9ZzYuT);
                break;
            case 37:
                zzZ(zzyq7, paragraph, zzyef, style);
                break;
        }
        return true;
    }

    private static String zzY(zzYQ7 zzyq7, String str) {
        zzYQ9 zzyq9ZzYuT = zzyq7.zzYuT();
        String str2 = "";
        while (zzyq9ZzYuT.zzY(str, 7)) {
            int iZzTP = zzUR.zzTP(zzyq9ZzYuT.getLocalName());
            if (iZzTP == 49) {
                str2 = com.aspose.words.internal.zzZKN.format("{0}{1}", str2, zzyq9ZzYuT.getValue());
            } else if (iZzTP != 50) {
                zzyq7.zzYuT().zzk();
            } else {
                zzyq7.zzZ(1, true, com.aspose.words.internal.zzZKN.format("text:{0}", str));
            }
        }
        return str2;
    }

    private static void zzX(zzYQ7 zzyq7, String str) {
        if (zzyq7.zzYuT().zzV("fixed", null) != null) {
            zzyq7.zzZ(1, false, str, "text:fixed");
        }
    }

    private static void zzY(zzYQ7 zzyq7, Paragraph paragraph, zzYEF zzyef, Style style, String str) {
        if ("text".equals(str)) {
            FieldStart fieldStart = new FieldStart(zzyq7.getDocument(), zzyef, 88);
            boolean zEquals = TelemetryEventStrings.Value.TRUE.equals(zzyq7.zzYuT().zzV("fixed", null));
            zzYOX.zzZ(zzyq7, fieldStart);
            zzZ(zzyq7, paragraph, style, fieldStart, zEquals);
        }
    }

    private static void zzY(zzYQ7 zzyq7, Paragraph paragraph, String str, zzYEF zzyef, Style style) {
        String str2;
        zzYQ9 zzyq9ZzYuT = zzyq7.zzYuT();
        String str3 = com.aspose.words.internal.zzZKN.format("text:{0}", zzyq9ZzYuT.getLocalName());
        String value = null;
        boolean zEquals = false;
        while (zzyq9ZzYuT.zzi()) {
            int iZzTP = zzUR.zzTP(zzyq9ZzYuT.getLocalName());
            if (iZzTP == 39) {
                value = zzyq9ZzYuT.getValue();
            } else if (iZzTP == 52 || iZzTP == 54) {
                zzyq7.zzZ(1, false, str3);
            } else if (iZzTP == 55) {
                zEquals = TelemetryEventStrings.Value.TRUE.equals(zzyq9ZzYuT.getValue());
            } else if (iZzTP != 83 && iZzTP != 84) {
                zzyq7.zzYi("*-date or *-time", zzyq9ZzYuT.getLocalName());
            } else {
                zzyq7.zzZ(256, false, str3);
            }
        }
        zzYSA zzysa = (zzYSA) zzyq7.zzYuS().zzY(value, null, zzyq7.zzYuO(), true);
        if (zzysa != null) {
            if (zzysa.zzZYh() != null) {
                zzysa.zzZYh().zzY(zzyef);
            }
            str2 = com.aspose.words.internal.zzZKN.format(" \\@ \"{0}\"", zzysa.getFormat());
        } else {
            str2 = "";
        }
        zzZ(zzyq7, paragraph, zzZOO.zzLE(str), com.aspose.words.internal.zzZKN.format("{0}{1}", str, str2), zzyq9ZzYuT.readString(), zzyef, style, zEquals);
    }

    private static void zzZ(zzYQ7 zzyq7, Paragraph paragraph, zzYEF zzyef, Style style) {
        zzYQ9 zzyq9ZzYuT = zzyq7.zzYuT();
        String value = "";
        while (zzyq9ZzYuT.zzi()) {
            switch (zzUR.zzTP(zzyq9ZzYuT.getLocalName())) {
                case 38:
                    value = zzyq9ZzYuT.getValue();
                    break;
                case 39:
                case 40:
                    zzyq7.zzZ(1, false, "text:user-field-get");
                    break;
                default:
                    zzyq7.zzYi("text:user-field-get", zzyq9ZzYuT.getLocalName());
                    break;
            }
        }
        zzZ(zzyq7, paragraph, 64, com.aspose.words.internal.zzZKN.format("DOCVARIABLE \"{0}\"", value), zzyef, style);
    }

    private static void zzZ(zzYQ7 zzyq7, Paragraph paragraph, zzYEF zzyef, Style style, String str, int i, String str2) {
        zzYQ9 zzyq9ZzYuT = zzyq7.zzYuT();
        String str3 = str2;
        while (zzyq9ZzYuT.zzi()) {
            int iZzTP = zzUR.zzTP(zzyq9ZzYuT.getLocalName());
            if (iZzTP != 41) {
                if (iZzTP != 42) {
                    zzyq7.zzYi(str, zzyq9ZzYuT.getLocalName());
                } else {
                    zzyq7.zzZ(1, false, str);
                }
            } else if (i != 26 && i != 27) {
                zzyq7.zzZ(256, false, str);
            } else {
                str3 = com.aspose.words.internal.zzZKN.format("{0}{1}", str3, zzYOU.zzDD(zzyq9ZzYuT.getValue()));
            }
        }
        zzZ(zzyq7, paragraph, i, str3, zzyef, style);
    }

    private static void zzZ(zzYQ7 zzyq7, Paragraph paragraph, zzYQ9 zzyq9) {
        String str = null;
        String str2 = null;
        String str3 = null;
        while (zzyq9.zzi()) {
            String value = zzyq9.getValue();
            int iZzTP = zzUR.zzTP(zzyq9.getLocalName());
            if (iZzTP != 53) {
                switch (iZzTP) {
                    case 58:
                        str2 = value;
                        break;
                    case 59:
                        str3 = value;
                        break;
                    case 60:
                    case 61:
                    case 62:
                    case 63:
                        zzyq7.zzZ(256, false, "text:alphabetical-index-mark");
                        break;
                    default:
                        zzyq7.zzYi("alphabetical-index-mark", zzyq9.getLocalName());
                        break;
                }
            } else {
                str = value;
            }
        }
        String str4 = "";
        String str5 = str2 != null ? com.aspose.words.internal.zzZKN.format(":{0}", str2) : "";
        if (str3 != null) {
            str4 = com.aspose.words.internal.zzZKN.format(":{0}", str3);
        }
        String str6 = com.aspose.words.internal.zzZKN.format("XE \"{0}{1}{2}\"", str, str5, str4);
        paragraph.appendChild(new FieldStart(zzyq7.getDocument(), new zzYEF(), 4));
        paragraph.appendChild(new Run(zzyq7.getDocument(), str6, new zzYEF()));
        paragraph.appendChild(new FieldEnd(zzyq7.getDocument(), new zzYEF(), 4, false));
    }

    private static void zzZ(zzYQ7 zzyq7, Paragraph paragraph, zzYEF zzyef, CompositeNode compositeNode, zzYEF zzyef2, Style style) throws Exception {
        zzYQ9 zzyq9ZzYuT = zzyq7.zzYuT();
        String prefix = zzyq9ZzYuT.getPrefix();
        Ref ref = new Ref("");
        Ref ref2 = new Ref("");
        zzZ(zzyq7, zzyq9ZzYuT, (Ref<String>) ref, (Ref<String>) ref2);
        String str = (String) ref.get();
        String str2 = (String) ref2.get();
        zzY(zzyq7, paragraph, zzyef2, style, prefix);
        zzZ(zzyq7, paragraph, zzyef2, style, prefix, str, str2);
        if ("draw".equals(prefix)) {
            zzyq7.setHRef(str);
            zzyq7.setTarget(str2);
        }
        zzYQC.zzZ(zzyq7, paragraph, "a", zzyef, compositeNode);
        if ("draw".equals(prefix)) {
            zzyq7.setHRef(null);
            zzyq7.setTarget(null);
        }
        zzZ(zzyq7, paragraph, zzyef2, style, prefix);
    }

    private static void zzZ(zzYQ7 zzyq7, zzYQ9 zzyq9, Ref<String> ref, Ref<String> ref2) {
        while (zzyq9.zzi()) {
            int iZzTP = zzUR.zzTP(zzyq9.getLocalName());
            if (iZzTP != 25 && iZzTP != 38) {
                switch (iZzTP) {
                    case 71:
                        ref2.set(zzyq9.getValue());
                        continue;
                    case 72:
                        ref.set(zzYOU.zzDo(zzyq9.getValue()));
                        continue;
                    case 73:
                    case 74:
                    case 75:
                    case 76:
                    case 77:
                        break;
                    default:
                        zzyq7.zzYi("a", zzyq9.getLocalName());
                        continue;
                }
            }
            zzyq7.zzZ(256, false, "a");
        }
    }

    private static void zzZ(zzYQ7 zzyq7, Paragraph paragraph, zzYEF zzyef, Style style, String str) {
        if ("text".equals(str)) {
            boolean zEquals = TelemetryEventStrings.Value.TRUE.equals(zzyq7.zzYuT().zzV("fixed", null));
            FieldEnd fieldEnd = new FieldEnd(zzyq7.getDocument(), zzyef, 88, true);
            zzYOX.zzZ(zzyq7, fieldEnd);
            zzZ(zzyq7, paragraph, style, fieldEnd, zEquals);
        }
    }

    private static void zzZ(zzYQ7 zzyq7, Paragraph paragraph, zzYEF zzyef, Style style, String str, String str2, String str3) {
        if ("text".equals(str)) {
            if (com.aspose.words.internal.zzZYD.zzXk(str2)) {
                String str4 = com.aspose.words.internal.zzZKN.format("HYPERLINK \"{0}\"", str2);
                if (com.aspose.words.internal.zzZYD.zzXk(str3)) {
                    str4 = com.aspose.words.internal.zzZKN.format("{0} \\t \"{1}\"", str4, str3);
                }
                zzZ(zzyq7, (CompositeNode) paragraph, str4, zzyef, style);
            }
            boolean zEquals = TelemetryEventStrings.Value.TRUE.equals(zzyq7.zzYuT().zzV("fixed", null));
            FieldSeparator fieldSeparator = new FieldSeparator(zzyq7.getDocument(), zzyef, 88);
            zzYOX.zzZ(zzyq7, fieldSeparator);
            zzZ(zzyq7, paragraph, style, fieldSeparator, zEquals);
        }
    }

    private static void zzZ(zzYQ7 zzyq7, zzYQ9 zzyq9, Ref<String> ref, Ref<String> ref2, Ref<String> ref3) {
        while (zzyq9.zzi()) {
            String value = zzyq9.getValue();
            int iZzTP = zzUR.zzTP(zzyq9.getLocalName());
            if (iZzTP != 46 && iZzTP != 57 && iZzTP != 78 && iZzTP != 79) {
                switch (iZzTP) {
                    case 38:
                        ref.set(value);
                        continue;
                    case 39:
                        break;
                    case 40:
                        ref3.set(value);
                        continue;
                    default:
                        switch (iZzTP) {
                            case 51:
                            case 52:
                            case 54:
                                break;
                            case 53:
                                ref2.set(value);
                                continue;
                            default:
                                zzyq7.zzYi("variable-set", zzyq9.getLocalName());
                                continue;
                        }
                        break;
                }
            }
            zzyq7.zzZ(1, false, "text:variable-set");
        }
    }

    public static void zzZ(zzYQ7 zzyq7, CompositeNode compositeNode, zzYSM zzysm, zzYEF zzyef, Style style) {
        if (zzyef == null) {
            Paragraph paragraph = (Paragraph) com.aspose.words.internal.zzZKW.zzZ(compositeNode, Paragraph.class);
            if (paragraph != null) {
                zzyef = paragraph.zzYp5();
            } else {
                zzyef = new zzYEF();
            }
        }
        FormField formField = new FormField(zzyq7.getDocument(), new zzZMM(), zzyef);
        if (com.aspose.words.internal.zzZYD.zzXk(zzysm.zzYwZ()) && "checked".equals(zzysm.zzYwZ())) {
            formField.setChecked(true);
        }
        formField.setCheckBoxSize(com.aspose.words.internal.zzZKQ.zzZa(Math.max(zzysm.getWidth(), zzysm.getHeight())));
        formField.isCheckBoxExactSize(com.aspose.words.internal.zzAN.zzL(zzysm.getWidth(), zzysm.getHeight()));
        compositeNode.appendChild(new FieldStart(zzyq7.getDocument(), zzyef, 71));
        zzZ(zzyq7, compositeNode, "FORMCHECKBOX", zzyef, style);
        compositeNode.appendChild(formField);
        compositeNode.appendChild(new FieldSeparator(zzyq7.getDocument(), zzyef, 71));
        compositeNode.appendChild(new FieldEnd(zzyq7.getDocument(), zzyef, 71, true));
        if (com.aspose.words.internal.zzZYD.zzXk(zzysm.getLabel())) {
            double width = zzysm.getWidth() - 8.5d;
            if (width < 0.0d) {
                return;
            }
            zzZ((Run) compositeNode.appendChild(new Run(zzyq7.getDocument(), zzysm.getLabel())), width);
        }
    }

    private static void zzZ(Run run, double d) {
        com.aspose.words.internal.zzPM zzpmZzY = run.getDocument().zzZqy().zzY(run.getFont().getName(), (float) run.getFont().getSize(), run.getFont().zzza());
        while (!com.aspose.words.internal.zzZKN.zzU3(run.getText())) {
            if (zzpmZzY.zz7(run.getText()) < d) {
                return;
            } else {
                run.setText(com.aspose.words.internal.zzZKN.zzn(run.getText(), run.getText().length() - 1));
            }
        }
        run.remove();
    }

    private static void zzZ(zzYQ7 zzyq7, Paragraph paragraph, String str, zzYEF zzyef, Style style) {
        zzYQ9 zzyq9ZzYuT = zzyq7.zzYuT();
        while (zzyq9ZzYuT.zzi()) {
            int iZzTP = zzUR.zzTP(zzyq9ZzYuT.getLocalName());
            if (iZzTP != 41) {
                if (iZzTP == 42 || iZzTP == 55) {
                    zzyq7.zzZ(1, false, "text:page-number");
                } else if (iZzTP != 81 && iZzTP != 82) {
                    zzyq7.zzYi("page-number", zzyq9ZzYuT.getLocalName());
                }
            }
            zzyq7.zzZ(256, false, "text:page-number");
        }
        zzZ(zzyq7, paragraph, 33, str, zzyef, style);
    }

    private static void zzZ(zzYQ7 zzyq7, Paragraph paragraph, int i, String str, zzYEF zzyef, Style style) {
        zzZ(zzyq7, paragraph, i, str, zzyq7.zzYuT().readString(), zzyef, style, false);
    }

    private static void zzZ(zzYQ7 zzyq7, Paragraph paragraph, int i, String str, String str2, zzYEF zzyef, Style style, boolean z) {
        if (zzyef == null) {
            zzyef = paragraph.zzYp5();
        }
        Document document = zzyq7.getDocument();
        zzZ(zzyq7, paragraph, style, new FieldStart(document, zzyef, i), z);
        zzZ(zzyq7, (CompositeNode) paragraph, str, zzyef, style);
        zzZ(zzyq7, paragraph, style, new FieldSeparator(document, zzyef, i), z);
        zzZ(zzyq7, (CompositeNode) paragraph, str2, zzyef, style);
        zzZ(zzyq7, paragraph, style, new FieldEnd(document, zzyef, i, true), z);
        zzyq7.zzYuT().zzk();
    }

    private static void zzZ(zzYQ7 zzyq7, Paragraph paragraph, Style style, FieldChar fieldChar, boolean z) {
        if (fieldChar instanceof FieldStart) {
            fieldChar.isLocked(z);
        }
        zzYQ7.zzZ(fieldChar, style);
        paragraph.appendChild(fieldChar);
        zzYOX.zzZ(zzyq7, fieldChar);
    }

    private static void zzZ(zzYQ7 zzyq7, CompositeNode compositeNode, String str, zzYEF zzyef, Style style) {
        if (com.aspose.words.internal.zzZYD.zzXk(str)) {
            Run run = new Run(zzyq7.getDocument(), str, zzyef);
            zzYQ7.zzZ(run, style);
            compositeNode.appendChild(run);
            zzYOX.zzZ(zzyq7, run);
        }
    }
}
