package okhttp3.internal.tls;

import OooO0O0.OooO0o;
import Oooo0oO.o0Oo0oo;
import com.huawei.hms.network.embedded.C18187g7;
import com.huawei.hms.network.embedded.C18358t1;
import com.orion.notein.richeditor.utils.p606io.FilenameUtils;
import java.security.cert.Certificate;
import java.security.cert.CertificateParsingException;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLException;
import javax.net.ssl.SSLSession;
import kotlin.Metadata;
import kotlin.jvm.internal.OooOOO0;
import oO0o0O0o.C33595OooOOo;
import oO0o0O0o.C33599OooOo0O;
import oOo000Oo.C34434OooOoO;
import okhttp3.internal.HostnamesKt;
import okhttp3.internal.Util;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(m80611d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m80612d2 = {"Lokhttp3/internal/tls/OkHostnameVerifier;", "Ljavax/net/ssl/HostnameVerifier;", "<init>", "()V", "okhttp"}, m80613k = 1, m80614mv = {1, 6, 0}, m80616xi = 48)
public final class OkHostnameVerifier implements HostnameVerifier {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public static final OkHostnameVerifier f124724OooO00o = new OkHostnameVerifier();

    private OkHostnameVerifier() {
    }

    public static List OooO00o(X509Certificate x509Certificate, int i) {
        Object obj;
        C34434OooOoO c34434OooOoO = C34434OooOoO.f123453OooOo0o;
        try {
            Collection<List<?>> subjectAlternativeNames = x509Certificate.getSubjectAlternativeNames();
            if (subjectAlternativeNames != null) {
                ArrayList arrayList = new ArrayList();
                for (List<?> list : subjectAlternativeNames) {
                    if (list != null && list.size() >= 2 && OooOOO0.OooO0O0(list.get(0), Integer.valueOf(i)) && (obj = list.get(1)) != null) {
                        arrayList.add((String) obj);
                    }
                }
                return arrayList;
            }
        } catch (CertificateParsingException unused) {
        }
        return c34434OooOoO;
    }

    public static boolean OooO0O0(String str) {
        int i;
        int length = str.length();
        int length2 = str.length();
        if (length2 < 0) {
            throw new IllegalArgumentException(o0Oo0oo.OooO0O0(length2, "endIndex < beginIndex: ", " < 0").toString());
        }
        if (length2 > str.length()) {
            StringBuilder sbOooO0OO = OooO0o.OooO0OO(length2, "endIndex > string.length: ", " > ");
            sbOooO0OO.append(str.length());
            throw new IllegalArgumentException(sbOooO0OO.toString().toString());
        }
        long j = 0;
        int i2 = 0;
        while (i2 < length2) {
            char cCharAt = str.charAt(i2);
            if (cCharAt < 128) {
                j++;
            } else {
                if (cCharAt < 2048) {
                    i = 2;
                } else if (cCharAt < 55296 || cCharAt > 57343) {
                    i = 3;
                } else {
                    int i3 = i2 + 1;
                    char cCharAt2 = i3 < length2 ? str.charAt(i3) : (char) 0;
                    if (cCharAt > 56319 || cCharAt2 < 56320 || cCharAt2 > 57343) {
                        j++;
                        i2 = i3;
                    } else {
                        j += (long) 4;
                        i2 += 2;
                    }
                }
                j += (long) i;
            }
            i2++;
        }
        return length == ((int) j);
    }

    /* JADX WARN: Removed duplicated region for block: B:63:0x010f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static boolean OooO0OO(String host, X509Certificate certificate) {
        boolean zOooO0O0;
        int length;
        OooOOO0.OooO0oO(host, "host");
        OooOOO0.OooO0oO(certificate, "certificate");
        byte[] bArr = Util.f124301OooO00o;
        if (Util.f124307OooO0oO.OooO0O0(host)) {
            String strOooO0O0 = HostnamesKt.OooO0O0(host);
            List listOooO00o = OooO00o(certificate, 7);
            if (!(listOooO00o instanceof Collection) || !listOooO00o.isEmpty()) {
                Iterator it = listOooO00o.iterator();
                while (it.hasNext()) {
                    if (OooOOO0.OooO0O0(strOooO0O0, HostnamesKt.OooO0O0((String) it.next()))) {
                        return true;
                    }
                }
            }
            return false;
        }
        if (OooO0O0(host)) {
            Locale US = Locale.US;
            OooOOO0.OooO0o(US, "US");
            host = host.toLowerCase(US);
            OooOOO0.OooO0o(host, "this as java.lang.String).toLowerCase(locale)");
        }
        List<String> listOooO00o2 = OooO00o(certificate, 2);
        if (!(listOooO00o2 instanceof Collection) || !listOooO00o2.isEmpty()) {
            for (String lowerCase : listOooO00o2) {
                f124724OooO00o.getClass();
                if (host.length() != 0 && !C33595OooOOo.OooOoO0(host, ".", false) && !C33595OooOOo.OooOOo0(host, "..", false) && lowerCase != null && lowerCase.length() != 0 && !C33595OooOOo.OooOoO0(lowerCase, ".", false) && !C33595OooOOo.OooOOo0(lowerCase, "..", false)) {
                    String strOooOOO0 = !C33595OooOOo.OooOOo0(host, ".", false) ? OooOOO0.OooOOO0(".", host) : host;
                    if (!C33595OooOOo.OooOOo0(lowerCase, ".", false)) {
                        lowerCase = OooOOO0.OooOOO0(".", lowerCase);
                    }
                    if (OooO0O0(lowerCase)) {
                        Locale US2 = Locale.US;
                        OooOOO0.OooO0o(US2, "US");
                        lowerCase = lowerCase.toLowerCase(US2);
                        OooOOO0.OooO0o(lowerCase, "this as java.lang.String).toLowerCase(locale)");
                    }
                    if (!C33599OooOo0O.OooOoOO(lowerCase, C18358t1.g.f56183c, false)) {
                        zOooO0O0 = OooOOO0.OooO0O0(strOooOOO0, lowerCase);
                    } else if (!C33595OooOOo.OooOoO0(lowerCase, C18187g7.b.f54919e, false) || C33599OooOo0O.Oooo0(lowerCase, '*', 1, 4) != -1 || strOooOOO0.length() < lowerCase.length() || C18187g7.b.f54919e.equals(lowerCase)) {
                        zOooO0O0 = false;
                    } else {
                        String strSubstring = lowerCase.substring(1);
                        OooOOO0.OooO0o(strSubstring, "this as java.lang.String).substring(startIndex)");
                        if (C33595OooOOo.OooOOo0(strOooOOO0, strSubstring, false) && ((length = strOooOOO0.length() - strSubstring.length()) <= 0 || C33599OooOo0O.Oooo0oO(strOooOOO0, FilenameUtils.EXTENSION_SEPARATOR, length - 1, 4) == -1)) {
                            zOooO0O0 = true;
                        }
                    }
                    if (zOooO0O0) {
                    }
                }
                return true;
            }
        }
        return false;
    }

    @Override // javax.net.ssl.HostnameVerifier
    public final boolean verify(String host, SSLSession session) {
        OooOOO0.OooO0oO(host, "host");
        OooOOO0.OooO0oO(session, "session");
        if (OooO0O0(host)) {
            try {
                Certificate certificate = session.getPeerCertificates()[0];
                if (certificate != null) {
                    return OooO0OO(host, (X509Certificate) certificate);
                }
                throw new NullPointerException("null cannot be cast to non-null type java.security.cert.X509Certificate");
            } catch (SSLException unused) {
            }
        }
        return false;
    }
}
