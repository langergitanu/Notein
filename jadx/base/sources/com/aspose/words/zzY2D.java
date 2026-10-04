package com.aspose.words;

import androidx.core.view.InputDeviceCompat;
import com.alibaba.sdk.android.oss.common.RequestParameters;
import com.facebook.common.callercontext.ContextChain;
import com.google.firebase.firestore.local.SQLitePersistence;
import com.google.firebase.messaging.Constants;
import com.google.mlkit.p567nl.translate.TranslateLanguage;
import com.huawei.hms.network.embedded.C18437z2;
import com.miui.penengine.p596e.C18773h;
import com.orion.notein.domain.models.note.NoteMeta;
import com.orion.penkit.tools.DrawToolFactory;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

/* JADX INFO: loaded from: classes6.dex */
final class zzY2D extends zzY2C implements zzZ9X {
    private static char[] zzWWh = {',', ';'};
    private static final com.aspose.words.internal.zzZHW zzUR = new com.aspose.words.internal.zzZHW("dxaOrig", "dyaOrig", "binData", "background", "bgcolor", "shapetype", "group", "shape", "polyline", "image", DrawToolFactory.LASSO_TYPE_RECT, "roundrect", "line", "oval", "scriptAnchor", "arc", "curve", "ocx", "control", "OLEObject", "language", "args", "scriptText", "id", "spid", "spt", C18437z2.f56754h, "editas", "alt", "style", "ole", "bordertopcolor", "borderleftcolor", "borderbottomcolor", "borderrightcolor", "allowincell", "allowoverlap", "coordorigin", "coordsize", "adj", "path", "points", "preferrelative", "fill", "filled", "fillcolor", "dgmlayout", "dgmnodekind", "connectortype", "stroked", "strokecolor", "strokeweight", "insetpen", "href", "target", NoteMeta.PROPERTY_TITLE, "bullet", "button", "oleicon", "bwmode", "bwpure", "bwnormal", TranslateLanguage.CROATIAN, "hrstd", "hrnoshade", "hrpct", "hralign", Constants.MessagePayloadKeys.FROM, "to", "arcsize", "wrapcoords", "equationxml", "gfxdata", "ink", "stroke", "imagedata", "imageData", "signatureline", "shadow", "extrusion", "formulas", "textpath", "handles", "lock", "textbox", "diagram", "callout", "wrap", "anchorlock", "bordertop", "borderleft", "borderbottom", "borderright", "addlxml", "allowcomments", "ext", "issignatureline", "provid", "showsigndate", "signinginstructions", "signinginstructionsset", "sigprovurl", "suggestedsigner", "suggestedsigner2", "suggestedsigneremail", "text-align", "top", "margin-top", "left", "margin-left", "width", "height", "rotation", "flip", "visibility", "z-index", "mso-wrap-edited", "mso-wrap-distance-left", "mso-wrap-distance-top", "mso-wrap-distance-right", "mso-wrap-distance-bottom", "mso-position-horizontal", "mso-position-horizontal-relative", "mso-position-vertical", "mso-position-vertical-relative", "mso-wrap-style", RequestParameters.POSITION, "v-text-anchor", "mso-left-percent", "mso-top-percent", "mso-width-percent", "mso-height-percent", "mso-width-relative", "mso-height-relative", ContextChain.TAG_INFRA, "annotation", "src", "joinstyle", "dashstyle", "linestyle", "endcap", "startarrow", "startarrowwidth", "startarrowlength", "endarrow", "endarrowwidth", "endarrowlength", "opacity", "color", "color2", "filltype", "on", "weight", "pict", "croptop", "cropbottom", "cropleft", "cropright", "chromakey", "gain", "blacklevel", "gamma", "grayscale", "bilevel", "embosscolor", "recolortarget", "f", "xcenter", "ycenter", "xlimo", "ylimo", "linedrawn", "pixellinewidth", "pixelwidth", "pixelheight", "emuwidth", "emuheight", "emuwidth2", "emuheight2", "arrowok", "fillok", "strokeok", "shadowok", "extrusionok", "gradientshapeok", "textpathok", "limo", "connecttype", "connectlocs", "connectangles", "textboxrect", "v", "fitshape", "trim", "fitpath", "xscale", "string", "font-family", "font-size", "font-style", "font-weight", "font-variant", "text-decoration", "mso-text-shadow", "v-text-align", "v-text-spacing-mode", "v-text-spacing", "v-text-kern", "v-text-reverse", "v-same-letter-heights", "v-rotate-letters", "underline", "line-through", C18773h.f57233c, "switch", "polar", "map", "radiusrange", "xrange", "yrange", "topLeft", "bottomRight", "center", "aspectratio", "verticies", "text", "grouping", "inset", "layout-flow", "mso-layout-flow-alt", "mso-fit-shape-to-text", "mso-next-textbox", "gap", "angle", "drop", "distance", "length", "accentbar", "textborder", "minusx", "minusy", "dropauto", "lengthspecified", "side", "anchorx", "anchory");

    private static void zzH(ShapeBase shapeBase, String str) throws Exception {
        if (com.aspose.words.internal.zzZKN.zzS(str, "#image", com.aspose.words.internal.zzZOF.ORDINAL$4894b8c8)) {
            shapeBase.setShapeAttr(EditingLanguage.LULE_SAMI_NORWAY, 100);
        } else {
            zzY(shapeBase, EditingLanguage.LULE_SAMI_NORWAY, str);
        }
    }

    private static void zzI(ShapeBase shapeBase, String str) {
        double dZzXT0;
        double d;
        zzY2G zzy2g = new zzY2G(str);
        if (zzy2g.zzYmB()) {
            dZzXT0 = zzy2g.zzXT1();
            d = 100.0d;
        } else {
            if (!zzy2g.isFixed()) {
                return;
            }
            dZzXT0 = zzy2g.zzXT0();
            d = 65536.0d;
        }
        shapeBase.setShapeAttr(StyleIdentifier.LIST_TABLE_6_COLORFUL, Integer.valueOf(com.aspose.words.internal.zzAN.zzZG((dZzXT0 / d) * ((double) shapeBase.zzZyj()))));
    }

    private static void zzJ(ShapeBase shapeBase, String str) {
        String[] strArrZzR = com.aspose.words.internal.zzZKN.zzR(str, ',');
        int length = strArrZzR.length - 1;
        int i = 0;
        for (int i2 = 129; i2 <= 132; i2++) {
            zzY2C.zzT(shapeBase, i2, strArrZzR[i]);
            i++;
            if (i > length) {
                return;
            }
        }
    }

    private static void zzK(ShapeBase shapeBase, String str) {
        if (com.aspose.words.internal.zzZYD.zzXk(str)) {
            zzY2G[] zzy2gArrZzXW = zzY2C.zzXW(str, "");
            int length = zzy2gArrZzXW.length / 2;
            zzYM5[] zzym5Arr = new zzYM5[length];
            for (int i = 0; i < length; i++) {
                int i2 = i * 2;
                zzym5Arr[i] = new zzYM5(zzy2gArrZzXW[i2].zzXT3(), zzy2gArrZzXW[i2 + 1].zzXT3());
            }
            shapeBase.setShapeAttr(StyleIdentifier.LIST_TABLE_4, zzym5Arr);
            int i3 = length * 2;
            zzYM6[] zzym6Arr = new zzYM6[i3 + 1];
            zzym6Arr[0] = new zzYM6(2, 0);
            for (int i4 = 1; i4 < i3; i4++) {
                if (com.aspose.words.internal.zzAN.zzZP(i4)) {
                    zzym6Arr[i4] = new zzYM6(172, 0);
                } else {
                    zzym6Arr[i4] = new zzYM6(0, 1);
                }
            }
            zzym6Arr[i3] = new zzYM6(4, 0);
            shapeBase.setShapeAttr(StyleIdentifier.LIST_TABLE_5_DARK, zzym6Arr);
        }
    }

    private static void zzL(ShapeBase shapeBase, String str) {
        if (com.aspose.words.internal.zzZYD.zzXk(str)) {
            zzY2H zzy2h = new zzY2H(str);
            shapeBase.setShapeAttr(StyleIdentifier.LIST_TABLE_5_DARK, zzy2h.zzZAF());
            shapeBase.setShapeAttr(StyleIdentifier.LIST_TABLE_4, zzy2h.zzZAE());
        }
    }

    private static void zzM(ShapeBase shapeBase, String str) {
        if (com.aspose.words.internal.zzZYD.zzXk(str)) {
            String[] strArrZzR = com.aspose.words.internal.zzZKN.zzR(str, ',');
            for (int i = 0; i < strArrZzR.length; i++) {
                String str2 = strArrZzR[i];
                if (!"".equals(str2)) {
                    shapeBase.setShapeAttr(i + StyleIdentifier.LIST_TABLE_6_COLORFUL, Integer.valueOf(com.aspose.words.internal.zzJB.parseInt(str2)));
                }
            }
        }
    }

    private static void zzN(ShapeBase shapeBase, String str) {
        zzY2M[] zzy2mArrZzz2 = zzz2(str);
        String str2 = null;
        String str3 = null;
        for (int i = 0; i < zzy2mArrZzz2.length; i++) {
            String value = zzy2mArrZzz2[i].getValue();
            switch (zzUR.zzTP(zzy2mArrZzz2[i].getName())) {
                case 228:
                    str2 = value;
                    break;
                case 229:
                    str3 = value;
                    break;
                case 230:
                    zzY2C.zzV(shapeBase, 190, value);
                    break;
                case 231:
                    shapeBase.setShapeAttr(142, com.aspose.words.internal.zzZKN.zzS(value, '#'));
                    break;
            }
        }
        if (str2 != null) {
            if ("vertical".equals(str2) && "bottom-to-top".equals(str3)) {
                shapeBase.setShapeAttr(136, 2);
            } else {
                shapeBase.setShapeAttr(136, Integer.valueOf(zzY30.zzzw(str2)));
            }
        }
    }

    private static void zzO(ShapeBase shapeBase, String str) {
        zzY2M[] zzy2mArrZzz2 = zzz2(str);
        for (int i = 0; i < zzy2mArrZzz2.length; i++) {
            String value = zzy2mArrZzz2[i].getValue();
            com.aspose.words.internal.zzZHW zzzhw = zzUR;
            switch (zzzhw.zzTP(zzy2mArrZzz2[i].getName())) {
                case 197:
                    shapeBase.setShapeAttr(197, com.aspose.words.internal.zzZKN.zzV(value, '\"', '\''));
                    break;
                case 198:
                    shapeBase.setShapeAttr(195, Integer.valueOf(com.aspose.words.internal.zzSA.zzl(zzZ(value, 36.0d, false))));
                    break;
                case 199:
                    zzY2C.zzZ(shapeBase, StyleIdentifier.MEDIUM_LIST_1_ACCENT_6, "italic", "normal", value);
                    break;
                case 200:
                    zzY2C.zzZ(shapeBase, 250, "bold", "normal", value);
                    break;
                case 201:
                    zzY2C.zzZ(shapeBase, StyleIdentifier.MEDIUM_GRID_2_ACCENT_6, "small-caps", "normal", value);
                    break;
                case 202:
                    int iZzTP = zzzhw.zzTP(value);
                    if (iZzTP == 211) {
                        shapeBase.setShapeAttr(StyleIdentifier.MEDIUM_LIST_2_ACCENT_6, Boolean.TRUE);
                    } else if (iZzTP == 212) {
                        shapeBase.setShapeAttr(255, Boolean.TRUE);
                    }
                    break;
                case 203:
                    zzY2C.zzZ(shapeBase, StyleIdentifier.MEDIUM_GRID_1_ACCENT_6, "auto", "normal", value);
                    break;
                case 204:
                    shapeBase.setShapeAttr(194, Integer.valueOf(zzY30.zzzN(value)));
                    break;
                case 205:
                    zzY2C.zzZ(shapeBase, 244, "tightening", "tracking", value);
                    break;
                case 206:
                    zzY2C.zzX(shapeBase, 196, value);
                    break;
                case 207:
                    zzY2C.zzV(shapeBase, 243, value);
                    break;
                case 208:
                    zzY2C.zzV(shapeBase, 240, value);
                    break;
                case 209:
                    zzY2C.zzV(shapeBase, StyleIdentifier.LIGHT_GRID_ACCENT_6, value);
                    break;
                case 210:
                    zzY2C.zzV(shapeBase, 242, value);
                    break;
            }
        }
    }

    private static void zzP(zzYC3 zzyc3) {
        Object obj = zzyc3.get(EditingLanguage.LULE_SAMI_NORWAY);
        zzYC3 zzyc3Zzm2 = obj != null ? zzYBW.zzm2(((Integer) obj).intValue()) : null;
        if (zzyc3Zzm2 == null) {
            return;
        }
        zzYM5[] zzym5Arr = (zzYM5[]) zzyc3Zzm2.zzPj(StyleIdentifier.LIST_TABLE_4);
        zzYM5[] zzym5Arr2 = (zzYM5[]) zzyc3.zzPj(StyleIdentifier.LIST_TABLE_4);
        if (zzym5Arr == null || zzym5Arr2 == null || zzym5Arr.length == zzym5Arr2.length) {
            return;
        }
        zzyc3.remove(EditingLanguage.LULE_SAMI_NORWAY);
    }

    private static void zzQ(ShapeBase shapeBase, String str) {
        String[] strArrZzR = com.aspose.words.internal.zzZKN.zzR(str, ',');
        int[] iArr = new int[strArrZzR.length];
        for (int i = 0; i < strArrZzR.length; i++) {
            iArr[i] = zzz3(strArrZzR[i]);
        }
        shapeBase.setShapeAttr(StyleIdentifier.LIST_TABLE_3_ACCENT_2, iArr);
    }

    private static String zzR(zzZ8W zzz8w) {
        return zzz8w.zzYXm() ? TranslateLanguage.PORTUGUESE : "px";
    }

    private static Shape zzS(zzZ8W zzz8w) {
        Shape shape = new Shape(zzz8w.getDocument());
        shape.setShapeType(75);
        Boolean bool = Boolean.FALSE;
        shape.setShapeAttr(959, bool);
        shape.setShapeAttr(508, bool);
        shape.setShapeAttr(EditingLanguage.ARABIC_LIBYA, 0);
        Boolean bool2 = Boolean.TRUE;
        shape.setShapeAttr(127, bool2);
        shape.setShapeAttr(4096, 0);
        shape.setShapeAttr(EditingLanguage.GERMAN_LUXEMBOURG, "Normal");
        shape.setShapeAttr(958, bool2);
        shape.setShapeAttr(951, bool);
        shape.setShapeAttr(952, bool2);
        zzYU4 zzyu4ZzZsD = zzz8w.zzZsD();
        while (zzyu4ZzZsD.zzQ("scriptAnchor")) {
            String string = zzyu4ZzZsD.readString();
            switch (zzUR.zzTP(zzyu4ZzZsD.getLocalName())) {
                case 20:
                    shape.setShapeAttr(922, string);
                    int iZzzS = zzY30.zzzS(string);
                    if (iZzzS != -1) {
                        shape.setShapeAttr(920, Integer.valueOf(iZzzS));
                    }
                    break;
                case 21:
                    shape.setShapeAttr(919, string);
                    break;
                case 22:
                    shape.setShapeAttr(910, string);
                    break;
                default:
                    zzyu4ZzZsD.zzk();
                    break;
            }
        }
        return shape;
    }

    public static ShapeBase zzT(zzZ8W zzz8w) throws Exception {
        zzYU4 zzyu4ZzZsD = zzz8w.zzZsD();
        int iZzTP = zzUR.zzTP(zzyu4ZzZsD.getLocalName());
        ShapeBase groupShape = null;
        if (iZzTP != 2) {
            switch (iZzTP) {
                case 5:
                    String strZzV = zzyu4ZzZsD.zzV("id", null);
                    zzYC3 zzyc3ZzV = zzV(zzz8w);
                    zzP(zzyc3ZzV);
                    zzz8w.zzZ(strZzV, zzyc3ZzV);
                    break;
                case 6:
                    groupShape = new GroupShape(zzz8w.getDocument());
                    zzY(zzz8w, groupShape);
                    break;
                case 7:
                case 8:
                case 9:
                    groupShape = new Shape(zzz8w.getDocument());
                    zzY(zzz8w, groupShape);
                    break;
                case 10:
                    groupShape = new Shape(zzz8w.getDocument(), 1);
                    zzY(zzz8w, groupShape);
                    break;
                case 11:
                    groupShape = new Shape(zzz8w.getDocument(), 2);
                    zzY(zzz8w, groupShape);
                    break;
                case 12:
                    groupShape = new Shape(zzz8w.getDocument(), 20);
                    zzY(zzz8w, groupShape);
                    break;
                case 13:
                    groupShape = new Shape(zzz8w.getDocument(), 3);
                    zzY(zzz8w, groupShape);
                    break;
                case 14:
                    groupShape = zzS(zzz8w);
                    break;
                case 15:
                case 16:
                    zzyu4ZzZsD.zzk();
                    break;
                case 17:
                    groupShape = zzY2K.zzX(zzz8w);
                    break;
                case 18:
                    groupShape = zzY2K.zzY(zzz8w);
                    break;
                case 19:
                    zzY2K.zzW(zzz8w);
                    break;
                default:
                    zzyu4ZzZsD.zzk();
                    break;
            }
        } else {
            zzz8w.zzZml();
        }
        zzQ(zzz8w);
        return groupShape;
    }

    public static void zzU(zzZ8W zzz8w) throws Exception {
        Shape shape = new Shape(zzz8w.getDocument(), 1);
        zzz8w.getDocument().zzO(shape);
        zzYU4 zzyu4ZzZsD = zzz8w.zzZsD();
        while (zzyu4ZzZsD.zzQ("bgPict")) {
            int iZzTP = zzUR.zzTP(zzyu4ZzZsD.getLocalName());
            if (iZzTP == 2) {
                zzz8w.zzZml();
            } else if (iZzTP != 3) {
                zzyu4ZzZsD.zzk();
            } else if ("w".equals(zzyu4ZzZsD.getPrefix())) {
                zzZ(zzz8w, shape);
            } else if ("v".equals(zzyu4ZzZsD.getPrefix())) {
                zzY(zzz8w, shape);
            }
        }
    }

    public static zzYC3 zzV(zzZ8W zzz8w) throws Exception {
        zzz8w.zzZsD().getLocalName();
        Shape shape = new Shape(zzz8w.getDocument());
        zzY(zzz8w, shape);
        return shape.zzYvW();
    }

    private static void zzX(ShapeBase shapeBase, zzZ8W zzz8w) throws Exception {
        zzYU4 zzyu4ZzZsD = zzz8w.zzZsD();
        while (zzyu4ZzZsD.zzi()) {
            String value = zzyu4ZzZsD.getValue();
            int iZzTP = zzUR.zzTP(zzyu4ZzZsD.getLocalName());
            if (iZzTP != 23) {
                if (iZzTP != 55) {
                    switch (iZzTP) {
                        case 136:
                            break;
                        case 137:
                            shapeBase.setShapeAttr(470, Integer.valueOf(zzY30.zzzH(value)));
                            continue;
                        case 138:
                            shapeBase.setShapeAttr(462, Integer.valueOf(zzY30.zzzI(value)));
                            continue;
                        case 139:
                            shapeBase.setShapeAttr(461, Integer.valueOf(zzY30.zzzG(value)));
                            continue;
                        case 140:
                            shapeBase.setShapeAttr(471, Integer.valueOf(zzY30.zzzF(value)));
                            continue;
                        case 141:
                            shapeBase.setShapeAttr(464, Integer.valueOf(zzY30.zzzC(value)));
                            continue;
                        case 142:
                            shapeBase.setShapeAttr(466, Integer.valueOf(zzY30.zzzE(value)));
                            continue;
                        case 143:
                            shapeBase.setShapeAttr(467, Integer.valueOf(zzY30.zzzD(value)));
                            continue;
                        case 144:
                            shapeBase.setShapeAttr(465, Integer.valueOf(zzY30.zzzC(value)));
                            continue;
                        case 145:
                            shapeBase.setShapeAttr(468, Integer.valueOf(zzY30.zzzE(value)));
                            continue;
                        case 146:
                            shapeBase.setShapeAttr(469, Integer.valueOf(zzY30.zzzD(value)));
                            continue;
                        case 147:
                            zzY2C.zzX(shapeBase, 449, value);
                            continue;
                        case 148:
                            shapeBase.setShapeAttr(448, zzY35.zzzY(value));
                            continue;
                        case 149:
                            shapeBase.setShapeAttr(450, zzY35.zzzY(value));
                            com.aspose.words.internal.zzPV zzpvZzzX = zzY35.zzzX(value);
                            if (zzpvZzzX != null) {
                                shapeBase.setShapeAttr(477, zzpvZzzX);
                            }
                            int iZzzW = zzY35.zzzW(value);
                            if (iZzzW == 0) {
                                continue;
                            } else {
                                shapeBase.setShapeAttr(479, Integer.valueOf(iZzzW));
                            }
                            break;
                        case 150:
                            shapeBase.setShapeAttr(452, Integer.valueOf(zzY30.zzzB(value)));
                            continue;
                        case 151:
                            shapeBase.setShapeAttr(508, Boolean.valueOf(zzyu4ZzZsD.zz8()));
                            continue;
                        case 152:
                            zzS(shapeBase, value);
                            continue;
                        default:
                            zzyu4ZzZsD.zzZ(65536, 4, com.aspose.words.internal.zzZKN.format("Import of element '{0}' is not supported upon VML import by Aspose.Words.", zzyu4ZzZsD.getLocalName()));
                            continue;
                    }
                } else if (shapeBase.zzYvW().zzPk(454) == null) {
                    shapeBase.setShapeAttr(454, value);
                }
            }
            shapeBase.setShapeAttr(4111, zzz8w.zzNO(value));
        }
    }

    public static void zzY(zzZ8W zzz8w, ShapeBase shapeBase) throws Exception {
        long jZzZm;
        zzYU4 zzyu4ZzZsD = zzz8w.zzZsD();
        String localName = zzyu4ZzZsD.getLocalName();
        zzY2G[] zzy2gArrZzXW = null;
        zzY2G[] zzy2gArrZzXW2 = null;
        String str = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        while (zzyu4ZzZsD.zzi()) {
            String value = zzyu4ZzZsD.getValue();
            switch (zzUR.zzTP(zzyu4ZzZsD.getLocalName())) {
                case 23:
                    str3 = value;
                    break;
                case 24:
                    str4 = value;
                    break;
                case 25:
                    str = value;
                    break;
                case 26:
                    str2 = value;
                    break;
                case 27:
                    shapeBase.setShapeAttr(1280, Integer.valueOf(zzY30.zzzq(value)));
                    break;
                case 28:
                    shapeBase.setShapeAttr(897, value);
                    break;
                case 29:
                    zzZ(shapeBase, value, zzz8w, zzyu4ZzZsD);
                    break;
                case 30:
                    break;
                case 31:
                    shapeBase.setShapeAttr(EditingLanguage.SPANISH_GUATEMALA, zzz4(value));
                    break;
                case 32:
                    shapeBase.setShapeAttr(4107, zzz4(value));
                    break;
                case 33:
                    shapeBase.setShapeAttr(EditingLanguage.FRENCH_SWITZERLAND, zzz4(value));
                    break;
                case 34:
                    shapeBase.setShapeAttr(4109, zzz4(value));
                    break;
                case 35:
                    zzY2C.zzV(shapeBase, 944, value);
                    break;
                case 36:
                    zzY2C.zzV(shapeBase, 950, value);
                    break;
                case 37:
                    if (com.aspose.words.internal.zzZYD.zzXk(value)) {
                        int[] iArrZzyY = zzY23.zzyY(value);
                        shapeBase.zzXj(com.aspose.words.internal.zzZPZ.zzZm(iArrZzyY.length > 0 ? iArrZzyY[0] : 0, iArrZzyY.length > 1 ? iArrZzyY[1] : 0));
                    }
                    break;
                case 38:
                    if (com.aspose.words.internal.zzZYD.zzXk(value)) {
                        int[] iArrZzyY2 = zzY23.zzyY(value);
                        jZzZm = com.aspose.words.internal.zzZPX.zzZm(iArrZzyY2.length > 0 ? iArrZzyY2[0] : 0, iArrZzyY2.length > 1 ? iArrZzyY2[1] : 0);
                    } else {
                        jZzZm = com.aspose.words.internal.zzZPX.zzZm(1000, 1000);
                    }
                    shapeBase.zzXI(jZzZm);
                    break;
                case 39:
                    zzM(shapeBase, value);
                    break;
                case 40:
                    zzL(shapeBase, value);
                    break;
                case 41:
                    zzK(shapeBase, value);
                    break;
                case 42:
                    zzY2C.zzV(shapeBase, 827, value);
                    break;
                case 43:
                case 44:
                    zzY2C.zzV(shapeBase, 443, value);
                    break;
                case 45:
                    shapeBase.setShapeAttr(385, zzY35.zzzY(value));
                    com.aspose.words.internal.zzPV zzpvZzzX = zzY35.zzzX(value);
                    if (zzpvZzzX != null) {
                        shapeBase.setShapeAttr(414, zzpvZzzX);
                    }
                    int iZzzW = zzY35.zzzW(value);
                    if (iZzzW != 0) {
                        shapeBase.setShapeAttr(416, Integer.valueOf(iZzzW));
                    }
                    break;
                case 46:
                    shapeBase.setShapeAttr(777, Integer.valueOf(zzyu4ZzZsD.zzb()));
                    break;
                case 47:
                    shapeBase.setShapeAttr(778, Integer.valueOf(zzyu4ZzZsD.zzb()));
                    break;
                case 48:
                    shapeBase.setShapeAttr(771, Integer.valueOf(zzY30.zzzs(value)));
                    break;
                case 49:
                    zzY2C.zzV(shapeBase, 508, value);
                    break;
                case 50:
                    shapeBase.setShapeAttr(448, zzY35.zzzY(value));
                    com.aspose.words.internal.zzPV zzpvZzzX2 = zzY35.zzzX(value);
                    if (zzpvZzzX2 != null) {
                        shapeBase.setShapeAttr(473, zzpvZzzX2);
                    }
                    int iZzzW2 = zzY35.zzzW(value);
                    if (iZzzW2 != 0) {
                        shapeBase.setShapeAttr(475, Integer.valueOf(iZzzW2));
                    }
                    break;
                case 51:
                    zzS(shapeBase, value);
                    break;
                case 52:
                    zzY2C.zzV(shapeBase, 505, value);
                    break;
                case 53:
                    shapeBase.setShapeAttr(898, value);
                    break;
                case 54:
                    shapeBase.setShapeAttr(4120, value);
                    break;
                case 55:
                    shapeBase.setShapeAttr(909, value);
                    break;
                case 56:
                    zzY2C.zzV(shapeBase, 945, value);
                    break;
                case 57:
                    zzY2C.zzV(shapeBase, 956, value);
                    break;
                case 58:
                    zzY2C.zzV(shapeBase, 826, value);
                    break;
                case 59:
                    shapeBase.setShapeAttr(772, Integer.valueOf(zzY30.zzzQ(value)));
                    break;
                case 60:
                    shapeBase.setShapeAttr(773, Integer.valueOf(zzY30.zzzQ(value)));
                    break;
                case 61:
                    shapeBase.setShapeAttr(774, Integer.valueOf(zzY30.zzzQ(value)));
                    break;
                case 62:
                    zzY2C.zzV(shapeBase, 948, value);
                    break;
                case 63:
                    zzY2C.zzV(shapeBase, 946, value);
                    break;
                case 64:
                    zzY2C.zzV(shapeBase, 947, value);
                    break;
                case 65:
                    if (com.aspose.words.internal.zzZYD.zzXk(value)) {
                        shapeBase.setShapeAttr(915, Integer.valueOf((int) com.aspose.words.internal.zzJB.parseDouble(value)));
                    }
                    break;
                case 66:
                    shapeBase.setShapeAttr(916, Integer.valueOf(zzY30.zzzO(value)));
                    break;
                case 67:
                    if (shapeBase.getShapeType() == 20) {
                        zzy2gArrZzXW = zzY2C.zzXW(value, zzR(zzz8w));
                    }
                    break;
                case 68:
                    if (shapeBase.getShapeType() == 20) {
                        zzy2gArrZzXW2 = zzY2C.zzXW(value, zzR(zzz8w));
                    }
                    break;
                case 69:
                    zzI(shapeBase, value);
                    break;
                case 70:
                    zzYM5[] zzym5ArrZzzb = zzzb(zzyu4ZzZsD.getValue());
                    if (zzym5ArrZzzb != null) {
                        shapeBase.setShapeAttr(899, zzym5ArrZzzb);
                    }
                    break;
                case 71:
                    shapeBase.setShapeAttr(780, com.aspose.words.internal.zzZO0.zzhV().getBytes(value));
                    break;
                case 72:
                    zzZ(shapeBase, value, zzyu4ZzZsD);
                    break;
                default:
                    zzyu4ZzZsD.zzZ(65536, 4, com.aspose.words.internal.zzZKN.format("Import of element '{0}' is not supported upon VML import by Aspose.Words.", zzyu4ZzZsD.getLocalName()));
                    break;
            }
        }
        boolean z = false;
        zzZ(zzy2gArrZzXW, zzy2gArrZzXW2, shapeBase, zzz8w.zzYXm());
        if (com.aspose.words.internal.zzZYD.zzXk(str)) {
            zzH(shapeBase, str);
        } else if (com.aspose.words.internal.zzZYD.zzXk(str2)) {
            zzYC3 zzyc3ZzJI = zzz8w.zzJI(str2);
            if (zzyc3ZzJI == null || !zzyc3ZzJI.contains(EditingLanguage.LULE_SAMI_NORWAY)) {
                if (zzyc3ZzJI != null) {
                    zzYC3 zzyc3 = new zzYC3();
                    zzyc3ZzJI.zzY(zzyc3);
                    shapeBase.zzYvW().zzY(zzyc3);
                    shapeBase.zzS(zzyc3);
                }
                zzH(shapeBase, str2);
            } else {
                shapeBase.setShapeAttr(EditingLanguage.LULE_SAMI_NORWAY, zzyc3ZzJI.get(EditingLanguage.LULE_SAMI_NORWAY));
            }
        }
        if (com.aspose.words.internal.zzZYD.zzXk(str4)) {
            zzY(shapeBase, 4124, str4);
            if (com.aspose.words.internal.zzZYD.zzXk(str3)) {
                shapeBase.setName(str3);
            }
        } else if (com.aspose.words.internal.zzZYD.zzXk(str3)) {
            zzY(shapeBase, 4124, str3);
        }
        if (com.aspose.words.internal.zzZYD.zzXk(str3)) {
            zzz8w.zzZ(str3, shapeBase);
        }
        if (shapeBase.getNodeType() == 17 && shapeBase.getShapeType() == 75) {
            shapeBase.setShapeType(-1);
        }
        boolean zZzQ = true;
        boolean zZzX = false;
        while (true) {
            if (!zZzX) {
                zZzQ = zzyu4ZzZsD.zzQ(localName);
            }
            if (!zZzQ) {
                if (shapeBase.zzYa5()) {
                    shapeBase.zzYa4();
                }
                zzQ(zzz8w);
                return;
            }
            int iZzTP = zzUR.zzTP(zzyu4ZzZsD.getLocalName());
            if (iZzTP == 2) {
                zZzX = z;
                zzz8w.zzZml();
            } else if (iZzTP == 40) {
                zZzX = z;
                zzT(shapeBase, zzyu4ZzZsD);
            } else if (iZzTP != 43) {
                switch (iZzTP) {
                    case 73:
                        zZzX = z;
                        zzY(shapeBase, zzz8w);
                        break;
                    case 74:
                        zZzX = z;
                        zzX(shapeBase, zzz8w);
                        break;
                    case 75:
                    case 76:
                        zZzX = z;
                        if (!shapeBase.isGroup()) {
                            Shape shape = (Shape) shapeBase;
                            zzZ(shape, zzz8w);
                            if (shape.hasImage() && shapeBase.getShapeType() == 0) {
                                shapeBase.setShapeAttr(EditingLanguage.LULE_SAMI_NORWAY, 100);
                            }
                        }
                        break;
                    case 77:
                        zZzX = z;
                        zzV(shapeBase, zzyu4ZzZsD);
                        break;
                    case 78:
                        zZzX = z;
                        zzY2F.zzW(shapeBase, zzyu4ZzZsD);
                        break;
                    case 79:
                        zZzX = z;
                        zzY2Z.zzX(shapeBase, zzyu4ZzZsD);
                        break;
                    case 80:
                        zZzX = z;
                        zzU(shapeBase, zzyu4ZzZsD);
                        break;
                    case 81:
                        zZzX = z;
                        zzS(shapeBase, zzyu4ZzZsD);
                        break;
                    case 82:
                        zZzX = z;
                        zzR(shapeBase, zzyu4ZzZsD);
                        break;
                    case 83:
                        zZzX = z;
                        zzQ(shapeBase, zzyu4ZzZsD);
                        break;
                    case 84:
                        zZzX = zzX(zzz8w, shapeBase);
                        break;
                    case 85:
                        zZzX = z;
                        zzY32.zzZ(shapeBase, zzyu4ZzZsD);
                        break;
                    case 86:
                        zZzX = z;
                        zzP(shapeBase, zzyu4ZzZsD);
                        break;
                    case 87:
                        zZzX = z;
                        zzO(shapeBase, zzyu4ZzZsD);
                        break;
                    case 88:
                        zZzX = z;
                        shapeBase.setShapeAttr(4099, Boolean.TRUE);
                        break;
                    case 89:
                        zZzX = z;
                        zzZ(shapeBase, EditingLanguage.SPANISH_GUATEMALA, zzyu4ZzZsD);
                        break;
                    case 90:
                        zZzX = z;
                        zzZ(shapeBase, 4107, zzyu4ZzZsD);
                        break;
                    case 91:
                        zZzX = z;
                        zzZ(shapeBase, EditingLanguage.FRENCH_SWITZERLAND, zzyu4ZzZsD);
                        break;
                    case 92:
                        zZzX = z;
                        zzZ(shapeBase, 4109, zzyu4ZzZsD);
                        break;
                    default:
                        if (shapeBase.getShapeType() == -1) {
                            zzz8w.zzVb(true);
                            ShapeBase shapeBaseZzT = zzT(zzz8w);
                            if (shapeBaseZzT != null) {
                                shapeBase.zzA(shapeBaseZzT);
                            }
                            zZzX = z;
                            zzz8w.zzVb(zZzX);
                        } else {
                            zZzX = z;
                            zzyu4ZzZsD.zzk();
                        }
                        break;
                }
            } else {
                zZzX = z;
                zzY2W.zzZ(shapeBase, zzz8w);
            }
            z = zZzX;
        }
    }

    private static zzZL3 zzv(zzYU4 zzyu4) {
        zzZL3 zzzl3 = new zzZL3();
        zzzl3.zzYtX = new zzYM2(Integer.MIN_VALUE);
        zzzl3.zzYtW = new zzYM2(Integer.MAX_VALUE);
        zzzl3.zzYtV = new zzYM2(Integer.MIN_VALUE);
        zzzl3.zzYtU = new zzYM2(Integer.MAX_VALUE);
        while (zzyu4.zzi()) {
            String value = zzyu4.getValue();
            int iZzTP = zzUR.zzTP(zzyu4.getLocalName());
            if (iZzTP != 126) {
                switch (iZzTP) {
                    case 214:
                        zzzl3.zzYu4 = true;
                        break;
                    case 215:
                        zzzl3.zzYu5 = true;
                        zzYM5 zzym5Zzz7 = zzz7(value);
                        zzzl3.zzYtZ = zzym5Zzz7.zzYnG();
                        zzzl3.zzYtY = zzym5Zzz7.zzYnF();
                        break;
                    case 216:
                        zzzl3.zzYu6 = true;
                        zzYM5 zzym5Zzz72 = zzz7(value);
                        zzzl3.zzYtZ = zzym5Zzz72.zzYnG();
                        zzzl3.zzYtY = zzym5Zzz72.zzYnF();
                        break;
                    case 217:
                        zzzl3.zzYu8 = true;
                        zzYM5 zzym5Zzz73 = zzz7(value);
                        zzzl3.zzYtX = zzym5Zzz73.zzYnG();
                        zzzl3.zzYtW = zzym5Zzz73.zzYnF();
                        break;
                    case 218:
                        zzzl3.zzYu7 = true;
                        zzYM5 zzym5Zzz74 = zzz7(value);
                        zzzl3.zzYtX = zzym5Zzz74.zzYnG();
                        zzzl3.zzYtW = zzym5Zzz74.zzYnF();
                        break;
                    case 219:
                        zzzl3.zzYu7 = true;
                        zzYM5 zzym5Zzz75 = zzz7(value);
                        zzzl3.zzYtV = zzym5Zzz75.zzYnG();
                        zzzl3.zzYtU = zzym5Zzz75.zzYnF();
                        break;
                }
            } else {
                zzZL2 zzzl2Zzz8 = zzz8(value);
                zzzl3.zzYu1 = zzzl2Zzz8.zzZ53();
                zzzl3.zzYu0 = zzzl2Zzz8.zzZ52();
            }
        }
        return zzzl3;
    }

    private static zzY2M[] zzz2(String str) {
        String[] strArrZzR = com.aspose.words.internal.zzZKN.zzR(str, ';');
        zzY2M[] zzy2mArr = new zzY2M[strArrZzR.length];
        for (int i = 0; i < strArrZzR.length; i++) {
            zzy2mArr[i] = zzY2M.zzzh(strArrZzR[i]);
        }
        return zzZ(zzy2mArr);
    }

    private static int zzz3(String str) {
        zzY2G zzy2g = new zzY2G(str);
        if (zzy2g.zzXTa()) {
            return zzy2g.zzXT2();
        }
        return 0;
    }

    private static Border zzz4(String str) {
        Border border = new Border();
        border.zzm(zzY35.zzzY(str));
        return border;
    }

    private static zzZL1 zzz5(String str) {
        switch (zzUR.zzTP(str)) {
            case 220:
                return new zzZL1(1, 0);
            case 221:
                return new zzZL1(2, 0);
            case 222:
                return new zzZL1(3, 0);
            default:
                int i = com.aspose.words.internal.zzZOF.ORDINAL$4894b8c8;
                return com.aspose.words.internal.zzZKN.zzS(str, "@", i) ? new zzZL1(4, com.aspose.words.internal.zzJB.parseInt(com.aspose.words.internal.zzZKN.zzU(str, '@'))) : com.aspose.words.internal.zzZKN.zzS(str, "#", i) ? new zzZL1(5, com.aspose.words.internal.zzJB.parseInt(com.aspose.words.internal.zzZKN.zzU(str, '#'))) : new zzZL1(6, com.aspose.words.internal.zzJB.parseInt(str));
        }
    }

    private static zzYM2 zzz6(String str) {
        switch (zzUR.zzTP(str)) {
            case 220:
                return new zzYM2(0, true);
            case 221:
                return new zzYM2(1, true);
            case 222:
                return new zzYM2(2, true);
            default:
                int i = com.aspose.words.internal.zzZOF.ORDINAL$4894b8c8;
                return com.aspose.words.internal.zzZKN.zzS(str, "@", i) ? new zzYM2(com.aspose.words.internal.zzJB.parseInt(com.aspose.words.internal.zzZKN.zzU(str, '@')) + 3, true) : com.aspose.words.internal.zzZKN.zzS(str, "#", i) ? new zzYM2(com.aspose.words.internal.zzJB.parseInt(com.aspose.words.internal.zzZKN.zzU(str, '#')) + 256, true) : new zzYM2(com.aspose.words.internal.zzJB.parseInt(str), false);
        }
    }

    private static zzYM5 zzz7(String str) {
        String[] strArrZzR = com.aspose.words.internal.zzZKN.zzR(str, ',');
        return new zzYM5(zzz6(strArrZzR[0]), zzz6(strArrZzR[1]));
    }

    private static zzZL2 zzz8(String str) {
        String[] strArrZzR = com.aspose.words.internal.zzZKN.zzR(str, ',');
        return new zzZL2(zzz5(strArrZzR[0]), zzz5(strArrZzR[1]));
    }

    private static int zzz9(String str) {
        String lowerCase = str.toLowerCase();
        int iZzTP = zzUR.zzTP(lowerCase);
        if (iZzTP == 110) {
            return StyleIdentifier.LIST_TABLE_1_LIGHT;
        }
        if (iZzTP == 111) {
            return StyleIdentifier.LIST_TABLE_2;
        }
        switch (iZzTP) {
            case 167:
                return StyleIdentifier.GRID_TABLE_6_COLORFUL_ACCENT_6;
            case 168:
                return StyleIdentifier.GRID_TABLE_7_COLORFUL_ACCENT_6;
            case 169:
                return StyleIdentifier.LIST_TABLE_4_ACCENT_2;
            case 170:
                return StyleIdentifier.LIST_TABLE_5_DARK_ACCENT_2;
            case 171:
                return 508;
            case 172:
                return 1271;
            case 173:
                return 1272;
            case 174:
                return 1273;
            case 175:
                return 1276;
            case 176:
                return 1277;
            case 177:
                return 1278;
            case 178:
                return 1279;
            default:
                int i = com.aspose.words.internal.zzZOF.ORDINAL$4894b8c8;
                if (com.aspose.words.internal.zzZKN.zzS(lowerCase, "@", i)) {
                    return com.aspose.words.internal.zzJB.parseInt(com.aspose.words.internal.zzZKN.zzU(lowerCase, '@')) + 1024;
                }
                if (com.aspose.words.internal.zzZKN.zzS(lowerCase, "#", i)) {
                    return com.aspose.words.internal.zzJB.parseInt(com.aspose.words.internal.zzZKN.zzU(lowerCase, '#')) + StyleIdentifier.LIST_TABLE_6_COLORFUL;
                }
                throw new IllegalStateException("Unrecognized operand value in the formula.");
        }
    }

    private static zzZLU zzza(String str) {
        String[] strArrZzR = com.aspose.words.internal.zzZKN.zzR(str, ControlChar.SPACE_CHAR);
        zzZLU zzzlu = new zzZLU();
        zzzlu.zzYvt = zzY30.zzzR(strArrZzR[0]);
        if (strArrZzR.length > 1) {
            String str2 = strArrZzR[1];
            if (com.aspose.words.internal.zzJB.zzZ7(str2)) {
                zzzlu.zzYvs = com.aspose.words.internal.zzJB.zzZ8(str2);
            } else {
                zzzlu.zzZjA = 32 | zzzlu.zzZjA;
                zzzlu.zzYvs = zzz9(str2);
            }
        }
        if (strArrZzR.length > 2) {
            String str3 = strArrZzR[2];
            if (com.aspose.words.internal.zzJB.zzZ7(str3)) {
                zzzlu.zzYvr = com.aspose.words.internal.zzJB.zzZ8(str3);
            } else {
                zzzlu.zzZjA |= 64;
                zzzlu.zzYvr = zzz9(str3);
            }
        }
        if (strArrZzR.length > 3) {
            String str4 = strArrZzR[3];
            if (!com.aspose.words.internal.zzJB.zzZ7(str4)) {
                zzzlu.zzZjA |= 128;
                zzzlu.zzYvq = zzz9(str4);
                return zzzlu;
            }
            zzzlu.zzYvq = com.aspose.words.internal.zzJB.zzZ8(str4);
        }
        return zzzlu;
    }

    private static zzYM5[] zzzb(String str) {
        com.aspose.words.internal.zzZNS zzznsZzUW = new com.aspose.words.internal.zzZNR("-?\\d+").zzUW(str);
        int count = zzznsZzUW.getCount();
        String[] strArr = new String[count];
        for (int i = 0; i < zzznsZzUW.getCount(); i++) {
            strArr[i] = zzznsZzUW.zzQw(i).getValue();
        }
        int i2 = count / 2;
        zzYM5[] zzym5Arr = new zzYM5[i2];
        for (int i3 = 0; i3 < i2; i3++) {
            int i4 = i3 * 2;
            zzym5Arr[i3] = new zzYM5(zzY2H.zzzc(strArr[i4]), zzY2H.zzzc(strArr[i4 + 1]));
        }
        if (i2 != 0) {
            return zzym5Arr;
        }
        return null;
    }

    @Override // com.aspose.words.zzZ9X
    public final ArrayList<ShapeBase> zzZ(zzZ8W zzz8w) throws Exception {
        zzYU4 zzyu4ZzZsD = zzz8w.zzZsD();
        ArrayList<ShapeBase> arrayList = new ArrayList<>();
        int iZzb = 0;
        int iZzb2 = 0;
        while (zzyu4ZzZsD.zzi()) {
            int iZzTP = zzUR.zzTP(zzyu4ZzZsD.getLocalName());
            if (iZzTP == 0) {
                iZzb = zzyu4ZzZsD.zzb();
            } else if (iZzTP == 1) {
                iZzb2 = zzyu4ZzZsD.zzb();
            }
        }
        zzyu4ZzZsD.zzj();
        String localName = zzyu4ZzZsD.getLocalName();
        while (zzyu4ZzZsD.zzQ(localName)) {
            ShapeBase shapeBaseZzT = zzT(zzz8w);
            if (shapeBaseZzT != null && !arrayList.contains(shapeBaseZzT)) {
                com.aspose.words.internal.zzZQG.zzZ(arrayList, shapeBaseZzT);
            }
        }
        if (arrayList.size() > 0) {
            ShapeBase shapeBase = arrayList.get(0);
            if (iZzb > 0) {
                double d = iZzb;
                double dZzZa = ((com.aspose.words.internal.zzZKQ.zzZa(((shapeBase.getWidth() * 20.0d) / d) * 1000.0d) * d) / 1000.0d) / 20.0d;
                if (Math.abs(dZzZa - shapeBase.getWidth()) > 0.1d) {
                    shapeBase.zzWf(dZzZa);
                }
            }
            if (iZzb2 > 0) {
                double d2 = iZzb2;
                double dZzZa2 = ((com.aspose.words.internal.zzZKQ.zzZa(((shapeBase.getHeight() * 20.0d) / d2) * 1000.0d) * d2) / 1000.0d) / 20.0d;
                if (Math.abs(dZzZa2 - shapeBase.getHeight()) > 0.1d) {
                    shapeBase.zzWe(dZzZa2);
                }
            }
        }
        return arrayList;
    }

    private static void zzR(ShapeBase shapeBase, String str) {
        String[] strArrZzU = com.aspose.words.internal.zzZKN.zzU(str, zzWWh);
        zzYM5[] zzym5Arr = new zzYM5[strArrZzU.length / 2];
        for (int i = 0; i < strArrZzU.length / 2; i++) {
            int i2 = i * 2;
            zzym5Arr[i] = new zzYM5(zzY2H.zzzc(strArrZzU[i2]), zzY2H.zzzc(strArrZzU[i2 + 1]));
        }
        shapeBase.setShapeAttr(StyleIdentifier.LIST_TABLE_2_ACCENT_2, zzym5Arr);
    }

    private static void zzV(ShapeBase shapeBase, zzYU4 zzyu4) {
        shapeBase.setShapeAttr(FieldType.FIELD_CITATION, Boolean.TRUE);
        while (zzyu4.zzi()) {
            int iZzTP = zzUR.zzTP(zzyu4.getLocalName());
            if (iZzTP != 23) {
                switch (iZzTP) {
                    case 93:
                        shapeBase.setShapeAttr(1927, zzyu4.getValue());
                        break;
                    case 94:
                        shapeBase.setShapeAttr(1981, Boolean.valueOf(zzyu4.zz8()));
                        break;
                    case 95:
                        break;
                    case 96:
                        shapeBase.setShapeAttr(1983, Boolean.valueOf(zzyu4.zz8()));
                        break;
                    case 97:
                        shapeBase.setShapeAttr(1922, zzyu4.getValue());
                        break;
                    case 98:
                        shapeBase.setShapeAttr(FieldType.FIELD_CITATION, Boolean.valueOf(zzyu4.zz8()));
                        break;
                    case 99:
                        shapeBase.setShapeAttr(1926, zzyu4.getValue());
                        break;
                    case 100:
                        shapeBase.setShapeAttr(1982, Boolean.valueOf(zzyu4.zz8()));
                        break;
                    case 101:
                        shapeBase.setShapeAttr(1928, zzyu4.getValue());
                        break;
                    case 102:
                        shapeBase.setShapeAttr(1923, zzyu4.getValue());
                        break;
                    case 103:
                        shapeBase.setShapeAttr(1924, zzyu4.getValue());
                        break;
                    case 104:
                        shapeBase.setShapeAttr(1925, zzyu4.getValue());
                        break;
                    default:
                        zzyu4.zzZ(16777216, 4, com.aspose.words.internal.zzZKN.format("Tag or attribute with name '{0}' is unexpected.", zzyu4.getLocalName()));
                        break;
                }
            } else {
                shapeBase.setShapeAttr(1921, zzyu4.getValue());
            }
        }
    }

    private static void zzQ(ShapeBase shapeBase, zzYU4 zzyu4) {
        while (zzyu4.zzi()) {
            String value = zzyu4.getValue();
            int iZzTP = zzUR.zzTP(zzyu4.getLocalName());
            if (iZzTP == 5) {
                zzY2C.zzV(shapeBase, 828, value);
            } else if (iZzTP != 95) {
                switch (iZzTP) {
                    case 223:
                        zzY2C.zzV(shapeBase, 120, value);
                        break;
                    case 224:
                        zzY2C.zzV(shapeBase, 124, value);
                        break;
                    case 225:
                        zzY2C.zzV(shapeBase, 125, value);
                        break;
                    case 226:
                        zzY2C.zzV(shapeBase, 127, value);
                        break;
                }
            }
        }
    }

    private static int zzP(double d, boolean z) {
        return z ? com.aspose.words.internal.zzAN.zzZB(d) : com.aspose.words.internal.zzSA.zzr(d);
    }

    private static void zzP(ShapeBase shapeBase, String str) {
        String[] strArrZzR = com.aspose.words.internal.zzZKN.zzR(str, ';');
        int length = strArrZzR.length;
        zzYM4[] zzym4Arr = new zzYM4[length];
        for (int i = 0; i < length; i++) {
            String[] strArrZzR2 = com.aspose.words.internal.zzZKN.zzR(strArrZzR[i], ',');
            zzYM4 zzym4 = new zzYM4();
            if (strArrZzR2.length == 4) {
                zzym4.zzXFj = zzY2H.zzzc(strArrZzR2[0]);
                zzym4.zzXFi = zzY2H.zzzc(strArrZzR2[1]);
                zzym4.zzXFh = zzY2H.zzzc(strArrZzR2[2]);
                zzym4.zzXFg = zzY2H.zzzc(strArrZzR2[3]);
            }
            zzym4Arr[i] = zzym4;
        }
        shapeBase.setShapeAttr(StyleIdentifier.LIST_TABLE_1_LIGHT_ACCENT_3, zzym4Arr);
    }

    private static void zzR(ShapeBase shapeBase, zzYU4 zzyu4) {
        ArrayList arrayList = new ArrayList();
        while (zzyu4.zzQ("handles")) {
            if (zzUR.zzTP(zzyu4.getLocalName()) != 213) {
                zzyu4.zzk();
            } else {
                com.aspose.words.internal.zzZQG.zzZ((ArrayList<zzZL3>) arrayList, zzv(zzyu4));
            }
        }
        shapeBase.setShapeAttr(StyleIdentifier.LIST_TABLE_6_COLORFUL_ACCENT_2, (zzZL3[]) arrayList.toArray(new zzZL3[0]));
    }

    private static void zzU(ShapeBase shapeBase, zzYU4 zzyu4) {
        ArrayList arrayList = new ArrayList();
        while (zzyu4.zzQ("formulas")) {
            if (zzUR.zzTP(zzyu4.getLocalName()) != 166) {
                zzyu4.zzk();
            } else {
                String strZzV = zzyu4.zzV("eqn", "");
                if (com.aspose.words.internal.zzZYD.zzXk(strZzV)) {
                    com.aspose.words.internal.zzZQG.zzZ((ArrayList<zzZLU>) arrayList, zzza(strZzV));
                }
            }
        }
        shapeBase.setShapeAttr(StyleIdentifier.LIST_TABLE_7_COLORFUL_ACCENT_2, (zzZLU[]) arrayList.toArray(new zzZLU[0]));
    }

    private static void zzQ(zzZ8W zzz8w) throws Exception {
        if (zzz8w != null && zzz8w.zzZsD() != null) {
            zzz8w.zzZsD().zzYyt();
        }
        HashMap<ShapeBase, String> mapZzYyt = zzz8w.zzZsD().zzYyt();
        if (mapZzYyt.size() == 0) {
            return;
        }
        ArrayList arrayList = new ArrayList();
        for (ShapeBase shapeBase : mapZzYyt.keySet()) {
            if (zzZ(zzz8w, shapeBase, mapZzYyt.get(shapeBase))) {
                com.aspose.words.internal.zzZQG.zzZ((ArrayList<ShapeBase>) arrayList, shapeBase);
            }
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            com.aspose.words.internal.zzZQF.zzY(mapZzYyt, (ShapeBase) it.next());
        }
        arrayList.clear();
    }

    private static void zzP(ShapeBase shapeBase, zzYU4 zzyu4) {
        while (zzyu4.zzi()) {
            String value = zzyu4.getValue();
            int iZzTP = zzUR.zzTP(zzyu4.getLocalName());
            if (iZzTP == 26) {
                shapeBase.setShapeAttr(832, Integer.valueOf(zzY30.zzzx(value)));
            } else if (iZzTP != 95) {
                if (iZzTP != 151) {
                    switch (iZzTP) {
                        case 232:
                            zzY2C.zzT(shapeBase, 833, value);
                            break;
                        case 233:
                            shapeBase.setShapeAttr(834, Integer.valueOf(zzY30.zzzJ(value)));
                            break;
                        case 234:
                            shapeBase.setShapeAttr(835, Integer.valueOf(zzY30.zzzK(value)));
                            break;
                        case 235:
                            zzY2C.zzT(shapeBase, 836, value);
                            break;
                        case 236:
                            zzY2C.zzT(shapeBase, 837, value);
                            break;
                        case 237:
                            zzY2C.zzV(shapeBase, 890, value);
                            break;
                        case 238:
                            zzY2C.zzV(shapeBase, 891, value);
                            break;
                        case 239:
                            zzY2C.zzV(shapeBase, 892, value);
                            break;
                        case 240:
                            zzY2C.zzV(shapeBase, 893, value);
                            break;
                        case 241:
                            zzY2C.zzV(shapeBase, 894, value);
                            break;
                        case 242:
                            zzY2C.zzV(shapeBase, 895, value);
                            break;
                        default:
                            zzyu4.zzZ(65536, 4, com.aspose.words.internal.zzZKN.format("Import of element '{0}' is not supported upon VML import by Aspose.Words.", zzyu4.getLocalName()));
                            break;
                    }
                } else {
                    zzY2C.zzV(shapeBase, 889, value);
                }
            }
        }
    }

    private static void zzO(ShapeBase shapeBase, zzYU4 zzyu4) {
        while (zzyu4.zzi()) {
            String value = zzyu4.getValue();
            int iZzTP = zzUR.zzTP(zzyu4.getLocalName());
            if (iZzTP == 26) {
                int iZzzn = zzY30.zzzn(value);
                if (!shapeBase.zzYvW().contains(EditingLanguage.ARABIC_LIBYA) || shapeBase.getWrapType() != 0) {
                    shapeBase.setShapeAttr(EditingLanguage.ARABIC_LIBYA, Integer.valueOf(iZzzn));
                }
            } else if (iZzTP == 243) {
                shapeBase.setShapeAttr(InputDeviceCompat.SOURCE_TOUCHSCREEN, Integer.valueOf(zzY30.zzzt(value)));
            }
        }
    }

    private static void zzZ(zzZ8W zzz8w, ShapeBase shapeBase) throws Exception {
        zzYU4 zzyu4ZzZsD = zzz8w.zzZsD();
        while (zzyu4ZzZsD.zzi()) {
            String value = zzyu4ZzZsD.getValue();
            int iZzTP = zzUR.zzTP(zzyu4ZzZsD.getLocalName());
            if (iZzTP != 3) {
                if (iZzTP == 4 && !"white".equals(value)) {
                    shapeBase.setShapeAttr(385, zzY35.zzzY(value));
                }
            } else {
                shapeBase.setShapeAttr(4110, zzz8w.zzNO(value));
            }
        }
    }

    private static void zzS(ShapeBase shapeBase, String str) {
        zzY2G zzy2g = new zzY2G(str);
        if (zzy2g.zzXT8()) {
            shapeBase.setShapeAttr(459, Integer.valueOf((int) zzy2g.zzXT4()));
        } else {
            zzY2C.zzX(shapeBase, 459, zzy2g);
        }
    }

    private static void zzS(ShapeBase shapeBase, zzYU4 zzyu4) {
        Boolean bool = Boolean.TRUE;
        shapeBase.setShapeAttr(241, bool);
        shapeBase.setShapeAttr(245, bool);
        while (zzyu4.zzi()) {
            String value = zzyu4.getValue();
            int iZzTP = zzUR.zzTP(zzyu4.getLocalName());
            if (iZzTP == 29) {
                zzO(shapeBase, value);
            } else if (iZzTP != 151) {
                switch (iZzTP) {
                    case 192:
                        zzY2C.zzV(shapeBase, 245, value);
                        break;
                    case 193:
                        zzY2C.zzV(shapeBase, 246, value);
                        break;
                    case 194:
                        zzY2C.zzV(shapeBase, StyleIdentifier.LIGHT_LIST_ACCENT_6, value);
                        break;
                    case 195:
                        zzY2C.zzV(shapeBase, StyleIdentifier.MEDIUM_SHADING_1_ACCENT_6, value);
                        break;
                    case 196:
                        shapeBase.setShapeAttr(192, value);
                        break;
                    default:
                        zzyu4.zzZ(65536, 4, com.aspose.words.internal.zzZKN.format("Import of element '{0}' is not supported upon VML import by Aspose.Words.", zzyu4.getLocalName()));
                        break;
                }
            } else {
                zzY2C.zzV(shapeBase, 241, value);
            }
        }
    }

    private static void zzT(ShapeBase shapeBase, zzYU4 zzyu4) {
        while (zzyu4.zzi()) {
            String value = zzyu4.getValue();
            switch (zzUR.zzTP(zzyu4.getLocalName())) {
                case 179:
                    zzY2C.zzV(shapeBase, 507, value);
                    break;
                case 180:
                    zzY2C.zzV(shapeBase, 383, value);
                    break;
                case 181:
                    zzY2C.zzV(shapeBase, 380, value);
                    break;
                case 182:
                    zzY2C.zzV(shapeBase, StyleIdentifier.length, value);
                    break;
                case 183:
                    zzY2C.zzZ(shapeBase, 379, value, false);
                    break;
                case 184:
                    zzY2C.zzV(shapeBase, 382, value);
                    break;
                case 185:
                    zzY2C.zzV(shapeBase, 381, value);
                    break;
                case 186:
                    int[] iArrZzyY = zzY23.zzyY(value);
                    int i = iArrZzyY.length > 0 ? iArrZzyY[0] : 0;
                    int i2 = iArrZzyY.length > 1 ? iArrZzyY[1] : 0;
                    shapeBase.setShapeAttr(StyleIdentifier.LIST_TABLE_4_ACCENT_2, Integer.valueOf(i));
                    shapeBase.setShapeAttr(StyleIdentifier.LIST_TABLE_5_DARK_ACCENT_2, Integer.valueOf(i2));
                    break;
                case 187:
                    shapeBase.setShapeAttr(StyleIdentifier.LIST_TABLE_2_ACCENT_3, Integer.valueOf(zzY30.zzzM(value)));
                    break;
                case 188:
                    zzR(shapeBase, value);
                    break;
                case 189:
                    zzQ(shapeBase, value);
                    break;
                case 190:
                    zzP(shapeBase, value);
                    break;
                case 191:
                    zzL(shapeBase, value);
                    break;
                default:
                    zzyu4.zzZ(65536, 4, com.aspose.words.internal.zzZKN.format("Import of element '{0}' is not supported upon VML import by Aspose.Words.", zzyu4.getLocalName()));
                    break;
            }
        }
    }

    private static void zzZ(ShapeBase shapeBase, String str, zzYU4 zzyu4) {
        try {
            shapeBase.setShapeAttr(781, com.aspose.words.internal.zzZQB.zzVT(str));
        } catch (NumberFormatException unused) {
            zzyu4.zzZ(65536, 4, "GFX data is corrupted, ignored.");
        }
    }

    private static boolean zzX(zzZ8W zzz8w, ShapeBase shapeBase) throws Exception {
        zzYU4 zzyu4ZzZsD = zzz8w.zzZsD();
        while (zzyu4ZzZsD.zzi()) {
            int iZzTP = zzUR.zzTP(zzyu4ZzZsD.getLocalName());
            if (iZzTP == 29) {
                zzN(shapeBase, zzyu4ZzZsD.getValue());
            } else if (iZzTP == 227) {
                zzJ(shapeBase, zzyu4ZzZsD.getValue());
            }
        }
        return zzz8w.zzs(shapeBase);
    }

    private static void zzZ(zzY2G[] zzy2gArr, zzY2G[] zzy2gArr2, ShapeBase shapeBase, boolean z) {
        if (shapeBase.getShapeType() != 20) {
            return;
        }
        zzYM5[] zzym5Arr = (zzYM5[]) shapeBase.getDirectShapeAttr(StyleIdentifier.LIST_TABLE_4);
        if (zzym5Arr == null || zzym5Arr.length < 2) {
            zzym5Arr = new zzYM5[2];
        }
        zzYM5 zzym5ZzZ = zzZ(zzy2gArr, true, z, shapeBase);
        zzYM5 zzym5ZzZ2 = zzZ(zzy2gArr2, false, z, shapeBase);
        int value = (zzym5ZzZ.zzYnF().getValue() < zzym5ZzZ2.zzYnF().getValue() ? zzym5ZzZ.zzYnF() : zzym5ZzZ2.zzYnF()).getValue();
        int value2 = (zzym5ZzZ.zzYnG().getValue() < zzym5ZzZ2.zzYnG().getValue() ? zzym5ZzZ.zzYnG() : zzym5ZzZ2.zzYnG()).getValue();
        shapeBase.setLeft(z ? value2 : ((double) value2) / 20.0d);
        shapeBase.setTop(z ? value : ((double) value) / 20.0d);
        int value3 = zzym5ZzZ2.zzYnG().getValue() - zzym5ZzZ.zzYnG().getValue();
        shapeBase.zzWf(Math.abs(z ? value3 : ((double) value3) / 20.0d));
        int value4 = zzym5ZzZ2.zzYnF().getValue() - zzym5ZzZ.zzYnF().getValue();
        shapeBase.zzWe(Math.abs(z ? value4 : ((double) value4) / 20.0d));
        zzym5Arr[0] = new zzYM5(value3 < 0 ? 21600 : 0, value4 < 0 ? 21600 : 0);
        zzym5Arr[1] = new zzYM5(value3 >= 0 ? 21600 : 0, value4 >= 0 ? 21600 : 0);
        if (value3 < 0 || value4 < 0) {
            shapeBase.setShapeAttr(StyleIdentifier.LIST_TABLE_4, zzym5Arr);
        }
    }

    private static zzYM5 zzZ(zzY2G[] zzy2gArr, boolean z, boolean z2, ShapeBase shapeBase) {
        int iZzr = z2 ? 1000 : com.aspose.words.internal.zzSA.zzr(50.0d);
        if (z) {
            iZzr = 0;
        }
        return new zzYM5(zzZ(zzy2gArr, zzZ(z, shapeBase, iZzr, z2), 0, z2), zzZ(zzy2gArr, zzY(z, shapeBase, iZzr, z2), 1, z2));
    }

    private static int zzZ(boolean z, ShapeBase shapeBase, int i, boolean z2) {
        zzYC3 zzyc3ZzYvW = shapeBase.zzYvW();
        if (z) {
            if (zzyc3ZzYvW.zzVE(4129)) {
                return zzP(shapeBase.getLeft(), z2);
            }
        } else if (zzyc3ZzYvW.zzVE(4129) && zzyc3ZzYvW.zzVE(4131)) {
            return zzP(shapeBase.getWidth() + shapeBase.getLeft(), z2);
        }
        return i;
    }

    private static zzYM2 zzZ(zzY2G[] zzy2gArr, int i, int i2, boolean z) {
        if (zzy2gArr != null && i2 <= zzy2gArr.length - 1) {
            zzY2G zzy2g = zzy2gArr[i2];
            if (!zzy2g.zzXT9()) {
                return new zzYM2(i);
            }
            if (z) {
                return new zzYM2(com.aspose.words.internal.zzAN.zzZG(zzy2g.zzXT4()));
            }
            return zzy2gArr[i2].zzXT3();
        }
        return new zzYM2(i);
    }

    private static void zzZ(ShapeBase shapeBase, String str, zzZ8W zzz8w, zzYU4 zzyu4) {
        zzY2M[] zzy2mArrZzz2 = zzz2(str);
        boolean z = true;
        for (int i = 0; i < zzy2mArrZzz2.length; i++) {
            String name = zzy2mArrZzz2[i].getName();
            String value = zzy2mArrZzz2[i].getValue();
            if (RequestParameters.POSITION.equals(name) && "absolute".equals(value)) {
                shapeBase.setShapeAttr(EditingLanguage.ARABIC_LIBYA, 3);
                z = false;
            }
            zzZ(shapeBase, name, value, zzz8w, zzyu4);
        }
        if (z) {
            shapeBase.setShapeAttr(EditingLanguage.ARABIC_LIBYA, 0);
        }
    }

    private static void zzZ(ShapeBase shapeBase, String str, String str2, zzZ8W zzz8w, zzYU4 zzyu4) {
        switch (zzUR.zzTP(str)) {
            case 105:
            case 126:
                break;
            case 106:
            case 107:
                shapeBase.setTop(zzZ(str2, 0.0d, !zzz8w.zzYXm()));
                break;
            case 108:
            case 109:
                shapeBase.setLeft(zzZ(str2, 0.0d, !zzz8w.zzYXm()));
                break;
            case 110:
                shapeBase.zzWf(zzZ(str2, 50.25d, !zzz8w.zzYXm()));
                break;
            case 111:
                shapeBase.zzWe(zzZ(str2, 50.25d, !zzz8w.zzYXm()));
                break;
            case 112:
                shapeBase.setShapeAttr(4, Integer.valueOf(zzz3(str2)));
                break;
            case 113:
                int iZzzo = zzY30.zzzo(str2);
                if (shapeBase.getDirectShapeAttr(4096) != null) {
                    iZzzo |= ((Integer) shapeBase.getDirectShapeAttr(4096)).intValue();
                }
                shapeBase.setShapeAttr(4096, Integer.valueOf(iZzzo));
                break;
            case 114:
                zzY2C.zzZ(shapeBase, 958, "hidden", "visible", str2);
                break;
            case 115:
                int iZzXa = com.aspose.words.internal.zzZYD.zzi(str2, "auto") ? 0 : zzXYN.zzXa(com.aspose.words.internal.zzJB.zzZf(str2));
                if (iZzXa < 0) {
                    shapeBase.setShapeAttr(954, Boolean.TRUE);
                }
                if (!(zzz8w instanceof zzY12)) {
                    iZzXa = zzXYN.zzYY(iZzXa, shapeBase.getBehindText());
                }
                shapeBase.setZOrder(iZzXa);
                zzz8w.zzb(shapeBase);
                break;
            case 116:
                zzY2C.zzV(shapeBase, 953, str2);
                break;
            case 117:
                zzY2C.zzT(shapeBase, SQLitePersistence.MAX_ARGS, str2);
                break;
            case 118:
                zzY2C.zzT(shapeBase, 901, str2);
                break;
            case 119:
                zzY2C.zzT(shapeBase, 902, str2);
                break;
            case 120:
                zzY2C.zzT(shapeBase, 903, str2);
                break;
            case 121:
                shapeBase.setShapeAttr(911, Integer.valueOf(zzY8T.zzHz(str2)));
                break;
            case 122:
                shapeBase.setShapeAttr(912, Integer.valueOf(zzY8T.zzHy(str2)));
                break;
            case 123:
                shapeBase.setShapeAttr(913, Integer.valueOf(zzY8T.zzHA(str2)));
                break;
            case 124:
                shapeBase.setShapeAttr(914, Integer.valueOf(zzY8T.zzAR(str2)));
                break;
            case 125:
                shapeBase.setShapeAttr(133, Integer.valueOf(zzY30.zzzu(str2)));
                break;
            case 127:
                shapeBase.setShapeAttr(135, Integer.valueOf(zzY30.zzzv(str2)));
                break;
            case 128:
                shapeBase.setShapeAttr(1986, Integer.valueOf(com.aspose.words.internal.zzJB.zzZv(str2)));
                break;
            case 129:
                shapeBase.setShapeAttr(1987, Integer.valueOf(com.aspose.words.internal.zzJB.zzZv(str2)));
                break;
            case 130:
                shapeBase.setShapeAttr(1984, Integer.valueOf(com.aspose.words.internal.zzJB.zzZv(str2)));
                break;
            case 131:
                shapeBase.setShapeAttr(1985, Integer.valueOf(com.aspose.words.internal.zzJB.zzZv(str2)));
                break;
            case 132:
                shapeBase.setShapeAttr(1988, Integer.valueOf(zzY8T.zzAS(str2)));
                break;
            case 133:
                shapeBase.setShapeAttr(1989, Integer.valueOf(zzY8T.zzAT(str2)));
                break;
            default:
                zzyu4.zzZ(65536, 4, com.aspose.words.internal.zzZKN.format("Import of element '{0}' is not supported upon VML import by Aspose.Words.", zzyu4.getLocalName()));
                break;
        }
    }

    private static void zzZ(Shape shape, zzZ8W zzz8w) throws Exception {
        zzYU4 zzyu4ZzZsD = zzz8w.zzZsD();
        boolean z = zzyu4ZzZsD.zzV("id", null) != null;
        boolean z2 = zzyu4ZzZsD.zzV("src", null) != null;
        while (zzyu4ZzZsD.zzi()) {
            String value = zzyu4ZzZsD.getValue();
            int iZzTP = zzUR.zzTP(zzyu4ZzZsD.getLocalName());
            if (iZzTP != 23) {
                if (iZzTP == 53) {
                    shape.setShapeAttr(4104, zzz8w.zzY9(value));
                } else if (iZzTP == 55) {
                    shape.setShapeAttr(EditingLanguage.GERMAN_LUXEMBOURG, value);
                } else if (iZzTP != 136) {
                    switch (iZzTP) {
                        case 153:
                            if (!z && !z2) {
                                zzZ(zzz8w, value, shape);
                            }
                            break;
                        case 154:
                            zzY2C.zzX(shape, 256, value);
                            break;
                        case 155:
                            zzY2C.zzX(shape, 257, value);
                            break;
                        case 156:
                            zzY2C.zzX(shape, StyleIdentifier.COLORFUL_LIST_ACCENT_6, value);
                            break;
                        case 157:
                            zzY2C.zzX(shape, StyleIdentifier.COLORFUL_GRID_ACCENT_6, value);
                            break;
                        case 158:
                            shape.setShapeAttr(StyleIdentifier.INTENSE_REFERENCE, zzY35.zzzY(value));
                            break;
                        case 159:
                            zzY2C.zzX(shape, StyleIdentifier.BOOK_TITLE, value);
                            break;
                        case 160:
                            zzY2C.zzX(shape, StyleIdentifier.BIBLIOGRAPHY, value);
                            break;
                        case 161:
                            zzY2C.zzX(shape, StyleIdentifier.TOC_HEADING, value);
                            break;
                        case 162:
                            zzY2C.zzV(shape, StyleIdentifier.GRID_TABLE_3_ACCENT_6, value);
                            break;
                        case 163:
                            zzY2C.zzV(shape, StyleIdentifier.GRID_TABLE_4_ACCENT_6, value);
                            break;
                        case 164:
                            shape.setShapeAttr(StyleIdentifier.PLAIN_TABLE_2, zzY35.zzzY(value));
                            break;
                        case 165:
                            com.aspose.words.internal.zzPV zzpvZzzY = zzY35.zzzY(value);
                            shape.setShapeAttr(StyleIdentifier.GRID_TABLE_3_ACCENT_1, Integer.valueOf(zzpvZzzY.zzPC() + (zzpvZzzY.zzPA() << 16) + (zzpvZzzY.zzPB() << 8)));
                            break;
                        default:
                            zzyu4ZzZsD.zzZ(65536, 4, com.aspose.words.internal.zzZKN.format("Import of element '{0}' is not supported upon VML import by Aspose.Words.", zzyu4ZzZsD.getLocalName()));
                            break;
                    }
                } else {
                    zzZ(zzz8w, value, shape);
                }
            } else if ("r".equals(zzyu4ZzZsD.getPrefix())) {
                zzZ(zzz8w, value, shape);
            }
        }
    }

    private static int zzY(boolean z, ShapeBase shapeBase, int i, boolean z2) {
        zzYC3 zzyc3ZzYvW = shapeBase.zzYvW();
        if (z) {
            if (zzyc3ZzYvW.zzVE(4130)) {
                return zzP(shapeBase.getTop(), z2);
            }
        } else if (zzyc3ZzYvW.zzVE(4130) && zzyc3ZzYvW.zzVE(4132)) {
            return zzP(shapeBase.getHeight() + shapeBase.getTop(), z2);
        }
        return i;
    }

    private static void zzY(ShapeBase shapeBase, int i, String str) throws Exception {
        int iZzGN = zzYU3.zzGN(str);
        if (iZzGN != Integer.MIN_VALUE) {
            if (i == 4155 && zzYBW.zzm3(iZzGN) == null) {
                return;
            }
            shapeBase.setShapeAttr(i, Integer.valueOf(iZzGN));
        }
    }

    private static void zzZ(zzZ8W zzz8w, String str, Shape shape) throws Exception {
        if (com.aspose.words.internal.zzZYD.zzXk(str) && zzz8w.zzNM(str)) {
            shape.setShapeAttr(4104, zzz8w.zzY9(str));
        } else {
            shape.getImageData().zzY7(zzz8w.zzNO(str));
        }
    }

    private static void zzY(ShapeBase shapeBase, zzZ8W zzz8w) {
        zzYU4 zzyu4ZzZsD = zzz8w.zzZsD();
        while (zzyu4ZzZsD.zzi()) {
            String value = zzyu4ZzZsD.getValue();
            int iZzTP = zzUR.zzTP(zzyu4ZzZsD.getLocalName());
            if (iZzTP == 134) {
                shapeBase.setShapeAttr(1792, com.aspose.words.internal.zzZQB.zzVT(value));
            } else if (iZzTP == 135) {
                shapeBase.setShapeAttr(1855, Boolean.valueOf("t".equals(value)));
            }
        }
    }

    private static void zzZ(ShapeBase shapeBase, int i, zzYU4 zzyu4) {
        zzYC3 zzyc3ZzYvW = shapeBase.zzYvW();
        Border border = (Border) zzyc3ZzYvW.zzPk(i);
        if (border == null) {
            border = new Border();
            zzyc3ZzYvW.zzQ(i, border);
        }
        while (zzyu4.zzi()) {
            String value = zzyu4.getValue();
            int iZzTP = zzUR.zzTP(zzyu4.getLocalName());
            if (iZzTP == 26) {
                border.zzOV(zzY30.zzzL(value));
            } else if (iZzTP == 78) {
                border.setShadow("t".equals(value));
            } else if (iZzTP == 110) {
                border.zzZ5(com.aspose.words.internal.zzJB.parseDouble(value) / 8.0d);
                border.zz8V();
            }
        }
    }

    private static double zzZ(String str, double d, boolean z) {
        zzY2G zzy2g = new zzY2G(str, z ? "px" : TranslateLanguage.PORTUGUESE);
        return zzy2g.zzXT9() ? zzy2g.zzXT4() : d;
    }

    private static zzY2M[] zzZ(zzY2M[] zzy2mArr) {
        int i = 0;
        for (zzY2M zzy2m : zzy2mArr) {
            if (zzy2m != null) {
                zzy2mArr[i] = zzy2m;
                i++;
            }
        }
        zzY2M[] zzy2mArr2 = new zzY2M[i];
        for (int i2 = 0; i2 < i; i2++) {
            zzy2mArr2[i2] = zzy2mArr[i2];
        }
        return zzy2mArr2;
    }

    private static boolean zzZ(zzZ8W zzz8w, ShapeBase shapeBase, String str) throws Exception {
        byte[] bArrZzZW;
        boolean zZzNM = zzz8w.zzNM(str);
        if (zZzNM) {
            bArrZzZW = zzZ8I.zzZ(zzz8w.zzY9(str), zzz8w.getDocument());
        } else {
            bArrZzZW = zzZ8K.zzZW(zzz8w.zzNO(str));
        }
        if (bArrZzZW == null || bArrZzZW.length == 0) {
            return zZzNM;
        }
        shapeBase.setShapeAttr(4110, bArrZzZW);
        return true;
    }
}
