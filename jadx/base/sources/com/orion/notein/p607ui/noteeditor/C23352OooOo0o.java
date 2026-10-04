package com.orion.notein.p607ui.noteeditor;

import android.os.SystemClock;
import com.aspose.words.EditingLanguage;
import com.orion.notein.p607ui.noteeditor.C23344OooOOo;
import kotlin.coroutines.Continuation;
import oO00ooO.C32446OooOOOo;
import oO00ooO.C32460OooOooO;
import oO00ooo.AbstractC32476OooO;
import oO00ooo.InterfaceC32482OooO0o0;
import oO00ooo0.EnumC32485OooO00o;
import oO0O000o.InterfaceC32508OooOOOo;
import oO0o0OO.C33609OooO0oo;
import oO0o0OO.C33644OoooO0;
import oO0o0OO.C33649OoooOOo;
import oO0o0OO.InterfaceC33636Oooo00o;
import oO0o0o0o.C33874OooO0OO;
import oO0o0o0o.ExecutorC33873OooO0O0;
import oO0o0oOo.C33898OooO0Oo;

/* JADX INFO: renamed from: com.orion.notein.ui.noteeditor.OooOo0o, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
@InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.noteeditor.NoteEditorViewModel$throttleUpdatePageMeta$2$1", m80623f = "NoteEditorViewModel.kt", m80624l = {EditingLanguage.MALTESE, 1938, EditingLanguage.GUJARATI, 1949}, m80625m = "invokeSuspend")
public final class C23352OooOo0o extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super C32460OooOooO>, Object> {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public C23344OooOOo f73678OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public C33898OooO0Oo f73679OooOo0o;

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public final /* synthetic */ long f73680OooOoO;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public int f73681OooOoO0;

    /* JADX INFO: renamed from: OooOoOO, reason: collision with root package name */
    public final /* synthetic */ C23344OooOOo f73682OooOoOO;

    /* JADX INFO: renamed from: com.orion.notein.ui.noteeditor.OooOo0o$OooO00o */
    @InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.noteeditor.NoteEditorViewModel$throttleUpdatePageMeta$2$1$1", m80623f = "NoteEditorViewModel.kt", m80624l = {EditingLanguage.ORIYA, EditingLanguage.ASSAMESE}, m80625m = "invokeSuspend")
    public static final class OooO00o extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super C32460OooOooO>, Object> {

        /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
        public final /* synthetic */ C23344OooOOo f73683OooOo;

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public int f73684OooOo0o;

        /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
        public final /* synthetic */ C23344OooOOo.C23346OooO0o0 f73685OooOoO0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO00o(C23344OooOOo c23344OooOOo, C23344OooOOo.C23346OooO0o0 c23346OooO0o0, Continuation<? super OooO00o> continuation) {
            super(2, continuation);
            this.f73683OooOo = c23344OooOOo;
            this.f73685OooOoO0 = c23346OooO0o0;
        }

        @Override // oO00ooo.AbstractC32477OooO00o
        public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
            return new OooO00o(this.f73683OooOo, this.f73685OooOoO0, continuation);
        }

        @Override // oO0O000o.InterfaceC32508OooOOOo
        public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super C32460OooOooO> continuation) {
            return ((OooO00o) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
        }

        /* JADX WARN: Code restructure failed: missing block: B:14:0x0041, code lost:
        
            if (r3.f73545OooO0Oo.OoooOo0(r2.f73631OooO00o, r11) == r0) goto L15;
         */
        @Override // oO00ooo.AbstractC32477OooO00o
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            OooO00o oooO00o;
            EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
            int i = this.f73684OooOo0o;
            C23344OooOOo.C23346OooO0o0 c23346OooO0o0 = this.f73685OooOoO0;
            C23344OooOOo c23344OooOOo = this.f73683OooOo;
            if (i == 0) {
                C32446OooOOOo.OooO0O0(obj);
                this.f73684OooOo0o = 1;
                oooO00o = this;
                if (c23344OooOOo.f73545OooO0Oo.Ooooo0o(c23346OooO0o0.f73632OooO0O0, c23346OooO0o0.f73633OooO0OO, c23346OooO0o0.f73631OooO00o, oooO00o) != enumC32485OooO00o) {
                }
                return enumC32485OooO00o;
            }
            if (i != 1) {
                if (i != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C32446OooOOOo.OooO0O0(obj);
                return C32460OooOooO.f116667OooO00o;
            }
            C32446OooOOOo.OooO0O0(obj);
            oooO00o = this;
            oooO00o.f73684OooOo0o = 2;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C23352OooOo0o(long j, C23344OooOOo c23344OooOOo, Continuation<? super C23352OooOo0o> continuation) {
        super(2, continuation);
        this.f73680OooOoO = j;
        this.f73682OooOoOO = c23344OooOOo;
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
        return new C23352OooOo0o(this.f73680OooOoO, this.f73682OooOoOO, continuation);
    }

    @Override // oO0O000o.InterfaceC32508OooOOOo
    public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super C32460OooOooO> continuation) {
        return ((C23352OooOo0o) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
    }

    /* JADX WARN: Code restructure failed: missing block: B:36:0x0090, code lost:
    
        if (r7.OooO00o(r11) != r0) goto L48;
     */
    /* JADX WARN: Removed duplicated region for block: B:23:0x005b A[Catch: all -> 0x0062, TryCatch #0 {all -> 0x0062, blocks: (B:21:0x0055, B:23:0x005b, B:27:0x0066), top: B:46:0x0055 }] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0066 A[Catch: all -> 0x0062, TRY_LEAVE, TryCatch #0 {all -> 0x0062, blocks: (B:21:0x0055, B:23:0x005b, B:27:0x0066), top: B:46:0x0055 }] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0070  */
    @Override // oO00ooo.AbstractC32477OooO00o
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        C23344OooOOo c23344OooOOo;
        C33898OooO0Oo c33898OooO0Oo;
        C23344OooOOo.C23346OooO0o0 c23346OooO0o0;
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i = this.f73681OooOoO0;
        C23344OooOOo c23344OooOOo2 = this.f73682OooOoOO;
        C33898OooO0Oo c33898OooO0Oo2 = c23344OooOOo2.f73597OooooOo;
        if (i == 0) {
            C32446OooOOOo.OooO0O0(obj);
            this.f73681OooOoO0 = 1;
            if (C33644OoooO0.OooO00o(this.f73680OooOoO, this) != enumC32485OooO00o) {
            }
            return enumC32485OooO00o;
        }
        if (i == 1) {
            C32446OooOOOo.OooO0O0(obj);
        } else {
            if (i == 2) {
                c23344OooOOo = this.f73678OooOo;
                c33898OooO0Oo = this.f73679OooOo0o;
                C32446OooOOOo.OooO0O0(obj);
                try {
                    c23346OooO0o0 = c23344OooOOo.f73598Oooooo;
                    c23344OooOOo.f73598Oooooo = null;
                    if (c23346OooO0o0 != null) {
                        c23344OooOOo.f73599Oooooo0 = SystemClock.elapsedRealtime();
                    }
                    if (c23346OooO0o0 == null) {
                        c23344OooOOo.f73600OoooooO = null;
                    }
                    if (c23346OooO0o0 != null) {
                        return C32460OooOooO.f116667OooO00o;
                    }
                    C33874OooO0OO c33874OooO0OO = C33649OoooOOo.f121328OooO00o;
                    ExecutorC33873OooO0O0 executorC33873OooO0O0 = ExecutorC33873OooO0O0.f122045OooOoO0;
                    OooO00o oooO00o = new OooO00o(c23344OooOOo2, c23346OooO0o0, null);
                    this.f73679OooOo0o = null;
                    this.f73678OooOo = null;
                    this.f73681OooOoO0 = 3;
                    if (C33609OooO0oo.OooO0o(executorC33873OooO0O0, oooO00o, this) != enumC32485OooO00o) {
                        this.f73679OooOo0o = c33898OooO0Oo2;
                        this.f73678OooOo = c23344OooOOo2;
                        this.f73681OooOoO0 = 4;
                    }
                    return enumC32485OooO00o;
                } catch (Throwable th) {
                    throw th;
                }
            }
            if (i != 3) {
                if (i != 4) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                c23344OooOOo2 = this.f73678OooOo;
                c33898OooO0Oo2 = this.f73679OooOo0o;
                C32446OooOOOo.OooO0O0(obj);
                try {
                    c23344OooOOo2.f73600OoooooO = null;
                    C32460OooOooO c32460OooOooO = C32460OooOooO.f116667OooO00o;
                    c33898OooO0Oo2.OooOOO0(null);
                    return C32460OooOooO.f116667OooO00o;
                } finally {
                    c33898OooO0Oo2.OooOOO0(null);
                }
            }
            C32446OooOOOo.OooO0O0(obj);
            this.f73679OooOo0o = c33898OooO0Oo2;
            this.f73678OooOo = c23344OooOOo2;
            this.f73681OooOoO0 = 4;
        }
        this.f73679OooOo0o = c33898OooO0Oo2;
        this.f73678OooOo = c23344OooOOo2;
        this.f73681OooOoO0 = 2;
        if (c33898OooO0Oo2.OooO00o(this) != enumC32485OooO00o) {
            c23344OooOOo = c23344OooOOo2;
            c33898OooO0Oo = c33898OooO0Oo2;
            c23346OooO0o0 = c23344OooOOo.f73598Oooooo;
            c23344OooOOo.f73598Oooooo = null;
            if (c23346OooO0o0 != null) {
            }
            if (c23346OooO0o0 == null) {
            }
            if (c23346OooO0o0 != null) {
            }
        }
        return enumC32485OooO00o;
    }
}
