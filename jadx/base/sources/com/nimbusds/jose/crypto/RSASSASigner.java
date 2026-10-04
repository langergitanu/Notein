package com.nimbusds.jose.crypto;

import com.microsoft.identity.common.java.platform.AbstractDevicePopManager;
import com.nimbusds.jose.ActionRequiredForJWSCompletionException;
import com.nimbusds.jose.CompletableJWSObjectSigning;
import com.nimbusds.jose.JOSEException;
import com.nimbusds.jose.JWSHeader;
import com.nimbusds.jose.JWSSigner;
import com.nimbusds.jose.JWSSignerOption;
import com.nimbusds.jose.crypto.impl.RSAKeyUtils;
import com.nimbusds.jose.crypto.impl.RSASSA;
import com.nimbusds.jose.crypto.impl.RSASSAProvider;
import com.nimbusds.jose.crypto.opts.AllowWeakRSAKey;
import com.nimbusds.jose.crypto.opts.OptionUtils;
import com.nimbusds.jose.crypto.opts.UserAuthenticationRequired;
import com.nimbusds.jose.jwk.RSAKey;
import com.nimbusds.jose.util.Base64URL;
import java.security.InvalidKeyException;
import java.security.PrivateKey;
import java.security.Signature;
import java.security.SignatureException;
import java.util.Collections;
import java.util.Set;

/* JADX INFO: loaded from: classes9.dex */
public class RSASSASigner extends RSASSAProvider implements JWSSigner {
    private final Set<JWSSignerOption> opts;
    private final PrivateKey privateKey;

    public RSASSASigner(PrivateKey privateKey) {
        this(privateKey, false);
    }

    private Signature getInitiatedSignature(JWSHeader jWSHeader) throws JOSEException {
        Signature signerAndVerifier = RSASSA.getSignerAndVerifier(jWSHeader.getAlgorithm(), getJCAContext().getProvider());
        try {
            signerAndVerifier.initSign(this.privateKey);
            return signerAndVerifier;
        } catch (InvalidKeyException e) {
            throw new JOSEException("Invalid private RSA key: " + e.getMessage(), e);
        }
    }

    public PrivateKey getPrivateKey() {
        return this.privateKey;
    }

    @Override // com.nimbusds.jose.JWSSigner
    public Base64URL sign(JWSHeader jWSHeader, final byte[] bArr) throws JOSEException {
        final Signature initiatedSignature = getInitiatedSignature(jWSHeader);
        if (OptionUtils.optionIsPresent(this.opts, UserAuthenticationRequired.class)) {
            throw new ActionRequiredForJWSCompletionException("Authenticate user to complete signing", UserAuthenticationRequired.getInstance(), new CompletableJWSObjectSigning() { // from class: com.nimbusds.jose.crypto.RSASSASigner.1
                @Override // com.nimbusds.jose.CompletableJWSObjectSigning
                public Base64URL complete() throws JOSEException {
                    return RSASSASigner.this.sign(bArr, initiatedSignature);
                }
            });
        }
        return sign(bArr, initiatedSignature);
    }

    @Deprecated
    public RSASSASigner(PrivateKey privateKey, boolean z) {
        this(privateKey, (Set<JWSSignerOption>) (z ? Collections.singleton(AllowWeakRSAKey.getInstance()) : Collections.EMPTY_SET));
    }

    public RSASSASigner(PrivateKey privateKey, Set<JWSSignerOption> set) {
        int iKeyBitLength;
        if (AbstractDevicePopManager.KeyPairGeneratorAlgorithms.RSA.equalsIgnoreCase(privateKey.getAlgorithm())) {
            this.privateKey = privateKey;
            set = set == null ? Collections.EMPTY_SET : set;
            this.opts = set;
            if (!OptionUtils.optionIsPresent(set, AllowWeakRSAKey.class) && (iKeyBitLength = RSAKeyUtils.keyBitLength(privateKey)) > 0 && iKeyBitLength < 2048) {
                throw new IllegalArgumentException("The RSA key size must be at least 2048 bits");
            }
            return;
        }
        throw new IllegalArgumentException("The private key algorithm must be RSA");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Base64URL sign(byte[] bArr, Signature signature) throws JOSEException {
        try {
            signature.update(bArr);
            return Base64URL.encode(signature.sign());
        } catch (SignatureException e) {
            throw new JOSEException("RSA signature exception: " + e.getMessage(), e);
        }
    }

    public RSASSASigner(RSAKey rSAKey) throws JOSEException {
        this(RSAKeyUtils.toRSAPrivateKey(rSAKey));
    }

    @Deprecated
    public RSASSASigner(RSAKey rSAKey, boolean z) throws JOSEException {
        this(RSAKeyUtils.toRSAPrivateKey(rSAKey), z);
    }
}
