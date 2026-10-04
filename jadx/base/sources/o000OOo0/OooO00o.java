package o000OOo0;

/* JADX INFO: loaded from: classes.dex */
public final class OooO00o<T> extends ThreadLocal<T> {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final oO0O000o.OooO00o<T> f82886OooO00o;

    /* JADX WARN: Multi-variable type inference failed */
    public OooO00o(oO0O000o.OooO00o<? extends T> oooO00o) {
        this.f82886OooO00o = oooO00o;
    }

    @Override // java.lang.ThreadLocal
    public final T initialValue() {
        return this.f82886OooO00o.invoke();
    }
}
