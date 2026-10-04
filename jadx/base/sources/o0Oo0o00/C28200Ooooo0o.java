package o0Oo0o00;

import java.util.Map;
import kotlin.coroutines.Continuation;
import oO00ooO.C32446OooOOOo;
import oO00ooO.C32460OooOooO;
import oO00ooo.AbstractC32479OooO0OO;
import oO00ooo.InterfaceC32482OooO0o0;
import oO00ooo0.EnumC32485OooO00o;
import oO0o0Oo.InterfaceC33723OooO0oO;

/* JADX INFO: renamed from: o0Oo0o00.Ooooo0o, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C28200Ooooo0o<T> implements InterfaceC33723OooO0oO {

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final /* synthetic */ InterfaceC33723OooO0oO f99931OooOo0o;

    /* JADX INFO: renamed from: o0Oo0o00.Ooooo0o$OooO00o */
    @InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.datasync.CloudSyncViewModel$3$invokeSuspend$$inlined$filter$1$2", m80623f = "CloudSyncViewModel.kt", m80624l = {50}, m80625m = "emit")
    public static final class OooO00o extends AbstractC32479OooO0OO {

        /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
        public int f99932OooOo;

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public /* synthetic */ Object f99933OooOo0o;

        public OooO00o(Continuation continuation) {
            super(continuation);
        }

        @Override // oO00ooo.AbstractC32477OooO00o
        public final Object invokeSuspend(Object obj) {
            this.f99933OooOo0o = obj;
            this.f99932OooOo |= Integer.MIN_VALUE;
            return C28200Ooooo0o.this.emit(null, this);
        }
    }

    public C28200Ooooo0o(InterfaceC33723OooO0oO interfaceC33723OooO0oO) {
        this.f99931OooOo0o = interfaceC33723OooO0oO;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // oO0o0Oo.InterfaceC33723OooO0oO
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object emit(Object obj, Continuation continuation) {
        OooO00o oooO00o;
        if (continuation instanceof OooO00o) {
            oooO00o = (OooO00o) continuation;
            int i = oooO00o.f99932OooOo;
            if ((i & Integer.MIN_VALUE) != 0) {
                oooO00o.f99932OooOo = i - Integer.MIN_VALUE;
            } else {
                oooO00o = new OooO00o(continuation);
            }
        }
        Object obj2 = oooO00o.f99933OooOo0o;
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i2 = oooO00o.f99932OooOo;
        if (i2 == 0) {
            C32446OooOOOo.OooO0O0(obj2);
            if (!((Map) obj).isEmpty()) {
                oooO00o.f99932OooOo = 1;
                if (this.f99931OooOo0o.emit(obj, oooO00o) == enumC32485OooO00o) {
                    return enumC32485OooO00o;
                }
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
