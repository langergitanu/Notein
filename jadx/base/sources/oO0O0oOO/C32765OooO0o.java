package oO0O0oOO;

import java.util.Map;
import kotlin.jvm.internal.C24028OooOoO0;
import kotlin.jvm.internal.C24035Oooo00o;
import kotlin.jvm.internal.OooOOO0;
import kotlin.jvm.internal.OooOOOO;
import o00oO0O.C25515Oooo0O0;
import oO00ooO.C32443OooOOO;
import oO0O0O0o.OooOOO;
import oO0O0ooO.InterfaceC32815OooO00o;
import oO0OOo.AbstractC33038OooO0oO;
import oO0OOo.C33047OooOo0o;
import oO0Ooo0.InterfaceC33370OooOO0;
import oO0OooO0.C33479OooO0o;
import oOo000Oo.Oooo0;
import oOo00OOo.C34499OooO0oO;
import oOoo0.InterfaceC34602OooOO0o;

/* JADX INFO: renamed from: oO0O0oOO.OooO0o, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C32765OooO0o extends C32762OooO0O0 {

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public static final /* synthetic */ InterfaceC34602OooOO0o<Object>[] f117727OooO0oo;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final InterfaceC33370OooOO0 f117728OooO0oO;

    /* JADX INFO: renamed from: oO0O0oOO.OooO0o$OooO00o */
    public static final class OooO00o extends OooOOOO implements oO0O000o.OooO00o<Map<C33479OooO0o, ? extends C33047OooOo0o>> {

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public static final OooO00o f117729OooOo0o = new OooO00o(0);

        @Override // oO0O000o.OooO00o
        public final Map<C33479OooO0o, ? extends C33047OooOo0o> invoke() {
            return Oooo0.OooO0o0(new C32443OooOOO(C32763OooO0OO.f117722OooO00o, new C33047OooOo0o("Deprecated in Java")));
        }
    }

    static {
        kotlin.jvm.internal.Oooo0 oooo0 = C24035Oooo00o.f80943OooO00o;
        f117727OooO0oo = new InterfaceC34602OooOO0o[]{oooo0.OooO0oO(new C24028OooOoO0(oooo0.OooO0O0(C32765OooO0o.class), "allValueArguments", "getAllValueArguments()Ljava/util/Map;"))};
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C32765OooO0o(InterfaceC32815OooO00o interfaceC32815OooO00o, C34499OooO0oO c) {
        super(c, interfaceC32815OooO00o, OooOOO.OooO00o.f117162OooOOO0);
        OooOOO0.OooO0oO(c, "c");
        this.f117728OooO0oO = c.f123639OooO00o.f123606OooO00o.OooO00o(OooO00o.f117729OooOo0o);
    }

    @Override // oO0O0oOO.C32762OooO0O0, oOo0oooO.OooO0OO
    public final Map<C33479OooO0o, AbstractC33038OooO0oO<?>> OooO0O0() {
        return (Map) C25515Oooo0O0.OooO00o(this.f117728OooO0oO, f117727OooO0oo[0]);
    }
}
