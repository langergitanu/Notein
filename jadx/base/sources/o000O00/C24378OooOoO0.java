package o000O00;

import com.orion.notein.data.p602db.entity.QuoteEntity;
import com.orion.notein.data.p602db.entity.QuoteTextAnnoEntity;
import com.orion.notein.domain.mapper.QuoteMapper;
import com.orion.notein.domain.models.page.Quote;
import com.orion.notein.domain.models.page.QuoteTextAnno;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;
import o0OO00o0.C26622o00Oo0O0;
import o0OO00o0.C26624o00Oo0o;
import o0OO00o0.C26625o00Oo0o0;
import o0OO00o0.C26626o00Oo0oO;
import o0OO00o0.C26627o00Oo0oo;
import o0OO00o0.C26629o00OoO0;
import o0OO00o0.C26630o00OoO00;
import o0OO00o0.C26631o00OoO0o;
import o0OO00o0.C26632o00OoOO;
import o0OO00o0.C26633o00OoOO0;
import o0OO00o0.C26634o00OoOOO;
import o0OO00o0.C26637o00OoOo0;
import o0OO00o0.o0oOO;
import oO00ooO.C32446OooOOOo;
import oO00ooO.C32460OooOooO;
import oO00ooo.AbstractC32479OooO0OO;
import oO00ooo0.EnumC32485OooO00o;
import oOo000Oo.C34428OooOOo;

/* JADX INFO: renamed from: o000O00.OooOoO0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C24378OooOoO0 {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final Object f82246OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final Object f82247OooO0O0;

    public C24378OooOoO0(C26629o00OoO0 localDataSource, QuoteMapper mapper) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(localDataSource, "localDataSource");
        kotlin.jvm.internal.OooOOO0.OooO0oO(mapper, "mapper");
        this.f82246OooO00o = localDataSource;
        this.f82247OooO0O0 = mapper;
    }

    public Object OooO00o(String str, ArrayList arrayList, AbstractC32479OooO0OO abstractC32479OooO0OO) {
        ArrayList arrayList2 = new ArrayList(C34428OooOOo.OooOOoo(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(((QuoteMapper) this.f82247OooO0O0).toEntity((Quote) it.next()));
        }
        C26629o00OoO0 c26629o00OoO0 = (C26629o00OoO0) this.f82246OooO00o;
        c26629o00OoO0.getClass();
        Object objOooO00o = c26629o00OoO0.OooO00o(str, new C26622o00Oo0O0(arrayList2, null));
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        if (objOooO00o != enumC32485OooO00o) {
            objOooO00o = C32460OooOooO.f116667OooO00o;
        }
        return objOooO00o == enumC32485OooO00o ? objOooO00o : C32460OooOooO.f116667OooO00o;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object OooO0O0(String str, String str2, AbstractC32479OooO0OO abstractC32479OooO0OO) {
        C26631o00OoO0o c26631o00OoO0o;
        C24378OooOoO0 c24378OooOoO0;
        if (abstractC32479OooO0OO instanceof C26631o00OoO0o) {
            c26631o00OoO0o = (C26631o00OoO0o) abstractC32479OooO0OO;
            int i = c26631o00OoO0o.f91915OooOoO;
            if ((i & Integer.MIN_VALUE) != 0) {
                c26631o00OoO0o.f91915OooOoO = i - Integer.MIN_VALUE;
            } else {
                c26631o00OoO0o = new C26631o00OoO0o(this, abstractC32479OooO0OO);
            }
        }
        Object objOooO00o = c26631o00OoO0o.f91913OooOo;
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i2 = c26631o00OoO0o.f91915OooOoO;
        if (i2 == 0) {
            C32446OooOOOo.OooO0O0(objOooO00o);
            c26631o00OoO0o.f91914OooOo0o = this;
            c26631o00OoO0o.f91915OooOoO = 1;
            C26629o00OoO0 c26629o00OoO0 = (C26629o00OoO0) this.f82246OooO00o;
            c26629o00OoO0.getClass();
            objOooO00o = c26629o00OoO0.OooO00o(str2, new C26625o00Oo0o0(str, null));
            if (objOooO00o == enumC32485OooO00o) {
                return enumC32485OooO00o;
            }
            c24378OooOoO0 = this;
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            c24378OooOoO0 = c26631o00OoO0o.f91914OooOo0o;
            C32446OooOOOo.OooO0O0(objOooO00o);
        }
        QuoteEntity quoteEntity = (QuoteEntity) objOooO00o;
        if (quoteEntity != null) {
            return ((QuoteMapper) c24378OooOoO0.f82247OooO0O0).toQuote(quoteEntity);
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Serializable OooO0OO(String str, ArrayList arrayList, AbstractC32479OooO0OO abstractC32479OooO0OO) {
        C26633o00OoOO0 c26633o00OoOO0;
        C24378OooOoO0 c24378OooOoO0;
        if (abstractC32479OooO0OO instanceof C26633o00OoOO0) {
            c26633o00OoOO0 = (C26633o00OoOO0) abstractC32479OooO0OO;
            int i = c26633o00OoOO0.f91923OooOoO;
            if ((i & Integer.MIN_VALUE) != 0) {
                c26633o00OoOO0.f91923OooOoO = i - Integer.MIN_VALUE;
            } else {
                c26633o00OoOO0 = new C26633o00OoOO0(this, abstractC32479OooO0OO);
            }
        }
        Object objOooO00o = c26633o00OoOO0.f91921OooOo;
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i2 = c26633o00OoOO0.f91923OooOoO;
        if (i2 == 0) {
            C32446OooOOOo.OooO0O0(objOooO00o);
            c26633o00OoOO0.f91922OooOo0o = this;
            c26633o00OoOO0.f91923OooOoO = 1;
            C26629o00OoO0 c26629o00OoO0 = (C26629o00OoO0) this.f82246OooO00o;
            c26629o00OoO0.getClass();
            objOooO00o = c26629o00OoO0.OooO00o(str, new C26624o00Oo0o(arrayList, null));
            if (objOooO00o == enumC32485OooO00o) {
                return enumC32485OooO00o;
            }
            c24378OooOoO0 = this;
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            c24378OooOoO0 = c26633o00OoOO0.f91922OooOo0o;
            C32446OooOOOo.OooO0O0(objOooO00o);
        }
        Iterable iterable = (Iterable) objOooO00o;
        ArrayList arrayList2 = new ArrayList(C34428OooOOo.OooOOoo(iterable, 10));
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            arrayList2.add(((QuoteMapper) c24378OooOoO0.f82247OooO0O0).toQuote((QuoteEntity) it.next()));
        }
        return arrayList2;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Serializable OooO0Oo(String str, String str2, AbstractC32479OooO0OO abstractC32479OooO0OO) {
        C26632o00OoOO c26632o00OoOO;
        C24378OooOoO0 c24378OooOoO0;
        if (abstractC32479OooO0OO instanceof C26632o00OoOO) {
            c26632o00OoOO = (C26632o00OoOO) abstractC32479OooO0OO;
            int i = c26632o00OoOO.f91919OooOoO;
            if ((i & Integer.MIN_VALUE) != 0) {
                c26632o00OoOO.f91919OooOoO = i - Integer.MIN_VALUE;
            } else {
                c26632o00OoOO = new C26632o00OoOO(this, abstractC32479OooO0OO);
            }
        }
        Object objOooO00o = c26632o00OoOO.f91917OooOo;
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i2 = c26632o00OoOO.f91919OooOoO;
        if (i2 == 0) {
            C32446OooOOOo.OooO0O0(objOooO00o);
            c26632o00OoOO.f91918OooOo0o = this;
            c26632o00OoOO.f91919OooOoO = 1;
            C26629o00OoO0 c26629o00OoO0 = (C26629o00OoO0) this.f82246OooO00o;
            c26629o00OoO0.getClass();
            objOooO00o = c26629o00OoO0.OooO00o(str2, new C26626o00Oo0oO(str, null));
            if (objOooO00o == enumC32485OooO00o) {
                return enumC32485OooO00o;
            }
            c24378OooOoO0 = this;
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            c24378OooOoO0 = c26632o00OoOO.f91918OooOo0o;
            C32446OooOOOo.OooO0O0(objOooO00o);
        }
        Iterable iterable = (Iterable) objOooO00o;
        ArrayList arrayList = new ArrayList(C34428OooOOo.OooOOoo(iterable, 10));
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            arrayList.add(((QuoteMapper) c24378OooOoO0.f82247OooO0O0).toQuote((QuoteEntity) it.next()));
        }
        return arrayList;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Serializable OooO0o(String str, List list, AbstractC32479OooO0OO abstractC32479OooO0OO) {
        C26637o00OoOo0 c26637o00OoOo0;
        C24378OooOoO0 c24378OooOoO0;
        if (abstractC32479OooO0OO instanceof C26637o00OoOo0) {
            c26637o00OoOo0 = (C26637o00OoOo0) abstractC32479OooO0OO;
            int i = c26637o00OoOo0.f91939OooOoO;
            if ((i & Integer.MIN_VALUE) != 0) {
                c26637o00OoOo0.f91939OooOoO = i - Integer.MIN_VALUE;
            } else {
                c26637o00OoOo0 = new C26637o00OoOo0(this, abstractC32479OooO0OO);
            }
        }
        Object objOooO00o = c26637o00OoOo0.f91937OooOo;
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i2 = c26637o00OoOo0.f91939OooOoO;
        if (i2 == 0) {
            C32446OooOOOo.OooO0O0(objOooO00o);
            c26637o00OoOo0.f91938OooOo0o = this;
            c26637o00OoOo0.f91939OooOoO = 1;
            C26629o00OoO0 c26629o00OoO0 = (C26629o00OoO0) this.f82246OooO00o;
            c26629o00OoO0.getClass();
            objOooO00o = c26629o00OoO0.OooO00o(str, new o0oOO(list, null));
            if (objOooO00o == enumC32485OooO00o) {
                return enumC32485OooO00o;
            }
            c24378OooOoO0 = this;
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            c24378OooOoO0 = c26637o00OoOo0.f91938OooOo0o;
            C32446OooOOOo.OooO0O0(objOooO00o);
        }
        Iterable iterable = (Iterable) objOooO00o;
        ArrayList arrayList = new ArrayList(C34428OooOOo.OooOOoo(iterable, 10));
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            arrayList.add(((QuoteMapper) c24378OooOoO0.f82247OooO0O0).toQuoteTextAnno((QuoteTextAnnoEntity) it.next()));
        }
        return arrayList;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object OooO0o0(String str, String str2, AbstractC32479OooO0OO abstractC32479OooO0OO) {
        C26634o00OoOOO c26634o00OoOOO;
        C24378OooOoO0 c24378OooOoO0;
        if (abstractC32479OooO0OO instanceof C26634o00OoOOO) {
            c26634o00OoOOO = (C26634o00OoOOO) abstractC32479OooO0OO;
            int i = c26634o00OoOOO.f91927OooOoO;
            if ((i & Integer.MIN_VALUE) != 0) {
                c26634o00OoOOO.f91927OooOoO = i - Integer.MIN_VALUE;
            } else {
                c26634o00OoOOO = new C26634o00OoOOO(this, abstractC32479OooO0OO);
            }
        }
        Object objOooO00o = c26634o00OoOOO.f91925OooOo;
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i2 = c26634o00OoOOO.f91927OooOoO;
        if (i2 == 0) {
            C32446OooOOOo.OooO0O0(objOooO00o);
            c26634o00OoOOO.f91926OooOo0o = this;
            c26634o00OoOOO.f91927OooOoO = 1;
            C26629o00OoO0 c26629o00OoO0 = (C26629o00OoO0) this.f82246OooO00o;
            c26629o00OoO0.getClass();
            objOooO00o = c26629o00OoO0.OooO00o(str2, new C26627o00Oo0oo(str, null));
            if (objOooO00o == enumC32485OooO00o) {
                return enumC32485OooO00o;
            }
            c24378OooOoO0 = this;
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            c24378OooOoO0 = c26634o00OoOOO.f91926OooOo0o;
            C32446OooOOOo.OooO0O0(objOooO00o);
        }
        QuoteTextAnnoEntity quoteTextAnnoEntity = (QuoteTextAnnoEntity) objOooO00o;
        if (quoteTextAnnoEntity != null) {
            return ((QuoteMapper) c24378OooOoO0.f82247OooO0O0).toQuoteTextAnno(quoteTextAnnoEntity);
        }
        return null;
    }

    public Object OooO0oO(String str, List list, AbstractC32479OooO0OO abstractC32479OooO0OO) {
        List list2 = list;
        ArrayList arrayList = new ArrayList(C34428OooOOo.OooOOoo(list2, 10));
        Iterator it = list2.iterator();
        while (it.hasNext()) {
            arrayList.add(((QuoteMapper) this.f82247OooO0O0).toQuoteTextAnnoEntity((QuoteTextAnno) it.next()));
        }
        C26629o00OoO0 c26629o00OoO0 = (C26629o00OoO0) this.f82246OooO00o;
        c26629o00OoO0.getClass();
        Object objOooO00o = c26629o00OoO0.OooO00o(str, new C26630o00OoO00(arrayList, null));
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        if (objOooO00o != enumC32485OooO00o) {
            objOooO00o = C32460OooOooO.f116667OooO00o;
        }
        return objOooO00o == enumC32485OooO00o ? objOooO00o : C32460OooOooO.f116667OooO00o;
    }

    public C24378OooOoO0(androidx.hardware.OooO00o oooO00o) {
        this.f82246OooO00o = oooO00o;
        this.f82247OooO0O0 = new AtomicInteger(0);
    }
}
