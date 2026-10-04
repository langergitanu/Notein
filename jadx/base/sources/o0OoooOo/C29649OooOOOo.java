package o0OoooOo;

import com.orion.notein.p607ui.noteeditor.propertypanel.comment.CommentVO;
import com.orion.notein.p607ui.notelist.OooO0OO;
import com.orion.notein.p607ui.p609vo.NoteVO;
import oO0O000o.InterfaceC32508OooOOOo;

/* JADX INFO: renamed from: o0OoooOo.OooOOOo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class C29649OooOOOo implements InterfaceC32508OooOOOo {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final /* synthetic */ Object f105112OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final /* synthetic */ int f105113OooOo0o;

    public /* synthetic */ C29649OooOOOo(Object obj, int i) {
        this.f105113OooOo0o = i;
        this.f105112OooOo = obj;
    }

    @Override // oO0O000o.InterfaceC32508OooOOOo
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f105113OooOo0o) {
            case 0:
                return Integer.valueOf(((com.orion.notein.p607ui.p609vo.OooO00o) this.f105112OooOo).f80099OooOo.invoke(((CommentVO) obj).mapToSortVO(), ((CommentVO) obj2).mapToSortVO()).intValue());
            default:
                return Integer.valueOf(((OooO0OO.OooO0O0) this.f105112OooOo).f77189OooO0O0.f77201OooO00o.f80099OooOo.invoke(((NoteVO) obj).mapToSortVO(), ((NoteVO) obj2).mapToSortVO()).intValue());
        }
    }
}
