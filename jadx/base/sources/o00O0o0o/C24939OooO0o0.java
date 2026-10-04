package o00O0o0o;

import o00O0o0o.C24935OooO0O0;

/* JADX INFO: renamed from: o00O0o0o.OooO0o0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C24939OooO0o0 implements InterfaceC24936OooO0OO<Object, Void> {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final /* synthetic */ o00000O0.OooO00o f84615OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final /* synthetic */ InterfaceC24936OooO0OO f84616OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final /* synthetic */ C24935OooO0O0.OooO00o f84617OooO0OO;

    public C24939OooO0o0(o00000O0.OooO00o oooO00o, InterfaceC24936OooO0OO interfaceC24936OooO0OO, C24935OooO0O0.OooO00o oooO00o2) {
        this.f84615OooO00o = oooO00o;
        this.f84616OooO0O0 = interfaceC24936OooO0OO;
        this.f84617OooO0OO = oooO00o2;
    }

    @Override // o00O0o0o.InterfaceC24936OooO0OO
    public final void OooO00o(C24941OooO0oo c24941OooO0oo) throws Exception {
        InterfaceC24936OooO0OO interfaceC24936OooO0OO = this.f84616OooO0O0;
        C24935OooO0O0.OooO00o oooO00o = this.f84617OooO0OO;
        o00000O0.OooO00o oooO00o2 = this.f84615OooO00o;
        try {
            oooO00o.execute(new RunnableC24938OooO0o(oooO00o2, interfaceC24936OooO0OO, c24941OooO0oo));
        } catch (Exception e) {
            oooO00o2.OooO00o(new C24937OooO0Oo(e));
        }
    }
}
