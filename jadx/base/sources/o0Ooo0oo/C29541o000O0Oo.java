package o0Ooo0oo;

import com.orion.notein.domain.models.note.PenInfo;
import com.orion.notein.p607ui.p609vo.FavoritePenVO;
import java.util.Iterator;
import java.util.List;
import kotlin.coroutines.Continuation;
import o0OOooOo.C27976OooO0o0;
import oO00ooO.C32446OooOOOo;
import oO00ooO.C32460OooOooO;
import oO00ooo.AbstractC32476OooO;
import oO00ooo.InterfaceC32482OooO0o0;
import oO00ooo0.EnumC32485OooO00o;
import oO0O000o.InterfaceC32508OooOOOo;
import oO0o0OO.InterfaceC33636Oooo00o;
import oO0o0oOo.C33898OooO0Oo;

/* JADX INFO: renamed from: o0Ooo0oo.o000O0Oo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
@InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.noteeditor.penbar.PenBarViewModel$updatePenInfoByFavorite$1", m80623f = "PenBarViewModel.kt", m80624l = {1002, 1004, 1010}, m80625m = "invokeSuspend")
public final class C29541o000O0Oo extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super C32460OooOooO>, Object> {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final /* synthetic */ com.orion.notein.p607ui.noteeditor.penbar.OooO0O0 f104793OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public int f104794OooOo0o;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public final /* synthetic */ FavoritePenVO f104795OooOoO0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C29541o000O0Oo(com.orion.notein.p607ui.noteeditor.penbar.OooO0O0 oooO0O0, FavoritePenVO favoritePenVO, Continuation<? super C29541o000O0Oo> continuation) {
        super(2, continuation);
        this.f104793OooOo = oooO0O0;
        this.f104795OooOoO0 = favoritePenVO;
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
        return new C29541o000O0Oo(this.f104793OooOo, this.f104795OooOoO0, continuation);
    }

    @Override // oO0O000o.InterfaceC32508OooOOOo
    public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super C32460OooOooO> continuation) {
        return ((C29541o000O0Oo) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
    }

    /* JADX WARN: Code restructure failed: missing block: B:41:0x00ae, code lost:
    
        if (r7.OooO00o(r8, true, r10, r11, r13) == r0) goto L42;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0054 A[Catch: all -> 0x0019, TryCatch #0 {all -> 0x0019, blocks: (B:7:0x0014, B:13:0x0025, B:22:0x0044, B:23:0x004e, B:25:0x0054, B:29:0x0063, B:31:0x0067, B:32:0x0077, B:34:0x007d, B:38:0x0094, B:40:0x0099, B:19:0x003a), top: B:47:0x000c }] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0067 A[Catch: all -> 0x0019, TryCatch #0 {all -> 0x0019, blocks: (B:7:0x0014, B:13:0x0025, B:22:0x0044, B:23:0x004e, B:25:0x0054, B:29:0x0063, B:31:0x0067, B:32:0x0077, B:34:0x007d, B:38:0x0094, B:40:0x0099, B:19:0x003a), top: B:47:0x000c }] */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0062 A[SYNTHETIC] */
    @Override // oO00ooo.AbstractC32477OooO00o
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Iterator it;
        Object next;
        Object next2;
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i = this.f104794OooOo0o;
        com.orion.notein.p607ui.noteeditor.penbar.OooO0O0 oooO0O0 = this.f104793OooOo;
        C33898OooO0Oo c33898OooO0Oo = oooO0O0.f75202o00o0O;
        try {
            if (i == 0) {
                C32446OooOOOo.OooO0O0(obj);
                this.f104794OooOo0o = 1;
                if (c33898OooO0Oo.OooO00o(this) != enumC32485OooO00o) {
                }
                return enumC32485OooO00o;
            }
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    C32446OooOOOo.OooO0O0(obj);
                    c33898OooO0Oo.OooOOO0(null);
                    return C32460OooOooO.f116667OooO00o;
                }
                C32446OooOOOo.OooO0O0(obj);
                List list = (List) obj;
                it = list.iterator();
                while (true) {
                    if (it.hasNext()) {
                        next = null;
                        break;
                    }
                    next = it.next();
                    if (((PenInfo) next).getSelected()) {
                        break;
                    }
                }
                if (((PenInfo) next) != null) {
                    FavoritePenVO favoritePenVO = this.f104795OooOoO0;
                    Iterator it2 = ((Iterable) oooO0O0.f75198o000oOoO.f121747OooOo0o.getValue()).iterator();
                    while (true) {
                        if (!it2.hasNext()) {
                            next2 = null;
                            break;
                        }
                        next2 = it2.next();
                        if (kotlin.jvm.internal.OooOOO0.OooO0O0(((PenInfo) next2).getId(), favoritePenVO.getId())) {
                            break;
                        }
                    }
                    PenInfo penInfo = (PenInfo) next2;
                    if (penInfo != null) {
                        C27976OooO0o0 c27976OooO0o0 = oooO0O0.f75145OooO0oo;
                        String str = (String) oooO0O0.f75162OooOoO0.f121747OooOo0o.getValue();
                        this.f104794OooOo0o = 3;
                    }
                }
                c33898OooO0Oo.OooOOO0(null);
                return C32460OooOooO.f116667OooO00o;
            }
            C32446OooOOOo.OooO0O0(obj);
            this.f104794OooOo0o = 2;
            obj = com.orion.notein.p607ui.noteeditor.penbar.OooO0O0.OooO0o(oooO0O0, this);
            if (obj != enumC32485OooO00o) {
                List list2 = (List) obj;
                it = list2.iterator();
                while (true) {
                    if (it.hasNext()) {
                    }
                }
                if (((PenInfo) next) != null) {
                }
                c33898OooO0Oo.OooOOO0(null);
                return C32460OooOooO.f116667OooO00o;
            }
            return enumC32485OooO00o;
        } catch (Throwable th) {
            c33898OooO0Oo.OooOOO0(null);
            throw th;
        }
    }
}
