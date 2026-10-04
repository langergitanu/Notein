package com.aspose.words;

import com.facebook.common.callercontext.ContextChain;
import com.google.firebase.messaging.Constants;
import com.google.mlkit.common.sdkinternal.OptionalModuleUtils;
import com.google.mlkit.p567nl.translate.TranslateLanguage;
import com.huawei.hms.network.embedded.C18241k5;
import com.huawei.hms.network.embedded.C18437z2;
import com.microsoft.identity.common.adal.internal.AuthenticationConstants;
import com.orion.notein.domain.models.note.NoteMeta;
import java.util.Iterator;

/* JADX INFO: loaded from: classes6.dex */
final class zzZE6 {
    private static final com.aspose.words.internal.zzZHW zzUR = new com.aspose.words.internal.zzZHW("html", "head", "basefont", "bgsound", "link", "meta", "noframes", "style", "noscript", "body", "frameset", "base", "script", NoteMeta.PROPERTY_TITLE, "caption", "col", "colgroup", "tbody", "td", "tfoot", TranslateLanguage.THAI, "thead", TranslateLanguage.TURKISH, "table", "frame", "command", "option", "optgroup", "select", "input", "keygen", "textarea", "form", "address", "article", "aside", "blockquote", "center", "details", "dialog", "dir", "div", "dl", "fieldset", "figcaption", "figure", "footer", "header", "hgroup", "menu", "nav", "ol", ContextChain.TAG_PRODUCT, "section", "summary", "ul", "h1", "h2", "h3", "h4", "h5", "h6", "pre", "listing", "li", "dd", "dt", "plaintext", "button", "a", "b", "big", "code", "em", "font", ContextChain.TAG_INFRA, "s", "small", "strike", "strong", "tt", "u", "nobr", "applet", "marquee", "object", "area", "br", "embed", "img", "wbr", "image", "param", "source", "track", TranslateLanguage.CROATIAN, "isindex", "xmp", "iframe", "noembed", "rp", "rt", "math", "svg", "ruby", "span", "sub", "sup", "var", "http://www.w3.org/1998/Math/MathML", "http://www.w3.org/2000/svg", "urn:schemas-microsoft-com:vml", "mi", "mo", "mn", TranslateLanguage.MALAY, "mtext", "annotation-xml", "foreignObject", "desc", "altglyph", "altglyphdef", "altglyphitem", "animatecolor", "animatemotion", "animatetransform", "clippath", "feblend", "fecolormatrix", "fecomponenttransfer", "fecomposite", "feconvolvematrix", "fediffuselighting", "fedisplacementmap", "fedistantlight", "feflood", "fefunca", "fefuncb", "fefuncg", "fefuncr", "fegaussianblur", "feimage", "femerge", "femergenode", "femorphology", "feoffset", "fepointlight", "fespecularlighting", "fespotlight", "fetile", "feturbulence", "foreignobject", "glyphref", "lineargradient", "radialgradient", "textpath");
    private boolean zzYkA;
    private boolean zzYkB;
    private int zzYkC;
    private int zzYkD;
    private String zzYkE;
    private zzZE8 zzYkF;
    private boolean zzYks;
    private boolean zzYkt;
    private zzZIG zzYkx;
    private zzZIG zzYky;
    private zzZIG zzYkz;
    private int zzZr3;
    private zzZFX zzYkw = new zzZFX();
    private zzZKD zzYkv = new zzZKD();
    private zzZED zzYku = new zzZED();

    private zzZE6(zzZE8 zzze8, boolean z, boolean z2) {
        this.zzYkF = zzze8;
        this.zzYkt = z;
        this.zzYks = z2;
    }

    private void run() throws Exception {
        zzZE9 zzze9ZzVh;
        this.zzYkz = null;
        this.zzYky = null;
        this.zzYkx = null;
        this.zzYkw.clear();
        this.zzZr3 = 0;
        this.zzYkB = true;
        this.zzYkA = false;
        this.zzYkD = 0;
        do {
            zzze9ZzVh = this.zzYkF.zzVh(this.zzYkw.isEmpty() || zzYXH());
            if (zzze9ZzVh.getType() != 0) {
                this.zzYkA = false;
            }
            boolean zZzW = true;
            while (zZzW) {
                int type = zzze9ZzVh.getType();
                if (type != 0) {
                    if (type != 1) {
                        if (type != 2) {
                            if (type != 3) {
                                zzYXV();
                            } else {
                                zzZEE zzzee = (zzZEE) zzze9ZzVh;
                                if (zzzee.zzZou()) {
                                    if (zzZ(zzze9ZzVh)) {
                                        zzZ(zzzee);
                                    } else {
                                        zZzW = zzW(zzzee);
                                    }
                                } else if (zzZ(zzze9ZzVh)) {
                                    zzV(zzzee);
                                } else {
                                    zzS(zzzee);
                                }
                            }
                        } else if (zzZ(zzze9ZzVh)) {
                            zzZ((zzZIS) zzze9ZzVh);
                        }
                    }
                } else if (zzZ(zzze9ZzVh)) {
                    zzZ((zzZEB) zzze9ZzVh);
                } else {
                    zzY((zzZEB) zzze9ZzVh);
                }
                zZzW = false;
            }
        } while (zzze9ZzVh.getType() != 4);
    }

    private String zzJZ(String str) {
        if (com.aspose.words.internal.zzZYD.zzXk(this.zzYkE) && com.aspose.words.internal.zzZKN.zzS(str, this.zzYkE, com.aspose.words.internal.zzZOF.ORDINAL$4894b8c8)) {
            String strSubstring = str.substring(this.zzYkE.length());
            if (com.aspose.words.internal.zzZYD.zzXk(strSubstring)) {
                return strSubstring;
            }
        }
        return str;
    }

    private static String zzK0(String str) {
        switch (zzUR.zzTP(str)) {
            case 120:
                return "altGlyph";
            case 121:
                return "altGlyphDef";
            case 122:
                return "altGlyphItem";
            case 123:
                return "animateColor";
            case 124:
                return "animateMotion";
            case 125:
                return "animateTransform";
            case 126:
                return "clipPath";
            case 127:
                return "feBlend";
            case 128:
                return "feColorMatrix";
            case 129:
                return "feComponentTransfer";
            case 130:
                return "feComposite";
            case 131:
                return "feConvolveMatrix";
            case 132:
                return "feDiffuseLighting";
            case 133:
                return "feDisplacementMap";
            case 134:
                return "feDistantLight";
            case 135:
                return "feFlood";
            case 136:
                return "feFuncA";
            case 137:
                return "feFuncB";
            case 138:
                return "feFuncG";
            case 139:
                return "feFuncR";
            case 140:
                return "feGaussianBlur";
            case 141:
                return "feImage";
            case 142:
                return "feMerge";
            case 143:
                return "feMergeNode";
            case 144:
                return "feMorphology";
            case 145:
                return "feOffset";
            case 146:
                return "fePointLight";
            case 147:
                return "feSpecularLighting";
            case 148:
                return "feSpotLight";
            case 149:
                return "feTile";
            case 150:
                return "feTurbulence";
            case 151:
                return "foreignObject";
            case 152:
                return "glyphRef";
            case 153:
                return "linearGradient";
            case 154:
                return "radialGradient";
            case 155:
                return "textPath";
            default:
                return str;
        }
    }

    private void zzK1(String str) {
        com.aspose.words.internal.zzZYD.zzXk(str);
        zzQ(new zzZEC(str));
    }

    private void zzK2(String str) {
        for (int count = this.zzYkw.getCount() - 1; count >= 0; count--) {
            zzZIG zzzigZzAb = this.zzYkw.zzAb(count);
            if (com.aspose.words.internal.zzZKN.equals(zzzigZzAb.getName(), str)) {
                zzK3(str);
                this.zzYkw.zzzc(count);
                return;
            } else {
                if (zza(zzzigZzAb)) {
                    return;
                }
            }
        }
    }

    private void zzK3(String str) {
        boolean z;
        do {
            zzZIG zzzigZzZ0a = this.zzYkw.zzZ0a();
            z = "http://www.w3.org/1999/xhtml".equals(zzzigZzZ0a.getNamespace()) && ("dd".equals(zzzigZzZ0a.getName()) || "dt".equals(zzzigZzZ0a.getName()) || "li".equals(zzzigZzZ0a.getName()) || "option".equals(zzzigZzZ0a.getName()) || "optgroup".equals(zzzigZzZ0a.getName()) || ContextChain.TAG_PRODUCT.equals(zzzigZzZ0a.getName()) || "rp".equals(zzzigZzZ0a.getName()) || "rt".equals(zzzigZzZ0a.getName())) && !com.aspose.words.internal.zzZKN.equals(zzzigZzZ0a.getName(), str);
            if (z) {
                this.zzYkw.zzZ09();
            }
        } while (z);
    }

    private void zzK4(String str) {
        while (!this.zzYkw.isEmpty()) {
            zzZIG zzzigZzZ0a = this.zzYkw.zzZ0a();
            this.zzYkw.zzZ09();
            if (com.aspose.words.internal.zzZKN.equals(zzzigZzZ0a.getName(), str)) {
                return;
            }
        }
    }

    private void zzK5(String str) {
        for (int count = this.zzYkw.getCount() - 1; count >= 0; count--) {
            zzZIG zzzigZzAb = this.zzYkw.zzAb(count);
            if (com.aspose.words.internal.zzZKN.equals(zzzigZzAb.getName(), str)) {
                zzK3(str);
                zzK4(str);
                return;
            } else {
                if (zza(zzzigZzAb)) {
                    return;
                }
            }
        }
    }

    private void zzK6(String str) {
        zzK3(str);
        zzK4(str);
    }

    private void zzK7(String str) {
        zzZIG zzzigZzAb;
        for (int i = 0; i < 8; i++) {
            zzZIG zzzigZzL7 = this.zzYkv.zzL7(str);
            if (zzzigZzL7 == null) {
                zzK2(str);
                return;
            }
            int iZzX = this.zzYkw.zzX(zzzigZzL7);
            if (iZzX < 0) {
                this.zzYkv.zzY(zzzigZzL7);
                return;
            }
            if (!zzf(zzzigZzL7)) {
                return;
            }
            int i2 = iZzX + 1;
            while (true) {
                if (i2 >= this.zzYkw.getCount()) {
                    zzzigZzAb = null;
                    i2 = -1;
                    break;
                } else {
                    zzzigZzAb = this.zzYkw.zzAb(i2);
                    if (zza(zzzigZzAb)) {
                        break;
                    } else {
                        i2++;
                    }
                }
            }
            if (zzzigZzAb == null) {
                this.zzYkw.zzzc(iZzX);
                this.zzYkv.zzY(zzzigZzL7);
                return;
            }
            zzZIG zzzigZzAb2 = this.zzYkw.zzAb(iZzX - 1);
            int iZzX2 = this.zzYkv.zzX(zzzigZzL7);
            zzZG4 zzzg4 = zzzigZzAb;
            for (int i3 = 0; i3 < 3; i3++) {
                i2--;
                zzZIG zzzigZzAb3 = this.zzYkw.zzAb(i2);
                int iZzX3 = this.zzYkv.zzX(zzzigZzAb3);
                if (iZzX3 >= 0) {
                    if (zzzigZzAb3 == zzzigZzL7) {
                        break;
                    }
                    zzZIG zzzigZzZ = zzZ(zzzigZzAb3.getName(), zzzigZzAb3.getNamespace(), zzzigZzAb3.zzZ2B(), false);
                    this.zzYkv.zzY(iZzX3, zzzigZzZ);
                    this.zzYkw.zzX(i2, zzzigZzZ);
                    if (zzzg4 == zzzigZzAb) {
                        iZzX2 = iZzX3;
                    }
                    if (zzzg4.zzZ0e() != null) {
                        zzzg4.zzZ0e().zzZ2C().zzW(zzzg4);
                    }
                    zzzigZzZ.zzZ2C().zzX(zzzg4);
                    zzzg4 = zzzigZzZ;
                } else {
                    this.zzYkw.zzY(zzzigZzAb3);
                }
            }
            if (zzzg4.zzZ0e() != null) {
                zzzg4.zzZ0e().zzZ2C().zzW(zzzg4);
            }
            if (zzc(zzzigZzAb2)) {
                zzP(zzzg4);
            } else {
                zzzigZzAb2.zzZ2C().zzX(zzzg4);
            }
            zzZIG zzzigZzZ2 = zzZ(zzzigZzL7.getName(), zzzigZzL7.getNamespace(), zzzigZzL7.zzZ2B(), false);
            zzzigZzZ2.zzZ2C().zzZ(zzzigZzAb.zzZ2C());
            zzzigZzAb.zzZ2C().zzX(zzzigZzZ2);
            this.zzYkv.zzY(zzzigZzL7);
            this.zzYkv.zzZ(iZzX2, zzzigZzZ2);
            this.zzYkw.zzY(zzzigZzL7);
            this.zzYkw.zzZ(this.zzYkw.zzX(zzzigZzAb) + 1, zzzigZzZ2);
        }
    }

    private void zzP(zzZG4 zzzg4) {
        zzZIG zzzigZzAb;
        zzZIG zzzigZzYXP = zzYXP();
        if (zzzigZzYXP == null) {
            zzzigZzAb = this.zzYkw.zzAb(0);
        } else {
            zzZIG zzzigZzZ0e = zzzigZzYXP.zzZ0e();
            if (zzzigZzZ0e == null) {
                zzzigZzZ0e = this.zzYkw.zzAb(this.zzYkw.zzX(zzzigZzYXP) - 1);
            }
            int iZzV = zzzigZzZ0e.zzZ2C().zzV(zzzigZzYXP);
            if (iZzV >= 0) {
                zzzigZzZ0e.zzZ2C().zzZ(iZzV, zzzg4);
                return;
            }
            zzzigZzAb = zzzigZzZ0e;
        }
        zzzigZzAb.zzZ2C().zzX(zzzg4);
    }

    private void zzQ(zzZG4 zzzg4) {
        this.zzYkw.zzZ0a().zzZ2C().zzX(zzzg4);
    }

    private void zzS(zzZEE zzzee) {
        if (com.aspose.words.internal.zzZKN.equals(com.aspose.words.internal.zzZKN.zzU2(this.zzYkw.zzZ0a().getName()), zzzee.getName())) {
            this.zzYkw.zzZ09();
            return;
        }
        for (int count = this.zzYkw.getCount() - 2; count >= 0; count--) {
            zzZIG zzzigZzAb = this.zzYkw.zzAb(count);
            if ("http://www.w3.org/1999/xhtml".equals(zzzigZzAb.getNamespace())) {
                zzV(zzzee);
                return;
            } else {
                if (com.aspose.words.internal.zzZKN.equals(com.aspose.words.internal.zzZKN.zzU2(zzzigZzAb.getName()), zzzee.getName())) {
                    this.zzYkw.zzzc(count);
                    return;
                }
            }
        }
    }

    private boolean zzT(zzZEE zzzee) {
        int iZzTP = zzUR.zzTP(zzzee.getName());
        if (iZzTP != 0 && iZzTP != 9) {
            switch (iZzTP) {
                case 23:
                    if (zzYW(zzzee.getName(), "http://www.w3.org/1999/xhtml")) {
                        zzK4("table");
                        zzYXU();
                        break;
                    }
                case 14:
                case 15:
                case 16:
                case 17:
                case 18:
                case 19:
                case 20:
                case 21:
                case 22:
                    return false;
                default:
                    return zzX(zzzee, true);
            }
        }
        return false;
    }

    private void zzU(zzZEE zzzee) {
        switch (zzUR.zzTP(zzzee.getName())) {
            case 26:
                if (zzYXz()) {
                    this.zzYkw.zzZ09();
                }
                break;
            case 27:
                if (zzYXz() && zzYXx()) {
                    this.zzYkw.zzZ09();
                }
                if (zzYXy()) {
                    this.zzYkw.zzZ09();
                }
                break;
            case 28:
                if (zzYV("select", "http://www.w3.org/1999/xhtml")) {
                    zzK4("select");
                    zzYXU();
                }
                break;
        }
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:28:0x0089. Please report as an issue. */
    /* JADX WARN: Failed to find 'out' block for switch in B:40:0x00c0. Please report as an issue. */
    /* JADX WARN: Failed to find 'out' block for switch in B:52:0x010d. Please report as an issue. */
    /* JADX WARN: Failed to find 'out' block for switch in B:68:0x0168. Please report as an issue. */
    /* JADX WARN: Failed to find 'out' block for switch in B:90:0x01d9. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:5:0x0008  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private void zzV(zzZEE zzzee) {
        while (true) {
            boolean zZzX = true;
            while (zZzX) {
                switch (this.zzYkD) {
                    case 0:
                        this.zzZr3 = 2;
                        this.zzYkD = 1;
                        break;
                    case 1:
                        if ("head".equals(zzzee.getName()) || "body".equals(zzzee.getName()) || "html".equals(zzzee.getName()) || "br".equals(zzzee.getName())) {
                            this.zzYkz = zzZ("html", "http://www.w3.org/1999/xhtml", new zzZK8(), true);
                            this.zzYkD = 2;
                        }
                        zZzX = false;
                        break;
                    case 2:
                        if ("head".equals(zzzee.getName()) || "body".equals(zzzee.getName()) || "html".equals(zzzee.getName()) || "br".equals(zzzee.getName())) {
                            this.zzYky = zzZ("head", new zzZK8(), true, false);
                            this.zzYkD = 3;
                        }
                        zZzX = false;
                        break;
                    case 3:
                        int iZzTP = zzUR.zzTP(zzzee.getName());
                        if (iZzTP != 0) {
                            if (iZzTP == 1) {
                                this.zzYkw.zzZ09();
                                this.zzYkD = 5;
                            } else if (iZzTP == 9 || iZzTP == 87) {
                            }
                            zZzX = false;
                            break;
                        }
                        this.zzYkw.zzZ09();
                        this.zzYkD = 5;
                        break;
                    case 4:
                        int iZzTP2 = zzUR.zzTP(zzzee.getName());
                        if (iZzTP2 == 8) {
                            this.zzYkw.zzZ09();
                            this.zzYkD = 3;
                        } else if (iZzTP2 == 87) {
                            this.zzYkw.zzZ09();
                            this.zzYkD = 3;
                        }
                        zZzX = false;
                        break;
                    case 5:
                        int iZzTP3 = zzUR.zzTP(zzzee.getName());
                        if (iZzTP3 == 0 || iZzTP3 == 9 || iZzTP3 == 87) {
                            zzZ("body", new zzZK8(), true, false);
                            this.zzYkD = 6;
                        }
                        zZzX = false;
                        break;
                    case 6:
                        zZzX = zzX(zzzee, false);
                        break;
                    case 7:
                        this.zzYkw.zzZ09();
                        this.zzYkD = this.zzYkC;
                        zZzX = false;
                        break;
                    case 8:
                        zZzX = zzT(zzzee);
                        break;
                    case 9:
                        zzYXq();
                        break;
                    case 10:
                        int iZzTP4 = zzUR.zzTP(zzzee.getName());
                        if (iZzTP4 != 0 && iZzTP4 != 9) {
                            switch (iZzTP4) {
                                case 14:
                                    if (zzYW(zzzee.getName(), "http://www.w3.org/1999/xhtml")) {
                                        zzK3("");
                                        zzK4("caption");
                                        this.zzYkv.zzZ4s();
                                        this.zzYkD = 8;
                                    }
                                    break;
                                case 15:
                                case 16:
                                case 17:
                                case 18:
                                case 19:
                                case 20:
                                case 21:
                                case 22:
                                    break;
                                case 23:
                                    if (zzYW(zzzee.getName(), "http://www.w3.org/1999/xhtml")) {
                                        zzK3("");
                                        zzK4("caption");
                                        this.zzYkv.zzZ4s();
                                        this.zzYkD = 8;
                                    }
                                    break;
                                default:
                                    zZzX = zzX(zzzee, false);
                                    break;
                            }
                            while (zZzX) {
                            }
                        }
                        zZzX = false;
                        break;
                    case 11:
                        int iZzTP5 = zzUR.zzTP(zzzee.getName());
                        if (iZzTP5 != 15) {
                            if (iZzTP5 != 16) {
                                if (!zzYXw()) {
                                    this.zzYkw.zzZ09();
                                    this.zzYkD = 8;
                                }
                            } else if (!zzYXw()) {
                                this.zzYkw.zzZ09();
                                this.zzYkD = 8;
                            }
                        }
                        zZzX = false;
                        break;
                    case 12:
                        int iZzTP6 = zzUR.zzTP(zzzee.getName());
                        if (iZzTP6 != 0 && iZzTP6 != 9) {
                            switch (iZzTP6) {
                                case 14:
                                case 15:
                                case 16:
                                case 18:
                                case 20:
                                case 22:
                                    break;
                                case 17:
                                case 19:
                                case 21:
                                    if (zzYW(zzzee.getName(), "http://www.w3.org/1999/xhtml")) {
                                        zzYXL();
                                        this.zzYkw.zzZ09();
                                        this.zzYkD = 8;
                                    }
                                    break;
                                case 23:
                                    if (zzYXD()) {
                                        zzYXL();
                                        this.zzYkw.zzZ09();
                                        this.zzYkD = 8;
                                    }
                                    break;
                                default:
                                    zZzX = zzT(zzzee);
                                    break;
                            }
                            while (zZzX) {
                            }
                        }
                        zZzX = false;
                        break;
                    case 13:
                        int iZzTP7 = zzUR.zzTP(zzzee.getName());
                        if (iZzTP7 != 0 && iZzTP7 != 9) {
                            switch (iZzTP7) {
                                case 14:
                                case 15:
                                case 16:
                                case 18:
                                case 20:
                                    break;
                                case 17:
                                case 19:
                                case 21:
                                    if (zzYW(zzzee.getName(), "http://www.w3.org/1999/xhtml")) {
                                        if (zzYW(TranslateLanguage.TURKISH, "http://www.w3.org/1999/xhtml")) {
                                            zzYXK();
                                            this.zzYkw.zzZ09();
                                            this.zzYkD = 12;
                                        }
                                    }
                                    break;
                                case 22:
                                    if (zzYW(zzzee.getName(), "http://www.w3.org/1999/xhtml")) {
                                        zzYXK();
                                        this.zzYkw.zzZ09();
                                        this.zzYkD = 12;
                                    }
                                    break;
                                case 23:
                                    if (zzYW(TranslateLanguage.TURKISH, "http://www.w3.org/1999/xhtml")) {
                                        zzYXK();
                                        this.zzYkw.zzZ09();
                                        this.zzYkD = 12;
                                    }
                                    break;
                                default:
                                    zZzX = zzT(zzzee);
                                    break;
                            }
                            while (zZzX) {
                            }
                        }
                        zZzX = false;
                        break;
                    case 14:
                        int iZzTP8 = zzUR.zzTP(zzzee.getName());
                        if (iZzTP8 != 0 && iZzTP8 != 9) {
                            switch (iZzTP8) {
                                case 14:
                                case 15:
                                case 16:
                                    break;
                                case 17:
                                case 19:
                                case 21:
                                case 22:
                                case 23:
                                    if (zzYW(zzzee.getName(), "http://www.w3.org/1999/xhtml")) {
                                        zzK3("");
                                        zzYXN();
                                        this.zzYkv.zzZ4s();
                                        this.zzYkD = 13;
                                    }
                                    break;
                                case 18:
                                case 20:
                                    if (zzYW(zzzee.getName(), "http://www.w3.org/1999/xhtml")) {
                                        zzK3("");
                                        zzYXN();
                                        this.zzYkv.zzZ4s();
                                        this.zzYkD = 13;
                                    }
                                    break;
                                default:
                                    zZzX = zzX(zzzee, false);
                                    break;
                            }
                            while (zZzX) {
                            }
                        }
                        zZzX = false;
                        break;
                    case 15:
                        zzU(zzzee);
                        zZzX = false;
                        break;
                    case 16:
                        int iZzTP9 = zzUR.zzTP(zzzee.getName());
                        if (iZzTP9 != 14) {
                            switch (iZzTP9) {
                                case 17:
                                case 18:
                                case 19:
                                case 20:
                                case 21:
                                case 22:
                                case 23:
                                    if (zzYW(zzzee.getName(), "http://www.w3.org/1999/xhtml")) {
                                        if (zzYV("select", "http://www.w3.org/1999/xhtml")) {
                                            zzK4("select");
                                            zzYXU();
                                        }
                                    }
                                    zZzX = false;
                                    break;
                                default:
                                    zzU(zzzee);
                                    zZzX = false;
                                    break;
                            }
                            while (zZzX) {
                            }
                        }
                        break;
                    case 17:
                        if (!"html".equals(zzzee.getName())) {
                            this.zzYkD = 6;
                        } else {
                            this.zzYkD = 20;
                            zZzX = false;
                        }
                        break;
                    case 18:
                        if (zzUR.zzTP(zzzee.getName()) == 10 && !zzYXw()) {
                            this.zzYkw.zzZ09();
                            if (!zzYXv()) {
                                this.zzYkD = 19;
                            }
                        }
                        zZzX = false;
                        break;
                    case 19:
                        if (zzUR.zzTP(zzzee.getName()) == 0) {
                            this.zzYkD = 21;
                        }
                        zZzX = false;
                        break;
                    case 20:
                        this.zzYkD = 6;
                        break;
                    case 21:
                        zZzX = false;
                        break;
                    default:
                        throw new IllegalStateException("Unknown insertion mode.");
                }
            }
            return;
        }
    }

    private void zzVc(boolean z) {
        int count = this.zzYkv.getCount() - 1;
        while (!zzyR(count)) {
            count--;
        }
        while (true) {
            count++;
            if (count >= this.zzYkv.getCount()) {
                return;
            }
            this.zzYkv.getCount();
            zzZIG zzzigZzAb = this.zzYkv.zzAb(count);
            this.zzYkv.zzY(count, zzZ(zzzigZzAb.getName(), zzzigZzAb.zzZ2B(), true, z));
        }
    }

    private boolean zzW(zzZEE zzzee) {
        String name;
        String name2;
        int iZzTP = zzUR.zzTP(zzzee.getName());
        if (iZzTP != 1 && iZzTP != 5 && iZzTP != 9 && iZzTP != 23 && iZzTP != 49 && iZzTP != 95 && iZzTP != 36 && iZzTP != 37 && iZzTP != 41 && iZzTP != 42 && iZzTP != 51 && iZzTP != 52) {
            switch (iZzTP) {
                case 55:
                case 56:
                case 57:
                case 58:
                case 59:
                case 60:
                case 61:
                case 62:
                case 63:
                case 64:
                case 65:
                case 66:
                    break;
                default:
                    switch (iZzTP) {
                        case 70:
                        case 71:
                        case 72:
                        case 73:
                        case 75:
                        case 76:
                        case 77:
                        case 78:
                        case 79:
                        case 80:
                        case 81:
                        case 82:
                            break;
                        case 74:
                            if (zzW(zzzee.zzZ2B())) {
                                this.zzYkw.zzZ09();
                                zzYXJ();
                                return true;
                            }
                            String namespace = this.zzYkw.zzZ0a().getNamespace();
                            if ("http://www.w3.org/1998/Math/MathML".equals(namespace)) {
                                zzY(zzzee.zzZ2B());
                            }
                            if ("http://www.w3.org/2000/svg".equals(namespace)) {
                                name = zzK0(zzzee.getName());
                                zzX(zzzee.zzZ2B());
                            } else {
                                name = zzzee.getName();
                            }
                            zzZ(name, namespace, zzzee.zzZ2B(), true ^ zzzee.zzYYo(), false);
                            return false;
                        default:
                            switch (iZzTP) {
                                case 87:
                                case 88:
                                case 89:
                                    break;
                                default:
                                    switch (iZzTP) {
                                        case 104:
                                        case 105:
                                        case 106:
                                        case 107:
                                        case 108:
                                            break;
                                        default:
                                            String namespace2 = this.zzYkw.zzZ0a().getNamespace();
                                            if ("http://www.w3.org/1998/Math/MathML".equals(namespace2)) {
                                                zzY(zzzee.zzZ2B());
                                            }
                                            if ("http://www.w3.org/2000/svg".equals(namespace2)) {
                                                name2 = zzK0(zzzee.getName());
                                                zzX(zzzee.zzZ2B());
                                            } else {
                                                name2 = zzzee.getName();
                                            }
                                            zzZ(name2, namespace2, zzzee.zzZ2B(), true ^ zzzee.zzYYo(), false);
                                            return false;
                                    }
                                    break;
                            }
                            break;
                    }
                    break;
            }
        }
        this.zzYkw.zzZ09();
        zzYXJ();
        return true;
    }

    private boolean zzX(zzZEE zzzee) {
        int iZzTP = zzUR.zzTP(zzzee.getName());
        if (iZzTP == 7) {
            zzZ(zzzee.getName(), zzzee.zzZ2B(), true, false);
            zzYXT();
            return false;
        }
        if (iZzTP == 12) {
            zzZ(zzzee.getName(), zzzee.zzZ2B(), true, false);
            zzYXS();
            return false;
        }
        if (iZzTP != 29) {
            if (iZzTP != 32) {
                switch (iZzTP) {
                    case 14:
                        zzYXM();
                        this.zzYkv.zzZ4t();
                        zzZ(zzzee.getName(), zzzee.zzZ2B(), true, false);
                        this.zzYkD = 10;
                        return false;
                    case 15:
                        zzYXM();
                        zzZ("colgroup", new zzZK8(), true, false);
                        this.zzYkD = 11;
                        return true;
                    case 16:
                        zzYXM();
                        zzZ(zzzee.getName(), zzzee.zzZ2B(), true, false);
                        this.zzYkD = 11;
                        return false;
                    case 17:
                    case 19:
                    case 21:
                        zzYXM();
                        zzZ(zzzee.getName(), zzzee.zzZ2B(), true, false);
                        this.zzYkD = 12;
                        return false;
                    case 18:
                    case 20:
                    case 22:
                        zzYXM();
                        zzZ("tbody", new zzZK8(), true, false);
                        this.zzYkD = 12;
                        return true;
                    case 23:
                        if (zzYW("table", "http://www.w3.org/1999/xhtml")) {
                            zzK4("table");
                            zzYXU();
                            return true;
                        }
                        break;
                }
            } else if (this.zzYkx == null) {
                this.zzYkx = zzZ(zzzee.getName(), zzzee.zzZ2B(), false, false);
            }
            return false;
        }
        if (com.aspose.words.internal.zzZKN.zzX(zzzee.zzZ2B().getAttributeValue(C18437z2.f56754h, ""), "hidden", com.aspose.words.internal.zzZOF.ORDINAL_IGNORE_CASE$4894b8c8)) {
            zzZ(zzzee.getName(), zzzee.zzZ2B(), false, false);
            return false;
        }
        return zzY(zzzee, true);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    private boolean zzY(zzZEE zzzee) {
        int iZzTP = zzUR.zzTP(zzzee.getName());
        if (iZzTP == 0) {
            return zzY(zzzee, false);
        }
        if (iZzTP == 12) {
            return zzZ(zzzee, false);
        }
        switch (iZzTP) {
            case 26:
                if (zzYXz()) {
                    this.zzYkw.zzZ09();
                }
                zzZ(zzzee.getName(), zzzee.zzZ2B(), true, false);
                return false;
            case 27:
                if (zzYXz()) {
                    this.zzYkw.zzZ09();
                }
                if (zzYXy()) {
                    this.zzYkw.zzZ09();
                }
                zzZ(zzzee.getName(), zzzee.zzZ2B(), true, false);
                return false;
            case 28:
                if (zzYV(zzzee.getName(), "http://www.w3.org/1999/xhtml")) {
                    zzK4("select");
                    zzYXU();
                }
                return false;
            case 29:
            case 30:
            case 31:
                if (zzYV("select", "http://www.w3.org/1999/xhtml")) {
                    zzK4("select");
                    zzYXU();
                    return true;
                }
                return false;
            default:
                return false;
        }
    }

    private void zzYU(String str, String str2) {
        for (int count = this.zzYkw.getCount() - 1; count >= 0; count--) {
            zzZIG zzzigZzAb = this.zzYkw.zzAb(count);
            if (com.aspose.words.internal.zzZKN.equals(zzzigZzAb.getName(), str) && com.aspose.words.internal.zzZKN.equals(zzzigZzAb.getNamespace(), str2)) {
                zzK3("li");
                zzK4("li");
                return;
            } else {
                if (zzb(zzzigZzAb)) {
                    return;
                }
            }
        }
    }

    private boolean zzYV(String str, String str2) {
        for (int count = this.zzYkw.getCount() - 1; count >= 0; count--) {
            zzZIG zzzigZzAb = this.zzYkw.zzAb(count);
            if (com.aspose.words.internal.zzZKN.equals(zzzigZzAb.getName(), str) && com.aspose.words.internal.zzZKN.equals(zzzigZzAb.getNamespace(), str2)) {
                return true;
            }
            if ((!"option".equals(zzzigZzAb.getName()) && !"optgroup".equals(zzzigZzAb.getName())) || !"http://www.w3.org/1999/xhtml".equals(zzzigZzAb.getNamespace())) {
                return false;
            }
        }
        return false;
    }

    private boolean zzYW(String str, String str2) {
        for (int count = this.zzYkw.getCount() - 1; count >= 0; count--) {
            zzZIG zzzigZzAb = this.zzYkw.zzAb(count);
            if (com.aspose.words.internal.zzZKN.equals(zzzigZzAb.getName(), str) && com.aspose.words.internal.zzZKN.equals(zzzigZzAb.getNamespace(), str2)) {
                return true;
            }
            if (("html".equals(zzzigZzAb.getName()) || "table".equals(zzzigZzAb.getName())) && "http://www.w3.org/1999/xhtml".equals(zzzigZzAb.getNamespace())) {
                return false;
            }
        }
        return false;
    }

    private boolean zzYX(String str, String str2) {
        for (int count = this.zzYkw.getCount() - 1; count >= 0; count--) {
            zzZIG zzzigZzAb = this.zzYkw.zzAb(count);
            if (com.aspose.words.internal.zzZKN.equals(zzzigZzAb.getName(), str) && com.aspose.words.internal.zzZKN.equals(zzzigZzAb.getNamespace(), str2)) {
                return true;
            }
            if (zze(zzzigZzAb)) {
                return false;
            }
            if (("ol".equals(zzzigZzAb.getName()) || "ul".equals(zzzigZzAb.getName())) && com.aspose.words.internal.zzZKN.equals(zzzigZzAb.getNamespace(), str2)) {
                return false;
            }
        }
        return false;
    }

    private boolean zzYXA() {
        return zzc(this.zzYkw.zzZ0a());
    }

    private boolean zzYXB() {
        return zzd(this.zzYkw.zzZ0a());
    }

    private boolean zzYXC() {
        for (int count = this.zzYkw.getCount() - 1; count >= 0; count--) {
            zzZIG zzzigZzAb = this.zzYkw.zzAb(count);
            if (("td".equals(zzzigZzAb.getName()) || TranslateLanguage.THAI.equals(zzzigZzAb.getName())) && "http://www.w3.org/1999/xhtml".equals(zzzigZzAb.getNamespace())) {
                return true;
            }
            if (("html".equals(zzzigZzAb.getName()) || "table".equals(zzzigZzAb.getName())) && "http://www.w3.org/1999/xhtml".equals(zzzigZzAb.getNamespace())) {
                return false;
            }
        }
        return false;
    }

    private boolean zzYXD() {
        for (int count = this.zzYkw.getCount() - 1; count >= 0; count--) {
            zzZIG zzzigZzAb = this.zzYkw.zzAb(count);
            if (("tbody".equals(zzzigZzAb.getName()) || "tfoot".equals(zzzigZzAb.getName()) || "thead".equals(zzzigZzAb.getName())) && "http://www.w3.org/1999/xhtml".equals(zzzigZzAb.getNamespace())) {
                return true;
            }
            if (("html".equals(zzzigZzAb.getName()) || "table".equals(zzzigZzAb.getName())) && "http://www.w3.org/1999/xhtml".equals(zzzigZzAb.getNamespace())) {
                return false;
            }
        }
        return false;
    }

    private boolean zzYXE() {
        for (int count = this.zzYkw.getCount() - 1; count >= 0; count--) {
            zzZIG zzzigZzAb = this.zzYkw.zzAb(count);
            if (zzd(zzzigZzAb)) {
                return true;
            }
            if (zze(zzzigZzAb)) {
                return false;
            }
        }
        return false;
    }

    private boolean zzYXF() {
        zzZIG zzzigZzZ0a = this.zzYkw.zzZ0a();
        if ("http://www.w3.org/1998/Math/MathML".equals(zzzigZzZ0a.getNamespace())) {
            return "mi".equals(zzzigZzZ0a.getName()) || "mo".equals(zzzigZzZ0a.getName()) || "mn".equals(zzzigZzZ0a.getName()) || TranslateLanguage.MALAY.equals(zzzigZzZ0a.getName()) || "mtext".equals(zzzigZzZ0a.getName());
        }
        return false;
    }

    private boolean zzYXG() {
        zzZIG zzzigZzZ0a = this.zzYkw.zzZ0a();
        switch (zzUR.zzTP(zzzigZzZ0a.getNamespace())) {
            case 109:
                if ("annotation-xml".equals(zzzigZzZ0a.getName())) {
                    String strZzU2 = com.aspose.words.internal.zzZKN.zzU2(zzzigZzZ0a.zzZ2B().getAttributeValue("encoding", ""));
                    if ("text/html".equals(strZzU2) || "application/xhtml+xml".equals(strZzU2)) {
                    }
                }
                break;
            case 110:
                if ("foreignObject".equals(zzzigZzZ0a.getName()) || "desc".equals(zzzigZzZ0a.getName()) || NoteMeta.PROPERTY_TITLE.equals(zzzigZzZ0a.getName())) {
                }
                break;
            case 111:
                if ("textbox".equals(zzJZ(zzzigZzZ0a.getName()))) {
                }
                break;
        }
        return true;
    }

    private boolean zzYXH() {
        return "http://www.w3.org/1999/xhtml".equals(this.zzYkw.zzZ0a().getNamespace());
    }

    private boolean zzYXI() {
        return zzYXF() || zzYXG() || zzYXH();
    }

    private void zzYXJ() {
        while (!zzYXI()) {
            this.zzYkw.zzZ09();
        }
    }

    private void zzYXK() {
        while (!zzYXs()) {
            this.zzYkw.zzZ09();
        }
    }

    private void zzYXL() {
        while (!zzYXt()) {
            this.zzYkw.zzZ09();
        }
    }

    private void zzYXM() {
        while (!zzYXu()) {
            this.zzYkw.zzZ09();
        }
    }

    private void zzYXN() {
        while (!this.zzYkw.isEmpty()) {
            zzZIG zzzigZzZ0a = this.zzYkw.zzZ0a();
            this.zzYkw.zzZ09();
            if ("td".equals(zzzigZzZ0a.getName()) || TranslateLanguage.THAI.equals(zzzigZzZ0a.getName())) {
                return;
            }
        }
    }

    private void zzYXO() {
        while (!this.zzYkw.isEmpty()) {
            zzZIG zzzigZzZ0a = this.zzYkw.zzZ0a();
            this.zzYkw.zzZ09();
            if (zzd(zzzigZzZ0a)) {
                return;
            }
        }
    }

    private zzZIG zzYXP() {
        for (int count = this.zzYkw.getCount() - 1; count >= 0; count--) {
            zzZIG zzzigZzAb = this.zzYkw.zzAb(count);
            if ("http://www.w3.org/1999/xhtml".equals(zzzigZzAb.getNamespace()) && "table".equals(zzzigZzAb.getName())) {
                return zzzigZzAb;
            }
        }
        return null;
    }

    private void zzYXQ() {
        if (zzYY(ContextChain.TAG_PRODUCT, "http://www.w3.org/1999/xhtml")) {
            zzK6(ContextChain.TAG_PRODUCT);
        }
    }

    private void zzYXR() {
        this.zzYkF.zzYYe();
        this.zzYkC = this.zzYkD;
        this.zzYkD = 7;
    }

    private void zzYXS() {
        this.zzYkF.zzYYb();
        this.zzYkC = this.zzYkD;
        this.zzYkD = 7;
    }

    private void zzYXT() {
        this.zzYkF.zzYYc();
        this.zzYkC = this.zzYkD;
        this.zzYkD = 7;
    }

    private void zzYXU() {
        for (int count = this.zzYkw.getCount() - 1; count >= 0; count--) {
            zzZIG zzzigZzAb = this.zzYkw.zzAb(count);
            if ("http://www.w3.org/1999/xhtml".equals(zzzigZzAb.getNamespace())) {
                int iZzTP = zzUR.zzTP(zzzigZzAb.getName());
                if (iZzTP == 0) {
                    this.zzYkD = 2;
                    return;
                }
                if (iZzTP == 1 || iZzTP == 9) {
                    this.zzYkD = 6;
                    return;
                }
                if (iZzTP == 10) {
                    this.zzYkD = 18;
                    return;
                }
                if (iZzTP == 14) {
                    this.zzYkD = 10;
                    return;
                }
                if (iZzTP == 28) {
                    this.zzYkD = 15;
                    return;
                }
                switch (iZzTP) {
                    case 16:
                        this.zzYkD = 11;
                        return;
                    case 17:
                    case 19:
                    case 21:
                        this.zzYkD = 12;
                        return;
                    case 18:
                    case 20:
                        if (count > 0) {
                            this.zzYkD = 14;
                            return;
                        }
                        break;
                        break;
                    case 22:
                        this.zzYkD = 13;
                        return;
                    case 23:
                        this.zzYkD = 8;
                        return;
                }
            }
        }
        this.zzYkD = 6;
    }

    private void zzYXV() {
        while (true) {
            switch (this.zzYkD) {
                case 0:
                    this.zzZr3 = 2;
                    this.zzYkD = 1;
                    break;
                case 1:
                    this.zzYkz = zzZ("html", "http://www.w3.org/1999/xhtml", new zzZK8(), true);
                    this.zzYkD = 2;
                    break;
                case 2:
                    this.zzYky = zzZ("head", new zzZK8(), true, false);
                    this.zzYkD = 3;
                    break;
                case 3:
                    this.zzYkw.zzZ09();
                    this.zzYkD = 5;
                    break;
                case 4:
                    this.zzYkw.zzZ09();
                    this.zzYkD = 3;
                    break;
                case 5:
                    zzZ("body", new zzZK8(), true, false);
                    this.zzYkD = 6;
                    break;
                case 6:
                case 8:
                case 10:
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
                    this.zzYkw.clear();
                    return;
                case 7:
                    this.zzYkw.zzZ09();
                    this.zzYkD = this.zzYkC;
                    break;
                case 9:
                    zzYXq();
                    break;
                case 11:
                    if (this.zzYkw.getCount() == 1) {
                        this.zzYkw.clear();
                        return;
                    } else {
                        this.zzYkw.zzZ09();
                        this.zzYkD = 8;
                    }
                    break;
                default:
                    throw new IllegalStateException("Unknown insertion mode.");
            }
        }
    }

    private void zzYXq() {
        if (this.zzYku.zzYYm()) {
            zzVc(true);
            if (zzYXA()) {
                zzX(this.zzYku);
            } else {
                zzY(this.zzYku);
            }
            this.zzYkB = false;
        } else {
            zzY(this.zzYku);
        }
        this.zzYkD = this.zzYkC;
    }

    private void zzYXr() {
        for (int count = this.zzYkw.getCount() - 1; count >= 0; count--) {
            zzZIG zzzigZzAb = this.zzYkw.zzAb(count);
            if (("dd".equals(zzzigZzAb.getName()) || "dt".equals(zzzigZzAb.getName())) && "http://www.w3.org/1999/xhtml".equals(zzzigZzAb.getNamespace())) {
                zzK3(zzzigZzAb.getName());
                zzK4(zzzigZzAb.getName());
                return;
            } else {
                if (zzb(zzzigZzAb)) {
                    return;
                }
            }
        }
    }

    private boolean zzYXs() {
        zzZIG zzzigZzZ0a = this.zzYkw.zzZ0a();
        if ("http://www.w3.org/1999/xhtml".equals(zzzigZzZ0a.getNamespace())) {
            return TranslateLanguage.TURKISH.equals(zzzigZzZ0a.getName()) || "html".equals(zzzigZzZ0a.getName());
        }
        return false;
    }

    private boolean zzYXt() {
        zzZIG zzzigZzZ0a = this.zzYkw.zzZ0a();
        if ("http://www.w3.org/1999/xhtml".equals(zzzigZzZ0a.getNamespace())) {
            return "tbody".equals(zzzigZzZ0a.getName()) || "tfoot".equals(zzzigZzZ0a.getName()) || "thead".equals(zzzigZzZ0a.getName()) || "html".equals(zzzigZzZ0a.getName());
        }
        return false;
    }

    private boolean zzYXu() {
        zzZIG zzzigZzZ0a = this.zzYkw.zzZ0a();
        if ("http://www.w3.org/1999/xhtml".equals(zzzigZzZ0a.getNamespace())) {
            return "table".equals(zzzigZzZ0a.getName()) || "html".equals(zzzigZzZ0a.getName());
        }
        return false;
    }

    private boolean zzYXv() {
        zzZIG zzzigZzZ0a = this.zzYkw.zzZ0a();
        return "http://www.w3.org/1999/xhtml".equals(zzzigZzZ0a.getNamespace()) && "frameset".equals(zzzigZzZ0a.getName());
    }

    private boolean zzYXw() {
        zzZIG zzzigZzZ0a = this.zzYkw.zzZ0a();
        return "http://www.w3.org/1999/xhtml".equals(zzzigZzZ0a.getNamespace()) && "html".equals(zzzigZzZ0a.getName()) && this.zzYkw.getCount() == 1;
    }

    private boolean zzYXx() {
        if (this.zzYkw.getCount() > 1) {
            zzZIG zzzigZzAb = this.zzYkw.zzAb(r0.getCount() - 2);
            if ("http://www.w3.org/1999/xhtml".equals(zzzigZzAb.getNamespace()) && "optgroup".equals(zzzigZzAb.getName())) {
                return true;
            }
        }
        return false;
    }

    private boolean zzYXy() {
        zzZIG zzzigZzZ0a = this.zzYkw.zzZ0a();
        return "http://www.w3.org/1999/xhtml".equals(zzzigZzZ0a.getNamespace()) && "optgroup".equals(zzzigZzZ0a.getName());
    }

    private boolean zzYXz() {
        zzZIG zzzigZzZ0a = this.zzYkw.zzZ0a();
        return "http://www.w3.org/1999/xhtml".equals(zzzigZzZ0a.getNamespace()) && "option".equals(zzzigZzZ0a.getName());
    }

    private boolean zzYY(String str, String str2) {
        for (int count = this.zzYkw.getCount() - 1; count >= 0; count--) {
            zzZIG zzzigZzAb = this.zzYkw.zzAb(count);
            if (com.aspose.words.internal.zzZKN.equals(zzzigZzAb.getName(), str) && com.aspose.words.internal.zzZKN.equals(zzzigZzAb.getNamespace(), str2)) {
                return true;
            }
            if (zze(zzzigZzAb)) {
                return false;
            }
            if ("button".equals(zzzigZzAb.getName()) && com.aspose.words.internal.zzZKN.equals(zzzigZzAb.getNamespace(), str2)) {
                return false;
            }
        }
        return false;
    }

    private boolean zzYZ(String str, String str2) {
        for (int count = this.zzYkw.getCount() - 1; count >= 0; count--) {
            zzZIG zzzigZzAb = this.zzYkw.zzAb(count);
            if (com.aspose.words.internal.zzZKN.equals(zzzigZzAb.getName(), str) && com.aspose.words.internal.zzZKN.equals(zzzigZzAb.getNamespace(), str2)) {
                return true;
            }
            if (zze(zzzigZzAb)) {
                return false;
            }
        }
        return false;
    }

    public static zzZIR zzZ(zzZE8 zzze8, boolean z, boolean z2) throws Exception {
        zzZE6 zzze6 = new zzZE6(zzze8, z, z2);
        zzze6.run();
        return new zzZIR(zzze6.zzYkz, zzze6.zzZr3);
    }

    private boolean zzZ0(String str, String str2) {
        zzZIG zzzigZzyQ = zzyQ(1);
        return zzzigZzyQ != null && com.aspose.words.internal.zzZKN.equals(zzzigZzyQ.getName(), str) && com.aspose.words.internal.zzZKN.equals(zzzigZzyQ.getNamespace(), str2);
    }

    private static boolean zza(zzZIG zzzig) {
        int iZzTP = zzUR.zzTP(zzzig.getName());
        if (iZzTP != 28 && iZzTP != 29) {
            if (iZzTP != 118 && iZzTP != 119) {
                switch (iZzTP) {
                    case 0:
                    case 1:
                    case 2:
                    case 3:
                    case 4:
                    case 5:
                    case 6:
                    case 7:
                    case 8:
                    case 9:
                    case 10:
                    case 11:
                    case 12:
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
                        break;
                    case 13:
                        return "http://www.w3.org/1999/xhtml".equals(zzzig.getNamespace()) || "http://www.w3.org/2000/svg".equals(zzzig.getNamespace());
                    default:
                        switch (iZzTP) {
                            case 31:
                            case 32:
                            case 33:
                            case 34:
                            case 35:
                            case 36:
                            case 37:
                            case 38:
                                break;
                            default:
                                switch (iZzTP) {
                                    case 40:
                                    case 41:
                                    case 42:
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
                                    case 58:
                                    case 59:
                                    case 60:
                                    case 61:
                                    case 62:
                                    case 63:
                                    case 64:
                                    case 65:
                                    case 66:
                                    case 67:
                                    case 68:
                                        break;
                                    default:
                                        switch (iZzTP) {
                                            case 83:
                                            case 84:
                                            case 85:
                                            case 86:
                                            case 87:
                                            case 88:
                                            case 89:
                                            case 90:
                                                break;
                                            default:
                                                switch (iZzTP) {
                                                    case 92:
                                                    case 93:
                                                    case 94:
                                                    case 95:
                                                    case 96:
                                                    case 97:
                                                    case 98:
                                                    case 99:
                                                        break;
                                                    default:
                                                        switch (iZzTP) {
                                                            case 112:
                                                            case 113:
                                                            case 114:
                                                            case 115:
                                                            case 116:
                                                                return "http://www.w3.org/1998/Math/MathML".equals(zzzig.getNamespace());
                                                            default:
                                                                return false;
                                                        }
                                                }
                                                break;
                                        }
                                        break;
                                }
                                break;
                        }
                        break;
                }
            } else {
                return "http://www.w3.org/2000/svg".equals(zzzig.getNamespace());
            }
        }
        return "http://www.w3.org/1999/xhtml".equals(zzzig.getNamespace());
    }

    private static boolean zzb(zzZIG zzzig) {
        return (!zza(zzzig) || "address".equals(zzzig.getName()) || "div".equals(zzzig.getName()) || ContextChain.TAG_PRODUCT.equals(zzzig.getName())) ? false : true;
    }

    private static boolean zzc(zzZIG zzzig) {
        if ("http://www.w3.org/1999/xhtml".equals(zzzig.getNamespace())) {
            return "table".equals(zzzig.getName()) || "thead".equals(zzzig.getName()) || "tbody".equals(zzzig.getName()) || "tfoot".equals(zzzig.getName()) || TranslateLanguage.TURKISH.equals(zzzig.getName());
        }
        return false;
    }

    private static boolean zzd(zzZIG zzzig) {
        if ("http://www.w3.org/1999/xhtml".equals(zzzig.getNamespace())) {
            return "h1".equals(zzzig.getName()) || "h2".equals(zzzig.getName()) || "h3".equals(zzzig.getName()) || "h4".equals(zzzig.getName()) || "h5".equals(zzzig.getName()) || "h6".equals(zzzig.getName());
        }
        return false;
    }

    private boolean zze(zzZIG zzzig) {
        if ("urn:schemas-microsoft-com:vml".equals(zzzig.getNamespace()) && "textbox".equals(zzJZ(zzzig.getName()))) {
            return true;
        }
        int iZzTP = zzUR.zzTP(zzzig.getName());
        if (iZzTP != 0 && iZzTP != 18 && iZzTP != 20 && iZzTP != 23) {
            if (iZzTP != 13) {
                if (iZzTP != 14) {
                    switch (iZzTP) {
                        case 83:
                        case 84:
                        case 85:
                            break;
                        default:
                            switch (iZzTP) {
                                case 112:
                                case 113:
                                case 114:
                                case 115:
                                case 116:
                                case 117:
                                    return "http://www.w3.org/1998/Math/MathML".equals(zzzig.getNamespace());
                                case 118:
                                case 119:
                                    break;
                                default:
                                    return false;
                            }
                            break;
                    }
                }
            }
            return "http://www.w3.org/2000/svg".equals(zzzig.getNamespace());
        }
        return "http://www.w3.org/1999/xhtml".equals(zzzig.getNamespace());
    }

    private boolean zzf(zzZIG zzzig) {
        for (int count = this.zzYkw.getCount() - 1; count >= 0; count--) {
            zzZIG zzzigZzAb = this.zzYkw.zzAb(count);
            if (zzzigZzAb == zzzig) {
                return true;
            }
            if (zze(zzzigZzAb)) {
                return false;
            }
        }
        return false;
    }

    private zzZIG zzyQ(int i) {
        if (1 < this.zzYkw.getCount()) {
            return this.zzYkw.zzAb(1);
        }
        return null;
    }

    private boolean zzyR(int i) {
        zzZIG zzzigZzAb;
        return i < 0 || i >= this.zzYkv.getCount() || (zzzigZzAb = this.zzYkv.zzAb(i)) == null || this.zzYkw.zzJ(zzzigZzAb);
    }

    private boolean zzZ(zzZE9 zzze9) {
        zzZEE zzzee;
        zzZEE zzzee2;
        zzZEE zzzee3;
        if (this.zzYkw.isEmpty() || zzYXH()) {
            return true;
        }
        if (zzYXF() && (((zzzee3 = (zzZEE) com.aspose.words.internal.zzZKW.zzZ(zzze9, zzZEE.class)) != null && zzzee3.zzZou() && !"mglyph".equals(zzzee3.getName()) && !"malignmark".equals(zzzee3.getName())) || zzze9.getType() == 0)) {
            return true;
        }
        zzZIG zzzigZzZ0a = this.zzYkw.zzZ0a();
        if ("http://www.w3.org/1998/Math/MathML".equals(zzzigZzZ0a.getNamespace()) && "annotation-xml".equals(zzzigZzZ0a.getName()) && (zzzee2 = (zzZEE) com.aspose.words.internal.zzZKW.zzZ(zzze9, zzZEE.class)) != null && zzzee2.zzZou() && "svg".equals(zzzee2.getName())) {
            return true;
        }
        return (zzYXG() && (((zzzee = (zzZEE) com.aspose.words.internal.zzZKW.zzZ(zzze9, zzZEE.class)) != null && zzzee.zzZou()) || zzze9.getType() == 0)) || zzze9.getType() == 4;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    private boolean zzY(zzZEE zzzee, boolean z) {
        if (!com.aspose.words.internal.zzZKN.equals(zzJZ(zzzee.getName()), zzzee.getName())) {
            zzVc(z);
            zzZ(zzzee.getName(), "urn:schemas-microsoft-com:vml", zzzee.zzZ2B(), !zzzee.zzYYo(), z);
            return false;
        }
        switch (zzUR.zzTP(zzzee.getName())) {
            case 0:
                zzZ(zzzee.zzZ2B(), 0);
                return false;
            case 1:
            case 14:
            case 15:
            case 16:
            case 17:
            case 18:
            case 19:
            case 20:
            case 21:
            case 22:
            case 24:
                return false;
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 11:
            case 12:
            case 13:
            case 25:
                return zzZ(zzzee, z);
            case 8:
                if (this.zzYkt) {
                    zzZ(zzzee.getName(), zzzee.zzZ2B(), true, z);
                    zzYXT();
                    return false;
                }
                zzVc(z);
                zzZ(zzzee.getName(), zzzee.zzZ2B(), true, z);
                return false;
            case 9:
                if (zzZ0("body", "http://www.w3.org/1999/xhtml")) {
                    this.zzYkB = false;
                    zzZ(zzzee.zzZ2B(), 1);
                    return false;
                }
                return false;
            case 10:
                if (zzZ0("body", "http://www.w3.org/1999/xhtml") && this.zzYkB) {
                    zzZIG zzzigZzyQ = zzyQ(1);
                    if (zzzigZzyQ.zzZ0e() != null) {
                        zzzigZzyQ.zzZ0e().zzZ2C().zzW(zzzigZzyQ);
                    }
                    this.zzYkw.isEmpty();
                    this.zzYkw.zzzc(1);
                    zzZ(zzzee.getName(), zzzee.zzZ2B(), true, z);
                    this.zzYkD = 18;
                    return false;
                }
                return false;
            case 23:
                if (this.zzZr3 != 2) {
                    zzYXQ();
                }
                zzZ(zzzee.getName(), zzzee.zzZ2B(), true, z);
                this.zzYkB = false;
                this.zzYkD = 8;
                return false;
            case 26:
            case 27:
                if (zzYXz()) {
                    zzK5("option");
                }
                zzVc(z);
                zzZ(zzzee.getName(), zzzee.zzZ2B(), true, z);
                return false;
            case 28:
                zzVc(z);
                zzZ(zzzee.getName(), zzzee.zzZ2B(), true, z);
                this.zzYkB = false;
                switch (this.zzYkD) {
                    case 8:
                    case 10:
                    case 12:
                    case 13:
                    case 14:
                        this.zzYkD = 16;
                        break;
                    case 9:
                    case 11:
                    default:
                        this.zzYkD = 15;
                        break;
                }
                return false;
            case 29:
                zzVc(z);
                zzZ(zzzee.getName(), zzzee.zzZ2B(), false, z);
                zzZK9 zzzk9ZzL6 = zzzee.zzZ2B().zzL6(C18437z2.f56754h);
                if (zzzk9ZzL6 == null || !com.aspose.words.internal.zzZKN.zzX(zzzk9ZzL6.getValue(), "hidden", com.aspose.words.internal.zzZOF.ORDINAL_IGNORE_CASE$4894b8c8)) {
                    this.zzYkB = false;
                    return false;
                }
                return false;
            case 30:
            case 86:
            case 87:
            case 88:
            case 89:
            case 90:
                zzVc(z);
                zzZ(zzzee.getName(), zzzee.zzZ2B(), false, z);
                this.zzYkB = false;
                return false;
            case 31:
                zzZ(zzzee.getName(), zzzee.zzZ2B(), true, z);
                this.zzYkA = true;
                this.zzYkB = false;
                zzYXR();
                return false;
            case 32:
                if (this.zzYkx == null) {
                    zzYXQ();
                    this.zzYkx = zzZ(zzzee.getName(), zzzee.zzZ2B(), true, z);
                    return false;
                }
                return false;
            case 33:
            case 34:
            case 35:
            case 36:
            case 37:
            case 38:
            case 39:
            case 40:
            case 41:
            case 42:
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
                zzYXQ();
                zzZ(zzzee.getName(), zzzee.zzZ2B(), true, z);
                return false;
            case 56:
            case 57:
            case 58:
            case 59:
            case 60:
            case 61:
                zzYXQ();
                if (zzYXB()) {
                    this.zzYkw.zzZ09();
                }
                zzZ(zzzee.getName(), zzzee.zzZ2B(), true, z);
                return false;
            case 62:
            case 63:
                zzYXQ();
                zzZ(zzzee.getName(), zzzee.zzZ2B(), true, z);
                this.zzYkA = true;
                this.zzYkB = false;
                return false;
            case 64:
                this.zzYkB = false;
                zzYU("li", "http://www.w3.org/1999/xhtml");
                zzYXQ();
                zzZ(zzzee.getName(), zzzee.zzZ2B(), true, z);
                return false;
            case 65:
            case 66:
                this.zzYkB = false;
                zzYXr();
                zzYXQ();
                zzZ(zzzee.getName(), zzzee.zzZ2B(), true, z);
                return false;
            case 67:
                zzYXQ();
                zzZ(zzzee.getName(), zzzee.zzZ2B(), true, z);
                this.zzYkF.zzYYd();
                return false;
            case 68:
                if (zzYZ("button", "http://www.w3.org/1999/xhtml")) {
                    zzK3("");
                    zzK4("button");
                    return true;
                }
                zzVc(z);
                zzZ(zzzee.getName(), zzzee.zzZ2B(), true, z);
                this.zzYkB = false;
                return false;
            case 69:
                zzZIG zzzigZzL7 = this.zzYkv.zzL7("a");
                if (zzzigZzL7 != null) {
                    zzK7("a");
                    this.zzYkv.zzY(zzzigZzL7);
                    this.zzYkw.zzY(zzzigZzL7);
                }
                zzVc(z);
                this.zzYkv.zzZ(zzZ(zzzee.getName(), zzzee.zzZ2B(), true, z));
                return false;
            case 70:
            case 71:
            case 72:
            case 73:
            case 74:
            case 75:
            case 76:
            case 77:
            case 78:
            case 79:
            case 80:
            case 81:
                zzVc(z);
                this.zzYkv.zzZ(zzZ(zzzee.getName(), zzzee.zzZ2B(), true, z));
                return false;
            case 82:
                zzVc(z);
                if (zzYZ("nobr", "http://www.w3.org/1999/xhtml")) {
                    zzK7("nobr");
                    zzVc(z);
                }
                this.zzYkv.zzZ(zzZ(zzzee.getName(), zzzee.zzZ2B(), true, z));
                return false;
            case 83:
            case 84:
            case 85:
                zzVc(z);
                zzZ(zzzee.getName(), zzzee.zzZ2B(), true, z);
                this.zzYkv.zzZ4t();
                this.zzYkB = false;
                return false;
            case 91:
                zzVc(z);
                zzZ("img", zzzee.zzZ2B(), false, z);
                this.zzYkB = false;
                return false;
            case 92:
            case 93:
            case 94:
                zzZ(zzzee.getName(), zzzee.zzZ2B(), false, z);
                return false;
            case 95:
                zzYXQ();
                zzZ(zzzee.getName(), zzzee.zzZ2B(), false, z);
                this.zzYkB = false;
                return false;
            case 96:
                if (this.zzYkx == null) {
                    zzYXQ();
                    zzZK8 zzzk8 = new zzZK8();
                    zzZK9 zzzk9ZzL62 = zzzee.zzZ2B().zzL6("action");
                    if (zzzk9ZzL62 != null) {
                        zzzk8.zzY(zzzk9ZzL62);
                    }
                    this.zzYkx = zzZ("form", zzzk8, true, z);
                    zzZ(TranslateLanguage.CROATIAN, new zzZK8(), false, false);
                    zzVc(false);
                    zzZ(Constants.ScionAnalytics.PARAM_LABEL, new zzZK8(), true, false);
                    zzZK9 zzzk9ZzL63 = zzzee.zzZ2B().zzL6(AuthenticationConstants.AAD.QUERY_PROMPT);
                    if (zzzk9ZzL63 != null) {
                        if (com.aspose.words.internal.zzZYD.zzXk(zzzk9ZzL63.getValue())) {
                            zzK1(zzzk9ZzL63.getValue());
                        }
                    } else {
                        zzK1("This is a searchable index. Enter search keywords: ");
                    }
                    zzZK8 zzzk82 = new zzZK8();
                    for (zzZK9 zzzk9 : zzzee.zzZ2B()) {
                        if (!"name".equals(zzzk9.getName()) && !"action".equals(zzzk9.getName()) && !AuthenticationConstants.AAD.QUERY_PROMPT.equals(zzzk9.getName())) {
                            zzzk82.zzY(zzzk9);
                        }
                    }
                    zzzk82.zzY(new zzZK9("name", "isindex"));
                    zzZ("input", zzzk82, false, false);
                    zzK2(Constants.ScionAnalytics.PARAM_LABEL);
                    zzZ(TranslateLanguage.CROATIAN, new zzZK8(), false, false);
                    zzK3("");
                    this.zzYkw.zzY(this.zzYkx);
                    this.zzYkx = null;
                    this.zzYkB = false;
                    return false;
                }
                return false;
            case 97:
                zzYXQ();
                zzVc(z);
                this.zzYkB = false;
                zzZ(zzzee.getName(), zzzee.zzZ2B(), true, z);
                zzYXT();
                return false;
            case 98:
                this.zzYkB = false;
                zzZ(zzzee.getName(), zzzee.zzZ2B(), true, z);
                zzYXT();
                return false;
            case 99:
                zzZ(zzzee.getName(), zzzee.zzZ2B(), true, z);
                zzYXT();
                return false;
            case 100:
            case 101:
                if (zzYZ("ruby", "http://www.w3.org/1999/xhtml")) {
                    zzK3("");
                }
                zzZ(zzzee.getName(), zzzee.zzZ2B(), true, z);
                return false;
            case 102:
                zzVc(z);
                zzY(zzzee.zzZ2B());
                zzZ(zzzee.getName(), "http://www.w3.org/1998/Math/MathML", zzzee.zzZ2B(), !zzzee.zzYYo(), z);
                return false;
            case 103:
                zzVc(z);
                zzX(zzzee.zzZ2B());
                zzZ(zzzee.getName(), "http://www.w3.org/2000/svg", zzzee.zzZ2B(), !zzzee.zzYYo(), z);
                return false;
            default:
                zzVc(z);
                zzZ(zzzee.getName(), zzzee.zzZ2B(), !(this.zzYks && zzzee.zzYYo() && "mbp:pagebreak".equals(zzzee.getName())), z);
                return false;
        }
    }

    private void zzZ(zzZIS zzzis) {
        if (this.zzYkD != 0) {
            return;
        }
        this.zzYkD = 1;
        if (zzzis.zzZ32()) {
            this.zzZr3 = 2;
            return;
        }
        if (!"html".equals(zzzis.getName())) {
            this.zzZr3 = 2;
            return;
        }
        String[] strArr = {"+//silmaril//dtd html pro v0r11 19970101//", "-//advasoft ltd//dtd html 3.0 aswedit + extensions//", "-//as//dtd html 3.0 aswedit + extensions//", "-//ietf//dtd html 2.0 level 1//", "-//ietf//dtd html 2.0 level 2//", "-//ietf//dtd html 2.0 strict level 1//", "-//ietf//dtd html 2.0 strict level 2//", "-//ietf//dtd html 2.0 strict//", "-//ietf//dtd html 2.0//", "-//ietf//dtd html 2.1e//", "-//ietf//dtd html 3.0//", "-//ietf//dtd html 3.2 final//", "-//ietf//dtd html 3.2//", "-//ietf//dtd html 3//", "-//ietf//dtd html level 0//", "-//ietf//dtd html level 1//", "-//ietf//dtd html level 2//", "-//ietf//dtd html level 3//", "-//ietf//dtd html strict level 0//", "-//ietf//dtd html strict level 1//", "-//ietf//dtd html strict level 2//", "-//ietf//dtd html strict level 3//", "-//ietf//dtd html strict//", "-//ietf//dtd html//", "-//metrius//dtd metrius presentational//", "-//microsoft//dtd internet explorer 2.0 html strict//", "-//microsoft//dtd internet explorer 2.0 html//", "-//microsoft//dtd internet explorer 2.0 tables//", "-//microsoft//dtd internet explorer 3.0 html strict//", "-//microsoft//dtd internet explorer 3.0 html//", "-//microsoft//dtd internet explorer 3.0 tables//", "-//netscape comm. corp.//dtd html//", "-//netscape comm. corp.//dtd strict html//", "-//o'reilly and associates//dtd html 2.0//", "-//o'reilly and associates//dtd html extended 1.0//", "-//o'reilly and associates//dtd html extended relaxed 1.0//", "-//softquad software//dtd hotmetal pro 6.0::19990601::extensions to html 4.0//", "-//softquad//dtd hotmetal pro 4.0::19971010::extensions to html 4.0//", "-//spyglass//dtd html 2.0 extended//", "-//sq//dtd html 2.0 hotmetal + extensions//", "-//sun microsystems corp.//dtd hotjava html//", "-//sun microsystems corp.//dtd hotjava strict html//", "-//w3c//dtd html 3 1995-03-24//", "-//w3c//dtd html 3.2 draft//", "-//w3c//dtd html 3.2 final//", "-//w3c//dtd html 3.2//", "-//w3c//dtd html 3.2s draft//", "-//w3c//dtd html 4.0 frameset//", "-//w3c//dtd html 4.0 transitional//", "-//w3c//dtd html experimental 19960712//", "-//w3c//dtd html experimental 970421//", "-//w3c//dtd w3 html//", "-//w3o//dtd w3 html 3.0//", "-//webtechs//dtd mozilla html 2.0//", "-//webtechs//dtd mozilla html//"};
        if (zzzis.getPublicId() != null) {
            for (int i = 0; i < 55; i++) {
                if (com.aspose.words.internal.zzZKN.zzS(zzzis.getPublicId(), strArr[i], com.aspose.words.internal.zzZOF.ORDINAL_IGNORE_CASE$4894b8c8)) {
                    this.zzZr3 = 2;
                    return;
                }
            }
        }
        String[] strArr2 = {"-//w3o//dtd w3 html strict 3.0//en//", "-/w3c/dtd html 4.0 transitional/en", "html"};
        if (zzzis.getPublicId() != null) {
            for (int i2 = 0; i2 < 3; i2++) {
                if (com.aspose.words.internal.zzZKN.zzX(zzzis.getPublicId(), strArr2[i2], com.aspose.words.internal.zzZOF.ORDINAL_IGNORE_CASE$4894b8c8)) {
                    this.zzZr3 = 2;
                    return;
                }
            }
        }
        if ("http://www.ibm.com/data/dtd/v11/ibmxhtml1-transitional.dtd".equals(zzzis.getSystemId())) {
            this.zzZr3 = 2;
            return;
        }
        if (zzzis.getSystemId() == null && zzzis.getPublicId() != null) {
            String publicId = zzzis.getPublicId();
            int i3 = com.aspose.words.internal.zzZOF.ORDINAL_IGNORE_CASE$4894b8c8;
            if (com.aspose.words.internal.zzZKN.zzS(publicId, "-//w3c//dtd html 4.01 frameset//", i3) || com.aspose.words.internal.zzZKN.zzS(zzzis.getPublicId(), "-//w3c//dtd html 4.01 transitional//", i3)) {
                this.zzZr3 = 2;
                return;
            }
        }
        if (zzzis.getPublicId() != null) {
            String publicId2 = zzzis.getPublicId();
            int i4 = com.aspose.words.internal.zzZOF.ORDINAL_IGNORE_CASE$4894b8c8;
            if (com.aspose.words.internal.zzZKN.zzS(publicId2, "-//w3c//dtd xhtml 1.0 frameset//", i4) || com.aspose.words.internal.zzZKN.zzS(zzzis.getPublicId(), "-//w3c//dtd xhtml 1.0 transitional//", i4)) {
                this.zzZr3 = 1;
                return;
            }
        }
        if (zzzis.getSystemId() != null && zzzis.getPublicId() != null) {
            String publicId3 = zzzis.getPublicId();
            int i5 = com.aspose.words.internal.zzZOF.ORDINAL_IGNORE_CASE$4894b8c8;
            if (com.aspose.words.internal.zzZKN.zzS(publicId3, "-//w3c//dtd html 4.01 frameset//", i5) || com.aspose.words.internal.zzZKN.zzS(zzzis.getPublicId(), "-//w3c//dtd html 4.01 transitional//", i5)) {
                this.zzZr3 = 1;
                return;
            }
        }
        this.zzZr3 = 0;
    }

    private static boolean zzW(zzZK8 zzzk8) {
        return (zzzk8.zzL6("color") == null && zzzk8.zzL6(OptionalModuleUtils.FACE) == null && zzzk8.zzL6("size") == null) ? false : true;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:37:0x009c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private boolean zzX(zzZEE zzzee, boolean z) {
        int iZzTP = zzUR.zzTP(zzzee.getName());
        if (iZzTP != 0) {
            if (iZzTP != 9) {
                if (iZzTP != 87) {
                    switch (iZzTP) {
                        case 32:
                            zzZIG zzzig = this.zzYkx;
                            this.zzYkx = null;
                            if (zzzig != null && zzf(zzzig)) {
                                zzK3("");
                                this.zzYkw.zzY(zzzig);
                            }
                            break;
                        case 33:
                        case 34:
                        case 35:
                        case 36:
                        case 37:
                        case 38:
                        case 39:
                        case 40:
                        case 41:
                        case 42:
                        case 43:
                        case 44:
                        case 45:
                        case 46:
                        case 47:
                        case 48:
                        case 49:
                        case 50:
                        case 51:
                        case 53:
                        case 54:
                        case 55:
                        case 62:
                        case 63:
                            if (zzYZ(zzzee.getName(), "http://www.w3.org/1999/xhtml")) {
                                zzK3("");
                                zzK4(zzzee.getName());
                            }
                            break;
                        case 52:
                            if (zzYY(zzzee.getName(), "http://www.w3.org/1999/xhtml")) {
                                zzK6(zzzee.getName());
                            } else {
                                zzZ(ContextChain.TAG_PRODUCT, new zzZK8(), true, z);
                            }
                            break;
                        case 56:
                        case 57:
                        case 58:
                        case 59:
                        case 60:
                        case 61:
                            if (zzYXE()) {
                                zzK3("");
                                zzYXO();
                            }
                            break;
                        case 64:
                            if (zzYX(zzzee.getName(), "http://www.w3.org/1999/xhtml")) {
                                zzK6(zzzee.getName());
                            }
                            break;
                        case 65:
                        case 66:
                            if (zzYZ(zzzee.getName(), "http://www.w3.org/1999/xhtml")) {
                                zzK6(zzzee.getName());
                            }
                            break;
                        default:
                            switch (iZzTP) {
                                case 68:
                                    break;
                                case 69:
                                case 70:
                                case 71:
                                case 72:
                                case 73:
                                case 74:
                                case 75:
                                case 76:
                                case 77:
                                case 78:
                                case 79:
                                case 80:
                                case 81:
                                case 82:
                                    zzK7(zzzee.getName());
                                    break;
                                case 83:
                                case 84:
                                case 85:
                                    if (zzYZ(zzzee.getName(), "http://www.w3.org/1999/xhtml")) {
                                        zzK3("");
                                        zzK4(zzzee.getName());
                                        this.zzYkv.zzZ4s();
                                    }
                                    break;
                                default:
                                    zzK5(zzzee.getName());
                                    break;
                            }
                            break;
                    }
                    return false;
                }
                zzVc(z);
                zzZ(zzzee.getName(), new zzZK8(), false, z);
                this.zzYkB = false;
                return false;
            }
            if (zzYZ("body", "http://www.w3.org/1999/xhtml")) {
                this.zzYkD = 17;
                return false;
            }
        } else if (zzYZ("body", "http://www.w3.org/1999/xhtml")) {
            this.zzYkD = 17;
            return true;
        }
        return false;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to find 'out' block for switch in B:39:0x00b5. Please report as an issue. */
    /* JADX WARN: Failed to find 'out' block for switch in B:46:0x00de. Please report as an issue. */
    /* JADX WARN: Failed to find 'out' block for switch in B:52:0x0106. Please report as an issue. */
    /* JADX WARN: Failed to find 'out' block for switch in B:59:0x0144. Please report as an issue. */
    /* JADX WARN: Failed to find 'out' block for switch in B:76:0x01bc. Please report as an issue. */
    /* JADX WARN: Failed to find 'out' block for switch in B:85:0x01f7. Please report as an issue. */
    /* JADX WARN: Failed to find 'out' block for switch in B:92:0x024e. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:5:0x0004  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private void zzZ(zzZEE zzzee) {
        while (true) {
            boolean zZzZ = true;
            while (zZzZ) {
                switch (this.zzYkD) {
                    case 0:
                        this.zzZr3 = 2;
                        this.zzYkD = 1;
                        break;
                    case 1:
                        if ("html".equals(zzzee.getName())) {
                            zzZIG zzzigZzZ = zzZ("html", "http://www.w3.org/1999/xhtml", zzzee.zzZ2B(), true);
                            this.zzYkz = zzzigZzZ;
                            for (zzZK9 zzzk9 : zzzigZzZ.zzZ2B()) {
                                if ("urn:schemas-microsoft-com:vml".equals(zzzk9.getValue()) && com.aspose.words.internal.zzZKN.zzS(zzzk9.getName(), "xmlns:", com.aspose.words.internal.zzZOF.ORDINAL$4894b8c8)) {
                                    String strSubstring = zzzk9.getName().substring(6);
                                    if (com.aspose.words.internal.zzZYD.zzXk(strSubstring) && strSubstring.indexOf(58) < 0) {
                                        this.zzYkE = strSubstring.concat(C18241k5.f55433h);
                                    }
                                }
                            }
                            zZzZ = false;
                        } else {
                            this.zzYkz = zzZ("html", "http://www.w3.org/1999/xhtml", new zzZK8(), true);
                            zZzZ = true;
                        }
                        this.zzYkD = 2;
                        break;
                    case 2:
                        int iZzTP = zzUR.zzTP(zzzee.getName());
                        if (iZzTP == 0) {
                            zzZ(zzzee.zzZ2B(), 0);
                        } else if (iZzTP != 1) {
                            this.zzYky = zzZ("head", new zzZK8(), true, false);
                            this.zzYkD = 3;
                        } else {
                            this.zzYky = zzZ("head", zzzee.zzZ2B(), true, false);
                            this.zzYkD = 3;
                        }
                        break;
                    case 3:
                        zZzZ = zzZ(zzzee, false);
                        break;
                    case 4:
                        switch (zzUR.zzTP(zzzee.getName())) {
                            case 0:
                                zzZ(zzzee.zzZ2B(), 0);
                                break;
                            case 1:
                            case 8:
                                break;
                            case 2:
                            case 3:
                            case 4:
                                zzZ(zzzee.getName(), zzzee.zzZ2B(), false, false);
                                break;
                            case 5:
                                zzZ(zzzee.getName(), zzzee.zzZ2B(), false, false);
                                break;
                            case 6:
                            case 7:
                                zzZ(zzzee.getName(), zzzee.zzZ2B(), true, false);
                                zzYXT();
                                break;
                            default:
                                this.zzYkw.zzZ09();
                                this.zzYkD = 3;
                                break;
                        }
                        while (zZzZ) {
                        }
                        break;
                    case 5:
                        switch (zzUR.zzTP(zzzee.getName())) {
                            case 0:
                                zZzZ = zzY(zzzee, false);
                                break;
                            case 1:
                                break;
                            case 2:
                            case 3:
                            case 4:
                            case 5:
                            case 6:
                            case 7:
                            case 11:
                            case 12:
                            case 13:
                                this.zzYkw.zzZ(this.zzYky);
                                zZzZ = zzZ(zzzee, false);
                                this.zzYkw.zzY(this.zzYky);
                                break;
                            case 8:
                            default:
                                zzZ("body", new zzZK8(), true, false);
                                this.zzYkD = 6;
                                break;
                            case 9:
                                zzZ(zzzee.getName(), zzzee.zzZ2B(), true, false);
                                this.zzYkB = false;
                                this.zzYkD = 6;
                                break;
                            case 10:
                                zzZ(zzzee.getName(), zzzee.zzZ2B(), true, false);
                                this.zzYkD = 18;
                                break;
                        }
                        while (zZzZ) {
                        }
                        break;
                    case 6:
                        zZzZ = zzY(zzzee, false);
                        break;
                    case 7:
                        break;
                    case 8:
                        zZzZ = zzX(zzzee);
                        break;
                    case 9:
                        zzYXq();
                        break;
                    case 10:
                        switch (zzUR.zzTP(zzzee.getName())) {
                            case 14:
                            case 15:
                            case 16:
                            case 17:
                            case 18:
                            case 19:
                            case 20:
                            case 21:
                            case 22:
                                if (zzYW("caption", "http://www.w3.org/1999/xhtml")) {
                                    zzK3("");
                                    zzK4("caption");
                                    this.zzYkv.zzZ4s();
                                    this.zzYkD = 8;
                                }
                                break;
                            default:
                                zZzZ = zzY(zzzee, false);
                                break;
                        }
                        while (zZzZ) {
                        }
                        break;
                    case 11:
                        int iZzTP2 = zzUR.zzTP(zzzee.getName());
                        if (iZzTP2 == 0) {
                            zZzZ = zzY(zzzee, false);
                        } else if (iZzTP2 != 15) {
                            if (!zzYXw()) {
                                this.zzYkw.zzZ09();
                                this.zzYkD = 8;
                            }
                        } else {
                            zzZ(zzzee.getName(), zzzee.zzZ2B(), false, false);
                        }
                        break;
                    case 12:
                        switch (zzUR.zzTP(zzzee.getName())) {
                            case 14:
                            case 15:
                            case 16:
                            case 17:
                            case 19:
                            case 21:
                                if (zzYXD()) {
                                    zzYXL();
                                    this.zzYkw.zzZ09();
                                    this.zzYkD = 8;
                                }
                                break;
                            case 18:
                            case 20:
                                zzYXL();
                                zzZ(TranslateLanguage.TURKISH, new zzZK8(), true, false);
                                this.zzYkD = 13;
                                break;
                            case 22:
                                zzYXL();
                                zzZ(zzzee.getName(), zzzee.zzZ2B(), true, false);
                                this.zzYkD = 13;
                                break;
                            default:
                                zZzZ = zzX(zzzee);
                                break;
                        }
                        while (zZzZ) {
                        }
                        break;
                    case 13:
                        switch (zzUR.zzTP(zzzee.getName())) {
                            case 14:
                            case 15:
                            case 16:
                            case 17:
                            case 19:
                            case 21:
                            case 22:
                                if (zzYW(TranslateLanguage.TURKISH, "http://www.w3.org/1999/xhtml")) {
                                    zzYXK();
                                    this.zzYkw.zzZ09();
                                    this.zzYkD = 12;
                                }
                                break;
                            case 18:
                            case 20:
                                zzYXK();
                                zzZ(zzzee.getName(), zzzee.zzZ2B(), true, false);
                                this.zzYkD = 14;
                                this.zzYkv.zzZ4t();
                                break;
                            default:
                                zZzZ = zzX(zzzee);
                                break;
                        }
                        while (zZzZ) {
                        }
                        break;
                    case 14:
                        switch (zzUR.zzTP(zzzee.getName())) {
                            case 14:
                            case 15:
                            case 16:
                            case 17:
                            case 18:
                            case 19:
                            case 20:
                            case 21:
                            case 22:
                                if (zzYXC()) {
                                    zzK3("");
                                    zzYXN();
                                    this.zzYkv.zzZ4s();
                                    this.zzYkD = 13;
                                }
                                break;
                            default:
                                zZzZ = zzY(zzzee, false);
                                break;
                        }
                        while (zZzZ) {
                        }
                        break;
                    case 15:
                        zZzZ = zzY(zzzee);
                        break;
                    case 16:
                        int iZzTP3 = zzUR.zzTP(zzzee.getName());
                        if (iZzTP3 != 14) {
                            switch (iZzTP3) {
                                case 17:
                                case 18:
                                case 19:
                                case 20:
                                case 21:
                                case 22:
                                case 23:
                                    break;
                                default:
                                    zZzZ = zzY(zzzee);
                                    break;
                            }
                            while (zZzZ) {
                            }
                        }
                        if (zzYV("select", "http://www.w3.org/1999/xhtml")) {
                            zzK4("select");
                            zzYXU();
                        }
                        break;
                    case 17:
                    case 20:
                        if (zzUR.zzTP(zzzee.getName()) != 0) {
                            this.zzYkD = 6;
                        } else {
                            zZzZ = zzY(zzzee, false);
                        }
                        break;
                    case 18:
                        int iZzTP4 = zzUR.zzTP(zzzee.getName());
                        if (iZzTP4 == 0) {
                            zZzZ = zzY(zzzee, false);
                        } else if (iZzTP4 == 6) {
                            zZzZ = zzZ(zzzee, false);
                        } else if (iZzTP4 == 10) {
                            zzZ(zzzee.getName(), zzzee.zzZ2B(), true, false);
                        } else if (iZzTP4 == 24) {
                            zzZ(zzzee.getName(), zzzee.zzZ2B(), false, false);
                        }
                        break;
                    case 19:
                        int iZzTP5 = zzUR.zzTP(zzzee.getName());
                        if (iZzTP5 != 0) {
                            zZzZ = iZzTP5 != 6 ? false : zzZ(zzzee, false);
                        } else {
                            zZzZ = zzY(zzzee, false);
                        }
                        break;
                    case 21:
                        int iZzTP6 = zzUR.zzTP(zzzee.getName());
                        if (iZzTP6 == 0) {
                            zZzZ = zzY(zzzee, false);
                        } else if (iZzTP6 == 6) {
                            zZzZ = zzZ(zzzee, false);
                        }
                        break;
                    default:
                        throw new IllegalStateException("Unknown insertion mode.");
                }
            }
            return;
        }
    }

    private void zzX(zzZED zzzed) {
        zzP(new zzZEC(zzzed.zz0T()));
    }

    private static void zzX(zzZK8 zzzk8) {
        zzzk8.rename("attributename", "attributeName");
        zzzk8.rename("attributetype", "attributeType");
        zzzk8.rename("basefrequency", "baseFrequency");
        zzzk8.rename("baseprofile", "baseProfile");
        zzzk8.rename("calcmode", "calcMode");
        zzzk8.rename("clippathunits", "clipPathUnits");
        zzzk8.rename("contentscripttype", "contentScriptType");
        zzzk8.rename("contentstyletype", "contentStyleType");
        zzzk8.rename("diffuseconstant", "diffuseConstant");
        zzzk8.rename("edgemode", "edgeMode");
        zzzk8.rename("externalresourcesrequired", "externalResourcesRequired");
        zzzk8.rename("filterres", "filterRes");
        zzzk8.rename("filterunits", "filterUnits");
        zzzk8.rename("glyphref", "glyphRef");
        zzzk8.rename("gradienttransform", "gradientTransform");
        zzzk8.rename("gradientunits", "gradientUnits");
        zzzk8.rename("kernelmatrix", "kernelMatrix");
        zzzk8.rename("kernelunitlength", "kernelUnitLength");
        zzzk8.rename("keypoints", "keyPoints");
        zzzk8.rename("keysplines", "keySplines");
        zzzk8.rename("keytimes", "keyTimes");
        zzzk8.rename("lengthadjust", "lengthAdjust");
        zzzk8.rename("limitingconeangle", "limitingConeAngle");
        zzzk8.rename("markerheight", "markerHeight");
        zzzk8.rename("markerunits", "markerUnits");
        zzzk8.rename("markerwidth", "markerWidth");
        zzzk8.rename("maskcontentunits", "maskContentUnits");
        zzzk8.rename("maskunits", "maskUnits");
        zzzk8.rename("numoctaves", "numOctaves");
        zzzk8.rename("pathlength", "pathLength");
        zzzk8.rename("patterncontentunits", "patternContentUnits");
        zzzk8.rename("patterntransform", "patternTransform");
        zzzk8.rename("patternunits", "patternUnits");
        zzzk8.rename("pointsatx", "pointsAtX");
        zzzk8.rename("pointsaty", "pointsAtY");
        zzzk8.rename("pointsatz", "pointsAtZ");
        zzzk8.rename("preservealpha", "preserveAlpha");
        zzzk8.rename("preserveaspectratio", "preserveAspectRatio");
        zzzk8.rename("primitiveunits", "primitiveUnits");
        zzzk8.rename("refx", "refX");
        zzzk8.rename("refy", "refY");
        zzzk8.rename("repeatcount", "repeatCount");
        zzzk8.rename("repeatdur", "repeatDur");
        zzzk8.rename("requiredextensions", "requiredExtensions");
        zzzk8.rename("requiredfeatures", "requiredFeatures");
        zzzk8.rename("specularconstant", "specularConstant");
        zzzk8.rename("specularexponent", "specularExponent");
        zzzk8.rename("spreadmethod", "spreadMethod");
        zzzk8.rename("startoffset", "startOffset");
        zzzk8.rename("stddeviation", "stdDeviation");
        zzzk8.rename("stitchtiles", "stitchTiles");
        zzzk8.rename("surfacescale", "surfaceScale");
        zzzk8.rename("systemlanguage", "systemLanguage");
        zzzk8.rename("tablevalues", "tableValues");
        zzzk8.rename("targetx", "targetX");
        zzzk8.rename("targety", "targetY");
        zzzk8.rename("textlength", "textLength");
        zzzk8.rename("viewbox", "viewBox");
        zzzk8.rename("viewtarget", "viewTarget");
        zzzk8.rename("xchannelselector", "xChannelSelector");
        zzzk8.rename("ychannelselector", "yChannelSelector");
        zzzk8.rename("zoomandpan", "zoomAndPan");
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    private boolean zzZ(zzZEE zzzee, boolean z) {
        int iZzTP = zzUR.zzTP(zzzee.getName());
        if (iZzTP != 25) {
            switch (iZzTP) {
                case 0:
                    zzZ(zzzee.zzZ2B(), 0);
                    return false;
                case 1:
                    return false;
                case 2:
                case 3:
                case 4:
                    break;
                case 5:
                    zzZ(zzzee.getName(), zzzee.zzZ2B(), false, z);
                    return false;
                case 6:
                case 7:
                    zzZ(zzzee.getName(), zzzee.zzZ2B(), true, z);
                    zzYXT();
                    return false;
                case 8:
                    if (this.zzYkt) {
                        zzZ(zzzee.getName(), zzzee.zzZ2B(), true, z);
                        zzYXT();
                        return false;
                    }
                    zzZ(zzzee.getName(), zzzee.zzZ2B(), true, z);
                    this.zzYkD = 4;
                    return false;
                default:
                    switch (iZzTP) {
                        case 11:
                            break;
                        case 12:
                            zzZ(zzzee.getName(), zzzee.zzZ2B(), true, z);
                            zzYXS();
                            return false;
                        case 13:
                            zzZ(zzzee.getName(), zzzee.zzZ2B(), true, z);
                            zzYXR();
                            return false;
                        default:
                            this.zzYkw.zzZ09();
                            this.zzYkD = 5;
                            return true;
                    }
                    break;
            }
        }
        zzZ(zzzee.getName(), zzzee.zzZ2B(), false, z);
        return false;
    }

    private void zzY(zzZEB zzzeb) {
        zzZED zzzed = new zzZED(zzzeb.getText());
        if (zzzed.zzYYl()) {
            this.zzYkB = false;
        }
        zzzed.zzYYi();
        zzY(zzzed);
    }

    private void zzZ(zzZEB zzzeb) {
        zzZED zzzed = new zzZED(zzzeb.getText());
        if (this.zzYkA) {
            zzzed.zzYYn();
            this.zzYkA = false;
            if (zzzed.isEmpty()) {
                return;
            }
        }
        while (true) {
            switch (this.zzYkD) {
                case 0:
                    zzzed.zzYYk();
                    if (zzzed.isEmpty()) {
                        return;
                    }
                    this.zzZr3 = 2;
                    this.zzYkD = 1;
                    break;
                case 1:
                    zzzed.zzYYk();
                    if (zzzed.isEmpty()) {
                        return;
                    }
                    this.zzYkz = zzZ("html", "http://www.w3.org/1999/xhtml", new zzZK8(), true);
                    this.zzYkD = 2;
                    break;
                case 2:
                    zzzed.zzYYk();
                    if (zzzed.isEmpty()) {
                        return;
                    }
                    this.zzYky = zzZ("head", new zzZK8(), true, false);
                    this.zzYkD = 3;
                    break;
                case 3:
                    String strZzYYh = zzzed.zzYYh();
                    if (!com.aspose.words.internal.zzZKN.equals(strZzYYh, "")) {
                        zzK1(strZzYYh);
                    }
                    zzzed.zzYYk();
                    if (zzzed.isEmpty()) {
                        return;
                    }
                    this.zzYkw.zzZ09();
                    this.zzYkD = 5;
                    break;
                case 4:
                    String strZzYYh2 = zzzed.zzYYh();
                    if (!com.aspose.words.internal.zzZKN.equals(strZzYYh2, "")) {
                        zzK1(strZzYYh2);
                    }
                    zzzed.zzYYk();
                    if (zzzed.isEmpty()) {
                        return;
                    }
                    this.zzYkw.zzZ09();
                    this.zzYkD = 3;
                    break;
                case 5:
                    String strZzYYh3 = zzzed.zzYYh();
                    if (!com.aspose.words.internal.zzZKN.equals(strZzYYh3, "")) {
                        zzK1(strZzYYh3);
                    }
                    zzzed.zzYYk();
                    if (zzzed.isEmpty()) {
                        return;
                    }
                    zzZ("body", new zzZK8(), true, false);
                    this.zzYkD = 6;
                    break;
                case 6:
                case 10:
                case 14:
                    zzzed.zzYYj();
                    if (zzzed.isEmpty()) {
                        return;
                    }
                    zzVc(false);
                    zzY(zzzed);
                    if (zzzed.zzYYm()) {
                        this.zzYkB = false;
                        return;
                    }
                    return;
                case 7:
                    if (zzzed.isEmpty()) {
                        return;
                    }
                    zzY(zzzed);
                    return;
                case 8:
                case 12:
                case 13:
                    if (zzYXA()) {
                        this.zzYku.clear();
                        this.zzYkC = this.zzYkD;
                        this.zzYkD = 9;
                    } else {
                        zzzed.zzYYj();
                        if (zzzed.isEmpty()) {
                            return;
                        }
                        zzVc(false);
                        zzY(zzzed);
                        if (zzzed.zzYYm()) {
                            this.zzYkB = false;
                            return;
                        }
                        return;
                    }
                    break;
                case 9:
                    zzzed.zzYYj();
                    if (zzzed.isEmpty()) {
                        return;
                    }
                    this.zzYku.zzZ(zzzed);
                    return;
                case 11:
                    String strZzYYh4 = zzzed.zzYYh();
                    if (!com.aspose.words.internal.zzZKN.equals(strZzYYh4, "")) {
                        zzK1(strZzYYh4);
                    }
                    zzzed.zzYYk();
                    if (zzzed.isEmpty() || this.zzYkw.getCount() <= 1) {
                        return;
                    }
                    this.zzYkw.zzZ09();
                    this.zzYkD = 8;
                    break;
                case 15:
                case 16:
                    zzzed.zzYYj();
                    if (zzzed.isEmpty()) {
                        return;
                    }
                    zzY(zzzed);
                    return;
                case 17:
                case 20:
                    String strZzYYh5 = zzzed.zzYYh();
                    if (!com.aspose.words.internal.zzZKN.equals(strZzYYh5, "")) {
                        zzVc(false);
                        zzK1(strZzYYh5);
                        this.zzYkB = true;
                    }
                    zzzed.zzYYk();
                    if (zzzed.isEmpty()) {
                        return;
                    } else {
                        this.zzYkD = 6;
                    }
                    break;
                case 18:
                case 19:
                    String strZzYYg = zzzed.zzYYg();
                    if (!com.aspose.words.internal.zzZKN.equals(strZzYYg, "")) {
                        zzVc(false);
                        zzK1(strZzYYg);
                    }
                    zzzed.clear();
                    return;
                case 21:
                    String strZzYYg2 = zzzed.zzYYg();
                    if (!com.aspose.words.internal.zzZKN.equals(strZzYYg2, "")) {
                        zzVc(false);
                        zzK1(strZzYYg2);
                    }
                    zzzed.clear();
                    return;
                default:
                    throw new IllegalStateException("Unknown insertion mode.");
            }
        }
    }

    private void zzY(zzZED zzzed) {
        zzK1(zzzed.zz0T());
    }

    private static void zzY(zzZK8 zzzk8) {
        zzzk8.rename("definitionurl", "definitionURL");
    }

    private void zzZ(zzZK8 zzzk8, int i) {
        zzZIG zzzigZzAb = this.zzYkw.zzAb(i);
        Iterator<zzZK9> it = zzzk8.iterator();
        while (it.hasNext()) {
            zzzigZzAb.zzZ2B().zzY(it.next());
        }
    }

    private zzZIG zzZ(String str, String str2, zzZK8 zzzk8, boolean z) {
        zzZIG zzzig = new zzZIG(str, str2, zzzk8);
        if (z) {
            this.zzYkw.zzZ(zzzig);
        }
        return zzzig;
    }

    private zzZIG zzZ(String str, zzZK8 zzzk8, boolean z, boolean z2) {
        return zzZ(str, "http://www.w3.org/1999/xhtml", zzzk8, z, z2);
    }

    private zzZIG zzZ(String str, String str2, zzZK8 zzzk8, boolean z, boolean z2) {
        zzZIG zzzig = new zzZIG(str, str2, zzzk8);
        if (z2 && zzYXA()) {
            zzP(zzzig);
        } else {
            zzQ(zzzig);
        }
        if (z) {
            this.zzYkw.zzZ(zzzig);
        }
        return zzzig;
    }
}
