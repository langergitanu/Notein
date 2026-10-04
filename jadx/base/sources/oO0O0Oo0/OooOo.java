package oO0O0Oo0;

import OooOOO0.AbstractC20449OooO0Oo;
import java.util.LinkedHashSet;
import oO0OOOo.C32995OooOOO0;

/* JADX INFO: loaded from: classes10.dex */
public final class OooOo extends AbstractC20449OooO0Oo {

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final /* synthetic */ LinkedHashSet f117426OooOo0o;

    public OooOo(LinkedHashSet linkedHashSet) {
        this.f117426OooOo0o = linkedHashSet;
    }

    public static /* synthetic */ void Oooo(int i) {
        Object[] objArr = new Object[3];
        if (i == 1) {
            objArr[0] = "fromSuper";
        } else if (i != 2) {
            objArr[0] = "fakeOverride";
        } else {
            objArr[0] = "fromCurrent";
        }
        objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/EnumEntrySyntheticClassDescriptor$EnumEntryScope$4";
        if (i == 1 || i == 2) {
            objArr[2] = "conflict";
        } else {
            objArr[2] = "addFakeOverride";
        }
        throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
    }

    @Override // OooOOO0.AbstractC20449OooO0Oo
    public final void OooO0oO(oO0O0OO.OooO0O0 oooO0O0) {
        if (oooO0O0 == null) {
            Oooo(0);
            throw null;
        }
        C32995OooOOO0.OooOOo(oooO0O0, null);
        this.f117426OooOo0o.add(oooO0O0);
    }

    @Override // OooOOO0.AbstractC20449OooO0Oo
    public final void OooOO0(oO0O0OO.OooO0O0 oooO0O0, oO0O0OO.OooO0O0 oooO0O02) {
        if (oooO0O02 != null) {
            return;
        }
        Oooo(2);
        throw null;
    }
}
