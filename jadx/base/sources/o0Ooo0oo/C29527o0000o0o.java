package o0Ooo0oo;

import com.orion.notein.p607ui.p609vo.PenVO;
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

/* JADX INFO: renamed from: o0Ooo0oo.o0000o0o, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C29527o0000o0o implements InterfaceC33721OooO0o<List<? extends PenVO>> {

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final /* synthetic */ C33769Ooooo0o f104733OooOo0o;

    /* JADX INFO: renamed from: o0Ooo0oo.o0000o0o$OooO00o */
    public static final class OooO00o<T> implements InterfaceC33723OooO0oO {

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public final /* synthetic */ InterfaceC33723OooO0oO f104734OooOo0o;

        /* JADX INFO: renamed from: o0Ooo0oo.o0000o0o$OooO00o$OooO00o, reason: collision with other inner class name */
        @InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.noteeditor.penbar.PenBarViewModel$special$$inlined$map$1$2", m80623f = "PenBarViewModel.kt", m80624l = {50}, m80625m = "emit")
        public static final class C20000OooO00o extends AbstractC32479OooO0OO {

            /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
            public int f104735OooOo;

            /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
            public /* synthetic */ Object f104736OooOo0o;

            public C20000OooO00o(Continuation continuation) {
                super(continuation);
            }

            @Override // oO00ooo.AbstractC32477OooO00o
            public final Object invokeSuspend(Object obj) {
                this.f104736OooOo0o = obj;
                this.f104735OooOo |= Integer.MIN_VALUE;
                return OooO00o.this.emit(null, this);
            }
        }

        public OooO00o(InterfaceC33723OooO0oO interfaceC33723OooO0oO) {
            this.f104734OooOo0o = interfaceC33723OooO0oO;
        }

        /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
        @Override // oO0o0Oo.InterfaceC33723OooO0oO
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object emit(Object obj, Continuation continuation) {
            C20000OooO00o c20000OooO00o;
            if (continuation instanceof C20000OooO00o) {
                c20000OooO00o = (C20000OooO00o) continuation;
                int i = c20000OooO00o.f104735OooOo;
                if ((i & Integer.MIN_VALUE) != 0) {
                    c20000OooO00o.f104735OooOo = i - Integer.MIN_VALUE;
                } else {
                    c20000OooO00o = new C20000OooO00o(continuation);
                }
            }
            Object obj2 = c20000OooO00o.f104736OooOo0o;
            EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
            int i2 = c20000OooO00o.f104735OooOo;
            if (i2 == 0) {
                C32446OooOOOo.OooO0O0(obj2);
                ArrayList arrayList = new ArrayList();
                for (T t : (List) obj) {
                    PenVO penVO = (PenVO) t;
                    if (penVO.getType() == 0 || penVO.getType() == 1) {
                        arrayList.add(t);
                    }
                }
                c20000OooO00o.f104735OooOo = 1;
                if (this.f104734OooOo0o.emit(arrayList, c20000OooO00o) == enumC32485OooO00o) {
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

    public C29527o0000o0o(C33769Ooooo0o c33769Ooooo0o) {
        this.f104733OooOo0o = c33769Ooooo0o;
    }

    @Override // oO0o0Oo.InterfaceC33721OooO0o
    public final Object collect(InterfaceC33723OooO0oO<? super List<? extends PenVO>> interfaceC33723OooO0oO, Continuation continuation) {
        Object objCollect = this.f104733OooOo0o.f121747OooOo0o.collect(new OooO00o(interfaceC33723OooO0oO), continuation);
        return objCollect == EnumC32485OooO00o.f116726OooOo0o ? objCollect : C32460OooOooO.f116667OooO00o;
    }
}
