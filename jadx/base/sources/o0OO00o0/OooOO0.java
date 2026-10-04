package o0OO00o0;

import com.orion.notein.data.p602db.entity.CommentSortKeyUpdateEntity;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Map;
import kotlin.coroutines.Continuation;
import oO00ooO.C32446OooOOOo;
import oO00ooO.C32460OooOooO;
import oO00ooo.AbstractC32476OooO;
import oO00ooo.InterfaceC32482OooO0o0;
import oO00ooo0.EnumC32485OooO00o;
import oO0O000o.InterfaceC32508OooOOOo;
import oo0oO0.InterfaceC34739OoooOo0;

/* JADX INFO: loaded from: classes9.dex */
@InterfaceC32482OooO0o0(m80622c = "com.orion.notein.data.repo.CommentLocalDataSource$updateCommentsSortKey$2", m80623f = "CommentLocalDataSource.kt", m80624l = {121}, m80625m = "invokeSuspend")
public final class OooOO0 extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC34739OoooOo0, Continuation<? super C32460OooOooO>, Object> {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public /* synthetic */ Object f91000OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public int f91001OooOo0o;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public final /* synthetic */ Map<String, Integer> f91002OooOoO0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OooOO0(Map<String, Integer> map, Continuation<? super OooOO0> continuation) {
        super(2, continuation);
        this.f91002OooOoO0 = map;
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
        OooOO0 oooOO02 = new OooOO0(this.f91002OooOoO0, continuation);
        oooOO02.f91000OooOo = obj;
        return oooOO02;
    }

    @Override // oO0O000o.InterfaceC32508OooOOOo
    public final Object invoke(InterfaceC34739OoooOo0 interfaceC34739OoooOo0, Continuation<? super C32460OooOooO> continuation) {
        return ((OooOO0) create(interfaceC34739OoooOo0, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Object invokeSuspend(Object obj) {
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i = this.f91001OooOo0o;
        if (i == 0) {
            C32446OooOOOo.OooO0O0(obj);
            InterfaceC34739OoooOo0 interfaceC34739OoooOo0 = (InterfaceC34739OoooOo0) this.f91000OooOo;
            Map<String, Integer> map = this.f91002OooOoO0;
            ArrayList arrayList = new ArrayList(map.size());
            for (Map.Entry<String, Integer> entry : map.entrySet()) {
                arrayList.add(new CommentSortKeyUpdateEntity(entry.getKey(), entry.getValue().intValue()));
            }
            CommentSortKeyUpdateEntity[] commentSortKeyUpdateEntityArr = (CommentSortKeyUpdateEntity[]) arrayList.toArray(new CommentSortKeyUpdateEntity[0]);
            CommentSortKeyUpdateEntity[] commentSortKeyUpdateEntityArr2 = (CommentSortKeyUpdateEntity[]) Arrays.copyOf(commentSortKeyUpdateEntityArr, commentSortKeyUpdateEntityArr.length);
            this.f91001OooOo0o = 1;
            if (interfaceC34739OoooOo0.OooO0Oo(commentSortKeyUpdateEntityArr2, this) == enumC32485OooO00o) {
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
