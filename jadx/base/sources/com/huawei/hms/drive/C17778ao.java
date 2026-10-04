package com.huawei.hms.drive;

import androidx.concurrent.futures.OooO0O0;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: com.huawei.hms.drive.ao */
/* JADX INFO: loaded from: classes6.dex */
public final class C17778ao {

    /* JADX INFO: renamed from: aW */
    final String f52695aW;

    /* JADX INFO: renamed from: a */
    static final Comparator<String> f52620a = new Comparator<String>() { // from class: com.huawei.hms.drive.ao.1
        @Override // java.util.Comparator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compare(String str, String str2) {
            int iMin = Math.min(str.length(), str2.length());
            for (int i = 4; i < iMin; i++) {
                char cCharAt = str.charAt(i);
                char cCharAt2 = str2.charAt(i);
                if (cCharAt != cCharAt2) {
                    return cCharAt < cCharAt2 ? -1 : 1;
                }
            }
            int length = str.length();
            int length2 = str2.length();
            if (length != length2) {
                return length < length2 ? -1 : 1;
            }
            return 0;
        }
    };

    /* JADX INFO: renamed from: aX */
    private static final Map<String, C17778ao> f52643aX = new LinkedHashMap();

    /* JADX INFO: renamed from: b */
    public static final C17778ao f52670b = m75991a("SSL_RSA_WITH_NULL_MD5", 1);

    /* JADX INFO: renamed from: c */
    public static final C17778ao f52671c = m75991a("SSL_RSA_EXPORT_WITH_RC4_40_MD5", 3);

    /* JADX INFO: renamed from: d */
    public static final C17778ao f52672d = m75991a("SSL_RSA_WITH_RC4_128_MD5", 4);

    /* JADX INFO: renamed from: e */
    public static final C17778ao f52673e = m75991a("SSL_RSA_WITH_RC4_128_SHA", 5);

    /* JADX INFO: renamed from: f */
    public static final C17778ao f52674f = m75991a("SSL_RSA_WITH_3DES_EDE_CBC_SHA", 10);

    /* JADX INFO: renamed from: g */
    public static final C17778ao f52675g = m75991a("SSL_DHE_DSS_WITH_3DES_EDE_CBC_SHA", 19);

    /* JADX INFO: renamed from: h */
    public static final C17778ao f52676h = m75991a("SSL_DHE_RSA_WITH_3DES_EDE_CBC_SHA", 22);

    /* JADX INFO: renamed from: i */
    public static final C17778ao f52677i = m75991a("TLS_KRB5_WITH_3DES_EDE_CBC_SHA", 31);

    /* JADX INFO: renamed from: j */
    public static final C17778ao f52678j = m75991a("TLS_KRB5_WITH_RC4_128_SHA", 32);

    /* JADX INFO: renamed from: k */
    public static final C17778ao f52679k = m75991a("TLS_KRB5_WITH_DES_CBC_MD5", 34);

    /* JADX INFO: renamed from: l */
    public static final C17778ao f52680l = m75991a("TLS_KRB5_WITH_3DES_EDE_CBC_MD5", 35);

    /* JADX INFO: renamed from: m */
    public static final C17778ao f52681m = m75991a("TLS_KRB5_WITH_RC4_128_MD5", 36);

    /* JADX INFO: renamed from: n */
    public static final C17778ao f52682n = m75991a("TLS_RSA_WITH_AES_128_CBC_SHA", 47);

    /* JADX INFO: renamed from: o */
    public static final C17778ao f52683o = m75991a("TLS_DHE_DSS_WITH_AES_128_CBC_SHA", 50);

    /* JADX INFO: renamed from: p */
    public static final C17778ao f52684p = m75991a("TLS_DHE_RSA_WITH_AES_128_CBC_SHA", 51);

    /* JADX INFO: renamed from: q */
    public static final C17778ao f52685q = m75991a("TLS_RSA_WITH_AES_256_CBC_SHA", 53);

    /* JADX INFO: renamed from: r */
    public static final C17778ao f52686r = m75991a("TLS_DHE_DSS_WITH_AES_256_CBC_SHA", 56);

    /* JADX INFO: renamed from: s */
    public static final C17778ao f52687s = m75991a("TLS_DHE_RSA_WITH_AES_256_CBC_SHA", 57);

    /* JADX INFO: renamed from: t */
    public static final C17778ao f52688t = m75991a("TLS_RSA_WITH_NULL_SHA256", 59);

    /* JADX INFO: renamed from: u */
    public static final C17778ao f52689u = m75991a("TLS_RSA_WITH_AES_128_CBC_SHA256", 60);

    /* JADX INFO: renamed from: v */
    public static final C17778ao f52690v = m75991a("TLS_RSA_WITH_AES_256_CBC_SHA256", 61);

    /* JADX INFO: renamed from: w */
    public static final C17778ao f52691w = m75991a("TLS_DHE_DSS_WITH_AES_128_CBC_SHA256", 64);

    /* JADX INFO: renamed from: x */
    public static final C17778ao f52692x = m75991a("TLS_RSA_WITH_CAMELLIA_128_CBC_SHA", 65);

    /* JADX INFO: renamed from: y */
    public static final C17778ao f52693y = m75991a("TLS_DHE_DSS_WITH_CAMELLIA_128_CBC_SHA", 68);

    /* JADX INFO: renamed from: z */
    public static final C17778ao f52694z = m75991a("TLS_DHE_RSA_WITH_CAMELLIA_128_CBC_SHA", 69);

    /* JADX INFO: renamed from: A */
    public static final C17778ao f52594A = m75991a("TLS_DHE_RSA_WITH_AES_128_CBC_SHA256", 103);

    /* JADX INFO: renamed from: B */
    public static final C17778ao f52595B = m75991a("TLS_DHE_DSS_WITH_AES_256_CBC_SHA256", 106);

    /* JADX INFO: renamed from: C */
    public static final C17778ao f52596C = m75991a("TLS_DHE_RSA_WITH_AES_256_CBC_SHA256", 107);

    /* JADX INFO: renamed from: D */
    public static final C17778ao f52597D = m75991a("TLS_DH_anon_WITH_AES_128_CBC_SHA256", 108);

    /* JADX INFO: renamed from: E */
    public static final C17778ao f52598E = m75991a("TLS_DH_anon_WITH_AES_256_CBC_SHA256", 109);

    /* JADX INFO: renamed from: F */
    public static final C17778ao f52599F = m75991a("TLS_RSA_WITH_CAMELLIA_256_CBC_SHA", 132);

    /* JADX INFO: renamed from: G */
    public static final C17778ao f52600G = m75991a("TLS_DHE_DSS_WITH_CAMELLIA_256_CBC_SHA", 135);

    /* JADX INFO: renamed from: H */
    public static final C17778ao f52601H = m75991a("TLS_DHE_RSA_WITH_CAMELLIA_256_CBC_SHA", 136);

    /* JADX INFO: renamed from: I */
    public static final C17778ao f52602I = m75991a("TLS_PSK_WITH_RC4_128_SHA", 138);

    /* JADX INFO: renamed from: J */
    public static final C17778ao f52603J = m75991a("TLS_PSK_WITH_3DES_EDE_CBC_SHA", 139);

    /* JADX INFO: renamed from: K */
    public static final C17778ao f52604K = m75991a("TLS_PSK_WITH_AES_128_CBC_SHA", 140);

    /* JADX INFO: renamed from: L */
    public static final C17778ao f52605L = m75991a("TLS_PSK_WITH_AES_256_CBC_SHA", 141);

    /* JADX INFO: renamed from: M */
    public static final C17778ao f52606M = m75991a("TLS_RSA_WITH_SEED_CBC_SHA", 150);

    /* JADX INFO: renamed from: N */
    public static final C17778ao f52607N = m75991a("TLS_RSA_WITH_AES_128_GCM_SHA256", 156);

    /* JADX INFO: renamed from: O */
    public static final C17778ao f52608O = m75991a("TLS_RSA_WITH_AES_256_GCM_SHA384", 157);

    /* JADX INFO: renamed from: P */
    public static final C17778ao f52609P = m75991a("TLS_DHE_RSA_WITH_AES_128_GCM_SHA256", 158);

    /* JADX INFO: renamed from: Q */
    public static final C17778ao f52610Q = m75991a("TLS_DHE_RSA_WITH_AES_256_GCM_SHA384", 159);

    /* JADX INFO: renamed from: R */
    public static final C17778ao f52611R = m75991a("TLS_DHE_DSS_WITH_AES_128_GCM_SHA256", 162);

    /* JADX INFO: renamed from: S */
    public static final C17778ao f52612S = m75991a("TLS_DHE_DSS_WITH_AES_256_GCM_SHA384", 163);

    /* JADX INFO: renamed from: T */
    public static final C17778ao f52613T = m75991a("TLS_DH_anon_WITH_AES_128_GCM_SHA256", 166);

    /* JADX INFO: renamed from: U */
    public static final C17778ao f52614U = m75991a("TLS_DH_anon_WITH_AES_256_GCM_SHA384", 167);

    /* JADX INFO: renamed from: V */
    public static final C17778ao f52615V = m75991a("TLS_EMPTY_RENEGOTIATION_INFO_SCSV", 255);

    /* JADX INFO: renamed from: W */
    public static final C17778ao f52616W = m75991a("TLS_FALLBACK_SCSV", 22016);

    /* JADX INFO: renamed from: X */
    public static final C17778ao f52617X = m75991a("TLS_ECDH_ECDSA_WITH_NULL_SHA", 49153);

    /* JADX INFO: renamed from: Y */
    public static final C17778ao f52618Y = m75991a("TLS_ECDH_ECDSA_WITH_RC4_128_SHA", 49154);

    /* JADX INFO: renamed from: Z */
    public static final C17778ao f52619Z = m75991a("TLS_ECDH_ECDSA_WITH_3DES_EDE_CBC_SHA", 49155);

    /* JADX INFO: renamed from: aa */
    public static final C17778ao f52644aa = m75991a("TLS_ECDH_ECDSA_WITH_AES_128_CBC_SHA", 49156);

    /* JADX INFO: renamed from: ab */
    public static final C17778ao f52645ab = m75991a("TLS_ECDH_ECDSA_WITH_AES_256_CBC_SHA", 49157);

    /* JADX INFO: renamed from: ac */
    public static final C17778ao f52646ac = m75991a("TLS_ECDHE_ECDSA_WITH_NULL_SHA", 49158);

    /* JADX INFO: renamed from: ad */
    public static final C17778ao f52647ad = m75991a("TLS_ECDHE_ECDSA_WITH_RC4_128_SHA", 49159);

    /* JADX INFO: renamed from: ae */
    public static final C17778ao f52648ae = m75991a("TLS_ECDHE_ECDSA_WITH_3DES_EDE_CBC_SHA", 49160);

    /* JADX INFO: renamed from: af */
    public static final C17778ao f52649af = m75991a("TLS_ECDHE_ECDSA_WITH_AES_128_CBC_SHA", 49161);

    /* JADX INFO: renamed from: ag */
    public static final C17778ao f52650ag = m75991a("TLS_ECDHE_ECDSA_WITH_AES_256_CBC_SHA", 49162);

    /* JADX INFO: renamed from: ah */
    public static final C17778ao f52651ah = m75991a("TLS_ECDH_RSA_WITH_NULL_SHA", 49163);

    /* JADX INFO: renamed from: ai */
    public static final C17778ao f52652ai = m75991a("TLS_ECDH_RSA_WITH_RC4_128_SHA", 49164);

    /* JADX INFO: renamed from: aj */
    public static final C17778ao f52653aj = m75991a("TLS_ECDH_RSA_WITH_3DES_EDE_CBC_SHA", 49165);

    /* JADX INFO: renamed from: ak */
    public static final C17778ao f52654ak = m75991a("TLS_ECDH_RSA_WITH_AES_128_CBC_SHA", 49166);

    /* JADX INFO: renamed from: al */
    public static final C17778ao f52655al = m75991a("TLS_ECDH_RSA_WITH_AES_256_CBC_SHA", 49167);

    /* JADX INFO: renamed from: am */
    public static final C17778ao f52656am = m75991a("TLS_ECDHE_RSA_WITH_NULL_SHA", 49168);

    /* JADX INFO: renamed from: an */
    public static final C17778ao f52657an = m75991a("TLS_ECDHE_RSA_WITH_RC4_128_SHA", 49169);

    /* JADX INFO: renamed from: ao */
    public static final C17778ao f52658ao = m75991a("TLS_ECDHE_RSA_WITH_3DES_EDE_CBC_SHA", 49170);

    /* JADX INFO: renamed from: ap */
    public static final C17778ao f52659ap = m75991a("TLS_ECDHE_RSA_WITH_AES_128_CBC_SHA", 49171);

    /* JADX INFO: renamed from: aq */
    public static final C17778ao f52660aq = m75991a("TLS_ECDHE_RSA_WITH_AES_256_CBC_SHA", 49172);

    /* JADX INFO: renamed from: ar */
    public static final C17778ao f52661ar = m75991a("TLS_ECDH_anon_WITH_NULL_SHA", 49173);

    /* JADX INFO: renamed from: as */
    public static final C17778ao f52662as = m75991a("TLS_ECDH_anon_WITH_RC4_128_SHA", 49174);

    /* JADX INFO: renamed from: at */
    public static final C17778ao f52663at = m75991a("TLS_ECDH_anon_WITH_3DES_EDE_CBC_SHA", 49175);

    /* JADX INFO: renamed from: au */
    public static final C17778ao f52664au = m75991a("TLS_ECDH_anon_WITH_AES_128_CBC_SHA", 49176);

    /* JADX INFO: renamed from: av */
    public static final C17778ao f52665av = m75991a("TLS_ECDH_anon_WITH_AES_256_CBC_SHA", 49177);

    /* JADX INFO: renamed from: aw */
    public static final C17778ao f52666aw = m75991a("TLS_ECDHE_ECDSA_WITH_AES_128_CBC_SHA256", 49187);

    /* JADX INFO: renamed from: ax */
    public static final C17778ao f52667ax = m75991a("TLS_ECDHE_ECDSA_WITH_AES_256_CBC_SHA384", 49188);

    /* JADX INFO: renamed from: ay */
    public static final C17778ao f52668ay = m75991a("TLS_ECDH_ECDSA_WITH_AES_128_CBC_SHA256", 49189);

    /* JADX INFO: renamed from: az */
    public static final C17778ao f52669az = m75991a("TLS_ECDH_ECDSA_WITH_AES_256_CBC_SHA384", 49190);

    /* JADX INFO: renamed from: aA */
    public static final C17778ao f52621aA = m75991a("TLS_ECDHE_RSA_WITH_AES_128_CBC_SHA256", 49191);

    /* JADX INFO: renamed from: aB */
    public static final C17778ao f52622aB = m75991a("TLS_ECDHE_RSA_WITH_AES_256_CBC_SHA384", 49192);

    /* JADX INFO: renamed from: aC */
    public static final C17778ao f52623aC = m75991a("TLS_ECDH_RSA_WITH_AES_128_CBC_SHA256", 49193);

    /* JADX INFO: renamed from: aD */
    public static final C17778ao f52624aD = m75991a("TLS_ECDH_RSA_WITH_AES_256_CBC_SHA384", 49194);

    /* JADX INFO: renamed from: aE */
    public static final C17778ao f52625aE = m75991a("TLS_ECDHE_ECDSA_WITH_AES_128_GCM_SHA256", 49195);

    /* JADX INFO: renamed from: aF */
    public static final C17778ao f52626aF = m75991a("TLS_ECDHE_ECDSA_WITH_AES_256_GCM_SHA384", 49196);

    /* JADX INFO: renamed from: aG */
    public static final C17778ao f52627aG = m75991a("TLS_ECDH_ECDSA_WITH_AES_128_GCM_SHA256", 49197);

    /* JADX INFO: renamed from: aH */
    public static final C17778ao f52628aH = m75991a("TLS_ECDH_ECDSA_WITH_AES_256_GCM_SHA384", 49198);

    /* JADX INFO: renamed from: aI */
    public static final C17778ao f52629aI = m75991a("TLS_ECDHE_RSA_WITH_AES_128_GCM_SHA256", 49199);

    /* JADX INFO: renamed from: aJ */
    public static final C17778ao f52630aJ = m75991a("TLS_ECDHE_RSA_WITH_AES_256_GCM_SHA384", 49200);

    /* JADX INFO: renamed from: aK */
    public static final C17778ao f52631aK = m75991a("TLS_ECDH_RSA_WITH_AES_128_GCM_SHA256", 49201);

    /* JADX INFO: renamed from: aL */
    public static final C17778ao f52632aL = m75991a("TLS_ECDH_RSA_WITH_AES_256_GCM_SHA384", 49202);

    /* JADX INFO: renamed from: aM */
    public static final C17778ao f52633aM = m75991a("TLS_ECDHE_PSK_WITH_AES_128_CBC_SHA", 49205);

    /* JADX INFO: renamed from: aN */
    public static final C17778ao f52634aN = m75991a("TLS_ECDHE_PSK_WITH_AES_256_CBC_SHA", 49206);

    /* JADX INFO: renamed from: aO */
    public static final C17778ao f52635aO = m75991a("TLS_ECDHE_RSA_WITH_CHACHA20_POLY1305_SHA256", 52392);

    /* JADX INFO: renamed from: aP */
    public static final C17778ao f52636aP = m75991a("TLS_ECDHE_ECDSA_WITH_CHACHA20_POLY1305_SHA256", 52393);

    /* JADX INFO: renamed from: aQ */
    public static final C17778ao f52637aQ = m75991a("TLS_ECDHE_PSK_WITH_CHACHA20_POLY1305_SHA256", 52396);

    /* JADX INFO: renamed from: aR */
    public static final C17778ao f52638aR = m75991a("TLS_AES_128_GCM_SHA256", 4865);

    /* JADX INFO: renamed from: aS */
    public static final C17778ao f52639aS = m75991a("TLS_AES_256_GCM_SHA384", 4866);

    /* JADX INFO: renamed from: aT */
    public static final C17778ao f52640aT = m75991a("TLS_CHACHA20_POLY1305_SHA256", 4867);

    /* JADX INFO: renamed from: aU */
    public static final C17778ao f52641aU = m75991a("TLS_AES_128_CCM_SHA256", 4868);

    /* JADX INFO: renamed from: aV */
    public static final C17778ao f52642aV = m75991a("TLS_AES_256_CCM_8_SHA256", 4869);

    private C17778ao(String str) {
        str.getClass();
        this.f52695aW = str;
    }

    /* JADX INFO: renamed from: a */
    public static synchronized C17778ao m75990a(String str) {
        C17778ao c17778ao;
        try {
            Map<String, C17778ao> map = f52643aX;
            c17778ao = map.get(str);
            if (c17778ao == null) {
                c17778ao = map.get(m75993b(str));
                if (c17778ao == null) {
                    c17778ao = new C17778ao(str);
                }
                map.put(str, c17778ao);
            }
        } catch (Throwable th) {
            throw th;
        }
        return c17778ao;
    }

    /* JADX INFO: renamed from: b */
    private static String m75993b(String str) {
        return str.startsWith("TLS_") ? OooO0O0.OooO00o(str, 4, new StringBuilder("SSL_")) : str.startsWith("SSL_") ? OooO0O0.OooO00o(str, 4, new StringBuilder("TLS_")) : str;
    }

    public String toString() {
        return this.f52695aW;
    }

    /* JADX INFO: renamed from: a */
    public static List<C17778ao> m75992a(String... strArr) {
        ArrayList arrayList = new ArrayList(strArr.length);
        for (String str : strArr) {
            arrayList.add(m75990a(str));
        }
        return Collections.unmodifiableList(arrayList);
    }

    /* JADX INFO: renamed from: a */
    private static C17778ao m75991a(String str, int i) {
        C17778ao c17778ao = new C17778ao(str);
        f52643aX.put(str, c17778ao);
        return c17778ao;
    }
}
