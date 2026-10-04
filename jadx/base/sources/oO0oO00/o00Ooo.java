package oO0oO00;

import OooOoOO.C20519OooO0Oo;
import androidx.appcompat.widget.C21532OooOOo;
import o0OoOOo.C29132OooO0o0;
import oO00ooO.C32460OooOooO;
import oO00ooO.EnumC32441OooOO0O;
import oO0o.InterfaceC33531OooO0o0;
import oO0o0ooO.C33917OooOO0;
import oO0o0ooO.InterfaceC33911OooO0OO;
import oO0oO000.InterfaceC34004OooO0Oo;

/* JADX INFO: loaded from: classes10.dex */
public final class o00Ooo<T> implements InterfaceC33911OooO0OO<T> {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final C32460OooOooO f122267OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final Object f122268OooO0O0;

    public o00Ooo(C32460OooOooO objectInstance) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(objectInstance, "objectInstance");
        this.f122267OooO00o = objectInstance;
        this.f122268OooO0O0 = C20519OooO0Oo.OooO0O0(EnumC32441OooOO0O.f116633OooOo, new C29132OooO0o0(this, 2));
    }

    @Override // oO0o0ooO.InterfaceC33910OooO0O0
    public final T deserialize(oO0oO000.OooO0OO oooO0OO) {
        InterfaceC33531OooO0o0 descriptor = getDescriptor();
        oO0oO000.OooO00o OooO00o2 = oooO0OO.OooO00o(descriptor);
        int iOooOo0o = OooO00o2.OooOo0o(getDescriptor());
        if (iOooOo0o != -1) {
            throw new C33917OooOO0(C21532OooOOo.OooO0OO(iOooOo0o, "Unexpected index "));
        }
        C32460OooOooO c32460OooOooO = C32460OooOooO.f116667OooO00o;
        OooO00o2.OooO0O0(descriptor);
        return (T) this.f122267OooO00o;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, oO00ooO.OooOO0] */
    @Override // oO0o0ooO.InterfaceC33911OooO0OO, oO0o0ooO.InterfaceC33910OooO0O0
    public final InterfaceC33531OooO0o0 getDescriptor() {
        return (InterfaceC33531OooO0o0) this.f122268OooO0O0.getValue();
    }

    @Override // oO0o0ooO.InterfaceC33911OooO0OO
    public final void serialize(InterfaceC34004OooO0Oo encoder, T value) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(encoder, "encoder");
        kotlin.jvm.internal.OooOOO0.OooO0oO(value, "value");
        encoder.OooO00o(getDescriptor()).OooO0O0(getDescriptor());
    }
}
