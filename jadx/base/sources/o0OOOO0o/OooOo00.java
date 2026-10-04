package o0OOOO0o;

import com.orion.notein.data.p602db.entity.NoteinFirebaseUserEntity;
import com.orion.notein.domain.models.NoteinFirebaseUser;
import kotlin.coroutines.Continuation;
import o0OOOO.C27078OooO0o0;
import oO00ooO.C32446OooOOOo;
import oO00ooO.C32460OooOooO;
import oO00ooo.AbstractC32479OooO0OO;
import oO00ooo.InterfaceC32482OooO0o0;
import oO00ooo0.EnumC32485OooO00o;
import oO0o0Oo.InterfaceC33721OooO0o;
import oO0o0Oo.InterfaceC33723OooO0oO;

/* JADX INFO: loaded from: classes9.dex */
public final class OooOo00 implements InterfaceC33721OooO0o<NoteinFirebaseUser> {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final /* synthetic */ C27111OooOoo f94488OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final /* synthetic */ C27078OooO0o0 f94489OooOo0o;

    public static final class OooO00o<T> implements InterfaceC33723OooO0oO {

        /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
        public final /* synthetic */ C27111OooOoo f94490OooOo;

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public final /* synthetic */ InterfaceC33723OooO0oO f94491OooOo0o;

        /* JADX INFO: renamed from: o0OOOO0o.OooOo00$OooO00o$OooO00o, reason: collision with other inner class name */
        @InterfaceC32482OooO0o0(m80622c = "com.orion.notein.data.repo.user.NoteinFirebaseUserRepoImpl$getLoggedUser$$inlined$map$1$2", m80623f = "NoteinFirebaseUserRepoImpl.kt", m80624l = {50}, m80625m = "emit")
        public static final class C19846OooO00o extends AbstractC32479OooO0OO {

            /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
            public int f94492OooOo;

            /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
            public /* synthetic */ Object f94493OooOo0o;

            public C19846OooO00o(Continuation continuation) {
                super(continuation);
            }

            @Override // oO00ooo.AbstractC32477OooO00o
            public final Object invokeSuspend(Object obj) {
                this.f94493OooOo0o = obj;
                this.f94492OooOo |= Integer.MIN_VALUE;
                return OooO00o.this.emit(null, this);
            }
        }

        public OooO00o(InterfaceC33723OooO0oO interfaceC33723OooO0oO, C27111OooOoo c27111OooOoo) {
            this.f94491OooOo0o = interfaceC33723OooO0oO;
            this.f94490OooOo = c27111OooOoo;
        }

        /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
        @Override // oO0o0Oo.InterfaceC33723OooO0oO
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object emit(Object obj, Continuation continuation) {
            C19846OooO00o c19846OooO00o;
            if (continuation instanceof C19846OooO00o) {
                c19846OooO00o = (C19846OooO00o) continuation;
                int i = c19846OooO00o.f94492OooOo;
                if ((i & Integer.MIN_VALUE) != 0) {
                    c19846OooO00o.f94492OooOo = i - Integer.MIN_VALUE;
                } else {
                    c19846OooO00o = new C19846OooO00o(continuation);
                }
            }
            Object obj2 = c19846OooO00o.f94493OooOo0o;
            EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
            int i2 = c19846OooO00o.f94492OooOo;
            if (i2 == 0) {
                C32446OooOOOo.OooO0O0(obj2);
                NoteinFirebaseUserEntity noteinFirebaseUserEntity = (NoteinFirebaseUserEntity) obj;
                NoteinFirebaseUser model = noteinFirebaseUserEntity != null ? this.f94490OooOo.f94518OooO0Oo.toModel(noteinFirebaseUserEntity) : null;
                c19846OooO00o.f94492OooOo = 1;
                if (this.f94491OooOo0o.emit(model, c19846OooO00o) == enumC32485OooO00o) {
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

    public OooOo00(C27078OooO0o0 c27078OooO0o0, C27111OooOoo c27111OooOoo) {
        this.f94489OooOo0o = c27078OooO0o0;
        this.f94488OooOo = c27111OooOoo;
    }

    @Override // oO0o0Oo.InterfaceC33721OooO0o
    public final Object collect(InterfaceC33723OooO0oO<? super NoteinFirebaseUser> interfaceC33723OooO0oO, Continuation continuation) {
        Object objCollect = this.f94489OooOo0o.collect(new OooO00o(interfaceC33723OooO0oO, this.f94488OooOo), continuation);
        return objCollect == EnumC32485OooO00o.f116726OooOo0o ? objCollect : C32460OooOooO.f116667OooO00o;
    }
}
