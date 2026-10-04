package o0OOOO0o;

import com.orion.notein.data.p602db.entity.UserEntity;
import com.orion.notein.domain.mapper.UserMapper;
import com.orion.notein.domain.models.User;
import kotlin.coroutines.Continuation;
import o00Ooo.C25086OooOo0O;
import oO00ooO.C32446OooOOOo;
import oO00ooO.C32460OooOooO;
import oO00ooo.AbstractC32479OooO0OO;
import oO00ooo.InterfaceC32482OooO0o0;
import oO00ooo0.EnumC32485OooO00o;
import oO0o0Oo.InterfaceC33721OooO0o;
import oO0o0Oo.InterfaceC33723OooO0oO;

/* JADX INFO: renamed from: o0OOOO0o.OooOooO, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C27113OooOooO implements InterfaceC33721OooO0o<User> {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final /* synthetic */ C25086OooOo0O f94522OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final /* synthetic */ InterfaceC33721OooO0o f94523OooOo0o;

    /* JADX INFO: renamed from: o0OOOO0o.OooOooO$OooO00o */
    public static final class OooO00o<T> implements InterfaceC33723OooO0oO {

        /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
        public final /* synthetic */ C25086OooOo0O f94524OooOo;

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public final /* synthetic */ InterfaceC33723OooO0oO f94525OooOo0o;

        /* JADX INFO: renamed from: o0OOOO0o.OooOooO$OooO00o$OooO00o, reason: collision with other inner class name */
        @InterfaceC32482OooO0o0(m80622c = "com.orion.notein.data.repo.user.UserLocalDataSource$getUser$$inlined$map$1$2", m80623f = "UserLocalDataSource.kt", m80624l = {50}, m80625m = "emit")
        public static final class C19848OooO00o extends AbstractC32479OooO0OO {

            /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
            public int f94526OooOo;

            /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
            public /* synthetic */ Object f94527OooOo0o;

            public C19848OooO00o(Continuation continuation) {
                super(continuation);
            }

            @Override // oO00ooo.AbstractC32477OooO00o
            public final Object invokeSuspend(Object obj) {
                this.f94527OooOo0o = obj;
                this.f94526OooOo |= Integer.MIN_VALUE;
                return OooO00o.this.emit(null, this);
            }
        }

        public OooO00o(InterfaceC33723OooO0oO interfaceC33723OooO0oO, C25086OooOo0O c25086OooOo0O) {
            this.f94525OooOo0o = interfaceC33723OooO0oO;
            this.f94524OooOo = c25086OooOo0O;
        }

        /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
        @Override // oO0o0Oo.InterfaceC33723OooO0oO
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object emit(Object obj, Continuation continuation) {
            C19848OooO00o c19848OooO00o;
            if (continuation instanceof C19848OooO00o) {
                c19848OooO00o = (C19848OooO00o) continuation;
                int i = c19848OooO00o.f94526OooOo;
                if ((i & Integer.MIN_VALUE) != 0) {
                    c19848OooO00o.f94526OooOo = i - Integer.MIN_VALUE;
                } else {
                    c19848OooO00o = new C19848OooO00o(continuation);
                }
            }
            Object obj2 = c19848OooO00o.f94527OooOo0o;
            EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
            int i2 = c19848OooO00o.f94526OooOo;
            if (i2 == 0) {
                C32446OooOOOo.OooO0O0(obj2);
                User user = ((UserMapper) this.f94524OooOo.f85156OooO0O0).toUser((UserEntity) obj);
                c19848OooO00o.f94526OooOo = 1;
                if (this.f94525OooOo0o.emit(user, c19848OooO00o) == enumC32485OooO00o) {
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

    public C27113OooOooO(InterfaceC33721OooO0o interfaceC33721OooO0o, C25086OooOo0O c25086OooOo0O) {
        this.f94523OooOo0o = interfaceC33721OooO0o;
        this.f94522OooOo = c25086OooOo0O;
    }

    @Override // oO0o0Oo.InterfaceC33721OooO0o
    public final Object collect(InterfaceC33723OooO0oO<? super User> interfaceC33723OooO0oO, Continuation continuation) {
        Object objCollect = this.f94523OooOo0o.collect(new OooO00o(interfaceC33723OooO0oO, this.f94522OooOo), continuation);
        return objCollect == EnumC32485OooO00o.f116726OooOo0o ? objCollect : C32460OooOooO.f116667OooO00o;
    }
}
