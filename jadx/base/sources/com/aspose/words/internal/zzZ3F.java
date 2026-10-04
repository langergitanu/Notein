package com.aspose.words.internal;

import java.lang.ref.WeakReference;
import java.math.BigInteger;
import java.util.HashSet;
import java.util.Set;
import java.util.WeakHashMap;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes5.dex */
public abstract class zzZ3F implements zzZ5V {
    private static WeakHashMap<BigInteger, WeakReference<zzZ>> zzWl4;
    private static final Set<zzZDA> zzWl7;
    protected static final zzZ86 zzWl8;
    protected final zzZ86 zzWl5;
    private final zzZ zzWl6;
    private final boolean zzWlB;
    private zzZ5W zzWlz;
    private BigInteger zzWwf;

    public enum zzY {
        SIGN_OR_VERIFY,
        ENCRYPT_OR_DECRYPT
    }

    public static class zzZ {
        private final AtomicReference<zzY> zzWl3 = new AtomicReference<>(null);
        private final BigInteger zzWwf;

        public zzZ(BigInteger bigInteger) {
            this.zzWwf = bigInteger;
        }

        public final boolean zzZ(zzY zzy) {
            AtomicReference<zzY> atomicReference = this.zzWl3;
            while (!atomicReference.compareAndSet(null, zzy)) {
                if (atomicReference.get() != null) {
                    if (this.zzWl3.get().equals(zzy)) {
                        return true;
                    }
                    AtomicReference<zzY> atomicReference2 = this.zzWl3;
                    zzY zzy2 = zzY.SIGN_OR_VERIFY;
                    while (!atomicReference2.compareAndSet(zzy2, zzy)) {
                        if (atomicReference2.get() != zzy2) {
                            return false;
                        }
                    }
                    return true;
                }
            }
            return true;
        }
    }

    static {
        zzZDA zzzda = zzZ96.zzWyA;
        zzWl8 = new zzZ86(zzzda, zzZC8.zzWHS);
        HashSet hashSet = new HashSet(4);
        zzWl7 = hashSet;
        hashSet.add(zzzda);
        hashSet.add(zzZ79.zzWpc);
        hashSet.add(zzZ96.zzWyv);
        hashSet.add(zzZ96.zzWys);
        hashSet.add(zzZ96.zzWxq);
        zzWl4 = new WeakHashMap<>();
    }

    public zzZ3F(zzZ5W zzz5w, BigInteger bigInteger) {
        this.zzWlB = zzZ5L.zzXH0();
        this.zzWlz = zzz5w;
        zzZ zzzZzX = zzX(bigInteger);
        this.zzWl6 = zzzZzX;
        this.zzWwf = zzzZzX.zzWwf;
        this.zzWl5 = zzWl8;
    }

    private static synchronized zzZ zzX(BigInteger bigInteger) {
        WeakReference<zzZ> weakReference = zzWl4.get(bigInteger);
        zzZ zzz = weakReference != null ? weakReference.get() : null;
        if (zzz != null) {
            return zzz;
        }
        zzZ zzz2 = new zzZ(bigInteger);
        zzWl4.put(bigInteger, new WeakReference<>(zzz2));
        return zzz2;
    }

    public static synchronized boolean zzY(BigInteger bigInteger) {
        return zzWl4.containsKey(bigInteger);
    }

    public BigInteger getModulus() {
        return this.zzWwf;
    }

    public final void zzXGE() {
        if (this.zzWlB != zzZ5L.zzXH0()) {
            throw new zzZ0H("No access to key in current thread.");
        }
    }

    public final void zzXGG() {
        this.zzWlz = null;
        this.zzWwf = null;
    }

    @Override // com.aspose.words.internal.zzZ58
    public zzZ5W zzXGV() {
        return this.zzWlz;
    }

    public final boolean zzZ(zzY zzy) {
        return zzYGM.zzwd("org.bouncycastle.rsa.allow_multi_use") || this.zzWl6.zzZ(zzy);
    }

    public zzZ3F(zzZ5W zzz5w, zzZ86 zzz86, BigInteger bigInteger) {
        zzZDA zzzdaZzXJk = zzz86.zzXJk();
        if (zzWl7.contains(zzzdaZzXJk)) {
            this.zzWlB = zzZ5L.zzXH0();
            this.zzWlz = zzz5w;
            this.zzWl5 = zzz86;
            zzZ zzzZzX = zzX(bigInteger);
            this.zzWl6 = zzzZzX;
            this.zzWwf = zzzZzX.zzWwf;
            if (zzzdaZzXJk.equals(zzZ96.zzWys)) {
                zzzZzX.zzZ(zzY.SIGN_OR_VERIFY);
                return;
            } else {
                if (zzzdaZzXJk.equals(zzZ96.zzWyv)) {
                    zzzZzX.zzZ(zzY.ENCRYPT_OR_DECRYPT);
                    return;
                }
                return;
            }
        }
        throw new IllegalArgumentException("Unknown algorithm type: " + zzzdaZzXJk);
    }
}
