package oO0000O;

import java.security.InvalidAlgorithmParameterException;
import java.security.KeyPair;
import java.security.KeyPairGeneratorSpi;
import java.security.SecureRandom;
import java.security.spec.AlgorithmParameterSpec;
import java.util.LinkedHashMap;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.Callable;
import oO00000.C31906OooO0Oo;
import oO00000o.C31909OooO0o0;
import oO00000o.OooO0OO;

/* JADX INFO: renamed from: oO0000O.OooO0oO, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public abstract class AbstractC31914OooO0oO extends KeyPairGeneratorSpi {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final oO00000.OooO00o<oO00000.OooO00o<C31906OooO0Oo<C31909OooO0o0, Exception>>> f113803OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public oO0000O.OooO00o f113804OooO0O0;

    /* JADX INFO: renamed from: oO0000O.OooO0oO$OooO00o */
    public static class OooO00o extends AbstractC31914OooO0oO {
        public OooO00o() {
            throw null;
        }
    }

    /* JADX INFO: renamed from: oO0000O.OooO0oO$OooO0O0 */
    public static class OooO0O0 extends AbstractC31914OooO0oO {
        public OooO0O0() {
            throw null;
        }
    }

    public AbstractC31914OooO0oO(oO00000.OooO00o<oO00000.OooO00o<C31906OooO0Oo<C31909OooO0o0, Exception>>> oooO00o, OooO0OO.OooO00o oooO00o2) {
        this.f113803OooO00o = oooO00o;
    }

    @Override // java.security.KeyPairGeneratorSpi
    public final KeyPair generateKeyPair() {
        if (this.f113804OooO0O0 == null) {
            throw new IllegalStateException("KeyPairGenerator not initialized!");
        }
        try {
            final ArrayBlockingQueue arrayBlockingQueue = new ArrayBlockingQueue(1);
            this.f113803OooO00o.invoke(new oO00000.OooO00o() { // from class: oO0000O.OooO0o0
                @Override // oO00000.OooO00o
                public final void invoke(Object obj) {
                    final C31906OooO0Oo c31906OooO0Oo = (C31906OooO0Oo) obj;
                    final AbstractC31914OooO0oO abstractC31914OooO0oO = this.f113801OooO00o;
                    arrayBlockingQueue.add(C31906OooO0Oo.OooO0OO(new Callable() { // from class: oO0000O.OooO0o
                        @Override // java.util.concurrent.Callable
                        public final Object call() {
                            AbstractC31914OooO0oO abstractC31914OooO0oO2 = abstractC31914OooO0oO;
                            C31909OooO0o0 c31909OooO0o0 = (C31909OooO0o0) c31906OooO0Oo.OooO0O0();
                            abstractC31914OooO0oO2.f113804OooO0O0.getClass();
                            abstractC31914OooO0oO2.f113804OooO0O0.getClass();
                            abstractC31914OooO0oO2.f113804OooO0O0.getClass();
                            abstractC31914OooO0oO2.f113804OooO0O0.getClass();
                            c31909OooO0o0.OooOOO0(null, null, null, true);
                            new LinkedHashMap();
                            throw null;
                        }
                    }));
                }
            });
            return (KeyPair) ((C31906OooO0Oo) arrayBlockingQueue.take()).OooO0O0();
        } catch (Exception e) {
            throw new IllegalStateException("An error occurred when generating the key pair", e);
        }
    }

    @Override // java.security.KeyPairGeneratorSpi
    public final void initialize(AlgorithmParameterSpec algorithmParameterSpec, SecureRandom secureRandom) throws InvalidAlgorithmParameterException {
        if (!(algorithmParameterSpec instanceof oO0000O.OooO00o)) {
            throw new InvalidAlgorithmParameterException("Must be instance of PivAlgorithmParameterSpec");
        }
        oO0000O.OooO00o oooO00o = (oO0000O.OooO00o) algorithmParameterSpec;
        this.f113804OooO0O0 = oooO00o;
        oooO00o.getClass();
        throw null;
    }

    @Override // java.security.KeyPairGeneratorSpi
    public final void initialize(int i, SecureRandom secureRandom) {
        throw new IllegalArgumentException("Initialize with PivAlgorithmParameterSpec!");
    }
}
