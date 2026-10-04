package o0OO0o00;

import com.orion.notein.App;
import kotlin.coroutines.Continuation;
import o0000oOO.AbstractC24338OooO0o0;
import oO00ooO.C32446OooOOOo;
import oO00ooO.C32460OooOooO;
import oO00ooo.AbstractC32479OooO0OO;
import oO00ooo.InterfaceC32482OooO0o0;
import oO00ooo0.EnumC32485OooO00o;
import oO0o0Oo.InterfaceC33723OooO0oO;

/* JADX INFO: renamed from: o0OO0o00.Oooo0O0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C26892Oooo0O0<T> implements InterfaceC33723OooO0oO {

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final /* synthetic */ InterfaceC33723OooO0oO f93287OooOo0o;

    /* JADX INFO: renamed from: o0OO0o00.Oooo0O0$OooO00o */
    @InterfaceC32482OooO0o0(m80622c = "com.orion.notein.data.repo.cloudsync.huawei.HuaweiDriveSessionManager$getSessionId$$inlined$map$1$2", m80623f = "HuaweiDriveSessionManager.kt", m80624l = {50}, m80625m = "emit")
    public static final class OooO00o extends AbstractC32479OooO0OO {

        /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
        public int f93288OooOo;

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public /* synthetic */ Object f93289OooOo0o;

        public OooO00o(Continuation continuation) {
            super(continuation);
        }

        @Override // oO00ooo.AbstractC32477OooO00o
        public final Object invokeSuspend(Object obj) {
            this.f93289OooOo0o = obj;
            this.f93288OooOo |= Integer.MIN_VALUE;
            return C26892Oooo0O0.this.emit(null, this);
        }
    }

    public C26892Oooo0O0(InterfaceC33723OooO0oO interfaceC33723OooO0oO) {
        this.f93287OooOo0o = interfaceC33723OooO0oO;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // oO0o0Oo.InterfaceC33723OooO0oO
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object emit(Object obj, Continuation continuation) {
        OooO00o oooO00o;
        if (continuation instanceof OooO00o) {
            oooO00o = (OooO00o) continuation;
            int i = oooO00o.f93288OooOo;
            if ((i & Integer.MIN_VALUE) != 0) {
                oooO00o.f93288OooOo = i - Integer.MIN_VALUE;
            } else {
                oooO00o = new OooO00o(continuation);
            }
        }
        Object obj2 = oooO00o.f93289OooOo0o;
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i2 = oooO00o.f93288OooOo;
        if (i2 == 0) {
            C32446OooOOOo.OooO0O0(obj2);
            Object objOooO0OO = ((AbstractC24338OooO0o0) obj).OooO0OO(App.f69600o0ooOOo);
            oooO00o.f93288OooOo = 1;
            if (this.f93287OooOo0o.emit(objOooO0OO, oooO00o) == enumC32485OooO00o) {
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
