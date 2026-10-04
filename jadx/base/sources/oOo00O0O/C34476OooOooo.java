package oOo00O0O;

import Ooooo00.C21246OooO0OO;
import kotlin.jvm.internal.C24035Oooo00o;
import oO0o.AbstractC33526OooO0Oo;
import oO0o.C33532OooO0oO;
import oO0o.InterfaceC33531OooO0o0;
import oO0o0ooO.InterfaceC33911OooO0OO;
import oO0oO000.InterfaceC34004OooO0Oo;

/* JADX INFO: renamed from: oOo00O0O.OooOooo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C34476OooOooo implements InterfaceC33911OooO0OO<AbstractC34475OooOooO> {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public static final C34476OooOooo f123539OooO00o = new C34476OooOooo();

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public static final C33532OooO0oO f123540OooO0O0 = oO0o.OooOO0O.OooO0OO("kotlinx.serialization.json.JsonPrimitive", AbstractC33526OooO0Oo.OooO.f121105OooO00o, new InterfaceC33531OooO0o0[0], new oO0o.OooOO0());

    @Override // oO0o0ooO.InterfaceC33910OooO0O0
    public final Object deserialize(oO0oO000.OooO0OO oooO0OO) {
        OooOO0O oooOO0OOooOOo0 = C21246OooO0OO.OooO0OO(oooO0OO).OooOOo0();
        if (oooOO0OOooOOo0 instanceof AbstractC34475OooOooO) {
            return (AbstractC34475OooOooO) oooOO0OOooOOo0;
        }
        StringBuilder sb = new StringBuilder("Unexpected JSON element, expected JsonPrimitive, had ");
        throw OoooO0O.OooOo.OooO0o0(oooOO0OOooOOo0.toString(), -1, androidx.concurrent.futures.OooO00o.OooO0Oo(C24035Oooo00o.f80943OooO00o, oooOO0OOooOOo0.getClass(), sb));
    }

    @Override // oO0o0ooO.InterfaceC33911OooO0OO, oO0o0ooO.InterfaceC33910OooO0O0
    public final InterfaceC33531OooO0o0 getDescriptor() {
        return f123540OooO0O0;
    }

    @Override // oO0o0ooO.InterfaceC33911OooO0OO
    public final void serialize(InterfaceC34004OooO0Oo encoder, Object obj) {
        AbstractC34475OooOooO value = (AbstractC34475OooOooO) obj;
        kotlin.jvm.internal.OooOOO0.OooO0oO(encoder, "encoder");
        kotlin.jvm.internal.OooOOO0.OooO0oO(value, "value");
        C21246OooO0OO.OooO00o(encoder);
        if (value instanceof C34471OooOoO0) {
            encoder.OooOOOo(C34470OooOoO.f123529OooO00o, C34471OooOoO0.INSTANCE);
        } else {
            encoder.OooOOOo(C34469OooOo0o.f123527OooO00o, (C34468OooOo0O) value);
        }
    }
}
