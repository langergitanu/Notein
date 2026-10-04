package o0000oOO;

import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.jvm.internal.OooOOO0;
import oO00ooO.C32446OooOOOo;
import oO0o0OO.C33614OooOOO0;
import ooooOOo0.C35238OooOoO;
import ooooOOo0.InterfaceC35211OooO0O0;
import ooooOOo0.InterfaceC35213OooO0Oo;

/* JADX INFO: renamed from: o0000oOO.OooO00o, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C24333OooO00o implements InterfaceC35213OooO0Oo {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final Object f81914OooO00o;

    public C24333OooO00o(boolean z) {
        this.f81914OooO00o = new AtomicBoolean(z);
    }

    @Override // ooooOOo0.InterfaceC35213OooO0Oo
    public void OooO00o(InterfaceC35211OooO0O0 call, Throwable th) {
        OooOOO0.OooO0oo(call, "call");
        ((C33614OooOOO0) this.f81914OooO00o).resumeWith(C32446OooOOOo.OooO00o(th));
    }

    @Override // ooooOOo0.InterfaceC35213OooO0Oo
    public void OooO0O0(InterfaceC35211OooO0O0 call, C35238OooOoO c35238OooOoO) {
        OooOOO0.OooO0oo(call, "call");
        ((C33614OooOOO0) this.f81914OooO00o).resumeWith(c35238OooOoO);
    }

    public C24333OooO00o(C33614OooOOO0 c33614OooOOO0) {
        this.f81914OooO00o = c33614OooOOO0;
    }
}
