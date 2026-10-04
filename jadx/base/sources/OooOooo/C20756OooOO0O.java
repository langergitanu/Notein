package OooOooo;

import o0000Ooo.C24227OooO00o;
import o0000Ooo.C24228OooO0O0;
import o00O0oOo.AbstractC24958OooOO0o;
import oO00ooO.C32460OooOooO;
import oO0O000o.InterfaceC32507OooOO0o;
import oOo000Oo.C34436OooOoOO;
import oo000o.AbstractC34655Oooo0o;
import oo000o.InterfaceC34637OooOOo;
import oo000o.InterfaceC34641OooOo0O;
import oo000o.InterfaceC34643OooOoO;

/* JADX INFO: renamed from: OooOooo.OooOO0O, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C20756OooOO0O extends AbstractC24958OooOO0o implements InterfaceC34637OooOOo {

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public final float f59629OooOoO;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public final EnumC20755OooOO0 f59630OooOoO0;

    /* JADX INFO: renamed from: OooOooo.OooOO0O$OooO00o */
    public static final class OooO00o extends kotlin.jvm.internal.OooOOOO implements InterfaceC32507OooOO0o<AbstractC34655Oooo0o.OooO00o, C32460OooOooO> {

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public final /* synthetic */ AbstractC34655Oooo0o f59631OooOo0o;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO00o(AbstractC34655Oooo0o abstractC34655Oooo0o) {
            super(1);
            this.f59631OooOo0o = abstractC34655Oooo0o;
        }

        @Override // oO0O000o.InterfaceC32507OooOO0o
        public final C32460OooOooO invoke(AbstractC34655Oooo0o.OooO00o oooO00o) {
            AbstractC34655Oooo0o.OooO00o layout = oooO00o;
            kotlin.jvm.internal.OooOOO0.OooO0oO(layout, "$this$layout");
            AbstractC34655Oooo0o.OooO00o.OooO0o(layout, this.f59631OooOo0o, 0, 0);
            return C32460OooOooO.f116667OooO00o;
        }
    }

    public C20756OooOO0O(EnumC20755OooOO0 enumC20755OooOO0, InterfaceC32507OooOO0o interfaceC32507OooOO0o) {
        super(interfaceC32507OooOO0o);
        this.f59630OooOoO0 = enumC20755OooOO0;
        this.f59629OooOoO = 1.0f;
    }

    @Override // oo000o.InterfaceC34637OooOOo
    public final oo000o.OooOo OooO0O0(InterfaceC34643OooOoO interfaceC34643OooOoO, InterfaceC34641OooOo0O measurable, long j) {
        int iOooOO0;
        int iOooO0oo;
        int iOooO0oO;
        int iOooO0o;
        kotlin.jvm.internal.OooOOO0.OooO0oO(measurable, "measurable");
        boolean zOooO0Oo = C24227OooO00o.OooO0Oo(j);
        float f = this.f59629OooOoO;
        EnumC20755OooOO0 enumC20755OooOO0 = this.f59630OooOoO0;
        if (!zOooO0Oo || enumC20755OooOO0 == EnumC20755OooOO0.f59626OooOo0o) {
            iOooOO0 = C24227OooO00o.OooOO0(j);
            iOooO0oo = C24227OooO00o.OooO0oo(j);
        } else {
            iOooOO0 = oO0O00oo.OooOO0.OooO0o(oO0O00O.OooO00o.OooO0O0(C24227OooO00o.OooO0oo(j) * f), C24227OooO00o.OooOO0(j), C24227OooO00o.OooO0oo(j));
            iOooO0oo = iOooOO0;
        }
        if (!C24227OooO00o.OooO0OO(j) || enumC20755OooOO0 == EnumC20755OooOO0.f59625OooOo) {
            int iOooO = C24227OooO00o.OooO(j);
            iOooO0oO = C24227OooO00o.OooO0oO(j);
            iOooO0o = iOooO;
        } else {
            iOooO0o = oO0O00oo.OooOO0.OooO0o(oO0O00O.OooO00o.OooO0O0(C24227OooO00o.OooO0oO(j) * f), C24227OooO00o.OooO(j), C24227OooO00o.OooO0oO(j));
            iOooO0oO = iOooO0o;
        }
        AbstractC34655Oooo0o abstractC34655Oooo0oO00ooo = measurable.o00ooo(C24228OooO0O0.OooO00o(iOooOO0, iOooO0oo, iOooO0o, iOooO0oO));
        return interfaceC34643OooOoO.o00oO0O(abstractC34655Oooo0oO00ooo.f124845OooOo0o, abstractC34655Oooo0oO00ooo.f124844OooOo, C34436OooOoOO.f123455OooOo0o, new OooO00o(abstractC34655Oooo0oO00ooo));
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C20756OooOO0O)) {
            return false;
        }
        C20756OooOO0O c20756OooOO0O = (C20756OooOO0O) obj;
        return this.f59630OooOoO0 == c20756OooOO0O.f59630OooOoO0 && this.f59629OooOoO == c20756OooOO0O.f59629OooOoO;
    }

    public final int hashCode() {
        return Float.hashCode(this.f59629OooOoO) + (this.f59630OooOoO0.hashCode() * 31);
    }
}
