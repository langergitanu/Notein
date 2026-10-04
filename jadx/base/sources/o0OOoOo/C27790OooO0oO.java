package o0OOoOo;

import com.orion.notein.domain.models.note.LatestOpenedNote;
import com.orion.notein.domain.models.note.NoteMeta;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.coroutines.Continuation;
import o00o00O0.C25252OooO0Oo;
import oO00ooO.C32443OooOOO;
import oO00ooO.C32446OooOOOo;
import oO00ooO.C32460OooOooO;
import oO00ooo.AbstractC32476OooO;
import oO00ooo.InterfaceC32482OooO0o0;
import oO00ooo0.EnumC32485OooO00o;
import oO0O000o.InterfaceC32510OooOOo0;
import oO0o0Oo.InterfaceC33721OooO0o;
import oO0o0Oo.InterfaceC33723OooO0oO;
import oOo000Oo.C34428OooOOo;

/* JADX INFO: renamed from: o0OOoOo.OooO0oO, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
@InterfaceC32482OooO0o0(m80622c = "com.orion.notein.domain.usecase.latestopenednote.GetLatestOpenedNoteUseCase$getLatestOpenedNotes$$inlined$flatMapLatest$1", m80623f = "GetLatestOpenedNoteUseCase.kt", m80624l = {189}, m80625m = "invokeSuspend")
public final class C27790OooO0oO extends AbstractC32476OooO implements InterfaceC32510OooOOo0<InterfaceC33723OooO0oO<? super List<? extends C32443OooOOO<? extends LatestOpenedNote, ? extends NoteMeta>>>, List<? extends LatestOpenedNote>, Continuation<? super C32460OooOooO>, Object> {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public /* synthetic */ InterfaceC33723OooO0oO f98162OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public int f98163OooOo0o;

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public final /* synthetic */ C27783OooO f98164OooOoO;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public /* synthetic */ Object f98165OooOoO0;

    /* JADX INFO: renamed from: OooOoOO, reason: collision with root package name */
    public final /* synthetic */ String f98166OooOoOO;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C27790OooO0oO(Continuation continuation, C27783OooO c27783OooO, String str) {
        super(3, continuation);
        this.f98164OooOoO = c27783OooO;
        this.f98166OooOoOO = str;
    }

    @Override // oO0O000o.InterfaceC32510OooOOo0
    public final Object invoke(InterfaceC33723OooO0oO<? super List<? extends C32443OooOOO<? extends LatestOpenedNote, ? extends NoteMeta>>> interfaceC33723OooO0oO, List<? extends LatestOpenedNote> list, Continuation<? super C32460OooOooO> continuation) {
        C27790OooO0oO c27790OooO0oO = new C27790OooO0oO(continuation, this.f98164OooOoO, this.f98166OooOoOO);
        c27790OooO0oO.f98162OooOo = interfaceC33723OooO0oO;
        c27790OooO0oO.f98165OooOoO0 = list;
        return c27790OooO0oO.invokeSuspend(C32460OooOooO.f116667OooO00o);
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Object invokeSuspend(Object obj) {
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i = this.f98163OooOo0o;
        if (i == 0) {
            C32446OooOOOo.OooO0O0(obj);
            InterfaceC33723OooO0oO interfaceC33723OooO0oO = this.f98162OooOo;
            List list = (List) this.f98165OooOoO0;
            List list2 = list;
            ArrayList arrayList = new ArrayList(C34428OooOOo.OooOOoo(list2, 10));
            Iterator it = list2.iterator();
            while (it.hasNext()) {
                arrayList.add(((LatestOpenedNote) it.next()).getNoteId());
            }
            InterfaceC33721OooO0o interfaceC33721OooO0oOooOO0 = this.f98164OooOoO.f98147OooO0O0.OooOO0(this.f98166OooOoOO, arrayList);
            this.f98163OooOo0o = 1;
            C25252OooO0Oo.OooOOO(interfaceC33723OooO0oO);
            Object objCollect = interfaceC33721OooO0oOooOO0.collect(new C27791OooO0oo(interfaceC33723OooO0oO, list), this);
            EnumC32485OooO00o enumC32485OooO00o2 = EnumC32485OooO00o.f116726OooOo0o;
            if (objCollect != enumC32485OooO00o2) {
                objCollect = C32460OooOooO.f116667OooO00o;
            }
            if (objCollect != enumC32485OooO00o2) {
                objCollect = C32460OooOooO.f116667OooO00o;
            }
            if (objCollect == enumC32485OooO00o) {
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
