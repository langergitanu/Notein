package o0Ooo0oo;

import com.microsoft.identity.common.java.telemetry.TelemetryEventStrings;
import com.orion.notein.p607ui.p609vo.PenVO;
import java.util.ArrayList;
import java.util.Iterator;
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
import oOO00oo.C34406OooO00o;
import oOo000Oo.C34429OooOOo0;

/* JADX INFO: renamed from: o0Ooo0oo.o0000oo0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C29533o0000oo0 implements InterfaceC33721OooO0o<List<? extends PenVO>> {

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final /* synthetic */ C33769Ooooo0o f104759OooOo0o;

    /* JADX INFO: renamed from: o0Ooo0oo.o0000oo0$OooO00o */
    public static final class OooO00o<T> implements InterfaceC33723OooO0oO {

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public final /* synthetic */ InterfaceC33723OooO0oO f104760OooOo0o;

        /* JADX INFO: renamed from: o0Ooo0oo.o0000oo0$OooO00o$OooO00o, reason: collision with other inner class name */
        @InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.noteeditor.penbar.PenBarViewModel$special$$inlined$map$4$2", m80623f = "PenBarViewModel.kt", m80624l = {50}, m80625m = "emit")
        public static final class C20003OooO00o extends AbstractC32479OooO0OO {

            /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
            public int f104761OooOo;

            /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
            public /* synthetic */ Object f104762OooOo0o;

            public C20003OooO00o(Continuation continuation) {
                super(continuation);
            }

            @Override // oO00ooo.AbstractC32477OooO00o
            public final Object invokeSuspend(Object obj) {
                this.f104762OooOo0o = obj;
                this.f104761OooOo |= Integer.MIN_VALUE;
                return OooO00o.this.emit(null, this);
            }
        }

        public OooO00o(InterfaceC33723OooO0oO interfaceC33723OooO0oO) {
            this.f104760OooOo0o = interfaceC33723OooO0oO;
        }

        /* JADX WARN: Removed duplicated region for block: B:77:0x013d A[PHI: r14
          0x013d: PHI (r14v5 com.orion.notein.ui.vo.PenVO) = (r14v4 com.orion.notein.ui.vo.PenVO), (r14v11 com.orion.notein.ui.vo.PenVO) binds: [B:65:0x0111, B:75:0x013a] A[DONT_GENERATE, DONT_INLINE]] */
        /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
        @Override // oO0o0Oo.InterfaceC33723OooO0oO
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object emit(Object obj, Continuation continuation) {
            C20003OooO00o c20003OooO00o;
            T next;
            T next2;
            T next3;
            T next4;
            T next5;
            T next6;
            Object next7;
            Object next8;
            Object next9;
            Object obj2;
            Object next10;
            Object next11;
            if (continuation instanceof C20003OooO00o) {
                c20003OooO00o = (C20003OooO00o) continuation;
                int i = c20003OooO00o.f104761OooOo;
                if ((i & Integer.MIN_VALUE) != 0) {
                    c20003OooO00o.f104761OooOo = i - Integer.MIN_VALUE;
                } else {
                    c20003OooO00o = new C20003OooO00o(continuation);
                }
            }
            Object obj3 = c20003OooO00o.f104762OooOo0o;
            EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
            int i2 = c20003OooO00o.f104761OooOo;
            if (i2 == 0) {
                C32446OooOOOo.OooO0O0(obj3);
                List list = (List) obj;
                Iterator<T> it = list.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        next = (T) null;
                        break;
                    }
                    next = it.next();
                    if (((PenVO) next).getType() == 0) {
                        break;
                    }
                }
                PenVO penVO = next;
                Iterator<T> it2 = list.iterator();
                while (true) {
                    if (!it2.hasNext()) {
                        next2 = (T) null;
                        break;
                    }
                    next2 = it2.next();
                    if (((PenVO) next2).getType() == 1) {
                        break;
                    }
                }
                PenVO penVO2 = next2;
                Iterator<T> it3 = list.iterator();
                while (true) {
                    if (!it3.hasNext()) {
                        next3 = (T) null;
                        break;
                    }
                    next3 = it3.next();
                    if (((PenVO) next3).getType() == 10) {
                        break;
                    }
                }
                PenVO penVO3 = next3;
                Iterator<T> it4 = list.iterator();
                while (true) {
                    if (!it4.hasNext()) {
                        next4 = (T) null;
                        break;
                    }
                    next4 = it4.next();
                    if (((PenVO) next4).getType() == 12) {
                        break;
                    }
                }
                PenVO penVO4 = next4;
                Iterator<T> it5 = list.iterator();
                while (true) {
                    if (!it5.hasNext()) {
                        next5 = (T) null;
                        break;
                    }
                    next5 = it5.next();
                    if (((PenVO) next5).getType() == 2) {
                        break;
                    }
                }
                PenVO penVO5 = next5;
                Iterator<T> it6 = list.iterator();
                while (true) {
                    if (!it6.hasNext()) {
                        next6 = (T) null;
                        break;
                    }
                    next6 = it6.next();
                    if (((PenVO) next6).getType() == 9) {
                        break;
                    }
                }
                PenVO penVO6 = next6;
                ArrayList arrayListOooOoO = oOo000Oo.OooOOO.OooOoO(new PenVO[]{penVO, penVO2});
                Iterator it7 = arrayListOooOoO.iterator();
                while (true) {
                    if (!it7.hasNext()) {
                        next7 = null;
                        break;
                    }
                    next7 = it7.next();
                    if (((PenVO) next7).getSelected()) {
                        break;
                    }
                }
                PenVO penVO7 = (PenVO) next7;
                if (penVO7 == null) {
                    Iterator it8 = arrayListOooOoO.iterator();
                    while (true) {
                        if (!it8.hasNext()) {
                            next11 = null;
                            break;
                        }
                        next11 = it8.next();
                        if (kotlin.jvm.internal.OooOOO0.OooO0O0(((PenVO) next11).getExtra().getString("group_selected"), TelemetryEventStrings.Value.TRUE)) {
                            break;
                        }
                    }
                    penVO7 = (PenVO) next11;
                    if (penVO7 != null) {
                        penVO = penVO7;
                    }
                    ArrayList arrayListOooOoO2 = oOo000Oo.OooOOO.OooOoO(new PenVO[]{penVO3, penVO4});
                    C34406OooO00o.C20358OooO00o c20358OooO00o = C34406OooO00o.f123390OooO00o;
                    c20358OooO00o.OooOOO0("HLRectDebug");
                    c20358OooO00o.OooO0o0("groupedPenList-secondPenList: " + arrayListOooOoO2, new Object[0]);
                    Iterator it9 = arrayListOooOoO2.iterator();
                    while (true) {
                        if (!it9.hasNext()) {
                            next8 = null;
                            break;
                        }
                        next8 = it9.next();
                        if (((PenVO) next8).getSelected()) {
                            break;
                        }
                    }
                    PenVO penVO8 = (PenVO) next8;
                    if (penVO8 == null) {
                        Iterator it10 = arrayListOooOoO2.iterator();
                        while (true) {
                            if (!it10.hasNext()) {
                                next10 = null;
                                break;
                            }
                            next10 = it10.next();
                            if (kotlin.jvm.internal.OooOOO0.OooO0O0(((PenVO) next10).getExtra().getString("group_selected"), TelemetryEventStrings.Value.TRUE)) {
                                break;
                            }
                        }
                        PenVO penVO9 = (PenVO) next10;
                        if (penVO9 != null) {
                            penVO3 = penVO9;
                        }
                    } else {
                        penVO3 = penVO8;
                    }
                    ArrayList arrayListOooOoO3 = oOo000Oo.OooOOO.OooOoO(new PenVO[]{penVO5, penVO6});
                    Iterator it11 = arrayListOooOoO3.iterator();
                    while (true) {
                        if (!it11.hasNext()) {
                            next9 = null;
                            break;
                        }
                        next9 = it11.next();
                        if (((PenVO) next9).getSelected()) {
                            break;
                        }
                    }
                    PenVO penVO10 = (PenVO) next9;
                    if (penVO10 == null) {
                        Iterator it12 = arrayListOooOoO3.iterator();
                        while (true) {
                            if (!it12.hasNext()) {
                                obj2 = null;
                                break;
                            }
                            Object next12 = it12.next();
                            if (kotlin.jvm.internal.OooOOO0.OooO0O0(((PenVO) next12).getExtra().getString("group_selected"), TelemetryEventStrings.Value.TRUE)) {
                                obj2 = next12;
                                break;
                            }
                        }
                        PenVO penVO11 = (PenVO) obj2;
                        if (penVO11 != null) {
                            penVO5 = penVO11;
                        }
                    } else {
                        penVO5 = penVO10;
                    }
                    C34406OooO00o.C20358OooO00o c20358OooO00o2 = C34406OooO00o.f123390OooO00o;
                    c20358OooO00o2.OooOOO0("HLRectDebug");
                    c20358OooO00o2.OooO0o0("groupedPenList-selectedHLPen: " + penVO3, new Object[0]);
                    List listOooOO0o = C34429OooOOo0.OooOO0o(new Integer(0), new Integer(1), new Integer(10), new Integer(12), new Integer(2), new Integer(9));
                    ArrayList arrayListOooOoO4 = oOo000Oo.OooOOO.OooOoO(new PenVO[]{penVO, penVO3, penVO5});
                    ArrayList arrayList = new ArrayList();
                    for (T t : list) {
                        if (!listOooOO0o.contains(new Integer(((PenVO) t).getType()))) {
                            arrayList.add(t);
                        }
                    }
                    ArrayList arrayListOooooOO = oOo000Oo.OooOo.OooooOO(arrayListOooOoO4, arrayList);
                    c20003OooO00o.f104761OooOo = 1;
                    if (this.f104760OooOo0o.emit(arrayListOooooOO, c20003OooO00o) == enumC32485OooO00o) {
                        return enumC32485OooO00o;
                    }
                }
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C32446OooOOOo.OooO0O0(obj3);
            }
            return C32460OooOooO.f116667OooO00o;
        }
    }

    public C29533o0000oo0(C33769Ooooo0o c33769Ooooo0o) {
        this.f104759OooOo0o = c33769Ooooo0o;
    }

    @Override // oO0o0Oo.InterfaceC33721OooO0o
    public final Object collect(InterfaceC33723OooO0oO<? super List<? extends PenVO>> interfaceC33723OooO0oO, Continuation continuation) {
        Object objCollect = this.f104759OooOo0o.f121747OooOo0o.collect(new OooO00o(interfaceC33723OooO0oO), continuation);
        return objCollect == EnumC32485OooO00o.f116726OooOo0o ? objCollect : C32460OooOooO.f116667OooO00o;
    }
}
