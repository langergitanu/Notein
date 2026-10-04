package o0OoOo0O;

import Oooo0oO.C21022OooO0OO;
import android.app.Dialog;
import android.content.Context;
import android.media.MediaPlayer;
import android.util.Log;
import android.view.View;
import com.orion.notein.global.R;
import com.orion.notein.p607ui.noteeditor.audio.dialog.AudioFileRenameDialogFragment;
import com.orion.notein.p607ui.noteeditor.translate.TranslateDialogFragment;
import kotlin.jvm.internal.OooOOO0;
import o000o0O0.C24564OooO00o;
import o00o00.C25206OooO0Oo;
import o0Oo00o.C28026OooO0OO;

/* JADX INFO: renamed from: o0OoOo0O.OooO0O0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class ViewOnClickListenerC29208OooO0O0 implements View.OnClickListener {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final /* synthetic */ Object f103591OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final /* synthetic */ int f103592OooOo0o;

    public /* synthetic */ ViewOnClickListenerC29208OooO0O0(Object obj, int i) {
        this.f103592OooOo0o = i;
        this.f103591OooOo = obj;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.f103592OooOo0o) {
            case 0:
                Dialog dialog = ((AudioFileRenameDialogFragment) this.f103591OooOo).getDialog();
                if (dialog != null) {
                    dialog.dismiss();
                }
                break;
            case 1:
                TranslateDialogFragment translateDialogFragment = (TranslateDialogFragment) this.f103591OooOo;
                boolean zIsPlaying = translateDialogFragment.f76929OoooO0.isPlaying();
                final MediaPlayer mediaPlayer = translateDialogFragment.f76929OoooO0;
                if (zIsPlaying) {
                    mediaPlayer.stop();
                    mediaPlayer.reset();
                }
                Log.d("TranslateDialogFragment", "onViewCreated: dstTtsUri = " + translateDialogFragment.f76928OoooO);
                try {
                    mediaPlayer.setDataSource(translateDialogFragment.f76928OoooO);
                    mediaPlayer.prepare();
                    mediaPlayer.start();
                } catch (Exception unused) {
                    Context contextRequireContext = translateDialogFragment.requireContext();
                    OooOOO0.OooO0o(contextRequireContext, "requireContext(...)");
                    C25206OooO0Oo.OooO0Oo(contextRequireContext, "播放失败");
                }
                mediaPlayer.setOnCompletionListener(new MediaPlayer.OnCompletionListener() { // from class: o0o00oO.OooOO0O
                    @Override // android.media.MediaPlayer.OnCompletionListener
                    public final void onCompletion(MediaPlayer mediaPlayer2) {
                        MediaPlayer mediaPlayer3 = mediaPlayer;
                        mediaPlayer3.stop();
                        mediaPlayer3.reset();
                    }
                });
                break;
            default:
                View view2 = (View) this.f103591OooOo;
                OooOOO0.OooO0Oo(view2);
                C28026OooO0OO.OooO0O0(C21022OooO0OO.OooO0O0(view2), new C24564OooO00o(R.id.action_to_fabDocumentsFragment));
                break;
        }
    }
}
