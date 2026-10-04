package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
final class zzZWV {
    private static String[] zzYNf;
    private static String[] zzYNg = new String[58];
    private boolean zzYNF;

    static {
        zzZkj();
        zzYNf = new String[58];
        zzZki();
    }

    public zzZWV(boolean z) {
        this.zzYNF = z;
    }

    public static String zz0(int i, boolean z) {
        return (z ? zzYNg : zzYNf)[i];
    }

    private String zzED(int i) {
        return zz0(i, this.zzYNF);
    }

    private static void zzZki() {
        String[] strArr = zzYNf;
        strArr[0] = "http://schemas.openxmlformats.org/officeDocument/2006/relationships/officeDocument";
        strArr[1] = "http://schemas.openxmlformats.org/package/2006/relationships/metadata/core-properties";
        strArr[2] = "http://schemas.openxmlformats.org/officeDocument/2006/relationships/extended-properties";
        strArr[3] = "http://schemas.openxmlformats.org/officeDocument/2006/relationships/custom-properties";
        strArr[56] = "http://schemas.microsoft.com/office/2011/relationships/webextensiontaskpanes";
        strArr[4] = "http://schemas.openxmlformats.org/package/2006/relationships/metadata/thumbnail";
        strArr[5] = "http://schemas.openxmlformats.org/officeDocument/2006/relationships/fontTable";
        strArr[6] = "http://schemas.openxmlformats.org/officeDocument/2006/relationships/styles";
        strArr[7] = "http://schemas.openxmlformats.org/officeDocument/2006/relationships/numbering";
        strArr[8] = "http://schemas.openxmlformats.org/officeDocument/2006/relationships/settings";
        strArr[9] = "http://schemas.openxmlformats.org/officeDocument/2006/relationships/webSettings";
        strArr[10] = "http://schemas.openxmlformats.org/officeDocument/2006/relationships/theme";
        strArr[11] = "http://schemas.openxmlformats.org/officeDocument/2006/relationships/themeOverride";
        strArr[12] = "http://schemas.openxmlformats.org/officeDocument/2006/relationships/header";
        strArr[13] = "http://schemas.openxmlformats.org/officeDocument/2006/relationships/footer";
        strArr[14] = "http://schemas.openxmlformats.org/officeDocument/2006/relationships/comments";
        strArr[15] = "http://schemas.microsoft.com/office/2011/relationships/commentsExtended";
        strArr[16] = "http://schemas.microsoft.com/office/2016/09/relationships/commentsIds";
        strArr[17] = "http://schemas.microsoft.com/office/2018/08/relationships/commentsExtensible";
        strArr[18] = "http://schemas.openxmlformats.org/officeDocument/2006/relationships/footnotes";
        strArr[19] = "http://schemas.openxmlformats.org/officeDocument/2006/relationships/endnotes";
        strArr[20] = "http://schemas.openxmlformats.org/officeDocument/2006/relationships/glossaryDocument";
        strArr[21] = "http://schemas.openxmlformats.org/officeDocument/2006/relationships/customXml";
        strArr[22] = "http://schemas.openxmlformats.org/officeDocument/2006/relationships/aFChunk";
        strArr[23] = "http://schemas.openxmlformats.org/officeDocument/2006/relationships/chart";
        strArr[24] = "http://schemas.openxmlformats.org/officeDocument/2006/relationships/diagramColors";
        strArr[25] = "http://schemas.openxmlformats.org/officeDocument/2006/relationships/diagramData";
        strArr[26] = "http://schemas.openxmlformats.org/officeDocument/2006/relationships/diagramLayout";
        strArr[27] = "http://schemas.openxmlformats.org/officeDocument/2006/relationships/diagramQuickStyle";
        strArr[28] = "http://schemas.openxmlformats.org/officeDocument/2006/relationships/printerSettings";
        strArr[29] = "http://schemas.openxmlformats.org/officeDocument/2006/relationships/subDocument";
        strArr[30] = "http://schemas.openxmlformats.org/officeDocument/2006/relationships/image";
        strArr[31] = "http://schemas.openxmlformats.org/officeDocument/2006/relationships/video";
        strArr[32] = "http://schemas.openxmlformats.org/officeDocument/2006/relationships/oleObject";
        strArr[33] = "http://schemas.openxmlformats.org/officeDocument/2006/relationships/control";
        strArr[34] = "http://schemas.openxmlformats.org/officeDocument/2006/relationships/package";
        strArr[35] = "http://schemas.openxmlformats.org/officeDocument/2006/relationships/hyperlink";
        strArr[36] = "http://schemas.openxmlformats.org/officeDocument/2006/relationships/attachedTemplate";
        strArr[55] = "http://schemas.microsoft.com/office/2014/relationships/chartEx";
        strArr[37] = "http://schemas.microsoft.com/office/2006/relationships/vbaProject";
        strArr[38] = "http://schemas.microsoft.com/office/2006/relationships/keyMapCustomizations";
        strArr[54] = "http://schemas.microsoft.com/office/2011/relationships/people";
        strArr[39] = "http://schemas.openxmlformats.org/officeDocument/2006/relationships/chartUserShapes";
        strArr[52] = "http://schemas.microsoft.com/office/2011/relationships/chartStyle";
        strArr[53] = "http://schemas.microsoft.com/office/2011/relationships/chartColorStyle";
        strArr[40] = "http://schemas.microsoft.com/office/2007/relationships/diagramDrawing";
        strArr[41] = "http://schemas.openxmlformats.org/officeDocument/2006/relationships/customXmlProps";
        strArr[42] = "http://schemas.microsoft.com/office/2006/relationships/wordVbaData";
        strArr[43] = "http://schemas.microsoft.com/office/2006/relationships/vbaProjectSignature";
        strArr[44] = "http://schemas.microsoft.com/office/2006/relationships/attachedToolbars";
        strArr[45] = "http://schemas.openxmlformats.org/officeDocument/2006/relationships/mailMergeSource";
        strArr[46] = "http://schemas.openxmlformats.org/officeDocument/2006/relationships/mailMergeHeaderSource";
        strArr[47] = "http://schemas.openxmlformats.org/officeDocument/2006/relationships/recipientData";
        strArr[48] = "http://schemas.openxmlformats.org/officeDocument/2006/relationships/font";
        strArr[49] = "http://schemas.openxmlformats.org/officeDocument/2006/relationships/frame";
        strArr[50] = "http://schemas.microsoft.com/office/2006/relationships/activeXControlBinary";
        strArr[51] = "http://schemas.openxmlformats.org/officeDocument/2006/relationships/transform";
        strArr[57] = "http://schemas.microsoft.com/office/2011/relationships/webextension";
    }

    private static void zzZkj() {
        String[] strArr = zzYNg;
        strArr[0] = "http://purl.oclc.org/ooxml/officeDocument/relationships/officeDocument";
        strArr[1] = "http://schemas.openxmlformats.org/package/2006/relationships/metadata/core-properties";
        strArr[2] = "http://purl.oclc.org/ooxml/officeDocument/relationships/extendedProperties";
        strArr[3] = "http://purl.oclc.org/ooxml/officeDocument/relationships/customProperties";
        strArr[56] = "http://schemas.microsoft.com/office/2011/relationships/webextensiontaskpanes";
        strArr[4] = "http://schemas.openxmlformats.org/package/2006/relationships/metadata/thumbnail";
        strArr[5] = "http://purl.oclc.org/ooxml/officeDocument/relationships/fontTable";
        strArr[6] = "http://purl.oclc.org/ooxml/officeDocument/relationships/styles";
        strArr[7] = "http://purl.oclc.org/ooxml/officeDocument/relationships/numbering";
        strArr[8] = "http://purl.oclc.org/ooxml/officeDocument/relationships/settings";
        strArr[9] = "http://purl.oclc.org/ooxml/officeDocument/relationships/webSettings";
        strArr[10] = "http://purl.oclc.org/ooxml/officeDocument/relationships/theme";
        strArr[11] = "http://purl.oclc.org/ooxml/officeDocument/relationships/themeOverride";
        strArr[12] = "http://purl.oclc.org/ooxml/officeDocument/relationships/header";
        strArr[13] = "http://purl.oclc.org/ooxml/officeDocument/relationships/footer";
        strArr[14] = "http://purl.oclc.org/ooxml/officeDocument/relationships/comments";
        strArr[15] = "http://schemas.microsoft.com/office/2011/relationships/commentsExtended";
        strArr[16] = "http://schemas.microsoft.com/office/2016/09/relationships/commentsIds";
        strArr[17] = "http://schemas.microsoft.com/office/2018/08/relationships/commentsExtensible";
        strArr[18] = "http://purl.oclc.org/ooxml/officeDocument/relationships/footnotes";
        strArr[19] = "http://purl.oclc.org/ooxml/officeDocument/relationships/endnotes";
        strArr[20] = "http://purl.oclc.org/ooxml/officeDocument/relationships/glossaryDocument";
        strArr[21] = "http://purl.oclc.org/ooxml/officeDocument/relationships/customXml";
        strArr[22] = "http://purl.oclc.org/ooxml/officeDocument/relationships/aFChunk";
        strArr[23] = "http://purl.oclc.org/ooxml/officeDocument/relationships/chart";
        strArr[24] = "http://purl.oclc.org/ooxml/officeDocument/relationships/diagramColors";
        strArr[25] = "http://purl.oclc.org/ooxml/officeDocument/relationships/diagramData";
        strArr[26] = "http://purl.oclc.org/ooxml/officeDocument/relationships/diagramLayout";
        strArr[27] = "http://purl.oclc.org/ooxml/officeDocument/relationships/diagramQuickStyle";
        strArr[28] = "http://purl.oclc.org/ooxml/officeDocument/relationships/printerSettings";
        strArr[29] = "http://purl.oclc.org/ooxml/officeDocument/relationships/subDocument";
        strArr[30] = "http://purl.oclc.org/ooxml/officeDocument/relationships/image";
        strArr[31] = "http://purl.oclc.org/ooxml/officeDocument/relationships/video";
        strArr[32] = "http://purl.oclc.org/ooxml/officeDocument/relationships/oleObject";
        strArr[33] = "http://purl.oclc.org/ooxml/officeDocument/relationships/control";
        strArr[34] = "http://purl.oclc.org/ooxml/officeDocument/relationships/package";
        strArr[35] = "http://purl.oclc.org/ooxml/officeDocument/relationships/hyperlink";
        strArr[36] = "http://purl.oclc.org/ooxml/officeDocument/relationships/attachedTemplate";
        strArr[55] = "http://schemas.microsoft.com/office/2014/relationships/chartEx";
        strArr[37] = "http://schemas.microsoft.com/office/2006/relationships/vbaProject";
        strArr[38] = "http://schemas.microsoft.com/office/2006/relationships/keyMapCustomizations";
        strArr[54] = "http://schemas.microsoft.com/office/2011/relationships/people";
        strArr[39] = "http://purl.oclc.org/ooxml/officeDocument/relationships/chartUserShapes";
        strArr[52] = "http://schemas.microsoft.com/office/2011/relationships/chartStyle";
        strArr[53] = "http://schemas.microsoft.com/office/2011/relationships/chartColorStyle";
        strArr[40] = "http://schemas.microsoft.com/office/2007/relationships/diagramDrawing";
        strArr[41] = "http://purl.oclc.org/ooxml/officeDocument/relationships/customXmlProps";
        strArr[42] = "http://schemas.microsoft.com/office/2006/relationships/wordVbaData";
        strArr[43] = "http://schemas.microsoft.com/office/2006/relationships/vbaProjectSignature";
        strArr[44] = "http://schemas.microsoft.com/office/2006/relationships/attachedToolbars";
        strArr[45] = "http://purl.oclc.org/ooxml/officeDocument/relationships/mailMergeSource";
        strArr[46] = "http://purl.oclc.org/ooxml/officeDocument/relationships/mailMergeHeaderSource";
        strArr[47] = "http://purl.oclc.org/ooxml/officeDocument/relationships/mailMergeRecipientData";
        strArr[48] = "http://purl.oclc.org/ooxml/officeDocument/relationships/font";
        strArr[49] = "http://purl.oclc.org/ooxml/officeDocument/relationships/frame";
        strArr[50] = "http://schemas.microsoft.com/office/2006/relationships/activeXControlBinary";
        strArr[51] = "http://purl.oclc.org/ooxml/officeDocument/relationships/transform";
        strArr[57] = "http://schemas.microsoft.com/office/2011/relationships/webextension";
    }

    public final String getAttachedTemplate() {
        return zzED(36);
    }

    public final String getComments() {
        return zzED(14);
    }

    public final String getPackage() {
        return zzED(34);
    }

    public final String zzSh() {
        return zzED(12);
    }

    public final String zzZkA() {
        return zzED(35);
    }

    public final String zzZkB() {
        return zzED(33);
    }

    public final String zzZkC() {
        return zzED(32);
    }

    public final String zzZkD() {
        return zzED(30);
    }

    public final String zzZkE() {
        return zzED(29);
    }

    public final String zzZkF() {
        return zzED(21);
    }

    public final String zzZkG() {
        return zzED(20);
    }

    public final String zzZkH() {
        return zzED(19);
    }

    public final String zzZkI() {
        return zzED(18);
    }

    public final String zzZkJ() {
        return zzED(17);
    }

    public final String zzZkK() {
        return zzED(16);
    }

    public final String zzZkL() {
        return zzED(15);
    }

    public final String zzZkM() {
        return zzED(13);
    }

    public final String zzZkN() {
        return zzED(11);
    }

    public final String zzZkO() {
        return zzED(10);
    }

    public final String zzZkP() {
        return zzED(9);
    }

    public final String zzZkQ() {
        return zzED(8);
    }

    public final String zzZkR() {
        return zzED(7);
    }

    public final String zzZkS() {
        return zzED(6);
    }

    public final String zzZkT() {
        return zzED(5);
    }

    public final String zzZkU() {
        return zzED(4);
    }

    public final String zzZkV() {
        return zzED(3);
    }

    public final String zzZkW() {
        return zzED(2);
    }

    public final String zzZkX() {
        return zzED(0);
    }

    public final String zzZkk() {
        return zzED(57);
    }

    public final String zzZkl() {
        return zzED(56);
    }

    public final String zzZkm() {
        return zzED(51);
    }

    public final String zzZkn() {
        return zzED(50);
    }

    public final String zzZko() {
        return zzED(49);
    }

    public final String zzZkp() {
        return zzED(48);
    }

    public final String zzZkq() {
        return zzED(47);
    }

    public final String zzZkr() {
        return zzED(46);
    }

    public final String zzZks() {
        return zzED(45);
    }

    public final String zzZkt() {
        return zzED(44);
    }

    public final String zzZku() {
        return zzED(43);
    }

    public final String zzZkv() {
        return zzED(42);
    }

    public final String zzZkw() {
        return zzED(41);
    }

    public final String zzZkx() {
        return zzED(54);
    }

    public final String zzZky() {
        return zzED(38);
    }

    public final String zzZkz() {
        return zzED(37);
    }

    public final String zzme() {
        return zzED(1);
    }
}
