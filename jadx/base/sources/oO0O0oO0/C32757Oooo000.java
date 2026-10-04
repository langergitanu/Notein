package oO0O0oO0;

import androidx.datastore.preferences.protobuf.C21825OoooOO0;
import java.lang.annotation.Annotation;
import java.lang.reflect.AnnotatedElement;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.util.ArrayList;
import java.util.Collection;
import o000ooOO.C24734OooO0O0;
import oO0O0ooO.InterfaceC32815OooO00o;
import oO0O0ooO.InterfaceC32818OooO0Oo;
import oO0OooO0.C33477OooO0OO;
import oO0OooO0.C33479OooO0o;
import oOo000Oo.C34434OooOoO;

/* JADX INFO: renamed from: oO0O0oO0.Oooo000, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C32757Oooo000 extends AbstractC32748OooOo0O implements InterfaceC32818OooO0Oo, oO0O0ooO.OooOo {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final TypeVariable<?> f117700OooO00o;

    public C32757Oooo000(TypeVariable<?> typeVariable) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(typeVariable, "typeVariable");
        this.f117700OooO00o = typeVariable;
    }

    @Override // oO0O0ooO.InterfaceC32818OooO0Oo
    public final InterfaceC32815OooO00o OooOOO0(C33477OooO0OO fqName) {
        Annotation[] declaredAnnotations;
        kotlin.jvm.internal.OooOOO0.OooO0oO(fqName, "fqName");
        TypeVariable<?> typeVariable = this.f117700OooO00o;
        AnnotatedElement annotatedElement = typeVariable instanceof AnnotatedElement ? (AnnotatedElement) typeVariable : null;
        if (annotatedElement == null || (declaredAnnotations = annotatedElement.getDeclaredAnnotations()) == null) {
            return null;
        }
        return C24734OooO0O0.OooO0OO(declaredAnnotations, fqName);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C32757Oooo000) {
            return kotlin.jvm.internal.OooOOO0.OooO0O0(this.f117700OooO00o, ((C32757Oooo000) obj).f117700OooO00o);
        }
        return false;
    }

    @Override // oO0O0ooO.InterfaceC32818OooO0Oo
    public final Collection getAnnotations() {
        Annotation[] declaredAnnotations;
        TypeVariable<?> typeVariable = this.f117700OooO00o;
        AnnotatedElement annotatedElement = typeVariable instanceof AnnotatedElement ? (AnnotatedElement) typeVariable : null;
        return (annotatedElement == null || (declaredAnnotations = annotatedElement.getDeclaredAnnotations()) == null) ? C34434OooOoO.f123453OooOo0o : C24734OooO0O0.OooO0Oo(declaredAnnotations);
    }

    @Override // oO0O0ooO.InterfaceC32832OooOOoo
    public final C33479OooO0o getName() {
        return C33479OooO0o.OooO0o0(this.f117700OooO00o.getName());
    }

    @Override // oO0O0ooO.OooOo
    public final Collection getUpperBounds() {
        Type[] bounds = this.f117700OooO00o.getBounds();
        kotlin.jvm.internal.OooOOO0.OooO0o(bounds, "typeVariable.bounds");
        ArrayList arrayList = new ArrayList(bounds.length);
        for (Type type : bounds) {
            arrayList.add(new C32747OooOo00(type));
        }
        C32747OooOo00 c32747OooOo00 = (C32747OooOo00) oOo000Oo.OooOo.o0OoOo0(arrayList);
        Collection collection = arrayList;
        if (kotlin.jvm.internal.OooOOO0.OooO0O0(c32747OooOo00 != null ? c32747OooOo00.f117691OooO00o : null, Object.class)) {
            collection = C34434OooOoO.f123453OooOo0o;
        }
        return collection;
    }

    public final int hashCode() {
        return this.f117700OooO00o.hashCode();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        C21825OoooOO0.OooO0OO(C32757Oooo000.class, sb, ": ");
        sb.append(this.f117700OooO00o);
        return sb.toString();
    }
}
