package oO000Oo;

import com.google.common.base.Preconditions;
import oO000Oo.InterfaceC31948OooOOoo;
import oO0OOo0o.C33082Oooo00O;
import oO0OOo0o.C33094OoooO;
import oO0OOo0o.C33101OoooOO0;

/* JADX INFO: renamed from: oO000Oo.Oooo0OO, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C31981Oooo0OO implements OooOo00 {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final oO0OOo0o.o00Oo0 f114203OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final InterfaceC31948OooOOoo.OooO00o f114204OooO0O0;

    public C31981Oooo0OO(oO0OOo0o.o00Oo0 o00oo02, InterfaceC31948OooOOoo.OooO00o oooO00o) {
        Preconditions.checkArgument(!o00oo02.OooO0o(), "error must not be OK");
        this.f114203OooO00o = o00oo02;
        this.f114204OooO0O0 = oooO00o;
    }

    @Override // oO0OOo0o.Oooo000
    public final C33082Oooo00O OooO0OO() {
        throw new UnsupportedOperationException("Not a real transport");
    }

    @Override // oO000Oo.OooOo00
    public final InterfaceC31946OooOOo OooO0Oo(C33101OoooOO0<?, ?> c33101OoooOO0, C33094OoooO c33094OoooO, oO0OOo0o.OooO0OO oooO0OO, oO0OOo0o.OooO[] oooOArr) {
        return new C31980Oooo0O0(this.f114203OooO00o, this.f114204OooO0O0, oooOArr);
    }
}
