package oO0Oo0o0;

import oO0Ooo0.InterfaceC33370OooOO0;
import oO0Ooo0.InterfaceC33373OooOOO;

/* JADX INFO: loaded from: classes10.dex */
public final class OooO extends oO0Oo0o0.OooO00o {

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final InterfaceC33370OooOO0<OooOO0> f120183OooO0O0;

    public static final class OooO00o extends kotlin.jvm.internal.OooOOOO implements oO0O000o.OooO00o<OooOO0> {

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public final /* synthetic */ oO0O000o.OooO00o<OooOO0> f120184OooOo0o;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public OooO00o(oO0O000o.OooO00o<? extends OooOO0> oooO00o) {
            super(0);
            this.f120184OooOo0o = oooO00o;
        }

        @Override // oO0O000o.OooO00o
        public final OooOO0 invoke() {
            OooOO0 oooOO0Invoke = this.f120184OooOo0o.invoke();
            return oooOO0Invoke instanceof oO0Oo0o0.OooO00o ? ((oO0Oo0o0.OooO00o) oooOO0Invoke).OooO0oo() : oooOO0Invoke;
        }
    }

    public OooO(InterfaceC33373OooOOO storageManager, oO0O000o.OooO00o<? extends OooOO0> oooO00o) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(storageManager, "storageManager");
        this.f120183OooO0O0 = storageManager.OooO00o(new OooO00o(oooO00o));
    }

    @Override // oO0Oo0o0.OooO00o
    public final OooOO0 OooO() {
        return this.f120183OooO0O0.invoke();
    }
}
