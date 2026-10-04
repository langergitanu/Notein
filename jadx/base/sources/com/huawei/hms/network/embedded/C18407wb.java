package com.huawei.hms.network.embedded;

import com.microsoft.identity.common.java.crypto.IDevicePopManager;
import com.microsoft.identity.common.java.crypto.key.KeyUtil;
import java.io.IOException;
import java.security.InvalidKeyException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;

/* JADX INFO: renamed from: com.huawei.hms.network.embedded.wb */
/* JADX INFO: loaded from: classes9.dex */
public final class C18407wb extends AbstractC18342rb {

    /* JADX INFO: renamed from: b */
    public final MessageDigest f56552b;

    /* JADX INFO: renamed from: c */
    public final Mac f56553c;

    public C18407wb(InterfaceC18234jc interfaceC18234jc, C18303ob c18303ob, String str) {
        super(interfaceC18234jc);
        try {
            Mac mac = Mac.getInstance(str);
            this.f56553c = mac;
            mac.init(new SecretKeySpec(c18303ob.mo78739m(), str));
            this.f56552b = null;
        } catch (InvalidKeyException e) {
            throw new IllegalArgumentException(e);
        } catch (NoSuchAlgorithmException unused) {
            throw new AssertionError();
        }
    }

    /* JADX INFO: renamed from: a */
    public static C18407wb m79850a(InterfaceC18234jc interfaceC18234jc) {
        return new C18407wb(interfaceC18234jc, "MD5");
    }

    /* JADX INFO: renamed from: b */
    public static C18407wb m79852b(InterfaceC18234jc interfaceC18234jc) {
        return new C18407wb(interfaceC18234jc, IDevicePopManager.SHA_1);
    }

    @Override // com.huawei.hms.network.embedded.AbstractC18342rb, com.huawei.hms.network.embedded.InterfaceC18234jc
    /* JADX INFO: renamed from: c */
    public long mo77914c(C18261lb c18261lb, long j) throws IOException {
        long jMo77914c = super.mo77914c(c18261lb, j);
        if (jMo77914c != -1) {
            long j2 = c18261lb.f55631b;
            long j3 = j2 - jMo77914c;
            C18178fc c18178fc = c18261lb.f55630a;
            while (j2 > j3) {
                c18178fc = c18178fc.f54871g;
                j2 -= (long) (c18178fc.f54867c - c18178fc.f54866b);
            }
            while (j2 < c18261lb.f55631b) {
                int i = (int) ((((long) c18178fc.f54866b) + j3) - j2);
                MessageDigest messageDigest = this.f56552b;
                if (messageDigest != null) {
                    messageDigest.update(c18178fc.f54865a, i, c18178fc.f54867c - i);
                } else {
                    this.f56553c.update(c18178fc.f54865a, i, c18178fc.f54867c - i);
                }
                j3 = ((long) (c18178fc.f54867c - c18178fc.f54866b)) + j2;
                c18178fc = c18178fc.f54870f;
                j2 = j3;
            }
        }
        return jMo77914c;
    }

    /* JADX INFO: renamed from: h */
    public final C18303ob m79855h() {
        MessageDigest messageDigest = this.f56552b;
        return C18303ob.m79300e(messageDigest != null ? messageDigest.digest() : this.f56553c.doFinal());
    }

    public C18407wb(InterfaceC18234jc interfaceC18234jc, String str) {
        super(interfaceC18234jc);
        try {
            this.f56552b = MessageDigest.getInstance(str);
            this.f56553c = null;
        } catch (NoSuchAlgorithmException unused) {
            throw new AssertionError();
        }
    }

    /* JADX INFO: renamed from: a */
    public static C18407wb m79851a(InterfaceC18234jc interfaceC18234jc, C18303ob c18303ob) {
        return new C18407wb(interfaceC18234jc, c18303ob, "HmacSHA1");
    }

    /* JADX INFO: renamed from: b */
    public static C18407wb m79853b(InterfaceC18234jc interfaceC18234jc, C18303ob c18303ob) {
        return new C18407wb(interfaceC18234jc, c18303ob, KeyUtil.HMAC_ALGORITHM);
    }

    /* JADX INFO: renamed from: c */
    public static C18407wb m79854c(InterfaceC18234jc interfaceC18234jc) {
        return new C18407wb(interfaceC18234jc, KeyUtil.HMAC_KEY_HASH_ALGORITHM);
    }
}
