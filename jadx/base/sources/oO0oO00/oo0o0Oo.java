package oO0oO00;

import Oooo0oO.C21111o0ooOoO;
import java.lang.annotation.Annotation;
import java.util.List;
import oO0o.AbstractC33526OooO0Oo;
import oO0o.AbstractC33534OooOO0o;
import oO0o.InterfaceC33531OooO0o0;
import oOo000Oo.C34434OooOoO;

/* JADX INFO: loaded from: classes10.dex */
public final class oo0o0Oo implements InterfaceC33531OooO0o0 {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final String f122292OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final AbstractC33526OooO0Oo f122293OooO0O0;

    public oo0o0Oo(String str, AbstractC33526OooO0Oo kind) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(kind, "kind");
        this.f122292OooO00o = str;
        this.f122293OooO0O0 = kind;
    }

    @Override // oO0o.InterfaceC33531OooO0o0
    public final boolean OooO(int i) {
        throw new IllegalStateException("Primitive descriptor does not have elements");
    }

    @Override // oO0o.InterfaceC33531OooO0o0
    public final boolean OooO0O0() {
        return false;
    }

    @Override // oO0o.InterfaceC33531OooO0o0
    public final int OooO0OO(String name) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(name, "name");
        throw new IllegalStateException("Primitive descriptor does not have elements");
    }

    @Override // oO0o.InterfaceC33531OooO0o0
    public final InterfaceC33531OooO0o0 OooO0Oo(int i) {
        throw new IllegalStateException("Primitive descriptor does not have elements");
    }

    @Override // oO0o.InterfaceC33531OooO0o0
    public final String OooO0o(int i) {
        throw new IllegalStateException("Primitive descriptor does not have elements");
    }

    @Override // oO0o.InterfaceC33531OooO0o0
    public final int OooO0o0() {
        return 0;
    }

    @Override // oO0o.InterfaceC33531OooO0o0
    public final List<Annotation> OooO0oO(int i) {
        throw new IllegalStateException("Primitive descriptor does not have elements");
    }

    @Override // oO0o.InterfaceC33531OooO0o0
    public final String OooO0oo() {
        return this.f122292OooO00o;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof oo0o0Oo)) {
            return false;
        }
        oo0o0Oo oo0o0oo = (oo0o0Oo) obj;
        if (kotlin.jvm.internal.OooOOO0.OooO0O0(this.f122292OooO00o, oo0o0oo.f122292OooO00o)) {
            if (kotlin.jvm.internal.OooOOO0.OooO0O0(this.f122293OooO0O0, oo0o0oo.f122293OooO0O0)) {
                return true;
            }
        }
        return false;
    }

    @Override // oO0o.InterfaceC33531OooO0o0
    public final List<Annotation> getAnnotations() {
        return C34434OooOoO.f123453OooOo0o;
    }

    @Override // oO0o.InterfaceC33531OooO0o0
    public final AbstractC33534OooOO0o getKind() {
        return this.f122293OooO0O0;
    }

    public final int hashCode() {
        return (this.f122293OooO0O0.hashCode() * 31) + this.f122292OooO00o.hashCode();
    }

    @Override // oO0o.InterfaceC33531OooO0o0
    public final boolean isInline() {
        return false;
    }

    public final String toString() {
        return C21111o0ooOoO.OooO0OO(this.f122292OooO00o, ')', new StringBuilder("PrimitiveDescriptor("));
    }
}
