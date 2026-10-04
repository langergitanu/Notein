package o0oOO0Oo;

import com.orion.notein.p607ui.p609vo.SortKeyVO;
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
import oOo000Oo.C34428OooOOo;

/* JADX INFO: renamed from: o0oOO0Oo.OooOo0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C30819OooOo0 implements InterfaceC33721OooO0o<List<? extends SortKeyVO>> {

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final /* synthetic */ C33769Ooooo0o f110149OooOo0o;

    /* JADX INFO: renamed from: o0oOO0Oo.OooOo0$OooO00o */
    public static final class OooO00o<T> implements InterfaceC33723OooO0oO {

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public final /* synthetic */ InterfaceC33723OooO0oO f110150OooOo0o;

        /* JADX INFO: renamed from: o0oOO0Oo.OooOo0$OooO00o$OooO00o, reason: collision with other inner class name */
        @InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.noteeditor.noteswitch.NoteSwitchViewModel$special$$inlined$map$2$2", m80623f = "NoteSwitchViewModel.kt", m80624l = {50}, m80625m = "emit")
        public static final class C20129OooO00o extends AbstractC32479OooO0OO {

            /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
            public int f110151OooOo;

            /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
            public /* synthetic */ Object f110152OooOo0o;

            public C20129OooO00o(Continuation continuation) {
                super(continuation);
            }

            @Override // oO00ooo.AbstractC32477OooO00o
            public final Object invokeSuspend(Object obj) {
                this.f110152OooOo0o = obj;
                this.f110151OooOo |= Integer.MIN_VALUE;
                return OooO00o.this.emit(null, this);
            }
        }

        public OooO00o(InterfaceC33723OooO0oO interfaceC33723OooO0oO) {
            this.f110150OooOo0o = interfaceC33723OooO0oO;
        }

        /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
        @Override // oO0o0Oo.InterfaceC33723OooO0oO
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object emit(Object obj, Continuation continuation) {
            C20129OooO00o c20129OooO00o;
            if (continuation instanceof C20129OooO00o) {
                c20129OooO00o = (C20129OooO00o) continuation;
                int i = c20129OooO00o.f110151OooOo;
                if ((i & Integer.MIN_VALUE) != 0) {
                    c20129OooO00o.f110151OooOo = i - Integer.MIN_VALUE;
                } else {
                    c20129OooO00o = new C20129OooO00o(continuation);
                }
            }
            Object obj2 = c20129OooO00o.f110152OooOo0o;
            EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
            int i2 = c20129OooO00o.f110151OooOo;
            if (i2 == 0) {
                C32446OooOOOo.OooO0O0(obj2);
                com.orion.notein.p607ui.p609vo.OooO00o oooO00o = (com.orion.notein.p607ui.p609vo.OooO00o) obj;
                com.orion.notein.p607ui.p609vo.OooO00o.f80086OooOoO0.getClass();
                com.orion.notein.p607ui.p609vo.OooO00o[] oooO00oArrValues = com.orion.notein.p607ui.p609vo.OooO00o.values();
                ArrayList<com.orion.notein.p607ui.p609vo.OooO00o> arrayList = new ArrayList();
                for (com.orion.notein.p607ui.p609vo.OooO00o oooO00o2 : oooO00oArrValues) {
                    if (oooO00o2 == com.orion.notein.p607ui.p609vo.OooO00o.f80085OooOoO || oooO00o2 == com.orion.notein.p607ui.p609vo.OooO00o.f80087OooOoOO || oooO00o2 == com.orion.notein.p607ui.p609vo.OooO00o.f80088OooOoo || oooO00o2 == com.orion.notein.p607ui.p609vo.OooO00o.f80090OooOooO || oooO00o2 == com.orion.notein.p607ui.p609vo.OooO00o.f80091OooOooo || oooO00o2 == com.orion.notein.p607ui.p609vo.OooO00o.f80093Oooo000 || oooO00o2 == com.orion.notein.p607ui.p609vo.OooO00o.f80094Oooo00O || oooO00o2 == com.orion.notein.p607ui.p609vo.OooO00o.f80095Oooo00o) {
                        arrayList.add(oooO00o2);
                    }
                }
                ArrayList arrayList2 = new ArrayList(C34428OooOOo.OooOOoo(arrayList, 10));
                for (com.orion.notein.p607ui.p609vo.OooO00o oooO00o3 : arrayList) {
                    arrayList2.add(new SortKeyVO(oooO00o3, oooO00o3 == oooO00o, false));
                }
                c20129OooO00o.f110151OooOo = 1;
                if (this.f110150OooOo0o.emit(arrayList2, c20129OooO00o) == enumC32485OooO00o) {
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

    public C30819OooOo0(C33769Ooooo0o c33769Ooooo0o) {
        this.f110149OooOo0o = c33769Ooooo0o;
    }

    @Override // oO0o0Oo.InterfaceC33721OooO0o
    public final Object collect(InterfaceC33723OooO0oO<? super List<? extends SortKeyVO>> interfaceC33723OooO0oO, Continuation continuation) {
        Object objCollect = this.f110149OooOo0o.f121747OooOo0o.collect(new OooO00o(interfaceC33723OooO0oO), continuation);
        return objCollect == EnumC32485OooO00o.f116726OooOo0o ? objCollect : C32460OooOooO.f116667OooO00o;
    }
}
