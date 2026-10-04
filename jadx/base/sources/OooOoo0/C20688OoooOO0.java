package OooOoo0;

import Oooo0oO.C21060OoooO;
import Oooo0oO.InterfaceC21063OoooO0O;
import oO0O000o.InterfaceC32507OooOO0o;
import oo000o.InterfaceC34654Oooo0OO;

/* JADX INFO: renamed from: OooOoo0.OoooOO0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C20688OoooOO0 extends kotlin.jvm.internal.OooOOOO implements InterfaceC32507OooOO0o<C21060OoooO, InterfaceC21063OoooO0O> {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final /* synthetic */ Oooo0oO.o00oO0O<Boolean> f59384OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final /* synthetic */ InterfaceC34654Oooo0OO f59385OooOo0o;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public final /* synthetic */ Oooo0oO.o00oO0O<InterfaceC34654Oooo0OO.OooO00o> f59386OooOoO0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C20688OoooOO0(InterfaceC34654Oooo0OO interfaceC34654Oooo0OO, Oooo0oO.o00oO0O<Boolean> o00oo0o, Oooo0oO.o00oO0O<InterfaceC34654Oooo0OO.OooO00o> o00oo0o2) {
        super(1);
        this.f59385OooOo0o = interfaceC34654Oooo0OO;
        this.f59384OooOo = o00oo0o;
        this.f59386OooOoO0 = o00oo0o2;
    }

    @Override // oO0O000o.InterfaceC32507OooOO0o
    public final InterfaceC21063OoooO0O invoke(C21060OoooO c21060OoooO) {
        C21060OoooO DisposableEffect = c21060OoooO;
        kotlin.jvm.internal.OooOOO0.OooO0oO(DisposableEffect, "$this$DisposableEffect");
        boolean zBooleanValue = this.f59384OooOo.getValue().booleanValue();
        Oooo0oO.o00oO0O<InterfaceC34654Oooo0OO.OooO00o> o00oo0o = this.f59386OooOoO0;
        if (zBooleanValue) {
            InterfaceC34654Oooo0OO interfaceC34654Oooo0OO = this.f59385OooOo0o;
            o00oo0o.setValue(interfaceC34654Oooo0OO != null ? interfaceC34654Oooo0OO.OooO00o() : null);
        }
        return new C20684OoooO(o00oo0o);
    }
}
