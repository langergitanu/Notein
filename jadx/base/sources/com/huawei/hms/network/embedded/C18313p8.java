package com.huawei.hms.network.embedded;

import OooOoo.C20593OooO0Oo;
import Oooo0oO.C21111o0ooOoO;
import android.support.v4.media.session.PlaybackStateCompat;
import androidx.core.location.LocationRequestCompat;
import com.aspose.slides.C22226Oooo0oo;
import com.huawei.hms.network.embedded.C18313p8;
import com.huawei.hms.network.embedded.C18377u7;
import java.io.Closeable;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.net.IDN;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.security.AccessControlException;
import java.security.GeneralSecurityException;
import java.security.KeyStore;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.TimeZone;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.TimeUnit;
import java.util.regex.Pattern;
import javax.net.ssl.TrustManager;
import javax.net.ssl.TrustManagerFactory;
import javax.net.ssl.X509TrustManager;
import o0oO0Ooo.C30789OooO0Oo;

/* JADX INFO: renamed from: com.huawei.hms.network.embedded.p8 */
/* JADX INFO: loaded from: classes9.dex */
public final class C18313p8 {

    /* JADX INFO: renamed from: a */
    public static final byte[] f55892a;

    /* JADX INFO: renamed from: d */
    public static final AbstractC18202h8 f55895d;

    /* JADX INFO: renamed from: e */
    public static final AbstractC18174f8 f55896e;

    /* JADX INFO: renamed from: k */
    public static final Method f55902k;

    /* JADX INFO: renamed from: l */
    public static final Pattern f55903l;

    /* JADX INFO: renamed from: b */
    public static final String[] f55893b = new String[0];

    /* JADX INFO: renamed from: c */
    public static final C18377u7 f55894c = C18377u7.m79607a(new String[0]);

    /* JADX INFO: renamed from: f */
    public static final C18446zb f55897f = C18446zb.m80071a(C18303ob.m79297b("efbbbf"), C18303ob.m79297b("feff"), C18303ob.m79297b("fffe"), C18303ob.m79297b("0000ffff"), C18303ob.m79297b("ffff0000"));

    /* JADX INFO: renamed from: g */
    public static final Charset f55898g = Charset.forName("UTF-32BE");

    /* JADX INFO: renamed from: h */
    public static final Charset f55899h = Charset.forName("UTF-32LE");

    /* JADX INFO: renamed from: i */
    public static final TimeZone f55900i = TimeZone.getTimeZone("GMT");

    /* JADX INFO: renamed from: j */
    public static final Comparator<String> f55901j = new C30789OooO0Oo();

    static {
        byte[] bArr = new byte[0];
        f55892a = bArr;
        Method declaredMethod = null;
        f55895d = AbstractC18202h8.m78684a((C18442z7) null, bArr);
        f55896e = AbstractC18174f8.create((C18442z7) null, bArr);
        try {
            declaredMethod = Throwable.class.getDeclaredMethod("addSuppressed", Throwable.class);
        } catch (Exception unused) {
        }
        f55902k = declaredMethod;
        f55903l = Pattern.compile("([0-9a-fA-F]*:[0-9a-fA-F:.]*)|([\\d.]+)");
    }

    /* JADX INFO: renamed from: a */
    public static int m79358a(char c) {
        if (c >= '0' && c <= '9') {
            return c - '0';
        }
        if (c >= 'a' && c <= 'f') {
            return c - 'W';
        }
        if (c < 'A' || c > 'F') {
            return -1;
        }
        return c - '7';
    }

    /* JADX INFO: renamed from: b */
    public static int m79388b(String str, int i, int i2) {
        while (i < i2) {
            char cCharAt = str.charAt(i);
            if (cCharAt != '\t' && cCharAt != '\n' && cCharAt != '\f' && cCharAt != '\r' && cCharAt != ' ') {
                return i;
            }
            i++;
        }
        return i2;
    }

    /* JADX INFO: renamed from: c */
    public static int m79393c(String str) {
        int length = str.length();
        for (int i = 0; i < length; i++) {
            char cCharAt = str.charAt(i);
            if (cCharAt <= 31 || cCharAt >= 127) {
                return i;
            }
        }
        return -1;
    }

    /* JADX INFO: renamed from: d */
    public static String m79395d(String str, int i, int i2) {
        int iM79388b = m79388b(str, i, i2);
        return str.substring(iM79388b, m79394c(str, iM79388b, i2));
    }

    /* JADX INFO: renamed from: a */
    public static int m79359a(String str, int i, int i2, char c) {
        while (i < i2) {
            if (str.charAt(i) == c) {
                return i;
            }
            i++;
        }
        return i2;
    }

    /* JADX INFO: renamed from: b */
    public static C18377u7 m79389b(List<C18134ca> list) {
        C18377u7.a aVar = new C18377u7.a();
        for (C18134ca c18134ca : list) {
            AbstractC18286n8.f55777a.mo77973a(aVar, c18134ca.f54496a.mo78740n(), c18134ca.f54497b.mo78740n());
        }
        return aVar.m79627a();
    }

    /* JADX INFO: renamed from: c */
    public static int m79394c(String str, int i, int i2) {
        for (int i3 = i2 - 1; i3 >= i; i3--) {
            char cCharAt = str.charAt(i3);
            if (cCharAt != '\t' && cCharAt != '\n' && cCharAt != '\f' && cCharAt != '\r' && cCharAt != ' ') {
                return i3 + 1;
            }
        }
        return i;
    }

    /* JADX INFO: renamed from: d */
    public static boolean m79396d(String str) {
        return f55903l.matcher(str).matches();
    }

    /* JADX INFO: renamed from: a */
    public static int m79360a(String str, int i, int i2, String str2) {
        while (i < i2) {
            if (str2.indexOf(str.charAt(i)) != -1) {
                return i;
            }
            i++;
        }
        return i2;
    }

    /* JADX INFO: renamed from: b */
    public static boolean m79390b(InterfaceC18234jc interfaceC18234jc, int i, TimeUnit timeUnit) throws IOException {
        long jNanoTime = System.nanoTime();
        long jMo79000c = interfaceC18234jc.timeout().mo79001d() ? interfaceC18234jc.timeout().mo79000c() - jNanoTime : Long.MAX_VALUE;
        interfaceC18234jc.timeout().mo78995a(Math.min(jMo79000c, timeUnit.toNanos(i)) + jNanoTime);
        try {
            C18261lb c18261lb = new C18261lb();
            while (interfaceC18234jc.mo77914c(c18261lb, PlaybackStateCompat.ACTION_PLAY_FROM_URI) != -1) {
                c18261lb.m79095s();
            }
            C18248kc c18248kcTimeout = interfaceC18234jc.timeout();
            if (jMo79000c == LocationRequestCompat.PASSIVE_INTERVAL) {
                c18248kcTimeout.mo78994a();
                return true;
            }
            c18248kcTimeout.mo78995a(jNanoTime + jMo79000c);
            return true;
        } catch (InterruptedIOException unused) {
            C18248kc c18248kcTimeout2 = interfaceC18234jc.timeout();
            if (jMo79000c == LocationRequestCompat.PASSIVE_INTERVAL) {
                c18248kcTimeout2.mo78994a();
                return false;
            }
            c18248kcTimeout2.mo78995a(jNanoTime + jMo79000c);
            return false;
        } catch (Throwable th) {
            C18248kc c18248kcTimeout3 = interfaceC18234jc.timeout();
            if (jMo79000c == LocationRequestCompat.PASSIVE_INTERVAL) {
                c18248kcTimeout3.mo78994a();
            } else {
                c18248kcTimeout3.mo78995a(jNanoTime + jMo79000c);
            }
            throw th;
        }
    }

    /* JADX INFO: renamed from: a */
    public static int m79361a(String str, long j, TimeUnit timeUnit) {
        if (j < 0) {
            throw new IllegalArgumentException(C21111o0ooOoO.OooO0Oo(str, " < 0"));
        }
        if (timeUnit == null) {
            throw new NullPointerException("unit == null");
        }
        long millis = timeUnit.toMillis(j);
        if (millis > 2147483647L) {
            throw new IllegalArgumentException(C21111o0ooOoO.OooO0Oo(str, " too large."));
        }
        if (millis != 0 || j <= 0) {
            return (int) millis;
        }
        throw new IllegalArgumentException(C21111o0ooOoO.OooO0Oo(str, " too small."));
    }

    /* JADX INFO: renamed from: b */
    public static boolean m79391b(String str) {
        for (int i = 0; i < str.length(); i++) {
            char cCharAt = str.charAt(i);
            if (cCharAt <= 31 || cCharAt >= 127 || " #%/:?@[\\]".indexOf(cCharAt) != -1) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: b */
    public static boolean m79392b(Comparator<String> comparator, String[] strArr, String[] strArr2) {
        if (strArr != null && strArr2 != null && strArr.length != 0 && strArr2.length != 0) {
            for (String str : strArr) {
                for (String str2 : strArr2) {
                    if (comparator.compare(str, str2) == 0) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: a */
    public static int m79362a(Comparator<String> comparator, String[] strArr, String str) {
        int length = strArr.length;
        for (int i = 0; i < length; i++) {
            if (comparator.compare(strArr[i], str) == 0) {
                return i;
            }
        }
        return -1;
    }

    /* JADX INFO: renamed from: a */
    public static String m79363a(C18416x7 c18416x7, boolean z) {
        String strM79929h;
        if (c18416x7.m79929h().contains(C18241k5.f55433h)) {
            strM79929h = "[" + c18416x7.m79929h() + "]";
        } else {
            strM79929h = c18416x7.m79929h();
        }
        if (!z && c18416x7.m79935n() == C18416x7.m79912e(c18416x7.m79940s())) {
            return strM79929h;
        }
        StringBuilder sbOooO0OO = C22226Oooo0oo.OooO0OO(strM79929h, C18241k5.f55433h);
        sbOooO0OO.append(c18416x7.m79935n());
        return sbOooO0OO.toString();
    }

    /* JADX INFO: renamed from: a */
    public static String m79364a(String str) {
        int length;
        int i;
        if (!str.contains(C18241k5.f55433h)) {
            try {
                String lowerCase = IDN.toASCII(str).toLowerCase(Locale.US);
                if (lowerCase.isEmpty()) {
                    return null;
                }
                if (m79391b(lowerCase)) {
                    return null;
                }
                return lowerCase;
            } catch (IllegalArgumentException unused) {
                return null;
            }
        }
        if (str.startsWith("[") && str.endsWith("]")) {
            i = 1;
            length = str.length() - 1;
        } else {
            length = str.length();
            i = 0;
        }
        InetAddress inetAddressM79369a = m79369a(str, i, length);
        if (inetAddressM79369a == null) {
            return null;
        }
        byte[] address = inetAddressM79369a.getAddress();
        if (address.length == 16) {
            return m79367a(address);
        }
        if (address.length == 4) {
            return inetAddressM79369a.getHostAddress();
        }
        throw new AssertionError(C20593OooO0Oo.OooO0O0("Invalid IPv6 address: '", str, "'"));
    }

    /* JADX INFO: renamed from: a */
    public static String m79365a(String str, String str2) {
        String property;
        try {
            property = System.getProperty(str);
        } catch (AccessControlException unused) {
        }
        return property != null ? property : str2;
    }

    /* JADX INFO: renamed from: a */
    public static String m79366a(String str, Object... objArr) {
        return String.format(Locale.US, str, objArr);
    }

    /* JADX INFO: renamed from: a */
    public static String m79367a(byte[] bArr) {
        int i = -1;
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        while (i3 < bArr.length) {
            int i5 = i3;
            while (i5 < 16 && bArr[i5] == 0 && bArr[i5 + 1] == 0) {
                i5 += 2;
            }
            int i6 = i5 - i3;
            if (i6 > i4 && i6 >= 4) {
                i = i3;
                i4 = i6;
            }
            i3 = i5 + 2;
        }
        C18261lb c18261lb = new C18261lb();
        while (i2 < bArr.length) {
            if (i2 == i) {
                c18261lb.writeByte(58);
                i2 += i4;
                if (i2 == 16) {
                    c18261lb.writeByte(58);
                }
            } else {
                if (i2 > 0) {
                    c18261lb.writeByte(58);
                }
                c18261lb.mo78272h(((bArr[i2] & 255) << 8) | (bArr[i2 + 1] & 255));
                i2 += 2;
            }
        }
        return c18261lb.mo78398o();
    }

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ Thread m79368a(String str, boolean z, Runnable runnable) {
        Thread thread = new Thread(runnable, str);
        thread.setDaemon(z);
        return thread;
    }

    /* JADX WARN: Code restructure failed: missing block: B:42:0x0079, code lost:
    
        if (r4 == 16) goto L50;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x007b, code lost:
    
        if (r5 != (-1)) goto L45;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x007d, code lost:
    
        return null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x007e, code lost:
    
        r12 = r4 - r5;
        java.lang.System.arraycopy(r1, r5, r1, 16 - r12, r12);
        java.util.Arrays.fill(r1, r5, (16 - r4) + r5, (byte) 0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x008e, code lost:
    
        return java.net.InetAddress.getByAddress(r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x0094, code lost:
    
        throw new java.lang.AssertionError();
     */
    /* JADX WARN: Removed duplicated region for block: B:31:0x004f  */
    /* JADX INFO: renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static InetAddress m79369a(String str, int i, int i2) {
        int i3;
        byte[] bArr = new byte[16];
        int i4 = 0;
        int i5 = -1;
        int i6 = -1;
        while (true) {
            if (i < i2) {
                if (i4 != 16) {
                    int i7 = i + 2;
                    if (i7 <= i2 && str.regionMatches(i, "::", 0, 2)) {
                        if (i5 == -1) {
                            i4 += 2;
                            i5 = i4;
                            if (i7 != i2) {
                                i6 = i7;
                                int i8 = 0;
                                i = i6;
                                while (i < i2) {
                                }
                                i3 = i - i6;
                                if (i3 == 0) {
                                    break;
                                }
                                break;
                                break;
                            }
                            break;
                        }
                        return null;
                    }
                    if (i4 != 0) {
                        if (str.regionMatches(i, C18241k5.f55433h, 0, 1)) {
                            i++;
                        } else {
                            if (!str.regionMatches(i, ".", 0, 1) || !m79385a(str, i6, i2, bArr, i4 - 2)) {
                                return null;
                            }
                            i4 += 2;
                        }
                    }
                    i6 = i;
                    int i82 = 0;
                    i = i6;
                    while (i < i2) {
                        int iM79358a = m79358a(str.charAt(i));
                        if (iM79358a == -1) {
                            break;
                        }
                        i82 = (i82 << 4) + iM79358a;
                        i++;
                    }
                    i3 = i - i6;
                    if (i3 == 0 || i3 > 4) {
                        break;
                    }
                    int i9 = i4 + 1;
                    bArr[i4] = (byte) ((i82 >>> 8) & 255);
                    i4 += 2;
                    bArr[i9] = (byte) (i82 & 255);
                } else {
                    return null;
                }
            } else {
                break;
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: a */
    public static Charset m79370a(InterfaceC18289nb interfaceC18289nb, Charset charset) throws IOException {
        int iMo78367a = interfaceC18289nb.mo78367a(f55897f);
        if (iMo78367a == -1) {
            return charset;
        }
        if (iMo78367a == 0) {
            return StandardCharsets.UTF_8;
        }
        if (iMo78367a == 1) {
            return StandardCharsets.UTF_16BE;
        }
        if (iMo78367a == 2) {
            return StandardCharsets.UTF_16LE;
        }
        if (iMo78367a == 3) {
            return f55898g;
        }
        if (iMo78367a == 4) {
            return f55899h;
        }
        throw new AssertionError();
    }

    /* JADX INFO: renamed from: a */
    public static List<C18134ca> m79371a(C18377u7 c18377u7) {
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < c18377u7.m79619d(); i++) {
            arrayList.add(new C18134ca(c18377u7.m79612a(i), c18377u7.m79614b(i)));
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: a */
    public static <T> List<T> m79372a(List<T> list) {
        return Collections.unmodifiableList(new ArrayList(list));
    }

    @SafeVarargs
    /* JADX INFO: renamed from: a */
    public static <T> List<T> m79373a(T... tArr) {
        return Collections.unmodifiableList(Arrays.asList((Object[]) tArr.clone()));
    }

    /* JADX INFO: renamed from: a */
    public static <K, V> Map<K, V> m79374a(Map<K, V> map) {
        return map.isEmpty() ? Collections.EMPTY_MAP : Collections.unmodifiableMap(new LinkedHashMap(map));
    }

    /* JADX INFO: renamed from: a */
    public static ThreadFactory m79375a(final String str, final boolean z) {
        return new ThreadFactory() { // from class: o0oO0Ooo.OooO0o0
            @Override // java.util.concurrent.ThreadFactory
            public final Thread newThread(Runnable runnable) {
                return C18313p8.m79368a(str, z, runnable);
            }
        };
    }

    /* JADX INFO: renamed from: a */
    public static X509TrustManager m79376a() {
        try {
            TrustManagerFactory trustManagerFactory = TrustManagerFactory.getInstance(TrustManagerFactory.getDefaultAlgorithm());
            trustManagerFactory.init((KeyStore) null);
            TrustManager[] trustManagers = trustManagerFactory.getTrustManagers();
            if (trustManagers.length == 1) {
                TrustManager trustManager = trustManagers[0];
                if (trustManager instanceof X509TrustManager) {
                    return (X509TrustManager) trustManager;
                }
            }
            throw new IllegalStateException("Unexpected default trust managers:" + Arrays.toString(trustManagers));
        } catch (GeneralSecurityException e) {
            throw new AssertionError("No System TLS", e);
        }
    }

    /* JADX INFO: renamed from: a */
    public static void m79377a(long j, long j2, long j3) {
        if ((j2 | j3) < 0 || j2 > j || j - j2 < j3) {
            throw new ArrayIndexOutOfBoundsException();
        }
    }

    /* JADX INFO: renamed from: a */
    public static void m79378a(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (RuntimeException e) {
                throw e;
            } catch (Exception unused) {
            }
        }
    }

    /* JADX INFO: renamed from: a */
    public static void m79379a(Throwable th, Throwable th2) {
        Method method = f55902k;
        if (method != null) {
            try {
                method.invoke(th, th2);
            } catch (IllegalAccessException | InvocationTargetException unused) {
            }
        }
    }

    /* JADX INFO: renamed from: a */
    public static void m79380a(ServerSocket serverSocket) {
        if (serverSocket != null) {
            try {
                serverSocket.close();
            } catch (RuntimeException e) {
                throw e;
            } catch (Exception unused) {
            }
        }
    }

    /* JADX INFO: renamed from: a */
    public static void m79381a(Socket socket) {
        if (socket != null) {
            try {
                socket.close();
            } catch (AssertionError e) {
                if (!m79384a(e)) {
                    throw e;
                }
            } catch (RuntimeException e2) {
                throw e2;
            } catch (Exception unused) {
            }
        }
    }

    /* JADX INFO: renamed from: a */
    public static boolean m79382a(InterfaceC18234jc interfaceC18234jc, int i, TimeUnit timeUnit) {
        try {
            return m79390b(interfaceC18234jc, i, timeUnit);
        } catch (IOException unused) {
            return false;
        }
    }

    /* JADX INFO: renamed from: a */
    public static boolean m79383a(C18416x7 c18416x7, C18416x7 c18416x72) {
        return c18416x7.m79929h().equals(c18416x72.m79929h()) && c18416x7.m79935n() == c18416x72.m79935n() && c18416x7.m79940s().equals(c18416x72.m79940s());
    }

    /* JADX INFO: renamed from: a */
    public static boolean m79384a(AssertionError assertionError) {
        return (assertionError.getCause() == null || assertionError.getMessage() == null || !assertionError.getMessage().contains("getsockname failed")) ? false : true;
    }

    /* JADX INFO: renamed from: a */
    public static boolean m79385a(String str, int i, int i2, byte[] bArr, int i3) {
        int i4 = i3;
        while (i < i2) {
            if (i4 == bArr.length) {
                return false;
            }
            if (i4 != i3) {
                if (str.charAt(i) != '.') {
                    return false;
                }
                i++;
            }
            int i5 = i;
            int i6 = 0;
            while (i5 < i2) {
                char cCharAt = str.charAt(i5);
                if (cCharAt < '0' || cCharAt > '9') {
                    break;
                }
                if ((i6 == 0 && i != i5) || (i6 = ((i6 * 10) + cCharAt) - 48) > 255) {
                    return false;
                }
                i5++;
            }
            if (i5 - i == 0) {
                return false;
            }
            bArr[i4] = (byte) i6;
            i4++;
            i = i5;
        }
        return i4 == i3 + 4;
    }

    /* JADX INFO: renamed from: a */
    public static String[] m79386a(Comparator<? super String> comparator, String[] strArr, String[] strArr2) {
        ArrayList arrayList = new ArrayList();
        for (String str : strArr) {
            int length = strArr2.length;
            int i = 0;
            while (true) {
                if (i >= length) {
                    break;
                }
                if (comparator.compare(str, strArr2[i]) == 0) {
                    arrayList.add(str);
                    break;
                }
                i++;
            }
        }
        return (String[]) arrayList.toArray(new String[arrayList.size()]);
    }

    /* JADX INFO: renamed from: a */
    public static String[] m79387a(String[] strArr, String str) {
        int length = strArr.length;
        String[] strArr2 = new String[length + 1];
        System.arraycopy(strArr, 0, strArr2, 0, strArr.length);
        strArr2[length] = str;
        return strArr2;
    }
}
