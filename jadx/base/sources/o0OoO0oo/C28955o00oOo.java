package o0OoO0oo;

import com.orion.notein.p607ui.noteeditor.C23344OooOOo;
import kotlin.coroutines.Continuation;
import oO00ooO.C32446OooOOOo;
import oO00ooO.C32460OooOooO;
import oO00ooo.AbstractC32479OooO0OO;
import oO00ooo.InterfaceC32482OooO0o0;
import oO00ooo0.EnumC32485OooO00o;
import oO0o0Oo.C33759OoooO0;
import oO0o0Oo.InterfaceC33721OooO0o;
import oO0o0Oo.InterfaceC33723OooO0oO;

/* JADX INFO: renamed from: o0OoO0oo.o00oOo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C28955o00oOo implements InterfaceC33721OooO0o<C23344OooOOo.OooO0O0> {

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final /* synthetic */ C33759OoooO0 f102596OooOo0o;

    /* JADX INFO: renamed from: o0OoO0oo.o00oOo$OooO00o */
    public static final class OooO00o<T> implements InterfaceC33723OooO0oO {

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public final /* synthetic */ InterfaceC33723OooO0oO f102597OooOo0o;

        /* JADX INFO: renamed from: o0OoO0oo.o00oOo$OooO00o$OooO00o, reason: collision with other inner class name */
        @InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.noteeditor.NoteEditorViewModel$special$$inlined$filter$2$2", m80623f = "NoteEditorViewModel.kt", m80624l = {50}, m80625m = "emit")
        public static final class C19945OooO00o extends AbstractC32479OooO0OO {

            /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
            public int f102598OooOo;

            /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
            public /* synthetic */ Object f102599OooOo0o;

            public C19945OooO00o(Continuation continuation) {
                super(continuation);
            }

            @Override // oO00ooo.AbstractC32477OooO00o
            public final Object invokeSuspend(Object obj) {
                this.f102599OooOo0o = obj;
                this.f102598OooOo |= Integer.MIN_VALUE;
                return OooO00o.this.emit(null, this);
            }
        }

        public OooO00o(InterfaceC33723OooO0oO interfaceC33723OooO0oO) {
            this.f102597OooOo0o = interfaceC33723OooO0oO;
        }

        /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
        @Override // oO0o0Oo.InterfaceC33723OooO0oO
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object emit(Object obj, Continuation continuation) {
            C19945OooO00o c19945OooO00o;
            if (continuation instanceof C19945OooO00o) {
                c19945OooO00o = (C19945OooO00o) continuation;
                int i = c19945OooO00o.f102598OooOo;
                if ((i & Integer.MIN_VALUE) != 0) {
                    c19945OooO00o.f102598OooOo = i - Integer.MIN_VALUE;
                } else {
                    c19945OooO00o = new C19945OooO00o(continuation);
                }
            }
            Object obj2 = c19945OooO00o.f102599OooOo0o;
            EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
            int i2 = c19945OooO00o.f102598OooOo;
            if (i2 == 0) {
                C32446OooOOOo.OooO0O0(obj2);
                if (((C23344OooOOo.OooO0O0) obj).f73623OooO0OO) {
                    c19945OooO00o.f102598OooOo = 1;
                    if (this.f102597OooOo0o.emit(obj, c19945OooO00o) == enumC32485OooO00o) {
                        return enumC32485OooO00o;
                    }
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

    public C28955o00oOo(C33759OoooO0 c33759OoooO0) {
        this.f102596OooOo0o = c33759OoooO0;
    }

    @Override // oO0o0Oo.InterfaceC33721OooO0o
    public final Object collect(InterfaceC33723OooO0oO<? super C23344OooOOo.OooO0O0> interfaceC33723OooO0oO, Continuation continuation) {
        Object objCollect = this.f102596OooOo0o.collect(new OooO00o(interfaceC33723OooO0oO), continuation);
        return objCollect == EnumC32485OooO00o.f116726OooOo0o ? objCollect : C32460OooOooO.f116667OooO00o;
    }
}
