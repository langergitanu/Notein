package o000O0oo;

/* JADX INFO: renamed from: o000O0oo.Oooo00O, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C24441Oooo00O<T> extends ThreadLocal<T> {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final C24439OooOooO f82473OooO00o;

    public C24441Oooo00O(C24439OooOooO c24439OooOooO) {
        this.f82473OooO00o = c24439OooOooO;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.lang.ThreadLocal
    public final T initialValue() {
        this.f82473OooO00o.getClass();
        return (T) new float[8];
    }
}
