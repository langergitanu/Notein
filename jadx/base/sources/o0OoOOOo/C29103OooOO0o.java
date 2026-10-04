package o0OoOOOo;

import android.content.Context;
import o0OoO0.C28510OooO0Oo;
import oO0o.AbstractC33525OooO0OO;
import oO0o.C33524OooO0O0;
import oO0o.C33532OooO0oO;
import oO0o.InterfaceC33531OooO0o0;
import oO0o0ooO.C33913OooO0o;
import oOoo0.InterfaceC34595OooO0Oo;

/* JADX INFO: renamed from: o0OoOOOo.OooOO0o, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class C29103OooOO0o implements oO0O000o.OooO00o {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final /* synthetic */ Object f103126OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final /* synthetic */ int f103127OooOo0o;

    public /* synthetic */ C29103OooOO0o(Object obj, int i) {
        this.f103127OooOo0o = i;
        this.f103126OooOo = obj;
    }

    @Override // oO0O000o.OooO00o
    public final Object invoke() {
        switch (this.f103127OooOo0o) {
            case 0:
                return new o0o00Ooo.OooOO0(false, false, (Context) this.f103126OooOo);
            default:
                C33913OooO0o c33913OooO0o = (C33913OooO0o) this.f103126OooOo;
                C33532OooO0oO c33532OooO0oOOooO0OO = oO0o.OooOO0O.OooO0OO("kotlinx.serialization.Polymorphic", AbstractC33525OooO0OO.OooO00o.f121103OooO00o, new InterfaceC33531OooO0o0[0], new C28510OooO0Oo(c33913OooO0o, 1));
                InterfaceC34595OooO0Oo<T> context = c33913OooO0o.f122124OooO00o;
                kotlin.jvm.internal.OooOOO0.OooO0oO(context, "context");
                return new C33524OooO0O0(c33532OooO0oOOooO0OO, context);
        }
    }
}
