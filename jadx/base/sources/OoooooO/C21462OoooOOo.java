package OoooooO;

import Oooo0oO.C21035OooOOo;
import Oooo0oO.C21047OooOoo0;
import Oooo0oO.C21065OoooOOO;
import Oooo0oO.C21105o000OoO;
import Oooo0oO.InterfaceC21033OooOOOO;
import Oooo0oO.InterfaceC21044OooOoO0;
import Oooo0oO.o00000OO;
import Oooo0oO.o000O0O0;
import OooooO0.C21293OooOO0;
import OooooOO.C21349OooooO0;
import Oooooo.AbstractC21396OooO0O0;
import Oooooo0.C21397OooO00o;
import Oooooo0.InterfaceC21402OooO0o0;
import androidx.compose.runtime.ParcelableSnapshotMutableState;
import o0000Ooo.EnumC24238OooOOO;
import o000oOoO.C24633OooO00o;
import oO00ooO.C32460OooOooO;

/* JADX INFO: renamed from: OoooooO.OoooOOo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C21462OoooOOo extends AbstractC21396OooO0O0 {

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    public InterfaceC21044OooOoO0 f62137OooO;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final ParcelableSnapshotMutableState f62138OooO0o;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final ParcelableSnapshotMutableState f62139OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public final C21424OooOO0O f62140OooO0oo;

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    public final ParcelableSnapshotMutableState f62141OooOO0;

    /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
    public float f62142OooOO0O;

    /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
    public C21349OooooO0 f62143OooOO0o;

    /* JADX INFO: renamed from: OoooooO.OoooOOo$OooO00o */
    public static final class OooO00o extends kotlin.jvm.internal.OooOOOO implements oO0O000o.OooO00o<C32460OooOooO> {
        public OooO00o() {
            super(0);
        }

        @Override // oO0O000o.OooO00o
        public final C32460OooOooO invoke() {
            C21462OoooOOo c21462OoooOOo = C21462OoooOOo.this;
            c21462OoooOOo.f62141OooOO0.setValue(Boolean.TRUE);
            return C32460OooOooO.f116667OooO00o;
        }
    }

    public C21462OoooOOo() {
        C21293OooOO0 c21293OooOO0 = new C21293OooOO0(C21293OooOO0.f61728OooO0O0);
        o000O0O0 o000o0o02 = o000O0O0.f61218OooO00o;
        this.f62138OooO0o = C21105o000OoO.OooO0OO(c21293OooOO0, o000o0o02);
        this.f62139OooO0oO = C21105o000OoO.OooO0OO(Boolean.FALSE, o000o0o02);
        C21424OooOO0O c21424OooOO0O = new C21424OooOO0O();
        c21424OooOO0O.f62063OooO0o0 = new OooO00o();
        this.f62140OooO0oo = c21424OooOO0O;
        this.f62141OooOO0 = C21105o000OoO.OooO0OO(Boolean.TRUE, o000o0o02);
        this.f62142OooOO0O = 1.0f;
    }

    @Override // Oooooo.AbstractC21396OooO0O0
    public final boolean OooO00o(float f) {
        this.f62142OooOO0O = f;
        return true;
    }

    @Override // Oooooo.AbstractC21396OooO0O0
    public final boolean OooO0O0(C21349OooooO0 c21349OooooO0) {
        this.f62143OooOO0o = c21349OooooO0;
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // Oooooo.AbstractC21396OooO0O0
    public final long OooO0OO() {
        return ((C21293OooOO0) this.f62138OooO0o.getValue()).f61731OooO00o;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // Oooooo.AbstractC21396OooO0O0
    public final void OooO0Oo(InterfaceC21402OooO0o0 interfaceC21402OooO0o0) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(interfaceC21402OooO0o0, "<this>");
        C21349OooooO0 c21349OooooO0 = this.f62143OooOO0o;
        C21424OooOO0O c21424OooOO0O = this.f62140OooO0oo;
        if (c21349OooooO0 == null) {
            c21349OooooO0 = (C21349OooooO0) c21424OooOO0O.f62062OooO0o.getValue();
        }
        if (((Boolean) this.f62139OooO0oO.getValue()).booleanValue() && interfaceC21402OooO0o0.getLayoutDirection() == EnumC24238OooOOO.f81493OooOo) {
            long jOoooOoo = interfaceC21402OooO0o0.OoooOoo();
            C21397OooO00o.OooO0O0 oooO0O0OoooOo0 = interfaceC21402OooO0o0.OoooOo0();
            long jOooO0O0 = oooO0O0OoooOo0.OooO0O0();
            oooO0O0OoooOo0.OooO00o().OooOOo0();
            oooO0O0OoooOo0.f61919OooO00o.OooO0OO(jOoooOoo);
            c21424OooOO0O.OooO0o0(interfaceC21402OooO0o0, this.f62142OooOO0O, c21349OooooO0);
            oooO0O0OoooOo0.OooO00o().OooOO0o();
            oooO0O0OoooOo0.OooO0OO(jOooO0O0);
        } else {
            c21424OooOO0O.OooO0o0(interfaceC21402OooO0o0, this.f62142OooOO0O, c21349OooooO0);
        }
        ParcelableSnapshotMutableState parcelableSnapshotMutableState = this.f62141OooOO0;
        if (((Boolean) parcelableSnapshotMutableState.getValue()).booleanValue()) {
            parcelableSnapshotMutableState.setValue(Boolean.FALSE);
        }
    }

    /* JADX WARN: Type inference failed for: r0v7, types: [kotlin.jvm.internal.OooOOOO, oO0O000o.OooO00o] */
    /* JADX WARN: Type inference failed for: r2v9, types: [kotlin.jvm.internal.OooOOOO, oO0O000o.OooO00o] */
    public final void OooO0o0(String name, float f, float f2, C24633OooO00o c24633OooO00o, InterfaceC21033OooOOOO interfaceC21033OooOOOO, int i) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(name, "name");
        C21035OooOOo c21035OooOOoOooOOO0 = interfaceC21033OooOOOO.OooOOO0(1264894527);
        C21424OooOO0O c21424OooOO0O = this.f62140OooO0oo;
        c21424OooOO0O.getClass();
        C21407OooO0O0 root = c21424OooOO0O.f62059OooO0O0;
        root.getClass();
        root.f61934OooO = name;
        root.OooO0OO();
        if (c21424OooOO0O.f62064OooO0oO != f) {
            c21424OooOO0O.f62064OooO0oO = f;
            c21424OooOO0O.f62060OooO0OO = true;
            c21424OooOO0O.f62063OooO0o0.invoke();
        }
        if (c21424OooOO0O.f62065OooO0oo != f2) {
            c21424OooOO0O.f62065OooO0oo = f2;
            c21424OooOO0O.f62060OooO0OO = true;
            c21424OooOO0O.f62063OooO0o0.invoke();
        }
        C21035OooOOo.OooO0O0 oooO0O0Oooo000 = c21035OooOOoOooOOO0.Oooo000();
        InterfaceC21044OooOoO0 c21047OooOoo0 = this.f62137OooO;
        if (c21047OooOoo0 == null || c21047OooOoo0.OooO0O0()) {
            kotlin.jvm.internal.OooOOO0.OooO0oO(root, "root");
            c21047OooOoo0 = new C21047OooOoo0(oooO0O0Oooo000, new C21423OooOO0(root));
        }
        this.f62137OooO = c21047OooOoo0;
        c21047OooOoo0.OooOOOO(new C24633OooO00o(-1916507005, true, new C21461OoooOOO(c24633OooO00o, this)));
        C21065OoooOOO.OooO00o(c21047OooOoo0, new C21460OoooOO0(c21047OooOoo0), c21035OooOOoOooOOO0);
        o00000OO o00000ooOoooO0 = c21035OooOOoOooOOO0.OoooO0();
        if (o00000ooOoooO0 == null) {
            return;
        }
        o00000ooOoooO0.f61064OooO0Oo = new C21473o000oOoO(this, name, f, f2, c24633OooO00o, i);
    }
}
