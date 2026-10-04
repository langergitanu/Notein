package oO0O0oO0;

import androidx.datastore.preferences.protobuf.C21825OoooOO0;
import java.util.Collection;
import oO0O000o.InterfaceC32507OooOO0o;
import oO0O0ooO.InterfaceC32815OooO00o;
import oO0OooO0.C33477OooO0OO;
import oOo000Oo.C34434OooOoO;

/* JADX INFO: renamed from: oO0O0oO0.OooOoo0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C32754OooOoo0 extends AbstractC32748OooOo0O implements oO0O0ooO.OooOo00 {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final C33477OooO0OO f117698OooO00o;

    public C32754OooOoo0(C33477OooO0OO fqName) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(fqName, "fqName");
        this.f117698OooO00o = fqName;
    }

    @Override // oO0O0ooO.OooOo00
    public final C33477OooO0OO OooO0OO() {
        return this.f117698OooO00o;
    }

    @Override // oO0O0ooO.InterfaceC32818OooO0Oo
    public final InterfaceC32815OooO00o OooOOO0(C33477OooO0OO fqName) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(fqName, "fqName");
        return null;
    }

    @Override // oO0O0ooO.OooOo00
    public final void OooOOOo(InterfaceC32507OooOO0o nameFilter) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(nameFilter, "nameFilter");
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C32754OooOoo0) {
            return kotlin.jvm.internal.OooOOO0.OooO0O0(this.f117698OooO00o, ((C32754OooOoo0) obj).f117698OooO00o);
        }
        return false;
    }

    @Override // oO0O0ooO.InterfaceC32818OooO0Oo
    public final /* bridge */ /* synthetic */ Collection getAnnotations() {
        return C34434OooOoO.f123453OooOo0o;
    }

    public final int hashCode() {
        return this.f117698OooO00o.hashCode();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        C21825OoooOO0.OooO0OO(C32754OooOoo0.class, sb, ": ");
        sb.append(this.f117698OooO00o);
        return sb.toString();
    }
}
