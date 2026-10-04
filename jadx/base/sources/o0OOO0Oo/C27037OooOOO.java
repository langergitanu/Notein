package o0OOO0Oo;

import com.orion.notein.data.p602db.entity.UpdateNameEntity;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import kotlin.coroutines.Continuation;
import oO00ooO.C32446OooOOOo;
import oO00ooO.C32460OooOooO;
import oO00ooo.AbstractC32476OooO;
import oO00ooo.InterfaceC32482OooO0o0;
import oO00ooo0.EnumC32485OooO00o;
import oO0O000o.InterfaceC32508OooOOOo;
import oOo000Oo.C34428OooOOo;
import oo0oO0.AbstractC34903o00o0OoO;

/* JADX INFO: renamed from: o0OOO0Oo.OooOOO, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
@InterfaceC32482OooO0o0(m80622c = "com.orion.notein.data.repo.page.layer.PageLayerLocalDataSource$updatePageLayerNames$2", m80623f = "PageLayerLocalDataSource.kt", m80624l = {157}, m80625m = "invokeSuspend")
public final class C27037OooOOO extends AbstractC32476OooO implements InterfaceC32508OooOOOo<AbstractC34903o00o0OoO, Continuation<? super C32460OooOooO>, Object> {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public /* synthetic */ Object f94140OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public int f94141OooOo0o;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public final /* synthetic */ Map<String, String> f94142OooOoO0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C27037OooOOO(Map<String, String> map, Continuation<? super C27037OooOOO> continuation) {
        super(2, continuation);
        this.f94142OooOoO0 = map;
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
        C27037OooOOO c27037OooOOO = new C27037OooOOO(this.f94142OooOoO0, continuation);
        c27037OooOOO.f94140OooOo = obj;
        return c27037OooOOO;
    }

    @Override // oO0O000o.InterfaceC32508OooOOOo
    public final Object invoke(AbstractC34903o00o0OoO abstractC34903o00o0OoO, Continuation<? super C32460OooOooO> continuation) {
        return ((C27037OooOOO) create(abstractC34903o00o0OoO, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Object invokeSuspend(Object obj) {
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i = this.f94141OooOo0o;
        if (i == 0) {
            C32446OooOOOo.OooO0O0(obj);
            AbstractC34903o00o0OoO abstractC34903o00o0OoO = (AbstractC34903o00o0OoO) this.f94140OooOo;
            Set<Map.Entry<String, String>> setEntrySet = this.f94142OooOoO0.entrySet();
            ArrayList arrayList = new ArrayList(C34428OooOOo.OooOOoo(setEntrySet, 10));
            Iterator<T> it = setEntrySet.iterator();
            while (it.hasNext()) {
                Map.Entry entry = (Map.Entry) it.next();
                arrayList.add(new UpdateNameEntity((String) entry.getKey(), (String) entry.getValue()));
            }
            UpdateNameEntity[] updateNameEntityArr = (UpdateNameEntity[]) arrayList.toArray(new UpdateNameEntity[0]);
            UpdateNameEntity[] updateNameEntityArr2 = (UpdateNameEntity[]) Arrays.copyOf(updateNameEntityArr, updateNameEntityArr.length);
            this.f94141OooOo0o = 1;
            if (abstractC34903o00o0OoO.Oooo000(updateNameEntityArr2, this) == enumC32485OooO00o) {
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
