package oO0oO00;

import androidx.appcompat.widget.C21532OooOOo;
import o0o0O0oO.C30312OooO00o;
import oO00ooO.C32449OooOOoo;
import oO0o.C33532OooO0oO;
import oO0o.InterfaceC33531OooO0o0;
import oO0o0ooO.C33917OooOO0;
import oO0o0ooO.InterfaceC33911OooO0OO;
import oO0oO000.InterfaceC34004OooO0Oo;

/* JADX INFO: renamed from: oO0oO00.o00000Oo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C33991o00000Oo<A, B, C> implements InterfaceC33911OooO0OO<C32449OooOOoo<? extends A, ? extends B, ? extends C>> {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final InterfaceC33911OooO0OO<A> f122232OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final InterfaceC33911OooO0OO<B> f122233OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final InterfaceC33911OooO0OO<C> f122234OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final C33532OooO0oO f122235OooO0Oo = oO0o.OooOO0O.OooO0O0("kotlin.Triple", new InterfaceC33531OooO0o0[0], new C30312OooO00o(this, 1));

    public C33991o00000Oo(InterfaceC33911OooO0OO<A> interfaceC33911OooO0OO, InterfaceC33911OooO0OO<B> interfaceC33911OooO0OO2, InterfaceC33911OooO0OO<C> interfaceC33911OooO0OO3) {
        this.f122232OooO00o = interfaceC33911OooO0OO;
        this.f122233OooO0O0 = interfaceC33911OooO0OO2;
        this.f122234OooO0OO = interfaceC33911OooO0OO3;
    }

    @Override // oO0o0ooO.InterfaceC33910OooO0O0
    public final Object deserialize(oO0oO000.OooO0OO oooO0OO) {
        C33532OooO0oO c33532OooO0oO = this.f122235OooO0Oo;
        oO0oO000.OooO00o OooO00o2 = oooO0OO.OooO00o(c33532OooO0oO);
        Object obj = C33992o00000o0.f122236OooO00o;
        Object objOooOOO0 = obj;
        Object objOooOOO02 = objOooOOO0;
        Object objOooOOO03 = objOooOOO02;
        while (true) {
            int iOooOo0o = OooO00o2.OooOo0o(c33532OooO0oO);
            if (iOooOo0o == -1) {
                OooO00o2.OooO0O0(c33532OooO0oO);
                if (objOooOOO0 == obj) {
                    throw new C33917OooOO0("Element 'first' is missing");
                }
                if (objOooOOO02 == obj) {
                    throw new C33917OooOO0("Element 'second' is missing");
                }
                if (objOooOOO03 != obj) {
                    return new C32449OooOOoo(objOooOOO0, objOooOOO02, objOooOOO03);
                }
                throw new C33917OooOO0("Element 'third' is missing");
            }
            if (iOooOo0o == 0) {
                objOooOOO0 = OooO00o2.OooOOO0(c33532OooO0oO, 0, this.f122232OooO00o, null);
            } else if (iOooOo0o == 1) {
                objOooOOO02 = OooO00o2.OooOOO0(c33532OooO0oO, 1, this.f122233OooO0O0, null);
            } else {
                if (iOooOo0o != 2) {
                    throw new C33917OooOO0(C21532OooOOo.OooO0OO(iOooOo0o, "Unexpected index "));
                }
                objOooOOO03 = OooO00o2.OooOOO0(c33532OooO0oO, 2, this.f122234OooO0OO, null);
            }
        }
    }

    @Override // oO0o0ooO.InterfaceC33911OooO0OO, oO0o0ooO.InterfaceC33910OooO0O0
    public final InterfaceC33531OooO0o0 getDescriptor() {
        return this.f122235OooO0Oo;
    }

    @Override // oO0o0ooO.InterfaceC33911OooO0OO
    public final void serialize(InterfaceC34004OooO0Oo encoder, Object obj) {
        C32449OooOOoo value = (C32449OooOOoo) obj;
        kotlin.jvm.internal.OooOOO0.OooO0oO(encoder, "encoder");
        kotlin.jvm.internal.OooOOO0.OooO0oO(value, "value");
        C33532OooO0oO c33532OooO0oO = this.f122235OooO0Oo;
        oO0oO000.OooO0O0 oooO0O0OooO00o = encoder.OooO00o(c33532OooO0oO);
        oooO0O0OooO00o.OooOoo0(c33532OooO0oO, 0, this.f122232OooO00o, value.f116648OooOo0o);
        oooO0O0OooO00o.OooOoo0(c33532OooO0oO, 1, this.f122233OooO0O0, value.f116647OooOo);
        oooO0O0OooO00o.OooOoo0(c33532OooO0oO, 2, this.f122234OooO0OO, value.f116649OooOoO0);
        oooO0O0OooO00o.OooO0O0(c33532OooO0oO);
    }
}
