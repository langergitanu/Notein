package oO0O0oO0;

import java.lang.reflect.Field;
import java.lang.reflect.GenericArrayType;
import java.lang.reflect.Member;
import java.lang.reflect.Type;
import java.lang.reflect.WildcardType;
import oO0O0ooO.InterfaceC32826OooOOO;
import oO0O0ooO.InterfaceC32835OooOo0o;

/* JADX INFO: renamed from: oO0O0oO0.OooOo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C32745OooOo extends AbstractC32750OooOoO implements InterfaceC32826OooOOO {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final Field f117689OooO00o;

    public C32745OooOo(Field member) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(member, "member");
        this.f117689OooO00o = member;
    }

    @Override // oO0O0ooO.InterfaceC32826OooOOO
    public final boolean OooOoo0() {
        return this.f117689OooO00o.isEnumConstant();
    }

    @Override // oO0O0oO0.AbstractC32750OooOoO
    public final Member Oooo000() {
        return this.f117689OooO00o;
    }

    @Override // oO0O0ooO.InterfaceC32826OooOOO
    public final InterfaceC32835OooOo0o getType() {
        Type genericType = this.f117689OooO00o.getGenericType();
        kotlin.jvm.internal.OooOOO0.OooO0o(genericType, "member.genericType");
        boolean z = genericType instanceof Class;
        if (z) {
            Class cls = (Class) genericType;
            if (cls.isPrimitive()) {
                return new C32753OooOoo(cls);
            }
        }
        return ((genericType instanceof GenericArrayType) || (z && ((Class) genericType).isArray())) ? new C32726OooO(genericType) : genericType instanceof WildcardType ? new C32759Oooo00o((WildcardType) genericType) : new C32747OooOo00(genericType);
    }
}
