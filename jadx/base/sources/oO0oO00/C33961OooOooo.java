package oO0oO00;

import OooOoOO.C20519OooO0Oo;
import com.orion.notein.richeditor.utils.p606io.FilenameUtils;
import oO00ooO.C32447OooOOo;
import oO0o.AbstractC33534OooOO0o;
import oO0o.C33533OooO0oo;
import oO0o.InterfaceC33531OooO0o0;
import oO0o.OooOOO0;

/* JADX INFO: renamed from: oO0oO00.OooOooo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C33961OooOooo extends C34001o0ooOO0 {

    /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
    public final AbstractC33534OooOO0o.OooO0O0 f122178OooOO0o;

    /* JADX INFO: renamed from: OooOOO0, reason: collision with root package name */
    public final C32447OooOOo f122179OooOOO0;

    public C33961OooOooo(final String str, final int i) {
        super(str, null, i);
        this.f122178OooOO0o = AbstractC33534OooOO0o.OooO0O0.f121131OooO00o;
        this.f122179OooOOO0 = C20519OooO0Oo.OooO0OO(new oO0O000o.OooO00o() { // from class: oO0oO00.OooOooO
            @Override // oO0O000o.OooO00o
            public final Object invoke() {
                int i2 = i;
                InterfaceC33531OooO0o0[] interfaceC33531OooO0o0Arr = new InterfaceC33531OooO0o0[i2];
                for (int i3 = 0; i3 < i2; i3++) {
                    interfaceC33531OooO0o0Arr[i3] = oO0o.OooOO0O.OooO0OO(str + FilenameUtils.EXTENSION_SEPARATOR + this.f122285OooO0o0[i3], OooOOO0.C33535OooO0Oo.f121135OooO00o, new InterfaceC33531OooO0o0[0], new oO0o.OooOO0());
                }
                return interfaceC33531OooO0o0Arr;
            }
        });
    }

    @Override // oO0oO00.C34001o0ooOO0, oO0o.InterfaceC33531OooO0o0
    public final InterfaceC33531OooO0o0 OooO0Oo(int i) {
        return ((InterfaceC33531OooO0o0[]) this.f122179OooOOO0.getValue())[i];
    }

    @Override // oO0oO00.C34001o0ooOO0
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof InterfaceC33531OooO0o0)) {
            return false;
        }
        InterfaceC33531OooO0o0 interfaceC33531OooO0o0 = (InterfaceC33531OooO0o0) obj;
        if (interfaceC33531OooO0o0.getKind() != AbstractC33534OooOO0o.OooO0O0.f121131OooO00o) {
            return false;
        }
        return this.f122280OooO00o.equals(interfaceC33531OooO0o0.OooO0oo()) && kotlin.jvm.internal.OooOOO0.OooO0O0(o00oO0O.OooO00o(this), o00oO0O.OooO00o(interfaceC33531OooO0o0));
    }

    @Override // oO0oO00.C34001o0ooOO0, oO0o.InterfaceC33531OooO0o0
    public final AbstractC33534OooOO0o getKind() {
        return this.f122178OooOO0o;
    }

    @Override // oO0oO00.C34001o0ooOO0
    public final int hashCode() {
        int iHashCode = this.f122280OooO00o.hashCode();
        C33533OooO0oo c33533OooO0oo = new C33533OooO0oo(this);
        int iHashCode2 = 1;
        while (c33533OooO0oo.hasNext()) {
            int i = iHashCode2 * 31;
            String str = (String) c33533OooO0oo.next();
            iHashCode2 = i + (str != null ? str.hashCode() : 0);
        }
        return (iHashCode * 31) + iHashCode2;
    }

    @Override // oO0oO00.C34001o0ooOO0
    public final String toString() {
        return oOo000Oo.OooOo.o000oOoO(new oO0o.OooO(this), ", ", this.f122280OooO00o.concat("("), ")", null, 56);
    }
}
