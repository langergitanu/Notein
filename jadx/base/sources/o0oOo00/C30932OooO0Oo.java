package o0oOo00;

import kotlin.coroutines.Continuation;
import o0OOOo0.C27174OooO0O0;
import o0OOo0o.C27512o00o0;
import o0OOo0o.C27538o00o0o0O;
import oO00ooO.C32446OooOOOo;
import oO00ooO.C32460OooOooO;
import oO00ooo.AbstractC32476OooO;
import oO00ooo.InterfaceC32482OooO0o0;
import oO00ooo0.EnumC32485OooO00o;
import oO0O000o.InterfaceC32508OooOOOo;
import oO0o0OO.C33609OooO0oo;
import oO0o0OO.C33649OoooOOo;
import oO0o0OO.InterfaceC33636Oooo00o;
import oO0o0Oo.C33772OooooOo;
import oO0o0Oo.C33781o00o0O;
import oO0o0o0o.C33874OooO0OO;
import oO0o0o0o.ExecutorC33873OooO0O0;

/* JADX INFO: renamed from: o0oOo00.OooO0Oo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
@InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.stickers.edit.ExportStickerCollectionViewModel$exportStickerCollection$1", m80623f = "ExportStickerCollectionViewModel.kt", m80624l = {48, 49, 54, 56, 57}, m80625m = "invokeSuspend")
public final class C30932OooO0Oo extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super C32460OooOooO>, Object> {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public /* synthetic */ Object f110508OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public int f110509OooOo0o;

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public final /* synthetic */ String f110510OooOoO;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public final /* synthetic */ C30933OooO0o0 f110511OooOoO0;

    /* JADX INFO: renamed from: o0oOo00.OooO0Oo$OooO00o */
    @InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.stickers.edit.ExportStickerCollectionViewModel$exportStickerCollection$1$result$1$1", m80623f = "ExportStickerCollectionViewModel.kt", m80624l = {51}, m80625m = "invokeSuspend")
    public static final class OooO00o extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super C32460OooOooO>, Object> {

        /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
        public final /* synthetic */ C30933OooO0o0 f110512OooOo;

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public int f110513OooOo0o;

        /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
        public final /* synthetic */ float f110514OooOoO0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO00o(C30933OooO0o0 c30933OooO0o0, float f, Continuation<? super OooO00o> continuation) {
            super(2, continuation);
            this.f110512OooOo = c30933OooO0o0;
            this.f110514OooOoO0 = f;
        }

        @Override // oO00ooo.AbstractC32477OooO00o
        public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
            return new OooO00o(this.f110512OooOo, this.f110514OooOoO0, continuation);
        }

        @Override // oO0O000o.InterfaceC32508OooOOOo
        public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super C32460OooOooO> continuation) {
            return ((OooO00o) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
        }

        @Override // oO00ooo.AbstractC32477OooO00o
        public final Object invokeSuspend(Object obj) {
            EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
            int i = this.f110513OooOo0o;
            if (i == 0) {
                C32446OooOOOo.OooO0O0(obj);
                C30933OooO0o0 c30933OooO0o0 = this.f110512OooOo;
                Float f = new Float(this.f110514OooOoO0);
                this.f110513OooOo0o = 1;
                C33781o00o0O c33781o00o0O = c30933OooO0o0.f110525OooOO0O;
                c33781o00o0O.getClass();
                c33781o00o0O.OooOO0(null, f);
                if (C32460OooOooO.f116667OooO00o == enumC32485OooO00o) {
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

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C30932OooO0Oo(C30933OooO0o0 c30933OooO0o0, String str, Continuation<? super C30932OooO0Oo> continuation) {
        super(2, continuation);
        this.f110511OooOoO0 = c30933OooO0o0;
        this.f110510OooOoO = str;
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
        C30932OooO0Oo c30932OooO0Oo = new C30932OooO0Oo(this.f110511OooOoO0, this.f110510OooOoO, continuation);
        c30932OooO0Oo.f110508OooOo = obj;
        return c30932OooO0Oo;
    }

    @Override // oO0O000o.InterfaceC32508OooOOOo
    public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super C32460OooOooO> continuation) {
        return ((C30932OooO0Oo) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
    }

    /* JADX WARN: Code restructure failed: missing block: B:30:0x00aa, code lost:
    
        if (r12.emit(r1, r11) != r0) goto L32;
     */
    /* JADX WARN: Removed duplicated region for block: B:25:0x008e  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00a0 A[PHI: r1
      0x00a0: PHI (r1v12 o0OOOo0.OooO0O0) = (r1v11 o0OOOo0.OooO0O0), (r1v17 o0OOOo0.OooO0O0) binds: [B:27:0x009d, B:12:0x0029] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // oO00ooo.AbstractC32477OooO00o
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) throws Throwable {
        InterfaceC33636Oooo00o interfaceC33636Oooo00o;
        Object obj2;
        C27174OooO0O0 c27174OooO0O0;
        C33772OooooOo c33772OooooOo;
        Boolean bool;
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i = this.f110509OooOo0o;
        String str = this.f110510OooOoO;
        C30933OooO0o0 c30933OooO0o0 = this.f110511OooOoO0;
        C33781o00o0O c33781o00o0O = c30933OooO0o0.f110521OooO0o0;
        if (i == 0) {
            C32446OooOOOo.OooO0O0(obj);
            interfaceC33636Oooo00o = (InterfaceC33636Oooo00o) this.f110508OooOo;
            this.f110508OooOo = interfaceC33636Oooo00o;
            this.f110509OooOo0o = 1;
            c33781o00o0O.getClass();
            c33781o00o0O.OooOO0(null, str);
            if (C32460OooOooO.f116667OooO00o != enumC32485OooO00o) {
            }
            return enumC32485OooO00o;
        }
        if (i == 1) {
            interfaceC33636Oooo00o = (InterfaceC33636Oooo00o) this.f110508OooOo;
            C32446OooOOOo.OooO0O0(obj);
        } else {
            if (i == 2) {
                C32446OooOOOo.OooO0O0(obj);
                this.f110508OooOo = obj;
                this.f110509OooOo0o = 3;
                c33781o00o0O.getClass();
                c33781o00o0O.OooOO0(null, "");
                if (C32460OooOooO.f116667OooO00o != enumC32485OooO00o) {
                    obj2 = obj;
                    c27174OooO0O0 = (C27174OooO0O0) obj2;
                    c33772OooooOo = c30933OooO0o0.f110518OooO;
                    bool = Boolean.TRUE;
                    this.f110508OooOo = c27174OooO0O0;
                    this.f110509OooOo0o = 4;
                    if (c33772OooooOo.emit(bool, this) != enumC32485OooO00o) {
                    }
                }
                return enumC32485OooO00o;
            }
            if (i == 3) {
                obj2 = this.f110508OooOo;
                C32446OooOOOo.OooO0O0(obj);
                c27174OooO0O0 = (C27174OooO0O0) obj2;
                c33772OooooOo = c30933OooO0o0.f110518OooO;
                bool = Boolean.TRUE;
                this.f110508OooOo = c27174OooO0O0;
                this.f110509OooOo0o = 4;
                if (c33772OooooOo.emit(bool, this) != enumC32485OooO00o) {
                    C33772OooooOo c33772OooooOo2 = c30933OooO0o0.f110522OooO0oO;
                    this.f110508OooOo = null;
                    this.f110509OooOo0o = 5;
                }
                return enumC32485OooO00o;
            }
            if (i != 4) {
                if (i != 5) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C32446OooOOOo.OooO0O0(obj);
                return C32460OooOooO.f116667OooO00o;
            }
            c27174OooO0O0 = (C27174OooO0O0) this.f110508OooOo;
            C32446OooOOOo.OooO0O0(obj);
            C33772OooooOo c33772OooooOo22 = c30933OooO0o0.f110522OooO0oO;
            this.f110508OooOo = null;
            this.f110509OooOo0o = 5;
        }
        C30931OooO0OO c30931OooO0OO = new C30931OooO0OO(0, interfaceC33636Oooo00o, c30933OooO0o0);
        this.f110508OooOo = null;
        this.f110509OooOo0o = 2;
        C27538o00o0o0O c27538o00o0o0O = c30933OooO0o0.f110519OooO0Oo;
        c27538o00o0o0O.getClass();
        C33874OooO0OO c33874OooO0OO = C33649OoooOOo.f121328OooO00o;
        obj = C33609OooO0oo.OooO0o(ExecutorC33873OooO0O0.f122045OooOoO0, new C27512o00o0(c27538o00o0o0O, str, c30931OooO0OO, null), this);
        if (obj != enumC32485OooO00o) {
            this.f110508OooOo = obj;
            this.f110509OooOo0o = 3;
            c33781o00o0O.getClass();
            c33781o00o0O.OooOO0(null, "");
            if (C32460OooOooO.f116667OooO00o != enumC32485OooO00o) {
            }
        }
        return enumC32485OooO00o;
    }
}
