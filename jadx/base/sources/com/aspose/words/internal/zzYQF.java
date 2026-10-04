package com.aspose.words.internal;

import java.security.AccessController;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidParameterException;
import java.security.PrivilegedAction;
import java.security.SecureRandom;
import java.security.spec.AlgorithmParameterSpec;
import javax.crypto.KeyGeneratorSpi;
import javax.crypto.SecretKey;

/* JADX INFO: loaded from: classes5.dex */
final class zzYQF extends KeyGeneratorSpi {
    private zzZ45 zzVVK;
    private final boolean zzVVL;
    private final int zzVVM;
    private final zzYPL zzVVN;
    private final zzYQ8 zzVWk;
    private final String zzVZp;

    public zzYQF(zzYQ8 zzyq8, String str, int i, zzYPL zzypl) {
        this(zzyq8, str, i, false, zzypl);
    }

    @Override // javax.crypto.KeyGeneratorSpi
    public final SecretKey engineGenerateKey() {
        if (this.zzVVK == null) {
            this.zzVVK = this.zzVVN.zzX(this.zzVVM, this.zzVWk.zzXBp());
        }
        final zzZ46 zzz46ZzXGH = this.zzVVK.zzXGH();
        return (SecretKey) AccessController.doPrivileged(new PrivilegedAction<SecretKey>() { // from class: com.aspose.words.internal.zzYQF.1
            /* JADX INFO: Access modifiers changed from: private */
            @Override // java.security.PrivilegedAction
            /* JADX INFO: renamed from: zzXBB, reason: merged with bridge method [inline-methods] */
            public SecretKey run() {
                return new zzYNP(new zzYUD(zzz46ZzXGH.zzXGV(), zzz46ZzXGH.zzXK4()), zzYQF.this.zzVZp);
            }
        });
    }

    @Override // javax.crypto.KeyGeneratorSpi
    public final void engineInit(AlgorithmParameterSpec algorithmParameterSpec, SecureRandom secureRandom) throws InvalidAlgorithmParameterException {
        throw new InvalidAlgorithmParameterException("No AlgorithmParameterSpec are supported");
    }

    public zzYQF(zzYQ8 zzyq8, String str, int i, boolean z, zzYPL zzypl) {
        this.zzVWk = zzyq8;
        this.zzVZp = str;
        this.zzVVM = i;
        this.zzVVN = zzypl;
        this.zzVVL = z;
    }

    @Override // javax.crypto.KeyGeneratorSpi
    public final void engineInit(SecureRandom secureRandom) {
        if (secureRandom != null) {
            this.zzVVK = this.zzVVN.zzX(this.zzVVM, secureRandom);
        }
    }

    @Override // javax.crypto.KeyGeneratorSpi
    public final void engineInit(int i, SecureRandom secureRandom) {
        if (this.zzVVL && i != this.zzVVM) {
            throw new InvalidParameterException("Attempt to change keysize for fixed size key generator");
        }
        if (secureRandom == null) {
            try {
                secureRandom = this.zzVWk.zzXBp();
            } catch (IllegalArgumentException e) {
                throw new InvalidParameterException(e.getMessage());
            }
        }
        this.zzVVK = this.zzVVN.zzX(i, secureRandom);
    }
}
