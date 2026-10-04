package o0OO00o0;

import android.graphics.Bitmap;
import java.io.File;
import o0O0oooO.AbstractApplicationC26277OooOoOO;
import o0oo000O.C31190OooO0oo;
import oO00ooO.C32446OooOOOo;
import oO00ooo.AbstractC32479OooO0OO;
import oO00ooo0.EnumC32485OooO00o;
import oO0o0OO.C33609OooO0oo;
import oO0o0OO.C33649OoooOOo;
import oO0o0o0o.C33874OooO0OO;
import oO0o0o0o.ExecutorC33873OooO0O0;
import oOO00oo.C34406OooO00o;

/* JADX INFO: renamed from: o0OO00o0.o00o0oOO, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C26681o00o0oOO {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final AbstractApplicationC26277OooOoOO f92075OooO00o;

    public C26681o00o0oOO(AbstractApplicationC26277OooOoOO abstractApplicationC26277OooOoOO) {
        this.f92075OooO00o = abstractApplicationC26277OooOoOO;
    }

    public final String OooO00o(String str, String str2) {
        AbstractApplicationC26277OooOoOO abstractApplicationC26277OooOoOO = this.f92075OooO00o;
        File file = new File(abstractApplicationC26277OooOoOO.getExternalFilesDir(null), str);
        File file2 = new File(abstractApplicationC26277OooOoOO.getExternalFilesDir(null), str2);
        C34406OooO00o.f123390OooO00o.OooO00o(com.aspose.slides.internal.p332p7.OooO0O0.OooO0O0("copyTn is successful: ", C31190OooO0oo.OooO00o(file, file2)), new Object[0]);
        String absolutePath = file2.getAbsolutePath();
        kotlin.jvm.internal.OooOOO0.OooO0o(absolutePath, "getAbsolutePath(...)");
        return absolutePath;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object OooO0O0(Bitmap bitmap, String str, AbstractC32479OooO0OO abstractC32479OooO0OO) throws Throwable {
        C26680o00o0oO0 c26680o00o0oO0;
        if (abstractC32479OooO0OO instanceof C26680o00o0oO0) {
            c26680o00o0oO0 = (C26680o00o0oO0) abstractC32479OooO0OO;
            int i = c26680o00o0oO0.f92074OooOoO0;
            if ((i & Integer.MIN_VALUE) != 0) {
                c26680o00o0oO0.f92074OooOoO0 = i - Integer.MIN_VALUE;
            } else {
                c26680o00o0oO0 = new C26680o00o0oO0(this, abstractC32479OooO0OO);
            }
        }
        Object objOooO0o = c26680o00o0oO0.f92073OooOo0o;
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i2 = c26680o00o0oO0.f92074OooOoO0;
        if (i2 == 0) {
            C32446OooOOOo.OooO0O0(objOooO0o);
            C33874OooO0OO c33874OooO0OO = C33649OoooOOo.f121328OooO00o;
            ExecutorC33873OooO0O0 executorC33873OooO0O0 = ExecutorC33873OooO0O0.f122045OooOoO0;
            C26679o00o0oO c26679o00o0oO = new C26679o00o0oO(this, str, bitmap, null);
            c26680o00o0oO0.f92074OooOoO0 = 1;
            objOooO0o = C33609OooO0oo.OooO0o(executorC33873OooO0O0, c26679o00o0oO, c26680o00o0oO0);
            if (objOooO0o == enumC32485OooO00o) {
                return enumC32485OooO00o;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C32446OooOOOo.OooO0O0(objOooO0o);
        }
        kotlin.jvm.internal.OooOOO0.OooO0o(objOooO0o, "withContext(...)");
        return objOooO0o;
    }
}
