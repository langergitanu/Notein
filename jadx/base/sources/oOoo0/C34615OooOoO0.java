package oOoo0;

import com.microsoft.identity.client.internal.MsalUtils;
import java.lang.reflect.Type;
import java.lang.reflect.WildcardType;
import java.util.Arrays;

/* JADX INFO: renamed from: oOoo0.OooOoO0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C34615OooOoO0 implements WildcardType, Type {

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public static final C34615OooOoO0 f123994OooOoO0 = new C34615OooOoO0(null, null);

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final Type f123995OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final Type f123996OooOo0o;

    public C34615OooOoO0(Type type, Type type2) {
        this.f123996OooOo0o = type;
        this.f123995OooOo = type2;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof WildcardType)) {
            return false;
        }
        WildcardType wildcardType = (WildcardType) obj;
        return Arrays.equals(getUpperBounds(), wildcardType.getUpperBounds()) && Arrays.equals(getLowerBounds(), wildcardType.getLowerBounds());
    }

    @Override // java.lang.reflect.WildcardType
    public final Type[] getLowerBounds() {
        Type type = this.f123995OooOo;
        return type == null ? new Type[0] : new Type[]{type};
    }

    @Override // java.lang.reflect.Type
    public final String getTypeName() {
        Type type = this.f123995OooOo;
        if (type != null) {
            return "? super " + C34614OooOo0o.OooO00o(type);
        }
        Type type2 = this.f123996OooOo0o;
        if (type2 == null || kotlin.jvm.internal.OooOOO0.OooO0O0(type2, Object.class)) {
            return MsalUtils.QUERY_STRING_SYMBOL;
        }
        return "? extends " + C34614OooOo0o.OooO00o(type2);
    }

    @Override // java.lang.reflect.WildcardType
    public final Type[] getUpperBounds() {
        Type type = this.f123996OooOo0o;
        if (type == null) {
            type = Object.class;
        }
        return new Type[]{type};
    }

    public final int hashCode() {
        return Arrays.hashCode(getUpperBounds()) ^ Arrays.hashCode(getLowerBounds());
    }

    public final String toString() {
        return getTypeName();
    }
}
