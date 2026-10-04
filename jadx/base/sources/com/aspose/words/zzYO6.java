package com.aspose.words;

import java.util.HashMap;

/* JADX INFO: loaded from: classes6.dex */
final class zzYO6 {
    private static boolean zzLX = false;
    private static com.aspose.words.internal.zzZYG<byte[]> zzXIN;
    private static com.aspose.words.internal.zzZYG<byte[]> zzXIP;
    static HashMap<String, String> zzXIS = zzYrh();
    static com.aspose.words.internal.zzZOZ zzXIR = new com.aspose.words.internal.zzZOZ("00000300-0000-0000-c000-000000000046");
    private static com.aspose.words.internal.zzZQ9 zzXIQ = new com.aspose.words.internal.zzZQ9(2013, 5, 3, 12, 23, 0);
    private static Object zzXIO = new Object();
    private static Object zzXIM = new Object();
    private static final com.aspose.words.internal.zzZHW zzUR = new com.aspose.words.internal.zzZHW("0", "1");

    public static String toString(int i) {
        switch (i) {
            case 0:
                return "OptionButton";
            case 1:
                return "Label";
            case 2:
                return "TextBox";
            case 3:
                return "CheckBox";
            case 4:
                return "ToggleButton";
            case 5:
                return "SpinButton";
            case 6:
                return "ComboBox";
            case 7:
                return "Frame";
            case 8:
                return "MultiPage";
            case 9:
                return "TabStrip";
            case 10:
                return "CommandButton";
            case 11:
                return "Image";
            case 12:
                return "ScrollBar";
            case 13:
                return "Form";
            case 14:
                return "ListBox";
            default:
                throw new IllegalStateException(com.aspose.words.internal.zzZKN.format("Unexpected Forms2 OLE control type: {0}", Integer.valueOf(i)));
        }
    }

    public static String zzD3(String str) {
        int i = com.aspose.words.internal.zzZOF.ORDINAL$4894b8c8;
        return com.aspose.words.internal.zzZKN.zzS(str, "Excel.Sheet.8", i) ? "application/vnd.ms-excel" : com.aspose.words.internal.zzZKN.zzS(str, "Word.Document.8", i) ? "application/msword" : com.aspose.words.internal.zzZKN.zzS(str, "PowerPoint.Show.8", i) ? "application/vnd.ms-powerpoint" : com.aspose.words.internal.zzZKN.zzS(str, "Visio.Drawing.11", i) ? "application/vnd.visio" : "application/vnd.openxmlformats-officedocument.oleObject";
    }

    public static byte zzD4(String str) {
        int iZzTP = zzUR.zzTP(str);
        if (iZzTP != 0) {
            return iZzTP != 1 ? (byte) -1 : (byte) 1;
        }
        return (byte) 0;
    }

    public static String zzD5(String str) {
        return (str == null || !zzXIS.containsKey(str)) ? zzXIS.get("packager") : zzXIS.get(str);
    }

    public static byte[] zzD6(String str) {
        return (str == null || !zzYri().containsKey(str)) ? zzYri().get("packager") : zzYri().get(str);
    }

    public static String zzJ(com.aspose.words.internal.zzZOX zzzox, int i) throws Exception {
        if (i <= 0) {
            return "";
        }
        byte[] bArrZzn = zzzox.zzn(i - 1);
        zzzox.readByte();
        return com.aspose.words.internal.zzZO0.zzQz(1251).zzZn(bArrZzn);
    }

    private static com.aspose.words.internal.zzAA zzL(com.aspose.words.internal.zzZOP zzzop, String str) throws Exception {
        com.aspose.words.internal.zzAA zzaa = new com.aspose.words.internal.zzAA(new com.aspose.words.internal.zzZOZ(zzYOA.zzYrn().zzXJ8));
        if (!com.aspose.words.internal.zzZYD.zzXk(str)) {
            str = "Unknown";
        }
        OlePackage olePackage = new OlePackage();
        olePackage.setDisplayName(com.aspose.words.internal.zzZOQ.zzVh(str));
        olePackage.setFileName(str);
        olePackage.zzXJb = str;
        if (zzzop != null) {
            olePackage.zzXJa = com.aspose.words.internal.zzZYQ.zzZX(zzzop);
        }
        com.aspose.words.internal.zzZOR zzzor = new com.aspose.words.internal.zzZOR();
        olePackage.zzZ(new com.aspose.words.internal.zzZOW(zzzor));
        zzYOI zzyoi = new zzYOI();
        zzyoi.zzXW(zzzor.zzWy());
        zzyoi.zzW(zzaa);
        return zzaa;
    }

    private static com.aspose.words.internal.zzAA zzM(com.aspose.words.internal.zzZOP zzzop, String str) throws Exception {
        com.aspose.words.internal.zzAA zzaa = new com.aspose.words.internal.zzAA(new com.aspose.words.internal.zzZOZ(str));
        new zzYO7(1).zzW(zzaa);
        zzYOI zzyoi = new zzYOI();
        int length = (int) zzzop.getLength();
        byte[] bArr = new byte[length];
        zzzop.read(bArr, 0, length);
        zzyoi.zzXW(bArr);
        zzyoi.zzW(zzaa);
        return zzaa;
    }

    public static com.aspose.words.internal.zzAA zzS(String str, byte[] bArr) throws Exception {
        return zzM(new com.aspose.words.internal.zzZOR(bArr), zzYOA.zzD7(str));
    }

    public static void zzT(com.aspose.words.internal.zzZOP zzzop, com.aspose.words.internal.zzZOP zzzop2) throws Exception {
        if (zzzop == null) {
            return;
        }
        zzzop.zzH(0L);
        com.aspose.words.internal.zz79 zz79Var = new com.aspose.words.internal.zz79(zzzop);
        com.aspose.words.internal.zz77 zz77VarZzZ = zz79Var.zzZ((com.aspose.words.internal.zz77) null, zzZWV.zz0(0, false));
        if (zz77VarZzZ == null) {
            zz77VarZzZ = zz79Var.zzZ((com.aspose.words.internal.zz77) null, zzZWV.zz0(0, true));
        }
        com.aspose.words.internal.zzZOO zzzoo = new com.aspose.words.internal.zzZOO(zz77VarZzZ.zzR1());
        String strZziv = zzzoo.zziv();
        String strReplace = strZziv.replace("visibility=\"hidden\"", "");
        if (strZziv.length() <= strReplace.length()) {
            zzzop.zzH(0L);
            com.aspose.words.internal.zzZYQ.zzX(zzzop, zzzop2);
            return;
        }
        zz77VarZzZ.zz5(new com.aspose.words.internal.zzZOR());
        com.aspose.words.internal.zzZON zzzon = new com.aspose.words.internal.zzZON(zz77VarZzZ.zzR1(), zzzoo.zziw());
        zzzon.write(strReplace);
        zzzon.flush();
        zz79Var.zzL(zzzop2);
    }

    public static com.aspose.words.internal.zzAA zzU(String str, com.aspose.words.internal.zzZOP zzzop) throws Exception {
        zzzop.zzH(0L);
        return zzZ(str, zzzop, "EmbeddedOdf", true);
    }

    public static void zzV(com.aspose.words.internal.zzZOW zzzow, String str) throws Exception {
        if (com.aspose.words.internal.zzZYD.zzXk(str)) {
            zzW(zzzow, str);
        } else {
            zzzow.zzl(0);
        }
    }

    public static void zzW(com.aspose.words.internal.zzZOW zzzow, String str) throws Exception {
        if (str == null) {
            str = "";
        }
        zzzow.zzl(str.length() + 1);
        zzzow.writeBytes(com.aspose.words.internal.zzZO0.zzQz(1251).getBytes(str));
        zzzow.writeByte((byte) 0);
    }

    private static zzYOC zzX(String str, boolean z, zzYOA zzyoa) throws Exception {
        if (zzyoa == null) {
            zzyoa = zzYOA.zzD8(com.aspose.words.internal.zzZOQ.zzVe(str));
        }
        com.aspose.words.internal.zzZOS zzzosZzv = com.aspose.words.internal.zzZOU.zzv(str, 3);
        try {
            return zzZ(zzzosZzv, zzyoa.zzXJ9, str, z);
        } finally {
            if (zzzosZzv != null) {
                zzzosZzv.close();
            }
        }
    }

    private static zzYOC zzY(String str, boolean z, zzYOA zzyoa) throws Exception {
        com.aspose.words.internal.zzAA zzaa = new com.aspose.words.internal.zzAA(zzXIR);
        zzZ(zzaa, z, true);
        new zzZ4S("", str).zzW(zzaa);
        zzYO7 zzyo7 = new zzYO7(2);
        zzyo7.setPath(str);
        zzyo7.zzK(new com.aspose.words.internal.zzZOZ(zzyoa.zzXJ8));
        if (zzLX) {
            zzyo7.zz7(zzXIQ);
            zzyo7.zz8(zzXIQ);
            zzyo7.zz6(zzXIQ);
        } else {
            zzyo7.zz7(com.aspose.words.internal.zzZQ9.zzQO());
            zzyo7.zz8(com.aspose.words.internal.zzZQ9.zzQO());
            zzyo7.zz6(com.aspose.words.internal.zzZQ9.zzQO());
        }
        zzyo7.zzW(zzaa);
        return new zzYOC(zzaa);
    }

    private static com.aspose.words.internal.zzAA zzYP(com.aspose.words.internal.zzZOP zzzop) throws Exception {
        return new com.aspose.words.internal.zzKD(zzzop).zzIf();
    }

    public static void zzYQ(com.aspose.words.internal.zzZOP zzzop) throws Exception {
        if (zzzop == null) {
            return;
        }
        zzzop.zzH(0L);
        com.aspose.words.internal.zzZOX zzzox = new com.aspose.words.internal.zzZOX(zzzop);
        while (zzzop.getPosition() < zzzop.getLength()) {
            short sZzXa = zzzox.zzXa();
            short sZzXa2 = zzzox.zzXa();
            if (sZzXa == 61) {
                zzzox.zzXa();
                zzzox.zzXa();
                zzzox.zzXa();
                zzzox.zzXa();
                int iZzZ = com.aspose.words.internal.zzXU.zzZ(zzzox.readByte() & 255, 1, false);
                zzzop.zzH(zzzop.getPosition() - 1);
                zzzop.writeByte((byte) iZzZ);
                return;
            }
            zzzop.zzH(zzzop.getPosition() + ((long) sZzXa2));
        }
    }

    private static void zzYa(String str, String str2) {
        zzXIN.zzW(str, com.aspose.words.internal.zzZYQ.zzZX(com.aspose.words.internal.zzZXR.zzW(str2, Document.class)));
    }

    private static void zzYb(String str, String str2) {
        zzXIP.zzW(str, com.aspose.words.internal.zzZYQ.zzZX(com.aspose.words.internal.zzZXR.zzW(str2, Document.class)));
    }

    private static HashMap<String, String> zzYrh() {
        HashMap<String, String> map = new HashMap<>();
        map.put("bmp", "Bitmap Image");
        map.put("doc", "MS Word 97-2003 Document");
        map.put("docm", "MS Word Macro- Enabled Document");
        map.put("docx", "Microsoft Word Document");
        map.put("dot", "MS Word 97-2003 Template");
        map.put("dotm", "MS Word Macro- Enabled Template");
        map.put("dotx", "Microsoft Word Template");
        map.put("html", "HTML Document");
        map.put("mpp", "MS Project Document");
        map.put("odp", "OpenDocument Presentation");
        map.put("ods", "OpenDocument Spreadsheet");
        map.put("odt", "OpenDocument Text");
        map.put("packager", "Packager");
        map.put("pdf", "Adobe Acrobat Document");
        map.put("pot", "MS PowerPoint 97-2003 Template");
        map.put("potm", "MS PowerPoint Mcr-Enbld Template");
        map.put("potx", "MS PowerPoint Template");
        map.put("pps", "MS PowerPoint 97-2003 Show");
        map.put("ppsm", "MS PowerPoint Mcr-Enbld Show");
        map.put("ppsx", "MS PowerPoint Show");
        map.put("ppt", "MS PowerPoint 97-2003 Presentation");
        map.put("pptm", "MS PowerPoint Mcr-Enbld Presentation");
        map.put("pptx", "MS PowerPoint Presentation");
        map.put("sldx", "Microsoft PowerPoint Slide");
        map.put("vsd", "Microsoft Visio Document");
        map.put("xls", "MS Excel 97-2003 Worksheet");
        map.put("xlsb", "MS Excel Binary Worksheet");
        map.put("xlsm", "MS Excel Macro- Enabled Worksheet");
        map.put("xlsx", "Microsoft Excel Worksheet");
        map.put("xlt", "MS Excel 97-2003 Template");
        map.put("xltm", "MS Excel Macro- Enabled Template");
        map.put("xltx", "Microsoft Excel Template");
        return map;
    }

    public static com.aspose.words.internal.zzZYG<byte[]> zzYri() {
        if (zzXIN == null) {
            synchronized (zzXIM) {
                try {
                    if (zzXIN == null) {
                        zzXIN = new com.aspose.words.internal.zzZYG<>();
                        for (String str : zzXIS.keySet()) {
                            zzYa(str, com.aspose.words.internal.zzZKN.format("Aspose.Words.Resources.OleIcons.{0}.ico", str));
                        }
                    }
                } finally {
                }
            }
        }
        return zzXIN;
    }

    public static com.aspose.words.internal.zzZYG<byte[]> zzYrj() {
        if (zzXIP == null) {
            synchronized (zzXIO) {
                try {
                    if (zzXIP == null) {
                        zzXIP = new com.aspose.words.internal.zzZYG<>();
                        zzYb("packager", "Aspose.Words.Resources.OleIcons.packager.emf");
                        zzYb("normal", "Aspose.Words.Resources.OleIcons.normal.png");
                        zzYb("RadioChecked", "Aspose.Words.Resources.OleIcons.RadioChecked.wmf");
                        zzYb("RadioUnchecked", "Aspose.Words.Resources.OleIcons.RadioUnchecked.wmf");
                    }
                } finally {
                }
            }
        }
        return zzXIP;
    }

    public static com.aspose.words.internal.zzAA zzZ(String str, zzYO2 zzyo2, boolean z) throws Exception {
        return zzZ(str, zzyo2.zzR1(), "Package", z);
    }

    public static String zze(com.aspose.words.internal.zzZOX zzzox) throws Exception {
        if (zzzox == null) {
            return "";
        }
        OlePackage olePackage = new OlePackage();
        zzzox.zzXc();
        olePackage.zzZ(zzzox);
        return olePackage.getDisplayName();
    }

    public static String zzf(com.aspose.words.internal.zzZOX zzzox) throws Exception {
        return zzJ(zzzox, zzzox.zzXc());
    }

    private static com.aspose.words.internal.zzAA zzZ(String str, com.aspose.words.internal.zzZOP zzzop, String str2, boolean z) throws Exception {
        String strZzD7 = zzYOA.zzD7(str);
        com.aspose.words.internal.zzAA zzaaZzX = zzX(zzzop, str2, strZzD7);
        zzZ(zzaaZzX, z, false);
        zzZ(zzaaZzX, strZzD7, str, "");
        return zzaaZzX;
    }

    private static com.aspose.words.internal.zzAA zzX(com.aspose.words.internal.zzZOP zzzop, String str, String str2) throws Exception {
        com.aspose.words.internal.zzAA zzaa = new com.aspose.words.internal.zzAA(new com.aspose.words.internal.zzZOZ(str2));
        new zzYO7(1).zzW(zzaa);
        com.aspose.words.internal.zzZOR zzzor = new com.aspose.words.internal.zzZOR();
        zzzop.zzH(0L);
        com.aspose.words.internal.zzZYQ.zzX(zzzop, zzzor);
        zzaa.zzZ(str, zzzor);
        return zzaa;
    }

    public static zzYOC zzZ(com.aspose.words.internal.zzZOP zzzop, String str, boolean z) throws Exception {
        return zzZ(zzzop, str, (String) null, z);
    }

    public static zzYOC zzZ(String str, boolean z, boolean z2, zzYOA zzyoa) throws Exception {
        if (z) {
            return zzZ(str, z2, zzyoa);
        }
        return zzX(str, z2, zzyoa);
    }

    private static zzYOC zzZ(String str, boolean z, zzYOA zzyoa) throws Exception {
        if (zzyoa == null) {
            zzyoa = zzYOA.zzD8(com.aspose.words.internal.zzZOQ.zzVe(str));
        }
        if (com.aspose.words.internal.zzZKN.zzX(zzyoa.zzXJ8, "0003000c-0000-0000-c000-000000000046", com.aspose.words.internal.zzZOF.ORDINAL_IGNORE_CASE$4894b8c8)) {
            com.aspose.words.internal.zzAA zzaaZzL = zzL(null, str);
            zzZ(zzaaZzL, zzyoa.zzXJ8, zzyoa.zzXJ9, zzyoa.zzXJ7, z);
            return new zzYOC(zzaaZzL);
        }
        return zzY(str, z, zzyoa);
    }

    public static String zzX(zzZBL zzzbl) {
        return com.aspose.words.internal.zzZKN.format("_{0}", Integer.valueOf(zzzbl.getId()));
    }

    private static zzYOC zzZ(com.aspose.words.internal.zzZOP zzzop, String str, String str2, boolean z) throws Exception {
        com.aspose.words.internal.zzAA zzaaZzL;
        zzYOA zzyoaZzD9 = zzYOA.zzD9(str);
        switch (zzyoaZzD9.zzXJ4) {
            case 0:
                zzaaZzL = zzL(zzzop, str2);
                break;
            case 1:
                zzaaZzL = zzM(zzzop, zzyoaZzD9.zzXJ8);
                break;
            case 2:
                zzaaZzL = zzYP(zzzop);
                break;
            case 3:
                zzaaZzL = zzX(zzzop, "CONTENTS", zzyoaZzD9.zzXJ8);
                break;
            case 4:
                zzaaZzL = zzX(zzzop, "Package", zzyoaZzD9.zzXJ8);
                break;
            case 5:
                zzaaZzL = zzX(zzzop, "EmbeddedOdf", zzyoaZzD9.zzXJ8);
                break;
            case 6:
                zzaaZzL = zzX(zzzop, "Equation Native", zzyoaZzD9.zzXJ8);
                break;
            default:
                throw new IllegalStateException("Unexpected OleEmbeddingType.");
        }
        zzZ(zzaaZzL, zzyoaZzD9.zzXJ8, str, zzyoaZzD9.zzXJ7, z);
        return new zzYOC(zzaaZzL);
    }

    private static void zzZ(com.aspose.words.internal.zzAA zzaa, String str, String str2, String str3, boolean z) throws Exception {
        if (zzaa.zzAC().equals(com.aspose.words.internal.zzZOZ.zzZXP)) {
            zzaa.zzW(new com.aspose.words.internal.zzZOZ(str));
        }
        zzZ(zzaa, z, false);
        if (zzaa.containsKey("\u0001CompObj")) {
            return;
        }
        zzZ(zzaa, str, str2, str3);
    }

    private static void zzZ(com.aspose.words.internal.zzAA zzaa, boolean z, boolean z2) throws Exception {
        zzYTR.zzE(z, z2).zzW(zzaa);
    }

    private static void zzZ(com.aspose.words.internal.zzAA zzaa, String str, String str2, String str3) throws Exception {
        zzUD zzud = new zzUD();
        zzud.setProgId(str2);
        zzud.zzW(new com.aspose.words.internal.zzZOZ(str));
        zzud.zzSW(str3);
        zzud.zzW(zzaa);
    }
}
