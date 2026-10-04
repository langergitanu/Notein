package com.aspose.words.internal;

import com.aspose.words.ControlChar;
import com.huawei.hms.network.embedded.C18115b5;
import com.huawei.hms.network.embedded.C18241k5;
import com.microsoft.identity.common.java.cache.CacheKeyValueDelegate;
import com.orion.notein.richeditor.utils.p606io.FilenameUtils;
import com.orion.notein.richeditor.utils.p606io.IOUtils;
import java.io.Serializable;
import java.net.MalformedURLException;
import java.net.URISyntaxException;
import java.net.URL;
import java.nio.ByteBuffer;
import java.nio.CharBuffer;
import java.nio.charset.CharacterCodingException;
import java.nio.charset.CharsetDecoder;
import java.nio.charset.CoderResult;
import java.nio.charset.CodingErrorAction;
import java.text.Normalizer;

/* JADX INFO: loaded from: classes5.dex */
public final class zzZK9 implements Serializable, Comparable<zzZK9> {
    static final /* synthetic */ boolean zzVr = true;
    private static final long zzZOA;
    private static final long zzZOB;
    private static final long zzZOC;
    private static final long zzZOD;
    private static final long zzZOE;
    private static final long zzZOF;
    private static final long zzZOG;
    private static final long zzZOH;
    private static final long zzZOI;
    private static final long zzZOJ;
    private static final long zzZOK;
    private static final long zzZOL;
    private static final long zzZOM;
    private static final long zzZON;
    private static final long zzZOO;
    private static final long zzZOP;
    private static final long zzZOQ;
    private static final long zzZOR;
    private static final long zzZOS;
    private static final char[] zzZOe;
    private static final long zzZOf;
    private static final long zzZOg;
    private static final long zzZOh;
    private static final long zzZOi;
    private static final long zzZOj;
    private static final long zzZOk;
    private static final long zzZOl;
    private static final long zzZOm;
    private static final long zzZOn;
    private static final long zzZOo;
    private static final long zzZOp;
    private static final long zzZOq;
    private static final long zzZOr;
    private static final long zzZOs;
    private static final long zzZOt;
    private static final long zzZOu;
    private static final long zzZOv;
    private static final long zzZOw;
    private static final long zzZOx;
    private static final long zzZOy;
    private static final long zzZOz;
    private transient String authority;
    private transient String fragment;
    private transient int port;
    private volatile String string;
    private volatile transient String zzZOT;
    private volatile transient String zzZOU;
    private volatile transient String zzZOV;
    private volatile transient String zzZOW;
    private volatile transient String zzZOX;
    private volatile transient String zzZOY;
    private volatile transient String zzZOZ;
    private transient String zzZP0;
    private transient String zzZP1;
    private transient String zzZP2;
    private transient String zzZP3;
    private transient String zzZP4;
    private volatile transient int zzZV4;

    public class zzZ {
        private String zzZOd;
        private boolean zzZOc = false;
        private int zzZOb = 0;

        public zzZ(String str) {
            this.zzZOd = str;
            zzZK9.this.string = str;
        }

        private char charAt(int i) {
            return this.zzZOd.charAt(i);
        }

        private String substring(int i, int i2) {
            return this.zzZOd.substring(i, i2);
        }

        private void zzTQ(String str) throws URISyntaxException {
            throw new URISyntaxException(this.zzZOd, str);
        }

        private void zzV(long j, String str) throws URISyntaxException {
            zzZ(0, 1, 0L, j, str);
        }

        /* JADX WARN: Removed duplicated region for block: B:23:0x004a A[PHI: r0
          0x004a: PHI (r0v2 int) = (r0v1 int), (r0v3 int), (r0v4 int) binds: [B:10:0x0027, B:14:0x0033, B:18:0x003f] A[DONT_GENERATE, DONT_INLINE]] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        private int zzW(int i, int i2, boolean z) throws URISyntaxException {
            int iZzZ = zzZ(i, i2, zzZK9.zzZOS | zzZK9.zzZOu, zzZK9.zzZOt);
            if (iZzZ > i && (!z || iZzZ == i2)) {
                int iZzZ0 = zzZ0(i, iZzZ);
                if (iZzZ0 > i) {
                    int iZzZ4 = zzZ4(iZzZ0, iZzZ);
                    if (iZzZ4 <= iZzZ0) {
                        iZzZ0 = iZzZ4;
                    } else {
                        iZzZ0 = zzZ0(iZzZ4, iZzZ);
                        if (iZzZ0 > iZzZ4) {
                            iZzZ4 = zzZ4(iZzZ0, iZzZ);
                            if (iZzZ4 > iZzZ0) {
                                iZzZ0 = zzZ0(iZzZ4, iZzZ);
                                if (iZzZ0 > iZzZ4) {
                                    iZzZ4 = zzZ4(iZzZ0, iZzZ);
                                    if (iZzZ4 > iZzZ0) {
                                        iZzZ0 = zzZ0(iZzZ4, iZzZ);
                                        if (iZzZ0 > iZzZ4 && iZzZ0 >= iZzZ) {
                                            return iZzZ0;
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
                zzi("Malformed IPv4 address", iZzZ0);
            }
            return -1;
        }

        private int zzX(int i, int i2, String str) throws URISyntaxException {
            int iZzW = zzW(i, i2, true);
            if (iZzW <= i) {
                zzh(str, i);
            }
            return iZzW;
        }

        private boolean zzY(int i, int i2, String str) {
            int length = str.length();
            if (length > i2 - i) {
                return false;
            }
            int i3 = 0;
            while (i3 < length) {
                int i4 = i + 1;
                if (charAt(i) != str.charAt(i3)) {
                    break;
                }
                i3++;
                i = i4;
            }
            return i3 == length;
        }

        private int zzYV(int i, int i2) throws URISyntaxException {
            int iZzZ = zzZ(i, i2, zzZK9.zzZOM, zzZK9.zzZOL);
            if (iZzZ <= i || zzZ(iZzZ, i2, FilenameUtils.EXTENSION_SEPARATOR)) {
                return -1;
            }
            if (iZzZ > i + 4) {
                zzi("IPv6 hexadecimal digit sequence too long", i);
            }
            this.zzZOb += 2;
            while (iZzZ < i2 && zzZ(iZzZ, i2, ':')) {
                int i3 = iZzZ + 1;
                if (zzZ(i3, i2, ':')) {
                    break;
                }
                int iZzZ2 = zzZ(i3, i2, zzZK9.zzZOM, zzZK9.zzZOL);
                if (iZzZ2 <= i3) {
                    zzh("digits for an IPv6 address", i3);
                }
                if (zzZ(iZzZ2, i2, FilenameUtils.EXTENSION_SEPARATOR)) {
                    return iZzZ;
                }
                if (iZzZ2 > iZzZ + 5) {
                    zzi("IPv6 hexadecimal digit sequence too long", i3);
                }
                this.zzZOb += 2;
                iZzZ = iZzZ2;
            }
            return iZzZ;
        }

        private int zzYW(int i, int i2) throws URISyntaxException {
            if (i == i2) {
                return i;
            }
            int iZzYV = zzYV(i, i2);
            if (iZzYV > i) {
                if (!zzZ(iZzYV, i2, ':')) {
                    return iZzYV;
                }
                i = iZzYV + 1;
            }
            int iZzX = zzX(i, i2, "hex digits or IPv4 address");
            this.zzZOb += 4;
            return iZzX;
        }

        private int zzYY(int i, int i2) throws URISyntaxException {
            int i3 = i;
            int i4 = -1;
            while (true) {
                int iZzZ = zzZ(i3, i2, zzZK9.zzZOO, zzZK9.zzZON);
                int i5 = i3;
                if (iZzZ <= i5) {
                    i3 = i5;
                    break;
                }
                if (iZzZ > i5) {
                    i3 = iZzZ;
                    int iZzZ2 = zzZ(i3, i2, zzZK9.zzZOO | zzZK9.zzZOy | zzZK9.zzZOw, zzZK9.zzZON | zzZK9.zzZOx | zzZK9.zzZOv);
                    if (iZzZ2 > i3) {
                        int i6 = iZzZ2 - 1;
                        if (charAt(i6) == '-') {
                            zzi("Illegal character in hostname", i6);
                        }
                        i3 = iZzZ2;
                    }
                } else {
                    i3 = i5;
                }
                int iZzZ4 = zzZ4(i3, i2);
                if (iZzZ4 <= i3) {
                    i4 = i5;
                    break;
                }
                i3 = iZzZ4;
                i4 = i5;
                if (iZzZ4 >= i2) {
                    break;
                }
            }
            if (i3 < i2 && !zzZ(i3, i2, ':')) {
                zzi("Illegal character in hostname", i3);
            }
            if (i4 < 0) {
                zzh("hostname", i);
            }
            if (i4 > i && !zzZK9.zzZ(charAt(i4), 0L, zzZK9.zzZOP)) {
                zzi("Illegal character in hostname", i4);
            }
            zzZK9.this.zzZP2 = substring(i, i3);
            return i3;
        }

        private int zzYZ(int i, int i2) {
            try {
                int iZzW = zzW(i, i2, false);
                i = (iZzW <= i || iZzW >= i2 || charAt(iZzW) == ':') ? iZzW : -1;
                if (i > i) {
                    zzZK9.this.zzZP2 = substring(i, i);
                }
            } catch (NumberFormatException | URISyntaxException unused) {
            }
            return i;
        }

        private boolean zzZ(int i, int i2, char c) {
            return i < i2 && charAt(i) == c;
        }

        private int zzZ0(int i, int i2) throws URISyntaxException {
            int iZzZ = zzZ(i, i2, zzZK9.zzZOS, 0L);
            return (iZzZ > i && Integer.parseInt(substring(i, iZzZ)) > 255) ? i : iZzZ;
        }

        private int zzZ1(int i, int i2) throws URISyntaxException {
            int i3;
            int iZzYZ;
            int iZzZ;
            int iZzZ2 = zzZ(i, i2, "/?#", "@");
            if (iZzZ2 < i || !zzZ(iZzZ2, i2, '@')) {
                i3 = i;
            } else {
                zzZ(i, iZzZ2, zzZK9.zzZOs, zzZK9.zzZOr, "user info");
                zzZK9.this.zzZP3 = substring(i, iZzZ2);
                i3 = iZzZ2 + 1;
            }
            if (zzZ(i3, i2, '[')) {
                iZzYZ = i3 + 1;
                int iZzZ3 = zzZ(iZzYZ, i2, "/?#", "]");
                if (iZzZ3 <= iZzYZ || !zzZ(iZzZ3, i2, ']')) {
                    zzh("closing bracket for IPv6 address", iZzZ3);
                } else {
                    int iZzZ4 = zzZ(iZzYZ, iZzZ3, "", "%");
                    if (iZzZ4 > iZzYZ) {
                        zzYX(iZzYZ, iZzZ4);
                        int i4 = iZzZ4 + 1;
                        if (i4 == iZzZ3) {
                            zzTQ("scope id expected");
                        }
                        zzZ(i4, iZzZ3, zzZK9.zzZOO, zzZK9.zzZON, "scope id");
                    } else {
                        zzYX(iZzYZ, iZzZ3);
                    }
                    int i5 = iZzZ3 + 1;
                    zzZK9.this.zzZP2 = substring(i3, i5);
                    iZzYZ = i5;
                }
            } else {
                iZzYZ = zzYZ(i3, i2);
                if (iZzYZ <= i3) {
                    iZzYZ = zzYY(i3, i2);
                }
            }
            if (zzZ(iZzYZ, i2, ':') && (iZzZ = zzZ((iZzYZ = iZzYZ + 1), i2, "", "/")) > iZzYZ) {
                zzZ(iZzYZ, iZzZ, zzZK9.zzZOS, 0L, "port number");
                try {
                    zzZK9.this.port = Integer.parseInt(substring(iZzYZ, iZzZ));
                } catch (NumberFormatException unused) {
                    zzi("Malformed port number", iZzYZ);
                }
                iZzYZ = iZzZ;
            }
            if (iZzYZ < i2) {
                zzh("port number", iZzYZ);
            }
            return iZzYZ;
        }

        /* JADX WARN: Removed duplicated region for block: B:6:0x001d A[PHI: r4 r5
          0x001d: PHI (r4v3 int) = (r4v0 int), (r4v4 int) binds: [B:9:0x0030, B:5:0x001b] A[DONT_GENERATE, DONT_INLINE]
          0x001d: PHI (r5v3 int) = (r5v0 int), (r5v4 int) binds: [B:9:0x0030, B:5:0x001b] A[DONT_GENERATE, DONT_INLINE]] */
        /* JADX WARN: Removed duplicated region for block: B:7:0x001f A[PHI: r4 r5
          0x001f: PHI (r4v1 int) = (r4v0 int), (r4v4 int) binds: [B:9:0x0030, B:5:0x001b] A[DONT_GENERATE, DONT_INLINE]
          0x001f: PHI (r5v1 int) = (r5v0 int), (r5v4 int) binds: [B:9:0x0030, B:5:0x001b] A[DONT_GENERATE, DONT_INLINE]] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        private int zzZ2(int i, int i2) throws URISyntaxException {
            int i3;
            int i4;
            boolean z;
            int iZzZ1;
            if (zzZ(i, i2, "", "]") > i) {
                i3 = i;
                i4 = i2;
                z = zzZ(i3, i4, zzZK9.zzZOm, zzZK9.zzZOl) == i4;
            } else {
                i3 = i;
                i4 = i2;
                if (zzZ(i3, i4, zzZK9.zzZOo, zzZK9.zzZOn) == i4) {
                }
            }
            boolean z2 = zzZ(i3, i4, zzZK9.zzZOq, zzZK9.zzZOp) == i4;
            if (z2 && !z) {
                zzZK9.this.authority = substring(i3, i4);
                return i4;
            }
            URISyntaxException uRISyntaxException = null;
            if (z) {
                try {
                    iZzZ1 = zzZ1(i3, i4);
                    if (iZzZ1 < i4) {
                        zzh("end of authority", iZzZ1);
                    }
                    zzZK9.this.authority = substring(i3, i4);
                } catch (URISyntaxException e) {
                    zzZK9.this.zzZP3 = null;
                    zzZK9.this.zzZP2 = null;
                    zzZK9.this.port = -1;
                    if (this.zzZOc) {
                        throw e;
                    }
                    uRISyntaxException = e;
                    iZzZ1 = i3;
                }
            } else {
                iZzZ1 = i3;
            }
            if (iZzZ1 < i4) {
                if (z2) {
                    zzZK9.this.authority = substring(i3, i4);
                } else {
                    if (uRISyntaxException != null) {
                        throw uRISyntaxException;
                    }
                    zzi("Illegal character in authority", iZzZ1);
                }
            }
            return i4;
        }

        private int zzZ3(int i, int i2) throws URISyntaxException {
            int iZzZ2;
            if (zzZ(i, i2, IOUtils.DIR_SEPARATOR_UNIX) && zzZ(i + 1, i2, IOUtils.DIR_SEPARATOR_UNIX)) {
                iZzZ2 = i + 2;
                int iZzZ = zzZ(iZzZ2, i2, "", "/?#");
                if (iZzZ > iZzZ2) {
                    iZzZ2 = zzZ2(iZzZ2, iZzZ);
                } else if (iZzZ >= i2) {
                    zzh("authority", iZzZ2);
                }
            } else {
                iZzZ2 = i;
            }
            int iZzZ3 = zzZ(iZzZ2, i2, "", "?#");
            zzZ(iZzZ2, iZzZ3, zzZK9.zzZOA, zzZK9.zzZOz, "path");
            zzZK9.this.zzZP1 = substring(iZzZ2, iZzZ3);
            if (!zzZ(iZzZ3, i2, '?')) {
                return iZzZ3;
            }
            int i3 = iZzZ3 + 1;
            int iZzZ4 = zzZ(i3, i2, "", "#");
            zzZ(i3, iZzZ4, zzZK9.zzZOE, zzZK9.zzZOD, "query");
            zzZK9.this.zzZP0 = substring(i3, iZzZ4);
            return iZzZ4;
        }

        private int zzZ4(int i, int i2) {
            return (i >= i2 || charAt(i) != '.') ? i : i + 1;
        }

        private void zzh(String str, int i) throws URISyntaxException {
            zzi(com.alibaba.sdk.android.oss.internal.OooO00o.OooO00o("Expected ", str), i);
        }

        private void zzi(String str, int i) throws URISyntaxException {
            throw new URISyntaxException(this.zzZOd, str, i);
        }

        public final void zzYX(boolean z) throws URISyntaxException {
            int iZzZ3;
            this.zzZOc = z;
            int length = this.zzZOd.length();
            int i = 0;
            int iZzZ = zzZ(0, length, "/?#", C18241k5.f55433h);
            if (iZzZ < 0 || !zzZ(iZzZ, length, ':')) {
                iZzZ3 = zzZ3(0, length);
            } else {
                if (iZzZ == 0) {
                    zzh("scheme name", 0);
                }
                zzV(zzZK9.zzZOP, "scheme name");
                zzZ(1, iZzZ, zzZK9.zzZOi, zzZK9.zzZOh, "scheme name");
                zzZK9.this.zzZP4 = substring(0, iZzZ);
                int i2 = iZzZ + 1;
                if (zzZ(i2, length, IOUtils.DIR_SEPARATOR_UNIX)) {
                    iZzZ3 = zzZ3(i2, length);
                } else {
                    iZzZ3 = zzZ(i2, length, "", "#");
                    if (iZzZ3 <= i2) {
                        zzh("scheme-specific part", i2);
                    }
                    zzZ(i2, iZzZ3, zzZK9.zzZOE, zzZK9.zzZOD, "opaque part");
                }
                i = i2;
            }
            zzZK9.this.zzZOZ = substring(i, iZzZ3);
            if (zzZ(iZzZ3, length, '#')) {
                int i3 = iZzZ3 + 1;
                zzZ(i3, length, zzZK9.zzZOE, zzZK9.zzZOD, "fragment");
                zzZK9.this.fragment = substring(i3, length);
                iZzZ3 = length;
            }
            if (iZzZ3 < length) {
                zzi("end of URI", iZzZ3);
            }
        }

        private int zzZ(int i, int i2, String str, String str2) {
            while (i < i2) {
                char cCharAt = charAt(i);
                if (str.indexOf(cCharAt) < 0) {
                    if (str2.indexOf(cCharAt) >= 0) {
                        break;
                    }
                    i++;
                } else {
                    return -1;
                }
            }
            return i;
        }

        private int zzY(int i, int i2, char c) throws URISyntaxException {
            if (c != '%') {
                return (c <= 128 || Character.isSpaceChar(c) || Character.isISOControl(c)) ? i : i + 1;
            }
            int i3 = i + 3;
            if (i3 <= i2 && zzZK9.zzZ(charAt(i + 1), zzZK9.zzZOM, zzZK9.zzZOL) && zzZK9.zzZ(charAt(i + 2), zzZK9.zzZOM, zzZK9.zzZOL)) {
                return i3;
            }
            zzi("Malformed escape pair", i);
            return i;
        }

        private int zzZ(int i, int i2, long j, long j2) throws URISyntaxException {
            int iZzY;
            while (i < i2) {
                char cCharAt = charAt(i);
                if (zzZK9.zzZ(cCharAt, j, j2)) {
                    i++;
                } else {
                    if ((1 & j) == 0 || (iZzY = zzY(i, i2, cCharAt)) <= i) {
                        break;
                    }
                    i = iZzY;
                }
            }
            return i;
        }

        private void zzZ(int i, int i2, long j, long j2, String str) throws URISyntaxException {
            int iZzZ = zzZ(i, i2, j, j2);
            if (iZzZ < i2) {
                zzi(com.alibaba.sdk.android.oss.internal.OooO00o.OooO00o("Illegal character in ", str), iZzZ);
            }
        }

        private int zzYX(int i, int i2) throws URISyntaxException {
            int iZzYV = zzYV(i, i2);
            boolean z = true;
            if (iZzYV > i) {
                if (zzY(iZzYV, i2, "::")) {
                    iZzYV = zzYW(iZzYV + 2, i2);
                } else {
                    if (zzZ(iZzYV, i2, ':')) {
                        iZzYV = zzX(iZzYV + 1, i2, "IPv4 address");
                        this.zzZOb += 4;
                    }
                    z = false;
                }
            } else if (zzY(i, i2, "::")) {
                iZzYV = zzYW(i + 2, i2);
            } else {
                iZzYV = i;
                z = false;
            }
            if (iZzYV < i2) {
                zzi("Malformed IPv6 address", i);
            }
            if (this.zzZOb > 16) {
                zzi("IPv6 address too long", i);
            }
            if (!z && this.zzZOb < 16) {
                zzi("IPv6 address too short", i);
            }
            if (z && this.zzZOb == 16) {
                zzi("Malformed IPv6 address", i);
            }
            return iZzYV;
        }
    }

    static {
        long jZzeW = zzeW();
        zzZOS = jZzeW;
        long jZzV = zzV('A', 'Z');
        zzZOR = jZzV;
        long jZzV2 = zzV('a', 'z');
        zzZOQ = jZzV2;
        long j = jZzV | jZzV2;
        zzZOP = j;
        zzZOO = jZzeW;
        zzZON = j;
        zzZOM = jZzeW;
        zzZOL = zzV('A', 'F') | zzV('a', 'f');
        long jZzTS = zzTS("-_.!~*'()");
        zzZOK = jZzTS;
        long jZzTR = zzTR("-_.!~*'()");
        zzZOJ = jZzTR;
        long j2 = jZzTS | jZzeW;
        zzZOI = j2;
        long j3 = jZzTR | j;
        zzZOH = j3;
        long jZzTS2 = zzTS(";/?:@&=+$,[]");
        zzZOG = jZzTS2;
        long jZzTR2 = zzTR(";/?:@&=+$,[]");
        zzZOF = jZzTR2;
        zzZOE = jZzTS2 | j2 | 1;
        zzZOD = jZzTR2 | j3;
        long jZzTS3 = j2 | 1 | zzTS(":@&=+$,");
        zzZOC = jZzTS3;
        long jZzTR3 = zzTR(":@&=+$,") | j3;
        zzZOB = jZzTR3;
        zzZOA = jZzTS3 | zzTS(";/");
        zzZOz = zzTR(";/") | jZzTR3;
        long jZzTS4 = zzTS(CacheKeyValueDelegate.CACHE_VALUE_SEPARATOR);
        zzZOy = jZzTS4;
        long jZzTR4 = zzTR(CacheKeyValueDelegate.CACHE_VALUE_SEPARATOR);
        zzZOx = jZzTR4;
        zzZOw = zzTS(C18115b5.CONNECTOR);
        zzZOv = zzTR(C18115b5.CONNECTOR);
        zzZOu = zzTS(".");
        zzZOt = zzTR(".");
        long jZzTS5 = j2 | 1 | zzTS(";:&=+$,");
        zzZOs = jZzTS5;
        long jZzTR5 = j3 | zzTR(";:&=+$,");
        zzZOr = jZzTR5;
        zzZOq = j2 | 1 | zzTS("$,;:@&=+");
        zzZOp = j3 | zzTR("$,;:@&=+");
        long jZzTS6 = jZzTS5 | jZzeW | jZzTS4 | zzTS(".:@[]");
        zzZOo = jZzTS6;
        long jZzTR6 = jZzTR4 | jZzTR5 | j | zzTR(".:@[]");
        zzZOn = jZzTR6;
        zzZOm = jZzTS6 | zzTS("%");
        zzZOl = zzTR("%") | jZzTR6;
        zzZOk = zzTS("[");
        zzZOj = zzTR("[");
        zzZOi = jZzeW | zzTS("+-.");
        zzZOh = zzTR("+-.") | j;
        zzZOg = j2 | 1 | zzTS(";?:@&=+$,");
        zzZOf = j3 | zzTR(";?:@&=+$,");
        zzZOe = new char[]{'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};
    }

    private zzZK9() {
        this.port = -1;
        this.zzZOY = null;
        this.zzZOX = null;
        this.zzZOW = null;
        this.zzZOV = null;
        this.zzZOU = null;
        this.zzZOT = null;
    }

    private static int compare(String str, String str2) {
        if (str == str2) {
            return 0;
        }
        if (str == null) {
            return -1;
        }
        if (str2 != null) {
            return str.compareTo(str2);
        }
        return 1;
    }

    private static String decode(String str) {
        int length;
        boolean z;
        if (str == null || (length = str.length()) == 0 || str.indexOf(37) < 0) {
            return str;
        }
        StringBuffer stringBuffer = new StringBuffer(length);
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(length);
        CharBuffer charBufferAllocate = CharBuffer.allocate(length);
        CharsetDecoder charsetDecoderZzZV = zzZKA.zzZV("UTF-8");
        CodingErrorAction codingErrorAction = CodingErrorAction.REPLACE;
        CharsetDecoder charsetDecoderOnUnmappableCharacter = charsetDecoderZzZV.onMalformedInput(codingErrorAction).onUnmappableCharacter(codingErrorAction);
        char cCharAt = str.charAt(0);
        int i = 0;
        boolean z2 = false;
        while (i < length) {
            if (!zzVr && cCharAt != str.charAt(i)) {
                throw new AssertionError();
            }
            if (cCharAt == '[') {
                z2 = true;
            } else if (z2 && cCharAt == ']') {
                z2 = false;
            }
            if (cCharAt != '%' || z2) {
                stringBuffer.append(cCharAt);
                i++;
                if (i >= length) {
                    break;
                }
                cCharAt = str.charAt(i);
            } else {
                byteBufferAllocate.clear();
                do {
                    z = zzVr;
                    if (!z && length - i < 2) {
                        throw new AssertionError();
                    }
                    byteBufferAllocate.put(zzU(str.charAt(i + 1), str.charAt(i + 2)));
                    i += 3;
                    if (i >= length) {
                        break;
                    }
                    cCharAt = str.charAt(i);
                } while (cCharAt == '%');
                byteBufferAllocate.flip();
                charBufferAllocate.clear();
                charsetDecoderOnUnmappableCharacter.reset();
                CoderResult coderResultDecode = charsetDecoderOnUnmappableCharacter.decode(byteBufferAllocate, charBufferAllocate, true);
                if (!z && !coderResultDecode.isUnderflow()) {
                    throw new AssertionError();
                }
                CoderResult coderResultFlush = charsetDecoderOnUnmappableCharacter.flush(charBufferAllocate);
                if (!z && !coderResultFlush.isUnderflow()) {
                    throw new AssertionError();
                }
                stringBuffer.append(charBufferAllocate.flip().toString());
            }
        }
        return stringBuffer.toString();
    }

    private static String encode(String str) {
        ByteBuffer byteBufferEncode;
        int length = str.length();
        if (length != 0) {
            int i = 0;
            while (str.charAt(i) < 128) {
                i++;
                if (i >= length) {
                }
            }
            try {
                byteBufferEncode = zzZKA.zzZU("UTF-8").encode(CharBuffer.wrap(Normalizer.normalize(str, Normalizer.Form.NFC)));
            } catch (CharacterCodingException unused) {
                if (!zzVr) {
                    throw new AssertionError();
                }
                byteBufferEncode = null;
            }
            StringBuffer stringBuffer = new StringBuffer();
            while (byteBufferEncode.hasRemaining()) {
                int i2 = byteBufferEncode.get() & 255;
                if (i2 >= 128) {
                    zzZ(stringBuffer, (byte) i2);
                } else {
                    stringBuffer.append((char) i2);
                }
            }
            return stringBuffer.toString();
        }
        return str;
    }

    private boolean isOpaque() {
        return this.zzZP1 == null;
    }

    private static int zzI(int i, String str) {
        if (str == null) {
            return i;
        }
        int length = str.length();
        for (int i2 = 0; i2 < length; i2++) {
            i = (i * 31) + zzZI(str.charAt(i2));
        }
        return i;
    }

    private static int zzJ(int i, String str) {
        int i2 = 0;
        int iZzZH = 0;
        while (i2 < str.length()) {
            char cCharAt = str.charAt(i2);
            iZzZH = (iZzZH * 31) + cCharAt;
            if (cCharAt == '%') {
                for (int i3 = i2 + 1; i3 < i2 + 3; i3++) {
                    iZzZH = (iZzZH * 31) + zzZH(str.charAt(i3));
                }
                i2 += 2;
            }
            i2++;
        }
        return (i * 127) + iZzZH;
    }

    private static int zzK(int i, String str) {
        if (str == null) {
            return i;
        }
        if (str.indexOf(37) >= 0) {
            return zzJ(i, str);
        }
        return str.hashCode() + (i * 127);
    }

    private static void zzM(String str, String str2, String str3) throws URISyntaxException {
        if (str2 != null && str3 != null && str3.length() > 0 && str3.charAt(0) != '/') {
            throw new URISyntaxException(str, "Relative path in absolute URI");
        }
    }

    private static long zzTR(String str) {
        int length = str.length();
        long j = 0;
        for (int i = 0; i < length; i++) {
            char cCharAt = str.charAt(i);
            if (cCharAt >= '@' && cCharAt < 128) {
                j |= 1 << (cCharAt - '@');
            }
        }
        return j;
    }

    private static long zzTS(String str) {
        int length = str.length();
        long j = 0;
        for (int i = 0; i < length; i++) {
            char cCharAt = str.charAt(i);
            if (cCharAt < '@') {
                j |= 1 << cCharAt;
            }
        }
        return j;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean zzZ(char c, long j, long j2) {
        if (c == 0) {
            return false;
        }
        return c < '@' ? ((1 << c) & j) != 0 : c < 128 && ((1 << (c - 64)) & j2) != 0;
    }

    private static int zzZE(String str, String str2) {
        if (str == str2) {
            return 0;
        }
        if (str == null) {
            return -1;
        }
        if (str2 == null) {
            return 1;
        }
        int length = str.length();
        int length2 = str2.length();
        int i = length < length2 ? length : length2;
        for (int i2 = 0; i2 < i; i2++) {
            int iZzZI = zzZI(str.charAt(i2)) - zzZI(str2.charAt(i2));
            if (iZzZI != 0) {
                return iZzZI;
            }
        }
        return length - length2;
    }

    private static boolean zzZF(String str, String str2) {
        int length;
        if (str == str2) {
            return true;
        }
        if (str == null || str2 == null || str2.length() != (length = str.length())) {
            return false;
        }
        for (int i = 0; i < length; i++) {
            if (zzZI(str.charAt(i)) != zzZI(str2.charAt(i))) {
                return false;
            }
        }
        return true;
    }

    private static boolean zzZG(String str, String str2) {
        if (str == str2) {
            return true;
        }
        if (str == null || str2 == null || str.length() != str2.length()) {
            return false;
        }
        if (str.indexOf(37) < 0) {
            return str.equals(str2);
        }
        int length = str.length();
        int i = 0;
        while (i < length) {
            char cCharAt = str.charAt(i);
            char cCharAt2 = str2.charAt(i);
            if (cCharAt != '%') {
                if (cCharAt != cCharAt2) {
                    return false;
                }
                i++;
            } else {
                if (cCharAt2 != '%') {
                    return false;
                }
                int i2 = i + 1;
                if (zzZI(str.charAt(i2)) != zzZI(str2.charAt(i2))) {
                    return false;
                }
                int i3 = i + 2;
                if (zzZI(str.charAt(i3)) != zzZI(str2.charAt(i3))) {
                    return false;
                }
                i += 3;
            }
        }
        return true;
    }

    private static int zzZH(char c) {
        return (c < 'a' || c > 'z') ? c : c - ' ';
    }

    private static int zzZI(char c) {
        return (c < 'A' || c > 'Z') ? c : c + ControlChar.SPACE_CHAR;
    }

    private static long zzeW() {
        long j = 0;
        for (int iMax = Math.max(Math.min(48, 63), 0); iMax <= Math.max(Math.min(57, 63), 0); iMax++) {
            j |= 1 << iMax;
        }
        return j;
    }

    private void zzeX() {
        if (this.string != null) {
            return;
        }
        StringBuffer stringBuffer = new StringBuffer();
        String str = this.zzZP4;
        if (str != null) {
            stringBuffer.append(str);
            stringBuffer.append(':');
        }
        if (isOpaque()) {
            stringBuffer.append(this.zzZOZ);
        } else {
            if (this.zzZP2 != null) {
                stringBuffer.append("//");
                String str2 = this.zzZP3;
                if (str2 != null) {
                    stringBuffer.append(str2);
                    stringBuffer.append('@');
                }
                boolean z = (this.zzZP2.indexOf(58) < 0 || this.zzZP2.startsWith("[") || this.zzZP2.endsWith("]")) ? false : true;
                if (z) {
                    stringBuffer.append('[');
                }
                stringBuffer.append(this.zzZP2);
                if (z) {
                    stringBuffer.append(']');
                }
                if (this.port != -1) {
                    stringBuffer.append(':');
                    stringBuffer.append(this.port);
                }
            } else if (this.authority != null) {
                stringBuffer.append("//");
                stringBuffer.append(this.authority);
            }
            String str3 = this.zzZP1;
            if (str3 != null) {
                stringBuffer.append(str3);
            }
            if (this.zzZP0 != null) {
                stringBuffer.append('?');
                stringBuffer.append(this.zzZP0);
            }
        }
        if (this.fragment != null) {
            stringBuffer.append('#');
            stringBuffer.append(this.fragment);
        }
        this.string = stringBuffer.toString();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof zzZK9)) {
            return false;
        }
        zzZK9 zzzk9 = (zzZK9) obj;
        if (isOpaque() != zzzk9.isOpaque() || !zzZF(this.zzZP4, zzzk9.zzZP4) || !zzZG(this.fragment, zzzk9.fragment)) {
            return false;
        }
        if (isOpaque()) {
            return zzZG(this.zzZOZ, zzzk9.zzZOZ);
        }
        if (!zzZG(this.zzZP1, zzzk9.zzZP1) || !zzZG(this.zzZP0, zzzk9.zzZP0)) {
            return false;
        }
        String str = this.authority;
        String str2 = zzzk9.authority;
        if (str == str2) {
            return true;
        }
        if (this.zzZP2 != null) {
            if (!zzZG(this.zzZP3, zzzk9.zzZP3) || !zzZF(this.zzZP2, zzzk9.zzZP2) || this.port != zzzk9.port) {
                return false;
            }
        } else if (str != null) {
            if (!zzZG(str, str2)) {
                return false;
            }
        } else if (str != str2) {
            return false;
        }
        return true;
    }

    public final String getHost() {
        return this.zzZP2;
    }

    public final String getPath() {
        String str;
        if (this.zzZOW == null && (str = this.zzZP1) != null) {
            this.zzZOW = decode(str);
        }
        return this.zzZOW;
    }

    public final String getScheme() {
        return this.zzZP4;
    }

    public final int hashCode() {
        int iZzI;
        if (this.zzZV4 != 0) {
            return this.zzZV4;
        }
        int iZzK = zzK(zzI(0, this.zzZP4), this.fragment);
        if (isOpaque()) {
            iZzI = zzK(iZzK, this.zzZOZ);
        } else {
            int iZzK2 = zzK(zzK(iZzK, this.zzZP1), this.zzZP0);
            iZzI = this.zzZP2 != null ? zzI(zzK(iZzK2, this.zzZP3), this.zzZP2) + (this.port * 1949) : zzK(iZzK2, this.authority);
        }
        this.zzZV4 = iZzI;
        return iZzI;
    }

    public final boolean isAbsolute() {
        return this.zzZP4 != null;
    }

    public final String toASCIIString() {
        zzeX();
        return encode(this.string);
    }

    public final String toString() {
        zzeX();
        return this.string;
    }

    public final URL toURL() throws MalformedURLException {
        if (isAbsolute()) {
            return new URL(toASCIIString());
        }
        throw new IllegalArgumentException("URI is not absolute");
    }

    public final zzZK9 zzeY() throws URISyntaxException {
        if (this.zzZP2 == null && this.authority != null) {
            zzeX();
            new zzZ(this.string).zzYX(true);
        }
        return this;
    }

    private static byte zzU(char c, char c2) {
        return (byte) (((zzZG(c) & 15) << 4) | (zzZG(c2) & 15));
    }

    private static long zzV(char c, char c2) {
        long j = 0;
        for (int iMax = Math.max(Math.min((int) c, 127), 64) - 64; iMax <= Math.max(Math.min((int) c2, 127), 64) - 64; iMax++) {
            j |= 1 << iMax;
        }
        return j;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: zzZ, reason: merged with bridge method [inline-methods] */
    public int compareTo(zzZK9 zzzk9) {
        int iZzZE = zzZE(this.zzZP4, zzzk9.zzZP4);
        if (iZzZE != 0) {
            return iZzZE;
        }
        if (isOpaque()) {
            if (!zzzk9.isOpaque()) {
                return 1;
            }
            int iCompare = compare(this.zzZOZ, zzzk9.zzZOZ);
            return iCompare != 0 ? iCompare : compare(this.fragment, zzzk9.fragment);
        }
        if (zzzk9.isOpaque()) {
            return -1;
        }
        if (this.zzZP2 != null && zzzk9.zzZP2 != null) {
            int iCompare2 = compare(this.zzZP3, zzzk9.zzZP3);
            if (iCompare2 != 0) {
                return iCompare2;
            }
            int iZzZE2 = zzZE(this.zzZP2, zzzk9.zzZP2);
            if (iZzZE2 != 0) {
                return iZzZE2;
            }
            int i = this.port - zzzk9.port;
            if (i != 0) {
                return i;
            }
        } else {
            int iCompare3 = compare(this.authority, zzzk9.authority);
            if (iCompare3 != 0) {
                return iCompare3;
            }
        }
        int iCompare4 = compare(this.zzZP1, zzzk9.zzZP1);
        if (iCompare4 != 0) {
            return iCompare4;
        }
        int iCompare5 = compare(this.zzZP0, zzzk9.zzZP0);
        return iCompare5 != 0 ? iCompare5 : compare(this.fragment, zzzk9.fragment);
    }

    public zzZK9(String str) throws URISyntaxException {
        this.port = -1;
        this.zzZOY = null;
        this.zzZOX = null;
        this.zzZOW = null;
        this.zzZOV = null;
        this.zzZOU = null;
        this.zzZOT = null;
        new zzZ(str).zzYX(false);
    }

    private static int zzZG(char c) {
        if (c >= '0' && c <= '9') {
            return c - '0';
        }
        if (c >= 'a' && c <= 'f') {
            return c - 'W';
        }
        if (c >= 'A' && c <= 'F') {
            return c - '7';
        }
        if (zzVr) {
            return -1;
        }
        throw new AssertionError();
    }

    private zzZK9(String str, String str2, String str3, String str4) throws URISyntaxException {
        this.port = -1;
        this.zzZOY = null;
        this.zzZOX = null;
        this.zzZOW = null;
        this.zzZOV = null;
        this.zzZOU = null;
        this.zzZOT = null;
        String strZzZ = zzZ(str, null, str2, -1, str3, null, null);
        zzM(strZzZ, str, str3);
        new zzZ(strZzZ).zzYX(true);
    }

    private static void zzZ(StringBuffer stringBuffer, String str, String str2, String str3, int i) {
        boolean z = false;
        if (str3 != null) {
            stringBuffer.append("//");
            if (str2 != null) {
                stringBuffer.append(zzZ(str2, zzZOs, zzZOr));
                stringBuffer.append('@');
            }
            if (str3.indexOf(58) >= 0 && !str3.startsWith("[") && !str3.endsWith("]")) {
                z = true;
            }
            if (z) {
                stringBuffer.append('[');
            }
            stringBuffer.append(str3);
            if (z) {
                stringBuffer.append(']');
            }
            if (i != -1) {
                stringBuffer.append(':');
                stringBuffer.append(i);
                return;
            }
            return;
        }
        if (str != null) {
            stringBuffer.append("//");
            if (str.startsWith("[")) {
                int iIndexOf = str.indexOf("]");
                String strSubstring = "";
                if (iIndexOf == -1 || str.indexOf(C18241k5.f55433h) == -1) {
                    String str4 = strSubstring;
                    strSubstring = str;
                    str = str4;
                } else if (iIndexOf != str.length()) {
                    int i2 = iIndexOf + 1;
                    strSubstring = str.substring(0, i2);
                    str = str.substring(i2);
                    String str42 = strSubstring;
                    strSubstring = str;
                    str = str42;
                }
                stringBuffer.append(str);
                stringBuffer.append(zzZ(strSubstring, zzZOq | zzZOo, zzZOp | zzZOn));
                return;
            }
            stringBuffer.append(zzZ(str, zzZOq | zzZOo, zzZOp | zzZOn));
        }
    }

    public zzZK9(String str, String str2, String str3) throws URISyntaxException {
        this(str, str2, str3, null);
    }

    private static void zzZ(StringBuffer stringBuffer, String str, String str2, String str3, String str4, int i, String str5, String str6) {
        zzZ(stringBuffer, null, str3, str4, i);
        if (str5 != null) {
            stringBuffer.append(zzZ(str5, zzZOA, zzZOz));
        }
        if (str6 != null) {
            stringBuffer.append('?');
            stringBuffer.append(zzZ(str6, zzZOE, zzZOD));
        }
    }

    private static void zzZ(StringBuffer stringBuffer, String str) {
        if (str != null) {
            stringBuffer.append('#');
            stringBuffer.append(zzZ(str, zzZOE, zzZOD));
        }
    }

    private String zzZ(String str, String str2, String str3, int i, String str4, String str5, String str6) {
        StringBuffer stringBuffer = new StringBuffer();
        if (str != null) {
            stringBuffer.append(str);
            stringBuffer.append(':');
        }
        zzZ(stringBuffer, null, null, null, str3, -1, str4, null);
        zzZ(stringBuffer, str6);
        return stringBuffer.toString();
    }

    private static void zzZ(StringBuffer stringBuffer, byte b) {
        stringBuffer.append('%');
        char[] cArr = zzZOe;
        stringBuffer.append(cArr[(b >> 4) & 15]);
        stringBuffer.append(cArr[b & 15]);
    }

    private static void zzZ(StringBuffer stringBuffer, char c) {
        ByteBuffer byteBufferEncode;
        try {
            byteBufferEncode = zzZKA.zzZU("UTF-8").encode(CharBuffer.wrap(String.valueOf(c)));
        } catch (CharacterCodingException unused) {
            if (!zzVr) {
                throw new AssertionError();
            }
            byteBufferEncode = null;
        }
        while (byteBufferEncode.hasRemaining()) {
            int i = byteBufferEncode.get() & 255;
            if (i >= 128) {
                zzZ(stringBuffer, (byte) i);
            } else {
                stringBuffer.append((char) i);
            }
        }
    }

    private static String zzZ(String str, long j, long j2) {
        boolean z = (1 & j) != 0;
        StringBuffer stringBuffer = null;
        for (int i = 0; i < str.length(); i++) {
            char cCharAt = str.charAt(i);
            if (cCharAt < 128) {
                if (!zzZ(cCharAt, j, j2)) {
                    if (stringBuffer == null) {
                        stringBuffer = new StringBuffer();
                        stringBuffer.append(str.substring(0, i));
                    }
                    zzZ(stringBuffer, (byte) cCharAt);
                } else if (stringBuffer != null) {
                    stringBuffer.append(cCharAt);
                }
            } else if (z && (Character.isSpaceChar(cCharAt) || Character.isISOControl(cCharAt))) {
                if (stringBuffer == null) {
                    stringBuffer = new StringBuffer();
                    stringBuffer.append(str.substring(0, i));
                }
                zzZ(stringBuffer, cCharAt);
            } else if (stringBuffer != null) {
                stringBuffer.append(cCharAt);
            }
        }
        return stringBuffer == null ? str : stringBuffer.toString();
    }
}
