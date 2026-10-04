package oO0O0oO0;

import androidx.datastore.preferences.protobuf.C21825OoooOO0;
import java.lang.annotation.Annotation;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;
import o0000OOo.C24217OooO0O0;
import oO0O0ooO.InterfaceC32815OooO00o;
import oO0OooO0.C33476OooO0O0;
import oO0OooO0.C33479OooO0o;
import oOoo0.InterfaceC34595OooO0Oo;

/* JADX INFO: renamed from: oO0O0oO0.OooO0o0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C32732OooO0o0 extends AbstractC32748OooOo0O implements InterfaceC32815OooO00o {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final Annotation f117676OooO00o;

    public C32732OooO0o0(Annotation annotation) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(annotation, "annotation");
        this.f117676OooO00o = annotation;
    }

    @Override // oO0O0ooO.InterfaceC32815OooO00o
    public final C32742OooOOo OooO0oo() {
        return new C32742OooOOo(C24217OooO0O0.OooO0Oo(C24217OooO0O0.OooO0OO(this.f117676OooO00o)));
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C32732OooO0o0) {
            return this.f117676OooO00o == ((C32732OooO0o0) obj).f117676OooO00o;
        }
        return false;
    }

    @Override // oO0O0ooO.InterfaceC32815OooO00o
    public final ArrayList getArguments() throws IllegalAccessException, InvocationTargetException {
        Annotation annotation = this.f117676OooO00o;
        Method[] declaredMethods = C24217OooO0O0.OooO0Oo(C24217OooO0O0.OooO0OO(annotation)).getDeclaredMethods();
        kotlin.jvm.internal.OooOOO0.OooO0o(declaredMethods, "annotation.annotationClass.java.declaredMethods");
        ArrayList arrayList = new ArrayList(declaredMethods.length);
        for (Method method : declaredMethods) {
            Object objInvoke = method.invoke(annotation, new Object[0]);
            kotlin.jvm.internal.OooOOO0.OooO0o(objInvoke, "method.invoke(annotation)");
            C33479OooO0o c33479OooO0oOooO0o0 = C33479OooO0o.OooO0o0(method.getName());
            Class<?> cls = objInvoke.getClass();
            List<InterfaceC34595OooO0Oo<? extends Object>> list = C32730OooO0Oo.f117669OooO00o;
            arrayList.add(Enum.class.isAssignableFrom(cls) ? new C32749OooOo0o(c33479OooO0oOooO0o0, (Enum) objInvoke) : objInvoke instanceof Annotation ? new C32733OooO0oO(c33479OooO0oOooO0o0, (Annotation) objInvoke) : objInvoke instanceof Object[] ? new C32734OooO0oo(c33479OooO0oOooO0o0, (Object[]) objInvoke) : objInvoke instanceof Class ? new C32744OooOOoo(c33479OooO0oOooO0o0, (Class) objInvoke) : new C32751OooOoO0(c33479OooO0oOooO0o0, objInvoke));
        }
        return arrayList;
    }

    @Override // oO0O0ooO.InterfaceC32815OooO00o
    public final C33476OooO0O0 getClassId() {
        return C32730OooO0Oo.OooO00o(C24217OooO0O0.OooO0Oo(C24217OooO0O0.OooO0OO(this.f117676OooO00o)));
    }

    public final int hashCode() {
        return System.identityHashCode(this.f117676OooO00o);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        C21825OoooOO0.OooO0OO(C32732OooO0o0.class, sb, ": ");
        sb.append(this.f117676OooO00o);
        return sb.toString();
    }
}
