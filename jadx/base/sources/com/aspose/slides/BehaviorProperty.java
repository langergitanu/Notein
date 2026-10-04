package com.aspose.slides;

import com.aspose.slides.Collections.Generic.Dictionary;
import com.aspose.slides.p559ms.System.C14067j2;
import com.aspose.slides.p559ms.System.C14113y2;

/* JADX INFO: loaded from: classes3.dex */
public class BehaviorProperty implements IBehaviorProperty {

    /* JADX INFO: renamed from: kk */
    private final String f1221kk;

    /* JADX INFO: renamed from: to */
    private final boolean f1222to;

    /* JADX INFO: renamed from: k4 */
    private static final Dictionary<String, BehaviorProperty> f1146k4 = new Dictionary<>();

    /* JADX INFO: renamed from: x1 */
    private static final Object f1202x1 = new Object();

    /* JADX INFO: renamed from: du */
    private static final BehaviorProperty f1121du = new BehaviorProperty("ppt_x");

    /* JADX INFO: renamed from: h4 */
    private static final BehaviorProperty f1135h4 = new BehaviorProperty("ppt_y");

    /* JADX INFO: renamed from: m9 */
    private static final BehaviorProperty f1155m9 = new BehaviorProperty("ppt_w");

    /* JADX INFO: renamed from: dy */
    private static final BehaviorProperty f1123dy = new BehaviorProperty("ppt_h");

    /* JADX INFO: renamed from: c5 */
    private static final BehaviorProperty f1112c5 = new BehaviorProperty("ppt_c");

    /* JADX INFO: renamed from: jd */
    private static final BehaviorProperty f1142jd = new BehaviorProperty("ppt_r");

    /* JADX INFO: renamed from: ck */
    private static final BehaviorProperty f1115ck = new BehaviorProperty("xshear");

    /* JADX INFO: renamed from: fa */
    private static final BehaviorProperty f1130fa = new BehaviorProperty("yshear");

    /* JADX INFO: renamed from: up */
    private static final BehaviorProperty f1189up = new BehaviorProperty("image");

    /* JADX INFO: renamed from: yj */
    private static final BehaviorProperty f1214yj = new BehaviorProperty("ScaleX");

    /* JADX INFO: renamed from: ks */
    private static final BehaviorProperty f1149ks = new BehaviorProperty("ScaleY");

    /* JADX INFO: renamed from: rv */
    private static final BehaviorProperty f1176rv = new BehaviorProperty("r");

    /* JADX INFO: renamed from: x6 */
    private static final BehaviorProperty f1205x6 = new BehaviorProperty("fillcolor");

    /* JADX INFO: renamed from: ne */
    private static final BehaviorProperty f1159ne = new BehaviorProperty("style.opacity");

    /* JADX INFO: renamed from: ix */
    private static final BehaviorProperty f1139ix = new BehaviorProperty("style.rotation");

    /* JADX INFO: renamed from: u4 */
    private static final BehaviorProperty f1186u4 = new BehaviorProperty("style.visibility");

    /* JADX INFO: renamed from: uz */
    private static final BehaviorProperty f1190uz = new BehaviorProperty("style.color");

    /* JADX INFO: renamed from: wl */
    private static final BehaviorProperty f1197wl = new BehaviorProperty("style.fontSize");

    /* JADX INFO: renamed from: qq */
    private static final BehaviorProperty f1171qq = new BehaviorProperty("style.fontWeight");

    /* JADX INFO: renamed from: ar */
    private static final BehaviorProperty f1101ar = new BehaviorProperty("style.fontStyle");

    /* JADX INFO: renamed from: um */
    private static final BehaviorProperty f1188um = new BehaviorProperty("style.fontFamily");

    /* JADX INFO: renamed from: bv */
    private static final BehaviorProperty f1109bv = new BehaviorProperty("style.textEffectEmboss");

    /* JADX INFO: renamed from: v4 */
    private static final BehaviorProperty f1191v4 = new BehaviorProperty("style.textShadow");

    /* JADX INFO: renamed from: lr */
    private static final BehaviorProperty f1151lr = new BehaviorProperty("style.textTransform");

    /* JADX INFO: renamed from: yd */
    private static final BehaviorProperty f1212yd = new BehaviorProperty("style.textDecorationUnderline");

    /* JADX INFO: renamed from: b3 */
    private static final BehaviorProperty f1104b3 = new BehaviorProperty("style.textEffectOutline");

    /* JADX INFO: renamed from: wy */
    private static final BehaviorProperty f1200wy = new BehaviorProperty("style.textDecorationLineThrough");

    /* JADX INFO: renamed from: ak */
    private static final BehaviorProperty f1100ak = new BehaviorProperty("style.sRotation");

    /* JADX INFO: renamed from: dq */
    private static final BehaviorProperty f1120dq = new BehaviorProperty("imageData.cropTop");

    /* JADX INFO: renamed from: xk */
    private static final BehaviorProperty f1207xk = new BehaviorProperty("imageData.cropBottom");

    /* JADX INFO: renamed from: c6 */
    private static final BehaviorProperty f1113c6 = new BehaviorProperty("imageData.cropLeft");

    /* JADX INFO: renamed from: ts */
    private static final BehaviorProperty f1184ts = new BehaviorProperty("imageData.cropRight");

    /* JADX INFO: renamed from: e0 */
    private static final BehaviorProperty f1124e0 = new BehaviorProperty("imageData.gain");

    /* JADX INFO: renamed from: bz */
    private static final BehaviorProperty f1110bz = new BehaviorProperty("imageData.blacklevel");

    /* JADX INFO: renamed from: qm */
    private static final BehaviorProperty f1169qm = new BehaviorProperty("imageData.gamma");

    /* JADX INFO: renamed from: g8 */
    private static final BehaviorProperty f1131g8 = new BehaviorProperty("imageData.grayscale");

    /* JADX INFO: renamed from: sv */
    private static final BehaviorProperty f1180sv = new BehaviorProperty("imageData.chromakey");

    /* JADX INFO: renamed from: wp */
    private static final BehaviorProperty f1198wp = new BehaviorProperty("fill.on");

    /* JADX INFO: renamed from: ss */
    private static final BehaviorProperty f1179ss = new BehaviorProperty("fill.type");

    /* JADX INFO: renamed from: kp */
    private static final BehaviorProperty f1148kp = new BehaviorProperty("fill.color");

    /* JADX INFO: renamed from: gi */
    private static final BehaviorProperty f1133gi = new BehaviorProperty("fill.opacity");

    /* JADX INFO: renamed from: s7 */
    private static final BehaviorProperty f1177s7 = new BehaviorProperty("fill.color2");

    /* JADX INFO: renamed from: f9 */
    private static final BehaviorProperty f1129f9 = new BehaviorProperty("fill.method");

    /* JADX INFO: renamed from: t6 */
    private static final BehaviorProperty f1181t6 = new BehaviorProperty("fill.opacity2");

    /* JADX INFO: renamed from: xw */
    private static final BehaviorProperty f1208xw = new BehaviorProperty("fill.angle");

    /* JADX INFO: renamed from: vj */
    private static final BehaviorProperty f1193vj = new BehaviorProperty("fill.focus");

    /* JADX INFO: renamed from: vh */
    private static final BehaviorProperty f1192vh = new BehaviorProperty("fill.focusposition.x");

    /* JADX INFO: renamed from: qw */
    private static final BehaviorProperty f1172qw = new BehaviorProperty("fill.focusposition.y");

    /* JADX INFO: renamed from: tq */
    private static final BehaviorProperty f1183tq = new BehaviorProperty("fill.focussize.x");

    /* JADX INFO: renamed from: j2 */
    private static final BehaviorProperty f1140j2 = new BehaviorProperty("fill.focussize.y");

    /* JADX INFO: renamed from: w6 */
    private static final BehaviorProperty f1196w6 = new BehaviorProperty("stroke.on");

    /* JADX INFO: renamed from: os */
    private static final BehaviorProperty f1164os = new BehaviorProperty("stroke.color");

    /* JADX INFO: renamed from: em */
    private static final BehaviorProperty f1126em = new BehaviorProperty("stroke.weight");

    /* JADX INFO: renamed from: zj */
    private static final BehaviorProperty f1219zj = new BehaviorProperty("stroke.opacity");

    /* JADX INFO: renamed from: ai */
    private static final BehaviorProperty f1099ai = new BehaviorProperty("stroke.linestyle");

    /* JADX INFO: renamed from: ri */
    private static final BehaviorProperty f1174ri = new BehaviorProperty("stroke.dashstyle");

    /* JADX INFO: renamed from: ca */
    private static final BehaviorProperty f1114ca = new BehaviorProperty("stroke.filltype");

    /* JADX INFO: renamed from: bs */
    private static final BehaviorProperty f1107bs = new BehaviorProperty("stroke.src");

    /* JADX INFO: renamed from: he */
    private static final BehaviorProperty f1136he = new BehaviorProperty("stroke.color2");

    /* JADX INFO: renamed from: jw */
    private static final BehaviorProperty f1144jw = new BehaviorProperty("stroke.imagesize.x");

    /* JADX INFO: renamed from: y2 */
    private static final BehaviorProperty f1209y2 = new BehaviorProperty("stroke.imagesize.y");

    /* JADX INFO: renamed from: m4 */
    private static final BehaviorProperty f1154m4 = new BehaviorProperty("stroke.startArrow");

    /* JADX INFO: renamed from: m2 */
    private static final BehaviorProperty f1153m2 = new BehaviorProperty("stroke.endArrow");

    /* JADX INFO: renamed from: j5 */
    private static final BehaviorProperty f1141j5 = new BehaviorProperty("stroke.startArrowWidth");

    /* JADX INFO: renamed from: nv */
    private static final BehaviorProperty f1162nv = new BehaviorProperty("stroke.startArrowLength");

    /* JADX INFO: renamed from: y9 */
    private static final BehaviorProperty f1211y9 = new BehaviorProperty("stroke.endArrowWidth");

    /* JADX INFO: renamed from: gf */
    private static final BehaviorProperty f1132gf = new BehaviorProperty("stroke.endArrowLength");

    /* JADX INFO: renamed from: ig */
    private static final BehaviorProperty f1137ig = new BehaviorProperty("shadow.on");

    /* JADX INFO: renamed from: gk */
    private static final BehaviorProperty f1134gk = new BehaviorProperty("shadow.type");

    /* JADX INFO: renamed from: x5 */
    private static final BehaviorProperty f1204x5 = new BehaviorProperty("shadow.color");

    /* JADX INFO: renamed from: yo */
    private static final BehaviorProperty f1216yo = new BehaviorProperty("shadow.color2");

    /* JADX INFO: renamed from: na */
    private static final BehaviorProperty f1158na = new BehaviorProperty("shadow.opacity");

    /* JADX INFO: renamed from: wz */
    private static final BehaviorProperty f1201wz = new BehaviorProperty("shadow.offset.x");

    /* JADX INFO: renamed from: u1 */
    private static final BehaviorProperty f1185u1 = new BehaviorProperty("shadow.offset.y");

    /* JADX INFO: renamed from: yn */
    private static final BehaviorProperty f1215yn = new BehaviorProperty("shadow.offset2.x");

    /* JADX INFO: renamed from: yg */
    private static final BehaviorProperty f1213yg = new BehaviorProperty("shadow.offset2.y");

    /* JADX INFO: renamed from: my */
    private static final BehaviorProperty f1156my = new BehaviorProperty("shadow.origin.x");

    /* JADX INFO: renamed from: b1 */
    private static final BehaviorProperty f1103b1 = new BehaviorProperty("shadow.origin.y");

    /* JADX INFO: renamed from: yw */
    private static final BehaviorProperty f1217yw = new BehaviorProperty("shadow.matrix.xtox");

    /* JADX INFO: renamed from: zm */
    private static final BehaviorProperty f1220zm = new BehaviorProperty("shadow.matrix.xtoy");

    /* JADX INFO: renamed from: ii */
    private static final BehaviorProperty f1138ii = new BehaviorProperty("shadow.matrix.ytox");

    /* JADX INFO: renamed from: dc */
    private static final BehaviorProperty f1118dc = new BehaviorProperty("shadow.matrix.ytoy");

    /* JADX INFO: renamed from: d4 */
    private static final BehaviorProperty f1117d4 = new BehaviorProperty("shadow.matrix.perspectiveX");

    /* JADX INFO: renamed from: y4 */
    private static final BehaviorProperty f1210y4 = new BehaviorProperty("shadow.matrix.perspectiveY");

    /* JADX INFO: renamed from: vw */
    private static final BehaviorProperty f1195vw = new BehaviorProperty("skew.on");

    /* JADX INFO: renamed from: vt */
    private static final BehaviorProperty f1194vt = new BehaviorProperty("skew.offset.x");

    /* JADX INFO: renamed from: qn */
    private static final BehaviorProperty f1170qn = new BehaviorProperty("skew.offset.y");

    /* JADX INFO: renamed from: qk */
    private static final BehaviorProperty f1168qk = new BehaviorProperty("skew.origin.x");

    /* JADX INFO: renamed from: rq */
    private static final BehaviorProperty f1175rq = new BehaviorProperty("skew.origin.y");

    /* JADX INFO: renamed from: af */
    private static final BehaviorProperty f1098af = new BehaviorProperty("skew.matrix.xtox");

    /* JADX INFO: renamed from: x3 */
    private static final BehaviorProperty f1203x3 = new BehaviorProperty("skew.matrix.xtoy");

    /* JADX INFO: renamed from: sq */
    private static final BehaviorProperty f1178sq = new BehaviorProperty("skew.matrix.ytox");

    /* JADX INFO: renamed from: u5 */
    private static final BehaviorProperty f1187u5 = new BehaviorProperty("skew.matrix.ytoy");

    /* JADX INFO: renamed from: lm */
    private static final BehaviorProperty f1150lm = new BehaviorProperty("skew.matrix.perspectiveX");

    /* JADX INFO: renamed from: c4 */
    private static final BehaviorProperty f1111c4 = new BehaviorProperty("skew.matrix.perspectiveY");

    /* JADX INFO: renamed from: jf */
    private static final BehaviorProperty f1143jf = new BehaviorProperty("extrusion.on");

    /* JADX INFO: renamed from: av */
    private static final BehaviorProperty f1102av = new BehaviorProperty("extrusion.type");

    /* JADX INFO: renamed from: ou */
    private static final BehaviorProperty f1165ou = new BehaviorProperty("extrusion.render");

    /* JADX INFO: renamed from: xi */
    private static final BehaviorProperty f1206xi = new BehaviorProperty("extrusion.viewpointorigin.x");

    /* JADX INFO: renamed from: bu */
    private static final BehaviorProperty f1108bu = new BehaviorProperty("extrusion.viewpointorigin.y");

    /* JADX INFO: renamed from: nh */
    private static final BehaviorProperty f1160nh = new BehaviorProperty("extrusion.viewpoint.x");

    /* JADX INFO: renamed from: o9 */
    private static final BehaviorProperty f1163o9 = new BehaviorProperty("extrusion.viewpoint.y");

    /* JADX INFO: renamed from: dl */
    private static final BehaviorProperty f1119dl = new BehaviorProperty("extrusion.viewpoint.z");

    /* JADX INFO: renamed from: f7 */
    private static final BehaviorProperty f1128f7 = new BehaviorProperty("extrusion.plane");

    /* JADX INFO: renamed from: ly */
    private static final BehaviorProperty f1152ly = new BehaviorProperty("extrusion.skewangle");

    /* JADX INFO: renamed from: q6 */
    private static final BehaviorProperty f1167q6 = new BehaviorProperty("extrusion.skewamt");

    /* JADX INFO: renamed from: dw */
    private static final BehaviorProperty f1122dw = new BehaviorProperty("extrusion.backdepth");

    /* JADX INFO: renamed from: tl */
    private static final BehaviorProperty f1182tl = new BehaviorProperty("extrusion.foredepth");

    /* JADX INFO: renamed from: q3 */
    private static final BehaviorProperty f1166q3 = new BehaviorProperty("extrusion.orientation.x");

    /* JADX INFO: renamed from: e8 */
    private static final BehaviorProperty f1125e8 = new BehaviorProperty("extrusion.orientation.y");

    /* JADX INFO: renamed from: bg */
    private static final BehaviorProperty f1106bg = new BehaviorProperty("extrusion.orientation.z");

    /* JADX INFO: renamed from: k5 */
    private static final BehaviorProperty f1147k5 = new BehaviorProperty("extrusion.orientationangle");

    /* JADX INFO: renamed from: d3 */
    private static final BehaviorProperty f1116d3 = new BehaviorProperty("extrusion.color");

    /* JADX INFO: renamed from: ew */
    private static final BehaviorProperty f1127ew = new BehaviorProperty("extrusion.rotationangle.x");

    /* JADX INFO: renamed from: b5 */
    private static final BehaviorProperty f1105b5 = new BehaviorProperty("extrusion.rotationangle.y");

    /* JADX INFO: renamed from: r7 */
    private static final BehaviorProperty f1173r7 = new BehaviorProperty("extrusion.lockrotationcenter");

    /* JADX INFO: renamed from: nk */
    private static final BehaviorProperty f1161nk = new BehaviorProperty("extrusion.autorotationcenter");

    /* JADX INFO: renamed from: n3 */
    private static final BehaviorProperty f1157n3 = new BehaviorProperty("extrusion.rotationcenter.x");

    /* JADX INFO: renamed from: zd */
    private static final BehaviorProperty f1218zd = new BehaviorProperty("extrusion.rotationcenter.y");

    /* JADX INFO: renamed from: k1 */
    private static final BehaviorProperty f1145k1 = new BehaviorProperty("extrusion.rotationcenter.z");

    /* JADX INFO: renamed from: wt */
    private static final BehaviorProperty f1199wt = new BehaviorProperty("extrusion.colormode");

    private BehaviorProperty(String str) {
        this(str, false);
    }

    public static BehaviorProperty getExtrusionAutoRotationCenter() {
        return f1161nk;
    }

    public static BehaviorProperty getExtrusionBackDepth() {
        return f1122dw;
    }

    public static BehaviorProperty getExtrusionColor() {
        return f1116d3;
    }

    public static BehaviorProperty getExtrusionColorMode() {
        return f1199wt;
    }

    public static BehaviorProperty getExtrusionForeDepth() {
        return f1182tl;
    }

    public static BehaviorProperty getExtrusionLockRotationCenter() {
        return f1173r7;
    }

    public static BehaviorProperty getExtrusionOn() {
        return f1143jf;
    }

    public static BehaviorProperty getExtrusionOrientationAngle() {
        return f1147k5;
    }

    public static BehaviorProperty getExtrusionOrientationX() {
        return f1166q3;
    }

    public static BehaviorProperty getExtrusionOrientationY() {
        return f1125e8;
    }

    public static BehaviorProperty getExtrusionOrientationZ() {
        return f1106bg;
    }

    public static BehaviorProperty getExtrusionPlane() {
        return f1128f7;
    }

    public static BehaviorProperty getExtrusionRender() {
        return f1165ou;
    }

    public static BehaviorProperty getExtrusionRotationAngleX() {
        return f1127ew;
    }

    public static BehaviorProperty getExtrusionRotationAngleY() {
        return f1105b5;
    }

    public static BehaviorProperty getExtrusionRotationCenterX() {
        return f1157n3;
    }

    public static BehaviorProperty getExtrusionRotationCenterY() {
        return f1218zd;
    }

    public static BehaviorProperty getExtrusionRotationCenterZ() {
        return f1145k1;
    }

    public static BehaviorProperty getExtrusionSkewAmt() {
        return f1167q6;
    }

    public static BehaviorProperty getExtrusionSkewAngle() {
        return f1152ly;
    }

    public static BehaviorProperty getExtrusionType() {
        return f1102av;
    }

    public static BehaviorProperty getExtrusionViewPointOriginX() {
        return f1206xi;
    }

    public static BehaviorProperty getExtrusionViewPointOriginY() {
        return f1108bu;
    }

    public static BehaviorProperty getExtrusionViewPointX() {
        return f1160nh;
    }

    public static BehaviorProperty getExtrusionViewPointY() {
        return f1163o9;
    }

    public static BehaviorProperty getExtrusionViewPointZ() {
        return f1119dl;
    }

    public static BehaviorProperty getFillAngle() {
        return f1208xw;
    }

    public static BehaviorProperty getFillColor() {
        return f1205x6;
    }

    public static BehaviorProperty getFillColor2() {
        return f1177s7;
    }

    public static BehaviorProperty getFillFocus() {
        return f1193vj;
    }

    public static BehaviorProperty getFillFocusPositionX() {
        return f1192vh;
    }

    public static BehaviorProperty getFillFocusPositionY() {
        return f1172qw;
    }

    public static BehaviorProperty getFillFocusSizeX() {
        return f1183tq;
    }

    public static BehaviorProperty getFillFocusSizeY() {
        return f1140j2;
    }

    public static BehaviorProperty getFillMethod() {
        return f1129f9;
    }

    public static BehaviorProperty getFillOn() {
        return f1198wp;
    }

    public static BehaviorProperty getFillOpacity() {
        return f1133gi;
    }

    public static BehaviorProperty getFillOpacity2() {
        return f1181t6;
    }

    public static BehaviorProperty getFillType() {
        return f1179ss;
    }

    public static BehaviorProperty getFill_Color() {
        return f1148kp;
    }

    public static BehaviorProperty getImage() {
        return f1189up;
    }

    public static BehaviorProperty getImageDataBlacklevel() {
        return f1110bz;
    }

    public static BehaviorProperty getImageDataChromakey() {
        return f1180sv;
    }

    public static BehaviorProperty getImageDataCropBottom() {
        return f1207xk;
    }

    public static BehaviorProperty getImageDataCropLeft() {
        return f1113c6;
    }

    public static BehaviorProperty getImageDataCropRight() {
        return f1184ts;
    }

    public static BehaviorProperty getImageDataCropTop() {
        return f1120dq;
    }

    public static BehaviorProperty getImageDataGain() {
        return f1124e0;
    }

    public static BehaviorProperty getImageDataGamma() {
        return f1169qm;
    }

    public static BehaviorProperty getImageDataGrayscale() {
        return f1131g8;
    }

    public static BehaviorProperty getOrCreateByValue(String str) {
        String strM67440x1 = C14113y2.m67440x1(str);
        Dictionary<String, BehaviorProperty> dictionary = f1146k4;
        return dictionary.containsKey(strM67440x1) ? dictionary.get_Item(strM67440x1) : new BehaviorProperty(strM67440x1, true);
    }

    public static BehaviorProperty getPptC() {
        return f1112c5;
    }

    public static BehaviorProperty getPptH() {
        return f1123dy;
    }

    public static BehaviorProperty getPptR() {
        return f1142jd;
    }

    public static BehaviorProperty getPptW() {
        return f1155m9;
    }

    public static BehaviorProperty getPptX() {
        return f1121du;
    }

    public static BehaviorProperty getPptY() {
        return f1135h4;
    }

    public static BehaviorProperty getR() {
        return f1176rv;
    }

    public static BehaviorProperty getScaleX() {
        return f1214yj;
    }

    public static BehaviorProperty getScaleY() {
        return f1149ks;
    }

    public static BehaviorProperty getShadowColor() {
        return f1204x5;
    }

    public static BehaviorProperty getShadowColor2() {
        return f1216yo;
    }

    public static BehaviorProperty getShadowMatrixPerspectiveX() {
        return f1117d4;
    }

    public static BehaviorProperty getShadowMatrixPerspectiveY() {
        return f1210y4;
    }

    public static BehaviorProperty getShadowMatrixXtoX() {
        return f1217yw;
    }

    public static BehaviorProperty getShadowMatrixXtoY() {
        return f1220zm;
    }

    public static BehaviorProperty getShadowMatrixYtoX() {
        return f1138ii;
    }

    public static BehaviorProperty getShadowMatrixYtoY() {
        return f1118dc;
    }

    public static BehaviorProperty getShadowOffset2X() {
        return f1215yn;
    }

    public static BehaviorProperty getShadowOffset2Y() {
        return f1213yg;
    }

    public static BehaviorProperty getShadowOffsetX() {
        return f1201wz;
    }

    public static BehaviorProperty getShadowOffsetY() {
        return f1185u1;
    }

    public static BehaviorProperty getShadowOn() {
        return f1137ig;
    }

    public static BehaviorProperty getShadowOpacity() {
        return f1158na;
    }

    public static BehaviorProperty getShadowOriginX() {
        return f1156my;
    }

    public static BehaviorProperty getShadowOriginY() {
        return f1103b1;
    }

    public static BehaviorProperty getShadowType() {
        return f1134gk;
    }

    public static BehaviorProperty getSkewMatrixPerspectiveX() {
        return f1150lm;
    }

    public static BehaviorProperty getSkewMatrixPerspectiveY() {
        return f1111c4;
    }

    public static BehaviorProperty getSkewMatrixXtoX() {
        return f1098af;
    }

    public static BehaviorProperty getSkewMatrixXtoY() {
        return f1203x3;
    }

    public static BehaviorProperty getSkewMatrixYtoX() {
        return f1178sq;
    }

    public static BehaviorProperty getSkewMatrixYtoY() {
        return f1187u5;
    }

    public static BehaviorProperty getSkewOffsetX() {
        return f1194vt;
    }

    public static BehaviorProperty getSkewOffsetY() {
        return f1170qn;
    }

    public static BehaviorProperty getSkewOn() {
        return f1195vw;
    }

    public static BehaviorProperty getSkewOriginX() {
        return f1168qk;
    }

    public static BehaviorProperty getSkewOriginY() {
        return f1175rq;
    }

    public static BehaviorProperty getStrokeColor() {
        return f1164os;
    }

    public static BehaviorProperty getStrokeColor2() {
        return f1136he;
    }

    public static BehaviorProperty getStrokeDashStyle() {
        return f1174ri;
    }

    public static BehaviorProperty getStrokeEndArrow() {
        return f1153m2;
    }

    public static BehaviorProperty getStrokeEndArrowLength() {
        return f1132gf;
    }

    public static BehaviorProperty getStrokeEndArrowWidth() {
        return f1211y9;
    }

    public static BehaviorProperty getStrokeFillType() {
        return f1114ca;
    }

    public static BehaviorProperty getStrokeImageSizeX() {
        return f1144jw;
    }

    public static BehaviorProperty getStrokeImageSizeY() {
        return f1209y2;
    }

    public static BehaviorProperty getStrokeLineStyle() {
        return f1099ai;
    }

    public static BehaviorProperty getStrokeOn() {
        return f1196w6;
    }

    public static BehaviorProperty getStrokeOpacity() {
        return f1219zj;
    }

    public static BehaviorProperty getStrokeSrc() {
        return f1107bs;
    }

    public static BehaviorProperty getStrokeStartArrow() {
        return f1154m4;
    }

    public static BehaviorProperty getStrokeStartArrowLength() {
        return f1162nv;
    }

    public static BehaviorProperty getStrokeStartArrowWidth() {
        return f1141j5;
    }

    public static BehaviorProperty getStrokeWeight() {
        return f1126em;
    }

    public static BehaviorProperty getStyleColor() {
        return f1190uz;
    }

    public static BehaviorProperty getStyleFontFamily() {
        return f1188um;
    }

    public static BehaviorProperty getStyleFontSize() {
        return f1197wl;
    }

    public static BehaviorProperty getStyleFontStyle() {
        return f1101ar;
    }

    public static BehaviorProperty getStyleFontWeight() {
        return f1171qq;
    }

    public static BehaviorProperty getStyleOpacity() {
        return f1159ne;
    }

    public static BehaviorProperty getStyleRotation() {
        return f1139ix;
    }

    public static BehaviorProperty getStyleSRotation() {
        return f1100ak;
    }

    public static BehaviorProperty getStyleTextDecorationLineThrough() {
        return f1200wy;
    }

    public static BehaviorProperty getStyleTextDecorationUnderline() {
        return f1212yd;
    }

    public static BehaviorProperty getStyleTextEffectEmboss() {
        return f1109bv;
    }

    public static BehaviorProperty getStyleTextEffectOutline() {
        return f1104b3;
    }

    public static BehaviorProperty getStyleTextShadow() {
        return f1191v4;
    }

    public static BehaviorProperty getStyleTextTransform() {
        return f1151lr;
    }

    public static BehaviorProperty getStyleVisibility() {
        return f1186u4;
    }

    public static BehaviorProperty getXShear() {
        return f1115ck;
    }

    public static BehaviorProperty getYShear() {
        return f1130fa;
    }

    public final boolean equals(BehaviorProperty behaviorProperty) {
        return C14113y2.m67363du(this.f1221kk, behaviorProperty.f1221kk);
    }

    @Override // com.aspose.slides.IBehaviorProperty
    public final String getValue() {
        return this.f1221kk;
    }

    public int hashCode() {
        String str = this.f1221kk;
        if (str != null) {
            return str.hashCode();
        }
        return 0;
    }

    @Override // com.aspose.slides.IBehaviorProperty
    public final boolean isCustom() {
        return this.f1222to;
    }

    private BehaviorProperty(String str, boolean z) {
        this.f1221kk = str;
        this.f1222to = z;
        synchronized (f1202x1) {
            try {
                Dictionary<String, BehaviorProperty> dictionary = f1146k4;
                if (!dictionary.containsKey(str)) {
                    dictionary.addItem(str, this);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public boolean equals(Object obj) {
        if (C14067j2.m66729x1(null, obj)) {
            return false;
        }
        if (C14067j2.m66729x1(this, obj)) {
            return true;
        }
        if (C14067j2.m66727k4(obj) != C14067j2.m66727k4(this)) {
            return false;
        }
        return equals((BehaviorProperty) obj);
    }
}
