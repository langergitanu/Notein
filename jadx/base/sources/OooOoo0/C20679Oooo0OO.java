package OooOoo0;

import OooOooO.C20730OooO0oO;
import OooOooO.C20733OooOO0O;
import OooOooO.C20741OooOOoo;
import OooOooO.InterfaceC20736OooOOO0;
import Oooo0oO.InterfaceC21033OooOOOO;
import OooooOO.C21348Ooooo0o;
import Oooooo0.C21397OooO00o;
import Oooooo0.InterfaceC21402OooO0o0;
import o00oO0O.C25508OooOoo;

/* JADX INFO: renamed from: OooOoo0.Oooo0OO, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C20679Oooo0OO implements InterfaceC20719o00ooo {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public static final C20679Oooo0OO f59367OooO00o = new C20679Oooo0OO();

    /* JADX INFO: renamed from: OooOoo0.Oooo0OO$OooO00o */
    public static final class OooO00o implements oo000o {

        /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
        public final Oooo0oO.o00oO0O f59368OooOo;

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public final Oooo0oO.o00oO0O f59369OooOo0o;

        /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
        public final Oooo0oO.o00oO0O f59370OooOoO0;

        public OooO00o(Oooo0oO.o00oO0O isPressed, Oooo0oO.o00oO0O isHovered, Oooo0oO.o00oO0O isFocused) {
            kotlin.jvm.internal.OooOOO0.OooO0oO(isPressed, "isPressed");
            kotlin.jvm.internal.OooOOO0.OooO0oO(isHovered, "isHovered");
            kotlin.jvm.internal.OooOOO0.OooO0oO(isFocused, "isFocused");
            this.f59369OooOo0o = isPressed;
            this.f59368OooOo = isHovered;
            this.f59370OooOoO0 = isFocused;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // OooOoo0.oo000o
        public final void OoooO0(C25508OooOoo c25508OooOoo) {
            c25508OooOoo.Ooooo0o();
            boolean zBooleanValue = ((Boolean) this.f59369OooOo0o.getValue()).booleanValue();
            C21397OooO00o c21397OooO00o = c25508OooOoo.f86983OooOo0o;
            if (zBooleanValue) {
                InterfaceC21402OooO0o0.OooOooO(c25508OooOoo, C21348Ooooo0o.OooO0O0(0.3f, C21348Ooooo0o.f61761OooO0O0), 0L, c21397OooO00o.OooOOo0(), 122);
            } else if (((Boolean) this.f59368OooOo.getValue()).booleanValue() || ((Boolean) this.f59370OooOoO0.getValue()).booleanValue()) {
                InterfaceC21402OooO0o0.OooOooO(c25508OooOoo, C21348Ooooo0o.OooO0O0(0.1f, C21348Ooooo0o.f61761OooO0O0), 0L, c21397OooO00o.OooOOo0(), 122);
            }
        }
    }

    @Override // OooOoo0.InterfaceC20719o00ooo
    public final oo000o OooO00o(InterfaceC20736OooOOO0 interactionSource, InterfaceC21033OooOOOO interfaceC21033OooOOOO) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(interactionSource, "interactionSource");
        interfaceC21033OooOOOO.OooOo00(1683566979);
        Oooo0oO.o00oO0O o00oo0oOooO0oO = C20741OooOOoo.OooO0oO(interactionSource, interfaceC21033OooOOOO, 0);
        Oooo0oO.o00oO0O o00oo0oOooO00o = C20733OooOO0O.OooO00o(interactionSource, interfaceC21033OooOOOO, 0);
        Oooo0oO.o00oO0O o00oo0oOooO00o2 = C20730OooO0oO.OooO00o(interactionSource, interfaceC21033OooOOOO, 0);
        interfaceC21033OooOOOO.OooOo00(1157296644);
        boolean zOooO0oo = interfaceC21033OooOOOO.OooO0oo(interactionSource);
        Object objOooOo0 = interfaceC21033OooOOOO.OooOo0();
        if (zOooO0oo || objOooOo0 == InterfaceC21033OooOOOO.OooO00o.f60894OooO00o) {
            objOooOo0 = new OooO00o(o00oo0oOooO0oO, o00oo0oOooO00o, o00oo0oOooO00o2);
            interfaceC21033OooOOOO.OooOOo0(objOooOo0);
        }
        interfaceC21033OooOOOO.OooOoo();
        OooO00o oooO00o = (OooO00o) objOooOo0;
        interfaceC21033OooOOOO.OooOoo();
        return oooO00o;
    }
}
