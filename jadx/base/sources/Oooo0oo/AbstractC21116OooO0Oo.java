package Oooo0oo;

import OooOo.C20481OooOOoo;
import Oooo0oO.AbstractC21043OooOoO;
import Oooo0oO.C21025OooO0o0;
import Oooo0oO.C21038OooOo;
import Oooo0oO.C21047OooOoo0;
import Oooo0oO.C21091o0000o;
import Oooo0oO.C21093o0000o0O;
import Oooo0oO.C21096o0000oO0;
import Oooo0oO.C21112ooOO;
import Oooo0oO.InterfaceC21026OooO0oO;
import Oooo0oO.InterfaceC21032OooOOO0;
import Oooo0oO.InterfaceC21033OooOOOO;
import Oooo0oO.InterfaceC21044OooOoO0;
import Oooo0oO.InterfaceC21055Oooo0OO;
import Oooo0oO.o00000OO;
import Oooo0oO.o0000OO;
import Oooo0oO.o0000OO0;
import Oooo0oO.o00O0O;
import Oooo0oO.o00Oo0;
import Oooo0oO.o0ooOOo;
import Oooo0oo.C21137OooO0oO;
import com.google.firebase.messaging.Constants;
import com.huawei.hms.network.embedded.C18293o1;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.C24035Oooo00o;
import o000oOoO.C24637OooO0OO;
import oO00ooO.C32460OooOooO;
import oO0O000o.InterfaceC32507OooOO0o;
import oO0O000o.InterfaceC32508OooOOOo;

/* JADX INFO: renamed from: Oooo0oo.OooO0Oo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC21116OooO0Oo {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final int f61285OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final int f61286OooO0O0;

    /* JADX INFO: renamed from: Oooo0oo.OooO0Oo$OooO */
    public static final class OooO extends AbstractC21116OooO0Oo {

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        public static final OooO f61287OooO0OO;

        static {
            int i = 0;
            f61287OooO0OO = new OooO(i, i, 3);
        }

        @Override // Oooo0oo.AbstractC21116OooO0Oo
        public final void OooO00o(C21137OooO0oO.OooO00o oooO00o, InterfaceC21026OooO0oO interfaceC21026OooO0oO, C21096o0000oO0 c21096o0000oO0, C21047OooOoo0.OooO00o oooO00o2) {
            c21096o0000oO0.OooO();
        }
    }

    /* JADX INFO: renamed from: Oooo0oo.OooO0Oo$OooO00o */
    public static final class OooO00o extends AbstractC21116OooO0Oo {

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        public static final OooO00o f61288OooO0OO = new OooO00o(1, 0, 2);

        @Override // Oooo0oo.AbstractC21116OooO0Oo
        public final void OooO00o(C21137OooO0oO.OooO00o oooO00o, InterfaceC21026OooO0oO interfaceC21026OooO0oO, C21096o0000oO0 c21096o0000oO0, C21047OooOoo0.OooO00o oooO00o2) {
            c21096o0000oO0.OooO00o(oooO00o.OooO00o(0));
        }

        @Override // Oooo0oo.AbstractC21116OooO0Oo
        public final String OooO0O0(int i) {
            return i == 0 ? "distance" : super.OooO0O0(i);
        }
    }

    /* JADX INFO: renamed from: Oooo0oo.OooO0Oo$OooO0O0 */
    public static final class OooO0O0 extends AbstractC21116OooO0Oo {

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        public static final OooO0O0 f61289OooO0OO = new OooO0O0(0, 2, 1);

        @Override // Oooo0oo.AbstractC21116OooO0Oo
        public final void OooO00o(C21137OooO0oO.OooO00o oooO00o, InterfaceC21026OooO0oO interfaceC21026OooO0oO, C21096o0000oO0 c21096o0000oO0, C21047OooOoo0.OooO00o oooO00o2) {
            C21025OooO0o0 c21025OooO0o0 = (C21025OooO0o0) oooO00o.OooO0O0(0);
            Object objOooO0O0 = oooO00o.OooO0O0(1);
            if (objOooO0O0 instanceof o0000OO) {
                oooO00o2.OooO0o0(((o0000OO) objOooO0O0).f61132OooO00o);
            }
            if (c21096o0000oO0.f61190OooOOO != 0) {
                C21038OooOo.OooO0OO("Can only append a slot if not current inserting");
                throw null;
            }
            int i = c21096o0000oO0.f61178OooO;
            int i2 = c21096o0000oO0.f61187OooOO0;
            int iOooO0OO = c21096o0000oO0.OooO0OO(c21025OooO0o0);
            int iOooO0o = c21096o0000oO0.OooO0o(c21096o0000oO0.f61180OooO0O0, c21096o0000oO0.OooOOOo(iOooO0OO + 1));
            c21096o0000oO0.f61178OooO = iOooO0o;
            c21096o0000oO0.f61187OooOO0 = iOooO0o;
            c21096o0000oO0.OooOo00(1, iOooO0OO);
            if (i >= iOooO0o) {
                i++;
                i2++;
            }
            c21096o0000oO0.f61181OooO0OO[iOooO0o] = objOooO0O0;
            c21096o0000oO0.f61178OooO = i;
            c21096o0000oO0.f61187OooOO0 = i2;
        }

        @Override // Oooo0oo.AbstractC21116OooO0Oo
        public final String OooO0OO(int i) {
            return i == 0 ? "anchor" : i == 1 ? "value" : super.OooO0OO(i);
        }
    }

    /* JADX INFO: renamed from: Oooo0oo.OooO0Oo$OooO0OO */
    public static final class OooO0OO extends AbstractC21116OooO0Oo {

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        public static final OooO0OO f61290OooO0OO = new OooO0OO(0, 2, 1);

        @Override // Oooo0oo.AbstractC21116OooO0Oo
        public final void OooO00o(C21137OooO0oO.OooO00o oooO00o, InterfaceC21026OooO0oO interfaceC21026OooO0oO, C21096o0000oO0 c21096o0000oO0, C21047OooOoo0.OooO00o oooO00o2) {
            C24637OooO0OO c24637OooO0OO = (C24637OooO0OO) oooO00o.OooO0O0(1);
            int i = c24637OooO0OO != null ? c24637OooO0OO.f83456OooO00o : 0;
            C21113OooO00o c21113OooO00o = (C21113OooO00o) oooO00o.OooO0O0(0);
            if (i > 0) {
                interfaceC21026OooO0oO = new o0ooOOo(interfaceC21026OooO0oO, i);
            }
            c21113OooO00o.OoooooO(interfaceC21026OooO0oO, c21096o0000oO0, oooO00o2);
        }

        @Override // Oooo0oo.AbstractC21116OooO0Oo
        public final String OooO0OO(int i) {
            return i == 0 ? "changes" : i == 1 ? "effectiveNodeIndex" : super.OooO0OO(i);
        }
    }

    /* JADX INFO: renamed from: Oooo0oo.OooO0Oo$OooO0Oo, reason: collision with other inner class name */
    public static final class C18980OooO0Oo extends AbstractC21116OooO0Oo {

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        public static final C18980OooO0Oo f61291OooO0OO = new C18980OooO0Oo(0, 2, 1);

        @Override // Oooo0oo.AbstractC21116OooO0Oo
        public final void OooO00o(C21137OooO0oO.OooO00o oooO00o, InterfaceC21026OooO0oO interfaceC21026OooO0oO, C21096o0000oO0 c21096o0000oO0, C21047OooOoo0.OooO00o oooO00o2) {
            int i = ((C24637OooO0OO) oooO00o.OooO0O0(0)).f83456OooO00o;
            List list = (List) oooO00o.OooO0O0(1);
            int size = list.size();
            for (int i2 = 0; i2 < size; i2++) {
                Object obj = list.get(i2);
                kotlin.jvm.internal.OooOOO0.OooO0o0(interfaceC21026OooO0oO, "null cannot be cast to non-null type androidx.compose.runtime.Applier<kotlin.Any?>");
                int i3 = i + i2;
                interfaceC21026OooO0oO.OooO0o(i3, obj);
                interfaceC21026OooO0oO.OooO0Oo(i3, obj);
            }
        }

        @Override // Oooo0oo.AbstractC21116OooO0Oo
        public final String OooO0OO(int i) {
            return i == 0 ? "effectiveNodeIndex" : i == 1 ? "nodes" : super.OooO0OO(i);
        }
    }

    /* JADX INFO: renamed from: Oooo0oo.OooO0Oo$OooO0o */
    public static final class OooO0o extends AbstractC21116OooO0Oo {

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        public static final OooO0o f61292OooO0OO = new OooO0o(0, 2, 1);

        @Override // Oooo0oo.AbstractC21116OooO0Oo
        public final void OooO00o(C21137OooO0oO.OooO00o oooO00o, InterfaceC21026OooO0oO interfaceC21026OooO0oO, C21096o0000oO0 c21096o0000oO0, C21047OooOoo0.OooO00o oooO00o2) {
            int i;
            C24637OooO0OO c24637OooO0OO = (C24637OooO0OO) oooO00o.OooO0O0(0);
            C21025OooO0o0 c21025OooO0o0 = (C21025OooO0o0) oooO00o.OooO0O0(1);
            kotlin.jvm.internal.OooOOO0.OooO0o0(interfaceC21026OooO0oO, "null cannot be cast to non-null type androidx.compose.runtime.Applier<kotlin.Any?>");
            int iOooO0OO = c21096o0000oO0.OooO0OO(c21025OooO0o0);
            C21038OooOo.OooO0oO(c21096o0000oO0.f61196OooOOoo < iOooO0OO);
            C21135OooO0o.OooO00o(c21096o0000oO0, interfaceC21026OooO0oO, iOooO0OO);
            int i2 = c21096o0000oO0.f61196OooOOoo;
            int iOooOoO = c21096o0000oO0.f61197OooOo0;
            while (iOooOoO >= 0 && !C21091o0000o.OooO0oO(c21096o0000oO0.f61180OooO0O0, c21096o0000oO0.OooOOOo(iOooOoO))) {
                iOooOoO = c21096o0000oO0.OooOoO(c21096o0000oO0.f61180OooO0O0, iOooOoO);
            }
            int iOooOOo0 = iOooOoO + 1;
            int iOooOooo = 0;
            while (iOooOOo0 < i2) {
                if (c21096o0000oO0.OooOOo(i2, iOooOOo0)) {
                    if (C21091o0000o.OooO0oO(c21096o0000oO0.f61180OooO0O0, c21096o0000oO0.OooOOOo(iOooOOo0))) {
                        iOooOooo = 0;
                    }
                    iOooOOo0++;
                } else {
                    iOooOooo += C21091o0000o.OooO0oO(c21096o0000oO0.f61180OooO0O0, c21096o0000oO0.OooOOOo(iOooOOo0)) ? 1 : C21091o0000o.OooO(c21096o0000oO0.f61180OooO0O0, c21096o0000oO0.OooOOOo(iOooOOo0));
                    iOooOOo0 += c21096o0000oO0.OooOOo0(iOooOOo0);
                }
            }
            while (true) {
                i = c21096o0000oO0.f61196OooOOoo;
                if (i >= iOooO0OO) {
                    break;
                }
                if (c21096o0000oO0.OooOOo(iOooO0OO, i)) {
                    int i3 = c21096o0000oO0.f61196OooOOoo;
                    if (i3 < c21096o0000oO0.f61198OooOo00 && C21091o0000o.OooO0oO(c21096o0000oO0.f61180OooO0O0, c21096o0000oO0.OooOOOo(i3))) {
                        int iOooOOOo = c21096o0000oO0.OooOOOo(c21096o0000oO0.f61196OooOOoo);
                        interfaceC21026OooO0oO.OooO0oO(C21091o0000o.OooO0oO(c21096o0000oO0.f61180OooO0O0, iOooOOOo) ? c21096o0000oO0.f61181OooO0OO[c21096o0000oO0.OooO0oO(c21096o0000oO0.OooO0o(c21096o0000oO0.f61180OooO0O0, iOooOOOo))] : null);
                        iOooOooo = 0;
                    }
                    c21096o0000oO0.Oooo0();
                } else {
                    iOooOooo += c21096o0000oO0.OooOooo();
                }
            }
            C21038OooOo.OooO0oO(i == iOooO0OO);
            c24637OooO0OO.f83456OooO00o = iOooOooo;
        }

        @Override // Oooo0oo.AbstractC21116OooO0Oo
        public final String OooO0OO(int i) {
            return i == 0 ? "effectiveNodeIndexOut" : i == 1 ? "anchor" : super.OooO0OO(i);
        }
    }

    /* JADX INFO: renamed from: Oooo0oo.OooO0Oo$OooO0o0, reason: case insensitive filesystem */
    public static final class C21117OooO0o0 extends AbstractC21116OooO0Oo {

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        public static final C21117OooO0o0 f61293OooO0OO = new C21117OooO0o0(0, 4, 1);

        @Override // Oooo0oo.AbstractC21116OooO0Oo
        public final void OooO00o(C21137OooO0oO.OooO00o oooO00o, InterfaceC21026OooO0oO interfaceC21026OooO0oO, C21096o0000oO0 c21096o0000oO0, C21047OooOoo0.OooO00o oooO00o2) {
            o00Oo0 o00oo02 = (o00Oo0) oooO00o.OooO0O0(2);
            o00Oo0 o00oo03 = (o00Oo0) oooO00o.OooO0O0(3);
            AbstractC21043OooOoO abstractC21043OooOoO = (AbstractC21043OooOoO) oooO00o.OooO0O0(1);
            o00O0O o00o0oOooOO0o = (o00O0O) oooO00o.OooO0O0(0);
            if (o00o0oOooOO0o == null && (o00o0oOooOO0o = abstractC21043OooOoO.OooOO0o(o00oo02)) == null) {
                C21038OooOo.OooO0Oo("Could not resolve state for movable content");
                throw null;
            }
            C21038OooOo.OooO0oO(c21096o0000oO0.f61190OooOOO <= 0 && c21096o0000oO0.OooOOo0(c21096o0000oO0.f61196OooOOoo + 1) == 1);
            int i = c21096o0000oO0.f61196OooOOoo;
            int i2 = c21096o0000oO0.f61178OooO;
            int i3 = c21096o0000oO0.f61187OooOO0;
            c21096o0000oO0.OooO00o(1);
            c21096o0000oO0.Oooo0();
            c21096o0000oO0.OooO0Oo();
            C21096o0000oO0 c21096o0000oO0OooO0oO = o00o0oOooOO0o.f61248OooO00o.OooO0oO();
            try {
                List listOooO00o = C21096o0000oO0.OooO00o.OooO00o(c21096o0000oO0OooO0oO, 2, c21096o0000oO0, false, true, true);
                c21096o0000oO0OooO0oO.OooO0o0(true);
                c21096o0000oO0.OooOO0();
                c21096o0000oO0.OooO();
                c21096o0000oO0.f61196OooOOoo = i;
                c21096o0000oO0.f61178OooO = i2;
                c21096o0000oO0.f61187OooOO0 = i3;
                o00000OO.OooO00o.OooO00o(c21096o0000oO0, listOooO00o, o00oo03.f61251OooO0OO);
            } catch (Throwable th) {
                c21096o0000oO0OooO0oO.OooO0o0(false);
                throw th;
            }
        }

        @Override // Oooo0oo.AbstractC21116OooO0Oo
        public final String OooO0OO(int i) {
            return i == 0 ? "resolvedState" : i == 1 ? "resolvedCompositionContext" : i == 2 ? Constants.MessagePayloadKeys.FROM : i == 3 ? "to" : super.OooO0OO(i);
        }
    }

    /* JADX INFO: renamed from: Oooo0oo.OooO0Oo$OooO0oO, reason: case insensitive filesystem */
    public static final class C21118OooO0oO extends AbstractC21116OooO0Oo {

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        public static final C21118OooO0oO f61294OooO0OO;

        static {
            int i = 1;
            f61294OooO0OO = new C21118OooO0oO(0, i, i);
        }

        @Override // Oooo0oo.AbstractC21116OooO0Oo
        public final void OooO00o(C21137OooO0oO.OooO00o oooO00o, InterfaceC21026OooO0oO interfaceC21026OooO0oO, C21096o0000oO0 c21096o0000oO0, C21047OooOoo0.OooO00o oooO00o2) {
            kotlin.jvm.internal.OooOOO0.OooO0o0(interfaceC21026OooO0oO, "null cannot be cast to non-null type androidx.compose.runtime.Applier<kotlin.Any?>");
            for (Object obj : (Object[]) oooO00o.OooO0O0(0)) {
                interfaceC21026OooO0oO.OooO0oO(obj);
            }
        }

        @Override // Oooo0oo.AbstractC21116OooO0Oo
        public final String OooO0OO(int i) {
            return i == 0 ? "nodes" : super.OooO0OO(i);
        }
    }

    /* JADX INFO: renamed from: Oooo0oo.OooO0Oo$OooO0oo, reason: case insensitive filesystem */
    public static final class C21119OooO0oo extends AbstractC21116OooO0Oo {

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        public static final C21119OooO0oo f61295OooO0OO = new C21119OooO0oo(0, 2, 1);

        @Override // Oooo0oo.AbstractC21116OooO0Oo
        public final void OooO00o(C21137OooO0oO.OooO00o oooO00o, InterfaceC21026OooO0oO interfaceC21026OooO0oO, C21096o0000oO0 c21096o0000oO0, C21047OooOoo0.OooO00o oooO00o2) {
            ((InterfaceC32507OooOO0o) oooO00o.OooO0O0(0)).invoke((InterfaceC21044OooOoO0) oooO00o.OooO0O0(1));
        }

        @Override // Oooo0oo.AbstractC21116OooO0Oo
        public final String OooO0OO(int i) {
            return i == 0 ? "anchor" : i == 1 ? "composition" : super.OooO0OO(i);
        }
    }

    /* JADX INFO: renamed from: Oooo0oo.OooO0Oo$OooOO0 */
    public static final class OooOO0 extends AbstractC21116OooO0Oo {

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        public static final OooOO0 f61296OooO0OO;

        static {
            int i = 0;
            f61296OooO0OO = new OooOO0(i, i, 3);
        }

        @Override // Oooo0oo.AbstractC21116OooO0Oo
        public final void OooO00o(C21137OooO0oO.OooO00o oooO00o, InterfaceC21026OooO0oO interfaceC21026OooO0oO, C21096o0000oO0 c21096o0000oO0, C21047OooOoo0.OooO00o oooO00o2) {
            kotlin.jvm.internal.OooOOO0.OooO0o0(interfaceC21026OooO0oO, "null cannot be cast to non-null type androidx.compose.runtime.Applier<kotlin.Any?>");
            C21135OooO0o.OooO00o(c21096o0000oO0, interfaceC21026OooO0oO, 0);
            c21096o0000oO0.OooO();
        }
    }

    /* JADX INFO: renamed from: Oooo0oo.OooO0Oo$OooOO0O */
    public static final class OooOO0O extends AbstractC21116OooO0Oo {

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        public static final OooOO0O f61297OooO0OO;

        static {
            int i = 1;
            f61297OooO0OO = new OooOO0O(0, i, i);
        }

        @Override // Oooo0oo.AbstractC21116OooO0Oo
        public final void OooO00o(C21137OooO0oO.OooO00o oooO00o, InterfaceC21026OooO0oO interfaceC21026OooO0oO, C21096o0000oO0 c21096o0000oO0, C21047OooOoo0.OooO00o oooO00o2) {
            C21025OooO0o0 c21025OooO0o0 = (C21025OooO0o0) oooO00o.OooO0O0(0);
            c21025OooO0o0.getClass();
            c21096o0000oO0.OooOO0O(c21096o0000oO0.OooO0OO(c21025OooO0o0));
        }

        @Override // Oooo0oo.AbstractC21116OooO0Oo
        public final String OooO0OO(int i) {
            return i == 0 ? "anchor" : super.OooO0OO(i);
        }
    }

    /* JADX INFO: renamed from: Oooo0oo.OooO0Oo$OooOO0o, reason: case insensitive filesystem */
    public static final class C21120OooOO0o extends AbstractC21116OooO0Oo {

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        public static final C21120OooOO0o f61298OooO0OO;

        static {
            int i = 0;
            f61298OooO0OO = new C21120OooOO0o(i, i, 3);
        }

        @Override // Oooo0oo.AbstractC21116OooO0Oo
        public final void OooO00o(C21137OooO0oO.OooO00o oooO00o, InterfaceC21026OooO0oO interfaceC21026OooO0oO, C21096o0000oO0 c21096o0000oO0, C21047OooOoo0.OooO00o oooO00o2) {
            c21096o0000oO0.OooOO0O(0);
        }
    }

    /* JADX INFO: renamed from: Oooo0oo.OooO0Oo$OooOOO */
    public static final class OooOOO extends AbstractC21116OooO0Oo {

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        public static final OooOOO f61299OooO0OO = new OooOOO(0, 2, 1);

        @Override // Oooo0oo.AbstractC21116OooO0Oo
        public final void OooO00o(C21137OooO0oO.OooO00o oooO00o, InterfaceC21026OooO0oO interfaceC21026OooO0oO, C21096o0000oO0 c21096o0000oO0, C21047OooOoo0.OooO00o oooO00o2) {
            C21093o0000o0O c21093o0000o0O = (C21093o0000o0O) oooO00o.OooO0O0(1);
            C21025OooO0o0 c21025OooO0o0 = (C21025OooO0o0) oooO00o.OooO0O0(0);
            c21096o0000oO0.OooO0Oo();
            c21025OooO0o0.getClass();
            c21096o0000oO0.OooOo0O(c21093o0000o0O, c21093o0000o0O.OooO0Oo(c21025OooO0o0));
            c21096o0000oO0.OooOO0();
        }

        @Override // Oooo0oo.AbstractC21116OooO0Oo
        public final String OooO0OO(int i) {
            return i == 0 ? "anchor" : i == 1 ? Constants.MessagePayloadKeys.FROM : super.OooO0OO(i);
        }
    }

    /* JADX INFO: renamed from: Oooo0oo.OooO0Oo$OooOOO0 */
    public static final class OooOOO0 extends AbstractC21116OooO0Oo {

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        public static final OooOOO0 f61300OooO0OO = new OooOOO0(1, 2);

        @Override // Oooo0oo.AbstractC21116OooO0Oo
        public final void OooO00o(C21137OooO0oO.OooO00o oooO00o, InterfaceC21026OooO0oO interfaceC21026OooO0oO, C21096o0000oO0 c21096o0000oO0, C21047OooOoo0.OooO00o oooO00o2) {
            Object objInvoke = ((oO0O000o.OooO00o) oooO00o.OooO0O0(0)).invoke();
            C21025OooO0o0 c21025OooO0o0 = (C21025OooO0o0) oooO00o.OooO0O0(1);
            int iOooO00o = oooO00o.OooO00o(0);
            kotlin.jvm.internal.OooOOO0.OooO0o0(interfaceC21026OooO0oO, "null cannot be cast to non-null type androidx.compose.runtime.Applier<kotlin.Any?>");
            c21025OooO0o0.getClass();
            c21096o0000oO0.Oooo0oo(c21096o0000oO0.OooO0OO(c21025OooO0o0), objInvoke);
            interfaceC21026OooO0oO.OooO0Oo(iOooO00o, objInvoke);
            interfaceC21026OooO0oO.OooO0oO(objInvoke);
        }

        @Override // Oooo0oo.AbstractC21116OooO0Oo
        public final String OooO0O0(int i) {
            return i == 0 ? "insertIndex" : super.OooO0O0(i);
        }

        @Override // Oooo0oo.AbstractC21116OooO0Oo
        public final String OooO0OO(int i) {
            return i == 0 ? "factory" : i == 1 ? "groupAnchor" : super.OooO0OO(i);
        }
    }

    /* JADX INFO: renamed from: Oooo0oo.OooO0Oo$OooOOOO */
    public static final class OooOOOO extends AbstractC21116OooO0Oo {

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        public static final OooOOOO f61301OooO0OO = new OooOOOO(0, 3, 1);

        @Override // Oooo0oo.AbstractC21116OooO0Oo
        public final void OooO00o(C21137OooO0oO.OooO00o oooO00o, InterfaceC21026OooO0oO interfaceC21026OooO0oO, C21096o0000oO0 c21096o0000oO0, C21047OooOoo0.OooO00o oooO00o2) {
            C21093o0000o0O c21093o0000o0O = (C21093o0000o0O) oooO00o.OooO0O0(1);
            C21025OooO0o0 c21025OooO0o0 = (C21025OooO0o0) oooO00o.OooO0O0(0);
            C21115OooO0OO c21115OooO0OO = (C21115OooO0OO) oooO00o.OooO0O0(2);
            C21096o0000oO0 c21096o0000oO0OooO0oO = c21093o0000o0O.OooO0oO();
            try {
                if (!c21115OooO0OO.f61284OooO0O0.ooOO()) {
                    C21038OooOo.OooO0OO("FixupList has pending fixup operations that were not realized. Were there mismatched insertNode() and endNodeInsert() calls?");
                    throw null;
                }
                c21115OooO0OO.f61283OooO00o.o0OoOo0(interfaceC21026OooO0oO, c21096o0000oO0OooO0oO, oooO00o2);
                C32460OooOooO c32460OooOooO = C32460OooOooO.f116667OooO00o;
                c21096o0000oO0OooO0oO.OooO0o0(true);
                c21096o0000oO0.OooO0Oo();
                c21025OooO0o0.getClass();
                c21096o0000oO0.OooOo0O(c21093o0000o0O, c21093o0000o0O.OooO0Oo(c21025OooO0o0));
                c21096o0000oO0.OooOO0();
            } catch (Throwable th) {
                c21096o0000oO0OooO0oO.OooO0o0(false);
                throw th;
            }
        }

        @Override // Oooo0oo.AbstractC21116OooO0Oo
        public final String OooO0OO(int i) {
            return i == 0 ? "anchor" : i == 1 ? Constants.MessagePayloadKeys.FROM : i == 2 ? "fixups" : super.OooO0OO(i);
        }
    }

    /* JADX INFO: renamed from: Oooo0oo.OooO0Oo$OooOOOo, reason: case insensitive filesystem */
    public static final class C21121OooOOOo extends AbstractC21116OooO0Oo {

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        public static final C21121OooOOOo f61302OooO0OO = new C21121OooOOOo(1, 0, 2);

        @Override // Oooo0oo.AbstractC21116OooO0Oo
        public final void OooO00o(C21137OooO0oO.OooO00o oooO00o, InterfaceC21026OooO0oO interfaceC21026OooO0oO, C21096o0000oO0 c21096o0000oO0, C21047OooOoo0.OooO00o oooO00o2) throws Throwable {
            C21025OooO0o0 c21025OooO0o0;
            int iOooO0OO;
            int iOooO00o = oooO00o.OooO00o(0);
            Throwable th = null;
            if (!(c21096o0000oO0.f61190OooOOO == 0)) {
                C21038OooOo.OooO0OO("Cannot move a group while inserting");
                throw null;
            }
            if (!(iOooO00o >= 0)) {
                C21038OooOo.OooO0OO("Parameter offset is out of bounds");
                throw null;
            }
            if (iOooO00o == 0) {
                return;
            }
            int i = c21096o0000oO0.f61196OooOOoo;
            int i2 = c21096o0000oO0.f61197OooOo0;
            int i3 = c21096o0000oO0.f61198OooOo00;
            int i4 = i;
            while (iOooO00o > 0) {
                i4 += c21096o0000oO0.f61180OooO0O0[(c21096o0000oO0.OooOOOo(i4) * 5) + 3];
                if (i4 > i3) {
                    C21038OooOo.OooO0OO("Parameter offset is out of bounds");
                    throw null;
                }
                iOooO00o--;
            }
            int i5 = c21096o0000oO0.f61180OooO0O0[(c21096o0000oO0.OooOOOo(i4) * 5) + 3];
            int iOooO0o = c21096o0000oO0.OooO0o(c21096o0000oO0.f61180OooO0O0, c21096o0000oO0.OooOOOo(c21096o0000oO0.f61196OooOOoo));
            int iOooO0o2 = c21096o0000oO0.OooO0o(c21096o0000oO0.f61180OooO0O0, c21096o0000oO0.OooOOOo(i4));
            int i6 = i4 + i5;
            int iOooO0o3 = c21096o0000oO0.OooO0o(c21096o0000oO0.f61180OooO0O0, c21096o0000oO0.OooOOOo(i6));
            int i7 = iOooO0o3 - iOooO0o2;
            c21096o0000oO0.OooOo00(i7, Math.max(c21096o0000oO0.f61196OooOOoo - 1, 0));
            c21096o0000oO0.OooOOoo(i5);
            int[] iArr = c21096o0000oO0.f61180OooO0O0;
            int iOooOOOo = c21096o0000oO0.OooOOOo(i6) * 5;
            Oooo.OooO0OO.OooO0oO(iArr, iArr, c21096o0000oO0.OooOOOo(i) * 5, iOooOOOo, (i5 * 5) + iOooOOOo);
            if (i7 > 0) {
                Object[] objArr = c21096o0000oO0.f61181OooO0OO;
                Oooo.OooO0OO.OooO0oo(objArr, iOooO0o, objArr, c21096o0000oO0.OooO0oO(iOooO0o2 + i7), c21096o0000oO0.OooO0oO(iOooO0o3 + i7));
            }
            int i8 = iOooO0o2 + i7;
            int i9 = i8 - iOooO0o;
            int i10 = c21096o0000oO0.f61188OooOO0O;
            int i11 = c21096o0000oO0.f61189OooOO0o;
            int length = c21096o0000oO0.f61181OooO0OO.length;
            int i12 = c21096o0000oO0.f61191OooOOO0;
            int i13 = i + i5;
            int i14 = i;
            while (i14 < i13) {
                Throwable th2 = th;
                int iOooOOOo2 = c21096o0000oO0.OooOOOo(i14);
                int i15 = i13;
                int i16 = i14;
                iArr[(iOooOOOo2 * 5) + 4] = C21096o0000oO0.OooO0oo(C21096o0000oO0.OooO0oo(c21096o0000oO0.OooO0o(iArr, iOooOOOo2) - i9, i12 < iOooOOOo2 ? 0 : i10, i11, length), c21096o0000oO0.f61188OooOO0O, c21096o0000oO0.f61189OooOO0o, c21096o0000oO0.f61181OooO0OO.length);
                i14 = i16 + 1;
                th = th2;
                i13 = i15;
                i9 = i9;
            }
            Throwable th3 = th;
            int i17 = i6 + i5;
            int iOooOOO = c21096o0000oO0.OooOOO();
            int iOooO0oo = C21091o0000o.OooO0oo(c21096o0000oO0.f61182OooO0Oo, i6, iOooOOO);
            ArrayList arrayList = new ArrayList();
            if (iOooO0oo >= 0) {
                while (iOooO0oo < c21096o0000oO0.f61182OooO0Oo.size() && (iOooO0OO = c21096o0000oO0.OooO0OO((c21025OooO0o0 = c21096o0000oO0.f61182OooO0Oo.get(iOooO0oo)))) >= i6 && iOooO0OO < i17) {
                    arrayList.add(c21025OooO0o0);
                    c21096o0000oO0.f61182OooO0Oo.remove(iOooO0oo);
                }
            }
            int i18 = i - i6;
            int size = arrayList.size();
            for (int i19 = 0; i19 < size; i19++) {
                C21025OooO0o0 c21025OooO0o02 = (C21025OooO0o0) arrayList.get(i19);
                int iOooO0OO2 = c21096o0000oO0.OooO0OO(c21025OooO0o02) + i18;
                if (iOooO0OO2 >= c21096o0000oO0.f61185OooO0oO) {
                    c21025OooO0o02.f60884OooO00o = -(iOooOOO - iOooO0OO2);
                } else {
                    c21025OooO0o02.f60884OooO00o = iOooO0OO2;
                }
                c21096o0000oO0.f61182OooO0Oo.add(C21091o0000o.OooO0oo(c21096o0000oO0.f61182OooO0Oo, iOooO0OO2, iOooOOO), c21025OooO0o02);
            }
            if (c21096o0000oO0.OooOoo(i6, i5)) {
                C21038OooOo.OooO0OO("Unexpectedly removed anchors");
                throw th3;
            }
            c21096o0000oO0.OooOO0o(i2, c21096o0000oO0.f61198OooOo00, i);
            if (i7 > 0) {
                c21096o0000oO0.OooOooO(i8, i7, i6 - 1);
            }
        }

        @Override // Oooo0oo.AbstractC21116OooO0Oo
        public final String OooO0O0(int i) {
            return i == 0 ? "offset" : super.OooO0O0(i);
        }
    }

    /* JADX INFO: renamed from: Oooo0oo.OooO0Oo$OooOOo, reason: case insensitive filesystem */
    public static final class C21122OooOOo extends AbstractC21116OooO0Oo {

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        public static final C21122OooOOo f61303OooO0OO = new C21122OooOOo(1, 1);

        @Override // Oooo0oo.AbstractC21116OooO0Oo
        public final void OooO00o(C21137OooO0oO.OooO00o oooO00o, InterfaceC21026OooO0oO interfaceC21026OooO0oO, C21096o0000oO0 c21096o0000oO0, C21047OooOoo0.OooO00o oooO00o2) {
            C21025OooO0o0 c21025OooO0o0 = (C21025OooO0o0) oooO00o.OooO0O0(0);
            int iOooO00o = oooO00o.OooO00o(0);
            interfaceC21026OooO0oO.mo0up();
            c21025OooO0o0.getClass();
            int iOooOOOo = c21096o0000oO0.OooOOOo(c21096o0000oO0.OooO0OO(c21025OooO0o0));
            interfaceC21026OooO0oO.OooO0o(iOooO00o, C21091o0000o.OooO0oO(c21096o0000oO0.f61180OooO0O0, iOooOOOo) ? c21096o0000oO0.f61181OooO0OO[c21096o0000oO0.OooO0oO(c21096o0000oO0.OooO0o(c21096o0000oO0.f61180OooO0O0, iOooOOOo))] : null);
        }

        @Override // Oooo0oo.AbstractC21116OooO0Oo
        public final String OooO0O0(int i) {
            return i == 0 ? "insertIndex" : super.OooO0O0(i);
        }

        @Override // Oooo0oo.AbstractC21116OooO0Oo
        public final String OooO0OO(int i) {
            return i == 0 ? "groupAnchor" : super.OooO0OO(i);
        }
    }

    /* JADX INFO: renamed from: Oooo0oo.OooO0Oo$OooOOo0, reason: case insensitive filesystem */
    public static final class C21123OooOOo0 extends AbstractC21116OooO0Oo {

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        public static final C21123OooOOo0 f61304OooO0OO = new C21123OooOOo0(3, 0, 2);

        @Override // Oooo0oo.AbstractC21116OooO0Oo
        public final void OooO00o(C21137OooO0oO.OooO00o oooO00o, InterfaceC21026OooO0oO interfaceC21026OooO0oO, C21096o0000oO0 c21096o0000oO0, C21047OooOoo0.OooO00o oooO00o2) {
            interfaceC21026OooO0oO.OooO0OO(oooO00o.OooO00o(0), oooO00o.OooO00o(1), oooO00o.OooO00o(2));
        }

        @Override // Oooo0oo.AbstractC21116OooO0Oo
        public final String OooO0O0(int i) {
            return i == 0 ? Constants.MessagePayloadKeys.FROM : i == 1 ? "to" : i == 2 ? C18293o1.f55803f : super.OooO0O0(i);
        }
    }

    /* JADX INFO: renamed from: Oooo0oo.OooO0Oo$OooOOoo, reason: case insensitive filesystem */
    public static final class C21124OooOOoo extends AbstractC21116OooO0Oo {

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        public static final C21124OooOOoo f61305OooO0OO = new C21124OooOOoo(0, 3, 1);

        @Override // Oooo0oo.AbstractC21116OooO0Oo
        public final void OooO00o(C21137OooO0oO.OooO00o oooO00o, InterfaceC21026OooO0oO interfaceC21026OooO0oO, C21096o0000oO0 c21096o0000oO0, C21047OooOoo0.OooO00o oooO00o2) {
            InterfaceC21055Oooo0OO interfaceC21055Oooo0OO = (InterfaceC21055Oooo0OO) oooO00o.OooO0O0(0);
            AbstractC21043OooOoO abstractC21043OooOoO = (AbstractC21043OooOoO) oooO00o.OooO0O0(1);
            o00Oo0 o00oo02 = (o00Oo0) oooO00o.OooO0O0(2);
            C21093o0000o0O c21093o0000o0O = new C21093o0000o0O();
            if (c21096o0000oO0.f61184OooO0o0 != null) {
                c21093o0000o0O.OooO0o0();
            }
            if (c21096o0000oO0.f61183OooO0o != null) {
                c21093o0000o0O.f61163Oooo000 = new C20481OooOOoo<>((Object) null);
            }
            C21096o0000oO0 c21096o0000oO0OooO0oO = c21093o0000o0O.OooO0oO();
            try {
                c21096o0000oO0OooO0oO.OooO0Oo();
                C21112ooOO<Object> c21112ooOO = o00oo02.f61249OooO00o;
                InterfaceC21033OooOOOO.OooO00o.C18979OooO00o c18979OooO00o = InterfaceC21033OooOOOO.OooO00o.f60894OooO00o;
                c21096o0000oO0OooO0oO.Oooo0O0(c21112ooOO, 126665345, c18979OooO00o, false);
                C21096o0000oO0.OooOo0(c21096o0000oO0OooO0oO);
                c21096o0000oO0OooO0oO.Oooo0o0(o00oo02.f61250OooO0O0);
                List listOooOoO0 = c21096o0000oO0.OooOoO0(o00oo02.f61254OooO0o0, c21096o0000oO0OooO0oO);
                c21096o0000oO0OooO0oO.OooOooo();
                c21096o0000oO0OooO0oO.OooO();
                c21096o0000oO0OooO0oO.OooOO0();
                c21096o0000oO0OooO0oO.OooO0o0(true);
                o00O0O o00o0o2 = new o00O0O(c21093o0000o0O);
                if (!listOooOoO0.isEmpty()) {
                    int size = listOooOoO0.size();
                    int i = 0;
                    while (true) {
                        if (i >= size) {
                            break;
                        }
                        C21025OooO0o0 c21025OooO0o0 = (C21025OooO0o0) listOooOoO0.get(i);
                        if (c21093o0000o0O.OooO0oo(c21025OooO0o0)) {
                            int iOooO0Oo = c21093o0000o0O.OooO0Oo(c21025OooO0o0);
                            int iOooOO0O = C21091o0000o.OooOO0O(c21093o0000o0O.f61155OooOo0o, iOooO0Oo);
                            int i2 = iOooO0Oo + 1;
                            if (((i2 < c21093o0000o0O.f61154OooOo ? c21093o0000o0O.f61155OooOo0o[(i2 * 5) + 4] : c21093o0000o0O.f61157OooOoO0.length) - iOooOO0O > 0 ? c21093o0000o0O.f61157OooOoO0[iOooOO0O] : c18979OooO00o) instanceof o00000OO) {
                                C21136OooO0o0 c21136OooO0o0 = new C21136OooO0o0(interfaceC21055Oooo0OO, o00oo02);
                                c21096o0000oO0OooO0oO = c21093o0000o0O.OooO0oO();
                                try {
                                    o00000OO.OooO00o.OooO00o(c21096o0000oO0OooO0oO, listOooOoO0, c21136OooO0o0);
                                    C32460OooOooO c32460OooOooO = C32460OooOooO.f116667OooO00o;
                                    c21096o0000oO0OooO0oO.OooO0o0(true);
                                    break;
                                } finally {
                                }
                            }
                        }
                        i++;
                    }
                }
                abstractC21043OooOoO.OooOO0O(o00oo02, o00o0o2);
            } finally {
            }
        }

        @Override // Oooo0oo.AbstractC21116OooO0Oo
        public final String OooO0OO(int i) {
            return i == 0 ? "composition" : i == 1 ? "parentCompositionContext" : i == 2 ? "reference" : super.OooO0OO(i);
        }
    }

    /* JADX INFO: renamed from: Oooo0oo.OooO0Oo$OooOo */
    public static final class OooOo extends AbstractC21116OooO0Oo {

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        public static final OooOo f61306OooO0OO;

        static {
            int i = 1;
            f61306OooO0OO = new OooOo(0, i, i);
        }

        @Override // Oooo0oo.AbstractC21116OooO0Oo
        public final void OooO00o(C21137OooO0oO.OooO00o oooO00o, InterfaceC21026OooO0oO interfaceC21026OooO0oO, C21096o0000oO0 c21096o0000oO0, C21047OooOoo0.OooO00o oooO00o2) {
            oooO00o2.f60985OooO0Oo.add((oO0O000o.OooO00o) oooO00o.OooO0O0(0));
        }

        @Override // Oooo0oo.AbstractC21116OooO0Oo
        public final String OooO0OO(int i) {
            return i == 0 ? "effect" : super.OooO0OO(i);
        }
    }

    /* JADX INFO: renamed from: Oooo0oo.OooO0Oo$OooOo0, reason: case insensitive filesystem */
    public static final class C21125OooOo0 extends AbstractC21116OooO0Oo {

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        public static final C21125OooOo0 f61307OooO0OO;

        static {
            int i = 0;
            f61307OooO0OO = new C21125OooOo0(i, i, 3);
        }

        @Override // Oooo0oo.AbstractC21116OooO0Oo
        public final void OooO00o(C21137OooO0oO.OooO00o oooO00o, InterfaceC21026OooO0oO interfaceC21026OooO0oO, C21096o0000oO0 c21096o0000oO0, C21047OooOoo0.OooO00o oooO00o2) {
            C21038OooOo.OooO0o(c21096o0000oO0, oooO00o2);
        }
    }

    /* JADX INFO: renamed from: Oooo0oo.OooO0Oo$OooOo00 */
    public static final class OooOo00 extends AbstractC21116OooO0Oo {

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        public static final OooOo00 f61308OooO0OO;

        static {
            int i = 1;
            f61308OooO0OO = new OooOo00(0, i, i);
        }

        @Override // Oooo0oo.AbstractC21116OooO0Oo
        public final void OooO00o(C21137OooO0oO.OooO00o oooO00o, InterfaceC21026OooO0oO interfaceC21026OooO0oO, C21096o0000oO0 c21096o0000oO0, C21047OooOoo0.OooO00o oooO00o2) {
            oooO00o2.OooO0o0((o0000OO0) oooO00o.OooO0O0(0));
        }

        @Override // Oooo0oo.AbstractC21116OooO0Oo
        public final String OooO0OO(int i) {
            return i == 0 ? "value" : super.OooO0OO(i);
        }
    }

    /* JADX INFO: renamed from: Oooo0oo.OooO0Oo$OooOo0O, reason: case insensitive filesystem */
    public static final class C21126OooOo0O extends AbstractC21116OooO0Oo {

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        public static final C21126OooOo0O f61309OooO0OO;

        static {
            int i = 2;
            f61309OooO0OO = new C21126OooOo0O(i, 0, i);
        }

        @Override // Oooo0oo.AbstractC21116OooO0Oo
        public final void OooO00o(C21137OooO0oO.OooO00o oooO00o, InterfaceC21026OooO0oO interfaceC21026OooO0oO, C21096o0000oO0 c21096o0000oO0, C21047OooOoo0.OooO00o oooO00o2) {
            interfaceC21026OooO0oO.OooO00o(oooO00o.OooO00o(0), oooO00o.OooO00o(1));
        }

        @Override // Oooo0oo.AbstractC21116OooO0Oo
        public final String OooO0O0(int i) {
            return i == 0 ? "removeIndex" : i == 1 ? C18293o1.f55803f : super.OooO0O0(i);
        }
    }

    /* JADX INFO: renamed from: Oooo0oo.OooO0Oo$OooOo0o, reason: case insensitive filesystem */
    public static final class C21127OooOo0o extends AbstractC21116OooO0Oo {

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        public static final C21127OooOo0o f61310OooO0OO;

        static {
            int i = 0;
            f61310OooO0OO = new C21127OooOo0o(i, i, 3);
        }

        @Override // Oooo0oo.AbstractC21116OooO0Oo
        public final void OooO00o(C21137OooO0oO.OooO00o oooO00o, InterfaceC21026OooO0oO interfaceC21026OooO0oO, C21096o0000oO0 c21096o0000oO0, C21047OooOoo0.OooO00o oooO00o2) {
            if (c21096o0000oO0.f61190OooOOO != 0) {
                C21038OooOo.OooO0OO("Cannot reset when inserting");
                throw null;
            }
            c21096o0000oO0.OooOoOO();
            c21096o0000oO0.f61196OooOOoo = 0;
            c21096o0000oO0.f61198OooOo00 = c21096o0000oO0.OooOOO0() - c21096o0000oO0.f61186OooO0oo;
            c21096o0000oO0.f61178OooO = 0;
            c21096o0000oO0.f61187OooOO0 = 0;
            c21096o0000oO0.f61192OooOOOO = 0;
        }
    }

    /* JADX INFO: renamed from: Oooo0oo.OooO0Oo$OooOoO, reason: case insensitive filesystem */
    public static final class C21128OooOoO extends AbstractC21116OooO0Oo {

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        public static final C21128OooOoO f61311OooO0OO = new C21128OooOoO(1, 0, 2);

        @Override // Oooo0oo.AbstractC21116OooO0Oo
        public final void OooO00o(C21137OooO0oO.OooO00o oooO00o, InterfaceC21026OooO0oO interfaceC21026OooO0oO, C21096o0000oO0 c21096o0000oO0, C21047OooOoo0.OooO00o oooO00o2) {
            int iOooO00o = oooO00o.OooO00o(0);
            int iOooOOOO = c21096o0000oO0.OooOOOO();
            int i = c21096o0000oO0.f61197OooOo0;
            int iOooo00O = c21096o0000oO0.Oooo00O(c21096o0000oO0.f61180OooO0O0, c21096o0000oO0.OooOOOo(i));
            int iOooO0o = c21096o0000oO0.OooO0o(c21096o0000oO0.f61180OooO0O0, c21096o0000oO0.OooOOOo(i + 1));
            for (int iMax = Math.max(iOooo00O, iOooO0o - iOooO00o); iMax < iOooO0o; iMax++) {
                Object obj = c21096o0000oO0.f61181OooO0OO[c21096o0000oO0.OooO0oO(iMax)];
                if (obj instanceof o0000OO) {
                    oooO00o2.OooO0Oo(iOooOOOO - iMax, -1, -1, ((o0000OO) obj).f61132OooO00o);
                } else if (obj instanceof o00000OO) {
                    ((o00000OO) obj).OooO0Oo();
                }
            }
            C21038OooOo.OooO0oO(iOooO00o > 0);
            int i2 = c21096o0000oO0.f61197OooOo0;
            int iOooo00O2 = c21096o0000oO0.Oooo00O(c21096o0000oO0.f61180OooO0O0, c21096o0000oO0.OooOOOo(i2));
            int iOooO0o2 = c21096o0000oO0.OooO0o(c21096o0000oO0.f61180OooO0O0, c21096o0000oO0.OooOOOo(i2 + 1)) - iOooO00o;
            C21038OooOo.OooO0oO(iOooO0o2 >= iOooo00O2);
            c21096o0000oO0.OooOooO(iOooO0o2, iOooO00o, i2);
            int i3 = c21096o0000oO0.f61178OooO;
            if (i3 >= iOooo00O2) {
                c21096o0000oO0.f61178OooO = i3 - iOooO00o;
            }
        }

        @Override // Oooo0oo.AbstractC21116OooO0Oo
        public final String OooO0O0(int i) {
            return i == 0 ? C18293o1.f55803f : super.OooO0O0(i);
        }
    }

    /* JADX INFO: renamed from: Oooo0oo.OooO0Oo$OooOoO0, reason: case insensitive filesystem */
    public static final class C21129OooOoO0 extends AbstractC21116OooO0Oo {

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        public static final C21129OooOoO0 f61312OooO0OO;

        static {
            int i = 0;
            f61312OooO0OO = new C21129OooOoO0(i, i, 3);
        }

        @Override // Oooo0oo.AbstractC21116OooO0Oo
        public final void OooO00o(C21137OooO0oO.OooO00o oooO00o, InterfaceC21026OooO0oO interfaceC21026OooO0oO, C21096o0000oO0 c21096o0000oO0, C21047OooOoo0.OooO00o oooO00o2) {
            c21096o0000oO0.Oooo000();
        }
    }

    /* JADX INFO: renamed from: Oooo0oo.OooO0Oo$OooOoOO, reason: case insensitive filesystem */
    public static final class C21130OooOoOO extends AbstractC21116OooO0Oo {

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        public static final C21130OooOoOO f61313OooO0OO = new C21130OooOoOO(1, 2);

        @Override // Oooo0oo.AbstractC21116OooO0Oo
        public final void OooO00o(C21137OooO0oO.OooO00o oooO00o, InterfaceC21026OooO0oO interfaceC21026OooO0oO, C21096o0000oO0 c21096o0000oO0, C21047OooOoo0.OooO00o oooO00o2) {
            int iOooO0OO;
            int iOooOOOO;
            Object objOooO0O0 = oooO00o.OooO0O0(0);
            C21025OooO0o0 c21025OooO0o0 = (C21025OooO0o0) oooO00o.OooO0O0(1);
            int iOooO00o = oooO00o.OooO00o(0);
            if (objOooO0O0 instanceof o0000OO) {
                oooO00o2.OooO0o0(((o0000OO) objOooO0O0).f61132OooO00o);
            }
            int iOooO0OO2 = c21096o0000oO0.OooO0OO(c21025OooO0o0);
            int iOooO0oO = c21096o0000oO0.OooO0oO(c21096o0000oO0.Oooo00o(iOooO0OO2, iOooO00o));
            Object[] objArr = c21096o0000oO0.f61181OooO0OO;
            Object obj = objArr[iOooO0oO];
            objArr[iOooO0oO] = objOooO0O0;
            if (!(obj instanceof o0000OO)) {
                if (obj instanceof o00000OO) {
                    ((o00000OO) obj).OooO0Oo();
                    return;
                }
                return;
            }
            int iOooOOOO2 = c21096o0000oO0.OooOOOO() - c21096o0000oO0.Oooo00o(iOooO0OO2, iOooO00o);
            o0000OO o0000oo2 = (o0000OO) obj;
            C21025OooO0o0 c21025OooO0o02 = o0000oo2.f61133OooO0O0;
            if (c21025OooO0o02 == null || !c21025OooO0o02.OooO00o()) {
                iOooO0OO = -1;
                iOooOOOO = -1;
            } else {
                iOooO0OO = c21096o0000oO0.OooO0OO(c21025OooO0o02);
                iOooOOOO = c21096o0000oO0.OooOOOO() - c21096o0000oO0.OooO0o(c21096o0000oO0.f61180OooO0O0, c21096o0000oO0.OooOOOo(c21096o0000oO0.OooOOo0(iOooO0OO) + iOooO0OO));
            }
            oooO00o2.OooO0Oo(iOooOOOO2, iOooO0OO, iOooOOOO, o0000oo2.f61132OooO00o);
        }

        @Override // Oooo0oo.AbstractC21116OooO0Oo
        public final String OooO0O0(int i) {
            return i == 0 ? "groupSlotIndex" : super.OooO0O0(i);
        }

        @Override // Oooo0oo.AbstractC21116OooO0Oo
        public final String OooO0OO(int i) {
            return i == 0 ? "value" : i == 1 ? "anchor" : super.OooO0OO(i);
        }
    }

    /* JADX INFO: renamed from: Oooo0oo.OooO0Oo$OooOoo, reason: case insensitive filesystem */
    public static final class C21131OooOoo extends AbstractC21116OooO0Oo {

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        public static final C21131OooOoo f61314OooO0OO = new C21131OooOoo(0, 2, 1);

        @Override // Oooo0oo.AbstractC21116OooO0Oo
        public final void OooO00o(C21137OooO0oO.OooO00o oooO00o, InterfaceC21026OooO0oO interfaceC21026OooO0oO, C21096o0000oO0 c21096o0000oO0, C21047OooOoo0.OooO00o oooO00o2) {
            ((InterfaceC32508OooOOOo) oooO00o.OooO0O0(1)).invoke(interfaceC21026OooO0oO.OooO0o0(), oooO00o.OooO0O0(0));
        }

        @Override // Oooo0oo.AbstractC21116OooO0Oo
        public final String OooO0OO(int i) {
            return i == 0 ? "value" : i == 1 ? "block" : super.OooO0OO(i);
        }
    }

    /* JADX INFO: renamed from: Oooo0oo.OooO0Oo$OooOoo0, reason: case insensitive filesystem */
    public static final class C21132OooOoo0 extends AbstractC21116OooO0Oo {

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        public static final C21132OooOoo0 f61315OooO0OO;

        static {
            int i = 1;
            f61315OooO0OO = new C21132OooOoo0(0, i, i);
        }

        @Override // Oooo0oo.AbstractC21116OooO0Oo
        public final void OooO00o(C21137OooO0oO.OooO00o oooO00o, InterfaceC21026OooO0oO interfaceC21026OooO0oO, C21096o0000oO0 c21096o0000oO0, C21047OooOoo0.OooO00o oooO00o2) {
            c21096o0000oO0.Oooo0o(oooO00o.OooO0O0(0));
        }

        @Override // Oooo0oo.AbstractC21116OooO0Oo
        public final String OooO0OO(int i) {
            return i == 0 ? Constants.ScionAnalytics.MessageType.DATA_MESSAGE : super.OooO0OO(i);
        }
    }

    /* JADX INFO: renamed from: Oooo0oo.OooO0Oo$OooOooO, reason: case insensitive filesystem */
    public static final class C21133OooOooO extends AbstractC21116OooO0Oo {

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        public static final C21133OooOooO f61316OooO0OO = new C21133OooOooO(1, 1);

        @Override // Oooo0oo.AbstractC21116OooO0Oo
        public final void OooO00o(C21137OooO0oO.OooO00o oooO00o, InterfaceC21026OooO0oO interfaceC21026OooO0oO, C21096o0000oO0 c21096o0000oO0, C21047OooOoo0.OooO00o oooO00o2) {
            Object objOooO0O0 = oooO00o.OooO0O0(0);
            int iOooO00o = oooO00o.OooO00o(0);
            if (objOooO0O0 instanceof o0000OO) {
                oooO00o2.OooO0o0(((o0000OO) objOooO0O0).f61132OooO00o);
            }
            int iOooO0oO = c21096o0000oO0.OooO0oO(c21096o0000oO0.Oooo00o(c21096o0000oO0.f61196OooOOoo, iOooO00o));
            Object[] objArr = c21096o0000oO0.f61181OooO0OO;
            Object obj = objArr[iOooO0oO];
            objArr[iOooO0oO] = objOooO0O0;
            if (obj instanceof o0000OO) {
                oooO00o2.OooO0Oo(c21096o0000oO0.OooOOOO() - c21096o0000oO0.Oooo00o(c21096o0000oO0.f61196OooOOoo, iOooO00o), -1, -1, ((o0000OO) obj).f61132OooO00o);
            } else if (obj instanceof o00000OO) {
                ((o00000OO) obj).OooO0Oo();
            }
        }

        @Override // Oooo0oo.AbstractC21116OooO0Oo
        public final String OooO0O0(int i) {
            return i == 0 ? "groupSlotIndex" : super.OooO0O0(i);
        }

        @Override // Oooo0oo.AbstractC21116OooO0Oo
        public final String OooO0OO(int i) {
            return i == 0 ? "value" : super.OooO0OO(i);
        }
    }

    /* JADX INFO: renamed from: Oooo0oo.OooO0Oo$OooOooo, reason: case insensitive filesystem */
    public static final class C21134OooOooo extends AbstractC21116OooO0Oo {

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        public static final C21134OooOooo f61317OooO0OO = new C21134OooOooo(1, 0, 2);

        @Override // Oooo0oo.AbstractC21116OooO0Oo
        public final void OooO00o(C21137OooO0oO.OooO00o oooO00o, InterfaceC21026OooO0oO interfaceC21026OooO0oO, C21096o0000oO0 c21096o0000oO0, C21047OooOoo0.OooO00o oooO00o2) {
            int iOooO00o = oooO00o.OooO00o(0);
            for (int i = 0; i < iOooO00o; i++) {
                interfaceC21026OooO0oO.mo0up();
            }
        }

        @Override // Oooo0oo.AbstractC21116OooO0Oo
        public final String OooO0O0(int i) {
            return i == 0 ? C18293o1.f55803f : super.OooO0O0(i);
        }
    }

    /* JADX INFO: renamed from: Oooo0oo.OooO0Oo$Oooo000 */
    public static final class Oooo000 extends AbstractC21116OooO0Oo {

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        public static final Oooo000 f61318OooO0OO;

        static {
            int i = 0;
            f61318OooO0OO = new Oooo000(i, i, 3);
        }

        @Override // Oooo0oo.AbstractC21116OooO0Oo
        public final void OooO00o(C21137OooO0oO.OooO00o oooO00o, InterfaceC21026OooO0oO interfaceC21026OooO0oO, C21096o0000oO0 c21096o0000oO0, C21047OooOoo0.OooO00o oooO00o2) {
            Object objOooO0o0 = interfaceC21026OooO0oO.OooO0o0();
            kotlin.jvm.internal.OooOOO0.OooO0o0(objOooO0o0, "null cannot be cast to non-null type androidx.compose.runtime.ComposeNodeLifecycleCallback");
            ((InterfaceC21032OooOOO0) objOooO0o0).OooO0oO();
        }
    }

    public AbstractC21116OooO0Oo(int i, int i2) {
        this.f61285OooO00o = i;
        this.f61286OooO0O0 = i2;
    }

    public abstract void OooO00o(C21137OooO0oO.OooO00o oooO00o, InterfaceC21026OooO0oO interfaceC21026OooO0oO, C21096o0000oO0 c21096o0000oO0, C21047OooOoo0.OooO00o oooO00o2);

    public String OooO0O0(int i) {
        return "IntParameter(" + i + ')';
    }

    public String OooO0OO(int i) {
        return "ObjectParameter(" + i + ')';
    }

    public final String toString() {
        String strOooOO0 = C24035Oooo00o.f80943OooO00o.OooO0O0(getClass()).OooOO0();
        return strOooOO0 == null ? "" : strOooOO0;
    }

    public /* synthetic */ AbstractC21116OooO0Oo(int i, int i2, int i3) {
        this((i3 & 1) != 0 ? 0 : i, (i3 & 2) != 0 ? 0 : i2);
    }
}
