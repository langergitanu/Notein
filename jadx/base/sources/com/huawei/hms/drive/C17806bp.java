package com.huawei.hms.drive;

import OooOoo.C20593OooO0Oo;
import android.os.Bundle;
import android.support.v4.media.session.PlaybackStateCompat;
import androidx.core.location.LocationRequestCompat;
import com.aspose.slides.C22226Oooo0oo;
import com.huawei.hms.drive.C17788ay;
import com.huawei.hms.network.embedded.C18241k5;
import java.io.Closeable;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.net.IDN;
import java.net.InetAddress;
import java.net.Socket;
import java.nio.charset.Charset;
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
import oOo00OoO.C34524OooO0Oo;
import oOo00OoO.C34527OooO0oO;
import oOo00OoO.InterfaceC34548OooOoo0;

/* JADX INFO: renamed from: com.huawei.hms.drive.bp */
/* JADX INFO: loaded from: classes6.dex */
public final class C17806bp {

    /* JADX INFO: renamed from: a */
    public static final byte[] f52954a;

    /* JADX INFO: renamed from: b */
    public static final String[] f52955b = new String[0];

    /* JADX INFO: renamed from: c */
    public static final AbstractC17801bk f52956c;

    /* JADX INFO: renamed from: d */
    public static final AbstractC17799bi f52957d;

    /* JADX INFO: renamed from: e */
    public static final Charset f52958e;

    /* JADX INFO: renamed from: f */
    public static final Charset f52959f;

    /* JADX INFO: renamed from: g */
    public static final TimeZone f52960g;

    /* JADX INFO: renamed from: h */
    public static final Comparator<String> f52961h;

    /* JADX INFO: renamed from: i */
    private static final C34527OooO0oO f52962i;

    /* JADX INFO: renamed from: j */
    private static final C34527OooO0oO f52963j;

    /* JADX INFO: renamed from: k */
    private static final C34527OooO0oO f52964k;

    /* JADX INFO: renamed from: l */
    private static final C34527OooO0oO f52965l;

    /* JADX INFO: renamed from: m */
    private static final C34527OooO0oO f52966m;

    /* JADX INFO: renamed from: n */
    private static final Charset f52967n;

    /* JADX INFO: renamed from: o */
    private static final Charset f52968o;

    /* JADX INFO: renamed from: p */
    private static final Charset f52969p;

    /* JADX INFO: renamed from: q */
    private static final Charset f52970q;

    /* JADX INFO: renamed from: r */
    private static final Method f52971r;

    /* JADX INFO: renamed from: s */
    private static final Pattern f52972s;

    /* JADX INFO: renamed from: t */
    private static final Pattern f52973t;

    /* JADX INFO: renamed from: u */
    private static final Pattern f52974u;

    /* JADX INFO: renamed from: v */
    private static final Pattern f52975v;

    static {
        byte[] bArr = new byte[0];
        f52954a = bArr;
        Method declaredMethod = null;
        f52956c = AbstractC17801bk.m76311a(null, bArr);
        f52957d = AbstractC17799bi.create((C17794bd) null, bArr);
        C34527OooO0oO c34527OooO0oO = C34527OooO0oO.f123734OooOoO;
        f52962i = C34527OooO0oO.OooO00o.OooO00o("efbbbf");
        f52963j = C34527OooO0oO.OooO00o.OooO00o("feff");
        f52964k = C34527OooO0oO.OooO00o.OooO00o("fffe");
        f52965l = C34527OooO0oO.OooO00o.OooO00o("0000ffff");
        f52966m = C34527OooO0oO.OooO00o.OooO00o("ffff0000");
        f52958e = Charset.forName("UTF-8");
        f52959f = Charset.forName("ISO-8859-1");
        f52967n = Charset.forName("UTF-16BE");
        f52968o = Charset.forName("UTF-16LE");
        f52969p = Charset.forName("UTF-32BE");
        f52970q = Charset.forName("UTF-32LE");
        f52960g = TimeZone.getTimeZone("GMT");
        f52961h = new Comparator<String>() { // from class: com.huawei.hms.drive.bp.1
            @Override // java.util.Comparator
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public int compare(String str, String str2) {
                return str.compareTo(str2);
            }
        };
        try {
            declaredMethod = Throwable.class.getDeclaredMethod("addSuppressed", Throwable.class);
        } catch (Exception unused) {
        }
        f52971r = declaredMethod;
        f52972s = Pattern.compile("([0-9a-fA-F]*:[0-9a-fA-F:.]*)|([\\d.]+)");
        f52973t = Pattern.compile("^(25[0-5]|2[0-4]\\d|[0-1]?\\d?\\d)(\\.(25[0-5]|2[0-4]\\d|[0-1]?\\d?\\d)){3}$");
        f52974u = Pattern.compile("^(?:[0-9a-fA-F]{1,4}:){7}[0-9a-fA-F]{1,4}$");
        f52975v = Pattern.compile("^((?:[0-9A-Fa-f]{1,4}(?::[0-9A-Fa-f]{1,4})*)?)::((?:[0-9A-Fa-f]{1,4}(?::[0-9A-Fa-f]{1,4})*)?)$");
    }

    /* JADX INFO: renamed from: a */
    public static int m76321a(char c) {
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
    public static boolean m76351b(InterfaceC34548OooOoo0 interfaceC34548OooOoo0, int i, TimeUnit timeUnit) throws IOException {
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

    /* JADX INFO: renamed from: c */
    public static String m76352c(String str, int i, int i2) {
        int iM76322a = m76322a(str, i, i2);
        return str.substring(iM76322a, m76348b(str, iM76322a, i2));
    }

    /* JADX INFO: renamed from: d */
    private static boolean m76355d(String str) {
        for (int i = 0; i < str.length(); i++) {
            char cCharAt = str.charAt(i);
            if (cCharAt <= 31 || cCharAt >= 127 || " #%/:?@[\\]".indexOf(cCharAt) != -1) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: a */
    public static void m76339a(Throwable th, Throwable th2) {
        Method method = f52971r;
        if (method != null) {
            try {
                method.invoke(th, th2);
            } catch (IllegalAccessException | InvocationTargetException unused) {
            }
        }
    }

    /* JADX INFO: renamed from: a */
    public static void m76337a(long j, long j2, long j3) {
        if ((j2 | j3) < 0 || j2 > j || j - j2 < j3) {
            throw new ArrayIndexOutOfBoundsException();
        }
    }

    /* JADX INFO: renamed from: c */
    public static boolean m76353c(String str) {
        return f52972s.matcher(str).matches();
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
    /* JADX INFO: renamed from: d */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static InetAddress m76354d(String str, int i, int i2) {
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
                            if (!str.regionMatches(i, ".", 0, 1) || !m76343a(str, i6, i2, bArr, i4 - 2)) {
                                return null;
                            }
                            i4 += 2;
                        }
                    }
                    i6 = i;
                    int i82 = 0;
                    i = i6;
                    while (i < i2) {
                        int iM76321a = m76321a(str.charAt(i));
                        if (iM76321a == -1) {
                            break;
                        }
                        i82 = (i82 << 4) + iM76321a;
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
    public static boolean m76342a(Object obj, Object obj2) {
        if (obj != obj2) {
            return obj != null && obj.equals(obj2);
        }
        return true;
    }

    /* JADX INFO: renamed from: a */
    public static void m76338a(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (IncompatibleClassChangeError e) {
                if (closeable instanceof Socket) {
                    m76340a((Socket) closeable);
                    return;
                }
                throw e;
            } catch (RuntimeException e2) {
                throw e2;
            } catch (Exception unused) {
            }
        }
    }

    /* JADX INFO: renamed from: a */
    public static void m76340a(Socket socket) {
        if (socket != null) {
            try {
                socket.close();
            } catch (AssertionError e) {
                if (!m76341a(e)) {
                    throw e;
                }
            } catch (RuntimeException e2) {
                throw e2;
            } catch (Exception unused) {
            }
        }
    }

    /* JADX INFO: renamed from: a */
    public static boolean m76344a(InterfaceC34548OooOoo0 interfaceC34548OooOoo0, int i, TimeUnit timeUnit) {
        try {
            return m76351b(interfaceC34548OooOoo0, i, timeUnit);
        } catch (IOException unused) {
            return false;
        }
    }

    /* JADX INFO: renamed from: b */
    public static boolean m76350b(Comparator<String> comparator, String[] strArr, String[] strArr2) {
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
    public static <T> List<T> m76332a(List<T> list) {
        return Collections.unmodifiableList(new ArrayList(list));
    }

    /* JADX INFO: renamed from: a */
    public static <K, V> Map<K, V> m76334a(Map<K, V> map) {
        if (map.isEmpty()) {
            return Collections.EMPTY_MAP;
        }
        return Collections.unmodifiableMap(new LinkedHashMap(map));
    }

    /* JADX INFO: renamed from: b */
    public static int m76348b(String str, int i, int i2) {
        for (int i3 = i2 - 1; i3 >= i; i3--) {
            char cCharAt = str.charAt(i3);
            if (cCharAt != '\t' && cCharAt != '\n' && cCharAt != '\f' && cCharAt != '\r' && cCharAt != ' ') {
                return i3 + 1;
            }
        }
        return i;
    }

    /* JADX INFO: renamed from: a */
    public static <T> List<T> m76333a(T... tArr) {
        return Collections.unmodifiableList(Arrays.asList((Object[]) tArr.clone()));
    }

    /* JADX INFO: renamed from: b */
    public static int m76347b(String str) {
        int length = str.length();
        for (int i = 0; i < length; i++) {
            char cCharAt = str.charAt(i);
            if (cCharAt <= 31 || cCharAt >= 127) {
                return i;
            }
        }
        return -1;
    }

    /* JADX INFO: renamed from: a */
    public static ThreadFactory m76335a(final String str, final boolean z) {
        return new ThreadFactory() { // from class: com.huawei.hms.drive.bp.2
            @Override // java.util.concurrent.ThreadFactory
            public Thread newThread(Runnable runnable) {
                Thread thread = new Thread(runnable, str);
                thread.setDaemon(z);
                return thread;
            }
        };
    }

    /* JADX INFO: renamed from: a */
    public static String[] m76345a(Comparator<? super String> comparator, String[] strArr, String[] strArr2) {
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

    /* JADX INFO: renamed from: b */
    public static C17788ay m76349b(List<C17838cu> list) {
        C17788ay.a aVar = new C17788ay.a();
        for (C17838cu c17838cu : list) {
            AbstractC17804bn.f52952a.mo76228a(aVar, c17838cu.f53183g.OooOOO0(), c17838cu.f53184h.OooOOO0());
        }
        return aVar.m76081a();
    }

    /* JADX INFO: renamed from: a */
    public static String m76328a(C17792bb c17792bb, boolean z) {
        String strM76151f;
        if (c17792bb.m76151f().contains(C18241k5.f55433h)) {
            strM76151f = "[" + c17792bb.m76151f() + "]";
        } else {
            strM76151f = c17792bb.m76151f();
        }
        if (!z && c17792bb.m76152g() == C17792bb.m76131a(c17792bb.m76145b())) {
            return strM76151f;
        }
        StringBuilder sbOooO0OO = C22226Oooo0oo.OooO0OO(strM76151f, C18241k5.f55433h);
        sbOooO0OO.append(c17792bb.m76152g());
        return sbOooO0OO.toString();
    }

    /* JADX INFO: renamed from: a */
    public static boolean m76341a(AssertionError assertionError) {
        return (assertionError.getCause() == null || assertionError.getMessage() == null || !assertionError.getMessage().contains("getsockname failed")) ? false : true;
    }

    /* JADX INFO: renamed from: a */
    public static int m76326a(Comparator<String> comparator, String[] strArr, String str) {
        int length = strArr.length;
        for (int i = 0; i < length; i++) {
            if (comparator.compare(strArr[i], str) == 0) {
                return i;
            }
        }
        return -1;
    }

    /* JADX INFO: renamed from: a */
    public static String[] m76346a(String[] strArr, String str) {
        int length = strArr.length;
        String[] strArr2 = new String[length + 1];
        System.arraycopy(strArr, 0, strArr2, 0, strArr.length);
        strArr2[length] = str;
        return strArr2;
    }

    /* JADX INFO: renamed from: a */
    public static int m76322a(String str, int i, int i2) {
        while (i < i2) {
            char cCharAt = str.charAt(i);
            if (cCharAt != '\t' && cCharAt != '\n' && cCharAt != '\f' && cCharAt != '\r' && cCharAt != ' ') {
                return i;
            }
            i++;
        }
        return i2;
    }

    /* JADX INFO: renamed from: a */
    public static int m76324a(String str, int i, int i2, String str2) {
        while (i < i2) {
            if (str2.indexOf(str.charAt(i)) != -1) {
                return i;
            }
            i++;
        }
        return i2;
    }

    /* JADX INFO: renamed from: a */
    public static int m76323a(String str, int i, int i2, char c) {
        while (i < i2) {
            if (str.charAt(i) == c) {
                return i;
            }
            i++;
        }
        return i2;
    }

    /* JADX INFO: renamed from: a */
    public static String m76329a(String str) {
        InetAddress inetAddressM76354d;
        if (str.contains(C18241k5.f55433h)) {
            if (str.startsWith("[") && str.endsWith("]")) {
                inetAddressM76354d = m76354d(str, 1, str.length() - 1);
            } else {
                inetAddressM76354d = m76354d(str, 0, str.length());
            }
            if (inetAddressM76354d == null) {
                return null;
            }
            byte[] address = inetAddressM76354d.getAddress();
            if (address.length == 16) {
                return m76331a(address);
            }
            throw new AssertionError(C20593OooO0Oo.OooO0O0("Invalid IPv6 address: '", str, "'"));
        }
        try {
            String lowerCase = IDN.toASCII(str).toLowerCase(Locale.US);
            if (lowerCase.isEmpty()) {
                return null;
            }
            if (m76355d(lowerCase)) {
                return null;
            }
            return lowerCase;
        } catch (IllegalArgumentException unused) {
            return null;
        }
    }

    /* JADX INFO: renamed from: a */
    public static String m76330a(String str, Object... objArr) {
        return String.format(Locale.US, str, objArr);
    }

    /* JADX WARN: Type inference failed for: r5v1, types: [int, java.lang.String] */
    /* JADX WARN: Type inference failed for: r5v3, types: [int, java.lang.String] */
    /* JADX WARN: Type inference failed for: r5v5, types: [int, java.lang.String] */
    /* JADX INFO: renamed from: a */
    public static int m76325a(String str, long j, TimeUnit timeUnit) {
        if (j < 0) {
            throw new IllegalArgumentException((String) Bundle.getInt(str));
        }
        if (timeUnit != null) {
            long millis = timeUnit.toMillis(j);
            if (millis > 2147483647L) {
                throw new IllegalArgumentException((String) Bundle.getInt(str));
            }
            if (millis != 0 || j <= 0) {
                return (int) millis;
            }
            throw new IllegalArgumentException((String) Bundle.getInt(str));
        }
        throw new NullPointerException("unit == null");
    }

    /* JADX INFO: renamed from: a */
    public static AssertionError m76327a(String str, Exception exc) {
        AssertionError assertionError = new AssertionError(str);
        try {
            assertionError.initCause(exc);
        } catch (IllegalStateException unused) {
        }
        return assertionError;
    }

    /* JADX INFO: renamed from: a */
    private static boolean m76343a(String str, int i, int i2, byte[] bArr, int i3) {
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
    private static String m76331a(byte[] bArr) {
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
        C34524OooO0Oo c34524OooO0Oo = new C34524OooO0Oo();
        while (i2 < bArr.length) {
            if (i2 == i) {
                c34524OooO0Oo.o0OoO0o(58);
                i2 += i4;
                if (i2 == 16) {
                    c34524OooO0Oo.o0OoO0o(58);
                }
            } else {
                if (i2 > 0) {
                    c34524OooO0Oo.o0OoO0o(58);
                }
                c34524OooO0Oo.o000OOO(((bArr[i2] & 255) << 8) | (bArr[i2 + 1] & 255));
                i2 += 2;
            }
        }
        return c34524OooO0Oo.o00000OO();
    }

    /* JADX INFO: renamed from: a */
    public static X509TrustManager m76336a() {
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
            throw m76327a("No System TLS", (Exception) e);
        }
    }
}
