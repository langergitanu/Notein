package com.aspose.slides.internal.p380ri;

import androidx.core.app.FrameMetricsAggregator;
import com.aspose.slides.C22202OooO0oo;
import com.aspose.slides.C22221Oooo0O0;
import com.aspose.slides.Collections.Generic.Dictionary;
import com.aspose.slides.exceptions.ArgumentException;
import com.aspose.slides.exceptions.Exception;
import com.aspose.slides.internal.p048bv.C1864kk;
import com.aspose.slides.internal.p051bz.C1921qq;
import com.aspose.slides.internal.p294n9.C6765kp;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.internal.p475wh.C12003du;
import com.aspose.slides.internal.p523yd.C12814to;
import com.aspose.slides.p559ms.System.C14057f9;
import com.aspose.slides.p559ms.System.C14064he;
import com.aspose.slides.p559ms.System.C14098up;
import com.aspose.slides.p559ms.System.C14113y2;
import com.aspose.words.StyleIdentifier;

/* JADX INFO: renamed from: com.aspose.slides.internal.ri.kk */
/* JADX INFO: loaded from: classes4.dex */
public class C10015kk {

    /* JADX INFO: renamed from: k4 */
    private static final Dictionary<String, C12003du> f36025k4;

    static {
        Dictionary<String, C12003du> dictionary = new Dictionary<>();
        f36025k4 = dictionary;
        dictionary.addItem("aliceblue", m49152k4(240, StyleIdentifier.LIGHT_GRID_ACCENT_6, 255).Clone());
        dictionary.addItem("antiquewhite", m49152k4(250, 235, 215).Clone());
        dictionary.addItem("aqua", m49152k4(0, 255, 255).Clone());
        dictionary.addItem("aquamarine", m49152k4(127, 255, 212).Clone());
        dictionary.addItem("azure", m49152k4(240, 255, 255).Clone());
        dictionary.addItem("beige", m49152k4(245, 245, 220).Clone());
        dictionary.addItem("bisque", m49152k4(255, 228, 196).Clone());
        dictionary.addItem("black", m49152k4(0, 0, 0).Clone());
        dictionary.addItem("blanchedalmond", m49152k4(255, 235, 205).Clone());
        dictionary.addItem("blue", m49152k4(0, 0, 255).Clone());
        dictionary.addItem("blueviolet", m49152k4(138, 43, 226).Clone());
        dictionary.addItem("brown", m49152k4(165, 42, 42).Clone());
        dictionary.addItem("burlywood", m49152k4(222, 184, 135).Clone());
        dictionary.addItem("cadetblue", m49152k4(95, 158, 160).Clone());
        dictionary.addItem("chartreuse", m49152k4(127, 255, 0).Clone());
        dictionary.addItem("chocolate", m49152k4(210, 105, 30).Clone());
        dictionary.addItem("coral", m49152k4(255, 127, 80).Clone());
        dictionary.addItem("cornflowerblue", m49152k4(100, 149, 237).Clone());
        dictionary.addItem("cornsilk", m49152k4(255, StyleIdentifier.LIGHT_GRID_ACCENT_6, 220).Clone());
        dictionary.addItem("crimson", m49152k4(220, 20, 60).Clone());
        dictionary.addItem("cyan", m49152k4(0, 255, 255).Clone());
        dictionary.addItem("darkblue", m49152k4(0, 0, 139).Clone());
        dictionary.addItem("darkcyan", m49152k4(0, 139, 139).Clone());
        dictionary.addItem("darkgoldenrod", m49152k4(184, 134, 11).Clone());
        dictionary.addItem("darkgray", m49152k4(169, 169, 169).Clone());
        dictionary.addItem("darkgreen", m49152k4(0, 100, 0).Clone());
        dictionary.addItem("darkgrey", m49152k4(169, 169, 169).Clone());
        dictionary.addItem("darkkhaki", m49152k4(189, 183, 107).Clone());
        dictionary.addItem("darkmagenta", m49152k4(139, 0, 139).Clone());
        dictionary.addItem("darkolivegreen", m49152k4(85, 107, 47).Clone());
        dictionary.addItem("darkorange", m49152k4(255, 140, 0).Clone());
        dictionary.addItem("darkorchid", m49152k4(153, 50, 204).Clone());
        dictionary.addItem("darkred", m49152k4(139, 0, 0).Clone());
        dictionary.addItem("darksalmon", m49152k4(233, 150, 122).Clone());
        dictionary.addItem("darkseagreen", m49152k4(143, 188, 143).Clone());
        dictionary.addItem("darkslateblue", m49152k4(72, 61, 139).Clone());
        dictionary.addItem("darkslategray", m49152k4(47, 79, 79).Clone());
        dictionary.addItem("darkslategrey", m49152k4(47, 79, 79).Clone());
        dictionary.addItem("darkturquoise", m49152k4(0, 206, 209).Clone());
        dictionary.addItem("darkviolet", m49152k4(148, 0, 211).Clone());
        dictionary.addItem("deeppink", m49152k4(255, 20, 147).Clone());
        dictionary.addItem("deepskyblue", m49152k4(0, 191, 255).Clone());
        dictionary.addItem("dimgray", m49152k4(105, 105, 105).Clone());
        dictionary.addItem("dimgrey", m49152k4(105, 105, 105).Clone());
        dictionary.addItem("dodgerblue", m49152k4(30, 144, 255).Clone());
        dictionary.addItem("firebrick", m49152k4(178, 34, 34).Clone());
        dictionary.addItem("floralwhite", m49152k4(255, 250, 240).Clone());
        dictionary.addItem("forestgreen", m49152k4(34, 139, 34).Clone());
        dictionary.addItem("fuchsia", m49152k4(255, 0, 255).Clone());
        dictionary.addItem("gainsboro", m49152k4(220, 220, 220).Clone());
        dictionary.addItem("ghostwhite", m49152k4(StyleIdentifier.LIGHT_GRID_ACCENT_6, StyleIdentifier.LIGHT_GRID_ACCENT_6, 255).Clone());
        dictionary.addItem("gold", m49152k4(255, 215, 0).Clone());
        dictionary.addItem("goldenrod", m49152k4(218, 165, 32).Clone());
        dictionary.addItem("gray", m49152k4(128, 128, 128).Clone());
        dictionary.addItem("green", m49152k4(0, 128, 0).Clone());
        dictionary.addItem("greenyellow", m49152k4(173, 255, 47).Clone());
        dictionary.addItem("grey", m49152k4(128, 128, 128).Clone());
        dictionary.addItem("honeydew", m49152k4(240, 255, 240).Clone());
        dictionary.addItem("hotpink", m49152k4(255, 105, 180).Clone());
        dictionary.addItem("indianred", m49152k4(205, 92, 92).Clone());
        dictionary.addItem("indigo", m49152k4(75, 0, 130).Clone());
        dictionary.addItem("ivory", m49152k4(255, 255, 240).Clone());
        dictionary.addItem("khaki", m49152k4(240, 230, 140).Clone());
        dictionary.addItem("lavender", m49152k4(230, 230, 250).Clone());
        dictionary.addItem("lavenderblush", m49152k4(255, 240, 245).Clone());
        dictionary.addItem("lawngreen", m49152k4(124, StyleIdentifier.MEDIUM_LIST_2_ACCENT_6, 0).Clone());
        dictionary.addItem("lemonchiffon", m49152k4(255, 250, 205).Clone());
        dictionary.addItem("lightblue", m49152k4(173, 216, 230).Clone());
        dictionary.addItem("lightcoral", m49152k4(240, 128, 128).Clone());
        dictionary.addItem("lightcyan", m49152k4(224, 255, 255).Clone());
        dictionary.addItem("lightgoldenrodyellow", m49152k4(250, 250, 210).Clone());
        dictionary.addItem("lightgray", m49152k4(211, 211, 211).Clone());
        dictionary.addItem("lightgreen", m49152k4(144, 238, 144).Clone());
        dictionary.addItem("lightgrey", m49152k4(211, 211, 211).Clone());
        dictionary.addItem("lightpink", m49152k4(255, 182, 193).Clone());
        dictionary.addItem("lightsalmon", m49152k4(255, 160, 122).Clone());
        dictionary.addItem("lightseagreen", m49152k4(32, 178, 170).Clone());
        dictionary.addItem("lightskyblue", m49152k4(135, 206, 250).Clone());
        dictionary.addItem("lightslategray", m49152k4(119, 136, 153).Clone());
        dictionary.addItem("lightslategrey", m49152k4(119, 136, 153).Clone());
        dictionary.addItem("lightsteelblue", m49152k4(176, 196, 222).Clone());
        dictionary.addItem("lightyellow", m49152k4(255, 255, 224).Clone());
        dictionary.addItem("lime", m49152k4(0, 255, 0).Clone());
        dictionary.addItem("limegreen", m49152k4(50, 205, 50).Clone());
        dictionary.addItem("linen", m49152k4(250, 240, 230).Clone());
        dictionary.addItem("magenta", m49152k4(255, 0, 255).Clone());
        dictionary.addItem("maroon", m49152k4(128, 0, 0).Clone());
        dictionary.addItem("mediumaquamarine", m49152k4(102, 205, 170).Clone());
        dictionary.addItem("mediumblue", m49152k4(0, 0, 205).Clone());
        dictionary.addItem("mediumorchid", m49152k4(186, 85, 211).Clone());
        dictionary.addItem("mediumpurple", m49152k4(147, 112, 219).Clone());
        dictionary.addItem("mediumseagreen", m49152k4(60, 179, 113).Clone());
        dictionary.addItem("mediumslateblue", m49152k4(123, 104, 238).Clone());
        dictionary.addItem("mediumspringgreen", m49152k4(0, 250, 154).Clone());
        dictionary.addItem("mediumturquoise", m49152k4(72, 209, 204).Clone());
        dictionary.addItem("mediumvioletred", m49152k4(199, 21, 133).Clone());
        dictionary.addItem("midnightblue", m49152k4(25, 25, 112).Clone());
        dictionary.addItem("mintcream", m49152k4(245, 255, 250).Clone());
        dictionary.addItem("mistyrose", m49152k4(255, 228, 225).Clone());
        dictionary.addItem("moccasin", m49152k4(255, 228, 181).Clone());
        dictionary.addItem("navajowhite", m49152k4(255, 222, 173).Clone());
        dictionary.addItem("navy", m49152k4(0, 0, 128).Clone());
        dictionary.addItem("oldlace", m49152k4(StyleIdentifier.MEDIUM_GRID_1_ACCENT_6, 245, 230).Clone());
        dictionary.addItem("olive", m49152k4(128, 128, 0).Clone());
        dictionary.addItem("olivedrab", m49152k4(107, 142, 35).Clone());
        dictionary.addItem("orange", m49152k4(255, 165, 0).Clone());
        dictionary.addItem("orangered", m49152k4(255, 69, 0).Clone());
        dictionary.addItem("orchid", m49152k4(218, 112, 214).Clone());
        dictionary.addItem("palegoldenrod", m49152k4(238, 232, 170).Clone());
        dictionary.addItem("palegreen", m49152k4(152, StyleIdentifier.MEDIUM_LIST_1_ACCENT_6, 152).Clone());
        dictionary.addItem("paleturquoise", m49152k4(175, 238, 238).Clone());
        dictionary.addItem("palevioletred", m49152k4(219, 112, 147).Clone());
        dictionary.addItem("papayawhip", m49152k4(255, 239, 213).Clone());
        dictionary.addItem("peachpuff", m49152k4(255, 218, 185).Clone());
        dictionary.addItem("peru", m49152k4(205, 133, 63).Clone());
        dictionary.addItem("pink", m49152k4(255, 192, 203).Clone());
        dictionary.addItem("plum ", m49152k4(221, 160, 221).Clone());
        dictionary.addItem("plum", m49152k4(221, 160, 221).Clone());
        dictionary.addItem("powderblue", m49152k4(176, 224, 230).Clone());
        dictionary.addItem("purple", m49152k4(128, 0, 128).Clone());
        dictionary.addItem("red", m49152k4(255, 0, 0).Clone());
        dictionary.addItem("rosybrown", m49152k4(188, 143, 143).Clone());
        dictionary.addItem("royalblue", m49152k4(65, 105, 225).Clone());
        dictionary.addItem("saddlebrown", m49152k4(139, 69, 19).Clone());
        dictionary.addItem("salmon", m49152k4(250, 128, 114).Clone());
        dictionary.addItem("sandybrown", m49152k4(244, 164, 96).Clone());
        dictionary.addItem("seagreen", m49152k4(46, 139, 87).Clone());
        dictionary.addItem("seashell", m49152k4(255, 245, 238).Clone());
        dictionary.addItem("sienna", m49152k4(160, 82, 45).Clone());
        dictionary.addItem("silver", m49152k4(192, 192, 192).Clone());
        dictionary.addItem("skyblue", m49152k4(135, 206, 235).Clone());
        dictionary.addItem("slateblue", m49152k4(106, 90, 205).Clone());
        dictionary.addItem("slategray", m49152k4(112, 128, 144).Clone());
        dictionary.addItem("slategrey", m49152k4(112, 128, 144).Clone());
        dictionary.addItem("snow", m49152k4(255, 250, 250).Clone());
        dictionary.addItem("springgreen", m49152k4(0, 255, 127).Clone());
        dictionary.addItem("steelblue", m49152k4(70, 130, 180).Clone());
        dictionary.addItem("tan", m49152k4(210, 180, 140).Clone());
        dictionary.addItem("teal", m49152k4(0, 128, 128).Clone());
        dictionary.addItem("thistle", m49152k4(216, 191, 216).Clone());
        dictionary.addItem("tomato", m49152k4(255, 99, 71).Clone());
        dictionary.addItem("turquoise", m49152k4(64, 224, 208).Clone());
        dictionary.addItem("violet", m49152k4(238, 130, 238).Clone());
        dictionary.addItem("wheat", m49152k4(245, 222, 179).Clone());
        dictionary.addItem("white", m49152k4(255, 255, 255).Clone());
        dictionary.addItem("whitesmoke", m49152k4(245, 245, 245).Clone());
        dictionary.addItem("yellow", m49152k4(255, 255, 0).Clone());
        dictionary.addItem("yellowgreen", m49152k4(154, 205, 50).Clone());
        dictionary.addItem("transparent", C12003du.m56398k4(0, 0, 0, 0).Clone());
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0063 A[Catch: RuntimeException -> 0x008d, TryCatch #0 {RuntimeException -> 0x008d, blocks: (B:3:0x0005, B:16:0x002f, B:17:0x0043, B:22:0x0085, B:18:0x0048, B:19:0x004d, B:20:0x004e, B:21:0x0063, B:7:0x0017, B:8:0x001b, B:9:0x0020), top: B:26:0x0005 }] */
    /* JADX INFO: renamed from: du */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static C12003du m49149du(String str) {
        String strM67422kk;
        int iM66583k4;
        int iM66583k42;
        int iM66583k43;
        int iM66583k44;
        String strM49139k4;
        C12003du c12003du = new C12003du();
        try {
            int length = str.length();
            if (length == 5) {
                strM67422kk = C14113y2.m67422kk(str, 3);
            } else {
                if (length != 9) {
                    iM66583k4 = 255;
                    if (length != 4 || length == 5) {
                        int iM66583k45 = C14057f9.m66583k4(C10009ck.m49139k4(str, 1, 2), 515) * 17;
                        int iM66583k46 = C14057f9.m66583k4(C10009ck.m49139k4(str, 2, 3), 515) * 17;
                        iM66583k42 = C14057f9.m66583k4(C10009ck.m49139k4(str, 3, 4), 515) * 17;
                        iM66583k43 = iM66583k46;
                        iM66583k44 = iM66583k45;
                    } else {
                        if (length == 7) {
                            iM66583k44 = C14057f9.m66583k4(C10009ck.m49139k4(str, 1, 3), 515);
                            iM66583k43 = C14057f9.m66583k4(C10009ck.m49139k4(str, 3, 5), 515);
                            strM49139k4 = C10009ck.m49139k4(str, 5, 7);
                        } else {
                            if (length != 9) {
                                throw new Exception();
                            }
                            iM66583k44 = C14057f9.m66583k4(C10009ck.m49139k4(str, 3, 5), 515);
                            iM66583k43 = C14057f9.m66583k4(C10009ck.m49139k4(str, 5, 7), 515);
                            strM49139k4 = C10009ck.m49139k4(str, 7, 9);
                        }
                        iM66583k42 = C14057f9.m66583k4(strM49139k4, 515);
                    }
                    C12003du.m56398k4(iM66583k4, iM66583k44, iM66583k43, iM66583k42).CloneTo(c12003du);
                    return c12003du;
                }
                strM67422kk = C10009ck.m49139k4(str, 1, 3);
            }
            iM66583k4 = C14057f9.m66583k4(strM67422kk, 515);
            if (length != 4) {
                int iM66583k452 = C14057f9.m66583k4(C10009ck.m49139k4(str, 1, 2), 515) * 17;
                int iM66583k462 = C14057f9.m66583k4(C10009ck.m49139k4(str, 2, 3), 515) * 17;
                iM66583k42 = C14057f9.m66583k4(C10009ck.m49139k4(str, 3, 4), 515) * 17;
                iM66583k43 = iM66583k462;
                iM66583k44 = iM66583k452;
            }
            C12003du.m56398k4(iM66583k4, iM66583k44, iM66583k43, iM66583k42).CloneTo(c12003du);
            return c12003du;
        } catch (RuntimeException unused) {
            throw new C1921qq(C14113y2.m67408k4("Unknown color format: ", str, ". Must be #RGB. #RGBA, #RRGGBB, or #AARRGGBB"));
        }
    }

    /* JADX INFO: renamed from: k4 */
    private static byte m49150k4(byte b, float f) {
        byte bOooO00o = (byte) ((b & 255) + (C22202OooO0oo.OooO00o(255 - r3, f, 13) & 255));
        if ((bOooO00o & 255) < 255) {
            return bOooO00o;
        }
        return (byte) -1;
    }

    /* JADX INFO: renamed from: kk */
    private static C12003du m49158kk(C12003du c12003du, float f) {
        if (f > 1.0f) {
            f -= 1.0f;
        }
        return C12003du.m56397k4(m49150k4(c12003du.m56507jd(), f) & 255, m49150k4(c12003du.m56502ck(), f) & 255, m49150k4(c12003du.m56505fa(), f) & 255);
    }

    /* JADX INFO: renamed from: to */
    private static C12003du m49161to(String str) {
        C12003du c12003du = new C12003du();
        int iM67364dy = C14113y2.m67364dy(str, "(");
        int iM67364dy2 = C14113y2.m67364dy(str, ")");
        if (iM67364dy == -1 || iM67364dy2 == -1) {
            throw new C1921qq(C14113y2.m67408k4("Unknown color format: ", str, ". Must be rgb(r,g,b)"));
        }
        String strM49139k4 = C10009ck.m49139k4(str, iM67364dy + 1, iM67364dy2);
        try {
            String[] strArrM67414k4 = C14113y2.m67414k4(strM49139k4, ',');
            if (strArrM67414k4.length != 3) {
                throw new C1921qq(C14113y2.m67408k4("Invalid number of arguments: rgb(", strM49139k4, ")"));
            }
            C12003du.m56397k4(C7019kk.m27462to(Double.valueOf(((double) (m49151k4(strArrM67414k4[0], strM49139k4) * 255.0f)) + 0.5d), 14), C7019kk.m27462to(Double.valueOf(((double) (m49151k4(strArrM67414k4[1], strM49139k4) * 255.0f)) + 0.5d), 14), C7019kk.m27462to(Double.valueOf(((double) (m49151k4(strArrM67414k4[2], strM49139k4) * 255.0f)) + 0.5d), 14)).CloneTo(c12003du);
            return c12003du;
        } catch (RuntimeException e) {
            throw new C1921qq(e.getMessage());
        }
    }

    /* JADX INFO: renamed from: x1 */
    private static byte m49162x1(byte b, float f) {
        float f2 = b & 255;
        int iM27462to = C7019kk.m27462to(Float.valueOf(f2 - ((-f) * f2)), 13);
        if (iM27462to < 255) {
            return (byte) iM27462to;
        }
        return (byte) -1;
    }

    /* JADX INFO: renamed from: kk */
    private static C12003du m49159kk(String str) {
        int iM67364dy = C14113y2.m67364dy(str, "[");
        int iM67364dy2 = C14113y2.m67364dy(str, "]");
        try {
            if (iM67364dy == -1 || iM67364dy2 == -1) {
                throw new ArgumentException(C14113y2.m67408k4("Invalid format for a java.awt.Color: ", str));
            }
            String strM49139k4 = C10009ck.m49139k4(str, iM67364dy + 1, iM67364dy2);
            String[] strArrM67414k4 = C14113y2.m67414k4(strM49139k4, ',');
            if (strArrM67414k4.length != 3) {
                throw new C1921qq(C14113y2.m67408k4("Invalid number of arguments for a java.awt.Color: ", strM49139k4));
            }
            String strM67422kk = C14113y2.m67422kk(C14113y2.m67440x1(strArrM67414k4[0]), 2);
            C1864kk c1864kk = C1864kk.f6725k4;
            float fM66706k4 = C14064he.m66706k4(strM67422kk, FrameMetricsAggregator.EVERY_DURATION, c1864kk.m9751k4()) / 255.0f;
            float fM66706k42 = C14064he.m66706k4(C14113y2.m67422kk(C14113y2.m67440x1(strArrM67414k4[1]), 2), FrameMetricsAggregator.EVERY_DURATION, c1864kk.m9751k4()) / 255.0f;
            float fM66706k43 = C14064he.m66706k4(C14113y2.m67422kk(C14113y2.m67440x1(strArrM67414k4[2]), 2), FrameMetricsAggregator.EVERY_DURATION, c1864kk.m9751k4()) / 255.0f;
            double d = fM66706k4;
            if (d >= 0.0d && d <= 1.0d) {
                double d2 = fM66706k42;
                if (d2 >= 0.0d && d2 <= 1.0d) {
                    double d3 = fM66706k43;
                    if (d3 >= 0.0d && d3 <= 1.0d) {
                        return C12003du.m56397k4(C22221Oooo0O0.OooO0O0(fM66706k4, 255.0f, 0.5f, 13), C22221Oooo0O0.OooO0O0(fM66706k42, 255.0f, 0.5f, 13), C22221Oooo0O0.OooO0O0(fM66706k43, 255.0f, 0.5f, 13));
                    }
                }
            }
            throw new C1921qq("Color values out of range");
        } catch (RuntimeException e) {
            throw new C1921qq(e.getMessage());
        }
    }

    /* JADX INFO: renamed from: x1 */
    private static C12003du m49163x1(C12003du c12003du, float f) {
        return C12003du.m56397k4(m49162x1(c12003du.m56507jd(), f) & 255, m49162x1(c12003du.m56502ck(), f) & 255, m49162x1(c12003du.m56505fa(), f) & 255);
    }

    /* JADX INFO: renamed from: x1 */
    private static C12003du m49164x1(String str) {
        int iM67364dy = C14113y2.m67364dy(str, "(");
        int iM67364dy2 = C14113y2.m67364dy(str, ")");
        if (iM67364dy == -1 || iM67364dy2 == -1) {
            throw new C1921qq(C14113y2.m67408k4("Unknown color format: ", str, ". Must be system-color(x)"));
        }
        String strM49139k4 = C10009ck.m49139k4(str, iM67364dy + 1, iM67364dy2);
        C12003du c12003du = new C12003du();
        C12003du[] c12003duArr = {c12003du};
        f36025k4.tryGetValue(strM49139k4, c12003duArr);
        c12003duArr[0].CloneTo(c12003du);
        return c12003du;
    }

    /* JADX INFO: renamed from: k4 */
    private static float m49151k4(String str, String str2) {
        float fM66706k4;
        float f;
        String strM67440x1 = C14113y2.m67440x1(str);
        if (C14113y2.m67424kk(strM67440x1, "%")) {
            fM66706k4 = C14064he.m66706k4(C10009ck.m49139k4(strM67440x1, 0, strM67440x1.length() - 1), FrameMetricsAggregator.EVERY_DURATION, C1864kk.f6725k4.m9751k4());
            f = 100.0f;
        } else {
            fM66706k4 = C14064he.m66706k4(strM67440x1, FrameMetricsAggregator.EVERY_DURATION, C1864kk.f6725k4.m9751k4());
            f = 255.0f;
        }
        float f2 = fM66706k4 / f;
        double d = f2;
        if (d < 0.0d || d > 1.0d) {
            throw new C1921qq(C14113y2.m67408k4("Color value out of range for ", str2, ": ", strM67440x1, ". Valid range: [0..255] or [0%..100%]"));
        }
        return f2;
    }

    /* JADX INFO: renamed from: x1 */
    private static String m49165x1(C12003du c12003du) {
        C6765kp c6765kp = new C6765kp();
        c6765kp.m26780k4('#');
        String strM67320k4 = C14098up.m67320k4(c12003du.m56507jd(), "X");
        if (strM67320k4.length() == 1) {
            c6765kp.m26780k4('0');
        }
        c6765kp.m26792k4(strM67320k4);
        String strM67320k42 = C14098up.m67320k4(c12003du.m56502ck(), "X");
        if (strM67320k42.length() == 1) {
            c6765kp.m26780k4('0');
        }
        c6765kp.m26792k4(strM67320k42);
        String strM67320k43 = C14098up.m67320k4(c12003du.m56505fa(), "X");
        if (strM67320k43.length() == 1) {
            c6765kp.m26780k4('0');
        }
        c6765kp.m26792k4(strM67320k43);
        if ((c12003du.m56501c5() & 255) != 255) {
            String strM67320k44 = C14098up.m67320k4(c12003du.m56501c5(), "X");
            if (strM67320k44.length() == 1) {
                c6765kp.m26780k4('0');
            }
            c6765kp.m26792k4(strM67320k44);
        }
        return c6765kp.toString();
    }

    /* JADX INFO: renamed from: k4 */
    private static C12003du m49152k4(int i, int i2, int i3) {
        return C12003du.m56397k4(i, i2, i3);
    }

    /* JADX INFO: renamed from: x1 */
    private static boolean m49166x1(float f) {
        return f >= 2.0f;
    }

    /* JADX INFO: renamed from: k4 */
    public static C12003du m49153k4(C12003du c12003du, float f) {
        if (m49156k4(f)) {
            return c12003du;
        }
        if (m49166x1(f)) {
            return C12003du.m56385i5();
        }
        boolean zM49160kk = m49160kk(f);
        C12003du c12003duClone = c12003du.Clone();
        return zM49160kk ? m49163x1(c12003duClone, f) : m49158kk(c12003duClone, f);
    }

    /* JADX INFO: renamed from: kk */
    private static boolean m49160kk(float f) {
        return f < 1.0f;
    }

    /* JADX WARN: Removed duplicated region for block: B:36:0x008e  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0096  */
    /* JADX INFO: renamed from: k4 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static C12003du m49154k4(C12814to c12814to, String str) {
        C12003du c12003duM49164x1;
        C12003du c12003du = C12003du.f40505to;
        if (str == null) {
            return c12003du;
        }
        C12003du c12003duClone = c12003du.Clone();
        Dictionary<String, C12003du> dictionary = f36025k4;
        if (dictionary.containsKey(C14113y2.m67368h4(str))) {
            dictionary.get_Item(C14113y2.m67368h4(str)).CloneTo(c12003duClone);
        }
        if (!c12003duClone.m56504dy()) {
            return c12003duClone;
        }
        if (C14113y2.m67448x1(str, "#")) {
            c12003duM49164x1 = m49149du(str);
        } else if (C14113y2.m67448x1(str, "rgb(")) {
            c12003duM49164x1 = m49161to(str);
        } else {
            if (C14113y2.m67448x1(str, "url(")) {
                throw new C1921qq("Colors starting with url( are not yet supported!");
            }
            if (C14113y2.m67448x1(str, "java.awt.Color")) {
                c12003duM49164x1 = m49159kk(str);
            } else {
                if (!C14113y2.m67448x1(str, "system-color(")) {
                    if (C14113y2.m67448x1(str, "fop-rgb-icc")) {
                        throw new Exception("Color space fop-rgb-icc is not supported");
                    }
                    if (C14113y2.m67448x1(str, "fop-rgb-named-color")) {
                        throw new Exception("Color space fop-rgb-named-color is not supported");
                    }
                    if (C14113y2.m67448x1(str, "cie-lab-color")) {
                        throw new Exception("Color space cie-lab-color is not supported");
                    }
                    if (C14113y2.m67448x1(str, "cmyk")) {
                        throw new Exception("Color space cmyk is not supported");
                    }
                    if (!c12003duClone.m56504dy()) {
                        throw new C1921qq(C14113y2.m67408k4("Unknown Color: ", str));
                    }
                    dictionary.set_Item(str, c12003duClone.Clone());
                    return c12003duClone;
                }
                c12003duM49164x1 = m49164x1(str);
            }
        }
        c12003duM49164x1.CloneTo(c12003duClone);
        if (!c12003duClone.m56504dy()) {
        }
    }

    /* JADX INFO: renamed from: k4 */
    public static String m49155k4(C12003du c12003du) {
        return m49165x1(c12003du.Clone());
    }

    /* JADX INFO: renamed from: k4 */
    private static boolean m49156k4(float f) {
        float f2 = f - 1.0f;
        return f2 < 0.01f && f2 > -0.01f;
    }

    /* JADX INFO: renamed from: k4 */
    public static boolean m49157k4(String str) {
        String strM67368h4 = C14113y2.m67368h4(str);
        return C14113y2.m67363du(C14113y2.m67368h4("#CMYK"), strM67368h4) || C14113y2.m67363du(C14113y2.m67368h4("#Separation"), strM67368h4);
    }
}
