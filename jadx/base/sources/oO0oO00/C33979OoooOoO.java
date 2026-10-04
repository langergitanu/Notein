package oO0oO00;

import java.util.Collection;
import java.util.LinkedHashSet;
import java.util.Set;
import oO0o.InterfaceC33531OooO0o0;
import oO0o0ooO.InterfaceC33911OooO0OO;

/* JADX INFO: renamed from: oO0oO00.OoooOoO, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C33979OoooOoO<E> extends AbstractC33953OooOo0O<E, Set<? extends E>, LinkedHashSet<E>> {

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final C33978OoooOo0 f122201OooO0O0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C33979OoooOoO(InterfaceC33911OooO0OO<E> eSerializer) {
        super(eSerializer);
        kotlin.jvm.internal.OooOOO0.OooO0oO(eSerializer, "eSerializer");
        InterfaceC33531OooO0o0 elementDesc = eSerializer.getDescriptor();
        kotlin.jvm.internal.OooOOO0.OooO0oO(elementDesc, "elementDesc");
        this.f122201OooO0O0 = new C33978OoooOo0(elementDesc);
    }

    @Override // oO0oO00.AbstractC33951OooOo0
    public final void OooO(int i, Object obj, Object obj2) {
        LinkedHashSet linkedHashSet = (LinkedHashSet) obj;
        kotlin.jvm.internal.OooOOO0.OooO0oO(linkedHashSet, "<this>");
        linkedHashSet.add(obj2);
    }

    @Override // oO0oO00.AbstractC33933OooO00o
    public final Object OooO00o() {
        return new LinkedHashSet();
    }

    @Override // oO0oO00.AbstractC33933OooO00o
    public final int OooO0O0(Object obj) {
        LinkedHashSet linkedHashSet = (LinkedHashSet) obj;
        kotlin.jvm.internal.OooOOO0.OooO0oO(linkedHashSet, "<this>");
        return linkedHashSet.size();
    }

    @Override // oO0oO00.AbstractC33933OooO00o
    public final Object OooO0oO(Object obj) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(null, "<this>");
        return new LinkedHashSet((Collection) null);
    }

    @Override // oO0oO00.AbstractC33933OooO00o
    public final Object OooO0oo(Object obj) {
        LinkedHashSet linkedHashSet = (LinkedHashSet) obj;
        kotlin.jvm.internal.OooOOO0.OooO0oO(linkedHashSet, "<this>");
        return linkedHashSet;
    }

    @Override // oO0o0ooO.InterfaceC33911OooO0OO, oO0o0ooO.InterfaceC33910OooO0O0
    public final InterfaceC33531OooO0o0 getDescriptor() {
        return this.f122201OooO0O0;
    }
}
