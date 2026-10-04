package o0OOO0OO;

import com.orion.notein.data.p602db.entity.PageEntity;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.coroutines.Continuation;
import oO00ooO.C32446OooOOOo;
import oO00ooO.C32460OooOooO;
import oO00ooo.AbstractC32476OooO;
import oO00ooo.InterfaceC32482OooO0o0;
import oO00ooo0.EnumC32485OooO00o;
import oO0O000o.InterfaceC32508OooOOOo;
import oOO00oo.C34406OooO00o;
import oOo000Oo.C34428OooOOo;
import oo0oO0.InterfaceC34887o00o00O0;

/* JADX INFO: loaded from: classes9.dex */
@InterfaceC32482OooO0o0(m80622c = "com.orion.notein.data.repo.page.PageLocalDataSource$getPageInTrashBinSync$2$result$1", m80623f = "PageLocalDataSource.kt", m80624l = {101, 108}, m80625m = "invokeSuspend")
public final class OooOO0 extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC34887o00o00O0, Continuation<? super List<? extends PageEntity>>, Object> {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public String f94001OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public List f94002OooOo0o;

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public int f94003OooOoO;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public Iterator f94004OooOoO0;

    /* JADX INFO: renamed from: OooOoOO, reason: collision with root package name */
    public /* synthetic */ Object f94005OooOoOO;

    /* JADX INFO: renamed from: OooOoo0, reason: collision with root package name */
    public final /* synthetic */ String f94006OooOoo0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OooOO0(String str, Continuation<? super OooOO0> continuation) {
        super(2, continuation);
        this.f94006OooOoo0 = str;
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
        OooOO0 oooOO02 = new OooOO0(this.f94006OooOoo0, continuation);
        oooOO02.f94005OooOoOO = obj;
        return oooOO02;
    }

    @Override // oO0O000o.InterfaceC32508OooOOOo
    public final Object invoke(InterfaceC34887o00o00O0 interfaceC34887o00o00O0, Continuation<? super List<? extends PageEntity>> continuation) {
        return ((OooOO0) create(interfaceC34887o00o00O0, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0041, code lost:
    
        if (r4 == r1) goto L30;
     */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00ca  */
    @Override // oO00ooo.AbstractC32477OooO00o
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        InterfaceC34887o00o00O0 interfaceC34887o00o00O0;
        Object objOooOO0o;
        String str;
        InterfaceC34887o00o00O0 interfaceC34887o00o00O02;
        Iterator it;
        String str2;
        List list;
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i = this.f94003OooOoO;
        if (i == 0) {
            C32446OooOOOo.OooO0O0(obj);
            interfaceC34887o00o00O0 = (InterfaceC34887o00o00O0) this.f94005OooOoOO;
            this.f94005OooOoOO = interfaceC34887o00o00O0;
            this.f94003OooOoO = 1;
            objOooOO0o = interfaceC34887o00o00O0.OooOO0o(this);
        } else {
            if (i != 1) {
                if (i != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                it = this.f94004OooOoO0;
                String str3 = this.f94001OooOo;
                list = this.f94002OooOo0o;
                interfaceC34887o00o00O02 = (InterfaceC34887o00o00O0) this.f94005OooOoOO;
                C32446OooOOOo.OooO0O0(obj);
                str2 = str3;
                while (it.hasNext()) {
                    PageEntity[] pageEntityArr = {PageEntity.copy$default((PageEntity) it.next(), null, str2, null, null, null, 0, null, null, 0L, 0L, null, false, 0, str2, null, 0, false, null, 0, 516093, null)};
                    this.f94005OooOoOO = interfaceC34887o00o00O02;
                    this.f94002OooOo0o = list;
                    this.f94001OooOo = str2;
                    this.f94004OooOoO0 = it;
                    this.f94003OooOoO = 2;
                    if (interfaceC34887o00o00O02.OooO0oo(pageEntityArr, this) == enumC32485OooO00o) {
                        return enumC32485OooO00o;
                    }
                }
                return list;
            }
            interfaceC34887o00o00O0 = (InterfaceC34887o00o00O0) this.f94005OooOoOO;
            C32446OooOOOo.OooO0O0(obj);
            objOooOO0o = obj;
        }
        List list2 = (List) objOooOO0o;
        ArrayList arrayList = new ArrayList();
        Iterator it2 = list2.iterator();
        while (true) {
            boolean zHasNext = it2.hasNext();
            str = this.f94006OooOoo0;
            if (!zHasNext) {
                break;
            }
            Object next = it2.next();
            if (!kotlin.jvm.internal.OooOOO0.OooO0O0(((PageEntity) next).getNoteId(), str)) {
                arrayList.add(next);
            }
        }
        if (arrayList.isEmpty()) {
            return list2;
        }
        C34406OooO00o.C20358OooO00o c20358OooO00o = C34406OooO00o.f123390OooO00o;
        c20358OooO00o.OooOOO0("PageLocalDataSource");
        ArrayList arrayList2 = new ArrayList(C34428OooOOo.OooOOoo(arrayList, 10));
        Iterator it3 = arrayList.iterator();
        while (it3.hasNext()) {
            arrayList2.add(((PageEntity) it3.next()).getNoteId());
        }
        c20358OooO00o.OooO0o0("Found incorrect noteId in pages, fixing... actual=" + str + ", wrongIds=" + arrayList2, new Object[0]);
        Iterator it4 = arrayList.iterator();
        interfaceC34887o00o00O02 = interfaceC34887o00o00O0;
        it = it4;
        str2 = str;
        list = list2;
        while (it.hasNext()) {
        }
        return list;
    }
}
