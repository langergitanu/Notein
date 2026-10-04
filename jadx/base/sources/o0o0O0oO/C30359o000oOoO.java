package o0o0O0oO;

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

/* JADX INFO: renamed from: o0o0O0oO.o000oOoO, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C30359o000oOoO implements InterfaceC33721OooO0o<List<? extends NoteVO>> {

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final /* synthetic */ C33769Ooooo0o f108288OooOo0o;

    /* JADX INFO: renamed from: o0o0O0oO.o000oOoO$OooO00o */
    public static final class OooO00o<T> implements InterfaceC33723OooO0oO {

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public final /* synthetic */ InterfaceC33723OooO0oO f108289OooOo0o;

        /* JADX INFO: renamed from: o0o0O0oO.o000oOoO$OooO00o$OooO00o, reason: collision with other inner class name */
        @InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.notelist.trashbin.TrashBinListViewModel$special$$inlined$map$4$2", m80623f = "TrashBinListViewModel.kt", m80624l = {50}, m80625m = "emit")
        public static final class C20069OooO00o extends AbstractC32479OooO0OO {

            /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
            public int f108290OooOo;

            /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
            public /* synthetic */ Object f108291OooOo0o;

            public C20069OooO00o(Continuation continuation) {
                super(continuation);
            }

            @Override // oO00ooo.AbstractC32477OooO00o
            public final Object invokeSuspend(Object obj) {
                this.f108291OooOo0o = obj;
                this.f108290OooOo |= Integer.MIN_VALUE;
                return OooO00o.this.emit(null, this);
            }
        }

        public OooO00o(InterfaceC33723OooO0oO interfaceC33723OooO0oO) {
            this.f108289OooOo0o = interfaceC33723OooO0oO;
        }

        /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
        @Override // oO0o0Oo.InterfaceC33723OooO0oO
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object emit(Object obj, Continuation continuation) {
            C20069OooO00o c20069OooO00o;
            if (continuation instanceof C20069OooO00o) {
                c20069OooO00o = (C20069OooO00o) continuation;
                int i = c20069OooO00o.f108290OooOo;
                if ((i & Integer.MIN_VALUE) != 0) {
                    c20069OooO00o.f108290OooOo = i - Integer.MIN_VALUE;
                } else {
                    c20069OooO00o = new C20069OooO00o(continuation);
                }
            }
            Object obj2 = c20069OooO00o.f108291OooOo0o;
            EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
            int i2 = c20069OooO00o.f108290OooOo;
            if (i2 == 0) {
                C32446OooOOOo.OooO0O0(obj2);
                ArrayList arrayList = new ArrayList();
                for (T t : (List) obj) {
                    if (((NoteVO) t).isSelected()) {
                        arrayList.add(t);
                    }
                }
                c20069OooO00o.f108290OooOo = 1;
                if (this.f108289OooOo0o.emit(arrayList, c20069OooO00o) == enumC32485OooO00o) {
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

    public C30359o000oOoO(C33769Ooooo0o c33769Ooooo0o) {
        this.f108288OooOo0o = c33769Ooooo0o;
    }

    @Override // oO0o0Oo.InterfaceC33721OooO0o
    public final Object collect(InterfaceC33723OooO0oO<? super List<? extends NoteVO>> interfaceC33723OooO0oO, Continuation continuation) {
        Object objCollect = this.f108288OooOo0o.f121747OooOo0o.collect(new OooO00o(interfaceC33723OooO0oO), continuation);
        return objCollect == EnumC32485OooO00o.f116726OooOo0o ? objCollect : C32460OooOooO.f116667OooO00o;
    }
}
