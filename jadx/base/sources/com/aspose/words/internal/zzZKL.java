package com.aspose.words.internal;

import OooOoo.C20593OooO0Oo;
import com.huawei.hms.network.embedded.C18241k5;
import com.microsoft.identity.common.java.AuthenticationConstants;
import com.orion.notein.richeditor.utils.p606io.IOUtils;
import java.io.File;
import java.io.UnsupportedEncodingException;
import java.net.MalformedURLException;
import java.net.URISyntaxException;
import java.net.URL;
import java.net.URLDecoder;

/* JADX INFO: loaded from: classes5.dex */
public final class zzZKL {
    private zzZK9 zzZPg;

    public zzZKL(String str) throws URISyntaxException {
        zzTW(str);
    }

    private boolean isFile() {
        return "file".equals(this.zzZPg.getScheme());
    }

    private static boolean zzTT(String str) {
        return str.length() > 2 && Character.isLetter(str.charAt(0)) && (str.charAt(1) == ':' || str.charAt(1) == '|') && zzj(str, 2);
    }

    public static String zzTU(String str) throws URISyntaxException {
        return new zzZKL(str).zzZPg.toASCIIString();
    }

    private static String zzTV(String str) {
        int length = str.length();
        StringBuilder sb = new StringBuilder(length + 2);
        int i = 0;
        int i2 = 0;
        while (i2 < length && Character.isWhitespace(str.charAt(i2))) {
            i2++;
        }
        while (true) {
            if (i2 >= length) {
                break;
            }
            int i3 = i2 + 1;
            char cCharAt = str.charAt(i2);
            if (cCharAt == ':') {
                i2 = i3;
                break;
            }
            sb.append(cCharAt);
            i2 = i3;
        }
        if (i2 == length) {
            return sb.toString();
        }
        String string = sb.toString();
        while (i2 < length && zzj(str, i2)) {
            i2++;
            i++;
        }
        if ("notes".equals(string)) {
            return str;
        }
        if ("file".equals(string)) {
            if (zzk(str, i2) || i == 3) {
                sb.append(":///");
            } else {
                sb.append("://");
            }
        } else if ("http".equals(string) || AuthenticationConstants.HTTPS_PROTOCOL_STRING.equals(string) || "ftp".equals(string)) {
            sb.append("://");
        } else if (i == 0) {
            sb.append(C18241k5.f55433h);
        } else if (i != 1) {
            sb.append("://");
        } else {
            sb.append(":/");
        }
        sb.append((CharSequence) str, i2, length);
        return sb.toString();
    }

    private void zzTW(String str) throws URISyntaxException {
        String strReplace = str.replace(IOUtils.DIR_SEPARATOR_WINDOWS, IOUtils.DIR_SEPARATOR_UNIX);
        if (!zzWA(strReplace)) {
            if (zzTT(strReplace)) {
                this.zzZPg = new zzZK9("file", "", com.alibaba.sdk.android.oss.internal.OooO00o.OooO00o("/", strReplace));
                return;
            }
            zzZK9 zzzk9 = new zzZK9(zzTV(strReplace).replace(" ", "%20"));
            this.zzZPg = zzzk9;
            this.zzZPg = zzzk9.zzeY();
            return;
        }
        int i = 0;
        while (i < strReplace.length() && zzj(strReplace, i)) {
            i++;
        }
        int i2 = i;
        while (i2 < strReplace.length() && !zzj(strReplace, i2)) {
            i2++;
        }
        this.zzZPg = new zzZK9("file", strReplace.substring(i, i2), strReplace.substring(i2));
    }

    private static boolean zzWA(String str) {
        return str.length() > 1 ? zzj(str, 0) && zzj(str, 1) && !str.contains(C18241k5.f55433h) : zzj(str, 0) && !str.contains(C18241k5.f55433h);
    }

    public static boolean zzZH(String str, String str2) {
        File file = new File(str2);
        if ("/".equals(file.getParent()) || str == null) {
            return false;
        }
        return file.getParentFile() != null && new File(str).getName().equals(file.getParentFile().getName());
    }

    private static boolean zzj(String str, int i) {
        return str.charAt(i) == '\\' || str.charAt(i) == '/';
    }

    private static boolean zzk(String str, int i) {
        if (str.length() - i <= 2 || !Character.isLetter(str.charAt(i))) {
            return false;
        }
        int i2 = i + 1;
        return (str.charAt(i2) == ':' || str.charAt(i2) == '|') && zzj(str, i + 2);
    }

    public final String getHost() {
        return this.zzZPg.getHost();
    }

    public final String getScheme() {
        return this.zzZPg.getScheme();
    }

    public final String toString() {
        String string = this.zzZPg.toString();
        return string != null ? string.replaceAll("%20", " ") : string;
    }

    public final URL zzf2() throws MalformedURLException {
        return this.zzZPg.toURL();
    }

    public final String zzf3() {
        return this.zzZPg.toASCIIString();
    }

    public final boolean zzf4() {
        return this.zzZPg.isAbsolute();
    }

    public final String zzf5() throws UnsupportedEncodingException {
        String strDecode = URLDecoder.decode(this.zzZPg.getPath(), "UTF8");
        if (strDecode.charAt(0) == '/' && zzk(strDecode, 1)) {
            return strDecode.substring(1);
        }
        String host = this.zzZPg.getHost();
        return (zzZHP.zzXk(host) && isFile() && zzZHP.zzss()) ? C20593OooO0Oo.OooO0O0("//", host, strDecode) : strDecode;
    }

    public zzZKL(String str, byte b) throws URISyntaxException {
        String strTrim = str.trim();
        if (!zzZKN.zzU3(strTrim)) {
            zzTW(strTrim);
            return;
        }
        throw new URISyntaxException("Empty UriString", strTrim);
    }
}
