package o0o00oOo;

import com.orion.notein.domain.models.cloudsync.CloudMetaLocal;
import com.orion.notein.p607ui.p609vo.NoteVO;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
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

/* JADX INFO: loaded from: classes10.dex */
public final class o000000O implements InterfaceC33721OooO0o<Map<String, ? extends Integer>> {

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final /* synthetic */ C33769Ooooo0o f107030OooOo0o;

    public static final class OooO00o<T> implements InterfaceC33723OooO0oO {

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public final /* synthetic */ InterfaceC33723OooO0oO f107031OooOo0o;

        /* JADX INFO: renamed from: o0o00oOo.o000000O$OooO00o$OooO00o, reason: collision with other inner class name */
        @InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.notelist.NoteListViewModel$special$$inlined$map$5$2", m80623f = "NoteListViewModel.kt", m80624l = {50}, m80625m = "emit")
        public static final class C20038OooO00o extends AbstractC32479OooO0OO {

            /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
            public int f107032OooOo;

            /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
            public /* synthetic */ Object f107033OooOo0o;

            public C20038OooO00o(Continuation continuation) {
                super(continuation);
            }

            @Override // oO00ooo.AbstractC32477OooO00o
            public final Object invokeSuspend(Object obj) {
                this.f107033OooOo0o = obj;
                this.f107032OooOo |= Integer.MIN_VALUE;
                return OooO00o.this.emit(null, this);
            }
        }

        public OooO00o(InterfaceC33723OooO0oO interfaceC33723OooO0oO) {
            this.f107031OooOo0o = interfaceC33723OooO0oO;
        }

        /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
        @Override // oO0o0Oo.InterfaceC33723OooO0oO
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object emit(Object obj, Continuation continuation) {
            C20038OooO00o c20038OooO00o;
            if (continuation instanceof C20038OooO00o) {
                c20038OooO00o = (C20038OooO00o) continuation;
                int i = c20038OooO00o.f107032OooOo;
                if ((i & Integer.MIN_VALUE) != 0) {
                    c20038OooO00o.f107032OooOo = i - Integer.MIN_VALUE;
                } else {
                    c20038OooO00o = new C20038OooO00o(continuation);
                }
            }
            Object obj2 = c20038OooO00o.f107033OooOo0o;
            EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
            int i2 = c20038OooO00o.f107032OooOo;
            if (i2 == 0) {
                C32446OooOOOo.OooO0O0(obj2);
                List<CloudMetaLocal> list = (List) obj;
                int iOooO0Oo = oOo000Oo.Oooo0.OooO0Oo(C34428OooOOo.OooOOoo(list, 10));
                if (iOooO0Oo < 16) {
                    iOooO0Oo = 16;
                }
                LinkedHashMap linkedHashMap = new LinkedHashMap(iOooO0Oo);
                for (CloudMetaLocal cloudMetaLocal : list) {
                    String id = cloudMetaLocal.getId();
                    NoteVO.INSTANCE.getClass();
                    int i3 = 2;
                    if (cloudMetaLocal.getLastErrorCode() == null) {
                        int i4 = NoteVO.Companion.C19581OooO00o.f80084OooO00o[cloudMetaLocal.getSyncState().getPhase().ordinal()];
                        if (i4 == 1) {
                            i3 = 0;
                        } else if (i4 != 2 && i4 != 3) {
                            i3 = 1;
                        }
                    }
                    linkedHashMap.put(id, new Integer(i3));
                }
                c20038OooO00o.f107032OooOo = 1;
                if (this.f107031OooOo0o.emit(linkedHashMap, c20038OooO00o) == enumC32485OooO00o) {
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

    public o000000O(C33769Ooooo0o c33769Ooooo0o) {
        this.f107030OooOo0o = c33769Ooooo0o;
    }

    @Override // oO0o0Oo.InterfaceC33721OooO0o
    public final Object collect(InterfaceC33723OooO0oO<? super Map<String, ? extends Integer>> interfaceC33723OooO0oO, Continuation continuation) {
        Object objCollect = this.f107030OooOo0o.f121747OooOo0o.collect(new OooO00o(interfaceC33723OooO0oO), continuation);
        return objCollect == EnumC32485OooO00o.f116726OooOo0o ? objCollect : C32460OooOooO.f116667OooO00o;
    }
}
