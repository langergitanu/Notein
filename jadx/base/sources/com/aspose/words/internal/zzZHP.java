package com.aspose.words.internal;

import com.microsoft.identity.common.adal.internal.AuthenticationConstants;
import com.orion.notein.richeditor.utils.p606io.FilenameUtils;
import com.orion.notein.richeditor.utils.p606io.IOUtils;
import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;

/* JADX INFO: loaded from: classes5.dex */
public class zzZHP {
    static final /* synthetic */ boolean zzVr = true;

    public static String zzPt(int i) {
        return zzg(Integer.toHexString(i), 2);
    }

    public static boolean zzTL(String str) {
        if (str == null) {
            return false;
        }
        return str.length() == 1 ? str.charAt(0) == '\n' : str.length() == 2 && str.charAt(0) == '\r' && str.charAt(1) == '\n';
    }

    public static boolean zzTM(String str) {
        if (str == null) {
            return false;
        }
        for (int i = 0; i < str.length(); i++) {
            if (!zzZKU.zzG(str.charAt(i))) {
                return false;
            }
        }
        return true;
    }

    public static boolean zzTN(String str) {
        boolean z;
        Integer numValueOf;
        boolean z2;
        String strZzci = zzci();
        int i = 0;
        int i2 = 0;
        while (i < str.length() && i2 < strZzci.length()) {
            int iIndexOf = str.indexOf(46, i);
            if (iIndexOf < 0 && (iIndexOf = str.indexOf(95, i)) < 0) {
                iIndexOf = str.length();
            }
            int iIndexOf2 = strZzci.indexOf(46, i2);
            if (iIndexOf2 < 0 && (iIndexOf2 = strZzci.indexOf(95, i2)) < 0) {
                iIndexOf2 = strZzci.length();
            }
            String strSubstring = str.substring(i, iIndexOf);
            int i3 = iIndexOf + 1;
            String strSubstring2 = strZzci.substring(i2, iIndexOf2);
            int i4 = iIndexOf2 + 1;
            Integer numValueOf2 = null;
            try {
                numValueOf = Integer.valueOf(Integer.parseInt(strSubstring2));
                z = true;
            } catch (NumberFormatException unused) {
                z = false;
                numValueOf = null;
            }
            try {
                numValueOf2 = Integer.valueOf(Integer.parseInt(strSubstring));
                z2 = true;
            } catch (NumberFormatException unused2) {
                z2 = false;
            }
            if (z && z2) {
                if (numValueOf.intValue() < numValueOf2.intValue()) {
                    return true;
                }
            } else if (strSubstring2.compareTo(strSubstring) < 0) {
                return true;
            }
            i2 = i4;
            i = i3;
        }
        return false;
    }

    public static boolean zzXk(String str) {
        return str != null && str.length() > 0;
    }

    public static String zzYH(int i, int i2) {
        if (zzVr || i2 > 0) {
            return zzg(Integer.toString(i), i2);
        }
        throw new AssertionError();
    }

    public static String zzci() {
        return System.getProperty("java.version").toUpperCase();
    }

    public static Class zzcj() {
        new zzZHP();
        return zzZHP.class;
    }

    private static String zzg(String str, int i) {
        int length = str.length();
        if (length == i) {
            return str;
        }
        if (length >= i) {
            return str.substring(length - i, length);
        }
        return zzZKN.zzS('0', i - length) + str;
    }

    private static String zzo(Class cls) {
        String str = "/" + zzZKN.zzZ(cls.getName(), FilenameUtils.EXTENSION_SEPARATOR, IOUtils.DIR_SEPARATOR_UNIX) + ".class";
        try {
            String strDecode = URLDecoder.decode(cls.getResource(str).toString(), "UTF8");
            return strDecode.substring(0, strDecode.length() - str.length());
        } catch (UnsupportedEncodingException e) {
            throw new RuntimeException(e);
        }
    }

    public static String zzp(Class cls) {
        if (zzsq()) {
            return "/sdcard/Aspose.Data/";
        }
        String strZzo = zzo(cls);
        int iIndexOf = strZzo.indexOf(47);
        if (zzss()) {
            iIndexOf++;
        }
        int length = strZzo.length();
        if (strZzo.startsWith("jar:") || strZzo.startsWith("wsjar:") || strZzo.startsWith("code-source:")) {
            length = strZzo.lastIndexOf(47);
        }
        return strZzo.substring(iIndexOf, length);
    }

    public static boolean zzsq() {
        return System.getProperty("java.runtime.name").startsWith(AuthenticationConstants.AAD.ADAL_ID_PLATFORM_VALUE);
    }

    public static boolean zzss() {
        return System.getProperty("os.name").toUpperCase().indexOf("WINDOWS") >= 0;
    }
}
