package oO0O0oO0;

import java.lang.annotation.Annotation;
import java.util.ArrayList;
import java.util.List;
import oO0O0ooO.InterfaceC32820OooO0o0;
import oO0OooO0.C33479OooO0o;
import oOoo0.InterfaceC34595OooO0Oo;

/* JADX INFO: renamed from: oO0O0oO0.OooO0oo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C32734OooO0oo extends AbstractC32731OooO0o implements InterfaceC32820OooO0o0 {

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final Object[] f117678OooO0O0;

    public C32734OooO0oo(C33479OooO0o c33479OooO0o, Object[] objArr) {
        super(c33479OooO0o);
        this.f117678OooO0O0 = objArr;
    }

    @Override // oO0O0ooO.InterfaceC32820OooO0o0
    public final ArrayList OooO0O0() {
        Object[] objArr = this.f117678OooO0O0;
        ArrayList arrayList = new ArrayList(objArr.length);
        for (Object obj : objArr) {
            kotlin.jvm.internal.OooOOO0.OooO0Oo(obj);
            Class<?> cls = obj.getClass();
            List<InterfaceC34595OooO0Oo<? extends Object>> list = C32730OooO0Oo.f117669OooO00o;
            arrayList.add(Enum.class.isAssignableFrom(cls) ? new C32749OooOo0o(null, (Enum) obj) : obj instanceof Annotation ? new C32733OooO0oO(null, (Annotation) obj) : obj instanceof Object[] ? new C32734OooO0oo(null, (Object[]) obj) : obj instanceof Class ? new C32744OooOOoo(null, (Class) obj) : new C32751OooOoO0(null, obj));
        }
        return arrayList;
    }
}
