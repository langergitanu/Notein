package Oooo0O0;

import Oooo0.EnumC20853Ooooo0o;
import Oooo0.InterfaceC20865o00000oO;
import Oooo0.o000O0;
import Oooo0.o000O0Oo;
import Oooo0O0.OooOOOO;
import OooooO0.C21290OooO0o0;
import androidx.compose.runtime.ParcelableSnapshotMutableState;
import o00000.InterfaceC24054OooOo0;
import o0ooOO0.EnumC31580o0000oOO;
import o0ooOO0.InterfaceC31574o0000o;
import oo0o0Oo.C34695OooOOo0;
import oo0o0Oo.C34696OooOOoo;

/* JADX INFO: renamed from: Oooo0O0.Oooo00O, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C20934Oooo00O implements InterfaceC20865o00000oO {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final /* synthetic */ C20935Oooo00o f60400OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final /* synthetic */ boolean f60401OooO0O0;

    public C20934Oooo00O(C20935Oooo00o c20935Oooo00o, boolean z) {
        this.f60400OooO00o = c20935Oooo00o;
        this.f60401OooO0O0 = z;
    }

    @Override // Oooo0.InterfaceC20865o00000oO
    public final void OooO00o() {
        boolean z = this.f60401OooO0O0;
        EnumC20853Ooooo0o enumC20853Ooooo0o = z ? EnumC20853Ooooo0o.f59959OooOo : EnumC20853Ooooo0o.f59962OooOoO0;
        C20935Oooo00o c20935Oooo00o = this.f60400OooO00o;
        c20935Oooo00o.f60416OooOOOO.setValue(enumC20853Ooooo0o);
        c20935Oooo00o.f60417OooOOOo.setValue(new C21290OooO0o0(OooOo00.OooO00o(c20935Oooo00o.OooO0oO(z))));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // Oooo0.InterfaceC20865o00000oO
    public final void OooO0O0(long j) {
        o000O0Oo o000o0ooOooO0OO;
        int iOooO0O0;
        int iOooOO0;
        C20935Oooo00o c20935Oooo00o = this.f60400OooO00o;
        c20935Oooo00o.f60414OooOOO = C21290OooO0o0.OooO0o(c20935Oooo00o.f60414OooOOO, j);
        o000O0 o000o0 = c20935Oooo00o.f60406OooO0Oo;
        if (o000o0 != null && (o000o0ooOooO0OO = o000o0.OooO0OO()) != null) {
            C34695OooOOo0 c34695OooOOo0 = o000o0ooOooO0OO.f60144OooO00o;
            C21290OooO0o0 c21290OooO0o0 = new C21290OooO0o0(C21290OooO0o0.OooO0o(c20935Oooo00o.f60413OooOO0o, c20935Oooo00o.f60414OooOOO));
            ParcelableSnapshotMutableState parcelableSnapshotMutableState = c20935Oooo00o.f60417OooOOOo;
            parcelableSnapshotMutableState.setValue(c21290OooO0o0);
            boolean z = this.f60401OooO0O0;
            if (z) {
                C21290OooO0o0 c21290OooO0o02 = (C21290OooO0o0) parcelableSnapshotMutableState.getValue();
                kotlin.jvm.internal.OooOOO0.OooO0Oo(c21290OooO0o02);
                iOooO0O0 = c34695OooOOo0.OooOO0(c21290OooO0o02.f61722OooO00o);
            } else {
                InterfaceC24054OooOo0 interfaceC24054OooOo0 = c20935Oooo00o.f60404OooO0O0;
                long j2 = c20935Oooo00o.OooO0oo().f81084OooO0O0;
                int i = C34696OooOOoo.f124979OooO0OO;
                iOooO0O0 = interfaceC24054OooOo0.OooO0O0((int) (j2 >> 32));
            }
            int i2 = iOooO0O0;
            if (z) {
                InterfaceC24054OooOo0 interfaceC24054OooOo02 = c20935Oooo00o.f60404OooO0O0;
                long j3 = c20935Oooo00o.OooO0oo().f81084OooO0O0;
                int i3 = C34696OooOOoo.f124979OooO0OO;
                iOooOO0 = interfaceC24054OooOo02.OooO0O0((int) (j3 & 4294967295L));
            } else {
                C21290OooO0o0 c21290OooO0o03 = (C21290OooO0o0) parcelableSnapshotMutableState.getValue();
                kotlin.jvm.internal.OooOOO0.OooO0Oo(c21290OooO0o03);
                iOooOO0 = c34695OooOOo0.OooOO0(c21290OooO0o03.f61722OooO00o);
            }
            C20935Oooo00o.OooO00o(c20935Oooo00o, c20935Oooo00o.OooO0oo(), i2, iOooOO0, z, OooOOOO.OooO00o.f60353OooO00o);
        }
        o000O0 o000o02 = c20935Oooo00o.f60406OooO0Oo;
        if (o000o02 == null) {
            return;
        }
        o000o02.f60110OooOO0O = false;
    }

    @Override // Oooo0.InterfaceC20865o00000oO
    public final void OooO0OO(long j) {
        C20935Oooo00o c20935Oooo00o = this.f60400OooO00o;
        boolean z = this.f60401OooO0O0;
        long jOooO00o = OooOo00.OooO00o(c20935Oooo00o.OooO0oO(z));
        c20935Oooo00o.f60413OooOO0o = jOooO00o;
        c20935Oooo00o.f60417OooOOOo.setValue(new C21290OooO0o0(jOooO00o));
        c20935Oooo00o.f60414OooOOO = C21290OooO0o0.f61718OooO0O0;
        c20935Oooo00o.f60416OooOOOO.setValue(z ? EnumC20853Ooooo0o.f59959OooOo : EnumC20853Ooooo0o.f59962OooOoO0);
        o000O0 o000o0 = c20935Oooo00o.f60406OooO0Oo;
        if (o000o0 == null) {
            return;
        }
        o000o0.f60110OooOO0O = false;
    }

    @Override // Oooo0.InterfaceC20865o00000oO
    public final void OooO0Oo() {
        C20935Oooo00o c20935Oooo00o = this.f60400OooO00o;
        c20935Oooo00o.f60416OooOOOO.setValue(null);
        c20935Oooo00o.f60417OooOOOo.setValue(null);
    }

    @Override // Oooo0.InterfaceC20865o00000oO
    public final void onCancel() {
    }

    @Override // Oooo0.InterfaceC20865o00000oO
    public final void onStop() {
        C20935Oooo00o c20935Oooo00o = this.f60400OooO00o;
        c20935Oooo00o.f60416OooOOOO.setValue(null);
        c20935Oooo00o.f60417OooOOOo.setValue(null);
        o000O0 o000o0 = c20935Oooo00o.f60406OooO0Oo;
        if (o000o0 != null) {
            o000o0.f60110OooOO0O = true;
        }
        InterfaceC31574o0000o interfaceC31574o0000o = c20935Oooo00o.f60410OooO0oo;
        if ((interfaceC31574o0000o != null ? interfaceC31574o0000o.getStatus() : null) == EnumC31580o0000oOO.f112837OooOo) {
            c20935Oooo00o.OooOO0o();
        }
    }
}
