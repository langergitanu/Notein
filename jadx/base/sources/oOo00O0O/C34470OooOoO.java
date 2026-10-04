package oOo00O0O;

import Ooooo00.C21246OooO0OO;
import oO0o.AbstractC33534OooOO0o;
import oO0o.C33532OooO0oO;
import oO0o.InterfaceC33531OooO0o0;
import oO0o0ooO.InterfaceC33911OooO0OO;
import oO0oO000.InterfaceC34004OooO0Oo;
import ooOOoOO0.C35124OooOOOo;

/* JADX INFO: renamed from: oOo00O0O.OooOoO, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C34470OooOoO implements InterfaceC33911OooO0OO<C34471OooOoO0> {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public static final C34470OooOoO f123529OooO00o = new C34470OooOoO();

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public static final C33532OooO0oO f123530OooO0O0 = oO0o.OooOO0O.OooO0OO("kotlinx.serialization.json.JsonNull", AbstractC33534OooOO0o.OooO0O0.f121131OooO00o, new InterfaceC33531OooO0o0[0], new oO0o.OooOO0());

    @Override // oO0o0ooO.InterfaceC33910OooO0O0
    public final Object deserialize(oO0oO000.OooO0OO oooO0OO) {
        C21246OooO0OO.OooO0OO(oooO0OO);
        if (oooO0OO.OooOoo0()) {
            throw new C35124OooOOOo("Expected 'null' literal");
        }
        return C34471OooOoO0.INSTANCE;
    }

    @Override // oO0o0ooO.InterfaceC33911OooO0OO, oO0o0ooO.InterfaceC33910OooO0O0
    public final InterfaceC33531OooO0o0 getDescriptor() {
        return f123530OooO0O0;
    }

    @Override // oO0o0ooO.InterfaceC33911OooO0OO
    public final void serialize(InterfaceC34004OooO0Oo encoder, Object obj) {
        C34471OooOoO0 value = (C34471OooOoO0) obj;
        kotlin.jvm.internal.OooOOO0.OooO0oO(encoder, "encoder");
        kotlin.jvm.internal.OooOOO0.OooO0oO(value, "value");
        C21246OooO0OO.OooO00o(encoder);
        encoder.OooOoO();
    }
}
