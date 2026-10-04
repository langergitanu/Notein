package o0o0Oo0o;

import java.util.ArrayList;
import java.util.List;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.OooOOO0;
import o0oOoOo.C31036OooO0oO;
import oO00ooO.C32446OooOOOo;
import oO00ooO.C32460OooOooO;
import oO00ooo.AbstractC32479OooO0OO;
import oO00ooo.InterfaceC32482OooO0o0;
import oO00ooo0.EnumC32485OooO00o;
import oO0o0Oo.InterfaceC33723OooO0oO;
import oOo000Oo.C34428OooOOo;

/* JADX INFO: renamed from: o0o0Oo0o.OooO0o, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C30654OooO0o<T> implements InterfaceC33723OooO0oO {

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final /* synthetic */ InterfaceC33723OooO0oO f109689OooOo0o;

    /* JADX INFO: renamed from: o0o0Oo0o.OooO0o$OooO00o */
    @InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.settings.appearance.GlobalSettingsDateFormatViewModel$special$$inlined$map$1$2", m80623f = "GlobalSettingsDateFormatViewModel.kt", m80624l = {50}, m80625m = "emit")
    public static final class OooO00o extends AbstractC32479OooO0OO {

        /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
        public int f109690OooOo;

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public /* synthetic */ Object f109691OooOo0o;

        public OooO00o(Continuation continuation) {
            super(continuation);
        }

        @Override // oO00ooo.AbstractC32477OooO00o
        public final Object invokeSuspend(Object obj) {
            this.f109691OooOo0o = obj;
            this.f109690OooOo |= Integer.MIN_VALUE;
            return C30654OooO0o.this.emit(null, this);
        }
    }

    public C30654OooO0o(InterfaceC33723OooO0oO interfaceC33723OooO0oO) {
        this.f109689OooOo0o = interfaceC33723OooO0oO;
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
            int i = oooO00o.f109690OooOo;
            if ((i & Integer.MIN_VALUE) != 0) {
                oooO00o.f109690OooOo = i - Integer.MIN_VALUE;
            } else {
                oooO00o = new OooO00o(continuation);
            }
        }
        Object obj2 = oooO00o.f109691OooOo0o;
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i2 = oooO00o.f109690OooOo;
        if (i2 == 0) {
            C32446OooOOOo.OooO0O0(obj2);
            String str = (String) obj;
            List<C31036OooO0oO> list = C31036OooO0oO.f110808OooO0OO;
            ArrayList arrayList = new ArrayList(C34428OooOOo.OooOOoo(list, 10));
            for (C31036OooO0oO c31036OooO0oO : list) {
                boolean zOooO0O0 = OooOOO0.OooO0O0(c31036OooO0oO.f110809OooO00o, str);
                String format = c31036OooO0oO.f110809OooO00o;
                OooOOO0.OooO0oO(format, "format");
                arrayList.add(new C31036OooO0oO(format, zOooO0O0));
            }
            oooO00o.f109690OooOo = 1;
            if (this.f109689OooOo0o.emit(arrayList, oooO00o) == enumC32485OooO00o) {
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
