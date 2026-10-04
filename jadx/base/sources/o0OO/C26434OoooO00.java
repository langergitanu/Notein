package o0OO;

import com.orion.notein.domain.models.note.PenInfo;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.coroutines.Continuation;
import oO00ooO.C32446OooOOOo;
import oO00ooO.C32460OooOooO;
import oO00ooo.AbstractC32476OooO;
import oO00ooo.InterfaceC32482OooO0o0;
import oO00ooo0.EnumC32485OooO00o;
import oO0O000o.InterfaceC32508OooOOOo;
import oO0O000o.InterfaceC32510OooOOo0;
import oO0o0OO.C33609OooO0oo;
import oO0o0OO.C33649OoooOOo;
import oO0o0OO.InterfaceC33636Oooo00o;
import oO0o0o0o.C33874OooO0OO;
import oO0o0o0o.ExecutorC33873OooO0O0;
import oOo000Oo.C34428OooOOo;

/* JADX INFO: renamed from: o0OO.OoooO00, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
@InterfaceC32482OooO0o0(m80622c = "com.orion.notein.data.repo.note.PenInfoRepoImpl$getPenInfoListByNoteId$1", m80623f = "PenInfoRepoImpl.kt", m80624l = {31}, m80625m = "invokeSuspend")
public final class C26434OoooO00 extends AbstractC32476OooO implements InterfaceC32510OooOOo0<List<? extends PenInfo>, List<? extends PenInfo>, Continuation<? super List<? extends PenInfo>>, Object> {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public /* synthetic */ List f90790OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public int f90791OooOo0o;

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public final /* synthetic */ C26433OoooO0 f90792OooOoO;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public /* synthetic */ List f90793OooOoO0;

    /* JADX INFO: renamed from: OooOoOO, reason: collision with root package name */
    public final /* synthetic */ String f90794OooOoOO;

    /* JADX INFO: renamed from: o0OO.OoooO00$OooO00o */
    @InterfaceC32482OooO0o0(m80622c = "com.orion.notein.data.repo.note.PenInfoRepoImpl$getPenInfoListByNoteId$1$1", m80623f = "PenInfoRepoImpl.kt", m80624l = {32}, m80625m = "invokeSuspend")
    public static final class OooO00o extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super C32460OooOooO>, Object> {

        /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
        public final /* synthetic */ C26433OoooO0 f90795OooOo;

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public int f90796OooOo0o;

        /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
        public final /* synthetic */ String f90797OooOoO0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO00o(C26433OoooO0 c26433OoooO0, String str, Continuation<? super OooO00o> continuation) {
            super(2, continuation);
            this.f90795OooOo = c26433OoooO0;
            this.f90797OooOoO0 = str;
        }

        @Override // oO00ooo.AbstractC32477OooO00o
        public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
            return new OooO00o(this.f90795OooOo, this.f90797OooOoO0, continuation);
        }

        @Override // oO0O000o.InterfaceC32508OooOOOo
        public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super C32460OooOooO> continuation) {
            return ((OooO00o) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
        }

        @Override // oO00ooo.AbstractC32477OooO00o
        public final Object invokeSuspend(Object obj) {
            EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
            int i = this.f90796OooOo0o;
            if (i == 0) {
                C32446OooOOOo.OooO0O0(obj);
                C26424Oooo c26424Oooo = this.f90795OooOo.f90780OooO00o;
                this.f90796OooOo0o = 1;
                c26424Oooo.f90732OooO00o.OooO0Oo(this.f90797OooOoO0);
                if (C32460OooOooO.f116667OooO00o == enumC32485OooO00o) {
                    return enumC32485OooO00o;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C32446OooOOOo.OooO0O0(obj);
            }
            return C32460OooOooO.f116667OooO00o;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C26434OoooO00(C26433OoooO0 c26433OoooO0, String str, Continuation<? super C26434OoooO00> continuation) {
        super(3, continuation);
        this.f90792OooOoO = c26433OoooO0;
        this.f90794OooOoOO = str;
    }

    @Override // oO0O000o.InterfaceC32510OooOOo0
    public final Object invoke(List<? extends PenInfo> list, List<? extends PenInfo> list2, Continuation<? super List<? extends PenInfo>> continuation) {
        C26434OoooO00 c26434OoooO00 = new C26434OoooO00(this.f90792OooOoO, this.f90794OooOoOO, continuation);
        c26434OoooO00.f90790OooOo = list;
        c26434OoooO00.f90793OooOoO0 = list2;
        return c26434OoooO00.invokeSuspend(C32460OooOooO.f116667OooO00o);
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Object invokeSuspend(Object obj) {
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i = this.f90791OooOo0o;
        if (i != 0) {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            List list = this.f90790OooOo;
            C32446OooOOOo.OooO0O0(obj);
            return list;
        }
        C32446OooOOOo.OooO0O0(obj);
        List list2 = this.f90790OooOo;
        List list3 = this.f90793OooOoO0;
        List list4 = list3;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Object obj2 : list4) {
            Integer num = new Integer(((PenInfo) obj2).getType());
            Object arrayList = linkedHashMap.get(num);
            if (arrayList == null) {
                arrayList = new ArrayList();
                linkedHashMap.put(num, arrayList);
            }
            ((List) arrayList).add(obj2);
        }
        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            if (((List) entry.getValue()).size() > 1) {
                linkedHashMap2.put(entry.getKey(), entry.getValue());
            }
        }
        boolean zIsEmpty = linkedHashMap2.isEmpty();
        ArrayList arrayList2 = new ArrayList();
        for (Object obj3 : list4) {
            if (((PenInfo) obj3).getSelected()) {
                arrayList2.add(obj3);
            }
        }
        if (arrayList2.size() > 1 || !zIsEmpty) {
            C33874OooO0OO c33874OooO0OO = C33649OoooOOo.f121328OooO00o;
            ExecutorC33873OooO0O0 executorC33873OooO0O0 = ExecutorC33873OooO0O0.f122045OooOoO0;
            OooO00o oooO00o = new OooO00o(this.f90792OooOoO, this.f90794OooOoOO, null);
            this.f90790OooOo = list2;
            this.f90791OooOo0o = 1;
            return C33609OooO0oo.OooO0o(executorC33873OooO0O0, oooO00o, this) == enumC32485OooO00o ? enumC32485OooO00o : list2;
        }
        ArrayList arrayList3 = new ArrayList(C34428OooOOo.OooOOoo(list4, 10));
        Iterator it = list4.iterator();
        while (it.hasNext()) {
            arrayList3.add(new Integer(((PenInfo) it.next()).getType()));
        }
        List list5 = list3;
        ArrayList arrayList4 = new ArrayList();
        for (Object obj4 : list2) {
            if (!arrayList3.contains(new Integer(((PenInfo) obj4).getType()))) {
                arrayList4.add(obj4);
            }
        }
        return oOo000Oo.OooOo.OooooOO(list5, arrayList4);
    }
}
