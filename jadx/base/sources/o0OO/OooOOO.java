package o0OO;

import com.orion.notein.data.p602db.entity.NoteContentEntity;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import o0OO000o.C26454OooO0Oo;
import oO00ooO.C32446OooOOOo;
import oO00ooo.AbstractC32479OooO0OO;
import oO00ooo0.EnumC32485OooO00o;
import oO0O000o.InterfaceC32508OooOOOo;

/* JADX INFO: loaded from: classes9.dex */
public final class OooOOO {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final C26454OooO0Oo f90661OooO00o;

    public OooOOO(C26454OooO0Oo provider) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(provider, "provider");
        this.f90661OooO00o = provider;
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x004d  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:18:0x0068 -> B:20:0x006b). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object OooO00o(List list, AbstractC32479OooO0OO abstractC32479OooO0OO) {
        C26406OooO0o0 c26406OooO0o0;
        Iterator it;
        OooOOO oooOOO;
        Collection collection;
        if (abstractC32479OooO0OO instanceof C26406OooO0o0) {
            c26406OooO0o0 = (C26406OooO0o0) abstractC32479OooO0OO;
            int i = c26406OooO0o0.f90642OooOoo0;
            if ((i & Integer.MIN_VALUE) != 0) {
                c26406OooO0o0.f90642OooOoo0 = i - Integer.MIN_VALUE;
            } else {
                c26406OooO0o0 = new C26406OooO0o0(this, abstractC32479OooO0OO);
            }
        }
        Object objOooO0O0 = c26406OooO0o0.f90639OooOoO;
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i2 = c26406OooO0o0.f90642OooOoo0;
        if (i2 == 0) {
            C32446OooOOOo.OooO0O0(objOooO0O0);
            ArrayList arrayList = new ArrayList();
            it = list.iterator();
            oooOOO = this;
            collection = arrayList;
            if (it.hasNext()) {
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            it = c26406OooO0o0.f90640OooOoO0;
            collection = c26406OooO0o0.f90637OooOo;
            oooOOO = c26406OooO0o0.f90638OooOo0o;
            C32446OooOOOo.OooO0O0(objOooO0O0);
            NoteContentEntity noteContentEntity = (NoteContentEntity) objOooO0O0;
            if (noteContentEntity != null) {
                collection.add(noteContentEntity);
            }
            if (it.hasNext()) {
                String str = (String) it.next();
                OooO0o oooO0o = new OooO0o(str, null);
                c26406OooO0o0.f90638OooOo0o = oooOOO;
                c26406OooO0o0.f90637OooOo = collection;
                c26406OooO0o0.f90640OooOoO0 = it;
                c26406OooO0o0.f90642OooOoo0 = 1;
                objOooO0O0 = oooOOO.OooO0O0(str, oooO0o);
                if (objOooO0O0 == enumC32485OooO00o) {
                    return enumC32485OooO00o;
                }
                NoteContentEntity noteContentEntity2 = (NoteContentEntity) objOooO0O0;
                if (noteContentEntity2 != null) {
                }
                if (it.hasNext()) {
                    return (List) collection;
                }
            }
        }
    }

    public final Object OooO0O0(String str, InterfaceC32508OooOOOo interfaceC32508OooOOOo) {
        return this.f90661OooO00o.OooO0oO(str, new C26407OooO0oO(interfaceC32508OooOOOo, null));
    }
}
