package Oooo0oO;

import java.util.ArrayList;
import java.util.ConcurrentModificationException;
import java.util.HashMap;
import java.util.Iterator;

/* JADX INFO: renamed from: Oooo0oO.o0000o0o, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C21094o0000o0o implements Iterable<Object>, oO0O00.OooO00o {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final int f61164OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final C21093o0000o0O f61165OooOo0o;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public final int f61166OooOoO0;

    public C21094o0000o0o(C21093o0000o0O c21093o0000o0O, int i, int i2) {
        this.f61165OooOo0o = c21093o0000o0O;
        this.f61164OooOo = i;
        this.f61166OooOoO0 = i2;
    }

    @Override // java.lang.Iterable
    public final Iterator<Object> iterator() {
        int i;
        ArrayList<C21025OooO0o0> arrayList;
        int iOooOOOo;
        C21093o0000o0O c21093o0000o0O = this.f61165OooOo0o;
        if (c21093o0000o0O.f61159OooOoo != this.f61166OooOoO0) {
            throw new ConcurrentModificationException();
        }
        HashMap<C21025OooO0o0, C21068OoooOoO> map = c21093o0000o0O.f61162OooOooo;
        C21068OoooOoO c21068OoooOoO = null;
        int i2 = this.f61164OooOo;
        if (map != null) {
            if (c21093o0000o0O.f61160OooOoo0) {
                C21038OooOo.OooO0OO("use active SlotWriter to crate an anchor for location instead");
                throw null;
            }
            C21025OooO0o0 c21025OooO0o0 = (i2 < 0 || i2 >= (i = c21093o0000o0O.f61154OooOo) || (iOooOOOo = C21091o0000o.OooOOOo((arrayList = c21093o0000o0O.f61161OooOooO), i2, i)) < 0) ? null : arrayList.get(iOooOOOo);
            if (c21025OooO0o0 != null) {
                c21068OoooOoO = map.get(c21025OooO0o0);
            }
        }
        return c21068OoooOoO != null ? new o000Oo0(c21093o0000o0O, i2, c21068OoooOoO, new C21024OooO0o()) : new C21067OoooOo0(c21093o0000o0O, i2 + 1, c21093o0000o0O.f61155OooOo0o[(i2 * 5) + 3] + i2);
    }
}
