package o0OoOOo;

import kotlin.coroutines.Continuation;
import oO00ooO.C32446OooOOOo;
import oO00ooO.C32460OooOooO;
import oO00ooo.AbstractC32476OooO;
import oO00ooo.InterfaceC32482OooO0o0;
import oO00ooo0.EnumC32485OooO00o;
import oO0O000o.InterfaceC32508OooOOOo;
import oO0o0OO.C33609OooO0oo;
import oO0o0OO.InterfaceC33636Oooo00o;
import oOO00oo.C34406OooO00o;

/* JADX INFO: renamed from: o0OoOOo.OoooO00, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
@InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.noteeditor.audio.NoteAudioViewModel$startMediaPlayerPlayProbe$job$1", m80623f = "NoteAudioViewModel.kt", m80624l = {1581, 1587}, m80625m = "invokeSuspend")
public final class C29168OoooO00 extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super C32460OooOooO>, Object> {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public /* synthetic */ Object f103422OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public int f103423OooOo0o;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public final /* synthetic */ com.orion.notein.p607ui.noteeditor.audio.OooO0o f103424OooOoO0;

    /* JADX INFO: renamed from: o0OoOOo.OoooO00$OooO00o */
    @InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.noteeditor.audio.NoteAudioViewModel$startMediaPlayerPlayProbe$job$1$1", m80623f = "NoteAudioViewModel.kt", m80624l = {1584}, m80625m = "invokeSuspend")
    public static final class OooO00o extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super C32460OooOooO>, Object> {

        /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
        public final /* synthetic */ com.orion.notein.p607ui.noteeditor.audio.OooO0o f103425OooOo;

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public int f103426OooOo0o;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO00o(com.orion.notein.p607ui.noteeditor.audio.OooO0o oooO0o, Continuation<? super OooO00o> continuation) {
            super(2, continuation);
            this.f103425OooOo = oooO0o;
        }

        @Override // oO00ooo.AbstractC32477OooO00o
        public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
            return new OooO00o(this.f103425OooOo, continuation);
        }

        @Override // oO0O000o.InterfaceC32508OooOOOo
        public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super C32460OooOooO> continuation) {
            return ((OooO00o) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
        }

        @Override // oO00ooo.AbstractC32477OooO00o
        public final Object invokeSuspend(Object obj) {
            EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
            int i = this.f103426OooOo0o;
            if (i != 0) {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C32446OooOOOo.OooO0O0(obj);
                return C32460OooOooO.f116667OooO00o;
            }
            C32446OooOOOo.OooO0O0(obj);
            this.f103426OooOo0o = 1;
            com.orion.notein.p607ui.noteeditor.audio.OooO0o.OooO0oO(this.f103425OooOo, this);
            return enumC32485OooO00o;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C29168OoooO00(com.orion.notein.p607ui.noteeditor.audio.OooO0o oooO0o, Continuation<? super C29168OoooO00> continuation) {
        super(2, continuation);
        this.f103424OooOoO0 = oooO0o;
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
        C29168OoooO00 c29168OoooO00 = new C29168OoooO00(this.f103424OooOoO0, continuation);
        c29168OoooO00.f103422OooOo = obj;
        return c29168OoooO00;
    }

    @Override // oO0O000o.InterfaceC32508OooOOOo
    public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super C32460OooOooO> continuation) {
        return ((C29168OoooO00) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x0037, code lost:
    
        if (com.orion.notein.p607ui.noteeditor.audio.OooO0o.OooO0o(r5) == r0) goto L21;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0, types: [int] */
    /* JADX WARN: Type inference failed for: r1v1, types: [oO0o0OO.Oooo00o] */
    /* JADX WARN: Type inference failed for: r1v4 */
    /* JADX WARN: Type inference failed for: r1v7 */
    /* JADX WARN: Type inference failed for: r1v8 */
    @Override // oO00ooo.AbstractC32477OooO00o
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        ?? r1 = this.f103423OooOo0o;
        com.orion.notein.p607ui.noteeditor.audio.OooO0o oooO0o = this.f103424OooOoO0;
        try {
            if (r1 == 0) {
                C32446OooOOOo.OooO0O0(obj);
                InterfaceC33636Oooo00o interfaceC33636Oooo00o = (InterfaceC33636Oooo00o) this.f103422OooOo;
                this.f103422OooOo = interfaceC33636Oooo00o;
                this.f103423OooOo0o = 1;
                r1 = interfaceC33636Oooo00o;
            } else {
                if (r1 != 1) {
                    if (r1 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    C32446OooOOOo.OooO0O0(obj);
                    return C32460OooOooO.f116667OooO00o;
                }
                InterfaceC33636Oooo00o interfaceC33636Oooo00o2 = (InterfaceC33636Oooo00o) this.f103422OooOo;
                C32446OooOOOo.OooO0O0(obj);
                r1 = interfaceC33636Oooo00o2;
            }
        } catch (Exception e) {
            C34406OooO00o.C20358OooO00o c20358OooO00o = C34406OooO00o.f123390OooO00o;
            c20358OooO00o.OooOOO0("MediaToolbarViewModel");
            c20358OooO00o.OooO0Oo(e, "Error while running player waveform detection", new Object[0]);
            C33609OooO0oo.OooO0OO(r1, null, null, new OooO00o(oooO0o, null), 3);
        }
        this.f103422OooOo = null;
        this.f103423OooOo0o = 2;
        com.orion.notein.p607ui.noteeditor.audio.OooO0o.OooO0o0(oooO0o, this);
        EnumC32485OooO00o enumC32485OooO00o2 = EnumC32485OooO00o.f116726OooOo0o;
        return enumC32485OooO00o;
    }
}
