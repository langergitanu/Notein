package com.aspose.words.internal;

import OooOoo.C20593OooO0Oo;
import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: loaded from: classes5.dex */
final class zzYPD {
    private final String zzVUh;
    private final String zzVUi;
    private final String zzVUj;
    private final String zzVUk;

    public zzYPD(String str) {
        this.zzVUk = C20593OooO0Oo.OooO0O0("-----BEGIN ", str, "-----");
        this.zzVUj = C20593OooO0Oo.OooO0O0("-----BEGIN X509 ", str, "-----");
        this.zzVUi = C20593OooO0Oo.OooO0O0("-----END ", str, "-----");
        this.zzVUh = C20593OooO0Oo.OooO0O0("-----END X509 ", str, "-----");
    }

    private static String zzM(InputStream inputStream) throws IOException {
        int i;
        StringBuffer stringBuffer = new StringBuffer();
        while (true) {
            i = inputStream.read();
            if (i != 13 && i != 10 && i >= 0) {
                stringBuffer.append((char) i);
            } else if (i < 0 || stringBuffer.length() != 0) {
                break;
            }
        }
        if (i < 0) {
            return null;
        }
        if (i == 13) {
            inputStream.mark(1);
            int i2 = inputStream.read();
            if (i2 == 10) {
                inputStream.mark(1);
            }
            if (i2 > 0) {
                inputStream.reset();
            }
        }
        return stringBuffer.toString();
    }

    public final zzZD4 zzL(InputStream inputStream) throws IOException {
        String strZzM;
        StringBuffer stringBuffer = new StringBuffer();
        do {
            strZzM = zzM(inputStream);
            if (strZzM == null || strZzM.startsWith(this.zzVUk)) {
                break;
            }
        } while (!strZzM.startsWith(this.zzVUj));
        while (true) {
            String strZzM2 = zzM(inputStream);
            if (strZzM2 == null || strZzM2.startsWith(this.zzVUi) || strZzM2.startsWith(this.zzVUh)) {
                break;
            }
            stringBuffer.append(strZzM2);
        }
        if (stringBuffer.length() == 0) {
            return null;
        }
        try {
            return zzZD4.zzYy(zzYGH.decode(stringBuffer.toString()));
        } catch (Exception unused) {
            throw new IOException("malformed PEM data encountered");
        }
    }
}
