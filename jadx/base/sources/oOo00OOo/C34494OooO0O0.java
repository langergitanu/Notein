package oOo00OOo;

import OooOoOO.C20519OooO0Oo;
import kotlin.jvm.internal.OooOOO0;
import kotlin.jvm.internal.OooOOOO;
import oO00ooO.EnumC32441OooOO0O;
import oO0O0OO.InterfaceC32597OooO0oO;
import oO0O0ooO.InterfaceC32821OooO0oO;
import oOo0oooO.InterfaceC34588OooO0oO;
import ooOOO0Oo.OooOo;

/* JADX INFO: renamed from: oOo00OOo.OooO0O0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C34494OooO0O0 {

    /* JADX INFO: renamed from: oOo00OOo.OooO0O0$OooO00o */
    public static final class OooO00o extends OooOOOO implements oO0O000o.OooO00o<OooOo> {

        /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
        public final /* synthetic */ InterfaceC34588OooO0oO f123603OooOo;

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public final /* synthetic */ C34499OooO0oO f123604OooOo0o;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO00o(C34499OooO0oO c34499OooO0oO, InterfaceC34588OooO0oO interfaceC34588OooO0oO) {
            super(0);
            this.f123604OooOo0o = c34499OooO0oO;
            this.f123603OooOo = interfaceC34588OooO0oO;
        }

        /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, oO00ooO.OooOO0] */
        @Override // oO0O000o.OooO00o
        public final OooOo invoke() {
            C34499OooO0oO c34499OooO0oO = this.f123604OooOo0o;
            OooOOO0.OooO0oO(c34499OooO0oO, "<this>");
            InterfaceC34588OooO0oO additionalAnnotations = this.f123603OooOo;
            OooOOO0.OooO0oO(additionalAnnotations, "additionalAnnotations");
            C34495OooO0OO c34495OooO0OO = c34499OooO0oO.f123639OooO00o;
            return c34495OooO0OO.f123622OooOOo0.OooO0O0((OooOo) c34499OooO0oO.f123642OooO0Oo.getValue(), additionalAnnotations);
        }
    }

    public static C34499OooO0oO OooO00o(C34499OooO0oO c34499OooO0oO, InterfaceC32597OooO0oO interfaceC32597OooO0oO, InterfaceC32821OooO0oO interfaceC32821OooO0oO, int i) {
        if ((i & 2) != 0) {
            interfaceC32821OooO0oO = null;
        }
        OooOOO0.OooO0oO(c34499OooO0oO, "<this>");
        return new C34499OooO0oO(c34499OooO0oO.f123639OooO00o, interfaceC32821OooO0oO != null ? new C34500OooO0oo(c34499OooO0oO, interfaceC32597OooO0oO, interfaceC32821OooO0oO, 0) : c34499OooO0oO.f123640OooO0O0, C20519OooO0Oo.OooO0O0(EnumC32441OooOO0O.f116636OooOoO0, new C34493OooO00o(c34499OooO0oO, interfaceC32597OooO0oO)));
    }

    public static final C34499OooO0oO OooO0O0(C34499OooO0oO c34499OooO0oO, InterfaceC34588OooO0oO additionalAnnotations) {
        OooOOO0.OooO0oO(c34499OooO0oO, "<this>");
        OooOOO0.OooO0oO(additionalAnnotations, "additionalAnnotations");
        if (additionalAnnotations.isEmpty()) {
            return c34499OooO0oO;
        }
        return new C34499OooO0oO(c34499OooO0oO.f123639OooO00o, c34499OooO0oO.f123640OooO0O0, C20519OooO0Oo.OooO0O0(EnumC32441OooOO0O.f116636OooOoO0, new OooO00o(c34499OooO0oO, additionalAnnotations)));
    }
}
