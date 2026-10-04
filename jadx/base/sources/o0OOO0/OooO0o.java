package o0OOO0;

import com.orion.notein.data.p602db.entity.AiOcrTextPageEntity;
import com.orion.notein.domain.mapper.AiOcrTextPageMapper;
import com.orion.notein.domain.models.ocr.AiOcrTextPage;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.OooOOO0;
import o0OOO0O0.C27003OooO0oo;
import o0OOo0Oo.InterfaceC27289OooO0Oo;
import o0o0OO0.C30397OooOOOo;
import oO00ooO.C32460OooOooO;
import oO00ooo.AbstractC32479OooO0OO;
import oO00ooo0.EnumC32485OooO00o;
import oO0Oo.C33165OooO00o;
import oOo000Oo.C34428OooOOo;

/* JADX INFO: loaded from: classes9.dex */
public final class OooO0o implements InterfaceC27289OooO0Oo {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final C27003OooO0oo f93761OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final AiOcrTextPageMapper f93762OooO0O0;

    public OooO0o(C27003OooO0oo localDataSource, AiOcrTextPageMapper sessionMapper) {
        OooOOO0.OooO0oO(localDataSource, "localDataSource");
        OooOOO0.OooO0oO(sessionMapper, "sessionMapper");
        this.f93761OooO00o = localDataSource;
        this.f93762OooO0O0 = sessionMapper;
    }

    @Override // o0OOo0Oo.InterfaceC27289OooO0Oo
    public final C26985OooO0o0 OooO00o(List list) {
        C27003OooO0oo c27003OooO0oo = this.f93761OooO00o;
        c27003OooO0oo.getClass();
        return new C26985OooO0o0(c27003OooO0oo.f93951OooO00o.OooO00o(list), this);
    }

    @Override // o0OOo0Oo.InterfaceC27289OooO0Oo
    public final Object OooO0O0(String str, C30397OooOOOo c30397OooOOOo) {
        Object objOooO0O0 = this.f93761OooO00o.f93951OooO00o.OooO0O0(str, c30397OooOOOo);
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        if (objOooO0O0 != enumC32485OooO00o) {
            objOooO0O0 = C32460OooOooO.f116667OooO00o;
        }
        return objOooO0O0 == enumC32485OooO00o ? objOooO0O0 : C32460OooOooO.f116667OooO00o;
    }

    @Override // o0OOo0Oo.InterfaceC27289OooO0Oo
    public final Object OooO0OO(AiOcrTextPage aiOcrTextPage, AbstractC32479OooO0OO abstractC32479OooO0OO) {
        AiOcrTextPageEntity entity = this.f93762OooO0O0.toEntity(aiOcrTextPage);
        OooOOO0.OooO0o(entity, "toEntity(...)");
        Object objOooO0Oo = this.f93761OooO00o.f93951OooO00o.OooO0Oo(entity, abstractC32479OooO0OO);
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        if (objOooO0Oo != enumC32485OooO00o) {
            objOooO0Oo = C32460OooOooO.f116667OooO00o;
        }
        return objOooO0Oo == enumC32485OooO00o ? objOooO0Oo : C32460OooOooO.f116667OooO00o;
    }

    @Override // o0OOo0Oo.InterfaceC27289OooO0Oo
    public final Object OooO0Oo(ArrayList arrayList, C33165OooO00o c33165OooO00o) {
        ArrayList arrayList2 = new ArrayList(C34428OooOOo.OooOOoo(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(this.f93762OooO0O0.toEntity((AiOcrTextPage) it.next()));
        }
        C27003OooO0oo c27003OooO0oo = this.f93761OooO00o;
        c27003OooO0oo.getClass();
        AiOcrTextPageEntity[] aiOcrTextPageEntityArr = (AiOcrTextPageEntity[]) arrayList2.toArray(new AiOcrTextPageEntity[0]);
        Object objOooO0OO = c27003OooO0oo.f93951OooO00o.OooO0OO((AiOcrTextPageEntity[]) Arrays.copyOf(aiOcrTextPageEntityArr, aiOcrTextPageEntityArr.length), c33165OooO00o);
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        if (objOooO0OO != enumC32485OooO00o) {
            objOooO0OO = C32460OooOooO.f116667OooO00o;
        }
        return objOooO0OO == enumC32485OooO00o ? objOooO0OO : C32460OooOooO.f116667OooO00o;
    }
}
