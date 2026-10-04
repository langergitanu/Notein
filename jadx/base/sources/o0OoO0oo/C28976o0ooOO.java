package o0OoO0oo;

import kotlin.coroutines.Continuation;
import o0OO00o0.C26534o0000o0O;
import oO00ooO.C32446OooOOOo;
import oO00ooO.C32460OooOooO;
import oO00ooo.AbstractC32479OooO0OO;
import oO00ooo.InterfaceC32482OooO0o0;
import oO00ooo0.EnumC32485OooO00o;
import oO0o0Oo.InterfaceC33721OooO0o;
import oO0o0Oo.InterfaceC33723OooO0oO;

/* JADX INFO: renamed from: o0OoO0oo.o0ooOO, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C28976o0ooOO implements InterfaceC33721OooO0o<Float> {

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final /* synthetic */ C26534o0000o0O f102670OooOo0o;

    /* JADX INFO: renamed from: o0OoO0oo.o0ooOO$OooO00o */
    public static final class OooO00o<T> implements InterfaceC33723OooO0oO {

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public final /* synthetic */ InterfaceC33723OooO0oO f102671OooOo0o;

        /* JADX INFO: renamed from: o0OoO0oo.o0ooOO$OooO00o$OooO00o, reason: collision with other inner class name */
        @InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.noteeditor.NoteEditorViewModel$special$$inlined$map$1$2", m80623f = "NoteEditorViewModel.kt", m80624l = {50}, m80625m = "emit")
        public static final class C19947OooO00o extends AbstractC32479OooO0OO {

            /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
            public int f102672OooOo;

            /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
            public /* synthetic */ Object f102673OooOo0o;

            public C19947OooO00o(Continuation continuation) {
                super(continuation);
            }

            @Override // oO00ooo.AbstractC32477OooO00o
            public final Object invokeSuspend(Object obj) {
                this.f102673OooOo0o = obj;
                this.f102672OooOo |= Integer.MIN_VALUE;
                return OooO00o.this.emit(null, this);
            }
        }

        public OooO00o(InterfaceC33723OooO0oO interfaceC33723OooO0oO) {
            this.f102671OooOo0o = interfaceC33723OooO0oO;
        }

        /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
        @Override // oO0o0Oo.InterfaceC33723OooO0oO
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object emit(Object obj, Continuation continuation) {
            C19947OooO00o c19947OooO00o;
            if (continuation instanceof C19947OooO00o) {
                c19947OooO00o = (C19947OooO00o) continuation;
                int i = c19947OooO00o.f102672OooOo;
                if ((i & Integer.MIN_VALUE) != 0) {
                    c19947OooO00o.f102672OooOo = i - Integer.MIN_VALUE;
                } else {
                    c19947OooO00o = new C19947OooO00o(continuation);
                }
            }
            Object obj2 = c19947OooO00o.f102673OooOo0o;
            EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
            int i2 = c19947OooO00o.f102672OooOo;
            if (i2 == 0) {
                C32446OooOOOo.OooO0O0(obj2);
                Float f = new Float(1.0f - (((Number) obj).floatValue() * 0.9f));
                c19947OooO00o.f102672OooOo = 1;
                if (this.f102671OooOo0o.emit(f, c19947OooO00o) == enumC32485OooO00o) {
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

    public C28976o0ooOO(C26534o0000o0O c26534o0000o0O) {
        this.f102670OooOo0o = c26534o0000o0O;
    }

    @Override // oO0o0Oo.InterfaceC33721OooO0o
    public final Object collect(InterfaceC33723OooO0oO<? super Float> interfaceC33723OooO0oO, Continuation continuation) {
        Object objCollect = this.f102670OooOo0o.collect(new OooO00o(interfaceC33723OooO0oO), continuation);
        return objCollect == EnumC32485OooO00o.f116726OooOo0o ? objCollect : C32460OooOooO.f116667OooO00o;
    }
}
