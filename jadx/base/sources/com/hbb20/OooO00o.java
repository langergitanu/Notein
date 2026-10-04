package com.hbb20;

import android.content.Context;
import com.google.mlkit.p567nl.translate.TranslateLanguage;
import com.hbb20.CountryCodePicker;
import com.microsoft.identity.common.java.eststelemetry.PublicApiId;
import com.orion.notein.domain.models.backup.BackupFile;
import com.orion.notein.domain.models.note.NoteMeta;
import java.io.IOException;
import java.text.Collator;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Locale;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import org.xmlpull.v1.XmlPullParserFactory;

/* JADX INFO: loaded from: classes8.dex */
public final class OooO00o implements Comparable<OooO00o> {

    /* JADX INFO: renamed from: OooOoo, reason: collision with root package name */
    public static String f68798OooOoo;

    /* JADX INFO: renamed from: OooOoo0, reason: collision with root package name */
    public static CountryCodePicker.OooO0o f68799OooOoo0;

    /* JADX INFO: renamed from: OooOooO, reason: collision with root package name */
    public static String f68800OooOooO;

    /* JADX INFO: renamed from: OooOooo, reason: collision with root package name */
    public static String f68801OooOooo;

    /* JADX INFO: renamed from: Oooo000, reason: collision with root package name */
    public static ArrayList f68802Oooo000;

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public String f68803OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public String f68804OooOo0o;

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public String f68805OooOoO;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public String f68806OooOoO0;

    /* JADX INFO: renamed from: OooOoOO, reason: collision with root package name */
    public int f68807OooOoOO;

    public OooO00o() {
        this.f68807OooOoOO = -99;
    }

    public static OooO00o OooO00o(Context context, CountryCodePicker.OooO0o oooO0o, int i) {
        return OooO0O0(context, oooO0o, i + "");
    }

    public static OooO00o OooO0O0(Context context, CountryCodePicker.OooO0o oooO0o, String str) {
        for (OooO00o oooO00o : OooO0o0(context, oooO0o)) {
            if (oooO00o.f68803OooOo.equals(str)) {
                return oooO00o;
            }
        }
        return null;
    }

    public static OooO00o OooO0OO(Context context, CountryCodePicker.OooO0o oooO0o, String str) {
        for (OooO00o oooO00o : OooO0o0(context, oooO0o)) {
            if (oooO00o.f68804OooOo0o.equalsIgnoreCase(str)) {
                return oooO00o;
            }
        }
        return null;
    }

    public static ArrayList OooO0Oo() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new OooO00o("ad", "376", "Andorra"));
        arrayList.add(new OooO00o("ae", "971", "United Arab Emirates (UAE)"));
        arrayList.add(new OooO00o(TranslateLanguage.AFRIKAANS, "93", "Afghanistan"));
        arrayList.add(new OooO00o("ag", "1", "Antigua and Barbuda"));
        arrayList.add(new OooO00o("ai", "1", "Anguilla"));
        arrayList.add(new OooO00o("al", "355", "Albania"));
        arrayList.add(new OooO00o("am", "374", "Armenia"));
        arrayList.add(new OooO00o("ao", "244", "Angola"));
        arrayList.add(new OooO00o("aq", "672", "Antarctica"));
        arrayList.add(new OooO00o(TranslateLanguage.ARABIC, "54", "Argentina"));
        arrayList.add(new OooO00o("as", "1", "American Samoa"));
        arrayList.add(new OooO00o("at", "43", "Austria"));
        arrayList.add(new OooO00o("au", "61", "Australia"));
        arrayList.add(new OooO00o("aw", "297", "Aruba"));
        arrayList.add(new OooO00o("ax", "358", "Åland Islands"));
        arrayList.add(new OooO00o("az", "994", "Azerbaijan"));
        arrayList.add(new OooO00o("ba", "387", "Bosnia And Herzegovina"));
        arrayList.add(new OooO00o("bb", "1", "Barbados"));
        arrayList.add(new OooO00o("bd", "880", "Bangladesh"));
        arrayList.add(new OooO00o(TranslateLanguage.BELARUSIAN, "32", "Belgium"));
        arrayList.add(new OooO00o("bf", "226", "Burkina Faso"));
        arrayList.add(new OooO00o(TranslateLanguage.BULGARIAN, "359", "Bulgaria"));
        arrayList.add(new OooO00o("bh", "973", "Bahrain"));
        arrayList.add(new OooO00o("bi", "257", "Burundi"));
        arrayList.add(new OooO00o("bj", "229", "Benin"));
        arrayList.add(new OooO00o("bl", "590", "Saint Barthélemy"));
        arrayList.add(new OooO00o("bm", "1", "Bermuda"));
        arrayList.add(new OooO00o(TranslateLanguage.BENGALI, "673", "Brunei Darussalam"));
        arrayList.add(new OooO00o("bo", "591", "Bolivia, Plurinational State Of"));
        arrayList.add(new OooO00o("br", "55", "Brazil"));
        arrayList.add(new OooO00o("bs", "1", "Bahamas"));
        arrayList.add(new OooO00o("bt", "975", "Bhutan"));
        arrayList.add(new OooO00o("bw", "267", "Botswana"));
        arrayList.add(new OooO00o("by", "375", "Belarus"));
        arrayList.add(new OooO00o("bz", "501", "Belize"));
        arrayList.add(new OooO00o(TranslateLanguage.CATALAN, "1", "Canada"));
        arrayList.add(new OooO00o("cc", "61", "Cocos (keeling) Islands"));
        arrayList.add(new OooO00o("cd", "243", "Congo, The Democratic Republic Of The"));
        arrayList.add(new OooO00o("cf", "236", "Central African Republic"));
        arrayList.add(new OooO00o("cg", "242", "Congo"));
        arrayList.add(new OooO00o("ch", "41", "Switzerland"));
        arrayList.add(new OooO00o("ci", "225", "Côte D'ivoire"));
        arrayList.add(new OooO00o("ck", "682", "Cook Islands"));
        arrayList.add(new OooO00o("cl", "56", "Chile"));
        arrayList.add(new OooO00o("cm", "237", "Cameroon"));
        arrayList.add(new OooO00o("cn", "86", "China"));
        arrayList.add(new OooO00o("co", "57", "Colombia"));
        arrayList.add(new OooO00o("cr", "506", "Costa Rica"));
        arrayList.add(new OooO00o("cu", "53", "Cuba"));
        arrayList.add(new OooO00o("cv", "238", "Cape Verde"));
        arrayList.add(new OooO00o("cw", "599", "Curaçao"));
        arrayList.add(new OooO00o("cx", "61", "Christmas Island"));
        arrayList.add(new OooO00o(TranslateLanguage.WELSH, "357", "Cyprus"));
        arrayList.add(new OooO00o("cz", "420", "Czech Republic"));
        arrayList.add(new OooO00o(TranslateLanguage.GERMAN, "49", "Germany"));
        arrayList.add(new OooO00o("dj", "253", "Djibouti"));
        arrayList.add(new OooO00o("dk", "45", "Denmark"));
        arrayList.add(new OooO00o("dm", "1", "Dominica"));
        arrayList.add(new OooO00o("do", "1", "Dominican Republic"));
        arrayList.add(new OooO00o("dz", PublicApiId.NATIVE_AUTH_SIGN_IN_RESEND_CODE, "Algeria"));
        arrayList.add(new OooO00o("ec", "593", "Ecuador"));
        arrayList.add(new OooO00o("ee", "372", "Estonia"));
        arrayList.add(new OooO00o("eg", "20", "Egypt"));
        arrayList.add(new OooO00o("er", "291", "Eritrea"));
        arrayList.add(new OooO00o(TranslateLanguage.SPANISH, "34", "Spain"));
        arrayList.add(new OooO00o(TranslateLanguage.ESTONIAN, "251", "Ethiopia"));
        arrayList.add(new OooO00o(TranslateLanguage.FINNISH, "358", "Finland"));
        arrayList.add(new OooO00o("fj", "679", "Fiji"));
        arrayList.add(new OooO00o("fk", "500", "Falkland Islands (malvinas)"));
        arrayList.add(new OooO00o("fm", "691", "Micronesia, Federated States Of"));
        arrayList.add(new OooO00o("fo", "298", "Faroe Islands"));
        arrayList.add(new OooO00o(TranslateLanguage.FRENCH, "33", "France"));
        arrayList.add(new OooO00o(TranslateLanguage.IRISH, "241", "Gabon"));
        arrayList.add(new OooO00o("gb", "44", "United Kingdom"));
        arrayList.add(new OooO00o("gd", "1", "Grenada"));
        arrayList.add(new OooO00o("ge", "995", "Georgia"));
        arrayList.add(new OooO00o("gf", "594", "French Guyana"));
        arrayList.add(new OooO00o("gh", PublicApiId.NATIVE_AUTH_SIGN_UP_RESEND_CODE, "Ghana"));
        arrayList.add(new OooO00o("gi", "350", "Gibraltar"));
        arrayList.add(new OooO00o(TranslateLanguage.GALICIAN, "299", "Greenland"));
        arrayList.add(new OooO00o("gm", PublicApiId.NATIVE_AUTH_RESET_PASSWORD_START, "Gambia"));
        arrayList.add(new OooO00o("gn", "224", "Guinea"));
        arrayList.add(new OooO00o("gp", "450", "Guadeloupe"));
        arrayList.add(new OooO00o("gq", PublicApiId.NATIVE_AUTH_ACCOUNT_SIGN_OUT, "Equatorial Guinea"));
        arrayList.add(new OooO00o("gr", PublicApiId.MULTIPLE_ACCOUNT_PCA_ACQUIRE_TOKEN_SILENT_WITH_PARAMETERS, "Greece"));
        arrayList.add(new OooO00o("gt", "502", "Guatemala"));
        arrayList.add(new OooO00o(TranslateLanguage.GUJARATI, "1", "Guam"));
        arrayList.add(new OooO00o("gw", "245", "Guinea-bissau"));
        arrayList.add(new OooO00o("gy", "592", "Guyana"));
        arrayList.add(new OooO00o("hk", "852", "Hong Kong"));
        arrayList.add(new OooO00o("hn", "504", "Honduras"));
        arrayList.add(new OooO00o(TranslateLanguage.CROATIAN, "385", "Croatia"));
        arrayList.add(new OooO00o(TranslateLanguage.HAITIAN_CREOLE, "509", "Haiti"));
        arrayList.add(new OooO00o(TranslateLanguage.HUNGARIAN, "36", "Hungary"));
        arrayList.add(new OooO00o("id", "62", "Indonesia"));
        arrayList.add(new OooO00o("ie", "353", "Ireland"));
        arrayList.add(new OooO00o("il", "972", "Israel"));
        arrayList.add(new OooO00o("im", "44", "Isle Of Man"));
        arrayList.add(new OooO00o(TranslateLanguage.ICELANDIC, "354", "Iceland"));
        arrayList.add(new OooO00o(BackupFile.EXTENSION_NOTEIN_FILE, "91", "India"));
        arrayList.add(new OooO00o("io", "246", "British Indian Ocean Territory"));
        arrayList.add(new OooO00o("iq", "964", "Iraq"));
        arrayList.add(new OooO00o("ir", "98", "Iran, Islamic Republic Of"));
        arrayList.add(new OooO00o(TranslateLanguage.ITALIAN, "39", "Italy"));
        arrayList.add(new OooO00o("je", "44", "Jersey "));
        arrayList.add(new OooO00o("jm", "1", "Jamaica"));
        arrayList.add(new OooO00o("jo", "962", "Jordan"));
        arrayList.add(new OooO00o("jp", "81", "Japan"));
        arrayList.add(new OooO00o("ke", "254", "Kenya"));
        arrayList.add(new OooO00o("kg", "996", "Kyrgyzstan"));
        arrayList.add(new OooO00o("kh", "855", "Cambodia"));
        arrayList.add(new OooO00o("ki", "686", "Kiribati"));
        arrayList.add(new OooO00o("km", "269", "Comoros"));
        arrayList.add(new OooO00o(TranslateLanguage.KANNADA, "1", "Saint Kitts and Nevis"));
        arrayList.add(new OooO00o("kp", "850", "North Korea"));
        arrayList.add(new OooO00o("kr", "82", "South Korea"));
        arrayList.add(new OooO00o("kw", "965", "Kuwait"));
        arrayList.add(new OooO00o("ky", "1", "Cayman Islands"));
        arrayList.add(new OooO00o("kz", "7", "Kazakhstan"));
        arrayList.add(new OooO00o(NoteMeta.PROPERTY_LOCK_ADDED, "856", "Lao People's Democratic Republic"));
        arrayList.add(new OooO00o("lb", "961", "Lebanon"));
        arrayList.add(new OooO00o("lc", "1", "Saint Lucia"));
        arrayList.add(new OooO00o("li", "423", "Liechtenstein"));
        arrayList.add(new OooO00o("lk", "94", "Sri Lanka"));
        arrayList.add(new OooO00o("lr", PublicApiId.NATIVE_AUTH_SIGN_UP_START, "Liberia"));
        arrayList.add(new OooO00o("ls", "266", "Lesotho"));
        arrayList.add(new OooO00o(TranslateLanguage.LITHUANIAN, "370", "Lithuania"));
        arrayList.add(new OooO00o("lu", "352", "Luxembourg"));
        arrayList.add(new OooO00o(TranslateLanguage.LATVIAN, "371", "Latvia"));
        arrayList.add(new OooO00o("ly", "218", "Libya"));
        arrayList.add(new OooO00o("ma", PublicApiId.NATIVE_AUTH_SIGN_IN_SUBMIT_CODE, "Morocco"));
        arrayList.add(new OooO00o("mc", "377", "Monaco"));
        arrayList.add(new OooO00o("md", "373", "Moldova, Republic Of"));
        arrayList.add(new OooO00o("me", "382", "Montenegro"));
        arrayList.add(new OooO00o("mf", "590", "Saint Martin"));
        arrayList.add(new OooO00o("mg", "261", "Madagascar"));
        arrayList.add(new OooO00o("mh", "692", "Marshall Islands"));
        arrayList.add(new OooO00o(TranslateLanguage.MACEDONIAN, "389", "Macedonia (FYROM)"));
        arrayList.add(new OooO00o("ml", PublicApiId.NATIVE_AUTH_RESET_PASSWORD_SUBMIT_NEW_PASSWORD, "Mali"));
        arrayList.add(new OooO00o("mm", "95", "Myanmar"));
        arrayList.add(new OooO00o("mn", "976", "Mongolia"));
        arrayList.add(new OooO00o("mo", "853", "Macau"));
        arrayList.add(new OooO00o("mp", "1", "Northern Mariana Islands"));
        arrayList.add(new OooO00o("mq", "596", "Martinique"));
        arrayList.add(new OooO00o(TranslateLanguage.MARATHI, PublicApiId.NATIVE_AUTH_RESET_PASSWORD_RESEND_CODE, "Mauritania"));
        arrayList.add(new OooO00o(TranslateLanguage.MALAY, "1", "Montserrat"));
        arrayList.add(new OooO00o(TranslateLanguage.MALTESE, "356", "Malta"));
        arrayList.add(new OooO00o("mu", PublicApiId.NATIVE_AUTH_SIGN_UP_WITH_CODE, "Mauritius"));
        arrayList.add(new OooO00o("mv", "960", "Maldives"));
        arrayList.add(new OooO00o("mw", "265", "Malawi"));
        arrayList.add(new OooO00o("mx", "52", "Mexico"));
        arrayList.add(new OooO00o("my", "60", "Malaysia"));
        arrayList.add(new OooO00o("mz", "258", "Mozambique"));
        arrayList.add(new OooO00o("na", "264", "Namibia"));
        arrayList.add(new OooO00o("nc", "687", "New Caledonia"));
        arrayList.add(new OooO00o("ne", "227", "Niger"));
        arrayList.add(new OooO00o("nf", "672", "Norfolk Islands"));
        arrayList.add(new OooO00o("ng", "234", "Nigeria"));
        arrayList.add(new OooO00o("ni", "505", "Nicaragua"));
        arrayList.add(new OooO00o(TranslateLanguage.DUTCH, PublicApiId.MULTIPLE_ACCOUNT_PCA_ACQUIRE_TOKEN_SILENT_ASYNC_WITH_PARAMETERS, "Netherlands"));
        arrayList.add(new OooO00o(TranslateLanguage.NORWEGIAN, "47", "Norway"));
        arrayList.add(new OooO00o("np", "977", "Nepal"));
        arrayList.add(new OooO00o("nr", "674", "Nauru"));
        arrayList.add(new OooO00o("nu", "683", "Niue"));
        arrayList.add(new OooO00o("nz", "64", "New Zealand"));
        arrayList.add(new OooO00o("om", "968", "Oman"));
        arrayList.add(new OooO00o("pa", "507", "Panama"));
        arrayList.add(new OooO00o("pe", "51", "Peru"));
        arrayList.add(new OooO00o("pf", "689", "French Polynesia"));
        arrayList.add(new OooO00o("pg", "675", "Papua New Guinea"));
        arrayList.add(new OooO00o("ph", "63", "Philippines"));
        arrayList.add(new OooO00o("pk", "92", "Pakistan"));
        arrayList.add(new OooO00o(TranslateLanguage.POLISH, "48", "Poland"));
        arrayList.add(new OooO00o("pm", "508", "Saint Pierre And Miquelon"));
        arrayList.add(new OooO00o("pn", "870", "Pitcairn Islands"));
        arrayList.add(new OooO00o("pr", "1", "Puerto Rico"));
        arrayList.add(new OooO00o("ps", "970", "Palestine"));
        arrayList.add(new OooO00o(TranslateLanguage.PORTUGUESE, "351", "Portugal"));
        arrayList.add(new OooO00o("pw", "680", "Palau"));
        arrayList.add(new OooO00o("py", "595", "Paraguay"));
        arrayList.add(new OooO00o("qa", "974", "Qatar"));
        arrayList.add(new OooO00o("re", "262", "Réunion"));
        arrayList.add(new OooO00o(TranslateLanguage.ROMANIAN, "40", "Romania"));
        arrayList.add(new OooO00o("rs", "381", "Serbia"));
        arrayList.add(new OooO00o(TranslateLanguage.RUSSIAN, "7", "Russian Federation"));
        arrayList.add(new OooO00o("rw", PublicApiId.NATIVE_AUTH_ACCOUNT_GET_ACCESS_TOKEN, "Rwanda"));
        arrayList.add(new OooO00o("sa", "966", "Saudi Arabia"));
        arrayList.add(new OooO00o("sb", "677", "Solomon Islands"));
        arrayList.add(new OooO00o("sc", "248", "Seychelles"));
        arrayList.add(new OooO00o("sd", "249", "Sudan"));
        arrayList.add(new OooO00o("se", "46", "Sweden"));
        arrayList.add(new OooO00o("sg", "65", "Singapore"));
        arrayList.add(new OooO00o("sh", "290", "Saint Helena, Ascension And Tristan Da Cunha"));
        arrayList.add(new OooO00o("si", "386", "Slovenia"));
        arrayList.add(new OooO00o(TranslateLanguage.SLOVAK, "421", "Slovakia"));
        arrayList.add(new OooO00o(TranslateLanguage.SLOVENIAN, PublicApiId.NATIVE_AUTH_SIGN_UP_START_WITH_PASSWORD, "Sierra Leone"));
        arrayList.add(new OooO00o("sm", "378", "San Marino"));
        arrayList.add(new OooO00o("sn", PublicApiId.NATIVE_AUTH_RESET_PASSWORD_SUBMIT_CODE, "Senegal"));
        arrayList.add(new OooO00o("so", "252", "Somalia"));
        arrayList.add(new OooO00o("sr", "597", "Suriname"));
        arrayList.add(new OooO00o("ss", PublicApiId.NATIVE_AUTH_SIGN_IN_WITH_EMAIL_PASSWORD, "South Sudan"));
        arrayList.add(new OooO00o("st", "239", "Sao Tome And Principe"));
        arrayList.add(new OooO00o(TranslateLanguage.SWEDISH, "503", "El Salvador"));
        arrayList.add(new OooO00o("sx", "1", "Sint Maarten"));
        arrayList.add(new OooO00o("sy", "963", "Syrian Arab Republic"));
        arrayList.add(new OooO00o("sz", "268", "Swaziland"));
        arrayList.add(new OooO00o("tc", "1", "Turks and Caicos Islands"));
        arrayList.add(new OooO00o("td", PublicApiId.NATIVE_AUTH_SIGN_UP_SUBMIT_CODE, "Chad"));
        arrayList.add(new OooO00o("tg", "228", "Togo"));
        arrayList.add(new OooO00o(TranslateLanguage.THAI, "66", "Thailand"));
        arrayList.add(new OooO00o("tj", "992", "Tajikistan"));
        arrayList.add(new OooO00o("tk", "690", "Tokelau"));
        arrayList.add(new OooO00o(TranslateLanguage.TAGALOG, "670", "Timor-leste"));
        arrayList.add(new OooO00o("tm", "993", "Turkmenistan"));
        arrayList.add(new OooO00o("tn", PublicApiId.NATIVE_AUTH_SIGN_IN_WITH_SLT, "Tunisia"));
        arrayList.add(new OooO00o("to", "676", "Tonga"));
        arrayList.add(new OooO00o(TranslateLanguage.TURKISH, "90", "Turkey"));
        arrayList.add(new OooO00o("tt", "1", "Trinidad &amp; Tobago"));
        arrayList.add(new OooO00o("tv", "688", "Tuvalu"));
        arrayList.add(new OooO00o("tw", "886", "Taiwan"));
        arrayList.add(new OooO00o("tz", "255", "Tanzania, United Republic Of"));
        arrayList.add(new OooO00o("ua", "380", "Ukraine"));
        arrayList.add(new OooO00o("ug", "256", "Uganda"));
        arrayList.add(new OooO00o("us", "1", "United States"));
        arrayList.add(new OooO00o("uy", "598", "Uruguay"));
        arrayList.add(new OooO00o("uz", "998", "Uzbekistan"));
        arrayList.add(new OooO00o("va", "379", "Holy See (vatican City State)"));
        arrayList.add(new OooO00o("vc", "1", "Saint Vincent &amp; The Grenadines"));
        arrayList.add(new OooO00o("ve", "58", "Venezuela, Bolivarian Republic Of"));
        arrayList.add(new OooO00o("vg", "1", "British Virgin Islands"));
        arrayList.add(new OooO00o(TranslateLanguage.VIETNAMESE, "1", "US Virgin Islands"));
        arrayList.add(new OooO00o("vn", "84", "Vietnam"));
        arrayList.add(new OooO00o("vu", "678", "Vanuatu"));
        arrayList.add(new OooO00o("wf", "681", "Wallis And Futuna"));
        arrayList.add(new OooO00o("ws", "685", "Samoa"));
        arrayList.add(new OooO00o("xk", "383", "Kosovo"));
        arrayList.add(new OooO00o("ye", "967", "Yemen"));
        arrayList.add(new OooO00o("yt", "262", "Mayotte"));
        arrayList.add(new OooO00o("za", PublicApiId.f57074xbf15be41, "South Africa"));
        arrayList.add(new OooO00o("zm", "260", "Zambia"));
        arrayList.add(new OooO00o("zw", "263", "Zimbabwe"));
        return arrayList;
    }

    /* JADX WARN: Removed duplicated region for block: B:45:0x00e2  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00f1  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00fc  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0107  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void OooO0o(Context context, CountryCodePicker.OooO0o oooO0o) {
        String attributeValue;
        String attributeValue2;
        ArrayList arrayList = new ArrayList();
        String attributeValue3 = "";
        try {
            XmlPullParser xmlPullParserNewPullParser = XmlPullParserFactory.newInstance().newPullParser();
            xmlPullParserNewPullParser.setInput(context.getResources().openRawResource(context.getResources().getIdentifier("ccp_" + oooO0o.toString().toLowerCase(Locale.ROOT), "raw", context.getPackageName())), "UTF-8");
            attributeValue = "";
            attributeValue2 = attributeValue;
            for (int eventType = xmlPullParserNewPullParser.getEventType(); eventType != 1; eventType = xmlPullParserNewPullParser.next()) {
                try {
                    String name = xmlPullParserNewPullParser.getName();
                    if (eventType == 3) {
                        if (name.equals("country")) {
                            OooO00o oooO00o = new OooO00o();
                            oooO00o.f68804OooOo0o = xmlPullParserNewPullParser.getAttributeValue(null, "name_code").toUpperCase();
                            oooO00o.f68803OooOo = xmlPullParserNewPullParser.getAttributeValue(null, "phone_code");
                            oooO00o.f68805OooOoO = xmlPullParserNewPullParser.getAttributeValue(null, "english_name");
                            oooO00o.f68806OooOoO0 = xmlPullParserNewPullParser.getAttributeValue(null, "name");
                            arrayList.add(oooO00o);
                        } else if (name.equals("ccp_dialog_title")) {
                            attributeValue3 = xmlPullParserNewPullParser.getAttributeValue(null, "translation");
                        } else if (name.equals("ccp_dialog_search_hint_message")) {
                            attributeValue = xmlPullParserNewPullParser.getAttributeValue(null, "translation");
                        } else if (name.equals("ccp_dialog_no_result_ack_message")) {
                            attributeValue2 = xmlPullParserNewPullParser.getAttributeValue(null, "translation");
                        }
                    }
                } catch (IOException e) {
                    e = e;
                    e.printStackTrace();
                    if (arrayList.size() == 0) {
                    }
                    if (attributeValue3.length() <= 0) {
                    }
                    f68798OooOoo = attributeValue3;
                    if (attributeValue.length() <= 0) {
                    }
                    f68800OooOooO = attributeValue;
                    if (attributeValue2.length() <= 0) {
                    }
                    f68801OooOooo = attributeValue2;
                    f68802Oooo000 = arrayList;
                    Collections.sort(arrayList);
                } catch (XmlPullParserException e2) {
                    e = e2;
                    e.printStackTrace();
                    if (arrayList.size() == 0) {
                    }
                    if (attributeValue3.length() <= 0) {
                    }
                    f68798OooOoo = attributeValue3;
                    if (attributeValue.length() <= 0) {
                    }
                    f68800OooOooO = attributeValue;
                    if (attributeValue2.length() <= 0) {
                    }
                    f68801OooOooo = attributeValue2;
                    f68802Oooo000 = arrayList;
                    Collections.sort(arrayList);
                } catch (Exception e3) {
                    e = e3;
                    e.printStackTrace();
                    if (arrayList.size() == 0) {
                    }
                    if (attributeValue3.length() <= 0) {
                    }
                    f68798OooOoo = attributeValue3;
                    if (attributeValue.length() <= 0) {
                    }
                    f68800OooOooO = attributeValue;
                    if (attributeValue2.length() <= 0) {
                    }
                    f68801OooOooo = attributeValue2;
                    f68802Oooo000 = arrayList;
                    Collections.sort(arrayList);
                }
            }
            f68799OooOoo0 = oooO0o;
        } catch (IOException e4) {
            e = e4;
            attributeValue = "";
            attributeValue2 = attributeValue;
        } catch (XmlPullParserException e5) {
            e = e5;
            attributeValue = "";
            attributeValue2 = attributeValue;
        } catch (Exception e6) {
            e = e6;
            attributeValue = "";
            attributeValue2 = attributeValue;
        }
        if (arrayList.size() == 0) {
            f68799OooOoo0 = CountryCodePicker.OooO0o.f68794OooOo0o;
            arrayList = OooO0Oo();
        }
        if (attributeValue3.length() <= 0) {
            attributeValue3 = "Select a country";
        }
        f68798OooOoo = attributeValue3;
        if (attributeValue.length() <= 0) {
            attributeValue = "Search...";
        }
        f68800OooOooO = attributeValue;
        if (attributeValue2.length() <= 0) {
            attributeValue2 = "Results not found";
        }
        f68801OooOooo = attributeValue2;
        f68802Oooo000 = arrayList;
        Collections.sort(arrayList);
    }

    public static ArrayList OooO0o0(Context context, CountryCodePicker.OooO0o oooO0o) {
        ArrayList arrayList;
        CountryCodePicker.OooO0o oooO0o2 = f68799OooOoo0;
        if (oooO0o2 == null || oooO0o != oooO0o2 || (arrayList = f68802Oooo000) == null || arrayList.size() == 0) {
            OooO0o(context, oooO0o);
        }
        return f68802Oooo000;
    }

    @Override // java.lang.Comparable
    public final int compareTo(OooO00o oooO00o) {
        return Collator.getInstance().compare(this.f68806OooOoO0, oooO00o.f68806OooOoO0);
    }

    public OooO00o(String str, String str2, String str3) {
        this.f68807OooOoOO = -99;
        this.f68804OooOo0o = str.toUpperCase(Locale.ROOT);
        this.f68803OooOo = str2;
        this.f68806OooOoO0 = str3;
        this.f68807OooOoOO = -99;
    }
}
