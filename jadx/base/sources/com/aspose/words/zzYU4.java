package com.aspose.words;

import com.facebook.common.callercontext.ContextChain;
import com.google.mlkit.p567nl.translate.TranslateLanguage;
import com.huawei.hms.network.embedded.C18437z2;
import com.microsoft.identity.common.java.telemetry.TelemetryEventStrings;
import com.orion.notein.domain.models.backup.BackupFile;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes6.dex */
class zzYU4 extends com.aspose.words.internal.zzO {
    private static final com.aspose.words.internal.zzZHW zzUR = new com.aspose.words.internal.zzZHW(TelemetryEventStrings.Value.TRUE, "t", TelemetryEventStrings.Value.FALSE, "f", "font", "char", "val", "sz", "space", "color", "shadow", "frame", "themeColor", "themeShade", "themeTint", "bdrwidth", "fill", "themeFill", "themeFillShade", "themeFillTint", "w", C18437z2.f56754h, BackupFile.EXTENSION_NOTEIN_FILE, TranslateLanguage.PORTUGUESE, "mm", "cm", "pc", ContextChain.TAG_PRODUCT_AND_INFRA, "", "UL");
    private static com.aspose.words.internal.zzZNR zzXSn;
    private HashMap<ShapeBase, String> zzXSo;
    private com.aspose.words.internal.zzZQC<zzZMM> zzXSp;
    private Node zzXSq;
    private int zzXSr;
    private StringBuilder zzXSs;
    String zzXSt;
    private com.aspose.words.internal.zzZQC<Node> zzYR5;
    private IWarningCallback zzZG0;
    private int zzu;

    public zzYU4(com.aspose.words.internal.zzZOP zzzop) throws Exception {
        this(zzzop, (IWarningCallback) null, 14);
    }

    public static boolean zzGX(String str) {
        if ("on".equals(str) || "1".equals(str) || TelemetryEventStrings.Value.TRUE.equals(str) || "t".equals(str)) {
            return true;
        }
        if ("off".equals(str) || "0".equals(str) || TelemetryEventStrings.Value.FALSE.equals(str) || "f".equals(str)) {
            return false;
        }
        throw new IllegalStateException("Unknown value for an 'onOffType' attribute.");
    }

    public static boolean zzGY(String str) {
        if (!com.aspose.words.internal.zzZYD.zzXk(str) || com.aspose.words.internal.zzZYD.isDigit(str.charAt(str.length() - 1))) {
            return false;
        }
        if (zzXSn == null) {
            zzXSn = new com.aspose.words.internal.zzZNR("-?[0-9]+(\\.[0-9]+)?(mm|cm|in|pt|pc|pi)", 0);
        }
        return zzXSn.zzUV(str);
    }

    private static boolean zzGZ(String str) {
        return str.length() > 0 && androidx.core.content.OooO0O0.OooO00o(1, str) == '%';
    }

    public static int zzQ(String str, zzYO3 zzyo3) {
        if (!zzGZ(str)) {
            return com.aspose.words.internal.zzJB.zzZv(str);
        }
        if (zzyo3 != null) {
            zzyo3.zzYrc();
        }
        return com.aspose.words.internal.zzAN.zzZG(com.aspose.words.internal.zzJB.parseDouble(str.substring(0, str.length() - 1)));
    }

    public static double zzR(String str, zzYO3 zzyo3) {
        return zzY(str, 9, null);
    }

    private void zzYyG() {
        zzZ(16777216, 14, com.aspose.words.internal.zzZKN.format("Unexpected attribute '{0}' is occurred while reading document, ignored.", getLocalName()));
    }

    private static int zzZg(String str, int i) {
        switch (zzUR.zzTP(str)) {
            case 22:
                return 3;
            case 23:
                return 2;
            case 24:
                return 4;
            case 25:
                return 5;
            case 26:
            case 27:
                return 1;
            case 28:
                return i;
            case 29:
                return 0;
            default:
                throw new IllegalArgumentException("Specified argument was out of the range of valid values.\r\nParameter name: " + com.aspose.words.internal.zzZKN.format("Unknown universal measure {0}", str));
        }
    }

    public final IWarningCallback getWarningCallback() {
        return this.zzZG0;
    }

    @Override // com.aspose.words.internal.zzO
    public final boolean zz8() {
        return zzGX(getValue());
    }

    public final char zzG(zzYEF zzyef) {
        char cZzGU = 61695;
        String value = "Symbol";
        while (zzi()) {
            int iZzTP = zzUR.zzTP(getLocalName());
            if (iZzTP == 4) {
                value = getValue();
            } else if (iZzTP != 5) {
                zzYyG();
            } else {
                cZzGU = (char) zzYU3.zzGU(getValue());
            }
        }
        zzyef.zzBp(value);
        return cZzGU;
    }

    public final double zzS(String str, zzYO3 zzyo3) {
        double dZzY = zzY(zzV(str, null), 9, zzyo3);
        if (Double.isNaN(dZzY)) {
            return 0.0d;
        }
        return dZzY;
    }

    public final boolean zzSv(boolean z) {
        int iZzTP = zzUR.zzTP(readString());
        if (iZzTP == 0 || iZzTP == 1) {
            return true;
        }
        if (iZzTP == 2 || iZzTP == 3) {
            return false;
        }
        return z;
    }

    public final void zzSw(boolean z) {
        super.zzk();
        zzZ(16777216, z ? 9 : 13, this.zzZG0 != null ? com.aspose.words.internal.zzZKN.format("Unexpected element '{0}' is occurred while reading document, ignored.", getLocalName()) : null);
    }

    public final void zzT(int i, int i2, String str) {
        super.zzk();
        zzZ(i, i2, str);
    }

    public final PreferredWidth zzU(zzYO3 zzyo3) {
        if ("nil".equals(zzV(C18437z2.f56754h, "nil"))) {
            return null;
        }
        return zzX(zzyo3);
    }

    public final int zzV(zzYO3 zzyo3) {
        return com.aspose.words.internal.zzAN.zzZG(zzZ(zzV("val", null), 7, zzyo3));
    }

    public final void zzW(zzZMM zzzmm) {
        this.zzXSp.push(zzzmm);
    }

    public final PreferredWidth zzX(zzYO3 zzyo3) {
        boolean zZzGZ = false;
        boolean z = false;
        boolean z2 = false;
        int iZzT = 0;
        int iZzAL = 1;
        while (zzi()) {
            int iZzTP = zzUR.zzTP(getLocalName());
            if (iZzTP == 20) {
                zZzGZ = zzGZ(getValue());
                z2 = !zZzGZ && zzGY(getValue());
                if (z2) {
                    iZzT = zzT(zzyo3);
                    if (zzyo3 != null) {
                        zzyo3.zzYrc();
                    }
                } else if (zZzGZ) {
                    iZzT = com.aspose.words.internal.zzAN.zzZG(com.aspose.words.internal.zzJB.parseDouble(getValue().substring(0, getValue().length() - 1)) * 50.0d);
                    if (zzyo3 != null) {
                        zzyo3.zzYrc();
                    }
                } else {
                    iZzT = com.aspose.words.internal.zzJB.zzZu(getValue());
                }
            } else if (iZzTP != 21) {
                zzYyG();
            } else {
                iZzAL = zzY8T.zzAL(getValue());
                z = true;
            }
        }
        if (zZzGZ) {
            iZzAL = 2;
        } else if (!z || (z2 && (iZzAL == 2 || iZzAL == 0))) {
            iZzAL = 3;
        }
        return PreferredWidth.zzW6(iZzAL, iZzT);
    }

    public final void zzXy(Node node) {
        this.zzXSq = node;
    }

    public final int zzY(zzYO3 zzyo3) {
        return zzX(zzyo3).zzYmE();
    }

    public final Shading zzYyA() {
        Shading shading = new Shading();
        while (zzi()) {
            switch (zzUR.zzTP(getLocalName())) {
                case 6:
                    shading.setTexture(zzY8T.zzAK(getValue()));
                    break;
                case 7:
                case 8:
                case 10:
                case 11:
                case 15:
                default:
                    zzYyG();
                    break;
                case 9:
                    shading.zzZJ(zzYU3.zzGR(getValue()));
                    break;
                case 12:
                    shading.zzBb(getValue());
                    break;
                case 13:
                    shading.zzTe(getValue());
                    break;
                case 14:
                    shading.zzTd(getValue());
                    break;
                case 16:
                    shading.zzZK(zzYU3.zzGR(getValue()));
                    break;
                case 17:
                    shading.zzBa(getValue());
                    break;
                case 18:
                    shading.zzB9(getValue());
                    break;
                case 19:
                    shading.zzB8(getValue());
                    break;
            }
        }
        return shading;
    }

    public final Border zzYyB() {
        Border border = new Border();
        boolean zEquals = true;
        while (zzi()) {
            switch (zzUR.zzTP(getLocalName())) {
                case 6:
                    if ("nil".equals(getValue())) {
                        return Border.zz8G();
                    }
                    border.zzOV(zzZk6());
                    break;
                case 7:
                    border.zzOU(zzb());
                    break;
                case 8:
                    border.zzOT(zzb());
                    break;
                case 9:
                    zEquals = "auto".equals(getValue());
                    border.zzm(zzYU3.zzGR(getValue()));
                    break;
                case 10:
                    border.setShadow(zzGX(getValue()));
                    break;
                case 11:
                    border.zzYO(zzGX(getValue()));
                    break;
                case 12:
                    border.zzTf(getValue());
                    break;
                case 13:
                    border.zzTe(getValue());
                    break;
                case 14:
                    border.zzTd(getValue());
                    break;
                case 15:
                    zzZ(65536, 14, com.aspose.words.internal.zzZKN.format("Attribute with name '{0}' is not supported.", getLocalName()));
                    break;
                default:
                    zzYyG();
                    break;
            }
        }
        if (border.getLineStyle() == 0 && !zEquals) {
            border.zzYN(true);
        }
        return border;
    }

    public final zzZU zzYyC() {
        String strZzV = zzV("val", null);
        return com.aspose.words.internal.zzZYD.zzXk(strZzV) ? zzZU.zzYW(zzGX(strZzV)) : zzZU.zzZF6;
    }

    public final boolean zzYyD() {
        String strZzV = zzV("val", null);
        if (com.aspose.words.internal.zzZYD.zzXk(strZzV)) {
            return zzGX(strZzV);
        }
        return true;
    }

    public final int zzYyE() {
        String strZzV = zzV("val", null);
        if (com.aspose.words.internal.zzZYD.zzXk(strZzV)) {
            return com.aspose.words.internal.zzJB.zzZv(strZzV);
        }
        return 0;
    }

    public boolean zzYyF() {
        throw new IllegalStateException("Abstract implementation is called.");
    }

    public final void zzYyH() {
        super.zzk();
    }

    public final HashMap<ShapeBase, String> zzYyt() {
        return this.zzXSo;
    }

    public final Node zzYyu() {
        return this.zzXSq;
    }

    public final void zzYyv() {
        this.zzXSp.pop();
    }

    public final zzZMM zzYyw() {
        if (this.zzXSp.size() > 0) {
            return this.zzXSp.peek();
        }
        return null;
    }

    public final int zzYyx() {
        return this.zzXSr;
    }

    public final com.aspose.words.internal.zzZQC<Node> zzYyy() {
        return this.zzYR5;
    }

    public final StringBuilder zzYyz() {
        return this.zzXSs;
    }

    public final void zzZ(int i, int i2, String str) {
        IWarningCallback iWarningCallback = this.zzZG0;
        if (iWarningCallback != null) {
            OooO00o.OooO0O0(iWarningCallback, i, i2, str);
        }
    }

    public int zzZk6() {
        return 0;
    }

    @Override // com.aspose.words.internal.zzO
    public final void zzk() {
        zzT(65536, this.zzu, this.zzZG0 != null ? com.aspose.words.internal.zzZKN.format("Import of element '{0}' is not supported in {1} format by Aspose.Words.", getLocalName(), WarningInfo.zzi9(this.zzu)) : null);
    }

    public final void zzsX(int i) {
        this.zzXSr = i;
    }

    public zzYU4(com.aspose.words.internal.zzZOP zzzop, IWarningCallback iWarningCallback, int i) throws Exception {
        super(zzzop);
        this.zzXSs = new StringBuilder();
        this.zzYR5 = new com.aspose.words.internal.zzZQC<>();
        this.zzXSp = new com.aspose.words.internal.zzZQC<>();
        this.zzXSo = new HashMap<>();
        this.zzZG0 = iWarningCallback;
        this.zzu = i;
    }

    private static double zzY(String str, int i, zzYO3 zzyo3) {
        if (!com.aspose.words.internal.zzZYD.zzXk(str)) {
            return Double.NaN;
        }
        int length = str.length() - 1;
        while (length >= 0 && (str.charAt(length) < '0' || str.charAt(length) > '9')) {
            length--;
        }
        int i2 = length + 1;
        String strSubstring = str.substring(0, i2);
        if (!com.aspose.words.internal.zzZYD.zzXk(strSubstring)) {
            return Double.NaN;
        }
        boolean z = length < str.length() - 1;
        double dZzZs = com.aspose.words.internal.zzJB.zzZs(strSubstring);
        if (Double.isNaN(dZzZs)) {
            return Double.NaN;
        }
        if (!z) {
            dZzZs = com.aspose.words.internal.zzAN.zzZB(dZzZs);
        }
        int iZzZg = zzZg(str.substring(i2, ((str.length() - length) - 1) + i2), i);
        if (iZzZg == 0) {
            return 0.0d;
        }
        double dZzV = zzYU3.zzV(dZzZs, iZzZg, i);
        if (z && zzyo3 != null) {
            zzyo3.zzYrc();
        }
        return dZzV;
    }

    public final int zzR(zzYO3 zzyo3) {
        return com.aspose.words.internal.zzAN.zzZG(zzZ(getValue(), 8, zzyo3));
    }

    public final int zzW(zzYO3 zzyo3) {
        return com.aspose.words.internal.zzAN.zzZG(zzZ(zzV("val", null), 6, zzyo3));
    }

    public final int zzT(zzYO3 zzyo3) {
        return com.aspose.words.internal.zzAN.zzZG(zzZ(getValue(), 7, zzyo3));
    }

    public final int zzS(zzYO3 zzyo3) {
        return com.aspose.words.internal.zzAN.zzZF(zzZ(getValue(), 7, zzyo3));
    }

    public final double zzQ(zzYO3 zzyo3) {
        return zzZ(getValue(), 9, zzyo3);
    }

    private static double zzZ(String str, int i, zzYO3 zzyo3) {
        double dZzY = zzY(str, i, zzyo3);
        if (Double.isNaN(dZzY)) {
            return 0.0d;
        }
        return dZzY;
    }

    public zzYU4(String str, Map<String, String> map) {
        this(str, map, (byte) 0);
    }

    private zzYU4(String str, Map<String, String> map, byte b) {
        super(str, map);
        this.zzXSs = new StringBuilder();
        this.zzYR5 = new com.aspose.words.internal.zzZQC<>();
        this.zzXSp = new com.aspose.words.internal.zzZQC<>();
        this.zzXSo = new HashMap<>();
        this.zzZG0 = null;
        this.zzu = 14;
    }
}
