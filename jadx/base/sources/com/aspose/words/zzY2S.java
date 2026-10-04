package com.aspose.words;

import com.google.mlkit.p567nl.translate.TranslateLanguage;
import com.orion.notein.richeditor.utils.p606io.IOUtils;

/* JADX INFO: loaded from: classes6.dex */
final class zzY2S {
    private String zzWXA;
    private String zzWXB;
    private String zzWXC;
    private String zzWXD;
    private String zzWXE;
    private String zzWXF;
    private String zzWXG;
    private Object zzWXH;
    private zzY37 zzWXI;
    private String zzWXr;
    private String zzWXs;
    private String zzWXt;
    private String zzWXu;
    private String zzWXv;
    private String zzWXw;
    private String zzWXx;
    private String zzWXy;
    private String zzWXz;
    private int zzWZQ = 0;
    private String zzWZt;
    private String zzX3n;
    private zzYU6 zzXSu;
    private String zzZPH;

    public zzY2S(zzYU6 zzyu6) {
        this.zzXSu = zzyu6;
        this.zzWXI = new zzY37(zzyu6);
    }

    public final void zzIg() {
        if (this.zzWZQ > 0) {
            this.zzXSu.zzY("v:textpath");
            this.zzWXI.zzX("on", this.zzWXH, "t");
            zzY33 zzy33 = new zzY33();
            if (com.aspose.words.internal.zzZYD.zzXk(this.zzX3n)) {
                zzy33.zzzT(this.zzX3n);
            }
            zzy33.add("font-size", this.zzWZt);
            zzy33.add("font-weight", this.zzWXC);
            zzy33.add("font-style", this.zzWXB);
            zzy33.add("font-variant", this.zzWXA);
            zzy33.add("v-text-align", this.zzWXz);
            zzy33.add("v-rotate-letters", this.zzWXw);
            zzy33.add("v-same-letter-heights", this.zzWXt);
            zzy33.add("v-text-kern", this.zzWXv);
            zzy33.add("v-text-reverse", this.zzWXx);
            zzy33.add("v-text-spacing", this.zzWXy);
            zzy33.add("v-text-spacing-mode", this.zzWXu);
            zzy33.add("mso-text-shadow", this.zzWXs);
            zzy33.add("text-decoration", this.zzWXr);
            this.zzXSu.zz0("style", zzy33.zzZXu());
            this.zzWXI.zzX("fitshape", this.zzWXG, "t");
            this.zzWXI.zzN("trim", this.zzWXF);
            this.zzWXI.zzN("fitpath", this.zzWXE);
            this.zzWXI.zzN("xscale", this.zzWXD);
            this.zzWXI.zzN("string", this.zzZPH);
            this.zzXSu.zzp();
        }
    }

    public final void zzZP(int i, Object obj) {
        this.zzWZQ++;
        if (i == 192) {
            this.zzZPH = ((String) obj).replace(IOUtils.LINE_SEPARATOR_WINDOWS, IOUtils.LINE_SEPARATOR_UNIX);
            return;
        }
        switch (i) {
            case 194:
                this.zzWXz = zzY30.zzj5(((Integer) obj).intValue());
                break;
            case 195:
                this.zzWZt = androidx.concurrent.futures.OooO00o.OooO0OO(new StringBuilder(), zzY23.zzYO((Integer) obj), TranslateLanguage.PORTUGUESE);
                break;
            case 196:
                this.zzWXy = zzY23.zzYO((Integer) obj);
                break;
            case 197:
                this.zzX3n = (String) obj;
                break;
            default:
                switch (i) {
                    case 240:
                        this.zzWXx = zzY23.zzYN(obj);
                        break;
                    case 241:
                        this.zzWXH = zzY23.zzYN(obj);
                        break;
                    case 242:
                        this.zzWXw = zzY23.zzYN(obj);
                        break;
                    case 243:
                        this.zzWXv = zzY23.zzYN(obj);
                        break;
                    case 244:
                        if (((Boolean) obj).booleanValue()) {
                            this.zzWXu = "tightening";
                        }
                        break;
                    case 245:
                        this.zzWXG = zzY23.zzYN(obj);
                        break;
                    case 246:
                        this.zzWXF = zzY23.zzYN(obj);
                        break;
                    case StyleIdentifier.LIGHT_LIST_ACCENT_6 /* 247 */:
                        this.zzWXE = zzY23.zzYN(obj);
                        break;
                    case StyleIdentifier.LIGHT_GRID_ACCENT_6 /* 248 */:
                        this.zzWXt = zzY23.zzYN(obj);
                        break;
                    case StyleIdentifier.MEDIUM_SHADING_1_ACCENT_6 /* 249 */:
                        this.zzWXD = zzY23.zzYN(obj);
                        break;
                    case 250:
                        if (((Boolean) obj).booleanValue()) {
                            this.zzWXC = "bold";
                        }
                        break;
                    case StyleIdentifier.MEDIUM_LIST_1_ACCENT_6 /* 251 */:
                        if (((Boolean) obj).booleanValue()) {
                            this.zzWXB = "italic";
                        }
                        break;
                    case StyleIdentifier.MEDIUM_LIST_2_ACCENT_6 /* 252 */:
                        if (((Boolean) obj).booleanValue()) {
                            this.zzWXr = "underline";
                        }
                        break;
                    case StyleIdentifier.MEDIUM_GRID_1_ACCENT_6 /* 253 */:
                        if (((Boolean) obj).booleanValue()) {
                            this.zzWXs = "auto";
                        }
                        break;
                    case StyleIdentifier.MEDIUM_GRID_2_ACCENT_6 /* 254 */:
                        if (((Boolean) obj).booleanValue()) {
                            this.zzWXA = "small-caps";
                        }
                        break;
                    case 255:
                        if (((Boolean) obj).booleanValue()) {
                            this.zzWXr = "line-through";
                        }
                        break;
                }
                break;
        }
    }
}
