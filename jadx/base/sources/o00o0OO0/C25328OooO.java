package o00o0OO0;

import OooOoo.C20593OooO0Oo;
import android.graphics.Matrix;
import android.os.Bundle;
import android.support.v4.media.session.PlaybackStateCompat;
import android.util.Log;
import android.util.Xml;
import androidx.core.internal.view.SupportMenu;
import androidx.core.provider.FontsContractCompat;
import androidx.core.view.InputDeviceCompat;
import androidx.core.view.ViewCompat;
import com.alibaba.sdk.android.oss.common.RequestParameters;
import com.aspose.words.ControlChar;
import com.google.firebase.firestore.local.SQLitePersistence;
import com.google.logging.type.LogSeverity;
import com.google.mlkit.p567nl.translate.TranslateLanguage;
import com.huawei.hms.network.embedded.C18163eb;
import com.huawei.hms.network.embedded.C18437z2;
import com.huawei.hms.support.hianalytics.HiAnalyticsConstant;
import com.microsoft.identity.common.java.jwt.AbstractJwtRequest;
import com.microsoft.identity.common.java.marker.PerfConstants;
import com.microsoft.identity.common.java.providers.microsoft.azureactivedirectory.AzureActiveDirectorySlice;
import com.orion.notein.domain.models.note.NoteMeta;
import com.orion.notein.richeditor.converter.tagsoup.Parser;
import com.orion.notein.richeditor.utils.p606io.IOUtils;
import com.orion.penkit.tools.DrawToolFactory;
import java.io.BufferedInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Locale;
import java.util.zip.GZIPInputStream;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.parsers.SAXParserFactory;
import o00o0OO0.C25334OooO0O0;
import o00o0OO0.C25345OooO0o;
import o00o0OO0.C25391OooO0o0;
import org.xml.sax.Attributes;
import org.xml.sax.InputSource;
import org.xml.sax.SAXException;
import org.xml.sax.XMLReader;
import org.xml.sax.ext.DefaultHandler2;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: renamed from: o00o0OO0.OooO, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C25328OooO {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public int f86178OooO0Oo;

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public C25345OooO0o f86175OooO00o = null;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public C25345OooO0o.Oooo0 f86176OooO0O0 = null;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public boolean f86177OooO0OO = false;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public boolean f86180OooO0o0 = false;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public EnumC25331OooO0oO f86179OooO0o = null;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public StringBuilder f86181OooO0oO = null;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public boolean f86182OooO0oo = false;

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    public StringBuilder f86174OooO = null;

    /* JADX INFO: renamed from: o00o0OO0.OooO$OooO, reason: collision with other inner class name */
    public class C19695OooO implements Attributes {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public XmlPullParser f86183OooO00o;

        @Override // org.xml.sax.Attributes
        public final int getIndex(String str, String str2) {
            return -1;
        }

        @Override // org.xml.sax.Attributes
        public final int getLength() {
            return this.f86183OooO00o.getAttributeCount();
        }

        @Override // org.xml.sax.Attributes
        public final String getLocalName(int i) {
            return this.f86183OooO00o.getAttributeName(i);
        }

        @Override // org.xml.sax.Attributes
        public final String getQName(int i) {
            XmlPullParser xmlPullParser = this.f86183OooO00o;
            String attributeName = xmlPullParser.getAttributeName(i);
            if (xmlPullParser.getAttributePrefix(i) == null) {
                return attributeName;
            }
            return xmlPullParser.getAttributePrefix(i) + ':' + attributeName;
        }

        @Override // org.xml.sax.Attributes
        public final String getType(int i) {
            return null;
        }

        @Override // org.xml.sax.Attributes
        public final String getURI(int i) {
            return this.f86183OooO00o.getAttributeNamespace(i);
        }

        @Override // org.xml.sax.Attributes
        public final String getValue(int i) {
            return this.f86183OooO00o.getAttributeValue(i);
        }

        @Override // org.xml.sax.Attributes
        public final int getIndex(String str) {
            return -1;
        }

        @Override // org.xml.sax.Attributes
        public final String getType(String str, String str2) {
            return null;
        }

        @Override // org.xml.sax.Attributes
        public final String getValue(String str, String str2) {
            return null;
        }

        @Override // org.xml.sax.Attributes
        public final String getType(String str) {
            return null;
        }

        @Override // org.xml.sax.Attributes
        public final String getValue(String str) {
            return null;
        }
    }

    /* JADX INFO: renamed from: o00o0OO0.OooO$OooO00o */
    public static class OooO00o {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public static final HashMap f86184OooO00o;

        static {
            HashMap map = new HashMap(10);
            f86184OooO00o = map;
            map.put("none", C25391OooO0o0.OooO00o.f86554OooOo0o);
            map.put("xMinYMin", C25391OooO0o0.OooO00o.f86553OooOo);
            map.put("xMidYMin", C25391OooO0o0.OooO00o.f86556OooOoO0);
            map.put("xMaxYMin", C25391OooO0o0.OooO00o.f86555OooOoO);
            map.put("xMinYMid", C25391OooO0o0.OooO00o.f86557OooOoOO);
            map.put("xMidYMid", C25391OooO0o0.OooO00o.f86559OooOoo0);
            map.put("xMaxYMid", C25391OooO0o0.OooO00o.f86558OooOoo);
            map.put("xMinYMax", C25391OooO0o0.OooO00o.f86560OooOooO);
            map.put("xMidYMax", C25391OooO0o0.OooO00o.f86561OooOooo);
            map.put("xMaxYMax", C25391OooO0o0.OooO00o.f86562Oooo000);
        }
    }

    /* JADX INFO: renamed from: o00o0OO0.OooO$OooO0O0 */
    public static class OooO0O0 {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public static final HashMap f86185OooO00o;

        static {
            HashMap map = new HashMap(47);
            f86185OooO00o = map;
            com.aspose.words.OooO0OO.OooO0O0(-984833, map, "aliceblue", -332841, "antiquewhite");
            map.put("aqua", -16711681);
            map.put("aquamarine", -8388652);
            com.aspose.words.OooO0OO.OooO0O0(-983041, map, "azure", -657956, "beige");
            com.aspose.words.OooO0OO.OooO0O0(-6972, map, "bisque", ViewCompat.MEASURED_STATE_MASK, "black");
            com.aspose.words.OooO0OO.OooO0O0(-5171, map, "blanchedalmond", -16776961, "blue");
            com.aspose.words.OooO0OO.OooO0O0(-7722014, map, "blueviolet", -5952982, "brown");
            com.aspose.words.OooO0OO.OooO0O0(-2180985, map, "burlywood", -10510688, "cadetblue");
            com.aspose.words.OooO0OO.OooO0O0(-8388864, map, "chartreuse", -2987746, "chocolate");
            com.aspose.words.OooO0OO.OooO0O0(-32944, map, "coral", -10185235, "cornflowerblue");
            com.aspose.words.OooO0OO.OooO0O0(-1828, map, "cornsilk", -2354116, "crimson");
            map.put("cyan", -16711681);
            map.put("darkblue", -16777077);
            com.aspose.words.OooO0OO.OooO0O0(-16741493, map, "darkcyan", -4684277, "darkgoldenrod");
            map.put("darkgray", -5658199);
            map.put("darkgreen", -16751616);
            map.put("darkgrey", -5658199);
            map.put("darkkhaki", -4343957);
            com.aspose.words.OooO0OO.OooO0O0(-7667573, map, "darkmagenta", -11179217, "darkolivegreen");
            com.aspose.words.OooO0OO.OooO0O0(-29696, map, "darkorange", -6737204, "darkorchid");
            com.aspose.words.OooO0OO.OooO0O0(-7667712, map, "darkred", -1468806, "darksalmon");
            com.aspose.words.OooO0OO.OooO0O0(-7357297, map, "darkseagreen", -12042869, "darkslateblue");
            map.put("darkslategray", -13676721);
            map.put("darkslategrey", -13676721);
            map.put("darkturquoise", -16724271);
            map.put("darkviolet", -7077677);
            com.aspose.words.OooO0OO.OooO0O0(-60269, map, "deeppink", -16728065, "deepskyblue");
            map.put("dimgray", -9868951);
            map.put("dimgrey", -9868951);
            map.put("dodgerblue", -14774017);
            map.put("firebrick", -5103070);
            com.aspose.words.OooO0OO.OooO0O0(-1296, map, "floralwhite", -14513374, "forestgreen");
            map.put("fuchsia", -65281);
            map.put("gainsboro", -2302756);
            com.aspose.words.OooO0OO.OooO0O0(-460545, map, "ghostwhite", -10496, "gold");
            map.put("goldenrod", -2448096);
            map.put("gray", -8355712);
            com.aspose.words.OooO0OO.OooO0O0(-16744448, map, "green", -5374161, "greenyellow");
            map.put("grey", -8355712);
            map.put("honeydew", -983056);
            com.aspose.words.OooO0OO.OooO0O0(-38476, map, "hotpink", -3318692, "indianred");
            com.aspose.words.OooO0OO.OooO0O0(-11861886, map, "indigo", -16, "ivory");
            com.aspose.words.OooO0OO.OooO0O0(-989556, map, "khaki", -1644806, "lavender");
            com.aspose.words.OooO0OO.OooO0O0(-3851, map, "lavenderblush", -8586240, "lawngreen");
            com.aspose.words.OooO0OO.OooO0O0(-1331, map, "lemonchiffon", -5383962, "lightblue");
            com.aspose.words.OooO0OO.OooO0O0(-1015680, map, "lightcoral", -2031617, "lightcyan");
            map.put("lightgoldenrodyellow", -329006);
            map.put("lightgray", -2894893);
            map.put("lightgreen", -7278960);
            map.put("lightgrey", -2894893);
            com.aspose.words.OooO0OO.OooO0O0(-18751, map, "lightpink", -24454, "lightsalmon");
            com.aspose.words.OooO0OO.OooO0O0(-14634326, map, "lightseagreen", -7876870, "lightskyblue");
            map.put("lightslategray", -8943463);
            map.put("lightslategrey", -8943463);
            map.put("lightsteelblue", -5192482);
            map.put("lightyellow", -32);
            com.aspose.words.OooO0OO.OooO0O0(-16711936, map, "lime", -13447886, "limegreen");
            map.put("linen", -331546);
            map.put("magenta", -65281);
            com.aspose.words.OooO0OO.OooO0O0(-8388608, map, "maroon", -10039894, "mediumaquamarine");
            com.aspose.words.OooO0OO.OooO0O0(-16777011, map, "mediumblue", -4565549, "mediumorchid");
            com.aspose.words.OooO0OO.OooO0O0(-7114533, map, "mediumpurple", -12799119, "mediumseagreen");
            com.aspose.words.OooO0OO.OooO0O0(-8689426, map, "mediumslateblue", -16713062, "mediumspringgreen");
            com.aspose.words.OooO0OO.OooO0O0(-12004916, map, "mediumturquoise", -3730043, "mediumvioletred");
            com.aspose.words.OooO0OO.OooO0O0(-15132304, map, "midnightblue", -655366, "mintcream");
            com.aspose.words.OooO0OO.OooO0O0(-6943, map, "mistyrose", -6987, "moccasin");
            com.aspose.words.OooO0OO.OooO0O0(-8531, map, "navajowhite", -16777088, "navy");
            com.aspose.words.OooO0OO.OooO0O0(-133658, map, "oldlace", -8355840, "olive");
            com.aspose.words.OooO0OO.OooO0O0(-9728477, map, "olivedrab", -23296, "orange");
            com.aspose.words.OooO0OO.OooO0O0(-47872, map, "orangered", -2461482, "orchid");
            com.aspose.words.OooO0OO.OooO0O0(-1120086, map, "palegoldenrod", -6751336, "palegreen");
            com.aspose.words.OooO0OO.OooO0O0(-5247250, map, "paleturquoise", -2396013, "palevioletred");
            com.aspose.words.OooO0OO.OooO0O0(-4139, map, "papayawhip", -9543, "peachpuff");
            com.aspose.words.OooO0OO.OooO0O0(-3308225, map, "peru", -16181, "pink");
            com.aspose.words.OooO0OO.OooO0O0(-2252579, map, "plum", -5185306, "powderblue");
            com.aspose.words.OooO0OO.OooO0O0(-8388480, map, "purple", -10079335, "rebeccapurple");
            com.aspose.words.OooO0OO.OooO0O0(SupportMenu.CATEGORY_MASK, map, "red", -4419697, "rosybrown");
            com.aspose.words.OooO0OO.OooO0O0(-12490271, map, "royalblue", -7650029, "saddlebrown");
            com.aspose.words.OooO0OO.OooO0O0(-360334, map, "salmon", -744352, "sandybrown");
            com.aspose.words.OooO0OO.OooO0O0(-13726889, map, "seagreen", -2578, "seashell");
            com.aspose.words.OooO0OO.OooO0O0(-6270419, map, "sienna", -4144960, "silver");
            com.aspose.words.OooO0OO.OooO0O0(-7876885, map, "skyblue", -9807155, "slateblue");
            map.put("slategray", -9404272);
            map.put("slategrey", -9404272);
            map.put("snow", -1286);
            map.put("springgreen", -16711809);
            com.aspose.words.OooO0OO.OooO0O0(-12156236, map, "steelblue", -2968436, "tan");
            com.aspose.words.OooO0OO.OooO0O0(-16744320, map, "teal", -2572328, "thistle");
            com.aspose.words.OooO0OO.OooO0O0(-40121, map, "tomato", -12525360, "turquoise");
            com.aspose.words.OooO0OO.OooO0O0(-1146130, map, "violet", -663885, "wheat");
            com.aspose.words.OooO0OO.OooO0O0(-1, map, "white", -657931, "whitesmoke");
            com.aspose.words.OooO0OO.OooO0O0(InputDeviceCompat.SOURCE_ANY, map, "yellow", -6632142, "yellowgreen");
            map.put("transparent", 0);
        }
    }

    /* JADX INFO: renamed from: o00o0OO0.OooO$OooO0OO */
    public static class OooO0OO {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public static final HashMap f86186OooO00o;

        static {
            HashMap map = new HashMap(9);
            f86186OooO00o = map;
            C25345OooO0o.EnumC25388Ooooo0o enumC25388Ooooo0o = C25345OooO0o.EnumC25388Ooooo0o.f86539OooOo;
            map.put("xx-small", new C25345OooO0o.OooOOOO(0.694f, enumC25388Ooooo0o));
            map.put("x-small", new C25345OooO0o.OooOOOO(0.833f, enumC25388Ooooo0o));
            map.put("small", new C25345OooO0o.OooOOOO(10.0f, enumC25388Ooooo0o));
            map.put("medium", new C25345OooO0o.OooOOOO(12.0f, enumC25388Ooooo0o));
            map.put("large", new C25345OooO0o.OooOOOO(14.4f, enumC25388Ooooo0o));
            map.put("x-large", new C25345OooO0o.OooOOOO(17.3f, enumC25388Ooooo0o));
            map.put("xx-large", new C25345OooO0o.OooOOOO(20.7f, enumC25388Ooooo0o));
            C25345OooO0o.EnumC25388Ooooo0o enumC25388Ooooo0o2 = C25345OooO0o.EnumC25388Ooooo0o.f86542OooOoO0;
            map.put("smaller", new C25345OooO0o.OooOOOO(83.33f, enumC25388Ooooo0o2));
            map.put("larger", new C25345OooO0o.OooOOOO(120.0f, enumC25388Ooooo0o2));
        }
    }

    /* JADX INFO: renamed from: o00o0OO0.OooO$OooO0Oo, reason: case insensitive filesystem */
    public static class C25329OooO0Oo {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public static final HashMap f86187OooO00o;

        static {
            HashMap map = new HashMap(13);
            f86187OooO00o = map;
            map.put("normal", 400);
            Integer numValueOf = Integer.valueOf(LogSeverity.ALERT_VALUE);
            map.put("bold", numValueOf);
            com.aspose.words.OooO0OO.OooO0O0(1, map, "bolder", -1, "lighter");
            com.aspose.words.OooO0OO.OooO0O0(100, map, PerfConstants.ScenarioConstants.SCENARIO_NON_BROKERED_ACQUIRE_TOKEN_SILENTLY, 200, PerfConstants.ScenarioConstants.SCENARIO_BROKERED_ACQUIRE_TOKEN_SILENTLY);
            map.put(PerfConstants.ScenarioConstants.SCENARIO_GENERATE_AT_POP_ASYMMETRIC_KEYPAIR, 300);
            map.put("400", 400);
            com.aspose.words.OooO0OO.OooO0O0(500, map, "500", 600, "600");
            map.put("700", numValueOf);
            map.put("800", Integer.valueOf(LogSeverity.EMERGENCY_VALUE));
            map.put("900", Integer.valueOf(SQLitePersistence.MAX_ARGS));
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* JADX INFO: renamed from: o00o0OO0.OooO$OooO0o */
    public static final class OooO0o {

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public static final OooO0o f86189OooOo0o = new OooO0o("CLASS", 0);

        /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
        public static final OooO0o f86188OooOo = new OooO0o("clip", 1);

        /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
        public static final OooO0o f86191OooOoO0 = new OooO0o("clip_path", 2);

        /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
        public static final OooO0o f86190OooOoO = new OooO0o("clipPathUnits", 3);

        /* JADX INFO: renamed from: OooOoOO, reason: collision with root package name */
        public static final OooO0o f86192OooOoOO = new OooO0o("clip_rule", 4);

        /* JADX INFO: renamed from: OooOoo0, reason: collision with root package name */
        public static final OooO0o f86194OooOoo0 = new OooO0o("color", 5);

        /* JADX INFO: renamed from: OooOoo, reason: collision with root package name */
        public static final OooO0o f86193OooOoo = new OooO0o("cx", 6);

        /* JADX INFO: renamed from: OooOooO, reason: collision with root package name */
        public static final OooO0o f86195OooOooO = new OooO0o(TranslateLanguage.WELSH, 7);

        /* JADX INFO: renamed from: OooOooo, reason: collision with root package name */
        public static final OooO0o f86196OooOooo = new OooO0o(HiAnalyticsConstant.HaKey.BI_KEY_DIRECTION, 8);

        /* JADX INFO: renamed from: Oooo000, reason: collision with root package name */
        public static final OooO0o f86199Oooo000 = new OooO0o("dx", 9);

        /* JADX INFO: renamed from: Oooo00O, reason: collision with root package name */
        public static final OooO0o f86200Oooo00O = new OooO0o("dy", 10);

        /* JADX INFO: renamed from: Oooo00o, reason: collision with root package name */
        public static final OooO0o f86201Oooo00o = new OooO0o("fx", 11);

        /* JADX INFO: renamed from: Oooo0, reason: collision with root package name */
        public static final OooO0o f86198Oooo0 = new OooO0o("fy", 12);

        /* JADX INFO: renamed from: Oooo0O0, reason: collision with root package name */
        public static final OooO0o f86202Oooo0O0 = new OooO0o("d", 13);

        /* JADX INFO: renamed from: Oooo0OO, reason: collision with root package name */
        public static final OooO0o f86203Oooo0OO = new OooO0o("display", 14);

        /* JADX INFO: renamed from: Oooo0o0, reason: collision with root package name */
        public static final OooO0o f86205Oooo0o0 = new OooO0o("fill", 15);

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public static final OooO0o f86204Oooo0o = new OooO0o("fill_rule", 16);

        /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
        public static final OooO0o f86206Oooo0oO = new OooO0o("fill_opacity", 17);

        /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
        public static final OooO0o f86207Oooo0oo = new OooO0o("font", 18);

        /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
        public static final OooO0o f86197Oooo = new OooO0o("font_family", 19);

        /* JADX INFO: renamed from: OoooO00, reason: collision with root package name */
        public static final OooO0o f86210OoooO00 = new OooO0o("font_size", 20);

        /* JADX INFO: renamed from: OoooO0, reason: collision with root package name */
        public static final OooO0o f86209OoooO0 = new OooO0o(FontsContractCompat.Columns.WEIGHT, 21);

        /* JADX INFO: renamed from: OoooO0O, reason: collision with root package name */
        public static final OooO0o f86211OoooO0O = new OooO0o("font_style", 22);

        /* JADX INFO: renamed from: OoooO, reason: collision with root package name */
        public static final OooO0o f86208OoooO = new OooO0o("gradientTransform", 23);

        /* JADX INFO: renamed from: OoooOO0, reason: collision with root package name */
        public static final OooO0o f86212OoooOO0 = new OooO0o("gradientUnits", 24);

        /* JADX INFO: renamed from: o000oOoO, reason: collision with root package name */
        public static final OooO0o f86261o000oOoO = new OooO0o("height", 25);

        /* JADX INFO: renamed from: OoooOOO, reason: collision with root package name */
        public static final OooO0o f86213OoooOOO = new OooO0o("href", 26);

        /* JADX INFO: renamed from: OoooOOo, reason: collision with root package name */
        public static final OooO0o f86214OoooOOo = new OooO0o("image_rendering", 27);

        /* JADX INFO: renamed from: OoooOo0, reason: collision with root package name */
        public static final OooO0o f86215OoooOo0 = new OooO0o(RequestParameters.MARKER, 28);

        /* JADX INFO: renamed from: OoooOoO, reason: collision with root package name */
        public static final OooO0o f86216OoooOoO = new OooO0o("marker_start", 29);

        /* JADX INFO: renamed from: OoooOoo, reason: collision with root package name */
        public static final OooO0o f86217OoooOoo = new OooO0o("marker_mid", 30);

        /* JADX INFO: renamed from: Ooooo00, reason: collision with root package name */
        public static final OooO0o f86218Ooooo00 = new OooO0o("marker_end", 31);

        /* JADX INFO: renamed from: Ooooo0o, reason: collision with root package name */
        public static final OooO0o f86219Ooooo0o = new OooO0o("markerHeight", 32);

        /* JADX INFO: renamed from: OooooO0, reason: collision with root package name */
        public static final OooO0o f86220OooooO0 = new OooO0o("markerUnits", 33);

        /* JADX INFO: renamed from: OooooOO, reason: collision with root package name */
        public static final OooO0o f86221OooooOO = new OooO0o("markerWidth", 34);

        /* JADX INFO: renamed from: OooooOo, reason: collision with root package name */
        public static final OooO0o f86222OooooOo = new OooO0o("mask", 35);

        /* JADX INFO: renamed from: Oooooo0, reason: collision with root package name */
        public static final OooO0o f86224Oooooo0 = new OooO0o("maskContentUnits", 36);

        /* JADX INFO: renamed from: Oooooo, reason: collision with root package name */
        public static final OooO0o f86223Oooooo = new OooO0o("maskUnits", 37);

        /* JADX INFO: renamed from: OoooooO, reason: collision with root package name */
        public static final OooO0o f86225OoooooO = new OooO0o("media", 38);

        /* JADX INFO: renamed from: Ooooooo, reason: collision with root package name */
        public static final OooO0o f86226Ooooooo = new OooO0o("offset", 39);

        /* JADX INFO: renamed from: o0OoOo0, reason: collision with root package name */
        public static final OooO0o f86273o0OoOo0 = new OooO0o("opacity", 40);

        /* JADX INFO: renamed from: ooOO, reason: collision with root package name */
        public static final OooO0o f86279ooOO = new OooO0o("orient", 41);

        /* JADX INFO: renamed from: o00O0O, reason: collision with root package name */
        public static final OooO0o f86262o00O0O = new OooO0o("overflow", 42);

        /* JADX INFO: renamed from: o00Oo0, reason: collision with root package name */
        public static final OooO0o f86263o00Oo0 = new OooO0o("pathLength", 43);

        /* JADX INFO: renamed from: o00Ooo, reason: collision with root package name */
        public static final OooO0o f86264o00Ooo = new OooO0o("patternContentUnits", 44);

        /* JADX INFO: renamed from: o00o0O, reason: collision with root package name */
        public static final OooO0o f86265o00o0O = new OooO0o("patternTransform", 45);

        /* JADX INFO: renamed from: o00ooo, reason: collision with root package name */
        public static final OooO0o f86268o00ooo = new OooO0o("patternUnits", 46);

        /* JADX INFO: renamed from: oo000o, reason: collision with root package name */
        public static final OooO0o f86277oo000o = new OooO0o("points", 47);

        /* JADX INFO: renamed from: o00oO0o, reason: collision with root package name */
        public static final OooO0o f86267o00oO0o = new OooO0o("preserveAspectRatio", 48);

        /* JADX INFO: renamed from: o00oO0O, reason: collision with root package name */
        public static final OooO0o f86266o00oO0O = new OooO0o("r", 49);

        /* JADX INFO: renamed from: o0ooOO0, reason: collision with root package name */
        public static final OooO0o f86274o0ooOO0 = new OooO0o("refX", 50);

        /* JADX INFO: renamed from: o0ooOOo, reason: collision with root package name */
        public static final OooO0o f86275o0ooOOo = new OooO0o("refY", 51);

        /* JADX INFO: renamed from: o0ooOoO, reason: collision with root package name */
        public static final OooO0o f86276o0ooOoO = new OooO0o("requiredFeatures", 52);

        /* JADX INFO: renamed from: o0OOO0o, reason: collision with root package name */
        public static final OooO0o f86271o0OOO0o = new OooO0o("requiredExtensions", 53);

        /* JADX INFO: renamed from: o0Oo0oo, reason: collision with root package name */
        public static final OooO0o f86272o0Oo0oo = new OooO0o("requiredFormats", 54);

        /* JADX INFO: renamed from: o0OO00O, reason: collision with root package name */
        public static final OooO0o f86270o0OO00O = new OooO0o("requiredFonts", 55);

        /* JADX INFO: renamed from: oo0o0Oo, reason: collision with root package name */
        public static final OooO0o f86278oo0o0Oo = new OooO0o("rx", 56);

        /* JADX INFO: renamed from: o0O0O00, reason: collision with root package name */
        public static final OooO0o f86269o0O0O00 = new OooO0o("ry", 57);

        /* JADX INFO: renamed from: o000OOo, reason: collision with root package name */
        public static final OooO0o f86260o000OOo = new OooO0o("solid_color", 58);

        /* JADX INFO: renamed from: o000000, reason: collision with root package name */
        public static final OooO0o f86229o000000 = new OooO0o("solid_opacity", 59);

        /* JADX INFO: renamed from: o000000O, reason: collision with root package name */
        public static final OooO0o f86230o000000O = new OooO0o("spreadMethod", 60);

        /* JADX INFO: renamed from: o000000o, reason: collision with root package name */
        public static final OooO0o f86231o000000o = new OooO0o("startOffset", 61);

        /* JADX INFO: renamed from: o00000, reason: collision with root package name */
        public static final OooO0o f86228o00000 = new OooO0o("stop_color", 62);

        /* JADX INFO: renamed from: o00000O0, reason: collision with root package name */
        public static final OooO0o f86233o00000O0 = new OooO0o("stop_opacity", 63);

        /* JADX INFO: renamed from: o00000O, reason: collision with root package name */
        public static final OooO0o f86232o00000O = new OooO0o("stroke", 64);

        /* JADX INFO: renamed from: o00000OO, reason: collision with root package name */
        public static final OooO0o f86234o00000OO = new OooO0o("stroke_dasharray", 65);

        /* JADX INFO: renamed from: o00000Oo, reason: collision with root package name */
        public static final OooO0o f86235o00000Oo = new OooO0o("stroke_dashoffset", 66);

        /* JADX INFO: renamed from: o00000o0, reason: collision with root package name */
        public static final OooO0o f86236o00000o0 = new OooO0o("stroke_linecap", 67);

        /* JADX INFO: renamed from: o0000Ooo, reason: collision with root package name */
        public static final OooO0o f86249o0000Ooo = new OooO0o("stroke_linejoin", 68);

        /* JADX INFO: renamed from: o00000oO, reason: collision with root package name */
        public static final OooO0o f86237o00000oO = new OooO0o("stroke_miterlimit", 69);

        /* JADX INFO: renamed from: o00000oo, reason: collision with root package name */
        public static final OooO0o f86238o00000oo = new OooO0o("stroke_opacity", 70);

        /* JADX INFO: renamed from: o0000, reason: collision with root package name */
        public static final OooO0o f86227o0000 = new OooO0o("stroke_width", 71);

        /* JADX INFO: renamed from: o0000O00, reason: collision with root package name */
        public static final OooO0o f86240o0000O00 = new OooO0o("style", 72);

        /* JADX INFO: renamed from: o0000oo, reason: collision with root package name */
        public static final OooO0o f86257o0000oo = new OooO0o("systemLanguage", 73);

        /* JADX INFO: renamed from: o0000oO, reason: collision with root package name */
        public static final OooO0o f86253o0000oO = new OooO0o("text_anchor", 74);
        public static final OooO0o o0000O0 = new OooO0o("text_decoration", 75);

        /* JADX INFO: renamed from: o0000O0O, reason: collision with root package name */
        public static final OooO0o f86241o0000O0O = new OooO0o("transform", 76);

        /* JADX INFO: renamed from: o000OO, reason: collision with root package name */
        public static final OooO0o f86259o000OO = new OooO0o(C18437z2.f56754h, 77);

        /* JADX INFO: renamed from: o0000O, reason: collision with root package name */
        public static final OooO0o f86239o0000O = new OooO0o("vector_effect", 78);

        /* JADX INFO: renamed from: o0000OO0, reason: collision with root package name */
        public static final OooO0o f86243o0000OO0 = new OooO0o("version", 79);

        /* JADX INFO: renamed from: o0000OO, reason: collision with root package name */
        public static final OooO0o f86242o0000OO = new OooO0o("viewBox", 80);

        /* JADX INFO: renamed from: o0000OOO, reason: collision with root package name */
        public static final OooO0o f86244o0000OOO = new OooO0o("width", 81);

        /* JADX INFO: renamed from: o0000OOo, reason: collision with root package name */
        public static final OooO0o f86245o0000OOo = new OooO0o("x", 82);

        /* JADX INFO: renamed from: o0000Oo0, reason: collision with root package name */
        public static final OooO0o f86247o0000Oo0 = new OooO0o("y", 83);

        /* JADX INFO: renamed from: o0000Oo, reason: collision with root package name */
        public static final OooO0o f86246o0000Oo = new OooO0o("x1", 84);

        /* JADX INFO: renamed from: o0000OoO, reason: collision with root package name */
        public static final OooO0o f86248o0000OoO = new OooO0o("y1", 85);
        public static final OooO0o o0000o0 = new OooO0o("x2", 86);

        /* JADX INFO: renamed from: o0000o0O, reason: collision with root package name */
        public static final OooO0o f86251o0000o0O = new OooO0o("y2", 87);

        /* JADX INFO: renamed from: o0000o0o, reason: collision with root package name */
        public static final OooO0o f86252o0000o0o = new OooO0o("viewport_fill", 88);

        /* JADX INFO: renamed from: o0000o, reason: collision with root package name */
        public static final OooO0o f86250o0000o = new OooO0o("viewport_fill_opacity", 89);

        /* JADX INFO: renamed from: o0000oO0, reason: collision with root package name */
        public static final OooO0o f86254o0000oO0 = new OooO0o("visibility", 90);

        /* JADX INFO: renamed from: o0000oOO, reason: collision with root package name */
        public static final OooO0o f86255o0000oOO = new OooO0o("UNSUPPORTED", 91);

        /* JADX INFO: renamed from: o0000oo0, reason: collision with root package name */
        public static final /* synthetic */ OooO0o[] f86258o0000oo0 = {f86189OooOo0o, f86188OooOo, f86191OooOoO0, f86190OooOoO, f86192OooOoOO, f86194OooOoo0, f86193OooOoo, f86195OooOooO, f86196OooOooo, f86199Oooo000, f86200Oooo00O, f86201Oooo00o, f86198Oooo0, f86202Oooo0O0, f86203Oooo0OO, f86205Oooo0o0, f86204Oooo0o, f86206Oooo0oO, f86207Oooo0oo, f86197Oooo, f86210OoooO00, f86209OoooO0, f86211OoooO0O, f86208OoooO, f86212OoooOO0, f86261o000oOoO, f86213OoooOOO, f86214OoooOOo, f86215OoooOo0, f86216OoooOoO, f86217OoooOoo, f86218Ooooo00, f86219Ooooo0o, f86220OooooO0, f86221OooooOO, f86222OooooOo, f86224Oooooo0, f86223Oooooo, f86225OoooooO, f86226Ooooooo, f86273o0OoOo0, f86279ooOO, f86262o00O0O, f86263o00Oo0, f86264o00Ooo, f86265o00o0O, f86268o00ooo, f86277oo000o, f86267o00oO0o, f86266o00oO0O, f86274o0ooOO0, f86275o0ooOOo, f86276o0ooOoO, f86271o0OOO0o, f86272o0Oo0oo, f86270o0OO00O, f86278oo0o0Oo, f86269o0O0O00, f86260o000OOo, f86229o000000, f86230o000000O, f86231o000000o, f86228o00000, f86233o00000O0, f86232o00000O, f86234o00000OO, f86235o00000Oo, f86236o00000o0, f86249o0000Ooo, f86237o00000oO, f86238o00000oo, f86227o0000, f86240o0000O00, f86257o0000oo, f86253o0000oO, o0000O0, f86241o0000O0O, f86259o000OO, f86239o0000O, f86243o0000OO0, f86242o0000OO, f86244o0000OOO, f86245o0000OOo, f86247o0000Oo0, f86246o0000Oo, f86248o0000OoO, o0000o0, f86251o0000o0O, f86252o0000o0o, f86250o0000o, f86254o0000oO0, f86255o0000oOO};

        /* JADX INFO: renamed from: o0000oOo, reason: collision with root package name */
        public static final HashMap f86256o0000oOo = new HashMap();

        static {
            for (OooO0o oooO0o : values()) {
                if (oooO0o == f86189OooOo0o) {
                    f86256o0000oOo.put("class", oooO0o);
                } else if (oooO0o != f86255o0000oOO) {
                    f86256o0000oOo.put(oooO0o.name().replace('_', '-'), oooO0o);
                }
            }
        }

        public OooO0o() {
            throw null;
        }

        public static OooO0o OooO00o(String str) {
            OooO0o oooO0o = (OooO0o) f86256o0000oOo.get(str);
            return oooO0o != null ? oooO0o : f86255o0000oOO;
        }

        public static OooO0o valueOf(String str) {
            return (OooO0o) Enum.valueOf(OooO0o.class, str);
        }

        public static OooO0o[] values() {
            return (OooO0o[]) f86258o0000oo0.clone();
        }
    }

    /* JADX INFO: renamed from: o00o0OO0.OooO$OooO0o0, reason: case insensitive filesystem */
    public class C25330OooO0o0 extends DefaultHandler2 {
        public C25330OooO0o0() {
        }

        @Override // org.xml.sax.helpers.DefaultHandler, org.xml.sax.ContentHandler
        public final void characters(char[] cArr, int i, int i2) throws SAXException {
            C25328OooO.this.Oooo00O(new String(cArr, i, i2));
        }

        @Override // org.xml.sax.helpers.DefaultHandler, org.xml.sax.ContentHandler
        public final void endDocument() throws SAXException {
            C25328OooO.this.getClass();
        }

        @Override // org.xml.sax.helpers.DefaultHandler, org.xml.sax.ContentHandler
        public final void endElement(String str, String str2, String str3) throws SAXException {
            C25328OooO.this.OooO0OO(str, str2, str3);
        }

        @Override // org.xml.sax.helpers.DefaultHandler, org.xml.sax.ContentHandler
        public final void processingInstruction(String str, String str2) throws SAXException {
            C25332OooO0oo c25332OooO0oo = new C25332OooO0oo(str2);
            C25328OooO.this.getClass();
            C25328OooO.OooOoO(c25332OooO0oo);
            str.equals("xml-stylesheet");
        }

        @Override // org.xml.sax.helpers.DefaultHandler, org.xml.sax.ContentHandler
        public final void startDocument() throws SAXException {
            C25328OooO c25328OooO = C25328OooO.this;
            c25328OooO.getClass();
            c25328OooO.f86175OooO00o = new C25345OooO0o();
        }

        @Override // org.xml.sax.helpers.DefaultHandler, org.xml.sax.ContentHandler
        public final void startElement(String str, String str2, String str3, Attributes attributes) throws SAXException {
            C25328OooO.this.Oooo000(str, str2, str3, attributes);
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* JADX INFO: renamed from: o00o0OO0.OooO$OooO0oO, reason: case insensitive filesystem */
    public static final class EnumC25331OooO0oO {

        /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
        public static final EnumC25331OooO0oO f86281OooOo;

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public static final EnumC25331OooO0oO f86282OooOo0o;

        /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
        public static final EnumC25331OooO0oO f86283OooOoO;

        /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
        public static final EnumC25331OooO0oO f86284OooOoO0;

        /* JADX INFO: renamed from: OooOoOO, reason: collision with root package name */
        public static final HashMap f86285OooOoOO;

        /* JADX INFO: renamed from: OooOoo0, reason: collision with root package name */
        public static final /* synthetic */ EnumC25331OooO0oO[] f86286OooOoo0;

        /* JADX INFO: Fake field, exist only in values array */
        EnumC25331OooO0oO EF1;

        static {
            EnumC25331OooO0oO enumC25331OooO0oO = new EnumC25331OooO0oO("svg", 0);
            EnumC25331OooO0oO enumC25331OooO0oO2 = new EnumC25331OooO0oO("a", 1);
            EnumC25331OooO0oO enumC25331OooO0oO3 = new EnumC25331OooO0oO("circle", 2);
            EnumC25331OooO0oO enumC25331OooO0oO4 = new EnumC25331OooO0oO("clipPath", 3);
            EnumC25331OooO0oO enumC25331OooO0oO5 = new EnumC25331OooO0oO("defs", 4);
            EnumC25331OooO0oO enumC25331OooO0oO6 = new EnumC25331OooO0oO("desc", 5);
            f86282OooOo0o = enumC25331OooO0oO6;
            EnumC25331OooO0oO enumC25331OooO0oO7 = new EnumC25331OooO0oO("ellipse", 6);
            EnumC25331OooO0oO enumC25331OooO0oO8 = new EnumC25331OooO0oO("g", 7);
            EnumC25331OooO0oO enumC25331OooO0oO9 = new EnumC25331OooO0oO("image", 8);
            EnumC25331OooO0oO enumC25331OooO0oO10 = new EnumC25331OooO0oO("line", 9);
            EnumC25331OooO0oO enumC25331OooO0oO11 = new EnumC25331OooO0oO("linearGradient", 10);
            EnumC25331OooO0oO enumC25331OooO0oO12 = new EnumC25331OooO0oO(RequestParameters.MARKER, 11);
            EnumC25331OooO0oO enumC25331OooO0oO13 = new EnumC25331OooO0oO("mask", 12);
            EnumC25331OooO0oO enumC25331OooO0oO14 = new EnumC25331OooO0oO("path", 13);
            EnumC25331OooO0oO enumC25331OooO0oO15 = new EnumC25331OooO0oO("pattern", 14);
            EnumC25331OooO0oO enumC25331OooO0oO16 = new EnumC25331OooO0oO("polygon", 15);
            EnumC25331OooO0oO enumC25331OooO0oO17 = new EnumC25331OooO0oO("polyline", 16);
            EnumC25331OooO0oO enumC25331OooO0oO18 = new EnumC25331OooO0oO("radialGradient", 17);
            EnumC25331OooO0oO enumC25331OooO0oO19 = new EnumC25331OooO0oO(DrawToolFactory.LASSO_TYPE_RECT, 18);
            EnumC25331OooO0oO enumC25331OooO0oO20 = new EnumC25331OooO0oO("solidColor", 19);
            EnumC25331OooO0oO enumC25331OooO0oO21 = new EnumC25331OooO0oO("stop", 20);
            EnumC25331OooO0oO enumC25331OooO0oO22 = new EnumC25331OooO0oO("style", 21);
            EnumC25331OooO0oO enumC25331OooO0oO23 = new EnumC25331OooO0oO("SWITCH", 22);
            f86281OooOo = enumC25331OooO0oO23;
            EnumC25331OooO0oO enumC25331OooO0oO24 = new EnumC25331OooO0oO("symbol", 23);
            EnumC25331OooO0oO enumC25331OooO0oO25 = new EnumC25331OooO0oO("text", 24);
            EnumC25331OooO0oO enumC25331OooO0oO26 = new EnumC25331OooO0oO("textPath", 25);
            EnumC25331OooO0oO enumC25331OooO0oO27 = new EnumC25331OooO0oO(NoteMeta.PROPERTY_TITLE, 26);
            f86284OooOoO0 = enumC25331OooO0oO27;
            EnumC25331OooO0oO enumC25331OooO0oO28 = new EnumC25331OooO0oO("tref", 27);
            EnumC25331OooO0oO enumC25331OooO0oO29 = new EnumC25331OooO0oO("tspan", 28);
            EnumC25331OooO0oO enumC25331OooO0oO30 = new EnumC25331OooO0oO(AbstractJwtRequest.ClaimNames.USE, 29);
            EnumC25331OooO0oO enumC25331OooO0oO31 = new EnumC25331OooO0oO("view", 30);
            EnumC25331OooO0oO enumC25331OooO0oO32 = new EnumC25331OooO0oO("UNSUPPORTED", 31);
            f86283OooOoO = enumC25331OooO0oO32;
            f86286OooOoo0 = new EnumC25331OooO0oO[]{enumC25331OooO0oO, enumC25331OooO0oO2, enumC25331OooO0oO3, enumC25331OooO0oO4, enumC25331OooO0oO5, enumC25331OooO0oO6, enumC25331OooO0oO7, enumC25331OooO0oO8, enumC25331OooO0oO9, enumC25331OooO0oO10, enumC25331OooO0oO11, enumC25331OooO0oO12, enumC25331OooO0oO13, enumC25331OooO0oO14, enumC25331OooO0oO15, enumC25331OooO0oO16, enumC25331OooO0oO17, enumC25331OooO0oO18, enumC25331OooO0oO19, enumC25331OooO0oO20, enumC25331OooO0oO21, enumC25331OooO0oO22, enumC25331OooO0oO23, enumC25331OooO0oO24, enumC25331OooO0oO25, enumC25331OooO0oO26, enumC25331OooO0oO27, enumC25331OooO0oO28, enumC25331OooO0oO29, enumC25331OooO0oO30, enumC25331OooO0oO31, enumC25331OooO0oO32};
            f86285OooOoOO = new HashMap();
            for (EnumC25331OooO0oO enumC25331OooO0oO33 : values()) {
                if (enumC25331OooO0oO33 == f86281OooOo) {
                    f86285OooOoOO.put("switch", enumC25331OooO0oO33);
                } else if (enumC25331OooO0oO33 != f86283OooOoO) {
                    f86285OooOoOO.put(enumC25331OooO0oO33.name(), enumC25331OooO0oO33);
                }
            }
        }

        public EnumC25331OooO0oO() {
            throw null;
        }

        public static EnumC25331OooO0oO valueOf(String str) {
            return (EnumC25331OooO0oO) Enum.valueOf(EnumC25331OooO0oO.class, str);
        }

        public static EnumC25331OooO0oO[] values() {
            return (EnumC25331OooO0oO[]) f86286OooOoo0.clone();
        }
    }

    /* JADX INFO: renamed from: o00o0OO0.OooO$OooO0oo, reason: case insensitive filesystem */
    public static class C25332OooO0oo {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final String f86287OooO00o;

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        public final int f86289OooO0OO;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public int f86288OooO0O0 = 0;

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final C25344OooO0Oo f86290OooO0Oo = new C25344OooO0Oo();

        public C25332OooO0oo(String str) {
            this.f86289OooO0OO = 0;
            String strTrim = str.trim();
            this.f86287OooO00o = strTrim;
            this.f86289OooO0OO = strTrim.length();
        }

        public static boolean OooO0oO(int i) {
            return i == 32 || i == 10 || i == 13 || i == 9;
        }

        public final float OooO() {
            int i = this.f86288OooO0O0;
            int i2 = this.f86289OooO0OO;
            C25344OooO0Oo c25344OooO0Oo = this.f86290OooO0Oo;
            float fOooO00o = c25344OooO0Oo.OooO00o(i, i2, this.f86287OooO00o);
            if (!Float.isNaN(fOooO00o)) {
                this.f86288OooO0O0 = c25344OooO0Oo.f86342OooO00o;
            }
            return fOooO00o;
        }

        public final int OooO00o() {
            int i = this.f86288OooO0O0;
            int i2 = this.f86289OooO0OO;
            if (i == i2) {
                return -1;
            }
            int i3 = i + 1;
            this.f86288OooO0O0 = i3;
            if (i3 < i2) {
                return this.f86287OooO00o.charAt(i3);
            }
            return -1;
        }

        public final Boolean OooO0O0(Object obj) {
            if (obj == null) {
                return null;
            }
            OooOOOo();
            int i = this.f86288OooO0O0;
            if (i == this.f86289OooO0OO) {
                return null;
            }
            char cCharAt = this.f86287OooO00o.charAt(i);
            if (cCharAt != '0' && cCharAt != '1') {
                return null;
            }
            this.f86288OooO0O0++;
            return Boolean.valueOf(cCharAt == '1');
        }

        public final float OooO0OO(float f) {
            if (Float.isNaN(f)) {
                return Float.NaN;
            }
            OooOOOo();
            return OooO();
        }

        public final boolean OooO0Oo(char c) {
            int i = this.f86288OooO0O0;
            boolean z = i < this.f86289OooO0OO && this.f86287OooO00o.charAt(i) == c;
            if (z) {
                this.f86288OooO0O0++;
            }
            return z;
        }

        public final boolean OooO0o() {
            return this.f86288OooO0O0 == this.f86289OooO0OO;
        }

        public final boolean OooO0o0(String str) {
            int length = str.length();
            int i = this.f86288OooO0O0;
            boolean z = i <= this.f86289OooO0OO - length && this.f86287OooO00o.substring(i, i + length).equals(str);
            if (z) {
                this.f86288OooO0O0 += length;
            }
            return z;
        }

        public final Integer OooO0oo() {
            int i = this.f86288OooO0O0;
            if (i == this.f86289OooO0OO) {
                return null;
            }
            this.f86288OooO0O0 = i + 1;
            return Integer.valueOf(this.f86287OooO00o.charAt(i));
        }

        public final C25345OooO0o.OooOOOO OooOO0() {
            float fOooO = OooO();
            if (Float.isNaN(fOooO)) {
                return null;
            }
            C25345OooO0o.EnumC25388Ooooo0o enumC25388Ooooo0oOooOOO = OooOOO();
            return enumC25388Ooooo0oOooOOO == null ? new C25345OooO0o.OooOOOO(fOooO, C25345OooO0o.EnumC25388Ooooo0o.f86540OooOo0o) : new C25345OooO0o.OooOOOO(fOooO, enumC25388Ooooo0oOooOOO);
        }

        public final String OooOO0O() {
            if (OooO0o()) {
                return null;
            }
            int i = this.f86288OooO0O0;
            String str = this.f86287OooO00o;
            char cCharAt = str.charAt(i);
            if (cCharAt != '\'' && cCharAt != '\"') {
                return null;
            }
            int iOooO00o = OooO00o();
            while (iOooO00o != -1 && iOooO00o != cCharAt) {
                iOooO00o = OooO00o();
            }
            if (iOooO00o == -1) {
                this.f86288OooO0O0 = i;
                return null;
            }
            int i2 = this.f86288OooO0O0;
            this.f86288OooO0O0 = i2 + 1;
            return str.substring(i + 1, i2);
        }

        public final String OooOO0o() {
            return OooOOO0(ControlChar.SPACE_CHAR, false);
        }

        public final C25345OooO0o.EnumC25388Ooooo0o OooOOO() {
            if (OooO0o()) {
                return null;
            }
            int i = this.f86288OooO0O0;
            String str = this.f86287OooO00o;
            if (str.charAt(i) == '%') {
                this.f86288OooO0O0++;
                return C25345OooO0o.EnumC25388Ooooo0o.f86542OooOoO0;
            }
            int i2 = this.f86288OooO0O0;
            if (i2 > this.f86289OooO0OO - 2) {
                return null;
            }
            try {
                C25345OooO0o.EnumC25388Ooooo0o enumC25388Ooooo0oValueOf = C25345OooO0o.EnumC25388Ooooo0o.valueOf(str.substring(i2, i2 + 2).toLowerCase(Locale.US));
                this.f86288OooO0O0 += 2;
                return enumC25388Ooooo0oValueOf;
            } catch (IllegalArgumentException unused) {
                return null;
            }
        }

        public final String OooOOO0(char c, boolean z) {
            if (OooO0o()) {
                return null;
            }
            int i = this.f86288OooO0O0;
            String str = this.f86287OooO00o;
            char cCharAt = str.charAt(i);
            if ((!z && OooO0oO(cCharAt)) || cCharAt == c) {
                return null;
            }
            int i2 = this.f86288OooO0O0;
            int iOooO00o = OooO00o();
            while (iOooO00o != -1 && iOooO00o != c && (z || !OooO0oO(iOooO00o))) {
                iOooO00o = OooO00o();
            }
            return str.substring(i2, this.f86288OooO0O0);
        }

        public final float OooOOOO() {
            OooOOOo();
            int i = this.f86288OooO0O0;
            int i2 = this.f86289OooO0OO;
            C25344OooO0Oo c25344OooO0Oo = this.f86290OooO0Oo;
            float fOooO00o = c25344OooO0Oo.OooO00o(i, i2, this.f86287OooO00o);
            if (!Float.isNaN(fOooO00o)) {
                this.f86288OooO0O0 = c25344OooO0Oo.f86342OooO00o;
            }
            return fOooO00o;
        }

        public final boolean OooOOOo() {
            OooOOo0();
            int i = this.f86288OooO0O0;
            if (i == this.f86289OooO0OO || this.f86287OooO00o.charAt(i) != ',') {
                return false;
            }
            this.f86288OooO0O0++;
            OooOOo0();
            return true;
        }

        public final void OooOOo0() {
            while (true) {
                int i = this.f86288OooO0O0;
                if (i >= this.f86289OooO0OO || !OooO0oO(this.f86287OooO00o.charAt(i))) {
                    return;
                } else {
                    this.f86288OooO0O0++;
                }
            }
        }
    }

    public static void OooO(C25345OooO0o.OooO oooO, Attributes attributes) throws C25396OooO0oo {
        for (int i = 0; i < attributes.getLength(); i++) {
            String strTrim = attributes.getValue(i).trim();
            int iOooO00o = com.aspose.slides.internal.p472w8.OooO00o.OooO00o(attributes, i);
            if (iOooO00o == 23) {
                oooO.f86348OooOO0 = OooOoOO(strTrim);
            } else if (iOooO00o != 24) {
                if (iOooO00o != 26) {
                    if (iOooO00o != 60) {
                        continue;
                    } else {
                        try {
                            oooO.f86349OooOO0O = C25345OooO0o.OooOO0.valueOf(strTrim);
                        } catch (IllegalArgumentException unused) {
                            throw new C25396OooO0oo(C20593OooO0Oo.OooO0O0("Invalid spreadMethod attribute. \"", strTrim, "\" is not a valid value."));
                        }
                    }
                } else if ("".equals(attributes.getURI(i)) || "http://www.w3.org/1999/xlink".equals(attributes.getURI(i))) {
                    oooO.f86350OooOO0o = strTrim;
                }
            } else if ("objectBoundingBox".equals(strTrim)) {
                oooO.f86346OooO = Boolean.FALSE;
            } else {
                if (!"userSpaceOnUse".equals(strTrim)) {
                    throw new C25396OooO0oo("Invalid value for attribute gradientUnits");
                }
                oooO.f86346OooO = Boolean.TRUE;
            }
        }
    }

    public static int OooO0O0(float f) {
        if (f < 0.0f) {
            return 0;
        }
        if (f > 255.0f) {
            return 255;
        }
        return Math.round(f);
    }

    public static int OooO0Oo(float f, float f2, float f3) {
        float f4 = f % 360.0f;
        if (f < 0.0f) {
            f4 += 360.0f;
        }
        float f5 = f4 / 60.0f;
        float f6 = f2 / 100.0f;
        float f7 = f3 / 100.0f;
        if (f6 < 0.0f) {
            f6 = 0.0f;
        } else if (f6 > 1.0f) {
            f6 = 1.0f;
        }
        float f8 = f7 >= 0.0f ? f7 > 1.0f ? 1.0f : f7 : 0.0f;
        float f9 = f8 <= 0.5f ? (f6 + 1.0f) * f8 : (f8 + f6) - (f6 * f8);
        float f10 = (f8 * 2.0f) - f9;
        return OooO0O0(OooO0o0(f10, f9, f5 - 2.0f) * 256.0f) | (OooO0O0(OooO0o0(f10, f9, f5 + 2.0f) * 256.0f) << 16) | (OooO0O0(OooO0o0(f10, f9, f5) * 256.0f) << 8);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v1, types: [float, void] */
    /* JADX WARN: Type inference failed for: r2v2, types: [float, void] */
    /* JADX WARN: Type inference failed for: r4v2, types: [byte[], float] */
    /* JADX WARN: Type inference failed for: r4v7 */
    /* JADX WARN: Type inference failed for: r4v8 */
    public static float OooO0o0(float f, float f2, float f3) {
        float f4 = f3;
        if (f3 < 0.0f) {
            f4 = f3 + 6.0f;
        }
        ?? r4 = f4;
        if (f4 >= 6.0f) {
            r4 = f4 - 6.0f;
        }
        if (r4 < 1.0f) {
            return Bundle.putByteArray(f2, f);
        }
        if (r4 < 3.0f) {
            return f2;
        }
        if (r4 >= 4.0f) {
            return f;
        }
        float f5 = f2 - f;
        return Bundle.putByteArray(1082130432, r4);
    }

    public static void OooO0oO(C25345OooO0o.Oooo000 oooo000, Attributes attributes) throws C25396OooO0oo {
        for (int i = 0; i < attributes.getLength(); i++) {
            String strTrim = attributes.getValue(i).trim();
            int iOooO00o = com.aspose.slides.internal.p472w8.OooO00o.OooO00o(attributes, i);
            if (iOooO00o != 73) {
                switch (iOooO00o) {
                    case 52:
                        C25332OooO0oo c25332OooO0oo = new C25332OooO0oo(strTrim);
                        HashSet hashSet = new HashSet();
                        while (!c25332OooO0oo.OooO0o()) {
                            String strOooOO0o = c25332OooO0oo.OooOO0o();
                            if (strOooOO0o.startsWith("http://www.w3.org/TR/SVG11/feature#")) {
                                hashSet.add(strOooOO0o.substring(35));
                            } else {
                                hashSet.add("UNSUPPORTED");
                            }
                            c25332OooO0oo.OooOOo0();
                        }
                        oooo000.OooO0oO(hashSet);
                        break;
                    case 53:
                        oooo000.OooOO0(strTrim);
                        break;
                    case 54:
                        C25332OooO0oo c25332OooO0oo2 = new C25332OooO0oo(strTrim);
                        HashSet hashSet2 = new HashSet();
                        while (!c25332OooO0oo2.OooO0o()) {
                            hashSet2.add(c25332OooO0oo2.OooOO0o());
                            c25332OooO0oo2.OooOOo0();
                        }
                        oooo000.OooO0Oo(hashSet2);
                        break;
                    case 55:
                        ArrayList arrayListOooOOo = OooOOo(strTrim);
                        oooo000.OooO(arrayListOooOOo != null ? new HashSet(arrayListOooOOo) : new HashSet(0));
                        break;
                }
            } else {
                C25332OooO0oo c25332OooO0oo3 = new C25332OooO0oo(strTrim);
                HashSet hashSet3 = new HashSet();
                while (!c25332OooO0oo3.OooO0o()) {
                    String strOooOO0o2 = c25332OooO0oo3.OooOO0o();
                    int iIndexOf = strOooOO0o2.indexOf(45);
                    if (iIndexOf != -1) {
                        strOooOO0o2 = strOooOO0o2.substring(0, iIndexOf);
                    }
                    hashSet3.add(new Locale(strOooOO0o2, "", "").getLanguage());
                    c25332OooO0oo3.OooOOo0();
                }
                oooo000.OooO0oo(hashSet3);
            }
        }
    }

    public static void OooO0oo(C25345OooO0o.AbstractC25373Oooo0OO abstractC25373Oooo0OO, Attributes attributes) throws C25396OooO0oo {
        for (int i = 0; i < attributes.getLength(); i++) {
            String qName = attributes.getQName(i);
            if (qName.equals("id") || qName.equals("xml:id")) {
                abstractC25373Oooo0OO.f86515OooO0OO = attributes.getValue(i).trim();
                return;
            }
            if (qName.equals("xml:space")) {
                String strTrim = attributes.getValue(i).trim();
                if ("default".equals(strTrim)) {
                    abstractC25373Oooo0OO.f86516OooO0Oo = Boolean.FALSE;
                    return;
                } else {
                    if (!"preserve".equals(strTrim)) {
                        throw new C25396OooO0oo(com.alibaba.sdk.android.oss.internal.OooO00o.OooO00o("Invalid value for \"xml:space\" attribute: ", strTrim));
                    }
                    abstractC25373Oooo0OO.f86516OooO0Oo = Boolean.TRUE;
                    return;
                }
            }
        }
    }

    public static void OooOO0(C25345OooO0o.C25359OooOoO0 c25359OooOoO0, Attributes attributes, String str) throws C25396OooO0oo {
        for (int i = 0; i < attributes.getLength(); i++) {
            if (OooO0o.OooO00o(attributes.getLocalName(i)) == OooO0o.f86277oo000o) {
                C25332OooO0oo c25332OooO0oo = new C25332OooO0oo(attributes.getValue(i));
                ArrayList arrayList = new ArrayList();
                c25332OooO0oo.OooOOo0();
                while (!c25332OooO0oo.OooO0o()) {
                    float fOooO = c25332OooO0oo.OooO();
                    if (Float.isNaN(fOooO)) {
                        throw new C25396OooO0oo(C20593OooO0Oo.OooO0O0("Invalid <", str, "> points attribute. Non-coordinate content found in list."));
                    }
                    c25332OooO0oo.OooOOOo();
                    float fOooO2 = c25332OooO0oo.OooO();
                    if (Float.isNaN(fOooO2)) {
                        throw new C25396OooO0oo(C20593OooO0Oo.OooO0O0("Invalid <", str, "> points attribute. There should be an even number of coordinates."));
                    }
                    c25332OooO0oo.OooOOOo();
                    arrayList.add(Float.valueOf(fOooO));
                    arrayList.add(Float.valueOf(fOooO2));
                }
                c25359OooOoO0.f86413OooOOOO = new float[arrayList.size()];
                Iterator it = arrayList.iterator();
                int i2 = 0;
                while (it.hasNext()) {
                    c25359OooOoO0.f86413OooOOOO[i2] = ((Float) it.next()).floatValue();
                    i2++;
                }
            }
        }
    }

    public static void OooOO0O(C25345OooO0o.AbstractC25373Oooo0OO abstractC25373Oooo0OO, Attributes attributes) throws C25396OooO0oo {
        for (int i = 0; i < attributes.getLength(); i++) {
            String strTrim = attributes.getValue(i).trim();
            if (strTrim.length() != 0) {
                int iOooO00o = com.aspose.slides.internal.p472w8.OooO00o.OooO00o(attributes, i);
                if (iOooO00o == 0) {
                    C25334OooO0O0.OooO0OO oooO0OO = new C25334OooO0O0.OooO0OO(strTrim);
                    ArrayList arrayList = null;
                    while (!oooO0OO.OooO0o()) {
                        String strOooOO0o = oooO0OO.OooOO0o();
                        if (strOooOO0o != null) {
                            if (arrayList == null) {
                                arrayList = new ArrayList();
                            }
                            arrayList.add(strOooOO0o);
                            oooO0OO.OooOOo0();
                        }
                    }
                    abstractC25373Oooo0OO.f86519OooO0oO = arrayList;
                } else if (iOooO00o != 72) {
                    if (abstractC25373Oooo0OO.f86518OooO0o0 == null) {
                        abstractC25373Oooo0OO.f86518OooO0o0 = new C25345OooO0o.C25363OooOooO();
                    }
                    OooOooo(abstractC25373Oooo0OO.f86518OooO0o0, attributes.getLocalName(i), attributes.getValue(i).trim());
                } else {
                    C25332OooO0oo c25332OooO0oo = new C25332OooO0oo(strTrim.replaceAll("/\\*.*?\\*/", ""));
                    while (true) {
                        String strOooOOO0 = c25332OooO0oo.OooOOO0(':', false);
                        c25332OooO0oo.OooOOo0();
                        if (!c25332OooO0oo.OooO0Oo(':')) {
                            break;
                        }
                        c25332OooO0oo.OooOOo0();
                        String strOooOOO02 = c25332OooO0oo.OooOOO0(';', true);
                        if (strOooOOO02 == null) {
                            break;
                        }
                        c25332OooO0oo.OooOOo0();
                        if (c25332OooO0oo.OooO0o() || c25332OooO0oo.OooO0Oo(';')) {
                            if (abstractC25373Oooo0OO.f86517OooO0o == null) {
                                abstractC25373Oooo0OO.f86517OooO0o = new C25345OooO0o.C25363OooOooO();
                            }
                            OooOooo(abstractC25373Oooo0OO.f86517OooO0o, strOooOOO0, strOooOOO02);
                            c25332OooO0oo.OooOOo0();
                        }
                    }
                }
            }
        }
    }

    public static void OooOO0o(C25345OooO0o.AbstractC25385OoooOoO abstractC25385OoooOoO, Attributes attributes) throws C25396OooO0oo {
        for (int i = 0; i < attributes.getLength(); i++) {
            String strTrim = attributes.getValue(i).trim();
            int iOooO00o = com.aspose.slides.internal.p472w8.OooO00o.OooO00o(attributes, i);
            if (iOooO00o == 9) {
                abstractC25385OoooOoO.f86536OooOOOo = OooOo0(strTrim);
            } else if (iOooO00o == 10) {
                abstractC25385OoooOoO.f86537OooOOo0 = OooOo0(strTrim);
            } else if (iOooO00o == 82) {
                abstractC25385OoooOoO.f86534OooOOO = OooOo0(strTrim);
            } else if (iOooO00o == 83) {
                abstractC25385OoooOoO.f86535OooOOOO = OooOo0(strTrim);
            }
        }
    }

    public static void OooOOO(C25345OooO0o.AbstractC25379OoooO00 abstractC25379OoooO00, Attributes attributes) throws C25396OooO0oo {
        for (int i = 0; i < attributes.getLength(); i++) {
            String strTrim = attributes.getValue(i).trim();
            int iOooO00o = com.aspose.slides.internal.p472w8.OooO00o.OooO00o(attributes, i);
            if (iOooO00o == 48) {
                OooOoO0(abstractC25379OoooO00, strTrim);
            } else if (iOooO00o != 80) {
                continue;
            } else {
                C25332OooO0oo c25332OooO0oo = new C25332OooO0oo(strTrim);
                c25332OooO0oo.OooOOo0();
                float fOooO = c25332OooO0oo.OooO();
                c25332OooO0oo.OooOOOo();
                float fOooO2 = c25332OooO0oo.OooO();
                c25332OooO0oo.OooOOOo();
                float fOooO3 = c25332OooO0oo.OooO();
                c25332OooO0oo.OooOOOo();
                float fOooO4 = c25332OooO0oo.OooO();
                if (Float.isNaN(fOooO) || Float.isNaN(fOooO2) || Float.isNaN(fOooO3) || Float.isNaN(fOooO4)) {
                    throw new C25396OooO0oo("Invalid viewBox definition - should have four numbers");
                }
                if (fOooO3 < 0.0f) {
                    throw new C25396OooO0oo("Invalid viewBox. width cannot be negative");
                }
                if (fOooO4 < 0.0f) {
                    throw new C25396OooO0oo("Invalid viewBox. height cannot be negative");
                }
                abstractC25379OoooO00.f86529OooOOOO = new C25345OooO0o.OooO00o(fOooO, fOooO2, fOooO3, fOooO4);
            }
        }
    }

    public static void OooOOO0(C25345OooO0o.OooOOO0 oooOOO0, Attributes attributes) throws C25396OooO0oo {
        for (int i = 0; i < attributes.getLength(); i++) {
            if (OooO0o.OooO00o(attributes.getLocalName(i)) == OooO0o.f86241o0000O0O) {
                oooOOO0.OooOO0O(OooOoOO(attributes.getValue(i)));
            }
        }
    }

    public static C25345OooO0o.C25347OooO0o0 OooOOOO(String str) throws C25396OooO0oo {
        long j;
        int i;
        if (str.charAt(0) == '#') {
            int length = str.length();
            C25343OooO0OO c25343OooO0OO = null;
            if (1 < length) {
                long j2 = 0;
                int i2 = 1;
                while (i2 < length) {
                    char cCharAt = str.charAt(i2);
                    if (cCharAt < '0' || cCharAt > '9') {
                        if (cCharAt >= 'A' && cCharAt <= 'F') {
                            j = j2 * 16;
                            i = cCharAt - 'A';
                        } else {
                            if (cCharAt < 'a' || cCharAt > 'f') {
                                break;
                            }
                            j = j2 * 16;
                            i = cCharAt - 'a';
                        }
                        j2 = j + ((long) i) + 10;
                    } else {
                        j2 = (j2 * 16) + ((long) (cCharAt - '0'));
                    }
                    if (j2 > 4294967295L) {
                        break;
                    }
                    i2++;
                }
                if (i2 != 1) {
                    c25343OooO0OO = new C25343OooO0OO(j2, i2);
                }
            }
            if (c25343OooO0OO == null) {
                throw new C25396OooO0oo("Bad hex colour value: ".concat(str));
            }
            long j3 = c25343OooO0OO.f86339OooO0O0;
            int i3 = c25343OooO0OO.f86338OooO00o;
            if (i3 == 4) {
                int i4 = (int) j3;
                int i5 = i4 & 3840;
                int i6 = i4 & 240;
                int i7 = i4 & 15;
                return new C25345OooO0o.C25347OooO0o0(i7 | (i5 << 8) | (-16777216) | (i5 << 12) | (i6 << 8) | (i6 << 4) | (i7 << 4));
            }
            if (i3 != 5) {
                if (i3 == 7) {
                    return new C25345OooO0o.C25347OooO0o0(((int) j3) | ViewCompat.MEASURED_STATE_MASK);
                }
                if (i3 != 9) {
                    throw new C25396OooO0oo("Bad hex colour value: ".concat(str));
                }
                int i8 = (int) j3;
                return new C25345OooO0o.C25347OooO0o0((i8 >>> 8) | (i8 << 24));
            }
            int i9 = (int) j3;
            int i10 = 61440 & i9;
            int i11 = i9 & 3840;
            int i12 = i9 & 240;
            int i13 = i9 & 15;
            return new C25345OooO0o.C25347OooO0o0((i13 << 24) | (i13 << 28) | (i10 << 8) | (i10 << 4) | (i11 << 4) | i11 | i12 | (i12 >> 4));
        }
        String lowerCase = str.toLowerCase(Locale.US);
        boolean zStartsWith = lowerCase.startsWith("rgba(");
        if (zStartsWith || lowerCase.startsWith("rgb(")) {
            C25332OooO0oo c25332OooO0oo = new C25332OooO0oo(str.substring(zStartsWith ? 5 : 4));
            c25332OooO0oo.OooOOo0();
            float fOooO = c25332OooO0oo.OooO();
            if (!Float.isNaN(fOooO) && c25332OooO0oo.OooO0Oo('%')) {
                fOooO = (fOooO * 256.0f) / 100.0f;
            }
            float fOooO0OO = c25332OooO0oo.OooO0OO(fOooO);
            if (!Float.isNaN(fOooO0OO) && c25332OooO0oo.OooO0Oo('%')) {
                fOooO0OO = (fOooO0OO * 256.0f) / 100.0f;
            }
            float fOooO0OO2 = c25332OooO0oo.OooO0OO(fOooO0OO);
            if (!Float.isNaN(fOooO0OO2) && c25332OooO0oo.OooO0Oo('%')) {
                fOooO0OO2 = (fOooO0OO2 * 256.0f) / 100.0f;
            }
            if (!zStartsWith) {
                c25332OooO0oo.OooOOo0();
                if (Float.isNaN(fOooO0OO2) || !c25332OooO0oo.OooO0Oo(')')) {
                    throw new C25396OooO0oo("Bad rgb() colour value: ".concat(str));
                }
                return new C25345OooO0o.C25347OooO0o0((OooO0O0(fOooO) << 16) | ViewCompat.MEASURED_STATE_MASK | (OooO0O0(fOooO0OO) << 8) | OooO0O0(fOooO0OO2));
            }
            float fOooO0OO3 = c25332OooO0oo.OooO0OO(fOooO0OO2);
            c25332OooO0oo.OooOOo0();
            if (Float.isNaN(fOooO0OO3) || !c25332OooO0oo.OooO0Oo(')')) {
                throw new C25396OooO0oo("Bad rgba() colour value: ".concat(str));
            }
            return new C25345OooO0o.C25347OooO0o0((OooO0O0(fOooO0OO3 * 256.0f) << 24) | (OooO0O0(fOooO) << 16) | (OooO0O0(fOooO0OO) << 8) | OooO0O0(fOooO0OO2));
        }
        boolean zStartsWith2 = lowerCase.startsWith("hsla(");
        if (!zStartsWith2 && !lowerCase.startsWith("hsl(")) {
            Integer num = (Integer) OooO0O0.f86185OooO00o.get(lowerCase);
            if (num != null) {
                return new C25345OooO0o.C25347OooO0o0(num.intValue());
            }
            throw new C25396OooO0oo("Invalid colour keyword: ".concat(lowerCase));
        }
        C25332OooO0oo c25332OooO0oo2 = new C25332OooO0oo(str.substring(zStartsWith2 ? 5 : 4));
        c25332OooO0oo2.OooOOo0();
        float fOooO2 = c25332OooO0oo2.OooO();
        float fOooO0OO4 = c25332OooO0oo2.OooO0OO(fOooO2);
        if (!Float.isNaN(fOooO0OO4)) {
            c25332OooO0oo2.OooO0Oo('%');
        }
        float fOooO0OO5 = c25332OooO0oo2.OooO0OO(fOooO0OO4);
        if (!Float.isNaN(fOooO0OO5)) {
            c25332OooO0oo2.OooO0Oo('%');
        }
        if (!zStartsWith2) {
            c25332OooO0oo2.OooOOo0();
            if (Float.isNaN(fOooO0OO5) || !c25332OooO0oo2.OooO0Oo(')')) {
                throw new C25396OooO0oo("Bad hsl() colour value: ".concat(str));
            }
            return new C25345OooO0o.C25347OooO0o0(OooO0Oo(fOooO2, fOooO0OO4, fOooO0OO5) | ViewCompat.MEASURED_STATE_MASK);
        }
        float fOooO0OO6 = c25332OooO0oo2.OooO0OO(fOooO0OO5);
        c25332OooO0oo2.OooOOo0();
        if (Float.isNaN(fOooO0OO6) || !c25332OooO0oo2.OooO0Oo(')')) {
            throw new C25396OooO0oo("Bad hsla() colour value: ".concat(str));
        }
        return new C25345OooO0o.C25347OooO0o0((OooO0O0(fOooO0OO6 * 256.0f) << 24) | OooO0Oo(fOooO2, fOooO0OO4, fOooO0OO5));
    }

    public static float OooOOOo(int i, String str) throws C25396OooO0oo {
        float fOooO00o = new C25344OooO0Oo().OooO00o(0, i, str);
        if (Float.isNaN(fOooO00o)) {
            throw new C25396OooO0oo(com.alibaba.sdk.android.oss.internal.OooO00o.OooO00o("Invalid float value: ", str));
        }
        return fOooO00o;
    }

    public static ArrayList OooOOo(String str) {
        C25332OooO0oo c25332OooO0oo = new C25332OooO0oo(str);
        ArrayList arrayList = null;
        do {
            String strOooOO0O = c25332OooO0oo.OooOO0O();
            if (strOooOO0O == null) {
                strOooOO0O = c25332OooO0oo.OooOOO0(',', true);
            }
            if (strOooOO0O == null) {
                return arrayList;
            }
            if (arrayList == null) {
                arrayList = new ArrayList();
            }
            arrayList.add(strOooOO0O);
            c25332OooO0oo.OooOOOo();
        } while (!c25332OooO0oo.OooO0o());
        return arrayList;
    }

    public static float OooOOo0(String str) throws C25396OooO0oo {
        int length = str.length();
        if (length != 0) {
            return OooOOOo(length, str);
        }
        throw new C25396OooO0oo("Invalid float value (empty string)");
    }

    public static String OooOOoo(String str) {
        if (!str.equals("none") && str.startsWith("url(")) {
            return str.endsWith(")") ? str.substring(4, str.length() - 1).trim() : str.substring(4).trim();
        }
        return null;
    }

    public static C25345OooO0o.AbstractC25375Oooo0oO OooOo(String str) {
        boolean zStartsWith = str.startsWith("url(");
        C25345OooO0o.AbstractC25375Oooo0oO abstractC25375Oooo0oOOooOOOO = C25345OooO0o.C25347OooO0o0.f86365OooOoO0;
        C25345OooO0o.C19697OooO0o c19697OooO0o = C25345OooO0o.C19697OooO0o.f86363OooOo0o;
        C25345OooO0o.AbstractC25375Oooo0oO abstractC25375Oooo0oO = null;
        if (!zStartsWith) {
            if (str.equals("none")) {
                return abstractC25375Oooo0oOOooOOOO;
            }
            if (str.equals("currentColor")) {
                return c19697OooO0o;
            }
            try {
                return OooOOOO(str);
            } catch (C25396OooO0oo unused) {
                return null;
            }
        }
        int iIndexOf = str.indexOf(")");
        if (iIndexOf == -1) {
            return new C25345OooO0o.OooOo00(str.substring(4).trim(), null);
        }
        String strTrim = str.substring(4, iIndexOf).trim();
        String strTrim2 = str.substring(iIndexOf + 1).trim();
        if (strTrim2.length() > 0) {
            if (!strTrim2.equals("none")) {
                if (strTrim2.equals("currentColor")) {
                    abstractC25375Oooo0oOOooOOOO = c19697OooO0o;
                } else {
                    try {
                        abstractC25375Oooo0oOOooOOOO = OooOOOO(strTrim2);
                    } catch (C25396OooO0oo unused2) {
                        abstractC25375Oooo0oOOooOOOO = null;
                    }
                }
            }
            abstractC25375Oooo0oO = abstractC25375Oooo0oOOooOOOO;
        }
        return new C25345OooO0o.OooOo00(strTrim, abstractC25375Oooo0oO);
    }

    public static ArrayList OooOo0(String str) throws C25396OooO0oo {
        String str2;
        if (str.length() == 0) {
            throw new C25396OooO0oo("Invalid length list (empty string)");
        }
        ArrayList arrayList = new ArrayList(1);
        C25332OooO0oo c25332OooO0oo = new C25332OooO0oo(str);
        c25332OooO0oo.OooOOo0();
        while (!c25332OooO0oo.OooO0o()) {
            float fOooO = c25332OooO0oo.OooO();
            if (Float.isNaN(fOooO)) {
                StringBuilder sb = new StringBuilder("Invalid length list value: ");
                int i = c25332OooO0oo.f86288OooO0O0;
                while (true) {
                    boolean zOooO0o = c25332OooO0oo.OooO0o();
                    str2 = c25332OooO0oo.f86287OooO00o;
                    if (zOooO0o || C25332OooO0oo.OooO0oO(str2.charAt(c25332OooO0oo.f86288OooO0O0))) {
                        break;
                    }
                    c25332OooO0oo.f86288OooO0O0++;
                }
                String strSubstring = str2.substring(i, c25332OooO0oo.f86288OooO0O0);
                c25332OooO0oo.f86288OooO0O0 = i;
                sb.append(strSubstring);
                throw new C25396OooO0oo(sb.toString());
            }
            C25345OooO0o.EnumC25388Ooooo0o enumC25388Ooooo0oOooOOO = c25332OooO0oo.OooOOO();
            if (enumC25388Ooooo0oOooOOO == null) {
                enumC25388Ooooo0oOooOOO = C25345OooO0o.EnumC25388Ooooo0o.f86540OooOo0o;
            }
            arrayList.add(new C25345OooO0o.OooOOOO(fOooO, enumC25388Ooooo0oOooOOO));
            c25332OooO0oo.OooOOOo();
        }
        return arrayList;
    }

    public static C25345OooO0o.OooOOOO OooOo00(String str) throws C25396OooO0oo {
        if (str.length() == 0) {
            throw new C25396OooO0oo("Invalid length value (empty string)");
        }
        int length = str.length();
        C25345OooO0o.EnumC25388Ooooo0o enumC25388Ooooo0oValueOf = C25345OooO0o.EnumC25388Ooooo0o.f86540OooOo0o;
        char cCharAt = str.charAt(length - 1);
        if (cCharAt == '%') {
            length--;
            enumC25388Ooooo0oValueOf = C25345OooO0o.EnumC25388Ooooo0o.f86542OooOoO0;
        } else if (length > 2 && Character.isLetter(cCharAt) && Character.isLetter(str.charAt(length - 2))) {
            length -= 2;
            try {
                enumC25388Ooooo0oValueOf = C25345OooO0o.EnumC25388Ooooo0o.valueOf(str.substring(length).toLowerCase(Locale.US));
            } catch (IllegalArgumentException unused) {
                throw new C25396OooO0oo("Invalid length unit specifier: ".concat(str));
            }
        }
        try {
            return new C25345OooO0o.OooOOOO(OooOOOo(length, str), enumC25388Ooooo0oValueOf);
        } catch (NumberFormatException e) {
            throw new C25396OooO0oo("Invalid length value: ".concat(str), e);
        }
    }

    public static C25345OooO0o.OooOOOO OooOo0O(C25332OooO0oo c25332OooO0oo) {
        return c25332OooO0oo.OooO0o0("auto") ? new C25345OooO0o.OooOOOO(0.0f) : c25332OooO0oo.OooOO0();
    }

    public static Float OooOo0o(String str) {
        try {
            float fOooOOo0 = OooOOo0(str);
            float f = 0.0f;
            if (fOooOOo0 < 0.0f) {
                fOooOOo0 = f;
            } else {
                f = 1.0f;
                if (fOooOOo0 > 1.0f) {
                    fOooOOo0 = f;
                }
            }
            return Float.valueOf(fOooOOo0);
        } catch (C25396OooO0oo unused) {
            return null;
        }
    }

    public static HashMap OooOoO(C25332OooO0oo c25332OooO0oo) {
        HashMap map = new HashMap();
        c25332OooO0oo.OooOOo0();
        String strOooOOO0 = c25332OooO0oo.OooOOO0('=', false);
        while (strOooOOO0 != null) {
            c25332OooO0oo.OooO0Oo('=');
            map.put(strOooOOO0, c25332OooO0oo.OooOO0O());
            c25332OooO0oo.OooOOo0();
            strOooOOO0 = c25332OooO0oo.OooOOO0('=', false);
        }
        return map;
    }

    public static void OooOoO0(C25345OooO0o.AbstractC25376Oooo0oo abstractC25376Oooo0oo, String str) throws C25396OooO0oo {
        C25391OooO0o0.OooO0O0 oooO0O0;
        C25332OooO0oo c25332OooO0oo = new C25332OooO0oo(str);
        c25332OooO0oo.OooOOo0();
        String strOooOO0o = c25332OooO0oo.OooOO0o();
        if ("defer".equals(strOooOO0o)) {
            c25332OooO0oo.OooOOo0();
            strOooOO0o = c25332OooO0oo.OooOO0o();
        }
        C25391OooO0o0.OooO00o oooO00o = (C25391OooO0o0.OooO00o) OooO00o.f86184OooO00o.get(strOooOO0o);
        c25332OooO0oo.OooOOo0();
        if (c25332OooO0oo.OooO0o()) {
            oooO0O0 = null;
        } else {
            String strOooOO0o2 = c25332OooO0oo.OooOO0o();
            strOooOO0o2.getClass();
            if (strOooOO0o2.equals("meet")) {
                oooO0O0 = C25391OooO0o0.OooO0O0.f86565OooOo0o;
            } else {
                if (!strOooOO0o2.equals(AzureActiveDirectorySlice.SLICE_PARAMETER)) {
                    throw new C25396OooO0oo("Invalid preserveAspectRatio definition: ".concat(str));
                }
                oooO0O0 = C25391OooO0o0.OooO0O0.f86564OooOo;
            }
        }
        abstractC25376Oooo0oo.f86526OooOOO = new C25391OooO0o0(oooO00o, oooO0O0);
    }

    public static Matrix OooOoOO(String str) throws C25396OooO0oo {
        Matrix matrix = new Matrix();
        C25332OooO0oo c25332OooO0oo = new C25332OooO0oo(str);
        c25332OooO0oo.OooOOo0();
        while (!c25332OooO0oo.OooO0o()) {
            String strSubstring = null;
            if (!c25332OooO0oo.OooO0o()) {
                int i = c25332OooO0oo.f86288OooO0O0;
                String str2 = c25332OooO0oo.f86287OooO00o;
                int iCharAt = str2.charAt(i);
                while (true) {
                    if ((iCharAt >= 97 && iCharAt <= 122) || (iCharAt >= 65 && iCharAt <= 90)) {
                        iCharAt = c25332OooO0oo.OooO00o();
                    }
                }
                int i2 = c25332OooO0oo.f86288OooO0O0;
                while (C25332OooO0oo.OooO0oO(iCharAt)) {
                    iCharAt = c25332OooO0oo.OooO00o();
                }
                if (iCharAt == 40) {
                    c25332OooO0oo.f86288OooO0O0++;
                    strSubstring = str2.substring(i, i2);
                } else {
                    c25332OooO0oo.f86288OooO0O0 = i;
                }
            }
            if (strSubstring == null) {
                throw new C25396OooO0oo("Bad transform function encountered in transform list: ".concat(str));
            }
            switch (strSubstring) {
                case "matrix":
                    c25332OooO0oo.OooOOo0();
                    float fOooO = c25332OooO0oo.OooO();
                    c25332OooO0oo.OooOOOo();
                    float fOooO2 = c25332OooO0oo.OooO();
                    c25332OooO0oo.OooOOOo();
                    float fOooO3 = c25332OooO0oo.OooO();
                    c25332OooO0oo.OooOOOo();
                    float fOooO4 = c25332OooO0oo.OooO();
                    c25332OooO0oo.OooOOOo();
                    float fOooO5 = c25332OooO0oo.OooO();
                    c25332OooO0oo.OooOOOo();
                    float fOooO6 = c25332OooO0oo.OooO();
                    c25332OooO0oo.OooOOo0();
                    if (Float.isNaN(fOooO6) || !c25332OooO0oo.OooO0Oo(')')) {
                        throw new C25396OooO0oo("Invalid transform list: ".concat(str));
                    }
                    Matrix matrix2 = new Matrix();
                    matrix2.setValues(new float[]{fOooO, fOooO3, fOooO5, fOooO2, fOooO4, fOooO6, 0.0f, 0.0f, 1.0f});
                    matrix.preConcat(matrix2);
                    break;
                    break;
                case "rotate":
                    c25332OooO0oo.OooOOo0();
                    float fOooO7 = c25332OooO0oo.OooO();
                    float fOooOOOO = c25332OooO0oo.OooOOOO();
                    float fOooOOOO2 = c25332OooO0oo.OooOOOO();
                    c25332OooO0oo.OooOOo0();
                    if (Float.isNaN(fOooO7) || !c25332OooO0oo.OooO0Oo(')')) {
                        throw new C25396OooO0oo("Invalid transform list: ".concat(str));
                    }
                    if (Float.isNaN(fOooOOOO)) {
                        matrix.preRotate(fOooO7);
                    } else {
                        if (Float.isNaN(fOooOOOO2)) {
                            throw new C25396OooO0oo("Invalid transform list: ".concat(str));
                        }
                        matrix.preRotate(fOooO7, fOooOOOO, fOooOOOO2);
                    }
                    break;
                    break;
                case "scale":
                    c25332OooO0oo.OooOOo0();
                    float fOooO8 = c25332OooO0oo.OooO();
                    float fOooOOOO3 = c25332OooO0oo.OooOOOO();
                    c25332OooO0oo.OooOOo0();
                    if (Float.isNaN(fOooO8) || !c25332OooO0oo.OooO0Oo(')')) {
                        throw new C25396OooO0oo("Invalid transform list: ".concat(str));
                    }
                    if (!Float.isNaN(fOooOOOO3)) {
                        matrix.preScale(fOooO8, fOooOOOO3);
                    } else {
                        matrix.preScale(fOooO8, fOooO8);
                    }
                    break;
                    break;
                case "skewX":
                    c25332OooO0oo.OooOOo0();
                    float fOooO9 = c25332OooO0oo.OooO();
                    c25332OooO0oo.OooOOo0();
                    if (Float.isNaN(fOooO9) || !c25332OooO0oo.OooO0Oo(')')) {
                        throw new C25396OooO0oo("Invalid transform list: ".concat(str));
                    }
                    matrix.preSkew((float) Math.tan(Math.toRadians(fOooO9)), 0.0f);
                    break;
                    break;
                case "skewY":
                    c25332OooO0oo.OooOOo0();
                    float fOooO10 = c25332OooO0oo.OooO();
                    c25332OooO0oo.OooOOo0();
                    if (Float.isNaN(fOooO10) || !c25332OooO0oo.OooO0Oo(')')) {
                        throw new C25396OooO0oo("Invalid transform list: ".concat(str));
                    }
                    matrix.preSkew(0.0f, (float) Math.tan(Math.toRadians(fOooO10)));
                    break;
                    break;
                case "translate":
                    c25332OooO0oo.OooOOo0();
                    float fOooO11 = c25332OooO0oo.OooO();
                    float fOooOOOO4 = c25332OooO0oo.OooOOOO();
                    c25332OooO0oo.OooOOo0();
                    if (Float.isNaN(fOooO11) || !c25332OooO0oo.OooO0Oo(')')) {
                        throw new C25396OooO0oo("Invalid transform list: ".concat(str));
                    }
                    if (!Float.isNaN(fOooOOOO4)) {
                        matrix.preTranslate(fOooO11, fOooOOOO4);
                    } else {
                        matrix.preTranslate(fOooO11, 0.0f);
                    }
                    break;
                    break;
                default:
                    throw new C25396OooO0oo(C20593OooO0Oo.OooO0O0("Invalid transform list fn: ", strSubstring, ")"));
            }
            if (c25332OooO0oo.OooO0o()) {
                return matrix;
            }
            c25332OooO0oo.OooOOOo();
        }
        return matrix;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:149:0x0281  */
    /* JADX WARN: Removed duplicated region for block: B:173:0x02c6  */
    /* JADX WARN: Removed duplicated region for block: B:234:0x0394  */
    /* JADX WARN: Removed duplicated region for block: B:309:0x04aa  */
    /* JADX WARN: Removed duplicated region for block: B:343:0x050a  */
    /* JADX WARN: Removed duplicated region for block: B:387:0x05ab  */
    /* JADX WARN: Removed duplicated region for block: B:442:0x0673  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void OooOooo(C25345OooO0o.C25363OooOooO c25363OooOooO, String str, String str2) {
        C25345OooO0o.OooO0O0 oooO0O0;
        Boolean bool;
        C25345OooO0o.C25363OooOooO.EnumC19698OooO0o enumC19698OooO0o;
        C25345OooO0o.C25363OooOooO.EnumC25366OooO0oO enumC25366OooO0oO;
        C25345OooO0o.OooOOOO oooOOOOOooOo00;
        String strSubstring;
        C25345OooO0o.OooOOOO oooOOOOOooOo002;
        C25345OooO0o.C25363OooOooO.OooO0O0 oooO0O02;
        C25345OooO0o.C25363OooOooO.EnumC25365OooO0o0 enumC25365OooO0o0;
        C25345OooO0o.OooOOOO oooOOOOOooOO0;
        C25345OooO0o.OooOOOO[] oooOOOOArr;
        if (str2.length() == 0 || str2.equals("inherit")) {
            return;
        }
        int iOrdinal = OooO0o.OooO00o(str).ordinal();
        if (iOrdinal == 1) {
            if (!"auto".equals(str2) && str2.startsWith("rect(")) {
                C25332OooO0oo c25332OooO0oo = new C25332OooO0oo(str2.substring(5));
                c25332OooO0oo.OooOOo0();
                C25345OooO0o.OooOOOO oooOOOOOooOo0O = OooOo0O(c25332OooO0oo);
                c25332OooO0oo.OooOOOo();
                C25345OooO0o.OooOOOO oooOOOOOooOo0O2 = OooOo0O(c25332OooO0oo);
                c25332OooO0oo.OooOOOo();
                C25345OooO0o.OooOOOO oooOOOOOooOo0O3 = OooOo0O(c25332OooO0oo);
                c25332OooO0oo.OooOOOo();
                C25345OooO0o.OooOOOO oooOOOOOooOo0O4 = OooOo0O(c25332OooO0oo);
                c25332OooO0oo.OooOOo0();
                if (c25332OooO0oo.OooO0Oo(')') || c25332OooO0oo.OooO0o()) {
                    oooO0O0 = new C25345OooO0o.OooO0O0();
                    oooO0O0.f86355OooO00o = oooOOOOOooOo0O;
                    oooO0O0.f86356OooO0O0 = oooOOOOOooOo0O2;
                    oooO0O0.f86357OooO0OO = oooOOOOOooOo0O3;
                    oooO0O0.f86358OooO0Oo = oooOOOOOooOo0O4;
                } else {
                    oooO0O0 = null;
                }
            }
            c25363OooOooO.f86444OoooO0O = oooO0O0;
            if (oooO0O0 != null) {
                c25363OooOooO.f86422OooOo0o |= PlaybackStateCompat.ACTION_SET_CAPTIONING_ENABLED;
                return;
            }
            return;
        }
        if (iOrdinal == 2) {
            c25363OooOooO.f86450OoooOoo = OooOOoo(str2);
            c25363OooOooO.f86422OooOo0o |= 268435456;
            return;
        }
        C25345OooO0o.C25363OooOooO.OooO00o oooO00o = C25345OooO0o.C25363OooOooO.OooO00o.f86463OooOo;
        C25345OooO0o.C25363OooOooO.OooO00o oooO00o2 = C25345OooO0o.C25363OooOooO.OooO00o.f86464OooOo0o;
        if (iOrdinal == 4) {
            c25363OooOooO.f86451Ooooo00 = "nonzero".equals(str2) ? oooO00o2 : "evenodd".equals(str2) ? oooO00o : null;
            c25363OooOooO.f86422OooOo0o |= 536870912;
        }
        try {
            if (iOrdinal == 5) {
                c25363OooOooO.f86435Oooo0O0 = OooOOOO(str2);
                c25363OooOooO.f86422OooOo0o |= 4096;
                return;
            }
            if (iOrdinal == 8) {
                C25345OooO0o.C25363OooOooO.EnumC25367OooO0oo enumC25367OooO0oo = !str2.equals("ltr") ? !str2.equals("rtl") ? null : C25345OooO0o.C25363OooOooO.EnumC25367OooO0oo.f86492OooOo : C25345OooO0o.C25363OooOooO.EnumC25367OooO0oo.f86493OooOo0o;
                c25363OooOooO.f86430Oooo = enumC25367OooO0oo;
                if (enumC25367OooO0oo != null) {
                    c25363OooOooO.f86422OooOo0o |= 68719476736L;
                    return;
                }
                return;
            }
            if (iOrdinal == 35) {
                c25363OooOooO.f86452Ooooo0o = OooOOoo(str2);
                c25363OooOooO.f86422OooOo0o |= 1073741824;
                return;
            }
            if (iOrdinal == 40) {
                c25363OooOooO.f86431Oooo0 = OooOo0o(str2);
                c25363OooOooO.f86422OooOo0o |= 2048;
                return;
            }
            if (iOrdinal == 42) {
                switch (str2) {
                    case "hidden":
                    case "scroll":
                        bool = Boolean.FALSE;
                        break;
                    case "auto":
                    case "visible":
                        bool = Boolean.TRUE;
                        break;
                    default:
                        bool = null;
                        break;
                }
                c25363OooOooO.f86442OoooO0 = bool;
                if (bool != null) {
                    c25363OooOooO.f86422OooOo0o |= PlaybackStateCompat.ACTION_SET_SHUFFLE_MODE_ENABLED;
                    return;
                }
                return;
            }
            if (iOrdinal == 78) {
                C25345OooO0o.C25363OooOooO.OooO oooO = !str2.equals("none") ? !str2.equals("non-scaling-stroke") ? null : C25345OooO0o.C25363OooOooO.OooO.f86460OooOo : C25345OooO0o.C25363OooOooO.OooO.f86461OooOo0o;
                c25363OooOooO.f86456Oooooo = oooO;
                if (oooO != null) {
                    c25363OooOooO.f86422OooOo0o |= 34359738368L;
                    return;
                }
                return;
            }
            C25345OooO0o.C19697OooO0o c19697OooO0o = C25345OooO0o.C19697OooO0o.f86363OooOo0o;
            if (iOrdinal == 58) {
                if (str2.equals("currentColor")) {
                    c25363OooOooO.f86453OooooO0 = c19697OooO0o;
                } else {
                    try {
                        c25363OooOooO.f86453OooooO0 = OooOOOO(str2);
                    } catch (C25396OooO0oo e) {
                        Log.w("SVGParser", e.getMessage());
                        return;
                    }
                }
                c25363OooOooO.f86422OooOo0o |= 2147483648L;
                return;
            }
            if (iOrdinal == 59) {
                c25363OooOooO.f86454OooooOO = OooOo0o(str2);
                c25363OooOooO.f86422OooOo0o |= 4294967296L;
                return;
            }
            if (iOrdinal == 74) {
                switch (str2) {
                    case "middle":
                        enumC19698OooO0o = C25345OooO0o.C25363OooOooO.EnumC19698OooO0o.f86478OooOo;
                        break;
                    case "end":
                        enumC19698OooO0o = C25345OooO0o.C25363OooOooO.EnumC19698OooO0o.f86481OooOoO0;
                        break;
                    case "start":
                        enumC19698OooO0o = C25345OooO0o.C25363OooOooO.EnumC19698OooO0o.f86479OooOo0o;
                        break;
                    default:
                        enumC19698OooO0o = null;
                        break;
                }
                c25363OooOooO.f86443OoooO00 = enumC19698OooO0o;
                if (enumC19698OooO0o != null) {
                    c25363OooOooO.f86422OooOo0o |= PlaybackStateCompat.ACTION_SET_REPEAT_MODE;
                    return;
                }
                return;
            }
            if (iOrdinal == 75) {
                switch (str2) {
                    case "line-through":
                        enumC25366OooO0oO = C25345OooO0o.C25363OooOooO.EnumC25366OooO0oO.f86488OooOoO;
                        break;
                    case "underline":
                        enumC25366OooO0oO = C25345OooO0o.C25363OooOooO.EnumC25366OooO0oO.f86486OooOo;
                        break;
                    case "none":
                        enumC25366OooO0oO = C25345OooO0o.C25363OooOooO.EnumC25366OooO0oO.f86487OooOo0o;
                        break;
                    case "blink":
                        enumC25366OooO0oO = C25345OooO0o.C25363OooOooO.EnumC25366OooO0oO.f86490OooOoOO;
                        break;
                    case "overline":
                        enumC25366OooO0oO = C25345OooO0o.C25363OooOooO.EnumC25366OooO0oO.f86489OooOoO0;
                        break;
                    default:
                        enumC25366OooO0oO = null;
                        break;
                }
                c25363OooOooO.f86440Oooo0oo = enumC25366OooO0oO;
                if (enumC25366OooO0oO != null) {
                    c25363OooOooO.f86422OooOo0o |= PlaybackStateCompat.ACTION_PREPARE_FROM_URI;
                    return;
                }
                return;
            }
            C25345OooO0o.C25363OooOooO.OooO0O0 oooO0O03 = C25345OooO0o.C25363OooOooO.OooO0O0.f86469OooOoO0;
            C25345OooO0o.C25363OooOooO.OooO0O0 oooO0O04 = C25345OooO0o.C25363OooOooO.OooO0O0.f86466OooOo;
            C25345OooO0o.C25363OooOooO.OooO0O0 oooO0O05 = C25345OooO0o.C25363OooOooO.OooO0O0.f86467OooOo0o;
            switch (iOrdinal) {
                case 14:
                    if (str2.indexOf(124) < 0) {
                        if ("|inline|block|list-item|run-in|compact|marker|table|inline-table|table-row-group|table-header-group|table-footer-group|table-row|table-column-group|table-column|table-cell|table-caption|none|".contains("|" + str2 + '|')) {
                            c25363OooOooO.f86446OoooOOO = Boolean.valueOf(!str2.equals("none"));
                            c25363OooOooO.f86422OooOo0o |= C18163eb.f54662y;
                            break;
                        }
                    }
                    break;
                case 15:
                    C25345OooO0o.AbstractC25375Oooo0oO abstractC25375Oooo0oOOooOo = OooOo(str2);
                    c25363OooOooO.f86421OooOo = abstractC25375Oooo0oOOooOo;
                    if (abstractC25375Oooo0oOOooOo != null) {
                        c25363OooOooO.f86422OooOo0o |= 1;
                    }
                    break;
                case 16:
                    C25345OooO0o.C25363OooOooO.OooO00o oooO00o3 = "nonzero".equals(str2) ? oooO00o2 : "evenodd".equals(str2) ? oooO00o : null;
                    c25363OooOooO.f86424OooOoO0 = oooO00o3;
                    if (oooO00o3 != null) {
                        c25363OooOooO.f86422OooOo0o |= 2;
                    }
                    break;
                case 17:
                    Float fOooOo0o = OooOo0o(str2);
                    c25363OooOooO.f86423OooOoO = fOooOo0o;
                    if (fOooOo0o != null) {
                        c25363OooOooO.f86422OooOo0o |= 4;
                    }
                    break;
                case 18:
                    if ("|caption|icon|menu|message-box|small-caption|status-bar|".contains("|" + str2 + '|')) {
                        C25332OooO0oo c25332OooO0oo2 = new C25332OooO0oo(str2);
                        Integer num = null;
                        C25345OooO0o.C25363OooOooO.OooO0O0 oooO0O06 = null;
                        String str3 = null;
                        while (true) {
                            String strOooOOO0 = c25332OooO0oo2.OooOOO0(IOUtils.DIR_SEPARATOR_UNIX, false);
                            c25332OooO0oo2.OooOOo0();
                            if (strOooOOO0 != null) {
                                if (num == null || oooO0O06 == null) {
                                    if (!strOooOOO0.equals("normal") && (num != null || (num = (Integer) C25329OooO0Oo.f86187OooO00o.get(strOooOOO0)) == null)) {
                                        if (oooO0O06 == null) {
                                            switch (strOooOOO0) {
                                                case "oblique":
                                                    oooO0O06 = oooO0O03;
                                                    break;
                                                case "italic":
                                                    oooO0O06 = oooO0O04;
                                                    break;
                                                case "normal":
                                                    oooO0O06 = oooO0O05;
                                                    break;
                                                default:
                                                    oooO0O06 = null;
                                                    break;
                                            }
                                            if (oooO0O06 != null) {
                                                continue;
                                            }
                                        }
                                        if (str3 == null && strOooOOO0.equals("small-caps")) {
                                            str3 = strOooOOO0;
                                        }
                                    }
                                }
                                try {
                                    oooOOOOOooOo00 = (C25345OooO0o.OooOOOO) OooO0OO.f86186OooO00o.get(strOooOOO0);
                                    if (oooOOOOOooOo00 == null) {
                                        oooOOOOOooOo00 = OooOo00(strOooOOO0);
                                    }
                                } catch (C25396OooO0oo unused) {
                                    oooOOOOOooOo00 = null;
                                }
                                if (c25332OooO0oo2.OooO0Oo(IOUtils.DIR_SEPARATOR_UNIX)) {
                                    c25332OooO0oo2.OooOOo0();
                                    String strOooOO0o = c25332OooO0oo2.OooOO0o();
                                    if (strOooOO0o != null) {
                                        OooOo00(strOooOO0o);
                                    }
                                    c25332OooO0oo2.OooOOo0();
                                }
                                if (c25332OooO0oo2.OooO0o()) {
                                    strSubstring = null;
                                } else {
                                    int i = c25332OooO0oo2.f86288OooO0O0;
                                    c25332OooO0oo2.f86288OooO0O0 = c25332OooO0oo2.f86289OooO0OO;
                                    strSubstring = c25332OooO0oo2.f86287OooO00o.substring(i);
                                }
                                c25363OooOooO.f86436Oooo0OO = OooOOo(strSubstring);
                                c25363OooOooO.f86438Oooo0o0 = oooOOOOOooOo00;
                                c25363OooOooO.f86437Oooo0o = Integer.valueOf(num == null ? 400 : num.intValue());
                                if (oooO0O06 == null) {
                                    oooO0O06 = oooO0O05;
                                }
                                c25363OooOooO.f86439Oooo0oO = oooO0O06;
                                c25363OooOooO.f86422OooOo0o |= 122880;
                                break;
                            }
                            break;
                        }
                    }
                    break;
                case 19:
                    ArrayList arrayListOooOOo = OooOOo(str2);
                    c25363OooOooO.f86436Oooo0OO = arrayListOooOOo;
                    if (arrayListOooOOo != null) {
                        c25363OooOooO.f86422OooOo0o |= PlaybackStateCompat.ACTION_PLAY_FROM_URI;
                    }
                    break;
                case 20:
                    try {
                        C25345OooO0o.OooOOOO oooOOOO = (C25345OooO0o.OooOOOO) OooO0OO.f86186OooO00o.get(str2);
                        oooOOOOOooOo002 = oooOOOO == null ? OooOo00(str2) : oooOOOO;
                    } catch (C25396OooO0oo unused2) {
                        oooOOOOOooOo002 = null;
                    }
                    c25363OooOooO.f86438Oooo0o0 = oooOOOOOooOo002;
                    if (oooOOOOOooOo002 != null) {
                        c25363OooOooO.f86422OooOo0o |= 16384;
                    }
                    break;
                case 21:
                    Integer num2 = (Integer) C25329OooO0Oo.f86187OooO00o.get(str2);
                    c25363OooOooO.f86437Oooo0o = num2;
                    if (num2 != null) {
                        c25363OooOooO.f86422OooOo0o |= PlaybackStateCompat.ACTION_PREPARE_FROM_MEDIA_ID;
                    }
                    break;
                case 22:
                    switch (str2) {
                        case "oblique":
                            oooO0O02 = oooO0O03;
                            break;
                        case "italic":
                            oooO0O02 = oooO0O04;
                            break;
                        case "normal":
                            oooO0O02 = oooO0O05;
                            break;
                        default:
                            oooO0O02 = null;
                            break;
                    }
                    c25363OooOooO.f86439Oooo0oO = oooO0O02;
                    if (oooO0O02 != null) {
                        c25363OooOooO.f86422OooOo0o |= 65536;
                    }
                    break;
                default:
                    switch (iOrdinal) {
                        case 27:
                            switch (str2) {
                                case "optimizeQuality":
                                    enumC25365OooO0o0 = C25345OooO0o.C25363OooOooO.EnumC25365OooO0o0.f86482OooOo;
                                    break;
                                case "auto":
                                    enumC25365OooO0o0 = C25345OooO0o.C25363OooOooO.EnumC25365OooO0o0.f86483OooOo0o;
                                    break;
                                case "optimizeSpeed":
                                    enumC25365OooO0o0 = C25345OooO0o.C25363OooOooO.EnumC25365OooO0o0.f86485OooOoO0;
                                    break;
                                default:
                                    enumC25365OooO0o0 = null;
                                    break;
                            }
                            c25363OooOooO.f86458OoooooO = enumC25365OooO0o0;
                            if (enumC25365OooO0o0 != null) {
                                c25363OooOooO.f86422OooOo0o |= 137438953472L;
                            }
                            break;
                        case 28:
                            String strOooOOoo = OooOOoo(str2);
                            c25363OooOooO.f86441OoooO = strOooOOoo;
                            c25363OooOooO.f86445OoooOO0 = strOooOOoo;
                            c25363OooOooO.f86459o000oOoO = strOooOOoo;
                            c25363OooOooO.f86422OooOo0o |= 14680064;
                            break;
                        case 29:
                            c25363OooOooO.f86441OoooO = OooOOoo(str2);
                            c25363OooOooO.f86422OooOo0o |= PlaybackStateCompat.ACTION_SET_SHUFFLE_MODE;
                            break;
                        case 30:
                            c25363OooOooO.f86445OoooOO0 = OooOOoo(str2);
                            c25363OooOooO.f86422OooOo0o |= 4194304;
                            break;
                        case 31:
                            c25363OooOooO.f86459o000oOoO = OooOOoo(str2);
                            c25363OooOooO.f86422OooOo0o |= 8388608;
                            break;
                        default:
                            switch (iOrdinal) {
                                case 62:
                                    if (str2.equals("currentColor")) {
                                        c25363OooOooO.f86448OoooOo0 = c19697OooO0o;
                                    } else {
                                        try {
                                            c25363OooOooO.f86448OoooOo0 = OooOOOO(str2);
                                        } catch (C25396OooO0oo e2) {
                                            Log.w("SVGParser", e2.getMessage());
                                            return;
                                        }
                                    }
                                    c25363OooOooO.f86422OooOo0o |= 67108864;
                                    break;
                                case 63:
                                    c25363OooOooO.f86449OoooOoO = OooOo0o(str2);
                                    c25363OooOooO.f86422OooOo0o |= 134217728;
                                    break;
                                case 64:
                                    C25345OooO0o.AbstractC25375Oooo0oO abstractC25375Oooo0oOOooOo2 = OooOo(str2);
                                    c25363OooOooO.f86425OooOoOO = abstractC25375Oooo0oOOooOo2;
                                    if (abstractC25375Oooo0oOOooOo2 != null) {
                                        c25363OooOooO.f86422OooOo0o |= 8;
                                    }
                                    break;
                                case 65:
                                    if (!"none".equals(str2)) {
                                        C25332OooO0oo c25332OooO0oo3 = new C25332OooO0oo(str2);
                                        c25332OooO0oo3.OooOOo0();
                                        if (c25332OooO0oo3.OooO0o() || (oooOOOOOooOO0 = c25332OooO0oo3.OooOO0()) == null || oooOOOOOooOO0.OooO0o()) {
                                            oooOOOOArr = null;
                                        } else {
                                            ArrayList arrayList = new ArrayList();
                                            arrayList.add(oooOOOOOooOO0);
                                            float f = oooOOOOOooOO0.f86383OooOo0o;
                                            while (true) {
                                                if (!c25332OooO0oo3.OooO0o()) {
                                                    c25332OooO0oo3.OooOOOo();
                                                    C25345OooO0o.OooOOOO oooOOOOOooOO02 = c25332OooO0oo3.OooOO0();
                                                    if (oooOOOOOooOO02 != null && !oooOOOOOooOO02.OooO0o()) {
                                                        arrayList.add(oooOOOOOooOO02);
                                                        f += oooOOOOOooOO02.f86383OooOo0o;
                                                    }
                                                } else if (f != 0.0f) {
                                                    oooOOOOArr = (C25345OooO0o.OooOOOO[]) arrayList.toArray(new C25345OooO0o.OooOOOO[arrayList.size()]);
                                                }
                                            }
                                            oooOOOOArr = null;
                                        }
                                        c25363OooOooO.f86433Oooo00O = oooOOOOArr;
                                        if (oooOOOOArr != null) {
                                            c25363OooOooO.f86422OooOo0o |= 512;
                                        }
                                    } else {
                                        c25363OooOooO.f86433Oooo00O = null;
                                        c25363OooOooO.f86422OooOo0o |= 512;
                                    }
                                    break;
                                case 66:
                                    c25363OooOooO.f86434Oooo00o = OooOo00(str2);
                                    c25363OooOooO.f86422OooOo0o |= 1024;
                                    break;
                                case 67:
                                    C25345OooO0o.C25363OooOooO.OooO0OO oooO0OO = "butt".equals(str2) ? C25345OooO0o.C25363OooOooO.OooO0OO.f86471OooOo0o : "round".equals(str2) ? C25345OooO0o.C25363OooOooO.OooO0OO.f86470OooOo : "square".equals(str2) ? C25345OooO0o.C25363OooOooO.OooO0OO.f86473OooOoO0 : null;
                                    c25363OooOooO.f86428OooOooO = oooO0OO;
                                    if (oooO0OO != null) {
                                        c25363OooOooO.f86422OooOo0o |= 64;
                                    }
                                    break;
                                case 68:
                                    C25345OooO0o.C25363OooOooO.EnumC25364OooO0Oo enumC25364OooO0Oo = "miter".equals(str2) ? C25345OooO0o.C25363OooOooO.EnumC25364OooO0Oo.f86475OooOo0o : "round".equals(str2) ? C25345OooO0o.C25363OooOooO.EnumC25364OooO0Oo.f86474OooOo : "bevel".equals(str2) ? C25345OooO0o.C25363OooOooO.EnumC25364OooO0Oo.f86477OooOoO0 : null;
                                    c25363OooOooO.f86429OooOooo = enumC25364OooO0Oo;
                                    if (enumC25364OooO0Oo != null) {
                                        c25363OooOooO.f86422OooOo0o |= 128;
                                    }
                                    break;
                                case 69:
                                    c25363OooOooO.f86432Oooo000 = Float.valueOf(OooOOo0(str2));
                                    c25363OooOooO.f86422OooOo0o |= 256;
                                    break;
                                case 70:
                                    Float fOooOo0o2 = OooOo0o(str2);
                                    c25363OooOooO.f86427OooOoo0 = fOooOo0o2;
                                    if (fOooOo0o2 != null) {
                                        c25363OooOooO.f86422OooOo0o |= 16;
                                    }
                                    break;
                                case 71:
                                    c25363OooOooO.f86426OooOoo = OooOo00(str2);
                                    c25363OooOooO.f86422OooOo0o |= 32;
                                    break;
                                default:
                                    switch (iOrdinal) {
                                        case 88:
                                            if (str2.equals("currentColor")) {
                                                c25363OooOooO.f86455OooooOo = c19697OooO0o;
                                            } else {
                                                try {
                                                    c25363OooOooO.f86455OooooOo = OooOOOO(str2);
                                                } catch (C25396OooO0oo e3) {
                                                    Log.w("SVGParser", e3.getMessage());
                                                    return;
                                                }
                                            }
                                            c25363OooOooO.f86422OooOo0o |= 8589934592L;
                                            break;
                                        case 89:
                                            c25363OooOooO.f86457Oooooo0 = OooOo0o(str2);
                                            c25363OooOooO.f86422OooOo0o |= 17179869184L;
                                            break;
                                        case 90:
                                            if (str2.indexOf(124) < 0) {
                                                if ("|visible|hidden|collapse|".contains("|" + str2 + '|')) {
                                                    c25363OooOooO.f86447OoooOOo = Boolean.valueOf(str2.equals("visible"));
                                                    c25363OooOooO.f86422OooOo0o |= 33554432;
                                                    break;
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
        } catch (C25396OooO0oo unused3) {
        }
    }

    public final void OooO00o(String str) throws C25396OooO0oo {
        C25345OooO0o.AbstractC25370Oooo00O abstractC25370Oooo00O = (C25345OooO0o.AbstractC25370Oooo00O) this.f86176OooO0O0;
        int size = abstractC25370Oooo00O.f86504OooO.size();
        C25345OooO0o.Oooo0o oooo0o = size == 0 ? null : (C25345OooO0o.Oooo0o) abstractC25370Oooo00O.f86504OooO.get(size - 1);
        if (oooo0o instanceof C25345OooO0o.C25387Ooooo00) {
            C25345OooO0o.C25387Ooooo00 c25387Ooooo00 = (C25345OooO0o.C25387Ooooo00) oooo0o;
            c25387Ooooo00.f86538OooO0OO = androidx.concurrent.futures.OooO00o.OooO0OO(new StringBuilder(), c25387Ooooo00.f86538OooO0OO, str);
        } else {
            C25345OooO0o.Oooo0 oooo0 = this.f86176OooO0O0;
            C25345OooO0o.C25387Ooooo00 c25387Ooooo002 = new C25345OooO0o.C25387Ooooo00();
            c25387Ooooo002.f86538OooO0OO = str;
            oooo0.OooO0OO(c25387Ooooo002);
        }
    }

    public final void OooO0OO(String str, String str2, String str3) throws C25396OooO0oo {
        if (this.f86177OooO0OO) {
            int i = this.f86178OooO0Oo - 1;
            this.f86178OooO0Oo = i;
            if (i == 0) {
                this.f86177OooO0OO = false;
            }
        }
        if ("http://www.w3.org/2000/svg".equals(str) || "".equals(str)) {
            if (str2.length() <= 0) {
                str2 = str3;
            }
            EnumC25331OooO0oO enumC25331OooO0oO = (EnumC25331OooO0oO) EnumC25331OooO0oO.f86285OooOoOO.get(str2);
            if (enumC25331OooO0oO == null) {
                enumC25331OooO0oO = EnumC25331OooO0oO.f86283OooOoO;
            }
            switch (enumC25331OooO0oO.ordinal()) {
                case 0:
                case 3:
                case 4:
                case 7:
                case 8:
                case 10:
                case 11:
                case 12:
                case 14:
                case 17:
                case 19:
                case 20:
                case 22:
                case 23:
                case 24:
                case 25:
                case 28:
                case 29:
                case 30:
                    this.f86176OooO0O0 = ((C25345OooO0o.Oooo0o) this.f86176OooO0O0).f86521OooO0O0;
                    break;
                case 5:
                case 26:
                    this.f86180OooO0o0 = false;
                    if (this.f86181OooO0oO != null) {
                        EnumC25331OooO0oO enumC25331OooO0oO2 = this.f86179OooO0o;
                        if (enumC25331OooO0oO2 == EnumC25331OooO0oO.f86284OooOoO0 || enumC25331OooO0oO2 == EnumC25331OooO0oO.f86282OooOo0o) {
                            this.f86175OooO00o.getClass();
                        }
                        this.f86181OooO0oO.setLength(0);
                    }
                    break;
                case 21:
                    StringBuilder sb = this.f86174OooO;
                    if (sb != null) {
                        this.f86182OooO0oo = false;
                        String string = sb.toString();
                        C25334OooO0O0.EnumC25342OooOOoo enumC25342OooOOoo = C25334OooO0O0.EnumC25342OooOOoo.f86337OooOo0o;
                        C25334OooO0O0.OooO0o0 oooO0o0 = C25334OooO0O0.OooO0o0.f86314OooOo;
                        C25334OooO0O0 c25334OooO0O0 = new C25334OooO0O0();
                        c25334OooO0O0.f86293OooO0OO = false;
                        c25334OooO0O0.f86291OooO00o = oooO0o0;
                        c25334OooO0O0.f86292OooO0O0 = enumC25342OooOOoo;
                        C25345OooO0o c25345OooO0o = this.f86175OooO00o;
                        C25334OooO0O0.OooO0OO oooO0OO = new C25334OooO0O0.OooO0OO(string);
                        oooO0OO.OooOOo0();
                        c25345OooO0o.f86344OooO0O0.OooO0O0(c25334OooO0O0.OooO0o0(oooO0OO));
                        this.f86174OooO.setLength(0);
                    }
                    break;
            }
        }
    }

    public final C25345OooO0o OooO0o(InputStream inputStream) throws C25396OooO0oo {
        if (!inputStream.markSupported()) {
            inputStream = new BufferedInputStream(inputStream);
        }
        try {
            inputStream.mark(3);
            int i = inputStream.read() + (inputStream.read() << 8);
            inputStream.reset();
            if (i == 35615) {
                inputStream = new BufferedInputStream(new GZIPInputStream(inputStream));
            }
        } catch (IOException unused) {
        }
        try {
            inputStream.mark(4096);
            OooOoo(inputStream);
            return this.f86175OooO00o;
        } finally {
            try {
                inputStream.close();
            } catch (IOException unused2) {
                Log.e("SVGParser", "Exception thrown closing input stream");
            }
        }
    }

    public final void OooOoo(InputStream inputStream) throws C25396OooO0oo {
        try {
            try {
                XmlPullParser xmlPullParserNewPullParser = Xml.newPullParser();
                C19695OooO c19695OooO = new C19695OooO();
                c19695OooO.f86183OooO00o = xmlPullParserNewPullParser;
                xmlPullParserNewPullParser.setFeature("http://xmlpull.org/v1/doc/features.html#process-docdecl", false);
                xmlPullParserNewPullParser.setFeature("http://xmlpull.org/v1/doc/features.html#process-namespaces", true);
                xmlPullParserNewPullParser.setInput(inputStream, null);
                for (int eventType = xmlPullParserNewPullParser.getEventType(); eventType != 1; eventType = xmlPullParserNewPullParser.nextToken()) {
                    if (eventType == 0) {
                        this.f86175OooO00o = new C25345OooO0o();
                    } else if (eventType == 8) {
                        Log.d("SVGParser", "PROC INSTR: " + xmlPullParserNewPullParser.getText());
                        C25332OooO0oo c25332OooO0oo = new C25332OooO0oo(xmlPullParserNewPullParser.getText());
                        String strOooOO0o = c25332OooO0oo.OooOO0o();
                        OooOoO(c25332OooO0oo);
                        strOooOO0o.equals("xml-stylesheet");
                    } else if (eventType == 10) {
                        if (this.f86175OooO00o.f86343OooO00o == null && xmlPullParserNewPullParser.getText().contains("<!ENTITY ")) {
                            try {
                                Log.d("SVGParser", "Switching to SAX parser to process entities");
                                inputStream.reset();
                                OooOoo0(inputStream);
                                return;
                            } catch (IOException unused) {
                                Log.w("SVGParser", "Detected internal entity definitions, but could not parse them.");
                                return;
                            }
                        }
                    } else if (eventType == 2) {
                        String name = xmlPullParserNewPullParser.getName();
                        if (xmlPullParserNewPullParser.getPrefix() != null) {
                            name = xmlPullParserNewPullParser.getPrefix() + ':' + name;
                        }
                        Oooo000(xmlPullParserNewPullParser.getNamespace(), xmlPullParserNewPullParser.getName(), name, c19695OooO);
                    } else if (eventType == 3) {
                        String name2 = xmlPullParserNewPullParser.getName();
                        if (xmlPullParserNewPullParser.getPrefix() != null) {
                            name2 = xmlPullParserNewPullParser.getPrefix() + ':' + name2;
                        }
                        OooO0OO(xmlPullParserNewPullParser.getNamespace(), xmlPullParserNewPullParser.getName(), name2);
                    } else if (eventType == 4) {
                        int[] iArr = new int[2];
                        Oooo00o(xmlPullParserNewPullParser.getTextCharacters(iArr), iArr[0], iArr[1]);
                    } else if (eventType == 5) {
                        Oooo00O(xmlPullParserNewPullParser.getText());
                    }
                }
            } catch (XmlPullParserException e) {
                throw new C25396OooO0oo("XML parser problem", e);
            }
        } catch (IOException e2) {
            throw new C25396OooO0oo("Stream error", e2);
        }
    }

    public final void OooOoo0(InputStream inputStream) throws C25396OooO0oo {
        Log.d("SVGParser", "Falling back to SAX parser");
        try {
            SAXParserFactory sAXParserFactoryNewInstance = SAXParserFactory.newInstance();
            sAXParserFactoryNewInstance.setFeature(Parser.externalGeneralEntitiesFeature, false);
            sAXParserFactoryNewInstance.setFeature(Parser.externalParameterEntitiesFeature, false);
            XMLReader xMLReader = sAXParserFactoryNewInstance.newSAXParser().getXMLReader();
            C25330OooO0o0 c25330OooO0o0 = new C25330OooO0o0();
            xMLReader.setContentHandler(c25330OooO0o0);
            xMLReader.setProperty(Parser.lexicalHandlerProperty, c25330OooO0o0);
            xMLReader.parse(new InputSource(inputStream));
        } catch (IOException e) {
            throw new C25396OooO0oo("Stream error", e);
        } catch (ParserConfigurationException e2) {
            throw new C25396OooO0oo("XML parser problem", e2);
        } catch (SAXException e3) {
            throw new C25396OooO0oo("SVG parse error", e3);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:125:0x0328, code lost:
    
        android.util.Log.e("SVGParser", "Bad path coords for " + ((char) r5) + " path segment");
     */
    /* JADX WARN: Removed duplicated region for block: B:112:0x02fa  */
    /* JADX WARN: Removed duplicated region for block: B:149:0x033b A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void OooOooO(Attributes attributes) throws C25396OooO0oo {
        int iIntValue;
        float fOooO;
        float f;
        float f2;
        float f3;
        float f4;
        char cCharAt;
        Attributes attributes2 = attributes;
        if (this.f86176OooO0O0 == null) {
            throw new C25396OooO0oo("Invalid document. Root element must be <svg>");
        }
        C25345OooO0o.C25355OooOo0 c25355OooOo0 = new C25345OooO0o.C25355OooOo0();
        c25355OooOo0.f86520OooO00o = this.f86175OooO00o;
        c25355OooOo0.f86521OooO0O0 = this.f86176OooO0O0;
        OooO0oo(c25355OooOo0, attributes2);
        OooOO0O(c25355OooOo0, attributes2);
        OooOOO0(c25355OooOo0, attributes2);
        OooO0oO(c25355OooOo0, attributes2);
        int i = 0;
        int i2 = 0;
        while (i2 < attributes2.getLength()) {
            String strTrim = attributes2.getValue(i2).trim();
            int iOooO00o = com.aspose.slides.internal.p472w8.OooO00o.OooO00o(attributes2, i2);
            float f5 = 0.0f;
            if (iOooO00o == 13) {
                C25332OooO0oo c25332OooO0oo = new C25332OooO0oo(strTrim);
                C25345OooO0o.C25356OooOo0O c25356OooOo0O = new C25345OooO0o.C25356OooOo0O();
                c25356OooOo0O.f86410OooO0O0 = i;
                c25356OooOo0O.f86412OooO0Oo = i;
                c25356OooOo0O.f86409OooO00o = new byte[8];
                c25356OooOo0O.f86411OooO0OO = new float[16];
                if (!c25332OooO0oo.OooO0o() && ((iIntValue = c25332OooO0oo.OooO0oo().intValue()) == 77 || iIntValue == 109)) {
                    float f6 = 0.0f;
                    float fOooO2 = 0.0f;
                    float f7 = 0.0f;
                    float fOooO0OO = 0.0f;
                    float f8 = 0.0f;
                    float f9 = 0.0f;
                    while (true) {
                        c25332OooO0oo.OooOOo0();
                        float f10 = f5;
                        switch (iIntValue) {
                            case 65:
                            case 97:
                                float fOooO3 = c25332OooO0oo.OooO();
                                float fOooO0OO2 = c25332OooO0oo.OooO0OO(fOooO3);
                                float f11 = f7;
                                float fOooO0OO3 = c25332OooO0oo.OooO0OO(fOooO0OO2);
                                Boolean boolOooO0O0 = c25332OooO0oo.OooO0O0(Float.valueOf(fOooO0OO3));
                                Boolean boolOooO0O02 = c25332OooO0oo.OooO0O0(boolOooO0O0);
                                if (boolOooO0O02 == null) {
                                    fOooO = Float.NaN;
                                } else {
                                    c25332OooO0oo.OooOOOo();
                                    fOooO = c25332OooO0oo.OooO();
                                }
                                float f12 = fOooO;
                                float fOooO0OO4 = c25332OooO0oo.OooO0OO(f12);
                                if (!Float.isNaN(fOooO0OO4) && fOooO3 >= f10 && fOooO0OO2 >= f10) {
                                    if (iIntValue == 97) {
                                        f = f12 + f6;
                                        fOooO0OO4 += f11;
                                    } else {
                                        f = f12;
                                    }
                                    boolean zBooleanValue = boolOooO0O0.booleanValue();
                                    boolean zBooleanValue2 = boolOooO0O02.booleanValue();
                                    float f13 = f;
                                    float f14 = fOooO0OO4;
                                    c25356OooOo0O.OooO0OO(fOooO3, fOooO0OO2, fOooO0OO3, zBooleanValue, zBooleanValue2, f13, f14);
                                    f6 = f13;
                                    fOooO2 = f6;
                                    f7 = f14;
                                    fOooO0OO = f7;
                                    c25332OooO0oo.OooOOOo();
                                    if (c25332OooO0oo.OooO0o()) {
                                        int i3 = c25332OooO0oo.f86288OooO0O0;
                                        if (i3 != c25332OooO0oo.f86289OooO0OO && (((cCharAt = c25332OooO0oo.f86287OooO00o.charAt(i3)) >= 'a' && cCharAt <= 'z') || (cCharAt >= 'A' && cCharAt <= 'Z'))) {
                                            iIntValue = c25332OooO0oo.OooO0oo().intValue();
                                        }
                                        f5 = f10;
                                    }
                                }
                                break;
                            case 67:
                            case 99:
                                float fOooO4 = c25332OooO0oo.OooO();
                                float fOooO0OO5 = c25332OooO0oo.OooO0OO(fOooO4);
                                float fOooO0OO6 = c25332OooO0oo.OooO0OO(fOooO0OO5);
                                float fOooO0OO7 = c25332OooO0oo.OooO0OO(fOooO0OO6);
                                float fOooO0OO8 = c25332OooO0oo.OooO0OO(fOooO0OO7);
                                float fOooO0OO9 = c25332OooO0oo.OooO0OO(fOooO0OO8);
                                if (Float.isNaN(fOooO0OO9)) {
                                    Log.e("SVGParser", "Bad path coords for " + ((char) iIntValue) + " path segment");
                                    break;
                                } else {
                                    if (iIntValue == 99) {
                                        fOooO0OO8 += f6;
                                        fOooO0OO9 += f7;
                                        fOooO4 += f6;
                                        fOooO0OO5 += f7;
                                        fOooO0OO6 += f6;
                                        fOooO0OO7 += f7;
                                    }
                                    float f15 = fOooO4;
                                    float f16 = fOooO0OO5;
                                    f2 = fOooO0OO6;
                                    fOooO0OO = fOooO0OO7;
                                    f3 = fOooO0OO9;
                                    f4 = fOooO0OO8;
                                    c25356OooOo0O.OooO00o(f15, f16, f2, fOooO0OO, f4, f3);
                                    fOooO2 = f2;
                                    f6 = f4;
                                    f7 = f3;
                                    c25332OooO0oo.OooOOOo();
                                    if (c25332OooO0oo.OooO0o()) {
                                    }
                                }
                                break;
                            case 72:
                            case 104:
                                float fOooO5 = c25332OooO0oo.OooO();
                                if (Float.isNaN(fOooO5)) {
                                    Log.e("SVGParser", "Bad path coords for " + ((char) iIntValue) + " path segment");
                                    break;
                                } else {
                                    if (iIntValue == 104) {
                                        fOooO5 += f6;
                                    }
                                    f6 = fOooO5;
                                    c25356OooOo0O.lineTo(f6, f7);
                                    fOooO2 = f6;
                                    c25332OooO0oo.OooOOOo();
                                    if (c25332OooO0oo.OooO0o()) {
                                    }
                                }
                                break;
                            case 76:
                            case 108:
                                float fOooO6 = c25332OooO0oo.OooO();
                                float fOooO0OO10 = c25332OooO0oo.OooO0OO(fOooO6);
                                if (Float.isNaN(fOooO0OO10)) {
                                    Log.e("SVGParser", "Bad path coords for " + ((char) iIntValue) + " path segment");
                                    break;
                                } else {
                                    if (iIntValue == 108) {
                                        fOooO6 += f6;
                                        fOooO0OO10 += f7;
                                    }
                                    f6 = fOooO6;
                                    f7 = fOooO0OO10;
                                    c25356OooOo0O.lineTo(f6, f7);
                                    fOooO2 = f6;
                                    fOooO0OO = f7;
                                    c25332OooO0oo.OooOOOo();
                                    if (c25332OooO0oo.OooO0o()) {
                                    }
                                }
                                break;
                            case 77:
                            case 109:
                                float fOooO7 = c25332OooO0oo.OooO();
                                float fOooO0OO11 = c25332OooO0oo.OooO0OO(fOooO7);
                                if (Float.isNaN(fOooO0OO11)) {
                                    Log.e("SVGParser", "Bad path coords for " + ((char) iIntValue) + " path segment");
                                    break;
                                } else {
                                    if (iIntValue == 109 && c25356OooOo0O.f86410OooO0O0 != 0) {
                                        fOooO7 += f6;
                                        fOooO0OO11 += f7;
                                    }
                                    f6 = fOooO7;
                                    f7 = fOooO0OO11;
                                    c25356OooOo0O.moveTo(f6, f7);
                                    fOooO2 = f6;
                                    f8 = fOooO2;
                                    fOooO0OO = f7;
                                    f9 = fOooO0OO;
                                    iIntValue = iIntValue != 109 ? 76 : 108;
                                    c25332OooO0oo.OooOOOo();
                                    if (c25332OooO0oo.OooO0o()) {
                                    }
                                }
                                break;
                            case 81:
                            case 113:
                                fOooO2 = c25332OooO0oo.OooO();
                                fOooO0OO = c25332OooO0oo.OooO0OO(fOooO2);
                                float fOooO0OO12 = c25332OooO0oo.OooO0OO(fOooO0OO);
                                float fOooO0OO13 = c25332OooO0oo.OooO0OO(fOooO0OO12);
                                if (Float.isNaN(fOooO0OO13)) {
                                    Log.e("SVGParser", "Bad path coords for " + ((char) iIntValue) + " path segment");
                                    break;
                                } else {
                                    if (iIntValue == 113) {
                                        fOooO0OO12 += f6;
                                        fOooO0OO13 += f7;
                                        fOooO2 += f6;
                                        fOooO0OO += f7;
                                    }
                                    f6 = fOooO0OO12;
                                    f7 = fOooO0OO13;
                                    c25356OooOo0O.OooO0O0(fOooO2, fOooO0OO, f6, f7);
                                    c25332OooO0oo.OooOOOo();
                                    if (c25332OooO0oo.OooO0o()) {
                                    }
                                }
                                break;
                            case 83:
                            case 115:
                                float f17 = (f6 * 2.0f) - fOooO2;
                                float f18 = (2.0f * f7) - fOooO0OO;
                                float fOooO8 = c25332OooO0oo.OooO();
                                float fOooO0OO14 = c25332OooO0oo.OooO0OO(fOooO8);
                                float fOooO0OO15 = c25332OooO0oo.OooO0OO(fOooO0OO14);
                                float fOooO0OO16 = c25332OooO0oo.OooO0OO(fOooO0OO15);
                                if (Float.isNaN(fOooO0OO16)) {
                                    Log.e("SVGParser", "Bad path coords for " + ((char) iIntValue) + " path segment");
                                    break;
                                } else {
                                    if (iIntValue == 115) {
                                        fOooO0OO15 += f6;
                                        fOooO0OO16 += f7;
                                        fOooO8 += f6;
                                        fOooO0OO14 += f7;
                                    }
                                    f2 = fOooO8;
                                    fOooO0OO = fOooO0OO14;
                                    f3 = fOooO0OO16;
                                    f4 = fOooO0OO15;
                                    c25356OooOo0O.OooO00o(f17, f18, f2, fOooO0OO, f4, f3);
                                    fOooO2 = f2;
                                    f6 = f4;
                                    f7 = f3;
                                    c25332OooO0oo.OooOOOo();
                                    if (c25332OooO0oo.OooO0o()) {
                                    }
                                }
                                break;
                            case 84:
                            case 116:
                                fOooO2 = (f6 * 2.0f) - fOooO2;
                                fOooO0OO = (2.0f * f7) - fOooO0OO;
                                float fOooO9 = c25332OooO0oo.OooO();
                                float fOooO0OO17 = c25332OooO0oo.OooO0OO(fOooO9);
                                if (Float.isNaN(fOooO0OO17)) {
                                    Log.e("SVGParser", "Bad path coords for " + ((char) iIntValue) + " path segment");
                                    break;
                                } else {
                                    if (iIntValue == 116) {
                                        fOooO9 += f6;
                                        fOooO0OO17 += f7;
                                    }
                                    f6 = fOooO9;
                                    f7 = fOooO0OO17;
                                    c25356OooOo0O.OooO0O0(fOooO2, fOooO0OO, f6, f7);
                                    c25332OooO0oo.OooOOOo();
                                    if (c25332OooO0oo.OooO0o()) {
                                    }
                                }
                                break;
                            case 86:
                            case 118:
                                float fOooO10 = c25332OooO0oo.OooO();
                                if (Float.isNaN(fOooO10)) {
                                    Log.e("SVGParser", "Bad path coords for " + ((char) iIntValue) + " path segment");
                                    break;
                                } else {
                                    if (iIntValue == 118) {
                                        fOooO10 += f7;
                                    }
                                    f7 = fOooO10;
                                    c25356OooOo0O.lineTo(f6, f7);
                                    fOooO0OO = f7;
                                    c25332OooO0oo.OooOOOo();
                                    if (c25332OooO0oo.OooO0o()) {
                                    }
                                }
                                break;
                            case 90:
                            case 122:
                                c25356OooOo0O.close();
                                f6 = f8;
                                fOooO2 = f6;
                                f7 = f9;
                                fOooO0OO = f7;
                                c25332OooO0oo.OooOOOo();
                                if (c25332OooO0oo.OooO0o()) {
                                }
                                break;
                        }
                    }
                }
                c25355OooOo0.f86406OooOOOO = c25356OooOo0O;
            } else if (iOooO00o == 43 && OooOOo0(strTrim) < 0.0f) {
                throw new C25396OooO0oo("Invalid <path> element. pathLength cannot be negative");
            }
            i2++;
            attributes2 = attributes;
            i = 0;
        }
        this.f86176OooO0O0.OooO0OO(c25355OooOo0);
    }

    /* JADX WARN: Code restructure failed: missing block: B:626:0x00fe, code lost:
    
        continue;
     */
    /* JADX WARN: Code restructure failed: missing block: B:657:0x047a, code lost:
    
        continue;
     */
    /* JADX WARN: Code restructure failed: missing block: B:684:0x0636, code lost:
    
        continue;
     */
    /* JADX WARN: Code restructure failed: missing block: B:698:0x06f2, code lost:
    
        continue;
     */
    /* JADX WARN: Code restructure failed: missing block: B:733:0x0917, code lost:
    
        continue;
     */
    /* JADX WARN: Code restructure failed: missing block: B:761:0x0b4b, code lost:
    
        continue;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void Oooo000(String str, String str2, String str3, Attributes attributes) throws C25396OooO0oo {
        boolean z;
        if (this.f86177OooO0OO) {
            this.f86178OooO0Oo++;
            return;
        }
        if ("http://www.w3.org/2000/svg".equals(str) || "".equals(str)) {
            EnumC25331OooO0oO enumC25331OooO0oO = (EnumC25331OooO0oO) EnumC25331OooO0oO.f86285OooOoOO.get(str2.length() > 0 ? str2 : str3);
            if (enumC25331OooO0oO == null) {
                enumC25331OooO0oO = EnumC25331OooO0oO.f86283OooOoO;
            }
            switch (enumC25331OooO0oO.ordinal()) {
                case 0:
                    C25345OooO0o.C25368OooOooo c25368OooOooo = new C25345OooO0o.C25368OooOooo();
                    c25368OooOooo.f86520OooO00o = this.f86175OooO00o;
                    c25368OooOooo.f86521OooO0O0 = this.f86176OooO0O0;
                    OooO0oo(c25368OooOooo, attributes);
                    OooOO0O(c25368OooOooo, attributes);
                    OooO0oO(c25368OooOooo, attributes);
                    OooOOO(c25368OooOooo, attributes);
                    for (int i = 0; i < attributes.getLength(); i++) {
                        String strTrim = attributes.getValue(i).trim();
                        int iOooO00o = com.aspose.slides.internal.p472w8.OooO00o.OooO00o(attributes, i);
                        if (iOooO00o == 25) {
                            C25345OooO0o.OooOOOO oooOOOOOooOo00 = OooOo00(strTrim);
                            c25368OooOooo.f86498OooOOoo = oooOOOOOooOo00;
                            if (oooOOOOOooOo00.OooO0o()) {
                                throw new C25396OooO0oo("Invalid <svg> element. height cannot be negative");
                            }
                        } else if (iOooO00o != 79) {
                            switch (iOooO00o) {
                                case 81:
                                    C25345OooO0o.OooOOOO oooOOOOOooOo002 = OooOo00(strTrim);
                                    c25368OooOooo.f86496OooOOo = oooOOOOOooOo002;
                                    if (oooOOOOOooOo002.OooO0o()) {
                                        throw new C25396OooO0oo("Invalid <svg> element. width cannot be negative");
                                    }
                                    break;
                                    break;
                                case 82:
                                    c25368OooOooo.f86495OooOOOo = OooOo00(strTrim);
                                    break;
                                case 83:
                                    c25368OooOooo.f86497OooOOo0 = OooOo00(strTrim);
                                    break;
                            }
                        } else {
                            continue;
                        }
                    }
                    C25345OooO0o.Oooo0 oooo0 = this.f86176OooO0O0;
                    if (oooo0 == null) {
                        this.f86175OooO00o.f86343OooO00o = c25368OooOooo;
                    } else {
                        oooo0.OooO0OO(c25368OooOooo);
                    }
                    this.f86176OooO0O0 = c25368OooOooo;
                    return;
                case 1:
                case 7:
                    if (this.f86176OooO0O0 == null) {
                        throw new C25396OooO0oo("Invalid document. Root element must be <svg>");
                    }
                    C25345OooO0o.C25350OooOO0o c25350OooOO0o = new C25345OooO0o.C25350OooOO0o();
                    c25350OooOO0o.f86520OooO00o = this.f86175OooO00o;
                    c25350OooOO0o.f86521OooO0O0 = this.f86176OooO0O0;
                    OooO0oo(c25350OooOO0o, attributes);
                    OooOO0O(c25350OooOO0o, attributes);
                    OooOOO0(c25350OooOO0o, attributes);
                    OooO0oO(c25350OooOO0o, attributes);
                    this.f86176OooO0O0.OooO0OO(c25350OooOO0o);
                    this.f86176OooO0O0 = c25350OooOO0o;
                    return;
                case 2:
                    if (this.f86176OooO0O0 == null) {
                        throw new C25396OooO0oo("Invalid document. Root element must be <svg>");
                    }
                    C25345OooO0o.OooO0OO oooO0OO = new C25345OooO0o.OooO0OO();
                    oooO0OO.f86520OooO00o = this.f86175OooO00o;
                    oooO0OO.f86521OooO0O0 = this.f86176OooO0O0;
                    OooO0oo(oooO0OO, attributes);
                    OooOO0O(oooO0OO, attributes);
                    OooOOO0(oooO0OO, attributes);
                    OooO0oO(oooO0OO, attributes);
                    for (int i2 = 0; i2 < attributes.getLength(); i2++) {
                        String strTrim2 = attributes.getValue(i2).trim();
                        int iOooO00o2 = com.aspose.slides.internal.p472w8.OooO00o.OooO00o(attributes, i2);
                        if (iOooO00o2 == 6) {
                            oooO0OO.f86359OooOOOO = OooOo00(strTrim2);
                        } else if (iOooO00o2 == 7) {
                            oooO0OO.f86360OooOOOo = OooOo00(strTrim2);
                        } else if (iOooO00o2 != 49) {
                            continue;
                        } else {
                            C25345OooO0o.OooOOOO oooOOOOOooOo003 = OooOo00(strTrim2);
                            oooO0OO.f86361OooOOo0 = oooOOOOOooOo003;
                            if (oooOOOOOooOo003.OooO0o()) {
                                throw new C25396OooO0oo("Invalid <circle> element. r cannot be negative");
                            }
                        }
                    }
                    this.f86176OooO0O0.OooO0OO(oooO0OO);
                    return;
                case 3:
                    if (this.f86176OooO0O0 == null) {
                        throw new C25396OooO0oo("Invalid document. Root element must be <svg>");
                    }
                    C25345OooO0o.C25346OooO0Oo c25346OooO0Oo = new C25345OooO0o.C25346OooO0Oo();
                    c25346OooO0Oo.f86520OooO00o = this.f86175OooO00o;
                    c25346OooO0Oo.f86521OooO0O0 = this.f86176OooO0O0;
                    OooO0oo(c25346OooO0Oo, attributes);
                    OooOO0O(c25346OooO0Oo, attributes);
                    OooOOO0(c25346OooO0Oo, attributes);
                    OooO0oO(c25346OooO0Oo, attributes);
                    for (int i3 = 0; i3 < attributes.getLength(); i3++) {
                        String strTrim3 = attributes.getValue(i3).trim();
                        if (com.aspose.slides.internal.p472w8.OooO00o.OooO00o(attributes, i3) == 3) {
                            if ("objectBoundingBox".equals(strTrim3)) {
                                c25346OooO0Oo.f86362OooOOOO = Boolean.FALSE;
                            } else {
                                if (!"userSpaceOnUse".equals(strTrim3)) {
                                    throw new C25396OooO0oo("Invalid value for attribute clipPathUnits");
                                }
                                c25346OooO0Oo.f86362OooOOOO = Boolean.TRUE;
                            }
                        }
                    }
                    this.f86176OooO0O0.OooO0OO(c25346OooO0Oo);
                    this.f86176OooO0O0 = c25346OooO0Oo;
                    return;
                case 4:
                    if (this.f86176OooO0O0 == null) {
                        throw new C25396OooO0oo("Invalid document. Root element must be <svg>");
                    }
                    C25345OooO0o.C25348OooO0oO c25348OooO0oO = new C25345OooO0o.C25348OooO0oO();
                    c25348OooO0oO.f86520OooO00o = this.f86175OooO00o;
                    c25348OooO0oO.f86521OooO0O0 = this.f86176OooO0O0;
                    OooO0oo(c25348OooO0oO, attributes);
                    OooOO0O(c25348OooO0oO, attributes);
                    OooOOO0(c25348OooO0oO, attributes);
                    this.f86176OooO0O0.OooO0OO(c25348OooO0oO);
                    this.f86176OooO0O0 = c25348OooO0oO;
                    return;
                case 5:
                case 26:
                    this.f86180OooO0o0 = true;
                    this.f86179OooO0o = enumC25331OooO0oO;
                    return;
                case 6:
                    if (this.f86176OooO0O0 == null) {
                        throw new C25396OooO0oo("Invalid document. Root element must be <svg>");
                    }
                    C25345OooO0o.C25349OooO0oo c25349OooO0oo = new C25345OooO0o.C25349OooO0oo();
                    c25349OooO0oo.f86520OooO00o = this.f86175OooO00o;
                    c25349OooO0oo.f86521OooO0O0 = this.f86176OooO0O0;
                    OooO0oo(c25349OooO0oo, attributes);
                    OooOO0O(c25349OooO0oo, attributes);
                    OooOOO0(c25349OooO0oo, attributes);
                    OooO0oO(c25349OooO0oo, attributes);
                    for (int i4 = 0; i4 < attributes.getLength(); i4++) {
                        String strTrim4 = attributes.getValue(i4).trim();
                        int iOooO00o3 = com.aspose.slides.internal.p472w8.OooO00o.OooO00o(attributes, i4);
                        if (iOooO00o3 == 6) {
                            c25349OooO0oo.f86367OooOOOO = OooOo00(strTrim4);
                        } else if (iOooO00o3 == 7) {
                            c25349OooO0oo.f86368OooOOOo = OooOo00(strTrim4);
                        } else if (iOooO00o3 == 56) {
                            C25345OooO0o.OooOOOO oooOOOOOooOo004 = OooOo00(strTrim4);
                            c25349OooO0oo.f86370OooOOo0 = oooOOOOOooOo004;
                            if (oooOOOOOooOo004.OooO0o()) {
                                throw new C25396OooO0oo("Invalid <ellipse> element. rx cannot be negative");
                            }
                        } else if (iOooO00o3 != 57) {
                            continue;
                        } else {
                            C25345OooO0o.OooOOOO oooOOOOOooOo005 = OooOo00(strTrim4);
                            c25349OooO0oo.f86369OooOOo = oooOOOOOooOo005;
                            if (oooOOOOOooOo005.OooO0o()) {
                                throw new C25396OooO0oo("Invalid <ellipse> element. ry cannot be negative");
                            }
                        }
                    }
                    this.f86176OooO0O0.OooO0OO(c25349OooO0oo);
                    return;
                case 8:
                    if (this.f86176OooO0O0 == null) {
                        throw new C25396OooO0oo("Invalid document. Root element must be <svg>");
                    }
                    C25345OooO0o.OooOOO oooOOO = new C25345OooO0o.OooOOO();
                    oooOOO.f86520OooO00o = this.f86175OooO00o;
                    oooOOO.f86521OooO0O0 = this.f86176OooO0O0;
                    OooO0oo(oooOOO, attributes);
                    OooOO0O(oooOOO, attributes);
                    OooOOO0(oooOOO, attributes);
                    OooO0oO(oooOOO, attributes);
                    for (int i5 = 0; i5 < attributes.getLength(); i5++) {
                        String strTrim5 = attributes.getValue(i5).trim();
                        int iOooO00o4 = com.aspose.slides.internal.p472w8.OooO00o.OooO00o(attributes, i5);
                        if (iOooO00o4 == 25) {
                            C25345OooO0o.OooOOOO oooOOOOOooOo006 = OooOo00(strTrim5);
                            oooOOO.f86380OooOOoo = oooOOOOOooOo006;
                            if (oooOOOOOooOo006.OooO0o()) {
                                throw new C25396OooO0oo("Invalid <use> element. height cannot be negative");
                            }
                        } else if (iOooO00o4 != 26) {
                            if (iOooO00o4 != 48) {
                                switch (iOooO00o4) {
                                    case 81:
                                        C25345OooO0o.OooOOOO oooOOOOOooOo007 = OooOo00(strTrim5);
                                        oooOOO.f86378OooOOo = oooOOOOOooOo007;
                                        if (oooOOOOOooOo007.OooO0o()) {
                                            throw new C25396OooO0oo("Invalid <use> element. width cannot be negative");
                                        }
                                        break;
                                        break;
                                    case 82:
                                        oooOOO.f86377OooOOOo = OooOo00(strTrim5);
                                        break;
                                    case 83:
                                        oooOOO.f86379OooOOo0 = OooOo00(strTrim5);
                                        break;
                                }
                            } else {
                                OooOoO0(oooOOO, strTrim5);
                            }
                        } else if ("".equals(attributes.getURI(i5)) || "http://www.w3.org/1999/xlink".equals(attributes.getURI(i5))) {
                            oooOOO.f86376OooOOOO = strTrim5;
                        }
                    }
                    this.f86176OooO0O0.OooO0OO(oooOOO);
                    this.f86176OooO0O0 = oooOOO;
                    return;
                case 9:
                    if (this.f86176OooO0O0 == null) {
                        throw new C25396OooO0oo("Invalid document. Root element must be <svg>");
                    }
                    C25345OooO0o.C25351OooOOOo c25351OooOOOo = new C25345OooO0o.C25351OooOOOo();
                    c25351OooOOOo.f86520OooO00o = this.f86175OooO00o;
                    c25351OooOOOo.f86521OooO0O0 = this.f86176OooO0O0;
                    OooO0oo(c25351OooOOOo, attributes);
                    OooOO0O(c25351OooOOOo, attributes);
                    OooOOO0(c25351OooOOOo, attributes);
                    OooO0oO(c25351OooOOOo, attributes);
                    for (int i6 = 0; i6 < attributes.getLength(); i6++) {
                        String strTrim6 = attributes.getValue(i6).trim();
                        switch (com.aspose.slides.internal.p472w8.OooO00o.OooO00o(attributes, i6)) {
                            case 84:
                                c25351OooOOOo.f86384OooOOOO = OooOo00(strTrim6);
                                break;
                            case 85:
                                c25351OooOOOo.f86385OooOOOo = OooOo00(strTrim6);
                                break;
                            case 86:
                                c25351OooOOOo.f86387OooOOo0 = OooOo00(strTrim6);
                                break;
                            case 87:
                                c25351OooOOOo.f86386OooOOo = OooOo00(strTrim6);
                                break;
                        }
                    }
                    this.f86176OooO0O0.OooO0OO(c25351OooOOOo);
                    return;
                case 10:
                    if (this.f86176OooO0O0 == null) {
                        throw new C25396OooO0oo("Invalid document. Root element must be <svg>");
                    }
                    C25345OooO0o.C25374Oooo0o0 c25374Oooo0o0 = new C25345OooO0o.C25374Oooo0o0();
                    c25374Oooo0o0.f86520OooO00o = this.f86175OooO00o;
                    c25374Oooo0o0.f86521OooO0O0 = this.f86176OooO0O0;
                    OooO0oo(c25374Oooo0o0, attributes);
                    OooOO0O(c25374Oooo0o0, attributes);
                    OooO(c25374Oooo0o0, attributes);
                    for (int i7 = 0; i7 < attributes.getLength(); i7++) {
                        String strTrim7 = attributes.getValue(i7).trim();
                        switch (com.aspose.slides.internal.p472w8.OooO00o.OooO00o(attributes, i7)) {
                            case 84:
                                c25374Oooo0o0.f86523OooOOO0 = OooOo00(strTrim7);
                                break;
                            case 85:
                                c25374Oooo0o0.f86522OooOOO = OooOo00(strTrim7);
                                break;
                            case 86:
                                c25374Oooo0o0.f86524OooOOOO = OooOo00(strTrim7);
                                break;
                            case 87:
                                c25374Oooo0o0.f86525OooOOOo = OooOo00(strTrim7);
                                break;
                        }
                    }
                    this.f86176OooO0O0.OooO0OO(c25374Oooo0o0);
                    this.f86176OooO0O0 = c25374Oooo0o0;
                    return;
                case 11:
                    if (this.f86176OooO0O0 == null) {
                        throw new C25396OooO0oo("Invalid document. Root element must be <svg>");
                    }
                    C25345OooO0o.C25353OooOOo0 c25353OooOOo0 = new C25345OooO0o.C25353OooOOo0();
                    c25353OooOOo0.f86520OooO00o = this.f86175OooO00o;
                    c25353OooOOo0.f86521OooO0O0 = this.f86176OooO0O0;
                    OooO0oo(c25353OooOOo0, attributes);
                    OooOO0O(c25353OooOOo0, attributes);
                    OooO0oO(c25353OooOOo0, attributes);
                    OooOOO(c25353OooOOo0, attributes);
                    for (int i8 = 0; i8 < attributes.getLength(); i8++) {
                        String strTrim8 = attributes.getValue(i8).trim();
                        int iOooO00o5 = com.aspose.slides.internal.p472w8.OooO00o.OooO00o(attributes, i8);
                        if (iOooO00o5 != 41) {
                            if (iOooO00o5 == 50) {
                                c25353OooOOo0.f86394OooOOo0 = OooOo00(strTrim8);
                            } else if (iOooO00o5 != 51) {
                                switch (iOooO00o5) {
                                    case 32:
                                        C25345OooO0o.OooOOOO oooOOOOOooOo008 = OooOo00(strTrim8);
                                        c25353OooOOo0.f86397OooOo00 = oooOOOOOooOo008;
                                        if (oooOOOOOooOo008.OooO0o()) {
                                            throw new C25396OooO0oo("Invalid <marker> element. markerHeight cannot be negative");
                                        }
                                        continue;
                                        break;
                                    case 33:
                                        if (!"strokeWidth".equals(strTrim8)) {
                                            if (!"userSpaceOnUse".equals(strTrim8)) {
                                                throw new C25396OooO0oo("Invalid value for attribute markerUnits");
                                            }
                                            c25353OooOOo0.f86392OooOOOo = true;
                                        } else {
                                            c25353OooOOo0.f86392OooOOOo = false;
                                            continue;
                                        }
                                        break;
                                    case 34:
                                        C25345OooO0o.OooOOOO oooOOOOOooOo009 = OooOo00(strTrim8);
                                        c25353OooOOo0.f86395OooOOoo = oooOOOOOooOo009;
                                        if (oooOOOOOooOo009.OooO0o()) {
                                            throw new C25396OooO0oo("Invalid <marker> element. markerWidth cannot be negative");
                                        }
                                        break;
                                }
                            } else {
                                c25353OooOOo0.f86393OooOOo = OooOo00(strTrim8);
                            }
                        } else if ("auto".equals(strTrim8)) {
                            c25353OooOOo0.f86396OooOo0 = Float.valueOf(Float.NaN);
                        } else {
                            c25353OooOOo0.f86396OooOo0 = Float.valueOf(OooOOo0(strTrim8));
                        }
                    }
                    this.f86176OooO0O0.OooO0OO(c25353OooOOo0);
                    this.f86176OooO0O0 = c25353OooOOo0;
                    return;
                case 12:
                    if (this.f86176OooO0O0 == null) {
                        throw new C25396OooO0oo("Invalid document. Root element must be <svg>");
                    }
                    C25345OooO0o.C25352OooOOo c25352OooOOo = new C25345OooO0o.C25352OooOOo();
                    c25352OooOOo.f86520OooO00o = this.f86175OooO00o;
                    c25352OooOOo.f86521OooO0O0 = this.f86176OooO0O0;
                    OooO0oo(c25352OooOOo, attributes);
                    OooOO0O(c25352OooOOo, attributes);
                    OooO0oO(c25352OooOOo, attributes);
                    for (int i9 = 0; i9 < attributes.getLength(); i9++) {
                        String strTrim9 = attributes.getValue(i9).trim();
                        int iOooO00o6 = com.aspose.slides.internal.p472w8.OooO00o.OooO00o(attributes, i9);
                        if (iOooO00o6 == 25) {
                            C25345OooO0o.OooOOOO oooOOOOOooOo0010 = OooOo00(strTrim9);
                            c25352OooOOo.f86391OooOOo0 = oooOOOOOooOo0010;
                            if (oooOOOOOooOo0010.OooO0o()) {
                                throw new C25396OooO0oo("Invalid <mask> element. height cannot be negative");
                            }
                        } else if (iOooO00o6 != 36) {
                            if (iOooO00o6 != 37) {
                                switch (iOooO00o6) {
                                    case 81:
                                        C25345OooO0o.OooOOOO oooOOOOOooOo0011 = OooOo00(strTrim9);
                                        c25352OooOOo.f86390OooOOOo = oooOOOOOooOo0011;
                                        if (oooOOOOOooOo0011.OooO0o()) {
                                            throw new C25396OooO0oo("Invalid <mask> element. width cannot be negative");
                                        }
                                        break;
                                        break;
                                    case 82:
                                        OooOo00(strTrim9);
                                        break;
                                    case 83:
                                        OooOo00(strTrim9);
                                        break;
                                }
                            } else if ("objectBoundingBox".equals(strTrim9)) {
                                c25352OooOOo.f86388OooOOO = Boolean.FALSE;
                            } else {
                                if (!"userSpaceOnUse".equals(strTrim9)) {
                                    throw new C25396OooO0oo("Invalid value for attribute maskUnits");
                                }
                                c25352OooOOo.f86388OooOOO = Boolean.TRUE;
                            }
                        } else if ("objectBoundingBox".equals(strTrim9)) {
                            c25352OooOOo.f86389OooOOOO = Boolean.FALSE;
                        } else {
                            if (!"userSpaceOnUse".equals(strTrim9)) {
                                throw new C25396OooO0oo("Invalid value for attribute maskContentUnits");
                            }
                            c25352OooOOo.f86389OooOOOO = Boolean.TRUE;
                        }
                    }
                    this.f86176OooO0O0.OooO0OO(c25352OooOOo);
                    this.f86176OooO0O0 = c25352OooOOo;
                    return;
                case 13:
                    OooOooO(attributes);
                    return;
                case 14:
                    if (this.f86176OooO0O0 == null) {
                        throw new C25396OooO0oo("Invalid document. Root element must be <svg>");
                    }
                    C25345OooO0o.OooOo oooOo = new C25345OooO0o.OooOo();
                    oooOo.f86520OooO00o = this.f86175OooO00o;
                    oooOo.f86521OooO0O0 = this.f86176OooO0O0;
                    OooO0oo(oooOo, attributes);
                    OooOO0O(oooOo, attributes);
                    OooO0oO(oooOo, attributes);
                    OooOOO(oooOo, attributes);
                    for (int i10 = 0; i10 < attributes.getLength(); i10++) {
                        String strTrim10 = attributes.getValue(i10).trim();
                        int iOooO00o7 = com.aspose.slides.internal.p472w8.OooO00o.OooO00o(attributes, i10);
                        if (iOooO00o7 == 25) {
                            C25345OooO0o.OooOOOO oooOOOOOooOo0012 = OooOo00(strTrim10);
                            oooOo.f86404OooOo0O = oooOOOOOooOo0012;
                            if (oooOOOOOooOo0012.OooO0o()) {
                                throw new C25396OooO0oo("Invalid <pattern> element. height cannot be negative");
                            }
                        } else if (iOooO00o7 != 26) {
                            switch (iOooO00o7) {
                                case 44:
                                    if (!"objectBoundingBox".equals(strTrim10)) {
                                        if (!"userSpaceOnUse".equals(strTrim10)) {
                                            throw new C25396OooO0oo("Invalid value for attribute patternContentUnits");
                                        }
                                        oooOo.f86400OooOOo0 = Boolean.TRUE;
                                    } else {
                                        oooOo.f86400OooOOo0 = Boolean.FALSE;
                                    }
                                    break;
                                case 45:
                                    oooOo.f86399OooOOo = OooOoOO(strTrim10);
                                    break;
                                case 46:
                                    if (!"objectBoundingBox".equals(strTrim10)) {
                                        if (!"userSpaceOnUse".equals(strTrim10)) {
                                            throw new C25396OooO0oo("Invalid value for attribute patternUnits");
                                        }
                                        oooOo.f86398OooOOOo = Boolean.TRUE;
                                    } else {
                                        oooOo.f86398OooOOOo = Boolean.FALSE;
                                    }
                                    break;
                                default:
                                    switch (iOooO00o7) {
                                        case 81:
                                            C25345OooO0o.OooOOOO oooOOOOOooOo0013 = OooOo00(strTrim10);
                                            oooOo.f86402OooOo0 = oooOOOOOooOo0013;
                                            if (oooOOOOOooOo0013.OooO0o()) {
                                                throw new C25396OooO0oo("Invalid <pattern> element. width cannot be negative");
                                            }
                                            break;
                                            break;
                                        case 82:
                                            oooOo.f86401OooOOoo = OooOo00(strTrim10);
                                            break;
                                        case 83:
                                            oooOo.f86403OooOo00 = OooOo00(strTrim10);
                                            break;
                                    }
                                    break;
                            }
                        } else if ("".equals(attributes.getURI(i10)) || "http://www.w3.org/1999/xlink".equals(attributes.getURI(i10))) {
                            oooOo.f86405OooOo0o = strTrim10;
                        }
                    }
                    this.f86176OooO0O0.OooO0OO(oooOo);
                    this.f86176OooO0O0 = oooOo;
                    return;
                case 15:
                    if (this.f86176OooO0O0 == null) {
                        throw new C25396OooO0oo("Invalid document. Root element must be <svg>");
                    }
                    C25345OooO0o.C25358OooOoO c25358OooOoO = new C25345OooO0o.C25358OooOoO();
                    c25358OooOoO.f86520OooO00o = this.f86175OooO00o;
                    c25358OooOoO.f86521OooO0O0 = this.f86176OooO0O0;
                    OooO0oo(c25358OooOoO, attributes);
                    OooOO0O(c25358OooOoO, attributes);
                    OooOOO0(c25358OooOoO, attributes);
                    OooO0oO(c25358OooOoO, attributes);
                    OooOO0(c25358OooOoO, attributes, "polygon");
                    this.f86176OooO0O0.OooO0OO(c25358OooOoO);
                    return;
                case 16:
                    if (this.f86176OooO0O0 == null) {
                        throw new C25396OooO0oo("Invalid document. Root element must be <svg>");
                    }
                    C25345OooO0o.C25359OooOoO0 c25359OooOoO0 = new C25345OooO0o.C25359OooOoO0();
                    c25359OooOoO0.f86520OooO00o = this.f86175OooO00o;
                    c25359OooOoO0.f86521OooO0O0 = this.f86176OooO0O0;
                    OooO0oo(c25359OooOoO0, attributes);
                    OooOO0O(c25359OooOoO0, attributes);
                    OooOOO0(c25359OooOoO0, attributes);
                    OooO0oO(c25359OooOoO0, attributes);
                    OooOO0(c25359OooOoO0, attributes, "polyline");
                    this.f86176OooO0O0.OooO0OO(c25359OooOoO0);
                    return;
                case 17:
                    if (this.f86176OooO0O0 == null) {
                        throw new C25396OooO0oo("Invalid document. Root element must be <svg>");
                    }
                    C25345OooO0o.C25369Oooo c25369Oooo = new C25345OooO0o.C25369Oooo();
                    c25369Oooo.f86520OooO00o = this.f86175OooO00o;
                    c25369Oooo.f86521OooO0O0 = this.f86176OooO0O0;
                    OooO0oo(c25369Oooo, attributes);
                    OooOO0O(c25369Oooo, attributes);
                    OooO(c25369Oooo, attributes);
                    for (int i11 = 0; i11 < attributes.getLength(); i11++) {
                        String strTrim11 = attributes.getValue(i11).trim();
                        int iOooO00o8 = com.aspose.slides.internal.p472w8.OooO00o.OooO00o(attributes, i11);
                        if (iOooO00o8 == 6) {
                            c25369Oooo.f86500OooOOO0 = OooOo00(strTrim11);
                        } else if (iOooO00o8 == 7) {
                            c25369Oooo.f86499OooOOO = OooOo00(strTrim11);
                        } else if (iOooO00o8 == 11) {
                            c25369Oooo.f86502OooOOOo = OooOo00(strTrim11);
                        } else if (iOooO00o8 == 12) {
                            c25369Oooo.f86503OooOOo0 = OooOo00(strTrim11);
                        } else if (iOooO00o8 != 49) {
                            continue;
                        } else {
                            C25345OooO0o.OooOOOO oooOOOOOooOo0014 = OooOo00(strTrim11);
                            c25369Oooo.f86501OooOOOO = oooOOOOOooOo0014;
                            if (oooOOOOOooOo0014.OooO0o()) {
                                throw new C25396OooO0oo("Invalid <radialGradient> element. r cannot be negative");
                            }
                        }
                    }
                    this.f86176OooO0O0.OooO0OO(c25369Oooo);
                    this.f86176OooO0O0 = c25369Oooo;
                    return;
                case 18:
                    if (this.f86176OooO0O0 == null) {
                        throw new C25396OooO0oo("Invalid document. Root element must be <svg>");
                    }
                    C25345OooO0o.C25360OooOoOO c25360OooOoOO = new C25345OooO0o.C25360OooOoOO();
                    c25360OooOoOO.f86520OooO00o = this.f86175OooO00o;
                    c25360OooOoOO.f86521OooO0O0 = this.f86176OooO0O0;
                    OooO0oo(c25360OooOoOO, attributes);
                    OooOO0O(c25360OooOoOO, attributes);
                    OooOOO0(c25360OooOoOO, attributes);
                    OooO0oO(c25360OooOoOO, attributes);
                    for (int i12 = 0; i12 < attributes.getLength(); i12++) {
                        String strTrim12 = attributes.getValue(i12).trim();
                        int iOooO00o9 = com.aspose.slides.internal.p472w8.OooO00o.OooO00o(attributes, i12);
                        if (iOooO00o9 == 25) {
                            C25345OooO0o.OooOOOO oooOOOOOooOo0015 = OooOo00(strTrim12);
                            c25360OooOoOO.f86416OooOOo = oooOOOOOooOo0015;
                            if (oooOOOOOooOo0015.OooO0o()) {
                                throw new C25396OooO0oo("Invalid <rect> element. height cannot be negative");
                            }
                        } else if (iOooO00o9 == 56) {
                            C25345OooO0o.OooOOOO oooOOOOOooOo0016 = OooOo00(strTrim12);
                            c25360OooOoOO.f86418OooOOoo = oooOOOOOooOo0016;
                            if (oooOOOOOooOo0016.OooO0o()) {
                                throw new C25396OooO0oo("Invalid <rect> element. rx cannot be negative");
                            }
                        } else if (iOooO00o9 != 57) {
                            switch (iOooO00o9) {
                                case 81:
                                    C25345OooO0o.OooOOOO oooOOOOOooOo0017 = OooOo00(strTrim12);
                                    c25360OooOoOO.f86417OooOOo0 = oooOOOOOooOo0017;
                                    if (oooOOOOOooOo0017.OooO0o()) {
                                        throw new C25396OooO0oo("Invalid <rect> element. width cannot be negative");
                                    }
                                    break;
                                    break;
                                case 82:
                                    c25360OooOoOO.f86414OooOOOO = OooOo00(strTrim12);
                                    break;
                                case 83:
                                    c25360OooOoOO.f86415OooOOOo = OooOo00(strTrim12);
                                    break;
                            }
                        } else {
                            C25345OooO0o.OooOOOO oooOOOOOooOo0018 = OooOo00(strTrim12);
                            c25360OooOoOO.f86419OooOo00 = oooOOOOOooOo0018;
                            if (oooOOOOOooOo0018.OooO0o()) {
                                throw new C25396OooO0oo("Invalid <rect> element. ry cannot be negative");
                            }
                        }
                    }
                    this.f86176OooO0O0.OooO0OO(c25360OooOoOO);
                    return;
                case 19:
                    if (this.f86176OooO0O0 == null) {
                        throw new C25396OooO0oo("Invalid document. Root element must be <svg>");
                    }
                    C25345OooO0o.C25362OooOoo0 c25362OooOoo0 = new C25345OooO0o.C25362OooOoo0();
                    c25362OooOoo0.f86520OooO00o = this.f86175OooO00o;
                    c25362OooOoo0.f86521OooO0O0 = this.f86176OooO0O0;
                    OooO0oo(c25362OooOoo0, attributes);
                    OooOO0O(c25362OooOoo0, attributes);
                    this.f86176OooO0O0.OooO0OO(c25362OooOoo0);
                    this.f86176OooO0O0 = c25362OooOoo0;
                    return;
                case 20:
                    C25345OooO0o.Oooo0 oooo02 = this.f86176OooO0O0;
                    if (oooo02 == null) {
                        throw new C25396OooO0oo("Invalid document. Root element must be <svg>");
                    }
                    if (!(oooo02 instanceof C25345OooO0o.OooO)) {
                        throw new C25396OooO0oo("Invalid document. <stop> elements are only valid inside <linearGradient> or <radialGradient> elements.");
                    }
                    C25345OooO0o.C25361OooOoo c25361OooOoo = new C25345OooO0o.C25361OooOoo();
                    c25361OooOoo.f86520OooO00o = this.f86175OooO00o;
                    c25361OooOoo.f86521OooO0O0 = this.f86176OooO0O0;
                    OooO0oo(c25361OooOoo, attributes);
                    OooOO0O(c25361OooOoo, attributes);
                    for (int i13 = 0; i13 < attributes.getLength(); i13++) {
                        String strTrim13 = attributes.getValue(i13).trim();
                        if (com.aspose.slides.internal.p472w8.OooO00o.OooO00o(attributes, i13) == 39) {
                            if (strTrim13.length() == 0) {
                                throw new C25396OooO0oo("Invalid offset value in <stop> (empty string)");
                            }
                            int length = strTrim13.length();
                            if (androidx.core.content.OooO0O0.OooO00o(1, strTrim13) == '%') {
                                length--;
                                z = true;
                            } else {
                                z = false;
                            }
                            try {
                                float fOooOOOo = OooOOOo(length, strTrim13);
                                float f = 100.0f;
                                if (z) {
                                    fOooOOOo /= 100.0f;
                                }
                                if (fOooOOOo < 0.0f) {
                                    f = 0.0f;
                                } else if (fOooOOOo <= 100.0f) {
                                    f = fOooOOOo;
                                }
                                c25361OooOoo.f86420OooO0oo = Float.valueOf(f);
                            } catch (NumberFormatException e) {
                                throw new C25396OooO0oo("Invalid offset value in <stop>: ".concat(strTrim13), e);
                            }
                        }
                    }
                    this.f86176OooO0O0.OooO0OO(c25361OooOoo);
                    this.f86176OooO0O0 = c25361OooOoo;
                    return;
                case 21:
                    if (this.f86176OooO0O0 == null) {
                        throw new C25396OooO0oo("Invalid document. Root element must be <svg>");
                    }
                    String str4 = "all";
                    boolean zEquals = true;
                    for (int i14 = 0; i14 < attributes.getLength(); i14++) {
                        String strTrim14 = attributes.getValue(i14).trim();
                        int iOooO00o10 = com.aspose.slides.internal.p472w8.OooO00o.OooO00o(attributes, i14);
                        if (iOooO00o10 == 38) {
                            str4 = strTrim14;
                        } else if (iOooO00o10 == 77) {
                            zEquals = strTrim14.equals("text/css");
                        }
                    }
                    if (zEquals) {
                        C25334OooO0O0.OooO0o0 oooO0o0 = C25334OooO0O0.OooO0o0.f86314OooOo;
                        C25334OooO0O0.OooO0OO oooO0OO2 = new C25334OooO0O0.OooO0OO(str4);
                        oooO0OO2.OooOOo0();
                        for (C25334OooO0O0.OooO0o0 oooO0o02 : C25334OooO0O0.OooO0OO(oooO0OO2)) {
                            if (oooO0o02 == C25334OooO0O0.OooO0o0.f86315OooOo0o || oooO0o02 == oooO0o0) {
                                this.f86182OooO0oo = true;
                                return;
                            }
                        }
                    }
                    this.f86177OooO0OO = true;
                    this.f86178OooO0Oo = 1;
                    return;
                case 22:
                    if (this.f86176OooO0O0 == null) {
                        throw new C25396OooO0oo("Invalid document. Root element must be <svg>");
                    }
                    C25345OooO0o.C25378OoooO0 c25378OoooO0 = new C25345OooO0o.C25378OoooO0();
                    c25378OoooO0.f86520OooO00o = this.f86175OooO00o;
                    c25378OoooO0.f86521OooO0O0 = this.f86176OooO0O0;
                    OooO0oo(c25378OoooO0, attributes);
                    OooOO0O(c25378OoooO0, attributes);
                    OooOOO0(c25378OoooO0, attributes);
                    OooO0oO(c25378OoooO0, attributes);
                    this.f86176OooO0O0.OooO0OO(c25378OoooO0);
                    this.f86176OooO0O0 = c25378OoooO0;
                    return;
                case 23:
                    if (this.f86176OooO0O0 == null) {
                        throw new C25396OooO0oo("Invalid document. Root element must be <svg>");
                    }
                    C25345OooO0o.C25380OoooO0O c25380OoooO0O = new C25345OooO0o.C25380OoooO0O();
                    c25380OoooO0O.f86520OooO00o = this.f86175OooO00o;
                    c25380OoooO0O.f86521OooO0O0 = this.f86176OooO0O0;
                    OooO0oo(c25380OoooO0O, attributes);
                    OooOO0O(c25380OoooO0O, attributes);
                    OooO0oO(c25380OoooO0O, attributes);
                    OooOOO(c25380OoooO0O, attributes);
                    this.f86176OooO0O0.OooO0OO(c25380OoooO0O);
                    this.f86176OooO0O0 = c25380OoooO0O;
                    return;
                case 24:
                    if (this.f86176OooO0O0 == null) {
                        throw new C25396OooO0oo("Invalid document. Root element must be <svg>");
                    }
                    C25345OooO0o.o000oOoO o000oooo2 = new C25345OooO0o.o000oOoO();
                    o000oooo2.f86520OooO00o = this.f86175OooO00o;
                    o000oooo2.f86521OooO0O0 = this.f86176OooO0O0;
                    OooO0oo(o000oooo2, attributes);
                    OooOO0O(o000oooo2, attributes);
                    OooOOO0(o000oooo2, attributes);
                    OooO0oO(o000oooo2, attributes);
                    OooOO0o(o000oooo2, attributes);
                    this.f86176OooO0O0.OooO0OO(o000oooo2);
                    this.f86176OooO0O0 = o000oooo2;
                    return;
                case 25:
                    if (this.f86176OooO0O0 == null) {
                        throw new C25396OooO0oo("Invalid document. Root element must be <svg>");
                    }
                    C25345OooO0o.C25384OoooOo0 c25384OoooOo0 = new C25345OooO0o.C25384OoooOo0();
                    c25384OoooOo0.f86520OooO00o = this.f86175OooO00o;
                    c25384OoooOo0.f86521OooO0O0 = this.f86176OooO0O0;
                    OooO0oo(c25384OoooOo0, attributes);
                    OooOO0O(c25384OoooOo0, attributes);
                    OooO0oO(c25384OoooOo0, attributes);
                    for (int i15 = 0; i15 < attributes.getLength(); i15++) {
                        String strTrim15 = attributes.getValue(i15).trim();
                        int iOooO00o11 = com.aspose.slides.internal.p472w8.OooO00o.OooO00o(attributes, i15);
                        if (iOooO00o11 != 26) {
                            if (iOooO00o11 == 61) {
                                c25384OoooOo0.f86532OooOOOO = OooOo00(strTrim15);
                            }
                        } else if ("".equals(attributes.getURI(i15)) || "http://www.w3.org/1999/xlink".equals(attributes.getURI(i15))) {
                            c25384OoooOo0.f86531OooOOO = strTrim15;
                        }
                    }
                    this.f86176OooO0O0.OooO0OO(c25384OoooOo0);
                    this.f86176OooO0O0 = c25384OoooOo0;
                    C25345OooO0o.Oooo0 oooo03 = c25384OoooOo0.f86521OooO0O0;
                    if (oooo03 instanceof C25345OooO0o.InterfaceC25386OoooOoo) {
                        c25384OoooOo0.f86533OooOOOo = (C25345OooO0o.InterfaceC25386OoooOoo) oooo03;
                        return;
                    } else {
                        c25384OoooOo0.f86533OooOOOo = ((C25345OooO0o.InterfaceC25382OoooOOO) oooo03).OooO0O0();
                        return;
                    }
                case 27:
                    C25345OooO0o.Oooo0 oooo04 = this.f86176OooO0O0;
                    if (oooo04 == null) {
                        throw new C25396OooO0oo("Invalid document. Root element must be <svg>");
                    }
                    if (!(oooo04 instanceof C25345OooO0o.AbstractC25383OoooOOo)) {
                        throw new C25396OooO0oo("Invalid document. <tref> elements are only valid inside <text> or <tspan> elements.");
                    }
                    C25345OooO0o.C25377OoooO c25377OoooO = new C25345OooO0o.C25377OoooO();
                    c25377OoooO.f86520OooO00o = this.f86175OooO00o;
                    c25377OoooO.f86521OooO0O0 = this.f86176OooO0O0;
                    OooO0oo(c25377OoooO, attributes);
                    OooOO0O(c25377OoooO, attributes);
                    OooO0oO(c25377OoooO, attributes);
                    for (int i16 = 0; i16 < attributes.getLength(); i16++) {
                        String strTrim16 = attributes.getValue(i16).trim();
                        if (com.aspose.slides.internal.p472w8.OooO00o.OooO00o(attributes, i16) == 26 && ("".equals(attributes.getURI(i16)) || "http://www.w3.org/1999/xlink".equals(attributes.getURI(i16)))) {
                            c25377OoooO.f86527OooOOO = strTrim16;
                        }
                    }
                    this.f86176OooO0O0.OooO0OO(c25377OoooO);
                    C25345OooO0o.Oooo0 oooo05 = c25377OoooO.f86521OooO0O0;
                    if (oooo05 instanceof C25345OooO0o.InterfaceC25386OoooOoo) {
                        c25377OoooO.f86528OooOOOO = (C25345OooO0o.InterfaceC25386OoooOoo) oooo05;
                        return;
                    } else {
                        c25377OoooO.f86528OooOOOO = ((C25345OooO0o.InterfaceC25382OoooOOO) oooo05).OooO0O0();
                        return;
                    }
                case 28:
                    C25345OooO0o.Oooo0 oooo06 = this.f86176OooO0O0;
                    if (oooo06 == null) {
                        throw new C25396OooO0oo("Invalid document. Root element must be <svg>");
                    }
                    if (!(oooo06 instanceof C25345OooO0o.AbstractC25383OoooOOo)) {
                        throw new C25396OooO0oo("Invalid document. <tspan> elements are only valid inside <text> or other <tspan> elements.");
                    }
                    C25345OooO0o.C25381OoooOO0 c25381OoooOO0 = new C25345OooO0o.C25381OoooOO0();
                    c25381OoooOO0.f86520OooO00o = this.f86175OooO00o;
                    c25381OoooOO0.f86521OooO0O0 = this.f86176OooO0O0;
                    OooO0oo(c25381OoooOO0, attributes);
                    OooOO0O(c25381OoooOO0, attributes);
                    OooO0oO(c25381OoooOO0, attributes);
                    OooOO0o(c25381OoooOO0, attributes);
                    this.f86176OooO0O0.OooO0OO(c25381OoooOO0);
                    this.f86176OooO0O0 = c25381OoooOO0;
                    C25345OooO0o.Oooo0 oooo07 = c25381OoooOO0.f86521OooO0O0;
                    if (oooo07 instanceof C25345OooO0o.InterfaceC25386OoooOoo) {
                        c25381OoooOO0.f86530OooOOo = (C25345OooO0o.InterfaceC25386OoooOoo) oooo07;
                        return;
                    } else {
                        c25381OoooOO0.f86530OooOOo = ((C25345OooO0o.InterfaceC25382OoooOOO) oooo07).OooO0O0();
                        return;
                    }
                case 29:
                    if (this.f86176OooO0O0 == null) {
                        throw new C25396OooO0oo("Invalid document. Root element must be <svg>");
                    }
                    C25345OooO0o.C25389OooooO0 c25389OooooO0 = new C25345OooO0o.C25389OooooO0();
                    c25389OooooO0.f86520OooO00o = this.f86175OooO00o;
                    c25389OooooO0.f86521OooO0O0 = this.f86176OooO0O0;
                    OooO0oo(c25389OooooO0, attributes);
                    OooOO0O(c25389OooooO0, attributes);
                    OooOOO0(c25389OooooO0, attributes);
                    OooO0oO(c25389OooooO0, attributes);
                    for (int i17 = 0; i17 < attributes.getLength(); i17++) {
                        String strTrim17 = attributes.getValue(i17).trim();
                        int iOooO00o12 = com.aspose.slides.internal.p472w8.OooO00o.OooO00o(attributes, i17);
                        if (iOooO00o12 == 25) {
                            C25345OooO0o.OooOOOO oooOOOOOooOo0019 = OooOo00(strTrim17);
                            c25389OooooO0.f86547OooOOoo = oooOOOOOooOo0019;
                            if (oooOOOOOooOo0019.OooO0o()) {
                                throw new C25396OooO0oo("Invalid <use> element. height cannot be negative");
                            }
                        } else if (iOooO00o12 != 26) {
                            switch (iOooO00o12) {
                                case 81:
                                    C25345OooO0o.OooOOOO oooOOOOOooOo0020 = OooOo00(strTrim17);
                                    c25389OooooO0.f86545OooOOo = oooOOOOOooOo0020;
                                    if (oooOOOOOooOo0020.OooO0o()) {
                                        throw new C25396OooO0oo("Invalid <use> element. width cannot be negative");
                                    }
                                    break;
                                    break;
                                case 82:
                                    c25389OooooO0.f86544OooOOOo = OooOo00(strTrim17);
                                    break;
                                case 83:
                                    c25389OooooO0.f86546OooOOo0 = OooOo00(strTrim17);
                                    break;
                            }
                        } else if ("".equals(attributes.getURI(i17)) || "http://www.w3.org/1999/xlink".equals(attributes.getURI(i17))) {
                            c25389OooooO0.f86543OooOOOO = strTrim17;
                        }
                    }
                    this.f86176OooO0O0.OooO0OO(c25389OooooO0);
                    this.f86176OooO0O0 = c25389OooooO0;
                    return;
                case 30:
                    if (this.f86176OooO0O0 == null) {
                        throw new C25396OooO0oo("Invalid document. Root element must be <svg>");
                    }
                    C25345OooO0o.C25390OooooOO c25390OooooOO = new C25345OooO0o.C25390OooooOO();
                    c25390OooooOO.f86520OooO00o = this.f86175OooO00o;
                    c25390OooooOO.f86521OooO0O0 = this.f86176OooO0O0;
                    OooO0oo(c25390OooooOO, attributes);
                    OooO0oO(c25390OooooOO, attributes);
                    OooOOO(c25390OooooOO, attributes);
                    this.f86176OooO0O0.OooO0OO(c25390OooooOO);
                    this.f86176OooO0O0 = c25390OooooOO;
                    return;
                default:
                    this.f86177OooO0OO = true;
                    this.f86178OooO0Oo = 1;
                    return;
            }
        }
    }

    public final void Oooo00O(String str) throws C25396OooO0oo {
        if (this.f86177OooO0OO) {
            return;
        }
        if (this.f86180OooO0o0) {
            if (this.f86181OooO0oO == null) {
                this.f86181OooO0oO = new StringBuilder(str.length());
            }
            this.f86181OooO0oO.append(str);
        } else if (this.f86182OooO0oo) {
            if (this.f86174OooO == null) {
                this.f86174OooO = new StringBuilder(str.length());
            }
            this.f86174OooO.append(str);
        } else if (this.f86176OooO0O0 instanceof C25345OooO0o.AbstractC25383OoooOOo) {
            OooO00o(str);
        }
    }

    public final void Oooo00o(char[] cArr, int i, int i2) throws C25396OooO0oo {
        if (this.f86177OooO0OO) {
            return;
        }
        if (this.f86180OooO0o0) {
            if (this.f86181OooO0oO == null) {
                this.f86181OooO0oO = new StringBuilder(i2);
            }
            this.f86181OooO0oO.append(cArr, i, i2);
        } else if (this.f86182OooO0oo) {
            if (this.f86174OooO == null) {
                this.f86174OooO = new StringBuilder(i2);
            }
            this.f86174OooO.append(cArr, i, i2);
        } else if (this.f86176OooO0O0 instanceof C25345OooO0o.AbstractC25383OoooOOo) {
            OooO00o(new String(cArr, i, i2));
        }
    }
}
