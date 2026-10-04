package o0o0OOO;

import com.orion.notein.domain.models.cloudsync.SyncEvent;
import com.orion.notein.domain.models.papertheme.MyTemplate;
import com.orion.notein.p607ui.p609vo.ThemeVO;
import java.util.Iterator;
import kotlin.coroutines.Continuation;
import o0OOo0o.C27559o00oOOo0;
import o0OOo0o.C27570o00oOoo0;
import o0OOoO00.C27723OooO0O0;
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

/* JADX INFO: renamed from: o0o0OOO.ooOO, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
@InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.paperconfig.PaperConfigDialogViewModel$deleteMyTemplate$1", m80623f = "PaperConfigDialogViewModel.kt", m80624l = {1756}, m80625m = "invokeSuspend")
public final class C30542ooOO extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super C32460OooOooO>, Object> {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final /* synthetic */ C30520o000000o f109248OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public int f109249OooOo0o;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public final /* synthetic */ String f109250OooOoO0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C30542ooOO(String str, Continuation continuation, C30520o000000o c30520o000000o) {
        super(2, continuation);
        this.f109248OooOo = c30520o000000o;
        this.f109250OooOoO0 = str;
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
        return new C30542ooOO(this.f109250OooOoO0, continuation, this.f109248OooOo);
    }

    @Override // oO0O000o.InterfaceC32508OooOOOo
    public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super C32460OooOooO> continuation) {
        return ((C30542ooOO) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object next;
        Object obj2 = EnumC32485OooO00o.f116726OooOo0o;
        int i = this.f109249OooOo0o;
        String str = this.f109250OooOoO0;
        C30520o000000o c30520o000000o = this.f109248OooOo;
        if (i == 0) {
            C32446OooOOOo.OooO0O0(obj);
            this.f109249OooOo0o = 1;
            C27570o00oOoo0 c27570o00oOoo0 = c30520o000000o.f109000OooO0o;
            c27570o00oOoo0.getClass();
            C33874OooO0OO c33874OooO0OO = C33649OoooOOo.f121328OooO00o;
            Object objOooO0o = C33609OooO0oo.OooO0o(ExecutorC33873OooO0O0.f122045OooOoO0, new C27559o00oOOo0(c27570o00oOoo0, str, null), this);
            if (objOooO0o != obj2) {
                objOooO0o = C32460OooOooO.f116667OooO00o;
            }
            if (objOooO0o == obj2) {
                return obj2;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C32446OooOOOo.OooO0O0(obj);
        }
        C32460OooOooO c32460OooOooO = C32460OooOooO.f116667OooO00o;
        o0OOo0oo.o0ooOOo o0ooooo2 = c30520o000000o.f109008OooOOO0;
        o0ooooo2.getClass();
        C27723OooO0O0 c27723OooO0O0 = (C27723OooO0O0) o0ooooo2.f97663OooO00o;
        c27723OooO0O0.getClass();
        c27723OooO0O0.f97800OooO00o.OooO0o0(new SyncEvent.LocalDeleted(str));
        Iterator it = ((Iterable) c30520o000000o.f109050OooooOO.f121747OooOo0o.getValue()).iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (!kotlin.jvm.internal.OooOOO0.OooO0O0(((ThemeVO) next).getMyTemplateId(), str)) {
                break;
            }
        }
        ThemeVO themeVO = (ThemeVO) next;
        if ((themeVO != null ? themeVO.getMyTemplateId() : null) != null) {
            c30520o000000o.OooOo0o(themeVO.getMyTemplateId());
        } else {
            MyTemplate myTemplateOooO0o = c30520o000000o.f109001OooO0o0.OooO0o();
            C33781o00o0O c33781o00o0O = c30520o000000o.f109040OoooO0O;
            c33781o00o0O.getClass();
            c33781o00o0O.OooOO0(null, myTemplateOooO0o);
        }
        return C32460OooOooO.f116667OooO00o;
    }
}
