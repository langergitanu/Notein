package androidx.fragment.app;

import android.view.inputmethod.InputMethodManager;
import kotlin.jvm.internal.C24034Oooo00O;
import o00000.C24053OooOOoo;
import o00000.C24069Oooo0o;

/* JADX INFO: renamed from: androidx.fragment.app.OooO0o0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class RunnableC21889OooO0o0 implements Runnable {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final /* synthetic */ Object f64959OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final /* synthetic */ int f64960OooOo0o;

    public /* synthetic */ RunnableC21889OooO0o0(Object obj, int i) {
        this.f64960OooOo0o = i;
        this.f64959OooOo = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v9, types: [java.lang.Object, oO00ooO.OooOO0] */
    /* JADX WARN: Type inference failed for: r2v10, types: [java.lang.Object, oO00ooO.OooOO0] */
    /* JADX WARN: Type inference failed for: r2v13, types: [java.lang.Object, oO00ooO.OooOO0] */
    /* JADX WARN: Type inference failed for: r2v7, types: [java.lang.Object, oO00ooO.OooOO0] */
    /* JADX WARN: Type inference failed for: r7v2, types: [T, java.lang.Boolean] */
    /* JADX WARN: Type inference failed for: r7v3, types: [T, java.lang.Boolean] */
    /* JADX WARN: Type inference failed for: r7v4, types: [T, java.lang.Boolean] */
    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f64960OooOo0o) {
            case 0:
                C24034Oooo00O seekCancelLambda = (C24034Oooo00O) this.f64959OooOo;
                kotlin.jvm.internal.OooOOO0.OooO0oO(seekCancelLambda, "$seekCancelLambda");
                oO0O000o.OooO00o oooO00o = (oO0O000o.OooO00o) seekCancelLambda.f80942OooOo0o;
                if (oooO00o != null) {
                    oooO00o.invoke();
                }
                break;
            default:
                C24069Oooo0o this$0 = (C24069Oooo0o) this.f64959OooOo;
                kotlin.jvm.internal.OooOOO0.OooO0oO(this$0, "this$0");
                this$0.f81106OooOOO0 = null;
                boolean zIsFocused = this$0.f81095OooO00o.isFocused();
                Oooo.OooO0O0<C24069Oooo0o.OooO00o> oooO0O0 = this$0.f81105OooOO0o;
                if (!zIsFocused) {
                    oooO0O0.OooO0o();
                } else {
                    C24034Oooo00O c24034Oooo00O = new C24034Oooo00O();
                    C24034Oooo00O c24034Oooo00O2 = new C24034Oooo00O();
                    int i = oooO0O0.f59746OooOoO0;
                    if (i > 0) {
                        C24069Oooo0o.OooO00o[] oooO00oArr = oooO0O0.f59745OooOo0o;
                        int i2 = 0;
                        do {
                            C24069Oooo0o.OooO00o oooO00o2 = oooO00oArr[i2];
                            int iOrdinal = oooO00o2.ordinal();
                            if (iOrdinal == 0) {
                                ?? r7 = Boolean.TRUE;
                                c24034Oooo00O.f80942OooOo0o = r7;
                                c24034Oooo00O2.f80942OooOo0o = r7;
                            } else if (iOrdinal == 1) {
                                ?? r72 = Boolean.FALSE;
                                c24034Oooo00O.f80942OooOo0o = r72;
                                c24034Oooo00O2.f80942OooOo0o = r72;
                            } else if ((iOrdinal == 2 || iOrdinal == 3) && !kotlin.jvm.internal.OooOOO0.OooO0O0(c24034Oooo00O.f80942OooOo0o, Boolean.FALSE)) {
                                c24034Oooo00O2.f80942OooOo0o = Boolean.valueOf(oooO00o2 == C24069Oooo0o.OooO00o.f81110OooOoO0);
                            }
                            i2++;
                        } while (i2 < i);
                    }
                    boolean zOooO0O0 = kotlin.jvm.internal.OooOOO0.OooO0O0(c24034Oooo00O.f80942OooOo0o, Boolean.TRUE);
                    C24053OooOOoo c24053OooOOoo = this$0.f81096OooO0O0;
                    if (zOooO0O0) {
                        ((InputMethodManager) c24053OooOOoo.f81059OooO0O0.getValue()).restartInput(c24053OooOOoo.f81058OooO00o);
                    }
                    Boolean bool = (Boolean) c24034Oooo00O2.f80942OooOo0o;
                    if (bool != null) {
                        if (bool.booleanValue()) {
                            c24053OooOOoo.f81060OooO0OO.OooO0O0((InputMethodManager) c24053OooOOoo.f81059OooO0O0.getValue());
                        } else {
                            c24053OooOOoo.f81060OooO0OO.OooO00o((InputMethodManager) c24053OooOOoo.f81059OooO0O0.getValue());
                        }
                    }
                    if (kotlin.jvm.internal.OooOOO0.OooO0O0(c24034Oooo00O.f80942OooOo0o, Boolean.FALSE)) {
                        ((InputMethodManager) c24053OooOOoo.f81059OooO0O0.getValue()).restartInput(c24053OooOOoo.f81058OooO00o);
                    }
                }
                break;
        }
    }
}
