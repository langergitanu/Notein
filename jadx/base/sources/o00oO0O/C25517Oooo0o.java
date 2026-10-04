package o00oO0O;

import java.util.Arrays;
import o0000Ooo.C24227OooO00o;
import o0000Ooo.EnumC24238OooOOO;
import o00oO0O.C25503OooOoOO;
import o00oO0O.C25511OooOooo;
import o00oO0O.InterfaceC25542OoooooO;
import oO00ooO.C32442OooOO0o;
import oO00ooO.C32460OooOooO;
import oo000o.AbstractC34655Oooo0o;
import oo000o.InterfaceC34635OooOOOO;

/* JADX INFO: renamed from: o00oO0O.Oooo0o, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C25517Oooo0o {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final C25503OooOoOO f87025OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final C25493OooOO0o f87026OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public boolean f87027OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final C25541Oooooo0 f87028OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final long f87029OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final Oooo.OooO0O0<InterfaceC25542OoooooO.OooO00o> f87030OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final Oooo.OooO0O0<OooO00o> f87031OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public C24227OooO00o f87032OooO0oo;

    /* JADX INFO: renamed from: o00oO0O.Oooo0o$OooO00o */
    public static final class OooO00o {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final C25503OooOoOO f87033OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public final boolean f87034OooO0O0;

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        public final boolean f87035OooO0OO;

        public OooO00o(C25503OooOoOO node, boolean z, boolean z2) {
            kotlin.jvm.internal.OooOOO0.OooO0oO(node, "node");
            this.f87033OooO00o = node;
            this.f87034OooO0O0 = z;
            this.f87035OooO0OO = z2;
        }
    }

    public C25517Oooo0o(C25503OooOoOO root) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(root, "root");
        this.f87025OooO00o = root;
        this.f87026OooO0O0 = new C25493OooOO0o();
        this.f87028OooO0Oo = new C25541Oooooo0();
        this.f87030OooO0o0 = new Oooo.OooO0O0<>(new InterfaceC25542OoooooO.OooO00o[16]);
        this.f87029OooO0o = 1L;
        this.f87031OooO0oO = new Oooo.OooO0O0<>(new OooO00o[16]);
    }

    public final boolean OooO(C25503OooOoOO layoutNode, boolean z) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(layoutNode, "layoutNode");
        throw new IllegalStateException("Error: requestLookaheadRemeasure cannot be called on a node outside LookaheadLayout");
    }

    public final void OooO00o(boolean z) {
        C25541Oooooo0 c25541Oooooo0 = this.f87028OooO0Oo;
        if (z) {
            c25541Oooooo0.getClass();
            C25503OooOoOO rootNode = this.f87025OooO00o;
            kotlin.jvm.internal.OooOOO0.OooO0oO(rootNode, "rootNode");
            Oooo.OooO0O0<C25503OooOoOO> oooO0O0 = c25541Oooooo0.f87116OooO00o;
            oooO0O0.OooO0o();
            oooO0O0.OooO0O0(rootNode);
            rootNode.f86967Ooooo00 = true;
        }
        C25539OooooOo c25539OooooOo = C25539OooooOo.f87115OooOo0o;
        Oooo.OooO0O0<C25503OooOoOO> oooO0O02 = c25541Oooooo0.f87116OooO00o;
        Arrays.sort(oooO0O02.f59745OooOo0o, 0, oooO0O02.f59746OooOoO0, c25539OooooOo);
        int i = oooO0O02.f59746OooOoO0;
        if (i > 0) {
            int i2 = i - 1;
            C25503OooOoOO[] c25503OooOoOOArr = oooO0O02.f59745OooOo0o;
            do {
                C25503OooOoOO c25503OooOoOO = c25503OooOoOOArr[i2];
                if (c25503OooOoOO.f86967Ooooo00) {
                    C25541Oooooo0.OooO00o(c25503OooOoOO);
                }
                i2--;
            } while (i2 >= 0);
        }
        oooO0O02.OooO0o();
    }

    public final boolean OooO0O0(C25503OooOoOO c25503OooOoOO, C24227OooO00o c24227OooO00o) {
        boolean zOooo000;
        if (c24227OooO00o != null) {
            if (c25503OooOoOO.f86960OoooO0O == C25503OooOoOO.OooO0o.f86979OooOoO0) {
                c25503OooOoOO.OooOO0O();
            }
            zOooo000 = c25503OooOoOO.f86962OoooOOO.f86993OooO0oo.o00000OO(c24227OooO00o.f81474OooO00o);
        } else {
            zOooo000 = C25503OooOoOO.Oooo000(c25503OooOoOO);
        }
        C25503OooOoOO c25503OooOoOOOooOOoo = c25503OooOoOO.OooOOoo();
        if (zOooo000 && c25503OooOoOOOooOOoo != null) {
            C25503OooOoOO.OooO0o oooO0o = c25503OooOoOO.f86959OoooO00;
            if (oooO0o == C25503OooOoOO.OooO0o.f86977OooOo0o) {
                OooOO0O(c25503OooOoOOOooOOoo, false);
                return zOooo000;
            }
            if (oooO0o == C25503OooOoOO.OooO0o.f86976OooOo) {
                OooOO0(c25503OooOoOOOooOOoo, false);
            }
        }
        return zOooo000;
    }

    public final void OooO0OO(C25503OooOoOO layoutNode) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(layoutNode, "layoutNode");
        C25493OooOO0o c25493OooOO0o = this.f87026OooO0O0;
        if (((oo0o0Oo) c25493OooOO0o.f86896OooO0OO).isEmpty()) {
            return;
        }
        if (!this.f87027OooO0OO) {
            throw new IllegalStateException("Check failed.");
        }
        C25511OooOooo c25511OooOooo = layoutNode.f86962OoooOOO;
        if (c25511OooOooo.f86988OooO0OO) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        Oooo.OooO0O0<C25503OooOoOO> oooO0O0OooOo0 = layoutNode.OooOo0();
        int i = oooO0O0OooOo0.f59746OooOoO0;
        if (i > 0) {
            C25503OooOoOO[] c25503OooOoOOArr = oooO0O0OooOo0.f59745OooOo0o;
            int i2 = 0;
            do {
                C25503OooOoOO c25503OooOoOO = c25503OooOoOOArr[i2];
                if (c25503OooOoOO.f86962OoooOOO.f86988OooO0OO && c25493OooOO0o.OooO0Oo(c25503OooOoOO)) {
                    OooO0oO(c25503OooOoOO);
                }
                if (!c25503OooOoOO.f86962OoooOOO.f86988OooO0OO) {
                    OooO0OO(c25503OooOoOO);
                }
                i2++;
            } while (i2 < i);
        }
        if (c25511OooOooo.f86988OooO0OO && c25493OooOO0o.OooO0Oo(layoutNode)) {
            OooO0oO(layoutNode);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean OooO0Oo(oO0O000o.OooO00o<C32460OooOooO> oooO00o) {
        boolean z;
        C25493OooOO0o c25493OooOO0o = this.f87026OooO0O0;
        C25503OooOoOO c25503OooOoOO = this.f87025OooO00o;
        if (!c25503OooOoOO.OooOoO()) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        if (!c25503OooOoOO.f86953Oooo0o) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        if (this.f87027OooO0OO) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        int i = 0;
        Object[] objArr = 0;
        if (this.f87032OooO0oo != null) {
            this.f87027OooO0OO = true;
            try {
                oo0o0Oo oo0o0oo = (oo0o0Oo) c25493OooOO0o.f86896OooO0OO;
                oo0o0Oo oo0o0oo2 = (oo0o0Oo) c25493OooOO0o.f86896OooO0OO;
                if (oo0o0oo.isEmpty()) {
                    z = false;
                } else {
                    z = false;
                    while (!oo0o0oo2.isEmpty()) {
                        C25503OooOoOO node = (C25503OooOoOO) oo0o0oo2.first();
                        kotlin.jvm.internal.OooOOO0.OooO0o(node, "node");
                        c25493OooOO0o.OooO0Oo(node);
                        boolean zOooO0oO = OooO0oO(node);
                        if (node == c25503OooOoOO && zOooO0oO) {
                            z = true;
                        }
                    }
                    if (oooO00o != null) {
                        oooO00o.invoke();
                    }
                }
            } finally {
                this.f87027OooO0OO = false;
            }
        } else {
            z = false;
        }
        Oooo.OooO0O0<InterfaceC25542OoooooO.OooO00o> oooO0O0 = this.f87030OooO0o0;
        int i2 = oooO0O0.f59746OooOoO0;
        if (i2 > 0) {
            InterfaceC25542OoooooO.OooO00o[] oooO00oArr = oooO0O0.f59745OooOo0o;
            do {
                oooO00oArr[i].OooO0oo();
                i++;
            } while (i < i2);
        }
        oooO0O0.OooO0o();
        return z;
    }

    public final void OooO0o(C25503OooOoOO c25503OooOoOO) {
        OooO0oo(c25503OooOoOO);
        Oooo.OooO0O0<C25503OooOoOO> oooO0O0OooOo0 = c25503OooOoOO.OooOo0();
        int i = oooO0O0OooOo0.f59746OooOoO0;
        if (i > 0) {
            C25503OooOoOO[] c25503OooOoOOArr = oooO0O0OooOo0.f59745OooOo0o;
            int i2 = 0;
            do {
                C25503OooOoOO c25503OooOoOO2 = c25503OooOoOOArr[i2];
                if (c25503OooOoOO2.f86959OoooO00 == C25503OooOoOO.OooO0o.f86977OooOo0o || c25503OooOoOO2.f86962OoooOOO.f86993OooO0oo.f87004Oooo00o.OooO0o()) {
                    OooO0o(c25503OooOoOO2);
                }
                i2++;
            } while (i2 < i);
        }
        OooO0oo(c25503OooOoOO);
    }

    public final void OooO0o0() {
        C25503OooOoOO c25503OooOoOO = this.f87025OooO00o;
        if (!c25503OooOoOO.OooOoO()) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        if (!c25503OooOoOO.f86953Oooo0o) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        if (this.f87027OooO0OO) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        if (this.f87032OooO0oo != null) {
            this.f87027OooO0OO = true;
            try {
                OooO0o(c25503OooOoOO);
            } finally {
                this.f87027OooO0OO = false;
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0036  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean OooO0oO(C25503OooOoOO c25503OooOoOO) {
        boolean zOooO0O0;
        C24227OooO00o c24227OooO00o;
        boolean z = c25503OooOoOO.f86953Oooo0o;
        int i = 0;
        Object[] objArr = 0;
        C25511OooOooo c25511OooOooo = c25503OooOoOO.f86962OoooOOO;
        if (!z && ((!c25511OooOooo.f86988OooO0OO || (c25503OooOoOO.f86959OoooO00 != C25503OooOoOO.OooO0o.f86977OooOo0o && !c25511OooOooo.f86993OooO0oo.f87004Oooo00o.OooO0o())) && !kotlin.jvm.internal.OooOOO0.OooO0O0(c25503OooOoOO.OooOoOO(), Boolean.TRUE))) {
            if (c25503OooOoOO.f86962OoooOOO.f86990OooO0o) {
                boolean z2 = c25503OooOoOO.f86958OoooO0 == C25503OooOoOO.OooO0o.f86977OooOo0o;
                if (!z2 && !c25511OooOooo.f86993OooO0oo.f87004Oooo00o.OooO0o()) {
                    return false;
                }
            }
        }
        c25511OooOooo.getClass();
        C25503OooOoOO c25503OooOoOO2 = this.f87025OooO00o;
        if (c25511OooOooo.f86988OooO0OO) {
            if (c25503OooOoOO == c25503OooOoOO2) {
                c24227OooO00o = this.f87032OooO0oo;
                kotlin.jvm.internal.OooOOO0.OooO0Oo(c24227OooO00o);
            } else {
                c24227OooO00o = null;
            }
            zOooO0O0 = OooO0O0(c25503OooOoOO, c24227OooO00o);
        } else {
            zOooO0O0 = false;
        }
        C25503OooOoOO.OooO0o oooO0o = C25503OooOoOO.OooO0o.f86979OooOoO0;
        if (c25511OooOooo.f86990OooO0o && kotlin.jvm.internal.OooOOO0.OooO0O0(c25503OooOoOO.OooOoOO(), Boolean.TRUE)) {
            if (c25503OooOoOO.f86960OoooO0O == oooO0o) {
                c25503OooOoOO.OooOO0o();
            }
            kotlin.jvm.internal.OooOOO0.OooO0Oo(null);
            throw null;
        }
        if (c25511OooOooo.f86989OooO0Oo && c25503OooOoOO.f86953Oooo0o) {
            C25511OooOooo.OooO0O0 oooO0O0 = c25511OooOooo.f86993OooO0oo;
            if (c25503OooOoOO == c25503OooOoOO2) {
                if (c25503OooOoOO.f86960OoooO0O == oooO0o) {
                    c25503OooOoOO.OooOO0o();
                }
                AbstractC34655Oooo0o.OooO00o.C20369OooO00o c20369OooO00o = AbstractC34655Oooo0o.OooO00o.f124848OooO00o;
                int iO0O0O00 = oooO0O0.o0O0O00();
                EnumC24238OooOOO enumC24238OooOOO = c25503OooOoOO.f86952Oooo0OO;
                C25503OooOoOO c25503OooOoOOOooOOoo = c25503OooOoOO.OooOOoo();
                C25495OooOOo c25495OooOOo = c25503OooOoOOOooOOoo != null ? c25503OooOoOOOooOOoo.f86970o000oOoO.f87084OooO0O0 : null;
                InterfaceC34635OooOOOO interfaceC34635OooOOOO = AbstractC34655Oooo0o.OooO00o.f124851OooO0Oo;
                c20369OooO00o.getClass();
                int i2 = AbstractC34655Oooo0o.OooO00o.f124850OooO0OO;
                EnumC24238OooOOO enumC24238OooOOO2 = AbstractC34655Oooo0o.OooO00o.f124849OooO0O0;
                AbstractC34655Oooo0o.OooO00o.f124850OooO0OO = iO0O0O00;
                AbstractC34655Oooo0o.OooO00o.f124849OooO0O0 = enumC24238OooOOO;
                boolean zOooO = AbstractC34655Oooo0o.OooO00o.C20369OooO00o.OooO(c20369OooO00o, c25495OooOOo);
                AbstractC34655Oooo0o.OooO00o.OooO0o(c20369OooO00o, oooO0O0, 0, 0);
                if (c25495OooOOo != null) {
                    c25495OooOOo.f87024OooOoo0 = zOooO;
                }
                AbstractC34655Oooo0o.OooO00o.f124850OooO0OO = i2;
                AbstractC34655Oooo0o.OooO00o.f124849OooO0O0 = enumC24238OooOOO2;
                AbstractC34655Oooo0o.OooO00o.f124851OooO0Oo = interfaceC34635OooOOOO;
            } else {
                if (c25503OooOoOO.f86960OoooO0O == oooO0o) {
                    c25503OooOoOO.OooOO0o();
                }
                try {
                    c25503OooOoOO.f86968Ooooo0o = true;
                    if (!oooO0O0.f86998OooOoo0) {
                        throw new IllegalStateException("Check failed.");
                    }
                    oooO0O0.o00000O(oooO0O0.f86997OooOoo, oooO0O0.f87000OooOooo, oooO0O0.f86999OooOooO);
                } finally {
                    c25503OooOoOO.f86968Ooooo0o = false;
                }
            }
            C25541Oooooo0 c25541Oooooo0 = this.f87028OooO0Oo;
            c25541Oooooo0.getClass();
            c25541Oooooo0.f87116OooO00o.OooO0O0(c25503OooOoOO);
            c25503OooOoOO.f86967Ooooo00 = true;
        }
        Oooo.OooO0O0<OooO00o> oooO0O02 = this.f87031OooO0oO;
        if (oooO0O02.OooOO0()) {
            int i3 = oooO0O02.f59746OooOoO0;
            if (i3 > 0) {
                OooO00o[] oooO00oArr = oooO0O02.f59745OooOo0o;
                do {
                    OooO00o oooO00o = oooO00oArr[i];
                    if (oooO00o.f87033OooO00o.OooOoO()) {
                        boolean z3 = oooO00o.f87034OooO0O0;
                        boolean z4 = oooO00o.f87035OooO0OO;
                        C25503OooOoOO c25503OooOoOO3 = oooO00o.f87033OooO00o;
                        if (z3) {
                            OooO(c25503OooOoOO3, z4);
                            throw null;
                        }
                        OooOO0O(c25503OooOoOO3, z4);
                    }
                    i++;
                } while (i < i3);
            }
            oooO0O02.OooO0o();
        }
        return zOooO0O0;
    }

    public final void OooO0oo(C25503OooOoOO c25503OooOoOO) {
        C24227OooO00o c24227OooO00o;
        if (c25503OooOoOO.f86962OoooOOO.f86988OooO0OO) {
            if (c25503OooOoOO == this.f87025OooO00o) {
                c24227OooO00o = this.f87032OooO0oo;
                kotlin.jvm.internal.OooOOO0.OooO0Oo(c24227OooO00o);
            } else {
                c24227OooO00o = null;
            }
            c25503OooOoOO.f86962OoooOOO.getClass();
            OooO0O0(c25503OooOoOO, c24227OooO00o);
        }
    }

    public final boolean OooOO0(C25503OooOoOO layoutNode, boolean z) {
        C25503OooOoOO c25503OooOoOOOooOOoo;
        kotlin.jvm.internal.OooOOO0.OooO0oO(layoutNode, "layoutNode");
        C25511OooOooo c25511OooOooo = layoutNode.f86962OoooOOO;
        int iOrdinal = c25511OooOooo.f86987OooO0O0.ordinal();
        if (iOrdinal == 0 || iOrdinal == 1 || iOrdinal == 2 || iOrdinal == 3) {
            return false;
        }
        if (iOrdinal != 4) {
            throw new C32442OooOO0o();
        }
        if (!z && (c25511OooOooo.f86988OooO0OO || c25511OooOooo.f86989OooO0Oo)) {
            return false;
        }
        c25511OooOooo.f86989OooO0Oo = true;
        c25511OooOooo.f86991OooO0o0 = true;
        if (layoutNode.f86953Oooo0o && (((c25503OooOoOOOooOOoo = layoutNode.OooOOoo()) == null || !c25503OooOoOOOooOOoo.f86962OoooOOO.f86989OooO0Oo) && (c25503OooOoOOOooOOoo == null || !c25503OooOoOOOooOOoo.f86962OoooOOO.f86988OooO0OO))) {
            this.f87026OooO0O0.OooO0OO(layoutNode);
        }
        return !this.f87027OooO0OO;
    }

    public final boolean OooOO0O(C25503OooOoOO layoutNode, boolean z) {
        C25503OooOoOO c25503OooOoOOOooOOoo;
        kotlin.jvm.internal.OooOOO0.OooO0oO(layoutNode, "layoutNode");
        C25511OooOooo c25511OooOooo = layoutNode.f86962OoooOOO;
        int iOrdinal = c25511OooOooo.f86987OooO0O0.ordinal();
        if (iOrdinal != 0 && iOrdinal != 1) {
            if (iOrdinal == 2 || iOrdinal == 3) {
                this.f87031OooO0oO.OooO0O0(new OooO00o(layoutNode, false, z));
            } else {
                if (iOrdinal != 4) {
                    throw new C32442OooOO0o();
                }
                if (!c25511OooOooo.f86988OooO0OO || z) {
                    c25511OooOooo.f86988OooO0OO = true;
                    if ((layoutNode.f86953Oooo0o || layoutNode.f86959OoooO00 == C25503OooOoOO.OooO0o.f86977OooOo0o || c25511OooOooo.f86993OooO0oo.f87004Oooo00o.OooO0o()) && ((c25503OooOoOOOooOOoo = layoutNode.OooOOoo()) == null || !c25503OooOoOOOooOOoo.f86962OoooOOO.f86988OooO0OO)) {
                        this.f87026OooO0O0.OooO0OO(layoutNode);
                    }
                    if (!this.f87027OooO0OO) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public final void OooOO0o(long j) {
        C24227OooO00o c24227OooO00o = this.f87032OooO0oo;
        if (c24227OooO00o == null ? false : C24227OooO00o.OooO0O0(c24227OooO00o.f81474OooO00o, j)) {
            return;
        }
        if (this.f87027OooO0OO) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        this.f87032OooO0oo = new C24227OooO00o(j);
        C25503OooOoOO c25503OooOoOO = this.f87025OooO00o;
        c25503OooOoOO.f86962OoooOOO.f86988OooO0OO = true;
        this.f87026OooO0O0.OooO0OO(c25503OooOoOO);
    }
}
