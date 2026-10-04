package oO0oO00;

import java.lang.annotation.Annotation;
import java.util.List;
import java.util.Set;
import oO0o.AbstractC33534OooOO0o;
import oO0o.InterfaceC33531OooO0o0;

/* JADX INFO: loaded from: classes10.dex */
public final class o000000 implements InterfaceC33531OooO0o0, InterfaceC33945OooOOO0 {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final InterfaceC33531OooO0o0 f122224OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final String f122225OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final Set<String> f122226OooO0OO;

    public o000000(InterfaceC33531OooO0o0 original) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(original, "original");
        this.f122224OooO00o = original;
        this.f122225OooO0O0 = original.OooO0oo() + '?';
        this.f122226OooO0OO = o00oO0O.OooO00o(original);
    }

    @Override // oO0o.InterfaceC33531OooO0o0
    public final boolean OooO(int i) {
        return this.f122224OooO00o.OooO(i);
    }

    @Override // oO0oO00.InterfaceC33945OooOOO0
    public final Set<String> OooO00o() {
        return this.f122226OooO0OO;
    }

    @Override // oO0o.InterfaceC33531OooO0o0
    public final boolean OooO0O0() {
        return true;
    }

    @Override // oO0o.InterfaceC33531OooO0o0
    public final int OooO0OO(String name) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(name, "name");
        return this.f122224OooO00o.OooO0OO(name);
    }

    @Override // oO0o.InterfaceC33531OooO0o0
    public final InterfaceC33531OooO0o0 OooO0Oo(int i) {
        return this.f122224OooO00o.OooO0Oo(i);
    }

    @Override // oO0o.InterfaceC33531OooO0o0
    public final String OooO0o(int i) {
        return this.f122224OooO00o.OooO0o(i);
    }

    @Override // oO0o.InterfaceC33531OooO0o0
    public final int OooO0o0() {
        return this.f122224OooO00o.OooO0o0();
    }

    @Override // oO0o.InterfaceC33531OooO0o0
    public final List<Annotation> OooO0oO(int i) {
        return this.f122224OooO00o.OooO0oO(i);
    }

    @Override // oO0o.InterfaceC33531OooO0o0
    public final String OooO0oo() {
        return this.f122225OooO0O0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof o000000) {
            return kotlin.jvm.internal.OooOOO0.OooO0O0(this.f122224OooO00o, ((o000000) obj).f122224OooO00o);
        }
        return false;
    }

    @Override // oO0o.InterfaceC33531OooO0o0
    public final List<Annotation> getAnnotations() {
        return this.f122224OooO00o.getAnnotations();
    }

    @Override // oO0o.InterfaceC33531OooO0o0
    public final AbstractC33534OooOO0o getKind() {
        return this.f122224OooO00o.getKind();
    }

    public final int hashCode() {
        return this.f122224OooO00o.hashCode() * 31;
    }

    @Override // oO0o.InterfaceC33531OooO0o0
    public final boolean isInline() {
        return this.f122224OooO00o.isInline();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.f122224OooO00o);
        sb.append('?');
        return sb.toString();
    }
}
