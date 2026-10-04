package com.orion.notein.p607ui.noteeditor.audio;

import android.os.Build;
import com.google.gson.Gson;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.orion.notein.p607ui.noteeditor.audio.OooO0o;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.OooOOO0;
import oO00ooO.C32446OooOOOo;
import oO00ooO.C32460OooOooO;
import oO00ooo.AbstractC32476OooO;
import oO00ooo.InterfaceC32482OooO0o0;
import oO00ooo0.EnumC32485OooO00o;
import oO0O000o.InterfaceC32507OooOO0o;
import oO0O000o.InterfaceC32508OooOOOo;
import oO0o0OO.InterfaceC33636Oooo00o;
import oOO00oo.C34406OooO00o;

/* JADX INFO: renamed from: com.orion.notein.ui.noteeditor.audio.OooO0oo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
@InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.noteeditor.audio.NoteAudioViewModel$fetchRemoteConfig$1", m80623f = "NoteAudioViewModel.kt", m80624l = {402}, m80625m = "invokeSuspend")
public final class C23420OooO0oo extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super C32460OooOooO>, Object> {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final /* synthetic */ OooO0o f74407OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public int f74408OooOo0o;

    /* JADX INFO: renamed from: com.orion.notein.ui.noteeditor.audio.OooO0oo$OooO00o */
    @InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.noteeditor.audio.NoteAudioViewModel$fetchRemoteConfig$1$1", m80623f = "NoteAudioViewModel.kt", m80624l = {}, m80625m = "invokeSuspend")
    public static final class OooO00o extends AbstractC32476OooO implements InterfaceC32507OooOO0o<Continuation<? super C32460OooOooO>, Object> {

        /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
        public final /* synthetic */ JsonObject f74409OooOo;

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public final /* synthetic */ OooO0o f74410OooOo0o;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO00o(OooO0o oooO0o, JsonObject jsonObject, Continuation<? super OooO00o> continuation) {
            super(1, continuation);
            this.f74410OooOo0o = oooO0o;
            this.f74409OooOo = jsonObject;
        }

        @Override // oO00ooo.AbstractC32477OooO00o
        public final Continuation<C32460OooOooO> create(Continuation<?> continuation) {
            return new OooO00o(this.f74410OooOo0o, this.f74409OooOo, continuation);
        }

        @Override // oO0O000o.InterfaceC32507OooOO0o
        public final Object invoke(Continuation<? super C32460OooOooO> continuation) {
            return ((OooO00o) create(continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
        }

        /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
        /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
        /* JADX WARN: Removed duplicated region for block: B:116:0x0164  */
        /* JADX WARN: Removed duplicated region for block: B:24:0x005d  */
        /* JADX WARN: Removed duplicated region for block: B:84:0x0107  */
        @Override // oO00ooo.AbstractC32477OooO00o
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            int i;
            int i2;
            EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
            C32446OooOOOo.OooO0O0(obj);
            JsonObject jsonObject = this.f74409OooOo;
            OooOOO0.OooO0Oo(jsonObject);
            JsonElement jsonElement = jsonObject.get("audio_source");
            String asString = jsonElement != null ? jsonElement.getAsString() : null;
            int i3 = 9;
            if (asString != null) {
                switch (asString.hashCode()) {
                    case -2032180703:
                        i = !asString.equals("DEFAULT") ? 6 : 0;
                        break;
                    case -1909881542:
                        if (asString.equals("CAMCORDER")) {
                            i = 5;
                            break;
                        }
                        break;
                    case -1106976669:
                        if (asString.equals("VOICE_PERFORMANCE") && Build.VERSION.SDK_INT >= 29) {
                            i = 10;
                            break;
                        }
                        break;
                    case -1000727189:
                        if (asString.equals("VOICE_CALL")) {
                            i = 4;
                            break;
                        }
                        break;
                    case 76327:
                        if (asString.equals("MIC")) {
                            i = 1;
                            break;
                        }
                        break;
                    case 90505257:
                        if (asString.equals("VOICE_DOWNLINK")) {
                            i = 3;
                            break;
                        }
                        break;
                    case 813780970:
                        asString.equals("VOICE_RECOGNITION");
                        break;
                    case 903022818:
                        if (asString.equals("VOICE_UPLINK")) {
                            i = 2;
                            break;
                        }
                        break;
                    case 1126640821:
                        if (asString.equals("UNPROCESSED")) {
                            i = 9;
                            break;
                        }
                        break;
                    case 1331256137:
                        if (asString.equals("VOICE_COMMUNICATION")) {
                            i = 7;
                            break;
                        }
                        break;
                }
            }
            JsonElement jsonElement2 = jsonObject.get("output_format");
            String asString2 = jsonElement2 != null ? jsonElement2.getAsString() : null;
            if (asString2 != null) {
                switch (asString2.hashCode()) {
                    case -2014514182:
                        asString2.equals("MPEG_4");
                        break;
                    case -813934554:
                        i3 = !asString2.equals("MPEG_2_TS") ? 2 : 8;
                        break;
                    case 78191:
                        if (asString2.equals("OGG") && Build.VERSION.SDK_INT >= 29) {
                            i3 = 11;
                            break;
                        }
                        break;
                    case 2660249:
                        if (!asString2.equals("WEBM")) {
                        }
                        break;
                    case 1179611262:
                        if (asString2.equals("AAC_ADTS")) {
                            i3 = 6;
                            break;
                        }
                        break;
                    case 1228866118:
                        if (asString2.equals("THREE_GPP")) {
                            i3 = 1;
                            break;
                        }
                        break;
                    case 1934542573:
                        if (asString2.equals("AMR_NB")) {
                            i3 = 3;
                            break;
                        }
                        break;
                    case 1934542852:
                        if (asString2.equals("AMR_WB")) {
                            i3 = 4;
                            break;
                        }
                        break;
                }
            }
            JsonElement jsonElement3 = jsonObject.get("audio_encoder");
            String asString3 = jsonElement3 != null ? jsonElement3.getAsString() : null;
            if (asString3 != null) {
                switch (asString3.hashCode()) {
                    case -2032180703:
                        i2 = !asString3.equals("DEFAULT") ? 3 : 0;
                        break;
                    case -1757393517:
                        if (asString3.equals("VORBIS")) {
                            i2 = 6;
                            break;
                        }
                        break;
                    case -516133279:
                        if (asString3.equals("AAC_ELD")) {
                            i2 = 5;
                            break;
                        }
                        break;
                    case 64547:
                        asString3.equals("AAC");
                        break;
                    case 2433087:
                        if (asString3.equals("OPUS") && Build.VERSION.SDK_INT >= 29) {
                            i2 = 7;
                            break;
                        }
                        break;
                    case 1934542573:
                        if (asString3.equals("AMR_NB")) {
                            i2 = 1;
                            break;
                        }
                        break;
                    case 1934542852:
                        if (asString3.equals("AMR_WB")) {
                            i2 = 2;
                            break;
                        }
                        break;
                    case 2127916513:
                        if (asString3.equals("HE_AAC")) {
                            i2 = 4;
                            break;
                        }
                        break;
                }
            }
            JsonElement jsonElement4 = jsonObject.get("audio_channels");
            int asInt = jsonElement4 != null ? jsonElement4.getAsInt() : 2;
            JsonElement jsonElement5 = jsonObject.get("audio_sampling_rate");
            int asInt2 = jsonElement5 != null ? jsonElement5.getAsInt() : 44100;
            JsonElement jsonElement6 = jsonObject.get("audio_encoding_bitrate");
            this.f74410OooOo0o.f74256Oooo0o = new OooO0o.OooO0OO(i, i3, i2, asInt, asInt2, jsonElement6 != null ? jsonElement6.getAsInt() : 64000);
            return C32460OooOooO.f116667OooO00o;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C23420OooO0oo(OooO0o oooO0o, Continuation<? super C23420OooO0oo> continuation) {
        super(2, continuation);
        this.f74407OooOo = oooO0o;
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
        return new C23420OooO0oo(this.f74407OooOo, continuation);
    }

    @Override // oO0O000o.InterfaceC32508OooOOOo
    public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super C32460OooOooO> continuation) {
        return ((C23420OooO0oo) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Object invokeSuspend(Object obj) {
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i = this.f74408OooOo0o;
        if (i == 0) {
            C32446OooOOOo.OooO0O0(obj);
            OooO0o oooO0o = this.f74407OooOo;
            String valueAsString = oooO0o.f74225OooO0oO.f95374OooO00o.getValueAsString("rconfig_recorder_config");
            C34406OooO00o.C20358OooO00o c20358OooO00o = C34406OooO00o.f123390OooO00o;
            c20358OooO00o.OooOOO0("MediaToolbarViewModel");
            c20358OooO00o.OooO0o0("fetchRemoteConfig. jsonString: ".concat(valueAsString), new Object[0]);
            if (valueAsString.length() == 0) {
                c20358OooO00o.OooOOO0("MediaToolbarViewModel");
                c20358OooO00o.OooO0OO("fetchRemoteConfig. jsonString is null or empty. ".concat(valueAsString), new Object[0]);
                return C32460OooOooO.f116667OooO00o;
            }
            OooO00o oooO00o = new OooO00o(oooO0o, (JsonObject) new Gson().fromJson(valueAsString, JsonObject.class), null);
            this.f74408OooOo0o = 1;
            if (OooO0o.OooOO0o(oooO0o, oooO00o, this) == enumC32485OooO00o) {
                return enumC32485OooO00o;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C32446OooOOOo.OooO0O0(obj);
        }
        return C32460OooOooO.f116667OooO00o;
    }
}
