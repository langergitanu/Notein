package oO0oO00;

import java.util.Iterator;
import oO0o.InterfaceC33531OooO0o0;
import oO0o0ooO.InterfaceC33911OooO0OO;
import oO0oO00.o0OOO0o;
import oO0oO000.InterfaceC34004OooO0Oo;

/* JADX INFO: loaded from: classes10.dex */
public abstract class o0OO00O<Element, Array, Builder extends o0OOO0o<Array>> extends AbstractC33951OooOo0<Element, Array, Builder> {

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final o0Oo0oo f122275OooO0O0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o0OO00O(InterfaceC33911OooO0OO<Element> primitiveSerializer) {
        super(primitiveSerializer);
        kotlin.jvm.internal.OooOOO0.OooO0oO(primitiveSerializer, "primitiveSerializer");
        this.f122275OooO0O0 = new o0Oo0oo(primitiveSerializer.getDescriptor());
    }

    @Override // oO0oO00.AbstractC33951OooOo0
    public final void OooO(int i, Object obj, Object obj2) {
        kotlin.jvm.internal.OooOOO0.OooO0oO((o0OOO0o) obj, "<this>");
        throw new IllegalStateException("This method lead to boxing and must not be used, use Builder.append instead");
    }

    @Override // oO0oO00.AbstractC33933OooO00o
    public final Object OooO00o() {
        return OooO0oO(OooOO0());
    }

    @Override // oO0oO00.AbstractC33933OooO00o
    public final int OooO0O0(Object obj) {
        o0OOO0o o0ooo0o2 = (o0OOO0o) obj;
        kotlin.jvm.internal.OooOOO0.OooO0oO(o0ooo0o2, "<this>");
        return o0ooo0o2.OooO0Oo();
    }

    @Override // oO0oO00.AbstractC33933OooO00o
    public final Iterator<Element> OooO0OO(Array array) {
        throw new IllegalStateException("This method lead to boxing and must not be used, use writeContents instead");
    }

    @Override // oO0oO00.AbstractC33933OooO00o
    public final Object OooO0oo(Object obj) {
        o0OOO0o o0ooo0o2 = (o0OOO0o) obj;
        kotlin.jvm.internal.OooOOO0.OooO0oO(o0ooo0o2, "<this>");
        return o0ooo0o2.OooO00o();
    }

    public abstract Array OooOO0();

    public abstract void OooOO0O(oO0oO000.OooO0O0 oooO0O0, Array array, int i);

    @Override // oO0oO00.AbstractC33933OooO00o, oO0o0ooO.InterfaceC33910OooO0O0
    public final Array deserialize(oO0oO000.OooO0OO oooO0OO) {
        return (Array) OooO0o0(oooO0OO);
    }

    @Override // oO0o0ooO.InterfaceC33911OooO0OO, oO0o0ooO.InterfaceC33910OooO0O0
    public final InterfaceC33531OooO0o0 getDescriptor() {
        return this.f122275OooO0O0;
    }

    @Override // oO0oO00.AbstractC33951OooOo0, oO0o0ooO.InterfaceC33911OooO0OO
    public final void serialize(InterfaceC34004OooO0Oo encoder, Array array) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(encoder, "encoder");
        int iOooO0Oo = OooO0Oo(array);
        o0Oo0oo o0oo0oo2 = this.f122275OooO0O0;
        oO0oO000.OooO0O0 oooO0O0OooO = encoder.OooO(o0oo0oo2);
        OooOO0O(oooO0O0OooO, array, iOooO0Oo);
        oooO0O0OooO.OooO0O0(o0oo0oo2);
    }
}
