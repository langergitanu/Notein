package o0ooOO0;

import OoooOOO.C21180OooO0Oo;
import OoooOOO.C21183OooO0oO;
import OoooOOO.InterfaceC21182OooO0o0;

/* JADX INFO: loaded from: classes.dex */
public final class o0OoOo0 implements InterfaceC21182OooO0o0 {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final C31605ooOO f112928OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final /* synthetic */ C21183OooO0oO f112929OooO0O0;

    public o0OoOo0(C21183OooO0oO c21183OooO0oO, C31605ooOO c31605ooOO) {
        this.f112928OooO00o = c31605ooOO;
        this.f112929OooO0O0 = c21183OooO0oO;
    }

    @Override // OoooOOO.InterfaceC21182OooO0o0
    public final boolean OooO00o(Object obj) {
        return this.f112929OooO0O0.OooO00o(obj);
    }

    @Override // OoooOOO.InterfaceC21182OooO0o0
    public final InterfaceC21182OooO0o0.OooO00o OooO0O0(String key, C21180OooO0Oo.OooO00o valueProvider) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(key, "key");
        kotlin.jvm.internal.OooOOO0.OooO0oO(valueProvider, "valueProvider");
        return this.f112929OooO0O0.OooO0O0(key, valueProvider);
    }

    @Override // OoooOOO.InterfaceC21182OooO0o0
    public final Object OooO0OO(String key) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(key, "key");
        return this.f112929OooO0O0.OooO0OO(key);
    }
}
