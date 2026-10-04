package o0ooOO0;

import Oooo0oO.C21060OoooO;
import oO0O000o.InterfaceC32507OooOO0o;
import oO0O0OO.InterfaceC32615OooOoo;

/* JADX INFO: renamed from: o0ooOO0.Oooo0oo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C31536Oooo0oo extends kotlin.jvm.internal.OooOOOO implements InterfaceC32507OooOO0o {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final /* synthetic */ Object f112732OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final /* synthetic */ int f112733OooOo0o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C31536Oooo0oo(Object obj, int i) {
        super(1);
        this.f112733OooOo0o = i;
        this.f112732OooOo = obj;
    }

    @Override // oO0O000o.InterfaceC32507OooOO0o
    public final Object invoke(Object obj) {
        switch (this.f112733OooOo0o) {
            case 0:
                C21060OoooO DisposableEffect = (C21060OoooO) obj;
                kotlin.jvm.internal.OooOOO0.OooO0oO(DisposableEffect, "$this$DisposableEffect");
                return new C31535Oooo0oO((o0OoOo0) this.f112732OooOo);
            default:
                InterfaceC32615OooOoo module = (InterfaceC32615OooOoo) obj;
                kotlin.jvm.internal.OooOOO0.OooO0oO(module, "module");
                return module.OooOO0O().OooO0oo(((oO0O0O0o.OooOO0) this.f112732OooOo).OooOo00());
        }
    }
}
