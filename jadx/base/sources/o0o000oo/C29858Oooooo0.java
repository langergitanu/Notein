package o0o000oo;

import kotlin.coroutines.Continuation;
import o0000oOO.AbstractC24338OooO0o0;
import o0o00Oo0.C29909OooO0O0;
import oO00ooO.C32446OooOOOo;
import oO00ooO.C32460OooOooO;
import oO00ooo.AbstractC32479OooO0OO;
import oO00ooo.InterfaceC32482OooO0o0;
import oO00ooo0.EnumC32485OooO00o;
import oO0o0Oo.InterfaceC33723OooO0oO;
import oO0oO00.C33938OooO0o0;
import oOo000Oo.C34434OooOoO;

/* JADX INFO: renamed from: o0o000oo.Oooooo0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C29858Oooooo0<T> implements InterfaceC33723OooO0oO {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final /* synthetic */ o00Ooo f105894OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final /* synthetic */ InterfaceC33723OooO0oO f105895OooOo0o;

    /* JADX INFO: renamed from: o0o000oo.Oooooo0$OooO00o */
    @InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.noteeditor.toolbar.ToolbarViewModel$listenToolbarItemPreference$$inlined$map$1$2", m80623f = "ToolbarViewModel.kt", m80624l = {50}, m80625m = "emit")
    public static final class OooO00o extends AbstractC32479OooO0OO {

        /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
        public int f105896OooOo;

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public /* synthetic */ Object f105897OooOo0o;

        public OooO00o(Continuation continuation) {
            super(continuation);
        }

        @Override // oO00ooo.AbstractC32477OooO00o
        public final Object invokeSuspend(Object obj) {
            this.f105897OooOo0o = obj;
            this.f105896OooOo |= Integer.MIN_VALUE;
            return C29858Oooooo0.this.emit(null, this);
        }
    }

    public C29858Oooooo0(InterfaceC33723OooO0oO interfaceC33723OooO0oO, o00Ooo o00ooo2) {
        this.f105895OooOo0o = interfaceC33723OooO0oO;
        this.f105894OooOo = o00ooo2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // oO0o0Oo.InterfaceC33723OooO0oO
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object emit(Object obj, Continuation continuation) {
        OooO00o oooO00o;
        Object objOooO0O0;
        if (continuation instanceof OooO00o) {
            oooO00o = (OooO00o) continuation;
            int i = oooO00o.f105896OooOo;
            if ((i & Integer.MIN_VALUE) != 0) {
                oooO00o.f105896OooOo = i - Integer.MIN_VALUE;
            } else {
                oooO00o = new OooO00o(continuation);
            }
        }
        Object obj2 = oooO00o.f105897OooOo0o;
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i2 = oooO00o.f105896OooOo;
        if (i2 == 0) {
            C32446OooOOOo.OooO0O0(obj2);
            o00Ooo o00ooo2 = this.f105894OooOo;
            String str = (String) ((AbstractC24338OooO0o0) obj).OooO0OO(o00ooo2.f105925OooO0o);
            if (str == null) {
                objOooO0O0 = C34434OooOoO.f123453OooOo0o;
            } else {
                oOo00O0O.OooOo00 oooOo00 = o00ooo2.f105927OooO0oO;
                oooOo00.getClass();
                objOooO0O0 = oooOo00.OooO0O0(str, new C33938OooO0o0(C29909OooO0O0.Companion.serializer()));
            }
            oooO00o.f105896OooOo = 1;
            if (this.f105895OooOo0o.emit(objOooO0O0, oooO00o) == enumC32485OooO00o) {
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
