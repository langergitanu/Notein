package oO0oO00;

import java.lang.annotation.Annotation;
import java.util.List;
import oO0o.AbstractC33534OooOO0o;
import oO0o.InterfaceC33531OooO0o0;
import oO0o.OooOOO0;
import oO0o0O0o.C33596OooOOo0;
import oOo000Oo.C34434OooOoO;

/* JADX INFO: renamed from: oO0oO00.Oooooo0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public abstract class AbstractC33987Oooooo0 implements InterfaceC33531OooO0o0 {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final String f122216OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final InterfaceC33531OooO0o0 f122217OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final InterfaceC33531OooO0o0 f122218OooO0OO;

    public AbstractC33987Oooooo0(String str, InterfaceC33531OooO0o0 interfaceC33531OooO0o0, InterfaceC33531OooO0o0 interfaceC33531OooO0o02) {
        this.f122216OooO00o = str;
        this.f122217OooO0O0 = interfaceC33531OooO0o0;
        this.f122218OooO0OO = interfaceC33531OooO0o02;
    }

    @Override // oO0o.InterfaceC33531OooO0o0
    public final boolean OooO(int i) {
        if (i >= 0) {
            return false;
        }
        throw new IllegalArgumentException(androidx.concurrent.futures.OooO00o.OooO0OO(OooO0O0.OooO0o.OooO0OO(i, "Illegal index ", ", "), this.f122216OooO00o, " expects only non-negative indices").toString());
    }

    @Override // oO0o.InterfaceC33531OooO0o0
    public final boolean OooO0O0() {
        return false;
    }

    @Override // oO0o.InterfaceC33531OooO0o0
    public final int OooO0OO(String name) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(name, "name");
        Integer numOooOOO0 = C33596OooOOo0.OooOOO0(name);
        if (numOooOOO0 != null) {
            return numOooOOO0.intValue();
        }
        throw new IllegalArgumentException(name.concat(" is not a valid map index"));
    }

    @Override // oO0o.InterfaceC33531OooO0o0
    public final InterfaceC33531OooO0o0 OooO0Oo(int i) {
        if (i < 0) {
            throw new IllegalArgumentException(androidx.concurrent.futures.OooO00o.OooO0OO(OooO0O0.OooO0o.OooO0OO(i, "Illegal index ", ", "), this.f122216OooO00o, " expects only non-negative indices").toString());
        }
        int i2 = i % 2;
        if (i2 == 0) {
            return this.f122217OooO0O0;
        }
        if (i2 == 1) {
            return this.f122218OooO0OO;
        }
        throw new IllegalStateException("Unreached");
    }

    @Override // oO0o.InterfaceC33531OooO0o0
    public final String OooO0o(int i) {
        return String.valueOf(i);
    }

    @Override // oO0o.InterfaceC33531OooO0o0
    public final int OooO0o0() {
        return 2;
    }

    @Override // oO0o.InterfaceC33531OooO0o0
    public final List<Annotation> OooO0oO(int i) {
        if (i >= 0) {
            return C34434OooOoO.f123453OooOo0o;
        }
        throw new IllegalArgumentException(androidx.concurrent.futures.OooO00o.OooO0OO(OooO0O0.OooO0o.OooO0OO(i, "Illegal index ", ", "), this.f122216OooO00o, " expects only non-negative indices").toString());
    }

    @Override // oO0o.InterfaceC33531OooO0o0
    public final String OooO0oo() {
        return this.f122216OooO00o;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AbstractC33987Oooooo0)) {
            return false;
        }
        AbstractC33987Oooooo0 abstractC33987Oooooo0 = (AbstractC33987Oooooo0) obj;
        return kotlin.jvm.internal.OooOOO0.OooO0O0(this.f122216OooO00o, abstractC33987Oooooo0.f122216OooO00o) && kotlin.jvm.internal.OooOOO0.OooO0O0(this.f122217OooO0O0, abstractC33987Oooooo0.f122217OooO0O0) && kotlin.jvm.internal.OooOOO0.OooO0O0(this.f122218OooO0OO, abstractC33987Oooooo0.f122218OooO0OO);
    }

    @Override // oO0o.InterfaceC33531OooO0o0
    public final List<Annotation> getAnnotations() {
        return C34434OooOoO.f123453OooOo0o;
    }

    @Override // oO0o.InterfaceC33531OooO0o0
    public final AbstractC33534OooOO0o getKind() {
        return OooOOO0.OooO0OO.f121134OooO00o;
    }

    public final int hashCode() {
        return this.f122218OooO0OO.hashCode() + ((this.f122217OooO0O0.hashCode() + (this.f122216OooO00o.hashCode() * 31)) * 31);
    }

    @Override // oO0o.InterfaceC33531OooO0o0
    public final boolean isInline() {
        return false;
    }

    public final String toString() {
        return this.f122216OooO00o + '(' + this.f122217OooO0O0 + ", " + this.f122218OooO0OO + ')';
    }
}
