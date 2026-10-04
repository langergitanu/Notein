package oO0o0OO;

/* JADX INFO: loaded from: classes10.dex */
public final class o0000Ooo {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public static final ThreadLocal<AbstractC33655OooooO0> f121365OooO00o = new ThreadLocal<>();

    public static AbstractC33655OooooO0 OooO00o() {
        ThreadLocal<AbstractC33655OooooO0> threadLocal = f121365OooO00o;
        AbstractC33655OooooO0 abstractC33655OooooO0 = threadLocal.get();
        if (abstractC33655OooooO0 != null) {
            return abstractC33655OooooO0;
        }
        C33608OooO0oO c33608OooO0oO = new C33608OooO0oO(Thread.currentThread());
        threadLocal.set(c33608OooO0oO);
        return c33608OooO0oO;
    }
}
