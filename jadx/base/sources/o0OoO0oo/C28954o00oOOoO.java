package o0OoO0oo;

import android.graphics.RectF;
import com.orion.notein.domain.models.note.NoteContent;
import com.orion.notein.p607ui.noteeditor.C23344OooOOo;
import kotlin.coroutines.Continuation;
import o0OOo0o.C27449o00O0OoO;
import o0OOo0o.C27478o00Oo00o;
import oO00ooO.C32446OooOOOo;
import oO00ooO.C32460OooOooO;
import oO00ooo.AbstractC32476OooO;
import oO00ooo.InterfaceC32482OooO0o0;
import oO00ooo0.EnumC32485OooO00o;
import oO0O000o.InterfaceC32508OooOOOo;
import oO0o0OO.C33609OooO0oo;
import oO0o0OO.C33649OoooOOo;
import oO0o0OO.InterfaceC33636Oooo00o;
import oO0o0o0o.C33874OooO0OO;
import oO0o0o0o.ExecutorC33873OooO0O0;

/* JADX INFO: renamed from: o0OoO0oo.o00oOOoO, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
@InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.noteeditor.NoteEditorViewModel$updateDualLinkRef$1", m80623f = "NoteEditorViewModel.kt", m80624l = {773}, m80625m = "invokeSuspend")
public final class C28954o00oOOoO extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super C32460OooOooO>, Object> {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final /* synthetic */ C23344OooOOo f102588OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public int f102589OooOo0o;

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public final /* synthetic */ String f102590OooOoO;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public final /* synthetic */ int f102591OooOoO0;

    /* JADX INFO: renamed from: OooOoOO, reason: collision with root package name */
    public final /* synthetic */ RectF f102592OooOoOO;

    /* JADX INFO: renamed from: OooOoo, reason: collision with root package name */
    public final /* synthetic */ String f102593OooOoo;

    /* JADX INFO: renamed from: OooOoo0, reason: collision with root package name */
    public final /* synthetic */ float f102594OooOoo0;

    /* JADX INFO: renamed from: OooOooO, reason: collision with root package name */
    public final /* synthetic */ boolean f102595OooOooO;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C28954o00oOOoO(C23344OooOOo c23344OooOOo, int i, String str, RectF rectF, float f, String str2, boolean z, Continuation<? super C28954o00oOOoO> continuation) {
        super(2, continuation);
        this.f102588OooOo = c23344OooOOo;
        this.f102591OooOoO0 = i;
        this.f102590OooOoO = str;
        this.f102592OooOoOO = rectF;
        this.f102594OooOoo0 = f;
        this.f102593OooOoo = str2;
        this.f102595OooOooO = z;
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
        return new C28954o00oOOoO(this.f102588OooOo, this.f102591OooOoO0, this.f102590OooOoO, this.f102592OooOoOO, this.f102594OooOoo0, this.f102593OooOoo, this.f102595OooOooO, continuation);
    }

    @Override // oO0O000o.InterfaceC32508OooOOOo
    public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super C32460OooOooO> continuation) {
        return ((C28954o00oOOoO) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // oO00ooo.AbstractC32477OooO00o
    public final Object invokeSuspend(Object obj) {
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i = this.f102589OooOo0o;
        if (i == 0) {
            C32446OooOOOo.OooO0O0(obj);
            C23344OooOOo c23344OooOOo = this.f102588OooOo;
            String id = ((NoteContent) c23344OooOOo.f73592OoooOoo.f121747OooOo0o.getValue()).getPages().get(this.f102591OooOoO0).getId();
            String str = (String) c23344OooOOo.f73589OoooOOo.getValue();
            this.f102589OooOo0o = 1;
            C27449o00O0OoO c27449o00O0OoO = c23344OooOOo.f73545OooO0Oo;
            c27449o00O0OoO.getClass();
            C33874OooO0OO c33874OooO0OO = C33649OoooOOo.f121328OooO00o;
            if (C33609OooO0oo.OooO0o(ExecutorC33873OooO0O0.f122045OooOoO0, new C27478o00Oo00o(c27449o00O0OoO, this.f102590OooOoO, str, id, this.f102592OooOoOO, this.f102593OooOoo, this.f102594OooOoo0, this.f102595OooOooO, null), this) == enumC32485OooO00o) {
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
