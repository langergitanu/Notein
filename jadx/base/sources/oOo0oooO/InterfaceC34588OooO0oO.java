package oOo0oooO;

import java.util.Iterator;
import oO0OooO0.C33477OooO0OO;
import oOo000Oo.C34435OooOoO0;

/* JADX INFO: renamed from: oOo0oooO.OooO0oO, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public interface InterfaceC34588OooO0oO extends Iterable<OooO0OO>, oO0O00.OooO00o {

    /* JADX INFO: renamed from: oOo0oooO.OooO0oO$OooO00o */
    public static final class OooO00o {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public static final C20364OooO00o f123919OooO00o = new C20364OooO00o();

        /* JADX INFO: renamed from: oOo0oooO.OooO0oO$OooO00o$OooO00o, reason: collision with other inner class name */
        public static final class C20364OooO00o implements InterfaceC34588OooO0oO {
            @Override // oOo0oooO.InterfaceC34588OooO0oO
            public final OooO0OO OooOOO0(C33477OooO0OO fqName) {
                kotlin.jvm.internal.OooOOO0.OooO0oO(fqName, "fqName");
                return null;
            }

            @Override // oOo0oooO.InterfaceC34588OooO0oO
            public final boolean Oooo000(C33477OooO0OO c33477OooO0OO) {
                return OooO0O0.OooO0O0(this, c33477OooO0OO);
            }

            @Override // oOo0oooO.InterfaceC34588OooO0oO
            public final boolean isEmpty() {
                return true;
            }

            @Override // java.lang.Iterable
            public final Iterator<OooO0OO> iterator() {
                return C34435OooOoO0.f123454OooOo0o;
            }

            public final String toString() {
                return "EMPTY";
            }
        }
    }

    /* JADX INFO: renamed from: oOo0oooO.OooO0oO$OooO0O0 */
    public static final class OooO0O0 {
        public static OooO0OO OooO00o(InterfaceC34588OooO0oO interfaceC34588OooO0oO, C33477OooO0OO fqName) {
            OooO0OO next;
            kotlin.jvm.internal.OooOOO0.OooO0oO(fqName, "fqName");
            Iterator<OooO0OO> it = interfaceC34588OooO0oO.iterator();
            while (true) {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
                if (kotlin.jvm.internal.OooOOO0.OooO0O0(next.OooO0OO(), fqName)) {
                    break;
                }
            }
            return next;
        }

        public static boolean OooO0O0(InterfaceC34588OooO0oO interfaceC34588OooO0oO, C33477OooO0OO fqName) {
            kotlin.jvm.internal.OooOOO0.OooO0oO(fqName, "fqName");
            return interfaceC34588OooO0oO.OooOOO0(fqName) != null;
        }
    }

    OooO0OO OooOOO0(C33477OooO0OO c33477OooO0OO);

    boolean Oooo000(C33477OooO0OO c33477OooO0OO);

    boolean isEmpty();
}
