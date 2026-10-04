package OooOoo;

import OooOoo.C20645o00o0O;
import OooooO0.C21290OooO0o0;
import kotlin.coroutines.Continuation;
import o00Ooo.InterfaceC25074OooO0OO;
import o00Ooo.InterfaceC25088OooOoO;
import oO00ooO.C32446OooOOOo;
import oO00ooO.C32460OooOooO;
import oO00ooo.AbstractC32476OooO;
import oO00ooo.AbstractC32484OooO0oo;
import oO00ooo.InterfaceC32482OooO0o0;
import oO00ooo0.EnumC32485OooO00o;
import oO0O000o.InterfaceC32507OooOO0o;
import oO0O000o.InterfaceC32508OooOOOo;
import oO0O000o.InterfaceC32510OooOOo0;
import oO0o0OO.C33609OooO0oo;
import oO0o0OO.InterfaceC33636Oooo00o;

/* JADX INFO: loaded from: classes.dex */
@InterfaceC32482OooO0o0(m80622c = "androidx.compose.foundation.gestures.TapGestureDetectorKt$detectTapAndPress$2", m80623f = "TapGestureDetector.kt", m80624l = {232}, m80625m = "invokeSuspend")
public final class oo000o extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super C32460OooOooO>, Object> {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public /* synthetic */ Object f59195OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public int f59196OooOo0o;

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public final /* synthetic */ AbstractC32476OooO f59197OooOoO;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public final /* synthetic */ InterfaceC25088OooOoO f59198OooOoO0;

    /* JADX INFO: renamed from: OooOoOO, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.OooOOOO f59199OooOoOO;

    /* JADX INFO: renamed from: OooOoo0, reason: collision with root package name */
    public final /* synthetic */ C20629OoooO0O f59200OooOoo0;

    @InterfaceC32482OooO0o0(m80622c = "androidx.compose.foundation.gestures.TapGestureDetectorKt$detectTapAndPress$2$1", m80623f = "TapGestureDetector.kt", m80624l = {237, 245}, m80625m = "invokeSuspend")
    public static final class OooO00o extends AbstractC32484OooO0oo implements InterfaceC32508OooOOOo<InterfaceC25074OooO0OO, Continuation<? super C32460OooOooO>, Object> {

        /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
        public /* synthetic */ Object f59201OooOo;

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public int f59202OooOo0o;

        /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
        public final /* synthetic */ AbstractC32476OooO f59203OooOoO;

        /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
        public final /* synthetic */ InterfaceC33636Oooo00o f59204OooOoO0;

        /* JADX INFO: renamed from: OooOoOO, reason: collision with root package name */
        public final /* synthetic */ kotlin.jvm.internal.OooOOOO f59205OooOoOO;

        /* JADX INFO: renamed from: OooOoo0, reason: collision with root package name */
        public final /* synthetic */ C20629OoooO0O f59206OooOoo0;

        /* JADX INFO: renamed from: OooOoo.oo000o$OooO00o$OooO00o, reason: collision with other inner class name */
        @InterfaceC32482OooO0o0(m80622c = "androidx.compose.foundation.gestures.TapGestureDetectorKt$detectTapAndPress$2$1$1", m80623f = "TapGestureDetector.kt", m80624l = {234}, m80625m = "invokeSuspend")
        public static final class C18969OooO00o extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super C32460OooOooO>, Object> {

            /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
            public final /* synthetic */ C20629OoooO0O f59207OooOo;

            /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
            public int f59208OooOo0o;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C18969OooO00o(C20629OoooO0O c20629OoooO0O, Continuation<? super C18969OooO00o> continuation) {
                super(2, continuation);
                this.f59207OooOo = c20629OoooO0O;
            }

            @Override // oO00ooo.AbstractC32477OooO00o
            public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
                return new C18969OooO00o(this.f59207OooOo, continuation);
            }

            @Override // oO0O000o.InterfaceC32508OooOOOo
            public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super C32460OooOooO> continuation) {
                return ((C18969OooO00o) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
            }

            @Override // oO00ooo.AbstractC32477OooO00o
            public final Object invokeSuspend(Object obj) {
                EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
                int i = this.f59208OooOo0o;
                if (i == 0) {
                    C32446OooOOOo.OooO0O0(obj);
                    this.f59208OooOo0o = 1;
                    if (this.f59207OooOo.OooO0O0(this) == enumC32485OooO00o) {
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

        @InterfaceC32482OooO0o0(m80622c = "androidx.compose.foundation.gestures.TapGestureDetectorKt$detectTapAndPress$2$1$2", m80623f = "TapGestureDetector.kt", m80624l = {241}, m80625m = "invokeSuspend")
        public static final class OooO0O0 extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super C32460OooOooO>, Object> {

            /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
            public final /* synthetic */ AbstractC32476OooO f59209OooOo;

            /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
            public int f59210OooOo0o;

            /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
            public final /* synthetic */ o00Ooo.OooOo00 f59211OooOoO;

            /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
            public final /* synthetic */ C20629OoooO0O f59212OooOoO0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public OooO0O0(InterfaceC32510OooOOo0<? super InterfaceC20617Oooo, ? super C21290OooO0o0, ? super Continuation<? super C32460OooOooO>, ? extends Object> interfaceC32510OooOOo0, C20629OoooO0O c20629OoooO0O, o00Ooo.OooOo00 oooOo00, Continuation<? super OooO0O0> continuation) {
                super(2, continuation);
                this.f59209OooOo = (AbstractC32476OooO) interfaceC32510OooOOo0;
                this.f59212OooOoO0 = c20629OoooO0O;
                this.f59211OooOoO = oooOo00;
            }

            /* JADX WARN: Type inference failed for: r1v0, types: [oO00ooo.OooO, oO0O000o.OooOOo0] */
            @Override // oO00ooo.AbstractC32477OooO00o
            public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
                return new OooO0O0(this.f59209OooOo, this.f59212OooOoO0, this.f59211OooOoO, continuation);
            }

            @Override // oO0O000o.InterfaceC32508OooOOOo
            public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super C32460OooOooO> continuation) {
                return ((OooO0O0) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
            }

            /* JADX WARN: Type inference failed for: r1v1, types: [oO00ooo.OooO, oO0O000o.OooOOo0] */
            @Override // oO00ooo.AbstractC32477OooO00o
            public final Object invokeSuspend(Object obj) {
                EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
                int i = this.f59210OooOo0o;
                if (i == 0) {
                    C32446OooOOOo.OooO0O0(obj);
                    C21290OooO0o0 c21290OooO0o0 = new C21290OooO0o0(this.f59211OooOoO.f85146OooO0OO);
                    this.f59210OooOo0o = 1;
                    if (this.f59209OooOo.invoke(this.f59212OooOoO0, c21290OooO0o0, this) == enumC32485OooO00o) {
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

        @InterfaceC32482OooO0o0(m80622c = "androidx.compose.foundation.gestures.TapGestureDetectorKt$detectTapAndPress$2$1$3", m80623f = "TapGestureDetector.kt", m80624l = {}, m80625m = "invokeSuspend")
        public static final class OooO0OO extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super C32460OooOooO>, Object> {

            /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
            public final /* synthetic */ C20629OoooO0O f59213OooOo0o;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public OooO0OO(C20629OoooO0O c20629OoooO0O, Continuation<? super OooO0OO> continuation) {
                super(2, continuation);
                this.f59213OooOo0o = c20629OoooO0O;
            }

            @Override // oO00ooo.AbstractC32477OooO00o
            public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
                return new OooO0OO(this.f59213OooOo0o, continuation);
            }

            @Override // oO0O000o.InterfaceC32508OooOOOo
            public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super C32460OooOooO> continuation) {
                return ((OooO0OO) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
            }

            @Override // oO00ooo.AbstractC32477OooO00o
            public final Object invokeSuspend(Object obj) {
                EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
                C32446OooOOOo.OooO0O0(obj);
                C20629OoooO0O c20629OoooO0O = this.f59213OooOo0o;
                c20629OoooO0O.f59088OooOoO0 = true;
                c20629OoooO0O.f59087OooOoO.OooOOO0(null);
                return C32460OooOooO.f116667OooO00o;
            }
        }

        /* JADX INFO: renamed from: OooOoo.oo000o$OooO00o$OooO0Oo, reason: case insensitive filesystem */
        @InterfaceC32482OooO0o0(m80622c = "androidx.compose.foundation.gestures.TapGestureDetectorKt$detectTapAndPress$2$1$4", m80623f = "TapGestureDetector.kt", m80624l = {}, m80625m = "invokeSuspend")
        public static final class C20650OooO0Oo extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super C32460OooOooO>, Object> {

            /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
            public final /* synthetic */ C20629OoooO0O f59214OooOo0o;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C20650OooO0Oo(C20629OoooO0O c20629OoooO0O, Continuation<? super C20650OooO0Oo> continuation) {
                super(2, continuation);
                this.f59214OooOo0o = c20629OoooO0O;
            }

            @Override // oO00ooo.AbstractC32477OooO00o
            public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
                return new C20650OooO0Oo(this.f59214OooOo0o, continuation);
            }

            @Override // oO0O000o.InterfaceC32508OooOOOo
            public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super C32460OooOooO> continuation) {
                return ((C20650OooO0Oo) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
            }

            @Override // oO00ooo.AbstractC32477OooO00o
            public final Object invokeSuspend(Object obj) {
                EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
                C32446OooOOOo.OooO0O0(obj);
                C20629OoooO0O c20629OoooO0O = this.f59214OooOo0o;
                c20629OoooO0O.f59085OooOo = true;
                c20629OoooO0O.f59087OooOoO.OooOOO0(null);
                return C32460OooOooO.f116667OooO00o;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public OooO00o(InterfaceC33636Oooo00o interfaceC33636Oooo00o, InterfaceC32510OooOOo0<? super InterfaceC20617Oooo, ? super C21290OooO0o0, ? super Continuation<? super C32460OooOooO>, ? extends Object> interfaceC32510OooOOo0, InterfaceC32507OooOO0o<? super C21290OooO0o0, C32460OooOooO> interfaceC32507OooOO0o, C20629OoooO0O c20629OoooO0O, Continuation<? super OooO00o> continuation) {
            super(2, continuation);
            this.f59204OooOoO0 = interfaceC33636Oooo00o;
            this.f59203OooOoO = (AbstractC32476OooO) interfaceC32510OooOOo0;
            this.f59205OooOoOO = (kotlin.jvm.internal.OooOOOO) interfaceC32507OooOO0o;
            this.f59206OooOoo0 = c20629OoooO0O;
        }

        /* JADX WARN: Type inference failed for: r2v0, types: [oO00ooo.OooO, oO0O000o.OooOOo0] */
        /* JADX WARN: Type inference failed for: r3v0, types: [kotlin.jvm.internal.OooOOOO, oO0O000o.OooOO0o] */
        @Override // oO00ooo.AbstractC32477OooO00o
        public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
            ?? r3 = this.f59205OooOoOO;
            C20629OoooO0O c20629OoooO0O = this.f59206OooOoo0;
            OooO00o oooO00o = new OooO00o(this.f59204OooOoO0, this.f59203OooOoO, r3, c20629OoooO0O, continuation);
            oooO00o.f59201OooOo = obj;
            return oooO00o;
        }

        @Override // oO0O000o.InterfaceC32508OooOOOo
        public final Object invoke(InterfaceC25074OooO0OO interfaceC25074OooO0OO, Continuation<? super C32460OooOooO> continuation) {
            return ((OooO00o) create(interfaceC25074OooO0OO, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
        }

        /* JADX WARN: Code restructure failed: missing block: B:17:0x005e, code lost:
        
            if (r10 == r0) goto L18;
         */
        /* JADX WARN: Type inference failed for: r0v2, types: [kotlin.jvm.internal.OooOOOO, oO0O000o.OooOO0o] */
        /* JADX WARN: Type inference failed for: r8v0, types: [oO00ooo.OooO, oO0O000o.OooOOo0] */
        @Override // oO00ooo.AbstractC32477OooO00o
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            InterfaceC25074OooO0OO interfaceC25074OooO0OO;
            EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
            int i = this.f59202OooOo0o;
            C20629OoooO0O c20629OoooO0O = this.f59206OooOoo0;
            InterfaceC33636Oooo00o interfaceC33636Oooo00o = this.f59204OooOoO0;
            if (i == 0) {
                C32446OooOOOo.OooO0O0(obj);
                interfaceC25074OooO0OO = (InterfaceC25074OooO0OO) this.f59201OooOo;
                C33609OooO0oo.OooO0OO(interfaceC33636Oooo00o, null, null, new C18969OooO00o(c20629OoooO0O, null), 3);
                this.f59201OooOo = interfaceC25074OooO0OO;
                this.f59202OooOo0o = 1;
                obj = C20645o00o0O.OooO00o(interfaceC25074OooO0OO, (3 & 1) != 0, o00Ooo.OooOOOO.f85129OooOo, this);
                if (obj != enumC32485OooO00o) {
                }
                return enumC32485OooO00o;
            }
            if (i != 1) {
                if (i != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C32446OooOOOo.OooO0O0(obj);
                o00Ooo.OooOo00 oooOo00 = (o00Ooo.OooOo00) obj;
                if (oooOo00 == null) {
                    C33609OooO0oo.OooO0OO(interfaceC33636Oooo00o, null, null, new OooO0OO(c20629OoooO0O, null), 3);
                } else {
                    oooOo00.OooO00o();
                    C33609OooO0oo.OooO0OO(interfaceC33636Oooo00o, null, null, new C20650OooO0Oo(c20629OoooO0O, null), 3);
                    this.f59205OooOoOO.invoke(new C21290OooO0o0(oooOo00.f85146OooO0OO));
                }
                return C32460OooOooO.f116667OooO00o;
            }
            interfaceC25074OooO0OO = (InterfaceC25074OooO0OO) this.f59201OooOo;
            C32446OooOOOo.OooO0O0(obj);
            o00Ooo.OooOo00 oooOo002 = (o00Ooo.OooOo00) obj;
            oooOo002.OooO00o();
            C20645o00o0O.OooO00o oooO00o = C20645o00o0O.f59157OooO00o;
            ?? r8 = this.f59203OooOoO;
            if (r8 != oooO00o) {
                C33609OooO0oo.OooO0OO(interfaceC33636Oooo00o, null, null, new OooO0O0(r8, c20629OoooO0O, oooOo002, null), 3);
            }
            this.f59201OooOo = null;
            this.f59202OooOo0o = 2;
            obj = C20645o00o0O.OooO0OO(interfaceC25074OooO0OO, o00Ooo.OooOOOO.f85129OooOo, this);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public oo000o(InterfaceC25088OooOoO interfaceC25088OooOoO, InterfaceC32510OooOOo0<? super InterfaceC20617Oooo, ? super C21290OooO0o0, ? super Continuation<? super C32460OooOooO>, ? extends Object> interfaceC32510OooOOo0, InterfaceC32507OooOO0o<? super C21290OooO0o0, C32460OooOooO> interfaceC32507OooOO0o, C20629OoooO0O c20629OoooO0O, Continuation<? super oo000o> continuation) {
        super(2, continuation);
        this.f59198OooOoO0 = interfaceC25088OooOoO;
        this.f59197OooOoO = (AbstractC32476OooO) interfaceC32510OooOOo0;
        this.f59199OooOoOO = (kotlin.jvm.internal.OooOOOO) interfaceC32507OooOO0o;
        this.f59200OooOoo0 = c20629OoooO0O;
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [oO00ooo.OooO, oO0O000o.OooOOo0] */
    /* JADX WARN: Type inference failed for: r3v0, types: [kotlin.jvm.internal.OooOOOO, oO0O000o.OooOO0o] */
    @Override // oO00ooo.AbstractC32477OooO00o
    public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
        ?? r3 = this.f59199OooOoOO;
        C20629OoooO0O c20629OoooO0O = this.f59200OooOoo0;
        oo000o oo000oVar = new oo000o(this.f59198OooOoO0, this.f59197OooOoO, r3, c20629OoooO0O, continuation);
        oo000oVar.f59195OooOo = obj;
        return oo000oVar;
    }

    @Override // oO0O000o.InterfaceC32508OooOOOo
    public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super C32460OooOooO> continuation) {
        return ((oo000o) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
    }

    /* JADX WARN: Type inference failed for: r5v0, types: [oO00ooo.OooO, oO0O000o.OooOOo0] */
    /* JADX WARN: Type inference failed for: r6v0, types: [kotlin.jvm.internal.OooOOOO, oO0O000o.OooOO0o] */
    @Override // oO00ooo.AbstractC32477OooO00o
    public final Object invokeSuspend(Object obj) {
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i = this.f59196OooOo0o;
        if (i == 0) {
            C32446OooOOOo.OooO0O0(obj);
            OooO00o oooO00o = new OooO00o((InterfaceC33636Oooo00o) this.f59195OooOo, this.f59197OooOoO, this.f59199OooOoOO, this.f59200OooOoo0, null);
            this.f59196OooOo0o = 1;
            if (C20623Oooo0o0.OooO0O0(this.f59198OooOoO0, oooO00o, this) == enumC32485OooO00o) {
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
