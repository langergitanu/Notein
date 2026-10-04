package oO0oO00;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import oO0o.InterfaceC33531OooO0o0;
import oO0o0ooO.InterfaceC33911OooO0OO;

/* JADX INFO: renamed from: oO0oO00.OooO0o0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C33938OooO0o0<E> extends AbstractC33953OooOo0O<E, List<? extends E>, ArrayList<E>> {

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final C33936OooO0Oo f122142OooO0O0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C33938OooO0o0(InterfaceC33911OooO0OO<E> element) {
        super(element);
        kotlin.jvm.internal.OooOOO0.OooO0oO(element, "element");
        InterfaceC33531OooO0o0 elementDesc = element.getDescriptor();
        kotlin.jvm.internal.OooOOO0.OooO0oO(elementDesc, "elementDesc");
        this.f122142OooO0O0 = new C33936OooO0Oo(elementDesc);
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
    public final Object OooO0oO(Object obj) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(null, "<this>");
        return new ArrayList((Collection) null);
    }

    @Override // oO0oO00.AbstractC33933OooO00o
    public final Object OooO0oo(Object obj) {
        ArrayList arrayList = (ArrayList) obj;
        kotlin.jvm.internal.OooOOO0.OooO0oO(arrayList, "<this>");
        return arrayList;
    }

    @Override // oO0o0ooO.InterfaceC33911OooO0OO, oO0o0ooO.InterfaceC33910OooO0O0
    public final InterfaceC33531OooO0o0 getDescriptor() {
        return this.f122142OooO0O0;
    }
}
