package oOO000oO;

import java.security.AccessControlException;
import java.security.AccessController;
import java.security.PrivilegedAction;
import java.security.Security;
import java.util.Map;

/* JADX INFO: renamed from: oOO000oO.OooO0Oo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C34335OooO0Oo {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public static final ThreadLocal f123263OooO00o = new ThreadLocal();

    /* JADX INFO: renamed from: oOO000oO.OooO0Oo$OooO00o */
    public static class OooO00o implements PrivilegedAction {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final /* synthetic */ String f123264OooO00o;

        public OooO00o(String str) {
            this.f123264OooO00o = str;
        }

        @Override // java.security.PrivilegedAction
        public final Object run() {
            return Security.getProperty(this.f123264OooO00o);
        }
    }

    /* JADX INFO: renamed from: oOO000oO.OooO0Oo$OooO0O0 */
    public static class OooO0O0 implements PrivilegedAction {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final /* synthetic */ String f123265OooO00o;

        public OooO0O0(String str) {
            this.f123265OooO00o = str;
        }

        @Override // java.security.PrivilegedAction
        public final Object run() {
            return System.getProperty(this.f123265OooO00o);
        }
    }

    public static String OooO00o(String str) {
        String str2;
        String str3 = (String) AccessController.doPrivileged(new OooO00o(str));
        if (str3 != null) {
            return str3;
        }
        Map map = (Map) f123263OooO00o.get();
        return (map == null || (str2 = (String) map.get(str)) == null) ? (String) AccessController.doPrivileged(new OooO0O0(str)) : str2;
    }

    public static boolean OooO0O0(String str) {
        try {
            String strOooO00o = OooO00o(str);
            if (strOooO00o != null && strOooO00o.length() == 4 && ((strOooO00o.charAt(0) == 't' || strOooO00o.charAt(0) == 'T') && ((strOooO00o.charAt(1) == 'r' || strOooO00o.charAt(1) == 'R') && (strOooO00o.charAt(2) == 'u' || strOooO00o.charAt(2) == 'U')))) {
                if (strOooO00o.charAt(3) != 'e') {
                    if (strOooO00o.charAt(3) == 'E') {
                    }
                }
                return true;
            }
        } catch (AccessControlException unused) {
        }
        return false;
    }
}
