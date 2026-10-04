package OooOoo;

import OooOoo.AbstractC20599OooOO0O;
import OooOoo0.o00000O;
import OooooO0.C21290OooO0o0;
import com.aspose.words.StyleIdentifier;
import java.util.concurrent.CancellationException;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.C24034Oooo00O;
import oO00ooO.C32446OooOOOo;
import oO00ooO.C32460OooOooO;
import oO00ooo.AbstractC32476OooO;
import oO00ooo.InterfaceC32482OooO0o0;
import oO00ooo0.EnumC32485OooO00o;
import oO0O000o.InterfaceC32508OooOOOo;
import oO0o0OO.C33633Oooo0;
import oO0o0OO.InterfaceC33636Oooo00o;
import oO0o0OOo.InterfaceC33699OooOO0;

/* JADX INFO: renamed from: OooOoo.OooOooO, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC32482OooO0o0(m80622c = "androidx.compose.foundation.gestures.DraggableKt$draggable$9$2", m80623f = "Draggable.kt", m80624l = {239, 241, 243, StyleIdentifier.MEDIUM_LIST_1_ACCENT_6, StyleIdentifier.MEDIUM_GRID_1_ACCENT_6, 257}, m80625m = "invokeSuspend")
public final class C20615OooOooO extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super C32460OooOooO>, Object> {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public C24034Oooo00O f59005OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public C24034Oooo00O f59006OooOo0o;

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public /* synthetic */ Object f59007OooOoO;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public int f59008OooOoO0;

    /* JADX INFO: renamed from: OooOoOO, reason: collision with root package name */
    public final /* synthetic */ InterfaceC33699OooOO0<AbstractC20599OooOO0O> f59009OooOoOO;

    /* JADX INFO: renamed from: OooOoo, reason: collision with root package name */
    public final /* synthetic */ Oooo0oO.o00oO0O f59010OooOoo;

    /* JADX INFO: renamed from: OooOoo0, reason: collision with root package name */
    public final /* synthetic */ C20630OoooOO0 f59011OooOoo0;

    /* JADX INFO: renamed from: OooOooO, reason: collision with root package name */
    public final /* synthetic */ EnumC20624Oooo0oO f59012OooOooO;

    /* JADX INFO: renamed from: OooOoo.OooOooO$OooO00o */
    @InterfaceC32482OooO0o0(m80622c = "androidx.compose.foundation.gestures.DraggableKt$draggable$9$2$2", m80623f = "Draggable.kt", m80624l = {246}, m80625m = "invokeSuspend")
    public static final class OooO00o extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC20609OooOo0o, Continuation<? super C32460OooOooO>, Object> {

        /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
        public int f59013OooOo;

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public C24034Oooo00O f59014OooOo0o;

        /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
        public final /* synthetic */ C24034Oooo00O<AbstractC20599OooOO0O> f59015OooOoO;

        /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
        public /* synthetic */ Object f59016OooOoO0;

        /* JADX INFO: renamed from: OooOoOO, reason: collision with root package name */
        public final /* synthetic */ InterfaceC33699OooOO0<AbstractC20599OooOO0O> f59017OooOoOO;

        /* JADX INFO: renamed from: OooOoo0, reason: collision with root package name */
        public final /* synthetic */ EnumC20624Oooo0oO f59018OooOoo0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO00o(C24034Oooo00O<AbstractC20599OooOO0O> c24034Oooo00O, InterfaceC33699OooOO0<AbstractC20599OooOO0O> interfaceC33699OooOO0, EnumC20624Oooo0oO enumC20624Oooo0oO, Continuation<? super OooO00o> continuation) {
            super(2, continuation);
            this.f59015OooOoO = c24034Oooo00O;
            this.f59017OooOoOO = interfaceC33699OooOO0;
            this.f59018OooOoo0 = enumC20624Oooo0oO;
        }

        @Override // oO00ooo.AbstractC32477OooO00o
        public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
            OooO00o oooO00o = new OooO00o(this.f59015OooOoO, this.f59017OooOoOO, this.f59018OooOoo0, continuation);
            oooO00o.f59016OooOoO0 = obj;
            return oooO00o;
        }

        @Override // oO0O000o.InterfaceC32508OooOOOo
        public final Object invoke(InterfaceC20609OooOo0o interfaceC20609OooOo0o, Continuation<? super C32460OooOooO> continuation) {
            return ((OooO00o) create(interfaceC20609OooOo0o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Removed duplicated region for block: B:11:0x002b  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:24:0x0059 -> B:26:0x005c). Please report as a decompilation issue!!! */
        @Override // oO00ooo.AbstractC32477OooO00o
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            InterfaceC20609OooOo0o interfaceC20609OooOo0o;
            AbstractC20599OooOO0O abstractC20599OooOO0O;
            EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
            int i = this.f59013OooOo;
            if (i == 0) {
                C32446OooOOOo.OooO0O0(obj);
                interfaceC20609OooOo0o = (InterfaceC20609OooOo0o) this.f59016OooOoO0;
                c24034Oooo00O = this.f59015OooOoO;
                abstractC20599OooOO0O = c24034Oooo00O.f80942OooOo0o;
                if (abstractC20599OooOO0O instanceof AbstractC20599OooOO0O.C20600OooO0Oo) {
                }
                return C32460OooOooO.f116667OooO00o;
            }
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C24034Oooo00O<AbstractC20599OooOO0O> c24034Oooo00O = this.f59014OooOo0o;
            interfaceC20609OooOo0o = (InterfaceC20609OooOo0o) this.f59016OooOoO0;
            C32446OooOOOo.OooO0O0(obj);
            T t = obj;
            c24034Oooo00O.f80942OooOo0o = t;
            c24034Oooo00O = this.f59015OooOoO;
            abstractC20599OooOO0O = c24034Oooo00O.f80942OooOo0o;
            if (!(abstractC20599OooOO0O instanceof AbstractC20599OooOO0O.C20600OooO0Oo) || (abstractC20599OooOO0O instanceof AbstractC20599OooOO0O.OooO00o)) {
                return C32460OooOooO.f116667OooO00o;
            }
            AbstractC20599OooOO0O.OooO0O0 oooO0O0 = abstractC20599OooOO0O instanceof AbstractC20599OooOO0O.OooO0O0 ? (AbstractC20599OooOO0O.OooO0O0) abstractC20599OooOO0O : null;
            if (oooO0O0 != null) {
                EnumC20624Oooo0oO enumC20624Oooo0oO = EnumC20624Oooo0oO.f59071OooOo0o;
                EnumC20624Oooo0oO enumC20624Oooo0oO2 = this.f59018OooOoo0;
                long j = oooO0O0.f58915OooO00o;
                interfaceC20609OooOo0o.OooO00o(enumC20624Oooo0oO2 == enumC20624Oooo0oO ? C21290OooO0o0.OooO0Oo(j) : C21290OooO0o0.OooO0OO(j));
            }
            this.f59016OooOoO0 = interfaceC20609OooOo0o;
            this.f59014OooOo0o = c24034Oooo00O;
            this.f59013OooOo = 1;
            Object objOooO0oO = this.f59017OooOoOO.OooO0oO(this);
            t = objOooO0oO;
            if (objOooO0oO == enumC32485OooO00o) {
                return enumC32485OooO00o;
            }
            c24034Oooo00O.f80942OooOo0o = t;
            c24034Oooo00O = this.f59015OooOoO;
            abstractC20599OooOO0O = c24034Oooo00O.f80942OooOo0o;
            if (abstractC20599OooOO0O instanceof AbstractC20599OooOO0O.C20600OooO0Oo) {
            }
            return C32460OooOooO.f116667OooO00o;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C20615OooOooO(InterfaceC33699OooOO0 interfaceC33699OooOO0, C20630OoooOO0 c20630OoooOO0, Oooo0oO.o00oO0O o00oo0o, EnumC20624Oooo0oO enumC20624Oooo0oO, Continuation continuation) {
        super(2, continuation);
        this.f59009OooOoOO = interfaceC33699OooOO0;
        this.f59011OooOoo0 = c20630OoooOO0;
        this.f59010OooOoo = o00oo0o;
        this.f59012OooOooO = enumC20624Oooo0oO;
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
        Oooo0oO.o00oO0O o00oo0o = this.f59010OooOoo;
        EnumC20624Oooo0oO enumC20624Oooo0oO = this.f59012OooOooO;
        C20615OooOooO c20615OooOooO = new C20615OooOooO(this.f59009OooOoOO, this.f59011OooOoo0, o00oo0o, enumC20624Oooo0oO, continuation);
        c20615OooOooO.f59007OooOoO = obj;
        return c20615OooOooO;
    }

    @Override // oO0O000o.InterfaceC32508OooOOOo
    public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super C32460OooOooO> continuation) {
        return ((C20615OooOooO) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
    }

    /* JADX WARN: Code restructure failed: missing block: B:46:0x0102, code lost:
    
        if (r11.OooO00o(r5, r10) == r0) goto L51;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x0119, code lost:
    
        if (r11.OooO00o(r1, r10) == r0) goto L51;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x00f0, code lost:
    
        r1 = r5;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:20:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00c8  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00c9 A[Catch: CancellationException -> 0x0036, TryCatch #1 {CancellationException -> 0x0036, blocks: (B:30:0x009f, B:36:0x00ce, B:38:0x00da, B:43:0x00f3, B:45:0x00f7, B:33:0x00c9, B:12:0x0031), top: B:58:0x0031 }] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00cd  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00ce A[Catch: CancellationException -> 0x0036, PHI: r1 r5
      0x00ce: PHI (r1v11 kotlin.jvm.internal.Oooo00O) = (r1v3 kotlin.jvm.internal.Oooo00O), (r1v18 kotlin.jvm.internal.Oooo00O) binds: [B:12:0x0031, B:34:0x00cb] A[DONT_GENERATE, DONT_INLINE]
      0x00ce: PHI (r5v7 oO0o0OO.Oooo00o) = (r5v4 oO0o0OO.Oooo00o), (r5v8 oO0o0OO.Oooo00o) binds: [B:12:0x0031, B:34:0x00cb] A[DONT_GENERATE, DONT_INLINE], TryCatch #1 {CancellationException -> 0x0036, blocks: (B:30:0x009f, B:36:0x00ce, B:38:0x00da, B:43:0x00f3, B:45:0x00f7, B:33:0x00c9, B:12:0x0031), top: B:58:0x0031 }] */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00da A[Catch: CancellationException -> 0x0036, TryCatch #1 {CancellationException -> 0x0036, blocks: (B:30:0x009f, B:36:0x00ce, B:38:0x00da, B:43:0x00f3, B:45:0x00f7, B:33:0x00c9, B:12:0x0031), top: B:58:0x0031 }] */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00f3 A[Catch: CancellationException -> 0x0036, TryCatch #1 {CancellationException -> 0x0036, blocks: (B:30:0x009f, B:36:0x00ce, B:38:0x00da, B:43:0x00f3, B:45:0x00f7, B:33:0x00c9, B:12:0x0031), top: B:58:0x0031 }] */
    /* JADX WARN: Removed duplicated region for block: B:52:0x011c  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x011f  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:48:0x0105 -> B:18:0x0056). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:50:0x0119 -> B:42:0x00f0). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:52:0x011c -> B:18:0x0056). Please report as a decompilation issue!!! */
    @Override // oO00ooo.AbstractC32477OooO00o
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        InterfaceC33636Oooo00o interfaceC33636Oooo00o;
        C24034Oooo00O c24034Oooo00O;
        C24034Oooo00O c24034Oooo00O2;
        InterfaceC33636Oooo00o interfaceC33636Oooo00o2;
        C24034Oooo00O c24034Oooo00O3;
        InterfaceC33636Oooo00o interfaceC33636Oooo00o3;
        InterfaceC33636Oooo00o interfaceC33636Oooo00o4;
        T t;
        Object objOooO00o;
        T t2;
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i = this.f59008OooOoO0;
        Oooo0oO.o00oO0O o00oo0o = this.f59010OooOoo;
        InterfaceC33699OooOO0<AbstractC20599OooOO0O> interfaceC33699OooOO0 = this.f59009OooOoOO;
        switch (i) {
            case 0:
                C32446OooOOOo.OooO0O0(obj);
                interfaceC33636Oooo00o = (InterfaceC33636Oooo00o) this.f59007OooOoO;
                if (C33633Oooo0.OooO0o(interfaceC33636Oooo00o)) {
                    c24034Oooo00O = new C24034Oooo00O();
                    this.f59007OooOoO = interfaceC33636Oooo00o;
                    this.f59006OooOo0o = c24034Oooo00O;
                    this.f59005OooOo = c24034Oooo00O;
                    this.f59008OooOoO0 = 1;
                    Object objOooO0oO = interfaceC33699OooOO0.OooO0oO(this);
                    if (objOooO0oO != enumC32485OooO00o) {
                        interfaceC33636Oooo00o2 = interfaceC33636Oooo00o;
                        t2 = objOooO0oO;
                        c24034Oooo00O2 = c24034Oooo00O;
                        c24034Oooo00O.f80942OooOo0o = t2;
                        if (c24034Oooo00O2.f80942OooOo0o instanceof AbstractC20599OooOO0O.OooO0OO) {
                            interfaceC33636Oooo00o = interfaceC33636Oooo00o2;
                            if (C33633Oooo0.OooO0o(interfaceC33636Oooo00o)) {
                            }
                        } else {
                            C20608OooOo0O c20608OooOo0O = (C20608OooOo0O) o00oo0o.getValue();
                            T t3 = c24034Oooo00O2.f80942OooOo0o;
                            kotlin.jvm.internal.OooOOO0.OooO0o0(t3, "null cannot be cast to non-null type androidx.compose.foundation.gestures.DragEvent.DragStarted");
                            this.f59007OooOoO = interfaceC33636Oooo00o2;
                            this.f59006OooOo0o = c24034Oooo00O2;
                            this.f59005OooOo = null;
                            this.f59008OooOoO0 = 2;
                            if (c20608OooOo0O.OooO0O0(interfaceC33636Oooo00o2, (AbstractC20599OooOO0O.OooO0OO) t3, this) != enumC32485OooO00o) {
                                c24034Oooo00O3 = c24034Oooo00O2;
                                interfaceC33636Oooo00o3 = interfaceC33636Oooo00o2;
                                C20630OoooOO0 c20630OoooOO0 = this.f59011OooOoo0;
                                OooO00o oooO00o = new OooO00o(c24034Oooo00O3, interfaceC33699OooOO0, this.f59012OooOooO, null);
                                this.f59007OooOoO = interfaceC33636Oooo00o3;
                                this.f59006OooOo0o = c24034Oooo00O3;
                                this.f59008OooOoO0 = 3;
                                objOooO00o = ((o0OoOo0) c20630OoooOO0.f59089OooO00o.getValue()).f59177OooO0Oo.OooO00o(o00000O.f59432OooOo, new C20626OoooO(c20630OoooOO0, oooO00o, null), this);
                                if (objOooO00o == EnumC32485OooO00o.f116726OooOo0o) {
                                    objOooO00o = C32460OooOooO.f116667OooO00o;
                                }
                                if (objOooO00o == enumC32485OooO00o) {
                                    C20608OooOo0O c20608OooOo0O2 = (C20608OooOo0O) o00oo0o.getValue();
                                    t = c24034Oooo00O3.f80942OooOo0o;
                                    if (!(t instanceof AbstractC20599OooOO0O.C20600OooO0Oo)) {
                                        if (t instanceof AbstractC20599OooOO0O.OooO00o) {
                                            this.f59007OooOoO = interfaceC33636Oooo00o3;
                                            this.f59006OooOo0o = null;
                                            this.f59008OooOoO0 = 5;
                                        } else {
                                            interfaceC33636Oooo00o = interfaceC33636Oooo00o3;
                                        }
                                        break;
                                    } else {
                                        kotlin.jvm.internal.OooOOO0.OooO0o0(t, "null cannot be cast to non-null type androidx.compose.foundation.gestures.DragEvent.DragStopped");
                                        this.f59007OooOoO = interfaceC33636Oooo00o3;
                                        this.f59006OooOo0o = null;
                                        this.f59008OooOoO0 = 4;
                                        if (c20608OooOo0O2.OooO0OO(interfaceC33636Oooo00o3, (AbstractC20599OooOO0O.C20600OooO0Oo) t, this) != enumC32485OooO00o) {
                                            interfaceC33636Oooo00o4 = interfaceC33636Oooo00o3;
                                            interfaceC33636Oooo00o = interfaceC33636Oooo00o4;
                                        }
                                    }
                                    if (C33633Oooo0.OooO0o(interfaceC33636Oooo00o)) {
                                        return C32460OooOooO.f116667OooO00o;
                                    }
                                }
                            }
                        }
                    }
                    return enumC32485OooO00o;
                }
                break;
            case 1:
                c24034Oooo00O = this.f59005OooOo;
                c24034Oooo00O2 = this.f59006OooOo0o;
                interfaceC33636Oooo00o2 = (InterfaceC33636Oooo00o) this.f59007OooOoO;
                C32446OooOOOo.OooO0O0(obj);
                t2 = obj;
                c24034Oooo00O.f80942OooOo0o = t2;
                if (c24034Oooo00O2.f80942OooOo0o instanceof AbstractC20599OooOO0O.OooO0OO) {
                }
                break;
            case 2:
                c24034Oooo00O3 = this.f59006OooOo0o;
                interfaceC33636Oooo00o3 = (InterfaceC33636Oooo00o) this.f59007OooOoO;
                C32446OooOOOo.OooO0O0(obj);
                C20630OoooOO0 c20630OoooOO02 = this.f59011OooOoo0;
                OooO00o oooO00o2 = new OooO00o(c24034Oooo00O3, interfaceC33699OooOO0, this.f59012OooOooO, null);
                this.f59007OooOoO = interfaceC33636Oooo00o3;
                this.f59006OooOo0o = c24034Oooo00O3;
                this.f59008OooOoO0 = 3;
                objOooO00o = ((o0OoOo0) c20630OoooOO02.f59089OooO00o.getValue()).f59177OooO0Oo.OooO00o(o00000O.f59432OooOo, new C20626OoooO(c20630OoooOO02, oooO00o2, null), this);
                if (objOooO00o == EnumC32485OooO00o.f116726OooOo0o) {
                }
                if (objOooO00o == enumC32485OooO00o) {
                }
                return enumC32485OooO00o;
            case 3:
                c24034Oooo00O3 = this.f59006OooOo0o;
                interfaceC33636Oooo00o3 = (InterfaceC33636Oooo00o) this.f59007OooOoO;
                try {
                    C32446OooOOOo.OooO0O0(obj);
                } catch (CancellationException unused) {
                    interfaceC33636Oooo00o4 = interfaceC33636Oooo00o3;
                    C20608OooOo0O c20608OooOo0O3 = (C20608OooOo0O) o00oo0o.getValue();
                    this.f59007OooOoO = interfaceC33636Oooo00o4;
                    this.f59006OooOo0o = null;
                    this.f59008OooOoO0 = 6;
                }
                C20608OooOo0O c20608OooOo0O22 = (C20608OooOo0O) o00oo0o.getValue();
                t = c24034Oooo00O3.f80942OooOo0o;
                if (!(t instanceof AbstractC20599OooOO0O.C20600OooO0Oo)) {
                }
                if (C33633Oooo0.OooO0o(interfaceC33636Oooo00o)) {
                }
                break;
            case 4:
                interfaceC33636Oooo00o4 = (InterfaceC33636Oooo00o) this.f59007OooOoO;
                try {
                    C32446OooOOOo.OooO0O0(obj);
                } catch (CancellationException unused2) {
                    C20608OooOo0O c20608OooOo0O32 = (C20608OooOo0O) o00oo0o.getValue();
                    this.f59007OooOoO = interfaceC33636Oooo00o4;
                    this.f59006OooOo0o = null;
                    this.f59008OooOoO0 = 6;
                }
                interfaceC33636Oooo00o = interfaceC33636Oooo00o4;
                if (C33633Oooo0.OooO0o(interfaceC33636Oooo00o)) {
                }
                break;
            case 5:
                interfaceC33636Oooo00o4 = (InterfaceC33636Oooo00o) this.f59007OooOoO;
                C32446OooOOOo.OooO0O0(obj);
                interfaceC33636Oooo00o = interfaceC33636Oooo00o4;
                if (C33633Oooo0.OooO0o(interfaceC33636Oooo00o)) {
                }
                break;
            case 6:
                interfaceC33636Oooo00o4 = (InterfaceC33636Oooo00o) this.f59007OooOoO;
                C32446OooOOOo.OooO0O0(obj);
                interfaceC33636Oooo00o = interfaceC33636Oooo00o4;
                if (C33633Oooo0.OooO0o(interfaceC33636Oooo00o)) {
                }
                break;
            default:
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }
}
