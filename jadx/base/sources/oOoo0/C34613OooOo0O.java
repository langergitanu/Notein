package oOoo0;

import java.lang.reflect.GenericDeclaration;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import oO00ooO.C32444OooOOO0;
import oOo000Oo.C34428OooOOo;

/* JADX INFO: renamed from: oOoo0.OooOo0O, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C34613OooOo0O implements TypeVariable<GenericDeclaration>, Type {

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final InterfaceC34608OooOOo0 f123992OooOo0o;

    public C34613OooOo0O(InterfaceC34608OooOOo0 typeParameter) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(typeParameter, "typeParameter");
        this.f123992OooOo0o = typeParameter;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof TypeVariable) || !this.f123992OooOo0o.getName().equals(((TypeVariable) obj).getName())) {
            return false;
        }
        getGenericDeclaration();
        throw null;
    }

    @Override // java.lang.reflect.TypeVariable
    public final Type[] getBounds() {
        List<InterfaceC34606OooOOOo> upperBounds = this.f123992OooOo0o.getUpperBounds();
        ArrayList arrayList = new ArrayList(C34428OooOOo.OooOOoo(upperBounds, 10));
        Iterator<T> it = upperBounds.iterator();
        while (it.hasNext()) {
            arrayList.add(C34614OooOo0o.OooO0O0((InterfaceC34606OooOOOo) it.next(), true));
        }
        return (Type[]) arrayList.toArray(new Type[0]);
    }

    @Override // java.lang.reflect.TypeVariable
    public final GenericDeclaration getGenericDeclaration() {
        throw new C32444OooOOO0(com.alibaba.sdk.android.oss.internal.OooO00o.OooO00o("An operation is not implemented: ", "getGenericDeclaration() is not yet supported for type variables created from KType: " + this.f123992OooOo0o));
    }

    @Override // java.lang.reflect.TypeVariable
    public final String getName() {
        return this.f123992OooOo0o.getName();
    }

    @Override // java.lang.reflect.Type
    public final String getTypeName() {
        return this.f123992OooOo0o.getName();
    }

    public final int hashCode() {
        this.f123992OooOo0o.getName();
        getGenericDeclaration();
        throw null;
    }

    public final String toString() {
        return this.f123992OooOo0o.getName();
    }
}
