package o0OoOOo;

import android.animation.ValueAnimator;
import android.content.Context;
import android.os.Message;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.DecelerateInterpolator;
import android.widget.ImageView;
import android.widget.SeekBar;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import com.aspose.words.StyleIdentifier;
import com.google.mlkit.p567nl.translate.TranslateLanguage;
import com.orion.notein.domain.models.note.AudioSyncRecord;
import com.orion.notein.global.R;
import com.orion.notein.p607ui.noteeditor.NoteEditorContainerFragment;
import com.orion.notein.p607ui.noteeditor.audio.AudioBarChildFragment;
import com.orion.notein.p607ui.noteeditor.audio.OooO0OO;
import com.orion.notein.p607ui.noteeditor.audio.view.WaveBarsStreamView;
import java.text.SimpleDateFormat;
import java.util.List;
import kotlin.coroutines.Continuation;
import o00o00O0.C25252OooO0Oo;
import o0Oo00oO.C28038OooO0Oo;
import o0OoO0oo.C28971o0OO00O;
import o0OoOo.C29194OooO00o;
import o0OoOo.C29195OooO0O0;
import o0OoOo.C29196OooO0OO;
import o0OoOo.C29197OooO0Oo;
import o0OoOo0o.C29210OooO00o;
import o0oo0o.InterfaceC31284OooO0O0;
import o0ooOOoo.InterfaceC31661OooO0oO;
import oO00ooO.C32446OooOOOo;
import oO00ooO.C32447OooOOo;
import oO00ooO.C32460OooOooO;
import oO00ooo.AbstractC32476OooO;
import oO00ooo.InterfaceC32482OooO0o0;
import oO00ooo0.EnumC32485OooO00o;
import oO0O000o.InterfaceC32508OooOOOo;
import oO0o0OO.C33609OooO0oo;
import oO0o0OO.InterfaceC33636Oooo00o;
import oOo000Oo.C34426OooOO0o;

/* JADX INFO: renamed from: o0OoOOo.OooOO0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
@InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.noteeditor.audio.AudioBarChildFragment$onViewInitialed$10", m80623f = "AudioBarChildFragment.kt", m80624l = {}, m80625m = "invokeSuspend")
public final class C29135OooOO0 extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super C32460OooOooO>, Object> {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final /* synthetic */ AudioBarChildFragment f103263OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public /* synthetic */ Object f103264OooOo0o;

    /* JADX INFO: renamed from: o0OoOOo.OooOO0$OooO00o */
    @InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.noteeditor.audio.AudioBarChildFragment$onViewInitialed$10$1", m80623f = "AudioBarChildFragment.kt", m80624l = {StyleIdentifier.GRID_TABLE_7_COLORFUL_ACCENT_5}, m80625m = "invokeSuspend")
    public static final class OooO00o extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super C32460OooOooO>, Object> {

        /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
        public final /* synthetic */ AudioBarChildFragment f103265OooOo;

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public int f103266OooOo0o;

        /* JADX INFO: renamed from: o0OoOOo.OooOO0$OooO00o$OooO00o, reason: collision with other inner class name */
        @InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.noteeditor.audio.AudioBarChildFragment$onViewInitialed$10$1$1", m80623f = "AudioBarChildFragment.kt", m80624l = {}, m80625m = "invokeSuspend")
        public static final class C19960OooO00o extends AbstractC32476OooO implements InterfaceC32508OooOOOo<List<? extends C29196OooO0OO>, Continuation<? super C32460OooOooO>, Object> {

            /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
            public final /* synthetic */ AudioBarChildFragment f103267OooOo;

            /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
            public /* synthetic */ Object f103268OooOo0o;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C19960OooO00o(AudioBarChildFragment audioBarChildFragment, Continuation<? super C19960OooO00o> continuation) {
                super(2, continuation);
                this.f103267OooOo = audioBarChildFragment;
            }

            @Override // oO00ooo.AbstractC32477OooO00o
            public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
                C19960OooO00o c19960OooO00o = new C19960OooO00o(this.f103267OooOo, continuation);
                c19960OooO00o.f103268OooOo0o = obj;
                return c19960OooO00o;
            }

            @Override // oO0O000o.InterfaceC32508OooOOOo
            public final Object invoke(List<? extends C29196OooO0OO> list, Continuation<? super C32460OooOooO> continuation) {
                return ((C19960OooO00o) create(list, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // oO00ooo.AbstractC32477OooO00o
            public final Object invokeSuspend(Object obj) {
                EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
                C32446OooOOOo.OooO0O0(obj);
                List<C29196OooO0OO> list = (List) this.f103268OooOo0o;
                AudioBarChildFragment audioBarChildFragment = this.f103267OooOo;
                C29194OooO00o c29194OooO00o = (C29194OooO00o) audioBarChildFragment.OooOoo0().f74239OooOo00.f121747OooOo0o.getValue();
                InterfaceC31661OooO0oO interfaceC31661OooO0oO = audioBarChildFragment.f74177OoooOO0;
                if (interfaceC31661OooO0oO != null) {
                    interfaceC31661OooO0oO.OooOOoo(list, c29194OooO00o, true);
                }
                return C32460OooOooO.f116667OooO00o;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO00o(AudioBarChildFragment audioBarChildFragment, Continuation<? super OooO00o> continuation) {
            super(2, continuation);
            this.f103265OooOo = audioBarChildFragment;
        }

        @Override // oO00ooo.AbstractC32477OooO00o
        public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
            return new OooO00o(this.f103265OooOo, continuation);
        }

        @Override // oO0O000o.InterfaceC32508OooOOOo
        public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super C32460OooOooO> continuation) {
            return ((OooO00o) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
        }

        @Override // oO00ooo.AbstractC32477OooO00o
        public final Object invokeSuspend(Object obj) {
            EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
            int i = this.f103266OooOo0o;
            if (i == 0) {
                C32446OooOOOo.OooO0O0(obj);
                AudioBarChildFragment audioBarChildFragment = this.f103265OooOo;
                com.orion.notein.p607ui.noteeditor.audio.OooO0o oooO0oOooOoo0 = audioBarChildFragment.OooOoo0();
                C19960OooO00o c19960OooO00o = new C19960OooO00o(audioBarChildFragment, null);
                this.f103266OooOo0o = 1;
                if (C25252OooO0Oo.OooO0oO(oooO0oOooOoo0.f74248OooOooo, c19960OooO00o, this) == enumC32485OooO00o) {
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

    /* JADX INFO: renamed from: o0OoOOo.OooOO0$OooO0O0 */
    @InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.noteeditor.audio.AudioBarChildFragment$onViewInitialed$10$2", m80623f = "AudioBarChildFragment.kt", m80624l = {StyleIdentifier.GRID_TABLE_7_COLORFUL_ACCENT_6}, m80625m = "invokeSuspend")
    public static final class OooO0O0 extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super C32460OooOooO>, Object> {

        /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
        public final /* synthetic */ AudioBarChildFragment f103269OooOo;

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public int f103270OooOo0o;

        /* JADX INFO: renamed from: o0OoOOo.OooOO0$OooO0O0$OooO00o */
        @InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.noteeditor.audio.AudioBarChildFragment$onViewInitialed$10$2$1", m80623f = "AudioBarChildFragment.kt", m80624l = {}, m80625m = "invokeSuspend")
        public static final class OooO00o extends AbstractC32476OooO implements InterfaceC32508OooOOOo<List<? extends C29197OooO0Oo>, Continuation<? super C32460OooOooO>, Object> {

            /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
            public final /* synthetic */ AudioBarChildFragment f103271OooOo;

            /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
            public /* synthetic */ Object f103272OooOo0o;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public OooO00o(AudioBarChildFragment audioBarChildFragment, Continuation<? super OooO00o> continuation) {
                super(2, continuation);
                this.f103271OooOo = audioBarChildFragment;
            }

            @Override // oO00ooo.AbstractC32477OooO00o
            public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
                OooO00o oooO00o = new OooO00o(this.f103271OooOo, continuation);
                oooO00o.f103272OooOo0o = obj;
                return oooO00o;
            }

            @Override // oO0O000o.InterfaceC32508OooOOOo
            public final Object invoke(List<? extends C29197OooO0Oo> list, Continuation<? super C32460OooOooO> continuation) {
                return ((OooO00o) create(list, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
            }

            @Override // oO00ooo.AbstractC32477OooO00o
            public final Object invokeSuspend(Object obj) {
                EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
                C32446OooOOOo.OooO0O0(obj);
                List<C29197OooO0Oo> list = (List) this.f103272OooOo0o;
                InterfaceC31661OooO0oO interfaceC31661OooO0oO = this.f103271OooOo.f74177OoooOO0;
                if (interfaceC31661OooO0oO != null) {
                    interfaceC31661OooO0oO.OooO0Oo(list);
                }
                return C32460OooOooO.f116667OooO00o;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO0O0(AudioBarChildFragment audioBarChildFragment, Continuation<? super OooO0O0> continuation) {
            super(2, continuation);
            this.f103269OooOo = audioBarChildFragment;
        }

        @Override // oO00ooo.AbstractC32477OooO00o
        public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
            return new OooO0O0(this.f103269OooOo, continuation);
        }

        @Override // oO0O000o.InterfaceC32508OooOOOo
        public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super C32460OooOooO> continuation) {
            return ((OooO0O0) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
        }

        @Override // oO00ooo.AbstractC32477OooO00o
        public final Object invokeSuspend(Object obj) {
            EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
            int i = this.f103270OooOo0o;
            if (i == 0) {
                C32446OooOOOo.OooO0O0(obj);
                AudioBarChildFragment audioBarChildFragment = this.f103269OooOo;
                com.orion.notein.p607ui.noteeditor.audio.OooO0o oooO0oOooOoo0 = audioBarChildFragment.OooOoo0();
                OooO00o oooO00o = new OooO00o(audioBarChildFragment, null);
                this.f103270OooOo0o = 1;
                if (C25252OooO0Oo.OooO0oO(oooO0oOooOoo0.f74244OooOoOO, oooO00o, this) == enumC32485OooO00o) {
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

    /* JADX INFO: renamed from: o0OoOOo.OooOO0$OooO0OO */
    @InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.noteeditor.audio.AudioBarChildFragment$onViewInitialed$10$3", m80623f = "AudioBarChildFragment.kt", m80624l = {StyleIdentifier.LIST_TABLE_6_COLORFUL}, m80625m = "invokeSuspend")
    public static final class OooO0OO extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super C32460OooOooO>, Object> {

        /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
        public final /* synthetic */ AudioBarChildFragment f103273OooOo;

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public int f103274OooOo0o;

        /* JADX INFO: renamed from: o0OoOOo.OooOO0$OooO0OO$OooO00o */
        @InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.noteeditor.audio.AudioBarChildFragment$onViewInitialed$10$3$1", m80623f = "AudioBarChildFragment.kt", m80624l = {}, m80625m = "invokeSuspend")
        public static final class OooO00o extends AbstractC32476OooO implements InterfaceC32508OooOOOo<C29194OooO00o, Continuation<? super C32460OooOooO>, Object> {

            /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
            public final /* synthetic */ AudioBarChildFragment f103275OooOo;

            /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
            public /* synthetic */ Object f103276OooOo0o;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public OooO00o(AudioBarChildFragment audioBarChildFragment, Continuation<? super OooO00o> continuation) {
                super(2, continuation);
                this.f103275OooOo = audioBarChildFragment;
            }

            @Override // oO00ooo.AbstractC32477OooO00o
            public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
                OooO00o oooO00o = new OooO00o(this.f103275OooOo, continuation);
                oooO00o.f103276OooOo0o = obj;
                return oooO00o;
            }

            @Override // oO0O000o.InterfaceC32508OooOOOo
            public final Object invoke(C29194OooO00o c29194OooO00o, Continuation<? super C32460OooOooO> continuation) {
                return ((OooO00o) create(c29194OooO00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
            }

            /* JADX WARN: Removed duplicated region for block: B:91:0x0150  */
            @Override // oO00ooo.AbstractC32477OooO00o
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final Object invokeSuspend(Object obj) {
                EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
                C32446OooOOOo.OooO0O0(obj);
                C29194OooO00o c29194OooO00o = (C29194OooO00o) this.f103276OooOo0o;
                AudioBarChildFragment audioBarChildFragment = this.f103275OooOo;
                if (c29194OooO00o != null) {
                    audioBarChildFragment.getClass();
                    if (c29194OooO00o.f103551OooO0oo) {
                        TextView textView = audioBarChildFragment.f74172Oooo0oo;
                        if (textView == null) {
                            kotlin.jvm.internal.OooOOO0.OooOOOO("tvPlayDuration");
                            throw null;
                        }
                        textView.setVisibility(8);
                        TextView textView2 = audioBarChildFragment.f74171Oooo0oO;
                        if (textView2 == null) {
                            kotlin.jvm.internal.OooOOO0.OooOOOO("tvPlayPosition");
                            throw null;
                        }
                        textView2.setVisibility(8);
                        SeekBar seekBar = audioBarChildFragment.f74169Oooo0o;
                        if (seekBar == null) {
                            kotlin.jvm.internal.OooOOO0.OooOOOO("playerProgress");
                            throw null;
                        }
                        seekBar.setMax(0);
                        SeekBar seekBar2 = audioBarChildFragment.f74169Oooo0o;
                        if (seekBar2 == null) {
                            kotlin.jvm.internal.OooOOO0.OooOOOO("playerProgress");
                            throw null;
                        }
                        seekBar2.setProgress(0);
                    } else {
                        AudioBarChildFragment.OooO00o oooO00o = audioBarChildFragment.f74176OoooO0O;
                        boolean z = c29194OooO00o.f103550OooO0oO;
                        if (z) {
                            ImageView imageView = audioBarChildFragment.f74164Oooo000;
                            if (imageView == null) {
                                kotlin.jvm.internal.OooOOO0.OooOOOO("btnPlay");
                                throw null;
                            }
                            boolean zIsActivated = imageView.isActivated();
                            C32447OooOOo c32447OooOOo = audioBarChildFragment.f74180o000oOoO;
                            if (!zIsActivated) {
                                ImageView imageView2 = audioBarChildFragment.f74164Oooo000;
                                if (imageView2 == null) {
                                    kotlin.jvm.internal.OooOOO0.OooOOOO("btnPlay");
                                    throw null;
                                }
                                imageView2.setActivated(true);
                                ImageView imageView3 = audioBarChildFragment.f74164Oooo000;
                                if (imageView3 == null) {
                                    kotlin.jvm.internal.OooOOO0.OooOOOO("btnPlay");
                                    throw null;
                                }
                                imageView3.setImageDrawable((C29210OooO00o) c32447OooOOo.getValue());
                                oooO00o.sendMessage(Message.obtain(oooO00o, 0, Boolean.TRUE));
                            }
                            C29210OooO00o c29210OooO00o = (C29210OooO00o) c32447OooOOo.getValue();
                            c29210OooO00o.getClass();
                            List<Float> bars = c29194OooO00o.f103547OooO0Oo;
                            kotlin.jvm.internal.OooOOO0.OooO0oO(bars, "bars");
                            c29210OooO00o.f103594OooO0O0 = bars;
                            c29210OooO00o.invalidateSelf();
                        } else {
                            ImageView imageView4 = audioBarChildFragment.f74164Oooo000;
                            if (imageView4 == null) {
                                kotlin.jvm.internal.OooOOO0.OooOOOO("btnPlay");
                                throw null;
                            }
                            if (imageView4.isActivated()) {
                                ImageView imageView5 = audioBarChildFragment.f74164Oooo000;
                                if (imageView5 == null) {
                                    kotlin.jvm.internal.OooOOO0.OooOOOO("btnPlay");
                                    throw null;
                                }
                                imageView5.setActivated(false);
                                ImageView imageView6 = audioBarChildFragment.f74164Oooo000;
                                if (imageView6 == null) {
                                    kotlin.jvm.internal.OooOOO0.OooOOOO("btnPlay");
                                    throw null;
                                }
                                imageView6.setImageResource(R.drawable.ic_ni_media_play_normal);
                                oooO00o.removeCallbacksAndMessages(null);
                                oooO00o.sendMessage(Message.obtain(oooO00o, 0, Boolean.FALSE));
                            }
                        }
                        SimpleDateFormat simpleDateFormat = audioBarChildFragment.f74173OoooO;
                        long j = c29194OooO00o.f103549OooO0o0;
                        String str = simpleDateFormat.format(Long.valueOf(j));
                        int max = c29194OooO00o.f103546OooO0OO;
                        String str2 = simpleDateFormat.format(Integer.valueOf(max));
                        TextView textView3 = audioBarChildFragment.f74172Oooo0oo;
                        if (textView3 == null) {
                            kotlin.jvm.internal.OooOOO0.OooOOOO("tvPlayDuration");
                            throw null;
                        }
                        textView3.setText(str);
                        TextView textView4 = audioBarChildFragment.f74172Oooo0oo;
                        if (textView4 == null) {
                            kotlin.jvm.internal.OooOOO0.OooOOOO("tvPlayDuration");
                            throw null;
                        }
                        textView4.setVisibility(0);
                        TextView textView5 = audioBarChildFragment.f74171Oooo0oO;
                        if (textView5 == null) {
                            kotlin.jvm.internal.OooOOO0.OooOOOO("tvPlayPosition");
                            throw null;
                        }
                        textView5.setText(str2);
                        TextView textView6 = audioBarChildFragment.f74171Oooo0oO;
                        if (textView6 == null) {
                            kotlin.jvm.internal.OooOOO0.OooOOOO("tvPlayPosition");
                            throw null;
                        }
                        textView6.setVisibility(0);
                        SeekBar seekBar3 = audioBarChildFragment.f74169Oooo0o;
                        if (seekBar3 == null) {
                            kotlin.jvm.internal.OooOOO0.OooOOOO("playerProgress");
                            throw null;
                        }
                        int i = (int) j;
                        if (seekBar3.getMax() != i) {
                            SeekBar seekBar4 = audioBarChildFragment.f74169Oooo0o;
                            if (seekBar4 == null) {
                                kotlin.jvm.internal.OooOOO0.OooOOOO("playerProgress");
                                throw null;
                            }
                            seekBar4.setMax(i);
                        }
                        if (kotlin.jvm.internal.OooOOO0.OooO0O0(audioBarChildFragment.OooOoo0().f74227OooOO0.getValue(), OooO0OO.OooO0o.f74211OooO0O0) && !z && max > j - ((long) 500)) {
                            SeekBar seekBar5 = audioBarChildFragment.f74169Oooo0o;
                            if (seekBar5 == null) {
                                kotlin.jvm.internal.OooOOO0.OooOOOO("playerProgress");
                                throw null;
                            }
                            max = seekBar5.getMax();
                        }
                        InterfaceC31661OooO0oO interfaceC31661OooO0oO = audioBarChildFragment.f74177OoooOO0;
                        if (interfaceC31661OooO0oO == null || !interfaceC31661OooO0oO.OooOO0o()) {
                            SeekBar seekBar6 = audioBarChildFragment.f74169Oooo0o;
                            if (seekBar6 == null) {
                                kotlin.jvm.internal.OooOOO0.OooOOOO("playerProgress");
                                throw null;
                            }
                            seekBar6.setProgress(max, true);
                        } else {
                            SeekBar seekBar7 = audioBarChildFragment.f74169Oooo0o;
                            if (seekBar7 == null) {
                                kotlin.jvm.internal.OooOOO0.OooOOOO("playerProgress");
                                throw null;
                            }
                            seekBar7.setProgress(max, false);
                        }
                    }
                }
                List<C29196OooO0OO> list = (List) audioBarChildFragment.OooOoo0().f74248OooOooo.f121747OooOo0o.getValue();
                InterfaceC31661OooO0oO interfaceC31661OooO0oO2 = audioBarChildFragment.f74177OoooOO0;
                if (interfaceC31661OooO0oO2 != null) {
                    interfaceC31661OooO0oO2.OooOOoo(list, c29194OooO00o, false);
                }
                return C32460OooOooO.f116667OooO00o;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO0OO(AudioBarChildFragment audioBarChildFragment, Continuation<? super OooO0OO> continuation) {
            super(2, continuation);
            this.f103273OooOo = audioBarChildFragment;
        }

        @Override // oO00ooo.AbstractC32477OooO00o
        public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
            return new OooO0OO(this.f103273OooOo, continuation);
        }

        @Override // oO0O000o.InterfaceC32508OooOOOo
        public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super C32460OooOooO> continuation) {
            return ((OooO0OO) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
        }

        @Override // oO00ooo.AbstractC32477OooO00o
        public final Object invokeSuspend(Object obj) {
            EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
            int i = this.f103274OooOo0o;
            if (i == 0) {
                C32446OooOOOo.OooO0O0(obj);
                AudioBarChildFragment audioBarChildFragment = this.f103273OooOo;
                com.orion.notein.p607ui.noteeditor.audio.OooO0o oooO0oOooOoo0 = audioBarChildFragment.OooOoo0();
                OooO00o oooO00o = new OooO00o(audioBarChildFragment, null);
                this.f103274OooOo0o = 1;
                if (C25252OooO0Oo.OooO0oO(oooO0oOooOoo0.f74239OooOo00, oooO00o, this) == enumC32485OooO00o) {
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

    /* JADX INFO: renamed from: o0OoOOo.OooOO0$OooO0Oo, reason: case insensitive filesystem */
    @InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.noteeditor.audio.AudioBarChildFragment$onViewInitialed$10$4", m80623f = "AudioBarChildFragment.kt", m80624l = {StyleIdentifier.LIST_TABLE_7_COLORFUL_ACCENT_1}, m80625m = "invokeSuspend")
    public static final class C29136OooO0Oo extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super C32460OooOooO>, Object> {

        /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
        public final /* synthetic */ AudioBarChildFragment f103277OooOo;

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public int f103278OooOo0o;

        /* JADX INFO: renamed from: o0OoOOo.OooOO0$OooO0Oo$OooO00o */
        @InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.noteeditor.audio.AudioBarChildFragment$onViewInitialed$10$4$1", m80623f = "AudioBarChildFragment.kt", m80624l = {}, m80625m = "invokeSuspend")
        public static final class OooO00o extends AbstractC32476OooO implements InterfaceC32508OooOOOo<C29195OooO0O0, Continuation<? super C32460OooOooO>, Object> {

            /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
            public final /* synthetic */ AudioBarChildFragment f103279OooOo;

            /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
            public /* synthetic */ Object f103280OooOo0o;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public OooO00o(AudioBarChildFragment audioBarChildFragment, Continuation<? super OooO00o> continuation) {
                super(2, continuation);
                this.f103279OooOo = audioBarChildFragment;
            }

            @Override // oO00ooo.AbstractC32477OooO00o
            public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
                OooO00o oooO00o = new OooO00o(this.f103279OooOo, continuation);
                oooO00o.f103280OooOo0o = obj;
                return oooO00o;
            }

            @Override // oO0O000o.InterfaceC32508OooOOOo
            public final Object invoke(C29195OooO0O0 c29195OooO0O0, Continuation<? super C32460OooOooO> continuation) {
                return ((OooO00o) create(c29195OooO0O0, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
            }

            /* JADX WARN: Removed duplicated region for block: B:50:0x00b0  */
            @Override // oO00ooo.AbstractC32477OooO00o
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final Object invokeSuspend(Object obj) {
                EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
                C32446OooOOOo.OooO0O0(obj);
                C29195OooO0O0 c29195OooO0O0 = (C29195OooO0O0) this.f103280OooOo0o;
                AudioBarChildFragment audioBarChildFragment = this.f103279OooOo;
                if (c29195OooO0O0 != null) {
                    audioBarChildFragment.getClass();
                    if (c29195OooO0O0.f103555OooO0Oo) {
                        ImageView imageView = audioBarChildFragment.f74164Oooo000;
                        if (imageView == null) {
                            kotlin.jvm.internal.OooOOO0.OooOOOO("btnPlay");
                            throw null;
                        }
                        imageView.setVisibility(8);
                        View view = audioBarChildFragment.f74166Oooo00o;
                        if (view != null) {
                            view.setVisibility(8);
                        }
                        View view2 = audioBarChildFragment.f74163Oooo0;
                        if (view2 != null) {
                            view2.setVisibility(8);
                        }
                        ViewGroup viewGroup = audioBarChildFragment.f74170Oooo0o0;
                        if (viewGroup == null) {
                            kotlin.jvm.internal.OooOOO0.OooOOOO("playProgressContainer");
                            throw null;
                        }
                        viewGroup.setVisibility(8);
                        ImageView imageView2 = audioBarChildFragment.f74165Oooo00O;
                        if (imageView2 == null) {
                            kotlin.jvm.internal.OooOOO0.OooOOOO("btnStopRecording");
                            throw null;
                        }
                        imageView2.setVisibility(0);
                        ViewGroup viewGroup2 = audioBarChildFragment.f74162Oooo;
                        if (viewGroup2 == null) {
                            kotlin.jvm.internal.OooOOO0.OooOOOO("recorderProgressContainer");
                            throw null;
                        }
                        viewGroup2.setVisibility(0);
                        WaveBarsStreamView waveBarsStreamView = audioBarChildFragment.f74175OoooO00;
                        if (waveBarsStreamView == null) {
                            kotlin.jvm.internal.OooOOO0.OooOOOO("recorderProgress");
                            throw null;
                        }
                        boolean z = waveBarsStreamView.f74440OooOooO;
                        if (!z && !z) {
                            waveBarsStreamView.f74440OooOooO = true;
                            C34426OooOO0o<Float> c34426OooOO0o = waveBarsStreamView.f74433OooOo;
                            c34426OooOO0o.clear();
                            WaveBarsStreamView.OooO00o oooO00o = waveBarsStreamView.f74442Oooo000;
                            c34426OooOO0o.addLast(Float.valueOf(oooO00o != null ? oooO00o.OooO00o() : 0.1f));
                            waveBarsStreamView.post(waveBarsStreamView.f74441OooOooo);
                        }
                        String str = audioBarChildFragment.f74173OoooO.format(Integer.valueOf(c29195OooO0O0.f103553OooO0O0));
                        TextView textView = audioBarChildFragment.f74174OoooO0;
                        if (textView == null) {
                            kotlin.jvm.internal.OooOOO0.OooOOOO("tvRecordingDuration");
                            throw null;
                        }
                        textView.setText(str);
                        TextView textView2 = audioBarChildFragment.f74174OoooO0;
                        if (textView2 == null) {
                            kotlin.jvm.internal.OooOOO0.OooOOOO("tvRecordingDuration");
                            throw null;
                        }
                        textView2.setVisibility(0);
                    } else {
                        ImageView imageView3 = audioBarChildFragment.f74164Oooo000;
                        if (imageView3 == null) {
                            kotlin.jvm.internal.OooOOO0.OooOOOO("btnPlay");
                            throw null;
                        }
                        imageView3.setVisibility(0);
                        View view3 = audioBarChildFragment.f74166Oooo00o;
                        if (view3 != null) {
                            view3.setVisibility(0);
                        }
                        View view4 = audioBarChildFragment.f74163Oooo0;
                        if (view4 != null) {
                            view4.setVisibility(0);
                        }
                        ViewGroup viewGroup3 = audioBarChildFragment.f74170Oooo0o0;
                        if (viewGroup3 == null) {
                            kotlin.jvm.internal.OooOOO0.OooOOOO("playProgressContainer");
                            throw null;
                        }
                        viewGroup3.setVisibility(0);
                        ImageView imageView4 = audioBarChildFragment.f74165Oooo00O;
                        if (imageView4 == null) {
                            kotlin.jvm.internal.OooOOO0.OooOOOO("btnStopRecording");
                            throw null;
                        }
                        imageView4.setVisibility(8);
                        ViewGroup viewGroup4 = audioBarChildFragment.f74162Oooo;
                        if (viewGroup4 == null) {
                            kotlin.jvm.internal.OooOOO0.OooOOOO("recorderProgressContainer");
                            throw null;
                        }
                        viewGroup4.setVisibility(8);
                        WaveBarsStreamView waveBarsStreamView2 = audioBarChildFragment.f74175OoooO00;
                        if (waveBarsStreamView2 == null) {
                            kotlin.jvm.internal.OooOOO0.OooOOOO("recorderProgress");
                            throw null;
                        }
                        waveBarsStreamView2.f74440OooOooO = false;
                        waveBarsStreamView2.removeCallbacks(waveBarsStreamView2.f74441OooOooo);
                    }
                }
                return C32460OooOooO.f116667OooO00o;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C29136OooO0Oo(AudioBarChildFragment audioBarChildFragment, Continuation<? super C29136OooO0Oo> continuation) {
            super(2, continuation);
            this.f103277OooOo = audioBarChildFragment;
        }

        @Override // oO00ooo.AbstractC32477OooO00o
        public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
            return new C29136OooO0Oo(this.f103277OooOo, continuation);
        }

        @Override // oO0O000o.InterfaceC32508OooOOOo
        public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super C32460OooOooO> continuation) {
            return ((C29136OooO0Oo) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
        }

        @Override // oO00ooo.AbstractC32477OooO00o
        public final Object invokeSuspend(Object obj) {
            EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
            int i = this.f103278OooOo0o;
            if (i == 0) {
                C32446OooOOOo.OooO0O0(obj);
                AudioBarChildFragment audioBarChildFragment = this.f103277OooOo;
                com.orion.notein.p607ui.noteeditor.audio.OooO0o oooO0oOooOoo0 = audioBarChildFragment.OooOoo0();
                OooO00o oooO00o = new OooO00o(audioBarChildFragment, null);
                this.f103278OooOo0o = 1;
                if (C25252OooO0Oo.OooO0oO(oooO0oOooOoo0.f74237OooOo, oooO00o, this) == enumC32485OooO00o) {
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

    /* JADX INFO: renamed from: o0OoOOo.OooOO0$OooO0o */
    @InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.noteeditor.audio.AudioBarChildFragment$onViewInitialed$10$6", m80623f = "AudioBarChildFragment.kt", m80624l = {StyleIdentifier.LIST_TABLE_4_ACCENT_3}, m80625m = "invokeSuspend")
    public static final class OooO0o extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super C32460OooOooO>, Object> {

        /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
        public final /* synthetic */ AudioBarChildFragment f103281OooOo;

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public int f103282OooOo0o;

        /* JADX INFO: renamed from: o0OoOOo.OooOO0$OooO0o$OooO00o */
        @InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.noteeditor.audio.AudioBarChildFragment$onViewInitialed$10$6$1", m80623f = "AudioBarChildFragment.kt", m80624l = {}, m80625m = "invokeSuspend")
        public static final class OooO00o extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC31284OooO0O0, Continuation<? super C32460OooOooO>, Object> {

            /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
            public final /* synthetic */ AudioBarChildFragment f103283OooOo;

            /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
            public /* synthetic */ Object f103284OooOo0o;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public OooO00o(AudioBarChildFragment audioBarChildFragment, Continuation<? super OooO00o> continuation) {
                super(2, continuation);
                this.f103283OooOo = audioBarChildFragment;
            }

            @Override // oO00ooo.AbstractC32477OooO00o
            public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
                OooO00o oooO00o = new OooO00o(this.f103283OooOo, continuation);
                oooO00o.f103284OooOo0o = obj;
                return oooO00o;
            }

            @Override // oO0O000o.InterfaceC32508OooOOOo
            public final Object invoke(InterfaceC31284OooO0O0 interfaceC31284OooO0O0, Continuation<? super C32460OooOooO> continuation) {
                return ((OooO00o) create(interfaceC31284OooO0O0, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
            }

            @Override // oO00ooo.AbstractC32477OooO00o
            public final Object invokeSuspend(Object obj) {
                EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
                C32446OooOOOo.OooO0O0(obj);
                InterfaceC31284OooO0O0 interfaceC31284OooO0O0 = (InterfaceC31284OooO0O0) this.f103284OooOo0o;
                Fragment parentFragment = this.f103283OooOo.getParentFragment();
                NoteEditorContainerFragment noteEditorContainerFragment = parentFragment instanceof NoteEditorContainerFragment ? (NoteEditorContainerFragment) parentFragment : null;
                if (noteEditorContainerFragment != null) {
                    noteEditorContainerFragment.Oooo0OO(33, interfaceC31284OooO0O0);
                }
                return C32460OooOooO.f116667OooO00o;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO0o(AudioBarChildFragment audioBarChildFragment, Continuation<? super OooO0o> continuation) {
            super(2, continuation);
            this.f103281OooOo = audioBarChildFragment;
        }

        @Override // oO00ooo.AbstractC32477OooO00o
        public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
            return new OooO0o(this.f103281OooOo, continuation);
        }

        @Override // oO0O000o.InterfaceC32508OooOOOo
        public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super C32460OooOooO> continuation) {
            return ((OooO0o) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
        }

        @Override // oO00ooo.AbstractC32477OooO00o
        public final Object invokeSuspend(Object obj) {
            EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
            int i = this.f103282OooOo0o;
            if (i == 0) {
                C32446OooOOOo.OooO0O0(obj);
                AudioBarChildFragment audioBarChildFragment = this.f103281OooOo;
                com.orion.notein.p607ui.noteeditor.audio.OooO0o oooO0oOooOoo0 = audioBarChildFragment.OooOoo0();
                OooO00o oooO00o = new OooO00o(audioBarChildFragment, null);
                this.f103282OooOo0o = 1;
                if (C25252OooO0Oo.OooO0oO(oooO0oOooOoo0.f74250Oooo0, oooO00o, this) == enumC32485OooO00o) {
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

    /* JADX INFO: renamed from: o0OoOOo.OooOO0$OooO0o0, reason: case insensitive filesystem */
    @InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.noteeditor.audio.AudioBarChildFragment$onViewInitialed$10$5", m80623f = "AudioBarChildFragment.kt", m80624l = {StyleIdentifier.LIST_TABLE_6_COLORFUL_ACCENT_2}, m80625m = "invokeSuspend")
    public static final class C29137OooO0o0 extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super C32460OooOooO>, Object> {

        /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
        public final /* synthetic */ AudioBarChildFragment f103285OooOo;

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public int f103286OooOo0o;

        /* JADX INFO: renamed from: o0OoOOo.OooOO0$OooO0o0$OooO00o */
        @InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.noteeditor.audio.AudioBarChildFragment$onViewInitialed$10$5$1", m80623f = "AudioBarChildFragment.kt", m80624l = {}, m80625m = "invokeSuspend")
        public static final class OooO00o extends AbstractC32476OooO implements InterfaceC32508OooOOOo<List<? extends AudioSyncRecord>, Continuation<? super C32460OooOooO>, Object> {
            public OooO00o() {
                throw null;
            }

            @Override // oO00ooo.AbstractC32477OooO00o
            public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
                return new OooO00o(2, continuation);
            }

            @Override // oO0O000o.InterfaceC32508OooOOOo
            public final Object invoke(List<? extends AudioSyncRecord> list, Continuation<? super C32460OooOooO> continuation) {
                return ((OooO00o) create(list, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
            }

            @Override // oO00ooo.AbstractC32477OooO00o
            public final Object invokeSuspend(Object obj) {
                EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
                C32446OooOOOo.OooO0O0(obj);
                return C32460OooOooO.f116667OooO00o;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C29137OooO0o0(AudioBarChildFragment audioBarChildFragment, Continuation<? super C29137OooO0o0> continuation) {
            super(2, continuation);
            this.f103285OooOo = audioBarChildFragment;
        }

        @Override // oO00ooo.AbstractC32477OooO00o
        public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
            return new C29137OooO0o0(this.f103285OooOo, continuation);
        }

        @Override // oO0O000o.InterfaceC32508OooOOOo
        public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super C32460OooOooO> continuation) {
            return ((C29137OooO0o0) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
        }

        @Override // oO00ooo.AbstractC32477OooO00o
        public final Object invokeSuspend(Object obj) {
            EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
            int i = this.f103286OooOo0o;
            if (i == 0) {
                C32446OooOOOo.OooO0O0(obj);
                com.orion.notein.p607ui.noteeditor.audio.OooO0o oooO0oOooOoo0 = this.f103285OooOo.OooOoo0();
                OooO00o oooO00o = new OooO00o(2, null);
                this.f103286OooOo0o = 1;
                if (C25252OooO0Oo.OooO0oO(oooO0oOooOoo0.f74243OooOoO0, oooO00o, this) == enumC32485OooO00o) {
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

    /* JADX INFO: renamed from: o0OoOOo.OooOO0$OooO0oO, reason: case insensitive filesystem */
    @InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.noteeditor.audio.AudioBarChildFragment$onViewInitialed$10$7", m80623f = "AudioBarChildFragment.kt", m80624l = {StyleIdentifier.LIST_TABLE_3_ACCENT_4}, m80625m = "invokeSuspend")
    public static final class C29138OooO0oO extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super C32460OooOooO>, Object> {

        /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
        public final /* synthetic */ AudioBarChildFragment f103287OooOo;

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public int f103288OooOo0o;

        /* JADX INFO: renamed from: o0OoOOo.OooOO0$OooO0oO$OooO00o */
        @InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.noteeditor.audio.AudioBarChildFragment$onViewInitialed$10$7$1", m80623f = "AudioBarChildFragment.kt", m80624l = {}, m80625m = "invokeSuspend")
        public static final class OooO00o extends AbstractC32476OooO implements InterfaceC32508OooOOOo<Boolean, Continuation<? super C32460OooOooO>, Object> {

            /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
            public final /* synthetic */ AudioBarChildFragment f103289OooOo;

            /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
            public /* synthetic */ boolean f103290OooOo0o;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public OooO00o(AudioBarChildFragment audioBarChildFragment, Continuation<? super OooO00o> continuation) {
                super(2, continuation);
                this.f103289OooOo = audioBarChildFragment;
            }

            @Override // oO00ooo.AbstractC32477OooO00o
            public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
                OooO00o oooO00o = new OooO00o(this.f103289OooOo, continuation);
                oooO00o.f103290OooOo0o = ((Boolean) obj).booleanValue();
                return oooO00o;
            }

            @Override // oO0O000o.InterfaceC32508OooOOOo
            public final Object invoke(Boolean bool, Continuation<? super C32460OooOooO> continuation) {
                Boolean bool2 = bool;
                bool2.booleanValue();
                return ((OooO00o) create(bool2, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
            }

            @Override // oO00ooo.AbstractC32477OooO00o
            public final Object invokeSuspend(Object obj) {
                EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
                C32446OooOOOo.OooO0O0(obj);
                boolean z = this.f103290OooOo0o;
                InterfaceC31661OooO0oO interfaceC31661OooO0oO = this.f103289OooOo.f74177OoooOO0;
                if (interfaceC31661OooO0oO != null) {
                    interfaceC31661OooO0oO.OooOO0(z);
                }
                return C32460OooOooO.f116667OooO00o;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C29138OooO0oO(AudioBarChildFragment audioBarChildFragment, Continuation<? super C29138OooO0oO> continuation) {
            super(2, continuation);
            this.f103287OooOo = audioBarChildFragment;
        }

        @Override // oO00ooo.AbstractC32477OooO00o
        public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
            return new C29138OooO0oO(this.f103287OooOo, continuation);
        }

        @Override // oO0O000o.InterfaceC32508OooOOOo
        public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super C32460OooOooO> continuation) {
            return ((C29138OooO0oO) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
        }

        @Override // oO00ooo.AbstractC32477OooO00o
        public final Object invokeSuspend(Object obj) {
            EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
            int i = this.f103288OooOo0o;
            if (i == 0) {
                C32446OooOOOo.OooO0O0(obj);
                AudioBarChildFragment audioBarChildFragment = this.f103287OooOo;
                com.orion.notein.p607ui.noteeditor.audio.OooO0o oooO0oOooOoo0 = audioBarChildFragment.OooOoo0();
                OooO00o oooO00o = new OooO00o(audioBarChildFragment, null);
                this.f103288OooOo0o = 1;
                if (C25252OooO0Oo.OooO0oO(oooO0oOooOoo0.f74245OooOoo, oooO00o, this) == enumC32485OooO00o) {
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

    /* JADX INFO: renamed from: o0OoOOo.OooOO0$OooO0oo, reason: case insensitive filesystem */
    @InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.noteeditor.audio.AudioBarChildFragment$onViewInitialed$10$8", m80623f = "AudioBarChildFragment.kt", m80624l = {StyleIdentifier.LIST_TABLE_2_ACCENT_5}, m80625m = "invokeSuspend")
    public static final class C29139OooO0oo extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super C32460OooOooO>, Object> {

        /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
        public final /* synthetic */ AudioBarChildFragment f103291OooOo;

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public int f103292OooOo0o;

        /* JADX INFO: renamed from: o0OoOOo.OooOO0$OooO0oo$OooO00o */
        @InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.noteeditor.audio.AudioBarChildFragment$onViewInitialed$10$8$1", m80623f = "AudioBarChildFragment.kt", m80624l = {}, m80625m = "invokeSuspend")
        public static final class OooO00o extends AbstractC32476OooO implements InterfaceC32508OooOOOo<Boolean, Continuation<? super C32460OooOooO>, Object> {

            /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
            public final /* synthetic */ AudioBarChildFragment f103293OooOo;

            /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
            public /* synthetic */ boolean f103294OooOo0o;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public OooO00o(AudioBarChildFragment audioBarChildFragment, Continuation<? super OooO00o> continuation) {
                super(2, continuation);
                this.f103293OooOo = audioBarChildFragment;
            }

            @Override // oO00ooo.AbstractC32477OooO00o
            public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
                OooO00o oooO00o = new OooO00o(this.f103293OooOo, continuation);
                oooO00o.f103294OooOo0o = ((Boolean) obj).booleanValue();
                return oooO00o;
            }

            @Override // oO0O000o.InterfaceC32508OooOOOo
            public final Object invoke(Boolean bool, Continuation<? super C32460OooOooO> continuation) {
                Boolean bool2 = bool;
                bool2.booleanValue();
                return ((OooO00o) create(bool2, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
            }

            /* JADX WARN: Removed duplicated region for block: B:35:0x00ae  */
            @Override // oO00ooo.AbstractC32477OooO00o
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final Object invokeSuspend(Object obj) {
                int dimensionPixelSize;
                EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
                C32446OooOOOo.OooO0O0(obj);
                boolean z = this.f103294OooOo0o;
                final AudioBarChildFragment audioBarChildFragment = this.f103293OooOo;
                if (audioBarChildFragment.f74178OoooOOO) {
                    Context contextRequireContext = audioBarChildFragment.requireContext();
                    kotlin.jvm.internal.OooOOO0.OooO0o(contextRequireContext, "requireContext(...)");
                    if (C28038OooO0Oo.OooO0O0(contextRequireContext)) {
                        View view = audioBarChildFragment.f74161OooOooo;
                        if (view == null) {
                            kotlin.jvm.internal.OooOOO0.OooOOOO("rootView");
                            throw null;
                        }
                        float dimensionPixelSize2 = view.getResources().getDimensionPixelSize(R.dimen.v_audio_bar_width_with_shadow_immersive);
                        float f = z ? dimensionPixelSize2 : 0.0f;
                        if (z) {
                            dimensionPixelSize2 = 0.0f;
                        }
                        View view2 = audioBarChildFragment.f74161OooOooo;
                        if (view2 == null) {
                            kotlin.jvm.internal.OooOOO0.OooOOOO("rootView");
                            throw null;
                        }
                        if ((view2.getVisibility() == 0) == z) {
                            View view3 = audioBarChildFragment.f74161OooOooo;
                            if (view3 == null) {
                                kotlin.jvm.internal.OooOOO0.OooOOOO("rootView");
                                throw null;
                            }
                            view3.setTranslationX(dimensionPixelSize2);
                            View view4 = audioBarChildFragment.f74161OooOooo;
                            if (view4 == null) {
                                kotlin.jvm.internal.OooOOO0.OooOOOO("rootView");
                                throw null;
                            }
                            view4.requestLayout();
                        } else {
                            ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(f, dimensionPixelSize2);
                            kotlin.jvm.internal.OooOOO0.OooO0Oo(valueAnimatorOfFloat);
                            valueAnimatorOfFloat.addListener(new C29146OooOOoo(audioBarChildFragment));
                            valueAnimatorOfFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: o0OoOOo.OooO00o
                                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                                public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                                    float fFloatValue = ((Float) C28971o0OO00O.OooO00o(valueAnimator, TranslateLanguage.ITALIAN, "null cannot be cast to non-null type kotlin.Float")).floatValue();
                                    View view5 = audioBarChildFragment.f74161OooOooo;
                                    if (view5 != null) {
                                        view5.setTranslationX(fFloatValue);
                                    } else {
                                        kotlin.jvm.internal.OooOOO0.OooOOOO("rootView");
                                        throw null;
                                    }
                                }
                            });
                            C29128OooO0O0 c29128OooO0O0 = new C29128OooO0O0(audioBarChildFragment, z);
                            valueAnimatorOfFloat.addListener(new C29144OooOOo(c29128OooO0O0));
                            valueAnimatorOfFloat.addListener(new C29145OooOOo0(c29128OooO0O0));
                            valueAnimatorOfFloat.setDuration(300L);
                            valueAnimatorOfFloat.setInterpolator(new DecelerateInterpolator());
                            valueAnimatorOfFloat.start();
                        }
                    } else {
                        View view5 = audioBarChildFragment.f74161OooOooo;
                        if (view5 == null) {
                            kotlin.jvm.internal.OooOOO0.OooOOOO("rootView");
                            throw null;
                        }
                        int height = view5.getHeight();
                        if (!z) {
                            dimensionPixelSize = 0;
                        } else if (audioBarChildFragment.f74178OoooOOO) {
                            View view6 = audioBarChildFragment.f74161OooOooo;
                            if (view6 == null) {
                                kotlin.jvm.internal.OooOOO0.OooOOOO("rootView");
                                throw null;
                            }
                            dimensionPixelSize = view6.getResources().getDimensionPixelSize(R.dimen.h_audio_bar_height_with_shadow_immersive);
                        } else {
                            View view7 = audioBarChildFragment.f74161OooOooo;
                            if (view7 == null) {
                                kotlin.jvm.internal.OooOOO0.OooOOOO("rootView");
                                throw null;
                            }
                            dimensionPixelSize = view7.getResources().getDimensionPixelSize(R.dimen.h_audio_bar_height);
                        }
                        View view8 = audioBarChildFragment.f74161OooOooo;
                        if (view8 == null) {
                            kotlin.jvm.internal.OooOOO0.OooOOOO("rootView");
                            throw null;
                        }
                        if ((view8.getVisibility() == 0) == z) {
                            View view9 = audioBarChildFragment.f74161OooOooo;
                            if (view9 == null) {
                                kotlin.jvm.internal.OooOOO0.OooOOOO("rootView");
                                throw null;
                            }
                            view9.getLayoutParams().height = dimensionPixelSize;
                            View view10 = audioBarChildFragment.f74161OooOooo;
                            if (view10 == null) {
                                kotlin.jvm.internal.OooOOO0.OooOOOO("rootView");
                                throw null;
                            }
                            view10.requestLayout();
                        } else {
                            ValueAnimator valueAnimatorOfInt = ValueAnimator.ofInt(height, dimensionPixelSize);
                            kotlin.jvm.internal.OooOOO0.OooO0Oo(valueAnimatorOfInt);
                            valueAnimatorOfInt.addListener(new C29143OooOOOo(audioBarChildFragment));
                            valueAnimatorOfInt.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: o0OoOOo.OooO0OO
                                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                                public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                                    int iIntValue = ((Integer) C28971o0OO00O.OooO00o(valueAnimator, TranslateLanguage.ITALIAN, "null cannot be cast to non-null type kotlin.Int")).intValue();
                                    AudioBarChildFragment audioBarChildFragment2 = audioBarChildFragment;
                                    View view11 = audioBarChildFragment2.f74161OooOooo;
                                    if (view11 == null) {
                                        kotlin.jvm.internal.OooOOO0.OooOOOO("rootView");
                                        throw null;
                                    }
                                    view11.getLayoutParams().height = iIntValue;
                                    View view12 = audioBarChildFragment2.f74161OooOooo;
                                    if (view12 != null) {
                                        view12.requestLayout();
                                    } else {
                                        kotlin.jvm.internal.OooOOO0.OooOOOO("rootView");
                                        throw null;
                                    }
                                }
                            });
                            valueAnimatorOfInt.addListener(new OooOOOO(audioBarChildFragment, z));
                            valueAnimatorOfInt.addListener(new OooOOO(audioBarChildFragment, z));
                            valueAnimatorOfInt.setDuration(300L);
                            valueAnimatorOfInt.setInterpolator(new DecelerateInterpolator());
                            valueAnimatorOfInt.start();
                        }
                    }
                }
                return C32460OooOooO.f116667OooO00o;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C29139OooO0oo(AudioBarChildFragment audioBarChildFragment, Continuation<? super C29139OooO0oo> continuation) {
            super(2, continuation);
            this.f103291OooOo = audioBarChildFragment;
        }

        @Override // oO00ooo.AbstractC32477OooO00o
        public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
            return new C29139OooO0oo(this.f103291OooOo, continuation);
        }

        @Override // oO0O000o.InterfaceC32508OooOOOo
        public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super C32460OooOooO> continuation) {
            return ((C29139OooO0oo) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
        }

        @Override // oO00ooo.AbstractC32477OooO00o
        public final Object invokeSuspend(Object obj) {
            EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
            int i = this.f103292OooOo0o;
            if (i == 0) {
                C32446OooOOOo.OooO0O0(obj);
                AudioBarChildFragment audioBarChildFragment = this.f103291OooOo;
                com.orion.notein.p607ui.noteeditor.OooO0OO oooO0OOOooOoOO = audioBarChildFragment.OooOoOO();
                OooO00o oooO00o = new OooO00o(audioBarChildFragment, null);
                this.f103292OooOo0o = 1;
                if (C25252OooO0Oo.OooO0oO(oooO0OOOooOoOO.f73424o00oO0O, oooO00o, this) == enumC32485OooO00o) {
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
    public C29135OooOO0(AudioBarChildFragment audioBarChildFragment, Continuation<? super C29135OooOO0> continuation) {
        super(2, continuation);
        this.f103263OooOo = audioBarChildFragment;
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
        C29135OooOO0 c29135OooOO0 = new C29135OooOO0(this.f103263OooOo, continuation);
        c29135OooOO0.f103264OooOo0o = obj;
        return c29135OooOO0;
    }

    @Override // oO0O000o.InterfaceC32508OooOOOo
    public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super C32460OooOooO> continuation) {
        return ((C29135OooOO0) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Object invokeSuspend(Object obj) {
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        C32446OooOOOo.OooO0O0(obj);
        InterfaceC33636Oooo00o interfaceC33636Oooo00o = (InterfaceC33636Oooo00o) this.f103264OooOo0o;
        AudioBarChildFragment audioBarChildFragment = this.f103263OooOo;
        C33609OooO0oo.OooO0OO(interfaceC33636Oooo00o, null, null, new OooO00o(audioBarChildFragment, null), 3);
        C33609OooO0oo.OooO0OO(interfaceC33636Oooo00o, null, null, new OooO0O0(audioBarChildFragment, null), 3);
        C33609OooO0oo.OooO0OO(interfaceC33636Oooo00o, null, null, new OooO0OO(audioBarChildFragment, null), 3);
        C33609OooO0oo.OooO0OO(interfaceC33636Oooo00o, null, null, new C29136OooO0Oo(audioBarChildFragment, null), 3);
        C33609OooO0oo.OooO0OO(interfaceC33636Oooo00o, null, null, new C29137OooO0o0(audioBarChildFragment, null), 3);
        C33609OooO0oo.OooO0OO(interfaceC33636Oooo00o, null, null, new OooO0o(audioBarChildFragment, null), 3);
        C33609OooO0oo.OooO0OO(interfaceC33636Oooo00o, null, null, new C29138OooO0oO(audioBarChildFragment, null), 3);
        C33609OooO0oo.OooO0OO(interfaceC33636Oooo00o, null, null, new C29139OooO0oo(audioBarChildFragment, null), 3);
        return C32460OooOooO.f116667OooO00o;
    }
}
