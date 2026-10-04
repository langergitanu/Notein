package oO0O0oO0;

import java.lang.reflect.Type;
import java.util.Collection;
import oO0O0ooO.InterfaceC32815OooO00o;
import oO0O0ooO.InterfaceC32833OooOo0;
import oO0Oo0.EnumC33191OooO0Oo;
import oOo000Oo.C34434OooOoO;

/* JADX INFO: renamed from: oO0O0oO0.OooOoo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C32753OooOoo extends AbstractC32756OooOooo implements InterfaceC32833OooOo0 {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final Class<?> f117696OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final C34434OooOoO f117697OooO0O0 = C34434OooOoO.f123453OooOo0o;

    public C32753OooOoo(Class<?> cls) {
        this.f117696OooO00o = cls;
    }

    @Override // oO0O0oO0.AbstractC32756OooOooo
    public final Type Oooo000() {
        return this.f117696OooO00o;
    }

    @Override // oO0O0ooO.InterfaceC32818OooO0Oo
    public final Collection<InterfaceC32815OooO00o> getAnnotations() {
        return this.f117697OooO0O0;
    }

    @Override // oO0O0ooO.InterfaceC32833OooOo0
    public final oO0O0O0o.OooOO0O getType() {
        Class cls = Void.TYPE;
        Class<?> cls2 = this.f117696OooO00o;
        if (kotlin.jvm.internal.OooOOO0.OooO0O0(cls2, cls)) {
            return null;
        }
        return EnumC33191OooO0Oo.OooO0O0(cls2.getName()).OooO0Oo();
    }
}
