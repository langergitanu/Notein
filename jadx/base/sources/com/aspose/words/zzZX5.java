package com.aspose.words;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes6.dex */
final class zzZX5 {
    private static String[] zzYNA;
    private boolean zzYNF;
    private static ArrayList<String> zzYNE = new ArrayList<>();
    private static ArrayList<String> zzYND = new ArrayList<>();
    private static ArrayList<String> zzYNC = new ArrayList<>();
    private static String[] zzYNB = new String[40];

    static {
        zzZlc();
        zzYNA = new String[40];
        zzZld();
        com.aspose.words.internal.zzZQG.zzZ(zzYNE, zz9(15, false));
        com.aspose.words.internal.zzZQG.zzZ(zzYNE, zz9(16, false));
        com.aspose.words.internal.zzZQG.zzZ(zzYNE, zz9(20, false));
        com.aspose.words.internal.zzZQG.zzZ(zzYNE, zz9(17, false));
        com.aspose.words.internal.zzZQG.zzZ(zzYNE, zz9(18, false));
        com.aspose.words.internal.zzZQG.zzZ(zzYNE, zz9(19, false));
        com.aspose.words.internal.zzZQG.zzZ(zzYNE, zz9(14, false));
        com.aspose.words.internal.zzZQG.zzZ(zzYND, zz9(28, false));
        com.aspose.words.internal.zzZQG.zzZ(zzYND, zz9(29, false));
        com.aspose.words.internal.zzZQG.zzZ(zzYND, zz9(30, false));
        com.aspose.words.internal.zzZQG.zzZ(zzYND, zz9(31, false));
        com.aspose.words.internal.zzZQG.zzZ(zzYND, zz9(32, false));
        com.aspose.words.internal.zzZQG.zzZ(zzYND, zz9(33, false));
        com.aspose.words.internal.zzZQG.zzZ(zzYNC, "urn:schemas-microsoft-com:vml");
        com.aspose.words.internal.zzZQG.zzZ(zzYNC, "urn:schemas-microsoft-com:office:office");
        com.aspose.words.internal.zzZQG.zzZ(zzYNC, "urn:schemas-microsoft-com:office:word");
        com.aspose.words.internal.zzZQG.zzZ(zzYNC, "http://schemas.openxmlformats.org/officeDocument/2006/math");
    }

    public zzZX5(boolean z) {
        this.zzYNF = z;
    }

    public static String zz9(int i, boolean z) {
        return (z ? zzYNB : zzYNA)[i];
    }

    private String zzEG(int i) {
        return zz9(i, this.zzYNF);
    }

    public static String zzMP(String str) {
        int i = 0;
        while (true) {
            String[] strArr = zzYNA;
            if (i >= strArr.length) {
                return str;
            }
            if (com.aspose.words.internal.zzZKN.equals(strArr[i], str)) {
                return zzYNB[i];
            }
            i++;
        }
    }

    public static String zzMQ(String str) {
        int i = 0;
        while (true) {
            String[] strArr = zzYNB;
            if (i >= strArr.length) {
                return str;
            }
            if (com.aspose.words.internal.zzZKN.equals(strArr[i], str)) {
                return zzYNA[i];
            }
            i++;
        }
    }

    public static boolean zzMR(String str) {
        return zzYNC.contains(str);
    }

    public static boolean zzMS(String str) {
        return zzYND.contains(str);
    }

    public static boolean zzMT(String str) {
        return zzYNE.contains(str);
    }

    private static void zzZlc() {
        String[] strArr = zzYNB;
        strArr[0] = "http://purl.oclc.org/ooxml/officeDocument/relationships";
        strArr[1] = "http://purl.oclc.org/ooxml/wordprocessingml/main";
        strArr[2] = "http://schemas.microsoft.com/office/word/2006/wordml";
        strArr[3] = "http://schemas.openxmlformats.org/schemaLibrary/2006/main";
        strArr[4] = "http://purl.oclc.org/ooxml/officeDocument/customXml";
        strArr[5] = "http://purl.oclc.org/ooxml/drawingml/wordprocessingDrawing";
        strArr[6] = "http://purl.oclc.org/ooxml/drawingml/main";
        strArr[7] = "http://purl.oclc.org/ooxml/drawingml/picture";
        strArr[8] = "http://purl.oclc.org/ooxml/drawingml/diagram";
        strArr[9] = "http://purl.oclc.org/ooxml/drawingml/chart";
        strArr[10] = "http://purl.oclc.org/ooxml/drawingml/lockedCanvas";
        strArr[11] = "http://schemas.microsoft.com/office/2006/activeX";
        strArr[12] = "http://schemas.openxmlformats.org/package/2006/digital-signature";
        strArr[13] = "http://schemas.microsoft.com/office/2006/digsig";
        strArr[26] = "http://purl.oclc.org/ooxml/drawingml/chartDrawing";
        strArr[27] = "http://purl.oclc.org/ooxml/officeDocument/math";
        strArr[14] = "http://schemas.openxmlformats.org/markup-compatibility/2006";
        strArr[15] = "http://schemas.microsoft.com/office/word/2010/wordprocessingCanvas";
        strArr[16] = "http://schemas.microsoft.com/office/word/2010/wordprocessingDrawing";
        strArr[17] = "http://schemas.microsoft.com/office/word/2010/wordprocessingGroup";
        strArr[18] = "http://schemas.microsoft.com/office/word/2010/wordprocessingInk";
        strArr[19] = "http://schemas.microsoft.com/office/word/2010/wordprocessingShape";
        strArr[20] = "http://schemas.microsoft.com/office/word/2010/wordml";
        strArr[24] = "http://schemas.microsoft.com/office/drawing/2008/diagram";
        strArr[21] = "http://schemas.microsoft.com/office/word/2012/wordml";
        strArr[25] = "http://schemas.microsoft.com/office/drawing/2007/8/2/chart";
        strArr[22] = "http://schemas.microsoft.com/office/2011/relationships/chartColorStyle";
        strArr[23] = "http://schemas.microsoft.com/office/2011/relationships/chartStyle";
        strArr[28] = "http://schemas.microsoft.com/office/drawing/2014/chartex";
        strArr[29] = "http://schemas.microsoft.com/office/drawing/2015/9/8/chartex";
        strArr[30] = "http://schemas.microsoft.com/office/drawing/2015/10/21/chartex";
        strArr[31] = "http://schemas.microsoft.com/office/drawing/2016/5/9/chartex";
        strArr[32] = "http://schemas.microsoft.com/office/drawing/2016/5/10/chartex";
        strArr[33] = "http://schemas.microsoft.com/office/drawing/2016/5/11/chartex";
        strArr[34] = "http://schemas.microsoft.com/office/word/2015/wordml/symex";
        strArr[35] = "http://schemas.microsoft.com/office/word/2016/wordml/cid";
        strArr[36] = "http://schemas.microsoft.com/office/word/2018/wordml";
        strArr[37] = "http://schemas.microsoft.com/office/word/2018/wordml/cex";
        strArr[38] = "http://schemas.microsoft.com/office/word/2020/wordml/sdtdatahash";
        strArr[39] = "http://schemas.microsoft.com/office/drawing/2014/chart/ac";
    }

    private static void zzZld() {
        String[] strArr = zzYNA;
        strArr[0] = "http://schemas.openxmlformats.org/officeDocument/2006/relationships";
        strArr[1] = "http://schemas.openxmlformats.org/wordprocessingml/2006/main";
        strArr[2] = "http://schemas.microsoft.com/office/word/2006/wordml";
        strArr[3] = "http://schemas.openxmlformats.org/schemaLibrary/2006/main";
        strArr[4] = "http://schemas.openxmlformats.org/officeDocument/2006/customXml";
        strArr[5] = "http://schemas.openxmlformats.org/drawingml/2006/wordprocessingDrawing";
        strArr[6] = "http://schemas.openxmlformats.org/drawingml/2006/main";
        strArr[7] = "http://schemas.openxmlformats.org/drawingml/2006/picture";
        strArr[8] = "http://schemas.openxmlformats.org/drawingml/2006/diagram";
        strArr[9] = "http://schemas.openxmlformats.org/drawingml/2006/chart";
        strArr[10] = "http://schemas.openxmlformats.org/drawingml/2006/lockedCanvas";
        strArr[11] = "http://schemas.microsoft.com/office/2006/activeX";
        strArr[12] = "http://schemas.openxmlformats.org/package/2006/digital-signature";
        strArr[13] = "http://schemas.microsoft.com/office/2006/digsig";
        strArr[26] = "http://schemas.openxmlformats.org/drawingml/2006/chartDrawing";
        strArr[27] = "http://schemas.openxmlformats.org/officeDocument/2006/math";
        strArr[14] = "http://schemas.openxmlformats.org/markup-compatibility/2006";
        strArr[15] = "http://schemas.microsoft.com/office/word/2010/wordprocessingCanvas";
        strArr[16] = "http://schemas.microsoft.com/office/word/2010/wordprocessingDrawing";
        strArr[17] = "http://schemas.microsoft.com/office/word/2010/wordprocessingGroup";
        strArr[18] = "http://schemas.microsoft.com/office/word/2010/wordprocessingInk";
        strArr[19] = "http://schemas.microsoft.com/office/word/2010/wordprocessingShape";
        strArr[20] = "http://schemas.microsoft.com/office/word/2010/wordml";
        strArr[24] = "http://schemas.microsoft.com/office/drawing/2008/diagram";
        strArr[21] = "http://schemas.microsoft.com/office/word/2012/wordml";
        strArr[25] = "http://schemas.microsoft.com/office/drawing/2007/8/2/chart";
        strArr[22] = "http://schemas.microsoft.com/office/2011/relationships/chartColorStyle";
        strArr[23] = "http://schemas.microsoft.com/office/2011/relationships/chartStyle";
        strArr[28] = "http://schemas.microsoft.com/office/drawing/2014/chartex";
        strArr[29] = "http://schemas.microsoft.com/office/drawing/2015/9/8/chartex";
        strArr[30] = "http://schemas.microsoft.com/office/drawing/2015/10/21/chartex";
        strArr[31] = "http://schemas.microsoft.com/office/drawing/2016/5/9/chartex";
        strArr[32] = "http://schemas.microsoft.com/office/drawing/2016/5/10/chartex";
        strArr[33] = "http://schemas.microsoft.com/office/drawing/2016/5/11/chartex";
        strArr[34] = "http://schemas.microsoft.com/office/word/2015/wordml/symex";
        strArr[35] = "http://schemas.microsoft.com/office/word/2016/wordml/cid";
        strArr[36] = "http://schemas.microsoft.com/office/word/2018/wordml";
        strArr[37] = "http://schemas.microsoft.com/office/word/2018/wordml/cex";
        strArr[38] = "http://schemas.microsoft.com/office/word/2020/wordml/sdtdatahash";
        strArr[39] = "http://schemas.microsoft.com/office/drawing/2014/chart/ac";
    }

    public final String zzZlA() {
        return zzEG(5);
    }

    public final String zzZlB() {
        return zzEG(3);
    }

    public final String zzZlC() {
        return zzEG(2);
    }

    public final String zzZlD() {
        return zzEG(1);
    }

    public final String zzZlE() {
        return zzEG(0);
    }

    public final String zzZle() {
        return zzEG(38);
    }

    public final String zzZlf() {
        return zzEG(37);
    }

    public final String zzZlg() {
        return zzEG(36);
    }

    public final String zzZlh() {
        return zzEG(35);
    }

    public final String zzZli() {
        return zzEG(34);
    }

    public final String zzZlj() {
        return zzEG(33);
    }

    public final String zzZlk() {
        return zzEG(32);
    }

    public final String zzZll() {
        return zzEG(31);
    }

    public final String zzZlm() {
        return zzEG(30);
    }

    public final String zzZln() {
        return zzEG(29);
    }

    public final String zzZlo() {
        return zzEG(28);
    }

    public final String zzZlp() {
        return zzEG(21);
    }

    public final String zzZlq() {
        return zzEG(20);
    }

    public final String zzZlr() {
        return zzEG(27);
    }

    public final String zzZls() {
        return zzEG(19);
    }

    public final String zzZlt() {
        return zzEG(18);
    }

    public final String zzZlu() {
        return zzEG(17);
    }

    public final String zzZlv() {
        return zzEG(16);
    }

    public final String zzZlw() {
        return zzEG(15);
    }

    public final String zzZlx() {
        return zzEG(14);
    }

    public final String zzZly() {
        return zzEG(11);
    }

    public final String zzZlz() {
        return zzEG(6);
    }
}
