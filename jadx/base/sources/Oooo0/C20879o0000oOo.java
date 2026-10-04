package Oooo0;

import OooOooO.InterfaceC20736OooOOO0;
import Oooo0oO.C21060OoooO;
import android.content.Context;
import o0ooOO0.ComponentCallbacks2C31538OoooO0;
import oO0O000o.InterfaceC32507OooOO0o;

/* JADX INFO: renamed from: Oooo0.o0000oOo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C20879o0000oOo extends kotlin.jvm.internal.OooOOOO implements InterfaceC32507OooOO0o {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final /* synthetic */ Object f60069OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final /* synthetic */ int f60070OooOo0o;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public final /* synthetic */ Object f60071OooOoO0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C20879o0000oOo(int i, Object obj, Object obj2) {
        super(1);
        this.f60070OooOo0o = i;
        this.f60069OooOo = obj;
        this.f60071OooOoO0 = obj2;
    }

    @Override // oO0O000o.InterfaceC32507OooOO0o
    public final Object invoke(Object obj) {
        switch (this.f60070OooOo0o) {
            case 0:
                C21060OoooO DisposableEffect = (C21060OoooO) obj;
                kotlin.jvm.internal.OooOOO0.OooO0oO(DisposableEffect, "$this$DisposableEffect");
                return new C20878o0000oOO(0, (Oooo0oO.o00oO0O) this.f60069OooOo, (InterfaceC20736OooOOO0) this.f60071OooOoO0);
            default:
                C21060OoooO DisposableEffect2 = (C21060OoooO) obj;
                kotlin.jvm.internal.OooOOO0.OooO0oO(DisposableEffect2, "$this$DisposableEffect");
                Context context = (Context) this.f60069OooOo;
                Context applicationContext = context.getApplicationContext();
                ComponentCallbacks2C31538OoooO0 componentCallbacks2C31538OoooO0 = (ComponentCallbacks2C31538OoooO0) this.f60071OooOoO0;
                applicationContext.registerComponentCallbacks(componentCallbacks2C31538OoooO0);
                return new C20878o0000oOO(1, context, componentCallbacks2C31538OoooO0);
        }
    }
}
