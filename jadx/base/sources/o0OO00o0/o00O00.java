package o0OO00o0;

import com.orion.notein.data.p602db.entity.ImageEntity;
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
import oOo000Oo.C34428OooOOo;
import oOo000Oo.C34434OooOoO;
import oo0oO0.AbstractC34767o0000oOO;

/* JADX INFO: loaded from: classes9.dex */
@InterfaceC32482OooO0o0(m80622c = "com.orion.notein.data.repo.ImageLocalDataSource$getImagesByIds$2", m80623f = "ImageLocalDataSource.kt", m80624l = {60}, m80625m = "invokeSuspend")
public final class o00O00 extends AbstractC32476OooO implements InterfaceC32508OooOOOo<AbstractC34767o0000oOO, Continuation<? super List<? extends ImageEntity>>, Object> {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public Iterator f91638OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public Collection f91639OooOo0o;

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public int f91640OooOoO;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public Collection f91641OooOoO0;

    /* JADX INFO: renamed from: OooOoOO, reason: collision with root package name */
    public /* synthetic */ Object f91642OooOoOO;

    /* JADX INFO: renamed from: OooOoo0, reason: collision with root package name */
    public final /* synthetic */ ArrayList f91643OooOoo0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o00O00(ArrayList arrayList, Continuation continuation) {
        super(2, continuation);
        this.f91643OooOoo0 = arrayList;
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
        o00O00 o00o002 = new o00O00(this.f91643OooOoo0, continuation);
        o00o002.f91642OooOoOO = obj;
        return o00o002;
    }

    @Override // oO0O000o.InterfaceC32508OooOOOo
    public final Object invoke(AbstractC34767o0000oOO abstractC34767o0000oOO, Continuation<? super List<? extends ImageEntity>> continuation) {
        return ((o00O00) create(abstractC34767o0000oOO, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x006d  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:14:0x0065 -> B:15:0x0066). Please report as a decompilation issue!!! */
    @Override // oO00ooo.AbstractC32477OooO00o
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Iterator it;
        Collection collection;
        AbstractC34767o0000oOO abstractC34767o0000oOO;
        Object obj2;
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i = this.f91640OooOoO;
        if (i == 0) {
            C32446OooOOOo.OooO0O0(obj);
            AbstractC34767o0000oOO abstractC34767o0000oOO2 = (AbstractC34767o0000oOO) this.f91642OooOoOO;
            ArrayList arrayListOooo00O = oOo000Oo.OooOo.Oooo00O(this.f91643OooOoo0, 100);
            ArrayList arrayList = new ArrayList(C34428OooOOo.OooOOoo(arrayListOooo00O, 10));
            it = arrayListOooo00O.iterator();
            collection = arrayList;
            abstractC34767o0000oOO = abstractC34767o0000oOO2;
            if (it.hasNext()) {
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            collection = this.f91641OooOoO0;
            it = this.f91638OooOo;
            Collection collection2 = this.f91639OooOo0o;
            abstractC34767o0000oOO = (AbstractC34767o0000oOO) this.f91642OooOoOO;
            C32446OooOOOo.OooO0O0(obj);
            collection.add((List) obj);
            collection = collection2;
            if (it.hasNext()) {
                List list = (List) it.next();
                this.f91642OooOoOO = abstractC34767o0000oOO;
                Collection collection3 = collection;
                this.f91639OooOo0o = collection3;
                this.f91638OooOo = it;
                this.f91641OooOoO0 = collection3;
                this.f91640OooOoO = 1;
                obj = abstractC34767o0000oOO.OooO0oO(list, this);
                if (obj == enumC32485OooO00o) {
                    return enumC32485OooO00o;
                }
                collection2 = collection;
                collection.add((List) obj);
                collection = collection2;
                if (it.hasNext()) {
                    Iterator it2 = ((List) collection).iterator();
                    if (it2.hasNext()) {
                        Object next = it2.next();
                        while (it2.hasNext()) {
                            next = oOo000Oo.OooOo.OooooOO((List) next, (List) it2.next());
                        }
                        obj2 = next;
                    } else {
                        obj2 = null;
                    }
                    List list2 = (List) obj2;
                    return list2 == null ? C34434OooOoO.f123453OooOo0o : list2;
                }
            }
        }
    }
}
