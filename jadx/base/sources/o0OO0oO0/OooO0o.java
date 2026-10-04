package o0OO0oO0;

import OooOoOO.C20519OooO0Oo;
import android.content.Context;
import kotlin.jvm.internal.OooOOO0;
import oO00ooO.C32446OooOOOo;
import oO00ooO.C32447OooOOo;
import oO00ooo.AbstractC32479OooO0OO;
import oO00ooo0.EnumC32485OooO00o;
import oO0o0OO.C33609OooO0oo;
import oO0o0OO.C33649OoooOOo;
import oO0o0o0o.C33874OooO0OO;
import oO0o0o0o.ExecutorC33873OooO0O0;

/* JADX INFO: loaded from: classes9.dex */
public final class OooO0o {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public static final OooO0o f93585OooO00o = new OooO0o();

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public static final C32447OooOOo f93586OooO0O0 = C20519OooO0Oo.OooO0OO(new OooO0O0());

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object OooO00o(Context context, AbstractC32479OooO0OO abstractC32479OooO0OO) throws Throwable {
        OooO0OO oooO0OO;
        if (abstractC32479OooO0OO instanceof OooO0OO) {
            oooO0OO = (OooO0OO) abstractC32479OooO0OO;
            int i = oooO0OO.f93576OooOoO0;
            if ((i & Integer.MIN_VALUE) != 0) {
                oooO0OO.f93576OooOoO0 = i - Integer.MIN_VALUE;
            } else {
                oooO0OO = new OooO0OO(this, abstractC32479OooO0OO);
            }
        }
        Object objOooO0o = oooO0OO.f93575OooOo0o;
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i2 = oooO0OO.f93576OooOoO0;
        if (i2 == 0) {
            C32446OooOOOo.OooO0O0(objOooO0o);
            C33874OooO0OO c33874OooO0OO = C33649OoooOOo.f121328OooO00o;
            ExecutorC33873OooO0O0 executorC33873OooO0O0 = ExecutorC33873OooO0O0.f122045OooOoO0;
            C26939OooO0Oo c26939OooO0Oo = new C26939OooO0Oo(context, null);
            oooO0OO.f93576OooOoO0 = 1;
            objOooO0o = C33609OooO0oo.OooO0o(executorC33873OooO0O0, c26939OooO0Oo, oooO0OO);
            if (objOooO0o == enumC32485OooO00o) {
                return enumC32485OooO00o;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C32446OooOOOo.OooO0O0(objOooO0o);
        }
        OooOOO0.OooO0o(objOooO0o, "withContext(...)");
        return objOooO0o;
    }
}
