package oO0oO00;

import oO0o.InterfaceC33531OooO0o0;
import oO0o0ooO.InterfaceC33911OooO0OO;
import oO0oO000.InterfaceC34004OooO0Oo;

/* JADX INFO: renamed from: oO0oO00.OoooO00, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C33973OoooO00 implements InterfaceC33966Oooo0OO<Object> {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final /* synthetic */ InterfaceC33911OooO0OO<Object> f122197OooO00o;

    public C33973OoooO00(InterfaceC33911OooO0OO<Object> interfaceC33911OooO0OO) {
        this.f122197OooO00o = interfaceC33911OooO0OO;
    }

    @Override // oO0oO00.InterfaceC33966Oooo0OO
    public final InterfaceC33911OooO0OO<?>[] childSerializers() {
        return new InterfaceC33911OooO0OO[]{this.f122197OooO00o};
    }

    @Override // oO0o0ooO.InterfaceC33910OooO0O0
    public final Object deserialize(oO0oO000.OooO0OO oooO0OO) {
        throw new IllegalStateException("unsupported");
    }

    @Override // oO0o0ooO.InterfaceC33911OooO0OO, oO0o0ooO.InterfaceC33910OooO0O0
    public final InterfaceC33531OooO0o0 getDescriptor() {
        throw new IllegalStateException("unsupported");
    }

    @Override // oO0o0ooO.InterfaceC33911OooO0OO
    public final void serialize(InterfaceC34004OooO0Oo encoder, Object obj) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(encoder, "encoder");
        throw new IllegalStateException("unsupported");
    }

    @Override // oO0oO00.InterfaceC33966Oooo0OO
    public final InterfaceC33911OooO0OO<?>[] typeParametersSerializers() {
        return C34002o0ooOoO.f122290OooO00o;
    }
}
