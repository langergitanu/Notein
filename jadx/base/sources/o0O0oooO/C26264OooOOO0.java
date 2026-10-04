package o0O0oooO;

import android.graphics.RectF;
import com.orion.notein.data.p602db.entity.TextBoxEntity;
import com.orion.notein.domain.mapper.TextBoxMapper;
import com.orion.notein.domain.models.page.TextBox;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import o0OO00o0.C26664o00o0O0;
import o0OO00o0.C26666o00o0O0O;
import o0OO00o0.C26671o00o0Oo;
import o0OO00o0.C26672o00o0Oo0;
import o0OO00o0.C26673o00o0OoO;
import o0OO00o0.C26675o00o0o;
import o0OO00o0.C26676o00o0o00;
import o0OO00o0.C26677o00o0o0O;
import o0OO00o0.C26678o00o0o0o;
import o0OOo0o.C27419o000o00o;
import oO00ooO.C32446OooOOOo;
import oO00ooO.C32460OooOooO;
import oO00ooo.AbstractC32479OooO0OO;
import oO00ooo0.EnumC32485OooO00o;
import oOo000Oo.C34428OooOOo;

/* JADX INFO: renamed from: o0O0oooO.OooOOO0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C26264OooOOO0 {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final Object f89720OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final Object f89721OooO0O0;

    public C26264OooOOO0(C26676o00o0o00 localDataSource, TextBoxMapper mapper) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(localDataSource, "localDataSource");
        kotlin.jvm.internal.OooOOO0.OooO0oO(mapper, "mapper");
        this.f89720OooO00o = localDataSource;
        this.f89721OooO0O0 = mapper;
    }

    public Object OooO00o(String str, C27419o000o00o c27419o000o00o) {
        C26676o00o0o00 c26676o00o0o00 = (C26676o00o0o00) this.f89720OooO00o;
        c26676o00o0o00.getClass();
        Object objOooO0O0 = c26676o00o0o00.OooO0O0(str, new C26664o00o0O0(2, null));
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        if (objOooO0O0 != enumC32485OooO00o) {
            objOooO0O0 = C32460OooOooO.f116667OooO00o;
        }
        return objOooO0O0 == enumC32485OooO00o ? objOooO0O0 : C32460OooOooO.f116667OooO00o;
    }

    public Object OooO0O0(ArrayList arrayList, String str, boolean z, AbstractC32479OooO0OO abstractC32479OooO0OO) {
        ArrayList arrayList2 = new ArrayList(C34428OooOOo.OooOOoo(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(((TextBoxMapper) this.f89721OooO0O0).toEntity((TextBox) it.next()));
        }
        C26676o00o0o00 c26676o00o0o00 = (C26676o00o0o00) this.f89720OooO00o;
        c26676o00o0o00.getClass();
        Object objOooO0O0 = c26676o00o0o00.OooO0O0(str, new C26666o00o0O0O(z, arrayList2, null));
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        if (objOooO0O0 != enumC32485OooO00o) {
            objOooO0O0 = C32460OooOooO.f116667OooO00o;
        }
        return objOooO0O0 == enumC32485OooO00o ? objOooO0O0 : C32460OooOooO.f116667OooO00o;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object OooO0OO(String str, String str2, AbstractC32479OooO0OO abstractC32479OooO0OO) {
        C26677o00o0o0O c26677o00o0o0O;
        C26264OooOOO0 c26264OooOOO0;
        if (abstractC32479OooO0OO instanceof C26677o00o0o0O) {
            c26677o00o0o0O = (C26677o00o0o0O) abstractC32479OooO0OO;
            int i = c26677o00o0o0O.f92063OooOoO;
            if ((i & Integer.MIN_VALUE) != 0) {
                c26677o00o0o0O.f92063OooOoO = i - Integer.MIN_VALUE;
            } else {
                c26677o00o0o0O = new C26677o00o0o0O(this, abstractC32479OooO0OO);
            }
        }
        Object objOooO0O0 = c26677o00o0o0O.f92061OooOo;
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i2 = c26677o00o0o0O.f92063OooOoO;
        if (i2 == 0) {
            C32446OooOOOo.OooO0O0(objOooO0O0);
            c26677o00o0o0O.f92062OooOo0o = this;
            c26677o00o0o0O.f92063OooOoO = 1;
            C26676o00o0o00 c26676o00o0o00 = (C26676o00o0o00) this.f89720OooO00o;
            c26676o00o0o00.getClass();
            objOooO0O0 = c26676o00o0o00.OooO0O0(str2, new C26672o00o0Oo0(str, null));
            if (objOooO0O0 == enumC32485OooO00o) {
                return enumC32485OooO00o;
            }
            c26264OooOOO0 = this;
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            c26264OooOOO0 = c26677o00o0o0O.f92062OooOo0o;
            C32446OooOOOo.OooO0O0(objOooO0O0);
        }
        return ((TextBoxMapper) c26264OooOOO0.f89721OooO0O0).toModel((TextBoxEntity) objOooO0O0);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Serializable OooO0Oo(String str, String str2, AbstractC32479OooO0OO abstractC32479OooO0OO) {
        C26678o00o0o0o c26678o00o0o0o;
        C26264OooOOO0 c26264OooOOO0;
        if (abstractC32479OooO0OO instanceof C26678o00o0o0o) {
            c26678o00o0o0o = (C26678o00o0o0o) abstractC32479OooO0OO;
            int i = c26678o00o0o0o.f92067OooOoO;
            if ((i & Integer.MIN_VALUE) != 0) {
                c26678o00o0o0o.f92067OooOoO = i - Integer.MIN_VALUE;
            } else {
                c26678o00o0o0o = new C26678o00o0o0o(this, abstractC32479OooO0OO);
            }
        }
        Object objOooO0O0 = c26678o00o0o0o.f92065OooOo;
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i2 = c26678o00o0o0o.f92067OooOoO;
        if (i2 == 0) {
            C32446OooOOOo.OooO0O0(objOooO0O0);
            c26678o00o0o0o.f92066OooOo0o = this;
            c26678o00o0o0o.f92067OooOoO = 1;
            C26676o00o0o00 c26676o00o0o00 = (C26676o00o0o00) this.f89720OooO00o;
            c26676o00o0o00.getClass();
            objOooO0O0 = c26676o00o0o00.OooO0O0(str2, new C26671o00o0Oo(str, null));
            if (objOooO0O0 == enumC32485OooO00o) {
                return enumC32485OooO00o;
            }
            c26264OooOOO0 = this;
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            c26264OooOOO0 = c26678o00o0o0o.f92066OooOo0o;
            C32446OooOOOo.OooO0O0(objOooO0O0);
        }
        Iterable iterable = (Iterable) objOooO0O0;
        ArrayList arrayList = new ArrayList(C34428OooOOo.OooOOoo(iterable, 10));
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            arrayList.add(((TextBoxMapper) c26264OooOOO0.f89721OooO0O0).toModel((TextBoxEntity) it.next()));
        }
        return arrayList;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Serializable OooO0o0(String str, String str2, RectF rectF, AbstractC32479OooO0OO abstractC32479OooO0OO) {
        C26675o00o0o c26675o00o0o;
        C26264OooOOO0 c26264OooOOO0;
        if (abstractC32479OooO0OO instanceof C26675o00o0o) {
            c26675o00o0o = (C26675o00o0o) abstractC32479OooO0OO;
            int i = c26675o00o0o.f92058OooOoO;
            if ((i & Integer.MIN_VALUE) != 0) {
                c26675o00o0o.f92058OooOoO = i - Integer.MIN_VALUE;
            } else {
                c26675o00o0o = new C26675o00o0o(this, abstractC32479OooO0OO);
            }
        }
        Object objOooO0O0 = c26675o00o0o.f92056OooOo;
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i2 = c26675o00o0o.f92058OooOoO;
        if (i2 == 0) {
            C32446OooOOOo.OooO0O0(objOooO0O0);
            c26675o00o0o.f92057OooOo0o = this;
            c26675o00o0o.f92058OooOoO = 1;
            C26676o00o0o00 c26676o00o0o00 = (C26676o00o0o00) this.f89720OooO00o;
            c26676o00o0o00.getClass();
            objOooO0O0 = c26676o00o0o00.OooO0O0(str2, new C26673o00o0OoO(str, rectF, null));
            if (objOooO0O0 == enumC32485OooO00o) {
                return enumC32485OooO00o;
            }
            c26264OooOOO0 = this;
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            c26264OooOOO0 = c26675o00o0o.f92057OooOo0o;
            C32446OooOOOo.OooO0O0(objOooO0O0);
        }
        Iterable iterable = (Iterable) objOooO0O0;
        ArrayList arrayList = new ArrayList(C34428OooOOo.OooOOoo(iterable, 10));
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            arrayList.add(((TextBoxMapper) c26264OooOOO0.f89721OooO0O0).toModel((TextBoxEntity) it.next()));
        }
        return arrayList;
    }

    public C26264OooOOO0(C26269OooOOoo c26269OooOOoo, C26266OooOOOo c26266OooOOOo) {
        this.f89720OooO00o = c26269OooOOoo;
        this.f89721OooO0O0 = c26266OooOOOo;
    }
}
