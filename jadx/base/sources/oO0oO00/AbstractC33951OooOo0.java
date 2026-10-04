package oO0oO00;

import java.util.Iterator;
import oO0o.InterfaceC33531OooO0o0;
import oO0o0ooO.InterfaceC33911OooO0OO;
import oO0oO000.InterfaceC34004OooO0Oo;

/* JADX INFO: renamed from: oO0oO00.OooOo0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public abstract class AbstractC33951OooOo0<Element, Collection, Builder> extends AbstractC33933OooO00o<Element, Collection, Builder> {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final InterfaceC33911OooO0OO<Element> f122160OooO00o;

    public AbstractC33951OooOo0(InterfaceC33911OooO0OO interfaceC33911OooO0OO) {
        this.f122160OooO00o = interfaceC33911OooO0OO;
    }

    public abstract void OooO(int i, Object obj, Object obj2);

    @Override // oO0oO00.AbstractC33933OooO00o
    public void OooO0o(oO0oO000.OooO00o oooO00o, int i, Object obj) {
        OooO(i, obj, oooO00o.OooOOO0(getDescriptor(), i, this.f122160OooO00o, null));
    }

    @Override // oO0o0ooO.InterfaceC33911OooO0OO
    public void serialize(InterfaceC34004OooO0Oo encoder, Collection collection) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(encoder, "encoder");
        int iOooO0Oo = OooO0Oo(collection);
        InterfaceC33531OooO0o0 descriptor = getDescriptor();
        oO0oO000.OooO0O0 oooO0O0OooO = encoder.OooO(descriptor);
        Iterator<Element> itOooO0OO = OooO0OO(collection);
        for (int i = 0; i < iOooO0Oo; i++) {
            oooO0O0OooO.OooOoo0(getDescriptor(), i, this.f122160OooO00o, itOooO0OO.next());
        }
        oooO0O0OooO.OooO0O0(descriptor);
    }
}
