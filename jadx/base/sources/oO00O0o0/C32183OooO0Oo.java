package oO00O0o0;

import com.aspose.words.ControlChar;
import com.huawei.hms.network.embedded.C18358t1;
import com.orion.notein.richeditor.utils.p606io.IOUtils;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import o0000o0O.AbstractC24304ooOO;
import oO0o0O0o.C33595OooOOo;
import oO0o0O0o.C33599OooOo0O;
import oOo000Oo.C34434OooOoO;

/* JADX INFO: renamed from: oO00O0o0.OooO0Oo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C32183OooO0Oo extends AbstractC24304ooOO {

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public static final C32183OooO0Oo f115520OooO0o = new C32183OooO0Oo(C18358t1.g.f56183c, C18358t1.g.f56183c, C34434OooOoO.f123453OooOo0o);

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final String f115521OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final String f115522OooO0o0;

    /* JADX INFO: renamed from: oO00O0o0.OooO0Oo$OooO00o */
    public static final class OooO00o {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public static final C32183OooO0Oo f115523OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public static final C32183OooO0Oo f115524OooO0O0;

        static {
            C34434OooOoO c34434OooOoO = C34434OooOoO.f123453OooOo0o;
            new C32183OooO0Oo("application", C18358t1.g.f56183c, c34434OooOoO);
            new C32183OooO0Oo("application", "atom+xml", c34434OooOoO);
            new C32183OooO0Oo("application", "cbor", c34434OooOoO);
            f115523OooO00o = new C32183OooO0Oo("application", "json", c34434OooOoO);
            new C32183OooO0Oo("application", "hal+json", c34434OooOoO);
            new C32183OooO0Oo("application", "javascript", c34434OooOoO);
            f115524OooO0O0 = new C32183OooO0Oo("application", "octet-stream", c34434OooOoO);
            new C32183OooO0Oo("application", "rss+xml", c34434OooOoO);
            new C32183OooO0Oo("application", "xml", c34434OooOoO);
            new C32183OooO0Oo("application", "xml-dtd", c34434OooOoO);
            new C32183OooO0Oo("application", "zip", c34434OooOoO);
            new C32183OooO0Oo("application", "gzip", c34434OooOoO);
            new C32183OooO0Oo("application", "x-www-form-urlencoded", c34434OooOoO);
            new C32183OooO0Oo("application", "pdf", c34434OooOoO);
            new C32183OooO0Oo("application", "vnd.openxmlformats-officedocument.spreadsheetml.sheet", c34434OooOoO);
            new C32183OooO0Oo("application", "vnd.openxmlformats-officedocument.wordprocessingml.document", c34434OooOoO);
            new C32183OooO0Oo("application", "vnd.openxmlformats-officedocument.presentationml.presentation", c34434OooOoO);
            new C32183OooO0Oo("application", "protobuf", c34434OooOoO);
            new C32183OooO0Oo("application", "wasm", c34434OooOoO);
            new C32183OooO0Oo("application", "problem+json", c34434OooOoO);
            new C32183OooO0Oo("application", "problem+xml", c34434OooOoO);
        }
    }

    /* JADX INFO: renamed from: oO00O0o0.OooO0Oo$OooO0O0 */
    public static final class OooO0O0 {
        public static C32183OooO0Oo OooO00o(String str) throws oO00O0o0.OooO00o {
            if (C33599OooOo0O.Oooo0o0(str)) {
                return C32183OooO0Oo.f115520OooO0o;
            }
            C32186OooO0oo c32186OooO0oo = (C32186OooO0oo) oOo000Oo.OooOo.OoooOOo(C32188OooOOOo.OooO00o(str));
            String str2 = c32186OooO0oo.f115529OooO00o;
            int iOooo0 = C33599OooOo0O.Oooo0(str2, IOUtils.DIR_SEPARATOR_UNIX, 0, 6);
            if (iOooo0 == -1) {
                if (kotlin.jvm.internal.OooOOO0.OooO0O0(C33599OooOo0O.Oooooo0(str2).toString(), C18358t1.g.f56183c)) {
                    return C32183OooO0Oo.f115520OooO0o;
                }
                throw new oO00O0o0.OooO00o("Bad Content-Type format: ".concat(str));
            }
            String strSubstring = str2.substring(0, iOooo0);
            kotlin.jvm.internal.OooOOO0.OooO0o(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
            String string = C33599OooOo0O.Oooooo0(strSubstring).toString();
            if (string.length() == 0) {
                throw new oO00O0o0.OooO00o("Bad Content-Type format: ".concat(str));
            }
            String strSubstring2 = str2.substring(iOooo0 + 1);
            kotlin.jvm.internal.OooOOO0.OooO0o(strSubstring2, "this as java.lang.String).substring(startIndex)");
            String string2 = C33599OooOo0O.Oooooo0(strSubstring2).toString();
            if (C33599OooOo0O.OooOoo0(string, ControlChar.SPACE_CHAR) || C33599OooOo0O.OooOoo0(string2, ControlChar.SPACE_CHAR)) {
                throw new oO00O0o0.OooO00o("Bad Content-Type format: ".concat(str));
            }
            if (string2.length() == 0 || C33599OooOo0O.OooOoo0(string2, IOUtils.DIR_SEPARATOR_UNIX)) {
                throw new oO00O0o0.OooO00o("Bad Content-Type format: ".concat(str));
            }
            return new C32183OooO0Oo(string, string2, c32186OooO0oo.f115530OooO0O0);
        }
    }

    /* JADX INFO: renamed from: oO00O0o0.OooO0Oo$OooO0OO */
    public static final class OooO0OO {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public static final C32183OooO0Oo f115525OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public static final C32183OooO0Oo f115526OooO0O0;

        static {
            C34434OooOoO c34434OooOoO = C34434OooOoO.f123453OooOo0o;
            new C32183OooO0Oo("text", C18358t1.g.f56183c, c34434OooOoO);
            f115525OooO00o = new C32183OooO0Oo("text", "plain", c34434OooOoO);
            new C32183OooO0Oo("text", "css", c34434OooOoO);
            new C32183OooO0Oo("text", "csv", c34434OooOoO);
            f115526OooO0O0 = new C32183OooO0Oo("text", "html", c34434OooOoO);
            new C32183OooO0Oo("text", "javascript", c34434OooOoO);
            new C32183OooO0Oo("text", "vcard", c34434OooOoO);
            new C32183OooO0Oo("text", "xml", c34434OooOoO);
            new C32183OooO0Oo("text", "event-stream", c34434OooOoO);
        }
    }

    public C32183OooO0Oo(String str, String str2, String str3, List<OooO> list) {
        super(str3, list);
        this.f115521OooO0Oo = str;
        this.f115522OooO0o0 = str2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x0056, code lost:
    
        if (oO0o0O0o.C33595OooOOo.OooOOo(r1.f115510OooO0O0, r7, true) != false) goto L23;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final C32183OooO0Oo OooO0o(String str) {
        List list = (List) this.f81815OooO0OO;
        int size = list.size();
        if (size != 0) {
            if (size != 1) {
                List<OooO> list2 = list;
                if (!(list2 instanceof Collection) || !list2.isEmpty()) {
                    for (OooO oooO : list2) {
                        if (C33595OooOOo.OooOOo(oooO.f115509OooO00o, "charset", true) && C33595OooOOo.OooOOo(oooO.f115510OooO0O0, str, true)) {
                            return this;
                        }
                    }
                }
            } else {
                OooO oooO2 = (OooO) list.get(0);
                if (C33595OooOOo.OooOOo(oooO2.f115509OooO00o, "charset", true)) {
                }
            }
        }
        ArrayList arrayListOooooOo = oOo000Oo.OooOo.OooooOo(list, new OooO("charset", str));
        return new C32183OooO0Oo(this.f115521OooO0Oo, this.f115522OooO0o0, (String) this.f81814OooO0O0, arrayListOooooOo);
    }

    public final boolean OooO0o0(C32183OooO0Oo pattern) {
        boolean zOooOOo;
        kotlin.jvm.internal.OooOOO0.OooO0oO(pattern, "pattern");
        String str = pattern.f115521OooO0Oo;
        if (!kotlin.jvm.internal.OooOOO0.OooO0O0(str, C18358t1.g.f56183c) && !C33595OooOOo.OooOOo(str, this.f115521OooO0Oo, true)) {
            return false;
        }
        String str2 = pattern.f115522OooO0o0;
        if (!kotlin.jvm.internal.OooOOO0.OooO0O0(str2, C18358t1.g.f56183c) && !C33595OooOOo.OooOOo(str2, this.f115522OooO0o0, true)) {
            return false;
        }
        for (OooO oooO : (List) pattern.f81815OooO0OO) {
            String str3 = oooO.f115509OooO00o;
            boolean zOooO0O0 = kotlin.jvm.internal.OooOOO0.OooO0O0(str3, C18358t1.g.f56183c);
            String str4 = oooO.f115510OooO0O0;
            if (zOooO0O0) {
                if (!kotlin.jvm.internal.OooOOO0.OooO0O0(str4, C18358t1.g.f56183c)) {
                    List list = (List) this.f81815OooO0OO;
                    if (!(list instanceof Collection) || !list.isEmpty()) {
                        Iterator it = list.iterator();
                        while (it.hasNext()) {
                            if (C33595OooOOo.OooOOo(((OooO) it.next()).f115510OooO0O0, str4, true)) {
                            }
                        }
                    }
                    zOooOOo = false;
                }
                zOooOOo = true;
                break;
            }
            String strOooO0OO = OooO0OO(str3);
            if (!kotlin.jvm.internal.OooOOO0.OooO0O0(str4, C18358t1.g.f56183c)) {
                zOooOOo = C33595OooOOo.OooOOo(strOooO0OO, str4, true);
            } else {
                if (strOooO0OO != null) {
                    zOooOOo = true;
                    break;
                    break;
                }
                zOooOOo = false;
            }
            if (!zOooOOo) {
                return false;
            }
        }
        return true;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C32183OooO0Oo)) {
            return false;
        }
        C32183OooO0Oo c32183OooO0Oo = (C32183OooO0Oo) obj;
        if (C33595OooOOo.OooOOo(this.f115521OooO0Oo, c32183OooO0Oo.f115521OooO0Oo, true) && C33595OooOOo.OooOOo(this.f115522OooO0o0, c32183OooO0Oo.f115522OooO0o0, true)) {
            return kotlin.jvm.internal.OooOOO0.OooO0O0((List) this.f81815OooO0OO, (List) c32183OooO0Oo.f81815OooO0OO);
        }
        return false;
    }

    public final int hashCode() {
        Locale locale = Locale.ROOT;
        String lowerCase = this.f115521OooO0Oo.toLowerCase(locale);
        kotlin.jvm.internal.OooOOO0.OooO0o(lowerCase, "this as java.lang.String).toLowerCase(Locale.ROOT)");
        int iHashCode = lowerCase.hashCode();
        String lowerCase2 = this.f115522OooO0o0.toLowerCase(locale);
        kotlin.jvm.internal.OooOOO0.OooO0o(lowerCase2, "this as java.lang.String).toLowerCase(Locale.ROOT)");
        return (((List) this.f81815OooO0OO).hashCode() * 31) + lowerCase2.hashCode() + (iHashCode * 31) + iHashCode;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C32183OooO0Oo(String contentType, String contentSubtype, List<OooO> parameters) {
        this(contentType, contentSubtype, contentType + IOUtils.DIR_SEPARATOR_UNIX + contentSubtype, parameters);
        kotlin.jvm.internal.OooOOO0.OooO0oO(contentType, "contentType");
        kotlin.jvm.internal.OooOOO0.OooO0oO(contentSubtype, "contentSubtype");
        kotlin.jvm.internal.OooOOO0.OooO0oO(parameters, "parameters");
    }
}
