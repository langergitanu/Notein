package com.aspose.words;

import OooOoo.C20593OooO0Oo;
import androidx.core.view.ViewCompat;
import com.alibaba.sdk.android.oss.common.RequestParameters;
import com.aspose.words.internal.C22246OooO0oo;
import com.aspose.words.ref.RefInt;
import com.facebook.common.callercontext.ContextChain;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.google.firebase.messaging.Constants;
import com.google.mlkit.p567nl.translate.TranslateLanguage;
import com.huawei.hms.network.embedded.C18437z2;
import com.microsoft.identity.common.java.telemetry.TelemetryEventStrings;
import com.orion.notein.domain.models.note.NoteMeta;
import com.orion.notein.richeditor.utils.p606io.FilenameUtils;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: loaded from: classes6.dex */
final class zzZFI implements zzZAQ {
    private zzZHY zzYmM;
    private zzZH6 zzYmN;
    private zzZFS zzYmO;
    private zzZJ3 zzYmQ;
    private zzZFH zzYmR;
    private zzZHS zzYmS;
    private zzZFB zzYmT;
    private zzZDV zzYmU;
    private boolean zzYmV;
    private boolean zzYmW;
    private zzYEF zzYmY;
    private double zzYmZ;
    private boolean zzYn0;
    private boolean zzYn1;
    private Footnote zzYn7;
    private boolean zzYn8;
    private boolean zzYn9;
    private ArrayList<zzLT> zzYna;
    private zzZYY zzYnb;
    private boolean zzYnc;
    private zzZHX zzYnd;
    private Node zzYnf;
    private zzZJY zzYnt;
    private zzYMX zzYnx;
    private zzZJB zzYny;
    private zzZGJ zzYnz;
    private zzZFF zzYpP;
    private zzZK3 zzYqv;
    private int zzYzH;
    private zzZIJ zzZoo;
    private zzMJ zzZop;
    private String zzZp0;
    private DocumentBuilder zzZwh;
    private static String[] zzYmX = {"br", "input", "img", "svg", "math", "object", "embed", "iframe", "select", "option", "textarea", "a", "ruby", "table", "caption", TranslateLanguage.THAI, "td"};
    private static final com.aspose.words.internal.zzZHW zzUR = new com.aspose.words.internal.zzZHW("html", "head", NoteMeta.PROPERTY_TITLE, "meta", "base", "script", "noscript", "style", "link", "body", "input", "select", "option", "a", "br", "img", "svg", "math", "embed", "object", "iframe", "plaintext", "textarea", "frameset", "table", "thead", "tbody", "tfoot", "colgroup", "col", TranslateLanguage.THAI, "td", "caption", "ul", "ol", "ruby", "rp", "rt", "dl", "dt", "dd", "ins", "del", "mbp:pagebreak", "div", TranslateLanguage.CROATIAN, "always", "left", "right", "header-primary", "header-first", "footer-primary", "footer-first");
    private zzZRE zzYnh = new zzZRE();
    private ArrayList<zzZFW> zzYmP = new ArrayList<>();
    private int zzYne = 0;
    private com.aspose.words.internal.zzD3<Comment> zzYn6 = new com.aspose.words.internal.zzD3<>();
    private com.aspose.words.internal.zzD3<CommentRangeEnd> zzYn5 = new com.aspose.words.internal.zzD3<>();
    private ArrayList<Integer> zzYn4 = new ArrayList<>();
    private com.aspose.words.internal.zzD3<Footnote> zzYn3 = new com.aspose.words.internal.zzD3<>();
    private com.aspose.words.internal.zzD3<Footnote> zzYn2 = new com.aspose.words.internal.zzD3<>();
    private Map<String, zzY7X> zzYng = new HashMap();
    private com.aspose.words.internal.zzZQC<Node> zzYR5 = new com.aspose.words.internal.zzZQC<>();

    public zzZFI(zzZFH zzzfh, int i, zzZFF zzzff) {
        this.zzYzH = i;
        this.zzYpP = zzzff;
        this.zzYny = new zzZJB(zzzfh.zzYmD);
        this.zzYnt = new zzZJY(!zzzfh.zzYmD, zzzfh.zzYmK);
        if (zzzfh.zzYmL) {
            this.zzYnh.zzZ(new zzZRF("vml"));
            this.zzYnh.zzZ(new zzZRF("mso"));
        }
        this.zzYmR = zzzfh;
        this.zzYnz = new zzZGJ();
        this.zzYmN = new zzZH6();
        this.zzYmM = new zzZHY();
    }

    private boolean zzA(zzZIG zzzig) {
        Iterator<zzZG4> it = zzzig.zzZ2C().iterator();
        while (it.hasNext()) {
            zzZIG zzzig2 = (zzZIG) com.aspose.words.internal.zzZKW.zzZ(it.next(), zzZIG.class);
            if (zzzig2 != null && (!zzB(zzzig2) || !zzA(zzzig2))) {
                return false;
            }
        }
        return true;
    }

    private boolean zzB(zzZIG zzzig) {
        return !this.zzZoo.zzZ(zzzig, this.zzYna);
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x003e, code lost:
    
        r6 = r6.zzZ0e();
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0042, code lost:
    
        if (r6 == null) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0048, code lost:
    
        if (zzB(r6) == false) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0053, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:?, code lost:
    
        return false;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private boolean zzC(zzZIG zzzig) {
        do {
            zzZG4 zzzg4ZzZ0d = zzzig;
            while (true) {
                zzzg4ZzZ0d = zzzg4ZzZ0d.zzZ0d();
                if (zzzg4ZzZ0d == null) {
                    break;
                }
                if (zzzg4ZzZ0d instanceof zzZIG) {
                    zzZIG zzzig2 = (zzZIG) zzzg4ZzZ0d;
                    String name = zzzig2.getName();
                    if (!"style".equals(name) && !NoteMeta.PROPERTY_TITLE.equals(name)) {
                        if (zzB(zzzig2) && zzA(zzzig2)) {
                            return true;
                        }
                    }
                } else if ((zzzg4ZzZ0d instanceof zzZEC) && zzZ((zzZEC) zzzg4ZzZ0d)) {
                    return true;
                }
            }
        } while (this.zzYnb.zzZUJ() != 2);
        return false;
    }

    private void zzD(zzZIG zzzig) throws Exception {
        int i;
        this.zzYqv.isEmpty();
        if (this.zzYmR.zzYmK && zzz(zzzig)) {
            return;
        }
        String strZzU2 = com.aspose.words.internal.zzZKN.zzU2(this.zzYnb.zzZUC().zzSF("page-break-before"));
        String strZzU22 = com.aspose.words.internal.zzZKN.zzU2(this.zzYnb.zzZUC().zzSF("mso-break-type"));
        String strZzU23 = com.aspose.words.internal.zzZKN.zzU2(this.zzYnb.zzZUC().zzSF("mso-column-break-before"));
        if ("section-break".equals(strZzU22)) {
            switch (zzUR.zzTP(strZzU2)) {
                case 46:
                    i = 5;
                    break;
                case 47:
                    i = 6;
                    break;
                case 48:
                    i = 7;
                    break;
                default:
                    i = !"always".equals(strZzU23) ? 3 : 4;
                    break;
            }
        } else {
            i = zzUR.zzTP(strZzU2) != 46 ? "always".equals(strZzU23) ? 2 : 8 : 1;
        }
        if (i == 1 || i == 2) {
            this.zzYmO.zzZ02();
            zzVm(true);
            this.zzZwh.zz7(i, false);
        } else if (i == 5) {
            zzYMX zzymxZzZpF = this.zzZwh.zzZpF();
            Paragraph currentParagraph = this.zzZwh.getCurrentParagraph();
            this.zzYmO.zzZ02();
            this.zzZwh.zz7(i, false);
            currentParagraph.zzZ(zzymxZzZpF);
        } else if (i != 8) {
            this.zzYmO.zzVq(false);
            this.zzZwh.zz7(i, false);
        } else if (zzC(zzzig)) {
            this.zzYmO.zzZ02();
            if (this.zzYn1 && this.zzZwh.getParagraphFormat().getAlignment() == 3) {
                this.zzZwh.getDocument().getCompatibilityOptions().setDoNotExpandShiftReturn(true);
            }
            zzVm(true);
            Run run = new Run(this.zzZwh.getDocument(), ControlChar.LINE_BREAK, this.zzZwh.zzZpG());
            zzR(run);
            this.zzZwh.insertNode(run);
        } else if (zzU(zzzig)) {
            this.zzYmO.zzZ02();
            this.zzYnt.zzg(this.zzZwh.getCurrentParagraph());
            if (this.zzYnb.zzZUF() != 0) {
                zzVm(true);
                Run run2 = new Run(this.zzZwh.getDocument(), ControlChar.LINE_BREAK, this.zzZwh.zzZpG());
                zzR(run2);
                int iZzt = com.aspose.words.internal.zzSA.zzt(0.5d);
                run2.zzZYh().setSize(iZzt);
                run2.zzZYh().zzvA(iZzt);
                this.zzZwh.insertNode(run2);
            } else {
                this.zzYmO.zzYZV();
            }
        } else if (zzS(zzzig.zzZ0d()) && zzS(zzzig.zzZ0c())) {
            this.zzYmO.zzYZZ();
            this.zzYnt.zzg(this.zzZwh.getCurrentParagraph());
        }
        this.zzYnt.zzVv(false);
    }

    private void zzE(zzZIG zzzig) {
        String attributeValue = zzzig.zzZ2B().getAttributeValue("name", "");
        String attributeValue2 = zzzig.zzZ2B().getAttributeValue(FirebaseAnalytics.Param.CONTENT, "");
        if (com.aspose.words.internal.zzZYD.zzi(attributeValue, "description")) {
            this.zzZwh.getDocument().getBuiltInDocumentProperties().get("Subject").zzO1(attributeValue2);
        } else if (com.aspose.words.internal.zzZYD.zzi(attributeValue, "keywords")) {
            this.zzZwh.getDocument().getBuiltInDocumentProperties().get("Keywords").zzO1(attributeValue2);
        }
    }

    private boolean zzF(zzZIG zzzig) {
        if (zzzig.zzZ2C().getCount() == 0) {
            return true;
        }
        if (zzzig.zzZ2C().getCount() == 1 && (zzzig.zzZ2C().zzzd(0) instanceof zzZEC)) {
            return com.aspose.words.internal.zzZKN.zzU3(zzZDY.zzo(((zzZEC) zzzig.zzZ2C().zzzd(0)).getText(), zzYZE()));
        }
        return false;
    }

    private void zzG(zzZIG zzzig) throws Exception {
        this.zzYqv.isEmpty();
        this.zzYmO.zzZ02();
        String strZzU2 = com.aspose.words.internal.zzZKN.zzU2(zzzig.zzZ2B().getAttributeValue(C18437z2.f56754h, "text"));
        if ("image".equals(strZzU2)) {
            zzv(zzzig);
        } else {
            this.zzYmQ.zzZ(zzzig, strZzU2);
        }
    }

    private boolean zzH(zzZIG zzzig) throws Exception {
        this.zzYqv.isEmpty();
        this.zzYmO.zzYZY();
        this.zzYmO.zzYZW();
        this.zzYne++;
        zzZEL zzzelZzZ = zzZEL.zzZ(zzzig, this.zzYnb, this.zzYmR.zzYmE);
        if (zzzelZzZ.getRowCount() != 0 && zzzelZzZ.getColumnCount() != 0) {
            this.zzYnz.zzZ0V();
            Table tableZzZ = new zzZEH(this.zzZwh, this.zzYnb, this.zzYny, this, this.zzYmR.zzYmK, this.zzYnt, this.zzYmN).zzZ(zzzelZzZ, this.zzYne == 1, zzzig);
            this.zzYnz.zzZ0U();
            this.zzYnt.zzB(tableZzZ);
            this.zzYne--;
            return true;
        }
        this.zzYmN.zzQ(zzzig);
        for (int i = 0; i < zzzelZzZ.getRowCount(); i++) {
            this.zzYmN.zzQ(zzzelZzZ.zzyW(i).zzZ3Y());
        }
        for (int i2 = 0; i2 < zzzelZzZ.zzYYE(); i2++) {
            this.zzYmN.zzQ(zzzelZzZ.zzyY(i2).zzZ3Y());
        }
        return false;
    }

    private void zzJ(zzZIG zzzig, boolean z) throws Exception {
        this.zzYqv.isEmpty();
        zzZFF zzzff = new zzZFF(this.zzZwh.getDocument().getResourceLoadingCallback(), this.zzZwh.getDocument().getWarningCallback());
        zzzff.setWebRequestTimeout(this.zzYpP.getWebRequestTimeout());
        zzYB5 zzyb5ZzZUG = this.zzYnb.zzZUG();
        if (zzyb5ZzZUG == null) {
            zzyb5ZzZUG = new zzYB5(this.zzZwh.getPageSetup().getPageWidth(), this.zzZwh.getPageSetup().getPageHeight());
        }
        zzY7K zzy7k = new zzY7K(zzzig.zzZ0g(), new zzY7J(this.zzZp0, zzzff, this.zzYng, this.zzYna, this.zzZop, this.zzZwh.getDocument().zzZqx(), this.zzZwh.getDocument().getLayoutOptions().getTextShaperFactory(), true, true), zzzig.zzZ0e());
        zzY7R zzy7rZzZ = zzy7k.zzZ(zzyb5ZzZUG, (zzYB5) null);
        if (z && zzy7rZzZ.isVisible()) {
            double dZzSH = this.zzYnb.zzZUC().zzSH("width");
            double dZzSH2 = this.zzYnb.zzZUC().zzSH("height");
            if (com.aspose.words.internal.zzAN.zzZD(dZzSH) || com.aspose.words.internal.zzAN.zzZD(dZzSH2)) {
                return;
            }
            if (this.zzYnb.zzZpf() || this.zzYnb.zzZUt() == 4) {
                this.zzYmO.zzVq(true);
            }
            this.zzYmO.zzZ02();
            if (!this.zzYmR.zzYmG) {
                zzVm(this.zzYn0);
                zzy7k.zzd(Float.intBitsToFloat((int) zzy7rZzZ.getSize()), com.aspose.words.internal.zzZPW.zzYz(zzy7rZzZ.getSize()));
                this.zzZwh.insertImage(zzy7k.zzPN(false));
                return;
            }
            com.aspose.words.internal.zzZOR zzzor = new com.aspose.words.internal.zzZOR();
            try {
                zzy7rZzZ.zzZ(zzzor, 2);
                this.zzZwh.zzZt(zzzor);
            } finally {
                zzzor.close();
            }
        }
    }

    private boolean zzK(zzZIG zzzig, boolean z) throws Exception {
        if (this.zzYnb.zzZUC().zzSx("-aw-sdt-tag") == null) {
            return false;
        }
        this.zzYqv.zzZ4o();
        if (z) {
            StructuredDocumentTag structuredDocumentTag = "span".equals(zzzig.getName()) ? new StructuredDocumentTag(this.zzZwh.getDocument(), 12, 1) : new StructuredDocumentTag(this.zzZwh.getDocument(), 11, 2);
            structuredDocumentTag.setTag(this.zzYnb.zzZUC().getString("-aw-sdt-tag"));
            structuredDocumentTag.setTitle(this.zzYnb.zzZUC().getString("-aw-sdt-title"));
            structuredDocumentTag.isShowingPlaceholderText("placeholder".equals(this.zzYnb.zzZUC().zzSF("-aw-sdt-content")));
            structuredDocumentTag.getChildNodes(0, false).clear();
            if (this.zzZwh.getCurrentParagraph().hasChildNodes()) {
                Iterator<T> it = this.zzZwh.getCurrentParagraph().getChildNodes(0, false).iterator();
                while (true) {
                    if (it.hasNext()) {
                        Node node = (Node) it.next();
                        if (node.getNodeType() != 9 && node.getNodeType() != 10) {
                            break;
                        }
                    } else {
                        while (this.zzZwh.getCurrentParagraph().hasChildNodes()) {
                            Node firstChild = this.zzZwh.getCurrentParagraph().getFirstChild();
                            firstChild.remove();
                            this.zzZwh.getCurrentParagraph().zzYC(firstChild);
                        }
                    }
                }
            }
            if (structuredDocumentTag.getLevel() == 1) {
                Node nodeAppendChild = structuredDocumentTag.appendChild(new Run(this.zzZwh.getDocument()));
                this.zzZwh.insertNode(structuredDocumentTag);
                this.zzYmO.zzZ5(nodeAppendChild);
            } else {
                this.zzYmO.zzZ02();
                structuredDocumentTag.appendChild(new Paragraph(this.zzZwh.getDocument()));
                if (!this.zzZwh.isAtStartOfParagraph()) {
                    this.zzYqv.isEmpty();
                    this.zzYmO.zzYZV();
                }
                this.zzZwh.getCurrentParagraph().zzYC(structuredDocumentTag);
                this.zzYmO.zzZ5(structuredDocumentTag);
            }
        } else {
            StructuredDocumentTag structuredDocumentTag2 = (StructuredDocumentTag) com.aspose.words.internal.zzZKW.zzZ(this.zzZwh.getCurrentParagraph().getFirstChild(), StructuredDocumentTag.class);
            if (structuredDocumentTag2 != null) {
                while (structuredDocumentTag2.hasChildNodes()) {
                    Node firstChild2 = structuredDocumentTag2.getFirstChild();
                    if (firstChild2.getNodeType() != 9 && firstChild2.getNodeType() != 10) {
                        break;
                    }
                    firstChild2.remove();
                    this.zzZwh.getCurrentParagraph().zzYC(firstChild2);
                }
            }
            StructuredDocumentTag structuredDocumentTag3 = (StructuredDocumentTag) com.aspose.words.internal.zzZKW.zzZ(this.zzZwh.getCurrentParagraph().getParentNode(), StructuredDocumentTag.class);
            if (structuredDocumentTag3 != null && structuredDocumentTag3.getFirstChild() != null && structuredDocumentTag3.getFirstChild().getNodeType() == 8) {
                Paragraph paragraph = (Paragraph) structuredDocumentTag3.getFirstChild();
                while (paragraph.hasChildNodes()) {
                    Node firstChild3 = paragraph.getFirstChild();
                    if (firstChild3.getNodeType() != 9 && firstChild3.getNodeType() != 10) {
                        break;
                    }
                    firstChild3.remove();
                    structuredDocumentTag3.zzYC(firstChild3);
                }
            }
            zzYZq();
            this.zzYmO.zzYZX();
        }
        return true;
    }

    private boolean zzKi(String str) throws Exception {
        if (this.zzYzH != 53) {
            return true;
        }
        String originalFileName = this.zzZwh.getDocument().getOriginalFileName();
        String str2 = this.zzYmR.zzYmF;
        if (str2 != null) {
            originalFileName = str2;
        }
        if (zzZDZ.zzYR(str, originalFileName)) {
            return true;
        }
        if ("#".equals(str)) {
            return false;
        }
        int i = com.aspose.words.internal.zzZOF.ORDINAL_IGNORE_CASE$4894b8c8;
        return (com.aspose.words.internal.zzZKN.zzS(str, "mk:@msitstore:", i) || com.aspose.words.internal.zzZKN.zzS(str, "ms-help:", i) || com.aspose.words.internal.zzZKN.zzS(str, "ms-its:", i) || com.aspose.words.internal.zzZKN.zzS(str, "ms-xhelp:", i) || com.aspose.words.internal.zzZKN.zzS(str, "its:", i)) ? false : true;
    }

    private boolean zzKj(String str) {
        int iZzZT = com.aspose.words.internal.zzKE.zzZT(com.aspose.words.internal.zzZVR.zz8(this.zzZp0, str));
        if (iZzZT == 0) {
            return false;
        }
        return com.aspose.words.internal.zzZKN.zzS(com.aspose.words.internal.zzKE.zzWY(iZzZT), "image/", com.aspose.words.internal.zzZOF.ORDINAL$4894b8c8);
    }

    private boolean zzKk(String str) {
        zzPT zzptZzSx = this.zzYnb.zzZUC().zzSx(str);
        if (zzptZzSx != null) {
            return zzptZzSx.zzZWj().zzP(zzL4.zzZno) || zzptZzSx.zzZWj().zzP(zzL4.zzZly);
        }
        return false;
    }

    private static int zzKl(String str) {
        int iZzZo;
        if (!com.aspose.words.internal.zzZYD.zzXk(str) || str.length() <= 5 || (iZzZo = com.aspose.words.internal.zzJB.zzZo(str.substring(5))) <= 0) {
            return Integer.MIN_VALUE;
        }
        return iZzZo;
    }

    private static boolean zzKm(String str) {
        if (str.length() == 1 && com.aspose.words.internal.zzZKN.equals(str, ControlChar.NON_BREAKING_SPACE)) {
            return true;
        }
        if (androidx.core.content.OooO0O0.OooO00o(1, str) != ' ') {
            return false;
        }
        for (int i = 0; i < str.length() - 1; i++) {
            if (str.charAt(i) != 160) {
                return false;
            }
        }
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x00c8  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private void zzKn(String str) throws Exception {
        boolean z;
        zzYEF zzyef;
        Bookmark bookmark;
        com.aspose.words.internal.zzZYD.zzXk(str);
        zzPT zzptZzSx = this.zzYnb.zzZUC().zzSx("-aw-import");
        if (zzptZzSx != null && zzptZzSx.zzZWj().zzP(zzL4.zzZkL) && zzKm(str)) {
            str = com.aspose.words.internal.zzZKN.zzS(ControlChar.SPACE_CHAR, str.length());
            z = true;
        } else {
            z = false;
        }
        zzYEF zzyefZzZpG = this.zzZwh.zzZpG();
        for (zzZHU zzzhu : this.zzYmS.zzX(com.aspose.words.internal.zzZKN.zzZ(com.aspose.words.internal.zzZKN.zzZ(str, (char) 8209, ControlChar.NON_BREAKING_HYPHEN_CHAR), (char) 173, ControlChar.OPTIONAL_HYPHEN_CHAR), this.zzZwh.getFont())) {
            if (zzzhu.zzZ26()) {
                zzYEF zzyef2 = (zzYEF) zzyefZzZpG.zzbn();
                Font.zzZ(zzyef2, this.zzZwh.getDocument()).setName(zzzhu.getFallbackFontName());
                zzyef = zzyef2;
            } else {
                zzyef = zzyefZzZpG;
            }
            zzZFB zzzfb = this.zzYmT;
            if (zzzfb != null) {
                zzzfb.zzZ(zzzhu.getText(), zzyef, this.zzYnb.zzZUP(), z);
            } else if (this.zzYnb.zzZUt() != 0 || "a".equals(this.zzYnb.zzZUw().zzZTQ())) {
                bookmark = null;
                this.zzYqv.zzZ(zzzhu.getText(), zzyef, this.zzYnb.zzZUP(), z, bookmark);
            } else {
                BookmarkStart bookmarkStartZzO = this.zzYmN.zzO(this.zzYnb.zzZUw());
                BookmarkEnd bookmarkEndZzN = this.zzYmN.zzN(this.zzYnb.zzZUw());
                if (bookmarkStartZzO != null && bookmarkEndZzN != null) {
                    bookmark = new Bookmark(bookmarkStartZzO, bookmarkEndZzN);
                }
                this.zzYqv.zzZ(zzzhu.getText(), zzyef, this.zzYnb.zzZUP(), z, bookmark);
            }
        }
    }

    private void zzKo(String str) throws Exception {
        this.zzYnb.zzZ(this.zzZwh.getFont(), this.zzZwh.getCurrentParagraph().zzqy(0));
        this.zzYn7.zzL(this.zzZwh.zzZpG());
        this.zzYn7.getFont().setUnderline(0);
        this.zzYn7.getFont().setColor(ViewCompat.MEASURED_STATE_MASK);
        if (this.zzYn7.isAuto()) {
            SpecialChar specialChar = new SpecialChar(this.zzZwh.getDocument(), (char) 2, (zzYEF) this.zzYn7.zzZYh().zzbn());
            specialChar.getFont().setStyleIdentifier(zzZMP.zzB0(this.zzYn7.getFootnoteType()));
            this.zzYn7.getFirstParagraph().prependChild(specialChar);
        } else {
            String strZzp = zzZDY.zzp(str, zzYZE());
            this.zzYn7.setReferenceMark(strZzp.substring(1, strZzp.length() - 1));
            Run run = new Run(this.zzZwh.getDocument(), this.zzYn7.getReferenceMark(), (zzYEF) this.zzYn7.zzZYh().zzbn());
            run.getFont().setStyleIdentifier(zzZMP.zzB0(this.zzYn7.getFootnoteType()));
            this.zzYn7.getFirstParagraph().prependChild(run);
        }
    }

    private int zzL(zzZIG zzzig, boolean z) throws Exception {
        zzPT zzptZzSx = this.zzYnb.zzZUC().zzSx("-aw-import");
        if (zzptZzSx != null && zzptZzSx.zzZWj().zzP(zzL4.zzZkM)) {
            if (com.aspose.words.internal.zzZKN.equals(zzzig.zzZ2F(), ControlChar.NON_BREAKING_SPACE)) {
                this.zzYmO.zzYZZ();
                if (this.zzYnb.zzZUC().getCount() > 1) {
                    this.zzYnb.zzZph();
                    this.zzYnb.zzZ(this.zzZwh.getFont(), this.zzZwh.getCurrentParagraph().zzqy(0));
                    this.zzYnb.zzZpg();
                }
            }
            return 2;
        }
        if (zzK(zzzig, z)) {
            return 1;
        }
        if (z) {
            if (this.zzYnt.zzZ(this.zzYnb.zzZUw().zzZTQ(), this.zzYnb.zzZUC(), this.zzYnb.zzZUt()) && this.zzZwh.getCurrentParagraph().getCount() == 0) {
                this.zzYnt.zzVv(true);
            }
            if (!zzzig.zzZ2D()) {
                this.zzYmN.zzO((zzZAS) zzzig);
                this.zzYmN.zzN(zzzig);
            }
            if (zzx(zzzig) || zzYZw() || zzw(zzzig) || zzYZt()) {
                return 2;
            }
            this.zzYnb.zzZph();
            this.zzYnd.zzS(zzzig);
        } else {
            zzVm(true);
            String strZzZ = this.zzYnd.zzZ(zzzig, this.zzZwh.getFont());
            if (com.aspose.words.internal.zzZYD.zzXk(strZzZ)) {
                zzKn(strZzZ);
                this.zzYnd.zzZ(strZzZ, this.zzZwh.getFont());
            }
            zzy(zzzig);
            this.zzYnb.zzZpg();
            this.zzYnt.zzZ(this.zzYnb.zzZUw().zzZTQ(), this.zzYnb.zzZUC(), this.zzYqv);
        }
        return 1;
    }

    private void zzLa(String str) throws Exception {
        if (this.zzYn9) {
            return;
        }
        if (this.zzYn8) {
            zzKo(str);
            return;
        }
        zzYZA();
        if (!this.zzYnb.zzZUO() && !this.zzYnb.zzZUN() && !this.zzYnb.zzZUM()) {
            String strZzo = zzZDY.zzo(str, zzYZE());
            if (com.aspose.words.internal.zzZYD.zzXk(strZzo)) {
                this.zzYmO.zzZ02();
                zzVm(true);
                zzKn(strZzo);
                this.zzYnd.zzZ(strZzo, this.zzZwh.getFont());
                return;
            }
            return;
        }
        this.zzYmO.zzZ02();
        zzVm(true);
        String[] strArrZzR = com.aspose.words.internal.zzZKN.zzR(str, '\n');
        for (int i = 0; i < strArrZzR.length; i++) {
            if (i > 0) {
                this.zzYqv.zzZ4o();
                this.zzYmO.zzYZV();
                this.zzZwh.getParagraphFormat().clearFormatting();
                zzYZz();
                this.zzYnt.zzVv(true);
                this.zzYny.zzZ(this.zzZwh.getCurrentParagraph(), this.zzYnb.zzZUC());
            }
            if (i != 0) {
                this.zzZwh.getParagraphFormat().setSpaceBefore(0.0d);
            }
            if (i != strArrZzR.length - 1) {
                this.zzZwh.getParagraphFormat().setSpaceAfter(0.0d);
            }
            String str2 = strArrZzR[i];
            String strZzo2 = this.zzYnb.zzZUN() ? zzZDY.zzo(str2, zzYZE()) : zzZDY.zzJU(str2);
            if (com.aspose.words.internal.zzZYD.zzXk(strZzo2)) {
                zzKn(strZzo2);
            }
        }
    }

    private static boolean zzM(zzZBM zzzbm) {
        return zzzbm != null && "body".equals(zzzbm.zzZTQ());
    }

    private void zzN(zzZIG zzzig, boolean z) throws Exception {
        this.zzYqv.isEmpty();
        String strZzJT = zzZDY.zzJT(zzzig.zzZ2B().getAttributeValue("href", ""));
        if (z) {
            this.zzYmN.zzKF(strZzJT);
        }
        if (!com.aspose.words.internal.zzZKN.equals(strZzJT, "") && !com.aspose.words.internal.zzZVR.zzWw(strZzJT)) {
            strZzJT = com.aspose.words.internal.zzZVR.zz7(this.zzZp0, strZzJT);
        }
        String str = strZzJT;
        String attributeValue = zzzig.zzZ2B().getAttributeValue("name", "");
        if (!com.aspose.words.internal.zzZYD.zzXk(attributeValue)) {
            attributeValue = zzzig.zzZ2B().getAttributeValue("id", "");
        }
        String str2 = attributeValue;
        if (zzN(str2, str, z) || zzZ(0, this.zzYn3, "_ftnref", "#_ftn", "#_ftnref", str2, str, z) || zzZ(1, this.zzYn2, "_ednref", "#_edn", "#_ednref", str2, str, z) || zzYZy()) {
            return;
        }
        boolean zEquals = ContextChain.TAG_PRODUCT.equals(zzzig.zzZ0e().getName());
        if (!z) {
            if (this.zzYnb.zzZUL()) {
                this.zzYmO.zzZ00();
            }
            if (com.aspose.words.internal.zzZYD.zzXk(str) && zzKi(str)) {
                this.zzZwh.zzZpH();
            }
            this.zzYmN.zzR(str2, zEquals, false);
            return;
        }
        if (this.zzYnb.zzZUL()) {
            this.zzYmO.zzZ01();
            zzYZz();
            this.zzYnt.zzVv(false);
        }
        if (com.aspose.words.internal.zzZYD.zzXk(str)) {
            if (zzKi(str)) {
                if (this.zzYzH == 53) {
                    String strZzJY = zzZDZ.zzJY(str);
                    if (com.aspose.words.internal.zzZYD.zzXk(strZzJY)) {
                        str = strZzJY;
                    }
                }
                String attributeValue2 = zzzig.zzZ2B().getAttributeValue("target", "");
                String attributeValue3 = zzzig.zzZ2B().getAttributeValue(NoteMeta.PROPERTY_TITLE, "");
                if (attributeValue3.length() > 2048) {
                    attributeValue3 = C22246OooO0oo.OooO00o(new StringBuilder(), attributeValue3, "…", 0, 2047);
                }
                this.zzZwh.zzL(str, attributeValue2, attributeValue3);
            } else {
                zzT(1, C20593OooO0Oo.OooO0O0("The hyperlink '", str, "' is not supported and it has been ignored."));
            }
        }
        this.zzYmN.zzS(str2, zEquals, false);
    }

    private boolean zzO(zzZIG zzzig, boolean z) {
        String strZzo = zzo(zzzig);
        RefInt refInt = new RefInt(0);
        boolean zZzY = zzY(strZzo, refInt);
        int i = refInt.get();
        if (!zZzY) {
            return false;
        }
        if (z) {
            HeaderFooter headerFooter = new HeaderFooter(this.zzZwh.getDocument(), i);
            headerFooter.appendChild(new Paragraph(this.zzZwh.getDocument()));
            this.zzZwh.getCurrentSection().getHeadersFooters().add(headerFooter);
            if (TelemetryEventStrings.Value.TRUE.equals(this.zzYnb.zzZUC().zzSF("-aw-different-first-page")) || i == 4 || i == 5) {
                this.zzZwh.getCurrentSection().zzYvR().setDifferentFirstPageHeaderFooter(true);
            }
            this.zzYmO.zzZ5(headerFooter.getFirstParagraph());
        } else {
            this.zzYmO.zzYZX();
        }
        return true;
    }

    private boolean zzP(zzZIG zzzig, boolean z) {
        Section parentSection;
        if (!z) {
            return false;
        }
        String strZzo = zzo(zzzig);
        if ("linked".equals(strZzo)) {
            return true;
        }
        RefInt refInt = new RefInt(0);
        boolean zZzY = zzY(strZzo, refInt);
        int i = refInt.get();
        if (!zZzY) {
            return false;
        }
        Body body = (Body) com.aspose.words.internal.zzZKW.zzZ(this.zzZwh.getCurrentStory(), Body.class);
        if (body == null || (parentSection = body.getParentSection()) == null) {
            return true;
        }
        boolean z2 = parentSection.getHeadersFooters().getByHeaderFooterType(i) != null;
        if (z2) {
            zzT(1, com.aspose.words.internal.zzZKN.format("A duplicate header/footer of type '{0}' has been ignored.", strZzo));
        }
        return z2;
    }

    private boolean zzQ(zzZIG zzzig, boolean z) {
        Comment comment;
        String attributeValue = zzzig.zzZ2B().getAttributeValue("id", "");
        if (!com.aspose.words.internal.zzZKN.zzS(attributeValue, "_cmnt", com.aspose.words.internal.zzZOF.ORDINAL$4894b8c8)) {
            return false;
        }
        int iZzKl = zzKl(attributeValue);
        if (iZzKl <= 0) {
            if (z) {
                zzT(256, com.aspose.words.internal.zzZKN.format("Can't parse comment id from '{0}'. Positive integer is expected after prefix '{1}'. Comment's content has been treated as regular document's subtree.", attributeValue, "_cmnt"));
            }
            return true;
        }
        if (this.zzYn6.get(iZzKl) == null) {
            if (z) {
                zzT(256, com.aspose.words.internal.zzZKN.format("There is no comment with comment id '{0}'. Comment's content has been treated as regular document's subtree.", Integer.valueOf(iZzKl)));
            }
            return true;
        }
        if (z) {
            Comment comment2 = this.zzYn6.get(iZzKl);
            String string = this.zzYnb.zzZUC().getString("-aw-comment-author");
            String string2 = this.zzYnb.zzZUC().getString("-aw-comment-initial");
            String string3 = this.zzYnb.zzZUC().getString("-aw-comment-datetime");
            if (com.aspose.words.internal.zzZKN.equals(string, "") && com.aspose.words.internal.zzZKN.equals(string2, "") && com.aspose.words.internal.zzZKN.equals(string3, "")) {
                string = zzzig.zzZ2B().getAttributeValue("data-comment-author", "");
                string2 = zzzig.zzZ2B().getAttributeValue("data-comment-initial", "");
                string3 = zzzig.zzZ2B().getAttributeValue("data-comment-datetime", "");
            }
            comment2.setAuthor(string);
            comment2.setInitial(string2);
            com.aspose.words.internal.zzZQ9 zzzq9ZzZy = com.aspose.words.internal.zzJB.zzZy(string3);
            if (!com.aspose.words.internal.zzZQ9.zzZ(zzzq9ZzZy, com.aspose.words.internal.zzZQ9.zz35)) {
                comment2.zzv(zzzq9ZzZy);
            }
            int iZzKl2 = zzKl(this.zzYnb.zzZUC().zzSF("-aw-comment-parent-id"));
            if (iZzKl2 > 0 && (comment = this.zzYn6.get(iZzKl2)) != null && comment.getId() != comment2.getId()) {
                comment2.setParentId(comment.getId());
            }
            comment2.setDone("yes".equals(this.zzYnb.zzZUC().zzSF("-aw-comment-done")));
            this.zzYmO.zzZ5(comment2.getFirstParagraph());
        } else {
            this.zzYmO.zzYZX();
        }
        return true;
    }

    private void zzR(zzZIG zzzig, boolean z) throws Exception {
        if (zzYZy() || zzQ(zzzig, z) || zzZ(this.zzYn3, "_ftn", zzzig, z) || zzZ(this.zzYn2, "_edn", zzzig, z) || zzO(zzzig, z) || zzK(zzzig, z)) {
            return;
        }
        if (!z) {
            this.zzYny.zzLg();
            if (zzF(zzzig)) {
                double dMax = Math.max(this.zzYnb.zzZUC().zzSH("height"), this.zzYnb.zzZUC().zzSH("min-height"));
                if (dMax > 0.0d) {
                    this.zzZwh.getFont().setSize(dMax);
                    this.zzYmO.zzYZV();
                }
            }
            this.zzYmO.zzZ00();
            zzYZB();
            this.zzYnt.zzZ(this.zzYnb.zzZUw().zzZTQ(), this.zzYnb.zzZUC(), this.zzYqv);
            return;
        }
        Body body = (Body) com.aspose.words.internal.zzZKW.zzZ(this.zzZwh.getCurrentStory(), Body.class);
        if (body != null && body.getParentSection() != null) {
            this.zzYnb.zzX(body.getParentSection());
        }
        this.zzYny.zzJ(this.zzYnb.zzZUC());
        this.zzYmO.zzZ01();
        this.zzYnt.zzZ(this.zzYnb.zzZUw().zzZTQ(), this.zzYnb.zzZUC(), this.zzYnb.zzZUt());
        zzYZz();
        this.zzYnt.zzVv(true);
        this.zzYny.zzc(this.zzZwh.getCurrentParagraph());
        zzYZC();
    }

    private static boolean zzS(DocumentBuilder documentBuilder) {
        Node currentNode = documentBuilder.getCurrentNode();
        while ((currentNode instanceof Run) && !com.aspose.words.internal.zzZYD.zzXk(((Run) currentNode).getText())) {
            currentNode = currentNode.getNextSibling();
        }
        return currentNode == null;
    }

    private void zzT(zzZIG zzzig, boolean z) throws Exception {
        this.zzYqv.isEmpty();
        if (z) {
            this.zzYmO.zzZ02();
            this.zzYmP.size();
        } else {
            this.zzYmQ.zzZ(zzzig, this.zzYmP);
            this.zzYmP.clear();
        }
    }

    private int zzU(zzZIG zzzig, boolean z) throws Exception {
        if (zzYZK()) {
            return zzL(zzzig, z);
        }
        return 0;
    }

    private int zzV(zzZIG zzzig, boolean z) throws Exception {
        if (!zzYZL() || zzYZN()) {
            return 0;
        }
        int iZzTP = zzUR.zzTP(zzzig.getName());
        if (iZzTP == 44) {
            if (zzP(zzzig, z)) {
                return 2;
            }
            zzR(zzzig, z);
            if (z) {
                this.zzYmN.zzP(zzzig);
            } else {
                this.zzYmN.zzO(zzzig);
            }
            return 1;
        }
        if (iZzTP != 45) {
            zzVn(z);
            if (z) {
                this.zzYmN.zzP(zzzig);
            } else {
                this.zzYmN.zzO(zzzig);
            }
            return 1;
        }
        if (z && this.zzYnb.zzZUy() == 0) {
            zzq(zzzig);
            this.zzYmN.zzP(zzzig);
            this.zzYmN.zzO(zzzig);
        }
        return 1;
    }

    private void zzVj(boolean z) throws Exception {
        this.zzYqv.isEmpty();
        this.zzYmO.zzZ02();
        if (!z) {
            this.zzYmO.zzYZX();
            return;
        }
        Shape shape = new Shape(this.zzZwh.getDocument(), 202);
        shape.setWrapType(0);
        double dZzSH = this.zzYnb.zzZUC().zzSH("padding-top");
        TextBox textBox = shape.getTextBox();
        if (com.aspose.words.internal.zzAN.zzZC(dZzSH)) {
            dZzSH = 2.0d;
        }
        textBox.setInternalMarginTop(dZzSH);
        double dZzSH2 = this.zzYnb.zzZUC().zzSH("padding-right");
        TextBox textBox2 = shape.getTextBox();
        if (com.aspose.words.internal.zzAN.zzZC(dZzSH2)) {
            dZzSH2 = 2.0d;
        }
        textBox2.setInternalMarginRight(dZzSH2);
        double dZzSH3 = this.zzYnb.zzZUC().zzSH("padding-bottom");
        TextBox textBox3 = shape.getTextBox();
        if (com.aspose.words.internal.zzAN.zzZC(dZzSH3)) {
            dZzSH3 = 2.0d;
        }
        textBox3.setInternalMarginBottom(dZzSH3);
        double dZzSH4 = this.zzYnb.zzZUC().zzSH("padding-left");
        shape.getTextBox().setInternalMarginLeft(com.aspose.words.internal.zzAN.zzZC(dZzSH4) ? 2.0d : dZzSH4);
        double dZzSH5 = this.zzYnb.zzZUC().zzSH("width");
        if (com.aspose.words.internal.zzAN.zzL(dZzSH5, -1.7976931348623157E308d)) {
            dZzSH5 = 144.0d;
        }
        shape.setWidth(dZzSH5);
        double dZzSH6 = this.zzYnb.zzZUC().zzSH("height");
        if (com.aspose.words.internal.zzAN.zzL(dZzSH6, -1.7976931348623157E308d)) {
            dZzSH6 = 28.0d;
        }
        shape.setHeight(dZzSH6);
        if (zzKk("border-top-style") && zzKk("border-right-style") && zzKk("border-bottom-style") && zzKk("border-left-style")) {
            shape.setStroked(false);
        }
        Paragraph paragraph = new Paragraph(this.zzZwh.getDocument());
        shape.appendChild(paragraph);
        this.zzZwh.insertNode(shape);
        this.zzYmO.zzZ5(paragraph);
    }

    private void zzVk(boolean z) {
        if (!z) {
            this.zzYnz.zzZ0T();
            this.zzYnz.zzZ0T().zzZ16();
            return;
        }
        zzYZx();
        this.zzYnz.zzZ0T().zzKy(this.zzYnb.zzZUw().zzZTQ());
        if (zzz7(this.zzYnb.zzZUt())) {
            return;
        }
        this.zzYmO.zzZ00();
    }

    private void zzVl(boolean z) throws Exception {
        this.zzYqv.isEmpty();
        if (this.zzYne == 0) {
            return;
        }
        if (!z) {
            this.zzYmO.zzZ00();
        } else {
            this.zzYmO.zzZ01();
            zzYZz();
        }
    }

    private void zzVn(boolean z) throws Exception {
        if (!z) {
            this.zzYmO.zzZ00();
            this.zzYnt.zzZ(this.zzYnb.zzZUw().zzZTQ(), this.zzYnb.zzZUC(), this.zzYqv);
            return;
        }
        this.zzYmO.zzZ01();
        boolean zZzZ = this.zzYnt.zzZ(this.zzYnb.zzZUw().zzZTQ(), this.zzYnb.zzZUC(), this.zzYnb.zzZUt());
        zzYZz();
        this.zzYny.zzZ(this.zzZwh.getCurrentParagraph(), this.zzYnb.zzZUC());
        this.zzYnt.zzVv(zZzZ);
    }

    private void zzVo(boolean z) throws Exception {
        if (!z) {
            this.zzYny.zzLg();
            this.zzYmO.zzZ00();
        } else {
            this.zzYny.zzJ(this.zzYnb.zzZUC());
            this.zzYmO.zzZ01();
            zzYZz();
            this.zzYny.zzc(this.zzZwh.getCurrentParagraph());
        }
    }

    private void zzVp(boolean z) throws Exception {
        if (!z) {
            this.zzYnt.zzZ(this.zzYnb.zzZUw().zzZTQ(), this.zzYnb.zzZUC(), this.zzYqv);
            return;
        }
        boolean zZzZ = this.zzYnt.zzZ(this.zzYnb.zzZUw().zzZTQ(), this.zzYnb.zzZUC(), this.zzYnb.zzZUt());
        if (this.zzYn1) {
            this.zzYnb.zzZ(this.zzZwh.getDocument(), zzYZG());
            zzYZz();
        }
        this.zzYnt.zzVv(zZzZ);
    }

    private int zzW(zzZIG zzzig, boolean z) throws Exception {
        if (!zzYZM()) {
            return 0;
        }
        if (this.zzYnb.zzZUy() != 0 || zzH(zzzig)) {
            return 2;
        }
        if (this.zzYnb.zzZUt() == 5) {
            zzVn(z);
            return 1;
        }
        if (this.zzYnb.zzZUt() != 6) {
            return 1;
        }
        zzL(zzzig, z);
        return 1;
    }

    private zzZIR zzX(com.aspose.words.internal.zzZOP zzzop, com.aspose.words.internal.zzZO0 zzzo0) throws Exception {
        zzZIR zzzirZzZ6;
        if (this.zzYmR.zzYmE) {
            try {
                zzzirZzZ6 = zzZIR.zzZ6(zzzop);
            } catch (IllegalStateException unused) {
                this.zzYmR.zzYmE = false;
                zzzop.zzH(0L);
                zzzirZzZ6 = null;
            }
        } else {
            zzzirZzZ6 = null;
        }
        if (zzzirZzZ6 != null) {
            return zzzirZzZ6;
        }
        zzZRE zzzre = this.zzYnh;
        zzZFH zzzfh = this.zzYmR;
        return zzZIR.zzZ(zzzop, zzzo0, zzzre, zzzfh.zzYmH, zzzfh.zzYmC);
    }

    private int zzY(zzZIG zzzig, boolean z) throws Exception {
        if (this.zzZwh.getDocument().getWarningCallback() != null) {
            this.zzYmM.zzX(zzzig.getName(), zzzig.getNamespace(), this.zzYnb.zzZUC());
        }
        if (this.zzYmT != null && this.zzYnb.zzZUL()) {
            this.zzYmT.flush();
            this.zzYmT = null;
        }
        if (this.zzYnb.zzZUL() || zzn(zzzig)) {
            this.zzYqv.zzZ4o();
        }
        if (z) {
            zzYZA();
        }
        if ("urn:schemas-microsoft-com:vml".equals(zzzig.getNamespace()) && this.zzYnb.zzZUy() == 0) {
            if (com.aspose.words.internal.zzZKN.zzW(zzzig.getName(), "textbox", com.aspose.words.internal.zzZOF.ORDINAL$4894b8c8)) {
                return ("body".equals(zzzig.zzZ0e().getName()) && zzzig.zzZ0e().zzZ2C().getCount() == 1) ? 1 : 2;
            }
            this.zzYmN.zzO((zzZAS) zzzig);
            this.zzYmU.zz8(zzzig);
            this.zzYmN.zzN(zzzig);
            return 2;
        }
        int iZzZ = zzZ(zzzig, z, this.zzYnb.zzZUt());
        if (iZzZ != 0) {
            return iZzZ;
        }
        int iZzX = zzX(zzzig, z);
        if (iZzX != 0) {
            return iZzX;
        }
        int iZzW = zzW(zzzig, z);
        if (iZzW != 0) {
            return iZzW;
        }
        int iZzV = zzV(zzzig, z);
        if (iZzV != 0) {
            return iZzV;
        }
        int iZzU = zzU(zzzig, z);
        return iZzU != 0 ? iZzU : zzYZI() ? 2 : 1;
    }

    private void zzYZA() {
        if (this.zzYmV) {
            this.zzZwh.zz7(5, false);
            this.zzYmV = false;
        }
    }

    private void zzYZB() {
        zzPT zzptZzSx = this.zzYnb.zzZUC().zzSx("page-break-after");
        if (zzptZzSx == null) {
            return;
        }
        if (zzptZzSx.zzZWj().zzP(zzL4.zzZng)) {
            this.zzZwh.zz7(3, false);
        }
        if (zzptZzSx.zzZWj().zzP(zzL4.zzZmZ)) {
            this.zzYmV = true;
        } else if (zzptZzSx.zzZWj().zzP(zzL4.zzZmH)) {
            this.zzZwh.zz7(6, false);
        } else if (zzptZzSx.zzZWj().zzP(zzL4.zzZmG)) {
            this.zzZwh.zz7(7, false);
        }
    }

    private void zzYZC() {
        zzPT zzptZzSx = this.zzYnb.zzZUC().zzSx("page-break-before");
        if (zzptZzSx == null) {
            return;
        }
        if (zzptZzSx.zzZWj().zzP(zzL4.zzZng)) {
            this.zzZwh.zz7(3, false);
            return;
        }
        if (zzptZzSx.zzZWj().zzP(zzL4.zzZmH)) {
            this.zzZwh.zz7(6, false);
            return;
        }
        if (zzptZzSx.zzZWj().zzP(zzL4.zzZmG)) {
            this.zzZwh.zz7(7, false);
        } else if (zzptZzSx.zzZWj().zzP(zzL4.zzZnf)) {
            Node nodeZzYB9 = this.zzZwh.getCurrentParagraph().zzYB9();
            if (nodeZzYB9 instanceof Paragraph) {
                ((Paragraph) nodeZzYB9).getParagraphFormat().setKeepWithNext(true);
            }
        }
    }

    private boolean zzYZD() {
        Node currentNode = this.zzZwh.getCurrentNode();
        Paragraph currentParagraph = this.zzZwh.getCurrentParagraph();
        Node node = this.zzYnf;
        Node node2 = null;
        Run run = null;
        for (Node firstChild = (node == null || currentParagraph != node.getParentNode()) ? currentParagraph.getFirstChild() : this.zzYnf; firstChild != currentNode; firstChild = firstChild.nextPreOrder(currentParagraph)) {
            if (firstChild.getNodeType() == 21) {
                run = (Run) firstChild;
            }
            node2 = firstChild;
        }
        if (node2 != null && node2.getNodeType() == 18) {
            return false;
        }
        this.zzYnf = run;
        if (run != null) {
            String text = run.getText();
            if (com.aspose.words.internal.zzZYD.zzXk(text)) {
                char cOooO00o = androidx.core.content.OooO0O0.OooO00o(1, text);
                return cOooO00o == ' ' || cOooO00o == 11 || cOooO00o == '\f' || cOooO00o == 14;
            }
        }
        return false;
    }

    private boolean zzYZE() {
        zzZFB zzzfb;
        zzZFB zzzfb2 = this.zzYmT;
        if (zzzfb2 != null && !zzzfb2.isEmpty()) {
            return this.zzYmT.zzZ4n();
        }
        if (!this.zzYqv.isEmpty()) {
            return this.zzYqv.zzZ4n();
        }
        if (this.zzYqv.isEmpty() && ((zzzfb = this.zzYmT) == null || zzzfb.isEmpty())) {
            return this.zzYmO.zzYZR() || this.zzZwh.isAtStartOfParagraph() || zzZDY.zzZL(this.zzZwh.getCurrentParagraph()) || zzYZD();
        }
        return false;
    }

    private void zzYZF() {
        this.zzYqv.zzY(this.zzYnb.zzZUP());
    }

    private byte[] zzYZG() throws Exception {
        String strZzSE = this.zzYnb.zzZUC().zzSE("background-image");
        if (com.aspose.words.internal.zzZYD.zzXk(strZzSE)) {
            return this.zzYpP.zzM(this.zzZp0, strZzSE, false);
        }
        return null;
    }

    private boolean zzYZH() {
        zzPT zzptZzSx = this.zzYnb.zzZUB().zzSx(FirebaseAnalytics.Param.CONTENT);
        if (zzptZzSx == null) {
            return false;
        }
        zzL4 zzl4ZzZVx = zzptZzSx.zzZWj().zzZVx();
        if (!(zzl4ZzZVx instanceof zzP1)) {
            return false;
        }
        zzP1 zzp1 = (zzP1) zzl4ZzZVx;
        return "counter".equals(zzp1.getName()) || "counters".equals(zzp1.getName());
    }

    private boolean zzYZI() {
        return this.zzYnb.zzZUt() == 10 || this.zzYnb.zzZUt() == 9;
    }

    private boolean zzYZJ() {
        zzPT zzptZzSx;
        String strZzZTQ = this.zzYnb.zzZUw().zzZTQ();
        if (zzZDY.zzJQ(strZzZTQ) && (zzptZzSx = this.zzYnb.zzZUC().zzSx("-aw-import")) != null && zzptZzSx.zzZWj().zzP(zzL4.zzZms)) {
            return true;
        }
        if (this.zzYnb.zzZUt() != 3) {
            return "li".equals(strZzZTQ) && zzYZL() && zzYZH();
        }
        zzZBM zzzbmZzZ2Q = this.zzYnb.zzZUw().zzZ2Q();
        return (this.zzYnz.zzZ0T() != null && this.zzYnz.zzZ0T().zzZ12() >= 0) || ("li".equals(strZzZTQ) && ((this.zzYnz.zzZ0T() == null || this.zzYnz.zzZ0T().zzZ12() == -1) && zzM(zzzbmZzZ2Q))) || (!"li".equals(strZzZTQ) && this.zzYnb.zzZUK() && !zzM(zzzbmZzZ2Q)) || ("li".equals(strZzZTQ) && ("ol".equals(this.zzYnb.zzZUw().zzZ2Q().zzZTQ()) || "ul".equals(this.zzYnb.zzZUw().zzZ2Q().zzZTQ())));
    }

    private boolean zzYZK() {
        String strZzZTQ = this.zzYnb.zzZUw().zzZTQ();
        int iZzZUt = this.zzYnb.zzZUt();
        if (iZzZUt == 0 || iZzZUt == 2 || iZzZUt == 13) {
            return true;
        }
        return iZzZUt == 15 && !zzZIJ.zzKO(strZzZTQ);
    }

    private boolean zzYZL() {
        String strZzZTQ = this.zzYnb.zzZUw().zzZTQ();
        int iZzZUt = this.zzYnb.zzZUt();
        if (iZzZUt == 1 || iZzZUt == 3 || iZzZUt == 4 || iZzZUt == 7 || iZzZUt == 8 || iZzZUt == 11 || iZzZUt == 12 || iZzZUt == 14) {
            return true;
        }
        if (iZzZUt != 15) {
            return false;
        }
        return zzZIJ.zzKO(strZzZTQ);
    }

    private boolean zzYZM() {
        int iZzZUt = this.zzYnb.zzZUt();
        return iZzZUt == 5 || iZzZUt == 6;
    }

    private boolean zzYZN() {
        return "absolute".equals(this.zzYnb.zzZUC().zzSF(RequestParameters.POSITION)) && com.aspose.words.internal.zzAN.zzZD(this.zzYnb.zzZUC().zzSH("height"));
    }

    private void zzYZq() {
        StructuredDocumentTag structuredDocumentTag = (StructuredDocumentTag) com.aspose.words.internal.zzZKW.zzZ(this.zzZwh.getCurrentParagraph().getParentNode(), StructuredDocumentTag.class);
        if (structuredDocumentTag == null) {
            structuredDocumentTag = (StructuredDocumentTag) com.aspose.words.internal.zzZKW.zzZ(this.zzZwh.getCurrentParagraph().getFirstChild(), StructuredDocumentTag.class);
        }
        if (structuredDocumentTag == null) {
            return;
        }
        zzS(structuredDocumentTag);
    }

    private void zzYZr() {
        for (Section section : this.zzZwh.getDocument().getChildNodes(2, false)) {
            while (true) {
                Paragraph paragraph = (Paragraph) com.aspose.words.internal.zzZKW.zzZ(section.getBody().getLastChild(), Paragraph.class);
                if (paragraph == null || paragraph.zz9I()) {
                    break;
                }
                boolean z = paragraph.getPreviousSibling() != null && paragraph.getPreviousSibling().getNodeType() == 5;
                if (paragraph.hasChildNodes() || this.zzYmO.zzZN(paragraph) || z || paragraph.zzYp8() || paragraph.isListItem()) {
                    break;
                } else {
                    paragraph.remove();
                }
            }
        }
        this.zzZwh.moveToDocumentEnd();
    }

    private void zzYZs() {
        if (this.zzYmM.zzZ2a()) {
            zzT(256, "The document is fixed-page HTML. Its structure may not be loaded correctly.");
        }
    }

    private boolean zzYZt() throws Exception {
        if (TelemetryEventStrings.Value.TRUE.equals(this.zzYnb.zzZUC().zzSF("-aw-field-start"))) {
            this.zzYqv.zzZ4o();
            this.zzYR5.push(this.zzZwh.zzFS(33));
            return true;
        }
        String string = this.zzYnb.zzZUC().getString("-aw-field-code");
        if (com.aspose.words.internal.zzZYD.zzXk(string)) {
            this.zzYqv.zzZ4o();
            this.zzZwh.zzO9(string);
            return true;
        }
        if (TelemetryEventStrings.Value.TRUE.equals(this.zzYnb.zzZUC().zzSF("-aw-field-separator"))) {
            this.zzYqv.zzZ4o();
            this.zzYR5.push(this.zzZwh.zzFR(0));
            return true;
        }
        if (!TelemetryEventStrings.Value.TRUE.equals(this.zzYnb.zzZUC().zzSF("-aw-field-end"))) {
            return false;
        }
        this.zzYqv.zzZ4o();
        boolean z = this.zzYR5.size() > 0 && (this.zzYR5.peek() instanceof FieldSeparator);
        zzZR4 zzzr4 = new zzZR4();
        zzzr4.zzX(this.zzZwh.zz6(0, z));
        if (z) {
            zzzr4.zzX((FieldSeparator) this.zzYR5.pop());
        }
        if (this.zzYR5.size() > 0 && (this.zzYR5.peek() instanceof FieldStart)) {
            zzzr4.zzY((FieldStart) this.zzYR5.pop());
        }
        if (zzzr4.getStart() != null && (zzzr4.getSeparator() != null || zzzr4.getEnd() != null)) {
            zzzr4.zzDJ(zzzr4.zzZg2());
        }
        return true;
    }

    private boolean zzYZu() throws Exception {
        String strZzSF = this.zzYnb.zzZUC().zzSF("-aw-comment-end");
        if (com.aspose.words.internal.zzZKN.equals(strZzSF, "")) {
            return false;
        }
        int iZzZo = com.aspose.words.internal.zzJB.zzZo(strZzSF.substring(8));
        if (iZzZo == Integer.MIN_VALUE) {
            zzT(1, com.aspose.words.internal.zzZKN.format("Can't parse comment id from '{0}' in span element. Positive integer is expected after prefix '{1}'. Original comment's end position possibly has been lost.", strZzSF, "_cmntref"));
        } else if (this.zzYn6.zzVE(iZzZo)) {
            this.zzYqv.zzZ4o();
            zzz8(iZzZo);
            com.aspose.words.internal.zzZQG.zzZ(this.zzYn4, Integer.valueOf(iZzZo));
        }
        return true;
    }

    private boolean zzYZv() throws Exception {
        String strZzSF = this.zzYnb.zzZUC().zzSF("-aw-comment-start");
        if (com.aspose.words.internal.zzZKN.equals(strZzSF, "")) {
            return false;
        }
        int iZzZo = com.aspose.words.internal.zzJB.zzZo(strZzSF.substring(8));
        if (iZzZo == Integer.MIN_VALUE) {
            zzT(1, com.aspose.words.internal.zzZKN.format("Can't parse comment id from '{0}' in span element. Positive integer is expected after prefix '{1}'. Original comment's start position possibly has been lost.", strZzSF, "_cmntref"));
        } else if (!this.zzYn6.zzVE(iZzZo)) {
            this.zzYqv.zzZ4o();
            zzz9(iZzZo);
        }
        return true;
    }

    private boolean zzYZw() throws Exception {
        return zzYZv() || zzYZu();
    }

    private void zzYZx() {
        if (this.zzYnz.zzZ0T() == null) {
            this.zzYnz.zzZ(this.zzZwh, this.zzYnb, this.zzYpP, this.zzZp0, this.zzYmZ, !this.zzYn0);
        }
    }

    private boolean zzYZy() {
        return TelemetryEventStrings.Value.TRUE.equals(this.zzYnb.zzZUC().zzSF("-aw-ignore"));
    }

    private static boolean zzn(zzZIG zzzig) {
        return "urn:schemas-microsoft-com:vml".equals(zzzig.getNamespace()) || com.aspose.words.internal.zzZKV.zzZ(zzYmX, zzzig.getName(), zzYmX.length) >= 0;
    }

    private String zzo(zzZIG zzzig) {
        String strZzSF = this.zzYnb.zzZUC().zzSF("-aw-headerfooter-type");
        return com.aspose.words.internal.zzZKN.equals(strZzSF, "") ? zzzig.zzZ2B().getAttributeValue("data-headerfooter-type", "") : strZzSF;
    }

    private boolean zzp(zzZIG zzzig) {
        int iZzZR;
        int iZzZR2;
        int iZzZR3;
        zzPS zzpsZzZUC = this.zzYnb.zzZUC();
        if (!com.aspose.words.internal.zzAN.zzL(zzpsZzZUC.zzSC("width"), 33.0d) || !com.aspose.words.internal.zzAN.zzL(zzpsZzZUC.zzSH("height"), 0.75d) || !"left".equals(zzpsZzZUC.zzSF("text-align"))) {
            return false;
        }
        double dZzSD = zzpsZzZUC.zzSD("-aw-footnote-type");
        if (com.aspose.words.internal.zzAN.zzZC(dZzSD)) {
            iZzZR = -1;
            iZzZR2 = -1;
            iZzZR3 = -1;
        } else {
            iZzZR2 = (int) dZzSD;
            double dZzSD2 = zzpsZzZUC.zzSD("-aw-footnote-numberstyle");
            if (com.aspose.words.internal.zzAN.zzZC(dZzSD2)) {
                iZzZR = -1;
                iZzZR3 = -1;
            } else {
                iZzZR3 = (int) dZzSD2;
                double dZzSD3 = zzpsZzZUC.zzSD("-aw-footnote-startnumber");
                iZzZR = !com.aspose.words.internal.zzAN.zzZC(dZzSD3) ? (int) dZzSD3 : -1;
            }
        }
        if (iZzZR2 == -1 && iZzZR3 == -1 && iZzZR == -1 && (iZzZR2 = zzzig.zzZ2B().zzZR("data-footnote-type", -1)) != -1 && (iZzZR3 = zzzig.zzZ2B().zzZR("data-footnote-numberstyle", -1)) != -1) {
            iZzZR = zzzig.zzZ2B().zzZR("data-footnote-startnumber", -1);
        }
        if (iZzZR2 != -1 && iZzZR3 != -1 && iZzZR != -1) {
            if (iZzZR2 == 0) {
                this.zzZwh.getDocument().getFootnoteOptions().setNumberStyle(iZzZR3);
                this.zzZwh.getDocument().getFootnoteOptions().setStartNumber(iZzZR);
            } else if (iZzZR2 == 1) {
                this.zzZwh.getDocument().getEndnoteOptions().setNumberStyle(iZzZR3);
                this.zzZwh.getDocument().getEndnoteOptions().setStartNumber(iZzZR);
            }
        }
        return true;
    }

    private void zzq(zzZIG zzzig) throws Exception {
        if (zzp(zzzig)) {
            return;
        }
        this.zzYnb.zzZVt();
        this.zzYmO.zzZ02();
        this.zzYnb.zzZ((zzZAS) zzzig, false);
        Shape shapeZzZY = Shape.zzZY(this.zzZwh.getDocument());
        this.zzZwh.insertNode(shapeZzZY);
        this.zzYnb.zzX(shapeZzZY);
        this.zzYmO.zzVq(true);
    }

    private void zzr(zzZIG zzzig) throws Exception {
        this.zzYqv.isEmpty();
        String strZzJT = zzZDY.zzJT(zzzig.zzZ2B().getAttributeValue("src", ""));
        if (zzKj(strZzJT)) {
            zzZ(strZzJT, zzzig);
        }
    }

    private int zzs(zzZIG zzzig) throws Exception {
        byte[] bArrZzM;
        this.zzYqv.isEmpty();
        String strZzJT = zzZDY.zzJT(zzzig.zzZ2B().getAttributeValue(Constants.ScionAnalytics.MessageType.DATA_MESSAGE, ""));
        if (!zzKj(strZzJT) || (bArrZzM = this.zzYpP.zzM(this.zzZp0, strZzJT, false)) == null) {
            return 1;
        }
        zzZ(bArrZzM, strZzJT, zzzig);
        return 2;
    }

    private void zzt(zzZIG zzzig) throws Exception {
        this.zzYqv.isEmpty();
        String strZzJT = zzZDY.zzJT(zzzig.zzZ2B().getAttributeValue("src", ""));
        if (zzKj(strZzJT)) {
            zzZ(strZzJT, zzzig);
        }
    }

    private void zzu(zzZIG zzzig) throws Exception {
        this.zzYqv.isEmpty();
        if (this.zzYnb.zzZpf() || this.zzYnb.zzZUt() == 4) {
            this.zzYmO.zzVq(true);
        }
        this.zzYmO.zzZ02();
        OfficeMath officeMathZzZ = zzZ0R.zzZ(zzzig.zzZ0g(), this.zzZwh.getDocument(), this.zzZwh.getDocument().getWarningCallback());
        int iZzm = zzZDY.zzm(this.zzYnb.zzZUC().zzSF("text-align"), this.zzYnb.zzZUQ());
        if (iZzm != 1) {
            zzZ02 zzz02 = new zzZ02();
            zzz02.setJustification(iZzm);
            OfficeMath officeMath = new OfficeMath(this.zzZwh.getDocument(), zzz02);
            officeMath.appendChild(officeMathZzZ);
            officeMathZzZ = officeMath;
        }
        this.zzZwh.insertNode(officeMathZzZ);
    }

    private void zzv(zzZIG zzzig) throws Exception {
        this.zzYqv.isEmpty();
        String strZzJT = zzZDY.zzJT(zzzig.zzZ2B().getAttributeValue("src", ""));
        if (com.aspose.words.internal.zzZKN.zzU3(strZzJT)) {
            strZzJT = zzzig.zzZ2B().getAttributeValue("recindex", "");
        }
        zzZ(strZzJT, zzzig);
    }

    private boolean zzw(zzZIG zzzig) throws Exception {
        String text = (zzzig.zzZ2C().getCount() == 1 && (zzzig.zzZ2C().zzzd(0) instanceof zzZEC)) ? ((zzZEC) zzzig.zzZ2C().zzzd(0)).getText() : "";
        if ("              ".equals(text)) {
            zzKn("\t");
            return true;
        }
        zzPT zzptZzSx = this.zzYnb.zzZUC().zzSx("display");
        if (zzptZzSx == null || !zzptZzSx.zzZWj().zzP(zzL4.zzZmu) || this.zzYnb.zzZUC().zzSH("width") < 0.0d || com.aspose.words.internal.zzZYD.zzXk(com.aspose.words.internal.zzZKN.zzV(text, ControlChar.SPACE_CHAR, ControlChar.NON_BREAKING_SPACE_CHAR, FilenameUtils.EXTENSION_SEPARATOR, '-', '_', 183, '\n'))) {
            return false;
        }
        String strZzSF = this.zzYnb.zzZUC().zzSF("-aw-tabstop-align");
        double dZzSH = this.zzYnb.zzZUC().zzSH("-aw-tabstop-pos");
        if (!com.aspose.words.internal.zzZKN.equals(strZzSF, "") && dZzSH > 0.0d) {
            RefInt refInt = new RefInt(0);
            boolean zZzX = zzZDY.zzX(strZzSF, refInt);
            int i = refInt.get();
            if (zZzX) {
                String strZzSF2 = this.zzYnb.zzZUC().zzSF("-aw-tabstop-leader");
                RefInt refInt2 = new RefInt(0);
                boolean z = com.aspose.words.internal.zzZKN.equals(strZzSF2, "") || zzZDY.zzW(strZzSF2, refInt2);
                int i2 = refInt2.get();
                if (z) {
                    zzYMX zzymxZzZYj = this.zzZwh.getCurrentParagraph().zzZYj();
                    if (zzymxZzZYj.getTabStops() == null) {
                        zzymxZzZYj.zzY(new TabStopCollection());
                    }
                    zzymxZzZYj.getTabStops().add(dZzSH, i, i2);
                }
            }
        } else if (!com.aspose.words.internal.zzZKN.equals(text, ControlChar.NON_BREAKING_SPACE) && zzzig.zzZ2C().getCount() != 0) {
            return false;
        }
        this.zzYnb.zzZ(this.zzZwh.getFont(), this.zzZwh.getCurrentParagraph().zzqy(0));
        zzKn("\t");
        return true;
    }

    private boolean zzx(zzZIG zzzig) throws Exception {
        boolean z = zzzig.zzZ0e() != null && ContextChain.TAG_PRODUCT.equals(zzzig.zzZ0e().getName());
        String strZzSF = this.zzYnb.zzZUC().zzSF("-aw-bookmark-start");
        if (!com.aspose.words.internal.zzZKN.equals(strZzSF, "")) {
            this.zzYmN.zzS(strZzSF, z, true);
            return true;
        }
        String strZzSF2 = this.zzYnb.zzZUC().zzSF("-aw-bookmark-end");
        if (com.aspose.words.internal.zzZKN.equals(strZzSF2, "")) {
            return false;
        }
        this.zzYmN.zzR(strZzSF2, z, true);
        return true;
    }

    private void zzy(zzZIG zzzig) {
        if (!"embed".equals(this.zzYnb.zzZUC().zzSF("unicode-bidi")) || zzzig.zzZ2D()) {
            return;
        }
        zzYZF();
    }

    private boolean zzz(zzZIG zzzig) {
        if (this.zzYnb.zzZUJ() == 0) {
            return false;
        }
        zzZG4 zzzg4ZzZ0c = zzR(zzzig.zzZ0c()) ? zzzig.zzZ0c() : zzzig;
        zzZIG zzzigZzZ0d = zzzig;
        if (zzR(zzzg4ZzZ0c.zzZ0d())) {
            zzzigZzZ0d = zzzg4ZzZ0c.zzZ0d();
        }
        return zzzg4ZzZ0c.zzZ0c() != null && zzzigZzZ0d.zzZ0d() == null;
    }

    private static boolean zzz7(int i) {
        return i == 0 || i == 8 || i == 14 || i == 12 || i == 11 || i == 2;
    }

    private void zzz8(int i) {
        CommentRangeEnd commentRangeEnd;
        Comment comment = this.zzYn6.get(i);
        if (this.zzYn5.zzVE(i)) {
            commentRangeEnd = this.zzYn5.get(i);
            commentRangeEnd.remove();
            comment.remove();
        } else {
            CommentRangeEnd commentRangeEnd2 = new CommentRangeEnd(this.zzZwh.getDocument(), comment.getId());
            this.zzYn5.add(i, commentRangeEnd2);
            commentRangeEnd = commentRangeEnd2;
        }
        this.zzZwh.getCurrentParagraph().appendChild(commentRangeEnd);
        this.zzZwh.getCurrentParagraph().appendChild(comment);
    }

    private void zzz9(int i) {
        Comment comment = new Comment(this.zzZwh.getDocument());
        this.zzYn6.add(i, comment);
        this.zzZwh.getCurrentParagraph().appendChild(new CommentRangeStart(this.zzZwh.getDocument(), comment.getId()));
        comment.appendChild(new Paragraph(this.zzZwh.getDocument()));
    }

    private void zzza(int i) throws Exception {
        if (!("li".equals(this.zzYnb.zzZUw().zzZTQ()) && i == 1) && this.zzYnb.zzh(i, true)) {
            zzLa(this.zzYnb.zzZUI());
            this.zzYnb.zzh(0, false);
        }
    }

    @Override // com.aspose.words.zzZAQ
    public final void zzI(zzZIG zzzig) throws Exception {
        zzZ(zzzig, false);
        Cell cellZzZex = this.zzZwh.getCurrentParagraph().zzZex();
        Paragraph lastParagraph = cellZzZex.getLastParagraph();
        if (lastParagraph.zzYpa() && cellZzZex.zz6G().getHideMark() && this.zzYmO.zzZN(lastParagraph)) {
            cellZzZex.zz6G().setHideMark(false);
        }
        if (lastParagraph.getChildNodes(0, false).getCount() == 0 && (lastParagraph.zzYB9() instanceof Paragraph) && !this.zzYmO.zzZN(lastParagraph)) {
            this.zzZwh.moveTo(lastParagraph.zzYB9());
            lastParagraph.remove();
        }
    }

    public final void zzVm(boolean z) throws Exception {
        zzYEF zzyef = (this.zzZwh.isAtEndOfParagraph() || this.zzZwh.getCurrentParagraph().zzYoV()) ? (zzYEF) this.zzZwh.getCurrentParagraph().zzYp5().zzbn() : null;
        this.zzZwh.zzZ(this.zzYmY, true);
        if (this.zzYnb.zzZpe() != null) {
            zzYEF zzyefZzZpG = this.zzZwh.zzZpG();
            this.zzYnb.zzZpe().zzZYh().zzY(zzyefZzZpG);
            this.zzZwh.zzZ(zzyefZzZpG, false);
        }
        this.zzYnb.zzZ(this.zzZwh.getFont(), this.zzZwh.getCurrentParagraph().zzqy(0));
        if (this.zzYnb.zzZUy() != 0) {
            this.zzZwh.getFont().setHidden(true);
        }
        zzZV8 zzzv8ZzZUA = this.zzYnb.zzZUA();
        if (zzzv8ZzZUA != null) {
            this.zzZwh.setRunAttr(14, zzzv8ZzZUA);
        }
        zzZV8 zzzv8ZzZUz = this.zzYnb.zzZUz();
        if (zzzv8ZzZUz != null) {
            this.zzZwh.setRunAttr(12, zzzv8ZzZUz);
        }
        if (!z) {
            this.zzZwh.getFont().setUnderline(0);
            this.zzZwh.getFont().setStrikeThrough(false);
        }
        if (!this.zzYn0 && !this.zzYmR.zzYmK && this.zzZwh.getParagraphFormat().getStyleIdentifier() == 1) {
            this.zzZwh.getFont().setKerning(18.0d);
        }
        if (!this.zzYn0 && !this.zzYmR.zzYmK) {
            zzYEF zzyefZzl1 = this.zzZwh.getParagraphFormat().getStyle().zzl1(1);
            this.zzZwh.getFont().getStyle().zzT(zzyefZzl1, 0);
            zzYEF zzyefZzZpG2 = this.zzZwh.zzZpG();
            zzYEF zzyefZzZpG3 = this.zzZwh.zzZpG();
            zzyefZzZpG3.zzI(zzyefZzl1);
            zzyefZzZpG3.zzX(zzyefZzl1, 50);
            if (zzyefZzZpG3.zzZ7j() != 10) {
                for (int i : zzYEF.zzXq3) {
                    Object objZzPk = zzyefZzZpG2.zzPk(i);
                    if (objZzPk != null && !zzyefZzZpG3.zzVE(i)) {
                        zzyefZzZpG3.zzQ(i, objZzPk);
                    }
                }
            }
            this.zzZwh.zzZ(zzyefZzZpG3, false);
        }
        if (zzyef != null) {
            this.zzZwh.getCurrentParagraph().zzC(zzyef);
        }
    }

    public final void zzYZz() throws Exception {
        if (this.zzYnz.zzZ0T() != null && !this.zzYmR.zzYmK) {
            this.zzYnz.zzZ0T().zzZ14();
        }
        this.zzYnb.zzL(this.zzZwh.getCurrentParagraph());
        if (this.zzYnc) {
            int alignment = this.zzZwh.getParagraphFormat().getAlignment();
            if (alignment == 0) {
                this.zzZwh.getParagraphFormat().setAlignment(2);
            } else if (alignment == 2) {
                this.zzZwh.getParagraphFormat().setAlignment(0);
            }
            this.zzZwh.getParagraphFormat().setBidi(true);
        }
        if (this.zzYn0 || this.zzYmR.zzYmK) {
            return;
        }
        zzYMX zzymxZzqw = this.zzZwh.getParagraphFormat().getStyle().zzqw(1);
        zzYMX zzymxZzZpF = this.zzZwh.zzZpF();
        zzymxZzZpF.zzX(zzymxZzqw, 1000);
        this.zzZwh.getCurrentParagraph().zzZ(zzymxZzZpF);
    }

    public final void zzZ(com.aspose.words.internal.zzZOP zzzop, com.aspose.words.internal.zzZO0 zzzo0, Document document) throws Exception {
        zzZ(zzzop, zzzo0, new DocumentBuilder(document), false);
    }

    public final com.aspose.words.internal.zzZYG<BookmarkEnd> zzZ1J() {
        return this.zzYmN.zzZ1J();
    }

    private void zzM(zzZIG zzzig, boolean z) throws Exception {
        if (!z) {
            this.zzYmN.zzN(zzzig);
            this.zzYmO.zzZ00();
            this.zzYnz.zzZ0T();
            this.zzYnz.zzZ0T().zzZ15();
            this.zzYnt.zzZ(this.zzYnb.zzZUw().zzZTQ(), this.zzYnb.zzZUC(), this.zzYqv);
            return;
        }
        this.zzYnb.zzh(1, true);
        this.zzYnb.zzh(0, false);
        zzYZx();
        this.zzYmO.zzZ01();
        if (!this.zzYnz.zzZ0T().zzZ11()) {
            this.zzYmN.zzP(zzzig.zzZ0e());
        }
        this.zzYnt.zzZ(this.zzYnb.zzZUw().zzZTQ(), this.zzYnb.zzZUC(), this.zzYnb.zzZUt());
        this.zzYnz.zzZ0T().zzN(zzzig);
        zzYZz();
        this.zzYny.zzZ(this.zzZwh.getCurrentParagraph(), this.zzYnb.zzZUC());
        this.zzYnt.zzVv(true);
        this.zzYmN.zzO((zzZAS) zzzig);
    }

    public final void zzZ(com.aspose.words.internal.zzZOP zzzop, com.aspose.words.internal.zzZO0 zzzo0, DocumentBuilder documentBuilder, boolean z) throws Exception {
        if (!this.zzYmR.zzYmK) {
            documentBuilder.getDocument().getCompatibilityOptions().optimizeFor(this.zzYmR.zzYmI);
        }
        documentBuilder.getDocument().zzZqz().zzZ6Z();
        documentBuilder.zzZpL();
        com.aspose.words.internal.zzZO0 zzzo0ZzZ = zzZIC.zzZ(zzzo0, zzzop);
        zzZ(documentBuilder, true, this.zzYmR.zzYmK, com.aspose.words.internal.zzZYD.zzi(zzzo0ZzZ.zzi1(), "iso-8859-8"));
        zzZIR zzzirZzX = zzX(zzzop, zzzo0ZzZ);
        zzZ(zzzirZzX);
        this.zzYmN.zzZ(documentBuilder, this.zzYqv, false);
        this.zzYnt.zzT(documentBuilder);
        zzZ(zzzirZzX.zzZ31(), true);
        this.zzYmN.zzZ1K();
        zzYZr();
        this.zzYqv.zzZ4o();
        documentBuilder.zzZpK();
        this.zzYmO.zzYZT();
        zzYZs();
    }

    private boolean zzU(zzZG4 zzzg4) {
        zzZG4 zzzg4ZzZ0d = zzzg4;
        do {
            zzzg4ZzZ0d = zzzg4ZzZ0d.zzZ0d();
            if (zzzg4ZzZ0d == null) {
                break;
            }
            if (zzT(zzzg4ZzZ0d)) {
                return false;
            }
        } while (!(zzzg4ZzZ0d instanceof zzZIG));
        do {
            zzzg4 = zzzg4.zzZ0c();
            if (zzzg4 == null) {
                break;
            }
            if (zzT(zzzg4)) {
                return false;
            }
        } while (!(zzzg4 instanceof zzZIG));
        return (zzzg4ZzZ0d == null && zzzg4 == null) ? false : true;
    }

    private void zzS(zzZIG zzzig, boolean z) {
        this.zzYqv.isEmpty();
        if (z && zzzig.zzZ2B().zzL6("disabled") == null) {
            String attributeValue = zzzig.zzZ2B().getAttributeValue(Constants.ScionAnalytics.PARAM_LABEL, "");
            if (!com.aspose.words.internal.zzZYD.zzXk(attributeValue)) {
                attributeValue = zzZDY.zzp(zzzig.zzZ2F(), true);
            }
            com.aspose.words.internal.zzZQG.zzZ(this.zzYmP, new zzZFW(attributeValue, zzzig.zzZ2B().getAttributeValue("value", ""), zzzig.zzZ2B().zzL6("selected") != null));
        }
    }

    private boolean zzT(zzZG4 zzzg4) {
        if (zzzg4 instanceof zzZEC) {
            return zzZ((zzZEC) zzzg4);
        }
        if (zzzg4 instanceof zzZIG) {
            zzZIG zzzig = (zzZIG) zzzg4;
            if (zzB(zzzig) && zzA(zzzig)) {
                return true;
            }
        }
        return false;
    }

    private int zzX(zzZIG zzzig, boolean z) throws Exception {
        if (!zzYZJ()) {
            return 0;
        }
        zzM(zzzig, z);
        return 1;
    }

    private static zzYB5 zzv(Shape shape) {
        Cell cellZzZex;
        Paragraph paragraph = (Paragraph) com.aspose.words.internal.zzZKW.zzZ(shape.getParentNode(), Paragraph.class);
        if (paragraph == null || (cellZzZex = paragraph.zzZex()) == null) {
            return null;
        }
        ParagraphFormat paragraphFormat = paragraph.getParagraphFormat();
        double rightIndent = paragraphFormat.getRightIndent() + paragraphFormat.getLeftIndent();
        PreferredWidth preferredWidth = cellZzZex.getCellFormat().getPreferredWidth();
        if (preferredWidth.isFixed()) {
            return new zzYB5(preferredWidth.getValue() - rightIndent, 1584.0d);
        }
        return null;
    }

    private void zzT(int i, String str) {
        if (this.zzZwh.getDocument().getWarningCallback() != null) {
            OooO00o.OooO0O0(this.zzZwh.getDocument().getWarningCallback(), i, 16, str);
        }
    }

    private boolean zzS(zzZG4 zzzg4) {
        if (zzzg4 != null) {
            return (zzzg4 instanceof zzZEC) && !zzZ((zzZEC) zzzg4);
        }
        return true;
    }

    private static zzYB5 zzS(com.aspose.words.internal.zzEG zzeg) {
        if (zzeg == null) {
            return null;
        }
        return new zzYB5(ConvertUtil.pixelToPoint(zzeg.getWidth(), 96.0d), ConvertUtil.pixelToPoint(zzeg.getHeight(), 96.0d));
    }

    private static void zzS(StructuredDocumentTag structuredDocumentTag) {
        Node firstChild;
        if (structuredDocumentTag.zzY3J().zzPk(StyleIdentifier.LIST_TABLE_5_DARK_ACCENT_2) == null && (firstChild = structuredDocumentTag.getFirstChild()) != null) {
            if (firstChild.getNodeType() == 28) {
                StructuredDocumentTag structuredDocumentTag2 = (StructuredDocumentTag) firstChild;
                zzS(structuredDocumentTag2);
                zzY(structuredDocumentTag.zzY3J(), structuredDocumentTag2.zzY3J());
            } else {
                if (firstChild.getNodeType() == 8) {
                    Run runZzYVe = ((Paragraph) firstChild).zzYVe();
                    if (runZzYVe != null) {
                        zzY(structuredDocumentTag.zzY3J(), runZzYVe.zzZYh());
                        return;
                    }
                    return;
                }
                if (firstChild.getNodeType() == 21) {
                    zzY(structuredDocumentTag.zzY3J(), ((Run) firstChild).zzZYh());
                }
            }
        }
    }

    public final void zzZ(String str, DocumentBuilder documentBuilder, int i, boolean z) throws Exception {
        boolean zZzS = zzS(documentBuilder);
        zzYMX zzymxZzZpF = documentBuilder.zzZpF();
        zzYEF zzyef = (zzYEF) documentBuilder.getCurrentParagraph().zzYp5().zzbn();
        documentBuilder.zzZpL();
        zzZ(documentBuilder, false, (i & 1) != 0, false);
        zzZRE zzzre = this.zzYnh;
        zzZFH zzzfh = this.zzYmR;
        zzZIR zzzirZzZ = zzZIR.zzZ(str, zzzre, zzzfh.zzYmH, zzzfh.zzYmC);
        zzZ(zzzirZzZ);
        this.zzYmN.zzZ(documentBuilder, this.zzYqv, z);
        this.zzYnt.zzT(documentBuilder);
        zzZ(zzzirZzZ.zzZ31(), true);
        this.zzYmN.zzZ1K();
        this.zzYqv.zzZ4o();
        if (!zZzS || (i & 2) == 0) {
            this.zzYmO.zzZ(zzymxZzZpF, zzyef);
        }
        documentBuilder.zzZpK();
        this.zzYmO.zzYZT();
        zzYZs();
    }

    private static void zzY(zzYEF zzyef, zzYEF zzyef2) {
        if (zzyef2.zzYdM().toBool()) {
            zzyef.zzW(zzZU.zzZF6);
            if (zzyef2.getLocaleIdBi() == 1037) {
                zzyef.setLocaleIdBi(zzyef2.getLocaleIdBi());
            }
        }
    }

    private static boolean zzY(String str, RefInt refInt) {
        switch (zzUR.zzTP(str)) {
            case 49:
                refInt.set(1);
                return true;
            case 50:
                refInt.set(4);
                return true;
            case 51:
                refInt.set(3);
                return true;
            case 52:
                refInt.set(5);
                return true;
            default:
                refInt.set(0);
                return false;
        }
    }

    private void zzR(Run run) {
        int iZzZUF = this.zzYnb.zzZUF();
        if (iZzZUF != 0) {
            run.zzZYh().zzvs(iZzZUF);
        }
    }

    private static boolean zzR(zzZG4 zzzg4) {
        zzZIG zzzig;
        return (zzzg4 == null || (zzzig = (zzZIG) com.aspose.words.internal.zzZKW.zzZ(zzzg4, zzZIG.class)) == null || !"br".equals(zzzig.getName())) ? false : true;
    }

    private void zzZ(DocumentBuilder documentBuilder, boolean z, boolean z2, boolean z3) {
        zzYEF zzyef;
        zzYMX zzymx;
        if (this.zzZwh == null) {
            this.zzZwh = documentBuilder;
            String baseUri = documentBuilder.getDocument().getBaseUri();
            this.zzZp0 = baseUri;
            if (baseUri == null) {
                this.zzZp0 = "";
            }
            this.zzYn1 = z;
            this.zzYn0 = z2;
            if (z2) {
                zzyef = documentBuilder.zzZpG();
            } else {
                zzyef = new zzYEF();
            }
            this.zzYmY = zzyef;
            if (z2) {
                zzymx = documentBuilder.zzZpF();
            } else {
                zzymx = new zzYMX();
            }
            this.zzYnx = zzymx;
            this.zzYmZ = z2 ? documentBuilder.getParagraphFormat().getLeftIndent() : 0.0d;
            this.zzYnc = z3;
            this.zzYqv = new zzZK3(this.zzZwh, z3);
            this.zzYmU = new zzZDV(documentBuilder, this.zzYpP);
            this.zzYmS = new zzZHS(documentBuilder.getDocument().zzZqy());
            return;
        }
        throw new IllegalStateException("Attempt to re-use a HTML reader instance.");
    }

    private boolean zzN(String str, String str2, boolean z) {
        int i = com.aspose.words.internal.zzZOF.ORDINAL$4894b8c8;
        if (!com.aspose.words.internal.zzZKN.zzS(str2, "#_cmnt", i) && !com.aspose.words.internal.zzZKN.zzS(str2, "#_cmntref", i)) {
            if (!com.aspose.words.internal.zzZKN.zzS(str, "_cmntref", i)) {
                return false;
            }
            int iZzZo = com.aspose.words.internal.zzJB.zzZo(str.substring(8));
            if (iZzZo == Integer.MIN_VALUE) {
                if (z) {
                    zzT(1, com.aspose.words.internal.zzZKN.format("Can't parse comment id from '{0}' in anchor element. Positive integer is expected after prefix '{1}'. Comment possibly has been lost.", str, "_cmntref"));
                }
                return true;
            }
            if (z) {
                if (!this.zzYn6.zzVE(iZzZo)) {
                    zzz9(iZzZo);
                }
            } else if (!this.zzYn4.contains(Integer.valueOf(iZzZo))) {
                zzz8(iZzZo);
            }
            return true;
        }
        this.zzYn9 = z;
        return true;
    }

    private void zzZ(zzZIR zzzir) throws Exception {
        int i;
        zzQH zzqh;
        zzZJ3 zzzj5;
        zzZYY zzzyy;
        boolean z = this.zzYn0;
        int i2 = z ? 3 : 0;
        zzQH zzqh2 = new zzQH(zzL5.zzMd(zzzir.getMode()), i2, z ? null : com.aspose.words.internal.zzPV.zzKa, this.zzYmR.zzYmK);
        zzML zzmlZzZ = zzqh2.zzZ(this.zzZp0, this.zzYpP);
        zzmlZzZ.zzW(zzzir.zzZ31());
        this.zzYna = zzmlZzZ.zzZVv();
        int iZzZ7j = this.zzYn0 ? this.zzZwh.getParagraphFormat().getStyle().zzZ7j() : 0;
        int iZzZ7j2 = this.zzYn0 ? this.zzZwh.getFont().getStyle().zzZ7j() : 10;
        this.zzZop = zzqh2.zzX(zzmlZzZ.zzZVv());
        zzZIG zzzigZzKN = zzzir.zzZ31().zzKN("html");
        String attributeValue = zzzigZzKN != null ? zzzigZzKN.zzZ2B().getAttributeValue("style", "") : "";
        if (zzzigZzKN != null) {
            zzZIG zzzigZzKN2 = zzzigZzKN.zzKN("body");
            String attributeValue2 = zzzigZzKN2 != null ? zzzigZzKN2.zzZ2B().getAttributeValue("style", "") : "";
            ArrayList<zzLT> arrayListZzZVv = zzmlZzZ.zzZVv();
            ArrayList<zzN0> arrayListZzZVu = zzmlZzZ.zzZVu();
            zzMJ zzmj = this.zzZop;
            zzZFH zzzfh = this.zzYmR;
            zzLS zzlsZzZ = zzqh2.zzZ(arrayListZzZVv, arrayListZzZVu, attributeValue, attributeValue2, zzmj, zzzfh.zzYmK, zzzfh.zzYmD);
            zzqh = zzqh2;
            if (this.zzYmR.zzYmK) {
                zzzyy = new zzZYY(this.zzZwh.getDocument(), zzlsZzZ, true);
                i = 1;
            } else {
                i = 1;
                zzzyy = new zzZYY(this.zzZwh.getDocument(), iZzZ7j, iZzZ7j2, i2, zzlsZzZ, this.zzYmR.zzYmD);
            }
            this.zzYnb = zzzyy;
        } else {
            i = 1;
            zzqh = zzqh2;
        }
        if (this.zzYmR.zzYmJ == i) {
            zzzj5 = new zzZJ4(this.zzZwh, this.zzYnb);
        } else {
            zzzj5 = new zzZJ5(this.zzZwh, this.zzYnb);
        }
        this.zzYmQ = zzzj5;
        this.zzZoo = zzqh.zzZWC();
        if (this.zzYn1) {
            this.zzYnb.zzZpi();
        }
        this.zzYmO = new zzZFS(this, this.zzYqv, this.zzZwh, this.zzYnb, this.zzYny, this.zzYnx, this.zzYnz, this.zzYnt, !this.zzYn1);
        this.zzYnd = new zzZHX(this.zzYzH, this.zzYnb, this.zzYqv, this.zzZwh.getDocument().zzZqy());
    }

    private void zzZ(zzZIG zzzig, boolean z) throws Exception {
        zzZE5 zzze5 = new zzZE5(zzzig);
        while (zzze5.moveNext()) {
            if (zzze5.zzYXo() instanceof zzZIG) {
                zzZIG zzzig2 = (zzZIG) zzze5.zzYXo();
                boolean z2 = zzze5.zzYXo() != zzzig || z;
                if (zzze5.zzZou()) {
                    if (z2) {
                        this.zzYnb.zzZ((zzZAS) zzzig2, true);
                    }
                    if (zzY(zzzig2, true) != 1) {
                        zzze5.zzYXp();
                        if (z2) {
                            this.zzYnb.zzZVt();
                        }
                    } else {
                        zzza(1);
                    }
                } else {
                    zzza(2);
                    zzY(zzzig2, false);
                    if (z2) {
                        this.zzYnb.zzZVt();
                    }
                }
            } else if (zzze5.zzYXo() instanceof zzZEC) {
                zzZEC zzzec = (zzZEC) zzze5.zzYXo();
                if (zzzec.zzZ0d() != null || !this.zzYnb.zzZUL() || zzZ(zzzec)) {
                    zzLa(zzzec.getText());
                }
            }
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:155:0x0209 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:176:0x0285 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:179:0x028d A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private int zzZ(zzZIG zzzig, boolean z, int i) throws Exception {
        switch (zzUR.zzTP(zzzig.getName())) {
            case 0:
                if (z) {
                    this.zzYmU.zz9(zzzig);
                }
                return 1;
            case 1:
            case 21:
                return 1;
            case 2:
                if (z) {
                    this.zzZwh.getDocument().getBuiltInDocumentProperties().get("Title").zzO1(zzzig.zzZ2F());
                }
            case 3:
                if (z) {
                    zzE(zzzig);
                    return 2;
                }
            case 4:
                if (z) {
                    this.zzZp0 = com.aspose.words.internal.zzZVR.zz6(this.zzZp0, zzZDY.zzJT(zzzig.zzZ2B().getAttributeValue("href", "")));
                }
                String attributeValue = zzzig.zzZ2B().getAttributeValue("target", "");
                if (!com.aspose.words.internal.zzZKN.zzU3(attributeValue) && this.zzYn1 && !this.zzZwh.getDocument().getCustomDocumentProperties().contains("Base Target")) {
                    this.zzZwh.getDocument().getCustomDocumentProperties().add("Base Target", attributeValue);
                    return 2;
                }
            case 5:
                if (!this.zzYmW) {
                    zzT(16777216, "HTML client-side scripts are not supported. Scripts have been ignored.");
                    this.zzYmW = true;
                    return 2;
                }
            case 6:
                return this.zzYmR.zzYmH ? 2 : 0;
            case 9:
                zzVp(z);
                return 1;
            case 10:
                if (this.zzYnb.zzZUy() == 0) {
                    this.zzYmO.zzYZU();
                    if (z) {
                        zzG(zzzig);
                        return 1;
                    }
                }
                return 1;
            case 11:
                if (this.zzYnb.zzZUy() == 0) {
                    this.zzYmO.zzYZU();
                    zzT(zzzig, z);
                    return 1;
                }
                return 1;
            case 12:
                if (!zzYZI() && this.zzYnb.zzZUy() == 0) {
                    zzS(zzzig, z);
                    return 2;
                }
            case 13:
                if (!zzYZI()) {
                    zzN(zzzig, z);
                    return 1;
                }
            case 14:
                if (z && this.zzYnb.zzZUy() == 0) {
                    zzD(zzzig);
                    return 1;
                }
                return 1;
            case 15:
                if (this.zzYnb.zzZUy() == 0) {
                    this.zzYmO.zzYZU();
                    if (z) {
                        zzv(zzzig);
                        return 1;
                    }
                }
                return 1;
            case 16:
                if (!zzYZI() && i != 12 && i != 11 && i != 14) {
                    zzJ(zzzig, this.zzYnb.zzZUy() == 0);
                    this.zzYmO.zzYZU();
                    return 2;
                }
            case 17:
                if (!zzYZI() && i != 12 && i != 11 && i != 14) {
                    if (this.zzYnb.zzZUy() == 0) {
                        zzu(zzzig);
                    }
                    this.zzYmO.zzYZU();
                    return 2;
                }
            case 18:
                if (this.zzYnb.zzZUy() == 0) {
                    this.zzYmO.zzYZU();
                    if (z) {
                        zzt(zzzig);
                        return 1;
                    }
                }
                return 1;
            case 19:
                if (this.zzYnb.zzZUy() == 0) {
                    this.zzYmO.zzYZU();
                    if (z) {
                        return zzs(zzzig);
                    }
                }
                return 1;
            case 20:
                if (this.zzYnb.zzZUy() == 0) {
                    this.zzYmO.zzYZU();
                    if (z) {
                        zzr(zzzig);
                    }
                    this.zzYmO.zzYZU();
                    return 2;
                }
            case 22:
                if (this.zzYnb.zzZUy() == 0) {
                    this.zzYmO.zzYZU();
                    zzVj(z);
                    this.zzYmO.zzYZU();
                    return 1;
                }
            case 23:
                if (this.zzYzH == 53) {
                    zzT(1, "HTML frames are not supported when loading a CHM document.");
                    return 2;
                }
                new zzZHI(this.zzZwh.getDocument(), this.zzZp0, this.zzYpP).zzR(zzzig);
                return 2;
            case 24:
                if (this.zzYnb.zzZUy() == 0) {
                    zzH(zzzig);
                    return 2;
                }
            case 30:
            case 31:
            case 32:
                if (this.zzYnb.zzZUy() == 0) {
                    zzVl(z);
                    return 1;
                }
                return 1;
            case 33:
            case 34:
                if (!zzYZI()) {
                    zzVk(z);
                    if (!z) {
                        if (!this.zzZwh.getCurrentParagraph().isListItem()) {
                            this.zzYmN.zzQ(zzzig);
                            return 1;
                        }
                        this.zzYmN.zzO(zzzig);
                        return 1;
                    }
                    return 1;
                }
            case 35:
                zzZFB zzzfb = this.zzYmT;
                if (zzzfb != null) {
                    zzzfb.flush();
                    this.zzYmT = null;
                }
                if (z) {
                    this.zzYmT = new zzZFB(this.zzZwh, this.zzYnb.zzZUC(), this.zzYnc);
                    return 1;
                }
                return 1;
            case 36:
                if (this.zzYmT == null) {
                }
                break;
            case 37:
                if (this.zzYmT != null) {
                    if (this.zzYnb.zzZUy() != 2) {
                        this.zzYmT.zzVi(z);
                        return 1;
                    }
                }
                return 1;
            case 38:
            case 39:
            case 40:
                if (!zzYZI()) {
                    if (this.zzYnb.zzZUL()) {
                        zzVo(z);
                        return 1;
                    }
                    return 1;
                }
            case 41:
                if (z && this.zzYnb.zzZUy() == 0) {
                    zzZ(this.zzYnb.zzZUA());
                    return 0;
                }
            case 42:
                if (z && this.zzYnb.zzZUy() == 0) {
                    zzZ(this.zzYnb.zzZUz());
                    return 0;
                }
            case 43:
                if (z) {
                    this.zzYqv.zzZ4o();
                    zzVm(true);
                    this.zzZwh.zz7(1, false);
                    return 1;
                }
                return 1;
        }
    }

    private void zzZ(zzZV8 zzzv8) {
        String string = this.zzYnb.zzZUC().getString("-aw-revision-author");
        if (!com.aspose.words.internal.zzZKN.equals(string, "")) {
            zzzv8.setAuthor(string);
        }
        com.aspose.words.internal.zzZQ9 zzzq9ZzZy = com.aspose.words.internal.zzJB.zzZy(this.zzYnb.zzZUC().getString("-aw-revision-datetime"));
        if (com.aspose.words.internal.zzZQ9.zzZ(zzzq9ZzZy, com.aspose.words.internal.zzZQ9.zz35)) {
            return;
        }
        zzzv8.zz4(zzzq9ZzZy);
    }

    private boolean zzZ(com.aspose.words.internal.zzD3<Footnote> zzd3, String str, zzZIG zzzig, boolean z) {
        Footnote footnote;
        Footnote footnote2;
        String attributeValue = zzzig.zzZ2B().getAttributeValue("id", "");
        boolean z2 = false;
        if (!com.aspose.words.internal.zzZKN.zzS(attributeValue, str, com.aspose.words.internal.zzZOF.ORDINAL$4894b8c8)) {
            return false;
        }
        int iZzZo = com.aspose.words.internal.zzJB.zzZo(attributeValue.substring(str.length()));
        if (iZzZo == Integer.MIN_VALUE || iZzZo <= 0) {
            if (z) {
                zzT(256, com.aspose.words.internal.zzZKN.format("Can't parse footnote id from '{0}'. Positive integer is expected after prefix '{1}'. Footnotes's content has been treated as regular document's subtree.", attributeValue, str));
            }
            return true;
        }
        Footnote footnote3 = zzd3.get(iZzZo);
        if (footnote3 == null) {
            if (z) {
                zzT(256, com.aspose.words.internal.zzZKN.format("There is no footnote with footnote id '{0}'. Footnote's content has been treated as regular document's subtree.", Integer.valueOf(iZzZo)));
            }
            return true;
        }
        if (z) {
            this.zzYn7 = footnote3;
            double dZzSD = this.zzYnb.zzZUC().zzSD("-aw-footnote-isauto");
            int iZzZR = com.aspose.words.internal.zzAN.zzZC(dZzSD) ? zzzig.zzZ2B().zzZR("data-footnote-isauto", -1) : (int) dZzSD;
            if (iZzZR != 0 && iZzZR != 1) {
                zzT(65536, com.aspose.words.internal.zzZKN.format("Can't determine if footnote with footnote id '{0}' is auto. Footnote has been treated as having custom mark.", Integer.valueOf(iZzZo)));
                footnote2 = this.zzYn7;
            } else {
                footnote = this.zzYn7;
                if (iZzZR != 0) {
                    z2 = true;
                    footnote.isAuto(z2);
                    this.zzYmO.zzZ5(this.zzYn7.getFirstParagraph());
                } else {
                    footnote2 = footnote;
                }
            }
            footnote = footnote2;
            footnote.isAuto(z2);
            this.zzYmO.zzZ5(this.zzYn7.getFirstParagraph());
        } else {
            this.zzYn7 = null;
            this.zzYmO.zzYZX();
        }
        return true;
    }

    private boolean zzZ(int i, com.aspose.words.internal.zzD3<Footnote> zzd3, String str, String str2, String str3, String str4, String str5, boolean z) {
        int i2 = com.aspose.words.internal.zzZOF.ORDINAL$4894b8c8;
        if (com.aspose.words.internal.zzZKN.zzS(str5, str3, i2) && this.zzYn7 != null) {
            int iZzZo = com.aspose.words.internal.zzJB.zzZo(str5.substring(str3.length()));
            if (iZzZo == Integer.MIN_VALUE || zzd3.get(iZzZo) == null) {
                return false;
            }
            this.zzYn8 = z;
            return true;
        }
        if (com.aspose.words.internal.zzZKN.zzS(str5, str2, i2)) {
            int iZzZo2 = com.aspose.words.internal.zzJB.zzZo(str5.substring(str2.length()));
            if (iZzZo2 == Integer.MIN_VALUE || zzd3.get(iZzZo2) == null) {
                return false;
            }
            this.zzYn9 = z;
            return true;
        }
        if (!com.aspose.words.internal.zzZKN.zzS(str4, str, i2)) {
            return false;
        }
        int iZzZo3 = com.aspose.words.internal.zzJB.zzZo(str4.substring(str.length()));
        if (iZzZo3 == Integer.MIN_VALUE) {
            if (z) {
                zzT(1, com.aspose.words.internal.zzZKN.format("Can't parse footnote id from '{0}'. Positive integer is expected after prefix '{1}'. Footnote has been lost.", str4, str));
            }
            return true;
        }
        if (zzd3.zzVE(iZzZo3)) {
            zzT(1, com.aspose.words.internal.zzZKN.format("Document already contains footnote with footnote id '{0}'. Footnote has been lost.", Integer.valueOf(iZzZo3)));
            return false;
        }
        if (!z) {
            Footnote footnoteInsertFootnote = this.zzZwh.insertFootnote(i, null, "");
            footnoteInsertFootnote.getFirstParagraph().removeAllChildren();
            zzd3.add(iZzZo3, footnoteInsertFootnote);
        }
        return true;
    }

    private void zzZ(String str, zzZIG zzzig) throws Exception {
        zzZ(this.zzYpP.zzM(this.zzZp0, str, true), str, zzzig);
    }

    private void zzZ(byte[] bArr, String str, zzZIG zzzig) throws Exception {
        byte[] bArrZzDL;
        Shape shapeInsertImage;
        zzZIG zzzigZzZ0e;
        zzYB5 zzyb5 = null;
        if (com.aspose.words.internal.zzEF.zzZD(bArr)) {
            zzY7J zzy7j = new zzY7J(this.zzZp0, this.zzYpP, this.zzZwh.getDocument().zzZqx(), this.zzZwh.getDocument().getLayoutOptions().getTextShaperFactory(), true, true);
            zzZH0 zzzh0 = new zzZH0(null, null, this.zzYnb.zzZUC());
            zzY7K zzy7k = new zzY7K(com.aspose.words.internal.zzZO0.zzhV().zzZn(bArr), zzy7j, zzzig.zzZ0e());
            zzYB5 zzyb5ZzZUG = this.zzYnb.zzZUG();
            if (zzyb5ZzZUG == null) {
                zzyb5ZzZUG = new zzYB5(this.zzZwh.getPageSetup().getPageWidth(), this.zzZwh.getPageSetup().getPageHeight());
            }
            zzY7R zzy7rZzZ = zzy7k.zzZ(zzyb5ZzZUG, new zzYB5(zzzh0.zzZ1A(), zzzh0.zzZ1z()));
            zzy7k.zzd(Float.intBitsToFloat((int) zzy7rZzZ.getSize()), com.aspose.words.internal.zzZPW.zzYz(zzy7rZzZ.getSize()));
            bArrZzDL = zzy7k.zzPN(true);
            zzyb5 = new zzYB5(Float.intBitsToFloat((int) zzy7rZzZ.getSize()), com.aspose.words.internal.zzZPW.zzYz(zzy7rZzZ.getSize()));
        } else {
            bArrZzDL = bArr;
        }
        this.zzYmO.zzZ02();
        zzVm(this.zzYn0);
        if (bArrZzDL != null) {
            try {
                shapeInsertImage = this.zzZwh.zzZ(bArrZzDL, 2, 0.0d, 2, 0.0d, -1.0d, -1.0d, 0, true);
            } catch (com.aspose.words.internal.zzX8 unused) {
                bArrZzDL = com.aspose.words.internal.zzEF.zzDL();
                shapeInsertImage = this.zzZwh.insertImage(bArrZzDL);
            }
            if (com.aspose.words.internal.zzEF.zzZu(bArrZzDL)) {
                zzT(1, "Image has been replaced with a placeholder.");
            }
        } else {
            shapeInsertImage = new Shape(this.zzZwh.getDocument(), 75);
            shapeInsertImage.setWrapType(0);
            shapeInsertImage.getImageData().setSourceFullName(com.aspose.words.internal.zzZVR.zz6(this.zzZp0, str));
            this.zzZwh.insertNode(shapeInsertImage);
        }
        zzZ(shapeInsertImage, bArrZzDL, zzyb5);
        shapeInsertImage.setShapeAttr(897, zzzig.zzZ2B().getAttributeValue("alt", ""));
        if (zzzig.zzZ2B().zzL6(NoteMeta.PROPERTY_TITLE) != null) {
            shapeInsertImage.setShapeAttr(EditingLanguage.GERMAN_LUXEMBOURG, zzzig.zzZ2B().getAttributeValue(NoteMeta.PROPERTY_TITLE, ""));
        }
        if (shapeInsertImage.zzZYh().getBorder().isVisible()) {
            shapeInsertImage.zzZYh().remove(StyleIdentifier.LIST_TABLE_4_ACCENT_5);
        }
        this.zzYnb.zzW(shapeInsertImage);
        String strZzSF = this.zzYnb.zzZUC().zzSF("-aw-wrap-type");
        RefInt refInt = new RefInt(0);
        boolean z = !com.aspose.words.internal.zzZKN.equals(strZzSF, "") && zzZDY.zzV(strZzSF, refInt);
        int i = refInt.get();
        if (z) {
            shapeInsertImage.setWrapType(i);
            String strZzSF2 = this.zzYnb.zzZUC().zzSF("-aw-rel-hpos");
            RefInt refInt2 = new RefInt(0);
            boolean z2 = !com.aspose.words.internal.zzZKN.equals(strZzSF2, "") && zzZDY.zzU(strZzSF2, refInt2);
            int i2 = refInt2.get();
            if (z2) {
                shapeInsertImage.setRelativeHorizontalPosition(i2);
            }
            String strZzSF3 = this.zzYnb.zzZUC().zzSF("-aw-rel-vpos");
            RefInt refInt3 = new RefInt(0);
            boolean z3 = !com.aspose.words.internal.zzZKN.equals(strZzSF3, "") && zzZDY.zzT(strZzSF3, refInt3);
            int i3 = refInt3.get();
            if (z3) {
                shapeInsertImage.setRelativeVerticalPosition(i3);
            }
            double dZzSH = this.zzYnb.zzZUC().zzSH("-aw-top-pos");
            if (!com.aspose.words.internal.zzAN.zzZC(dZzSH)) {
                shapeInsertImage.setTop(dZzSH);
            }
            double dZzSH2 = this.zzYnb.zzZUC().zzSH("-aw-left-pos");
            if (!com.aspose.words.internal.zzAN.zzZC(dZzSH2)) {
                shapeInsertImage.setLeft(dZzSH2);
            }
        }
        if (!shapeInsertImage.isInline() && (zzzigZzZ0e = zzzig.zzZ0e()) != null && "a".equals(zzzigZzZ0e.getName())) {
            String strZzJT = zzZDY.zzJT(zzzigZzZ0e.zzZ2B().getAttributeValue("href", ""));
            if (com.aspose.words.internal.zzZYD.zzXk(strZzJT)) {
                shapeInsertImage.setHRef(strZzJT);
            }
        }
        if (this.zzZwh.getCurrentParagraph().isInCell() && com.aspose.words.internal.zzAN.zzZD(this.zzZwh.getCurrentParagraph().getParagraphFormat().getLineSpacing()) && this.zzZwh.getCurrentParagraph().getParagraphFormat().getLineSpacingRule() == 2) {
            this.zzZwh.getCurrentParagraph().getParagraphFormat().setLineSpacing(12.0d);
        }
    }

    private void zzZ(Shape shape, byte[] bArr, zzYB5 zzyb5) throws Exception {
        if (bArr == null) {
            zzZH0 zzzh0 = new zzZH0(null, null, this.zzYnb.zzZUC());
            if (zzzh0.zzZ1A() > 0.0d || zzzh0.zzZ1z() > 0.0d) {
                shape.zze(zzzh0.zzZ1A(), zzzh0.zzZ1z());
                return;
            }
            return;
        }
        com.aspose.words.internal.zzEG zzegZzZT = com.aspose.words.internal.zzEF.zzZT(bArr);
        if (zzyb5 == null) {
            zzyb5 = zzS(zzegZzZT);
        }
        zzYB5 zzyb5Zzv = zzv(shape);
        if (zzyb5Zzv == null) {
            zzyb5Zzv = zzYBZ.zzX(shape, (Paragraph) shape.getAncestor(8));
        }
        zzZH0 zzzh02 = new zzZH0(zzyb5, zzyb5Zzv, this.zzYnb.zzZUC());
        zzYB5 zzyb5ZzZ1C = zzzh02.zzZ1C();
        if (zzyb5ZzZ1C != null && zzzh02.zzZ1B()) {
            shape.zze(zzyb5ZzZ1C.getWidth(), zzyb5ZzZ1C.getHeight());
            return;
        }
        if (!this.zzYmR.zzYmK) {
            if (zzegZzZT != null) {
                if (com.aspose.words.internal.zzAN.zzQ(zzegZzZT.getHorizontalResolution(), 96.0d, 1.0d) && com.aspose.words.internal.zzAN.zzQ(zzegZzZT.getVerticalResolution(), 96.0d, 1.0d)) {
                    return;
                }
                shape.zze((((double) zzegZzZT.getWidth()) / 96.0d) * 72.0d, (((double) zzegZzZT.getHeight()) / 96.0d) * 72.0d);
                return;
            }
            return;
        }
        if (zzyb5 == null || zzegZzZT == null) {
            return;
        }
        if (com.aspose.words.internal.zzAN.zzQ(zzyb5.getWidth(), shape.getWidth(), 1.0d) && com.aspose.words.internal.zzAN.zzQ(zzyb5.getHeight(), shape.getHeight(), 1.0d)) {
            return;
        }
        shape.zze(zzegZzZT.getWidthPoints(), zzegZzZT.getHeightPoints());
    }

    private boolean zzZ(zzZEC zzzec) {
        if (!this.zzYnb.zzZUO() && !this.zzYnb.zzZUM()) {
            return zzZDY.zzn(zzzec.getText(), !this.zzYnb.zzZUN());
        }
        com.aspose.words.internal.zzZYD.zzXk(zzzec.getText());
        return true;
    }
}
