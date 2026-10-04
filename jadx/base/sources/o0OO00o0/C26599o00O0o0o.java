package o0OO00o0;

import com.orion.notein.data.p602db.entity.LabelEntity;
import com.orion.notein.domain.models.Label;
import kotlin.coroutines.Continuation;
import oO00ooO.C32446OooOOOo;
import oO00ooO.C32460OooOooO;
import oO00ooo.AbstractC32479OooO0OO;
import oO00ooo.InterfaceC32482OooO0o0;
import oO00ooo0.EnumC32485OooO00o;
import oO0o0Oo.InterfaceC33721OooO0o;
import oO0o0Oo.InterfaceC33723OooO0oO;

/* JADX INFO: renamed from: o0OO00o0.o00O0o0o, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C26599o00O0o0o implements InterfaceC33721OooO0o<Label> {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final /* synthetic */ o00O f91737OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final /* synthetic */ InterfaceC33721OooO0o f91738OooOo0o;

    /* JADX INFO: renamed from: o0OO00o0.o00O0o0o$OooO00o */
    public static final class OooO00o<T> implements InterfaceC33723OooO0oO {

        /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
        public final /* synthetic */ o00O f91739OooOo;

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public final /* synthetic */ InterfaceC33723OooO0oO f91740OooOo0o;

        /* JADX INFO: renamed from: o0OO00o0.o00O0o0o$OooO00o$OooO00o, reason: collision with other inner class name */
        @InterfaceC32482OooO0o0(m80622c = "com.orion.notein.data.repo.LabelRepoImpl$findLabelById$$inlined$map$1$2", m80623f = "LabelRepoImpl.kt", m80624l = {50}, m80625m = "emit")
        public static final class C19793OooO00o extends AbstractC32479OooO0OO {

            /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
            public int f91741OooOo;

            /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
            public /* synthetic */ Object f91742OooOo0o;

            public C19793OooO00o(Continuation continuation) {
                super(continuation);
            }

            @Override // oO00ooo.AbstractC32477OooO00o
            public final Object invokeSuspend(Object obj) {
                this.f91742OooOo0o = obj;
                this.f91741OooOo |= Integer.MIN_VALUE;
                return OooO00o.this.emit(null, this);
            }
        }

        public OooO00o(InterfaceC33723OooO0oO interfaceC33723OooO0oO, o00O o00o2) {
            this.f91740OooOo0o = interfaceC33723OooO0oO;
            this.f91739OooOo = o00o2;
        }

        /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
        @Override // oO0o0Oo.InterfaceC33723OooO0oO
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object emit(Object obj, Continuation continuation) {
            C19793OooO00o c19793OooO00o;
            if (continuation instanceof C19793OooO00o) {
                c19793OooO00o = (C19793OooO00o) continuation;
                int i = c19793OooO00o.f91741OooOo;
                if ((i & Integer.MIN_VALUE) != 0) {
                    c19793OooO00o.f91741OooOo = i - Integer.MIN_VALUE;
                } else {
                    c19793OooO00o = new C19793OooO00o(continuation);
                }
            }
            Object obj2 = c19793OooO00o.f91742OooOo0o;
            EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
            int i2 = c19793OooO00o.f91741OooOo;
            if (i2 == 0) {
                C32446OooOOOo.OooO0O0(obj2);
                Label model = this.f91739OooOo.f91623OooO0O0.toModel((LabelEntity) obj);
                c19793OooO00o.f91741OooOo = 1;
                if (this.f91740OooOo0o.emit(model, c19793OooO00o) == enumC32485OooO00o) {
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

    public C26599o00O0o0o(InterfaceC33721OooO0o interfaceC33721OooO0o, o00O o00o2) {
        this.f91738OooOo0o = interfaceC33721OooO0o;
        this.f91737OooOo = o00o2;
    }

    @Override // oO0o0Oo.InterfaceC33721OooO0o
    public final Object collect(InterfaceC33723OooO0oO<? super Label> interfaceC33723OooO0oO, Continuation continuation) {
        Object objCollect = this.f91738OooOo0o.collect(new OooO00o(interfaceC33723OooO0oO, this.f91737OooOo), continuation);
        return objCollect == EnumC32485OooO00o.f116726OooOo0o ? objCollect : C32460OooOooO.f116667OooO00o;
    }
}
