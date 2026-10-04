package OooOoo;

import OooOoo0.C20697OooooOO;
import OooOoo0.C20698OooooOo;
import OooOoo0.o00000O;
import Oooo000.OooOOO;
import OoooOoO.C21234OooO0o0;
import OoooOoO.InterfaceC21233OooO0o;
import OooooO0.C21289OooO0o;
import OooooO0.C21290OooO0o0;
import OooooO0.C21291OooO0oO;
import OooooO0.C21293OooOO0;
import OooooO0.C21294OooOO0O;
import java.util.NoSuchElementException;
import java.util.concurrent.CancellationException;
import kotlin.coroutines.Continuation;
import o0000Ooo.C24237OooOO0o;
import o0000Ooo.C24239OooOOO0;
import o00oO0o.C25570OooO;
import o0Oo00oO.C28035OooO00o;
import o0ooOO0.C31604o0ooOoO;
import oO00ooO.C32442OooOO0o;
import oO00ooO.C32446OooOOOo;
import oO00ooO.C32460OooOooO;
import oO00ooo.AbstractC32476OooO;
import oO00ooo.InterfaceC32482OooO0o0;
import oO00ooo0.EnumC32485OooO00o;
import oO0O000o.InterfaceC32507OooOO0o;
import oO0O000o.InterfaceC32508OooOOOo;
import oO0o0OO.C33609OooO0oo;
import oO0o0OO.C33614OooOOO0;
import oO0o0OO.C33635Oooo00O;
import oO0o0OO.EnumC33637Oooo0O0;
import oO0o0OO.InterfaceC33636Oooo00o;
import oO0o0OO.InterfaceC33672o00ooo;
import oO0o0Ooo.C33822OooO0OO;
import oo000o.InterfaceC34635OooOOOO;
import oo000o.InterfaceC34651Oooo00O;
import oo000o.InterfaceC34652Oooo00o;

/* JADX INFO: renamed from: OooOoo.OooO0o0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C20595OooO0o0 implements InterfaceC34652Oooo00o, InterfaceC34651Oooo00O {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final EnumC20624Oooo0oO f58872OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final C33822OooO0OO f58873OooOo0o;

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public final boolean f58874OooOoO;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public final InterfaceC20643OoooooO f58875OooOoO0;

    /* JADX INFO: renamed from: OooOoo, reason: collision with root package name */
    public InterfaceC34635OooOOOO f58877OooOoo;

    /* JADX INFO: renamed from: OooOoo0, reason: collision with root package name */
    public InterfaceC34635OooOOOO f58878OooOoo0;

    /* JADX INFO: renamed from: OooOooO, reason: collision with root package name */
    public C21291OooO0oO f58879OooOooO;

    /* JADX INFO: renamed from: OooOooo, reason: collision with root package name */
    public boolean f58880OooOooo;

    /* JADX INFO: renamed from: Oooo0, reason: collision with root package name */
    public final InterfaceC21233OooO0o f58881Oooo0;

    /* JADX INFO: renamed from: Oooo00O, reason: collision with root package name */
    public boolean f58883Oooo00O;

    /* JADX INFO: renamed from: Oooo00o, reason: collision with root package name */
    public final C20649o0ooOoO f58884Oooo00o;

    /* JADX INFO: renamed from: OooOoOO, reason: collision with root package name */
    public final C20592OooO0OO f58876OooOoOO = new C20592OooO0OO();

    /* JADX INFO: renamed from: Oooo000, reason: collision with root package name */
    public long f58882Oooo000 = 0;

    /* JADX INFO: renamed from: OooOoo.OooO0o0$OooO00o */
    public static final class OooO00o {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final OooOOO.OooO00o.C18976OooO00o f58885OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public final C33614OooOOO0 f58886OooO0O0;

        public OooO00o(OooOOO.OooO00o.C18976OooO00o c18976OooO00o, C33614OooOOO0 c33614OooOOO0) {
            this.f58885OooO00o = c18976OooO00o;
            this.f58886OooO0O0 = c33614OooOOO0;
        }

        public final String toString() {
            String strOooO0O0;
            C33614OooOOO0 c33614OooOOO0 = this.f58886OooO0O0;
            C33635Oooo00O c33635Oooo00O = (C33635Oooo00O) c33614OooOOO0.f121299OooOoOO.get(C33635Oooo00O.f121314OooOoO0);
            String str = c33635Oooo00O != null ? c33635Oooo00O.f121315OooOo : null;
            StringBuilder sb = new StringBuilder("Request@");
            int iHashCode = hashCode();
            io.ktor.utils.p616io.Oooo000.OooO0O0(16);
            String string = Integer.toString(iHashCode, 16);
            kotlin.jvm.internal.OooOOO0.OooO0o(string, "toString(this, checkRadix(radix))");
            sb.append(string);
            if (str == null || (strOooO0O0 = C20593OooO0Oo.OooO0O0("[", str, "](")) == null) {
                strOooO0O0 = "(";
            }
            sb.append(strOooO0O0);
            sb.append("currentBounds()=");
            sb.append(this.f58885OooO00o.invoke());
            sb.append(", continuation=");
            sb.append(c33614OooOOO0);
            sb.append(')');
            return sb.toString();
        }
    }

    /* JADX INFO: renamed from: OooOoo.OooO0o0$OooO0O0 */
    @InterfaceC32482OooO0o0(m80622c = "androidx.compose.foundation.gestures.ContentInViewModifier$launchAnimation$1", m80623f = "ContentInViewModifier.kt", m80624l = {193}, m80625m = "invokeSuspend")
    public static final class OooO0O0 extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super C32460OooOooO>, Object> {

        /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
        public /* synthetic */ Object f58887OooOo;

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public int f58888OooOo0o;

        /* JADX INFO: renamed from: OooOoo.OooO0o0$OooO0O0$OooO00o */
        @InterfaceC32482OooO0o0(m80622c = "androidx.compose.foundation.gestures.ContentInViewModifier$launchAnimation$1$1", m80623f = "ContentInViewModifier.kt", m80624l = {198}, m80625m = "invokeSuspend")
        public static final class OooO00o extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC20633OoooOo0, Continuation<? super C32460OooOooO>, Object> {

            /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
            public /* synthetic */ Object f58890OooOo;

            /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
            public int f58891OooOo0o;

            /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
            public final /* synthetic */ InterfaceC33672o00ooo f58892OooOoO;

            /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
            public final /* synthetic */ C20595OooO0o0 f58893OooOoO0;

            /* JADX INFO: renamed from: OooOoo.OooO0o0$OooO0O0$OooO00o$OooO00o, reason: collision with other inner class name */
            public static final class C18966OooO00o extends kotlin.jvm.internal.OooOOOO implements InterfaceC32507OooOO0o<Float, C32460OooOooO> {

                /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
                public final /* synthetic */ InterfaceC20633OoooOo0 f58894OooOo;

                /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
                public final /* synthetic */ C20595OooO0o0 f58895OooOo0o;

                /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
                public final /* synthetic */ InterfaceC33672o00ooo f58896OooOoO0;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public C18966OooO00o(C20595OooO0o0 c20595OooO0o0, InterfaceC20633OoooOo0 interfaceC20633OoooOo0, InterfaceC33672o00ooo interfaceC33672o00ooo) {
                    super(1);
                    this.f58895OooOo0o = c20595OooO0o0;
                    this.f58894OooOo = interfaceC20633OoooOo0;
                    this.f58896OooOoO0 = interfaceC33672o00ooo;
                }

                @Override // oO0O000o.InterfaceC32507OooOO0o
                public final C32460OooOooO invoke(Float f) {
                    float fFloatValue = f.floatValue();
                    float f2 = this.f58895OooOo0o.f58874OooOoO ? 1.0f : -1.0f;
                    float fOooO00o = this.f58894OooOo.OooO00o(f2 * fFloatValue) * f2;
                    if (fOooO00o < fFloatValue) {
                        this.f58896OooOoO0.cancel(C28035OooO00o.OooO00o("Scroll animation cancelled because scroll was not consumed (" + fOooO00o + " < " + fFloatValue + ')', null));
                    }
                    return C32460OooOooO.f116667OooO00o;
                }
            }

            /* JADX INFO: renamed from: OooOoo.OooO0o0$OooO0O0$OooO00o$OooO0O0, reason: collision with other inner class name */
            public static final class C18967OooO0O0 extends kotlin.jvm.internal.OooOOOO implements oO0O000o.OooO00o<C32460OooOooO> {

                /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
                public final /* synthetic */ C20595OooO0o0 f58897OooOo0o;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public C18967OooO0O0(C20595OooO0o0 c20595OooO0o0) {
                    super(0);
                    this.f58897OooOo0o = c20595OooO0o0;
                }

                @Override // oO0O000o.OooO00o
                public final C32460OooOooO invoke() {
                    C20595OooO0o0 c20595OooO0o0 = this.f58897OooOo0o;
                    C20592OooO0OO c20592OooO0OO = c20595OooO0o0.f58876OooOoOO;
                    while (true) {
                        if (!c20592OooO0OO.f58869OooO00o.OooOO0()) {
                            break;
                        }
                        Oooo.OooO0O0<OooO00o> oooO0O0 = c20592OooO0OO.f58869OooO00o;
                        if (!oooO0O0.OooO()) {
                            C21291OooO0oO c21291OooO0oO = (C21291OooO0oO) oooO0O0.f59745OooOo0o[oooO0O0.f59746OooOoO0 - 1].f58885OooO00o.invoke();
                            if (!(c21291OooO0oO == null ? true : C21290OooO0o0.OooO00o(c20595OooO0o0.OooOO0(c21291OooO0oO, c20595OooO0o0.f58882Oooo000), C21290OooO0o0.f61718OooO0O0))) {
                                break;
                            }
                            oooO0O0.OooOO0o(oooO0O0.f59746OooOoO0 - 1).f58886OooO0O0.resumeWith(C32460OooOooO.f116667OooO00o);
                        } else {
                            throw new NoSuchElementException("MutableVector is empty.");
                        }
                    }
                    if (c20595OooO0o0.f58880OooOooo) {
                        C21291OooO0oO c21291OooO0oOOooO0o0 = c20595OooO0o0.OooO0o0();
                        if (c21291OooO0oOOooO0o0 != null && C21290OooO0o0.OooO00o(c20595OooO0o0.OooOO0(c21291OooO0oOOooO0o0, c20595OooO0o0.f58882Oooo000), C21290OooO0o0.f61718OooO0O0)) {
                            c20595OooO0o0.f58880OooOooo = false;
                        }
                    }
                    c20595OooO0o0.f58884Oooo00o.f59194OooO0Oo = C20595OooO0o0.OooO00o(c20595OooO0o0);
                    return C32460OooOooO.f116667OooO00o;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public OooO00o(C20595OooO0o0 c20595OooO0o0, InterfaceC33672o00ooo interfaceC33672o00ooo, Continuation<? super OooO00o> continuation) {
                super(2, continuation);
                this.f58893OooOoO0 = c20595OooO0o0;
                this.f58892OooOoO = interfaceC33672o00ooo;
            }

            @Override // oO00ooo.AbstractC32477OooO00o
            public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
                OooO00o oooO00o = new OooO00o(this.f58893OooOoO0, this.f58892OooOoO, continuation);
                oooO00o.f58890OooOo = obj;
                return oooO00o;
            }

            @Override // oO0O000o.InterfaceC32508OooOOOo
            public final Object invoke(InterfaceC20633OoooOo0 interfaceC20633OoooOo0, Continuation<? super C32460OooOooO> continuation) {
                return ((OooO00o) create(interfaceC20633OoooOo0, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
            }

            @Override // oO00ooo.AbstractC32477OooO00o
            public final Object invokeSuspend(Object obj) {
                EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
                int i = this.f58891OooOo0o;
                if (i == 0) {
                    C32446OooOOOo.OooO0O0(obj);
                    InterfaceC20633OoooOo0 interfaceC20633OoooOo0 = (InterfaceC20633OoooOo0) this.f58890OooOo;
                    C20595OooO0o0 c20595OooO0o0 = this.f58893OooOoO0;
                    c20595OooO0o0.f58884Oooo00o.f59194OooO0Oo = C20595OooO0o0.OooO00o(c20595OooO0o0);
                    C18966OooO00o c18966OooO00o = new C18966OooO00o(c20595OooO0o0, interfaceC20633OoooOo0, this.f58892OooOoO);
                    C18967OooO0O0 c18967OooO0O0 = new C18967OooO0O0(c20595OooO0o0);
                    this.f58891OooOo0o = 1;
                    if (c20595OooO0o0.f58884Oooo00o.OooO00o(c18966OooO00o, c18967OooO0O0, this) == enumC32485OooO00o) {
                        return enumC32485OooO00o;
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

        public OooO0O0(Continuation<? super OooO0O0> continuation) {
            super(2, continuation);
        }

        @Override // oO00ooo.AbstractC32477OooO00o
        public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
            OooO0O0 oooO0O0 = C20595OooO0o0.this.new OooO0O0(continuation);
            oooO0O0.f58887OooOo = obj;
            return oooO0O0;
        }

        @Override // oO0O000o.InterfaceC32508OooOOOo
        public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super C32460OooOooO> continuation) {
            return ((OooO0O0) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
        }

        @Override // oO00ooo.AbstractC32477OooO00o
        public final Object invokeSuspend(Object obj) {
            EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
            int i = this.f58888OooOo0o;
            C20595OooO0o0 c20595OooO0o0 = C20595OooO0o0.this;
            try {
                try {
                    if (i == 0) {
                        C32446OooOOOo.OooO0O0(obj);
                        InterfaceC33672o00ooo interfaceC33672o00oooOooO0Oo = oO00o00.OooO0OO.OooO0Oo(((InterfaceC33636Oooo00o) this.f58887OooOo).OooOOO0());
                        c20595OooO0o0.f58883Oooo00O = true;
                        InterfaceC20643OoooooO interfaceC20643OoooooO = c20595OooO0o0.f58875OooOoO0;
                        OooO00o oooO00o = new OooO00o(c20595OooO0o0, interfaceC33672o00oooOooO0Oo, null);
                        this.f58888OooOo0o = 1;
                        if (interfaceC20643OoooooO.OooO00o(o00000O.f59433OooOo0o, oooO00o, this) == enumC32485OooO00o) {
                            return enumC32485OooO00o;
                        }
                    } else {
                        if (i != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        C32446OooOOOo.OooO0O0(obj);
                    }
                    c20595OooO0o0.f58876OooOoOO.OooO0O0();
                    c20595OooO0o0.f58883Oooo00O = false;
                    c20595OooO0o0.f58876OooOoOO.OooO00o(null);
                    c20595OooO0o0.f58880OooOooo = false;
                    return C32460OooOooO.f116667OooO00o;
                } catch (CancellationException e) {
                    throw e;
                }
            } catch (Throwable th) {
                c20595OooO0o0.f58883Oooo00O = false;
                c20595OooO0o0.f58876OooOoOO.OooO00o(null);
                c20595OooO0o0.f58880OooOooo = false;
                throw th;
            }
        }
    }

    public C20595OooO0o0(C33822OooO0OO c33822OooO0OO, EnumC20624Oooo0oO enumC20624Oooo0oO, InterfaceC20643OoooooO interfaceC20643OoooooO, boolean z) {
        this.f58873OooOo0o = c33822OooO0OO;
        this.f58872OooOo = enumC20624Oooo0oO;
        this.f58875OooOoO0 = interfaceC20643OoooooO;
        this.f58874OooOoO = z;
        C20649o0ooOoO c20649o0ooOoO = new C20649o0ooOoO();
        c20649o0ooOoO.f59191OooO00o = Long.MIN_VALUE;
        c20649o0ooOoO.f59192OooO0O0 = C20649o0ooOoO.f59190OooO0o0;
        this.f58884Oooo00o = c20649o0ooOoO;
        C20594OooO0o c20594OooO0o = new C20594OooO0o(this, 0);
        C25570OooO<InterfaceC32507OooOO0o<InterfaceC34635OooOOOO, C32460OooOooO>> c25570OooO = C20697OooooOO.f59412OooO00o;
        C31604o0ooOoO.OooO00o oooO00o = C31604o0ooOoO.f112933OooO00o;
        this.f58881Oooo0 = C21234OooO0o0.OooO00o(C21234OooO0o0.OooO00o(this, oooO00o, new C20698OooooOo(c20594OooO0o)), oooO00o, new Oooo000.OooOOO0(this));
    }

    public static float OooO(float f, float f2, float f3) {
        if ((f >= 0.0f && f2 <= f3) || (f < 0.0f && f2 > f3)) {
            return 0.0f;
        }
        float f4 = f2 - f3;
        return Math.abs(f) < Math.abs(f4) ? f : f4;
    }

    public static final float OooO00o(C20595OooO0o0 c20595OooO0o0) {
        C21291OooO0oO c21291OooO0oO;
        int iCompare;
        if (C24237OooOO0o.OooO00o(c20595OooO0o0.f58882Oooo000, 0L)) {
            return 0.0f;
        }
        Oooo.OooO0O0<OooO00o> oooO0O0 = c20595OooO0o0.f58876OooOoOO.f58869OooO00o;
        int i = oooO0O0.f59746OooOoO0;
        EnumC20624Oooo0oO enumC20624Oooo0oO = c20595OooO0o0.f58872OooOo;
        if (i > 0) {
            int i2 = i - 1;
            OooO00o[] oooO00oArr = oooO0O0.f59745OooOo0o;
            c21291OooO0oO = null;
            do {
                C21291OooO0oO c21291OooO0oO2 = (C21291OooO0oO) oooO00oArr[i2].f58885OooO00o.invoke();
                if (c21291OooO0oO2 != null) {
                    long jOooO00o = C21294OooOO0O.OooO00o(c21291OooO0oO2.OooO0OO(), c21291OooO0oO2.OooO0O0());
                    long jOooO = C24239OooOOO0.OooO(c20595OooO0o0.f58882Oooo000);
                    int iOrdinal = enumC20624Oooo0oO.ordinal();
                    if (iOrdinal == 0) {
                        iCompare = Float.compare(C21293OooOO0.OooO0O0(jOooO00o), C21293OooOO0.OooO0O0(jOooO));
                    } else {
                        if (iOrdinal != 1) {
                            throw new C32442OooOO0o();
                        }
                        iCompare = Float.compare(C21293OooOO0.OooO0Oo(jOooO00o), C21293OooOO0.OooO0Oo(jOooO));
                    }
                    if (iCompare > 0) {
                        break;
                    }
                    c21291OooO0oO = c21291OooO0oO2;
                    i2--;
                } else {
                    i2--;
                }
            } while (i2 >= 0);
        } else {
            c21291OooO0oO = null;
        }
        if (c21291OooO0oO == null) {
            C21291OooO0oO c21291OooO0oOOooO0o0 = c20595OooO0o0.f58880OooOooo ? c20595OooO0o0.OooO0o0() : null;
            if (c21291OooO0oOOooO0o0 == null) {
                return 0.0f;
            }
            c21291OooO0oO = c21291OooO0oOOooO0o0;
        }
        long jOooO2 = C24239OooOOO0.OooO(c20595OooO0o0.f58882Oooo000);
        int iOrdinal2 = enumC20624Oooo0oO.ordinal();
        if (iOrdinal2 == 0) {
            return OooO(c21291OooO0oO.f61725OooO0O0, c21291OooO0oO.f61727OooO0Oo, C21293OooOO0.OooO0O0(jOooO2));
        }
        if (iOrdinal2 == 1) {
            return OooO(c21291OooO0oO.f61724OooO00o, c21291OooO0oO.f61726OooO0OO, C21293OooOO0.OooO0Oo(jOooO2));
        }
        throw new C32442OooOO0o();
    }

    public final C21291OooO0oO OooO0o0() {
        InterfaceC34635OooOOOO interfaceC34635OooOOOO;
        InterfaceC34635OooOOOO interfaceC34635OooOOOO2 = this.f58878OooOoo0;
        if (interfaceC34635OooOOOO2 != null) {
            if (!interfaceC34635OooOOOO2.OooOo()) {
                interfaceC34635OooOOOO2 = null;
            }
            if (interfaceC34635OooOOOO2 != null && (interfaceC34635OooOOOO = this.f58877OooOoo) != null) {
                if (!interfaceC34635OooOOOO.OooOo()) {
                    interfaceC34635OooOOOO = null;
                }
                if (interfaceC34635OooOOOO != null) {
                    return interfaceC34635OooOOOO2.OooO0o(interfaceC34635OooOOOO, false);
                }
            }
        }
        return null;
    }

    public final void OooO0oo() {
        if (this.f58883Oooo00O) {
            throw new IllegalStateException("Check failed.");
        }
        C33609OooO0oo.OooO0OO(this.f58873OooOo0o, null, EnumC33637Oooo0O0.f121318OooOoO, new OooO0O0(null), 1);
    }

    public final long OooOO0(C21291OooO0oO c21291OooO0oO, long j) {
        long jOooO = C24239OooOOO0.OooO(j);
        int iOrdinal = this.f58872OooOo.ordinal();
        if (iOrdinal == 0) {
            float fOooO0O0 = C21293OooOO0.OooO0O0(jOooO);
            return C21289OooO0o.OooO00o(0.0f, OooO(c21291OooO0oO.f61725OooO0O0, c21291OooO0oO.f61727OooO0Oo, fOooO0O0));
        }
        if (iOrdinal != 1) {
            throw new C32442OooOO0o();
        }
        float fOooO0Oo = C21293OooOO0.OooO0Oo(jOooO);
        return C21289OooO0o.OooO00o(OooO(c21291OooO0oO.f61724OooO00o, c21291OooO0oO.f61726OooO0OO, fOooO0Oo), 0.0f);
    }

    @Override // oo000o.InterfaceC34652Oooo00o
    public final void OooOOo(long j) {
        int iOooO;
        C21291OooO0oO c21291OooO0oOOooO0o0;
        long j2 = this.f58882Oooo000;
        this.f58882Oooo000 = j;
        int iOrdinal = this.f58872OooOo.ordinal();
        if (iOrdinal == 0) {
            iOooO = kotlin.jvm.internal.OooOOO0.OooO((int) (j & 4294967295L), (int) (4294967295L & j2));
        } else {
            if (iOrdinal != 1) {
                throw new C32442OooOO0o();
            }
            iOooO = kotlin.jvm.internal.OooOOO0.OooO((int) (j >> 32), (int) (j2 >> 32));
        }
        if (iOooO < 0 && (c21291OooO0oOOooO0o0 = OooO0o0()) != null) {
            C21291OooO0oO c21291OooO0oO = this.f58879OooOooO;
            if (c21291OooO0oO == null) {
                c21291OooO0oO = c21291OooO0oOOooO0o0;
            }
            if (!this.f58883Oooo00O && !this.f58880OooOooo) {
                long jOooOO0 = OooOO0(c21291OooO0oO, j2);
                long j3 = C21290OooO0o0.f61718OooO0O0;
                if (C21290OooO0o0.OooO00o(jOooOO0, j3) && !C21290OooO0o0.OooO00o(OooOO0(c21291OooO0oOOooO0o0, j), j3)) {
                    this.f58880OooOooo = true;
                    OooO0oo();
                }
            }
            this.f58879OooOooO = c21291OooO0oOOooO0o0;
        }
    }

    @Override // oo000o.InterfaceC34651Oooo00O
    public final void OooOoO0(InterfaceC34635OooOOOO coordinates) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(coordinates, "coordinates");
        this.f58878OooOoo0 = coordinates;
    }
}
