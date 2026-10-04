package o0oOo0Oo;

import com.orion.notein.data.p602db.entity.NoteinMessageEntity;
import com.orion.notein.domain.models.message.NoteinMessage;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Set;
import kotlin.coroutines.Continuation;
import o0OO0ooo.C26979OooO0o0;
import oO00ooO.C32446OooOOOo;
import oO00ooO.C32460OooOooO;
import oO00ooo.AbstractC32476OooO;
import oO00ooo.InterfaceC32482OooO0o0;
import oO00ooo0.EnumC32485OooO00o;
import oO0O000o.InterfaceC32508OooOOOo;
import oO0o0OO.InterfaceC33636Oooo00o;
import oOo000Oo.C34428OooOOo;
import oOo000Oo.OooOo;

/* JADX INFO: renamed from: o0oOo0Oo.OooO0Oo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
@InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.user.message.UserMessageViewModel$readMessages$1", m80623f = "UserMessageViewModel.kt", m80624l = {64}, m80625m = "invokeSuspend")
public final class C30969OooO0Oo extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super C32460OooOooO>, Object> {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final /* synthetic */ ArrayList f110654OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public int f110655OooOo0o;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public final /* synthetic */ C30972OooO0oO f110656OooOoO0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C30969OooO0Oo(ArrayList arrayList, C30972OooO0oO c30972OooO0oO, Continuation continuation) {
        super(2, continuation);
        this.f110654OooOo = arrayList;
        this.f110656OooOoO0 = c30972OooO0oO;
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
        return new C30969OooO0Oo(this.f110654OooOo, this.f110656OooOoO0, continuation);
    }

    @Override // oO0O000o.InterfaceC32508OooOOOo
    public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super C32460OooOooO> continuation) {
        return ((C30969OooO0Oo) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Object invokeSuspend(Object obj) {
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i = this.f110655OooOo0o;
        if (i == 0) {
            C32446OooOOOo.OooO0O0(obj);
            Set setO0OO00O = OooOo.o0OO00O(this.f110654OooOo);
            C30972OooO0oO c30972OooO0oO = this.f110656OooOoO0;
            Iterable iterable = (Iterable) c30972OooO0oO.f110666OooO0o.f121747OooOo0o.getValue();
            ArrayList arrayList = new ArrayList();
            for (Object obj2 : iterable) {
                if (setO0OO00O.contains(((NoteinMessage) obj2).getId())) {
                    arrayList.add(obj2);
                }
            }
            ArrayList arrayList2 = new ArrayList(C34428OooOOo.OooOOoo(arrayList, 10));
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                arrayList2.add(NoteinMessage.copy$default((NoteinMessage) it.next(), null, null, null, null, null, 0, 0, 63, null));
            }
            this.f110655OooOo0o = 1;
            C26979OooO0o0 c26979OooO0o0 = c30972OooO0oO.f110665OooO0Oo.f93737OooO00o;
            ArrayList arrayList3 = new ArrayList(C34428OooOOo.OooOOoo(arrayList2, 10));
            Iterator it2 = arrayList2.iterator();
            while (it2.hasNext()) {
                arrayList3.add(c26979OooO0o0.f93730OooO0O0.toEntity((NoteinMessage) it2.next()));
            }
            NoteinMessageEntity[] noteinMessageEntityArr = (NoteinMessageEntity[]) arrayList3.toArray(new NoteinMessageEntity[0]);
            Object objOooO0OO = c26979OooO0o0.f93729OooO00o.OooO0OO((NoteinMessageEntity[]) Arrays.copyOf(noteinMessageEntityArr, noteinMessageEntityArr.length), this);
            EnumC32485OooO00o enumC32485OooO00o2 = EnumC32485OooO00o.f116726OooOo0o;
            if (objOooO0OO != enumC32485OooO00o2) {
                objOooO0OO = C32460OooOooO.f116667OooO00o;
            }
            if (objOooO0OO != enumC32485OooO00o2) {
                objOooO0OO = C32460OooOooO.f116667OooO00o;
            }
            if (objOooO0OO == enumC32485OooO00o) {
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
