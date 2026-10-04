package o0000oo;

import java.util.ArrayList;
import o0000oO.C24307OooO;
import o0000oO.C24321OooOOOO;

/* JADX INFO: renamed from: o0000oo.OooO, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C24342OooO extends C24348OooO0o0 {

    /* JADX INFO: renamed from: oo000o, reason: collision with root package name */
    public C24348OooO0o0[] f81932oo000o = new C24348OooO0o0[4];

    /* JADX INFO: renamed from: o00oO0o, reason: collision with root package name */
    public int f81931o00oO0o = 0;

    public final void OoooO0(int i, ArrayList arrayList, C24321OooOOOO c24321OooOOOO) {
        for (int i2 = 0; i2 < this.f81931o00oO0o; i2++) {
            C24348OooO0o0 c24348OooO0o0 = this.f81932oo000o[i2];
            ArrayList<C24348OooO0o0> arrayList2 = c24321OooOOOO.f81869OooO00o;
            if (!arrayList2.contains(c24348OooO0o0)) {
                arrayList2.add(c24348OooO0o0);
            }
        }
        for (int i3 = 0; i3 < this.f81931o00oO0o; i3++) {
            C24307OooO.OooO00o(this.f81932oo000o[i3], i, arrayList, c24321OooOOOO);
        }
    }

    public void OoooO0O() {
    }
}
