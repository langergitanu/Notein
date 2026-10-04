package oOoo0;

import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Arrays;
import kotlin.jvm.internal.C24019OooOO0o;
import oO0O000o.InterfaceC32507OooOO0o;

/* JADX INFO: renamed from: oOoo0.OooOo0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C34611OooOo0 implements ParameterizedType, Type {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final Type f123983OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final Class<?> f123984OooOo0o;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public final Type[] f123985OooOoO0;

    /* JADX INFO: renamed from: oOoo0.OooOo0$OooO00o */
    public /* synthetic */ class OooO00o extends C24019OooOO0o implements InterfaceC32507OooOO0o<Type, String> {

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public static final OooO00o f123986OooOo0o = new OooO00o(1, C34614OooOo0o.class, "typeToString", "typeToString(Ljava/lang/reflect/Type;)Ljava/lang/String;", 1);

        @Override // oO0O000o.InterfaceC32507OooOO0o
        public final String invoke(Type type) {
            Type p0 = type;
            kotlin.jvm.internal.OooOOO0.OooO0oO(p0, "p0");
            return C34614OooOo0o.OooO00o(p0);
        }
    }

    public C34611OooOo0(ArrayList arrayList, Type type, Class cls) {
        this.f123984OooOo0o = cls;
        this.f123983OooOo = type;
        this.f123985OooOoO0 = (Type[]) arrayList.toArray(new Type[0]);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof ParameterizedType)) {
            return false;
        }
        ParameterizedType parameterizedType = (ParameterizedType) obj;
        if (kotlin.jvm.internal.OooOOO0.OooO0O0(this.f123984OooOo0o, parameterizedType.getRawType()) && kotlin.jvm.internal.OooOOO0.OooO0O0(this.f123983OooOo, parameterizedType.getOwnerType())) {
            return Arrays.equals(this.f123985OooOoO0, parameterizedType.getActualTypeArguments());
        }
        return false;
    }

    @Override // java.lang.reflect.ParameterizedType
    public final Type[] getActualTypeArguments() {
        return this.f123985OooOoO0;
    }

    @Override // java.lang.reflect.ParameterizedType
    public final Type getOwnerType() {
        return this.f123983OooOo;
    }

    @Override // java.lang.reflect.ParameterizedType
    public final Type getRawType() {
        return this.f123984OooOo0o;
    }

    @Override // java.lang.reflect.Type
    public final String getTypeName() {
        StringBuilder sb = new StringBuilder();
        Class<?> cls = this.f123984OooOo0o;
        Type type = this.f123983OooOo;
        if (type != null) {
            sb.append(C34614OooOo0o.OooO00o(type));
            sb.append("$");
            sb.append(cls.getSimpleName());
        } else {
            sb.append(C34614OooOo0o.OooO00o(cls));
        }
        Type[] typeArr = this.f123985OooOoO0;
        if (typeArr.length != 0) {
            oOo000Oo.OooOOO.Oooo00O(typeArr, sb, ", ", "<", ">", "...", OooO00o.f123986OooOo0o);
        }
        return sb.toString();
    }

    public final int hashCode() {
        int iHashCode = this.f123984OooOo0o.hashCode();
        Type type = this.f123983OooOo;
        return (iHashCode ^ (type != null ? type.hashCode() : 0)) ^ Arrays.hashCode(this.f123985OooOoO0);
    }

    public final String toString() {
        return getTypeName();
    }
}
