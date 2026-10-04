package o0OoO0oo;

import com.orion.notein.p607ui.noteeditor.C23353OooOoO0;
import java.util.Map;
import kotlin.coroutines.Continuation;
import o0000oOO.C24334OooO0O0;
import oO00ooO.C32446OooOOOo;
import oO00ooO.C32460OooOooO;
import oO00ooo.AbstractC32476OooO;
import oO00ooo.InterfaceC32482OooO0o0;
import oO00ooo0.EnumC32485OooO00o;
import oO0O000o.InterfaceC32508OooOOOo;

/* JADX INFO: renamed from: o0OoO0oo.o000oo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
@InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.noteeditor.NoteEditorContainerViewModel$persistRulerStateCache$2", m80623f = "NoteEditorContainerViewModel.kt", m80624l = {}, m80625m = "invokeSuspend")
public final class C28820o000oo extends AbstractC32476OooO implements InterfaceC32508OooOOOo<C24334OooO0O0, Continuation<? super C32460OooOooO>, Object> {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final /* synthetic */ Map<String, C23353OooOoO0> f102028OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public /* synthetic */ Object f102029OooOo0o;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public final /* synthetic */ com.orion.notein.p607ui.noteeditor.OooO0OO f102030OooOoO0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C28820o000oo(Map<String, C23353OooOoO0> map, com.orion.notein.p607ui.noteeditor.OooO0OO oooO0OO, Continuation<? super C28820o000oo> continuation) {
        super(2, continuation);
        this.f102028OooOo = map;
        this.f102030OooOoO0 = oooO0OO;
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
        C28820o000oo c28820o000oo = new C28820o000oo(this.f102028OooOo, this.f102030OooOoO0, continuation);
        c28820o000oo.f102029OooOo0o = obj;
        return c28820o000oo;
    }

    @Override // oO0O000o.InterfaceC32508OooOOOo
    public final Object invoke(C24334OooO0O0 c24334OooO0O0, Continuation<? super C32460OooOooO> continuation) {
        return ((C28820o000oo) create(c24334OooO0O0, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Object invokeSuspend(Object obj) {
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        C32446OooOOOo.OooO0O0(obj);
        C24334OooO0O0 c24334OooO0O0 = (C24334OooO0O0) this.f102029OooOo0o;
        Map<String, C23353OooOoO0> map = this.f102028OooOo;
        boolean zIsEmpty = map.isEmpty();
        com.orion.notein.p607ui.noteeditor.OooO0OO oooO0OO = this.f102030OooOoO0;
        if (zIsEmpty) {
            c24334OooO0O0.OooO0o(oooO0OO.f73398Ooooo00);
        } else {
            c24334OooO0O0.OooO0oO(oooO0OO.f73398Ooooo00, oooO0OO.f73399Ooooo0o.OooO00o(oooO0OO.f73400OooooO0, map));
        }
        return C32460OooOooO.f116667OooO00o;
    }
}
