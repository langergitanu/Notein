package o0o0O00;

import Oooo0oO.C21030OooOO0o;
import android.content.Context;
import androidx.core.os.BundleKt;
import com.aspose.words.StyleIdentifier;
import com.orion.notein.global.R;
import com.orion.notein.p607ui.p609vo.NoteVO;
import kotlin.coroutines.Continuation;
import o0Oo00o.C28026OooO0OO;
import o0Oo0o00.C28201OooooO0;
import oO00ooO.C32443OooOOO;
import oO00ooO.C32446OooOOOo;
import oO00ooO.C32460OooOooO;
import oO00ooo.AbstractC32476OooO;
import oO00ooo.InterfaceC32482OooO0o0;
import oO00ooo0.EnumC32485OooO00o;
import oO0O000o.InterfaceC32508OooOOOo;
import oO0o0OO.InterfaceC33636Oooo00o;

/* JADX INFO: renamed from: o0o0O00.OooOo0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
@InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.notelist.initializer.DefaultNoteMoreActionListener$onRecoverHistory$1$1", m80623f = "DefaultNoteMoreActionListener.kt", m80624l = {StyleIdentifier.PLAIN_TABLE_1}, m80625m = "invokeSuspend")
public final class C30208OooOo0 extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super C32460OooOooO>, Object> {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final /* synthetic */ C30201OooOOO0 f107588OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public int f107589OooOo0o;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public final /* synthetic */ NoteVO f107590OooOoO0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C30208OooOo0(NoteVO noteVO, Continuation continuation, C30201OooOOO0 c30201OooOOO0) {
        super(2, continuation);
        this.f107588OooOo = c30201OooOOO0;
        this.f107590OooOoO0 = noteVO;
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
        return new C30208OooOo0(this.f107590OooOoO0, continuation, this.f107588OooOo);
    }

    @Override // oO0O000o.InterfaceC32508OooOOOo
    public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super C32460OooOooO> continuation) {
        return ((C30208OooOo0) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Object invokeSuspend(Object obj) {
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i = this.f107589OooOo0o;
        C30201OooOOO0 c30201OooOOO0 = this.f107588OooOo;
        if (i == 0) {
            C32446OooOOOo.OooO0O0(obj);
            C28201OooooO0 c28201OooooO0 = c30201OooOOO0.f107550OooO0Oo;
            this.f107589OooOo0o = 1;
            obj = c28201OooooO0.OooO(this);
            if (obj == enumC32485OooO00o) {
                return enumC32485OooO00o;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C32446OooOOOo.OooO0O0(obj);
        }
        if (((Boolean) obj).booleanValue()) {
            C28026OooO0OO.OooO00o(C21030OooOO0o.OooO0OO(c30201OooOOO0.f107547OooO00o), R.id.recoverNoteFromCloudDialogFragment, BundleKt.bundleOf(new C32443OooOOO("note_id", this.f107590OooOoO0.getId())));
        } else {
            Context contextRequireContext = c30201OooOOO0.f107547OooO00o.requireContext();
            kotlin.jvm.internal.OooOOO0.OooO0o(contextRequireContext, "requireContext(...)");
            C28026OooO0OO.OooO00o(C21030OooOO0o.OooO0OO(c30201OooOOO0.f107547OooO00o), o0oo000O.OooOO0O.OooO00o(contextRequireContext) ? R.id.cloudSyncLoginDialogFragment : R.id.cloudSyncLoginContainerFragment, null);
        }
        return C32460OooOooO.f116667OooO00o;
    }
}
