package o0Ooooo;

import com.orion.notein.p607ui.noteeditor.propertypanel.preview.PagePreviewVO;
import kotlin.coroutines.Continuation;
import o0OOo0o.C27449o00O0OoO;
import o0OOo0o.o00OO;
import oO00ooO.C32446OooOOOo;
import oO00ooO.C32460OooOooO;
import oO00ooo.AbstractC32476OooO;
import oO00ooo.InterfaceC32482OooO0o0;
import oO00ooo0.EnumC32485OooO00o;
import oO0O000o.InterfaceC32508OooOOOo;
import oO0o0OO.C33609OooO0oo;
import oO0o0OO.C33649OoooOOo;
import oO0o0OO.InterfaceC33636Oooo00o;
import oO0o0Oo.C33781o00o0O;
import oO0o0o0o.C33874OooO0OO;
import oO0o0o0o.ExecutorC33873OooO0O0;

/* JADX INFO: renamed from: o0Ooooo.OooOOo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
@InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.noteeditor.propertypanel.preview.EditorPreviewViewModel$movePage$2", m80623f = "EditorPreviewViewModel.kt", m80624l = {411}, m80625m = "invokeSuspend")
public final class C29678OooOOo extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super C32460OooOooO>, Object> {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final /* synthetic */ PagePreviewVO f105216OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public int f105217OooOo0o;

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public final /* synthetic */ int f105218OooOoO;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public final /* synthetic */ com.orion.notein.p607ui.noteeditor.propertypanel.preview.OooO0OO f105219OooOoO0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C29678OooOOo(PagePreviewVO pagePreviewVO, com.orion.notein.p607ui.noteeditor.propertypanel.preview.OooO0OO oooO0OO, int i, Continuation<? super C29678OooOOo> continuation) {
        super(2, continuation);
        this.f105216OooOo = pagePreviewVO;
        this.f105219OooOoO0 = oooO0OO;
        this.f105218OooOoO = i;
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
        return new C29678OooOOo(this.f105216OooOo, this.f105219OooOoO0, this.f105218OooOoO, continuation);
    }

    @Override // oO0O000o.InterfaceC32508OooOOOo
    public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super C32460OooOooO> continuation) {
        return ((C29678OooOOo) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Object invokeSuspend(Object obj) {
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i = this.f105217OooOo0o;
        if (i == 0) {
            C32446OooOOOo.OooO0O0(obj);
            PagePreviewVO pagePreviewVO = this.f105216OooOo;
            String noteId = pagePreviewVO.getNoteId();
            com.orion.notein.p607ui.noteeditor.propertypanel.preview.OooO0OO oooO0OO = this.f105219OooOoO0;
            C33781o00o0O c33781o00o0O = oooO0OO.f76073OooOO0o;
            if (!kotlin.jvm.internal.OooOOO0.OooO0O0(noteId, c33781o00o0O.getValue())) {
                return C32460OooOooO.f116667OooO00o;
            }
            String id = pagePreviewVO.getId();
            String str = (String) c33781o00o0O.getValue();
            this.f105217OooOo0o = 1;
            C27449o00O0OoO c27449o00O0OoO = oooO0OO.f76066OooO0Oo;
            c27449o00O0OoO.getClass();
            C33874OooO0OO c33874OooO0OO = C33649OoooOOo.f121328OooO00o;
            if (C33609OooO0oo.OooO0o(ExecutorC33873OooO0O0.f122045OooOoO0, new o00OO(c27449o00O0OoO, str, id, this.f105218OooOoO, null), this) == enumC32485OooO00o) {
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
