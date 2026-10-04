package Oooo0O0;

import Oooo0.EnumC20853Ooooo0o;
import Oooo0.InterfaceC20865o00000oO;
import Oooo0.o000O0;
import Oooo0.o000O0Oo;
import OooooO0.C21290OooO0o0;
import androidx.compose.runtime.ParcelableSnapshotMutableState;
import o00000.InterfaceC24054OooOo0;
import o00o00Oo.C25256OooO00o;
import o0OoOo0.InterfaceC29198OooO00o;
import oo0o0Oo.C34695OooOOo0;
import oo0o0Oo.C34696OooOOoo;

/* JADX INFO: loaded from: classes.dex */
public final class Oooo000 implements InterfaceC20865o00000oO {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final /* synthetic */ C20935Oooo00o f60399OooO00o;

    public Oooo000(C20935Oooo00o c20935Oooo00o) {
        this.f60399OooO00o = c20935Oooo00o;
    }

    @Override // Oooo0.InterfaceC20865o00000oO
    public final void OooO00o() {
        EnumC20853Ooooo0o enumC20853Ooooo0o = EnumC20853Ooooo0o.f59960OooOo0o;
        C20935Oooo00o c20935Oooo00o = this.f60399OooO00o;
        c20935Oooo00o.f60416OooOOOO.setValue(enumC20853Ooooo0o);
        c20935Oooo00o.f60417OooOOOo.setValue(new C21290OooO0o0(OooOo00.OooO00o(c20935Oooo00o.OooO0oO(true))));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v11, types: [kotlin.jvm.internal.OooOOOO, oO0O000o.OooOO0o] */
    @Override // Oooo0.InterfaceC20865o00000oO
    public final void OooO0O0(long j) {
        o000O0Oo o000o0ooOooO0OO;
        C20935Oooo00o c20935Oooo00o = this.f60399OooO00o;
        c20935Oooo00o.f60414OooOOO = C21290OooO0o0.OooO0o(c20935Oooo00o.f60414OooOOO, j);
        o000O0 o000o0 = c20935Oooo00o.f60406OooO0Oo;
        if (o000o0 == null || (o000o0ooOooO0OO = o000o0.OooO0OO()) == null) {
            return;
        }
        C34695OooOOo0 c34695OooOOo0 = o000o0ooOooO0OO.f60144OooO00o;
        C21290OooO0o0 c21290OooO0o0 = new C21290OooO0o0(C21290OooO0o0.OooO0o(c20935Oooo00o.f60413OooOO0o, c20935Oooo00o.f60414OooOOO));
        ParcelableSnapshotMutableState parcelableSnapshotMutableState = c20935Oooo00o.f60417OooOOOo;
        parcelableSnapshotMutableState.setValue(c21290OooO0o0);
        InterfaceC24054OooOo0 interfaceC24054OooOo0 = c20935Oooo00o.f60404OooO0O0;
        C21290OooO0o0 c21290OooO0o02 = (C21290OooO0o0) parcelableSnapshotMutableState.getValue();
        kotlin.jvm.internal.OooOOO0.OooO0Oo(c21290OooO0o02);
        int iOooO00o = interfaceC24054OooOo0.OooO00o(c34695OooOOo0.OooOO0(c21290OooO0o02.f61722OooO00o));
        long jOooO0OO = C25256OooO00o.OooO0OO(iOooO00o, iOooO00o);
        if (C34696OooOOoo.OooO00o(jOooO0OO, c20935Oooo00o.OooO0oo().f81084OooO0O0)) {
            return;
        }
        InterfaceC29198OooO00o interfaceC29198OooO00o = c20935Oooo00o.f60402OooO;
        if (interfaceC29198OooO00o != null) {
            interfaceC29198OooO00o.OooO00o();
        }
        c20935Oooo00o.f60405OooO0OO.invoke(C20935Oooo00o.OooO0OO(c20935Oooo00o.OooO0oo().f81083OooO00o, jOooO0OO));
    }

    @Override // Oooo0.InterfaceC20865o00000oO
    public final void OooO0OO(long j) {
        C20935Oooo00o c20935Oooo00o = this.f60399OooO00o;
        long jOooO00o = OooOo00.OooO00o(c20935Oooo00o.OooO0oO(true));
        c20935Oooo00o.f60413OooOO0o = jOooO00o;
        c20935Oooo00o.f60417OooOOOo.setValue(new C21290OooO0o0(jOooO00o));
        c20935Oooo00o.f60414OooOOO = C21290OooO0o0.f61718OooO0O0;
        c20935Oooo00o.f60416OooOOOO.setValue(EnumC20853Ooooo0o.f59960OooOo0o);
    }

    @Override // Oooo0.InterfaceC20865o00000oO
    public final void OooO0Oo() {
        C20935Oooo00o c20935Oooo00o = this.f60399OooO00o;
        c20935Oooo00o.f60416OooOOOO.setValue(null);
        c20935Oooo00o.f60417OooOOOo.setValue(null);
    }

    @Override // Oooo0.InterfaceC20865o00000oO
    public final void onCancel() {
    }

    @Override // Oooo0.InterfaceC20865o00000oO
    public final void onStop() {
        C20935Oooo00o c20935Oooo00o = this.f60399OooO00o;
        c20935Oooo00o.f60416OooOOOO.setValue(null);
        c20935Oooo00o.f60417OooOOOo.setValue(null);
    }
}
