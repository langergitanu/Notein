package o0O0oooo;

import android.graphics.Rect;
import android.graphics.RectF;
import com.orion.notein.domain.models.page.Page;
import kotlin.coroutines.Continuation;
import o0OOO0OO.C27009OooO0oO;
import o0OOO0OO.C27015OooOOoo;
import o0OOo0o.C27449o00O0OoO;
import oO00ooO.C32446OooOOOo;
import oO00ooO.C32460OooOooO;
import oO00ooo.AbstractC32476OooO;
import oO00ooo.InterfaceC32482OooO0o0;
import oO00ooo0.EnumC32485OooO00o;
import oO0O000o.InterfaceC32508OooOOOo;
import oO0o0OO.InterfaceC33636Oooo00o;

/* JADX INFO: renamed from: o0O0oooo.Oooo0oO, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
@InterfaceC32482OooO0o0(m80622c = "com.orion.notein.adapter.NoteInCore$getDisplayItemsBoundingBox$1", m80623f = "NoteInCore.kt", m80624l = {3267}, m80625m = "invokeSuspend")
public final class C26402Oooo0oO extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super RectF>, Object> {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final /* synthetic */ C26395Oooo0o0 f90606OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public int f90607OooOo0o;

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public final /* synthetic */ Rect f90608OooOoO;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public final /* synthetic */ Page f90609OooOoO0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C26402Oooo0oO(C26395Oooo0o0 c26395Oooo0o0, Page page, Rect rect, Continuation<? super C26402Oooo0oO> continuation) {
        super(2, continuation);
        this.f90606OooOo = c26395Oooo0o0;
        this.f90609OooOoO0 = page;
        this.f90608OooOoO = rect;
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
        return new C26402Oooo0oO(this.f90606OooOo, this.f90609OooOoO0, this.f90608OooOoO, continuation);
    }

    @Override // oO0O000o.InterfaceC32508OooOOOo
    public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super RectF> continuation) {
        return ((C26402Oooo0oO) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Object invokeSuspend(Object obj) {
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i = this.f90607OooOo0o;
        if (i == 0) {
            C32446OooOOOo.OooO0O0(obj);
            C27449o00O0OoO c27449o00O0OoO = this.f90606OooOo.f90553OooO0O0;
            Page page = this.f90609OooOoO0;
            String id = page.getId();
            String noteId = page.getNoteId();
            this.f90607OooOo0o = 1;
            C27015OooOOoo c27015OooOOoo = c27449o00O0OoO.f96039OooO0o.f94064OooO00o;
            c27015OooOOoo.getClass();
            obj = c27015OooOOoo.f94033OooO00o.OooO0oO(noteId, new o0OOO0OO.OooOOO(new C27009OooO0oO(id, null), null));
            if (obj == enumC32485OooO00o) {
                return enumC32485OooO00o;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C32446OooOOOo.OooO0O0(obj);
        }
        RectF rectF = (RectF) obj;
        Rect rect = this.f90608OooOoO;
        rectF.offset(rect.left * 1.0f, rect.top * 1.0f);
        return rectF;
    }
}
