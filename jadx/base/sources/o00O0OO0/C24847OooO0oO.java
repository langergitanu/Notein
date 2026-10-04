package o00O0OO0;

import OooOOO0.AbstractC20449OooO0Oo;
import OooOoo.C20593OooO0Oo;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import o00O0O0o.AbstractC24840OooOOo;
import o00O0Ooo.RunnableC24897OooO0Oo;

/* JADX INFO: renamed from: o00O0OO0.OooO0oO, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C24847OooO0oO extends AbstractC20449OooO0Oo {

    /* JADX INFO: renamed from: OooOooo, reason: collision with root package name */
    public static final String f84344OooOooo = o00O0O0o.OooOO0O.OooO0o0("WorkContinuationImpl");

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final String f84345OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final OooOO0O f84346OooOo0o;

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public final List<? extends AbstractC24840OooOOo> f84347OooOoO;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public final o00O0O0o.OooO0o f84348OooOoO0;

    /* JADX INFO: renamed from: OooOoOO, reason: collision with root package name */
    public final ArrayList f84349OooOoOO;

    /* JADX INFO: renamed from: OooOoo, reason: collision with root package name */
    public boolean f84350OooOoo;

    /* JADX INFO: renamed from: OooOoo0, reason: collision with root package name */
    public final ArrayList f84351OooOoo0 = new ArrayList();

    /* JADX INFO: renamed from: OooOooO, reason: collision with root package name */
    public OooO0OO f84352OooOooO;

    public C24847OooO0oO(OooOO0O oooOO0O, String str, o00O0O0o.OooO0o oooO0o, List list) {
        this.f84346OooOo0o = oooOO0O;
        this.f84345OooOo = str;
        this.f84348OooOoO0 = oooO0o;
        this.f84347OooOoO = list;
        this.f84349OooOoOO = new ArrayList(list.size());
        for (int i = 0; i < list.size(); i++) {
            String string = ((AbstractC24840OooOOo) list.get(i)).f84270OooO00o.toString();
            this.f84349OooOoOO.add(string);
            this.f84351OooOoo0.add(string);
        }
    }

    public static HashSet OoooO00(C24847OooO0oO c24847OooO0oO) {
        HashSet hashSet = new HashSet();
        c24847OooO0oO.getClass();
        return hashSet;
    }

    public final o00O0O0o.OooOOO Oooo() {
        if (this.f84350OooOoo) {
            o00O0O0o.OooOO0O.OooO0OO().OooO0o(f84344OooOooo, C20593OooO0Oo.OooO0O0("Already enqueued work ids (", TextUtils.join(", ", this.f84349OooOoOO), ")"), new Throwable[0]);
        } else {
            RunnableC24897OooO0Oo runnableC24897OooO0Oo = new RunnableC24897OooO0Oo(this);
            this.f84346OooOo0o.f84363OooO0Oo.OooO00o(runnableC24897OooO0Oo);
            this.f84352OooOooO = runnableC24897OooO0Oo.f84511OooOo;
        }
        return this.f84352OooOooO;
    }
}
