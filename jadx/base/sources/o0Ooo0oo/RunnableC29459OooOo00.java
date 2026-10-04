package o0Ooo0oo;

import android.media.MediaPlayer;
import android.view.animation.AccelerateInterpolator;
import com.orion.notein.p607ui.noteeditor.penbar.PenBarChildFragment;
import o0o00oO.C29961OooO0oO;

/* JADX INFO: renamed from: o0Ooo0oo.OooOo00, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class RunnableC29459OooOo00 implements Runnable {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final /* synthetic */ Object f104527OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final /* synthetic */ int f104528OooOo0o;

    public /* synthetic */ RunnableC29459OooOo00(Object obj, int i) {
        this.f104528OooOo0o = i;
        this.f104527OooOo = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Object obj = this.f104527OooOo;
        switch (this.f104528OooOo0o) {
            case 0:
                int i = PenBarChildFragment.f75240o0000OOo;
                ((PenBarChildFragment) obj).OooOooO();
                break;
            default:
                final C29961OooO0oO c29961OooO0oO = (C29961OooO0oO) obj;
                c29961OooO0oO.f106415OooO0OO.getContentView().setAlpha(1.0f);
                c29961OooO0oO.f106415OooO0OO.getContentView().animate().alpha(0.0f).setDuration(1000L).setInterpolator(new AccelerateInterpolator()).withEndAction(new Runnable() { // from class: o0o00oO.OooO0o
                    @Override // java.lang.Runnable
                    public final void run() {
                        C29961OooO0oO c29961OooO0oO2 = c29961OooO0oO;
                        c29961OooO0oO2.f106415OooO0OO.dismiss();
                        MediaPlayer mediaPlayer = c29961OooO0oO2.f106421OooOO0;
                        if (mediaPlayer != null) {
                            mediaPlayer.stop();
                        }
                        MediaPlayer mediaPlayer2 = c29961OooO0oO2.f106421OooOO0;
                        if (mediaPlayer2 != null) {
                            mediaPlayer2.release();
                        }
                        c29961OooO0oO2.f106421OooOO0 = null;
                        c29961OooO0oO2.f106422OooOO0O = null;
                    }
                }).start();
                break;
        }
    }
}
