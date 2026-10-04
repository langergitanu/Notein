package o000o0O0;

import OooOoOO.C20519OooO0Oo;
import android.net.Uri;
import android.os.Bundle;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.ListIterator;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import oO00ooO.C32447OooOOo;
import oO0o0O0o.C33595OooOOo;
import oO0o0O0o.C33599OooOo0O;
import oOo000Oo.C34434OooOoO;

/* JADX INFO: renamed from: o000o0O0.OooOOoo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C24580OooOOoo {

    /* JADX INFO: renamed from: OooOOO0, reason: collision with root package name */
    @Deprecated
    public static final Pattern f83267OooOOO0 = Pattern.compile("^[a-zA-Z]+[+\\w\\-.]*:");

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    public final boolean f83268OooO;

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final String f83269OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final String f83270OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final String f83271OooO0OO;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final String f83273OooO0o;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public final boolean f83276OooO0oo;

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    public final String f83277OooOO0;

    /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
    public final boolean f83279OooOO0o;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final ArrayList f83272OooO0Oo = new ArrayList();

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final LinkedHashMap f83274OooO0o0 = new LinkedHashMap();

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final C32447OooOOo f83275OooO0oO = C20519OooO0Oo.OooO0OO(new OooO0OO());

    /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
    public final C32447OooOOo f83278OooOO0O = C20519OooO0Oo.OooO0OO(new OooO0O0());

    /* JADX INFO: renamed from: o000o0O0.OooOOoo$OooO00o */
    public static final class OooO00o {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public String f83280OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public final ArrayList f83281OooO0O0 = new ArrayList();
    }

    /* JADX INFO: renamed from: o000o0O0.OooOOoo$OooO0O0 */
    public static final class OooO0O0 extends kotlin.jvm.internal.OooOOOO implements oO0O000o.OooO00o<Pattern> {
        public OooO0O0() {
            super(0);
        }

        @Override // oO0O000o.OooO00o
        public final Pattern invoke() {
            String str = C24580OooOOoo.this.f83277OooOO0;
            if (str != null) {
                return Pattern.compile(str);
            }
            return null;
        }
    }

    /* JADX INFO: renamed from: o000o0O0.OooOOoo$OooO0OO */
    public static final class OooO0OO extends kotlin.jvm.internal.OooOOOO implements oO0O000o.OooO00o<Pattern> {
        public OooO0OO() {
            super(0);
        }

        @Override // oO0O000o.OooO00o
        public final Pattern invoke() {
            String str = C24580OooOOoo.this.f83273OooO0o;
            if (str != null) {
                return Pattern.compile(str, 2);
            }
            return null;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r13v0, types: [java.util.regex.Matcher] */
    /* JADX WARN: Type inference failed for: r17v0, types: [o000o0O0.OooOOoo] */
    /* JADX WARN: Type inference failed for: r20v6 */
    /* JADX WARN: Type inference failed for: r20v7 */
    /* JADX WARN: Type inference failed for: r3v12, types: [int] */
    /* JADX WARN: Type inference failed for: r3v18 */
    /* JADX WARN: Type inference failed for: r3v20 */
    public C24580OooOOoo(String str, String str2, String str3) {
        boolean z;
        List listOooO0oO;
        List listO00Oo0;
        boolean z2;
        this.f83269OooO00o = str;
        this.f83270OooO0O0 = str2;
        this.f83271OooO0OO = str3;
        int i = 0;
        boolean z3 = true;
        if (str != null) {
            Uri uri = Uri.parse(str);
            boolean z4 = uri.getQuery() != null;
            this.f83276OooO0oo = z4;
            StringBuilder sb = new StringBuilder("^");
            if (!f83267OooOOO0.matcher(str).find()) {
                sb.append("http[s]?://");
            }
            Pattern fillInPattern = Pattern.compile("\\{(.+?)\\}");
            if (z4) {
                Matcher matcher = Pattern.compile("(\\?)").matcher(str);
                if (matcher.find()) {
                    String strSubstring = str.substring(0, matcher.start());
                    kotlin.jvm.internal.OooOOO0.OooO0o(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
                    kotlin.jvm.internal.OooOOO0.OooO0o(fillInPattern, "fillInPattern");
                    this.f83279OooOO0o = OooO00o(strSubstring, sb, fillInPattern);
                }
                for (String paramName : uri.getQueryParameterNames()) {
                    StringBuilder sb2 = new StringBuilder();
                    String queryParam = uri.getQueryParameter(paramName);
                    if (queryParam == null) {
                        this.f83268OooO = z3;
                        queryParam = paramName;
                    }
                    ?? Matcher = fillInPattern.matcher(queryParam);
                    OooO00o oooO00o = new OooO00o();
                    int iEnd = i;
                    ?? r3 = z3;
                    while (Matcher.find()) {
                        String strGroup = Matcher.group(r3);
                        if (strGroup == null) {
                            throw new NullPointerException("null cannot be cast to non-null type kotlin.String");
                        }
                        oooO00o.f83281OooO0O0.add(strGroup);
                        kotlin.jvm.internal.OooOOO0.OooO0o(queryParam, "queryParam");
                        String strSubstring2 = queryParam.substring(iEnd, Matcher.start());
                        kotlin.jvm.internal.OooOOO0.OooO0o(strSubstring2, "this as java.lang.String…ing(startIndex, endIndex)");
                        sb2.append(Pattern.quote(strSubstring2));
                        sb2.append("(.+?)?");
                        iEnd = Matcher.end();
                        r3 = r3 == true ? 1 : 0;
                    }
                    ?? r20 = r3;
                    if (iEnd < queryParam.length()) {
                        String strSubstring3 = queryParam.substring(iEnd);
                        kotlin.jvm.internal.OooOOO0.OooO0o(strSubstring3, "this as java.lang.String).substring(startIndex)");
                        sb2.append(Pattern.quote(strSubstring3));
                    }
                    String string = sb2.toString();
                    kotlin.jvm.internal.OooOOO0.OooO0o(string, "argRegex.toString()");
                    oooO00o.f83280OooO00o = C33595OooOOo.OooOo0O(string, ".*", "\\E.*\\Q");
                    LinkedHashMap linkedHashMap = this.f83274OooO0o0;
                    kotlin.jvm.internal.OooOOO0.OooO0o(paramName, "paramName");
                    linkedHashMap.put(paramName, oooO00o);
                    z3 = r20 == true ? 1 : 0;
                    i = 0;
                }
                z2 = z3 ? 1 : 0;
            } else {
                z2 = true;
                kotlin.jvm.internal.OooOOO0.OooO0o(fillInPattern, "fillInPattern");
                this.f83279OooOO0o = OooO00o(str, sb, fillInPattern);
            }
            String string2 = sb.toString();
            kotlin.jvm.internal.OooOOO0.OooO0o(string2, "uriRegex.toString()");
            this.f83273OooO0o = C33595OooOOo.OooOo0O(string2, ".*", "\\E.*\\Q");
            z = z2;
        } else {
            z = true;
        }
        if (this.f83271OooO0OO != null) {
            if (!Pattern.compile("^[\\s\\S]+/[\\s\\S]+$").matcher(this.f83271OooO0OO).matches()) {
                throw new IllegalArgumentException(androidx.concurrent.futures.OooO00o.OooO0OO(new StringBuilder("The given mimeType "), this.f83271OooO0OO, " does not match to required \"type/subtype\" format").toString());
            }
            String mimeType = this.f83271OooO0OO;
            kotlin.jvm.internal.OooOOO0.OooO0oO(mimeType, "mimeType");
            Pattern patternCompile = Pattern.compile("/");
            kotlin.jvm.internal.OooOOO0.OooO0o(patternCompile, "compile(...)");
            Matcher matcher2 = patternCompile.matcher(mimeType);
            if (matcher2.find()) {
                ArrayList arrayList = new ArrayList(10);
                int iEnd2 = 0;
                do {
                    arrayList.add(mimeType.subSequence(iEnd2, matcher2.start()).toString());
                    iEnd2 = matcher2.end();
                } while (matcher2.find());
                arrayList.add(mimeType.subSequence(iEnd2, mimeType.length()).toString());
                listOooO0oO = arrayList;
            } else {
                listOooO0oO = com.facebook.soloader.OooOo.OooO0oO(mimeType.toString());
            }
            if (listOooO0oO.isEmpty()) {
                listO00Oo0 = C34434OooOoO.f123453OooOo0o;
            } else {
                ListIterator listIterator = listOooO0oO.listIterator(listOooO0oO.size());
                while (listIterator.hasPrevious()) {
                    if (((String) listIterator.previous()).length() != 0) {
                        listO00Oo0 = oOo000Oo.OooOo.o00Oo0(listOooO0oO, listIterator.nextIndex() + 1);
                        break;
                    }
                }
                listO00Oo0 = C34434OooOoO.f123453OooOo0o;
            }
            this.f83277OooOO0 = C33595OooOOo.OooOo0O(androidx.core.database.OooO00o.OooO00o("^(", (String) listO00Oo0.get(0), "|[*]+)/(", (String) listO00Oo0.get(z ? 1 : 0), "|[*]+)$"), "*|[*]", "[\\s\\S]");
        }
    }

    public static void OooO0O0(Bundle bundle, String key, String str, OooO oooO) {
        if (oooO == null) {
            bundle.putString(key, str);
            return;
        }
        AbstractC24590OooOooo<Object> abstractC24590OooOooo = oooO.f83168OooO00o;
        kotlin.jvm.internal.OooOOO0.OooO0oO(key, "key");
        abstractC24590OooOooo.OooO0Oo(bundle, key, abstractC24590OooOooo.OooO0o0(str));
    }

    public final boolean OooO00o(String str, StringBuilder sb, Pattern pattern) {
        Matcher matcher = pattern.matcher(str);
        boolean z = !C33599OooOo0O.OooOoOO(str, ".*", false);
        int iEnd = 0;
        while (matcher.find()) {
            String strGroup = matcher.group(1);
            if (strGroup == null) {
                throw new NullPointerException("null cannot be cast to non-null type kotlin.String");
            }
            this.f83272OooO0Oo.add(strGroup);
            String strSubstring = str.substring(iEnd, matcher.start());
            kotlin.jvm.internal.OooOOO0.OooO0o(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
            sb.append(Pattern.quote(strSubstring));
            sb.append("([^/]+?)");
            iEnd = matcher.end();
            z = false;
        }
        if (iEnd < str.length()) {
            String strSubstring2 = str.substring(iEnd);
            kotlin.jvm.internal.OooOOO0.OooO0o(strSubstring2, "this as java.lang.String).substring(startIndex)");
            sb.append(Pattern.quote(strSubstring2));
        }
        sb.append("($|(\\?(.)*)|(\\#(.)*))");
        return z;
    }

    public final boolean equals(Object obj) {
        if (obj != null && (obj instanceof C24580OooOOoo)) {
            C24580OooOOoo c24580OooOOoo = (C24580OooOOoo) obj;
            if (kotlin.jvm.internal.OooOOO0.OooO0O0(this.f83269OooO00o, c24580OooOOoo.f83269OooO00o) && kotlin.jvm.internal.OooOOO0.OooO0O0(this.f83270OooO0O0, c24580OooOOoo.f83270OooO0O0) && kotlin.jvm.internal.OooOOO0.OooO0O0(this.f83271OooO0OO, c24580OooOOoo.f83271OooO0OO)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        String str = this.f83269OooO00o;
        int iHashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.f83270OooO0O0;
        int iHashCode2 = (iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.f83271OooO0OO;
        return iHashCode2 + (str3 != null ? str3.hashCode() : 0);
    }
}
