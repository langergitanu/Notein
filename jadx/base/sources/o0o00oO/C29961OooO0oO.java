package o0o00oO;

import Oooo0.o000000O;
import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import android.media.MediaPlayer;
import android.os.Handler;
import android.os.Looper;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.PopupWindow;
import android.widget.ScrollView;
import android.widget.TextView;
import com.aspose.words.StyleIdentifier;
import com.orion.editor.model.ClipboardData;
import com.orion.notein.domain.models.translate.TranslateResult;
import com.orion.notein.global.R;
import com.orion.notein.p607ui.noteeditor.NoteEditorFragment;
import o00o00.C25206OooO0Oo;
import o0Oo00oO.C28038OooO0Oo;
import o0OoOOO0.C29051OooOO0o;
import o0Ooo0oo.RunnableC29459OooOo00;

/* JADX INFO: renamed from: o0o00oO.OooO0oO, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C29961OooO0oO {

    /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
    public static final int f106410OooOO0o = o000000O.OooO0o(420);

    /* JADX INFO: renamed from: OooOOO0, reason: collision with root package name */
    public static final int f106411OooOOO0 = o000000O.OooO0o(160);

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    public final Handler f106412OooO = new Handler(Looper.getMainLooper());

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final Context f106413OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final NoteEditorFragment.OooOOO f106414OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final PopupWindow f106415OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final TextView f106416OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final View f106417OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final TextView f106418OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final View f106419OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public final ScrollView f106420OooO0oo;

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    public MediaPlayer f106421OooOO0;

    /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
    public TranslateResult f106422OooOO0O;

    public C29961OooO0oO(Context context, NoteEditorFragment.OooOOO oooOOO) {
        this.f106413OooO00o = context;
        this.f106414OooO0O0 = oooOOO;
        Object systemService = context.getSystemService("layout_inflater");
        kotlin.jvm.internal.OooOOO0.OooO0o0(systemService, "null cannot be cast to non-null type android.view.LayoutInflater");
        View viewInflate = ((LayoutInflater) systemService).inflate(R.layout.popup_fast_translate, (ViewGroup) null);
        kotlin.jvm.internal.OooOOO0.OooO0o(viewInflate, "inflate(...)");
        if (C28038OooO0Oo.OooO0O0(context)) {
            this.f106415OooO0OO = new PopupWindow(viewInflate, o000000O.OooO0o(StyleIdentifier.GRID_TABLE_3_ACCENT_5), -2, false);
        } else {
            this.f106415OooO0OO = new PopupWindow(viewInflate, f106410OooOO0o, -2, false);
        }
        this.f106415OooO0OO.setElevation(10.0f);
        this.f106416OooO0Oo = (TextView) viewInflate.findViewById(R.id.title_text);
        this.f106418OooO0o0 = (TextView) viewInflate.findViewById(R.id.content);
        ScrollView scrollView = (ScrollView) viewInflate.findViewById(R.id.content_wrapper);
        this.f106420OooO0oo = scrollView;
        scrollView.setOnTouchListener(new View.OnTouchListener() { // from class: o0o00oO.OooO00o
            @Override // android.view.View.OnTouchListener
            public final boolean onTouch(View view, MotionEvent motionEvent) {
                this.f106402OooOo0o.OooO00o(3000L);
                return false;
            }
        });
        final View viewFindViewById = viewInflate.findViewById(R.id.btn_copy);
        viewFindViewById.setOnClickListener(new View.OnClickListener() { // from class: o0o00oO.OooO0O0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                Object systemService2 = viewFindViewById.getContext().getSystemService("clipboard");
                kotlin.jvm.internal.OooOOO0.OooO0o0(systemService2, "null cannot be cast to non-null type android.content.ClipboardManager");
                C29961OooO0oO c29961OooO0oO = this;
                ((ClipboardManager) systemService2).setPrimaryClip(ClipData.newPlainText("text", c29961OooO0oO.f106418OooO0o0.getText()));
                String text = c29961OooO0oO.f106418OooO0o0.getText().toString();
                NoteEditorFragment.OooOOO oooOOO2 = c29961OooO0oO.f106414OooO0O0;
                kotlin.jvm.internal.OooOOO0.OooO0oO(text, "text");
                ClipboardData clipboardData = new ClipboardData();
                NoteEditorFragment noteEditorFragment = NoteEditorFragment.this;
                C29051OooOO0o c29051OooOO0oOoooOo0 = noteEditorFragment.OoooOo0();
                Context contextRequireContext = noteEditorFragment.requireContext();
                kotlin.jvm.internal.OooOOO0.OooO0o(contextRequireContext, "requireContext(...)");
                clipboardData.f69321OooO00o = com.facebook.soloader.OooOo.OooO0oO(c29051OooOO0oOoooOo0.OooO0o(contextRequireContext, text));
                noteEditorFragment.OoooOO0().f73559OooOOoo.OooOOO(clipboardData);
                Context contextRequireContext2 = noteEditorFragment.requireContext();
                kotlin.jvm.internal.OooOOO0.OooO0o(contextRequireContext2, "requireContext(...)");
                String string = noteEditorFragment.getString(R.string.translation_has_been_copied_to_clipboard);
                kotlin.jvm.internal.OooOOO0.OooO0o(string, "getString(...)");
                C25206OooO0Oo.OooO0Oo(contextRequireContext2, string);
                c29961OooO0oO.OooO00o(3000L);
            }
        });
        this.f106417OooO0o = viewFindViewById;
        final View viewFindViewById2 = viewInflate.findViewById(R.id.btn_play);
        kotlin.jvm.internal.OooOOO0.OooO0Oo(viewFindViewById2);
        viewFindViewById2.setVisibility(8);
        viewFindViewById2.setOnClickListener(new View.OnClickListener() { // from class: o0o00oO.OooO0OO
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                String srcTts;
                final C29961OooO0oO c29961OooO0oO = this;
                c29961OooO0oO.f106412OooO.removeCallbacksAndMessages(null);
                c29961OooO0oO.f106415OooO0OO.getContentView().animate().cancel();
                MediaPlayer mediaPlayer = c29961OooO0oO.f106421OooOO0;
                if (mediaPlayer != null && mediaPlayer.isPlaying()) {
                    mediaPlayer.stop();
                    mediaPlayer.reset();
                    mediaPlayer.release();
                }
                MediaPlayer mediaPlayer2 = new MediaPlayer();
                TranslateResult translateResult = c29961OooO0oO.f106422OooOO0O;
                if (translateResult != null && (srcTts = translateResult.getSrcTts()) != null) {
                    try {
                        mediaPlayer2.setDataSource(srcTts);
                        mediaPlayer2.prepare();
                        mediaPlayer2.start();
                    } catch (Exception unused) {
                        Context context2 = viewFindViewById2.getContext();
                        kotlin.jvm.internal.OooOOO0.OooO0o(context2, "getContext(...)");
                        C25206OooO0Oo.OooO0Oo(context2, "播放失败");
                        c29961OooO0oO.OooO00o(1000L);
                    }
                }
                mediaPlayer2.setOnCompletionListener(new MediaPlayer.OnCompletionListener() { // from class: o0o00oO.OooO0o0
                    @Override // android.media.MediaPlayer.OnCompletionListener
                    public final void onCompletion(MediaPlayer mediaPlayer3) {
                        c29961OooO0oO.OooO00o(1000L);
                    }
                });
                c29961OooO0oO.f106421OooOO0 = mediaPlayer2;
            }
        });
        this.f106419OooO0oO = viewFindViewById2;
        viewInflate.setOnTouchListener(new View.OnTouchListener() { // from class: o0o00oO.OooO0Oo
            @Override // android.view.View.OnTouchListener
            public final boolean onTouch(View view, MotionEvent motionEvent) {
                this.f106407OooOo0o.OooO00o(3000L);
                return true;
            }
        });
    }

    public final void OooO00o(long j) {
        Handler handler = this.f106412OooO;
        handler.removeCallbacksAndMessages(null);
        PopupWindow popupWindow = this.f106415OooO0OO;
        popupWindow.getContentView().animate().cancel();
        popupWindow.getContentView().setAlpha(1.0f);
        handler.postDelayed(new RunnableC29459OooOo00(this, 1), j);
    }
}
