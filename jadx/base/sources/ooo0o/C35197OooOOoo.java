package ooo0o;

import Oooo0oO.C21111o0ooOoO;
import oO00ooO.C32442OooOO0o;
import oO0OOO.AbstractC32933OooO0Oo;

/* JADX INFO: renamed from: ooo0o.OooOOoo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C35197OooOOoo {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final String f126383OooO00o;

    /* JADX INFO: renamed from: ooo0o.OooOOoo$OooO00o */
    public static final class OooO00o {
        public static C35197OooOOoo OooO00o(AbstractC32933OooO0Oo abstractC32933OooO0Oo) {
            if (abstractC32933OooO0Oo instanceof AbstractC32933OooO0Oo.OooO0O0) {
                AbstractC32933OooO0Oo.OooO0O0 oooO0O0 = (AbstractC32933OooO0Oo.OooO0O0) abstractC32933OooO0Oo;
                String name = oooO0O0.f118818OooO00o;
                kotlin.jvm.internal.OooOOO0.OooO0oO(name, "name");
                String desc = oooO0O0.f118819OooO0O0;
                kotlin.jvm.internal.OooOOO0.OooO0oO(desc, "desc");
                return new C35197OooOOoo(name.concat(desc));
            }
            if (!(abstractC32933OooO0Oo instanceof AbstractC32933OooO0Oo.OooO00o)) {
                throw new C32442OooOO0o();
            }
            AbstractC32933OooO0Oo.OooO00o oooO00o = (AbstractC32933OooO0Oo.OooO00o) abstractC32933OooO0Oo;
            String name2 = oooO00o.f118816OooO00o;
            kotlin.jvm.internal.OooOOO0.OooO0oO(name2, "name");
            String desc2 = oooO00o.f118817OooO0O0;
            kotlin.jvm.internal.OooOOO0.OooO0oO(desc2, "desc");
            return new C35197OooOOoo(name2 + '#' + desc2);
        }
    }

    public C35197OooOOoo(String str) {
        this.f126383OooO00o = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C35197OooOOoo) && kotlin.jvm.internal.OooOOO0.OooO0O0(this.f126383OooO00o, ((C35197OooOOoo) obj).f126383OooO00o);
    }

    public final int hashCode() {
        return this.f126383OooO00o.hashCode();
    }

    public final String toString() {
        return C21111o0ooOoO.OooO0OO(this.f126383OooO00o, ')', new StringBuilder("MemberSignature(signature="));
    }
}
