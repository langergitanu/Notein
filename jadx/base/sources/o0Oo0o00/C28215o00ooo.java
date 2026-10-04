package o0Oo0o00;

import java.util.ArrayList;
import java.util.List;
import kotlin.coroutines.Continuation;
import o0oOoOo.C31032OooO0OO;
import oO00ooO.C32446OooOOOo;
import oO00ooO.C32460OooOooO;
import oO00ooo.AbstractC32479OooO0OO;
import oO00ooo.InterfaceC32482OooO0o0;
import oO00ooo0.EnumC32485OooO00o;
import oO0o0Oo.C33769Ooooo0o;
import oO0o0Oo.InterfaceC33721OooO0o;
import oO0o0Oo.InterfaceC33723OooO0oO;

/* JADX INFO: renamed from: o0Oo0o00.o00ooo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C28215o00ooo implements InterfaceC33721OooO0o<Integer> {

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final /* synthetic */ C33769Ooooo0o f100018OooOo0o;

    /* JADX INFO: renamed from: o0Oo0o00.o00ooo$OooO00o */
    public static final class OooO00o<T> implements InterfaceC33723OooO0oO {

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public final /* synthetic */ InterfaceC33723OooO0oO f100019OooOo0o;

        /* JADX INFO: renamed from: o0Oo0o00.o00ooo$OooO00o$OooO00o, reason: collision with other inner class name */
        @InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.datasync.CloudSyncViewModel$special$$inlined$map$2$2", m80623f = "CloudSyncViewModel.kt", m80624l = {50}, m80625m = "emit")
        public static final class C19897OooO00o extends AbstractC32479OooO0OO {

            /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
            public int f100020OooOo;

            /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
            public /* synthetic */ Object f100021OooOo0o;

            public C19897OooO00o(Continuation continuation) {
                super(continuation);
            }

            @Override // oO00ooo.AbstractC32477OooO00o
            public final Object invokeSuspend(Object obj) {
                this.f100021OooOo0o = obj;
                this.f100020OooOo |= Integer.MIN_VALUE;
                return OooO00o.this.emit(null, this);
            }
        }

        public OooO00o(InterfaceC33723OooO0oO interfaceC33723OooO0oO) {
            this.f100019OooOo0o = interfaceC33723OooO0oO;
        }

        /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
        @Override // oO0o0Oo.InterfaceC33723OooO0oO
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object emit(Object obj, Continuation continuation) {
            C19897OooO00o c19897OooO00o;
            if (continuation instanceof C19897OooO00o) {
                c19897OooO00o = (C19897OooO00o) continuation;
                int i = c19897OooO00o.f100020OooOo;
                if ((i & Integer.MIN_VALUE) != 0) {
                    c19897OooO00o.f100020OooOo = i - Integer.MIN_VALUE;
                } else {
                    c19897OooO00o = new C19897OooO00o(continuation);
                }
            }
            Object obj2 = c19897OooO00o.f100021OooOo0o;
            EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
            int i2 = c19897OooO00o.f100020OooOo;
            if (i2 == 0) {
                C32446OooOOOo.OooO0O0(obj2);
                ArrayList arrayList = new ArrayList();
                for (T t : (List) obj) {
                    C31032OooO0OO c31032OooO0OO = (C31032OooO0OO) t;
                    if (c31032OooO0OO.f110785OooO0Oo || c31032OooO0OO.f110784OooO0OO || c31032OooO0OO.f110786OooO0o0 != null) {
                        arrayList.add(t);
                    }
                }
                Integer num = new Integer(arrayList.size());
                c19897OooO00o.f100020OooOo = 1;
                if (this.f100019OooOo0o.emit(num, c19897OooO00o) == enumC32485OooO00o) {
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

    public C28215o00ooo(C33769Ooooo0o c33769Ooooo0o) {
        this.f100018OooOo0o = c33769Ooooo0o;
    }

    @Override // oO0o0Oo.InterfaceC33721OooO0o
    public final Object collect(InterfaceC33723OooO0oO<? super Integer> interfaceC33723OooO0oO, Continuation continuation) {
        Object objCollect = this.f100018OooOo0o.f121747OooOo0o.collect(new OooO00o(interfaceC33723OooO0oO), continuation);
        return objCollect == EnumC32485OooO00o.f116726OooOo0o ? objCollect : C32460OooOooO.f116667OooO00o;
    }
}
