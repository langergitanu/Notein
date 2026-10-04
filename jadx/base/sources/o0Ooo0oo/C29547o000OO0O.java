package o0Ooo0oo;

import com.orion.notein.domain.models.note.PenInfo;
import java.util.Iterator;
import java.util.List;
import kotlin.coroutines.Continuation;
import o0OOooOo.C27974OooO0OO;
import o0OOooOo.C27976OooO0o0;
import o0oo00oO.InterfaceC31214OooO0oo;
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

/* JADX INFO: renamed from: o0Ooo0oo.o000OO0O, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
@InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.noteeditor.penbar.PenBarViewModel$updatePenInfoByStylusAction$1", m80623f = "PenBarViewModel.kt", m80624l = {968, 971}, m80625m = "invokeSuspend")
public final class C29547o000OO0O extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super C32460OooOooO>, Object> {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public com.orion.notein.p607ui.noteeditor.penbar.OooO0O0 f104811OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public PenInfo f104812OooOo0o;

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public final /* synthetic */ com.orion.notein.p607ui.noteeditor.penbar.OooO0O0 f104813OooOoO;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public int f104814OooOoO0;

    /* JADX INFO: renamed from: OooOoOO, reason: collision with root package name */
    public final /* synthetic */ InterfaceC31214OooO0oo.C31216OooO0o0 f104815OooOoOO;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C29547o000OO0O(com.orion.notein.p607ui.noteeditor.penbar.OooO0O0 oooO0O0, InterfaceC31214OooO0oo.C31216OooO0o0 c31216OooO0o0, Continuation<? super C29547o000OO0O> continuation) {
        super(2, continuation);
        this.f104813OooOoO = oooO0O0;
        this.f104815OooOoOO = c31216OooO0o0;
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
        return new C29547o000OO0O(this.f104813OooOoO, this.f104815OooOoOO, continuation);
    }

    @Override // oO0O000o.InterfaceC32508OooOOOo
    public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super C32460OooOooO> continuation) {
        return ((C29547o000OO0O) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // oO00ooo.AbstractC32477OooO00o
    public final Object invokeSuspend(Object obj) {
        Object next;
        PenInfo penInfo;
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i = this.f104814OooOoO0;
        com.orion.notein.p607ui.noteeditor.penbar.OooO0O0 oooO0O0 = this.f104813OooOoO;
        if (i == 0) {
            C32446OooOOOo.OooO0O0(obj);
            this.f104814OooOoO0 = 1;
            obj = com.orion.notein.p607ui.noteeditor.penbar.OooO0O0.OooO0o(oooO0O0, this);
            if (obj != enumC32485OooO00o) {
            }
            return enumC32485OooO00o;
        }
        if (i != 1) {
            if (i != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oooO0O0 = this.f104811OooOo;
            penInfo = this.f104812OooOo0o;
            C32446OooOOOo.OooO0O0(obj);
            oooO0O0.f75147OooOO0O = penInfo;
            return C32460OooOooO.f116667OooO00o;
        }
        C32446OooOOOo.OooO0O0(obj);
        List list = (List) obj;
        Iterator it = list.iterator();
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
        PenInfo penInfo2 = (PenInfo) next;
        if (penInfo2 != null) {
            PenInfo penInfo3 = oooO0O0.f75147OooOO0O;
            String str = (String) oooO0O0.f75162OooOoO0.f121747OooOo0o.getValue();
            this.f104812OooOo0o = penInfo2;
            this.f104811OooOo = oooO0O0;
            this.f104814OooOoO0 = 2;
            C27976OooO0o0 c27976OooO0o0 = oooO0O0.f75145OooO0oo;
            c27976OooO0o0.getClass();
            C33874OooO0OO c33874OooO0OO = C33649OoooOOo.f121328OooO00o;
            if (C33609OooO0oo.OooO0o(ExecutorC33873OooO0O0.f122045OooOoO0, new C27974OooO0OO(this.f104815OooOoOO, penInfo2, penInfo3, list, c27976OooO0o0, str, null), this) != enumC32485OooO00o) {
                penInfo = penInfo2;
                oooO0O0.f75147OooOO0O = penInfo;
            }
            return enumC32485OooO00o;
        }
        return C32460OooOooO.f116667OooO00o;
    }
}
