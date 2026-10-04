package com.aspose.words;

import androidx.core.view.InputDeviceCompat;
import com.aspose.words.ref.Ref;
import com.aspose.words.ref.RefInt;
import com.google.firebase.firestore.local.SQLitePersistence;
import com.microsoft.identity.common.java.telemetry.TelemetryEventStrings;
import com.orion.penkit.tools.DrawToolFactory;

/* JADX INFO: loaded from: classes6.dex */
final class zzYRN {
    private static final com.aspose.words.internal.zzZHW zzUR = new com.aspose.words.internal.zzZHW("wrap-option", "wrap", "auto-grow-height", "auto-grow-width", "clip", "run-through", "background-color", "background-transparency", "opacity", "luminance", "contrast", "color-mode", "writing-mode", "stroke-dash-names", "marker-start-center", "marker-end-center", "ambient-color", "backface-culling", "back-scale", "close-back", "close-front", "depth", "diffuse-color", "edge-rounding", "edge-rounding-mode", "emissive-color", "end-angle", "horizontal-segments", "lighting-mode", "normals-direction", "normals-kind", "shininess", "specular-color", "texture-filter", "texture-generation-mode-x", "texture-generation-mode-y", "texture-kind", "texture-mode", "vertical-segments", "blue", "caption-angle", "caption-angle-type", "caption-escape", "caption-escape-direction", "caption-fit-line-length", "caption-gap", "caption-line-length", "caption-type", "color-inversion", "decimal-places", "draw-aspect", "end-guide", "end-line-spacing-horizontal", "end-line-spacing-vertical", "fill-hatch-name", "fill-hatch-solid", "fill-image-height", "fill-image-name", "fill-image-ref-point", "fill-image-ref-point-x", "fill-image-ref-point-y", "fill-image-width", "fit-to-contour", "fit-to-size", "frame-display-border", "frame-display-scrollbar", "frame-margin-horizontal", "frame-margin-vertical", "gamma", "gradient-step-count", "green", "guide-distance", "guide-overhang", "image-opacity", "line-distance", "measure-align", "measure-vertical-align", "ole-draw-aspect", "opacity-name", "parallel", "placing", "red", "show-unit", "start-guide", "start-line-spacing-horizontal", "start-line-spacing-vertical", "stroke-linejoin", "symbol-color", "textarea-horizontal-align", "textarea-vertical-align", "tile-repeat-offset", "unit", "visible-area-height", "visible-area-left", "visible-area-top", "visible-area-width", "wrap-influence-on-position", "max-height", "max-width", "min-height", "min-width", "border-line-width", "border-line-width-bottom", "border-line-width-left", "border-line-width-right", "border-line-width-top", "editable", "flow-with-text", "mirror", "number-wrapped-paragraphs", "overflow-behavior", "print-content", "protect", "rel-height", "rel-width", "repeat", "shrink-to-fit", "wrap-contour", "wrap-contour-mode", "wrap-dynamic-threshold", "fill-rule", "height", "stroke-linecap", "width", "x", "y", "anchor-page-number", "anchor-type", "animation", "animation-delay", "animation-direction", "animation-repeat", "animation-start-inside", "animation-steps", "animation-stop-inside", "marker-start", "marker-end", "marker-start-width", "marker-end-width", "fill-color", "secondary-fill-color", "fill-gradient-name", "fill", "shadow-color", "shadow", "shadow-opacity", "shadow-offset-x", "shadow-offset-y", "stroke-width", "stroke-color", "stroke-opacity", "stroke", "stroke-dash", "horizontal-pos", "horizontal-rel", "vertical-pos", "vertical-rel", "greyscale", "mono", "background-image", "columns", "list-style");

    private static void zzU(zzYC3 zzyc3) {
        Object objZzPk = zzyc3.zzPk(508);
        if (objZzPk == null || ((Boolean) objZzPk).booleanValue()) {
            return;
        }
        zzyc3.remove(448);
    }

    private static boolean zzW(zzYQ7 zzyq7, zzYC3 zzyc3) {
        zzYQ9 zzyq9ZzYuT = zzyq7.zzYuT();
        String value = zzyq9ZzYuT.getValue();
        switch (zzUR.zzTP(zzyq9ZzYuT.getLocalName())) {
            case 143:
                zzyc3.zzQ(InputDeviceCompat.SOURCE_DPAD, zzYOU.zzDu(value));
                return true;
            case 144:
                zzY(zzyq7, zzyc3, zzyq9ZzYuT.getPrefix(), value);
                return true;
            case 145:
                zzyc3.zzQ(516, Integer.valueOf(zzYOU.zzDt(value)));
                return true;
            case 146:
                zzyc3.zzQ(517, Integer.valueOf(zzYSF.zzFU(value)));
                return true;
            case 147:
                zzyc3.zzQ(518, Integer.valueOf(zzYSF.zzFU(value)));
                return true;
            default:
                return false;
        }
    }

    private static boolean zzX(zzYQ7 zzyq7, zzYC3 zzyc3, Ref<String> ref, Ref<String> ref2) {
        zzYQ9 zzyq9ZzYuT = zzyq7.zzYuT();
        String value = zzyq9ZzYuT.getValue();
        switch (zzUR.zzTP(zzyq9ZzYuT.getLocalName())) {
            case 148:
                zzyc3.zzQ(459, Integer.valueOf(zzYSF.zzFU(value)));
                return true;
            case 149:
                zzyc3.zzQ(448, zzYOU.zzDu(value));
                return true;
            case 150:
                zzyc3.zzQ(449, Integer.valueOf(zzYOU.zzDt(value)));
                return true;
            case 151:
                ref.set(zzZ(zzyc3, value));
                return true;
            case 152:
                ref2.set(zzYOU.zzDr(value));
                return true;
            default:
                return false;
        }
    }

    private static void zzY(zzYQ7 zzyq7, zzYRL zzyrl, zzYC3 zzyc3) {
        zzYQ9 zzyq9ZzYuT = zzyq7.zzYuT();
        String str = null;
        String str2 = null;
        String str3 = null;
        String str4 = "";
        String str5 = str4;
        int i = 0;
        String str6 = null;
        while (true) {
            boolean z = true;
            if (!zzyq9ZzYuT.zzi()) {
                zzZ(zzyc3, i);
                zzZ(zzyq7, zzyc3, str, str6);
                zzZ(zzyc3, zzyrl, !"none".equals(str6));
                if (zzyq7.zzYuz()) {
                    zzZ(zzyrl, zzyc3);
                }
                zzZ(str4, (zzZS) zzyc3, true);
                zzZ(str5, (zzZS) zzyc3, false);
                zzZ(zzyq7, (zzZS) zzyc3, str3, str2);
                zzU(zzyc3);
                return;
            }
            boolean z2 = zzYQ7.zzZ(zzyq9ZzYuT, zzyrl.zzYvh()) || zzYQ7.zzZ(zzyq9ZzYuT, zzyrl.zzYvQ()) || zzYQ7.zzZ(zzyq9ZzYuT, zzyrl.zzYvg());
            RefInt refInt = new RefInt(i);
            Ref ref = new Ref(str6);
            Ref ref2 = new Ref(str);
            Ref ref3 = new Ref(str2);
            Ref ref4 = new Ref(str3);
            Ref ref5 = new Ref(str4);
            Ref ref6 = new Ref(str5);
            if (!zzW(zzyq7, zzyc3) && !zzZ(zzyq7, zzyc3, refInt) && !zzX(zzyq7, zzyc3, ref, ref2) && !zzY(zzyq7, zzyc3, (Ref<String>) ref3, (Ref<String>) ref4) && !zzZ(zzyq7, zzyc3, (Ref<String>) ref5, (Ref<String>) ref6)) {
                z = false;
            }
            int i2 = refInt.get();
            String str7 = (String) ref.get();
            String str8 = (String) ref2.get();
            String str9 = (String) ref3.get();
            String str10 = (String) ref4.get();
            String str11 = (String) ref5.get();
            String str12 = (String) ref6.get();
            if (!z2 && !z) {
                String value = zzyq9ZzYuT.getValue();
                switch (zzUR.zzTP(zzyq9ZzYuT.getLocalName())) {
                    case 0:
                        zzyc3.zzQ(133, Integer.valueOf("no-wrap".equals(value) ? 2 : 0));
                        break;
                    case 1:
                        zzyc3.zzQ(EditingLanguage.ARABIC_LIBYA, Integer.valueOf(zzYS3.zzFb(value)));
                        zzyc3.zzQ(InputDeviceCompat.SOURCE_TOUCHSCREEN, Integer.valueOf(zzYS3.zzF9(value)));
                        break;
                    case 2:
                    case 3:
                        zzyc3.zzQ(190, Boolean.valueOf(TelemetryEventStrings.Value.TRUE.equals(value)));
                        break;
                    case 4:
                        zzZ(zzyrl, value);
                        break;
                    case 5:
                        zzyc3.zzQ(954, Boolean.valueOf("background".equals(value)));
                        break;
                    case 6:
                        if (zzyc3.zzPk(385) == null) {
                            zzyc3.zzQ(385, zzYOU.zzDu(value));
                            zzyc3.zzQ(443, Boolean.TRUE);
                        }
                        break;
                    case 7:
                        zzyc3.zzQ(386, Integer.valueOf(zzYOU.zzDs(value)));
                        break;
                    case 8:
                        zzyc3.zzQ(386, Integer.valueOf(zzYOU.zzDt(value)));
                        break;
                    case 9:
                        zzyc3.zzQ(StyleIdentifier.BIBLIOGRAPHY, Integer.valueOf(zzYOU.zzDz(value)));
                        break;
                    case 10:
                        zzyc3.zzQ(StyleIdentifier.BOOK_TITLE, Integer.valueOf(zzYOU.zzDA(value)));
                        break;
                    case 11:
                        zzY(zzyq7, zzyc3, value);
                        break;
                    case 12:
                        if ("tb-rl".equals(value) || "tb-lr".equals(value) || "tb".equals(value)) {
                            zzyc3.zzQ(136, 3);
                        }
                        break;
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
                    case 83:
                    case 84:
                    case 85:
                    case 86:
                    case 87:
                    case 88:
                    case 89:
                    case 90:
                    case 91:
                    case 92:
                    case 93:
                    case 94:
                    case 95:
                    case 96:
                    case 97:
                    case 98:
                    case 99:
                    case 100:
                    case 101:
                    case 102:
                    case 103:
                    case 104:
                    case 105:
                    case 106:
                    case 107:
                    case 108:
                    case 109:
                    case 110:
                    case 111:
                    case 112:
                    case 113:
                    case 114:
                    case 115:
                    case 116:
                    case 117:
                    case 118:
                    case 119:
                    case 120:
                    case 121:
                    case 122:
                    case 123:
                    case 124:
                    case 125:
                    case 126:
                    case 127:
                    case 128:
                    case 129:
                    case 130:
                    case 131:
                    case 132:
                    case 133:
                    case 134:
                        zzyq7.zzZ(256, false, "style:graphic-properties");
                        break;
                    default:
                        zzyq7.zzYi("style:graphic-properties", zzyq9ZzYuT.getLocalName());
                        break;
                }
            }
            str2 = str9;
            str = str8;
            str6 = str7;
            i = i2;
            str5 = str12;
            str4 = str11;
            str3 = str10;
        }
    }

    public static void zzZ(zzYQ7 zzyq7, zzYRL zzyrl) {
        zzYC3 zzyc3ZzZ = zzZ(zzyq7, zzyrl, new zzYC3());
        zzY(zzyq7, zzyrl, zzyc3ZzZ);
        zzq(zzyq7);
        if (zzyc3ZzZ.getCount() > 0) {
            zzyrl.zzS(zzyc3ZzZ);
        }
    }

    private static void zzq(zzYQ7 zzyq7) {
        zzYQ9 zzyq9ZzYuT = zzyq7.zzYuT();
        while (zzyq9ZzYuT.zzQ("graphic-properties")) {
            switch (zzUR.zzTP(zzyq9ZzYuT.getLocalName())) {
                case 159:
                    zzyq7.zzZ(1, true, "style:graphic-properties");
                    break;
                case 160:
                case 161:
                    zzyq7.zzZ(256, true, "style:graphic-properties");
                    break;
                default:
                    zzyq9ZzYuT.zzk();
                    break;
            }
        }
    }

    private static zzYC3 zzZ(zzYQ7 zzyq7, zzYRL zzyrl, zzYC3 zzyc3) {
        zzYRL zzyrl2;
        if (!com.aspose.words.internal.zzZYD.zzXk(zzyrl.zzYu5()) || (zzyrl2 = (zzYRL) com.aspose.words.internal.zzZKW.zzZ(zzyq7.zzYuS().zzYh(zzyrl.zzYu5(), "graphic"), zzYRL.class)) == null || zzyrl2.zzYvW() == null) {
            return zzyc3;
        }
        zzYC3 zzyc32 = (zzYC3) zzyrl2.zzYvW().zzbn();
        zzyrl.zzZ(zzyrl2);
        return zzyc32;
    }

    private static boolean zzZ(zzYQ7 zzyq7, zzYC3 zzyc3, Ref<String> ref, Ref<String> ref2) {
        zzYQ9 zzyq9ZzYuT = zzyq7.zzYuT();
        String value = zzyq9ZzYuT.getValue();
        switch (zzUR.zzTP(zzyq9ZzYuT.getLocalName())) {
            case 135:
                zzYS3.zzZ(zzyq7, value, zzyc3, true);
                return true;
            case 136:
                zzYS3.zzZ(zzyq7, value, zzyc3, false);
                return true;
            case 137:
                ref.set(value);
                return true;
            case 138:
                ref2.set(value);
                return true;
            default:
                return false;
        }
    }

    private static boolean zzZ(zzYQ7 zzyq7, zzYC3 zzyc3, RefInt refInt) {
        zzYQ9 zzyq9ZzYuT = zzyq7.zzYuT();
        String value = zzyq9ZzYuT.getValue();
        switch (zzUR.zzTP(zzyq9ZzYuT.getLocalName())) {
            case 153:
                zzY(zzyq7, value, zzyc3);
                return true;
            case 154:
                zzZ(zzyq7, value, zzyc3);
                return true;
            case 155:
                refInt.set(zzYS3.zzF5(value));
                zzyc3.remove(913);
                return true;
            case 156:
                zzyc3.zzQ(914, Integer.valueOf(zzYS3.zzF6(value)));
                return true;
            default:
                return false;
        }
    }

    private static void zzZ(zzYC3 zzyc3, int i) {
        Object objZzPk = zzyc3.zzPk(914);
        if (objZzPk == null || ((Integer) objZzPk).intValue() != 3) {
            zzyc3.zzQ(913, Integer.valueOf(i));
        }
    }

    private static void zzZ(zzYQ7 zzyq7, zzYC3 zzyc3, String str, String str2) {
        zzYPR zzypr = (zzYPR) com.aspose.words.internal.zzZKW.zzZ(zzyq7.zzYuS().zzY(str, null, false, false), zzYPR.class);
        int iZzZ = zzYS3.zzZ(str2, zzypr);
        if (iZzZ != 0 && iZzZ != 0) {
            zzyc3.zzQ(462, Integer.valueOf(iZzZ));
        }
        if (zzypr != null) {
            if ("round".equals(zzypr.zzG7())) {
                zzyc3.zzQ(471, 0);
            } else if (com.aspose.words.internal.zzZYD.zzXk(zzypr.zzG7())) {
                zzyc3.zzQ(471, 2);
            }
        }
    }

    private static void zzZ(zzYRL zzyrl, zzYC3 zzyc3) {
        zzYQL zzyqlZzYvg = zzyrl.zzYvg();
        zzyc3.zzQ(129, Integer.valueOf(com.aspose.words.internal.zzSA.zzYC(com.aspose.words.internal.zzSA.zzu(zzyqlZzYvg.zzYvj()))));
        zzyc3.zzQ(131, Integer.valueOf(com.aspose.words.internal.zzSA.zzYC(com.aspose.words.internal.zzSA.zzu(zzyqlZzYvg.zzYvi()))));
        zzyc3.zzQ(130, Integer.valueOf(com.aspose.words.internal.zzSA.zzYC(com.aspose.words.internal.zzSA.zzu(zzyqlZzYvg.zzYvl()))));
        zzyc3.zzQ(132, Integer.valueOf(com.aspose.words.internal.zzSA.zzYC(com.aspose.words.internal.zzSA.zzu(zzyqlZzYvg.zzYvk()))));
    }

    private static String zzZ(zzYC3 zzyc3, String str) {
        if ("none".equals(str)) {
            zzyc3.zzQ(508, Boolean.FALSE);
            return str;
        }
        if ("solid".equals(str)) {
            zzyc3.zzQ(508, Boolean.TRUE);
        }
        return str;
    }

    private static boolean zzY(zzYQ7 zzyq7, zzYC3 zzyc3, Ref<String> ref, Ref<String> ref2) {
        zzYQ9 zzyq9ZzYuT = zzyq7.zzYuT();
        String value = zzyq9ZzYuT.getValue();
        switch (zzUR.zzTP(zzyq9ZzYuT.getLocalName())) {
            case 139:
                zzyc3.zzQ(385, zzYOU.zzDu(value));
                return true;
            case 140:
                zzyc3.zzQ(647, zzYOU.zzDu(value));
                return true;
            case 141:
                ref.set(value);
                return true;
            case 142:
                ref2.set(value);
                if (!"hatch".equals(value)) {
                    return true;
                }
                zzyq7.zzv("style:graphic-properties", "draw:fill", value);
                return true;
            default:
                return false;
        }
    }

    private static void zzZ(zzYQ7 zzyq7, String str, zzYC3 zzyc3) {
        if (!"char".equals(str) && !"page".equals(str)) {
            zzyq7.zzv("style:graphic-properties", "style:horizontal-rel", str);
        }
        zzyc3.zzQ(912, Integer.valueOf(zzYS3.zzF3(str)));
    }

    private static void zzZ(zzYRL zzyrl, String str) {
        String[] strArrZzR = com.aspose.words.internal.zzZKN.zzR(com.aspose.words.internal.zzZKN.zzS(str.replace(DrawToolFactory.LASSO_TYPE_RECT, "").replace("(", "").replace(")", "").replace(",", " ").replace("  ", " "), ControlChar.SPACE_CHAR), ControlChar.SPACE_CHAR);
        zzyrl.zzWI(zzYSF.zzFV(strArrZzR[0]));
        zzyrl.zzWJ(zzYSF.zzFV(strArrZzR[1]));
        zzyrl.zzWG(zzYSF.zzFV(strArrZzR[2]));
        zzyrl.zzWH(zzYSF.zzFV(strArrZzR[3]));
    }

    private static void zzY(zzYQ7 zzyq7, zzYC3 zzyc3, String str) {
        int iZzTP = zzUR.zzTP(str);
        if (iZzTP == 157) {
            zzyc3.zzQ(StyleIdentifier.GRID_TABLE_3_ACCENT_6, Boolean.TRUE);
        } else if (iZzTP != 158) {
            zzyq7.zzv("style:graphic-properties", "draw:color-mode", str);
        } else {
            zzyc3.zzQ(StyleIdentifier.GRID_TABLE_4_ACCENT_6, Boolean.TRUE);
        }
    }

    private static void zzY(zzYQ7 zzyq7, zzYC3 zzyc3, String str, String str2) {
        if ("draw".equals(str)) {
            if ("visible".equals(str2)) {
                zzyc3.zzQ(574, Boolean.TRUE);
                return;
            } else {
                if ("hidden".equals(str2)) {
                    zzyc3.zzQ(574, Boolean.FALSE);
                    return;
                }
                return;
            }
        }
        if ("style".equals(str) || "dr3d".equals(str)) {
            zzyq7.zzZ(256, false, "style:graphic-properties");
        }
    }

    private static void zzZ(zzYQ7 zzyq7, zzZS zzzs, String str, String str2) {
        zzYRP zzyrp = (zzYRP) com.aspose.words.internal.zzZKW.zzZ(zzyq7.zzYuS().zzY(str2, null, false, false), zzYRP.class);
        if (str == null) {
            return;
        }
        if ("none".equals(str)) {
            zzzs.zzQ(443, Boolean.FALSE);
            return;
        }
        zzzs.zzQ(443, Boolean.TRUE);
        zzzs.zzQ(384, Integer.valueOf(zzYS3.zzZ(str, zzyrp)));
        if (!"gradient".equals(str) || zzyrp == null) {
            return;
        }
        if (com.aspose.words.internal.zzZYD.zzXk(zzyrp.zzYwc())) {
            zzzs.zzQ(385, zzYOU.zzDu(zzyrp.zzYwc()));
        }
        if (com.aspose.words.internal.zzZYD.zzXk(zzyrp.zzYwb())) {
            zzzs.zzQ(387, zzYOU.zzDu(zzyrp.zzYwb()));
        }
        if (com.aspose.words.internal.zzZYD.zzXk(zzyrp.zzYwa())) {
            zzzs.zzQ(386, Integer.valueOf(zzYOU.zzDt(zzyrp.zzYwa())));
        }
        if (com.aspose.words.internal.zzZYD.zzXk(zzyrp.zzYw9())) {
            zzzs.zzQ(388, Integer.valueOf(zzYOU.zzDt(zzyrp.zzYw9())));
        }
        if (com.aspose.words.internal.zzZYD.zzXk(zzyrp.zzYwg())) {
            zzzs.zzQ(397, Integer.valueOf(zzYOU.zzDy(zzyrp.zzYwg())));
        }
        if (com.aspose.words.internal.zzZYD.zzXk(zzyrp.zzYwf())) {
            zzzs.zzQ(398, Integer.valueOf(zzYOU.zzDy(zzyrp.zzYwf())));
        }
        if (com.aspose.words.internal.zzZYD.zzXk(zzyrp.zzYwe())) {
            zzzs.zzQ(395, Integer.valueOf(zzYOU.zzDH(zzyrp.zzYwe()) / 10));
        }
        if ("axial".equals(zzyrp.zzG7())) {
            zzzs.zzQ(396, -1);
        }
        if ("linear".equals(zzyrp.zzG7())) {
            zzzs.zzQ(396, 100);
        }
    }

    private static void zzY(zzYQ7 zzyq7, String str, zzYC3 zzyc3) {
        if ("from-left".equals(str) || "from-inside".equals(str)) {
            zzyq7.zzv("style:graphic-properties", "style:horizontal-pos", str);
        }
        zzyc3.zzQ(911, Integer.valueOf(zzYS3.zzF2(str)));
    }

    private static boolean zzY(zzYTJ zzytj, double d, boolean z) {
        return ((zzytj == null || zzytj.getLineStyle() == 0) && !z && com.aspose.words.internal.zzAN.zzZD(d)) ? false : true;
    }

    private static void zzZ(String str, zzZS zzzs, boolean z) {
        if (com.aspose.words.internal.zzZYD.zzXk(str)) {
            int iZzFX = zzYSF.zzFX(str);
            int i = z ? 466 : 468;
            int i2 = z ? 464 : 465;
            if (iZzFX == 140) {
                zzzs.zzQ(i, 0);
                return;
            }
            if (iZzFX == 210) {
                zzzs.zzQ(i, 1);
                return;
            }
            if (iZzFX == 245) {
                zzzs.zzQ(i2, 5);
                zzzs.zzQ(i, 0);
                return;
            }
            if (iZzFX == 315) {
                zzzs.zzQ(i2, 5);
                zzzs.zzQ(i, 1);
            } else if (iZzFX == 350) {
                zzzs.zzQ(i, 2);
            } else {
                if (iZzFX != 420) {
                    return;
                }
                zzzs.zzQ(i2, 5);
                zzzs.zzQ(i, 2);
            }
        }
    }

    private static void zzZ(zzZS zzzs, zzYQB zzyqb, boolean z) {
        zzYTH zzythZzYvh = zzyqb.zzYvh();
        zzYQL zzyqlZzYvg = zzyqb.zzYvg();
        zzYR2 zzyr2ZzYvQ = zzyqb.zzYvQ();
        zzZ(zzythZzYvh.zzYy8(), zzyqlZzYvg.zzYvl(), zzyr2ZzYvQ.zzYvB().zzYsU(), zzzs, EditingLanguage.SPANISH_GUATEMALA, 901, 130, z);
        zzZ(zzythZzYvh.zzYy7(), zzyqlZzYvg.zzYvk(), zzyr2ZzYvQ.zzYvB().zzYsT(), zzzs, EditingLanguage.FRENCH_SWITZERLAND, 903, 132, z);
        zzZ(zzythZzYvh.zzYy6(), zzyqlZzYvg.zzYvj(), zzyr2ZzYvQ.zzYvC().zzYvO(), zzzs, 4107, SQLitePersistence.MAX_ARGS, 129, z);
        zzZ(zzythZzYvh.zzYy5(), zzyqlZzYvg.zzYvi(), zzyr2ZzYvQ.zzYvC().zzYvN(), zzzs, 4109, 902, 131, z);
    }

    private static void zzZ(zzYTJ zzytj, double d, double d2, zzZS zzzs, int i, int i2, int i3, boolean z) {
        zzzs.zzQ(i3, Integer.valueOf(com.aspose.words.internal.zzSA.zzYC(com.aspose.words.internal.zzSA.zzu(d))));
        if (zzY(zzytj, d, z)) {
            zzzs.zzQ(i, zzYTJ.zzZ(zzytj, d, true));
        }
        zzzs.zzQ(i2, Integer.valueOf(com.aspose.words.internal.zzSA.zzYC(com.aspose.words.internal.zzSA.zzu(d2))));
    }
}
