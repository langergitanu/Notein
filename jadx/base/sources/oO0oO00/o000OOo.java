package oO0oO00;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Iterator;
import o0000OOo.C24217OooO0O0;
import oO0o.InterfaceC33531OooO0o0;
import oO0o0ooO.InterfaceC33911OooO0OO;
import oOoo0.InterfaceC34595OooO0Oo;

/* JADX INFO: loaded from: classes10.dex */
public final class o000OOo<ElementKlass, Element extends ElementKlass> extends AbstractC33951OooOo0<Element, Element[], ArrayList<Element>> {

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final InterfaceC34595OooO0Oo<ElementKlass> f122259OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final C33935OooO0OO f122260OooO0OO;

    public o000OOo(InterfaceC34595OooO0Oo<ElementKlass> interfaceC34595OooO0Oo, InterfaceC33911OooO0OO<Element> interfaceC33911OooO0OO) {
        super(interfaceC33911OooO0OO);
        this.f122259OooO0O0 = interfaceC34595OooO0Oo;
        InterfaceC33531OooO0o0 elementDesc = interfaceC33911OooO0OO.getDescriptor();
        kotlin.jvm.internal.OooOOO0.OooO0oO(elementDesc, "elementDesc");
        this.f122260OooO0OO = new C33935OooO0OO(elementDesc);
    }

    @Override // oO0oO00.AbstractC33951OooOo0
    public final void OooO(int i, Object obj, Object obj2) {
        ArrayList arrayList = (ArrayList) obj;
        kotlin.jvm.internal.OooOOO0.OooO0oO(arrayList, "<this>");
        arrayList.add(i, obj2);
    }

    @Override // oO0oO00.AbstractC33933OooO00o
    public final Object OooO00o() {
        return new ArrayList();
    }

    @Override // oO0oO00.AbstractC33933OooO00o
    public final int OooO0O0(Object obj) {
        ArrayList arrayList = (ArrayList) obj;
        kotlin.jvm.internal.OooOOO0.OooO0oO(arrayList, "<this>");
        return arrayList.size();
    }

    @Override // oO0oO00.AbstractC33933OooO00o
    public final Iterator OooO0OO(Object obj) {
        Object[] objArr = (Object[]) obj;
        kotlin.jvm.internal.OooOOO0.OooO0oO(objArr, "<this>");
        return kotlin.jvm.internal.OooO0OO.OooO0O0(objArr);
    }

    @Override // oO0oO00.AbstractC33933OooO00o
    public final int OooO0Oo(Object obj) {
        Object[] objArr = (Object[]) obj;
        kotlin.jvm.internal.OooOOO0.OooO0oO(objArr, "<this>");
        return objArr.length;
    }

    @Override // oO0oO00.AbstractC33933OooO00o
    public final Object OooO0oO(Object obj) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(null, "<this>");
        Oooo.OooO0OO.OooO0Oo(null);
        throw null;
    }

    @Override // oO0oO00.AbstractC33933OooO00o
    public final Object OooO0oo(Object obj) {
        ArrayList arrayList = (ArrayList) obj;
        kotlin.jvm.internal.OooOOO0.OooO0oO(arrayList, "<this>");
        InterfaceC34595OooO0Oo<ElementKlass> eClass = this.f122259OooO0O0;
        kotlin.jvm.internal.OooOOO0.OooO0oO(eClass, "eClass");
        Object objNewInstance = Array.newInstance((Class<?>) C24217OooO0O0.OooO0Oo(eClass), arrayList.size());
        kotlin.jvm.internal.OooOOO0.OooO0o0(objNewInstance, "null cannot be cast to non-null type kotlin.Array<E of kotlinx.serialization.internal.PlatformKt.toNativeArrayImpl>");
        Object[] array = arrayList.toArray((Object[]) objNewInstance);
        kotlin.jvm.internal.OooOOO0.OooO0o(array, "toArray(...)");
        return array;
    }

    @Override // oO0o0ooO.InterfaceC33911OooO0OO, oO0o0ooO.InterfaceC33910OooO0O0
    public final InterfaceC33531OooO0o0 getDescriptor() {
        return this.f122260OooO0OO;
    }
}
