package androidx.biometric;

import OooOOOo.C20450OooO00o;
import OooOOOo.OooOOO;
import android.content.DialogInterface;
import android.os.Handler;
import android.os.Looper;
import androidx.biometric.C21590OooO0o0;
import androidx.biometric.OooO0O0;
import androidx.lifecycle.AbstractC22019Ooooooo;
import androidx.lifecycle.C21996Oooo0OO;
import java.lang.ref.WeakReference;
import java.util.concurrent.Executor;

/* JADX INFO: renamed from: androidx.biometric.OooO0oO, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C21592OooO0oO extends AbstractC22019Ooooooo {

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    public OooOOO f63247OooO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public Executor f63248OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public C21590OooO0o0.C21591OooO0Oo f63249OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public C21590OooO0o0.OooO00o f63250OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public C21590OooO0o0.OooO0OO f63251OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public androidx.biometric.OooO0O0 f63252OooO0oo;

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    public OooO0OO f63253OooOO0;

    /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
    public String f63254OooOO0O;

    /* JADX INFO: renamed from: OooOOO, reason: collision with root package name */
    public boolean f63256OooOOO;

    /* JADX INFO: renamed from: OooOOO0, reason: collision with root package name */
    public boolean f63257OooOOO0;

    /* JADX INFO: renamed from: OooOOOO, reason: collision with root package name */
    public boolean f63258OooOOOO;

    /* JADX INFO: renamed from: OooOOOo, reason: collision with root package name */
    public boolean f63259OooOOOo;

    /* JADX INFO: renamed from: OooOOo, reason: collision with root package name */
    public boolean f63260OooOOo;

    /* JADX INFO: renamed from: OooOOo0, reason: collision with root package name */
    public boolean f63261OooOOo0;

    /* JADX INFO: renamed from: OooOOoo, reason: collision with root package name */
    public C21996Oooo0OO<C21590OooO0o0.OooO0O0> f63262OooOOoo;

    /* JADX INFO: renamed from: OooOo0, reason: collision with root package name */
    public C21996Oooo0OO<CharSequence> f63264OooOo0;

    /* JADX INFO: renamed from: OooOo00, reason: collision with root package name */
    public C21996Oooo0OO<C20450OooO00o> f63265OooOo00;

    /* JADX INFO: renamed from: OooOo0O, reason: collision with root package name */
    public C21996Oooo0OO<Boolean> f63266OooOo0O;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public C21996Oooo0OO<Boolean> f63267OooOo0o;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public C21996Oooo0OO<Boolean> f63269OooOoO0;

    /* JADX INFO: renamed from: OooOoOO, reason: collision with root package name */
    public C21996Oooo0OO<Integer> f63270OooOoOO;

    /* JADX INFO: renamed from: OooOoo0, reason: collision with root package name */
    public C21996Oooo0OO<CharSequence> f63271OooOoo0;

    /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
    public int f63255OooOO0o = 0;

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public boolean f63263OooOo = true;

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public int f63268OooOoO = 0;

    /* JADX INFO: renamed from: androidx.biometric.OooO0oO$OooO00o */
    public static final class OooO00o extends OooO0O0.OooO0OO {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final WeakReference<C21592OooO0oO> f63272OooO00o;

        public OooO00o(C21592OooO0oO c21592OooO0oO) {
            this.f63272OooO00o = new WeakReference<>(c21592OooO0oO);
        }

        @Override // androidx.biometric.OooO0O0.OooO0OO
        public final void OooO00o(int i, CharSequence charSequence) {
            WeakReference<C21592OooO0oO> weakReference = this.f63272OooO00o;
            if (weakReference.get() == null || weakReference.get().f63258OooOOOO || !weakReference.get().f63256OooOOO) {
                return;
            }
            weakReference.get().OooO0o(new C20450OooO00o(i, charSequence));
        }

        @Override // androidx.biometric.OooO0O0.OooO0OO
        public final void OooO0O0(C21590OooO0o0.OooO0O0 oooO0O0) {
            WeakReference<C21592OooO0oO> weakReference = this.f63272OooO00o;
            if (weakReference.get() == null || !weakReference.get().f63256OooOOO) {
                return;
            }
            int i = -1;
            if (oooO0O0.f63232OooO0O0 == -1) {
                int iOooO0o0 = weakReference.get().OooO0o0();
                if ((iOooO0o0 & 32767) != 0 && !androidx.biometric.OooO0OO.OooO00o(iOooO0o0)) {
                    i = 2;
                }
                oooO0O0 = new C21590OooO0o0.OooO0O0(oooO0O0.f63231OooO00o, i);
            }
            C21592OooO0oO c21592OooO0oO = weakReference.get();
            if (c21592OooO0oO.f63262OooOOoo == null) {
                c21592OooO0oO.f63262OooOOoo = new C21996Oooo0OO<>();
            }
            C21592OooO0oO.OooOO0(c21592OooO0oO.f63262OooOOoo, oooO0O0);
        }
    }

    /* JADX INFO: renamed from: androidx.biometric.OooO0oO$OooO0O0 */
    public static class OooO0O0 implements Executor {

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public final Handler f63273OooOo0o = new Handler(Looper.getMainLooper());

        @Override // java.util.concurrent.Executor
        public final void execute(Runnable runnable) {
            this.f63273OooOo0o.post(runnable);
        }
    }

    /* JADX INFO: renamed from: androidx.biometric.OooO0oO$OooO0OO */
    public static class OooO0OO implements DialogInterface.OnClickListener {

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public final WeakReference<C21592OooO0oO> f63274OooOo0o;

        public OooO0OO(C21592OooO0oO c21592OooO0oO) {
            this.f63274OooOo0o = new WeakReference<>(c21592OooO0oO);
        }

        @Override // android.content.DialogInterface.OnClickListener
        public final void onClick(DialogInterface dialogInterface, int i) {
            WeakReference<C21592OooO0oO> weakReference = this.f63274OooOo0o;
            if (weakReference.get() != null) {
                weakReference.get().OooO(true);
            }
        }
    }

    public static <T> void OooOO0(C21996Oooo0OO<T> c21996Oooo0OO, T t) {
        if (Thread.currentThread() == Looper.getMainLooper().getThread()) {
            c21996Oooo0OO.OooOO0(t);
        } else {
            c21996Oooo0OO.OooO0oo(t);
        }
    }

    public final void OooO(boolean z) {
        if (this.f63267OooOo0o == null) {
            this.f63267OooOo0o = new C21996Oooo0OO<>();
        }
        OooOO0(this.f63267OooOo0o, Boolean.valueOf(z));
    }

    public final void OooO0o(C20450OooO00o c20450OooO00o) {
        if (this.f63265OooOo00 == null) {
            this.f63265OooOo00 = new C21996Oooo0OO<>();
        }
        OooOO0(this.f63265OooOo00, c20450OooO00o);
    }

    public final int OooO0o0() {
        C21590OooO0o0.C21591OooO0Oo c21591OooO0Oo = this.f63249OooO0o;
        if (c21591OooO0Oo == null) {
            return 0;
        }
        C21590OooO0o0.OooO0OO oooO0OO = this.f63251OooO0oO;
        int i = c21591OooO0Oo.f63241OooO0Oo;
        return i != 0 ? i : oooO0OO != null ? 15 : 255;
    }

    public final void OooO0oO(CharSequence charSequence) {
        if (this.f63271OooOoo0 == null) {
            this.f63271OooOoo0 = new C21996Oooo0OO<>();
        }
        OooOO0(this.f63271OooOoo0, charSequence);
    }

    public final void OooO0oo(int i) {
        if (this.f63270OooOoOO == null) {
            this.f63270OooOoOO = new C21996Oooo0OO<>();
        }
        OooOO0(this.f63270OooOoOO, Integer.valueOf(i));
    }
}
