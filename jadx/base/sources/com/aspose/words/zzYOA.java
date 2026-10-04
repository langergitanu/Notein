package com.aspose.words;

import java.util.ArrayList;
import java.util.HashMap;

/* JADX INFO: loaded from: classes6.dex */
final class zzYOA {
    private static zzYOA zzXIY;
    int zzXJ4;
    String zzXJ5;
    String zzXJ6;
    String zzXJ7;
    String zzXJ8;
    String zzXJ9;
    private static com.aspose.words.internal.zzZYG<zzYOA> zzXJ2 = new com.aspose.words.internal.zzZYG<>();
    private static com.aspose.words.internal.zzZYG<zzYOA> zzXJ1 = new com.aspose.words.internal.zzZYG<>();
    private static com.aspose.words.internal.zzZYG<zzYOA> zzXJ0 = new com.aspose.words.internal.zzZYG<>();
    private static HashMap<String, String> zzXIZ = new HashMap<>();
    private static ArrayList<zzYOA> zzXJ3 = new ArrayList<>();

    static {
        zzZ(".docx", "{F4754C9B-64F5-4B40-8AF4-679732AC0607}", "Word.Document.12", "Microsoft Word Document", "docx", 4);
        zzZ(".dotx", "{912ABC52-36E2-4714-8E62-A8B73CA5E390}", "Word.Template.12", "Microsoft Word Template", "dotx", 4);
        zzZ(".docm", "{18A06B6B-2F3F-4E2B-A611-52BE631B2D22}", "Word.DocumentMacroEnabled.12", "Microsoft Word Macro-Enabled Document", "docm", 4);
        zzZ(".dotm", "{8A624388-AA27-43E0-89F8-2A12BFF7BCCD}", "Word.TemplateMacroEnabled.12", "Microsoft Word Macro-Enabled Template", "dotm", 4);
        zzZ(".doc", "{00020906-0000-0000-C000-000000000046}", "Word.Document.8", "Microsoft Word 97 - 2003 Document", "doc", 2);
        zzZ(".dot", "{00020906-0000-0000-C000-000000000046}", "Word.Template.8", "Microsoft Word 97 - 2003 Template", "dot", 2);
        zzZ(".xlsx", "{00020830-0000-0000-C000-000000000046}", "Excel.Sheet.12", "Microsoft Excel Worksheet", "xlsx", 4);
        zzZ(".xlsb", "{00020833-0000-0000-C000-000000000046}", "Excel.SheetBinaryMacroEnabled.12", "Microsoft Excel Binary Worksheet", "xlsb", 4);
        zzZ(".xlsm", "{00020832-0000-0000-C000-000000000046}", "Excel.SheetMacroEnabled.12", "Microsoft Excel Macro-Enabled Worksheet", "xlsm", 4);
        zzZ(".xltx", "{00020830-0000-0000-C000-000000000046}", "Excel.Template", "Microsoft Excel Template", "xltx", 4);
        zzZ(".xltm", "{00020832-0000-0000-C000-000000000046}", "Excel.TemplateMacroEnabled", "Microsoft Excel Macro-Enabled Template", "xltm", 4);
        zzZ(".xls", "{00020820-0000-0000-C000-000000000046}", "Excel.Sheet.8", "Microsoft Excel 97-2003 Worksheet", "xls", 2);
        zzZ(".xlt", "{00020820-0000-0000-C000-000000000046}", "Excel.Template.8", "Microsoft Excel Template", "xlt", 2);
        zzZ(".odp", "{C282417B-2662-44B8-8A94-3BFF61C50900}", "PowerPoint.OpenDocumentPresentation.12", "OpenDocument Presentation", "odp", 5);
        zzZ(".ods", "{EABCECDB-CC1C-4A6F-B4E3-7F888A5ADFC8}", "Excel.OpenDocumentSpreadsheet.12", "OpenDocument Spreadsheet", "ods", 5);
        zzZ(".odt", "{1B261B22-AC6A-4E68-A870-AB5080E8687B}", "Word.OpenDocumentText.12", "OpenDocument Text", "odt", 5);
        zzZ(".potx", "{75D01070-1234-44E9-82F6-DB5B39A47C13}", "PowerPoint.Template.12", "Microsoft PowerPoint Template", "potx", 4);
        zzZ(".potm", "{AA14F9C9-62B5-4637-8AC4-8F25BF29D5A7}", "PowerPoint.TemplateMacroEnabled.12", "Microsoft PowerPoint Macro-Enabled Design Template", "potm", 4);
        zzZ(".pptx", "{CF4F55F4-8F87-4D47-80BB-5808164BB3F8}", "PowerPoint.Show.12", "Microsoft PowerPoint Presentation", "pptx", 4);
        zzZ(".pptm", "{DC020317-E6E2-4A62-B9FA-B3EFE16626F4}", "PowerPoint.ShowMacroEnabled.12", "Microsoft PowerPoint Macro-Enabled Presentation", "pptm", 4);
        zzZ(".ppsx", "{CF4F55F4-8F87-4D47-80BB-5808164BB3F8}", "PowerPoint.SlideShow.12", "Microsoft PowerPoint Slide Show", "ppsx", 4);
        zzZ(".ppsm", "{DC020317-E6E2-4A62-B9FA-B3EFE16626F4}", "PowerPoint.SlideShowMacroEnabled.12", "Microsoft PowerPoint Macro-Enabled Slide Show", "ppsm", 4);
        zzZ(".sldx", "{048EB43E-2059-422F-95E0-557DA96038AF}", "PowerPoint.Slide.12", "Microsoft PowerPoint Slide", "sldx", 0);
        zzZ(".sldm", "{3C18EAE4-BC25-4134-B7DF-1ECA1337DDDC}", "PowerPoint.SlideMacroEnabled.12", "Microsoft PowerPoint Macro-Enabled Slide", "sldx", 0);
        zzZ(".ppt", "{64818D10-4F9B-11CF-86EA-00AA00B929E8}", "PowerPoint.Show.8", "Microsoft PowerPoint 97-2003 Presentation", "ppt", 2);
        zzZ(".pot", "{64818D11-4F9B-11CF-86EA-00AA00B929E8}", "PowerPoint.Template.8", "Microsoft PowerPoint 97-2003 Template", "pot", 2);
        zzZ(".pps", "{64818D10-4F9B-11CF-86EA-00AA00B929E8}", "PowerPoint.SlideShow.8", "Microsoft PowerPoint 97-2003 Slide Show", "pps", 2);
        zzZ(".pdf", "{B801CA65-A1FC-11D0-85AD-444553540000}", "AcroExch.Document.7", "Adobe Acrobat Document", "pdf", 3);
        zzZ(".dwg", "{6a221957-2d85-42a7-8e19-be33950d1deb}", "AutoCAD.Drawing.19", "Autodesk AutoCAD Document", null, 3);
        zzZ(".bmp", "{0003000A-0000-0000-C000-000000000046}", "PBrush", "Bitmap Image", "bmp", 1);
        zzZ(".vsd", "{00021A14-0000-0000-C000-000000000046}", "Visio.Drawing.11", "Microsoft Visio Document", "vsd", 2);
        zzZ(".vsdx", "{00021a15-0000-0000-c000-000000000046}", "Visio.Drawing.15", "Microsoft Visio Document", "vsd", 4);
        zzZ(".mpp", "{74b78f3a-c8c8-11d1-be11-00c04fb6faf1}", "MSProject.Project.9", "Microsoft Project 9.0", "mpp", 2);
        zzZ(".html", "{25336920-03F9-11CF-8FD0-00AA00686F13}", "htmlfile", "HTML Document", "html", 0);
        zzZ(null, "{0002ce02-0000-0000-c000-000000000046}", "Equation.3", "Microsoft Equation 3.0", null, 6);
        zzZ(null, "{e4c18d40-1cd5-101c-b325-00aa001f3168}", "OrgPlusWOPX.4", "Organization Chart Add-in for Microsoft Office", "xls", 2);
        zzZ(null, "{64818D11-4F9B-11CF-86EA-00AA00B929E8}", "PowerPoint.Slide.8", "Microsoft PowerPoint 97-2003 Slide", "ppt", 2);
        zzt("{00030007-0000-0000-C000-000000000046}", "MSDraw", "Microsoft Word Picture");
        zzt("{0003000B-0000-0000-C000-000000000046}", "Equation", "Microsoft Equation 2.0");
        zzt("{0003000D-0000-0000-C000-000000000046}", "SoundRec", "");
        zzt("{0003000E-0000-0000-C000-000000000046}", "MPlayer", "");
        zzt("{0004c8d8-0000-0000-c000-000000000046}", "WPGraphic21", "");
        zzt("{EA7BAE70-FB3B-11CD-A903-00AA00510EA3}", "PowerPoint.Show.7", "");
        zzt("{EA7BAE71-FB3B-11CD-A903-00AA00510EA3}", "PowerPoint.Slide.7", "");
        zzt("{64818D10-4F9B-11CF-86EA-00AA00B929E8}", "PowerPoint.Wizard.8", "");
        zzt("{00020900-0000-0000-C000-000000000046}", "Word.Document.6", "");
        zzt("{00020901-0000-0000-C000-000000000046}", "Word.Picture.6", "");
        zzt("{00020907-0000-0000-C000-000000000046}", "Word.Picture.8", "");
        zzt("{00020906-0000-0000-C000-000000000046}", "Word.RTF.8", "");
        zzt("{00024500-0000-0000-C000-000000000046}", "Excel.Application.12", "");
        zzt("{00020811-0000-0000-C000-000000000046}", "Excel.Chart.5", "");
        zzZ(null, "{00020821-0000-0000-C000-000000000046}", "Excel.Chart.8", "Microsoft Excel Chart", "xls", 2);
        zzt("{00020832-0000-0000-C000-000000000046}", "Excel.CSV", "");
        zzt("{00020810-0000-0000-C000-000000000046}", "Excel.Sheet.5", "");
        zzt("{D3E34B21-9D75-101A-8C3D-00AA001A1652}", "Paint.Picture", "");
        zzt("{448BB771-CFE2-47C4-BCDF-1FBF378E202C}", "opendocument.DrawDocument.1", "");
        zzYOA zzyoa = new zzYOA(null, "0003000c-0000-0000-c000-000000000046", "Package", "OLE Package", "packager", 0);
        zzXIY = zzyoa;
        zzZ(zzyoa.zzXJ6, zzyoa.zzXJ8, zzyoa.zzXJ9, zzyoa.zzXJ7, zzyoa.zzXJ5, 0);
    }

    private zzYOA(String str, String str2, String str3, String str4, String str5, int i) {
        this.zzXJ9 = str3;
        this.zzXJ8 = str2;
        this.zzXJ7 = str4;
        this.zzXJ6 = str;
        this.zzXJ5 = str5;
        this.zzXJ4 = i;
    }

    public static String zzD7(String str) {
        zzYOA zzyoa = zzXJ1.get(str);
        return zzyoa != null ? zzyoa.zzXJ8 : com.aspose.words.internal.zzZOZ.zzZXP.toString();
    }

    public static zzYOA zzD8(String str) {
        zzYOA zzyoa = zzXJ2.get(str);
        return zzyoa == null ? zzXIY : zzyoa;
    }

    public static zzYOA zzD9(String str) {
        zzYOA zzyoa = zzXJ1.get(str);
        return zzyoa == null ? zzXIY : zzyoa;
    }

    public static String zzL(com.aspose.words.internal.zzZOZ zzzoz) {
        String str = com.aspose.words.internal.zzZKN.format("{{{0}}}", zzzoz.toString().toLowerCase());
        return zzXIZ.containsKey(str) ? zzXIZ.get(str) : ".bin";
    }

    public static zzYOA zzM(com.aspose.words.internal.zzZOZ zzzoz) {
        zzYOA zzyoa = zzXJ0.get(com.aspose.words.internal.zzZKN.format("{{{0}}}", com.aspose.words.internal.zzZKN.zzU1(zzzoz.toString())));
        return zzyoa == null ? zzXIY : zzyoa;
    }

    public static zzYOA zzYrn() {
        return zzXIY;
    }

    private static void zzZ(String str, String str2, String str3, String str4, String str5, int i) {
        if (com.aspose.words.internal.zzZYD.zzXk(str5)) {
            zzYO6.zzYri().containsKey(str5);
        }
        zzYOA zzyoa = new zzYOA(str, str2, str3, str4, str5, i);
        com.aspose.words.internal.zzZQG.zzZ(zzXJ3, zzyoa);
        if (str != null) {
            zzXJ2.zzW(str, zzyoa);
            String lowerCase = str2.toLowerCase();
            if (!zzXIZ.containsKey(lowerCase)) {
                com.aspose.words.internal.zzZQF.zzY(zzXIZ, lowerCase, str);
            }
        }
        zzXJ1.zzW(str3, zzyoa);
        if (zzXJ0.containsKey(str2)) {
            return;
        }
        zzXJ0.zzW(str2, zzyoa);
    }

    private static void zzt(String str, String str2, String str3) {
        zzZ(null, str, str2, str3, null, 0);
    }
}
