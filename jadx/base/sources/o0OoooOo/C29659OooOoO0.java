package o0OoooOo;

import com.orion.notein.p607ui.p609vo.SortKeyVO;
import java.util.ArrayList;
import kotlin.coroutines.Continuation;
import oO00ooO.C32446OooOOOo;
import oO00ooO.C32460OooOooO;
import oO00ooo.AbstractC32479OooO0OO;
import oO00ooo.InterfaceC32482OooO0o0;
import oO00ooo0.EnumC32485OooO00o;
import oO0o0Oo.InterfaceC33723OooO0oO;
import oOo000Oo.C34428OooOOo;

/* JADX INFO: renamed from: o0OoooOo.OooOoO0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C29659OooOoO0<T> implements InterfaceC33723OooO0oO {

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final /* synthetic */ InterfaceC33723OooO0oO f105168OooOo0o;

    /* JADX INFO: renamed from: o0OoooOo.OooOoO0$OooO00o */
    @InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.noteeditor.propertypanel.comment.EditorCommentViewModel$special$$inlined$map$3$2", m80623f = "EditorCommentViewModel.kt", m80624l = {50}, m80625m = "emit")
    public static final class OooO00o extends AbstractC32479OooO0OO {

        /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
        public int f105169OooOo;

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public /* synthetic */ Object f105170OooOo0o;

        public OooO00o(Continuation continuation) {
            super(continuation);
        }

        @Override // oO00ooo.AbstractC32477OooO00o
        public final Object invokeSuspend(Object obj) {
            this.f105170OooOo0o = obj;
            this.f105169OooOo |= Integer.MIN_VALUE;
            return C29659OooOoO0.this.emit(null, this);
        }
    }

    public C29659OooOoO0(InterfaceC33723OooO0oO interfaceC33723OooO0oO) {
        this.f105168OooOo0o = interfaceC33723OooO0oO;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // oO0o0Oo.InterfaceC33723OooO0oO
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object emit(Object obj, Continuation continuation) {
        OooO00o oooO00o;
        if (continuation instanceof OooO00o) {
            oooO00o = (OooO00o) continuation;
            int i = oooO00o.f105169OooOo;
            if ((i & Integer.MIN_VALUE) != 0) {
                oooO00o.f105169OooOo = i - Integer.MIN_VALUE;
            } else {
                oooO00o = new OooO00o(continuation);
            }
        }
        Object obj2 = oooO00o.f105170OooOo0o;
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i2 = oooO00o.f105169OooOo;
        if (i2 == 0) {
            C32446OooOOOo.OooO0O0(obj2);
            com.orion.notein.p607ui.p609vo.OooO00o oooO00o2 = (com.orion.notein.p607ui.p609vo.OooO00o) obj;
            com.orion.notein.p607ui.p609vo.OooO00o.f80086OooOoO0.getClass();
            com.orion.notein.p607ui.p609vo.OooO00o[] oooO00oArrValues = com.orion.notein.p607ui.p609vo.OooO00o.values();
            ArrayList<com.orion.notein.p607ui.p609vo.OooO00o> arrayList = new ArrayList();
            for (com.orion.notein.p607ui.p609vo.OooO00o oooO00o3 : oooO00oArrValues) {
                if (oooO00o3 == com.orion.notein.p607ui.p609vo.OooO00o.f80089OooOoo0 || oooO00o3 == com.orion.notein.p607ui.p609vo.OooO00o.f80096Oooo0O0) {
                    arrayList.add(oooO00o3);
                }
            }
            ArrayList arrayList2 = new ArrayList(C34428OooOOo.OooOOoo(arrayList, 10));
            for (com.orion.notein.p607ui.p609vo.OooO00o oooO00o4 : arrayList) {
                arrayList2.add(new SortKeyVO(oooO00o4, oooO00o4 == oooO00o2, false));
            }
            oooO00o.f105169OooOo = 1;
            if (this.f105168OooOo0o.emit(arrayList2, oooO00o) == enumC32485OooO00o) {
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
