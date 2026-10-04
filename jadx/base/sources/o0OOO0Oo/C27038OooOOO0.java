package o0OOO0Oo;

import com.orion.notein.data.p602db.entity.PageLayerEntity;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import kotlin.coroutines.Continuation;
import oO00ooO.C32446OooOOOo;
import oO00ooO.C32460OooOooO;
import oO00ooo.AbstractC32476OooO;
import oO00ooo.InterfaceC32482OooO0o0;
import oO00ooo0.EnumC32485OooO00o;
import oO0O000o.InterfaceC32508OooOOOo;
import oOo000Oo.C34428OooOOo;
import oo0oO0.AbstractC34903o00o0OoO;

/* JADX INFO: renamed from: o0OOO0Oo.OooOOO0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
@InterfaceC32482OooO0o0(m80622c = "com.orion.notein.data.repo.page.layer.PageLayerLocalDataSource$updateOldNoteId$2", m80623f = "PageLayerLocalDataSource.kt", m80624l = {132}, m80625m = "invokeSuspend")
public final class C27038OooOOO0 extends AbstractC32476OooO implements InterfaceC32508OooOOOo<AbstractC34903o00o0OoO, Continuation<? super C32460OooOooO>, Object> {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public /* synthetic */ Object f94143OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public int f94144OooOo0o;

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public final /* synthetic */ String f94145OooOoO;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public final /* synthetic */ String f94146OooOoO0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C27038OooOOO0(String str, String str2, Continuation<? super C27038OooOOO0> continuation) {
        super(2, continuation);
        this.f94146OooOoO0 = str;
        this.f94145OooOoO = str2;
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
        C27038OooOOO0 c27038OooOOO0 = new C27038OooOOO0(this.f94146OooOoO0, this.f94145OooOoO, continuation);
        c27038OooOOO0.f94143OooOo = obj;
        return c27038OooOOO0;
    }

    @Override // oO0O000o.InterfaceC32508OooOOOo
    public final Object invoke(AbstractC34903o00o0OoO abstractC34903o00o0OoO, Continuation<? super C32460OooOooO> continuation) {
        return ((C27038OooOOO0) create(abstractC34903o00o0OoO, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Object invokeSuspend(Object obj) {
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i = this.f94144OooOo0o;
        if (i == 0) {
            C32446OooOOOo.OooO0O0(obj);
            AbstractC34903o00o0OoO abstractC34903o00o0OoO = (AbstractC34903o00o0OoO) this.f94143OooOo;
            List<PageLayerEntity> listOooOOo0 = abstractC34903o00o0OoO.OooOOo0(this.f94146OooOoO0);
            ArrayList arrayList = new ArrayList(C34428OooOOo.OooOOoo(listOooOOo0, 10));
            Iterator<T> it = listOooOOo0.iterator();
            while (it.hasNext()) {
                arrayList.add(PageLayerEntity.copy$default((PageLayerEntity) it.next(), null, this.f94145OooOoO, false, null, null, 29, null));
            }
            PageLayerEntity[] pageLayerEntityArr = (PageLayerEntity[]) arrayList.toArray(new PageLayerEntity[0]);
            PageLayerEntity[] pageLayerEntityArr2 = (PageLayerEntity[]) Arrays.copyOf(pageLayerEntityArr, pageLayerEntityArr.length);
            this.f94144OooOo0o = 1;
            if (abstractC34903o00o0OoO.OooO00o(pageLayerEntityArr2, this) == enumC32485OooO00o) {
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
