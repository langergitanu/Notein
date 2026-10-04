package o0OO0ooo;

import com.orion.notein.data.p602db.entity.NoteinMessageEntity;
import com.orion.notein.domain.models.message.NoteinMessage;
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

/* JADX INFO: renamed from: o0OO0ooo.OooO0OO, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C26976OooO0OO implements InterfaceC33721OooO0o<List<? extends NoteinMessage>> {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final /* synthetic */ C26979OooO0o0 f93714OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final /* synthetic */ InterfaceC33721OooO0o f93715OooOo0o;

    /* JADX INFO: renamed from: o0OO0ooo.OooO0OO$OooO00o */
    public static final class OooO00o<T> implements InterfaceC33723OooO0oO {

        /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
        public final /* synthetic */ C26979OooO0o0 f93716OooOo;

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public final /* synthetic */ InterfaceC33723OooO0oO f93717OooOo0o;

        /* JADX INFO: renamed from: o0OO0ooo.OooO0OO$OooO00o$OooO00o, reason: collision with other inner class name */
        @InterfaceC32482OooO0o0(m80622c = "com.orion.notein.data.repo.message.NoteinMessageLocalDataSource$getMessagesByUser$$inlined$map$1$2", m80623f = "NoteinMessageLocalDataSource.kt", m80624l = {50}, m80625m = "emit")
        public static final class C19827OooO00o extends AbstractC32479OooO0OO {

            /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
            public int f93718OooOo;

            /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
            public /* synthetic */ Object f93719OooOo0o;

            public C19827OooO00o(Continuation continuation) {
                super(continuation);
            }

            @Override // oO00ooo.AbstractC32477OooO00o
            public final Object invokeSuspend(Object obj) {
                this.f93719OooOo0o = obj;
                this.f93718OooOo |= Integer.MIN_VALUE;
                return OooO00o.this.emit(null, this);
            }
        }

        public OooO00o(InterfaceC33723OooO0oO interfaceC33723OooO0oO, C26979OooO0o0 c26979OooO0o0) {
            this.f93717OooOo0o = interfaceC33723OooO0oO;
            this.f93716OooOo = c26979OooO0o0;
        }

        /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
        @Override // oO0o0Oo.InterfaceC33723OooO0oO
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object emit(Object obj, Continuation continuation) {
            C19827OooO00o c19827OooO00o;
            if (continuation instanceof C19827OooO00o) {
                c19827OooO00o = (C19827OooO00o) continuation;
                int i = c19827OooO00o.f93718OooOo;
                if ((i & Integer.MIN_VALUE) != 0) {
                    c19827OooO00o.f93718OooOo = i - Integer.MIN_VALUE;
                } else {
                    c19827OooO00o = new C19827OooO00o(continuation);
                }
            }
            Object obj2 = c19827OooO00o.f93719OooOo0o;
            EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
            int i2 = c19827OooO00o.f93718OooOo;
            if (i2 == 0) {
                C32446OooOOOo.OooO0O0(obj2);
                List list = (List) obj;
                ArrayList arrayList = new ArrayList(C34428OooOOo.OooOOoo(list, 10));
                Iterator<T> it = list.iterator();
                while (it.hasNext()) {
                    arrayList.add(this.f93716OooOo.f93730OooO0O0.toNoteinMessage((NoteinMessageEntity) it.next()));
                }
                c19827OooO00o.f93718OooOo = 1;
                if (this.f93717OooOo0o.emit(arrayList, c19827OooO00o) == enumC32485OooO00o) {
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

    public C26976OooO0OO(InterfaceC33721OooO0o interfaceC33721OooO0o, C26979OooO0o0 c26979OooO0o0) {
        this.f93715OooOo0o = interfaceC33721OooO0o;
        this.f93714OooOo = c26979OooO0o0;
    }

    @Override // oO0o0Oo.InterfaceC33721OooO0o
    public final Object collect(InterfaceC33723OooO0oO<? super List<? extends NoteinMessage>> interfaceC33723OooO0oO, Continuation continuation) {
        Object objCollect = this.f93715OooOo0o.collect(new OooO00o(interfaceC33723OooO0oO, this.f93714OooOo), continuation);
        return objCollect == EnumC32485OooO00o.f116726OooOo0o ? objCollect : C32460OooOooO.f116667OooO00o;
    }
}
