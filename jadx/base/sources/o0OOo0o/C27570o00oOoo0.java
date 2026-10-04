package o0OOo0o;

import com.orion.notein.domain.models.papertheme.MyTemplate;
import com.orion.notein.global.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;
import o0O0oooO.AbstractApplicationC26277OooOoOO;
import o0OOOO00.C27095OooOo0O;
import o0OOo0Oo.InterfaceC27304OooOo;
import o0OOoo0O.C27848OooOOo0;
import oO00ooO.C32446OooOOOo;
import oO00ooo.AbstractC32479OooO0OO;
import oO00ooo0.EnumC32485OooO00o;
import oO0o0OO.C33609OooO0oo;
import oO0o0OO.C33649OoooOOo;
import oO0o0o0o.C33874OooO0OO;
import oO0o0o0o.ExecutorC33873OooO0O0;
import oOo000Oo.C34428OooOOo;

/* JADX INFO: renamed from: o0OOo0o.o00oOoo0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C27570o00oOoo0 {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final AbstractApplicationC26277OooOoOO f96739OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final C27095OooOo0O f96740OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final o0OOo0Oo.Oooo000 f96741OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final C27499o00Ooo0 f96742OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final InterfaceC27304OooOo f96743OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final C27848OooOOo0 f96744OooO0o0;

    public C27570o00oOoo0(AbstractApplicationC26277OooOoOO abstractApplicationC26277OooOoOO, C27095OooOo0O c27095OooOo0O, o0OOo0Oo.Oooo000 ossRepo, C27499o00Ooo0 pdfFileUseCase, C27848OooOOo0 c27848OooOOo0, InterfaceC27304OooOo materialDownloadRepository) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(ossRepo, "ossRepo");
        kotlin.jvm.internal.OooOOO0.OooO0oO(pdfFileUseCase, "pdfFileUseCase");
        kotlin.jvm.internal.OooOOO0.OooO0oO(materialDownloadRepository, "materialDownloadRepository");
        this.f96739OooO00o = abstractApplicationC26277OooOoOO;
        this.f96740OooO0O0 = c27095OooOo0O;
        this.f96741OooO0OO = ossRepo;
        this.f96742OooO0Oo = pdfFileUseCase;
        this.f96744OooO0o0 = c27848OooOOo0;
        this.f96743OooO0o = materialDownloadRepository;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0016  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object OooO00o(C27570o00oOoo0 c27570o00oOoo0, AbstractC32479OooO0OO abstractC32479OooO0OO) {
        C27564o00oOo0o c27564o00oOo0o;
        c27570o00oOoo0.getClass();
        if (abstractC32479OooO0OO instanceof C27564o00oOo0o) {
            c27564o00oOo0o = (C27564o00oOo0o) abstractC32479OooO0OO;
            int i = c27564o00oOo0o.f96711OooOoO;
            if ((i & Integer.MIN_VALUE) != 0) {
                c27564o00oOo0o.f96711OooOoO = i - Integer.MIN_VALUE;
            } else {
                c27564o00oOo0o = new C27564o00oOo0o(c27570o00oOoo0, abstractC32479OooO0OO);
            }
        }
        Object objOooO0o0 = c27564o00oOo0o.f96709OooOo;
        Object obj = EnumC32485OooO00o.f116726OooOo0o;
        int i2 = c27564o00oOo0o.f96711OooOoO;
        if (i2 == 0) {
            C32446OooOOOo.OooO0O0(objOooO0o0);
            c27564o00oOo0o.f96710OooOo0o = c27570o00oOoo0;
            c27564o00oOo0o.f96711OooOoO = 1;
            objOooO0o0 = c27570o00oOoo0.f96740OooO0O0.OooO0o0(c27564o00oOo0o);
            if (objOooO0o0 == obj) {
                return obj;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            c27570o00oOoo0 = c27564o00oOo0o.f96710OooOo0o;
            C32446OooOOOo.OooO0O0(objOooO0o0);
        }
        Iterable iterable = (Iterable) objOooO0o0;
        ArrayList arrayList = new ArrayList(C34428OooOOo.OooOOoo(iterable, 10));
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            arrayList.add(((MyTemplate) it.next()).getTitle());
        }
        Set setO0OO00O = oOo000Oo.OooOo.o0OO00O(arrayList);
        String string = c27570o00oOoo0.f96739OooO00o.getString(R.string.custom);
        kotlin.jvm.internal.OooOOO0.OooO0o(string, "getString(...)");
        if (setO0OO00O.contains(string)) {
            for (int i3 = 1; i3 < 31; i3++) {
                String str = string + i3;
                if (!setO0OO00O.contains(str)) {
                    return str;
                }
            }
        }
        return string;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object OooO0O0(int i, AbstractC32479OooO0OO abstractC32479OooO0OO) throws Throwable {
        C27556o00oOOOO c27556o00oOOOO;
        if (abstractC32479OooO0OO instanceof C27556o00oOOOO) {
            c27556o00oOOOO = (C27556o00oOOOO) abstractC32479OooO0OO;
            int i2 = c27556o00oOOOO.f96673OooOoO;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                c27556o00oOOOO.f96673OooOoO = i2 - Integer.MIN_VALUE;
            } else {
                c27556o00oOOOO = new C27556o00oOOOO(this, abstractC32479OooO0OO);
            }
        }
        Object objOooO0o = c27556o00oOOOO.f96671OooOo;
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i3 = c27556o00oOOOO.f96673OooOoO;
        if (i3 == 0) {
            C32446OooOOOo.OooO0O0(objOooO0o);
            if (i == 0) {
                return Boolean.TRUE;
            }
            C33874OooO0OO c33874OooO0OO = C33649OoooOOo.f121328OooO00o;
            ExecutorC33873OooO0O0 executorC33873OooO0O0 = ExecutorC33873OooO0O0.f122045OooOoO0;
            C27557o00oOOOo c27557o00oOOOo = new C27557o00oOOOo(this, null);
            c27556o00oOOOO.f96672OooOo0o = i;
            c27556o00oOOOO.f96673OooOoO = 1;
            objOooO0o = C33609OooO0oo.OooO0o(executorC33873OooO0O0, c27557o00oOOOo, c27556o00oOOOO);
            if (objOooO0o == enumC32485OooO00o) {
                return enumC32485OooO00o;
            }
        } else {
            if (i3 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            i = c27556o00oOOOO.f96672OooOo0o;
            C32446OooOOOo.OooO0O0(objOooO0o);
        }
        return Boolean.valueOf(((Number) objOooO0o).intValue() + i <= 30);
    }
}
