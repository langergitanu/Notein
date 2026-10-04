package com.huawei.hms.network.embedded;

import com.huawei.hms.network.embedded.C18187g7;
import com.huawei.hms.network.embedded.C18358t1;
import java.security.cert.CertificateParsingException;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLException;
import javax.net.ssl.SSLSession;

/* JADX INFO: renamed from: com.huawei.hms.network.embedded.cb */
/* JADX INFO: loaded from: classes9.dex */
public final class C18135cb implements HostnameVerifier {

    /* JADX INFO: renamed from: a */
    public static final C18135cb f54499a = new C18135cb();

    /* JADX INFO: renamed from: b */
    public static final int f54500b = 2;

    /* JADX INFO: renamed from: c */
    public static final int f54501c = 7;

    /* JADX INFO: renamed from: a */
    public static List<String> m78146a(X509Certificate x509Certificate) {
        List<String> listM78147a = m78147a(x509Certificate, 7);
        List<String> listM78147a2 = m78147a(x509Certificate, 2);
        ArrayList arrayList = new ArrayList(listM78147a2.size() + listM78147a.size());
        arrayList.addAll(listM78147a);
        arrayList.addAll(listM78147a2);
        return arrayList;
    }

    /* JADX INFO: renamed from: b */
    private boolean m78148b(String str, X509Certificate x509Certificate) {
        String lowerCase = str.toLowerCase(Locale.US);
        Iterator<String> it = m78147a(x509Certificate, 2).iterator();
        while (it.hasNext()) {
            if (m78150a(lowerCase, it.next())) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: c */
    private boolean m78149c(String str, X509Certificate x509Certificate) {
        List<String> listM78147a = m78147a(x509Certificate, 7);
        int size = listM78147a.size();
        for (int i = 0; i < size; i++) {
            if (str.equalsIgnoreCase(listM78147a.get(i))) {
                return true;
            }
        }
        return false;
    }

    @Override // javax.net.ssl.HostnameVerifier
    public boolean verify(String str, SSLSession sSLSession) {
        try {
            return m78151a(str, (X509Certificate) sSLSession.getPeerCertificates()[0]);
        } catch (SSLException unused) {
            return false;
        }
    }

    /* JADX INFO: renamed from: a */
    public static List<String> m78147a(X509Certificate x509Certificate, int i) {
        Integer num;
        String str;
        ArrayList arrayList = new ArrayList();
        try {
            Collection<List<?>> subjectAlternativeNames = x509Certificate.getSubjectAlternativeNames();
            if (subjectAlternativeNames == null) {
                return Collections.EMPTY_LIST;
            }
            for (List<?> list : subjectAlternativeNames) {
                if (list != null && list.size() >= 2 && (num = (Integer) list.get(0)) != null && num.intValue() == i && (str = (String) list.get(1)) != null) {
                    arrayList.add(str);
                }
            }
            return arrayList;
        } catch (CertificateParsingException unused) {
            return Collections.EMPTY_LIST;
        }
    }

    /* JADX INFO: renamed from: a */
    public boolean m78150a(String str, String str2) {
        if (str != null && str.length() != 0 && !str.startsWith(".") && !str.endsWith("..") && str2 != null && str2.length() != 0 && !str2.startsWith(".") && !str2.endsWith("..")) {
            if (!str.endsWith(".")) {
                str = str.concat(".");
            }
            if (!str2.endsWith(".")) {
                str2 = str2.concat(".");
            }
            String lowerCase = str2.toLowerCase(Locale.US);
            if (!lowerCase.contains(C18358t1.g.f56183c)) {
                return str.equals(lowerCase);
            }
            if (!lowerCase.startsWith(C18187g7.b.f54919e) || lowerCase.indexOf(42, 1) != -1 || str.length() < lowerCase.length() || C18187g7.b.f54919e.equals(lowerCase)) {
                return false;
            }
            String strSubstring = lowerCase.substring(1);
            if (!str.endsWith(strSubstring)) {
                return false;
            }
            int length = str.length() - strSubstring.length();
            return length <= 0 || str.lastIndexOf(46, length - 1) == -1;
        }
        return false;
    }

    /* JADX INFO: renamed from: a */
    public boolean m78151a(String str, X509Certificate x509Certificate) {
        return C18313p8.m79396d(str) ? m78149c(str, x509Certificate) : m78148b(str, x509Certificate);
    }
}
