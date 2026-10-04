package o0OOooO0;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.coroutines.Continuation;
import o0OO000.C26444OooOOo;
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
@InterfaceC32482OooO0o0(m80622c = "com.orion.notein.data.repo.cloudsync.drive.DriveCloudSyncDataSource$runBatchMigrate$2", m80623f = "DriveCloudSyncDataSource.kt", m80624l = {1822, 1826}, m80625m = "invokeSuspend")
public final class o0OO00O extends AbstractC32476OooO implements InterfaceC32508OooOOOo<String, Continuation<? super List<? extends C26444OooOOo>>, Object> {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public String f99072OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public AbstractC27907OooOo0O f99073OooOo0o;

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public Iterator f99074OooOoO;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public Collection f99075OooOoO0;

    /* JADX INFO: renamed from: OooOoOO, reason: collision with root package name */
    public int f99076OooOoOO;

    /* JADX INFO: renamed from: OooOoo, reason: collision with root package name */
    public final /* synthetic */ ArrayList f99077OooOoo;

    /* JADX INFO: renamed from: OooOoo0, reason: collision with root package name */
    public /* synthetic */ Object f99078OooOoo0;

    /* JADX INFO: renamed from: OooOooO, reason: collision with root package name */
    public final /* synthetic */ AbstractC27907OooOo0O f99079OooOooO;

    /* JADX INFO: renamed from: OooOooo, reason: collision with root package name */
    public final /* synthetic */ String f99080OooOooo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o0OO00O(ArrayList arrayList, AbstractC27907OooOo0O abstractC27907OooOo0O, String str, Continuation continuation) {
        super(2, continuation);
        this.f99077OooOoo = arrayList;
        this.f99079OooOooO = abstractC27907OooOo0O;
        this.f99080OooOooo = str;
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
        o0OO00O o0oo00o2 = new o0OO00O(this.f99077OooOoo, this.f99079OooOooO, this.f99080OooOooo, continuation);
        o0oo00o2.f99078OooOoo0 = obj;
        return o0oo00o2;
    }

    @Override // oO0O000o.InterfaceC32508OooOOOo
    public final Object invoke(String str, Continuation<? super List<? extends C26444OooOOo>> continuation) {
        return ((o0OO00O) create(str, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
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
        int i = this.f99076OooOoOO;
        if (i == 0) {
            C32446OooOOOo.OooO0O0(obj);
            str = (String) this.f99078OooOoo0;
            ArrayList arrayListOooo00O = oOo000Oo.OooOo.Oooo00O(this.f99077OooOoo, 100);
            arrayList = new ArrayList();
            it = arrayListOooo00O.iterator();
            abstractC27907OooOo0O = this.f99079OooOooO;
            str2 = this.f99080OooOooo;
            if (it.hasNext()) {
            }
        } else {
            if (i != 1) {
                if (i != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                it = this.f99074OooOoO;
                arrayList = this.f99075OooOoO0;
                str4 = this.f99072OooOo;
                abstractC27907OooOo0O2 = this.f99073OooOo0o;
                str3 = (String) this.f99078OooOoo0;
                C32446OooOOOo.OooO0O0(obj);
                AbstractC27907OooOo0O abstractC27907OooOo0O3 = abstractC27907OooOo0O2;
                str2 = str4;
                abstractC27907OooOo0O = abstractC27907OooOo0O3;
                C34431OooOo0.OooOo0o(arrayList, (Iterable) obj);
                str = str3;
                if (it.hasNext()) {
                    return (List) arrayList;
                }
                o0OO000.OooO0o oooO0o = new o0OO000.OooO0o((List) it.next());
                InterfaceC26441OooO0oo interfaceC26441OooO0oo = abstractC27907OooOo0O.f98682OooO0o;
                this.f99078OooOoo0 = str;
                this.f99073OooOo0o = abstractC27907OooOo0O;
                this.f99072OooOo = str2;
                this.f99075OooOoO0 = arrayList;
                this.f99074OooOoO = it;
                this.f99076OooOoOO = 1;
                Object objOooO0o0 = interfaceC26441OooO0oo.OooO0o0(str2, str, oooO0o, this);
                if (objOooO0o0 != enumC32485OooO00o) {
                    str3 = str;
                    obj = objOooO0o0;
                    String str5 = str2;
                    abstractC27907OooOo0O2 = abstractC27907OooOo0O;
                    str4 = str5;
                    this.f99078OooOoo0 = str3;
                    this.f99073OooOo0o = abstractC27907OooOo0O2;
                    this.f99072OooOo = str4;
                    this.f99075OooOoO0 = arrayList;
                    this.f99074OooOoO = it;
                    this.f99076OooOoOO = 2;
                    obj = C33074OooOoO.OooO0o((C35238OooOoO) obj, "batchUpdateMeta");
                }
                return enumC32485OooO00o;
            }
            it = this.f99074OooOoO;
            arrayList = this.f99075OooOoO0;
            str4 = this.f99072OooOo;
            abstractC27907OooOo0O2 = this.f99073OooOo0o;
            str3 = (String) this.f99078OooOoo0;
            C32446OooOOOo.OooO0O0(obj);
            this.f99078OooOoo0 = str3;
            this.f99073OooOo0o = abstractC27907OooOo0O2;
            this.f99072OooOo = str4;
            this.f99075OooOoO0 = arrayList;
            this.f99074OooOoO = it;
            this.f99076OooOoOO = 2;
            obj = C33074OooOoO.OooO0o((C35238OooOoO) obj, "batchUpdateMeta");
        }
    }
}
