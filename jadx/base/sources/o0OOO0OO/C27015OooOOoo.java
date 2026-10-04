package o0OOO0OO;

import com.aspose.slides.internal.p332p7.C22237OooO0o0;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import o0OO000o.C26454OooO0Oo;
import oO00ooO.C32446OooOOOo;
import oO00ooo.AbstractC32479OooO0OO;
import oO00ooo0.EnumC32485OooO00o;
import oO0O000o.InterfaceC32508OooOOOo;
import oOO00oo.C34406OooO00o;
import oOo000Oo.C34428OooOOo;
import oOo000Oo.C34434OooOoO;

/* JADX INFO: renamed from: o0OOO0OO.OooOOoo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C27015OooOOoo {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final C26454OooO0Oo f94033OooO00o;

    public C27015OooOOoo(C26454OooO0Oo provider) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(provider, "provider");
        this.f94033OooO00o = provider;
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00c2  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:20:0x0093 -> B:21:0x0097). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object OooO00o(Set set, AbstractC32479OooO0OO abstractC32479OooO0OO) {
        OooO oooO;
        C27015OooOOoo c27015OooOOoo;
        Collection arrayList;
        Iterator it;
        C27015OooOOoo c27015OooOOoo2;
        if (abstractC32479OooO0OO instanceof OooO) {
            oooO = (OooO) abstractC32479OooO0OO;
            int i = oooO.f93982OooOooO;
            if ((i & Integer.MIN_VALUE) != 0) {
                oooO.f93982OooOooO = i - Integer.MIN_VALUE;
                c27015OooOOoo = this;
            } else {
                c27015OooOOoo = this;
                oooO = new OooO(c27015OooOOoo, abstractC32479OooO0OO);
            }
        }
        Object obj = oooO.f93981OooOoo0;
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i2 = oooO.f93982OooOooO;
        if (i2 == 0) {
            C32446OooOOOo.OooO0O0(obj);
            Set set2 = set;
            arrayList = new ArrayList(C34428OooOOo.OooOOoo(set2, 10));
            it = set2.iterator();
            c27015OooOOoo2 = c27015OooOOoo;
            Object next = null;
            if (it.hasNext()) {
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            arrayList = oooO.f93979OooOoOO;
            String str = oooO.f93977OooOoO;
            it = oooO.f93978OooOoO0;
            Collection collection = oooO.f93975OooOo;
            c27015OooOOoo2 = oooO.f93976OooOo0o;
            C32446OooOOOo.OooO0O0(obj);
            List list = (List) obj;
            C34406OooO00o.C20358OooO00o c20358OooO00o = C34406OooO00o.f123390OooO00o;
            c20358OooO00o.OooOOO0("PageLocalDataSource");
            c20358OooO00o.OooO0o0(C22237OooO0o0.OooO00o("getPageInTrashBinSync noteId ", str, ", <--- result is: ", oOo000Oo.OooOo.o000oOoO(list, null, null, null, new C27007OooO0Oo(), 31)), new Object[0]);
            arrayList.add(list);
            arrayList = collection;
            Object next2 = null;
            if (it.hasNext()) {
                String str2 = (String) it.next();
                C34406OooO00o.C20358OooO00o c20358OooO00o2 = C34406OooO00o.f123390OooO00o;
                c20358OooO00o2.OooO0o0(androidx.core.app.OooO.OooO0O0(c20358OooO00o2, "PageLocalDataSource", "getPageInTrashBinSync --->: ", str2), new Object[0]);
                OooOO0 oooOO02 = new OooOO0(str2, null);
                oooO.f93976OooOo0o = c27015OooOOoo2;
                Collection collection2 = arrayList;
                oooO.f93975OooOo = collection2;
                oooO.f93978OooOoO0 = it;
                oooO.f93977OooOoO = str2;
                oooO.f93979OooOoOO = collection2;
                oooO.f93982OooOooO = 1;
                Object objOooO0O0 = c27015OooOOoo2.OooO0O0(str2, oooOO02);
                if (objOooO0O0 == enumC32485OooO00o) {
                    return enumC32485OooO00o;
                }
                str = str2;
                obj = objOooO0O0;
                collection = arrayList;
                List list2 = (List) obj;
                C34406OooO00o.C20358OooO00o c20358OooO00o3 = C34406OooO00o.f123390OooO00o;
                c20358OooO00o3.OooOOO0("PageLocalDataSource");
                c20358OooO00o3.OooO0o0(C22237OooO0o0.OooO00o("getPageInTrashBinSync noteId ", str, ", <--- result is: ", oOo000Oo.OooOo.o000oOoO(list2, null, null, null, new C27007OooO0Oo(), 31)), new Object[0]);
                arrayList.add(list2);
                arrayList = collection;
                Object next22 = null;
                if (it.hasNext()) {
                    Iterator it2 = ((List) arrayList).iterator();
                    if (it2.hasNext()) {
                        next22 = it2.next();
                        while (it2.hasNext()) {
                            next22 = oOo000Oo.OooOo.OooooOO((List) next22, (List) it2.next());
                        }
                    }
                    List list3 = (List) next22;
                    return list3 == null ? C34434OooOoO.f123453OooOo0o : list3;
                }
            }
        }
    }

    public final Object OooO0O0(String str, InterfaceC32508OooOOOo interfaceC32508OooOOOo) {
        return this.f94033OooO00o.OooO0oO(str, new OooOOO0(interfaceC32508OooOOOo, null));
    }
}
