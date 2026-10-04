package Oooo0O0;

import Oooo0.C20890o00oO0o;
import Oooo0.EnumC20853Ooooo0o;
import Oooo0.InterfaceC20865o00000oO;
import Oooo0.o000O0;
import Oooo0oO.C21035OooOOo;
import Oooo0oO.C21081o00000o0;
import Oooo0oO.InterfaceC21033OooOOOO;
import Oooo0oO.o00000OO;
import OoooOoO.InterfaceC21233OooO0o;
import OooooO0.C21289OooO0o;
import OooooO0.C21290OooO0o0;
import OooooO0.C21291OooO0oO;
import kotlin.coroutines.Continuation;
import o00000o0.EnumC24118OooO0oO;
import o00Ooo.InterfaceC25088OooOoO;
import oO00ooO.C32446OooOOOo;
import oO00ooO.C32460OooOooO;
import oO00ooo.AbstractC32476OooO;
import oO00ooo.InterfaceC32482OooO0o0;
import oO00ooo0.EnumC32485OooO00o;
import oO0O000o.InterfaceC32508OooOOOo;
import oO0o0OO.C33633Oooo0;
import oo000o.InterfaceC34635OooOOOO;
import oo0o0Oo.C34696OooOOoo;

/* JADX INFO: loaded from: classes.dex */
public final class Oooo0 {

    @InterfaceC32482OooO0o0(m80622c = "androidx.compose.foundation.text.selection.TextFieldSelectionManagerKt$TextFieldSelectionHandle$1", m80623f = "TextFieldSelectionManager.kt", m80624l = {820}, m80625m = "invokeSuspend")
    public static final class OooO00o extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC25088OooOoO, Continuation<? super C32460OooOooO>, Object> {

        /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
        public /* synthetic */ Object f60392OooOo;

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public int f60393OooOo0o;

        /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
        public final /* synthetic */ InterfaceC20865o00000oO f60394OooOoO0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO00o(InterfaceC20865o00000oO interfaceC20865o00000oO, Continuation<? super OooO00o> continuation) {
            super(2, continuation);
            this.f60394OooOoO0 = interfaceC20865o00000oO;
        }

        @Override // oO00ooo.AbstractC32477OooO00o
        public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
            OooO00o oooO00o = new OooO00o(this.f60394OooOoO0, continuation);
            oooO00o.f60392OooOo = obj;
            return oooO00o;
        }

        @Override // oO0O000o.InterfaceC32508OooOOOo
        public final Object invoke(InterfaceC25088OooOoO interfaceC25088OooOoO, Continuation<? super C32460OooOooO> continuation) {
            return ((OooO00o) create(interfaceC25088OooOoO, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
        }

        @Override // oO00ooo.AbstractC32477OooO00o
        public final Object invokeSuspend(Object obj) {
            Object obj2 = EnumC32485OooO00o.f116726OooOo0o;
            int i = this.f60393OooOo0o;
            if (i == 0) {
                C32446OooOOOo.OooO0O0(obj);
                InterfaceC25088OooOoO interfaceC25088OooOoO = (InterfaceC25088OooOoO) this.f60392OooOo;
                this.f60393OooOo0o = 1;
                Object objOooO0o0 = C33633Oooo0.OooO0o0(new C20890o00oO0o(interfaceC25088OooOoO, this.f60394OooOoO0, null), this);
                if (objOooO0o0 != obj2) {
                    objOooO0o0 = C32460OooOooO.f116667OooO00o;
                }
                if (objOooO0o0 == obj2) {
                    return obj2;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C32446OooOOOo.OooO0O0(obj);
            }
            return C32460OooOooO.f116667OooO00o;
        }
    }

    public static final class OooO0O0 extends kotlin.jvm.internal.OooOOOO implements InterfaceC32508OooOOOo<InterfaceC21033OooOOOO, Integer, C32460OooOooO> {

        /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
        public final /* synthetic */ EnumC24118OooO0oO f60395OooOo;

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public final /* synthetic */ boolean f60396OooOo0o;

        /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
        public final /* synthetic */ C20935Oooo00o f60397OooOoO0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO0O0(boolean z, EnumC24118OooO0oO enumC24118OooO0oO, C20935Oooo00o c20935Oooo00o, int i) {
            super(2);
            this.f60396OooOo0o = z;
            this.f60395OooOo = enumC24118OooO0oO;
            this.f60397OooOoO0 = c20935Oooo00o;
        }

        @Override // oO0O000o.InterfaceC32508OooOOOo
        public final C32460OooOooO invoke(InterfaceC21033OooOOOO interfaceC21033OooOOOO, Integer num) {
            num.intValue();
            int iOooO0oo = C21081o00000o0.OooO0oo(519);
            C20935Oooo00o c20935Oooo00o = this.f60397OooOoO0;
            Oooo0.OooO00o(this.f60396OooOo0o, this.f60395OooOo, c20935Oooo00o, interfaceC21033OooOOOO, iOooO0oo);
            return C32460OooOooO.f116667OooO00o;
        }
    }

    public /* synthetic */ class OooO0OO {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public static final /* synthetic */ int[] f60398OooO00o;

        static {
            int[] iArr = new int[EnumC20853Ooooo0o.values().length];
            try {
                iArr[0] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[1] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[2] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f60398OooO00o = iArr;
        }
    }

    public static final void OooO00o(boolean z, EnumC24118OooO0oO direction, C20935Oooo00o c20935Oooo00o, InterfaceC21033OooOOOO interfaceC21033OooOOOO, int i) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(direction, "direction");
        C21035OooOOo c21035OooOOoOooOOO0 = interfaceC21033OooOOOO.OooOOO0(-1344558920);
        Boolean boolValueOf = Boolean.valueOf(z);
        c21035OooOOoOooOOO0.OooOo00(511388516);
        boolean zOooO0oo = c21035OooOOoOooOOO0.OooO0oo(boolValueOf) | c21035OooOOoOooOOO0.OooO0oo(c20935Oooo00o);
        Object objOooOo0 = c21035OooOOoOooOOO0.OooOo0();
        if (zOooO0oo || objOooOo0 == InterfaceC21033OooOOOO.OooO00o.f60894OooO00o) {
            objOooOo0 = new C20934Oooo00O(c20935Oooo00o, z);
            c21035OooOOoOooOOO0.OooOOo0(objOooOo0);
        }
        c21035OooOOoOooOOO0.Oooo(false);
        InterfaceC20865o00000oO interfaceC20865o00000oO = (InterfaceC20865o00000oO) objOooOo0;
        C20908OooO00o.OooO0OO(c20935Oooo00o.OooO0oO(z), z, direction, C34696OooOOoo.OooO0o0(c20935Oooo00o.OooO0oo().f81084OooO0O0), o00Ooo.Oooo000.OooO0O0(InterfaceC21233OooO0o.OooO00o.f61602OooOo0o, interfaceC20865o00000oO, new OooO00o(interfaceC20865o00000oO, null)), c21035OooOOoOooOOO0, 196656);
        o00000OO o00000ooOoooO0 = c21035OooOOoOooOOO0.OoooO0();
        if (o00000ooOoooO0 == null) {
            return;
        }
        o00000ooOoooO0.f61064OooO0Oo = new OooO0O0(z, direction, c20935Oooo00o, i);
    }

    public static final boolean OooO0O0(C20935Oooo00o c20935Oooo00o, boolean z) {
        InterfaceC34635OooOOOO interfaceC34635OooOOOO;
        kotlin.jvm.internal.OooOOO0.OooO0oO(c20935Oooo00o, "<this>");
        o000O0 o000o0 = c20935Oooo00o.f60406OooO0Oo;
        if (o000o0 == null || (interfaceC34635OooOOOO = o000o0.f60107OooO0oO) == null) {
            return false;
        }
        C21291OooO0oO c21291OooO0oOOooO0o0 = o00000.OooOO0.OooO0o0(interfaceC34635OooOOOO);
        long jOooOoO0 = interfaceC34635OooOOOO.OooOoO0(C21289OooO0o.OooO00o(c21291OooO0oOOooO0o0.f61724OooO00o, c21291OooO0oOOooO0o0.f61725OooO0O0));
        long jOooOoO02 = interfaceC34635OooOOOO.OooOoO0(C21289OooO0o.OooO00o(c21291OooO0oOOooO0o0.f61726OooO0OO, c21291OooO0oOOooO0o0.f61727OooO0Oo));
        float fOooO0OO = C21290OooO0o0.OooO0OO(jOooOoO0);
        float fOooO0Oo = C21290OooO0o0.OooO0Oo(jOooOoO0);
        float fOooO0OO2 = C21290OooO0o0.OooO0OO(jOooOoO02);
        float fOooO0Oo2 = C21290OooO0o0.OooO0Oo(jOooOoO02);
        long jOooO0oO = c20935Oooo00o.OooO0oO(z);
        float fOooO0OO3 = C21290OooO0o0.OooO0OO(jOooO0oO);
        if (fOooO0OO > fOooO0OO3 || fOooO0OO3 > fOooO0OO2) {
            return false;
        }
        float fOooO0Oo3 = C21290OooO0o0.OooO0Oo(jOooO0oO);
        return fOooO0Oo <= fOooO0Oo3 && fOooO0Oo3 <= fOooO0Oo2;
    }
}
