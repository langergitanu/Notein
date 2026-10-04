package com.huawei.hms.drive;

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

/* JADX INFO: renamed from: com.huawei.hms.drive.dt */
/* JADX INFO: loaded from: classes6.dex */
public final class C17864dt implements HostnameVerifier {

    /* JADX INFO: renamed from: a */
    public static final C17864dt f53397a = new C17864dt();

    private C17864dt() {
    }

    /* JADX INFO: renamed from: b */
    private boolean m76768b(String str, X509Certificate x509Certificate) {
        List<String> listM76767a = m76767a(x509Certificate, 7);
        int size = listM76767a.size();
        for (int i = 0; i < size; i++) {
            if (str.equalsIgnoreCase(listM76767a.get(i))) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: c */
    private boolean m76769c(String str, X509Certificate x509Certificate) {
        String lowerCase = str.toLowerCase(Locale.US);
        Iterator<String> it = m76767a(x509Certificate, 2).iterator();
        while (it.hasNext()) {
            if (m76770a(lowerCase, it.next())) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: a */
    public boolean m76771a(String str, X509Certificate x509Certificate) {
        return C17806bp.m76353c(str) ? m76768b(str, x509Certificate) : m76769c(str, x509Certificate);
    }

    @Override // javax.net.ssl.HostnameVerifier
    public boolean verify(String str, SSLSession sSLSession) {
        try {
            return m76771a(str, (X509Certificate) sSLSession.getPeerCertificates()[0]);
        } catch (SSLException unused) {
            return false;
        }
    }

    /* JADX INFO: renamed from: a */
    public static List<String> m76766a(X509Certificate x509Certificate) {
        List<String> listM76767a = m76767a(x509Certificate, 7);
        List<String> listM76767a2 = m76767a(x509Certificate, 2);
        ArrayList arrayList = new ArrayList(listM76767a2.size() + listM76767a.size());
        arrayList.addAll(listM76767a);
        arrayList.addAll(listM76767a2);
        return arrayList;
    }

    /* JADX INFO: renamed from: a */
    private static List<String> m76767a(X509Certificate x509Certificate, int i) {
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
    public boolean m76770a(String str, String str2) {
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
}
