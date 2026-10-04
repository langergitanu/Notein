package oO0OOooo;

import android.app.Application;
import androidx.appcompat.app.ActivityC21485OooO0oo;
import androidx.lifecycle.o00Oo0;
import o0O0oooO.C26263OooOOO;
import o0O0oooO.C26264OooOOO0;
import o0O0oooO.C26266OooOOOo;
import o0O0oooO.C26269OooOOoo;
import o0OoOO00.C29024Oooo0o0;
import oO0OOooo.C33159OooO0OO;
import oO0Oo0oo.InterfaceC33226OooO0O0;

/* JADX INFO: renamed from: oO0OOooo.OooO00o, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C33157OooO00o implements InterfaceC33226OooO0O0<Object> {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final Object f119892OooOo = new Object();

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public volatile C26263OooOOO f119893OooOo0o;

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public final C33159OooO0OO f119894OooOoO;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public final ActivityC21485OooO0oo f119895OooOoO0;

    /* JADX INFO: renamed from: oO0OOooo.OooO00o$OooO00o, reason: collision with other inner class name */
    public interface InterfaceC20302OooO00o {
        C26264OooOOO0 OooO00o();
    }

    public C33157OooO00o(ActivityC21485OooO0oo activityC21485OooO0oo) {
        this.f119895OooOoO0 = activityC21485OooO0oo;
        this.f119894OooOoO = new C33159OooO0OO(activityC21485OooO0oo);
    }

    public final C26263OooOOO OooO00o() {
        String str;
        ActivityC21485OooO0oo activityC21485OooO0oo = this.f119895OooOoO0;
        if (activityC21485OooO0oo.getApplication() instanceof InterfaceC33226OooO0O0) {
            C26264OooOOO0 c26264OooOOO0OooO00o = ((InterfaceC20302OooO00o) C29024Oooo0o0.OooO00o(InterfaceC20302OooO00o.class, this.f119894OooOoO)).OooO00o();
            c26264OooOOO0OooO00o.getClass();
            return new C26263OooOOO((C26269OooOOoo) c26264OooOOO0OooO00o.f89720OooO00o, (C26266OooOOOo) c26264OooOOO0OooO00o.f89721OooO0O0);
        }
        StringBuilder sb = new StringBuilder("Hilt Activity must be attached to an @HiltAndroidApp Application. ");
        if (Application.class.equals(activityC21485OooO0oo.getApplication().getClass())) {
            str = "Did you forget to specify your Application's class name in your manifest's <application />'s android:name attribute?";
        } else {
            str = "Found: " + activityC21485OooO0oo.getApplication().getClass();
        }
        sb.append(str);
        throw new IllegalStateException(sb.toString());
    }

    public final C33161OooO0o OooO0O0() {
        C33159OooO0OO c33159OooO0OO = this.f119894OooOoO;
        return ((C33159OooO0OO.OooO0O0) new o00Oo0(c33159OooO0OO.f119898OooOo0o, new C33158OooO0O0(c33159OooO0OO.f119897OooOo)).OooO00o(C33159OooO0OO.OooO0O0.class)).f119902OooO0o0;
    }

    @Override // oO0Oo0oo.InterfaceC33226OooO0O0
    public final Object generatedComponent() {
        if (this.f119893OooOo0o == null) {
            synchronized (this.f119892OooOo) {
                try {
                    if (this.f119893OooOo0o == null) {
                        this.f119893OooOo0o = OooO00o();
                    }
                } finally {
                }
            }
        }
        return this.f119893OooOo0o;
    }
}
