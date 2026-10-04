package com.orion.notein.richeditor.utils.validator;

import androidx.core.app.NotificationCompat;
import androidx.core.text.util.LocalePreferences;
import com.google.android.gms.fido.fido2.api.common.DevicePublicKeyStringDef;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.google.mlkit.p567nl.translate.TranslateLanguage;
import com.hihonor.honorid.core.data.UserInfo;
import com.microsoft.identity.common.java.telemetry.TelemetryEventStrings;
import com.orion.notein.domain.models.backup.BackupFile;
import com.orion.notein.domain.models.note.NoteMeta;
import com.orion.notein.domain.models.p605ai.AiFeatureConfig;
import com.orion.notein.domain.models.transactions.google.GoogleBillingConstants;
import java.io.Serializable;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.Locale;

/* JADX INFO: loaded from: classes9.dex */
public class DomainValidator implements Serializable {
    private static final String DOMAIN_LABEL_REGEX = "\\p{Alnum}(?>[\\p{Alnum}-]{0,61}\\p{Alnum})?";
    private static final String DOMAIN_NAME_REGEX = "^(?:\\p{Alnum}(?>[\\p{Alnum}-]{0,61}\\p{Alnum})?\\.)+(\\p{Alpha}(?>[\\p{Alnum}-]{0,61}\\p{Alnum})?)\\.?$";
    private static final String TOP_LABEL_REGEX = "\\p{Alpha}(?>[\\p{Alnum}-]{0,61}\\p{Alnum})?";
    private static final long serialVersionUID = -4407125112880174009L;
    private final boolean allowLocal;
    private final RegexValidator domainRegex = new RegexValidator(DOMAIN_NAME_REGEX);
    private final RegexValidator hostnameRegex = new RegexValidator(DOMAIN_LABEL_REGEX);
    private static final DomainValidator DOMAIN_VALIDATOR = new DomainValidator(false);
    private static final DomainValidator DOMAIN_VALIDATOR_WITH_LOCAL = new DomainValidator(true);
    private static final String[] INFRASTRUCTURE_TLDS = {"arpa"};
    private static final String[] GENERIC_TLDS = {"abogado", "academy", "accountants", AppMeasurementSdk.ConditionalUserProperty.ACTIVE, "actor", "adult", "aero", "agency", "airforce", "allfinanz", "alsace", "amsterdam", TelemetryEventStrings.C18741Os.OS_NAME, "aquarelle", "archi", "army", "arpa", "asia", "associates", "attorney", "auction", "audio", "autos", "axa", "band", "bar", "bargains", "bayern", "beer", "berlin", "best", "bid", "bike", "bio", "biz", "black", "blackfriday", "bloomberg", "blue", "bmw", "bnpparibas", "boo", "boutique", "brussels", "budapest", "build", "builders", "business", "buzz", "bzh", "cab", "cal", "camera", "camp", "cancerresearch", "capetown", "capital", "caravan", "cards", "care", "career", "careers", "cartier", "casa", "cash", "cat", "catering", "center", "ceo", "cern", "channel", "cheap", "christmas", "chrome", "church", "citic", UserInfo.CITY, "claims", "cleaning", "click", "clinic", "clothing", "club", "coach", "codes", "coffee", "college", "cologne", "com", "community", "company", "computer", "condos", "construction", "consulting", "contractors", "cooking", "cool", "coop", "country", "credit", "creditcard", "cricket", "crs", "cruises", "cuisinella", "cymru", "dad", "dance", "dating", "day", "deals", "degree", "delivery", "democrat", "dental", "dentist", "desi", GoogleBillingConstants.GOOGLE_TAG_DEV, "diamonds", "diet", "digital", DevicePublicKeyStringDef.DIRECT, "directory", "discount", "dnp", "docs", "domains", "doosan", "durban", "dvag", "eat", "edu", "education", "email", "emerck", "energy", "engineer", "engineering", "enterprises", "equipment", "esq", "estate", "eurovision", "eus", "events", "everbank", "exchange", "expert", "exposed", "fail", "farm", "fashion", "feedback", "finance", "financial", "firmdale", "fish", "fishing", "fitness", "flights", "florist", "flowers", "flsmidth", "fly", "foo", "forsale", "foundation", "frl", "frogans", "fund", "furniture", "futbol", "gal", "gallery", "garden", "gbiz", "gent", "ggee", "gift", "gifts", "gives", "glass", "gle", AiFeatureConfig.DEFAULT_AI_ASSISTANT_MODEL_LOCATION, "globo", "gmail", "gmo", "gmx", "google", "gop", "gov", "graphics", "gratis", "green", "gripe", "guide", "guitars", "guru", "hamburg", "haus", "healthcare", "help", "here", "hiphop", "hiv", "holdings", "holiday", "homes", "horse", "host", "hosting", "house", "how", "ibm", "immo", "immobilien", "industries", "info", "ing", "ink", "institute", "insure", "int", "international", "investments", "irish", "iwc", "jetzt", "jobs", "joburg", "juegos", "kaufen", "kim", "kitchen", "kiwi", "koeln", "krd", "kred", "lacaixa", "land", "latrobe", "lawyer", "lds", "lease", "legal", "lgbt", "lidl", "life", "lighting", "limited", "limo", "link", "loans", "london", "lotto", "ltda", "luxe", "luxury", "madrid", "maison", "management", "mango", "market", "marketing", "media", "meet", "melbourne", "meme", "memorial", "menu", "miami", "mil", "mini", "mobi", "moda", "moe", "monash", "money", "mormon", "mortgage", "moscow", "motorcycles", "mov", "museum", "nagoya", "name", "navy", "net", "network", "neustar", "new", "nexus", "ngo", "nhk", "ninja", "nra", "nrw", "nyc", "okinawa", "ong", "onl", "ooo", "org", "organic", "osaka", "otsuka", "ovh", "paris", "partners", "parts", "party", "pharmacy", "photo", "photography", "photos", "physio", "pics", "pictures", "pink", "pizza", "place", "plumbing", "pohl", "poker", "porn", "post", "praxi", "press", "pro", "prod", "productions", "prof", "properties", "property", "pub", "qpon", "quebec", "realtor", "recipes", "red", "rehab", "reise", "reisen", "reit", "ren", "rentals", "repair", "report", "republican", "rest", "restaurant", "reviews", "rich", "rio", "rip", "rocks", "rodeo", "rsvp", "ruhr", "ryukyu", "saarland", "sale", "samsung", "sarl", "sca", "scb", "schmidt", "schule", "schwarz", "science", "scot", "services", "sew", "sexy", "shiksha", "shoes", "shriram", "singles", "sky", NotificationCompat.CATEGORY_SOCIAL, "software", "sohu", "solar", "solutions", "soy", "space", "spiegel", "supplies", "supply", "support", "surf", "surgery", "suzuki", "sydney", "systems", "taipei", "tatar", "tattoo", FirebaseAnalytics.Param.TAX, "technology", "tel", "tienda", "tips", "tires", "tirol", "today", "tokyo", "tools", "top", "town", "toys", "trade", "training", "travel", "trust", "tui", "university", "uno", "uol", "vacations", "vegas", "ventures", "versicherung", "vet", "viajes", "video", "villas", "vision", "vlaanderen", "vodka", "vote", "voting", "voto", "voyage", "wales", "wang", "watch", "webcam", "website", LocalePreferences.FirstDayOfWeek.WEDNESDAY, "wedding", "whoswho", "wien", "wiki", "williamhill", "wme", "work", "works", "world", "wtc", "wtf", "xn--1qqw23a", "xn--3bst00m", "xn--3ds443g", "xn--45q11c", "xn--4gbrim", "xn--55qw42g", "xn--55qx5d", "xn--6frz82g", "xn--6qq986b3xl", "xn--80adxhks", "xn--80asehdb", "xn--80aswg", "xn--c1avg", "xn--cg4bki", "xn--czr694b", "xn--czrs0t", "xn--czru2d", "xn--d1acj3b", "xn--fiq228c5hs", "xn--fiq64b", "xn--flw351e", "xn--hxt814e", "xn--i1b6b1a6a2e", "xn--io0a7i", "xn--kput3i", "xn--mgbab2bd", "xn--ngbc5azd", "xn--nqv7f", "xn--nqv7fs00ema", "xn--p1acf", "xn--q9jyb4c", "xn--qcka1pmc", "xn--rhqv96g", "xn--ses554g", "xn--unup4y", "xn--vermgensberater-ctb", "xn--vermgensberatung-pwb", "xn--vhquv", "xn--xhq521b", "xn--zfr164b", "xxx", "xyz", "yachts", "yandex", "yoga", "yokohama", "youtube", "zip", "zone", "zuerich"};
    private static final String[] COUNTRY_CODE_TLDS = {"ac", "ad", "ae", TranslateLanguage.AFRIKAANS, "ag", "ai", "al", "am", "an", "ao", "aq", TranslateLanguage.ARABIC, "as", "at", "au", "aw", "ax", "az", "ba", "bb", "bd", TranslateLanguage.BELARUSIAN, "bf", TranslateLanguage.BULGARIAN, "bh", "bi", "bj", "bm", TranslateLanguage.BENGALI, "bo", "br", "bs", "bt", "bv", "bw", "by", "bz", TranslateLanguage.CATALAN, "cc", "cd", "cf", "cg", "ch", "ci", "ck", "cl", "cm", "cn", "co", "cr", "cu", "cv", "cw", "cx", TranslateLanguage.WELSH, "cz", TranslateLanguage.GERMAN, "dj", "dk", "dm", "do", "dz", "ec", "ee", "eg", "er", TranslateLanguage.SPANISH, TranslateLanguage.ESTONIAN, "eu", TranslateLanguage.FINNISH, "fj", "fk", "fm", "fo", TranslateLanguage.FRENCH, TranslateLanguage.IRISH, "gb", "gd", "ge", "gf", "gg", "gh", "gi", TranslateLanguage.GALICIAN, "gm", "gn", "gp", "gq", "gr", "gs", "gt", TranslateLanguage.GUJARATI, "gw", "gy", "hk", "hm", "hn", TranslateLanguage.CROATIAN, TranslateLanguage.HAITIAN_CREOLE, TranslateLanguage.HUNGARIAN, "id", "ie", "il", "im", BackupFile.EXTENSION_NOTEIN_FILE, "io", "iq", "ir", TranslateLanguage.ICELANDIC, TranslateLanguage.ITALIAN, "je", "jm", "jo", "jp", "ke", "kg", "kh", "ki", "km", TranslateLanguage.KANNADA, "kp", "kr", "kw", "ky", "kz", NoteMeta.PROPERTY_LOCK_ADDED, "lb", "lc", "li", "lk", "lr", "ls", TranslateLanguage.LITHUANIAN, "lu", TranslateLanguage.LATVIAN, "ly", "ma", "mc", "md", "me", "mg", "mh", TranslateLanguage.MACEDONIAN, "ml", "mm", "mn", "mo", "mp", "mq", TranslateLanguage.MARATHI, TranslateLanguage.MALAY, TranslateLanguage.MALTESE, "mu", "mv", "mw", "mx", "my", "mz", "na", "nc", "ne", "nf", "ng", "ni", TranslateLanguage.DUTCH, TranslateLanguage.NORWEGIAN, "np", "nr", "nu", "nz", "om", "pa", "pe", "pf", "pg", "ph", "pk", TranslateLanguage.POLISH, "pm", "pn", "pr", "ps", TranslateLanguage.PORTUGUESE, "pw", "py", "qa", "re", TranslateLanguage.ROMANIAN, "rs", TranslateLanguage.RUSSIAN, "rw", "sa", "sb", "sc", "sd", "se", "sg", "sh", "si", "sj", TranslateLanguage.SLOVAK, TranslateLanguage.SLOVENIAN, "sm", "sn", "so", "sr", "st", "su", TranslateLanguage.SWEDISH, "sx", "sy", "sz", "tc", "td", "tf", "tg", TranslateLanguage.THAI, "tj", "tk", TranslateLanguage.TAGALOG, "tm", "tn", "to", "tp", TranslateLanguage.TURKISH, "tt", "tv", "tw", "tz", "ua", "ug", TranslateLanguage.UKRAINIAN, "us", "uy", "uz", "va", "vc", "ve", "vg", TranslateLanguage.VIETNAMESE, "vn", "vu", "wf", "ws", "xn--3e0b707e", "xn--45brj9c", "xn--80ao21a", "xn--90a3ac", "xn--clchc0ea0b2g2a9gcd", "xn--d1alf", "xn--fiqs8s", "xn--fiqz9s", "xn--fpcrj9c3d", "xn--fzc2c9e2c", "xn--gecrj9c", "xn--h2brj9c", "xn--j1amh", "xn--j6w193g", "xn--kprw13d", "xn--kpry57d", "xn--l1acc", "xn--lgbbat1ad8j", "xn--mgb9awbf", "xn--mgba3a4f16a", "xn--mgbaam7a8h", "xn--mgbayh7gpa", "xn--mgbbh1a71e", "xn--mgbc0a9azcg", "xn--mgberp4a5d4ar", "xn--mgbx4cd0ab", "xn--node", "xn--o3cw4h", "xn--ogbpf8fl", "xn--p1ai", "xn--pgbs0dh", "xn--s9brj9c", "xn--wgbh1c", "xn--wgbl6a", "xn--xkc2al3hye2a", "xn--xkc2dl3a5ee0h", "xn--yfro4i67o", "xn--ygbi2ammx", "ye", "yt", "za", "zm", "zw"};
    private static final String[] LOCAL_TLDS = {"localdomain", "localhost"};

    public static class IDNHolder {
        private static final Method JAVA_NET_IDN_TO_ASCII = getMethod();

        private IDNHolder() {
        }

        private static Method getMethod() {
            try {
                return Class.forName("java.net.IDN", false, DomainValidator.class.getClassLoader()).getDeclaredMethod("toASCII", String.class);
            } catch (Exception unused) {
                return null;
            }
        }
    }

    private DomainValidator(boolean z) {
        this.allowLocal = z;
    }

    private String chompLeadingDot(String str) {
        return str.startsWith(".") ? str.substring(1) : str;
    }

    public static DomainValidator getInstance() {
        return DOMAIN_VALIDATOR;
    }

    private static boolean isOnlyASCII(String str) {
        if (str == null) {
            return true;
        }
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) > 127) {
                return false;
            }
        }
        return true;
    }

    private static final String toASCII(String str) throws IllegalArgumentException {
        Method method;
        if (isOnlyASCII(str) || (method = IDNHolder.JAVA_NET_IDN_TO_ASCII) == null) {
            return str;
        }
        try {
            return (String) method.invoke(null, str.toLowerCase(Locale.ENGLISH));
        } catch (IllegalAccessException e) {
            throw new RuntimeException(e);
        } catch (InvocationTargetException e2) {
            Throwable cause = e2.getCause();
            if (cause instanceof IllegalArgumentException) {
                throw ((IllegalArgumentException) cause);
            }
            throw new RuntimeException(e2);
        }
    }

    public static String unicodeToASCII(String str) {
        try {
            return toASCII(str);
        } catch (IllegalArgumentException unused) {
            return str;
        }
    }

    public boolean isValid(String str) {
        if (str == null) {
            return false;
        }
        String strUnicodeToASCII = unicodeToASCII(str);
        if (strUnicodeToASCII.length() > 253) {
            return false;
        }
        String[] strArrMatch = this.domainRegex.match(strUnicodeToASCII);
        return (strArrMatch == null || strArrMatch.length <= 0) ? this.allowLocal && this.hostnameRegex.isValid(strUnicodeToASCII) : isValidTld(strArrMatch[0]);
    }

    public boolean isValidCountryCodeTld(String str) {
        return Arrays.binarySearch(COUNTRY_CODE_TLDS, chompLeadingDot(unicodeToASCII(str).toLowerCase(Locale.ENGLISH))) >= 0;
    }

    public final boolean isValidDomainSyntax(String str) {
        if (str == null) {
            return false;
        }
        String strUnicodeToASCII = unicodeToASCII(str);
        if (strUnicodeToASCII.length() > 253) {
            return false;
        }
        String[] strArrMatch = this.domainRegex.match(strUnicodeToASCII);
        return (strArrMatch != null && strArrMatch.length > 0) || this.hostnameRegex.isValid(strUnicodeToASCII);
    }

    public boolean isValidGenericTld(String str) {
        return Arrays.binarySearch(GENERIC_TLDS, chompLeadingDot(unicodeToASCII(str).toLowerCase(Locale.ENGLISH))) >= 0;
    }

    public boolean isValidInfrastructureTld(String str) {
        return Arrays.binarySearch(INFRASTRUCTURE_TLDS, chompLeadingDot(unicodeToASCII(str).toLowerCase(Locale.ENGLISH))) >= 0;
    }

    public boolean isValidLocalTld(String str) {
        return Arrays.binarySearch(LOCAL_TLDS, chompLeadingDot(unicodeToASCII(str).toLowerCase(Locale.ENGLISH))) >= 0;
    }

    public boolean isValidTld(String str) {
        String strUnicodeToASCII = unicodeToASCII(str);
        return (this.allowLocal && isValidLocalTld(strUnicodeToASCII)) || isValidInfrastructureTld(strUnicodeToASCII) || isValidGenericTld(strUnicodeToASCII) || isValidCountryCodeTld(strUnicodeToASCII);
    }

    public static DomainValidator getInstance(boolean z) {
        return z ? DOMAIN_VALIDATOR_WITH_LOCAL : DOMAIN_VALIDATOR;
    }
}
