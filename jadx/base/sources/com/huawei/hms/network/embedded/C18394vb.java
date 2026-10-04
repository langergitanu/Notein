package com.huawei.hms.network.embedded;

import com.microsoft.identity.common.java.crypto.IDevicePopManager;
import com.microsoft.identity.common.java.crypto.key.KeyUtil;
import java.io.IOException;
import java.security.InvalidKeyException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;

/* JADX INFO: renamed from: com.huawei.hms.network.embedded.vb */
/* JADX INFO: loaded from: classes9.dex */
public final class C18394vb extends AbstractC18329qb {

    /* JADX INFO: renamed from: b */
    public final MessageDigest f56491b;

    /* JADX INFO: renamed from: c */
    public final Mac f56492c;

    public C18394vb(InterfaceC18220ic interfaceC18220ic, C18303ob c18303ob, String str) {
        super(interfaceC18220ic);
        try {
            Mac mac = Mac.getInstance(str);
            this.f56492c = mac;
            mac.init(new SecretKeySpec(c18303ob.mo78739m(), str));
            this.f56491b = null;
        } catch (InvalidKeyException e) {
            throw new IllegalArgumentException(e);
        } catch (NoSuchAlgorithmException unused) {
            throw new AssertionError();
        }
    }

    /* JADX INFO: renamed from: a */
    public static C18394vb m79793a(InterfaceC18220ic interfaceC18220ic) {
        return new C18394vb(interfaceC18220ic, "MD5");
    }

    /* JADX INFO: renamed from: b */
    public static C18394vb m79795b(InterfaceC18220ic interfaceC18220ic) {
        return new C18394vb(interfaceC18220ic, IDevicePopManager.SHA_1);
    }

    /* JADX INFO: renamed from: d */
    public static C18394vb m79799d(InterfaceC18220ic interfaceC18220ic) {
        return new C18394vb(interfaceC18220ic, "SHA-512");
    }

    /* JADX INFO: renamed from: c */
    public final C18303ob m79800c() {
        MessageDigest messageDigest = this.f56491b;
        return C18303ob.m79300e(messageDigest != null ? messageDigest.digest() : this.f56492c.doFinal());
    }

    public C18394vb(InterfaceC18220ic interfaceC18220ic, String str) {
        super(interfaceC18220ic);
        try {
            this.f56491b = MessageDigest.getInstance(str);
            this.f56492c = null;
        } catch (NoSuchAlgorithmException unused) {
            throw new AssertionError();
        }
    }

    /* JADX INFO: renamed from: a */
    public static C18394vb m79794a(InterfaceC18220ic interfaceC18220ic, C18303ob c18303ob) {
        return new C18394vb(interfaceC18220ic, c18303ob, "HmacSHA1");
    }

    /* JADX INFO: renamed from: b */
    public static C18394vb m79796b(InterfaceC18220ic interfaceC18220ic, C18303ob c18303ob) {
        return new C18394vb(interfaceC18220ic, c18303ob, KeyUtil.HMAC_ALGORITHM);
    }

    /* JADX INFO: renamed from: c */
    public static C18394vb m79797c(InterfaceC18220ic interfaceC18220ic) {
        return new C18394vb(interfaceC18220ic, KeyUtil.HMAC_KEY_HASH_ALGORITHM);
    }

    /* JADX INFO: renamed from: c */
    public static C18394vb m79798c(InterfaceC18220ic interfaceC18220ic, C18303ob c18303ob) {
        return new C18394vb(interfaceC18220ic, c18303ob, "HmacSHA512");
    }

    @Override // com.huawei.hms.network.embedded.AbstractC18329qb, com.huawei.hms.network.embedded.InterfaceC18220ic
    /* JADX INFO: renamed from: b */
    public void mo78029b(C18261lb c18261lb, long j) throws IOException {
        C18276mc.m79202a(c18261lb.f55631b, 0L, j);
        C18178fc c18178fc = c18261lb.f55630a;
        long j2 = 0;
        while (j2 < j) {
            int iMin = (int) Math.min(j - j2, c18178fc.f54867c - c18178fc.f54866b);
            MessageDigest messageDigest = this.f56491b;
            if (messageDigest != null) {
                messageDigest.update(c18178fc.f54865a, c18178fc.f54866b, iMin);
            } else {
                this.f56492c.update(c18178fc.f54865a, c18178fc.f54866b, iMin);
            }
            j2 += (long) iMin;
            c18178fc = c18178fc.f54870f;
        }
        super.mo78029b(c18261lb, j);
    }
}
