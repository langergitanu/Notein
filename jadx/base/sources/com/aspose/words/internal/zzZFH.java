package com.aspose.words.internal;

import OooOoo.C20593OooO0Oo;
import OoooooO.C21445Oooo;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.Reader;
import java.io.StringReader;
import java.net.URL;
import javax.xml.transform.Source;
import javax.xml.transform.stream.StreamSource;

/* JADX INFO: loaded from: classes5.dex */
public final class zzZFH {
    public static zzZF1 zzZ(zzZF1 zzzf1, URL url, String str, String str2, String str3, zzZQT zzzqt, zzZHC zzzhc, int i) throws IOException, zzZQS {
        Object objZzP;
        if (url == null && (url = zzzf1.zzXNH()) == null) {
            url = zzZDS.zzXLc();
        }
        if (zzzqt != null && (objZzP = zzzqt.zzP(str2, str3, url.toExternalForm())) != null) {
            return zzZ(zzzf1, zzzhc, str, i, objZzP);
        }
        if (str3 == null) {
            throw new zzZQS(C21445Oooo.OooO0O0(new StringBuilder("Can not resolve "), str == null ? "[External DTD subset]" : C20593OooO0Oo.OooO0O0("entity '", str, "'"), " without a system id (public id '", str2, "')"));
        }
        return zzZ(zzzf1, zzzhc, str, i, zzZDS.zzY(str3, url), str2);
    }

    public static zzZF1 zzZ(zzZF1 zzzf1, String str, zzZQT zzzqt, zzZHC zzzhc, int i) throws IOException, zzZQS {
        URL urlZzXNH = zzzf1 == null ? null : zzzf1.zzXNH();
        if (urlZzXNH == null) {
            urlZzXNH = zzZDS.zzXLc();
        }
        Object objZzP = zzzqt.zzP(null, null, urlZzXNH.toExternalForm());
        if (objZzP == null) {
            return null;
        }
        return zzZ(zzzf1, zzzhc, str, i, objZzP);
    }

    private static zzZF1 zzZ(zzZF1 zzzf1, zzZHC zzzhc, String str, int i, Object obj) throws IOException, IllegalArgumentException, zzZQS {
        if (obj instanceof Source) {
            if (obj instanceof StreamSource) {
                return zzZ(zzzf1, zzzhc, str, i, (StreamSource) obj);
            }
            throw new IllegalArgumentException("Can not use other Source objects than StreamSource: got " + obj.getClass());
        }
        if (obj instanceof URL) {
            return zzZ(zzzf1, zzzhc, str, i, (URL) obj, (String) null);
        }
        if (obj instanceof InputStream) {
            return zzZ(zzzf1, zzzhc, str, i, (InputStream) obj);
        }
        if (obj instanceof Reader) {
            return zzZ(zzzf1, zzzhc, str, i, (Reader) obj, (String) null);
        }
        if (obj instanceof String) {
            return zzZ(zzzf1, zzzhc, str, i, (String) obj);
        }
        if (obj instanceof File) {
            return zzZ(zzzf1, zzzhc, str, i, zzZDS.zzW((File) obj), (String) null);
        }
        throw new IllegalArgumentException("Unrecognized input argument type for sourceFrom(): " + obj.getClass());
    }

    private static zzZF1 zzZ(zzZF1 zzzf1, zzZHC zzzhc, String str, int i, StreamSource streamSource) throws IOException, zzZQS {
        zzZFE zzzfeZzZ;
        Reader reader = streamSource.getReader();
        String publicId = streamSource.getPublicId();
        String systemId = streamSource.getSystemId();
        URL urlZzXNH = zzzf1 == null ? null : zzzf1.zzXNH();
        URL urlZzY = (systemId == null || systemId.length() == 0) ? null : zzZDS.zzY(systemId, urlZzXNH);
        if (urlZzY != null) {
            urlZzXNH = urlZzY;
        }
        zzZF7 zzzf7ZzZ = zzZF7.zzZ(systemId, urlZzXNH);
        if (reader == null) {
            InputStream inputStream = streamSource.getInputStream();
            if (inputStream == null) {
                if (urlZzY != null) {
                    inputStream = zzZDS.zzW(urlZzY);
                } else {
                    throw new IllegalArgumentException("Can not create Stax reader for a StreamSource -- neither reader, input stream nor system id was set.");
                }
            }
            zzzfeZzZ = zzZF8.zzZ(publicId, zzzf7ZzZ, inputStream);
        } else {
            zzzfeZzZ = zzZFA.zzZ(publicId, zzzf7ZzZ, reader, null);
        }
        zzZFE zzzfe = zzzfeZzZ;
        return zzZFD.zzZ(zzzhc, zzzf1, str, zzzfe, publicId, zzzf7ZzZ, zzzfe.zzZ(zzzhc, false, i));
    }

    private static zzZF1 zzZ(zzZF1 zzzf1, zzZHC zzzhc, String str, int i, URL url, String str2) throws IOException, zzZQS {
        InputStream inputStreamZzW = zzZDS.zzW(url);
        zzZF7 zzzf7ZzX = zzZF7.zzX(url);
        zzZF8 zzzf8ZzZ = zzZF8.zzZ(str2, zzzf7ZzX, inputStreamZzW);
        return zzZFD.zzZ(zzzhc, zzzf1, str, zzzf8ZzZ, str2, zzzf7ZzX, zzzf8ZzZ.zzZ(zzzhc, false, i));
    }

    private static zzZF1 zzZ(zzZF1 zzzf1, zzZHC zzzhc, String str, int i, String str2) throws IOException, zzZQS {
        return zzZ(zzzf1, zzzhc, str, i, new StringReader(str2), str);
    }

    private static zzZF1 zzZ(zzZF1 zzzf1, zzZHC zzzhc, String str, int i, InputStream inputStream) throws IOException, zzZQS {
        zzZF8 zzzf8ZzZ = zzZF8.zzZ((String) null, zzZF7.zzxN(null), inputStream);
        return zzZFD.zzZ(zzzhc, zzzf1, str, zzzf8ZzZ, null, zzZF7.zzZ(null, zzzf1.zzXNH()), zzzf8ZzZ.zzZ(zzzhc, false, i));
    }

    private static zzZF1 zzZ(zzZF1 zzzf1, zzZHC zzzhc, String str, int i, Reader reader, String str2) throws IOException, zzZQS {
        zzZFA zzzfaZzZ = zzZFA.zzZ(null, zzZF7.zzxN(str2), reader, null);
        Reader readerZzZ = zzzfaZzZ.zzZ(zzzhc, false, i);
        URL urlZzXNH = zzzf1 != null ? zzzf1.zzXNH() : null;
        if (str2 != null && str2.length() > 0) {
            urlZzXNH = zzZDS.zzY(str2, urlZzXNH);
        }
        return zzZFD.zzZ(zzzhc, zzzf1, str, zzzfaZzZ, null, zzZF7.zzZ(str2, urlZzXNH), readerZzZ);
    }
}
