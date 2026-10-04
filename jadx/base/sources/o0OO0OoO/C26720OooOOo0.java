package o0OO0OoO;

import com.orion.notein.data.p602db.entity.cloudsync.CloudMetaLocalEntity;
import com.orion.notein.domain.models.cloudsync.CloudMetaLocal;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.coroutines.Continuation;
import oO00ooO.C32446OooOOOo;
import oO00ooO.C32460OooOooO;
import oO00ooo.AbstractC32479OooO0OO;
import oO00ooo.InterfaceC32482OooO0o0;
import oO00ooo0.EnumC32485OooO00o;
import oO0o0Oo.InterfaceC33721OooO0o;
import oO0o0Oo.InterfaceC33723OooO0oO;
import oOo000Oo.C34428OooOOo;

/* JADX INFO: renamed from: o0OO0OoO.OooOOo0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C26720OooOOo0 implements InterfaceC33721OooO0o<List<? extends CloudMetaLocal>> {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final /* synthetic */ C26740Oooo0oo f92380OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final /* synthetic */ InterfaceC33721OooO0o f92381OooOo0o;

    /* JADX INFO: renamed from: o0OO0OoO.OooOOo0$OooO00o */
    public static final class OooO00o<T> implements InterfaceC33723OooO0oO {

        /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
        public final /* synthetic */ C26740Oooo0oo f92382OooOo;

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public final /* synthetic */ InterfaceC33723OooO0oO f92383OooOo0o;

        /* JADX INFO: renamed from: o0OO0OoO.OooOOo0$OooO00o$OooO00o, reason: collision with other inner class name */
        @InterfaceC32482OooO0o0(m80622c = "com.orion.notein.data.repo.cloudsync.CloudSyncRepoImpl$getAllCloudMetaLocalsFlow$lambda$15$$inlined$map$1$2", m80623f = "CloudSyncRepoImpl.kt", m80624l = {50}, m80625m = "emit")
        public static final class C19810OooO00o extends AbstractC32479OooO0OO {

            /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
            public int f92384OooOo;

            /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
            public /* synthetic */ Object f92385OooOo0o;

            public C19810OooO00o(Continuation continuation) {
                super(continuation);
            }

            @Override // oO00ooo.AbstractC32477OooO00o
            public final Object invokeSuspend(Object obj) {
                this.f92385OooOo0o = obj;
                this.f92384OooOo |= Integer.MIN_VALUE;
                return OooO00o.this.emit(null, this);
            }
        }

        public OooO00o(InterfaceC33723OooO0oO interfaceC33723OooO0oO, C26740Oooo0oo c26740Oooo0oo) {
            this.f92383OooOo0o = interfaceC33723OooO0oO;
            this.f92382OooOo = c26740Oooo0oo;
        }

        /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
        @Override // oO0o0Oo.InterfaceC33723OooO0oO
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object emit(Object obj, Continuation continuation) {
            C19810OooO00o c19810OooO00o;
            if (continuation instanceof C19810OooO00o) {
                c19810OooO00o = (C19810OooO00o) continuation;
                int i = c19810OooO00o.f92384OooOo;
                if ((i & Integer.MIN_VALUE) != 0) {
                    c19810OooO00o.f92384OooOo = i - Integer.MIN_VALUE;
                } else {
                    c19810OooO00o = new C19810OooO00o(continuation);
                }
            }
            Object obj2 = c19810OooO00o.f92385OooOo0o;
            EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
            int i2 = c19810OooO00o.f92384OooOo;
            if (i2 == 0) {
                C32446OooOOOo.OooO0O0(obj2);
                List list = (List) obj;
                ArrayList arrayList = new ArrayList(C34428OooOOo.OooOOoo(list, 10));
                Iterator<T> it = list.iterator();
                while (it.hasNext()) {
                    arrayList.add(this.f92382OooOo.f92493OooO0O0.toLocalDomain((CloudMetaLocalEntity) it.next()));
                }
                c19810OooO00o.f92384OooOo = 1;
                if (this.f92383OooOo0o.emit(arrayList, c19810OooO00o) == enumC32485OooO00o) {
                    return enumC32485OooO00o;
                }
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C32446OooOOOo.OooO0O0(obj2);
            }
            return C32460OooOooO.f116667OooO00o;
        }
    }

    public C26720OooOOo0(InterfaceC33721OooO0o interfaceC33721OooO0o, C26740Oooo0oo c26740Oooo0oo) {
        this.f92381OooOo0o = interfaceC33721OooO0o;
        this.f92380OooOo = c26740Oooo0oo;
    }

    @Override // oO0o0Oo.InterfaceC33721OooO0o
    public final Object collect(InterfaceC33723OooO0oO<? super List<? extends CloudMetaLocal>> interfaceC33723OooO0oO, Continuation continuation) {
        Object objCollect = this.f92381OooOo0o.collect(new OooO00o(interfaceC33723OooO0oO, this.f92380OooOo), continuation);
        return objCollect == EnumC32485OooO00o.f116726OooOo0o ? objCollect : C32460OooOooO.f116667OooO00o;
    }
}
