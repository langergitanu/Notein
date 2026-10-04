package o0OOO0OO;

import com.orion.notein.data.p602db.entity.PageEntity;
import com.orion.notein.domain.models.page.Page;
import kotlin.coroutines.Continuation;
import oO00ooO.C32446OooOOOo;
import oO00ooO.C32460OooOooO;
import oO00ooo.AbstractC32479OooO0OO;
import oO00ooo.InterfaceC32482OooO0o0;
import oO00ooo0.EnumC32485OooO00o;
import oO0o0Oo.C33734OooOOoo;
import oO0o0Oo.InterfaceC33721OooO0o;
import oO0o0Oo.InterfaceC33723OooO0oO;

/* JADX INFO: loaded from: classes9.dex */
public final class OooOo implements InterfaceC33721OooO0o<Page> {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final /* synthetic */ C27020OooOoO0 f94034OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final /* synthetic */ C33734OooOOoo f94035OooOo0o;

    public static final class OooO00o<T> implements InterfaceC33723OooO0oO {

        /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
        public final /* synthetic */ C27020OooOoO0 f94036OooOo;

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public final /* synthetic */ InterfaceC33723OooO0oO f94037OooOo0o;

        /* JADX INFO: renamed from: o0OOO0OO.OooOo$OooO00o$OooO00o, reason: collision with other inner class name */
        @InterfaceC32482OooO0o0(m80622c = "com.orion.notein.data.repo.page.PageRepoImpl$getPageById$$inlined$map$1$2", m80623f = "PageRepoImpl.kt", m80624l = {50}, m80625m = "emit")
        public static final class C19836OooO00o extends AbstractC32479OooO0OO {

            /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
            public int f94038OooOo;

            /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
            public /* synthetic */ Object f94039OooOo0o;

            public C19836OooO00o(Continuation continuation) {
                super(continuation);
            }

            @Override // oO00ooo.AbstractC32477OooO00o
            public final Object invokeSuspend(Object obj) {
                this.f94039OooOo0o = obj;
                this.f94038OooOo |= Integer.MIN_VALUE;
                return OooO00o.this.emit(null, this);
            }
        }

        public OooO00o(InterfaceC33723OooO0oO interfaceC33723OooO0oO, C27020OooOoO0 c27020OooOoO0) {
            this.f94037OooOo0o = interfaceC33723OooO0oO;
            this.f94036OooOo = c27020OooOoO0;
        }

        /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
        @Override // oO0o0Oo.InterfaceC33723OooO0oO
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object emit(Object obj, Continuation continuation) {
            C19836OooO00o c19836OooO00o;
            if (continuation instanceof C19836OooO00o) {
                c19836OooO00o = (C19836OooO00o) continuation;
                int i = c19836OooO00o.f94038OooOo;
                if ((i & Integer.MIN_VALUE) != 0) {
                    c19836OooO00o.f94038OooOo = i - Integer.MIN_VALUE;
                } else {
                    c19836OooO00o = new C19836OooO00o(continuation);
                }
            }
            Object obj2 = c19836OooO00o.f94039OooOo0o;
            EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
            int i2 = c19836OooO00o.f94038OooOo;
            if (i2 == 0) {
                C32446OooOOOo.OooO0O0(obj2);
                PageEntity pageEntity = (PageEntity) obj;
                Page page = pageEntity != null ? this.f94036OooOo.f94065OooO0O0.toPage(pageEntity) : null;
                c19836OooO00o.f94038OooOo = 1;
                if (this.f94037OooOo0o.emit(page, c19836OooO00o) == enumC32485OooO00o) {
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

    public OooOo(C33734OooOOoo c33734OooOOoo, C27020OooOoO0 c27020OooOoO0) {
        this.f94035OooOo0o = c33734OooOOoo;
        this.f94034OooOo = c27020OooOoO0;
    }

    @Override // oO0o0Oo.InterfaceC33721OooO0o
    public final Object collect(InterfaceC33723OooO0oO<? super Page> interfaceC33723OooO0oO, Continuation continuation) {
        Object objCollect = this.f94035OooOo0o.collect(new OooO00o(interfaceC33723OooO0oO, this.f94034OooOo), continuation);
        return objCollect == EnumC32485OooO00o.f116726OooOo0o ? objCollect : C32460OooOooO.f116667OooO00o;
    }
}
