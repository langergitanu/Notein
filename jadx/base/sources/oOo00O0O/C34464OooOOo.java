package oOo00O0O;

import OooOoOO.C20519OooO0Oo;
import java.lang.annotation.Annotation;
import java.util.List;
import oO00ooO.C32447OooOOo;
import oO0o.AbstractC33534OooOO0o;
import oO0o.InterfaceC33531OooO0o0;
import oOo000Oo.C34434OooOoO;

/* JADX INFO: renamed from: oOo00O0O.OooOOo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C34464OooOOo implements InterfaceC33531OooO0o0 {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final C32447OooOOo f123522OooO00o;

    public C34464OooOOo(oO0O000o.OooO00o<? extends InterfaceC33531OooO0o0> oooO00o) {
        this.f123522OooO00o = C20519OooO0Oo.OooO0OO(oooO00o);
    }

    @Override // oO0o.InterfaceC33531OooO0o0
    public final boolean OooO(int i) {
        return OooO00o().OooO(i);
    }

    public final InterfaceC33531OooO0o0 OooO00o() {
        return (InterfaceC33531OooO0o0) this.f123522OooO00o.getValue();
    }

    @Override // oO0o.InterfaceC33531OooO0o0
    public final boolean OooO0O0() {
        return false;
    }

    @Override // oO0o.InterfaceC33531OooO0o0
    public final int OooO0OO(String name) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(name, "name");
        return OooO00o().OooO0OO(name);
    }

    @Override // oO0o.InterfaceC33531OooO0o0
    public final InterfaceC33531OooO0o0 OooO0Oo(int i) {
        return OooO00o().OooO0Oo(i);
    }

    @Override // oO0o.InterfaceC33531OooO0o0
    public final String OooO0o(int i) {
        return OooO00o().OooO0o(i);
    }

    @Override // oO0o.InterfaceC33531OooO0o0
    public final int OooO0o0() {
        return OooO00o().OooO0o0();
    }

    @Override // oO0o.InterfaceC33531OooO0o0
    public final List<Annotation> OooO0oO(int i) {
        return OooO00o().OooO0oO(i);
    }

    @Override // oO0o.InterfaceC33531OooO0o0
    public final String OooO0oo() {
        return OooO00o().OooO0oo();
    }

    @Override // oO0o.InterfaceC33531OooO0o0
    public final List<Annotation> getAnnotations() {
        return C34434OooOoO.f123453OooOo0o;
    }

    @Override // oO0o.InterfaceC33531OooO0o0
    public final AbstractC33534OooOO0o getKind() {
        return OooO00o().getKind();
    }

    @Override // oO0o.InterfaceC33531OooO0o0
    public final boolean isInline() {
        return false;
    }
}
