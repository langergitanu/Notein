package o0OoO0oo;

import com.orion.notein.domain.models.page.DualLinkRef;
import com.orion.notein.p607ui.noteeditor.C23344OooOOo;
import kotlin.coroutines.Continuation;
import o0OOo0o.C27449o00O0OoO;
import oO00ooO.C32446OooOOOo;
import oO00ooO.C32460OooOooO;
import oO00ooo.AbstractC32476OooO;
import oO00ooo.InterfaceC32482OooO0o0;
import oO00ooo0.EnumC32485OooO00o;
import oO0O000o.InterfaceC32508OooOOOo;
import oO0o0OO.InterfaceC33636Oooo00o;

/* JADX INFO: renamed from: o0OoO0oo.o00o000O, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
@InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.noteeditor.NoteEditorViewModel$getDualLinkRefBySourceId$2", m80623f = "NoteEditorViewModel.kt", m80624l = {791}, m80625m = "invokeSuspend")
public final class C28910o00o000O extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super DualLinkRef>, Object> {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final /* synthetic */ C23344OooOOo f102428OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public int f102429OooOo0o;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public final /* synthetic */ String f102430OooOoO0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C28910o00o000O(C23344OooOOo c23344OooOOo, String str, Continuation<? super C28910o00o000O> continuation) {
        super(2, continuation);
        this.f102428OooOo = c23344OooOOo;
        this.f102430OooOoO0 = str;
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
        return new C28910o00o000O(this.f102428OooOo, this.f102430OooOoO0, continuation);
    }

    @Override // oO0O000o.InterfaceC32508OooOOOo
    public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super DualLinkRef> continuation) {
        return ((C28910o00o000O) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Object invokeSuspend(Object obj) {
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i = this.f102429OooOo0o;
        if (i != 0) {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C32446OooOOOo.OooO0O0(obj);
            return obj;
        }
        C32446OooOOOo.OooO0O0(obj);
        C23344OooOOo c23344OooOOo = this.f102428OooOo;
        C27449o00O0OoO c27449o00O0OoO = c23344OooOOo.f73545OooO0Oo;
        String str = (String) c23344OooOOo.f73589OoooOOo.getValue();
        this.f102429OooOo0o = 1;
        Object objOooOOoo = c27449o00O0OoO.OooOOoo(this.f102430OooOoO0, str, this);
        return objOooOOoo == enumC32485OooO00o ? enumC32485OooO00o : objOooOOoo;
    }
}
