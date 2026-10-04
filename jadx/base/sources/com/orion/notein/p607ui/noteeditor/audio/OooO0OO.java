package com.orion.notein.p607ui.noteeditor.audio;

import android.content.Context;
import android.media.AudioAttributes;
import android.media.MediaPlayer;
import android.net.Uri;
import com.aspose.slides.internal.p332p7.C22238OooO0oO;
import com.orion.notein.p607ui.noteeditor.audio.OooO0O0;
import java.io.IOException;
import kotlin.jvm.internal.OooOOO0;
import oOO00oo.C34406OooO00o;

/* JADX INFO: loaded from: classes10.dex */
public abstract class OooO0OO {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final String f74205OooO00o;

    public static final class OooO extends OooO0OO {

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public static final OooO f74206OooO0O0 = new OooO("Stopped");

        @Override // com.orion.notein.p607ui.noteeditor.audio.OooO0OO
        public final OooO0OO OooO00o(com.orion.notein.p607ui.noteeditor.audio.OooO0O0 oooO0O0, MediaPlayer mediaPlayer, Context context) throws IOException {
            OooOOO0.OooO0oO(mediaPlayer, "mediaPlayer");
            OooOOO0.OooO0oO(context, "context");
            if (oooO0O0 instanceof OooO0O0.C23391OooO0Oo) {
                mediaPlayer.prepare();
                return C23395OooO0oO.f74213OooO0O0;
            }
            if (oooO0O0 instanceof OooO0O0.OooOO0) {
                return f74206OooO0O0;
            }
            if (oooO0O0 instanceof OooO0O0.OooO0o0) {
                mediaPlayer.release();
                return OooO00o.f74207OooO0O0;
            }
            if (oooO0O0 instanceof OooO0O0.OooO0o) {
                mediaPlayer.reset();
                return C19282OooO0OO.f74209OooO0O0;
            }
            boolean z = oooO0O0 instanceof OooO0O0.C19281OooO0O0;
            OooO0O0 oooO0O02 = OooO0O0.f74208OooO0O0;
            if (z) {
                return oooO0O02;
            }
            super.OooO00o(oooO0O0, mediaPlayer, context);
            return oooO0O02;
        }
    }

    public static final class OooO00o extends OooO0OO {

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public static final OooO00o f74207OooO0O0 = new OooO00o("End");

        @Override // com.orion.notein.p607ui.noteeditor.audio.OooO0OO
        public final OooO0OO OooO00o(com.orion.notein.p607ui.noteeditor.audio.OooO0O0 oooO0O0, MediaPlayer mediaPlayer, Context context) {
            OooOOO0.OooO0oO(mediaPlayer, "mediaPlayer");
            OooOOO0.OooO0oO(context, "context");
            if (oooO0O0 instanceof OooO0O0.OooO0o) {
                mediaPlayer.reset();
                return C19282OooO0OO.f74209OooO0O0;
            }
            super.OooO00o(oooO0O0, mediaPlayer, context);
            return OooO0O0.f74208OooO0O0;
        }
    }

    public static final class OooO0O0 extends OooO0OO {

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public static final OooO0O0 f74208OooO0O0 = new OooO0O0("Error");

        @Override // com.orion.notein.p607ui.noteeditor.audio.OooO0OO
        public final OooO0OO OooO00o(com.orion.notein.p607ui.noteeditor.audio.OooO0O0 oooO0O0, MediaPlayer mediaPlayer, Context context) {
            OooOOO0.OooO0oO(mediaPlayer, "mediaPlayer");
            OooOOO0.OooO0oO(context, "context");
            if (oooO0O0 instanceof OooO0O0.OooO0o) {
                mediaPlayer.reset();
                return C19282OooO0OO.f74209OooO0O0;
            }
            if (oooO0O0 instanceof OooO0O0.OooO0o0) {
                mediaPlayer.release();
                return OooO00o.f74207OooO0O0;
            }
            super.OooO00o(oooO0O0, mediaPlayer, context);
            return f74208OooO0O0;
        }
    }

    /* JADX INFO: renamed from: com.orion.notein.ui.noteeditor.audio.OooO0OO$OooO0OO, reason: collision with other inner class name */
    public static final class C19282OooO0OO extends OooO0OO {

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public static final C19282OooO0OO f74209OooO0O0 = new C19282OooO0OO("Idle");

        @Override // com.orion.notein.p607ui.noteeditor.audio.OooO0OO
        public final OooO0OO OooO00o(com.orion.notein.p607ui.noteeditor.audio.OooO0O0 oooO0O0, MediaPlayer mediaPlayer, Context context) throws IOException {
            OooOOO0.OooO0oO(mediaPlayer, "mediaPlayer");
            OooOOO0.OooO0oO(context, "context");
            if (oooO0O0 instanceof OooO0O0.C23393OooO0oo) {
                mediaPlayer.reset();
                mediaPlayer.setAudioAttributes(new AudioAttributes.Builder().setContentType(2).setUsage(1).build());
                Object obj = oooO0O0.f74203OooO00o;
                OooOOO0.OooO0o0(obj, "null cannot be cast to non-null type android.net.Uri");
                mediaPlayer.setDataSource(context, (Uri) obj);
                return OooO0Oo.f74210OooO0O0;
            }
            if (oooO0O0 instanceof OooO0O0.OooO0o) {
                return f74209OooO0O0;
            }
            if (oooO0O0 instanceof OooO0O0.OooO0o0) {
                mediaPlayer.release();
                return OooO00o.f74207OooO0O0;
            }
            super.OooO00o(oooO0O0, mediaPlayer, context);
            return OooO0O0.f74208OooO0O0;
        }
    }

    public static final class OooO0Oo extends OooO0OO {

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public static final OooO0Oo f74210OooO0O0 = new OooO0Oo("Initialized");

        @Override // com.orion.notein.p607ui.noteeditor.audio.OooO0OO
        public final OooO0OO OooO00o(com.orion.notein.p607ui.noteeditor.audio.OooO0O0 oooO0O0, MediaPlayer mediaPlayer, Context context) throws IOException {
            OooOOO0.OooO0oO(mediaPlayer, "mediaPlayer");
            OooOOO0.OooO0oO(context, "context");
            if (oooO0O0 instanceof OooO0O0.C23391OooO0Oo) {
                mediaPlayer.prepare();
                return C23395OooO0oO.f74213OooO0O0;
            }
            if (oooO0O0 instanceof OooO0O0.OooO0o) {
                mediaPlayer.reset();
                return C19282OooO0OO.f74209OooO0O0;
            }
            if (oooO0O0 instanceof OooO0O0.OooO0o0) {
                mediaPlayer.release();
                return OooO00o.f74207OooO0O0;
            }
            super.OooO00o(oooO0O0, mediaPlayer, context);
            return OooO0O0.f74208OooO0O0;
        }
    }

    public static final class OooO0o extends OooO0OO {

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public static final OooO0o f74211OooO0O0 = new OooO0o("PlaybackCompleted");

        @Override // com.orion.notein.p607ui.noteeditor.audio.OooO0OO
        public final OooO0OO OooO00o(com.orion.notein.p607ui.noteeditor.audio.OooO0O0 oooO0O0, MediaPlayer mediaPlayer, Context context) {
            OooOOO0.OooO0oO(mediaPlayer, "mediaPlayer");
            OooOOO0.OooO0oO(context, "context");
            boolean z = oooO0O0 instanceof OooO0O0.OooO;
            Object obj = oooO0O0.f74203OooO00o;
            if (z) {
                mediaPlayer.start();
                OooOOO0.OooO0o0(obj, "null cannot be cast to non-null type kotlin.Float");
                mediaPlayer.setPlaybackParams(mediaPlayer.getPlaybackParams().setSpeed(((Float) obj).floatValue()));
                return C23396OooO0oo.f74214OooO0O0;
            }
            if (oooO0O0 instanceof OooO0O0.C23392OooO0oO) {
                OooOOO0.OooO0o0(obj, "null cannot be cast to non-null type kotlin.Int");
                mediaPlayer.seekTo(((Integer) obj).intValue());
                return f74211OooO0O0;
            }
            if (oooO0O0 instanceof OooO0O0.OooOO0) {
                mediaPlayer.stop();
                return OooO.f74206OooO0O0;
            }
            if (oooO0O0 instanceof OooO0O0.OooO0o) {
                mediaPlayer.reset();
                return C19282OooO0OO.f74209OooO0O0;
            }
            if (oooO0O0 instanceof OooO0O0.OooO0o0) {
                mediaPlayer.release();
                return OooO00o.f74207OooO0O0;
            }
            boolean z2 = oooO0O0 instanceof OooO0O0.C19281OooO0O0;
            OooO0O0 oooO0O02 = OooO0O0.f74208OooO0O0;
            if (z2) {
                return oooO0O02;
            }
            super.OooO00o(oooO0O0, mediaPlayer, context);
            return oooO0O02;
        }
    }

    /* JADX INFO: renamed from: com.orion.notein.ui.noteeditor.audio.OooO0OO$OooO0o0, reason: case insensitive filesystem */
    public static final class C23394OooO0o0 extends OooO0OO {

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public static final C23394OooO0o0 f74212OooO0O0 = new C23394OooO0o0("Paused");

        @Override // com.orion.notein.p607ui.noteeditor.audio.OooO0OO
        public final OooO0OO OooO00o(com.orion.notein.p607ui.noteeditor.audio.OooO0O0 oooO0O0, MediaPlayer mediaPlayer, Context context) {
            OooOOO0.OooO0oO(mediaPlayer, "mediaPlayer");
            OooOOO0.OooO0oO(context, "context");
            boolean z = oooO0O0 instanceof OooO0O0.OooO;
            Object obj = oooO0O0.f74203OooO00o;
            if (z) {
                mediaPlayer.start();
                OooOOO0.OooO0o0(obj, "null cannot be cast to non-null type kotlin.Float");
                mediaPlayer.setPlaybackParams(mediaPlayer.getPlaybackParams().setSpeed(((Float) obj).floatValue()));
                return C23396OooO0oo.f74214OooO0O0;
            }
            boolean z2 = oooO0O0 instanceof OooO0O0.C23392OooO0oO;
            C23394OooO0o0 c23394OooO0o0 = f74212OooO0O0;
            if (z2) {
                OooOOO0.OooO0o0(obj, "null cannot be cast to non-null type kotlin.Int");
                mediaPlayer.seekTo(((Integer) obj).intValue());
                return c23394OooO0o0;
            }
            if (oooO0O0 instanceof OooO0O0.OooO0OO) {
                mediaPlayer.pause();
                return c23394OooO0o0;
            }
            if (oooO0O0 instanceof OooO0O0.OooOO0) {
                mediaPlayer.stop();
                return OooO.f74206OooO0O0;
            }
            if (oooO0O0 instanceof OooO0O0.OooO0o0) {
                mediaPlayer.release();
                return OooO00o.f74207OooO0O0;
            }
            if (oooO0O0 instanceof OooO0O0.OooO0o) {
                mediaPlayer.reset();
                return C19282OooO0OO.f74209OooO0O0;
            }
            boolean z3 = oooO0O0 instanceof OooO0O0.C19281OooO0O0;
            OooO0O0 oooO0O02 = OooO0O0.f74208OooO0O0;
            if (z3) {
                return oooO0O02;
            }
            super.OooO00o(oooO0O0, mediaPlayer, context);
            return oooO0O02;
        }
    }

    /* JADX INFO: renamed from: com.orion.notein.ui.noteeditor.audio.OooO0OO$OooO0oO, reason: case insensitive filesystem */
    public static final class C23395OooO0oO extends OooO0OO {

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public static final C23395OooO0oO f74213OooO0O0 = new C23395OooO0oO("Prepared");

        @Override // com.orion.notein.p607ui.noteeditor.audio.OooO0OO
        public final OooO0OO OooO00o(com.orion.notein.p607ui.noteeditor.audio.OooO0O0 oooO0O0, MediaPlayer mediaPlayer, Context context) {
            OooOOO0.OooO0oO(mediaPlayer, "mediaPlayer");
            OooOOO0.OooO0oO(context, "context");
            boolean z = oooO0O0 instanceof OooO0O0.OooO;
            Object obj = oooO0O0.f74203OooO00o;
            if (z) {
                mediaPlayer.start();
                OooOOO0.OooO0o0(obj, "null cannot be cast to non-null type kotlin.Float");
                mediaPlayer.setPlaybackParams(mediaPlayer.getPlaybackParams().setSpeed(((Float) obj).floatValue()));
                return C23396OooO0oo.f74214OooO0O0;
            }
            if (oooO0O0 instanceof OooO0O0.OooOO0) {
                mediaPlayer.stop();
                return OooO.f74206OooO0O0;
            }
            if (oooO0O0 instanceof OooO0O0.C23392OooO0oO) {
                OooOOO0.OooO0o0(obj, "null cannot be cast to non-null type kotlin.Int");
                mediaPlayer.seekTo(((Integer) obj).intValue());
                return f74213OooO0O0;
            }
            if (oooO0O0 instanceof OooO0O0.OooO0o0) {
                mediaPlayer.release();
                return OooO00o.f74207OooO0O0;
            }
            if (oooO0O0 instanceof OooO0O0.OooO0o) {
                mediaPlayer.reset();
                return C19282OooO0OO.f74209OooO0O0;
            }
            boolean z2 = oooO0O0 instanceof OooO0O0.C19281OooO0O0;
            OooO0O0 oooO0O02 = OooO0O0.f74208OooO0O0;
            if (z2) {
                return oooO0O02;
            }
            super.OooO00o(oooO0O0, mediaPlayer, context);
            return oooO0O02;
        }
    }

    /* JADX INFO: renamed from: com.orion.notein.ui.noteeditor.audio.OooO0OO$OooO0oo, reason: case insensitive filesystem */
    public static final class C23396OooO0oo extends OooO0OO {

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public static final C23396OooO0oo f74214OooO0O0 = new C23396OooO0oo("Started");

        @Override // com.orion.notein.p607ui.noteeditor.audio.OooO0OO
        public final OooO0OO OooO00o(com.orion.notein.p607ui.noteeditor.audio.OooO0O0 oooO0O0, MediaPlayer mediaPlayer, Context context) {
            OooOOO0.OooO0oO(mediaPlayer, "mediaPlayer");
            OooOOO0.OooO0oO(context, "context");
            boolean z = oooO0O0 instanceof OooO0O0.OooO;
            C23396OooO0oo c23396OooO0oo = f74214OooO0O0;
            Object obj = oooO0O0.f74203OooO00o;
            if (z) {
                mediaPlayer.start();
                OooOOO0.OooO0o0(obj, "null cannot be cast to non-null type kotlin.Float");
                mediaPlayer.setPlaybackParams(mediaPlayer.getPlaybackParams().setSpeed(((Float) obj).floatValue()));
                return c23396OooO0oo;
            }
            if (oooO0O0 instanceof OooO0O0.C23392OooO0oO) {
                OooOOO0.OooO0o0(obj, "null cannot be cast to non-null type kotlin.Int");
                mediaPlayer.seekTo(((Integer) obj).intValue());
                return c23396OooO0oo;
            }
            if (oooO0O0 instanceof OooO0O0.OooO0OO) {
                mediaPlayer.pause();
                return C23394OooO0o0.f74212OooO0O0;
            }
            if (oooO0O0 instanceof OooO0O0.OooOO0) {
                mediaPlayer.stop();
                return OooO.f74206OooO0O0;
            }
            if (oooO0O0 instanceof OooO0O0.OooO00o) {
                return OooO0o.f74211OooO0O0;
            }
            if (oooO0O0 instanceof OooO0O0.OooO0o0) {
                mediaPlayer.release();
                return OooO00o.f74207OooO0O0;
            }
            if (oooO0O0 instanceof OooO0O0.OooO0o) {
                mediaPlayer.reset();
                return C19282OooO0OO.f74209OooO0O0;
            }
            boolean z2 = oooO0O0 instanceof OooO0O0.C19281OooO0O0;
            OooO0O0 oooO0O02 = OooO0O0.f74208OooO0O0;
            if (z2) {
                return oooO0O02;
            }
            super.OooO00o(oooO0O0, mediaPlayer, context);
            return oooO0O02;
        }
    }

    public OooO0OO(String str) {
        this.f74205OooO00o = str;
    }

    public OooO0OO OooO00o(com.orion.notein.p607ui.noteeditor.audio.OooO0O0 oooO0O0, MediaPlayer mediaPlayer, Context context) {
        OooOOO0.OooO0oO(mediaPlayer, "mediaPlayer");
        OooOOO0.OooO0oO(context, "context");
        if (oooO0O0 instanceof OooO0O0.C19281OooO0O0) {
            return OooO0O0.f74208OooO0O0;
        }
        C34406OooO00o.C20358OooO00o c20358OooO00o = C34406OooO00o.f123390OooO00o;
        StringBuilder sbOooO0O0 = C22238OooO0oO.OooO0O0(c20358OooO00o, "MediaPlayerState", "Invalid event: ");
        String str = oooO0O0.f74204OooO0O0;
        sbOooO0O0.append(str);
        sbOooO0O0.append(", current state: ");
        sbOooO0O0.append(this.f74205OooO00o);
        c20358OooO00o.OooO0OO(sbOooO0O0.toString(), new Object[0]);
        throw new IllegalStateException("Invalid event: ".concat(str));
    }
}
