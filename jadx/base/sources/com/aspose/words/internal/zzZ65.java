package com.aspose.words.internal;

import java.io.IOException;
import java.io.OutputStream;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes5.dex */
public final class zzZ65 {
    private final zzZ86 zzWFU;
    private zzZ6T zzWmd;
    private byte[] zzWme;
    private final zzZ6I zzWmf;
    private final zzYHF zzWmg;
    private final zzYHL zzWmh;
    private final zzZ6N zzWmi;
    private final zzZ6N zzWmj;
    private final zzZAH zzWmk;

    public zzZ65(zzZAH zzzah, zzYHL zzyhl, zzZ86 zzz86, zzZ6I zzz6i) {
        this.zzWme = null;
        this.zzWmk = zzzah;
        this.zzWmh = zzyhl;
        this.zzWFU = zzz86;
        this.zzWmg = null;
        this.zzWmj = null;
        this.zzWmi = null;
        this.zzWmf = zzz6i;
    }

    private static zzZD2 zzZ(zzZAU zzzau) {
        if (zzzau != null) {
            return new zzZC0(zzzau.zzXJZ());
        }
        return null;
    }

    public final zzZAG zzP(zzZDA zzzda) throws zzZ6M {
        zzZ86 zzz86;
        zzZD2 zzzd2;
        try {
            zzZ86 zzz86ZzZ = this.zzWmf.zzZ(this.zzWmh.zzXyu());
            zzZD2 zzzd2ZzZ = null;
            if (this.zzWmj != null) {
                zzz86 = this.zzWmg.zzXyu();
                this.zzWme = this.zzWmg.zzXI5();
                zzZD2 zzzd2ZzZ2 = zzZ(this.zzWmj.zzS(Collections.unmodifiableMap(zzZ(zzzda, this.zzWmg.zzXyu(), zzz86ZzZ, this.zzWme))));
                OutputStream outputStream = this.zzWmh.getOutputStream();
                outputStream.write(zzzd2ZzZ2.getEncoded("DER"));
                outputStream.close();
                zzzd2 = zzzd2ZzZ2;
            } else {
                zzz86 = this.zzWFU;
                zzYHF zzyhf = this.zzWmg;
                if (zzyhf != null) {
                    this.zzWme = zzyhf.zzXI5();
                } else {
                    this.zzWme = null;
                }
                zzzd2 = null;
            }
            byte[] signature = this.zzWmh.getSignature();
            if (this.zzWmi != null) {
                Map mapZzZ = zzZ(zzzda, zzz86, zzz86ZzZ, this.zzWme);
                mapZzZ.put("encryptedDigest", zzYGU.zzVI(signature));
                zzzd2ZzZ = zzZ(this.zzWmi.zzS(Collections.unmodifiableMap(mapZzZ)));
            }
            zzZD2 zzzd22 = zzzd2ZzZ;
            if (this.zzWmj == null && zzZ69.zzWDS.equals(zzz86ZzZ.zzXJk())) {
                zzz86 = new zzZ86(zzZ9O.zzWAA);
            }
            return new zzZAG(this.zzWmk, zzz86, zzzd2, zzz86ZzZ, new zzZC6(signature), zzzd22);
        } catch (IOException e) {
            throw new zzZ6M("encoding error.", e);
        }
    }

    public final void zzW(zzZ6T zzz6t) {
        this.zzWmd = zzz6t;
    }

    public final byte[] zzXHg() {
        byte[] bArr = this.zzWme;
        if (bArr != null) {
            return zzYGU.zzVI(bArr);
        }
        return null;
    }

    public final OutputStream zzXHh() {
        zzYHF zzyhf = this.zzWmg;
        return zzyhf != null ? this.zzWmj == null ? new zzYG8(this.zzWmg.getOutputStream(), this.zzWmh.getOutputStream()) : zzyhf.getOutputStream() : this.zzWmh.getOutputStream();
    }

    private static Map zzZ(zzZDA zzzda, zzZ86 zzz86, zzZ86 zzz862, byte[] bArr) {
        HashMap map = new HashMap();
        if (zzzda != null) {
            map.put("contentType", zzzda);
        }
        map.put("digestAlgID", zzz86);
        map.put("signatureAlgID", zzz862);
        map.put("digest", zzYGU.zzVI(bArr));
        return map;
    }

    public zzZ65(zzZAH zzzah, zzYHL zzyhl, zzYHF zzyhf, zzZ6I zzz6i, zzZ6N zzz6n, zzZ6N zzz6n2) {
        this.zzWme = null;
        this.zzWmk = zzzah;
        this.zzWmh = zzyhl;
        this.zzWFU = zzyhf.zzXyu();
        this.zzWmg = zzyhf;
        this.zzWmj = zzz6n;
        this.zzWmi = zzz6n2;
        this.zzWmf = zzz6i;
    }
}
