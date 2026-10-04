package o0O0oooO;

import com.huawei.hms.network.embedded.C18385v2;
import com.orion.notein.domain.models.NoteinFirebaseUser;
import com.orion.notein.domain.models.message.NoteinMessage;
import com.orion.notein.domain.models.note.NoteMeta;
import com.orion.notein.domain.models.transactions.Coupon;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.coroutines.Continuation;
import oO00ooO.C32446OooOOOo;
import oO00ooO.C32460OooOooO;
import oO00ooo.AbstractC32476OooO;
import oO00ooo.InterfaceC32482OooO0o0;
import oO00ooo0.EnumC32485OooO00o;
import oO0O000o.InterfaceC32512OooOo0;
import oOo000Oo.C34429OooOOo0;

/* JADX INFO: renamed from: o0O0oooO.o000OO0o, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
@InterfaceC32482OooO0o0(m80622c = "com.orion.notein.UserViewModel$userAttachmentData$1", m80623f = "UserViewModel.kt", m80624l = {}, m80625m = "invokeSuspend")
public final class C26337o000OO0o extends AbstractC32476OooO implements InterfaceC32512OooOo0<NoteinFirebaseUser, List<? extends Coupon>, List<? extends NoteMeta>, List<? extends NoteinMessage>, Integer, Integer, Continuation<? super o0oOoOo.o00Oo0>, Object> {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public /* synthetic */ List f90372OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public /* synthetic */ NoteinFirebaseUser f90373OooOo0o;

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public /* synthetic */ List f90374OooOoO;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public /* synthetic */ List f90375OooOoO0;

    /* JADX INFO: renamed from: OooOoOO, reason: collision with root package name */
    public /* synthetic */ Integer f90376OooOoOO;

    /* JADX INFO: renamed from: OooOoo0, reason: collision with root package name */
    public /* synthetic */ Integer f90377OooOoo0;

    public C26337o000OO0o(Continuation<? super C26337o000OO0o> continuation) {
        super(7, continuation);
    }

    @Override // oO0O000o.InterfaceC32512OooOo0
    public final Object OoooO0(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Serializable serializable) {
        C26337o000OO0o c26337o000OO0o = new C26337o000OO0o((Continuation) serializable);
        c26337o000OO0o.f90373OooOo0o = (NoteinFirebaseUser) obj;
        c26337o000OO0o.f90372OooOo = (List) obj2;
        c26337o000OO0o.f90375OooOoO0 = (List) obj3;
        c26337o000OO0o.f90374OooOoO = (List) obj4;
        c26337o000OO0o.f90376OooOoOO = (Integer) obj5;
        c26337o000OO0o.f90377OooOoo0 = (Integer) obj6;
        return c26337o000OO0o.invokeSuspend(C32460OooOooO.f116667OooO00o);
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Object invokeSuspend(Object obj) {
        String id;
        int i;
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        C32446OooOOOo.OooO0O0(obj);
        NoteinFirebaseUser noteinFirebaseUser = this.f90373OooOo0o;
        List list = this.f90372OooOo;
        List list2 = this.f90375OooOoO0;
        List list3 = this.f90374OooOoO;
        Integer num = this.f90376OooOoOO;
        Integer num2 = this.f90377OooOoo0;
        long jCurrentTimeMillis = (System.currentTimeMillis() - (noteinFirebaseUser != null ? noteinFirebaseUser.getCreationTime() : System.currentTimeMillis())) / C18385v2.f56338j;
        ArrayList arrayList = new ArrayList();
        for (Object obj2 : list) {
            if (((Coupon) obj2).isValid()) {
                arrayList.add(obj2);
            }
        }
        if (noteinFirebaseUser == null || (id = noteinFirebaseUser.getId()) == null) {
            id = "";
        }
        String str = id;
        int size = arrayList.size();
        int i2 = (int) jCurrentTimeMillis;
        int size2 = list2.size();
        List list4 = list3;
        if ((list4 instanceof Collection) && list4.isEmpty()) {
            i = 0;
        } else {
            Iterator it = list4.iterator();
            int i3 = 0;
            while (it.hasNext()) {
                if (((NoteinMessage) it.next()).getUnread() == 1 && (i3 = i3 + 1) < 0) {
                    C34429OooOOo0.OooOOo0();
                    throw null;
                }
            }
            i = i3;
        }
        return new o0oOoOo.o00Oo0(str, i2, size2, size, i, num2 != null ? num2.intValue() : 0, num != null ? num.intValue() : 0);
    }
}
