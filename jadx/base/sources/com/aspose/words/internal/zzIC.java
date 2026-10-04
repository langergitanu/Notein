package com.aspose.words.internal;

import Oooo0oO.o0Oo0oo;
import com.alibaba.sdk.android.oss.common.RequestParameters;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.google.firebase.messaging.Constants;
import com.google.mlkit.p567nl.translate.TranslateLanguage;
import com.huawei.hms.network.embedded.C18437z2;
import com.orion.notein.domain.models.note.NoteMeta;
import com.orion.notein.richeditor.utils.p606io.IOUtils;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes5.dex */
final class zzIC extends zzZVD implements zzFL {
    private zzER<String> zzxA;
    private zzI6 zzxB;
    private String zzxC;
    private zzZWJ zzxD;
    private HashMap<zzI9, String> zzxy;
    private zzER<String> zzxz;

    public zzIC(zzP zzp, zzI6 zzi6) {
        super(zzp, zzi6, 8);
        this.zzxD = null;
        this.zzxA = new zzER<>();
        this.zzxz = new zzER<>();
        this.zzxy = new HashMap<>();
        this.zzxB = zzi6;
    }

    private static String zz2(byte[] bArr) throws Exception {
        return zzZKN.format("data:{0};base64,{1}", zzKE.zzWY(zzEF.zzZU(bArr)), zzZQB.zzYT(bArr));
    }

    private zzI8 zzGa() {
        int fontFormat = this.zzxB.getFontFormat();
        if (fontFormat == 0) {
            return new zzI0();
        }
        if (fontFormat == 1) {
            return new zzI1();
        }
        zzZKN.format("Unknown font format: {0}", Integer.valueOf(this.zzxB.getFontFormat()));
        return null;
    }

    private zzI3 zzGb() {
        return new zzI3(this.zzxB.getPrettyFormat());
    }

    private String zzGc() throws Exception {
        zzI3 zzi3ZzGb = zzGb();
        zzI8 zzi8ZzGa = zzGa();
        for (zzJO zzjo : zzne()) {
            zzi3ZzGb.zzZ0("@font-face");
            zzZ(zzi3ZzGb, zzP(zzjo.zzPl().zzPh(), zzjo.zzPl().getStyle()));
            byte[] bArrZzY = zzi8ZzGa.zzY(zzjo);
            zzi3ZzGb.zzJ("src", zzZKN.format("local('☺'), url('{0}') format('{1}')", this.zzxB.getExportEmbeddedFonts() ? zzZKN.format("data:application/{0};base64,{1}", zzi8ZzGa.getMimeType(), zzZQB.zzYT(bArrZzY)) : zzZ(zzZKN.format("{0}.{1}", zzW7(1), zzi8ZzGa.zzG5()), bArrZzY, true ^ this.zzxB.getExportEmbeddedCss()), zzi8ZzGa.zzG4()));
            zzi3ZzGb.zzFW();
        }
        return zzi3ZzGb.toString();
    }

    private String zzGd() {
        zzI3 zzi3ZzGb = zzGb();
        zzi3ZzGb.zzZ0("." + zzGm());
        zzi3ZzGb.zzJ(RequestParameters.POSITION, "absolute");
        zzi3ZzGb.zzFW();
        zzi3ZzGb.zzZ0("." + zzGl());
        zzi3ZzGb.zzJ(RequestParameters.POSITION, "absolute");
        zzi3ZzGb.zzJ("white-space", "pre");
        zzi3ZzGb.zzJ("color", "#000000");
        zzi3ZzGb.zzJ("font-size", "12pt");
        if (this.zzxB.getUseTargetMachineFonts()) {
            zzi3ZzGb.zzJ("font-kerning", "none");
        }
        zzi3ZzGb.zzFW();
        zzi3ZzGb.zzZ0("." + zzGk());
        zzi3ZzGb.zzJ(RequestParameters.POSITION, "absolute");
        zzi3ZzGb.zzFW();
        zzi3ZzGb.zzZ0("." + zzGj());
        zzi3ZzGb.zzJ(RequestParameters.POSITION, "absolute");
        zzi3ZzGb.zzFW();
        zzi3ZzGb.zzZ0("." + zzGi());
        zzi3ZzGb.zzJ(RequestParameters.POSITION, "relative");
        if (zznh().getShowPageBorder()) {
            zzi3ZzGb.zzJ("border", "solid 1pt black");
        }
        zzZ(zzi3ZzGb);
        zzi3ZzGb.zzJ("overflow", "hidden");
        zzi3ZzGb.zzFW();
        zzi3ZzGb.zzK("print", "");
        zzi3ZzGb.zzZ0("body");
        zzi3ZzGb.zzZ("margin", 0, TranslateLanguage.PORTUGUESE);
        zzi3ZzGb.zzZ("padding", 0, TranslateLanguage.PORTUGUESE);
        zzi3ZzGb.zzFW();
        zzi3ZzGb.zzZ0("." + zzGi());
        zzi3ZzGb.zzJ("page-break-after", "always");
        zzi3ZzGb.zzZ("margin", 0, TranslateLanguage.PORTUGUESE);
        zzi3ZzGb.zzZ("padding", 0, TranslateLanguage.PORTUGUESE);
        zzi3ZzGb.zzFW();
        zzi3ZzGb.zzFX();
        zzZYT<Map.Entry> zzzyt = new zzZYT();
        for (Map.Entry<zzI9, String> entry : this.zzxy.entrySet()) {
            zzzyt.zzB(entry.getValue(), entry.getKey());
        }
        for (Map.Entry entry2 : zzzyt) {
            String str = (String) entry2.getKey();
            zzI9 zzi9 = (zzI9) entry2.getValue();
            zzi3ZzGb.zzZ0(com.alibaba.sdk.android.oss.internal.OooO00o.OooO00o(".", str));
            zzZ(zzi3ZzGb, zzi9);
            zzi3ZzGb.zzFW();
        }
        return zzi3ZzGb.toString();
    }

    private zzZY5 zzGe() {
        zzZY5 zzzy5 = new zzZY5(this.zzxB.zzwx());
        zzzy5.setPrettyFormat(zznh().getPrettyFormat());
        zzzy5.setExportEmbeddedImages(true);
        zzzy5.setShowPageBorder(false);
        zzzy5.zzZx(this.zzxB.getExportEmbeddedSvg());
        return zzzy5;
    }

    private String zzGj() {
        return zzZKN.format("{0}svg", this.zzxB.getCssClassNamesPrefix());
    }

    private static zzI9 zzP(String str, int i) {
        return new zzI9("'" + zzS0.zzm(str) + "'", zzZVC.zzRW(i), zzZVC.zzRX(i));
    }

    private String zzZ1(String str) {
        if (!zzZYD.zzXk(this.zzxB.zzQG())) {
            return str;
        }
        return o0Oo0oo.OooO0Oo("/* Generated by " + this.zzxB.zzQG() + " */", this.zzxB.getPrettyFormat() ? IOUtils.LINE_SEPARATOR_WINDOWS : " ", str);
    }

    private void zzZ2(String str) {
        zzng().zzY("link");
        zzng().zzX("rel", "stylesheet");
        zzng().zzX(C18437z2.f56754h, "text/css");
        zzng().zzX("href", str);
        zzng().zzX("media", "all");
        zzng().zzp();
    }

    public final zzZOP zzD(zzZOP zzzop) throws Exception {
        if (this.zzxB.getExportEmbeddedSvg()) {
            return zzzop;
        }
        byte[] bArrZzZX = zzZYQ.zzZX(zzzop);
        String strZzY = this.zzxz.zzY(bArrZzZX, null);
        if (strZzY == null) {
            strZzY = zzZ(zzZKN.format("{0}.svg", zzW7(3)), bArrZzZX, false);
            this.zzxz.zzZ(bArrZzZX, null, strZzY);
        }
        zzZOR zzzor = new zzZOR();
        zzP zzp = new zzP(zzzor, false);
        zzp.zzY("object");
        zzp.zzX(C18437z2.f56754h, "image/svg+xml");
        zzp.zzX(Constants.ScionAnalytics.MessageType.DATA_MESSAGE, strZzY);
        zzp.zzn();
        zzp.flush();
        zzzor.zzH(0L);
        return zzzor;
    }

    public final zzZY3 zzE(zzZOP zzzop) throws Exception {
        return new zzZY3(zzzop, zzGe(), this, new zzZNI(false));
    }

    @Override // com.aspose.words.internal.zzFL
    public final zzZWJ zzG9() {
        if (this.zzxD == null) {
            this.zzxD = new zzZWJ();
        }
        return this.zzxD;
    }

    @Override // com.aspose.words.internal.zzZVD
    public final zzEO zzGf() {
        return new zzI7(zznh().getJpegQuality(), zzI());
    }

    public final String zzGg() {
        return this.zzxC;
    }

    public final zzI6 zzGh() {
        return this.zzxB;
    }

    public final String zzGi() {
        return zzZKN.format("{0}page", this.zzxB.getCssClassNamesPrefix());
    }

    public final String zzGk() {
        return zzZKN.format("{0}img", this.zzxB.getCssClassNamesPrefix());
    }

    public final String zzGl() {
        return zzZKN.format("{0}span", this.zzxB.getCssClassNamesPrefix());
    }

    public final String zzGm() {
        return zzZKN.format("{0}div", this.zzxB.getCssClassNamesPrefix());
    }

    @Override // com.aspose.words.internal.zzZVD
    public final void zzGn() throws Exception {
        zzng().zzY("head");
        zzng().zzY("meta");
        zzng().zzX("http-equiv", "Content-Type");
        zzng().zzX(FirebaseAnalytics.Param.CONTENT, zzZKN.format("text/html; charset={0}", this.zzxB.zzQZ().zzi1()));
        zzng().zzp();
        if (zzZYD.zzXk(zznh().zzQG())) {
            zzng().zzY("meta");
            zzng().zzX("name", "generator");
            zzng().zzX(FirebaseAnalytics.Param.CONTENT, this.zzxB.zzQG());
            zzng().zzp();
        }
        zzng().zzY(NoteMeta.PROPERTY_TITLE);
        zzng().writeString(this.zzxB.getTitle());
        zzng().zzn();
        String strZzGc = this.zzxB.getUseTargetMachineFonts() ? "" : zzGc();
        String strZzGd = zzGd();
        if (this.zzxB.getExportEmbeddedCss()) {
            zzng().zzY("style");
            zzng().zzX(C18437z2.f56754h, "text/css");
            if (zzZYD.zzXk(strZzGc)) {
                zzng().zzY(strZzGc, true);
                if (!this.zzxB.getPrettyFormat()) {
                    zzng().zzX(" ");
                }
            }
            zzng().zzY(strZzGd, true);
            zzng().zzp();
        } else {
            if (zzZYD.zzXk(strZzGc)) {
                if (this.zzxB.getSaveFontFaceCssSeparately()) {
                    zzZ2(zzZ("fontFaces.css", zzZO0.zzhV().getBytes(zzZ1(strZzGc)), false));
                } else {
                    strZzGd = o0Oo0oo.OooO0Oo(strZzGc, this.zzxB.getPrettyFormat() ? IOUtils.LINE_SEPARATOR_WINDOWS : " ", strZzGd);
                }
            }
            zzZ2(zzZ("styles.css", zzZO0.zzhV().getBytes(zzZ1(strZzGd)), false));
        }
        zzng().zzp();
    }

    public final String zzW(zzPM zzpm) {
        zzI9 zzi9ZzP = zzP(zzpm.zzPh(), zzpm.zzPk());
        String str = (String) zzQW.zzZ(this.zzxy, zzi9ZzP);
        if (str != null) {
            return str;
        }
        String str2 = zzZKN.format("{0}{1}", this.zzxB.getCssClassNamesPrefix(), zzW7(2));
        zzZQF.zzY(this.zzxy, zzi9ZzP, str2);
        return str2;
    }

    @Override // com.aspose.words.internal.zzZVD
    public final String zzX(zzZXH zzzxh) {
        return zzzxh.zzpw();
    }

    @Override // com.aspose.words.internal.zzZVD
    public final String zzZ(byte[] bArr, zzEP zzep) throws Exception {
        String strZzY = this.zzxA.zzY(bArr, zzep);
        if (!zzZYD.zzXk(strZzY)) {
            byte[] bArrZzW = zznf().zzW(bArr, zzep);
            if (zznh().getExportEmbeddedImages()) {
                strZzY = zz2(bArrZzW);
            } else {
                strZzY = zzZ(zzZKN.format("{0}.{1}", zzW7(0), zzKE.zzWX(zzEF.zzZU(bArrZzW))), bArrZzW, false);
            }
            this.zzxA.zzZ(bArr, zzep, strZzY);
        }
        return strZzY;
    }

    public final void zzZ3(String str) {
        this.zzxC = str;
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x001c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private void zzZ(zzI3 zzi3) {
        String str;
        String strZzW = zzI3.zzW(this.zzxB.getPageMargins(), TranslateLanguage.PORTUGUESE);
        int pageHorizontalAlignment = this.zzxB.getPageHorizontalAlignment();
        if (pageHorizontalAlignment != 0) {
            if (pageHorizontalAlignment != 1) {
                str = pageHorizontalAlignment != 2 ? "" : zzZKN.format("{0} {0} {0} auto", strZzW);
            } else {
                str = zzZKN.format("{0} auto {0} auto", strZzW);
            }
        } else if (!zzAN.zzZD(this.zzxB.getPageMargins())) {
            str = zzZKN.format("{0} auto {0} {0}", strZzW);
        }
        if (zzZKN.equals(str, "")) {
            return;
        }
        zzi3.zzJ("margin", str);
    }

    private static void zzZ(zzI3 zzi3, zzI9 zzi9) {
        zzi3.zzJ("font-family", zzi9.getFamily());
        zzi3.zzJ("font-style", zzi9.zzG7());
        zzi3.zzJ("font-weight", zzi9.zzG6());
    }
}
