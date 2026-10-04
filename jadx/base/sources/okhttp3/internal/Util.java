package okhttp3.internal;

import android.support.v4.media.session.PlaybackStateCompat;
import androidx.core.location.LocationRequestCompat;
import com.google.common.net.HttpHeaders;
import com.huawei.hms.network.embedded.C18241k5;
import java.io.Closeable;
import java.io.EOFException;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.Socket;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.TimeZone;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.jvm.internal.OooO0O0;
import kotlin.jvm.internal.OooO0OO;
import kotlin.jvm.internal.OooOOO0;
import o000oo0.C24684Oooo;
import oO00ooO.C32435OooO0Oo;
import oO0o0O0o.C33580OooO00o;
import oO0o0O0o.C33588OooOO0;
import oO0o0O0o.C33599OooOo0O;
import oOo000Oo.C34429OooOOo0;
import oOo000Oo.OooOo;
import oOo00OoO.C34524OooO0Oo;
import oOo00OoO.C34527OooO0oO;
import oOo00OoO.C34536OooOOo;
import oOo00OoO.C34542OooOo0O;
import oOo00OoO.InterfaceC34525OooO0o;
import oOo00OoO.InterfaceC34548OooOoo0;
import okhttp3.Headers;
import okhttp3.HttpUrl;
import okhttp3.OkHttpClient;
import okhttp3.RequestBody;
import okhttp3.RequestBody$Companion$toRequestBody$2;
import okhttp3.Response;
import okhttp3.ResponseBody;
import okhttp3.ResponseBody$Companion$asResponseBody$1;
import okhttp3.internal.http2.Header;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(m80611d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, m80612d2 = {"okhttp"}, m80613k = 2, m80614mv = {1, 6, 0}, m80616xi = 48)
public final class Util {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public static final byte[] f124301OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public static final Headers f124302OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public static final ResponseBody$Companion$asResponseBody$1 f124303OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public static final RequestBody$Companion$toRequestBody$2 f124304OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public static final TimeZone f124305OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public static final C34536OooOOo f124306OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public static final C33588OooOO0 f124307OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public static final String f124308OooO0oo;

    static {
        byte[] bArr = new byte[0];
        f124301OooO00o = bArr;
        Headers.f124123OooOo.getClass();
        f124302OooO0O0 = Headers.Companion.OooO0OO(new String[0]);
        ResponseBody.INSTANCE.getClass();
        f124303OooO0OO = ResponseBody.Companion.OooO0OO(bArr, null);
        f124304OooO0Oo = RequestBody.Companion.OooO0Oo(RequestBody.INSTANCE, bArr, null, 0, 7);
        C34527OooO0oO c34527OooO0oO = C34527OooO0oO.f123734OooOoO;
        f124306OooO0o0 = C34536OooOOo.OooO00o.OooO0O0(C34527OooO0oO.OooO00o.OooO00o("efbbbf"), C34527OooO0oO.OooO00o.OooO00o("feff"), C34527OooO0oO.OooO00o.OooO00o("fffe"), C34527OooO0oO.OooO00o.OooO00o("0000ffff"), C34527OooO0oO.OooO00o.OooO00o("ffff0000"));
        TimeZone timeZone = TimeZone.getTimeZone("GMT");
        OooOOO0.OooO0Oo(timeZone);
        f124305OooO0o = timeZone;
        f124307OooO0oO = new C33588OooOO0("([0-9a-fA-F]*:[0-9a-fA-F:.]*)|([\\d.]+)");
        f124308OooO0oo = C33599OooOo0O.OoooO0O(C33599OooOo0O.OoooO0(OkHttpClient.class.getName(), "okhttp3."), "Client");
    }

    public static final String OooO(String format, Object... objArr) {
        OooOOO0.OooO0oO(format, "format");
        Locale locale = Locale.US;
        Object[] objArrCopyOf = Arrays.copyOf(objArr, objArr.length);
        return String.format(locale, format, Arrays.copyOf(objArrCopyOf, objArrCopyOf.length));
    }

    public static final boolean OooO00o(HttpUrl httpUrl, HttpUrl other) {
        OooOOO0.OooO0oO(httpUrl, "<this>");
        OooOOO0.OooO0oO(other, "other");
        return OooOOO0.OooO0O0(httpUrl.f124132OooO0Oo, other.f124132OooO0Oo) && httpUrl.f124134OooO0o0 == other.f124134OooO0o0 && OooOOO0.OooO0O0(httpUrl.f124129OooO00o, other.f124129OooO00o);
    }

    public static final int OooO0O0(long j, TimeUnit timeUnit) {
        if (j < 0) {
            throw new IllegalStateException(OooOOO0.OooOOO0(" < 0", "timeout").toString());
        }
        if (timeUnit == null) {
            throw new IllegalStateException("unit == null");
        }
        long millis = timeUnit.toMillis(j);
        if (millis > 2147483647L) {
            throw new IllegalArgumentException(OooOOO0.OooOOO0(" too large.", "timeout").toString());
        }
        if (millis != 0 || j <= 0) {
            return (int) millis;
        }
        throw new IllegalArgumentException(OooOOO0.OooOOO0(" too small.", "timeout").toString());
    }

    public static final void OooO0OO(Closeable closeable) {
        OooOOO0.OooO0oO(closeable, "<this>");
        try {
            closeable.close();
        } catch (RuntimeException e) {
            throw e;
        } catch (Exception unused) {
        }
    }

    public static final void OooO0Oo(Socket socket) {
        OooOOO0.OooO0oO(socket, "<this>");
        try {
            socket.close();
        } catch (AssertionError e) {
            throw e;
        } catch (RuntimeException e2) {
            if (!OooOOO0.OooO0O0(e2.getMessage(), "bio == null")) {
                throw e2;
            }
        } catch (Exception unused) {
        }
    }

    public static final int OooO0o(String str, char c, int i, int i2) {
        OooOOO0.OooO0oO(str, "<this>");
        while (i < i2) {
            int i3 = i + 1;
            if (str.charAt(i) == c) {
                return i;
            }
            i = i3;
        }
        return i2;
    }

    public static final int OooO0o0(int i, int i2, String str, String str2) {
        OooOOO0.OooO0oO(str, "<this>");
        while (i < i2) {
            int i3 = i + 1;
            if (C33599OooOo0O.OooOoo0(str2, str.charAt(i))) {
                return i;
            }
            i = i3;
        }
        return i2;
    }

    public static /* synthetic */ int OooO0oO(String str, char c, int i, int i2, int i3) {
        if ((i3 & 2) != 0) {
            i = 0;
        }
        if ((i3 & 4) != 0) {
            i2 = str.length();
        }
        return OooO0o(str, c, i, i2);
    }

    public static final boolean OooO0oo(InterfaceC34548OooOoo0 interfaceC34548OooOoo0) {
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        OooOOO0.OooO0oO(timeUnit, "timeUnit");
        try {
            return OooOo0O(100, interfaceC34548OooOoo0);
        } catch (IOException unused) {
            return false;
        }
    }

    public static final boolean OooOO0(Comparator comparator, String[] strArr, String[] strArr2) {
        OooOOO0.OooO0oO(strArr, "<this>");
        OooOOO0.OooO0oO(comparator, "comparator");
        if (strArr.length != 0 && strArr2 != null && strArr2.length != 0) {
            int length = strArr.length;
            int i = 0;
            while (i < length) {
                String str = strArr[i];
                i++;
                OooO0O0 OooO0O02 = OooO0OO.OooO0O0(strArr2);
                while (OooO0O02.hasNext()) {
                    if (comparator.compare(str, (String) OooO0O02.next()) == 0) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public static final long OooOO0O(Response response) {
        String strOooO0O0 = response.f124263OooOoo0.OooO0O0("Content-Length");
        if (strOooO0O0 == null) {
            return -1L;
        }
        try {
            return Long.parseLong(strOooO0O0);
        } catch (NumberFormatException unused) {
            return -1L;
        }
    }

    @SafeVarargs
    public static final <T> List<T> OooOO0o(T... elements) {
        OooOOO0.OooO0oO(elements, "elements");
        Object[] objArr = (Object[]) elements.clone();
        List<T> listUnmodifiableList = Collections.unmodifiableList(C34429OooOOo0.OooOO0o(Arrays.copyOf(objArr, objArr.length)));
        OooOOO0.OooO0o(listUnmodifiableList, "unmodifiableList(listOf(*elements.clone()))");
        return listUnmodifiableList;
    }

    public static final int OooOOO(int i, int i2, String str) {
        OooOOO0.OooO0oO(str, "<this>");
        while (i < i2) {
            int i3 = i + 1;
            char cCharAt = str.charAt(i);
            if (cCharAt != '\t' && cCharAt != '\n' && cCharAt != '\f' && cCharAt != '\r' && cCharAt != ' ') {
                return i;
            }
            i = i3;
        }
        return i2;
    }

    public static final int OooOOO0(String str) {
        int length = str.length();
        int i = 0;
        while (i < length) {
            int i2 = i + 1;
            char cCharAt = str.charAt(i);
            if (OooOOO0.OooO(cCharAt, 31) <= 0 || OooOOO0.OooO(cCharAt, 127) >= 0) {
                return i;
            }
            i = i2;
        }
        return -1;
    }

    public static final int OooOOOO(int i, int i2, String str) {
        OooOOO0.OooO0oO(str, "<this>");
        int i3 = i2 - 1;
        if (i <= i3) {
            while (true) {
                int i4 = i3 - 1;
                char cCharAt = str.charAt(i3);
                if (cCharAt != '\t' && cCharAt != '\n' && cCharAt != '\f' && cCharAt != '\r' && cCharAt != ' ') {
                    return i3 + 1;
                }
                if (i3 == i) {
                    break;
                }
                i3 = i4;
            }
        }
        return i;
    }

    public static final String[] OooOOOo(Comparator comparator, String[] strArr, String[] other) {
        OooOOO0.OooO0oO(other, "other");
        OooOOO0.OooO0oO(comparator, "comparator");
        ArrayList arrayList = new ArrayList();
        int length = strArr.length;
        int i = 0;
        while (i < length) {
            String str = strArr[i];
            i++;
            int length2 = other.length;
            int i2 = 0;
            while (true) {
                if (i2 < length2) {
                    String str2 = other[i2];
                    i2++;
                    if (comparator.compare(str, str2) == 0) {
                        arrayList.add(str);
                        break;
                    }
                }
            }
        }
        Object[] array = arrayList.toArray(new String[0]);
        if (array != null) {
            return (String[]) array;
        }
        throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
    }

    public static final int OooOOo(char c) {
        if ('0' <= c && c < ':') {
            return c - '0';
        }
        if ('a' <= c && c < 'g') {
            return c - 'W';
        }
        if ('A' > c || c >= 'G') {
            return -1;
        }
        return c - '7';
    }

    public static final boolean OooOOo0(String name) {
        OooOOO0.OooO0oO(name, "name");
        return name.equalsIgnoreCase("Authorization") || name.equalsIgnoreCase(HttpHeaders.COOKIE) || name.equalsIgnoreCase(HttpHeaders.PROXY_AUTHORIZATION) || name.equalsIgnoreCase(HttpHeaders.SET_COOKIE);
    }

    public static final Charset OooOOoo(InterfaceC34525OooO0o interfaceC34525OooO0o, Charset charset) throws IOException {
        OooOOO0.OooO0oO(interfaceC34525OooO0o, "<this>");
        OooOOO0.OooO0oO(charset, "default");
        int iO0OOO0o = interfaceC34525OooO0o.o0OOO0o(f124306OooO0o0);
        if (iO0OOO0o == -1) {
            return charset;
        }
        if (iO0OOO0o == 0) {
            Charset UTF_8 = StandardCharsets.UTF_8;
            OooOOO0.OooO0o(UTF_8, "UTF_8");
            return UTF_8;
        }
        if (iO0OOO0o == 1) {
            Charset UTF_16BE = StandardCharsets.UTF_16BE;
            OooOOO0.OooO0o(UTF_16BE, "UTF_16BE");
            return UTF_16BE;
        }
        if (iO0OOO0o == 2) {
            Charset UTF_16LE = StandardCharsets.UTF_16LE;
            OooOOO0.OooO0o(UTF_16LE, "UTF_16LE");
            return UTF_16LE;
        }
        if (iO0OOO0o == 3) {
            C33580OooO00o.f121230OooO00o.getClass();
            Charset charset2 = C33580OooO00o.f121233OooO0Oo;
            if (charset2 != null) {
                return charset2;
            }
            Charset charsetForName = Charset.forName("UTF-32BE");
            OooOOO0.OooO0o(charsetForName, "forName(...)");
            C33580OooO00o.f121233OooO0Oo = charsetForName;
            return charsetForName;
        }
        if (iO0OOO0o != 4) {
            throw new AssertionError();
        }
        C33580OooO00o.f121230OooO00o.getClass();
        Charset charset3 = C33580OooO00o.f121232OooO0OO;
        if (charset3 != null) {
            return charset3;
        }
        Charset charsetForName2 = Charset.forName("UTF-32LE");
        OooOOO0.OooO0o(charsetForName2, "forName(...)");
        C33580OooO00o.f121232OooO0OO = charsetForName2;
        return charsetForName2;
    }

    public static final String OooOo(HttpUrl httpUrl, boolean z) {
        OooOOO0.OooO0oO(httpUrl, "<this>");
        String strOooO00o = httpUrl.f124132OooO0Oo;
        if (C33599OooOo0O.OooOoOO(strOooO00o, C18241k5.f55433h, false)) {
            strOooO00o = C24684Oooo.OooO00o(']', "[", strOooO00o);
        }
        int i = httpUrl.f124134OooO0o0;
        if (!z) {
            HttpUrl.f124126OooOO0O.getClass();
            if (i == HttpUrl.Companion.OooO0O0(httpUrl.f124129OooO00o)) {
                return strOooO00o;
            }
        }
        return strOooO00o + ':' + i;
    }

    public static final int OooOo0(C34524OooO0Oo c34524OooO0Oo) throws EOFException {
        int i = 0;
        while (!c34524OooO0Oo.o0000o0O() && c34524OooO0Oo.OooOooo(0L) == 61) {
            i++;
            c34524OooO0Oo.readByte();
        }
        return i;
    }

    public static final int OooOo00(C34542OooOo0O c34542OooOo0O) throws IOException {
        OooOOO0.OooO0oO(c34542OooOo0O, "<this>");
        return (c34542OooOo0O.readByte() & 255) | ((c34542OooOo0O.readByte() & 255) << 16) | ((c34542OooOo0O.readByte() & 255) << 8);
    }

    public static final boolean OooOo0O(int i, InterfaceC34548OooOoo0 interfaceC34548OooOoo0) throws IOException {
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        OooOOO0.OooO0oO(timeUnit, "timeUnit");
        long jNanoTime = System.nanoTime();
        long jDeadlineNanoTime = interfaceC34548OooOoo0.timeout().getHasDeadline() ? interfaceC34548OooOoo0.timeout().deadlineNanoTime() - jNanoTime : Long.MAX_VALUE;
        interfaceC34548OooOoo0.timeout().deadlineNanoTime(Math.min(jDeadlineNanoTime, timeUnit.toNanos(i)) + jNanoTime);
        try {
            C34524OooO0Oo c34524OooO0Oo = new C34524OooO0Oo();
            while (interfaceC34548OooOoo0.read(c34524OooO0Oo, PlaybackStateCompat.ACTION_PLAY_FROM_URI) != -1) {
                c34524OooO0Oo.OooO00o();
            }
            if (jDeadlineNanoTime == LocationRequestCompat.PASSIVE_INTERVAL) {
                interfaceC34548OooOoo0.timeout().clearDeadline();
                return true;
            }
            interfaceC34548OooOoo0.timeout().deadlineNanoTime(jNanoTime + jDeadlineNanoTime);
            return true;
        } catch (InterruptedIOException unused) {
            if (jDeadlineNanoTime == LocationRequestCompat.PASSIVE_INTERVAL) {
                interfaceC34548OooOoo0.timeout().clearDeadline();
                return false;
            }
            interfaceC34548OooOoo0.timeout().deadlineNanoTime(jNanoTime + jDeadlineNanoTime);
            return false;
        } catch (Throwable th) {
            if (jDeadlineNanoTime == LocationRequestCompat.PASSIVE_INTERVAL) {
                interfaceC34548OooOoo0.timeout().clearDeadline();
            } else {
                interfaceC34548OooOoo0.timeout().deadlineNanoTime(jNanoTime + jDeadlineNanoTime);
            }
            throw th;
        }
    }

    public static final Headers OooOo0o(List<Header> list) {
        Headers.Builder builder = new Headers.Builder();
        for (Header header : list) {
            builder.OooO0O0(header.f124498OooO00o.OooOOO0(), header.f124499OooO0O0.OooOOO0());
        }
        return builder.OooO0OO();
    }

    public static final int OooOoO(int i, String str) {
        Long lValueOf;
        if (str == null) {
            lValueOf = null;
        } else {
            try {
                lValueOf = Long.valueOf(Long.parseLong(str));
            } catch (NumberFormatException unused) {
                return i;
            }
        }
        if (lValueOf == null) {
            return i;
        }
        long jLongValue = lValueOf.longValue();
        if (jLongValue > 2147483647L) {
            return Integer.MAX_VALUE;
        }
        if (jLongValue < 0) {
            return 0;
        }
        return (int) jLongValue;
    }

    public static final <T> List<T> OooOoO0(List<? extends T> list) {
        OooOOO0.OooO0oO(list, "<this>");
        List<T> listUnmodifiableList = Collections.unmodifiableList(OooOo.o0ooOoO(list));
        OooOOO0.OooO0o(listUnmodifiableList, "unmodifiableList(toMutableList())");
        return listUnmodifiableList;
    }

    public static final String OooOoOO(int i, int i2, String str) {
        int iOooOOO = OooOOO(i, i2, str);
        String strSubstring = str.substring(iOooOOO, OooOOOO(iOooOOO, i2, str));
        OooOOO0.OooO0o(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
        return strSubstring;
    }

    public static final void OooOoo0(IOException iOException, List list) {
        OooOOO0.OooO0oO(iOException, "<this>");
        if (list.size() > 1) {
            System.out.println(list);
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            C32435OooO0Oo.OooO00o(iOException, (Exception) it.next());
        }
    }
}
