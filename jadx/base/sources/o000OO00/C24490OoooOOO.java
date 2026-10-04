package o000OO00;

import OooOo.C20481OooOOoo;
import Oooo0oO.o0Oo0oo;
import androidx.appcompat.widget.C21532OooOOo;

/* JADX INFO: renamed from: o000OO00.OoooOOO, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C24490OoooOOO implements Comparable<C24490OoooOOO> {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public static final C20481OooOOoo<C24490OoooOOO> f82794OooOo = new C20481OooOOoo<>((Object) null);

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public static final C24490OoooOOO f82795OooOoO0;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final int f82796OooOo0o;

    static {
        C24490OoooOOO c24490OoooOOO = new C24490OoooOOO(1);
        new C24490OoooOOO(0);
        f82795OooOoO0 = c24490OoooOOO;
        new C24490OoooOOO(Integer.MAX_VALUE);
    }

    public C24490OoooOOO(int i) {
        this.f82796OooOo0o = i;
        C20481OooOOoo<C24490OoooOOO> c20481OooOOoo = f82794OooOo;
        if (c20481OooOOoo.OooO00o(i)) {
            throw new IllegalStateException(o0Oo0oo.OooO0O0(i, "Duplicate Version value: ", ".").toString());
        }
        c20481OooOOoo.OooO0oO(i, this);
    }

    @Override // java.lang.Comparable
    public final int compareTo(C24490OoooOOO c24490OoooOOO) {
        C24490OoooOOO other = c24490OoooOOO;
        kotlin.jvm.internal.OooOOO0.OooO0oO(other, "other");
        return kotlin.jvm.internal.OooOOO0.OooO(this.f82796OooOo0o, other.f82796OooOo0o);
    }

    public final String toString() {
        int i = this.f82796OooOo0o;
        return i == Integer.MAX_VALUE ? "experimental" : C21532OooOOo.OooO0OO(i, "v");
    }
}
