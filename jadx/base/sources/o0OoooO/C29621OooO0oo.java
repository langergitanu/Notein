package o0OoooO;

import com.google.firebase.vertexai.type.GenerateContentResponse;
import kotlin.coroutines.Continuation;
import o0OOOo0.C27174OooO0O0;
import oO00ooO.C32446OooOOOo;
import oO00ooO.C32460OooOooO;
import oO00ooo.AbstractC32479OooO0OO;
import oO00ooo.InterfaceC32482OooO0o0;
import oO00ooo0.EnumC32485OooO00o;
import oO0o0Oo.InterfaceC33721OooO0o;
import oO0o0Oo.InterfaceC33723OooO0oO;

/* JADX INFO: renamed from: o0OoooO.OooO0oo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C29621OooO0oo implements InterfaceC33721OooO0o<C27174OooO0O0<String>> {

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final /* synthetic */ InterfaceC33721OooO0o f105014OooOo0o;

    /* JADX INFO: renamed from: o0OoooO.OooO0oo$OooO00o */
    public static final class OooO00o<T> implements InterfaceC33723OooO0oO {

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public final /* synthetic */ InterfaceC33723OooO0oO f105015OooOo0o;

        /* JADX INFO: renamed from: o0OoooO.OooO0oo$OooO00o$OooO00o, reason: collision with other inner class name */
        @InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.noteeditor.propertypanel.ai.assistant.GeminiAssistant$chatWithAiAssistantStream$lambda$6$$inlined$map$1$2", m80623f = "GeminiAssistant.kt", m80624l = {50}, m80625m = "emit")
        public static final class C20011OooO00o extends AbstractC32479OooO0OO {

            /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
            public int f105016OooOo;

            /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
            public /* synthetic */ Object f105017OooOo0o;

            public C20011OooO00o(Continuation continuation) {
                super(continuation);
            }

            @Override // oO00ooo.AbstractC32477OooO00o
            public final Object invokeSuspend(Object obj) {
                this.f105017OooOo0o = obj;
                this.f105016OooOo |= Integer.MIN_VALUE;
                return OooO00o.this.emit(null, this);
            }
        }

        public OooO00o(InterfaceC33723OooO0oO interfaceC33723OooO0oO) {
            this.f105015OooOo0o = interfaceC33723OooO0oO;
        }

        /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
        @Override // oO0o0Oo.InterfaceC33723OooO0oO
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object emit(Object obj, Continuation continuation) {
            C20011OooO00o c20011OooO00o;
            if (continuation instanceof C20011OooO00o) {
                c20011OooO00o = (C20011OooO00o) continuation;
                int i = c20011OooO00o.f105016OooOo;
                if ((i & Integer.MIN_VALUE) != 0) {
                    c20011OooO00o.f105016OooOo = i - Integer.MIN_VALUE;
                } else {
                    c20011OooO00o = new C20011OooO00o(continuation);
                }
            }
            Object obj2 = c20011OooO00o.f105017OooOo0o;
            EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
            int i2 = c20011OooO00o.f105016OooOo;
            if (i2 == 0) {
                C32446OooOOOo.OooO0O0(obj2);
                C27174OooO0O0 c27174OooO0O0 = new C27174OooO0O0("0", null, ((GenerateContentResponse) obj).getText(), true);
                c20011OooO00o.f105016OooOo = 1;
                if (this.f105015OooOo0o.emit(c27174OooO0O0, c20011OooO00o) == enumC32485OooO00o) {
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

    public C29621OooO0oo(InterfaceC33721OooO0o interfaceC33721OooO0o) {
        this.f105014OooOo0o = interfaceC33721OooO0o;
    }

    @Override // oO0o0Oo.InterfaceC33721OooO0o
    public final Object collect(InterfaceC33723OooO0oO<? super C27174OooO0O0<String>> interfaceC33723OooO0oO, Continuation continuation) {
        Object objCollect = this.f105014OooOo0o.collect(new OooO00o(interfaceC33723OooO0oO), continuation);
        return objCollect == EnumC32485OooO00o.f116726OooOo0o ? objCollect : C32460OooOooO.f116667OooO00o;
    }
}
