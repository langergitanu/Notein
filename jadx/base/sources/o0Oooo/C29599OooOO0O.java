package o0Oooo;

import androidx.lifecycle.o0OoOo0;
import com.facebook.soloader.OooOo;
import com.orion.notein.global.R;
import java.util.Collection;
import java.util.concurrent.CancellationException;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.C24034Oooo00O;
import o000oooo.C24761OooO;
import o0OOOo0.C27174OooO0O0;
import o0OoooO.C29629OooOOo0;
import o0OoooOO.C29633OooO00o;
import oO00ooO.C32446OooOOOo;
import oO00ooO.C32460OooOooO;
import oO00ooOO.C32465OooO0O0;
import oO00ooo.AbstractC32476OooO;
import oO00ooo.InterfaceC32482OooO0o0;
import oO00ooo0.EnumC32485OooO00o;
import oO0O000o.InterfaceC32508OooOOOo;
import oO0o0OO.C33609OooO0oo;
import oO0o0OO.C33649OoooOOo;
import oO0o0OO.InterfaceC33636Oooo00o;
import oO0o0OO.o00000OO;
import oO0o0Oo.C33734OooOOoo;
import oO0o0Oo.C33772OooooOo;
import oO0o0Oo.C33781o00o0O;
import oO0o0Oo.InterfaceC33721OooO0o;
import oO0o0o0o.C33874OooO0OO;
import oO0o0o0o.ExecutorC33873OooO0O0;
import oOO00oo.C34406OooO00o;

/* JADX INFO: renamed from: o0Oooo.OooOO0O, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
@InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.noteeditor.propertypanel.ai.EditorAiViewModel$sendMessage$1", m80623f = "EditorAiViewModel.kt", m80624l = {415}, m80625m = "invokeSuspend")
public final class C29599OooOO0O extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super C32460OooOooO>, Object> {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final /* synthetic */ com.orion.notein.p607ui.noteeditor.propertypanel.p608ai.OooO00o f104959OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public int f104960OooOo0o;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public final /* synthetic */ String f104961OooOoO0;

    /* JADX INFO: renamed from: o0Oooo.OooOO0O$OooO00o */
    @InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.noteeditor.propertypanel.ai.EditorAiViewModel$sendMessage$1$1", m80623f = "EditorAiViewModel.kt", m80624l = {424, 437, 439, 443, 457, 461}, m80625m = "invokeSuspend")
    public static final class OooO00o extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super C32460OooOooO>, Object> {

        /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
        public C27174OooO0O0 f104962OooOo;

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public String f104963OooOo0o;

        /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
        public final /* synthetic */ com.orion.notein.p607ui.noteeditor.propertypanel.p608ai.OooO00o f104964OooOoO;

        /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
        public int f104965OooOoO0;

        /* JADX INFO: renamed from: OooOoOO, reason: collision with root package name */
        public final /* synthetic */ String f104966OooOoOO;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO00o(com.orion.notein.p607ui.noteeditor.propertypanel.p608ai.OooO00o oooO00o, String str, Continuation<? super OooO00o> continuation) {
            super(2, continuation);
            this.f104964OooOoO = oooO00o;
            this.f104966OooOoOO = str;
        }

        @Override // oO00ooo.AbstractC32477OooO00o
        public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
            return new OooO00o(this.f104964OooOoO, this.f104966OooOoOO, continuation);
        }

        @Override // oO0O000o.InterfaceC32508OooOOOo
        public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super C32460OooOooO> continuation) {
            return ((OooO00o) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
        }

        /* JADX WARN: Code restructure failed: missing block: B:15:0x0072, code lost:
        
            if (r15.emit(r5, r23) == r1) goto L61;
         */
        /* JADX WARN: Code restructure failed: missing block: B:22:0x00d1, code lost:
        
            if (r2 == r1) goto L61;
         */
        /* JADX WARN: Code restructure failed: missing block: B:31:0x00ff, code lost:
        
            if (r2 == r1) goto L61;
         */
        /* JADX WARN: Code restructure failed: missing block: B:38:0x0113, code lost:
        
            if (r2 == r1) goto L61;
         */
        /* JADX WARN: Code restructure failed: missing block: B:52:0x0178, code lost:
        
            if (r15.emit(r16, r23) == r1) goto L61;
         */
        /* JADX WARN: Removed duplicated region for block: B:27:0x00db  */
        /* JADX WARN: Removed duplicated region for block: B:35:0x0106  */
        /* JADX WARN: Removed duplicated region for block: B:43:0x011d  */
        /* JADX WARN: Removed duplicated region for block: B:45:0x0132  */
        /* JADX WARN: Removed duplicated region for block: B:65:0x01a8  */
        /* JADX WARN: Removed duplicated region for block: B:67:0x01c9  */
        @Override // oO00ooo.AbstractC32477OooO00o
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) throws Throwable {
            String str;
            InterfaceC33721OooO0o interfaceC33721OooO0o;
            Object objOooO0O0;
            C27174OooO0O0 c27174OooO0O0;
            Object objOooO00o;
            Object objOooO0o;
            C27174OooO0O0 c27174OooO0O02;
            String str2;
            EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
            int i = this.f104965OooOoO0;
            String str3 = this.f104966OooOoOO;
            com.orion.notein.p607ui.noteeditor.propertypanel.p608ai.OooO00o oooO00o = this.f104964OooOoO;
            C33772OooooOo c33772OooooOo = oooO00o.f75617OooOooO;
            switch (i) {
                case 0:
                    C32446OooOOOo.OooO0O0(obj);
                    if (com.orion.notein.p607ui.noteeditor.propertypanel.p608ai.OooO00o.OooO0o(oooO00o)) {
                        String strOooO00o = C24761OooO.OooO00o("toString(...)");
                        C32465OooO0O0 c32465OooO0O0OooO0Oo = OooOo.OooO0Oo();
                        C33781o00o0O c33781o00o0O = oooO00o.f75607OooOo;
                        c32465OooO0O0OooO0Oo.addAll((Collection) c33781o00o0O.getValue());
                        c32465OooO0O0OooO0Oo.add(new C29633OooO00o(C24761OooO.OooO00o("toString(...)"), str3, true, System.currentTimeMillis(), 0));
                        str = strOooO00o;
                        c32465OooO0O0OooO0Oo.add(new C29633OooO00o(strOooO00o, "...", false, System.currentTimeMillis(), 0));
                        c33781o00o0O.setValue(OooOo.OooO0O0(c32465OooO0O0OooO0Oo));
                        C29629OooOOo0 c29629OooOOo0 = oooO00o.f75600OooOOO;
                        if (c29629OooOOo0 != null) {
                            this.f104963OooOo0o = str;
                            this.f104965OooOoO0 = 2;
                            objOooO0O0 = c29629OooOOo0.OooO0O0(str3, this);
                        } else {
                            interfaceC33721OooO0o = null;
                            if (interfaceC33721OooO0o == null) {
                                this.f104963OooOo0o = null;
                                this.f104965OooOoO0 = 3;
                                C24034Oooo00O c24034Oooo00O = new C24034Oooo00O();
                                c24034Oooo00O.f80942OooOo0o = "";
                                Object objCollect = new C33734OooOOoo(interfaceC33721OooO0o, new C29589OooO(oooO00o, c24034Oooo00O, str, null)).collect(new C29598OooOO0(oooO00o, c24034Oooo00O, str), this);
                                if (objCollect != enumC32485OooO00o) {
                                    objCollect = C32460OooOooO.f116667OooO00o;
                                }
                            } else {
                                C29629OooOOo0 c29629OooOOo02 = oooO00o.f75600OooOOO;
                                if (c29629OooOOo02 != null) {
                                    this.f104963OooOo0o = str;
                                    this.f104965OooOoO0 = 4;
                                    objOooO00o = c29629OooOOo02.OooO00o(str3, this);
                                } else {
                                    c27174OooO0O0 = null;
                                    if (c27174OooO0O0 != null) {
                                        C34406OooO00o.C20358OooO00o c20358OooO00o = C34406OooO00o.f123390OooO00o;
                                        c20358OooO00o.OooOOO0("EditorChatViewModel");
                                        c20358OooO00o.OooO0OO("sendMessage: failed to generate response", new Object[0]);
                                        com.orion.notein.p607ui.noteeditor.propertypanel.p608ai.OooO00o.OooO0oO(oooO00o, str, "An error occurred.");
                                        return C32460OooOooO.f116667OooO00o;
                                    }
                                    if (!kotlin.jvm.internal.OooOOO0.OooO0O0(c27174OooO0O0.getErrorCode(), "0")) {
                                        C34406OooO00o.C20358OooO00o c20358OooO00o2 = C34406OooO00o.f123390OooO00o;
                                        c20358OooO00o2.OooOOO0("EditorChatViewModel");
                                        c20358OooO00o2.OooO0OO(com.alibaba.sdk.android.oss.internal.OooO00o.OooO00o("sendMessage: failed to generate response. ", c27174OooO0O0.getErrorCode()), new Object[0]);
                                        String errorCode = c27174OooO0O0.getErrorCode();
                                        String errorMsg = c27174OooO0O0.getErrorMsg();
                                        C27174OooO0O0 c27174OooO0O03 = new C27174OooO0O0(false, null, errorCode, errorMsg == null ? "" : errorMsg, 2);
                                        this.f104963OooOo0o = null;
                                        this.f104965OooOoO0 = 5;
                                    } else {
                                        String str4 = (String) c27174OooO0O0.OooO0O0();
                                        if (str4 == null) {
                                            str4 = "";
                                        }
                                        this.f104963OooOo0o = str;
                                        this.f104962OooOo = c27174OooO0O0;
                                        this.f104965OooOoO0 = 6;
                                        C33874OooO0OO c33874OooO0OO = C33649OoooOOo.f121328OooO00o;
                                        objOooO0o = C33609OooO0oo.OooO0o(ExecutorC33873OooO0O0.f122045OooOoO0, new C29595OooO0o0(oooO00o, str4, null), this);
                                        if (objOooO0o != enumC32485OooO00o) {
                                            c27174OooO0O02 = c27174OooO0O0;
                                            str2 = str;
                                            if (!((Boolean) objOooO0o).booleanValue()) {
                                                String str5 = (String) c27174OooO0O02.OooO0O0();
                                                com.orion.notein.p607ui.noteeditor.propertypanel.p608ai.OooO00o.OooO0oO(oooO00o, str2, str5 != null ? str5 : "");
                                                return C32460OooOooO.f116667OooO00o;
                                            }
                                            C34406OooO00o.C20358OooO00o c20358OooO00o3 = C34406OooO00o.f123390OooO00o;
                                            c20358OooO00o3.OooOOO0("EditorChatViewModel");
                                            c20358OooO00o3.OooO0OO("sendMessage: failed to notify quota cost", new Object[0]);
                                            String string = oooO00o.f75597OooOO0.getString(R.string.error_can_not_notify_quota_cost);
                                            kotlin.jvm.internal.OooOOO0.OooO0o(string, "getString(...)");
                                            com.orion.notein.p607ui.noteeditor.propertypanel.p608ai.OooO00o.OooO0oO(oooO00o, str2, string);
                                            return C32460OooOooO.f116667OooO00o;
                                        }
                                    }
                                }
                            }
                        }
                        break;
                    } else {
                        C34406OooO00o.C20358OooO00o c20358OooO00o4 = C34406OooO00o.f123390OooO00o;
                        c20358OooO00o4.OooOOO0("EditorChatViewModel");
                        c20358OooO00o4.OooO0OO("sendMessage: app version is too low", new Object[0]);
                        C27174OooO0O0 c27174OooO0O04 = new C27174OooO0O0(false, null, "199997", "App version is too low. Please update the app to the latest version.", 2);
                        this.f104965OooOoO0 = 1;
                        break;
                    }
                    return enumC32485OooO00o;
                case 1:
                    C32446OooOOOo.OooO0O0(obj);
                    return C32460OooOooO.f116667OooO00o;
                case 2:
                    String str6 = this.f104963OooOo0o;
                    C32446OooOOOo.OooO0O0(obj);
                    str = str6;
                    objOooO0O0 = obj;
                    interfaceC33721OooO0o = (InterfaceC33721OooO0o) objOooO0O0;
                    if (interfaceC33721OooO0o == null) {
                    }
                    return enumC32485OooO00o;
                case 3:
                    C32446OooOOOo.OooO0O0(obj);
                    return C32460OooOooO.f116667OooO00o;
                case 4:
                    String str7 = this.f104963OooOo0o;
                    C32446OooOOOo.OooO0O0(obj);
                    str = str7;
                    objOooO00o = obj;
                    c27174OooO0O0 = (C27174OooO0O0) objOooO00o;
                    if (c27174OooO0O0 != null) {
                    }
                    break;
                case 5:
                    C32446OooOOOo.OooO0O0(obj);
                    return C32460OooOooO.f116667OooO00o;
                case 6:
                    c27174OooO0O02 = this.f104962OooOo;
                    str2 = this.f104963OooOo0o;
                    C32446OooOOOo.OooO0O0(obj);
                    objOooO0o = obj;
                    if (!((Boolean) objOooO0o).booleanValue()) {
                    }
                    break;
                default:
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C29599OooOO0O(com.orion.notein.p607ui.noteeditor.propertypanel.p608ai.OooO00o oooO00o, String str, Continuation<? super C29599OooOO0O> continuation) {
        super(2, continuation);
        this.f104959OooOo = oooO00o;
        this.f104961OooOoO0 = str;
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
        return new C29599OooOO0O(this.f104959OooOo, this.f104961OooOoO0, continuation);
    }

    @Override // oO0O000o.InterfaceC32508OooOOOo
    public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super C32460OooOooO> continuation) {
        return ((C29599OooOO0O) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Object invokeSuspend(Object obj) throws Throwable {
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i = this.f104960OooOo0o;
        com.orion.notein.p607ui.noteeditor.propertypanel.p608ai.OooO00o oooO00o = this.f104959OooOo;
        if (i == 0) {
            C32446OooOOOo.OooO0O0(obj);
            o00000OO o00000oo2 = oooO00o.f75615OooOoo;
            if (o00000oo2 != null) {
                this.f104960OooOo0o = 1;
                o00000oo2.cancel((CancellationException) null);
                Object objJoin = o00000oo2.join(this);
                if (objJoin != enumC32485OooO00o) {
                    objJoin = C32460OooOooO.f116667OooO00o;
                }
                if (objJoin == enumC32485OooO00o) {
                    return enumC32485OooO00o;
                }
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C32446OooOOOo.OooO0O0(obj);
        }
        InterfaceC33636Oooo00o interfaceC33636Oooo00oOooO00o = o0OoOo0.OooO00o(oooO00o);
        C33874OooO0OO c33874OooO0OO = C33649OoooOOo.f121328OooO00o;
        oooO00o.f75615OooOoo = C33609OooO0oo.OooO0OO(interfaceC33636Oooo00oOooO00o, ExecutorC33873OooO0O0.f122045OooOoO0, null, new OooO00o(oooO00o, this.f104961OooOoO0, null), 2);
        return C32460OooOooO.f116667OooO00o;
    }
}
