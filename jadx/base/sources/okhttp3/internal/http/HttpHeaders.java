package okhttp3.internal.http;

import androidx.core.location.LocationRequestCompat;
import com.huawei.hms.network.embedded.C18340r9;
import com.microsoft.identity.common.java.cache.CacheKeyValueDelegate;
import com.orion.notein.richeditor.utils.p606io.IOUtils;
import java.io.EOFException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.regex.Pattern;
import kotlin.Metadata;
import kotlin.jvm.internal.OooOOO0;
import oO0o0O0o.C33580OooO00o;
import oO0o0O0o.C33595OooOOo;
import oO0o0O0o.C33599OooOo0O;
import oOo000Oo.C34434OooOoO;
import oOo000Oo.C34436OooOoOO;
import oOo00OoO.C34524OooO0Oo;
import oOo00OoO.C34527OooO0oO;
import okhttp3.Challenge;
import okhttp3.Cookie;
import okhttp3.CookieJar;
import okhttp3.Headers;
import okhttp3.HttpUrl;
import okhttp3.Response;
import okhttp3.internal.HostnamesKt;
import okhttp3.internal.Util;
import okhttp3.internal.publicsuffix.PublicSuffixDatabase;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(m80611d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, m80612d2 = {"okhttp"}, m80613k = 2, m80614mv = {1, 6, 0}, m80616xi = 48)
public final class HttpHeaders {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public static final C34527OooO0oO f124437OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public static final C34527OooO0oO f124438OooO0O0;

    static {
        C34527OooO0oO c34527OooO0oO = C34527OooO0oO.f123734OooOoO;
        f124437OooO00o = C34527OooO0oO.OooO00o.OooO0O0("\"\\");
        f124438OooO0O0 = C34527OooO0oO.OooO00o.OooO0O0("\t ,=");
    }

    public static final boolean OooO00o(Response response) {
        if (OooOOO0.OooO0O0(response.f124258OooOo0o.f124239OooO0O0, "HEAD")) {
            return false;
        }
        int i = response.f124259OooOoO;
        return (((i >= 100 && i < 200) || i == 204 || i == 304) && Util.OooOO0O(response) == -1 && !"chunked".equalsIgnoreCase(Response.OooO00o(com.google.common.net.HttpHeaders.TRANSFER_ENCODING, response))) ? false : true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:44:0x00ba, code lost:
    
        r6 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x007c, code lost:
    
        continue;
     */
    /* JADX WARN: Code restructure failed: missing block: B:77:0x007c, code lost:
    
        continue;
     */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0086  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void OooO0O0(C34524OooO0Oo c34524OooO0Oo, ArrayList arrayList) throws EOFException {
        String strOooO0OO;
        int iOooOo0;
        LinkedHashMap linkedHashMap;
        String strOooO0OO2;
        while (true) {
            String strOooO0OO3 = null;
            while (true) {
                if (strOooO0OO3 == null) {
                    OooO0o0(c34524OooO0Oo);
                    strOooO0OO3 = OooO0OO(c34524OooO0Oo);
                    if (strOooO0OO3 == null) {
                        return;
                    }
                }
                boolean zOooO0o0 = OooO0o0(c34524OooO0Oo);
                strOooO0OO = OooO0OO(c34524OooO0Oo);
                if (strOooO0OO == null) {
                    if (c34524OooO0Oo.o0000o0O()) {
                        arrayList.add(new Challenge(strOooO0OO3, C34436OooOoOO.f123455OooOo0o));
                        return;
                    }
                    return;
                }
                iOooOo0 = Util.OooOo0(c34524OooO0Oo);
                boolean zOooO0o02 = OooO0o0(c34524OooO0Oo);
                if (zOooO0o0 || (!zOooO0o02 && !c34524OooO0Oo.o0000o0O())) {
                    linkedHashMap = new LinkedHashMap();
                    int iOooOo02 = Util.OooOo0(c34524OooO0Oo) + iOooOo0;
                    while (true) {
                        if (strOooO0OO == null) {
                            strOooO0OO = OooO0OO(c34524OooO0Oo);
                            if (OooO0o0(c34524OooO0Oo)) {
                                break;
                            }
                            iOooOo02 = Util.OooOo0(c34524OooO0Oo);
                            if (iOooOo02 != 0) {
                                break;
                            }
                            if (iOooOo02 > 1 || OooO0o0(c34524OooO0Oo)) {
                                return;
                            }
                            if (c34524OooO0Oo.o0000o0O() || c34524OooO0Oo.OooOooo(0L) != 34) {
                                strOooO0OO2 = OooO0OO(c34524OooO0Oo);
                            } else {
                                if (c34524OooO0Oo.readByte() != 34) {
                                    throw new IllegalArgumentException("Failed requirement.");
                                }
                                C34524OooO0Oo c34524OooO0Oo2 = new C34524OooO0Oo();
                                while (true) {
                                    long jOooo00o = c34524OooO0Oo.Oooo00o(f124437OooO00o);
                                    if (jOooo00o == -1) {
                                        break;
                                    }
                                    if (c34524OooO0Oo.OooOooo(jOooo00o) == 34) {
                                        c34524OooO0Oo2.write(c34524OooO0Oo, jOooo00o);
                                        c34524OooO0Oo.readByte();
                                        strOooO0OO2 = c34524OooO0Oo2.o00000OO();
                                        break;
                                    } else {
                                        if (c34524OooO0Oo.f123723OooOo == jOooo00o + 1) {
                                            break;
                                        }
                                        c34524OooO0Oo2.write(c34524OooO0Oo, jOooo00o);
                                        c34524OooO0Oo.readByte();
                                        c34524OooO0Oo2.write(c34524OooO0Oo, 1L);
                                    }
                                }
                            }
                            if (strOooO0OO2 == null || ((String) linkedHashMap.put(strOooO0OO, strOooO0OO2)) != null) {
                                return;
                            }
                            if (!OooO0o0(c34524OooO0Oo) && !c34524OooO0Oo.o0000o0O()) {
                                return;
                            } else {
                                strOooO0OO = null;
                            }
                        } else if (iOooOo02 != 0) {
                        }
                    }
                }
                arrayList.add(new Challenge(strOooO0OO3, linkedHashMap));
                strOooO0OO3 = strOooO0OO;
            }
            Map mapSingletonMap = Collections.singletonMap(null, OooOOO0.OooOOO0(C33595OooOOo.OooOo00("=", iOooOo0), strOooO0OO));
            OooOOO0.OooO0o(mapSingletonMap, "singletonMap<String, Str…ek + \"=\".repeat(eqCount))");
            arrayList.add(new Challenge(strOooO0OO3, mapSingletonMap));
        }
    }

    public static final String OooO0OO(C34524OooO0Oo c34524OooO0Oo) {
        long jOooo00o = c34524OooO0Oo.Oooo00o(f124438OooO0O0);
        if (jOooo00o == -1) {
            jOooo00o = c34524OooO0Oo.f123723OooOo;
        }
        if (jOooo00o != 0) {
            return c34524OooO0Oo.o0Oo0oo(jOooo00o, C33580OooO00o.f121231OooO0O0);
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x01c9  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void OooO0Oo(CookieJar cookieJar, HttpUrl url, Headers headers) {
        List<Cookie> listUnmodifiableList;
        int i;
        Cookie cookie;
        long j;
        Cookie cookie2;
        OooOOO0.OooO0oO(cookieJar, "<this>");
        OooOOO0.OooO0oO(url, "url");
        OooOOO0.OooO0oO(headers, "headers");
        if (cookieJar == CookieJar.f124100OooO00o) {
            return;
        }
        Cookie.f124086OooOO0.getClass();
        List<String> listOooO0oo = headers.OooO0oo(com.google.common.net.HttpHeaders.SET_COOKIE);
        int size = listOooO0oo.size();
        int i2 = 0;
        int i3 = 0;
        ArrayList arrayList = null;
        while (i3 < size) {
            int i4 = i3 + 1;
            String setCookie = listOooO0oo.get(i3);
            OooOOO0.OooO0oO(setCookie, "setCookie");
            long jCurrentTimeMillis = System.currentTimeMillis();
            char c = ';';
            int iOooO0oO = Util.OooO0oO(setCookie, ';', i2, i2, 6);
            char c2 = '=';
            int iOooO0oO2 = Util.OooO0oO(setCookie, '=', i2, iOooO0oO, 2);
            if (iOooO0oO2 == iOooO0oO) {
                i = i2;
                cookie = null;
            } else {
                String strOooOoOO = Util.OooOoOO(i2, iOooO0oO2, setCookie);
                if (strOooOoOO.length() != 0 && Util.OooOOO0(strOooOoOO) == -1) {
                    String strOooOoOO2 = Util.OooOoOO(iOooO0oO2 + 1, iOooO0oO, setCookie);
                    if (Util.OooOOO0(strOooOoOO2) == -1) {
                        int i5 = iOooO0oO + 1;
                        int length = setCookie.length();
                        int i6 = i2;
                        int i7 = i6;
                        int i8 = i7;
                        long j2 = -1;
                        long jOooO0O0 = 253402300799999L;
                        String str = null;
                        String str2 = null;
                        boolean z = true;
                        while (true) {
                            long j3 = LocationRequestCompat.PASSIVE_INTERVAL;
                            if (i5 < length) {
                                int iOooO0o = Util.OooO0o(setCookie, c, i5, length);
                                int iOooO0o2 = Util.OooO0o(setCookie, c2, i5, iOooO0o);
                                String strOooOoOO3 = Util.OooOoOO(i5, iOooO0o2, setCookie);
                                String strOooOoOO4 = iOooO0o2 < iOooO0o ? Util.OooOoOO(iOooO0o2 + 1, iOooO0o, setCookie) : "";
                                if (strOooOoOO3.equalsIgnoreCase("expires")) {
                                    try {
                                        jOooO0O0 = Cookie.Companion.OooO0O0(strOooOoOO4.length(), strOooOoOO4);
                                        i7 = 1;
                                    } catch (NumberFormatException | IllegalArgumentException unused) {
                                    }
                                } else if (strOooOoOO3.equalsIgnoreCase("max-age")) {
                                    try {
                                        j2 = Long.parseLong(strOooOoOO4);
                                        if (j2 <= 0) {
                                            j2 = Long.MIN_VALUE;
                                        }
                                    } catch (NumberFormatException e) {
                                        Pattern patternCompile = Pattern.compile("-?\\d+");
                                        OooOOO0.OooO0o(patternCompile, "compile(...)");
                                        if (!patternCompile.matcher(strOooOoOO4).matches()) {
                                            throw e;
                                        }
                                        if (C33595OooOOo.OooOoO0(strOooOoOO4, CacheKeyValueDelegate.CACHE_VALUE_SEPARATOR, false)) {
                                            j3 = Long.MIN_VALUE;
                                        }
                                        j2 = j3;
                                    }
                                    i7 = 1;
                                } else if (strOooOoOO3.equalsIgnoreCase("domain")) {
                                    if (C33595OooOOo.OooOOo0(strOooOoOO4, ".", false)) {
                                        throw new IllegalArgumentException("Failed requirement.");
                                    }
                                    String strOooO0O0 = HostnamesKt.OooO0O0(C33599OooOo0O.OoooO0(strOooOoOO4, "."));
                                    if (strOooO0O0 == null) {
                                        throw new IllegalArgumentException();
                                    }
                                    str2 = strOooO0O0;
                                    z = false;
                                } else if (strOooOoOO3.equalsIgnoreCase("path")) {
                                    str = strOooOoOO4;
                                } else if (strOooOoOO3.equalsIgnoreCase("secure")) {
                                    i8 = 1;
                                } else if (strOooOoOO3.equalsIgnoreCase("httponly")) {
                                    i6 = 1;
                                }
                                i5 = iOooO0o + 1;
                                c = ';';
                                c2 = '=';
                            } else {
                                if (j2 == Long.MIN_VALUE) {
                                    j = Long.MIN_VALUE;
                                } else if (j2 != -1) {
                                    if (j2 <= 9223372036854775L) {
                                        j3 = j2 * ((long) 1000);
                                    }
                                    long j4 = jCurrentTimeMillis + j3;
                                    j = (j4 < jCurrentTimeMillis || j4 > C18340r9.f56029a) ? 253402300799999L : j4;
                                } else {
                                    j = jOooO0O0;
                                }
                                String str3 = url.f124132OooO0Oo;
                                if (str2 == null) {
                                    str2 = str3;
                                } else if (!OooOOO0.OooO0O0(str3, str2) && (!C33595OooOOo.OooOOo0(str3, str2, false) || str3.charAt((str3.length() - str2.length()) - 1) != '.' || Util.f124307OooO0oO.OooO0O0(str3))) {
                                    i = 0;
                                    cookie2 = null;
                                    cookie = cookie2;
                                }
                                if (str3.length() != str2.length()) {
                                    PublicSuffixDatabase.f124714OooO0o0.getClass();
                                    if (PublicSuffixDatabase.f124716OooO0oo.OooO00o(str2) == null) {
                                    }
                                    cookie = cookie2;
                                }
                                String strSubstring = "/";
                                i = 0;
                                if (str == null || !C33595OooOOo.OooOoO0(str, "/", false)) {
                                    String strOooO0O02 = url.OooO0O0();
                                    int iOooo0oO = C33599OooOo0O.Oooo0oO(strOooO0O02, IOUtils.DIR_SEPARATOR_UNIX, 0, 6);
                                    if (iOooo0oO != 0) {
                                        strSubstring = strOooO0O02.substring(0, iOooo0oO);
                                        OooOOO0.OooO0o(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
                                    }
                                    str = strSubstring;
                                }
                                cookie2 = new Cookie(strOooOoOO, strOooOoOO2, j, str2, str, i8, i6, i7, z);
                                cookie = cookie2;
                            }
                        }
                    }
                }
            }
            if (cookie != null) {
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                arrayList.add(cookie);
            }
            i3 = i4;
            i2 = i;
        }
        if (arrayList != null) {
            listUnmodifiableList = Collections.unmodifiableList(arrayList);
            OooOOO0.OooO0o(listUnmodifiableList, "{\n        Collections.un…ableList(cookies)\n      }");
        } else {
            listUnmodifiableList = C34434OooOoO.f123453OooOo0o;
        }
        if (listUnmodifiableList.isEmpty()) {
            return;
        }
        cookieJar.OooO0O0(url, listUnmodifiableList);
    }

    public static final boolean OooO0o0(C34524OooO0Oo c34524OooO0Oo) throws EOFException {
        boolean z = false;
        while (!c34524OooO0Oo.o0000o0O()) {
            byte bOooOooo = c34524OooO0Oo.OooOooo(0L);
            if (bOooOooo == 44) {
                c34524OooO0Oo.readByte();
                z = true;
            } else {
                if (bOooOooo != 32 && bOooOooo != 9) {
                    break;
                }
                c34524OooO0Oo.readByte();
            }
        }
        return z;
    }
}
