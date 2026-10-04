package okhttp3;

import Oooo0oO.C21111o0ooOoO;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Locale;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import kotlin.Metadata;
import kotlin.jvm.internal.OooOOO0;
import o0000OOo.C24217OooO0O0;
import o000oo0.C24684Oooo;
import oO0o0O0o.C33595OooOOo;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(m80611d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, m80612d2 = {"Lokhttp3/MediaType;", "", "Companion", "okhttp"}, m80613k = 1, m80614mv = {1, 6, 0}, m80616xi = 48)
public final class MediaType {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final String f124150OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final String f124151OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final String f124152OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final String[] f124153OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public static final Companion f124148OooO0o0 = new Companion(0);

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public static final Pattern f124147OooO0o = Pattern.compile("([a-zA-Z0-9-!#$%&'*+.^_`{|}~]+)/([a-zA-Z0-9-!#$%&'*+.^_`{|}~]+)");

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public static final Pattern f124149OooO0oO = Pattern.compile(";\\s*(?:([a-zA-Z0-9-!#$%&'*+.^_`{|}~]+)=(?:([a-zA-Z0-9-!#$%&'*+.^_`{|}~]+)|\"([^\"]*)\"))?");

    @Metadata(m80611d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u001c\u0010\u0006\u001a\n \u0005*\u0004\u0018\u00010\u00040\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\t\u0010\nR\u0014\u0010\u000b\u001a\u00020\b8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000b\u0010\nR\u001c\u0010\f\u001a\n \u0005*\u0004\u0018\u00010\u00040\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\u0007¨\u0006\r"}, m80612d2 = {"Lokhttp3/MediaType$Companion;", "", "<init>", "()V", "Ljava/util/regex/Pattern;", "kotlin.jvm.PlatformType", "PARAMETER", "Ljava/util/regex/Pattern;", "", "QUOTED", "Ljava/lang/String;", "TOKEN", "TYPE_SUBTYPE", "okhttp"}, m80613k = 1, m80614mv = {1, 6, 0}, m80616xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(int i) {
            this();
        }

        public static MediaType OooO00o(String str) {
            OooOOO0.OooO0oO(str, "<this>");
            Matcher matcher = MediaType.f124147OooO0o.matcher(str);
            if (!matcher.lookingAt()) {
                throw new IllegalArgumentException(C24684Oooo.OooO00o('\"', "No subtype found for: \"", str).toString());
            }
            String strGroup = matcher.group(1);
            OooOOO0.OooO0o(strGroup, "typeSubtype.group(1)");
            Locale US = Locale.US;
            OooOOO0.OooO0o(US, "US");
            String lowerCase = strGroup.toLowerCase(US);
            OooOOO0.OooO0o(lowerCase, "this as java.lang.String).toLowerCase(locale)");
            String strGroup2 = matcher.group(2);
            OooOOO0.OooO0o(strGroup2, "typeSubtype.group(2)");
            String lowerCase2 = strGroup2.toLowerCase(US);
            OooOOO0.OooO0o(lowerCase2, "this as java.lang.String).toLowerCase(locale)");
            ArrayList arrayList = new ArrayList();
            Matcher matcher2 = MediaType.f124149OooO0oO.matcher(str);
            int iEnd = matcher.end();
            while (iEnd < str.length()) {
                matcher2.region(iEnd, str.length());
                if (!matcher2.lookingAt()) {
                    StringBuilder sb = new StringBuilder("Parameter is not formatted correctly: \"");
                    String strSubstring = str.substring(iEnd);
                    OooOOO0.OooO0o(strSubstring, "this as java.lang.String).substring(startIndex)");
                    sb.append(strSubstring);
                    sb.append("\" for: \"");
                    throw new IllegalArgumentException(C21111o0ooOoO.OooO0OO(str, '\"', sb).toString());
                }
                String strGroup3 = matcher2.group(1);
                if (strGroup3 == null) {
                    iEnd = matcher2.end();
                } else {
                    String strGroup4 = matcher2.group(2);
                    if (strGroup4 == null) {
                        strGroup4 = matcher2.group(3);
                    } else if (C33595OooOOo.OooOoO0(strGroup4, "'", false) && C33595OooOOo.OooOOo0(strGroup4, "'", false) && strGroup4.length() > 2) {
                        strGroup4 = strGroup4.substring(1, strGroup4.length() - 1);
                        OooOOO0.OooO0o(strGroup4, "this as java.lang.String…ing(startIndex, endIndex)");
                    }
                    arrayList.add(strGroup3);
                    arrayList.add(strGroup4);
                    iEnd = matcher2.end();
                }
            }
            Object[] array = arrayList.toArray(new String[0]);
            if (array != null) {
                return new MediaType(str, lowerCase, lowerCase2, (String[]) array);
            }
            throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
        }

        public static MediaType OooO0O0(String str) {
            OooOOO0.OooO0oO(str, "<this>");
            try {
                return OooO00o(str);
            } catch (IllegalArgumentException unused) {
                return null;
            }
        }

        private Companion() {
        }
    }

    public MediaType(String str, String str2, String str3, String[] strArr) {
        this.f124150OooO00o = str;
        this.f124151OooO0O0 = str2;
        this.f124152OooO0OO = str3;
        this.f124153OooO0Oo = strArr;
    }

    public final Charset OooO00o(Charset charset) {
        String str;
        String[] strArr = this.f124153OooO0Oo;
        int i = 0;
        int iOooO0oo = C24217OooO0O0.OooO0oo(0, strArr.length - 1, 2);
        if (iOooO0oo >= 0) {
            while (true) {
                int i2 = i + 2;
                if (C33595OooOOo.OooOOo(strArr[i], "charset", true)) {
                    str = strArr[i + 1];
                    break;
                }
                if (i == iOooO0oo) {
                    break;
                }
                i = i2;
            }
            str = null;
        } else {
            str = null;
        }
        if (str == null) {
            return charset;
        }
        try {
            return Charset.forName(str);
        } catch (IllegalArgumentException unused) {
            return charset;
        }
    }

    public final boolean equals(Object obj) {
        return (obj instanceof MediaType) && OooOOO0.OooO0O0(((MediaType) obj).f124150OooO00o, this.f124150OooO00o);
    }

    public final int hashCode() {
        return this.f124150OooO00o.hashCode();
    }

    /* JADX INFO: renamed from: toString, reason: from getter */
    public final String getF124150OooO00o() {
        return this.f124150OooO00o;
    }
}
