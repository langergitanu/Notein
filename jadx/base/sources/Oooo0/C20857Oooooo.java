package Oooo0;

import OooooO0.C21284OooO;
import OooooO0.C21285OooO00o;
import android.content.Context;
import android.util.TypedValue;
import java.util.Collection;
import java.util.Iterator;
import o0000oO0.C24324OooO00o;
import o0000oO0.C24326OooO0OO;
import oO00ooO.C32446OooOOOo;
import oO00ooO.C32460OooOooO;
import oO00ooo.AbstractC32476OooO;
import oO00ooo.AbstractC32479OooO0OO;
import oO00ooo0.EnumC32485OooO00o;
import oO0O000o.InterfaceC32507OooOO0o;
import oO0o0OO.C33604OooO0OO;
import oO0o0OO.C33605OooO0Oo;
import oO0o0OO.C33607OooO0o0;
import oO0o0OO.C33633Oooo0;
import oO0o0OO.C33649OoooOOo;
import oO0o0OO.C33664o00000Oo;
import oO0o0OO.InterfaceC33642Oooo0oo;
import oO0o0OO.InterfaceC33672o00ooo;
import oO0o0Ooo.C33822OooO0OO;
import oO0o0o0o.C33874OooO0OO;
import oO0o0o0o.ExecutorC33873OooO0O0;
import oOo0000O.InterfaceC34415OooO0oo;
import oOo000Oo.C34434OooOoO;

/* JADX INFO: renamed from: Oooo0.Oooooo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C20857Oooooo {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public static final /* synthetic */ int f59967OooO00o = 0;

    public static final Object OooO00o(Collection collection, AbstractC32476OooO abstractC32476OooO) {
        return collection.isEmpty() ? C34434OooOoO.f123453OooOo0o : new C33604OooO0OO((InterfaceC33642Oooo0oo[]) collection.toArray(new InterfaceC33642Oooo0oo[0])).OooO00o(abstractC32476OooO);
    }

    public static int OooO0O0(Context context, int i) {
        return (int) TypedValue.applyDimension(1, i, context.getResources().getDisplayMetrics());
    }

    public static final boolean OooO0OO(C21284OooO c21284OooO) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(c21284OooO, "<this>");
        long j = c21284OooO.f61707OooO0o0;
        if (C21285OooO00o.OooO0O0(j) != C21285OooO00o.OooO0OO(j)) {
            return false;
        }
        float fOooO0O0 = C21285OooO00o.OooO0O0(j);
        long j2 = c21284OooO.f61706OooO0o;
        if (fOooO0O0 != C21285OooO00o.OooO0O0(j2) || C21285OooO00o.OooO0O0(j) != C21285OooO00o.OooO0OO(j2)) {
            return false;
        }
        float fOooO0O02 = C21285OooO00o.OooO0O0(j);
        long j3 = c21284OooO.f61708OooO0oO;
        if (fOooO0O02 != C21285OooO00o.OooO0O0(j3) || C21285OooO00o.OooO0O0(j) != C21285OooO00o.OooO0OO(j3)) {
            return false;
        }
        float fOooO0O03 = C21285OooO00o.OooO0O0(j);
        long j4 = c21284OooO.f61709OooO0oo;
        return fOooO0O03 == C21285OooO00o.OooO0O0(j4) && C21285OooO00o.OooO0O0(j) == C21285OooO00o.OooO0OO(j4);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object OooO0Oo(Collection collection, AbstractC32479OooO0OO abstractC32479OooO0OO) {
        C33607OooO0o0 c33607OooO0o0;
        Iterator it;
        if (abstractC32479OooO0OO instanceof C33607OooO0o0) {
            c33607OooO0o0 = (C33607OooO0o0) abstractC32479OooO0OO;
            int i = c33607OooO0o0.f121290OooOoO0;
            if ((i & Integer.MIN_VALUE) != 0) {
                c33607OooO0o0.f121290OooOoO0 = i - Integer.MIN_VALUE;
            } else {
                c33607OooO0o0 = new C33607OooO0o0(abstractC32479OooO0OO);
            }
        }
        Object obj = c33607OooO0o0.f121288OooOo;
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i2 = c33607OooO0o0.f121290OooOoO0;
        if (i2 == 0) {
            C32446OooOOOo.OooO0O0(obj);
            it = collection.iterator();
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            it = c33607OooO0o0.f121289OooOo0o;
            C32446OooOOOo.OooO0O0(obj);
        }
        while (it.hasNext()) {
            InterfaceC33672o00ooo interfaceC33672o00ooo = (InterfaceC33672o00ooo) it.next();
            c33607OooO0o0.f121289OooOo0o = it;
            c33607OooO0o0.f121290OooOoO0 = 1;
            if (interfaceC33672o00ooo.join(c33607OooO0o0) == enumC32485OooO00o) {
                return enumC32485OooO00o;
            }
        }
        return C32460OooOooO.f116667OooO00o;
    }

    public static C24326OooO0OO OooO0o(String str, com.google.firebase.datastorage.OooO00o oooO00o, int i) {
        InterfaceC32507OooOO0o produceMigrations = oooO00o;
        if ((i & 4) != 0) {
            produceMigrations = C24324OooO00o.f81888OooOo0o;
        }
        C33874OooO0OO c33874OooO0OO = C33649OoooOOo.f121328OooO00o;
        ExecutorC33873OooO0O0 executorC33873OooO0O0 = ExecutorC33873OooO0O0.f122045OooOoO0;
        C33664o00000Oo c33664o00000OoOooO00o = o00000.OooOO0.OooO00o();
        executorC33873OooO0O0.getClass();
        C33822OooO0OO c33822OooO0OOOooO00o = C33633Oooo0.OooO00o(InterfaceC34415OooO0oo.OooO00o.OooO00o(executorC33873OooO0O0, c33664o00000OoOooO00o));
        kotlin.jvm.internal.OooOOO0.OooO0oO(produceMigrations, "produceMigrations");
        return new C24326OooO0OO(str, produceMigrations, c33822OooO0OOOooO00o);
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0042  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:17:0x0050 -> B:19:0x0053). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object OooO0o0(InterfaceC33672o00ooo[] interfaceC33672o00oooArr, AbstractC32479OooO0OO abstractC32479OooO0OO) {
        C33605OooO0Oo c33605OooO0Oo;
        int i;
        InterfaceC33672o00ooo[] interfaceC33672o00oooArr2;
        int length;
        if (abstractC32479OooO0OO instanceof C33605OooO0Oo) {
            c33605OooO0Oo = (C33605OooO0Oo) abstractC32479OooO0OO;
            int i2 = c33605OooO0Oo.f121285OooOoOO;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                c33605OooO0Oo.f121285OooOoOO = i2 - Integer.MIN_VALUE;
            } else {
                c33605OooO0Oo = new C33605OooO0Oo(abstractC32479OooO0OO);
            }
        }
        Object obj = c33605OooO0Oo.f121283OooOoO;
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i3 = c33605OooO0Oo.f121285OooOoOO;
        if (i3 == 0) {
            C32446OooOOOo.OooO0O0(obj);
            i = 0;
            interfaceC33672o00oooArr2 = interfaceC33672o00oooArr;
            length = interfaceC33672o00oooArr.length;
            if (i < length) {
            }
        } else {
            if (i3 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            length = c33605OooO0Oo.f121284OooOoO0;
            i = c33605OooO0Oo.f121281OooOo;
            InterfaceC33672o00ooo[] interfaceC33672o00oooArr3 = (InterfaceC33672o00ooo[]) c33605OooO0Oo.f121282OooOo0o;
            C32446OooOOOo.OooO0O0(obj);
            interfaceC33672o00oooArr2 = interfaceC33672o00oooArr3;
            i++;
            if (i < length) {
                InterfaceC33672o00ooo interfaceC33672o00ooo = interfaceC33672o00oooArr2[i];
                c33605OooO0Oo.f121282OooOo0o = interfaceC33672o00oooArr2;
                c33605OooO0Oo.f121281OooOo = i;
                c33605OooO0Oo.f121284OooOoO0 = length;
                c33605OooO0Oo.f121285OooOoOO = 1;
                if (interfaceC33672o00ooo.join(c33605OooO0Oo) == enumC32485OooO00o) {
                    return enumC32485OooO00o;
                }
                i++;
                if (i < length) {
                    return C32460OooOooO.f116667OooO00o;
                }
            }
        }
    }

    public static final void OooO0oO(int i, int i2) {
        if (i <= 0 || i2 <= 0) {
            throw new IllegalArgumentException(C20856OooooOo.OooO0O0("both minLines ", i, " and maxLines ", " must be greater than zero", i2).toString());
        }
        if (i > i2) {
            throw new IllegalArgumentException(C20855OooooOO.OooO0OO(i, i2, "minLines ", " must be less than or equal to maxLines ").toString());
        }
    }
}
