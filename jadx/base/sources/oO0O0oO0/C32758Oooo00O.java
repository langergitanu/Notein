package oO0O0oO0;

import androidx.datastore.preferences.protobuf.C21825OoooOO0;
import java.lang.annotation.Annotation;
import java.util.Collection;
import o000ooOO.C24734OooO0O0;
import oO0O0ooO.InterfaceC32815OooO00o;
import oO0O0ooO.InterfaceC32835OooOo0o;
import oO0O0ooO.InterfaceC32836OooOoO;
import oO0OooO0.C33477OooO0OO;
import oO0OooO0.C33479OooO0o;

/* JADX INFO: renamed from: oO0O0oO0.Oooo00O, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C32758Oooo00O extends AbstractC32748OooOo0O implements InterfaceC32836OooOoO {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final AbstractC32756OooOooo f117701OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final Annotation[] f117702OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final String f117703OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final boolean f117704OooO0Oo;

    public C32758Oooo00O(AbstractC32756OooOooo abstractC32756OooOooo, Annotation[] reflectAnnotations, String str, boolean z) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(reflectAnnotations, "reflectAnnotations");
        this.f117701OooO00o = abstractC32756OooOooo;
        this.f117702OooO0O0 = reflectAnnotations;
        this.f117703OooO0OO = str;
        this.f117704OooO0Oo = z;
    }

    @Override // oO0O0ooO.InterfaceC32836OooOoO
    public final boolean OooO00o() {
        return this.f117704OooO0Oo;
    }

    @Override // oO0O0ooO.InterfaceC32818OooO0Oo
    public final InterfaceC32815OooO00o OooOOO0(C33477OooO0OO fqName) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(fqName, "fqName");
        return C24734OooO0O0.OooO0OO(this.f117702OooO0O0, fqName);
    }

    @Override // oO0O0ooO.InterfaceC32818OooO0Oo
    public final Collection getAnnotations() {
        return C24734OooO0O0.OooO0Oo(this.f117702OooO0O0);
    }

    @Override // oO0O0ooO.InterfaceC32836OooOoO
    public final C33479OooO0o getName() {
        String str = this.f117703OooO0OO;
        if (str != null) {
            return C33479OooO0o.OooO0Oo(str);
        }
        return null;
    }

    @Override // oO0O0ooO.InterfaceC32836OooOoO
    public final InterfaceC32835OooOo0o getType() {
        return this.f117701OooO00o;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        C21825OoooOO0.OooO0OO(C32758Oooo00O.class, sb, ": ");
        sb.append(this.f117704OooO0Oo ? "vararg " : "");
        sb.append(getName());
        sb.append(": ");
        sb.append(this.f117701OooO00o);
        return sb.toString();
    }
}
