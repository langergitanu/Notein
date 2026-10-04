package o0o0O0oO;

import com.orion.notein.domain.models.note.NoteMeta;
import com.orion.notein.p607ui.p609vo.NoteVO;
import java.util.List;
import kotlin.coroutines.Continuation;
import o00o00O0.C25252OooO0Oo;
import o0OOo0o.C27449o00O0OoO;
import oO00ooO.C32443OooOOO;
import oO00ooO.C32446OooOOOo;
import oO00ooO.C32460OooOooO;
import oO00ooo.AbstractC32476OooO;
import oO00ooo.InterfaceC32482OooO0o0;
import oO00ooo0.EnumC32485OooO00o;
import oO0O000o.InterfaceC32510OooOOo0;
import oO0o0OO.C33649OoooOOo;
import oO0o0Oo.InterfaceC33721OooO0o;
import oO0o0o0o.C33874OooO0OO;
import oO0o0o0o.ExecutorC33873OooO0O0;

/* JADX INFO: renamed from: o0o0O0oO.OooOo00, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
@InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.notelist.trashbin.TrashBinListViewModel$_noteMetasInCurrentFolder$1", m80623f = "TrashBinListViewModel.kt", m80624l = {}, m80625m = "invokeSuspend")
public final class C30332OooOo00 extends AbstractC32476OooO implements InterfaceC32510OooOOo0<C32443OooOOO<? extends NoteVO, ? extends NoteVO>, String, Continuation<? super InterfaceC33721OooO0o<? extends List<? extends NoteMeta>>>, Object> {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public /* synthetic */ String f108146OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public /* synthetic */ C32443OooOOO f108147OooOo0o;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public final /* synthetic */ C30351Oooo0oO f108148OooOoO0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C30332OooOo00(C30351Oooo0oO c30351Oooo0oO, Continuation<? super C30332OooOo00> continuation) {
        super(3, continuation);
        this.f108148OooOoO0 = c30351Oooo0oO;
    }

    @Override // oO0O000o.InterfaceC32510OooOOo0
    public final Object invoke(C32443OooOOO<? extends NoteVO, ? extends NoteVO> c32443OooOOO, String str, Continuation<? super InterfaceC33721OooO0o<? extends List<? extends NoteMeta>>> continuation) {
        C30332OooOo00 c30332OooOo00 = new C30332OooOo00(this.f108148OooOoO0, continuation);
        c30332OooOo00.f108147OooOo0o = c32443OooOOO;
        c30332OooOo00.f108146OooOo = str;
        return c30332OooOo00.invokeSuspend(C32460OooOooO.f116667OooO00o);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // oO00ooo.AbstractC32477OooO00o
    public final Object invokeSuspend(Object obj) {
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        C32446OooOOOo.OooO0O0(obj);
        C32443OooOOO c32443OooOOO = this.f108147OooOo0o;
        String userId = this.f108146OooOo;
        NoteVO noteVO = (NoteVO) c32443OooOOO.f116638OooOo0o;
        C30351Oooo0oO c30351Oooo0oO = this.f108148OooOoO0;
        String str = (String) c30351Oooo0oO.f108240OooOOoo.getValue();
        C27449o00O0OoO c27449o00O0OoO = c30351Oooo0oO.f108226OooO0Oo;
        if (noteVO != null) {
            return c27449o00O0OoO.OooOoo0(noteVO.getId(), userId);
        }
        if (kotlin.jvm.internal.OooOOO0.OooO0O0(str, NoteMeta.PROPERTY_FAVORITE)) {
            return c27449o00O0OoO.OooOo0(userId);
        }
        if (!kotlin.jvm.internal.OooOOO0.OooO0O0(str, "trash_bin")) {
            return c27449o00O0OoO.OooOoo0(null, userId);
        }
        c27449o00O0OoO.getClass();
        kotlin.jvm.internal.OooOOO0.OooO0oO(userId, "userId");
        o0OOO00o.OooOO0O oooOO0OOooO0OO = c27449o00O0OoO.f96036OooO0O0.OooO0OO(userId);
        C33874OooO0OO c33874OooO0OO = C33649OoooOOo.f121328OooO00o;
        return C25252OooO0Oo.OooOo0O(oooOO0OOooO0OO, ExecutorC33873OooO0O0.f122045OooOoO0);
    }
}
