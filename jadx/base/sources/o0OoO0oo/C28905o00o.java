package o0OoO0oo;

import android.graphics.PointF;
import com.orion.notein.domain.models.note.NoteContent;
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

/* JADX INFO: renamed from: o0OoO0oo.o00o, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
@InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.noteeditor.NoteEditorViewModel$setNoteOffset$1", m80623f = "NoteEditorViewModel.kt", m80624l = {458, 460}, m80625m = "invokeSuspend")
public final class C28905o00o extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super C32460OooOooO>, Object> {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final /* synthetic */ C23344OooOOo f102416OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public int f102417OooOo0o;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public final /* synthetic */ PointF f102418OooOoO0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C28905o00o(C23344OooOOo c23344OooOOo, PointF pointF, Continuation<? super C28905o00o> continuation) {
        super(2, continuation);
        this.f102416OooOo = c23344OooOOo;
        this.f102418OooOoO0 = pointF;
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
        return new C28905o00o(this.f102416OooOo, this.f102418OooOoO0, continuation);
    }

    @Override // oO0O000o.InterfaceC32508OooOOOo
    public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super C32460OooOooO> continuation) {
        return ((C28905o00o) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x0060, code lost:
    
        if (r8 == r0) goto L23;
     */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // oO00ooo.AbstractC32477OooO00o
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i = this.f102417OooOo0o;
        PointF pointF = this.f102418OooOoO0;
        C23344OooOOo c23344OooOOo = this.f102416OooOo;
        C27449o00O0OoO c27449o00O0OoO = c23344OooOOo.f73545OooO0Oo;
        if (i == 0) {
            C32446OooOOOo.OooO0O0(obj);
            C28694OooOO0O c28694OooOO0O = (C28694OooOO0O) c23344OooOOo.f73606o00o0O.f121747OooOo0o.getValue();
            if (c28694OooOO0O != null) {
                c28694OooOO0O.f101675OooOO0 = pointF;
            }
            String str = (String) c23344OooOOo.f73588OoooOOO.getValue();
            this.f102417OooOo0o = 1;
            obj = c27449o00O0OoO.OooOoO0(str, this);
            if (obj != enumC32485OooO00o) {
            }
            return enumC32485OooO00o;
        }
        if (i != 1) {
            if (i != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C32446OooOOOo.OooO0O0(obj);
            return C32460OooOooO.f116667OooO00o;
        }
        C32446OooOOOo.OooO0O0(obj);
        NoteContent noteContent = (NoteContent) obj;
        if (noteContent != null) {
            this.f102417OooOo0o = 2;
            c27449o00O0OoO.getClass();
            Object objOooO0OO = c27449o00O0OoO.f96035OooO00o.OooO0OO(noteContent.getId(), pointF.x, pointF.y, this);
            if (objOooO0OO != enumC32485OooO00o) {
                objOooO0OO = C32460OooOooO.f116667OooO00o;
            }
        }
        return C32460OooOooO.f116667OooO00o;
    }
}
