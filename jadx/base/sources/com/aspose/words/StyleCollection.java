package com.aspose.words;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: loaded from: classes6.dex */
public class StyleCollection implements Cloneable, Iterable<Style> {
    private static Document zzX9H;
    private static Document zzX9J;
    private static Document zzX9L;
    private HashMap<Style, String> zzX9D;
    private ParagraphFormat zzX9E;
    private Font zzX9F;
    private DocumentBase zzZG3;
    private static Object zzX9K = new Object();
    private static Object zzX9I = new Object();
    private static Object zzX9G = new Object();
    private zzYEF zzX9R = new zzYEF();
    private zzYMX zzX9Q = new zzYMX();
    private com.aspose.words.internal.zzZYV<Style> zzX9P = new com.aspose.words.internal.zzZYV<>();
    private com.aspose.words.internal.zzZYT<Style> zzX9O = new com.aspose.words.internal.zzZYT<>();
    private com.aspose.words.internal.zzZYV<Style> zzX9N = new com.aspose.words.internal.zzZYV<>();
    private zzZ73 zzX9M = new zzZ73();

    public StyleCollection(DocumentBase documentBase) {
        this.zzZG3 = documentBase;
    }

    private int getLoadFormat() {
        if (this.zzZG3.getNodeType() == 31) {
            return 20;
        }
        return ((Document) this.zzZG3).getOriginalLoadFormat();
    }

    private static Document zzAZ(String str) {
        try {
            com.aspose.words.internal.zzZOP zzzopZzW = com.aspose.words.internal.zzZXR.zzW(str, Document.class);
            try {
                LoadOptions loadOptions = new LoadOptions();
                loadOptions.setLoadFormat(20);
                Document document = new Document(zzzopZzW, loadOptions, false);
                document.getStyles().zzY2U();
                return document;
            } finally {
                if (zzzopZzW != null) {
                    zzzopZzW.close();
                }
            }
        } catch (Exception e) {
            throw new IllegalStateException("Cannot load built in styles from an embedded resource.", e);
        }
    }

    private static void zzQ(zzYEF zzyef, int i) {
        if (zzyef.contains(i) && ((Integer) zzyef.get(i)).intValue() == 0) {
            zzyef.remove(i);
        }
    }

    private void zzV(Style style, int i, int i2) {
        int type = style.getType();
        if (type == 1) {
            zzVs(i, i2);
            return;
        }
        if (type == 2) {
            zzVr(i, i2);
        } else if (type == 3) {
            zzVt(i, i2);
        } else {
            if (type != 4) {
                throw new IllegalStateException("Unknown style type.");
            }
            zzZ(style, i, i2);
        }
    }

    private void zzVq(int i, int i2) {
        for (Style style : this) {
            if (style.zzY3v() == i) {
                style.zzl5(i2);
            }
            if (style.zzY3u() == i) {
                style.zzl4(i2);
            }
            if (style.zzY3t() == i) {
                style.zzl3(i2);
            }
        }
    }

    private void zzVr(int i, int i2) {
        for (Paragraph paragraph : getDocument().getChildNodes(8, true)) {
            zzZ(paragraph.zzYp5(), i, i2);
            Iterator<T> it = paragraph.getRuns().iterator();
            while (it.hasNext()) {
                zzZ(((Run) it.next()).zzZYh(), i, i2);
            }
        }
    }

    private void zzVs(int i, int i2) {
        Iterator<T> it = getDocument().getChildNodes(8, true).iterator();
        while (it.hasNext()) {
            zzYMX zzymxZzZYj = ((Paragraph) it.next()).zzZYj();
            if (zzymxZzZYj.zzZ7j() == i) {
                if (i2 == -1) {
                    zzymxZzZYj.remove(1000);
                } else {
                    zzymxZzZYj.set(1000, Integer.valueOf(i2));
                }
            }
        }
    }

    private void zzVt(int i, int i2) {
        Iterator<T> it = getDocument().getChildNodes(6, true).iterator();
        while (it.hasNext()) {
            zzY6G zzy6gZzZYf = ((Row) it.next()).zzZYf();
            if (zzy6gZzZYf.zzZ7j() == i) {
                if (i2 == -1) {
                    zzy6gZzZYf.remove(4005);
                } else {
                    zzy6gZzZYf.set(4005, Integer.valueOf(i2));
                }
            }
        }
    }

    private void zzW(Style style, int i, int i2) {
        zzVq(i, i2);
        zzV(style, i, i2);
    }

    private void zzY2T() {
        Style styleZzZ7 = zzZ7(153, false);
        if (styleZzZ7 == null) {
            return;
        }
        zzQ(styleZzZ7.zzZYh(), 190);
        zzQ(styleZzZ7.zzZYh(), StyleIdentifier.LIST_TABLE_1_LIGHT_ACCENT_4);
        Style styleZzZ8 = zzZ8(styleZzZ7.zzY3t(), false);
        if (styleZzZ8 == null) {
            return;
        }
        zzQ(styleZzZ8.zzZYh(), 190);
        zzQ(styleZzZ8.zzZYh(), StyleIdentifier.LIST_TABLE_1_LIGHT_ACCENT_4);
    }

    private void zzY2W() {
        this.zzX9D = new HashMap<>(this.zzX9O.getCount());
        for (int i = 0; i < this.zzX9O.getCount(); i++) {
            Style styleZzVY = this.zzX9O.zzVY(i);
            String strZzV4 = this.zzX9O.zzV4(i);
            if (!com.aspose.words.internal.zzZKN.equals(styleZzVY.getName(), strZzV4)) {
                this.zzX9D.put(styleZzVY, com.aspose.words.internal.zzZYD.zze((String) com.aspose.words.internal.zzQW.zzZ(this.zzX9D, styleZzVY), strZzV4));
            }
        }
    }

    private int zzY2Y() {
        return Math.max(zzY38(), 14) + 1;
    }

    private boolean zzY31() {
        return getDocument() == zzX9L || getDocument() == zzX9J || getDocument() == zzX9H;
    }

    private static StyleCollection zzY33() {
        if (zzX9H == null) {
            synchronized (zzX9G) {
                try {
                    if (zzX9H == null) {
                        zzX9H = zzAZ("Aspose.Words.Resources.AllStyles2013.docx");
                    }
                } finally {
                }
            }
        }
        return zzX9H.getStyles();
    }

    private static StyleCollection zzY34() {
        if (zzX9J == null) {
            synchronized (zzX9I) {
                try {
                    if (zzX9J == null) {
                        zzX9J = zzAZ("Aspose.Words.Resources.AllStyles2007.docx");
                    }
                } finally {
                }
            }
        }
        return zzX9J.getStyles();
    }

    private static StyleCollection zzY35() {
        if (zzX9L == null) {
            synchronized (zzX9K) {
                try {
                    if (zzX9L == null) {
                        zzX9L = zzAZ("Aspose.Words.Resources.AllStyles2003.docx");
                    }
                } finally {
                }
            }
        }
        return zzX9L.getStyles();
    }

    private void zzZ(Style style, int i, int i2) {
        for (Paragraph paragraph : getDocument().getChildNodes(8, true)) {
            zzYMX zzymxZzZYj = paragraph.zzZYj();
            if (zzymxZzZYj.getListId() != 0 && paragraph.getListFormat().getList().getStyle() != null && paragraph.getListFormat().getList().getStyle().zzZ7j() == i) {
                if (i2 == -1) {
                    zzymxZzZYj.remove(EditingLanguage.KASHMIRI_ARABIC);
                    zzymxZzZYj.remove(EditingLanguage.GALICIAN);
                } else {
                    zzymxZzZYj.set(EditingLanguage.KASHMIRI_ARABIC, Integer.valueOf(style.getList().getListId()));
                }
            }
        }
    }

    private void zzi(int i, String str) {
        Style styleZz0 = zz0(str, false);
        if (styleZz0 != null && styleZz0.getStyleIdentifier() != i) {
            styleZz0.zz1(zzGI(str), true);
        }
        Style styleZzZ8 = zzZ8(zzY8O.zzkH(i), true);
        if (styleZzZ8.getStyleIdentifier() != i) {
            styleZzZ8.zzZc(zzY30(), true);
            zzZ7(i, true);
        }
    }

    private Style zzj(Style style) {
        for (int i = 0; i < this.zzX9O.getCount(); i++) {
            String strZzV4 = this.zzX9O.zzV4(i);
            if (com.aspose.words.internal.zzZKN.equals(strZzV4, style.getName()) || com.aspose.words.internal.zzZ1.zzY(style.getAliases(), strZzV4)) {
                Style styleZzVY = this.zzX9O.zzVY(i);
                if (styleZzVY.getType() == style.getType()) {
                    return styleZzVY;
                }
            }
        }
        return null;
    }

    private Style zzk(Style style) {
        for (Style style2 : this) {
            if (!com.aspose.words.internal.zzZKO.zzA(style2, style) && style.equals(style2)) {
                return style2;
            }
        }
        return null;
    }

    private Style zzkX(int i) {
        Style styleZzZ7 = zzY32().zzZ7(i, false);
        if (styleZzZ7 == null) {
            styleZzZ7 = zzY33().zzZ7(i, false);
            if (styleZzZ7 == null) {
                styleZzZ7 = zzY34().zzZ7(i, false);
            }
            if (styleZzZ7 == null) {
                return zzY35().zzZ7(i, false);
            }
        }
        return styleZzZ7;
    }

    private static int zzkY(int i) {
        if (i == 1) {
            return 0;
        }
        if (i == 2) {
            return 10;
        }
        if (i != 3) {
            return StyleIdentifier.NIL;
        }
        return 11;
    }

    private static StyleCollection zzkZ(int i) {
        switch (i) {
            case 20:
            case 21:
            case 22:
            case 23:
            case 24:
            case 25:
            case 26:
            case 27:
                return zzY34();
            default:
                return zzY35();
        }
    }

    private Style zzl(Style style) {
        Style styleZzZ7;
        return (style.getBuiltIn() && (styleZzZ7 = zzZ7(style.getStyleIdentifier(), false)) != null && styleZzZ7.getType() == style.getType()) ? styleZzZ7 : zzj(style);
    }

    private static boolean zzo(Style style) {
        int styleIdentifier = style.getStyleIdentifier();
        return styleIdentifier != 0 ? styleIdentifier != 65 ? styleIdentifier != 105 || style.getType() == 3 : style.getType() == 2 : style.getType() == 1;
    }

    private Style zzp(Style style) {
        if (style == null) {
            throw new IllegalArgumentException("Style can not be null.");
        }
        Style styleZzZ = zzZ(style, (zzZ86) null);
        if (style.zzY3t() != 12287) {
            Style styleZzZ8 = style.getStyles().zzZ8(style.zzY3t(), false);
            if (styleZzZ8 != null) {
                Style styleZzZ2 = zzZ(styleZzZ8, (zzZ86) null);
                styleZzZ.zzl3(styleZzZ2.zzZ7j());
                styleZzZ2.zzl3(styleZzZ.zzZ7j());
                return styleZzZ;
            }
            styleZzZ.zzl3(StyleIdentifier.NIL);
        }
        return styleZzZ;
    }

    private void zzr(Style style) {
        for (int count = this.zzX9O.getCount() - 1; count >= 0; count--) {
            if (this.zzX9O.zzVY(count) == style) {
                this.zzX9O.removeAt(count);
            }
        }
    }

    private static boolean zzrx(int i) {
        return i == 230 || i == 235 || i == 240 || i == 270 || i == 380 || i == 390 || i == 340;
    }

    public Style add(int i, String str) {
        com.aspose.words.internal.zzZ4.zzU(str, "name");
        Style styleZzX = Style.zzX(i, zzY30(), StyleIdentifier.USER, str);
        if (i == 4) {
            List listZzY = zzZ4H.zzY(getDocument().getLists(), 6);
            listZzY.zzYPa().zzxh(styleZzX.zzZ7j());
            styleZzX.zzZYj().zzxC(listZzY.getListId());
        }
        zzq(styleZzX);
        return styleZzX;
    }

    public Style addCopy(Style style) {
        return zzp(style);
    }

    public void clearQuickStyleGallery() {
        int i;
        Iterator<Style> it = iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            Style next = it.next();
            if (next.isQuickStyle()) {
                next.isQuickStyle(false);
            }
        }
        for (i = 0; i < this.zzX9M.getCount(); i++) {
            if (this.zzX9M.zzy3(i).zzYUl()) {
                this.zzX9M.zzy3(i).zzYUk();
            }
        }
    }

    public final boolean contains(int i) {
        return this.zzX9N.zzVE(i);
    }

    public final void ensureMinimum() {
        zzi(0, "Normal");
        zzi(65, "Default Paragraph Font");
    }

    public Style get(String str) {
        return zz0(str, true);
    }

    public Style getByStyleIdentifier(int i) {
        return zzZ7(i, true);
    }

    public int getCount() {
        return this.zzX9P.getCount();
    }

    public Font getDefaultFont() {
        if (this.zzX9F == null) {
            this.zzX9F = new Font(this.zzX9R, this.zzZG3);
        }
        return this.zzX9F;
    }

    public ParagraphFormat getDefaultParagraphFormat() {
        if (this.zzX9E == null) {
            this.zzX9E = new ParagraphFormat(this.zzX9Q, this);
        }
        return this.zzX9E;
    }

    public DocumentBase getDocument() {
        return this.zzZG3;
    }

    @Override // java.lang.Iterable
    public Iterator<Style> iterator() {
        ArrayList arrayList = new ArrayList();
        Iterator<Map.Entry<K, V>> it = this.zzX9O.iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            String str = (String) entry.getKey();
            Style style = (Style) entry.getValue();
            if (com.aspose.words.internal.zzZKN.equals(style.getName(), str)) {
                com.aspose.words.internal.zzZQG.zzZ((ArrayList<Style>) arrayList, style);
            }
        }
        return arrayList.iterator();
    }

    public Object memberwiseClone() {
        try {
            return clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException(e);
        }
    }

    public final void remove(String str) {
        while (true) {
            Style styleZz0 = zz0(str, false);
            if (styleZz0 == null) {
                throw new IllegalArgumentException("Style not found.");
            }
            for (Style style : this) {
                if (style.zzY3v() == styleZz0.zzZ7j()) {
                    zzZ(style, styleZz0);
                    style.zzl5(zzkY(style.getType()));
                    if (style.getType() == 1 && style.zzY3u() == styleZz0.zzZ7j()) {
                        style.zzl4(style.zzZ7j());
                    }
                } else if (style.getType() == 1 && style.zzY3u() == styleZz0.zzZ7j()) {
                    style.zzl4(0);
                }
            }
            zzV(styleZz0, styleZz0.zzZ7j(), -1);
            if (styleZz0.hasRevisions() && (styleZz0.getDocument() instanceof Document)) {
                ((Document) styleZz0.getDocument()).getRevisions().zzH(styleZz0);
            }
            zzs(styleZz0);
            Style linkedStyle = styleZz0.getLinkedStyle();
            if (linkedStyle == null) {
                return;
            }
            linkedStyle.zzl3(StyleIdentifier.NIL);
            str = linkedStyle.getName();
        }
    }

    public final Style zz0(String str, boolean z) {
        com.aspose.words.internal.zzZ4.zzY((Object) str, "name");
        Style style = (Style) com.aspose.words.internal.zzQW.zzZ((com.aspose.words.internal.zzZYT) this.zzX9O, str);
        if (style == null && z) {
            Style styleZz0 = zzY32().zz0(str, false);
            if (styleZz0 == null) {
                styleZz0 = zzY33().zz0(str, false);
                if (styleZz0 == null) {
                    styleZz0 = zzY34().zz0(str, false);
                }
                if (styleZz0 == null) {
                    styleZz0 = zzY35().zz0(str, false);
                }
            }
            if (styleZz0 != null && styleZz0.getBuiltIn()) {
                return zzn(styleZz0);
            }
        }
        return style;
    }

    public final Style zzAY(String str) {
        Style style = get(str);
        if (style != null) {
            return style;
        }
        throw new IllegalStateException(com.aspose.words.internal.zzZKN.format("Cannot find style '{0}'.", str));
    }

    public final String zzGI(String str) {
        int i = 0;
        String str2 = str;
        while (this.zzX9O.containsKey(str2)) {
            str2 = com.aspose.words.internal.zzZKN.format("{0}_{1}", str, Integer.valueOf(i));
            i++;
        }
        return str2;
    }

    public final void zzR(StyleCollection styleCollection) {
        this.zzX9R = (zzYEF) styleCollection.zzX9R.zzbn();
        this.zzX9Q = (zzYMX) styleCollection.zzX9Q.zzbn();
        zzZ(styleCollection, new zzZ86(styleCollection, this));
    }

    public final Style zzVp(int i, int i2) {
        Style styleZzZ8 = zzZ8(i, i <= 14);
        if (styleZzZ8 != null) {
            return styleZzZ8;
        }
        Style styleZzZ82 = zzZ8(i2, i2 <= 14);
        if (styleZzZ82 != null) {
            return styleZzZ82;
        }
        throw new IllegalStateException("Cannot find a style with this istd.");
    }

    public final void zzX(Style style, int i, int i2) {
        this.zzX9P.remove(i);
        if (this.zzX9P.zzVE(i2)) {
            this.zzX9P.set(i2, style);
        } else {
            this.zzX9P.add(i2, style);
        }
        zzW(style, i, i2);
    }

    public final void zzY(Style style, int i, int i2) {
        if (style.getBuiltIn()) {
            this.zzX9N.remove(i);
        }
        if (i2 != 4094) {
            if (this.zzX9N.zzVE(i2)) {
                this.zzX9N.set(i2, style);
            } else {
                this.zzX9N.add(i2, style);
            }
        }
    }

    public final void zzY2U() {
        Iterator<Style> it = iterator();
        while (it.hasNext()) {
            zzYEF zzyefZzZYh = it.next().zzZYh();
            zzyefZzZYh.remove(380);
            zzyefZzZYh.remove(StyleIdentifier.LIST_TABLE_5_DARK_ACCENT_2);
            zzyefZzZYh.remove(390);
        }
    }

    public final void zzY2V() {
        ArrayList arrayList = new ArrayList();
        Iterator<Style> it = iterator();
        while (it.hasNext()) {
            com.aspose.words.internal.zzZQG.zzZ((ArrayList<Style>) arrayList, it.next());
        }
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            ((Style) it2.next()).zzY3g();
        }
        Iterator it3 = arrayList.iterator();
        while (it3.hasNext()) {
            ((Style) it3.next()).zzY3f();
        }
    }

    public final void zzY2X() {
        com.aspose.words.internal.zzZYV<Style> zzzyv = new com.aspose.words.internal.zzZYV<>(this.zzX9P.getCount());
        for (int i = 0; i < this.zzX9P.getCount(); i++) {
            Style styleZzVY = this.zzX9P.zzVY(i);
            zzzyv.add(styleZzVY.zzZ7j(), styleZzVY);
        }
        this.zzX9P = zzzyv;
    }

    public final boolean zzY2Z() {
        return zzY2Y() < 12286;
    }

    public final int zzY30() {
        if (zzY2Z()) {
            return zzY2Y();
        }
        throw new IllegalStateException("There are too many styles in the document.");
    }

    public final StyleCollection zzY32() {
        int mswVersion = (getDocument().getNodeType() == 1 ? (Document) getDocument() : ((GlossaryDocument) getDocument()).zzZrE()).getCompatibilityOptions().getMswVersion();
        if (mswVersion != 0) {
            switch (mswVersion) {
                case 8:
                case 9:
                case 10:
                case 11:
                    return zzY35();
                case 12:
                case 14:
                    return zzY34();
                case 15:
                case 16:
                case 17:
                    return zzY33();
            }
        }
        return zzkZ(getLoadFormat());
    }

    public final zzYMX zzY36() {
        return this.zzX9Q;
    }

    public final zzYEF zzY37() {
        return this.zzX9R;
    }

    public final int zzY38() {
        if (this.zzX9P.getCount() <= 0) {
            return -1;
        }
        return this.zzX9P.zzT3(r0.getCount() - 1);
    }

    public final boolean zzYec() {
        if (this.zzX9Q.getCount() > 0) {
            return true;
        }
        for (int i = 0; i < this.zzX9R.getCount(); i++) {
            if (!zzrx(this.zzX9R.zzT3(i))) {
                return true;
            }
        }
        return false;
    }

    public final zzZ73 zzYi5() {
        return this.zzX9M;
    }

    public final Style zzZ7(int i, boolean z) {
        Style styleZzkX;
        if (i == 4094) {
            throw new IllegalArgumentException("Cannot return user defined styles by style identifier.");
        }
        Style style = this.zzX9N.get(i);
        return (style == null && z && (styleZzkX = zzkX(i)) != null) ? zzn(styleZzkX) : style;
    }

    public final Style zzZ8(int i, boolean z) {
        Style styleZzZ8;
        Style style = this.zzX9P.get(i);
        return (style == null && z && (styleZzZ8 = zzY32().zzZ8(i, false)) != null) ? zzn(styleZzZ8) : style;
    }

    public final void zzZX(Document document) {
        zzZ86 zzz86 = new zzZ86(document, getDocument(), 0);
        boolean zZzY = Theme.zzY(this.zzZG3.zzZqI(), document.zzZqI());
        for (Style style : getDocument().getStyles()) {
            StyleCollection styles = document.getStyles();
            Style styleZzm = styles.zzm(style);
            if (styleZzm != null) {
                if (style.getStyleIdentifier() == 0) {
                    style.zzZ((zzYEF) styles.zzX9R.zzbn());
                    style.zzZ((zzYMX) styles.zzX9Q.zzbn());
                    styleZzm.zzZYh().zzY(style.zzZYh());
                    styleZzm.zzZYj().zzY(style.zzZYj());
                } else {
                    style.zzZ((zzYEF) styleZzm.zzZYh().zzbn());
                    style.zzZ((zzYMX) styleZzm.zzZYj().zzbn());
                    if (style.zzZYj().getListId() != 0) {
                        style.zzZYj().zzxC(zzz86.zzYVE().zzZ(zzz86, styleZzm.zzZYj().getListId()));
                    }
                    TableStyle tableStyle = (TableStyle) com.aspose.words.internal.zzZKW.zzZ(style, TableStyle.class);
                    TableStyle tableStyle2 = (TableStyle) com.aspose.words.internal.zzZKW.zzZ(styleZzm, TableStyle.class);
                    if (tableStyle != null && tableStyle2 != null) {
                        tableStyle.zzZ((zzY6G) tableStyle2.zzZYf().zzbn());
                        tableStyle.zzXWV();
                        Iterator<ConditionalStyle> it = tableStyle2.getConditionalStyles().zzZY9().iterator();
                        while (it.hasNext()) {
                            tableStyle.zzX(it.next().zzZYl());
                        }
                    }
                }
                if (!zZzY) {
                    Theme.zzZ(document.zzZqI(), style.zzZYh());
                }
            }
        }
    }

    public final Style zzkW(int i) {
        Style byStyleIdentifier = getByStyleIdentifier(i);
        if (byStyleIdentifier != null) {
            return byStyleIdentifier;
        }
        throw new IllegalStateException("Cannot find a style with this style identifier.");
    }

    public final Style zzm(Style style) {
        Style styleZzZ7;
        return (!style.getBuiltIn() || (styleZzZ7 = zzZ7(style.getStyleIdentifier(), false)) == null) ? zz0(style.getName(), false) : styleZzZ7;
    }

    public final Style zzn(Style style) {
        return zzZ(new zzZ86(style.getDocument(), getDocument(), 0), style);
    }

    public final void zzq(Style style) {
        if (style == null) {
            throw new NullPointerException("Value cannot be null.\r\nParameter name: style");
        }
        if (style.getStyles() != null) {
            throw new IllegalArgumentException("Style already belongs to another collection of styles.");
        }
        if (this.zzX9O.containsKey(style.getName())) {
            throw new IllegalArgumentException("Cannot add a style because a style with the same name already exists.");
        }
        if (style.getBuiltIn() && this.zzX9N.zzVE(style.getStyleIdentifier())) {
            throw new IllegalArgumentException("Cannot add a style because a style with this identifier already exists.");
        }
        this.zzX9P.add(style.zzZ7j(), style);
        this.zzX9O.zzB(style.getName(), style);
        if (style.getBuiltIn()) {
            this.zzX9N.add(style.getStyleIdentifier(), style);
        }
        style.zzS(this);
        this.zzX9D = null;
    }

    public final void zzs(Style style) {
        if (zzY32().zz0(style.getName(), false) != null) {
            this.zzX9N.remove(style.getStyleIdentifier());
        }
        this.zzX9P.remove(style.zzZ7j());
        zzr(style);
        this.zzX9D = null;
    }

    public final void zztF() {
        zzY2T();
        Style styleZz0 = zz0("Table Normal", false);
        if (styleZz0 == null || styleZz0.getType() == 3) {
            return;
        }
        zzs(styleZz0);
    }

    public Style get(int i) {
        return this.zzX9P.zzVY(i);
    }

    public final String zzW(Style style, boolean z) {
        if (this.zzX9D == null) {
            zzY2W();
        }
        String str = (String) com.aspose.words.internal.zzQW.zzZ(this.zzX9D, style);
        if (!com.aspose.words.internal.zzZYD.zzXk(str)) {
            str = "";
        }
        return z ? com.aspose.words.internal.zzZYD.zze(style.getName(), str) : str;
    }

    public final StyleCollection zzo(DocumentBase documentBase) {
        StyleCollection styleCollection = (StyleCollection) memberwiseClone();
        styleCollection.zzZG3 = documentBase;
        styleCollection.zzX9R = (zzYEF) this.zzX9R.zzbn();
        styleCollection.zzX9Q = (zzYMX) this.zzX9Q.zzbn();
        styleCollection.zzX9P = new com.aspose.words.internal.zzZYV<>();
        styleCollection.zzX9O = new com.aspose.words.internal.zzZYT<>();
        styleCollection.zzX9N = new com.aspose.words.internal.zzZYV<>();
        for (int i = 0; i < this.zzX9P.getCount(); i++) {
            styleCollection.zzq(this.zzX9P.zzVY(i).zzY3l());
        }
        Iterator<Map.Entry<K, V>> it = this.zzX9O.iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            String str = (String) entry.getKey();
            Style style = (Style) entry.getValue();
            if (!com.aspose.words.internal.zzZKN.equals(str, style.getName())) {
                styleCollection.zzX9O.zzB(str, styleCollection.zz0(style.getName(), false));
            }
        }
        styleCollection.zzX9M = this.zzX9M.zzYUg();
        styleCollection.zzX9D = null;
        styleCollection.zzX9F = null;
        styleCollection.zzX9E = null;
        return styleCollection;
    }

    private static void zzX(Style style, Style style2, zzZ86 zzz86) {
        int[] iArrZzrc;
        Theme themeZzZqI = style.getDocument().zzZqI();
        boolean z = (Theme.zzY(themeZzZqI, style2.getDocument().zzZqI()) || (style.getDocument() instanceof GlossaryDocument) || (style2.getDocument() instanceof GlossaryDocument)) ? false : true;
        boolean z2 = style.getType() == 2 && style.zzY3t() != 12287;
        int iZzX = zzX(style2, z2);
        zzYEF zzyefZzl1 = style.zzl1(iZzX);
        if (z) {
            Theme.zzZ(themeZzZqI, zzyefZzl1);
        }
        if (style2.getType() != 2 || style2.zzY3t() != 12287 || z2) {
            zzYEF zzyefZzl12 = style2.zzl1(iZzX | 128);
            if (zzz86 != null && (zzz86.zzZn1() == 2 || zzz86.zzYVu().getForceCopyStyles())) {
                iArrZzrc = style.zzZYh().zzrc();
            } else {
                iArrZzrc = new int[0];
            }
            zzyefZzl1.zzX(zzyefZzl12, iArrZzrc);
        }
        style2.zzZYh().zzZ(zzyefZzl1, 50, 40, 30);
        style2.zzZ(zzyefZzl1);
    }

    private static void zzY(Style style, Style style2, zzZ86 zzz86) {
        int[] iArrZzrc;
        zzYMX zzymxZzqw = style.zzqw(65);
        zzYMX zzymxZzqw2 = style2.zzqw(193);
        if (style.zzZYj().getListId() != 0) {
            style.getDocument().getLists().zzZ(style.zzZYj(), zzymxZzqw2);
        }
        if (zzz86 != null && (zzz86.zzZn1() == 2 || zzz86.zzYVu().getForceCopyStyles())) {
            iArrZzrc = style.zzZYj().zzrc();
        } else {
            iArrZzrc = new int[0];
        }
        zzymxZzqw.zzX(zzymxZzqw2, iArrZzrc);
        if (zzymxZzqw.zzYpL()) {
            style2.zzZYj().set(EditingLanguage.KASHMIRI_ARABIC, 0);
        }
        style2.zzZYj().zzZ(zzymxZzqw, 1000, EditingLanguage.KASHMIRI_ARABIC, 1580);
        style2.zzZ(zzymxZzqw);
    }

    private static void zzZ(zzYEF zzyef, int i, int i2) {
        if (zzyef.zzZ7j() == i) {
            if (i2 == -1) {
                zzyef.remove(50);
            } else {
                zzyef.set(50, Integer.valueOf(i2));
            }
        }
    }

    private void zzW(Style style, Style style2, zzZ86 zzz86) {
        if (zzY8O.zzd(style2)) {
            return;
        }
        Style styleZzY3j = style.zzY3j();
        if (styleZzY3j != null) {
            Style styleZzm = zzm(styleZzY3j);
            style2.zzl5(styleZzm != null ? styleZzm.zzZ7j() : zzkY(style2.getType()));
        }
        zzZ(style, style2, zzz86);
    }

    private static void zzZ(Style style, Style style2) {
        int type = style2.getType();
        if (type == 1) {
            style.zzZ(style.zzl1(0));
            style.zzZ(style.zzqw(1));
            return;
        }
        if (type == 2) {
            style.zzZ(style.zzl1(0));
            return;
        }
        if (type != 3) {
            if (type != 4) {
                throw new IllegalArgumentException("Unexpected style type.");
            }
            return;
        }
        TableStyle tableStyle = (TableStyle) style;
        tableStyle.zzY(tableStyle.zzXWT());
        tableStyle.zzZ(tableStyle.zzXWS());
        tableStyle.zzZ(tableStyle.zzXWU());
        style.zzZ(style.zzl1(0));
        style.zzZ(style.zzqw(1));
    }

    private Style zzW(Style style, zzZ86 zzz86) {
        Style styleZzm = zzm(style);
        while (styleZzm != null && styleZzm.getType() != style.getType()) {
            Style styleZzl = style.getStyles().zzl(styleZzm);
            if (styleZzl != null) {
                zzX(styleZzm, styleZzl);
                styleZzm = zzm(style);
            } else {
                zzY1Z.zzY(getDocument().getWarningCallback(), 0, "Cannot copy style {0} because it matches a style of a different type.", style.getName());
                zzz86.zzYVD().set(style.zzZ7j(), StyleIdentifier.NIL);
                return null;
            }
        }
        if (styleZzm != null) {
            zzY(style, styleZzm);
        } else {
            styleZzm = style.zzY3l();
            if (this.zzX9P.zzVE(styleZzm.zzZ7j())) {
                styleZzm.zzBl(zzY30());
            }
            zzq(styleZzm);
        }
        zzz86.zzYVD().set(style.zzZ7j(), styleZzm.zzZ7j());
        return styleZzm;
    }

    private Style zzY(zzZ86 zzz86, Style style) {
        Style styleZzZ7;
        if (zzY8O.zzd(style) && (styleZzZ7 = zzZ7(style.getStyleIdentifier(), false)) != null) {
            return styleZzZ7;
        }
        Style styleZzY3l = style.zzY3l();
        styleZzY3l.zzl5(StyleIdentifier.NIL);
        styleZzY3l.zzl4(StyleIdentifier.NIL);
        styleZzY3l.zzl3(StyleIdentifier.NIL);
        if (zzz86.zzYVx()) {
            Theme.zzZ(zzz86.zzYVJ().zzZqI(), styleZzY3l.zzZYh());
        }
        if (zzz86.zzYVw()) {
            zzY5J.zzZ(styleZzY3l, zzz86.zzYVI().zzZqI());
        }
        if (zzm(style) == null) {
            if (style.zzZ7j() > 14) {
                styleZzY3l.zzBl(zzY30());
            }
        } else {
            styleZzY3l.zzB0(zzGI(style.getName()));
            styleZzY3l.zzBl(zzY30());
            styleZzY3l.setStyleIdentifier(StyleIdentifier.USER);
        }
        Style styleZzZ = zzZ(style, zzz86, styleZzY3l);
        if (!zzz86.zzYVH().zzY31()) {
            zzW(style, styleZzZ, zzz86);
        }
        return styleZzZ;
    }

    public final void zzZ(Style style, String str, String str2) {
        this.zzX9O.remove(str);
        if (!this.zzX9O.containsKey(str2)) {
            this.zzX9O.zzB(str2, style);
        } else {
            Style style2 = this.zzX9O.get(str2);
            this.zzX9O.set(str2, style);
            if (style2 != style && com.aspose.words.internal.zzZKN.equals(style2.getName(), str2)) {
                zzr(style2);
            }
        }
        this.zzX9D = null;
    }

    private static int zzX(Style style, boolean z) {
        return (style.getType() == 2 && style.zzY3t() == 12287 && !z) ? 0 : 33;
    }

    private Style zzX(zzZ86 zzz86, Style style) {
        Style styleZzk;
        Style styleZzm = zzm(style);
        if (styleZzm != null) {
            if (zzz86.zzZn1() == 0) {
                return styleZzm;
            }
            Style styleZzY = zzY(zzz86, style);
            if (zzz86.zzYVu().getKeepSourceNumbering() || (styleZzk = zzk(styleZzY)) == null) {
                return styleZzY;
            }
            styleZzY.remove();
            zzz86.zzYVD().set(style.zzZ7j(), styleZzk.zzZ7j());
            if (style.zzY3t() != 12287) {
                zzz86.zzYVD().set(style.zzY3t(), styleZzk.zzY3t());
            }
            return styleZzk;
        }
        return zzY(zzz86, style);
    }

    public final void zzZ(Style style, String[] strArr) {
        if (!zzo(style)) {
            zzZ7(style.getStyleIdentifier(), true);
            return;
        }
        if (this.zzX9O.containsKey(style.getName())) {
            style.zzB0(zzGI(style.getName()));
        }
        if (style.getBuiltIn() && this.zzX9N.zzVE(style.getStyleIdentifier())) {
            style.setStyleIdentifier(StyleIdentifier.USER);
        }
        zzq(style);
        if (strArr != null) {
            for (String str : strArr) {
                if (!"Normal".equals(str) || style.getStyleIdentifier() == 0) {
                    this.zzX9O.zzB(zzGI(str), style);
                }
            }
            this.zzX9D = null;
        }
    }

    private int zzX(Style style, zzZ86 zzz86) {
        Style styleZzk;
        style.zzY3v();
        Style styleZzY3j = style.zzY3j();
        int iZzZ7j = zzz86.zzYVD().get(styleZzY3j.zzZ7j());
        if (iZzZ7j == Integer.MIN_VALUE) {
            if (zzY8O.zzd(styleZzY3j)) {
                styleZzk = zzZ7(styleZzY3j.getStyleIdentifier(), false);
            } else {
                Style styleZzm = zzm(styleZzY3j);
                styleZzk = (styleZzm == null && zzz86.zzZn1() == 2) ? zzk(styleZzY3j) : styleZzm;
            }
            if (styleZzk != null) {
                iZzZ7j = styleZzk.zzZ7j();
            }
        }
        return com.aspose.words.internal.zzD4.zzWm(iZzZ7j) ? StyleIdentifier.NIL : iZzZ7j;
    }

    public final int zzY(Style style, zzZ86 zzz86) {
        int listId;
        int i = zzz86.zzYVD().get(style.zzZ7j());
        if (!com.aspose.words.internal.zzD4.zzWm(i)) {
            return i;
        }
        Style styleZzW = zzW(style, zzz86);
        if (styleZzW == null) {
            return StyleIdentifier.NIL;
        }
        styleZzW.zzl5(StyleIdentifier.NIL);
        styleZzW.zzl4(StyleIdentifier.NIL);
        styleZzW.zzl3(StyleIdentifier.NIL);
        if (style.zzY3v() != 12287) {
            styleZzW.zzl5(zzY(style.zzY3j(), zzz86));
        }
        if (style.zzY3t() != 12287) {
            styleZzW.zzl3(zzY(style.getLinkedStyle(), zzz86));
        }
        if (style.zzY3u() != 12287) {
            styleZzW.zzl4(zzY(style.zzY3i(), zzz86));
        }
        if ((style.getType() == 4 || style.getType() == 1) && (listId = style.zzZYj().getListId()) != 0) {
            styleZzW.zzZYj().set(EditingLanguage.KASHMIRI_ARABIC, Integer.valueOf(getDocument().getLists().zzZ(listId, zzz86)));
        }
        return styleZzW.zzZ7j();
    }

    private Style zzZ(Style style, zzZ86 zzz86) {
        boolean zZzZ;
        Style styleZzY3l = style.zzY3l();
        styleZzY3l.zzB0(this.zzX9O.containsKey(style.getName()) ? zzGI(style.getName()) : style.getName());
        int iZzAE = zzY8O.zzAE(styleZzY3l.getName());
        if (iZzAE != 4094) {
            zZzZ = zzY8O.zzZ(styleZzY3l, iZzAE, null, false);
        } else {
            styleZzY3l.setStyleIdentifier(StyleIdentifier.USER);
            zZzZ = false;
        }
        if (!zZzZ) {
            styleZzY3l.zzBl(zzY30());
        }
        styleZzY3l.zzl4(zzY8O.zzkG(style.zzY3u()) ? style.zzY3u() : styleZzY3l.zzZ7j());
        styleZzY3l.zzl5(zzY8O.zzkG(style.zzY3v()) ? style.zzY3v() : StyleIdentifier.NIL);
        zzq(styleZzY3l);
        int iIntValue = ((Integer) style.fetchParaAttr(EditingLanguage.KASHMIRI_ARABIC)).intValue();
        if (style.getType() != 2 && iIntValue > 0) {
            List listZzZ = getDocument().getLists().zzZ(style.getDocument().getLists().zzxu(iIntValue), false);
            styleZzY3l.zzZYj().zzxC(listZzZ.getListId());
            for (ListLevel listLevel : listZzZ.getListLevels()) {
                if (listLevel.zzYOc() == style.zzZ7j()) {
                    listLevel.zzx2(styleZzY3l.zzZ7j());
                }
            }
        }
        if (styleZzY3l.hasRevisions() && (styleZzY3l.getDocument() instanceof Document)) {
            ((Document) styleZzY3l.getDocument()).getRevisions().zzG(styleZzY3l);
        }
        Document document = (Document) com.aspose.words.internal.zzZKW.zzZ(style.getDocument(), Document.class);
        if (document != null && !document.getStyles().zzY31()) {
            zzZ(style, styleZzY3l, (zzZ86) null);
        }
        return styleZzY3l;
    }

    private static void zzX(Style style, Style style2) {
        StyleCollection styles = style2.getStyles();
        styles.zzr(style2);
        styles.zzX9O.set(style.getName(), style2);
        for (String str : style.getAliases()) {
            styles.zzX9O.set(str, style2);
        }
        if (styles.zzX9D != null) {
            if (style.getStyles().zzX9D.containsKey(style)) {
                styles.zzX9D.put(style2, style.getStyles().zzX9D.get(style));
            } else {
                com.aspose.words.internal.zzZQF.zzY(styles.zzX9D, style2);
            }
        }
    }

    private static void zzY(Style style, Style style2) {
        style.getType();
        style2.getType();
        style2.zzY3k();
        zzX(style, style2);
        style2.zzw(style);
        style2.zzZ((zzYEF) style.zzZYh().zzbn());
        if (style2.getType() == 2) {
            return;
        }
        style2.zzZ((zzYMX) style.zzZYj().zzbn());
        if (style2.getType() == 3) {
            TableStyle.zzY((TableStyle) style, (TableStyle) style2);
        }
    }

    private static void zzZ(Style style, Style style2, zzZ86 zzz86) {
        int type = style.getType();
        if (type == 1) {
            zzX(style, style2, zzz86);
            zzY(style, style2, zzz86);
        } else if (type == 2) {
            zzX(style, style2, zzz86);
        } else if (type == 3) {
            zzZ((TableStyle) style, (TableStyle) style2, zzz86);
        } else if (type != 4) {
            throw new IllegalArgumentException("Unknown style type");
        }
    }

    private static void zzZ(TableStyle tableStyle, TableStyle tableStyle2, zzZ86 zzz86) {
        zzX(tableStyle, tableStyle2, zzz86);
        zzY(tableStyle, tableStyle2, zzz86);
        tableStyle2.zzY(tableStyle.zzXWT());
        tableStyle2.zzZ(tableStyle.zzXWS());
        tableStyle2.zzZ(tableStyle.zzXWU());
        TableStyle tableStyle3 = (TableStyle) com.aspose.words.internal.zzZKW.zzZ(tableStyle2.zzY3j(), TableStyle.class);
        if (tableStyle3 != null) {
            if (zzz86 != null && zzz86.zzZn1() == 2) {
                tableStyle2.zzZYd().zzX(tableStyle3.zzXWT(), tableStyle.zzZYd().zzrc());
                tableStyle2.zz6G().zzX(tableStyle3.zzXWS(), tableStyle.zz6G().zzrc());
                tableStyle2.zzZYf().zzX(tableStyle3.zzXWU(), tableStyle.zzZYf().zzrc());
            } else {
                tableStyle2.zzZYd().zzX(tableStyle3.zzXWT());
                tableStyle2.zz6G().zzX(tableStyle3.zzXWS());
                tableStyle2.zzZYf().zzX(tableStyle3.zzXWU());
            }
        }
    }

    public final Style zzZ(zzZ86 zzz86, Style style) {
        try {
            if (style != null) {
                if (style.getStyles() == this) {
                    return style;
                }
                if (style.zzY3v() != 12287 && zzX(style, zzz86) == 12287) {
                    zzZ(zzz86, style.zzY3j());
                }
                if (zzz86.zzR(style)) {
                    return zzZ8(zzz86.zzYVD().get(style.zzZ7j()), false);
                }
                int iZzZn1 = zzz86.zzZn1();
                if (iZzZn1 != 0) {
                    if (iZzZn1 == 1) {
                        return zzY(zzz86, style);
                    }
                    if (iZzZn1 != 2) {
                        throw new IllegalStateException("Unknown import format action.");
                    }
                }
                return zzX(zzz86, style);
            }
            throw new NullPointerException("Value cannot be null.\r\nParameter name: srcStyle");
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    private Style zzZ(Style style, zzZ86 zzz86, Style style2) {
        zzq(style2);
        zzz86.zzYVD().set(style.zzZ7j(), style2.zzZ7j());
        if (style.zzY3v() != 12287) {
            int iZzX = zzX(style, zzz86);
            com.aspose.words.internal.zzZKN.format("The base style for '{0}' must be already imported.", style2.getName());
            style2.zzl5(iZzX);
        }
        if (style.getType() == 4 || style.getType() == 1) {
            zzZ(zzz86, style, style2);
        }
        if (style.zzY3u() != 12287) {
            style2.zzl4(zzZ(zzz86, style.zzY3i()).zzZ7j());
        }
        if (style.zzY3t() != 12287) {
            style2.zzl3(zzZ(zzz86, style.getLinkedStyle()).zzZ7j());
        }
        return style2;
    }

    private static void zzZ(zzZ86 zzz86, Style style, Style style2) {
        if (style.getType() != 1) {
            style.getType();
        }
        if (style.zzZYj().getListId() == 0) {
            return;
        }
        style2.zzZYj().zzxC(zzz86.zzYVE().zzZ(zzz86, style.zzZYj().getListId()));
        if (style2.getType() == 4) {
            style2.getList().zzYPa().zzxh(style2.zzZ7j());
        }
    }

    private void zzZ(StyleCollection styleCollection, zzZ86 zzz86) {
        Iterator<Style> it = styleCollection.iterator();
        while (it.hasNext()) {
            zzY(it.next(), zzz86);
        }
    }
}
