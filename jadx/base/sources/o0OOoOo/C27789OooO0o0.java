package o0OOoOo;

import com.orion.notein.domain.models.note.LatestOpenedNote;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.OooOOO0;
import o00o00O0.C25252OooO0Oo;
import o0OO00o0.o00OO0;
import o0OOo0Oo.InterfaceC27305OooOo0;
import oO00ooO.C32446OooOOOo;
import oO00ooO.C32460OooOooO;
import oO00ooo.AbstractC32476OooO;
import oO00ooo.InterfaceC32482OooO0o0;
import oO00ooo0.EnumC32485OooO00o;
import oO0O000o.InterfaceC32508OooOOOo;
import oO0o0OO.InterfaceC33636Oooo00o;
import oOo000Oo.C34428OooOOo;
import oOo000Oo.C34434OooOoO;

/* JADX INFO: renamed from: o0OOoOo.OooO0o0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
@InterfaceC32482OooO0o0(m80622c = "com.orion.notein.domain.usecase.latestopenednote.DeleteLatestOpenedNoteUseCase$deleteTheOthersLatestOpenedNotes$2", m80623f = "DeleteLatestOpenedNoteUseCase.kt", m80624l = {24, 26}, m80625m = "invokeSuspend")
public final class C27789OooO0o0 extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super C32460OooOooO>, Object> {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final /* synthetic */ C27788OooO0o f98159OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public int f98160OooOo0o;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public final /* synthetic */ String f98161OooOoO0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C27789OooO0o0(C27788OooO0o c27788OooO0o, String str, Continuation<? super C27789OooO0o0> continuation) {
        super(2, continuation);
        this.f98159OooOo = c27788OooO0o;
        this.f98161OooOoO0 = str;
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
        return new C27789OooO0o0(this.f98159OooOo, this.f98161OooOoO0, continuation);
    }

    @Override // oO0O000o.InterfaceC32508OooOOOo
    public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super C32460OooOooO> continuation) {
        return ((C27789OooO0o0) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x008a, code lost:
    
        if (r1.OooO0O0(r8, r7) == r0) goto L28;
     */
    @Override // oO00ooo.AbstractC32477OooO00o
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i = this.f98160OooOo0o;
        C27788OooO0o c27788OooO0o = this.f98159OooOo;
        if (i == 0) {
            C32446OooOOOo.OooO0O0(obj);
            o00OO0 o00oo0OooO00o = c27788OooO0o.f98158OooO00o.OooO00o();
            this.f98160OooOo0o = 1;
            obj = C25252OooO0Oo.OooOo00(o00oo0OooO00o, this);
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
        Iterable iterable = (List) obj;
        if (iterable == null) {
            iterable = C34434OooOoO.f123453OooOo0o;
        }
        ArrayList arrayList = new ArrayList();
        for (Object obj2 : iterable) {
            if (!OooOOO0.OooO0O0(((LatestOpenedNote) obj2).getNoteId(), this.f98161OooOoO0)) {
                arrayList.add(obj2);
            }
        }
        ArrayList arrayList2 = new ArrayList(C34428OooOOo.OooOOoo(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(((LatestOpenedNote) it.next()).getNoteId());
        }
        InterfaceC27305OooOo0 interfaceC27305OooOo0 = c27788OooO0o.f98158OooO00o;
        this.f98160OooOo0o = 2;
    }
}
