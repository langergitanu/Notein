package Oooo0;

import Oooo0.o000O0;
import Oooo0oO.C21060OoooO;
import Oooo0oO.InterfaceC21063OoooO0O;
import kotlin.jvm.internal.C24034Oooo00O;
import o00000.C24048OooO0oo;
import o00000.C24070Oooo0o0;
import o00000.C24073OoooO;
import o00000.InterfaceC24062OooOooO;
import oO0O000o.InterfaceC32507OooOO0o;

/* JADX INFO: renamed from: Oooo0.OooOoO, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C20826OooOoO extends kotlin.jvm.internal.OooOOOO implements InterfaceC32507OooOO0o<C21060OoooO, InterfaceC21063OoooO0O> {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final /* synthetic */ o000O0 f59824OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final /* synthetic */ C24070Oooo0o0 f59825OooOo0o;

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public final /* synthetic */ o00000.OooOOO f59826OooOoO;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public final /* synthetic */ o00000.Oooo0 f59827OooOoO0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C20826OooOoO(C24070Oooo0o0 c24070Oooo0o0, o000O0 o000o0, o00000.Oooo0 oooo0, o00000.OooOOO oooOOO) {
        super(1);
        this.f59825OooOo0o = c24070Oooo0o0;
        this.f59824OooOo = o000o0;
        this.f59827OooOoO0 = oooo0;
        this.f59826OooOoO = oooOOO;
    }

    /* JADX WARN: Type inference failed for: r1v2, types: [T, java.lang.Object, o00000.OoooO] */
    @Override // oO0O000o.InterfaceC32507OooOO0o
    public final InterfaceC21063OoooO0O invoke(C21060OoooO c21060OoooO) {
        C21060OoooO DisposableEffect = c21060OoooO;
        kotlin.jvm.internal.OooOOO0.OooO0oO(DisposableEffect, "$this$DisposableEffect");
        C24070Oooo0o0 c24070Oooo0o0 = this.f59825OooOo0o;
        if (c24070Oooo0o0 != null) {
            o000O0 o000o0 = this.f59824OooOo;
            if (o000o0.OooO0O0()) {
                o00000.Oooo0 oooo0 = this.f59827OooOoO0;
                C24048OooO0oo editProcessor = o000o0.f60103OooO0OO;
                kotlin.jvm.internal.OooOOO0.OooO0oO(editProcessor, "editProcessor");
                o00000.OooOOO oooOOO = this.f59826OooOoO;
                o000O0.OooO0O0 onValueChange = o000o0.f60116OooOOo;
                kotlin.jvm.internal.OooOOO0.OooO0oO(onValueChange, "onValueChange");
                o000O0.OooO00o onImeActionPerformed = o000o0.f60118OooOOoo;
                kotlin.jvm.internal.OooOOO0.OooO0oO(onImeActionPerformed, "onImeActionPerformed");
                C24034Oooo00O c24034Oooo00O = new C24034Oooo00O();
                C20876o0000oO c20876o0000oO = new C20876o0000oO(editProcessor, onValueChange, c24034Oooo00O);
                InterfaceC24062OooOooO interfaceC24062OooOooO = c24070Oooo0o0.f81114OooO00o;
                interfaceC24062OooOooO.OooO0Oo(oooo0, oooOOO, c20876o0000oO, onImeActionPerformed);
                ?? c24073OoooO = new C24073OoooO(c24070Oooo0o0, interfaceC24062OooOooO);
                c24070Oooo0o0.f81115OooO0O0.set((C24073OoooO) c24073OoooO);
                c24034Oooo00O.f80942OooOo0o = c24073OoooO;
                o000o0.f60104OooO0Oo = c24073OoooO;
            }
        }
        return new C20827OooOoO0();
    }
}
