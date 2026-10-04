package o0OO00o0;

import com.orion.notein.data.p602db.entity.LatestOpenedNoteEntity;
import com.orion.notein.domain.mapper.LatestOpenedNoteMapper;
import com.orion.notein.domain.models.note.LatestOpenedNote;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import o0OOo0Oo.InterfaceC27305OooOo0;
import oO00ooO.C32446OooOOOo;
import oO00ooO.C32460OooOooO;
import oO00ooo.AbstractC32476OooO;
import oO00ooo.AbstractC32479OooO0OO;
import oO00ooo0.EnumC32485OooO00o;
import oOo000Oo.C34428OooOOo;
import oo0oO0.InterfaceC34783o000OoOO;

/* JADX INFO: loaded from: classes9.dex */
public final class o00OO0O implements InterfaceC27305OooOo0 {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final InterfaceC34783o000OoOO f91797OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final LatestOpenedNoteMapper f91798OooO0O0;

    public o00OO0O(InterfaceC34783o000OoOO dao, LatestOpenedNoteMapper mapper) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(dao, "dao");
        kotlin.jvm.internal.OooOOO0.OooO0oO(mapper, "mapper");
        this.f91797OooO00o = dao;
        this.f91798OooO0O0 = mapper;
    }

    @Override // o0OOo0Oo.InterfaceC27305OooOo0
    public final o00OO0 OooO00o() {
        return new o00OO0(this.f91797OooO00o.OooO00o(), this, 0);
    }

    @Override // o0OOo0Oo.InterfaceC27305OooOo0
    public final Object OooO0O0(List list, AbstractC32476OooO abstractC32476OooO) {
        Object objOooO0O0 = this.f91797OooO00o.OooO0O0(list, abstractC32476OooO);
        return objOooO0O0 == EnumC32485OooO00o.f116726OooOo0o ? objOooO0O0 : C32460OooOooO.f116667OooO00o;
    }

    @Override // o0OOo0Oo.InterfaceC27305OooOo0
    public final Object OooO0OO(List list, AbstractC32476OooO abstractC32476OooO) {
        List list2 = list;
        ArrayList arrayList = new ArrayList(C34428OooOOo.OooOOoo(list2, 10));
        Iterator it = list2.iterator();
        while (it.hasNext()) {
            arrayList.add(this.f91798OooO0O0.toEntity((LatestOpenedNote) it.next()));
        }
        Object objOooO0Oo = this.f91797OooO00o.OooO0Oo(arrayList, abstractC32476OooO);
        return objOooO0Oo == EnumC32485OooO00o.f116726OooOo0o ? objOooO0Oo : C32460OooOooO.f116667OooO00o;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // o0OOo0Oo.InterfaceC27305OooOo0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Serializable OooO0Oo(AbstractC32479OooO0OO abstractC32479OooO0OO) {
        o00OO0O0 o00oo0o02;
        o00OO0O o00oo0o;
        if (abstractC32479OooO0OO instanceof o00OO0O0) {
            o00oo0o02 = (o00OO0O0) abstractC32479OooO0OO;
            int i = o00oo0o02.f91801OooOoO;
            if ((i & Integer.MIN_VALUE) != 0) {
                o00oo0o02.f91801OooOoO = i - Integer.MIN_VALUE;
            } else {
                o00oo0o02 = new o00OO0O0(this, abstractC32479OooO0OO);
            }
        }
        Object objOooO0OO = o00oo0o02.f91799OooOo;
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i2 = o00oo0o02.f91801OooOoO;
        if (i2 == 0) {
            C32446OooOOOo.OooO0O0(objOooO0OO);
            o00oo0o02.f91800OooOo0o = this;
            o00oo0o02.f91801OooOoO = 1;
            objOooO0OO = this.f91797OooO00o.OooO0OO(o00oo0o02);
            if (objOooO0OO == enumC32485OooO00o) {
                return enumC32485OooO00o;
            }
            o00oo0o = this;
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            o00oo0o = o00oo0o02.f91800OooOo0o;
            C32446OooOOOo.OooO0O0(objOooO0OO);
        }
        Iterable iterable = (Iterable) objOooO0OO;
        ArrayList arrayList = new ArrayList(C34428OooOOo.OooOOoo(iterable, 10));
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            arrayList.add(o00oo0o.f91798OooO0O0.toModel((LatestOpenedNoteEntity) it.next()));
        }
        return arrayList;
    }
}
