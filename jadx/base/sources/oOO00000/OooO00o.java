package oOO00000;

import java.security.AccessController;
import java.security.PrivilegedAction;
import java.security.Provider;
import java.util.HashMap;
import oO0oo0o.AbstractC34247OooO00o;

/* JADX INFO: loaded from: classes10.dex */
public final class OooO00o extends Provider {

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public static final String[] f123200OooOo0o;

    /* JADX INFO: renamed from: oOO00000.OooO00o$OooO00o, reason: collision with other inner class name */
    public class C20350OooO00o implements PrivilegedAction {
        @Override // java.security.PrivilegedAction
        public final Object run() {
            int i = 0;
            while (true) {
                String[] strArr = OooO00o.f123200OooOo0o;
                Class<?> clsLoadClass = null;
                if (i == strArr.length) {
                    return null;
                }
                String strOooO0OO = androidx.concurrent.futures.OooO00o.OooO0OO(new StringBuilder("org.bouncycastle.pqc.jcajce.provider."), strArr[i], "$Mappings");
                try {
                    ClassLoader classLoader = OooO00o.class.getClassLoader();
                    clsLoadClass = classLoader != null ? classLoader.loadClass(strOooO0OO) : (Class) AccessController.doPrivileged(new OooO0O0(strOooO0OO));
                } catch (ClassNotFoundException unused) {
                }
                if (clsLoadClass != null) {
                    try {
                        ((AbstractC34247OooO00o) clsLoadClass.newInstance()).OooO00o();
                    } catch (Exception e) {
                        throw new InternalError("cannot create instance of org.bouncycastle.pqc.jcajce.provider." + strArr[i] + "$Mappings : " + e);
                    }
                }
                i++;
            }
        }
    }

    static {
        new HashMap();
        f123200OooOo0o = new String[]{"Rainbow", "McEliece", "SPHINCS", "LMS", "NH", "XMSS", "QTESLA"};
    }

    public OooO00o() {
        super("BCPQC", 1.7d, "BouncyCastle Post-Quantum Security Provider v1.70");
        AccessController.doPrivileged(new C20350OooO00o());
    }
}
