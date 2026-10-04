package o0OoO0oo;

import com.aspose.slides.internal.p332p7.C22238OooO0oO;
import com.orion.notein.p607ui.noteeditor.NoteEditorFragment;
import kotlin.coroutines.Continuation;
import oO00ooO.C32446OooOOOo;
import oO00ooO.C32460OooOooO;
import oO00ooo.AbstractC32476OooO;
import oO00ooo.InterfaceC32482OooO0o0;
import oO00ooo0.EnumC32485OooO00o;
import oO0O000o.InterfaceC32508OooOOOo;
import oO0o0OO.C33609OooO0oo;
import oO0o0OO.InterfaceC33636Oooo00o;
import oOO00oo.C34406OooO00o;

/* JADX INFO: renamed from: o0OoO0oo.o00O0oo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
@InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.noteeditor.NoteEditorFragment$hookZoomHandle$1$1", m80623f = "NoteEditorFragment.kt", m80624l = {}, m80625m = "invokeSuspend")
public final class C28850o00O0oo extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super C32460OooOooO>, Object> {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final /* synthetic */ float f102175OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final /* synthetic */ float f102176OooOo0o;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public final /* synthetic */ NoteEditorFragment f102177OooOoO0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C28850o00O0oo(float f, float f2, NoteEditorFragment noteEditorFragment, Continuation<? super C28850o00O0oo> continuation) {
        super(2, continuation);
        this.f102176OooOo0o = f;
        this.f102175OooOo = f2;
        this.f102177OooOoO0 = noteEditorFragment;
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
        return new C28850o00O0oo(this.f102176OooOo0o, this.f102175OooOo, this.f102177OooOoO0, continuation);
    }

    @Override // oO0O000o.InterfaceC32508OooOOOo
    public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super C32460OooOooO> continuation) {
        return ((C28850o00O0oo) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Object invokeSuspend(Object obj) {
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        C32446OooOOOo.OooO0O0(obj);
        C34406OooO00o.C20358OooO00o c20358OooO00o = C34406OooO00o.f123390OooO00o;
        StringBuilder sbOooO0O0 = C22238OooO0oO.OooO0O0(c20358OooO00o, "NoteEditorFragment", "Listener -> h=");
        float f = this.f102176OooOo0o;
        sbOooO0O0.append(f);
        sbOooO0O0.append(" v=");
        float f2 = this.f102175OooOo;
        sbOooO0O0.append(f2);
        c20358OooO00o.OooO00o(sbOooO0O0.toString(), new Object[0]);
        C28968o00oo00O c28968o00oo00O = (C28968o00oo00O) this.f102177OooOoO0.f73035o000000.getValue();
        C33609OooO0oo.OooO0OO(androidx.lifecycle.o0OoOo0.OooO00o(c28968o00oo00O), null, null, new C28966o00oOooo(c28968o00oo00O, f, f2, null), 3);
        return C32460OooOooO.f116667OooO00o;
    }
}
