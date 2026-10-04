package o0Ooo0oo;

import com.orion.notein.domain.models.note.PenInfo;
import kotlin.coroutines.Continuation;
import o000oooo.C24761OooO;
import o0o00Ooo.C29920OooO0oo;
import oO00ooO.C32446OooOOOo;
import oO00ooO.C32460OooOooO;
import oO00ooo.AbstractC32476OooO;
import oO00ooo.InterfaceC32482OooO0o0;
import oO00ooo0.EnumC32485OooO00o;
import oO0O000o.InterfaceC32508OooOOOo;
import oO0o0OO.InterfaceC33636Oooo00o;

/* JADX INFO: renamed from: o0Ooo0oo.o000O0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
@InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.noteeditor.penbar.PenBarViewModel$updatePenColorListByColorSet$1", m80623f = "PenBarViewModel.kt", m80624l = {1049}, m80625m = "invokeSuspend")
public final class C29535o000O0 extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super C32460OooOooO>, Object> {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final /* synthetic */ com.orion.notein.p607ui.noteeditor.penbar.OooO0O0 f104769OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public int f104770OooOo0o;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public final /* synthetic */ C29920OooO0oo f104771OooOoO0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C29535o000O0(com.orion.notein.p607ui.noteeditor.penbar.OooO0O0 oooO0O0, C29920OooO0oo c29920OooO0oo, Continuation<? super C29535o000O0> continuation) {
        super(2, continuation);
        this.f104769OooOo = oooO0O0;
        this.f104771OooOoO0 = c29920OooO0oo;
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
        return new C29535o000O0(this.f104769OooOo, this.f104771OooOoO0, continuation);
    }

    @Override // oO0O000o.InterfaceC32508OooOOOo
    public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super C32460OooOooO> continuation) {
        return ((C29535o000O0) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // oO00ooo.AbstractC32477OooO00o
    public final Object invokeSuspend(Object obj) {
        PenInfo penInfoCopy$default;
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i = this.f104770OooOo0o;
        if (i == 0) {
            C32446OooOOOo.OooO0O0(obj);
            com.orion.notein.p607ui.noteeditor.penbar.OooO0O0 oooO0O0 = this.f104769OooOo;
            PenInfo penInfo = (PenInfo) oooO0O0.f75183OoooOO0.f121747OooOo0o.getValue();
            if (penInfo == null) {
                return C32460OooOooO.f116667OooO00o;
            }
            String noteId = penInfo.getNoteId();
            C29920OooO0oo c29920OooO0oo = this.f104771OooOoO0;
            if (noteId == null) {
                penInfoCopy$default = PenInfo.copy$default(penInfo, C24761OooO.OooO00o("toString(...)"), 0, 0, 0, c29920OooO0oo.f106160OooO0OO, null, (String) oooO0O0.f75162OooOoO0.f121747OooOo0o.getValue(), false, null, 430, null);
            } else {
                penInfoCopy$default = PenInfo.copy$default(penInfo, null, 0, 0, 0, c29920OooO0oo.f106160OooO0OO, null, null, false, null, 495, null);
            }
            this.f104770OooOo0o = 1;
            if (oooO0O0.f75143OooO0o0.OooO0O0(new PenInfo[]{penInfoCopy$default}, this) == enumC32485OooO00o) {
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
