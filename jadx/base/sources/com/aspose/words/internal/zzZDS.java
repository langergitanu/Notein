package com.aspose.words.internal;

import OooO0o.C20424OooO0Oo;
import com.orion.notein.richeditor.utils.p606io.IOUtils;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.net.URLDecoder;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes5.dex */
public final class zzZDS {
    private static final Pattern zzWIP = Pattern.compile("^file:///\\p{Alpha}|.*$");

    public static InputStream zzW(URL url) throws IOException {
        String host;
        if (!"file".equals(url.getProtocol()) || ((host = url.getHost()) != null && host.length() != 0)) {
            return url.openStream();
        }
        String path = url.getPath();
        if (path.indexOf(37) >= 0) {
            path = URLDecoder.decode(path, "UTF-8");
        }
        return new FileInputStream(path);
    }

    public static URL zzXLc() throws IOException {
        return new File("a").getAbsoluteFile().getParentFile().toURI().toURL();
    }

    public static URL zzY(String str, URL url) throws IOException {
        if (url == null) {
            return zzwS(str);
        }
        try {
            str = zzwQ(str);
            return new URL(url, str);
        } catch (MalformedURLException e) {
            zzZ(e, str);
            return null;
        }
    }

    private static void zzZ(Exception exc, String str) throws IOException {
        StringBuilder sbOooO0o0 = C20424OooO0Oo.OooO0o0("[resolving systemId '", str, "']: ");
        sbOooO0o0.append(exc.toString());
        throw zzZE1.zzY(sbOooO0o0.toString(), exc);
    }

    private static String zzwQ(String str) {
        int iIndexOf = str.indexOf(124);
        if (iIndexOf <= 0 || !zzWIP.matcher(str).matches()) {
            return str;
        }
        StringBuilder sb = new StringBuilder(str);
        sb.setCharAt(iIndexOf, ':');
        return sb.toString();
    }

    public static URI zzwR(String str) throws IOException {
        try {
            if (str.indexOf(124, 0) > 0 && zzWIP.matcher(str).matches()) {
                return new URI(str.replace('|', ':'));
            }
            int iIndexOf = str.indexOf(58, 0);
            if (iIndexOf >= 3 && iIndexOf <= 8) {
                return new URI(str);
            }
            String absolutePath = new File(str).getAbsolutePath();
            char c = File.separatorChar;
            if (c != '/') {
                absolutePath = absolutePath.replace(c, IOUtils.DIR_SEPARATOR_UNIX);
            }
            if (absolutePath.length() > 0 && absolutePath.charAt(0) != '/') {
                absolutePath = "/".concat(absolutePath);
            }
            return new URI("file", absolutePath, null);
        } catch (URISyntaxException e) {
            zzZ(e, str);
            return null;
        }
    }

    public static URL zzwS(String str) throws IOException {
        try {
            String strZzwQ = zzwQ(str);
            int iIndexOf = strZzwQ.indexOf(58, 0);
            if (iIndexOf >= 3 && iIndexOf <= 8) {
                return new URL(strZzwQ);
            }
            String absolutePath = new File(strZzwQ).getAbsolutePath();
            char c = File.separatorChar;
            if (c != '/') {
                absolutePath = absolutePath.replace(c, IOUtils.DIR_SEPARATOR_UNIX);
            }
            if (absolutePath.length() > 0 && absolutePath.charAt(0) != '/') {
                absolutePath = "/".concat(absolutePath);
            }
            return new URL("file", "", absolutePath);
        } catch (MalformedURLException e) {
            zzZ(e, str);
            return null;
        }
    }

    public static URL zzW(File file) throws IOException {
        return file.toURI().toURL();
    }
}
