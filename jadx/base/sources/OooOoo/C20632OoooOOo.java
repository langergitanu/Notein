package OooOoo;

import OooOoOO.C20555OoooO0;
import OooOoo0.o00000O;
import java.util.Collections;
import java.util.Iterator;
import java.util.Set;
import kotlin.jvm.internal.C24032OooOooO;
import oO00ooO.C32446OooOOOo;
import oO00ooo.AbstractC32479OooO0OO;
import oO00ooo0.EnumC32485OooO00o;
import oO0O000o.InterfaceC32508OooOOOo;

/* JADX INFO: renamed from: OooOoo.OoooOOo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C20632OoooOOo {
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object OooO00o(InterfaceC20643OoooooO interfaceC20643OoooooO, float f, C20555OoooO0 c20555OoooO0, AbstractC32479OooO0OO abstractC32479OooO0OO) {
        o000oOoO o000oooo2;
        C24032OooOooO c24032OooOooO;
        if (abstractC32479OooO0OO instanceof o000oOoO) {
            o000oooo2 = (o000oOoO) abstractC32479OooO0OO;
            int i = o000oooo2.f59136OooOoO0;
            if ((i & Integer.MIN_VALUE) != 0) {
                o000oooo2.f59136OooOoO0 = i - Integer.MIN_VALUE;
            } else {
                o000oooo2 = new o000oOoO(abstractC32479OooO0OO);
            }
        }
        Object obj = o000oooo2.f59134OooOo;
        Object obj2 = EnumC32485OooO00o.f116726OooOo0o;
        int i2 = o000oooo2.f59136OooOoO0;
        if (i2 == 0) {
            C32446OooOOOo.OooO0O0(obj);
            C24032OooOooO c24032OooOooO2 = new C24032OooOooO();
            InterfaceC32508OooOOOo c20631OoooOOO = new C20631OoooOOO(f, c20555OoooO0, c24032OooOooO2, null);
            o000oooo2.f59135OooOo0o = c24032OooOooO2;
            o000oooo2.f59136OooOoO0 = 1;
            if (interfaceC20643OoooooO.OooO00o(o00000O.f59433OooOo0o, c20631OoooOOO, o000oooo2) == obj2) {
                return obj2;
            }
            c24032OooOooO = c24032OooOooO2;
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            c24032OooOooO = o000oooo2.f59135OooOo0o;
            C32446OooOOOo.OooO0O0(obj);
        }
        return new Float(c24032OooOooO.f80939OooOo0o);
    }

    public static Set OooO0O0() {
        try {
            Object objInvoke = Class.forName("android.text.EmojiConsistency").getMethod("getEmojiConsistencySet", new Class[0]).invoke(null, new Object[0]);
            if (objInvoke == null) {
                return Collections.EMPTY_SET;
            }
            Set set = (Set) objInvoke;
            Iterator it = set.iterator();
            while (it.hasNext()) {
                if (!(it.next() instanceof int[])) {
                    return Collections.EMPTY_SET;
                }
            }
            return set;
        } catch (Throwable unused) {
            return Collections.EMPTY_SET;
        }
    }
}
