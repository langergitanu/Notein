package oO0000O;

import OooOoOO.C20519OooO0Oo;
import com.alibaba.sdk.android.oss.common.RequestParameters;
import com.microsoft.identity.common.java.crypto.IDevicePopManager;
import com.microsoft.identity.common.java.platform.AbstractDevicePopManager;
import java.security.KeyPairGenerator;
import java.security.NoSuchAlgorithmException;
import java.security.Provider;
import java.security.Security;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import javax.crypto.NoSuchPaddingException;
import oO00000.C31906OooO0Oo;
import oO00000o.C31909OooO0o0;
import oO00000o.OooO0OO;
import oO0000O.AbstractC31914OooO0oO;
import oO0000O.OooO0OO;
import oO0000O.OooOo;
import oOO00OOo.C34354OooO0Oo;
import oOO00OOo.InterfaceC34352OooO0O0;

/* JADX INFO: renamed from: oO0000O.OooOoO, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C31924OooOoO extends Provider {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final HashMap f113856OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final oO00000.OooO00o<oO00000.OooO00o<C31906OooO0Oo<C31909OooO0o0, Exception>>> f113857OooOo0o;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public static final Map<String, String> f113854OooOoO0 = Collections.singletonMap("SupportedKeyClasses", OooOo.OooO00o.class.getName());

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public static final Map<String, String> f113853OooOoO = Collections.singletonMap("SupportedKeyClasses", OooOo.OooO0O0.class.getName());

    /* JADX INFO: renamed from: OooOoOO, reason: collision with root package name */
    public static final InterfaceC34352OooO0O0 f113855OooOoOO = C34354OooO0Oo.OooO0O0(C31924OooOoO.class);

    /* JADX INFO: renamed from: oO0000O.OooOoO$OooO00o */
    public class OooO00o extends Provider.Service {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final /* synthetic */ oO00000.OooO00o f113858OooO00o;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO00o(C31924OooOoO c31924OooOoO, String str, Map map, oO00000.OooO00o oooO00o) {
            super(c31924OooOoO, RequestParameters.SIGNATURE, "NONEwithECDSA", str, null, map);
            this.f113858OooO00o = oooO00o;
        }

        @Override // java.security.Provider.Service
        public final Object newInstance(Object obj) {
            return new OooO0OO.OooO0O0(this.f113858OooO00o);
        }
    }

    /* JADX INFO: renamed from: oO0000O.OooOoO$OooO0O0 */
    public class OooO0O0 extends Provider.Service {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final /* synthetic */ oO00000.OooO00o f113859OooO00o;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO0O0(C31924OooOoO c31924OooOoO, String str, oO00000.OooO00o oooO00o) {
            super(c31924OooOoO, "KeyPairGenerator", "YKPivRSA", str, null, null);
            this.f113859OooO00o = oooO00o;
        }

        @Override // java.security.Provider.Service
        public final Object newInstance(Object obj) {
            return new AbstractC31914OooO0oO.OooO0O0(this.f113859OooO00o, OooO0OO.OooO00o.f113747OooOo0o);
        }
    }

    /* JADX INFO: renamed from: oO0000O.OooOoO$OooO0OO */
    public class OooO0OO extends Provider.Service {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final /* synthetic */ oO00000.OooO00o f113860OooO00o;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO0OO(C31924OooOoO c31924OooOoO, String str, oO00000.OooO00o oooO00o) {
            super(c31924OooOoO, "KeyPairGenerator", "YKPivEC", str, null, null);
            this.f113860OooO00o = oooO00o;
        }

        @Override // java.security.Provider.Service
        public final Object newInstance(Object obj) {
            return new AbstractC31914OooO0oO.OooO00o(this.f113860OooO00o, OooO0OO.OooO00o.f113746OooOo);
        }
    }

    /* JADX INFO: renamed from: oO0000O.OooOoO$OooO0Oo, reason: case insensitive filesystem */
    public class C31925OooO0Oo extends Provider.Service {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final /* synthetic */ oO00000.OooO00o f113861OooO00o;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C31925OooO0Oo(C31924OooOoO c31924OooOoO, String str, oO00000.OooO00o oooO00o) {
            super(c31924OooOoO, "KeyStore", "YKPiv", str, null, null);
            this.f113861OooO00o = oooO00o;
        }

        @Override // java.security.Provider.Service
        public final Object newInstance(Object obj) {
            return new C31920OooOOoo(this.f113861OooO00o);
        }
    }

    /* JADX INFO: renamed from: oO0000O.OooOoO$OooO0o */
    public class OooO0o extends Provider.Service {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final String f113862OooO00o;

        public OooO0o(String str, String str2, List<String> list) {
            super(C31924OooOoO.this, RequestParameters.SIGNATURE, str, OooO0OO.OooO00o.class.getName(), list, C31924OooOoO.f113854OooOoO0);
            this.f113862OooO00o = str2;
        }

        @Override // java.security.Provider.Service
        public final Object newInstance(Object obj) throws NoSuchAlgorithmException {
            return new OooO0OO.OooO00o(C31924OooOoO.this.f113857OooOo0o, this.f113862OooO00o);
        }
    }

    /* JADX INFO: renamed from: oO0000O.OooOoO$OooO0o0, reason: case insensitive filesystem */
    public class C31926OooO0o0 extends Provider.Service {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final /* synthetic */ oO00000.OooO00o f113864OooO00o;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C31926OooO0o0(C31924OooOoO c31924OooOoO, String str, Map map, oO00000.OooO00o oooO00o) {
            super(c31924OooOoO, "KeyAgreement", "ECDH", str, null, map);
            this.f113864OooO00o = oooO00o;
        }

        @Override // java.security.Provider.Service
        public final Object newInstance(Object obj) {
            return new C31912OooO0Oo(this.f113864OooO00o);
        }
    }

    /* JADX INFO: renamed from: oO0000O.OooOoO$OooO0oO, reason: case insensitive filesystem */
    public class C31927OooO0oO extends Provider.Service {
        public C31927OooO0oO() {
            super(C31924OooOoO.this, "Cipher", AbstractDevicePopManager.KeyPairGeneratorAlgorithms.RSA, oO0000O.OooO0O0.class.getName(), null, C31924OooOoO.f113853OooOoO);
        }

        @Override // java.security.Provider.Service
        public final Object newInstance(Object obj) throws NoSuchAlgorithmException {
            try {
                C31924OooOoO c31924OooOoO = C31924OooOoO.this;
                return new oO0000O.OooO0O0(c31924OooOoO.f113857OooOo0o, c31924OooOoO.f113856OooOo);
            } catch (NoSuchPaddingException e) {
                throw new NoSuchAlgorithmException(e);
            }
        }
    }

    /* JADX INFO: renamed from: oO0000O.OooOoO$OooO0oo, reason: case insensitive filesystem */
    public class C31928OooO0oo extends Provider.Service {
        public C31928OooO0oo(String str) {
            super(C31924OooOoO.this, RequestParameters.SIGNATURE, str, C31930OooOoOO.class.getName(), null, C31924OooOoO.f113853OooOoO);
        }

        @Override // java.security.Provider.Service
        public final Object newInstance(Object obj) throws NoSuchAlgorithmException {
            try {
                C31924OooOoO c31924OooOoO = C31924OooOoO.this;
                return new C31930OooOoOO(c31924OooOoO.f113857OooOo0o, c31924OooOoO.f113856OooOo, getAlgorithm());
            } catch (NoSuchPaddingException unused) {
                throw new NoSuchAlgorithmException("No underlying Provider supporting " + getAlgorithm() + " available.");
            }
        }
    }

    public C31924OooOoO(oO00000.OooO00o<oO00000.OooO00o<C31906OooO0Oo<C31909OooO0o0, Exception>>> oooO00o) {
        super("YKPiv", 1.0d, "JCA Provider for YubiKey PIV");
        this.f113856OooOo = new HashMap();
        this.f113857OooOo0o = oooO00o;
        InterfaceC34352OooO0O0 interfaceC34352OooO0O0 = f113855OooOoOO;
        Map<String, String> map = f113854OooOoO0;
        C20519OooO0Oo.OooO0Oo(4, interfaceC34352OooO0O0, "EC attributes: {}", map);
        C20519OooO0Oo.OooO0Oo(4, interfaceC34352OooO0O0, "RSA attributes: {}", f113853OooOoO);
        putService(new OooO00o(this, OooO0OO.OooO0O0.class.getName(), map, oooO00o));
        try {
            KeyPairGenerator keyPairGenerator = KeyPairGenerator.getInstance(AbstractDevicePopManager.KeyPairGeneratorAlgorithms.RSA);
            long jCurrentTimeMillis = System.currentTimeMillis();
            oO00000o.OooO0OO[] oooO0OOArr = {oO00000o.OooO0OO.RSA1024, oO00000o.OooO0OO.RSA2048};
            for (int i = 0; i < 2; i++) {
                oO00000o.OooO0OO oooO0OO = oooO0OOArr[i];
                keyPairGenerator.initialize(oooO0OO.f113744OooOo.f113752OooO0O0);
                this.f113856OooOo.put(oooO0OO, keyPairGenerator.generateKeyPair());
            }
            C20519OooO0Oo.OooO0Oo(4, interfaceC34352OooO0O0, "Time taken to generate dummy RSA keys: {}ms", Long.valueOf(System.currentTimeMillis() - jCurrentTimeMillis));
            putService(new C31927OooO0oO());
        } catch (NoSuchAlgorithmException e) {
            C20519OooO0Oo.OooO0Oo(1, interfaceC34352OooO0O0, "Unable to support RSA, no underlying Provider with RSA capability", e);
        }
        Set<String> algorithms = Security.getAlgorithms("MessageDigest");
        Iterator<String> it = Security.getAlgorithms(RequestParameters.SIGNATURE).iterator();
        while (it.hasNext()) {
            String upperCase = it.next().toUpperCase();
            if (upperCase.endsWith("WITHECDSA")) {
                String strOooO00o = androidx.core.content.OooO0OO.OooO00o(9, 0, upperCase);
                strOooO00o = algorithms.contains(strOooO00o) ? strOooO00o : strOooO00o.replace("SHA", "SHA-");
                if (algorithms.contains(strOooO00o)) {
                    putService(new OooO0o(upperCase, strOooO00o, null));
                }
            } else if (!this.f113856OooOo.isEmpty() && upperCase.endsWith("WITHRSA")) {
                putService(new C31928OooO0oo(upperCase));
            } else if (!this.f113856OooOo.isEmpty() && upperCase.endsWith("PSS")) {
                putService(new C31928OooO0oo(upperCase));
            } else if (upperCase.equals("ECDSA")) {
                putService(new OooO0o("ECDSA", IDevicePopManager.SHA_1, Collections.singletonList("SHA1withECDSA")));
            }
        }
        putService(new OooO0O0(this, AbstractC31914OooO0oO.OooO0O0.class.getName(), oooO00o));
        putService(new OooO0OO(this, AbstractC31914OooO0oO.OooO00o.class.getName(), oooO00o));
        putService(new C31925OooO0Oo(this, C31920OooOOoo.class.getName(), oooO00o));
        putService(new C31926OooO0o0(this, C31912OooO0Oo.class.getName(), map, oooO00o));
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x000f  */
    @Override // java.util.Hashtable, java.util.Map
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final synchronized boolean equals(Object obj) {
        boolean z;
        if (obj instanceof C31924OooOoO) {
            z = super.equals(obj);
        }
        return z;
    }

    @Override // java.util.Hashtable, java.util.Map
    public final synchronized int hashCode() {
        return super.hashCode();
    }
}
