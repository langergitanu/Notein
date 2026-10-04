package com.orion.notein.p607ui.noteeditor.audio;

import android.content.Context;
import android.media.MediaRecorder;
import android.os.Bundle;
import com.aspose.slides.internal.p332p7.C22238OooO0oO;
import com.orion.notein.p607ui.noteeditor.audio.AbstractC23397OooO0Oo;
import java.io.IOException;
import kotlin.jvm.internal.OooOOO0;
import oOO00oo.C34406OooO00o;

/* JADX INFO: renamed from: com.orion.notein.ui.noteeditor.audio.OooO0o0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public abstract class AbstractC23415OooO0o0 {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final String f74390OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public Bundle f74391OooO0O0;

    /* JADX INFO: renamed from: com.orion.notein.ui.noteeditor.audio.OooO0o0$OooO00o */
    public static final class OooO00o extends AbstractC23415OooO0o0 {

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        public static final OooO00o f74392OooO0OO = new OooO00o("DataSourceConfigured");

        @Override // com.orion.notein.p607ui.noteeditor.audio.AbstractC23415OooO0o0
        public final AbstractC23415OooO0o0 OooO0O0(AbstractC23397OooO0Oo abstractC23397OooO0Oo, MediaRecorder mediaRecorder, Context context) throws IOException {
            OooOOO0.OooO0oO(mediaRecorder, "mediaRecorder");
            OooOOO0.OooO0oO(context, "context");
            boolean z = abstractC23397OooO0Oo instanceof AbstractC23397OooO0Oo.OooO0OO;
            OooO00o oooO00o = f74392OooO0OO;
            if (z) {
                mediaRecorder.prepare();
                OooO0o oooO0o = OooO0o.f74396OooO0OO;
                oooO0o.f74391OooO0O0 = oooO00o.f74391OooO0O0;
                return oooO0o;
            }
            if (!(abstractC23397OooO0Oo instanceof AbstractC23397OooO0Oo.OooO00o)) {
                super.OooO0O0(abstractC23397OooO0Oo, mediaRecorder, context);
                return OooO0O0.f74393OooO0OO;
            }
            Object obj = abstractC23397OooO0Oo.f74215OooO00o;
            OooOOO0.OooO0o0(obj, "null cannot be cast to non-null type android.os.Bundle");
            Bundle bundle = (Bundle) obj;
            AbstractC23415OooO0o0.OooO00o(mediaRecorder, bundle);
            Bundle bundle2 = oooO00o.f74391OooO0O0;
            if (bundle2 != null) {
                bundle2.putAll(bundle);
                bundle = bundle2;
            }
            oooO00o.f74391OooO0O0 = bundle;
            return oooO00o;
        }
    }

    /* JADX INFO: renamed from: com.orion.notein.ui.noteeditor.audio.OooO0o0$OooO0O0 */
    public static final class OooO0O0 extends AbstractC23415OooO0o0 {

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        public static final OooO0O0 f74393OooO0OO = new OooO0O0("Error");

        @Override // com.orion.notein.p607ui.noteeditor.audio.AbstractC23415OooO0o0
        public final AbstractC23415OooO0o0 OooO0O0(AbstractC23397OooO0Oo abstractC23397OooO0Oo, MediaRecorder mediaRecorder, Context context) {
            OooOOO0.OooO0oO(mediaRecorder, "mediaRecorder");
            OooOOO0.OooO0oO(context, "context");
            if (abstractC23397OooO0Oo instanceof AbstractC23397OooO0Oo.C23398OooO0o0) {
                mediaRecorder.reset();
                return OooO0OO.f74394OooO0OO;
            }
            super.OooO0O0(abstractC23397OooO0Oo, mediaRecorder, context);
            return f74393OooO0OO;
        }
    }

    /* JADX INFO: renamed from: com.orion.notein.ui.noteeditor.audio.OooO0o0$OooO0OO */
    public static final class OooO0OO extends AbstractC23415OooO0o0 {

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        public static final OooO0OO f74394OooO0OO = new OooO0OO("Initial");

        @Override // com.orion.notein.p607ui.noteeditor.audio.AbstractC23415OooO0o0
        public final AbstractC23415OooO0o0 OooO0O0(AbstractC23397OooO0Oo abstractC23397OooO0Oo, MediaRecorder mediaRecorder, Context context) {
            OooOOO0.OooO0oO(mediaRecorder, "mediaRecorder");
            OooOOO0.OooO0oO(context, "context");
            if (abstractC23397OooO0Oo instanceof AbstractC23397OooO0Oo.C19283OooO0Oo) {
                mediaRecorder.release();
                return C23418OooO0oo.f74398OooO0OO;
            }
            if (abstractC23397OooO0Oo instanceof AbstractC23397OooO0Oo.OooO0o) {
                Object obj = abstractC23397OooO0Oo.f74215OooO00o;
                OooOOO0.OooO0o0(obj, "null cannot be cast to non-null type kotlin.Int");
                mediaRecorder.setAudioSource(((Integer) obj).intValue());
                return C23416OooO0Oo.f74395OooO0OO;
            }
            if (abstractC23397OooO0Oo instanceof AbstractC23397OooO0Oo.C23398OooO0o0) {
                return f74394OooO0OO;
            }
            boolean z = abstractC23397OooO0Oo instanceof AbstractC23397OooO0Oo.OooO0O0;
            OooO0O0 oooO0O0 = OooO0O0.f74393OooO0OO;
            if (z) {
                return oooO0O0;
            }
            super.OooO0O0(abstractC23397OooO0Oo, mediaRecorder, context);
            return oooO0O0;
        }
    }

    /* JADX INFO: renamed from: com.orion.notein.ui.noteeditor.audio.OooO0o0$OooO0Oo, reason: case insensitive filesystem */
    public static final class C23416OooO0Oo extends AbstractC23415OooO0o0 {

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        public static final C23416OooO0Oo f74395OooO0OO = new C23416OooO0Oo("Initialized");

        @Override // com.orion.notein.p607ui.noteeditor.audio.AbstractC23415OooO0o0
        public final AbstractC23415OooO0o0 OooO0O0(AbstractC23397OooO0Oo abstractC23397OooO0Oo, MediaRecorder mediaRecorder, Context context) {
            OooOOO0.OooO0oO(mediaRecorder, "mediaRecorder");
            OooOOO0.OooO0oO(context, "context");
            if (!(abstractC23397OooO0Oo instanceof AbstractC23397OooO0Oo.OooO00o)) {
                super.OooO0O0(abstractC23397OooO0Oo, mediaRecorder, context);
                return OooO0O0.f74393OooO0OO;
            }
            Object obj = abstractC23397OooO0Oo.f74215OooO00o;
            OooOOO0.OooO0o0(obj, "null cannot be cast to non-null type android.os.Bundle");
            Bundle bundle = (Bundle) obj;
            AbstractC23415OooO0o0.OooO00o(mediaRecorder, bundle);
            OooO00o oooO00o = OooO00o.f74392OooO0OO;
            oooO00o.f74391OooO0O0 = bundle;
            return oooO00o;
        }
    }

    /* JADX INFO: renamed from: com.orion.notein.ui.noteeditor.audio.OooO0o0$OooO0o */
    public static final class OooO0o extends AbstractC23415OooO0o0 {

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        public static final OooO0o f74396OooO0OO = new OooO0o("Prepared");

        @Override // com.orion.notein.p607ui.noteeditor.audio.AbstractC23415OooO0o0
        public final AbstractC23415OooO0o0 OooO0O0(AbstractC23397OooO0Oo abstractC23397OooO0Oo, MediaRecorder mediaRecorder, Context context) {
            OooOOO0.OooO0oO(mediaRecorder, "mediaRecorder");
            OooOOO0.OooO0oO(context, "context");
            if (!(abstractC23397OooO0Oo instanceof AbstractC23397OooO0Oo.C23399OooO0oO)) {
                if (abstractC23397OooO0Oo instanceof AbstractC23397OooO0Oo.C23398OooO0o0) {
                    mediaRecorder.reset();
                    return OooO0OO.f74394OooO0OO;
                }
                super.OooO0O0(abstractC23397OooO0Oo, mediaRecorder, context);
                return OooO0O0.f74393OooO0OO;
            }
            mediaRecorder.start();
            C23417OooO0oO c23417OooO0oO = C23417OooO0oO.f74397OooO0OO;
            OooO0o oooO0o = f74396OooO0OO;
            Bundle bundle = oooO0o.f74391OooO0O0;
            if (bundle != null) {
                bundle.putLong("start_time", System.currentTimeMillis());
            }
            c23417OooO0oO.f74391OooO0O0 = oooO0o.f74391OooO0O0;
            return c23417OooO0oO;
        }
    }

    /* JADX INFO: renamed from: com.orion.notein.ui.noteeditor.audio.OooO0o0$OooO0o0, reason: collision with other inner class name */
    public static final class C19293OooO0o0 extends AbstractC23415OooO0o0 {
    }

    /* JADX INFO: renamed from: com.orion.notein.ui.noteeditor.audio.OooO0o0$OooO0oO, reason: case insensitive filesystem */
    public static final class C23417OooO0oO extends AbstractC23415OooO0o0 {

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        public static final C23417OooO0oO f74397OooO0OO = new C23417OooO0oO("Recording");

        @Override // com.orion.notein.p607ui.noteeditor.audio.AbstractC23415OooO0o0
        public final AbstractC23415OooO0o0 OooO0O0(AbstractC23397OooO0Oo abstractC23397OooO0Oo, MediaRecorder mediaRecorder, Context context) {
            OooOOO0.OooO0oO(mediaRecorder, "mediaRecorder");
            OooOOO0.OooO0oO(context, "context");
            boolean z = abstractC23397OooO0Oo instanceof AbstractC23397OooO0Oo.C23400OooO0oo;
            OooO0OO oooO0OO = OooO0OO.f74394OooO0OO;
            if (z) {
                mediaRecorder.stop();
                return oooO0OO;
            }
            if (abstractC23397OooO0Oo instanceof AbstractC23397OooO0Oo.C23398OooO0o0) {
                mediaRecorder.reset();
                return oooO0OO;
            }
            super.OooO0O0(abstractC23397OooO0Oo, mediaRecorder, context);
            return OooO0O0.f74393OooO0OO;
        }
    }

    /* JADX INFO: renamed from: com.orion.notein.ui.noteeditor.audio.OooO0o0$OooO0oo, reason: case insensitive filesystem */
    public static final class C23418OooO0oo extends AbstractC23415OooO0o0 {

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        public static final C23418OooO0oo f74398OooO0OO = new C23418OooO0oo("Released");

        @Override // com.orion.notein.p607ui.noteeditor.audio.AbstractC23415OooO0o0
        public final AbstractC23415OooO0o0 OooO0O0(AbstractC23397OooO0Oo abstractC23397OooO0Oo, MediaRecorder mediaRecorder, Context context) {
            OooOOO0.OooO0oO(mediaRecorder, "mediaRecorder");
            OooOOO0.OooO0oO(context, "context");
            if (abstractC23397OooO0Oo instanceof AbstractC23397OooO0Oo.C23398OooO0o0) {
                return OooO0OO.f74394OooO0OO;
            }
            super.OooO0O0(abstractC23397OooO0Oo, mediaRecorder, context);
            return OooO0O0.f74393OooO0OO;
        }
    }

    public AbstractC23415OooO0o0(String str) {
        this.f74390OooO00o = str;
    }

    public static void OooO00o(MediaRecorder mediaRecorder, Bundle attrs) {
        OooOOO0.OooO0oO(mediaRecorder, "mediaRecorder");
        OooOOO0.OooO0oO(attrs, "attrs");
        if (attrs.containsKey("output_format")) {
            mediaRecorder.setOutputFormat(attrs.getInt("output_format"));
        } else {
            mediaRecorder.setOutputFormat(1);
        }
        if (attrs.containsKey("audio_encoder")) {
            mediaRecorder.setAudioEncoder(attrs.getInt("audio_encoder"));
        }
        if (attrs.containsKey("audio_channels")) {
            mediaRecorder.setAudioChannels(attrs.getInt("audio_channels"));
        }
        if (attrs.containsKey("audio_sampling_rate")) {
            mediaRecorder.setAudioSamplingRate(attrs.getInt("audio_sampling_rate"));
        }
        if (attrs.containsKey("audio_encoding_bitrate")) {
            mediaRecorder.setAudioEncodingBitRate(attrs.getInt("audio_encoding_bitrate"));
        }
        if (attrs.containsKey("output_path")) {
            mediaRecorder.setOutputFile(attrs.getString("output_path"));
        }
    }

    public AbstractC23415OooO0o0 OooO0O0(AbstractC23397OooO0Oo abstractC23397OooO0Oo, MediaRecorder mediaRecorder, Context context) {
        OooOOO0.OooO0oO(mediaRecorder, "mediaRecorder");
        OooOOO0.OooO0oO(context, "context");
        if (abstractC23397OooO0Oo instanceof AbstractC23397OooO0Oo.OooO0O0) {
            return OooO0O0.f74393OooO0OO;
        }
        C34406OooO00o.C20358OooO00o c20358OooO00o = C34406OooO00o.f123390OooO00o;
        StringBuilder sbOooO0O0 = C22238OooO0oO.OooO0O0(c20358OooO00o, "MediaRecordState", "Invalid event: ");
        String str = abstractC23397OooO0Oo.f74216OooO0O0;
        sbOooO0O0.append(str);
        sbOooO0O0.append(", current state: ");
        sbOooO0O0.append(this.f74390OooO00o);
        c20358OooO00o.OooO0OO(sbOooO0O0.toString(), new Object[0]);
        throw new IllegalStateException("Invalid event: ".concat(str));
    }
}
