package o0o0O0O0;

import java.util.ArrayList;
import java.util.List;
import kotlin.coroutines.Continuation;
import o0oOoOo.C31039OooOO0O;
import oO00ooO.C32446OooOOOo;
import oO00ooO.C32460OooOooO;
import oO00ooo.AbstractC32479OooO0OO;
import oO00ooo.InterfaceC32482OooO0o0;
import oO00ooo0.EnumC32485OooO00o;
import oO0o0Oo.C33769Ooooo0o;
import oO0o0Oo.InterfaceC33721OooO0o;
import oO0o0Oo.InterfaceC33723OooO0oO;

/* JADX INFO: renamed from: o0o0O0O0.OooOO0o, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C30272OooOO0o implements InterfaceC33721OooO0o<Integer> {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final /* synthetic */ OooOOO0 f107890OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final /* synthetic */ C33769Ooooo0o f107891OooOo0o;

    /* JADX INFO: renamed from: o0o0O0O0.OooOO0o$OooO00o */
    public static final class OooO00o<T> implements InterfaceC33723OooO0oO {

        /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
        public final /* synthetic */ OooOOO0 f107892OooOo;

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public final /* synthetic */ InterfaceC33723OooO0oO f107893OooOo0o;

        /* JADX INFO: renamed from: o0o0O0O0.OooOO0o$OooO00o$OooO00o, reason: collision with other inner class name */
        @InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.notelist.pdf.ImportPdfViewModel$special$$inlined$map$1$2", m80623f = "ImportPdfViewModel.kt", m80624l = {50}, m80625m = "emit")
        public static final class C20061OooO00o extends AbstractC32479OooO0OO {

            /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
            public int f107894OooOo;

            /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
            public /* synthetic */ Object f107895OooOo0o;

            public C20061OooO00o(Continuation continuation) {
                super(continuation);
            }

            @Override // oO00ooo.AbstractC32477OooO00o
            public final Object invokeSuspend(Object obj) {
                this.f107895OooOo0o = obj;
                this.f107894OooOo |= Integer.MIN_VALUE;
                return OooO00o.this.emit(null, this);
            }
        }

        public OooO00o(InterfaceC33723OooO0oO interfaceC33723OooO0oO, OooOOO0 oooOOO0) {
            this.f107893OooOo0o = interfaceC33723OooO0oO;
            this.f107892OooOo = oooOOO0;
        }

        /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
        @Override // oO0o0Oo.InterfaceC33723OooO0oO
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object emit(Object obj, Continuation continuation) {
            C20061OooO00o c20061OooO00o;
            if (continuation instanceof C20061OooO00o) {
                c20061OooO00o = (C20061OooO00o) continuation;
                int i = c20061OooO00o.f107894OooOo;
                if ((i & Integer.MIN_VALUE) != 0) {
                    c20061OooO00o.f107894OooOo = i - Integer.MIN_VALUE;
                } else {
                    c20061OooO00o = new C20061OooO00o(continuation);
                }
            }
            Object obj2 = c20061OooO00o.f107895OooOo0o;
            EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
            int i2 = c20061OooO00o.f107894OooOo;
            if (i2 == 0) {
                C32446OooOOOo.OooO0O0(obj2);
                List list = (List) obj;
                ArrayList arrayList = new ArrayList();
                for (T t : list) {
                    if (((C31039OooOO0O) t).f110820OooO0o0) {
                        arrayList.add(t);
                    }
                }
                int size = arrayList.size();
                ArrayList arrayList2 = new ArrayList();
                for (T t2 : list) {
                    if (!((C31039OooOO0O) t2).f110818OooO0OO) {
                        arrayList2.add(t2);
                    }
                }
                Integer num = new Integer((size == 0 || !((Boolean) this.f107892OooOo.f107900OooO0o0.getValue()).booleanValue()) ? 0 : size == arrayList2.size() ? 2 : 1);
                c20061OooO00o.f107894OooOo = 1;
                if (this.f107893OooOo0o.emit(num, c20061OooO00o) == enumC32485OooO00o) {
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

    public C30272OooOO0o(C33769Ooooo0o c33769Ooooo0o, OooOOO0 oooOOO0) {
        this.f107891OooOo0o = c33769Ooooo0o;
        this.f107890OooOo = oooOOO0;
    }

    @Override // oO0o0Oo.InterfaceC33721OooO0o
    public final Object collect(InterfaceC33723OooO0oO<? super Integer> interfaceC33723OooO0oO, Continuation continuation) {
        Object objCollect = this.f107891OooOo0o.f121747OooOo0o.collect(new OooO00o(interfaceC33723OooO0oO, this.f107890OooOo), continuation);
        return objCollect == EnumC32485OooO00o.f116726OooOo0o ? objCollect : C32460OooOooO.f116667OooO00o;
    }
}
