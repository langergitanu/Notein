package com.nimbusds.jose.util;

import Oooo0oO.o0Oo0oo;
import androidx.appcompat.widget.C21532OooOOo;
import java.io.File;
import java.io.IOException;
import java.io.StringReader;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.security.KeyStore;
import java.security.KeyStoreException;
import java.security.cert.CertificateException;
import java.security.cert.X509Certificate;
import java.text.ParseException;
import java.util.LinkedList;
import java.util.List;
import java.util.UUID;
import oO0oOo.C34140OooO0o0;
import oO0ooO.C34255OooO0Oo;

/* JADX INFO: loaded from: classes9.dex */
public class X509CertChainUtils {
    private X509CertChainUtils() {
    }

    public static List<X509Certificate> parse(List<Base64> list) throws ParseException {
        if (list == null) {
            return null;
        }
        LinkedList linkedList = new LinkedList();
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) != null) {
                X509Certificate x509Certificate = X509CertUtils.parse(list.get(i).decode());
                if (x509Certificate == null) {
                    throw new ParseException(C21532OooOOo.OooO0OO(i, "Invalid X.509 certificate at position "), 0);
                }
                linkedList.add(x509Certificate);
            }
        }
        return linkedList;
    }

    public static List<UUID> store(KeyStore keyStore, List<X509Certificate> list) throws KeyStoreException {
        LinkedList linkedList = new LinkedList();
        for (X509Certificate x509Certificate : list) {
            UUID uuidRandomUUID = UUID.randomUUID();
            keyStore.setCertificateEntry(uuidRandomUUID.toString(), x509Certificate);
            linkedList.add(uuidRandomUUID);
        }
        return linkedList;
    }

    public static List<Base64> toBase64List(List<Object> list) throws ParseException {
        if (list == null) {
            return null;
        }
        LinkedList linkedList = new LinkedList();
        for (int i = 0; i < list.size(); i++) {
            Object obj = list.get(i);
            if (obj == null) {
                throw new ParseException(o0Oo0oo.OooO0O0(i, "The X.509 certificate at position ", " must not be null"), 0);
            }
            if (!(obj instanceof String)) {
                throw new ParseException(o0Oo0oo.OooO0O0(i, "The X.509 certificate at position ", " must be encoded as a Base64 string"), 0);
            }
            linkedList.add(new Base64((String) obj));
        }
        return linkedList;
    }

    public static List<X509Certificate> parse(File file) throws IOException, CertificateException {
        return parse(new String(Files.readAllBytes(file.toPath()), StandardCharsets.UTF_8));
    }

    public static List<X509Certificate> parse(String str) throws IOException, CertificateException {
        Object object;
        C34255OooO0Oo c34255OooO0Oo = new C34255OooO0Oo(new StringReader(str));
        LinkedList linkedList = new LinkedList();
        do {
            object = c34255OooO0Oo.readObject();
            if (object instanceof C34140OooO0o0) {
                linkedList.add(X509CertUtils.parseWithException(((C34140OooO0o0) object).f122681OooOo0o.getEncoded()));
            }
        } while (object != null);
        return linkedList;
    }
}
