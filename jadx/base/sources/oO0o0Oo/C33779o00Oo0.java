package oO0o0Oo;

import Oooo0oO.C21111o0ooOoO;
import androidx.core.location.LocationRequestCompat;
import com.aspose.slides.C22200OooO0o0;
import com.google.mlkit.p567nl.translate.TranslateLanguage;
import kotlin.coroutines.Continuation;
import o00o00O0.C25252OooO0Oo;
import o0OO00o0.o000;
import oO00ooO.C32446OooOOOo;
import oO00ooO.C32460OooOooO;
import oO00ooOO.C32465OooO0O0;
import oO00ooo.AbstractC32476OooO;
import oO00ooo.InterfaceC32482OooO0o0;
import oO00ooo0.EnumC32485OooO00o;
import oO0O000o.InterfaceC32508OooOOOo;
import oO0O000o.InterfaceC32510OooOOo0;
import oO0o0OO.C33644OoooO0;

/* JADX INFO: renamed from: oO0o0Oo.o00Oo0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C33779o00Oo0 implements InterfaceC33788ooOO {

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final long f121789OooOo0o;

    /* JADX INFO: renamed from: oO0o0Oo.o00Oo0$OooO00o */
    @InterfaceC32482OooO0o0(m80622c = "kotlinx.coroutines.flow.StartedWhileSubscribed$command$1", m80623f = "SharingStarted.kt", m80624l = {174, 176, 178, 179, 181}, m80625m = "invokeSuspend")
    public static final class OooO00o extends AbstractC32476OooO implements InterfaceC32510OooOOo0<InterfaceC33723OooO0oO<? super EnumC33776Ooooooo>, Integer, Continuation<? super C32460OooOooO>, Object> {

        /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
        public /* synthetic */ InterfaceC33723OooO0oO f121790OooOo;

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public int f121791OooOo0o;

        /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
        public /* synthetic */ int f121793OooOoO0;

        public OooO00o(Continuation<? super OooO00o> continuation) {
            super(3, continuation);
        }

        @Override // oO0O000o.InterfaceC32510OooOOo0
        public final Object invoke(InterfaceC33723OooO0oO<? super EnumC33776Ooooooo> interfaceC33723OooO0oO, Integer num, Continuation<? super C32460OooOooO> continuation) {
            int iIntValue = num.intValue();
            OooO00o oooO00o = C33779o00Oo0.this.new OooO00o(continuation);
            oooO00o.f121790OooOo = interfaceC33723OooO0oO;
            oooO00o.f121793OooOoO0 = iIntValue;
            return oooO00o.invokeSuspend(C32460OooOooO.f116667OooO00o);
        }

        /* JADX WARN: Code restructure failed: missing block: B:19:0x0047, code lost:
        
            if (r1.emit(r11, r10) == r0) goto L32;
         */
        /* JADX WARN: Code restructure failed: missing block: B:31:0x0085, code lost:
        
            if (r1.emit(r11, r10) != r0) goto L33;
         */
        /* JADX WARN: Removed duplicated region for block: B:27:0x0067 A[PHI: r1
          0x0067: PHI (r1v3 oO0o0Oo.OooO0oO) = (r1v2 oO0o0Oo.OooO0oO), (r1v6 oO0o0Oo.OooO0oO) binds: [B:25:0x0064, B:13:0x0026] A[DONT_GENERATE, DONT_INLINE]] */
        /* JADX WARN: Removed duplicated region for block: B:30:0x007a A[PHI: r1
          0x007a: PHI (r1v4 oO0o0Oo.OooO0oO) = (r1v3 oO0o0Oo.OooO0oO), (r1v7 oO0o0Oo.OooO0oO) binds: [B:28:0x0077, B:12:0x0020] A[DONT_GENERATE, DONT_INLINE]] */
        @Override // oO00ooo.AbstractC32477OooO00o
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            InterfaceC33723OooO0oO interfaceC33723OooO0oO;
            EnumC33776Ooooooo enumC33776Ooooooo;
            EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
            int i = this.f121791OooOo0o;
            C33779o00Oo0 c33779o00Oo0 = C33779o00Oo0.this;
            if (i == 0) {
                C32446OooOOOo.OooO0O0(obj);
                interfaceC33723OooO0oO = this.f121790OooOo;
                if (this.f121793OooOoO0 > 0) {
                    EnumC33776Ooooooo enumC33776Ooooooo2 = EnumC33776Ooooooo.f121772OooOo0o;
                    this.f121791OooOo0o = 1;
                } else {
                    long j = c33779o00Oo0.f121789OooOo0o;
                    this.f121790OooOo = interfaceC33723OooO0oO;
                    this.f121791OooOo0o = 2;
                    if (C33644OoooO0.OooO00o(j, this) != enumC32485OooO00o) {
                        c33779o00Oo0.getClass();
                        enumC33776Ooooooo = EnumC33776Ooooooo.f121771OooOo;
                        this.f121790OooOo = interfaceC33723OooO0oO;
                        this.f121791OooOo0o = 3;
                        if (interfaceC33723OooO0oO.emit(enumC33776Ooooooo, this) != enumC32485OooO00o) {
                        }
                    }
                }
                return enumC32485OooO00o;
            }
            if (i != 1) {
                if (i == 2) {
                    interfaceC33723OooO0oO = this.f121790OooOo;
                    C32446OooOOOo.OooO0O0(obj);
                    c33779o00Oo0.getClass();
                    enumC33776Ooooooo = EnumC33776Ooooooo.f121771OooOo;
                    this.f121790OooOo = interfaceC33723OooO0oO;
                    this.f121791OooOo0o = 3;
                    if (interfaceC33723OooO0oO.emit(enumC33776Ooooooo, this) != enumC32485OooO00o) {
                        c33779o00Oo0.getClass();
                        this.f121790OooOo = interfaceC33723OooO0oO;
                        this.f121791OooOo0o = 4;
                        if (C33644OoooO0.OooO00o(LocationRequestCompat.PASSIVE_INTERVAL, this) != enumC32485OooO00o) {
                        }
                    }
                    return enumC32485OooO00o;
                }
                if (i == 3) {
                    interfaceC33723OooO0oO = this.f121790OooOo;
                    C32446OooOOOo.OooO0O0(obj);
                    c33779o00Oo0.getClass();
                    this.f121790OooOo = interfaceC33723OooO0oO;
                    this.f121791OooOo0o = 4;
                    if (C33644OoooO0.OooO00o(LocationRequestCompat.PASSIVE_INTERVAL, this) != enumC32485OooO00o) {
                        EnumC33776Ooooooo enumC33776Ooooooo3 = EnumC33776Ooooooo.f121774OooOoO0;
                        this.f121790OooOo = null;
                        this.f121791OooOo0o = 5;
                    }
                    return enumC32485OooO00o;
                }
                if (i == 4) {
                    interfaceC33723OooO0oO = this.f121790OooOo;
                    C32446OooOOOo.OooO0O0(obj);
                    EnumC33776Ooooooo enumC33776Ooooooo32 = EnumC33776Ooooooo.f121774OooOoO0;
                    this.f121790OooOo = null;
                    this.f121791OooOo0o = 5;
                } else if (i != 5) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            }
            C32446OooOOOo.OooO0O0(obj);
            return C32460OooOooO.f116667OooO00o;
        }
    }

    /* JADX INFO: renamed from: oO0o0Oo.o00Oo0$OooO0O0 */
    @InterfaceC32482OooO0o0(m80622c = "kotlinx.coroutines.flow.StartedWhileSubscribed$command$2", m80623f = "SharingStarted.kt", m80624l = {}, m80625m = "invokeSuspend")
    public static final class OooO0O0 extends AbstractC32476OooO implements InterfaceC32508OooOOOo<EnumC33776Ooooooo, Continuation<? super Boolean>, Object> {

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public /* synthetic */ Object f121794OooOo0o;

        public OooO0O0() {
            throw null;
        }

        @Override // oO00ooo.AbstractC32477OooO00o
        public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
            OooO0O0 oooO0O0 = new OooO0O0(2, continuation);
            oooO0O0.f121794OooOo0o = obj;
            return oooO0O0;
        }

        @Override // oO0O000o.InterfaceC32508OooOOOo
        public final Object invoke(EnumC33776Ooooooo enumC33776Ooooooo, Continuation<? super Boolean> continuation) {
            return ((OooO0O0) create(enumC33776Ooooooo, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
        }

        @Override // oO00ooo.AbstractC32477OooO00o
        public final Object invokeSuspend(Object obj) {
            EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
            C32446OooOOOo.OooO0O0(obj);
            return Boolean.valueOf(((EnumC33776Ooooooo) this.f121794OooOo0o) != EnumC33776Ooooooo.f121772OooOo0o);
        }
    }

    public C33779o00Oo0(long j) {
        this.f121789OooOo0o = j;
        if (j < 0) {
            throw new IllegalArgumentException(C22200OooO0o0.OooO0O0(j, "stopTimeout(", " ms) cannot be negative").toString());
        }
    }

    @Override // oO0o0Oo.InterfaceC33788ooOO
    public final InterfaceC33721OooO0o<EnumC33776Ooooooo> OooO00o(InterfaceC33780o00Ooo<Integer> interfaceC33780o00Ooo) {
        return C25252OooO0Oo.OooOO0o(new o000(new OooO0O0(2, null), C25252OooO0Oo.OooOoO(interfaceC33780o00Ooo, new OooO00o(null))));
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C33779o00Oo0) {
            return this.f121789OooOo0o == ((C33779o00Oo0) obj).f121789OooOo0o;
        }
        return false;
    }

    public final int hashCode() {
        return Long.hashCode(LocationRequestCompat.PASSIVE_INTERVAL) + (Long.hashCode(this.f121789OooOo0o) * 31);
    }

    public final String toString() {
        C32465OooO0O0 c32465OooO0O0 = new C32465OooO0O0(2);
        long j = this.f121789OooOo0o;
        if (j > 0) {
            c32465OooO0O0.add("stopTimeout=" + j + TranslateLanguage.MALAY);
        }
        return C21111o0ooOoO.OooO0OO(oOo000Oo.OooOo.o000oOoO(com.facebook.soloader.OooOo.OooO0O0(c32465OooO0O0), null, null, null, null, 63), ')', new StringBuilder("SharingStarted.WhileSubscribed("));
    }
}
