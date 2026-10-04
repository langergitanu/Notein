package o0OO00o0;

import com.orion.notein.data.p602db.entity.QuoteEntity;
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
import oO0O000o.InterfaceC32508OooOOOo;
import oOo000Oo.C34431OooOo0;
import oo0oO0.AbstractC34954o00ooO0;

/* JADX INFO: renamed from: o0OO00o0.o00Oo0o, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
@InterfaceC32482OooO0o0(m80622c = "com.orion.notein.data.repo.QuoteLocalDataSource$getQuotesByIdsSync$2", m80623f = "QuoteLocalDataSource.kt", m80624l = {47}, m80625m = "invokeSuspend")
public final class C26624o00Oo0o extends AbstractC32476OooO implements InterfaceC32508OooOOOo<AbstractC34954o00ooO0, Continuation<? super List<? extends QuoteEntity>>, Object> {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public Iterator f91891OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public Collection f91892OooOo0o;

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public /* synthetic */ Object f91893OooOoO;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public int f91894OooOoO0;

    /* JADX INFO: renamed from: OooOoOO, reason: collision with root package name */
    public final /* synthetic */ ArrayList f91895OooOoOO;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C26624o00Oo0o(ArrayList arrayList, Continuation continuation) {
        super(2, continuation);
        this.f91895OooOoOO = arrayList;
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
        C26624o00Oo0o c26624o00Oo0o = new C26624o00Oo0o(this.f91895OooOoOO, continuation);
        c26624o00Oo0o.f91893OooOoO = obj;
        return c26624o00Oo0o;
    }

    @Override // oO0O000o.InterfaceC32508OooOOOo
    public final Object invoke(AbstractC34954o00ooO0 abstractC34954o00ooO0, Continuation<? super List<? extends QuoteEntity>> continuation) {
        return ((C26624o00Oo0o) create(abstractC34954o00ooO0, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x003e  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x005c  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:12:0x0053 -> B:14:0x0056). Please report as a decompilation issue!!! */
    @Override // oO00ooo.AbstractC32477OooO00o
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Collection arrayList;
        Iterator it;
        AbstractC34954o00ooO0 abstractC34954o00ooO0;
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i = this.f91894OooOoO0;
        if (i == 0) {
            C32446OooOOOo.OooO0O0(obj);
            AbstractC34954o00ooO0 abstractC34954o00ooO02 = (AbstractC34954o00ooO0) this.f91893OooOoO;
            ArrayList arrayListOooo00O = oOo000Oo.OooOo.Oooo00O(this.f91895OooOoOO, 100);
            arrayList = new ArrayList();
            it = arrayListOooo00O.iterator();
            abstractC34954o00ooO0 = abstractC34954o00ooO02;
            if (it.hasNext()) {
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            it = this.f91891OooOo;
            arrayList = this.f91892OooOo0o;
            abstractC34954o00ooO0 = (AbstractC34954o00ooO0) this.f91893OooOoO;
            C32446OooOOOo.OooO0O0(obj);
            C34431OooOo0.OooOo0o(arrayList, (Iterable) obj);
            if (it.hasNext()) {
                List list = (List) it.next();
                this.f91893OooOoO = abstractC34954o00ooO0;
                this.f91892OooOo0o = arrayList;
                this.f91891OooOo = it;
                this.f91894OooOoO0 = 1;
                obj = abstractC34954o00ooO0.OooO0o0(list, this);
                if (obj == enumC32485OooO00o) {
                    return enumC32485OooO00o;
                }
                C34431OooOo0.OooOo0o(arrayList, (Iterable) obj);
                if (it.hasNext()) {
                    return (List) arrayList;
                }
            }
        }
    }
}
