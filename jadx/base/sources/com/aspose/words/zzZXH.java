package com.aspose.words;

import com.aspose.words.ref.Ref;
import java.util.Iterator;

/* JADX INFO: loaded from: classes6.dex */
final class zzZXH {
    private int zzYNN = 1;
    private zzZYD zzYPf;
    private zzZXR zzYPg;
    private FontInfoCollection zzYSn;

    private zzZXH(zzZXR zzzxr) throws Exception {
        this.zzYPg = zzzxr;
        this.zzYPf = zzzxr.zzJ("fontTable.xml", "application/vnd.openxmlformats-officedocument.wordprocessingml.fontTable+xml", zzzxr.zzZmp().zzZkT());
        DocumentBase document = this.zzYPg.getDocument();
        zzZZF zzzzfZzZpV = document.zzZpV();
        boolean z = zzzzfZzZpV.zzYWy;
        boolean z2 = zzzzfZzZpV.zzYWx;
        boolean z3 = zzzzfZzZpV.zzYWw;
        this.zzYSn = z ? zzZUU.zzZ(document, z3, z2, zzzxr.zzZlS().getAllowEmbeddingPostScriptFonts()) : document.getFontInfos().zzZ70();
        if (z) {
            return;
        }
        if (z2 || z3) {
            zzzxr.zzT(262144, "Fonts are not embedded, despite either 'EmbedSystemFonts' or 'SaveSubsetFonts' is set to 'true' due to 'EmbedTrueTypeFonts' option is set to 'false'.");
        }
    }

    private static String zzEK(int i) {
        if (i == 0) {
            return "w:embedRegular";
        }
        if (i == 1) {
            return "w:embedBold";
        }
        if (i == 2) {
            return "w:embedItalic";
        }
        if (i == 3) {
            return "w:embedBoldItalic";
        }
        throw new IllegalArgumentException("fontStyle");
    }

    private void zzIg() throws Exception {
        this.zzYPf.zzZmZ();
        Iterator<FontInfo> it = this.zzYSn.iterator();
        while (it.hasNext()) {
            zzZ(it.next());
        }
        this.zzYPf.endDocument();
    }

    public static void zzU(zzZXR zzzxr) throws Exception {
        new zzZXH(zzzxr).zzIg();
    }

    private void zzYm(byte[] bArr) {
        this.zzYPf.zzY("w:sig");
        this.zzYPf.zzX("w:usb0", zzYU3.zzn(bArr, 0));
        this.zzYPf.zzX("w:usb1", zzYU3.zzn(bArr, 4));
        this.zzYPf.zzX("w:usb2", zzYU3.zzn(bArr, 8));
        this.zzYPf.zzX("w:usb3", zzYU3.zzn(bArr, 12));
        this.zzYPf.zzX("w:csb0", zzYU3.zzn(bArr, 16));
        this.zzYPf.zzX("w:csb1", zzYU3.zzn(bArr, 20));
        this.zzYPf.zzp();
    }

    private void zzZ(FontInfo fontInfo) throws Exception {
        this.zzYPf.zzY("w:font");
        String name = fontInfo.getName();
        if (this.zzYPf.zzS(name) && !this.zzYPf.zzS(fontInfo.getAltName())) {
            name = fontInfo.getAltName();
        }
        if (name.length() > 31) {
            name = name.substring(0, 31);
        }
        this.zzYPf.zzX("w:name", name);
        zzYV6.zzZ(fontInfo, this.zzYPf);
        if (fontInfo.getPanose() != null) {
            this.zzYPf.zzYz("w:panose1", com.aspose.words.internal.zzZYD.zzZ8(fontInfo.getPanose()));
        }
        if (this.zzYPf.zzZtY() == 2) {
            this.zzYPf.zzX("w:charset", "w:characterSet", fontInfo.zzZ75());
        } else {
            this.zzYPf.zzYz("w:charset", com.aspose.words.internal.zzJB.zzWw(fontInfo.getCharset()));
        }
        this.zzYPf.zzYz("w:family", zzZXP.zzF9(fontInfo.getFamily()));
        if (!fontInfo.isTrueType()) {
            this.zzYPf.zzZ("w:notTrueType", (String) null);
        }
        this.zzYPf.zzYz("w:pitch", zzY8T.zzkS(fontInfo.getPitch()));
        if (fontInfo.zzZ74() != null) {
            zzYm(fontInfo.zzZ74());
        }
        zzZUW[] zzzuwArrZzZ78 = fontInfo.zzZ78();
        if (zzzuwArrZzZ78 != null) {
            zzZ(zzzuwArrZzZ78);
        }
        this.zzYPf.zzp();
    }

    private void zzZ(zzZUW[] zzzuwArr) throws Exception {
        zzZUW zzzuwZzZjz;
        for (zzZUW zzzuw : zzzuwArr) {
            if (zzzuw != null && (zzzuwZzZjz = zzzuw.zzZjz()) != null) {
                StringBuilder sb = new StringBuilder("fonts/font");
                int i = this.zzYNN;
                this.zzYNN = i + 1;
                sb.append(com.aspose.words.internal.zzJB.zzWD(i));
                sb.append(".odttf");
                zzZ(zzzuwZzZjz, sb.toString());
            }
        }
    }

    private void zzZ(zzZUW zzzuw, String str) throws Exception {
        Ref<String> ref = new Ref<>(null);
        com.aspose.words.internal.zz77 zz77VarZzZ = this.zzYPg.zzZmf().zzZ(this.zzYPf.zzZmN(), str, "application/vnd.openxmlformats-officedocument.obfuscatedFont", this.zzYPg.zzZmp().zzZkp(), ref);
        String str2 = ref.get();
        String strZzZ = zzZXJ.zzZ(zzzuw, zz77VarZzZ.zzR1());
        this.zzYPf.zzY(zzEK(zzzuw.getStyle()));
        this.zzYPf.zzX("r:id", str2);
        this.zzYPf.zzw("w:subsetted", zzzuw.zzZjy());
        this.zzYPf.zzX("w:fontKey", strZzZ);
        this.zzYPf.zzp();
    }
}
