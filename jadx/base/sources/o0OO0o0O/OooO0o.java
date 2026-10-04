package o0OO0o0O;

import com.orion.notein.domain.models.note.ColorSet;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.coroutines.Continuation;
import oO00ooO.C32446OooOOOo;
import oO00ooO.C32460OooOooO;
import oO00ooo.AbstractC32479OooO0OO;
import oO00ooo.InterfaceC32482OooO0o0;
import oO00ooo0.EnumC32485OooO00o;
import oO0o0Oo.C33716OooO;
import oO0o0Oo.InterfaceC33721OooO0o;
import oO0o0Oo.InterfaceC33723OooO0oO;
import oOo000Oo.C34428OooOOo;

/* JADX INFO: loaded from: classes9.dex */
public final class OooO0o implements InterfaceC33721OooO0o<List<? extends ColorSet>> {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final /* synthetic */ int f93473OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final /* synthetic */ C33716OooO f93474OooOo0o;

    public static final class OooO00o<T> implements InterfaceC33723OooO0oO {

        /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
        public final /* synthetic */ int f93475OooOo;

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public final /* synthetic */ InterfaceC33723OooO0oO f93476OooOo0o;

        /* JADX INFO: renamed from: o0OO0o0O.OooO0o$OooO00o$OooO00o, reason: collision with other inner class name */
        @InterfaceC32482OooO0o0(m80622c = "com.orion.notein.data.repo.colorset.ColorSetRepoImpl$getColorSetsByCategory$$inlined$map$1$2", m80623f = "ColorSetRepoImpl.kt", m80624l = {50}, m80625m = "emit")
        public static final class C19825OooO00o extends AbstractC32479OooO0OO {

            /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
            public int f93477OooOo;

            /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
            public /* synthetic */ Object f93478OooOo0o;

            public C19825OooO00o(Continuation continuation) {
                super(continuation);
            }

            @Override // oO00ooo.AbstractC32477OooO00o
            public final Object invokeSuspend(Object obj) {
                this.f93478OooOo0o = obj;
                this.f93477OooOo |= Integer.MIN_VALUE;
                return OooO00o.this.emit(null, this);
            }
        }

        public OooO00o(InterfaceC33723OooO0oO interfaceC33723OooO0oO, int i) {
            this.f93476OooOo0o = interfaceC33723OooO0oO;
            this.f93475OooOo = i;
        }

        /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
        @Override // oO0o0Oo.InterfaceC33723OooO0oO
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object emit(Object obj, Continuation continuation) {
            C19825OooO00o c19825OooO00o;
            if (continuation instanceof C19825OooO00o) {
                c19825OooO00o = (C19825OooO00o) continuation;
                int i = c19825OooO00o.f93477OooOo;
                if ((i & Integer.MIN_VALUE) != 0) {
                    c19825OooO00o.f93477OooOo = i - Integer.MIN_VALUE;
                } else {
                    c19825OooO00o = new C19825OooO00o(continuation);
                }
            }
            Object obj2 = c19825OooO00o.f93478OooOo0o;
            EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
            int i2 = c19825OooO00o.f93477OooOo;
            if (i2 == 0) {
                C32446OooOOOo.OooO0O0(obj2);
                List list = (List) obj;
                ArrayList arrayList = new ArrayList(C34428OooOOo.OooOOoo(list, 10));
                Iterator<T> it = list.iterator();
                while (it.hasNext()) {
                    arrayList.add(ColorSet.copy$default((ColorSet) it.next(), null, null, null, 0, 0, 0, 0L, this.f93475OooOo, 127, null));
                }
                c19825OooO00o.f93477OooOo = 1;
                if (this.f93476OooOo0o.emit(arrayList, c19825OooO00o) == enumC32485OooO00o) {
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

    public OooO0o(C33716OooO c33716OooO, int i) {
        this.f93474OooOo0o = c33716OooO;
        this.f93473OooOo = i;
    }

    @Override // oO0o0Oo.InterfaceC33721OooO0o
    public final Object collect(InterfaceC33723OooO0oO<? super List<? extends ColorSet>> interfaceC33723OooO0oO, Continuation continuation) {
        Object objCollect = this.f93474OooOo0o.collect(new OooO00o(interfaceC33723OooO0oO, this.f93473OooOo), continuation);
        return objCollect == EnumC32485OooO00o.f116726OooOo0o ? objCollect : C32460OooOooO.f116667OooO00o;
    }
}
