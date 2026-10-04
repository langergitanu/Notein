package o0o00oOo;

import com.google.firebase.messaging.Constants;
import com.orion.notein.domain.models.page.Page;
import com.orion.notein.p607ui.p609vo.NoteVO;
import java.io.Serializable;
import java.util.List;
import kotlin.coroutines.Continuation;
import o00o00O0.C25252OooO0Oo;
import o0OOoOo0.C27816OooOoO;
import o0OOoOo0.C27818OooOoOO;
import o0OOoOo0.C27819OooOoo;
import o0OOoOo0.C27820OooOoo0;
import o0Oo0ooO.C28422OooOOo;
import oO00ooO.C32443OooOOO;
import oO00ooO.C32446OooOOOo;
import oO00ooO.C32460OooOooO;
import oO00ooo.AbstractC32476OooO;
import oO00ooo.InterfaceC32482OooO0o0;
import oO00ooo0.EnumC32485OooO00o;
import oO0O000o.InterfaceC32508OooOOOo;
import oO0o0Oo.C33770OooooO0;
import oO0o0Oo.InterfaceC33721OooO0o;
import oO0o0Oo.InterfaceC33723OooO0oO;
import oOo000Oo.C34434OooOoO;

/* JADX INFO: renamed from: o0o00oOo.Oooo0O0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
@InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.notelist.NoteListViewModel$_pagesInLabel$1", m80623f = "NoteListViewModel.kt", m80624l = {}, m80625m = "invokeSuspend")
public final class C30056Oooo0O0 extends AbstractC32476OooO implements oO0O000o.OooOo00<Integer, String, Long, String, C32443OooOOO<? extends NoteVO, ? extends NoteVO>, Continuation<? super InterfaceC33721OooO0o<? extends List<? extends Page>>>, Object> {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public /* synthetic */ String f106912OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public /* synthetic */ int f106913OooOo0o;

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public /* synthetic */ String f106914OooOoO;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public /* synthetic */ long f106915OooOoO0;

    /* JADX INFO: renamed from: OooOoOO, reason: collision with root package name */
    public /* synthetic */ C32443OooOOO f106916OooOoOO;

    /* JADX INFO: renamed from: OooOoo0, reason: collision with root package name */
    public final /* synthetic */ com.orion.notein.p607ui.notelist.OooO0OO f106917OooOoo0;

    /* JADX INFO: renamed from: o0o00oOo.Oooo0O0$OooO00o */
    @InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.notelist.NoteListViewModel$_pagesInLabel$1$1", m80623f = "NoteListViewModel.kt", m80624l = {410}, m80625m = "invokeSuspend")
    public static final class OooO00o extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33723OooO0oO<? super List<? extends Page>>, Continuation<? super C32460OooOooO>, Object> {

        /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
        public /* synthetic */ Object f106918OooOo;

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public int f106919OooOo0o;

        public OooO00o() {
            throw null;
        }

        @Override // oO00ooo.AbstractC32477OooO00o
        public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
            OooO00o oooO00o = new OooO00o(2, continuation);
            oooO00o.f106918OooOo = obj;
            return oooO00o;
        }

        @Override // oO0O000o.InterfaceC32508OooOOOo
        public final Object invoke(InterfaceC33723OooO0oO<? super List<? extends Page>> interfaceC33723OooO0oO, Continuation<? super C32460OooOooO> continuation) {
            return ((OooO00o) create(interfaceC33723OooO0oO, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
        }

        @Override // oO00ooo.AbstractC32477OooO00o
        public final Object invokeSuspend(Object obj) {
            EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
            int i = this.f106919OooOo0o;
            if (i == 0) {
                C32446OooOOOo.OooO0O0(obj);
                InterfaceC33723OooO0oO interfaceC33723OooO0oO = (InterfaceC33723OooO0oO) this.f106918OooOo;
                C34434OooOoO c34434OooOoO = C34434OooOoO.f123453OooOo0o;
                this.f106919OooOo0o = 1;
                if (interfaceC33723OooO0oO.emit(c34434OooOoO, this) == enumC32485OooO00o) {
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

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C30056Oooo0O0(com.orion.notein.p607ui.notelist.OooO0OO oooO0OO, Continuation<? super C30056Oooo0O0> continuation) {
        super(6, continuation);
        this.f106917OooOoo0 = oooO0OO;
    }

    @Override // oO0O000o.OooOo00
    public final Object Oooo0OO(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Serializable serializable) {
        int iIntValue = ((Number) obj).intValue();
        long jLongValue = ((Number) obj3).longValue();
        C30056Oooo0O0 c30056Oooo0O0 = new C30056Oooo0O0(this.f106917OooOoo0, (Continuation) serializable);
        c30056Oooo0O0.f106913OooOo0o = iIntValue;
        c30056Oooo0O0.f106912OooOo = (String) obj2;
        c30056Oooo0O0.f106915OooOoO0 = jLongValue;
        c30056Oooo0O0.f106914OooOoO = (String) obj4;
        c30056Oooo0O0.f106916OooOoOO = (C32443OooOOO) obj5;
        return c30056Oooo0O0.invokeSuspend(C32460OooOooO.f116667OooO00o);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // oO00ooo.AbstractC32477OooO00o
    public final Object invokeSuspend(Object obj) {
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        C32446OooOOOo.OooO0O0(obj);
        int i = this.f106913OooOo0o;
        String userId = this.f106912OooOo;
        long j = this.f106915OooOoO0;
        String str = this.f106914OooOoO;
        NoteVO noteVO = (NoteVO) this.f106916OooOoOO.f116638OooOo0o;
        com.orion.notein.p607ui.notelist.OooO0OO oooO0OO = this.f106917OooOoo0;
        if (noteVO == null && kotlin.jvm.internal.OooOOO0.OooO0O0(str, Constants.ScionAnalytics.PARAM_LABEL)) {
            C27819OooOoo c27819OooOoo = oooO0OO.f77134OooOOo0;
            c27819OooOoo.getClass();
            kotlin.jvm.internal.OooOOO0.OooO0oO(userId, "userId");
            return C25252OooO0Oo.OooOoO(c27819OooOoo.f98267OooO00o.OooO0OO(com.facebook.soloader.OooOo.OooO0oO(Long.valueOf(j))), new C27820OooOoo0(null, c27819OooOoo, userId));
        }
        if (i == 0) {
            return new C33770OooooO0(new OooO00o(2, null));
        }
        int i2 = ((C28422OooOOo) ((List) oooO0OO.f77153Oooo0O0.f121747OooOo0o.getValue()).get(i)).f100769OooO00o;
        C27819OooOoo c27819OooOoo2 = oooO0OO.f77134OooOOo0;
        c27819OooOoo2.getClass();
        kotlin.jvm.internal.OooOOO0.OooO0oO(userId, "userId");
        return C25252OooO0Oo.OooOoO(C25252OooO0Oo.OooOoO(c27819OooOoo2.f98267OooO00o.OooO0oo(i2), new C27816OooOoO(null, c27819OooOoo2)), new C27818OooOoOO(null, c27819OooOoo2, userId));
    }
}
