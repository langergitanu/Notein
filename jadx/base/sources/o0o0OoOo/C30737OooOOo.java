package o0o0OoOo;

import OooO0Oo.C20398OooO0O0;
import com.orion.notein.domain.models.folder.Folder;
import com.orion.notein.domain.models.note.NoteMeta;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.coroutines.Continuation;
import o0OOOO0o.C27129OoooOOO;
import o0Ooo000.C29338OooOO0O;
import oO00ooO.C32446OooOOOo;
import oO00ooO.C32460OooOooO;
import oO00ooo.AbstractC32476OooO;
import oO00ooo.InterfaceC32482OooO0o0;
import oO00ooo0.EnumC32485OooO00o;
import oO0O000o.InterfaceC32508OooOOOo;
import oO0o0OO.InterfaceC33636Oooo00o;
import oO0o0Oo.InterfaceC33721OooO0o;
import oOO00oo.C34406OooO00o;
import oOo000Oo.C34428OooOOo;
import oOo000Oo.Oooo0;

/* JADX INFO: renamed from: o0o0OoOo.OooOOo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
@InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.settings.debug.viewmodel.DebugViewModel$logFoldersAndNotes$2", m80623f = "DebugViewModel.kt", m80624l = {168, 170, 180}, m80625m = "invokeSuspend")
public final class C30737OooOOo extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super C32460OooOooO>, Object> {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public int f109930OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public Object f109931OooOo0o;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public final /* synthetic */ C30722OooO00o f109932OooOoO0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C30737OooOOo(C30722OooO00o c30722OooO00o, Continuation<? super C30737OooOOo> continuation) {
        super(2, continuation);
        this.f109932OooOoO0 = c30722OooO00o;
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
        return new C30737OooOOo(this.f109932OooOoO0, continuation);
    }

    @Override // oO0O000o.InterfaceC32508OooOOOo
    public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super C32460OooOooO> continuation) {
        return ((C30737OooOOo) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00a4 A[LOOP:1: B:22:0x009e->B:24:0x00a4, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00c2  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0131  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0169  */
    @Override // oO00ooo.AbstractC32477OooO00o
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Object objOooO0o0;
        InterfaceC33721OooO0o interfaceC33721OooO0o;
        Object objOooO0oo;
        int iOooO0Oo;
        Object objOooOOo0;
        Map map;
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i = this.f109930OooOo;
        C30722OooO00o c30722OooO00o = this.f109932OooOoO0;
        if (i == 0) {
            C32446OooOOOo.OooO0O0(obj);
            C27129OoooOOO c27129OoooOOO = c30722OooO00o.f109861OooO0o0;
            String strOooO0Oo = c27129OoooOOO.OooO0Oo();
            this.f109930OooOo = 1;
            objOooO0o0 = c27129OoooOOO.OooO0o0(strOooO0Oo);
            if (objOooO0o0 != enumC32485OooO00o) {
            }
            return enumC32485OooO00o;
        }
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                map = (Map) this.f109931OooOo0o;
                C32446OooOOOo.OooO0O0(obj);
                objOooOOo0 = obj;
                List list = (List) objOooOOo0;
                C34406OooO00o.C20358OooO00o c20358OooO00o = C34406OooO00o.f123390OooO00o;
                c20358OooO00o.OooOOO0("DebugViewModel");
                List list2 = list;
                c20358OooO00o.OooO0o0(androidx.core.app.OooO.OooO00o(list.size(), "exportLogs, allNotes: ", ", ", oOo000Oo.OooOo.o000oOoO(list2, null, null, null, new C30738OooOOo0(0), 31)), new Object[0]);
                ArrayList arrayList = new ArrayList();
                for (Object obj2 : list2) {
                    NoteMeta noteMeta = (NoteMeta) obj2;
                    if (noteMeta.getParentId() != null && map.get(noteMeta.getParentId()) == null) {
                        arrayList.add(obj2);
                    }
                }
                C34406OooO00o.C20358OooO00o c20358OooO00o2 = C34406OooO00o.f123390OooO00o;
                c20358OooO00o2.OooOOO0("DebugViewModel");
                c20358OooO00o2.OooO0o0(androidx.core.app.OooO.OooO00o(arrayList.size(), "exportLogs, lostParentNotes: ", ", ", oOo000Oo.OooOo.o000oOoO(arrayList, null, null, null, new C29338OooOO0O(1), 31)), new Object[0]);
                return C32460OooOooO.f116667OooO00o;
            }
            interfaceC33721OooO0o = (InterfaceC33721OooO0o) this.f109931OooOo0o;
            C32446OooOOOo.OooO0O0(obj);
            objOooO0oo = obj;
            List list3 = (List) objOooO0oo;
            C34406OooO00o.C20358OooO00o c20358OooO00o3 = C34406OooO00o.f123390OooO00o;
            c20358OooO00o3.OooOOO0("DebugViewModel");
            List list4 = list3;
            c20358OooO00o3.OooO0o0(androidx.core.app.OooO.OooO00o(list3.size(), "exportLogs, allFolders: ", ", ", oOo000Oo.OooOo.o000oOoO(list4, null, null, null, new C30735OooOOOO(0), 31)), new Object[0]);
            iOooO0Oo = Oooo0.OooO0Oo(C34428OooOOo.OooOOoo(list4, 10));
            if (iOooO0Oo < 16) {
                iOooO0Oo = 16;
            }
            LinkedHashMap linkedHashMap = new LinkedHashMap(iOooO0Oo);
            for (Object obj3 : list4) {
                linkedHashMap.put(((Folder) obj3).getId(), obj3);
            }
            ArrayList arrayList2 = new ArrayList();
            for (Object obj4 : list4) {
                Folder folder = (Folder) obj4;
                if (folder.getParentId() != null && linkedHashMap.get(folder.getParentId()) == null) {
                    arrayList2.add(obj4);
                }
            }
            C34406OooO00o.C20358OooO00o c20358OooO00o4 = C34406OooO00o.f123390OooO00o;
            c20358OooO00o4.OooOOO0("DebugViewModel");
            int size = arrayList2.size();
            int size2 = arrayList2.size();
            String strO000oOoO = oOo000Oo.OooOo.o000oOoO(arrayList2, null, null, null, new C30736OooOOOo(), 31);
            StringBuilder sbOooO0O0 = C20398OooO0O0.OooO0O0("exportLogs, lostParentFolders: ", size, " ", " ", size2);
            sbOooO0O0.append(strO000oOoO);
            c20358OooO00o4.OooO0o0(sbOooO0O0.toString(), new Object[0]);
            c20358OooO00o4.OooOOO0("DebugViewModel");
            c20358OooO00o4.OooO0o0("exportLogs, user: " + interfaceC33721OooO0o, new Object[0]);
            this.f109931OooOo0o = linkedHashMap;
            this.f109930OooOo = 3;
            objOooOOo0 = c30722OooO00o.f109864OooOO0.OooOOo0(this);
            if (objOooOOo0 != enumC32485OooO00o) {
                map = linkedHashMap;
                List list5 = (List) objOooOOo0;
                C34406OooO00o.C20358OooO00o c20358OooO00o5 = C34406OooO00o.f123390OooO00o;
                c20358OooO00o5.OooOOO0("DebugViewModel");
                List list22 = list5;
                c20358OooO00o5.OooO0o0(androidx.core.app.OooO.OooO00o(list5.size(), "exportLogs, allNotes: ", ", ", oOo000Oo.OooOo.o000oOoO(list22, null, null, null, new C30738OooOOo0(0), 31)), new Object[0]);
                ArrayList arrayList3 = new ArrayList();
                while (r2.hasNext()) {
                }
                C34406OooO00o.C20358OooO00o c20358OooO00o22 = C34406OooO00o.f123390OooO00o;
                c20358OooO00o22.OooOOO0("DebugViewModel");
                c20358OooO00o22.OooO0o0(androidx.core.app.OooO.OooO00o(arrayList3.size(), "exportLogs, lostParentNotes: ", ", ", oOo000Oo.OooOo.o000oOoO(arrayList3, null, null, null, new C29338OooOO0O(1), 31)), new Object[0]);
                return C32460OooOooO.f116667OooO00o;
            }
            return enumC32485OooO00o;
        }
        C32446OooOOOo.OooO0O0(obj);
        objOooO0o0 = obj;
        interfaceC33721OooO0o = (InterfaceC33721OooO0o) objOooO0o0;
        this.f109931OooOo0o = interfaceC33721OooO0o;
        this.f109930OooOo = 2;
        objOooO0oo = c30722OooO00o.f109865OooOO0O.OooO0oo(this);
        if (objOooO0oo != enumC32485OooO00o) {
            List list32 = (List) objOooO0oo;
            C34406OooO00o.C20358OooO00o c20358OooO00o32 = C34406OooO00o.f123390OooO00o;
            c20358OooO00o32.OooOOO0("DebugViewModel");
            List list42 = list32;
            c20358OooO00o32.OooO0o0(androidx.core.app.OooO.OooO00o(list32.size(), "exportLogs, allFolders: ", ", ", oOo000Oo.OooOo.o000oOoO(list42, null, null, null, new C30735OooOOOO(0), 31)), new Object[0]);
            iOooO0Oo = Oooo0.OooO0Oo(C34428OooOOo.OooOOoo(list42, 10));
            if (iOooO0Oo < 16) {
            }
            LinkedHashMap linkedHashMap2 = new LinkedHashMap(iOooO0Oo);
            while (r5.hasNext()) {
            }
            ArrayList arrayList22 = new ArrayList();
            while (r5.hasNext()) {
            }
            C34406OooO00o.C20358OooO00o c20358OooO00o42 = C34406OooO00o.f123390OooO00o;
            c20358OooO00o42.OooOOO0("DebugViewModel");
            int size3 = arrayList22.size();
            int size22 = arrayList22.size();
            String strO000oOoO2 = oOo000Oo.OooOo.o000oOoO(arrayList22, null, null, null, new C30736OooOOOo(), 31);
            StringBuilder sbOooO0O02 = C20398OooO0O0.OooO0O0("exportLogs, lostParentFolders: ", size3, " ", " ", size22);
            sbOooO0O02.append(strO000oOoO2);
            c20358OooO00o42.OooO0o0(sbOooO0O02.toString(), new Object[0]);
            c20358OooO00o42.OooOOO0("DebugViewModel");
            c20358OooO00o42.OooO0o0("exportLogs, user: " + interfaceC33721OooO0o, new Object[0]);
            this.f109931OooOo0o = linkedHashMap2;
            this.f109930OooOo = 3;
            objOooOOo0 = c30722OooO00o.f109864OooOO0.OooOOo0(this);
            if (objOooOOo0 != enumC32485OooO00o) {
            }
        }
        return enumC32485OooO00o;
    }
}
