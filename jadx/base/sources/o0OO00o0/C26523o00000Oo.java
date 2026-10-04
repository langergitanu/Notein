package o0OO00o0;

import kotlin.coroutines.Continuation;
import oO00ooO.C32446OooOOOo;
import oO00ooO.C32460OooOooO;
import oO00ooo.AbstractC32479OooO0OO;
import oO00ooo.InterfaceC32482OooO0o0;
import oO00ooo0.EnumC32485OooO00o;
import oO0o0Oo.InterfaceC33723OooO0oO;

/* JADX INFO: renamed from: o0OO00o0.o00000Oo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C26523o00000Oo<T> implements InterfaceC33723OooO0oO {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final /* synthetic */ C26577o000oo0O f91250OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final /* synthetic */ InterfaceC33723OooO0oO f91251OooOo0o;

    /* JADX INFO: renamed from: o0OO00o0.o00000Oo$OooO00o */
    @InterfaceC32482OooO0o0(m80622c = "com.orion.notein.data.repo.GlobalSettingRepoImpl$getIsNightModeOpened$$inlined$map$1$2", m80623f = "GlobalSettingRepoImpl.kt", m80624l = {50}, m80625m = "emit")
    public static final class OooO00o extends AbstractC32479OooO0OO {

        /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
        public int f91252OooOo;

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public /* synthetic */ Object f91253OooOo0o;

        public OooO00o(Continuation continuation) {
            super(continuation);
        }

        @Override // oO00ooo.AbstractC32477OooO00o
        public final Object invokeSuspend(Object obj) {
            this.f91253OooOo0o = obj;
            this.f91252OooOo |= Integer.MIN_VALUE;
            return C26523o00000Oo.this.emit(null, this);
        }
    }

    public C26523o00000Oo(InterfaceC33723OooO0oO interfaceC33723OooO0oO, C26577o000oo0O c26577o000oo0O) {
        this.f91251OooOo0o = interfaceC33723OooO0oO;
        this.f91250OooOo = c26577o000oo0O;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // oO0o0Oo.InterfaceC33723OooO0oO
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object emit(Object obj, Continuation continuation) {
        OooO00o oooO00o;
        int i;
        if (continuation instanceof OooO00o) {
            oooO00o = (OooO00o) continuation;
            int i2 = oooO00o.f91252OooOo;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                oooO00o.f91252OooOo = i2 - Integer.MIN_VALUE;
            } else {
                oooO00o = new OooO00o(continuation);
            }
        }
        Object obj2 = oooO00o.f91253OooOo0o;
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i3 = oooO00o.f91252OooOo;
        if (i3 == 0) {
            C32446OooOOOo.OooO0O0(obj2);
            int iIntValue = ((Number) obj).intValue();
            boolean z = false;
            if (iIntValue == -1 ? !((i = this.f91250OooOo.f91599OooO0O0.getResources().getConfiguration().uiMode & 48) == 16 || i != 32) : iIntValue == 2) {
                z = true;
            }
            Boolean boolValueOf = Boolean.valueOf(z);
            oooO00o.f91252OooOo = 1;
            if (this.f91251OooOo0o.emit(boolValueOf, oooO00o) == enumC32485OooO00o) {
                return enumC32485OooO00o;
            }
        } else {
            if (i3 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C32446OooOOOo.OooO0O0(obj2);
        }
        return C32460OooOooO.f116667OooO00o;
    }
}
