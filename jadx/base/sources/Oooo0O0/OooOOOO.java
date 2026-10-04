package Oooo0O0;

import Oooo0.o000000;
import o00o00Oo.C25256OooO00o;
import oO0O000o.InterfaceC32507OooOO0o;
import oO0o0O0o.C33599OooOo0O;
import oo0o0Oo.C34680OooO0O0;
import oo0o0Oo.C34693OooOOOo;
import oo0o0Oo.C34695OooOOo0;
import oo0o0Oo.C34696OooOOoo;

/* JADX INFO: loaded from: classes.dex */
public interface OooOOOO {

    public static final class OooO00o {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public static final C18978OooO00o f60353OooO00o = new C18978OooO00o();

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public static final C20918OooO0o0 f60354OooO0O0 = new C20918OooO0o0();

        /* JADX INFO: renamed from: Oooo0O0.OooOOOO$OooO00o$OooO00o, reason: collision with other inner class name */
        public static final class C18978OooO00o implements OooOOOO {
            @Override // Oooo0O0.OooOOOO
            public final long OooO00o(C34695OooOOo0 c34695OooOOo0, long j, boolean z, C34696OooOOoo c34696OooOOoo) {
                if (!C34696OooOOoo.OooO0O0(j)) {
                    return j;
                }
                boolean zOooO0o0 = c34696OooOOoo != null ? C34696OooOOoo.OooO0o0(c34696OooOOoo.f124980OooO00o) : false;
                C34680OooO0O0 c34680OooO0O0 = c34695OooOOo0.f124972OooO00o.f124963OooO00o;
                return C20920OooOOo.OooO0OO(c34680OooO0O0.f124887OooOo0o, (int) (j >> 32), C33599OooOo0O.Oooo000(c34680OooO0O0), z, zOooO0o0);
            }
        }

        public static final class OooO0O0 implements OooOOOO {
            public static int OooO0O0(C34695OooOOo0 c34695OooOOo0, int i, int i2, int i3, boolean z, boolean z2) {
                long jOooOO0o = c34695OooOOo0.OooOO0o(i);
                int i4 = C34696OooOOoo.f124979OooO0OO;
                int iOooO0oo = (int) (jOooOO0o >> 32);
                if (c34695OooOOo0.OooO0o(iOooO0oo) != i2) {
                    iOooO0oo = c34695OooOOo0.OooO0oo(i2);
                }
                int iOooO0o0 = (int) (jOooOO0o & 4294967295L);
                if (c34695OooOOo0.OooO0o(iOooO0o0) != i2) {
                    iOooO0o0 = c34695OooOOo0.OooO0o0(i2, false);
                }
                if (iOooO0oo != i3) {
                    if (iOooO0o0 != i3) {
                        int i5 = (iOooO0oo + iOooO0o0) / 2;
                        if (!(z ^ z2) ? i < i5 : i <= i5) {
                        }
                    }
                    return iOooO0oo;
                }
                return iOooO0o0;
            }

            public static int OooO0OO(C34695OooOOo0 c34695OooOOo0, int i, int i2, int i3, boolean z, boolean z2) {
                if (i == -1) {
                    return i2;
                }
                int iOooO0o = c34695OooOOo0.OooO0o(i);
                if (iOooO0o != c34695OooOOo0.OooO0o(i2)) {
                    return OooO0O0(c34695OooOOo0, i, iOooO0o, i3, z, z2);
                }
                long jOooOO0o = c34695OooOOo0.OooOO0o(i2);
                int i4 = C34696OooOOoo.f124979OooO0OO;
                return (i2 == ((int) (jOooOO0o >> 32)) || i2 == ((int) (jOooOO0o & 4294967295L))) ? OooO0O0(c34695OooOOo0, i, iOooO0o, i3, z, z2) : i;
            }

            @Override // Oooo0O0.OooOOOO
            public final long OooO00o(C34695OooOOo0 c34695OooOOo0, long j, boolean z, C34696OooOOoo c34696OooOOoo) {
                int iOooO0OO;
                int iOooO0OO2;
                if (c34696OooOOoo == null) {
                    return OooO00o.OooO00o(c34695OooOOo0, j, new C20921OooOOo0(c34695OooOOo0));
                }
                boolean zOooO0O0 = C34696OooOOoo.OooO0O0(j);
                long j2 = c34696OooOOoo.f124980OooO00o;
                if (zOooO0O0) {
                    C34680OooO0O0 c34680OooO0O0 = c34695OooOOo0.f124972OooO00o.f124963OooO00o;
                    return C20920OooOOo.OooO0OO(c34680OooO0O0.f124887OooOo0o, (int) (j >> 32), C33599OooOo0O.Oooo000(c34680OooO0O0), z, C34696OooOOoo.OooO0o0(j2));
                }
                if (z) {
                    int i = (int) (4294967295L & j);
                    iOooO0OO2 = OooO0OO(c34695OooOOo0, (int) (j >> 32), (int) (j2 >> 32), i, true, C34696OooOOoo.OooO0o0(j));
                    iOooO0OO = i;
                } else {
                    int i2 = (int) (j >> 32);
                    iOooO0OO = OooO0OO(c34695OooOOo0, (int) (j & 4294967295L), (int) (4294967295L & j2), i2, false, C34696OooOOoo.OooO0o0(j));
                    iOooO0OO2 = i2;
                }
                return C25256OooO00o.OooO0OO(iOooO0OO2, iOooO0OO);
            }
        }

        public static final class OooO0OO implements OooOOOO {
            @Override // Oooo0O0.OooOOOO
            public final long OooO00o(C34695OooOOo0 c34695OooOOo0, long j, boolean z, C34696OooOOoo c34696OooOOoo) {
                return j;
            }
        }

        /* JADX INFO: renamed from: Oooo0O0.OooOOOO$OooO00o$OooO0Oo, reason: case insensitive filesystem */
        public static final class C20917OooO0Oo implements OooOOOO {
            @Override // Oooo0O0.OooOOOO
            public final long OooO00o(C34695OooOOo0 c34695OooOOo0, long j, boolean z, C34696OooOOoo c34696OooOOoo) {
                return OooO00o.OooO00o(c34695OooOOo0, j, new C20919OooOOOo(1, c34695OooOOo0.f124972OooO00o.f124963OooO00o, o000000.class, "getParagraphBoundary", "getParagraphBoundary(Ljava/lang/CharSequence;I)J", 1));
            }
        }

        /* JADX INFO: renamed from: Oooo0O0.OooOOOO$OooO00o$OooO0o0, reason: case insensitive filesystem */
        public static final class C20918OooO0o0 implements OooOOOO {
            @Override // Oooo0O0.OooOOOO
            public final long OooO00o(C34695OooOOo0 c34695OooOOo0, long j, boolean z, C34696OooOOoo c34696OooOOoo) {
                return OooO00o.OooO00o(c34695OooOOo0, j, new C20921OooOOo0(c34695OooOOo0));
            }
        }

        public static final long OooO00o(C34695OooOOo0 c34695OooOOo0, long j, InterfaceC32507OooOO0o interfaceC32507OooOO0o) {
            C34693OooOOOo c34693OooOOOo = c34695OooOOo0.f124972OooO00o;
            if (c34693OooOOOo.f124963OooO00o.f124887OooOo0o.length() == 0) {
                return C34696OooOOoo.f124978OooO0O0;
            }
            int iOooo000 = C33599OooOo0O.Oooo000(c34693OooOOOo.f124963OooO00o);
            int i = C34696OooOOoo.f124979OooO0OO;
            long j2 = ((C34696OooOOoo) interfaceC32507OooOO0o.invoke(Integer.valueOf(oO0O00oo.OooOO0.OooO0o((int) (j >> 32), 0, iOooo000)))).f124980OooO00o;
            long j3 = ((C34696OooOOoo) interfaceC32507OooOO0o.invoke(Integer.valueOf(oO0O00oo.OooOO0.OooO0o((int) (j & 4294967295L), 0, iOooo000)))).f124980OooO00o;
            return C25256OooO00o.OooO0OO((int) (C34696OooOOoo.OooO0o0(j) ? j2 & 4294967295L : j2 >> 32), (int) (C34696OooOOoo.OooO0o0(j) ? j3 >> 32 : j3 & 4294967295L));
        }
    }

    long OooO00o(C34695OooOOo0 c34695OooOOo0, long j, boolean z, C34696OooOOoo c34696OooOOoo);
}
