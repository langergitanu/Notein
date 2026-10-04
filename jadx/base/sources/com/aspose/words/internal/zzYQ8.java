package com.aspose.words.internal;

import OooOoo.C20593OooO0Oo;
import Oooo0oO.o0Oo0oo;
import com.aspose.slides.internal.p332p7.C22237OooO0o0;
import com.aspose.words.internal.zzYNO;
import com.aspose.words.internal.zzYNQ;
import com.aspose.words.internal.zzZ1L;
import java.io.IOException;
import java.security.AccessController;
import java.security.NoSuchAlgorithmException;
import java.security.PrivateKey;
import java.security.PrivilegedAction;
import java.security.Provider;
import java.security.PublicKey;
import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
import sun.security.provider.Sun;

/* JADX INFO: loaded from: classes5.dex */
public final class zzYQ8 extends Provider {
    private static final Map<String, Integer> zzVVc;
    private static final Map<String, zzZ1L.zzZ> zzVVd;
    private final Map<Map<String, String>, Map<String, String>> zzVV2;
    private final Map<zzZDA, zzYQO> zzVV3;
    private Map<String, zzYPS> zzVV4;
    private Map<String, zzZ> zzVV5;
    private int zzVV6;
    private SecureRandom zzVV7;
    private boolean zzVV8;
    private int zzVV9;
    private zzZ1L.zzZ zzVVa;
    private volatile SecureRandom zzVVb;

    public static class zzX extends Provider {
        public zzX() {
            super("BCFHEP", 1.0d, "Bouncy Castle FIPS Hybrid Entropy Provider");
        }
    }

    public static class zzY extends SecureRandom {
        public zzY() {
            super(new sun.security.provider.SecureRandom(), zzXBh());
        }

        private static Provider zzXBh() {
            try {
                Class<?> cls = Class.forName("sun.security.jca.Providers");
                return (Provider) cls.getMethod("getSunProvider", new Class[0]).invoke(cls, new Object[0]);
            } catch (Exception unused) {
                return new Sun();
            }
        }
    }

    public static class zzZ extends Provider.Service {
        private final zzYPS zzVV0;

        public zzZ(Provider provider, String str, String str2, String str3, List<String> list, Map<String, String> map, zzYPS zzyps) {
            super(provider, str, str2, str3, list, map);
            this.zzVV0 = zzyps;
        }

        @Override // java.security.Provider.Service
        public final Object newInstance(Object obj) throws NoSuchAlgorithmException {
            try {
                zzZ0L.isReady();
                Object objZzWL = this.zzVV0.zzWL(obj);
                if (objZzWL != null) {
                    return objZzWL;
                }
                throw new NoSuchAlgorithmException("No such algorithm in FIPS approved mode: " + getAlgorithm());
            } catch (NoSuchAlgorithmException e) {
                throw e;
            } catch (Exception e2) {
                throw new NoSuchAlgorithmException("Unable to invoke creator for " + getAlgorithm() + ": " + e2.getMessage(), e2);
            }
        }
    }

    static {
        HashMap map = new HashMap();
        zzVVd = map;
        HashMap map2 = new HashMap();
        zzVVc = map2;
        map.put("SHA1", zzZ1L.zzWhO);
        map.put("SHA224", zzZ1L.zzWhN);
        map.put("SHA256", zzZ1L.zzWhM);
        map.put("SHA384", zzZ1L.zzWhL);
        map.put("SHA512", zzZ1L.zzWhK);
        map.put("SHA512(224)", zzZ1L.zzWhJ);
        map.put("SHA512(256)", zzZ1L.zzWhI);
        map.put("HMACSHA1", zzZ1L.zzWhH);
        map.put("HMACSHA224", zzZ1L.zzWhG);
        map.put("HMACSHA256", zzZ1L.zzWhF);
        map.put("HMACSHA384", zzZ1L.zzWhE);
        map.put("HMACSHA512", zzZ1L.zzWhD);
        map.put("HMACSHA512(224)", zzZ1L.zzWhC);
        map.put("HMACSHA512(256)", zzZ1L.zzWhB);
        map.put("CTRAES128", zzZ1L.zzWhz);
        map.put("CTRAES192", zzZ1L.zzWhy);
        map.put("CTRAES256", zzZ1L.zzWhx);
        map.put("CTRDESEDE", zzZ1L.zzWhA);
        map2.put("SHA1", 128);
        map2.put("SHA224", 192);
        map2.put("SHA256", 256);
        map2.put("SHA384", 256);
        map2.put("SHA512", 256);
        map2.put("SHA512(224)", 192);
        map2.put("SHA512(256)", 256);
        map2.put("HMACSHA1", 128);
        map2.put("HMACSHA224", 192);
        map2.put("HMACSHA256", 256);
        map2.put("HMACSHA384", 256);
        map2.put("HMACSHA512", 256);
        map2.put("HMACSHA512(224)", 192);
        map2.put("HMACSHA512(256)", 256);
        map2.put("CTRAES128", 128);
        map2.put("CTRAES192", 192);
        map2.put("CTRAES256", 256);
        map2.put("CTRDESEDE", 112);
    }

    public zzYQ8() {
        this((byte) 0);
    }

    private void addAttribute(String str, String str2, String str3) {
        String strOooO0Oo = o0Oo0oo.OooO0Oo(str, " ", str2);
        if (containsKey(strOooO0Oo)) {
            throw new IllegalStateException(C20593OooO0Oo.OooO0O0("duplicate provider attribute key (", strOooO0Oo, ") found"));
        }
        put(strOooO0Oo, str3);
    }

    private Map<String, String> zzQ(Map<String, String> map) {
        Map<String, String> map2 = this.zzVV2.get(map);
        if (map2 != null) {
            return map2;
        }
        this.zzVV2.put(map, map);
        return map;
    }

    private static byte[] zzXBl() {
        return zzYGU.zzn(zzYGN.zzWX(Thread.currentThread().getId()), zzYGN.zzWX(System.currentTimeMillis()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static SecureRandom zzXBn() {
        return ((Boolean) AccessController.doPrivileged(new PrivilegedAction<Boolean>() { // from class: com.aspose.words.internal.zzYQ8.3
            private static Boolean zzXBi() {
                try {
                    return Boolean.valueOf(SecureRandom.class.getMethod("getInstanceStrong", new Class[0]) != null);
                } catch (Exception unused) {
                    return Boolean.FALSE;
                }
            }

            @Override // java.security.PrivilegedAction
            public final /* synthetic */ Boolean run() {
                return zzXBi();
            }
        })).booleanValue() ? (SecureRandom) AccessController.doPrivileged(new PrivilegedAction<SecureRandom>() { // from class: com.aspose.words.internal.zzYQ8.4
            private static SecureRandom zzXBj() {
                try {
                    return (SecureRandom) SecureRandom.class.getMethod("getInstanceStrong", new Class[0]).invoke(null, new Object[0]);
                } catch (Exception unused) {
                    return new zzY();
                }
            }

            @Override // java.security.PrivilegedAction
            public final /* synthetic */ SecureRandom run() {
                return zzXBj();
            }
        }) : new zzY();
    }

    private void zzXo(String str, String str2) {
        if (containsKey(str)) {
            throw new IllegalStateException(C20593OooO0Oo.OooO0O0("duplicate provider key (", str, ") found"));
        }
        put(str, str2);
    }

    private void zzZ(String str, zzZDA zzzda, String str2, String str3) {
        String str4 = str + "." + zzzda + " " + str2;
        if (containsKey(str4)) {
            throw new IllegalStateException(C20593OooO0Oo.OooO0O0("duplicate provider attribute key (", str4, ") found"));
        }
        put(str4, str3);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean zzwv(String str) {
        return zzYQ8.class.getClassLoader().loadClass(str) != null;
    }

    @Override // java.security.Provider
    public final synchronized Provider.Service getService(String str, String str2) throws Throwable {
        Throwable th;
        String upperCase;
        zzZ zzz;
        try {
            try {
                upperCase = zzYGI.toUpperCase(str2);
                zzz = this.zzVV5.get(str + "." + upperCase);
            } catch (Throwable th2) {
                th = th2;
            }
        } catch (Throwable th3) {
            th = th3;
        }
        if (zzz == null) {
            String str3 = "Alg.Alias." + str + ".";
            String str4 = (String) get(str3 + upperCase);
            if (str4 == null) {
                str4 = upperCase;
            }
            String str5 = (String) get(str + "." + str4);
            if (str5 == null) {
                return null;
            }
            String str6 = str + "." + upperCase + " ";
            ArrayList arrayList = new ArrayList();
            HashMap map = new HashMap();
            for (Map.Entry entry : entrySet()) {
                try {
                    String str7 = (String) entry.getKey();
                    if (str7.startsWith(str3) && entry.getValue().equals(str2)) {
                        arrayList.add(str7.substring(str3.length()));
                    }
                    if (str7.startsWith(str6)) {
                        map.put(str7.substring(str6.length()), (String) entry.getValue());
                    }
                } catch (Throwable th4) {
                    th = th4;
                }
            }
            zzz = new zzZ(this, str, upperCase, str5, arrayList, zzQ(map), this.zzVV4.get(str5));
            this.zzVV5.put(str + "." + upperCase, zzz);
            th = th;
            throw th;
        }
        return zzz;
    }

    @Override // java.security.Provider
    public final synchronized Set<Provider.Service> getServices() {
        LinkedHashSet linkedHashSet;
        Set<Provider.Service> services = super.getServices();
        linkedHashSet = new LinkedHashSet();
        for (Provider.Service service : services) {
            linkedHashSet.add(getService(service.getType(), service.getAlgorithm()));
        }
        return linkedHashSet;
    }

    public final PublicKey zzU(zzZ7D zzz7d) throws IOException {
        zzYQO zzyqo = this.zzVV3.get(zzz7d.zzXHJ().zzXJk());
        if (zzyqo == null) {
            return null;
        }
        return zzyqo.zzV(zzz7d);
    }

    public final void zzV(String str, Map<String, String> map) {
        for (Map.Entry<String, String> entry : map.entrySet()) {
            addAttribute(str, entry.getKey(), entry.getValue());
        }
    }

    public final int zzXBm() {
        int i;
        synchronized (this) {
            i = this.zzVV6;
        }
        return i;
    }

    public final SecureRandom zzXBo() {
        if (this.zzVVb == null) {
            this.zzVVb = (SecureRandom) AccessController.doPrivileged(new PrivilegedAction<SecureRandom>() { // from class: com.aspose.words.internal.zzYQ8.2
                /* JADX INFO: Access modifiers changed from: private */
                @Override // java.security.PrivilegedAction
                /* JADX INFO: renamed from: zzXBj, reason: merged with bridge method [inline-methods] */
                public SecureRandom run() {
                    return zzYQ8.this.zzVV8 ? new zzW() : zzYQ8.zzXBn();
                }
            });
        }
        return this.zzVVb;
    }

    public final SecureRandom zzXBp() {
        SecureRandom secureRandomZzXGZ;
        try {
            secureRandomZzXGZ = zzZ5L.zzXGZ();
        } catch (IllegalStateException unused) {
            synchronized (this) {
                try {
                    if (this.zzVV7 == null) {
                        SecureRandom secureRandomZzXBo = zzXBo();
                        this.zzVV7 = this.zzVVa.zzZ(secureRandomZzXBo, true).zzX3(zzXBl()).zzZ(secureRandomZzXBo.generateSeed((this.zzVV9 / 16) + 1), true, zzYGI.zzwb("Bouncy Castle FIPS Provider"));
                    }
                    secureRandomZzXGZ = this.zzVV7;
                } finally {
                }
            }
        }
        synchronized (this) {
            try {
                if (secureRandomZzXGZ instanceof zzZ0O) {
                    int iZzXGf = ((zzZ0O) secureRandomZzXGZ).zzXGf();
                    if (iZzXGf < this.zzVV6) {
                        this.zzVV6 = iZzXGf;
                    }
                } else {
                    this.zzVV6 = -1;
                }
            } finally {
            }
        }
        return secureRandomZzXGZ;
    }

    public final zzZ1L.zzZ zzXBq() {
        return this.zzVVa;
    }

    public final int zzXBr() {
        return this.zzVV9;
    }

    public final void zzXp(String str, String str2) {
        if (containsKey(str)) {
            throw new IllegalStateException(C20593OooO0Oo.OooO0O0("duplicate provider key (", str, ") found"));
        }
        put(str, str2);
    }

    public static class zzW extends SecureRandom {
        private final zzZ0O zzVUW;
        private final SecureRandom zzVUX;
        private final AtomicInteger zzVUY;
        private final AtomicBoolean zzVUZ;

        public class zzZ implements zzZ5G {
            private final int zzVUU;
            private final AtomicReference zzVUT = new AtomicReference();
            private final AtomicBoolean zzVUS = new AtomicBoolean(false);

            /* JADX INFO: renamed from: com.aspose.words.internal.zzYQ8$zzW$zzZ$zzZ, reason: collision with other inner class name */
            public class RunnableC19091zzZ implements Runnable {
                private final int zzVUR;

                public RunnableC19091zzZ(int i) {
                    this.zzVUR = i;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    zzZ.this.zzVUT.set(zzW.this.zzVUX.generateSeed(this.zzVUR));
                    zzW.this.zzVUZ.set(true);
                }
            }

            public zzZ(int i) {
                this.zzVUU = (i + 7) / 8;
            }

            @Override // com.aspose.words.internal.zzZ5G
            public final int zzXGW() {
                return this.zzVUU * 8;
            }

            @Override // com.aspose.words.internal.zzZ5G
            public final byte[] zzXGX() {
                byte[] bArrGenerateSeed = (byte[]) this.zzVUT.getAndSet(null);
                if (bArrGenerateSeed == null || bArrGenerateSeed.length != this.zzVUU) {
                    bArrGenerateSeed = zzW.this.zzVUX.generateSeed(this.zzVUU);
                } else {
                    this.zzVUS.set(false);
                }
                if (!this.zzVUS.getAndSet(true)) {
                    new Thread(new RunnableC19091zzZ(this.zzVUU)).start();
                }
                return bArrGenerateSeed;
            }
        }

        public zzW() {
            super(null, new zzX());
            this.zzVUZ = new AtomicBoolean(false);
            this.zzVUY = new AtomicInteger(0);
            SecureRandom secureRandomZzXBn = zzYQ8.zzXBn();
            this.zzVUX = secureRandomZzXBn;
            this.zzVUW = zzZ1L.zzWhK.zzZ(new zzZ5F() { // from class: com.aspose.words.internal.zzYQ8.zzW.1
                @Override // com.aspose.words.internal.zzZ5F
                public final zzZ5G zzg0(int i) {
                    return zzW.this.new zzZ(i);
                }
            }).zzX3(zzYGI.zzwb("Bouncy Castle Hybrid Entropy Source")).zzZ(secureRandomZzXBn.generateSeed(32), false, null);
        }

        @Override // java.security.SecureRandom
        public final byte[] generateSeed(int i) {
            byte[] bArr = new byte[i];
            if (this.zzVUY.getAndIncrement() > 20 && this.zzVUZ.getAndSet(false)) {
                this.zzVUY.set(0);
                this.zzVUW.zzXEh();
            }
            this.zzVUW.nextBytes(bArr);
            return bArr;
        }

        @Override // java.security.SecureRandom
        public final void setSeed(byte[] bArr) {
            zzZ0O zzz0o = this.zzVUW;
            if (zzz0o != null) {
                zzz0o.setSeed(bArr);
            }
        }

        @Override // java.security.SecureRandom, java.util.Random
        public final void setSeed(long j) {
            zzZ0O zzz0o = this.zzVUW;
            if (zzz0o != null) {
                zzz0o.setSeed(j);
            }
        }
    }

    private zzYQ8(byte b) {
        this((String) null);
    }

    private zzYQ8(String str) {
        super("BCFIPS", 1.000203d, "BouncyCastle Security Provider (FIPS edition) v1.0.2.3");
        this.zzVVa = zzZ1L.zzWhK;
        this.zzVV9 = 256;
        this.zzVV8 = false;
        this.zzVV6 = 256;
        this.zzVV5 = new HashMap();
        this.zzVV4 = new HashMap();
        this.zzVV3 = new HashMap();
        this.zzVV2 = new HashMap();
        this.zzVVb = null;
        new zzYNT().zzZ(this);
        new zzYNQ.zzY().zzZ(this);
        new zzYNQ.zzX().zzZ(this);
        new zzYNQ.zzW().zzZ(this);
        new zzYNQ.zzV().zzZ(this);
        new zzYNQ.zzQ().zzZ(this);
        new zzYNQ.zzU().zzZ(this);
        new zzYNQ.zzT().zzZ(this);
        new zzYNQ.zzS().zzZ(this);
        new zzYNQ.zzR().zzZ(this);
        new zzYNO.zzY().zzZ(this);
        if (!zzZ5L.zzXH0()) {
            new zzYNO.zzZ().zzZ(this);
            new zzYNO.zzV().zzZ(this);
            new zzYNO.zzU().zzZ(this);
            new zzYNO.zzT().zzZ(this);
            new zzYNO.zzS().zzZ(this);
            new zzYNO.zzR().zzZ(this);
            new zzYNO.zzQ().zzZ(this);
        }
        new zzYOV().zzZ(this);
        new zzYOS().zzZ(this);
        if (!zzYGM.zzwd("org.bouncycastle.ec.disable")) {
            new zzYOM().zzZ(this);
        }
        new zzYNX().zzZ(this);
        new zzYO2().zzZ(this);
        if (!zzZ5L.zzXH0()) {
            new zzYO3().zzZ(this);
            new zzYO4().zzZ(this);
            new zzYO1().zzZ(this);
        }
        new zzYP4().zzZ(this);
        new zzYOW().zzZ(this);
        new zzYNJ().zzZ(this);
        new zzYP2().zzZ(this);
        new zzYOC().zzZ(this);
        if (!zzZ5L.zzXH0()) {
            new zzYOE().zzZ(this);
            new zzYOP().zzZ(this);
            new zzYOD().zzZ(this);
            new zzYOA().zzZ(this);
            new zzYOL().zzZ(this);
            new zzYP1().zzZ(this);
            new zzYP0().zzZ(this);
            new zzYNY().zzZ(this);
            new zzYOB().zzZ(this);
            new zzYNS().zzZ(this);
            new zzYOZ().zzZ(this);
            new zzYOY().zzZ(this);
            new zzYOX().zzZ(this);
            new zzYO7().zzZ(this);
            new zzYNN().zzZ(this);
            new zzYNR().zzZ(this);
            new zzYNK().zzZ(this);
            new zzYP3().zzZ(this);
            new zzYNM().zzZ(this);
            new zzYNZ().zzZ(this);
        }
        if (!zzYGM.zzwd("org.bouncycastle.jsse.disable_kdf")) {
            AccessController.doPrivileged(new PrivilegedAction<Object>() { // from class: com.aspose.words.internal.zzYQ8.1
                @Override // java.security.PrivilegedAction
                public final Object run() {
                    if (!zzYQ8.zzwv("sun.security.internal.spec.TlsKeyMaterialParameterSpec") || !zzYQ8.zzwv("sun.security.internal.spec.TlsKeyMaterialSpec") || !zzYQ8.zzwv("sun.security.internal.spec.TlsMasterSecretParameterSpec") || !zzYQ8.zzwv("sun.security.internal.spec.TlsPrfParameterSpec") || !zzYQ8.zzwv("sun.security.internal.spec.TlsRsaPremasterSecretParameterSpec")) {
                        return null;
                    }
                    new zzYNL().zzZ(zzYQ8.this);
                    return null;
                }
            });
        }
        if (!zzYGM.zzwd("org.bouncycastle.pkix.disable_certpath")) {
            new zzYO0().zzZ(this);
        }
        if (zzYGM.zzwd("org.bouncycastle.jca.enable_jks")) {
            new zzYO5().zzZ(this);
        }
    }

    public final PrivateKey zzV(zzZ94 zzz94) throws IOException {
        zzYQO zzyqo = this.zzVV3.get(zzz94.zzXJ8().zzXJk());
        if (zzyqo == null) {
            return null;
        }
        return zzyqo.zzW(zzz94);
    }

    public final void zzZ(String str, zzZDA zzzda, Map<String, String> map) {
        for (Map.Entry<String, String> entry : map.entrySet()) {
            zzZ(str, zzzda, entry.getKey(), entry.getValue());
        }
    }

    public final void zzZ(String str, String str2, Map<String, String> map, zzYPS zzyps) {
        if (!containsKey(str)) {
            addAttribute(str, "ImplementedIn", "Software");
            zzV(str, map);
            put(str, str2);
            this.zzVV4.put(str2, zzyps);
            return;
        }
        throw new IllegalStateException(C20593OooO0Oo.OooO0O0("duplicate provider key (", str, ") found"));
    }

    public final void zzZ(String str, String str2, zzYPS zzyps) {
        if (!containsKey(str)) {
            addAttribute(str, "ImplementedIn", "Software");
            put(str, str2);
            this.zzVV4.put(str2, zzyps);
            return;
        }
        throw new IllegalStateException(C20593OooO0Oo.OooO0O0("duplicate provider key (", str, ") found"));
    }

    public final void zzZ(String str, zzZDA zzzda, String str2, zzYPS zzyps) {
        String str3 = str + "." + zzzda;
        if (!containsKey(str3)) {
            zzZ(str, zzzda, "ImplementedIn", "Software");
            put(str3, str2);
            this.zzVV4.put(str2, zzyps);
            zzZ(str, zzzda.getId(), "OID." + zzzda.getId());
            return;
        }
        throw new IllegalStateException(C20593OooO0Oo.OooO0O0("duplicate provider key (", str3, ") found"));
    }

    public final void zzZ(String str, zzZDA zzzda, String str2, Map<String, String> map, zzYPS zzyps) {
        String str3 = str + "." + zzzda;
        if (!containsKey(str3)) {
            zzZ(str, zzzda, map);
            zzZ(str, zzzda, "ImplementedIn", "Software");
            put(str3, str2);
            this.zzVV4.put(str2, zzyps);
            zzZ(str, zzzda.getId(), "OID." + zzzda.getId());
            return;
        }
        throw new IllegalStateException(C20593OooO0Oo.OooO0O0("duplicate provider key (", str3, ") found"));
    }

    public final void zzZ(String str, String str2, String... strArr) {
        if (containsKey(str + "." + str2)) {
            for (String str3 : strArr) {
                zzXo(C22237OooO0o0.OooO00o("Alg.Alias.", str, ".", str3), str2);
            }
            return;
        }
        throw new IllegalStateException(androidx.core.database.OooO00o.OooO00o("primary key (", str, ".", str2, ") not found"));
    }

    public final void zzZ(String str, String str2, zzZDA... zzzdaArr) {
        if (containsKey(str + "." + str2)) {
            for (zzZDA zzzda : zzzdaArr) {
                zzXo("Alg.Alias." + str + "." + zzzda, str2);
                zzXo("Alg.Alias." + str + ".OID." + zzzda, str2);
            }
            return;
        }
        throw new IllegalStateException(androidx.core.database.OooO00o.OooO00o("primary key (", str, ".", str2, ") not found"));
    }

    public final void zzZ(zzZDA zzzda, zzYQO zzyqo) {
        this.zzVV3.put(zzzda, zzyqo);
    }
}
