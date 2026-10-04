package com.orion.notein.p607ui.noteeditor.audio;

import OooOooo.C20785Oooo00o;
import Oooo0oO.C21023OooO0Oo;
import Oooo0oO.o0Oo0oo;
import android.content.Context;
import android.media.MediaMetadataRetriever;
import android.media.MediaPlayer;
import android.media.MediaRecorder;
import android.media.audiofx.Visualizer;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.HandlerThread;
import android.webkit.MimeTypeMap;
import androidx.core.os.BundleKt;
import androidx.lifecycle.AbstractC22019Ooooooo;
import androidx.lifecycle.o0OoOo0;
import com.aspose.slides.internal.p332p7.C22237OooO0o0;
import com.aspose.words.StyleIdentifier;
import com.orion.notein.domain.models.note.AudioFile;
import com.orion.notein.domain.models.note.AudioSyncRecord;
import com.orion.notein.domain.models.note.NoteAudioFileIdsField;
import com.orion.notein.p607ui.noteeditor.audio.AbstractC23397OooO0Oo;
import com.orion.notein.p607ui.noteeditor.audio.AbstractC23415OooO0o0;
import com.orion.notein.p607ui.noteeditor.audio.OooO0O0;
import com.orion.notein.p607ui.noteeditor.audio.OooO0OO;
import com.orion.notein.ui.noteeditor.audio.OooO0o.OooOOOO;
import java.io.File;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Set;
import java.util.UUID;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import o0000oOO.AbstractC24338OooO0o0;
import o0000oOO.C24340OooO0oo;
import o000oooo.C24761OooO;
import o00o00O0.C25252OooO0Oo;
import o00o00Oo.C25261OooO0o0;
import o0OOo0o.o00000O;
import o0OOo0oO.C27610OooO0o0;
import o0OoO0oo.C28692OooO0oo;
import o0OoOOo.C29147OooOo0;
import o0OoOOo.C29151OooOoO0;
import o0OoOOo.C29152OooOoOO;
import o0OoOOo.C29154OooOoo0;
import o0OoOOo.C29157Oooo;
import o0OoOOo.C29158Oooo00O;
import o0OoOOo.C29159Oooo00o;
import o0OoOOo.C29160Oooo0O0;
import o0OoOOo.C29161Oooo0OO;
import o0OoOOo.C29162Oooo0o;
import o0OoOOo.C29163Oooo0o0;
import o0OoOOo.C29166OoooO;
import o0OoOOo.C29168OoooO00;
import o0OoOOo.C29169OoooO0O;
import o0OoOOo.C29170OoooOO0;
import o0OoOOo.C29172OoooOOo;
import o0OoOOo.C29173OoooOo0;
import o0OoOOo.C29176Ooooo00;
import o0OoOOo.C29180OooooOo;
import o0OoOOo.Oooo0;
import o0OoOOo.Oooo000;
import o0OoOo.C29194OooO00o;
import o0OoOo.C29195OooO0O0;
import o0OoOo.C29196OooO0OO;
import o0OoOo.C29197OooO0Oo;
import o0oo000O.C31190OooO0oo;
import o0oo0o.InterfaceC31284OooO0O0;
import oO00ooO.C32442OooOO0o;
import oO00ooO.C32443OooOOO;
import oO00ooO.C32446OooOOOo;
import oO00ooO.C32460OooOooO;
import oO00ooo.AbstractC32476OooO;
import oO00ooo.AbstractC32479OooO0OO;
import oO00ooo.InterfaceC32482OooO0o0;
import oO00ooo0.EnumC32485OooO00o;
import oO0O000.C32501OooO0oO;
import oO0O000o.InterfaceC32507OooOO0o;
import oO0O000o.InterfaceC32508OooOOOo;
import oO0O000o.InterfaceC32510OooOOo0;
import oO0O000o.InterfaceC32511OooOOoo;
import oO0o0O0o.C33596OooOOo0;
import oO0o0OO.C33609OooO0oo;
import oO0o0OO.C33633Oooo0;
import oO0o0OO.C33644OoooO0;
import oO0o0OO.C33649OoooOOo;
import oO0o0OO.InterfaceC33636Oooo00o;
import oO0o0OO.o00000OO;
import oO0o0Oo.C33716OooO;
import oO0o0Oo.C33763OoooOOO;
import oO0o0Oo.C33768Ooooo00;
import oO0o0Oo.C33769Ooooo0o;
import oO0o0Oo.C33772OooooOo;
import oO0o0Oo.C33773Oooooo;
import oO0o0Oo.C33779o00Oo0;
import oO0o0Oo.C33781o00o0O;
import oO0o0Oo.C33784o00ooo;
import oO0o0Oo.InterfaceC33721OooO0o;
import oO0o0Oo.InterfaceC33723OooO0oO;
import oO0o0Oo.InterfaceC33788ooOO;
import oO0o0OoO.C33799OooOO0O;
import oO0o0Ooo.C33822OooO0OO;
import oO0o0o0o.C33874OooO0OO;
import oO0o0o0o.ExecutorC33873OooO0O0;
import oO0o0oOo.C33898OooO0Oo;
import oO0o0oOo.C33900OooO0o0;
import oO0o0oOo.InterfaceC33895OooO00o;
import oOO00oo.C34406OooO00o;
import oOo000Oo.C34428OooOOo;
import oOo000Oo.C34429OooOOo0;
import oOo000Oo.C34434OooOoO;
import oOo000Oo.C34438OooOoo0;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(m80611d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001:\u0002\u0002\u0003¨\u0006\u0004"}, m80612d2 = {"Lcom/orion/notein/ui/noteeditor/audio/OooO0o;", "Landroidx/lifecycle/Ooooooo;", "OooO0O0", "OooO0OO", "app_google_playRelease"}, m80613k = 1, m80614mv = {2, 1, 0}, m80616xi = 48)
public final class OooO0o extends AbstractC22019Ooooooo {

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    public final C33781o00o0O f74221OooO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final Context f74222OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final C27610OooO0o0 f74223OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final o0000o0O.OooOO0<AbstractC24338OooO0o0> f74224OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final o00000O f74225OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public MediaPlayer f74226OooO0oo;

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    public final C33781o00o0O f74227OooOO0;

    /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
    public MediaRecorder f74228OooOO0O;

    /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
    public final C33781o00o0O f74229OooOO0o;

    /* JADX INFO: renamed from: OooOOO, reason: collision with root package name */
    public final C33781o00o0O f74230OooOOO;

    /* JADX INFO: renamed from: OooOOO0, reason: collision with root package name */
    public final C33781o00o0O f74231OooOOO0;

    /* JADX INFO: renamed from: OooOOOO, reason: collision with root package name */
    public final C33769Ooooo0o f74232OooOOOO;

    /* JADX INFO: renamed from: OooOOOo, reason: collision with root package name */
    public final C33769Ooooo0o f74233OooOOOo;

    /* JADX INFO: renamed from: OooOOo, reason: collision with root package name */
    public final C33781o00o0O f74234OooOOo;

    /* JADX INFO: renamed from: OooOOo0, reason: collision with root package name */
    public final C33781o00o0O f74235OooOOo0;

    /* JADX INFO: renamed from: OooOOoo, reason: collision with root package name */
    public final C33781o00o0O f74236OooOOoo;

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final C33769Ooooo0o f74237OooOo;

    /* JADX INFO: renamed from: OooOo0, reason: collision with root package name */
    public final C33781o00o0O f74238OooOo0;

    /* JADX INFO: renamed from: OooOo00, reason: collision with root package name */
    public final C33769Ooooo0o f74239OooOo00;

    /* JADX INFO: renamed from: OooOo0O, reason: collision with root package name */
    public final C33781o00o0O f74240OooOo0O;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final C33781o00o0O f74241OooOo0o;

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public final C33769Ooooo0o f74242OooOoO;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public final C33769Ooooo0o f74243OooOoO0;

    /* JADX INFO: renamed from: OooOoOO, reason: collision with root package name */
    public final C33769Ooooo0o f74244OooOoOO;

    /* JADX INFO: renamed from: OooOoo, reason: collision with root package name */
    public final C33781o00o0O f74245OooOoo;

    /* JADX INFO: renamed from: OooOoo0, reason: collision with root package name */
    public final C33781o00o0O f74246OooOoo0;

    /* JADX INFO: renamed from: OooOooO, reason: collision with root package name */
    public final C33781o00o0O f74247OooOooO;

    /* JADX INFO: renamed from: OooOooo, reason: collision with root package name */
    public final C33769Ooooo0o f74248OooOooo;

    /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
    public final C33772OooooOo f74249Oooo;

    /* JADX INFO: renamed from: Oooo0, reason: collision with root package name */
    public final C33768Ooooo00 f74250Oooo0;

    /* JADX INFO: renamed from: Oooo000, reason: collision with root package name */
    public final C33898OooO0Oo f74251Oooo000;

    /* JADX INFO: renamed from: Oooo00O, reason: collision with root package name */
    public final C33898OooO0Oo f74252Oooo00O;

    /* JADX INFO: renamed from: Oooo00o, reason: collision with root package name */
    public final C33772OooooOo f74253Oooo00o;

    /* JADX INFO: renamed from: Oooo0O0, reason: collision with root package name */
    public o00000OO f74254Oooo0O0;

    /* JADX INFO: renamed from: Oooo0OO, reason: collision with root package name */
    public Visualizer f74255Oooo0OO;

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public OooO0OO f74256Oooo0o;

    /* JADX INFO: renamed from: Oooo0o0, reason: collision with root package name */
    public o00000OO f74257Oooo0o0;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    public final HandlerThread f74258Oooo0oO;

    /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
    public final Handler f74259Oooo0oo;

    /* JADX INFO: renamed from: OoooO0, reason: collision with root package name */
    public final RunnableC23408OooOOo0 f74260OoooO0;

    /* JADX INFO: renamed from: OoooO00, reason: collision with root package name */
    public final C33768Ooooo00 f74261OoooO00;

    /* JADX INFO: renamed from: OoooO0O, reason: collision with root package name */
    public static final AbstractC24338OooO0o0.OooO00o<Float> f74218OoooO0O = C24340OooO0oo.OooO0O0("playback_speed");

    /* JADX INFO: renamed from: OoooO, reason: collision with root package name */
    public static final List<Float> f74217OoooO = C34429OooOOo0.OooOO0o(Float.valueOf(0.7f), Float.valueOf(1.0f), Float.valueOf(1.25f), Float.valueOf(1.5f), Float.valueOf(2.0f));

    /* JADX INFO: renamed from: OoooOO0, reason: collision with root package name */
    public static final List<Float> f74219OoooOO0 = C34429OooOOo0.OooOO0o(Float.valueOf(0.2f), Float.valueOf(0.4f), Float.valueOf(0.6f), Float.valueOf(0.8f), Float.valueOf(0.6f), Float.valueOf(0.4f), Float.valueOf(0.2f));

    /* JADX INFO: renamed from: o000oOoO, reason: collision with root package name */
    public static final long f74220o000oOoO = 180000;

    @InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.noteeditor.audio.NoteAudioViewModel$audioFileVOList$1", m80623f = "NoteAudioViewModel.kt", m80624l = {}, m80625m = "invokeSuspend")
    public static final class OooO extends AbstractC32476OooO implements oO0O000o.OooOo00<List<? extends OooO0O0>, String, com.orion.notein.p607ui.noteeditor.audio.OooO0OO, Set<? extends String>, Boolean, Continuation<? super List<? extends C29196OooO0OO>>, Object> {

        /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
        public /* synthetic */ String f74262OooOo;

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public /* synthetic */ List f74263OooOo0o;

        /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
        public /* synthetic */ Set f74264OooOoO;

        /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
        public /* synthetic */ com.orion.notein.p607ui.noteeditor.audio.OooO0OO f74265OooOoO0;

        /* JADX INFO: renamed from: OooOoOO, reason: collision with root package name */
        public /* synthetic */ boolean f74266OooOoOO;

        public OooO(Continuation<? super OooO> continuation) {
            super(6, continuation);
        }

        @Override // oO0O000o.OooOo00
        public final Object Oooo0OO(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Serializable serializable) {
            boolean zBooleanValue = ((Boolean) obj5).booleanValue();
            OooO oooO = new OooO((Continuation) serializable);
            oooO.f74263OooOo0o = (List) obj;
            oooO.f74262OooOo = (String) obj2;
            oooO.f74265OooOoO0 = (com.orion.notein.p607ui.noteeditor.audio.OooO0OO) obj3;
            oooO.f74264OooOoO = (Set) obj4;
            oooO.f74266OooOoOO = zBooleanValue;
            return oooO.invokeSuspend(C32460OooOooO.f116667OooO00o);
        }

        @Override // oO00ooo.AbstractC32477OooO00o
        public final Object invokeSuspend(Object obj) {
            EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
            C32446OooOOOo.OooO0O0(obj);
            List list = this.f74263OooOo0o;
            String str = this.f74262OooOo;
            com.orion.notein.p607ui.noteeditor.audio.OooO0OO oooO0OO = this.f74265OooOoO0;
            Set set = this.f74264OooOoO;
            boolean z = this.f74266OooOoOO;
            List list2 = list;
            ArrayList arrayList = new ArrayList(C34428OooOOo.OooOOoo(list2, 10));
            Iterator it = list2.iterator();
            while (it.hasNext()) {
                AudioFile audioFile = ((OooO0O0) it.next()).f74277OooO00o;
                boolean zContains = z ? set.contains(audioFile.getId()) : kotlin.jvm.internal.OooOOO0.OooO0O0(audioFile.getId(), str);
                boolean z2 = kotlin.jvm.internal.OooOOO0.OooO0O0(audioFile.getId(), str) && (oooO0OO instanceof OooO0OO.C23396OooO0oo);
                String id = audioFile.getId();
                String audioName = audioFile.getAudioName();
                long duration = audioFile.getDuration();
                long creationTime = audioFile.getCreationTime();
                List<Float> list3 = OooO0o.f74219OoooOO0;
                if (!z2) {
                    list3 = null;
                }
                ArrayList arrayList2 = arrayList;
                arrayList2.add(new C29196OooO0OO(id, audioName, duration, creationTime, z2, zContains, z, list3));
                arrayList = arrayList2;
            }
            return arrayList;
        }
    }

    @InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.noteeditor.audio.NoteAudioViewModel$1", m80623f = "NoteAudioViewModel.kt", m80624l = {}, m80625m = "invokeSuspend")
    public static final class OooO00o extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super C32460OooOooO>, Object> {

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public /* synthetic */ Object f74268OooOo0o;

        /* JADX INFO: renamed from: com.orion.notein.ui.noteeditor.audio.OooO0o$OooO00o$OooO00o, reason: collision with other inner class name */
        @InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.noteeditor.audio.NoteAudioViewModel$1$1", m80623f = "NoteAudioViewModel.kt", m80624l = {StyleIdentifier.GRID_TABLE_6_COLORFUL_ACCENT_5}, m80625m = "invokeSuspend")
        public static final class C19284OooO00o extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super C32460OooOooO>, Object> {

            /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
            public final /* synthetic */ OooO0o f74269OooOo;

            /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
            public int f74270OooOo0o;

            /* JADX INFO: renamed from: com.orion.notein.ui.noteeditor.audio.OooO0o$OooO00o$OooO00o$OooO00o, reason: collision with other inner class name */
            @InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.noteeditor.audio.NoteAudioViewModel$1$1$1", m80623f = "NoteAudioViewModel.kt", m80624l = {}, m80625m = "invokeSuspend")
            public static final class C19285OooO00o extends AbstractC32476OooO implements InterfaceC32508OooOOOo<com.orion.notein.p607ui.noteeditor.audio.OooO0OO, Continuation<? super C32460OooOooO>, Object> {

                /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
                public final /* synthetic */ OooO0o f74271OooOo;

                /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
                public /* synthetic */ Object f74272OooOo0o;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public C19285OooO00o(OooO0o oooO0o, Continuation<? super C19285OooO00o> continuation) {
                    super(2, continuation);
                    this.f74271OooOo = oooO0o;
                }

                @Override // oO00ooo.AbstractC32477OooO00o
                public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
                    C19285OooO00o c19285OooO00o = new C19285OooO00o(this.f74271OooOo, continuation);
                    c19285OooO00o.f74272OooOo0o = obj;
                    return c19285OooO00o;
                }

                @Override // oO0O000o.InterfaceC32508OooOOOo
                public final Object invoke(com.orion.notein.p607ui.noteeditor.audio.OooO0OO oooO0OO, Continuation<? super C32460OooOooO> continuation) {
                    return ((C19285OooO00o) create(oooO0OO, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
                }

                @Override // oO00ooo.AbstractC32477OooO00o
                public final Object invokeSuspend(Object obj) {
                    EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
                    C32446OooOOOo.OooO0O0(obj);
                    com.orion.notein.p607ui.noteeditor.audio.OooO0OO oooO0OO = (com.orion.notein.p607ui.noteeditor.audio.OooO0OO) this.f74272OooOo0o;
                    C34406OooO00o.C20358OooO00o c20358OooO00o = C34406OooO00o.f123390OooO00o;
                    c20358OooO00o.OooOOO0("MediaToolbarViewModel");
                    c20358OooO00o.OooO00o("mediaPlayerState: ".concat(oooO0OO.f74205OooO00o), new Object[0]);
                    boolean z = oooO0OO instanceof OooO0OO.C23396OooO0oo;
                    OooO0o oooO0o = this.f74271OooOo;
                    if (z) {
                        AbstractC24338OooO0o0.OooO00o<Float> oooO00o = OooO0o.f74218OoooO0O;
                        oooO0o.Oooo00o();
                        o00000OO o00000ooOooO0OO = C33609OooO0oo.OooO0OO(o0OoOo0.OooO00o(oooO0o), null, null, new C29168OoooO00(oooO0o, null), 3);
                        o00000ooOooO0OO.invokeOnCompletion(new C29151OooOoO0(oooO0o, 0));
                        oooO0o.f74254Oooo0O0 = o00000ooOooO0OO;
                    } else {
                        AbstractC24338OooO0o0.OooO00o<Float> oooO00o2 = OooO0o.f74218OoooO0O;
                        oooO0o.Oooo00o();
                    }
                    return C32460OooOooO.f116667OooO00o;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C19284OooO00o(OooO0o oooO0o, Continuation<? super C19284OooO00o> continuation) {
                super(2, continuation);
                this.f74269OooOo = oooO0o;
            }

            @Override // oO00ooo.AbstractC32477OooO00o
            public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
                return new C19284OooO00o(this.f74269OooOo, continuation);
            }

            @Override // oO0O000o.InterfaceC32508OooOOOo
            public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super C32460OooOooO> continuation) {
                return ((C19284OooO00o) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
            }

            @Override // oO00ooo.AbstractC32477OooO00o
            public final Object invokeSuspend(Object obj) {
                EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
                int i = this.f74270OooOo0o;
                if (i == 0) {
                    C32446OooOOOo.OooO0O0(obj);
                    OooO0o oooO0o = this.f74269OooOo;
                    C33781o00o0O c33781o00o0O = oooO0o.f74221OooO;
                    C19285OooO00o c19285OooO00o = new C19285OooO00o(oooO0o, null);
                    this.f74270OooOo0o = 1;
                    if (C25252OooO0Oo.OooO0oO(c33781o00o0O, c19285OooO00o, this) == enumC32485OooO00o) {
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

        @InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.noteeditor.audio.NoteAudioViewModel$1$2", m80623f = "NoteAudioViewModel.kt", m80624l = {StyleIdentifier.LIST_TABLE_2}, m80625m = "invokeSuspend")
        public static final class OooO0O0 extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super C32460OooOooO>, Object> {

            /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
            public final /* synthetic */ OooO0o f74273OooOo;

            /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
            public int f74274OooOo0o;

            /* JADX INFO: renamed from: com.orion.notein.ui.noteeditor.audio.OooO0o$OooO00o$OooO0O0$OooO00o, reason: collision with other inner class name */
            @InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.noteeditor.audio.NoteAudioViewModel$1$2$1", m80623f = "NoteAudioViewModel.kt", m80624l = {}, m80625m = "invokeSuspend")
            public static final class C19286OooO00o extends AbstractC32476OooO implements InterfaceC32508OooOOOo<AbstractC23415OooO0o0, Continuation<? super C32460OooOooO>, Object> {

                /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
                public final /* synthetic */ OooO0o f74275OooOo;

                /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
                public /* synthetic */ Object f74276OooOo0o;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public C19286OooO00o(OooO0o oooO0o, Continuation<? super C19286OooO00o> continuation) {
                    super(2, continuation);
                    this.f74275OooOo = oooO0o;
                }

                @Override // oO00ooo.AbstractC32477OooO00o
                public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
                    C19286OooO00o c19286OooO00o = new C19286OooO00o(this.f74275OooOo, continuation);
                    c19286OooO00o.f74276OooOo0o = obj;
                    return c19286OooO00o;
                }

                @Override // oO0O000o.InterfaceC32508OooOOOo
                public final Object invoke(AbstractC23415OooO0o0 abstractC23415OooO0o0, Continuation<? super C32460OooOooO> continuation) {
                    return ((C19286OooO00o) create(abstractC23415OooO0o0, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
                }

                @Override // oO00ooo.AbstractC32477OooO00o
                public final Object invokeSuspend(Object obj) {
                    EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
                    C32446OooOOOo.OooO0O0(obj);
                    AbstractC23415OooO0o0 abstractC23415OooO0o0 = (AbstractC23415OooO0o0) this.f74276OooOo0o;
                    C34406OooO00o.C20358OooO00o c20358OooO00o = C34406OooO00o.f123390OooO00o;
                    c20358OooO00o.OooOOO0("MediaToolbarViewModel");
                    c20358OooO00o.OooO00o("mediaRecorderState: ".concat(abstractC23415OooO0o0.f74390OooO00o), new Object[0]);
                    boolean z = abstractC23415OooO0o0 instanceof AbstractC23415OooO0o0.C23417OooO0oO;
                    OooO0o oooO0o = this.f74275OooOo;
                    if (z) {
                        o00000OO o00000oo2 = oooO0o.f74257Oooo0o0;
                        if (o00000oo2 == null || !o00000oo2.isActive()) {
                            oooO0o.f74257Oooo0o0 = C33609OooO0oo.OooO0OO(o0OoOo0.OooO00o(oooO0o), null, null, new C29166OoooO(oooO0o, null), 3);
                        }
                    } else {
                        AbstractC24338OooO0o0.OooO00o<Float> oooO00o = OooO0o.f74218OoooO0O;
                        oooO0o.Oooo0OO();
                    }
                    return C32460OooOooO.f116667OooO00o;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public OooO0O0(OooO0o oooO0o, Continuation<? super OooO0O0> continuation) {
                super(2, continuation);
                this.f74273OooOo = oooO0o;
            }

            @Override // oO00ooo.AbstractC32477OooO00o
            public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
                return new OooO0O0(this.f74273OooOo, continuation);
            }

            @Override // oO0O000o.InterfaceC32508OooOOOo
            public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super C32460OooOooO> continuation) {
                return ((OooO0O0) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
            }

            @Override // oO00ooo.AbstractC32477OooO00o
            public final Object invokeSuspend(Object obj) {
                EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
                int i = this.f74274OooOo0o;
                if (i == 0) {
                    C32446OooOOOo.OooO0O0(obj);
                    OooO0o oooO0o = this.f74273OooOo;
                    C33781o00o0O c33781o00o0O = oooO0o.f74229OooOO0o;
                    C19286OooO00o c19286OooO00o = new C19286OooO00o(oooO0o, null);
                    this.f74274OooOo0o = 1;
                    if (C25252OooO0Oo.OooO0oO(c33781o00o0O, c19286OooO00o, this) == enumC32485OooO00o) {
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

        public OooO00o(Continuation<? super OooO00o> continuation) {
            super(2, continuation);
        }

        @Override // oO00ooo.AbstractC32477OooO00o
        public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
            OooO00o oooO00o = OooO0o.this.new OooO00o(continuation);
            oooO00o.f74268OooOo0o = obj;
            return oooO00o;
        }

        @Override // oO0O000o.InterfaceC32508OooOOOo
        public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super C32460OooOooO> continuation) {
            return ((OooO00o) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
        }

        @Override // oO00ooo.AbstractC32477OooO00o
        public final Object invokeSuspend(Object obj) {
            EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
            C32446OooOOOo.OooO0O0(obj);
            InterfaceC33636Oooo00o interfaceC33636Oooo00o = (InterfaceC33636Oooo00o) this.f74268OooOo0o;
            OooO0o oooO0o = OooO0o.this;
            C33609OooO0oo.OooO0OO(interfaceC33636Oooo00o, null, null, new C19284OooO00o(oooO0o, null), 3);
            C33609OooO0oo.OooO0OO(interfaceC33636Oooo00o, null, null, new OooO0O0(oooO0o, null), 3);
            return C32460OooOooO.f116667OooO00o;
        }
    }

    public static final class OooO0O0 {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final AudioFile f74277OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public final String f74278OooO0O0;

        public OooO0O0(AudioFile audioFile, String noteId) {
            kotlin.jvm.internal.OooOOO0.OooO0oO(audioFile, "audioFile");
            kotlin.jvm.internal.OooOOO0.OooO0oO(noteId, "noteId");
            this.f74277OooO00o = audioFile;
            this.f74278OooO0O0 = noteId;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof OooO0O0)) {
                return false;
            }
            OooO0O0 oooO0O0 = (OooO0O0) obj;
            return kotlin.jvm.internal.OooOOO0.OooO0O0(this.f74277OooO00o, oooO0O0.f74277OooO00o) && kotlin.jvm.internal.OooOOO0.OooO0O0(this.f74278OooO0O0, oooO0O0.f74278OooO0O0);
        }

        public final int hashCode() {
            return this.f74278OooO0O0.hashCode() + (this.f74277OooO00o.hashCode() * 31);
        }

        public final String toString() {
            return "AudioFileWithNoteId(audioFile=" + this.f74277OooO00o + ", noteId=" + this.f74278OooO0O0 + ")";
        }
    }

    public static final class OooO0OO {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final int f74279OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public final int f74280OooO0O0;

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        public final int f74281OooO0OO;

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final int f74282OooO0Oo;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public final int f74283OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final int f74284OooO0o0;

        public OooO0OO() {
            this(0);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof OooO0OO)) {
                return false;
            }
            OooO0OO oooO0OO = (OooO0OO) obj;
            return this.f74279OooO00o == oooO0OO.f74279OooO00o && this.f74280OooO0O0 == oooO0OO.f74280OooO0O0 && this.f74281OooO0OO == oooO0OO.f74281OooO0OO && this.f74282OooO0Oo == oooO0OO.f74282OooO0Oo && this.f74284OooO0o0 == oooO0OO.f74284OooO0o0 && this.f74283OooO0o == oooO0OO.f74283OooO0o;
        }

        public final int hashCode() {
            return Integer.hashCode(this.f74283OooO0o) + C20785Oooo00o.OooO00o(this.f74284OooO0o0, C20785Oooo00o.OooO00o(this.f74282OooO0Oo, C20785Oooo00o.OooO00o(this.f74281OooO0OO, C20785Oooo00o.OooO00o(this.f74280OooO0O0, Integer.hashCode(this.f74279OooO00o) * 31, 31), 31), 31), 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("RecorderConfig(audioSource=");
            sb.append(this.f74279OooO00o);
            sb.append(", outputFormat=");
            sb.append(this.f74280OooO0O0);
            sb.append(", audioEncoder=");
            sb.append(this.f74281OooO0OO);
            sb.append(", audioChannels=");
            sb.append(this.f74282OooO0Oo);
            sb.append(", audioSamplingRate=");
            sb.append(this.f74284OooO0o0);
            sb.append(", audioEncodingBitrate=");
            return C21023OooO0Oo.OooO0OO(")", this.f74283OooO0o, sb);
        }

        public /* synthetic */ OooO0OO(int i) {
            this(6, 2, 3, 2, 44100, 64000);
        }

        public OooO0OO(int i, int i2, int i3, int i4, int i5, int i6) {
            this.f74279OooO00o = i;
            this.f74280OooO0O0 = i2;
            this.f74281OooO0OO = i3;
            this.f74282OooO0Oo = i4;
            this.f74284OooO0o0 = i5;
            this.f74283OooO0o = i6;
        }
    }

    /* JADX INFO: renamed from: com.orion.notein.ui.noteeditor.audio.OooO0o$OooO0Oo, reason: case insensitive filesystem */
    @InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.noteeditor.audio.NoteAudioViewModel$_activeAudioFile$1", m80623f = "NoteAudioViewModel.kt", m80624l = {}, m80625m = "invokeSuspend")
    public static final class C23401OooO0Oo extends AbstractC32476OooO implements InterfaceC32510OooOOo0<List<? extends OooO0O0>, String, Continuation<? super OooO0O0>, Object> {

        /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
        public /* synthetic */ String f74285OooOo;

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public /* synthetic */ List f74286OooOo0o;

        @Override // oO0O000o.InterfaceC32510OooOOo0
        public final Object invoke(List<? extends OooO0O0> list, String str, Continuation<? super OooO0O0> continuation) {
            C23401OooO0Oo c23401OooO0Oo = new C23401OooO0Oo(3, continuation);
            c23401OooO0Oo.f74286OooOo0o = list;
            c23401OooO0Oo.f74285OooOo = str;
            return c23401OooO0Oo.invokeSuspend(C32460OooOooO.f116667OooO00o);
        }

        @Override // oO00ooo.AbstractC32477OooO00o
        public final Object invokeSuspend(Object obj) {
            EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
            C32446OooOOOo.OooO0O0(obj);
            List list = this.f74286OooOo0o;
            String str = this.f74285OooOo;
            for (Object obj2 : list) {
                if (kotlin.jvm.internal.OooOOO0.OooO0O0(((OooO0O0) obj2).f74277OooO00o.getId(), str)) {
                    return obj2;
                }
            }
            return null;
        }
    }

    /* JADX INFO: renamed from: com.orion.notein.ui.noteeditor.audio.OooO0o$OooO0o, reason: collision with other inner class name */
    @InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.noteeditor.audio.NoteAudioViewModel$activeAudioFileVO$1", m80623f = "NoteAudioViewModel.kt", m80624l = {}, m80625m = "invokeSuspend")
    public static final class C19287OooO0o extends AbstractC32476OooO implements InterfaceC32511OooOOoo<OooO0O0, Integer, List<? extends Float>, com.orion.notein.p607ui.noteeditor.audio.OooO0OO, Continuation<? super C29194OooO00o>, Object> {

        /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
        public /* synthetic */ int f74287OooOo;

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public /* synthetic */ OooO0O0 f74288OooOo0o;

        /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
        public /* synthetic */ com.orion.notein.p607ui.noteeditor.audio.OooO0OO f74289OooOoO;

        /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
        public /* synthetic */ List f74290OooOoO0;

        @Override // oO0O000o.InterfaceC32511OooOOoo
        public final Object Oooo0oO(Object obj, Object obj2, Object obj3, Object obj4, Serializable serializable) {
            int iIntValue = ((Number) obj2).intValue();
            C19287OooO0o c19287OooO0o = new C19287OooO0o(5, (Continuation) serializable);
            c19287OooO0o.f74288OooOo0o = (OooO0O0) obj;
            c19287OooO0o.f74287OooOo = iIntValue;
            c19287OooO0o.f74290OooOoO0 = (List) obj3;
            c19287OooO0o.f74289OooOoO = (com.orion.notein.p607ui.noteeditor.audio.OooO0OO) obj4;
            return c19287OooO0o.invokeSuspend(C32460OooOooO.f116667OooO00o);
        }

        @Override // oO00ooo.AbstractC32477OooO00o
        public final Object invokeSuspend(Object obj) {
            EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
            C32446OooOOOo.OooO0O0(obj);
            OooO0O0 oooO0O0 = this.f74288OooOo0o;
            int i = this.f74287OooOo;
            List list = this.f74290OooOoO0;
            com.orion.notein.p607ui.noteeditor.audio.OooO0OO oooO0OO = this.f74289OooOoO;
            if (oooO0O0 == null) {
                return null;
            }
            AudioFile audioFile = oooO0O0.f74277OooO00o;
            return new C29194OooO00o(audioFile.getId(), audioFile.getAudioName(), i, list, audioFile.getDuration(), audioFile.getCreationTime(), oooO0OO instanceof OooO0OO.C23396OooO0oo, oooO0OO instanceof OooO0OO.OooO0O0);
        }
    }

    /* JADX INFO: renamed from: com.orion.notein.ui.noteeditor.audio.OooO0o$OooO0o0, reason: case insensitive filesystem */
    public static final class C23402OooO0o0 implements InterfaceC33721OooO0o<List<? extends OooO0O0>> {

        /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
        public final /* synthetic */ NoteAudioFileIdsField f74291OooOo;

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public final /* synthetic */ InterfaceC33721OooO0o f74292OooOo0o;

        /* JADX INFO: renamed from: com.orion.notein.ui.noteeditor.audio.OooO0o$OooO0o0$OooO00o */
        public static final class OooO00o<T> implements InterfaceC33723OooO0oO {

            /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
            public final /* synthetic */ NoteAudioFileIdsField f74293OooOo;

            /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
            public final /* synthetic */ InterfaceC33723OooO0oO f74294OooOo0o;

            /* JADX INFO: renamed from: com.orion.notein.ui.noteeditor.audio.OooO0o$OooO0o0$OooO00o$OooO00o, reason: collision with other inner class name */
            @InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.noteeditor.audio.NoteAudioViewModel$_allAudioFiles$lambda$4$$inlined$map$1$2", m80623f = "NoteAudioViewModel.kt", m80624l = {50}, m80625m = "emit")
            public static final class C19288OooO00o extends AbstractC32479OooO0OO {

                /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
                public int f74295OooOo;

                /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
                public /* synthetic */ Object f74296OooOo0o;

                public C19288OooO00o(Continuation continuation) {
                    super(continuation);
                }

                @Override // oO00ooo.AbstractC32477OooO00o
                public final Object invokeSuspend(Object obj) {
                    this.f74296OooOo0o = obj;
                    this.f74295OooOo |= Integer.MIN_VALUE;
                    return OooO00o.this.emit(null, this);
                }
            }

            public OooO00o(InterfaceC33723OooO0oO interfaceC33723OooO0oO, NoteAudioFileIdsField noteAudioFileIdsField) {
                this.f74294OooOo0o = interfaceC33723OooO0oO;
                this.f74293OooOo = noteAudioFileIdsField;
            }

            /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
            @Override // oO0o0Oo.InterfaceC33723OooO0oO
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final Object emit(Object obj, Continuation continuation) {
                C19288OooO00o c19288OooO00o;
                if (continuation instanceof C19288OooO00o) {
                    c19288OooO00o = (C19288OooO00o) continuation;
                    int i = c19288OooO00o.f74295OooOo;
                    if ((i & Integer.MIN_VALUE) != 0) {
                        c19288OooO00o.f74295OooOo = i - Integer.MIN_VALUE;
                    } else {
                        c19288OooO00o = new C19288OooO00o(continuation);
                    }
                }
                Object obj2 = c19288OooO00o.f74296OooOo0o;
                EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
                int i2 = c19288OooO00o.f74295OooOo;
                if (i2 == 0) {
                    C32446OooOOOo.OooO0O0(obj2);
                    List list = (List) obj;
                    ArrayList arrayList = new ArrayList(C34428OooOOo.OooOOoo(list, 10));
                    Iterator<T> it = list.iterator();
                    while (it.hasNext()) {
                        arrayList.add(new OooO0O0((AudioFile) it.next(), this.f74293OooOo.getNoteId()));
                    }
                    c19288OooO00o.f74295OooOo = 1;
                    if (this.f74294OooOo0o.emit(arrayList, c19288OooO00o) == enumC32485OooO00o) {
                        return enumC32485OooO00o;
                    }
                } else {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    C32446OooOOOo.OooO0O0(obj2);
                }
                return C32460OooOooO.f116667OooO00o;
            }
        }

        public C23402OooO0o0(InterfaceC33721OooO0o interfaceC33721OooO0o, NoteAudioFileIdsField noteAudioFileIdsField) {
            this.f74292OooOo0o = interfaceC33721OooO0o;
            this.f74291OooOo = noteAudioFileIdsField;
        }

        @Override // oO0o0Oo.InterfaceC33721OooO0o
        public final Object collect(InterfaceC33723OooO0oO<? super List<? extends OooO0O0>> interfaceC33723OooO0oO, Continuation continuation) {
            Object objCollect = this.f74292OooOo0o.collect(new OooO00o(interfaceC33723OooO0oO, this.f74291OooOo), continuation);
            return objCollect == EnumC32485OooO00o.f116726OooOo0o ? objCollect : C32460OooOooO.f116667OooO00o;
        }
    }

    /* JADX INFO: renamed from: com.orion.notein.ui.noteeditor.audio.OooO0o$OooO0oO, reason: case insensitive filesystem */
    public static final class C23403OooO0oO implements InterfaceC33721OooO0o<List<? extends AudioSyncRecord>> {

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public final /* synthetic */ InterfaceC33721OooO0o f74298OooOo0o;

        /* JADX INFO: renamed from: com.orion.notein.ui.noteeditor.audio.OooO0o$OooO0oO$OooO00o */
        public static final class OooO00o<T> implements InterfaceC33723OooO0oO {

            /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
            public final /* synthetic */ InterfaceC33723OooO0oO f74299OooOo0o;

            /* JADX INFO: renamed from: com.orion.notein.ui.noteeditor.audio.OooO0o$OooO0oO$OooO00o$OooO00o, reason: collision with other inner class name */
            @InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.noteeditor.audio.NoteAudioViewModel$activeAudioSyncRecords$lambda$7$$inlined$map$1$2", m80623f = "NoteAudioViewModel.kt", m80624l = {50}, m80625m = "emit")
            public static final class C19289OooO00o extends AbstractC32479OooO0OO {

                /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
                public int f74300OooOo;

                /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
                public /* synthetic */ Object f74301OooOo0o;

                public C19289OooO00o(Continuation continuation) {
                    super(continuation);
                }

                @Override // oO00ooo.AbstractC32477OooO00o
                public final Object invokeSuspend(Object obj) {
                    this.f74301OooOo0o = obj;
                    this.f74300OooOo |= Integer.MIN_VALUE;
                    return OooO00o.this.emit(null, this);
                }
            }

            public OooO00o(InterfaceC33723OooO0oO interfaceC33723OooO0oO) {
                this.f74299OooOo0o = interfaceC33723OooO0oO;
            }

            /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
            @Override // oO0o0Oo.InterfaceC33723OooO0oO
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final Object emit(Object obj, Continuation continuation) {
                C19289OooO00o c19289OooO00o;
                if (continuation instanceof C19289OooO00o) {
                    c19289OooO00o = (C19289OooO00o) continuation;
                    int i = c19289OooO00o.f74300OooOo;
                    if ((i & Integer.MIN_VALUE) != 0) {
                        c19289OooO00o.f74300OooOo = i - Integer.MIN_VALUE;
                    } else {
                        c19289OooO00o = new C19289OooO00o(continuation);
                    }
                }
                Object obj2 = c19289OooO00o.f74301OooOo0o;
                EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
                int i2 = c19289OooO00o.f74300OooOo;
                if (i2 == 0) {
                    C32446OooOOOo.OooO0O0(obj2);
                    ArrayList arrayList = new ArrayList();
                    for (T t : (List) obj) {
                        if (!((AudioSyncRecord) t).getDeleted()) {
                            arrayList.add(t);
                        }
                    }
                    c19289OooO00o.f74300OooOo = 1;
                    if (this.f74299OooOo0o.emit(arrayList, c19289OooO00o) == enumC32485OooO00o) {
                        return enumC32485OooO00o;
                    }
                } else {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    C32446OooOOOo.OooO0O0(obj2);
                }
                return C32460OooOooO.f116667OooO00o;
            }
        }

        public C23403OooO0oO(InterfaceC33721OooO0o interfaceC33721OooO0o) {
            this.f74298OooOo0o = interfaceC33721OooO0o;
        }

        @Override // oO0o0Oo.InterfaceC33721OooO0o
        public final Object collect(InterfaceC33723OooO0oO<? super List<? extends AudioSyncRecord>> interfaceC33723OooO0oO, Continuation continuation) {
            Object objCollect = this.f74298OooOo0o.collect(new OooO00o(interfaceC33723OooO0oO), continuation);
            return objCollect == EnumC32485OooO00o.f116726OooOo0o ? objCollect : C32460OooOooO.f116667OooO00o;
        }
    }

    /* JADX INFO: renamed from: com.orion.notein.ui.noteeditor.audio.OooO0o$OooO0oo, reason: case insensitive filesystem */
    @InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.noteeditor.audio.NoteAudioViewModel$activeRecordingVO$1", m80623f = "NoteAudioViewModel.kt", m80624l = {}, m80625m = "invokeSuspend")
    public static final class C23404OooO0oo extends AbstractC32476OooO implements InterfaceC32511OooOOoo<String, Integer, Float, AbstractC23415OooO0o0, Continuation<? super C29195OooO0O0>, Object> {

        /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
        public /* synthetic */ int f74303OooOo;

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public /* synthetic */ String f74304OooOo0o;

        /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
        public /* synthetic */ AbstractC23415OooO0o0 f74305OooOoO;

        /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
        public /* synthetic */ float f74306OooOoO0;

        @Override // oO0O000o.InterfaceC32511OooOOoo
        public final Object Oooo0oO(Object obj, Object obj2, Object obj3, Object obj4, Serializable serializable) {
            int iIntValue = ((Number) obj2).intValue();
            float fFloatValue = ((Number) obj3).floatValue();
            C23404OooO0oo c23404OooO0oo = new C23404OooO0oo(5, (Continuation) serializable);
            c23404OooO0oo.f74304OooOo0o = (String) obj;
            c23404OooO0oo.f74303OooOo = iIntValue;
            c23404OooO0oo.f74306OooOoO0 = fFloatValue;
            c23404OooO0oo.f74305OooOoO = (AbstractC23415OooO0o0) obj4;
            return c23404OooO0oo.invokeSuspend(C32460OooOooO.f116667OooO00o);
        }

        @Override // oO00ooo.AbstractC32477OooO00o
        public final Object invokeSuspend(Object obj) {
            EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
            C32446OooOOOo.OooO0O0(obj);
            String str = this.f74304OooOo0o;
            int i = this.f74303OooOo;
            float f = this.f74306OooOoO0;
            AbstractC23415OooO0o0 abstractC23415OooO0o0 = this.f74305OooOoO;
            if (str == null) {
                return null;
            }
            return new C29195OooO0O0(str, f, i, abstractC23415OooO0o0 instanceof AbstractC23415OooO0o0.C23417OooO0oO);
        }
    }

    @InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.noteeditor.audio.NoteAudioViewModel$onCleared$1", m80623f = "NoteAudioViewModel.kt", m80624l = {1299, 1302}, m80625m = "invokeSuspend")
    public static final class OooOO0 extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super C32460OooOooO>, Object> {

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public int f74308OooOo0o;

        @InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.noteeditor.audio.NoteAudioViewModel$onCleared$1$1", m80623f = "NoteAudioViewModel.kt", m80624l = {}, m80625m = "invokeSuspend")
        public static final class OooO00o extends AbstractC32476OooO implements InterfaceC32507OooOO0o<Continuation<? super C32460OooOooO>, Object> {

            /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
            public final /* synthetic */ OooO0o f74309OooOo0o;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public OooO00o(OooO0o oooO0o, Continuation<? super OooO00o> continuation) {
                super(1, continuation);
                this.f74309OooOo0o = oooO0o;
            }

            @Override // oO00ooo.AbstractC32477OooO00o
            public final Continuation<C32460OooOooO> create(Continuation<?> continuation) {
                return new OooO00o(this.f74309OooOo0o, continuation);
            }

            @Override // oO0O000o.InterfaceC32507OooOO0o
            public final Object invoke(Continuation<? super C32460OooOooO> continuation) {
                return ((OooO00o) create(continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
            }

            @Override // oO00ooo.AbstractC32477OooO00o
            public final Object invokeSuspend(Object obj) {
                EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
                C32446OooOOOo.OooO0O0(obj);
                AbstractC24338OooO0o0.OooO00o<Float> oooO00o = OooO0o.f74218OoooO0O;
                this.f74309OooOo0o.OooOo0o();
                return C32460OooOooO.f116667OooO00o;
            }
        }

        @InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.noteeditor.audio.NoteAudioViewModel$onCleared$1$2", m80623f = "NoteAudioViewModel.kt", m80624l = {1303}, m80625m = "invokeSuspend")
        public static final class OooO0O0 extends AbstractC32476OooO implements InterfaceC32507OooOO0o<Continuation<? super C32460OooOooO>, Object> {

            /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
            public final /* synthetic */ OooO0o f74310OooOo;

            /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
            public int f74311OooOo0o;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public OooO0O0(OooO0o oooO0o, Continuation<? super OooO0O0> continuation) {
                super(1, continuation);
                this.f74310OooOo = oooO0o;
            }

            @Override // oO00ooo.AbstractC32477OooO00o
            public final Continuation<C32460OooOooO> create(Continuation<?> continuation) {
                return new OooO0O0(this.f74310OooOo, continuation);
            }

            @Override // oO0O000o.InterfaceC32507OooOO0o
            public final Object invoke(Continuation<? super C32460OooOooO> continuation) {
                return ((OooO0O0) create(continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
            }

            @Override // oO00ooo.AbstractC32477OooO00o
            public final Object invokeSuspend(Object obj) {
                EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
                int i = this.f74311OooOo0o;
                OooO0o oooO0o = this.f74310OooOo;
                if (i == 0) {
                    C32446OooOOOo.OooO0O0(obj);
                    this.f74311OooOo0o = 1;
                    AbstractC24338OooO0o0.OooO00o<Float> oooO00o = OooO0o.f74218OoooO0O;
                    if (oooO0o.Oooo0O0(false, this) == enumC32485OooO00o) {
                        return enumC32485OooO00o;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    C32446OooOOOo.OooO0O0(obj);
                }
                AbstractC24338OooO0o0.OooO00o<Float> oooO00o2 = OooO0o.f74218OoooO0O;
                oooO0o.OooOo();
                return C32460OooOooO.f116667OooO00o;
            }
        }

        public OooOO0(Continuation<? super OooOO0> continuation) {
            super(2, continuation);
        }

        @Override // oO00ooo.AbstractC32477OooO00o
        public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
            return OooO0o.this.new OooOO0(continuation);
        }

        @Override // oO0O000o.InterfaceC32508OooOOOo
        public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super C32460OooOooO> continuation) {
            return ((OooOO0) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
        }

        /* JADX WARN: Code restructure failed: missing block: B:14:0x003d, code lost:
        
            if (com.orion.notein.p607ui.noteeditor.audio.OooO0o.OooOO0o(r3, r7, r6) == r0) goto L15;
         */
        @Override // oO00ooo.AbstractC32477OooO00o
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
            int i = this.f74308OooOo0o;
            OooO0o oooO0o = OooO0o.this;
            if (i == 0) {
                C32446OooOOOo.OooO0O0(obj);
                OooO00o oooO00o = new OooO00o(oooO0o, null);
                this.f74308OooOo0o = 1;
                AbstractC24338OooO0o0.OooO00o<Float> oooO00o2 = OooO0o.f74218OoooO0O;
                if (oooO0o.Oooo0o(oooO00o, this) != enumC32485OooO00o) {
                }
                return enumC32485OooO00o;
            }
            if (i != 1) {
                if (i != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C32446OooOOOo.OooO0O0(obj);
                return C32460OooOooO.f116667OooO00o;
            }
            C32446OooOOOo.OooO0O0(obj);
            OooO0O0 oooO0O0 = new OooO0O0(oooO0o, null);
            this.f74308OooOo0o = 2;
        }
    }

    @InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.noteeditor.audio.NoteAudioViewModel$pauseMediaPlayer$1", m80623f = "NoteAudioViewModel.kt", m80624l = {581}, m80625m = "invokeSuspend")
    public static final class OooOO0O extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super C32460OooOooO>, Object> {

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public int f74313OooOo0o;

        @InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.noteeditor.audio.NoteAudioViewModel$pauseMediaPlayer$1$1", m80623f = "NoteAudioViewModel.kt", m80624l = {586}, m80625m = "invokeSuspend")
        public static final class OooO00o extends AbstractC32476OooO implements InterfaceC32507OooOO0o<Continuation<? super C32460OooOooO>, Object> {

            /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
            public final /* synthetic */ OooO0o f74314OooOo;

            /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
            public int f74315OooOo0o;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public OooO00o(OooO0o oooO0o, Continuation<? super OooO00o> continuation) {
                super(1, continuation);
                this.f74314OooOo = oooO0o;
            }

            @Override // oO00ooo.AbstractC32477OooO00o
            public final Continuation<C32460OooOooO> create(Continuation<?> continuation) {
                return new OooO00o(this.f74314OooOo, continuation);
            }

            @Override // oO0O000o.InterfaceC32507OooOO0o
            public final Object invoke(Continuation<? super C32460OooOooO> continuation) {
                return ((OooO00o) create(continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
            }

            @Override // oO00ooo.AbstractC32477OooO00o
            public final Object invokeSuspend(Object obj) {
                EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
                int i = this.f74315OooOo0o;
                if (i == 0) {
                    C32446OooOOOo.OooO0O0(obj);
                    OooO0o oooO0o = this.f74314OooOo;
                    MediaPlayer mediaPlayer = oooO0o.f74226OooO0oo;
                    if (mediaPlayer == null || !mediaPlayer.isPlaying()) {
                        C34406OooO00o.C20358OooO00o c20358OooO00o = C34406OooO00o.f123390OooO00o;
                        c20358OooO00o.OooOOO0("MediaToolbarViewModel");
                        c20358OooO00o.OooOO0O("pauseMediaPlayer. MediaPlayer is not playing", new Object[0]);
                        return C32460OooOooO.f116667OooO00o;
                    }
                    OooO0O0.OooO0OO oooO0OO = new OooO0O0.OooO0OO(null, "Pause");
                    this.f74315OooOo0o = 1;
                    if (oooO0o.OooOOOo(oooO0OO) == enumC32485OooO00o) {
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

        public OooOO0O(Continuation<? super OooOO0O> continuation) {
            super(2, continuation);
        }

        @Override // oO00ooo.AbstractC32477OooO00o
        public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
            return OooO0o.this.new OooOO0O(continuation);
        }

        @Override // oO0O000o.InterfaceC32508OooOOOo
        public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super C32460OooOooO> continuation) {
            return ((OooOO0O) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
        }

        @Override // oO00ooo.AbstractC32477OooO00o
        public final Object invokeSuspend(Object obj) {
            EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
            int i = this.f74313OooOo0o;
            if (i == 0) {
                C32446OooOOOo.OooO0O0(obj);
                OooO0o oooO0o = OooO0o.this;
                OooO00o oooO00o = new OooO00o(oooO0o, null);
                this.f74313OooOo0o = 1;
                AbstractC24338OooO0o0.OooO00o<Float> oooO00o2 = OooO0o.f74218OoooO0O;
                if (oooO0o.Oooo0o(oooO00o, this) == enumC32485OooO00o) {
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

    /* JADX INFO: renamed from: com.orion.notein.ui.noteeditor.audio.OooO0o$OooOO0o, reason: case insensitive filesystem */
    @InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.noteeditor.audio.NoteAudioViewModel$prepareAudioFile$1", m80623f = "NoteAudioViewModel.kt", m80624l = {1405, 1406}, m80625m = "invokeSuspend")
    public static final class C23405OooOO0o extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super C32460OooOooO>, Object> {

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public int f74317OooOo0o;

        /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
        public final /* synthetic */ boolean f74318OooOoO;

        /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
        public final /* synthetic */ String f74319OooOoO0;

        /* JADX INFO: renamed from: com.orion.notein.ui.noteeditor.audio.OooO0o$OooOO0o$OooO00o */
        @InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.noteeditor.audio.NoteAudioViewModel$prepareAudioFile$1$1", m80623f = "NoteAudioViewModel.kt", m80624l = {1405}, m80625m = "invokeSuspend")
        public static final class OooO00o extends AbstractC32476OooO implements InterfaceC32507OooOO0o<Continuation<? super C32460OooOooO>, Object> {

            /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
            public final /* synthetic */ OooO0o f74320OooOo;

            /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
            public int f74321OooOo0o;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public OooO00o(OooO0o oooO0o, Continuation<? super OooO00o> continuation) {
                super(1, continuation);
                this.f74320OooOo = oooO0o;
            }

            @Override // oO00ooo.AbstractC32477OooO00o
            public final Continuation<C32460OooOooO> create(Continuation<?> continuation) {
                return new OooO00o(this.f74320OooOo, continuation);
            }

            @Override // oO0O000o.InterfaceC32507OooOO0o
            public final Object invoke(Continuation<? super C32460OooOooO> continuation) {
                return ((OooO00o) create(continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
            }

            @Override // oO00ooo.AbstractC32477OooO00o
            public final Object invokeSuspend(Object obj) {
                EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
                int i = this.f74321OooOo0o;
                if (i == 0) {
                    C32446OooOOOo.OooO0O0(obj);
                    this.f74321OooOo0o = 1;
                    AbstractC24338OooO0o0.OooO00o<Float> oooO00o = OooO0o.f74218OoooO0O;
                    if (this.f74320OooOo.Oooo0O0(false, this) == enumC32485OooO00o) {
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

        /* JADX INFO: renamed from: com.orion.notein.ui.noteeditor.audio.OooO0o$OooOO0o$OooO0O0 */
        @InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.noteeditor.audio.NoteAudioViewModel$prepareAudioFile$1$2", m80623f = "NoteAudioViewModel.kt", m80624l = {1407, 1409}, m80625m = "invokeSuspend")
        public static final class OooO0O0 extends AbstractC32476OooO implements InterfaceC32507OooOO0o<Continuation<? super C32460OooOooO>, Object> {

            /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
            public final /* synthetic */ OooO0o f74322OooOo;

            /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
            public int f74323OooOo0o;

            /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
            public final /* synthetic */ boolean f74324OooOoO;

            /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
            public final /* synthetic */ String f74325OooOoO0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public OooO0O0(OooO0o oooO0o, String str, boolean z, Continuation<? super OooO0O0> continuation) {
                super(1, continuation);
                this.f74322OooOo = oooO0o;
                this.f74325OooOoO0 = str;
                this.f74324OooOoO = z;
            }

            @Override // oO00ooo.AbstractC32477OooO00o
            public final Continuation<C32460OooOooO> create(Continuation<?> continuation) {
                return new OooO0O0(this.f74322OooOo, this.f74325OooOoO0, this.f74324OooOoO, continuation);
            }

            @Override // oO0O000o.InterfaceC32507OooOO0o
            public final Object invoke(Continuation<? super C32460OooOooO> continuation) {
                return ((OooO0O0) create(continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
            }

            /* JADX WARN: Code restructure failed: missing block: B:16:0x0039, code lost:
            
                if (com.orion.notein.p607ui.noteeditor.audio.OooO0o.OooO(r3, null, r2, r6) == r0) goto L17;
             */
            @Override // oO00ooo.AbstractC32477OooO00o
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final Object invokeSuspend(Object obj) {
                EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
                int i = this.f74323OooOo0o;
                String str = this.f74325OooOoO0;
                OooO0o oooO0o = this.f74322OooOo;
                if (i == 0) {
                    C32446OooOOOo.OooO0O0(obj);
                    this.f74323OooOo0o = 1;
                    AbstractC24338OooO0o0.OooO00o<Float> oooO00o = OooO0o.f74218OoooO0O;
                    if (oooO0o.OooOo0(str, this) != enumC32485OooO00o) {
                    }
                    return enumC32485OooO00o;
                }
                if (i != 1) {
                    if (i != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    C32446OooOOOo.OooO0O0(obj);
                    return C32460OooOooO.f116667OooO00o;
                }
                C32446OooOOOo.OooO0O0(obj);
                if (this.f74324OooOoO) {
                    this.f74323OooOo0o = 2;
                }
                return C32460OooOooO.f116667OooO00o;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C23405OooOO0o(String str, boolean z, Continuation<? super C23405OooOO0o> continuation) {
            super(2, continuation);
            this.f74319OooOoO0 = str;
            this.f74318OooOoO = z;
        }

        @Override // oO00ooo.AbstractC32477OooO00o
        public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
            return OooO0o.this.new C23405OooOO0o(this.f74319OooOoO0, this.f74318OooOoO, continuation);
        }

        @Override // oO0O000o.InterfaceC32508OooOOOo
        public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super C32460OooOooO> continuation) {
            return ((C23405OooOO0o) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
        }

        /* JADX WARN: Code restructure failed: missing block: B:14:0x0041, code lost:
        
            if (r3.Oooo0o(r7, r6) == r0) goto L15;
         */
        @Override // oO00ooo.AbstractC32477OooO00o
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
            int i = this.f74317OooOo0o;
            OooO0o oooO0o = OooO0o.this;
            if (i == 0) {
                C32446OooOOOo.OooO0O0(obj);
                OooO00o oooO00o = new OooO00o(oooO0o, null);
                this.f74317OooOo0o = 1;
                if (OooO0o.OooOO0o(oooO0o, oooO00o, this) != enumC32485OooO00o) {
                }
                return enumC32485OooO00o;
            }
            if (i != 1) {
                if (i != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C32446OooOOOo.OooO0O0(obj);
                return C32460OooOooO.f116667OooO00o;
            }
            C32446OooOOOo.OooO0O0(obj);
            OooO0O0 oooO0O0 = new OooO0O0(oooO0o, this.f74319OooOoO0, this.f74318OooOoO, null);
            this.f74317OooOo0o = 2;
            AbstractC24338OooO0o0.OooO00o<Float> oooO00o2 = OooO0o.f74218OoooO0O;
        }
    }

    @InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.noteeditor.audio.NoteAudioViewModel$renameAudioFile$1", m80623f = "NoteAudioViewModel.kt", m80624l = {1680}, m80625m = "invokeSuspend")
    public static final class OooOOO extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super C32460OooOooO>, Object> {

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public int f74327OooOo0o;

        /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
        public final /* synthetic */ String f74328OooOoO;

        /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
        public final /* synthetic */ String f74329OooOoO0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooOOO(String str, String str2, Continuation<? super OooOOO> continuation) {
            super(2, continuation);
            this.f74329OooOoO0 = str;
            this.f74328OooOoO = str2;
        }

        @Override // oO00ooo.AbstractC32477OooO00o
        public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
            return OooO0o.this.new OooOOO(this.f74329OooOoO0, this.f74328OooOoO, continuation);
        }

        @Override // oO0O000o.InterfaceC32508OooOOOo
        public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super C32460OooOooO> continuation) {
            return ((OooOOO) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
        }

        @Override // oO00ooo.AbstractC32477OooO00o
        public final Object invokeSuspend(Object obj) {
            Object next;
            EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
            int i = this.f74327OooOo0o;
            if (i == 0) {
                C32446OooOOOo.OooO0O0(obj);
                OooO0o oooO0o = OooO0o.this;
                Iterator it = ((Iterable) oooO0o.f74233OooOOOo.f121747OooOo0o.getValue()).iterator();
                while (true) {
                    if (!it.hasNext()) {
                        next = null;
                        break;
                    }
                    next = it.next();
                    if (kotlin.jvm.internal.OooOOO0.OooO0O0(((OooO0O0) next).f74277OooO00o.getId(), this.f74328OooOoO)) {
                        break;
                    }
                }
                OooO0O0 oooO0O0 = (OooO0O0) next;
                if (oooO0O0 == null) {
                    C34406OooO00o.C20358OooO00o c20358OooO00o = C34406OooO00o.f123390OooO00o;
                    c20358OooO00o.OooOOO0("MediaToolbarViewModel");
                    c20358OooO00o.OooO0OO("renameAudioFile. audioFile is null", new Object[0]);
                    return C32460OooOooO.f116667OooO00o;
                }
                AudioFile audioFileCopy$default = AudioFile.copy$default(oooO0O0.f74277OooO00o, null, null, this.f74329OooOoO0, 0L, 0.0f, 0L, 0L, 123, null);
                this.f74327OooOo0o = 1;
                if (oooO0o.f74223OooO0o.OooO0OO(audioFileCopy$default, oooO0O0.f74278OooO0O0, this) == enumC32485OooO00o) {
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

    @InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.noteeditor.audio.NoteAudioViewModel$recorderDurationLimitedRunnable$1$1", m80623f = "NoteAudioViewModel.kt", m80624l = {307}, m80625m = "invokeSuspend")
    public static final class OooOOO0 extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super C32460OooOooO>, Object> {

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public int f74331OooOo0o;

        public OooOOO0(Continuation<? super OooOOO0> continuation) {
            super(2, continuation);
        }

        @Override // oO00ooo.AbstractC32477OooO00o
        public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
            return OooO0o.this.new OooOOO0(continuation);
        }

        @Override // oO0O000o.InterfaceC32508OooOOOo
        public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super C32460OooOooO> continuation) {
            return ((OooOOO0) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
        }

        @Override // oO00ooo.AbstractC32477OooO00o
        public final Object invokeSuspend(Object obj) {
            EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
            int i = this.f74331OooOo0o;
            if (i == 0) {
                C32446OooOOOo.OooO0O0(obj);
                C33772OooooOo c33772OooooOo = OooO0o.this.f74249Oooo;
                C32460OooOooO c32460OooOooO = C32460OooOooO.f116667OooO00o;
                this.f74331OooOo0o = 1;
                if (c33772OooooOo.emit(c32460OooOooO, this) == enumC32485OooO00o) {
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

    @InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.noteeditor.audio.NoteAudioViewModel$resetMediaRecorderLocked$mediaRecorder$1$1$1", m80623f = "NoteAudioViewModel.kt", m80624l = {680}, m80625m = "invokeSuspend")
    public static final class OooOOOO extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super C32460OooOooO>, Object> {

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public int f74333OooOo0o;

        @InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.noteeditor.audio.NoteAudioViewModel$resetMediaRecorderLocked$mediaRecorder$1$1$1$1", m80623f = "NoteAudioViewModel.kt", m80624l = {}, m80625m = "invokeSuspend")
        public static final class OooO00o extends AbstractC32476OooO implements InterfaceC32507OooOO0o<Continuation<? super C32460OooOooO>, Object> {

            /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
            public final /* synthetic */ OooO0o f74334OooOo0o;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public OooO00o(OooO0o oooO0o, Continuation<? super OooO00o> continuation) {
                super(1, continuation);
                this.f74334OooOo0o = oooO0o;
            }

            @Override // oO00ooo.AbstractC32477OooO00o
            public final Continuation<C32460OooOooO> create(Continuation<?> continuation) {
                return new OooO00o(this.f74334OooOo0o, continuation);
            }

            @Override // oO0O000o.InterfaceC32507OooOO0o
            public final Object invoke(Continuation<? super C32460OooOooO> continuation) {
                return ((OooO00o) create(continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
            }

            @Override // oO00ooo.AbstractC32477OooO00o
            public final Object invokeSuspend(Object obj) {
                EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
                C32446OooOOOo.OooO0O0(obj);
                OooO0o oooO0o = this.f74334OooOo0o;
                MediaRecorder mediaRecorder = oooO0o.f74228OooOO0O;
                if (mediaRecorder == null) {
                    C34406OooO00o.C20358OooO00o c20358OooO00o = C34406OooO00o.f123390OooO00o;
                    c20358OooO00o.OooOOO0("MediaToolbarViewModel");
                    c20358OooO00o.OooO0OO("setMediaRecorderAudioSource. mediaRecorder is null", new Object[0]);
                } else {
                    C33781o00o0O c33781o00o0O = oooO0o.f74229OooOO0o;
                    c33781o00o0O.OooOO0(null, ((AbstractC23415OooO0o0) c33781o00o0O.getValue()).OooO0O0(new AbstractC23397OooO0Oo.OooO0O0(null, "OnError"), mediaRecorder, oooO0o.f74222OooO0Oo));
                }
                return C32460OooOooO.f116667OooO00o;
            }
        }

        public OooOOOO(Continuation<? super OooOOOO> continuation) {
            super(2, continuation);
        }

        @Override // oO00ooo.AbstractC32477OooO00o
        public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
            return OooO0o.this.new OooOOOO(continuation);
        }

        @Override // oO0O000o.InterfaceC32508OooOOOo
        public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super C32460OooOooO> continuation) {
            return ((OooOOOO) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
        }

        @Override // oO00ooo.AbstractC32477OooO00o
        public final Object invokeSuspend(Object obj) {
            EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
            int i = this.f74333OooOo0o;
            if (i == 0) {
                C32446OooOOOo.OooO0O0(obj);
                OooO0o oooO0o = OooO0o.this;
                OooO00o oooO00o = new OooO00o(oooO0o, null);
                this.f74333OooOo0o = 1;
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

    /* JADX INFO: renamed from: com.orion.notein.ui.noteeditor.audio.OooO0o$OooOOOo, reason: case insensitive filesystem */
    @InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.noteeditor.audio.NoteAudioViewModel$seekToMediaPlayer$1", m80623f = "NoteAudioViewModel.kt", m80624l = {626}, m80625m = "invokeSuspend")
    public static final class C23406OooOOOo extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super C32460OooOooO>, Object> {

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public int f74336OooOo0o;

        /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
        public final /* synthetic */ int f74337OooOoO0;

        /* JADX INFO: renamed from: com.orion.notein.ui.noteeditor.audio.OooO0o$OooOOOo$OooO00o */
        @InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.noteeditor.audio.NoteAudioViewModel$seekToMediaPlayer$1$1", m80623f = "NoteAudioViewModel.kt", m80624l = {627, 628}, m80625m = "invokeSuspend")
        public static final class OooO00o extends AbstractC32476OooO implements InterfaceC32507OooOO0o<Continuation<? super C32460OooOooO>, Object> {

            /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
            public final /* synthetic */ OooO0o f74338OooOo;

            /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
            public int f74339OooOo0o;

            /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
            public final /* synthetic */ int f74340OooOoO0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public OooO00o(OooO0o oooO0o, int i, Continuation<? super OooO00o> continuation) {
                super(1, continuation);
                this.f74338OooOo = oooO0o;
                this.f74340OooOoO0 = i;
            }

            @Override // oO00ooo.AbstractC32477OooO00o
            public final Continuation<C32460OooOooO> create(Continuation<?> continuation) {
                return new OooO00o(this.f74338OooOo, this.f74340OooOoO0, continuation);
            }

            @Override // oO0O000o.InterfaceC32507OooOO0o
            public final Object invoke(Continuation<? super C32460OooOooO> continuation) {
                return ((OooO00o) create(continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
            }

            /* JADX WARN: Code restructure failed: missing block: B:18:0x004b, code lost:
            
                if (r4.OooOOOo(r7) == r0) goto L19;
             */
            @Override // oO00ooo.AbstractC32477OooO00o
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final Object invokeSuspend(Object obj) {
                o00000OO o00000oo2;
                EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
                int i = this.f74339OooOo0o;
                OooO0o oooO0o = this.f74338OooOo;
                if (i == 0) {
                    C32446OooOOOo.OooO0O0(obj);
                    String str = (String) oooO0o.f74235OooOOo0.getValue();
                    if (str == null) {
                        return C32460OooOooO.f116667OooO00o;
                    }
                    this.f74339OooOo0o = 1;
                    if (oooO0o.OooOo0(str, this) != enumC32485OooO00o) {
                    }
                    return enumC32485OooO00o;
                }
                if (i != 1) {
                    if (i != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    C32446OooOOOo.OooO0O0(obj);
                    MediaPlayer mediaPlayer = oooO0o.f74226OooO0oo;
                    Integer num = mediaPlayer != null ? new Integer(mediaPlayer.getCurrentPosition()) : null;
                    if (num != null && ((o00000oo2 = oooO0o.f74254Oooo0O0) == null || !o00000oo2.isActive())) {
                        C33781o00o0O c33781o00o0O = oooO0o.f74234OooOOo;
                        c33781o00o0O.getClass();
                        c33781o00o0O.OooOO0(null, num);
                    }
                    return C32460OooOooO.f116667OooO00o;
                }
                C32446OooOOOo.OooO0O0(obj);
                OooO0O0.C23392OooO0oO c23392OooO0oO = new OooO0O0.C23392OooO0oO(new Integer(this.f74340OooOoO0));
                this.f74339OooOo0o = 2;
                AbstractC24338OooO0o0.OooO00o<Float> oooO00o = OooO0o.f74218OoooO0O;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C23406OooOOOo(int i, Continuation<? super C23406OooOOOo> continuation) {
            super(2, continuation);
            this.f74337OooOoO0 = i;
        }

        @Override // oO00ooo.AbstractC32477OooO00o
        public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
            return OooO0o.this.new C23406OooOOOo(this.f74337OooOoO0, continuation);
        }

        @Override // oO0O000o.InterfaceC32508OooOOOo
        public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super C32460OooOooO> continuation) {
            return ((C23406OooOOOo) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
        }

        @Override // oO00ooo.AbstractC32477OooO00o
        public final Object invokeSuspend(Object obj) {
            EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
            int i = this.f74336OooOo0o;
            if (i == 0) {
                C32446OooOOOo.OooO0O0(obj);
                OooO0o oooO0o = OooO0o.this;
                OooO00o oooO00o = new OooO00o(oooO0o, this.f74337OooOoO0, null);
                this.f74336OooOo0o = 1;
                AbstractC24338OooO0o0.OooO00o<Float> oooO00o2 = OooO0o.f74218OoooO0O;
                if (oooO0o.Oooo0o(oooO00o, this) == enumC32485OooO00o) {
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

    /* JADX INFO: renamed from: com.orion.notein.ui.noteeditor.audio.OooO0o$OooOOo, reason: case insensitive filesystem */
    @InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.noteeditor.audio.NoteAudioViewModel$special$$inlined$flatMapLatest$1", m80623f = "NoteAudioViewModel.kt", m80624l = {189}, m80625m = "invokeSuspend")
    public static final class C23407OooOOo extends AbstractC32476OooO implements InterfaceC32510OooOOo0<InterfaceC33723OooO0oO<? super NoteAudioFileIdsField>, String, Continuation<? super C32460OooOooO>, Object> {

        /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
        public /* synthetic */ InterfaceC33723OooO0oO f74341OooOo;

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public int f74342OooOo0o;

        /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
        public /* synthetic */ Object f74344OooOoO0;

        public C23407OooOOo(Continuation continuation) {
            super(3, continuation);
        }

        @Override // oO0O000o.InterfaceC32510OooOOo0
        public final Object invoke(InterfaceC33723OooO0oO<? super NoteAudioFileIdsField> interfaceC33723OooO0oO, String str, Continuation<? super C32460OooOooO> continuation) {
            C23407OooOOo c23407OooOOo = OooO0o.this.new C23407OooOOo(continuation);
            c23407OooOOo.f74341OooOo = interfaceC33723OooO0oO;
            c23407OooOOo.f74344OooOoO0 = str;
            return c23407OooOOo.invokeSuspend(C32460OooOooO.f116667OooO00o);
        }

        @Override // oO00ooo.AbstractC32477OooO00o
        public final Object invokeSuspend(Object obj) {
            InterfaceC33721OooO0o c33716OooO;
            EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
            int i = this.f74342OooOo0o;
            if (i == 0) {
                C32446OooOOOo.OooO0O0(obj);
                InterfaceC33723OooO0oO interfaceC33723OooO0oO = this.f74341OooOo;
                String str = (String) this.f74344OooOoO0;
                if (str != null) {
                    C27610OooO0o0 c27610OooO0o0 = OooO0o.this.f74223OooO0o;
                    c27610OooO0o0.getClass();
                    c33716OooO = c27610OooO0o0.f97084OooO00o.OooO0Oo(str);
                } else {
                    c33716OooO = new C33716OooO(null);
                }
                this.f74342OooOo0o = 1;
                if (C25252OooO0Oo.OooOOO0(interfaceC33723OooO0oO, c33716OooO, this) == enumC32485OooO00o) {
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

    /* JADX INFO: renamed from: com.orion.notein.ui.noteeditor.audio.OooO0o$OooOOo0, reason: case insensitive filesystem */
    public static final class RunnableC23408OooOOo0 implements Runnable {
        public RunnableC23408OooOOo0() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            C34406OooO00o.C20358OooO00o c20358OooO00o = C34406OooO00o.f123390OooO00o;
            c20358OooO00o.OooOOO0("MediaToolbarViewModel");
            c20358OooO00o.OooOO0O("recorderDurationLimitedRunnable. Triggered.", new Object[0]);
            OooO0o oooO0o = OooO0o.this;
            oooO0o.Oooo0();
            C33609OooO0oo.OooO0OO(o0OoOo0.OooO00o(oooO0o), null, null, oooO0o.new OooOOO0(null), 3);
        }
    }

    /* JADX INFO: renamed from: com.orion.notein.ui.noteeditor.audio.OooO0o$OooOOoo, reason: case insensitive filesystem */
    @InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.noteeditor.audio.NoteAudioViewModel$special$$inlined$flatMapLatest$2", m80623f = "NoteAudioViewModel.kt", m80624l = {189}, m80625m = "invokeSuspend")
    public static final class C23409OooOOoo extends AbstractC32476OooO implements InterfaceC32510OooOOo0<InterfaceC33723OooO0oO<? super List<? extends OooO0O0>>, NoteAudioFileIdsField, Continuation<? super C32460OooOooO>, Object> {

        /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
        public /* synthetic */ InterfaceC33723OooO0oO f74346OooOo;

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public int f74347OooOo0o;

        /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
        public /* synthetic */ Object f74349OooOoO0;

        public C23409OooOOoo(Continuation continuation) {
            super(3, continuation);
        }

        @Override // oO0O000o.InterfaceC32510OooOOo0
        public final Object invoke(InterfaceC33723OooO0oO<? super List<? extends OooO0O0>> interfaceC33723OooO0oO, NoteAudioFileIdsField noteAudioFileIdsField, Continuation<? super C32460OooOooO> continuation) {
            C23409OooOOoo c23409OooOOoo = OooO0o.this.new C23409OooOOoo(continuation);
            c23409OooOOoo.f74346OooOo = interfaceC33723OooO0oO;
            c23409OooOOoo.f74349OooOoO0 = noteAudioFileIdsField;
            return c23409OooOOoo.invokeSuspend(C32460OooOooO.f116667OooO00o);
        }

        @Override // oO00ooo.AbstractC32477OooO00o
        public final Object invokeSuspend(Object obj) {
            InterfaceC33721OooO0o c23402OooO0o0;
            EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
            int i = this.f74347OooOo0o;
            if (i == 0) {
                C32446OooOOOo.OooO0O0(obj);
                InterfaceC33723OooO0oO interfaceC33723OooO0oO = this.f74346OooOo;
                NoteAudioFileIdsField noteAudioFileIdsField = (NoteAudioFileIdsField) this.f74349OooOoO0;
                if (noteAudioFileIdsField == null) {
                    c23402OooO0o0 = new C33716OooO(C34434OooOoO.f123453OooOo0o);
                } else {
                    C27610OooO0o0 c27610OooO0o0 = OooO0o.this.f74223OooO0o;
                    List<String> fileIds = noteAudioFileIdsField.getFileIds();
                    String noteId = noteAudioFileIdsField.getNoteId();
                    c27610OooO0o0.getClass();
                    kotlin.jvm.internal.OooOOO0.OooO0oO(fileIds, "fileIds");
                    kotlin.jvm.internal.OooOOO0.OooO0oO(noteId, "noteId");
                    c23402OooO0o0 = new C23402OooO0o0(c27610OooO0o0.f97084OooO00o.OooOo0o(noteId, fileIds), noteAudioFileIdsField);
                }
                this.f74347OooOo0o = 1;
                if (C25252OooO0Oo.OooOOO0(interfaceC33723OooO0oO, c23402OooO0o0, this) == enumC32485OooO00o) {
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

    @InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.noteeditor.audio.NoteAudioViewModel$startMediaPlayer$1", m80623f = "NoteAudioViewModel.kt", m80624l = {558, 559}, m80625m = "invokeSuspend")
    public static final class OooOo extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super C32460OooOooO>, Object> {

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public int f74351OooOo0o;

        /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
        public final /* synthetic */ Integer f74352OooOoO;

        /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
        public final /* synthetic */ String f74353OooOoO0;

        @InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.noteeditor.audio.NoteAudioViewModel$startMediaPlayer$1$1", m80623f = "NoteAudioViewModel.kt", m80624l = {558}, m80625m = "invokeSuspend")
        public static final class OooO00o extends AbstractC32476OooO implements InterfaceC32507OooOO0o<Continuation<? super C32460OooOooO>, Object> {

            /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
            public final /* synthetic */ OooO0o f74354OooOo;

            /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
            public int f74355OooOo0o;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public OooO00o(OooO0o oooO0o, Continuation<? super OooO00o> continuation) {
                super(1, continuation);
                this.f74354OooOo = oooO0o;
            }

            @Override // oO00ooo.AbstractC32477OooO00o
            public final Continuation<C32460OooOooO> create(Continuation<?> continuation) {
                return new OooO00o(this.f74354OooOo, continuation);
            }

            @Override // oO0O000o.InterfaceC32507OooOO0o
            public final Object invoke(Continuation<? super C32460OooOooO> continuation) {
                return ((OooO00o) create(continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
            }

            @Override // oO00ooo.AbstractC32477OooO00o
            public final Object invokeSuspend(Object obj) {
                EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
                int i = this.f74355OooOo0o;
                if (i == 0) {
                    C32446OooOOOo.OooO0O0(obj);
                    this.f74355OooOo0o = 1;
                    AbstractC24338OooO0o0.OooO00o<Float> oooO00o = OooO0o.f74218OoooO0O;
                    if (this.f74354OooOo.Oooo0O0(false, this) == enumC32485OooO00o) {
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

        @InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.noteeditor.audio.NoteAudioViewModel$startMediaPlayer$1$2", m80623f = "NoteAudioViewModel.kt", m80624l = {569}, m80625m = "invokeSuspend")
        public static final class OooO0O0 extends AbstractC32476OooO implements InterfaceC32507OooOO0o<Continuation<? super C32460OooOooO>, Object> {

            /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
            public final /* synthetic */ OooO0o f74356OooOo;

            /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
            public int f74357OooOo0o;

            /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
            public final /* synthetic */ Integer f74358OooOoO;

            /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
            public final /* synthetic */ String f74359OooOoO0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public OooO0O0(OooO0o oooO0o, String str, Integer num, Continuation<? super OooO0O0> continuation) {
                super(1, continuation);
                this.f74356OooOo = oooO0o;
                this.f74359OooOoO0 = str;
                this.f74358OooOoO = num;
            }

            @Override // oO00ooo.AbstractC32477OooO00o
            public final Continuation<C32460OooOooO> create(Continuation<?> continuation) {
                return new OooO0O0(this.f74356OooOo, this.f74359OooOoO0, this.f74358OooOoO, continuation);
            }

            @Override // oO0O000o.InterfaceC32507OooOO0o
            public final Object invoke(Continuation<? super C32460OooOooO> continuation) {
                return ((OooO0O0) create(continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
            }

            @Override // oO00ooo.AbstractC32477OooO00o
            public final Object invokeSuspend(Object obj) {
                AudioFile audioFile;
                EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
                int i = this.f74357OooOo0o;
                if (i == 0) {
                    C32446OooOOOo.OooO0O0(obj);
                    OooO0o oooO0o = this.f74356OooOo;
                    String id = (String) oooO0o.f74235OooOOo0.getValue();
                    if (id == null) {
                        OooO0O0 oooO0O0 = (OooO0O0) oOo000Oo.OooOo.Oooo((List) oooO0o.f74233OooOOOo.f121747OooOo0o.getValue());
                        id = (oooO0O0 == null || (audioFile = oooO0O0.f74277OooO00o) == null) ? null : audioFile.getId();
                    }
                    String str = this.f74359OooOoO0;
                    if (str != null) {
                        id = str;
                    }
                    if (id == null) {
                        C34406OooO00o.C20358OooO00o c20358OooO00o = C34406OooO00o.f123390OooO00o;
                        c20358OooO00o.OooOOO0("MediaToolbarViewModel");
                        c20358OooO00o.OooO0OO("startMediaPlayer. fileIdToPlay is null", new Object[0]);
                        return C32460OooOooO.f116667OooO00o;
                    }
                    this.f74357OooOo0o = 1;
                    if (OooO0o.OooO(oooO0o, this.f74358OooOoO, id, this) == enumC32485OooO00o) {
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

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooOo(String str, Integer num, Continuation<? super OooOo> continuation) {
            super(2, continuation);
            this.f74353OooOoO0 = str;
            this.f74352OooOoO = num;
        }

        @Override // oO00ooo.AbstractC32477OooO00o
        public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
            return OooO0o.this.new OooOo(this.f74353OooOoO0, this.f74352OooOoO, continuation);
        }

        @Override // oO0O000o.InterfaceC32508OooOOOo
        public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super C32460OooOooO> continuation) {
            return ((OooOo) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
        }

        /* JADX WARN: Code restructure failed: missing block: B:14:0x0041, code lost:
        
            if (r3.Oooo0o(r7, r6) == r0) goto L15;
         */
        @Override // oO00ooo.AbstractC32477OooO00o
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
            int i = this.f74351OooOo0o;
            OooO0o oooO0o = OooO0o.this;
            if (i == 0) {
                C32446OooOOOo.OooO0O0(obj);
                OooO00o oooO00o = new OooO00o(oooO0o, null);
                this.f74351OooOo0o = 1;
                if (OooO0o.OooOO0o(oooO0o, oooO00o, this) != enumC32485OooO00o) {
                }
                return enumC32485OooO00o;
            }
            if (i != 1) {
                if (i != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C32446OooOOOo.OooO0O0(obj);
                return C32460OooOooO.f116667OooO00o;
            }
            C32446OooOOOo.OooO0O0(obj);
            OooO0O0 oooO0O0 = new OooO0O0(oooO0o, this.f74353OooOoO0, this.f74352OooOoO, null);
            this.f74351OooOo0o = 2;
            AbstractC24338OooO0o0.OooO00o<Float> oooO00o2 = OooO0o.f74218OoooO0O;
        }
    }

    /* JADX INFO: renamed from: com.orion.notein.ui.noteeditor.audio.OooO0o$OooOo0, reason: case insensitive filesystem */
    public static final class C23410OooOo0 implements InterfaceC33721OooO0o<InterfaceC33721OooO0o<? extends List<? extends AudioSyncRecord>>> {

        /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
        public final /* synthetic */ OooO0o f74360OooOo;

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public final /* synthetic */ C33769Ooooo0o f74361OooOo0o;

        /* JADX INFO: renamed from: com.orion.notein.ui.noteeditor.audio.OooO0o$OooOo0$OooO00o */
        public static final class OooO00o<T> implements InterfaceC33723OooO0oO {

            /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
            public final /* synthetic */ OooO0o f74362OooOo;

            /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
            public final /* synthetic */ InterfaceC33723OooO0oO f74363OooOo0o;

            /* JADX INFO: renamed from: com.orion.notein.ui.noteeditor.audio.OooO0o$OooOo0$OooO00o$OooO00o, reason: collision with other inner class name */
            @InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.noteeditor.audio.NoteAudioViewModel$special$$inlined$map$1$2", m80623f = "NoteAudioViewModel.kt", m80624l = {50}, m80625m = "emit")
            public static final class C19290OooO00o extends AbstractC32479OooO0OO {

                /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
                public int f74364OooOo;

                /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
                public /* synthetic */ Object f74365OooOo0o;

                public C19290OooO00o(Continuation continuation) {
                    super(continuation);
                }

                @Override // oO00ooo.AbstractC32477OooO00o
                public final Object invokeSuspend(Object obj) {
                    this.f74365OooOo0o = obj;
                    this.f74364OooOo |= Integer.MIN_VALUE;
                    return OooO00o.this.emit(null, this);
                }
            }

            public OooO00o(InterfaceC33723OooO0oO interfaceC33723OooO0oO, OooO0o oooO0o) {
                this.f74363OooOo0o = interfaceC33723OooO0oO;
                this.f74362OooOo = oooO0o;
            }

            /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
            /* JADX WARN: Type inference fix 'apply assigned field type' failed
            java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
            	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
            	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
            	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
             */
            @Override // oO0o0Oo.InterfaceC33723OooO0oO
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final Object emit(Object obj, Continuation continuation) {
                C19290OooO00o c19290OooO00o;
                InterfaceC33721OooO0o c23403OooO0oO;
                if (continuation instanceof C19290OooO00o) {
                    c19290OooO00o = (C19290OooO00o) continuation;
                    int i = c19290OooO00o.f74364OooOo;
                    if ((i & Integer.MIN_VALUE) != 0) {
                        c19290OooO00o.f74364OooOo = i - Integer.MIN_VALUE;
                    } else {
                        c19290OooO00o = new C19290OooO00o(continuation);
                    }
                }
                Object obj2 = c19290OooO00o.f74365OooOo0o;
                EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
                int i2 = c19290OooO00o.f74364OooOo;
                if (i2 == 0) {
                    C32446OooOOOo.OooO0O0(obj2);
                    OooO0O0 oooO0O0 = (OooO0O0) obj;
                    if (oooO0O0 == null) {
                        C34406OooO00o.C20358OooO00o c20358OooO00o = C34406OooO00o.f123390OooO00o;
                        c20358OooO00o.OooOOO0("MediaToolbarViewModel");
                        c20358OooO00o.OooO0OO("_activeAudioSyncRecords. activeAudioFile is null", new Object[0]);
                        c23403OooO0oO = C33784o00ooo.OooO00o(C34434OooOoO.f123453OooOo0o);
                    } else {
                        C27610OooO0o0 c27610OooO0o0 = this.f74362OooOo.f74223OooO0o;
                        String audioId = oooO0O0.f74277OooO00o.getId();
                        c27610OooO0o0.getClass();
                        kotlin.jvm.internal.OooOOO0.OooO0oO(audioId, "audioId");
                        String noteId = oooO0O0.f74278OooO0O0;
                        kotlin.jvm.internal.OooOOO0.OooO0oO(noteId, "noteId");
                        c23403OooO0oO = new C23403OooO0oO(c27610OooO0o0.f97084OooO00o.OooOOo(audioId, noteId));
                    }
                    c19290OooO00o.f74364OooOo = 1;
                    if (this.f74363OooOo0o.emit(c23403OooO0oO, c19290OooO00o) == enumC32485OooO00o) {
                        return enumC32485OooO00o;
                    }
                } else {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    C32446OooOOOo.OooO0O0(obj2);
                }
                return C32460OooOooO.f116667OooO00o;
            }
        }

        public C23410OooOo0(C33769Ooooo0o c33769Ooooo0o, OooO0o oooO0o) {
            this.f74361OooOo0o = c33769Ooooo0o;
            this.f74360OooOo = oooO0o;
        }

        @Override // oO0o0Oo.InterfaceC33721OooO0o
        public final Object collect(InterfaceC33723OooO0oO<? super InterfaceC33721OooO0o<? extends List<? extends AudioSyncRecord>>> interfaceC33723OooO0oO, Continuation continuation) {
            Object objCollect = this.f74361OooOo0o.f121747OooOo0o.collect(new OooO00o(interfaceC33723OooO0oO, this.f74360OooOo), continuation);
            return objCollect == EnumC32485OooO00o.f116726OooOo0o ? objCollect : C32460OooOooO.f116667OooO00o;
        }
    }

    @InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.noteeditor.audio.NoteAudioViewModel$special$$inlined$flatMapLatest$3", m80623f = "NoteAudioViewModel.kt", m80624l = {189}, m80625m = "invokeSuspend")
    public static final class OooOo00 extends AbstractC32476OooO implements InterfaceC32510OooOOo0<InterfaceC33723OooO0oO<? super List<? extends AudioSyncRecord>>, InterfaceC33721OooO0o<? extends List<? extends AudioSyncRecord>>, Continuation<? super C32460OooOooO>, Object> {

        /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
        public /* synthetic */ InterfaceC33723OooO0oO f74367OooOo;

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public int f74368OooOo0o;

        /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
        public /* synthetic */ Object f74369OooOoO0;

        @Override // oO0O000o.InterfaceC32510OooOOo0
        public final Object invoke(InterfaceC33723OooO0oO<? super List<? extends AudioSyncRecord>> interfaceC33723OooO0oO, InterfaceC33721OooO0o<? extends List<? extends AudioSyncRecord>> interfaceC33721OooO0o, Continuation<? super C32460OooOooO> continuation) {
            OooOo00 oooOo00 = new OooOo00(3, continuation);
            oooOo00.f74367OooOo = interfaceC33723OooO0oO;
            oooOo00.f74369OooOoO0 = interfaceC33721OooO0o;
            return oooOo00.invokeSuspend(C32460OooOooO.f116667OooO00o);
        }

        @Override // oO00ooo.AbstractC32477OooO00o
        public final Object invokeSuspend(Object obj) {
            EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
            int i = this.f74368OooOo0o;
            if (i == 0) {
                C32446OooOOOo.OooO0O0(obj);
                InterfaceC33723OooO0oO interfaceC33723OooO0oO = this.f74367OooOo;
                InterfaceC33721OooO0o interfaceC33721OooO0o = (InterfaceC33721OooO0o) this.f74369OooOoO0;
                this.f74368OooOo0o = 1;
                if (C25252OooO0Oo.OooOOO0(interfaceC33723OooO0oO, interfaceC33721OooO0o, this) == enumC32485OooO00o) {
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

    /* JADX INFO: renamed from: com.orion.notein.ui.noteeditor.audio.OooO0o$OooOo0O, reason: case insensitive filesystem */
    public static final class C23411OooOo0O implements InterfaceC33721OooO0o<Float> {

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public final /* synthetic */ InterfaceC33721OooO0o f74370OooOo0o;

        /* JADX INFO: renamed from: com.orion.notein.ui.noteeditor.audio.OooO0o$OooOo0O$OooO00o */
        public static final class OooO00o<T> implements InterfaceC33723OooO0oO {

            /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
            public final /* synthetic */ InterfaceC33723OooO0oO f74371OooOo0o;

            /* JADX INFO: renamed from: com.orion.notein.ui.noteeditor.audio.OooO0o$OooOo0O$OooO00o$OooO00o, reason: collision with other inner class name */
            @InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.noteeditor.audio.NoteAudioViewModel$special$$inlined$map$2$2", m80623f = "NoteAudioViewModel.kt", m80624l = {50}, m80625m = "emit")
            public static final class C19291OooO00o extends AbstractC32479OooO0OO {

                /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
                public int f74372OooOo;

                /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
                public /* synthetic */ Object f74373OooOo0o;

                public C19291OooO00o(Continuation continuation) {
                    super(continuation);
                }

                @Override // oO00ooo.AbstractC32477OooO00o
                public final Object invokeSuspend(Object obj) {
                    this.f74373OooOo0o = obj;
                    this.f74372OooOo |= Integer.MIN_VALUE;
                    return OooO00o.this.emit(null, this);
                }
            }

            public OooO00o(InterfaceC33723OooO0oO interfaceC33723OooO0oO) {
                this.f74371OooOo0o = interfaceC33723OooO0oO;
            }

            /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
            @Override // oO0o0Oo.InterfaceC33723OooO0oO
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final Object emit(Object obj, Continuation continuation) {
                C19291OooO00o c19291OooO00o;
                if (continuation instanceof C19291OooO00o) {
                    c19291OooO00o = (C19291OooO00o) continuation;
                    int i = c19291OooO00o.f74372OooOo;
                    if ((i & Integer.MIN_VALUE) != 0) {
                        c19291OooO00o.f74372OooOo = i - Integer.MIN_VALUE;
                    } else {
                        c19291OooO00o = new C19291OooO00o(continuation);
                    }
                }
                Object obj2 = c19291OooO00o.f74373OooOo0o;
                EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
                int i2 = c19291OooO00o.f74372OooOo;
                if (i2 == 0) {
                    C32446OooOOOo.OooO0O0(obj2);
                    Float f = (Float) ((AbstractC24338OooO0o0) obj).OooO0OO(OooO0o.f74218OoooO0O);
                    Float f2 = new Float(f != null ? f.floatValue() : 1.0f);
                    c19291OooO00o.f74372OooOo = 1;
                    if (this.f74371OooOo0o.emit(f2, c19291OooO00o) == enumC32485OooO00o) {
                        return enumC32485OooO00o;
                    }
                } else {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    C32446OooOOOo.OooO0O0(obj2);
                }
                return C32460OooOooO.f116667OooO00o;
            }
        }

        public C23411OooOo0O(InterfaceC33721OooO0o interfaceC33721OooO0o) {
            this.f74370OooOo0o = interfaceC33721OooO0o;
        }

        @Override // oO0o0Oo.InterfaceC33721OooO0o
        public final Object collect(InterfaceC33723OooO0oO<? super Float> interfaceC33723OooO0oO, Continuation continuation) {
            Object objCollect = this.f74370OooOo0o.collect(new OooO00o(interfaceC33723OooO0oO), continuation);
            return objCollect == EnumC32485OooO00o.f116726OooOo0o ? objCollect : C32460OooOooO.f116667OooO00o;
        }
    }

    /* JADX INFO: renamed from: com.orion.notein.ui.noteeditor.audio.OooO0o$OooOo0o, reason: case insensitive filesystem */
    public static final class C23412OooOo0o implements InterfaceC33721OooO0o<List<? extends C29197OooO0Oo>> {

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public final /* synthetic */ C33769Ooooo0o f74375OooOo0o;

        /* JADX INFO: renamed from: com.orion.notein.ui.noteeditor.audio.OooO0o$OooOo0o$OooO00o */
        public static final class OooO00o<T> implements InterfaceC33723OooO0oO {

            /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
            public final /* synthetic */ InterfaceC33723OooO0oO f74376OooOo0o;

            /* JADX INFO: renamed from: com.orion.notein.ui.noteeditor.audio.OooO0o$OooOo0o$OooO00o$OooO00o, reason: collision with other inner class name */
            @InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.noteeditor.audio.NoteAudioViewModel$special$$inlined$map$3$2", m80623f = "NoteAudioViewModel.kt", m80624l = {50}, m80625m = "emit")
            public static final class C19292OooO00o extends AbstractC32479OooO0OO {

                /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
                public int f74377OooOo;

                /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
                public /* synthetic */ Object f74378OooOo0o;

                public C19292OooO00o(Continuation continuation) {
                    super(continuation);
                }

                @Override // oO00ooo.AbstractC32477OooO00o
                public final Object invokeSuspend(Object obj) {
                    this.f74378OooOo0o = obj;
                    this.f74377OooOo |= Integer.MIN_VALUE;
                    return OooO00o.this.emit(null, this);
                }
            }

            public OooO00o(InterfaceC33723OooO0oO interfaceC33723OooO0oO) {
                this.f74376OooOo0o = interfaceC33723OooO0oO;
            }

            /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
            @Override // oO0o0Oo.InterfaceC33723OooO0oO
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final Object emit(Object obj, Continuation continuation) {
                C19292OooO00o c19292OooO00o;
                if (continuation instanceof C19292OooO00o) {
                    c19292OooO00o = (C19292OooO00o) continuation;
                    int i = c19292OooO00o.f74377OooOo;
                    if ((i & Integer.MIN_VALUE) != 0) {
                        c19292OooO00o.f74377OooOo = i - Integer.MIN_VALUE;
                    } else {
                        c19292OooO00o = new C19292OooO00o(continuation);
                    }
                }
                Object obj2 = c19292OooO00o.f74378OooOo0o;
                EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
                int i2 = c19292OooO00o.f74377OooOo;
                if (i2 == 0) {
                    C32446OooOOOo.OooO0O0(obj2);
                    float fFloatValue = ((Number) obj).floatValue();
                    List<Float> list = OooO0o.f74217OoooO;
                    ArrayList arrayList = new ArrayList(C34428OooOOo.OooOOoo(list, 10));
                    Iterator<T> it = list.iterator();
                    while (it.hasNext()) {
                        float fFloatValue2 = ((Number) it.next()).floatValue();
                        arrayList.add(new C29197OooO0Oo(fFloatValue2, fFloatValue2 == fFloatValue));
                    }
                    c19292OooO00o.f74377OooOo = 1;
                    if (this.f74376OooOo0o.emit(arrayList, c19292OooO00o) == enumC32485OooO00o) {
                        return enumC32485OooO00o;
                    }
                } else {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    C32446OooOOOo.OooO0O0(obj2);
                }
                return C32460OooOooO.f116667OooO00o;
            }
        }

        public C23412OooOo0o(C33769Ooooo0o c33769Ooooo0o) {
            this.f74375OooOo0o = c33769Ooooo0o;
        }

        @Override // oO0o0Oo.InterfaceC33721OooO0o
        public final Object collect(InterfaceC33723OooO0oO<? super List<? extends C29197OooO0Oo>> interfaceC33723OooO0oO, Continuation continuation) {
            Object objCollect = this.f74375OooOo0o.f121747OooOo0o.collect(new OooO00o(interfaceC33723OooO0oO), continuation);
            return objCollect == EnumC32485OooO00o.f116726OooOo0o ? objCollect : C32460OooOooO.f116667OooO00o;
        }
    }

    /* JADX INFO: renamed from: com.orion.notein.ui.noteeditor.audio.OooO0o$OooOoO, reason: case insensitive filesystem */
    @InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.noteeditor.audio.NoteAudioViewModel", m80623f = "NoteAudioViewModel.kt", m80624l = {1785, 1352}, m80625m = "withPlayerStateLock")
    public static final class C23413OooOoO<T> extends AbstractC32479OooO0OO {

        /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
        public Object f74380OooOo;

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public OooO0o f74381OooOo0o;

        /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
        public /* synthetic */ Object f74382OooOoO;

        /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
        public C33898OooO0Oo f74383OooOoO0;

        /* JADX INFO: renamed from: OooOoo0, reason: collision with root package name */
        public int f74385OooOoo0;

        public C23413OooOoO(Continuation<? super C23413OooOoO> continuation) {
            super(continuation);
        }

        @Override // oO00ooo.AbstractC32477OooO00o
        public final Object invokeSuspend(Object obj) {
            this.f74382OooOoO = obj;
            this.f74385OooOoo0 |= Integer.MIN_VALUE;
            AbstractC24338OooO0o0.OooO00o<Float> oooO00o = OooO0o.f74218OoooO0O;
            return OooO0o.this.Oooo0o(null, this);
        }
    }

    /* JADX INFO: renamed from: com.orion.notein.ui.noteeditor.audio.OooO0o$OooOoO0, reason: case insensitive filesystem */
    @InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.noteeditor.audio.NoteAudioViewModel$stopMediaRecorder$1", m80623f = "NoteAudioViewModel.kt", m80624l = {918}, m80625m = "invokeSuspend")
    public static final class C23414OooOoO0 extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super C32460OooOooO>, Object> {

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public int f74387OooOo0o;

        /* JADX INFO: renamed from: com.orion.notein.ui.noteeditor.audio.OooO0o$OooOoO0$OooO00o */
        @InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.noteeditor.audio.NoteAudioViewModel$stopMediaRecorder$1$1", m80623f = "NoteAudioViewModel.kt", m80624l = {918}, m80625m = "invokeSuspend")
        public static final class OooO00o extends AbstractC32476OooO implements InterfaceC32507OooOO0o<Continuation<? super C32460OooOooO>, Object> {

            /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
            public final /* synthetic */ OooO0o f74388OooOo;

            /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
            public int f74389OooOo0o;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public OooO00o(OooO0o oooO0o, Continuation<? super OooO00o> continuation) {
                super(1, continuation);
                this.f74388OooOo = oooO0o;
            }

            @Override // oO00ooo.AbstractC32477OooO00o
            public final Continuation<C32460OooOooO> create(Continuation<?> continuation) {
                return new OooO00o(this.f74388OooOo, continuation);
            }

            @Override // oO0O000o.InterfaceC32507OooOO0o
            public final Object invoke(Continuation<? super C32460OooOooO> continuation) {
                return ((OooO00o) create(continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
            }

            @Override // oO00ooo.AbstractC32477OooO00o
            public final Object invokeSuspend(Object obj) {
                EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
                int i = this.f74389OooOo0o;
                if (i == 0) {
                    C32446OooOOOo.OooO0O0(obj);
                    this.f74389OooOo0o = 1;
                    AbstractC24338OooO0o0.OooO00o<Float> oooO00o = OooO0o.f74218OoooO0O;
                    if (this.f74388OooOo.Oooo0O0(true, this) == enumC32485OooO00o) {
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

        public C23414OooOoO0(Continuation<? super C23414OooOoO0> continuation) {
            super(2, continuation);
        }

        @Override // oO00ooo.AbstractC32477OooO00o
        public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
            return OooO0o.this.new C23414OooOoO0(continuation);
        }

        @Override // oO0O000o.InterfaceC32508OooOOOo
        public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super C32460OooOooO> continuation) {
            return ((C23414OooOoO0) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
        }

        @Override // oO00ooo.AbstractC32477OooO00o
        public final Object invokeSuspend(Object obj) {
            EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
            int i = this.f74387OooOo0o;
            if (i == 0) {
                C32446OooOOOo.OooO0O0(obj);
                OooO0o oooO0o = OooO0o.this;
                OooO00o oooO00o = new OooO00o(oooO0o, null);
                this.f74387OooOo0o = 1;
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

    public OooO0o(Context context, o0000o0O.OooOO0<AbstractC24338OooO0o0> audioDataStore, C27610OooO0o0 c27610OooO0o0, o00000O getRemoteConfigUseCase) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(audioDataStore, "audioDataStore");
        kotlin.jvm.internal.OooOOO0.OooO0oO(getRemoteConfigUseCase, "getRemoteConfigUseCase");
        this.f74222OooO0Oo = context;
        this.f74224OooO0o0 = audioDataStore;
        this.f74223OooO0o = c27610OooO0o0;
        this.f74225OooO0oO = getRemoteConfigUseCase;
        C33781o00o0O c33781o00o0OOooO00o = C33784o00ooo.OooO00o(OooO0OO.C19282OooO0OO.f74209OooO0O0);
        this.f74221OooO = c33781o00o0OOooO00o;
        this.f74227OooOO0 = c33781o00o0OOooO00o;
        C33781o00o0O c33781o00o0OOooO00o2 = C33784o00ooo.OooO00o(AbstractC23415OooO0o0.OooO0OO.f74394OooO0OO);
        this.f74229OooOO0o = c33781o00o0OOooO00o2;
        this.f74231OooOOO0 = c33781o00o0OOooO00o2;
        C33781o00o0O c33781o00o0OOooO00o3 = C33784o00ooo.OooO00o(null);
        this.f74230OooOOO = c33781o00o0OOooO00o3;
        C33799OooOO0O c33799OooOO0OOooOoO = C25252OooO0Oo.OooOoO(c33781o00o0OOooO00o3, new C23407OooOOo(null));
        InterfaceC33636Oooo00o interfaceC33636Oooo00oOooO00o = o0OoOo0.OooO00o(this);
        C33874OooO0OO c33874OooO0OO = C33649OoooOOo.f121328OooO00o;
        ExecutorC33873OooO0O0 executorC33873OooO0O0 = ExecutorC33873OooO0O0.f122045OooOoO0;
        C33769Ooooo0o c33769Ooooo0oOooOoO0 = C25252OooO0Oo.OooOoO0(c33799OooOO0OOooOoO, C33633Oooo0.OooO0oO(interfaceC33636Oooo00oOooO00o, executorC33873OooO0O0), InterfaceC33788ooOO.OooO00o.OooO00o(2), null);
        this.f74232OooOOOO = c33769Ooooo0oOooOoO0;
        C33799OooOO0O c33799OooOO0OOooOoO2 = C25252OooO0Oo.OooOoO(c33769Ooooo0oOooOoO0, new C23409OooOOoo(null));
        C33822OooO0OO c33822OooO0OOOooO0oO = C33633Oooo0.OooO0oO(o0OoOo0.OooO00o(this), executorC33873OooO0O0);
        C33779o00Oo0 c33779o00Oo0OooO00o = InterfaceC33788ooOO.OooO00o.OooO00o(2);
        C34434OooOoO c34434OooOoO = C34434OooOoO.f123453OooOo0o;
        C33769Ooooo0o c33769Ooooo0oOooOoO02 = C25252OooO0Oo.OooOoO0(c33799OooOO0OOooOoO2, c33822OooO0OOOooO0oO, c33779o00Oo0OooO00o, c34434OooOoO);
        this.f74233OooOOOo = c33769Ooooo0oOooOoO02;
        C33781o00o0O c33781o00o0OOooO00o4 = C33784o00ooo.OooO00o(null);
        this.f74235OooOOo0 = c33781o00o0OOooO00o4;
        C33769Ooooo0o c33769Ooooo0oOooOoO03 = C25252OooO0Oo.OooOoO0(new C33763OoooOOO(c33769Ooooo0oOooOoO02, c33781o00o0OOooO00o4, new C23401OooO0Oo(3, null)), C33633Oooo0.OooO0oO(o0OoOo0.OooO00o(this), executorC33873OooO0O0), InterfaceC33788ooOO.OooO00o.OooO00o(2), null);
        C33781o00o0O c33781o00o0OOooO00o5 = C33784o00ooo.OooO00o(0);
        this.f74234OooOOo = c33781o00o0OOooO00o5;
        C33781o00o0O c33781o00o0OOooO00o6 = C33784o00ooo.OooO00o(f74219OoooOO0);
        this.f74236OooOOoo = c33781o00o0OOooO00o6;
        this.f74239OooOo00 = C25252OooO0Oo.OooOoO0(C25252OooO0Oo.OooO(c33769Ooooo0oOooOoO03, c33781o00o0OOooO00o5, c33781o00o0OOooO00o6, c33781o00o0OOooO00o, new C19287OooO0o(5, null)), o0OoOo0.OooO00o(this), InterfaceC33788ooOO.OooO00o.OooO00o(2), null);
        C33781o00o0O c33781o00o0OOooO00o7 = C33784o00ooo.OooO00o(null);
        this.f74238OooOo0 = c33781o00o0OOooO00o7;
        C33781o00o0O c33781o00o0OOooO00o8 = C33784o00ooo.OooO00o(0);
        this.f74240OooOo0O = c33781o00o0OOooO00o8;
        C33781o00o0O c33781o00o0OOooO00o9 = C33784o00ooo.OooO00o(Float.valueOf(0.0f));
        this.f74241OooOo0o = c33781o00o0OOooO00o9;
        this.f74237OooOo = C25252OooO0Oo.OooOoO0(C25252OooO0Oo.OooO(c33781o00o0OOooO00o7, c33781o00o0OOooO00o8, c33781o00o0OOooO00o9, c33781o00o0OOooO00o2, new C23404OooO0oo(5, null)), o0OoOo0.OooO00o(this), InterfaceC33788ooOO.OooO00o.OooO00o(2), null);
        this.f74243OooOoO0 = C25252OooO0Oo.OooOoO0(C25252OooO0Oo.OooOoO(new C23410OooOo0(c33769Ooooo0oOooOoO03, this), new OooOo00(3, null)), C33633Oooo0.OooO0oO(o0OoOo0.OooO00o(this), executorC33873OooO0O0), InterfaceC33788ooOO.OooO00o.OooO00o(2), c34434OooOoO);
        C33769Ooooo0o c33769Ooooo0oOooOoO04 = C25252OooO0Oo.OooOoO0(new C23411OooOo0O(audioDataStore.getData()), C33633Oooo0.OooO0oO(o0OoOo0.OooO00o(this), executorC33873OooO0O0), InterfaceC33788ooOO.OooO00o.OooO00o(2), Float.valueOf(1.0f));
        this.f74242OooOoO = c33769Ooooo0oOooOoO04;
        this.f74244OooOoOO = C25252OooO0Oo.OooOoO0(new C23412OooOo0o(c33769Ooooo0oOooOoO04), o0OoOo0.OooO00o(this), InterfaceC33788ooOO.OooO00o.OooO00o(2), c34434OooOoO);
        C33781o00o0O c33781o00o0OOooO00o10 = C33784o00ooo.OooO00o(Boolean.FALSE);
        this.f74246OooOoo0 = c33781o00o0OOooO00o10;
        this.f74245OooOoo = c33781o00o0OOooO00o10;
        C33781o00o0O c33781o00o0OOooO00o11 = C33784o00ooo.OooO00o(C34438OooOoo0.f123458OooOo0o);
        this.f74247OooOooO = c33781o00o0OOooO00o11;
        this.f74248OooOooo = C25252OooO0Oo.OooOoO0(C25252OooO0Oo.OooOO0(c33769Ooooo0oOooOoO02, c33781o00o0OOooO00o4, c33781o00o0OOooO00o, c33781o00o0OOooO00o11, c33781o00o0OOooO00o10, new OooO(null)), o0OoOo0.OooO00o(this), InterfaceC33788ooOO.OooO00o.OooO00o(2), c34434OooOoO);
        this.f74251Oooo000 = C33900OooO0o0.OooO00o();
        this.f74252Oooo00O = C33900OooO0o0.OooO00o();
        C33772OooooOo c33772OooooOoOooO0O0 = C33773Oooooo.OooO0O0(0, 0, 6);
        this.f74253Oooo00o = c33772OooooOoOooO0O0;
        this.f74250Oooo0 = C25252OooO0Oo.OooO0O0(c33772OooooOoOooO0O0);
        this.f74256Oooo0o = new OooO0OO(0);
        HandlerThread handlerThread = new HandlerThread("AudioSyncThread");
        handlerThread.start();
        this.f74258Oooo0oO = handlerThread;
        this.f74259Oooo0oo = new Handler(handlerThread.getLooper());
        C33772OooooOo c33772OooooOoOooO0O02 = C33773Oooooo.OooO0O0(0, 0, 6);
        this.f74249Oooo = c33772OooooOoOooO0O02;
        this.f74261OoooO00 = C25252OooO0Oo.OooO0O0(c33772OooooOoOooO0O02);
        this.f74260OoooO0 = new RunnableC23408OooOOo0();
        C33609OooO0oo.OooO0OO(o0OoOo0.OooO00o(this), null, null, new OooO00o(null), 3);
        C33609OooO0oo.OooO0OO(o0OoOo0.OooO00o(this), executorC33873OooO0O0, null, new C23420OooO0oo(this, null), 2);
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x007c, code lost:
    
        if (r12.OooOoO() == r1) goto L53;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x0135, code lost:
    
        if (r12.OooOOOo(r13) == r1) goto L53;
     */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00a7  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00c0  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00c3  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00c6  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00d5  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x010a  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00bb A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0016  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object OooO(OooO0o oooO0o, Integer num, String str, AbstractC32479OooO0OO abstractC32479OooO0OO) {
        C29157Oooo c29157Oooo;
        Iterator it;
        Object next;
        AudioFile audioFile;
        oooO0o.getClass();
        if (abstractC32479OooO0OO instanceof C29157Oooo) {
            c29157Oooo = (C29157Oooo) abstractC32479OooO0OO;
            int i = c29157Oooo.f103352OooOoo0;
            if ((i & Integer.MIN_VALUE) != 0) {
                c29157Oooo.f103352OooOoo0 = i - Integer.MIN_VALUE;
            } else {
                c29157Oooo = new C29157Oooo(oooO0o, abstractC32479OooO0OO);
            }
        }
        Object obj = c29157Oooo.f103349OooOoO;
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i2 = c29157Oooo.f103352OooOoo0;
        if (i2 == 0) {
            C32446OooOOOo.OooO0O0(obj);
            C34406OooO00o.C20358OooO00o c20358OooO00o = C34406OooO00o.f123390OooO00o;
            c20358OooO00o.OooOOO0("MediaToolbarViewModel");
            c20358OooO00o.OooO0o0("startMediaPlayerLocked.", new Object[0]);
            if (oooO0o.f74226OooO0oo == null) {
                c29157Oooo.f103348OooOo0o = oooO0o;
                c29157Oooo.f103347OooOo = num;
                c29157Oooo.f103350OooOoO0 = str;
                c29157Oooo.f103352OooOoo0 = 1;
            } else {
                it = ((Iterable) oooO0o.f74233OooOOOo.f121747OooOo0o.getValue()).iterator();
                while (true) {
                    if (it.hasNext()) {
                        next = null;
                        break;
                    }
                    next = it.next();
                    if (kotlin.jvm.internal.OooOOO0.OooO0O0(((OooO0O0) next).f74277OooO00o.getId(), str)) {
                        break;
                    }
                }
                OooO0O0 oooO0O0 = (OooO0O0) next;
                audioFile = oooO0O0 == null ? oooO0O0.f74277OooO00o : null;
                if (audioFile != null) {
                    C34406OooO00o.C20358OooO00o c20358OooO00o2 = C34406OooO00o.f123390OooO00o;
                    c20358OooO00o2.OooOOO0("MediaToolbarViewModel");
                    c20358OooO00o2.OooO0OO("startMediaPlayer. audioFile is null", new Object[0]);
                    return C32460OooOooO.f116667OooO00o;
                }
                String id = audioFile.getId();
                c29157Oooo.f103348OooOo0o = oooO0o;
                c29157Oooo.f103347OooOo = num;
                c29157Oooo.f103350OooOoO0 = null;
                c29157Oooo.f103352OooOoo0 = 2;
                if (oooO0o.OooOo0(id, c29157Oooo) != enumC32485OooO00o) {
                    com.orion.notein.p607ui.noteeditor.audio.OooO0OO oooO0OO = (com.orion.notein.p607ui.noteeditor.audio.OooO0OO) oooO0o.f74221OooO.getValue();
                    C34406OooO00o.C20358OooO00o c20358OooO00o3 = C34406OooO00o.f123390OooO00o;
                    c20358OooO00o3.OooOOO0("MediaToolbarViewModel");
                    c20358OooO00o3.OooO00o("startMediaPlayer. currentState: " + oooO0OO, new Object[0]);
                    if (num != null) {
                    }
                    OooO0O0.OooO oooO = new OooO0O0.OooO(oooO0o.f74242OooOoO.f121747OooOo0o.getValue(), "Start");
                    c29157Oooo.f103348OooOo0o = null;
                    c29157Oooo.f103347OooOo = null;
                    c29157Oooo.f103352OooOoo0 = 4;
                }
            }
            return enumC32485OooO00o;
        }
        if (i2 == 1) {
            str = c29157Oooo.f103350OooOoO0;
            num = c29157Oooo.f103347OooOo;
            oooO0o = c29157Oooo.f103348OooOo0o;
            C32446OooOOOo.OooO0O0(obj);
        } else if (i2 == 2) {
            Integer num2 = c29157Oooo.f103347OooOo;
            OooO0o oooO0o2 = c29157Oooo.f103348OooOo0o;
            C32446OooOOOo.OooO0O0(obj);
            num = num2;
            oooO0o = oooO0o2;
            com.orion.notein.p607ui.noteeditor.audio.OooO0OO oooO0OO2 = (com.orion.notein.p607ui.noteeditor.audio.OooO0OO) oooO0o.f74221OooO.getValue();
            C34406OooO00o.C20358OooO00o c20358OooO00o32 = C34406OooO00o.f123390OooO00o;
            c20358OooO00o32.OooOOO0("MediaToolbarViewModel");
            c20358OooO00o32.OooO00o("startMediaPlayer. currentState: " + oooO0OO2, new Object[0]);
            if (num != null) {
                OooO0O0.C23392OooO0oO c23392OooO0oO = new OooO0O0.C23392OooO0oO(num);
                c29157Oooo.f103348OooOo0o = oooO0o;
                c29157Oooo.f103347OooOo = null;
                c29157Oooo.f103352OooOoo0 = 3;
                if (oooO0o.OooOOOo(c23392OooO0oO) != enumC32485OooO00o) {
                }
                return enumC32485OooO00o;
            }
            OooO0O0.OooO oooO2 = new OooO0O0.OooO(oooO0o.f74242OooOoO.f121747OooOo0o.getValue(), "Start");
            c29157Oooo.f103348OooOo0o = null;
            c29157Oooo.f103347OooOo = null;
            c29157Oooo.f103352OooOoo0 = 4;
        } else {
            if (i2 != 3) {
                if (i2 != 4) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C32446OooOOOo.OooO0O0(obj);
                return C32460OooOooO.f116667OooO00o;
            }
            oooO0o = c29157Oooo.f103348OooOo0o;
            C32446OooOOOo.OooO0O0(obj);
            OooO0O0.OooO oooO22 = new OooO0O0.OooO(oooO0o.f74242OooOoO.f121747OooOo0o.getValue(), "Start");
            c29157Oooo.f103348OooOo0o = null;
            c29157Oooo.f103347OooOo = null;
            c29157Oooo.f103352OooOoo0 = 4;
        }
        if (oooO0o.f74226OooO0oo == null) {
            C34406OooO00o.C20358OooO00o c20358OooO00o4 = C34406OooO00o.f123390OooO00o;
            c20358OooO00o4.OooOOO0("MediaToolbarViewModel");
            c20358OooO00o4.OooO0OO("startMediaPlayer. mediaPlayer is null", new Object[0]);
            return C32460OooOooO.f116667OooO00o;
        }
        it = ((Iterable) oooO0o.f74233OooOOOo.f121747OooOo0o.getValue()).iterator();
        while (true) {
            if (it.hasNext()) {
            }
        }
        OooO0O0 oooO0O02 = (OooO0O0) next;
        if (oooO0O02 == null) {
        }
        if (audioFile != null) {
        }
    }

    public static final C32460OooOooO OooO0o(OooO0o oooO0o) {
        MediaPlayer mediaPlayer = oooO0o.f74226OooO0oo;
        Integer num = mediaPlayer != null ? new Integer(mediaPlayer.getAudioSessionId()) : null;
        if (num == null) {
            C34406OooO00o.C20358OooO00o c20358OooO00o = C34406OooO00o.f123390OooO00o;
            c20358OooO00o.OooOOO0("MediaToolbarViewModel");
            c20358OooO00o.OooO0OO("detectPlayerWaveform. sessionId is null", new Object[0]);
            return C32460OooOooO.f116667OooO00o;
        }
        Oooo0 oooo0 = new Oooo0(System.currentTimeMillis(), oooO0o);
        Visualizer visualizer = oooO0o.f74255Oooo0OO;
        if (visualizer != null) {
            visualizer.release();
        }
        oooO0o.f74255Oooo0OO = null;
        Visualizer visualizer2 = new Visualizer(num.intValue());
        visualizer2.setCaptureSize(Visualizer.getCaptureSizeRange()[1]);
        oooO0o.f74255Oooo0OO = visualizer2;
        C25261OooO0o0.OooO0OO(visualizer2.setDataCaptureListener(oooo0, Visualizer.getMaxCaptureRate() / 2, true, false));
        Visualizer visualizer3 = oooO0o.f74255Oooo0OO;
        if (visualizer3 != null) {
            visualizer3.setEnabled(true);
        }
        return C32460OooOooO.f116667OooO00o;
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x003d A[PHI: r7
      0x003d: PHI (r7v3 com.orion.notein.ui.noteeditor.audio.OooO0o) = (r7v1 com.orion.notein.ui.noteeditor.audio.OooO0o), (r7v4 com.orion.notein.ui.noteeditor.audio.OooO0o) binds: [B:16:0x003a, B:21:0x0058] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x004e A[PHI: r7
      0x004e: PHI (r7v4 com.orion.notein.ui.noteeditor.audio.OooO0o) = (r7v3 com.orion.notein.ui.noteeditor.audio.OooO0o), (r7v5 com.orion.notein.ui.noteeditor.audio.OooO0o) binds: [B:18:0x004b, B:15:0x0034] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0016  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:21:0x0058 -> B:17:0x003d). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void OooO0o0(OooO0o oooO0o, AbstractC32479OooO0OO abstractC32479OooO0OO) {
        C29158Oooo00O c29158Oooo00O;
        C29159Oooo00o c29159Oooo00o;
        oooO0o.getClass();
        if (abstractC32479OooO0OO instanceof C29158Oooo00O) {
            c29158Oooo00O = (C29158Oooo00O) abstractC32479OooO0OO;
            int i = c29158Oooo00O.f103363OooOoO;
            if ((i & Integer.MIN_VALUE) != 0) {
                c29158Oooo00O.f103363OooOoO = i - Integer.MIN_VALUE;
            } else {
                c29158Oooo00O = new C29158Oooo00O(oooO0o, abstractC32479OooO0OO);
            }
        }
        Object obj = c29158Oooo00O.f103361OooOo;
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i2 = c29158Oooo00O.f103363OooOoO;
        if (i2 != 0) {
            if (i2 == 1) {
                oooO0o = c29158Oooo00O.f103362OooOo0o;
                C32446OooOOOo.OooO0O0(obj);
                c29158Oooo00O.f103362OooOo0o = oooO0o;
                c29158Oooo00O.f103363OooOoO = 2;
                if (C33644OoooO0.OooO00o(32L, c29158Oooo00O) != enumC32485OooO00o) {
                    c29159Oooo00o = new C29159Oooo00o(oooO0o, null);
                    c29158Oooo00O.f103362OooOo0o = oooO0o;
                    c29158Oooo00O.f103363OooOoO = 1;
                    if (oooO0o.Oooo0o(c29159Oooo00o, c29158Oooo00O) != enumC32485OooO00o) {
                        c29158Oooo00O.f103362OooOo0o = oooO0o;
                        c29158Oooo00O.f103363OooOoO = 2;
                        if (C33644OoooO0.OooO00o(32L, c29158Oooo00O) != enumC32485OooO00o) {
                        }
                    }
                }
                EnumC32485OooO00o enumC32485OooO00o2 = EnumC32485OooO00o.f116726OooOo0o;
            }
            if (i2 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oooO0o = c29158Oooo00O.f103362OooOo0o;
        }
        C32446OooOOOo.OooO0O0(obj);
        c29159Oooo00o = new C29159Oooo00o(oooO0o, null);
        c29158Oooo00O.f103362OooOo0o = oooO0o;
        c29158Oooo00O.f103363OooOoO = 1;
        if (oooO0o.Oooo0o(c29159Oooo00o, c29158Oooo00O) != enumC32485OooO00o) {
        }
        EnumC32485OooO00o enumC32485OooO00o22 = EnumC32485OooO00o.f116726OooOo0o;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void OooO0oO(OooO0o oooO0o, AbstractC32479OooO0OO abstractC32479OooO0OO) {
        C29160Oooo0O0 c29160Oooo0O0;
        oooO0o.getClass();
        if (abstractC32479OooO0OO instanceof C29160Oooo0O0) {
            c29160Oooo0O0 = (C29160Oooo0O0) abstractC32479OooO0OO;
            int i = c29160Oooo0O0.f103368OooOoO;
            if ((i & Integer.MIN_VALUE) != 0) {
                c29160Oooo0O0.f103368OooOoO = i - Integer.MIN_VALUE;
            } else {
                c29160Oooo0O0 = new C29160Oooo0O0(oooO0o, abstractC32479OooO0OO);
            }
        }
        Object obj = c29160Oooo0O0.f103366OooOo;
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i2 = c29160Oooo0O0.f103368OooOoO;
        if (i2 != 0) {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oooO0o = c29160Oooo0O0.f103367OooOo0o;
        }
        C32446OooOOOo.OooO0O0(obj);
        do {
            float[] fArr = new float[7];
            for (int i3 = 0; i3 < 7; i3++) {
                oO0O00o.OooO0OO.f116801OooOo0o.getClass();
                float fNextFloat = oO0O00o.OooO0OO.f116800OooOo.OooO0O0().nextFloat();
                if (fNextFloat < 0.2f) {
                    fNextFloat = 0.2f;
                }
                if (fNextFloat > 0.8f) {
                    fNextFloat = 0.8f;
                }
                fArr[i3] = fNextFloat;
            }
            C33781o00o0O c33781o00o0O = oooO0o.f74236OooOOoo;
            List<Float> listOoooO0O = oOo000Oo.OooOOO.OoooO0O(fArr);
            c33781o00o0O.getClass();
            c33781o00o0O.OooOO0(null, listOoooO0O);
            c29160Oooo0O0.f103367OooOo0o = oooO0o;
            c29160Oooo0O0.f103368OooOoO = 1;
        } while (C33644OoooO0.OooO00o(100L, c29160Oooo0O0) != enumC32485OooO00o);
        EnumC32485OooO00o enumC32485OooO00o2 = EnumC32485OooO00o.f116726OooOo0o;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0020  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object OooO0oo(OooO0o oooO0o, Uri uri, String str, AbstractC32479OooO0OO abstractC32479OooO0OO) {
        C29161Oooo0OO c29161Oooo0OO;
        Long l;
        String str2;
        String str3;
        OooO0o oooO0o2 = oooO0o;
        Uri uri2 = uri;
        String str4 = str;
        oooO0o2.getClass();
        if (abstractC32479OooO0OO instanceof C29161Oooo0OO) {
            c29161Oooo0OO = (C29161Oooo0OO) abstractC32479OooO0OO;
            int i = c29161Oooo0OO.f103378OooOooo;
            if ((i & Integer.MIN_VALUE) != 0) {
                c29161Oooo0OO.f103378OooOooo = i - Integer.MIN_VALUE;
            } else {
                c29161Oooo0OO = new C29161Oooo0OO(oooO0o2, abstractC32479OooO0OO);
            }
        }
        Object obj = c29161Oooo0OO.f103375OooOoo;
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i2 = c29161Oooo0OO.f103378OooOooo;
        if (i2 == 0) {
            C32446OooOOOo.OooO0O0(obj);
            String string = UUID.randomUUID().toString();
            kotlin.jvm.internal.OooOOO0.OooO0o(string, "toString(...)");
            Context context = oooO0o2.f74222OooO0Oo;
            String strOooO0o = C32501OooO0oO.OooO0o(new File(C28692OooO0oo.OooO0OO(context, uri2)));
            MediaPlayer mediaPlayer = new MediaPlayer();
            try {
                try {
                    mediaPlayer.setDataSource(context, uri2);
                    mediaPlayer.prepare();
                    l = new Long(mediaPlayer.getDuration());
                } catch (Exception unused) {
                    C34406OooO00o.C20358OooO00o c20358OooO00o = C34406OooO00o.f123390OooO00o;
                    c20358OooO00o.OooOOO0("MediaToolbarViewModel");
                    c20358OooO00o.OooO0OO("insertAudioFiles. setDataSource failed. " + uri2, new Object[0]);
                    mediaPlayer.release();
                    l = null;
                }
                if (l == null) {
                    C34406OooO00o.C20358OooO00o c20358OooO00o2 = C34406OooO00o.f123390OooO00o;
                    c20358OooO00o2.OooOOO0("MediaToolbarViewModel");
                    c20358OooO00o2.OooO0OO("insertAudioFiles. audioDuration is null. " + uri2, new Object[0]);
                    return C32460OooOooO.f116667OooO00o;
                }
                c29161Oooo0OO.f103371OooOo0o = oooO0o2;
                c29161Oooo0OO.f103370OooOo = uri2;
                c29161Oooo0OO.f103373OooOoO0 = str4;
                c29161Oooo0OO.f103372OooOoO = string;
                c29161Oooo0OO.f103374OooOoOO = strOooO0o;
                c29161Oooo0OO.f103376OooOoo0 = l;
                c29161Oooo0OO.f103378OooOooo = 1;
                Object objOooOOO = oooO0o2.OooOOO(uri2, str4, string, c29161Oooo0OO);
                if (objOooOOO == enumC32485OooO00o) {
                    return enumC32485OooO00o;
                }
                str2 = string;
                obj = objOooOOO;
                str3 = strOooO0o;
            } finally {
                mediaPlayer.release();
            }
        } else {
            if (i2 != 1) {
                if (i2 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C32446OooOOOo.OooO0O0(obj);
                return C32460OooOooO.f116667OooO00o;
            }
            Long l2 = c29161Oooo0OO.f103376OooOoo0;
            String str5 = c29161Oooo0OO.f103374OooOoOO;
            String str6 = c29161Oooo0OO.f103372OooOoO;
            String str7 = c29161Oooo0OO.f103373OooOoO0;
            Uri uri3 = c29161Oooo0OO.f103370OooOo;
            OooO0o oooO0o3 = c29161Oooo0OO.f103371OooOo0o;
            C32446OooOOOo.OooO0O0(obj);
            str3 = str5;
            str2 = str6;
            str4 = str7;
            uri2 = uri3;
            l = l2;
            oooO0o2 = oooO0o3;
        }
        String str8 = (String) obj;
        if (!C31190OooO0oo.OooO0O0(oooO0o2.f74222OooO0Oo, uri2, new File(str8))) {
            C34406OooO00o.C20358OooO00o c20358OooO00o3 = C34406OooO00o.f123390OooO00o;
            c20358OooO00o3.OooOOO0("MediaToolbarViewModel");
            c20358OooO00o3.OooO0OO("insertAudioFiles. copy file failed", new Object[0]);
            return C32460OooOooO.f116667OooO00o;
        }
        AudioFile audioFile = new AudioFile(str2, str8, str3, l.longValue(), 1.0f, System.currentTimeMillis(), System.currentTimeMillis());
        c29161Oooo0OO.f103371OooOo0o = null;
        c29161Oooo0OO.f103370OooOo = null;
        c29161Oooo0OO.f103373OooOoO0 = null;
        c29161Oooo0OO.f103372OooOoO = null;
        c29161Oooo0OO.f103374OooOoOO = null;
        c29161Oooo0OO.f103376OooOoo0 = null;
        c29161Oooo0OO.f103378OooOooo = 2;
        if (oooO0o2.OooOoo0(audioFile, str4, c29161Oooo0OO) == enumC32485OooO00o) {
            return enumC32485OooO00o;
        }
        return C32460OooOooO.f116667OooO00o;
    }

    /* JADX WARN: Code restructure failed: missing block: B:30:0x00b0, code lost:
    
        if (r13.OooOOO0(r0) == r1) goto L77;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x00c8, code lost:
    
        if (r13.OooOOO0(r0) == r1) goto L77;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x0112, code lost:
    
        if (r13.OooOOO0(r0) == r1) goto L77;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object OooOO0(OooO0o oooO0o, Long l, AbstractC32479OooO0OO abstractC32479OooO0OO) {
        C29169OoooO0O c29169OoooO0O;
        MediaRecorder mediaRecorder;
        OooO0o oooO0o2;
        Long l2;
        if (abstractC32479OooO0OO instanceof C29169OoooO0O) {
            c29169OoooO0O = (C29169OoooO0O) abstractC32479OooO0OO;
            int i = c29169OoooO0O.f103432OooOoo0;
            if ((i & Integer.MIN_VALUE) != 0) {
                c29169OoooO0O.f103432OooOoo0 = i - Integer.MIN_VALUE;
            } else {
                c29169OoooO0O = new C29169OoooO0O(oooO0o, abstractC32479OooO0OO);
            }
        }
        Object obj = c29169OoooO0O.f103429OooOoO;
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i2 = c29169OoooO0O.f103432OooOoo0;
        if (i2 == 0) {
            C32446OooOOOo.OooO0O0(obj);
            if (oooO0o.f74228OooOO0O == null) {
                oooO0o.OooOoOO();
            }
            mediaRecorder = oooO0o.f74228OooOO0O;
            if (mediaRecorder == null) {
                C34406OooO00o.C20358OooO00o c20358OooO00o = C34406OooO00o.f123390OooO00o;
                c20358OooO00o.OooOOO0("MediaToolbarViewModel");
                c20358OooO00o.OooOO0O("startMediaRecorderLocked. mediaPlayer is null", new Object[0]);
                return C32460OooOooO.f116667OooO00o;
            }
            AbstractC23415OooO0o0 abstractC23415OooO0o0 = (AbstractC23415OooO0o0) oooO0o.f74229OooOO0o.getValue();
            C34406OooO00o.C20358OooO00o c20358OooO00o2 = C34406OooO00o.f123390OooO00o;
            c20358OooO00o2.OooOOO0("MediaToolbarViewModel");
            c20358OooO00o2.OooO0o0("startMediaRecorderLocked. currentState: ".concat(abstractC23415OooO0o0.f74390OooO00o), new Object[0]);
            if (abstractC23415OooO0o0 instanceof AbstractC23415OooO0o0.OooO0OO) {
                OooOooo(oooO0o);
                c29169OoooO0O.f103428OooOo0o = oooO0o;
                c29169OoooO0O.f103427OooOo = l;
                c29169OoooO0O.f103430OooOoO0 = mediaRecorder;
                c29169OoooO0O.f103432OooOoo0 = 1;
            } else if (abstractC23415OooO0o0 instanceof AbstractC23415OooO0o0.C23416OooO0Oo) {
                c29169OoooO0O.f103428OooOo0o = oooO0o;
                c29169OoooO0O.f103427OooOo = l;
                c29169OoooO0O.f103430OooOoO0 = mediaRecorder;
                c29169OoooO0O.f103432OooOoo0 = 2;
            } else if (abstractC23415OooO0o0 instanceof AbstractC23415OooO0o0.OooO00o) {
                oooO0o.OooOo0O();
            } else if (!(abstractC23415OooO0o0 instanceof AbstractC23415OooO0o0.OooO0o) && !(abstractC23415OooO0o0 instanceof AbstractC23415OooO0o0.C19293OooO0o0)) {
                boolean z = abstractC23415OooO0o0 instanceof AbstractC23415OooO0o0.C23417OooO0oO;
                if (!z && !(abstractC23415OooO0o0 instanceof AbstractC23415OooO0o0.C23418OooO0oo) && !(abstractC23415OooO0o0 instanceof AbstractC23415OooO0o0.OooO0O0)) {
                    throw new C32442OooOO0o();
                }
                if (z) {
                    c20358OooO00o2.OooOOO0("MediaToolbarViewModel");
                    c20358OooO00o2.OooOO0O("startMediaRecorderLocked. mediaRecorder is recording", new Object[0]);
                }
                oooO0o.OooOoOO();
                OooOooo(oooO0o);
                c29169OoooO0O.f103428OooOo0o = oooO0o;
                c29169OoooO0O.f103427OooOo = l;
                c29169OoooO0O.f103430OooOoO0 = mediaRecorder;
                c29169OoooO0O.f103432OooOoo0 = 3;
            }
            return enumC32485OooO00o;
        }
        if (i2 == 1) {
            MediaRecorder mediaRecorder2 = c29169OoooO0O.f103430OooOoO0;
            l = c29169OoooO0O.f103427OooOo;
            OooO0o oooO0o3 = c29169OoooO0O.f103428OooOo0o;
            C32446OooOOOo.OooO0O0(obj);
            mediaRecorder = mediaRecorder2;
            oooO0o = oooO0o3;
            oooO0o.OooOo0O();
        } else if (i2 == 2) {
            MediaRecorder mediaRecorder3 = c29169OoooO0O.f103430OooOoO0;
            l = c29169OoooO0O.f103427OooOo;
            OooO0o oooO0o4 = c29169OoooO0O.f103428OooOo0o;
            C32446OooOOOo.OooO0O0(obj);
            mediaRecorder = mediaRecorder3;
            oooO0o = oooO0o4;
            oooO0o.OooOo0O();
        } else {
            if (i2 != 3) {
                if (i2 != 4) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                l2 = c29169OoooO0O.f103427OooOo;
                oooO0o2 = c29169OoooO0O.f103428OooOo0o;
                C32446OooOOOo.OooO0O0(obj);
                if (l2 != null && l2.longValue() > 0) {
                    oooO0o2.f74259Oooo0oo.postDelayed(oooO0o2.f74260OoooO0, l2.longValue());
                }
                return C32460OooOooO.f116667OooO00o;
            }
            MediaRecorder mediaRecorder4 = c29169OoooO0O.f103430OooOoO0;
            l = c29169OoooO0O.f103427OooOo;
            OooO0o oooO0o5 = c29169OoooO0O.f103428OooOo0o;
            C32446OooOOOo.OooO0O0(obj);
            mediaRecorder = mediaRecorder4;
            oooO0o = oooO0o5;
            oooO0o.OooOo0O();
        }
        AbstractC23397OooO0Oo.C23399OooO0oO c23399OooO0oO = new AbstractC23397OooO0Oo.C23399OooO0oO(null, "Start");
        C33781o00o0O c33781o00o0O = oooO0o.f74229OooOO0o;
        AbstractC23415OooO0o0 abstractC23415OooO0o02 = (AbstractC23415OooO0o0) c33781o00o0O.getValue();
        AbstractC23415OooO0o0 abstractC23415OooO0o0OooO0O0 = ((AbstractC23415OooO0o0) c33781o00o0O.getValue()).OooO0O0(c23399OooO0oO, mediaRecorder, oooO0o.f74222OooO0Oo);
        c33781o00o0O.OooOO0(null, abstractC23415OooO0o0OooO0O0);
        oooO0o.f74235OooOOo0.setValue(null);
        if (abstractC23415OooO0o0OooO0O0 instanceof AbstractC23415OooO0o0.C23417OooO0oO) {
            Bundle bundle = abstractC23415OooO0o0OooO0O0.f74391OooO0O0;
            String string = bundle != null ? bundle.getString("output_path") : null;
            if (string != null) {
                String strOooO0o = C32501OooO0oO.OooO0o(new File(string));
                C33781o00o0O c33781o00o0O2 = oooO0o.f74238OooOo0;
                c33781o00o0O2.getClass();
                c33781o00o0O2.OooOO0(null, strOooO0o);
                if (abstractC23415OooO0o02 instanceof AbstractC23415OooO0o0.OooO0o) {
                    String str = (String) oooO0o.f74230OooOOO.getValue();
                    if (str == null) {
                        return C32460OooOooO.f116667OooO00o;
                    }
                    c29169OoooO0O.f103428OooOo0o = oooO0o;
                    c29169OoooO0O.f103427OooOo = l;
                    c29169OoooO0O.f103430OooOoO0 = null;
                    c29169OoooO0O.f103432OooOoo0 = 4;
                    if (oooO0o.OooOoo(string, str, c29169OoooO0O) != enumC32485OooO00o) {
                        Long l3 = l;
                        oooO0o2 = oooO0o;
                        l2 = l3;
                        if (l2 != null) {
                            oooO0o2.f74259Oooo0oo.postDelayed(oooO0o2.f74260OoooO0, l2.longValue());
                        }
                    }
                    return enumC32485OooO00o;
                }
            }
        }
        return C32460OooOooO.f116667OooO00o;
    }

    /* JADX WARN: Code restructure failed: missing block: B:98:0x0298, code lost:
    
        if (r0 == r4) goto L99;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:75:0x01df  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0019  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0225  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0267 A[LOOP:0: B:91:0x0261->B:93:0x0267, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0296  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object OooOO0O(OooO0o oooO0o, String str, List list, List list2, long j, AbstractC32479OooO0OO abstractC32479OooO0OO) {
        C29176Ooooo00 c29176Ooooo00;
        String str2;
        Integer num;
        List list3;
        Object objOooOo0O;
        String str3;
        List<InterfaceC31284OooO0O0> list4;
        String str4;
        long j2;
        Integer num2;
        List list5;
        String str5;
        OooO0o oooO0o2;
        long j3;
        String str6;
        ArrayList arrayList;
        List list6;
        String str7;
        OooO0o oooO0o3;
        Iterator it;
        Object objOooOOO;
        OooO0o oooO0o4 = oooO0o;
        if (abstractC32479OooO0OO instanceof C29176Ooooo00) {
            c29176Ooooo00 = (C29176Ooooo00) abstractC32479OooO0OO;
            int i = c29176Ooooo00.f103470Oooo000;
            if ((i & Integer.MIN_VALUE) != 0) {
                c29176Ooooo00.f103470Oooo000 = i - Integer.MIN_VALUE;
            } else {
                c29176Ooooo00 = new C29176Ooooo00(oooO0o4, abstractC32479OooO0OO);
            }
        }
        Object obj = c29176Ooooo00.f103468OooOooO;
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i2 = c29176Ooooo00.f103470Oooo000;
        if (i2 == 0) {
            C32446OooOOOo.OooO0O0(obj);
            if (oooO0o4.OooOOo0()) {
                str2 = (String) oooO0o4.f74235OooOOo0.getValue();
                if (str2 == null) {
                    C34406OooO00o.C20358OooO00o c20358OooO00o = C34406OooO00o.f123390OooO00o;
                    c20358OooO00o.OooOOO0("MediaToolbarViewModel");
                    c20358OooO00o.OooOO0("insertAudioSyncRecord. activeAudioFileId is null", new Object[0]);
                    return C32460OooOooO.f116667OooO00o;
                }
                C29194OooO00o c29194OooO00o = (C29194OooO00o) oooO0o4.f74239OooOo00.f121747OooOo0o.getValue();
                int i3 = c29194OooO00o != null ? c29194OooO00o.f103546OooO0OO : -1;
                if (i3 < 0) {
                    C34406OooO00o.C20358OooO00o c20358OooO00o2 = C34406OooO00o.f123390OooO00o;
                    c20358OooO00o2.OooOOO0("MediaToolbarViewModel");
                    c20358OooO00o2.OooOO0("insertAudioSyncRecord. currentPosition < 0", new Object[0]);
                    return C32460OooOooO.f116667OooO00o;
                }
                num = new Integer(i3);
            } else if (oooO0o4.OooOOo()) {
                C29195OooO0O0 c29195OooO0O0 = (C29195OooO0O0) oooO0o4.f74237OooOo.f121747OooOo0o.getValue();
                if (c29195OooO0O0 == null) {
                    return C32460OooOooO.f116667OooO00o;
                }
                int i4 = c29195OooO0O0.f103553OooO0O0;
                if (i4 < 0) {
                    C34406OooO00o.C20358OooO00o c20358OooO00o3 = C34406OooO00o.f123390OooO00o;
                    c20358OooO00o3.OooOOO0("MediaToolbarViewModel");
                    c20358OooO00o3.OooO00o("insertAudioSyncRecord. audioFileId is null", new Object[0]);
                    return C32460OooOooO.f116667OooO00o;
                }
                num = new Integer(i4);
                str2 = c29195OooO0O0.f103552OooO00o;
            } else {
                str2 = null;
                num = null;
            }
            List list7 = list;
            ArrayList arrayList2 = new ArrayList(C34428OooOOo.OooOOoo(list7, 10));
            Iterator it2 = list7.iterator();
            while (it2.hasNext()) {
                arrayList2.add(((InterfaceC31284OooO0O0) it2.next()).getId());
            }
            Set setO0OO00O = oOo000Oo.OooOo.o0OO00O(arrayList2);
            c29176Ooooo00.f103462OooOo0o = oooO0o4;
            c29176Ooooo00.f103461OooOo = str;
            c29176Ooooo00.f103464OooOoO0 = list;
            list3 = list2;
            c29176Ooooo00.f103463OooOoO = list3;
            c29176Ooooo00.f103465OooOoOO = str2;
            c29176Ooooo00.f103467OooOoo0 = num;
            c29176Ooooo00.f103466OooOoo = j;
            c29176Ooooo00.f103470Oooo000 = 1;
            objOooOo0O = oooO0o4.f74223OooO0o.f97084OooO00o.OooOo0O(setO0OO00O, str, c29176Ooooo00);
            if (objOooOo0O != enumC32485OooO00o) {
                str3 = str2;
                list4 = list;
                str4 = str;
                j2 = j;
            }
            return enumC32485OooO00o;
        }
        if (i2 == 1) {
            long j4 = c29176Ooooo00.f103466OooOoo;
            num = (Integer) c29176Ooooo00.f103467OooOoo0;
            str3 = (String) c29176Ooooo00.f103465OooOoOO;
            list3 = (List) c29176Ooooo00.f103463OooOoO;
            list4 = c29176Ooooo00.f103464OooOoO0;
            str4 = c29176Ooooo00.f103461OooOo;
            OooO0o oooO0o5 = c29176Ooooo00.f103462OooOo0o;
            C32446OooOOOo.OooO0O0(obj);
            objOooOo0O = obj;
            j2 = j4;
            oooO0o4 = oooO0o5;
        } else if (i2 == 2) {
            j3 = c29176Ooooo00.f103466OooOoo;
            list5 = (List) c29176Ooooo00.f103467OooOoo0;
            num2 = (Integer) c29176Ooooo00.f103465OooOoOO;
            str3 = (String) c29176Ooooo00.f103463OooOoO;
            list3 = c29176Ooooo00.f103464OooOoO0;
            str5 = c29176Ooooo00.f103461OooOo;
            oooO0o2 = c29176Ooooo00.f103462OooOo0o;
            C32446OooOOOo.OooO0O0(obj);
            str6 = str3;
            if (str6 != null && num2 != null) {
                List<InterfaceC31284OooO0O0> list8 = list5;
                arrayList = new ArrayList(C34428OooOOo.OooOOoo(list8, 10));
                for (InterfaceC31284OooO0O0 interfaceC31284OooO0O0 : list8) {
                    int iIntValue = num2.intValue() - ((int) (j3 - interfaceC31284OooO0O0.getCreationTime()));
                    arrayList.add(new AudioSyncRecord(C24761OooO.OooO00o("toString(...)"), str6, iIntValue < 0 ? 0 : iIntValue, interfaceC31284OooO0O0.getId(), interfaceC31284OooO0O0.getItemType(), System.currentTimeMillis(), System.currentTimeMillis(), false, 128, null));
                }
                if (arrayList.isEmpty()) {
                    C27610OooO0o0 c27610OooO0o0 = oooO0o2.f74223OooO0o;
                    c29176Ooooo00.f103462OooOo0o = oooO0o2;
                    c29176Ooooo00.f103461OooOo = str5;
                    c29176Ooooo00.f103464OooOoO0 = list3;
                    c29176Ooooo00.f103463OooOoO = null;
                    c29176Ooooo00.f103465OooOoOO = null;
                    c29176Ooooo00.f103467OooOoo0 = null;
                    c29176Ooooo00.f103470Oooo000 = 3;
                    Object objOooOO0O = c27610OooO0o0.f97084OooO00o.OooOO0O(arrayList, str5, c29176Ooooo00);
                    if (objOooOO0O != EnumC32485OooO00o.f116726OooOo0o) {
                        objOooOO0O = C32460OooOooO.f116667OooO00o;
                    }
                    if (objOooOO0O != enumC32485OooO00o) {
                        list6 = list3;
                        str7 = str5;
                        oooO0o3 = oooO0o2;
                        list3 = list6;
                        str5 = str7;
                        oooO0o2 = oooO0o3;
                    }
                }
                return enumC32485OooO00o;
            }
            List list9 = list3;
            ArrayList arrayList3 = new ArrayList(C34428OooOOo.OooOOoo(list9, 10));
            it = list9.iterator();
            while (it.hasNext()) {
            }
            Set setO0OO00O2 = oOo000Oo.OooOo.o0OO00O(arrayList3);
            C27610OooO0o0 c27610OooO0o02 = oooO0o2.f74223OooO0o;
            c29176Ooooo00.f103462OooOo0o = null;
            c29176Ooooo00.f103461OooOo = null;
            c29176Ooooo00.f103464OooOoO0 = null;
            c29176Ooooo00.f103463OooOoO = null;
            c29176Ooooo00.f103465OooOoOO = null;
            c29176Ooooo00.f103467OooOoo0 = null;
            c29176Ooooo00.f103470Oooo000 = 4;
            objOooOOO = c27610OooO0o02.f97084OooO00o.OooOOO(setO0OO00O2, str5, c29176Ooooo00);
            if (objOooOOO != EnumC32485OooO00o.f116726OooOo0o) {
            }
        } else {
            if (i2 != 3) {
                if (i2 != 4) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C32446OooOOOo.OooO0O0(obj);
                return C32460OooOooO.f116667OooO00o;
            }
            list6 = c29176Ooooo00.f103464OooOoO0;
            str7 = c29176Ooooo00.f103461OooOo;
            oooO0o3 = c29176Ooooo00.f103462OooOo0o;
            C32446OooOOOo.OooO0O0(obj);
            list3 = list6;
            str5 = str7;
            oooO0o2 = oooO0o3;
            List list92 = list3;
            ArrayList arrayList32 = new ArrayList(C34428OooOOo.OooOOoo(list92, 10));
            it = list92.iterator();
            while (it.hasNext()) {
                arrayList32.add(((InterfaceC31284OooO0O0) it.next()).getId());
            }
            Set setO0OO00O22 = oOo000Oo.OooOo.o0OO00O(arrayList32);
            C27610OooO0o0 c27610OooO0o022 = oooO0o2.f74223OooO0o;
            c29176Ooooo00.f103462OooOo0o = null;
            c29176Ooooo00.f103461OooOo = null;
            c29176Ooooo00.f103464OooOoO0 = null;
            c29176Ooooo00.f103463OooOoO = null;
            c29176Ooooo00.f103465OooOoOO = null;
            c29176Ooooo00.f103467OooOoo0 = null;
            c29176Ooooo00.f103470Oooo000 = 4;
            objOooOOO = c27610OooO0o022.f97084OooO00o.OooOOO(setO0OO00O22, str5, c29176Ooooo00);
            if (objOooOOO != EnumC32485OooO00o.f116726OooOo0o) {
                objOooOOO = C32460OooOooO.f116667OooO00o;
            }
        }
        Set setO0OO00O3 = oOo000Oo.OooOo.o0OO00O((Iterable) objOooOo0O);
        ArrayList arrayList4 = new ArrayList();
        ArrayList arrayList5 = new ArrayList();
        for (InterfaceC31284OooO0O0 interfaceC31284OooO0O02 : list4) {
            if (setO0OO00O3.contains(interfaceC31284OooO0O02.getId())) {
                arrayList4.add(interfaceC31284OooO0O02);
            } else {
                arrayList5.add(interfaceC31284OooO0O02);
            }
        }
        C27610OooO0o0 c27610OooO0o03 = oooO0o4.f74223OooO0o;
        c29176Ooooo00.f103462OooOo0o = oooO0o4;
        c29176Ooooo00.f103461OooOo = str4;
        c29176Ooooo00.f103464OooOoO0 = list3;
        c29176Ooooo00.f103463OooOoO = str3;
        c29176Ooooo00.f103465OooOoOO = num;
        c29176Ooooo00.f103467OooOoo0 = arrayList5;
        c29176Ooooo00.f103466OooOoo = j2;
        c29176Ooooo00.f103470Oooo000 = 2;
        Object objOooO0o0 = c27610OooO0o03.f97084OooO00o.OooO0o0(setO0OO00O3, str4, c29176Ooooo00);
        if (objOooO0o0 != EnumC32485OooO00o.f116726OooOo0o) {
            objOooO0o0 = C32460OooOooO.f116667OooO00o;
        }
        if (objOooO0o0 != enumC32485OooO00o) {
            num2 = num;
            list5 = arrayList5;
            str5 = str4;
            oooO0o2 = oooO0o4;
            j3 = j2;
            str6 = str3;
            if (str6 != null) {
                List<InterfaceC31284OooO0O0> list82 = list5;
                arrayList = new ArrayList(C34428OooOOo.OooOOoo(list82, 10));
                while (r5.hasNext()) {
                }
                if (arrayList.isEmpty()) {
                }
            }
            List list922 = list3;
            ArrayList arrayList322 = new ArrayList(C34428OooOOo.OooOOoo(list922, 10));
            it = list922.iterator();
            while (it.hasNext()) {
            }
            Set setO0OO00O222 = oOo000Oo.OooOo.o0OO00O(arrayList322);
            C27610OooO0o0 c27610OooO0o0222 = oooO0o2.f74223OooO0o;
            c29176Ooooo00.f103462OooOo0o = null;
            c29176Ooooo00.f103461OooOo = null;
            c29176Ooooo00.f103464OooOoO0 = null;
            c29176Ooooo00.f103463OooOoO = null;
            c29176Ooooo00.f103465OooOoOO = null;
            c29176Ooooo00.f103467OooOoo0 = null;
            c29176Ooooo00.f103470Oooo000 = 4;
            objOooOOO = c27610OooO0o0222.f97084OooO00o.OooOOO(setO0OO00O222, str5, c29176Ooooo00);
            if (objOooOOO != EnumC32485OooO00o.f116726OooOo0o) {
            }
        }
        return enumC32485OooO00o;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(10:0|2|(2:4|(1:6)(1:7))(0)|8|(1:(1:(5:12|45|13|39|40)(2:19|20))(1:21))(3:22|(0)|27)|48|25|(3:28|39|40)|27|(2:(0)|(1:47))) */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0077, code lost:
    
        r9 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0078, code lost:
    
        r8 = r10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x007a, code lost:
    
        r9 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x007b, code lost:
    
        r9 = r8;
        r8 = r10;
        r10 = r9;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0018  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object OooOO0o(OooO0o oooO0o, InterfaceC32507OooOO0o interfaceC32507OooOO0o, AbstractC32479OooO0OO abstractC32479OooO0OO) throws Throwable {
        C29180OooooOo c29180OooooOo;
        C33898OooO0Oo c33898OooO0Oo;
        InterfaceC33895OooO00o interfaceC33895OooO00o;
        oooO0o.getClass();
        if (abstractC32479OooO0OO instanceof C29180OooooOo) {
            c29180OooooOo = (C29180OooooOo) abstractC32479OooO0OO;
            int i = c29180OooooOo.f103489OooOoo0;
            if ((i & Integer.MIN_VALUE) != 0) {
                c29180OooooOo.f103489OooOoo0 = i - Integer.MIN_VALUE;
            } else {
                c29180OooooOo = new C29180OooooOo(oooO0o, abstractC32479OooO0OO);
            }
        }
        Object obj = c29180OooooOo.f103486OooOoO;
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i2 = c29180OooooOo.f103489OooOoo0;
        if (i2 == 0) {
            C32446OooOOOo.OooO0O0(obj);
            c29180OooooOo.f103485OooOo0o = oooO0o;
            c29180OooooOo.f103484OooOo = interfaceC32507OooOO0o;
            c33898OooO0Oo = oooO0o.f74252Oooo00O;
            c29180OooooOo.f103487OooOoO0 = c33898OooO0Oo;
            c29180OooooOo.f103489OooOoo0 = 1;
            if (c33898OooO0Oo.OooO00o(c29180OooooOo) != enumC32485OooO00o) {
            }
            return enumC32485OooO00o;
        }
        if (i2 != 1) {
            if (i2 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            interfaceC33895OooO00o = (InterfaceC33895OooO00o) c29180OooooOo.f103484OooOo;
            OooO0o oooO0o2 = c29180OooooOo.f103485OooOo0o;
            try {
                try {
                    C32446OooOOOo.OooO0O0(obj);
                } catch (Exception e) {
                    Exception e2 = e;
                    C34406OooO00o.C20358OooO00o c20358OooO00o = C34406OooO00o.f123390OooO00o;
                    c20358OooO00o.OooOOO0("MediaToolbarViewModel");
                    c20358OooO00o.OooO0Oo(e2, "Error while acquiring recorderStateLock", new Object[0]);
                    try {
                        oooO0o2.OooOo();
                    } catch (Exception e3) {
                        C34406OooO00o.C20358OooO00o c20358OooO00o2 = C34406OooO00o.f123390OooO00o;
                        c20358OooO00o2.OooOOO0("MediaToolbarViewModel");
                        c20358OooO00o2.OooO0Oo(e3, "Error while releasing MediaPlayer", new Object[0]);
                    }
                    C32460OooOooO c32460OooOooO = C32460OooOooO.f116667OooO00o;
                }
                interfaceC33895OooO00o.OooOOO0(null);
                return C32460OooOooO.f116667OooO00o;
            } catch (Throwable th) {
                th = th;
                interfaceC33895OooO00o.OooOOO0(null);
                throw th;
            }
        }
        C33898OooO0Oo c33898OooO0Oo2 = c29180OooooOo.f103487OooOoO0;
        interfaceC32507OooOO0o = (InterfaceC32507OooOO0o) c29180OooooOo.f103484OooOo;
        OooO0o oooO0o3 = c29180OooooOo.f103485OooOo0o;
        C32446OooOOOo.OooO0O0(obj);
        c33898OooO0Oo = c33898OooO0Oo2;
        oooO0o = oooO0o3;
        c29180OooooOo.f103485OooOo0o = oooO0o;
        c29180OooooOo.f103484OooOo = c33898OooO0Oo;
        c29180OooooOo.f103487OooOoO0 = null;
        c29180OooooOo.f103489OooOoo0 = 2;
        if (interfaceC32507OooOO0o.invoke(c29180OooooOo) != enumC32485OooO00o) {
            interfaceC33895OooO00o = c33898OooO0Oo;
            interfaceC33895OooO00o.OooOOO0(null);
            return C32460OooOooO.f116667OooO00o;
        }
        return enumC32485OooO00o;
    }

    public static void OooOooo(OooO0o oooO0o) {
        MediaRecorder mediaRecorder = oooO0o.f74228OooOO0O;
        if (mediaRecorder == null) {
            C34406OooO00o.C20358OooO00o c20358OooO00o = C34406OooO00o.f123390OooO00o;
            c20358OooO00o.OooOOO0("MediaToolbarViewModel");
            c20358OooO00o.OooO0OO("setMediaRecorderAudioSource. mediaRecorder is null", new Object[0]);
        } else {
            C33781o00o0O c33781o00o0O = oooO0o.f74229OooOO0o;
            AbstractC23415OooO0o0 abstractC23415OooO0o0 = (AbstractC23415OooO0o0) c33781o00o0O.getValue();
            C34406OooO00o.C20358OooO00o c20358OooO00o2 = C34406OooO00o.f123390OooO00o;
            c20358OooO00o2.OooOOO0("MediaToolbarViewModel");
            c20358OooO00o2.OooO0o0("setMediaRecorderAudioSource. currentState: ".concat(abstractC23415OooO0o0.f74390OooO00o), new Object[0]);
            c33781o00o0O.OooOO0(null, abstractC23415OooO0o0.OooO0O0(new AbstractC23397OooO0Oo.OooO0o(Integer.valueOf(oooO0o.f74256Oooo0o.f74279OooO00o), "SetAudioSource"), mediaRecorder, oooO0o.f74222OooO0Oo));
        }
    }

    public static /* synthetic */ void Oooo00O(OooO0o oooO0o, Integer num, int i) {
        if ((i & 1) != 0) {
            num = null;
        }
        oooO0o.Oooo000(num, null);
    }

    @Override // androidx.lifecycle.AbstractC22019Ooooooo
    public final void OooO0OO() throws Throwable {
        Oooo00o();
        Oooo0OO();
        C33609OooO0oo.OooO0Oo(oOo0000O.OooO.f123416OooOo0o, new OooOO0(null));
        this.f74258Oooo0oO.quitSafely();
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object OooOOO(Uri uri, String str, String str2, AbstractC32479OooO0OO abstractC32479OooO0OO) {
        C29154OooOoo0 c29154OooOoo0;
        if (abstractC32479OooO0OO instanceof C29154OooOoo0) {
            c29154OooOoo0 = (C29154OooOoo0) abstractC32479OooO0OO;
            int i = c29154OooOoo0.f103337OooOoOO;
            if ((i & Integer.MIN_VALUE) != 0) {
                c29154OooOoo0.f103337OooOoOO = i - Integer.MIN_VALUE;
            } else {
                c29154OooOoo0 = new C29154OooOoo0(this, abstractC32479OooO0OO);
            }
        }
        Object objOooOOOo = c29154OooOoo0.f103336OooOoO0;
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i2 = c29154OooOoo0.f103337OooOoOO;
        if (i2 == 0) {
            C32446OooOOOo.OooO0O0(objOooOOOo);
            c29154OooOoo0.f103334OooOo0o = str2;
            c29154OooOoo0.f103333OooOo = uri;
            c29154OooOoo0.f103337OooOoOO = 1;
            objOooOOOo = this.f74223OooO0o.f97084OooO00o.OooOOOo(str, c29154OooOoo0);
            if (objOooOOOo == enumC32485OooO00o) {
                return enumC32485OooO00o;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            uri = c29154OooOoo0.f103333OooOo;
            str2 = c29154OooOoo0.f103334OooOo0o;
            C32446OooOOOo.OooO0O0(objOooOOOo);
        }
        String absolutePath = new File((File) objOooOOOo, o0Oo0oo.OooO0Oo(str2, ".", MimeTypeMap.getFileExtensionFromUrl(uri.toString()))).getAbsolutePath();
        kotlin.jvm.internal.OooOOO0.OooO0o(absolutePath, "getAbsolutePath(...)");
        return absolutePath;
    }

    /* JADX WARN: Removed duplicated region for block: B:38:0x008a  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object OooOOO0(AbstractC32479OooO0OO abstractC32479OooO0OO) {
        C29152OooOoOO c29152OooOoOO;
        String str;
        OooO0o oooO0o;
        MediaRecorder mediaRecorder;
        String str2;
        String str3;
        if (abstractC32479OooO0OO instanceof C29152OooOoOO) {
            c29152OooOoOO = (C29152OooOoOO) abstractC32479OooO0OO;
            int i = c29152OooOoOO.f103325OooOoo;
            if ((i & Integer.MIN_VALUE) != 0) {
                c29152OooOoOO.f103325OooOoo = i - Integer.MIN_VALUE;
            } else {
                c29152OooOoOO = new C29152OooOoOO(this, abstractC32479OooO0OO);
            }
        }
        Object objOooOOOo = c29152OooOoOO.f103324OooOoOO;
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i2 = c29152OooOoOO.f103325OooOoo;
        if (i2 == 0) {
            C32446OooOOOo.OooO0O0(objOooOOOo);
            String str4 = (String) this.f74230OooOOO.getValue();
            if (str4 == null) {
                C34406OooO00o.C20358OooO00o c20358OooO00o = C34406OooO00o.f123390OooO00o;
                c20358OooO00o.OooOOO0("MediaToolbarViewModel");
                c20358OooO00o.OooO0OO("configureMediaRecorderLocked. noteId is null", new Object[0]);
                return C32460OooOooO.f116667OooO00o;
            }
            MediaRecorder mediaRecorder2 = this.f74228OooOO0O;
            if (mediaRecorder2 == null) {
                C34406OooO00o.C20358OooO00o c20358OooO00o2 = C34406OooO00o.f123390OooO00o;
                c20358OooO00o2.OooOOO0("MediaToolbarViewModel");
                c20358OooO00o2.OooO0OO("configureMediaRecorderDataSource. mediaRecorder is null", new Object[0]);
                return C32460OooOooO.f116667OooO00o;
            }
            int i3 = this.f74256Oooo0o.f74280OooO0O0;
            if (i3 == 1) {
                str = "3gp";
            } else if (i3 == 2) {
                str = "m4a";
            } else if (i3 == 3) {
                str = "amr";
            } else if (i3 == 4) {
                str = "awb";
            } else if (i3 == 6) {
                str = "aac";
            } else if (i3 == 11) {
                str = "ogg";
            } else if (i3 == 8) {
                str = "ts";
            } else if (i3 == 9) {
                str = "webm";
            }
            String strOooO00o = C24761OooO.OooO00o("toString(...)");
            c29152OooOoOO.f103321OooOo0o = this;
            c29152OooOoOO.f103320OooOo = mediaRecorder2;
            c29152OooOoOO.f103323OooOoO0 = str;
            c29152OooOoOO.f103322OooOoO = strOooO00o;
            c29152OooOoOO.f103325OooOoo = 1;
            objOooOOOo = this.f74223OooO0o.f97084OooO00o.OooOOOo(str4, c29152OooOoOO);
            if (objOooOOOo == enumC32485OooO00o) {
                return enumC32485OooO00o;
            }
            oooO0o = this;
            mediaRecorder = mediaRecorder2;
            str2 = str;
            str3 = strOooO00o;
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            str3 = c29152OooOoOO.f103322OooOoO;
            str2 = c29152OooOoOO.f103323OooOoO0;
            mediaRecorder = c29152OooOoOO.f103320OooOo;
            oooO0o = c29152OooOoOO.f103321OooOo0o;
            C32446OooOOOo.OooO0O0(objOooOOOo);
        }
        Bundle bundleBundleOf = BundleKt.bundleOf(new C32443OooOOO("output_format", new Integer(oooO0o.f74256Oooo0o.f74280OooO0O0)), new C32443OooOOO("audio_encoder", new Integer(oooO0o.f74256Oooo0o.f74281OooO0OO)), new C32443OooOOO("audio_channels", new Integer(oooO0o.f74256Oooo0o.f74282OooO0Oo)), new C32443OooOOO("audio_sampling_rate", new Integer(oooO0o.f74256Oooo0o.f74284OooO0o0)), new C32443OooOOO("audio_encoding_bitrate", new Integer(oooO0o.f74256Oooo0o.f74283OooO0o)), new C32443OooOOO("output_path", new File((File) objOooOOOo, o0Oo0oo.OooO0Oo(str3, ".", str2)).getAbsolutePath()));
        C33781o00o0O c33781o00o0O = oooO0o.f74229OooOO0o;
        AbstractC23415OooO0o0 abstractC23415OooO0o0 = (AbstractC23415OooO0o0) c33781o00o0O.getValue();
        C34406OooO00o.C20358OooO00o c20358OooO00o3 = C34406OooO00o.f123390OooO00o;
        c20358OooO00o3.OooOOO0("MediaToolbarViewModel");
        c20358OooO00o3.OooO0o0("configureMediaRecorderLocked. currentState: ".concat(abstractC23415OooO0o0.f74390OooO00o), new Object[0]);
        AbstractC23415OooO0o0 abstractC23415OooO0o0OooO0O0 = abstractC23415OooO0o0.OooO0O0(new AbstractC23397OooO0Oo.OooO00o(bundleBundleOf, "ConfigureDataSource"), mediaRecorder, oooO0o.f74222OooO0Oo);
        c33781o00o0O.getClass();
        c33781o00o0O.OooOO0(null, abstractC23415OooO0o0OooO0O0);
        return C32460OooOooO.f116667OooO00o;
    }

    public final LinkedHashMap OooOOOO(ArrayList arrayList) {
        Iterable iterable = (Iterable) this.f74233OooOOOo.f121747OooOo0o.getValue();
        ArrayList<OooO0O0> arrayList2 = new ArrayList();
        for (Object obj : iterable) {
            if (arrayList.contains(((OooO0O0) obj).f74277OooO00o.getId())) {
                arrayList2.add(obj);
            }
        }
        int iOooO0Oo = oOo000Oo.Oooo0.OooO0Oo(C34428OooOOo.OooOOoo(arrayList2, 10));
        if (iOooO0Oo < 16) {
            iOooO0Oo = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(iOooO0Oo);
        for (OooO0O0 oooO0O0 : arrayList2) {
            linkedHashMap.put(oooO0O0.f74277OooO00o.getId(), oooO0O0.f74277OooO00o.getFilePath());
        }
        return linkedHashMap;
    }

    public final C32460OooOooO OooOOOo(com.orion.notein.p607ui.noteeditor.audio.OooO0O0 oooO0O0) {
        MediaPlayer mediaPlayer = this.f74226OooO0oo;
        if (mediaPlayer == null) {
            C34406OooO00o.C20358OooO00o c20358OooO00o = C34406OooO00o.f123390OooO00o;
            c20358OooO00o.OooOOO0("MediaToolbarViewModel");
            c20358OooO00o.OooO0OO("handleGeneralMediaPlayerEvent. mediaPlayer is null", new Object[0]);
            return C32460OooOooO.f116667OooO00o;
        }
        C33781o00o0O c33781o00o0O = this.f74221OooO;
        com.orion.notein.p607ui.noteeditor.audio.OooO0OO oooO0OO = (com.orion.notein.p607ui.noteeditor.audio.OooO0OO) c33781o00o0O.getValue();
        C34406OooO00o.C20358OooO00o c20358OooO00o2 = C34406OooO00o.f123390OooO00o;
        c20358OooO00o2.OooOOO0("MediaToolbarViewModel");
        c20358OooO00o2.OooO0o0(C22237OooO0o0.OooO00o("handleGeneralMediaPlayerEvent. currentState: ", oooO0OO.f74205OooO00o, ", event: ", oooO0O0.f74204OooO0O0), new Object[0]);
        com.orion.notein.p607ui.noteeditor.audio.OooO0OO oooO0OOOooO00o = oooO0OO.OooO00o(oooO0O0, mediaPlayer, this.f74222OooO0Oo);
        c33781o00o0O.getClass();
        c33781o00o0O.OooOO0(null, oooO0OOOooO00o);
        return C32460OooOooO.f116667OooO00o;
    }

    public final boolean OooOOo() {
        if (this.f74228OooOO0O != null) {
            return this.f74229OooOO0o.getValue() instanceof AbstractC23415OooO0o0.C23417OooO0oO;
        }
        C34406OooO00o.C20358OooO00o c20358OooO00o = C34406OooO00o.f123390OooO00o;
        c20358OooO00o.OooOOO0("MediaToolbarViewModel");
        c20358OooO00o.OooOO0("isMediaRecorderRecording. mediaRecorder is null", new Object[0]);
        return false;
    }

    public final boolean OooOOo0() {
        MediaPlayer mediaPlayer = this.f74226OooO0oo;
        if (mediaPlayer != null) {
            return mediaPlayer.isPlaying();
        }
        C34406OooO00o.C20358OooO00o c20358OooO00o = C34406OooO00o.f123390OooO00o;
        c20358OooO00o.OooOOO0("MediaToolbarViewModel");
        c20358OooO00o.OooOO0O("isMediaPlayerPlaying. mediaPlayer is null", new Object[0]);
        return false;
    }

    public final void OooOOoo() {
        C34406OooO00o.C20358OooO00o c20358OooO00o = C34406OooO00o.f123390OooO00o;
        c20358OooO00o.OooOOO0("MediaToolbarViewModel");
        c20358OooO00o.OooO0o0("pauseMediaPlayer.", new Object[0]);
        InterfaceC33636Oooo00o interfaceC33636Oooo00oOooO00o = o0OoOo0.OooO00o(this);
        C33874OooO0OO c33874OooO0OO = C33649OoooOOo.f121328OooO00o;
        C33609OooO0oo.OooO0OO(interfaceC33636Oooo00oOooO00o, ExecutorC33873OooO0O0.f122045OooOoO0, null, new OooOO0O(null), 2);
    }

    public final void OooOo() {
        MediaRecorder mediaRecorder = this.f74228OooOO0O;
        if (mediaRecorder == null) {
            C34406OooO00o.C20358OooO00o c20358OooO00o = C34406OooO00o.f123390OooO00o;
            c20358OooO00o.OooOOO0("MediaToolbarViewModel");
            c20358OooO00o.OooOO0O("releaseMediaRecorderLocked. mediaRecorder is null", new Object[0]);
            return;
        }
        C33781o00o0O c33781o00o0O = this.f74229OooOO0o;
        AbstractC23415OooO0o0 abstractC23415OooO0o0 = (AbstractC23415OooO0o0) c33781o00o0O.getValue();
        C34406OooO00o.C20358OooO00o c20358OooO00o2 = C34406OooO00o.f123390OooO00o;
        c20358OooO00o2.OooOOO0("MediaToolbarViewModel");
        c20358OooO00o2.OooO0o0("releaseMediaRecorderLocked. currentState: ".concat(abstractC23415OooO0o0.f74390OooO00o), new Object[0]);
        AbstractC23415OooO0o0 abstractC23415OooO0o0OooO0O0 = abstractC23415OooO0o0.OooO0O0(new AbstractC23397OooO0Oo.C19283OooO0Oo(null, "Release"), mediaRecorder, this.f74222OooO0Oo);
        if (abstractC23415OooO0o0OooO0O0 instanceof AbstractC23415OooO0o0.C23418OooO0oo) {
            this.f74228OooOO0O = null;
        }
        c33781o00o0O.getClass();
        c33781o00o0O.OooOO0(null, abstractC23415OooO0o0OooO0O0);
    }

    /* JADX WARN: Code restructure failed: missing block: B:72:0x015d, code lost:
    
        if (r3.OooOOOo(r11) != r1) goto L74;
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x0160, code lost:
    
        r10 = r2;
        r2 = r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:84:0x0197, code lost:
    
        if (r3.OooOOOo(r11) != r1) goto L74;
     */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00b5  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00b8  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00bb  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00ca  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x019a A[PHI: r2 r10
      0x019a: PHI (r2v11 com.orion.notein.ui.noteeditor.audio.OooO0o) = 
      (r2v3 com.orion.notein.ui.noteeditor.audio.OooO0o)
      (r2v3 com.orion.notein.ui.noteeditor.audio.OooO0o)
      (r2v8 com.orion.notein.ui.noteeditor.audio.OooO0o)
      (r2v13 com.orion.notein.ui.noteeditor.audio.OooO0o)
     binds: [B:48:0x0111, B:45:0x010b, B:15:0x004c, B:74:0x0160] A[DONT_GENERATE, DONT_INLINE]
      0x019a: PHI (r10v17 java.lang.String) = (r10v1 java.lang.String), (r10v1 java.lang.String), (r10v12 java.lang.String), (r10v18 java.lang.String) binds: [B:48:0x0111, B:45:0x010b, B:15:0x004c, B:74:0x0160] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:89:0x01af  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x00b0 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object OooOo0(String str, AbstractC32479OooO0OO abstractC32479OooO0OO) {
        Oooo000 oooo000;
        OooO0o oooO0o;
        Iterator it;
        Object next;
        AudioFile audioFile;
        OooO0o oooO0o2;
        String str2;
        Uri uri;
        Uri uri2;
        OooO0O0.C23391OooO0Oo c23391OooO0Oo;
        OooO0o oooO0o3;
        if (abstractC32479OooO0OO instanceof Oooo000) {
            oooo000 = (Oooo000) abstractC32479OooO0OO;
            int i = oooo000.f103360OooOoo0;
            if ((i & Integer.MIN_VALUE) != 0) {
                oooo000.f103360OooOoo0 = i - Integer.MIN_VALUE;
            } else {
                oooo000 = new Oooo000(this, abstractC32479OooO0OO);
            }
        }
        Object obj = oooo000.f103357OooOoO;
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        switch (oooo000.f103360OooOoo0) {
            case 0:
                C32446OooOOOo.OooO0O0(obj);
                if (this.f74226OooO0oo == null) {
                    oooo000.f103356OooOo0o = this;
                    oooo000.f103355OooOo = str;
                    oooo000.f103360OooOoo0 = 1;
                    if (OooOoO() != enumC32485OooO00o) {
                        oooO0o = this;
                        if (oooO0o.f74226OooO0oo == null) {
                            C34406OooO00o.C20358OooO00o c20358OooO00o = C34406OooO00o.f123390OooO00o;
                            c20358OooO00o.OooOOO0("MediaToolbarViewModel");
                            c20358OooO00o.OooOO0O("prepareMediaPlayerLocked. mediaPlayer is null", new Object[0]);
                            return C32460OooOooO.f116667OooO00o;
                        }
                        it = ((Iterable) oooO0o.f74233OooOOOo.f121747OooOo0o.getValue()).iterator();
                        while (true) {
                            if (it.hasNext()) {
                                next = it.next();
                                if (kotlin.jvm.internal.OooOOO0.OooO0O0(((OooO0O0) next).f74277OooO00o.getId(), str)) {
                                }
                            } else {
                                next = null;
                            }
                        }
                        OooO0O0 oooO0O0 = (OooO0O0) next;
                        audioFile = oooO0O0 != null ? oooO0O0.f74277OooO00o : null;
                        if (audioFile == null) {
                            C34406OooO00o.C20358OooO00o c20358OooO00o2 = C34406OooO00o.f123390OooO00o;
                            c20358OooO00o2.OooOOO0("MediaToolbarViewModel");
                            c20358OooO00o2.OooO0OO("prepareMediaPlayerLocked. file is null", new Object[0]);
                            return C32460OooOooO.f116667OooO00o;
                        }
                        Uri uriFromFile = Uri.fromFile(new File(audioFile.getFilePath()));
                        com.orion.notein.p607ui.noteeditor.audio.OooO0OO oooO0OO = (com.orion.notein.p607ui.noteeditor.audio.OooO0OO) oooO0o.f74221OooO.getValue();
                        C34406OooO00o.C20358OooO00o c20358OooO00o3 = C34406OooO00o.f123390OooO00o;
                        c20358OooO00o3.OooOOO0("MediaToolbarViewModel");
                        c20358OooO00o3.OooO00o("prepareMediaPlayerLocked. currentState: " + oooO0OO, new Object[0]);
                        if (oooO0OO instanceof OooO0OO.C19282OooO0OO) {
                            OooO0O0.C23393OooO0oo c23393OooO0oo = new OooO0O0.C23393OooO0oo(uriFromFile);
                            oooo000.f103356OooOo0o = oooO0o;
                            oooo000.f103355OooOo = str;
                            oooo000.f103360OooOoo0 = 2;
                            if (oooO0o.OooOOOo(c23393OooO0oo) != enumC32485OooO00o) {
                                c23391OooO0Oo = new OooO0O0.C23391OooO0Oo(null, "Prepare");
                                oooo000.f103356OooOo0o = oooO0o;
                                oooo000.f103355OooOo = str;
                                oooo000.f103360OooOoo0 = 7;
                                if (oooO0o.OooOOOo(c23391OooO0Oo) != enumC32485OooO00o) {
                                    oooO0o3 = oooO0o;
                                    oooO0o3.f74235OooOOo0.setValue(str);
                                    return C32460OooOooO.f116667OooO00o;
                                }
                            }
                        } else if (!(oooO0OO instanceof OooO0OO.OooO0Oo)) {
                            if (!(oooO0OO instanceof OooO0OO.C23395OooO0oO) && !(oooO0OO instanceof OooO0OO.C23394OooO0o0) && !(oooO0OO instanceof OooO0OO.C23396OooO0oo) && !(oooO0OO instanceof OooO0OO.OooO0o)) {
                                if (!(oooO0OO instanceof OooO0OO.OooO) && !(oooO0OO instanceof OooO0OO.OooO00o) && !(oooO0OO instanceof OooO0OO.OooO0O0)) {
                                    throw new C32442OooOO0o();
                                }
                                oooo000.f103356OooOo0o = oooO0o;
                                oooo000.f103355OooOo = str;
                                oooo000.f103358OooOoO0 = uriFromFile;
                                oooo000.f103360OooOoo0 = 5;
                                if (oooO0o.OooOoO() != enumC32485OooO00o) {
                                    oooO0o2 = oooO0o;
                                    str2 = str;
                                    uri2 = uriFromFile;
                                    OooO0O0.C23393OooO0oo c23393OooO0oo2 = new OooO0O0.C23393OooO0oo(uri2);
                                    oooo000.f103356OooOo0o = oooO0o2;
                                    oooo000.f103355OooOo = str2;
                                    oooo000.f103358OooOoO0 = null;
                                    oooo000.f103360OooOoo0 = 6;
                                }
                            } else {
                                if (kotlin.jvm.internal.OooOOO0.OooO0O0(str, oooO0o.f74235OooOOo0.getValue())) {
                                    return C32460OooOooO.f116667OooO00o;
                                }
                                oooo000.f103356OooOo0o = oooO0o;
                                oooo000.f103355OooOo = str;
                                oooo000.f103358OooOoO0 = uriFromFile;
                                oooo000.f103360OooOoo0 = 3;
                                if (oooO0o.OooOoO() != enumC32485OooO00o) {
                                    oooO0o2 = oooO0o;
                                    str2 = str;
                                    uri = uriFromFile;
                                    OooO0O0.C23393OooO0oo c23393OooO0oo3 = new OooO0O0.C23393OooO0oo(uri);
                                    oooo000.f103356OooOo0o = oooO0o2;
                                    oooo000.f103355OooOo = str2;
                                    oooo000.f103358OooOoO0 = null;
                                    oooo000.f103360OooOoo0 = 4;
                                }
                            }
                            break;
                        }
                    }
                    return enumC32485OooO00o;
                }
                oooO0o = this;
                it = ((Iterable) oooO0o.f74233OooOOOo.f121747OooOo0o.getValue()).iterator();
                while (true) {
                    if (it.hasNext()) {
                    }
                }
                OooO0O0 oooO0O02 = (OooO0O0) next;
                if (oooO0O02 != null) {
                }
                if (audioFile == null) {
                }
                break;
            case 1:
                str = oooo000.f103355OooOo;
                oooO0o = oooo000.f103356OooOo0o;
                C32446OooOOOo.OooO0O0(obj);
                if (oooO0o.f74226OooO0oo == null) {
                }
                it = ((Iterable) oooO0o.f74233OooOOOo.f121747OooOo0o.getValue()).iterator();
                while (true) {
                    if (it.hasNext()) {
                    }
                }
                OooO0O0 oooO0O022 = (OooO0O0) next;
                if (oooO0O022 != null) {
                }
                if (audioFile == null) {
                }
                break;
            case 2:
            case 4:
            case 6:
                str = oooo000.f103355OooOo;
                oooO0o = oooo000.f103356OooOo0o;
                C32446OooOOOo.OooO0O0(obj);
                c23391OooO0Oo = new OooO0O0.C23391OooO0Oo(null, "Prepare");
                oooo000.f103356OooOo0o = oooO0o;
                oooo000.f103355OooOo = str;
                oooo000.f103360OooOoo0 = 7;
                if (oooO0o.OooOOOo(c23391OooO0Oo) != enumC32485OooO00o) {
                }
                return enumC32485OooO00o;
            case 3:
                uri = oooo000.f103358OooOoO0;
                str2 = oooo000.f103355OooOo;
                oooO0o2 = oooo000.f103356OooOo0o;
                C32446OooOOOo.OooO0O0(obj);
                OooO0O0.C23393OooO0oo c23393OooO0oo32 = new OooO0O0.C23393OooO0oo(uri);
                oooo000.f103356OooOo0o = oooO0o2;
                oooo000.f103355OooOo = str2;
                oooo000.f103358OooOoO0 = null;
                oooo000.f103360OooOoo0 = 4;
                break;
            case 5:
                uri2 = oooo000.f103358OooOoO0;
                str2 = oooo000.f103355OooOo;
                oooO0o2 = oooo000.f103356OooOo0o;
                C32446OooOOOo.OooO0O0(obj);
                OooO0O0.C23393OooO0oo c23393OooO0oo22 = new OooO0O0.C23393OooO0oo(uri2);
                oooo000.f103356OooOo0o = oooO0o2;
                oooo000.f103355OooOo = str2;
                oooo000.f103358OooOoO0 = null;
                oooo000.f103360OooOoo0 = 6;
                break;
            case 7:
                str = oooo000.f103355OooOo;
                oooO0o3 = oooo000.f103356OooOo0o;
                C32446OooOOOo.OooO0O0(obj);
                oooO0o3.f74235OooOOo0.setValue(str);
                return C32460OooOooO.f116667OooO00o;
            default:
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    public final void OooOo00(String fileId, boolean z) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(fileId, "fileId");
        C34406OooO00o.C20358OooO00o c20358OooO00o = C34406OooO00o.f123390OooO00o;
        c20358OooO00o.OooOOO0("MediaToolbarViewModel");
        c20358OooO00o.OooO0o0("prepareAudioFile. fileId: ".concat(fileId), new Object[0]);
        InterfaceC33636Oooo00o interfaceC33636Oooo00oOooO00o = o0OoOo0.OooO00o(this);
        C33874OooO0OO c33874OooO0OO = C33649OoooOOo.f121328OooO00o;
        C33609OooO0oo.OooO0OO(interfaceC33636Oooo00oOooO00o, ExecutorC33873OooO0O0.f122045OooOoO0, null, new C23405OooOO0o(fileId, z, null), 2);
    }

    public final void OooOo0O() {
        MediaRecorder mediaRecorder = this.f74228OooOO0O;
        if (mediaRecorder == null) {
            C34406OooO00o.C20358OooO00o c20358OooO00o = C34406OooO00o.f123390OooO00o;
            c20358OooO00o.OooOOO0("MediaToolbarViewModel");
            c20358OooO00o.OooO0OO("prepareMediaRecorder. mediaRecorder is null", new Object[0]);
            return;
        }
        C33781o00o0O c33781o00o0O = this.f74229OooOO0o;
        AbstractC23415OooO0o0 abstractC23415OooO0o0 = (AbstractC23415OooO0o0) c33781o00o0O.getValue();
        C34406OooO00o.C20358OooO00o c20358OooO00o2 = C34406OooO00o.f123390OooO00o;
        c20358OooO00o2.OooOOO0("MediaToolbarViewModel");
        c20358OooO00o2.OooO0o0("prepareMediaRecorderLocked. currentState: ".concat(abstractC23415OooO0o0.f74390OooO00o), new Object[0]);
        AbstractC23415OooO0o0 abstractC23415OooO0o0OooO0O0 = abstractC23415OooO0o0.OooO0O0(new AbstractC23397OooO0Oo.OooO0OO(null, "Prepare"), mediaRecorder, this.f74222OooO0Oo);
        c33781o00o0O.getClass();
        c33781o00o0O.OooOO0(null, abstractC23415OooO0o0OooO0O0);
    }

    public final void OooOo0o() {
        MediaPlayer mediaPlayer = this.f74226OooO0oo;
        C33781o00o0O c33781o00o0O = this.f74221OooO;
        if (mediaPlayer == null) {
            C34406OooO00o.C20358OooO00o c20358OooO00o = C34406OooO00o.f123390OooO00o;
            c20358OooO00o.OooOOO0("MediaToolbarViewModel");
            c20358OooO00o.OooOO0O("releaseMediaPlayerLocked. mediaPlayer is null", new Object[0]);
            OooO0OO.OooO00o oooO00o = OooO0OO.OooO00o.f74207OooO0O0;
            c33781o00o0O.getClass();
            c33781o00o0O.OooOO0(null, oooO00o);
            return;
        }
        com.orion.notein.p607ui.noteeditor.audio.OooO0OO oooO0OO = (com.orion.notein.p607ui.noteeditor.audio.OooO0OO) c33781o00o0O.getValue();
        C34406OooO00o.C20358OooO00o c20358OooO00o2 = C34406OooO00o.f123390OooO00o;
        c20358OooO00o2.OooOOO0("MediaToolbarViewModel");
        c20358OooO00o2.OooO00o("releaseMediaPlayerLocked. currentState: " + oooO0OO, new Object[0]);
        com.orion.notein.p607ui.noteeditor.audio.OooO0OO oooO0OOOooO00o = oooO0OO.OooO00o(new OooO0O0.OooO0o0(null, "Release"), mediaPlayer, this.f74222OooO0Oo);
        c33781o00o0O.getClass();
        c33781o00o0O.OooOO0(null, oooO0OOOooO00o);
        if (oooO0OOOooO00o instanceof OooO0OO.OooO00o) {
            this.f74226OooO0oo = null;
        }
    }

    public final C32460OooOooO OooOoO() {
        if (this.f74226OooO0oo == null) {
            final MediaPlayer mediaPlayer = new MediaPlayer();
            mediaPlayer.setOnCompletionListener(new MediaPlayer.OnCompletionListener() { // from class: o0OoOOo.OooOo0o
                @Override // android.media.MediaPlayer.OnCompletionListener
                public final void onCompletion(MediaPlayer mediaPlayer2) {
                    AbstractC24338OooO0o0.OooO00o<Float> oooO00o = com.orion.notein.p607ui.noteeditor.audio.OooO0o.f74218OoooO0O;
                    if (mediaPlayer.isLooping()) {
                        return;
                    }
                    com.orion.notein.p607ui.noteeditor.audio.OooO0o oooO0o = this;
                    InterfaceC33636Oooo00o interfaceC33636Oooo00oOooO00o = o0OoOo0.OooO00o(oooO0o);
                    C33874OooO0OO c33874OooO0OO = C33649OoooOOo.f121328OooO00o;
                    C33609OooO0oo.OooO0OO(interfaceC33636Oooo00oOooO00o, ExecutorC33873OooO0O0.f122045OooOoO0, null, new com.orion.notein.p607ui.noteeditor.audio.OooO(oooO0o, null), 2);
                }
            });
            mediaPlayer.setOnErrorListener(new MediaPlayer.OnErrorListener() { // from class: o0OoOOo.OooOo
                @Override // android.media.MediaPlayer.OnErrorListener
                public final boolean onError(MediaPlayer mediaPlayer2, int i, int i2) {
                    AbstractC24338OooO0o0.OooO00o<Float> oooO00o = com.orion.notein.p607ui.noteeditor.audio.OooO0o.f74218OoooO0O;
                    C34406OooO00o.C20358OooO00o c20358OooO00o = C34406OooO00o.f123390OooO00o;
                    StringBuilder sbOooO00o = com.aspose.slides.internal.p332p7.OooOOOO.OooO00o(c20358OooO00o, "MediaToolbarViewModel", "MediaPlayer.onError. what: ", i, ", extra: ");
                    sbOooO00o.append(i2);
                    c20358OooO00o.OooO0OO(sbOooO00o.toString(), new Object[0]);
                    com.orion.notein.p607ui.noteeditor.audio.OooO0o oooO0o = this.f103311OooO00o;
                    InterfaceC33636Oooo00o interfaceC33636Oooo00oOooO00o = o0OoOo0.OooO00o(oooO0o);
                    C33874OooO0OO c33874OooO0OO = C33649OoooOOo.f121328OooO00o;
                    C33609OooO0oo.OooO0OO(interfaceC33636Oooo00oOooO00o, ExecutorC33873OooO0O0.f122045OooOoO0, null, new com.orion.notein.p607ui.noteeditor.audio.OooOO0(oooO0o, null), 2);
                    return true;
                }
            });
            this.f74226OooO0oo = mediaPlayer;
            OooO0OO.C19282OooO0OO c19282OooO0OO = OooO0OO.C19282OooO0OO.f74209OooO0O0;
            C33781o00o0O c33781o00o0O = this.f74221OooO;
            c33781o00o0O.getClass();
            c33781o00o0O.OooOO0(null, c19282OooO0OO);
        }
        C32460OooOooO c32460OooOooOOooOOOo = OooOOOo(new OooO0O0.OooO0o(null, "Reset"));
        return c32460OooOooOOooOOOo == EnumC32485OooO00o.f116726OooOo0o ? c32460OooOooOOooOOOo : C32460OooOooO.f116667OooO00o;
    }

    public final void OooOoO0(String id, String name) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(id, "id");
        kotlin.jvm.internal.OooOOO0.OooO0oO(name, "name");
        InterfaceC33636Oooo00o interfaceC33636Oooo00oOooO00o = o0OoOo0.OooO00o(this);
        C33874OooO0OO c33874OooO0OO = C33649OoooOOo.f121328OooO00o;
        C33609OooO0oo.OooO0OO(interfaceC33636Oooo00oOooO00o, ExecutorC33873OooO0O0.f122045OooOoO0, null, new OooOOO(name, id, null), 2);
    }

    public final void OooOoOO() {
        MediaRecorder mediaRecorderOooO00o = this.f74228OooOO0O;
        Context context = this.f74222OooO0Oo;
        C33781o00o0O c33781o00o0O = this.f74229OooOO0o;
        if (mediaRecorderOooO00o == null) {
            C34406OooO00o.C20358OooO00o c20358OooO00o = C34406OooO00o.f123390OooO00o;
            c20358OooO00o.OooOOO0("MediaToolbarViewModel");
            c20358OooO00o.OooOO0O("resetMediaRecording. mediaRecorder is null", new Object[0]);
            mediaRecorderOooO00o = Build.VERSION.SDK_INT >= 31 ? C29147OooOo0.OooO00o(context) : new MediaRecorder();
            mediaRecorderOooO00o.setOnErrorListener(new MediaRecorder.OnErrorListener() { // from class: o0OoOOo.OooOo0O
                @Override // android.media.MediaRecorder.OnErrorListener
                public final void onError(MediaRecorder mediaRecorder, int i, int i2) {
                    AbstractC24338OooO0o0.OooO00o<Float> oooO00o = com.orion.notein.p607ui.noteeditor.audio.OooO0o.f74218OoooO0O;
                    C34406OooO00o.C20358OooO00o c20358OooO00o2 = C34406OooO00o.f123390OooO00o;
                    StringBuilder sbOooO00o = com.aspose.slides.internal.p332p7.OooOOOO.OooO00o(c20358OooO00o2, "MediaToolbarViewModel", "MediaRecorder.onError. what: ", i, ", extra: ");
                    sbOooO00o.append(i2);
                    c20358OooO00o2.OooO0OO(sbOooO00o.toString(), new Object[0]);
                    com.orion.notein.p607ui.noteeditor.audio.OooO0o oooO0o = this.f103312OooO00o;
                    InterfaceC33636Oooo00o interfaceC33636Oooo00oOooO00o = o0OoOo0.OooO00o(oooO0o);
                    C33874OooO0OO c33874OooO0OO = C33649OoooOOo.f121328OooO00o;
                    C33609OooO0oo.OooO0OO(interfaceC33636Oooo00oOooO00o, ExecutorC33873OooO0O0.f122045OooOoO0, null, oooO0o.new OooOOOO(null), 2);
                }
            });
            this.f74228OooOO0O = mediaRecorderOooO00o;
            AbstractC23415OooO0o0.OooO0OO oooO0OO = AbstractC23415OooO0o0.OooO0OO.f74394OooO0OO;
            c33781o00o0O.getClass();
            c33781o00o0O.OooOO0(null, oooO0OO);
        }
        AbstractC23415OooO0o0 abstractC23415OooO0o0 = (AbstractC23415OooO0o0) c33781o00o0O.getValue();
        AbstractC23397OooO0Oo.C23398OooO0o0 c23398OooO0o0 = new AbstractC23397OooO0Oo.C23398OooO0o0(null, "Reset");
        C34406OooO00o.C20358OooO00o c20358OooO00o2 = C34406OooO00o.f123390OooO00o;
        c20358OooO00o2.OooOOO0("MediaToolbarViewModel");
        c20358OooO00o2.OooO0o0("resetMediaRecorderLocked. currentState: ".concat(abstractC23415OooO0o0.f74390OooO00o), new Object[0]);
        AbstractC23415OooO0o0 abstractC23415OooO0o0OooO0O0 = abstractC23415OooO0o0.OooO0O0(c23398OooO0o0, mediaRecorderOooO00o, context);
        c33781o00o0O.getClass();
        c33781o00o0O.OooOO0(null, abstractC23415OooO0o0OooO0O0);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object OooOoo(String str, String str2, AbstractC32479OooO0OO abstractC32479OooO0OO) throws Throwable {
        C29162Oooo0o c29162Oooo0o;
        if (abstractC32479OooO0OO instanceof C29162Oooo0o) {
            c29162Oooo0o = (C29162Oooo0o) abstractC32479OooO0OO;
            int i = c29162Oooo0o.f103381OooOoO0;
            if ((i & Integer.MIN_VALUE) != 0) {
                c29162Oooo0o.f103381OooOoO0 = i - Integer.MIN_VALUE;
            } else {
                c29162Oooo0o = new C29162Oooo0o(this, abstractC32479OooO0OO);
            }
        }
        Object objOooO0o = c29162Oooo0o.f103380OooOo0o;
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i2 = c29162Oooo0o.f103381OooOoO0;
        if (i2 == 0) {
            C32446OooOOOo.OooO0O0(objOooO0o);
            new MediaMetadataRetriever().setDataSource(str);
            C33874OooO0OO c33874OooO0OO = C33649OoooOOo.f121328OooO00o;
            ExecutorC33873OooO0O0 executorC33873OooO0O0 = ExecutorC33873OooO0O0.f122045OooOoO0;
            com.orion.notein.p607ui.noteeditor.audio.OooOO0O oooOO0O = new com.orion.notein.p607ui.noteeditor.audio.OooOO0O(this, str, str2, null);
            c29162Oooo0o.f103381OooOoO0 = 1;
            objOooO0o = C33609OooO0oo.OooO0o(executorC33873OooO0O0, oooOO0O, c29162Oooo0o);
            if (objOooO0o == enumC32485OooO00o) {
                return enumC32485OooO00o;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C32446OooOOOo.OooO0O0(objOooO0o);
        }
        return (AudioFile) objOooO0o;
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:0x00be, code lost:
    
        if (r8 == r1) goto L29;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object OooOoo0(AudioFile audioFile, String str, AbstractC32479OooO0OO abstractC32479OooO0OO) {
        C29163Oooo0o0 c29163Oooo0o0;
        OooO0o oooO0o;
        NoteAudioFileIdsField noteAudioFileIdsField;
        if (abstractC32479OooO0OO instanceof C29163Oooo0o0) {
            c29163Oooo0o0 = (C29163Oooo0o0) abstractC32479OooO0OO;
            int i = c29163Oooo0o0.f103387OooOoo0;
            if ((i & Integer.MIN_VALUE) != 0) {
                c29163Oooo0o0.f103387OooOoo0 = i - Integer.MIN_VALUE;
            } else {
                c29163Oooo0o0 = new C29163Oooo0o0(this, abstractC32479OooO0OO);
            }
        }
        Object obj = c29163Oooo0o0.f103384OooOoO;
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i2 = c29163Oooo0o0.f103387OooOoo0;
        if (i2 == 0) {
            C32446OooOOOo.OooO0O0(obj);
            C34406OooO00o.C20358OooO00o c20358OooO00o = C34406OooO00o.f123390OooO00o;
            c20358OooO00o.OooOOO0("MediaToolbarViewModel");
            c20358OooO00o.OooO00o("saveAudioFile. " + audioFile, new Object[0]);
            c29163Oooo0o0.f103383OooOo0o = this;
            c29163Oooo0o0.f103382OooOo = audioFile;
            c29163Oooo0o0.f103385OooOoO0 = str;
            c29163Oooo0o0.f103387OooOoo0 = 1;
            if (this.f74223OooO0o.OooO00o(audioFile, str, c29163Oooo0o0) != enumC32485OooO00o) {
                oooO0o = this;
            }
            return enumC32485OooO00o;
        }
        if (i2 != 1) {
            if (i2 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C32446OooOOOo.OooO0O0(obj);
            return C32460OooOooO.f116667OooO00o;
        }
        str = c29163Oooo0o0.f103385OooOoO0;
        audioFile = c29163Oooo0o0.f103382OooOo;
        oooO0o = c29163Oooo0o0.f103383OooOo0o;
        C32446OooOOOo.OooO0O0(obj);
        NoteAudioFileIdsField noteAudioFileIdsField2 = (NoteAudioFileIdsField) oooO0o.f74232OooOOOO.f121747OooOo0o.getValue();
        if (noteAudioFileIdsField2 == null) {
            noteAudioFileIdsField = new NoteAudioFileIdsField(C24761OooO.OooO00o("toString(...)"), str, com.facebook.soloader.OooOo.OooO0oO(audioFile.getId()));
        } else {
            ArrayList arrayListO0ooOoO = oOo000Oo.OooOo.o0ooOoO(noteAudioFileIdsField2.getFileIds());
            arrayListO0ooOoO.add(0, audioFile.getId());
            noteAudioFileIdsField = new NoteAudioFileIdsField(noteAudioFileIdsField2.getId(), str, arrayListO0ooOoO);
        }
        c29163Oooo0o0.f103383OooOo0o = null;
        c29163Oooo0o0.f103382OooOo = null;
        c29163Oooo0o0.f103385OooOoO0 = null;
        c29163Oooo0o0.f103387OooOoo0 = 2;
        Object objOooO = oooO0o.f74223OooO0o.f97084OooO00o.OooO(noteAudioFileIdsField, str, c29163Oooo0o0);
        if (objOooO != enumC32485OooO00o) {
            objOooO = C32460OooOooO.f116667OooO00o;
        }
    }

    public final void OooOooO(int i) {
        C33609OooO0oo.OooO0OO(o0OoOo0.OooO00o(this), null, null, new C23406OooOOOo(i, null), 3);
    }

    public final void Oooo0() {
        C34406OooO00o.C20358OooO00o c20358OooO00o = C34406OooO00o.f123390OooO00o;
        c20358OooO00o.OooOOO0("MediaToolbarViewModel");
        c20358OooO00o.OooO0o0("stopMediaRecorder.", new Object[0]);
        InterfaceC33636Oooo00o interfaceC33636Oooo00oOooO00o = o0OoOo0.OooO00o(this);
        C33874OooO0OO c33874OooO0OO = C33649OoooOOo.f121328OooO00o;
        C33609OooO0oo.OooO0OO(interfaceC33636Oooo00oOooO00o, ExecutorC33873OooO0O0.f122045OooOoO0, null, new C23414OooOoO0(null), 2);
    }

    public final void Oooo000(Integer num, String str) {
        C34406OooO00o.C20358OooO00o c20358OooO00o = C34406OooO00o.f123390OooO00o;
        c20358OooO00o.OooOOO0("MediaToolbarViewModel");
        c20358OooO00o.OooO0o0("startMediaPlayer.", new Object[0]);
        C33609OooO0oo.OooO0OO(o0OoOo0.OooO00o(this), null, null, new OooOo(str, num, null), 3);
    }

    public final void Oooo00o() {
        o00000OO o00000oo2 = this.f74254Oooo0O0;
        if (o00000oo2 != null) {
            o00000oo2.cancel((CancellationException) null);
        }
        this.f74254Oooo0O0 = null;
        com.orion.notein.p607ui.noteeditor.audio.OooO0OO oooO0OO = (com.orion.notein.p607ui.noteeditor.audio.OooO0OO) this.f74221OooO.getValue();
        if (kotlin.jvm.internal.OooOOO0.OooO0O0(oooO0OO, OooO0OO.C23395OooO0oO.f74213OooO0O0) || kotlin.jvm.internal.OooOOO0.OooO0O0(oooO0OO, OooO0OO.C23396OooO0oo.f74214OooO0O0) || kotlin.jvm.internal.OooOOO0.OooO0O0(oooO0OO, OooO0OO.C23394OooO0o0.f74212OooO0O0) || kotlin.jvm.internal.OooOOO0.OooO0O0(oooO0OO, OooO0OO.OooO0o.f74211OooO0O0)) {
            return;
        }
        C33781o00o0O c33781o00o0O = this.f74234OooOOo;
        c33781o00o0O.getClass();
        c33781o00o0O.OooOO0(null, 0);
        this.f74236OooOOoo.setValue(f74219OoooOO0);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object Oooo0O0(boolean z, AbstractC32479OooO0OO abstractC32479OooO0OO) throws Throwable {
        C29170OoooOO0 c29170OoooOO0;
        OooO0o oooO0o;
        if (abstractC32479OooO0OO instanceof C29170OoooOO0) {
            c29170OoooOO0 = (C29170OoooOO0) abstractC32479OooO0OO;
            int i = c29170OoooOO0.f103437OooOoOO;
            if ((i & Integer.MIN_VALUE) != 0) {
                c29170OoooOO0.f103437OooOoOO = i - Integer.MIN_VALUE;
            } else {
                c29170OoooOO0 = new C29170OoooOO0(this, abstractC32479OooO0OO);
            }
        }
        Object objOooo0o0 = c29170OoooOO0.f103436OooOoO0;
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i2 = c29170OoooOO0.f103437OooOoOO;
        if (i2 == 0) {
            C32446OooOOOo.OooO0O0(objOooo0o0);
            this.f74259Oooo0oo.removeCallbacks(this.f74260OoooO0);
            this.f74238OooOo0.setValue(null);
            MediaRecorder mediaRecorder = this.f74228OooOO0O;
            if (mediaRecorder == null) {
                C34406OooO00o.C20358OooO00o c20358OooO00o = C34406OooO00o.f123390OooO00o;
                c20358OooO00o.OooOOO0("MediaToolbarViewModel");
                c20358OooO00o.OooOO0O("stopMediaRecorderLocked. mediaRecorder is null", new Object[0]);
                return C32460OooOooO.f116667OooO00o;
            }
            C33781o00o0O c33781o00o0O = this.f74229OooOO0o;
            AbstractC23415OooO0o0 abstractC23415OooO0o0 = (AbstractC23415OooO0o0) c33781o00o0O.getValue();
            C34406OooO00o.C20358OooO00o c20358OooO00o2 = C34406OooO00o.f123390OooO00o;
            c20358OooO00o2.OooOOO0("MediaToolbarViewModel");
            c20358OooO00o2.OooO0o0("stopMediaRecorderLocked. currentState: ".concat(abstractC23415OooO0o0.f74390OooO00o), new Object[0]);
            Bundle bundle = abstractC23415OooO0o0.f74391OooO0O0;
            String string = bundle != null ? bundle.getString("output_path") : null;
            AbstractC23415OooO0o0 abstractC23415OooO0o0OooO0O0 = abstractC23415OooO0o0.OooO0O0(new AbstractC23397OooO0Oo.C23400OooO0oo(null, "Stop"), mediaRecorder, this.f74222OooO0Oo);
            c33781o00o0O.getClass();
            c33781o00o0O.OooOO0(null, abstractC23415OooO0o0OooO0O0);
            if (abstractC23415OooO0o0OooO0O0 instanceof AbstractC23415OooO0o0.OooO0OO) {
                OooOo();
                if (string != null) {
                    String str = (String) this.f74230OooOOO.getValue();
                    if (str == null) {
                        return C32460OooOooO.f116667OooO00o;
                    }
                    c29170OoooOO0.f103434OooOo0o = this;
                    c29170OoooOO0.f103433OooOo = z;
                    c29170OoooOO0.f103437OooOoOO = 1;
                    objOooo0o0 = Oooo0o0(string, str, c29170OoooOO0);
                    if (objOooo0o0 == enumC32485OooO00o) {
                        return enumC32485OooO00o;
                    }
                    oooO0o = this;
                }
            }
            return C32460OooOooO.f116667OooO00o;
        }
        if (i2 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        z = c29170OoooOO0.f103433OooOo;
        oooO0o = c29170OoooOO0.f103434OooOo0o;
        C32446OooOOOo.OooO0O0(objOooo0o0);
        AudioFile audioFile = (AudioFile) objOooo0o0;
        if (z && audioFile != null) {
            oooO0o.f74235OooOOo0.setValue(audioFile.getId());
        }
        return C32460OooOooO.f116667OooO00o;
    }

    public final void Oooo0OO() {
        o00000OO o00000oo2 = this.f74257Oooo0o0;
        if (o00000oo2 != null) {
            o00000oo2.cancel((CancellationException) null);
        }
        this.f74257Oooo0o0 = null;
        C33781o00o0O c33781o00o0O = this.f74240OooOo0O;
        c33781o00o0O.getClass();
        c33781o00o0O.OooOO0(null, 0);
        Float fValueOf = Float.valueOf(0.0f);
        C33781o00o0O c33781o00o0O2 = this.f74241OooOo0o;
        c33781o00o0O2.getClass();
        c33781o00o0O2.OooOO0(null, fValueOf);
    }

    /* JADX WARN: Can't wrap try/catch for region: R(11:0|2|(2:4|(1:6)(1:7))(0)|8|46|(1:(1:(5:12|47|13|40|41)(2:19|20))(1:21))(3:22|(1:25)|28)|49|26|(3:29|40|41)|28|(1:(0))) */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0075, code lost:
    
        r9 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0076, code lost:
    
        r7 = r10;
        r10 = r9;
        r9 = r7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x007a, code lost:
    
        r9 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x007b, code lost:
    
        r1 = r10;
        r10 = r9;
        r9 = r1;
        r1 = r5;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0015  */
    /* JADX WARN: Type inference failed for: r9v0, types: [java.lang.Object, oO0O000o.OooOO0o<? super kotlin.coroutines.Continuation<? super T>, ? extends java.lang.Object>] */
    /* JADX WARN: Type inference failed for: r9v1 */
    /* JADX WARN: Type inference failed for: r9v10 */
    /* JADX WARN: Type inference failed for: r9v11, types: [oO0o0oOo.OooO00o] */
    /* JADX WARN: Type inference failed for: r9v17, types: [oO0o0oOo.OooO00o] */
    /* JADX WARN: Type inference failed for: r9v2, types: [oO0o0oOo.OooO00o] */
    /* JADX WARN: Type inference failed for: r9v20 */
    /* JADX WARN: Type inference failed for: r9v21 */
    /* JADX WARN: Type inference failed for: r9v22 */
    /* JADX WARN: Type inference failed for: r9v23 */
    /* JADX WARN: Type inference failed for: r9v3, types: [oO0O000o.OooOO0o] */
    /* JADX WARN: Type inference failed for: r9v5 */
    /* JADX WARN: Type inference failed for: r9v7 */
    /* JADX WARN: Type inference failed for: r9v9 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final <T> Object Oooo0o(InterfaceC32507OooOO0o<? super Continuation<? super T>, ? extends Object> interfaceC32507OooOO0o, Continuation<? super C32460OooOooO> continuation) throws Throwable {
        C23413OooOoO c23413OooOoO;
        C33898OooO0Oo c33898OooO0Oo;
        OooO0o oooO0o;
        ?? r9;
        ?? r92;
        if (continuation instanceof C23413OooOoO) {
            c23413OooOoO = (C23413OooOoO) continuation;
            int i = c23413OooOoO.f74385OooOoo0;
            if ((i & Integer.MIN_VALUE) != 0) {
                c23413OooOoO.f74385OooOoo0 = i - Integer.MIN_VALUE;
            } else {
                c23413OooOoO = new C23413OooOoO(continuation);
            }
        }
        Object obj = c23413OooOoO.f74382OooOoO;
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i2 = c23413OooOoO.f74385OooOoo0;
        try {
            if (i2 == 0) {
                C32446OooOOOo.OooO0O0(obj);
                c23413OooOoO.f74381OooOo0o = this;
                c23413OooOoO.f74380OooOo = interfaceC32507OooOO0o;
                c33898OooO0Oo = this.f74251Oooo000;
                c23413OooOoO.f74383OooOoO0 = c33898OooO0Oo;
                c23413OooOoO.f74385OooOoo0 = 1;
                if (c33898OooO0Oo.OooO00o(c23413OooOoO) != enumC32485OooO00o) {
                    oooO0o = this;
                    r9 = interfaceC32507OooOO0o;
                }
                return enumC32485OooO00o;
            }
            if (i2 != 1) {
                if (i2 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                interfaceC32507OooOO0o = (InterfaceC32507OooOO0o<? super Continuation<? super T>, ? extends Object>) ((InterfaceC33895OooO00o) c23413OooOoO.f74380OooOo);
                OooO0o oooO0o2 = c23413OooOoO.f74381OooOo0o;
                try {
                    C32446OooOOOo.OooO0O0(obj);
                    r92 = interfaceC32507OooOO0o;
                } catch (Exception e) {
                    Exception e2 = e;
                    C34406OooO00o.C20358OooO00o c20358OooO00o = C34406OooO00o.f123390OooO00o;
                    c20358OooO00o.OooOOO0("MediaToolbarViewModel");
                    c20358OooO00o.OooO0Oo(e2, "Error while acquiring playerStateLock", new Object[0]);
                    try {
                        oooO0o2.OooOo0o();
                    } catch (Exception e3) {
                        C34406OooO00o.C20358OooO00o c20358OooO00o2 = C34406OooO00o.f123390OooO00o;
                        c20358OooO00o2.OooOOO0("MediaToolbarViewModel");
                        c20358OooO00o2.OooO0Oo(e3, "Error while releasing MediaPlayer", new Object[0]);
                    }
                    C32460OooOooO c32460OooOooO = C32460OooOooO.f116667OooO00o;
                    r92 = interfaceC32507OooOO0o;
                }
                r92.OooOOO0(null);
                return C32460OooOooO.f116667OooO00o;
            }
            C33898OooO0Oo c33898OooO0Oo2 = c23413OooOoO.f74383OooOoO0;
            InterfaceC32507OooOO0o interfaceC32507OooOO0o2 = (InterfaceC32507OooOO0o) c23413OooOoO.f74380OooOo;
            oooO0o = c23413OooOoO.f74381OooOo0o;
            C32446OooOOOo.OooO0O0(obj);
            c33898OooO0Oo = c33898OooO0Oo2;
            r9 = (InterfaceC32507OooOO0o<? super Continuation<? super T>, ? extends Object>) interfaceC32507OooOO0o2;
            c23413OooOoO.f74381OooOo0o = oooO0o;
            c23413OooOoO.f74380OooOo = c33898OooO0Oo;
            c23413OooOoO.f74383OooOoO0 = null;
            c23413OooOoO.f74385OooOoo0 = 2;
            if (r9.invoke(c23413OooOoO) != enumC32485OooO00o) {
                r92 = c33898OooO0Oo;
                r92.OooOOO0(null);
                return C32460OooOooO.f116667OooO00o;
            }
            return enumC32485OooO00o;
        } catch (Throwable th) {
            th = th;
            interfaceC32507OooOO0o.OooOOO0(null);
            throw th;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object Oooo0o0(String str, String str2, AbstractC32479OooO0OO abstractC32479OooO0OO) throws Throwable {
        C29172OoooOOo c29172OoooOOo;
        Long lOooOOO;
        if (abstractC32479OooO0OO instanceof C29172OoooOOo) {
            c29172OoooOOo = (C29172OoooOOo) abstractC32479OooO0OO;
            int i = c29172OoooOOo.f103442OooOoO0;
            if ((i & Integer.MIN_VALUE) != 0) {
                c29172OoooOOo.f103442OooOoO0 = i - Integer.MIN_VALUE;
            } else {
                c29172OoooOOo = new C29172OoooOOo(this, abstractC32479OooO0OO);
            }
        }
        Object objOooO0o = c29172OoooOOo.f103441OooOo0o;
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i2 = c29172OoooOOo.f103442OooOoO0;
        if (i2 == 0) {
            C32446OooOOOo.OooO0O0(objOooO0o);
            MediaMetadataRetriever mediaMetadataRetriever = new MediaMetadataRetriever();
            mediaMetadataRetriever.setDataSource(str);
            String strExtractMetadata = mediaMetadataRetriever.extractMetadata(9);
            if (strExtractMetadata == null || (lOooOOO = C33596OooOOo0.OooOOO(strExtractMetadata)) == null) {
                C34406OooO00o.C20358OooO00o c20358OooO00o = C34406OooO00o.f123390OooO00o;
                c20358OooO00o.OooO0OO(androidx.core.app.OooO.OooO0O0(c20358OooO00o, "MediaToolbarViewModel", "updateAudioDurationOnStopRecording. duration is null. ", str), new Object[0]);
                return null;
            }
            long jLongValue = lOooOOO.longValue();
            C33874OooO0OO c33874OooO0OO = C33649OoooOOo.f121328OooO00o;
            ExecutorC33873OooO0O0 executorC33873OooO0O0 = ExecutorC33873OooO0O0.f122045OooOoO0;
            C29173OoooOo0 c29173OoooOo0 = new C29173OoooOo0(this, str, str2, jLongValue, null);
            c29172OoooOOo.f103442OooOoO0 = 1;
            objOooO0o = C33609OooO0oo.OooO0o(executorC33873OooO0O0, c29173OoooOo0, c29172OoooOOo);
            if (objOooO0o == enumC32485OooO00o) {
                return enumC32485OooO00o;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C32446OooOOOo.OooO0O0(objOooO0o);
        }
        return (AudioFile) objOooO0o;
    }
}
