package oO0o;

import java.lang.annotation.Annotation;
import java.util.List;
import oOoo0.InterfaceC34595OooO0Oo;

/* JADX INFO: renamed from: oO0o.OooO0O0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C33524OooO0O0 implements InterfaceC33531OooO0o0 {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final C33532OooO0oO f121100OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final InterfaceC34595OooO0Oo<?> f121101OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final String f121102OooO0OO;

    public C33524OooO0O0(C33532OooO0oO c33532OooO0oO, InterfaceC34595OooO0Oo kClass) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(kClass, "kClass");
        this.f121100OooO00o = c33532OooO0oO;
        this.f121101OooO0O0 = kClass;
        this.f121102OooO0OO = c33532OooO0oO.f121117OooO00o + '<' + kClass.OooOO0() + '>';
    }

    @Override // oO0o.InterfaceC33531OooO0o0
    public final boolean OooO(int i) {
        return this.f121100OooO00o.f121116OooO[i];
    }

    @Override // oO0o.InterfaceC33531OooO0o0
    public final boolean OooO0O0() {
        return false;
    }

    @Override // oO0o.InterfaceC33531OooO0o0
    public final int OooO0OO(String name) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(name, "name");
        return this.f121100OooO00o.OooO0OO(name);
    }

    @Override // oO0o.InterfaceC33531OooO0o0
    public final InterfaceC33531OooO0o0 OooO0Oo(int i) {
        return this.f121100OooO00o.f121123OooO0oO[i];
    }

    @Override // oO0o.InterfaceC33531OooO0o0
    public final String OooO0o(int i) {
        return this.f121100OooO00o.f121121OooO0o[i];
    }

    @Override // oO0o.InterfaceC33531OooO0o0
    public final int OooO0o0() {
        return this.f121100OooO00o.f121119OooO0OO;
    }

    @Override // oO0o.InterfaceC33531OooO0o0
    public final List<Annotation> OooO0oO(int i) {
        return this.f121100OooO00o.f121124OooO0oo[i];
    }

    @Override // oO0o.InterfaceC33531OooO0o0
    public final String OooO0oo() {
        return this.f121102OooO0OO;
    }

    public final boolean equals(Object obj) {
        C33524OooO0O0 c33524OooO0O0 = obj instanceof C33524OooO0O0 ? (C33524OooO0O0) obj : null;
        return c33524OooO0O0 != null && this.f121100OooO00o.equals(c33524OooO0O0.f121100OooO00o) && kotlin.jvm.internal.OooOOO0.OooO0O0(c33524OooO0O0.f121101OooO0O0, this.f121101OooO0O0);
    }

    @Override // oO0o.InterfaceC33531OooO0o0
    public final List<Annotation> getAnnotations() {
        return this.f121100OooO00o.f121120OooO0Oo;
    }

    @Override // oO0o.InterfaceC33531OooO0o0
    public final AbstractC33534OooOO0o getKind() {
        return this.f121100OooO00o.f121118OooO0O0;
    }

    public final int hashCode() {
        return this.f121102OooO0OO.hashCode() + (this.f121101OooO0O0.hashCode() * 31);
    }

    @Override // oO0o.InterfaceC33531OooO0o0
    public final boolean isInline() {
        return false;
    }

    public final String toString() {
        return "ContextDescriptor(kClass: " + this.f121101OooO0O0 + ", original: " + this.f121100OooO00o + ')';
    }
}
