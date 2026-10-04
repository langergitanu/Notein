package com.aspose.slides.internal.p529yn;

import com.alibaba.sdk.android.oss.common.RequestParameters;
import com.aspose.slides.internal.p055c4.AbstractC1943dy;
import com.aspose.slides.internal.p231kk.InterfaceC5790jd;
import com.aspose.slides.internal.p231kk.InterfaceC5810wl;
import com.aspose.slides.internal.p253lm.AbstractC6123ca;
import com.aspose.slides.internal.p253lm.C6208y2;
import com.aspose.slides.internal.p314oc.C7017h4;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.p559ms.System.AbstractC14068j5;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.huawei.hms.support.hianalytics.HiAnalyticsConstant;

/* JADX INFO: renamed from: com.aspose.slides.internal.yn.k4 */
/* JADX INFO: loaded from: classes5.dex */
public class C12868k4 extends AbstractC1943dy {

    /* JADX INFO: renamed from: k4 */
    private static final AbstractC14068j5 f43358k4 = C7019kk.m27443k4((Class<?>) InterfaceC5790jd.class);

    /* JADX INFO: renamed from: kk */
    private static final C7017h4 f43359kk = new C7017h4("get_azimuth", "set_azimuth", "get_background", "set_background", "get_backgroundAttachment", "set_backgroundAttachment", "get_backgroundColor", "set_backgroundColor", "get_backgroundImage", "set_backgroundImage", "get_backgroundPosition", "set_backgroundPosition", "get_backgroundRepeat", "set_backgroundRepeat", "get_border", "set_border", "get_borderCollapse", "set_borderCollapse", "get_borderColor", "set_borderColor", "get_borderSpacing", "set_borderSpacing", "get_borderStyle", "set_borderStyle", "get_borderTop", "set_borderTop", "get_borderRight", "set_borderRight", "get_borderBottom", "set_borderBottom", "get_borderLeft", "set_borderLeft", "get_borderTopColor", "set_borderTopColor", "get_borderRightColor", "set_borderRightColor", "get_borderBottomColor", "set_borderBottomColor", "get_borderLeftColor", "set_borderLeftColor", "get_borderTopStyle", "set_borderTopStyle", "get_borderRightStyle", "set_borderRightStyle", "get_borderBottomStyle", "set_borderBottomStyle", "get_borderLeftStyle", "set_borderLeftStyle", "get_borderTopWidth", "set_borderTopWidth", "get_borderRightWidth", "set_borderRightWidth", "get_borderBottomWidth", "set_borderBottomWidth", "get_borderLeftWidth", "set_borderLeftWidth", "get_borderWidth", "set_borderWidth", "get_bottom", "set_bottom", "get_captionSide", "set_captionSide", "get_clear", "set_clear", "get_clip", "set_clip", "get_color", "set_color", "get_content", "set_content", "get_counterIncrement", "set_counterIncrement", "get_counterReset", "set_counterReset", "get_cue", "set_cue", "get_cueAfter", "set_cueAfter", "get_cueBefore", "set_cueBefore", "get_cursor", "set_cursor", "get_direction", "set_direction", "get_display", "set_display", "get_elevation", "set_elevation", "get_emptyCells", "set_emptyCells", "get_cssFloat", "set_cssFloat", "get_font", "set_font", "get_fontFamily", "set_fontFamily", "get_fontSize", "set_fontSize", "get_fontSizeAdjust", "set_fontSizeAdjust", "get_fontStretch", "set_fontStretch", "get_fontStyle", "set_fontStyle", "get_fontVariant", "set_fontVariant", "get_fontWeight", "set_fontWeight", "get_height", "set_height", "get_left", "set_left", "get_letterSpacing", "set_letterSpacing", "get_lineHeight", "set_lineHeight", "get_listStyle", "set_listStyle", "get_listStyleImage", "set_listStyleImage", "get_listStylePosition", "set_listStylePosition", "get_listStyleType", "set_listStyleType", "get_margin", "set_margin", "get_marginTop", "set_marginTop", "get_marginRight", "set_marginRight", "get_marginBottom", "set_marginBottom", "get_marginLeft", "set_marginLeft", "get_markerOffset", "set_markerOffset", "get_marks", "set_marks", "get_maxHeight", "set_maxHeight", "get_maxWidth", "set_maxWidth", "get_minHeight", "set_minHeight", "get_minWidth", "set_minWidth", "get_orphans", "set_orphans", "get_outline", "set_outline", "get_outlineColor", "set_outlineColor", "get_outlineStyle", "set_outlineStyle", "get_outlineWidth", "set_outlineWidth", "get_overflow", "set_overflow", "get_padding", "set_padding", "get_paddingTop", "set_paddingTop", "get_paddingRight", "set_paddingRight", "get_paddingBottom", "set_paddingBottom", "get_paddingLeft", "set_paddingLeft", "get_page", "set_page", "get_pageBreakAfter", "set_pageBreakAfter", "get_pageBreakBefore", "set_pageBreakBefore", "get_pageBreakInside", "set_pageBreakInside", "get_pause", "set_pause", "get_pauseAfter", "set_pauseAfter", "get_pauseBefore", "set_pauseBefore", "get_pitch", "set_pitch", "get_pitchRange", "set_pitchRange", "get_playDuring", "set_playDuring", "get_position", "set_position", "get_quotes", "set_quotes", "get_richness", "set_richness", "get_right", "set_right", "get_size", "set_size", "get_speak", "set_speak", "get_speakHeader", "set_speakHeader", "get_speakNumeral", "set_speakNumeral", "get_speakPunctuation", "set_speakPunctuation", "get_speechRate", "set_speechRate", "get_stress", "set_stress", "get_tableLayout", "set_tableLayout", "get_textAlign", "set_textAlign", "get_textDecoration", "set_textDecoration", "get_textIndent", "set_textIndent", "get_textShadow", "set_textShadow", "get_textTransform", "set_textTransform", "get_top", "set_top", "get_unicodeBidi", "set_unicodeBidi", "get_verticalAlign", "set_verticalAlign", "get_visibility", "set_visibility", "get_voiceFamily", "set_voiceFamily", "get_volume", "set_volume", "get_whiteSpace", "set_whiteSpace", "get_widows", "set_widows", "get_width", "set_width", "get_wordSpacing", "set_wordSpacing", "get_zIndex", "set_zIndex");

    /* JADX INFO: renamed from: x1 */
    private final String f43360x1 = "invalid arguments count.";

    @Override // com.aspose.slides.internal.p055c4.AbstractC1943dy
    /* JADX INFO: renamed from: k4 */
    public AbstractC6123ca mo10029k4(String str, AbstractC6123ca abstractC6123ca, AbstractC6123ca[] abstractC6123caArr) {
        String strMo23627x1;
        InterfaceC5790jd interfaceC5790jd = (InterfaceC5790jd) abstractC6123ca.mo24769C_();
        switch (f43359kk.m27428k4(str)) {
            case 0:
                strMo23627x1 = interfaceC5790jd.mo23627x1();
                return m10090x1(strMo23627x1);
            case 1:
                if (abstractC6123caArr.length != 1) {
                    throw new C6208y2("invalid arguments count.");
                }
                interfaceC5790jd.mo23514k4(abstractC6123caArr[0].toString());
                return m10080h4();
            case 2:
                strMo23627x1 = interfaceC5790jd.mo23517kk();
                return m10090x1(strMo23627x1);
            case 3:
                if (abstractC6123caArr.length != 1) {
                    throw new C6208y2("invalid arguments count.");
                }
                interfaceC5790jd.mo23628x1(abstractC6123caArr[0].toString());
                return m10080h4();
            case 4:
                strMo23627x1 = interfaceC5790jd.mo23589to();
                return m10090x1(strMo23627x1);
            case 5:
                if (abstractC6123caArr.length != 1) {
                    throw new C6208y2("invalid arguments count.");
                }
                interfaceC5790jd.mo23518kk(abstractC6123caArr[0].toString());
                return m10080h4();
            case 6:
                strMo23627x1 = interfaceC5790jd.mo23466du();
                return m10090x1(strMo23627x1);
            case 7:
                if (abstractC6123caArr.length != 1) {
                    throw new C6208y2("invalid arguments count.");
                }
                interfaceC5790jd.mo23590to(abstractC6123caArr[0].toString());
                return m10080h4();
            case 8:
                strMo23627x1 = interfaceC5790jd.mo23494h4();
                return m10090x1(strMo23627x1);
            case 9:
                if (abstractC6123caArr.length != 1) {
                    throw new C6208y2("invalid arguments count.");
                }
                interfaceC5790jd.mo23467du(abstractC6123caArr[0].toString());
                return m10080h4();
            case 10:
                strMo23627x1 = interfaceC5790jd.mo23533m9();
                return m10090x1(strMo23627x1);
            case 11:
                if (abstractC6123caArr.length != 1) {
                    throw new C6208y2("invalid arguments count.");
                }
                interfaceC5790jd.mo23495h4(abstractC6123caArr[0].toString());
                return m10080h4();
            case 12:
                strMo23627x1 = interfaceC5790jd.mo23470dy();
                return m10090x1(strMo23627x1);
            case 13:
                if (abstractC6123caArr.length != 1) {
                    throw new C6208y2("invalid arguments count.");
                }
                interfaceC5790jd.mo23534m9(abstractC6123caArr[0].toString());
                return m10080h4();
            case 14:
                strMo23627x1 = interfaceC5790jd.mo23448c5();
                return m10090x1(strMo23627x1);
            case 15:
                if (abstractC6123caArr.length != 1) {
                    throw new C6208y2("invalid arguments count.");
                }
                interfaceC5790jd.mo23471dy(abstractC6123caArr[0].toString());
                return m10080h4();
            case 16:
                strMo23627x1 = interfaceC5790jd.mo23508jd();
                return m10090x1(strMo23627x1);
            case 17:
                if (abstractC6123caArr.length != 1) {
                    throw new C6208y2("invalid arguments count.");
                }
                interfaceC5790jd.mo23449c5(abstractC6123caArr[0].toString());
                return m10080h4();
            case 18:
                strMo23627x1 = interfaceC5790jd.mo23454ck();
                return m10090x1(strMo23627x1);
            case 19:
                if (abstractC6123caArr.length != 1) {
                    throw new C6208y2("invalid arguments count.");
                }
                interfaceC5790jd.mo23509jd(abstractC6123caArr[0].toString());
                return m10080h4();
            case 20:
                strMo23627x1 = interfaceC5790jd.mo23484fa();
                return m10090x1(strMo23627x1);
            case 21:
                if (abstractC6123caArr.length != 1) {
                    throw new C6208y2("invalid arguments count.");
                }
                interfaceC5790jd.mo23455ck(abstractC6123caArr[0].toString());
                return m10080h4();
            case 22:
                strMo23627x1 = interfaceC5790jd.mo23603up();
                return m10090x1(strMo23627x1);
            case 23:
                if (abstractC6123caArr.length != 1) {
                    throw new C6208y2("invalid arguments count.");
                }
                interfaceC5790jd.mo23485fa(abstractC6123caArr[0].toString());
                return m10080h4();
            case 24:
                strMo23627x1 = interfaceC5790jd.mo23651yj();
                return m10090x1(strMo23627x1);
            case 25:
                if (abstractC6123caArr.length != 1) {
                    throw new C6208y2("invalid arguments count.");
                }
                interfaceC5790jd.mo23604up(abstractC6123caArr[0].toString());
                return m10080h4();
            case 26:
                strMo23627x1 = interfaceC5790jd.mo23521ks();
                return m10090x1(strMo23627x1);
            case 27:
                if (abstractC6123caArr.length != 1) {
                    throw new C6208y2("invalid arguments count.");
                }
                interfaceC5790jd.mo23652yj(abstractC6123caArr[0].toString());
                return m10080h4();
            case 28:
                strMo23627x1 = interfaceC5790jd.mo23575rv();
                return m10090x1(strMo23627x1);
            case 29:
                if (abstractC6123caArr.length != 1) {
                    throw new C6208y2("invalid arguments count.");
                }
                interfaceC5790jd.mo23522ks(abstractC6123caArr[0].toString());
                return m10080h4();
            case 30:
                strMo23627x1 = interfaceC5790jd.mo23633x6();
                return m10090x1(strMo23627x1);
            case 31:
                if (abstractC6123caArr.length != 1) {
                    throw new C6208y2("invalid arguments count.");
                }
                interfaceC5790jd.mo23576rv(abstractC6123caArr[0].toString());
                return m10080h4();
            case 32:
                strMo23627x1 = interfaceC5790jd.mo23541ne();
                return m10090x1(strMo23627x1);
            case 33:
                if (abstractC6123caArr.length != 1) {
                    throw new C6208y2("invalid arguments count.");
                }
                interfaceC5790jd.mo23634x6(abstractC6123caArr[0].toString());
                return m10080h4();
            case 34:
                strMo23627x1 = interfaceC5790jd.mo23502ix();
                return m10090x1(strMo23627x1);
            case 35:
                if (abstractC6123caArr.length != 1) {
                    throw new C6208y2("invalid arguments count.");
                }
                interfaceC5790jd.mo23542ne(abstractC6123caArr[0].toString());
                return m10080h4();
            case 36:
                strMo23627x1 = interfaceC5790jd.mo23597u4();
                return m10090x1(strMo23627x1);
            case 37:
                if (abstractC6123caArr.length != 1) {
                    throw new C6208y2("invalid arguments count.");
                }
                interfaceC5790jd.mo23503ix(abstractC6123caArr[0].toString());
                return m10080h4();
            case 38:
                strMo23627x1 = interfaceC5790jd.mo23605uz();
                return m10090x1(strMo23627x1);
            case 39:
                if (abstractC6123caArr.length != 1) {
                    throw new C6208y2("invalid arguments count.");
                }
                interfaceC5790jd.mo23598u4(abstractC6123caArr[0].toString());
                return m10080h4();
            case 40:
                strMo23627x1 = interfaceC5790jd.mo23619wl();
                return m10090x1(strMo23627x1);
            case 41:
                if (abstractC6123caArr.length != 1) {
                    throw new C6208y2("invalid arguments count.");
                }
                interfaceC5790jd.mo23606uz(abstractC6123caArr[0].toString());
                return m10080h4();
            case 42:
                strMo23627x1 = interfaceC5790jd.mo23565qq();
                return m10090x1(strMo23627x1);
            case 43:
                if (abstractC6123caArr.length != 1) {
                    throw new C6208y2("invalid arguments count.");
                }
                interfaceC5790jd.mo23620wl(abstractC6123caArr[0].toString());
                return m10080h4();
            case 44:
                strMo23627x1 = interfaceC5790jd.mo23426ar();
                return m10090x1(strMo23627x1);
            case 45:
                if (abstractC6123caArr.length != 1) {
                    throw new C6208y2("invalid arguments count.");
                }
                interfaceC5790jd.mo23566qq(abstractC6123caArr[0].toString());
                return m10080h4();
            case 46:
                strMo23627x1 = interfaceC5790jd.mo23601um();
                return m10090x1(strMo23627x1);
            case 47:
                if (abstractC6123caArr.length != 1) {
                    throw new C6208y2("invalid arguments count.");
                }
                interfaceC5790jd.mo23427ar(abstractC6123caArr[0].toString());
                return m10080h4();
            case 48:
                strMo23627x1 = interfaceC5790jd.mo23442bv();
                return m10090x1(strMo23627x1);
            case 49:
                if (abstractC6123caArr.length != 1) {
                    throw new C6208y2("invalid arguments count.");
                }
                interfaceC5790jd.mo23602um(abstractC6123caArr[0].toString());
                return m10080h4();
            case 50:
                strMo23627x1 = interfaceC5790jd.mo23607v4();
                return m10090x1(strMo23627x1);
            case 51:
                if (abstractC6123caArr.length != 1) {
                    throw new C6208y2("invalid arguments count.");
                }
                interfaceC5790jd.mo23443bv(abstractC6123caArr[0].toString());
                return m10080h4();
            case 52:
                strMo23627x1 = interfaceC5790jd.mo23525lr();
                return m10090x1(strMo23627x1);
            case 53:
                if (abstractC6123caArr.length != 1) {
                    throw new C6208y2("invalid arguments count.");
                }
                interfaceC5790jd.mo23608v4(abstractC6123caArr[0].toString());
                return m10080h4();
            case 54:
                strMo23627x1 = interfaceC5790jd.mo23647yd();
                return m10090x1(strMo23627x1);
            case 55:
                if (abstractC6123caArr.length != 1) {
                    throw new C6208y2("invalid arguments count.");
                }
                interfaceC5790jd.mo23526lr(abstractC6123caArr[0].toString());
                return m10080h4();
            case 56:
                strMo23627x1 = interfaceC5790jd.mo23432b3();
                return m10090x1(strMo23627x1);
            case 57:
                if (abstractC6123caArr.length != 1) {
                    throw new C6208y2("invalid arguments count.");
                }
                interfaceC5790jd.mo23648yd(abstractC6123caArr[0].toString());
                return m10080h4();
            case 58:
                strMo23627x1 = interfaceC5790jd.mo23623wy();
                return m10090x1(strMo23627x1);
            case 59:
                if (abstractC6123caArr.length != 1) {
                    throw new C6208y2("invalid arguments count.");
                }
                interfaceC5790jd.mo23433b3(abstractC6123caArr[0].toString());
                return m10080h4();
            case 60:
                strMo23627x1 = interfaceC5790jd.mo23424ak();
                return m10090x1(strMo23627x1);
            case 61:
                if (abstractC6123caArr.length != 1) {
                    throw new C6208y2("invalid arguments count.");
                }
                interfaceC5790jd.mo23624wy(abstractC6123caArr[0].toString());
                return m10080h4();
            case 62:
                strMo23627x1 = interfaceC5790jd.mo23464dq();
                return m10090x1(strMo23627x1);
            case 63:
                if (abstractC6123caArr.length != 1) {
                    throw new C6208y2("invalid arguments count.");
                }
                interfaceC5790jd.mo23425ak(abstractC6123caArr[0].toString());
                return m10080h4();
            case 64:
                strMo23627x1 = interfaceC5790jd.mo23637xk();
                return m10090x1(strMo23627x1);
            case 65:
                if (abstractC6123caArr.length != 1) {
                    throw new C6208y2("invalid arguments count.");
                }
                interfaceC5790jd.mo23465dq(abstractC6123caArr[0].toString());
                return m10080h4();
            case 66:
                strMo23627x1 = interfaceC5790jd.mo23450c6();
                return m10090x1(strMo23627x1);
            case 67:
                if (abstractC6123caArr.length != 1) {
                    throw new C6208y2("invalid arguments count.");
                }
                interfaceC5790jd.mo23638xk(abstractC6123caArr[0].toString());
                return m10080h4();
            case 68:
                strMo23627x1 = interfaceC5790jd.mo23593ts();
                return m10090x1(strMo23627x1);
            case 69:
                if (abstractC6123caArr.length != 1) {
                    throw new C6208y2("invalid arguments count.");
                }
                interfaceC5790jd.mo23451c6(abstractC6123caArr[0].toString());
                return m10080h4();
            case 70:
                strMo23627x1 = interfaceC5790jd.mo23472e0();
                return m10090x1(strMo23627x1);
            case 71:
                if (abstractC6123caArr.length != 1) {
                    throw new C6208y2("invalid arguments count.");
                }
                interfaceC5790jd.mo23594ts(abstractC6123caArr[0].toString());
                return m10080h4();
            case 72:
                strMo23627x1 = interfaceC5790jd.mo23444bz();
                return m10090x1(strMo23627x1);
            case 73:
                if (abstractC6123caArr.length != 1) {
                    throw new C6208y2("invalid arguments count.");
                }
                interfaceC5790jd.mo23473e0(abstractC6123caArr[0].toString());
                return m10080h4();
            case 74:
                strMo23627x1 = interfaceC5790jd.mo23561qm();
                return m10090x1(strMo23627x1);
            case 75:
                if (abstractC6123caArr.length != 1) {
                    throw new C6208y2("invalid arguments count.");
                }
                interfaceC5790jd.mo23445bz(abstractC6123caArr[0].toString());
                return m10080h4();
            case 76:
                strMo23627x1 = interfaceC5790jd.mo23486g8();
                return m10090x1(strMo23627x1);
            case 77:
                if (abstractC6123caArr.length != 1) {
                    throw new C6208y2("invalid arguments count.");
                }
                interfaceC5790jd.mo23562qm(abstractC6123caArr[0].toString());
                return m10080h4();
            case 78:
                strMo23627x1 = interfaceC5790jd.mo23583sv();
                return m10090x1(strMo23627x1);
            case 79:
                if (abstractC6123caArr.length != 1) {
                    throw new C6208y2("invalid arguments count.");
                }
                interfaceC5790jd.mo23487g8(abstractC6123caArr[0].toString());
                return m10080h4();
            case 80:
                strMo23627x1 = interfaceC5790jd.mo23621wp();
                return m10090x1(strMo23627x1);
            case 81:
                if (abstractC6123caArr.length != 1) {
                    throw new C6208y2("invalid arguments count.");
                }
                interfaceC5790jd.mo23584sv(abstractC6123caArr[0].toString());
                return m10080h4();
            case 82:
                strMo23627x1 = interfaceC5790jd.mo23581ss();
                return m10090x1(strMo23627x1);
            case 83:
                if (abstractC6123caArr.length != 1) {
                    throw new C6208y2("invalid arguments count.");
                }
                interfaceC5790jd.mo23622wp(abstractC6123caArr[0].toString());
                return m10080h4();
            case 84:
                strMo23627x1 = interfaceC5790jd.mo23519kp();
                return m10090x1(strMo23627x1);
            case 85:
                if (abstractC6123caArr.length != 1) {
                    throw new C6208y2("invalid arguments count.");
                }
                interfaceC5790jd.mo23582ss(abstractC6123caArr[0].toString());
                return m10080h4();
            case 86:
                strMo23627x1 = interfaceC5790jd.mo23490gi();
                return m10090x1(strMo23627x1);
            case 87:
                if (abstractC6123caArr.length != 1) {
                    throw new C6208y2("invalid arguments count.");
                }
                interfaceC5790jd.mo23520kp(abstractC6123caArr[0].toString());
                return m10080h4();
            case 88:
                strMo23627x1 = interfaceC5790jd.mo23577s7();
                return m10090x1(strMo23627x1);
            case 89:
                if (abstractC6123caArr.length != 1) {
                    throw new C6208y2("invalid arguments count.");
                }
                interfaceC5790jd.mo23491gi(abstractC6123caArr[0].toString());
                return m10080h4();
            case 90:
                strMo23627x1 = interfaceC5790jd.mo23482f9();
                return m10090x1(strMo23627x1);
            case 91:
                if (abstractC6123caArr.length != 1) {
                    throw new C6208y2("invalid arguments count.");
                }
                interfaceC5790jd.mo23578s7(abstractC6123caArr[0].toString());
                return m10080h4();
            case 92:
                strMo23627x1 = interfaceC5790jd.mo23585t6();
                return m10090x1(strMo23627x1);
            case 93:
                if (abstractC6123caArr.length != 1) {
                    throw new C6208y2("invalid arguments count.");
                }
                interfaceC5790jd.mo23483f9(abstractC6123caArr[0].toString());
                return m10080h4();
            case 94:
                strMo23627x1 = interfaceC5790jd.mo23639xw();
                return m10090x1(strMo23627x1);
            case 95:
                if (abstractC6123caArr.length != 1) {
                    throw new C6208y2("invalid arguments count.");
                }
                interfaceC5790jd.mo23586t6(abstractC6123caArr[0].toString());
                return m10080h4();
            case 96:
                strMo23627x1 = interfaceC5790jd.mo23611vj();
                return m10090x1(strMo23627x1);
            case 97:
                if (abstractC6123caArr.length != 1) {
                    throw new C6208y2("invalid arguments count.");
                }
                interfaceC5790jd.mo23640xw(abstractC6123caArr[0].toString());
                return m10080h4();
            case 98:
                strMo23627x1 = interfaceC5790jd.mo23609vh();
                return m10090x1(strMo23627x1);
            case 99:
                if (abstractC6123caArr.length != 1) {
                    throw new C6208y2("invalid arguments count.");
                }
                interfaceC5790jd.mo23612vj(abstractC6123caArr[0].toString());
                return m10080h4();
            case 100:
                strMo23627x1 = interfaceC5790jd.mo23567qw();
                return m10090x1(strMo23627x1);
            case 101:
                if (abstractC6123caArr.length != 1) {
                    throw new C6208y2("invalid arguments count.");
                }
                interfaceC5790jd.mo23610vh(abstractC6123caArr[0].toString());
                return m10080h4();
            case 102:
                strMo23627x1 = interfaceC5790jd.mo23591tq();
                return m10090x1(strMo23627x1);
            case 103:
                if (abstractC6123caArr.length != 1) {
                    throw new C6208y2("invalid arguments count.");
                }
                interfaceC5790jd.mo23568qw(abstractC6123caArr[0].toString());
                return m10080h4();
            case 104:
                strMo23627x1 = interfaceC5790jd.mo23504j2();
                return m10090x1(strMo23627x1);
            case 105:
                if (abstractC6123caArr.length != 1) {
                    throw new C6208y2("invalid arguments count.");
                }
                interfaceC5790jd.mo23592tq(abstractC6123caArr[0].toString());
                return m10080h4();
            case 106:
                strMo23627x1 = interfaceC5790jd.mo23617w6();
                return m10090x1(strMo23627x1);
            case 107:
                if (abstractC6123caArr.length != 1) {
                    throw new C6208y2("invalid arguments count.");
                }
                interfaceC5790jd.mo23505j2(abstractC6123caArr[0].toString());
                return m10080h4();
            case 108:
                strMo23627x1 = interfaceC5790jd.mo23551os();
                return m10090x1(strMo23627x1);
            case 109:
                if (abstractC6123caArr.length != 1) {
                    throw new C6208y2("invalid arguments count.");
                }
                interfaceC5790jd.mo23618w6(abstractC6123caArr[0].toString());
                return m10080h4();
            case 110:
                strMo23627x1 = interfaceC5790jd.mo23476em();
                return m10090x1(strMo23627x1);
            case 111:
                if (abstractC6123caArr.length != 1) {
                    throw new C6208y2("invalid arguments count.");
                }
                interfaceC5790jd.mo23552os(abstractC6123caArr[0].toString());
                return m10080h4();
            case 112:
                strMo23627x1 = interfaceC5790jd.mo23660zj();
                return m10090x1(strMo23627x1);
            case 113:
                if (abstractC6123caArr.length != 1) {
                    throw new C6208y2("invalid arguments count.");
                }
                interfaceC5790jd.mo23477em(abstractC6123caArr[0].toString());
                return m10080h4();
            case 114:
                strMo23627x1 = interfaceC5790jd.mo23422ai();
                return m10090x1(strMo23627x1);
            case 115:
                if (abstractC6123caArr.length != 1) {
                    throw new C6208y2("invalid arguments count.");
                }
                interfaceC5790jd.mo23661zj(abstractC6123caArr[0].toString());
                return m10080h4();
            case 116:
                strMo23627x1 = interfaceC5790jd.mo23571ri();
                return m10090x1(strMo23627x1);
            case 117:
                if (abstractC6123caArr.length != 1) {
                    throw new C6208y2("invalid arguments count.");
                }
                interfaceC5790jd.mo23423ai(abstractC6123caArr[0].toString());
                return m10080h4();
            case 118:
                strMo23627x1 = interfaceC5790jd.mo23452ca();
                return m10090x1(strMo23627x1);
            case 119:
                if (abstractC6123caArr.length != 1) {
                    throw new C6208y2("invalid arguments count.");
                }
                interfaceC5790jd.mo23572ri(abstractC6123caArr[0].toString());
                return m10080h4();
            case 120:
                strMo23627x1 = interfaceC5790jd.mo23438bs();
                return m10090x1(strMo23627x1);
            case 121:
                if (abstractC6123caArr.length != 1) {
                    throw new C6208y2("invalid arguments count.");
                }
                interfaceC5790jd.mo23453ca(abstractC6123caArr[0].toString());
                return m10080h4();
            case 122:
                strMo23627x1 = interfaceC5790jd.mo23496he();
                return m10090x1(strMo23627x1);
            case 123:
                if (abstractC6123caArr.length != 1) {
                    throw new C6208y2("invalid arguments count.");
                }
                interfaceC5790jd.mo23439bs(abstractC6123caArr[0].toString());
                return m10080h4();
            case 124:
                strMo23627x1 = interfaceC5790jd.mo23512jw();
                return m10090x1(strMo23627x1);
            case 125:
                if (abstractC6123caArr.length != 1) {
                    throw new C6208y2("invalid arguments count.");
                }
                interfaceC5790jd.mo23497he(abstractC6123caArr[0].toString());
                return m10080h4();
            case 126:
                strMo23627x1 = interfaceC5790jd.mo23641y2();
                return m10090x1(strMo23627x1);
            case 127:
                if (abstractC6123caArr.length != 1) {
                    throw new C6208y2("invalid arguments count.");
                }
                interfaceC5790jd.mo23513jw(abstractC6123caArr[0].toString());
                return m10080h4();
            case 128:
                strMo23627x1 = interfaceC5790jd.mo23531m4();
                return m10090x1(strMo23627x1);
            case 129:
                if (abstractC6123caArr.length != 1) {
                    throw new C6208y2("invalid arguments count.");
                }
                interfaceC5790jd.mo23642y2(abstractC6123caArr[0].toString());
                return m10080h4();
            case 130:
                strMo23627x1 = interfaceC5790jd.mo23529m2();
                return m10090x1(strMo23627x1);
            case 131:
                if (abstractC6123caArr.length != 1) {
                    throw new C6208y2("invalid arguments count.");
                }
                interfaceC5790jd.mo23532m4(abstractC6123caArr[0].toString());
                return m10080h4();
            case 132:
                strMo23627x1 = interfaceC5790jd.mo23506j5();
                return m10090x1(strMo23627x1);
            case 133:
                if (abstractC6123caArr.length != 1) {
                    throw new C6208y2("invalid arguments count.");
                }
                interfaceC5790jd.mo23530m2(abstractC6123caArr[0].toString());
                return m10080h4();
            case 134:
                strMo23627x1 = interfaceC5790jd.mo23547nv();
                return m10090x1(strMo23627x1);
            case 135:
                if (abstractC6123caArr.length != 1) {
                    throw new C6208y2("invalid arguments count.");
                }
                interfaceC5790jd.mo23507j5(abstractC6123caArr[0].toString());
                return m10080h4();
            case 136:
                strMo23627x1 = interfaceC5790jd.mo23645y9();
                return m10090x1(strMo23627x1);
            case 137:
                if (abstractC6123caArr.length != 1) {
                    throw new C6208y2("invalid arguments count.");
                }
                interfaceC5790jd.mo23548nv(abstractC6123caArr[0].toString());
                return m10080h4();
            case 138:
                strMo23627x1 = interfaceC5790jd.mo23488gf();
                return m10090x1(strMo23627x1);
            case 139:
                if (abstractC6123caArr.length != 1) {
                    throw new C6208y2("invalid arguments count.");
                }
                interfaceC5790jd.mo23646y9(abstractC6123caArr[0].toString());
                return m10080h4();
            case 140:
                strMo23627x1 = interfaceC5790jd.mo23498ig();
                return m10090x1(strMo23627x1);
            case 141:
                if (abstractC6123caArr.length != 1) {
                    throw new C6208y2("invalid arguments count.");
                }
                interfaceC5790jd.mo23489gf(abstractC6123caArr[0].toString());
                return m10080h4();
            case 142:
                strMo23627x1 = interfaceC5790jd.mo23492gk();
                return m10090x1(strMo23627x1);
            case 143:
                if (abstractC6123caArr.length != 1) {
                    throw new C6208y2("invalid arguments count.");
                }
                interfaceC5790jd.mo23499ig(abstractC6123caArr[0].toString());
                return m10080h4();
            case 144:
                strMo23627x1 = interfaceC5790jd.mo23631x5();
                return m10090x1(strMo23627x1);
            case 145:
                if (abstractC6123caArr.length != 1) {
                    throw new C6208y2("invalid arguments count.");
                }
                interfaceC5790jd.mo23493gk(abstractC6123caArr[0].toString());
                return m10080h4();
            case 146:
                strMo23627x1 = interfaceC5790jd.mo23655yo();
                return m10090x1(strMo23627x1);
            case 147:
                if (abstractC6123caArr.length != 1) {
                    throw new C6208y2("invalid arguments count.");
                }
                interfaceC5790jd.mo23632x5(abstractC6123caArr[0].toString());
                return m10080h4();
            case 148:
                strMo23627x1 = interfaceC5790jd.mo23539na();
                return m10090x1(strMo23627x1);
            case 149:
                if (abstractC6123caArr.length != 1) {
                    throw new C6208y2("invalid arguments count.");
                }
                interfaceC5790jd.mo23656yo(abstractC6123caArr[0].toString());
                return m10080h4();
            case 150:
                strMo23627x1 = interfaceC5790jd.mo23625wz();
                return m10090x1(strMo23627x1);
            case 151:
                if (abstractC6123caArr.length != 1) {
                    throw new C6208y2("invalid arguments count.");
                }
                interfaceC5790jd.mo23540na(abstractC6123caArr[0].toString());
                return m10080h4();
            case 152:
                strMo23627x1 = interfaceC5790jd.mo23595u1();
                return m10090x1(strMo23627x1);
            case 153:
                if (abstractC6123caArr.length != 1) {
                    throw new C6208y2("invalid arguments count.");
                }
                interfaceC5790jd.mo23626wz(abstractC6123caArr[0].toString());
                return m10080h4();
            case 154:
                strMo23627x1 = interfaceC5790jd.mo23653yn();
                return m10090x1(strMo23627x1);
            case 155:
                if (abstractC6123caArr.length != 1) {
                    throw new C6208y2("invalid arguments count.");
                }
                interfaceC5790jd.mo23596u1(abstractC6123caArr[0].toString());
                return m10080h4();
            case 156:
                strMo23627x1 = interfaceC5790jd.mo23649yg();
                return m10090x1(strMo23627x1);
            case 157:
                if (abstractC6123caArr.length != 1) {
                    throw new C6208y2("invalid arguments count.");
                }
                interfaceC5790jd.mo23654yn(abstractC6123caArr[0].toString());
                return m10080h4();
            case 158:
                strMo23627x1 = interfaceC5790jd.mo23535my();
                return m10090x1(strMo23627x1);
            case 159:
                if (abstractC6123caArr.length != 1) {
                    throw new C6208y2("invalid arguments count.");
                }
                interfaceC5790jd.mo23650yg(abstractC6123caArr[0].toString());
                return m10080h4();
            case 160:
                strMo23627x1 = interfaceC5790jd.mo23430b1();
                return m10090x1(strMo23627x1);
            case 161:
                if (abstractC6123caArr.length != 1) {
                    throw new C6208y2("invalid arguments count.");
                }
                interfaceC5790jd.mo23536my(abstractC6123caArr[0].toString());
                return m10080h4();
            case 162:
                strMo23627x1 = interfaceC5790jd.mo23657yw();
                return m10090x1(strMo23627x1);
            case 163:
                if (abstractC6123caArr.length != 1) {
                    throw new C6208y2("invalid arguments count.");
                }
                interfaceC5790jd.mo23431b1(abstractC6123caArr[0].toString());
                return m10080h4();
            case 164:
                strMo23627x1 = interfaceC5790jd.mo23662zm();
                return m10090x1(strMo23627x1);
            case 165:
                if (abstractC6123caArr.length != 1) {
                    throw new C6208y2("invalid arguments count.");
                }
                interfaceC5790jd.mo23658yw(abstractC6123caArr[0].toString());
                return m10080h4();
            case 166:
                strMo23627x1 = interfaceC5790jd.mo23500ii();
                return m10090x1(strMo23627x1);
            case 167:
                if (abstractC6123caArr.length != 1) {
                    throw new C6208y2("invalid arguments count.");
                }
                interfaceC5790jd.mo23663zm(abstractC6123caArr[0].toString());
                return m10080h4();
            case 168:
                strMo23627x1 = interfaceC5790jd.mo23460dc();
                return m10090x1(strMo23627x1);
            case 169:
                if (abstractC6123caArr.length != 1) {
                    throw new C6208y2("invalid arguments count.");
                }
                interfaceC5790jd.mo23501ii(abstractC6123caArr[0].toString());
                return m10080h4();
            case 170:
                strMo23627x1 = interfaceC5790jd.mo23458d4();
                return m10090x1(strMo23627x1);
            case 171:
                if (abstractC6123caArr.length != 1) {
                    throw new C6208y2("invalid arguments count.");
                }
                interfaceC5790jd.mo23461dc(abstractC6123caArr[0].toString());
                return m10080h4();
            case 172:
                strMo23627x1 = interfaceC5790jd.mo23643y4();
                return m10090x1(strMo23627x1);
            case 173:
                if (abstractC6123caArr.length != 1) {
                    throw new C6208y2("invalid arguments count.");
                }
                interfaceC5790jd.mo23459d4(abstractC6123caArr[0].toString());
                return m10080h4();
            case 174:
                strMo23627x1 = interfaceC5790jd.mo23615vw();
                return m10090x1(strMo23627x1);
            case 175:
                if (abstractC6123caArr.length != 1) {
                    throw new C6208y2("invalid arguments count.");
                }
                interfaceC5790jd.mo23644y4(abstractC6123caArr[0].toString());
                return m10080h4();
            case 176:
                strMo23627x1 = interfaceC5790jd.mo23613vt();
                return m10090x1(strMo23627x1);
            case 177:
                if (abstractC6123caArr.length != 1) {
                    throw new C6208y2("invalid arguments count.");
                }
                interfaceC5790jd.mo23616vw(abstractC6123caArr[0].toString());
                return m10080h4();
            case 178:
                strMo23627x1 = interfaceC5790jd.mo23563qn();
                return m10090x1(strMo23627x1);
            case 179:
                if (abstractC6123caArr.length != 1) {
                    throw new C6208y2("invalid arguments count.");
                }
                interfaceC5790jd.mo23614vt(abstractC6123caArr[0].toString());
                return m10080h4();
            case 180:
                strMo23627x1 = interfaceC5790jd.mo23559qk();
                return m10090x1(strMo23627x1);
            case 181:
                if (abstractC6123caArr.length != 1) {
                    throw new C6208y2("invalid arguments count.");
                }
                interfaceC5790jd.mo23564qn(abstractC6123caArr[0].toString());
                return m10080h4();
            case 182:
                strMo23627x1 = interfaceC5790jd.mo23573rq();
                return m10090x1(strMo23627x1);
            case 183:
                if (abstractC6123caArr.length != 1) {
                    throw new C6208y2("invalid arguments count.");
                }
                interfaceC5790jd.mo23560qk(abstractC6123caArr[0].toString());
                return m10080h4();
            case 184:
                strMo23627x1 = interfaceC5790jd.mo23420af();
                return m10090x1(strMo23627x1);
            case 185:
                if (abstractC6123caArr.length != 1) {
                    throw new C6208y2("invalid arguments count.");
                }
                interfaceC5790jd.mo23574rq(abstractC6123caArr[0].toString());
                return m10080h4();
            case 186:
                strMo23627x1 = interfaceC5790jd.mo23629x3();
                return m10090x1(strMo23627x1);
            case 187:
                if (abstractC6123caArr.length != 1) {
                    throw new C6208y2("invalid arguments count.");
                }
                interfaceC5790jd.mo23421af(abstractC6123caArr[0].toString());
                return m10080h4();
            case 188:
                strMo23627x1 = interfaceC5790jd.mo23579sq();
                return m10090x1(strMo23627x1);
            case 189:
                if (abstractC6123caArr.length != 1) {
                    throw new C6208y2("invalid arguments count.");
                }
                interfaceC5790jd.mo23630x3(abstractC6123caArr[0].toString());
                return m10080h4();
            case 190:
                strMo23627x1 = interfaceC5790jd.mo23599u5();
                return m10090x1(strMo23627x1);
            case 191:
                if (abstractC6123caArr.length != 1) {
                    throw new C6208y2("invalid arguments count.");
                }
                interfaceC5790jd.mo23580sq(abstractC6123caArr[0].toString());
                return m10080h4();
            case 192:
                strMo23627x1 = interfaceC5790jd.mo23523lm();
                return m10090x1(strMo23627x1);
            case 193:
                if (abstractC6123caArr.length != 1) {
                    throw new C6208y2("invalid arguments count.");
                }
                interfaceC5790jd.mo23600u5(abstractC6123caArr[0].toString());
                return m10080h4();
            case 194:
                strMo23627x1 = interfaceC5790jd.mo23446c4();
                return m10090x1(strMo23627x1);
            case 195:
                if (abstractC6123caArr.length != 1) {
                    throw new C6208y2("invalid arguments count.");
                }
                interfaceC5790jd.mo23524lm(abstractC6123caArr[0].toString());
                return m10080h4();
            case 196:
                strMo23627x1 = interfaceC5790jd.mo23510jf();
                return m10090x1(strMo23627x1);
            case 197:
                if (abstractC6123caArr.length != 1) {
                    throw new C6208y2("invalid arguments count.");
                }
                interfaceC5790jd.mo23447c4(abstractC6123caArr[0].toString());
                return m10080h4();
            case 198:
                strMo23627x1 = interfaceC5790jd.mo23428av();
                return m10090x1(strMo23627x1);
            case 199:
                if (abstractC6123caArr.length != 1) {
                    throw new C6208y2("invalid arguments count.");
                }
                interfaceC5790jd.mo23511jf(abstractC6123caArr[0].toString());
                return m10080h4();
            case 200:
                strMo23627x1 = interfaceC5790jd.mo23553ou();
                return m10090x1(strMo23627x1);
            case 201:
                if (abstractC6123caArr.length != 1) {
                    throw new C6208y2("invalid arguments count.");
                }
                interfaceC5790jd.mo23429av(abstractC6123caArr[0].toString());
                return m10080h4();
            case 202:
                strMo23627x1 = interfaceC5790jd.mo23635xi();
                return m10090x1(strMo23627x1);
            case 203:
                if (abstractC6123caArr.length != 1) {
                    throw new C6208y2("invalid arguments count.");
                }
                interfaceC5790jd.mo23554ou(abstractC6123caArr[0].toString());
                return m10080h4();
            case 204:
                strMo23627x1 = interfaceC5790jd.mo23440bu();
                return m10090x1(strMo23627x1);
            case 205:
                if (abstractC6123caArr.length != 1) {
                    throw new C6208y2("invalid arguments count.");
                }
                interfaceC5790jd.mo23636xi(abstractC6123caArr[0].toString());
                return m10080h4();
            case 206:
                strMo23627x1 = interfaceC5790jd.mo23543nh();
                return m10090x1(strMo23627x1);
            case 207:
                if (abstractC6123caArr.length != 1) {
                    throw new C6208y2("invalid arguments count.");
                }
                interfaceC5790jd.mo23441bu(abstractC6123caArr[0].toString());
                return m10080h4();
            case 208:
                strMo23627x1 = interfaceC5790jd.mo23549o9();
                return m10090x1(strMo23627x1);
            case 209:
                if (abstractC6123caArr.length != 1) {
                    throw new C6208y2("invalid arguments count.");
                }
                interfaceC5790jd.mo23544nh(abstractC6123caArr[0].toString());
                return m10080h4();
            case 210:
                strMo23627x1 = interfaceC5790jd.mo23462dl();
                return m10090x1(strMo23627x1);
            case 211:
                if (abstractC6123caArr.length != 1) {
                    throw new C6208y2("invalid arguments count.");
                }
                interfaceC5790jd.mo23550o9(abstractC6123caArr[0].toString());
                return m10080h4();
            case 212:
                strMo23627x1 = interfaceC5790jd.mo23480f7();
                return m10090x1(strMo23627x1);
            case 213:
                if (abstractC6123caArr.length != 1) {
                    throw new C6208y2("invalid arguments count.");
                }
                interfaceC5790jd.mo23463dl(abstractC6123caArr[0].toString());
                return m10080h4();
            case 214:
                strMo23627x1 = interfaceC5790jd.mo23527ly();
                return m10090x1(strMo23627x1);
            case 215:
                if (abstractC6123caArr.length != 1) {
                    throw new C6208y2("invalid arguments count.");
                }
                interfaceC5790jd.mo23481f7(abstractC6123caArr[0].toString());
                return m10080h4();
            case 216:
                strMo23627x1 = interfaceC5790jd.mo23557q6();
                return m10090x1(strMo23627x1);
            case 217:
                if (abstractC6123caArr.length != 1) {
                    throw new C6208y2("invalid arguments count.");
                }
                interfaceC5790jd.mo23528ly(abstractC6123caArr[0].toString());
                return m10080h4();
            case 218:
                strMo23627x1 = interfaceC5790jd.mo23468dw();
                return m10090x1(strMo23627x1);
            case 219:
                if (abstractC6123caArr.length != 1) {
                    throw new C6208y2("invalid arguments count.");
                }
                interfaceC5790jd.mo23558q6(abstractC6123caArr[0].toString());
                return m10080h4();
            case 220:
                strMo23627x1 = interfaceC5790jd.mo23587tl();
                return m10090x1(strMo23627x1);
            case 221:
                if (abstractC6123caArr.length != 1) {
                    throw new C6208y2("invalid arguments count.");
                }
                interfaceC5790jd.mo23469dw(abstractC6123caArr[0].toString());
                return m10080h4();
            case 222:
                strMo23627x1 = interfaceC5790jd.mo23555q3();
                return m10090x1(strMo23627x1);
            case 223:
                if (abstractC6123caArr.length != 1) {
                    throw new C6208y2("invalid arguments count.");
                }
                interfaceC5790jd.mo23588tl(abstractC6123caArr[0].toString());
                return m10080h4();
            case 224:
                strMo23627x1 = interfaceC5790jd.mo23474e8();
                return m10090x1(strMo23627x1);
            case 225:
                if (abstractC6123caArr.length != 1) {
                    throw new C6208y2("invalid arguments count.");
                }
                interfaceC5790jd.mo23556q3(abstractC6123caArr[0].toString());
                return m10080h4();
            case 226:
                strMo23627x1 = interfaceC5790jd.mo23436bg();
                return m10090x1(strMo23627x1);
            case 227:
                if (abstractC6123caArr.length != 1) {
                    throw new C6208y2("invalid arguments count.");
                }
                interfaceC5790jd.mo23475e8(abstractC6123caArr[0].toString());
                return m10080h4();
            case 228:
                strMo23627x1 = interfaceC5790jd.mo23515k5();
                return m10090x1(strMo23627x1);
            case 229:
                if (abstractC6123caArr.length != 1) {
                    throw new C6208y2("invalid arguments count.");
                }
                interfaceC5790jd.mo23437bg(abstractC6123caArr[0].toString());
                return m10080h4();
            case 230:
                strMo23627x1 = interfaceC5790jd.mo23456d3();
                return m10090x1(strMo23627x1);
            case 231:
                if (abstractC6123caArr.length != 1) {
                    throw new C6208y2("invalid arguments count.");
                }
                interfaceC5790jd.mo23516k5(abstractC6123caArr[0].toString());
                return m10080h4();
            case 232:
                strMo23627x1 = interfaceC5790jd.mo23478ew();
                return m10090x1(strMo23627x1);
            case 233:
                if (abstractC6123caArr.length != 1) {
                    throw new C6208y2("invalid arguments count.");
                }
                interfaceC5790jd.mo23457d3(abstractC6123caArr[0].toString());
                return m10080h4();
            case 234:
                strMo23627x1 = interfaceC5790jd.mo23434b5();
                return m10090x1(strMo23627x1);
            case 235:
                if (abstractC6123caArr.length != 1) {
                    throw new C6208y2("invalid arguments count.");
                }
                interfaceC5790jd.mo23479ew(abstractC6123caArr[0].toString());
                return m10080h4();
            case 236:
                strMo23627x1 = interfaceC5790jd.mo23569r7();
                return m10090x1(strMo23627x1);
            case 237:
                if (abstractC6123caArr.length != 1) {
                    throw new C6208y2("invalid arguments count.");
                }
                interfaceC5790jd.mo23435b5(abstractC6123caArr[0].toString());
                return m10080h4();
            case 238:
                strMo23627x1 = interfaceC5790jd.mo23545nk();
                return m10090x1(strMo23627x1);
            case 239:
                if (abstractC6123caArr.length != 1) {
                    throw new C6208y2("invalid arguments count.");
                }
                interfaceC5790jd.mo23570r7(abstractC6123caArr[0].toString());
                return m10080h4();
            case 240:
                strMo23627x1 = interfaceC5790jd.mo23537n3();
                return m10090x1(strMo23627x1);
            case 241:
                if (abstractC6123caArr.length != 1) {
                    throw new C6208y2("invalid arguments count.");
                }
                interfaceC5790jd.mo23546nk(abstractC6123caArr[0].toString());
                return m10080h4();
            case 242:
                strMo23627x1 = interfaceC5790jd.mo23659zd();
                return m10090x1(strMo23627x1);
            case 243:
                if (abstractC6123caArr.length != 1) {
                    throw new C6208y2("invalid arguments count.");
                }
                interfaceC5790jd.mo23538n3(abstractC6123caArr[0].toString());
                return m10080h4();
            default:
                throw new C6208y2("unknown function");
        }
    }

    @Override // com.aspose.slides.internal.p055c4.AbstractC1943dy
    /* JADX INFO: renamed from: kk */
    public AbstractC14068j5 mo10034kk() {
        return C7019kk.m27443k4((Class<?>) InterfaceC5810wl.class);
    }

    @Override // com.aspose.slides.internal.p055c4.AbstractC1946kk
    /* JADX INFO: renamed from: x1 */
    public void mo10027x1() {
        m10033k4("azimuth", 3);
        m10033k4("background", 3);
        m10033k4("backgroundAttachment", 3);
        m10033k4("backgroundColor", 3);
        m10033k4("backgroundImage", 3);
        m10033k4("backgroundPosition", 3);
        m10033k4("backgroundRepeat", 3);
        m10033k4("border", 3);
        m10033k4("borderCollapse", 3);
        m10033k4("borderColor", 3);
        m10033k4("borderSpacing", 3);
        m10033k4("borderStyle", 3);
        m10033k4("borderTop", 3);
        m10033k4("borderRight", 3);
        m10033k4("borderBottom", 3);
        m10033k4("borderLeft", 3);
        m10033k4("borderTopColor", 3);
        m10033k4("borderRightColor", 3);
        m10033k4("borderBottomColor", 3);
        m10033k4("borderLeftColor", 3);
        m10033k4("borderTopStyle", 3);
        m10033k4("borderRightStyle", 3);
        m10033k4("borderBottomStyle", 3);
        m10033k4("borderLeftStyle", 3);
        m10033k4("borderTopWidth", 3);
        m10033k4("borderRightWidth", 3);
        m10033k4("borderBottomWidth", 3);
        m10033k4("borderLeftWidth", 3);
        m10033k4("borderWidth", 3);
        m10033k4("bottom", 3);
        m10033k4("captionSide", 3);
        m10033k4("clear", 3);
        m10033k4("clip", 3);
        m10033k4("color", 3);
        m10033k4(FirebaseAnalytics.Param.CONTENT, 3);
        m10033k4("counterIncrement", 3);
        m10033k4("counterReset", 3);
        m10033k4("cue", 3);
        m10033k4("cueAfter", 3);
        m10033k4("cueBefore", 3);
        m10033k4("cursor", 3);
        m10033k4(HiAnalyticsConstant.HaKey.BI_KEY_DIRECTION, 3);
        m10033k4("display", 3);
        m10033k4("elevation", 3);
        m10033k4("emptyCells", 3);
        m10033k4("cssFloat", 3);
        m10033k4("font", 3);
        m10033k4("fontFamily", 3);
        m10033k4("fontSize", 3);
        m10033k4("fontSizeAdjust", 3);
        m10033k4("fontStretch", 3);
        m10033k4("fontStyle", 3);
        m10033k4("fontVariant", 3);
        m10033k4("fontWeight", 3);
        m10033k4("height", 3);
        m10033k4("left", 3);
        m10033k4("letterSpacing", 3);
        m10033k4("lineHeight", 3);
        m10033k4("listStyle", 3);
        m10033k4("listStyleImage", 3);
        m10033k4("listStylePosition", 3);
        m10033k4("listStyleType", 3);
        m10033k4("margin", 3);
        m10033k4("marginTop", 3);
        m10033k4("marginRight", 3);
        m10033k4("marginBottom", 3);
        m10033k4("marginLeft", 3);
        m10033k4("markerOffset", 3);
        m10033k4("marks", 3);
        m10033k4("maxHeight", 3);
        m10033k4("maxWidth", 3);
        m10033k4("minHeight", 3);
        m10033k4("minWidth", 3);
        m10033k4("orphans", 3);
        m10033k4("outline", 3);
        m10033k4("outlineColor", 3);
        m10033k4("outlineStyle", 3);
        m10033k4("outlineWidth", 3);
        m10033k4("overflow", 3);
        m10033k4("padding", 3);
        m10033k4("paddingTop", 3);
        m10033k4("paddingRight", 3);
        m10033k4("paddingBottom", 3);
        m10033k4("paddingLeft", 3);
        m10033k4("page", 3);
        m10033k4("pageBreakAfter", 3);
        m10033k4("pageBreakBefore", 3);
        m10033k4("pageBreakInside", 3);
        m10033k4("pause", 3);
        m10033k4("pauseAfter", 3);
        m10033k4("pauseBefore", 3);
        m10033k4("pitch", 3);
        m10033k4("pitchRange", 3);
        m10033k4("playDuring", 3);
        m10033k4(RequestParameters.POSITION, 3);
        m10033k4("quotes", 3);
        m10033k4("richness", 3);
        m10033k4("right", 3);
        m10033k4("size", 3);
        m10033k4("speak", 3);
        m10033k4("speakHeader", 3);
        m10033k4("speakNumeral", 3);
        m10033k4("speakPunctuation", 3);
        m10033k4("speechRate", 3);
        m10033k4("stress", 3);
        m10033k4("tableLayout", 3);
        m10033k4("textAlign", 3);
        m10033k4("textDecoration", 3);
        m10033k4("textIndent", 3);
        m10033k4("textShadow", 3);
        m10033k4("textTransform", 3);
        m10033k4("top", 3);
        m10033k4("unicodeBidi", 3);
        m10033k4("verticalAlign", 3);
        m10033k4("visibility", 3);
        m10033k4("voiceFamily", 3);
        m10033k4("volume", 3);
        m10033k4("whiteSpace", 3);
        m10033k4("widows", 3);
        m10033k4("width", 3);
        m10033k4("wordSpacing", 3);
        m10033k4("zIndex", 3);
    }

    @Override // com.aspose.slides.internal.p055c4.AbstractC1943dy
    /* JADX INFO: renamed from: k4 */
    public AbstractC14068j5 mo10030k4() {
        return f43358k4;
    }
}
