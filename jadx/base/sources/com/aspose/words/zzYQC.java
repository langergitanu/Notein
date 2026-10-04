package com.aspose.words;

import com.facebook.common.callercontext.ContextChain;
import com.google.firebase.messaging.Constants;
import com.miui.penengine.p596e.C18773h;
import com.orion.notein.domain.models.backup.BackupFile;
import java.util.Iterator;

/* JADX INFO: loaded from: classes6.dex */
final class zzYQC {
    private static final com.aspose.words.internal.zzZHW zzUR = new com.aspose.words.internal.zzZHW("", "s", "tab", "line-break", "script", "span", BackupFile.FILE_CONTENT_TYPE_NOTE, "annotation", "bookmark", "bookmark-start", "bookmark-end", "ruby", "change", "change-start", "change-end", "name", "ruby-text", "ruby-base", "note-citation", "note-body", ContextChain.TAG_PRODUCT, C18773h.f57233c, "list", "table", "section", "soft-page-break", "numbered-paragraph", "caption-point-x", "caption-point-y", "class-names", "corner-radius", "id", "layer", "style-name", "text-style-name", "transform", "z-index", "display", "height", "width", "x", "y", "end-cell-address", "end-x", "end-y", "table-background", "anchor-page-number", "anchor-type", "creator", "date", "date-string");

    private static void zz5(zzYQ7 zzyq7) {
        zzYQ9 zzyq9ZzYuT = zzyq7.zzYuT();
        while (zzyq9ZzYuT.zzi()) {
            int iZzTP = zzUR.zzTP(zzyq9ZzYuT.getLocalName());
            if (iZzTP != 15) {
                switch (iZzTP) {
                    case 27:
                    case 28:
                    case 29:
                    case 30:
                    case 31:
                    case 32:
                    case 33:
                    case 34:
                    case 35:
                    case 36:
                    case 37:
                    case 38:
                    case 39:
                    case 40:
                    case 41:
                    case 42:
                    case 43:
                    case 44:
                    case 45:
                    case 46:
                    case 47:
                        break;
                    default:
                        zzyq7.zzYi("office:annotation", zzyq9ZzYuT.getLocalName());
                        continue;
                }
            }
            zzyq7.zzZ(256, false, "office:annotation");
        }
    }

    private static String zzEd(String str) {
        return "span".equals(str) ? "text" : "paragraph";
    }

    private static void zzJ(zzYQ7 zzyq7, Paragraph paragraph, zzYEF zzyef, Style style) {
        String strZzZ = com.aspose.words.internal.zzZKN.zzZ(com.aspose.words.internal.zzZKN.zzZ(zzyq7.zzYuT().getValue(), (char) 8209, ControlChar.NON_BREAKING_HYPHEN_CHAR), (char) 173, ControlChar.OPTIONAL_HYPHEN_CHAR);
        if (com.aspose.words.internal.zzZYD.zzXk(strZzZ)) {
            zzZ(zzyq7, paragraph, zzyef, strZzZ, style);
        }
    }

    private static void zzK(zzYQ7 zzyq7, Paragraph paragraph, zzYEF zzyef, Style style) {
        zzZ(zzyq7, paragraph, zzyef, ControlChar.TAB, style);
        zzYQ9 zzyq9ZzYuT = zzyq7.zzYuT();
        while (zzyq9ZzYuT.zzi()) {
            if ("tab-ref".equals(zzyq9ZzYuT.getLocalName())) {
                zzyq7.zzZ(256, false, "text:tab");
                return;
            }
        }
    }

    private static void zzL(zzYQ7 zzyq7, Paragraph paragraph, zzYEF zzyef, Style style) {
        zzYQ9 zzyq9ZzYuT = zzyq7.zzYuT();
        String strZzS = ControlChar.zzZs5;
        while (zzyq9ZzYuT.zzi()) {
            if ("c".equals(zzyq9ZzYuT.getLocalName())) {
                strZzS = com.aspose.words.internal.zzZKN.zzS(ControlChar.SPACE_CHAR, zzyq9ZzYuT.zzb());
            }
        }
        zzZ(zzyq7, paragraph, zzyef, strZzS, style);
    }

    private static boolean zzR(zzYQ7 zzyq7, Paragraph paragraph) {
        return zzyq7.zzYuF() || paragraph.getRuns().getCount() == 0;
    }

    private static void zzS(zzYQ7 zzyq7, Paragraph paragraph) {
        zzYQ9 zzyq9ZzYuT = zzyq7.zzYuT();
        Shape shape = new Shape(zzyq7.getDocument());
        shape.zzB6("text/javascript");
        while (zzyq9ZzYuT.zzY("script", 7)) {
            shape.zzB7(com.aspose.words.internal.zzZKN.format("{0}{1}", shape.zzYbu(), zzyq9ZzYuT.getValue()));
        }
        shape.zzYvW().zzQ(952, Boolean.TRUE);
        paragraph.appendChild(shape);
    }

    private static void zzT(zzYQ7 zzyq7, Paragraph paragraph) {
        paragraph.appendChild(new BookmarkEnd(zzyq7.getDocument(), zzV(zzyq7, paragraph).getName()));
    }

    private static void zzU(zzYQ7 zzyq7, Paragraph paragraph) {
        BookmarkEnd bookmarkEnd = new BookmarkEnd(zzyq7.getDocument());
        zzZ(zzyq7, bookmarkEnd);
        if (zzyq7.zzYun().contains(bookmarkEnd.getName())) {
            paragraph.appendChild(bookmarkEnd);
            zzyq7.zzSa(true);
            zzyq7.zzYun().remove(bookmarkEnd.getName());
        }
    }

    private static zzZD7 zzV(zzYQ7 zzyq7, Paragraph paragraph) {
        BookmarkStart bookmarkStart = new BookmarkStart(zzyq7.getDocument());
        zzZ(zzyq7, bookmarkStart);
        paragraph.appendChild(bookmarkStart);
        zzyq7.zzSa(true);
        return bookmarkStart;
    }

    private static void zzW(zzYQ7 zzyq7, Paragraph paragraph) {
        zzYQ9 zzyq9ZzYuT = zzyq7.zzYuT();
        zzyq9ZzYuT.zzj();
        while (zzyq9ZzYuT.zzi()) {
            String localName = zzyq9ZzYuT.getLocalName();
            if ("outline-level".equals(zzyq9ZzYuT.getLocalName()) && com.aspose.words.internal.zzZYD.zzXk(zzyq9ZzYuT.getValue())) {
                int iZzZv = com.aspose.words.internal.zzJB.zzZv(zzyq9ZzYuT.getValue());
                paragraph.zzZYj().zzQ(1000, Integer.valueOf(iZzZv));
                zzyq7.setOutlineLevel(iZzZv - 1);
                zzYR7 zzyr7 = (zzYR7) com.aspose.words.internal.zzZKW.zzZ(zzyq7.zzYuS().zzYh("Outline", null), zzYR7.class);
                if (zzyr7 != null) {
                    zzZ(zzyq7, paragraph, zzyr7, true);
                }
            }
            if ("is-list-header".equals(localName) || "restart-numbering".equals(localName) || "start-value".equals(localName)) {
                zzyq7.zzZ(256, false, "text:h");
            }
        }
    }

    private static boolean zzX(zzYQ7 zzyq7, String str, zzYR7 zzyr7) {
        return (zzyr7 == null || "list-header".equals(str) || !zzyq7.isListItem()) ? false : true;
    }

    private static void zzY(zzYQ7 zzyq7, Paragraph paragraph) {
        zzYP3 zzyp3ZzYuG = zzyq7.zzYuG();
        if (zzyp3ZzYuG == null || zzyp3ZzYuG.zzYta()) {
            return;
        }
        Document document = zzyq7.getDocument();
        paragraph.insertBefore(new FieldStart(document, new zzYEF(), zzyp3ZzYuG.getFieldType()), paragraph.getFirstChild());
        Node nodeInsertAfter = paragraph.insertAfter(new FieldSeparator(document, new zzYEF(), zzyp3ZzYuG.getFieldType()), paragraph.insertAfter(new Run(document, zzyp3ZzYuG.zzYtb(), new zzYEF()), paragraph.getFirstChild()));
        if (zzyp3ZzYuG.zzYt8()) {
            paragraph.insertAfter(new FieldEnd(document, new zzYEF(), zzyp3ZzYuG.getFieldType(), true), nodeInsertAfter);
        }
        zzyp3ZzYuG.zzYt9();
    }

    public static void zzZ(zzYQ7 zzyq7, String str, String str2, CompositeNode compositeNode, zzYR7 zzyr7, boolean z) throws Exception {
        zzZ(zzyq7, str, compositeNode);
        if (zzX(zzyq7, str2, zzyr7)) {
            zzZ(zzyq7, (Paragraph) compositeNode.zzZYq(), zzyr7, z);
        }
    }

    public static void zzZ7(Paragraph paragraph) {
        if (paragraph.isInCell() && paragraph.zzZex().zz6G().getOrientation() == 3) {
            zzWP zzwpZz6G = paragraph.zzZex().zz6G();
            int verticalAlignment = zzwpZz6G.getVerticalAlignment();
            zzYMX zzymxZzZYj = paragraph.zzZYj();
            int alignment = zzymxZzZYj.getAlignment();
            if (verticalAlignment == 2) {
                if (alignment == 0) {
                    zzwpZz6G.setVerticalAlignment(0);
                    return;
                }
                if (alignment == 2) {
                    zzymxZzZYj.setAlignment(0);
                    return;
                } else {
                    if (alignment == 1) {
                        zzymxZzZYj.setAlignment(0);
                        zzwpZz6G.setVerticalAlignment(1);
                        return;
                    }
                    return;
                }
            }
            if (alignment == 0) {
                zzymxZzZYj.setAlignment(2);
                return;
            }
            if (alignment == 2) {
                zzwpZz6G.setVerticalAlignment(2);
            } else if (alignment == 1) {
                zzymxZzZYj.setAlignment(2);
                zzwpZz6G.setVerticalAlignment(1);
            }
        }
    }

    public static void zzX(zzYQ7 zzyq7, Paragraph paragraph) {
        zzYQ9 zzyq9ZzYuT = zzyq7.zzYuT();
        zzyq7.zzE5(null);
        String str = com.aspose.words.internal.zzZKN.format("{0}:{1}", zzyq9ZzYuT.getPrefix(), zzyq9ZzYuT.getLocalName());
        while (zzyq9ZzYuT.zzi()) {
            String localName = zzyq9ZzYuT.getLocalName();
            if ("class-names".equals(localName) || "cond-style-name".equals(localName) || "id".equals(localName)) {
                zzyq7.zzZ(256, false, str);
            }
            zzyq7.zzV(zzyq7.zzYuT());
        }
        if ("text:h".equals(str)) {
            zzW(zzyq7, paragraph);
        }
    }

    private static void zzZ(zzYQ7 zzyq7, Paragraph paragraph, zzYR7 zzyr7, boolean z) {
        zzYMX zzymxZzZYj = paragraph.zzZYj();
        int iZzZ0C = zzyq7.zzZ0C();
        if (z) {
            List list = zzyr7.getList();
            boolean zEquals = "Outline".equals(zzyr7.getName());
            if (!zEquals && !zzyq7.zzYuE() && zzyr7.zzYvJ() && list.getListLevels().get(iZzZ0C).getNumberStyle() != 23) {
                list = zzyq7.getDocument().getLists().zzxt(1);
                list.zzxB(zzyr7.getList().zzYP8());
                zzZ4B zzz4b = new zzZ4B(zzyq7.getDocument(), iZzZ0C);
                zzz4b.zzYbY = 1;
                zzz4b.zzYbX = true;
                list.zzYPb().zzZ(zzz4b);
            }
            if (zEquals) {
                iZzZ0C = zzyq7.getOutlineLevel();
            }
            zzymxZzZYj.zzxC(list.getListId());
            zzymxZzZYj.zzrM(iZzZ0C);
            zzyr7.zzSo(true);
            return;
        }
        zzymxZzZYj.zzwa(zzyr7.getList().getListLevels().zzwY(iZzZ0C).zzZYj().zzYM7());
    }

    private static boolean zzY(Paragraph paragraph, zzYQB zzyqb) {
        return (!paragraph.zzZYj().contains(1450) || paragraph.getRuns().getCount() == 0 || zzyqb == null) ? false : true;
    }

    private static zzYOY zzY(zzYQ7 zzyq7, String str, String str2) {
        zzYOY zzyoy = (zzYOY) zzyq7.zzYuS().zzY(str, str2, zzyq7.zzYuO(), true);
        return zzyoy == null ? (zzYOY) zzyq7.zzYuS().zzY(str, str2, false, false) : zzyoy;
    }

    private static void zzW(zzYEF zzyef, String str) {
        for (int i = 0; i < str.length(); i++) {
            char cCharAt = str.charAt(i);
            if (com.aspose.words.internal.zzZVS.zzS2(cCharAt) && zzyef.zzPk(StyleIdentifier.LIST_TABLE_5_DARK_ACCENT_2) == null) {
                zzyef.setLocaleIdBi(EditingLanguage.THAI);
            }
            if (zzYOU.zzrv(cCharAt) && !zzyef.zzYdL().toBool()) {
                zzyef.zzV(zzZU.zzZF6);
            }
        }
    }

    private static boolean zzX(Paragraph paragraph, zzYQB zzyqb) {
        Section parentSection = paragraph.getParentSection();
        if (zzyqb.zzYv1()) {
            return !(parentSection == null || parentSection.getBody().getFirstParagraph() == paragraph) || paragraph.isInCell();
        }
        return false;
    }

    private static void zzY(zzYQ7 zzyq7, Paragraph paragraph, zzYQB zzyqb) {
        boolean z = false;
        if (zzyq7.zzYv3()) {
            paragraph.zzZYj().zzQ(EditingLanguage.SLOVENIAN, Boolean.TRUE);
            zzyq7.zzSi(false);
        }
        if (zzyqb != null && zzyqb.zzYv3()) {
            z = true;
        }
        zzyq7.zzSi(z);
        if (zzyqb == null) {
            return;
        }
        boolean zZzX = zzX(paragraph, zzyqb);
        if (paragraph.getRuns().getCount() > 0) {
            if (zZzX) {
                paragraph.zzYVe().setText(com.aspose.words.internal.zzZKN.format("{0}{1}", ControlChar.COLUMN_BREAK, paragraph.zzYVe().getText()));
            }
            if (zzyqb.zzYv2()) {
                Run run = paragraph.getRuns().get(paragraph.getRuns().getCount() - 1);
                run.setText(com.aspose.words.internal.zzZKN.format("{0}{1}", run.getText(), ControlChar.COLUMN_BREAK));
                return;
            }
            return;
        }
        if (zZzX || zzyqb.zzYv2()) {
            paragraph.getRuns().add(new Run(zzyq7.getDocument(), ControlChar.COLUMN_BREAK));
        }
    }

    public static void zzZ(zzYQ7 zzyq7, String str, CompositeNode compositeNode) throws Exception {
        Paragraph paragraphZzZ = zzZ(zzyq7, compositeNode);
        zzY(zzyq7, paragraphZzZ);
        zzX(zzyq7, paragraphZzZ);
        zzYQB zzyqb = (zzYQB) zzyq7.zzYuS().zzY(zzyq7.zzYuP(), "paragraph", zzyq7.zzYuO(), true);
        zzYEF zzyefZzZYh = zzyqb == null ? null : zzyqb.zzZYh();
        zzYQ9 zzyq9ZzYuT = zzyq7.zzYuT();
        zzyq7.zzYuT().zz6().zzj();
        zzyq7.zzT(new zzYQ9(new com.aspose.words.internal.zzZOR(com.aspose.words.internal.zzZO0.zzhV().getBytes(zzYQG.zzEj(com.aspose.words.internal.zzZSN.zzZ(zzyq7.zzYuT().zz6()))))));
        zzZ(zzyq7, paragraphZzZ, str, zzyefZzZYh, compositeNode);
        zzyq7.zzT(zzyq9ZzYuT);
        zzZ(zzyq7, zzyqb, paragraphZzZ);
        zzZ7(paragraphZzZ);
        zzZ(zzyqb, paragraphZzZ);
    }

    private static void zzY(zzYQ7 zzyq7, Paragraph paragraph, String str, zzYEF zzyef, CompositeNode compositeNode) throws Exception {
        zzYQ9 zzyq9ZzYuT = zzyq7.zzYuT();
        String strZzEd = zzEd(str);
        zzYOY zzyoyZzY = zzY(zzyq7, zzyq7.zzYuP(), strZzEd);
        zzYEF zzyefZzZ = zzZ(zzyef, zzyoyZzY);
        Style styleZzZ = zzZ(zzyq7, zzyoyZzY, strZzEd);
        zzyq7.zzSa(true);
        zzYR0 zzyr0ZzZW = zzYP5.zzZW(zzyq7);
        while (zzyq9ZzYuT.zzQ(str)) {
            String localName = zzyq9ZzYuT.getLocalName();
            if (zzYOU.zzDJ(localName)) {
                if (!zzYP2.zzY(zzyq7, compositeNode, zzyr0ZzZW, str)) {
                    zzyq7.zzYuT().zzk();
                }
            } else if (zzYQ7.zzZ(zzyq7, paragraph, zzyefZzZ, styleZzZ, str)) {
                zzyq7.zzSa(true);
            } else {
                int iZzTP = zzUR.zzTP(localName);
                switch (iZzTP) {
                    case 12:
                    case 13:
                    case 14:
                        zzyq7.zzZ(1, true, str);
                        break;
                    default:
                        switch (iZzTP) {
                            case 20:
                            case 21:
                                zzZ(zzyq7, localName, compositeNode);
                                continue;
                            case 22:
                                zzYR8.zzZ(zzyq7, compositeNode, null);
                                continue;
                            case 23:
                                zzYPC.zzV(zzyq7, compositeNode);
                                continue;
                            case 24:
                                zzYPZ.zzZ(zzyq7, zzyr0ZzZW, paragraph, str);
                                continue;
                            case 25:
                            case 26:
                                break;
                            default:
                                zzyq9ZzYuT.zzk();
                                continue;
                        }
                        zzyq7.zzZ(1, true, str);
                        break;
                }
            }
        }
        zzZ(paragraph, str, zzyoyZzY);
    }

    private static void zzZ(zzYQB zzyqb, Paragraph paragraph) {
        double size;
        if (zzyqb == null || !zzyqb.zzYv0()) {
            return;
        }
        zzYMX zzymxZzZYj = paragraph.zzZYj();
        if (paragraph.getRuns().getCount() == 1) {
            size = paragraph.zzYVe().getFont().getSize();
        } else {
            size = paragraph.getParagraphBreakFont().getSize();
        }
        zzymxZzZYj.zzwb(com.aspose.words.internal.zzSA.zzr(size));
    }

    private static Paragraph zzZ(zzYQ7 zzyq7, CompositeNode compositeNode) {
        if (zzyq7.zzYuH().size() > 0 && (compositeNode instanceof Body)) {
            Paragraph paragraph = zzyq7.zzYuH().get(zzyq7.zzYuH().size() - 1);
            zzyq7.zzYuH().remove(zzyq7.zzYuH().size() - 1);
            if (paragraph.getParentNode() != compositeNode) {
                compositeNode.appendChild(paragraph);
            }
            return paragraph;
        }
        Paragraph paragraph2 = new Paragraph(zzyq7.getDocument());
        compositeNode.appendChild(paragraph2);
        return paragraph2;
    }

    private static Comment zzY(zzYQ7 zzyq7, zzYEF zzyef) throws Exception {
        zzYQ9 zzyq9ZzYuT = zzyq7.zzYuT();
        Comment comment = new Comment(zzyq7.getDocument(), zzyef);
        while (zzyq9ZzYuT.zzQ("annotation")) {
            int iZzTP = zzUR.zzTP(zzyq7.zzYuT().getLocalName());
            if (iZzTP == 20) {
                zzZ(zzyq7, zzyq9ZzYuT.getLocalName(), comment);
            } else if (iZzTP != 22) {
                switch (iZzTP) {
                    case 48:
                        comment.setAuthor(zzyq9ZzYuT.readString());
                        if (com.aspose.words.internal.zzZYD.zzXk(comment.getAuthor())) {
                            comment.setInitial(comment.getAuthor().substring(0, 1).toUpperCase());
                        }
                        break;
                    case 49:
                        comment.zzv(com.aspose.words.internal.zzJB.zzZy(zzyq9ZzYuT.readString()));
                        break;
                    case 50:
                        zzyq7.zzZ(1, true, "office:annotation");
                        break;
                    default:
                        zzyq7.zzYuT().zzk();
                        break;
                }
            } else {
                zzYR8.zzZ(zzyq7, comment, null);
            }
        }
        return comment;
    }

    public static void zzZ(zzYQ7 zzyq7, zzYQB zzyqb, Paragraph paragraph) {
        Style style;
        Style style2;
        zzY(zzyq7, paragraph, zzyqb);
        Document document = zzyq7.getDocument();
        if (zzyqb == null) {
            String strZzYuP = zzyq7.zzYuP();
            if (strZzYuP != null && (style2 = document.getStyles().get(strZzYuP)) != null) {
                paragraph.getParagraphFormat().setStyle(style2);
            }
        } else {
            if (zzyqb.zzZYj() != null) {
                paragraph.zzZ((zzYMX) zzyqb.zzZYj().zzbn());
            }
            if (com.aspose.words.internal.zzZYD.zzXk(zzyqb.zzYu5()) && (style = document.getStyles().get(zzyqb.zzYu5())) != null) {
                paragraph.zzZYj().zzBl(style.zzZ7j());
                zzZ(paragraph.getParagraphFormat().getStyle().zzZYj().getTabStops(), paragraph.zzZYj().getTabStops());
            }
            if (paragraph.zzYpa() && zzyqb.getTextOrientation() != 0) {
                paragraph.zzZex().zz6G().zzQ(3050, Integer.valueOf(zzyqb.getTextOrientation()));
            }
            zzZ(zzyq7, paragraph, zzyqb);
        }
        zzZ(paragraph, zzyqb);
    }

    private static void zzZ(zzYQ7 zzyq7, Paragraph paragraph, zzYQB zzyqb) {
        Section parentSection = paragraph.getParentSection();
        if (parentSection == null || paragraph != parentSection.getBody().getFirstParagraph()) {
            return;
        }
        zzYCZ zzyczZzYvR = parentSection.zzYvR();
        if (com.aspose.words.internal.zzZYD.zzXk(zzyqb.getPageNumber())) {
            zzyczZzYvR.zzQ(2200, Integer.valueOf(com.aspose.words.internal.zzJB.zzZv(zzyqb.getPageNumber())));
            zzyczZzYvR.zzQ(2050, Boolean.TRUE);
        }
        if (parentSection.getHeadersFooters().getCount() == 0) {
            Iterator<T> it = zzYP5.zzZ(zzyq7.zzYuR(), zzyqb.zzYu6()).zzYBx().getHeadersFooters().iterator();
            while (it.hasNext()) {
                parentSection.getHeadersFooters().add(((HeaderFooter) it.next()).deepClone(true));
            }
        }
        if (zzyqb.getLineNumber() <= 0 || zzyczZzYvR.getLineNumberRestartMode() == 2) {
            return;
        }
        zzyczZzYvR.zzQ(2180, Integer.valueOf(zzyqb.getLineNumber()));
        zzyczZzYvR.zzQ(EditingLanguage.MALAY_BRUNEI_DARUSSALAM, 1);
        paragraph.zzZYj().zzQ(EditingLanguage.YORUBA, Boolean.FALSE);
    }

    private static void zzZ(TabStopCollection tabStopCollection, TabStopCollection tabStopCollection2) {
        if (tabStopCollection == null || tabStopCollection2 == null) {
            return;
        }
        for (int i = 0; i < tabStopCollection.getCount(); i++) {
            if (tabStopCollection2.zzkr(tabStopCollection.get(i).zzY0E()) == null) {
                TabStop tabStopZzY0F = tabStopCollection.get(i).zzY0F();
                tabStopZzY0F.setAlignment(7);
                tabStopCollection2.add(tabStopZzY0F);
            }
        }
    }

    private static void zzZ(Paragraph paragraph, zzYQB zzyqb) {
        if (zzY(paragraph, zzyqb)) {
            Paragraph paragraph2 = (Paragraph) paragraph.deepClone(false);
            paragraph.zzYC(paragraph2);
            int iZzYv6 = zzyqb.zzYv6() > 1 ? zzyqb.zzYv6() : 1;
            if (zzyqb.zzYv5()) {
                iZzYv6 = com.aspose.words.internal.zzZNR.zzZT(paragraph.getText(), "\\w+").zzQw(0).getLength();
            }
            int i = 0;
            while (i < paragraph.getRuns().getCount() && iZzYv6 > 0) {
                Run run = paragraph.getRuns().get(i);
                Run run2 = (Run) run.deepClone(true);
                String text = run.getText();
                if (iZzYv6 >= text.length()) {
                    run.remove();
                    iZzYv6 -= text.length();
                } else {
                    run2.setText(run2.getText().substring(0, iZzYv6));
                    run.setText(text.substring(iZzYv6));
                    i++;
                    iZzYv6 = 0;
                }
                paragraph2.getRuns().add(run2);
            }
            paragraph2.zzZYj().zzQ(1440, 1);
            paragraph2.zzZYj().zzQ(1340, 2);
            if (paragraph.hasChildNodes()) {
                paragraph.zzZYj().remove(1450);
            } else {
                paragraph.remove();
            }
        }
    }

    public static void zzZ(zzYQ7 zzyq7, Paragraph paragraph, String str, zzYEF zzyef, CompositeNode compositeNode) throws Exception {
        String str2 = "span".equals(str) ? "text" : "paragraph";
        zzYOY zzyoyZzY = zzY(zzyq7, zzyq7.zzYuP(), str2);
        zzYEF zzyefZzZ = zzZ(zzyef, zzyoyZzY);
        zzyefZzZ.remove(830);
        Style styleZzZ = zzZ(zzyq7, zzyoyZzY, str2);
        zzZ(zzyoyZzY, zzyefZzZ);
        zzyq7.zzSa(true);
        while (zzyq7.zzYuT().zzY(str, 7)) {
            zzZ(zzyq7, paragraph, str, zzyefZzZ, compositeNode, zzyefZzZ, styleZzZ);
        }
        zzZ(paragraph, str, zzyoyZzY);
    }

    private static void zzZ(zzYOY zzyoy, zzYEF zzyef) {
        if (zzyoy == null || !zzyoy.zzYsZ()) {
            return;
        }
        zzyef.remove(160);
    }

    private static Style zzZ(zzYQ7 zzyq7, zzYOY zzyoy, String str) {
        if (zzyoy != null && "text".equals(str) && com.aspose.words.internal.zzZYD.zzXk(zzyoy.zzYu5())) {
            return zzyq7.getDocument().getStyles().get(zzyoy.zzYu5());
        }
        return null;
    }

    private static zzYEF zzZ(zzYEF zzyef, zzYOY zzyoy) {
        zzYEF zzyef2 = new zzYEF();
        if (zzyoy != null) {
            if (zzyoy.zzZYh() != null) {
                return zzyoy.zzD(zzyef);
            }
            if (zzyef != null) {
                return (zzYEF) zzyef.zzbn();
            }
        }
        return zzyef2;
    }

    private static void zzZ(zzYQ7 zzyq7, Paragraph paragraph, String str, zzYEF zzyef, CompositeNode compositeNode, zzYEF zzyef2, Style style) throws Exception {
        zzYQ9 zzyq9ZzYuT = zzyq7.zzYuT();
        if (zzYQ7.zzZ(zzyq7, paragraph, zzyef2, style, str)) {
            zzyq7.zzSa(true);
        }
        switch (zzUR.zzTP(zzyq9ZzYuT.getLocalName())) {
            case 0:
                zzJ(zzyq7, paragraph, zzyef2, style);
                break;
            case 1:
                zzL(zzyq7, paragraph, zzyef2, style);
                break;
            case 2:
                zzK(zzyq7, paragraph, zzyef2, style);
                break;
            case 3:
                zzZ(zzyq7, paragraph, zzyef2, ControlChar.LINE_BREAK, style);
                break;
            case 4:
                zzS(zzyq7, paragraph);
                break;
            case 5:
                zzZ(zzyq7, paragraph, zzyef, compositeNode);
                zzyq7.zzSa(true);
                break;
            case 6:
                zzZ(zzyq7, paragraph, zzyef2, zzyef);
                zzyq7.zzSa(true);
                break;
            case 7:
                zzZ(zzyq7, paragraph, zzyef2);
                zzyq7.zzSa(true);
                break;
            case 8:
                zzT(zzyq7, paragraph);
                break;
            case 9:
                zzyq7.zzYun().add(zzV(zzyq7, paragraph).getName());
                break;
            case 10:
                zzU(zzyq7, paragraph);
                break;
            case 11:
                zzZ(zzyq7, paragraph, zzyef2, zzyef, compositeNode);
                break;
            case 12:
                zzYT9.zzZ(zzyq7, paragraph);
                break;
            case 13:
                zzYT9.zzY(zzyq7);
                break;
            case 14:
                zzYT9.zzX(zzyq7);
                break;
            default:
                if (zzYS1.zzZ(zzyq7, paragraph, zzyef2, style, zzyef, compositeNode)) {
                    zzyq7.zzSa(true);
                } else {
                    zzyq7.zzZ(1, true, str);
                    zzZ(zzyq7, paragraph, zzyq9ZzYuT.getLocalName(), zzyef2, compositeNode);
                }
                break;
        }
    }

    private static void zzZ(Paragraph paragraph, String str, zzYOY zzyoy) {
        if (zzyoy == null || zzyoy.zzZYh() == null) {
            return;
        }
        if (ContextChain.TAG_PRODUCT.equals(str) || C18773h.f57233c.equals(str)) {
            paragraph.zzC(zzyoy.zzZYh());
        }
    }

    private static void zzZ(zzYQ7 zzyq7, zzZD7 zzzd7) {
        zzYQ9 zzyq9ZzYuT = zzyq7.zzYuT();
        String name = zzyq9ZzYuT.getName();
        while (zzyq9ZzYuT.zzi()) {
            if (zzUR.zzTP(zzyq9ZzYuT.getLocalName()) != 15) {
                zzyq7.zzZ(256, false, name, zzyq9ZzYuT.getName());
            } else {
                zzzd7.setName(zzyq9ZzYuT.getValue());
            }
        }
    }

    private static void zzZ(zzYQ7 zzyq7, Paragraph paragraph, zzYEF zzyef, zzYEF zzyef2, CompositeNode compositeNode) throws Exception {
        Run run = new Run(zzyq7.getDocument(), "", (zzYEF) zzyef.zzbn());
        paragraph.appendChild(run);
        zzYEJ zzyej = new zzYEJ();
        run.zzZYh().add(885, zzyej);
        zzYQ9 zzyq9ZzYuT = zzyq7.zzYuT();
        zzYQ3 zzyq3 = (zzYQ3) com.aspose.words.internal.zzZKW.zzZ(zzyq7.zzYuS().zzYh(zzyq9ZzYuT.zzV("style-name", null), "ruby"), zzYQ3.class);
        if (zzyq3 != null) {
            zzyej.zzZGm = zzyq3.zzYuj();
        }
        while (zzyq9ZzYuT.zzQ("ruby")) {
            int iZzTP = zzUR.zzTP(zzyq7.zzYuT().getLocalName());
            if (iZzTP == 16) {
                zzZ(zzyq7, zzyej);
            } else if (iZzTP != 17) {
                zzyq7.zzYuT().zzk();
            } else {
                Paragraph paragraph2 = new Paragraph(zzyq7.getDocument());
                zzZ(zzyq7, paragraph2, zzyq9ZzYuT.getLocalName(), zzyef2, compositeNode);
                zzyej.zzYe6().zzZ(new zzYEI());
                zzyej.zzYe6().zzYe5().zzZAL = com.aspose.words.internal.zzZKN.zzT(paragraph2.getText(), ControlChar.PARAGRAPH_BREAK_CHAR);
            }
        }
    }

    private static void zzZ(zzYQ7 zzyq7, zzYEJ zzyej) {
        zzYQ9 zzyq9ZzYuT = zzyq7.zzYuT();
        zzYOY zzyoy = (zzYOY) com.aspose.words.internal.zzZKW.zzZ(zzyq7.zzYuS().zzYh(zzyq9ZzYuT.zzV("style-name", null), "text"), zzYOY.class);
        zzyej.zzYe7().zzZ(new zzYEI());
        if (zzyoy != null && zzyoy.zzZYh() != null) {
            zzyej.zzYe7().zzYe5().zzXqg = (zzYEF) zzyoy.zzZYh().zzbn();
        }
        zzyej.zzYe7().zzYe5().zzZAL = zzyq9ZzYuT.readString();
    }

    private static void zzZ(zzYQ7 zzyq7, Paragraph paragraph, zzYEF zzyef, String str, Style style) {
        if (zzR(zzyq7, paragraph)) {
            zzW(zzyef, str);
            paragraph.getRuns().add(zzZ(zzyq7, zzyef, str, style));
            zzyq7.zzSa(false);
        } else {
            Run run = paragraph.getRuns().get(paragraph.getRuns().getCount() - 1);
            zzW(run.zzZYh(), str);
            run.setText(com.aspose.words.internal.zzZKN.format("{0}{1}", run.getText(), str));
        }
    }

    private static Run zzZ(zzYQ7 zzyq7, zzYEF zzyef, String str, Style style) {
        Run run = new Run(zzyq7.getDocument(), str, (zzYEF) zzyef.zzbn());
        zzYQ7.zzZ(run, style);
        zzYOX.zzZ(zzyq7, run);
        return run;
    }

    private static void zzZ(zzYQ7 zzyq7, Paragraph paragraph, zzYEF zzyef, CompositeNode compositeNode) throws Exception {
        String strZzYuP = zzyq7.zzYuP();
        zzYQ9 zzyq9ZzYuT = zzyq7.zzYuT();
        while (zzyq9ZzYuT.zzi()) {
            if (!zzyq7.zzV(zzyq9ZzYuT) && "class-names".equals(zzyq9ZzYuT.getLocalName())) {
                zzyq7.zzZ(256, false, "span");
            }
        }
        zzZ(zzyq7, paragraph, "span", zzyef, compositeNode);
        zzyq7.zzE5(strZzYuP);
    }

    private static void zzZ(zzYQ7 zzyq7, Paragraph paragraph, zzYEF zzyef, zzYEF zzyef2) throws Exception {
        Footnote footnoteZzZ = zzZ(zzyq7, zzyef2);
        zzZ(zzyq7, paragraph, zzyef, footnoteZzZ);
        if (footnoteZzZ.getFirstParagraph() != null) {
            zzZ(zzyq7, zzyef2, footnoteZzZ);
        }
        paragraph.appendChild(footnoteZzZ);
    }

    private static void zzZ(zzYQ7 zzyq7, zzYEF zzyef, Footnote footnote) {
        Inline run;
        if (footnote.isAuto()) {
            run = new SpecialChar(zzyq7.getDocument(), (char) 2, (zzYEF) zzyef.zzbn());
        } else {
            run = new Run(zzyq7.getDocument(), footnote.getReferenceMark(), (zzYEF) zzyef.zzbn());
        }
        run.zzZYh().zzBl(footnote.zzZYh().zzZ7j());
        footnote.getFirstParagraph().insertBefore(run, footnote.getFirstParagraph().getFirstChild());
    }

    private static void zzZ(zzYQ7 zzyq7, Paragraph paragraph, zzYEF zzyef, Footnote footnote) throws Exception {
        zzYQ9 zzyq9ZzYuT = zzyq7.zzYuT();
        while (zzyq9ZzYuT.zzQ(BackupFile.FILE_CONTENT_TYPE_NOTE)) {
            int iZzTP = zzUR.zzTP(zzyq9ZzYuT.getLocalName());
            if (iZzTP == 18) {
                String strZzV = zzyq9ZzYuT.zzV(Constants.ScionAnalytics.PARAM_LABEL, null);
                if (strZzV != null) {
                    footnote.isAuto(false);
                    footnote.setReferenceMark(strZzV);
                }
            } else if (iZzTP != 19) {
                zzyq9ZzYuT.zzk();
            } else {
                zzyq7.zzS8(true);
                zzY(zzyq7, paragraph, "note-body", zzyef, footnote);
                zzyq7.zzS8(false);
            }
        }
    }

    private static Footnote zzZ(zzYQ7 zzyq7, zzYEF zzyef) {
        zzYQ9 zzyq9ZzYuT = zzyq7.zzYuT();
        int i = 0;
        while (zzyq9ZzYuT.zzi()) {
            if ("note-class".equals(zzyq9ZzYuT.getLocalName())) {
                if ("endnote".equals(zzyq9ZzYuT.getValue())) {
                    i = 1;
                }
            } else if ("id".equals(zzyq9ZzYuT.getLocalName())) {
                zzyq7.zzZ(256, false, "text:note");
            }
        }
        Footnote footnote = new Footnote(zzyq7.getDocument(), i, true, null, (zzYEF) zzyef.zzbn());
        zzyef.zzY(footnote.zzZYh());
        footnote.zzZYh().zzBl(zzyq7.getDocument().getStyles().getByStyleIdentifier(zzZMP.zzB0(i)).zzZ7j());
        return footnote;
    }

    private static void zzZ(zzYQ7 zzyq7, Paragraph paragraph, zzYEF zzyef) throws Exception {
        zz5(zzyq7);
        paragraph.appendChild(zzY(zzyq7, zzyef));
    }
}
