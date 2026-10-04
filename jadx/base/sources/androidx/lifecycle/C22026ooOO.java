package androidx.lifecycle;

import androidx.lifecycle.AbstractC22019Ooooooo;
import androidx.lifecycle.o00Oo0;
import o0000OOo.C24217OooO0O0;
import o000o00.AbstractC24555OooO00o;
import oO00ooO.InterfaceC32440OooOO0;
import oOoo0.InterfaceC34595OooO0Oo;

/* JADX INFO: renamed from: androidx.lifecycle.ooOO, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C22026ooOO<VM extends AbstractC22019Ooooooo> implements InterfaceC32440OooOO0<VM> {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final kotlin.jvm.internal.OooOOOO f65707OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final InterfaceC34595OooO0Oo<VM> f65708OooOo0o;

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public final kotlin.jvm.internal.OooOOOO f65709OooOoO;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public final oO0O000o.OooO00o<o00Oo0.OooO0O0> f65710OooOoO0;

    /* JADX INFO: renamed from: OooOoOO, reason: collision with root package name */
    public VM f65711OooOoOO;

    /* JADX WARN: Multi-variable type inference failed */
    public C22026ooOO(InterfaceC34595OooO0Oo<VM> viewModelClass, oO0O000o.OooO00o<? extends C22021o00o0O> oooO00o, oO0O000o.OooO00o<? extends o00Oo0.OooO0O0> oooO00o2, oO0O000o.OooO00o<? extends AbstractC24555OooO00o> oooO00o3) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(viewModelClass, "viewModelClass");
        this.f65708OooOo0o = viewModelClass;
        this.f65707OooOo = (kotlin.jvm.internal.OooOOOO) oooO00o;
        this.f65710OooOoO0 = oooO00o2;
        this.f65709OooOoO = (kotlin.jvm.internal.OooOOOO) oooO00o3;
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [kotlin.jvm.internal.OooOOOO, oO0O000o.OooO00o] */
    /* JADX WARN: Type inference failed for: r3v0, types: [kotlin.jvm.internal.OooOOOO, oO0O000o.OooO00o] */
    @Override // oO00ooO.InterfaceC32440OooOO0
    public final Object getValue() {
        VM vm = this.f65711OooOoOO;
        if (vm != null) {
            return vm;
        }
        VM vm2 = (VM) new o00Oo0((C22021o00o0O) this.f65707OooOo.invoke(), this.f65710OooOoO0.invoke(), (AbstractC24555OooO00o) this.f65709OooOoO.invoke()).OooO00o(C24217OooO0O0.OooO0Oo(this.f65708OooOo0o));
        this.f65711OooOoOO = vm2;
        return vm2;
    }

    @Override // oO00ooO.InterfaceC32440OooOO0
    public final boolean isInitialized() {
        return this.f65711OooOoOO != null;
    }
}
