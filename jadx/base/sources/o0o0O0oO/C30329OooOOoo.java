package o0o0O0oO;

import com.orion.notein.domain.models.folder.Folder;
import com.orion.notein.domain.models.note.NoteMeta;
import com.orion.notein.p607ui.p609vo.NoteVO;
import java.util.List;
import kotlin.coroutines.Continuation;
import o0OO.C26410OooOOOo;
import o0OOo0o.C27600o0ooOO0;
import o0OOoooO.C28009OooOOOO;
import oO00ooO.C32443OooOOO;
import oO00ooO.C32446OooOOOo;
import oO00ooO.C32460OooOooO;
import oO00ooo.AbstractC32476OooO;
import oO00ooo.InterfaceC32482OooO0o0;
import oO00ooo0.EnumC32485OooO00o;
import oO0O000o.InterfaceC32510OooOOo0;
import oO0o0Oo.InterfaceC33721OooO0o;

/* JADX INFO: renamed from: o0o0O0oO.OooOOoo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
@InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.notelist.trashbin.TrashBinListViewModel$_foldersInCurrentFolder$1", m80623f = "TrashBinListViewModel.kt", m80624l = {}, m80625m = "invokeSuspend")
public final class C30329OooOOoo extends AbstractC32476OooO implements InterfaceC32510OooOOo0<C32443OooOOO<? extends NoteVO, ? extends NoteVO>, String, Continuation<? super InterfaceC33721OooO0o<? extends List<? extends Folder>>>, Object> {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final /* synthetic */ C30351Oooo0oO f108134OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public /* synthetic */ C32443OooOOO f108135OooOo0o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C30329OooOOoo(C30351Oooo0oO c30351Oooo0oO, Continuation<? super C30329OooOOoo> continuation) {
        super(3, continuation);
        this.f108134OooOo = c30351Oooo0oO;
    }

    @Override // oO0O000o.InterfaceC32510OooOOo0
    public final Object invoke(C32443OooOOO<? extends NoteVO, ? extends NoteVO> c32443OooOOO, String str, Continuation<? super InterfaceC33721OooO0o<? extends List<? extends Folder>>> continuation) {
        C30329OooOOoo c30329OooOOoo = new C30329OooOOoo(this.f108134OooOo, continuation);
        c30329OooOOoo.f108135OooOo0o = c32443OooOOO;
        return c30329OooOOoo.invokeSuspend(C32460OooOooO.f116667OooO00o);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // oO00ooo.AbstractC32477OooO00o
    public final Object invokeSuspend(Object obj) {
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        C32446OooOOOo.OooO0O0(obj);
        NoteVO noteVO = (NoteVO) this.f108135OooOo0o.f116638OooOo0o;
        C30351Oooo0oO c30351Oooo0oO = this.f108134OooOo;
        String str = (String) c30351Oooo0oO.f108240OooOOoo.getValue();
        C27600o0ooOO0 c27600o0ooOO0 = c30351Oooo0oO.f108228OooO0o0;
        if (noteVO != null) {
            return c27600o0ooOO0.OooO(noteVO.getId());
        }
        if (kotlin.jvm.internal.OooOOO0.OooO0O0(str, NoteMeta.PROPERTY_FAVORITE)) {
            return c27600o0ooOO0.OooO0OO();
        }
        if (!kotlin.jvm.internal.OooOOO0.OooO0O0(str, "trash_bin")) {
            return c27600o0ooOO0.OooO(null);
        }
        C28009OooOOOO c28009OooOOOO = c27600o0ooOO0.f96982OooO00o;
        return new C26410OooOOOo(c28009OooOOOO.f99335OooO00o.OooOOOO(c28009OooOOOO.f99337OooO0OO.OooO0Oo()), c28009OooOOOO, 1);
    }
}
