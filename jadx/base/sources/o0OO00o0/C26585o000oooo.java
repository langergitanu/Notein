package o0OO00o0;

import com.orion.notein.data.p602db.entity.HyperLinkEntity;
import com.orion.notein.domain.mapper.HyperLinkMapper;
import com.orion.notein.domain.models.page.HyperLink;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import o0OOo0Oo.InterfaceC27301OooOOo;
import o0OOo0o.C27419o000o00o;
import o0OOo0o.C27438o000ooo;
import o0OoO0oo.C28956o00oOo00;
import oO00ooO.C32446OooOOOo;
import oO00ooO.C32460OooOooO;
import oO00ooo.AbstractC32479OooO0OO;
import oO00ooo0.EnumC32485OooO00o;
import oOo000Oo.C34428OooOOo;

/* JADX INFO: renamed from: o0OO00o0.o000oooo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C26585o000oooo implements InterfaceC27301OooOOo {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final C26582o000ooo f91620OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final HyperLinkMapper f91621OooO0O0;

    public C26585o000oooo(C26582o000ooo localDataSource, HyperLinkMapper mapper) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(localDataSource, "localDataSource");
        kotlin.jvm.internal.OooOOO0.OooO0oO(mapper, "mapper");
        this.f91620OooO00o = localDataSource;
        this.f91621OooO0O0 = mapper;
    }

    @Override // o0OOo0Oo.InterfaceC27301OooOOo
    public final Object OooO00o(String str, String str2, C27438o000ooo c27438o000ooo) {
        C26582o000ooo c26582o000ooo = this.f91620OooO00o;
        c26582o000ooo.getClass();
        Object objOooO00o = c26582o000ooo.OooO00o(str2, new C26579o000ooO(str, null));
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        if (objOooO00o != enumC32485OooO00o) {
            objOooO00o = C32460OooOooO.f116667OooO00o;
        }
        return objOooO00o == enumC32485OooO00o ? objOooO00o : C32460OooOooO.f116667OooO00o;
    }

    @Override // o0OOo0Oo.InterfaceC27301OooOOo
    public final Object OooO0O0(String str, ArrayList arrayList, AbstractC32479OooO0OO abstractC32479OooO0OO) {
        ArrayList arrayList2 = new ArrayList(C34428OooOOo.OooOOoo(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(this.f91621OooO0O0.toEntity((HyperLink) it.next()));
        }
        C26582o000ooo c26582o000ooo = this.f91620OooO00o;
        c26582o000ooo.getClass();
        Object objOooO00o = c26582o000ooo.OooO00o(str, new C26574o000oo(arrayList2, null));
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        if (objOooO00o != enumC32485OooO00o) {
            objOooO00o = C32460OooOooO.f116667OooO00o;
        }
        return objOooO00o == enumC32485OooO00o ? objOooO00o : C32460OooOooO.f116667OooO00o;
    }

    @Override // o0OOo0Oo.InterfaceC27301OooOOo
    public final Object OooO0OO(String str, C27419o000o00o c27419o000o00o) {
        C26582o000ooo c26582o000ooo = this.f91620OooO00o;
        c26582o000ooo.getClass();
        Object objOooO00o = c26582o000ooo.OooO00o(str, new C26578o000oo0o(2, null));
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        if (objOooO00o != enumC32485OooO00o) {
            objOooO00o = C32460OooOooO.f116667OooO00o;
        }
        return objOooO00o == enumC32485OooO00o ? objOooO00o : C32460OooOooO.f116667OooO00o;
    }

    @Override // o0OOo0Oo.InterfaceC27301OooOOo
    public final Object OooO0Oo(List list, String str, C28956o00oOo00 c28956o00oOo00) {
        C26582o000ooo c26582o000ooo = this.f91620OooO00o;
        c26582o000ooo.getClass();
        Object objOooO00o = c26582o000ooo.OooO00o(str, new C26580o000ooO0(list, null));
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        if (objOooO00o != enumC32485OooO00o) {
            objOooO00o = C32460OooOooO.f116667OooO00o;
        }
        return objOooO00o == enumC32485OooO00o ? objOooO00o : C32460OooOooO.f116667OooO00o;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // o0OOo0Oo.InterfaceC27301OooOOo
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Serializable OooO0o0(String str, String str2, AbstractC32479OooO0OO abstractC32479OooO0OO) {
        C26584o000oooO c26584o000oooO;
        C26585o000oooo c26585o000oooo;
        if (abstractC32479OooO0OO instanceof C26584o000oooO) {
            c26584o000oooO = (C26584o000oooO) abstractC32479OooO0OO;
            int i = c26584o000oooO.f91618OooOoO;
            if ((i & Integer.MIN_VALUE) != 0) {
                c26584o000oooO.f91618OooOoO = i - Integer.MIN_VALUE;
            } else {
                c26584o000oooO = new C26584o000oooO(this, abstractC32479OooO0OO);
            }
        }
        Object objOooO00o = c26584o000oooO.f91616OooOo;
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i2 = c26584o000oooO.f91618OooOoO;
        if (i2 == 0) {
            C32446OooOOOo.OooO0O0(objOooO00o);
            c26584o000oooO.f91617OooOo0o = this;
            c26584o000oooO.f91618OooOoO = 1;
            C26582o000ooo c26582o000ooo = this.f91620OooO00o;
            c26582o000ooo.getClass();
            objOooO00o = c26582o000ooo.OooO00o(str2, new C26581o000ooOO(str, null));
            if (objOooO00o == enumC32485OooO00o) {
                return enumC32485OooO00o;
            }
            c26585o000oooo = this;
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            c26585o000oooo = c26584o000oooO.f91617OooOo0o;
            C32446OooOOOo.OooO0O0(objOooO00o);
        }
        Iterable iterable = (Iterable) objOooO00o;
        ArrayList arrayList = new ArrayList(C34428OooOOo.OooOOoo(iterable, 10));
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            arrayList.add(c26585o000oooo.f91621OooO0O0.toHyperLink((HyperLinkEntity) it.next()));
        }
        return arrayList;
    }
}
