package o0OoO0oo;

import com.orion.notein.domain.models.page.Image;
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

/* JADX INFO: renamed from: o0OoO0oo.o00OoooO, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
@InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.noteeditor.NoteEditorViewModel$deleteImage$2", m80623f = "NoteEditorViewModel.kt", m80624l = {910}, m80625m = "invokeSuspend")
public final class C28903o00OoooO extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super C32460OooOooO>, Object> {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final /* synthetic */ C23344OooOOo f102408OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public int f102409OooOo0o;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public final /* synthetic */ Image f102410OooOoO0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C28903o00OoooO(C23344OooOOo c23344OooOOo, Image image, Continuation<? super C28903o00OoooO> continuation) {
        super(2, continuation);
        this.f102408OooOo = c23344OooOOo;
        this.f102410OooOoO0 = image;
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
        return new C28903o00OoooO(this.f102408OooOo, this.f102410OooOoO0, continuation);
    }

    @Override // oO0O000o.InterfaceC32508OooOOOo
    public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super C32460OooOooO> continuation) {
        return ((C28903o00OoooO) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Object invokeSuspend(Object obj) {
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i = this.f102409OooOo0o;
        if (i == 0) {
            C32446OooOOOo.OooO0O0(obj);
            C23344OooOOo c23344OooOOo = this.f102408OooOo;
            C27449o00O0OoO c27449o00O0OoO = c23344OooOOo.f73545OooO0Oo;
            String str = (String) c23344OooOOo.f73589OoooOOo.getValue();
            this.f102409OooOo0o = 1;
            if (c27449o00O0OoO.OooOO0o(this.f102410OooOoO0, str, this) == enumC32485OooO00o) {
                return enumC32485OooO00o;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C32446OooOOOo.OooO0O0(obj);
        }
        return C32460OooOooO.f116667OooO00o;
    }
}
