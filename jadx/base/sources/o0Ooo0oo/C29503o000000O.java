package o0Ooo0oo;

import com.orion.notein.domain.models.note.PenInfo;
import com.orion.notein.p607ui.p609vo.PenExtraVO;
import java.util.Iterator;
import java.util.List;
import kotlin.coroutines.Continuation;
import oO00ooO.C32446OooOOOo;
import oO00ooO.C32460OooOooO;
import oO00ooo.AbstractC32476OooO;
import oO00ooo.InterfaceC32482OooO0o0;
import oO00ooo0.EnumC32485OooO00o;
import oO0O000o.InterfaceC32508OooOOOo;

/* JADX INFO: renamed from: o0Ooo0oo.o000000O, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
@InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.noteeditor.penbar.PenBarViewModel$penExtra$1", m80623f = "PenBarViewModel.kt", m80624l = {}, m80625m = "invokeSuspend")
public final class C29503o000000O extends AbstractC32476OooO implements InterfaceC32508OooOOOo<List<? extends PenInfo>, Continuation<? super PenExtraVO>, Object> {

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public /* synthetic */ Object f104623OooOo0o;

    public C29503o000000O() {
        throw null;
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
        C29503o000000O c29503o000000O = new C29503o000000O(2, continuation);
        c29503o000000O.f104623OooOo0o = obj;
        return c29503o000000O;
    }

    @Override // oO0O000o.InterfaceC32508OooOOOo
    public final Object invoke(List<? extends PenInfo> list, Continuation<? super PenExtraVO> continuation) {
        return ((C29503o000000O) create(list, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Object invokeSuspend(Object obj) {
        Object next;
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        C32446OooOOOo.OooO0O0(obj);
        Iterator it = ((List) this.f104623OooOo0o).iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (((PenInfo) next).getSelected()) {
                break;
            }
        }
        PenInfo penInfo = (PenInfo) next;
        if (penInfo != null) {
            return new PenExtraVO(penInfo.getType(), penInfo.getExtra());
        }
        return null;
    }
}
