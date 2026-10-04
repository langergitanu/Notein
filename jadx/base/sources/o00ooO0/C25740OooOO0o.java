package o00ooO0;

import java.util.LinkedList;

/* JADX INFO: renamed from: o00ooO0.OooOO0o, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public class C25740OooOO0o<V> {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final int f87850OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final int f87851OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final LinkedList f87852OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public int f87853OooO0Oo;

    public C25740OooOO0o(int i, int i2, int i3) {
        OooOoo0.OooOo00.OooO0o(i > 0);
        OooOoo0.OooOo00.OooO0o(i2 >= 0);
        OooOoo0.OooOo00.OooO0o(i3 >= 0);
        this.f87850OooO00o = i;
        this.f87851OooO0O0 = i2;
        this.f87852OooO0OO = new LinkedList();
        this.f87853OooO0Oo = i3;
    }

    public V OooO00o() {
        return (V) this.f87852OooO0OO.poll();
    }
}
