package o00OooOo;

import com.microsoft.identity.common.java.crypto.key.KeyUtil;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import o00Ooo0o.InterfaceC25116OooO0o;
import o00o0O0.C25316OooOO0o;
import o00o0O0.OooO;
import o00o0O0O.AbstractC25326OooO0Oo;
import o00o0O0O.C25321OooO00o;

/* JADX INFO: renamed from: o00OooOo.OooO0oo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C25168OooO0oo {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final OooO<InterfaceC25116OooO0o, String> f85678OooO00o = new OooO<>(1000);

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final C25321OooO00o.OooO0OO f85679OooO0O0 = C25321OooO00o.OooO00o(10, new OooO00o());

    /* JADX INFO: renamed from: o00OooOo.OooO0oo$OooO00o */
    public class OooO00o implements C25321OooO00o.OooO0O0<OooO0O0> {
        @Override // o00o0O0O.C25321OooO00o.OooO0O0
        public final OooO0O0 create() {
            try {
                return new OooO0O0(MessageDigest.getInstance(KeyUtil.HMAC_KEY_HASH_ALGORITHM));
            } catch (NoSuchAlgorithmException e) {
                throw new RuntimeException(e);
            }
        }
    }

    /* JADX INFO: renamed from: o00OooOo.OooO0oo$OooO0O0 */
    public static final class OooO0O0 implements C25321OooO00o.InterfaceC25322OooO0Oo {

        /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
        public final AbstractC25326OooO0Oo.OooO00o f85680OooOo = new AbstractC25326OooO0Oo.OooO00o();

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public final MessageDigest f85681OooOo0o;

        public OooO0O0(MessageDigest messageDigest) {
            this.f85681OooOo0o = messageDigest;
        }

        @Override // o00o0O0O.C25321OooO00o.InterfaceC25322OooO0Oo
        public final AbstractC25326OooO0Oo.OooO00o OooO0O0() {
            return this.f85680OooOo;
        }
    }

    public final String OooO00o(InterfaceC25116OooO0o interfaceC25116OooO0o) {
        String strOooO00o;
        synchronized (this.f85678OooO00o) {
            strOooO00o = this.f85678OooO00o.OooO00o(interfaceC25116OooO0o);
        }
        if (strOooO00o == null) {
            OooO0O0 oooO0O0 = (OooO0O0) this.f85679OooO0O0.acquire();
            try {
                interfaceC25116OooO0o.OooO00o(oooO0O0.f85681OooOo0o);
                byte[] bArrDigest = oooO0O0.f85681OooOo0o.digest();
                char[] cArr = C25316OooOO0o.f86160OooO0O0;
                synchronized (cArr) {
                    for (int i = 0; i < bArrDigest.length; i++) {
                        byte b = bArrDigest[i];
                        int i2 = i * 2;
                        char[] cArr2 = C25316OooOO0o.f86159OooO00o;
                        cArr[i2] = cArr2[(b & 255) >>> 4];
                        cArr[i2 + 1] = cArr2[b & 15];
                    }
                    strOooO00o = new String(cArr);
                }
            } finally {
                this.f85679OooO0O0.release(oooO0O0);
            }
        }
        synchronized (this.f85678OooO00o) {
            this.f85678OooO00o.OooO0Oo(interfaceC25116OooO0o, strOooO00o);
        }
        return strOooO00o;
    }
}
