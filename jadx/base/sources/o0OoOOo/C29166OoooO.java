package o0OoOOo;

import android.media.MediaRecorder;
import android.os.Bundle;
import com.aspose.words.StyleIdentifier;
import com.orion.notein.p607ui.noteeditor.audio.AbstractC23415OooO0o0;
import kotlin.coroutines.Continuation;
import oO00ooO.C32446OooOOOo;
import oO00ooO.C32460OooOooO;
import oO00ooo.AbstractC32476OooO;
import oO00ooo.InterfaceC32482OooO0o0;
import oO00ooo0.EnumC32485OooO00o;
import oO0O000o.InterfaceC32507OooOO0o;
import oO0O000o.InterfaceC32508OooOOOo;
import oO0o0OO.InterfaceC33636Oooo00o;
import oO0o0Oo.C33781o00o0O;
import oOO00oo.C34406OooO00o;

/* JADX INFO: renamed from: o0OoOOo.OoooO, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
@InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.noteeditor.audio.NoteAudioViewModel$startMediaRecorderProbe$1", m80623f = "NoteAudioViewModel.kt", m80624l = {StyleIdentifier.LIST_TABLE_1_LIGHT_ACCENT_5, 386}, m80625m = "invokeSuspend")
public final class C29166OoooO extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super C32460OooOooO>, Object> {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public /* synthetic */ Object f103409OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public int f103410OooOo0o;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public final /* synthetic */ com.orion.notein.p607ui.noteeditor.audio.OooO0o f103411OooOoO0;

    /* JADX INFO: renamed from: o0OoOOo.OoooO$OooO00o */
    @InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.noteeditor.audio.NoteAudioViewModel$startMediaRecorderProbe$1$1", m80623f = "NoteAudioViewModel.kt", m80624l = {}, m80625m = "invokeSuspend")
    public static final class OooO00o extends AbstractC32476OooO implements InterfaceC32507OooOO0o<Continuation<? super C32460OooOooO>, Object> {

        /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
        public final /* synthetic */ MediaRecorder f103412OooOo;

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public final /* synthetic */ com.orion.notein.p607ui.noteeditor.audio.OooO0o f103413OooOo0o;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO00o(com.orion.notein.p607ui.noteeditor.audio.OooO0o oooO0o, MediaRecorder mediaRecorder, Continuation<? super OooO00o> continuation) {
            super(1, continuation);
            this.f103413OooOo0o = oooO0o;
            this.f103412OooOo = mediaRecorder;
        }

        @Override // oO00ooo.AbstractC32477OooO00o
        public final Continuation<C32460OooOooO> create(Continuation<?> continuation) {
            return new OooO00o(this.f103413OooOo0o, this.f103412OooOo, continuation);
        }

        @Override // oO0O000o.InterfaceC32507OooOO0o
        public final Object invoke(Continuation<? super C32460OooOooO> continuation) {
            return ((OooO00o) create(continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
        }

        @Override // oO00ooo.AbstractC32477OooO00o
        public final Object invokeSuspend(Object obj) {
            Long l;
            EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
            C32446OooOOOo.OooO0O0(obj);
            com.orion.notein.p607ui.noteeditor.audio.OooO0o oooO0o = this.f103413OooOo0o;
            AbstractC23415OooO0o0 abstractC23415OooO0o0 = (AbstractC23415OooO0o0) oooO0o.f74229OooOO0o.getValue();
            if (!(abstractC23415OooO0o0 instanceof AbstractC23415OooO0o0.C23417OooO0oO)) {
                C34406OooO00o.C20358OooO00o c20358OooO00o = C34406OooO00o.f123390OooO00o;
                c20358OooO00o.OooOOO0("MediaToolbarViewModel");
                c20358OooO00o.OooO0OO("startMediaRecorderProbe. currentState is not Recording", new Object[0]);
                return C32460OooOooO.f116667OooO00o;
            }
            Bundle bundle = abstractC23415OooO0o0.f74391OooO0O0;
            if (bundle != null) {
                l = new Long(System.currentTimeMillis() - bundle.getLong("start_time"));
            } else {
                l = null;
            }
            if (l == null || l.longValue() < 0) {
                C34406OooO00o.C20358OooO00o c20358OooO00o2 = C34406OooO00o.f123390OooO00o;
                c20358OooO00o2.OooOOO0("MediaToolbarViewModel");
                c20358OooO00o2.OooOO0("insertAudioSyncRecord. audioFileId is null", new Object[0]);
                return C32460OooOooO.f116667OooO00o;
            }
            Integer num = new Integer((int) l.longValue());
            C33781o00o0O c33781o00o0O = oooO0o.f74240OooOo0O;
            c33781o00o0O.getClass();
            c33781o00o0O.OooOO0(null, num);
            float fPow = (float) Math.pow(this.f103412OooOo.getMaxAmplitude() / 32767.0f, 0.25f);
            if (fPow < 0.1f) {
                fPow = 0.1f;
            }
            if (fPow > 1.0f) {
                fPow = 1.0f;
            }
            Float f = new Float(fPow);
            C33781o00o0O c33781o00o0O2 = oooO0o.f74241OooOo0o;
            c33781o00o0O2.getClass();
            c33781o00o0O2.OooOO0(null, f);
            return C32460OooOooO.f116667OooO00o;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C29166OoooO(com.orion.notein.p607ui.noteeditor.audio.OooO0o oooO0o, Continuation<? super C29166OoooO> continuation) {
        super(2, continuation);
        this.f103411OooOoO0 = oooO0o;
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
        C29166OoooO c29166OoooO = new C29166OoooO(this.f103411OooOoO0, continuation);
        c29166OoooO.f103409OooOo = obj;
        return c29166OoooO;
    }

    @Override // oO0O000o.InterfaceC32508OooOOOo
    public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super C32460OooOooO> continuation) {
        return ((C29166OoooO) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x0060, code lost:
    
        if (oO0o0OO.C33644OoooO0.OooO00o(32, r7) != r0) goto L7;
     */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0044  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:21:0x0060 -> B:7:0x0013). Please report as a decompilation issue!!! */
    @Override // oO00ooo.AbstractC32477OooO00o
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        InterfaceC33636Oooo00o interfaceC33636Oooo00o;
        InterfaceC33636Oooo00o interfaceC33636Oooo00o2;
        MediaRecorder mediaRecorder;
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i = this.f103410OooOo0o;
        if (i == 0) {
            C32446OooOOOo.OooO0O0(obj);
            interfaceC33636Oooo00o = (InterfaceC33636Oooo00o) this.f103409OooOo;
            com.orion.notein.p607ui.noteeditor.audio.OooO0o oooO0o = this.f103411OooOoO0;
            mediaRecorder = oooO0o.f74228OooOO0O;
            if (mediaRecorder != null) {
            }
        } else {
            if (i != 1) {
                if (i != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                interfaceC33636Oooo00o2 = (InterfaceC33636Oooo00o) this.f103409OooOo;
                C32446OooOOOo.OooO0O0(obj);
                interfaceC33636Oooo00o = interfaceC33636Oooo00o2;
                com.orion.notein.p607ui.noteeditor.audio.OooO0o oooO0o2 = this.f103411OooOoO0;
                mediaRecorder = oooO0o2.f74228OooOO0O;
                if (mediaRecorder != null) {
                    C34406OooO00o.C20358OooO00o c20358OooO00o = C34406OooO00o.f123390OooO00o;
                    c20358OooO00o.OooOOO0("MediaToolbarViewModel");
                    c20358OooO00o.OooO0OO("startMediaRecorderProbe. mediaRecorder is null", new Object[0]);
                    return C32460OooOooO.f116667OooO00o;
                }
                OooO00o oooO00o = new OooO00o(oooO0o2, mediaRecorder, null);
                this.f103409OooOo = interfaceC33636Oooo00o;
                this.f103410OooOo0o = 1;
                if (com.orion.notein.p607ui.noteeditor.audio.OooO0o.OooOO0o(oooO0o2, oooO00o, this) != enumC32485OooO00o) {
                    interfaceC33636Oooo00o2 = interfaceC33636Oooo00o;
                    this.f103409OooOo = interfaceC33636Oooo00o2;
                    this.f103410OooOo0o = 2;
                }
                return enumC32485OooO00o;
            }
            interfaceC33636Oooo00o2 = (InterfaceC33636Oooo00o) this.f103409OooOo;
            C32446OooOOOo.OooO0O0(obj);
            this.f103409OooOo = interfaceC33636Oooo00o2;
            this.f103410OooOo0o = 2;
        }
    }
}
