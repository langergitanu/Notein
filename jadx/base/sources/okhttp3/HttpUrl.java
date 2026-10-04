package okhttp3;

import androidx.appcompat.view.menu.C21505OooO0Oo;
import com.aspose.slides.OooOOO;
import com.aspose.words.StyleIdentifier;
import com.huawei.hms.network.embedded.C18416x7;
import com.microsoft.identity.common.java.AuthenticationConstants;
import com.orion.notein.richeditor.utils.p606io.IOUtils;
import java.io.EOFException;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.regex.Pattern;
import kotlin.Metadata;
import kotlin.jvm.internal.OooOOO0;
import oO0O00oo.C32519OooO0oO;
import oO0O00oo.OooOO0;
import oO0o0O0o.C33595OooOOo;
import oO0o0O0o.C33599OooOo0O;
import oO0o0O0o.C33600OooOo0o;
import oOo000Oo.C34428OooOOo;
import oOo00OoO.C34524OooO0Oo;
import okhttp3.internal.HostnamesKt;
import okhttp3.internal.Util;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(m80611d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\u0018\u00002\u00020\u0001:\u0002\u0002\u0003¨\u0006\u0004"}, m80612d2 = {"Lokhttp3/HttpUrl;", "", "Builder", "Companion", "okhttp"}, m80613k = 1, m80614mv = {1, 6, 0}, m80616xi = 48)
public final class HttpUrl {

    /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
    public static final Companion f124126OooOO0O = new Companion(0);

    /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
    public static final char[] f124127OooOO0o = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    public final String f124128OooO;

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final String f124129OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final String f124130OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final String f124131OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final String f124132OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final ArrayList f124133OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final int f124134OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final ArrayList f124135OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public final String f124136OooO0oo;

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    public final boolean f124137OooOO0;

    @Metadata(m80611d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, m80612d2 = {"Lokhttp3/HttpUrl$Builder;", "", "<init>", "()V", "Companion", "okhttp"}, m80613k = 1, m80614mv = {1, 6, 0}, m80616xi = 48)
    public static final class Builder {

        /* JADX INFO: renamed from: OooO, reason: collision with root package name */
        public static final Companion f124138OooO = new Companion(0);

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public String f124139OooO00o;

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public String f124142OooO0Oo;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public final ArrayList f124143OooO0o;

        /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
        public ArrayList f124145OooO0oO;

        /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
        public String f124146OooO0oo;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public String f124140OooO0O0 = "";

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        public String f124141OooO0OO = "";

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public int f124144OooO0o0 = -1;

        @Metadata(m80611d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0000X\u0080T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m80612d2 = {"Lokhttp3/HttpUrl$Builder$Companion;", "", "<init>", "()V", "", "INVALID_HOST", "Ljava/lang/String;", "okhttp"}, m80613k = 1, m80614mv = {1, 6, 0}, m80616xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(int i) {
                this();
            }

            private Companion() {
            }
        }

        public Builder() {
            ArrayList arrayList = new ArrayList();
            this.f124143OooO0o = arrayList;
            arrayList.add("");
        }

        public final void OooO00o(String encodedName, String str) {
            OooOOO0.OooO0oO(encodedName, "encodedName");
            if (this.f124145OooO0oO == null) {
                this.f124145OooO0oO = new ArrayList();
            }
            ArrayList arrayList = this.f124145OooO0oO;
            OooOOO0.OooO0Oo(arrayList);
            Companion companion = HttpUrl.f124126OooOO0O;
            arrayList.add(Companion.OooO00o(companion, encodedName, 0, 0, C18416x7.f56646p, 211));
            ArrayList arrayList2 = this.f124145OooO0oO;
            OooOOO0.OooO0Oo(arrayList2);
            arrayList2.add(str == null ? null : Companion.OooO00o(companion, str, 0, 0, C18416x7.f56646p, 211));
        }

        public final void OooO0O0(String name, String str) {
            OooOOO0.OooO0oO(name, "name");
            if (this.f124145OooO0oO == null) {
                this.f124145OooO0oO = new ArrayList();
            }
            ArrayList arrayList = this.f124145OooO0oO;
            OooOOO0.OooO0Oo(arrayList);
            Companion companion = HttpUrl.f124126OooOO0O;
            arrayList.add(Companion.OooO00o(companion, name, 0, 0, C18416x7.f56647q, 219));
            ArrayList arrayList2 = this.f124145OooO0oO;
            OooOOO0.OooO0Oo(arrayList2);
            arrayList2.add(str == null ? null : Companion.OooO00o(companion, str, 0, 0, C18416x7.f56647q, 219));
        }

        public final HttpUrl OooO0OO() {
            ArrayList arrayList;
            String str = this.f124139OooO00o;
            if (str == null) {
                throw new IllegalStateException("scheme == null");
            }
            Companion companion = HttpUrl.f124126OooOO0O;
            String strOooO0o0 = Companion.OooO0o0(companion, this.f124140OooO0O0, 0, 0, 7);
            String strOooO0o02 = Companion.OooO0o0(companion, this.f124141OooO0OO, 0, 0, 7);
            String str2 = this.f124142OooO0Oo;
            if (str2 == null) {
                throw new IllegalStateException("host == null");
            }
            int iOooO0O0 = this.f124144OooO0o0;
            if (iOooO0O0 == -1) {
                String str3 = this.f124139OooO00o;
                OooOOO0.OooO0Oo(str3);
                companion.getClass();
                iOooO0O0 = Companion.OooO0O0(str3);
            }
            ArrayList arrayList2 = this.f124143OooO0o;
            ArrayList arrayList3 = new ArrayList(C34428OooOOo.OooOOoo(arrayList2, 10));
            Iterator it = arrayList2.iterator();
            while (it.hasNext()) {
                arrayList3.add(Companion.OooO0o0(HttpUrl.f124126OooOO0O, (String) it.next(), 0, 0, 7));
            }
            ArrayList<String> arrayList4 = this.f124145OooO0oO;
            if (arrayList4 == null) {
                arrayList = null;
            } else {
                arrayList = new ArrayList(C34428OooOOo.OooOOoo(arrayList4, 10));
                for (String str4 : arrayList4) {
                    arrayList.add(str4 == null ? null : Companion.OooO0o0(HttpUrl.f124126OooOO0O, str4, 0, 0, 3));
                }
            }
            String str5 = this.f124146OooO0oo;
            return new HttpUrl(str, strOooO0o0, strOooO0o02, str2, iOooO0O0, arrayList3, arrayList, str5 != null ? Companion.OooO0o0(HttpUrl.f124126OooOO0O, str5, 0, 0, 7) : null, toString());
        }

        public final void OooO0Oo(String host) {
            OooOOO0.OooO0oO(host, "host");
            String strOooO0O0 = HostnamesKt.OooO0O0(Companion.OooO0o0(HttpUrl.f124126OooOO0O, host, 0, 0, 7));
            if (strOooO0O0 == null) {
                throw new IllegalArgumentException(OooOOO0.OooOOO0(host, "unexpected host: "));
            }
            this.f124142OooO0Oo = strOooO0O0;
        }

        public final void OooO0o(String str) {
            if (str.equalsIgnoreCase("http")) {
                this.f124139OooO00o = "http";
            } else {
                if (!str.equalsIgnoreCase(AuthenticationConstants.HTTPS_PROTOCOL_STRING)) {
                    throw new IllegalArgumentException(OooOOO0.OooOOO0(str, "unexpected scheme: "));
                }
                this.f124139OooO00o = AuthenticationConstants.HTTPS_PROTOCOL_STRING;
            }
        }

        /* JADX WARN: Removed duplicated region for block: B:4:0x002e  */
        /* JADX WARN: Removed duplicated region for block: B:75:0x0146  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final void OooO0o0(HttpUrl httpUrl, String str) throws EOFException {
            int i;
            int i2;
            int iOooO0o0;
            ArrayList arrayList;
            int i3;
            int i4;
            ArrayList arrayList2;
            int i5;
            ArrayList arrayList3;
            String input = str;
            OooOOO0.OooO0oO(input, "input");
            byte[] bArr = Util.f124301OooO00o;
            int iOooOOO = Util.OooOOO(0, input.length(), input);
            int iOooOOOO = Util.OooOOOO(iOooOOO, input.length(), input);
            f124138OooO.getClass();
            if (iOooOOOO - iOooOOO < 2) {
                i2 = 6;
                i = -1;
            } else {
                char cCharAt = input.charAt(iOooOOO);
                char c = 'a';
                if ((OooOOO0.OooO(cCharAt, 97) >= 0 && OooOOO0.OooO(cCharAt, 122) <= 0) || (OooOOO0.OooO(cCharAt, 65) >= 0 && OooOOO0.OooO(cCharAt, 90) <= 0)) {
                    i = iOooOOO + 1;
                    while (i < iOooOOOO) {
                        int i6 = i + 1;
                        i2 = 6;
                        char cCharAt2 = input.charAt(i);
                        if ((c <= cCharAt2 && cCharAt2 < '{') || (('A' <= cCharAt2 && cCharAt2 < '[') || (('0' <= cCharAt2 && cCharAt2 < ':') || cCharAt2 == '+' || cCharAt2 == '-' || cCharAt2 == '.'))) {
                            i = i6;
                            c = 'a';
                        } else if (cCharAt2 != ':') {
                            i = -1;
                        }
                    }
                    i2 = 6;
                    i = -1;
                }
            }
            if (i != -1) {
                if (C33595OooOOo.OooOo(iOooOOO, input, "https:", true)) {
                    this.f124139OooO00o = AuthenticationConstants.HTTPS_PROTOCOL_STRING;
                    iOooOOO += 6;
                } else {
                    if (!C33595OooOOo.OooOo(iOooOOO, input, "http:", true)) {
                        StringBuilder sb = new StringBuilder("Expected URL scheme 'http' or 'https' but was '");
                        String strSubstring = input.substring(0, i);
                        OooOOO0.OooO0o(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
                        sb.append(strSubstring);
                        sb.append('\'');
                        throw new IllegalArgumentException(sb.toString());
                    }
                    this.f124139OooO00o = "http";
                    iOooOOO += 5;
                }
            } else {
                if (httpUrl == null) {
                    int i7 = i2;
                    throw new IllegalArgumentException(OooOOO0.OooOOO0(input.length() > i7 ? OooOOO0.OooOOO0("...", C33600OooOo0o.o0OoOo0(i7, input)) : input, "Expected URL scheme 'http' or 'https' but no scheme was found for "));
                }
                this.f124139OooO00o = httpUrl.f124129OooO00o;
            }
            int i8 = iOooOOO;
            int i9 = 0;
            while (i8 < iOooOOOO) {
                int i10 = i8 + 1;
                char cCharAt3 = input.charAt(i8);
                if (cCharAt3 != '\\' && cCharAt3 != '/') {
                    break;
                }
                i9++;
                i8 = i10;
            }
            ArrayList arrayList4 = this.f124143OooO0o;
            char c2 = '?';
            char c3 = '#';
            if (i9 >= 2 || httpUrl == null) {
                int i11 = iOooOOO + i9;
                boolean z = false;
                boolean z2 = false;
                while (true) {
                    iOooO0o0 = Util.OooO0o0(i11, iOooOOOO, input, "@/\\?#");
                    byte bCharAt = iOooO0o0 != iOooOOOO ? input.charAt(iOooO0o0) : (byte) -1;
                    if (bCharAt == -1 || bCharAt == c3 || bCharAt == 47 || bCharAt == 92 || bCharAt == c2) {
                        break;
                    }
                    if (bCharAt == 64) {
                        if (z) {
                            arrayList2 = arrayList4;
                            int i12 = i11;
                            i5 = iOooO0o0;
                            StringBuilder sb2 = new StringBuilder();
                            sb2.append(this.f124141OooO0OO);
                            sb2.append("%40");
                            input = str;
                            sb2.append(Companion.OooO00o(HttpUrl.f124126OooOO0O, input, i12, i5, " \"':;<=>@[]^`{}|/\\?#", 240));
                            this.f124141OooO0OO = sb2.toString();
                        } else {
                            ArrayList arrayList5 = arrayList4;
                            int i13 = i11;
                            int iOooO0o = Util.OooO0o(input, ':', i13, iOooO0o0);
                            Companion companion = HttpUrl.f124126OooOO0O;
                            arrayList2 = arrayList5;
                            String strOooO00o = Companion.OooO00o(companion, input, i13, iOooO0o, " \"':;<=>@[]^`{}|/\\?#", 240);
                            if (z2) {
                                strOooO00o = OooOOO.OooO0O0(new StringBuilder(), this.f124140OooO0O0, "%40", strOooO00o);
                            }
                            this.f124140OooO0O0 = strOooO00o;
                            if (iOooO0o != iOooO0o0) {
                                int i14 = iOooO0o + 1;
                                i5 = iOooO0o0;
                                this.f124141OooO0OO = Companion.OooO00o(companion, str, i14, i5, " \"':;<=>@[]^`{}|/\\?#", 240);
                                z = true;
                            } else {
                                i5 = iOooO0o0;
                            }
                            input = str;
                            z2 = true;
                        }
                        i11 = i5 + 1;
                        arrayList4 = arrayList2;
                        c3 = '#';
                        c2 = '?';
                    }
                }
                arrayList = arrayList4;
                int i15 = i11;
                iOooOOO = iOooO0o0;
                int i16 = i15;
                while (true) {
                    if (i16 >= iOooOOO) {
                        i3 = iOooOOO;
                        break;
                    }
                    char cCharAt4 = input.charAt(i16);
                    if (cCharAt4 == '[') {
                        do {
                            i16++;
                            if (i16 < iOooOOO) {
                            }
                        } while (input.charAt(i16) != ']');
                    } else if (cCharAt4 == ':') {
                        i3 = i16;
                        break;
                    }
                    i16++;
                }
                int i17 = i3 + 1;
                if (i17 < iOooOOO) {
                    Companion companion2 = HttpUrl.f124126OooOO0O;
                    this.f124142OooO0Oo = HostnamesKt.OooO0O0(Companion.OooO0o0(companion2, input, i15, i3, 4));
                    try {
                        i4 = Integer.parseInt(Companion.OooO00o(companion2, input, i17, iOooOOO, "", StyleIdentifier.LIGHT_GRID_ACCENT_6));
                    } catch (NumberFormatException unused) {
                    }
                    if (1 > i4 || i4 >= 65536) {
                        i4 = -1;
                    }
                    this.f124144OooO0o0 = i4;
                    if (i4 == -1) {
                        StringBuilder sb3 = new StringBuilder("Invalid URL port: \"");
                        String strSubstring2 = input.substring(i17, iOooOOO);
                        OooOOO0.OooO0o(strSubstring2, "this as java.lang.String…ing(startIndex, endIndex)");
                        sb3.append(strSubstring2);
                        sb3.append('\"');
                        throw new IllegalArgumentException(sb3.toString().toString());
                    }
                } else {
                    this.f124142OooO0Oo = HostnamesKt.OooO0O0(Companion.OooO0o0(HttpUrl.f124126OooOO0O, input, i15, i3, 4));
                    String str2 = this.f124139OooO00o;
                    OooOOO0.OooO0Oo(str2);
                    this.f124144OooO0o0 = Companion.OooO0O0(str2);
                }
                if (this.f124142OooO0Oo == null) {
                    StringBuilder sb4 = new StringBuilder("Invalid URL host: \"");
                    String strSubstring3 = input.substring(i15, i3);
                    OooOOO0.OooO0o(strSubstring3, "this as java.lang.String…ing(startIndex, endIndex)");
                    sb4.append(strSubstring3);
                    sb4.append('\"');
                    throw new IllegalArgumentException(sb4.toString().toString());
                }
            } else {
                if (OooOOO0.OooO0O0(httpUrl.f124129OooO00o, this.f124139OooO00o)) {
                    this.f124140OooO0O0 = httpUrl.OooO0o0();
                    this.f124141OooO0OO = httpUrl.OooO00o();
                    this.f124142OooO0Oo = httpUrl.f124132OooO0Oo;
                    this.f124144OooO0o0 = httpUrl.f124134OooO0o0;
                    arrayList4.clear();
                    arrayList4.addAll(httpUrl.OooO0OO());
                    if (iOooOOO == iOooOOOO || input.charAt(iOooOOO) == '#') {
                        String strOooO0Oo = httpUrl.OooO0Oo();
                        this.f124145OooO0oO = strOooO0Oo == null ? null : Companion.OooO0o(Companion.OooO00o(HttpUrl.f124126OooOO0O, strOooO0Oo, 0, 0, C18416x7.f56645o, 211));
                    }
                    arrayList = arrayList4;
                }
            }
            int iOooO0o02 = Util.OooO0o0(iOooOOO, iOooOOOO, input, "?#");
            if (iOooOOO != iOooO0o02) {
                char cCharAt5 = input.charAt(iOooOOO);
                if (cCharAt5 == '/' || cCharAt5 == '\\') {
                    arrayList3 = arrayList;
                    arrayList3.clear();
                    arrayList3.add("");
                    iOooOOO++;
                } else {
                    arrayList3 = arrayList;
                    arrayList3.set(arrayList.size() - 1, "");
                }
                loop1: while (true) {
                    int i18 = iOooOOO;
                    while (i18 < iOooO0o02) {
                        iOooOOO = Util.OooO0o0(i18, iOooO0o02, input, "/\\");
                        boolean z3 = iOooOOO < iOooO0o02;
                        String strOooO00o2 = Companion.OooO00o(HttpUrl.f124126OooOO0O, input, i18, iOooOOO, C18416x7.f56643m, 240);
                        if (!strOooO00o2.equals(".") && !strOooO00o2.equalsIgnoreCase("%2e")) {
                            if (!strOooO00o2.equals("..") && !strOooO00o2.equalsIgnoreCase("%2e.") && !strOooO00o2.equalsIgnoreCase(".%2e") && !strOooO00o2.equalsIgnoreCase("%2e%2e")) {
                                if (((CharSequence) C21505OooO0Oo.OooO00o(1, arrayList3)).length() == 0) {
                                    arrayList3.set(arrayList3.size() - 1, strOooO00o2);
                                } else {
                                    arrayList3.add(strOooO00o2);
                                }
                                if (z3) {
                                    arrayList3.add("");
                                }
                            } else if (((String) arrayList3.remove(arrayList3.size() - 1)).length() != 0 || arrayList3.isEmpty()) {
                                arrayList3.add("");
                            } else {
                                arrayList3.set(arrayList3.size() - 1, "");
                            }
                        }
                        if (z3) {
                            i18 = iOooOOO + 1;
                        }
                    }
                }
            }
            if (iOooO0o02 < iOooOOOO && input.charAt(iOooO0o02) == '?') {
                int iOooO0o2 = Util.OooO0o(input, '#', iOooO0o02, iOooOOOO);
                this.f124145OooO0oO = Companion.OooO0o(Companion.OooO00o(HttpUrl.f124126OooOO0O, input, iOooO0o02 + 1, iOooO0o2, C18416x7.f56645o, 208));
                iOooO0o02 = iOooO0o2;
            }
            if (iOooO0o02 >= iOooOOOO || input.charAt(iOooO0o02) != '#') {
                return;
            }
            this.f124146OooO0oo = Companion.OooO00o(HttpUrl.f124126OooOO0O, input, iOooO0o02 + 1, iOooOOOO, "", 176);
        }

        /* JADX WARN: Removed duplicated region for block: B:32:0x008c  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final String toString() {
            StringBuilder sb = new StringBuilder();
            String str = this.f124139OooO00o;
            if (str != null) {
                sb.append(str);
                sb.append("://");
            } else {
                sb.append("//");
            }
            if (this.f124140OooO0O0.length() > 0 || this.f124141OooO0OO.length() > 0) {
                sb.append(this.f124140OooO0O0);
                if (this.f124141OooO0OO.length() > 0) {
                    sb.append(':');
                    sb.append(this.f124141OooO0OO);
                }
                sb.append('@');
            }
            String str2 = this.f124142OooO0Oo;
            if (str2 != null) {
                if (C33599OooOo0O.OooOoo0(str2, ':')) {
                    sb.append('[');
                    sb.append(this.f124142OooO0Oo);
                    sb.append(']');
                } else {
                    sb.append(this.f124142OooO0Oo);
                }
            }
            int iOooO0O0 = this.f124144OooO0o0;
            if (iOooO0O0 != -1 || this.f124139OooO00o != null) {
                if (iOooO0O0 == -1) {
                    Companion companion = HttpUrl.f124126OooOO0O;
                    String str3 = this.f124139OooO00o;
                    OooOOO0.OooO0Oo(str3);
                    companion.getClass();
                    iOooO0O0 = Companion.OooO0O0(str3);
                }
                String str4 = this.f124139OooO00o;
                if (str4 != null) {
                    HttpUrl.f124126OooOO0O.getClass();
                    if (iOooO0O0 != Companion.OooO0O0(str4)) {
                        sb.append(':');
                        sb.append(iOooO0O0);
                    }
                }
            }
            Companion companion2 = HttpUrl.f124126OooOO0O;
            ArrayList arrayList = this.f124143OooO0o;
            companion2.getClass();
            OooOOO0.OooO0oO(arrayList, "<this>");
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                sb.append(IOUtils.DIR_SEPARATOR_UNIX);
                sb.append((String) arrayList.get(i));
            }
            if (this.f124145OooO0oO != null) {
                sb.append('?');
                Companion companion3 = HttpUrl.f124126OooOO0O;
                ArrayList arrayList2 = this.f124145OooO0oO;
                OooOOO0.OooO0Oo(arrayList2);
                companion3.getClass();
                C32519OooO0oO c32519OooO0oOOooO0oo = OooOO0.OooO0oo(OooOO0.OooO(0, arrayList2.size()), 2);
                int i2 = c32519OooO0oOOooO0oo.f116812OooOo0o;
                int i3 = c32519OooO0oOOooO0oo.f116811OooOo;
                int i4 = c32519OooO0oOOooO0oo.f116813OooOoO0;
                if ((i4 > 0 && i2 <= i3) || (i4 < 0 && i3 <= i2)) {
                    while (true) {
                        int i5 = i2 + i4;
                        String str5 = (String) arrayList2.get(i2);
                        String str6 = (String) arrayList2.get(i2 + 1);
                        if (i2 > 0) {
                            sb.append('&');
                        }
                        sb.append(str5);
                        if (str6 != null) {
                            sb.append('=');
                            sb.append(str6);
                        }
                        if (i2 == i3) {
                            break;
                        }
                        i2 = i5;
                    }
                }
            }
            if (this.f124146OooO0oo != null) {
                sb.append('#');
                sb.append(this.f124146OooO0oo);
            }
            String string = sb.toString();
            OooOOO0.OooO0o(string, "StringBuilder().apply(builderAction).toString()");
            return string;
        }
    }

    @Metadata(m80611d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0019\n\u0002\b\u000b\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0000X\u0080T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0000X\u0080T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00048\u0000X\u0080T¢\u0006\u0006\n\u0004\b\b\u0010\u0006R\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u000bR\u0014\u0010\f\u001a\u00020\u00048\u0000X\u0080T¢\u0006\u0006\n\u0004\b\f\u0010\u0006R\u0014\u0010\r\u001a\u00020\u00048\u0000X\u0080T¢\u0006\u0006\n\u0004\b\r\u0010\u0006R\u0014\u0010\u000e\u001a\u00020\u00048\u0000X\u0080T¢\u0006\u0006\n\u0004\b\u000e\u0010\u0006R\u0014\u0010\u000f\u001a\u00020\u00048\u0000X\u0080T¢\u0006\u0006\n\u0004\b\u000f\u0010\u0006R\u0014\u0010\u0010\u001a\u00020\u00048\u0000X\u0080T¢\u0006\u0006\n\u0004\b\u0010\u0010\u0006R\u0014\u0010\u0011\u001a\u00020\u00048\u0000X\u0080T¢\u0006\u0006\n\u0004\b\u0011\u0010\u0006R\u0014\u0010\u0012\u001a\u00020\u00048\u0000X\u0080T¢\u0006\u0006\n\u0004\b\u0012\u0010\u0006R\u0014\u0010\u0013\u001a\u00020\u00048\u0000X\u0080T¢\u0006\u0006\n\u0004\b\u0013\u0010\u0006¨\u0006\u0014"}, m80612d2 = {"Lokhttp3/HttpUrl$Companion;", "", "<init>", "()V", "", "FORM_ENCODE_SET", "Ljava/lang/String;", "FRAGMENT_ENCODE_SET", "FRAGMENT_ENCODE_SET_URI", "", "HEX_DIGITS", "[C", "PASSWORD_ENCODE_SET", "PATH_SEGMENT_ENCODE_SET", "PATH_SEGMENT_ENCODE_SET_URI", "QUERY_COMPONENT_ENCODE_SET", "QUERY_COMPONENT_ENCODE_SET_URI", "QUERY_COMPONENT_REENCODE_SET", "QUERY_ENCODE_SET", "USERNAME_ENCODE_SET", "okhttp"}, m80613k = 1, m80614mv = {1, 6, 0}, m80616xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(int i) {
            this();
        }

        public static String OooO00o(Companion companion, String str, int i, int i2, String str2, int i3) throws EOFException {
            int i4 = (i3 & 1) != 0 ? 0 : i;
            int length = (i3 & 2) != 0 ? str.length() : i2;
            boolean z = (i3 & 8) == 0;
            boolean z2 = (i3 & 16) == 0;
            boolean z3 = (i3 & 32) == 0;
            boolean z4 = (i3 & 64) == 0;
            companion.getClass();
            OooOOO0.OooO0oO(str, "<this>");
            int iCharCount = i4;
            while (iCharCount < length) {
                int iCodePointAt = str.codePointAt(iCharCount);
                int i5 = 32;
                int i6 = 128;
                if (iCodePointAt < 32 || iCodePointAt == 127 || ((iCodePointAt >= 128 && !z4) || C33599OooOo0O.OooOoo0(str2, (char) iCodePointAt) || ((iCodePointAt == 37 && (!z || (z2 && !OooO0Oo(iCharCount, length, str)))) || (iCodePointAt == 43 && z3)))) {
                    C34524OooO0Oo c34524OooO0Oo = new C34524OooO0Oo();
                    c34524OooO0Oo.o000Oo0O(i4, iCharCount, str);
                    C34524OooO0Oo c34524OooO0Oo2 = null;
                    while (iCharCount < length) {
                        int iCodePointAt2 = str.codePointAt(iCharCount);
                        if (!z || (iCodePointAt2 != 9 && iCodePointAt2 != 10 && iCodePointAt2 != 12 && iCodePointAt2 != 13)) {
                            if (iCodePointAt2 == 43 && z3) {
                                c34524OooO0Oo.o000Oo0o(z ? "+" : "%2B");
                            } else if (iCodePointAt2 < i5 || iCodePointAt2 == 127 || ((iCodePointAt2 >= i6 && !z4) || C33599OooOo0O.OooOoo0(str2, (char) iCodePointAt2) || (iCodePointAt2 == 37 && (!z || (z2 && !OooO0Oo(iCharCount, length, str)))))) {
                                if (c34524OooO0Oo2 == null) {
                                    c34524OooO0Oo2 = new C34524OooO0Oo();
                                }
                                c34524OooO0Oo2.o000Oo(iCodePointAt2);
                                while (!c34524OooO0Oo2.o0000o0O()) {
                                    byte b = c34524OooO0Oo2.readByte();
                                    c34524OooO0Oo.o0OoO0o(37);
                                    char[] cArr = HttpUrl.f124127OooOO0o;
                                    c34524OooO0Oo.o0OoO0o(cArr[((b & 255) >> 4) & 15]);
                                    c34524OooO0Oo.o0OoO0o(cArr[b & 15]);
                                }
                            } else {
                                c34524OooO0Oo.o000Oo(iCodePointAt2);
                            }
                        }
                        iCharCount += Character.charCount(iCodePointAt2);
                        i5 = 32;
                        i6 = 128;
                    }
                    return c34524OooO0Oo.o00000OO();
                }
                iCharCount += Character.charCount(iCodePointAt);
            }
            String strSubstring = str.substring(i4, length);
            OooOOO0.OooO0o(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
            return strSubstring;
        }

        public static int OooO0O0(String scheme) {
            OooOOO0.OooO0oO(scheme, "scheme");
            if (scheme.equals("http")) {
                return 80;
            }
            return scheme.equals(AuthenticationConstants.HTTPS_PROTOCOL_STRING) ? 443 : -1;
        }

        public static HttpUrl OooO0OO(String str) {
            OooOOO0.OooO0oO(str, "<this>");
            Builder builder = new Builder();
            builder.OooO0o0(null, str);
            return builder.OooO0OO();
        }

        public static boolean OooO0Oo(int i, int i2, String str) {
            int i3 = i + 2;
            return i3 < i2 && str.charAt(i) == '%' && Util.OooOOo(str.charAt(i + 1)) != -1 && Util.OooOOo(str.charAt(i3)) != -1;
        }

        public static ArrayList OooO0o(String str) {
            ArrayList arrayList = new ArrayList();
            int i = 0;
            while (i <= str.length()) {
                int iOooo0 = C33599OooOo0O.Oooo0(str, '&', i, 4);
                if (iOooo0 == -1) {
                    iOooo0 = str.length();
                }
                int iOooo02 = C33599OooOo0O.Oooo0(str, '=', i, 4);
                if (iOooo02 == -1 || iOooo02 > iOooo0) {
                    String strSubstring = str.substring(i, iOooo0);
                    OooOOO0.OooO0o(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
                    arrayList.add(strSubstring);
                    arrayList.add(null);
                } else {
                    String strSubstring2 = str.substring(i, iOooo02);
                    OooOOO0.OooO0o(strSubstring2, "this as java.lang.String…ing(startIndex, endIndex)");
                    arrayList.add(strSubstring2);
                    String strSubstring3 = str.substring(iOooo02 + 1, iOooo0);
                    OooOOO0.OooO0o(strSubstring3, "this as java.lang.String…ing(startIndex, endIndex)");
                    arrayList.add(strSubstring3);
                }
                i = iOooo0 + 1;
            }
            return arrayList;
        }

        public static String OooO0o0(Companion companion, String str, int i, int i2, int i3) {
            int i4;
            if ((i3 & 1) != 0) {
                i = 0;
            }
            if ((i3 & 2) != 0) {
                i2 = str.length();
            }
            boolean z = (i3 & 4) == 0;
            companion.getClass();
            OooOOO0.OooO0oO(str, "<this>");
            int iCharCount = i;
            while (iCharCount < i2) {
                int i5 = iCharCount + 1;
                char cCharAt = str.charAt(iCharCount);
                if (cCharAt == '%' || (cCharAt == '+' && z)) {
                    C34524OooO0Oo c34524OooO0Oo = new C34524OooO0Oo();
                    c34524OooO0Oo.o000Oo0O(i, iCharCount, str);
                    while (iCharCount < i2) {
                        int iCodePointAt = str.codePointAt(iCharCount);
                        if (iCodePointAt == 37 && (i4 = iCharCount + 2) < i2) {
                            int iOooOOo = Util.OooOOo(str.charAt(iCharCount + 1));
                            int iOooOOo2 = Util.OooOOo(str.charAt(i4));
                            if (iOooOOo == -1 || iOooOOo2 == -1) {
                                c34524OooO0Oo.o000Oo(iCodePointAt);
                                iCharCount += Character.charCount(iCodePointAt);
                            } else {
                                c34524OooO0Oo.o0OoO0o((iOooOOo << 4) + iOooOOo2);
                                iCharCount = Character.charCount(iCodePointAt) + i4;
                            }
                        } else if (iCodePointAt == 43 && z) {
                            c34524OooO0Oo.o0OoO0o(32);
                            iCharCount++;
                        } else {
                            c34524OooO0Oo.o000Oo(iCodePointAt);
                            iCharCount += Character.charCount(iCodePointAt);
                        }
                    }
                    return c34524OooO0Oo.o00000OO();
                }
                iCharCount = i5;
            }
            String strSubstring = str.substring(i, i2);
            OooOOO0.OooO0o(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
            return strSubstring;
        }

        private Companion() {
        }
    }

    public HttpUrl(String scheme, String str, String str2, String host, int i, ArrayList arrayList, ArrayList arrayList2, String str3, String str4) {
        OooOOO0.OooO0oO(scheme, "scheme");
        OooOOO0.OooO0oO(host, "host");
        this.f124129OooO00o = scheme;
        this.f124130OooO0O0 = str;
        this.f124131OooO0OO = str2;
        this.f124132OooO0Oo = host;
        this.f124134OooO0o0 = i;
        this.f124133OooO0o = arrayList;
        this.f124135OooO0oO = arrayList2;
        this.f124136OooO0oo = str3;
        this.f124128OooO = str4;
        this.f124137OooOO0 = scheme.equals(AuthenticationConstants.HTTPS_PROTOCOL_STRING);
    }

    public final URI OooO() {
        String strReplaceAll;
        Builder builderOooO0o = OooO0o();
        String str = builderOooO0o.f124142OooO0Oo;
        if (str == null) {
            strReplaceAll = null;
        } else {
            Pattern patternCompile = Pattern.compile("[\"<>^`{|}]");
            OooOOO0.OooO0o(patternCompile, "compile(...)");
            strReplaceAll = patternCompile.matcher(str).replaceAll("");
            OooOOO0.OooO0o(strReplaceAll, "replaceAll(...)");
        }
        builderOooO0o.f124142OooO0Oo = strReplaceAll;
        ArrayList arrayList = builderOooO0o.f124143OooO0o;
        int size = arrayList.size();
        int i = 0;
        for (int i2 = 0; i2 < size; i2++) {
            arrayList.set(i2, Companion.OooO00o(f124126OooOO0O, (String) arrayList.get(i2), 0, 0, C18416x7.f56644n, 227));
        }
        ArrayList arrayList2 = builderOooO0o.f124145OooO0oO;
        if (arrayList2 != null) {
            int size2 = arrayList2.size();
            while (i < size2) {
                int i3 = i + 1;
                String str2 = (String) arrayList2.get(i);
                arrayList2.set(i, str2 == null ? null : Companion.OooO00o(f124126OooOO0O, str2, 0, 0, C18416x7.f56648r, 195));
                i = i3;
            }
        }
        String str3 = builderOooO0o.f124146OooO0oo;
        builderOooO0o.f124146OooO0oo = str3 != null ? Companion.OooO00o(f124126OooOO0O, str3, 0, 0, C18416x7.f56651u, 163) : null;
        String string = builderOooO0o.toString();
        try {
            return new URI(string);
        } catch (URISyntaxException e) {
            try {
                Pattern patternCompile2 = Pattern.compile("[\\u0000-\\u001F\\u007F-\\u009F\\p{javaWhitespace}]");
                OooOOO0.OooO0o(patternCompile2, "compile(...)");
                String strReplaceAll2 = patternCompile2.matcher(string).replaceAll("");
                OooOOO0.OooO0o(strReplaceAll2, "replaceAll(...)");
                URI uriCreate = URI.create(strReplaceAll2);
                OooOOO0.OooO0o(uriCreate, "{\n      // Unlikely edge…Unexpected!\n      }\n    }");
                return uriCreate;
            } catch (Exception unused) {
                throw new RuntimeException(e);
            }
        }
    }

    public final String OooO00o() {
        if (this.f124131OooO0OO.length() == 0) {
            return "";
        }
        int length = this.f124129OooO00o.length() + 3;
        String str = this.f124128OooO;
        String strSubstring = str.substring(C33599OooOo0O.Oooo0(str, ':', length, 4) + 1, C33599OooOo0O.Oooo0(str, '@', 0, 6));
        OooOOO0.OooO0o(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
        return strSubstring;
    }

    public final String OooO0O0() {
        int length = this.f124129OooO00o.length() + 3;
        String str = this.f124128OooO;
        int iOooo0 = C33599OooOo0O.Oooo0(str, IOUtils.DIR_SEPARATOR_UNIX, length, 4);
        String strSubstring = str.substring(iOooo0, Util.OooO0o0(iOooo0, str.length(), str, "?#"));
        OooOOO0.OooO0o(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
        return strSubstring;
    }

    public final ArrayList OooO0OO() {
        int length = this.f124129OooO00o.length() + 3;
        String str = this.f124128OooO;
        int iOooo0 = C33599OooOo0O.Oooo0(str, IOUtils.DIR_SEPARATOR_UNIX, length, 4);
        int iOooO0o0 = Util.OooO0o0(iOooo0, str.length(), str, "?#");
        ArrayList arrayList = new ArrayList();
        while (iOooo0 < iOooO0o0) {
            int i = iOooo0 + 1;
            int iOooO0o = Util.OooO0o(str, IOUtils.DIR_SEPARATOR_UNIX, i, iOooO0o0);
            String strSubstring = str.substring(i, iOooO0o);
            OooOOO0.OooO0o(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
            arrayList.add(strSubstring);
            iOooo0 = iOooO0o;
        }
        return arrayList;
    }

    public final String OooO0Oo() {
        if (this.f124135OooO0oO == null) {
            return null;
        }
        String str = this.f124128OooO;
        int iOooo0 = C33599OooOo0O.Oooo0(str, '?', 0, 6) + 1;
        String strSubstring = str.substring(iOooo0, Util.OooO0o(str, '#', iOooo0, str.length()));
        OooOOO0.OooO0o(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
        return strSubstring;
    }

    public final Builder OooO0o() {
        Builder builder = new Builder();
        String str = this.f124129OooO00o;
        builder.f124139OooO00o = str;
        builder.f124140OooO0O0 = OooO0o0();
        builder.f124141OooO0OO = OooO00o();
        builder.f124142OooO0Oo = this.f124132OooO0Oo;
        Companion companion = f124126OooOO0O;
        companion.getClass();
        int iOooO0O0 = Companion.OooO0O0(str);
        int i = this.f124134OooO0o0;
        if (i == iOooO0O0) {
            i = -1;
        }
        builder.f124144OooO0o0 = i;
        ArrayList arrayList = builder.f124143OooO0o;
        arrayList.clear();
        arrayList.addAll(OooO0OO());
        String strOooO0Oo = OooO0Oo();
        String strSubstring = null;
        builder.f124145OooO0oO = strOooO0Oo == null ? null : Companion.OooO0o(Companion.OooO00o(companion, strOooO0Oo, 0, 0, C18416x7.f56645o, 211));
        if (this.f124136OooO0oo != null) {
            String str2 = this.f124128OooO;
            strSubstring = str2.substring(C33599OooOo0O.Oooo0(str2, '#', 0, 6) + 1);
            OooOOO0.OooO0o(strSubstring, "this as java.lang.String).substring(startIndex)");
        }
        builder.f124146OooO0oo = strSubstring;
        return builder;
    }

    public final String OooO0o0() {
        if (this.f124130OooO0O0.length() == 0) {
            return "";
        }
        int length = this.f124129OooO00o.length() + 3;
        String str = this.f124128OooO;
        String strSubstring = str.substring(length, Util.OooO0o0(length, str.length(), str, ":@"));
        OooOOO0.OooO0o(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
        return strSubstring;
    }

    public final Builder OooO0oO(String link) throws EOFException {
        OooOOO0.OooO0oO(link, "link");
        try {
            Builder builder = new Builder();
            builder.OooO0o0(this, link);
            return builder;
        } catch (IllegalArgumentException unused) {
            return null;
        }
    }

    public final String OooO0oo() throws EOFException {
        Builder builderOooO0oO = OooO0oO("/...");
        OooOOO0.OooO0Oo(builderOooO0oO);
        Companion companion = f124126OooOO0O;
        builderOooO0oO.f124140OooO0O0 = Companion.OooO00o(companion, "", 0, 0, " \"':;<=>@[]^`{}|/\\?#", StyleIdentifier.MEDIUM_LIST_1_ACCENT_6);
        builderOooO0oO.f124141OooO0OO = Companion.OooO00o(companion, "", 0, 0, " \"':;<=>@[]^`{}|/\\?#", StyleIdentifier.MEDIUM_LIST_1_ACCENT_6);
        return builderOooO0oO.OooO0OO().f124128OooO;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof HttpUrl) && OooOOO0.OooO0O0(((HttpUrl) obj).f124128OooO, this.f124128OooO);
    }

    public final int hashCode() {
        return this.f124128OooO.hashCode();
    }

    /* JADX INFO: renamed from: toString, reason: from getter */
    public final String getF124128OooO() {
        return this.f124128OooO;
    }
}
