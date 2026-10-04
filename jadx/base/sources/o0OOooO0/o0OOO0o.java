package o0OOooO0;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.coroutines.Continuation;
import o0OO000.C26438OooO0Oo;
import o0OO000.C26439OooO0o0;
import o0OO000.InterfaceC26441OooO0oo;
import oO00ooO.C32446OooOOOo;
import oO00ooO.C32460OooOooO;
import oO00ooo.AbstractC32476OooO;
import oO00ooo.InterfaceC32482OooO0o0;
import oO00ooo0.EnumC32485OooO00o;
import oO0O000o.InterfaceC32508OooOOOo;
import oO0OOo0o.C33074OooOoO;
import oOo000Oo.C34431OooOo0;
import ooooOOo0.C35238OooOoO;

/* JADX INFO: loaded from: classes9.dex */
@InterfaceC32482OooO0o0(m80622c = "com.orion.notein.data.repo.cloudsync.drive.DriveCloudSyncDataSource$runBatchDelete$2", m80623f = "DriveCloudSyncDataSource.kt", m80624l = {1370, 1374}, m80625m = "invokeSuspend")
public final class o0OOO0o extends AbstractC32476OooO implements InterfaceC32508OooOOOo<String, Continuation<? super List<? extends C26439OooO0o0>>, Object> {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public String f99081OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public AbstractC27907OooOo0O f99082OooOo0o;

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public Iterator f99083OooOoO;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public Collection f99084OooOoO0;

    /* JADX INFO: renamed from: OooOoOO, reason: collision with root package name */
    public int f99085OooOoOO;

    /* JADX INFO: renamed from: OooOoo, reason: collision with root package name */
    public final /* synthetic */ ArrayList f99086OooOoo;

    /* JADX INFO: renamed from: OooOoo0, reason: collision with root package name */
    public /* synthetic */ Object f99087OooOoo0;

    /* JADX INFO: renamed from: OooOooO, reason: collision with root package name */
    public final /* synthetic */ AbstractC27907OooOo0O f99088OooOooO;

    /* JADX INFO: renamed from: OooOooo, reason: collision with root package name */
    public final /* synthetic */ String f99089OooOooo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o0OOO0o(ArrayList arrayList, AbstractC27907OooOo0O abstractC27907OooOo0O, String str, Continuation continuation) {
        super(2, continuation);
        this.f99086OooOoo = arrayList;
        this.f99088OooOooO = abstractC27907OooOo0O;
        this.f99089OooOooo = str;
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
        o0OOO0o o0ooo0o2 = new o0OOO0o(this.f99086OooOoo, this.f99088OooOooO, this.f99089OooOooo, continuation);
        o0ooo0o2.f99087OooOoo0 = obj;
        return o0ooo0o2;
    }

    @Override // oO0O000o.InterfaceC32508OooOOOo
    public final Object invoke(String str, Continuation<? super List<? extends C26439OooO0o0>> continuation) {
        return ((o0OOO0o) create(str, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x009e, code lost:
    
        if (r12 != r0) goto L7;
     */
    /* JADX WARN: Removed duplicated region for block: B:14:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00a8  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:19:0x009e -> B:7:0x001d). Please report as a decompilation issue!!! */
    @Override // oO00ooo.AbstractC32477OooO00o
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) throws o0OO000.OooOO0 {
        String str;
        Collection arrayList;
        Iterator it;
        AbstractC27907OooOo0O abstractC27907OooOo0O;
        String str2;
        String str3;
        AbstractC27907OooOo0O abstractC27907OooOo0O2;
        String str4;
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i = this.f99085OooOoOO;
        if (i == 0) {
            C32446OooOOOo.OooO0O0(obj);
            str = (String) this.f99087OooOoo0;
            ArrayList arrayListOo0o0Oo = oOo000Oo.OooOo.oo0o0Oo(100, 100, this.f99086OooOoo);
            arrayList = new ArrayList();
            it = arrayListOo0o0Oo.iterator();
            abstractC27907OooOo0O = this.f99088OooOooO;
            str2 = this.f99089OooOooo;
            if (it.hasNext()) {
            }
        } else {
            if (i != 1) {
                if (i != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                it = this.f99083OooOoO;
                arrayList = this.f99084OooOoO0;
                str4 = this.f99081OooOo;
                abstractC27907OooOo0O2 = this.f99082OooOo0o;
                str3 = (String) this.f99087OooOoo0;
                C32446OooOOOo.OooO0O0(obj);
                AbstractC27907OooOo0O abstractC27907OooOo0O3 = abstractC27907OooOo0O2;
                str2 = str4;
                abstractC27907OooOo0O = abstractC27907OooOo0O3;
                C34431OooOo0.OooOo0o(arrayList, (Iterable) obj);
                str = str3;
                if (it.hasNext()) {
                    return (List) arrayList;
                }
                C26438OooO0Oo c26438OooO0Oo = new C26438OooO0Oo((List) it.next());
                InterfaceC26441OooO0oo interfaceC26441OooO0oo = abstractC27907OooOo0O.f98682OooO0o;
                this.f99087OooOoo0 = str;
                this.f99082OooOo0o = abstractC27907OooOo0O;
                this.f99081OooOo = str2;
                this.f99084OooOoO0 = arrayList;
                this.f99083OooOoO = it;
                this.f99085OooOoOO = 1;
                Object objOooO = interfaceC26441OooO0oo.OooO(str2, str, c26438OooO0Oo, this);
                if (objOooO != enumC32485OooO00o) {
                    str3 = str;
                    obj = objOooO;
                    String str5 = str2;
                    abstractC27907OooOo0O2 = abstractC27907OooOo0O;
                    str4 = str5;
                    this.f99087OooOoo0 = str3;
                    this.f99082OooOo0o = abstractC27907OooOo0O2;
                    this.f99081OooOo = str4;
                    this.f99084OooOoO0 = arrayList;
                    this.f99083OooOoO = it;
                    this.f99085OooOoOO = 2;
                    obj = C33074OooOoO.OooO0o((C35238OooOoO) obj, "batchDeleteMeta");
                }
                return enumC32485OooO00o;
            }
            it = this.f99083OooOoO;
            arrayList = this.f99084OooOoO0;
            str4 = this.f99081OooOo;
            abstractC27907OooOo0O2 = this.f99082OooOo0o;
            str3 = (String) this.f99087OooOoo0;
            C32446OooOOOo.OooO0O0(obj);
            this.f99087OooOoo0 = str3;
            this.f99082OooOo0o = abstractC27907OooOo0O2;
            this.f99081OooOo = str4;
            this.f99084OooOoO0 = arrayList;
            this.f99083OooOoO = it;
            this.f99085OooOoOO = 2;
            obj = C33074OooOoO.OooO0o((C35238OooOoO) obj, "batchDeleteMeta");
        }
    }
}
