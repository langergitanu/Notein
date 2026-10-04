package o0OoOo0O;

import android.content.Context;
import android.media.MediaPlayer;
import android.view.View;
import android.widget.EditText;
import androidx.fragment.app.Fragment;
import com.orion.notein.p607ui.noteeditor.audio.dialog.AudioFileRenameDialogFragment;
import com.orion.notein.p607ui.noteeditor.translate.TranslateDialogFragment;
import com.orion.notein.p607ui.notelist.fabbottomsheet.FabNoteTypeFragment;
import com.orion.notein.p607ui.notelist.recover.RecoverProgressDialogFragment;
import java.util.concurrent.CancellationException;
import kotlin.jvm.internal.OooOOO0;
import o00o00.C25206OooO0Oo;
import o0o0O00.C30207OooOo;
import o0o0Oo00.C30603OooO0O0;
import oO0o0OO.o00000OO;

/* JADX INFO: renamed from: o0OoOo0O.OooO00o, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class ViewOnClickListenerC29207OooO00o implements View.OnClickListener {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final /* synthetic */ Fragment f103589OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final /* synthetic */ int f103590OooOo0o;

    public /* synthetic */ ViewOnClickListenerC29207OooO00o(Fragment fragment, int i) {
        this.f103590OooOo0o = i;
        this.f103589OooOo = fragment;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.f103590OooOo0o) {
            case 0:
                EditText editText = ((AudioFileRenameDialogFragment) this.f103589OooOo).f74420Oooo0;
                if (editText != null) {
                    editText.setText("");
                    return;
                } else {
                    OooOOO0.OooOOOO("inputName");
                    throw null;
                }
            case 1:
                TranslateDialogFragment translateDialogFragment = (TranslateDialogFragment) this.f103589OooOo;
                boolean zIsPlaying = translateDialogFragment.f76929OoooO0.isPlaying();
                final MediaPlayer mediaPlayer = translateDialogFragment.f76929OoooO0;
                if (zIsPlaying) {
                    mediaPlayer.stop();
                    mediaPlayer.reset();
                }
                try {
                    mediaPlayer.setDataSource(translateDialogFragment.f76931OoooO0O);
                    mediaPlayer.prepare();
                    mediaPlayer.start();
                    break;
                } catch (Exception unused) {
                    Context contextRequireContext = translateDialogFragment.requireContext();
                    OooOOO0.OooO0o(contextRequireContext, "requireContext(...)");
                    C25206OooO0Oo.OooO0Oo(contextRequireContext, "播放失败");
                }
                mediaPlayer.setOnCompletionListener(new MediaPlayer.OnCompletionListener() { // from class: o0o00oO.OooOO0o
                    @Override // android.media.MediaPlayer.OnCompletionListener
                    public final void onCompletion(MediaPlayer mediaPlayer2) {
                        MediaPlayer mediaPlayer3 = mediaPlayer;
                        mediaPlayer3.stop();
                        mediaPlayer3.reset();
                    }
                });
                return;
            case 2:
                C30207OooOo.OooO00o oooO00o = ((FabNoteTypeFragment) this.f103589OooOo).f77468OooOo0o;
                if (oooO00o != null) {
                    oooO00o.OooOO0();
                    return;
                }
                return;
            default:
                RecoverProgressDialogFragment recoverProgressDialogFragment = (RecoverProgressDialogFragment) this.f103589OooOo;
                o00000OO o00000oo2 = ((C30603OooO0O0) recoverProgressDialogFragment.f77943Oooo000.getValue()).f109498OooO0oo;
                if (o00000oo2 != null) {
                    o00000oo2.cancel((CancellationException) null);
                }
                recoverProgressDialogFragment.dismiss();
                return;
        }
    }
}
