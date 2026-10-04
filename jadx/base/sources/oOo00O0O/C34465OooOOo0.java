package oOo00O0O;

import Ooooo00.C21246OooO0OO;
import o0OoO0oo.o000OO0O;
import oO00ooO.C32442OooOO0o;
import oO0o.AbstractC33525OooO0OO;
import oO0o.C33532OooO0oO;
import oO0o.InterfaceC33531OooO0o0;
import oO0o0ooO.InterfaceC33911OooO0OO;
import oO0oO000.InterfaceC34004OooO0Oo;

/* JADX INFO: renamed from: oOo00O0O.OooOOo0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C34465OooOOo0 implements InterfaceC33911OooO0OO<OooOO0O> {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public static final C34465OooOOo0 f123523OooO00o = new C34465OooOOo0();

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public static final C33532OooO0oO f123524OooO0O0 = oO0o.OooOO0O.OooO0OO("kotlinx.serialization.json.JsonElement", AbstractC33525OooO0OO.OooO0O0.f121104OooO00o, new InterfaceC33531OooO0o0[0], new o000OO0O(1));

    @Override // oO0o0ooO.InterfaceC33910OooO0O0
    public final Object deserialize(oO0oO000.OooO0OO oooO0OO) {
        return C21246OooO0OO.OooO0OO(oooO0OO).OooOOo0();
    }

    @Override // oO0o0ooO.InterfaceC33911OooO0OO, oO0o0ooO.InterfaceC33910OooO0O0
    public final InterfaceC33531OooO0o0 getDescriptor() {
        return f123524OooO0O0;
    }

    @Override // oO0o0ooO.InterfaceC33911OooO0OO
    public final void serialize(InterfaceC34004OooO0Oo encoder, Object obj) {
        OooOO0O value = (OooOO0O) obj;
        kotlin.jvm.internal.OooOOO0.OooO0oO(encoder, "encoder");
        kotlin.jvm.internal.OooOOO0.OooO0oO(value, "value");
        C21246OooO0OO.OooO00o(encoder);
        if (value instanceof AbstractC34475OooOooO) {
            encoder.OooOOOo(C34476OooOooo.f123539OooO00o, value);
        } else if (value instanceof C34474OooOoo0) {
            encoder.OooOOOo(C34473OooOoo.f123533OooO00o, value);
        } else {
            if (!(value instanceof C34458OooO0Oo)) {
                throw new C32442OooOO0o();
            }
            encoder.OooOOOo(C34459OooO0o0.f123506OooO00o, value);
        }
    }
}
