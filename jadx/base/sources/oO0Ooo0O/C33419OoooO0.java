package oO0Ooo0O;

import oO000o.InterfaceC32083OooO0oO;
import oO00ooO.C32460OooOooO;
import oO0O000o.InterfaceC32507OooOO0o;
import oO0Ooo0O.C33416Oooo0oo;
import oOo00Oo0.C34502OooO00o;

/* JADX INFO: renamed from: oO0Ooo0O.OoooO0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C33419OoooO0 {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public static final OooO0O0 f120809OooO0Oo = new OooO0O0();

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public static final C34502OooO00o<C33419OoooO0> f120810OooO0o0 = new C34502OooO00o<>("TimeoutPlugin");

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final Long f120811OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final Long f120812OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final Long f120813OooO0OO;

    /* JADX INFO: renamed from: oO0Ooo0O.OoooO0$OooO00o */
    public static final class OooO00o {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public Long f120814OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public Long f120815OooO0O0;

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        public Long f120816OooO0OO;

        public OooO00o() {
            this.f120814OooO00o = 0L;
            this.f120815OooO0O0 = 0L;
            this.f120816OooO0OO = 0L;
            this.f120814OooO00o = null;
            this.f120815OooO0O0 = null;
            this.f120816OooO0OO = null;
        }

        public static void OooO00o(Long l) {
            if (l != null && l.longValue() <= 0) {
                throw new IllegalArgumentException("Only positive timeout values are allowed, for infinite timeout use HttpTimeout.INFINITE_TIMEOUT_MS");
            }
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || OooO00o.class != obj.getClass()) {
                return false;
            }
            OooO00o oooO00o = (OooO00o) obj;
            return kotlin.jvm.internal.OooOOO0.OooO0O0(this.f120814OooO00o, oooO00o.f120814OooO00o) && kotlin.jvm.internal.OooOOO0.OooO0O0(this.f120815OooO0O0, oooO00o.f120815OooO0O0) && kotlin.jvm.internal.OooOOO0.OooO0O0(this.f120816OooO0OO, oooO00o.f120816OooO0OO);
        }

        public final int hashCode() {
            Long l = this.f120814OooO00o;
            int iHashCode = (l != null ? l.hashCode() : 0) * 31;
            Long l2 = this.f120815OooO0O0;
            int iHashCode2 = (iHashCode + (l2 != null ? l2.hashCode() : 0)) * 31;
            Long l3 = this.f120816OooO0OO;
            return iHashCode2 + (l3 != null ? l3.hashCode() : 0);
        }
    }

    /* JADX INFO: renamed from: oO0Ooo0O.OoooO0$OooO0O0 */
    public static final class OooO0O0 implements InterfaceC33394OooOo<OooO00o, C33419OoooO0>, InterfaceC32083OooO0oO<OooO00o> {
        @Override // oO0Ooo0O.InterfaceC33394OooOo
        public final C33419OoooO0 OooO00o(InterfaceC32507OooOO0o<? super OooO00o, C32460OooOooO> interfaceC32507OooOO0o) {
            OooO00o oooO00o = new OooO00o();
            interfaceC32507OooOO0o.invoke(oooO00o);
            return new C33419OoooO0(oooO00o.f120814OooO00o, oooO00o.f120815OooO0O0, oooO00o.f120816OooO0OO);
        }

        @Override // oO0Ooo0O.InterfaceC33394OooOo
        public final void OooO0O0(C33419OoooO0 c33419OoooO0, oO000o0.OooO0o scope) {
            C33419OoooO0 plugin = c33419OoooO0;
            kotlin.jvm.internal.OooOOO0.OooO0oO(plugin, "plugin");
            kotlin.jvm.internal.OooOOO0.OooO0oO(scope, "scope");
            C33416Oooo0oo.C33417OooO0Oo c33417OooO0Oo = C33416Oooo0oo.f120800OooO0O0;
            C33416Oooo0oo c33416Oooo0oo = (C33416Oooo0oo) C33400OooOoO0.OooO00o(scope);
            c33416Oooo0oo.f120802OooO00o.add(new C33421OoooO0O(plugin, scope, null));
        }

        @Override // oO0Ooo0O.InterfaceC33394OooOo
        public final C34502OooO00o<C33419OoooO0> getKey() {
            return C33419OoooO0.f120810OooO0o0;
        }
    }

    public C33419OoooO0(Long l, Long l2, Long l3) {
        this.f120811OooO00o = l;
        this.f120812OooO0O0 = l2;
        this.f120813OooO0OO = l3;
    }
}
