package OooOooo;

import o0000Ooo.C24226OooO;
import o0000Ooo.C24228OooO0O0;
import o0000Ooo.C24235OooOO0;
import o0000Ooo.EnumC24238OooOOO;
import o00oO0O.AbstractC25516Oooo0OO;
import oO00ooO.C32460OooOooO;
import oO0O000o.InterfaceC32507OooOO0o;
import oOo000Oo.C34436OooOoOO;
import oo000o.AbstractC34655Oooo0o;
import oo000o.InterfaceC34630OooOO0;
import oo000o.InterfaceC34637OooOOo;
import oo000o.InterfaceC34641OooOo0O;
import oo000o.InterfaceC34643OooOoO;

/* JADX INFO: renamed from: OooOooo.OooOoo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public interface InterfaceC20777OooOoo extends InterfaceC34637OooOOo {

    /* JADX INFO: renamed from: OooOooo.OooOoo$OooO00o */
    public static final class OooO00o extends kotlin.jvm.internal.OooOOOO implements InterfaceC32507OooOO0o<AbstractC34655Oooo0o.OooO00o, C32460OooOooO> {

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public final /* synthetic */ AbstractC34655Oooo0o f59663OooOo0o;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO00o(AbstractC34655Oooo0o abstractC34655Oooo0o) {
            super(1);
            this.f59663OooOo0o = abstractC34655Oooo0o;
        }

        @Override // oO0O000o.InterfaceC32507OooOO0o
        public final C32460OooOooO invoke(AbstractC34655Oooo0o.OooO00o oooO00o) {
            AbstractC34655Oooo0o.OooO00o layout = oooO00o;
            kotlin.jvm.internal.OooOOO0.OooO0oO(layout, "$this$layout");
            long j = C24226OooO.f81468OooO0O0;
            AbstractC34655Oooo0o.OooO00o.C20369OooO00o c20369OooO00o = AbstractC34655Oooo0o.OooO00o.f124848OooO00o;
            AbstractC34655Oooo0o abstractC34655Oooo0o = this.f59663OooOo0o;
            if (layout.OooO00o() == EnumC24238OooOOO.f81494OooOo0o || layout.OooO0O0() == 0) {
                long jO0ooOO0 = abstractC34655Oooo0o.o0ooOO0();
                abstractC34655Oooo0o.o000OOo(C24235OooOO0.OooO00o(((int) (j >> 32)) + ((int) (jO0ooOO0 >> 32)), ((int) (j & 4294967295L)) + ((int) (jO0ooOO0 & 4294967295L))), 0.0f, null);
            } else {
                long jOooO00o = C24235OooOO0.OooO00o((layout.OooO0O0() - abstractC34655Oooo0o.f124845OooOo0o) - ((int) (j >> 32)), (int) (j & 4294967295L));
                long jO0ooOO02 = abstractC34655Oooo0o.o0ooOO0();
                abstractC34655Oooo0o.o000OOo(C24235OooOO0.OooO00o(((int) (jOooO00o >> 32)) + ((int) (jO0ooOO02 >> 32)), ((int) (jOooO00o & 4294967295L)) + ((int) (jO0ooOO02 & 4294967295L))), 0.0f, null);
            }
            return C32460OooOooO.f116667OooO00o;
        }
    }

    @Override // oo000o.InterfaceC34637OooOOo
    default oo000o.OooOo OooO0O0(InterfaceC34643OooOoO interfaceC34643OooOoO, InterfaceC34641OooOo0O measurable, long j) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(measurable, "measurable");
        AbstractC34655Oooo0o abstractC34655Oooo0oO00ooo = measurable.o00ooo(C24228OooO0O0.OooO0Oo(j, Oooo00O(interfaceC34643OooOoO, measurable, j)));
        return interfaceC34643OooOoO.o00oO0O(abstractC34655Oooo0oO00ooo.f124845OooOo0o, abstractC34655Oooo0oO00ooo.f124844OooOo, C34436OooOoOO.f123455OooOo0o, new OooO00o(abstractC34655Oooo0oO00ooo));
    }

    @Override // oo000o.InterfaceC34637OooOOo
    default int OooO0OO(AbstractC25516Oooo0OO abstractC25516Oooo0OO, InterfaceC34630OooOO0 measurable, int i) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(measurable, "measurable");
        return measurable.OooooOO(i);
    }

    @Override // oo000o.InterfaceC34637OooOOo
    default int OooO0Oo(AbstractC25516Oooo0OO abstractC25516Oooo0OO, InterfaceC34630OooOO0 measurable, int i) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(measurable, "measurable");
        return measurable.Oooo00O(i);
    }

    @Override // oo000o.InterfaceC34637OooOOo
    default int OooO0o(AbstractC25516Oooo0OO abstractC25516Oooo0OO, InterfaceC34630OooOO0 measurable, int i) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(measurable, "measurable");
        return measurable.OooOOoo(i);
    }

    long Oooo00O(InterfaceC34643OooOoO interfaceC34643OooOoO, InterfaceC34641OooOo0O interfaceC34641OooOo0O, long j);
}
