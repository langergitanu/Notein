package o0OOoOo0;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.coroutines.Continuation;
import oO00ooO.C32443OooOOO;
import oO00ooO.C32446OooOOOo;
import oO00ooO.C32460OooOooO;
import oO00ooo.AbstractC32479OooO0OO;
import oO00ooo.InterfaceC32482OooO0o0;
import oO00ooo0.EnumC32485OooO00o;
import oO0o0Oo.InterfaceC33723OooO0oO;
import oOo000Oo.C34431OooOo0;
import oOo000Oo.C34444Oooo0O0;

/* JADX INFO: renamed from: o0OOoOo0.OooOo00, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C27813OooOo00<T> implements InterfaceC33723OooO0oO {

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final /* synthetic */ InterfaceC33723OooO0oO f98245OooOo0o;

    /* JADX INFO: renamed from: o0OOoOo0.OooOo00$OooO00o */
    @InterfaceC32482OooO0o0(m80622c = "com.orion.notein.domain.usecase.label.GetItemsByLabelUseCase$findLabelsForPages$$inlined$map$1$2", m80623f = "GetItemsByLabelUseCase.kt", m80624l = {50}, m80625m = "emit")
    public static final class OooO00o extends AbstractC32479OooO0OO {

        /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
        public int f98246OooOo;

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public /* synthetic */ Object f98247OooOo0o;

        public OooO00o(Continuation continuation) {
            super(continuation);
        }

        @Override // oO00ooo.AbstractC32477OooO00o
        public final Object invokeSuspend(Object obj) {
            this.f98247OooOo0o = obj;
            this.f98246OooOo |= Integer.MIN_VALUE;
            return C27813OooOo00.this.emit(null, this);
        }
    }

    public C27813OooOo00(InterfaceC33723OooO0oO interfaceC33723OooO0oO) {
        this.f98245OooOo0o = interfaceC33723OooO0oO;
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
            int i = oooO00o.f98246OooOo;
            if ((i & Integer.MIN_VALUE) != 0) {
                oooO00o.f98246OooOo = i - Integer.MIN_VALUE;
            } else {
                oooO00o = new OooO00o(continuation);
            }
        }
        Object obj2 = oooO00o.f98247OooOo0o;
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i2 = oooO00o.f98246OooOo;
        if (i2 == 0) {
            C32446OooOOOo.OooO0O0(obj2);
            ArrayList arrayList = new ArrayList();
            for (Map.Entry entry : ((Map) obj).entrySet()) {
                String str = (String) entry.getKey();
                Map map = (Map) entry.getValue();
                ArrayList arrayList2 = new ArrayList(map.size());
                for (Map.Entry entry2 : map.entrySet()) {
                    String str2 = (String) entry2.getKey();
                    arrayList2.add(new C32443OooOOO(new C32443OooOOO(str2, str), (List) entry2.getValue()));
                }
                C34431OooOo0.OooOo0o(arrayList, arrayList2);
            }
            Map mapOooOO0o = C34444Oooo0O0.OooOO0o(arrayList);
            oooO00o.f98246OooOo = 1;
            if (this.f98245OooOo0o.emit(mapOooOO0o, oooO00o) == enumC32485OooO00o) {
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
