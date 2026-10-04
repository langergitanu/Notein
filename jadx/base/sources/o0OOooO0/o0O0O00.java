package o0OOooO0;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.coroutines.Continuation;
import o0OO000.C26440OooO0oO;
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
@InterfaceC32482OooO0o0(m80622c = "com.orion.notein.data.repo.cloudsync.drive.DriveCloudSyncDataSource$runBatchReconcile$2", m80623f = "DriveCloudSyncDataSource.kt", m80624l = {1707, 1710}, m80625m = "invokeSuspend")
public final class o0O0O00 extends AbstractC32476OooO implements InterfaceC32508OooOOOo<String, Continuation<? super List<? extends o0OO000.OooOo>>, Object> {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public Collection f99065OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public AbstractC27907OooOo0O f99066OooOo0o;

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public int f99067OooOoO;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public Iterator f99068OooOoO0;

    /* JADX INFO: renamed from: OooOoOO, reason: collision with root package name */
    public /* synthetic */ Object f99069OooOoOO;

    /* JADX INFO: renamed from: OooOoo, reason: collision with root package name */
    public final /* synthetic */ AbstractC27907OooOo0O f99070OooOoo;

    /* JADX INFO: renamed from: OooOoo0, reason: collision with root package name */
    public final /* synthetic */ ArrayList f99071OooOoo0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o0O0O00(ArrayList arrayList, AbstractC27907OooOo0O abstractC27907OooOo0O, Continuation continuation) {
        super(2, continuation);
        this.f99071OooOoo0 = arrayList;
        this.f99070OooOoo = abstractC27907OooOo0O;
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
        o0O0O00 o0o0o00 = new o0O0O00(this.f99071OooOoo0, this.f99070OooOoo, continuation);
        o0o0o00.f99069OooOoOO = obj;
        return o0o0o00;
    }

    @Override // oO0O000o.InterfaceC32508OooOOOo
    public final Object invoke(String str, Continuation<? super List<? extends o0OO000.OooOo>> continuation) {
        return ((o0O0O00) create(str, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x008e, code lost:
    
        if (r11 != r0) goto L20;
     */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0098  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:18:0x008e -> B:20:0x0091). Please report as a decompilation issue!!! */
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
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i = this.f99067OooOoO;
        if (i == 0) {
            C32446OooOOOo.OooO0O0(obj);
            str = (String) this.f99069OooOoOO;
            ArrayList arrayListOooo00O = oOo000Oo.OooOo.Oooo00O(this.f99071OooOoo0, 100);
            arrayList = new ArrayList();
            it = arrayListOooo00O.iterator();
            abstractC27907OooOo0O = this.f99070OooOoo;
            if (it.hasNext()) {
            }
        } else {
            if (i != 1) {
                if (i != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                it = this.f99068OooOoO0;
                arrayList = this.f99065OooOo;
                abstractC27907OooOo0O = this.f99066OooOo0o;
                str2 = (String) this.f99069OooOoOO;
                C32446OooOOOo.OooO0O0(obj);
                C34431OooOo0.OooOo0o(arrayList, (Iterable) obj);
                str = str2;
                if (it.hasNext()) {
                    return (List) arrayList;
                }
                C26440OooO0oO c26440OooO0oO = new C26440OooO0oO((List) it.next());
                InterfaceC26441OooO0oo interfaceC26441OooO0oo = abstractC27907OooOo0O.f98682OooO0o;
                this.f99069OooOoOO = str;
                this.f99066OooOo0o = abstractC27907OooOo0O;
                this.f99065OooOo = arrayList;
                this.f99068OooOoO0 = it;
                this.f99067OooOoO = 1;
                Object objOooOO0O = interfaceC26441OooO0oo.OooOO0O(str, c26440OooO0oO, this);
                if (objOooOO0O != enumC32485OooO00o) {
                    str2 = str;
                    obj = objOooOO0O;
                    this.f99069OooOoOO = str2;
                    this.f99066OooOo0o = abstractC27907OooOo0O;
                    this.f99065OooOo = arrayList;
                    this.f99068OooOoO0 = it;
                    this.f99067OooOoO = 2;
                    obj = C33074OooOoO.OooO0o((C35238OooOoO) obj, "batchReconcileContent");
                }
                return enumC32485OooO00o;
            }
            it = this.f99068OooOoO0;
            arrayList = this.f99065OooOo;
            abstractC27907OooOo0O = this.f99066OooOo0o;
            str2 = (String) this.f99069OooOoOO;
            C32446OooOOOo.OooO0O0(obj);
            this.f99069OooOoOO = str2;
            this.f99066OooOo0o = abstractC27907OooOo0O;
            this.f99065OooOo = arrayList;
            this.f99068OooOoO0 = it;
            this.f99067OooOoO = 2;
            obj = C33074OooOoO.OooO0o((C35238OooOoO) obj, "batchReconcileContent");
        }
    }
}
