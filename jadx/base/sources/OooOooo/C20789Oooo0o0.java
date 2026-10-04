package OooOooo;

import o0000Ooo.C24228OooO0O0;
import o0000Ooo.EnumC24238OooOOO;
import o00O0oOo.AbstractC24958OooOO0o;
import o0ooOO0.C31604o0ooOoO;
import oO00ooO.C32460OooOooO;
import oO0O000o.InterfaceC32507OooOO0o;
import oOo000Oo.C34436OooOoOO;
import oo000o.AbstractC34655Oooo0o;
import oo000o.InterfaceC34637OooOOo;
import oo000o.InterfaceC34641OooOo0O;
import oo000o.InterfaceC34643OooOoO;

/* JADX INFO: renamed from: OooOooo.Oooo0o0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C20789Oooo0o0 extends AbstractC24958OooOO0o implements InterfaceC34637OooOOo {

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public final C20787Oooo0OO f59705OooOoO0;

    /* JADX INFO: renamed from: OooOooo.Oooo0o0$OooO00o */
    public static final class OooO00o extends kotlin.jvm.internal.OooOOOO implements InterfaceC32507OooOO0o<AbstractC34655Oooo0o.OooO00o, C32460OooOooO> {

        /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
        public final /* synthetic */ InterfaceC34643OooOoO f59706OooOo;

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public final /* synthetic */ AbstractC34655Oooo0o f59707OooOo0o;

        /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
        public final /* synthetic */ C20789Oooo0o0 f59708OooOoO0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO00o(AbstractC34655Oooo0o abstractC34655Oooo0o, InterfaceC34643OooOoO interfaceC34643OooOoO, C20789Oooo0o0 c20789Oooo0o0) {
            super(1);
            this.f59707OooOo0o = abstractC34655Oooo0o;
            this.f59706OooOo = interfaceC34643OooOoO;
            this.f59708OooOoO0 = c20789Oooo0o0;
        }

        @Override // oO0O000o.InterfaceC32507OooOO0o
        public final C32460OooOooO invoke(AbstractC34655Oooo0o.OooO00o oooO00o) {
            AbstractC34655Oooo0o.OooO00o layout = oooO00o;
            kotlin.jvm.internal.OooOOO0.OooO0oO(layout, "$this$layout");
            C20789Oooo0o0 c20789Oooo0o0 = this.f59708OooOoO0;
            C20787Oooo0OO c20787Oooo0OO = c20789Oooo0o0.f59705OooOoO0;
            InterfaceC34643OooOoO interfaceC34643OooOoO = this.f59706OooOo;
            AbstractC34655Oooo0o.OooO00o.OooO0OO(layout, this.f59707OooOo0o, interfaceC34643OooOoO.o0OoOo0(c20787Oooo0OO.OooO0O0(interfaceC34643OooOoO.getLayoutDirection())), interfaceC34643OooOoO.o0OoOo0(c20789Oooo0o0.f59705OooOoO0.OooO0Oo()));
            return C32460OooOooO.f116667OooO00o;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C20789Oooo0o0(C20787Oooo0OO c20787Oooo0OO, C31604o0ooOoO.OooO00o inspectorInfo) {
        super(inspectorInfo);
        kotlin.jvm.internal.OooOOO0.OooO0oO(inspectorInfo, "inspectorInfo");
        this.f59705OooOoO0 = c20787Oooo0OO;
    }

    @Override // oo000o.InterfaceC34637OooOOo
    public final oo000o.OooOo OooO0O0(InterfaceC34643OooOoO interfaceC34643OooOoO, InterfaceC34641OooOo0O measurable, long j) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(measurable, "measurable");
        EnumC24238OooOOO layoutDirection = interfaceC34643OooOoO.getLayoutDirection();
        C20787Oooo0OO c20787Oooo0OO = this.f59705OooOoO0;
        float f = 0;
        if (Float.compare(c20787Oooo0OO.OooO0O0(layoutDirection), f) < 0 || Float.compare(c20787Oooo0OO.OooO0Oo(), f) < 0 || Float.compare(c20787Oooo0OO.OooO0OO(interfaceC34643OooOoO.getLayoutDirection()), f) < 0 || Float.compare(c20787Oooo0OO.OooO00o(), f) < 0) {
            throw new IllegalArgumentException("Padding must be non-negative");
        }
        int iO0OoOo0 = interfaceC34643OooOoO.o0OoOo0(c20787Oooo0OO.OooO0OO(interfaceC34643OooOoO.getLayoutDirection())) + interfaceC34643OooOoO.o0OoOo0(c20787Oooo0OO.OooO0O0(interfaceC34643OooOoO.getLayoutDirection()));
        int iO0OoOo02 = interfaceC34643OooOoO.o0OoOo0(c20787Oooo0OO.OooO00o()) + interfaceC34643OooOoO.o0OoOo0(c20787Oooo0OO.OooO0Oo());
        AbstractC34655Oooo0o abstractC34655Oooo0oO00ooo = measurable.o00ooo(C24228OooO0O0.OooO0oO(-iO0OoOo0, -iO0OoOo02, j));
        return interfaceC34643OooOoO.o00oO0O(C24228OooO0O0.OooO0o(abstractC34655Oooo0oO00ooo.f124845OooOo0o + iO0OoOo0, j), C24228OooO0O0.OooO0o0(abstractC34655Oooo0oO00ooo.f124844OooOo + iO0OoOo02, j), C34436OooOoOO.f123455OooOo0o, new OooO00o(abstractC34655Oooo0oO00ooo, interfaceC34643OooOoO, this));
    }

    public final boolean equals(Object obj) {
        C20789Oooo0o0 c20789Oooo0o0 = obj instanceof C20789Oooo0o0 ? (C20789Oooo0o0) obj : null;
        if (c20789Oooo0o0 == null) {
            return false;
        }
        return kotlin.jvm.internal.OooOOO0.OooO0O0(this.f59705OooOoO0, c20789Oooo0o0.f59705OooOoO0);
    }

    public final int hashCode() {
        return this.f59705OooOoO0.hashCode();
    }
}
