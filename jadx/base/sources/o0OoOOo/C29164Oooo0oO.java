package o0OoOOo;

import androidx.lifecycle.o0OoOo0;
import kotlin.coroutines.Continuation;
import o0000oOO.AbstractC24338OooO0o0;
import o0OOo0oO.C27610OooO0o0;
import oO00ooO.C32446OooOOOo;
import oO00ooO.C32460OooOooO;
import oO00ooo.AbstractC32476OooO;
import oO00ooo.InterfaceC32482OooO0o0;
import oO00ooo0.EnumC32485OooO00o;
import oO0O000o.InterfaceC32507OooOO0o;
import oO0O000o.InterfaceC32508OooOOOo;
import oO0o0OO.C33609OooO0oo;
import oO0o0OO.C33649OoooOOo;
import oO0o0OO.InterfaceC33636Oooo00o;
import oO0o0o0o.C33874OooO0OO;
import oO0o0o0o.ExecutorC33873OooO0O0;

/* JADX INFO: renamed from: o0OoOOo.Oooo0oO, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
@InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.noteeditor.audio.NoteAudioViewModel$setNoteId$1", m80623f = "NoteAudioViewModel.kt", m80624l = {416, 419, 422, 425}, m80625m = "invokeSuspend")
public final class C29164Oooo0oO extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super C32460OooOooO>, Object> {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public int f103388OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public String f103389OooOo0o;

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public final /* synthetic */ String f103390OooOoO;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public final /* synthetic */ com.orion.notein.p607ui.noteeditor.audio.OooO0o f103391OooOoO0;

    /* JADX INFO: renamed from: o0OoOOo.Oooo0oO$OooO00o */
    @InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.noteeditor.audio.NoteAudioViewModel$setNoteId$1$1", m80623f = "NoteAudioViewModel.kt", m80624l = {417}, m80625m = "invokeSuspend")
    public static final class OooO00o extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super C32460OooOooO>, Object> {

        /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
        public final /* synthetic */ com.orion.notein.p607ui.noteeditor.audio.OooO0o f103392OooOo;

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public int f103393OooOo0o;

        /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
        public final /* synthetic */ String f103394OooOoO0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO00o(com.orion.notein.p607ui.noteeditor.audio.OooO0o oooO0o, String str, Continuation<? super OooO00o> continuation) {
            super(2, continuation);
            this.f103392OooOo = oooO0o;
            this.f103394OooOoO0 = str;
        }

        @Override // oO00ooo.AbstractC32477OooO00o
        public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
            return new OooO00o(this.f103392OooOo, this.f103394OooOoO0, continuation);
        }

        @Override // oO0O000o.InterfaceC32508OooOOOo
        public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super C32460OooOooO> continuation) {
            return ((OooO00o) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
        }

        @Override // oO00ooo.AbstractC32477OooO00o
        public final Object invokeSuspend(Object obj) {
            EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
            int i = this.f103393OooOo0o;
            if (i == 0) {
                C32446OooOOOo.OooO0O0(obj);
                C27610OooO0o0 c27610OooO0o0 = this.f103392OooOo.f74223OooO0o;
                this.f103393OooOo0o = 1;
                Object objOooOOo0 = c27610OooO0o0.f97084OooO00o.OooOOo0(this.f103394OooOoO0, this);
                if (objOooOOo0 != enumC32485OooO00o) {
                    objOooOOo0 = C32460OooOooO.f116667OooO00o;
                }
                if (objOooOOo0 == enumC32485OooO00o) {
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

    /* JADX INFO: renamed from: o0OoOOo.Oooo0oO$OooO0O0 */
    @InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.noteeditor.audio.NoteAudioViewModel$setNoteId$1$2", m80623f = "NoteAudioViewModel.kt", m80624l = {}, m80625m = "invokeSuspend")
    public static final class OooO0O0 extends AbstractC32476OooO implements InterfaceC32507OooOO0o<Continuation<? super C32460OooOooO>, Object> {

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public final /* synthetic */ com.orion.notein.p607ui.noteeditor.audio.OooO0o f103395OooOo0o;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO0O0(com.orion.notein.p607ui.noteeditor.audio.OooO0o oooO0o, Continuation<? super OooO0O0> continuation) {
            super(1, continuation);
            this.f103395OooOo0o = oooO0o;
        }

        @Override // oO00ooo.AbstractC32477OooO00o
        public final Continuation<C32460OooOooO> create(Continuation<?> continuation) {
            return new OooO0O0(this.f103395OooOo0o, continuation);
        }

        @Override // oO0O000o.InterfaceC32507OooOO0o
        public final Object invoke(Continuation<? super C32460OooOooO> continuation) {
            return ((OooO0O0) create(continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
        }

        @Override // oO00ooo.AbstractC32477OooO00o
        public final Object invokeSuspend(Object obj) {
            EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
            C32446OooOOOo.OooO0O0(obj);
            AbstractC24338OooO0o0.OooO00o<Float> oooO00o = com.orion.notein.p607ui.noteeditor.audio.OooO0o.f74218OoooO0O;
            this.f103395OooOo0o.OooOo0o();
            return C32460OooOooO.f116667OooO00o;
        }
    }

    /* JADX INFO: renamed from: o0OoOOo.Oooo0oO$OooO0OO */
    @InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.noteeditor.audio.NoteAudioViewModel$setNoteId$1$3", m80623f = "NoteAudioViewModel.kt", m80624l = {}, m80625m = "invokeSuspend")
    public static final class OooO0OO extends AbstractC32476OooO implements InterfaceC32507OooOO0o<Continuation<? super C32460OooOooO>, Object> {

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public final /* synthetic */ com.orion.notein.p607ui.noteeditor.audio.OooO0o f103396OooOo0o;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO0OO(com.orion.notein.p607ui.noteeditor.audio.OooO0o oooO0o, Continuation<? super OooO0OO> continuation) {
            super(1, continuation);
            this.f103396OooOo0o = oooO0o;
        }

        @Override // oO00ooo.AbstractC32477OooO00o
        public final Continuation<C32460OooOooO> create(Continuation<?> continuation) {
            return new OooO0OO(this.f103396OooOo0o, continuation);
        }

        @Override // oO0O000o.InterfaceC32507OooOO0o
        public final Object invoke(Continuation<? super C32460OooOooO> continuation) {
            return ((OooO0OO) create(continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
        }

        @Override // oO00ooo.AbstractC32477OooO00o
        public final Object invokeSuspend(Object obj) {
            EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
            C32446OooOOOo.OooO0O0(obj);
            AbstractC24338OooO0o0.OooO00o<Float> oooO00o = com.orion.notein.p607ui.noteeditor.audio.OooO0o.f74218OoooO0O;
            this.f103396OooOo0o.OooOo();
            return C32460OooOooO.f116667OooO00o;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C29164Oooo0oO(com.orion.notein.p607ui.noteeditor.audio.OooO0o oooO0o, String str, Continuation<? super C29164Oooo0oO> continuation) {
        super(2, continuation);
        this.f103391OooOoO0 = oooO0o;
        this.f103390OooOoO = str;
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
        return new C29164Oooo0oO(this.f103391OooOoO0, this.f103390OooOoO, continuation);
    }

    @Override // oO0O000o.InterfaceC32508OooOOOo
    public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super C32460OooOooO> continuation) {
        return ((C29164Oooo0oO) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:0x0089, code lost:
    
        if (r11 == r0) goto L36;
     */
    /* JADX WARN: Removed duplicated region for block: B:34:0x009f A[PHI: r11
      0x009f: PHI (r11v13 java.lang.String) = (r11v11 java.lang.String), (r11v19 java.lang.String) binds: [B:32:0x009c, B:11:0x0026] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00af  */
    @Override // oO00ooo.AbstractC32477OooO00o
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) throws Throwable {
        String str;
        String str2;
        OooO0O0 oooO0O0;
        OooO0OO oooO0OO;
        String str3;
        Object obj2 = EnumC32485OooO00o.f116726OooOo0o;
        int i = this.f103388OooOo;
        String str4 = this.f103390OooOoO;
        com.orion.notein.p607ui.noteeditor.audio.OooO0o oooO0o = this.f103391OooOoO0;
        if (i == 0) {
            C32446OooOOOo.OooO0O0(obj);
            str = (String) oooO0o.f74230OooOOO.getValue();
            if (kotlin.jvm.internal.OooOOO0.OooO0O0(str, str4)) {
                return C32460OooOooO.f116667OooO00o;
            }
            oooO0o.f74230OooOOO.setValue(str4);
            if (str4.length() > 0) {
                C33874OooO0OO c33874OooO0OO = C33649OoooOOo.f121328OooO00o;
                ExecutorC33873OooO0O0 executorC33873OooO0O0 = ExecutorC33873OooO0O0.f122045OooOoO0;
                OooO00o oooO00o = new OooO00o(oooO0o, str4, null);
                this.f103389OooOo0o = str;
                this.f103388OooOo = 1;
                if (C33609OooO0oo.OooO0o(executorC33873OooO0O0, oooO00o, this) != obj2) {
                    str2 = str;
                }
            } else {
                oooO0O0 = new OooO0O0(oooO0o, null);
                this.f103389OooOo0o = str;
                this.f103388OooOo = 3;
                AbstractC24338OooO0o0.OooO00o<Float> oooO00o2 = com.orion.notein.p607ui.noteeditor.audio.OooO0o.f74218OoooO0O;
                if (oooO0o.Oooo0o(oooO0O0, this) != obj2) {
                }
            }
            return obj2;
        }
        if (i != 1) {
            if (i == 2) {
                str2 = this.f103389OooOo0o;
                C32446OooOOOo.OooO0O0(obj);
                str = str2;
                oooO0O0 = new OooO0O0(oooO0o, null);
                this.f103389OooOo0o = str;
                this.f103388OooOo = 3;
                AbstractC24338OooO0o0.OooO00o<Float> oooO00o22 = com.orion.notein.p607ui.noteeditor.audio.OooO0o.f74218OoooO0O;
                if (oooO0o.Oooo0o(oooO0O0, this) != obj2) {
                    oooO0OO = new OooO0OO(oooO0o, null);
                    this.f103389OooOo0o = str;
                    this.f103388OooOo = 4;
                    if (com.orion.notein.p607ui.noteeditor.audio.OooO0o.OooOO0o(oooO0o, oooO0OO, this) != obj2) {
                    }
                }
                return obj2;
            }
            if (i != 3) {
                if (i != 4) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                str3 = this.f103389OooOo0o;
                C32446OooOOOo.OooO0O0(obj);
                if ((str3 != null || str3.length() == 0) && str4.length() > 0) {
                    AbstractC24338OooO0o0.OooO00o<Float> oooO00o3 = com.orion.notein.p607ui.noteeditor.audio.OooO0o.f74218OoooO0O;
                    oooO0o.getClass();
                    InterfaceC33636Oooo00o interfaceC33636Oooo00oOooO00o = o0OoOo0.OooO00o(oooO0o);
                    C33874OooO0OO c33874OooO0OO2 = C33649OoooOOo.f121328OooO00o;
                    C33609OooO0oo.OooO0OO(interfaceC33636Oooo00oOooO00o, ExecutorC33873OooO0O0.f122045OooOoO0, null, new C29150OooOoO(oooO0o, null), 2);
                }
                return C32460OooOooO.f116667OooO00o;
            }
            String str5 = this.f103389OooOo0o;
            C32446OooOOOo.OooO0O0(obj);
            str = str5;
            oooO0OO = new OooO0OO(oooO0o, null);
            this.f103389OooOo0o = str;
            this.f103388OooOo = 4;
            if (com.orion.notein.p607ui.noteeditor.audio.OooO0o.OooOO0o(oooO0o, oooO0OO, this) != obj2) {
                str3 = str;
                if (str3 != null) {
                    AbstractC24338OooO0o0.OooO00o<Float> oooO00o32 = com.orion.notein.p607ui.noteeditor.audio.OooO0o.f74218OoooO0O;
                    oooO0o.getClass();
                    InterfaceC33636Oooo00o interfaceC33636Oooo00oOooO00o2 = o0OoOo0.OooO00o(oooO0o);
                    C33874OooO0OO c33874OooO0OO22 = C33649OoooOOo.f121328OooO00o;
                    C33609OooO0oo.OooO0OO(interfaceC33636Oooo00oOooO00o2, ExecutorC33873OooO0O0.f122045OooOoO0, null, new C29150OooOoO(oooO0o, null), 2);
                } else {
                    AbstractC24338OooO0o0.OooO00o<Float> oooO00o322 = com.orion.notein.p607ui.noteeditor.audio.OooO0o.f74218OoooO0O;
                    oooO0o.getClass();
                    InterfaceC33636Oooo00o interfaceC33636Oooo00oOooO00o22 = o0OoOo0.OooO00o(oooO0o);
                    C33874OooO0OO c33874OooO0OO222 = C33649OoooOOo.f121328OooO00o;
                    C33609OooO0oo.OooO0OO(interfaceC33636Oooo00oOooO00o22, ExecutorC33873OooO0O0.f122045OooOoO0, null, new C29150OooOoO(oooO0o, null), 2);
                }
                return C32460OooOooO.f116667OooO00o;
            }
            return obj2;
        }
        str2 = this.f103389OooOo0o;
        C32446OooOOOo.OooO0O0(obj);
        this.f103389OooOo0o = str2;
        this.f103388OooOo = 2;
        AbstractC24338OooO0o0.OooO00o<Float> oooO00o4 = com.orion.notein.p607ui.noteeditor.audio.OooO0o.f74218OoooO0O;
        oooO0o.getClass();
        C33874OooO0OO c33874OooO0OO3 = C33649OoooOOo.f121328OooO00o;
        Object objOooO0o = C33609OooO0oo.OooO0o(ExecutorC33873OooO0O0.f122045OooOoO0, new C29179OooooOO(oooO0o, str4, null), this);
        if (objOooO0o != obj2) {
            objOooO0o = C32460OooOooO.f116667OooO00o;
        }
    }
}
