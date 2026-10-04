package o000OoO;

import java.nio.ByteBuffer;

/* JADX INFO: renamed from: o000OoO.OooO0OO, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C24535OooO0OO {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public int f82985OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public ByteBuffer f82986OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public int f82987OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public int f82988OooO0Oo;

    public C24535OooO0OO() {
        if (C24536OooO0Oo.f82989OooO00o == null) {
            C24536OooO0Oo.f82989OooO00o = new C24536OooO0Oo();
        }
    }

    public final int OooO00o(int i) {
        if (i < this.f82988OooO0Oo) {
            return this.f82986OooO0O0.getShort(this.f82987OooO0OO + i);
        }
        return 0;
    }
}
