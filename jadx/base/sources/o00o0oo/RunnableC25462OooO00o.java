package o00o0oo;

/* JADX INFO: renamed from: o00o0oo.OooO00o, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class RunnableC25462OooO00o implements Runnable {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final /* synthetic */ InterfaceC25468OooO0oO f86762OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final /* synthetic */ boolean f86763OooOo0o;

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public final /* synthetic */ AbstractC25464OooO0OO f86764OooOoO;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public final /* synthetic */ boolean f86765OooOoO0;

    public RunnableC25462OooO00o(AbstractC25464OooO0OO abstractC25464OooO0OO, boolean z, InterfaceC25468OooO0oO interfaceC25468OooO0oO, boolean z2) {
        this.f86764OooOoO = abstractC25464OooO0OO;
        this.f86763OooOo0o = z;
        this.f86762OooOo = interfaceC25468OooO0oO;
        this.f86765OooOoO0 = z2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean z = this.f86763OooOo0o;
        AbstractC25464OooO0OO abstractC25464OooO0OO = this.f86764OooOoO;
        InterfaceC25468OooO0oO interfaceC25468OooO0oO = this.f86762OooOo;
        if (z) {
            interfaceC25468OooO0oO.OooO0OO(abstractC25464OooO0OO);
        } else if (this.f86765OooOoO0) {
            interfaceC25468OooO0oO.getClass();
        } else {
            interfaceC25468OooO0oO.OooO00o(abstractC25464OooO0OO);
        }
    }
}
