package oO0O0oO0;

import java.lang.reflect.GenericArrayType;
import java.lang.reflect.WildcardType;
import oO0O0ooO.InterfaceC32822OooO0oo;
import oO0OooO0.C33479OooO0o;

/* JADX INFO: renamed from: oO0O0oO0.OooOOoo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C32744OooOOoo extends AbstractC32731OooO0o implements InterfaceC32822OooO0oo {

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final Class<?> f117688OooO0O0;

    public C32744OooOOoo(C33479OooO0o c33479OooO0o, Class<?> cls) {
        super(c33479OooO0o);
        this.f117688OooO0O0 = cls;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // oO0O0ooO.InterfaceC32822OooO0oo
    public final AbstractC32756OooOooo OooO0OO() {
        Class<?> cls = this.f117688OooO0O0;
        return cls.isPrimitive() ? new C32753OooOoo(cls) : ((cls instanceof GenericArrayType) || cls.isArray()) ? new C32726OooO(cls) : cls instanceof WildcardType ? new C32759Oooo00o((WildcardType) cls) : new C32747OooOo00(cls);
    }
}
