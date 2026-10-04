package o0000o0O;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.coroutines.Continuation;
import oO00ooO.C32446OooOOOo;
import oO00ooO.C32460OooOooO;
import oO00ooo.AbstractC32476OooO;
import oO00ooo.InterfaceC32482OooO0o0;
import oO00ooo0.EnumC32485OooO00o;
import oO0O000o.InterfaceC32507OooOO0o;
import oO0O000o.InterfaceC32508OooOOOo;

/* JADX INFO: loaded from: classes.dex */
@InterfaceC32482OooO0o0(m80622c = "androidx.datastore.core.DataMigrationInitializer$Companion$runMigrations$2", m80623f = "DataMigrationInitializer.kt", m80624l = {44, 46}, m80625m = "invokeSuspend")
public final class OooO extends AbstractC32476OooO implements InterfaceC32508OooOOOo<Object, Continuation<Object>, Object> {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public OooO0o f81519OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public Iterator f81520OooOo0o;

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public int f81521OooOoO;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public Object f81522OooOoO0;

    /* JADX INFO: renamed from: OooOoOO, reason: collision with root package name */
    public /* synthetic */ Object f81523OooOoOO;

    /* JADX INFO: renamed from: OooOoo, reason: collision with root package name */
    public final /* synthetic */ ArrayList f81524OooOoo;

    /* JADX INFO: renamed from: OooOoo0, reason: collision with root package name */
    public final /* synthetic */ List<OooO0o<Object>> f81525OooOoo0;

    @InterfaceC32482OooO0o0(m80622c = "androidx.datastore.core.DataMigrationInitializer$Companion$runMigrations$2$1$1", m80623f = "DataMigrationInitializer.kt", m80624l = {45}, m80625m = "invokeSuspend")
    public static final class OooO00o extends AbstractC32476OooO implements InterfaceC32507OooOO0o<Continuation<? super C32460OooOooO>, Object> {

        /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
        public final /* synthetic */ OooO0o<Object> f81526OooOo;

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public int f81527OooOo0o;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO00o(OooO0o<Object> oooO0o, Continuation<? super OooO00o> continuation) {
            super(1, continuation);
            this.f81526OooOo = oooO0o;
        }

        @Override // oO00ooo.AbstractC32477OooO00o
        public final Continuation<C32460OooOooO> create(Continuation<?> continuation) {
            return new OooO00o(this.f81526OooOo, continuation);
        }

        @Override // oO0O000o.InterfaceC32507OooOO0o
        public final Object invoke(Continuation<? super C32460OooOooO> continuation) {
            return ((OooO00o) create(continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
        }

        @Override // oO00ooo.AbstractC32477OooO00o
        public final Object invokeSuspend(Object obj) {
            EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
            int i = this.f81527OooOo0o;
            if (i == 0) {
                C32446OooOOOo.OooO0O0(obj);
                this.f81527OooOo0o = 1;
                if (this.f81526OooOo.cleanUp() == enumC32485OooO00o) {
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

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OooO(List list, ArrayList arrayList, Continuation continuation) {
        super(2, continuation);
        this.f81525OooOoo0 = list;
        this.f81524OooOoo = arrayList;
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
        OooO oooO = new OooO(this.f81525OooOoo0, this.f81524OooOoo, continuation);
        oooO.f81523OooOoOO = obj;
        return oooO;
    }

    @Override // oO0O000o.InterfaceC32508OooOOOo
    public final Object invoke(Object obj, Continuation<Object> continuation) {
        return ((OooO) create(obj, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0044  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0086 A[RETURN] */
    @Override // oO00ooo.AbstractC32477OooO00o
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Iterator it;
        List list;
        OooO0o oooO0o;
        Iterator it2;
        Object obj2;
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i = this.f81521OooOoO;
        if (i == 0) {
            C32446OooOOOo.OooO0O0(obj);
            obj = this.f81523OooOoOO;
            it = this.f81525OooOoo0.iterator();
            list = this.f81524OooOoo;
        } else if (i == 1) {
            obj2 = this.f81522OooOoO0;
            OooO0o oooO0o2 = this.f81519OooOo;
            it2 = this.f81520OooOo0o;
            List list2 = (List) this.f81523OooOoOO;
            C32446OooOOOo.OooO0O0(obj);
            oooO0o = oooO0o2;
            list = list2;
            if (!((Boolean) obj).booleanValue()) {
                list.add(new OooO00o(oooO0o, null));
                this.f81523OooOoOO = list;
                this.f81520OooOo0o = it2;
                this.f81519OooOo = null;
                this.f81522OooOoO0 = null;
                this.f81521OooOoO = 2;
                obj = oooO0o.OooO0O0(obj2, this);
                if (obj != enumC32485OooO00o) {
                    it = it2;
                }
                return enumC32485OooO00o;
            }
            obj = obj2;
            it = it2;
        } else {
            if (i != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            it = this.f81520OooOo0o;
            list = (List) this.f81523OooOoOO;
            C32446OooOOOo.OooO0O0(obj);
        }
        if (!it.hasNext()) {
            OooO0o oooO0o3 = (OooO0o) it.next();
            this.f81523OooOoOO = list;
            this.f81520OooOo0o = it;
            this.f81519OooOo = oooO0o3;
            this.f81522OooOoO0 = obj;
            this.f81521OooOoO = 1;
            Object objOooO00o = oooO0o3.OooO00o(obj, this);
            if (objOooO00o != enumC32485OooO00o) {
                Iterator it3 = it;
                obj2 = obj;
                obj = objOooO00o;
                oooO0o = oooO0o3;
                it2 = it3;
                if (!((Boolean) obj).booleanValue()) {
                }
                if (!it.hasNext()) {
                    return obj;
                }
            }
            return enumC32485OooO00o;
        }
    }
}
