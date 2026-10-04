package o000oo0;

import java.util.Iterator;
import java.util.Set;
import kotlin.coroutines.Continuation;
import oO00ooO.C32446OooOOOo;
import oO00ooO.C32460OooOooO;
import oO00ooOO.C32463OooO;
import oO00ooo.AbstractC32479OooO0OO;
import oO00ooo.InterfaceC32482OooO0o0;
import oO00ooo0.EnumC32485OooO00o;
import oO0o0O0o.C33595OooOOo;
import oO0o0Oo.InterfaceC33723OooO0oO;
import oOo000Oo.C34449Oooo0oo;

/* JADX INFO: renamed from: o000oo0.OooOO0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C24663OooOO0<T> implements InterfaceC33723OooO0oO {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final /* synthetic */ String[] f83543OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final /* synthetic */ InterfaceC33723OooO0oO f83544OooOo0o;

    /* JADX INFO: renamed from: o000oo0.OooOO0$OooO00o */
    @InterfaceC32482OooO0o0(m80622c = "androidx.room.MultiInstanceInvalidationClient$createFlow$$inlined$mapNotNull$1$2", m80623f = "MultiInstanceInvalidationClient.android.kt", m80624l = {239}, m80625m = "emit")
    public static final class OooO00o extends AbstractC32479OooO0OO {

        /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
        public int f83545OooOo;

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public /* synthetic */ Object f83546OooOo0o;

        public OooO00o(Continuation continuation) {
            super(continuation);
        }

        @Override // oO00ooo.AbstractC32477OooO00o
        public final Object invokeSuspend(Object obj) {
            this.f83546OooOo0o = obj;
            this.f83545OooOo |= Integer.MIN_VALUE;
            return C24663OooOO0.this.emit(null, this);
        }
    }

    public C24663OooOO0(InterfaceC33723OooO0oO interfaceC33723OooO0oO, String[] strArr) {
        this.f83544OooOo0o = interfaceC33723OooO0oO;
        this.f83543OooOo = strArr;
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
            int i = oooO00o.f83545OooOo;
            if ((i & Integer.MIN_VALUE) != 0) {
                oooO00o.f83545OooOo = i - Integer.MIN_VALUE;
            } else {
                oooO00o = new OooO00o(continuation);
            }
        }
        Object obj2 = oooO00o.f83546OooOo0o;
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i2 = oooO00o.f83545OooOo;
        if (i2 == 0) {
            C32446OooOOOo.OooO0O0(obj2);
            Set set = (Set) obj;
            C32463OooO c32463OooO = new C32463OooO();
            for (String str : this.f83543OooOo) {
                Iterator<T> it = set.iterator();
                while (it.hasNext()) {
                    if (C33595OooOOo.OooOOo(str, (String) it.next(), true)) {
                        c32463OooO.add(str);
                    }
                }
            }
            C32463OooO c32463OooOOooO0Oo = C34449Oooo0oo.OooO0Oo(c32463OooO);
            if (c32463OooOOooO0Oo.f116671OooOo0o.isEmpty()) {
                c32463OooOOooO0Oo = null;
            }
            if (c32463OooOOooO0Oo != null) {
                oooO00o.f83545OooOo = 1;
                if (this.f83544OooOo0o.emit(c32463OooOOooO0Oo, oooO00o) == enumC32485OooO00o) {
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
