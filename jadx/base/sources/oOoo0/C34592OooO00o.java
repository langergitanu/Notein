package oOoo0;

import com.huawei.hms.network.embedded.C18416x7;
import java.lang.reflect.GenericArrayType;
import java.lang.reflect.Type;

/* JADX INFO: renamed from: oOoo0.OooO00o, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C34592OooO00o implements GenericArrayType, Type {

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final Type f123969OooOo0o;

    public C34592OooO00o(Type elementType) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(elementType, "elementType");
        this.f123969OooOo0o = elementType;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof GenericArrayType) {
            return kotlin.jvm.internal.OooOOO0.OooO0O0(this.f123969OooOo0o, ((GenericArrayType) obj).getGenericComponentType());
        }
        return false;
    }

    @Override // java.lang.reflect.GenericArrayType
    public final Type getGenericComponentType() {
        return this.f123969OooOo0o;
    }

    @Override // java.lang.reflect.Type
    public final String getTypeName() {
        return C34614OooOo0o.OooO00o(this.f123969OooOo0o) + C18416x7.f56644n;
    }

    public final int hashCode() {
        return this.f123969OooOo0o.hashCode();
    }

    public final String toString() {
        return getTypeName();
    }
}
