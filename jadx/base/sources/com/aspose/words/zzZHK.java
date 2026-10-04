package com.aspose.words;

import com.facebook.common.callercontext.ContextChain;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.google.mlkit.p567nl.translate.TranslateLanguage;
import com.orion.notein.domain.models.note.NoteMeta;

/* JADX INFO: loaded from: classes6.dex */
final class zzZHK {
    private StringBuilder zz8Y = new StringBuilder();
    private com.aspose.words.internal.zzZO0 zzMW;
    private com.aspose.words.internal.zzIM<String> zzYpT;
    private boolean zzYpU;
    private int zzYpV;
    private com.aspose.words.internal.zzRK zzYzJ;
    private static com.aspose.words.internal.zzZNR zzYpX = new com.aspose.words.internal.zzZNR("^['\"]?([^'\"; ]*)", 66);
    private static com.aspose.words.internal.zzZNR zzYpW = new com.aspose.words.internal.zzZNR("charset=([^'\"; ]*)", 66);
    private static final com.aspose.words.internal.zzZHW zzUR = new com.aspose.words.internal.zzZHW("?xml", "!doctype", "html", "head", NoteMeta.PROPERTY_TITLE, "meta", "/head", "body", "script", "!--", "style", "", "table", TranslateLanguage.TURKISH, "td", "h1", "h2", "h3", "h4", "h5", "h6", "div", ContextChain.TAG_PRODUCT, "img", "ol", "ul");

    public static class zzZ {
        private int mLength;
        private char[] zzYpS;
        private String zzZi;
        private int zzp8;

        public zzZ(String str) {
            com.aspose.words.internal.zzZYD.zzXk(str);
            this.zzZi = str;
            this.zzYpS = new char[str.length()];
        }

        public final boolean zzYS(char c) {
            char[] cArr = this.zzYpS;
            int i = this.zzp8;
            cArr[i] = c;
            this.zzp8 = (i + 1) % cArr.length;
            int i2 = this.mLength + 1;
            this.mLength = i2;
            if (i2 < this.zzZi.length()) {
                return false;
            }
            this.mLength = this.zzZi.length();
            for (int i3 = 0; i3 < this.zzZi.length(); i3++) {
                if (this.zzZi.charAt(i3) != this.zzYpS[(this.zzp8 + i3) % this.zzZi.length()]) {
                    return false;
                }
            }
            return true;
        }
    }

    private zzZHK(com.aspose.words.internal.zzRK zzrk) {
        this.zzYzJ = zzrk;
        com.aspose.words.internal.zzIM<String> zzim = new com.aspose.words.internal.zzIM<>();
        this.zzYpT = zzim;
        zzim.add("head");
        this.zzYpT.add(NoteMeta.PROPERTY_TITLE);
        this.zzYpT.add("body");
    }

    private void zzKG(String str) {
        try {
            com.aspose.words.internal.zzZO0 zzzo0ZzV3 = com.aspose.words.internal.zzZO0.zzV3(str);
            if (zzQ(zzzo0ZzV3)) {
                return;
            }
            this.zzMW = zzzo0ZzV3;
            this.zzYpU = true;
        } catch (IllegalArgumentException unused) {
        }
    }

    private boolean zzKH(String str) throws Exception {
        com.aspose.words.internal.zzZYT<String> zzzytZzZ1Q = zzZ1Q();
        if (zzzytZzZ1Q == null) {
            return false;
        }
        if (this.zzYpT.contains(str)) {
            this.zzYpT.remove(str);
            this.zzYpV++;
            return true;
        }
        int iZzTP = zzUR.zzTP(str);
        if (iZzTP != 0) {
            if (iZzTP == 1) {
                zzU(zzzytZzZ1Q);
            } else if (iZzTP == 2) {
                this.zzYpV = 3;
            } else if (iZzTP != 5) {
                switch (iZzTP) {
                    case 12:
                    case 13:
                    case 14:
                    case 15:
                    case 16:
                    case 17:
                    case 18:
                    case 19:
                    case 20:
                    case 21:
                    case 22:
                    case 23:
                    case 24:
                    case 25:
                        this.zzYpV++;
                    default:
                        return true;
                }
            } else {
                this.zzYpV++;
                if (!this.zzYpU) {
                    zzT(zzzytZzZ1Q);
                }
            }
        } else if (!this.zzYpU) {
            zzV(zzzytZzZ1Q);
        }
        return true;
    }

    private static boolean zzQ(com.aspose.words.internal.zzZO0 zzzo0) {
        return zzzo0.equals(com.aspose.words.internal.zzZO0.zzhS()) || zzzo0.equals(com.aspose.words.internal.zzZO0.zzhU()) || zzzo0.equals(com.aspose.words.internal.zzZO0.zzQz(12001)) || zzzo0.equals(com.aspose.words.internal.zzZO0.zzhT()) || zzzo0.equals(com.aspose.words.internal.zzZO0.zzhW());
    }

    private void zzT(com.aspose.words.internal.zzZYT<String> zzzyt) {
        String str;
        String str2 = (String) com.aspose.words.internal.zzQW.zzZ((com.aspose.words.internal.zzZYT) zzzyt, "http-equiv");
        String str3 = (String) com.aspose.words.internal.zzQW.zzZ((com.aspose.words.internal.zzZYT) zzzyt, "charset");
        if (str3 != null && str2 == null) {
            zzKG(str3);
            this.zzYpV = 3;
            return;
        }
        if (str2 == null || !com.aspose.words.internal.zzZKN.zzX(str2, "content-type", com.aspose.words.internal.zzZOF.ORDINAL_IGNORE_CASE$4894b8c8) || (str = (String) com.aspose.words.internal.zzQW.zzZ((com.aspose.words.internal.zzZYT) zzzyt, FirebaseAnalytics.Param.CONTENT)) == null) {
            return;
        }
        com.aspose.words.internal.zzZNT zzzntZzUX = zzYpX.zzUX(str);
        if (zzzntZzUX.zzhL() && "text/html".equals(com.aspose.words.internal.zzZKN.zzU2(zzzntZzUX.zzhJ().zzQx(1).getValue()))) {
            this.zzYpV = 3;
        }
        com.aspose.words.internal.zzZNT zzzntZzUX2 = zzYpW.zzUX(str);
        if (zzzntZzUX2.zzhL()) {
            zzKG(OooO0O0.OooO00o(zzzntZzUX2, 1));
        }
    }

    private void zzU(com.aspose.words.internal.zzZYT<String> zzzyt) {
        if (zzzyt.getCount() <= 0 || !zzzyt.containsKey("html")) {
            return;
        }
        this.zzYpV++;
    }

    private void zzV(com.aspose.words.internal.zzZYT<String> zzzyt) {
        String str = (String) com.aspose.words.internal.zzQW.zzZ((com.aspose.words.internal.zzZYT) zzzyt, "encoding");
        if (str == null) {
            return;
        }
        zzKG(str);
    }

    private String zzYT(char c) throws Exception {
        char c2;
        this.zz8Y.setLength(0);
        while (this.zzYzJ.zzR2() && (c2 = this.zzYzJ.readChar()) != c) {
            this.zz8Y.append(c2);
        }
        return this.zz8Y.length() > 0 ? this.zz8Y.toString() : "empty";
    }

    public static FileFormatInfo zzZ(com.aspose.words.internal.zzRK zzrk) throws Exception {
        return new zzZHK(zzrk).zzZ1V();
    }

    private boolean zzZ1L() {
        return zzZ1M() || this.zzYpV < 0;
    }

    private boolean zzZ1M() {
        return this.zzYpV >= 3;
    }

    private boolean zzZ1N() throws Exception {
        if (!this.zzYzJ.zzR2()) {
            return false;
        }
        if (this.zzYzJ.readChar() == '>') {
            return true;
        }
        return this.zzYzJ.zzR2() && this.zzYzJ.readChar() == '>';
    }

    private String zzZ1O() throws Exception {
        this.zz8Y.setLength(0);
        while (this.zzYzJ.zzR2()) {
            char c = this.zzYzJ.readChar();
            if (com.aspose.words.internal.zzZYD.zzZ1(c)) {
                break;
            }
            if (c == '/' || c == '>' || c == '=') {
                this.zzYzJ.zzR4();
                break;
            }
            this.zz8Y.append(c);
        }
        return this.zz8Y.toString();
    }

    private String zzZ1P() throws Exception {
        while (this.zzYzJ.zzR2()) {
            char c = this.zzYzJ.readChar();
            if (!com.aspose.words.internal.zzZYD.zzZ1(c)) {
                if (c == '\'' || c == '\"') {
                    return zzYT(c);
                }
                this.zzYzJ.zzR4();
                return zzZ1O();
            }
        }
        return "";
    }

    private com.aspose.words.internal.zzZYT<String> zzZ1Q() throws Exception {
        com.aspose.words.internal.zzZYT<String> zzzyt = new com.aspose.words.internal.zzZYT<>();
        while (true) {
            zzY zzy = new zzY((byte) 0);
            if (!zzZ(zzy)) {
                break;
            }
            zzZ(zzzyt, zzy);
        }
        if (zzZ1N()) {
            return zzzyt;
        }
        return null;
    }

    private boolean zzZ1R() throws Exception {
        while (true) {
            int i = 0;
            while (this.zzYzJ.zzR2()) {
                char c = this.zzYzJ.readChar();
                if (c == '\n' || c == '\r') {
                    this.zzYzJ.zzR6();
                } else if (c == '-') {
                    i++;
                } else if (c == '>' && i >= 2) {
                    return true;
                }
            }
            return false;
        }
    }

    private String zzZ1S() throws Exception {
        char c;
        if (!this.zzYzJ.zzR2()) {
            return "";
        }
        this.zzYzJ.readChar();
        this.zz8Y.setLength(0);
        while (this.zzYzJ.zzR2() && (c = this.zzYzJ.readChar()) != 0) {
            if (c == '>') {
                this.zzYzJ.zzR4();
                return this.zz8Y.toString();
            }
            if (com.aspose.words.internal.zzZYD.zzZ1(c)) {
                return this.zz8Y.toString();
            }
            if (c == '-' && "!-".equals(this.zz8Y.toString())) {
                return "!--";
            }
            this.zz8Y.append(com.aspose.words.internal.zzZYD.zzo(c));
        }
        return "";
    }

    private boolean zzZ1T() throws Exception {
        String strZzZ1S = zzZ1S();
        switch (zzUR.zzTP(strZzZ1S)) {
            case 0:
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
                this.zzYzJ.zzR6();
                break;
            case 6:
            case 7:
                this.zzYzJ.zzR5();
                break;
            case 8:
                return zzZ5("</script>", ";{}");
            case 9:
                return zzZ1R();
            case 10:
                return zzZ5("</style>", ";{},");
            case 11:
                return false;
        }
        return zzKH(strZzZ1S);
    }

    private boolean zzZ1U() throws Exception {
        while (this.zzYzJ.zzR2()) {
            char c = this.zzYzJ.readChar();
            if (c == '<') {
                this.zzYzJ.zzR4();
                return true;
            }
            if (c == '>') {
                return false;
            }
        }
        return false;
    }

    private FileFormatInfo zzZ1V() throws Exception {
        com.aspose.words.internal.zzZO0 zzzo0ZzQZ = this.zzYzJ.zzQZ();
        this.zzMW = zzzo0ZzQZ;
        if (zzQ(zzzo0ZzQZ)) {
            this.zzYpU = true;
        }
        do {
            if ((zzZ1L() && (!zzZ1M() || this.zzYpU)) || !zzZ1U()) {
                break;
            }
        } while (zzZ1T());
        FileFormatInfo fileFormatInfo = new FileFormatInfo();
        if (zzZ1M()) {
            fileFormatInfo.setLoadFormat(50);
        }
        fileFormatInfo.zzZ(this.zzMW);
        return fileFormatInfo;
    }

    private boolean zzZ5(String str, String str2) throws Exception {
        zzZ zzz = new zzZ(str);
        while (this.zzYzJ.zzR2()) {
            char c = this.zzYzJ.readChar();
            if (zzz.zzYS(com.aspose.words.internal.zzZYD.zzo(c))) {
                this.zzYzJ.zzR6();
                return true;
            }
            if (str2.indexOf(c) != -1) {
                this.zzYzJ.zzR6();
            }
        }
        return false;
    }

    private boolean zzZ(zzY zzy) throws Exception {
        String strZzZ1P = zzZ1P();
        zzy.zzYpR = strZzZ1P;
        if ("".equals(strZzZ1P)) {
            return false;
        }
        while (true) {
            if (!this.zzYzJ.zzR2()) {
                break;
            }
            char c = this.zzYzJ.readChar();
            if (!com.aspose.words.internal.zzZYD.zzZ1(c)) {
                if (c != '=') {
                    this.zzYzJ.zzR4();
                    return true;
                }
            }
        }
        zzy.zzYpQ = zzZ1P();
        return true;
    }

    public static class zzY {
        String zzYpQ;
        String zzYpR;

        private zzY() {
            this.zzYpR = "";
            this.zzYpQ = "";
        }

        public /* synthetic */ zzY(byte b) {
            this();
        }
    }

    private void zzZ(com.aspose.words.internal.zzZYT<String> zzzyt, zzY zzy) {
        if ("".equals(zzy.zzYpR)) {
            return;
        }
        String strZzU2 = com.aspose.words.internal.zzZKN.zzU2(zzy.zzYpR);
        String strZzU22 = com.aspose.words.internal.zzZKN.zzU2(zzy.zzYpQ);
        zzzyt.set(strZzU2, strZzU22);
        int i = com.aspose.words.internal.zzZOF.ORDINAL$4894b8c8;
        if (com.aspose.words.internal.zzZKN.zzS(strZzU2, "xmlns:", i)) {
            this.zzYzJ.zzR6();
        }
        if (com.aspose.words.internal.zzZKN.zzS(strZzU22, "data:", i)) {
            this.zzYzJ.zzR6();
        }
    }
}
