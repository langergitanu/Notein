package o0OOoOo;

import com.orion.notein.domain.models.note.LatestOpenedNote;
import java.util.ArrayList;
import kotlin.coroutines.Continuation;
import o0OOo0Oo.InterfaceC27305OooOo0;
import oO00ooO.C32446OooOOOo;
import oO00ooO.C32460OooOooO;
import oO00ooo.AbstractC32476OooO;
import oO00ooo.InterfaceC32482OooO0o0;
import oO00ooo0.EnumC32485OooO00o;
import oO0O000o.InterfaceC32508OooOOOo;
import oO0o0OO.InterfaceC33636Oooo00o;
import oOo000Oo.C34428OooOOo;
import oOo000Oo.C34429OooOOo0;

/* JADX INFO: renamed from: o0OOoOo.OooO0O0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
@InterfaceC32482OooO0o0(m80622c = "com.orion.notein.domain.usecase.latestopenednote.CreateLatestOpenedNoteUseCase$createSortedLatestOpenedNotes$2", m80623f = "CreateLatestOpenedNoteUseCase.kt", m80624l = {34}, m80625m = "invokeSuspend")
public final class C27785OooO0O0 extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super C32460OooOooO>, Object> {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final /* synthetic */ ArrayList f98151OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public int f98152OooOo0o;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public final /* synthetic */ C27786OooO0OO f98153OooOoO0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C27785OooO0O0(ArrayList arrayList, C27786OooO0OO c27786OooO0OO, Continuation continuation) {
        super(2, continuation);
        this.f98151OooOo = arrayList;
        this.f98153OooOoO0 = c27786OooO0OO;
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
        return new C27785OooO0O0(this.f98151OooOo, this.f98153OooOoO0, continuation);
    }

    @Override // oO0O000o.InterfaceC32508OooOOOo
    public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super C32460OooOooO> continuation) {
        return ((C27785OooO0O0) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Object invokeSuspend(Object obj) {
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i = this.f98152OooOo0o;
        if (i == 0) {
            C32446OooOOOo.OooO0O0(obj);
            ArrayList arrayList = this.f98151OooOo;
            ArrayList arrayList2 = new ArrayList(C34428OooOOo.OooOOoo(arrayList, 10));
            int i2 = 0;
            for (Object obj2 : arrayList) {
                int i3 = i2 + 1;
                if (i2 < 0) {
                    C34429OooOOo0.OooOOo();
                    throw null;
                }
                arrayList2.add(new LatestOpenedNote((String) obj2, i2));
                i2 = i3;
            }
            InterfaceC27305OooOo0 interfaceC27305OooOo0 = this.f98153OooOoO0.f98154OooO00o;
            this.f98152OooOo0o = 1;
            if (interfaceC27305OooOo0.OooO0OO(arrayList2, this) == enumC32485OooO00o) {
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
