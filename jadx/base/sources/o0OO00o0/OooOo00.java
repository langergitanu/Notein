package o0OO00o0;

import com.orion.notein.data.p602db.entity.CommentEntity;
import com.orion.notein.domain.mapper.CommentMapper;
import com.orion.notein.domain.models.note.Comment;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import o0000oOO.AbstractC24338OooO0o0;
import o0000oOO.C24340OooO0oo;
import o0OO000o.C26454OooO0Oo;
import o0OO000o.C26466OooO0o0;
import oO00ooO.C32446OooOOOo;
import oO00ooO.C32460OooOooO;
import oO00ooo.AbstractC32479OooO0OO;
import oO00ooo0.EnumC32485OooO00o;
import oO0o0Oo.C33734OooOOoo;
import oOo000Oo.C34428OooOOo;
import oo0oO0.InterfaceC34739OoooOo0;

/* JADX INFO: loaded from: classes9.dex */
public final class OooOo00 {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public static final AbstractC24338OooO0o0.OooO00o<String> f91040OooO0Oo = C24340OooO0oo.OooO0o0("comment_sort");

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final C26479OooOO0o f91041OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final o0000o0O.OooOO0<AbstractC24338OooO0o0> f91042OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final CommentMapper f91043OooO0OO;

    public OooOo00(C26479OooOO0o localDataSource, o0000o0O.OooOO0<AbstractC24338OooO0o0> dataStore, CommentMapper mapper) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(localDataSource, "localDataSource");
        kotlin.jvm.internal.OooOOO0.OooO0oO(dataStore, "dataStore");
        kotlin.jvm.internal.OooOOO0.OooO0oO(mapper, "mapper");
        this.f91041OooO00o = localDataSource;
        this.f91042OooO0O0 = dataStore;
        this.f91043OooO0OO = mapper;
    }

    public final Object OooO00o(String str, List list, AbstractC32479OooO0OO abstractC32479OooO0OO) {
        List list2 = list;
        ArrayList arrayList = new ArrayList(C34428OooOOo.OooOOoo(list2, 10));
        Iterator it = list2.iterator();
        while (it.hasNext()) {
            arrayList.add(this.f91043OooO0OO.toEntity((Comment) it.next()));
        }
        C26479OooOO0o c26479OooOO0o = this.f91041OooO00o;
        c26479OooOO0o.getClass();
        Object objOooO00o = c26479OooOO0o.OooO00o(str, new OooO00o(arrayList, null));
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        if (objOooO00o != enumC32485OooO00o) {
            objOooO00o = C32460OooOooO.f116667OooO00o;
        }
        return objOooO00o == enumC32485OooO00o ? objOooO00o : C32460OooOooO.f116667OooO00o;
    }

    public final OooOOO OooO0O0(String noteId) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(noteId, "noteId");
        C26479OooOO0o c26479OooOO0o = this.f91041OooO00o;
        c26479OooOO0o.getClass();
        C26454OooO0Oo c26454OooO0Oo = c26479OooOO0o.f91007OooO00o;
        c26454OooO0Oo.getClass();
        c26454OooO0Oo.OooO0O0(noteId);
        InterfaceC34739OoooOo0 it = c26454OooO0Oo.OooO0o(noteId).OooOo0O();
        kotlin.jvm.internal.OooOOO0.OooO0oO(it, "it");
        return new OooOOO(new C33734OooOOoo(it.OooO0o0(noteId), new C26466OooO0o0(c26454OooO0Oo, noteId, null)), this);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object OooO0OO(String str, String str2, AbstractC32479OooO0OO abstractC32479OooO0OO) {
        OooOOOO oooOOOO;
        OooOo00 oooOo00;
        if (abstractC32479OooO0OO instanceof OooOOOO) {
            oooOOOO = (OooOOOO) abstractC32479OooO0OO;
            int i = oooOOOO.f91021OooOoO;
            if ((i & Integer.MIN_VALUE) != 0) {
                oooOOOO.f91021OooOoO = i - Integer.MIN_VALUE;
            } else {
                oooOOOO = new OooOOOO(this, abstractC32479OooO0OO);
            }
        }
        Object objOooO00o = oooOOOO.f91019OooOo;
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i2 = oooOOOO.f91021OooOoO;
        if (i2 == 0) {
            C32446OooOOOo.OooO0O0(objOooO00o);
            oooOOOO.f91020OooOo0o = this;
            oooOOOO.f91021OooOoO = 1;
            C26479OooOO0o c26479OooOO0o = this.f91041OooO00o;
            c26479OooOO0o.getClass();
            objOooO00o = c26479OooOO0o.OooO00o(str2, new C26475OooO0Oo(str, null));
            if (objOooO00o == enumC32485OooO00o) {
                return enumC32485OooO00o;
            }
            oooOo00 = this;
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oooOo00 = oooOOOO.f91020OooOo0o;
            C32446OooOOOo.OooO0O0(objOooO00o);
        }
        Comment model = oooOo00.f91043OooO0OO.toModel((CommentEntity) objOooO00o);
        kotlin.jvm.internal.OooOOO0.OooO0o(model, "let(...)");
        return model;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Serializable OooO0Oo(String str, String str2, AbstractC32479OooO0OO abstractC32479OooO0OO) {
        C26480OooOOOo c26480OooOOOo;
        OooOo00 oooOo00;
        if (abstractC32479OooO0OO instanceof C26480OooOOOo) {
            c26480OooOOOo = (C26480OooOOOo) abstractC32479OooO0OO;
            int i = c26480OooOOOo.f91025OooOoO;
            if ((i & Integer.MIN_VALUE) != 0) {
                c26480OooOOOo.f91025OooOoO = i - Integer.MIN_VALUE;
            } else {
                c26480OooOOOo = new C26480OooOOOo(this, abstractC32479OooO0OO);
            }
        }
        Object objOooO00o = c26480OooOOOo.f91023OooOo;
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i2 = c26480OooOOOo.f91025OooOoO;
        if (i2 == 0) {
            C32446OooOOOo.OooO0O0(objOooO00o);
            c26480OooOOOo.f91024OooOo0o = this;
            c26480OooOOOo.f91025OooOoO = 1;
            C26479OooOO0o c26479OooOO0o = this.f91041OooO00o;
            c26479OooOO0o.getClass();
            objOooO00o = c26479OooOO0o.OooO00o(str2, new C26476OooO0o0(str, null));
            if (objOooO00o == enumC32485OooO00o) {
                return enumC32485OooO00o;
            }
            oooOo00 = this;
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oooOo00 = c26480OooOOOo.f91024OooOo0o;
            C32446OooOOOo.OooO0O0(objOooO00o);
        }
        Iterable iterable = (Iterable) objOooO00o;
        ArrayList arrayList = new ArrayList(C34428OooOOo.OooOOoo(iterable, 10));
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            arrayList.add(oooOo00.f91043OooO0OO.toModel((CommentEntity) it.next()));
        }
        return arrayList;
    }
}
