package o00oo0O0;

import java.util.LinkedHashMap;

/* JADX INFO: renamed from: o00oo0O0.OooO, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C25656OooO<K, V> {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final C25671OooOOOo f87574OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final LinkedHashMap<K, V> f87575OooO0O0 = new LinkedHashMap<>();

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public int f87576OooO0OO = 0;

    public C25656OooO(C25671OooOOOo c25671OooOOOo) {
        this.f87574OooO00o = c25671OooOOOo;
    }

    public final synchronized int OooO00o() {
        return this.f87575OooO0O0.size();
    }

    public final synchronized int OooO0O0() {
        return this.f87576OooO0OO;
    }

    public final synchronized void OooO0OO(Object obj, Object obj2) {
        V vRemove = this.f87575OooO0O0.remove(obj);
        this.f87576OooO0OO -= vRemove == null ? 0 : this.f87574OooO00o.OooO00o(vRemove);
        this.f87575OooO0O0.put(obj, obj2);
        this.f87576OooO0OO += this.f87574OooO00o.OooO00o(obj2);
    }

    public final synchronized V OooO0Oo(K k) {
        V vRemove;
        vRemove = this.f87575OooO0O0.remove(k);
        this.f87576OooO0OO -= vRemove == null ? 0 : this.f87574OooO00o.OooO00o(vRemove);
        return vRemove;
    }
}
