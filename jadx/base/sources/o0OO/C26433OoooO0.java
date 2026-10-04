package o0OO;

import com.orion.notein.domain.models.note.PenInfo;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.coroutines.Continuation;
import oO00ooO.C32446OooOOOo;
import oO00ooO.C32460OooOooO;
import oO00ooo.AbstractC32476OooO;
import oO00ooo.AbstractC32479OooO0OO;
import oO00ooo.InterfaceC32482OooO0o0;
import oO00ooo0.EnumC32485OooO00o;
import oO0O000o.InterfaceC32508OooOOOo;
import oO0o0OO.C33609OooO0oo;
import oO0o0OO.C33649OoooOOo;
import oO0o0OO.InterfaceC33636Oooo00o;
import oO0o0o0o.C33874OooO0OO;
import oO0o0o0o.ExecutorC33873OooO0O0;
import oOo000Oo.C34428OooOOo;
import oOo000Oo.C34429OooOOo0;

/* JADX INFO: renamed from: o0OO.OoooO0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C26433OoooO0 {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final C26424Oooo f90780OooO00o;

    /* JADX INFO: renamed from: o0OO.OoooO0$OooO00o */
    @InterfaceC32482OooO0o0(m80622c = "com.orion.notein.data.repo.note.PenInfoRepoImpl", m80623f = "PenInfoRepoImpl.kt", m80624l = {46, 47, 53}, m80625m = "getPenInfoListByNoteIdSync")
    public static final class OooO00o extends AbstractC32479OooO0OO {

        /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
        public String f90781OooOo;

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public Object f90782OooOo0o;

        /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
        public /* synthetic */ Object f90783OooOoO;

        /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
        public List f90784OooOoO0;

        /* JADX INFO: renamed from: OooOoo0, reason: collision with root package name */
        public int f90786OooOoo0;

        public OooO00o(Continuation<? super OooO00o> continuation) {
            super(continuation);
        }

        @Override // oO00ooo.AbstractC32477OooO00o
        public final Object invokeSuspend(Object obj) {
            this.f90783OooOoO = obj;
            this.f90786OooOoo0 |= Integer.MIN_VALUE;
            return C26433OoooO0.this.OooO00o(null, this);
        }
    }

    /* JADX INFO: renamed from: o0OO.OoooO0$OooO0O0 */
    @InterfaceC32482OooO0o0(m80622c = "com.orion.notein.data.repo.note.PenInfoRepoImpl$getPenInfoListByNoteIdSync$2", m80623f = "PenInfoRepoImpl.kt", m80624l = {54}, m80625m = "invokeSuspend")
    public static final class OooO0O0 extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super C32460OooOooO>, Object> {

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public int f90788OooOo0o;

        /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
        public final /* synthetic */ String f90789OooOoO0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO0O0(String str, Continuation<? super OooO0O0> continuation) {
            super(2, continuation);
            this.f90789OooOoO0 = str;
        }

        @Override // oO00ooo.AbstractC32477OooO00o
        public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
            return C26433OoooO0.this.new OooO0O0(this.f90789OooOoO0, continuation);
        }

        @Override // oO0O000o.InterfaceC32508OooOOOo
        public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super C32460OooOooO> continuation) {
            return ((OooO0O0) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
        }

        @Override // oO00ooo.AbstractC32477OooO00o
        public final Object invokeSuspend(Object obj) {
            EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
            int i = this.f90788OooOo0o;
            if (i == 0) {
                C32446OooOOOo.OooO0O0(obj);
                C26424Oooo c26424Oooo = C26433OoooO0.this.f90780OooO00o;
                this.f90788OooOo0o = 1;
                c26424Oooo.f90732OooO00o.OooO0Oo(this.f90789OooOoO0);
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

    public C26433OoooO0(C26424Oooo c26424Oooo, C26429Oooo0o c26429Oooo0o) {
        this.f90780OooO00o = c26424Oooo;
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x00b8  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00ef  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0120  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0153 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0169 A[LOOP:3: B:55:0x0163->B:57:0x0169, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:61:0x018f  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object OooO00o(String str, Continuation<? super List<PenInfo>> continuation) {
        OooO00o oooO00o;
        String str2;
        Object objOooOO0o;
        C26433OoooO0 c26433OoooO0;
        List list;
        String str3;
        List list2;
        List list3;
        ArrayList arrayList;
        Iterator it;
        if (continuation instanceof OooO00o) {
            oooO00o = (OooO00o) continuation;
            int i = oooO00o.f90786OooOoo0;
            if ((i & Integer.MIN_VALUE) != 0) {
                oooO00o.f90786OooOoo0 = i - Integer.MIN_VALUE;
            } else {
                oooO00o = new OooO00o(continuation);
            }
        }
        Object obj = oooO00o.f90783OooOoO;
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i2 = oooO00o.f90786OooOoo0;
        if (i2 == 0) {
            C32446OooOOOo.OooO0O0(obj);
            oooO00o.f90782OooOo0o = this;
            str2 = str;
            oooO00o.f90781OooOo = str2;
            oooO00o.f90786OooOoo0 = 1;
            objOooOO0o = C34429OooOOo0.OooOO0o(C26429Oooo0o.f90756OooO00o, C26429Oooo0o.f90757OooO0O0, C26429Oooo0o.f90758OooO0OO, C26429Oooo0o.f90759OooO0Oo, C26429Oooo0o.f90761OooO0o0, C26429Oooo0o.f90760OooO0o, C26429Oooo0o.f90762OooO0oO, C26429Oooo0o.f90763OooO0oo, C26429Oooo0o.f90755OooO, C26429Oooo0o.f90764OooOO0, C26429Oooo0o.f90765OooOO0O);
            if (objOooOO0o != enumC32485OooO00o) {
                c26433OoooO0 = this;
            }
        }
        if (i2 != 1) {
            if (i2 != 2) {
                if (i2 != 3) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                List list4 = (List) oooO00o.f90782OooOo0o;
                C32446OooOOOo.OooO0O0(obj);
                return list4;
            }
            list = oooO00o.f90784OooOoO0;
            str3 = oooO00o.f90781OooOo;
            c26433OoooO0 = (C26433OoooO0) oooO00o.f90782OooOo0o;
            C32446OooOOOo.OooO0O0(obj);
            list2 = (List) obj;
            list3 = list2;
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            for (Object obj2 : list3) {
                Integer num = new Integer(((PenInfo) obj2).getType());
                Object arrayList2 = linkedHashMap.get(num);
                if (arrayList2 == null) {
                    arrayList2 = new ArrayList();
                    linkedHashMap.put(num, arrayList2);
                }
                ((List) arrayList2).add(obj2);
            }
            LinkedHashMap linkedHashMap2 = new LinkedHashMap();
            for (Map.Entry entry : linkedHashMap.entrySet()) {
                if (((List) entry.getValue()).size() > 1) {
                    linkedHashMap2.put(entry.getKey(), entry.getValue());
                }
            }
            boolean zIsEmpty = linkedHashMap2.isEmpty();
            arrayList = new ArrayList();
            for (Object obj3 : list3) {
                if (((PenInfo) obj3).getSelected()) {
                    arrayList.add(obj3);
                }
            }
            if (arrayList.size() > 1 || !zIsEmpty) {
                C33874OooO0OO c33874OooO0OO = C33649OoooOOo.f121328OooO00o;
                ExecutorC33873OooO0O0 executorC33873OooO0O0 = ExecutorC33873OooO0O0.f122045OooOoO0;
                OooO0O0 oooO0O0 = c26433OoooO0.new OooO0O0(str3, null);
                oooO00o.f90782OooOo0o = list;
                oooO00o.f90781OooOo = null;
                oooO00o.f90784OooOoO0 = null;
                oooO00o.f90786OooOoo0 = 3;
                return C33609OooO0oo.OooO0o(executorC33873OooO0O0, oooO0O0, oooO00o) != enumC32485OooO00o ? enumC32485OooO00o : list;
            }
            ArrayList arrayList3 = new ArrayList(C34428OooOOo.OooOOoo(list3, 10));
            it = list3.iterator();
            while (it.hasNext()) {
                arrayList3.add(new Integer(((PenInfo) it.next()).getType()));
            }
            List list5 = list2;
            ArrayList arrayList4 = new ArrayList();
            for (Object obj4 : list) {
                if (!arrayList3.contains(new Integer(((PenInfo) obj4).getType()))) {
                    arrayList4.add(obj4);
                }
            }
            return oOo000Oo.OooOo.OooooOO(list5, arrayList4);
        }
        String str4 = oooO00o.f90781OooOo;
        c26433OoooO0 = (C26433OoooO0) oooO00o.f90782OooOo0o;
        C32446OooOOOo.OooO0O0(obj);
        objOooOO0o = obj;
        str2 = str4;
        list = (List) objOooOO0o;
        C26424Oooo c26424Oooo = c26433OoooO0.f90780OooO00o;
        oooO00o.f90782OooOo0o = c26433OoooO0;
        oooO00o.f90781OooOo = str2;
        oooO00o.f90784OooOoO0 = list;
        oooO00o.f90786OooOoo0 = 2;
        Serializable serializableOooO00o = c26424Oooo.OooO00o(str2, oooO00o);
        if (serializableOooO00o != enumC32485OooO00o) {
            str3 = str2;
            obj = serializableOooO00o;
            list2 = (List) obj;
            list3 = list2;
            LinkedHashMap linkedHashMap3 = new LinkedHashMap();
            while (r11.hasNext()) {
            }
            LinkedHashMap linkedHashMap22 = new LinkedHashMap();
            while (r10.hasNext()) {
            }
            boolean zIsEmpty2 = linkedHashMap22.isEmpty();
            arrayList = new ArrayList();
            while (r12.hasNext()) {
            }
            if (arrayList.size() > 1) {
                ArrayList arrayList32 = new ArrayList(C34428OooOOo.OooOOoo(list3, 10));
                it = list3.iterator();
                while (it.hasNext()) {
                }
                List list52 = list2;
                ArrayList arrayList42 = new ArrayList();
                while (r4.hasNext()) {
                }
                return oOo000Oo.OooOo.OooooOO(list52, arrayList42);
            }
            C33874OooO0OO c33874OooO0OO2 = C33649OoooOOo.f121328OooO00o;
            ExecutorC33873OooO0O0 executorC33873OooO0O02 = ExecutorC33873OooO0O0.f122045OooOoO0;
            OooO0O0 oooO0O02 = c26433OoooO0.new OooO0O0(str3, null);
            oooO00o.f90782OooOo0o = list;
            oooO00o.f90781OooOo = null;
            oooO00o.f90784OooOoO0 = null;
            oooO00o.f90786OooOoo0 = 3;
            if (C33609OooO0oo.OooO0o(executorC33873OooO0O02, oooO0O02, oooO00o) != enumC32485OooO00o) {
            }
        }
    }

    public final Object OooO0O0(PenInfo[] penInfoArr, Continuation<? super C32460OooOooO> continuation) {
        Object objOooO0O0 = this.f90780OooO00o.OooO0O0((PenInfo[]) Arrays.copyOf(penInfoArr, penInfoArr.length), continuation);
        return objOooO0O0 == EnumC32485OooO00o.f116726OooOo0o ? objOooO0O0 : C32460OooOooO.f116667OooO00o;
    }
}
