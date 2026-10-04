package o0Oo0o00;

import com.orion.notein.domain.models.cloudsync.CloudSyncError;
import java.util.Set;
import kotlin.coroutines.Continuation;
import oO00ooO.C32446OooOOOo;
import oO00ooO.C32460OooOooO;
import oO00ooo.AbstractC32476OooO;
import oO00ooo.AbstractC32479OooO0OO;
import oO00ooo.InterfaceC32482OooO0o0;
import oO00ooo0.EnumC32485OooO00o;
import oO0O000o.InterfaceC32508OooOOOo;
import oO0o0OO.InterfaceC33636Oooo00o;
import oO0o0Oo.C33772OooooOo;
import oO0o0Oo.C33781o00o0O;
import oO0o0Oo.InterfaceC33723OooO0oO;
import oOo000Oo.C34449Oooo0oo;

/* JADX INFO: renamed from: o0Oo0o00.OoooOoO, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
@InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.datasync.CloudSyncViewModel$1", m80623f = "CloudSyncViewModel.kt", m80624l = {179}, m80625m = "invokeSuspend")
public final class C28197OoooOoO extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super C32460OooOooO>, Object> {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final /* synthetic */ C28201OooooO0 f99917OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public int f99918OooOo0o;

    /* JADX INFO: renamed from: o0Oo0o00.OoooOoO$OooO00o */
    public static final class OooO00o<T> implements InterfaceC33723OooO0oO {

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public final /* synthetic */ C28201OooooO0 f99919OooOo0o;

        /* JADX INFO: renamed from: o0Oo0o00.OoooOoO$OooO00o$OooO00o, reason: collision with other inner class name */
        @InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.datasync.CloudSyncViewModel$1$1", m80623f = "CloudSyncViewModel.kt", m80624l = {192}, m80625m = "emit")
        public static final class C19895OooO00o extends AbstractC32479OooO0OO {

            /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
            public String f99920OooOo;

            /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
            public OooO00o f99921OooOo0o;

            /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
            public final /* synthetic */ OooO00o<T> f99922OooOoO;

            /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
            public /* synthetic */ Object f99923OooOoO0;

            /* JADX INFO: renamed from: OooOoOO, reason: collision with root package name */
            public int f99924OooOoOO;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public C19895OooO00o(OooO00o<? super T> oooO00o, Continuation<? super C19895OooO00o> continuation) {
                super(continuation);
                this.f99922OooOoO = oooO00o;
            }

            @Override // oO00ooo.AbstractC32477OooO00o
            public final Object invokeSuspend(Object obj) {
                this.f99923OooOoO0 = obj;
                this.f99924OooOoOO |= Integer.MIN_VALUE;
                return this.f99922OooOoO.emit(null, this);
            }
        }

        public OooO00o(C28201OooooO0 c28201OooooO0) {
            this.f99919OooOo0o = c28201OooooO0;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
        /* JADX WARN: Type inference failed for: r7v12, types: [java.lang.Object, java.util.Map] */
        @Override // oO0o0Oo.InterfaceC33723OooO0oO
        /* JADX INFO: renamed from: OooO00o, reason: merged with bridge method [inline-methods] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object emit(CloudSyncError cloudSyncError, Continuation<? super C32460OooOooO> continuation) {
            C19895OooO00o c19895OooO00o;
            String errorCode;
            OooO00o<T> oooO00o;
            Object value;
            if (continuation instanceof C19895OooO00o) {
                c19895OooO00o = (C19895OooO00o) continuation;
                int i = c19895OooO00o.f99924OooOoOO;
                if ((i & Integer.MIN_VALUE) != 0) {
                    c19895OooO00o.f99924OooOoOO = i - Integer.MIN_VALUE;
                } else {
                    c19895OooO00o = new C19895OooO00o(this, continuation);
                }
            }
            Object obj = c19895OooO00o.f99923OooOoO0;
            EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
            int i2 = c19895OooO00o.f99924OooOoOO;
            if (i2 == 0) {
                C32446OooOOOo.OooO0O0(obj);
                errorCode = cloudSyncError.getErrorCode();
                boolean zOooO0O0 = kotlin.jvm.internal.OooOOO0.OooO0O0(errorCode, CloudSyncError.CODE_HW_COMPONENT_NOT_AVAILABLE);
                C28201OooooO0 c28201OooooO0 = this.f99919OooOo0o;
                if (zOooO0O0) {
                    c28201OooooO0.f99958OooOoOO.add(CloudSyncError.CODE_AUTH_EXPIRED);
                }
                if (kotlin.jvm.internal.OooOOO0.OooO0O0(errorCode, CloudSyncError.CODE_NETWORK)) {
                    return C32460OooOooO.f116667OooO00o;
                }
                if (c28201OooooO0.f99958OooOoOO.add(errorCode)) {
                    C33772OooooOo c33772OooooOo = c28201OooooO0.f99960OooOoo0;
                    c19895OooO00o.f99921OooOo0o = this;
                    c19895OooO00o.f99920OooOo = errorCode;
                    c19895OooO00o.f99924OooOoOO = 1;
                    if (c33772OooooOo.emit(errorCode, c19895OooO00o) == enumC32485OooO00o) {
                        return enumC32485OooO00o;
                    }
                }
                oooO00o = this;
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                errorCode = c19895OooO00o.f99920OooOo;
                oooO00o = c19895OooO00o.f99921OooOo0o;
                C32446OooOOOo.OooO0O0(obj);
            }
            if (oooO00o.f99919OooOo0o.f99961OooOooO.containsKey(errorCode)) {
                C33781o00o0O c33781o00o0O = oooO00o.f99919OooOo0o.f99956OooOoO;
                do {
                    value = c33781o00o0O.getValue();
                } while (!c33781o00o0O.OooO(value, C34449Oooo0oo.OooO((Set) value, errorCode)));
            }
            return C32460OooOooO.f116667OooO00o;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C28197OoooOoO(C28201OooooO0 c28201OooooO0, Continuation<? super C28197OoooOoO> continuation) {
        super(2, continuation);
        this.f99917OooOo = c28201OooooO0;
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
        return new C28197OoooOoO(this.f99917OooOo, continuation);
    }

    @Override // oO0O000o.InterfaceC32508OooOOOo
    public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super C32460OooOooO> continuation) {
        ((C28197OoooOoO) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
        return EnumC32485OooO00o.f116726OooOo0o;
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Object invokeSuspend(Object obj) {
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i = this.f99918OooOo0o;
        if (i != 0) {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            throw androidx.transition.OooOOOO.OooO0O0(obj);
        }
        C32446OooOOOo.OooO0O0(obj);
        C28201OooooO0 c28201OooooO0 = this.f99917OooOo;
        C33772OooooOo c33772OooooOo = c28201OooooO0.f99941OooOO0.f97533OooO0O0;
        OooO00o oooO00o = new OooO00o(c28201OooooO0);
        this.f99918OooOo0o = 1;
        c33772OooooOo.collect(oooO00o, this);
        return enumC32485OooO00o;
    }
}
