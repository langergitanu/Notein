package com.aspose.words;

import androidx.appcompat.view.menu.C21505OooO0Oo;
import com.alibaba.sdk.android.oss.common.RequestParameters;
import com.aspose.words.ref.RefDouble;
import com.aspose.words.ref.RefInt;
import com.facebook.common.callercontext.ContextChain;
import com.google.mlkit.p567nl.translate.TranslateLanguage;
import com.huawei.hms.network.embedded.C18437z2;
import com.orion.notein.domain.models.backup.BackupFile;
import com.orion.notein.domain.models.note.NoteMeta;
import com.orion.notein.richeditor.converter.tagsoup.HTMLWriter;
import com.orion.penkit.tools.DrawToolFactory;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes6.dex */
final class zzYQ7 implements zzZBS {
    private int zzXME;
    private int zzXMF;
    private boolean zzXMG;
    private boolean zzXMH;
    private boolean zzXMK;
    private ArrayList<zzYR5> zzXML;
    private boolean zzXMN;
    private zzZ4Z zzXMP;
    private boolean zzXMQ;
    private boolean zzXMR;
    private boolean zzXMS;
    private zzYP3 zzXMT;
    private ArrayList<Paragraph> zzXMU;
    private boolean zzXMV;
    private boolean zzXMW;
    private boolean zzXMX;
    private String zzXN0;
    private boolean zzXN1;
    private String zzXN2;
    private zzYRV zzXN3;
    private zzYQZ zzXN4;
    private zzYQ9 zzXN5;
    private boolean zzXNk;
    private String zzXOa;
    private zzYPO zzXRj;
    private int zzYHL;
    private zzYQP zzYKO;
    private String zzYL;
    private LoadOptions zzYWO;
    private double zzYZ9;
    private double zzYZa;
    private int zzYog;
    private Document zzZEY;
    private int zzsA;
    private static char[] zzXMB = {'(', ')', '|'};
    private static final com.aspose.words.internal.zzZHW zzUR = new com.aspose.words.internal.zzZHW("border", "border-top", "border-bottom", "border-left", "border-right", "padding", "padding-top", "padding-bottom", "padding-left", "padding-right", "translate", "rotate", "matrix", "scale", "skewX", "skewY", "as-char", "page", "z-index", "transform", "caption-id", "class-names", "layer", "name", "style-name", "text-style-name", "height", "width", "x", "y", "end-cell-address", "end-x", "end-y", "table-background", "anchor-page-number", "id", "glue-point", "event-listeners", "list", ContextChain.TAG_PRODUCT, "g", "a", "frame", "control", "line", "connector", DrawToolFactory.LASSO_TYPE_RECT, "circle", "ellipse", "custom-shape", "polyline", "polygon", "path", "caption", "regular-polygon", "page-thumbnail", "measure", "scene", "href", "target-frame-name", "server-map", NoteMeta.PROPERTY_TITLE, "actuate", "show", C18437z2.f56754h, "application/vnd.oasis.opendocument.text", "application/vnd.oasis.opendocument.text-master", "application/vnd.oasis.opendocument.text-template");
    private HashMap<String, zzYT8> zzXMA = new HashMap<>();
    private HashMap<String, zzYT8> zzXMz = new HashMap<>();
    private com.aspose.words.internal.zzXA<byte[]> zzXMZ = new com.aspose.words.internal.zzXA<>();
    private com.aspose.words.internal.zzZQC<Section> zzXMY = new com.aspose.words.internal.zzZQC<>();
    private boolean zzXMM = true;
    private com.aspose.words.internal.zzD3<zzYT8> zzXMJ = new com.aspose.words.internal.zzD3<>();
    private double zzXMI = 1.0d;
    private double zzXMD = 1.0d;
    private com.aspose.words.internal.zzIM<String> zzXMC = new com.aspose.words.internal.zzIM<>();
    private Map<String, String> zzXMO = new HashMap();

    public zzYQ7(com.aspose.words.internal.zzZOP zzzop, LoadOptions loadOptions, Document document) throws Exception {
        this.zzYKO = new zzYQP(zzzop);
        this.zzYWO = loadOptions;
        this.zzZEY = document;
        zzYuV();
        zzYQO zzyqoZzEn = this.zzYKO.zzEn("/META-INF/documentsignatures.xml");
        if (zzyqoZzEn != null) {
            zzXZ3.zzZ(zzyqoZzEn.zzYvo(), new zzYQ5(this.zzYKO), this.zzZEY.getDigitalSignatures(), loadOptions.getWarningCallback());
        }
    }

    private static void zz4(zzYQ7 zzyq7) {
        zzYQ9 zzyq9 = zzyq7.zzXN5;
        String strZzDo = "";
        String value = "";
        while (zzyq9.zzi()) {
            int iZzTP = zzUR.zzTP(zzyq9.getLocalName());
            if (iZzTP != 23 && iZzTP != 35) {
                switch (iZzTP) {
                    case 58:
                        strZzDo = zzYOU.zzDo(zzyq9.getValue());
                        continue;
                    case 59:
                        value = zzyq9.getValue();
                        continue;
                    case 60:
                    case 61:
                    case 62:
                    case 63:
                    case 64:
                        break;
                    default:
                        zzyq7.zzZ(16777216, false, "draw:a");
                        continue;
                }
            }
            zzyq7.zzZ(256, false, "draw:a");
        }
        zzyq7.zzXOa = strZzDo;
        zzyq7.zzYL = value;
    }

    private void zzE6(String str) throws Exception {
        for (zzYR5 zzyr5 : this.zzXML) {
            if (zzyr5.zzYvH() && zzyr5.isEncrypted()) {
                zzYQO zzyqoZzEn = this.zzYKO.zzEn(zzyr5.zzxf());
                try {
                    zzyqoZzEn.zzF(new com.aspose.words.internal.zzZOR(com.aspose.words.internal.zzZRV.zzZ(zzYS7.zzZ(zzyqoZzEn.zzYvo().zzWy(), str, zzyr5.zzYvI()), zzyr5.getSize(), 0)));
                } catch (Exception unused) {
                    throw new IncorrectPasswordException("The document password is incorrect.");
                }
            }
        }
    }

    public static String zzE7(String str) {
        return com.aspose.words.internal.zzZKN.format("Import of {0} is not supported for this format by Aspose.Words", str);
    }

    public static boolean zzE8(String str) {
        return "glue-point".equals(str) || "event-listeners".equals(str);
    }

    private static int zzE9(String str) {
        switch (zzUR.zzTP(str)) {
            case 65:
            case 66:
                return 60;
            case 67:
                return 61;
            default:
                return 255;
        }
    }

    private static int[] zzEa(String str) {
        String[] strArrZzR = com.aspose.words.internal.zzZKN.zzR(com.aspose.words.internal.zzZKN.zzTX(str), ControlChar.SPACE_CHAR);
        int[] iArr = new int[4];
        for (int i = 0; i < strArrZzR.length && i < 4; i++) {
            int iZzZo = com.aspose.words.internal.zzJB.zzZo(strArrZzR[i]);
            if (iZzZo == Integer.MIN_VALUE) {
                return null;
            }
            iArr[i] = iZzZo;
        }
        return iArr;
    }

    public static void zzQ(zzYQ7 zzyq7, String str) {
        zzYQ9 zzyq9 = zzyq7.zzXN5;
        while (zzyq9.zzi()) {
            if ("version".equals(zzyq9.getLocalName()) || "transformation".equals(zzyq9.getLocalName())) {
                zzyq7.zzZ(65536, false, str);
            }
        }
    }

    private static boolean zzU(zzYQ9 zzyq9) {
        switch (zzUR.zzTP(zzyq9.getLocalName())) {
            case 40:
            case 44:
            case 45:
            case 46:
            case 47:
            case 48:
            case 49:
            case 50:
            case 51:
            case 52:
            case 53:
            case 54:
            case 55:
            case 56:
            case 57:
                return true;
            case 41:
                return "draw".equals(zzyq9.getPrefix());
            case 42:
            case 43:
            default:
                return false;
        }
    }

    private boolean zzW(zzYQ7 zzyq7, zzYC3 zzyc3, String str) {
        zzYQ9 zzyq9 = zzyq7.zzXN5;
        return zzyq7.zzV(zzyq9) || zzyq7.zzZ(zzyq9, zzyc3) || zzX(zzyq7, zzyc3, str);
    }

    private boolean zzX(zzYQ9 zzyq9, zzYC3 zzyc3) {
        if ("width".equals(zzyq9.getLocalName())) {
            double dZzFV = zzYSF.zzFV(zzyq9.getValue());
            this.zzYZ9 = dZzFV;
            zzyc3.zzQ(4131, Double.valueOf(dZzFV));
            return true;
        }
        if (!"height".equals(zzyq9.getLocalName())) {
            return false;
        }
        double dZzFV2 = zzYSF.zzFV(zzyq9.getValue());
        this.zzYZa = dZzFV2;
        zzyc3.zzQ(4132, Double.valueOf(dZzFV2));
        return true;
    }

    private static boolean zzY(zzYQ9 zzyq9, zzYC3 zzyc3) {
        if ("x".equals(zzyq9.getLocalName())) {
            zzyc3.zzQ(4129, Double.valueOf(zzYSF.zzFV(zzyq9.getValue())));
            return true;
        }
        if (!"y".equals(zzyq9.getLocalName())) {
            return false;
        }
        zzyc3.zzQ(4130, Double.valueOf(zzYSF.zzFV(zzyq9.getValue())));
        return true;
    }

    public static int zzYS(com.aspose.words.internal.zzZOP zzzop) throws Exception {
        zzYQ9 zzyq9 = new zzYQ9(zzzop);
        while (zzyq9.zzQ("manifest")) {
            if ("file-entry".equals(zzyq9.getLocalName())) {
                String value = "";
                String value2 = "";
                while (zzyq9.zzi()) {
                    if ("full-path".equals(zzyq9.getLocalName())) {
                        value = zzyq9.getValue();
                    }
                    if (HTMLWriter.MEDIA_TYPE.equals(zzyq9.getLocalName())) {
                        value2 = zzyq9.getValue();
                    }
                }
                if ("/".equals(value)) {
                    return zzE9(value2);
                }
            } else {
                zzyq9.zzk();
            }
        }
        return 255;
    }

    public static boolean zzYT(com.aspose.words.internal.zzZOP zzzop) throws Exception {
        zzYQ9 zzyq9 = new zzYQ9(zzzop);
        while (zzyq9.zzQ("manifest")) {
            if ("file-entry".equals(zzyq9.getLocalName())) {
                while (zzyq9.zzQ("file-entry")) {
                    if ("encryption-data".equals(zzyq9.getLocalName())) {
                        return true;
                    }
                    zzyq9.zzk();
                }
            } else {
                zzyq9.zzk();
            }
        }
        return false;
    }

    private void zzYuV() {
        this.zzXMU = new ArrayList<>();
        this.zzXRj = new zzYPO();
        this.zzXN4 = new zzYQZ(this);
        this.zzXN3 = new zzYRV();
        this.zzYHL = 0;
        this.zzYog = -1;
        this.zzsA = -1;
        this.zzYZ9 = Double.NaN;
        this.zzYZa = Double.NaN;
        this.zzZEY.zzZpV().zzYW4 = EditingLanguage.LUXEMBOUGISH;
        this.zzZEY.zzZpV().zzWD(false);
        this.zzZEY.getSections().clear();
        this.zzZEY.getStyles().zzY36().zzQ(1470, Boolean.FALSE);
        this.zzXRj.clear();
        this.zzXN4.clear();
    }

    private boolean zzYuo() {
        for (zzYR5 zzyr5 : this.zzXML) {
            if (zzyr5.zzYvH() && zzyr5.isEncrypted()) {
                return true;
            }
        }
        return false;
    }

    public static boolean zzZq(com.aspose.words.internal.zzZOP zzzop) throws Exception {
        zzYQ9 zzyq9 = new zzYQ9(zzzop);
        while (zzyq9.zzQ("document-signatures")) {
            if (RequestParameters.SIGNATURE.equals(zzyq9.getLocalName())) {
                return true;
            }
            zzyq9.zzk();
        }
        return false;
    }

    public static int zzZr(com.aspose.words.internal.zzZOP zzzop) throws Exception {
        return zzE9(new com.aspose.words.internal.zzZOO(zzzop).readLine());
    }

    private int zzz(boolean z, boolean z2) {
        return !z ? this.zzXRj.zzYu2() : z2 ? this.zzXRj.zzYu1() : this.zzXRj.zzYu3();
    }

    public final Document getDocument() {
        return this.zzZEY;
    }

    public final String getHRef() {
        return this.zzXOa;
    }

    public final int getOutlineLevel() {
        return this.zzsA;
    }

    public final String getTarget() {
        return this.zzYL;
    }

    @Override // com.aspose.words.zzZBS
    public final boolean isEncrypted() {
        return false;
    }

    public final boolean isListItem() {
        return this.zzXMK;
    }

    public final void setHRef(String str) {
        this.zzXOa = str;
    }

    public final void setOutlineLevel(int i) {
        this.zzsA = i;
    }

    public final void setTarget(String str) {
        this.zzYL = str;
    }

    @Override // com.aspose.words.zzZBS
    public final com.aspose.words.internal.zzZOP zz1x() {
        return null;
    }

    public final void zzA(boolean z, boolean z2) {
        for (int i = 0; i < zzz(z, z2); i++) {
            zzYOY zzyoy = (zzYOY) com.aspose.words.internal.zzZKW.zzZ(zzY(z, z2, i), zzYOY.class);
            if (zzyoy != null) {
                zzYEF zzyefZzZYh = zzyoy.zzZYh();
                if (zzyoy.zzYt0() > 0.0d && zzyefZzZYh != null && !zzyefZzZYh.contains(190)) {
                    zzyefZzZYh.zzQ(190, Integer.valueOf(com.aspose.words.internal.zzAN.zzZG((((double) zzZ(zzyoy)) * zzyoy.zzYt0()) / 100.0d)));
                }
            }
        }
    }

    public final void zzDN(int i) {
        this.zzYHL = i;
    }

    public final void zzE4(String str) {
        this.zzXN0 = str;
    }

    public final void zzE5(String str) {
        this.zzXN2 = str;
    }

    @Override // com.aspose.words.zzZBS
    public final void zzIh() throws Exception {
        zzYR4.zzJ(this);
        if (zzYuo()) {
            if (!com.aspose.words.internal.zzZYD.zzXk(this.zzYWO.getPassword())) {
                throw new IncorrectPasswordException("The document password is not set.");
            }
            zzE6(this.zzYWO.getPassword());
        }
        zzYQW.zzJ(this);
        zzYPW.zzJ(this);
        zzYPK.zzJ(this);
        zzYSI.zzJ(this);
    }

    public final boolean zzR(zzYC3 zzyc3) {
        zzYQ9 zzyq9 = this.zzXN5;
        if ("desc".equals(zzyq9.getLocalName())) {
            zzyc3.zzQ(897, zzyq9.readString());
            return true;
        }
        if (!NoteMeta.PROPERTY_TITLE.equals(zzyq9.getLocalName())) {
            return false;
        }
        zzyc3.zzQ(4157, zzyq9.readString());
        return true;
    }

    public final void zzS6(boolean z) {
        this.zzXMK = z;
    }

    public final void zzS7(boolean z) {
        this.zzXMM = z;
    }

    public final void zzS8(boolean z) {
        this.zzXMN = z;
    }

    public final void zzS9(boolean z) {
        this.zzXMR = z;
    }

    public final void zzSa(boolean z) {
        this.zzXMS = z;
    }

    public final void zzSb(boolean z) {
        this.zzXMV = z;
    }

    public final void zzSc(boolean z) {
        this.zzXMW = z;
    }

    public final void zzSd(boolean z) {
        this.zzXMX = z;
    }

    public final void zzSe(boolean z) {
        this.zzXN1 = z;
    }

    public final void zzSi(boolean z) {
        this.zzXNk = z;
    }

    public final void zzT(zzYQ9 zzyq9) {
        this.zzXN5 = zzyq9;
    }

    public final boolean zzV(zzYQ9 zzyq9) {
        if (!"style-name".equals(zzyq9.getLocalName()) || "presentation".equals(zzyq9.getPrefix())) {
            return false;
        }
        this.zzXN2 = zzYOU.zzDr(zzyq9.getValue());
        return true;
    }

    public final void zzWz(double d) {
        this.zzXMI = 1.0d;
    }

    public final void zzYi(String str, String str2) {
        zzT(16777216, com.aspose.words.internal.zzZKN.format("Tag or attribute with name '{0}' is unexpected for '{1}' element.", str2, str));
    }

    public final Map<String, String> zzYuA() {
        return this.zzXMO;
    }

    public final zzZ4Z zzYuB() {
        return this.zzXMP;
    }

    public final void zzYuC() {
        this.zzXMQ = true;
    }

    public final boolean zzYuD() {
        return this.zzXMQ;
    }

    public final boolean zzYuE() {
        return this.zzXMR;
    }

    public final boolean zzYuF() {
        return this.zzXMS;
    }

    public final zzYP3 zzYuG() {
        return this.zzXMT;
    }

    public final ArrayList<Paragraph> zzYuH() {
        return this.zzXMU;
    }

    public final boolean zzYuI() {
        return this.zzXMV;
    }

    public final boolean zzYuJ() {
        return this.zzXMW;
    }

    public final boolean zzYuK() {
        return this.zzXMX;
    }

    public final com.aspose.words.internal.zzZQC<Section> zzYuL() {
        return this.zzXMY;
    }

    public final com.aspose.words.internal.zzXA<byte[]> zzYuM() {
        return this.zzXMZ;
    }

    public final String zzYuN() {
        return this.zzXN0;
    }

    public final boolean zzYuO() {
        return this.zzXN1;
    }

    public final String zzYuP() {
        return this.zzXN2;
    }

    public final zzYRV zzYuQ() {
        return this.zzXN3;
    }

    public final zzYQZ zzYuR() {
        return this.zzXN4;
    }

    public final zzYPO zzYuS() {
        return this.zzXRj;
    }

    public final zzYQ9 zzYuT() {
        return this.zzXN5;
    }

    public final zzYQP zzYuU() {
        return this.zzYKO;
    }

    public final com.aspose.words.internal.zzIM<String> zzYun() {
        return this.zzXMC;
    }

    public final double zzYup() {
        return this.zzXMD;
    }

    public final int zzYuq() {
        return this.zzXME;
    }

    public final int zzYur() {
        return this.zzXMF;
    }

    public final boolean zzYus() {
        return this.zzXMG;
    }

    public final boolean zzYut() {
        return this.zzXMH;
    }

    public final double zzYuu() {
        return this.zzXMI;
    }

    public final com.aspose.words.internal.zzD3<zzYT8> zzYuv() {
        return this.zzXMJ;
    }

    public final Map<String, zzYT8> zzYuw() {
        return this.zzXN1 ? this.zzXMA : this.zzXMz;
    }

    public final ArrayList<zzYR5> zzYux() {
        return this.zzXML;
    }

    public final boolean zzYuy() {
        return this.zzXMM;
    }

    public final boolean zzYuz() {
        return this.zzXMN;
    }

    public final boolean zzYv3() {
        return this.zzXNk;
    }

    public final LoadOptions zzYyZ() {
        return this.zzYWO;
    }

    public final void zzZ(int i, boolean z, String str, String str2) {
        zzT(i, com.aspose.words.internal.zzZKN.format("Import of '{0}'->'{1}' {2} is not supported for this format by Aspose.Words", str, str2, z ? "element" : "attribute"));
    }

    public final int zzZ0C() {
        return this.zzYog;
    }

    public final void zzZh(ArrayList<zzYR5> arrayList) {
        this.zzXML = arrayList;
    }

    public final int zzZh1() {
        return this.zzYHL;
    }

    public final void zzrM(int i) {
        this.zzYog = i;
    }

    public final void zzv(String str, String str2, String str3) {
        zzT(256, com.aspose.words.internal.zzZKN.format("Import of '{0}' value for '{1}' -> '{2}' attribute is not supported for this format by Aspose.Words", str3, str, str2));
    }

    public final void zzT(int i, String str) {
        LoadOptions loadOptions = this.zzYWO;
        IWarningCallback warningCallback = loadOptions != null ? loadOptions.getWarningCallback() : null;
        if (warningCallback != null) {
            OooO00o.OooO0O0(warningCallback, i, 15, str);
        }
    }

    public static boolean zzZ(zzYQ9 zzyq9, zzYQB zzyqb, zzYMX zzymx) {
        String localName = zzyq9.getLocalName();
        String value = zzyq9.getValue();
        if ("break-before".equals(localName)) {
            if ("page".equals(value)) {
                zzymx.zzQ(EditingLanguage.SLOVENIAN, Boolean.TRUE);
                zzyqb.zzU2(true);
            }
            if ("auto".equals(value)) {
                zzymx.zzQ(EditingLanguage.SLOVENIAN, Boolean.FALSE);
                zzyqb.zzU2(false);
            }
            zzyqb.zzSg("column".equals(value));
            return true;
        }
        if (!"break-after".equals(localName)) {
            return false;
        }
        zzyqb.zzSi("page".equals(value));
        zzyqb.zzSh("column".equals(value));
        return true;
    }

    public final boolean zzV(zzYQ7 zzyq7, zzYC3 zzyc3, String str) {
        zzYQ9 zzyq9 = zzyq7.zzXN5;
        switch (zzUR.zzTP(zzyq9.getLocalName())) {
            case 18:
                zzyc3.zzQ(4154, Integer.valueOf(zzyq9.zzb()));
                return true;
            case 19:
                zzZ(zzyc3, zzyq9.getValue(), str);
                return true;
            case 20:
            case 21:
            case 22:
            case 23:
            case 24:
            case 25:
            case 26:
            case 27:
            case 28:
            case 29:
            case 30:
            case 31:
            case 32:
            case 33:
            case 34:
            case 35:
                zzyq7.zzZ(256, false, str);
                return true;
            default:
                return false;
        }
    }

    private static void zzW(zzYQ7 zzyq7, CompositeNode compositeNode) throws Exception {
        zzYQ9 zzyq9 = zzyq7.zzXN5;
        while (zzyq9.zzQ("a")) {
            switch (zzUR.zzTP(zzyq9.getLocalName())) {
                case 40:
                case 43:
                case 44:
                case 45:
                case 46:
                case 47:
                case 48:
                case 49:
                case 50:
                case 51:
                case 52:
                case 53:
                case 54:
                case 55:
                case 56:
                case 57:
                    zzyq7.zzZ(1, true, "draw:a");
                    break;
                case 41:
                default:
                    zzyq9.zzk();
                    break;
                case 42:
                    zzYRR.zzZ(zzyq7, compositeNode, null);
                    break;
            }
        }
    }

    private static CompositeNode zzY(zzYQ7 zzyq7, CompositeNode compositeNode) {
        zzYQ9 zzyq9 = zzyq7.zzXN5;
        Body body = (Body) com.aspose.words.internal.zzZKW.zzZ(compositeNode, Body.class);
        if (body == null || !zzU(zzyq9)) {
            return compositeNode;
        }
        ArrayList<Paragraph> arrayList = zzyq7.zzXMU;
        if (arrayList.size() == 0) {
            if (body.getLastParagraph() == null) {
                body.appendChild(new Paragraph(zzyq7.zzZEY));
                arrayList.add(body.getLastParagraph());
            }
            return body.getLastParagraph();
        }
        return (CompositeNode) C21505OooO0Oo.OooO00o(1, arrayList);
    }

    public final boolean zzX(zzYQ7 zzyq7, zzYC3 zzyc3, String str) {
        zzYQ9 zzyq9 = zzyq7.zzXN5;
        if (!"anchor-type".equals(zzyq9.getLocalName())) {
            return false;
        }
        int iZzTP = zzUR.zzTP(zzyq9.getValue());
        if (iZzTP == 16) {
            zzyc3.zzQ(EditingLanguage.ARABIC_LIBYA, 0);
        } else if (iZzTP != 17) {
            zzv(str, "text:anchor-type", zzyq9.getValue());
        } else {
            zzyc3.zzQ(914, 1);
        }
        return true;
    }

    public final void zzX(zzYQ7 zzyq7, String str, zzYC3 zzyc3) {
        zzYQ9 zzyq9 = zzyq7.zzXN5;
        while (zzyq9.zzQ(str)) {
            if (!zzR(zzyc3)) {
                switch (zzUR.zzTP(zzyq9.getLocalName())) {
                    case 36:
                    case 37:
                    case 38:
                    case 39:
                        zzyq7.zzZ(1, true, str);
                        break;
                    default:
                        zzyq7.zzXN5.zzk();
                        break;
                }
            }
        }
    }

    public static boolean zzZ(zzYQ9 zzyq9, zzYTH zzyth) {
        String value = zzyq9.getValue();
        int iZzTP = zzUR.zzTP(zzyq9.getLocalName());
        if (iZzTP == 0) {
            zzyth.zzY(zzYTJ.zzZ(zzyth.zzYy8(), value));
            zzyth.zzX(zzYTJ.zzZ(zzyth.zzYy7(), value));
            zzyth.zzW(zzYTJ.zzZ(zzyth.zzYy6(), value));
            zzyth.zzV(zzYTJ.zzZ(zzyth.zzYy5(), value));
            return true;
        }
        if (iZzTP == 1) {
            zzyth.zzY(zzYTJ.zzZ(zzyth.zzYy8(), value));
            return true;
        }
        if (iZzTP == 2) {
            zzyth.zzX(zzYTJ.zzZ(zzyth.zzYy7(), value));
            return true;
        }
        if (iZzTP == 3) {
            zzyth.zzW(zzYTJ.zzZ(zzyth.zzYy6(), value));
            return true;
        }
        if (iZzTP != 4) {
            return false;
        }
        zzyth.zzV(zzYTJ.zzZ(zzyth.zzYy5(), value));
        return true;
    }

    public static boolean zzY(zzYQ7 zzyq7, Shape shape) throws Exception {
        zzYQ9 zzyq9 = zzyq7.zzXN5;
        String localName = zzyq9.getLocalName();
        String prefix = zzyq9.getPrefix();
        if (!"image".equals(localName)) {
            return false;
        }
        zzYTL.zzZ(zzyq7, shape, com.aspose.words.internal.zzZKN.format("{0}:{1}", prefix, localName), true);
        return true;
    }

    private static boolean zzX(zzYQ7 zzyq7, CompositeNode compositeNode) throws Exception {
        if (!"draw".equals(zzyq7.zzXN5.getPrefix())) {
            return false;
        }
        zz4(zzyq7);
        zzW(zzyq7, compositeNode);
        zzyq7.zzXOa = null;
        zzyq7.zzYL = null;
        return true;
    }

    private zzYPP zzY(boolean z, boolean z2, int i) {
        if (!z) {
            return this.zzXRj.zzrD(i);
        }
        if (z2) {
            return this.zzXRj.zzrE(i);
        }
        return this.zzXRj.zzrF(i);
    }

    public static boolean zzZ(zzYQ9 zzyq9, zzYQL zzyql) {
        String value = zzyq9.getValue();
        switch (zzUR.zzTP(zzyq9.getLocalName())) {
            case 5:
                zzyql.zzWD(zzYSF.zzFW(value));
                zzyql.zzWC(zzYSF.zzFW(value));
                zzyql.zzWB(zzYSF.zzFW(value));
                zzyql.zzWA(zzYSF.zzFW(value));
                break;
            case 6:
                zzyql.zzWD(zzYSF.zzFW(value));
                break;
            case 7:
                zzyql.zzWC(zzYSF.zzFW(value));
                break;
            case 8:
                zzyql.zzWB(zzYSF.zzFW(value));
                break;
            case 9:
                zzyql.zzWA(zzYSF.zzFW(value));
                break;
        }
        return true;
    }

    private boolean zzZ(zzYQ9 zzyq9, zzYC3 zzyc3) {
        return zzX(zzyq9, zzyc3) || zzY(zzyq9, zzyc3);
    }

    private void zzZ(zzYC3 zzyc3, String str, String str2) {
        if (com.aspose.words.internal.zzZYD.zzXk(str)) {
            String[] strArrZzU = com.aspose.words.internal.zzZKN.zzU(str.replace(" ", "").replace("cm", "cm|").replace("mm", "mm|").replace(BackupFile.EXTENSION_NOTEIN_FILE, "in|").replace(TranslateLanguage.PORTUGUESE, "pt|").replace("pc", "pc|").replace("px", "px|"), zzXMB);
            Object objZzPk = zzyc3.zzPk(4129);
            Object objZzPk2 = zzyc3.zzPk(4130);
            Object objZzPk3 = zzyc3.zzPk(4);
            double dDoubleValue = objZzPk == null ? 0.0d : ((Double) objZzPk).doubleValue();
            double dDoubleValue2 = objZzPk2 == null ? 0.0d : ((Double) objZzPk2).doubleValue();
            double dIntValue = objZzPk3 != null ? ((double) ((Integer) objZzPk3).intValue()) / 65536.0d : 0.0d;
            int i = 0;
            while (i < strArrZzU.length) {
                RefInt refInt = new RefInt(i);
                RefDouble refDouble = new RefDouble(dDoubleValue);
                RefDouble refDouble2 = new RefDouble(dDoubleValue2);
                RefDouble refDouble3 = new RefDouble(dIntValue);
                zzZ(str2, strArrZzU, refInt, refDouble, refDouble2, refDouble3);
                int i2 = refInt.get();
                double d = refDouble.get();
                i = i2 + 1;
                dDoubleValue2 = refDouble2.get();
                dIntValue = refDouble3.get();
                dDoubleValue = d;
            }
            zzyc3.zzQ(4129, Double.valueOf(dDoubleValue));
            zzyc3.zzQ(4130, Double.valueOf(dDoubleValue2));
            zzyc3.zzQ(4, Integer.valueOf(com.aspose.words.internal.zzSA.zzl(dIntValue)));
        }
    }

    private void zzZ(String str, String[] strArr, RefInt refInt, RefDouble refDouble, RefDouble refDouble2, RefDouble refDouble3) {
        String str2 = strArr[refInt.get()];
        if (com.aspose.words.internal.zzZYD.zzXk(str2)) {
            switch (zzUR.zzTP(str2)) {
                case 10:
                    refDouble.set(refDouble.get() + zzYSF.zzFV(strArr[refInt.set(refInt.get() + 1)]));
                    refDouble2.set(refDouble2.get() + zzYSF.zzFV(strArr[refInt.set(refInt.get() + 1)]));
                    break;
                case 11:
                    refDouble3.set(((-(com.aspose.words.internal.zzJB.parseDouble(strArr[refInt.set(refInt.get() + 1)]) * 180.0d)) / 3.141592653589793d) + refDouble3.get());
                    break;
                case 12:
                case 13:
                case 14:
                case 15:
                    zzT(256, com.aspose.words.internal.zzZKN.format("Import of '{0}' transformation for '{1}' -> 'draw:transform' attribute is not supported for this format by Aspose.Words", str2, str));
                    break;
            }
        }
    }

    public final void zzZ(zzYQ9 zzyq9, zzYC3 zzyc3, String str) {
        while (zzyq9.zzi()) {
            zzW(this, zzyc3, str);
        }
        zzyq9.zzj();
    }

    public static boolean zzZ(zzYQ9 zzyq9, zzYPP zzypp) {
        if ("name".equals(zzyq9.getLocalName())) {
            zzypp.setName(zzYOU.zzDr(zzyq9.getValue()));
            return true;
        }
        if (!"display-name".equals(zzyq9.getLocalName())) {
            return false;
        }
        zzypp.setDisplayName(zzyq9.getValue());
        return true;
    }

    public static boolean zzZ(zzYQ9 zzyq9, zzYR2 zzyr2) {
        zzYOT zzyotZzYvB = zzyr2.zzYvB();
        zzYRF zzyrfZzYvC = zzyr2.zzYvC();
        if (zzZ(zzyq9, zzyotZzYvB) || zzZ(zzyq9, zzyrfZzYvC)) {
            return true;
        }
        if (!"margin".equals(zzyq9.getLocalName())) {
            return false;
        }
        double dZzFW = zzYSF.zzFW(zzyq9.getValue());
        zzyotZzYvB.zzWw(dZzFW);
        zzyotZzYvB.zzWv(dZzFW);
        zzyrfZzYvC.zzWF(dZzFW);
        zzyrfZzYvC.zzWE(dZzFW);
        return true;
    }

    private static boolean zzZ(zzYQ9 zzyq9, zzYRF zzyrf) {
        if ("margin-left".equals(zzyq9.getLocalName())) {
            zzyrf.zzWF(zzYSF.zzFW(zzyq9.getValue()));
            return true;
        }
        if (!"margin-right".equals(zzyq9.getLocalName())) {
            return false;
        }
        zzyrf.zzWE(zzYSF.zzFW(zzyq9.getValue()));
        return true;
    }

    private static boolean zzZ(zzYQ9 zzyq9, zzYOT zzyot) {
        if ("margin-top".equals(zzyq9.getLocalName())) {
            zzyot.zzWw(zzYSF.zzFW(zzyq9.getValue()));
            return true;
        }
        if (!"margin-bottom".equals(zzyq9.getLocalName())) {
            return false;
        }
        zzyot.zzWv(zzYSF.zzFW(zzyq9.getValue()));
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0043 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0045 A[EDGE_INSN: B:23:0x0045->B:19:0x0045 BREAK  A[LOOP:0: B:3:0x0006->B:25:?], SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private int zzZ(zzYOY zzyoy) {
        String strZzYu5 = zzyoy.zzYu5();
        int size = -1;
        do {
            zzYOY zzyoy2 = (zzYOY) this.zzXRj.zzYh(strZzYu5, zzyoy.getFamily());
            if (zzyoy2 == null) {
                return 20;
            }
            zzYEF zzyefZzZYh = zzyoy2.zzZYh();
            if (zzyefZzZYh != null && zzyefZzZYh.contains(190)) {
                size = zzyefZzZYh.getSize();
            } else {
                if (!"Standard".equals(strZzYu5)) {
                    strZzYu5 = zzyoy2.zzYu5();
                }
                if (com.aspose.words.internal.zzZYD.zzXk(zzyoy2.getName())) {
                    break;
                }
            }
            strZzYu5 = null;
            if (com.aspose.words.internal.zzZYD.zzXk(zzyoy2.getName())) {
            }
        } while (size == -1);
        if (size == -1) {
            return 20;
        }
        return size;
    }

    public static void zzZ(Inline inline, Style style) {
        if (style != null) {
            inline.getFont().zzBl(style.zzZ7j());
        }
    }

    public final void zzZ(CompositeNode compositeNode, Shape shape) {
        if (shape.getParentNode() != null) {
            return;
        }
        if (this.zzXMU.size() > 0) {
            if (((Paragraph) C21505OooO0Oo.OooO00o(1, this.zzXMU)).zzYBd() instanceof Shape) {
                Paragraph paragraph = new Paragraph(this.zzZEY);
                paragraph.appendChild(shape);
                this.zzXMU.add(paragraph);
                return;
            }
            ((Paragraph) C21505OooO0Oo.OooO00o(1, this.zzXMU)).appendChild(shape);
            return;
        }
        if (compositeNode != null && !(compositeNode instanceof Body)) {
            compositeNode.appendChild(shape);
            return;
        }
        Paragraph paragraph2 = new Paragraph(this.zzZEY);
        paragraph2.appendChild(shape);
        this.zzXMU.add(paragraph2);
        if (compositeNode != null) {
            compositeNode.appendChild((Node) C21505OooO0Oo.OooO00o(1, this.zzXMU));
        }
    }

    public final void zzZ(zzYP3 zzyp3) {
        this.zzXMT = zzyp3;
    }

    public final void zzZ(zzZ4Z zzz4z) {
        this.zzXMP = zzz4z;
    }

    public final void zzZ(int i, boolean z, String str) {
        zzZ(i, z, str, com.aspose.words.internal.zzZKN.format("{0}:{1}", this.zzXN5.getPrefix(), this.zzXN5.getLocalName()));
    }

    public static boolean zzZ(zzYQ7 zzyq7, CompositeNode compositeNode, zzYEF zzyef, Style style, String str) throws Exception {
        String localName = zzyq7.zzXN5.getLocalName();
        CompositeNode compositeNodeZzY = zzY(zzyq7, compositeNode);
        switch (zzUR.zzTP(localName)) {
            case 40:
                zzYRQ.zzZ(zzyq7, compositeNodeZzY, zzyef);
                return true;
            case 41:
                return zzX(zzyq7, compositeNodeZzY);
            case 42:
                zzYRR.zzZ(zzyq7, compositeNodeZzY, zzyef);
                return true;
            case 43:
                zzYSG.zzZ(zzyq7, compositeNodeZzY, zzyef, style);
                return true;
            case 44:
                zzYRB.zzZ(zzyq7, compositeNodeZzY, zzyef, localName);
                return true;
            case 45:
                zzYSJ.zzZ(zzyq7, compositeNodeZzY, zzyef);
                return true;
            case 46:
                zzYQ6.zzZ(zzyq7, compositeNodeZzY, zzyef);
                return true;
            case 47:
            case 48:
                zzYS8.zzZ(zzyq7, compositeNodeZzY, zzyef, localName);
                return true;
            case 49:
            case 50:
            case 51:
                if (zzyq7.zzXMN) {
                    return false;
                }
                new zzYSE(zzyq7).zzZ(compositeNodeZzY, zzyef, localName);
                return true;
            case 52:
                new zzYQ8(zzyq7).zzZ(compositeNodeZzY, zzyef);
                return true;
            case 53:
                zzYTF.zzZ(zzyq7, compositeNodeZzY, zzyef);
                return true;
            case 54:
            case 55:
            case 56:
            case 57:
                zzyq7.zzZ(1, true, str);
                return true;
            default:
                return false;
        }
    }

    public final void zzZ(String str, boolean z, boolean z2, zzYC3 zzyc3) {
        int[] iArrZzEa;
        char c;
        int[] iArr;
        this.zzXMH = false;
        this.zzXMG = false;
        this.zzXMD = 1.0d;
        if (com.aspose.words.internal.zzZYD.zzXk(str) && (iArrZzEa = zzEa(str)) != null) {
            int i = iArrZzEa[2];
            int i2 = i - iArrZzEa[0];
            int i3 = iArrZzEa[3];
            int i4 = i3 - iArrZzEa[1];
            this.zzXMF = i;
            this.zzXME = i3;
            if (i4 > 0) {
                double d = i2;
                double d2 = i4;
                double d3 = d / d2;
                iArr = iArrZzEa;
                c = 0;
                double d4 = this.zzYZ9 / this.zzYZa;
                if (!z || d3 >= d4) {
                    i2 = i2;
                } else {
                    i2 = (int) (d * d4);
                    this.zzXMD = d4;
                    this.zzXMH = true;
                }
                if (z2 && d3 > d4) {
                    i4 = (int) (d2 / d4);
                    this.zzXMD = d4;
                    this.zzXMG = true;
                }
            } else {
                c = 0;
                iArr = iArrZzEa;
            }
            double dZzWt = zzYOU.zzWt(i2, i4);
            this.zzXMI = dZzWt;
            int iZzR = zzYOU.zzR(i2, dZzWt);
            int iZzR2 = zzYOU.zzR(i4, this.zzXMI);
            zzyc3.zzQ(4125, Integer.valueOf(iArr[c]));
            zzyc3.zzQ(4126, Integer.valueOf(iArr[1]));
            zzyc3.zzQ(4127, Integer.valueOf(iZzR));
            zzyc3.zzQ(4128, Integer.valueOf(iZzR2));
        }
    }

    public static boolean zzZ(zzYQ7 zzyq7, Shape shape) throws Exception {
        String localName = zzyq7.zzXN5.getLocalName();
        if (ContextChain.TAG_PRODUCT.equals(localName)) {
            zzYQC.zzZ(zzyq7, localName, shape);
            return true;
        }
        if (!"list".equals(localName)) {
            return false;
        }
        zzYR8.zzZ(zzyq7, shape, null);
        return true;
    }
}
