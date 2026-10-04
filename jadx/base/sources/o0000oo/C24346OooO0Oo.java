package o0000oo;

import com.huawei.hms.network.embedded.C18241k5;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import o0000.C24044OooO0oo;
import o0000oO.C24307OooO;
import o0000oO.C24321OooOOOO;

/* JADX INFO: renamed from: o0000oo.OooO0Oo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C24346OooO0Oo {

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    public C24044OooO0oo f81954OooO;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public int f81956OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public boolean f81957OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final C24348OooO0o0 f81958OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public C24346OooO0Oo f81959OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final OooO00o f81960OooO0o0;

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public HashSet<C24346OooO0Oo> f81955OooO00o = null;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public int f81961OooO0oO = 0;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public int f81962OooO0oo = Integer.MIN_VALUE;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* JADX INFO: renamed from: o0000oo.OooO0Oo$OooO00o */
    public static final class OooO00o {

        /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
        public static final OooO00o f81963OooOo;

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public static final OooO00o f81964OooOo0o;

        /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
        public static final OooO00o f81965OooOoO;

        /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
        public static final OooO00o f81966OooOoO0;

        /* JADX INFO: renamed from: OooOoOO, reason: collision with root package name */
        public static final OooO00o f81967OooOoOO;

        /* JADX INFO: renamed from: OooOoo, reason: collision with root package name */
        public static final OooO00o f81968OooOoo;

        /* JADX INFO: renamed from: OooOoo0, reason: collision with root package name */
        public static final OooO00o f81969OooOoo0;

        /* JADX INFO: renamed from: OooOooO, reason: collision with root package name */
        public static final OooO00o f81970OooOooO;

        /* JADX INFO: renamed from: OooOooo, reason: collision with root package name */
        public static final /* synthetic */ OooO00o[] f81971OooOooo;

        /* JADX INFO: Fake field, exist only in values array */
        OooO00o EF0;

        static {
            OooO00o oooO00o = new OooO00o("NONE", 0);
            OooO00o oooO00o2 = new OooO00o("LEFT", 1);
            f81964OooOo0o = oooO00o2;
            OooO00o oooO00o3 = new OooO00o("TOP", 2);
            f81963OooOo = oooO00o3;
            OooO00o oooO00o4 = new OooO00o("RIGHT", 3);
            f81966OooOoO0 = oooO00o4;
            OooO00o oooO00o5 = new OooO00o("BOTTOM", 4);
            f81965OooOoO = oooO00o5;
            OooO00o oooO00o6 = new OooO00o("BASELINE", 5);
            f81967OooOoOO = oooO00o6;
            OooO00o oooO00o7 = new OooO00o("CENTER", 6);
            f81969OooOoo0 = oooO00o7;
            OooO00o oooO00o8 = new OooO00o("CENTER_X", 7);
            f81968OooOoo = oooO00o8;
            OooO00o oooO00o9 = new OooO00o("CENTER_Y", 8);
            f81970OooOooO = oooO00o9;
            f81971OooOooo = new OooO00o[]{oooO00o, oooO00o2, oooO00o3, oooO00o4, oooO00o5, oooO00o6, oooO00o7, oooO00o8, oooO00o9};
        }

        public OooO00o() {
            throw null;
        }

        public static OooO00o valueOf(String str) {
            return (OooO00o) Enum.valueOf(OooO00o.class, str);
        }

        public static OooO00o[] values() {
            return (OooO00o[]) f81971OooOooo.clone();
        }
    }

    public C24346OooO0Oo(C24348OooO0o0 c24348OooO0o0, OooO00o oooO00o) {
        this.f81958OooO0Oo = c24348OooO0o0;
        this.f81960OooO0o0 = oooO00o;
    }

    public final boolean OooO(C24346OooO0Oo c24346OooO0Oo) {
        if (c24346OooO0Oo == null) {
            return false;
        }
        OooO00o oooO00o = OooO00o.f81967OooOoOO;
        OooO00o oooO00o2 = this.f81960OooO0o0;
        C24348OooO0o0 c24348OooO0o0 = c24346OooO0Oo.f81958OooO0Oo;
        OooO00o oooO00o3 = c24346OooO0Oo.f81960OooO0o0;
        if (oooO00o3 == oooO00o2) {
            return oooO00o2 != oooO00o || (c24348OooO0o0.f82023OooOooo && this.f81958OooO0Oo.f82023OooOooo);
        }
        int iOrdinal = oooO00o2.ordinal();
        OooO00o oooO00o4 = OooO00o.f81966OooOoO0;
        OooO00o oooO00o5 = OooO00o.f81964OooOo0o;
        OooO00o oooO00o6 = OooO00o.f81970OooOooO;
        OooO00o oooO00o7 = OooO00o.f81968OooOoo;
        switch (iOrdinal) {
            case 0:
            case 7:
            case 8:
                return false;
            case 1:
            case 3:
                boolean z = oooO00o3 == oooO00o5 || oooO00o3 == oooO00o4;
                return c24348OooO0o0 instanceof C24350OooO0oo ? z || oooO00o3 == oooO00o7 : z;
            case 2:
            case 4:
                boolean z2 = oooO00o3 == OooO00o.f81963OooOo || oooO00o3 == OooO00o.f81965OooOoO;
                return c24348OooO0o0 instanceof C24350OooO0oo ? z2 || oooO00o3 == oooO00o6 : z2;
            case 5:
                return (oooO00o3 == oooO00o5 || oooO00o3 == oooO00o4) ? false : true;
            case 6:
                return (oooO00o3 == oooO00o || oooO00o3 == oooO00o7 || oooO00o3 == oooO00o6) ? false : true;
            default:
                throw new AssertionError(oooO00o2.name());
        }
    }

    public final void OooO00o(C24346OooO0Oo c24346OooO0Oo, int i) {
        OooO0O0(c24346OooO0Oo, i, Integer.MIN_VALUE, false);
    }

    public final boolean OooO0O0(C24346OooO0Oo c24346OooO0Oo, int i, int i2, boolean z) {
        if (c24346OooO0Oo == null) {
            OooOO0();
            return true;
        }
        if (!z && !OooO(c24346OooO0Oo)) {
            return false;
        }
        this.f81959OooO0o = c24346OooO0Oo;
        if (c24346OooO0Oo.f81955OooO00o == null) {
            c24346OooO0Oo.f81955OooO00o = new HashSet<>();
        }
        HashSet<C24346OooO0Oo> hashSet = this.f81959OooO0o.f81955OooO00o;
        if (hashSet != null) {
            hashSet.add(this);
        }
        this.f81961OooO0oO = i;
        this.f81962OooO0oo = i2;
        return true;
    }

    public final void OooO0OO(int i, ArrayList<C24321OooOOOO> arrayList, C24321OooOOOO c24321OooOOOO) {
        HashSet<C24346OooO0Oo> hashSet = this.f81955OooO00o;
        if (hashSet != null) {
            Iterator<C24346OooO0Oo> it = hashSet.iterator();
            while (it.hasNext()) {
                C24307OooO.OooO00o(it.next().f81958OooO0Oo, i, arrayList, c24321OooOOOO);
            }
        }
    }

    public final int OooO0Oo() {
        if (this.f81957OooO0OO) {
            return this.f81956OooO0O0;
        }
        return 0;
    }

    public final C24346OooO0Oo OooO0o() {
        OooO00o oooO00o = this.f81960OooO0o0;
        int iOrdinal = oooO00o.ordinal();
        C24348OooO0o0 c24348OooO0o0 = this.f81958OooO0Oo;
        switch (iOrdinal) {
            case 0:
            case 5:
            case 6:
            case 7:
            case 8:
                return null;
            case 1:
                return c24348OooO0o0.f82032Oooo0o0;
            case 2:
                return c24348OooO0o0.f82031Oooo0o;
            case 3:
                return c24348OooO0o0.f82029Oooo0O0;
            case 4:
                return c24348OooO0o0.f82030Oooo0OO;
            default:
                throw new AssertionError(oooO00o.name());
        }
    }

    public final int OooO0o0() {
        C24346OooO0Oo c24346OooO0Oo;
        if (this.f81958OooO0Oo.f82052OoooooO == 8) {
            return 0;
        }
        int i = this.f81962OooO0oo;
        return (i == Integer.MIN_VALUE || (c24346OooO0Oo = this.f81959OooO0o) == null || c24346OooO0Oo.f81958OooO0Oo.f82052OoooooO != 8) ? this.f81961OooO0oO : i;
    }

    public final boolean OooO0oO() {
        HashSet<C24346OooO0Oo> hashSet = this.f81955OooO00o;
        if (hashSet == null) {
            return false;
        }
        Iterator<C24346OooO0Oo> it = hashSet.iterator();
        while (it.hasNext()) {
            if (it.next().OooO0o().OooO0oo()) {
                return true;
            }
        }
        return false;
    }

    public final boolean OooO0oo() {
        return this.f81959OooO0o != null;
    }

    public final void OooOO0() {
        HashSet<C24346OooO0Oo> hashSet;
        C24346OooO0Oo c24346OooO0Oo = this.f81959OooO0o;
        if (c24346OooO0Oo != null && (hashSet = c24346OooO0Oo.f81955OooO00o) != null) {
            hashSet.remove(this);
            if (this.f81959OooO0o.f81955OooO00o.size() == 0) {
                this.f81959OooO0o.f81955OooO00o = null;
            }
        }
        this.f81955OooO00o = null;
        this.f81959OooO0o = null;
        this.f81961OooO0oO = 0;
        this.f81962OooO0oo = Integer.MIN_VALUE;
        this.f81957OooO0OO = false;
        this.f81956OooO0O0 = 0;
    }

    public final void OooOO0O() {
        C24044OooO0oo c24044OooO0oo = this.f81954OooO;
        if (c24044OooO0oo == null) {
            this.f81954OooO = new C24044OooO0oo(C24044OooO0oo.OooO00o.f81020OooOo0o);
        } else {
            c24044OooO0oo.OooO0OO();
        }
    }

    public final void OooOO0o(int i) {
        this.f81956OooO0O0 = i;
        this.f81957OooO0OO = true;
    }

    public final String toString() {
        return this.f81958OooO0Oo.f82053Ooooooo + C18241k5.f55433h + this.f81960OooO0o0.toString();
    }
}
