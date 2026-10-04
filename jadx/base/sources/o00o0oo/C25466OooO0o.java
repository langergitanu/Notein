package o00o0oo;

import o00o0Ooo.InterfaceC25423OooO;
import o00oO00o.AbstractC25478OooO0O0;

/* JADX INFO: renamed from: o00o0oo.OooO0o, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C25466OooO0o implements InterfaceC25423OooO {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public static final /* synthetic */ int f86779OooO00o = 0;

    public static boolean OooO00o(int[] iArr, int[] iArr2) {
        if (iArr.length != iArr2.length) {
            return false;
        }
        boolean z = true;
        for (int length = iArr.length - 1; length >= 0; length--) {
            z &= iArr[length] == iArr2[length];
        }
        return z;
    }

    @Override // o00o0Ooo.InterfaceC25423OooO
    public Object get() {
        NullPointerException nullPointerException = AbstractC25478OooO0O0.f86839OooO0o;
        C25469OooO0oo c25469OooO0oo = new C25469OooO0oo();
        c25469OooO0oo.OooO0oo(nullPointerException, null);
        return c25469OooO0oo;
    }
}
