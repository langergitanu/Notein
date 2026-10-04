package o0o00oOo;

import com.orion.notein.p607ui.p609vo.NoteVO;
import java.util.ArrayList;
import java.util.List;
import kotlin.coroutines.Continuation;
import oO00ooO.C32446OooOOOo;
import oO00ooO.C32460OooOooO;
import oO00ooo.AbstractC32479OooO0OO;
import oO00ooo.InterfaceC32482OooO0o0;
import oO00ooo0.EnumC32485OooO00o;
import oO0o0Oo.C33769Ooooo0o;
import oO0o0Oo.InterfaceC33721OooO0o;
import oO0o0Oo.InterfaceC33723OooO0oO;

/* JADX INFO: loaded from: classes10.dex */
public final class o00000O0 implements InterfaceC33721OooO0o<List<? extends NoteVO>> {

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final /* synthetic */ C33769Ooooo0o f107045OooOo0o;

    public static final class OooO00o<T> implements InterfaceC33723OooO0oO {

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public final /* synthetic */ InterfaceC33723OooO0oO f107046OooOo0o;

        /* JADX INFO: renamed from: o0o00oOo.o00000O0$OooO00o$OooO00o, reason: collision with other inner class name */
        @InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.notelist.NoteListViewModel$special$$inlined$map$8$2", m80623f = "NoteListViewModel.kt", m80624l = {50}, m80625m = "emit")
        public static final class C20040OooO00o extends AbstractC32479OooO0OO {

            /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
            public int f107047OooOo;

            /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
            public /* synthetic */ Object f107048OooOo0o;

            public C20040OooO00o(Continuation continuation) {
                super(continuation);
            }

            @Override // oO00ooo.AbstractC32477OooO00o
            public final Object invokeSuspend(Object obj) {
                this.f107048OooOo0o = obj;
                this.f107047OooOo |= Integer.MIN_VALUE;
                return OooO00o.this.emit(null, this);
            }
        }

        public OooO00o(InterfaceC33723OooO0oO interfaceC33723OooO0oO) {
            this.f107046OooOo0o = interfaceC33723OooO0oO;
        }

        /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
        @Override // oO0o0Oo.InterfaceC33723OooO0oO
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object emit(Object obj, Continuation continuation) {
            C20040OooO00o c20040OooO00o;
            if (continuation instanceof C20040OooO00o) {
                c20040OooO00o = (C20040OooO00o) continuation;
                int i = c20040OooO00o.f107047OooOo;
                if ((i & Integer.MIN_VALUE) != 0) {
                    c20040OooO00o.f107047OooOo = i - Integer.MIN_VALUE;
                } else {
                    c20040OooO00o = new C20040OooO00o(continuation);
                }
            }
            Object obj2 = c20040OooO00o.f107048OooOo0o;
            EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
            int i2 = c20040OooO00o.f107047OooOo;
            if (i2 == 0) {
                C32446OooOOOo.OooO0O0(obj2);
                ArrayList arrayList = new ArrayList();
                for (T t : (List) obj) {
                    if (((NoteVO) t).isSelected()) {
                        arrayList.add(t);
                    }
                }
                c20040OooO00o.f107047OooOo = 1;
                if (this.f107046OooOo0o.emit(arrayList, c20040OooO00o) == enumC32485OooO00o) {
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

    public o00000O0(C33769Ooooo0o c33769Ooooo0o) {
        this.f107045OooOo0o = c33769Ooooo0o;
    }

    @Override // oO0o0Oo.InterfaceC33721OooO0o
    public final Object collect(InterfaceC33723OooO0oO<? super List<? extends NoteVO>> interfaceC33723OooO0oO, Continuation continuation) {
        Object objCollect = this.f107045OooOo0o.f121747OooOo0o.collect(new OooO00o(interfaceC33723OooO0oO), continuation);
        return objCollect == EnumC32485OooO00o.f116726OooOo0o ? objCollect : C32460OooOooO.f116667OooO00o;
    }
}
