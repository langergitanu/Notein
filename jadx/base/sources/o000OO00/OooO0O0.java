package o000OO00;

import OooOoOO.C20519OooO0Oo;
import OooooO0.C21292OooO0oo;
import androidx.ink.brush.BrushNative;
import com.orion.penkit.tools.DrawToolFactory;
import io.ktor.utils.p616io.C23968Oooo00o;
import kotlin.jvm.internal.C24028OooOoO0;
import o000OO0o.C24495OooO00o;
import o000OOO.C24498OooO0o0;
import o000OOO.C24504OooOOo0;
import oO00ooO.C32447OooOOo;
import oOoo0.InterfaceC34602OooOO0o;

/* JADX INFO: loaded from: classes.dex */
public final class OooO0O0 {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final o000OOoO.OooO0O0 f82631OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final C24457OooOOo f82632OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final C32447OooOOo f82633OooO0OO;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public static final /* synthetic */ InterfaceC34602OooOO0o<Object>[] f82630OooO0o0 = {new C24028OooOoO0(OooO0O0.class, "nativePointer", "getNativePointer()J", 0)};

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public static final OooO00o f82629OooO0Oo = new OooO00o();

    public static final class OooO00o {
        public static OooO0O0 OooO00o(C24457OooOOo family, int i, float f, float f2) {
            kotlin.jvm.internal.OooOOO0.OooO0oO(family, "family");
            return new OooO0O0(f, f2, C21292OooO0oo.OooO0O0(i), family);
        }
    }

    static {
        int i = C24495OooO00o.f82815OooO0Oo;
    }

    public OooO0O0() {
        throw null;
    }

    public OooO0O0(final float f, final float f2, final long j, final C24457OooOOo family) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(family, "family");
        this.f82631OooO00o = new o000OOoO.OooO0O0(new oO0O000o.OooO00o() { // from class: o000OO00.OooO00o
            @Override // oO0O000o.OooO00o
            public final Object invoke() {
                long jOooO00o = j;
                o000OOO.OooO0OO OooO0Oo2 = C24495OooO00o.OooO0Oo(jOooO00o);
                kotlin.jvm.internal.OooOOO0.OooO0oO(OooO0Oo2, "<this>");
                if (!OooO0Oo2.equals(C24498OooO0o0.f82834OooO0o0)) {
                    C24504OooOOo0 c24504OooOOo0 = C24498OooO0o0.f82835OooO0oO;
                    if (!OooO0Oo2.equals(c24504OooOOo0)) {
                        jOooO00o = C24495OooO00o.OooO00o(jOooO00o, c24504OooOOo0);
                    }
                }
                return Long.valueOf(BrushNative.f65348OooO00o.create(family.OooO0O0(), C24495OooO00o.OooO0o(jOooO00o), C24495OooO00o.OooO0o0(jOooO00o), C24495OooO00o.OooO0OO(jOooO00o), C24495OooO00o.OooO0O0(jOooO00o), C23968Oooo00o.OooO0o(C24495OooO00o.OooO0Oo(jOooO00o)), f, f2));
            }
        }, new C24451OooO0Oo(1, BrushNative.f65348OooO00o, BrushNative.class, DrawToolFactory.LASSO_TYPE_FREE, "free(J)V", 0));
        this.f82632OooO0O0 = family;
        this.f82633OooO0OO = C20519OooO0Oo.OooO0OO(new OooO0OO(this));
    }

    public static OooO0O0 OooO00o(OooO0O0 oooO0O0, int i) {
        C24457OooOOo family = oooO0O0.f82632OooO0O0;
        float fOooO0o = oooO0O0.OooO0o();
        float fOooO0OO = oooO0O0.OooO0OO();
        oooO0O0.getClass();
        kotlin.jvm.internal.OooOOO0.OooO0oO(family, "family");
        long jOooO0O0 = C21292OooO0oo.OooO0O0(i);
        return (family.equals(oooO0O0.f82632OooO0O0) && jOooO0O0 == oooO0O0.OooO0Oo() && fOooO0o == oooO0O0.OooO0o() && fOooO0OO == oooO0O0.OooO0OO()) ? oooO0O0 : new OooO0O0(fOooO0o, fOooO0OO, jOooO0O0, family);
    }

    public final int OooO0O0() {
        return (int) (C24495OooO00o.OooO00o(OooO0Oo(), C24498OooO0o0.f82834OooO0o0) >>> 32);
    }

    public final float OooO0OO() {
        return BrushNative.f65348OooO00o.getEpsilon(OooO0o0());
    }

    public final long OooO0Oo() {
        return ((C24495OooO00o) this.f82633OooO0OO.getValue()).f82816OooO00o;
    }

    public final float OooO0o() {
        return BrushNative.f65348OooO00o.getSize(OooO0o0());
    }

    public final long OooO0o0() {
        return this.f82631OooO00o.OooO00o(this, f82630OooO0o0[0]);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof OooO0O0) {
            OooO0O0 oooO0O0 = (OooO0O0) obj;
            if (kotlin.jvm.internal.OooOOO0.OooO0O0(this.f82632OooO0O0, oooO0O0.f82632OooO0O0) && OooO0Oo() == oooO0O0.OooO0Oo() && OooO0o() == oooO0O0.OooO0o() && OooO0OO() == oooO0O0.OooO0OO()) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Float.hashCode(OooO0OO()) + ((Float.hashCode(OooO0o()) + ((Long.hashCode(OooO0Oo()) + (this.f82632OooO0O0.hashCode() * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "Brush(family=" + this.f82632OooO0O0 + ", color=" + C24495OooO00o.OooO0oO(OooO0Oo()) + ", size=" + OooO0o() + ", epsilon=" + OooO0OO() + ")";
    }
}
