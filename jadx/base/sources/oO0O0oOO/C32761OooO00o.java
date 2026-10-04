package oO0O0oOO;

import OooOOO0.AbstractC20449OooO0Oo;
import java.util.Collection;
import java.util.LinkedHashSet;
import oO00ooO.C32460OooOooO;
import oO0O000o.InterfaceC32507OooOO0o;
import oO0O0OO.OooO0O0;
import oO0OOOo.C32995OooOOO0;
import oO0OoO0.InterfaceC33242OooOOo0;

/* JADX INFO: renamed from: oO0O0oOO.OooO00o, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C32761OooO00o extends AbstractC20449OooO0Oo {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final /* synthetic */ LinkedHashSet f117710OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final /* synthetic */ InterfaceC33242OooOOo0 f117711OooOo0o;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public final /* synthetic */ boolean f117712OooOoO0;

    /* JADX INFO: renamed from: oO0O0oOO.OooO00o$OooO00o, reason: collision with other inner class name */
    public class C20253OooO00o implements InterfaceC32507OooOO0o<oO0O0OO.OooO0O0, C32460OooOooO> {
        public C20253OooO00o() {
        }

        @Override // oO0O000o.InterfaceC32507OooOO0o
        public final C32460OooOooO invoke(oO0O0OO.OooO0O0 oooO0O0) {
            oO0O0OO.OooO0O0 oooO0O02 = oooO0O0;
            if (oooO0O02 == null) {
                throw new IllegalArgumentException("Argument for @NotNull parameter 'descriptor' of kotlin/reflect/jvm/internal/impl/load/java/components/DescriptorResolverUtils$1$1.invoke must not be null");
            }
            C32761OooO00o.this.f117711OooOo0o.OooO00o(oooO0O02);
            return C32460OooOooO.f116667OooO00o;
        }
    }

    public C32761OooO00o(InterfaceC33242OooOOo0 interfaceC33242OooOOo0, LinkedHashSet linkedHashSet, boolean z) {
        this.f117711OooOo0o = interfaceC33242OooOOo0;
        this.f117710OooOo = linkedHashSet;
        this.f117712OooOoO0 = z;
    }

    public static /* synthetic */ void Oooo(int i) {
        Object[] objArr = new Object[3];
        if (i == 1) {
            objArr[0] = "fromSuper";
        } else if (i == 2) {
            objArr[0] = "fromCurrent";
        } else if (i == 3) {
            objArr[0] = "member";
        } else if (i != 4) {
            objArr[0] = "fakeOverride";
        } else {
            objArr[0] = "overridden";
        }
        objArr[1] = "kotlin/reflect/jvm/internal/impl/load/java/components/DescriptorResolverUtils$1";
        if (i == 1 || i == 2) {
            objArr[2] = "conflict";
        } else if (i == 3 || i == 4) {
            objArr[2] = "setOverriddenDescriptors";
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
        C32995OooOOO0.OooOOo(oooO0O0, new C20253OooO00o());
        this.f117710OooOo.add(oooO0O0);
    }

    @Override // OooOOO0.AbstractC20449OooO0Oo
    public final void OooOO0(oO0O0OO.OooO0O0 oooO0O0, oO0O0OO.OooO0O0 oooO0O02) {
        if (oooO0O02 != null) {
            return;
        }
        Oooo(2);
        throw null;
    }

    @Override // OooOOO0.AbstractC20449OooO0Oo
    public final void Oooo0o(oO0O0OO.OooO0O0 oooO0O0, Collection<? extends oO0O0OO.OooO0O0> collection) {
        if (oooO0O0 == null) {
            Oooo(3);
            throw null;
        }
        if (!this.f117712OooOoO0 || oooO0O0.getKind() == OooO0O0.OooO00o.f117221OooOo) {
            oooO0O0.Oooo0oO(collection);
        }
    }
}
