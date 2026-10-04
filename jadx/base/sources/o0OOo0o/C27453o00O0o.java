package o0OOo0o;

import com.aspose.words.StyleIdentifier;
import com.orion.notein.domain.models.page.Page;
import java.io.Serializable;
import java.util.List;
import kotlin.coroutines.Continuation;
import o0OOO0OO.C27020OooOoO0;
import oO00ooO.C32446OooOOOo;
import oO00ooO.C32460OooOooO;
import oO00ooo.AbstractC32476OooO;
import oO00ooo.InterfaceC32482OooO0o0;
import oO00ooo0.EnumC32485OooO00o;
import oO0O000o.InterfaceC32508OooOOOo;
import oO0o0OO.InterfaceC33636Oooo00o;

/* JADX INFO: renamed from: o0OOo0o.o00O0o, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
@InterfaceC32482OooO0o0(m80622c = "com.orion.notein.domain.usecase.NoteUseCase$getPagesByNoteIdSync$2", m80623f = "NoteUseCase.kt", m80624l = {StyleIdentifier.TABLE_GRID_LIGHT}, m80625m = "invokeSuspend")
public final class C27453o00O0o extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super List<? extends Page>>, Object> {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final /* synthetic */ C27449o00O0OoO f96088OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public int f96089OooOo0o;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public final /* synthetic */ String f96090OooOoO0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C27453o00O0o(C27449o00O0OoO c27449o00O0OoO, String str, Continuation<? super C27453o00O0o> continuation) {
        super(2, continuation);
        this.f96088OooOo = c27449o00O0OoO;
        this.f96090OooOoO0 = str;
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
        return new C27453o00O0o(this.f96088OooOo, this.f96090OooOoO0, continuation);
    }

    @Override // oO0O000o.InterfaceC32508OooOOOo
    public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super List<? extends Page>> continuation) {
        return ((C27453o00O0o) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Object invokeSuspend(Object obj) {
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i = this.f96089OooOo0o;
        if (i != 0) {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C32446OooOOOo.OooO0O0(obj);
            return obj;
        }
        C32446OooOOOo.OooO0O0(obj);
        C27020OooOoO0 c27020OooOoO0 = this.f96088OooOo.f96039OooO0o;
        this.f96089OooOo0o = 1;
        Serializable serializableOooO0oO = c27020OooOoO0.OooO0oO(this.f96090OooOoO0, this);
        return serializableOooO0oO == enumC32485OooO00o ? enumC32485OooO00o : serializableOooO0oO;
    }
}
