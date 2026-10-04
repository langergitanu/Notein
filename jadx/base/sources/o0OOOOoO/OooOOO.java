package o0OOOOoO;

import android.util.DisplayMetrics;
import java.util.Map;
import o0000oOO.AbstractC24338OooO0o0;
import o0000oOO.C24340OooO0oo;
import o00o00O0.C25252OooO0Oo;
import o0O0oooO.AbstractApplicationC26277OooOoOO;
import oO00ooO.C32446OooOOOo;
import oO00ooO.C32460OooOooO;
import oO00ooo.AbstractC32479OooO0OO;
import oO00ooo0.EnumC32485OooO00o;

/* JADX INFO: loaded from: classes9.dex */
public final class OooOOO {

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public static final AbstractC24338OooO0o0.OooO00o<Integer> f94837OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public static final AbstractC24338OooO0o0.OooO00o<Float> f94838OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public static final AbstractC24338OooO0o0.OooO00o<String> f94839OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public static final AbstractC24338OooO0o0.OooO00o<String> f94840OooO0o0;

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final o0000o0O.OooOO0<AbstractC24338OooO0o0> f94841OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final AbstractApplicationC26277OooOoOO f94842OooO0O0;

    static {
        C24340OooO0oo.OooO0o0("key_text_box_color_list");
        f94837OooO0OO = C24340OooO0oo.OooO0OO("key_text_box_color");
        f94838OooO0Oo = C24340OooO0oo.OooO0O0("key_text_box_line_height");
        f94840OooO0o0 = C24340OooO0oo.OooO0o0("key_text_box_style");
        f94839OooO0o = C24340OooO0oo.OooO0o0("text_color_list");
    }

    public OooOOO(o0000o0O.OooOO0 dataStore, AbstractApplicationC26277OooOoOO abstractApplicationC26277OooOoOO) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(dataStore, "dataStore");
        this.f94841OooO00o = dataStore;
        this.f94842OooO0O0 = abstractApplicationC26277OooOoOO;
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x0076, code lost:
    
        if (o0000oOO.C24332OooO.OooO00o(r2, r4, r0) == r1) goto L22;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object OooO00o(AbstractC32479OooO0OO abstractC32479OooO0OO) {
        C27161OooO00o c27161OooO00o;
        OooOOO oooOOO;
        if (abstractC32479OooO0OO instanceof C27161OooO00o) {
            c27161OooO00o = (C27161OooO00o) abstractC32479OooO0OO;
            int i = c27161OooO00o.f94805OooOoO;
            if ((i & Integer.MIN_VALUE) != 0) {
                c27161OooO00o.f94805OooOoO = i - Integer.MIN_VALUE;
            } else {
                c27161OooO00o = new C27161OooO00o(this, abstractC32479OooO0OO);
            }
        }
        Object objOooOOo = c27161OooO00o.f94803OooOo;
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i2 = c27161OooO00o.f94805OooOoO;
        if (i2 == 0) {
            C32446OooOOOo.OooO0O0(objOooOOo);
            DisplayMetrics displayMetrics = new DisplayMetrics();
            displayMetrics.setTo(this.f94842OooO0O0.getResources().getDisplayMetrics());
            C27165OooO0oO c27165OooO0oO = new C27165OooO0oO(this.f94841OooO00o.getData(), displayMetrics);
            c27161OooO00o.f94804OooOo0o = this;
            c27161OooO00o.f94805OooOoO = 1;
            objOooOOo = C25252OooO0Oo.OooOOo(c27165OooO0oO, c27161OooO00o);
            if (objOooOOo != enumC32485OooO00o) {
                oooOOO = this;
            }
            return enumC32485OooO00o;
        }
        if (i2 != 1) {
            if (i2 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C32446OooOOOo.OooO0O0(objOooOOo);
            return C32460OooOooO.f116667OooO00o;
        }
        oooOOO = c27161OooO00o.f94804OooOo0o;
        C32446OooOOOo.OooO0O0(objOooOOo);
        o0000o0O.OooOO0<AbstractC24338OooO0o0> oooOO02 = oooOOO.f94841OooO00o;
        C27162OooO0O0 c27162OooO0O0 = new C27162OooO0O0((Map) objOooOOo, null);
        c27161OooO00o.f94804OooOo0o = null;
        c27161OooO00o.f94805OooOoO = 2;
    }
}
