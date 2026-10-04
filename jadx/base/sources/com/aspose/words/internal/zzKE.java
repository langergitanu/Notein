package com.aspose.words.internal;

import androidx.core.app.NotificationCompat;

/* JADX INFO: loaded from: classes5.dex */
public final class zzKE {
    private static zzZYV<String> zzBW = new zzZYV<>(50);
    private static zzZYT<Integer> zzBV = new zzZYT<>(false);
    private static zzZYT<Integer> zzBU = new zzZYT<>(false);
    private static zzZYV<String> zzBT = new zzZYV<>();
    private static zzZYV<String> zzBS = new zzZYV<>();

    static {
        zzZ(1, "Xml", "text/xml", null);
        zzZ(1, "Xml", "application/xml", null);
        zzZ(8, "Tiff", "image/tiff", "tif");
        zzZ(8, "Tiff", null, "tiff");
        zzZ(7, "Bmp", "image/bmp", "bmp");
        zzZ(6, "Png", "image/png", "png");
        zzZ(5, "Jpeg", "image/jpeg", "jpeg");
        zzZ(5, "Jpeg", null, "jpg");
        zzZ(2, "Emf", "image/x-emf", "emf");
        zzZ(3, "Wmf", "image/x-wmf", "wmf");
        zzZ(4, "Pict", "image/x-pict", "pict");
        zzZ(4, "Pict", null, "pct");
        zzZ(9, "Gif", "image/gif", "gif");
        zzZ(11, "WebP", "image/webp", "webp");
        zzZ(37, "Xps", "application/vnd.ms-xpsdocument", "xps");
        zzZ(38, "Oxps", "application/oxps", "oxps");
        zzZ(36, "Pdf", "application/pdf", "pdf");
        zzZ(43, "Ps", "application/postscript", "ps");
        zzZ(10, "Eps", "image/x-eps", "eps");
        zzZ(44, "Pcl", "application/pcl", "pcl");
        zzZ(39, "Svg", "image/svg+xml", "svg");
        zzZ(32, "Epub", "application/epub+zip", "epub");
        zzZ(33, "Azw3", "application/x-mobi8-ebook", "azw3");
        zzZ(27, "Html", "text/html", "html");
        zzZ(27, "Html", null, "htm");
        zzZ(27, "Html", null, "xhtml");
        zzZ(28, "HtmlFixed", null, "html");
        zzZ(34, "Txt", "text/plain", "txt");
        zzZ(35, "Md", "text/markdown", "md");
        zzZ(35, "Md", null, "markdown");
        zzZ(35, "Md", null, "markdn");
        zzZ(35, "Md", null, "mdown");
        zzZ(35, "Md", null, "mdwn");
        zzZ(35, "Md", null, "mkdn");
        zzZ(35, "Md", null, "mkd");
        zzZ(13, "Doc", "application/msword", "doc");
        zzZ(14, "Dot", "application/msword", "dot");
        zzZ(12, "DocPreWord97", null, "doc");
        zzZ(26, "Rtf", "application/rtf", "rtf");
        zzZ(19, "WordML", "text/xml", "wml");
        zzZ(19, "WordML", null, "wordml");
        zzZ(19, "WordML", null, "xml");
        zzZ(29, "Mhtml", "multipart/related", "mht");
        zzZ(29, "Mhtml", null, "mhtml");
        zzZ(29, "Mhtml", null, "mhtm");
        zzZ(29, "Mhtml", null, NotificationCompat.CATEGORY_MESSAGE);
        zzZ(29, "Mhtml", null, "eml");
        zzZ(30, "Mobi", "application/x-mobipocket-ebook", "mobi");
        zzZ(30, "Mobi", null, "prc");
        zzZ(31, "Chm", "application/vnd.ms-htmlhelp", "chm");
        zzZ(15, "Docx", "application/vnd.openxmlformats-officedocument.wordprocessingml.document", "docx");
        zzZ(16, "Docm", "application/vnd.ms-word.document.macroEnabled.12", "docm");
        zzZ(17, "Dotx", "application/vnd.openxmlformats-officedocument.wordprocessingml.template", "dotx");
        zzZ(18, "Dotm", "application/vnd.ms-word.template.macroEnabled.12", "dotm");
        zzZ(24, "Odt", "application/vnd.oasis.opendocument.text", "odt");
        zzZ(25, "Ott", "application/vnd.oasis.opendocument.text-template", "ott");
        zzZ(20, "FlatOpc", "application/vnd.openxmlformats-officedocument.wordprocessingml.document+xml", "fopc");
        zzZ(21, "FlatOpcMacroEnabled", "application/vnd.ms-word.document.macroEnabled.main+xml", "fopc");
        zzZ(22, "FlatOpcTemplate", "application/vnd.openxmlformats-officedocument.wordprocessingml.template.main+xml", "fopc");
        zzZ(23, "FlatOpcTemplateMacroEnabled", "application/vnd.ms-word.template.macroEnabledTemplate.main+xml", "fopc");
        zzZ(41, "XamlFlow", "application/xaml+xml", "xaml");
        zzZ(42, "XamlFlowPack", "application/xaml+xml", "xamlpack");
        zzZ(40, "XamlFixed", "application/xml", "xaml");
        zzZ(45, "QuickTimeMovie", "application/movie", "mov");
        zzZ(46, "Ico", "image/x-icon", "ico");
        zzZ(47, "Odttf", "application/vnd.openxmlformats-officedocument.obfuscatedFont", "odttf");
        zzZ(48, "Xlsx", "application/vnd.openxmlformats-officedocument.spreadsheetml.sheet", "xlsx");
    }

    public static String toString(int i) {
        String str = zzBW.get(i);
        zzZYD.zzXk(str);
        return str;
    }

    public static String zzWX(int i) {
        return zzBS.get(i);
    }

    public static String zzWY(int i) {
        return zzBT.get(i);
    }

    private static void zzZ(int i, String str, String str2, String str3) {
        if (!zzBW.zzVE(i)) {
            zzBW.add(i, str);
        }
        if (str2 != null) {
            if (!zzBT.zzVE(i)) {
                zzBT.add(i, str2);
            }
            if (!zzBV.containsKey(str2)) {
                zzBV.zzB(str2, Integer.valueOf(i));
            }
        }
        if (str3 != null) {
            if (!zzBS.zzVE(i)) {
                zzBS.add(i, str3);
            }
            if (zzBU.containsKey(str3)) {
                return;
            }
            zzBU.zzB(str3, Integer.valueOf(i));
        }
    }

    public static int zzZT(String str) {
        if (!zzZYD.zzXk(str)) {
            return 0;
        }
        if (zzZKN.zzS(str, ".", zzZOF.ORDINAL$4894b8c8)) {
            str = str.substring(1);
        }
        return zzBU.zzZ(str, 0).intValue();
    }

    public static int zzZU(String str) {
        if (zzZYD.zzXk(str)) {
            return zzBV.zzZ(str, 0).intValue();
        }
        return 0;
    }
}
